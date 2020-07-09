package pkg.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg.base.base;

public class NavigationBars extends base {

	public NavigationBars() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//span[contains(text(),'Payment Estimator')]")
	WebElement Utility_PE;
	
	@FindBy (xpath="//ul[@class='site-nav-utility site-nav-link-container']//span[contains(text(),'Inventory')]")
	WebElement Utility_Inv;
	
	@FindBy (xpath="//span[contains(text(),'Contact Dealer')]")
	WebElement Utility_CD;
	
	@FindBy (xpath="//ul[@class='site-nav-utility site-nav-link-container']//span[contains(text(),'Shopping Tools')]")
	WebElement Utility_ST;
	
	@FindBy (xpath="//span[contains(text(),'What fits my budget?')]")
	WebElement Utility_WFB;
	 
	@FindBy (xpath="//h1[contains(text(),'Payment Estimator')]")
	WebElement Utility_PE_landing;
	
	@FindBy (xpath="//h1[contains(text(),'Inventory')]")
	WebElement Utility_Inv_landing;
	
	@FindBy (xpath="//h1[contains(text(),'Contact A Dealer')]")
	WebElement Utility_CD_landing;
	
	@FindBy (xpath="//h1[contains(text(),'Shopping Tools')]")
	WebElement Utility_ST_landing;
	
	@FindBy (xpath="//div[contains(text(),'What Fits My Budget?')]")
	WebElement Utility_WFB_landing;
	
	public boolean Utility_PE() throws Exception {
		Utility_PE.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Boolean b = Utility_PE_landing.isDisplayed();
		return b;
		}
	
	public boolean Utility_Inv() throws Exception {
		Utility_Inv.click();
		Boolean b = Utility_Inv_landing.isDisplayed();
		return b;
		}
	
	public boolean Utility_CD() throws Exception {
		Utility_CD.click();
		Thread.sleep(2000);
		Boolean b = Utility_CD_landing.isDisplayed();
		return b;
		}
	
	public boolean Utility_ST() throws Exception {
		Utility_ST.click();
		Thread.sleep(2000);
		Boolean b = Utility_ST_landing.isDisplayed();
		return b;
		}
	
	public boolean Utility_WFB() throws Exception {
		Utility_WFB.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Boolean b = Utility_WFB_landing.isDisplayed();
		return b;
		}
	
}
