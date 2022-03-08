package scripts;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class BrowserStack
{
  public static final String USERNAME = "ragaranjani1";
  public static final String AUTOMATE_KEY = "sQ7mndoyZmiiyG49Nmem";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  @Test
  public static void main() throws Exception {
    DesiredCapabilities caps = new DesiredCapabilities();
    
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "80");
    caps.setCapability("browserstack.local", "true");
    caps.setCapability("name", "ragaranjani1's First Test");
    
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://192.168.14.82/police/login.aspx");
	Thread.sleep(5000);
	Thread.sleep(5000);
    driver.findElement(By.id("usrLogin_txtUserName")).sendKeys("automation");
    driver.findElement(By.id("usrLogin_txtPassword")).sendKeys("");
    driver.findElement(By.id("usrLogin_lstProductDB")).sendKeys("");
    driver.findElement(By.id("usrLogin_cmdLogin")).click();
    
    System.out.println(driver.getTitle());
    driver.quit();
  }
}