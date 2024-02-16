package api.client;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class Client implements ClientImplementation {
    @Override
    public <T> T getRequest(String endPoint, Class<T> responseClass, Long timeOut) {
        return given().when().get(endPoint).then().time(lessThan(timeOut)).log().all().extract().as(responseClass);
    }

    @Override
    public <T> T getRequest(String endPoint,Object requestBody, Class<T> responseClass) {
        return given().body(requestBody).when().get(endPoint).then().log().all().extract().as(responseClass);
    }

    @Override
    public <T> T postRequest(String endPoint, Object requestBody, Class<T> responseClass) {
        return given().body(requestBody).when().post(endPoint).then().log().all().extract().as(responseClass);
    }

    @Override
    public <T> T putRequest(String endPoint, Object requestBody, Class<T> responseClass) {
        return given().body(requestBody).when().put(endPoint).then().log().all().extract().as(responseClass);
    }

    @Override
    public  <T> T deleteRequest(String endPoint, Object requestBody, Class<T> responseClass) {
        return given().body(requestBody).when().delete(endPoint).then().log().all().extract().as(responseClass);
    }
}
