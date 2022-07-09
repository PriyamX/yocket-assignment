Feature: Masters module

  #@YocketLogin
  #Scenario: Successful Login with valid credentials data driven
   # Given user launch browser
    #When user navigates to yocket homepage
    #And user enters email as <username> and password as <passwsord> 
    #And click on Login
    #Then user can see updated price of two smartphones
    #Examples:
       # | email               | password      |
       # | testuser1234@gmail.com | admin236472    |
		   # | test@google.com | incorrectpass | Incorrect email and password

   @YocketMasterDetails
   Scenario: Open yocket and display list of universities sorted by price
    Given user launches browser
    When user navigates to yocket homepage
    And user enters country name and major
    And user enters undergarduate college name, course major and CGPA score
    And user enters English and aptitude scores
    And user enters relevant work expereince and projects
    Then user can see list of universities sorted by price

    
  