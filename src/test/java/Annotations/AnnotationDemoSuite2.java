package Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemoSuite2 {
	@Test
	void testcase5() {
		System.out.println("fifth test case");
	}
	@Test
void testcase6() {
	System.out.println("sixth test case");
	}
	@Test
void testcase7() {
	System.out.println("seven test case");
}
	@Test
void testcase8() {
	System.out.println("eight test case");
	
	
	
}
	@AfterSuite
void setup() {
	System.out.println("bye");

}
	@BeforeSuite
void display() {
	System.out.println("hii");
}



}
