package naveenAutomation.automationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class WaitTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//Implicit Wair
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		//Explicit Wait
	
	Actions act=new Actions(driver);
	
	WebElement el1=driver.findElement(By.xpath("123"));
	WebElement el2=driver.findElement(By.xpath("234"));
	
	act.clickAndHold(el1).moveToElement(el2).release().build().perform();
	driver.switchTo().frame(0);	
	
	//Taking ScreenShot
	
	

	
	
	}

}
