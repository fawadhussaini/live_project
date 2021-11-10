Feature: Login page steps

  Scenario: When I sign in with admin credentials it should take me to admin page and user credentials to User page.
    Given  I navigate to Login page
    And I enter username = user and password = user123 and click on Sign in button
    Then I should see the WELCOME USER!



