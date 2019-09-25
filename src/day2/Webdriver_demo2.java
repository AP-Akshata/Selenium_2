package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Webdriver_demo2 {
  @Test
  public void f() {
	  WebDriver driver=driver_utility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("the title of the webpage is"+driver.getTitle());
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("lalitha");
	  driver.findElement(By.id("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertTrue(driver.getTitle().equals("Home"));
	  driver.findElement(By.linkText("SignOut")).click();
  }
}
