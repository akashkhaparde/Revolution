package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_keyboard {
   // mouse movement
	
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	//right click ---context click
	Actions act =new Actions (driver);
    WebElement rightclick=	driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement Edit =driver.findElement(By.xpath("//span[text()='Edit']"));
	act.contextClick(rightclick).click(Edit).build().perform();
	Thread.sleep(3000);
	WebElement doubleclick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")); 
 	act.doubleClick(doubleclick).build().perform();
}

}
