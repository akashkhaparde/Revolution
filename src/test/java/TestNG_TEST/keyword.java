package TestNG_TEST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class keyword {
	@BeforeMethod
	public void BM() {
		System.out.println("Browser Open");
	}
	@Test(priority=3,invocationCount=3)
	public void testa() {
		System.out.println("A");
	}
	@Test(priority=-2)
	public void testc() {
		System.out.println("C");
		
	//	Assert(false); // Fail
	}
	@Test(priority=1,enabled=false)
	public void testb() {
		System.out.println("B");
	}
	@Test(priority=0,dependsOnMethods="testc")
	public void testd() {
		System.out.println("D");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("Browser Close");
	}
		
}

