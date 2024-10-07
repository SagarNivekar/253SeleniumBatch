package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemoTest2 {
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
	@AfterTest
void setup() {
	System.out.println("byetest2");

}
	@BeforeTest
void display() {
	System.out.println("hiitest2");
}


}
