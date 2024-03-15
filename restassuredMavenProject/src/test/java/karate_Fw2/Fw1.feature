Feature: Single user
Scenario: get operation for single user using its URI

Given url "https://reqres.in/api/users"
And request {"name":"selenium","job":"api"}
When method POST
Then status 201
And print response