package pedigree;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class PediTest {
	public static WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	  /*search button */
	  driver.findElement(By.xpath("//*[@class='search-box']")).click();
	  
	  /*to get value from excel */
	  driver.findElement(By.xpath("//*[@name='search']")).sendKeys(excel.getvalue1());
	  
	  /*to select socilaise a shy puppy */
	  driver.findElement(By.xpath("(//a[@class='ng-binding'])[2]")).click();
	  Thread.sleep(2000);
	  
	  /*to click on the logo */
	 // driver.findElement(By.xpath("(//img[@title='logo'])[1]")).click();
	  
	  /*to get back to home page */
	  ArrayList<String> win=new ArrayList<String> (driver.getWindowHandles());
	  driver.switchTo().window(win.get(0));
	  
	  /*to get count of articles */
	  String artcount=driver.findElement(By.xpath("//h3[contains(text(),'Articles')]")).getText();
	  
	  System.out.println(artcount);
	 String article= artcount.substring(10, 11);
	 
	 /*to print the value in excel*/
	 excel.setvalue2(article);
	  
	 /*to click on the logo */
	 driver.findElement(By.xpath("//img[@id='Header_imgLogo']")).click();
	 Thread.sleep(2000);
	 
	 /*to take screenshot */
	 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f, new File("C://Users//welcome//Pictures//screenshots//pedi.jpg"));
	 
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=Driver.setup1();
  }

  @AfterTest
  public void afterTest() {
  }

}
