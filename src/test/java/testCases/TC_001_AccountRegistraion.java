package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistraion extends BaseClass
{

	
	
	
	@Test
	public void test_acc_registration()
	{
		driver.get("http://localhost/opencart/upload/");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName("John");
		regpage.setLastName("Canedy");
		regpage.setEmail(randomestring()+"@gmail.com");
		//regpage.setTelephone("65656565");
		regpage.setPassword("abcxyz");
		//regpage.setConfirmPassword("abcxyz");
		regpage.setPrivacyPolicy();
		
		regpage.clickContinue();
		
		/*String confmsg=regpage.getConfirmationMsg();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}*/
		
		
		if(driver.getTitle().equals("MyAccount"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	
	}
	

	
	
	
	
	
	
	
}
