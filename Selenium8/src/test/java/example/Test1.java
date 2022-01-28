package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void Amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("https://www.amazon.com/ap/register?openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.findElement(By.id("ap_customer_name")).sendKeys("santosh swain");
		d1.findElement(By.id("ap_email")).sendKeys("123456789");
		d1.findElement(By.id("ap_password")).sendKeys("ABC123");
		d1.findElement(By.id("ap_password_check")).sendKeys("ABC123");
		d1.findElement(By.id("continue")).click();
	}

}
