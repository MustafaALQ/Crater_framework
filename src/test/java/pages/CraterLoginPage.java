package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterLoginPage {

	
	public CraterLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//*[starts-with(@class,'flex')])[3]")
	public WebElement emailField;
	
	@FindBy(id = "loginForm")
	public WebElement field;
	

	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement loginButton;
	
}
