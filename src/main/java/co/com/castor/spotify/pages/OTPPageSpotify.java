package co.com.castor.spotify.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

    public class OTPPageSpotify extends PageObject {

    @FindBy(css = "button[data-encore-id='buttonTertiary']")
    public WebElementFacade buttonStartSessionWithPassword;
}
