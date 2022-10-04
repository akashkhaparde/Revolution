package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class value_withot_send_key {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
   driver.get("https://www.facebook.com/login/");
   driver.manage().window().maximize();
   
   
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("document.getElementById(\'email\').value='selenium'", "");
  
  WebElement txt_pass=driver.findElement(By.xpath("//input[@name='pass']"));
  js.executeScript("arguments[0].value='test'",txt_pass);
  
  WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
  js.executeScript("arguments[0].click()",btn_login);
  
  
	}

}
