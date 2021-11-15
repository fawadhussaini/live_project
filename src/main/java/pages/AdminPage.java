package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverUtils;

import java.util.List;

public class AdminPage {

    public AdminPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    //this xpath locates all roles and departments and their count
    @FindBy(xpath = "//div[@class='RoleClass']//td//span")
    public List<WebElement> countsForRolesAndDepartments;

    //this xpath locates delete btns for roles and departments
    @FindBy(xpath = "//div[@class='RoleClass']//button")
    public List<WebElement> deleteBtns;

    //this xpath locates the element that contains warning message for trying to delete roles and departments
    @FindBy(id = "submit-btn")
    public WebElement deleteBtnsWarning;

    //this xpath locates edit button at employee ID 0009 First Name Sopisa
    @FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
    public WebElement editEmpDataBtn;

    @FindBy(xpath = "//tbody[1]/tr[1]/td[3]")
    public WebElement roleSdet0009;

    public void waitForElementClickability(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
}

