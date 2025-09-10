package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(xpath="//input[@placeholder= 'Username']")
	WebElement USERNAME;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement PASSWORD;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LOGINBTN;
	
	
	
	
	public void LoginPageDriver(WebDriver driver) {
		
		this.driver=driver;   
		
		PageFactory.initElements(driver, this );

	}
	public void user_open_the_url_as(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void user_should_enter_login_credentials(io.cucumber.datatable.DataTable dataTable) {

		String username = dataTable.cell(0, 0);

		String password = dataTable.cell(0, 1);

		USERNAME.sendKeys(username);
		PASSWORD.sendKeys(password);

	}

	public void user_should_click_on_the_login_button() throws InterruptedException, IOException {
		
		
		LOGINBTN.click();
		Thread.sleep(2000);
	}

}
