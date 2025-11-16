package co.com.castor.spotify.definitions;

import co.com.castor.spotify.steps.PlaySongsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class PlayBackDefinitions {

    @Steps
    PlaySongsSteps playSongsSteps;

    @And("start to play the artists songs")
    public void clickOnRelevantResult() {
        playSongsSteps.selectMoreRelevantResult();
        playSongsSteps.selectPrincipalPlayButton();
    }

    @Then("the song should start playing")
    public void songShouldStartPlaying() {
        playSongsSteps.ensureSongStarted();
    }
}
