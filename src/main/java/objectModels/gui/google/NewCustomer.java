package objectModels.gui.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class NewCustomer 
{

	private WebDriver browserObject;
	private String urlForNavigation = "http://www.demo.guru99.com/V4/manager/addcustomerpage.php";
	//page element locator 
	private By customerName = By.name("name");
	private By maleGender= By.cssSelector("input[value='m']");
	private By femaleGender= By.cssSelector("input[value='f']");
	private By dateOfBirth = By.id("dob");
	private By address=By.name("addr");
	private By city=By.name("city");
	private By state=By.name("state");
	private By pinCode=By.name("pinno");
	private By mobileNumber=By.name("telephoneno");
	private By email=By.name("emailid");
	private By password=By.name("password");
	private By submitButton =By.name("sub");
	private By customerID=By.xpath("//table/tbody/tr[4]/td[2]");

	public NewCustomer(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}

	public void navigteToCreatNewCustomerPage() 
	{
		BrowserActions.navigateToURL(browserObject, urlForNavigation);	
	}

	public void creatNewCustomer(String CustomerName,String  Gender,String BirthDate,String Address, String City ,
			String State, String PinCode,String MobileNum ,String Email,String Pass)
	{
		ElementActions.type(browserObject,customerName, CustomerName);
		ElementActions.click(browserObject, customerName);
		switch (Gender) 
		{
		case "Male": 
			ElementActions.click(browserObject,maleGender);
			break;
		case "Female":	
			ElementActions.click(browserObject,femaleGender);
			break;
		}
		ElementActions.type(browserObject,dateOfBirth, BirthDate);
		ElementActions.click(browserObject, dateOfBirth);
		ElementActions.type(browserObject,address, Address);
		ElementActions.click(browserObject, address);
		ElementActions.type(browserObject,city, City);
		ElementActions.click(browserObject, city);
		ElementActions.type(browserObject,state, State);
		ElementActions.click(browserObject, state);
		ElementActions.type(browserObject,pinCode, PinCode);
		ElementActions.click(browserObject, pinCode);
		ElementActions.type(browserObject,mobileNumber, MobileNum);
		ElementActions.click(browserObject, mobileNumber);
		ElementActions.type(browserObject,email, Email);
		ElementActions.click(browserObject, email);
		ElementActions.typeSecure(browserObject, password, Pass);
		ElementActions.click(browserObject, password);
		ElementActions.click(browserObject, submitButton);
		ElementActions.getText(browserObject, customerID);
	}


}


