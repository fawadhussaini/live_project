package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class UserPage {
    public UserPage(){

        PageFactory.initElements(WebDriverUtils.getDriver(), this);

    }

    @FindBy(xpath = "//thead/tr/th[1]")
    public WebElement idTable;

    @FindBy(xpath = "//thead/tr/th[2]")
    public WebElement firstnameTable;

    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement lastnameTable;

    @FindBy(xpath = "//thead/tr/th[4]")
    public WebElement roleTable;

    @FindBy(xpath = "//thead/tr/th[5]")
    public WebElement departmentTable;


}
