package test_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_suggestion_task {

	public static void main(String[] args) throws Exception {
		
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
 driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
//WebElement txt_search=
      /* bttn_login=driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
           bttn_login.click();
         WebElement txt_email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
          txt_email.sendKeys("9175069438");
        Thread.sleep(3000);
        WebElement txt_pass=driver.findElement(By.xpath("//input[@type='password']"));
         txt_pass.sendKeys("flippass@91");
      Thread.sleep(3000);
         WebElement btn_login=driver.findElement(By.xpath("//button[@type='submit']"));
           btn_login.click();
        */   
WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
close.click();
       WebElement txt_search =driver.findElement(By.xpath("//input[@name='q']"));
       txt_search.sendKeys("mobile");
       Thread.sleep(3000);
 List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
	System.out.println(alloptions.size());
	for (int i=0;i<alloptions.size();i++){
		System.out.println(alloptions.get(i).getText());
	       if (alloptions.get(i).getText().equalsIgnoreCase("mobiles vivo and oppo"));{
		alloptions.get(i).click();
		break;
		}
		}
		}}
