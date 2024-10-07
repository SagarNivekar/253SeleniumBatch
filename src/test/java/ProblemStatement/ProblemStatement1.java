package ProblemStatement;

import org.testng.annotations.Test;

public class ProblemStatement1 {
	
	@Test (priority = 2)
	void display() {
		
		System.out.println("This is first test case");
		
	}
	@Test (priority =4 )
     void show() {
    	 
    	 System.out.println("This is second test case");
     }
     @Test (priority = 6)
     void m1() {
    	 System.out.println("This is third test case");
     }
    	 @Test(priority = 1)
         void m2() {
        	 System.out.println("This is fourth test case");
    	 }
    	
    	 @Test(priority = 3)
         void m3() {
        	 System.out.println("This is fifth test case");
    	 }
        	 @Test (priority = 5)
             void m4() {
            	 System.out.println("This is sixth test case");
            	 
        	 
     }
}
