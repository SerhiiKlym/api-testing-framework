package com.sk.apitests.base;

import com.sk.apitests.utils.ConfigReader;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.number.OrderingComparison.lessThan;

@Listeners({AllureTestNg.class})
public class BaseApiTest {

    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void test_connection() {
        given()
                .baseUri(ConfigReader.get("base.url"))
                .basePath("/posts")
                .log()
                .body()
            .when()
                .get()
            .then()
                .log().body()
                .statusCode(200)
                .time(lessThan(1000L));

    }
}
