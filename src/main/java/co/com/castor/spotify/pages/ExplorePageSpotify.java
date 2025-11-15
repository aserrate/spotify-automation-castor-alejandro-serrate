package co.com.castor.spotify.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ExplorePageSpotify extends PageObject {

    @FindBy(css = "h2[data-encore-id='listRowTitle']")
    public WebElementFacade titleOfList;

    @FindBy(css = "div[role='listitem']")
    public List<WebElementFacade> genresList;

    @FindBy(css = "a[data-testid='see-all-link']")
    public List<WebElementFacade> seeAllLinks;

    @FindBy(css = "div[data-encore-id='card']")
    public List<WebElementFacade> cover;

    @FindBy(css = "div[data-transition='sponsoredPlaylistHeaderText']")
    public WebElementFacade titlePublicPlayList;
}
