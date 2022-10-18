Feature: Google Search Functionality
@practice
  Scenario: Title Verification
  When User is on Google search page
  And User types "apple" in the google search box and clicks enter
 Then User sees Steve Jobs is in the google title