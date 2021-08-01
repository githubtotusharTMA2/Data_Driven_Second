package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.FormFillingPage;

public class FormFillingTest extends TestBase
{
	
	FormFillingPage ffp;
	
	public FormFillingTest()
	{
		super();
		System.out.println("MainConstructorMainAttacker");
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("setUp");
		initialization();
		ffp = new FormFillingPage();
	}
	
	@Test
	public void FormFillTest()
	{
		ffp.fillForm("yes", "Hii", "MainAttacker", "first", "147859632");
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(), 'Submit another response')]")).isDisplayed());
	}
	
	@AfterMethod
	public void testDown()
	{
		driver.quit();
	}
	
}
