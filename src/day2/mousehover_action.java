package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mousehover_action {
  @Test
  public void f() throws InterruptedException {
	 WebDriver driver=driver_utility.getDriver("chrome");
	 String url="https://www.hdfcbank.com/";
	 driver.get(url);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 Actions act1=new Actions(driver);
	 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	 Thread.sleep(2000);
	 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
	 Thread.sleep(2000);
	 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().build().perform();
	 System.out.println("The page title is"+driver.getTitle());
	 Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	 driver.close();
  }
}
