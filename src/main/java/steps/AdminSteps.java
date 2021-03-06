package steps;

import impl.AdminImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminPage;
import utils.CucumberLogUtils;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class AdminSteps {
    AdminImpl impl = new AdminImpl();
    AdminPage page = new AdminPage();

    @Then("I should see a number for each role and department")
    public void iShouldSeeANumberForEachRoleAndDepartment() throws InterruptedException {
        Assert.assertTrue(impl.countForRolesAndDepartments());
        CucumberLogUtils.logPass("Each role and department has a number next to it", true);
    }

    @Then("I should not be able to delete Role or Department if it is assigned to an employee")
    public void iShouldNotBeAbleToDeleteRoleOrDepartmentIfItIsAssignedToAnEmployee() throws InterruptedException {
        Assert.assertFalse(impl.deleteRoleOrDepartment());

    }

    @And("If role or department was successfully deleted the test should fail")
    public void ifRoleOrDepartmentWasSuccessfullyDeletedTheTestShouldFail() {
        Assert.assertEquals(impl.getPage().deleteBtns.size(), impl.getPage().countsForRolesAndDepartments.size());
        CucumberLogUtils.logPass("No role or department, if it is assigned to an employee,  was deleted", true);
    }


    @Then("I should be able to see the New Employee Section")
    public void iShouldBeAbleToSeeTheNewEmployeeSection() {
        Assert.assertTrue("Employee Id is displayed", SeleniumUtils.isElementDisplayed(page.empId));
        Assert.assertTrue("Employee Id is displayed", SeleniumUtils.isElementDisplayed(page.firstName));
        Assert.assertTrue("Employee Id is displayed", SeleniumUtils.isElementDisplayed(page.lastName));
        Assert.assertTrue("Employee Id is displayed", SeleniumUtils.isElementDisplayed(page.empRole));
        Assert.assertTrue("Employee Id is displayed", SeleniumUtils.isElementDisplayed(page.department));
    }

    @And("I should be able to see the Employee Table")
    public void iShouldBeAbleToSeeTheEmployeeTable() {
        Assert.assertTrue(impl.empTableEx());
    }

    @When("I input {string} as {string}")
    public void i_input_as(String inputFieldName, String value) {
        impl.fillInputField(inputFieldName, value);
    }

    @Then("I click Enter button")
    public void iClickEnterButton() throws InterruptedException {
        impl.getPage().Enter.click();
        Thread.sleep(2000);
    }

    @Then("Employee is populate in the data table")
    public void employeeIsPopulateInTheDataTable() {
        Assert.assertEquals("success", impl.verifyEachUserFields());
    }



}
