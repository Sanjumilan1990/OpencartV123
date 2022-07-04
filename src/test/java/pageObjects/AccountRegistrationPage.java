package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage 
{

WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	WebElement txtFirstName;
	
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="telephone")
	WebElement txtTelephone;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	
	@FindBy(name="agree")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
//	public void setTelephone(String tel)
//	{
//		txtTelephone.sendKeys(tel);
//	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
//	public void setConfirmPassword(String cnfpwd)
//	{
//		txtConfirmPassword.sendKeys(cnfpwd);
//	}
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		
		
		Actions act= new Actions(driver);
		//act.moveToElement(btnContinue).click().build().perform();  // double click using action class
		//act.doubleClick(btnContinue).perform();
		
		
		act.doubleClick(btnContinue).sendKeys(Keys.RETURN); // keyboard actions
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", btnContinue);
		//btnContinue.click();
	}
	
	
	public String getConfirmationMsg()
	{
		try
		{
		return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage()); 
		}
		
	}
	
	
}
