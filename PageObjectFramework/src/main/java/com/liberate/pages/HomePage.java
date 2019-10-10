package com.liberate.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
	
	@FindBy(xpath="//span[@id='headerForm:_t45']")
	WebElement loggedinuser;
	
	@FindBy(linkText="Customer Care")
	WebElement CustomerCare;
	
	@FindBy(linkText="Logout")
	WebElement LogOut;
	
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public String getUserName()
	{
		return this.loggedinuser.getText();
	}
	
	public HomePage clickCustomerCare()
	{
		this.CustomerCare.click();
		return new HomePage(driver);
	}
	
	public HomePage clickLogout()
	{
		this.LogOut.click();
		return new HomePage(driver);
		
	}

	

}
