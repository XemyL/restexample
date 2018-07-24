Feature: Books feature

  Scenario Outline: Adding new book
    Given Service of books is available
    When User add new book with id = <id>, title = <title>, description = <description>, excerpt = <excerpt>
    Then Response code should be <statusCode>

    Examples:
      | id | title  | description  | excerpt  | statusCode |
      | 1  | title1 | description1 | excerpt1 | 415        |
      | 2  | title2 | description2 | excerpt1 | 415        |
      | 3  | title3 | description3 | excerpt2 | 415        |


  Scenario: Get count of available books
    Given Service of books is available
    When Get count of books
    Then Count of books should be 200


  Scenario: Get count of available books and check with list
    Given Service of books is available
    When Get count of books
    Then Count of books should not be
      | 10  |
      | 100 |
      | 0   |
      | -1  |


  Scenario Outline: Negative scenario
    Given Service of books is available
    When Get count of books
    Then Count of books should not be <number>

    Examples:
      | number |
      | 200    |
      | 100    |
      | 0      |
      | -1     |