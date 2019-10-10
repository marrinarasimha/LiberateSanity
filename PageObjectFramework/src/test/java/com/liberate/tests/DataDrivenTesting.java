package com.liberate.tests;

import com.liberate.util.DataDrivenManager;

public class DataDrivenTesting {

	public static void main(String[] args) {
		DataDrivenManager ddm=new DataDrivenManager("C:\\Users\\namarri\\Desktop\\SeleniumFiles\\MasterTestDataFile.xlsx");
		Object[][] TestData=ddm.getTestCaseDataSets("TestCaseDataSets", "MaintainDepositReasonTest");
		
		for(Object[] datarow:TestData){
			for(Object datacell:datarow){
				System.out.print(datacell.toString()+"\t");
			}
			System.out.println();
		}

	}

}
