package co.com.castor.spotify.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://open.spotify.com/intl-es")
public class HomePageSpotify extends PageObject {

    @FindBy(xpath = "//input[@role='combobox' and @type='search']")
    public WebElementFacade searchInput;

    @FindBy(css = "section[data-testid='search-tracks-result']")
    public WebElementFacade tracksResultSection;

    @FindBy(css = "section[data-testid='component-shelf']")
    public WebElementFacade songPresentations;

    @FindBy(css = "button[data-testid='login-button']")
    public WebElementFacade loginButton;
}
