package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Select_Demo {

	@Test
	void select_Values()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
		driver.findElement(By.id("add-subcategory")).click();
		
		WebElement ele=driver.findElement(By.name("parentCategory"));
		Select sc=new Select(ele);
		//sc.selectByIndex(1);
		//sc.selectByValue("Technology");
		sc.selectByVisibleText("Arts");
		
		//To validate dropdown list values count should be 5
		List<WebElement> values=sc.getOptions();
		Assert.assertEquals(values.size(), 4);		
		
	}
	
	@Test
	void values()
	{
		//Validate first values of dropdown list should be "mathematics"
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
		driver.findElement(By.id("add-subcategory")).click();
		
		WebElement ele=driver.findElement(By.name("parentCategory"));
		
		Select sc=new Select(ele);
		List<WebElement> Values=sc.getOptions();
		boolean b=false;
		for(WebElement value:Values)
		{
			String drpValues=value.getText();
			if(drpValues.contains("Mathematics"))
			{
			b=true;
			}
		}
		
		Assert.assertTrue(b);
		
	}
	
	

}
