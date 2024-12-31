package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
@Test
void LoginTestCases()
{
	//Hard assertion
	System.out.println(1);
	Assert.assertEquals(3,3);
	
	System.out.println(2);
	Assert.assertEquals(4,4);
	
	System.out.println(3);
	Assert.assertEquals(4,9);
	
	System.out.println(4);
	Assert.assertEquals(10,10);
	
	
	
	
}
}
