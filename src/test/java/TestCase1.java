import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase1 {


    @BeforeClass
    void BeforeClass(){
        System.out.println("This is Before class ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @AfterClass
    void AfterClass(){
        System.out.println("This is After class ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @BeforeMethod
    void BeforeMethod(){
        System.out.println("This is Before method ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test
    void AddCustomer1(){
        System.out.println("-------This is AddCustomer  1 ------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }

    @AfterMethod
    void AfterMethod(){
        System.out.println("This is After method  ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test
    void AddCustomer2(){
        System.out.println("  ------  This is AddCustomer2  -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }

    @Test
    void AddCustomer3(){
        System.out.println("  ------  This is AddCustomer3  -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @BeforeSuite
    void BeforeSuite(){
        System.out.println("This is Before Suite ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }

    @AfterSuite
    void Aftersuite(){
        System.out.println("This is After Suite ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }
}
