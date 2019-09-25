package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_demo3 {
  @Test
  public void f1() {
	  Assert.assertTrue(30<20);
  }
  @Test
  public void f2() {
	  Assert.assertTrue(30>20);
  }
  @Test
  public void f3() {
	  Assert.assertFalse("akshata".equals("ramya"));
  }
  @Test
  public void f4() {
	  Assert.assertFalse(30>20);
  }
  @Test
  public void f5() {
	  Assert.assertTrue("hello".startsWith("e"));
  }
  @Test
  public void f6() {
	  Assert.assertEquals("hello","hello");
  }
  @Test
  public void f7() {
	  Object obj1=null;
	  Assert.assertNull(obj1);
  }
  @Test
  public void f8() {
	  Object obj2=new Object();
	  Assert.assertNull(obj2);
  }
}
