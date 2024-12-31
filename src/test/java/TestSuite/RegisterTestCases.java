package TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestCases {
@Test
void txtFirst()
{
	Assert.assertEquals(3, 2);
}
@Test
void txtLastName()
{
	Assert.assertEquals(4, 4);
}

@Test
void txtEmail()
{
	Assert.assertEquals(8, 9);
}


}
