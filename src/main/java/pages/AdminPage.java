package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

<<<<<<< HEAD
    @FindBy(css = ".container .table")
    public WebElement employeeTable;

    @FindBy(name = "id")
    public WebElement empId;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "role")
    public WebElement empRole;

    @FindBy(name = "department")
    public WebElement department;



=======
    @FindBy(xpath = "//input[@name='id']")
    public WebElement Id;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement LastName;

    @FindBy(xpath = "//select[@name='role']")
    public WebElement SelectRole;

    @FindBy(xpath = "//select[@name='department']")
    public WebElement SelectDepartment;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement Enter;

    @FindBy(xpath = "//tbody//tr")
    public WebElement userTableRows;
>>>>>>> f294fad8988e97251d0c7b65d36e67e0a28e4aef
}