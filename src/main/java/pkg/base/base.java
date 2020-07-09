package pkg.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;
	public static Properties prop;
	
	public base() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\racmhatr\\eclipse-workspace\\SaatchiAutomation\\src\\main\\java\\pkg\\config\\prop.properties");
		prop.load(fis);  
	}
	
	public static void initialize() {
		
		String browser=prop.getProperty("browser");
    	if(browser.equals("chrome")) {
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\racmhatr\\drivers\\chromedriver_win32\\chromedriver.exe");
    	    driver=new ChromeDriver();
    	    String url=prop.getProperty("url");
    	    driver.get(url);   
    	    }
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public void takescreenshot(String result) {
		
    	try {
    		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(src,new File("C:\\Users\\racmhatr\\eclipse-workspace\\SaatchiAutomation\\Screenshots\\"+result+"_screenshot.png"));
    		}								
   
    		catch (IOException e){
    			e.printStackTrace();
    		}
}
	
	
}
