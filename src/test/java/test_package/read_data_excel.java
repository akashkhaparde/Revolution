package test_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.generic;
import io.github.bonigarcia.wdm.WebDriverManager;

public class read_data_excel {
public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
String path="C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\test_data\\data.xlsx";
FileInputStream fis =new FileInputStream(path);
XSSFWorkbook wb = new XSSFWorkbook(fis);
String url=wb.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
WebElement data =driver.findElement(By.xpath("//input[@name='firstName']"));
//String data  = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(data); 
String data1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

System.out.println(data1); 

String first_name=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
String last_name=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

 /* driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(generic.readexelData_String("sheet1",0, 0));
  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(generic.readexelData_String("sheet1",1, 0));
  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(generic.readexelData_String("sheet1",9, 0));
  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(generic.readexelData_String("sheet1",2, 0));
  driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(generic.readexelData_String("sheet1",4, 0));
  driver.findElement(By.xpath("//input[@name='city']")).sendKeys(generic.readexelData_String("sheet1",7, 0));
  driver.findElement(By.xpath("//input[@name='state']")).sendKeys(generic.readexelData_String("sheet1",6, 0));
  driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(generic.readexelData_String("sheet1",11, 0));
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(generic.readexelData_String("sheet1",2, 0));
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(generic.readexelData_String("sheet1",5, 0));
  driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(generic.readexelData_String("sheet1",5, 0));
  */
}
}
