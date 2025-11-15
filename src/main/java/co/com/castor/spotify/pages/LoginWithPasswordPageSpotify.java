package co.com.castor.spotify.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginWithPasswordPageSpotify extends PageObject {

    @FindBy(id = "username")
    public WebElementFacade usernameTextBox;

    @FindBy(id = "password")
    public WebElementFacade passwordTextBox;

    @FindBy(css = "div[data-encore-id='banner']")
    public WebElementFacade alertInvalidCredentials;
}
