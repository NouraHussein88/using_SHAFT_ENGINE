package objectModels.gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

public class Login {

	private WebDriver browserObject;
	private String urlForNavigation = "http://www.demo.guru99.com/V4/";
	private String pageTitle = "Guru99 Bank Manager HomePage";

	private By UserName   = By.name("uid");
	private By Password   = By.name("password");
	private By LoginButton= By.name("btnLogin");

	public Login(WebDriver browserObject)
	{
		this.browserObject=browserObject;
	}
	public void navigateToURL()
	{
		BrowserActions.navigateToURL(browserObject,urlForNavigation);
	}
	public void LoginSuccessfuly(String usernameData ,String passwordData)
	{
		ElementActions.type(browserObject, UserName, usernameData);
		ElementActions.typeSecure(browserObject, Password, passwordData);
		ElementActions.keyPress(browserObject,LoginButton, Keys.ENTER);
	}

	public void assertPageTitleIsCorrect() 
	{
		Assertions.assertBrowserAttribute(browserObject, "Title", pageTitle, AssertionComparisonType.EQUALS,AssertionType.POSITIVE);
	}

}