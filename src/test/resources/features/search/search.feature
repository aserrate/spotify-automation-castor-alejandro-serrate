#language:en
#Author:aserrate1712@hotmail.com

@regression
Feature: Song and Artist Search and explore relevant music results

  @generalSearchSpotify
  Scenario: Search for Coldplay artist ColdPlay
    Given I am on the Spotify Web home page
    When I search for "Coldplay"
    Then the search results are related to the key word

  @generalSearchSpotify
  Scenario: Search for Elton John artist Elton John
    Given I am on the Spotify Web home page
    When I search for "Elton John"
    Then the search results are related to the key word