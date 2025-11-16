package co.com.castor.spotify.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class DashboardPageSpotify extends PageObject {

    @FindBy(css = "button[data-testid='user-widget-link']")
    public WebElementFacade userButton;

    @FindBy(css = "button[aria-label='Comprimir Tu biblioteca']")
    public WebElementFacade libraryButton;

    @FindBy(css = "button[data-testid='browse-button']")
    public WebElementFacade exploreButton;

    @FindBy(css = "div[data-testid='herocard-click-handler']")
    public WebElementFacade relevantArtist;

}
