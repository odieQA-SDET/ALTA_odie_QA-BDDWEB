package starter.Pages;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPages extends PageObject{

    @FindBy(xpath ="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement iconBookStores;
    public void clickBooksStores() {
//        waitForCondition().until(ExpectedCondition.elementToBeClickable(iconBooksStore));
        iconBookStores.click();
    }

    @FindBy(id = "login")
    WebElement iconLogin;
    public void clickiconLogin() {
        iconLogin.click();
    }

    @FindBy(id = "newUser")
    WebElement buttonNewUser;
    public void clickButtonNewUser() {
        buttonNewUser.click();
    }

    @FindBy(id = "firstname")
    WebElement inputFirstName;

    @FindBy(id = "lastname")
    WebElement inputLastName;

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPassword;

    public void InputAccountRegister() {
        inputFirstName.sendKeys("ODIE");
        inputLastName.sendKeys("AltaQA");
        inputUserName.sendKeys("ODIEwebAUTOtesting");
        inputPassword.sendKeys("@K33Pfigthing");
    }
    //*[@id="recaptcha-anchor"]/div[1]
    @FindBy(xpath = "*[@id=\"recaptcha-anchor\"]/div[4]")
    WebElement IconCaptcha;
    public void clickIconCaptcha() {
        IconCaptcha.click();
//        wait(1000);
    }

    @FindBy(id = "register")
    WebElement IconRegister;
    public void clickIconRegis() {
        IconRegister.click();
    }
}
