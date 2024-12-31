package TestCasesValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Naukri {
@Test(priority=1)
void TestHeading()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAyJS7BhBiEiwAyS9uNeqAjL");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String ActualHeading=driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/nav/ul/li[1]/a/div")).getText();
    String ExpectedHeading="Jobs";
    Assert.assertEquals(ActualHeading, ExpectedHeading);
}
@Test(priority=2)
void SubHeading()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAyJS7BhBiEiwAyS9uNeqAjL");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String ActualHeading=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[1]/div[1]/div/strong")).getText();
    String ExpectedHeading="New to Naukri?";
    Assert.assertEquals(ActualHeading, ExpectedHeading);
}

@Test(priority=3)
void validCredentials()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAyJS7BhBiEiwAyS9uNeqAjL");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("darshanshinde858@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("Surekha@123");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
	String ActualPanel=driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ul/li[1]/a/div")).getText();
    String ExpectedPanel="companies";
    Assert.assertEquals(ActualPanel, ExpectedPanel);
}

@Test(priority=4)
void InvalidCredentials()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAyJS7BhBiEiwAyS9uNeqAjL");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("eknathshinde@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("Surekha@123");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
	String ActualText=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/span")).getText();
    String ExpectedText="Invalid details. Please check the Email ID - Password combination.";
    Assert.assertEquals(ActualText, ExpectedText);
}
@Test(priority=5)
void InvalidCredentials2()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAyJS7BhBiEiwAyS9uNeqAjL");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("darshanshinde858@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("manoj123");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
	String ActualText=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/span")).getText();
    String ExpectedText="Invalid details. Please check the Email ID - Password combination.";
    Assert.assertEquals(ActualText, ExpectedText);
}
@Test(priority=6)
void InvalidCredentials3()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAyJS7BhBiEiwAyS9uNeqAjL");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("kunal889");
	driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("pushpak908");
    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
	String ActualText=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/span")).getText();
    String ExpectedText="Invalid details. Please check the Email ID - Password combination.";
    Assert.assertEquals(ActualText, ExpectedText);
}
}
