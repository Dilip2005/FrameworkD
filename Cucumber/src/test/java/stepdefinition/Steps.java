package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {

	public static ChromeDriver driver;
	public static ChromeOptions option;

	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		 option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		driver = new ChromeDriver(option);
	}

	@Given("Load the url")
	public void load_the_url() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://login.salesforce.com");
	}

	@Given("Enter user name as {string}")
	public void enter_user_name_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter password as {string}")
	public void enter_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("Click on the toggle menu button from the left corner")
	public void click_on_the_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Then("Click View All")
	public void click_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	
	  @Then("Click Sales from App Launcher")
	  public void  click_sales_from_app_launcher() {
	  driver.findElement(By.xpath("//p[text()='Sales']")).click();
	  }
	  
	  @Then("Click on Opportunity tab")
	  public void click_on_opportunity_tab() {
	  WebElement click1 = driver.findElement(By.xpath("//span[text()='Opportunities']")); 
	  driver.executeScript("arguments[0].click;", click1);
	  }
 
	
	
	  @Then("Click on New button") 
	  public void click_on_new_button() {
	  driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Opportunityname"); 
	  }
	 
	  @Given("Enter Opportunity name as Salesforce Automation by sasikala")
	  public void enter_opportunity_name_as_salesforce_automation_by_sasikala() {
	     
	  }

	  @Given("Choose todays close date {int}\\/{int}\\/{int}")
	  public void choose_todays_close_date(Integer int1, Integer int2, Integer int3) {
		  driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys();
	  }

}