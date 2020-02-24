package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement orgname;
	@FindBy(xpath = "//input[@name='commit']")
	private WebElement orgcontinue;
	
	public OrganizationPage(WebDriver d2)
	{
		PageFactory.initElements(d2, this);
	}
	
	public void companyname() {
		orgname.sendKeys("BigBinary");
	}
	public void continueorg() {
		orgcontinue.click();
	}
}
