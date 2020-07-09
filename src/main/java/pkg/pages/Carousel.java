package pkg.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg.base.base;

public class Carousel extends base {

	public Carousel() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	//section[@class='_1kBmA6vL']//div//div//div[2]//div//div
	
	@FindBy (xpath="//div[@id='slick-slide00']")
	WebElement carousel_1;
	
	@FindBy (xpath="//div[@id='slick-slide01']")
	WebElement carousel_2;
	
	@FindBy (xpath="//div[@id='slick-slide02']")
	WebElement carousel_3;
	
	@FindBy (xpath="//div[@id='slick-slide03']")
	WebElement carousel_4;
	
	@FindBy (xpath="//div[@id='slick-slide04']")
	WebElement carousel_5;
	
	@FindBy (xpath="//h1[contains(text(),'RAV4 Hybrid')]")
	WebElement carousel_1_landing;
	
	@FindBy (xpath="//h1[contains(text(),'All Offers')]")
	WebElement carousel_2_landing;
	
	@FindBy (xpath="//h1[contains(text(),'Customer Support Program')]")
	WebElement carousel_3_landing;
	
	@FindBy (xpath="//h1[contains(text(),'Find a Dealer')]")
	WebElement carousel_4_landing;
	
	@FindBy (xpath="//h1[contains(text(),'Trade-in Value')]")
	WebElement carousel_5_landing;
	
	@FindBy (xpath="//button[@class='bx-next unstyled']")
	WebElement nextbutton;
	
	
	public boolean verifycarousel_1() {
		carousel_1.click();
		Boolean b = carousel_1_landing.isDisplayed();
		return b;
		}
	
	public boolean verifycarousel_2() {
		nextbutton.click();
		carousel_2.click();
		Boolean b = carousel_2_landing.isDisplayed();
		return b;
		}
	
	public boolean verifycarousel_3() throws Exception {
		nextbutton.click();
		Thread.sleep(1000);
		nextbutton.click();
		carousel_3.click();
		Boolean b = carousel_3_landing.isDisplayed();
		return b;
		}
	
	public boolean verifycarousel_4() throws Exception {
		nextbutton.click();
		Thread.sleep(1000);
		nextbutton.click();
		Thread.sleep(1000);
		nextbutton.click();
		carousel_4.click();
		Boolean b = carousel_4_landing.isDisplayed();
		return b;
		}
	
	public boolean verifycarousel_5() throws Exception {
		nextbutton.click();
		Thread.sleep(1000);
		nextbutton.click();
		Thread.sleep(1000);
		nextbutton.click();
		Thread.sleep(1000);
		nextbutton.click();
		Thread.sleep(1000);
		carousel_5.click();
		Boolean b = carousel_5_landing.isDisplayed();
		return b;
		}
	
	public void carousel() {
		
		
	}
}
