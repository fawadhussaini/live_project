Feature: Edit Employee Scenarios
  Background:
    Given  I navigate to Login page
    And I enter username as  "admin" and password as "admin123" and click on Sign in button

    @edit
    Scenario: As an admin I need options to Edit or Delete employees in Employee data table
      When I input following details in Employee data table
      |  ID        | 0009     |
      | First Name | Sopisa   |
      | Last Name  | GP       |
      | Role       | sdet     |
      | Department | Security |
      Then I click Enter button
      Then I should be able to see Edit button
      And I should be able to see Delete button

      @edit
     Scenario: I should be able to edit employee data
       When I click Edit button
       And I should be able to modify first name and click update button
       Then I should be able to see new first name

        @edit
     Scenario: I should be able to delete employee data
       When I click Delete button
       Then I should not see employee data that I deleted

