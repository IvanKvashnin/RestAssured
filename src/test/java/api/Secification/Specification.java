package api.Secification;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;


public class Specification implements BeforeAllCallback {
    @Override
    public void beforeAll(ExtensionContext extensionContext){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://reqres.in/")
                .addFilter(new AllureRestAssured())
                .build();
    }
}
