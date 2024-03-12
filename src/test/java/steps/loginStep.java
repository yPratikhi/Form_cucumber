package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.Timeout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {
	WebDriver driver;
	@Given("user  opens chrome and enters url")
	public void user_opens_chrome_and_enters_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yprat\\OneDrive\\Documents\\seleniumGride\\chromedriver.exe\\");
driver = new ChromeDriver();

driver.get("https://v1.training-support.net/selenium/login-form");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("user enter username")
	public void user_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("user enter password")
	public void user_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("password");
	}

	@When("clicks on login")
	public void clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Welecome back message is displayed")
	public void welecome_back_message_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Login Successful");
	   Thread.sleep(2000);
	   driver.close();
	}
}
