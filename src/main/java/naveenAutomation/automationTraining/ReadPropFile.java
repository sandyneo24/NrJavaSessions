package naveenAutomation.automationTraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties pr=new Properties();
		FileInputStream fis=new FileInputStream("D:/workspace/automationTraining/src/main/java/config.properties");
		pr.load(fis);
		
		System.out.println(pr.getProperty("name"));
		System.out.println(pr.getProperty("age"));

		String url=pr.getProperty("URL");
		System.out.println(url);

		String browsername=pr.getProperty("browser");

		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Chrome\\chromedriver.exe");
			 driver= new ChromeDriver();
		} 
		else if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.firefox.marionette","D:\\workspace\\Firefox\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(browsername.equals("explorer"))
		{
			 driver=new InternetExplorerDriver();
		}
		
		driver.get(url);



	}

}
