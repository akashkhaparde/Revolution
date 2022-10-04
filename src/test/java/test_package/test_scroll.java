package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class test_scroll {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
		driver.get("https://maven.apache.org/");	
		driver.manage().window().maximize();
		

		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		js.executeScript("window.scrollBy(0,-500)", "");
		
		
		
		WebElement txt_io =driver.findElement(By.xpath("//a[@title='JXR']"));
		
		js.executeScript("arguments[0].scrollIntoView()", txt_io);
		
		
		
		/*js.executeScript("arguments[0].scrollIntoView()",txt_io);
		JavascriptExecutor js = (JavascriptExecutor)  driver;
		js.executeScript("window.scrollBy(0,700)", "");
		 Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(3000);
		WebElement txt_io =driver.findElement(By.xpath("//a[text()='IO']"));
		js.executeScript("arguments[0].scrollIntoView()",txt_io);
	*/	
	}

}
