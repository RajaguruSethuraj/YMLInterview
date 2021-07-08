Feature: Login FaceBook - 2
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
      | feature2     | xcxcx    |
      | feature2    | fdfd     |
      
      
@Regression
   Scenario Outline: Test Facebook Log in Page
    Then Enter <userName> and <password>
    And Click Log in Button
    Then Close Browser

    Examples: 
      | userName | password |
      | TestJul08   | ttttt   |
      
         