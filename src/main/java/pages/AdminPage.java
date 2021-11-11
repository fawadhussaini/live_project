package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class AdminPage {

    public AdminPage(){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

}
