package test_v2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("http://www.google.com");
	String Title=driver.getTitle();
	System.out.println(Title);
	driver.navigate().to("http://amazon.com");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.close();
	driver.quit();
	
	}
}
