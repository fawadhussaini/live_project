package pages;


import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class UserPage {
    public UserPage(){

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }


}
