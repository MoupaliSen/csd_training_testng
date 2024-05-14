package Learn.TestNg.Grouping;

import org.testng.annotations.Test;

/*
 loginByEmail -- sanity & regression
 loginByfacebook -- sanity
  loginByTwitter -- sanity
  
  signupbyemail -- sanity & regression
  signupbyfacebbook -- regression
  signupbytwitter -- regression
  
  paymentinruppess -- sanity & regression
  paymentindollar -- sanity
  paymentReturnbyBank -- regression
 */
 

public class Grouping {
	
	@Test(priority=1,groups = {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email ");
	}
	
	@Test(priority=2,groups = {"sanity"})
	void loginByfacebook()
	{
		System.out.println("this is login by facebook ");

	}
	@Test(priority=3,groups = {"sanity"})
	void loginByTwitter()
	{
		System.out.println("this is login by twitter ");

	}
	
	@Test(priority=4,groups = {"sanity","regression"})
	void signupbyemail()
	{
		System.out.println("this is sign up by email ");

	}
	@Test(priority=5,groups = {"regression"})
	void signupbyfacebbook()
	{
		System.out.println("this is signup by facebook ");

	}
	
	@Test(priority=6,groups = {"regression"})
	void signupbytwitter()
	{
		System.out.println("this is twitter by sign up by twitter ");

	}
	
	@Test(priority=7,groups = {"sanity","regression"})
	void paymentinruppess()
	{
		System.out.println("this is payment  ruppees ");

	}
	
	@Test(priority=8,groups = {"sanity"})
	void paymentindollar()
	{
		System.out.println("this is dollar payment ");

	}
	
	@Test(priority=9,groups = {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("this is payment return ");

	}
}
