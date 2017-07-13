Feature: Login

Scenario Outline: Login With User Crdentials

Given User is able to access TalentScreen HomePage and Click Login button
When User Click enters "<name>" and "<password>", Click on submit button
#And User Click Submit button
Then User should be navigated to Login Success Home page.

Examples:
|name   | password|
|a@a.com|test123|
|b@b.com|test676|
|c@c.com|test676|
