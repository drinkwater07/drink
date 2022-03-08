package reports;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.ISuite;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import resources.PropertiesFile;
import utilities.Playback;
import utilities.Randomized;

public class ExtentReport 
{
	static String date = Randomized.getCurrentDate("MMddyyyy");
	final static String IP = PropertiesFile.readPropertiesFile("HubURL");
    final static String PORT = PropertiesFile.readPropertiesFile("HubPort");
	static String url =  PropertiesFile.readPropertiesFile("url");
	  static  String Setup; 
	 static String projectName;
	 
	 public static ExtentSparkReporter htmlReporter;
	 
	 public static ExtentSparkReporter htmlSmokeReporter;
	 public static ExtentReports extent;
	 
	 public static ExtentReports extentSmoke;
	 public static  ExtentTest logger;
	 
	 public static  ExtentTest loggerSmoke;
	 public static  ExtentTest childLogger;
	 
	 public static String nodeIp;
	 //public static  ExtentTest Console;
	 
	 public static String screenName;

	
	 static String name = null ;
	 
	 static{  
			if(url.contains("87"))
				Setup="14.87";
			else if(url.contains("82"))
				Setup="14.82";
			else if(url.contains("45"))
				Setup="14.45";
			else if(url.contains("crmtest"))
				Setup="CRMTestServer";
			else if(url.contains("15.100"))
				Setup="15100Demo";
			 else if(url.contains("14.143"))
				   Setup = "14.143";
			 else if(url.contains("14.93"))
				   Setup = "14.93";
			 else
				 Setup = "Demo";
		  }
	 
	static {
		 HashMap<Integer,String> project=new HashMap<Integer,String>();
			project.put(1, "BaseSmokeTest");
			project.put(2, "PoliceSmokeTest");
			project.put(3, "FireSmokeTest");
			project.put(4, "IASmokeTest");
			project.put(5, "CRMSmokeTest");
			project.put(6, "CRMTestServerSmokeTest");
			project.put(7, "15100DemoSmokeTest");
			project.put(8,"NIBRSProject");
			project.put(9,"DemoSetup");
			
			if(System.getProperty("user.dir").contains("Base"))
				projectName = project.get(1);
			else	if(System.getProperty("user.dir").contains("Police"))
				projectName = project.get(2);
			else	if(System.getProperty("user.dir").contains("Fire"))
				projectName = project.get(3);
			else	if(System.getProperty("user.dir").contains("IA"))
				projectName = project.get(4);
			else	if(System.getProperty("user.dir").contains("CRM"))
				projectName = project.get(5);
			else	if(System.getProperty("user.dir").contains("NIBRS"))
				projectName = project.get(8);
			else
				projectName = project.get(9);
	 
	 }
	
// Defect scripts
	public static  void startReport(String suiteName) 
	 {
		
		String pattern = Pattern.quote(System.getProperty("file.separator"));
		String[] separatedfile = suiteName.split(pattern);
		String fileName =separatedfile[separatedfile.length-1];
		String folderName =separatedfile[separatedfile.length-2];
		String file = fileName;
	     if(file.contains(".")){
	    	 file= file.substring(0, file.indexOf(".")); 
	     }
    
	//	 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "./test-output/reports/ExtentReport"+file+".html");   
	     htmlReporter = new ExtentSparkReporter(("\\\\192.168.10.36\\RunResults\\"+date+"\\"+Setup+"\\"+folderName+"\\"+file+".html"));     
	     readHubMachineDetails();
		 		       
		 }
	
