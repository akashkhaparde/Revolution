package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {

	public static void main(String[] args) throws Exception {
		
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://demo.guru99.com/test/newtours/register.php");
     driver.manage().window().maximize();
     
  WebElement txt_first_name= driver.findElement(By.xpath("//input[@name='firstName']"));
  txt_first_name.sendKeys("akash");
  
  WebElement txt_last_name= driver.findElement(By.xpath("//input[@name='lastName']"));
  txt_last_name.sendKeys("khaparde");
  
  WebElement txt_phone_number= driver.findElement(By.xpath("//input[@name='phone']"));
  txt_phone_number.sendKeys("9987654678");
  
  WebElement email= driver.findElement(By.xpath("//input[@name='userName']"));
  email.sendKeys("myemail@gmail.com");
  
  WebElement address= driver.findElement(By.xpath("//input[@name='address1']"));
  address.sendKeys("sant Dnyaneshwar nagar paithan road Chitegoan");
  
  WebElement city= driver.findElement(By.xpath("//input[@name='city']"));
  city.sendKeys("Aurangabad");
  
  WebElement state= driver.findElement(By.xpath("//input[@name='state']"));
  state.sendKeys("Maharashta");
  WebElement drp_country =  driver.findElement(By.xpath("//select[@name='country']"));
  
  Select s1 = new Select (drp_country);
  
  s1.selectByValue("INDIA");
  Thread.sleep(3000);
  WebElement postal_code= driver.findElement(By.xpath("//input[@name='postalCode']"));
  postal_code.sendKeys("431105");
  
  WebElement username= driver.findElement(By.xpath("//input[@name='email']"));
  username.sendKeys("myemail@gmail.com");
  
  WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
  password.sendKeys("mypass@123");
  
  WebElement confirm_password= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
 confirm_password.sendKeys("mypass@123");
 
 //WebElement btn_submit= driver.findElement(By.xpath("//input[@type='submit']"));
 //btn_submit.click();
 
  }
}
