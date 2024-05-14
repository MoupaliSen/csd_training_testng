package pageobjectclassPageFactoryApproach;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectclassNormalApproach.LoginPage;

public class loginTest {
	//only validation part include
		WebDriver driver;
		LoginPage lp;
		
		@BeforeClass
		void setup()
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
		}
		@Test(priority=1)
		void testLogo()
		{
			lp = new LoginPage(driver);
			lp.checkLogoPresence();
			Assert.assertEquals(lp.checkLogoPresence(), true);//validations
			
			
		}
		@Test(priority=2)
		void testlogin()
		{
			lp.setUserName("Admin");
			lp.setPassword("admin123");
			lp.clickSubmit();
			
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		}
		
		@AfterClass
		void tearDown()
		{
			driver.quit();
		}

}
