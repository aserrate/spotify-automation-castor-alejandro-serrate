package co.com.castor.spotify.step;

import co.com.castor.spotify.utils.EnvironmentUtils;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class LoginFlowsSteps {
    @Steps
    HomePageSpotifySteps home;

    @Steps
    LoginPageSteps login;

    @Steps
    DashboardSteps dashboard;

    @Step("Perform a full login flow")
    public void performLogin() {
        home.openSpotifyPage();
        login.enterToTheLoginPage();
        login.enterEmailToLogin(EnvironmentUtils.email());
        login.continueLoginWithPassword();
        login.enterPasswordLogin(EnvironmentUtils.password());
        dashboard.ensureLoginSuccesfull();
    }
}
