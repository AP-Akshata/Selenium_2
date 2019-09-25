package day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testngAssertions_demo1 {
  @Test(priority=1)
  public void f1() {
	  SoftAssert sa=new SoftAssert();
	  System.out.println("Chceking 1st validation");
	  sa.assertEquals(11, 12);
	  sa.assertEquals(11, 11);
	  sa.assertEquals(12, 12);
	  sa.assertAll();
  }
  @Test(priority=2)
  public void f2() {
	  System.out.println("Chceking 2nd validation");
	  Assert.assertEquals(11, 12);
	  Assert.assertEquals(11, 11);
  }
}
