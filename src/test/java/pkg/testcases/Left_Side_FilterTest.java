package pkg.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pkg.base.base;
import pkg.pages.Left_Side_Filter;

public class Left_Side_FilterTest extends base {

	Left_Side_Filter f;
	
	public Left_Side_FilterTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialize();
		f= new Left_Side_Filter();	
	}
	
		@Test public void Verify_Featured_link() throws Exception { 
		boolean b= f.featured();	
		Assert.assertTrue(b);
		 }
	
	/*  @Test public void Verify_Left_Side_Filter() throws Exception { 
		f.Check_Left_Side_Filter();	
		 }
	
	
	@Test public void Verify_KBB_link() throws Exception { 
		f.kbb();	
		 }
	*/
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
