package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	WebElement logoutbtn;
	
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	public void clickLogout()
	{
		logoutbtn.click();
	}
}
