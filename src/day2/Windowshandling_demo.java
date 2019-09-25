package day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Windowshandling_demo {
  @Test
  public void f() {
	  WebDriver driver=driver_utility.getDriver("chrome");
	  String url="http://demo.guru99.com/popup.php";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String  parentWindow=it.next();
	  String  childWindow=it.next();
	  driver.switchTo().window(childWindow);
	  driver.findElement(By.name("emailid")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.name("btnLogin")).click();
	  System.out.println(("url of the page"+driver.getCurrentUrl()));
	  driver.close();
	  driver.switchTo().window(parentWindow);
	  System.out.println(("parent window title"+driver.getTitle()));
  }
}
