#language:en
#Author:aserrate1712@hotmail.com

@regression
Feature: Browse Top Playlists
  As a logged-in Spotify user
  I want to navigate to top playlists
  So that I can explore trending content

  Background: logged in to Spotify
    Given I am logged in to Spotify

  @generalPublicListSpotify
  Scenario: Navigate to popular playlists related with Pop
    Given I navigate to explore
    When I select genre of the list "Pop"
    Then I should see public playlists

  @generalPublicListSpotify
  Scenario: Navigate to popular playlists related with Rock
    Given I navigate to explore
    When I select genre of the list "Rock"
    Then I should see public playlists