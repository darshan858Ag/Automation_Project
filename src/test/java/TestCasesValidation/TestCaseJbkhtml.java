package TestCasesValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCaseJbkhtml {
	@Test
	void testheading()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String ActualText=driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		String ExpectedText="Welcome Again";
		Assert.assertEquals(ActualText, ExpectedText);;
	}


	@Test
	void subheading()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String ActualText=driver.findElement(By.xpath("/html/body/div/div/p")).getText();
		String ExpectedText="Login to manage your text and categories";
		Assert.assertEquals(ActualText, ExpectedText);;
	}


	@Test
	void validcredential()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String Actualpanel=driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
		String Expectedpanel="Admin Panel";
		Assert.assertEquals(Actualpanel, Expectedpanel);
		
		
	}
	@Test
	void Invalidcredential()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin@");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActualErrorMessage=driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpectedResult="Invalid username or password";
		Assert.assertEquals(ActualErrorMessage,ExpectedResult);
		
	}


	@Test
	void Invalidcredential2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password99123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActualErrorMessage=driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpectedResult="Invalid username or password";
		Assert.assertEquals(ActualErrorMessage,ExpectedResult);
		
	}

	@Test
	void Invalidcredential3()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("adminrtp");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActualErrorMessage=driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpectedResult="Invalid username or password";
		Assert.assertEquals(ActualErrorMessage,ExpectedResult);
		
	}

	@Test
	void Invalidcredential4()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("adminrtp");
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		//driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActualLogo=driver.findElement(By.xpath("@Test\r\n"
				+ "void Invalidcredential3()\r\n"
				+ "{\r\n"
				+ "	WebDriver driver=new ChromeDriver();\r\n"
				+ "	driver.get(\"https://javabykiran.com/selenium/login.html\");\r\n"
				+ "	driver.findElement(By.xpath(\"//*[@id=\\\"username\\\"]\")).sendKeys(\"adminrtp\");\r\n"
				+ "	driver.findElement(By.xpath(\"//*[@id=\\\"password\\\"]\")).sendKeys(\"password123\");\r\n"
				+ "	driver.findElement(By.xpath(\"//*[@id=\\\"login-form\\\"]/button\")).click();\r\n"
				+ "	String ActualErrorMessage=driver.findElement(By.xpath(\"//*[@id=\\\"error-message\\\"]\")).getText();\r\n"
				+ "	String ExpectedResult=\"Invalid username or password\";\r\n"
				+ "	Assert.assertEquals(ActualErrorMessage,ExpectedResult);\r\n"
				+ "	\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "")).getText();
		String ExpectedLogo="/html/body/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/img";
		Assert.assertEquals(ActualLogo,ExpectedLogo);
		
	}



	}


