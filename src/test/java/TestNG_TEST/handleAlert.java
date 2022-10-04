package TestNG_TEST;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_method.library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class handleAlert {
@Test 
public void HandleAlert() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	
	WebElement cusid=driver.findElement(By.xpath("//input[@name='submit']"));
	cusid.click();
	
	Alert alt =driver.switchTo().alert();
	
	String text=alt.getText();
	System.out.println(text);
	alt.dismiss();
	Thread.sleep(3000);
	alt.accept();
	Thread.sleep(3000);
	alt.getText();
	Thread.sleep(3000);
	alt.accept();

	}
}