package co.com.castor.spotify.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PlayMusicPageSpotify extends PageObject {

    @FindBy(xpath = "//div[@data-testid='action-bar-row']//button[@data-testid='play-button']")
    public WebElementFacade buttonPlaySongs;

    @FindBy(css = "button[data-testid='control-button-playpause']")
    public WebElementFacade buttonPlayPauseDashboard;
}
