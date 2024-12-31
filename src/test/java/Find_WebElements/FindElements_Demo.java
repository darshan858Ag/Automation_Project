package Find_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Demo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	List<WebElement> Checkboxes=driver.
			findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	// for all CheckBoxes
	/*for(WebElement checkbox : Checkboxes){
		checkbox.click();
	}*/
	
	// for particular CheckBoxes
		for(WebElement checkbox : Checkboxes)
		{
			if(checkbox.getDomAttribute("value").equals("sunday")
				|| checkbox.getDomAttribute("value").equals("saturday"))
			checkbox.click();
		}
}
}
