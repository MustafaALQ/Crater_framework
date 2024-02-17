package utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	public static WebDriver driver;
	
	public static WebDriver getDriver()	{
		
		String browser = System.getProperty("Browser");
		if(browser==null) {

			browser = DataReader.getProperty("browser");		
		}
		if(driver== null) {
			
			switch(browser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new ChromeDriver();
				break;
			case "chrome-headless":
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("headless");
				chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(chromeOptions);
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
				default:
					driver = new ChromeDriver();
					break;
			}
	
		}
		
		return driver;
	}
	
	
}
