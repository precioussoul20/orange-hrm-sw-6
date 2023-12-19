Feature: User Test

  As a User I want to Login Successfully

@sanity @regression
Scenario: Verify Admin should add User Successfully
Given I am on Homepage
When I enter user name "Admin"
And I enter password "admin123"
And I click on Login Button
And I click On Admin Tab
And I Verify 'System Users' Text
And I click on 'Add' Button
And I verify 'Add User' Text on that field
And I select User Role 'Admin'
And I enter employee name 'Lisa'
And  I  enter Username 'johnsmith1234567'
And I Select status 'Disable'
And I  enter Password 'John@1234' in password field
And I enter Confirm Password  'John@1234'
And I  click On 'Save' Button on page
Then I verify message 'Successfully Saved'

@smoke @regression
Scenario:  Verify search The User which is Created
Given I am on Homepage
When I enter user name "Admin"
And I enter password "admin123"
And I click on Login Button
And I click On Admin Tab
And I Verify 'System Users' Text
And  I  enter Username 'johnsmith1234567' in username field
And I Select status 'Disable'
And I click On 'Search' Button in search field
Then I Verify User should be in Result List

  @regression
  Scenario: Verify That Admin Should Delete The User SuccessFully
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    And I click On Admin Tab
    And I Verify 'System Users' Text
    And  I  enter Username 'johnsmith1234567' in username field
    And I Select status 'Disable'
    And I click On 'Search' Button in search field
    And  I Verify User should be in Result List
    And Click on Check box
    And Click on Delete Button in delete field
    And Popup will display
    And Click on Ok Button on Popup
    Then verify message 'Successfully Deleted' user deleted



  @regression
  Scenario: Verify The Deleted User And The Message No Record Found
    Given I am on Homepage
    When  I enter user name 'Admin'
    And   I enter password "admin123"
    And   I click on Login Button
    And   I click On Admin Tab
    And   I Verify 'System Users' Text
    And   I  enter Username "johnsmith1234567" in username field
    And   I Select status 'Status'
    And   I click On 'Search' Button in search field
    Then  Verify message 'No Records Found'

  @regression
  Scenario: Verify The User And The Message Record Found
    Given I am on Homepage
    When  I enter user name 'Admin'
    And  I enter password 'admin123'
    And  I click on Login Button
    And  I click On Admin Tab
    Then I Verify 'System Users' Text
    And  I enter the following users details

      |Admin            |Admin     |Paul Collings    |Enable |
      |Cassidy.Hope     |ESS       |Cassidy Hope     |Enable |
      |Nina.Patel       |ESS       |Nina Patel       |Enable |
      |Odis.Adalwin     |Admin     |Odis Adalwin     |Enable |
    And  I Click on 'Search Button'
    Then verify message '(1) Record Found'
    Then verify username '<username>'
    And  I Click on Reset Tab





