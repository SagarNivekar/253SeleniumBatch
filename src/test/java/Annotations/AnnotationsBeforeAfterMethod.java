package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsBeforeAfterMethod {
	@Test
	void testcase1() {
		System.out.println("first test case");
	}
	@Test
void testcase2() {
	System.out.println("second test case");
	}
	@Test
void testcase3() {
	System.out.println("third test case");
}
	@Test
void testcase4() {
	System.out.println("fourth test case");
	
	
	
}
	@AfterMethod
void setup() {
	System.out.println("HII");

}
	@BeforeMethod
void display() {
	System.out.println("Biye");
}
}
