package test_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c_4 {

	public static void main(String[] args) {
	 
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	driver.manage().window().maximize();
	// identify dropdown Element 
	WebElement drp_country =driver.findElement(By.xpath("//select[@name='country']"));
	//create object of select class
	Select sel =new  Select (drp_country);
	// to verify by default value of drop down i.e. first value 
	// System.out.println(sel.getFirstSelectedOption().getText()); 
	
	
	List<WebElement> list=sel.getOptions();  // country NAME
	
	System.out.println(list.size());   //264
	
	for (int i=0;i<list.size();i++) {  // 0>>>>>>>>>>>>1>>>>>200>>>>264>name
		System.out.println(list.get(i).getText());/// coutry name on console
	
		 if (list.get(i).getText().equals("INDIA")){
			list.get(i).click();
		}
	}
	}

}
