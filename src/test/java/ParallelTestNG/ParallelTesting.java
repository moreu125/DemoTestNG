package ParallelTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {

	public static WebDriver driver;

	@Parameters("browserName")
	@BeforeMethod
	public void setup(@Optional("Chrome") String browserName) {
		if(driver==null) {if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}
		}
		
		driver.manage().window().maximize();
	}

	@Test
	public void googleTest() {
		driver.get("https://www.google.com/");
	//	captureScreenShot("googleTest");
	}

	@Test
	public void facebookTest() {
		driver.get("https://www.facebook.com/");
		//captureScreenShot("faceBookTest");

	}

	@AfterMethod
	public void tearDown() {
		if(driver != null) {
		driver.quit(); 
		} 
	}

	private void captureScreenShot(String string) {
		// TODO Auto-generated method stub
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".\\ScreenShot\\" + string + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
