#language:en
#Author:aserrate1712@hotmail.com

@regression
Feature: Browse Top Playlists want to navigate to top playlists and explore trending content
  Background: logged in to Spotify
    Given I am logged in to Spotify

  @generalPublicListSpotify
  Scenario: Navigate to popular playlists related with Pop
    Given I navigate to explore
    When I select gender of the list "Pop"
    Then I should see public playlists

  @generalPublicListSpotify
  Scenario: Navigate to popular playlists related with Rock
    Given I navigate to explore
    When I select gender of the list "Rock"
    Then I should see public playlists