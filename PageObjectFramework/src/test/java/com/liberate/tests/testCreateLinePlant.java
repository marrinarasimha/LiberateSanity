package com.liberate.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.liberate.pages.MaintainLinePlant;
import com.liberate.util.DataDrivenManager;

public class testCreateLinePlant extends TestBase {

	@Test(dataProvider="dataprovider")
	public void testCreateLinePlants(String exchange,String planttype,String plantnum,String status,String district) throws InterruptedException
	{
		Thread.sleep(3000);
		MaintainLinePlant mlp=new MaintainLinePlant(driver);
		mlp.createLinePlant(exchange,planttype,plantnum,status,district);
		String actualmsg=mlp.SuccessMsg;
		String expectedmsg="Operation Successfully Completed";
		Assert.assertEquals(actualmsg, expectedmsg, "Error:Deposit reason creation failesd");
	}
	
	

}
