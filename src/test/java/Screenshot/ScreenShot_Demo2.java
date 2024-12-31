package Screenshot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Demo2 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
		//Screenshot of particular web Element
		WebElement ele=driver.findElement(By.xpath("/html/body/header/div/h1"));
		File file=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//ScreenShots//AdminPanel.png"));
		
	}
	
}
