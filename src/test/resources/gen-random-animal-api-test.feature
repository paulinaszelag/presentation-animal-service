Feature: Get Random Animal endpoint - API test

  Scenario: Retrieve a random animal
    Given the AnimalServiceApplication is running
    When I request a random animal from the getRandomAnimal endpoint
    Then the response status code should be 200
    And the response body should contain valid JSON data representing an animal

    #copilot

    Scenario: Retrieve a random animal with a specific type
    Given the AnimalServiceApplication is running
    When I request a random animal with type "mammals" from the getRandomAnimal endpoint
    Then the response status code should be 404

    Scenario: Retrieve a random animal with a specific type that does not exist
    Given the AnimalServiceApplication is running
    When I request a random animal with type "nonexistent" from the getRandomAnimal endpoint
    Then the response status code should be 404

#      #chat
#
#  Scenario: Retrieve a random animal when the service is not running
#    Given the AnimalServiceApplication is not running
#    When I request a random animal from the getRandomAnimal endpoint
#    Then the response status code should be 503

#  Scenario: Retrieve a random animal with invalid request method
#    Given the AnimalServiceApplication is running
#    When I send a POST request to the getRandomAnimal endpoint
#    Then the response status code should be 405
#
#  Scenario: Retrieve a random animal with unsupported media type
#    Given the AnimalServiceApplication is running
#    When I request a random animal from the getRandomAnimal endpoint with "text/xml" content type
#    Then the response status code should be 415
#
#  Scenario: Retrieve a random animal with invalid endpoint
#    Given the AnimalServiceApplication is running
#    When I request a random animal from the "getRandomAnimalInvalid" endpoint
#    Then the response status code should be 404
#
#  Scenario: Retrieve a random animal with slow response
#    Given the AnimalServiceApplication is running
#    When I request a random animal from the getRandomAnimal endpoint and the response time is more than 5 seconds
#    Then the response status code should be 200
#    And the response time should be less than 5 seconds
#
#  Scenario: Retrieve a random animal with a specific type
#    Given the AnimalServiceApplication is running
#    When I request a random animal with type "mammals" from the getRandomAnimal endpoint
#    Then the response status code should be 200
#    And the response body should contain valid JSON data representing an animal
#
#  Scenario: Retrieve a random animal with a specific type that does not exist
#    Given the AnimalServiceApplication is running
#    When I request a random animal with type "nonexistent" from the getRandomAnimal endpoint
#    Then the response status code should be 404