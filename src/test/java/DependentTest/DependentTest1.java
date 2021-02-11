package DependentTest;



import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import TestNGListerners.CustomListerners;

@Listeners(CustomListerners.class)

public class DependentTest1 {
 
	 @Test(groups = "openBrowser" )
	 public void openBrowser() {
		 System.out.println("Browser is Open");
	 }
	 
	 @Test(dependsOnMethods  = "openBrowser" )
	 public void doSignIn() {
		 System.out.println("Sign In done");
	     Assert.fail();
	//	 throw new SkipException("This test has been skip");
	 }
	 
	 @Test(dependsOnMethods = "doSignIn" )
	 public void doProfileCheck() {
		System.out.println("Profile check is done");
	 }
	 
	 @Test(dependsOnMethods = "doProfileCheck" )
	 public void doLogOt() {
		 System.out.println("LogOut is done");
	 }
	 
	 @Test(dependsOnMethods = "doLogOt")
	 public void closeBrowser() {
		 System.out.println("Browser is close");
	 }
}












