package TestNG_TEST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chind_W_H_by_itterator {

	@Test 
	public void verify_childWindow() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String>AllId =driver.getWindowHandles();
		/*Iterator<String> It =AllId.iterator();
		String parentId_1= It.next();
		System.out.println(parentId_1);
		String childid = It.next();
		System.out.println(childid);
		driver.switchTo().window(childid);
	while (It.hasNext()) {
		String CID = It.next();
		if(CID.equals(parentId_1)) {
			driver.switchTo().window(CID);}
		
			//now to handle multiple child window and close particular window 
			*/
			List<String> list =new ArrayList(AllId);
			for(int i =0;i<list.size();i++) {
				driver.switchTo().window(list.get(i));
				
				String title = driver.getTitle();
				//if (title.equals(" ")) {
			//		driver.close();
					
				}
			}
		}
	
	//}

