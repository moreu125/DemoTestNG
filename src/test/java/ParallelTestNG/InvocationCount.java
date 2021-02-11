package ParallelTestNG;

import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 2 , invocationTimeOut = 5000)
public void Test1() throws InterruptedException {
	System.out.println("Test done");
	Thread.sleep(6000);
}
}
