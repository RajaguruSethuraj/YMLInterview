Feature: Login FaceBook - 1
  Description: The purpose of this feature is to test facebook log in page  
  
  Background: User lanuch Facebook
  	Given Launch Facebook page
  	Then Maximize log in page

@SmokeTest
  Scenario Outline: Test Facebook Log in Page
    Then Enter <userName> and <password>
    And Click Log in Button
    Then Close Browser

    Examples: 
      | userName | password |
      | feature1     | xcxcx    |
      | feature1     | fdfd     |
      
      
@Regression @SmokeTest
   Scenario Outline: Test Facebook Log in Page
    Then Enter <userName> and <password>
    And Click Log in Button
    Then Close Browser

    Examples: 
      | userName | password |
      | rrrsds   | ttttt   |
      
            