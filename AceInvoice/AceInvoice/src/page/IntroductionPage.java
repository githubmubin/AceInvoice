package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntroductionPage {

	@FindBy(xpath = "//input[@name='user[first_name]']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='user[last_name]']")
	private WebElement lastname;
	@FindBy(xpath = "(//div[@class='control__indicator'])[5]")
	private WebElement checkcondition;
	@FindBy(xpath = "//input[@name='commit']")
	private WebElement contiueform;
	
	public IntroductionPage(WebDriver d1)
	{
		PageFactory.initElements(d1,this);
	}
	public void enterfirstname(String fname) {
		firstname.sendKeys(fname);
	}
	public void enterlastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void conditioncheck() {
		checkcondition.click();
	}
	public void continueselect(WebDriver d1) {
		JavascriptExecutor js=(JavascriptExecutor) d1;
		js.executeScript("arguments[0].scrollIntoView();",contiueform );	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}contiueform.click();
	}
}
