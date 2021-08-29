package pedigree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
public static WebDriver driver;
	
	public static WebDriver setup1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\pedigree");
		driver=new ChromeDriver();
		driver.get("https://www.pedigree.in/"); 
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		return driver;
	}

}
