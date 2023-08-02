package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	WebDriver ldriver;
	
	public AddNewCustomer(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement addNewCustomer;
	
	@FindBy(name="name")
	WebElement customerName;
	
	@FindBy(xpath="//input[@name='f']")
	WebElement fgender;
	
	@FindBy(xpath="//input[@name='m']")
	WebElement mgender;
	
	@FindBy(id="dob")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement submitBtn;

	@FindBy(xpath="//input[@name='res']")
	WebElement resetBtn;
	
	public void clickAddNewCustomer()
	{
		addNewCustomer.click();
	}
	
	public void setCustName(String cname)
	{
		customerName.sendKeys(cname);
	}
	
	public void setGenderMale()
	{
		mgender.click();
	}
	
	public void setGenderFemale()
	{
		fgender.click();
	}
	
	public void setDob(String mm, String dd, String yyyy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);
	}
	
	public void setAddress(String addr)
	{
		address.sendKeys(addr);
	}
	
	public void setCity(String custCity)
	{
		city.sendKeys(custCity);
	}
	
	public void setState(String custState)
	{
		state.sendKeys(custState);
	}
	
	public void setPin(String pinnum)
	{
		pin.sendKeys(pinnum);
	}
	
	public void setMobileNum(String mobileNum)
	{
		mobileNumber.sendKeys(mobileNum);
	}
	
	public void setEmailid(String email)
	{
		emailid.sendKeys(email);
	}
	

	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		submitBtn.click();
	}
	
	public void clickReset()
	{
		resetBtn.click();
	}
}
