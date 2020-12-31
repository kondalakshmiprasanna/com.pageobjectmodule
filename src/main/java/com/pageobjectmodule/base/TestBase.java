package com.pageobjectmodule.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import compageobjectmodule.utility.Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	
	public static WebDriver driver;
	
	public File f;
	
	public FileInputStream fis;
	
	public Properties pro;
	
	public TestBase()
	{
		try
		{
		f=new File(".\\src\\main\\java\\compageobjectmodule\\config\\Configuration.properties");
		
		fis=new FileInputStream(f);
		
		pro=new Properties();
		
		pro.load(fis);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void openBrowser()
	{
		String browser=pro.getProperty("browsername");
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			
			driver=new InternetExplorerDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		
		else
		{
			System.out.println("Given browser name is wrong");
		}
		
		
		driver.get(pro.getProperty("url"));
		
		Util.win_Max();
		
		Util.implicit_Wait(45);
		
				
	}
	
	
	

}
