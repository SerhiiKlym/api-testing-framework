package com.sk.apitests.tests.users;

import com.sk.apitests.base.BaseTest;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.sk.apitests.base.Specs.requestUserEndpoint;
import static com.sk.apitests.base.Specs.responseSpecOK;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

@Listeners({AllureTestNg.class})
public class UsersEndpointTest extends BaseTest {

    @Test(description = "Verify fetching user with ID 1 returns correct data")
    public void testGetUserById_Success() {
        Integer userId = 1;
        given()
                .spec(requestUserEndpoint)
                .pathParam("id", userId)
                .log().uri()
                .log().params()
        .when()
                .get("/{id}")
        .then()
                .log().body()
                .spec(responseSpecOK)
                .body(matchesJsonSchemaInClasspath("schemas/user-address-schema.json"))
                .body("id", equalTo(userId))
                .body("email", equalTo("Sincere@april.biz"));

    }

}
