package Base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utils.ReadExcel;


public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String fileName;
	
	@Parameters("url")
	
	@BeforeMethod
	
	public void startapp(String url) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
		
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {		
		return ReadExcel.excelData();
	}
}
