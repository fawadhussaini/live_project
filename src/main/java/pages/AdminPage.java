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

    //this xpath locates Role:sdet from id 0009
    @FindBy(xpath = "//tbody[1]/tr[1]/td[3]")
    public WebElement roleSdet0009;

    //this xpath locates delete button at employee data ID 11 Pati Dz
    @FindBy(xpath = "//tbody/tr[47]/td[5]/button[2]")
    public WebElement deleteEmpDataBtn;

    //this xpath locates display option ALL
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/button[4]")
    public WebElement allDisplayBtn;

//    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/table/tbody/tr")
//    public List<WebElement> countForEmpDataTable;


    }


