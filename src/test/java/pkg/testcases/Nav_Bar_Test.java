package pkg.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pkg.base.base;
import pkg.pages.Nav_bar;


public class Nav_Bar_Test extends base{

	Nav_bar l;
	
	public Nav_Bar_Test() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialize();
		l= new Nav_bar();	
	}
	/*
	@Test public void Navigation_UtilityBar() throws Exception { 
	   l.Nav_utility();	
	 }
	
	@Test public void Navigation_MainMenuBar() throws Exception { 
		l.Nav_main();	
		 }
	
	@Test public void Navigation_Hamburger_fav_offers() throws Exception { 
		l.Nav_hamburger_fav();	
		 }
	
	@Test public void Navigation_Hamburger_featured_accor_1() throws Exception { 
		l.Nav_hamburger_accr1();	
		 }
	
	@Test public void Navigation_Hamburger_featured_accor_2() throws Exception { 
		l.Nav_hamburger_accr2();	
		 }
	*/
	@Test public void Navigation_Hamburger_featured_accor_3() throws Exception { 
		l.Nav_hamburger_accr3();	
		 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
