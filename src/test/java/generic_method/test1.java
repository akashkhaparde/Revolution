package generic_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		 WebElement drp_country =  driver.findElement(By.xpath("//select[@name='country']"));
		 WebElement txt_first_name= driver.findElement(By.xpath("//input[@name='firstName']"));
		 WebElement txt_last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement txt_username=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement txt_phone=driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement address= driver.findElement(By.xpath("//input[@name='address1']"));
		WebElement city= driver.findElement(By.xpath("//input[@name='city']"));
		WebElement state= driver.findElement(By.xpath("//input[@name='state']"));
		WebElement postal_code= driver.findElement(By.xpath("//input[@name='postalCode']"));
		WebElement username= driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		  WebElement confirm_password= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		 WebElement btn_submit= driver.findElement(By.xpath("//input[@type='submit']"));
		library.custom_sendkeys(txt_first_name, "akash");		
		library.custom_sendkeys(confirm_password, "akash@123");
		library.custom_sendkeys(password, "akash@123");
		library.custom_sendkeys(username, "akashkhaparde@gmail.com");
		library.custom_sendkeys(postal_code, "431105");
		library.custom_sendkeys(state, "maharashrta");
		library.custom_sendkeys(city, "aurangabad");
		library.custom_sendkeys(address, "chitegoan");
	    library.custom_sendkeys(txt_phone, "987654321");
	
	}

}
