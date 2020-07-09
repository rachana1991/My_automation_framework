package pkg.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pkg.base.base;

public class Nav_bar extends base{

	public Nav_bar() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(xpath = "//div[@class='lQzDXIbd']//ul//li//a"))
    public List<WebElement> nav_util_links;
	
	@FindAll(@FindBy(xpath = "//ul[@class='_3IXmo2pv']//li//a"))
    public List<WebElement> nav_main_links;
	
	@FindBy(xpath = "//button[@class='naJEsvmC']")
    WebElement ham_menu;
	
	@FindBy(xpath = "//button[@class='naJEsvmC _2JyTWD1f']")
    WebElement ham_menu_close;
	
	
	@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[1]//a//span[text()='Favorite Offers']")
	WebElement fav_offers;
	
	@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[1]//a//span[text()='Favorite Offers']/parent::a")
	WebElement fav_offers_href;
	
	@FindBy(xpath = "//ul[@class='-CfgAgA_']//li//button//span[text()='Featured']")
	WebElement featured;
	
	
	@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[2]//div//ul//li[1]//button//span")
	WebElement accr1;
	
	@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[2]//div//ul//li[2]//button//span")
	WebElement accr2;
	
	@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[2]//div//ul//li[3]//button//span")
	WebElement accr3;
	
	@FindAll(@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[2]//div//ul//li[1]//div//ul//li//a"))
	public List<WebElement> accr1_all_links;
	
	@FindAll(@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[2]//div//ul//li[2]//div//ul//li//a"))
	public List<WebElement> accr2_all_links;
	
	@FindAll(@FindBy(xpath = "//ul[@class='-CfgAgA_']//li[2]//div//ul//li[3]//div//ul//li//a"))
	public List<WebElement> accr3_all_links;
	
	
	public void Nav_utility() throws Exception {
		System.out.println(nav_util_links.size());
		for(int i=0; i<nav_util_links.size();i++)
		{
		String a =nav_util_links.get(i).getAttribute("href");
		System.out.println(a);
		if(a.contains("certified")) {
			continue;
			}
		nav_util_links.get(i).click();
		String b= driver.getCurrentUrl();
		System.out.println(b);
      Assert.assertEquals(b,a);
		driver.navigate().back();
		}
		}
	
	public void Nav_main() throws Exception {
			System.out.println(nav_main_links.size());
		for(int i=0; i<nav_main_links.size();i++)
		{
			String a =nav_main_links.get(i).getAttribute("href");
			System.out.println(a);
			if(a.contains("vehicle")) {
			continue;
			}
			nav_main_links.get(i).click();
			String b= driver.getCurrentUrl();
			System.out.println(b);
		    Assert.assertEquals(b,a);
		    driver.navigate().back();
		}
	}
		
		
		public void Nav_hamburger_fav() throws Exception {
			ham_menu.click();
			String a= fav_offers_href.getAttribute("href");
			fav_offers.click();
			String b= driver.getCurrentUrl();
			Assert.assertEquals(b,a);
		}
		
		public void Nav_hamburger_accr1() throws Exception {
			System.out.println(accr1_all_links.size());
			for(int i=0; i<accr1_all_links.size();i++)
			{
			ham_menu.click();
			featured.click();
			accr1.click();
			
			String a =accr1_all_links.get(i).getAttribute("href");
			System.out.println(a);
			accr1_all_links.get(i).click();
			String b= driver.getCurrentUrl();
			System.out.println(b);
	      Assert.assertEquals(b,a);
			driver.navigate().back();
			}
		}
		
		public void Nav_hamburger_accr2() throws Exception {
			System.out.println(accr2_all_links.size());
			for(int i=0; i<accr2_all_links.size();i++)
			{
			ham_menu.click();
			featured.click();
			accr2.click();
			
			String a =accr2_all_links.get(i).getAttribute("href");
			System.out.println(a);
			accr2_all_links.get(i).click();
			String b= driver.getCurrentUrl();
			System.out.println(b);
	      Assert.assertEquals(b,a);
			driver.navigate().back();
			}
		}
		
		public void Nav_hamburger_accr3() throws Exception {
			System.out.println(accr3_all_links.size());
			for(int i=0; i<accr3_all_links.size();i++)
			{
			ham_menu.click();
			featured.click();
			accr3.click();
			
			String a =accr3_all_links.get(i).getAttribute("href");
			System.out.println(a);
			if((a.contains("facebook"))||(a.contains("instagram"))||(a.contains("youtube"))||(a.contains("twitter"))){
				ham_menu_close.click();
				continue;
				}
			accr3_all_links.get(i).click();
			String b= driver.getCurrentUrl();
			System.out.println(b);
	      Assert.assertEquals(b,a);
			driver.navigate().back();
			}
		}
}
