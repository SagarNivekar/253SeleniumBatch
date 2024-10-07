package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsBeforeAfterClass {
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
	@AfterClass
void setup() {
	System.out.println("HII");

}
	@BeforeClass
void display() {
	System.out.println("Biye");
}

}
