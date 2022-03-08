package scripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestResult;

import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.QA;
import application.Records;
import utilities.Browser;
import utilities.Playback;
import utilities.ObjectIdentification;
import application.AnimalControl;
import application.Home;
import application.K9;
import application.Settings;
import application.Vehicle;
import reports.ExtentReport;

public class K9Scripts {

	public K9 k9;
	public Settings settings;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Records records;
	public Home home;
	public QA qa;
	public Names names;
	public Vehicle vehicle;
	public AnimalControl animalControl;

	@BeforeSuite(groups = { "K9ReportEntryFunctionality", "K9PersonnelFunctionality",
			"K9TrainingAndActivityFunctionality", "K9ScreensFunctionality", "2021DefectTestcases" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "K9ReportEntryFunctionality", "K9PersonnelFunctionality",
			"K9TrainingAndActivityFunctionality", "K9ScreensFunctionality", "2021DefectTestcases" })
	public void beforeMethod(ITestContext testContext) {

		testContext.setAttribute("moduleName", "K9");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		k9 = new K9();
		settings = new Settings();
		records = new Records();
		home = new Home();
		qa = new QA();
		names = new Names();
		vehicle = new Vehicle();
		animalControl = new AnimalControl();

	}

	// DefectsCRM Test Methods

	@Test
	public void Police2018K9Module_199135() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("CPA Entry");
		k9.switchToCPAEntry();
		k9.cpaEntry.clickTrainingCheckBox();
		k9.cpaEntry.tabFromDateTime();
		k9.cpaEntry.enterToDateTimeAsFutureDate();
		k9.cpaEntry.selectProofing();
		k9.cpaEntry.enterAtHandler();
		k9.cpaEntry.clickPublicDemonstrationCheck();
		k9.cpaEntry.enterAtLocationOfActivity();
		k9.cpaEntry.verifyLocationActivityFontColorAsRed();
		k9.cpaEntry.enterAtReportingHandler();
		k9.cpaEntry.saveScreen();
		k9.switchToCPAEntry();
		k9.cpaEntry.verifyLocationActivityFontColorAsRed();
		k9.cpaEntry.clickLocationVerifyCheckbox();
		k9.cpaEntry.saveScreen();
		k9.switchToCPAEntry();
		k9.cpaEntry.verifyLocationActivityFontColorAsBlack();

	}

	@Test
	public void Police2019K9Module_202994() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports Search");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickAddReport();
		k9.switchToReportEntry();
		k9.reportEntry.enterAtCallNo();
		k9.reportEntry.tabDateTime();
		k9.reportEntry.enterAtHandlerK9();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.selectAtTypeOfIncident();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.close();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Access Log");
		// SettingsScripts.SettingsTestContext = K9TestContext;
		settings.switchToAcessLog();
		// settings.accessLog.enterRepositoryAs4730();
		// settings.accessLog.enterAtPFCode();
		settings.accessLog.tabTheFromDateAndTime();
		settings.accessLog.tabTheToDateAndTime();
		settings.accessLog.clickSearch();
		// settings.accessLog.verifyATPFCodeColumnValue();
		// settings.accessLog.verifyAtScreenColumnValue();
		// settings.accessLog.verifyDescriptionAtHandler(1);

	}

	@Test
	public void Police2019K9Module_205134() {
		// string reportedDate = null;
		// string reportedTime = null;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports Search");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickAddReport();
		k9.switchToReportEntry();
		k9.reportEntry.enterAtCallNo();
		k9.reportEntry.clickCallInfoIcon();
		// Records.switchToCallEntry();
		// Records.callEntry.getReportedDateTime(out reportedDate, out reportedTime);
		// Records.callEntry.closeScreen();
		k9.switchToReportEntry();
		// k9.reportEntry.verifyDateTimaAsReportedDateTime();
		k9.reportEntry.enterAtHandlerK9();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.selectTypeOfIncident();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.close();
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickBack();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.enterAtHandler();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyAtCallNoUsingHandlerK9();
		k9.k9ReportsSearch.verifyAtCaseNoUsingHandlerK9();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.verifyAtCallNo();

	}

//Q4 Sprint 4 Automated by Mahesha 

