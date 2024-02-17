package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterDashboardPage;
import pages.CraterItemPage;
import pages.CraterLoginPage;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;

public class CraterItemTests {

	CraterDashboardPage dashboard = new CraterDashboardPage();
	CraterItemPage item = new CraterItemPage();
	CraterLoginPage login = new CraterLoginPage();
	BrowserUtils utils = new BrowserUtils();
	
	@Given("As an entity user, I am logged in")
	public void as_an_entity_user_i_am_logged_in() {
		Driver.getDriver().get(DataReader.getProperty("crater_url"));
		utils.sendkeysWithActionsClass(login.emailField, DataReader.getProperty("crater_email"));
		login.passwordField.sendKeys(DataReader.getProperty("crater_password"));
		login.loginButton.click();
		//Assert.assertFalse(login.loginButton.isDisplayed());
	}
	@Given("I navigate to Items tab")
	public void i_navigate_to_items_tab() throws InterruptedException {
		utils.waitUntilElementClickable(dashboard.itemsLink);
		dashboard.itemsLink.click();
		Thread.sleep(500);
		


		
	}
	@When("I click on the Add Item button")
	public void i_click_on_the_add_item_button() {
		
		utils.waitForElementToBeVisible(item.AddItemsBtn);
	   item.AddItemsBtn.click();
	}
	@Then("I should be on item input page")
	public void i_should_be_on_item_input_page() {
	  utils.waitForElementToBeVisible(item.itemsPageHeader);
	  Assert.assertTrue(item.itemsPageHeader.isDisplayed());
	}
	@When("I provide item information name {string}, price {string}, unit {string}, and description {string}")
	public void i_provide_item_information_name_price_unit_and_description(String name, String price, String unit, String description) {
		utils.waitForElementToBeVisible(item.itemNameInput);;
		item.itemNameInput.sendKeys(name);
		item.itemPriceInput.sendKeys(price);
		item.itemUnitDropdwn.sendKeys(unit+ Keys.ENTER);
		item.itemDescriptionField.sendKeys(description);
		
	}
	@When("I click Save Item button")
	public void i_click_save_item_button() {
	   utils.waitUntilElementClickable(item.saveItemBtn);
	   item.saveItemBtn.click();
	}
	@Then("The Item is added to the Item list table")
	public void the_item_is_added_to_the_item_list_table() {
	    Assert.assertTrue(item.firstItemCheckbox.isDisplayed());
	}
	@Then("I delete the item")
	public void i_delete_the_item() {
		utils.waitForElementToBeVisible(item.firstItemCheckbox);
	    item.firstItemCheckbox.click();
	    item.actionsDropDown.click();
	    item.deleteBtn.click();
	    item.confirmDeleteBtn.click();
	}
	
	@When("I select the item {string}")
	public void i_select_the_item(String string) {
	    utils.waitForElementToBeVisible(item.firstItemCheckbox);
	    item.itemBook.click();
	}
	@When("I should be on item details page")
	public void i_should_be_on_item_details_page() {
	Assert.assertTrue(item.editItemText.isDisplayed());
	}
	@When("I update the item price to {int} dollars")
	public void i_update_the_item_price_to_dollars(int int1) {
		utils.waitForElementToBeVisible(item.itemPriceInput);
		item.itemPriceInput.clear();
	   item.itemPriceInput.sendKeys(String.valueOf(int1*100));
	}
	@When("I click Update Item button")
	public void i_click_update_item_button() {
		utils.waitUntilElementClickable(item.updateItemBtn);
	    item.updateItemBtn.click();
	  
	}
	@Then("The Item price is updated to {int} dollars")
	public void the_item_price_is_updated_to_dollars(Integer int1) {
	  
	}
	
	
	
	
}
