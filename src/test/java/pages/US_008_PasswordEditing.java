package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_008_PasswordEditing {
    public US_008_PasswordEditing(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement login;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signin;
    @FindBy (xpath = "//*[@name='username']")
    public WebElement username;
    @FindBy (xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy (xpath = "(//*[text()='Sign in'])[3]")
    public WebElement SigninButton;
    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement login2;
    @FindBy (xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement password2;
    @FindBy (xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;
    @FindBy (xpath = "//input[@name='newPassword']")
    public WebElement newPassword;
    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrength1;
    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrength2;
    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordStrength3;
    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrength4;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;

}
