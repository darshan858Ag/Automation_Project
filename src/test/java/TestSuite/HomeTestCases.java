package TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTestCases {
	@Test
	void TextUsername()
	{
		Assert.assertEquals(6, 6);
	}
	@Test
	void TextPassword()
	{
		Assert.assertEquals(8, 4);
	}

	@Test
	void BtnSignin()
	{
		Assert.assertEquals(10, 10);
	}
}
