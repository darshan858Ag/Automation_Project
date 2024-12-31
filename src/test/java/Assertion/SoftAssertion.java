package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
@Test
void SoftAsertion()
{
	//Soft Assertion
	SoftAssert sa=new SoftAssert();
	System.out.println(1);
    sa.assertEquals(3, 3);
    
    System.out.println(2);
    sa.assertEquals(2, 9);
    
    System.out.println(3);
    sa.assertEquals(9, 12);
    
    System.out.println(4);
    sa.assertEquals(6, 6);
}
}
