package datadrivenfw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Login_id {
	
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
	@Test(dataProvider = "loginData")
	public void loginWithdata(String uname,String pword) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys(uname);
		
		WebElement Pasword = driver.findElement(By.id("txtPassword"));
		Pasword.sendKeys(pword);
		
		
		WebElement loginbtn = driver.findElement(By.id("btnLogin"));
		loginbtn.click();
		
		
		
		driver.quit();
	}
}
