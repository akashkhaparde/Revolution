package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drp_hndl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		
	WebElement drp_ctry=	driver.findElement(By.xpath("//select[@name='country']"));
		
		
		Select sel =new Select (drp_ctry);
		
		sel.selectByIndex(6);
	Thread.sleep(3000);
	sel.selectByValue("BURMA");
   Thread.sleep(3000);
		sel.selectByVisibleText("INDIA");
	}

}
