package starter.Steps;

import starter.Pages.RegisterPages;

public class RegisterSteps {

    RegisterPages registerPages;
    public void openHomePages() {

        registerPages.open();
    }

    public void clickBookStoreIcon() {

        registerPages.clickBooksStores();
    }
    public void openLoginPages() {

        registerPages.clickiconLogin();
    }

    public void ClickNewUser() {

        registerPages.clickButtonNewUser();
    }

    public void InputRegisterAccount() {

        registerPages.InputAccountRegister();
    }

    public void ClickCaptcha() {

        registerPages.clickIconCaptcha();
    }

    public void ClickRegister() {

        registerPages.clickIconRegis();
    }

}
