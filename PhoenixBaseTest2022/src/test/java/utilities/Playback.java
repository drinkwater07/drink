package utilities;


import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;
import resources.PropertiesFile;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class Playback {

	
	 public static ITestContext testContext;
	 public static Actions actionDriver; // This variable used as Actions Driver which is used for some interactive actions.
     public static WebDriver driver;   // This variable contains the web browser driver
     public static ITestResult testResult;

     
    //public static ObjectIdentification objectIdentification = new ObjectIdentification();
     
     public static boolean driverNotExist = false; //This variable ensures the driver
     public static int windowCount = 0; //This variable contains the current window count.
     public static String TestContexModuleName = null; // This variable contains the current context module name
 
     //public static String BrowserType;
     public static String browserType =  PropertiesFile.readPropertiesFile("BrowserType");
     public static String driverPath =  PropertiesFile.readPropertiesFile("driverPath");
    public  static String nodeUrl;
    
    
    final static String IP = PropertiesFile.readPropertiesFile("HubURL");
    final static String PORT = PropertiesFile.readPropertiesFile("HubPort");
     // This method is used to start the driver instance of specified
     // web browser which is defined in the configuration file.
   // protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    
    public static Capabilities capabilities;
    
     public static WebDriver StartDriver()       
     {

     	switch (browserType)
         {
     	
                //Run Local IE
             case "IE":
            	// nodeUrl = "http://192.168.144.57:5555/wd/hub";
             	System.setProperty("webdriver.ie.driver",driverPath+"\\IEDriverServer.exe");
             	//DesiredCapabilities options = new DesiredCapabilities();
             	//options.setBrowserName("IE");
             	//options.setPlatform(Platform.WINDOWS);
             	InternetExplorerOptions  options = new InternetExplorerOptions();
                 options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);                    
                 options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
                 options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                 options.setCapability("browserstack.ie.enablePopups","accept");            
                 options.setCapability("requireWindowFocus", true);
                 options.destructivelyEnsureCleanSession();                   
                 driver = new InternetExplorerDriver();
			//try {
			//	 driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options.getCapability(capabilityName)
			//} catch (MalformedURLException e) {
			//	 TODO Auto-generated catch block
			//	e.printStackTrace();
		//	}
                 break;
                 
                 
                //Run Local Chrome
             case "ChromeIDE":
            	
            	 //IDe Setup
         	 System.setProperty("webdriver.chrome.driver",driverPath+"\\chromedriver.exe");    
                  ChromeOptions option = new ChromeOptions();
            	option.merge(option);
            	option.addArguments("--disable-popup-blocking");
            	option.addArguments("--disable-notifications");
            	option.addArguments("disable-infobars");
            	option.addArguments("--disable-translate");
            	option.setExperimentalOption("useAutomationExtension", false);
            	option.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
            	//option.setExperimentalOption("credentials_enable_service", false);
            	//option.setExperimentalOption("profile.password_manager_enabled", false);
            	
            	
            	Map<String, Object> preferences = new Hashtable<String, Object>();
            	option.setExperimentalOption("prefs", preferences);

            	// disable flash and the PDF viewer
            	preferences.put("plugins.plugins_disabled", new String[] {
            	    "Chrome PDF Viewer"
            	});
            	
            	driver = new ChromeDriver(option);
                 driver.manage().window().maximize();
                 break;
                 
                 
                 
                //Chrome Grid
             case "ChromeGrid":


            	//Grid setup
            	// WebDriverManager.chromedriver().remoteAddress(TestContexModuleName) .setup();
            	String nodeUrl = "http://" + IP + ":" + PORT + "/wd/hub";

            	//String nodeUrl = "http://192.168.10.216:4444/wd/hub";
            	//System.setProperty("webdriver.chrome.driver",driverPath+"\\chromedriver.exe");
            	// ChromeOptions option = new ChromeOptions();
            	DesiredCapabilities chromeOptionGrid = new DesiredCapabilities();
            	chromeOptionGrid.setBrowserName("chrome");
            	chromeOptionGrid.setPlatform(Platform.WINDOWS);
            	ChromeOptions optionGrid = new ChromeOptions();
            	chromeOptionGrid.merge(optionGrid);
            	optionGrid.addArguments("--disable-popup-blocking");
            	optionGrid.addArguments("--disable-notifications");
            	optionGrid.addArguments("disable-infobars");
            	optionGrid.addArguments("--disable-translate");
            	optionGrid.setExperimentalOption("useAutomationExtension", false);
            	optionGrid.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
            	// optionGrid.setExperimentalOption("credentials_enable_service", false);
            	// optionGrid.setExperimentalOption("profile.password_manager_enabled", false);
            	Map<String, Object> prefs = new HashMap<String, Object>();
            	prefs.put("credentials_enable_service", false);
            	prefs.put("profile.password_manager_enabled", false);



            	optionGrid.setExperimentalOption("prefs", prefs);
            	//driver = new ChromeDriver(option);
            	// driver.manage().window().maximize();

            	/* driver = WebDriverManager.chromedriver()
            	.capabilities(optionGrid)
            	.remoteAddress(nodeUrl)
            	.create();*/
            	try {
            	driver = new RemoteWebDriver(new URL(nodeUrl), optionGrid);
            	} catch (MalformedURLException e) {
            	// TODO Auto-generated catch block
            	e.printStackTrace();
            	}
            	driver.manage().deleteAllCookies();
            	driver.manage().window().maximize();
            	// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            	// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

            	/* SessionId sessionid = ((RemoteWebDriver) driver).getSessionId();
            	System.out.println(sessionid);
            	driver.get("http://"+IP+":"+PORT+"/grid/api/testsession?session="+sessionid);
            	String nodeDetails = driver.findElement(By.xpath("//pre")).getText();

            	JsonStreamParser parser = new JsonStreamParser(nodeDetails);
            	JsonObject obj = parser.next().getAsJsonObject();

            	System.out.println("Node name: "+obj.get("proxyId").getAsString());*/

            	break;
 

             case "ChromeDocker":
            	 
            	 String nodeUrlDocker  =    "http://" + IP + ":" + PORT + "/wd/hub";
            //	       final String nodeUrlDocker = "http://192.168.10.217:4444/wd/hub";
                 System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
                 DesiredCapabilities chromeOptionDoc = new DesiredCapabilities();
                 chromeOptionDoc.setCapability("resolution", "1920x1080");
                 chromeOptionDoc.setBrowserName("chrome");
                 chromeOptionDoc.setPlatform(Platform.LINUX);
                 ChromeOptions optionDoc = new ChromeOptions();
                 optionDoc.merge(chromeOptionDoc);
                 optionDoc.addArguments("--start-maximized") ;
                 optionDoc.addArguments("--disable-dev-shm-usage");
                 optionDoc.addArguments("--disable-popup-blocking");
                 optionDoc.addArguments("--disable-notifications");
                 optionDoc.addArguments("disable-infobars");
                 optionDoc.addArguments("--disable-translate");
                 optionDoc.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
                 optionDoc.setExperimentalOption("useAutomationExtension", false);
                 try {
                     Playback.driver = new RemoteWebDriver(new URL(nodeUrlDocker),optionDoc);
                 }
                 catch (MalformedURLException e) {
                     e.printStackTrace();
                 }
                 Playback.driver.manage().deleteAllCookies();
                 Playback.driver.manage().window().maximize();
                 Playback.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                 Playback.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
                 break;
             
                 
                 
             case "Edge":
             	System.setProperty("webdriver.edge.driver", driverPath+"\\chromedriver.exe");
             	 driver = new EdgeDriver();
                 break;
                 
             default:
             	  System.setProperty("webdriver.ie.driver","\\\\chpnxfsvr\\qa\\PhoenixTest\\Drivers\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                 break;
         }

        actionDriver = new Actions(driver);

         return driver;      

      }
     
 	  	 	 	 		 
	 public static void start()
	 {
		 Playback.StartDriver(); 
		 
	 }
	 	 
     public static void setFocus()
    {
        Playback.pageLoadThreadWait();
        Playback.pageLoadThreadWait();
        ((JavascriptExecutor)Playback.driver).executeScript("window.focus();");
    }

     public static void pageLoadThreadWait()  {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
     public static void popupThreadWait()
     {
         try {
 			Thread.sleep(5000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
     }
     
     public static void gridLoadThreadWait()
     {
    	 try {
  			Thread.sleep(3000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
     }
     
	 public static void controlReadyThreadWait() 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	 public static void threadWait(int millisecondsTimeout ) 
	{
		try {
			Thread.sleep(millisecondsTimeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	 public static void threadWait() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
	 public static void wait(int secondsTimeout)
       {
           Playback.driver.manage().timeouts().implicitlyWait(secondsTimeout,TimeUnit.SECONDS);
       }
		
	 public static void waitForSearch()
     {

		 Playback.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     }
	 
	 public static void implictwait()
     {
		 Playback.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     }
   
	 public static void waitForPageLoad()
     {

		 Playback.driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
     }
	
	 public static void waitForControlReady()
     {

		 Playback.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     }
	 
	 

    // This method will stop the test driver and clean all the caches in the current test run.
    // If the test initialize will determine the continious run on suite without driver initialze 
    // for each test run and Closses all the screens expect Main window.
    public static void stop()
    {
        	//windowHandle.CloseAllThePopupScreens();
    	    
           // PoliceTest.ResetUIMap();
           // FireTest.ResetUIMap();
           // Playback.playbackSettings.ResetToDefault();

       //windowHandle.SwitchToMainWindow();
          //  Playback.SetFocus();
           // Actions action = new Actions(Playback.driver); 
           // action.sendKeys(Keys.F5).build().perform();
    	for (String appWindow : driver.getWindowHandles()) {
			if (driver.switchTo().window(appWindow).getTitle().contains("Public Safety Solution")) {

				driver.switchTo().window(appWindow);
				break;
			}
    	}

    	 Playback.driver.manage().deleteAllCookies();
    	
    	    Playback.pageLoadThreadWait();
            Playback.pageLoadThreadWait();
           // Playback.driver.close();
            Playback.driver.quit();
           // objectIdentification.reset();
                 
    }
    
    public static void setTestContextAttribute(String name,String value)
    {
         Playback.testContext.setAttribute(name, value);
    }
    
     public static String getTestContextAttribute(String name)
    {
         return Playback.testContext.getAttribute(name).toString();
         
     }

     public static void takeScreenShotOnFailure(String Name,String TabName) 
    		 throws IOException { 
    	 String date = Randomized.getCurrentDate("MMddyyyy");
    	
    	    	try {
    	        File scrFile = ((TakesScreenshot)Playback.driver).getScreenshotAs(OutputType.FILE); 
    	        FileUtils.copyFile(scrFile, new File("\\\\192.168.10.36\\RunResults\\"+date+"\\SmokeScreenShots\\"+Name.replace(" ", "")+"\\"+TabName.replace(" ", "")+".jpg"));
    	    	} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    	    
    	}
     
     public static void takeScreenShot(String Name,String TabName)
     {
    	 String date = Randomized.getCurrentDate("MMddyyyy");
     Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
     try {
         ImageIO.write(screenshot.getImage(),"PNG",new File("\\\\192.168.10.36\\RunResults\\"+date+"\\SmokeScreenShots\\"+Name.replace(" ", "")+"\\"+TabName.replace(" ", "")+".jpg"));
     } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }
     }
     
     public static void javaScreenShot()
     {
    	 
    	 try {
    		 
             Robot robot = new Robot();
  
             Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
             BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
             File file = new File("C:\\Users\\Mahesha\\Desktop\\TestIMG\\screen-capture.png");
             boolean status = ImageIO.write(bufferedImage, "png", file);
             System.out.println("Screen Captured ? " + status + " File Path:- " + file.getAbsolutePath());
  
         } catch (AWTException | IOException ex) {
             System.err.println(ex);
         }
     }

}
