package com.sk.apitests.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.concurrent.TimeUnit;

import static com.sk.apitests.base.BaseTest.currentURL;
import static org.hamcrest.Matchers.lessThan;


public class Specs {

    public static RequestSpecification requestSpecConnectionTest = new RequestSpecBuilder()
            .setBaseUri(currentURL)
            .setContentType(ContentType.JSON)
            .setBasePath(Endpoints.POSTS)
            .build();

    public static ResponseSpecification responseSpecOK = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(2L), TimeUnit.SECONDS)
            .build();

    public static RequestSpecification requestUserEndpoint = new RequestSpecBuilder()
            .setBaseUri(currentURL)
            .setContentType(ContentType.JSON)
            .setBasePath(Endpoints.USERS)
            .build();

}
