package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
           
     //mousehover
   Actions act=new Actions(driver);

WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));


act.moveToElement(selenium).build().perform();

act.moveToElement(selenium).click().build().perform();

//Drag and Drop

WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

WebElement destn=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement destn1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
WebElement akash= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
WebElement destn4= driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
WebElement src2 =driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
WebElement destn2 =driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));



act.dragAndDrop(src, destn).build().perform();

act.dragAndDrop(src, destn).build().perform();
act.dragAndDrop(src1, destn1).build().perform();
act.dragAndDrop(akash, destn4).build().perform();
act.dragAndDrop(src2, destn2).build().perform();



	}

}
