package test_v2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlesEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		String parentwindow=driver.getWindowHandle();
//		System.out.println(parentwindow);
//		driver.manage().window().maximize();
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String>windowhandles=driver.getWindowHandles();
//		for(String windowhandle : windowhandles) {
//			if(!windowhandle.equals(parentwindow)) {
//				driver.switchTo().window(windowhandle);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("Hello");
//				Thread.sleep(3000);
//				//driver.close();
//			}
//		}
//		driver.switchTo().window(parentwindow);
//		driver.findElement(By.id("name")).sendKeys("World");
//		driver.close();
		//one more example
//		driver.get("https://demoqa.com/browser-windows");
//		driver.manage().window().maximize();
//		String parentwindow=driver.getWindowHandle();
//		System.out.println(parentwindow);
//		driver.findElement(By.id("windowButton")).click();
//		Set<String>windowhandles=driver.getWindowHandles();
//		for(String windowhandl:windowhandles) {
//			if(!windowhandles.equals(parentwindow)) {
//				driver.switchTo().window(windowhandl);
//				driver.manage().window().maximize();
//				Thread.sleep(3000);
//			}
//		}
//		WebElement text=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
//		System.out.println(text.getText());
	driver.get("https://demoqa.com/text-box");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hello World");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='userName']")).clear();

	}
	}
