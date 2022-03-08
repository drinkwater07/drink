package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Activity;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Personnel;
import application.Popup;
import application.Popup.KPICodedLookup;
import application.Scheduling;
import application.Settings;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class PersonnelScripts {

	public Login login;
	public Loader loader;
	public Personnel personnel;
	public Popup popup;
	public Home home;
	public Names names;
	public Settings settings;
	public ObjectIdentification objectIdentification;
	public Activity activity;
	public Scheduling scheduling;

	@BeforeSuite(groups = { "2020DefectTestCases", "DefectTestCases1" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "2020DefectTestCases", "DefectTestCases1" })
	public void beforeMethodRecords(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Personnel");
		Playback.testContext = testContext;

		Playback.start();
		login = new Login();
		loader = new Loader();
		popup = new Popup();
		home = new Home();
		settings = new Settings();
		objectIdentification = new ObjectIdentification();
		activity = new Activity();
		scheduling = new Scheduling();
		personnel = new Personnel();
	}

//Reworked by:-Abi , Date :- 11/22/2021, Module:- Personnel.
	@Test(groups = { "DefectTestCases1" }, priority = 1) // Raja Sadaraj
	public void Police2019PersonnelModule_231336(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "231336");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter6600AsFalse();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.clickAddNewButton();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.enterAtPFCode();
//		personnel.personnelEntry.enterAtLastName();							// commented by Abi
//		personnel.personnelEntry.enterAtFirstName();
//		personnel.personnelEntry.clickSaveButton();
		personnel.personnelEntry.verifyPFCodeExistAcknowledgeMessage();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.close();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter6600AsTrue();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.clickAddNewButton();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.enterAtPFCode();
		personnel.personnelEntry.verifyConfirmationReusePFCodeMessage(); // Make changes in the method by Abi
		// popup.confirm.yes();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.enterAtLastName(); // Added by Abi
		personnel.personnelEntry.enterAtFirstName();
		personnel.personnelEntry.clickSaveButton();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.verifyBottomStatusMessage(); // Added by abi
		personnel.switchToPersonnelEntry();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter6600AsFalse();
	}

	// Reworked by:-Abi , Date :-11/22/2021 , Module:- Personnel.
	@Test(groups = { "2020DefectTestCases" }) // Raja Sadaraj
	public void Police2019PersonnelModule_232493(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "232493");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickAssignmentTab();
		personnel.personnelEntry.personnelEntryAssignmentTab.enterAtSupervisor();
		personnel.personnelEntry.verifyInactiveCodeAcknowledgeMessage(); // Added by Abi
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.personnelEntryAssignmentTab.clickSupervisorLookUpIcon();
		popup.switchToCodedSearchII();
		popup.kPICodedLookup.clickIncludeInactiveCheckBox();
		popup.kPICodedLookup.enterAtCode();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.selectCodeValueInGrid();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.verifyInactiveCodeAcknowledgeMessage();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.personnelEntryAssignmentTab.verifyAtSupervisorwithInActive(); // Added a method
		personnel.personnelEntry.clickRefreshIcon();
		personnel.personnelEntry.personnelEntryAssignmentTab.enterAtSupervisor1();
		personnel.personnelEntry.personnelEntryAssignmentTab.verifyAtSupervisor1(); // Added by Abi
