package co.com.castor.spotify.step;

import co.com.castor.spotify.pages.HomePageSpotify;
import co.com.castor.spotify.pages.FirstLoginPageSpotify;
import co.com.castor.spotify.pages.LoginWithPasswordPageSpotify;
import co.com.castor.spotify.pages.OTPPageSpotify;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static co.com.castor.spotify.constans.GeneralMessages.INVALID_CREDENTIALS;
import static co.com.castor.spotify.constans.GeneralMessages.INVALID_USERNAME_OR_EMAIL;
import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class LoginPageSteps {

    @Page
    HomePageSpotify homePageSpotify;
    FirstLoginPageSpotify firstLoginPageSpotify;
    OTPPageSpotify otpPageSpotify;
    LoginWithPasswordPageSpotify loginWithPasswordPageSpotify;

    @Step("Click on logIn button")
    public void enterToTheLoginPage() {
        homePageSpotify.loginButton.waitUntilVisible().click();
    }

    @Step("Enter email to Start Login")
    public void enterEmailToLogin(String emailAccount){
        firstLoginPageSpotify.usernameInput.waitUntilVisible();
        firstLoginPageSpotify.usernameInput.clear();
        firstLoginPageSpotify.usernameInput.type(emailAccount);
        firstLoginPageSpotify.loginButton.click();
    }

    @Step("Ensure the invalid email")
    public void resultsOfInvalidEmail(){
        that(firstLoginPageSpotify.usernameErrorMessage.isVisible()).isTrue();
        that(firstLoginPageSpotify.usernameErrorMessage.getTextContent().equals(INVALID_USERNAME_OR_EMAIL));
    }

    @Step("ContinueProcessWithPassword")
    public void continueLoginWithPassword(){
        otpPageSpotify.buttonStartSessionWithPassword.waitUntilClickable().click();
    }

    @Step("EnterPasswordLogin")
    public void enterPasswordLogin(String currentlyPassword){
        loginWithPasswordPageSpotify.usernameTextBox.waitUntilVisible();
        loginWithPasswordPageSpotify.passwordTextBox.clear();
        loginWithPasswordPageSpotify.passwordTextBox.type(currentlyPassword);
        firstLoginPageSpotify.loginButton.click();
    }

    @Step("Ensure credentials are invalid")
    public void resultsOfInvalidCredentials(){
        that(loginWithPasswordPageSpotify.alertInvalidCredentials.isVisible()).isTrue();
        that(loginWithPasswordPageSpotify.alertInvalidCredentials.getTextContent().equals(INVALID_CREDENTIALS));
    }
}
