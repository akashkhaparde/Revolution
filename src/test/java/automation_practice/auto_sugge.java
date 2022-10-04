package automation_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_sugge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();

driver.get("https://www.google.co.in/");

driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");

List<WebElement> all_opt= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));

System.out.println(all_opt.size());
for(int i=0;i<all_opt.size();i++) {
System.out.println(all_opt.get(i).getText());
if (all_opt.get(i).getText().equalsIgnoreCase("maven repository")) {

all_opt.get(i).click();

break;
}
}
	}

}
