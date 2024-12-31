package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Demo {
public static void main(String[] args) throws IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/subcategories.html");
	//Typecasting Driver interface into TakeScreenshot Interface
	TakesScreenshot as=(TakesScreenshot)driver;
	
	File file=as.getScreenshotAs(OutputType.FILE);
	File f1=new File(".//ScreenShots/?SubCategory.png"); 
	FileUtils.copyFile(file, f1);
	
}
}
