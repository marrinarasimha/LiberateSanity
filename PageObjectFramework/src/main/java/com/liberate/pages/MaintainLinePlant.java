package com.liberate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaintainLinePlant extends PageBase {

	public MaintainLinePlant(WebDriver driver) {
		super(driver);
		
	}
	public String SuccessMsg=null;
	@FindBy(linkText="Networks")
	WebElement Networks;
	@FindBy(linkText="Network Maintenance")
	WebElement NetworkMaintenance;
	@FindBy(xpath="//*[@name='maintainLinePlant:areaCode']")
	WebElement selectExchangeArea;
	@FindBy(xpath="//*[@name='maintainLinePlant:mlp_selectonemenu_plantItemAbbr1']")
	WebElement selectPlantType;
	@FindBy(xpath="//*[@name='maintainLinePlant:mlp_inputtxt_plantItemNo1']")
	WebElement enterPlantNumber;
	@FindBy(xpath="//input[@value='New']")
	WebElement NewButton;
	@FindBy(xpath="//*[@name='maintainLinePlant:mlp_selectonemenu_cstPliPlantItemStatus4']")
	WebElement selectStatus;
	@FindBy(xpath="//*[@name='maintainLinePlant:mlp_selectonemenu_cstPliDistrictCode3']")
	WebElement selectDistrict;
	@FindBy(xpath="//input[@value='Accept']")
	WebElement AcceptButton;
	@FindBy(xpath="//span[contains(text(),'Operation Successfully Completed')]")
	WebElement msgtxt;
	@FindBy(xpath="//input[@value='OK']")
	WebElement OkButton;
	
	public MaintainLinePlant createLinePlant(String exchange, String planttype, String plantnum, String status, String district)
	{
		this.Networks.click();
		this.NetworkMaintenance.click();
		this.selectExchangeArea.sendKeys(exchange);
		this.selectPlantType.sendKeys(planttype);
		this.enterPlantNumber.sendKeys(plantnum);
		this.NewButton.click();
		this.selectStatus.sendKeys(status);
		this.selectDistrict.sendKeys(district);
		this.AcceptButton.click();
		SuccessMsg=this.msgtxt.getText();
		this.OkButton.click();
		return new MaintainLinePlant(driver);
		
	}
	
	
	
}
