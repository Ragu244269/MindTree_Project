package Library;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestSuit.BaseTest;

public class library extends BaseTest{
	public void unwantedLink(){
		try{
			
			  driver.findElement(By.linkText("Open website in current window")).click();
		}catch(Exception e){
			
		}
	}
	public static boolean iselementPresent(WebDriver driver, String locator) {

		boolean status = false;
		try {
			if (driver.findElement(By.xpath(locator)).isDisplayed())
				status = true;
			

		} catch (NoSuchElementException e) {
			status = false;
		} catch (Exception e) {
			status = false;
			throw new RuntimeException("Exception message:"+e.getMessage());
		}
		return status;

	}
	
	public static void sendKeys(WebDriver driver,String locator,String text,String passtext,String failtext){
		try{
			waitForVisibilityOfElement(driver,locator);
			if(iselementPresent(driver,locator)){
			WebElement element =driver.findElement(By.xpath(locator));
			element.sendKeys(text);
			System.out.println("Passed"+" "+passtext);}
			else{
				System.out.println("Failed"+" "+failtext);
				throw new RuntimeException("Unable to enter a value in a sendkeys");
			}
		}
		catch(Exception e){
			throw new RuntimeException("Unable to enter a value in a sendkeys");
		}
		
	}
	public static void clickable(WebDriver driver,String locator,String passtext,String failtext){
		try{
			waitForClickableOfElement(driver,locator);
			if(iselementPresent(driver,locator)){
			WebElement element =driver.findElement(By.xpath(locator));
			element.click();
			System.out.println("Passed"+" "+passtext);}
			else{
				System.out.println("Failed"+" "+failtext);
				throw new RuntimeException("Unable to clickable of element");
			}
		}
		catch(Exception e){
			throw new RuntimeException("Unable to clickable of element");
		}
		
	}
	public static String getText(WebDriver driver,String locator){
		String fstatus=null;
		try{
			waitForVisibilityOfElement(driver,locator);
			if(iselementPresent(driver,locator)){
			WebElement element =driver.findElement(By.xpath(locator));
			fstatus=element.getText();}
			else{
				throw new RuntimeException("Unable to get text from the element");
			}
		}
		catch(Exception e){
			throw new RuntimeException("Unable to get text from the element");
		}
		return fstatus;
		
	}
	public static void dropdown(WebDriver driver,String locator,String index,String passtext,String failtext){
		try{
			waitForClickableOfElement(driver,locator);
			if(iselementPresent(driver,locator)){
			WebElement element =driver.findElement(By.xpath(locator));
			Select select=new Select(element);
			select.selectByIndex(Integer. parseInt(index));
			System.out.println("Passed"+" "+passtext);}
			else{
				System.out.println("Failed"+" "+failtext);
				throw new RuntimeException("Unable to select a dropdown");
			}
		}
		catch(Exception e){
			throw new RuntimeException("Unable to select a dropdown");
		}
		
	}
	public static void waitForVisibilityOfElement(WebDriver driver,String locator){
		try{
			WebDriverWait wait =new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		}
		catch(Exception e){
			throw new RuntimeException("Unable to Visibility Of Element");
		}
		
	}
	public static void waitForClickableOfElement(WebDriver driver,String locator){
		try{
			WebDriverWait wait =new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		}
		catch(Exception e){
			throw new RuntimeException("Unable to Clickable Of Element");
		}	
	}
}
