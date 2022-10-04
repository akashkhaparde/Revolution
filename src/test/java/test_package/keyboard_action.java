package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard_action {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//keyboard movement 
		
   Actions act=new Actions(driver);
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
 act.keyDown(txt_email,Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
 act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
 act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
 WebElement txt_pass=driver.findElement(By.xpath("//input[@name='pass']"));
 txt_pass.click();
 act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
 WebElement btn_login=driver.findElement(By.name("login"));
 btn_login.click();
		
	}

}
