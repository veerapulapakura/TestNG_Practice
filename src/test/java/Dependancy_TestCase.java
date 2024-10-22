import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependancy_TestCase {

    @Test
    void BSearchCustomer1(){
        System.out.println("This is SearchCustomer  and Priority is 1");
        Assert.fail();
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



    @Test(dependsOnMethods = {"BSearchCustomer1","BSearchCustomer1" },alwaysRun = true)
    void ASearchCustomer2(){
        System.out.println("This is SearchCustomer  and Priority is 2");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



    @Test(dependsOnMethods = {"ASearchCustomer2"})
    void DSearchCustomer3(){
        System.out.println("This is SearchCustomer  and Priority is 3");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test(dependsOnMethods = {"ASearchCustomer2","BSearchCustomer1"})
    void CSearchCustomer4(){
        System.out.println("This is SearchCustomer  and Priority is 4");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



}
