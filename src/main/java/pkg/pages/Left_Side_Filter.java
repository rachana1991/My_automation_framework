package pkg.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pkg.base.base;

public class Left_Side_Filter extends base{

	public Left_Side_Filter() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	@FindAll(@FindBy(xpath = "//div[@class='BNVPsFci']//ul//li//a"))
			public List<WebElement> all_filter_links;
	
	@FindAll(@FindBy(xpath = "//ul[@class='_3vOGY44X']//li//div//a//div//header//span[1]"))
	public List<WebElement> all_labels;
	
	@FindBy(xpath = "//div[@class='XnQ6l_fQ']//button[1]")
	WebElement show_More_Offers;
	
	@FindBy(xpath = "//div[@id='root']//div//a")
	WebElement go_to_homepage;
	
	@FindBy(xpath="//a[@class='_1GDn-xtM']")
	WebElement kbb_img;
	
	public boolean featured() {
		all_filter_links.get(0).click();
		String u=driver.getCurrentUrl();
		if(u.contains("filters=featured"))
			return true;
		else
		return false;
	}
	
	public void Check_Left_Side_Filter() throws Exception {
		System.out.println("Total filters on page : "+all_filter_links.size());
		for(int i=1; i<all_filter_links.size();i++)
		{
		String a =all_filter_links.get(i).getText();
		System.out.println(i+": "+a);
		all_filter_links.get(i).click();
		Thread.sleep(2000);

		while(show_More_Offers.isEnabled()) {
			show_More_Offers.click();
		}
		System.out.println("Total number of offers: "+all_labels.size());
		for(int j=0;j<all_labels.size();j++)
		{
			String p= all_labels.get(j).getText();
			Assert.assertEquals(p,a);
		}
		go_to_homepage.click();
		Thread.sleep(2000);
		}
		}
	
	public void kbb() {
		String a= kbb_img.getAttribute("href");
		kbb_img.click();
		String u=driver.getCurrentUrl();
		Assert.assertEquals(u,a,"KBB link is not redirecting to correct page");
	}
	
}
