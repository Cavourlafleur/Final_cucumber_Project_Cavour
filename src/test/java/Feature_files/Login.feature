Feature: As a user l should be able to login "https://test.mersys.io/'' add , edit and delete user under position.
  Scenario: Login and add , edit and delete user under position.
    Given  Navigate to website
  Given User name and password then Login
    Then  Click on human resource,Setup,Position
    And  Click on add sign button
    Then  Insert name , short name and save
    Given  Successful message is displayed
    Then Locate edit button sigh and click
    And Edit Name and save
    Given  Successful message is displayed it has been edited
    Then Click on delete bucket and confirm delete
    Then  Successful delete message should appear