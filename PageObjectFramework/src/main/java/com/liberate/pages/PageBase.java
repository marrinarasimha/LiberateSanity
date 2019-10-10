package com.liberate.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	WebDriver driver;
	Properties testconfig;
	public PageBase(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	testconfig=new Properties();
	try {
		testconfig.load(new FileInputStream("testconfig.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
}
