package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fb {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

 
     JavascriptExecutor js = (JavascriptExecutor)  driver;
     
     // WebElement id_email = driver.findElement(By.id(//input[@id='email']));
    		  
     js.executeScript("document.ElementById('email').value='9175069438'");
     
      js.executeScript("document.ElementById('pass').value='fbpass91'");
      
	}
}
