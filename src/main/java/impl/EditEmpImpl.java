package impl;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.EditEmpPage;
import utils.SeleniumUtils;

public class EditEmpImpl {

    EditEmpPage page;

    public EditEmpPage getPage() {
        if (page == null)
            page = new EditEmpPage();
        return page;

    }
    // this method for input new emp info to emp data table
    public void fillInputField(String inputFieldName, String value){
        switch (inputFieldName){
            case "ID": getPage().id.sendKeys(value);
                break;
            case "First Name": getPage().firstName.sendKeys(value);
                break;
            case "Last Name": getPage().lastName.sendKeys(value);
                break;
            case "Role":
                SeleniumUtils.selectByVisibleText(getPage().role, value);
                break;
            case "Department":
                SeleniumUtils.selectByVisibleText(getPage().department, value);
                break;
            default:
                System.out.println("Field name was not found...");
        }

    }

    public void clearWebFill(WebElement element) {
        while (!element.getAttribute("value").equals("")) {
            element.sendKeys(Keys.BACK_SPACE);
        }
    }

}