//Q4 Sprint 4 Automated by Mahesha 
	@Test(groups = "K9ReportEntryFunctionality")
	public void ToVerifyPerformanceOfReportEntryScreenFromK9Module_260155(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260155");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Call Search");
		records.switchToCallSearch();
		records.callSearch.enterAtCallNo();
		records.switchToCallEntry();
		records.callEntry.uncheckAddressValidateCheckBox();
		records.callEntry.save();
		loader.navigateToModule("K9");
		loader.navigateToScreen("Report Entry");
		k9.switchToReportEntry();
		k9.reportEntry.enterAtCallNo();
		k9.reportEntry.verifyAtAddress();

	}

	@Test(priority = 1, groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyK9ReportEntryisAbleToCreate_272393(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272393");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickAddReport();
		k9.switchToReportEntry();
		k9.reportEntry.enterAtCallNo();
		k9.reportEntry.tabDateTime();
		k9.reportEntry.selectAtK9Handler();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.selectAtTypeOfIncident();
		k9.reportEntry.clickSave();
		k9.reportEntry.verifyDoyouSaveConfirmPopup();
		// k9.reportEntry.verifyRequiredEntriesMissingAknowledge();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyAdditionSuccessfulMessage();
		k9.reportEntry.clickOnDetectionTab();
		k9.reportEntry.detectionTab.verifyDetectionTypeDefaultSelectedAsOthers();
		k9.reportEntry.detectionTab.selectAtDetectionType();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();
		k9.reportEntry.verifyReportStatusAsOnHold();

		k9.reportEntry.close();
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyAtK9HandlerInGrid(0);
		k9.k9ReportsSearch.verifyAtActivityTypeInGrid(0);
		k9.k9ReportsSearch.verifyAtCallNoInGrid(0);
		k9.k9ReportsSearch.verifyApprovalStatusAsOnHold(0);

	}

	@Test(priority = 2, groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyAccessLogaftercreatingK9report_272394(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272394");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Access Log");
		settings.switchToAcessLog();
		settings.accessLog.tabTheFromDateAndTime();
		settings.accessLog.tabTheToDateAndTime();
		settings.accessLog.enterAtPFCode();
		settings.accessLog.enterAtCallNo();
		settings.accessLog.clickSearch();
		settings.accessLog.verifyAtDescription(1);
		settings.accessLog.verifyAccessAsAdd(1);
		settings.accessLog.verifyAtScreen(1);
	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyK9reportentryAbletoopenfromMyapprovaltab_272396(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272396");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickAddReport();
		k9.switchToReportEntry();
		k9.reportEntry.enterAtCallNo();
		k9.reportEntry.tabDateTime();
		k9.reportEntry.selectAtK9Handler();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.selectAtTypeOfIncident();
		k9.reportEntry.clickOnDetectionTab();
		k9.reportEntry.detectionTab.selectAtDetectionType();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyAdditionSuccessfulMessage();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsSendForApproval();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();

		k9.switchToReportEntry();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsSubmitted();
		k9.reportEntry.close();

		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.SelectItemTypeAsK9ReportEntry();
		home.myHome.myReportsTab.ClickSearchButton();

		home.myHome.myReportsTab.selectRowByAtRefNo();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsSubmitted();

	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyK9ReportDeleteFunctionality_272397(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272397");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyApprovalStatusAsOnHold(0);
		k9.k9ReportsSearch.verifyAtCallNoInGrid(0);
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.SelectStatusAsOnHold();
		home.myHome.myReportsTab.SelectItemTypeAsK9ReportEntry();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.selectRowByAtRefNo();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickDeleteIcon();
		k9.reportEntry.verifyDoyouWantToDeleteConfirmPopup();

		objectIdentification.manualIdentify.reloadScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyNorecordFoundAcknowledge();
		k9.switchToK9ReportsSearch();
	}

	// @Test(groups = "K9ReportEntryFunctionality")//issue //14.87 2021 //Mahesha
	public void VerifyK9reportDateTimeisfetchingCallReportedDateandTimecorrectlyorcurrentDateandTime_239968(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "239968");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickAddReport();
		k9.switchToReportEntry();
		k9.reportEntry.enterAtCallNo();

	}

	// @Test(groups = "K9ReportEntryFunctionality")//issue //14.87 2021
	public void K9DetectionTabVehicalFuntionalityTab_273468(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273468");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();

	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void K9ReportEntryNamesTab_273471(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273471");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyAtCallNoInGrid(0);
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnNamesTab();
		k9.reportEntry.namesTab.clickAgencyRadioButton();
		k9.reportEntry.namesTab.enterAtPFCode();
		k9.reportEntry.namesTab.selectParticipantsActivity();
		k9.reportEntry.namesTab.enterAtNotes();
		k9.reportEntry.namesTab.clickAdd();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();
		k9.reportEntry.clickOnNamesTab();
		k9.reportEntry.namesTab.verifyNameIntheGrid(0);
		k9.reportEntry.namesTab.clickManualAidRadioButton();
		k9.reportEntry.namesTab.enterAtNameID();
		k9.reportEntry.namesTab.selectParticipantsActivity();
		k9.reportEntry.namesTab.clickAdd();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();
		k9.reportEntry.clickOnNamesTab();
		k9.reportEntry.namesTab.verifyName1IntheGrid(1);

	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void K9ReportEntryPreventiveAction_273473(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273473");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyAtCallNoInGrid(0);
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnPreventiveActionTab();
		k9.reportEntry.preventiveActionTab.selectAtTypeOfPreventiveAction();
		k9.reportEntry.preventiveActionTab.enterAtIfOther();
		k9.reportEntry.preventiveActionTab.selectWarningGiven();
		k9.reportEntry.preventiveActionTab.enterNumberGiven();
		k9.reportEntry.preventiveActionTab.selectk9Action();
		k9.reportEntry.preventiveActionTab.selectActionofSuspect();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();

	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void K9ReportEntrySearchAndTrackingTab_273474(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273474");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyAtCallNoInGrid(0);
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnSearchTab();
		k9.reportEntry.searchTab.selctWarningGiven();
		k9.reportEntry.searchTab.selectAtTypeOfSearch();
		k9.reportEntry.searchTab.enterNumberGiven();
		k9.reportEntry.searchTab.selectAtSubType();
		k9.reportEntry.searchTab.enterAtNotes();
		k9.reportEntry.searchTab.clickAdd();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();
		k9.reportEntry.clickOnSearchTab();
		k9.reportEntry.searchTab.verifyAtNotes(0);
		k9.reportEntry.searchTab.verifyAtSubType(0);
		// k9.reportEntry.searchTab.verifyAtTypeOfSearch(0);
		k9.reportEntry.clickOnTrackingTab();
		k9.reportEntry.trackingTab.clickOnTrackDataTab();
		k9.reportEntry.trackingTab.trackData.enterLengthOfTrack();
		k9.reportEntry.trackingTab.trackData.enterTrackSurfaces();
		k9.reportEntry.trackingTab.trackData.enterSurfaceCondition();
		k9.reportEntry.trackingTab.trackData.enterAgeofTrack();
		k9.reportEntry.trackingTab.trackData.enteTimeofTrack();
		k9.reportEntry.trackingTab.trackData.SelectSubjectLocated();
		k9.reportEntry.trackingTab.trackData.enterAtNotes();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();

	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void K9ReportEntryNarrativeTab_273503(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273503");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyAtCallNoInGrid(0);
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.switchToNarrativeTab();
		k9.reportEntry.narrativeTab.selectAtTempelate();
		k9.reportEntry.narrativeTab.clickLoadButton();
		k9.reportEntry.narrativeTab.internalSave();
		k9.switchToReportEntry();
		k9.reportEntry.switchToNarrativeTab();
		k9.reportEntry.narrativeTab.VerifyAdditionSuccessfulMessage();
		k9.reportEntry.narrativeTab.verifyAtText();
	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021
	public void K9ReportEntryQaFormsTab_273502(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273502");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCaseNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyAtCallNoInGrid(0);
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.switchToQAFormsTab();

		qa.questionnarie.SelectAtForm();
		qa.questionnarie.ClickFillFormButton();
		qa.SwitchToQuestionDataEntry();
		qa.questionDataEntry.TabOutPF();
		qa.questionDataEntry.clickSaveNClose();

		k9.switchToReportEntry();
		k9.reportEntry.saveScreen();
		k9.reportEntry.switchToQAFormsTab();
		qa.questionnarie.verifyFormNameInGrid(0);
	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyK9reportentryapprovalProcess_273504(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273504");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("Report Entry");
		k9.switchToReportEntry();
		k9.reportEntry.enterAtCallNo();
		k9.reportEntry.tabDateTime();
		k9.reportEntry.selectAtK9Handler();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.selectAtTypeOfIncident();
		k9.reportEntry.clickOnDetectionTab();
		k9.reportEntry.detectionTab.selectAtDetectionType();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyAdditionSuccessfulMessage();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsSendForApproval();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.switchToReportEntry();
		k9.reportEntry.close();

		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.SelectItemTypeAsK9ReportEntry();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.selectRowByAtRefNo();

		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsSubmitted();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsApprove();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsApproved();
		k9.reportEntry.verifySaveFunctionalityDisabled();

		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCallNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.verifyApprovalStatusAsApproved(0);

	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyTheK9PDFReportshouldshowinReportingtab_273601(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273601");
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
		records.walkInEntry.enterAtNameID();
		records.walkInEntry.selectAtActivity();
		records.walkInEntry.enterAtCADDispositon();
		records.walkInEntry.enterAtUnit();
		records.walkInEntry.save();
		records.switchToCaseUpdate();
		String caseNo = records.caseUpdate.readCaseNo();
		records.caseUpdate.clickk9ReportIcon();
		k9.switchToReportEntry();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.verifyAtCaseNo(caseNo);
		k9.reportEntry.selectAtK9Handler();
		k9.reportEntry.selectAtTypeOfIncident();
		k9.reportEntry.clickOnDetectionTab();
		k9.reportEntry.detectionTab.selectAtDetectionType();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyAdditionSuccessfulMessage();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsSendForApproval();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsSubmitted();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsApprove();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsApproved();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.ClickRefreshButton();
		records.caseUpdate.reportingTab.VerifyAtType();

	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyTheK9PDFReportshouldshowinReportingtab_273602(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273602");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.clickk9ReportIcon();
		k9.switchToReportEntry();
		k9.reportEntry.selectAtK9Handler();
		k9.reportEntry.selectAtTypeOfIncident();
		k9.reportEntry.clickOnDetectionTab();
		k9.reportEntry.detectionTab.selectAtDetectionType();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyAdditionSuccessfulMessage();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsSendForApproval();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsSubmitted();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsApprove();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsApproved();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.ClickRefreshButton();
		records.caseUpdate.reportingTab.VerifyReportTypeAsK9Report();

		records.caseUpdate.reportingTab.clickAddReportButton();
		records.switchToReportManager();
		records.reportManager.selectAtType();
		records.reportManager.tabReportedbyPF();
		records.reportManager.tabDateAndTime();
		records.reportManager.Saveandclose();
		records.switchToReportStatus();
		records.reportStatus.verifyLabelStatusOfSupplementalReportAsOnHold();
		records.reportStatus.clickReportDetails();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();
	}

	@Test(groups = "K9ReportEntryFunctionality") // 14.87 2021 //Mahesha
	public void VerifyTheK9PDFReportshouldshowinReportingtab_273603(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273603");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.clickAddReportButton();
		records.switchToReportManager();
		records.reportManager.selectAtType();
		records.reportManager.tabDateAndTime();
		records.reportManager.tabReportedbyPF();
		records.reportManager.Saveandclose();
		records.switchToReportStatus();
		records.reportStatus.verifyLabelStatusOfSupplementalReportAsOnHold();
		records.reportStatus.clickReportDetails();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();

		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.VerifyAtType(0);
		records.caseUpdate.reportingTab.VerifyAtType(1);
		records.caseUpdate.reportingTab.VerifyReportTypeAsK9Report(2);
		records.caseUpdate.reportingTab.ClickViewCaseFileButton();
		records.caseUpdate.reportingTab.verifyPopupReportsAsSupplimentalSubmitted(1);
		records.caseUpdate.reportingTab.verifyPopupReportsAsSupplimentalSubmitted(2);
		records.caseUpdate.reportingTab.verifyPopupReportsAsK9S(3);
	}

	@Test(groups = "K9PersonnelFunctionality") // 14.87 2021 //mahesha
	public void VerifyK9PersonnelReportEntryTab_273429(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273429");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectRowByIndexInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToK9ReportsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.clickAddNew();

		k9.switchToReportEntry();
		k9.reportEntry.verifyAtK9Handler();
		k9.reportEntry.enterAtCallNo();
		k9.reportEntry.selectAtTypeOfIncident();
		k9.reportEntry.verifyAtAddress();
		k9.reportEntry.clickOnDetectionTab();
		k9.reportEntry.detectionTab.selectAtDetectionType();
		k9.reportEntry.saveScreen();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyAdditionSuccessfulMessage();
		k9.reportEntry.verifyReportStatusAsOnHold();

		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.refreshScreen();
		k9.k9PersonnelEntry.switchToK9ReportsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.verifyAtCallNo(1);
		k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.verifyAtCaseNo(1);
		k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.verifyAtK9Handler(1);

	}

	@Test(groups = "K9PersonnelFunctionality") // 14.87 2021 //mahesha
	public void VerifyK9PersonnelCommentsTab_273431(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273431");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectRowByIndexInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToCommentsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryCommentsTab.clickAddNotes();

		home.switchToManageNotesScreen();
		home.manageNotes.tabDateAndTime();
		home.manageNotes.tabPF();
		home.manageNotes.SelectAtTemplate();
		home.manageNotes.ClickLoadButton();
		home.manageNotes.clickSaveAndCloseScreen();

		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToCommentsTab();

		k9.k9PersonnelEntry.k9PersonnelEntryCommentsTab.verifyAtOfficer();
		k9.k9PersonnelEntry.k9PersonnelEntryCommentsTab.verifyAtRemarks();

	}

	@Test(groups = "K9PersonnelFunctionality") // 14.87 2021 //Mahesha
	public void VerifyK9PersonnelCertificationTab_273432(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273432");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectRowByIndexInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToCertificationsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.selectAtCertification();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.enterCertifiedDateAsCurrentDate();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.enterExpiredDateAsFuture15days();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.enterAtComments();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.enterAtLocation();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.clickAdd();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.saveInternal();

		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.saveTheScreen();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToCertificationsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.verifyAtCertification(0);
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.verifyExpireDateAs15daysFuture(0);
		k9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.verifyAtComments(0);

	}

	@Test(groups = "K9PersonnelFunctionality") // 14.87 2021 //Mahesha
	public void VerifyK9PersonnelAwardsTab_273433(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273433");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectRowByIndexInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToAwardsTab();

		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.enterAtAward();
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.enterAtAwardingBody();
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.enterAwardeddateAsCurrentDate();
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.enterAtComments();
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.clickAdd();
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.saveInternal();

		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.saveTheScreen();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToAwardsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.verifyDateAwardedAsCurrentDate(0);
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.verifyAtAward(0);
		k9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.verifyAtComments(0);

	}

	@Test(groups = "K9PersonnelFunctionality") // 14.87 2021 //Mahesha
	public void K9PersonnelEntryQaFormsTab_274312(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "274312");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectRowByIndexInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToQAFormsTab();

		qa.questionnarie.SelectAtForm();
		qa.questionnarie.ClickFillFormButton();
		qa.SwitchToQuestionDataEntry();
		qa.questionDataEntry.TabOutPF();
		qa.questionDataEntry.clickSaveNClose();

		k9.switchToReportEntry();
		k9.reportEntry.saveScreen();
		k9.k9PersonnelEntry.switchToQAFormsTab();
		qa.questionnarie.verifyFormNameContainingInGrid(0);
	}

	@Test(priority = 1, groups = "K9TrainingAndActivityFunctionality") // Vijay // 2021 Q2 Sprint 3
	public void createNewK9Training_273506(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "273506");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickAddNewLink();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickSave();
		k9.k9TrainingEntry.verifyK9HandlerAcknowledgeMessage();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.selectAtK9Handler();
		k9.k9TrainingEntry.verifyK9HandlerInfoIconDisplayed();
		k9.k9TrainingEntry.clickK9HandlerInfoIcon();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.verifyAtK9Name();
		k9.k9PersonnelEntry.closeTheScreen();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.selectFacility();
		k9.k9TrainingEntry.selectAtInstructor();
		k9.k9TrainingEntry.tabStartDateTime();
		k9.k9TrainingEntry.tabEndDateTime();
		k9.k9TrainingEntry.VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.enterEndDateAsFutureDateByNextDate();
		k9.k9TrainingEntry.saveScreen();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.verifyAdditionSuccessfulMessageInFooterStatus();
		k9.k9TrainingEntry.verifyAllTabsEnabled();

	}

	@Test(priority = 2, groups = "K9TrainingAndActivityFunctionality") // Vijay // 2021 Q2 Sprint 4
	public void createNewK9TrainingActivity_273508(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "273508");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.selectAtK9Handler();
		k9.k9Training.clickSearchButton();
		k9.k9Training.verifyAtTrainerInGrid();
		k9.k9Training.verifyAtK9HandlerInGrid();
		k9.k9Training.clickRowByK9HandlerInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickAddNewActivity();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.verifyAtK9HandlerComboBox();
		k9.k9ActivityEntry.selectAtTrainingCategory();
		k9.k9ActivityEntry.selectAtTrainingTypeComboBox();
		k9.k9ActivityEntry.selectAtSubTypeComboBox();
		k9.k9ActivityEntry.clickDetailsTab();
		k9.k9ActivityEntry.detailsTab.tabScheduledDateTime();
		k9.k9ActivityEntry.detailsTab.tabStartDateTime();
		k9.k9ActivityEntry.detailsTab.tabEndDateTime();
		k9.k9ActivityEntry.detailsTab.VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.clickDetailsTab();
		k9.k9ActivityEntry.detailsTab.enterEndDateAsFutureDateByNextDate();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.saveScreen();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.verifyAdditionSuccessfulMessageInFooterStatus();
		k9.k9ActivityEntry.clickAllTabs();
		k9.k9ActivityEntry.closeTheScreen();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.verifyAtCategoryColumnInGrid();
		k9.k9TrainingEntry.saveScreen();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.verifyActivityTabShowsBlueColour();
		k9.k9TrainingEntry.verifyUpdateSuccessfulMessageInFooterStatus();
	}

	@Test(priority = 3, groups = "K9TrainingAndActivityFunctionality") // Vijay // 2021 Q2 Sprint 4
	public void verifyK9TrainingEntryDetailObjectivesAndCommentsTab_273509(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "273509");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.selectAtK9Handler();
		k9.k9Training.clickSearchButton();
		k9.k9Training.verifyAtK9HandlerInGrid();
		k9.k9Training.clickRowByK9HandlerInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickAddNewActivity();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.verifyAtK9HandlerComboBox();
		k9.k9ActivityEntry.selectAtTrainingCategory();
		k9.k9ActivityEntry.clickDetailsTab();
		k9.k9ActivityEntry.detailsTab.tabScheduledDateTime();
		k9.k9ActivityEntry.detailsTab.tabStartDateTime();
		k9.k9ActivityEntry.detailsTab.tabEndDateTime();
		k9.k9ActivityEntry.detailsTab.VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.clickDetailsTab();
		k9.k9ActivityEntry.detailsTab.enterEndDateAsFutureDateByNextDate();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.clickObjectivesTab();
		k9.k9ActivityEntry.objectivesTab.enterText();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.clickCommentsTab();
		k9.k9ActivityEntry.commentsTab.enterHandlerCommentsText();
		k9.k9ActivityEntry.commentsTab.enterTrainerCommentsText();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.saveNClose();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.saveScreen();
		k9.switchToK9TrainingEntry();
	}

	@Test(groups = "K9ScreensFunctionality") // Automated by Stalin Q2 S3 Run in 45 or 87
	public void VerifyabletoaddCPAEntrywithproofingandsearch_272388(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272388");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("CPA Entry");
		k9.switchToCPAEntry();
		k9.cpaEntry.selectAtHandlerOrK9();
		k9.cpaEntry.tabFromDateTime();
		k9.cpaEntry.enterToDateAsFutureDateAndClickTimeArrowButton();
		k9.cpaEntry.selectAtTypeActivity();
		k9.cpaEntry.selectAtProofing();
		k9.cpaEntry.enterAtCallNo();
		k9.cpaEntry.verifyAtLocationOfActivity();
		k9.cpaEntry.enterAtReportingPFNo();
		k9.cpaEntry.saveScreen();
		k9.switchToCPAEntry();
		k9.cpaEntry.close();
		loader.navigateToScreen("CPA");
		k9.switchToCPAScreen();
		k9.cPA.selectAtK9OrHandler();
		k9.cPA.clickSearch();
		k9.cPA.selectRowByAtLocation();
		k9.switchToCPAEntry();
		k9.cpaEntry.verifyAtProofing();
		k9.switchToCPAEntry();

	}

	@Test(groups = "K9ScreensFunctionality") // Automated by Stalin Q2 S3 Run in 45 or 87
	public void ShowsCorrectColorforUnverifiedAddressandVerifiedAddress_272390(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272390");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("CPA Entry");
		k9.switchToCPAEntry();
		k9.cpaEntry.selectAtHandlerOrK9();
		k9.cpaEntry.tabFromDateTime();
		k9.cpaEntry.enterToDateAsFutureDateAndClickTimeArrowButton();
		k9.cpaEntry.selectAtTypeActivity();
		k9.cpaEntry.enterAtLocationOfActivity();
		k9.cpaEntry.verifyLocationOfActivityFontAsRedColor();
		k9.cpaEntry.enterAtReportingPFNo();
		k9.cpaEntry.saveScreen();
		k9.switchToCPAEntry();
		k9.cpaEntry.clearLocationOfActivity();
		k9.cpaEntry.enterAtLocationOfActivity();
		k9.cpaEntry.clickLocationVerifyCheckbox();
		k9.cpaEntry.verifyLocationOfActivityInfoIconIsDisplayed();
		k9.cpaEntry.verifyLocationOfActivityFontAsBlackColor();
		k9.cpaEntry.saveScreen();
		k9.switchToCPAEntry();

	}

	@Test(groups = "K9ScreensFunctionality") // Automated by Stalin Q2 S3 Run in 45 or 87
	public void K9MedicalFunctionality_272565(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272565");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Medical");
		k9.switchToK9Medical();
		k9.k9Medical.clickAddNew();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.selectAtK9OrHandler();
		k9.medicalVisitEntry.selectAtTypeOfVisit();
		k9.medicalVisitEntry.enterAtReasonForVisit();
		k9.medicalVisitEntry.verifyDateOfVisitAsCurrentDate();
		k9.medicalVisitEntry.switchToDetailsTab();
		k9.medicalVisitEntry.detailsTab.enterAtVeterinarianLastName();
		k9.medicalVisitEntry.detailsTab.enterAtVeterinarianFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.save();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.saveNClose();
		k9.switchToK9Medical();
		k9.k9Medical.selectAtK9OrHandler();
		k9.k9Medical.selectAtTypeOfVisit();
		k9.k9Medical.clickSearch();
		k9.k9Medical.verifyAtReasonInGrid();
		k9.switchToK9Medical();

	}

	@Test(priority = 1, groups = "K9ScreensFunctionality") // Automated by Stalin Q2 S3 Run in 45 or 87
	public void K9TeamFunctionality_272587(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272587");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Team");
		k9.switchToK9TeamScreen();
		k9.k9Team.clickAddNew();
		k9.switchToK9TeamEntry();
		k9.k9TeamEntry.selectAtK9Name();
		k9.k9TeamEntry.enterAtOfficerOrHandler();
		k9.k9TeamEntry.enterEffectiveFromAsCurrentDate();
		k9.k9TeamEntry.clickAddButton();
		k9.k9TeamEntry.saveNClose();
		k9.switchToK9TeamScreen();
		k9.k9Team.selectAtK9Name();
		k9.k9Team.enterAtOfficerOrHandler();
		k9.k9Team.clickSearch();
		k9.k9Team.verifyAtK9NameInGrid();
		k9.k9Team.verifyAtHandlerInGrid();
		k9.switchToK9TeamScreen();

	}

	@Test(priority = 2, groups = "K9ScreensFunctionality") // Automated by Stalin Q2 S3 Run in 45 or 87
	public void VerifyK9TeamInactiveFunctionality_273544(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273544");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Team");
		k9.switchToK9TeamScreen();
		k9.k9Team.selectAtK9Name();
		k9.k9Team.clickSearch();
		k9.k9Team.verifyAtHandlerInGrid();
		k9.k9Team.selectRowByAtHandler();
		k9.switchToK9TeamEntry();
		k9.k9TeamEntry.verifyAtHandlerInGrid();
		k9.k9TeamEntry.selectRowByAtHandler();
		k9.k9TeamEntry.clickInactiveCheckBox();
		k9.k9TeamEntry.clickAddButton();
		k9.k9TeamEntry.saveNClose();
		k9.k9TeamEntry.verifyNoRecordsFoundAcknowledgeMessage();
		k9.switchToK9TeamScreen();
		k9.k9Team.clickInactiveCheckBox();
		k9.k9Team.clickSearch();
		k9.k9Team.verifyRowAsGrayColor(0);
		k9.switchToK9TeamScreen();

	}

	@Test(groups = "K9PersonnelFunctionality") // Automated by Stalin Q2 S3 Run in 45 or 87
	public void K9PersonnelMedicalTab_273427(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273427");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.enterAtHandler();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectRowByIndexInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToMedicalTab();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.switchToCurrentTab();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.enterAtMedications();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.enterAtDossage();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.clickMedicationsAddButton();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.verifyRowCountInMedicationsGrid();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.selectAtVaccine();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.enterIssuedDateAsCurrentDate();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.enterNextDueDateAsFutureDate();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.clickVaccineAddButton();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.verifyRowCountInVaccineGrid();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToMedicalTab();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.switchToVeterinarianVisitsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab.clickAddNew();
		k9.switchToMedicalVisitEntry();
		// k9.medicalVisitEntry.verifyAtK9OrHandler(); //not able to verify
		k9.medicalVisitEntry.verifyDateOfVisitAsCurrentDate();
		k9.medicalVisitEntry.verifyDateOfVisitIsDisabled();
		k9.medicalVisitEntry.selectAtTypeOfVisit();
		k9.medicalVisitEntry.enterAtReasonForVisit();
		k9.medicalVisitEntry.switchToDetailsTab();
		k9.medicalVisitEntry.detailsTab.enterAtVeterinarianNameID();
		k9.medicalVisitEntry.detailsTab.verifyAtLastName();
		k9.medicalVisitEntry.detailsTab.verifyAtFirstName();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.save();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.saveNClose();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToMedicalTab();
		Playback.controlReadyThreadWait();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.switchToVeterinarianVisitsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab
				.verifyAtTypeOfVisitInGrid();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab.verifyAtReasonInGrid();
		k9.switchToK9PersonnelEntry();
	}

	@Test(groups = "K9PersonnelFunctionality") // Automated by Stalin Q2 S3 Run in 45 or 87
	public void K9PersonnelentryMedicaltab2_273428(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273428");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.enterAtHandler();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectRowByIndexInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.verifyMedicalTabInBlueColor();
		k9.k9PersonnelEntry.switchToMedicalTab();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.switchToVeterinarianVisitsTab();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab
				.verifyAtTypeOfVisitInGrid();
		k9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab.verifyAtReasonInGrid();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.closeScreen();
		k9.switchToK9Personnel();
		loader.navigateToScreen("K9 Medical");
		k9.switchToK9Medical();
		k9.k9Medical.selectAtK9OrHandler();
		k9.k9Medical.clickSearch();
		k9.k9Medical.verifyAtReasonInGrid();
		k9.k9Medical.verifyAtTypeOfVisitInGrid();
		k9.switchToK9Medical();

	}

	@Test(groups = { "K9PersonnelFunctionality" })
	public void Police2021K9Module_272431(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272431");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToTrainingTab();
		k9.k9PersonnelEntry.k9PersonnelEntryTrainingTab.clickAddTraining();
		k9.switchToK9TrainingEntry();
		// k9.k9TrainingEntry.selectAtK9Handler();
		k9.k9TrainingEntry.selectFacility();
		k9.k9TrainingEntry.tabStartDateTime();
		k9.k9TrainingEntry.tabEndDateTime();
		k9.k9TrainingEntry.clickSave();
		k9.k9TrainingEntry.VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.enterEndDateAsFutureDateByNextDate();
		k9.k9TrainingEntry.saveScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "K9PersonnelFunctionality" })
	public void Police2021K9Module_272441(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272441");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();

		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToTrainingTab();
		k9.k9PersonnelEntry.k9PersonnelEntryTrainingTab.selectAtK9HandlerInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.switchToActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickAddNewActivity();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.switchToActivityEntryDetailsTab();
		k9.k9ActivityEntry.selectAtTrainingCategory();
		k9.k9ActivityEntry.detailsTab.tabStartDateTime();
		k9.k9ActivityEntry.detailsTab.tabEndDateTime();
		k9.k9ActivityEntry.clickSave();
		k9.k9ActivityEntry.VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.detailsTab.enterEndDateAsFutureDateByNextDate();
		k9.k9ActivityEntry.saveScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(priority = 4, groups = { "K9TrainingAndActivityFunctionality" })
	public void Police2021K9Module_273511(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273511");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.clickK9HandlerInGridByStartDate();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.switchToActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickFirstRow();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.clickTrainingAidsTab();
		k9.k9ActivityEntry.trainingAidsTab.clickAddAidButton();
		k9.switchToK9TrainingAid();
		k9.k9TrainingAid.clickSave();
		k9.k9TrainingAid.VerifyRequireEntryMissingAcknowledgeMessage();
		k9.switchToK9TrainingAid();
		k9.k9TrainingAid.enterAtAidNo();
		k9.k9TrainingAid.selectAtAidType();
		k9.k9TrainingAid.SaveAndCloseScreen();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.clickTrainingAidsTab();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtAidNo();

	}

	@Test(priority = 5, groups = { "K9TrainingAndActivityFunctionality" })
	public void Police2021K9Module_273513(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273513");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.selectAtK9Handler();
		k9.k9Training.clickSearchButton();
		k9.k9Training.clickK9HandlerInGridByStartDate();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.switchToActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickFirstRow();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.switchToActiviyEntryParticipantsTab();
		k9.k9ActivityEntry.participantsTab.clickAgencyRadioButton();
		k9.k9ActivityEntry.participantsTab.enterAtPF();
		k9.k9ActivityEntry.participantsTab.clickAddButton();
		k9.k9ActivityEntry.saveScreen();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.clickAllTabs();
		k9.k9ActivityEntry.saveScreen();
		k9.switchToK9TrainingEntry();

	}

	@Test(groups = { "2021DefectTestcases" }) // Mithun
	public void Police2021K9Module_275266(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275266");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.clickInactiveCheckbox();
		k9.k9PersonnelEntry.saveTheScreen();
		loader.navigateToScreen("K9 Team");
		k9.switchToK9TeamScreen();
		k9.k9Team.selectAtK9Name();
		k9.k9Team.clickInactiveCheckBox();
		k9.k9Team.clickSearch();
		k9.k9Team.selectRowByAtHandler();
		k9.switchToK9TeamEntry();
		k9.k9TeamEntry.verifyAtInactiveHandlerInGrid();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2021DefectTestcases" }) // Mithun
	public void Police2021K9Module_275267(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275267");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Team");
		k9.switchToK9TeamScreen();
		k9.k9Team.selectAtK9Name();
		k9.k9Team.clickSearch();
		k9.k9Team.selectRowByAtHandler();
		k9.switchToK9TeamEntry();
		k9.k9TeamEntry.selectRowByAtHandler();
		k9.k9TeamEntry.clickInactiveCheckBox();
		k9.k9TeamEntry.clickAddButton();
		k9.k9TeamEntry.save();
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.verifyHandlerNameAsEmpty();
		k9.k9PersonnelEntry.saveTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2021DefectTestcases" }) // Mithun
	public void Police2021K9Module_275268(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275268");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Team");
		k9.switchToK9TeamScreen();
		k9.k9Team.clickAddNew();
		k9.switchToK9TeamEntry();
		k9.k9TeamEntry.selectAtK9Name();
		k9.k9TeamEntry.enterAtOfficerOrHandler();
		k9.k9TeamEntry.clickAddButton();
		k9.k9TeamEntry.save();
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtK9Name();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.verifyAtHandlerName();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test // Mithun
	public void Police2021K9Module_275265(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275265");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("CPA");
		k9.switchToCPAScreen();
		k9.cPA.clickSearch();
		k9.cPA.selectAtK9HandlerInGrid();
		k9.switchToCPAEntry();
		k9.cpaEntry.clickTrainingCheckBox();
		k9.cpaEntry.saveScreen();
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.clickHandlerLookup();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.enterAtCode();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.selectAtCodeValueInGrid();
		k9.switchToK9Personnel();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid(0);
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToTrainingTab();
		k9.k9PersonnelEntry.k9PersonnelEntryTrainingTab.verifyAtK9Handler(0);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test // 14.87 2021 //Mithun
	public void ToverifyCPATrainingActivityDateTimepopupvalidationmessageandAddressconfigurationlabelTextisRemovedfromK9Reportentry_275955(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275955");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.enterAtCallNo();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.clickCallInfoIcon();
		records.switchToCallEntry();
		records.callEntry.clearLocation();
		records.callEntry.save();
		records.switchToCallEntry();
		records.callEntry.verifyUpdatedSuccessfulStatusMessage();
		records.callEntry.closeScreen();
		loader.navigateToScreen("CPA Entry");
		k9.cpaEntry.selectAtHandlerOrK9();
		k9.cpaEntry.tabFromDateTime();
		k9.cpaEntry.enterToDateTimeAsFutureDate();
		k9.cpaEntry.selectProofing();
		k9.cpaEntry.enterAtLocationOfActivity();
		k9.cpaEntry.verifyLocationActivityFontColorAsRed();
		k9.cpaEntry.enterAtReportingHandler();
		k9.cpaEntry.saveScreen();
		k9.switchToCPAEntry();
		k9.cpaEntry.verifyLocationActivityFontColorAsRed();
		k9.cpaEntry.clickLocationVerifyCheckbox();
		k9.cpaEntry.saveScreen();
		k9.switchToCPAEntry();
		k9.cpaEntry.verifyLocationActivityFontColorAsBlack();
		k9.cpaEntry.close();
		loader.navigateToScreen("K9 Training");
		k9.k9Training.clickSearchButton();
		k9.k9Training.clickRowByK9HandlerInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickAddNewActivity();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.selectAtTrainingCategory();
		k9.k9ActivityEntry.switchToActivityEntryDetailsTab();
		k9.k9ActivityEntry.detailsTab.tabStartDateTime();
		k9.k9ActivityEntry.detailsTab.enterEndDateAsFutureDateByNextDate();
		k9.k9ActivityEntry.saveScreen();

	}

	@Test // 14.87 2021 //Mithun
	public void VerifyK9PersonnelReportEntryTab_275954(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275954");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.selectAtJuris();
		k9.k9Personnel.clickAddNew();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.enterAtK9Name();
		k9.k9PersonnelEntry.enterAtK9EmployeeName();
		k9.k9PersonnelEntry.selectAtPrimaryFunction();
		k9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.selectAtBreed();
		k9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.selectAtSex();
		k9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.enterAtDOB();
		k9.k9PersonnelEntry.saveTheScreen();
	}

	@Test // Automated by Stalin Q3 S3
	public void ToVerifyabletoaddSameNameinParticipantstab_278662(ITestContext testContext) {
		testContext.setAttribute("testID", "278662");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.selectRowByAtTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.switchToActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickRowByCategoryInGrid();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.switchToActiviyEntryParticipantsTab();
		k9.k9ActivityEntry.participantsTab.clickPFSearchIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.enterAtCode();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.selectAtPFCode();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.switchToActiviyEntryParticipantsTab();
		k9.k9ActivityEntry.participantsTab.verifyPFIBubbleIsDisplayed();
		k9.k9ActivityEntry.participantsTab.clickAddButton();
		k9.k9ActivityEntry.participantsTab.clickMutualAidTeamMemberRadioButton();
		k9.k9ActivityEntry.participantsTab.enterAtNameID();
		k9.k9ActivityEntry.participantsTab.verifyAddressIBubbleIsDisplayed();
		k9.k9ActivityEntry.participantsTab.clickAddButton();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.saveScreen();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.switchToActiviyEntryParticipantsTab();
		k9.k9ActivityEntry.participantsTab.selectRowByAtIDNoInGrid();
		k9.k9ActivityEntry.participantsTab.clickMutualAidTeamMemberRadioButton();
		k9.k9ActivityEntry.participantsTab.enterAtNameID();
		k9.k9ActivityEntry.participantsTab.clickAddButton();
		k9.k9ActivityEntry.participantsTab.verifyDuplicationAcknowledgeMessageFor45();
		k9.switchTok9ActivityEntry();

	}

	@Test // Automated by Stalin Q3 S3
	public void ToVerifyNewlabelDOBDatefromk9personnelsearch_278661(ITestContext testContext) {
		testContext.setAttribute("testID", "278661");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.switchToPhysicalTab();
		k9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.enterAtDOB();
		k9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.enterHireDateAs4DaysFuture();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.saveTheScreen();
		k9.switchToK9PersonnelEntry();
		k9.k9PersonnelEntry.closeScreen();
		k9.switchToK9Personnel();
		k9.k9Personnel.verifyAtDOBInGrid();
		k9.k9Personnel.verifyAtDateSinceAs4DaysFutureDateInGrid();
		loader.navigateToScreen("K9 Medical");
		k9.switchToK9Medical();
		k9.k9Medical.clickSearch();
		k9.k9Medical.selectRowByAtK9OrHandlerInGrid();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.switchToDetailsTab();
		k9.medicalVisitEntry.detailsTab.enterAtVeterinarianNameID();
		k9.medicalVisitEntry.detailsTab.verifyVeterinarianIBubbleIsDisplayed();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.save();
		k9.switchToMedicalVisitEntry();

	}

	@Test // Automated by Stalin Q3 S3
	public void ToVerifyTrainingAidfromTrainingActivityEntry_278660(ITestContext testContext) {
		testContext.setAttribute("testID", "278660");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.selectRowByAtTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.switchToActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickRowByCategoryInGrid();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.switchToActiviyEntryTrainingAidsTab();
		k9.k9ActivityEntry.trainingAidsTab.clickAddAidButton();
		k9.switchToK9TrainingAid();
		k9.k9TrainingAid.enterAtAidNo();
		k9.k9TrainingAid.SaveAndCloseScreen();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.switchToActiviyEntryTrainingAidsTab();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtAidNo();
		k9.switchTok9ActivityEntry();

	}

	// Automated by KIRAN :- Date :-11/26/2021 Quarter:-4 Sprint:-4 Module:-K9
	@Test(groups = { "2022RBTestCasesKIRAN" })
	public void scriptName_TestCaseID(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "287549");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.clickRowByTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickApprovalTab();
		k9.k9TrainingEntry.switchToApprovalTab();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.selectAtNewActionComboBox();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.tabDateAndTime();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.saveScreen();
		k9.k9TrainingEntry.switchToApprovalTab();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.verifyAtHistoryInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.saveScreen();
		k9.k9TrainingEntry.verifyStatus();
		k9.k9TrainingEntry.switchToApprovalTab();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.selectAtNewActionAsApprove();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.tabDateAndTime();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.saveScreen();
		k9.k9TrainingEntry.switchToApprovalTab();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.verifyAtHistoryInGridAsApproved();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.verifySaveAsDisabled();
		;
		k9.k9TrainingEntry.verifyStatusAsApproved();

	}

	// Automated by KIRAN :- Date :-11/29/2021 Quarter:-4 Sprint:-4 Module:-K9
	@Test
	public void ToVerifyNameActivityFromK9ReportsAndK9TrainingEntry_287550(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "287550");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyAtCallNo();
		k9.reportEntry.clickOnNamesTab();
		k9.reportEntry.namesTab.clickManualAidRadioButton();
		k9.reportEntry.namesTab.enterAtNameID();
		k9.reportEntry.namesTab.clickAdd();
		k9.reportEntry.namesTab.verifyNameIntheGrid(0);
		k9.reportEntry.namesTab.verifyAtMutualAid();
		k9.reportEntry.saveScreen();

		k9.reportEntry.namesTab.clickAtNameIDInGrid();
		k9.reportEntry.namesTab.clickNameInfoIcon();
		names.switchToNameEntry();

		names.nameEntry.VerifyAtNameTypeAndID();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.VerifyActivityType();

	}

	// Automated by KIRAN :- Date :-12/13/2021 Quarter:-4 Sprint:-5 Module:-K9
	@Test
	public void K9ModuleIssues_286726(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "286726");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Personnel");
		k9.switchToK9Personnel();
		k9.k9Personnel.clickSearch();
		k9.k9Personnel.selectAtK9NameInGrid();

		k9.switchToK9PersonnelEntry();
		// k9.k9PersonnelEntry.verifyAtHandlerName();
		k9.k9PersonnelEntry.verifyimage();
		k9.k9PersonnelEntry.verifyImageHeightIsPresent();
		k9.k9PersonnelEntry.verifyImageWidthIsPresent();

		k9.k9PersonnelEntry.closeScreen();

		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickAddNewLink();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.selectAtK9Handler();
		k9.k9TrainingEntry.tabStartDateTime();
		;
		k9.k9TrainingEntry.enterEndDateAsFutureDateByNextDate();
		k9.k9TrainingEntry.tabOutEndTime();

		k9.k9TrainingEntry.saveScreen();
		k9.k9TrainingEntry.verifyImageHeightIsPresent();
		k9.k9TrainingEntry.verifyImageWidthIsPresent();

		loader.navigateToScreen("K9 Medical");
		k9.switchToK9Medical();
		k9.k9Medical.clickAddNew();
		k9.switchToMedicalVisitEntry();
		k9.medicalVisitEntry.selectAtK9OrHandler();
		k9.medicalVisitEntry.selectAtTypeOfVisit();
		k9.medicalVisitEntry.enterAtReasonForVisit();
		k9.medicalVisitEntry.save();
		k9.medicalVisitEntry.verifyImageHeightIsPresent();
		k9.medicalVisitEntry.verifyImageWidthIsPresent();

	}

//Automated by KIRAN :-     Date :- 12/13/2021 Quarter:-4  Sprint:-5  Module:-K9

	@Test
	public void K9ModuleIssues_286726A(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "286726A");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.clickOnDetectionTab();

		k9.reportEntry.detectionTab.verifyDetectionTypeIsNotMandatory();
		k9.reportEntry.detectionTab.verifyCodeIDInExplosiveDetectionType();
		k9.reportEntry.detectionTab.verifyCodeIDInFireArmsDetectionType();
		loader.navigateToScreen("K9 Trainning");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.clickRowByTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickAddNewActivity();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.verify6040UnableToLoadLocationFromCodeAck();

	}

	// Automated by TesterName :- Vijay Date :- 12/28/2021 Sprint:- Sprint 6
	// Quarter:- Q4 Module:- K9
	@Test(groups = { "" })
	public void ToVerifyTrainingAidsParticipantsTabFromK9ActivityEntryAndNamesTabFromReportEntry_289954(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "289954");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.clickRowByTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.verifyStatus();
		k9.k9TrainingEntry.switchToActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickAddNewActivity();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.selectAtTrainingCategory();
		k9.k9ActivityEntry.switchToActivityEntryDetailsTab();
		k9.k9ActivityEntry.detailsTab.tabStartDateTime();
		k9.k9ActivityEntry.switchToActiviyEntryParticipantsTab();
		k9.k9ActivityEntry.participantsTab.enterAtPF();
		k9.k9ActivityEntry.participantsTab.clickMutualAidTeamMemberRadioButton();
		k9.k9ActivityEntry.participantsTab.enterAtNameID();

		// k9.k9ActivityEntry.participantsTab.selectAtParticipantsActivity();//extra
		// line

		k9.k9ActivityEntry.participantsTab.clickAddButton();
		k9.k9ActivityEntry.participantsTab.verifyNameIDInGrid();
		k9.k9ActivityEntry.participantsTab.verifyMutualAidInGrid();
		k9.k9ActivityEntry.participantsTab.selectRowByAtNameInGrid(); // need to be unHide
		k9.k9ActivityEntry.participantsTab.selectAtParticipantsActivity();
		k9.k9ActivityEntry.participantsTab.clickAddButton();

		k9.k9ActivityEntry.participantsTab.verifyActivityInGrid();
		k9.switchTok9ActivityEntry();
		k9.k9ActivityEntry.closeTheScreen();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.closeTheScreen();
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnNamesTab();
		k9.reportEntry.namesTab.verifyNameIntheGrid(0);
		k9.reportEntry.namesTab.clickAtNameIDInGrid();
		k9.reportEntry.namesTab.verifyAtPFCode();
		k9.reportEntry.namesTab.clickMutualAidTeamMembverRadioButton();
		k9.reportEntry.namesTab.enterAtNameID();
		k9.reportEntry.namesTab.selectAtParticipantsActivity();
		k9.reportEntry.namesTab.clickAdd();
		k9.reportEntry.namesTab.verifyAtMutualAid();
		k9.reportEntry.namesTab.verifyAtNameIDInGrid();
		k9.reportEntry.namesTab.verifyAtParticipantsActivity();

	}
	//Automated by:- Dinesh , Date :- 09/12/2021 , Quarter:-4 , Sprint:-5 , Module:- k9 .

		@Test(groups = { "2022DefectTestcaseK9" },priority=1)
		public void ToVerifyInactivePFLogicForK9Module_282070A(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "282070A");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
