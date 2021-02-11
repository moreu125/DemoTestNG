package CreatingTestCase;

import org.testng.annotations.Test;

public class GroupInTestNG {
	
	@Test(groups = {"demo1" , "demo2"})
	public void Test1() {
		System.out.println("Test1 execute");
	}
	@Test(groups = "demo1")
	public void Test2() {
		System.out.println("Test2 execute");
	}

}
