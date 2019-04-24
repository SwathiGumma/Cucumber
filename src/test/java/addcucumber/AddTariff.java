package addcucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariff {
	static WebDriver driver;



	@Given("The user is in the add tariff plan page")
	public void the_user_is_in_the_add_tariff_plan_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2018-12-R-win32-x86_64\\eclipse\\swathi\\Addcustomer\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	
	}

	@When("The user fill in the plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_the_plan_details(String month, String freeloc, String freeint, String sms, String locharges, String intharges, String test) {
driver.findElement(By.id("rental1")).sendKeys(month);
driver.findElement(By.id("local_minutes")).sendKeys(freeloc);
driver.findElement(By.id("local_minutes")).sendKeys(freeint);
driver.findElement(By.id("sms_pack")).sendKeys(sms);
driver.findElement(By.id("minutes_charges")).sendKeys(locharges);
driver.findElement(By.id("inter_charges")).sendKeys(intharges);
driver.findElement(By.id("sms_charges")).sendKeys(test);


	}

	@When("The user clicks the submit button in triff plan")
	public void the_user_clicks_the_submit_button_in_triff_plan() {
		driver.findElement(By.id("submit")).click();

	}

	@Then("The user should see the success msg")
	public void the_user_should_see_the_success_msg() {
Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	}
}
