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


    @Then("I verify {string} button is enabled")
    public void iVerifyButtonIsEnabled(String btnName) {
        boolean enabled = false;

        switch (btnName.toLowerCase()){
            case "Edit": enabled = impl.getPage().editEmpDataBtn.isEnabled();
                break;
            case "Delete": enabled = impl.getPage().deleteEmpDataBtn.isEnabled();
                break;
        }

        Assert.assertTrue(enabled);
    }
}
