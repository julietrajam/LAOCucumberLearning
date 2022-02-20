package stepswithexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginwithExamples {

	public WebDriver driver;
	
	@Given("Open the browser")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@And("Load the application URL as {string}")
	public void loadUrl(String url)
	{
		driver.get(url);
	}
	
	@And("Enter the username as {string}")
	public void enterUsername(String userName)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Click on Login button")
	public void clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify HomePage is displayed")
	public void verifyHomePage()
	{
		boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if(displayed)
			System.out.println("Home Page displayed");
		else
			System.out.println("Home Page not displayed");
	}
	
	@But("Error should be displayed")
	public void verifyErrorMessage()
	{
		System.out.println("Error Messageg displayed");
	}
	
}
