Feature: Account creation and sign-in

  Scenario: User creates a new account and signs in
    Given I navigate to the Magento homepage
    When I click on the "Create an Account" link
    And I fill in the registration form with valid details
    And I submit the form
    Then I should see a successful registration message
    When I log in with the newly created account
    Then I should be signed in and see the dashboard
