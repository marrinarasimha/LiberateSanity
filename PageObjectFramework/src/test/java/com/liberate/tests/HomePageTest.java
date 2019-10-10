package com.liberate.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.liberate.pages.HomePage;
import com.liberate.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	
	@Test(priority=0)
	public void testHomePaeTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		String actualtitle=homepg.getTitle();
		String expectedtitle="Liberate (HAM)";
		Assert.assertEquals(actualtitle, expectedtitle, "Error:Title for Login page is not correct");
	}
			
	@Test(priority=1)
	public void testLoginUsername()
	{
		String actualUserName=homepg.getUserName();
		String expectedUserName="libadmin";
		Assert.assertEquals(actualUserName, expectedUserName, "Error: Username did not match, unsuccessful login");
	}
	
	@Test(priority=2)
	public void clickCustomerCare() throws InterruptedException
	{
		Thread.sleep(2000);
		homepg.clickCustomerCare();
	}
	
	

}
