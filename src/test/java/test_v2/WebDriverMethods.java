package test_v2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("hello");
		WebElement l=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		String str=l.getCssValue("font-size");
		System.out.println(str);
		driver.findElement(By.xpath("//input[@value='Google Search']"));
		String str1=l.getCssValue("font-style");
		System.out.println(str1);
		driver.findElement(By.xpath("//input[@value='Google Search']"));
		String str2=l.getAriaRole();
		System.out.println(str2);
		
		//System.out.println();
		//driver.close();
	}

}
