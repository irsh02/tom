package datadrivenfw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class correctusername {
	@Test
	@Parameters({"Username","Password"})
	public void loginWithCorrectUsername(String uname,String pword) {
		System.setProperty("webdriver.chrome.driver", "D:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys(uname);
		
		WebElement Pasword = driver.findElement(By.id("txtPassword"));
		Pasword.sendKeys(pword);
		
		driver.quit();
	
	
	}

}
