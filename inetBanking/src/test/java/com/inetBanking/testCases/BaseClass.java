package com.inetBanking.testCases;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.*;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL= readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password= readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger ;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException
	{
		
		
		//System.getProperty("user.dir"+"//Drivers//chromedriver"
		//"/Users/tcs/Downloads/chromedriver_mac64 (3)/chromedriver"
	/*	String filename = "/Users/tcs/Desktop/Practice/inetBanking/src/test/java/com/inetBanking/testData/CustomersDetail.xlsx";  
		FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		try {
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("Excel file has been generated successfully.");  */
		
		logger= Logger.getLogger(BaseClass.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome"))
		{
			  
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");  // Disable all notifications
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-web-security");
		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
		driver= new ChromeDriver();
		}
		driver.get(baseURL);
	Thread.sleep(5000);
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"/Screenshots"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomString()
	{
		String ranString=RandomStringUtils.randomAlphabetic(8);
		return ranString;
	}
	
	public String randomNum()
	{
		String ranNum=RandomStringUtils.randomAlphabetic(4);
		return ranNum;
	}
}
