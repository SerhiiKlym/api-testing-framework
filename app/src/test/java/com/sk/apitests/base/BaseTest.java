package com.sk.apitests.base;

import com.sk.apitests.utils.ConfigReader;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static final String currentURL = ConfigReader.get("base.url");

    @BeforeClass(alwaysRun = true)
    public static void setUp() {
        RestAssured.baseURI = currentURL;
        RestAssured.filters(new AllureRestAssured());
    }

    @AfterClass(alwaysRun = true)
    public static void tearDownClass() {
        RestAssured.reset();
    }

}
