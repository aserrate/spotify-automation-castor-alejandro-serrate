package co.com.castor.spotify.step;

import co.com.castor.spotify.pages.HomePageSpotify;
import lombok.Getter;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static net.serenitybdd.screenplay.ensure.Ensure.that;


@Getter
public class HomePageSpotifySteps {
    private String lastSearchedKeyword;

    @Page
    HomePageSpotify homePageSpotify;

    @Step("open Spotify Home Page")
    public void openSpotifyPage(){
        homePageSpotify.open();
    }

    @Step("Search for keyValue to search")
    public void searchForColdplay(String keyValue){
        homePageSpotify.searchInput.waitUntilVisible();
        homePageSpotify.searchInput.clear();
        homePageSpotify.searchInput.type(keyValue);
        lastSearchedKeyword = keyValue;
    }

    @Step("Ensure the results")
    public void resultsOfSearch(String keyValue){
        homePageSpotify.tracksResultSection.waitUntilVisible();
        that(homePageSpotify.songPresentations.getTextContent().contains(keyValue));
    }
}

