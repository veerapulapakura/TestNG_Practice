import org.testng.Assert;
import org.testng.annotations.Test;
//
public class SecondTestCase {

    @Test
    void SearchCustomer(){
        System.out.println("This is SearchCustomer  and Priority is 2");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test
    void AddCustomer(){
        System.out.println("This is AddCustomer and Priority is 1");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test
    void DeleteCustomer(){
        System.out.println("This is DeleteCustomer  and Priority is 3");
    }

}
