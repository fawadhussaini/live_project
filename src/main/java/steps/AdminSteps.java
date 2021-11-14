package steps;

import impl.AdminImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPage;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class AdminSteps {
    AdminImpl impl = new AdminImpl();
    AdminPage page = new AdminPage();

    @Then("I should see a number for each role and department")
    public void iShouldSeeANumberForEachRoleAndDepartment() throws InterruptedException {
        Assert.assertTrue(impl.countForRolesAndDepartments());
    }

    @Then("I should not be able to delete Role or Department if it is assigned to an employee")
    public void iShouldNotBeAbleToDeleteRoleOrDepartmentIfItIsAssignedToAnEmployee() throws InterruptedException {
        Assert.assertFalse(impl.deleteRoleOrDepartment());
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
}
