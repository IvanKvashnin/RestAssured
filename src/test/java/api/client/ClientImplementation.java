package api.client;

public interface ClientImplementation {
     public <T> T getRequest(String endPoint, Class<T> responseClass, Long timeOut);

     public <T> T getRequest(String endPoint,Object requestBody, Class<T> responseClass);

     public <T> T postRequest(String endPoint, Object requestBody, Class<T> responseClass);

     public <T> T putRequest(String endPoint, Object requestBody, Class<T> responseClass);

     public  <T> T deleteRequest(String endPoint, Object body, Class<T> responseClass);
}
