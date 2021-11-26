package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginInvalidUsername {
    @Steps
    LoginSteps loginSteps;

    @When("I filled my Username and Password incorrectly")
    public void i_filled_my_Username_and_Password_incorrectly() {
        loginSteps.inputInvalidUsername();
    }

    @When("I clicked {string} button in login page")
    public void i_clicked_button_in_login_page(String string) {
        loginSteps.ClickLogin();
    }


}
