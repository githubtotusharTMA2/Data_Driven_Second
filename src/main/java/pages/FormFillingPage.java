package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;


import base.TestBase;

public class FormFillingPage extends TestBase
{ 

	@FindBy(xpath = "(//div[@class = 'appsMaterialWizToggleRadiogroupOnRadio exportInnerCircle'])[1]")
	WebElement yesButton;
	
	@FindBy(xpath = "(//div[@class = 'appsMaterialWizToggleRadiogroupOnRadio exportInnerCircle'])[2]")
	WebElement noButton;
	
	@FindBy(xpath = "(//input[@jsname = 'YPqjbf'])[1]")
	WebElement hello;
	
	@FindBy(xpath = "(//input[@jsname = 'YPqjbf'])[2]")
	WebElement name;
	
	@FindBy(xpath = "//div[@class = 'quantumWizMenuPaperselectOption appsMaterialWizMenuPaperselectOption freebirdThemedSelectOptionDarkerDisabled exportOption isSelected isPlaceholder']")
	WebElement classDropDown;
	
	@FindBy(xpath = "(//input[@jsname = 'YPqjbf'])[3]")
	WebElement number;
	
	@FindBy(xpath = "//span[contains(text(), 'Submit')]")
	WebElement submitButton;
	
	public FormFillingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillForm(String firstButton, String helloFieldInput, String nameInMethod, String classdd, String numberInMethod)
	{

		((JavascriptExecutor) driver).executeScript("yesButton.style.display='block';");
		yesButton.click();
		hello.sendKeys(helloFieldInput);
		name.sendKeys(nameInMethod);
		
		Select slct = new Select(classDropDown);
		slct.selectByVisibleText("classdd");
		
		number.sendKeys(numberInMethod);
		
		submitButton.click();
	}
	
	
}
