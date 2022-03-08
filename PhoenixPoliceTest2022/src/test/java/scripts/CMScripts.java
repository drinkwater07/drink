package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.CM;
import application.Civil;
import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Popup;
import application.Records;
import application.Scheduling;
import application.Settings;
import reports.ExtentReport;
import uIMaps.UIMapTraffic;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class CMScripts 
{
	
	public Civil civil;
	public Geo geo;
	public CM cM;
	public Settings settings;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popUp;
	public UIMapTraffic uIMapTraffic;
	
	public Home home;
	public Scheduling scheduling;
	public Records records;
	
	@BeforeSuite(groups = { "2020DefectTestCase",
	"2021DefectTestCases", 
	"CaseFolderFunctional",
	"CaseFolderFunctionalBatch2",
	"CaseFolderScriptsBatch2",
	"2022DefectTestCasesKIRAN"})
	public void beforeRunSuite(ITestContext testContext)
	{
		
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	

  @BeforeMethod(groups = { "2020DefectTestCase",
	"2021DefectTestCases",
	 "CaseFolderFunctional",
	"CaseFolderFunctionalBatch2",
	"CaseFolderScriptsBatch2",
	"2022DefectTestCasesKIRAN"})
  public void beforeMethodCM(ITestContext testContext) 
  {
	  
	  testContext.setAttribute("moduleName","CM");
	  Playback.testContext=testContext;
	  Playback.start();
      login=new Login();
	  loader=new Loader();		
	  objectIdentification= new ObjectIdentification();	    
      popUp = new Popup();
      settings= new Settings();
      geo= new Geo();
      civil = new Civil();
      cM = new CM();
      uIMapTraffic = new UIMapTraffic();
      
      home = new Home();
      scheduling = new Scheduling();
      records = new Records();
      
  }
  
  
  
	// case not exist
	@Test(groups = {"CaseFolderFunctionalbatch2"})
	public void CaseFolderAssignemntTab_105456(ITestContext testContext) 
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID","105456");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");

		cM.switchToCMSearch();
		cM.cMSearch.clickAddNew();
        cM.switchToCaseFolder();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.caseFolderAssignmentTab.selectSectionAsPatrol();
		cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.verifyLoggedSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.enterPrimeInvestigatorAtPFCode();
		cM.caseFolder.caseFolderAssignmentTab.tabOutNextReviewDate();
		cM.caseFolder.caseFolderAssignmentTab.verifyNextReviewDateAs7DayFutureFromCurrentDate();
		cM.caseFolder.caseFolderAssignmentTab.tabOutNextReportDate();
		cM.caseFolder.caseFolderAssignmentTab.verifyNextReportDateAs7DayFutureFromCurrentDate();
		cM.caseFolder.caseFolderAssignmentTab.enterComments();
		cM.caseFolder.save();
		cM.switchToCaseFolder();

	} 
  
  //Passed but need to restore DB
	@Test(groups = {"CaseFolderScriptsBatch2"})
	public void Police2018CMModuleAssignmentAndReview_199134(ITestContext testContext) 
  	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	  	testContext.setAttribute("testID","199134");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.selectTemplate();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAllTabs();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.clickAddNewReviewButton();
		cM.switchToCaseReview();
		cM.caseReview.selectCaseStatusAsClosed();
		cM.caseReview.tabOutDate();
		cM.caseReview.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.verifyStatusAsClosed();
		cM.caseFolder.switchToAttachmentsTab();
		cM.caseFolder.attachmentsTab.verifyAddFilesButtonDisabled();
	} 
  
  //case not exist
	@Test(groups = {"CaseFolderFunctionalbatch2"})
	public void PoliceSprintCMModuleAdvanceTab_135711(ITestContext testContext) 
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID","135711");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickAdvancedTab();
		cM.cMSearch.cMSearchAdvancedTab.selectAtEffectCategory();
		cM.cMSearch.cMSearchAdvancedTab.selectAtActivityCode();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyRowAtInvestNo(0);
		cM.cMSearch.clickBack();
		cM.cMSearch.clickReset();
		cM.cMSearch.cMSearchAdvancedTab.selectAtEffectCategory();
		cM.cMSearch.cMSearchAdvancedTab.enterHistoryAsProphoenixAutomation();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyRowAtInvestNo(0);
		cM.cMSearch.clickBack();
		cM.cMSearch.clickReset();
		cM.cMSearch.cMSearchAdvancedTab.selectAtType(); // Cant add MO Tab Details
		cM.cMSearch.cMSearchAdvancedTab.selectAtEffectCategory();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyRowAtInvestNo(0);
		cM.cMSearch.cMSearchAdvancedTab.selectAtType();
		cM.cMSearch.cMSearchAdvancedTab.selectAtDetail();
		cM.cMSearch.cMSearchAdvancedTab.selectAtActivityCode();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyRowAtInvestNo(0);
		cM.cMSearch.clickBack();
		cM.cMSearch.clickReset();
	}

  //case not exist
	@Test(groups = {"CaseFolderFunctionalbatch2"})
	public void PoliceSprintCMModuleTaskAndHistoryTab_135769(ITestContext testContext) 
	{


		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID","135769");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.selectAtDivision();
		cM.cMSearch.selectAtSection();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToTaskTab();
		cM.caseFolder.caseFolderTasksTab.clickAddNewTaskButton();
		cM.caseFolder.caseFolderTasksTab.taboutAssignedSupervisor();
		cM.caseFolder.caseFolderTasksTab.verifyLoggedPFCode();
		cM.caseFolder.caseFolderTasksTab.enterAtAssignPFNo();
		cM.caseFolder.caseFolderTasksTab.verifyInvestigatorAcknowledgeMessage();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToTaskTab();
		cM.caseFolder.caseFolderTasksTab.selectAtTaskCode();
		cM.caseFolder.caseFolderTasksTab.enterTaskAsEvidenceDocument();
		cM.caseFolder.caseFolderTasksTab.tabOutAssignedDateTime();
		cM.caseFolder.caseFolderTasksTab.tabOutDueByDateTime();
		cM.caseFolder.caseFolderTasksTab.clickAddbutton();
		cM.caseFolder.switchToTaskTab();
		cM.caseFolder.caseFolderTasksTab.verifyAtTaskCodeDescription(0); // need to analyze
		cM.switchToCaseFolder();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.verifyDateAsCurrentDate();
		cM.caseFolder.caseFolderHistoryTab.verify24HrsTime();
		cM.caseFolder.caseFolderHistoryTab.clickTaskRadioButton();
		cM.caseFolder.caseFolderHistoryTab.enterAtPFCode();
		cM.caseFolder.caseFolderHistoryTab.clickLoadButton();
		cM.caseFolder.caseFolderHistoryTab.verifyAtEnteredBy();

	}
  
	// passed
	@Test(groups = {"CaseFolderFunctionalbatch2"})
	public void PoliceSprintCMModule_148890(ITestContext testContext) 
	{

ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
testContext.setAttribute("testID","148890");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickReset();
		cM.cMSearch.selectStatusAsClosed();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAllCasesInGridHasClosedStatus();
		cM.cMSearch.selectAnyRecord();
		cM.switchToCaseFolder();
		cM.caseFolder.clickReopenButton();
		cM.caseFolder.verifyAllTabsAreOpeningWithoutIssue();
		cM.caseFolder.close();
		objectIdentification.windowHandle.switchToMainWindow();
		
	}

  
  //case Not exist
	@Test
	public void PoliceSprintCMModule_148899() 
	{
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickAddNew();
		cM.switchToCaseFolder();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickResetButton();
		cM.caseFolder.verifyAtLocation();
		cM.caseFolder.verifyAtCity();
		cM.caseFolder.verifyAtState();
		cM.caseFolder.verifyAtZipCode();
	}
  
  
  
  
  //Passed
	@Test()
	public void Police2017SprintCMModule_152759(ITestContext testContext) 
	{
		testContext.setAttribute("testID","152759");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickReset();
		cM.cMSearch.selectAtDivision();
		cM.cMSearch.clickSearch();
		cM.cMSearch.clickRandomRow();
		cM.switchToCaseFolder();
		cM.caseFolder.verifyInvestigatorsTabEnabled();
		cM.caseFolder.clickInvestigatorsTab();
		cM.caseFolder.close();
		objectIdentification.windowHandle.switchToMainWindow();

	} 
  
  
  
	//case not exist
  	@Test
	public void Police2017SprintCMModule_155968() 
	{
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAtCaseNo(0);
		cM.cMSearch.verifyRowAtInvestNo(0);
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.verifyAtInvestNo();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyAtInvestigator();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyPrimaryCheckBoxCheckedByAtInvestigatorsInGrid();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyAtInvestigator1();
		cM.caseFolder.caseFolderInvestigatorsTab.DeleteAtInvestigator();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyPrimeInvestigatorAcknowledgeMessage();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.DeleteAtInvestigator1();
		cM.caseFolder.caseFolderInvestigatorsTab.verifySupervisorInvestigatorAcknowledgeMessage();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.DeleteAtInvestigator2();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyDeleteConfirmMessage();
		cM.caseFolder.caseFolderInvestigatorsTab.saveInternal();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyInvestigatorTableRowCount(2);

	}
  
  
  
  	//Passed
  	@Test(groups = {"CaseFolderFunctional"})
	public void CaseFolderInvestigatorTab_163651(ITestContext testContext) 
  	{
  		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	  testContext.setAttribute("testID","163651");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAtCaseNo(0);
		cM.cMSearch.verifyAtStatusByAtCaseNo();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyAtInvestigator();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyAtInvestigator1();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyPrimaryCheckBoxCheckedByAtInvestigatorsInGrid();
		cM.caseFolder.caseFolderInvestigatorsTab.enterAtOfficer();
		cM.caseFolder.caseFolderInvestigatorsTab.tabOutDate();
		cM.caseFolder.caseFolderInvestigatorsTab.selectAction();
		cM.caseFolder.caseFolderInvestigatorsTab.clickAddButton();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyAtInvestigator2();
		cM.switchToCaseFolder();
		cM.caseFolder.clickSaveButton();
		cM.caseFolder.caseFolderInvestigatorsTab.verify1051UpdateDataExistsInInvestigatorTabAckMsg();
		cM.caseFolder.caseFolderInvestigatorsTab.saveInternalByNavigate("Case Folder", "frmInvestigators");
		cM.switchToCaseFolder();
		cM.caseFolder.save();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.DeleteAtInvestigator1();
		cM.caseFolder.caseFolderInvestigatorsTab.verifySupervisorInvestigatorAcknowledgeMessage();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.DeleteAtInvestigator();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyPrimeInvestigatorAcknowledgeMessage();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.DeleteAtInvestigator2();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyDeleteConfirmMessage();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.saveInternalByNavigate("Case Folder", "frmInvestigators");
		//cM.caseFolder.caseFolderInvestigatorsTab.saveInternal();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.verifyAtInvertigator2NotAppearsInGrid();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.clickInvestigatorRadioButton();
		cM.caseFolder.caseFolderHistoryTab.verifyAtInvestigator2();
		
		
		//remove comment after restoring db
		cM.caseFolder.caseFolderHistoryTab.verifyAtInvestigator1();
		cM.caseFolder.caseFolderHistoryTab.verifyAtInvestigator();
	}


  
  

	
	//case closed need to reopen
	@Test(groups = {"CaseFolderFunctional"})
	public void CaseFolderReviewTab_163654(ITestContext testContext) 
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "163654");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" CM");
		loader.navigateToScreen("CM Search");

		cM.switchToCMSearch();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.enterAtInvestigator();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAtCaseNo(1);
		cM.cMSearch.verifyAtStatusByAtCaseNo();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.clickAddNewReviewButton();
		cM.switchToCaseReview();
		cM.caseReview.clickSaveButton();
		cM.caseReview.verify8038StatusUpdateIsmandatoryAckMsg();
		cM.switchToCaseReview();
		cM.caseReview.selectAtCaseStatus();
		cM.caseReview.tabOutDate();
		cM.caseReview.verifyNextReviewDateAs5DayFutureFromCurrentDate();
		cM.caseReview.verifyNextReportDateAs10DayFutureFromCurrentDate();
		cM.caseReview.selectTemplate();
		cM.caseReview.clickLoadButton();
		cM.caseReview.save();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.verifyAtCaseStatus();
		cM.caseFolder.reviewTab.verifyNextReviewDateAs5DayFutureFromCurrentDate();
		cM.caseFolder.reviewTab.verifyNextReportDateAs10DayFutureFromCurrentDate();
		cM.caseFolder.reviewTab.clickEditIcon();
		cM.switchToCaseReview();
		cM.caseReview.verifyAtCaseStatus();
		cM.caseReview.close();
		cM.switchToCaseFolder();
		

	}
  
  //issue with automatic loading investigator
   @Test(groups = {"CaseFolderFunctional"})
	public void CaseFolderEffortsTab_163655(ITestContext testContext) 
	{
	   ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "163655");
		String hours = null;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" CM");
		loader.navigateToScreen("CM Search");

		cM.switchToCMSearch();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.enterAtInvestigator();
		cM.cMSearch.enterAtSupervisor();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAtCaseNo(1);
		cM.cMSearch.verifyAtStatusByAtCaseNo();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToEffortsTab();
		cM.caseFolder.caseFolderEffortsTab.clickAddNewEffortsTab();
		cM.switchToCaseEfforts();
		
		cM.caseEfforts.clickSaveButton();
		cM.caseEfforts.verify8002RequiredEntriesAreMissingAckMsg();
		
	
		cM.switchToCaseEfforts();
		cM.caseEfforts.clearOldInvestigator();
		cM.caseEfforts.enterAtInvestigator1();
		
	//	cM.caseEfforts.verify8053InvestigatorNotAssignedToCaseConfirmMsg();
		cM.caseEfforts.selectAtCategory();
		Playback.controlReadyThreadWait();
		cM.caseEfforts.selectAtActivityCode();
		cM.caseEfforts.tabOutStartedDate();
		cM.caseEfforts.selectTemplate();
		cM.caseEfforts.clickLoadButton();
		cM.caseEfforts.save();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToEffortsTab();
		cM.caseFolder.caseFolderEffortsTab.verifyAtInvestigatorName();
		cM.caseFolder.caseFolderEffortsTab.verifyAtActivityCode();
		cM.caseFolder.caseFolderEffortsTab.clickEditIcon();
		cM.switchToCaseEfforts();
		cM.caseEfforts.tabOutInvestigator();
		//popUp.switchToConfirm();
		//cM.caseEfforts.verify8053InvestigatorNotAssignedToCaseConfirmMsg();
		cM.caseEfforts.enterFinishedDateAs2DaysFutureFromCurrentDate();
		cM.caseEfforts.save();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToEffortsTab();
		cM.caseFolder.caseFolderEffortsTab.clickEditIcon();
		cM.switchToCaseEfforts();
		cM.caseEfforts.getCumulativeTimeHours(Playback.getTestContextAttribute("hours"));
		cM.switchToCaseFolder();
		cM.caseFolder.switchToEffortsTab();
		cM.caseFolder.caseFolderEffortsTab.verifyCumulativeTimeHours(hours);
		cM.switchToCaseFolder();
		cM.caseFolder.save();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.clickEffortsRadioButton();
		cM.caseFolder.caseFolderHistoryTab.verifyAtInvestigatorName();
		cM.caseFolder.caseFolderHistoryTab.verifyAtActivityCode();

	}
  
  //Enhancement
    @Test(groups = {"CaseFolderFunctional"})
	public void CaseFolderTaskTab_163652(ITestContext testContext) 
  	{
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 	testContext.setAttribute("testID", "163652");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" CM");
		loader.navigateToScreen("CM Search");

		cM.switchToCMSearch();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAtCaseNo(1);
		cM.cMSearch.verifyAtStatusByAtCaseNo();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToTaskTab();
		cM.caseFolder.caseFolderTasksTab.clickAddNewTaskButton();
		cM.switchToTaskUpadte();
		cM.caseFolder.caseFolderTasksTab.enterAtAssignedSupervisor();
		cM.caseFolder.caseFolderTasksTab.enterAtAssignPFNo();
		cM.caseFolder.caseFolderTasksTab.selectAtTaskCode();
		cM.caseFolder.caseFolderTasksTab.enterTaskDetails();
		cM.caseFolder.caseFolderTasksTab.tabOutAssignedDateTime();
		cM.caseFolder.caseFolderTasksTab.tabOutDueByDateTime();
		//cM.caseFolder.caseFolderTasksTab.clickAddbutton();
		cM.caseFolder.caseFolderTasksTab.clickSaveAndClosebutton();
		cM.caseFolder.verify3DoYouWantToSaveConfirmMessage();
		cM.switchToCaseFolder();
		cM.caseFolder.save();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToTaskTab();
		cM.caseFolder.caseFolderTasksTab.verifyAtTaskCodeRowAppearRedColor(0);
		cM.caseFolder.caseFolderTasksTab.selectAtTaskCodeInGrid();
		cM.caseFolder.caseFolderTasksTab.enterCompletedDateAsFutureDate();
		cM.caseFolder.caseFolderTasksTab.clickSaveAndClosebutton();
		cM.caseFolder.caseFolderTasksTab.verify1037FutureDateAndTimeNotAllowedAckMsg();
		cM.switchToTaskUpadte();
		cM.caseFolder.caseFolderTasksTab.enterCompletedDateAsCurrentDate();
		cM.caseFolder.caseFolderTasksTab.clickAddbutton();
		popUp.confirm.yes();
		cM.switchToCaseFolder();
		cM.caseFolder.verifyTaskTabAppearsGreenColor();
		cM.caseFolder.save();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.clickTaskRadioButton();
		cM.caseFolder.caseFolderHistoryTab.verifyAtTaskCode();
		cM.caseFolder.caseFolderHistoryTab.verifyAtAssignedSupervisorName();

	}
  
  //	passed
	@Test(groups = {"CaseFolderFunctional"})
	public void CaseFolderMoTab_163653(ITestContext testContext) 
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "163653");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAtCaseNo(1);
		cM.cMSearch.verifyAtStatusByAtCaseNo();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToMOTab();
		cM.caseFolder.caseFolderMOTab.selectAtType();
		cM.caseFolder.caseFolderMOTab.selectAtCategory();
		cM.caseFolder.caseFolderMOTab.selectAtDetail();
		cM.caseFolder.caseFolderMOTab.enterComment();
		cM.caseFolder.caseFolderMOTab.clickAddButton();
		cM.caseFolder.caseFolderMOTab.verifyAtTypeCategoryDetailInGrid();
		cM.switchToCaseFolder();
		cM.caseFolder.clickSaveButton();
		cM.caseFolder.caseFolderMOTab.verify1051UpdateDataExistMoTabAckMsg();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToMOTab();
		cM.caseFolder.caseFolderMOTab.save();
		cM.switchToCaseFolder();
		cM.caseFolder.saveNclose();
		objectIdentification.windowHandle.switchToMainWindow();

	}
  
  
  //Passed
	@Test(groups = {"CaseFolderFunctional"})
	public void CaseFolderUCRTab_164121(ITestContext testContext)
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "164121");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.verifyAtCaseNo(1);
		cM.cMSearch.verifyAtStatusByAtCaseNo();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToUCRTab();
		cM.caseFolder.caseFolderUCRTab.clickSaveButton();
		cM.caseFolder.caseFolderUCRTab.verify8010DispositionFieldIsMandatoryAckMsg();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToUCRTab();
		cM.caseFolder.caseFolderUCRTab.selectUCRDisposition();
		objectIdentification.windowHandle.switchToWindow("Coded Search");
		cM.caseFolder.caseFolderUCRTab.selectDispositionFromCodedSearch();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToUCRTab();
		cM.caseFolder.caseFolderUCRTab.tabOutDate();
		cM.caseFolder.caseFolderUCRTab.clickSaveButton();
		cM.caseFolder.caseFolderUCRTab.verify8005CaseRemarksAreRequiredAckMsg(); // Not comes in 2018 Stable// Reported.
		cM.switchToCaseFolder();
		cM.caseFolder.switchToUCRTab();
		cM.caseFolder.caseFolderUCRTab.selectTemplate();
		cM.caseFolder.caseFolderUCRTab.clickLoadButton();
		cM.switchToCaseFolder();
		cM.caseFolder.clickSaveButton();
		cM.caseFolder.caseFolderUCRTab.verify1051UpdatedDataExistsInTheUCRTabAckMsg();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToUCRTab();
		cM.caseFolder.caseFolderUCRTab.save();
		cM.switchToCaseFolder();
		cM.caseFolder.save();
		cM.switchToCaseFolder();
		cM.caseFolder.verifyUCRTabAppearsGreenColor();
		//cM.caseFolder.saveNclose();

	}
  
  //passed
	@Test(groups = {"CaseFolderFunctional"})
	public void CaseFoldeFunctionalityAssignmentTab_186984(ITestContext testContext)
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "186984");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.verifyAtLocation();
		cM.caseFolder.verifyAtCity();
		cM.caseFolder.verifyAtZipCode();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		//cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.selectTemplate();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAllTabs();
	}

  
  //Passed
	@Test(groups = {"CaseFolderScriptsBatch2"}) 
	public void CRM_81155_CM_186985(ITestContext testContext) 
	{
		
		testContext.setAttribute("testID", "186985");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.selectTemplate();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAllTabs();
		cM.caseFolder.switchToTaskTab();
		cM.caseFolder.caseFolderTasksTab.clickAddNewTaskButton();
		objectIdentification.windowHandle.switchToWindow("Task Update");
		cM.caseFolder.caseFolderTasksTab.enterAtAssignedSupervisor();
		cM.caseFolder.caseFolderTasksTab.enterAtAssignPFNo();
		cM.caseFolder.caseFolderTasksTab.selectTaskCode();
		cM.caseFolder.caseFolderTasksTab.enterTaskDetailsAS3000words();
		cM.caseFolder.caseFolderTasksTab.tabOutAssignedDateTime();
		cM.caseFolder.caseFolderTasksTab.tabOutDueByDateTime();
		cM.caseFolder.caseFolderTasksTab.clickSaveAndClosebutton();
		popUp.confirm.yes();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.clickTaskRadioButton();
		cM.caseFolder.caseFolderHistoryTab.verifyAtAssignedSupervisorName();
		cM.caseFolder.caseFolderHistoryTab.verifyAtAssignToPFName();

	}
  
  //issue with enter investigator
	//but passed
	@Test
	public void Police2018CMModule_187813(ITestContext testContext) 
	{
		testContext.setAttribute("testID", "187813");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.selectTemplate();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAllTabs();
		cM.caseFolder.switchToEffortsTab();
		cM.caseFolder.caseFolderEffortsTab.clickAddNewEffortsTab();
		cM.switchToCaseEfforts();
		cM.caseEfforts.enterAtInvestigator();
		cM.caseEfforts.selectAtCategory();
		cM.caseEfforts.selectAtActivityCode();
		cM.caseEfforts.tabOutStartedDate();
		cM.caseEfforts.enterFinishedDateAs2DaysFutureFromCurrentDate();
		cM.caseEfforts.selectTemplate();
		cM.caseEfforts.clickLoadButton();
		cM.caseEfforts.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToEffortsTab();
		cM.caseFolder.caseFolderEffortsTab.verifyAtActivityCode();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.clickEffortsRadioButton();
		cM.caseFolder.caseFolderHistoryTab.verifyAtActivityCode();
	}
  
  
  //passed need to do fresh entry and check
  
	@Test(groups = {"CaseFolderFunctional"})
	public void CaseFolder_163650(ITestContext testContext) 
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "163650");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" CM");
		loader.navigateToScreen("CM Search");

		cM.switchToCMSearch();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.clickAddNew();
		cM.switchToCaseFolder();
		cM.caseFolder.clickSaveButton();
		cM.caseFolder.verify8036CaseNumberIsMandatoryAckMsg();
		cM.switchToCaseFolder();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.verifyAtLocation();
		cM.caseFolder.clickSaveButton();
		cM.caseFolder.caseFolderAssignmentTab.verify8022DivisionIsMandatoryAckMsg();
		cM.switchToCaseFolder();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		cM.caseFolder.clickSaveButton();
		cM.caseFolder.caseFolderAssignmentTab.verify8004SupervisorIsNotAssignedAckMsg();
		cM.switchToCaseFolder();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.enterSolvabilityFactor();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.verifyNextReviewDateAs5DayFutureFromCurrentDate();
		cM.caseFolder.caseFolderAssignmentTab.verifyNextReportDateAs10DayFutureFromCurrentDate();
		cM.caseFolder.caseFolderAssignmentTab.selectTemplate();
		cM.caseFolder.caseFolderAssignmentTab.clickLoadButton();
		cM.caseFolder.save();
		cM.caseFolder.verifyStatusAsOpen();
		cM.caseFolder.verifyDispositionStatusAsOpenPending();
		cM.caseFolder.clickAllTabs();
		cM.caseFolder.close();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.ClickRefreshButton();
		home.myHome.myCMTab.ClickNewAssignmentAccordion();
		// homeScripts.HomeTestContext = CMTestContext;
		home.myHome.myCMTab.VerifyAtCaseNoInGrid();
		home.myHome.myCMTab.VerifyAtSupervisorPFByAtCaseNo();

	}
  
  //set attribute
	@Test
	public void CRM_76460CMModule_155968(ITestContext testContext) 
	{
		testContext.setAttribute("testID", "180959");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickReset();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.selectAtStatus();
		cM.cMSearch.enterAtInvestigator();
		cM.cMSearch.enterFromDateTime();
		cM.cMSearch.enterToDateTime();
		cM.cMSearch.clickSearch();
		cM.cMSearch.getRowCount(Playback.getTestContextAttribute("rowCount"));
		cM.cMSearch.clickPrintIcon();
		 home.switchToSelectReport();
		 home.selectReport.VerifyRecordCount("2");;
		 home.selectReport.CloseTheScreen();
	}
  
  //Case not Exist
 	@Test
	public void PoliceSprintCMModule_149460(ITestContext testContext)
	{

		testContext.setAttribute("testID", "149460");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.cMSearch.selectAtDivision();
		cM.cMSearch.selectAtSection();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToTaskTab();
		cM.caseFolder.caseFolderTasksTab.clickAddNewTaskButton();
		cM.caseFolder.caseFolderTasksTab.taboutAssignedSupervisor();
		cM.caseFolder.caseFolderTasksTab.verifyLoggedPFCode();
		cM.caseFolder.caseFolderTasksTab.enterAtAssignPFNo();
		cM.caseFolder.caseFolderTasksTab.selectAtTaskCode();
		cM.caseFolder.caseFolderTasksTab.enterTaskAsEvidenceDocument();
		cM.caseFolder.caseFolderTasksTab.tabOutAssignedDateTime();
		cM.caseFolder.caseFolderTasksTab.tabOutDueByDateTime();
		cM.caseFolder.caseFolderTasksTab.clickAddbutton();
		cM.caseFolder.caseFolderTasksTab.verifyAtTaskCodeDescription(0);
		cM.switchToCaseFolder();
		cM.caseFolder.clickCalenderIcon();
		scheduling.switchToCalendarScreen();
	}
  
  //Passed need to verify 1 more time
 	@Test(groups = {"CaseFolderScriptsBatch2"}) 
	public void Police2018CMModule_193261(ITestContext testContext) 
	{
		testContext.setAttribute("testID", "193261");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.selectTemplate();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAllTabs();
		objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("Case Folder", "Reload");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision1();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection1();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor1();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator1();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToReportingTab();
		cM.caseFolder.caseFolderReportingTab.clickAddReportButton();
		records.switchToReportManager();
		records.reportManager.selectAtType();
		records.reportManager.tabReportedbyPF();
		records.reportManager.tabDateAndTime();
		records.reportManager.enterReportDescription();
		records.reportManager.save();
		records.switchToReportStatus();
		records.reportStatus.clickCaseDataButton();
		records.switchToACD();
		records.aCD.EnterAtCFS();
		records.aCD.clickAddButton();
		records.switchToFTC();
		records.fTC.selectAttemptedCompletedAsCompleted();
		records.fTC.SelectNIBRSAs90ZAllOtherOffenses();
		records.fTC.selectCrimeAgainstAsPerson();
		records.fTC.saveNClose();
		records.switchToACD();
		records.aCD.TaboutOccuredAT();
		records.aCD.SelectPoliceForceUsedAsNone();
		records.aCD.selectDomesticViolance();
		records.aCD.Save();
		records.switchToACD();
		records.aCD.Close();
		records.switchToReportStatus();
		records.reportStatus.clickReportDetails();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.updateStatusTab.VerifyShareCaseUpdateCaseFolderCheckboxsEnabled();
		records.reportManager.updateStatusTab.ClickShareCaseUpdateCheckbox();
		records.reportManager.updateStatusTab.ClickShareCaseFolderCheckbox();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.clickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.VerifyStatusAsApprovedInGrid(0);
		records.switchToCaseUpdate();
		records.caseUpdate.closeTheScreen(); 
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.clickAddNewReviewButton();
		cM.switchToCaseReview();
		cM.caseReview.selectCaseStatusAsClosed();
		cM.caseReview.tabOutDate();
		cM.caseReview.save();
		cM.switchToCaseReview();
		cM.caseReview.close();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.verifyStatusAsClosed();

	}
  
  
  //passed
  
  
  //functionality change
 	@Test(groups = {"CaseFolderScriptsBatch2"}) 
	public void HomeMyReminders_105458(ITestContext testContext) 
	{


ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105458");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickCaseManagementAccordion();
		home.myHome.myRemindersTab.VerifyCaseAtCaseInCM();
		home.myHome.myRemindersTab.VerifyGridRowStatusOpenByCaseId();
		home.myHome.myRemindersTab.VerifyReportDueAs7thDayFromCurrentDate();

		home.myHome.myRemindersTab.SelectInquiryTypeAsReviewDue();
		home.myHome.myRemindersTab.ClickCaseManagementAccordion();
		home.myHome.myRemindersTab.VerifyCaseAtCaseInCM();
		home.myHome.myRemindersTab.VerifyReviewDueAs7thDayFromCurrentDate();

		home.myHome.myRemindersTab.SelectInquiryTypeAsNewAssignments();
		home.myHome.myRemindersTab.ClickCaseManagementAccordion();
		home.myHome.myRemindersTab.VerifyCaseAtCaseInCM();
		home.myHome.myRemindersTab.VerifyAssignedDateAsCurrentDate();

	}
  
  	//case does't exist
  
	@Test
	public void PoliceSprintCMModule_135716(ITestContext testContext) 
	{


ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
testContext.setAttribute("testID","199134");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" CM");
		loader.navigateToScreen("Case Search");
		
		 records.switchToCaseSearch();
		 records.caseSearch.enterAtCaseNo();
		 records.switchToCaseUpdate();
		 records.caseUpdate.closeTheScreen();
		 records.switchToCaseSearch(); 
		 records.caseSearch.clickDateResetButton();
		 records.caseSearch.clickSearch(); 
		 records.caseSearch.ClickRowAtCaseNumber();
		 records.switchToCaseUpdate(); 
		 records.caseUpdate.ClickCMIcon();
		
		cM.switchToCaseFolder();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.verifyAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.verifyAtSection();
		cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.verifyAtSupervisorPFCode();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		// cM.caseFolder.caseFolderAssignmentTab.tabOutDateTime();
		// cM.caseFolder.clickSaveButton();
		// cM.caseFolder.caseFolderAssignmentTab.verifyNextReviewDateAcknowledgeMessage();
		// //next review date acknowledge message not showing
		cM.caseFolder.caseFolderAssignmentTab.tabOutNextReviewDate();
		cM.caseFolder.caseFolderAssignmentTab.verifyNextReviewDateAs14DayFutureFromCurrentDate();
		cM.caseFolder.save();
		cM.switchToCaseFolder();
		cM.caseFolder.verifyCaseStatusColorAsRed();

	}
	
	@Test(groups = {"CaseFolderScriptsBatch2"}) 
	public void PoliceSprintCMModule_135725(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID","135725");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.ClickNewAssignmentAccordion();
		home.myHome.myCMTab.VerifyAtCaseNumber(0);
		home.myHome.myCMTab.VerifyAtInvestNo(0);
		home.myHome.myCMTab.VerifyStatusAsOpen(0);
		home.myHome.myCMTab.ClickRowAtInvestNo();   
		cM.switchToCaseFolder();
		cM.caseFolder.save();
		cM.caseFolder.close();
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.ClickRefreshButton();
		home.myHome.myCMTab.ClickNewAssignmentAccordion();
		home.myHome.myCMTab.VerifyAssignmentGridDisappear();  

	}

	@Test
	public void PoliceSprintCMModule_135726(ITestContext testContext) {
		

ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
testContext.setAttribute("testID","135726");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageTab();
		home.myHome.messageTab.VerifyMessageBulletinPrimeInvest();  
		loader.navigateToModule(" CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickReset();
		cM.cMSearch.enterAtCaseNumber();
		records.switchToCaseUpdate();
		records.caseUpdate.closeTheScreen();
		cM.switchToCMSearch();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickSearch();
		cM.cMSearch.clickRowAtInvestNo();
		cM.switchToCaseFolder();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.save();
		cM.switchToCaseFolder();
		cM.caseFolder.close();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.logout();// Chrome browser issue
		Browser.NavigateToUrl("Police");
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageTab();
		home.myHome.messageTab.VerifyMessageBulletinPrimeInvest();  
	}



	@Test
	public void PoliceSprintCMModule_135771(ITestContext testContext) // based on CM PoliceData
	{


ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
testContext.setAttribute("testID","135771");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.ClickNewAssignmentAccordion();
		home.myHome.myCMTab.ClickCaseNoColumnNameNewAssignment();
		home.myHome.myCMTab.VerifyAtCaseNoSortOrderNewAssignment(0);
		home.myHome.myCMTab.ClickInvestNoColumnNameNewAssignment();
		home.myHome.myCMTab.VerifyAtInvestNoSortOrderNewAssignment(0);
		home.myHome.myCMTab.ClickTasksAccordion();
		home.myHome.myCMTab.ClickAssignedTaskColumnNameTasks();
		home.myHome.myCMTab.VerifyAtAssignedTaskSortOrderTask(0);
		home.myHome.myCMTab.ClickCaseNoColumnNameTasks();
		home.myHome.myCMTab.VerifyAtCaseNoSortOrderTask(0);
		home.myHome.myCMTab.ClickInvestNoColumnNameTasks();
		home.myHome.myCMTab.VerifyAtInvestNoSortOrderTask(0);  
	}



	@Test(groups = {"CaseFolderScriptsBatch2"}) 
	public void PoliceSprintCMModule_149024(ITestContext testContext)
	        {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID","149024");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Records");
	            loader.navigateToScreen("Case Search");
	            records.switchToCaseSearch();
	            records.caseSearch.enterAtCaseNo();
	            records.switchToCaseUpdate();
	            records.caseUpdate.switchToMOTab();
	            records.caseUpdate.mOTab.SelectAtType();
	            records.caseUpdate.mOTab.SelectAtCategory();
	            records.caseUpdate.mOTab.SelectAtDetail();
	            records.caseUpdate.mOTab.EnterComments();
	            records.caseUpdate.mOTab.ClickAddButton();
	            records.caseUpdate.mOTab.VerifyAtType(0);
	            records.switchToCaseUpdate();
	            records.caseUpdate.clickSave();
	            records.caseUpdate.VerifyAcknowledgeUpdateMessage();
	            records.caseUpdate.switchToMOTab();
	            records.caseUpdate.mOTab.ClickSaveButtonMOTab();
	            records.switchToCaseUpdate();
	            records.caseUpdate.ClickSaveAndCloseButton();   
	            loader.navigateToModule("CM");
	            loader.navigateToScreen("MO Search");
	            cM.switchToMOSearch();
	            cM.mOSearch.clickSearchButton();
	            cM.mOSearch.verifyAcknowledgeSelectType();
	            cM.switchToMOSearch();
	            cM.mOSearch.selectAtType();
	            cM.mOSearch.selectAtCategory();
	            cM.mOSearch.selectAtDetail();
	            cM.mOSearch.clickSearchButton();
	            cM.mOSearch.verifyAtType(0);
	            cM.mOSearch.verifyAtCategory(0);
	            loader.navigateToModule("Records");
	            loader.navigateToScreen("Case Search");
	            records.switchToCaseSearch();
	            records.caseSearch.ClickReset();
	            records.caseSearch.EnterAtCaseNo1();
	            records.switchToCaseUpdate();
	            records.caseUpdate.switchToMOTab();
	            records.caseUpdate.mOTab.SelectAtType();
	            records.caseUpdate.mOTab.SelectAtCategory();
	            records.caseUpdate.mOTab.SelectAtDetail();
	            records.caseUpdate.mOTab.EnterComments();
	            records.caseUpdate.mOTab.ClickAddButton();
	            records.caseUpdate.mOTab.VerifyAtType(0);
	            records.caseUpdate.mOTab.ClickSaveButtonMOTab();
	            records.switchToCaseUpdate();
	            records.caseUpdate.ClickSaveAndCloseButton();   
	            loader.navigateToModule("CM");
	            loader.navigateToScreen("MO Search");
	            cM.switchToMOSearch();
	            cM.mOSearch.reloadMOSearchTab();
	            cM.mOSearch.oKWithWebPageAlertWindowReloadScreenMessage();
	            cM.switchToMOSearch();
	            cM.mOSearch.clickSearchButton();
	            cM.mOSearch.verifyAcknowledgeSelectType();
	            cM.switchToMOSearch();
	            cM.mOSearch.selectAtType();
	            cM.mOSearch.selectAtCategory();
	            cM.mOSearch.selectAtDetail();
	            cM.mOSearch.clickSearchButton();
	            cM.mOSearch.verifyAtType(0);
	            cM.mOSearch.verifyAtCategory(0);

	        }

	@Test
	public void PoliceSprintCMModule_149181()
	        {
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Records");
	            loader.navigateToScreen("Case Search");
	            records.switchToCaseSearch();
	           
	            records.caseSearch.enterAtCaseNo();
	            records.switchToCaseUpdate();
	            records.caseUpdate.clickCaseManagementIcon();   
	            cM.switchToCaseFolder();
	            cM.caseFolder.verifyAtCaseNo();
	            cM.caseFolder.verifyAtLocation();
	            cM.caseFolder.clickAssignmentTab();
	            cM.caseFolder.caseFolderAssignmentTab.verifyAtSection();
	            cM.caseFolder.caseFolderAssignmentTab.verifyAtDivision();
	            cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
	            cM.caseFolder.caseFolderAssignmentTab.enterSolvabilityFactor();
	            cM.caseFolder.caseFolderAssignmentTab.enterPrimeInvestigator();
	            cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
	            cM.caseFolder.caseFolderAssignmentTab.verifyNextReportDateAs14DayFutureFromCurrentDate();
	            cM.caseFolder.caseFolderAssignmentTab.selectTemplate();
	            cM.caseFolder.caseFolderAssignmentTab.clickLoadButton();
	            cM.switchToCaseFolder();
	            cM.caseFolder.clickSaveButton();
	            cM.caseFolder.verifyAllTabsAreOpeningWithoutIssue();
	            cM.caseFolder.switchToQAFormsTab();
	           
	            records.questionnarie.SelectFormAsTest();
	            records.questionnarie.ClickFillFormButton();
	            records.switchToQuestionDataEntry();
	            records.questionDataEntry.EnterAtPFCode();
	            records.questionDataEntry.FillTheQAForm();
	            records.questionDataEntry.ClickSaveButton();
	            records.questionDataEntry.ClickLockButton();
	            records.questionDataEntry.VerifyLockConfirmMessage();
	            records.questionDataEntry.VerifyLockButtonDisabled();   
	        }

	@Test(groups = {"CaseFolderScriptsBatch2"}) 
	public void PoliceSprintCMModule_149321()
	        {
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("CM");
	            loader.navigateToScreen("CM Search");
	            cM.switchToCMSearch();
	            cM.cMSearch.clickReset();
	            cM.cMSearch.enterAtInvestNo();
	            cM.cMSearch.clickSearch();
	            cM.cMSearch.verifyAtCaseNo(0);
	            cM.cMSearch.clickRowAtInvestNo();
	            cM.switchToCaseFolder();
	            cM.caseFolder.clickCustomSettingIconAndManageCustomFields();
	            cM.caseFolder.switchToCustomSettings();
	            settings.customFieldsScreen.enterAtCustomTable();
	            settings.customFieldsScreen.enterTabName();
	            settings.customFieldsScreen.saveScreen();
	            settings.customFieldsScreen.clickAddNewFieldButton();
	            settings.customFieldsScreen.enterDisplayName();
	            settings.customFieldsScreen.enterColumnName();
	            settings.customFieldsScreen.enterDescription();
	            settings.customFieldsScreen.selectDataTypeAsSingleLine();
	            settings.customFieldsScreen.selectFormatAsText();
	            settings.customFieldsScreen.enterMaximumLengthAs50();
	            settings.customFieldsScreen.enterGroupName();
	            settings.customFieldsScreen.selectNumberofColumnRadioButton();
	            settings.customFieldsScreen.selectColumnRadioButton();
	            settings.customFieldsScreen.enterLineNumberWithinGroup();
	            settings.customFieldsScreen.clickAddButton();
	            settings.customFieldsScreen.verifyDataTypeAsSingleLineOrText(0);
	            settings.customFieldsScreen.verifyLengthAs50(0);
	            settings.customFieldsScreen.verifyRowTextDisplayedInGreenColor();
	            settings.customFieldsScreen.clickRepublishButton();
	            settings.customFieldsScreen.verifyRepublishButtonDisabled();
	            settings.customFieldsScreen.saveScreen();
	            settings.customFieldsScreen.closeTheScreen();
	            cM.switchToCaseFolder();
	            cM.caseFolder.clickResetButton();
	            cM.caseFolder.switchToCustomTab();
	            cM.caseFolder.caseFolderCustomTab.FillCustomFields();
	            cM.caseFolder.caseFolderCustomTab.clickInternalSave();
	            cM.switchToCaseFolder();
	            cM.caseFolder.clickSaveButton();   
	        }

	
	@Test(groups = {"2020DefectTestCase"})   //Automated by Stalin
	public void SysAsFALSEverifythatMyCMtabInvest(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254468");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter917AsFalse();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter918AsFalse();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter919AsFalse();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter920AsFalse();
		settings.switchToSystemParamter();
		settings.sysParameter.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.clickOpenCaseFolderAccordion();
		home.myHome.myCMTab.verifyAsInvestColumnNameInTable();
		home.myHome.myCMTab.verifyAsSupervisorPFColumnNameInTable();
		home.myHome.myCMTab.verifyAsPrimePFColumnNameInTable();
		home.myHome.myCMTab.verifyAsHighestCATColumnNameInTable();
	}

	@Test(groups = {"2020DefectTestCase"})     //Automated by Stalin
	public void SysAsTRUEVerifythatMyCMtabInvest(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254468");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter917AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter918AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter919AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter920AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.clickOpenCaseFolderAccordion();
		home.myHome.myCMTab.verifyAsInvestColumnNameNotInTable();
		home.myHome.myCMTab.verifyAsSupervisorPFColumnNameNotInTable();
		home.myHome.myCMTab.verifyAsSupervisorPFColumnNameNotInTable();
		home.myHome.myCMTab.verifyAsChargeCFSColumnNameInTable();

	}
	
	@Test(groups = {"2020DefectTestCase"}) 
	public void DefectTestcase2020_254612(ITestContext testContext)  {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254612");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter764AsBlank();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter909AsAdministration();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter905AsOpenPending();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickCMIcon();
		cM.switchToCaseFolder();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.selectDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterPrimeInvestigatorAtPFCode();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.tabOutNextReviewDate();
		cM.switchToCaseFolder();
		cM.caseFolder.save();
		cM.switchToCaseFolder();
		cM.caseFolder.clickCaseInfoButton();
		records.switchToCaseUpdate();
		records.caseUpdate.VerifyAtCaseStatus();
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.ClickReset();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.VerifyAtCaseStatus();
		
	}

	@Test(groups = {"2020DefectTestCase"})   //Mithun
	public void VerifyIncidentDetailsAllowingToPrintArrestDetails_257953(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	     testContext.setAttribute("testID", "257953");
	     Browser.NavigateToLoginScreen();
	     login.loginScreen.Logon();
	     loader.navigateToModule("Records");
	     loader.navigateToScreen("Walk-In Entry");
	     records.switchToWalkInEntry();
	     records.walkInEntry.enterAtCADCFS();
	     records.walkInEntry.tabTheReportedDate();
	     records.walkInEntry.tabTheReportedTime();
	     records.walkInEntry.enterAtLocation();
	     records.walkInEntry.tabTheReceivedSource();
	     records.walkInEntry.enterAtCADDispositon();
	     records.walkInEntry.enterAtUnit();
	     records.walkInEntry.save();

	     records.switchToCaseUpdate();
	     String CaseNo=records.caseUpdate.readCaseNo();
	     records.caseUpdate.ClickCMIcon();
	     cM.switchToCaseFolder();
	     cM.caseFolder.clickAssignmentTab();
	     cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
	     cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
	     cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
	     cM.caseFolder.caseFolderAssignmentTab.clickSupervisorSearchButton();
	     cM.caseFolder.caseFolderAssignmentTab.verify8023SectionIsMandatoryAckMsg();
	     cM.switchToCaseFolder();    
	     cM.caseFolder.clickAssignmentTab();
	     cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
	     cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
	     cM.caseFolder.caseFolderAssignmentTab.tabOutNextReviewDate();
	     cM.caseFolder.caseFolderAssignmentTab.tabOutNextReportDate();
	     cM.switchToCaseFolder();
	     cM.caseFolder.save();	     
	     
	     objectIdentification.windowHandle.switchToMainWindow();
	     loader.navigateToModule("CM");
	     loader.navigateToScreen("CM Search");
	     cM.switchToCMSearch();
	     cM.cMSearch.clickDateRangeClearButton();
	     cM.cMSearch.enterAtSupervisor();
	     cM.cMSearch.clickSearch();
	     cM.cMSearch.verifyAtCaseNo(CaseNo);
	     
	}
	        

	@Test(priority=1,groups={"2021DefectTestCases"}) // Vijay
	public void verifyThatTheUserCanAbleToSeeTheNewlyAssignedCaseFolderInTheNewAssignmentSection_265261(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "265261");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.enterDateAssignedAsFutureDate(2);
		cM.caseFolder.caseFolderAssignmentTab.verifyNextReportDateAsPerSystemParameter902(10, 2);
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickSaveButton();
		cM.switchToCaseFolder();
		cM.caseFolder.verifyDateAssignedCannotBeFutureDate();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.clearDateAssigned();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.verifyNextReportDateAsPerSystemParameter902(10, 0);
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.ClickNewAssignmentAccordion();
		home.myHome.myCMTab.VerifyAtCaseNoSortOrderNewAssignment();
		home.myHome.myCMTab.VerifyAtPrimePFSortOrderNewAssignment(0);
		home.myHome.myCMTab.verifyNewAssignmentsLabelShowingRecordsCountProperly();

	}
	@Test(groups={"2021DefectTestCases"})
	public void verifyThatUserWithNoCMSupervisorStatusRolePermessionAbleToSeeOnlyNewAssignmentTaskAndOpenCaseFolder_265259(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "265259");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.verifyNewAssignmentsAccordionIsDisplayed();
		home.myHome.myCMTab.verifyTasksAccordionIsDisplayed();
		home.myHome.myCMTab.verifyOpenCaseFolderAccordionIsDisplayed();
	}

