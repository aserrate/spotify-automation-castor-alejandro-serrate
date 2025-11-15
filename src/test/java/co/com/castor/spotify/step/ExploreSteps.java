package co.com.castor.spotify.step;

import co.com.castor.spotify.pages.ExplorePageSpotify;
import co.com.castor.spotify.pages.interactions.ListSelector;
import lombok.Getter;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

@Getter
public class ExploreSteps {
    private String categoryList;

    @Page
    ExplorePageSpotify explorePageSpotify;

    @Step("select gender by name")
    public void selectGenderByName(String categoryName){
        explorePageSpotify.titleOfList.waitUntilVisible();
        ListSelector.clickItemByText(explorePageSpotify.genresList,categoryName);
        categoryList = categoryName;
    }

    @Step("Ensure that public list are visible")
    public void ensurePublicListAreVisible(String categoryList){
        explorePageSpotify.titlePublicPlayList.waitUntilVisible();
        that((explorePageSpotify.titlePublicPlayList.getText()).trim()).isEqualTo(categoryList);
        that(explorePageSpotify.seeAllLinks.size()).isGreaterThan(1);
        that(explorePageSpotify.cover.size()).isGreaterThan(1);
        that(explorePageSpotify.seeAllLinks.get(0).getText()).isNotEmpty();
        that(explorePageSpotify.cover.get(0).getText()).isNotEmpty();
    }
}
