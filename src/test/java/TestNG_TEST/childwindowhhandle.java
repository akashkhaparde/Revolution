package TestNG_TEST;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childwindowhhandle {

	
  @Test
public void child_windowHandle() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	String parent_id =driver.getWindowHandle();
System.out.println(parent_id);
//do action on element 
driver.findElement(By.xpath("//a[text()='Click Here']")).click();
  Set<String> All_id =driver.getWindowHandles();
System.out.println(All_id);
//convert set in list 
List<String>id = new ArrayList(All_id);

String idparent = id.get(0)  ;
System.out.println("parent id"+ idparent);

String Idchild = id.get(1);
System.out.println("child id "+ Idchild);
driver.switchTo().window(Idchild);
driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(" i am the boss");

driver.close();
driver.quit();

}
	 

}
