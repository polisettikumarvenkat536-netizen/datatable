package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkout_info {
	
	WebDriver driver;
	
	public void checkout(WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	
	public void user_should_enter_the_firstname_as_and_lastname_as_and_zip_code_as(String firstname, String lastname,
			String zipcode) throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(zipcode);
	Thread.sleep(200);
	}
	
	public void user_should_click_on_the_continue_button() {
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	}

}
