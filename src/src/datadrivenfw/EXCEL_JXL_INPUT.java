package datadrivenfw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EXCEL_JXL_INPUT {
	
	WebDriver driver;

	String[][] data= {
			{"Admin","admin123"},
			{"Admin1","admin123"},
			{"Admin","admin@13"},
			{"Admin12","admin@12"}
			
	};

	
	@DataProvider(name="loginData")
	public String[][] logindataprovider() {
	return data;
	}

	
	@BeforeMethod
	public void browserproperty() {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\selinium\\chromedriver_win32\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	public void aftermethod() { 
		
		driver.quit();
	}
	
	@Test(dataProvider = "logindata")
	public void loginWithPARAMETERS(String uname,String pword) {
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys(uname);
		
		WebElement Pasword = driver.findElement(By.id("txtPassword"));
		Pasword.sendKeys(pword);
		
		
}
}
