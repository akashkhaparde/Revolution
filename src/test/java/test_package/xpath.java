package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
	Driver.get("https://www.facebook.com/");
	Driver.manage().window().maximize();


WebElement txt_email=Driver.findElement(By.xpath("//input[@name='email']"));
	txt_email.sendKeys("9175069438");
	Thread.sleep(5000);
WebElement txt_password=Driver.findElement(By.xpath("//input[@name='pass']"));
	txt_password.sendKeys("fbpass95");
	Thread.sleep(5000);
WebElement button_login=Driver.findElement(By.xpath("//button[@name='login']"));
	button_login.click();
	
	Driver.close();
	}
	}
