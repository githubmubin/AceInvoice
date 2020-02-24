package tests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.ContinuetoAppPage;
import page.IntroductionPage;
import page.NewClientPage;
import page.OrganizationPage;
import page.SignupPage;
import page.TeamHomePage;

public class TestCase {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://qa.aceinvoice.com/sign_up");
			
			SignupPage ab=new SignupPage(driver);
			//generating random number 
			Random randomgenrator=new Random();
			int rint = randomgenrator.nextInt(1000);
			//using that number with string
			String mailaddress="Dummy"+rint+"@mail.com";
			ab.enterEmail(mailaddress);
			ab.submitclick();
			Thread.sleep(2000);
			ab.enterpassword("12345678");
			ab.confirmpassword("12345678");
			ab.passcontinue();
			Thread.sleep(2000);
			
			IntroductionPage ip=new IntroductionPage(driver);
			String fname="First";
			String lname="Last";
			String fullname=(fname+" "+lname);
			ip.enterfirstname(fname);
			ip.enterlastname(lname);
			ip.conditioncheck();
			ip.continueselect(driver);
			Thread.sleep(2000);
			
			OrganizationPage op=new OrganizationPage(driver);
			op.companyname();
			op.continueorg();
			Thread.sleep(2000);
			
			NewClientPage np=new NewClientPage(driver);
			np.skipprocess(driver);
			Thread.sleep(2000);
			
			ContinuetoAppPage ca=new ContinuetoAppPage(driver);
			ca.continuetoapp();
			Thread.sleep(2000);
			
			TeamHomePage tp=new TeamHomePage(driver);
			String s1 = tp.verifyname();
			String s2 = tp.verifyadd();
			System.out.println(fullname+" "+mailaddress);
			System.out.println(s1+" "+s2);
			if(fullname.contentEquals(s1) && mailaddress.contentEquals(s2)) {
				System.out.println("The Name and Mail Address is Correct");
			}else
			{
				System.out.println("The Name or Mail Address is InCorrect");
			}
			Thread.sleep(2000);
			driver.close();
	}		
}


