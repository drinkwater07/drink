package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Alarms;
import application.Coroner;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Records;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class CoronerScripts {

	public Alarms alarms;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Names names;
	public Coroner coroner;
	public Records records;
	
	@BeforeSuite(groups = {"CoronerCaseFunctionality" , "CoronerEvidenceFunctionality"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	
	
  @BeforeMethod(groups = {"CoronerCaseFunctionality" , "CoronerEvidenceFunctionality"})
  public void beforeMethod(ITestContext testContext)
  {
	  
	  testContext.setAttribute("moduleName","Coroner" );
	  Playback.testContext=testContext;
	  Playback.start();
      login=new Login();
	  loader=new Loader();		
	  objectIdentification= new ObjectIdentification();	    
      popup = new Popup();
      names = new Names();
      coroner = new Coroner();
      records = new Records();
     
  }
  
  
  
  @Test(groups = {"CoronerCaseFunctionality"})
  public void CoronerCaseEntryWithDODunknown_265521(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265521");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.clickAddNew();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.enterAtRMSCaseNo();
		coroner.coronerCaseEntry.clickDODUkownCheckBox();
		coroner.coronerCaseEntry.enterAtNameID();
		coroner.coronerCaseEntry.verifyAtSex();
		//coroner.coronerCaseEntry.verifyAtAge();
		coroner.coronerCaseEntry.verifyAtAddress();
		coroner.coronerCaseEntry.clickOnMainTab();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterAtInvestigator();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterDateAssignedAsCurrentDate();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.verifyNextReviewDateAs7DaysAfterAssign();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterAtLocationOfDeath();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectAtCauseOfDeath();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectAtLocalMortuary();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectAtSubstanceInvolved();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectMannerOfDeath();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterAtFacilityNameID();
		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterRemarks();
		coroner.coronerCaseEntry.save();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyInvestNoGenerated();
		coroner.coronerCaseEntry.clickOnAllTheTabs();
  }
  
  @Test(groups = {"CoronerCaseFunctionality"})
  public void CoronerCaseEntryNamesTab_265537(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265537");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.enterAtInvestNo();
		coroner.coronerCaseSearch.clickOnSearch();
		coroner.coronerCaseSearch.verifyNameIntheGridByLatNameFistName(0);
		coroner.coronerCaseSearch.selectGridRowByName();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyAtInvestNo();
		coroner.coronerCaseEntry.verifyAtName();
		coroner.coronerCaseEntry.clickOnNamesTab();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.enterAtNameID();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.selectAtRelationship();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.clickAddNameButton();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.saveNamesTab();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.VerifyAdditionSuccessfulAcknowledge();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.clickOnNamesTab();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.SelectRowByAtRelationship();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.verifyNameInfoIconDisplayed();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.clickAddNameButton();
		coroner.coronerCaseEntry.coronerCaseEntryNamesTab.saveNamesTab();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.save();
		coroner.switchToCoronerCaseEntry();	
		coroner.coronerCaseEntry.verifyNamesTabAsBlueColour();
		
  }
  
  @Test(groups = {"CoronerCaseFunctionality"})
  public void CoronerCaseEntryReviewTab_265542(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265542");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.enterAtNameID();
		coroner.coronerCaseSearch.clickOnSearch();
		coroner.coronerCaseSearch.verifyNameIntheGridByLatNameFistName(0);
		coroner.coronerCaseSearch.selectGridRowByName();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyAtInvestNo();
		coroner.coronerCaseEntry.verifyAtName();
		coroner.coronerCaseEntry.clickOnReviewTab();
		coroner.coronerCaseEntry.coronerCaseEntryReviewTab.clickAddNewReview();
		coroner.switchToCoronerReview();
		coroner.coronerReview.verifyCurrentReviewDateAsTodaysDate();
		coroner.coronerReview.selectAtCoronerStatus();
		coroner.coronerReview.tabDateAndTime();
		coroner.coronerReview.verifyNextReviewDateAs7DaysAfterAssign();
		coroner.coronerReview.selectAtTemplate();
		coroner.coronerReview.clickOnLoad();
		coroner.coronerReview.clickSave();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyReviewTabAsBlueColour();
		coroner.coronerCaseEntry.clickOnReviewTab();
		coroner.coronerCaseEntry.coronerCaseEntryReviewTab.verifyStatusDateAsCurrentDate();
		coroner.coronerCaseEntry.coronerCaseEntryReviewTab.verifyNextReviewDateAs7DaysAfterAssign();
		coroner.coronerCaseEntry.coronerCaseEntryReviewTab.verifyAtStatusChangedTo();
  }
  
  @Test(groups = {"CoronerCaseFunctionality"})
  public void CoronerCaseEntryEffortTab_268508(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "268508");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.enterAtNameID();
		coroner.coronerCaseSearch.clickOnSearch();
		coroner.coronerCaseSearch.verifyNameIntheGridByLatNameFistName(0);
		coroner.coronerCaseSearch.selectGridRowByName();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyAtInvestNo();
		coroner.coronerCaseEntry.verifyAtName();
		coroner.coronerCaseEntry.clickOnEffortsTab();
		coroner.coronerCaseEntry.coronerCaseEntryEffortsTab.clickAddEffort();
		coroner.switchToCoronerEfforts();
		coroner.coronerEfforts.enterAtInvestigator();
		coroner.coronerEfforts.selectAtCoronerCatogory();
		coroner.coronerEfforts.selectAtCoronerActivity();
		coroner.coronerEfforts.tabStartedDateAndTime();
		coroner.coronerEfforts.selectAtTemplate();
		coroner.coronerEfforts.clickOnLoad();
		coroner.coronerEfforts.enterAtRemarksText();
		coroner.switchToCoronerEfforts();
		coroner.coronerEfforts.clickSave();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.save();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyEffortTabAsBlueColour();
		coroner.coronerCaseEntry.clickOnEffortsTab();
		coroner.coronerCaseEntry.coronerCaseEntryEffortsTab.verifyAtInvestigatorName();
		coroner.coronerCaseEntry.coronerCaseEntryEffortsTab.verifyDateFromAsCurrentDate();
		coroner.coronerCaseEntry.coronerCaseEntryEffortsTab.verifyAtActivityCode();
		coroner.coronerCaseEntry.coronerCaseEntryEffortsTab.verifyAtRemarks(1);
  }
  
  @Test(groups = {"CoronerCaseFunctionality"})
  public void CoronerCaseEntryReportsTab_265705(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265705");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.enterAtNameID();
		coroner.coronerCaseSearch.selectAtCauseOfDeath();
		coroner.coronerCaseSearch.selectAtCaseStatus();
		coroner.coronerCaseSearch.clickOnSearch();
		coroner.coronerCaseSearch.selectGridRowByName();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyAtInvestNo();
		coroner.coronerCaseEntry.clickOnReportsTab();
		coroner.coronerCaseEntry.coronerCaseEntryReportsTab.clickAddReportButton();
		coroner.switchToCoronerCaseReportsEntry();
		coroner.coronerCaseReportEntry.verifyAtCoronerInvestNo();
		coroner.coronerCaseReportEntry.verifyAtReportedOfficer();
		coroner.coronerCaseReportEntry.selectAtType();
		coroner.coronerCaseReportEntry.selectAtStatus();
		coroner.coronerCaseReportEntry.enterDescription();
		coroner.coronerCaseReportEntry.selectAtTemplate();
		coroner.coronerCaseReportEntry.clickOnLoad();
		coroner.coronerCaseReportEntry.clickSave();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.save();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyReportTabAsBlueColour();
		coroner.coronerCaseEntry.clickOnReportsTab();
		coroner.coronerCaseEntry.coronerCaseEntryReportsTab.verifyReportStatusAsOnHold(0);
		coroner.coronerCaseEntry.coronerCaseEntryReportsTab.verifyReportTypeAsCoronerReport(0);
		
  }
  
  @Test(groups = {"CoronerCaseFunctionality"})
  public void CoronerCaseEntryEvidenceTab_265707(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265707");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.enterAtNameID();
		coroner.coronerCaseSearch.selectAtCauseOfDeath();
		coroner.coronerCaseSearch.selectAtCaseStatus();
		coroner.coronerCaseSearch.clickOnSearch();
		coroner.coronerCaseSearch.selectGridRowByName();
		coroner.switchToCoronerCaseEntry();
		String investNo =coroner.coronerCaseEntry.readInvestNo();
		String dateOfDeath =coroner.coronerCaseEntry.readDateOfDeath();
		coroner.coronerCaseEntry.verifyAtInvestNo();
		coroner.coronerCaseEntry.clickOnEvidenceTab();
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.clickAddNew();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyInvestNo(investNo);
		coroner.coronerEvidenceEntry.verifyDateOfDeath(dateOfDeath);
		coroner.coronerEvidenceEntry.verifyAddnewButtonDisabled();
		coroner.coronerEvidenceEntry.selectAtReason();
		coroner.coronerEvidenceEntry.selectAtEvidenceType();
		coroner.coronerEvidenceEntry.enterDescription();
		coroner.coronerEvidenceEntry.enterQuantity();
		coroner.coronerEvidenceEntry.selectAtStorageLocation();
		coroner.coronerEvidenceEntry.selectAtEvidenceStatus();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		String EvidenceNo =coroner.coronerEvidenceEntry.readEvidenceNo();
		coroner.coronerEvidenceEntry.saveNclose();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.clickOnEvidenceTab();
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.verifyAtInvestNo(0);
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.verifyAtCaseNo(0);
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.verifyAtReason(0);
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.verifyAtEvidenceNo(EvidenceNo,0);
  }
  
  
  
   @Test(groups = {"CoronerEvidenceFunctionality"})
  public void CoronerEvidenvceEntry_265927(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265927");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Evidence Search");
		coroner.switchToCoronerEvidenceSearchScreen();
		coroner.coronerEvidenceSearch.clickAddNew();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.enterAtInvestNo();
		coroner.coronerEvidenceEntry.verifyAtDateOfDeath();
		coroner.coronerEvidenceEntry.verifyAddnewButtonDisabled();
		coroner.coronerEvidenceEntry.selectAtReason();
		coroner.coronerEvidenceEntry.selectAtEvidenceType();
		coroner.coronerEvidenceEntry.enterDescription();
		coroner.coronerEvidenceEntry.enterQuantity();
		coroner.coronerEvidenceEntry.selectAtStorageLocation();
		coroner.coronerEvidenceEntry.selectAtEvidenceStatus();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		coroner.coronerEvidenceEntry.VerifyAdditionSuccessfulMessage();
			
  }
   @Test(groups = {"CoronerEvidenceFunctionality"})
  public void CoronerEvidenvceMultipleEntry_265928(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265928");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Evidence Search");
		coroner.switchToCoronerEvidenceSearchScreen();
		coroner.coronerEvidenceSearch.clickAddNew();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.enterAtInvestNo();
		coroner.coronerEvidenceEntry.verifyAtDateOfDeath();
		coroner.coronerEvidenceEntry.verifyAddnewButtonDisabled();
		coroner.coronerEvidenceEntry.selectAtReason();
		coroner.coronerEvidenceEntry.selectAtEvidenceType();
		coroner.coronerEvidenceEntry.enterDescription();
		coroner.coronerEvidenceEntry.enterQuantity();
		coroner.coronerEvidenceEntry.selectAtStorageLocation();
		coroner.coronerEvidenceEntry.selectAtEvidenceStatus();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		coroner.coronerEvidenceEntry.VerifyAdditionSuccessfulMessage();
		String evidenceNo1 = coroner.coronerEvidenceEntry.readEvidenceNo();
		loader.navigateToScreen("Coroner Evidence Search");
		coroner.reloadCoronerEvidenceScreen();
		coroner.switchToCoronerEvidenceSearchScreen();
		coroner.coronerEvidenceSearch.enterAtInvestNo();
		coroner.coronerEvidenceSearch.clickOnSearch();
		coroner.coronerEvidenceSearch.selectGridRowByEvidenceNo(evidenceNo1);
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAtInvestNo();
		coroner.coronerEvidenceEntry.verifyAtDateOfDeath();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		int seq=	coroner.coronerEvidenceEntry.readItemNo();
		System.out.println(seq);
		coroner.coronerEvidenceEntry.clickAddnewBotton();
		coroner.coronerEvidenceEntry.verifySeqGeneratedAsNextNo(seq);
		coroner.coronerEvidenceEntry.selectReasonAsMentalIllness();
		coroner.coronerEvidenceEntry.enterQuantity();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		coroner.coronerEvidenceEntry.VerifyAdditionSuccessfulMessage();
		int seq1=	coroner.coronerEvidenceEntry.readItemNo();
		System.out.println(seq1);
		coroner.coronerEvidenceEntry.clickAddnewBotton();
		coroner.coronerEvidenceEntry.verifySeqGeneratedAsNextNo(seq1);
			
  }
  
   @Test(groups = {"CoronerEvidenceFunctionality"})
  public void CoronerEvidenvceSearch_265929(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265929");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Evidence Search");
		coroner.switchToCoronerEvidenceSearchScreen();
		coroner.coronerEvidenceSearch.enterAtInvestNo();
		coroner.coronerEvidenceSearch.selectAtReason();
		coroner.coronerEvidenceSearch.enterAtFromEvidenceNo();
		coroner.coronerEvidenceSearch.enterAtToEvidenceNo();
		coroner.coronerEvidenceSearch.clickOnSearch();
		coroner.coronerEvidenceSearch.selectGridRowByEvidenceNo();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAtInvestNo();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		coroner.coronerEvidenceEntry.verifyAtReason();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.VerifyUpdateSuccessfulMessage();
  }
  
  
   @Test(groups = {"CoronerEvidenceFunctionality"})
  public void VerifyLocationChangedateandReasonFunctionality_268677(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "268677");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.enterAtNameID();
		coroner.coronerCaseSearch.selectAtCauseOfDeath();
		coroner.coronerCaseSearch.selectAtCaseStatus();
		coroner.coronerCaseSearch.clickOnSearch();
		coroner.coronerCaseSearch.selectGridRowByName();
		coroner.switchToCoronerCaseEntry();
		String investNo =coroner.coronerCaseEntry.readInvestNo();
		coroner.coronerCaseEntry.verifyAtInvestNo();
		coroner.coronerCaseEntry.clickOnEvidenceTab();
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.clickAddNew();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyInvestNo(investNo);
		coroner.coronerEvidenceEntry.verifyAddnewButtonDisabled();
		coroner.coronerEvidenceEntry.selectAtReason();
		coroner.coronerEvidenceEntry.selectAtEvidenceType();
		coroner.coronerEvidenceEntry.enterDescription();
		coroner.coronerEvidenceEntry.verifyDefaultQuantityAs1();
		coroner.coronerEvidenceEntry.enterQuantity();
		coroner.coronerEvidenceEntry.selectAtStorageLocation();
		coroner.coronerEvidenceEntry.selectAtEvidenceStatus();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		coroner.coronerEvidenceEntry.verifyLocationChangeDateDisplayed();
		coroner.coronerEvidenceEntry.verifyLocationChangeReasonDisplayed();
		coroner.coronerEvidenceEntry.verifyViewHistoryButtonDisplayed();
		int seq=	coroner.coronerEvidenceEntry.readItemNo();
		coroner.coronerEvidenceEntry.enterChangeDateAsCurrentDate();
		coroner.coronerEvidenceEntry.verifyLocationChangeReasonAsMandatory();
		coroner.coronerEvidenceEntry.selectStorageLocationAsCoronerLocation();
		coroner.coronerEvidenceEntry.enterAtChangeReason();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifySeqNo(seq);
		coroner.coronerEvidenceEntry.VerifyUpdateSuccessfulMessage();
	
  }
  
   @Test(groups = {"CoronerEvidenceFunctionality"})
  public void VerifyLocationChangeHistoryAndClosedStatus_268680(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "268680");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Coroner");
		loader.navigateToScreen("Coroner Case Search");
		coroner.switchToCoronerCaseSearchScreen();
		coroner.coronerCaseSearch.enterAtInvestNo();
		coroner.coronerCaseSearch.clickOnSearch();
		coroner.coronerCaseSearch.verifyNameIntheGrid(0);
		coroner.coronerCaseSearch.selectGridRowByName();
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.verifyAtInvestNo();
		coroner.coronerCaseEntry.clickOnEvidenceTab();
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.verifyStatusAsOpenInvestigationByEvidenceNo();
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.selectGridRowByEvidenceNo();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.verifyAtInvestNo();
		coroner.coronerEvidenceEntry.verifyAtEvidenceNo();
		coroner.coronerEvidenceEntry.verifyAddnewButtonEnabled();
		coroner.coronerEvidenceEntry.verifyLocationChangeDateDisplayed();
		coroner.coronerEvidenceEntry.verifyLocationChangeReasonDisplayed();
		coroner.coronerEvidenceEntry.verifyViewHistoryButtonDisplayed();
		String location = coroner.coronerEvidenceEntry.readSelectedStorageLocation();
		coroner.coronerEvidenceEntry.clickViewHistoryButton();
		coroner.switchToCoronerEvidenceHistory();
		coroner.coronerEvidenceHistory.verifyLocationTo(location, 0);
		coroner.coronerEvidenceHistory.verifyAtPFName(0);
		coroner.coronerEvidenceHistory.verifyChangedReasonAsNull(0);
		coroner.coronerEvidenceHistory.closeScreen();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.enterChangeDateAsCurrentDate();
		coroner.coronerEvidenceEntry.verifyLocationChangeReasonAsMandatory();
		coroner.coronerEvidenceEntry.selectAtStorageLocation();
		coroner.coronerEvidenceEntry.enterAtChangeReason();
		coroner.coronerEvidenceEntry.selectAtEvidenceStatus();
		coroner.coronerEvidenceEntry.save();
		coroner.switchToCoronerEvidenceEntry();
		coroner.coronerEvidenceEntry.VerifyUpdateSuccessfulMessage();
		coroner.coronerEvidenceEntry.clickViewHistoryButton();
		coroner.switchToCoronerEvidenceHistory();
		coroner.coronerEvidenceHistory.verifyLocationFrom(location, 0);
		coroner.coronerEvidenceHistory.verifyAtLocationTo(0);
		coroner.coronerEvidenceHistory.verifyAtPFName(0);
		coroner.coronerEvidenceHistory.verifyAtChangedReason(0);
		coroner.switchToCoronerCaseEntry();
		coroner.coronerCaseEntry.clickOnEvidenceTab();
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.verifyAtStatusByEvidenceNo();
		coroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.verifyClosedStatusShowingAsGrayColor();
  }
  
   @Test(groups = {"CoronerCaseFunctionality"})
  public void CoronerCaseEntryFromCaseUpdate_268953(ITestContext testContext)
  {
	  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "268953");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		  loader.navigateToScreen("Case Search");
          records.switchToCaseSearch();
          records.caseSearch.enterAtCaseNo();
          records.switchToCaseUpdate();
          records.caseUpdate.clickCoronerIcon();
          coroner.switchToCoronerCaseEntry();
          coroner.coronerCaseEntry.verifyAtRMSCaseNo();
          coroner.coronerCaseEntry.enterAtLastName();
          coroner.coronerCaseEntry.enterAtFirstName();
          names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
          coroner.switchToCoronerCaseEntry();
          coroner.coronerCaseEntry.verifyAtSex();
  		coroner.coronerCaseEntry.verifyAtAge();
  		coroner.coronerCaseEntry.verifyAtAddress();
  		coroner.coronerCaseEntry.clickOnMainTab();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterAtInvestigator();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterDateAssignedAsCurrentDate();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.verifyNextReviewDateAs7DaysAfterAssign();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterAtLocationOfDeath();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectAtCauseOfDeath();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectAtLocalMortuary();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectAtSubstanceInvolved();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.selectMannerOfDeath();
  		coroner.coronerCaseEntry.coronerCaseEntryMainTab.enterRemarks();
  		coroner.coronerCaseEntry.save();
  		coroner.switchToCoronerCaseEntry();
  		coroner.coronerCaseEntry.verifyInvestNoGenerated();
  		coroner.coronerCaseEntry.clickOnAllTheTabs();
  		coroner.coronerCaseEntry.verifyPropertyTabEnabled();
		
		
  }
  
  
  @AfterMethod(groups = {"CoronerCaseFunctionality","CoronerEvidenceFunctionality"})
  public void afterMethodRecords(ITestResult testResult) 
  {
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
		coroner.Reset();
  }
  
  @AfterSuite(groups = {"CoronerCaseFunctionality","CoronerEvidenceFunctionality"})
  public void afterRunSuite()
  {
  	ExtentReport.GenerateHTML();
  	
  	}
}
