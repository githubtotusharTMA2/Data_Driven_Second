package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;

public class LaunchTest extends TestBase
{
	public LaunchTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void lauchingTest()
	{
		System.out.println("Launched browser successfully");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
