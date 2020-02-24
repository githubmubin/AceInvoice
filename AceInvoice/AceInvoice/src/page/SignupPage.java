package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	//declaration
		@FindBy(xpath="//input[@class='form-control']")
		private WebElement email;
		@FindBy(xpath = "//input[@type='submit']")
		private WebElement getstarted;
		@FindBy(xpath = "//input[@name='password']")
		private WebElement password;
		@FindBy(xpath = "//input[@name='password_confirmation']")
		private WebElement confirm_password;
		@FindBy(xpath = "//input[@value='Continue']")
		private WebElement continuepass;
		
		//initialization
		public SignupPage(WebDriver d1) {
			PageFactory.initElements(d1, this);
		}
		
		//utilization
		public void enterEmail(String mail) {
			email.click();
			email.sendKeys(mail);
		}
		public void submitclick() {
			getstarted.click();
		}
		public void enterpassword(String pass)
		{
			password.sendKeys(pass);
		}
		public void confirmpassword(String conpass)
		{
			confirm_password.sendKeys(conpass);
		}
		public void passcontinue()
		{
			continuepass.click();
		}

}
