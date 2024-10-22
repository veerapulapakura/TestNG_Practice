import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    void Setup(){
        System.out.println("This is Setup method  and Priority is 2");
    }


    @Test
    void Login(){
        System.out.println("This is Login method and Priority is 1");
    }


    @Test
    void Teardown(){
        System.out.println("This is Teardown method  and Priority is 3");
    }


}
