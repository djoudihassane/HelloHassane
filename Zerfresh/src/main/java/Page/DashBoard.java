package Page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoard {

	WebDriver driver;
	public DashBoard(WebDriver driver) {
		this.driver=driver;
	}
		//ElementLibrary
		@FindBy(how= How.XPATH,using = "//*[@id=\"side-menu\"]/li[2]/a/span[1]")WebElement  CRM;
		@FindBy(how= How.XPATH,using = "//*[@id=\"side-menu\"]/li[2]/ul/li[1]/a")WebElement AddContact;
		@FindBy(how= How.ID, using = "account") WebElement  FullName;
	    @FindBy(how = How.ID,using ="company")WebElement Company;
	    @FindBy(how = How.ID,using="submit")WebElement Submit;
	
	    
	    public void CRM() {
	    	
	    	
	    	CRM.click();
			AddContact.click();
			
	    }
	
	    public void addContact(String Name , String company) {
		Random rnd = new Random();
		
		FullName.sendKeys(Name+rnd.nextInt(999));
		Company.sendKeys(company);
		Submit.click();
		
	}
	
	
}
