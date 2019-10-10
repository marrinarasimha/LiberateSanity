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

public class LogoutTest extends TestBase {

	
	@Test
	public void testLogout() throws InterruptedException
	{
		Thread.sleep(2000);
		homepg.clickLogout();
		Thread.sleep(2000);
		String actualpagetitle=homepg.getTitle();
		String expectedtitle="Liberate :: Login";
		Assert.assertEquals(actualpagetitle, expectedtitle, "Error: Logout failed");
		
	}
	
	
	


}
