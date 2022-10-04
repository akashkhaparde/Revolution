package automation_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utility.generic;
import io.github.bonigarcia.wdm.WebDriverManager;

public class task_tech {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\test_data\\data.xlsx";
		FileInputStream fis =new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		///WebElement fist_name =
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(generic.readexelData_String("sheet1",0, 0));
			WebElement last_name=driver.findElement(By.xpath("//input[@name='lastname']"));
		js.executeScript("arguments[0].value='khaparde'",last_name);
		
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
	    driver.findElement(By.xpath("//input[@id='exp-0']")).click();
	    driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(generic.readexelData_String("sheet1",3, 0));
	driver.findElement(By.xpath("//input[@id='profession-0']")).click();
	driver.findElement(By.xpath("//input[@id='profession-1']")).click();
     driver.findElement(By.xpath("//input[@id='tool-2']")).click();
   WebElement continent = driver.findElement(By.xpath("(//select[@class='input-xlarge'])[1]"));
 	Select s1 =new Select (continent);
 	s1.selectByIndex(0);
 	
	
		Actions act=new Actions(driver);
		
		WebElement multi=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		act.keyDown(multi,Keys.LEFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
	}

}
