package compageobjectmodule.utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.pageobjectmodule.base.TestBase;

public class Util extends TestBase
{
	static Alert alt;
	
	static Select sel;
	
	public static Timeouts implicit_Wait(int time)
	{
		Timeouts imp_Time=driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		
		return imp_Time;
	}
	
	public static void win_Max()
	{
		driver.manage().window().maximize();
	}
	
	
	public static void Alert_Okbtn()
	{
		alt=driver.switchTo().alert();
		
		alt.accept();
	}
	
	public static void Alert_Canclebtn()
	{
		alt=driver.switchTo().alert();
		
		alt.dismiss();
	}
	
	public static String Alert_getText()
	{
		alt=driver.switchTo().alert();
		
		return  alt.getText();
	}
	
	public static void Alert_Sendkeys(String text)
	{
		alt=driver.switchTo().alert();
		
		alt.sendKeys(text);
	}
	
	public static void dropdown_SelectbyValue(WebElement ele, String value)
	{
		
		sel=new Select(ele);
		
		sel.selectByValue(value);
	}
	
	public static void dropdown_SelectbyVisibletext(WebElement ele, String value)
	{
		sel=new Select(ele);
		
		sel.selectByVisibleText(value);
	}
	
	public static void dropdown_SelectbyIndex(WebElement ele, int index)
	{
		sel=new Select(ele);
		
		sel.selectByIndex(index);
	}
	
	public static void SwitchtoFrames_index(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void SwitchtoFrames_String(String framename)
	{
		driver.switchTo().frame(framename);
	}
	
	public static void SwitchtoFrames_WebElement(WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	
	public static void Takes_Screenshot(String filename)
	{
		try
		{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File(".\\Screenshot\\"+System.currentTimeMillis()+".jpg"));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
