Feature: Admin page scenarios

  Background:
    Given  I navigate to Login page
    And I enter username as  "admin" and password as "admin123" and click on Sign in button


  Scenario: I should see a number for each role and department
    Then I should see a number for each role and department

  Scenario: I should not be able to delete Role or Department if it is assigned to an employee
    Then I should not be able to delete Role or Department if it is assigned to an employee

  Scenario Outline: As an admin I need options to Edit or Delete employees in Employee data table
    Then I verify "<button name>" button is enabled
    Examples:
      |button name|
      |Edit       |
      |Delete     |

