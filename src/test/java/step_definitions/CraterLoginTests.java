package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterDashboardPage;
import pages.CraterLoginPage;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;

public class CraterLoginTests {
	
	CraterLoginPage login = new CraterLoginPage();
	BrowserUtils utils = new BrowserUtils();
	CraterDashboardPage dashbaord = new CraterDashboardPage();
	
	@Given("User is in the login page")
	public void user_is_in_the_login_page() {
	    Driver.getDriver().get(DataReader.getProperty("crater_url"));
	    
	}

	@When("user enters valid email and valid password")
	public void user_enters_valid_email_and_valid_password() throws InterruptedException {
		utils.waitForElementToBeVisible(login.emailField);
	    utils.sendkeysWithActionsClass(login.emailField, DataReader.getProperty("crater_email"));
	    login.passwordField.sendKeys(DataReader.getProperty("crater_password"));
	}

	@When("user clicks on the Login in button")
	public void user_clicks_on_the_login_in_button() throws InterruptedException {
		login.loginButton.click();
	  
	}

	@Then("User is logged in successfully")
	public void user_is_logged_in_successfully() {
		utils.waitForElementToBeVisible(dashbaord.dueInvoiceText);
	    Assert.assertTrue(dashbaord.dueInvoiceText.isDisplayed());
	}
	
	
	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String email, String password) {
		utils.sendkeysWithActionsClass(login.emailField, password);
		login.passwordField.sendKeys(password);
	}
	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

							
	
}
