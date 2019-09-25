package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_demo3 {
  @Test
  public void f() {
		  WebDriver driver=driver_utility.getDriver("chrome");
		  String url="http://demowebshop.tricentis.com/";
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.navigate().refresh();
		  System.out.println("the title of the webpage is"+driver.getTitle());
		  driver.findElement(By.className("ico-login")).click();
		  driver.findElement(By.name("Email")).sendKeys("aravind.guggilla57@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("aravind");
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		  Assert.assertTrue(driver.getTitle().contains("demo"));
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
  }
}
