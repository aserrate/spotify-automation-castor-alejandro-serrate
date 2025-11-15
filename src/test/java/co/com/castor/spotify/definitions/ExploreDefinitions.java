package co.com.castor.spotify.definitions;

import co.com.castor.spotify.step.DashboardSteps;
import co.com.castor.spotify.step.ExploreSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ExploreDefinitions {

    @Steps
    DashboardSteps dashboardSteps;

    @Steps
    ExploreSteps exploreSteps;

    @Given("I navigate to explore")
    public void iNavigateToExplore(){
        dashboardSteps.selectExploreButtonSpotify();
    }

    @When("I select gender of the list {string}")
    public void selectGenderOfList(String gender){
        exploreSteps.selectGenderByName(gender);
    }

    @Then("I should see public playlists")
    public void seePublicPlaylistSuchAs() {
        exploreSteps.ensurePublicListAreVisible();
    }
}
