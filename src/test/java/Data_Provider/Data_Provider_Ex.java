package Data_Provider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Ex {
@Test(dataProvider="Login_Data")
void testvalid(String uname,String pass)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("btn-primary")).click();
	
	}
@DataProvider
Object[][] Login_Data()
{
	Object[][] obj= {
			{"admin","password123"},
			{"admin123","password123768"},
			{"^&*(^$%","@@3$5"},
			{" "," "}
                    };
	return obj;
}

}

