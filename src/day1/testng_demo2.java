package day1;

import org.testng.annotations.Test;

public class testng_demo2 {
  @Test(priority=1)
  public void login() {
	  System.out.println("This is login method");
  }
  @Test(priority=1)
  public void logout() {
	  System.out.println("This is logout method");
  }
  @Test(priority=3)
  public void homepage() {
	  System.out.println("This is homepage method");
  }
}
