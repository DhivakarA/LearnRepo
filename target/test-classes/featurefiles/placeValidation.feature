Feature: Validating Place API's

Scenario: Verify if place is being successfully added using AddPlaceAPI
Given Add Place Payload
When User calls "AddPlaceAPI" with POST Http Request
Then API call is success with statuscode 200 OK
And "status" in response body is "OK"
