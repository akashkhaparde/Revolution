package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exel_data_reader {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    driver.manage().window().maximize();
	    
	    
	//WebElement txt_first_name= driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(args)
    WebElement txt_last_name= driver.findElement(By.xpath("//input[@name='lastName']"));
	WebElement txt_phone_number= driver.findElement(By.xpath("//input[@name='phone']"));
	WebElement email= driver.findElement(By.xpath("//input[@name='userName']"));
    WebElement address= driver.findElement(By.xpath("//input[@name='address1']"));
	WebElement city= driver.findElement(By.xpath("//input[@name='city']"));
	WebElement state= driver.findElement(By.xpath("//input[@name='state']"));
	WebElement postal_code= driver.findElement(By.xpath("//input[@name='postalCode']"));
	WebElement username= driver.findElement(By.xpath("//input[@name='email']"));
	WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
	WebElement confirm_password= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	 
	   }
}
