package CreatingTestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
    @BeforeTest
    public void dataBaseConnectionSetup() {
    	System.out.println("Data Base connection is setup");
    }
    
    @AfterTest
    public void dataBaseConnectionClose() {
    	System.out.println("DataBase Connection is close");
    }
	@BeforeMethod
	public void setup() {
		System.out.println("Browser Launch");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Browser close");
	}
	
	@Test
	public void doLogin() {
		System.out.println("Executing Login Test");
	}
	
	@Test
	public void doUserReg() {
		System.out.println("Executing User Registeration");
	}
		
}