	public static  void startConsolidatedReport(String suiteName) 
	 {
		
		String pattern = Pattern.quote(System.getProperty("file.separator"));
		String[] separatedfile = suiteName.split(pattern);
		String fileName =separatedfile[separatedfile.length-1];
		String folderName =separatedfile[separatedfile.length-2];
		String file = fileName;
	     if(file.contains(".")){
	    	 file= file.substring(0, file.indexOf(".")); 
	     }
	     
	//	 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "./test-output/reports/ExtentReport"+file+".html");   
	     htmlSmokeReporter = new ExtentSparkReporter(("\\\\192.168.10.36\\RunResults\\"+date+"\\"+Setup+"\\"+folderName+"\\"+file+".html"));     
	     readHubMachineDetailsSmoke();
		 		       
		 }
	 public static void CreateTest(String name)
	 {	
		 
		   logger = extent.createTest(name);
		   System.out.println("Running ......      "+ name );
		nodeIp=   readNodeDetails();
		remainingTestScripts();
		   	
	 }
	 public static void CreateSmokeTest(String name)
	 {	
		 
		   logger = extent.createTest(name);
		   System.out.println("Running ......      "+ name );
		 	   	
	 }
	 public static  void startReportSmokeTest(String Module) 
	 {
		
		System.out.println(projectName+" ----- "+Setup);
	//	 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "./test-output/reports/ExtentReport"+file+".html");   
		htmlReporter = new ExtentSparkReporter(("\\\\192.168.10.36\\RunResults\\"+date+"\\"+Setup+"\\"+"SmokeTest"+"\\"+projectName+"\\"+Module+".html"));     
	     readHubMachineDetails();
		 		       
		 }
	public static String readNodeDetails() 
	{
		
//		 SessionId sessionid = ((RemoteWebDriver) Playback.driver).getSessionId();
//		  System.out.println(sessionid);
//		  Playback.driver.get("http://"+IP+":"+PORT+"/grid/api/testsession?session="+sessionid);
//         String nodeDetails = Playback.driver.findElement(By.xpath("//pre")).getText();
//         
//         JsonStreamParser parser = new JsonStreamParser(nodeDetails);
//         JsonObject obj = parser.next().getAsJsonObject();
//         
//      System.out.println("Running on Node :--- > "+obj.get("proxyId").getAsString());   
//      
//      return obj.get("proxyId").getAsString();
      
      SessionId sessionid = ((RemoteWebDriver) Playback.driver).getSessionId();
 	 URL url;
 	DocumentContext docCtx = null;
 	JsonPath jsonPath = null;
	try {
		url = new URL("http://" + IP + ":" + PORT + "/grid/api/testsession?session="+ sessionid);
		 docCtx = JsonPath.parse(url);
	 	  jsonPath = JsonPath.compile("$.proxyId");
	 	 System.out.println("Running on Node :--- > "+docCtx.read(jsonPath).toString());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	 
 	 return docCtx.read(jsonPath).toString();
	}
	public static void readHubMachineDetails()
	{
		
		htmlReporter.config().setEncoding("utf-8");
		 htmlReporter.config().setDocumentTitle("Automation Reports");          
		 htmlReporter.config().setReportName("Suite Files Result");         
		 htmlReporter.config().setTheme(Theme.DARK);
		 
		 name = null ;
		 try {
			name = InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 extent = new ExtentReports();
		 extent.setSystemInfo("Host Name",System.getProperties().get("user.name").toString());
		 extent.setSystemInfo("Machine",   name);
		 extent.setSystemInfo("Team", "Automation Team");
		 extent.attachReporter(htmlReporter);
	}
	public static void readHubMachineDetailsSmoke()
	{
		
		htmlSmokeReporter.config().setEncoding("utf-8");
		htmlSmokeReporter.config().setDocumentTitle("Automation Reports");          
		htmlSmokeReporter.config().setReportName("Suite Files Result");         
		htmlSmokeReporter.config().setTheme(Theme.DARK);
		 
		 name = null ;
		 try {
			name = InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 extentSmoke = new ExtentReports();
		 extentSmoke.setSystemInfo("Host Name",System.getProperties().get("user.name").toString());
		 extentSmoke.setSystemInfo("Machine",   name);
		 extentSmoke.setSystemInfo("Team", "Automation Team");
		 extentSmoke.attachReporter(htmlSmokeReporter);
	}
	
	// Defect scripts and Smoke
	// Defect scripts and Smoke
	 public static void CreateNode(String name)
	 {
		 childLogger= logger.createNode(name, "Running------>Screen   +"+name);
	 }
	
	// Global
	 public static String getScreenShot(WebDriver driver, String screenshotName) throws Exception 
	 {
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		// String destination = System.getProperty("user.dir") + "./test-output/reports/Screenshots/" + screenshotName + ".png";
		 String destination = "\\\\192.168.10.36\\RunResults\\"+date+"\\Screenshots\\"+"\\"+projectName.substring(0,5)+"\\" + screenshotName + ".png";
		 File finalDestination = new File(destination);
		 FileUtils.copyFile(source, finalDestination);
		 return destination;
		 }
	// Defect scripts
	 public static void getResult(ITestResult result) throws Exception
		{
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>"+ methodName;
			 if(result.getStatus() == ITestResult.FAILURE)
			 {
			 //MarkupHelper is used to display the output in different colors
			 logger.log(Status.FAIL, MarkupHelper.createLabel(logText+"----> FAILED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.RED));
			 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
			 logger.fail(result.getThrowable());
			// logger.log(Status.FAIL, MarkupHelper.createLabel(Thread.currentThread().getStackTrace().toString(), ExtentColor.RED));
			 //String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
			 //+Throwables.getStackTraceAsString(result.getThrowable())
			 String screenShot_Path = getScreenShot(Playback.driver, result.getName());
			 logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenShot_Path));
		
			 }
			 else if (result.getStatus() == ITestResult.SKIP) {
				 logger.log(Status.SKIP, MarkupHelper.createLabel(logText+"----> SKIPPED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.ORANGE)); 
			 }  
			 else if(result.getStatus() == ITestResult.SUCCESS)
			 {
			 logger.log(Status.PASS, MarkupHelper.createLabel(logText+"----> PASSED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.GREEN));
			 }
			
		}
	// Smoke
		public static void getResultSmoke(ITestResult result) throws Exception
		{
	
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>"+ methodName;
			 if(result.getStatus() == ITestResult.FAILURE)
			 {
				 
			 //MarkupHelper is used to display the output in different colors
				 childLogger.log(Status.FAIL, MarkupHelper.createLabel(logText+"----> FAILED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.RED));
				 childLogger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
				 childLogger.fail(result.getThrowable());
			// logger.log(Status.FAIL, MarkupHelper.createLabel(Thread.currentThread().getStackTrace().toString(), ExtentColor.RED));
			 //String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
			 //+Throwables.getStackTraceAsString(result.getThrowable())
			 String screenShot_Path = getScreenShot(Playback.driver, result.getName());
			 childLogger.fail("Test Case Failed Snapshot is below " + childLogger.addScreenCaptureFromPath(screenShot_Path));
			 
			 }
			 else if (result.getStatus() == ITestResult.SKIP) {
				 
				 childLogger.log(Status.SKIP, MarkupHelper.createLabel(logText+"----> SKIPPED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.ORANGE)); 
			 } 
			 else if(result.getStatus() == ITestResult.SUCCESS)
			 {
		
				 childLogger.log(Status.PASS, MarkupHelper.createLabel(logText+"----> PASSED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.GREEN));
			
			 }
			 else if(result.getStatus() == ITestResult.STARTED)
			 {
				 childLogger.log(Status.ERROR, MarkupHelper.createLabel(logText+"----> Error"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.RED));
				 childLogger.log(Status.ERROR,result.getThrowable());
			 }
			 else if(result.getStatus() == ITestResult.SUCCESS_PERCENTAGE_FAILURE)
			 {
				 childLogger.log(Status.WARNING, MarkupHelper.createLabel(logText+"----> PASSED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.BLUE));
				 childLogger.log(Status.ERROR,result.getThrowable());
			 }
				
		}
		
		
		//  Smoke
		public static void LogInfo(String name) throws Exception
		{		
					
			childLogger.log(Status.ERROR, MarkupHelper.createLabel(name+"----> Error"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.RED));
			 String screenShot_Path = getScreenShot(Playback.driver, name);
			 childLogger.fail("Test Case Failed Snapshot is below " + childLogger.addScreenCaptureFromPath(screenShot_Path));
			 childLogger.log(Status.ERROR,String.valueOf(Thread.currentThread().getStackTrace()));
		}
		
		//  Smoke consolidate
		 public static void CreateConsolidatedTest(String name)
		 {	
			 
			 loggerSmoke = extentSmoke.createTest(name);
			   System.out.println("Running ......      "+ name );
			   remainingTestScripts();
			   nodeIp=   readNodeDetails();  
		 }
	//  Smoke consolidate
		 public static void getConsolidatedResult(ITestResult result) throws Exception
			{
			 
				String methodName = result.getMethod().getMethodName();
				String logText = "<b>"+ methodName;
				 if(result.getStatus() == ITestResult.FAILURE)
				 {
				 //MarkupHelper is used to display the output in different colors
					 loggerSmoke.log(Status.FAIL, MarkupHelper.createLabel(logText+"----> FAILED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.RED));
					 loggerSmoke.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable().getMessage(), ExtentColor.RED));
					 loggerSmoke.fail(result.getThrowable());
				// logger.log(Status.FAIL, MarkupHelper.createLabel(Thread.currentThread().getStackTrace().toString(), ExtentColor.RED));
				 //String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
				 //+Throwables.getStackTraceAsString(result.getThrowable())
				 String screenShot_Path = getScreenShot(Playback.driver, result.getName());
				 loggerSmoke.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenShot_Path));
			
				 }
				 else if(result.getStatus() == ITestResult.SKIP){
					 loggerSmoke.log(Status.SKIP, MarkupHelper.createLabel(logText+"----> SKIPPED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.ORANGE)); 
				 } 
				 else if(result.getStatus() == ITestResult.SUCCESS)
				 {
					 loggerSmoke.log(Status.PASS, MarkupHelper.createLabel(logText+"----> PASSED"+"+_____________________+"+"Ran on node--->"+nodeIp+"", ExtentColor.GREEN));
				 }
				
			}
			
		public static  void GenerateHTML()
		{
		
		 extent.flush();
			
		}
		public static  void GenerateConsolidateHTML()
		{
		
			extentSmoke.flush();
			
		}
		
		static int CountofSuites =0;
		static ISuite suitel;
		public static int TotalTestsInSuite(ISuite suite)
		{
			suitel =suite;
			CountofSuites =suite.getAllMethods().size();
			System.out.println("Total Num of tests In Suite >   "+CountofSuites);
			return CountofSuites;
		}
		public static void remainingTestScripts()
		{
			 
			System.out.println("Remaining Scripts to be Execute  ---- >   "+CountofSuites);
			CountofSuites --;
		}
}
