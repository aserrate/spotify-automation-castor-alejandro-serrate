package co.com.castor.spotify.hooks;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    @Before(order = 0)
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }
}
