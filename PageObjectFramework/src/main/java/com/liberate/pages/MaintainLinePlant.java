package com.liberate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaintainLinePlant extends PageBase {

	public MaintainLinePlant(WebDriver driver) {
		super(driver);
		
	}
	
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
	
	public MaintainLinePlant createLinePlant()
	{
		this.Networks.click();
		this.NetworkMaintenance.click();
		this.selectExchangeArea.sendKeys("BOT");
		this.selectPlantType.sendKeys("DP");
		this.enterPlantNumber.sendKeys("1133");
		this.NewButton.click();
		this.selectStatus.sendKeys("S");
		this.selectDistrict.sendKeys("5");
		this.AcceptButton.click();
		
		return new MaintainLinePlant(driver);
		
	}
	
	
	
}
