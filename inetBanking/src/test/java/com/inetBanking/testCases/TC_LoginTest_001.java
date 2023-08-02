package com.inetBanking.testCases;


import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	// static Logger log= Logger.getLogger(TC_LoginTest_001.class.getName());

	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("URL is opened");
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(username);
		logger.info("User name is entered");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.clickLogin();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

	}

