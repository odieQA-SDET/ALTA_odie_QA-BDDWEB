package starter.Test.TestRegister;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.RegisterSteps;

public class RegisterSuccess {
    @Steps
    RegisterSteps register;

    @Given("I was on the Login in this page")
    public void I_was_on_the_Login_in_page() {
        register.openHomePages();
        register.openLoginPages();
    }


    @When("I clicked {string} in page Registration")
    public void i_clicked_button_in_page(String string) {
        register.ClickNewUser();
    }

    @When("I filled First Name, Last Name, UserName, and Password")
    public void i_filled_my_username_and_Password() {
        register.InputRegisterAccount();
    }

    @When("I clicked {string} robot")
    public void i_clicked_button_(String string) {
//        regis.ClickCaptcha();
    }

    @When("I clicked {string} in page Register")
    public void i_clicked_button_page_register(String string) {
//        regis.ClickRegister();
    }
    @Then("I have made a New Account")
    public void I_have_made_a_New_Account() {
    }
}