//		personnel.personnelSearch.enterAtSupervisorPFCode();
//		personnel.personnelSearch.verifyAtSupervisorWithInActive();
//		personnel.personnelSearch.clickResetButton();
//		personnel.personnelSearch.enterAtSupervisorPFCode1();
//		personnel.personnelSearch.verifyAtSupervisor1WithActive();

	}

	@Test(groups = { "2020DefectTestCases" }) // Raja Sadaraj
	public void Police2020PersonnelModule_248769(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "248769");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickMainTab();
		personnel.personnelEntry.personnelEntryMainTab.verifyServiceYearsDisabled();
		personnel.personnelEntry.personnelEntryMainTab.verifyAdditionalYearsEnabled();
		personnel.personnelEntry.personnelEntryMainTab.enterHiredDateAsPreviousYear();
		// personnel.personnelEntry.personnelEntryMainTab.enterAtHiredDate();
		personnel.personnelEntry.personnelEntryMainTab.enterAdditionalYearsAs4();
		personnel.personnelEntry.personnelEntryMainTab.enterAdditionalMonthsAs3();
		personnel.personnelEntry.personnelEntryMainTab.enterAdditionalDateAs25();
		personnel.personnelEntry.save();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.personnelEntryMainTab.veifySearviceYearAs2();
	}

	@Test(groups = { "2020DefectTestCases" }) // Nov Sprint 3 Automated by Mahesha
	public void ToVerifyWhetherLocationDetailsShowingViewTodaylogScreenUnderActivityQuickEntryScreen_258919(
			ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258919");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtLoginUserName();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtName();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToPreferenceTab();
		personnel.personnelEntry.personnelEntryPreferencesTab.setDefaultQuickActivityModeForPoliceRMS();
		personnel.personnelEntry.saveNClose();

		activity.pressF4keyToOpenQuickActivityEntry();
		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.clickCategoryGroupOperations();
		activity.activityQuickEntry.clickCategoryPatrol();
		activity.activityQuickEntry.clickActivityLogTypeParkPatrol();
		activity.activityQuickEntry.enterAtUnit();
		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.enterAtLocation();
		activity.activityQuickEntry.verifyAddressValidated();
		activity.activityQuickEntry.enterAtNotes();
		activity.activityQuickEntry.tabAtStartDateAndTime();
		activity.activityQuickEntry.tabAtEndDateAndTime();
		activity.activityQuickEntry.save();

		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.clickViewTodaysLog();
		activity.SwitchToQuickActivityLog();
		activity.activityQuickEntry.verifyAtActivityLocationFromQuickLog(0);
	}

	@Test(groups = { "2020DefectTestCases" }) // Q4 sprint 4 Automated by Mahesha
	public void PoliceDefect2020HomeNumberDetails_259709(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "259709");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter67AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter68AsHomeNo();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFName();

		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickMainTab();
		personnel.personnelEntry.personnelEntryMainTab.selectAtPhoneNoType();
		personnel.personnelEntry.personnelEntryMainTab.enterAtPhoneNo();
		personnel.personnelEntry.personnelEntryMainTab.clickPhoneNoAddButton();
		personnel.personnelEntry.personnelEntryMainTab.verifyAtPhoneNoInGrid(0);
		personnel.personnelEntry.saveNClose();

		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");

		activity.switchToActivitySearch();
		activity.activitySearch.clickAddMultiplePFButton();
		activity.switchToActivitySearchHelpWindow();
		activity.activitySearchHelpWindow.verifyHomeNoColumnDisplayed();
		activity.activitySearchHelpWindow.verifyAtHomePhoneNo();
		activity.activitySearchHelpWindow.verifyAtPFName();
		activity.activitySearchHelpWindow.clickAtPhoneNo();

		activity.activitySearchHelpWindow.verifyPFNameAtDetailsPopup();
		activity.activitySearchHelpWindow.verifyPhoneNoAtDetailsPopup();

	}

	@Test(groups = { "2020DefectTestCases" }) // Vijay
	public void verifyAbleToDeleteTheWorkRecordEntryByDeleteOption_260160(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "260160");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.clickApprovalParameterButton();
		settings.switchToApprovalParameterWindow();
		settings.approvalParameter.selectAtApprovalProcess();
		settings.approvalParameter.setEnableApprovalProcessAsTrue();
		settings.approvalParameter.saveScreen();
		settings.switchToApprovalParameterWindow();
		settings.approvalParameter.selectAtApprovalProcess1();
		settings.approvalParameter.setEnableApprovalProcessAsTrue();
		settings.approvalParameter.saveScreen();
		settings.switchToApprovalParameterWindow();
		settings.approvalParameter.closeScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickPFInfoIcon();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToWorkRecordTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.clickWorkHistoryTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.selectRowByIndex(0);
		personnel.switchToWorkHistoryEntry();
		personnel.workHistoryEntry.verifyStatusAsApproved();
		// personnel.workHistoryEntry.verifyDeleteIconIsDisabled();
		personnel.workHistoryEntry.clickDeleteIcon();
		personnel.workHistoryEntry.verifyConfirmationDeleteMessageAsNo();
		personnel.switchToWorkHistoryEntry();
		personnel.workHistoryEntry.clickDeleteIcon();
		personnel.workHistoryEntry.verifyConfirmationDeleteMessage();// Changed
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToWorkRecordTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.clickWorkHistoryTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.verifyRowCountAsZero();
		personnel.personnelEntry.personnelEntryWorkRecordTab.clickInjuryReportTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.selectRowByIndex(0);
		personnel.switchToInjuryReportEntry();
		personnel.injuryReportEntry.verifyStatusAsApproved();
		// personnel.injuryReportEntry.verifyDeleteIconIsDisabled();
		personnel.injuryReportEntry.clickDeleteIcon();
		personnel.injuryReportEntry.verifyConfirmationDeleteMessageAsNo();
		personnel.switchToInjuryReportEntry();
		personnel.injuryReportEntry.clickDeleteIcon();
		personnel.injuryReportEntry.verifyConfirmationDeleteMessageAsYes();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToWorkRecordTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.clickInjuryReportTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.verifyRowCountAsZero();

	}

	@Test(groups = { "2020DefectTestCases" }) // Q4 sprint 5 Automated by Mahesha
	public void VerifyInactivePFNotdisplayedInSchedulingCalendarAppointments_260821(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260821");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.verifyPFValidateInfoIconDisplayed();
		personnel.personnelSearch.clickPFInfoIcon();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickInactiveCheckBox();
		personnel.personnelEntry.saveNClose();
		personnel.personnelSearch.verifyNoRecordFoundAcknowledgeMessage();
		loader.navigateToModule("Scheduling");
		loader.navigateToScreen("Calendar");
		scheduling.switchToCalendarScreen();
		scheduling.calendar.doubleClickInCalendarByCurrentDate();
		scheduling.calendar.appointmentsPopup.enterAtSubject();
		scheduling.calendar.appointmentsPopup.enterStartTime();
		scheduling.calendar.appointmentsPopup.verifyStartTimeAsCurrentDate();
		scheduling.calendar.appointmentsPopup.selectAtEventType();
		scheduling.calendar.appointmentsPopup.verifyAtInactivatedNameNotAvailableInResource();
		scheduling.calendar.appointmentsPopup.selectAtResource();
		scheduling.calendar.appointmentsPopup.save();
		scheduling.calendar.appointmentsPopup.verifyAppointmentSavedSuccessfully();
		scheduling.switchToCalendarScreen();
	}

	@Test(groups = { "2020DefectTestCases" }) // Mithun's Missed Test case // Automated By Stalin
	public void RMSgetsloggedinwithoutvalidatingparameter4338(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256106");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter4338AsNull();
		settings.switchToSystemParamter();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.logout();
		login.loginScreen.logonUsingTestContext();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	/*
	 * // Automated by Vijay // Date : 09/14/2021 // Sprint: Q3 Sprint 5
	 * 
	 * @Test (groups = {"DefectTestCases1"}) public void
	 * verifyFromPersonalEntryScreenInAccountabilityTagAndIDCardReportPrintsWithLogo_277264(
	 * ITestContext testContext) {
	 * ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].
	 * getMethodName()); testContext.setAttribute("testID", "277264");
	 * Browser.NavigateToLoginScreenForFire(); login.loginScreen.LogonForFire();
	 * loader.navigateToModule("Personnel");
	 * loader.navigateToScreen("Personnel Search");
	 * personnel.switchToPersonnelSearch(); personnel.personnelSearch.enterAtPF();
	 * personnel.personnelSearch.clickSearchButton();
	 * personnel.personnelSearch.selectRowAtPFCode();
	 * personnel.switchToPersonnelEntry();
	 * personnel.personnelEntry.clickPrintIcon(); home.switchToSelectReport();
	 * home.selectReport.clickAccountabilityTagReportInGrid();
	 * home.switchToPnxReportSSRSPDFScreen();
	 * objectIdentification.readPDF.DownloadReports();
	 * objectIdentification.readPDF.SaveAsPDFfileToLocation("277264A"); String
	 * readPDF = objectIdentification.readPDF.ReadPDF("277264A");
	 * home.switchToPnxReportSSRSPDFScreen();
	 * home.pnxReportSSRSPDFScreen.verifyContentInPDF(readPDF, "Account, Person");
	 * home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
	 * home.switchToSelectReport();
	 * home.selectReport.clickAccountabilityIDReportInGrid();
	 * home.switchToPnxReportSSRSPDFScreen();
	 * objectIdentification.readPDF.DownloadReports();
	 * objectIdentification.readPDF.SaveAsPDFfileToLocation("277264B"); String
	 * readPDF1 = objectIdentification.readPDF.ReadPDF("277264B");
	 * home.switchToPnxReportSSRSPDFScreen();
	 * home.pnxReportSSRSPDFScreen.verifyContentInPDF(readPDF1, "Account, Person");
	 * home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
	 * home.switchToSelectReport(); }
	 */
	@Test(groups = { "DefectTestCases1" }) // Automated by Stalin Q3 s2
	public void ToVerifyHiredDatefilterinPersonnelSearch_278646(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278646");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.verifyFromHiredDateIsDisplayed();
		personnel.personnelSearch.verifyToHiredDateIsDisplayed();
		personnel.personnelSearch.enterAtFromHiredDate();
		personnel.personnelSearch.enterToHiredDateAsCurrentDate();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.verifyAtPFNameInGrid();
		personnel.switchToPersonnelSearch();

	}

	// Reworked by:-Abi , Date :- 11/22/2021, Module:- Personnel .
	// Automated by Stalin Q3 s5
	@Test(groups = { "DefectTestCases1" })
	public void VerifyInventorytabshouldnotdisplayBlueScreenerror_282075(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "282075");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToInventoryTab();
		personnel.personnelEntry.personnelEntryInventoryTab.verifyAddNewButtonIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickMainTab();
		personnel.personnelEntry.personnelEntryMainTab.verifyServiceYearsDisabled();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickAssignmentTab();
		personnel.personnelEntry.personnelEntryAssignmentTab.verifyPromotionSeniorityDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToEmergencyDataTab();
		personnel.personnelEntry.personnelEntryEmergencyDataTab.verifyOrderNoFieldIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToSecurityTab();
		personnel.personnelEntry.personnelEntrySecurityTab.verifyUserNameFieldDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToTrainingTab();
		personnel.personnelEntry.personnelEntryTrainingTab.switchToSpecialSkillsTab();
		personnel.personnelEntry.personnelEntryTrainingTab.mSpecialSkillsTab.verifySkillsFieldIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToWorkRecordTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.clickWorkHistoryTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.verifyAddNewButtonIsDisplayed(); // changed
																												// by
																												// Abi
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToAttachmentTab();
		objectIdentification.attachmentsTab.verifyAddFilesButtonEnabled();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToAllowanceTab();
		personnel.personnelEntry.personnelEntryAllowanceTab.verifyAddButtonIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToTimeTab();
		personnel.personnelEntry.personnelEntryTimeTab.verifyAddButtonIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToPreferenceTab();
		personnel.personnelEntry.personnelEntryPreferencesTab.verifyDefaultJurisIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.close();
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.clickAddNewButton();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.enterAtPFCode1();
		personnel.personnelEntry.enterAtLastName();
		personnel.personnelEntry.enterAtFirstName();
		personnel.personnelEntry.save();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToInventoryTab();
		personnel.personnelEntry.personnelEntryInventoryTab.verifyAddNewButtonIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickMainTab();
		personnel.personnelEntry.personnelEntryMainTab.verifyServiceYearsDisabled();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickAssignmentTab();
		personnel.personnelEntry.personnelEntryAssignmentTab.verifyPromotionSeniorityDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToEmergencyDataTab();
		personnel.personnelEntry.personnelEntryEmergencyDataTab.verifyOrderNoFieldIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToSecurityTab();
		personnel.personnelEntry.personnelEntrySecurityTab.verifyUserNameFieldDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToTrainingTab();
		personnel.personnelEntry.personnelEntryTrainingTab.switchToSpecialSkillsTab();
		personnel.personnelEntry.personnelEntryTrainingTab.mSpecialSkillsTab.verifySkillsFieldIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToWorkRecordTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.clickWorkHistoryTab();
		personnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.verifyAddNewButtonIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToAttachmentTab();
		objectIdentification.attachmentsTab.verifyAddFilesButtonEnabled();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToAllowanceTab();
		personnel.personnelEntry.personnelEntryAllowanceTab.verifyAddButtonIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToTimeTab();
		personnel.personnelEntry.personnelEntryTimeTab.verifyAddButtonIsDisplayed();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToPreferenceTab();
		personnel.personnelEntry.personnelEntryPreferencesTab.verifyDefaultJurisIsDisplayed();
		personnel.switchToPersonnelEntry();

	}

	// Automated by:-Dinesh , Date :-22/12/2021 , Quarter:-4 , Sprint:-6 ,
	// Module:-Personnel Scripts .

	@Test(groups = { "" })
	public void UploadedImageShouldNotSeemsToShrinkingInImageFieldUnderPersonnelEntryScreen_288600(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "288600");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Entry");
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.enterAtPFCode();
		personnel.personnelEntry.enterAtLastName();
		personnel.personnelEntry.enterAtFirstName();
		personnel.personnelEntry.save(); // additionally added
		personnel.personnelEntry.clickPictureNotAvailable();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickAddNewButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.TabDateTime();
		home.updateImageScreen.clickChooseFileButtonAndSelectPNGFile();
		home.updateImageScreen.Save();
		home.updateImageScreen.switchtoUploadedImage();
		home.updateImageScreen.VerifyImageUploaded();
		home.switchToUpdateImageScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	// Automated by TesterName :- Vijay Date :- 02/09/2022 Sprint:- Sprint 3
	// Quarter:-2022 Q1 Module:- Home
	@Test(groups = { "" })
	public void verifyTheEAttachmentFunctionalityBasedOnSystemParameter299_292513(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "292513");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter299AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.switchToAttachmentTab();
		home.attachment.clickAttachmentUsingMobileDeviceButton();
		home.switchToMobileDeviceOTPScreen();
		home.mobileDeviceOTPScreen.enterAtMobileNo();
		home.mobileDeviceOTPScreen.clickSendLinkToMobileButton();
		home.mobileDeviceOTPScreen.VerifyAtAuthenticaionCodeGeneratedAs6Digit();
	}

	// Automated by TesterName :- Vijay Date :- Sprint:- Quarter:- Module:-
	@Test(groups = { "" })
	public void toVerifyEPictureFunctionalityBasedOnSystemParameter299_292510(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "292510");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter299AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickPictureNotAvailable();
		home.switchToAllImageScreen();
		home.allImagesScreen.clickMobileDeviceCameraButton();
		home.switchToMobileDeviceOTPScreen();
		home.mobileDeviceOTPScreen.enterAtMobileNo();
		home.mobileDeviceOTPScreen.clickSendLinkToMobileButton();
		home.mobileDeviceOTPScreen.VerifyAtAuthenticaionCodeGeneratedAs6Digit();

	}

	@AfterMethod(groups = { "2020DefectTestCases", "DefectTestCases1" })
	public void AfterTestMethod(ITestResult testResult) {

		try {
			ExtentReport.getResult(testResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Playback.stop();
		login.Reset();
		ExtentReport.GenerateHTML();
		loader.Reset();
		names.Reset();
		popup.Reset();
		personnel.reset();

	}

	@AfterSuite(groups = { "2020DefectTestCases", "DefectTestCases1" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}

}
