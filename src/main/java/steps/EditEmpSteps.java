package steps;

import impl.EditEmpImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CucumberLogUtils;
import utils.WebDriverUtils;

import java.util.Map;

public class EditEmpSteps {

    EditEmpImpl impl = new EditEmpImpl();
    WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);


    @When("I input following details in Employee data table")
    public void i_input_following_details_in_employee_data_table(Map<String, String> fields) {
        for (String key : fields.keySet()) {
            impl.fillInputField(key, fields.get(key));
        }

    }

    @Then("I should be able to see Edit button")
    public void iShouldBeAbleToSeeEditButton() {
        Assert.assertTrue(impl.getPage().editBtn.isDisplayed());

    }

    @And("I should be able to see Delete button")
    public void iShouldBeAbleToSeeDeleteButton() {
        Assert.assertTrue(impl.getPage().deleteBtn.isDisplayed());
    }

    @When("I click Edit button")
    public void iClickEditButton() {
        impl.getPage().editBtn.click();
    }

    @And("I should be able to modify first name and click update button")
    public void iShouldBeAbleToModifyFirstNameAndClickUpdateButton() {
        impl.clearWebFill(impl.getPage().firstnameField);
        impl.getPage().firstnameField.sendKeys("Sophia");
        impl.getPage().updateBtn.click();
    }


    @Then("I should be able to see new first name")
    public void iShouldBeAbleToSeeNewFirstName() {
        CucumberLogUtils.logPass("Edit is worked", true);
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().empFirstNameTable));
        Assert.assertTrue(impl.getPage().empFirstNameTable.isDisplayed());
    }

    @When("I click Delete button")
    public void iClickDeleteButton() {
        impl.getPage().deleteBtn.click();
        impl.getPage().confirmDeleteBtn.click();
    }

    @Then("I should not see employee data that I deleted")
    public void iShouldNotSeeEmployeeDataThatIDeleted() {

        impl.getPage().filterEnterKeyword.sendKeys("Sophia");
        impl.getPage().searchBtn.click();
        Assert.assertTrue(impl.getPage().noResultToDisplay.isDisplayed());
        CucumberLogUtils.logPass("Delete button is worked", true);
    }
}
