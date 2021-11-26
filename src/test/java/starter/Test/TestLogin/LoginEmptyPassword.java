package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginEmptyPassword {
    @Steps
    LoginSteps loginSteps;

    @When("I filled my username correctly and Empty Password")
    public void i_filled_my_username_correctly_and_Empty_Password() {
        loginSteps.inputEmptyPassword();
    }

    @When("I clicked {string} button the empty Password")
    public void i_clicked_button_the_empty_Password(String string) {
        loginSteps.ClickLogin();
    }

}
