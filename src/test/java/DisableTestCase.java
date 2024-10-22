import org.testng.annotations.Test;

public class DisableTestCase {

    @Test(priority=1)
    void BSearchCustomer1(){
        System.out.println("This is SearchCustomer  and Priority is 1");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



    @Test(priority=2,enabled = false)
    void ASearchCustomer2(){
        System.out.println("This is SearchCustomer  and Priority is 2");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



    @Test(priority=3,enabled = false)
    void DSearchCustomer3(){
        System.out.println("This is SearchCustomer  and Priority is 3");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }


    @Test(priority=4)
    void CSearchCustomer4(){
        System.out.println("This is SearchCustomer  and Priority is 4");
        //https://www.youtube.com/watch?v=uqf8rqgCzhk&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=3
    }



}
