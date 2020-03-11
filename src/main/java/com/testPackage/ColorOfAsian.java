package com.testPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorOfAsian
{
 static WebDriver driver;
public static void main(String[] args) throws AWTException, InterruptedException
 {
	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Chrome\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

     driver.get("https://www.bseindia.com/ ");
     driver.findElement(By.xpath("//input[@id='getquotesearch']")).sendKeys("spicejet");
     
     // Clicking on the Enter Button with the help of Robot Class

     Robot r=new Robot();
     
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);

     WebElement col=driver.findElement(By.xpath("//strong[@id='idcrval']"));
     String val = col.getText();
     System.out.println("The value of the Share is :" + val);
     

     // Feteching the difference of value in share  

     WebElement we=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[1]/div[2]/div/span[2]/strong"));
     String i=we.getAttribute("class");
     Thread.sleep(3000L);
      
     if(i.contains("green"))
        {
           System.out.println("Color is Green");
        }
       else
       {
          System.out.println("Color is Red");
        }
    driver.quit();
 }    
     

}
     
