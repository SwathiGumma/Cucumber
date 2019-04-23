package addcucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCuCum {
	static WebDriver driver;
	@Given("The user is in the add customer page")
	public void the_user_is_in_the_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2018-12-R-win32-x86_64\\eclipse\\swathi\\Addcustomer\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill the valid customer details")
	public void the_user_fill_the_valid_customer_details() {
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.id("fname")).sendKeys("swa");
		driver.findElement(By.id("lname")).sendKeys("gumma");
		driver.findElement(By.name("addr")).sendKeys("chennai");	    
	}
	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	    
	}


	@Then("The user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}


}
