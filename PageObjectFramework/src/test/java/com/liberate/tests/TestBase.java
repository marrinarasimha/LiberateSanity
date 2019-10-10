package com.liberate.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.liberate.pages.HomePage;
import com.liberate.pages.LoginPage;
import com.liberate.util.DataDrivenManager;
import com.liberate.util.WebDriverManager;

public class TestBase {

WebDriver driver;
HomePage homepg;
Properties testconfig;
	
	@BeforeMethod
	public void testSetUp() throws FileNotFoundException, IOException
	{
		testconfig=new Properties();
		testconfig.load(new FileInputStream("testconfig.properties"));
		driver=WebDriverManager.createDriver(testconfig.getProperty("browser"));
		driver.get(testconfig.getProperty("6.0URL2"));
		
		LoginPage loginpg=new LoginPage(driver);
		loginpg.loginAs("libadmin", "Ic3cr34m!");
		homepg=new HomePage(driver);
	
	}
	
	@AfterMethod
	public void testCleanUp() throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriverManager.quitDriver(driver);
	}
	

}
