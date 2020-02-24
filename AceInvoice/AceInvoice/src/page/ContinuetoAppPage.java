package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinuetoAppPage {

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement contapp;
	
	public ContinuetoAppPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void continuetoapp() {
		contapp.click();
	}
}
