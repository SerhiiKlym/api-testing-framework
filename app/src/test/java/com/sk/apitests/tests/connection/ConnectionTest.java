package com.sk.apitests.tests.connection;

import com.sk.apitests.base.BaseTest;
import com.sk.apitests.base.Specs;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Listeners({AllureTestNg.class})
public class ConnectionTest extends BaseTest {

    @Test(description = "Verify sever responds with status 200")
    public void test_connection() {
        given()
                .spec(Specs.requestSpecConnectionTest)
                .log().body()
        .when()
                .get()
        .then()
                .spec(Specs.responseSpecOK)
                .log().body();
    }
}
