Feature: Single user
Scenario: get operation for single user using its URI

Given url "https://reqres.in/api/users/2"
When method GET
Then status 200
And print response
And match response.data.id == 2