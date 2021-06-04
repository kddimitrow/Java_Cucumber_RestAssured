

  Feature: Application login

#1
  Scenario: Home page default

  Given User is on NetBanking landing Page
  When  User login into application with username and password
  Then  Home Page is populated
  And   Cards are displayed


 # //2
  Scenario: Home page default negative

  Given User is on NetBanking landing Page
  When  User login into application with "username" and "password"
  Then  Home Page is populated
  And   Cards are displayed

#  //3
  Scenario: Home page default negative

  Given User is on NetBanking landing Page
  When  User login into application with username and "123456"
  Then  Home Page is populated
  And   Cards are displayed

#  //4
  Scenario: Home page default negative

  Given User is on NetBanking landing Page
  When  User login into application with username and "12345678"
  Then  Home Page is populated
  And   Cards are displayed

#    Given dalsdsladlsa
#    |username|pass|
#    Then dassa
#    And