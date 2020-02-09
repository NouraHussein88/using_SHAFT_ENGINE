package objectModels.gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

public class EditCustomer {
	private WebDriver browserObject;
	private String urlForNavigation = "http://www.demo.guru99.com/V4/manager/EditCustomer.php";
	//Element Locator
	private By customerName = By.name("name");
	private By gender= By.name("gender");
	private By customerID=By.name("cusid");
	private By submitButton =By.name("AccSubmit");
	private By city=By.name("city");
	private By state=By.name("state");
	private By pinCode=By.name("pinno");
	private By email=By.name("emailid");
	private By submitButton2=By.name("sub");

	public EditCustomer(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	public void navigteToEditCustomerPage() 
	{
		BrowserActions.navigateToURL(browserObject, urlForNavigation);	
	}

	public void checkCanClickOnEditCustomerdata(String CustomerID)
	{
		ElementActions.type(browserObject,customerID, CustomerID);
		ElementActions.click(browserObject,customerID);
		ElementActions.click(browserObject, submitButton);
	}
	public void checkCanEditOnCustomerData(String name,String Gender,String City,String State,String PinCode,String Email)
	{
		ElementActions.type(browserObject, customerName,name);
		ElementActions.click(browserObject, customerName);
		Assertions.assertElementAttribute(browserObject, customerName, "Text", name, AssertionComparisonType.EQUALS,
				AssertionType.POSITIVE);
		
		ElementActions.type(browserObject,gender, Gender);
		ElementActions.click(browserObject, gender);
		Assertions.assertElementAttribute(browserObject, gender, "Text", Gender, AssertionComparisonType.EQUALS,
				AssertionType.POSITIVE);
		
		ElementActions.type(browserObject,city, City);
		ElementActions.click(browserObject, city);
		Assertions.assertElementAttribute(browserObject, city, "Text", City, AssertionComparisonType.EQUALS,
				AssertionType.POSITIVE);
		
		ElementActions.type(browserObject,state, State);
		ElementActions.click(browserObject, state);
		Assertions.assertElementAttribute(browserObject, state, "Text", State, AssertionComparisonType.EQUALS,
				AssertionType.POSITIVE);
		
		ElementActions.type(browserObject,pinCode, PinCode);
		ElementActions.click(browserObject, pinCode);
		Assertions.assertElementAttribute(browserObject, pinCode, "Text", PinCode, AssertionComparisonType.EQUALS,
				AssertionType.POSITIVE);
		
		ElementActions.type(browserObject,email, Email);
		ElementActions.click(browserObject, email);
		Assertions.assertElementAttribute(browserObject, email, "Text",Email, AssertionComparisonType.EQUALS,
				AssertionType.POSITIVE);
		
		ElementActions.click(browserObject, submitButton2);
	}


}
