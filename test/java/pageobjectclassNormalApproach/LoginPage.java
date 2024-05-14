package pageobjectclassNormalApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By log_img_loc= By.xpath("//img[@alt='']");
	By txt_username_loc = By.name("username");
	By txt_password_loc = By.name("password");
	By btn_submit_loc = By.xpath("//");
	
	
	
	//action methods
	
	public void setUserName(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);

	}
	public void clickSubmit()
	{
		driver.findElement(btn_submit_loc).click();
	}
	public boolean checkLogoPresence()
	{
		boolean status = driver.findElement(log_img_loc).isDisplayed();
		return status;
	}

}
