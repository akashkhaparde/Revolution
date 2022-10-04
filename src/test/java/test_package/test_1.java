package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 {

	public static void main(String[] args) throws Exception {
	
	/// browser open
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		Driver.manage().window().maximize();
		String title=Driver.getTitle();
		System.out.println( title);
		String url =Driver.getCurrentUrl();
		System.out.println(url);
		
		Driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(5000);
		
		Driver.navigate().to("https://www.google.com/maps/@18.8154265,76.7751434,7z");
		Thread.sleep(5000);
		Driver.navigate().forward();
		Driver.navigate().refresh();
		Thread.sleep(5000);
		Driver.navigate().to("https://majhinaukri.in/");
		Driver.navigate().back();
		Thread.sleep(5000);
		Driver.close();
		
		}
	}    
