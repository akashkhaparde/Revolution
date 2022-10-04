package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_drop_down {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
WebDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();

 WebElement drp_country =  driver.findElement(By.xpath("//select[@name='country']"));
 
 Select s1 = new Select (drp_country);
 
 s1.selectByIndex(6); // spain
 Thread.sleep(3000);
 
 s1.selectByValue("ARGENTINA");
 Thread.sleep(3000);
 
 s1.selectByVisibleText("ARMENIA");
 
 
	}
}
