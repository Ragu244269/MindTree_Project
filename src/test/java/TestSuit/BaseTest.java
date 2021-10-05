/**
 * 
 */
package TestSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author admin
 *
 */
public class BaseTest {

	public static String baseURL="https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/";
	public static WebDriver driver =null;
	@BeforeClass
	public void browserLaunch() {
		try{
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		}
		catch(Exception e){
			
		}
	}
	@AfterClass
	public void browserClose() {
		try{		
		driver.quit();
		}
		catch(Exception e){
			
		}
	}
	
}
