import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Custom_Listeners implements ITestListener {

    public  void onStart(ITestContext arg){
        System.out.println("On  starting ----"+arg.getName());
    }


    public  void onFinish(ITestContext arg){
        System.out.println("On  Finish ----"+arg.getName());
    }

    public  void onTestStart(ITestResult arg0){
        System.out.println("On test starting ----"+arg0.getName());
    }

    public  void onTestFailure(ITestResult arg0){
        System.out.println("On test failure ----"+arg0.getName());
    }
}
