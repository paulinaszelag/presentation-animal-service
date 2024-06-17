package com.paramount.techtalkpresentation;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AnimalServiceAPITest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "http://localhost:9999";
    }

    @Test
    public void getRandomAnimal_Returns200() {
        // Perform GET request to /getRandomAnimal endpoint
        given()
                .when()
                .get("/getRandomAnimal")
                .then()
                .statusCode(200);
    }
}
