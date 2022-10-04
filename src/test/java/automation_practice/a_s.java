package automation_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a_s {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
		Thread.sleep(3000);
	List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='G43f7e']"));
				System.out.println(alloptions.size());
	for (int i=0;i<alloptions.size();i++) {
		System.out.println(alloptions.get(i).getText());
		if (alloptions.get(i).getText().equalsIgnoreCase("maven dependency")) {
			alloptions.get(i).click();
		break;
	}}}}
