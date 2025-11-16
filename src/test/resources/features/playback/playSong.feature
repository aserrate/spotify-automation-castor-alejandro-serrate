#language:en
#Author:aserrate1712@hotmail.com

@regression
Feature: Song Playback
  As a Spotify user
  I want to play a song
  So that I can listen to my favorite music

  Background: logged in to Spotify
    Given I am logged in to Spotify

  @PlaySongs
  Scenario: Play a song from search results
    Given I search for "Madonna"
    And the search results are related to the key word
    When start to play the artists songs
    Then the song should start playing
