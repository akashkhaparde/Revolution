package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();		
		
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();;
		
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
	js.executeScript("window.scrollBy(0,700)", "");
   js.executeScript("window.scrollBy(0,-500)","");

WebElement txt_ak= driver.findElement(By.xpath("//a[text()='Reactivewizard Binding']"));
js.executeScript("argument [0].scrollInto()", txt_ak);
txt_ak.click();
	}

}
