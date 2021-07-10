package testng_learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	WebDriver driver;
	long starttime;
	long endtime;
	
	
	@BeforeSuite
	public void launchbrowser(){
		starttime=System.currentTimeMillis();
		driver= new ChromeDriver();
		
		
	}
	
	@Test
	public void opengoogle(){
		driver.get("http://www.google.com");
	}
	@Test
	public void openbing(){
		driver.get("http://www.bing.com");
	}
	@Test
	public void openyahoo(){
		driver.get("http://www.yahoo.com");
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime= System.currentTimeMillis();
		long totaltime= endtime - starttime ;
		System.out.println("Total time take: " + totaltime);
	}
	
}
