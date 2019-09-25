package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard_demo {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=driver_utility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
	  WebElement search=driver.findElement(By.id("small-searchterms"));
	  Actions act=new Actions(driver);
	  Thread.sleep(2000);
	  act.sendKeys(search,"computer").perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  }
}
