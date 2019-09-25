package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriver_demo1 {
	WebDriver driver=null;
  @Test
  public void BrowserLaunch() {
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers\\IEDriverServer.exe");
	  //System.setProperty("webdriver.chrome.driver", "C:\Users\training_b6B.01.16\Desktop\Browser Drivers\chromedriver.exe");
	  driver=new InternetExplorerDriver();
	  //driver=new ChromeDriver();
	  String url="http://www.google.com";
	  driver.get(url);
  }
}
