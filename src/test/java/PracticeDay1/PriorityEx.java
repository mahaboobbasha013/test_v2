package PracticeDay1;

import org.testng.annotations.Test;

public class PriorityEx {
	@Test(priority=2)
public void method1() {
		System.out.println("Method 1");
	}
	@Test(priority=1)
	public void method2() {
		System.out.println("Method 2");
	}
	@Test(priority=0)
public void Method3() {
	System.out.println("Method 3");
}
}
