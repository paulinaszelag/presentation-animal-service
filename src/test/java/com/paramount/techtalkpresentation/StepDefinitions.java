package com.paramount.techtalkpresentation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@Slf4j
public class StepDefinitions {

    private final String getRandomAnimalEndpoint = "http://localhost:9999/getRandomAnimal";

    private Response response;

    @Given("the AnimalServiceApplication is running")
    public void theAnimalServiceApplicationIsRunning() {
        log.info("The AnimalServiceApplication is running");
    }

    @When("I request a random animal from the getRandomAnimal endpoint")
    public void iRequestARandomAnimalFromTheEndpoint() {
        response = RestAssured.get(getRandomAnimalEndpoint);
        log.info("Response for {}: {}", getRandomAnimalEndpoint, response.asString());
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    @Then("the response body should contain valid JSON data representing an animal")
    public void theResponseBodyShouldContainValidJSONDataRepresentingAnAnimal() {
        String responseBody = response.getBody().asString();
        response.getBody().prettyPrint();
        // Assuming your response contains JSON data representing an animal
        // You can implement your own logic to validate the structure or contents of the JSON response
        assertTrue("Response body should contain valid JSON data representing an animal", !responseBody.isEmpty());
    }

    @When("I request a random animal with type {string} from the getRandomAnimal endpoint")
    public void iRequestARandomAnimalOfTypeFromTheEndpoint(String arg0) {
        String endpoint = getRandomAnimalEndpoint + "?type=" + arg0;
        response = RestAssured.get(endpoint);
    }
}
