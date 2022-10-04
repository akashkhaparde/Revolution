package generic_method;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
// generic method for drop down handling 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class library {
public static void drp_handler (WebElement element, String text) {
	try {
	Select s2 =new Select (element);
	s2.selectByVisibleText(text);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}	
}
	public static void custom_sendkeys(WebElement element,String value) {
		try {
		element.sendKeys(value);
		}catch(Exception e){
			System.out.println(e.getMessage());
	}
	}
public static void customHAndleAlert(WebDriver driver) {
	Alert alt= driver.switchTo().alert();
	alt.getText();
} 	
}
	/*public static String readexeldata_String(String Sheet name ) {
		
		String path="C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\test_data\\data.xlsx";
		FileInputStream fis =new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//String data=wb.getSheet(Sheet name).getRow(0).getCell(0).getStringCellV
*/

