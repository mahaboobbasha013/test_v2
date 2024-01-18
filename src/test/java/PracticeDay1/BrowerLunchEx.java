package PracticeDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowerLunchEx {
public WebDriver driver;
	@Test
public void NavigateBrowser() {
		System.setProperty("WebDriver.chrome.driver", "C.//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
driver.quit();
	}
}
