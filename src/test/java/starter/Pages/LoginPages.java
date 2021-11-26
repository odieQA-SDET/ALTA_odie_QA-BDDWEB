package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends PageObject {

    @FindBy(xpath ="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement iconBooksStore;
    public void clickIconBooksStore() {
//        waitForCondition().until(ExpectedCondition.elementToBeClickable(iconBooksStore));
        iconBooksStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;
    public void clickButtonLogin() {
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPass;

    @FindBy(id ="login")
    WebElement ButtonLogin;

    public void inputLoginInvalid() {
        inputUserName.sendKeys("ODIEwebAUTO");
        inputPass.sendKeys("K33Pfigthing");
    }
    public void inputInvalidUsername() {
        inputUserName.sendKeys("ODIEwebAUTO");
        inputPass.sendKeys("@K33Pfigthing");
    }
    public void inputInvalidPassword() {
        inputUserName.sendKeys("ODIEwebAUTOtesting");
        inputPass.sendKeys("K33Pfigthing");
    }

    public void inputLoginEmpty() {
        inputUserName.sendKeys("");
        inputPass.sendKeys("");
    }
    public void inputEmptyPassword() {
        inputUserName.sendKeys("ODIEwebAUTOtesting");
        inputPass.sendKeys("");
    }
    public void inputEmptyUsername() {
        inputUserName.sendKeys("");
        inputPass.sendKeys("@K33Pfigthing");
    }

    public void inputLoginSuccess() {
        inputUserName.sendKeys("ODIEwebAUTOtesting");
        inputPass.sendKeys("@K33Pfigthing");
    }


    public void clickLogin() {
        ButtonLogin.click();
    }
}
