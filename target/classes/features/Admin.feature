Feature: Admin page scenarios

  Background:
    Given  I navigate to Login page
    And I enter username as  "admin" and password as "admin123" and click on Sign in button


  Scenario: I should see a number for each role and department
    Then I should see a number for each role and department

  Scenario: I should not be able to delete Role or Department if it is assigned to an employee
    Then I should not be able to delete Role or Department if it is assigned to an employee

  Scenario: I need options to Edit employees in Employee data table
    When I click on edit employee data button
    And I should be able to change employee role from "sdet"
    Then I should seeing new employee role "security"

  Scenario: I need option to Delete employee in Employee data table
    Given the following employee data
    | ID   | First Name | Last Name | Role | Department |
    | 0009 | Sopisa     | GP        | sdet | Security   |
    When I click on delete employee data button
    Then I should not see the employee data that I deleted

