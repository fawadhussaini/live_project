package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.WebDriverUtils;

public class HomeSteps {

    HomeImpl impl = new HomeImpl();
    @Given("User navigate to homepage")
    public void user_navigate_to_homepage() {
      impl.navigateToHomepage();
    }
    @Then("User should see title is {string}")
    public void user_should_see_title_is(String expectedTitle) {
        Assert.assertEquals(expectedTitle , WebDriverUtils.getDriver().getTitle());

    }



}
