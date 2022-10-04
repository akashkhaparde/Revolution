package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_task {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[1]")).click();
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Primary']")).click();
	driver.findElement(By.xpath("//button[text()='Success']")).click();
	driver.findElement(By.xpath("//button[text()='Info']")).click();
	driver.findElement(By.xpath("//button[text()='Warning']")).click();
	driver.findElement(By.xpath("//button[text()='Danger']")).click();
	driver.findElement(By.xpath("//button[text()='Link']")).click();
	driver.findElement(By.xpath("//button[text()='Left']")).click();
	driver.findElement(By.xpath("//button[text()='Middle']")).click();
	driver.findElement(By.xpath("//button[text()='Right']")).click();
	driver.findElement(By.xpath("//button[text()='1']")).click();
	driver.findElement(By.xpath("//button[text()='2']")).click();
//WebElement btn_drp=driver.findElement(By.xpath("(//button[@type='button'])[13]"));
//	Select sel =new Select(btn_drp);
	//sel.selectByValue("Dropdown link 1");
	//driver.navigate().back();
	//driver.findElement(By.xpath("//a[text()='Dropdown link 1']")).click();
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[3]")).click();
	driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
	driver.findElement(By.xpath("//input [@id='checkbox-2']")).click();
	driver.findElement(By.xpath("//input [@id='checkbox-3']")).click();
	driver.navigate().back();
	//driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[4]")).click();
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[5]")).click();
	Actions act =new Actions(driver);
	WebElement logo =driver.findElement(By.xpath("//img[@alt='Selenium logo']"));
	WebElement drag =driver.findElement(By.xpath("//div[@id='box']"));
	act.dragAndDrop(logo, drag).build().perform();
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[6]")).click();
	WebElement drp1=driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']"));
	Select sel =new Select(drp1);
	sel.selectByValue("dropdown");
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[7]")).click();
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Akash");
	
	//driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[8]")).click();
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[9]")).click();
	WebElement name=driver.findElement(By.xpath("//input[@class='form-control']"));
	act.keyDown(name,Keys.SHIFT).sendKeys("akash").keyUp(Keys.SHIFT).build().perform();
	//driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[10]")).click();
	
driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[11]")).click();
JavascriptExecutor js = (JavascriptExecutor)  driver;
js.executeScript("window.scrollBy(0,800)", "");
 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Akash Shekhar khaparde");
 driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("24-07-1995");
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[12]")).click();
	driver.findElement(By.xpath("(//input[@name='exampleRadios'])[1]")).click();
	driver.findElement(By.xpath("(//input[@name='exampleRadios'])[2]")).click();
	driver.findElement(By.xpath("(//input[@name='exampleRadios'])[3]")).click();
	
	driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[13]")).click();
	//driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[14]")).click();
		
}

}
