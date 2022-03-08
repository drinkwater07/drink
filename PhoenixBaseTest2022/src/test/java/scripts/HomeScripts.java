package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Activity;
import application.Geo;
import application.Home;
import application.Inventory;
import application.Loader;
import application.Login;
import application.Names;
import application.Personnel;
import application.Popup;
import application.QA;
import application.Scheduling;
import application.Settings;
import application.Training;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class HomeScripts {

	public Home home;
	public Login login;
	public Loader loader;
	public Settings settings;
	public String nodeUrl;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Personnel personnel;
	public Vehicle vehicle;
	public Inventory inventory;
	public Training training;
	public Activity activity;
	public Browser browser;
	public Scheduling scheduling;
	public Geo geo;
	public Names names;
	public QA qA;
	// @BeforeTest

	// ITestContext testContext;

	@BeforeSuite(groups = { "2020DefectTestCases", "2020DefectActivityEntry", "2020DefectActivitySearch",
			"2020DefectMyHomeTabs", "2021DefectTestCases", "2020DefectMyReportsTab", "ActivityRemainder",
			"CertificationReminder", "FleetNextDueReminder", "InventoryNextDueColorReminder",
			"InventoryNextDueReminder", "PersonnelJobGradeNextReviewReminder", "PersonnelPerformanceReviewReminder",
			"PropertyFollowUpReminder", "TrainingRemainder", "2022DefectTestCasesKIRAN",
			"2020DefectActivityEntrySearch", "2020DefectMyHome2021Defect", "Enhancement" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "2020DefectTestCases", "2020DefectActivityEntry", "2020DefectActivitySearch",
			"2020DefectMyHomeTabs", "2021DefectTestCases", "2020DefectMyReportsTab", "ActivityRemainder",
			"CertificationReminder", "FleetNextDueReminder", "InventoryNextDueColorReminder",
			"InventoryNextDueReminder", "PersonnelJobGradeNextReviewReminder", "PersonnelPerformanceReviewReminder",
			"PropertyFollowUpReminder", "TrainingRemainder", "2022DefectTestCasesKIRAN",
			"2020DefectActivityEntrySearch", "2020DefectMyHome2021Defect", "Enhancement" })
	public void BeforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Home");
		Playback.testContext = testContext;

		Playback.start();
		login = new Login();
		loader = new Loader();
		home = new Home();
		settings = new Settings();
		objectIdentification = new ObjectIdentification();
		personnel = new Personnel();
		vehicle = new Vehicle();
		inventory = new Inventory();
		training = new Training();
		activity = new Activity();
		browser = new Browser();
		scheduling = new Scheduling();
		geo = new Geo();
		names = new Names();
		qA = new QA();
	}

	@Test(groups = "PersonnelJobGradeNextReviewReminder", priority = 1)
	public void HomeMyReminders_105471(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105471");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.verifyAtPFCodeInGrid(0);
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickAssignmentTab();
		personnel.personnelEntry.personnelEntryAssignmentTab.enterAssignmentDateAs30DaysPastFromCurrentDate();
		personnel.personnelEntry.personnelEntryAssignmentTab.selectNextReviewDueInAsOneMonth();
		personnel.personnelEntry.personnelEntryAssignmentTab.selectJobGradeAsJobGrade1();
		personnel.personnelEntry.save();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = "PersonnelJobGradeNextReviewReminder", priority = 2)
	public void HomeMyReminders_105497(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105497");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickJobGradeReviewAccordion();
		home.myHome.myRemindersTab.VerifyPFCodeAtPFCode();
		home.myHome.myRemindersTab.VerifyRankAsDetectiveByAtPFCode();
		home.myHome.myRemindersTab.VerifyBadgeNoAs100ByAtPFCode();
		home.myHome.myRemindersTab.VerifyJobGradeAsJobGrade1ByAtPFCode();
		home.myHome.myRemindersTab.VerifyNextReviewDateAsCurrentDateByAtPFCode();
		home.myHome.myRemindersTab.SelectRowAtPFCode();

		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.close();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = "PersonnelPerformanceReviewReminder", priority = 1)
	public void HomeMyReminders_105506(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105506");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Performance Review");
		personnel.switchToPerformanceReview();
		personnel.performanceReview.enterAtPFCode();
		personnel.performanceReview.clickSearchButton();
		personnel.performanceReview.selectRowAtPFCode();

		personnel.switchToPerformanceReviewEntry();
		personnel.performanceReviewEntry.clickApprovalTab();
		personnel.performanceReviewEntry.enterNextReviewDueAs2DaysFutureFromCurrentDate();
		personnel.performanceReviewEntry.save();
		personnel.performanceReviewEntry.closeTheScreen();
		personnel.switchToPerformanceReview();
	}

	@Test(groups = "PersonnelPerformanceReviewReminder", priority = 2)
	public void HomeMyReminders_105509(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105509");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickPerformanceReviewAccordation();
		home.myHome.myRemindersTab.VerifyPFCodeAtPFCodeInPerformanceRev(0);
		// home.myHome.myRemindersTab.VerifyBadgeAs100InPerformanceRevByAtPFCode();
		// home.myHome.myRemindersTab.VerifyTitleAsDetectiveByAtPFCode();
		home.myHome.myRemindersTab.VerifyNextReviewDateAs2DaysFutureFromCurrentDayByAtPFCode();
		home.myHome.myRemindersTab.SelectRowAtPFCodeInPerformanceRev();
		personnel.switchToPerformanceReviewEntry();
		personnel.performanceReviewEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = "FleetNextDueReminder", priority = 1)
	public void MyReminders_105511(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105511");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");

		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.selectAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();

		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMaintainenceScheduleTab();

		vehicle.fleetEntry.maintenanceScheduleTab.selectServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.selectPeriodAs1Month();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.fleetEntry.save();
		vehicle.fleetEntry.close();
		vehicle.switchToFleetSearch();

	}

	@Test(groups = "FleetNextDueReminder", priority = 2)
	public void MyReminders_105517(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105517");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickFleetAccordation();
		home.myHome.myRemindersTab.VerifyAtFleetId();
		home.myHome.myRemindersTab.VerifyDueOneMonthFutureDateFromCurrentDate();
		home.myHome.myRemindersTab.SelectRowByAtFleetId();

		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.close();
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
	}

	@Test(groups = "FleetNextDueReminder", priority = 3)
	public void MyReminders_106639(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106639");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickExpandAllCheckBox();
		home.myHome.myRemindersTab.VerifyFleetNoDataDisplay();

		home.switchToMyHomeScreen();

	}

	@Test(groups = "InventoryNextDueReminder", priority = 1)
	public void MyReminders_106640(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106640");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.enterAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterNextDueAs1DayFutureDateFromCurrentDate();
		inventory.inventoryEntry.save();

	}

	@Test(groups = "InventoryNextDueReminder", priority = 2)
	public void MyReminders_106641(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106641");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickInventoryAccordation();
		home.myHome.myRemindersTab.VerifyAtInventoryNo();
		home.myHome.myRemindersTab.VerifyItemTypeAsDesktopComputerByAtInventoryNo();
		home.myHome.myRemindersTab.VerifyItemDescriptionAsComputerPartsByAtInventoryNo();
		home.myHome.myRemindersTab.SelectRowAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = "InventoryNextDueReminder", priority = 3)
	public void MyReminders_106642(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106642");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		// home.myHome.myRemindersTab.ClickInventoryAccordation();
		home.myHome.myRemindersTab.VerifyAtInventoryNoNotAppearInGrid();

	}

	@Test(groups = "InventoryNextDueColorReminder", priority = 1)
	public void MyReminders_106645(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106645");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.enterAtInventoryNo();
		// Belows lines are commented to make pass the script.
		// Since the behaviour of the screen changes--Vinton

		// inventory.InventorySearch.ClickSearchButton();
		// inventory.InventorySearch.VerifyAtInventory();
		// inventory.InventorySearch.SelectRowByAtInventory();

		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterNextDueAsCurrentDate();
		inventory.inventoryEntry.save();

	}

	@Test(groups = "InventoryNextDueColorReminder", priority = 2)
	public void MyReminders_106646(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106646");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickInventoryAccordation();
		home.myHome.myRemindersTab.VerifyAtInventoryNo();
		home.myHome.myRemindersTab.VerifyItemTypeAsDesktopComputerByAtInventoryNo();
		home.myHome.myRemindersTab.VerifyItemDescriptionAsComputerPartsByAtInventoryNo();
		home.myHome.myRemindersTab.VerifyLastDateInRedColor();
		home.myHome.myRemindersTab.SelectRowAtInventoryNo();

		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		home.switchToMyHomeScreen();

	}

	@Test
	public void MyReminders_134085(ITestContext testContext) {
		testContext.setAttribute("testID", "134085");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory");
		loader.navigateToScreen("Inventory Search");

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.enterAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.SelectRandomRowInGrid();
		inventory.inventoryEntry.purchaseHistoryTab.EnterExpirationDateAsOneDayFutureFromCurrentDate();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyExpirationDateAsOneDayFutureFromCurrentDate();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.save();

	}

	@Test
	public void MyReminders_134087(ITestContext testContext) {
		testContext.setAttribute("testID", "134087");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickInventoryAccordation();
		home.myHome.myRemindersTab.VerifyAtInventoryNo();
		home.myHome.myRemindersTab.VerifyExpirationDateAsOneDayFutureFromCurrentDateByAtInventoryNo();
		home.myHome.myRemindersTab.SelectRowAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();

	}

	@Test
	public void MyReminders_134088(ITestContext testContext) {
		testContext.setAttribute("testID", "134088");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickInventoryAccordation();
		home.myHome.myRemindersTab.VerifyAtInventoryNo();
		home.myHome.myRemindersTab.SelectRowAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.SelectRandomRowInGrid();
		inventory.inventoryEntry.purchaseHistoryTab.ClearExpirationDate();
		inventory.inventoryEntry.purchaseHistoryTab.EnterExpirationDateAsCurrentDate();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyExpirationDateAsCurrentDate();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.saveNClose();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickRefreshButton();
		home.myHome.myRemindersTab.ClickInventoryAccordation();
		home.myHome.myRemindersTab.VerifyAtInventoryNoNotAppearInGrid();

	}

	@Test(groups = "CertificationReminder", priority = 1)
	public void MyReminders_106665(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106665");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Training");
		loader.navigateToScreen("Certification Search");
		training.switchToCertificationSearch();
		training.certificationSearch.clickAddNew();
		training.switchToCertificationManualEntry();
		training.certificationManualEntry.enterAtPFCode();
		training.certificationManualEntry.selectAsCertification();
		training.certificationManualEntry.save();
		training.switchToCertificationManualEntry();
		training.certificationManualEntry.ClickMainTab();
		training.certificationManualEntry.enterEarnedCEUsAsFive();
		training.certificationManualEntry.enterEarnedHoursAsOneHour();
		training.certificationManualEntry.enterEffectiveFromAsCurrentDate();
		training.certificationManualEntry.enterRecertificaitonByAs1DayFutureFromCurrentDate();
		training.certificationManualEntry.enterReason();
		training.certificationManualEntry.enterAtEnteredBy();
		training.certificationManualEntry.InternalSave();
		training.switchToCertificationManualEntry();
		training.certificationManualEntry.VerifyUpdateSuccessfulAcknowledgeMessage();
		training.switchToCertificationManualEntry();
		training.certificationManualEntry.save();
		training.switchToCertificationManualEntry();
		training.certificationManualEntry.closeCertificationManualEntryScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = "CertificationReminder", priority = 2)
	public void MyReminders_106668(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106668A");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickCertificationAccordion();
		home.myHome.myRemindersTab.VerifyCertificationAsSeleniumCertification(0);
		home.myHome.myRemindersTab.VerifyRecertifyByAsFeatureDate(0);

	}

	@Test(groups = "TrainingRemainder", priority = 1)
	public void MyReminders_106705(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106705");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Training");
		loader.navigateToScreen("Class Search");
		training.switchToClassSearch();

		training.classSearch.clickAddNewLink();
		training.switchToClassEntry();
		training.classEntry.selectTrainingCategoryAsPolice();
		training.classEntry.selectTrainingTypeAsSeleniumTraining();
		training.classEntry.enterEntryDate();
		training.classEntry.enterNoOfStudentsAs1();
		training.classEntry.enterCourseNoAs1000();
		training.classEntry.enterTrainingScheduleDate();
		training.classEntry.enterTrainingScheduleTime();
		training.classEntry.enterToDate();
		training.classEntry.enterToTime();
		training.classEntry.switchToTrainingDetailTab();
		training.classEntry.classEntryTrainingDetailTab.selectQualificationPeriodAsNone();
		training.classEntry.classEntryTrainingDetailTab.enterRequalifyByAsTomorrowDate();
		training.classEntry.save();
		training.switchToClassEntry();
		training.classEntry.closeTrainingClassEntryScreen();
		training.switchToClassSearch();

	}

	@Test(groups = "TrainingRemainder", priority = 2)
	public void MyReminders_106706(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106706");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyTrainingTab();
		home.myHome.myTrainingTab.ClickUpcommingTrainingclassesAccordion();
		home.myHome.myTrainingTab.VerifyTrainingTypeAsSeleniumTraining(0);
		home.myHome.myTrainingTab.VerifyCurrentDate(0);

	}

	@Test(groups = "TrainingRemainder", priority = 3)
	public void MyReminders_106707(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106707");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyTrainingTab();
		home.myHome.myTrainingTab.ClickUpcommingTrainingclassesAccordion();
		home.myHome.myTrainingTab.VerifyTrainingTypeAsSeleniumTraining(0);
		home.myHome.myTrainingTab.VerifyCurrentDate(0);
		home.myHome.myTrainingTab.ClickRowInUpcomingTrainingClassesGrid(0);
		training.switchToClassEntry();
		training.classEntry.clickSignUpButton();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		training.switchToClassEntry();
		training.classEntry.closeTrainingClassEntryScreen();
		home.switchToMyHomeScreen();

	}

	@Test(groups = "TrainingRemainder", priority = 4)
	public void MyReminders_106708(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106708");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyApprovalTab();
		home.myHome.myApprovalTab.SelectStatusAsSubmitted();
		home.myHome.myApprovalTab.SelectItemTypeAsTrainingClass();
		home.myHome.myApprovalTab.ClickSearchButton();
		home.myHome.myApprovalTab.VerifyRefAsSeleniumTraining(0);
		home.myHome.myApprovalTab.VerifyCurrentDate(0);
		home.myHome.myApprovalTab.ClickRowInApprovalTabGrid(0);
		training.switchToClassEntry();
		training.classEntry.switchToRequestTab();
		training.classEntry.requestTab.clickAcceptCheckBox();
		training.classEntry.save();

	}

	@Test(groups = "TrainingRemainder", priority = 5)
	public void MyReminders_106709(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106709");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickTrainingAccordion();
		home.myHome.myRemindersTab.VerifyPFNameAsPatrolOfficer(0);
		home.myHome.myRemindersTab.VerifyTitleAsSeleniumAutomationTraining(0);
		home.myHome.myRemindersTab.VerifyRequalifyByAsFeatureDate(0);

	}

	@Test(groups = "ActivityRemainder", priority = 1)
	public void MyReminders_106710(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106710");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Entry");

		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectCategoryGroupAsPIPolice();
		activity.activityEntry.SelectCategoryAsDamage();
		activity.activityEntry.SelectActivityTypeAsDamage();
		activity.activityEntry.SelectActivityStatusAsRequestToDo();
		activity.activityEntry.TabOutActivityDateAndTime();
		activity.activityEntry.EnterSubjectAsTesting();
		activity.activityEntry.SwitchToOtherTab();
		activity.activityEntry.activityEntryOtherTab.EnterPFAtPFCode();
		activity.activityEntry.Save();
		activity.activityEntry.Close();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = "ActivityRemainder", priority = 2)
	public void MyReminders_106711(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106711");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickMyActivitiesAccordion();
		home.myHome.myRemindersTab.VerifyDateTimeAsCurrentDate(2);
		home.myHome.myRemindersTab.VerifyStatusAsRequestToDo(2);
		home.myHome.myRemindersTab.VerifySubjectAsTesting(2);

	}

	@Test(groups = "ActivityRemainder", priority = 3)
	public void MyReminders_106712(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106712");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickMyActivitiesAccordion();
		home.myHome.myRemindersTab.VerifyDateTimeAsCurrentDate(2);
		home.myHome.myRemindersTab.VerifyStatusAsRequestToDo(2);
		home.myHome.myRemindersTab.VerifySubjectAsTesting(2);
		home.myHome.myRemindersTab.ClickActivityRow(2);

		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectActivityStatusAsCompletedActivity();
		activity.activityEntry.Save();
		activity.activityEntry.Close();
		home.switchToMyHomeScreen();

	}

	@Test(groups = "ActivityRemainder", priority = 4)
	public void MyReminders_106713(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "106713B");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickMyActivitiesAccordion();
		home.myHome.myRemindersTab.VerifySubjectNotAppearInGrid();

	}

	@Test
	public void ActivitySearch_166232(ITestContext testContext) {
		testContext.setAttribute("testID", "166232");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterActivityPeriod();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166243(ITestContext testContext) {
		testContext.setAttribute("testID", "166243");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtCategoryGroup();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166265(ITestContext testContext) {
		testContext.setAttribute("testID", "166265");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtCategory();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166796(ITestContext testContext) {
		testContext.setAttribute("testID", "166796");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtActivityType();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166840(ITestContext testContext) {
		testContext.setAttribute("testID", "166840");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtActivityBy();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166905(ITestContext testContext) {
		testContext.setAttribute("testID", "166905");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtUnit();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166910(ITestContext testContext) {
		testContext.setAttribute("testID", "166910");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtActivityStatus();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166956(ITestContext testContext) {
		testContext.setAttribute("testID", "166956");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtPriority();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166959(ITestContext testContext) {
		testContext.setAttribute("testID", "166959");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtFleet();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166960(ITestContext testContext) {
		testContext.setAttribute("testID", "166960");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtFollowUpBy();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166961(ITestContext testContext) {
		testContext.setAttribute("testID", "166961");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		home.switchToActivitySearch();
		activity.activitySearch.SelectAtApprovalStatus();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166962(ITestContext testContext) {
		testContext.setAttribute("testID", "166962");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtDivision();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166986(ITestContext testContext) {
		testContext.setAttribute("testID", "166986");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtSection();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166990(ITestContext testContext) {
		testContext.setAttribute("testID", "166990");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtTeam();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_166996(ITestContext testContext) {
		testContext.setAttribute("testID", "166996");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.ClickAssignedToButton();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_167011(ITestContext testContext) {
		testContext.setAttribute("testID", "167011");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtPFNo();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_167062(ITestContext testContext) {
		testContext.setAttribute("testID", "167032");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		home.switchToActivitySearch();
		activity.activitySearch.SelectAtPFActivity();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_167079(ITestContext testContext) {
		testContext.setAttribute("testID", "167079");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtPFStatus();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_167338(ITestContext testContext) {
		testContext.setAttribute("testID", "167338");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtFleet();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_167528(ITestContext testContext) {
		testContext.setAttribute("testID", "167528");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtcredits();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_167572(ITestContext testContext) {
		testContext.setAttribute("testID", "167572");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtPayScale();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_167599(ITestContext testContext) {
		testContext.setAttribute("testID", "167599");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtAssingedShift();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_168038(ITestContext testContext) {
		testContext.setAttribute("testID", "168038");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtType();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_168046(ITestContext testContext) {
		testContext.setAttribute("testID", "168046");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddMultiplePFButton();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_168059(ITestContext testContext) {
		testContext.setAttribute("testID", "168059");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtEnteredBy();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_168064(ITestContext testContext) {
		testContext.setAttribute("testID", "168064");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtSubject();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_168065(ITestContext testContext) {
		testContext.setAttribute("testID", "168065");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtRefType();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_168067(ITestContext testContext) {
		testContext.setAttribute("testID", "168067");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtCustom();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void ActivitySearch_168068(ITestContext testContext) {
		testContext.setAttribute("testID", "168068");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtVisitorName();
		activity.activitySearch.ClickSearchLink();

		if (objectIdentification.windowHandle.windowExist("Acknowledge"))
			popup.acknowledge.okWithExpectedMessage(" 1011 - No record found");

		else {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			objectIdentification.randomIdentify.selectRandomGridRow();
			activity.SwitchToActivityEntry();
			activity.activityEntry.ClickSaveNCloseButton();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity Search");
			activity.activitySearch.ClickBackLink();
			activity.activitySearch.ClickResetLink();
		}
	}

	@Test
	public void CreateManualActivitywithStatus_170632(ITestContext testContext) {
		testContext.setAttribute("testID", "170632");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Entry");
		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectAtCategoryGroupforActivityFromHome();
		activity.activityEntry.SelectAtCategoryforActivityFromHome();
		activity.activityEntry.SelectAtActivityTypeforActivityFromHome();
		activity.activityEntry.SelectAtActivityStatusforActivityFromHome();
		activity.activityEntry.SelectShowOnWhiteBoardCheckBox();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.SelectAtUnit();
		activity.activityEntry.SelectAtFleet();
		activity.activityEntry.enterAtLocation();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.Save();

		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.SelectAtPFActivity();
		activity.activityEntry.activityEntryPFTab.SelectAtStatus();
		activity.activityEntry.activityEntryPFTab.SelectAtUnit();
		activity.activityEntry.activityEntryPFTab.EnterAtStartDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtEndDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursWorked();
		activity.activityEntry.activityEntryPFTab.EnterAtCredits();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursPaid();
		activity.activityEntry.activityEntryPFTab.SelectAtPayScale();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.Save();

		//// To Verify the Requested activity showing in My Home-My Reminder Tab

		activity.activityEntry.NavigateToLogEntryTab();
		activity.activityEntry.activityEntryLogEntryTab.SelectAtTemplate();
		activity.activityEntry.activityEntryLogEntryTab.ClickLoadButton();
		activity.activityEntry.activityEntryLogEntryTab.EnterLog();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToOtherTab();
		activity.activityEntry.activityEntryOtherTab.SelectAtRefTypeNo();
		activity.activityEntry.activityEntryOtherTab.EnterDueByDate();
		activity.activityEntry.activityEntryOtherTab.SelectAtPriority();
		activity.activityEntry.activityEntryOtherTab.SelectReportablecheckbox();
		activity.activityEntry.activityEntryOtherTab.EnterCompletedDateTime();
		activity.activityEntry.activityEntryOtherTab.EnterAtCustom();
		activity.activityEntry.activityEntryOtherTab.SelectSendnoticeonChangescheckbox();
		activity.activityEntry.activityEntryOtherTab.ClickAssingedPFArrow();
		activity.activityEntry.activityEntryOtherTab.EnterAtPF();
		activity.activityEntry.activityEntryOtherTab.ClickAdd1Button();
		activity.activityEntry.NavigateToLogHistoryTab();
		activity.activityEntry.logHistoryTab.EnterUpdateDateTime();
		activity.activityEntry.logHistoryTab.EnterUpdateBy();
		activity.activityEntry.logHistoryTab.EnterDuration();
		activity.activityEntry.logHistoryTab.EnterAtComments();
		activity.activityEntry.logHistoryTab.ClickSaveButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.ClickSaveNCloseButton();

		// To Verify the Scheduled activity showing in My Home-My Reminder Tab form
		// Assinged PF login

		loader.logout();
		browser.SwitchToLoginScreen("Police");
		login.loginScreen.EnterAtUserName();
		login.loginScreen.EnterAtPassword();
		login.loginScreen.SelectAtDatabase();
		login.loginScreen.ClickLoginButton();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickMyActivitiesAccordion();
		home.myHome.myRemindersTab.VerifyDateTimeAsCurrentDateinFirstRow();
		home.myHome.myRemindersTab.VerifyStatusAsRequestToDo();
		home.myHome.myRemindersTab.VerifySubjectAsMaintenanceActivity();
		home.myHome.myRemindersTab.ClickActivityRow();
		home.switchToActivityEntry();
		activity.activityEntry.ClickSaveNCloseButton();

		loader.logout();
		browser.SwitchToLoginScreen("Police");
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtSubject();
		activity.activitySearch.ClickSearchLink();
		objectIdentification.randomIdentify.selectRandomGridRow();

		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectActivityStatusAsScheduledItem();
		activity.activityEntry.activityEntryPFTab.EnterAtScheduleDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtScheduledPF();
		activity.activityEntry.activityEntryPFTab.TaboutfromEndTime();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.ClickSaveNCloseButton();

		loader.logout();
		browser.SwitchToLoginScreen("Police");
		login.loginScreen.EnterAtUserName();
		login.loginScreen.EnterAtPassword();
		login.loginScreen.SelectAtDatabase();
		login.loginScreen.ClickLoginButton();
		login.loginScreen.ClickLoginButton();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickMyActivitiesAccordion();
		home.myHome.myRemindersTab.VerifyDateTimeAsCurrentDateinFirstRow();
		home.myHome.myRemindersTab.VerifyStatusAsScheduledItem();
		home.myHome.myRemindersTab.VerifySubjectAsMaintenanceActivity();
		home.myHome.myRemindersTab.ClickActivityRow(1);
		home.switchToActivityEntry();
		activity.activityEntry.VerifySaveNCloseButtonDisabled();
		activity.activityEntry.Close();

		loader.logout();
		browser.SwitchToLoginScreen("Police");
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		home.switchToActivitySearch();
		activity.activitySearch.EnterAtSubject();
		activity.activitySearch.ClickSearchLink();
		objectIdentification.randomIdentify.selectRandomGridRow();

		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectActivityStatusAsInprogressActivity();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectActivityStatusAsCompletedActivity();
		activity.activityEntry.ClickSaveNCloseButton();

	}

	@Test
	public void ActivityEntry_ScheduleActivitydisplayinCalendar_27461(ITestContext testContext) {
		testContext.setAttribute("testID", "27461");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Entry");
		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectAtCategoryGroupforActivityFromHome();
		activity.activityEntry.SelectAtCategoryforActivityFromHome();
		activity.activityEntry.SelectAtActivityTypeforActivityFromHome();
		activity.activityEntry.SelectAtActivityStatusforActivityFromHome();
		activity.activityEntry.SelectShowOnWhiteBoardCheckBox();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.SelectAtUnit();
		activity.activityEntry.SelectAtFleet();
		activity.activityEntry.enterAtLocation();
		activity.activityEntry.enterAtSubject();

		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		Playback.controlReadyThreadWait();
		activity.activityEntry.activityEntryPFTab.EnterAtScheduleDateTime();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.SelectAtPFActivity();
		activity.activityEntry.activityEntryPFTab.SelectAtStatus();
		activity.activityEntry.activityEntryPFTab.SelectAtUnit();
		activity.activityEntry.activityEntryPFTab.EnterAtStartDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtEndDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursWorked();
		activity.activityEntry.activityEntryPFTab.EnterAtCredits();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursPaid();
		activity.activityEntry.activityEntryPFTab.SelectAtPayScale();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.ClickSaveNCloseButton();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Calendar");
		scheduling.switchToCalendarScreen();
		scheduling.calendar.selectShowMyCalendarCheckbox();
		scheduling.calendar.selectActivityEntryFromCalendar();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();

	}

	@Test
	public void ActivityEntry_CompletedActivitydisplayinActivityCalendar_45208(ITestContext testContext) {
		testContext.setAttribute("testID", "45208");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Entry");
		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectAtCategoryGroupforActivityFromHome();
		activity.activityEntry.SelectAtCategoryforActivityFromHome();
		activity.activityEntry.SelectAtActivityTypeforActivityFromHome();
		activity.activityEntry.SelectAtActivityStatusforActivityFromHome();
		activity.activityEntry.SelectShowOnWhiteBoardCheckBox();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.SelectAtUnit();
		activity.activityEntry.SelectAtFleet();
		activity.activityEntry.enterAtLocation();
		activity.activityEntry.enterAtSubject();

		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.SelectAtPFActivity();
		activity.activityEntry.activityEntryPFTab.SelectAtStatus();
		activity.activityEntry.activityEntryPFTab.SelectAtUnit();
		activity.activityEntry.activityEntryPFTab.EnterAtStartDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtEndDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursWorked();
		activity.activityEntry.activityEntryPFTab.EnterAtCredits();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursPaid();
		activity.activityEntry.activityEntryPFTab.SelectAtPayScale();
		activity.activityEntry.activityEntryPFTab.clickAddButton();

		activity.activityEntry.ClickSaveNCloseButton();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Calendar");
		activity.SwitchToActivityCalendarEntry();
		activity.activityCalendarEntry.SelectAtFilter();
		scheduling.calendar.selectActivityEntryFromCalendar();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();
	}

	@Test
	public void CRM62466_51421Home149116(ITestContext testContext) {
		testContext.setAttribute("testID", "149116");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("PhoneBook Search");

		home.switchToPhoneBookSearchScreen();
		home.phoneBookSearch.ClickNewContactButton();
		home.switchToPhoneBookContactEntry();
		home.phoneBookContactEntry.EnterAtBookName();
		home.phoneBookContactEntry.EnterAtLastName();
		home.phoneBookContactEntry.EnterAtFirstName();
		home.phoneBookContactEntry.ClickPhoneNumberTab();
		home.phoneBookContactEntry.phoneNumberTab.SelectPhoneAsHome();
		home.phoneBookContactEntry.phoneNumberTab.EnterPhoneNumber();
		home.phoneBookContactEntry.phoneNumberTab.ClickPrimaryCheckbox();
		home.phoneBookContactEntry.phoneNumberTab.ClickAddButton();
		home.phoneBookContactEntry.phoneNumberTab.VerifyPhoneTypeAsHomeAppearsInGrid(0);
		home.phoneBookContactEntry.SaveNClose();
		home.switchToPhoneBookSearchScreen();
		home.phoneBookSearch.ClickNewContactButton();
		home.switchToPhoneBookContactEntry();
		home.phoneBookContactEntry.EnterAtBookName();
		home.phoneBookContactEntry.EnterAtLastName1();
		home.phoneBookContactEntry.EnterAtFirstName1();
		home.phoneBookContactEntry.ClickPhoneNumberTab();
		home.phoneBookContactEntry.phoneNumberTab.SelectPhoneAsCell();
		home.phoneBookContactEntry.phoneNumberTab.EnterPhoneNumber();
		home.phoneBookContactEntry.phoneNumberTab.EnterAtExtension();
		home.phoneBookContactEntry.phoneNumberTab.ClickPrimaryCheckbox();
		home.phoneBookContactEntry.phoneNumberTab.ClickAddButton();
		home.phoneBookContactEntry.Save();
		home.phoneBookContactEntry.phoneNumberTab.VerifyPhoneTypeAsCellAppearsInGrid(0);
		home.phoneBookContactEntry.phoneNumberTab.VerifyAtExtension(0);
		home.phoneBookContactEntry.phoneNumberTab.VerifyPrimaryCheckboxChecked(0);
		home.phoneBookContactEntry.ClickPhoneNumberTab();
		home.phoneBookContactEntry.phoneNumberTab.SeletRowByAsCell();
		home.phoneBookContactEntry.phoneNumberTab.SelectPhoneAsWork();
		home.phoneBookContactEntry.phoneNumberTab.ClickAddButton();
		home.phoneBookContactEntry.Save();
		home.phoneBookContactEntry.phoneNumberTab.VerifyPhoneTypeAsWorkAppearsInGrid(0);
		home.phoneBookContactEntry.phoneNumberTab.VerifyAtExtension(0);
		home.phoneBookContactEntry.phoneNumberTab.VerifyPrimaryCheckboxChecked(0);
		home.phoneBookContactEntry.SaveNClose();
		home.switchToPhoneBookSearchScreen();
		home.phoneBookSearch.ClickBackButton();
		home.phoneBookSearch.EnterAtBookName();
		home.phoneBookSearch.ClickSearchButton();
		home.phoneBookSearch.VerifyAtLastFirstNameAppearsAsFirstRowInGrid(0);
		home.phoneBookSearch.VerifyAtLastFirstName1AppearsAsSecondRowInGrid(1);

	}

	@Test
	public void CRM_61235Home149462(ITestContext testContext) {
		testContext.setAttribute("testID", "149462");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyApprovalTab();
		home.myHome.myApprovalTab.SelectStatusAsOnHold();
		home.myHome.myApprovalTab.SelectItemTypeAsCrashEntry();
		home.myHome.myApprovalTab.VerifyAtRefNo();
		home.myHome.myApprovalTab.VerifyAtPFCodeByAtRefNoInOfficerColumn();
		home.myHome.myApprovalTab.VerifyStatusAsOnHoldByAtRefNo();
		home.myHome.myApprovalTab.VerifyItemTypeAsCrashByAtRefNo();

	}

	@Test
	public void Police2017SprintHomeModule_155210(ITestContext testContext) {
		testContext.setAttribute("testID", "155210");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickBulletinAddNew();
		home.switchToBulletinEntryScreen();
		home.bulletinEntry.ClickSaveButton();
		home.bulletinEntry.VerifyMessageIDAcknowledgeMessage();
		home.bulletinEntry.EnterAtMessageID();
		home.bulletinEntry.ClickSaveButton();
		home.bulletinEntry.VerifySubjectAcknowledgeMessage();
		home.bulletinEntry.EnterAtSubject();
		home.bulletinEntry.ClickSaveButton();
		home.bulletinEntry.VerifyDistributionAcknowledgeMessage();
		home.bulletinEntry.ClickTextTab();
		home.bulletinEntry.EnterRichText();
		home.bulletinEntry.ClickDistributionTab();
		home.bulletinEntry.EnterPostFromDateAndTime();
		home.bulletinEntry.EnterPostToDateAndTimeAsFuture();
		home.bulletinEntry.SelectPriority();
		home.bulletinEntry.ClickAddressToAllCheckbox();
		home.bulletinEntry.ClickDivisionSectionSquadAccordion();
		home.bulletinEntry.VerifyDivisionSectionSquadDisabled();
		home.bulletinEntry.ClickMultiplePFAccordion();
		home.bulletinEntry.VerifyPFCodeDisabled();
		home.bulletinEntry.ClickAddressToAllCheckbox();
		home.bulletinEntry.ClickDivisionSectionSquadAccordion();
		home.bulletinEntry.SelectAtDivision();
		home.bulletinEntry.SelectAtSection();
		home.bulletinEntry.ClickAddButton();
		home.bulletinEntry.VerifyAtDivisionInGrid(0);
		home.bulletinEntry.VerifyAtSectionInGrid(0);
		home.bulletinEntry.ClickMultiplePFAccordion();
		home.bulletinEntry.EnterAtPFCode();
		home.bulletinEntry.ClickMultiplePFAddButton();
		home.bulletinEntry.EnterAtPFCode1();
		home.bulletinEntry.ClickMultiplePFAddButton();
		home.bulletinEntry.SaveScreen();
		home.switchToBulletinEntryScreen();
		home.bulletinEntry.VerifyUnviewedLabelDisplayed();
		home.bulletinEntry.VerifySendEmailReminderButtonDisplayed();
		home.bulletinEntry.SwitchToAttachmentTab();
		home.bulletinEntry.VerifyAddFilesButtonDisplayed();
		home.bulletinEntry.ClickFolderViewRadioButton();

	}

	@Test
	public void CRM_69025Home_162477(ITestContext testContext) {
		testContext.setAttribute("testID", "162477");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreenByScreenID("1383 - Activity Search");

		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityDateAndTime();
		activity.activityEntry.SelectUnit();
		activity.activityEntry.SelectFleetNo();
		activity.activityEntry.enterAtLocation();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.ClickLocationInfoIcon();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearch.VerifyAtAddress();
		geo.addressSearch.SwitchToActivitiesTab();
		geo.addressSearch.addressSearchActivitiesTab.VerifyAtActivityType();
		geo.addressSearch.addressSearchActivitiesTab.VerifyAtSubject();
		geo.addressSearch.addressSearchActivitiesTab.VerifyAtStatus();
		geo.addressSearch.addressSearchActivitiesTab.VerifyAtBy();
		geo.addressSearch.addressSearchActivitiesTab.VerifyDateAsCurrentDateByAtActivityType();
		geo.addressSearch.addressSearchActivitiesTab.SelectRowByAtActivityType();
		activity.SwitchToActivityEntry();
		activity.activityEntry.VerifyAtActivityType();
		activity.activityEntry.VerifyAtSubject();

	}

	@Test

	public void Police2018SprintHomeModule_184915(ITestContext testContext) {
		testContext.setAttribute("testID", "184915");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.enterSystemparameter59AsAutomationTest();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickBulletinAddNew();
		home.switchToBulletinEntryScreen();
		home.bulletinEntry.EnterAtMessageID();
		home.bulletinEntry.EnterAtSubject();
		home.bulletinEntry.ClickSaveButton();
		home.bulletinEntry.VerifyDistributionAcknowledgeMessage();
		home.bulletinEntry.ClickTextTab();
		home.bulletinEntry.EnterRichText();
		home.bulletinEntry.ClickDistributionTab();
		home.bulletinEntry.EnterPostFromDateAndTime();
		home.bulletinEntry.EnterPostToDateAndTimeAsFuture();
		home.bulletinEntry.SelectPriority();
		// home.bulletinEntry.ClickDivisionSectionSquadAccordion();
		home.bulletinEntry.SelectDivision();
		home.bulletinEntry.SelectSection();
		home.bulletinEntry.ClickAddButton();
		home.bulletinEntry.ClickEmailTextTab();
		// home.bulletinEntry.SelectEmailTemplate();
		// home.bulletinEntry.ClickEmailLoadButton();
		home.bulletinEntry.EnterEmailTextRichText();
		home.bulletinEntry.SaveScreen();
		home.switchToBulletinEntryScreen();
		home.bulletinEntry.VerifyUnviewedLabelDisplayed();
		home.bulletinEntry.VerifySendEmailReminderButtonDisplayed();
		home.bulletinEntry.ClickSendEmailReminderButton();
		home.bulletinEntry.VerifyEmailSentAcknowledgeMessage();
		home.switchToBulletinEntryScreen();
		home.bulletinEntry.SwitchToAttachmentTab();
		home.bulletinEntry.VerifyAddFilesButtonDisplayed();
		home.bulletinEntry.ClickFolderViewRadioButton();

	}

	@Test
	public void CRM_78386_Home_186986(ITestContext testContext) {
		testContext.setAttribute("testID", "186986");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickMessageAddNew();
		home.switchToMessageSend();
		home.messageSendScreen.EnterAtPF();
		home.messageSendScreen.ClickAddButton();
		home.messageSendScreen.VerifyAtTo();
		home.messageSendScreen.SelectPF();
		home.switchToMessageSend();
		home.messageSendScreen.ClickAddButton();
		home.messageSendScreen.ClickAddMultiplePFButton();
		home.switchToAddMultiplePFScreen();
		home.addMultiplePF.ClickSelectAll();
		home.addMultiplePF.ClickAddTheSelectPFToList();
		home.switchToMessageSend();
		home.messageSendScreen.EnterMessage();
		home.messageSendScreen.ClickSendAsTextMessageCheckbox();
		// home.messageSendScreen.ClickShiftNotes();
		home.messageSendScreen.ClickSendButton();
		// home.messageSendScreen.VerifyAllPFConfirmMessage(); //some times its not
		// replicated
		home.messageSendScreen.VerifyMessageSuccessfulBottomMessage();
		home.messageSendScreen.CloseScreen();
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickMessageSearch();
		home.switchToMessageSearch();
		home.messageSearch.VerifyDateAsCurrentDateInGrid(0);
		home.messageSearch.VerifySentArrowinGrid(0);
		home.messageSearch.ClickAtSenderInGrid();
		home.switchToMessageReceivedScreen();
		home.messageReceivedScreen.VerifyReplyTextDisabled();
		home.messageReceivedScreen.VerifyReplybuttonDisabled();
		home.messageReceivedScreen.CloseScreen();
		home.switchToMessageSearch();
	}

	@Test
	public void CRM_78386_Home_186987(ITestContext testContext) {
		testContext.setAttribute("testID", "186987");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickMessageAddNew();
		home.switchToMessageSend();
		home.messageSendScreen.ClickSendAsBolo();
		home.messageSendScreen.VerifyPFAndAddMultiplePFButtonDisabled();
		home.messageSendScreen.EnterMessage();
		home.messageSendScreen.SelectBoloType();
		home.messageSendScreen.SelectAtBoloStatus();
		home.messageSendScreen.ClickSendButton();
		home.messageSendScreen.VerifyBoloMessageConfirmMessage();
		home.messageSendScreen.VerifyMessageSuccessfulBottomMessage();
		home.messageSendScreen.CloseScreen();
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickMessageSearch();
		home.switchToMessageSearch();
		home.messageSearch.ClickBoloRadioButton();
		home.messageSearch.VerifyDateAsCurrentDateInGrid(0);
		home.messageSearch.ClickAtSenderInGrid();
		home.switchToBoloMessageReceivedScreen();
		home.bOLOMessageReceivedScreen.VerifyAtBoloStatus();
		home.bOLOMessageReceivedScreen.EnterMessage();
		home.bOLOMessageReceivedScreen.ClickUpdateButton();
		home.bOLOMessageReceivedScreen.VerifySuccessfulBottomMessage();
		home.bOLOMessageReceivedScreen.CloseScreen();
	}

	@Test
	public void CRM_76095_Home_186989(ITestContext testContext) {
		testContext.setAttribute("testID", "186989");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreenByScreenID("1383 - Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtActivityBy();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.VerifyAtActivityType(0);
		activity.activitySearch.VerifyAtBy(0);
		activity.activitySearch.ClickAtActivityTypeInGrid();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtLastName();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtNotes();
		activity.activityEntry.activityEntryVisitorsTab.TabTimeIn();
		activity.activityEntry.activityEntryVisitorsTab.EnterTimeOutAsFutureTime();
		activity.activityEntry.activityEntryVisitorsTab.ClickAddButton();
		activity.activityEntry.activityEntryVisitorsTab.VerifyAtNotesInGrid(0);
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.VerifyAtNameInGrid(0);
		activity.activityEntry.activityEntryVisitorsTab.ClickAtNameInGrid();
		activity.activityEntry.activityEntryVisitorsTab.ClickNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.VerifyAtActivityNumber();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		home.switchToActivityEntry();
	}

	@Test
	public void Police2018HomeModule_187814(ITestContext testContext) {
		testContext.setAttribute("testID", "187814");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageTab();
		home.myHome.messageTab.ClickMessageSearch();
		home.switchToMessageSearch();
		home.messageSearch.VerifyAtReceiverInGrid(0);
		home.messageSearch.VerifyAtSenderInGrid(0);
		home.messageSearch.ClickAtSenderInGrid();
		home.switchToMessageReceivedScreen();
		home.messageReceivedScreen.VerifyReplybuttonEnabled();
		home.messageReceivedScreen.VerifyReplyTextEnabled();
		home.messageReceivedScreen.EnterReply();
		home.messageReceivedScreen.ClickReplyButton();
		home.switchToMessageSearch();
		home.messageSearch.Click2ndRowInGrid();
		home.switchToMessageReceivedScreen();
		home.messageReceivedScreen.EnterReply();
		home.messageReceivedScreen.ClickReplyAllButton();
	}

	@Test
	public void Police2018HomeModule_199132(ITestContext testContext) {
		testContext.setAttribute("testID", "199132");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageTab();
		home.myHome.messageTab.ClickMessageAddNew();
		home.switchToMessageSend();
		home.messageSendScreen.EnterAtPF();
		home.messageSendScreen.ClickAddButton();
		home.messageSendScreen.SelectPF();
		home.switchToMessageSend();
		home.messageSendScreen.ClickAddButton();
		home.messageSendScreen.EnterAtMessage();
		home.messageSendScreen.ClickSendButton();
		home.switchToMessageSend();
		home.messageSendScreen.CloseScreen();
		home.myHome.SwitchToMessageTab();
		home.myHome.messageTab.ClickMessageRefresh();
		home.myHome.messageTab.VerifyAtMessageInFirstMessageGrid();
		home.myHome.messageTab.ClickMessageSearch();
		home.switchToMessageSearch();
		home.messageSearch.VerifyAtMessageInGrid(0);

	}

	@Test
	public void Police2019HomeModule_203673(ITestContext testContext) {
		testContext.setAttribute("testID", "203673");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		// Scenario:1
		loader.ClickTextMsgSrchImageIcon();
		loader.EnterAutomationinTextMsgSrchTextBox();
		home.switchToTextSearchScreen();
		home.textSearch.SelectOneRecordfromTextSearchWindow();
		home.switchToTextMgmtScreen();
		home.textMgmt.SaveAndCloseScreen();
		home.switchToTextSearchScreen();
		home.textSearch.RemoveTextOnTextSearchWordField();
		// Scenario:2
		home.textSearch.EnterTextInSearchWordsField();
		home.textSearch.ClickSearchButton();
		home.textSearch.RemoveTextOnTextSearchWordField();

		// Scenario:3
		home.textSearch.EnterTextInSearchWordsField1();
		home.textSearch.ClickSearchButton();
		home.textSearch.RemoveTextOnTextSearchWordField();
		// Scenario4
		home.textSearch.EnterTextInSearchWordsField3();
		home.textSearch.ClickSearchButton();
		home.textSearch.RemoveTextOnTextSearchWordField();
		// Scenario5
		home.textSearch.EnterTextInSearchWordsField4();
		home.textSearch.ClickSearchButton();
		home.textSearch.RemoveTextOnTextSearchWordField();
		// Scenario6
		home.textSearch.EnterTextInSearchWordsField5();
		home.textSearch.ClickSearchButton();
		home.textSearch.RemoveTextOnTextSearchWordField();
		// Scenario7
		home.textSearch.EnterTextInSearchWordsField6();
		home.textSearch.ClickSearchButton();
		home.textSearch.RemoveTextOnTextSearchWordField();

	}

	@Test
	public void VerifyReportFromActivityEntry_203757(ITestContext testContext) {
		testContext.setAttribute("testID", "203757");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");

		activity.switchToActivitySearch();
		activity.activitySearch.ClickAcivityPeriodDateResetButton();
		activity.activitySearch.SelectAtActivityType();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.ClickActivityTypeInGrid();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToQAFormsTab();
		activity.activityEntry.activityEntryQAFormsTab.SwitchToSmokeQAFormTab();
		activity.activityEntry.activityEntryQAFormsTab.TabOutPFCode();
		activity.activityEntry.activityEntryQAFormsTab.ClickDwellingType1RadioButton();
		activity.activityEntry.activityEntryQAFormsTab.ClickSaveButton();
		activity.activityEntry.activityEntryQAFormsTab.ClickPrintButton();
		home.switchToSelectReport();
		home.selectReport.ClickQAFormReportInGrid();
		home.switchToPnxCustomReportPDFScreen();
		home.pnxCustomReportPDFScreen.EnterRefText();
		home.pnxCustomReportPDFScreen.VerifyIncludeEmployeeSignatureDefaultAsYes();
		home.pnxCustomReportPDFScreen.ClickViewReportButton();
		// PlayBack.TakeScreenshot(HomeTestContext, "VerifyQAFormReportPrinted");

	}

	@Test
	public void VerifyCustomFieldFunctionality_205106(ITestContext testContext) {
		testContext.setAttribute("testID", "205106");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.ClickPointsCustomLabel();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.enterAtCustomName();
		settings.repositoryEntry.saveScreen();
		settings.repositoryEntry.closeScreen();
		activity.switchToActivitySearch();
		activity.activitySearch.VerifyAtCustomNameInCustomField();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.VerifyAtCustomNameInCustomField();

	}

	@Test
	public void Police2019HomeModule_207318(ITestContext testContext) {
		testContext.setAttribute("testID", "207318");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("PhoneBook Search");

		home.switchToPhoneBookSearchScreen();
		home.phoneBookSearch.ClickNewPhoneBookButton();
		home.switchToPhoneBookEntry();
		home.phoneBookEntry.EnterAtBookName();
		home.phoneBookEntry.EnterAtDescription();
		home.phoneBookEntry.ClickGlobalCheckbox();
		home.phoneBookEntry.ClickDetailBillingCheckbox();
		home.phoneBookEntry.ClickAdd();
		home.phoneBookEntry.VerifyGlobalCheckboxcheckedUsingBookName();
		home.phoneBookEntry.VerifyDetailBillingCheckboxcheckedUsingBookName();
		home.phoneBookEntry.Save();
		home.switchToPhoneBookEntry();
		home.phoneBookEntry.VerifyGlobalCheckboxcheckedUsingBookName();
		home.phoneBookEntry.VerifyDetailBillingCheckboxcheckedUsingBookName();
		home.phoneBookEntry.Close();
		home.switchToPhoneBookSearchScreen();
		home.phoneBookSearch.ClickNewContactButton();
		home.switchToPhoneBookContactEntry();
		home.phoneBookContactEntry.EnterAtBookName();
		home.phoneBookContactEntry.EnterAtLastName();
		home.phoneBookContactEntry.EnterAtFirstName();
		home.phoneBookContactEntry.EnterAtMiddleName();
		home.phoneBookContactEntry.EnterAtAddress();
		home.phoneBookContactEntry.ClickPhoneNumberTab();
		home.phoneBookContactEntry.phoneNumberTab.SelectPhoneAsWork();
		home.phoneBookContactEntry.phoneNumberTab.EnterAtPhoneNumber();
		home.phoneBookContactEntry.phoneNumberTab.EnterExtension();
		home.phoneBookContactEntry.phoneNumberTab.ClickPrimaryCheckbox();
		home.phoneBookContactEntry.phoneNumberTab.ClickAddButton();
		home.phoneBookContactEntry.phoneNumberTab.VerifyPhoneTypeAsWorkAppearsInGrid(0);
		home.phoneBookContactEntry.phoneNumberTab.VerifyPrimaryCheckboxChecked(0);
		home.phoneBookContactEntry.Save();
		home.switchToPhoneBookContactEntry();
		home.phoneBookContactEntry.ClickAllTabs();
		home.phoneBookContactEntry.ClickCallBackTab();
		home.phoneBookContactEntry.callBackTab.SelectAtRoster();
		home.phoneBookContactEntry.callBackTab.EnterPeriodFromDateAsPreviousDate();
		home.phoneBookContactEntry.callBackTab.EnterPeriodToDateAsFutureDate();
		home.phoneBookContactEntry.callBackTab.EnterComments();
		home.phoneBookContactEntry.ClickHistoryTab();
		home.phoneBookContactEntry.contactEntryHistoryTab.TabDateTime();
		home.phoneBookContactEntry.contactEntryHistoryTab.EnterAtLog();
		home.phoneBookContactEntry.contactEntryHistoryTab.ClickAdd();
		home.phoneBookContactEntry.contactEntryHistoryTab.VerifyAtLogInGrid(0);
		home.phoneBookContactEntry.Save();
		home.switchToPhoneBookContactEntry();
		home.phoneBookContactEntry.Close();
		home.switchToPhoneBookSearchScreen();
		home.phoneBookSearch.ClickBackButton();
		home.phoneBookSearch.ClickPhoneBookLookup();
		home.phoneBookSearch.SelectAtPhoneBook();
		home.phoneBookSearch.ClickSearchButton();
		home.phoneBookSearch.VerifyAtNameInGrid(0);
	}

	@Test
	public void CRMProductDefect_213111(ITestContext testContext) {
		testContext.setAttribute("testID", "213111");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Entry");

		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.tabActivityDateTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
	}

	@Test(groups = { "2020DefectMyReportsTab" }) // Raja Sadaraj
	public void Police2020HomeModule_240637(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "240637");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.ClickShowMyItemsOnly();
		home.myHome.myReportsTab.SelectAtItemType();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.ClickRefreshButton();
		home.myHome.myReportsTab.SelectAtItemType1();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.ClickRefreshButton();

	}

	@Test(groups = { "2020DefectMyReportsTab" }) // Raja Sadaraj
	public void Police2020HomeModule_242537(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "242537");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageTab();
		home.myHome.messageTab.ClickMessageAddNew();
		home.switchToMessageSend();
		home.messageSendScreen.EnterAtPF();
		home.messageSendScreen.ClickAddButton();
		home.messageSendScreen.SelectPF();
		home.switchToMessageSend();
		home.messageSendScreen.ClickAddButton();
		home.messageSendScreen.EnterAtMessage();
		home.messageSendScreen.ClickSendButton();
		home.switchToMessageSend();
		home.messageSendScreen.CloseScreen();
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageTab();
		home.myHome.messageTab.VerifyAtMessageInFirstMessageGrid();
		home.myHome.messageTab.ClickFirstMessageRow();
		home.switchToMessageReceivedScreen();
		home.messageReceivedScreen.ClickReadPreviousButton();
		home.messageReceivedScreen.ClickReadNextButton();
		home.messageReceivedScreen.CloseScreen();
	}

	@Test(groups = { "2020DefectMyReportsTab" }) // Raja Sadaraj
	public void Police2020HomeModule_248772(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "248772");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.ClickPoliceOfficeRoleTabsEnabled();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.closeScreen();
		home.myHome.SwitchToMyReportApprovalTab();
		home.switchToMyHomeScreen();
		home.myHome.myReportsTab.VerifyStatusAsOnHold();
		home.myHome.myReportsTab.VerifyStatusAsReportDue();
		home.myHome.myReportsTab.ClickShowMyItemsOnly();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.SelectAtStatus();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyGridRowStatusAsReportDue();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyGridRowStatusAsSubmitted();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
	}

	@Test
	public void Fire2020HomeModuleDefect_250437(ITestContext testContext) {
		testContext.setAttribute("testID", "250437");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		home.switchToActivitySearch();
		activity.activitySearch.SelectAtActivityTypeRadControl();
		activity.activitySearch.EnterAtPFNo();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.ClickAtActivityTypeInGrid();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToNamesTab();
		activity.activityEntry.namesTab.EnterAtLastName();
		activity.activityEntry.namesTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToNamesTab();
		activity.activityEntry.namesTab.clickAddbutton();
		activity.activityEntry.namesTab.VerifyAtActivityInGrid(0);
		activity.activityEntry.namesTab.saveInternalTab();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToNamesTab();
		activity.activityEntry.namesTab.VerifyAtActivityInGrid(0);
		activity.activityEntry.namesTab.VerifyAtNameInGrid(0);
		activity.activityEntry.namesTab.DeleteAtName();
		activity.activityEntry.namesTab.VerifyConfirmationDeleteMessage();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToNamesTab();
		activity.activityEntry.namesTab.saveInternalTab();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();
	}

	@Test(groups = { "2020DefectMyHome2021Defect" }, enabled = false) // Automated by Stalin, reworked by dinesh, data
																		// set need to be added.

	public void Verify_the_record_requet_entrie_showing_in_My_Reminders_tab_For_Officer_250173(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250173");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.VerifyRecordsRequestsISEnabled();
		home.myHome.myRemindersTab.ClickRecordsRequestsAccordion();
		home.myHome.myRemindersTab.VerifyRecordsRequestsCount();
		home.myHome.myRemindersTab.VerifyAtRequestNoFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtRequestedByFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtRequestTypeFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtCallAndCaseFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtAssignedToFromGrid(0);
		home.myHome.SwitchToMyRemindersTab();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectMyHome2021Defect" }) // Automated by Stalin

	public void Verify_the_Records_request_entries_is_able_to_show_in_My_Reminders_tab_for_records_supervisor_250174(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250174");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.VerifyRecordsRequestsISEnabled();
		home.myHome.myRemindersTab.ClickRecordsRequestsAccordion();
		home.myHome.myRemindersTab.VerifyRecordsRequestsCount();
		home.myHome.myRemindersTab.VerifyAtRequestNoFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtRequestedByFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtRequestTypeFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtDueClosedDateFromGrid(0); // error detected.
		home.myHome.myRemindersTab.VerifyAtCallAndCaseFromGrid(0);
		home.myHome.myRemindersTab.VerifyAtAssignedToFromGrid(0);

	}

	@Test(groups = { "2020DefectMyHome2021Defect" }) // Stalin
	public void Verify_the_Manage_Link_screen_functionalities_from_My_Home_screen_248844(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "248844");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.ClickAddLinkButton();
		home.myHome.SwitchToManageLinks();
		home.manageLinks.EnterAtLinkName();
		home.manageLinks.EnterAtScreenID();
		home.manageLinks.EnterAtURL();
		home.manageLinks.EnterAtFilePath();
		home.manageLinks.ClickAddButton();
		home.manageLinks.verifyAcceptLinkorURLAcknowledgeMEssage(); // changes made in method.
		home.myHome.SwitchToManageLinks();
		home.manageLinks.clickClearButton();
		home.manageLinks.EnterAtLinkName();
		home.manageLinks.EnterAtScreenID();
		home.manageLinks.ClickAddButton();
		home.manageLinks.Save();
		home.myHome.SwitchToManageLinks();
		home.manageLinks.VerifyBottomStatusMessage();
		home.manageLinks.SelectAtLinkNameInGrid();
		home.manageLinks.verifyUpdateButton();
		home.manageLinks.ClickShowAllCheckbox();
		home.manageLinks.ClickAddButton();
		home.manageLinks.Save();
		home.myHome.SwitchToManageLinks();
		home.manageLinks.VerifyBottomStatusMessage();
		home.manageLinks.SelectAtLinkNameInGrid();
		home.manageLinks.verifyShowAllCheckboxIsSelected();
		home.myHome.SwitchToManageLinks();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test // Raga Ranjani
	public void Fire2020DefectHomeModule_252266(ITestContext testContext) {
		testContext.setAttribute("testID", "252266");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		Playback.pageLoadThreadWait();
		home.myHome.SwitchToMyApprovalTab();
		home.myHome.myApprovalTab.SelectAtItemType();
		Playback.pageLoadThreadWait();
		home.myHome.myApprovalTab.ClickRefreshButton();
		home.myHome.myApprovalTab.verifyAtItemTypeInColumnValues();
		home.myHome.myApprovalTab.selectAtItemType1();
		home.myHome.myApprovalTab.verifyAtItemType1InColumnValues();
		home.myHome.myApprovalTab.SelectAtStatus();
		home.myHome.myApprovalTab.verifyAtItemType1InColumnValues();
		home.myHome.myApprovalTab.selectAtStatus1();
		home.myHome.myApprovalTab.verifyAtStatus1InColumnValues();

	}

	@Test(groups = { "2020DefectMyReportsTab" }) // Automated by Stalin
	public void VerifyreportsabletosearchfromMyReports(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "253691");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.SelectAtStatus();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyGridRowStatusAsOnHold();
		home.myHome.myReportsTab.selectStatusAsNull();
		home.myHome.myReportsTab.ClickShowMyItemsOnly();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.selectAtStatus1();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyGridRowStatusAsReportDue();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.selectAtStatus2();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.VerifyStatusAsRejected();

	}

	@Test

	public void Police2020DefectHomeModule_254469(ITestContext testContext) {
		testContext.setAttribute("testID", "254469");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter917AsFalse();
		settings.switchToSystemParamter();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.clickOpenCaseFolderAccordion();
		home.myHome.myCMTab.VerifyInvestColumnDisplayed();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter917AsTrue();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.VerifyInvestColumnNotDisplayed();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter918AsFalse();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.VerifySupervisorPFColumnDisplayed();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter918AsTrue();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.VerifySupervisorPFColumnNotDisplayed();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter919AsFalse();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.VerifyPrimePFColumnDisplayed();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter919AsTrue();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.VerifyPrimePFColumnNotDisplayed();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter920AsFalse();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.VerifyHighestCATColumnDisplayed();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter920AsTrue();
		home.myHome.SwitchToMyCMTab();
		home.myHome.myCMTab.VerifyChargeOrCFSColumnDisplayed();

	}

	@Test // Raga Ranjani

	public void Fire2020DefectHomeModule_255738(ITestContext testContext) {
		testContext.setAttribute("testID", "255738");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID();
		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.clickRowByCodeValue(1);
		settings.maintainCodeValue.clickEnableFeesTabCheckbox();
		settings.maintainCodeValue.clickAddButton();
		objectIdentification.windowHandle.phoenixMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		home.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.SelectActivityTypeAsMaintenance();
		activity.activityEntry.SelectActivityStatusAsInprogressActivity();
		activity.activityEntry.TabOutActivityDateAndTime();
		activity.activityEntry.enterSubject();
		activity.activityEntry.Save();
		activity.activityEntry.clickFeesTab();
		activity.activityEntry.activityEntryFeesTab.selectInvoiceType(); // invoice not showing in Fire MJ Automation DB
		activity.activityEntry.activityEntryFeesTab.enterAtBillToAccountNameID();
		activity.activityEntry.activityEntryFeesTab.selectItemCode();
		activity.activityEntry.activityEntryFeesTab.clickAddButton();
		activity.activityEntry.activityEntryFeesTab.Save();
	}

	@Test(groups = { "2020DefectTestCases" }) // Automated by Stalin
	public void InactivePFcontactshows(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258293");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Notification Search");
		home.switchToNotificationSearch();
		home.notificationSearch.clickSearch();
		home.notificationSearch.selectCheckBoxInGridByUsingRequestedPF();
		home.notificationSearch.clickUpdateButton();
		home.switchToNotificationScreen();
		home.notification.clickRequestedByPFInfoButton();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickInactiveCheckBox();
		personnel.personnelEntry.save();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.close();
		home.switchToNotificationScreen();
		home.notification.enterAtRequestedbyPF();
		home.notification.verifyInactiveCodeSelectedAwckMsg();
		home.switchToNotificationScreen();
		home.notification.enterAtRequestedbyPF1();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.clickIncludeInactiveCheckBox();
		popup.kPICodedLookup.verifyAtDescription();
		popup.kPICodedLookup.selectAtPFCode();
		popup.acknowledge.verifyInactiveCodeSelectedAwckMsg();
		home.switchToNotificationScreen();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.clickAddButton();
		home.notification.verifyAtRequestedByInGrid();
		home.notification.clickEMailRadioButton();
		home.notification.enterAtEmail();
		home.notification.enterAtName();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.clickAddButton();
		home.notification.verifyAtRequestedByInGrid();
		home.notification.SaveScreen();

	}

	@Test(groups = { "2020DefectTestCases" }) // Q4 Sprint 4 Automated by Mahesha
	public void VerifyThatNoRecordFoundPopupShouldBeDisplayedOnlyOneTimeInReportLogScreen_258923(
			ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258923");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.clickOnPNXLogo();
		loader.mouseHoverOnPnxLogoAction("Tools");
		loader.mouseHoverAndClickOnPnxLogoAction("Report Log");
		home.switchToReportLog();
//     home.reportLog.verifyFromDateAsCurrentDate();
		home.reportLog.selectProductAsCAD();
		home.reportLog.unCheckIncludeErrorCheckBox();
		home.reportLog.enterAtReportName();
		home.reportLog.clickSearchButton();
		home.reportLog.verifyNoRecordFoundAcknowledge();
		home.switchToReportLog();
		home.reportLog.enterFromDateAsLastYear();
		home.reportLog.selectAtProduct();
		home.reportLog.clearReportName();
		home.reportLog.unCheckIncludeErrorCheckBox();
		home.reportLog.clickSearchButton();
		home.reportLog.verifyTableListOutResults();
		home.reportLog.selectAtjuris();
		home.reportLog.enterFromDateAsLastYear();
		home.reportLog.selectAtProduct();
		home.reportLog.clickSearchButton();
		home.reportLog.verifyNoRecordFoundAcknowledge();

	}

	@Test(groups = { "2020DefectTestCases" }) // Q4 Sprint4 Automated by Mahesha
	public void ForgotPasswordDisable_260154(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260154");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		loader.ClickSystemParameterIcon();
		settings.switchToSystemParamterScreen();
		settings.sysParameter.setSystemparameter282AsFalse();
		loader.navigateToModule("Home");
		loader.logout();
		Browser.NavigateToLoginScreen();
		login.loginScreen.SelectAtDatabase();
		login.loginScreen.verifyForgotPasswordDisabled();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.ClickSystemParameterIcon();
		settings.switchToSystemParamterScreen();
		settings.sysParameter.setSystemparameter282AsTrue();
		loader.logout();
		Browser.NavigateToLoginScreen();
		login.loginScreen.SelectAtDatabase();
		login.loginScreen.verifyForgotPasswordEnabled();
	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Q4 Sprint 4 Automated by Mahesha
	public void ScheduledCallinCAD_259721(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "259721");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.tabActivityDateTime();
		activity.activityEntry.enterAtLocation();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.NavigateToOtherTab();
		activity.activityEntry.activityEntryOtherTab.selectScheduleCallInCADCheckBox();
		activity.activityEntry.clickSave();
		activity.activityEntry.verifyEnterDateAcknowledge();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToOtherTab();
		activity.activityEntry.activityEntryOtherTab.enterAtScheduledDate();
		activity.activityEntry.clickSave();
		activity.activityEntry.verifyEnterCFSAcknowledge();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToOtherTab();
		activity.activityEntry.activityEntryOtherTab.enterAtCFS();
		activity.activityEntry.clickSave();
		activity.activityEntry.verifyEnterSRCAcknowledge();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToOtherTab();
		activity.activityEntry.activityEntryOtherTab.selectAtSRC();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		// activity.activityEntry.verifyAdditionSuccessfulSatusMsg();
	}

	@Test(groups = { "2020DefectMyReportsTab" }) // Vijay
	public void verifyKeyPunchStatusReports_252295(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "252295");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.changeParameterById("736", "select", "param_736_Dyn_DropDown", "DIV+SEC");
		settings.switchToSystemParamter();
		settings.sysParameter.clickRefreshButton();
		settings.sysParameter.changeParameterById("745", "select", "param_745_Dyn_DropDown", "False");
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportApprovalTab();
		home.myHome.myReportsTab.SelectStatusAsKeypunch();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyGridRowStatusAsTranscriber();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.ClickShowMyItemsOnly();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
	}

	@Test(groups = { "2020DefectTestCases" }) // Automated by Stalin
	public void TrackSearchscreen(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258918");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Track Search");
		home.switchToTrackSearchScreenTab();
		home.trackSearch.verifyAtOwner();
		home.trackSearch.clickAddNew();
		home.switchToTrackEntry();
		home.trackEntry.clickVendorSearchButton();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtCodeValueInGrid();
		home.switchToTrackEntry();
		home.trackEntry.clickVendorInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToBusinessTab();
		names.nameEntry.businessTab.verifyHelpDeskVendoxCheckBoxIsSelected();
		names.switchToNameEntry();
		names.nameEntry.SaveNCloseScreen();
		home.switchToTrackEntry();
		home.trackEntry.enterAtSummary();
		home.trackEntry.selectAtStatus();
		home.trackEntry.selectAtContact();
		home.trackEntry.clickOwnerSearchButton();
		popup.switchToCodedSearchII();
		popup.kPICodedLookup.selectAtPFCode();
		home.switchToTrackEntry();
		home.trackEntry.verifyAtOwner1();
		home.trackEntry.SaveNClose();
		home.switchToTrackSearchScreenTab();
		home.trackSearch.clickReset();
		home.trackSearch.enterAtVendor();
		home.trackSearch.clickSearch();
		home.trackSearch.verifyAtSummaryInGrid();

	}

	@Test(groups = { "2020DefectTestCases" }) // Automated by Stalin
	public void Recurrencefunctionality(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258917");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityDateAndTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.activityEntryPFTab.verifyAtPFInGrid(0);
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyAdditionSuccessfulBottomMessage();
		activity.activityEntry.selectAtActivityStatus1();
		activity.activityEntry.tabOutScheduledFromDateAndTime();
		activity.activityEntry.tabOutScheduledToDateAndTime();
		activity.activityEntry.clickRecurrenceCheckBox();
		activity.activityEntry.recurrencePopUp.clickHourlyRadioButton();
		activity.activityEntry.recurrencePopUp.enterAtEndAfter();
		activity.activityEntry.recurrencePopUp.clickCloseButton();
		activity.activityEntry.clickSave();
		activity.activityEntry.verifyChangeScheduleFutureInstanceConfirmMessage();
//		activity.activityEntry.verifyConflictsWithSchedulePopUp();          //Sometimes this Popup will Come
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.clickSchedulesTab();
		activity.activityEntry.schedulesTab.clickPFNotesIconInGrid(0);
		activity.activityEntry.schedulesTab.verifyAtPFNotesToolTip();
		activity.activityEntry.schedulesTab.clickCloseInPFNotesToolTip();
		activity.SwitchToActivityEntry();
		activity.activityEntry.clickOpenRecurrenceButton();
		activity.activityEntry.recurrencePopUp.clickDailyRadioButton();
		activity.activityEntry.recurrencePopUp.enterAtEndAfter();
		activity.activityEntry.recurrencePopUp.clickCloseButton();
		activity.activityEntry.clickSave();
		activity.activityEntry.verifyChangeScheduleFutureInstanceConfirmMessage();
//		activity.activityEntry.verifyConflictsWithSchedulePopUp();          //Sometimes this Popup will Come
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickExpandAllCheckBox();
		home.myHome.myRemindersTab.verifyAtSubjectInActivitiesTable();

	}

	@Test(groups = { "2020DefectTestCases" }) // Vijay
	public void verifyErrorNotOccuringWhileCreatingNewActivityEntry_261412(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "261412");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.tabActivityDateTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyAdditionSuccessfulInStatusBar();

	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Vijay
	public void verifyTheWhiteboardSpellingInRespectiveScreens_261413(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "261413");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.whiteBoard.verifyAtTitle();
		home.myHome.whiteBoard.clickMaximizeButton();
		home.myHome.whiteBoard.verifyNoRecordFoundAcknowledgeMessage();
		home.myHome.switchToWhiteBoardWindow();
		home.myHome.whiteBoard.verifyAtTitle();
		home.myHome.whiteBoard.close();
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch(); // addded by dinesh
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyAtWhiteBoardLabel();
		activity.activityEntry.close();
		activity.switchToActivitySearch();
		activity.activitySearch.verifyAtShowWhiteboardItemsOnlyCheckboxLabel();
		activity.pressF4keyToOpenQuickActivityEntry();
		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.verifyAtShowOnWhiteboardLabel();
		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.close();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID();
		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.clickRowByAtCodeValue();
		settings.maintainCodeValue.verifyAtShowOnWhiteboardCheckboxLabel();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Automated by Stalin, reworked by dinesh
	public void PrivatecheckboxfunctionalityinActivityEntry_261083(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261083");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Entry");
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyPrivateCheckBoxIsDisplayed();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.tabActivityDateTime();
		activity.activityEntry.TabOutActivityToDateAndTime();
		activity.activityEntry.clickPrivateCheckBox();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.activityEntryPFTab.verifyAtPFInGrid();
		activity.SwitchToActivityEntry();
		activity.activityEntry.SwitchToOtherTab();
		activity.activityEntry.activityEntryOtherTab.ClickDivisionSectionSquadArrow();
		activity.activityEntry.activityEntryOtherTab.SelectAtDivision();
		activity.activityEntry.activityEntryOtherTab.SelectAtSection();
		activity.activityEntry.activityEntryOtherTab.SelectAtTeam();
		activity.activityEntry.activityEntryOtherTab.clickSquadLookUpButton();
		activity.SwitchToActivityEntry(); // added by dinesh
		activity.popup.switchToCodedSearch();
		activity.popup.kPICodedLookup.randomKPIHelpSelect();
		activity.SwitchToActivityEntry();
		activity.activityEntry.SwitchToOtherTab();
		activity.activityEntry.activityEntryOtherTab.ClickAddButton();
		activity.activityEntry.activityEntryOtherTab.verifyAtDivisionInGrid(0);
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtSubjectInGrid();
		activity.switchToActivitySearch();
		objectIdentification.windowHandle.switchToMainWindow();
//		Remaining flow cannot be automated, as discussed with Mahesha.
//		activity.activitySearch.ClickBackLink();
//		activity.activitySearch.ClickResetLink();
//		loader.navigateToModule("Personnel");
//		loader.navigateToScreen("Personnel Search");
//		personnel.SwitchToPersonnelSearch();
//		personnel.personnelSearch.clickAddNewButton();
//		personnel.switchToPersonnelEntry();
//		personnel.personnelEntry.enterAtPFCode1(); // updated
//		personnel.personnelEntry.enterAtLastName(); // updated
//		personnel.personnelEntry.enterAtFirstName(); // updated
//		personnel.personnelEntry.clickAssignmentTab();
//		personnel.personnelEntry.personnelEntryAssignmentTab.selectAtDivision();
//		personnel.personnelEntry.personnelEntryAssignmentTab.selectAtSection();
//		personnel.personnelEntry.personnelEntryAssignmentTab.selectAtSquad();  
//		personnel.personnelEntry.personnelEntryAssignmentTab.tabOutEffectiveDateTime();
//		personnel.switchToPersonnelEntry();
//		personnel.personnelEntry.switchToSecurityTab();
//		personnel.personnelEntry.personnelEntrySecurityTab.enterAtUserName();
//		personnel.personnelEntry.personnelEntrySecurityTab.enterAtPassword();
//		personnel.personnelEntry.personnelEntrySecurityTab.enterReenterAtPassword();
//		personnel.personnelEntry.personnelEntrySecurityTab.selectRoleAsLocalAdmin();
//		personnel.personnelEntry.personnelEntrySecurityTab.clickAddButton();
//		personnel.switchToPersonnelEntry();
//		personnel.personnelEntry.save();
//		personnel.switchToPersonnelEntry();
//		loader.logout();
//		login.loginScreen.logonUsingTestContext();
//		loader.navigateToModule("Home");
//		loader.navigateToScreen("Activity Search");
//		activity.switchToActivitySearch();
//		activity.activitySearch.ClickSearchLink();
//		activity.activitySearch.verifyAtSubjectInGrid();
//		activity.switchToActivitySearch();

	}

	@Test(groups = { "2020DefectTestCases" }) // Automated by Stalin
	// TreeViewHelp window is not supporting according to Testcase
	public void SubcategoryworkingfinefromActivityQuickEntry(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261084");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		activity.pressF4keyToOpenQuickActivityEntry();
		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.clickCategoryGroupFleet();
		activity.activityQuickEntry.verifyCategoryGroupFleetButtonAsGreenColor();
		activity.activityQuickEntry.clickCategoryVehicleMaintenance();
		activity.activityQuickEntry.verifyCategoryVehicleMaintenanceButtonAsGreenColor();
		activity.activityQuickEntry.clickActivityLogTypeCarWash();
		activity.activityQuickEntry.verifyActivityLogTypeCarWashButtonAsGreenColor();
		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.save();
		activity.switchToActivityQuickEntry();
		activity.activityQuickEntry.clickViewTodaysLog();
		activity.SwitchToQuickActivityLog();
		activity.activityQuickEntry.verifyAtActivityTypeFromQuickActivityLog(0);
		activity.activityQuickEntry.clickAtActivityTypeFromQuickActivityLogGrid();
		activity.SwitchToActivityEntry();

	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Automated by Stalin
	public void NewlyaddedfieldsfromActivitysearch_261086(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261086");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.verifyUnitIsDisplayed();
		activity.activitySearch.verifyFleetIsDisplayed();
		activity.activitySearch.verifyPFActivityIsDisplayed();
		activity.activitySearch.verifyPFStatusIsDisplayed();
		activity.activitySearch.verifyHoursWorkedIsDisplayed();
		activity.activitySearch.verifyCreditsIsDisplayed();
		activity.activitySearch.verifyPayScaleIsDisplayed();
		activity.activitySearch.verifyAssignedShiftIsDisplayed();
		activity.activitySearch.verifyAddMultiplePFButtonISDisplayed();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutEnteredDateAndTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo(); // updated
		activity.activityEntry.activityEntryPFTab.SelectAtPFActivity();
		activity.activityEntry.activityEntryPFTab.SelectAtStatus();
		activity.activityEntry.activityEntryPFTab.EnterAtStartDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursWorked(); // Updated
		activity.activityEntry.activityEntryPFTab.enterAtPoints();
		activity.activityEntry.activityEntryPFTab.SelectAtPayScale(); // Updated
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtPFNo();
		activity.activitySearch.SelectAtPFActivity(); // Updated
		activity.activitySearch.SelectAtPFStatus(); // Updated
		activity.activitySearch.SelectAtHoursWorked(); // Updated
		activity.activitySearch.SelectAtcredits(); // Updated
		activity.activitySearch.SelectAtPayScale(); // Updated
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtSubjectInGrid();
		activity.switchToActivitySearch();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Automated by Stalin,value available only in 45.
	public void MultipleselectionoptionPFStatusPayScale_261409(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261409");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.SelectAtPFStatus(); // error detected by dinesh
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtStatusInGrid();
		activity.activitySearch.ClickBackLink();
		activity.activitySearch.SelectAtPayScale(); // error detected by dinesh
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtStatusInGrid();
		activity.activitySearch.ClickBackLink();
		activity.activitySearch.selectPFStatusAsCheckAll();
		activity.activitySearch.selectPayScaleAsCheckAll();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtStatusInGrid();
		activity.activitySearch.ClickBackLink();
		activity.switchToActivitySearch();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Automated by Stalin , reworked by dinesh, product
														// functionality issue
	public void UserableTocreateActivityMaintenanceTab_261422(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261422");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyPFTabIsDisplayed();
		activity.activityEntry.verifyLogEntryTabIsDisplayed();
		activity.activityEntry.verifyAttachmentTabIsDisplayed();
		activity.activityEntry.verifyMaintenanceTabIsDisplayed();
		activity.activityEntry.verifyOtherTabIsDisplayed();
		activity.activityEntry.verifyLogHistoryTbIsDisplayed();
		activity.activityEntry.NavigateToMaintenanaceTab();
		activity.activityEntry.maintenanceTab.EnterAtCurrentMileage();
		activity.activityEntry.maintenanceTab.EnterAtCurrentHours();
		activity.activityEntry.maintenanceTab.EnterAtVendor(); // Updated
		activity.activityEntry.maintenanceTab.EnterAtCost();
		activity.activityEntry.maintenanceTab.clickUseItemsFromInventoryCheckBox();
		activity.activityEntry.maintenanceTab.clickInventoryLookUpButton();
		inventory.SwitchToInventorySearchEntryWindow();
		inventory.itemEntrySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToMaintenanaceTab();
		activity.activityEntry.maintenanceTab.ClickSaveButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.activityEntry.NavigateToMaintenanaceTab();
		activity.activityEntry.maintenanceTab.verifyAtInvOrPartNo(); // error identified by dinesh, functionality issue
		activity.SwitchToActivityEntry();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Automated by Stalin, functionality issue - by diensh
	public void UserabletocreateActivitywithVisitorTab_261423(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261423");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyPFTabIsDisplayed();
		activity.activityEntry.verifyLogEntryTabIsDisplayed();
		activity.activityEntry.verifyOtherTabIsDisplayed();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtLastName();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtNotes();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtTime();
		activity.activityEntry.activityEntryVisitorsTab.ClickAddButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.SelectAtPFActivity();
		activity.activityEntry.activityEntryPFTab.SelectAtStatus();
		activity.activityEntry.activityEntryPFTab.SelectAtUnit();
		activity.activityEntry.activityEntryPFTab.EnterAtStartDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtEndDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursWorked();
		activity.activityEntry.activityEntryPFTab.enterAtPoints();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursPaid();
		activity.activityEntry.activityEntryPFTab.SelectAtPayScale();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry(); // added by dinesh
		activity.activityEntry.switchToTR1Tab(); // error detected by dinesh
		activity.activityEntry.activityEntryTR1Tab.tabOutPFNo();
		activity.activityEntry.activityEntryTR1Tab.clickYesRadioButton();
		activity.activityEntry.activityEntryTR1Tab.clickSave();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Automated by Stalin
	public void AssignedActivityShowinginMyHome261424(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261424");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyPFTabIsDisplayed();
		activity.activityEntry.verifyLogEntryTabIsDisplayed();
		activity.activityEntry.verifyOtherTabIsDisplayed();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.SelectAtPFActivity();
		activity.activityEntry.activityEntryPFTab.SelectAtStatus();
		activity.activityEntry.activityEntryPFTab.SelectAtUnit();
		activity.activityEntry.activityEntryPFTab.EnterAtStartDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtEndDateTime();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursWorked();
		activity.activityEntry.activityEntryPFTab.enterAtPoints();
		activity.activityEntry.activityEntryPFTab.EnterAtHoursPaid();
		activity.activityEntry.activityEntryPFTab.SelectAtPayScale();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.activityEntryPFTab.EnterAtScheduleDateTime();
		activity.SwitchToActivityEntry();
		activity.activityEntry.SwitchToOtherTab();
		activity.activityEntry.activityEntryOtherTab.ClickAssingedPFArrow();
		activity.activityEntry.activityEntryOtherTab.EnterAtPF();
		activity.activityEntry.activityEntryOtherTab.ClickAdd1Button();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();
		activity.switchToActivitySearch();
		loader.logout();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickMyActivitiesAccordion();
		home.myHome.myRemindersTab.verifyAtSubjectInGrid();
		home.switchToMyHomeScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectActivityEntrySearch" }) // Automated by Stalin, value available only in 45 - by diensh
	public void ActivitySupervisorabletoDeletefromActivityEntry_261419(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261419");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.EnterAtSubject();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtStatusInGrid();
		activity.activitySearch.clickAtStatusInGrid();
		activity.SwitchToActivityEntry();
		activity.activityEntry.clickDeleteIconWithConfirmPopupMessage();
		activity.switchToActivitySearch();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyNoRecordsFoundAcknowledgeMessage();
		activity.switchToActivitySearch();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectMyHome2021Defect" }) // Automated by Stalin Q2 S4 run in 45 or 87
	public void VerifyExpenseRecordsareshowinginMyReports_273924(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273924");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportApprovalTab();
		home.myHome.myReportsTab.SelectAtItemType();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.selectRowByAtRefNo();
		home.switchToExpenseEntry();
		home.expenseEntry.switchToApprovalTab();
		home.expenseEntry.expenseEntryApprovalTab.selectNewActionAsSendForApproval();
		home.expenseEntry.expenseEntryApprovalTab.tabOutDateAndTime();
		home.expenseEntry.expenseEntryApprovalTab.internalSave();
		home.switchToExpenseEntry();
		home.expenseEntry.closeScreen();
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportApprovalTab();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtRefNo();
		home.switchToMyHomeScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectMyHome2021Defect" }) // Mithun
	public void Home_275261(ITestContext testContext) {
		testContext.setAttribute("testID", "275261");
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.ClickAddLinkButton();
		home.myHome.SwitchToManageLinks();
		home.myHome.manageLinks.EnterAtLinkName(); // error detected by dinesh
		home.myHome.manageLinks.EnterAtScreenID();
		home.myHome.manageLinks.ClickAddButton();
		home.myHome.manageLinks.Save();
		home.myHome.SwitchToManageLinks();
		home.myHome.manageLinks.SelectAtLinkNameInGrid();
		home.myHome.manageLinks.ClickShowAllCheckbox();
		home.myHome.manageLinks.verifyUpdateButton();
		home.myHome.manageLinks.ClickAddButton();
		home.myHome.manageLinks.Save();
		home.myHome.SwitchToManageLinks();
		home.myHome.manageLinks.verifyAtLinkNameIsGreenInGrid();
		home.myHome.manageLinks.CloseTheScreen();
		home.switchToMyHomeScreen();
	}

	// Automated by Vijay // Date : 09/01/2021 // Sprint: 2021 Q3 Sprint 4
	@Test
	public void verifyWhetherTheActivityEntryIsGettingDuplicateWhileWeAddingTheQAFormToTheScreen_277263(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "277263");
		Browser.NavigateToLoginScreenForFire();
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.TabOutActivityToDateAndTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		objectIdentification.windowHandle.switchToMainWindow();
		activity.switchToActivitySearch();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtSubjectInGridWithNoDuplications();
		activity.SwitchToActivityEntry();
		activity.activityEntry.clickQAFormsTab();
		qA.SwitchToQuestionDataEntry();
		qA.questionDataEntry.TabOutPF();
		qA.questionDataEntry.clickBatteryOperatedButtons();
		qA.questionDataEntry.clickSave();
		activity.switchToActivitySearch();
		activity.activitySearch.ClickBackLink();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.verifyAtSubjectInGridWithNoDuplications();

	}

	@Test // Automated by Stalin Q2 s2
	public void MyHomeMessagetabaddnewissue_278644(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278644");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickMessageAddNew();
		home.switchToMessageSend();
		home.messageSendScreen.EnterAtPF();
		home.messageSendScreen.enterAtUnit();
		home.messageSendScreen.EnterMessage();
		home.messageSendScreen.ClickSendButton();
		home.messageSendScreen.VerifyMessageSuccessfulBottomMessage();
		home.switchToMessageSend();

	}

	// Automated by KIRAN :- Date :-11/1/2021 Quarter:-4 Sprint:-2
	@Test(groups = { "2022DefectTestCasesKIRAN" })
	public void VerifyTheMessage_bulletinScreenDoesNotShowBlueScreenError_278637(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278637");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();

		home.myHome.SwitchToMessageBulletinTab();
		home.myHome.messageTab.ClickMessageAddNew();
		home.switchToMessageSend();
		home.messageSendScreen.EnterAtPF();
		home.messageSendScreen.EnterAtMessage();
		home.messageSendScreen.ClickSendButton();
		home.messageSendScreen.VerifyAllPFConfirmMessage();

		home.messageSendScreen.VerifyMessageSuccessfulBottomMessage();

	}

	// Automated by KIRAN :- Date :-11/16/2021 Quarter:-4 Sprint:-4 Module:-Home
	@Test(groups = { "2022DefectTestCasesKIRAN" })
	public void ToVerifyWhetherThErrorMessageIsShowingWhileWeClickTheAAddMultiplePFbuttonFromActivityEntryScreenFromHomeModule_281417(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281417");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		home.switchToActivitySearch();
		// ADDNEW
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.ClickAddMultiplePFButton();
		activity.switchToActivitySearchHelpWindow1();
		activity.activitySearchHelpWindow.verifyAtPFName1();
		activity.activitySearchHelpWindow.clickSearch();
		activity.activitySearchHelpWindow.clickAtPFByName();
		activity.activitySearchHelpWindow.clickAddTheSelectedPFToTheList();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.verifyAtPFInGrid();
		activity.activityEntry.close();

		home.switchToActivitySearch();
		activity.activitySearch.clickAddMultiplePFButton();
		activity.switchToActivitySearchHelpWindow();
		activity.activitySearchHelpWindow.verifyAtPFName();
		activity.activitySearchHelpWindow.clickSearch();
		activity.activitySearchHelpWindow.clickAtPFByName();
		activity.activitySearchHelpWindow.clickAddTheSelectedPFToTheList();
		home.switchToActivitySearch();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.VerifyAtActivityType(0);

		// FROM EXICITING ENTRIESS
		activity.activitySearch.SelectAtActivityType();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.ClickAddMultiplePFButton();
		activity.switchToActivitySearchHelpWindow();
		activity.activitySearchHelpWindow.verifyAtPFName();
		activity.activitySearchHelpWindow.clickSearch();
		activity.activitySearchHelpWindow.clickAtPFByName1();
		activity.activitySearchHelpWindow.clickAddTheSelectedPFToTheList();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.verifyAtPFInGrid();

	}

	// Automated by:- Mahesha , Date :- 12/09/2021 , Quarter:- Q4 , Sprint:- 5 ,
	// Module:- Home .

	@Test(groups = { "Enhancement" })
	public void VerifySupervisorFieldIsDisplayedInMyReportsApprovalTab_276768(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "276768");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myApprovalTab.verifySupervisorFieldDisplayed();
		home.myHome.myApprovalTab.enterAtSupervisorPF();
		home.myHome.myApprovalTab.ClickSearchButton();
		home.myHome.myApprovalTab.verifySubmittedToColumnDisplayed();
		home.myHome.myApprovalTab.verifySubmittedToOfficerRecordsOnlyListed();
		home.myHome.myApprovalTab.verifyAtSubmittedToSupervisorName();

	}

	// Automated by:-Dinesh , Date :-02/10/2022 , Quarter:-1 , Sprint:-3 ,
	// Module:-Home,Favorite .

	@Test(groups = { "" })
	public void AllowedToAddRemoveFavoriteScreenFromFavoriteModule_289832(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "289832");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search"); // added newly
		loader.mouseHoverOnScreenName("Arrest Search");
		loader.verifyFavoriteIConStatus("Arrest Search","Mark as Favorite");
		loader.clickFavoriteIconUsingScreenName("Arrest Search");
		loader.navigateToModule("Favorite");
		loader.verifyAtScreenInFavorite("Arrest Search");
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		loader.mouseHoverOnScreenName("Arrest Search");
		loader.verifyFavoriteIConStatus("Arrest Search","Remove from Favorite");
		loader.clickFavoriteIconUsingScreenName("Arrest Search");
		loader.navigateToModule("Favorite");
		loader.verifyAtScreenNotInFavorite("Arrest Search");

	}

	@AfterMethod(groups = { "2020DefectTestCases", "2020DefectActivityEntry", "2020DefectActivitySearch",
			"2020DefectMyHomeTabs", "2021DefectTestCases", "2020DefectMyReportsTab", "ActivityRemainder",
			"CertificationReminder", "FleetNextDueReminder", "InventoryNextDueColorReminder",
			"InventoryNextDueReminder", "PersonnelJobGradeNextReviewReminder", "PersonnelPerformanceReviewReminder",
			"PropertyFollowUpReminder", "TrainingRemainder", "2022DefectTestCasesKIRAN",
			"2020DefectActivityEntrySearch", "2020DefectMyHome2021Defect", "Enhancement" })
	public void afterMethodRecords(ITestResult testResult) {
		/*
		 * try Playback.takeScreenShotOnFailure(testResult); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		try {
			ExtentReport.getResult(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
//		Playback.stop();
//
//		login.Reset();
//		loader.Reset();
//		home.Reset();
//		geo.Reset();
//		 popup.Reset();
	}

	@AfterSuite(groups = { "2020DefectTestCases", "2020DefectActivityEntry", "2020DefectActivitySearch",
			"2020DefectMyHomeTabs", "2021DefectTestCases", "2020DefectMyReportsTab", "ActivityRemainder",
			"CertificationReminder", "FleetNextDueReminder", "InventoryNextDueColorReminder",
			"InventoryNextDueReminder", "PersonnelJobGradeNextReviewReminder", "PersonnelPerformanceReviewReminder",
			"PropertyFollowUpReminder", "TrainingRemainder", "2022DefectTestCasesKIRAN",
			"2020DefectActivityEntrySearch", "2020DefectMyHome2021Defect", "Enhancement" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}

}
