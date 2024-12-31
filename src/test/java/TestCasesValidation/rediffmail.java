package TestCasesValidation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class rediffmail {
@Test
void open()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("darshan");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("darshan@123");
    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
   String ActualText= driver.findElement(By.xpath("/html/body/div/div[1]/img")).getText();
   String ExpectedText="rediffmail is open";
   Assert.assertEquals(ActualText, ExpectedText);
}

}
