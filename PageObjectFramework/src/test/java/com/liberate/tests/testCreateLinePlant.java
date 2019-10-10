package com.liberate.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.liberate.pages.MaintainLinePlant;
import com.liberate.util.DataDrivenManager;

public class testCreateLinePlant extends TestBase {

	@Test(dataProvider="dataprovider")
	public void testCreatelineplant()
	{
		MaintainLinePlant mlp=new MaintainLinePlant(driver);
		mlp.createLinePlant();
	}
	
	@DataProvider
	public Object[][] dataprovider()
	{
		DataDrivenManager ddm=new DataDrivenManager("C:\\Users\\namarri\\Desktop\\SeleniumFiles\\MasterTestDataFile.xlsx");
		Object[][] TestData=ddm.getTestCaseDataSets("TestCaseDataSets", "createLinePlantTest");
		return TestData;
	}

}
