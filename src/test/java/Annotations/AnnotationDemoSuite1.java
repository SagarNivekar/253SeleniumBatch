package Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemoSuite1 {
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
	@AfterTest
void setup() {
	System.out.println("HII");

}
	@BeforeTest
void display() {
	System.out.println("Biye");
}




}
