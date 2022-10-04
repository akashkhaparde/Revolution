package test_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_suggestion {

	public static void main(String[] args) throws Exception {
   WebDriverManager.chromedriver().setup();
   WebDriver driver =new ChromeDriver();
   driver.get("https://www.google.com/");
   driver.manage().window().maximize();
   
   WebElement txt_search=driver.findElement(By.xpath("//input[@name='q']"));
   txt_search.sendKeys("maven");
   Thread.sleep(3000);
   //find element of all option in suggestion//
  //List<WebElement>   = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
   List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
   System.out.println(alloptions.size());
   
   
   for (int i=0;i<alloptions.size();i++) {
   System.out.println(alloptions.get(i).getText());   // 
   if (alloptions.get(i).getText().equalsIgnoreCase("maven central repository")){
   alloptions.get(i).click();
   //driver.close();
   break; 
   }}}}