@Test(priority=2,groups={"2021DefectTestCases"}) // Vijay
	public void verifyThatTheUserCanAbleToSeeTheNewlyAssignedCaseFolderInTheNewAssignmentSection_265262(
			ITestContext testcontext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "265262");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.ClickNewAssignmentAccordion();
		home.myHome.myCMTab.clickAtCaseNoInNewAssignmentsTabInGrid();
		cM.switchToCaseFolder();
		cM.caseFolder.close();
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.ClickRefreshButton();
		home.myHome.myCMTab.ClickNewAssignmentAccordion();
		home.myHome.myCMTab.VerifyAssignmentGridDisappear();
	}

	@Test(groups={"2021DefectTestCases"}) // Vijay
	public void verifyTheMessageLogicWhileChangingThePrimeInvestigator_265268(ITestContext testcontext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "265268");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.save();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.VerifyAtMessageBulletinPrimeInvestigator();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.clickSearch();
		cM.cMSearch.clickAtCaseNoInGrid();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToInvestigatorsTab();
		cM.caseFolder.caseFolderInvestigatorsTab.enterAtOfficer();
		cM.caseFolder.caseFolderInvestigatorsTab.tabOutDate();
		cM.caseFolder.caseFolderInvestigatorsTab.selectAction();
		cM.caseFolder.caseFolderInvestigatorsTab.clickAddButton();
		cM.caseFolder.caseFolderInvestigatorsTab.clickOnPrimeCheckBoxByOfficerDescription();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.VerifyAtMessageBulletinOfficerDescription();
	}



	@Test (groups={"2021DefectTestCases"})// Vijay
	public void verifyStatusChangesInCaseFolderReviewTabPopulatedInCaseFolderStatusChangedToAndCaseStatusChangeToFields_270894(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "270894");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("CM Search");
		cM.switchToCMSearch();
		cM.cMSearch.enterAtInvestNo();
		cM.cMSearch.clickDateRangeClearButton();
		cM.cMSearch.clickSearch();
		cM.cMSearch.selectRowByAtInvestNo();
		cM.switchToCaseFolder();

		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.clickAddNewReviewButton();
		cM.switchToCaseReview();
		cM.caseReview.selectAtCaseStatus();
		cM.caseReview.tabOutDateAndTime();
		cM.caseReview.selectTemplateAsAutomation();
		cM.caseReview.clickLoadButton();
		cM.caseReview.save();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.verifyAtCaseStatusContentInRemarks();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.clickCaseStatusRadioButton();
		cM.caseFolder.caseFolderHistoryTab.clickShowAllRadioButton();
		cM.caseFolder.caseFolderHistoryTab.verifyContentInRemarksArea("Open");
		cM.switchToCaseFolder();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.clickEditIcon();
		cM.switchToCaseReview();
		cM.caseReview.selectAtCaseStatus1();
		cM.caseReview.tabOutDateAndTime();
		cM.caseReview.selectTemplateAsAutomation();
		cM.caseReview.clickLoadButton();
		cM.caseReview.save();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.verifyAtCaseStatus1ContentInRemarks();
		cM.switchToCaseFolder();
		cM.caseFolder.switchToHistoryTab();
		cM.caseFolder.caseFolderHistoryTab.clickCaseStatusRadioButton();
		cM.caseFolder.caseFolderHistoryTab.clickShowAllRadioButton();
		cM.caseFolder.caseFolderHistoryTab.verifyContentInRemarksArea("Closed");
	}
	
	@Test(priority=3,groups = {"2021DefectTestCases"})   //Mithun
	public void ToCreateaParametertoRemoveDivisionSectionrestrictionsforassigningorviewingCasesinCasemanagement_265265(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	     testContext.setAttribute("testID", "265265");
	     Browser.NavigateToLoginScreen();
	     login.loginScreen.Logon();
	     loader.navigateToModule("CM");
	     loader.navigateToScreen("CM Search");
	     cM.switchToCMSearch();
	     cM.cMSearch.clickReset();
	     cM.cMSearch.enterAtCaseNumber();
	     cM.switchToCMSearch();
	     cM.cMSearch.clickSearch();
	     cM.cMSearch.clickRandomRow();
	     cM.switchToCaseFolder();
	     cM.caseFolder.clickAssignmentTab();
	   //  cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
	     cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
	     cM.switchToCaseFolder();
	     cM.caseFolder.save();
	     cM.switchToCMSearch();
	     
	}
	
	@Test(priority=4,groups = {"2021DefectTestCases"})   //Mithun
	public void VerifytheAssignmentTabModificationSetSystemParameter912yes_265266(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	     testContext.setAttribute("testID", "265266");
	     Browser.NavigateToLoginScreen();
	     login.loginScreen.Logon();
	     loader.navigateToModule("Settings");
			loader.navigateToScreen("System Parameter");
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter912AsYes();
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter909AsAdministration();
	     loader.navigateToModule("CM");
	     loader.navigateToScreen("CM Search");
	     cM.switchToCMSearch();
	     cM.cMSearch.clickReset();
	     cM.cMSearch.enterAtCaseNumber();
	     cM.switchToCMSearch();
	     cM.cMSearch.clickSearch();
	     cM.cMSearch.clickRandomRow();
	     cM.switchToCaseFolder();
	     cM.caseFolder.clickAssignmentTab();
	    // cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
	     cM.caseFolder.caseFolderAssignmentTab.clearAndTabPrimeInvestigator();
	     cM.caseFolder.caseFolderAssignmentTab.verifyAtPrimeInvestigatorName();
	     cM.switchToCaseFolder();
	     cM.caseFolder.save();
	     cM.switchToCaseFolder();
	}
	
	@Test(priority=5,groups = {"2021DefectTestCases"})   //Mithun
	public void VerifytheAssignmentTabModificationSetSystemParameter912No_265267(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	     testContext.setAttribute("testID", "265267");
	     Browser.NavigateToLoginScreen();
	     login.loginScreen.Logon();
	     loader.navigateToModule("Settings");
			loader.navigateToScreen("System Parameter");
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter912AsNo();
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter909AsAdministration();
	     loader.navigateToModule("CM");
	     loader.navigateToScreen("CM Search");
	     cM.switchToCMSearch();
	     cM.cMSearch.clickReset();
	     cM.cMSearch.enterAtCaseNumber();
	     cM.cMSearch.clickSearch();
	     cM.cMSearch.clickRandomRow();
	     cM.switchToCaseFolder();
	     cM.caseFolder.clickAssignmentTab();
			cM.caseFolder.caseFolderAssignmentTab.selectSection();
			cM.caseFolder.caseFolderAssignmentTab.selectDivision();	     
	}
	
	@Test(groups = { "" }, priority = 1) // Vijay // Q3 Sprint 3
	public void verifyOfficersFromDifferentDivisionsAndSectionsAbleToSeeOtherDivisionAndSectionsReportsThatAreNotSharedWhenSystemPara912True_278654A(
			ITestContext testcontext) {
		testcontext.setAttribute("testID", "278654A");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter912AsYes();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter926AsTrue();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.selectTemplateAsAutomation();
		cM.caseFolder.caseFolderAssignmentTab.clickLoadButton();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToReportingTab();
		cM.caseFolder.caseFolderReportingTab.verifyAtTypeInGrid();
	}

	@Test(groups = { "" }, priority = 2) // Vijay // Q3 Sprint 3 // Run After 278654A
	public void verifyOfficersFromDifferentDivisionsAndSectionsAbleToSeeOtherDivisionAndSectionsReportsThatAreNotSharedWhenSystemPara912True_278654B(
			ITestContext testcontext) {
		testcontext.setAttribute("testID", "278654B");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportApprovalTab();
		home.myHome.myApprovalTab.VerifyAtRefNoNotAvailable();
	}

	// Automated by TesterName : Vijay Date :07/30/2021 Sprint: Q3 Sprint 2
	@Test
	public void verifyTheCaseFolderReviewTabIsWorkingWhenCloseTheCase_278650(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278650");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
		cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
		cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.clickAddNewReviewButton();
		cM.switchToCaseReview();
		cM.caseReview.selectAtCaseStatus();
		cM.caseReview.clickSaveButton();
		cM.caseReview.verifyReviewDateIsMandatoryAcknowledgeMessage();
		cM.switchToCaseReview();
		cM.caseReview.tabOutDateAndTime();
		cM.caseReview.save();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.switchToReviewTab();
		cM.caseFolder.reviewTab.verifyAtCaseStatusContentInRemarks();

	}
		// Automated by KIRAN :- Date :-10/5/2021 Quarter:-4 Sprint:-1
		@Test(groups = "2022DefectTestCasesKIRAN", priority = 1)
		public void VerifyThatTheUserCanAbleToSeeTheTaskAssignedToThemInTheTaskSection_265263(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "265263");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContext();

			loader.navigateToModule("CM");
			loader.navigateToScreen("Case Folder");
			cM.switchToCaseFolderScreenTab();
			cM.caseFolder.enterAtCaseNo();

			cM.caseFolder.clickAssignmentTab();
			cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
			cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
			cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
			cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
			cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
			cM.caseFolder.caseFolderAssignmentTab.verifyNextReportDateAs10DayFutureFromCurrentDate();

			cM.caseFolder.save();

			cM.caseFolder.clickTasksTab();
			cM.caseFolder.switchToTaskTab();

			cM.caseFolder.caseFolderTasksTab.clickAddNewTaskButton();
			cM.switchToTaskUpadte();
			cM.caseFolder.caseFolderTasksTab.selectAtTaskCode();

			cM.caseFolder.caseFolderTasksTab.enterAtAssignPFNo();
			cM.caseFolder.caseFolderTasksTab.enterAtAssignedSupervisor();
			cM.caseFolder.caseFolderTasksTab.enterAssignedDateAspreviousDateAndTabTime();//NEW KIRAN
			cM.caseFolder.caseFolderTasksTab.enterDueDateAspreviousDateAndTabTime();//NEW KIRAN
			cM.caseFolder.caseFolderTasksTab.clickSave();
			// cM.caseFolder.switchToTaskTab();
	//objectIdentification.windowHandle.switchToMainWindow();
			cM.switchToCaseFolder();
			cM.caseFolder.save();

			loader.navigateToModule("Home");
			loader.navigateToScreen("My Home");
			home.switchToMyHomeScreen();

			home.myHome.SwitchToMyCMTab();
			home.myHome.myCMTab.verifyNewAssignmentsAccordionIsDisplayed();
			home.myHome.myCMTab.ClickNewAssignmentAccordion();

			home.myHome.myCMTab.VerifyAtCaseNoInGrid();
			home.myHome.myCMTab.ClickTasksAccordion();
			home.myHome.myCMTab.verifyCaseNoInTaskGrid();
			home.myHome.myCMTab.verifyTaskRowColor();

		}

		// Automated by KIRAN :- Date :-10/6/2021 Quarter:-4 Sprint:-1
		@Test(groups = "2022DefectTestCasesKIRAN", priority = 2)
		public void VerifyThatTheUserCanAbleToSeeTheTaskAssignedToThemInTheTaskSectionAsInvestigator_284227(
				ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "284227");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContext();

			loader.navigateToModule("Home");
			loader.navigateToScreen("My Home");
			home.switchToMyHomeScreen();
			home.myHome.SwitchToMyCMTab();
			home.myHome.myCMTab.verifyNewAssignmentsAccordionIsDisplayed();
			//home.myHome.myCMTab.ClickNewAssignmentAccordion();
			home.myHome.myCMTab.verifyTasksAccordionIsDisplayed();
			home.myHome.myCMTab.ClickTasksAccordion();
			home.myHome.myCMTab.clickAtCaseNo();
			cM.switchToCaseFolder();
			cM.caseFolder.switchToTaskTab();
			cM.caseFolder.caseFolderTasksTab.clickAddNewTaskButton();
			cM.switchToTaskUpadte();
		
			cM.caseFolder.caseFolderTasksTab.selectAtTaskCode();
			cM.caseFolder.caseFolderTasksTab.enterAtAssignPFNo();
			cM.caseFolder.caseFolderTasksTab.enterAtAssignedSupervisor();
			cM.caseFolder.caseFolderTasksTab.tabOutAssignedDateTime();
			cM.caseFolder.caseFolderTasksTab.tabOutDueByDateTime();
			cM.caseFolder.caseFolderTasksTab.clickSave();
			cM.switchToCaseFolder();
			cM.caseFolder.save();
			cM.caseFolder.switchToTaskTab();
			cM.caseFolder.caseFolderTasksTab.verifyDateAsPrevioudDateInFirstRow(0);
			cM.caseFolder.caseFolderTasksTab.verifyDateAsTodayDate(1);

		}

		// Automated by KIRAN :- Date :-10/7/2021 Quarter:-4 Sprint:-1 Module:-CM
		@Test(groups = { "2022DefectTestCasesKIRAN" })
		public void VerifyThatTheuserCanAbleToseeTheCaseFolderSectionSortedbyprimeInvestigatgionSection_265264(
				ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "265264");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContext();
			loader.navigateToModule("CM");
			loader.navigateToScreen("Case Folder");

			cM.switchToCaseFolderScreenTab();
			cM.caseFolder.enterAtCaseNo();

			cM.caseFolder.clickAssignmentTab();
			cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
			cM.caseFolder.caseFolderAssignmentTab.selectAtSection();
			cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
			cM.caseFolder.caseFolderAssignmentTab.enterAtSupervisor();
			cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
			cM.caseFolder.caseFolderAssignmentTab.verifyNextReportDateAs10DayFutureFromCurrentDate();

			cM.caseFolder.save();

			loader.navigateToModule("Home");
			loader.navigateToScreen("My Home");
			home.switchToMyHomeScreen();

			home.myHome.SwitchToMyCMTab();
			home.myHome.myCMTab.verifyOpenCaseFolderAccordionIsDisplayed();
			home.myHome.myCMTab.clickOpenCaseFolderAccordion();
			home.myHome.myCMTab.verifyAtCaseNoFromOpenCaseFolder();
			home.myHome.myCMTab.verifyHeaderLineInOpenCase();

		}
		
		//Automated by KIRAN :-     Date :-11/25/2021  Quarter:-4  Sprint:-4 Module:-CM
				@Test(groups = { "2022RBTestCasesKIRAN" })
				public void VerifyTheCMIsAbleToCloseInReviewTab_287554(ITestContext testContext) {
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "287554");
					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
					loader.navigateToModule("CM");
					loader.navigateToScreen("CM Search");
					cM.switchToCMSearch();
					cM.cMSearch.clickSearch();
					cM.cMSearch.clickAtCaseNoInGrid();
					cM.switchToCaseFolder();
					cM.caseFolder.verifyStatusAsOpen();
					cM.caseFolder.switchToReviewTab();
					cM.caseFolder.reviewTab.clickAddNewReviewButton();
					cM.switchToCaseReview();
					cM.caseReview.selectAtCaseStatus();
					cM.caseReview.verifyAtStatusLabel();
					cM.caseReview.tabOutDateAndTime();
					cM.caseReview.save();
					cM.switchToCaseFolder();
					cM.caseFolder.verifyAtStatus();
					cM.caseFolder.verifyTabTextColor();
					cM.caseFolder.switchToReviewTab();
					cM.caseFolder.reviewTab.clickAddNewReviewButton();
					cM.switchToCaseReview();
					cM.caseReview.selectAtCaseStatus();
					cM.caseReview.verifyAtStatusLabel1();
					cM.caseReview.tabOutDateAndTime();
					cM.caseReview.save();
					cM.switchToCaseFolder();
					cM.caseFolder.verifyAtStatus();
				
				}
				

    
   @AfterMethod(groups = { "2020DefectTestCase",
	"2021DefectTestCases",
	 "CaseFolderFunctional",
	"CaseFolderFunctionalBatch2",
	"CaseFolderScriptsBatch2",
	"2022DefectTestCasesKIRAN"})
    public void afteTestMethod(ITestResult testResult) 
    {
	  
	   objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
	   try {
			ExtentReport.getResult(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   ExtentReport.GenerateHTML();
			Playback.stop();

			login.Reset();
			loader.Reset();  
    }

   @AfterSuite(groups = { "2020DefectTestCase",
	"2021DefectTestCases",
	 "CaseFolderFunctional",
	"CaseFolderFunctionalBatch2",
	"CaseFolderScriptsBatch2",
	"2022DefectTestCasesKIRAN"})
   public void afterRunSuite()
   {
   	ExtentReport.GenerateHTML();
   	
   	}



	
}
