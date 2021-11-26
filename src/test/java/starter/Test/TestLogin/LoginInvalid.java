package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginInvalid {
    @Steps
    LoginSteps loginSteps;

    @When("I filled the invalid username and Password")
    public void i_filled_the_invalid_username_and_Password() {
        loginSteps.inputLoginInvalid();
    }

    @When("I clicked {string} button web")
    public void i_clicked_button_web(String string) {
        loginSteps.ClickLogin();
    }

    @Then("Invalid username or password! Alert")
    public void invalid_username_or_password_Alert() {
    }
}
