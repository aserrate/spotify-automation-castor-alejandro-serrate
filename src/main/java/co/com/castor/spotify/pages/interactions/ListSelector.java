package co.com.castor.spotify.pages.interactions;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ListSelector {

    public static void clickItemByText(List<WebElementFacade> list, String targetText) {
        for (WebElementFacade item : list) {
            String text = item.getText().trim();
            if (text.equalsIgnoreCase(targetText)) {
                item.waitUntilClickable().click();
                return;
            }
        }
        throw new IllegalArgumentException("Item not found in list: " + targetText);
    }
}
