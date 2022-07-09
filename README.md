# yocket-assignment

# Automation for masters module

    I have automated the "College Finder" module on https://yocket.com/ using the selenium - cucumber BDD framework
    
# Selenium with Cucumber

 ****What is Cucumber?****
       
    Cucumber is an open source tool that supports Behavior Driven Development (BDD) framework. 
    It provides the facility to write tests in a human readable language called Gherkin. 
    Selenium tests UI while Cucumber does acceptance testing
        
----------------------------------------------

  ****What is Gherkin?****
         
         Gherkin uses a set of special keywords to give structure and meaning to executable specifications.

          1. Primary Gherkin keywords are:
          2. Feature
          3. Scenario / Scenario Outline
          4. Given, When, Then, And, But
          5. Background
          6. Examples
-------------------------------------

# Things to be improved upon

  1. Data Driven Test data - For various text fields, currently only positive user journeys are considered. 
  Data driven testing will ewnsure to cover negative scenarios as well.

  2. Login scenario- College finder automation is scripted for emulating the behavior of a guest user. 
  Sign-up / login feature is not considered. Future scope will include - logging in as a guest user, signing up for a new account

  3. Sort by price - Sort by relevancy / price was not covered for this script as it can't be achieved as a guest user. 
  Once login scenarios are covered, sort by price and gathering any university details will be achieved.
--------------------------------------

# You will find -

  1. Runner class - Starting point for junit to run the test suite
  2. pom.xml - Information about the project and configuration used by maven to build the project
  3. Feature file - User beahvior is captured here using Gherkin keywords
  4. Step Definition - Consists of glue code which consits of custom written code snippets to connect user behaviour and test coverage

----------------------------------------

# Steps to Install:

    git clone in Root directory of the system.
    cd selenium-cucumber
    mvn clean install -> may take some time for the first time.
    Junit is being used to validate the tests.
  
  ------------------------------------------------------
  Note - For running test cases in Linux or Mac, make sure to add specific executable driver and change the path of executable driver in src\main\resources\drivers. 
  No change required for running test cases in Windows.


