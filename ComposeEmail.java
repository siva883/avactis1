package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ComposeEmail {
  WebDriver driver;
	
  @Test
  public void f() {
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://accounts.google.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
