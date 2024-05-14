package Learn.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Secondtest {
	
	WebDriver driver;
	@BeforeClass
	//@Test(priority=100)
	void openApp() throws InterruptedException
	{
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		 Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=50)
	void login()
	{
		driver.findElement(By.name("email")).sendKeys("Admin");
		driver.findElement(By.name("pass")).sendKeys("admin123");
		//Xndriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@AfterClass
	@Test(priority=100)
	void closeApp()
	{
		driver.quit();
	}

}
