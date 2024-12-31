package TestCase_Priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
@Test
void display()
{
	//Assert is used to validate test cases
	Assert.assertEquals(3, 3);
}
@Test
void show()
{
	//Assert is used to validate test cases
	Assert.assertEquals(3, "Hello");
}

void insert()
{
	// not method for test case
	System.out.println("insert method");
}
}
