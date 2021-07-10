package testng_learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class ParallelTesting {
	 WebDriver s;
	 
	
		@BeforeMethod
	     public void driverproperty() {
			     
				 s=new ChromeDriver(); 
	     }
	     
	     
		@Test
		public void opengoogle() throws InterruptedException{
			s.get("https://www.google.co.in");
			
		}
		
		@Test
		public void openbing() throws InterruptedException{
			s.get("https://www.bing.com");
		}
		
		@AfterTest
		public void close() {
			s.quit();
			
		}

		
}
