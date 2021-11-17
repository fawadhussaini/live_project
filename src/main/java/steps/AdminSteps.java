package steps;

import impl.AdminImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import utils.CucumberLogUtils;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class AdminSteps {
    AdminImpl impl = new AdminImpl();



    @Then("I should see a number for each role and department")
    public void iShouldSeeANumberForEachRoleAndDepartment() throws InterruptedException {
        Assert.assertTrue(impl.countForRolesAndDepartments());
    }

    @Then("I should not be able to delete Role or Department if it is assigned to an employee")
    public void iShouldNotBeAbleToDeleteRoleOrDepartmentIfItIsAssignedToAnEmployee() throws InterruptedException {
        Assert.assertFalse(impl.deleteRoleOrDepartment());
    }

    @When("I input {string} as {string}")
    public void i_input_as(String inputFieldName, String value) {
        SeleniumUtils.highlightElement(impl.getPage().Id);
        SeleniumUtils.highlightElement(impl.getPage().FirstName);
        SeleniumUtils.highlightElement(impl.getPage().LastName);
        SeleniumUtils.highlightElement(impl.getPage().SelectRole);
        SeleniumUtils.highlightElement(impl.getPage().SelectDepartment);
        impl.fillInputField(inputFieldName, value);
    }

    @Then("I click Enter button")
    public void iClickEnterButton() throws InterruptedException {
        SeleniumUtils.highlightElement(impl.getPage().Enter);
        impl.getPage().Enter.click();
        Thread.sleep(2000);
    }

    @Then("Employee is populate in the data table")
    public void employeeIsPopulateInTheDataTable() {
        Assert.assertEquals("success", impl.verifyEachUserFields());
        SeleniumUtils.moveElement(impl.getPage().row);
        SeleniumUtils.highlightElement(impl.getPage().row);
        CucumberLogUtils.logPass("success",true);
    }
}
