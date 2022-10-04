package TestNG_TEST;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazontestcases {

	@Test 
	public void HandleAlert() throws Exception {
	//open  browser 
		String path="C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\test_data\\data.xlsx";
		FileInputStream fis =new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String url=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String data1=wb.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys(data1);
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	
	//driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).click()
	
                                            //search product
	  WebElement product = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	  //get text
      System.out.println(product.getText());
   
  //	js.executeScript("window.scrollBy(0,200)", "");
    //  WebElement price = driver.findElement(By.xpath("(//span[text()='64,990'])[2]"));
    //price.getText();
       product.click();
       WebElement price = driver.findElement(By.xpath("(//span[text()='₹64,990'])[1]"));
       price.getText();
       Thread.sleep(7000);
      // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
   //   )
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,800)", "");
       driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
       /*//driver.navigate().refresh();
//js.executeScript("window.scrollBy(0,700)","");
//JavascriptExecutor ks = (JavascriptExecutor)  driver;

  
TakesScreenshot ts= (TakesScreenshot) driver;
WebElement pr1=driver.findElement(By.xpath("//div[@id='sc-item-Cfa1374ab-1be8-46b5-9e11-577373e59681']"));
File src=ts.getScreenshotAs(OutputType.FILE);
File destn1=new File ("C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\screenshot\\mobile.png");
FileUtils.copyFile(src, destn1);
driver.findElement(By.xpath("//input[@name='submit.delete.Cfa1374ab-1be8-46b5-9e11-577373e59681']")).click();
File src1=ts.getScreenshotAs(OutputType.FILE);
File destn2 =new File ("C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\screenshot\\empty.png");
FileUtils.copyFile(src1, destn2);
WebElement txt = driver.findElement(By.xpath("//h1[contains(text(),'Your Amazon Cart is empty.')]"));
txt.getText();
String Actual =txt.getText();
String Expected ="Your Amazon Cart is empty.";
Assert.assertEquals(Actual,Expected );
*/

	}

}
