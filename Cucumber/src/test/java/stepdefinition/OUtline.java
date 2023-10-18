package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OUtline {
public ChromeDriver driver;
	
	@Given("Open the chrome browser1")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@Given("Type the username as demoCsr")
	public void type_the_username_as_demoCsr() {
		driver.findElement(By.id("username")).sendKeys("demoCsr");
	}
	@Given("Type the password as crmsfa")
	public void type_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();

	    
	}
	@Then("Verify the home page is displayed")
	public void verify_the_home_page_is_displayed() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if(text.contains("Welcome")) {
			System.out.println("verifed page");
		}else {
			System.out.println("not verifed page");
		}
	    
	}
	@Given("Click CRMSFA Link")
	public void click_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Given("Click Leads Tab")
	public void click_leads_tab() {
		 driver.findElement(By.linkText("Leads")).click();
	   
	}
	@Given("Click Create Leads Link")
	public void click_create_leads_link() {
		  driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Type the company name as {string}")
	public void type_the_company_name_as_qeagle(String companyName) {
		 driver.findElement(By.className("inputBox")).sendKeys(companyName);
	}
	@When("Type the first name as {string}")
	public void type_the_first_name_as_hari(String firstName) {
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@When("Type the last name as {string}")
	public void type_the_last_name_as_r(String lastName) {
		 driver.findElement(By.name("lastName")).sendKeys(lastName);
		  
	 
	}
	@When("Click Create Leads Button")
	public void click_create_leads_button() {
		 driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("Verify the View Leads Page")
	public void verify_the_view_leads_page() {
	   System.out.println("sccussful"); 
	}

}
