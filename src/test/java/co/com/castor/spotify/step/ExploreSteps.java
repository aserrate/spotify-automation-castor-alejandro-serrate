package co.com.castor.spotify.step;

import co.com.castor.spotify.pages.ExplorePageSpotify;
import co.com.castor.spotify.pages.interactions.ListSelector;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class ExploreSteps {

    @Page
    ExplorePageSpotify explorePageSpotify;

    @Step("select gender by name")
    public void selectGenderByName(String categoryName){
        explorePageSpotify.titleOfList.waitUntilVisible();
        ListSelector.clickItemByText(explorePageSpotify.genresList,categoryName);
    }

    @Step("Ensure that public list are visible")
    public void ensurePublicListAreVisible(){
        explorePageSpotify.titlePublicPlayList.waitUntilVisible();
        that(explorePageSpotify.seeAllLinks.size()).isGreaterThan(1);
        that(explorePageSpotify.cover.size()).isGreaterThan(1);
        that(explorePageSpotify.seeAllLinks.get(0).getText()).isNotEmpty();
        that(explorePageSpotify.cover.get(0).getText()).isNotEmpty();
    }

    //HAY QUE ORGANIZAR LAS VARIABLES DE ENTORNO PARA EL RESTO DEL LOGIN
}