//			Scenario 1: K9 & Handler is Inactive from K9 Personnel Entry
			loader.navigateToModule("K9");
			loader.navigateToScreen("K9 Reports");
			k9.switchToK9ReportsSearch();
			k9.k9ReportsSearch.clickAddReport();
			k9.switchToReportEntry();
			List<String> count = k9.reportEntry.getK9HandlerDropdownOptions();
			System.out.println(count);
			k9.reportEntry.close();
			k9.switchToK9ReportsSearch();
			loader.navigateToScreen("K9 Personnel");
			k9.switchToK9Personnel(); 
	        k9.k9Personnel.clickSearch();
	        k9.k9Personnel.selectAtK9NameInGrid(); 
	        k9.switchToK9PersonnelEntry();
	        k9.k9PersonnelEntry.clickInactiveCheckbox();
	        k9.k9PersonnelEntry.saveAndCloseTheScreen();
			loader.navigateToScreen("K9 Reports");
			k9.switchToK9ReportsSearch();
			k9.k9ReportsSearch.clickAddReport();
			k9.switchToReportEntry();
			List<String> count1 = k9.reportEntry.getK9HandlerDropdownOptions();
			System.out.println(count1);
			k9.reportEntry.verifyTheCountsofDropDown(count, count1);
			k9.reportEntry.close();
			loader.navigateToModule("K9");
			loader.navigateToScreen("K9 Reports");
			k9.switchToK9ReportsSearch();
			k9.k9ReportsSearch.enterAtCaseNo();
			k9.k9ReportsSearch.clickSearch();
			k9.k9ReportsSearch.selectAtCaseNoInGrid();
			k9.switchToReportEntry();
			k9.reportEntry.verifyK9HandlerInactive();
			k9.reportEntry.close();
			k9.switchToK9ReportsSearch();
			k9.k9ReportsSearch.verifyK9HandlerInactive();
			objectIdentification.windowHandle.switchToMainWindow();
		}
		
		//Automated by:- Dinesh , Date :- 10/12/2021 , Quarter:-4 , Sprint:-5 , Module:- k9 .

		@Test(groups = { "2022DefectTestcaseK9" },priority=2)
		public void ToVerifyInactivePFLogicForK9Module_282070B(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "282070B");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("K9");
			loader.navigateToScreen("K9 Medical");
			k9.switchToK9Medical();
			k9.k9Medical.clickAddNew();
			k9.switchToMedicalVisitEntry();
			List<String> count = k9.medicalVisitEntry.getK9HandlerDropdownOptions();
			System.out.println(count);
			k9.medicalVisitEntry.close();
			loader.navigateToScreen("K9 Team");
			k9.switchToK9TeamScreen();
			k9.k9Team.clickSearch();
            k9.k9Team.selectRowByAtHandler();
            k9.switchToK9TeamEntry();
            k9.k9TeamEntry.selectRowByAtHandler();
            k9.switchToK9TeamEntry();
            k9.k9TeamEntry.clickInactiveCheckBox();
            k9.k9TeamEntry.ClickUpdateButton();
            k9.k9TeamEntry.saveNClose();
            loader.navigateToScreen("K9 Medical");
            k9.switchToK9Medical();
			k9.k9Medical.clickAddNew();
			k9.switchToMedicalVisitEntry();
			List<String> count1 = k9.medicalVisitEntry.getK9HandlerDropdownOptions();
			System.out.println(count1);
			k9.medicalVisitEntry.verifyTheCountsofDropDown(count, count1);
			k9.medicalVisitEntry.close();
			k9.switchToK9Medical();
			k9.k9Medical.clickSearch();
			k9.k9Medical.selectRowByAtK9OrHandlerInGrid();
            k9.switchToMedicalVisitEntry();
            k9.medicalVisitEntry.verifyK9HandlerInactive();
            k9.medicalVisitEntry.close();
            k9.switchToK9Medical();
            k9.k9Medical.verifyK9HandlerInactive();
			objectIdentification.windowHandle.switchToMainWindow();
           
		}
		
		//Automated by:- Dinesh , Date :- 10/12/2021 , Quarter:-4 , Sprint:-5 , Module:- k9 .

		@Test(groups = { "2022DefectTestcaseK9" },priority=3)
		public void ToVerifyInactivePFLogicForK9Module_282070C(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "282070C");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("K9");
			loader.navigateToScreen("K9 Personnel");
			k9.switchToK9Personnel();
			k9.k9Personnel.clickInactiveCheckBox();
			k9.k9Personnel.clickSearch();	
			k9.k9Personnel.selectAtK9NameInGrid();
			k9.switchToK9PersonnelEntry();
			k9.k9PersonnelEntry.verifyHandlerNameAsEmpty();
			k9.k9PersonnelEntry.saveAndCloseTheScreen();
			k9.switchToK9Personnel();
			loader.navigateToScreen("K9 Medical");
			k9.switchToK9Medical();
            k9.k9Medical.clickSearch();
            k9.k9Medical.selectRowByAtK9OrHandlerInGrid();
            k9.switchToMedicalVisitEntry();
            k9.medicalVisitEntry.verifyK9HandlerInactive();
            k9.medicalVisitEntry.saveNClose();
            k9.switchToK9Medical();
            k9.k9Medical.clickAddNew();
            k9.switchToMedicalVisitEntry();
            k9.medicalVisitEntry.verifyAtK9HandlerValueNotFound();
            k9.medicalVisitEntry.close();
            k9.switchToK9Medical();
            k9.k9Medical.verifyK9HandlerInactive();
            objectIdentification.windowHandle.switchToMainWindow();
            
		}
		
		//Automated by:-Dinesh , Date :-21/12/2021 , Quarter:-4 , Sprint:-6 , Module:-k9 .

		@Test(groups = { "2022DefectTestcaseK9" })
		public void ToVerifyWhetherSortOrderFunctionalityIsWorkingFromReportsTabOfTheK9PersonnelEntryScreen_288588(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "288588");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("K9");
			loader.navigateToScreen("K9 Personnel");
			k9.switchToK9Personnel();
			k9.k9Personnel.selectAtK9Name();
			k9.k9Personnel.clickSearch();
			k9.k9Personnel.selectAtK9NameInGrid();
			k9.switchToK9PersonnelEntry();
			k9.k9PersonnelEntry.switchToK9ReportsTab();
			List<String> BeforeSort = k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.GetDateListInGrid();
			k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.ClickDateHeaderInGrid();
			List<String> AfterSort = k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.GetDateListInGrid();
			k9.k9PersonnelEntry.k9PersonnelEntryReportsTab.verifySortOrder(BeforeSort,AfterSort);
			objectIdentification.windowHandle.switchToMainWindow();

		}
		
		//Automated by:-Dinesh , Date :-27/12/2021 , Quarter:-4 , Sprint:-6 , Module:-K9 .

		@Test(groups = { "" })
		public void ToVerifyVehicleFieldInTrainingAidTabFromTrainingActivityEntry_289935(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "289935");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("K9");
			loader.navigateToScreen("K9 Training");
			k9.switchToK9TrainingScreen();
			k9.k9Training.clickSearchButton();
			k9.k9Training.selectRowByAtTrainingNoInGrid();
			k9.switchToK9TrainingEntry();
			k9.k9TrainingEntry.switchToActivityTab();
			k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickRowByCategoryInGrid();
			k9.switchTok9ActivityEntry();
			k9.k9ActivityEntry.switchToActiviyEntryTrainingAidsTab();
			k9.k9ActivityEntry.trainingAidsTab.clickRowByAtAidTypeInGrid();
			k9.switchToK9TrainingAid();
			k9.k9TrainingAid.clickVehicleInfoIcon();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.enterAtYear();
			vehicle.vehicleBoatEntry.saveScreen();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.verifyUpdateSuccessfulMessage();
			vehicle.vehicleBoatEntry.clickSelectButton();
			k9.switchToK9TrainingAid();
			k9.k9TrainingAid.clickSave();
			k9.k9TrainingAid.verifyUpdateSuccessfulMessage();
			objectIdentification.windowHandle.switchToMainWindow();
		}
		//Automated by TesterName :- Mani Date :-12/28/2021 Sprint:-6 Quarter:-4 Module:-k9
		@Test(groups = { "2022DefectTestcaseK9" })
		public void ToVerifyMaximumTextValueInDescribeAreaFieldFromReportsTrainingActivityAndSortOrderListLabelFromTrainingActivityEntry_289941(
				ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "289941");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("K9");
			loader.navigateToScreen("K9 Training");
			k9.switchToK9TrainingScreen();
			k9.k9Training.clickSearchButton();
			k9.k9Training.clickRowByTrainingNoInGrid();
			k9.switchToK9TrainingEntry();
			k9.k9TrainingEntry.clickActivityTab();
			k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickFirstRow();
			k9.switchTok9ActivityEntry();
			k9.k9ActivityEntry.clickDetailsTab();
			k9.k9ActivityEntry.detailsTab.EnterTextInDescribeArea();
			k9.k9ActivityEntry.saveScreen();
			k9.switchTok9ActivityEntry();
			k9.k9ActivityEntry.verifyAdditionSuccessfulMessageInFooterStatus();
			k9.k9ActivityEntry.closeTheScreen();
			loader.navigateToScreen("K9 Reports");
			k9.switchToK9ReportsSearch();
			k9.k9ReportsSearch.enterAtCaseNo();
			k9.k9ReportsSearch.clickSearch();
			k9.k9ReportsSearch.selectAtCaseNoInGrid();
			k9.switchToReportEntry();
			k9.reportEntry.EnterTextInDescribeArea();
			k9.switchToReportEntry();
			k9.reportEntry.saveScreen();
			k9.switchToReportEntry();
			k9.reportEntry.VerifyUpdateSuccessfulMessage();
			k9.reportEntry.close();
			loader.navigateToScreen("K9 Personnel");
			k9.switchToK9Personnel();
			k9.k9Personnel.clickSearch();
			k9.k9Personnel.selectAtK9NameInGrid();
			k9.switchToK9PersonnelEntry();
			k9.k9PersonnelEntry.switchToTrainingTab();
			k9.k9PersonnelEntry.k9PersonnelEntryTrainingTab.selectAtK9HandlerInGrid();
			k9.switchToK9TrainingEntry();
		
		}
		
		//Automated by:- Abinaya , Date :-12/23/2021 , Quarter:-Q4 , Sprint:-6 , Module:-K9 .
		 
		@Test(groups = { "2022DefectTestcaseK9" })
		public void ToVerifyWhetherHttpAndHttpsFormatIsSupportingOrNotInK9ReportAndK9TrainingRecord_288585(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "288585");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter36AsHttps();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyReportStatusAsOnHold();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsSendForApproval();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.reportEntry.verifyReportStatusAsSubmitted();
		k9.reportEntry.saveScreen();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();
		k9.reportEntry.clickOnApprovalTab();
		k9.reportEntry.approvalTab.selectActionAsApprove();
		k9.reportEntry.approvalTab.TabDateTime();
		k9.reportEntry.approvalTab.SaveInternalTab();
		k9.reportEntry.verifyReportStatusAsApproved();
		k9.reportEntry.verifyStatusBarMessageAsEmpty();
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.selectRowByAtTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickApprovalTab();
		k9.k9TrainingEntry.switchToApprovalTab();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.selectActionAsSendForApproval();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.tabDateAndTime();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.saveScreen();
		k9.k9TrainingEntry.verifyStatusAsSubmitted();
		k9.k9TrainingEntry.saveScreen();
		k9.k9TrainingEntry.verifyUpdateSuccessfulMessageInFooterStatus();
		k9.k9TrainingEntry.clickApprovalTab();
		k9.k9TrainingEntry.switchToApprovalTab();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.selectAtNewActionAsApprove();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.tabDateAndTime();
		k9.k9TrainingEntry.k9TrainingEntryApprovalTab.saveScreen();
		k9.k9TrainingEntry.verifyStatusBarMessageAsEmpty();
		 
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter36AsHttp();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.verifyStatusBarMessageAsEmpty();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.selectRowByAtTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.verifyStatusBarMessageAsEmpty();
		 
		}
		 
		//Automated by:- Abinaya , Date :- 12/27/2021 , Quarter:- Q4 , Sprint:- 6  , Module:- K9.
		 
		@Test(groups = { "K9Enhancement" })
		public void ToVerifyNarrativeTextFromReportEntry_289931(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "289931");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.switchToNarrativeTab();
		k9.reportEntry.narrativeTab.selectAtTempelate();
		k9.reportEntry.narrativeTab.clickLoadButton();
		k9.reportEntry.narrativeTab.enterAtText();
		k9.switchToReportEntry();
		k9.reportEntry.clickSave();
		k9.reportEntry.verify1051UpdatedDataExistsAcknowledge();
		k9.switchToReportEntry();
		k9.reportEntry.switchToNarrativeTab();
		k9.reportEntry.narrativeTab.internalSave();
		k9.switchToReportEntry();
		k9.reportEntry.VerifyUpdateSuccessfulMessage();
		k9.reportEntry.saveScreen();
		k9.reportEntry.switchToNarrativeTab();
		k9.reportEntry.narrativeTab.verifyAtText();
		 
		}
		 
		//Automated by:- Abinaya , Date :- 12/27/2021 , Quarter:- Q4 , Sprint:- 6  , Module:- K9.
		 
		@Test(groups = { "K9Enhancement" })
		public void ToVerifyTimePeriodValidationFromTrainingAidsFromTrainingEntryScreen_289932(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "289932");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Training");
		k9.switchToK9TrainingScreen();
		k9.k9Training.clickSearchButton();
		k9.k9Training.selectRowByAtTrainingNoInGrid();
		k9.switchToK9TrainingEntry();
		k9.k9TrainingEntry.clickActivityTab();
		k9.k9TrainingEntry.switchToActivityTab();
		k9.k9TrainingEntry.k9TrainingEntryActivityTab.clickFirstRow();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.clickTrainingAidsTab();
		k9.k9ActivityEntry.trainingAidsTab.clickAddAidButton();
		k9.switchToK9TrainingAid();
		k9.k9TrainingAid.verifyK9Handler();
		k9.k9TrainingAid.enterAtAidNo();
		k9.k9TrainingAid.selectAtSearch();
		k9.k9TrainingAid.enterAtBurried();
		k9.k9TrainingAid.enterAtElevation();
		k9.k9TrainingAid.selectAtResult();
		k9.k9TrainingAid.enterAtPlant();
		k9.k9TrainingAid.enterAtStart();
		k9.k9TrainingAid.enterAtFound();
		k9.k9TrainingAid.SaveScreen();
		k9.k9TrainingAid.verifyAdditionSuccessfulMsginFooterStatus();
		k9.switchToK9ActivityEntry();
		k9.k9ActivityEntry.clickTrainingAidsTab();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtAidNo();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtSearch();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtBurried();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtElevation();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtPlant();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtStart();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtFound();
		k9.k9ActivityEntry.trainingAidsTab.verifyAtResult();
		}

