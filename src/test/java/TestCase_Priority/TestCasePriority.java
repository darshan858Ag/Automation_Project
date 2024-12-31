package TestCase_Priority;

import org.testng.annotations.Test;

public class TestCasePriority {
@Test(priority=1)
void register()
{
	System.out.println("Register");
}
@Test(priority=2)
void Login()
{
	System.out.println("Login");
}
@Test(priority=3)
void home()
{
	System.out.println("Home");
}
@Test(priority=4)
void Logout()
{
	System.out.println("Logout");
}

}
