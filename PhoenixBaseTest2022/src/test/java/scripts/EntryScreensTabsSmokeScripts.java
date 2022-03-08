package scripts;

import org.openqa.selenium.By;
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
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class EntryScreensTabsSmokeScripts {

	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	

		@BeforeSuite
		public void beforeRunSuite(ITestContext testContext)
		{
			String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
			 ExtentReport.startConsolidatedReport(suitePath);
			 ExtentReport. TotalTestsInSuite(testContext.getSuite());
		}
		
		@BeforeMethod
		public void beforeMethodRecords(ITestContext testContext) {
			testContext.setAttribute("moduleName", "EntryScreens");
			Playback.testContext = testContext;
			Playback.start();
			login = new Login();
			loader = new Loader();
			popup = new Popup();
			objectIdentification = new ObjectIdentification();

		}

		//Mahesha
		@Test
	    public void TabsSmokeTest(ITestContext testContext) throws Exception
	    {	 
			 testContext.setAttribute("testID", "RecordProperty");
			 ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			 ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		     Browser.NavigateToLoginScreenSmoke();
		     login.loginScreen.logonUsingTestContextOtherDB();
		     ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		     String count=  BaseData.getBaseSmokeModuleValue("ScreensCount");
		      int cou = Integer.parseInt(count);
	      for(int i=1;i<=cou;i++)
	      {
	    	  objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen"+i+"");
	          ExtentReport.CreateNode(BaseData.getTestContextData("Screen"+i+""));
	          if(BaseData.getTestContextData("Screen"+i+"").split("-")[0].contains("UOF"))
	          {
	        	  loader.navigateToModule("Warrant");
	          }
	          loader.navigateToScreenBasedOnScreenName(BaseData.getTestContextData("Screen"+i+""));
	          System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	          objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen"+i+"").split("-")[0]);
	          objectIdentification.smokeTest.clickTheSearchButton();
	          objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen"+i+"").split("-")[0]);
	          objectIdentification.smokeTest.selectRandomGridRow();
	          objectIdentification.windowHandle.switchToWindow(BaseData.getTestContextData("EntryScreen"+i+""));
	          objectIdentification.smokeTest.saveAndCloseTheScreenGlobalEntrySmoke(BaseData.getTestContextData("EntryScreen"+i+""));
	          loader.navigateToModuleBasedOnScreenName(BaseData.getTestContextData("Screen"+i+""));
	                  
	    }
	}
		@Test
	    public void TabsSmokeTest1(ITestContext testContext) throws Exception
	    {	 
			 testContext.setAttribute("testID", "NameGeo");
			 ExtentReport.CreateConsolidatedTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
			 ExtentReport.startReportSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		     Browser.NavigateToLoginScreenSmoke();
		     login.loginScreen.logonUsingTestContextOtherDB();
		     ExtentReport.CreateSmokeTest(BaseData.getBaseSmokeModuleValue("ModuleName"));
		     String count=  BaseData.getBaseSmokeModuleValue("ScreensCount");
		      int cou = Integer.parseInt(count);
	      for(int i=1;i<=cou;i++)
	      {
	    	  objectIdentification.smokeTest.handlingAcknowledgeMessagesPopups("Screen"+i+"");
	          ExtentReport.CreateNode(BaseData.getTestContextData("Screen"+i+""));
	          loader.navigateToScreenBasedOnScreenName(BaseData.getTestContextData("Screen"+i+""));
	          System.out.println(BaseData.getBaseSmokeModuleValue("Screen"+i+""));
	          objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen"+i+"").split("-")[0]);
	          if(BaseData.getTestContextData("Screen"+i+"").split("-")[0].contains("Name Search"))
	          {
	        	  Playback.driver.findElement(By.id("tabNameSrch_tmpl0_UsrNameSrchBasic1_cddNameType_DropDown")).sendKeys("Adult");
	          }
	          objectIdentification.smokeTest.clickTheSearchButton();
	          objectIdentification.windowHandle.switchToMainWindowScreenTab(BaseData.getTestContextData("Screen"+i+"").split("-")[0]);
	          objectIdentification.smokeTest.selectRandomGridRow();
	          objectIdentification.windowHandle.switchToWindow(BaseData.getTestContextData("EntryScreen"+i+""));
	          objectIdentification.smokeTest.saveAndCloseTheScreenGlobalEntrySmoke(BaseData.getTestContextData("EntryScreen"+i+""));
	          loader.navigateToModuleBasedOnScreenName(BaseData.getTestContextData("Screen"+i+""));
	                  
	    }
	}
	
	 @AfterMethod
		public void afterMethodRecords(ITestResult testResult) {

//	  	  objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
			/*
			 * try Playback.takeScreenShotOnFailure(testResult); } catch (IOException e) {
			 * e.printStackTrace(); }
			 */
			try {
				ExtentReport.getResultSmoke(testResult);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ExtentReport.getConsolidatedResult(testResult);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Playback.stop();

			login.Reset();
			loader.Reset();
			ExtentReport.GenerateHTML();
			ExtentReport.GenerateConsolidateHTML();
		}
	    
	    @AfterSuite
	    public void afterRunSuite()
	    {
	  	  ExtentReport.GenerateConsolidateHTML();
	    	 System.gc();
	    	}
}
