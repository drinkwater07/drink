package scripts;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application.BI;
import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Popup;
import application.Settings;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class BIScripts {

	public Geo geo;
	public Login login;
	public Loader loader;
	public Settings settings;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public BI bi;
	public Home home;
	
	//@BeforeTest
	
	//ITestContext testContext;
	@BeforeMethod
	public void BeforeTestMethod( ITestContext testContext) 
	{
		testContext.setAttribute("moduleName", "Geo");		
		Playback.testContext=testContext;
		
		Playback.start();
			
		login=new Login();
		loader=new Loader();
		bi = new BI();
	    settings = new Settings();
	    objectIdentification = new ObjectIdentification();
	    home = new Home();
	
   }	
	
	@Test
	public void MasterSearchEntry_259710(ITestContext testContext)
     {
		testContext.setAttribute("testID", "259710");		
         Browser.NavigateToLoginScreen();
         login.loginScreen.Logon();
         loader.navigateToModule("BI");
         loader.navigateToScreen("Master Search");
         bi.switchToMasterSearch();
         bi.masterSearch.mouseHoverOnQueryBuilder();
         bi.masterSearch.selectCaseFromQueryBuilder();
         bi.switchToMasterSearchEntry();
         bi.masterSearchEntry.enterAtReportName();
         bi.masterSearchEntry.clickOnPeriodTab();
         bi.masterSearchEntry.masterSearchEntryPeriodTab.selectAtDateRange();
         bi.masterSearchEntry.masterSearchEntryPeriodTab.enterAtFromDate();
         bi.masterSearchEntry.masterSearchEntryPeriodTab.enterAtToDate();
         bi.masterSearchEntry.saveAndClose();
         bi.switchToMasterSearch();
         bi.masterSearch.enterAtReportName();
         bi.masterSearch.clickSearchButton();
         bi.masterSearch.verifyAtReportName(0);
         bi.masterSearch.clickAtRowByReportName();
         bi.switchToMasterSearchEntry();
         bi.masterSearchEntry.clickPrintIcon();
         
         home.switchToSelectReport();
         home.selectReport.CloseTheScreen();
         
         bi.switchToMasterSearchEntry();
         bi.masterSearchEntry.clickDeleteIcon();
        
         bi.switchToMasterSearch();
         bi.masterSearch.enterAtReportName();
         bi.masterSearch.clickSearchButton();
         bi.masterSearch.verifyNoRecordFoundAcknowlege();
         
         loader.navigateToModule("Settings");
         loader.navigateToScreen("Access Log");
         settings.switchToAcessLog();
         settings.accessLog.tabTheFromDateAndTime();
         settings.accessLog.verifyCurrentDateAsFrom();
         settings.accessLog.tabTheToDateAndTime();
         settings.accessLog.verifyCurrentDateAsTo();
         settings.accessLog.enterAtPFCode();
         settings.accessLog.clickSearch();
         settings.accessLog.verifyActivityDateAsCurrentDate(0);
         settings.accessLog.verifyDescriptionAtUserName(0);

         
            
     }
	
	   @AfterMethod
	   public void afterTestMethod() {
	 	  Playback.stop();
	 	  login.Reset();
	 	  loader.Reset();
	   }
}
