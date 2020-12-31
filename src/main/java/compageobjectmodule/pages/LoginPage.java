package compageobjectmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageobjectmodule.base.TestBase;

public class LoginPage extends TestBase
{
	
	
	@FindBy(id="txtUsername")
	WebElement userTextbox;
	
	
	@FindBy(name="txtPassword")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotPassword;
	
	@FindBy(id="logInPanelHeading")
	WebElement LoginPanel;
	
	@FindBy(xpath="//b[text()='Recruitment']")
	WebElement RecruitTab;
	
	
	
	public WebElement RecruitmentMenu;
	
	public LoginPage()
	{
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public HomePage verifyLogin()
	{
		userTextbox.sendKeys("Admin");
		passwordTextbox.sendKeys("admin123");
		loginBtn.click();
		
		return new HomePage();
	}

}
