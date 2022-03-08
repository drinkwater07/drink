package scripts;

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
import application.Scheduling;
import application.Settings;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class SchedulingScripts {
	

	public Scheduling scheduling;
	public Settings settings;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	
	
	//@BeforeMethod
	  public void beforeTestMethod(ITestContext testContext) 
	{
		  testContext.setAttribute("moduleName","Scheduling");
		  Playback.testContext=testContext;
		  Playback.start();
	      login=new Login();
		  loader=new Loader();		
		  objectIdentification= new ObjectIdentification();	    
	      popup = new Popup();
	      scheduling= new Scheduling();

	}
	  @BeforeSuite(groups ={"eventCode" , 
				"ScheduleSetting",
				"scheduleTime",
				"2020DefectTestCases" })
		public void beforeRunSuite(ITestContext testContext)
		{
			String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
			 ExtentReport.startReport(suitePath);
			 ExtentReport. TotalTestsInSuite(testContext.getSuite());
		}
	
	@BeforeMethod(groups = {"eventCode" , 
			"ScheduleSetting",
			"scheduleTime",
			"2020DefectTestCases" })
	  public void beforeTestMethodSchedule(ITestContext testContext) 
	{
		  testContext.setAttribute("moduleName","Scheduling" );
		  Playback.testContext=testContext;
		  Playback.start();
	      login=new Login();
		  loader=new Loader();		
		  objectIdentification= new ObjectIdentification();	    
	      popup = new Popup();
	      scheduling= new Scheduling();

	}
	
	 //Functional Scripts
   
	@Test(groups = { "eventCode" })
    public void EventCodeEntryFunctionality_187817(ITestContext testContext) 
    
    {
        ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        testContext.setAttribute("testID", "187817");
   	 Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Scheduling");
        loader.navigateToScreen("Event Code");
        scheduling.switchToEventCode();
        scheduling.eventCode.clickAddNew();
        scheduling.switchToEventCodeEntryScreen();
        scheduling.eventCodeEntry.clickSave();
        scheduling.eventCodeEntry.verifyEventCodeAcknowledgeMessage();
        scheduling.switchToEventCodeEntryScreen();
        scheduling.eventCodeEntry.enterAtEventCode();
        scheduling.eventCodeEntry.enterAtEventName();
        scheduling.eventCodeEntry.enterDescription();
        scheduling.eventCodeEntry.enterAtCustomName();
        scheduling.eventCodeEntry.selectAtCustomColor();
        scheduling.eventCodeEntry.save();
        scheduling.switchToEventCodeEntryScreen();
        scheduling.eventCodeEntry.verifyBottomStatus();
        scheduling.eventCodeEntry.close();
        scheduling.switchToEventCode();
        scheduling.eventCode.enterAtCustomName();
        scheduling.eventCode.clickSearchButton();
        scheduling.eventCode.verifyAtEventCodeUsingCustomName();
        scheduling.eventCode.verifyAtEventColorUsingCustomName();
        scheduling.eventCode.verifyAtEventNameUsingCustomName();
        scheduling.eventCode.clickCustomNameInGrid();
        scheduling.switchToEventCodeEntryScreen();
        scheduling.eventCodeEntry.clickInactiveCheckbox();
        scheduling.eventCodeEntry.verifyInactiveDateAsCurrentDate();
        scheduling.eventCodeEntry.save();
        scheduling.switchToEventCodeEntryScreen();
        scheduling.eventCodeEntry.close();
        scheduling.switchToEventCode();
     
        scheduling.eventCode.clickIncludeInactiveCheckbox();
        scheduling.eventCode.clickSearchButton();
        scheduling.eventCode.verifyAtEventCodeUsingCustomName();
        scheduling.eventCode.verifyAtEventColorUsingCustomName();
        scheduling.eventCode.verifyAtEventNameUsingCustomName();
        scheduling.eventCode.verifyRowColorInActive(0);
    }

    @Test(groups = { "eventCode" })
    public void EventResourcesEntryFunctionality_187818(ITestContext testContext) 
    
    {
   	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
   	 testContext.setAttribute("testID", "187818");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Scheduling");
        loader.navigateToScreen("Event Resources"); 
        scheduling.switchToEventResources();
        scheduling.eventResources.clickAddNew();
        scheduling.switchToEventResourcesEntryScreen();
        scheduling.eventResourcesEntry.clickSave();
        scheduling.eventResourcesEntry.verify8EnterMandatoryDataAckMsg();
        scheduling.switchToRotationCodeEntryScreen();
        scheduling.eventResourcesEntry.enterAtPFCode();
        scheduling.eventResourcesEntry.verifyResourcesNameFieldDisabled();
        scheduling.eventResourcesEntry.clearPFCode();
        scheduling.eventResourcesEntry.enterAtResourcesName();
        scheduling.eventResourcesEntry.verifyPFCodeFieldDisabled();
        scheduling.eventResourcesEntry.enterAtDisplayName();
        scheduling.eventResourcesEntry.save();
        scheduling.switchToEventResourcesEntryScreen();
        scheduling.eventResourcesEntry.verifyBottomStatus();
        scheduling.eventResourcesEntry.close();
        scheduling.switchToEventResources();
        scheduling.eventResources.enterAtResourceName();
        scheduling.eventResources.clickSearchButton();
        scheduling.eventResources.verifyAtDisplayNameUsingResourceName();
        scheduling.eventResources.clickResourceNameInGrid();
        scheduling.switchToEventResourcesEntryScreen();
        scheduling.eventResourcesEntry.clearResourceName();
        scheduling.eventResourcesEntry.enterAtPFCode();
        scheduling.eventResourcesEntry.clickInactiveCheckbox();
        scheduling.eventResourcesEntry.verifyInactiveDateAsCurrentDate();
        scheduling.eventResourcesEntry.save();
        scheduling.switchToEventResourcesEntryScreen();
        scheduling.switchToEventResources();
        scheduling.eventResources.clearResourceName();
        scheduling.eventResources.enterAtPFCode();
        scheduling.eventResources.clickIncludeInactiveCheckbox();
        scheduling.eventResources.clickSearchButton();
        scheduling.eventResources.verifyAtPFCodeInGrid(0);
        scheduling.eventResources.verifyRowColorInActive(0);
    }

    @Test(groups = { "ScheduleSetting" })
    public void ScheduleSettingTourTabFunctionality_188779(ITestContext testContext) 
    
    {
   	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
   		testContext.setAttribute("testID", "188779");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Scheduling");
        loader.navigateToScreen("Schedule Settings");
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.clickTourShiftHoursTab();
        scheduling.scheduleSettings.scheduleSettingsTourTab.clickAddTourCodeButton();
        scheduling.switchToTourEntryScreen();
        scheduling.tourEntry.clickSave();
        scheduling.tourEntry.verifyTourCodeAcknowledgeMessage();
        scheduling.switchToTourEntryScreen();
        scheduling.tourEntry.enterAtTourCode();
        scheduling.tourEntry.enterAtDescription();
        String FromTime = scheduling.tourEntry.tabTimeFromAndRead();
        String futureTime = scheduling.tourEntry.enterTimeToAsFutureTimeandRead();
        scheduling.tourEntry.enterNotes();
        scheduling.tourEntry.saveScreen();
        scheduling.switchToTourEntryScreen();
        scheduling.tourEntry.verifyBottomStatus();
        scheduling.tourEntry.closeSCreen();
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.clickTourShiftHoursTab();
        scheduling.scheduleSettings.scheduleSettingsTourTab.clickRefresh();
        scheduling.scheduleSettings.scheduleSettingsTourTab.verifyAtDescriptionUsingCode();
        scheduling.scheduleSettings.scheduleSettingsTourTab.verifyTimeFromCurrentDateUsingCode(FromTime);
        scheduling.scheduleSettings.scheduleSettingsTourTab.verifyTimeToFutureDateUsingCode(futureTime);
        scheduling.scheduleSettings.scheduleSettingsTourTab.selectAtCode1InGridRow();
        scheduling.switchToTourEntryScreen();
        scheduling.tourEntry.clickInactiveCheckbox();
        scheduling.tourEntry.verifyInactiveDateAsCurrentDate();
        scheduling.tourEntry.saveScreen();
        scheduling.switchToTourEntryScreen();
        scheduling.tourEntry.closeSCreen();
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.clickTourShiftHoursTab();
        scheduling.scheduleSettings.scheduleSettingsTourTab.clickIncludeInactiveCheckbox();
        scheduling.scheduleSettings.scheduleSettingsTourTab.clickRefresh();
        scheduling.scheduleSettings.scheduleSettingsTourTab.verifyInactiveRowColorUsingCode1();

    }

    @Test(groups = { "ScheduleSetting" })
    public void ScheduleSettingRotationTabFunctionality_188780(ITestContext testContext) 
    
    {
   	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
   		testContext.setAttribute("testID", "188780");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Scheduling");
        loader.navigateToScreen("Schedule Settings");
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.clickRotationTab();
        scheduling.scheduleSettings.scheduleSettingsRotationTab.clickAddRotationCodeButton();
        scheduling.switchToRotationCodeEntryScreen();
        scheduling.rotationCodeEntry.clickSave();
        scheduling.rotationCodeEntry.verifyRotationCodeAcknowledgeMessage();
        scheduling.switchToRotationCodeEntryScreen(); 
        scheduling.rotationCodeEntry.enterAtRotationCode();
        scheduling.rotationCodeEntry.enterAtDescription();
        scheduling.rotationCodeEntry.selectAtTour();
        scheduling.rotationCodeEntry.clickOnDutyRadioCheckbox();
        scheduling.rotationCodeEntry.enterNotes();
        scheduling.rotationCodeEntry.enterAtDayNo();
        scheduling.rotationCodeEntry.clickAddButton();
        scheduling.rotationCodeEntry.saveScreen();
        scheduling.switchToRotationCodeEntryScreen();
        scheduling.rotationCodeEntry.verifyBottomStatus();
        scheduling.rotationCodeEntry.closeSCreen();
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.clickRotationTab();
        scheduling.scheduleSettings.scheduleSettingsRotationTab.verifyAtDescriptionUsingCode();
        scheduling.scheduleSettings.scheduleSettingsRotationTab.selectAtCode1InGrid();
        scheduling.switchToRotationCodeEntryScreen();
        scheduling.rotationCodeEntry.selectAtTour1();
        scheduling.rotationCodeEntry.clickOffDutyRadioCheckbox();
        scheduling.rotationCodeEntry.enterAtDayNo();
        scheduling.rotationCodeEntry.clickAddButton();
        scheduling.rotationCodeEntry.verifyAtTour1AddedToGrid(1);
        scheduling.rotationCodeEntry.clickInactiveCheckbox();
        scheduling.rotationCodeEntry.verifyInactiveDateAsCurrentDate();
        scheduling.rotationCodeEntry.saveScreen();
        scheduling.switchToRotationCodeEntryScreen();
        scheduling.rotationCodeEntry.closeSCreen();
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.clickRotationTab();
        scheduling.scheduleSettings.scheduleSettingsRotationTab.clickIncludeInactiveCheckbox();
        scheduling.scheduleSettings.scheduleSettingsRotationTab.clickRefresh();
        scheduling.scheduleSettings.scheduleSettingsRotationTab.verifyInactiveRowColorUsingCode1();
    }

    @Test(groups = { "ScheduleSetting" })
    public void ScheduleSettingGroupTabFunctionality_188781(ITestContext testContext) 
    
    {
   	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
   	 testContext .setAttribute("testID", "188781");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Scheduling");
        loader.navigateToScreen("Schedule Settings");
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.clickGroupTab();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.clickAddGroupCodeButton();
        scheduling.switchToGroupEntryScreen();
        scheduling.groupEntry.clickSave();
        scheduling.groupEntry.verifyGroupCodeAcknowledgeMessage();
        scheduling.switchToGroupEntryScreen();
        scheduling.groupEntry.enterAtGroupCode();
        scheduling.groupEntry.enterAtDescription();
        scheduling.groupEntry.selectAtShift();
        scheduling.groupEntry.selectScheduleColor();
        scheduling.groupEntry.selectAtRotationCode();
        scheduling.groupEntry.tabStartDate();
        scheduling.groupEntry.enterNotes();
        scheduling.groupEntry.enterAtCalenderDisplayLabel();
        scheduling.groupEntry.saveScreen();
        scheduling.groupEntry.verifyBottomStatus();
        scheduling.groupEntry.closeScreen();
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.clickRefresh();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.verifyAtDescriptionUsingGroup();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.verifyAtDisplayNameUsingGroup();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.verifyAtRotationUsingGroup();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.verifyAtShiftUsingGroup();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.selectAtGroup1InGrid();
        scheduling.switchToGroupEntryScreen();
        scheduling.groupEntry.clickInactiveCheckbox();
        scheduling.groupEntry.verifyInactiveDateAsCurrentDate();
        scheduling.groupEntry.saveScreen();
        scheduling.groupEntry.closeScreen();
        scheduling.switchToScheduleSettings();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.clickIncludeInactiveCheckbox();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.clickRefresh();
        scheduling.scheduleSettings.scheduleSettingsGroupTab.verifyInactiveRowColorUsingGroup1();

    }

    @Test(groups = { "scheduleTime" })
    public void ScheduleTimeCategoryEntryFunctionality_189977(ITestContext testContext) 
    
    {
   	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
   		testContext.setAttribute("testID", "189977");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Scheduling");
        loader.navigateToScreen("Time Category");
        scheduling.switchToTimeCategory();
        scheduling.timeCategory.clickAddTimeCategoryButton();
        scheduling.switchToTimeCategoryEntryScreen();
        scheduling.timeCategoryEntry.clickSave();
        scheduling.timeCategoryEntry.verifyTimeCategoryCodeAcknowledgeMessage();
        scheduling.switchToTimeCategoryEntryScreen();
        scheduling.timeCategoryEntry.enterAtTimeCategoryCode();
        scheduling.timeCategoryEntry.enterAtDescription();
        scheduling.timeCategoryEntry.enterNotes();
        scheduling.timeCategoryEntry.selectAtScheduleColor();
        scheduling.timeCategoryEntry.save();
        scheduling.switchToTimeCategoryEntryScreen();
        scheduling.timeCategoryEntry.verifyBottomStatus();
        scheduling.timeCategoryEntry.closeScreen();
        scheduling.switchToTimeCategory();
        scheduling.timeCategory.clickRefresh();
        scheduling.timeCategory.verifyAtTimeCategoryInGrid();
        scheduling.timeCategory.clickAtTimeCategory1InGrid();
        scheduling.switchToTimeCategoryEntryScreen();
        scheduling.timeCategoryEntry.clickInactiveCheckbox();
        scheduling.timeCategoryEntry.verifyWarningConfirmMessage();
        scheduling.timeCategoryEntry.clickYes();
        scheduling.timeCategoryEntry.verifyInactiveDate();
        scheduling.timeCategoryEntry.save();
        scheduling.switchToTimeCategoryEntryScreen();
        scheduling.timeCategoryEntry.closeScreen();
        scheduling.switchToTimeCategory();
        scheduling.timeCategory.clickRefresh();
        scheduling.timeCategory.clickIncludeInactiveCheckBox();
        scheduling.timeCategory.verifyAtTimeCategory1InactiveRowColor();
    }

    @Test(groups = { "scheduleTime" })
    public void ScheduleTimeTypeEntryFunctionality_189978(ITestContext testContext) 
    {
   	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
   		testContext.setAttribute("testID", "189978");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Scheduling");
        loader.navigateToScreen("Time Category");
        scheduling.switchToTimeCategory();
        scheduling.timeCategory.clickAddTimeTypeButton();
        scheduling.switchToTimeTypeEntryScreen();
        scheduling.timeTypeEntry.clickSave();
        scheduling.timeTypeEntry.verifyTimeTypeCodeAcknowledgeMessage();
        scheduling.switchToTimeTypeEntryScreen();
        scheduling.timeTypeEntry.enterAtTimeTypeCode();
        scheduling.timeTypeEntry.enterAtDescription();
        scheduling.timeTypeEntry.enterNotes();
        scheduling.timeTypeEntry.clickSave();
        scheduling.timeTypeEntry.verifyTimeCategoryAcknowledgeMessage();
        scheduling.switchToTimeTypeEntryScreen();
        scheduling.timeTypeEntry.selectAtTimeCategory();
        scheduling.timeTypeEntry.enterAtMultiplicationFactor();
        scheduling.timeTypeEntry.selectReportable();
        scheduling.timeTypeEntry.selectCodePermission();
        scheduling.timeTypeEntry.save();
        scheduling.switchToTimeTypeEntryScreen();
        scheduling.timeTypeEntry.verifyBottomStatus();
        scheduling.timeTypeEntry.close();
        scheduling.switchToTimeCategory();
        scheduling.timeCategory.clickRefresh();
        scheduling.timeCategory.clickExpandAllCheckBox();
        scheduling.timeCategory.verifyAtTimeTypeInGrid();
        scheduling.timeCategory.clickAtTimeType1InGrid();
        scheduling.switchToTimeTypeEntryScreen();
        scheduling.timeTypeEntry.clickInactiveCheckbox();
        scheduling.timeTypeEntry.verifyInactiveDate();
        scheduling.timeTypeEntry.save();
        scheduling.switchToTimeTypeEntryScreen();
        scheduling.timeTypeEntry.close();
        scheduling.switchToTimeCategory();
        scheduling.timeCategory.clickRefresh();
        scheduling.timeCategory.clickIncludeInactiveCheckBox();
        scheduling.timeCategory.verifyAtTimeType1InactiveRowColor();

    }

      //region Police Sprint Defect CRM's
     @Test
     public void PoliceSprintScheduling_135730() // Police MJ
     {
         Browser.NavigateToLoginScreen();
         login.loginScreen.Logon();
         loader.navigateToModule("Scheduling");
         loader.navigateToScreen("Time Entry");
         scheduling.switchToTimeEntryScreen();
         scheduling.timeEntry.enterAtPF();
         scheduling.timeEntry.selectAtTimeCategory();  // not able to select by value, instead of used index value
         scheduling.timeEntry.selectAtTimeType();
         scheduling.timeEntry.enterRequestedForDate();
         scheduling.timeEntry.enterRequestedForTime();
         scheduling.timeEntry.enterRequestedToDate();
         scheduling.timeEntry.enterHours();
         scheduling.timeEntry.enterNotes();
         scheduling.timeEntry.saveScreen();
         scheduling.switchToTimeEntryScreen();
         scheduling.timeEntry.closeScreen();
         loader.navigateToScreen("Time Search");
         scheduling.switchToTimeSearch();
         scheduling.timeSearch.enterAtPFCode();
         scheduling.timeSearch.clickDateClearButton();
         scheduling.timeSearch.clickSearchButton();
         scheduling.timeSearch.verifyAtTimeCategory(0);
         scheduling.timeSearch.verifyAtTimeType(0);
         scheduling.timeSearch.selectAtPFCodeInGrid();
         scheduling.switchToTimeEntryScreen();
         scheduling.timeEntry.verifyAtPFCode();
         scheduling.timeEntry.veifyAtTimeCategory();
         scheduling.timeEntry.veifyAtTimeType();
         scheduling.timeEntry.closeScreen();
     
     }

     @Test
     public void Police2017Sprint1Scheduling_143759() // Police MJ
     {
         Browser.NavigateToLoginScreen();
         login.loginScreen.Logon();
         loader.navigateToModule("Scheduling");
         loader.navigateToScreen("Time Entry");
         scheduling.switchToTimeEntryScreen();
         scheduling.timeEntry.enterAtPF();
         scheduling.timeEntry.selectAtTimeCategory();
         scheduling.timeEntry.selectAtTimeType();
         scheduling.timeEntry.enterRequestedForDate();
         scheduling.timeEntry.enterRequestedForTime();
         scheduling.timeEntry.enterRequestedToDate();
         scheduling.timeEntry.enterHours();
         scheduling.timeEntry.enterNotes();
         scheduling.timeEntry.saveScreen();
         scheduling.switchToTimeEntryScreen();
         scheduling.timeEntry.switchToCalenderTab();
         scheduling.timeEntry.calenderTab.clickShowFullCalenderButton();
         scheduling.switchToCalenderScreen();

         //need to add step
     }

     @Test
     public void Police2017Sprint1Scheduling_143760() // Police MJ
     {
         Browser.NavigateToLoginScreen();
         login.loginScreen.Logon();
         loader.navigateToModule("Scheduling");
         loader.navigateToScreen("Time Entry");
         scheduling.switchToTimeEntryScreen();
         scheduling.timeEntry.enterAtPF();
         scheduling.timeEntry.selectAtTimeCategory(); 
         scheduling.timeEntry.changeAtPF();
         scheduling.timeEntry.selectTimeCategoryAsVaccation();
         scheduling.timeEntry.verifyTimeResonCodeShow();
     }
     @Test     
     public void Police2017Sprint1Scheduling_144485()
     {
         Browser.NavigateToLoginScreen();
         login.loginScreen.Logon();
         loader.navigateToModule("Scheduling");
         loader.navigateToScreen("Time Search");
         scheduling.switchToTimeSearch();
         scheduling.timeSearch.clickDivisionText();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.selectFieldUsageAsHide();
         settings.repositoryEntry.saveScreen();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.closeScreen();
         scheduling.switchToTimeSearch();
         scheduling.timeSearch.verifyDivisionFieldHide();
         scheduling.timeSearch.clickSectionText();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.selectFieldUsageAsHide();
         settings.repositoryEntry.saveScreen();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.closeScreen();
         scheduling.switchToTimeSearch();
        
         scheduling.timeSearch.verifySectionFieldHide();
         scheduling.timeSearch.clickTeamText();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.selectFieldUsageAsHide();
         settings.repositoryEntry.saveScreen();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.closeScreen();
         scheduling.switchToTimeSearch();
         scheduling.timeSearch.verifyTeamFieldHide();
         scheduling.timeSearch.clickGroupText();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.selectFieldUsageAsHide();
         settings.repositoryEntry.saveScreen();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.closeScreen();
         scheduling.switchToTimeSearch();
         scheduling.timeSearch.verifyGroupFieldHide();

         loader.navigateToScreen("Trade Swap Search");
         scheduling.switchToTradeSwapSearchScreen();
         scheduling.tradeSwapSearch.clickDivisionText();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.selectFieldUsageAsHide();
         settings.repositoryEntry.saveScreen();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.closeScreen();
         scheduling.switchToTradeSwapSearchScreen();
         scheduling.tradeSwapSearch.verifyDivisionFieldHide();
         scheduling.tradeSwapSearch.clickSectionText();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.selectFieldUsageAsHide();
         settings.repositoryEntry.saveScreen();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.closeScreen();
         scheduling.switchToTradeSwapSearchScreen();
         scheduling.tradeSwapSearch.verifySectionFieldHide();
         scheduling.tradeSwapSearch.clickTeamText();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.selectFieldUsageAsHide();
         settings.repositoryEntry.saveScreen();
         settings.switchToRepositoryEntry();
         settings.repositoryEntry.closeScreen();
         scheduling.switchToTradeSwapSearchScreen();
         scheduling.tradeSwapSearch.verifyTeamFieldHide();
     }


     @Test
     public void Police2017Sprint1Scheduling_200000(ITestContext testContext) 
     
     {
    		testContext.setAttribute("testID", "200000");
         Browser.NavigateToLoginScreen();
         login.loginScreen.Logon();
         loader.navigateToModule("Scheduling");
         loader.navigateToScreen("Calendar");
         scheduling.switchToCalendarScreen();
         scheduling.calendar.selectShowMyCalendarCheckbox();
         scheduling.calendar.clickSearchAppointments();
         
     }
     @Test(groups={"2020DefectTestCases"}) //Automated by Stalin
 	public void EmailappointmentcreateforPF(ITestContext testContext)
 	{
    	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
 	testContext.setAttribute("testID", "254467");
 	Browser.NavigateToLoginScreen();
 	login.loginScreen.Logon();
         loader.navigateToModule("Scheduling");
         loader.navigateToScreen("Calendar");	
         scheduling.switchToCalendarScreen();
         scheduling.calendar.doubleClickInCalendarByCurrentDate();
         scheduling.calendar.appointmentsPopup.enterAtSubject();
         scheduling.calendar.appointmentsPopup.enterStartTime();
         scheduling.calendar.appointmentsPopup.verifyStartTimeAsCurrentDate();
         scheduling.calendar.appointmentsPopup.enterAtEndTime();
         scheduling.calendar.appointmentsPopup.selectAtEventType();
         scheduling.calendar.appointmentsPopup.selectAtResource();
         scheduling.calendar.appointmentsPopup.save();
         scheduling.calendar.appointmentsPopup.verifyAppointmentSavedSuccessfully();
         
   		
 	}
     
     @Test(groups={"2020DefectTestCases"}) //Mithun Q4 Sprint 2 //Mahesha //test case on Hold job server not configured.
     public void TradeDualApprovalProcessChanges_256805(ITestContext testContext)
     {
    	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
          testContext.setAttribute("testID", "256805");      
         Browser.NavigateToLoginScreen();
         login.loginScreen.Logon();
         loader.navigateToModule("Settings");
         loader.navigateToScreen("System Parameter");
         settings.switchToSystemParamter();
         settings.sysParameter.setSystemparameter4322AsTrue();
         
         loader.navigateToScreen("Trade Swap Search");
         scheduling.switchToTradeSwapSearchScreen();
       /* scheduling.switchToTradeSwapEntry();
         scheduling.tradeSwapEntry.enterAtPF1();
         scheduling.tradeSwapEntry.enterAtPF2();*/
                 
     }

     @AfterMethod(groups = {"eventCode" , 
 			"ScheduleSetting",
 			"scheduleTime",
 			"2020DefectTestCases" })
	  public void afterMethodRecords(ITestResult testResult) 
	  {
		 /* try
				Playback.takeScreenShotOnFailure(testResult);
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		  try {
			ExtentReport.getResult(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Playback.stop();

			login.Reset();
			loader.Reset();
			popup.Reset();
		}
	  @AfterSuite(groups = {"eventCode" , 
				"ScheduleSetting",
				"scheduleTime",
				"2020DefectTestCases" })
	  public void afterRunSuite()
	  {
		  ExtentReport.GenerateHTML();
	  	 System.gc();
	  	}
}
