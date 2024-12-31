package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_Xpath_Ex {
@Test
void locate()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	//Standard Xpath
   driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("admin");
   
   
}
}
