package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;
import utilities.Date;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class US_014_MyInpatientsUpdateStepDefs {

    DoctorPage doctorPage = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("doctor finds the first UNAPPROVED inpatient and clicks edit button")
    public void doctorFindsTheFirstUNAPPROVEDInpatientAndClicksEditButton() throws InterruptedException {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);

        try {
            for (int i = 1; i < 20; i++) {
                String xpath = "//tbody//tr[" + i + "]//td[4]";
                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
                String xpathEdit = "//tbody//tr[" + i + "]//td[10]";
                Thread.sleep(2000);
                if (status.getText().equals("UNAPPROVED")) {
                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
                    Thread.sleep(2000);
                    break;
                }
            }
        } catch (Exception e){

            System.out.println("There is not any Inpatient with UNAPPROVED Status  ");
        }
    }

    @When("doctor deletes description box and writes a new description for the inpatient")
    public void doctorDeletesDescriptionBoxAndWritesANewDescriptionForTheInpatient() {
       // doctorPage.descriptionBox.sendKeys(" ");
        doctorPage.descriptionBox.sendKeys("new description");
    }

    @Then("doctor clicks save button")
    public void doctorClicksSaveButton() throws InterruptedException {
       Driver.clickWithJS(doctorPage.save);
       Thread.sleep(2000);
    }

    @Then("doctor verifies Unapproved inpatients' description can be changed")
    public void doctorVerifiesUnapprovedInpatientsDescriptionCanBeChanged() {
        Assert.assertTrue(doctorPage.updatedMessage.isDisplayed());
    }

    @And("doctor closes the browser")
    public void doctorClosesTheBrowser() throws InterruptedException {
        Driver.closeDriver();
        Thread.sleep(2000);
    }

    @Given("doctor finds the first STAYING inpatient and clicks edit button")
    public void doctorFindsTheFirstSTAYINGInpatientAndClicksEditButton() throws InterruptedException {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);

        try {
            for (int i = 1; i < 20; i++) {

                String xpath = "//tbody//tr[" + i + "]//td[4]";
                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
                String xpathEdit = "//tbody//tr[" + i + "]//td[10]";
                Thread.sleep(2000);
                if (status.getText().equals("STAYING")) {
                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
                    Thread.sleep(2000);
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("There is not any Inpatient with STAYING Status  ");
        }
    }

    @Then("doctor verifies Staying inpatients' description can be changed")
    public void doctorVerifiesStayingInpatientsDescriptionCanBeChanged() {
        Assert.assertTrue(doctorPage.updatedMessage.isDisplayed());
    }

    @Given("doctor finds the first DISCHARGED inpatient and clicks edit button")
    public void doctorFindsTheFirstDISCHARGEDInpatientAndClicksEditButton() throws InterruptedException {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);

        try {
            for (int i = 1; i < 20; i++) {

                String xpath = "//tbody//tr[" + i + "]//td[4]";
                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
                String xpathEdit = "//tbody//tr[" + i + "]//td[10]";
                Thread.sleep(2000);

                if (status.getText().equals("DISCHARGED")) {
                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
                    Thread.sleep(2000);
                    break;
                }
            }
        } catch (Exception e){

            System.out.println("There is not any Inpatient with DISCHARGED Status  ");
        }
    }

    @Then("doctor verifies Discharged inpatients' description can not be changed")
    public void doctorVerifiesDischargedInpatientsDescriptionCanNotBeChanged() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Given("doctor finds the first CANCELLED inpatient and clicks edit button")
    public void doctorFindsTheFirstCancelledInpatientAndClicksEditButton() throws InterruptedException {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);

        try {
            for (int i = 1; i < 20; i++) {

                String xpath = "//tbody//tr[" + i + "]//td[4]";
                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
                String xpathEdit = "//tbody//tr[" + i + "]//td[10]";
                Thread.sleep(2000);
                if (status.getText().equals("CANCELLED")) {
                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
                    Thread.sleep(2000);
                    break;
                }
            }
        } catch (Exception e){

            System.out.println("There is not any Inpatient with CANCELLED Status  ");
        }

    }

    @Then("doctor verifies Cancelled inpatients' description can not be changed")
    public void doctorVerifiesCancelledInpatientsDescriptionCanNotBeChanged() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor changes the created date box to an earlier date")
    public void doctorChangesTheCreatedDateBoxToAnEarlierDate() {
        doctorPage.createdDateEdit.sendKeys(Date.passedDate());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @Then("doctor verifies Staying inpatients' created date can not be changed to an earlier date")
    public void doctorVerifiesStayingInpatientsCreatedDateCanNotBeChangedToAnEarlierDate() {
        Assert.assertFalse(doctorPage.updatedMessage.isDisplayed());
    }

    @Then("doctor verifies Unapproved inpatients' created date can not be changed to an earlier date")
    public void doctorVerifiesUnapprovedInpatientsCreatedDateCanNotBeChangedToAnEarlierDate() throws IOException {
           Assert.assertFalse(doctorPage.updatedMessage.isDisplayed());
           ReusableMethods.getScreenshot("US014_TC012_");
        }

    @Then("doctor verifies Discharged inpatients' created date can not be changed to an earlier date")
    public void doctorVerifiesDischargedInpatientsCreatedDateCanNotBeChangedToAnEarlierDate() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Cancelled inpatients' created date can not be changed to an earlier date")
    public void doctorVerifiesCancelledInpatientsCreatedDateCanNotBeChangedToAnEarlierDate() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor changes the created date box to a future date")
    public void doctorChangesTheCreatedDateBoxToAFutureDate() {
        doctorPage.createdDateEdit.sendKeys(Date.futureDate());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @Then("doctor verifies Unapproved inpatients' created date can not be changed to a future date")
    public void doctorVerifiesUnapprovedInpatientsCreatedDateCanNotBeChangedToAFutureDate() {
        Assert.assertFalse(doctorPage.updatedMessage.isDisplayed());
    }

    @Then("doctor verifies Staying inpatients' created date can not be changed to a future date")
    public void doctorVerifiesStayingInpatientsCreatedDateCanNotBeChangedToAFutureDate() {
        Assert.assertFalse(doctorPage.updatedMessage.isDisplayed());
    }

    @Then("doctor verifies Discharged inpatients' created date can not be changed to a future date")
    public void doctorVerifiesDischargedInpatientsCreatedDateCanNotBeChangedToAFutureDate() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Cancelled inpatients' created date can not be changed to a future date")
    public void doctorVerifiesCancelledInpatientsCreatedDateCanNotBeChangedToAFutureDate() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @When("doctor chooses an available room for the inpatient")
    public void doctorChoosesAnAvailableRoomForTheInpatient() {
        Select select=new Select(doctorPage.roomEdit);
        List<WebElement> allOptions=select.getOptions();
        for(WebElement eachOption : allOptions){
            if(!eachOption.getText().contains("UNAVAILABLE")){
                eachOption.click();
                break;
            }
        }
        actions.sendKeys(Keys.ARROW_DOWN);
    }

    @Then("doctor verifies Unapproved inpatients' room can not be updated even if it is available")
    public void doctorVerifiesUnapprovedInpatientsRoomCanNotBeUpdatedEvenIfItIsAvailable() {
        Assert.assertFalse(doctorPage.updatedMessage.isDisplayed());

    }
//     WE COULD NOT CREATE ANY ASSERTION FOR THIS
//   @Then("doctor verifies Staying inpatients' room can be updated when it is available")
//   public void doctorVerifiesStayingInpatientsRoomCanBeUpdatedWhenItIsAvailable() {
//   }

    @Then("doctor verifies Discharged inpatients' room can not be updated even if it is available")
    public void doctorVerifiesDischargedInpatientsRoomCanNotBeUpdatedEvenIfItIsAvailable() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Cancelled inpatients' room can not be updated even if it is available")
    public void doctorVerifiesCancelledInpatientsRoomCanNotBeUpdatedEvenIfItIsAvailable() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @When("doctor chooses an unavailable room for the inpatient")
    public void doctorChoosesAnUnavailableRoomForTheInpatient() {
        Select select=new Select(doctorPage.roomEdit);
        List<WebElement> allOptions=select.getOptions();
        for(WebElement eachOption : allOptions){
            if(eachOption.getText().contains("UNAVAILABLE")){
                eachOption.click();
                break;
            }
        }
        actions.sendKeys(Keys.ARROW_DOWN);
    }

    @Then("doctor verifies Unapproved inpatients' room can not be updated with an unavailable room")
    public void doctorVerifiesUnapprovedInpatientsRoomCanNotBeUpdatedWithAnUnavailableRoom() {
        Assert.assertFalse(doctorPage.updatedMessage.isDisplayed());
    }

    @Then("doctor verifies Staying inpatients' room can not be updated with an unavailable room")
    public void doctorVerifiesStayingInpatientsRoomCanNotBeUpdatedWithAnUnavailableRoom() {
        Assert.assertFalse(doctorPage.updatedMessage.isDisplayed());
    }

    @Then("doctor verifies Discharged inpatients' room can not be updated with an unavailable room")
    public void doctorVerifiesDischargedInpatientsRoomCanNotBeUpdatedWithAnUnavailableRoom() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Cancelled inpatients' room can not be updated with an unavailable room")
    public void doctorVerifiesCancelledInpatientsRoomCanNotBeUpdatedWithAnUnavailableRoom() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @When("doctor changes the status of the inpatient as Discharged")
    public void doctorChangesTheStatusOfTheInpatientAsDischarged() {
        Select select=new Select(doctorPage.statusEdit);
        select.selectByVisibleText("DISCHARGED");
    }

    @Then("doctor verifies Unapproved inpatients' status can not be changed to Discharged")
    public void doctorVerifiesUnapprovedInpatientsStatusCanNotBeChangedToDischarged() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @When("doctor changes the status of the inpatient as Cancelled")
    public void doctorChangesTheStatusOfTheInpatientAsCancelled() {
        Select select=new Select(doctorPage.statusEdit);
        select.selectByVisibleText("CANCELLED");
    }

    @Then("doctor verifies Unapproved inpatients' status can be changed to Cancelled")
    public void doctorVerifiesUnapprovedInpatientsStatusCanBeChangedToCancelled() {
        Assert.assertTrue(doctorPage.updatedMessage.isDisplayed());
    }

    @When("doctor changes the status of the Unapproved inpatient as Staying without choosing any room")
    public void doctorChangesTheStatusOfTheUnapprovedInpatientAsStayingWithoutChoosingAnyRoom() {
        Select select=new Select(doctorPage.statusEdit);
        select.selectByVisibleText("STAYING");
    }

    @Then("doctor verifies Unapproved inpatients' status can not be changed to Staying without choosing any room")
    public void doctorVerifiesUnapprovedInpatientsStatusCanNotBeChangedToStayingWithoutChoosingAnyRoom() {
        Assert.assertTrue(doctorPage.suchARoomNotFoundMessage.isDisplayed());
    }

    @When("doctor changes the status of the inpatient as Staying")
    public void doctorChangesTheStatusOfTheInpatientAsStaying() {
        Select select = new Select(doctorPage.statusEdit);
        select.selectByVisibleText("STAYING");
    }

    @Then("doctor verifies Unapproved inpatients' status can be changed to Staying with choosing an available room")
    public void doctorVerifiesUnapprovedInpatientsStatusCanNotBeChangedToStayingWithChoosingAnAvailableRoom() {
        Assert.assertTrue(doctorPage.updatedMessage.isDisplayed());
    }

    @Then("doctor verifies Unapproved inpatients' status can not be changed to Staying with choosing an unavailable room")
    public void doctorVerifiesUnapprovedInpatientsStatusCanNotBeChangedToStayingWithChoosingAnUnavailableRoom() {
        Assert.assertTrue(doctorPage.theRoomAlreadyReservedMessage.isDisplayed());
    }

    @When("doctor changes the status of the inpatient as Unapproved")
    public void doctorChangesTheStatusOfTheInpatientAsUnapproved() {
        Select select = new Select(doctorPage.statusEdit);
        select.selectByVisibleText("UNAPPROVED");
    }

    @Then("doctor verifies Staying inpatients' status can not be changed to Unapproved")
    public void doctorVerifiesStayingInpatientsStatusCanNotBeChangedToUnapproved() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Staying inpatients' status can not be changed to Cancelled")
    public void doctorVerifiesStayingInpatientsStatusCanNotBeChangedToCancelled() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Discharged inpatients' status can not be changed to Cancelled")
    public void doctorVerifiesDischargedInpatientsStatusCanNotBeChangedToCancelled() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Discharged inpatients' status can not be changed to Unapproved")
    public void doctorVerifiesDischargedInpatientsStatusCanNotBeChangedToUnapproved() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Discharged inpatients' status can not be changed to Staying")
    public void doctorVerifiesDischargedInpatientsStatusCanNotBeChangedToStaying() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Cancelled inpatients' status can not be changed to Unapproved")
    public void doctorVerifiesCancelledInpatientsStatusCanNotBeChangedToUnapproved() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Cancelled inpatients' status can not be changed to Staying")
    public void doctorVerifiesCancelledInpatientsStatusCanNotBeChangedToStaying() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Cancelled inpatients' status can not be changed to Discharged")
    public void doctorVerifiesCancelledInpatientsStatusCanNotBeChangedToDischarged() {
        Assert.assertTrue(doctorPage.canNotBeUpdatedMessage.isDisplayed());
    }

    @Then("doctor verifies Staying inpatients' status can be changed to Discharged")
    public void doctorVerifiesStayingInpatientsStatusCanBeChangedToDischarged() {
        Assert.assertTrue(doctorPage.updatedMessage.isDisplayed());
    }


}

//    @Given("doctor finds the patients status {string} and clicks edit button")
//    public void doctorFindsThePatientsStatusAndClicksEditButton(String sta) {
//
//        try {
//            for (int i = 1; i < 20; i++) {
//
//                String xpath = "//tbody//tr[" + i + "]//td[4]";
//                WebElement status = Driver.getDriver().findElement(By.xpath(xpath));
//                Thread.sleep(2000);
//                String xpathEdit = "//tbody//tr[" + i + "]//td[10]";
//                if (status.getText().equals(sta)) {
//                    Driver.getDriver().findElement(By.xpath(xpathEdit)).click();
//                    Thread.sleep(2000);
//                    break;
//                }
//
//
//            }
//        } catch (Exception e){
//
//
//            System.out.println("There is not any inpatient with this status "+sta);
//        }
























