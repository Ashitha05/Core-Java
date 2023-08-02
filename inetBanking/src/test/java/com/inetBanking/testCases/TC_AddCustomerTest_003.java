package com.inetBanking.testCases;

import com.inetBanking.pageObjects.AddNewCustomer;
import com.inetBanking.pageObjects.LoginPage;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

@Test
public class TC_AddCustomerTest_003 extends BaseClass{

	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		AddNewCustomer ac=new AddNewCustomer(driver);
		ac.clickAddNewCustomer();
		logger.info("Providing customer details....");
		ac.setCustName("Nidhi");
		//ac.setGenderFemale();
		ac.setDob("10", "12", "2002");
		Thread.sleep(3000);
		ac.setAddress("INDIA");
		ac.setCity("Bangalore");
		ac.setState("Karnataka");
		ac.setPin("574235");
		ac.setMobileNum("6543245637");
		ac.setEmailid(randomString()+"@gmail.com");
		ac.setPassword("Test");
		ac.clickSubmit();
		Thread.sleep(3000);
		
		logger.info("Validation started");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Testcase passed......");
		}
		else
		{
			logger.info("Testcase failed......");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
		
	}
	
	
}
