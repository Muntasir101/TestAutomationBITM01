Feature: Login Functionality Test

@SmokeTest
Scenario: Check Login function with Valid email and valid password

Given Open Browser
And Open Login page

When Enter valid <email> and Enter valid <password>

Then Login successful and redirect to Account page





