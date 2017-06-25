package cucumber.AlkuApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepsdefs {
	
	public static WebDriver driver;
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","/Users/juanespinosa/Documents/Selenium/Firefox Driver/geckodriver");

		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://alku.ph3.com.mx");
		driver.findElement(By.xpath(".//*[@class='fa fa-sign-in']")).click();
		
	}
	   

	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@type='submit']")).click();

	}
	   

	@Then("^Message displayed login Successfully$")
	public void message_displayed_login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	    
	}

	@When("^User Logout from the Application$")
	public void user_Logout_from_the_Application() throws Throwable {
		driver.findElement(By.xpath(".//*[@class='dropdown user user-menu']")).click();
		driver.findElement(By.xpath(".//*[@class='pull-right']")).click();

	    
	}

	@Then("^Message displayed Logout Succesfully$")
	public void message_displayed_Logout_Succesfully() throws Throwable {
		System.out.println("Logout Successfully");
		driver.quit();

	    
	}
	
	@Then("^Message displayed login Failed$")
	public void message_displayed_login_Failed() throws Throwable {
		System.out.println("Login Failed");

	}

}
