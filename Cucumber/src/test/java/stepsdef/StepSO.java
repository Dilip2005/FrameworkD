package stepsdef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepSO {

	public ChromeDriver driver;
	public static ChromeOptions option;
	@Given("Open the chrome browser and maximize")
	public void Open_the_chrome_browser_and_maximize() {
		WebDriverManager.chromedriver().setup();
		 option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
	}
	@Given("Type the username as {string}")
	public void type_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Type the password as {string}")
	public void type_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
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
	public void type_the_company_name_as_(String companyName) {
		
		driver.findElement(By.className("inputBox")).sendKeys(companyName);
	}
	
	@When("Type the first name as {string}")
	public void type_the_first_name_as_(String firstName) {
		
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@When("Type the last name as {string}")
	public void type_the_last_name_as_(String lastName) {
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
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
