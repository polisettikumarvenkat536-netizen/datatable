package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class overview {

	WebDriver driver;

	public void overview_cart(WebDriver driver) {
		this.driver = driver;

	}
	
	
	public void user_should_click_on_the_finish_button() {
		driver.findElement(By.xpath("//button[@id='finish']")).click();
	}
	
	public void user_should_close_the_browser() {
		driver.quit();
	}

}
