package automation_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DRP_W_M {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
	WebElement ctr =	driver.findElement(By.xpath("//select[@name='country']"));
		
		
		Select sel= new Select(ctr);
		sel.getFirstSelectedOption().getText();
	List <WebElement>list=	sel.getOptions();
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			//System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("INDIA"))
			list.get(i).click();
			
		}
		
	}

}
