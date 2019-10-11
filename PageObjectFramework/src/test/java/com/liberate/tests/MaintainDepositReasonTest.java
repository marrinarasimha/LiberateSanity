package com.liberate.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.liberate.pages.DepositReason;
import com.liberate.util.DataDrivenManager;

public class MaintainDepositReasonTest extends TestBase {
	
	@Test(dataProvider="dataprovider")
	public void testMaintainDepositReason(String depositreasoncode,String depositdescription,String months) throws InterruptedException
	{
		Thread.sleep(3000);
		DepositReason dr=new DepositReason(driver);
		dr.createDespositReason(depositreasoncode,depositdescription,months);
		String actualmsg=dr.SuccessMsg;
		String expectedmsg="Operation Successfully Completed";
		Assert.assertEquals(actualmsg, expectedmsg, "Error:Deposit reason creation failed");
	}
	
	

}
