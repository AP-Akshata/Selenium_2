package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class demo4 {
  @Test
  public void f() {
	  WebDriver driver=driver_utility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/login";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
	  Alert alt=driver.switchTo().alert();
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	  System.out.println("alert text is"+alt.getText());
	  alt.accept();
	  driver.close();
  }
}
