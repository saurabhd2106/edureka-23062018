package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTesting {
	
	@BeforeClass(alwaysRun=true)
	public void beforeAClass(){
		System.out.println("\tExecuted as first method in a class..");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterAClass(){
		System.out.println("\tExecuted as last methodin a class..");
	}
	
	@BeforeMethod
	public void beforeATestcase(){
		System.out.println("\t\tExecuted before a test case");
	}
	
	@AfterMethod
	public void afterATestcase(){
		System.out.println("\t\tExecuted after a test case");
	}
  
	@Test(priority=0)
	public void testcase1(){
		System.out.println("\t\t\tTest case 1");
	}
	
	@Test(priority=100, groups="Sanity")
	public void testcase4(){
		System.out.println("\t\t\tTest case 4");
	}
	
	@Test(priority=-300,groups={"Sanity","Regression"})
	public void testcase3(){
		System.out.println("\t\t\tTest case 3");
	}
	@Test(priority=200, enabled=false)
	public void testcase2(){
		System.out.println("\t\t\tTest case 2");
	}
	
	@Test(enabled=true)
	public void testcase7(){
		System.out.println("\t\t\tTest case 7");
	}
}
