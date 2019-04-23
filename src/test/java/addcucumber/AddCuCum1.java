package addcucumber;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCuCum1 {
	static WebDriver driver;
	@Given("the user is in the add customer page")
	public void the_user_is_in_the_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2018-12-R-win32-x86_64\\eclipse\\swathi\\Addcustomer\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	
	}

	@When("the user fill the valid customer details")
	public void the_user_fill_the_valid_customer_details(DataTable details) {
	  List<String> list = details.asList(String.class);
	  System.out.println(list);
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		driver.findElement(By.id("fname")).sendKeys(list.get(0));
		driver.findElement(By.id("lname")).sendKeys(list.get(1));
		driver.findElement(By.id("email")).sendKeys(list.get(2));
		driver.findElement(By.name("addr")).sendKeys(list.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(list.get(4));
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();

	}

	@Then("the user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());


	}
}
