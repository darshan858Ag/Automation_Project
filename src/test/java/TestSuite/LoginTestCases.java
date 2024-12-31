package TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {
	@Test
	void Logout()
	{
		Assert.assertEquals(5, 7);
	}
	@Test
	void Dashboard()
	{
		Assert.assertEquals(80,80);
	}

	@Test
	void AboutUs()
	{
		Assert.assertEquals(9,9);
	}
}
