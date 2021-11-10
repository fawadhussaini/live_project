package steps;

import impl.LoginImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

   LoginImpl impl = new LoginImpl();

    @Given("I navigate to Login page")
    public void i_navigate_to_login_page() {

        impl.navigateToLoginPage();

    }

    @Given("I enter username = user and password = user123 and click on Sign in button")
    public void i_enter_username_user_and_password_user123_and_click_on_sign_in_button() throws InterruptedException {
     impl.getPage().usernameInput.sendKeys("user");
     Thread.sleep(1000);
     impl.getPage().passwordInput.sendKeys("user123");
     Thread.sleep(1000);
     impl.getPage().SignInBtn.click();

    }

    @Then("I should see the WELCOME USER!")
    public void i_should_see_the_welcome_user() {

    }

}
