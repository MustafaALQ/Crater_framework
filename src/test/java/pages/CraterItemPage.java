package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterItemPage {

	
	public CraterItemPage() {
		PageFactory.initElements(Driver.getDriver(), this);
    }
	
	
	
	@FindBy(xpath = "//h3[text()=\"Items\"]")
	public WebElement itemsPageHeader;
	
	@FindBy(xpath = "(//button[starts-with(@class, 'inline-flex')])[2]")
	public WebElement AddItemsBtn;
	
	@FindBy(xpath = "//h3[text()=\"New Item\"]")
	public WebElement newItemText;
	
	@FindBy(xpath = "//input[@type=\"text\" and starts-with(@class, \"font-base\")]")
	public WebElement itemNameInput;
	
	@FindBy(id = "0")
	public WebElement itemPriceInput;
	
	@FindBy(xpath = "//input[@type=\"text\" and starts-with(@class, \"w-full\")]")
	public WebElement itemUnitDropdwn;
	
	@FindBy(xpath = "//li[starts-with(@class, \"flex\")]")
	public  List<WebElement> itemUnitList;
	
	@FindBy(xpath = "//textarea[@name= \"description\"]")
	public WebElement itemDescriptionField;
	
	@FindBy(xpath = "//button[@type= \"submit\"]")
	public WebElement saveItemBtn;
	
	@FindBy(xpath ="(//input[@type=\"checkbox\"])[2]")
	public WebElement firstItemCheckbox;
	
	@FindBy(xpath = "//span[contains(@class,\"flex\")]")
	public WebElement actionsDropDown;
	
	@FindBy(xpath = "//a[@role=\"menuitem\"]")
	public WebElement deleteBtn;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement confirmDeleteBtn;
	
	@FindBy(xpath="//a[@href='/admin/items']")
	public WebElement itemsLink;
	
	@FindBy(xpath= "//*[text()=\"Books\"]")
	public WebElement itemBook;
	
	@FindBy(xpath ="//h3[text()=\"Edit Item\"]")
	public WebElement editItemText;
	
	@FindBy(xpath = "//*[text()=\" Update Item\"]")
	public WebElement updateItemBtn;
	
	
}
