package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintion {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as_(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as_(String password){
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage shouble displayed")
	public void homepage_shouble_displayed() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if(text.contains("Welcome")) {
			System.out.println("verifed page");
		}else {
			System.out.println("not verifed page");
		}
	    	}

}
