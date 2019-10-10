package com.liberate.pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositReason extends PageBase {
	
	public String SuccessMsg=null;
	public DepositReason(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="//a/span[text()='Credit Control']")
	WebElement CreditControl;
	@FindBy(linkText="Deposit Maintenance")
	WebElement DepositMaintenance;
	@FindBy(linkText="Maintain Deposit Reason")
	WebElement MaintainDepositReason;
	@FindBy(xpath="//input[@value='New']")
	WebElement NewButton;
	@FindBy(name="maintdepreasonform:deposit_reason_code")
	WebElement deposit_reason_code;
	@FindBy(name="maintdepreasonform:description")
	WebElement description;
	@FindBy(name="maintdepreasonform:refund_duration_mths")
	WebElement refund_duration_mths;
	@FindBy(xpath="//input[@value='Accept']")
	WebElement AcceptButton;
	@FindBy(xpath="//*[text() = 'Operation Successfully Completed']")
	WebElement successmsg;
	
	public DepositReason createDespositReason(String depositreasoncode,String depositdescription,String months) throws InterruptedException
	{
		
		this.CreditControl.click();
		this.DepositMaintenance.click();
		this.MaintainDepositReason.click();
		this.NewButton.click();
		//this.deposit_reason_code.sendKeys(testconfig.getProperty("depositreasoncode"));
		//this.description.sendKeys(testconfig.getProperty("depositdescription"));
		//this.refund_duration_mths.sendKeys(testconfig.getProperty("durationmonths"));
		this.deposit_reason_code.sendKeys(depositreasoncode);
		this.description.sendKeys(depositdescription);
		this.refund_duration_mths.sendKeys(months.toString());
		this.AcceptButton.click();
		SuccessMsg=this.successmsg.getText();
		return new DepositReason(driver);
	}

}
