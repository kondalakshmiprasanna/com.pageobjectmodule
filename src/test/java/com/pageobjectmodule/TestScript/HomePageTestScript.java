package com.pageobjectmodule.TestScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjectmodule.base.TestBase;

import compageobjectmodule.pages.HomePage;
import compageobjectmodule.pages.LoginPage;
import compageobjectmodule.pages.RecruitmentPage;

public class HomePageTestScript extends TestBase
{
	
	LoginPage loginpage;
	
	HomePage homepage;
	
	RecruitmentPage recruitmentpage;
	
	
	@BeforeTest
	public void setUp()
	{
		openBrowser();
		
		recruitmentpage=new RecruitmentPage();
		
		loginpage=new LoginPage();
		
		homepage=loginpage.verifyLogin();
		
	}
	
	@Test
	public void validateRecruitmentMenu()
	{
		recruitmentpage=homepage.clickonRecruitment();
	}

}
