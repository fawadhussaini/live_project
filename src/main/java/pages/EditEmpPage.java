package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class EditEmpPage {

    public EditEmpPage() {

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    // this xpath locates edit button at empl data table
    @FindBy(xpath = "//button[@class='btn btn-warning']")
    public WebElement editBtn;

    //this xpath locates delete button at emp data table
    @FindBy(xpath = "//tbody//tr//button[2]")
    public WebElement deleteBtn;

    //this xpath locates confirm button after click delete button
    @FindBy(xpath = "//button[@class='btn customColor ml-2 roleDelete']")
    public WebElement confirmDeleteBtn;

//    @FindBy(xpath = "//div[2]/table/tbody/tr/th")
    @FindBy(xpath = "//input[@name='id']")
    public WebElement id;

//    @FindBy(xpath = "//div[2]/table/tbody/tr/td[1]")
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

//    @FindBy(xpath = "//div[2]/table/tbody/tr/td[2]")
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

//    @FindBy(xpath = "//div[2]/table/tbody/tr/td[3]")
    @FindBy(xpath = "//select[@name='role']")
    public WebElement role;

//    @FindBy(xpath = "//div[2]/table/tbody/tr/td[4]")
    @FindBy(xpath = "//select[@name='department']")
    public WebElement department;

    @FindBy(xpath = "//input[@value='Sopisa']")
    public WebElement firstnameField;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    public WebElement updateBtn;

    //this xpath locates firstname at employee data table
    @FindBy(xpath = "//*[@id='root']/div[2]/table/tbody/tr/td[1]")
    public WebElement empFirstNameTable;

    @FindBy(xpath = "//input[@placeholder='Enter the keyword']")
    public WebElement filterEnterKeyword;

    @FindBy(xpath = "//button[@class='btn btn-success mb-2']")
    public WebElement searchBtn;

    @FindBy(xpath = "//h3[normalize-space()='No Results to Display']")
    public WebElement noResultToDisplay;
}
