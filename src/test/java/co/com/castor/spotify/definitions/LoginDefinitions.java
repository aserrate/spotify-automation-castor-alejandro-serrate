package co.com.castor.spotify.definitions;

import co.com.castor.spotify.steps.DashboardSteps;
import co.com.castor.spotify.steps.LoginFlowsSteps;
import co.com.castor.spotify.steps.LoginPageSteps;
import co.com.castor.spotify.utils.EnvironmentUtils;
import co.com.castor.spotify.utils.FakeDataUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginDefinitions {

    @Steps
    LoginFlowsSteps loginFlowsSteps;

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    DashboardSteps dashboardSteps;


    @Given("I am on the Spotify login page")
    public void iAmOnTheSpotifyLoginPage(){
        loginPageSteps.enterToTheLoginPage();
    }

    @Given("I am logged in to Spotify")
    public void iAmLoggedInToSpotify(){
        loginFlowsSteps.performLogin();
    }

    @When("I enter an invalid email")
    public void iAmEnteringInvalidEmail() {
        loginPageSteps.enterEmailToLogin(FakeDataUtils.invalidEmail());
    }

    @When("I enter a valid email")
    public void iAmEnteringValidEmail() {
        loginPageSteps.enterEmailToLogin(EnvironmentUtils.email());
        loginPageSteps.continueLoginWithPassword();
    }

    @And("I enter a invalid password")
    public void iAmEnteringInvalidPassword() {
        loginPageSteps.enterPasswordLogin(FakeDataUtils.randomPassword(8,16));
    }

    @And("I enter a valid password")
    public void iAmEnteringValidPassword(){
        loginPageSteps.enterPasswordLogin(EnvironmentUtils.password());
    }

    @Then("an error message should be displayed with invalid Email Message")
    public void messageErrorSouldBeDisplayedInvalidEmail() {
        loginPageSteps.resultsOfInvalidEmail();
    }

    @Then("an error message should be displayed with invalid password Message")
    public void messageErrorShouldBeDisplayedInvalidPassword() {
        loginPageSteps.resultsOfInvalidCredentials();
    }

    @Then("A Dashboard Display should be displayed")
    public void dashboardDisplayShouldBeDisplayed(){
        dashboardSteps.ensureLoginSuccesfull();
    }
}
