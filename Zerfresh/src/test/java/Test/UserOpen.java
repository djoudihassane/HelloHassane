package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.DashBoard;
import Page.LoginPage;
import Util.BrowserLaunch;

public class UserOpen {

	WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		driver = BrowserLaunch.openbrowser();
	}

	@Test(priority = 1)
	@Parameters({ "username", "password" , "Name", "company_name"})
	public void Open(String username, String password ,String Name, String company_name) throws Exception   {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.login(username, password);

		String ExpectedTitle = "Dashboard- TechFios Test Application - Billing";
		String ActualTitle = login.getPageTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("the title is " +ActualTitle);
		Thread.sleep(3000);
		DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
		dash.CRM();
		Thread.sleep(3000);
		dash.addContact(Name, company_name);
	}
	
	
	 @AfterMethod
	public void close() {
		driver.close();
	}

}
