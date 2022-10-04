package test_package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class take_screenshot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	//	 capture screenshot full page 
		TakesScreenshot ts= (TakesScreenshot) driver;
	
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn = new File("C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\screenshot\\tele.png");
		
		FileUtils.copyFile(src, destn);
	//	String ak =RandomString.make(3);
		//capture screenshot for particular webelement /field 
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Google']"));
		File src1=logo.getScreenshotAs(OutputType.FILE);
		
		File destn1=new File ("C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\screenshot\\logo.png");
		
    FileUtils.copyFile(src1, destn1);
    
		}

}
