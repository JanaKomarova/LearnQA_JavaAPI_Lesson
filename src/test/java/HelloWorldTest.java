import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HelloWorldTest {
    @Test

    public void testHelloWorld(){
        System.out.println("Hello world");
    }

    @Test
    public void testPrintResponce(){
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/hello")
                .andReturn();
       response.prettyPrint();
}
}
