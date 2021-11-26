package starter.Test.TestLogOut;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LogoutSteps;

public class LogoutSuccess {
    @Steps
    LogoutSteps logOut;
    @When("I clicked {string} button in page Books Store")
    public void i_clicked_button_in_page_Books_Store(String string) {
        logOut.ClickLogOutButton();
    }

    @Then("I was taken to the dashboard Login page")
    public void i_was_taken_to_the_dashboard_Login_page() {
    }

}
