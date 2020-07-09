package pkg.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pkg.base.base;
import pkg.pages.Carousel;
import pkg.pages.NavigationBars;

public class NavigationBarsTest extends base {
		NavigationBars n;
	public NavigationBarsTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialize();
		n= new NavigationBars();	
	}
	
	@Test public void Utility_Payment_Estimator() throws Exception { 
		Boolean b=n.Utility_PE();
		Assert.assertTrue(b,"Utility-Payment Estimator is not redirecting to correct page"); 
		 }
	
	@Test public void Utility_Inventory() throws Exception { 
		Boolean b=n.Utility_Inv();
		Assert.assertTrue(b,"Utility-Inventory is not redirecting to correct page"); 
		 }

	@Test public void Utility_ContactDealer() throws Exception { 
		Boolean b=n.Utility_CD();
		Assert.assertTrue(b,"Utility-Contact Dealer is not redirecting to correct page"); 
		 }
	
	@Test public void Utility_ShoppingTools() throws Exception { 
		Boolean b=n.Utility_ST();
		Assert.assertTrue(b,"Utility-Shopping Tools is not redirecting to correct page");
		 }
		
	@Test public void Utility_WhatFitsMyBudget() throws Exception { 
		Boolean b=n.Utility_WFB();
		Assert.assertTrue(b,"Utility-What Fits My Budget is not redirecting to correct page");
		 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}