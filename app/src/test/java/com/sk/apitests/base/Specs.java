package com.sk.apitests.base;

import com.sk.apitests.utils.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.lessThan;


public class Specs {

    public static RequestSpecification connectionTestRequest = new RequestSpecBuilder()
            .setBaseUri(ConfigReader.get("base.url"))
            .setContentType(ContentType.JSON)
            .setBasePath("/posts")
            .build();

    public static ResponseSpecification connectionTestResponse = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(2L), TimeUnit.SECONDS)
            .build();

    public static RequestSpecification userRequest = new RequestSpecBuilder()
            .setBaseUri(ConfigReader.get("base.url"))
            .setContentType(ContentType.JSON)
            .setBasePath("/users")
            .build();

    public static ResponseSpecification userResponse = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(2L), TimeUnit.SECONDS)
            .build();


}
