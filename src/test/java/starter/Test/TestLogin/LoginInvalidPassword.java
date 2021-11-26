package starter.Test.TestLogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginInvalidPassword {
    @Steps
    LoginSteps loginSteps;

    @When("I filled my Username correctly and invalid Password")
    public void i_filled_my_Username_correctly_and_invalid_Password() {
        loginSteps.inputInvalidPassword();
    }

    @When("I clicked {string} button in page system")
    public void i_clicked_button_in_page_system(String string) {
        loginSteps.ClickLogin();
    }

}
