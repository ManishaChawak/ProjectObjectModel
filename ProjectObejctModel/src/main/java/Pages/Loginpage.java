package Pages;

import org.openqa.selenium.chrome.ChromeDriver;


//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
//import org.openqa.selenium.support.How;


import Base.ProjectSpecificMethods;

public class Loginpage extends ProjectSpecificMethods{
	
	
 //@FindBys(
//		 {
		
//			@FindBy(how=How.ID, using="txtUsername"),
//		@FindBy(how=How.XPATH, using="//input[@name='txtUsername']")
//	}
//	)
//	WebElement username;
	
//	public Loginpage enterUsername(String uname) {
//		username.sendKeys(uname);
//		return this;
		
//	}
//	@CacheLookup
//@FindBy(how=How.ID, using="txtpassword")
//	WebElement password;
//	public Loginpage enterPassword(String pword) {
//		password.sendKeys(pword);
//		return this;
//	}

//	@CacheLookup
//	@FindBy(how=How.ID, using="btnLogin")
//	WebElement loginbutton;
//	public Homepage clickLogin() {
//		loginbutton.click();
//		return new Homepage(driver);
//	}
	
	

	public Loginpage(ChromeDriver driver) {
		this.driver=driver;
	
	}
	
	public Loginpage enterUsername(String uname) {
		driver.findElementById("txtUsername").sendKeys(uname);
		return this;
	}
	
	public Loginpage enterPassword(String pword) {
		driver.findElementById("txtPassword").sendKeys(pword);
		return this;
		}
	
	
	public Homepage clickloginButton() {
		driver.findElementById("btnLogin").click();
		return new Homepage(driver);
	}

}
