package pageobjectclassPageFactoryApproach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//whatever driver is using here this is applicable for all these elements at the time of identifying
	}
	
	//WebElements locators + identification
	//@FindBy(xpath="//..............")
	@FindBy(how=How.XPATH,using ="//............") //another approach of xpath
	WebElement img_logo;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath="//button")
	WebElement btn_submit;
	
//	@FindBy(tagName="a")
//	List<WebElement> links;
	
	
	
	
	
	
	//action methods
	
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void clickSubmit()
	{
		btn_submit.click();
	}
	public boolean checkLogoPresence()
	{
		boolean status = driver.findElement(log_img_loc).isDisplayed();
		return status;
	}


}
