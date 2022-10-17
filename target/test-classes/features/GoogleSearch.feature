Feature: Google Search Functionality Title Verification
  @wip
  Scenario: Search page title verification
  When User is on Google search page
  And User types apple in the google search box and clicks enter
  Then User sees apple is in the google title