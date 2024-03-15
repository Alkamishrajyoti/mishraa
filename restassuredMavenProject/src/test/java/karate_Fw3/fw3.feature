Feature: Single user
Scenario: get operation for single user using its uri

Given url "https://reqres.in/api/users/2"
And request {"name": "shilpa","job": "Quality Analyst"}
When method PUT
Then status 200
And print response
