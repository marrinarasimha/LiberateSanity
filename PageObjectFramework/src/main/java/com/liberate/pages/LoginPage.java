package com.liberate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {
	
	@FindBy(id="login:userName")
	WebElement username;
	
	@FindBy(id="login:userPassword")
	WebElement password;
	
	@FindBy(id="login:loginButtonImg")
	WebElement login;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	

	public LoginPage loginAs(String username,String password)
	
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.login.click();
		return new LoginPage(driver);
	}
	



		

	
}
