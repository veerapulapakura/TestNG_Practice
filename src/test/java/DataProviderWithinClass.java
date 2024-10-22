import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithinClass {

    @DataProvider(name = "datasameclass")
    public Object[][] getObject() {
        Object[][] data = {{"veera.ratn@gmail.com", "veera"},{"veera@gmail.com","kumar"}};
        return data;
    }


    @Test(dataProvider="datasameclass")
    public void myTestcase(String email, String name){

        System.out.println((email+"  Email  -- "+ "name  "+name ));

    }
}
