package Testcases;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.Loginpage;

public class LoginLogout extends ProjectSpecificMethods {
	
	//ChromeDriver driver;
	@Test(dataProvider="fetchData")
	public void runLogin(String uname, String pword) {
		
	 new Loginpage(driver).enterUsername(uname).enterPassword(pword).clickloginButton();
	
	//new Loginpage().enterUsername(uname).enterPassword(pword).clickloginButton();
	}
	

}
