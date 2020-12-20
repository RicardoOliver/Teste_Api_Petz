package base;
import base.BaseUtil;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class BaseUtil {
    public Response response;
    public RequestSpecification request;
    public String urlDigital = "http://api.openweathermap.org";
}
