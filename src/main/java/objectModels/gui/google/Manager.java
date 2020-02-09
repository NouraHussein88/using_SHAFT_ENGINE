package objectModels.gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

public class Manager {
	
	private WebDriver browserObject;
	private String WelcomeMessage = "Welcome To Manager's Page of Guru99 Bank";
	
	private By Message   = By.xpath("//marquee[@class='heading3']");
	private By ManagerID   = By.xpath("//tr[@class='heading3']");
	
	public Manager(WebDriver browserObject)
	{
		this.browserObject=browserObject;
	}
	public void assertWelcomeMessageIsCorrect() 
	{
		Assertions.assertElementAttribute(browserObject, Message , "Text", WelcomeMessage, AssertionComparisonType.CONTAINS, AssertionType.POSITIVE);
		
	}
	public void assertManagerIdIsCorrect(String ExpectedValueOfManagerID)
	{
		
		Assertions.assertElementAttribute(browserObject, ManagerID , "Text", ExpectedValueOfManagerID, AssertionComparisonType.CONTAINS, AssertionType.POSITIVE);
	}
}
