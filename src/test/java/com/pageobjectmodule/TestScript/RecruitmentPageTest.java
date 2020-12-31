package com.pageobjectmodule.TestScript;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjectmodule.base.TestBase;

import compageobjectmodule.pages.HomePage;
import compageobjectmodule.pages.LoginPage;
import compageobjectmodule.pages.RecruitmentPage;
import compageobjectmodule.utility.Util;

public class RecruitmentPageTest extends TestBase {
	
	LoginPage loginpage;
	
	HomePage homepage;
	
	RecruitmentPage recruitmentpage;
	
	
	@BeforeTest
	public void setUp()
	{
		openBrowser();
		
		recruitmentpage=new RecruitmentPage();
		
		homepage=new HomePage();
		
		loginpage=new LoginPage();
		
		homepage=loginpage.verifyLogin();
	}
	
	@Test(priority=1)
	public void validateRecruitmentMenu()
	{
		Util.implicit_Wait(30);
		recruitmentpage=homepage.clickonRecruitment();
	}
	
	@Test(priority=2, enabled=false)
	public void validateJobTitle()
	{
		Util.implicit_Wait(30);
		Util.dropdown_SelectbyIndex(recruitmentpage.jobtitle, 1);
	}
	
	@Test(priority=3)
	public void validateJobTitle1()
	{
		recruitmentpage.selectJobTitle();
	}
	
	@Test(priority=4)
	public void validateJobVacancy()
	{
		Util.implicit_Wait(30);
		recruitmentpage.selectJobVancey();
	}


}
