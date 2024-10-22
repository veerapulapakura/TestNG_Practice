import org.testng.Assert;
import org.testng.annotations.*;

public class GroupingTestCases {

    @Test(groups = {"Smoke"})
    void AddCustomer1(){
        System.out.println("  -------This is AddCustomer  1 ------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test(groups = {"Smoke"})
    void AddCustomer2(){
        System.out.println("  ------  This is AddCustomer2  -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }

    @Test(groups = {"Smoke"})
    void AddCustomer3(){
        System.out.println("  ------  This is AddCustomer3  -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test(groups = {"Sanity"})
    void AddCustomer4(){
        System.out.println("  ------  This is AddCustomer 4  -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test(groups = {"Sanity","Smoke"})
    void AddCustomer5(){
        System.out.println("  ------  This is AddCustome 5  -------");
        Assert.assertEquals(1,1);
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



}
