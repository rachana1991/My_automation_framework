package pkg.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pkg.base.base;
import pkg.pages.Carousel;


public class CarouselTest extends base {

	Carousel c;
	
	public CarouselTest() throws IOException {
		super();
	}

	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialize();
		c= new Carousel();	
	}
	
	@Test(priority=1) public void verifycarousel1() { 
		Boolean b=c.verifycarousel_1();
		Assert.assertTrue(b,"Carousel 1 not redirecting to correct page"); 
		 }
	
	@Test(priority=2) public void verifycarousel2() { 
		Boolean b=c.verifycarousel_2();
		Assert.assertTrue(b,"Carousel 2 not redirecting to correct page"); 
		 }
	
	@Test(priority=3) public void verifycarousel3() throws Exception { 
		Boolean b=c.verifycarousel_3();
		Assert.assertTrue(b,"Carousel 3 not redirecting to correct page"); 
		 }
	
	@Test(priority=4) public void verifycarousel4() throws Exception { 
		Boolean b=c.verifycarousel_4();
		Assert.assertTrue(b,"Carousel 4 not redirecting to correct page"); 
		 }
	
	@Test(priority=5) public void verifycarousel5() throws Exception { 
		Boolean b=c.verifycarousel_5();
		Assert.assertTrue(b,"Carousel 5 not redirecting to correct page"); 
		 }
	
	
	@Test public void carousel() {
		c.carousel();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
