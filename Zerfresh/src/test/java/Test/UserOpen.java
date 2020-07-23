package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.LoginPage;
import Util.BrowserLaunch;

public class UserOpen {

	
WebDriver driver;
	
	@BeforeMethod
	public  void OpenBrowser() {
	driver=BrowserLaunch.openbrowser();		
	}
	@Test
	@Parameters({"username" ,"password"})
	
	public void Open(String username , String password) {
			
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.login(username, password);
	}
	
	
}
