package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class createStepDefinintinon {
	static WebDriver driver;
	@Given("I navigate to the Magento homepage")
	public void i_navigate_to_the_magento_homepage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://magento.softwaretestingboard.com/");
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) throws InterruptedException {
	 driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
		
	}

	@When("I fill in the registration form with valid details")
	public void i_fill_in_the_registration_form_with_valid_details() {
	    driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Vinod");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Singh");
	    driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("vinod11@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Singh@123");
	    driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Singh@123");
	       
	}

	@When("I submit the form")
	public void i_submit_the_form() {
		driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
	}

	@Then("I should see a successful registration message")
	public void i_should_see_a_successful_registration_message() {
		WebElement successMessage = driver.findElement(By.cssSelector("Thank you for registering with Main Website Store"));
  
	}

	@When("I log in with the newly created account")
	public void i_log_in_with_the_newly_created_account() {
		driver.findElement(By.xpath("//div[@class='panel header']//li[@data-label='or']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vinod11@gmail.com");
	    driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']"));
	    driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
	}

	

}
