package TestNGListerners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListerners implements ITestListener{
   public void onTestFailure(ITestResult result) {
    System.out.println("Test Fail Screen shoot capture");
      }
}
