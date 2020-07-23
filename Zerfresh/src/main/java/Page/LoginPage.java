package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {
	WebDriver driver;
	
public LoginPage(WebDriver driver) {
		this.driver=driver;
	
	}

	//Element Library
	@FindBy(how = How.ID,using ="username" )WebElement UserName;
	@FindBy(how =How.ID ,using="password")WebElement Password;
	@FindBy(how = How.NAME , using= "login")WebElement SignIn;
	
	
	public void login(String username , String password) {
		UserName.sendKeys(username);
		Password.sendKeys(password);
        SignIn.click();
	}


	public String getPageTitle() {
		
		return driver.getTitle();
	}
	

}
