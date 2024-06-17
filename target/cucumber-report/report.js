$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/gen-random-animal-api-test.feature");
formatter.feature({
  "name": "Get Random Animal endpoint - API test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Retrieve a random animal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the AnimalServiceApplication is running",
  "keyword": "Given "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.theAnimalServiceApplicationIsRunning()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I request a random animal from the getRandomAnimal endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.iRequestARandomAnimalFromTheEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.theResponseStatusCodeShouldBe(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response body should contain valid JSON data representing an animal",
  "keyword": "And "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.theResponseBodyShouldContainValidJSONDataRepresentingAnAnimal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Retrieve a random animal with a specific type",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the AnimalServiceApplication is running",
  "keyword": "Given "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.theAnimalServiceApplicationIsRunning()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I request a random animal with type \"mammals\" from the getRandomAnimal endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.iRequestARandomAnimalOfTypeFromTheEndpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code should be 404",
  "keyword": "Then "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.theResponseStatusCodeShouldBe(int)"
});
formatter.result({
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003c404\u003e but was: \u003c200\u003e\n\tat org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)\n\tat org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)\n\tat org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:150)\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:145)\n\tat org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:531)\n\tat com.paramount.techtalkpresentation.StepDefinitions.theResponseStatusCodeShouldBe(StepDefinitions.java:33)\n\tat ✽.the response status code should be 404(file:///Users/wojcikp/Downloads/tech-talk-presentation/src/test/resources/gen-random-animal-api-test.feature:12)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Retrieve a random animal with a specific type that does not exist",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the AnimalServiceApplication is running",
  "keyword": "Given "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.theAnimalServiceApplicationIsRunning()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I request a random animal with type \"nonexistent\" from the getRandomAnimal endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.iRequestARandomAnimalOfTypeFromTheEndpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status code should be 404",
  "keyword": "Then "
});
formatter.match({
  "location": "com.paramount.techtalkpresentation.StepDefinitions.theResponseStatusCodeShouldBe(int)"
});
formatter.result({
  "status": "passed"
});
});