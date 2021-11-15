package steps;

import impl.AdminImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CucumberLogUtils;
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

    @When("I click on edit employee data button")
    public void iClickOnEditEmployeeDataButton() {
       Assert.assertTrue("Edit button is enabled", impl.isEnabled());

    }

    @And("I should be able to change employee role from {string}")
    public void iShouldBeAbleToChangeEmployeeRoleFrom(String text) {

    }

    @Then("I should seeing new employee role {string}")
    public void iShouldSeeingNewEmployeeRole(String text) {
        String actualText = impl.getText(text);
        Assert.assertNotEquals(text, actualText);
    }


    @When("I click on delete employee data button")
    public void iClickOnDeleteEmployeeDataButton() {
        
    }

    @Then("I should not see the employee data that I deleted")
    public void iShouldNotSeeTheEmployeeDataThatIDeleted() {

    }


    @Given("the following employee data")
    public void theFollowingEmployeeData() {
    }
}
