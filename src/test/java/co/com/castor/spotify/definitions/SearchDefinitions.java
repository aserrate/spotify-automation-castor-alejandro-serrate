package co.com.castor.spotify.definitions;

import co.com.castor.spotify.step.HomePageSpotifySteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SearchDefinitions {
    @Steps
    HomePageSpotifySteps homePageSpotifySteps;

    @Given("I am on the Spotify Web home page")
    public void iAmOnTheSpotifyPage(){
        homePageSpotifySteps.openSpotifyPage();
    }

    @When("I search for {string}")
    public void iSearchKeyValue(String keyToFind){
        homePageSpotifySteps.searchForColdplay(keyToFind);
    }

    @Then("the search results are related to the key word")
    public void thenResultsAreRelated(){
        homePageSpotifySteps.resultsOfSearch(homePageSpotifySteps.getLastSearchedKeyword());
    }
}