// Automated by:- Abinaya, Date :-02/10/2022 , Quarter:-1 , Sprint:-3 , Module:-Records .

	@Test(groups = { "" })
	public void VerifyK9OfficerCredentialsDisplayInIncidentReportIsProperOrNot_292638(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "292638");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("K9");
		loader.navigateToScreen("K9 Reports");
		k9.switchToK9ReportsSearch();
		k9.k9ReportsSearch.clickSearch();
		k9.k9ReportsSearch.selectAtCaseNoInGrid();
		k9.switchToReportEntry();
		k9.reportEntry.clickOnAttachmentTab();
		home.attachment.selectFileInTheGrid();
		home.switchToAttachmentScreen();
		records.reportStatus.downloadReport();
		records.reportStatus.saveTheReportToLocation("292638");
		String summary = records.reportStatus.readPDFContent("292638");
		records.reportStatus.verifySummaryInPDFReport(summary);
	}
	//Automated by KIRAN :-     Date :-2/7/2022  Quarter:-1  Sprint:-3  Module:-K9
@Test
public void ToVerifyMobileDeviceCameraFomK9PersonnelAndAnimalNameEntry_292617(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "292617");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("K9");
	loader.navigateToScreen("K9 Personnel");
	k9.switchToK9Personnel();
	k9.k9Personnel.clickSearch();
	k9.k9Personnel.selectAtK9NameInGrid();
	k9.switchToK9PersonnelEntry();
	k9.k9PersonnelEntry.verifyAtK9Name();
	k9.k9PersonnelEntry.saveTheScreen();
	k9.k9PersonnelEntry.verifyUpdateSucessFullMessage();
	k9.k9PersonnelEntry.ClickAtImage();
	home.switchToAllImageScreen();
	home.allImagesScreen.clickMobileDeviceCameraButton();
	home.switchToMobileDeviceOTPScreen();
	home.mobileDeviceOTPScreen.VerifyAtMobileNumber();
	home.mobileDeviceOTPScreen.clickSendLinkToMobileButton();
	Playback.threadWait();
	home.mobileDeviceOTPScreen.VerifyAtAuthenticaionCodeGeneratedAs6Digit();
	home.mobileDeviceOTPScreen.closeMobileDeviceOTPScreen();
	home.switchToAllImageScreen();
	home.allImagesScreen.Close();
	k9.switchToK9PersonnelEntry();
	k9.k9PersonnelEntry.refreshScreen();
	k9.k9PersonnelEntry.verifyAtK9Name();
	k9.k9PersonnelEntry.saveTheScreen();
	k9.k9PersonnelEntry.verifyUpdateSucessFullMessage();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Name Search");
	animalControl.switchToAnimalNameSearchScreen();
	animalControl.animalNameSearch.clickSearch();
	animalControl.animalNameSearch.clickGridRowByAnimalNameID();
	animalControl.switchToAnimalNameEntry();
	String NameID = animalControl.animalNameEntry.readAnimalNameID();
	animalControl.animalNameEntry.verifyAtNameID(NameID);
	animalControl.animalNameEntry.saveScreen();
	animalControl.animalNameEntry.VerifyUpdateSuccessfulMessage();
	
	animalControl.animalNameEntry.clickAtImage();
	home.switchToAllImageScreen();
	home.allImagesScreen.clickMobileDeviceCameraButton();
	home.switchToMobileDeviceOTPScreen();
	home.mobileDeviceOTPScreen.VerifyAtMobileNumber();
	home.mobileDeviceOTPScreen.clickSendLinkToMobileButton();
	home.mobileDeviceOTPScreen.VerifyAtAuthenticaionCodeGeneratedAs6Digit();
	home.mobileDeviceOTPScreen.closeMobileDeviceOTPScreen();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickRefreshButton();
	animalControl.animalNameEntry.verifyAtNameID(NameID);
	animalControl.animalNameEntry.saveScreen();
	animalControl.animalNameEntry.VerifyUpdateSuccessfulMessage();
		
}

