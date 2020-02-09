package objectModels.gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

public class NewAccount {
	private WebDriver browserObject;
	private String urlForNavigation = "http://www.demo.guru99.com/V4/manager/addAccount.php";
	//page element locator 
	private By customerID = By.name("cusid");
	private By savingsType= By.xpath("//option[@value='Savings']");
	private By currentType= By.xpath("//option[@value='Current']");
	private By deposite=By.name("inideposit");
	private By submitButton=By.name("button2");
    private By AccountID=By.xpath("//td[contains(text(),'Account ID')]/following-sibling::td");
    private By CustomerID=By.xpath("//td[contains(text(),'Customer ID')]/following-sibling::td");

	public NewAccount(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}

	public void navigteToCreatNewAccountPage() 
	{
		BrowserActions.navigateToURL(browserObject, urlForNavigation);	
	}
	
	public void  addNewAccount(String custID,String AccountType,String depositeValue)
	{
		ElementActions.type(browserObject,customerID,custID);
		ElementActions.click(browserObject,customerID);
		switch (AccountType) 
		{
		case "Savings": 
			ElementActions.click(browserObject,savingsType);
			break;
		case "Current":	
			ElementActions.click(browserObject,currentType);
			break;
		}
		ElementActions.type(browserObject, deposite, depositeValue);
		ElementActions.click(browserObject, deposite);
		ElementActions.click(browserObject, submitButton);
		ElementActions.getText(browserObject, AccountID);
		Assertions.assertElementAttribute(browserObject, CustomerID, "text", custID,AssertionComparisonType.CONTAINS, AssertionType.POSITIVE);
	}
}
