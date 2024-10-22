import org.testng.annotations.Test;

public class DataFromDataProvider {

    @Test(dataProvider="datasameclass",dataProviderClass = DataProviderInOtherClass.class)
    public void myTestcase(String email, String name){

        System.out.println((email+"  Email  -- "+ "name  "+name ));

    }
}
