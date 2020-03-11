package naveenAutomation.automationTraining;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000L);
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com");

		driver.findElement(By.name("username")).sendKeys("sandy038");
		driver.findElement(By.name("password")).sendKeys("dividdsipu36");
		Thread.sleep(2000L);
		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));

		drawBorder(loginbtn, driver);

		//Screen Shot

		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:/workspace/automationTraining/src/main/java/google.png"));

		//generateAlert(driver,"There is an issue with the alert button");
		
		clickAlertByJs(loginbtn, driver);
		
		refreshBrowserJS(driver);
		
		System.out.println(getTitleByJS(driver));
		
		System.out.println(getWholeText(driver));
		
	}
	public static void drawBorder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	public static void clickAlertByJs(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	public static void refreshBrowserJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
		
	}
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getWholeText(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String pageText=js.executeScript("return document.documentElement.InnerText;").toString();
		
		return pageText;
	}


}