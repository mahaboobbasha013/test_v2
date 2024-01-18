package test_v2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandleEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        String parentwindow=driver.getWindowHandle();
        System.out.println(parentwindow+driver.getTitle());
        driver.findElement(By.id("newWindowsBtn")).click();
        //while(windowhandle)
        Set<String>windowhandle1=driver.getWindowHandles();
        for(String windowhandles_basic:windowhandle1) {
        	if(!windowhandle1.equals(parentwindow)) {
        		driver.switchTo().window(windowhandles_basic);
        		driver.manage().window().maximize();
        		Thread.sleep(3000);
        		driver.close();
        	}
        }
        Set<String>windowhandle2=driver.getWindowHandles();
        for(String windowhandles:windowhandle2) {
        	if(!windowhandle2.equals(windowhandle1)) {
        		driver.switchTo().window(windowhandles);
        		driver.manage().window().maximize();
        		driver.close();
        	}
        }
        driver.switchTo().window(parentwindow);
        	
        
       
	}
	

}
