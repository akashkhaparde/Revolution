package TestNG_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3 {
	WebDriver driver;
@BeforeMethod 
public void Browseropen() {
	WebDriverManager.chromedriver().setup();
	 driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
}

@Test
public void test_verifyloginpage1() {
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	txt_email.sendKeys("akashkhaparde@gmail.com");
	
}
@Test
public void test_verifyloginpage2() {
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	txt_email.sendKeys("akashkhaparde@gmail.com");
	
}
@Test
public void test_verifyloginpage3() {
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	txt_email.sendKeys("akashkhaparde@gmail.com");
	
}
@AfterMethod
public void tearDown() {
	driver.close();
}

}
