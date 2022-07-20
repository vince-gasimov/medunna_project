package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSUtils {

    //This method will takes two parameter: WebElement, and WebDriver
    //When you pass the element, JS will click on that element
    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }
    //to get the page title with JS -->> not common
    public static String getTitleByJS() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        String title = jsexecutor.executeScript("return document.title;").toString();
        return title;
    }
    //Scrolling all the way down
    public static void scrollDownByJS() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    //    Scroll al the way up of a page
    public static void scrollAllUpByJS(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }
    //Scroll into view with JS. THIS IS VERY USEFULL
    public static void scrollIntoViewJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public static void changeColor(String color, WebElement element) {
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) Driver.getDriver());
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Flashing teh background color
    public static void flash(WebElement element) {
        String bgColor = element.getCssValue("backgroundcolor");
        for (int i = 0; i < 5; i++) {
            changeColor("rgb(0,200,0", element);
            changeColor(bgColor, element);
        }
    }
    //this will generate an alert when  -->> not common
    public static void generateAlert(String message) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) Driver.getDriver());
        javascriptExecutor.executeScript("alert('" + message + "')");
        Thread.sleep(3000);
    }
    /*
     * executes the given JavaScript command on given web element
     */ //This is more dynamic but not common, here we need to pass the Javascript command.
    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command, element);
    }
    /*
     * executes the given JavaScript command on given web element
     */
    public static void executeJScommand(String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command);
    }
    //    Set the value of an input using js executor. Params: WebElement element, String text
//    This method changes the value attribute of an element.
//    It changes the input text
    public static void setValueByJS(WebElement element, String text){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','"+text+"')",element);
    }
    //    get the value of an input. param: idOfElement
    public static void getValueByJS(String idOfElement){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        String value=js.executeScript("return document.getElementById('"+idOfElement+"').value").toString();
        System.out.println(value);
//        How you get get the value of an input box?
//        We can js executor.
//        How?
//        I can get the element using js executor, and get teh value of the element.
//        For example, I can get the element by id, and use value attribute to get the value of in an input
//        I have to do this, cause getText in this case does not return teh text in an input
    }
    public static void addBorderWithJS(WebElement element, String borderStyle){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].style.border='"+borderStyle+"'",element);
    }
}
