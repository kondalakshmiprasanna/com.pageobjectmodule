package com.pageobjectmodule.TestScript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjectmodule.base.TestBase;

import compageobjectmodule.pages.DashboardPage;
import compageobjectmodule.pages.HomePage;
import compageobjectmodule.pages.LoginPage;
import compageobjectmodule.pages.RecruitmentPage;

public class LoginTestScript extends TestBase
{
	
	LoginPage loginpage;
	
	HomePage  homepage;
	
	@BeforeTest
	public void setUp()
	{
		openBrowser();
		
		loginpage=new LoginPage();
		
		//req=new Requirement();
	}
	
	@Test(priority=1)
	public void validateTitle()
	{
		String actualTitle=loginpage.verifyTitle();
		
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void validateUrl()
	{
		String actualUrl=loginpage.verifyUrl();
		Assert.assertEquals(actualUrl, "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test(priority=3)
	public void validateLogin()
	{
		String expRes="Welcome Paul";
		
		homepage=loginpage.verifyLogin();
		
		String actualtext=driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).getText();
		
		Assert.assertEquals(actualtext, expRes);
		
		
	}
	
	
	

}
