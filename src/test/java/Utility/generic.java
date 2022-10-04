package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class generic {
public static String readexelData_String(String Sheetname ,int row ,int cell) throws Exception {
	
	String path="C:\\Users\\Technomech\\eclipse-workspace\\Revolution_bug_spoteer\\test_data\\data.xlsx";
	FileInputStream fis =new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	String data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	//return data;
	return data;
		
}
}
