package Window_Switch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Switch {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//for single window
	//String windId=driver.getWindowHandle();
	//System.out.println(windId);
	
	driver.findElement(By.linkText("Myntra")).click();
	
	//for multiple window
	Set<String> windowsIds=driver.getWindowHandles();
	System.out.println(windowsIds.size());
	
	Iterator<String> it=windowsIds.iterator();
	String ParentWindow=it.next();
	String ChildWindow=it.next();
	
	driver.switchTo().window(ChildWindow);
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
	.sendKeys("shoes for men");
}
}
