package scripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Loader;
import application.Login;
import application.Popup;
import dataAccess.BaseData;
import reports.ExtentReport;
import uIMaps.UIMapPopup;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class BaseSmokeTest82 {


	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public UIMapPopup uIMapPopup;
	public ITestResult testResult;

	@BeforeSuite(groups={"Base82","CMS82"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startConsolidatedReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	
@BeforeMethod(groups={"Base82","CMS82"})
public void beforeMethodRecords(ITestContext testContext)
{
	testContext.setAttribute("moduleName", "BaseSmokeTest82");
	Playback.testContext = testContext;
	Playback.start();
	login = new Login();
	loader = new Loader();
	objectIdentification = new ObjectIdentification();
	 popup=new Popup();
	 uIMapPopup = new UIMapPopup();
}
	

@Test(groups={"CMS82"})
public void AccountingModuleSmokeTest(ITestContext testContext) throws Exception
{
   
	 testContext.setAttribute("testID", "Accounting");
	 ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	 	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
        Browser.NavigateToLoginScreenSmoke();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
        ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
        System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
        String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
        int cou = Integer.parseInt(count);
  for(int i=1;i<=cou;i++)
  {
 
      ExtentReport.CreateNode(BaseData.getTestContextData("Screen"+i+""));
    loader.navigateToScreen(BaseData.getTestContextData("Screen"+i+""));
    System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
    objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen"+i+""));
    objectIdentification.smokeTest.clickTheSearchButton();
    
    
    if (objectIdentification.windowHandle.windowExist("Acknowledge"))
      	try {
          popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
          objectIdentification.windowHandle.switchToMainWindow();
      	}
      catch(AssertionError e)
      {
    		e.printStackTrace();
          	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
          	popup.acknowledge.ok();
          	objectIdentification.windowHandle.switchToMainWindow();
      }
      catch(Exception e)
      {
      	e.printStackTrace();
      	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
      	 popup.acknowledge.okIfWindowExistAsWarning();
      	 objectIdentification.windowHandle.switchToMainWindow();
      }
    else
    {
       try
       {
           objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen"+i+""));
        objectIdentification.smokeTest.selectRandomGridRow();
        objectIdentification.windowHandle.switchToWindow(BaseData.getTestContextData("EntryScreen"+i+""));
        
        if(BaseData.getTestContextData("EntryScreen"+i+"").equalsIgnoreCase("Receive Payment"))
        {
        	try {
        		Playback.driver.findElement(By.id("cmdSaveNClose")).click();
        		 objectIdentification.windowHandle.switchToMainWindow();
        	}catch(NoSuchElementException e)
        	{
        		e.printStackTrace();
        		ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        		objectIdentification.windowHandle.switchToMainWindow();
        	}      
        }
        else
        objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("EntryScreen"+i+""));
        objectIdentification.windowHandle.switchToMainWindow();
       }
       catch(Exception e)
       {
           e.printStackTrace();
           ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
           objectIdentification.windowHandle.switchToMainWindow();
       }
       
    }
}
  
}
    
    @Test(groups={"CMS82"})
    public void ActivityModuleSmokeTestScript(ITestContext testContext) throws Exception
    {	
    	testContext.setAttribute("testID", "Activity");
    	ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
    Browser.NavigateToLoginScreenSmoke();
    login.loginScreen.logonUsingTestContextOtherDB();
    loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
    ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
    System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
    String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
    int cou = Integer.parseInt(count);
      for(int i=1;i<=cou;i++)
      {
      
    	  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       
        if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Schedule Search"))
        {
        	Playback.driver.findElement(By.id("tabSuspSrch_tmpl0_UsrPaymntSrchBasic1_dcStartDate_Date_KPIDttmCtrl")).sendKeys(BaseData.getBaseSmokeModuleValue("StartDate"));
        	Playback.driver.findElement(By.id("tabSuspSrch_tmpl0_UsrPaymntSrchBasic1_dcToDate_Date_KPIDttmCtrl")).sendKeys(BaseData.getBaseSmokeModuleValue("ToDate"));
        	 objectIdentification.smokeTest.clickTheSearchButton();
        }
        else
        	objectIdentification.smokeTest.clickTheSearchButton();
        
        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
        	try {
            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
            objectIdentification.windowHandle.switchToMainWindow();
        	}
        catch(Exception e)
        {
        	e.printStackTrace();
        	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	popup.acknowledge.ok();
        	 objectIdentification.windowHandle.switchToMainWindow();
        }

        else
        {
           try {
        	   objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
            objectIdentification.smokeTest.selectRandomGridRow();
            if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Schedule Search"))
            {
            	try {
            		objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
            		  if(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+"").equalsIgnoreCase("Inmate Movement"))
                      {
            			  	Playback.driver.findElement(By.id("cmdReset")).click();
                      }
            		  else
            		  {
            			  objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
            		  }
            	}
            	catch(Exception e)
            	{
            		 objectIdentification.windowHandle.switchToWindow("Work Release");
            	}
            }
            if(!BaseData.getBaseSmokeModuleValue("EntryScreen"+i+"").equalsIgnoreCase("Inmate Movement"))
            {
            	objectIdentification.manualIdentify.saveAndCloseTheScreenWithConfirm();
                objectIdentification.windowHandle.switchToMainWindow();
            }   
           }
           catch(Exception e)
           {
        	   e.printStackTrace();
        	   ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	   objectIdentification.windowHandle.switchToMainWindow();
           }
        }
      }

    }
    
    @Test(groups={"CMS82"})
    public void AdmissionBookingSmokeTestScript(ITestContext testContext) throws Exception
    {	
    	testContext.setAttribute("testID", "AdmissionBooking");
    	ExtentReport.CreateConsolidatedTest("AdmissionBooking");
	ExtentReport.startReportSmokeTest("AdmissionBooking");
    Browser.NavigateToLoginScreenSmoke();
    login.loginScreen.logonUsingTestContextOtherDB();
    loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
    ExtentReport.CreateSmokeTest("AdmissionBooking");
    System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
    String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
    int cou = Integer.parseInt(count);
      for(int i=1;i<=cou;i++)
      {
      
    	  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       
        if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Inmate Search")||BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Name Search"))
        {
        	Playback.driver.findElement(By.xpath("(//input[contains(@id,'txtAge')])[1]")).sendKeys(BaseData.getBaseSmokeModuleValue("Age"));
        	Playback.driver.findElement(By.xpath("(//input[contains(@id,'txtAge')])[2]")).sendKeys(BaseData.getBaseSmokeModuleValue("Diff"));
        	 objectIdentification.smokeTest.clickTheSearchButton();
        }
        else
        	objectIdentification.smokeTest.clickTheSearchButton();
        
        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
        	try {
            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
            objectIdentification.windowHandle.switchToMainWindow();
        	}
        catch(Exception e)
        {
        	e.printStackTrace();
        	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	popup.acknowledge.ok();
        	 objectIdentification.windowHandle.switchToMainWindow();
        }

        else
        {
           try {
        	   objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
            objectIdentification.smokeTest.selectRandomGridRow();
            objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));   
            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
            objectIdentification.windowHandle.switchToMainWindow();
            }
           catch(Exception e)
           {
        	   e.printStackTrace();
        	   ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	   objectIdentification.windowHandle.switchToMainWindow();
           }
        }
      }

    }
    

    @Test(groups={"Base82"})
    public void BISmokeTest(ITestContext testContext) throws Exception
    {
       

    		testContext.setAttribute("testID", "BI");
    		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
    		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        Browser.NavigateToLoginScreenSmoke();
	        login.loginScreen.logonUsingTestContextOtherDB();
	        loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
	        int cou = Integer.parseInt(count);
	       
     for(int i=1;i<=cou;i++)
     {
    	 
    	 boolean res = true;
    	 
    	 while(res)
    	 {
   	
   	  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
      System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").contains("Pivot Browser"))
       {
       	 	try{
       	 		Playback.driver.findElement(By.id("cmdRefresh")).click();
             objectIdentification.windowHandle.switchToMainWindow();
             res =false;
             break;   
       	 	}catch(Exception e)
       	 	{
       	 		e.printStackTrace();
       	 	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       	 	 objectIdentification.windowHandle.switchToMainWindow();
             res =false;
             break;  
       	 	}
       }
       objectIdentification.smokeTest.clickTheSearchButton();
       
       if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("DashBoard Config"))
       {
          Playback.pageLoadThreadWait();
          verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.controlExist(Playback.driver.findElement(By.xpath("(//div[@id='grdDashBoardSrch']//table)[4]")))); ;
          objectIdentification.windowHandle.switchToMainWindow();
          res =false;
          break;
       }
       
       if (objectIdentification.windowHandle.windowExist("Acknowledge"))
       	try {
           popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
           objectIdentification.windowHandle.switchToMainWindow();
           res =false;
    	 	 break;  
       	}
       catch(Exception e)
       {
       	e.printStackTrace();
       	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       	 popup.acknowledge.okIfWindowExistAsWarning();
       	 objectIdentification.windowHandle.switchToMainWindow();
       	 res =false;
  	 	 break;  
       }
       else
       {
          try {
       	 objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
           objectIdentification.smokeTest.selectRandomGridRow();
           objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));   
           if(BaseData.getTestContextData("EntryScreen"+i+"").equalsIgnoreCase("Cube Config Entry"))
           {      	   
        	   try{
        		   Playback.driver.findElement(By.id("cmdRefresh")).click();
                   Playback.pageLoadThreadWait();
                     Playback.driver.close();
                     objectIdentification.windowHandle.switchToMainWindow();
                     res =false;
                     break;
          	 	}catch(Exception e)
          	 	{
          	 		e.printStackTrace();
          	 		ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
          	 		objectIdentification.windowHandle.switchToMainWindow();
          	 	 res =false;
          	 	 break;  
          	 	}                  
           }    
           objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
           objectIdentification.windowHandle.switchToMainWindow();
           res =false;
    	 	 break;  
          }
          catch(Exception e)
          {
       	   e.printStackTrace();
       	   ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       	   objectIdentification.windowHandle.switchToMainWindow();
       	 res =false;
  	 	 break;  
          }
       }
       
   }
     }  
    }

    
    @Test(groups={"Base82"})
    public void CADModuleSmokeTestScript(ITestContext testContext) throws Exception
    {
    	
    	 testContext.setAttribute("testID", "CAD");
    	 ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
    	 	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        Browser.NavigateToLoginScreenSmoke();
	        login.loginScreen.logonUsingTestContextOtherDB();
	        loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
	        int cou = Integer.parseInt(count);
	       
      for(int i=1;i<=cou;i++)
      {
    	boolean res = true;
    	while(res)
    	{
    		 objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
    	  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("E911 Call Search"))
        {
        	Playback.driver.findElement(By.id("dtFromCallDate_Date_KPIDttmCtrl")).sendKeys(BaseData.getBaseSmokeModuleValue("FromDate"));
        	Playback.driver.findElement(By.id("dtToCallDate_Date_KPIDttmCtrl")).sendKeys(BaseData.getBaseSmokeModuleValue("ToDate"));
        	 objectIdentification.smokeTest.clickTheSearchButton();
        	 verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.controlExist(Playback.driver.findElement(By.xpath("//div//table"))));
             res = false;
         	break;
        }
        if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Police Dispatch"))
        {
        	objectIdentification.smokeTest.clickSearchButton();
             res = false;
         	break;
        }
        objectIdentification.smokeTest.clickTheSearchButton();
        
        if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("CAD Tone Log Search"))
        {
        	verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.controlExist(Playback.driver.findElement(By.xpath("//div//table"))));
        	res = false;
        	break;
        }
   
        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
        	try {  		
            popup.acknowledge.okWithExpectedIngnoreCase("1011 - No Record Found");
            objectIdentification.windowHandle.switchToMainWindow();
            res = false;
        	break;
        	}
        catch(Exception e)
        {
        	e.printStackTrace();
        	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	 popup.acknowledge.ok();
        	 objectIdentification.windowHandle.switchToMainWindow();
        	 res = false;
         	break;
        }
        else
        {
           try {
        	 objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
            objectIdentification.smokeTest.selectRandomGridRow();
            objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));   
            
            if(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+"").equalsIgnoreCase("LOR"))
            {
            	try {  		
                    Playback.driver.findElement(By.id("cmdSaveNClose")).click();
                    objectIdentification.windowHandle.switchToMainWindow();
                    res = false;
                    break;
                    
            	}catch(NoSuchElementException e)
            	{
            		e.printStackTrace();
            		ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
            		 objectIdentification.windowHandle.switchToMainWindow();
                     res = false;
                     break;
            	}
            }
            
            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
            objectIdentification.windowHandle.switchToMainWindow();
            res = false;
        	break;
           }
           catch(Exception e)
           {
        	   e.printStackTrace();
        	   ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	   objectIdentification.windowHandle.switchToMainWindow();
        	   res = false;
           	break;
           }
        }
        
    }
     }
      
     
    }
    
    
    
    @Test(groups={"CMS82"})
	 public void CitizenServicesModuleSmokeTestScript(ITestContext testContext) throws Exception
	    {
		 
	    	 testContext.setAttribute("testID", "Citizen Services");
	    	 ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	    	 	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		        Browser.NavigateToLoginScreenSmoke();
		        login.loginScreen.logonUsingTestContextOtherDB();
		        loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
		        ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		        System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
		        String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
		        int cou = Integer.parseInt(count);
		      
	      for(int i=1;i<=cou;i++)
	      {
	    	  
	    	
	    	  objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen"+i+"");
	    	  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	        loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	       System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	        objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	        objectIdentification.smokeTest.clickTheSearchButton();
	        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
	        	try {
	            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
	            objectIdentification.windowHandle.switchToMainWindow();
	           
	        	}
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	        	objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen"+i+"");
	        	 objectIdentification.windowHandle.switchToMainWindow();
	        	
	        }
	        else
	        {
	           try {
	        	 objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	            objectIdentification.smokeTest.selectRandomGridRow();
	            objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));   
	            if(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+"").equalsIgnoreCase("Alarm Process Entry"))
	            {
	            	try {
	            		Playback.driver.findElement(By.id("cmdCancel")).click();
	            		 objectIdentification.windowHandle.switchToMainWindow();
	            	}catch(NoSuchElementException e)
	            	{
	            		e.printStackTrace();
	            		ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	            		objectIdentification.windowHandle.switchToMainWindow();
	            	}        	
	            }
	            else
	            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
	            objectIdentification.windowHandle.switchToMainWindow();
	           }
	           catch(Exception e)
	           {
	        	   e.printStackTrace();
	        	   ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	        	   objectIdentification.windowHandle.switchToMainWindow();
	           }
	        }
	    	  }
	      }
	      
      
    

    @Test(groups={"CMS82"})
    public void CourtModuleSmokeTestScript(ITestContext testContext) throws Exception
    {
    	
  	  testContext.setAttribute("testID", "Court");
  	ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
    	 	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        Browser.NavigateToLoginScreenSmoke();
	        login.loginScreen.logonUsingTestContextOtherDB();
	        loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
	        int cou = Integer.parseInt(count);
	       
      for(int i=1;i<=cou;i++)
      {
      	boolean res = true;
       while(res)
       {
    	  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Cash Register"))
        {
      	   Playback.driver.findElement(By.id("cmdRefresh")).click();
      	   objectIdentification.windowHandle.switchToMainWindow();
      	   res=false;
      	   break;
        }
        if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Register Codes"))
        {
      	  objectIdentification.smokeTest.selectRandomGridRow();
            objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));   
            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
            objectIdentification.windowHandle.switchToMainWindow(); 
      	   res=false;
      	   break;
        }
    
        objectIdentification.smokeTest.clickTheSearchButton();
        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
        	try {
            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
            objectIdentification.windowHandle.switchToMainWindow();
            res=false;
     	   break;
        	}
        catch(AssertionError e)
        {
      		e.printStackTrace();
            	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
            	popup.acknowledge.ok();
            	objectIdentification.windowHandle.switchToMainWindow();
            	res=false;
       	   break;
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	 popup.acknowledge.okIfWindowExistAsWarning();
        	 objectIdentification.windowHandle.switchToMainWindow();
        	res=false;
   	   break;
        }
        else
        {
           try {
        	 objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
            objectIdentification.smokeTest.selectRandomGridRow();
            objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));   
            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
            objectIdentification.windowHandle.switchToMainWindow();
            res=false;
     	   break;
           }
           catch(Exception e)
           {
        	   e.printStackTrace();
        	   ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	   objectIdentification.windowHandle.switchToMainWindow();
        	 res=false;
    	   break;
           }
        }
        }
        
    }
      
     
    }
    
    
    @Test(groups={"CMS82"})
   public void DetailWorkModuleSmokeTestScript(ITestContext testContext) throws Exception
    {
    	
    	 testContext.setAttribute("testID", "Detail Work");
    	 ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
    	 	ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        Browser.NavigateToLoginScreenSmoke();
	        login.loginScreen.logonUsingTestContextOtherDB();
	        loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
	        String count=     BaseData.getBaseSmokeModuleValue("ScreensCount");
	        int cou = Integer.parseInt(count);
	       
      for(int i=1;i<=cou;i++)
      {
    	
    	  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
       System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        objectIdentification.smokeTest.clickTheSearchButton();
        if (objectIdentification.windowHandle.windowExist("Acknowledge"))
        	try {
            popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
            objectIdentification.windowHandle.switchToMainWindow();
        	}
        catch(Exception e)
        {
        	e.printStackTrace();
        	ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	 popup.acknowledge.okIfWindowExistAsWarning();
        	 objectIdentification.windowHandle.switchToMainWindow();
        }
        else
        {
           try {
        	 objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
            objectIdentification.smokeTest.selectRandomGridRow();
            objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));   
            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
            objectIdentification.windowHandle.switchToMainWindow();
           }
           catch(Exception e)
           {
        	   e.printStackTrace();
        	   ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
        	   objectIdentification.windowHandle.switchToMainWindow();
           }
        }
        
    }
      
     
    }
 
    
    @Test (groups={"CMS82"})// Vijay
    public void DocumentMgmtModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Document Mgmt");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreenCount");
           int cou = Integer.parseInt(count);

           for (int i = 1; i <= cou; i++) {

                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.smokeTest.clickTheSearchButton();
                  if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
                        try {
                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               popup.acknowledge.okIfWindowExistAsWarning();
                        }
                  }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Document Management")) {
                                      try {
                                             Playback.driver.findElement(By.xpath("(//td[@class='EditRule'])[5]")).click();
                                             objectIdentification.windowHandle
                                                           .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                                             objectIdentification.smokeTest
                                                           .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                                             objectIdentification.windowHandle.switchToMainWindow();
                                      } catch (Exception e) {
                                             e.printStackTrace();
                                             ExtentReport.LogInfo(BaseData.getTestContextData("EntryScreen" + i + ""));
                                             objectIdentification.windowHandle.switchToMainWindow();
                                      }

                               } else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("My Documents")) {
                                      Playback.driver.findElement(By.xpath(
                                                    "//div[@id='grdDoc_ctl00']//td[@title='New Module Document']/..//td[@class='link']"))
                                                    .click();
                                      objectIdentification.smokeTest
                                                    .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                               } else {
                                      objectIdentification.smokeTest.selectRandomGridRow();
                                      objectIdentification.windowHandle
                                                    .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                                      objectIdentification.smokeTest
                                                    .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                                      objectIdentification.windowHandle.switchToMainWindow();
                               }

                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("EntryScreen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }

    }

    @Test(groups={"CMS82"}) // Vijay
    public void FacilityManagementModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Facility Management");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

        	   objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Mail Log Search")
                               || BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Activity Search")
                               || BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Grievance Search")
                               || BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Incident Search")
                               || BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Out Of Service Cell Search")) {
                         Playback.driver.findElement(By.xpath("//input[contains(@id,'imgClear')]")).click();
                         Playback.driver.findElement(By.xpath("//input[contains(@id,'m_Date_KPIDttmCtrl')]"))
                                      .sendKeys(BaseData.getTestContextData("StartDate"));
                         Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]"))
                                      .sendKeys(BaseData.getTestContextData("ToDate"));
                  Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]")).sendKeys(Keys.TAB);
                  }

                  else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Library Search")) {
                        WebElement DateType = Playback.driver
                                      .findElement(By.id("tabSuspSrch_tmpl0_UsrLibraryInqSrch1_cddDateType_DropDown"));
                        Select s = new Select(DateType);
                        s.selectByVisibleText("Both");
                  }

                  else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Release Search")) {
                  Playback.driver.findElement(By.id("tabRlsSrch_tmpl0_UsrReleaseSrchBasic1_txtLastName")).sendKeys("a");

                  } else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Visitor Search")) {
                  Playback.driver.findElement(By.id("tabVisitSrch_tmpl0_UsrVisitSrchBasic1_txtSPNName")).sendKeys("a");
                  }
                  objectIdentification.smokeTest.clickTheSearchButton();
                  if (objectIdentification.windowHandle.windowExist("Acknowledge"))
                        try {
                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               popup.acknowledge.ok();
                               objectIdentification.windowHandle.switchToMainWindow();
                        }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.smokeTest.selectRandomGridRow();
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                               objectIdentification.smokeTest
                                             .saveAndCloseTheScreenWithYesButton(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }

    }

    @Test(groups={"CMS82"}) // Vijay
    public void FireStaticModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Fire Static");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

        	   objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Incident Search")) {
                         Playback.driver.findElement(By.xpath("//input[contains(@id,'imgClear')]")).click();
                         Playback.driver.findElement(By.xpath("//input[contains(@id,'m_Date_KPIDttmCtrl')]"))
                                      .sendKeys(BaseData.getTestContextData("StartDate"));
                         Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]"))
                                      .sendKeys(BaseData.getTestContextData("ToDate"));
                  Playback.driver.findElement(By.xpath("//input[contains(@id,'To_Date_KPIDttmCtr')]")).sendKeys(Keys.TAB);
                  }
                  objectIdentification.smokeTest.clickTheSearchButton();
                  if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
                        try {

                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               popup.acknowledge.okIfWindowExistAsWarning();
                               objectIdentification.windowHandle.switchToMainWindow();
                        }

                  } else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.smokeTest.selectRandomGridRow();
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                               objectIdentification.smokeTest
                                             .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("EntryScreen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }
           }
    }

    @Test(groups={"Base82"}) // Vijay
    public void GeoModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Geo");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {
 
          	 boolean res = true;
          	 
          	 while(res)
          	 {
          		 
          		objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
                ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                objectIdentification.windowHandle
                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Address Search")) {
                       Playback.driver.findElement(By.xpath("//input[contains(@id,'cmdR')]")).click();
                       res = false;
                       break;
                }
                else {
                    objectIdentification.smokeTest.clickTheSearchButton();
              }
                if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
                    try {
                           popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                           objectIdentification.windowHandle.switchToMainWindow();
                           res = false;
                           break;

                    } catch (Exception e) {
                           e.printStackTrace();
                           ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                           objectIdentification.windowHandle.switchToMainWindow();
                           res = false;
                           break;
                    }
              }

              else {
                    try {
                           objectIdentification.windowHandle
                                         .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                                  objectIdentification.smokeTest.selectRandomGridRow();
                           objectIdentification.windowHandle
                                         .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                           if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Contact Entry")) {
                                  Playback.driver.findElement(By.xpath("//input[contains(@id,'cmdR')]")).click();
                                  res = false;
                                  break;
                           } 
                           if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Address Flag Entry(p)")) {
                        	   objectIdentification.smokeTest.saveAndCloseTheScreen(BaseData.getTestContextData("EntryScreen" + i + ""));
                               res = false;
                               break;
                        } else {
                                         objectIdentification.smokeTest
                                                       .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                                         objectIdentification.windowHandle.switchToMainWindow();
                                         res = false;
                                         break;
                                  }
                           
                    } catch (Exception e) {
                           e.printStackTrace();
                           ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                           objectIdentification.windowHandle.switchToMainWindow();
                           res = false;
                           break;
                    }
              }

       }
          	 
          	 }
                
                

    }

    @Test(groups={"Base82"}) // Vijay
    public void HomeModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Home");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("PhoneBook Search")) {
                         Playback.driver.findElement(By.xpath("//span[text()='Search']")).click();
                  } else
                        objectIdentification.smokeTest.clickTheSearchButton();

                  if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
                        try {
                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");

                               objectIdentification.windowHandle.switchToMainWindow();

                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               popup.acknowledge.okIfWindowExistAsWarning();
                               objectIdentification.windowHandle.switchToMainWindow();

                        }
                  }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.smokeTest.selectRandomGridRow();
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                               if (BaseData.getTestContextData("EntryScreen" + i + "").contains("frmNotificationEvent.aspx")) {
                                      Playback.driver.findElement(By.id("cmdSearch")).click();
                                      Playback.driver.close();
                               } else {
                                      objectIdentification.smokeTest
                                                    .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                                      objectIdentification.windowHandle.switchToMainWindow();
                               }
                        } catch (Exception e) {
                               e.printStackTrace();
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }

    }


    @Test(groups={"Base82"}) // Vijay
    public void InventoryFleetModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Inventory & Fleet");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.smokeTest.clickTheSearchButton();
                  if (objectIdentification.windowHandle.windowExist("Acknowledge"))
                        try {
                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               popup.acknowledge.okIfWindowExistAsWarning();
                               objectIdentification.windowHandle.switchToMainWindow();
                        }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.smokeTest.selectRandomGridRow();
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                               if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Check Out/In Entry")) {
                                      Playback.driver.close();

                               } else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Mileage Log Entry")) {
                                      objectIdentification.windowHandle
                                                    .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                                      Playback.driver.findElement(By.id("cmdRefresh")).click();
                               } else {
                                      objectIdentification.smokeTest
                                                    .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                                      objectIdentification.windowHandle.switchToMainWindow();
                               }
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }

    }

    @Test(groups={"Base82"}) // Vijay
    public void K9ModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "K9");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("K9 Reports")) {
                         Playback.driver.findElement(By.xpath("//span[text()='Search']")).click();
                  } else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("K9 Personnel")) {
                        Playback.driver.findElement(By.id("cmdSearch")).click();
                  }

                  else {
                        objectIdentification.smokeTest.clickTheSearchButton();
                  }
                  if (objectIdentification.windowHandle.windowExist("Acknowledge"))
                        try {
                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               popup.acknowledge.okIfWindowExistAsWarning();
                               objectIdentification.windowHandle.switchToMainWindow();
                        }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.smokeTest.selectRandomGridRow();
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                               if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Expense Entry")) {
                                      objectIdentification.manualIdentify.saveAndCloseTheScreen();
                               } else {
                                      objectIdentification.smokeTest
                                                    .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                                      objectIdentification.windowHandle.switchToMainWindow();
                               }
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }

    }

    @Test (groups={"CMS82"})// Vijay
    public void MedicalModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Medical");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

        	   objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Medical Search")
                               || BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("MAR History Search")) {
                         Playback.driver.findElement(By.xpath("//input[contains(@id,'imgClear')]")).click();
                    Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmFromDate_Date_KPIDttmCtrl')]"))
                                      .sendKeys(BaseData.getTestContextData("StartDate"));
                      Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmToDate_Date_KPIDttmCtrl')]"))
                                      .sendKeys(BaseData.getTestContextData("ToDate"));
                      Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmToDate_Date_KPIDttmCtrl')]"))
                                      .sendKeys(Keys.TAB);

                  }

                  objectIdentification.smokeTest.clickTheSearchButton();
                  Playback.waitForSearch();

                  if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
                        try {
                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               popup.acknowledge.okIfWindowExistAsWarning();
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.smokeTest.selectRandomGridRow();
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));
                               objectIdentification.smokeTest
                                             .saveAndCloseTheScreenWithYesButton(BaseData.getTestContextData("EntryScreen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }

    }

    @Test(groups={"Base82"}) // Vijay
    public void NamesModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Names");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getTestContextData("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getTestContextData("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getTestContextData("ModuleName"));
           System.out.println(BaseData.getTestContextData("ModuleName"));
           String count = BaseData.getTestContextData("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

        	   objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
                  ExtentReport.CreateNode(BaseData.getTestContextData("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getTestContextData("Screen" + i + ""));
                  System.out.println(BaseData.getTestContextData("Screen" + i + ""));

                  if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Expungement Search")) {
                         objectIdentification.windowHandle.switchToMainWindowScreenTab("frmExpungementsSrch.aspx");
                  }

                  else {
                        objectIdentification.windowHandle
                                      .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                  }

                  if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Dictionary Search")) {
                        Playback.driver.findElement(By.id("txtName")).click();
                        Playback.driver.findElement(By.id("txtName")).sendKeys("a");
                        Playback.driver.findElement(By.id("cmdSearch")).click();
                  }

                  else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("DNA Search")) {
                    Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmFromDate_Date_KPIDttmCtrl')]"))
                                      .sendKeys(BaseData.getTestContextData("StartDate"));
                      Playback.driver.findElement(By.xpath("//input[contains(@id,'dttmToDate_Date_KPIDttmCtrl')]"))
                                      .sendKeys(BaseData.getTestContextData("ToDate"));
                  }

                  else if (BaseData.getTestContextData("Screen" + i + "").equalsIgnoreCase("Name Search")) {
                  Playback.driver.findElement(By.id("tabNameSrch_tmpl0_UsrNameSrchBasic1_txtLastName")).sendKeys("a");
                         Playback.driver.findElement(By.xpath("//span[text()='Search']")).click();

                  } else {
                        objectIdentification.smokeTest.clickTheSearchButton();
                  }
                  if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
                	  objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
                  }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getTestContextData("Screen" + i + ""));
                               if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Photo Book")) {
                                      Playback.driver.findElement(By.xpath("//div[@id='grdPhotoBook']//td[text()='20-000044']"))
                                                    .click();

                               } else {
                                      objectIdentification.smokeTest.selectRandomGridRow();
                               }
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getTestContextData("EntryScreen" + i + ""));

                               if (BaseData.getTestContextData("EntryScreen" + i + "").equalsIgnoreCase("Offender Entry")) {
                                      Playback.driver.findElement(By.id("cmdSaveNClose")).click();
                                      objectIdentification.windowHandle.switchToMainWindow();
                               }

                               // else if (BaseData.getTestContextData("EntryScreen" + i +
                               // "").equalsIgnoreCase("Photo Book")) {

                               // }
                               else {
                                      objectIdentification.smokeTest
                                                    .saveAndCloseTheScreenWithConfirm(BaseData.getTestContextData("Screen" + i + ""));
                                      objectIdentification.windowHandle.switchToMainWindow();
                                }
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getTestContextData("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }

    }



    @Test (groups={"Base82"})// Vijay
    public void PersonnelModuleSmokeTestScripts(ITestContext testContext) throws Exception {
           testContext.setAttribute("testID", "Personnel");
           ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           Browser.NavigateToLoginScreenSmoke();
           login.loginScreen.logonUsingTestContextOtherDB();
           loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
           ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
           System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
           String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
           int cou = Integer.parseInt(count);
           for (int i = 1; i <= cou; i++) {

        	   objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
                  ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                  loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                  System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                  objectIdentification.windowHandle
                               .switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                  objectIdentification.smokeTest.clickTheSearchButton();
                  if (objectIdentification.windowHandle.windowExist("Acknowledge"))
                        try {
                               popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                               popup.acknowledge.okIfWindowExistAsWarning();
                               objectIdentification.windowHandle.switchToMainWindow();
                        }

                  else {
                        try {
                               objectIdentification.windowHandle
                                             .switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                               objectIdentification.smokeTest.selectRandomGridRow();
                               objectIdentification.windowHandle
                                             .switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
                               objectIdentification.smokeTest
                                             .saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        } catch (Exception e) {
                               e.printStackTrace();
                               ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
                               objectIdentification.windowHandle.switchToMainWindow();
                        }
                  }

           }
    }

  	@Test (groups={"CMS82"}) 
  	public void SmokeTestScripts_Scheduling_(ITestContext testContext) throws Exception {
  	
  		testContext.setAttribute("testID", "Scheduling");
  		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		Browser.NavigateToLoginScreenSmoke();
  		login.loginScreen.logonUsingTestContextOtherDB();
  		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
  		int cou = Integer.parseInt(count);
  		for (int i = 1; i <= cou; i++) {
  			boolean res = true;

  			while (res) {
  				ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  				loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  				System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  				objectIdentification.windowHandle
  						.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  				if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Job Grade")) {
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					objectIdentification.smokeTest
  							.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					objectIdentification.windowHandle.switchToMainWindow();
  					res = false;
  					break;

  				}

  				else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Schedule Settings")) {
  					Playback.driver.findElement(By.id("tabSchedule_tmpl0_usrTourCode_cmdSearch")).click();
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					objectIdentification.smokeTest
  							.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					objectIdentification.windowHandle.switchToMainWindow();
  					res = false;
  					break;
  				}

  				else if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Time Category")) {
  					Playback.driver.findElement(By.xpath("(//table/tbody/tr/td/img[contains(@class ,'HGridExpandButton')])[1]")).click();
  					Playback.controlReadyThreadWait();
  					Playback.driver.findElement(By.xpath("(//table/tbody[contains(@class,'Item')]//tr[contains(@class,'grdrowalign')][2])[1]")).click();
  					objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
//  					objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getPoliceSmokeModuleValue("EntryScreen" + i + ""));
  					objectIdentification.manualIdentify.saveAndCloseTheScreen();
  					objectIdentification.windowHandle.switchToMainWindow();
  					res = false;
  					break;
  				}

  				objectIdentification.smokeTest.clickTheSearchButton();

  				if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
  					try {
  						popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
  						objectIdentification.windowHandle.switchToMainWindow();
  						res = false;
  						break;
  					} 
  					catch(AssertionError e)
  			          {
  			                e.printStackTrace();
  			                  ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			                  popup.acknowledge.ok();
  			                  objectIdentification.windowHandle.switchToMainWindow();
  			                  res = false;
  								break;
  			          }catch(Exception e)
  			        {
  				          e.printStackTrace();
  				          ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  				           popup.acknowledge.okIfWindowExistAsWarning();
  				           objectIdentification.windowHandle.switchToMainWindow();
  				           res = false;
  							break;
  				        }

  				}

  				else {
  					try {
  						objectIdentification.windowHandle
  								.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  						objectIdentification.smokeTest.selectRandomGridRow();
  						objectIdentification.windowHandle
  								.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  						objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(
  								BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  						objectIdentification.windowHandle.switchToMainWindow();
  						res = false;
  						break;
  					}  
  					catch(Exception e)
  			           {
  			             e.printStackTrace();
  			             ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			             objectIdentification.windowHandle.switchToMainWindow();
  			             res = false;
  						break;
  					}
  				}
  			}
  		}
  	
  	}

    
  	
  	@Test(groups={"Base82"})
  	public void SmokeTestScripts_Training_(ITestContext testContext) throws Exception {
  		
  		testContext.setAttribute("testID", "Training");
  		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
          ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		Browser.NavigateToLoginScreenSmoke();
  		login.loginScreen.logonUsingTestContextOtherDB();
  		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
  		int cou = Integer.parseInt(count);
  		for (int i = 1; i <= cou; i++) {

  			objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			objectIdentification.smokeTest.clickTheSearchButton();
  			
  			if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Certification Search"))
  			{
  				objectIdentification.smokeTest.selectRandomGridRow();
  				objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  				boolean controlExist = objectIdentification.manualIdentify.controlExist(Playback.driver.findElement(By.id("grdCertification")));
  				verify.ExpectedValueIsTrue(controlExist);
  				Playback.driver.close();
  				objectIdentification.windowHandle.switchToMainWindow();
  				}
  			
  			else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Course Search"))
  			{
  				Playback.driver.findElement(By.xpath("(//table/tbody/tr/td/img[contains(@class ,'HGridExpandButton')])[1]")).click();
  				Playback.controlReadyThreadWait();
  				Playback.driver.findElement(By.xpath("(//div[contains(@id,'grdCourse')]//tr[3]//td//tr//td[10])[3]")).click();
  				objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  				objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  				objectIdentification.windowHandle.switchToMainWindow();
  			}
  			else 
  			{
  				
  			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
  				try {
  					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
  					objectIdentification.windowHandle.switchToMainWindow();
  				} 
  	        catch(Exception e)
  	        {
  	          e.printStackTrace();
  	          ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  	           popup.acknowledge.okIfWindowExistAsWarning();
  	           objectIdentification.windowHandle.switchToMainWindow();
  	        }


  			else {
  				try {
  					objectIdentification.windowHandle
  							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
  					objectIdentification.windowHandle.switchToMainWindow();
  				} 
  		           catch(Exception e)
  		           {
  		             e.printStackTrace();
  		             ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  		             objectIdentification.windowHandle.switchToMainWindow();
  		           }
  			}
  		}
  			}
  	}

  	
  	@Test  (groups={"Base82"})
  	public void SmokeTestScripts_Vehicle_(ITestContext testContext) throws Exception {
  	
  		testContext.setAttribute("testID", "Vehicle");
  		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		Browser.NavigateToLoginScreenSmoke();
  		login.loginScreen.logonUsingTestContextOtherDB();
  		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
          ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
  		int cou = Integer.parseInt(count);
  		for (int i = 1; i <= cou; i++) {

  			objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
              ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			objectIdentification.windowHandle
  					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			objectIdentification.smokeTest.clickTheSearchButton();
  			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
  				try {
  					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
  					objectIdentification.windowHandle.switchToMainWindow();
  				} 
  	        catch(Exception e)
  	        {
  	          e.printStackTrace();
  	          ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  	           popup.acknowledge.okIfWindowExistAsWarning();
  	           objectIdentification.windowHandle.switchToMainWindow();
  	        }


  			else {
  				try {
  					objectIdentification.windowHandle
  							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  		            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
  					objectIdentification.windowHandle.switchToMainWindow();
  				}
  		           catch(Exception e)
  		           {
  		             e.printStackTrace();
  		             ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  		             objectIdentification.windowHandle.switchToMainWindow();
  		           }
  			}
  		}
  	}

  	
  	@Test  (groups={"Base82"})
  	public void SmokeTestScripts_Video_(ITestContext testContext) throws Exception {
  	
  		testContext.setAttribute("testID", "Video");
  		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		Browser.NavigateToLoginScreenSmoke();
  		login.loginScreen.logonUsingTestContextOtherDB();
  		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
  		int cou = Integer.parseInt(count);
  		for (int i = 1; i <= cou; i++) {

  			objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			 ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			objectIdentification.windowHandle
  					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			objectIdentification.smokeTest.clickTheSearchButton();
  			
  			if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Camera View Config Search"))
  			{
  				Playback.driver.findElement(By.xpath("(//div[contains(@id,'grdContainer')]//table//tbody//tr//td//td//td[contains(@class,'ighg_HGridExpansionColumn')]//following-sibling::td[2])[2]")).click();
  				objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
//  				  objectIdentification.manualIdentify.saveAndCloseTheScreen();
  		            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
  					objectIdentification.windowHandle.switchToMainWindow();
  			}
  			
  			else
  			{
  			
  			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
  				try {
  					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
  					objectIdentification.windowHandle.switchToMainWindow();
  				} 
  	        catch(Exception e)
  	        {
  	          e.printStackTrace();
  	          ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  	           popup.acknowledge.okIfWindowExistAsWarning();
  	           objectIdentification.windowHandle.switchToMainWindow();
  	        }

  			else {
  				try {
  					objectIdentification.windowHandle
  							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  		            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
  					objectIdentification.windowHandle.switchToMainWindow();
  				} 
  				catch(Exception e)
  		           {
  		             e.printStackTrace();
  		             ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  		             objectIdentification.windowHandle.switchToMainWindow();
  		           }
  			}
  		}
  		}
  	}

  
  	@Test  (groups={"CMS82"})
  public void zSmokeTestScripts_Settings_(ITestContext testContext) throws Exception {
  	
  		testContext.setAttribute("testID", "Settings");
  		Browser.NavigateToLoginScreenSmoke();
  		ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
          ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		login.loginScreen.logonUsingTestContextOtherDB();
  		loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		 ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
  		String count = BaseData.getBaseSmokeModuleValue("ScreensCount");
  		int cou = Integer.parseInt(count);
  		for (int i = 1; i <= cou; i++) {
  			boolean res = true;

  			while (res) {
  				objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  			loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			System.out.println(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			objectIdentification.windowHandle
  					.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  			
  			if (BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Jail Cell")) {
  				objectIdentification.smokeTest.selectRandomGridRow();
  				objectIdentification.windowHandle
  						.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  	            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
  				objectIdentification.windowHandle.switchToMainWindow();
  				res = false;
  		           break;
  			}
  			
  			else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Access Log"))
  			{
  				Playback.driver.findElement(By.id("dtcStartDttm_Date_KPIDttmCtrl")).sendKeys("02/18/2020");
  				Playback.driver.findElement(By.id("dtcToDttm_Date_KPIDttmCtrl")).sendKeys(Randomized.getCurrentDate());
  				Playback.driver.findElement(By.id("dtcToDttm_Date_KPIDttmCtrl")).sendKeys(Keys.TAB);
  				Playback.driver.findElement(By.id("cmdSearch")).click();
  				objectIdentification.windowHandle.switchToMainWindow();
  				res = false;
  		           break;
  				
  			}
  			
  			else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Batch Search"))
  			{
  				Playback.driver.findElement(By.id("lupOpenScreenID_CodeValue")).sendKeys("1011");
  				Playback.driver.findElement(By.id("lupOpenScreenID_CodeValue")).sendKeys(Keys.TAB);
  				
  			}
  			
  			else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Tasks"))
  			{
  				Playback.driver.findElement(By.id("cddTaskType_DropDown")).sendKeys("BCA Incident");
  				objectIdentification.smokeTest.clickTheSearchButton();
  				objectIdentification.smokeTest.selectRandomGridRow();
  				objectIdentification.windowHandle
  				.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  				Playback.driver.close();
  				 res = false;
  		           break;

  			}
  			
  			if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("User query search"))
				{
			           objectIdentification.smokeTest.clickSearchButton();
			           objectIdentification.smokeTest.selectRandomGridRow();
	  					objectIdentification.windowHandle
	  					.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
	  					objectIdentification.manualIdentify.saveAndCloseTheScreenWithConfirm();
	  			           objectIdentification.windowHandle.switchToMainWindow();
	  			           res = false;
	  			           break;
				}
  			
  			objectIdentification.smokeTest.clickTheSearchButton();
  				
  				if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Dispatch Zone"))
  				{
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  					.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					objectIdentification.manualIdentify.saveAndCloseTheScreen();
  			           objectIdentification.windowHandle.switchToMainWindow();
  			           res = false;
  			           break;
  			           
  				}
  				
  				else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Coded"))
  				{
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  					.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					Playback.driver.close();
  					res = false;
  					break;
  				}
  				
  				else if(BaseData.getBaseSmokeModuleValue("Screen" + i + "").equalsIgnoreCase("Roles"))
  				{
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  					.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  					Playback.driver.close();
  					res = false;
  					break;
  				}
  				
  			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
  			{
  				try {
  					popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
  					objectIdentification.windowHandle.switchToMainWindow();
  					res = false;
  			           break;
  				}
  	        catch(Exception e)
  	        {
  	          e.printStackTrace();
  	          ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  	           popup.acknowledge.okIfWindowExistAsWarning();
  	           objectIdentification.windowHandle.switchToMainWindow();
  	     	res = false;
	           break;
  	        }
  			}

  			else {
  				try {
  					objectIdentification.windowHandle
  							.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen" + i + ""));
  					objectIdentification.smokeTest.selectRandomGridRow();
  					objectIdentification.windowHandle
  							.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen" + i + ""));
  		            objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
  					objectIdentification.windowHandle.switchToMainWindow();
  					res = false;
  			           break;
  				} 
  				catch(Exception e)
  		           {
  		             e.printStackTrace();
  		             ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
  		             objectIdentification.windowHandle.switchToMainWindow();
  		             res = false;
  			           break;
  		           }
  			}
  			}
  			}
  	}

  	
  	@Test   (groups={"Base82"})
    public void SettingsSysParameterJurisSmokeTestScripts(ITestContext testContext) throws Exception
      {
       
  			testContext.setAttribute("testID", "SysParameterJuris");
  			ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
  			ExtentReport.startReportSmokeTest("SettingsSystemParameter");
                 Browser.NavigateToLoginScreenSmoke();
                 login.loginScreen.logonUsingTestContextOtherDB();
                 loader.navigateToModule(BaseData.getBaseSmokeModuleValue("ModuleName"));
                 ExtentReport.CreateSmokeTest("SettingsSystemParameter");
                 System.out.println(BaseData.getBaseSmokeModuleValue("ModuleName"));
                 String count=     BaseData.getBaseSmokeModuleValue("ScreenCount");
                 int cou = Integer.parseInt(count);
               
        for(int i=1;i<=cou;i++)
        {
        
           ExtentReport.CreateNode(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
          loader.navigateToScreen(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
         System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));      
         if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("System Parameter"))
           {         
            objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
           objectIdentification.smokeTest.clickTheSearchButton();
           popup.acknowledge.okWithExpectedMessage("(6015) Enter at least one criteria/keyword to start the search");
           objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
           objectIdentification.randomIdentify.selectDropDownOption(Playback.driver.findElement(By.id("lstModule")));
           objectIdentification.smokeTest.clickTheSearchButton();
           objectIdentification.manualIdentify.saveTheScreenWithConfirm();
           if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
                             popup.acknowledge.ok();
                       } else {
                             Playback.pageLoadThreadWait();
                             }
           }
           else if(BaseData.getBaseSmokeModuleValue("Screen"+i+"").equalsIgnoreCase("Juris"))
           {
                 objectIdentification.windowHandle.switchToWindow(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
                objectIdentification.smokeTest.saveAndCloseTheScreenWithConfirm(BaseData.getBaseSmokeModuleValue("EntryScreen"+i+""));
                objectIdentification.windowHandle.switchToMainWindow();
           }
           else
          objectIdentification.smokeTest.clickTheSearchButton();
          if (objectIdentification.windowHandle.windowExist("Acknowledge"))
               try {               
             popup.acknowledge.okWithExpectedMessage("1011 - No record found");
             objectIdentification.windowHandle.switchToMainWindow();
               }
         catch(Exception e)
         {       
            e.printStackTrace();
             ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
              popup.acknowledge.okIfWindowExistAsWarning();
              objectIdentification.windowHandle.switchToMainWindow();
         }    

        else
        {
           try {               
           objectIdentification.windowHandle.switchToMainWindow();
          }
          catch(Exception e)
          {
                 e.printStackTrace();
               ExtentReport.LogInfo(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
               objectIdentification.windowHandle.switchToMainWindow();
          }
       }
    }
      }
  	
  	
  	
    @AfterMethod(groups={"Base82","CMS82"})
 	public void afterMethodRecords(ITestResult testResult) throws Exception {

//   	  objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
 		/*
 		 * try Playback.takeScreenShotOnFailure(testResult); } catch (IOException e) {
 		 * e.printStackTrace(); }
 		 */
 	
 			ExtentReport.getResultSmoke(testResult);
 	
 	
 			ExtentReport.getConsolidatedResult(testResult);
 	
 		Playback.stop();

 		login.Reset();
 		loader.Reset();
 		ExtentReport.GenerateHTML();
 	}
     
     @AfterSuite(groups={"Base82","CMS82"})
     public void afterRunSuite()
     {
   	  ExtentReport.GenerateConsolidateHTML();
     	 System.gc();
     	}

}
