#language:en
#Author:aserrate1712@hotmail.com
@generalSearchSpotify
Feature: Song and Artist Search and explore relevant music results

  Scenario: Search for Coldplay artist
    Given I am on the Spotify Web home page
    When I search for "Coldplay"
    Then the search results are related to the key word

  Scenario: Search for Elton John artist
    Given I am on the Spotify Web home page
    When I search for "Elton John"
    Then the search results are related to the key word