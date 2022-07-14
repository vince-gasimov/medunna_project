package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_020_User_Management {
    //initialize the page
    public US_020_User_Management() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
