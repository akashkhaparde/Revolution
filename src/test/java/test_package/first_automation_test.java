package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first_automation_test {

	public static void main(String[] args) throws Exception {

    WebDriverManager.chromedriver().setup();
    WebDriver Driver=new ChromeDriver();
    
    Driver.get("https://www.facebook.com/");
    Driver.manage().window().maximize();
    
    WebElement txt_email=Driver.findElement(By.id("email"));
     txt_email.sendKeys("9175069438");
     Thread.sleep(3000);
     WebElement txt_pass=Driver.findElement(By.id("pass"));
    txt_pass.sendKeys("fbpass95");
    Thread.sleep(3000);
   WebElement btn_login=Driver.findElement(By.name("login"));
    btn_login.click();
	}}