//Automated by KIRAN :-     Date :-2/9/2022  Quarter:-1  Sprint:-3  Module:-k9
@Test
 public void ToVerifyk9NameAndK9_HandlerDataForDefaultAndMulti_Juris_292620(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "292620");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("K9");
	loader.navigateToScreen("K9 Personnel");
	k9.switchToK9Personnel();
	k9.k9Personnel.clickSearch();
	k9.k9Personnel.verifyTheK9NameValuesAsSelectedJuris();
	k9.k9Personnel.selectAtJurisAsBC();
	
	k9.k9Personnel.clickSearch();
	k9.k9Personnel.verifyTheSelectedJuris();
	
	k9.k9Personnel.verifyTheK9NameValuesAsSelectedJuris();
	k9.k9Personnel.selectAtJurisAsNull();
	
	k9.k9Personnel.clickSearch();
	k9.k9Personnel.verifyTheJurisInGridAsSelectedJurisAsNull();
	k9.k9Personnel.verifyTheK9NameValuesAsSelectedJuris();
	
	
}

	@AfterMethod(groups = {"K9ReportEntryFunctionality" ,
	  "K9PersonnelFunctionality", "K9TrainingAndActivityFunctionality",
	  "K9ScreensFunctionality", "2021DefectTestcases"}) 
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

	@AfterSuite(groups = { "K9ReportEntryFunctionality", "K9PersonnelFunctionality",
			"K9TrainingAndActivityFunctionality", "K9ScreensFunctionality", "2021DefectTestcases" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();

	}

}