package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorHomePage {

    @FindBy(partialLinkText = "PAGES")
    public WebElement myPages;

    @FindBy(partialLinkText = "Inpatients")
    public WebElement myInpatients;


}
