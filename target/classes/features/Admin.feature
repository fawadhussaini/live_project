Feature: Admin page scenarios

  Background:
    Given  I navigate to Login page
    And I enter username as  "admin" and password as "admin123" and click on Sign in button


  Scenario: I should see a number for each role and department
    Then I should see a number for each role and department

  Scenario: I should not be able to delete Role or Department if it is assigned to an employee
    Then I should not be able to delete Role or Department if it is assigned to an employee

<<<<<<< HEAD
#  Scenario: I need options to Edit employees in Employee data table
#    When I click on edit employee data button
#    And I should be able to change employee role from "sdet"
#    Then I should seeing new employee role "security"
#
#  Scenario: I need option to Delete employee in Employee data table
#    When I click on delete employee data button
#    Then I should not see the employee data that I deleted

  Scenario Outline: As an admin I need options to Edit or Delete employees in Employee data table
    Then I verify "<button name>" button is enabled
    Examples:
      |button name|
      |Edit       |
      |Delete     |

=======
  Scenario:  Verify Employee is populate as Admin
    When I input "ID" as "1011"
    And I input "firstname" as "GamesAdmin"
    And I input "lastname" as "WongAdmin"
    And  I input "Selecrole" as "sdet"
    And  I input "Selecdepartment" as "Security"
    Then I click Enter button
    Then Employee is populate in the data table
>>>>>>> f294fad8988e97251d0c7b65d36e67e0a28e4aef
