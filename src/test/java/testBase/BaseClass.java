package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{

	
	
public WebDriver driver;
	
	
	@BeforeClass()
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	// generating random string
	
	public String randomestring()
	{
		String generatedString= RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
	}
	
	
	// generating random NUMBER
	
	public int randomenumber()
	{
		String generatedString2= RandomStringUtils.randomNumeric(5);
		return(Integer.parseInt(generatedString2));
	} 
	
	
	
	
//	@AfterClass()
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
