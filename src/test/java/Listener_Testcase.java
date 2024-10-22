import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Listeners(Custom_Listeners.class)
public class Listener_Testcase {

    @Test
    void Setup(){
        System.out.println("This is Setup method  and Priority is 2");
        Assert.assertEquals(2,2);
    }


    @Test
    void Login(){
        System.out.println("This is Login method and Priority is 1");
        Assert.assertEquals(3,3);
    }


    @Test(enabled = true)
    void Teardown(){
        System.out.println("This is Teardown method  and Priority is 3");
        throw new SkipException("Skipping ");
    }


}
