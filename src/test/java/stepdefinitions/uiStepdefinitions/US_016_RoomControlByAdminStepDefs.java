package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminRoomPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyPagesAppointmentPage;
import pojos.US_016_Rooms;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import static pages.AdminRoomPage.clickElementByJS;
import static pages.AdminRoomPage.selectDropdownItem;
import static utilities.US_016_TXTWriter.saveUIRegistrantData;

public class US_016_RoomControlByAdminStepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AdminRoomPage adminRoomPage = new AdminRoomPage();
    MyPagesAppointmentPage myPagesAppointmentPage = new MyPagesAppointmentPage();
    Actions actions = new Actions(Driver.getDriver());
//    SoftAssertions softAssert = new SoftAssertions();
    int roomNumber, price;
    String roomClass, roomStatus;
    US_016_Rooms us016Rooms = new US_016_Rooms();

    @Then("user navigates the sign in page with adminUsername and adminPassword")
    public void user_navigates_the_sign_in_page_with_admin_username_and_admin_password() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForPageToLoad(7);
        myPagesAppointmentPage.firstSignIn.click();
        myPagesAppointmentPage.signIn.click();
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("us_016_ui_adminUserName"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("us_016_ui_adminPassword"));

    }
    @When("admin clicks on Room button")
    public void admin_clicks_on_room_button() {
        ReusableMethods.waitFor(2);
        selectDropdownItem("Room");

    }
    @Then("admin clicks on Create a new Room button")
    public void admin_clicks_on_create_a_new_room_button() {
        ReusableMethods.waitFor(5);
        //clickElementByJS(adminRoomPage.createANewRoom);
        adminRoomPage.createANewRoom.click();

    }
    @And("admin enters the room number as {string}")
    public void adminEntersTheRoomNumberAs(String roomNum) {
        try {ReusableMethods.waitFor(2);
            adminRoomPage.roomNumber.sendKeys(roomNum);
            roomNumber= Integer.parseInt(roomNum);
            us016Rooms.setRoomNumber(roomNumber);
        }catch (Exception e) {
            System.out.println("Room number is not entered");
        }
    }


    @Then("admin selects the room type as {string}")
    public void admin_selects_the_room_type_as(String roomType) {
        ReusableMethods.waitFor(3);
        Select select = new Select(adminRoomPage.roomType);
        select.selectByVisibleText(roomType);
        roomClass= roomType;
        us016Rooms.setRoomType(roomType);
    }
    @Then("admin selects the room status as {string}")
    public void admin_selects_the_room_status_as(String roomStat) {
        ReusableMethods.waitFor(2);
        if (roomStat.equalsIgnoreCase("Full")) {
            adminRoomPage.roomStatusCheckbox.click();
            us016Rooms.setStatus(true);
        } else if (roomStat.equalsIgnoreCase("Available")){
            us016Rooms.setStatus(false);
        }
        roomStatus = roomStat;
    }
    @And("admin enters the price as {string}")
    public void adminEntersThePriceAs(String roomPrice) {
        try {
            ReusableMethods.waitFor(2);
            adminRoomPage.roomPrice.sendKeys(roomPrice.toString());
            price = Integer.parseInt(roomPrice);
            us016Rooms.setPrice(price);
        } catch (Exception e) {
            System.out.println("Price is not entered");
        }

    }


    @And("admin enters the description with {string}")
    public void adminEntersTheDescriptionWith(String roomDescription) {
        ReusableMethods.waitFor(2);
        if (roomDescription.contains("+")){
            roomDescription = roomNumber + " - " + "This is a " + roomStatus + " " + roomClass + " room with " + price + " CAD .";
            adminRoomPage.roomDescription.sendKeys(roomDescription);}
        else{
            roomDescription = "" ;
            return;
        }
        us016Rooms.setDescription(roomDescription);
    }

    @Then("admin enters the created date from current system date and time")
    public void admin_enters_the_created_date_from_current_system_date_and_time() {
        ReusableMethods.waitFor(5);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        System.out.println(sdf.format(date));
        adminRoomPage.roomCreatedDate.sendKeys(sdf.format(date));
        actions.sendKeys(Keys.TAB);

        ReusableMethods.waitFor(1);
        SimpleDateFormat month = new SimpleDateFormat("mm");
        actions.sendKeys(LocalDate.now().format(DateTimeFormatter.ofPattern("MM"))).perform();
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("MM")));

        ReusableMethods.waitFor(1);
        SimpleDateFormat day = new SimpleDateFormat("dd");
        actions.sendKeys(day.format(date)).perform();
        ReusableMethods.waitFor(1);
        SimpleDateFormat hour = new SimpleDateFormat("hh");
        actions.sendKeys(hour.format(date)).perform();
        ReusableMethods.waitFor(1);
        SimpleDateFormat minute = new SimpleDateFormat("mm");
        actions.sendKeys(minute.format(date)).perform();
        SimpleDateFormat abbreviation = new SimpleDateFormat("a");
        actions.sendKeys(abbreviation.format(date)).perform();
        System.out.println(sdf.format(date)+"-"+month.format(date)+"-"+day.format(date)+"T"+hour.format(date)+":"+minute.format(date));

        us016Rooms.setCreatedDate(sdf.format(date)+"-"+month.format(date)+"-"+day.format(date)+"T"+hour.format(date)+":"+minute.format(date));
    }
    @Then("software saving the records")
    public void software_saving_the_records() {

        saveUIRegistrantData(us016Rooms);


    }
    @Then("admin saves the room")
    public void admin_saves_the_room() {
        ReusableMethods.waitFor(7);
        clickElementByJS(adminRoomPage.saveButton);
    }
    @Then("admin should see the message as {string}")
    public void admin_should_see_the_message_as(String infoMessage) {
        try {
            ReusableMethods.waitFor(2);
            String actual = adminRoomPage.savedSuccessfullyText.getText();
            System.out.println("Expected = " + infoMessage);
            System.out.println("Actual = " + actual);
            ReusableMethods.waitFor(1);
            Assert.assertTrue(actual.contains(infoMessage));

        } catch (Exception e) {
            ReusableMethods.waitFor(5);
            Assert.fail("Message is not displayed" + e);
            System.out.println("Message is not displayed");

        }

    }

}
