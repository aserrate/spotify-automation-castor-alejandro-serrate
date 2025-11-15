#language:en
#Author:aserrate1712@hotmail.com
@generalPublicListSpotify
Feature: Browse Top Playlists want to navigate to top playlists and explore trending content
  Background: logged in to Spotify
    Given I am logged in to Spotify

  Scenario: Navigate to popular playlists
    Given I navigate to explore
    When I select gender of the list "Pop"
    Then I should see public playlists