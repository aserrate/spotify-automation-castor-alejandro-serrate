package co.com.castor.spotify.step;

import co.com.castor.spotify.pages.DashboardPageSpotify;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class DashboardSteps {

    @Page
    DashboardPageSpotify dashboardPageSpotify;

    @Step("Ensure that login was succesfull")
    public void ensureLoginSuccesfull(){
        that(dashboardPageSpotify.userButton.isVisible()).isTrue();
        that(dashboardPageSpotify.libraryButton.isClickable()).isTrue();
    }

    @Step("Select Explore Spotify")
    public void selectExploreButtonSpotify(){
        dashboardPageSpotify.exploreButton.waitUntilClickable().click();
    }

}
