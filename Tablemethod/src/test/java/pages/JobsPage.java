package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class JobsPage {

	WebDriver driver;
	

	public void JobsPageDriver(WebDriver driver) {

		
		this.driver = driver;

	}

	public void user_should_click_on_admin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
	}

	public void user_should_select_the_job() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		Thread.sleep(2000);
	}

	public void user_should_click_on_job_titles() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
		Thread.sleep(2000);
	}

	public void user_should_enter_job_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {

		List<List<String>> JobsRecord = dataTable.cells();

		for (int i = 0; i < JobsRecord.size() ; i++) { // i=0<4=true, 0+1=1<4==true 2<4, 3<4,4<4==false

			String jobtitle = JobsRecord.get(i).get(0); // 1,0

			String jobdescription = JobsRecord.get(i).get(1); // 1,1

			String jobnote = JobsRecord.get(i).get(2); // 3,2

			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			
			Thread.sleep(1000);
			
			

			driver.findElement(By.xpath(("(//input[@class='oxd-input oxd-input--active'])[2]"))).sendKeys(jobtitle);

			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(jobdescription);
			driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(jobnote);
			
			Thread.sleep(2000);
		

			driver.findElement(By.xpath("//button[text()=' Save ']")).click();
			Thread.sleep(2000);

		}
	}

}
