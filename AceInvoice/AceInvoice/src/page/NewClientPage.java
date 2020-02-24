package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewClientPage {

	@FindBy(xpath = "//a[@class='btn btn-outline']")
	private WebElement skipthis;
	public NewClientPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	public void skipprocess(WebDriver d) {
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView();",skipthis );	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}skipthis.click();
	}
}
