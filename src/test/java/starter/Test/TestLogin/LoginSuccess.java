package starter.Test.TestLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginSuccess {
    @Steps
    LoginSteps loginSteps;
    @Given("I was on the Login page")
    public void i_was_on_the_Login_page() {

        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I filled my username and Password correctly")
    public void i_filled_my_username_and_Password_correctly() {

        loginSteps.inputLoginSuccess();
    }

    @When("I clicked {string} button")
    public void i_clicked_button(String string) {

        loginSteps.ClickLogin();
    }

    @Then("I was taken to the dashboard")
    public void i_was_taken_to_the_dashboard() {

    }

}
