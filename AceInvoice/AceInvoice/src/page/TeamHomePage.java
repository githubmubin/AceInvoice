package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamHomePage {

	@FindBy(xpath = "//th[.='Name']/ancestor::table[@class='table team-members-table']/descendant::td[@class='sorting_1']")
	private WebElement verifyname;
	@FindBy(xpath = "//th[.='Name']/ancestor::table[@class='table team-members-table']/descendant::td[3]")
	private WebElement verifyemail;
	
	public TeamHomePage(WebDriver d1)
	{
		PageFactory.initElements(d1, this);
	}
	public String verifyname()
	{
		String username = verifyname.getText();
		return username;
	}
	public String verifyadd()
	{
		String useraddress = verifyemail.getText();
		return useraddress;
	}

}
