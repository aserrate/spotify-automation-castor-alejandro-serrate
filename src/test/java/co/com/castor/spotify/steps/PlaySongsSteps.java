package co.com.castor.spotify.steps;

import co.com.castor.spotify.pages.DashboardPageSpotify;
import co.com.castor.spotify.pages.PlayMusicPageSpotify;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static co.com.castor.spotify.constans.GeneralMessages.WILLPAUSE;
import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class PlaySongsSteps {

    @Page
    DashboardPageSpotify dashboardPageSpotify;
    PlayMusicPageSpotify playMusicPageSpotify;


    @Step("Select more relevant result")
    public void selectMoreRelevantResult(){
        dashboardPageSpotify.relevantArtist.waitUntilClickable().click();
    }

    @Step("Select principal PlayButton")
    public void selectPrincipalPlayButton(){
        playMusicPageSpotify.buttonPlaySongs.waitUntilClickable().click();
    }

    @Step("Ensure Song Started")
    public void ensureSongStarted(){
        that((playMusicPageSpotify.buttonPlayPauseDashboard.getAriaLabel()).trim()).isEqualTo(WILLPAUSE);
    }
}
