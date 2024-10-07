package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class)

public class TestCasesL {
	@Test (priority = 1)
	void passTestCase()
	{
		Assert.assertTrue(true);
	}
   @Test (priority = 2)
	void failedTestCase(){
		Assert.assertTrue(false);
	}
    @Test (priority = 3)
       void skippedTestCase()
	{
		throw new SkipException("");
	}

	}


