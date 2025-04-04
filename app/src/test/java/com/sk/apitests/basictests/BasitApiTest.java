package com.sk.apitests.basictests;

import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.number.OrderingComparison.lessThan;

@Listeners({AllureTestNg.class})
public class BasitApiTest {

    @Test
    public void test_connection() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .basePath("/posts")
                .log()
                .body()
                .when()
                .get()
                .then()
                .log()
                .body()
                .statusCode(200)
                .time(lessThan(5000L));

    }
}
