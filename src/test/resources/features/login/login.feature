#language:en
#Author:aserrate1712@hotmail.com

@regression
Feature: User Login
  As a Spotify user
  I want to log in securely
  So that my account is protected from invalid access attempts

  Background: enter to the spotify webpage
    Given I am on the Spotify Web home page

  @generalLoginSpotify
  Scenario: Login with invalid email
    Given I am on the Spotify login page
    When I enter an invalid email
    Then an error message should be displayed with invalid Email Message

  @generalLoginSpotify
  Scenario: Login with valid email and invalid password
    Given I am on the Spotify login page
    When I enter a valid email
    And I enter a invalid password
    Then an error message should be displayed with invalid password Message

  @generalLoginSpotify
  Scenario: Login with valid email and valid password
    Given I am on the Spotify login page
    When I enter a valid email
    And I enter a valid password
    Then A Dashboard Display should be displayed