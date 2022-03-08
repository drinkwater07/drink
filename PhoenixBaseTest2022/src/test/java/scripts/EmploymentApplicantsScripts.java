package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.EmploymentApplicants;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.QA;
import application.Settings;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class EmploymentApplicantsScripts {

	public Names names;
	public Login login;
	public Loader loader;
	public Popup popup;
	public ObjectIdentification objectIdentification;
	public EmploymentApplicants employmentApplicants;
	public Settings settings;
	public QA qA;
	public Home home;

	@BeforeSuite(groups = { "2021EmploymentApplicantsApplicantEntry", "2021EmploymentApplicantsJobListing" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
	}

	@BeforeMethod(groups = { "2021EmploymentApplicantsApplicantEntry", "2021EmploymentApplicantsJobListing" })
	public void BeforeTestMethodNames(ITestContext testContext) {
		testContext.setAttribute("moduleName", "EmploymentApplicants");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		names = new Names();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		employmentApplicants = new EmploymentApplicants();
		settings = new Settings();
		qA = new QA();
		home = new Home();
	}

	@Test(groups = { "2021EmploymentApplicantsJobListing" }) // Vijay // 2021 Q3 Sprint 2
	public void createNewJobEntry_278108(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278108");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Job Listings");
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.clickAddNewButton();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickSave();
		employmentApplicants.jobEntry.verifyRequiredEntriesAreMissingAcknowledgeMessage();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.enterAtJobName();
		employmentApplicants.jobEntry.enterAtJOBNoEdit();
		employmentApplicants.jobEntry.selectAtLocationComboBox();
		employmentApplicants.jobEntry.saveScreen();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.verifyJobDescriptionTabEnabled();
		employmentApplicants.jobEntry.clickMainTab();
		employmentApplicants.jobEntry.jobEntryMainTab.selectAtJobApplicationComboBox();
		employmentApplicants.jobEntry.jobEntryMainTab.clickPreviewButton();
		qA.SwitchToQuestionDataEntry();
		qA.questionDataEntry.CloseScreen();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.saveScreen();
		employmentApplicants.switchToJobEntry();

	}

	@Test(groups = { "2021EmploymentApplicantsJobListing" }) // Vijay // 2021 Q3 Sprint 2
	public void verifyJOBEntryScreenAbleToAddTasks_278109(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278109");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Job Listings");
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.selectAtJobName();
		employmentApplicants.jobListings.selectAtLocation();
		employmentApplicants.jobListings.clickSearchButton();
		employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
		employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
		employmentApplicants.jobListings.clickAtJobNameInGrid();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.jobEntryMainTab.clickAddTaskButton();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.clickSaveButton();
		employmentApplicants.hiringTask.verifyRequiredEntriesAreMissingAcknowledgeMessage();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.selectAtTaskDescriptionComboBox();
		employmentApplicants.hiringTask.enterAtOrder();
		employmentApplicants.hiringTask.enterAtPFEdit();
		employmentApplicants.hiringTask.clickPFAddButton();
		employmentApplicants.hiringTask.verifyAtPFInGrid();
		employmentApplicants.hiringTask.save();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.closeScreen();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.saveScreen();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.jobEntryMainTab.verifyAtTaskDescriptionInGrid(0);

	}

	@Test(groups = { "2021EmploymentApplicantsJobListing" }) // Vijay // 2021 Q3 Sprint 2
	public void verifyAbleToCreateEmailTemplateAndPDFInHiringTaskScreen_278110(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278110");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Job Listings");
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.selectAtJobName();
		employmentApplicants.jobListings.selectAtLocation();
		employmentApplicants.jobListings.clickSearchButton();
		employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
		employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
		employmentApplicants.jobListings.clickAtJobNameInGrid();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickMainTab();
		employmentApplicants.jobEntry.jobEntryMainTab.clickAddTaskButton();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.clickSaveButton();
		employmentApplicants.hiringTask.verifyRequiredEntriesAreMissingAcknowledgeMessage();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.selectAtTaskDescriptionComboBox();
		employmentApplicants.hiringTask.enterAtOrder();
		employmentApplicants.hiringTask.enterAtPFEdit();
		employmentApplicants.hiringTask.clickPFAddButton();
		employmentApplicants.hiringTask.verifyAtPFInGrid();
		employmentApplicants.hiringTask.clickEmailTemplateAddNewButton();
		settings.switchToEmailTemplateEntry();
		settings.emailTemplateEntry.EnterAtTemplateName();
		settings.emailTemplateEntry.EnterSubject();
		settings.emailTemplateEntry.EnterContentInTextBox();
		settings.emailTemplateEntry.SaveNClose();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.selectAtEmailTemplateComboBox();
		employmentApplicants.hiringTask.selectPDFComboBoxAsOfficeWorkerResume();
		employmentApplicants.hiringTask.save();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.closeScreen();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickSave();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickMainTab();
		employmentApplicants.jobEntry.jobEntryMainTab.verifyAtTaskDescriptionInGrid(0);
		employmentApplicants.jobEntry.jobEntryMainTab.clickAtTaskDescriptionInGrid(0);
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.verifyAtEmailTemplateComboBox();
		employmentApplicants.hiringTask.verifyPDFComboBoxAsOfficeWorkerResume();
		employmentApplicants.hiringTask.save();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.closeScreen();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickSave();
		employmentApplicants.switchToJobEntry();
	}

	@Test(groups = { "2021EmploymentApplicantsJobListing" }) // Vijay // 2021 Q3 Sprint 2
	public void verifyJobDescriptionTabDetails_278111(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278111");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Job Listings");
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.selectAtJobName();
		employmentApplicants.jobListings.selectAtLocation();
		employmentApplicants.jobListings.clickSearchButton();
		employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
		employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
		employmentApplicants.jobListings.clickAtJobNameInGrid();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.switchToJobDescriptionTab();
		employmentApplicants.jobEntry.jobEntryJobDescriptionTab.clickAddNewButton();
		home.switchToTextMgmtScreen();
		home.textMgmt.EnterAtTextName();
		home.textMgmt.EnterRichText();
		home.textMgmt.clickTemplatesForTab();
		home.switchToTextMgmtScreen();
		home.textMgmt.SaveAndCloseScreen();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.switchToJobDescriptionTab();
		employmentApplicants.jobEntry.jobEntryJobDescriptionTab.selectAtTemplateComboBox();
		employmentApplicants.jobEntry.jobEntryJobDescriptionTab.clickLoadButton();
		employmentApplicants.jobEntry.jobEntryJobDescriptionTab.clickInternelSaveButton();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickSave();
		employmentApplicants.switchToJobEntry();
	}

	@Test(groups = { "2021EmploymentApplicantsJobListing" }) // Vijay // 2021 Q3 Sprint 2
	public void verifyInactiveJobNameFunctionality_278112(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278112");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Job Listings");
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.selectAtJobName();
		employmentApplicants.jobListings.selectAtLocation();
		employmentApplicants.jobListings.clickSearchButton();
		employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
		employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
		employmentApplicants.jobListings.clickAtJobNameInGrid();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickInactiveCheckBox();
		employmentApplicants.jobEntry.clickSaveHandleConfirmPopupIfExists();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.closeScreen();
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.verifyNorecordsFoundAcknowledgeMessage();
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.clickIncludeInactiveCheckBox();
		employmentApplicants.jobListings.clickSearchButton();
		employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
		employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
		employmentApplicants.jobListings.verifyJobNameGridCellAsGreyOut();

	}

	@Test(groups = { "2021EmploymentApplicantsApplicantEntry" }) // Automated by Stalin Q3 s2
	public void CreateNewApplicatEntry_278117(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278117");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Applicant Search");
		employmentApplicants.switchToApplicantSearch();
		employmentApplicants.applicantSearch.clickAddNewButton();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.selectAtJobID();
		employmentApplicants.applicantEntry.enterAtLastName();
		employmentApplicants.applicantEntry.enterAtFirstName();
		employmentApplicants.applicantEntry.enterAtPhoneNo();
		employmentApplicants.applicantEntry.enterAtEmail();
		employmentApplicants.applicantEntry.switchToMainTab();
		employmentApplicants.applicantEntry.applicantEntryMainTab.enterAtYOSYear();
		employmentApplicants.applicantEntry.applicantEntryMainTab.enterAtYOSMonth();
		employmentApplicants.applicantEntry.applicantEntryMainTab.enterAtDurationYear();
		employmentApplicants.applicantEntry.applicantEntryMainTab.enterAtDurationMonth();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.clickRequestToSubmitApplication();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.saveNClose();
		employmentApplicants.switchToApplicantSearch();

	}

	@Test(groups = { "2021EmploymentApplicantsApplicantEntry" }) // Automated by Stalin Q3 s2
	public void VerifyMaintabfunctionalityinNewApplicatEntry_278118(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278118");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Applicant Search");
		employmentApplicants.switchToApplicantSearch();
		employmentApplicants.applicantSearch.selectAtJobName();
		employmentApplicants.applicantSearch.enterAtApplicantNo();
		employmentApplicants.applicantSearch.clickSearchButton();
		employmentApplicants.applicantSearch.verifyAtNameInGrid();
		employmentApplicants.applicantSearch.selectAtApplicantNoInGrid();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToMainTab();
		employmentApplicants.applicantEntry.applicantEntryMainTab.selectAtForLocation();
		employmentApplicants.applicantEntry.applicantEntryMainTab.enterApplicationReceivedOnAsCurrentDate();
		employmentApplicants.applicantEntry.applicantEntryMainTab.enterAtHROwnerPF();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.save();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.verifyUpdateSuccessfulBottomMessage();
		employmentApplicants.switchToApplicantEntry();

	}

	@Test(groups = { "2021EmploymentApplicantsApplicantEntry" }) // Automated by Stalin Q3 s2
	public void VerifyTaskScheduletabfunctionalityNewApplicatEntry_278119(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278119");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Applicant Search");
		employmentApplicants.switchToApplicantSearch();
		employmentApplicants.applicantSearch.selectAtJobName();
		employmentApplicants.applicantSearch.clickSearchButton();
		employmentApplicants.applicantSearch.verifyAtNameInGrid();
		employmentApplicants.applicantSearch.selectAtApplicantNoInGrid();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToTasksNScheduleTab();
		employmentApplicants.applicantEntry.applicantEntryTasksNScheduleTab.clickAddTask();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.selectAtTaskDescriptionComboBox();
		employmentApplicants.hiringTask.enterAtOrder();
		employmentApplicants.hiringTask.enterAtPFEdit();
		employmentApplicants.hiringTask.clickPFAddButton();
		employmentApplicants.hiringTask.selectAtEmailTemplateComboBox();
		employmentApplicants.hiringTask.selectPDFComboBoxAsOfficeWorkerResume();
		employmentApplicants.hiringTask.save();
		employmentApplicants.switchToHiringTask();
		employmentApplicants.hiringTask.closeScreen();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToTasksNScheduleTab();
		employmentApplicants.applicantEntry.applicantEntryTasksNScheduleTab.verifyAtTaskDescriptionInGrid();
		employmentApplicants.switchToApplicantEntry();

	}

	@Test(groups = { "2021EmploymentApplicantsApplicantEntry" }) // Automated by Stalin Q3 s2
	public void VerifyNotesfunctionalityinNewApplicantEntry_278120(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278120");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Applicant Search");
		employmentApplicants.switchToApplicantSearch();
		employmentApplicants.applicantSearch.enterAtLastName();
		employmentApplicants.applicantSearch.enterAtFirstName();
		employmentApplicants.applicantSearch.enterAtApplicantNo();
		employmentApplicants.applicantSearch.clickSearchButton();
		employmentApplicants.applicantSearch.verifyAtNameInGrid();
		employmentApplicants.applicantSearch.selectAtApplicantNoInGrid();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToNotesTab();
		employmentApplicants.applicantEntry.applicantEntryNotesTab.clickAddNotes();
		home.switchToManageNotesScreen();
		home.manageNotes.tabDateAndTime();
		home.manageNotes.tabPF();
		home.manageNotes.clickAddNew();
		home.switchToTextMgmtScreen();
		home.textMgmt.EnterAtTextName();
		home.switchToTextMgmtScreen();
		home.textMgmt.clickTemplatesForTab();
		home.textMgmt.templatesForTab.enterAtTemplateForScreenID();
		home.textMgmt.templatesForTab.clickAddButton();
		home.textMgmt.templatesForTab.verifyAtScreenIDInGrid();
		home.switchToTextMgmtScreen();
		home.textMgmt.SaveAndCloseScreen();
		home.switchToManageNotesScreen();
		home.manageNotes.SelectAtTemplate();
		home.manageNotes.ClickLoadButton();
		home.manageNotes.verifyRichTextFieldIsFilled();
		home.switchToTextMgmtScreen();
		home.manageNotes.clickSaveAndCloseScreen();
		employmentApplicants.switchToApplicantEntry();

	}

	@Test(groups = { "2021EmploymentApplicantsApplicantEntry" }) // Automated by Stalin Q3 s2
	public void VerifyApprovalStatustabAcceptedfunctionality_278121(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278121");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Applicant Search");
		employmentApplicants.switchToApplicantSearch();
		employmentApplicants.applicantSearch.enterAtLastName();
		employmentApplicants.applicantSearch.enterAtFirstName();
		employmentApplicants.applicantSearch.enterAtApplicantNo();
		employmentApplicants.applicantSearch.clickSearchButton();
		employmentApplicants.applicantSearch.verifyAtNameInGrid();
		employmentApplicants.applicantSearch.selectAtApplicantNoInGrid();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToApprovalNStatusTab();
		employmentApplicants.applicantEntry.approvalNStatusTab.enterReviewCompletedAsCurrentDate();
		employmentApplicants.applicantEntry.approvalNStatusTab.selectAtResult();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickOfferDetails();
		home.switchToManageNotesScreen();
		home.manageNotes.Close();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToApprovalNStatusTab();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickOfferAcceptedRadioButton();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyLoginUserNameIsEnabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyPhoneExtIsEnabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyIPAddressForPCIsEnabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickDeclinedRadioButton();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyLoginUserNameIsDisabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyPhoneExtIsDisabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyIPAddressForPCIsDisabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickOfferAcceptedRadioButton();
		employmentApplicants.applicantEntry.approvalNStatusTab.enterAtLoginUserName();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.save();
		employmentApplicants.switchToApplicantEntry();

	}

	@Test(groups = { "2021EmploymentApplicantsApplicantEntry" }) // Automated by Stalin Q3 s2
	public void VerifyApprovalStatustabRejectedfunctionality_278122(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278122");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Applicant Search");
		employmentApplicants.switchToApplicantSearch();
		employmentApplicants.applicantSearch.enterAtLastName();
		employmentApplicants.applicantSearch.enterAtFirstName();
		employmentApplicants.applicantSearch.enterAtApplicantNo();
		employmentApplicants.applicantSearch.clickSearchButton();
		employmentApplicants.applicantSearch.verifyAtNameInGrid();
		employmentApplicants.applicantSearch.selectAtApplicantNoInGrid();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToApprovalNStatusTab();
		employmentApplicants.applicantEntry.approvalNStatusTab.enterReviewCompletedAsCurrentDate();
		employmentApplicants.applicantEntry.approvalNStatusTab.selectAtResult();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickOfferDetails();
		home.switchToManageNotesScreen();
		home.manageNotes.Close();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.switchToApprovalNStatusTab();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickOfferAcceptedRadioButton();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyLoginUserNameIsEnabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyPhoneExtIsEnabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyIPAddressForPCIsEnabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickDeclinedRadioButton();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyLoginUserNameIsDisabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyPhoneExtIsDisabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.verifyIPAddressForPCIsDisabled();
		employmentApplicants.applicantEntry.approvalNStatusTab.clickDeclinedRadioButton();
		employmentApplicants.applicantEntry.approvalNStatusTab.enterAcceptanceStatusDateAsCurrentDate();
		employmentApplicants.switchToApplicantEntry();
		employmentApplicants.applicantEntry.save();
		employmentApplicants.switchToApplicantEntry();

	}
	
	
	@Test // Automated by Stalin Q3 s4
	public void NoRecordsFoundshowingwhenweclickonJoblistings_281039(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281039");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Employment Applicants");
		loader.navigateToScreen("Job Listings");
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.selectAtJobName();
		employmentApplicants.jobListings.clickSearchButton();
		employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
		employmentApplicants.jobListings.selectAtLocation();
		employmentApplicants.jobListings.clickSearchButton();
		employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
		employmentApplicants.jobListings.clickAtJobNameInGrid();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.clickMainTab();
		employmentApplicants.jobEntry.jobEntryMainTab.enterPostFromDateAsCurrentDate();
		employmentApplicants.jobEntry.jobEntryMainTab.enterPostToDateAs7DaysFuture();
		employmentApplicants.switchToJobEntry();
		employmentApplicants.jobEntry.saveNCloseScreen();
		employmentApplicants.switchToJobListings();
		employmentApplicants.jobListings.enterPostFromDateAsCurrentDate();
		employmentApplicants.jobListings.verifyPostingDateColumnValueAsCurrentDate();
		employmentApplicants.switchToJobListings();
		
	}

	//Automated by KIRAN :-     Date :-11/2/2021  Quarter:-4  Sprint:-3 Module:-Employment Appicant
		@Test(groups = { "2022DefectTestCasesKIRAN" })

		public void VerifyThatJobListingsScreenSearchFunctionalityUnderEmploymentApplicantModule_281041(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "281041");///Need add click excel and verify that excel discuss mahe
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Employment Applicants");
			loader.navigateToScreen("Job Listings");
			employmentApplicants.switchToJobListings();
			employmentApplicants.jobListings.selectAtJobName();
			employmentApplicants.jobListings.clickSearchButton();
			employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
			employmentApplicants.jobListings.clickResetButton();
			employmentApplicants.jobListings.selectAtJobName();
			employmentApplicants.jobListings.selectAtLocation();
			employmentApplicants.jobListings.clickSearchButton();
			employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
			employmentApplicants.jobListings.verifyatLocation(0);
			employmentApplicants.jobListings.clickResetButton();
			employmentApplicants.jobListings.selectAtJobName();
			employmentApplicants.jobListings.selectAtLocation();
			employmentApplicants.jobListings.enterAtJobEdit();
			employmentApplicants.jobListings.clickSearchButton();
			employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
			employmentApplicants.jobListings.verifyatLocation(0);
			employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
			employmentApplicants.jobListings.clickResetButton();
			employmentApplicants.jobListings.selectAtJobName();
			employmentApplicants.jobListings.selectAtLocation();
			employmentApplicants.jobListings.enterAtJobEdit();
			employmentApplicants.jobListings.enterAtPostFromDate();
			String ReadfromDate = employmentApplicants.jobListings.readPostFromDate();
			employmentApplicants.jobListings.enterPostToDate();
			String ReadToDate = employmentApplicants.jobListings.readPostToDate();
			
			
			employmentApplicants.jobListings.clickSearchButton();
			employmentApplicants.jobListings.verifyAtJobNameInGrid(0);
			employmentApplicants.jobListings.verifyatLocation(0);
			employmentApplicants.jobListings.verifyAtJOBNoInGrid(0);
			employmentApplicants.jobListings.verifyPostFromDate(ReadfromDate);
			employmentApplicants.jobListings.verifyPostToDate(ReadToDate);
			
			employmentApplicants.jobListings.clickResetButton();
			employmentApplicants.jobListings.clickIncludeInactiveCheckBox();
			employmentApplicants.jobListings.clickSearchButton();
			employmentApplicants.jobListings.clickAtJobNameInGrid();
			employmentApplicants.switchToJobEntry();
			employmentApplicants.jobEntry.clickInactiveCheckBox();
			employmentApplicants.jobEntry.saveNCloseScreen();
			employmentApplicants.switchToJobListings();
			employmentApplicants.jobListings.verifyJobNameGridCellAsGreyOut();
			employmentApplicants.jobListings.clickAddNewButton();
			employmentApplicants.switchToJobEntry();
			employmentApplicants.jobEntry.clickSave();
			employmentApplicants.jobEntry.verifyRequiredEntriesAreMissingAcknowledgeMessage();
			employmentApplicants.switchToJobListings();

			///Need add click excel and verify that excel discuss mahe	
			//Next add to be verify the date and continue as per testcase 

			
		}

	@AfterMethod(groups = { "2021EmploymentApplicantsApplicantEntry", "2021EmploymentApplicantsJobListing" })
	public void afterMethodRecords(ITestResult testResult) {
		objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
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
	}

	@AfterSuite(groups = { "2021EmploymentApplicantsApplicantEntry", "2021EmploymentApplicantsJobListing" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}

}
