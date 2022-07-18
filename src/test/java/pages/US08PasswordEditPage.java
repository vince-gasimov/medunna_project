package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US08PasswordEditPage {
    public US08PasswordEditPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signIn;
    @FindBy(xpath="//span[normalize-space()='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath="//h5[@class='modal-title']//span[contains(text(),'Sign in')]")
    public WebElement signInPage;
    @FindBy(xpath="//input[@id='username']")
    public WebElement userNameTextBox;
    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath="//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInPageSignInButton;
    @FindBy(xpath="//*[text()='SEDAT ARSLAN']")
    public WebElement loginPageAccountMenu;
    @FindBy(xpath="//span[normalize-space()='Password']")
    public WebElement loginPagePasswordButton;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/span[1]")
    public WebElement passwordPage;
    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrength1;
    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrength2;
    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordStrength3;
    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrength4;
    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement passwordStrength5;
    @FindBy(xpath="//input[@id='currentPassword']")
    public WebElement currentPassword;
    @FindBy(xpath="//input[@id='newPassword']")
    public WebElement newPassword;
    @FindBy(xpath="//input[@id='confirmPassword']")
    public WebElement confirmationPassword;
    @FindBy(xpath="//span[normalize-space()='Save']")
    public WebElement saveButton ;
    @FindBy(xpath="//*[contains (text(),'Password changed!')]")
    public WebElement successMessage ;
}