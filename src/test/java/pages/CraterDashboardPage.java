package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterDashboardPage {

	
	public CraterDashboardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//a[@href=\"/admin/items\"]")
	public WebElement itemsLink;
	
	@FindBy(xpath = "//h6[text()=\"Due Invoices\"]")
	public WebElement dueInvoiceText;
}
