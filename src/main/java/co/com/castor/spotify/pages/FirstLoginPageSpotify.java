package co.com.castor.spotify.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FirstLoginPageSpotify extends PageObject {

    @FindBy(css = "input[data-testid='login-username']")
    public WebElementFacade usernameInput;

    @FindBy(css = "button[data-testid='login-button']")
    public WebElementFacade loginButton;

    @FindBy(id = "username-error")
    public WebElementFacade usernameErrorMessage;
}
