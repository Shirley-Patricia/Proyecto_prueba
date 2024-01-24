@stories
  Feature: Login
    As  an unregistered user, I want to have access to the test application to be part of the tester community
  @scenario1
  Scenario: User register
    Given that Shirley wants to register on the application
    When she records her personal data
      | strName | strLastName | strEmail         | strLanguage |
      | Carlos  | Velez       | carlos@gmail.com | Frances     |
    And she enters the place where she live
    And she enters the mobile device data
    And she creates her password to enter the site
    Then she is registered in the application

