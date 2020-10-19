package org.qsp.testngDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_test {
	@DataProvider
	public String[][] Data_P()
    {
		String arr[][]=new String[3][2];
		arr[0][0] = "Anjali";
		arr[0][1]="Kshirsagar";
		arr[1][0]="Sneha";
		arr[1][1]="Dixit";
		arr[2][0]="Vinita";
		arr[2][1]="Taware";
		
		return arr;
		
    }
	@Test(dataProvider = "Data_P")
	public void F1(String firstName,String lastName)
	{
		System.out.println(firstName + " : " + lastName);
	}

}
