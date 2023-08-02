package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginTestDDT_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginTDD() {
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		if(alertIsPresent())
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
		
	}
	
	public boolean alertIsPresent()
	{
		try {
		driver.switchTo().alert();
		return true;
		}catch(Exception e)
		{
			return false;
		}
		
			
		
	}
	
	@DataProvider(name="LoginData")
	public String[][] dataLogin() throws Exception
	{
		String path= System.getProperty("users.dir")+"/src/test/java/com/inetBanking/testData/testData.xlsx";
		int rowcount= XLUtils.getRowCount(path, "Sheet1");
		int colcount= XLUtils.getCellCount(path, "Sheet1", rowcount);
		String[][] loginData=new  String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				loginData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
	}

}
