package testNGConcept;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// either can be done as @Listeners before class name and provide package.TestListener.class
// or can be mentioned in xml if multiple classes are being listened

@Listeners(testNGConcept.TestListener.class)

public class TestingListenerConcpet {

	@Test
	public void Test1() {
		System.out.println("Passing Test");
		Assert.assertTrue(true);
	}
	
	@Test
	public void Test2() {
		System.out.println("Failing Test");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"Test2"})
	public void Test3() {
		System.out.println("Skipping Test");
		Assert.assertTrue(true);
	}
	
}
