package compageobjectmodule.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageobjectmodule.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[@id='welcome']")
	WebElement WelcomeDetail;
	
	
	@FindBy(xpath="//b[text()='Dashboard']")
	WebElement DashboardMenu;
	
	
	@FindBy(xpath="//b[text()='My Info']")
	WebElement MyInfoMenu;
	
	@FindBy(xpath="//b[text()='Recruitment']")
	WebElement RecruitmentMenu;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public DashboardPage clickonDashboard()
	{
		DashboardMenu.click();
		
		return new DashboardPage();
	}
	
	
	public RecruitmentPage clickonRecruitment()
	{
		RecruitmentMenu.click();
		
		return new RecruitmentPage();
	}

}
