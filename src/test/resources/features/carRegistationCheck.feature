@carRegistrationCheck
Feature: Car Registration Check
  As a user
  I want to check Car Registrations
  In order to validate input data files

#  Background: Given I read input data "car_output.txt"

  Scenario: Car Registration Checking
    When I am go to the car tax check page
    Then I enter "REGISTRATION" and "Free Car Check" against the input data


#  Scenario: Car Registration Checking
#    When I am go to the car tax check page
#    And I enter "REGISTRATION" from input data
#    And I select "Free Car Check" and submit
#    And I check the fields match the input data



