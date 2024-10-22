import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase2 {


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
    void AddCustomer4(){
        System.out.println("-------This is AddCustomer 4 ------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }

    @AfterMethod
    void AfterMethod(){
        System.out.println("This is After method  ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test
    void AddCustomer5(){
        System.out.println("  ------  This is AddCustomer 5  -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }

    @Test
    void AddCustomer6(){
        System.out.println("  ------  This is AddCustomer 6 -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


   /* @BeforeSuite
    void BeforeSuite(){
        System.out.println("This is Before Suite ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }

    @AfterSuite
    void Aftersuite(){
        System.out.println("This is After Suite ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }*/


    @BeforeTest
    void BeforeTest(){
        System.out.println("This is Before Test ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @AfterTest
    void AfterTest(){
        System.out.println("This is After Test ");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



}
