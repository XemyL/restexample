Feature: Cover Photos feature

  Scenario: Get count of available photos covers
    Given Service of cover photos is available
    When Get count of cover photos
    Then Count of cover photos should be 200