package Alert_window_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/admin.html");
	//delete button
	driver.findElement(By.xpath("//button[@data-id='1' and @class='delete-btn']")).click();
	Alert a1=driver.switchTo().alert();
	System.out.println(a1.getText());
	a1.accept();   // for accept alert
	a1.dismiss();  // for reject alert
}
}
