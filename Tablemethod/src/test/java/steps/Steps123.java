package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.JobsPage;
import pages.LoginPage;

public class Steps123 {
	WebDriver driver;
	
	LoginPage LP;
	
	JobsPage JP;
	
	HomePage HP;

	@Given("user should launch the chrome")
	public void user_should_launch_the_chrome() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@Then("user open the url  as {string}")
	public void user_open_the_url_as(String url) {
		
		LP = new LoginPage();    //classname variablename = new classname
		
		LP.LoginPageDriver(driver);
		
		LP.user_open_the_url_as(url);

	}

	@Then("user should enter login credentials")
	public void user_should_enter_login_credentials(io.cucumber.datatable.DataTable dataTable) {
		
		LP.LoginPageDriver(driver);
		LP.user_should_enter_login_credentials(dataTable);

	}

	@Then("user should click on the login button")
	public void user_should_click_on_the_login_button() throws InterruptedException, IOException {
		
		LP.LoginPageDriver(driver);
		LP.user_should_click_on_the_login_button();
		

	}

	@Given("user should click on Admin")
	public void user_should_click_on_admin() throws InterruptedException {
		
		JP = new JobsPage();
		
		JP.JobsPageDriver(driver);
		
		JP.user_should_click_on_admin();

	}

	@Then("user should select the job")
	public void user_should_select_the_job() throws InterruptedException {
		
		JP.JobsPageDriver(driver);
		JP.user_should_select_the_job();

	}

	@Then("user should click on job titles")
	public void user_should_click_on_job_titles() throws InterruptedException {
		
		JP.JobsPageDriver(driver);
		JP.user_should_click_on_job_titles();

	}

	@Then("user should clikc on add")
	public void user_should_clikc_on_add() throws InterruptedException {

	}

	@Then("user should enter job details")
	public void user_should_enter_job_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		
		JP.JobsPageDriver(driver);
		JP.user_should_enter_job_details(dataTable);

	}

	@Then("click save btn")
	public void click_save_btn() {
		JP.JobsPageDriver(driver);
		

	}

	@Then("logout")
	public void logout() {
		HP = new HomePage();
		
		HP.HomePageDriver(driver);
		HP.logout();
	}

	@Then("close browser")
	public void close_browser() {
		
		HP.HomePageDriver(driver);
		HP.close_browser();

	}

}
