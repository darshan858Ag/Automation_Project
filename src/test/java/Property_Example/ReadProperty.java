package Property_Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.runtime.Runtime.GetPropertiesResponse;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ReadProperty {
	@Test
void dataReadProperty() throws IOException
{   // To read file
	FileInputStream fis=new FileInputStream(".//Propertyfile/config.properties");
	//Properties class
	Properties pro=new Properties();
	//Load file in properties class
	pro.load(fis);
	//Browser 
   String Browser= pro.getProperty("browser");
   //System.out.println(Browser);
   //URL
   String URL=pro.getProperty("url");
  // System.out.println(URL);
   String Username=pro.getProperty("username");
   String Password=pro.getProperty("password");
   
   // We need to open browser to load url
    WebDriver driver=null;
   if(Browser.equals("chrome"))
   {
	   driver=new ChromeDriver();
   }else if(Browser.equals("firefox"))
   {
	   driver=new FirefoxDriver();
   }else if(Browser.equals("InternetExplorer"))
   {
	   driver=new InternetExplorerDriver();
   }
   else
   {
	   driver =new ChromeDriver();
   }
   
   driver.get(URL);
   //username
   driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Username);
   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
   driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
   
   String ExpectedResult= driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
   
   String ActualResult="Admin success";
   Assert.assertEquals(ActualResult, ExpectedResult);
   
   
}
}
