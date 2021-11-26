package starter.Steps;

import starter.Pages.LoginPages;

public class LoginSteps {

  LoginPages loginPages;
  public void openHomePage() {
      loginPages.open();
  }

  public void openLoginPage() {
      loginPages.clickButtonLogin();
    }

    public void inputLoginInvalid() {
      loginPages.inputLoginInvalid();
    }
    public void inputInvalidUsername() {
    loginPages.inputInvalidUsername();
    }
    public void inputInvalidPassword() {
      loginPages.inputInvalidPassword();
    }


    public void inputLoginEmpty() {
      loginPages.inputLoginEmpty();
    }
    public void inputEmptyPassword() {
      loginPages.inputEmptyPassword();
    }
    public void inputEmptyUsername() {
      loginPages.inputEmptyUsername();
    }


    public void inputLoginSuccess() {
      loginPages.inputLoginSuccess();
    }


  public void ClickLogin() {
      loginPages.clickButtonLogin();
  }
}
