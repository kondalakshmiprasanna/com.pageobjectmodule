package compageobjectmodule.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageobjectmodule.base.TestBase;

import compageobjectmodule.utility.Util;

public class RecruitmentPage extends TestBase
{
	@FindBy(id="candidateSearch_jobTitle")  
	public WebElement jobtitle;
	
	@FindBy(id="candidateSearch_jobVacancy")
	WebElement jobvacancy;
	
	@FindBy(id="candidateSearch_hiringManager")
	WebElement hiringManager;
	
	@FindBy(id="candidateSearch_candidateName")
	WebElement candidateName;
	
	@FindBy(id="candidateSearch_keywords")
	WebElement keywords;
	
	@FindBy(xpath="//input[@id='candidateSearch_fromDate']")
	WebElement fromDate;
	
	@FindBy(id="candidateSearch_modeOfApplication")
	WebElement modeOfApplication;
	
	@FindBy(xpath="//input[@id='btnSrch']")
	WebElement searchbutton;
	
	@FindBy(xpath="//input[@id='btnRst']")
	WebElement resetbutton;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addbutton;
	
	
	public RecruitmentPage()
	{
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void selectJobTitle()
	{
		Util.dropdown_SelectbyIndex(jobtitle, 1);
	}
	
	
	public void selectJobVancey()
	{
		Util.dropdown_SelectbyIndex(jobvacancy, 1);
	}


	
}
