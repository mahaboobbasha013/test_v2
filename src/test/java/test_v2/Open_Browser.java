package test_v2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Open_Browser {
//	public WebDriver driver;
//	@BeforeMethod
//	public void test1() {
//		System.out.println(" before method");
//	}
//	
//	@Test
//	public void navigateApplication() {
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
////		driver=new ChromeDriver();
//		WebDriver driver= new ChromeDriver();
//		driver.get("http://www.google.com");
////		driver.get("https://www.google.com");
//	}
//	
//	@AfterMethod
//	public void test2() {
//		System.out.println("After method");
//	}
//
public WebDriver driver;

	@Test
public void NavigateApplication() {
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver/exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
