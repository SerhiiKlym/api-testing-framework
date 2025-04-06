package com.sk.apitests.tests.connection;

import com.sk.apitests.base.Specs;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Listeners({AllureTestNg.class})
public class ConnectionTest {

    @Test
    public void test_connection() {
        given()
                .spec(Specs.connectionTestRequest)
                .log()
                .body()
            .when()
                .get()
            .then()
                .spec(Specs.connectionTestResponse)
                .log()
                .body();
    }
}
