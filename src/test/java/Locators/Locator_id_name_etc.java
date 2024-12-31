package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator_id_name_etc {
@Test
void locate()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("password123");
	driver.findElement(By.className("btn-primary")).click();
	}
}
