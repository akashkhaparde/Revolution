package automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {

	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
       driver.get("https://www.flipkart.com/");

     driver.manage().window().maximize();
    
     String title = driver.getTitle();
         System.out.println(title);
         
         String url = driver.getCurrentUrl();
         System.out.println(url);
         
 }

}
