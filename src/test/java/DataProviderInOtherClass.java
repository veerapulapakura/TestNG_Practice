import org.testng.annotations.DataProvider;

public class DataProviderInOtherClass {

    @DataProvider(name = "datasameclass")
    public Object[][] getObject() {
        Object[][] data = {{"veera.ratn@gmail.com", "veera"},{"veera@gmail.com","kumar"}};
        return data;
    }

}
