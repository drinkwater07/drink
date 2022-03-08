package scripts;

import java.util.ArrayList;

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
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.QA;
import application.Settings;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class NamesScripts {

	public Names names;
	public Login login;
	public Loader loader;
	public Popup popup;
	public Geo geo;
	public ObjectIdentification objectIdentification;
	public Vehicle vehicle;
	public Home home;
	public Settings settings;
	public QA qA;
	public Activity activity;

	// public String nodeUrl;
	// @BeforeTest

	public void BeforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Names");
		Playback.testContext = testContext;

		Playback.start();

		login = new Login();
		loader = new Loader();
		names = new Names();
		geo = new Geo();
		vehicle = new Vehicle();
		objectIdentification = new ObjectIdentification();
		home = new Home();
		settings = new Settings();
		popup = new Popup();
		activity = new Activity();
		qA = new QA();

	}

	@BeforeSuite(groups = { "2020DefectNameSearch", "2021DefectTestCases", "2020DefectNameEntry", "2020DefectArrest",
			"2020DefectAttachments", "nameMerge", "AdultArrest", "gang", "jailCell", "2020DefectNameEntry",
			"2020DefectArrest", "2020DefectExpungement", "2020DefectAttachments", "2020DefectNameSearch2",
			"namesFunctionalAttachment", "2021DefectTestcaseNames", "Enanchment2022", "namesFunctional1",
			"namesFunctional2", "namesFunctional3", "socialMedia" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "2021DefectTestCases", "arresthome", "AdultArrest", "nameMerge", "jailCell", "gang",
			"2020DefectNameSearch", "2020DefectNameEntry", "2020DefectArrest", "2020DefectAttachments", "arresthome",
			"nameMerge", "jailCell", "gang", "2020DefectNameSearch", "2020DefectExpungement", "2020DefectNameEntry",
			"2020DefectArrest", "2020DefectAttachments", "2020DefectNameSearch2", "namesFunctional1",
			"namesFunctional2", "2021DefectTestcaseNames", "namesFunctional3", "Enanchment2022", "namesFunctionalAttachment", "socialMedia" })
	public void BeforeTestMethodNames(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Names");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		names = new Names();
		geo = new Geo();
		vehicle = new Vehicle();
		objectIdentification = new ObjectIdentification();
		home = new Home();
		settings = new Settings();
		popup = new Popup();
		activity = new Activity();
		qA = new QA();

	}

	// @Parameters({"arresthome"})
	@Test(groups = "AdultArrest", priority = 1)
	public void AdultArrestEntry_99920(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "99920");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");

		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.Reset();
		names.arrestEntry.SelectNameAtLastName();

		names.switchToArrestEntry();
		names.arrestEntry.ClickNameInfoButton();
		names.switchToNameEntry();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.closeTheScreen();

		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.EnterAtCaseNo1();
		names.arrestEntry.arrestTab.clickCaseInfoButton();

		objectIdentification.windowHandle.switchToWindow("Case Update");
		objectIdentification.windowHandle.closeTheScreen();

		names.switchToArrestEntry();
		//names.arrestEntry.arrestTab.ClearArrestDate();
		names.arrestEntry.arrestTab.enterarrestDateAs1DayBeforeFromCurrentDate();
		names.arrestEntry.arrestTab.enterAtOfficer1();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.EnterOffenderID();
		names.arrestEntry.arrestTab.SelectSupervisor();
		names.switchToArrestEntry();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();

		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.enterAtCharge1();
		names.arrestEntry.chargeTab.TabTheCount();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.selectCourtType();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.chargeTab.EnterAtCaseNo2();
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.EnterAtCharge2();
		names.arrestEntry.chargeTab.TabTheCount();
		names.arrestEntry.chargeTab.SelectStatusAsNoProcess();
		names.arrestEntry.chargeTab.selectCourtType();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.Save();
		// popup.confirm.yes();
		names.arrestEntry.verifyAdditionSucessfulStatusMsg();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.VerifyHighestChargeByAtCaseNo2(0);

		names.arrestEntry.switchToCommentsTab();
		names.arrestEntry.arrestEntryCommentsTab.EnterSubject();
		names.arrestEntry.arrestEntryCommentsTab.ClickTheEnterCommentsButton();
		popup.confirm.yes();
		names.switchToArrestEntry();
		names.switchToBookingCommentsScreen();
		names.arrestEntry.arrestEntryCommentsTab.bookingComments.EnterComments();
		names.arrestEntry.arrestEntryCommentsTab.bookingComments.SaveNClose();
		names.switchToArrestEntry();
		names.arrestEntry.switchToStatementTab();
		names.arrestEntry.statementTab.EnterRandomStatement();
		names.arrestEntry.statementTab.SaveInternalTab();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargingConfTab();
		names.arrestEntry.chargingConfTab.SelectTheFirstChargeInTheTable(0);
		names.arrestEntry.chargingConfTab.EntertNewCharge();
		names.arrestEntry.chargingConfTab.TabTheCaseOfficer();
		names.arrestEntry.chargingConfTab.EnterRandomReviewingDAsName();
		names.arrestEntry.chargingConfTab.ClickTheUpdateButton();
		names.arrestEntry.chargingConfTab.Save();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		popup.confirm.yes();
		names.switchToArrestEntry();
	}

	// @Parameters({"arresthome"})
	@Test(groups = "AdultArrest", priority = 2)
	public void AdultArrestEntry_99941(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "99941");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");

		names.switchToArrestSearch();
		names.arrestSearch.EnterAtCaseNo();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectArrestByAtCaseNo();

		names.switchToArrestEntry();
		names.arrestEntry.VerifyAtNameID();
		names.arrestEntry.VerifyAtLastName();
		names.arrestEntry.VerifyAtFirstName();
		Playback.controlReadyThreadWait();
		names.arrestEntry.ClickNameInfoButton();

		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.SelectAtActivity();
		names.nameEntry.activityTab.VerifyActivityType();
		names.nameEntry.activityTab.VerifyLocation();
		names.nameEntry.closeTheScreen();

		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.VerifyAtCaseNo();
		names.arrestEntry.arrestTab.VerifyIncidentLocation();
		names.arrestEntry.arrestTab.VerifyAtOfficer1();

		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.VerifyHighestChargeByAtCaseNo2(0);

		names.arrestEntry.switchToDispositionTab();
		names.arrestEntry.dispositionTab.VerifyHighestChargeInDispositionTab(0);

		names.switchToArrestEntry();
		names.arrestEntry.switchToPersonalDataTab();
		names.arrestEntry.personalDataTab.VerifyHeight();
		names.arrestEntry.personalDataTab.VerifyWeightlbs();
		names.arrestEntry.personalDataTab.VerifyEyeColor();
		names.arrestEntry.personalDataTab.VerifyHairColor();
		names.arrestEntry.personalDataTab.HairLenght();

		names.arrestEntry.switchToChargingConfTab();
		names.arrestEntry.chargingConfTab.VerifyHighestChargeInChargeCongigTab(0);
		names.arrestEntry.chargingConfTab.VerifyNewChargeAtNewCharge(0);

	}

	@Test
	public void AdultArrestEntry_99894(ITestContext testContext) {
		testContext.setAttribute("testID", "99894");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");

		names.switchToArrestSearch();
		names.arrestSearch.clickAddnewButton();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.verifyBookingNameRequiredMessage();
		names.switchToArrestEntry();
		names.arrestEntry.SelectNameID();
		names.arrestEntry.VerifyInvalidNameIDMessage();
		names.switchToArrestEntry();
		names.arrestEntry.SelectNameAtLastName();
		names.arrestEntry.Save();
		names.arrestEntry.verifyInvalidCaseNoOrReqiredMessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.EnterFutureCaseYear();
		names.arrestEntry.arrestTab.EnterCaseNumber();
		names.arrestEntry.arrestTab.VerifyFutureYearNotAllowed();
		names.arrestEntry.arrestTab.ClearCase();
		names.arrestEntry.arrestTab.EnterAtCaseNo1();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.Save();
		names.arrestEntry.arrestTab.VerifyHowIsRequiredAcknowledgemessage();
		names.switchToArrestEntry();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.enterAtOfficer1();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.EnterOffenderID();
		names.arrestEntry.arrestTab.SelectSupervisor();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.arrestEntry.Save();
		names.arrestEntry.VerifyMinimumOneChargeIsRequiredAcknowledgeMessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.enterAtCharge1();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.selectCourtType();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.Save();
		Playback.waitForPageLoad();
		popup.confirm.yes();
		Playback.waitForPageLoad();
		Playback.waitForPageLoad();
		Playback.waitForPageLoad();
		names.switchToArrestEntry();
	}

//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
	@Test(groups = { "namesFunctional1" })
	public void VerifyMugShotworking_105104(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105104");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.EnterAtCaseNo();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectArrestByAtCaseNo();
		names.switchToArrestEntry();
		names.arrestEntry.ClickArrestEntryImageView();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickShowAllImagesCheckBox();
		home.allImagesScreen.ClickPictureEditIcon();
		home.switchToImageEditorScreen();
		// WindowsControl.ImageEditorWindow.ClickMugshotCrop();
		// WindowsControl.ImageEditorWindow.ClickSaveMugshot();
		// WindowsControl.ImageEditorWindow.VerifyAlertMessage();
		// WindowsControl.ImageEditorWindow.ClickOkButton();
		home.switchToAllImageScreen();
		home.allImagesScreen.CloseScreen();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.switchToArrestEntry();
		names.arrestEntry.verifyUpdateSucessfulStatusMsg();
	}

	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 2)
		public void NameEntryMainTab_102397(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102397");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToMainTab();
			names.nameEntry.nameEntryMainTab.ClickClearDOBButton();
			names.nameEntry.nameEntryMainTab.EnterAtOutRangeDOB();
			// names.nameEntry.nameEntryMainTab.VerifyAge(); //age changes yearly
			names.nameEntry.nameEntryMainTab.SelectSex();
			names.nameEntry.nameEntryMainTab.SelectRace();
			names.nameEntry.nameEntryMainTab.SelectEthnic();
			names.nameEntry.nameEntryMainTab.EnterSSNumber();
			names.nameEntry.nameEntryMainTab.EnterDrivingLicenseNo();
			names.nameEntry.nameEntryMainTab.SelectDrivingLicenseStateasNJ();
			names.nameEntry.nameEntryMainTab.SelectLicenseType();
			names.nameEntry.nameEntryMainTab.EnterDrivingLicenseExpireDate();
			names.nameEntry.nameEntryMainTab.SelectMaritalStatusAsMarried();
			names.nameEntry.nameEntryMainTab.EnterBirthCity();
			names.nameEntry.nameEntryMainTab.SelectBirthStateAsNJ();
			names.nameEntry.nameEntryMainTab.SelectBirthCountry();
			names.nameEntry.nameEntryMainTab.EnterStateNumber();
			names.nameEntry.nameEntryMainTab.EnterFBINumber();
			names.nameEntry.nameEntryMainTab.SelectResident();
			names.nameEntry.nameEntryMainTab.EnterBirthCountry();
			names.nameEntry.nameEntryMainTab.EnterCitizenship();
			names.nameEntry.nameEntryMainTab.EnterPassportNumber();
			names.nameEntry.nameEntryMainTab.EnterImmigrationNumber();
			names.nameEntry.nameEntryMainTab.EnterFingerPrint();
			names.nameEntry.nameEntryMainTab.SelectRandomDNA();
			names.nameEntry.nameEntryMainTab.EnterEmail();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		}


		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 3)
		public void NameEntryMainTab_102429(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102429");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToMainTab();
			names.nameEntry.nameEntryMainTab.EnterInvalidSSNumber();
			names.nameEntry.ClickSaveButton();
//			Playback.waitForPageLoad(); done by dinesh
			names.nameEntry.nameEntryMainTab.VerifAcknowledgeInvalidSSNumber();
			names.switchToNameEntry();
			names.nameEntry.nameEntryMainTab.EnterSSNumber();
			names.nameEntry.nameEntryMainTab.EnterAtStateFBINumber();
			names.nameEntry.ClickSaveButton(); // altered by dinesh
//			popup.confirm.yes(); // done by dinesh
//			names.switchToNameEntry();  // done by dinesh
			names.nameEntry.nameEntryMainTab.VerifyAcknowledgeSameFBIandSBINumber();
			names.switchToNameEntry();
		}


		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 4)
		public void NameEntryMainTab_102431(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102431");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToMainTab();
			names.nameEntry.nameEntryMainTab.ClickClearDOBButton();
			names.nameEntry.nameEntryMainTab.EnterAtOutRangeDOB();
			names.nameEntry.nameEntryMainTab.VerifyAcknowledgeOutRangeDOB();
			names.switchToNameEntry();
			names.nameEntry.nameEntryMainTab.EnterFutureDOB();
			names.nameEntry.nameEntryMainTab.VerifyAcknowledgeValidDOB();
			names.switchToNameEntry();
			names.nameEntry.nameEntryMainTab.EnterInvalidEmail();
			names.nameEntry.ClickSaveButton();
			names.nameEntry.nameEntryMainTab.VerifyAcknowledgeValidEmail();
			names.switchToNameEntry();
			names.nameEntry.nameEntryMainTab.EnterEmail();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyAtLastName();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		}
	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 1)
		public void NameEntryFlagTab_102364(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102364");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToNameEntryFlagTab();
			names.nameEntry.nameEntryFlagTab.ClickAddNewButton();
			names.nameEntry.nameEntryFlagTab.SelectFlagAsArmedDangerous();
			names.nameEntry.nameEntryFlagTab.CheckCriticalCheckBox();
			names.nameEntry.nameEntryFlagTab.EnteredBy();
			names.nameEntry.nameEntryFlagTab.TabEnteredDate();
			names.nameEntry.nameEntryFlagTab.VerifyCurrentDate();
			names.nameEntry.nameEntryFlagTab.EnterActiveDate();
			names.nameEntry.nameEntryFlagTab.EnterExpiredDate();
			names.nameEntry.nameEntryFlagTab.EnterComment();
			names.nameEntry.nameEntryFlagTab.ClickAddButton();
			names.nameEntry.nameEntryFlagTab.ClickCommentIconInGrid(0);
			popup.acknowledge.ok();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.switchToNameEntryFlagTab();
			names.nameEntry.nameEntryFlagTab.VerifyAtExpiryDateUsingFlags();
			names.nameEntry.nameEntryFlagTab.VerifyFlagRedColorCode();
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 2)
		public void NameEntryFlagTab_102368(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102368");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.VerifyFlagIconInSearchscreen(0);
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.ClickAddressInfoButton();
			geo.switchToAddressSearchHelpWindow();
			geo.addressSearchHelp.VerifyAddressInfoIconColor();
			geo.addressSearchHelp.CloseAddressSearchScreen();
			names.switchToNameEntry();
			names.nameEntry.switchToNameEntryFlagTab();
			names.nameEntry.nameEntryFlagTab.VerifyFlagRedColorCode();
			names.nameEntry.nameEntryFlagTab.ClickAddNewButton();
			names.nameEntry.nameEntryFlagTab.SelectFlagAsArmedDangerous();
			names.nameEntry.nameEntryFlagTab.ClickAddButton();
			names.nameEntry.nameEntryFlagTab.VerifyAcknowledgeDuplicationData();
			names.switchToNameEntry();
			names.nameEntry.switchToNameEntryFlagTab();
			names.nameEntry.nameEntryFlagTab.verifyCriticalCheckBoxIsChecked();
			names.nameEntry.nameEntryFlagTab.ClickCancelButton();
			names.nameEntry.nameEntryFlagTab.ClickCommentIconInGrid(0);
			popup.acknowledge.remarksAcknowledgeOk();
			names.switchToNameEntry();
		}

		// Reworked by:- Dinesh , Date :- 28-10-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 3)
		public void NameEntryFlagTab_102369(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102369");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToNameEntryFlagTab();
			names.nameEntry.nameEntryFlagTab.ClickDeleteIconInGrid();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.nameEntryFlagTab.VerifyBlackColorCode();
			names.nameEntry.VerifyAddressInfoButtonBlueColorCode();
			names.nameEntry.closeTheScreen();
			names.switchToNameSearch();
			names.nameSearch.ClickRefreshButton();
			names.nameSearch.VerifyFlagIconNotinSearchscreen(0);
			names.nameSearch.verifyLastActivityDateUsingLastName(0);
			names.switchToNameSearch();

		}

	@Test
	public void NameEntryGangTab_104908(ITestContext testContext) {
		testContext.setAttribute("testID", "104908");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.SelectNameByID();
		names.switchToNameEntry();
		names.nameEntry.switchToGangTab();
		names.nameEntry.gangTab.SelectAtGang();
		names.nameEntry.gangTab.ClickAddGangButton();
		names.nameEntry.gangTab.VerifyAtGangAddedInGrid(0);
		names.nameEntry.gangTab.SelectAtGang();
		names.nameEntry.gangTab.ClickAddGangButton();
		names.nameEntry.gangTab.DeleteGangMembership(); // delete issue
		names.nameEntry.gangTab.VerifyConfirmDeleteMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToGangTab();
		names.nameEntry.gangTab.Save();
		popup.confirm.yes();
		names.switchToNameEntry();
		names.nameEntry.switchToGangTab();
		names.nameEntry.gangTab.VerifyDeletedGangNotFound();
		names.nameEntry.gangTab.SelectGangAsBlood();
		names.nameEntry.gangTab.EnterGangSet();
		names.nameEntry.gangTab.ClickSelfAdmission();
		names.nameEntry.gangTab.ClickGangTattoos();
		names.nameEntry.gangTab.ClickAddGangButton();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.nameEntry.gangTab.VerifyAcknowledgeUpdateGangTab();
		names.switchToNameEntry();
		names.nameEntry.switchToGangTab();
		names.nameEntry.gangTab.Save();
		popup.confirm.yes();
		names.switchToNameEntry();
		names.nameEntry.switchToGangTab();
		names.nameEntry.gangTab.VerifyAdditionSccessful();
		names.switchToNameEntry();
		names.nameEntry.Save();
		popup.confirm.yes();

	}


	//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameEntryInfoTab_104786(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "104786");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToInfoTab();
			names.nameEntry.infoTab.EnterDrivingLicenseNumber();
			names.nameEntry.infoTab.ClickDLAddButton();
			names.nameEntry.infoTab.EnterAtSSNumber(); 
			names.nameEntry.infoTab.ClickAddSSnumber();
			names.nameEntry.infoTab.EnterRandomAdultDOB();
			names.nameEntry.infoTab.ClickAddDOBButton();
			names.nameEntry.infoTab.EnterActualDLNo();
			names.nameEntry.infoTab.ClickDLAddButton();
			names.nameEntry.infoTab.VerifyAcknowledgeDuplicationData();
			names.switchToNameEntry();
			names.nameEntry.switchToInfoTab();
			names.nameEntry.infoTab.ClearDLNumber();
			names.nameEntry.infoTab.EnterActualSSNumber();
			names.nameEntry.infoTab.ClickAddSSnumber(); 
			names.nameEntry.infoTab.VerifyConfirmSSNumber(); // recently found issue.
			names.switchToNameEntry();
			names.nameEntry.switchToInfoTab();
			names.nameEntry.infoTab.ClickClearSSNumber();
			names.nameEntry.infoTab.EnterActualDOB();
			names.nameEntry.infoTab.ClickAddDOBButton();
			names.nameEntry.infoTab.VerifyAcknowledgeDuplicationData();
			names.switchToNameEntry();
			names.nameEntry.switchToInfoTab();
			names.nameEntry.infoTab.ClickClearDOBButton();
			names.switchToNameEntry();
			names.nameEntry.ClickSaveButton();
			names.nameEntry.infoTab.VerifyAcknowledgeUpdateInfoTab();
			names.switchToNameEntry();
			names.nameEntry.switchToInfoTab();
			names.nameEntry.infoTab.SaveInternalTab();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();

//			names.nameEntry.switchToInfoTab();
//			names.switchToNameEntry();
//			names.nameEntry.switchToInfoTab();
//			names.switchToNameEntry();
//				
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 9)
		public void NameEntryMapTab_102393(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102393");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToNameEntryMapTab();
			names.nameEntry.nameEntryMapTab.VerifyLatLongAsCustomValue();
			names.nameEntry.nameEntryMapTab.VerifyDiplayingMapIdForNameID();

//			Playback.threadWait(); // done by dinesh

		}

	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 8)
		public void NameEntryPhoneTab_102383(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102383");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
//			names.switchToNameEntry();
//			names.nameEntry.switchToPhonesTab();
//			names.nameEntry.phoneTab.VerifyExistingPhone(0);
//			names.nameEntry.phoneTab.SelectPhoneType();
//			names.nameEntry.phoneTab.EnterAtPhoneNumber(); // modified by dinesh
//			names.nameEntry.phoneTab.ClickAddButton();
//			names.nameEntry.phoneTab.VerifyInvalidAcknowledgePhoneTab();
			names.switchToNameEntry();
			names.nameEntry.switchToPhonesTab();
			names.nameEntry.phoneTab.SelectPhoneType();
			names.nameEntry.phoneTab.EnterAtPhoneNumber();
			names.nameEntry.ClickSaveButton();
			names.nameEntry.phoneTab.VerifyAcknowledgeUpdatePhoneTab();
			names.switchToNameEntry();
			names.nameEntry.switchToPhonesTab();
			names.nameEntry.phoneTab.ClickAddButton();
			names.nameEntry.phoneTab.VerifyAddedPhoneNumber(1);
			names.nameEntry.phoneTab.DeleteAdddedPhoneNumber();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.switchToPhonesTab();
			names.nameEntry.phoneTab.VerifyDeletedPhoneNotFound();
			names.switchToNameEntry();
			names.nameEntry.switchToPhonesTab();
			names.nameEntry.phoneTab.SelectPhoneType();
			names.nameEntry.phoneTab.EnterWrongPhoneNumber();
			names.nameEntry.phoneTab.ClickAddButton();
			names.nameEntry.phoneTab.VerifyInvalidAcknowledgePhoneTab();
			names.switchToNameEntry();
			names.nameEntry.switchToPhonesTab();
			names.nameEntry.phoneTab.ClickClearButton();
			names.nameEntry.phoneTab.VerifyfieldsCleared();
		}


		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 5)
		public void NameEntryPhysicalTab_103323(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "103323");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToPhysicalTab();
			names.nameEntry.physicalTab.EnterHeight();
			names.nameEntry.physicalTab.EnterWeight_lbs();
			names.nameEntry.physicalTab.SelectEyeColor();
			names.nameEntry.physicalTab.SelectHairColor();
			names.nameEntry.physicalTab.SelectHairStyle();
			names.nameEntry.physicalTab.SelectFacialHair();
			names.nameEntry.physicalTab.SelectTeeth();
			names.nameEntry.physicalTab.SelectBuild();
			names.nameEntry.physicalTab.SelectCondition();
			names.nameEntry.physicalTab.ClickScarsMarksLookupButton();
			names.switchToNameEntry();
			names.nameEntry.physicalTab.EnterDescription();
			names.nameEntry.physicalTab.ClickAddButton();
			names.nameEntry.physicalTab.EnterChin();
			names.nameEntry.physicalTab.SelectComplexion();
			names.nameEntry.physicalTab.SelectHandicapped();
			names.nameEntry.physicalTab.SelectHand();
			names.nameEntry.physicalTab.EnterPhysicalDescription();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.verifyNameEntryPhysicalTabBlueColor();
			names.nameEntry.switchToPhysicalTab();
			names.nameEntry.physicalTab.VerifyValueAddedGrid();
			names.nameEntry.physicalTab.verifyLastEntryAsCurrentDate();
			
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 6)
		public void NameEntryPhysicalTab_103324(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "103324");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToPhysicalTab();
			names.nameEntry.physicalTab.EnterScarsMarksAsARTARM();
			names.nameEntry.physicalTab.ClickAddButton();
			names.nameEntry.physicalTab.VerifyValueAddedGrid();
			names.nameEntry.physicalTab.EnterScarsMarksAsARTARM();
			names.nameEntry.physicalTab.ClickAddButton();
			names.nameEntry.physicalTab.VerifyAcknowledgeDuplicationData();
			names.switchToNameEntry();
			names.nameEntry.physicalTab.ClickClearButton();
			names.switchToNameEntry();

		}
		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 4)
		public void NameEntryAliasTab_102373(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102373");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAliasTab();
			names.nameEntry.aliasTab.EnterAtLastName();
			names.nameEntry.aliasTab.EnterAtFirstName();
			names.nameEntry.aliasTab.VerifySuffixEnabled();
			names.nameEntry.aliasTab.ClickAddButton();
			names.nameEntry.aliasTab.VerifyAcknowledgeMainNameCannotBeAdd();
			names.switchToNameEntry();
			names.nameEntry.aliasTab.ClickClearButton();
			names.nameEntry.aliasTab.VerifyValueGetCleared();
			names.switchToNameEntry();
		}

		
		//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 5)
		public void NameEntryAliasTab_102374(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102374");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAliasTab();
			names.nameEntry.aliasTab.EnterAtLastNameasFirstName();
			names.nameEntry.aliasTab.EnterAtFirstNameasLastName();
			names.nameEntry.ClickSaveButton();
			names.nameEntry.aliasTab.VerifyAcknowledgeUpdateAliasTab();
			names.switchToNameEntry();
			names.nameEntry.aliasTab.ClickAddButton();
			names.nameEntry.aliasTab.VerifyAliasNameAddedToGrid();
			names.nameEntry.Save();
//			popup.confirm.yes(); // done by dinesh
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.switchToAliasTab();
			names.nameEntry.aliasTab.ClickDeleteIcon();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.switchToAliasTab();
			names.nameEntry.aliasTab.VerifyAliasNameDeleted();
			names.nameEntry.verifyNameEntryAliasTabBlackColor();
			
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 1)
		public void NameEntryActivityTab_102395(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102395");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();                         
			names.nameEntry.switchToActivityTab();                
			names.nameEntry.activityTab.ClickActivityCheckBox();   
			names.nameEntry.activityTab.VerifyCollapseMode();      
			names.nameEntry.activityTab.ClickCollapseAllCheckBox();
			names.nameEntry.activityTab.VerifyExpandMode();        
			names.switchToNameEntry();
		}


	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names .
		@Test(groups = { "namesFunctional2" }, priority = 6)
		public void NameEntryAddressTab_102376(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102376");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAddressesTab();
			names.nameEntry.nameEntryAddressesTab.EnterAddressAsMainAddress();
			names.nameEntry.nameEntryAddressesTab.TabAddressCheckBox();
			names.nameEntry.nameEntryAddressesTab.SelectType();
			names.nameEntry.nameEntryAddressesTab.ClickAddbutton();
			names.nameEntry.nameEntryAddressesTab.VerifyAcknowledgeMainAddress();
			names.switchToNameEntry();
			names.nameEntry.nameEntryAddressesTab.ClickClearButton();
			names.nameEntry.nameEntryAddressesTab.VerifyAllfieldsCleared();
			names.nameEntry.nameEntryAddressesTab.EnterAtAddress();
			names.nameEntry.nameEntryAddressesTab.TabAddressCheckBox(); // added by dinesh, issue detected.
			names.nameEntry.nameEntryAddressesTab.SelectType(); // added by dinesh
			names.nameEntry.ClickSaveButton();
			names.nameEntry.nameEntryAddressesTab.VerifyAcknowledgeUpdateAddressesTab();
			names.switchToNameEntry();
//			names.nameEntry.nameEntryAddressesTab.EnterCountryAsUS(); // done by dinesh
//			names.nameEntry.nameEntryAddressesTab.SelectType(); // done by dinesh
			names.nameEntry.nameEntryAddressesTab.ClickAddbutton();
			names.nameEntry.Save();
//			popup.confirm.yes(); // done by dinesh
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.verifyAddressesTabColourAsBlue();
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional2" }, priority = 7)
		public void NameEntryAddressTab_102381(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "102381");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAddressesTab();
			names.nameEntry.nameEntryAddressesTab.ClickDeleteIcon();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.Save();
//			popup.confirm.yes(); // done by dinesh
			names.switchToNameEntry();
			names.nameEntry.switchToAddressesTab();
			names.nameEntry.nameEntryAddressesTab.VerifyDeletedAddressNotFound(); // changes made in method level by mithun
			names.nameEntry.verifyAddressesTabColourAsBlack();
		}

	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameEntryAssociatesTab_104911(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 104911);
			String reportedOnDate = null;
			String reportedOnTime = null;
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.verifyNameEntryAssociatesTabBlackColor();
			names.nameEntry.switchToAssociatesTab();
			names.nameEntry.associateTab.EnterAtLastName();
			names.nameEntry.associateTab.EnterAtFirstName();
			names.nameEntry.associateTab.SelectName(); // changes made in method level by dinesh
			names.switchToNameEntry();
			names.nameEntry.switchToAssociatesTab();
			names.nameEntry.associateTab.ClickAddButton();
			names.nameEntry.associateTab.VerifyAcknowledgeMainName();
			names.switchToNameEntry();
			names.nameEntry.switchToAssociatesTab();
			names.nameEntry.associateTab.ClickClearButton(); // error might occure
			names.nameEntry.associateTab.EnterAtAssociateLastName();
			names.nameEntry.associateTab.EnterAtAssociatesFirstName();
			names.nameEntry.associateTab.SelectAssociateName(); // changes made in method level by diensh
			names.switchToNameEntry();
			names.nameEntry.switchToAssociatesTab();
			names.nameEntry.associateTab.EnterAtCaseNo();
			names.nameEntry.associateTab.GetReportedOn(reportedOnDate, reportedOnTime);
			names.nameEntry.associateTab.ClickCaseInfoButton();
			objectIdentification.windowHandle.switchToWindow("Case Update");
			objectIdentification.windowHandle.closeTheScreen();
			names.switchToNameEntry();
			names.nameEntry.switchToAssociatesTab();
			names.nameEntry.associateTab.EnterDate();
			names.nameEntry.associateTab.EnterComments();
			names.nameEntry.associateTab.ClickAddButton();
			names.switchToNameEntry();
			names.nameEntry.ClickSaveButton(); // altered by dinesh
			names.nameEntry.associateTab.VerifyAcknowledgeUpdateAssociateTab();
			names.switchToNameEntry();
			names.nameEntry.switchToAssociatesTab();
			names.nameEntry.associateTab.ClickSaveButton();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.switchToAssociatesTab();
			names.nameEntry.associateTab.VerifyUpdateSuccessfulStatusMessage();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.verifyNameEntryAssociatesTabBlueColor();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			
		}
		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameEntryBusinessTab_104936(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 104936);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToBusinessTab();
			names.nameEntry.businessTab.ClickAddButton();
			names.nameEntry.businessTab.VerifyAcknowledgeValidData(); // method level changes done by dinesh
			names.switchToNameEntry();
			names.nameEntry.switchToBusinessTab();
			names.nameEntry.businessTab.SelectBusinessType();
			names.nameEntry.businessTab.EnterBusinessID();
			names.nameEntry.businessTab.EnterAsInvalidEmail();
			names.nameEntry.businessTab.Save();
			names.nameEntry.businessTab.VerifyAcknowledgeEmail();
			names.switchToNameEntry();
			names.nameEntry.switchToBusinessTab();
			names.nameEntry.businessTab.EnterValidEmailId();
			names.nameEntry.businessTab.SelectLicenseType();
			names.nameEntry.businessTab.EnterLicenseNo();
			names.nameEntry.businessTab.ClickAddButton();
			names.switchToNameEntry();
			names.nameEntry.ClickSaveButton(); // modified by dinesh
			names.nameEntry.businessTab.VerifyAcknowledgeUpdateBusinessTab();
			names.switchToNameEntry();
			names.nameEntry.switchToBusinessTab();
			names.nameEntry.businessTab.Save();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.switchToBusinessTab();
			names.nameEntry.businessTab.VerifyAdditionSccessful();
			names.switchToNameEntry();
			names.nameEntry.SaveWithConfirmMessage();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameEntryCommentsTab_105069(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105069);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToCommentsTab();
			names.nameEntry.nameEntryCommentsTab.VerifyCurrentDate(); // error might occure.
			names.nameEntry.nameEntryCommentsTab.EnterComments();
			names.nameEntry.nameEntryCommentsTab.ClickEnterCommentsButton();
			popup.confirm.yes();
			names.switchToNamesCommentsScreen();
			names.nameEntry.namesComments.EnterRichtext();
			names.nameEntry.namesComments.ClickResetButton();
			names.nameEntry.namesComments.VerifyCommentStringDisappeard(); // error might occure.
			names.switchToNamesCommentsScreen();
			names.nameEntry.namesComments.Enter100WordsRichText();
			names.nameEntry.namesComments.Save();
			popup.confirm.yes();
			names.switchToNamesCommentsScreen();
			names.nameEntry.namesComments.VerifyAdditionSccessful();
			names.nameEntry.namesComments.SaveAndCloseScreen();
			names.switchToNameEntry();
			names.nameEntry.switchToCommentsTab();
			names.nameEntry.nameEntryCommentsTab.VerifyCurrentDate(); // error might occure.
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.switchToCommentsTab();
			names.nameEntry.nameEntryCommentsTab.VerifyMColumn(0);
			names.switchToNameEntry();
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameEntryCommentsTab_105070(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105070);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToCommentsTab();
			names.nameEntry.nameEntryCommentsTab.VerifyRowAvailableInGrid();
			names.nameEntry.nameEntryCommentsTab.DeleteComments();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			// names.nameEntry.ClickResetIcon();
			names.nameEntry.switchToCommentsTab();
//			names.nameEntry.nameEntryCommentsTab.clickDeleteColumnHead();
			names.nameEntry.nameEntryCommentsTab.VerifyDeletedCommentsNotFound();// error detected.
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
		}

	@Test
	public void NameEntryContactTab_104939(ITestContext testContext)// new enhancement
	{
		testContext.setAttribute("testID", 104939);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.SelectNameByID();
		names.switchToNameEntry();
		names.nameEntry.ClickAddressVerifyCheckBox();
		// names.nameEntry.nameEntryContactsTab.VerifyAttachmentTabDisabled(); New
		// Enhancement
		names.nameEntry.nameEntryContactsTab.VerifyContactTabDisabled();
		names.nameEntry.ClickAddressVerifyCheckBox();
		names.nameEntry.nameEntryContactsTab.VerifyAttachmentTabEnabled();
		names.nameEntry.nameEntryContactsTab.VerifyContactTabEnabled();
		names.nameEntry.switchToContactsTab();
		names.nameEntry.nameEntryContactsTab.ClickSave();
		names.nameEntry.nameEntryContactsTab.VerifyAcknowledgeMandatoryFieldsInContactsTab();
		names.switchToNameEntry();
		names.nameEntry.switchToContactsTab();
		names.nameEntry.nameEntryContactsTab.EnterAtContactsLastName();
		names.nameEntry.nameEntryContactsTab.EnterAtContactsFirstName();
		names.nameEntry.nameEntryContactsTab.SelectName();
		names.switchToNameEntry();
		names.nameEntry.switchToContactsTab();
		names.nameEntry.nameEntryContactsTab.SelectActivity();
		names.nameEntry.nameEntryContactsTab.ClickAddbutton();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.nameEntry.nameEntryContactsTab.VerifyAcknowledgeUpdateContactsTab(); // validation message not showing
		names.switchToNameEntry();
		names.nameEntry.switchToContactsTab();
		names.nameEntry.nameEntryContactsTab.ClickSave();
		popup.confirm.yes();
		names.switchToNameEntry();
		names.nameEntry.Save();
		popup.confirm.yes();
		names.switchToNameEntry();
	}

	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 7)
		public void NameEntryEmpSchoolTab_103326(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 103326);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.EnterAtLastName();
			names.nameEntry.empSchoolTab.SelectNameByName();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.ClickBNameInfoIcon();
			objectIdentification.windowHandle.switchToWindowUsingURL("NAMES");
			names.nameEntry.empSchoolTab.SwitchAllTabs();
			names.nameEntry.empSchoolTab.CloseBNameEntryWindow();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.SelectOccupation();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.SelectType();
			names.nameEntry.empSchoolTab.EnterComments();
			names.nameEntry.empSchoolTab.ClickAddButton();
			names.nameEntry.empSchoolTab.ClickUnemploymentCheckBox();
			names.nameEntry.empSchoolTab.ClickAddButton();
			names.switchToNameEntry();
			names.nameEntry.ClickSaveButton(); // method level changes made by dinesh.
			names.nameEntry.empSchoolTab.VerifyAcknowledgeUpdateEmpSchoolTab();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.SaveEmpSchoolTab();
			names.nameEntry.VerifyTabAdditionSuccessfulStatus();
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyAdditionSuccessfulStatusMessage();
		}

		//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional3" }, priority = 8)
		public void NameEntryEmpSchoolTab_104781(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 104781);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.EnterAtLastName();
			names.nameEntry.empSchoolTab.SelectNameByName();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.ClickAddButton();
			names.nameEntry.empSchoolTab.VerifyAcknowledgeMandatoryData();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.SelectOccupation();
			names.switchToNameEntry();
			names.nameEntry.switchToEmpSchoolTab();
			names.nameEntry.empSchoolTab.SelectType();
			names.nameEntry.empSchoolTab.ClickAddButton();
			names.nameEntry.empSchoolTab.SaveEmpSchoolTab();
			names.switchToNameEntry();
			names.nameEntry.VerifyTabAdditionSuccessfulStatus();
			names.nameEntry.empSchoolTab.VerifyAcknowledgeDuplicationData();
			names.switchToNameEntry();
			
		}

	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameEntryFamilyTab_104783(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 104783);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.verifyNameEntryFamilyTabBlackColor();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.EnterAtLastName();
			names.nameEntry.familyTab.EnterAtFirstName();
			names.nameEntry.familyTab.SelectNameByName(); // method altered by dinesh
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.ClickAddButton();
			names.nameEntry.familyTab.VerifyAcknowledgeMainName();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.ClickClearButton();
			names.nameEntry.familyTab.EnterAtBrotherLastName();
			names.nameEntry.familyTab.EnterAtBrotherFirstName();
			names.nameEntry.familyTab.SelectNameByName();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.ClickAddButton();
			names.nameEntry.familyTab.VerifyAcknowledgeMandatoryData();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.SelectRelationshipAsBrother();
			names.nameEntry.familyTab.SelectReciprocalRelationshipAsBrother();
			names.nameEntry.familyTab.EnterComments();
			names.nameEntry.familyTab.ClickAddButton();
			names.switchToNameEntry();
			names.nameEntry.ClickSaveButton();
			names.nameEntry.familyTab.VerifyAcknowledgeUpdateFamilyTab();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.Save();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.VerifyAdditionSuccessfulStatusMessage();  //change needed
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.verifyNameEntryFamilyTabBlueColor();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.EnterAtBrotherLastName();
			names.nameEntry.familyTab.EnterAtBrotherFirstName();
			names.nameEntry.familyTab.SelectNameByName();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.ClickAddButton();
			names.nameEntry.familyTab.VerifyAcknowledgeMandatoryData();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.SelectRelationship();
			names.nameEntry.familyTab.SelectReciprocalRelationship();
			names.nameEntry.familyTab.ClickAddButton();
			names.nameEntry.familyTab.VerifyAcknowledgeDuplicationData();
			names.switchToNameEntry();
			names.nameEntry.switchToFamilyTab();
			names.nameEntry.familyTab.Reset();
			names.switchToNameEntry();

		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameEntryVisitorsTab_105091(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105091);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToVisitorsTab();
			names.nameEntry.visitorsTab.EnterAtLastName();
			names.nameEntry.visitorsTab.EnterAtFirstName();
			names.nameEntry.visitorsTab.selectNameByName();// method altered by dinesh
			names.switchToNameEntry();
			names.nameEntry.switchToVisitorsTab();
			names.nameEntry.visitorsTab.SelectRelationship();
			names.nameEntry.visitorsTab.ClickAddButton();
			names.nameEntry.visitorsTab.VerifyAcknowledgeMainName();
			names.switchToNameEntry();
			names.nameEntry.switchToVisitorsTab();
			names.nameEntry.visitorsTab.ClickClearButton();
//			names.nameEntry.visitorsTab.VerifyAllfieldsCleared(); // method facing issue.
			names.nameEntry.visitorsTab.EnterAtVisitorLastName();
			names.nameEntry.visitorsTab.EnterAtVisitorFirstName();
			names.nameEntry.visitorsTab.selectNameByName();
			names.switchToNameEntry();
			names.nameEntry.switchToVisitorsTab();
			names.nameEntry.visitorsTab.SelectRelationship();
			names.nameEntry.visitorsTab.ClickAddButton();
			names.switchToNameEntry();
			names.nameEntry.ClickSaveButton(); // modified by dinesh
			names.nameEntry.visitorsTab.VerifyAcknowledgeUpdateVisitorTab();
			names.switchToNameEntry();
			names.nameEntry.switchToVisitorsTab();
			names.nameEntry.visitorsTab.Save();
			popup.confirm.yes();
			names.switchToNameEntry();
			names.nameEntry.switchToVisitorsTab();
			names.nameEntry.visitorsTab.VerifyUpdateSuccessfulStatusMessage(); // need to change
			names.switchToNameEntry();
			names.nameEntry.Save();
			names.switchToNameEntry();
			names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameMining_105102(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105102);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.ClickNameMineIcon();
			names.switchToNamesMiningScreen();
			names.nameMining.ClickPrintButton();
			home.switchToSelectReport();
			home.selectReport.VerifySelectReportScreenOpened();
			home.selectReport.CloseTheScreen();
			names.switchToNamesMiningScreen();
			names.switchToNameEntry();
		}

		// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void NameMining_105105(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105105);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.ClickPrintIcon();
			home.switchToSelectReport();
			home.selectReport.ClickNameDetailInGrid();
			home.switchToPnxReportSSRSPDFScreen(); // altration required
			home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
			home.switchToSelectReport();
			home.selectReport.CloseTheScreen();
			names.switchToNameEntry();
		}

		//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
		@Test(groups = { "namesFunctionalAttachment" })
		public void NameEntryAttachmentsTab_105073(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105073);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAttachmentsTab();
			names.nameEntry.attachmentsTab.clickAddFiles();
			names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
			names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verifyAddSingleFileRadioButtonIsSelected();
			names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectTextFile();
			names.nameEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			names.switchToNameEntry();
//			names.nameEntry.attachmentsTab.VerifyAddedAttachementExistInTheGrid();

		}

		//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
		@Test(groups = { "namesFunctionalAttachment" })
		public void NameEntryAttachmentsTab_105081(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105081);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAttachmentsTab();
			names.nameEntry.attachmentsTab.clickAddFiles();
			names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
			names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verifyAddBulkFileRadioButtonIsSelected();
			// Playback.driver.switchTo().alert().accept();
			popup.switchToMultiFilesAttachWindow();
			popup.multiFilesAttachWindow.SelectTextFile();
			popup.switchToMultiFilesAttachWindow();
			popup.multiFilesAttachWindow.SelectImgFile();
			popup.switchToMultiFilesAttachWindow();
			popup.multiFilesAttachWindow.ClickUpload();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			popup.multiFilesAttachWindow.Close();
			Playback.driver.switchTo().alert().accept();
			names.switchToNameEntry();

		}

		//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
		@Test(groups = { "namesFunctionalAttachment" })
		public void NameEntryAttachmentsTab_105087(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105087);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAttachmentsTab();
//			names.nameEntry.attachmentsTab.SelectRowCheckBox(4, 2);
			names.nameEntry.attachmentsTab.ClickDownloadSelectedFilesButton();
			names.switchToNameEntry();
			// WindowsControl.FileSavePopup.ClickSaveOptionDropdown();
			// WindowsControl.FileSavePopup.ClickSaveAsOption();
			// WindowsControl.FileBrowserWindow.EnterSaveFileName(Playback.GetTestDeployDirectoryPath(NamesTestContext)
			// + WindowsControl.FileBrowserWindow.GetFileName());
			// WindowsControl.FileBrowserWindow.ClickSave();
		}


		//Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 , Module:-Names . passed on 93.
		@Test(groups = { "namesFunctionalAttachment" })
		public void NameEntryAttachmentsTab_105088(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 105088);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToAttachmentsTab();
			names.nameEntry.attachmentsTab.deleteLastRowAndVerifyRowIsRemoved();
			names.switchToNameEntry();
		}

	@Test(groups = "jailCell", priority = 4)
	public void CellstatusVerifyableAddActivity_124081(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124081);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.SelectAtCellNo();
		names.cellStatus.SelectAllCheckBox();
		names.cellStatus.ClickCellUpdateButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickAddActivityButton();
		activity.SwitchToActivityEntry();
		// ActivityScripts.ActivityTestContext = NamesTestContext;
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutEnteredDateAndTime();
		activity.activityEntry.EnterSubjectAsTesting();
		activity.activityEntry.Save(); // error popup screen opened in our test DB.
		//activity.activityEntry.verifyAdditionSuccessfulBottomMessage();
		activity.activityEntry.verifyLogHistoryTbIsDisplayed();
		activity.activityEntry.verifyAttachmentTabIsDisplayed();
		activity.activityEntry.NavigateToLogHistoryTab();
		activity.activityEntry.logHistoryTab.verifyAthistoryGrid();//Having doubt 
		
		activity.activityEntry.Close();
		names.switchToCellStatusArrestEntryScreen();
		// names.cellStatusArrestEntry.CloseScreen();
	}

	@Test(groups = "jailCell", priority = 5)
	public void CellstatusPrintDetentionRecord_124083(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124083);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.ClickShowOnlyOccupiedCheckBox();
		names.cellStatus.SelectAtCellNo();
		names.cellStatus.SelectAllCheckBox();
		names.cellStatus.ClickCellUpdateButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickDetentionRecordButton();
		home.switchToSelectReport();
		home.selectReport.ClickDetentionRecordInGrid();
		home.switchToPnxReportSSRSPDFScreen();
		home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		names.switchToCellStatusArrestEntryScreen();
		// names.cellStatusArrestEntry.CloseScreen();

	}

	@Test(groups = "jailCell", priority = 6)
	public void CellstatusVerifyCellHistoryUpdated_124084(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124084);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.ClickShowOnlyOccupiedCheckBox();
		names.cellStatus.SelectAtCellNo();
		names.cellStatus.SelectAllCheckBox();
		names.cellStatus.ClickCellUpdateButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickCellCheckButton();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickPopupCategoryDetaineeMealButton();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyPopupDetaineeMealsColorGreen();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickPopupActivityMealCompletedButton();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterAtPopupNotes();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickPopupSave();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyPopupSaveButtonDisabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyPopupNewButtonEnabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickViewTodaysLog();
		activity.switchToActivitySearchHelpWindow();
		// ActivityScripts.ActivityTestContext = NamesTestContext;
		activity.activitySearchHelpWindow.verifyAtActivityType(0);
		activity.activitySearchHelpWindow.closeScreen();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickPopupCloseButton();
		names.switchToCellStatusArrestEntryScreen();
		// names.cellStatusArrestEntry.CloseScreen();

	}

	@Test(groups = "jailCell", priority = 7)
	public void CellstatusVerifyPerformBacktoCell_124085(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124085);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.ClickShowOnlyOccupiedCheckBox();
		names.cellStatus.SelectAtCellNo();
		names.cellStatus.SelectAllCheckBox();
		names.cellStatus.ClickCellUpdateButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.SelectAtTemproaryLocation();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterMovedDateAndTime();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyMovedDateAsCurrentDate();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterAtTempRemarks();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.SaveScreen();
		
		
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyBackToCellButtonEnabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickCellHistoryButton();
		activity.switchToActivitySearchHelpWindow();
		// ActivityScripts.ActivityTestContext = NamesTestContext;
		activity.activitySearchHelpWindow.verifyAtActivityType(0);
		activity.activitySearchHelpWindow.closeScreen();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.CloseScreen();
		names.switchToCellStatus();
		names.cellStatus.ClickShowOnlyOccupiedCheckBox();
		names.cellStatus.SelectAtCellNo();
		names.cellStatus.ClickRefreshButton();
		names.cellStatus.VerifyLastCheckAsBlank(0);
		names.cellStatus.VerifyNextCheckInMinsAtTempLocation(0);
		names.cellStatus.SelectRowAtCellNo();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickBackToCell();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyBackToCellButtonDisabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyTemporaryFieldsBlank();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickCellHistoryButton();
		activity.switchToActivitySearchHelpWindow();
		// ActivityScripts.ActivityTestContext = NamesTestContext;
		activity.activitySearchHelpWindow.verifyActivityTypeAsCellAssigned(0);
		activity.activitySearchHelpWindow.closeScreen();
		names.switchToCellStatusArrestEntryScreen();
		// names.cellStatusArrestEntry.CloseScreen();
	}

	@Test(groups = "jailCell", priority = 8)
	public void CellstatusVerifyabletofillForms_124087(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124087);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.SelectAtCellNo();
		names.cellStatus.SelectAllCheckBox();
		names.cellStatus.ClickCellUpdateButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickQAFormButton();
		qA.SwitchToQuestionDataEntry();
		qA.questionDataEntry.TabOutPF();
		qA.questionDataEntry.FillTheMentalIntakeQAForm();
		qA.questionDataEntry.SaveNClose();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.SaveScreen();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyAutoQAFormLinkLinkColor();
		names.switchToCellStatusArrestEntryScreen();
		// names.cellStatusArrestEntry.CloseScreen();
	}

	@Test(groups = "jailCell", priority = 9)
	public void CellstatusperformCellremoval_124088(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124088);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.ClickShowOnlyOccupiedCheckBox();
		names.cellStatus.SelectAtCellNo();
		names.cellStatus.SelectAllCheckBox();
		names.cellStatus.SelectRowAtCellNo();
		names.cellStatus.ClickCellUpdateButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickRemoveCheckBox();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyCustodyFieldsDisabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyCellAssignFieldsDisabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterRemovedByPF();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterRemovedDateAndTime();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyRemovedDateAsCurrentDate();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnteAtNotes();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.SaveScreen();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyCustodyFieldsDisabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyCellAssignFieldsDisabled();
		names.switchToCellStatusArrestEntryScreen();
		// names.cellStatusArrestEntry.CloseScreen();

	}

	@Test(groups = "jailCell", priority = 10)
	public void CellstatusassigncellfromArrestEntryScreen_124089(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124089);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.EnterAtCaseNo();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectArrestByAtCaseNo();
		names.switchToArrestEntry();
		names.arrestEntry.switchToCellTab();
		names.arrestEntry.arrestEntryCellTab.SelectCustodyReason();
		names.arrestEntry.arrestEntryCellTab.EnterCustodyAlert();
		names.arrestEntry.arrestEntryCellTab.SelectRiskLevel();
		names.arrestEntry.arrestEntryCellTab.EnterAtAssignCellNo();
		names.arrestEntry.arrestEntryCellTab.EnterAssignBy();
		names.arrestEntry.arrestEntryCellTab.EnterAssignDateandTime();
		names.arrestEntry.arrestEntryCellTab.SaveInternalTab();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.SelectAssignCellAtCellNo();
		names.cellStatus.VerifyAtDetaineeID(0);

	}

	@Test
	public void Police2018NamesModule_160509(ITestContext testContext) {
		testContext.setAttribute("testID", 160509);
		String nameType = null;
		String nameID = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.clickAddnewButton();
		names.switchToArrestEntry();
		names.arrestEntry.VerifyCasePopupAtName(0);
		names.arrestEntry.VerifyCasePopupAtName1(1);
		names.arrestEntry.ClickAtName1InPopupGrid();
		names.switchToNameEntry();
		names.nameEntry.SelectAtNameAS();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.VerifyPrimaryNameIDAtNameAs();
		names.nameEntry.GetNameTypeAndID(nameType, nameID);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToArrestEntry();
		names.arrestEntry.VerifyAtLastName();
		names.arrestEntry.VerifyAtFirstName();
		names.arrestEntry.VerifyNameTypeAndID(Playback.getTestContextAttribute("nameType"),
				Playback.getTestContextAttribute("nameID"));
		names.arrestEntry.closeTheScreen();
	}

	@Test
	public void Police2018NamesModule_160519(ITestContext testContext) {
		testContext.setAttribute("testID", 160519);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("FI Search");
		names.switchToFISearch();
		names.fISearch.ClickAddNew();
		names.switchToFIEntryScreen();
		names.fIEntry.EnterAtLocation();
		names.fIEntry.TabDateTime();
		names.fIEntry.TabOfficer();
		names.fIEntry.SelectFIActivity();
		names.fIEntry.SelectDisposition();
		names.fIEntry.SaveScreen();
		names.fIEntry.ClickAllTabs();
		names.fIEntry.switchToNamesTab();
		names.fIEntry.fIEntryNamesTab.EnterAtNameID();
		names.fIEntry.fIEntryNamesTab.EnterAtVehicle();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		names.switchToFIEntryScreen();
		names.fIEntry.switchToNamesTab();
		names.fIEntry.fIEntryNamesTab.ClickAddButton();
		names.fIEntry.fIEntryNamesTab.ClickSave();
		names.switchToFIEntryScreen();
		names.fIEntry.switchToNamesTab();
		names.fIEntry.fIEntryNamesTab.ClickAtNameInGrid();
		names.fIEntry.fIEntryNamesTab.VerifyAtNameID();
		names.fIEntry.fIEntryNamesTab.VerifyAtVehicle();
		names.fIEntry.fIEntryNamesTab.ClickNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToVehicleTab();
		names.nameEntry.nameEntryVehicleTab.SelectAtActivity(); // no details shows in Police NJ Automation DB
		names.nameEntry.nameEntryVehicleTab.VerifyAtActivityInGrid(0);
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToFIEntryScreen();
		names.fIEntry.CloseScreen();

	}

	@Test
	public void Police2018NamesModule_160537(ITestContext testContext) {
		testContext.setAttribute("testID", 160537);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		// VehicleScripts.VehicleTestContext = NamesTestContext;
		vehicle.vehicleBoatSearch.vehicleTab.enterAtPlate();
		vehicle.vehicleBoatSearch.vehicleTab.selectAtState();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.clickRowAtVinNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtNameActivity();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAssociationAsModified(0);
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.clickAtNameinGrid();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.clickNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToVehicleTab();
		names.nameEntry.nameEntryVehicleTab.SelectAtActivity();
		names.nameEntry.nameEntryVehicleTab.VerifyAtActivityInGrid(0);
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();

	}

	// Reworked by:- Dinesh , Date :- 2-11-2021 , Quarter:- Q4 , Sprint:- 3 ,
		// Module:-Names . passed on 93.
		@Test(groups = { "namesFunctional1" })
		public void Police2018NamesModule_160543(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", 160543);
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.SelectAtNameType();
			names.nameSearch.enterAtNameID();
			names.nameSearch.clickSearchButton();
			names.nameSearch.SelectNameByID();
			names.switchToNameEntry();
			names.nameEntry.switchToContactsTab();
			names.nameEntry.nameEntryContactsTab.ClickAddNew();
			geo.switchToContactEntry();
			geo.contactEntryScreen.SelectAtNameRelation();
			geo.contactEntryScreen.EnterAndSelectAtATypeName();
			geo.switchToContactEntry();
			geo.contactEntryScreen.SaveCloseScreen();
			names.switchToNameEntry();
			names.nameEntry.switchToContactsTab();
			names.nameEntry.nameEntryContactsTab.SaveContactTab();
			names.switchToNameEntry();
			names.nameEntry.switchToContactsTab();
			names.nameEntry.nameEntryContactsTab.VerifyAtNameUsingByNameRelation();
			names.switchToNameEntry();
			names.nameEntry.ClickAddressInfoButton();
			geo.switchToAddressSearchHelpWindow();
			geo.addressSearch.switchToContactsTab();
			geo.addressSearch.addressSearchContactTab.VerifyAtNameInTheGrid(0);
			geo.switchToAddressSearchHelpWindow();
			geo.addressSearch.CloseScreen();
			names.switchToNameEntry();
//			names.nameEntry.ClickSaveButton();
//			names.nameEntry.VerifySaveConfirmMessage();
//			names.nameEntry.Verify6031ConfirmMessage(); // error detected by dinesh
//			names.switchToNameEntry();
//			names.nameEntry.closeTheScreen();

		}

	@Test
	public void Police2018NamesModule_160544(ITestContext testContext) {
		testContext.setAttribute("testID", 160544);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtNameRowColorAsJunvenile();
		names.nameSearch.VerifyAtName1RowColorAsAlias();
		names.nameSearch.ClickAddNewButton();
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.TabMiddleName();
		names.switchToNameSearchPopupScreen();
		names.nameSearchPopupScreen.VerifyAtNameIDRowColorAsJunvenile();
		names.nameSearchPopupScreen.CloseScreen();
		names.switchToNameEntry();
		names.nameEntry.ClickResetIcon();
		names.nameEntry.EnterAtLastName1();
		names.nameEntry.EnterAtFirstName1();
		names.nameEntry.TabMiddleName();
		names.switchToNameSearchPopupScreen();
		names.nameSearchPopupScreen.VerifyAtName1RowColorAsAlias(); // issue reported
		names.nameSearchPopupScreen.CloseScreen();
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.clickAddnewButton();
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.VerifyAtLastNameAndFirstNameJunvenileColor(); // color was not changed in our DB
		names.arrestEntry.closeTheScreen();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();

	}

	@Test
	public void Police2018NamesModule_160546(ITestContext testContext) {
		testContext.setAttribute("testID", 160546);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.ClickPhotoLineIcon();
		names.switchToPhotoLineupScreen();
		names.photoLineupEntry.VerifyAtNameID();
		names.photoLineupEntry.ClickSearchButton();
		names.photoLineupEntry.VerifyBuildLineupButtonEnabled();
		names.photoLineupEntry.ClickBuildLineupButton();
		names.switchToBuildPhotoLineupScreen();
		names.buildPhotoLineup.ClickAutoRandomImagesButton();
		names.buildPhotoLineup.VerifyAllFieldsFiledImages();
		names.buildPhotoLineup.EnterAtOfficer();
		names.buildPhotoLineup.EnterDateAsCurrentDate();
		names.buildPhotoLineup.ClickSaveAndViewPDFButton();
		names.buildPhotoLineup.VerifyCompleteLineUpAcknowledgeMessage();
		home.switchToSelectReport();
		home.selectReport.ClickPhotoLineupReportInGrid();
		home.switchToPnxReportSSRSPDFScreen();
		home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		names.switchToBuildPhotoLineupScreen();
		names.buildPhotoLineup.CloseScreen();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165754(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165754);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryONameID();
		names.nameMerge.VerifyAtPrimaryLastName();
		names.nameMerge.VerifyAtPrimaryFirstName();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeANameID();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyOTypeNameAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeBNameID();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyOTypeNameAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeJNameID();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyOTypeNameAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeONameID();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.VerifyAtMergeONameIDInGrid(0);
		names.nameMerge.ClickSelectAllCheckBox();
		names.switchToNameMerge();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165755(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165755);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryANameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeONameID();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.VerifyAtMergeONameIDInGrid(0);
		names.nameMerge.SelectMergeONameIDCheckbox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickRaceRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickEthnicRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();

		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.nameEntryMainTab.VerifyAtRace();
		names.nameEntry.nameEntryMainTab.VerifyAtEthnic();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165756(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165756);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryANameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeBNameID();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyConfirmAdultBusinessNameWarningMessage();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165757(ITestContext testContext) {	
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165757);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryANameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeJNameType();
		popup.switchToAcknowledge();
		names.nameMerge.VerifyInvalidJTypeNameAcknowledgeMessage();
		names.switchToNameMerge();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165758(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165758);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryANameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtLastName();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.VerifyAtMergeANameIDInGrid(0);
		names.nameMerge.SelectMergeANameIDCheckbox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickRaceRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickEthnicRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickDOBRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.nameEntryMainTab.VerifyAtRace();
		names.nameEntry.nameEntryMainTab.VerifyAtBirthDate();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165759(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165759);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryJNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtLastName();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.VerifyAtMergeONameIDInGrid(0);
		names.nameMerge.SelectMergeONameIDCheckbox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickRaceRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickEthnicRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickSexRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.nameEntryMainTab.VerifyAtRace();
		names.nameEntry.nameEntryMainTab.VerifyAtEthnic();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165760(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165760);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryJNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeBNameID();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyConfirmJuvenileBusinessNameWarningMessage();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165761(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165761);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryJNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeANameType();
		popup.switchToAcknowledge();
		names.nameMerge.VerifyInvalidATypeNameAcknowledgeMessage();
		names.switchToNameMerge();
	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165762(ITestContext testContext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165762);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryJNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtLastName();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.VerifyAtMergeJNameIDInGrid(0);
		names.nameMerge.SelectMergeJNameIDCheckbox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickRaceRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickEthnicRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickSexRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickDOBRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.nameEntryMainTab.VerifyAtRace();
		names.nameEntry.nameEntryMainTab.VerifyAtBirthDate();
		names.nameEntry.nameEntryMainTab.VerifyAtSex();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165763(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165763);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryBNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeANameID();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyConfirmBusinessNameAdultMessage();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickAddressRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickPhoneCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtAddress();
		names.nameEntry.VerifyAtPhone();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165764(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165764);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryBNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtLastName();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.VerifyAtMergeJNameIDInGrid(0);
		names.nameMerge.SelectMergeJNameIDCheckbox();
		names.nameMerge.VerifyConfirmBusinessNameJuvenileMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyConfirmBusinessNameJuvenileMessage();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickAddressRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickPhoneCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtAddress();
		names.nameEntry.VerifyAtPhone();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165765(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165765);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryBNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeONameID();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickAddressRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtAddress();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCountry(0);
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165766(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165766);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryBNameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtLastName();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.VerifyAtMergeBNameIDInGrid(0);
		names.nameMerge.SelectMergeBNameIDCheckbox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickAddressRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickBusinessIDCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickBusinessTypeCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtAddress();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.switchToBusinessTab();
		names.nameEntry.businessTab.VerifyAtBusinessID();
		names.switchToNameEntry();

	}

	@Test(groups = { "nameMerge" })
	public void NameMergeFunctionality_165767(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 165767);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryANameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtLastName();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.ClickSelectAllCheckBox();
		names.nameMerge.VerifyConfirmAdultBusinessNameWarningMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickMergeButton();
		names.nameMerge.VerifyConfirmAdultBusinessNameWarningMessage();
		Playback.threadWait(20000);
		Playback.controlReadyThreadWait();
		popup.switchToAcknowledge();
		names.nameMerge.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.aliasTab.VerifyAtAliasesName1(1);
		names.nameEntry.aliasTab.VerifyAtAliasesName2(2);
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
		names.nameEntry.nameEntryAddressesTab.VerifyAtCSZ(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();

	}

	@Test(groups = { "2020DefectNameSearch" })
	public void Police2020NamesModule_243289(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 243289);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsB();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToContactsTab();
		names.nameEntry.nameEntryContactsTab.ClickAddNew();
		geo.switchToContactEntry();
		Playback.gridLoadThreadWait();
		geo.contactEntryScreen.SelectAtNameRelation();
		geo.contactEntryScreen.enterAtLastName();
		geo.contactEntryScreen.enterAtFirstName();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		geo.switchToContactEntry();
		geo.contactEntryScreen.ClickNotSharedCheckBox();
		geo.contactEntryScreen.SelectPhoneType1AsHome();
		geo.contactEntryScreen.EnterPhoneNumber1();// Changed
		geo.contactEntryScreen.SelectPhoneType2AsWork();
		geo.contactEntryScreen.EnterPhoneNumber2();// Changed
		geo.contactEntryScreen.EnterNotes();
		geo.contactEntryScreen.ClickInActiveDateCheckBox();
		geo.contactEntryScreen.SaveScreen();
		geo.switchToContactEntry();
		geo.contactEntryScreen.CloseScreen();
		names.switchToNameEntry();
		names.nameEntry.switchToContactsTab();
		names.nameEntry.nameEntryContactsTab.SaveContactTab();
		names.switchToNameEntry();
		names.nameEntry.switchToContactsTab();
		names.nameEntry.nameEntryContactsTab.ClickIncludeInactiveCheckbox();
		names.nameEntry.nameEntryContactsTab.VerifyAtNameUsingByNameRelation();

	}

	@Test(groups = { "2020DefectArrest" })
	public void Police2020NamesModule_243290(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "243290");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");

		names.switchToArrestSearch();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.EnterAtArrestNo();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.VerifyStatusOnHoldUsingCaseNo();
		names.arrestSearch.SelectArrestByAtCaseNo();

		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.VerifyAtOfficer1();
		names.switchToArrestEntry();
		names.arrestEntry.switchToApprovalTab();
		names.arrestEntry.arrestEntryApprovalTab.selectActionAsSendForApproval();
		names.arrestEntry.arrestEntryApprovalTab.TabDateTime();
		names.arrestEntry.arrestEntryApprovalTab.SaveInternalTab();
		names.switchToArrestEntry();
		names.arrestEntry.VerifyStatusAsSubmitted();
		names.arrestEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportApprovalTab();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.SelectAtItemType();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyAtOfficerInColumnValues();
		home.myHome.myReportsTab.VerifyAtRefNo();

	}

	@Test(groups = { "2020DefectTestCases" }) // Mahesha
	public void Police2020NamesModule_247897(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 247897);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickAddNewButton();
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.nameEntry.nameEntryMainTab.SelectAtSex();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.SelectAtResident();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtNameType();

	}

	@Test(groups = { "2020DefectNameSearch" }) // Mahesha
	public void Police2020NamesModule_247899(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 247899);
		String nameType = null;
		String nameID = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickAddNewButton();
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.enterAtMiddleName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.nameEntry.nameEntryMainTab.SelectAtSex();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.SelectAtResident();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtNameType();
		names.nameEntry.GetNameTypeAndID(nameType, nameID);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.ClickNameMergeIcon();
		names.switchToNameMerge();
		names.nameMerge.VerifyPrimaryNameID(Playback.getTestContextAttribute("nameType"),
				Playback.getTestContextAttribute("nameID"));
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtLastName1();
		names.nameMerge.EnterAtFirstName1();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.ClickSelectAllCheckBox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickRaceRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickEthnicRowCheckbox();
		//// names.nameMerge.nameMergeScreenDetailsPopup.ClickDOBRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();

	}

	@Test(groups = { "2020DefectExpungement" })
	public void Police2020NamesModule_247902(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 247902);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtNameUsingLastNameFirstName(0);
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtNameTypeAndID();
		names.nameEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();

		loader.navigateToScreen("Expungement");
		names.switchToExpungement();
		names.expungement.EnterAtNameID();

		names.expungement.SelectTypeAsExpungement();
		names.expungement.EnterReason();
		names.expungement.DeleteAtArrestBookingRow();
		names.expungement.VerifyDeleteExpungementConfirmMessage();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.BackToExpungement();
		popup.switchToAcknowledge();
		names.expungement.VerifyNoActivitiesAcknowledgeMessage();
		names.expungement.VerifyExpungeCompletedAcknowledgeMessage1();
		names.BackToExpungement();

		names.expungement.SelectTypeAsExpungement();
		names.expungement.EnterReason();
		names.expungement.deleteAtActivityNoInGrid();
		names.expungement.VerifyDeleteNameConfirmWindowMessage();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.BackToExpungement();
		names.expungement.EnterReason();
		names.expungement.ClickDeleteNameButton();
		names.expungement.VerifyDeleteNameConfirmWindowMessage();
		popup.switchToAcknowledge();
		names.expungement.VerifyExpungeCompletedAcknowledgeMessage();
		names.expungement.VerifyDeletionDeniedAcknowledgeMessage();
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.ClickExpungementActivityButton();
		names.switchToExpungementSearchHelpScreen();
		names.expungementSearch.verifyAtNameTypeID();
	}

	@Test(groups = { "2020DefectNameSearch" })
	public void Police2020NamesModule_247940(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 247940);
		String nameType = null;
		String nameID = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		/*
		 * loader.navigateToModule("Settings");
		 * loader.navigateToScreen("System Parameter");
		 * settings.switchToSystemParamter();
		 * settings.sysParameter.setSystemparameter641AsTrue();
		 */
		objectIdentification.windowHandle.switchToMainWindow();
		String mainHandle = objectIdentification.windowHandle.getMainWindowHandle();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsJ();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtNameUsingLastNameFirstName(0);
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtNameTypeAndID();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.VerifyAtWeight();
		names.nameEntry.physicalTab.VerifyAtHeight();

		String oldHandle = names.nameEntry.getWindowHandle();
		names.nameEntry.ClickCreateAdultNameButton();
		names.switchToAdultNameEntryScreen(oldHandle, mainHandle);
		names.nameEntry.VerifyAtNameType();
		names.nameEntry.verifyViewJuvenileNameButtonViewed();
		names.nameEntry.GetNameTypeAndID(nameType, nameID);
		names.nameEntry.closeTheScreen();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.verifyViewAdultNameButtonViewed();
		names.nameEntry.verifyDeleteNameLinkIconViewed();
		names.nameEntry.ClickDeleteNameLinkButton();
		names.nameEntry.verifyRemoveNameLinkConfirmationMessage();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToNameSearch();
		names.nameSearch.ClickAtNameID();

		names.nameEntry.clickOkOnAdultLinkPopup();

		names.switchToNameEntry();

		String oldHandle1 = names.nameEntry.getWindowHandle();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.VerifyAtJacketNo();
		names.nameEntry.ClickViewAdultNameButton();

		names.switchToAdultNameEntryScreen(oldHandle1, mainHandle);

		names.nameEntry.VerifyAtNameType();
		names.nameEntry.verifyViewJuvenileNameButtonViewed();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.VerifyAtJacketNo();
		names.nameEntry.nameEntryMainTab.VerifyAtSSNo();
		// names.nameEntry.nameEntryMainTab.VerifySSNoDuplicateConfirmationMessage();
		names.nameEntry.SaveWithConfirmMessage();
		Playback.controlReadyThreadWait();
		names.switchToAdultNameEntryScreen(oldHandle1, mainHandle);
		names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		names.nameEntry.nameEntryMainTab.EnterFBINumber();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToAdultNameEntryScreen(oldHandle1, mainHandle);
		names.nameEntry.closeTheScreen();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter641AsFalse();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickClearIcon();
		names.nameSearch.SelectNameTypeAsAdult();
		names.nameSearch.EnterNameTypeAndNameID(Playback.getTestContextAttribute(nameType),
				Playback.getTestContextAttribute(nameID));
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtNameUsingLastNameFirstName(0);
		names.nameSearch.ClickAtName();
		names.switchToNameEntry();
		names.nameEntry.VerifyAtNameType();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.SelectHairColor();
		names.nameEntry.physicalTab.SelectHairLength();
		names.nameEntry.ClickSaveButton();
		names.nameEntry.nameEntryMainTab.VerifySSNoDuplicateConfirmationMessage();
		names.switchToNameEntry();
	}

	@Test(groups = { "2020DefectArrest" }) // Vijay
	public void ChargeStatusNotUpdatingInTheBooking_250435(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250435");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter1704AsTrue();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.ClickPopupGridCheckboxUsingAtCharge();
		names.arrestEntry.ClickPopupGridCheckboxUsingAtCharge1();
		names.arrestEntry.ClickPopupCopyButton();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.SelectAtArmed();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.VerifyingStatusIsEmpty(0);
		names.arrestEntry.chargeTab.VerifyingStatusIsEmpty(1);
		names.arrestEntry.chargeTab.ClickAtChargeInGrid();
		names.arrestEntry.chargeTab.TabTheCount();
		names.arrestEntry.chargeTab.selectAtStatus();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.chargeTab.ClickAtCharge1InGrid();
		names.arrestEntry.chargeTab.TabTheCount();// As per review comments, changed..
		names.arrestEntry.chargeTab.selectAtStatus();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
	}

//July Sprint 2 Automated By Mahesha
	@Test(groups = { "2020DefectNameSearch" })
	public void PoliceDefect2020VerifySMTPconfigurationForNotificationEmail_250096(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250096");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();

// scenario--1

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter203AsBlank();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter204AsBlank();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter205AsBlank();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter220AsBlank();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();

		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.clickEmailNotifyIcon();
		home.switchToNotificationScreen();
		home.notification.ClickDistributionListRadioButton();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.clickAddButton();
		home.notification.SaveScreen();
		home.notification.VerifySuccessfulBottomMessage();
		home.notification.CloseScreen();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();

		// scenario--2 loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter203AsBlank();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter204AsBlank();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter205AsBlank();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter220AsWebServerURL();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.reloadNameSearch();
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID1();
		names.nameSearch.clickSearchButton();
		names.nameSearch.clickAtNameID1();
		names.switchToNameEntry();
		names.nameEntry.clickEmailNotifyIcon();
		home.switchToNotificationScreen();
		home.notification.ClickDistributionListRadioButton();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.clickAddButton();
		home.notification.SaveScreen();
		home.notification.VerifySuccessfulBottomMessage();
		home.notification.CloseScreen();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();

// scenario--3

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();

		settings.sysParameter.setSystemparameter203AsSMTPserver();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter204AsSMTPuser();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter205AsSMTPpassword();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter220AsBlank();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.reloadNameSearch();
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID2();
		names.nameSearch.clickSearchButton();
		names.nameSearch.clickAtNameID2();
		names.switchToNameEntry();
		names.nameEntry.clickEmailNotifyIcon();
		home.switchToNotificationScreen();
		home.notification.ClickDistributionListRadioButton();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.clickAddButton();
		home.notification.SaveScreen();
		home.notification.VerifySuccessfulBottomMessage();
		home.notification.CloseScreen();

	}

	@Test(groups = { "2020DefectExpungement" }) // Raga Ranjani

	public void Police2020DefectNamesModule_254471(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254471");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.selectOfficer1ID();
		names.switchToArrestEntry();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectAtStatus();
		names.arrestEntry.chargeTab.selectAtAgencyAction();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.verifyBioMetricIconDisplayed();
		names.arrestEntry.verifyEACCSubmissionIconDisplayed();
		names.arrestEntry.verifyMugsearchIconDisplayed();
		names.arrestEntry.verifyPictureInterfaceIconDisplayed();
		names.arrestEntry.verifySendDataToPreBookingQueueIconDisplayed();
		names.arrestEntry.verifyExpungementIconDisplayed();
		names.arrestEntry.clickExpungementIcon();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickOneOrMoreCharge();
		names.arrestExpungement.enterReason();
		names.arrestExpungement.clickExpungeButton();
		names.arrestExpungement.clickYesExpungeButton();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickCloseButton();

		loader.navigateToScreen("Expungement Search");
		names.switchToExpungementSearchScreen();
		names.expungementSearch.clickSearchButton();
		names.expungementSearch.verifyAtNameTypeID();
	}

	@Test(groups = { "2020DefectArrest" })
	public void PoliceDefect2020ArrestEntry_250436(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250436");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.selectallChrageCheckPopup();
		names.arrestEntry.verifyStatusInPopupGrid(0);
		names.arrestEntry.ClickPopupCopyButton();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.enterAtOfficer1();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.ClickAtChargeInGrid();
		names.arrestEntry.chargeTab.EnterCountAs1();
		names.arrestEntry.chargeTab.selectAtStatus();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.chargeTab.ClickAtCharge1InGrid();
		names.arrestEntry.chargeTab.EnterCountAs2();
		names.arrestEntry.chargeTab.selectAtStatus();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.VerifyAtStatusInGrid(0);
		names.arrestEntry.chargeTab.VerifyAtStatusInGrid(1);

	}

	@Test(groups = { "2020DefectNameSearch" }) // Raja Sadaraj
	public void Police2020NamesModule_256401(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 256401);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryANameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeNameID();
		names.nameMerge.VerifyAtMergeNameID();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.ClickSelectAllCheckBox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickRaceRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickDOBRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.clickJacketNoRowCheckbox();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.ClickPrimaryNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToAliasTab();
		names.nameEntry.aliasTab.VerifyAtAliasesName(0);
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToNameMerge();
		names.nameMerge.verifyMergeHistoryButtonenabled();
		names.nameMerge.clickMergeHistory();
		names.nameMerge.verifyUnMergeCancelButtonenabled();
		names.nameMerge.clickUnMergeCancel();
		names.switchToNameMerge();
		names.nameMerge.verifyMergeHistoryButtonenabled();
		names.nameMerge.clickMergeHistory();
		names.nameMerge.verifyAtMergeNameIDInUnMergeGrid(0);
		names.nameMerge.verifyAtNameInUnMergeGrid(0);
		names.nameMerge.verifyAtMergedPFInUnMergeGrid(0);
		names.nameMerge.clickAtMergedIDRowCheckbox();
		names.nameMerge.verifyUnMergeButtonenabled();
		names.nameMerge.clickUnMergebutton();
		names.nameMerge.verifyUnNameMergeConfirmMessage();
		popup.switchToAcknowledge();
		names.nameMerge.verifyUnmergedCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.verifyNameunmergedSuccessfulMessage();

	}

	@Test(groups = { "2020DefectNameSearch" }) // Automated by Stalin
	public void GunPermitInquiryscreen_255119(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "255119");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Gun Permit Search");
		names.switchToGunPermitSearch();
		names.gunPermitSearch.selectAtPermitType();
		names.gunPermitSearch.SelectAtGunType();
		names.gunPermitSearch.ClickSearchButton();
		names.gunPermitSearch.verifyAtGunPermit();
		names.gunPermitSearch.VerifyAtGunType(0);
		names.gunPermitSearch.VerifyPermitStatusAsApproved(0);
		names.gunPermitSearch.verifyAtOwner();
		names.gunPermitSearch.verifyAtGunMake();
		names.gunPermitSearch.verifyAtApplicationDate();
		names.gunPermitSearch.VerifyAtSerialNo(0);
		names.gunPermitSearch.ClickAddNewButton();
		names.switchToGunPermitEntry();
		names.gunPermitEntry.enterAtNameID();
		names.gunPermitEntry.ClickReset();
		names.switchToGunPermitEntry();
		names.gunPermitEntry.enterAtNameID();

		names.gunPermitEntry.selectAtPermitType();
		names.gunPermitEntry.selectAtPermitStatus();
		names.gunPermitEntry.SaveScreen();
		names.switchToGunPermitEntry();

	}

	@Test(groups = { "2020DefectNameSearch" }) // Automated by Stalin
	public void VisitorIDActivitytab_256410(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256410");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.ClickVisitorIcon();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.TabOutActivityToDateAndTime();
		activity.activityEntry.enterAtLocation();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.ClickAddButton();
		activity.activityEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.ClickResetIcon();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.VerifyAtActivityType();
		names.nameEntry.activityTab.verifyAtLocation();
		names.nameEntry.closeTheScreen();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtLastName();
		activity.activityEntry.activityEntryVisitorsTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.ClickAddButton();
		activity.activityEntry.Save();
		activity.activityEntry.NavigateToVisitorsTab();
		activity.activityEntry.activityEntryVisitorsTab.clickAtName1InGrid();
		activity.activityEntry.activityEntryVisitorsTab.ClickNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.VerifyAtActivityType();
		names.nameEntry.activityTab.verifyAtLocation();

	}

	@Test(groups = { "2020DefectNameSearch" }) // Automated by Stalin
	public void ControlInquiryScreen_256412(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256412");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.enterAtMiddleName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameInGrid();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameInGrid();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.SelectAtNameType1();
		names.nameSearch.enterAtLastName1();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameID1InGrid();
		names.nameSearch.verifyAtName1InGrid();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.SelectAtNameType2();
		names.nameSearch.enterAtLastName1();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameID2InGrid();
		names.nameSearch.verifyAtName2InGrid();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.SelectAtNameType3();
		names.nameSearch.enterAtLastName1();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameID3InGrid();
		names.nameSearch.verifyAtName3InGrid();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.SelectAtNameType4();
		names.nameSearch.enterAtLastName1();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameID4InGrid();
		names.nameSearch.verifyAtName4InGrid();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.clickSoundAlikeCheckBox();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameInGrid();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.enterAtMiddleName();
		names.nameSearch.clickSoundAlikeCheckBox();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifySoundAlikeFeatureAckwMsg();
		names.switchToNameSearch();

	}

	@Test(groups = { "2020DefectExpungement" }) // Automated by Stalin
	public void Authenticationprocessisworkingfine_256413(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256413");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Expungement");
		names.switchToExpungement();
		names.expungement.EnterAtNameID();
		names.expungement.selectAtType();
		names.expungement.EnterReason();
		names.expungement.deleteAtActivityRow();
		popup.confirm.yes();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtInvalidPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.expungement.verifyInvalidUserNamePassAckMsg();
		names.BackToExpungement();
		names.expungement.deleteAtSelectedActivityRow();
		popup.confirm.yes();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.expungement.verifyDeletionSuccessfullyAckMsg();
		names.BackToExpungement();

	}

//Oct Sprint 1 Automated By Mahesha
	@Test(groups = { "2020DefectNameSearch" })
	public void NameInquirySearchWithDOBDetail_256402(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256402");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		// scenario 1
		names.switchToNameSearch();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.EnterAtDOB();
		names.nameSearch.clickMoTab();
		names.nameSearch.nameSearchMOTab.selectAtDetails();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyNoRecordFoundAcknowledgeMessage();
		names.nameSearch.reloadNameSearch();
		// scenario 2
		names.switchToNameSearch();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtDOB();
		names.nameSearch.clickMoTab();
		names.nameSearch.nameSearchMOTab.selectAtDetails();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyNoRecordFoundAcknowledgeMessage();
		names.switchToNameSearch();
	}

//Oct Sprint 1 Automated By Mahesha
	@Test(groups = { "2020DefectNameSearch2" })
	public void NameInquirySearchWithNameDOBPlate_256403(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256403");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter659AsAdult();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		// scenario 1
		names.switchToNameSearch();
		names.nameSearch.verifyAtNameType();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.EnterAtDOB();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtName(0);
		names.nameSearch.ClickBackButton();
		names.nameSearch.reloadNameSearch();

		names.switchToNameSearch();
		names.nameSearch.verifyAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtDOB();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtName(0);
		names.nameSearch.ClickBackButton();
		names.nameSearch.reloadNameSearch();

		names.switchToNameSearch();
		names.nameSearch.verifyAtNameType();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.enterAtMiddleName();
		names.nameSearch.EnterAtDOB();
		names.nameSearch.ClickAdvancedTab();
		names.nameSearch.nameSearchAdvancedTab.enterAtPlateNo();
		names.nameSearch.nameSearchAdvancedTab.selectAtPlateState();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtName(0);
		names.nameSearch.ClickBackButton();
		names.nameSearch.reloadNameSearch();

		// scenario 2
		names.switchToNameSearch();
		names.nameSearch.verifyAtNameType();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.enterRandomDateAtDOB();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyNoRecordFoundAcknowledgeMessage();
		names.nameSearch.reloadNameSearch();

		names.switchToNameSearch();
		names.nameSearch.verifyAtNameType();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.enterAtMiddleName();
		names.nameSearch.enterRandomDateAtDOB();
		names.nameSearch.ClickAdvancedTab();
		names.nameSearch.nameSearchAdvancedTab.enterAtPlateNo();
		names.nameSearch.nameSearchAdvancedTab.selectAtPlateState();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyNoRecordFoundAcknowledgeMessage();

		// setting back Sys parameter
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter659AsNull();
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
	}

//Oct Sprint 1 Automated By Mahesha
	@Test(groups = { "2020DefectNameEntry" })
	public void CreatedDateTimeInNameEntryScreen_256404(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256404");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		// scenario 1
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAdultDOB();
		names.nameEntry.verifyNameTypeAutoBindedAsA();
		names.nameEntry.nameEntryMainTab.ClickClearDOBButton();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.nameEntry.nameEntryMainTab.verifyConfirmatiomToCreateJuvenileRecord();
		names.switchToNameEntry();
		names.nameEntry.verifyNameTypeAutoBindedAsJ();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.SelectAtSex();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.VerifyNameCreatedDateAndOfficer();
		names.nameEntry.closeTheScreen();
		// scenario 2
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterNameIDAsB();
		names.nameEntry.EnterAtLastName1();
		names.nameEntry.verifyFirstNameAndMiddleNameDisabled();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.VerifyNameCreatedDateAndOfficer();
		names.nameEntry.closeTheScreen();
		// scenario 3
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterNameIDAsO();
		names.nameEntry.enterAtLastName2();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.VerifyNameCreatedDateAndOfficer();

	}

//Oct Sprint 1 Automated By Mahesha
	@Test(groups = { "2020DefectNameSearch2" })
	public void VerifyThatNameInquiryMouseHoverFunctionality_256405(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		ArrayList<String> cellValues;
		testContext.setAttribute("testID", "256405");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		cellValues = names.nameSearch.mouserHoverAtNameAndVerifyActivities();
		names.nameSearch.ClickAtName();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.verifyActivityAndDateInGrid(cellValues);
	}

	// July Sprint 2 Automated By Mahesha
	@Test(groups = { "2020DefectNameSearch2" })
	public void PoliceDefect2020VerifySMTPconfigurationForNotificationEmail_250160(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250160");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();

		// scenario--1

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		// settings.sysParameter.setSystemparameter203AsSMTPserver();
		settings.sysParameter.setSystemparameter221AsNotificationFrom();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();

		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.clickEmailNotifyIcon();
		home.switchToNotificationScreen();
		home.notification.ClickDistributionListRadioButton();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.clickAddButton();
		home.notification.SaveScreen();
		home.notification.VerifySuccessfulBottomMessage();
		home.notification.CloseScreen();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();

		// scenario--2
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		// settings.sysParameter.setSystemparameter203AsSMTPserver();
		settings.sysParameter.setSystemparameter204AsSMTPuserGmai();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter205AsSMTPpassword();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter206AsFromID();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter221AsNotificationFrom();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter220AsWebServerURL();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickBackButton();
		names.nameSearch.enterAtNameID1();
		names.nameSearch.clickSearchButton();
		names.nameSearch.clickAtNameID1();
		names.switchToNameEntry();
		names.nameEntry.clickEmailNotifyIcon();
		home.switchToNotificationScreen();
		home.notification.ClickDistributionListRadioButton();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.clickAddButton();
		home.notification.SaveScreen();
		home.notification.VerifySuccessfulBottomMessage();
		home.notification.CloseScreen();
		names.switchToNameEntry();

	}

	@Test(groups = { "2020DefectExpungement" }) // Vijay
	public void verifyNewExpungementFunctionalitySysParameter286AsTrue_254473(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "254473");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter286AsTrue();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.EnterAtCharge();
		names.arrestSearch.selectAtHow();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.selectRowByAtNameID();
		names.switchToArrestEntry();
		names.arrestEntry.clickExpungementIcon();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickOneOrMoreCharge();
		names.arrestExpungement.enterReason();
		names.arrestExpungement.clickExpungeButton();
		names.arrestExpungement.clickYesExpungeButton();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickCloseButton();
		names.arrestExpungement.VerifyAcknowledgePopup();
		loader.navigateToScreen("Expungement Search");
		names.switchToExpungementSearchScreen();
		names.expungementSearch.selectJuriAsNull();
		names.expungementSearch.clickSearchButton();
		names.expungementSearch.verifyReinstatedColumnAsNo();
		names.expungementSearch.selectRowByNameID();
		names.switchToReInstateWindow();
		names.expungement.clickReinstateTheExpungementButton();
		names.expungement.EnterReason();
		names.expungement.clickYesInExpungementConfirmPopup();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.switchToReInstateWindow();
		names.expungement.verifyPopupMessageWithLabelTextAndClickClose();
		names.expungement.VerifyAcknowledgePopup();
		loader.navigateToScreen("Expungement Search");
		names.switchToExpungementSearchScreen();
		names.expungementSearch.verifyReinstatedColumnAsYes();
		names.expungementSearch.selectRowByNameID();
		names.switchToReInstateWindow();
		names.expungement.verifyArrestBubbleIconDisplayed();
		names.expungement.verifyExpungedByWithName();
		names.expungement.verifyReInstatedByWithName();
		names.expungement.closeTheScreen();
		loader.navigateToScreen("Expungement Search");
		names.switchToExpungementSearchScreen();
		names.expungementSearch.clickExpungementLegacyButton();
		names.switchToExpungementSearchLegacyWindow();
		names.expungementSearchLegacyWindow.ClickSearchButton();
		names.expungementSearchLegacyWindow.verifyExpungedEntryPresentInGrid();

	}

	@Test // (groups = { "2020DefectExpungement" }) // Vijay
	public void verifyNewExpungementFunctionalitySysParameter286AsFalse_254773(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "254773");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter286AsFalse();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtName();
		names.switchToNameEntry();
		names.nameEntry.ClickExpungementIcon();
		names.switchToExpungement();
		names.expungement.SelectTypeAsExpungement();
		names.expungement.verifyNoOfBookingsAs1();
		names.expungement.EnterReason();
		names.expungement.DeleteAtArrestBookingRow();
		names.expungement.VerifyDeleteExpungementConfirmMessage();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.switchToExpungementScreen();
		names.expungement.VerifyExpungeCompletedAcknowledgeMessage();
		names.switchToExpungementScreen();
		names.expungement.verifyNoOfBookingsAs0();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.ClickExpungementActivityButton();
		names.switchToExpungementSearchLegacyWindow();
		names.expungementSearchLegacyWindow.verifyExpungedEntryPresentInGrid();

	}

	@Test(groups = { "2020DefectExpungement" }) // Vijay
	public void ExpungementIconsAreLoadingInArrestEntryAndNameEntry_255721(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "255721");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter286AsTrue();

		loader.navigateToModule("Names");

		loader.navigateToScreen("Arrest Search");

		names.switchToArrestSearch();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.enterAtArrestNoInFrom();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectAtArrestNoInGrid();
		names.switchToArrestEntry();
		names.arrestEntry.verifyExpungementIconDisplayed();
		names.arrestEntry.clickExpungementIcon();
		names.switchToArrestExpungement();
		names.arrestExpungement.verifyExpungementTypeIsSelectedAsEntireArrest();
		names.arrestExpungement.clickDeleteInFindReplaceTableByName();
		names.arrestExpungement.VerifyDeletedBookingConfirmeMessage();
		names.switchToArrestExpungement();
		names.arrestExpungement.enterReason();
		names.arrestExpungement.clickExpungeButton();
		names.arrestExpungement.clickYesExpungeButton();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickCloseButton();
		names.switchToArrestEntry();
		names.arrestEntry.closeTheScreen();
		names.switchToArrestSearch();
		names.arrestSearch.ClickBackButton();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.enterAtArrestNoInFrom();
		names.arrestSearch.VerifyNumberDoesNotExit();
		names.switchToArrestSearch();
		names.arrestSearch.enterAtArrestNo1InFrom();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.selectAtArrestNo1InGrid();
		names.switchToArrestEntry();
		names.arrestEntry.clickExpungementIcon();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickOneOrMoreCharge();
		names.arrestExpungement.enterReason();
		names.arrestExpungement.clickExpungeButton();
		names.arrestExpungement.clickYesExpungeButton();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickCloseButton();
		names.switchToArrestSearch();
		Playback.popupThreadWait();
		names.arrestSearch.ClickBackButton();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.enterAtArrestNo1InFrom();
		names.arrestSearch.VerifyNumberDoesNotExit();
		Playback.popupThreadWait();

		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.selectNameByLastNameAndFirstName();
		names.switchToNameEntry();
		names.nameEntry.verifyDeleteNameIconIsDisabled();
		names.arrestEntry.clickExpungementIcon();
		names.switchToExpungementEntry();
		names.expungement.clickAtArrestBookingRow();
		names.switchToArrestExpungement();
		names.arrestExpungement.verifyExpungementTypeIsSelectedAsEntireArrest();
		names.arrestExpungement.clickDeleteInFindReplaceTableByName1();
		names.arrestExpungement.VerifyDeletedBookingConfirmeMessage();
		names.switchToArrestExpungement();
		names.arrestExpungement.enterReason();
		names.arrestExpungement.clickExpungeButton();
		names.arrestExpungement.clickYesExpungeButton();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.switchToArrestExpungement();
		names.arrestExpungement.clickCloseButton();
		names.switchToExpungementEntry();
		names.expungement.closeTheScreen();
		names.switchToNameEntry();
		names.nameEntry.SaveNCloseScreen();
		names.switchToNameSearch();
		names.nameSearch.selectNameByLastNameAndFirstName();
		names.switchToNameEntry();
		names.nameEntry.verifyDeleteNameIconIsEnbled();
	}

	@Test(groups = { "2020DefectExpungement" }) // oct Sprint 2 Automated by Mahesha
	public void VerifyBookingDispositionisnotRequiredExpungeTheActivity_256797(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256797");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Expungement");
		names.switchToExpungement();
		names.expungement.EnterAtNameID();
		names.expungement.VerifyAtAddress();
		names.expungement.VerifyAtName();
		names.expungement.SelectTypeAsExpungement();
		names.expungement.EnterReason();
		names.expungement.DeleteAtArrestBookingRow();
		names.expungement.VerifyDeleteExpungementConfirmMessage();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.expungement.VerifyExpungeCompletedAcknowledgeMessage1();
		names.BackToExpungement();
	}

	@Test(groups = { "2020DefectAttachments" }) // oct Sprint 2 Automated by Mahesha
	public void VerifAbleToUpdateImagesNameEntryScreen_256798(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256798");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.EnterHeight();
		names.nameEntry.physicalTab.EnterWeight_lbs();
		names.nameEntry.physicalTab.EnterScarsMarksAsARTARM();
		names.nameEntry.physicalTab.EnterAtDescription();
		names.nameEntry.physicalTab.ClickAddButton();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.ClickNameImage();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickAddNewButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.EnterDate();
		home.updateImageScreen.EnterTime();
		home.updateImageScreen.clickChooseFileButtonAndSelectPNGFile();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.ClickSaveAndCloseButton();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickUpdateButton();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.verifyProfileImageDisplayed();

	}

	@Test(groups = { "2020DefectAttachments" }) // Run in Local oct Sprint 2 Automated
	// by Mahesha
	public void VerifyAbleToDeleteMugshotPhotosAfterExpungingArrest_256422(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256422");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.EnterAtArrestNo();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectRowByAtArrestNo();
		names.switchToArrestEntry();
		names.arrestEntry.ClickArrestEntryImageView();

		home.switchToAllImageScreen();
		home.allImagesScreen.ClickAddNewButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.EnterDate();
		home.updateImageScreen.EnterTime();
		home.updateImageScreen.clickChooseFileButtonAndSelectPNGFile();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.ClickSaveAndCloseButton();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickUpdateButton();

		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.verifyProfileImageDisplayed();
		names.nameEntry.closeTheScreen();

		loader.navigateToScreen("Expungement");
		names.switchToExpungement();
		names.expungement.EnterAtNameID();
		names.expungement.VerifyAtAddress();
		names.expungement.VerifyAtName();
		names.expungement.SelectTypeAsExpungement();
		names.expungement.EnterReason();
		names.expungement.DeleteAtArrestBookingRow();
		names.expungement.VerifyDeleteExpungementConfirmMessage();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.expungement.VerifyNoActivitiesAcknowledgeMessage();
		names.expungement.VerifyExpungeCompletedAcknowledgeMessage1();

		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.verifyImageNotAvailable();

	}

	@Test(groups = { "2020DefectArrest" }) // oct Sprint 2 Automated by Mahesha
	public void ArrestEntryEmpSchoolTab_256799(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256799");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.EnterAtArrestNo();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectRowByAtArrestNo();
		names.switchToArrestEntry();
		names.arrestEntry.switchToEmpSchoolTab();
		names.arrestEntry.arrestEntryEmpSchoolTab.verifyAtBusinessName(0);
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToEmpSchoolTab();
		names.nameEntry.empSchoolTab.verifyAtBusinessName(0);
		names.nameEntry.empSchoolTab.deleteGridRowByName();
		names.nameEntry.empSchoolTab.VerifyConfirmDeleteMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToEmpSchoolTab();
		names.nameEntry.empSchoolTab.SaveEmpSchoolTab(); // Updated
		names.switchToNameEntry();
		names.nameEntry.SaveNCloseScreen();
		loader.navigateToScreen("Arrest Search");
		names.arrestSearch.reloadArrestSearch();
		names.switchToArrestSearch();
		names.arrestSearch.EnterAtArrestNo();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectRowByAtArrestNo();
		names.switchToArrestEntry();
		names.arrestEntry.switchToEmpSchoolTab();
		names.arrestEntry.arrestEntryEmpSchoolTab.enterAtBNameID();
		names.arrestEntry.arrestEntryEmpSchoolTab.SelectOccupation();
		names.switchToArrestEntry();
		names.arrestEntry.switchToEmpSchoolTab();
		names.arrestEntry.arrestEntryEmpSchoolTab.ClickAddButton();
		names.arrestEntry.arrestEntryEmpSchoolTab.SaveEmpSchoolTab();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();
		loader.navigateToScreen("Name Search");
		names.nameSearch.reloadNameSearch();
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToEmpSchoolTab();
		names.nameEntry.empSchoolTab.verifyAtBusinessName(1);

	}

	@Test(groups = { "2020DefectAttachments" }) // Automated by Stalin
	public void PhotoLineup_256411(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256411");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.enterNameIDAsJ();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.EnterAtSMT();
		names.nameEntry.physicalTab.clickGlassesCheckBox();
		names.nameEntry.physicalTab.AddMarks();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.ClickNameImage();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickAddNewButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.EnterDate();
		home.updateImageScreen.EnterTime();
		home.updateImageScreen.clickChooseFileButtonAndSelectPNGFile();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.ClickSaveAndCloseButton();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickUpdateButton();
		home.allImagesScreen.ClickAddNewButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.EnterDate();
		home.updateImageScreen.EnterTime();
		home.updateImageScreen.clickChooseFileButtonAndSelectJPGFile();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.ClickSaveAndCloseButton();
		home.switchToAllImageScreen();
		home.allImagesScreen.clickActiveCheckboxWithConfirmMsg();
		home.allImagesScreen.ClickUpdateButton();
		home.allImagesScreen.Close();
		names.switchToNameEntry();
		names.nameEntry.ClickPhotoLineIcon();
		names.switchToPhotoLineupScreen();
		names.photoLineupEntry.ClickSearchButton();
		names.photoLineupEntry.ClickBuildLineupButton();
		names.switchToBuildPhotoLineupScreen();
		names.buildPhotoLineup.ClickAutoRandomImagesButton();
		names.buildPhotoLineup.EnterAtOfficer();
		names.buildPhotoLineup.EnterDateAsCurrentDate();
		names.buildPhotoLineup.ClickSaveAndViewPDFButton(); // disabled
		// names.buildPhotoLineup.VerifyCompleteLineUpAcknowledgeMessage();
		home.switchToSelectReport();
		home.selectReport.ClickPhotoLineupReportInGrid();
		names.switchToPhotoLineupReportWindow();
		names.photoLineupReportWindow.closeScreen();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		names.switchToBuildPhotoLineupScreen();
		names.buildPhotoLineup.CloseScreen();
		names.switchToPhotoLineupScreen();
		names.photoLineupEntry.EnterAtCaseNo();
		names.photoLineupEntry.EnterAtOfficer();
		names.photoLineupEntry.EnterTabOfficerDateTime();
		names.photoLineupEntry.enterAtVictimLastName();
		names.photoLineupEntry.enterAtVictimFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		names.switchToPhotoLineupScreen();
		names.photoLineupEntry.ClickAdd();
		names.photoLineupEntry.SaveScreen();
		names.switchToPhotoLineupScreen();
		names.photoLineupEntry.deleteRowByUsingNameInGrid();
		names.switchToPhotoLineupScreen();

	}

	@Test(groups = { "2020DefectArrest" }) // Automated by Stalin
	public void DeletingChargesfromChargeTab_257960(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257960");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter633AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.verifyBookingNameRequiredMessage();
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.Save();
		names.arrestEntry.verifyInvalidCaseNoOrReqiredMessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.switchToArrestEntry();
		// names.arrestEntry.clickPopupChargeCancelButton();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.clickCaseInfoButton();
		objectIdentification.windowHandle.switchToWindow("Case Update");
		objectIdentification.windowHandle.closeTheScreen();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.arrestTab.VerifyHowIsRequiredAcknowledgemessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.selectHowAsOnViewArrest();
		names.arrestEntry.arrestTab.enterAtOfficer1();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.arrestTab.VerifyArmedIsRequired();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.selectArmed();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.arrestTab.verifyEnterMandatoryDataAcwkMsg();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.VerifyMinimumOneChargeIsRequiredAcknowledgeMessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.selectCourtType();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.chargeTab.verifyAtCaseNoInGrid(0);
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.clickReleaseTab();
		names.arrestEntry.releaseTab.selectAtSchool();
		names.arrestEntry.releaseTab.selectAtGrade();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.enterAtCharge1();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.selectCourtType();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.deleteRowByUsingCaseNoInGrid();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();

	}

	@Test(groups = { "2020DefectArrest" }) // Automated by stalin
	public void CellTabFunctionality_257961(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257961");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter653AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.EnterAtArrestNo();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectAtArrestNoInGrid();
		names.switchToArrestEntry();
		names.arrestEntry.switchToCellTab();
		names.arrestEntry.arrestEntryCellTab.EnterAtAssignCellNo();
		names.arrestEntry.arrestEntryCellTab.clickAssignCellInfoIcon();
		settings.switchToJailCellEntry();
		settings.jailCellEntry.verifyJailCellScreenDisplayed();
		settings.jailCellEntry.closeScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToCellTab();
		names.arrestEntry.arrestEntryCellTab.selectAtCustodyReason();
		names.arrestEntry.arrestEntryCellTab.SelectRiskLevel();
		names.arrestEntry.arrestEntryCellTab.enterAtAssignedBy();
		names.arrestEntry.arrestEntryCellTab.EnterAssignDateandTime();
		names.arrestEntry.arrestEntryCellTab.SaveInternalTab();
		names.switchToArrestEntry();
		names.arrestEntry.switchToCellTab();
		names.arrestEntry.arrestEntryCellTab.clickRemoveCheckBox();
		names.arrestEntry.arrestEntryCellTab.enterAtRemovedBy();
		names.arrestEntry.arrestEntryCellTab.tabOutRemovedDateAndTime();
		names.arrestEntry.arrestEntryCellTab.SaveInternalTab();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToCellTab();
		names.arrestEntry.arrestEntryCellTab.clickCellHistoryButton();
		activity.switchToActivitySearchHelpWindow();
		activity.activitySearchHelpWindow.verifyAtSubjectInGrid();
		activity.activitySearchHelpWindow.closeScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToCellTab();
		names.arrestEntry.arrestEntryCellTab.clickFormsLink();
		qA.SwitchToQuestionDataEntry();
		qA.questionDataEntry.TabOutPF();
		qA.questionDataEntry.SaveNClose();
		names.switchToArrestEntry();
		names.arrestEntry.Reset();
		names.arrestEntry.switchToCellTab();
		names.arrestEntry.arrestEntryCellTab.verifyFormsLinkAsGreenColor();
		names.arrestEntry.arrestEntryCellTab.clickAddActivityButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.TabOutActivityDateAndTime();
		activity.activityEntry.enterSubject();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();

	}

	@Test(groups = { "2020DefectArrest" }) // Vijay
	public void verifyModifiersForWIStateBookingProperlyAttachingToChargeSequenceNumberWhenDeleted_257959(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "257959");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemParameterID633AsTrue();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.verifyBookingNameRequiredMessage();// Changed
		names.switchToArrestEntry();
		names.arrestEntry.enterAtJNameID();
		names.arrestEntry.Save();
		names.arrestEntry.verifyInvalidCaseNoOrReqiredMessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.clickCaseInfoButton();
		objectIdentification.windowHandle.switchToWindow("Case Update");
		objectIdentification.windowHandle.closeTheScreen();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.arrestTab.VerifyHowIsRequiredAcknowledgemessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.SelectHowAsAttemptedArrest();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.arrestTab.VerifyArmedIsRequired();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.Save();
		names.switchToArrestEntry();
		names.arrestEntry.arrestTab.verifyArrestEntryDateAcknowledgeMessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.VerifyMinimumOneChargeIsRequiredAcknowledgeMessage();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.selectAtAgencyAction();
		names.arrestEntry.chargeTab.selectCourtType();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.Save();
		names.arrestEntry.verifySchoolAttendenceInformationAcknowledgeMessage();
		names.switchToArrestEntry();
		names.arrestEntry.clickReleaseTab();
		names.arrestEntry.releaseTab.selectSchoolAsCollegeDegree();
		names.arrestEntry.releaseTab.selectGradeAsA7thGrade();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.verifyMedicalTabIsDisplayed();
		names.arrestEntry.verifyAssociatesTabIsDisplayed();
		names.arrestEntry.verifyCommentsTabIsDisplayed();
		names.arrestEntry.verifyStatementTabIsDisplayed();
		names.arrestEntry.verifyAttachmentsTabIsDisplayed();
		names.arrestEntry.verifyMapTabIsDisplayed();
		names.arrestEntry.verifyApprovalTabIsDisplayed();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.ClickAtCaseNoInGrid();
		names.arrestEntry.chargeTab.verifyModifierCheckBoxIsDisplayed();
		names.arrestEntry.chargeTab.DoubleClickAtChargeInGrid();
		names.switchToArrestEntryChargeWindow();
		names.arrestEntryForCharge.EnterAtmodifyCharge();
		names.switchToArrestEntryChargeWindow();
		names.arrestEntryForCharge.clickAddButton();
		names.arrestEntryForCharge.ClickSaveNClose();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.DeleteRowByChargeInGridByIndex(1);
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.arrestEntry.chargeTab.DoubleClickAtChargeInGrid();
		names.switchToArrestEntryChargeWindow();
		names.arrestEntryForCharge.EnterAtmodifyCharge();
		names.switchToArrestEntryChargeWindow();
		names.arrestEntryForCharge.clickAddButton();
		names.arrestEntryForCharge.ClickSaveNClose();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();

	}

	@Test(groups = { "2020DefectNameSearch2" }) // Q4 Sprint 5 Automated by Mahesha
	public void VerifyThatALCPrintIconWorksBeforeSaveTheDataFromAttachmentsTab_260469(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260469");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.clickALCIcon();
		home.switchToALCScreen();
		home.aLCScreen.clickPrintButton();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		home.switchToALCScreen();
		home.aLCScreen.ClickPFTab();
		home.aLCScreen.aLCPFTab.SelectAtAction();
		home.aLCScreen.aLCPFTab.EnterAtPFCode();
		home.aLCScreen.aLCPFTab.ClickAddButton();
		home.aLCScreen.aLCPFTab.VerifyAtActionInGrid(0);
		home.aLCScreen.SaveScreen();
		home.switchToALCScreen();
		home.aLCScreen.VerifySuccessfulStatusMessage();
		home.aLCScreen.clickPrintButton();
		home.switchToSelectReport();

	}

	@Test(groups = { "2020DefectArrest" }) // Vijay
	public void verifyAbleToUpdateBookingDateTime24HoursLaterThanArrestDateTime_253126(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "253126");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();// Need to login as Admin and in Debug Mode
		settings.sysParameter.setSystemParameter2001AsUCR();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter779AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter816AsTrue();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.tabOutOfficer1();
		names.arrestEntry.arrestTab.SelectAtArmed();
		names.arrestEntry.arrestTab.enterBookingDate24HoursGreaterThanArrestDate();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();// Need to login as Admin and in Debug Mode
		settings.sysParameter.setSystemParameter2001AsUCR();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter779AsFalse();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter816AsFalse();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.tabOutOfficer1();
		names.arrestEntry.arrestTab.SelectAtArmed();
		names.arrestEntry.arrestTab.enterBookingDate24HoursGreaterThanArrestDate();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();
	}

	@Test(groups = { "2020DefectArrest" }) // Vijay // Refer 253126
	public void verifyAbleToUpdateBookingDateTime24HoursLaterThanArrestDateTimeUsingSysParameter2001AsUCR_NIBRS_253126(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "254110");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemParameter2001AsUCRNIBRS();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter779AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter816AsTrue();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.tabOutOfficer1();
		names.arrestEntry.arrestTab.SelectAtArmed();
		names.arrestEntry.arrestTab.enterBookingDate24HoursGreaterThanArrestDate();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.SelectNIBRS();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemParameter2001AsUCRNIBRS();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter779AsFalse();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter816AsTrue();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.tabOutOfficer1();
		names.arrestEntry.arrestTab.SelectAtArmed();
		names.arrestEntry.arrestTab.enterBookingDate24HoursGreaterThanArrestDate();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();
	}

	@Test(groups = { "2020DefectNameEntry" }) // Vijay
	public void verifyALCScreenShowsApproproateValidation_260158(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "260158");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.enterAtSSNo();
		names.nameEntry.nameEntryMainTab.SelectAtResident();
		names.switchToNameEntry();
		names.nameEntry.SaveNCloseScreen();
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickAdvancedTab();
		names.nameSearch.nameSearchAdvancedTab.enterAtSSNo();
		names.switchToNameSearch();
		names.nameSearch.clickSearchButton();
		names.nameSearch.selectNameByLastNameAndFirstName();
		names.switchToNameEntry();
		names.nameEntry.ClickALCIcon();
		home.switchToALCScreen();
		home.aLCScreen.clickSaveButton();
		home.aLCScreen.verifyNoDataPresentAcknowledgeMessage();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectExpungement" }) // Vijay
	public void verifyArrestExpungementfunctionality_259722(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "259722");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Expungement");
		names.switchToExpungement();
		names.expungement.EnterAtNameID();
		names.expungement.SelectTypeAsExpungement();
		// names.expungement.DeleteAtArrestBookingRow();
		// names.expungement.VerifyReasonAcknowledgeMessage();//Changed
		// names.BackToExpungement();
		names.expungement.EnterReason();
		names.BackToExpungement();
		names.expungement.DeleteAtArrestBookingRow();
		names.expungement.VerifyDeleteExpungementConfirmMessage();
		names.BackToExpungement();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		names.BackToExpungement();
		names.expungement.VerifyNoActivitiesAcknowledgeMessage();
		names.BackToExpungement();
		names.expungement.VerifyExpungeCompletedAcknowledgeMessage1();
		names.BackToExpungement();
	}

	@Test(groups = { "2020DefectArrest" })
	public void verifyAbleToDeleteTheChargeFromArrestEntryScreen_259723(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "259723");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.EnterAtCaseNo();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectArrestByAtCaseNo();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.tabHowComboBox();
		names.arrestEntry.arrestTab.VerifyAtOfficer1();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.VerifyAtChargeInGrid(0);
		names.arrestEntry.chargeTab.tabTheArrestLocation();
		names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		names.arrestEntry.chargeTab.enterAtCharge1();
		names.arrestEntry.chargeTab.enterCountAs2();
		names.arrestEntry.chargeTab.selectAtStatus();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.deleteAtChargeRowInGrid();
		names.arrestEntry.chargeTab.verifyDeleteConfirmMessageAsNo();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.deleteAtChargeRowInGrid();
		names.arrestEntry.chargeTab.VerifyDeleteConfirmMessage();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.verifyAtChargeDeletedInGrid();

	}

		
	@Test(groups = { "2020DefectNameSearch2"}) // Mithun Missed Testcase // BY Stalin
	public void NamesEntryscreen_256407(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256407");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtName();
		names.switchToNameEntry();
		names.nameEntry.clearAddress();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.ClickSaveButton();
		names.nameEntry.clickOkButtonInAddressModifiedPopup();
		names.nameEntry.VerifySaveConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.verifyAtOldAddress(0);
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToNameSearch();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.SelectAtNameType1();
		names.nameSearch.enterAtLastName1();
		names.nameSearch.enterAtFirstName1();
		names.nameSearch.clickSearchButton();
		names.nameSearch.clickAtName1();
		names.switchToNameEntry();
		names.nameEntry.clearAddress();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.ClickSaveButton();
		names.nameEntry.clickOkButtonInAddressModifiedPopup();
		names.nameEntry.VerifySaveConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.verifyAtOldAddress(0);
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToNameSearch();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.SelectAtNameType2();
		names.nameSearch.enterAtLastName2();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtBTypeName();
		names.switchToNameEntry();
		names.nameEntry.clearAddress();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.ClickSaveButton();
		names.nameEntry.clickOkButtonInAddressModifiedPopup();
		names.nameEntry.VerifySaveConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToAddressesTab();
		names.nameEntry.nameEntryAddressesTab.verifyAtOldAddress(0);
		names.switchToNameEntry();

	}

	@Test(groups = { "2020DefectNameEntry" }) // Mithun Missed Testcase // BY Stalin
	public void NamesEntryscreen_256409(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256409");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.clickBirthDate();
		names.nameEntry.nameEntryMainTab.enterAtAgeFrom();
		names.nameEntry.nameEntryMainTab.enterAtAgeTo();
		names.switchToNameEntry();
		names.nameEntry.ClickSaveButton();
		names.nameEntry.verifyInvalidAgeAcknowledgeMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.ClickClearDOBButton();
		names.nameEntry.nameEntryMainTab.enterAtAgeFrom1();
		names.nameEntry.nameEntryMainTab.enterAtAgeTo1();
		names.switchToNameEntry();
		names.nameEntry.ClickSaveButton();
		names.nameEntry.nameEntryMainTab.verifyConfirmJuvenileNameWarningMessageInChrome();
		names.nameEntry.nameEntryMainTab.verifySaveConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.ClickClearDOBButton();
		names.nameEntry.nameEntryMainTab.enterAtAgeFrom2();
		names.nameEntry.nameEntryMainTab.enterAtAgeTo2();
		names.switchToNameEntry();
		names.nameEntry.ClickSaveButton();
		names.nameEntry.nameEntryMainTab.verifyAgeCannottBeZeroAcknowledgeMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.ClickClearDOBButton();
		names.nameEntry.nameEntryMainTab.enterAtAgeFrom3();
		names.nameEntry.nameEntryMainTab.enterAtAgeTo3();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();

	}

	@Test(groups = { "2020DefectNameEntry" }) // Mithun's Missed Testcase // Automated By Stalin
	public void NameSMTAndSequenceNo_256420(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256420");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.enterAtMiddleName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.enterBirthDateAsCurrentDate();
		names.nameEntry.nameEntryMainTab.verifyConfirmJuvenileNameWarningMessageInChrome();
		names.switchToNameEntry();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.EnterHeight();
		names.nameEntry.physicalTab.EnterWeight_lbs();
		names.nameEntry.physicalTab.SelectEyeColor();
		names.nameEntry.physicalTab.SelectHairColor();
		names.nameEntry.physicalTab.SelectFacialHair();
		names.nameEntry.physicalTab.SelectTeeth();
		names.nameEntry.physicalTab.SelectCondition();
		names.nameEntry.physicalTab.EnterScarsMarksAsARTARM();
		names.nameEntry.physicalTab.EnterAtDescription();
		names.nameEntry.physicalTab.AddMarks();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		String readNameID = names.nameEntry.readNameID();
		names.nameEntry.closeTheScreen();
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName1();
		names.nameEntry.EnterAtFirstName1();
		names.nameEntry.enterAtMiddleName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.EnterHeight();
		names.nameEntry.physicalTab.EnterWeight_lbs();
		names.nameEntry.physicalTab.SelectEyeColor();
		names.nameEntry.physicalTab.SelectHairColor();
		names.nameEntry.physicalTab.SelectFacialHair();
		names.nameEntry.physicalTab.SelectTeeth();
		names.nameEntry.physicalTab.SelectCondition();
		names.nameEntry.physicalTab.EnterScarsMarksAsARTARM();
		names.nameEntry.physicalTab.EnterAtDescription();
		names.nameEntry.physicalTab.AddMarks();
		names.nameEntry.physicalTab.EnterScarsMarksAsARTARM();
		names.nameEntry.physicalTab.EnterAtDescription();
		names.nameEntry.physicalTab.AddMarks();
		names.nameEntry.physicalTab.VerifyAcknowledgeDuplicationData();
		names.switchToNameEntry();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.ClickClearButton();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		String readNameID2 = names.nameEntry.readNameID();
		names.nameEntry.closeTheScreen();
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.enterActiveNameID(readNameID);
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.enterActiveNameIDInMergeListTab(readNameID2);
		names.switchToNameMerge();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.CloseScreen();
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterActiveNameID(readNameID);
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtName();
		names.switchToNameEntry();
		names.nameEntry.switchToPhysicalTab();
		names.nameEntry.physicalTab.clickAtSMTInGrid();
		names.nameEntry.physicalTab.AddMarks();
		names.switchToNameEntry();

	}

	@Test(groups = { "2020DefectNameEntry" })
	public void Police2020NamesModule_256419(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 256419);
	    Browser.NavigateToLoginScreen();
	    login.loginScreen.Logon();    
	    loader.navigateToModule("Names");
	    loader.navigateToScreen("Name Search");
	    names.switchToNameSearch();
	    names.nameSearch.enterAtNameID();
	    names.nameSearch.clickSearchButton();
	    names.nameSearch.selectRowByAtAtypeNameID();
	    names.switchToNameEntry();
	    names.nameEntry.nameEntryMainTab.SelectAtRace();
	    names.nameEntry.nameEntryMainTab.SelectAtEthnic();
	    names.switchToNameEntry();
	    names.nameEntry.Save();
	    names.switchToNameEntry();
	    names.nameEntry.nameEntryMainTab.VerifyAtRace();
	    names.nameEntry.nameEntryMainTab.VerifyAtEthnic();
	    names.switchToNameEntry();
	    names.nameEntry.closeTheScreen();
	    names.switchToNameSearch();
	    names.nameSearch.ClickBackButton();
	    names.nameSearch.ClickResetButton();
	    names.nameSearch.enterAtNameID2();
	    names.nameSearch.clickSearchButton();
	    names.nameSearch.selectRowByAtJtypeNameID();
	    names.switchToNameEntry();
	    names.nameEntry.nameEntryMainTab.SelectAtRace();
	    names.nameEntry.nameEntryMainTab.SelectAtEthnic();
	    names.switchToNameEntry();
	    names.nameEntry.Save();
	    names.switchToNameEntry();
	    names.nameEntry.nameEntryMainTab.VerifyAtRace();
	    names.nameEntry.nameEntryMainTab.VerifyAtEthnic();
	    names.switchToNameEntry();
	    names.nameEntry.closeTheScreen();
	    names.switchToNameSearch();
	    names.nameSearch.ClickBackButton();
	    names.nameSearch.ClickResetButton();
	    names.nameSearch.enterAtNameID3();
	    names.nameSearch.clickSearchButton();
	    names.nameSearch.selectRowByAtOtypeNameID();
	    names.switchToNameEntry();
	    names.nameEntry.nameEntryMainTab.SelectAtRace();
	    names.nameEntry.nameEntryMainTab.SelectAtEthnic();
	    names.switchToNameEntry();
	    names.nameEntry.Save();
	    names.switchToNameEntry();
	    names.nameEntry.nameEntryMainTab.VerifyAtRace();
	    names.nameEntry.nameEntryMainTab.VerifyAtEthnic();
	    names.switchToNameEntry();
	    names.nameEntry.closeTheScreen();	    
	     objectIdentification.windowHandle.switchToMainWindow();
	    loader.navigateToModule("Settings");
	     loader.navigateToScreen("Coded");
	     settings.switchToCodedScreen();
	     settings.coded.enterAtCodeID();
	     settings.coded.clickSearchButton();
	     settings.coded.clickRowByAtCodeID();
	     settings.switchToSharedCodes();
	     settings.sharedCodes.SelectAtCodeValueDescription();
	     settings.sharedCodes.clickPopupInactiveCheckBox();
	     settings.sharedCodes.clickUpdateButton();
	     settings.switchToSharedCodes();
	     settings.sharedCodes.closeScreen();	     
	     settings.switchToCodedScreen();
	     settings.coded.enterAtCodeID1();
	     settings.coded.clickSearchButton();
	     settings.coded.clickRowByAtCodeID1();
	     settings.switchToSharedCodes();
	     settings.sharedCodes.SelectAtCodeValueDescription1();
	     settings.sharedCodes.clickPopupInactiveCheckBox();
	     settings.sharedCodes.clickUpdateButton();
	     settings.switchToSharedCodes();
	     settings.sharedCodes.closeScreen();     
		 loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.selectRowByAtAtypeNameID();
		names.switchToNameEntry();
		names.nameEntry.nameEntryMainTab.verifyAtRace1();
		names.nameEntry.nameEntryMainTab.verifyAtEthnic1();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToNameSearch();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.enterAtNameID2();
		names.nameSearch.clickSearchButton();
		names.nameSearch.selectRowByAtJtypeNameID();
		names.switchToNameEntry();
		names.nameEntry.nameEntryMainTab.verifyAtRace1();
		names.nameEntry.nameEntryMainTab.verifyAtEthnic1();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToNameSearch();
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.enterAtNameID3();
		names.nameSearch.clickSearchButton();
		names.nameSearch.selectRowByAtOtypeNameID();
		names.switchToNameEntry();
		names.nameEntry.nameEntryMainTab.verifyAtRace1();
		names.nameEntry.nameEntryMainTab.verifyAtEthnic1();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectNameEntry" })
	// Mithun
	public void NameScript_256800(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	      testContext.setAttribute("testID", 256800);
	       Browser.NavigateToLoginScreen();
	       login.loginScreen.Logon();
	       loader.navigateToModule("Names");
	       loader.navigateToScreen("Name Search");
	       names.switchToNameSearch();
	       names.nameSearch.ClickAddNewButton();
	       names.switchToNameEntry();
	       names.nameEntry.selectAtJuris();
	       names.nameEntry.EnterAtLastName();
	       names.nameEntry.EnterAtFirstName();
	       names.switchToNameSearchPopupScreen();
	       names.nameSearchPopupScreen.SelectNameByDefendant2LastFirstName();
	       names.nameSearchPopupScreen.Verifycopynameconfirmpopup();
	       names.switchToNameSearchPopupScreen();
	       names.nameSearchPopupScreen.CloseScreen();
	       names.switchToNameEntry();
	       names.nameEntry.switchToMJTab();
	       names.nameEntry.nameEntryMJTab.verifyAtFromNameInGrid();
	       names.nameEntry.nameEntryMJTab.verifyAtFromNameInGrid();
	       names.switchToNameEntry();
	       names.nameEntry.Save();
	        names.switchToNameEntry();
	       
	   }
		
	@Test (groups = { "2021DefectTestCases" }) //Automated by Stalin Q2 S2
	public void VerifyabletosearchtheparticularHexadecimalvalues_271626(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "271626");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtAddress();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.EnterAtDOB();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtName(0);
		names.nameSearch.ClickBackButton();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtName(0);
		names.nameSearch.ClickBackButton();
		names.nameSearch.ClickResetButton();
		names.nameSearch.verifyAtFirstNameIsNull();
		names.nameSearch.verifyAtDOBIsNull();
		names.nameSearch.verifyAtAddressIsNull();
		names.nameSearch.verifyAtNameTypeIsNull();
		names.switchToNameSearch();
	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S2 run in 45
	public void VerifyabletosearchQAFormresultsviaArrestsearchScreen_271627(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "271627");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.enterAtQAFormData();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.VerifyAtNameInGrid(0);
		names.arrestSearch.selectRowByAtNameID();
		names.switchToArrestEntry();
		names.arrestEntry.switchToQAFormsTab();
		names.arrestEntry.arrestEntryQAFormsTab.clickPrintIconInGrid();
		home.switchToPnxReportSSRSPDFScreen();
		home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
		names.switchToArrestEntry();
		names.arrestEntry.closeTheScreen();
		names.switchToArrestSearch();
		names.arrestSearch.clickAddnewButton();
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.arrestTab.selectHowAsOnViewArrest();
		names.arrestEntry.arrestTab.enterAtOfficer1();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToQAFormsTab();
		names.arrestEntry.arrestEntryQAFormsTab.selectAtForm();
		qA.SwitchToQuestionDataEntry();
		qA.questionDataEntry.clickReportSaveNExit();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
		names.switchToArrestEntry();
		names.arrestEntry.switchToQAFormsTab();
		names.arrestEntry.arrestEntryQAFormsTab.clickPrintIconInGrid();
		home.switchToKPITempPDFScreen();

	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin
	public void VerifytheArrestsearchscreenfunctionality(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273003");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.VerifyAtNameInGrid(0);
		names.arrestSearch.ClickBackButton();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.verifyEnterAtLeastOneCriteriaAcknowledgeMessage();
		names.switchToArrestSearch();
		names.arrestSearch.ClickResetButton();
		names.arrestSearch.EnterAtLastName();
		names.arrestSearch.EnterAtFirstName();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.VerifyAtNameInGrid(0);
		names.arrestSearch.ClickBackButton();
		names.arrestSearch.ClickResetButton();
		names.arrestSearch.enterAtToDateAsCurrentDate();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.VerifyAtNameInGrid(0);
		names.arrestSearch.verifyNextButtonIsDisplayedAsNextInGrid();
		names.arrestSearch.clickNextButton();
		names.arrestSearch.verifyPrevButtonIsDisplayedAsPrevInGrid();

	}

	@Test(groups = { "2021DefectTestCases" }) // Mithun
	public void VerifytheLineupsearchscreenfunctionality_275258(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275258");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Lineup Search");
		names.switchToLineupSearch();
		names.lineupSearch.EnterAtLinupNo();
		names.lineupSearch.ClickSearch();
		names.lineupSearch.VerifyAtLineUpNoinRow(0);
		names.lineupSearch.selectRowByAtLineUpNo();
		names.switchToPhotoLineupScreen();
		names.photoLineupEntry.VerifyAtLineupNo();
		names.photoLineupEntry.clickRefresh();
		names.photoLineupEntry.SaveScreen();
		names.switchToLineupSearch();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay Q2 Sprint 3
	public void verifyFromOffenderSearchScreenCustomFieldsWorksAsExcepted_278642(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278642");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Offender Search");
		names.switchToOffenderSearch();
		names.offenderSearch.clickOnProbationAgentLabel();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.selectFieldUsageAsHide();
		settings.repositoryEntry.saveNClose();
		names.switchToOffenderSearch();
		names.offenderSearch.verifyProbationAgentAllFieldsDisabled();
		names.offenderSearch.clickOnProbationAgentLabel();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.selectFieldUsageAsShow();
		settings.repositoryEntry.saveNClose();
		names.switchToOffenderSearch();
		names.offenderSearch.verifyProbationAgentAllFieldsShowed();
		names.offenderSearch.clickAddNewButton();
		names.switchToOffenderEntry();
		names.offenderEntry.clickOnProbationAgentLabel();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.selectFieldUsageAsHide();
		settings.repositoryEntry.saveNClose();
		names.switchToOffenderEntry();
		names.offenderEntry.verifyProbationAgentAllFieldsDisabled();
		names.offenderEntry.clickOnProbationAgentLabel();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.selectFieldUsageAsShow();
		settings.repositoryEntry.saveNClose();
		names.switchToOffenderEntry();
		names.offenderEntry.verifyProbationAgentAllFieldsShowed();
		names.offenderEntry.clickOnProbationAgentLabel();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.selectFieldUsageAsMandatory();
		settings.repositoryEntry.saveNClose();
		names.switchToOffenderEntry();
		names.offenderEntry.verifyProbationAgentAllFieldsAsMandatory();

  }
  
@Test(groups = { "2021DefectTestCases" })
//Mohan Verified Aug 10 2021
	 public void NameScript_278225(ITestContext testContext)
	   {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	      testContext.setAttribute("testID", 278225);
	       Browser.NavigateToLoginScreen();
	       login.loginScreen.Logon();
	       loader.navigateToModule("Names");
	       loader.navigateToScreen("Name Search");
	       names.switchToNameSearch();
	       names.nameSearch.EnterAtLastName();
	       names.nameSearch.clickSearchButton();
	       names.nameSearch.VerifyAtNameUsingLastName(0);
	       names.nameSearch.VerifyAtNameUsingLastName(1);
	       names.nameSearch.VerifyColumnNameAddress(0);
	       
	       names.nameSearch.ClickShowMapButton();
	       names.nameSearch.VerifyAtNameUsingLastName(0);
	      names.nameSearch.VerifyAtNameUsingLastName(1);
	       names.nameSearch.VerifyColumnNameAddress(0);
	       
	   }

//Automated by:- Mahesha, Date :- 10/18/2021, Quarter:-Q4 , Sprint:-1 , Module:- Names.

@Test(groups = { "Enhancement2022" })
public void AddMailDeliveryOptioninNameEntryScreenunderAddressesTab_284117(ITestContext testcontext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "284117");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Names");
	loader.navigateToScreen("Name Search");
	names.switchToNameSearch();
	names.nameSearch.EnterAtLastName();
	names.nameSearch.EnterAtFirstName();
	names.nameSearch.clickSearchButton();
	names.nameSearch.ClickAtNameID();
	names.switchToNameEntry();
	names.nameEntry.VerifyAtNameTypeAndID();
	names.nameEntry.switchToAddressesTab();
	names.nameEntry.nameEntryAddressesTab.verifyEnableMailDeliveryCheckBoxDisplayed();
	names.nameEntry.nameEntryAddressesTab.EnterAtAddress();
	names.nameEntry.nameEntryAddressesTab.clickMailDeliveryCheckBox();
	names.nameEntry.nameEntryAddressesTab.SelectAtType();
	names.nameEntry.nameEntryAddressesTab.ClickAddbutton();
	names.nameEntry.nameEntryAddressesTab.VerifyAcknowledgeMainAddress();
	names.switchToNameEntry();
	names.nameEntry.switchToAddressesTab();
	names.nameEntry.nameEntryAddressesTab.ClickClearButton();
	names.nameEntry.nameEntryAddressesTab.EnterAtAddress1();
	names.nameEntry.nameEntryAddressesTab.clickMailDeliveryCheckBox();
	names.nameEntry.nameEntryAddressesTab.SelectAtType();
	names.nameEntry.nameEntryAddressesTab.ClickAddbutton();
	names.nameEntry.nameEntryAddressesTab.VerifyAtAddress1(0);
	names.nameEntry.Save();
	names.switchToNameEntry();
	names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
}

//Automated by:-Abinaya , Date :-01/03/2022 , Quarter:-Q1 , Sprint:-1 , Module:- Names.

@Test(groups = { "Enhancement2022" })
public void SocialMediaAfter5yearsAddOptionToDeleteInAdditiontoInactive_284330(ITestContext testcontext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "284330");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Names");
	loader.navigateToScreen("Name Search");
	names.switchToNameSearch();
	names.nameSearch.enterAtNameID();
	names.nameSearch.clickSearchButton();
	names.nameSearch.ClickAtName();
	names.switchToNameEntry();
	names.nameEntry.switchToSocialMediaTab();
	names.nameEntry.VerifySocialMediaTabDisplayed();
	names.nameEntry.socialMediaTab.switchToCriteriaTab();
	names.socialMediaTabs.criteriaTab.verifySuspectedCriminalActivityIsDisplayed();
	names.socialMediaTabs.criteriaTab.verifyANDIsDisplayed();
	names.socialMediaTabs.criteriaTab.ClickSaveButton();
	names.socialMediaTabs.criteriaTab.OKWithWebPageAlertWindowMessage();
	names.switchToNameEntry();
	names.nameEntry.switchToSocialMediaTab();
	names.nameEntry.socialMediaTab.switchToCriteriaTab();
	names.socialMediaTabs.criteriaTab.ClickSuspectedCriminalActivityInJustification();
	names.socialMediaTabs.criteriaTab.ClickSaveButton();
	names.socialMediaTabs.criteriaTab.OKWithWebPageAlertWindowMessage3Items();
	names.switchToNameEntry();
	names.nameEntry.switchToSocialMediaTab();
	names.nameEntry.socialMediaTab.switchToCriteriaTab();
	names.socialMediaTabs.criteriaTab.ClickFirst3CheckBoxIdentification();
	names.socialMediaTabs.criteriaTab.ClickSaveButton();
	names.socialMediaTabs.criteriaTab.verifyTheCreatedText();
	
}

//Automated by KIRAN :-     Date :-12/27/2021  Quarter:-4  Sprint:-6  Module:-Names
	@Test
	public void PoliceUnmerge_289862(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "289862");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Merge");
		names.switchToNameMerge();
		names.nameMerge.EnterAtPrimaryANameID();
		names.nameMerge.ClickMergeListTab();
		names.nameMerge.ClickResetButton();
		names.nameMerge.EnterAtMergeANameID();
		names.nameMerge.ClickSearchButton();
		names.nameMerge.SelectMergeANameIDCheckbox();
		names.nameMerge.ClickMergeButton();
		names.switchToNameMergeDetails();
		names.nameMerge.nameMergeScreenDetailsPopup.ClickNameDetailsMergeButton();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyAliasNameConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeFieldsConfirmMessage();
		names.nameMerge.nameMergeScreenDetailsPopup.VerifyMergeCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.clickMergeHistory();
		names.nameMerge.clickAtMergedIDRowCheckbox();
		names.nameMerge.clickUnMergebutton();
		names.nameMerge.verifyUnNameMergeConfirmMessage();
		//names.nameMerge.verifyUnMergeCancelButtonenabled();
		names.nameMerge.verifyUnmergedCompletedAcknowledgeMessage();
		names.switchToNameMerge();
		names.nameMerge.clickMergeHistory();
		names.nameMerge.verifyNameunmergedSuccessfulMessage();
		names.nameMerge.verifyAtMergeNameIDInUnMergeGrid(0);

	}

//Automated by:- Mahesha   , Date :-   12/10/2021      , Quarter:- Q4  , Sprint:-5  , Module:-  Names   .
	@Test(groups = { "ReleaseBroken" })
	public void SuspectInquirySearch_285051(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "285051");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Suspect Search");
		names.switchToSuspectSearch();
		names.suspectSearch.clickSearch();
		names.suspectSearch.verifyRecordsListed();
		names.suspectSearch.clickBackButton();

		names.suspectSearch.clickResetButton();
		names.suspectSearch.EnterHeight();
		names.suspectSearch.clickSearch();
		names.suspectSearch.verifyAtHeightInGrid();
		names.suspectSearch.clickBackButton();

		names.suspectSearch.clickResetButton();
		names.suspectSearch.EnterAtAge();
		names.suspectSearch.clickSearch();
		names.suspectSearch.verifyAtAgeInGrid();
		names.suspectSearch.clickBackButton();

		names.suspectSearch.clickResetButton();
		names.suspectSearch.EnterWeight();
		names.suspectSearch.clickSearch();
		names.suspectSearch.verifyAtWeightInGrid();
		names.suspectSearch.clickBackButton();
		names.suspectSearch.clickResetButton();

		names.suspectSearch.EnterAtLastNameFirstName();
		names.suspectSearch.clickSearch();
		names.suspectSearch.verifyAtNameInGrid();
		names.suspectSearch.clickBackButton();

		names.suspectSearch.clickResetButton();
		names.suspectSearch.EnterAtLastName1FirstName1();
		names.suspectSearch.EnterWeight();
		names.suspectSearch.clickSearch();
		names.suspectSearch.verifyNoRecordsFoundAcknowledge();
		names.switchToSuspectSearch();

	}


 //Automated by:-Dinesh , Date :-28/12/2021 , Quarter:-4 , Sprint:-6 , Module:-Names .
	@Test(groups = { "" })
	public void ImplementingNewDataSearchFunctionalityInQAForms_289920(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "289920");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.ClickQaFormTab();
		names.nameSearch.nameSearchQAFormTab.selectAtSelectForm();
		names.nameSearch.nameSearchQAFormTab.clickSearchButton();
		names.nameSearch.nameSearchQAFormTab.ClickFormInGrid();
		// need to add a method to close the form.unable to replicate due to data set not available.
		names.switchToNameSearch();
		names.nameSearch.ClickQaFormTab();
		names.nameSearch.nameSearchQAFormTab.clickIncludeOnlyFormsCheckBox();
		names.nameSearch.nameSearchQAFormTab.clickSearchButton();
		names.nameSearch.nameSearchQAFormTab.ClickFormInGrid();
		// need to add a method to close the form.unable to replicate due to data set not available.
		names.switchToNameSearch();
		names.nameSearch.ClickQaFormTab();
		names.nameSearch.nameSearchQAFormTab.clickResetButton();
		names.switchToNameSearch();
		names.nameSearch.ClickQaFormTab();
		names.nameSearch.nameSearchQAFormTab.enterAtSearchWords();
		names.nameSearch.nameSearchQAFormTab.clickSearchButton();
		names.nameSearch.nameSearchQAFormTab.ClickFormInGrid();
		// need to add a method to close the form.unable to replicate due to data set not available.
		names.switchToNameSearch();
		names.nameSearch.ClickQaFormTab();
		names.nameSearch.nameSearchQAFormTab.enterAtFromDate();
		names.nameSearch.nameSearchQAFormTab.enterAtToDate();
		names.nameSearch.nameSearchQAFormTab.clickSearchButton();
		names.nameSearch.nameSearchQAFormTab.ClickFormInGrid();
		// need to add a method to close the form.unable to replicate due to data set not available.
		objectIdentification.windowHandle.switchToMainWindow();
	}

	// Automated by Stalin // Date :01/03/2021 //Quarter:04 // Sprint:06 //Module: Names
	@Test
	public void AddFlagonPhonesimilartoAddressNameandVehicleFlags_284325(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "284325");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Names");
	loader.navigateToScreen("Name Search");
	names.switchToNameSearch();
	names.nameSearch.enterAtNameID();
	names.nameSearch.clickSearchButton();
	names.nameSearch.ClickAtNameID();
	names.switchToNameEntry();
	names.nameEntry.switchToPhonesTab();
	names.nameEntry.phoneTab.VerifyAtPhoneNoInGrid(0);
	names.nameEntry.phoneTab.verifyFlagIconIsNotDisplayedInGrid(0);
	names.switchToNameEntry();
	names.nameEntry.switchToNameEntryFlagTab();
	names.nameEntry.nameEntryFlagTab.ClickAddNewButton();
	names.nameEntry.nameEntryFlagTab.selectAtFlags();
	names.nameEntry.nameEntryFlagTab.enterAtEnteredBy();
	names.nameEntry.nameEntryFlagTab.TabEnteredDate();
	names.nameEntry.nameEntryFlagTab.EnterActiveDate(); //Action Updated
	names.nameEntry.nameEntryFlagTab.EnterExpiredDate();
	names.nameEntry.nameEntryFlagTab.EnterAuthorizedBy();
	names.nameEntry.nameEntryFlagTab.EnterComment();
	names.nameEntry.nameEntryFlagTab.selectAtLinkedPhoneNumber();
	names.nameEntry.nameEntryFlagTab.ClickAddButton();
	names.switchToNameEntry();
	names.nameEntry.SaveWithConfirmMessage();
	names.switchToNameEntry();
	names.nameEntry.switchToPhonesTab();
	names.nameEntry.phoneTab.verifyFlagIconIsDisplayedInGrid(0);
	names.nameEntry.phoneTab.clickFlagIconInGrid(0);
	names.switchToNameEntry();
	names.nameEntry.switchToNameEntryFlagTab();
	names.nameEntry.nameEntryFlagTab.verifyAtFlags();
	names.switchToNameEntry();
	names.nameEntry.switchToPhonesTab();
	names.nameEntry.phoneTab.verifyUpdateButtonIsDisplayed();
	names.nameEntry.phoneTab.ClickAddButton();
	names.switchToNameEntry();
	names.nameEntry.SaveNCloseScreen();
	names.switchToNameSearch();
	loader.navigateToModule("Home");
	loader.navigateToScreen("My Home");
	home.switchToMyHomeScreen();
	home.myHome.SwitchToMyRemindersTab();
	home.myHome.myRemindersTab.clickPhoneNumberFlagsAccordion();
	home.myHome.myRemindersTab.verifyAtPhoneNoInPhoneNumberFlagsGrid();
	home.myHome.myRemindersTab.verifyAtFlagInInPhoneNumberFlagsGrid();
	home.switchToMyHomeScreen();

	}
	//Reworked by:- Dinesh , Date :-02/01/2022 , Quarter:-1 , Sprint:-3 , Module:-Names .

		@Test(groups = { "namesFunctional1" })
		public void NameEntryDNATab_135719(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "135719");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Name Search");
			names.switchToNameSearch();
			names.nameSearch.EnterAtLastName();
			names.nameSearch.EnterAtFirstName();
			names.nameSearch.clickSearchButton();
			names.nameSearch.VerifyAtNameUsingLastNameFirstName(0);
			names.nameSearch.ClickAtName();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.ClickInternalSaveButton();
			names.nameEntry.dNATab.VerifyNoDataPresentAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.ClickAddButton();
			names.nameEntry.dNATab.VerifyCaseNoAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.EnterAtCaseNo();
			names.nameEntry.dNATab.ClickAddButton();
			names.nameEntry.dNATab.VerifySampleCollectedAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.ClickSampleCollectedYes();
			names.nameEntry.dNATab.ClickAddButton();
			names.nameEntry.dNATab.VerifyReasonAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.SelectReason();
			names.nameEntry.dNATab.ClickAddButton();
			names.nameEntry.dNATab.VerifyCollectedByAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.EnterAtCollectedByPFCode();
			names.nameEntry.dNATab.ClickAddButton();
			names.nameEntry.dNATab.VerifyCollectionDateAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.EnterCollectionDateAndTime();
			names.nameEntry.dNATab.ClickInternalSaveButton();
			names.nameEntry.dNATab.VerifyInternalDNAUpdateAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.ClickAddButton();
			names.nameEntry.dNATab.VerifyAtCaseNumberInGrid(0);
			names.nameEntry.dNATab.VerifyCollectionDateAsCurrentDate(0);
			names.switchToNameEntry();
			names.nameEntry.ClickSaveButton();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.VerifyDNATabUpdateAcknowledgeMessage();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.InternalSave();
			names.switchToNameEntry();
			names.nameEntry.switchToDNATab();
			names.nameEntry.dNATab.VerifyBottomStatusMessage();

		}

		@Test(groups = { "gang" })
	public void GangFunctionality_173284(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 173284);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Gang Search");
		names.switchToGangSearch();
		names.gangSearch.ClickAddNew();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickSave();
		names.gangMasterEntry.Verify8EnterMandatoryDataAckMsg();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.EnterAtGangName();
		names.gangMasterEntry.EnterDateEstablishedAsCurrentDate();
		names.gangMasterEntry.EnterEstimatedMembers();
		names.gangMasterEntry.EnterAtAddress1();
		names.gangMasterEntry.SaveScreen();
		names.gangMasterEntry.VerifyAdditionSccessful();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickIdentificationTab();
		names.gangMasterEntry.switchToMembersImageFrame();
		names.gangMasterEntry.identificationTab.VerifyAddImageGridDisplayed();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.VerifyAdditionSccessful();
		names.switchToGangMasterEntry();
		names.switchToGangSearch();
		names.gangSearch.VerifyAtGangName(0);
		names.gangSearch.VerifyKnownMembersAs0(0);
		names.gangSearch.SelectRowByAtGangName();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.verifyAtGangName();
		names.gangMasterEntry.verifyAtEstablishedDateAsCurrentDate();
		names.gangMasterEntry.verifyAtAddress();
		names.gangMasterEntry.verifyAtEstimatedMembers();

	}

	@Test(groups = { "gang" })
	public void GangFunctionality_173285(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 173285);
		// String uIIdentification = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Gang Search");
		names.switchToGangSearch();
		names.gangSearch.EnterAtGangName();
		names.gangSearch.ClickSearch();
		names.gangSearch.VerifyAtGangName(0);
		names.gangSearch.VerifyKnownMembersAs0(0);
		names.gangSearch.SelectRowByAtGangName();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickIdentificationTab();
		names.gangMasterEntry.identificationTab.SelectIdentificationType();
		String uIIdentification = names.gangMasterEntry.identificationTab.GetIdentificationType();
		names.gangMasterEntry.identificationTab.VerifyIdentificationLableTextView(uIIdentification);
		names.gangMasterEntry.identificationTab.SelectAtIdentificationType();
		names.gangMasterEntry.identificationTab.SelectAtSymbols();
		names.gangMasterEntry.identificationTab.EnterDescription();
		names.gangMasterEntry.identificationTab.ClickAddButton();
		names.gangMasterEntry.identificationTab.VerifyAtIdentificationTypeInGrid();
		names.gangMasterEntry.SaveScreen();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.VerifyUpdateSuccessfulMessage();

	}

	@Test(groups = { "gang" }) // members Tab Functionality
	public void GangFunctionality_173286(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 173286);
		// String uIIdentification = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Gang Search");
		names.switchToGangSearch();
		names.gangSearch.EnterAtGangName();
		names.gangSearch.ClickSearch();
		names.gangSearch.VerifyAtGangName(0);
		names.gangSearch.VerifyKnownMembersAs0(0);
		names.gangSearch.SelectRowByAtGangName();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickMembersTab();
		names.gangMasterEntry.membersTab.VerifyAffiliateNameToGangButtonDisabled();
		names.gangMasterEntry.membersTab.EnterAtNameID();
		names.gangMasterEntry.membersTab.VerifyAffiliateNameToGangButtonEnabled();
		names.gangMasterEntry.membersTab.ClickAffiliateNameToGangButton();
		names.switchToGangDetail();
		names.gangDetailEntry.VerifyAtGangName();
		names.gangDetailEntry.VerifyAtNameID();
		names.gangDetailEntry.ClickMainTab();
		names.gangDetailEntry.gangDetailMainTab.EnterAffiliationDateAsCurrentDate();
		names.gangDetailEntry.gangDetailMainTab.SelectAtStatus();
		names.gangDetailEntry.gangDetailMainTab.EnterCurrentStatusDateAsCurrentDate();
		names.gangDetailEntry.gangDetailMainTab.SelectAtRank();
		names.gangDetailEntry.gangDetailMainTab.EnterAtLocationOfActivity();
		names.gangDetailEntry.gangDetailMainTab.ClickGangTattoosCheckbox();
		names.gangDetailEntry.gangDetailMainTab.ClickJudicalFindingCheckbox();
		names.gangDetailEntry.gangDetailMainTab.ClickPossessionOfGangMaterialCheckbox();
		// names.gangDetailEntry.gangDetailMainTab.ClickSelfAdmissionCheckbox();
		names.gangDetailEntry.gangDetailMainTab.EnterComments();
		names.gangDetailEntry.ClickIdentificationTab();
		names.gangDetailEntry.gangDetailIdentificationTab.SelectIdentificationType();
		String uIIdentification = names.gangDetailEntry.gangDetailIdentificationTab.GetIdentificationType();
		names.gangDetailEntry.gangDetailIdentificationTab.VerifyTextcodeLableTextView(uIIdentification);

		names.gangDetailEntry.gangDetailIdentificationTab.SelectAtIdentificationType();
		names.gangDetailEntry.gangDetailIdentificationTab.SelectAtGraffiti();
		names.gangDetailEntry.gangDetailIdentificationTab.EnterDescription();
		names.gangDetailEntry.gangDetailIdentificationTab.ClickAddButton();
		names.gangDetailEntry.gangDetailIdentificationTab.VerifyAtIdentificationTypeInGrid();
		names.gangDetailEntry.Save();
		names.gangDetailEntry.gangDetailIdentificationTab.VerifyAtIdentificationTypeInGrid();
		names.switchToGangDetail();
		names.gangDetailEntry.VerifyAdditionSucessfulMessageMessage();
		names.gangDetailEntry.CloseScreen();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.SaveScreen();
		names.gangMasterEntry.VerifyUpdateSuccessfulMessage();

		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickMembersTab();
		names.gangMasterEntry.membersTab.VerifyAtNameInGrid();
		names.gangMasterEntry.membersTab.VerifyAffliatedDateAsCurrentDateInGird(0);
		names.gangMasterEntry.membersTab.ClickNameMining1ImageIcon();
		names.switchToNamesMiningScreen();
		names.nameMining.VerifyNameMiningButtonsEnabled();
		names.nameMining.CloseNameMiningScreen();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickMembersTab();
		names.gangMasterEntry.membersTab.ClickAtNameInGrid();
		names.switchToGangDetail();
		names.gangDetailEntry.ClickNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToGangTab();
		names.nameEntry.gangTab.VerifyAtGangNameUsingAffiliatedDate();
		names.nameEntry.gangTab.VerifyRankAsCUsingGangName();
		names.nameEntry.gangTab.VerifyStatusAsNUsingGangName();
		names.nameEntry.gangTab.VerifyAtLocationOfActivityUsingGangName();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		names.switchToGangDetail();
		names.gangDetailEntry.CloseScreen();
		names.switchToGangSearch();

		names.gangSearch.VerifyAtGangName(0);

		names.gangSearch.verifyAtKnownMember(0);
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "gang" })
	public void GangFunctionality_173287(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 173287);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Gang Search");
		names.switchToGangSearch();
		names.gangSearch.EnterAtGangName();
		names.gangSearch.ClickSearch();
		names.gangSearch.VerifyAtGangName(0);
		names.gangSearch.SelectRowByAtGangName();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickMapTab();
		names.gangMasterEntry.gangMapTab.selectAtOverlay();
		names.gangMasterEntry.gangMapTab.ClickMapLayerButton();
		geo.switchToMapLayerEntry();
		// GeoScripts.GeoTestContext = NamesTestContext;
		geo.mapLayerEntry.VerifyLayerTypeAsPolygon();
		geo.mapLayerEntry.VerifyLayerNameAsGang();
		geo.mapLayerEntry.VerifyAtFutureName();
		geo.mapLayerEntry.CloseScreen();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickVehicleTab();
		names.gangMasterEntry.gangVehicleTab.EnterAtVehicle();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickVehicleTab();
		names.gangMasterEntry.gangVehicleTab.SelectAtActivity();
		names.gangMasterEntry.gangVehicleTab.ClickAddButton();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickSave();
		names.gangMasterEntry.VerifyAcknowledgeUpdateVehicleTab();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickVehicleTab();
		names.gangMasterEntry.gangVehicleTab.EnterAtVehicle1();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickVehicleTab();
		names.gangMasterEntry.gangVehicleTab.SelectAtActivity();
		names.gangMasterEntry.gangVehicleTab.ClickAddButton();
		names.gangMasterEntry.gangVehicleTab.SaveInternalTab();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickVehicleTab();
		names.gangMasterEntry.gangVehicleTab.VerifyAtVehicleUsingActivity();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.SaveScreen();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.VerifyUpdateSuccessfulMessage();
	}

	@Test(groups = { "gang" })
	public void GangFunctionality_173288(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 173288);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Gang Search");
		names.switchToGangSearch();
		names.gangSearch.EnterAtGangName();
		names.gangSearch.ClickSearch();
		names.gangSearch.VerifyAtGangName(0);
		names.gangSearch.SelectRowByAtGangName();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickActivityTab();
		names.gangMasterEntry.gangActivityTab.SelectAtActivity();
		names.gangMasterEntry.gangActivityTab.VerifyAtPersonNameInGrid(1);
		names.gangMasterEntry.gangActivityTab.ClickCollapseAllCheckBox();
		names.gangMasterEntry.gangActivityTab.ClickActivityRadioButton();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickNotesTab();
		names.gangMasterEntry.gangNotesTab.TabUpdateDateTime();
		names.gangMasterEntry.gangNotesTab.EnterAtUpdatedBy();
		names.gangMasterEntry.gangNotesTab.EnterNotesAsAutomation();
		names.gangMasterEntry.gangNotesTab.ClickAddButton();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.SaveScreen();
		names.gangMasterEntry.VerifyUpdateSuccessfulMessage();

		names.switchToGangMasterEntry();
		names.gangMasterEntry.ClickNotesTab();
		names.gangMasterEntry.gangNotesTab.ClickEditIcon();
		names.gangMasterEntry.gangNotesTab.EnterPopupNotesAsAutomationWorks();
		names.gangMasterEntry.gangNotesTab.ClickPopupSaveButton();
		names.gangMasterEntry.gangNotesTab.VerifyNotesUpdated();
		names.gangMasterEntry.gangNotesTab.ClickShowAllCheckBox();
		names.gangMasterEntry.gangNotesTab.ClickDeleteIcon();
		names.switchToGangMasterEntry();
		names.gangMasterEntry.SaveScreen();
		names.gangMasterEntry.VerifyUpdateSuccessfulMessage();

		names.gangMasterEntry.ClickNotesTab();
		names.gangMasterEntry.gangNotesTab.verifyAtGridIsEmpty();

	}

	@Test(groups = { "socialMedia" })
	public void CreateNewSocialMediaSitesDetails_124013(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124013);
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Social Media Sites");
		names.switchToSocialMediaSitesScreen();
		names.socialMediaSites.ClickAddNew();
		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.ClickGplusImageIcon();
		names.socialMediaSitesEntry.VerifyAtMediaTypeStatus();
		names.socialMediaSitesEntry.VerifyAtURL();
		names.socialMediaSitesEntry.ClickSaveButton();
		names.socialMediaSitesEntry.VerifyAcknowledgeCategoryMessage();
		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.SelectAtUCCategory();
		names.socialMediaSitesEntry.ClickSaveButton();
		names.socialMediaSitesEntry.VerifyAcknowledgeUCNameMessage();
		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.EnterAtUCAccountName();
		names.socialMediaSitesEntry.EnterAtUCUserName();
		names.socialMediaSitesEntry.EnterUCAccountPassword();
		names.socialMediaSitesEntry.EnterAtSiteID();
		names.socialMediaSitesEntry.EnterNotes();
		names.socialMediaSitesEntry.SaveScreen();
		names.socialMediaSitesEntry.verifyAdditionalSucessFullMessage();

		names.socialMediaSitesEntry.ClickLaunchBrowserButton();
		names.switchToGooglePlusLoginScreen();
		names.socialMediaSitesEntry.CloseScreen();
		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.SaveScreen();
		names.socialMediaSitesEntry.verifyUpdateSuccessFullBottomMessage();
		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.CloseScreen();
		names.switchToSocialMediaSitesScreen();
		names.socialMediaSites.SelectAtSelectMediaType();
		names.socialMediaSites.SelectAtCategory();
		names.socialMediaSites.EnterAtUCName();
		names.socialMediaSites.ClickSearchButton();
		names.socialMediaSites.VerifyAtMediaType(0);
		names.socialMediaSites.VerifyAtUCCategory(0);
		names.socialMediaSites.VerifyAtUCName(0);

		names.socialMediaSites.clickMediaTypeAtRow();

		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.VerifyAtMediaTypeStatus();
		names.socialMediaSitesEntry.verifyAtUCCategory();
		names.socialMediaSitesEntry.VerifyAtURL();
		names.socialMediaSitesEntry.clickInactiveCheckBox();
		names.socialMediaSitesEntry.SaveScreen();
		names.socialMediaSitesEntry.verifyUpdateSuccessFullBottomMessage();

		names.switchToSocialMediaSitesScreen();
		names.socialMediaSites.SelectAtSelectMediaType();
		names.socialMediaSites.SelectAtCategory();
		names.socialMediaSites.EnterAtUCName();
		names.socialMediaSites.clickInActiveCheckBox();
		names.socialMediaSites.ClickSearchButton();
		names.socialMediaSites.verifyMediaTypeISGreyOut();

	}

	@Test(groups = { "socialMedia" })
	public void VerifySocialMediaTab_124014(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124014);
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.VerifySocialMediaTabDisplayed();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.VerifyCriteriaTabEnabled();
		names.nameEntry.socialMediaTab.VerifySiteNHistoryTabDisabled();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
	}

	@Test(groups = { "socialMedia" })
	public void VerifyCriteriaTab_124015(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124015);
		String Year, Number = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.VerifyCriteriaTabEnabled();
		names.nameEntry.socialMediaTab.VerifySiteNHistoryTabDisabled();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.ClickSaveButton();
		names.socialMediaTabs.criteriaTab.OKWithWebPageAlertWindowMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		// names.socialMediaTabs.criteriaTab.ClickFirst2CheckBoxIdentification();
		names.socialMediaTabs.criteriaTab.ClickFirst3CheckBoxIdentification();
		names.socialMediaTabs.criteriaTab.ClickSaveButton();
		names.socialMediaTabs.criteriaTab.OKWithWebPageAlertWindowMessage();
		// names.socialMediaTabs.criteriaTab.OKWithWebPageAlertWindowMessage3Items();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.ClickAllCheckBoxJustification();

		names.socialMediaTabs.criteriaTab.ClickSaveButton();
		names.socialMediaTabs.criteriaTab.VerifyAcknowledgeCaseNoMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.EnterCaseNo();
		names.socialMediaTabs.criteriaTab.ClickAddMoreButton();
		names.socialMediaTabs.criteriaTab.EnterCaseNo2();
		names.socialMediaTabs.criteriaTab.ClickDeleteCaseNo();
		names.socialMediaTabs.criteriaTab.VerifyConfirmationDeleteMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.ClickAllCheckBoxIdentificarion();
		names.socialMediaTabs.criteriaTab.ClickSaveButton();
		names.socialMediaTabs.criteriaTab.VerifyAcknowledgePhoneNoMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.EnterPhoneNo();
		names.socialMediaTabs.criteriaTab.ClickSaveButton();
		names.socialMediaTabs.criteriaTab.VerifyAcknowledgeEmailMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.EnterWrongEMail();
		names.socialMediaTabs.criteriaTab.ClickSaveButton();
		if (Playback.browserType.contains("Chrome")) {
			names.socialMediaTabs.criteriaTab.VerifyAcknowledgeSpecifyMessage();
			names.socialMediaTabs.criteriaTab.VerifyAcknowledgeValidEmailMessage();
		} else {
			names.socialMediaTabs.criteriaTab.VerifyAcknowledgeValidEmailMessage();
			names.socialMediaTabs.criteriaTab.VerifyAcknowledgeSpecifyMessage();
		}
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.EntervalidEMail();
		names.socialMediaTabs.criteriaTab.EnterSpecifyOwnValue();
		names.socialMediaTabs.criteriaTab.ClickGenerateNoCheckbox();

		names.socialMediaTabs.criteriaTab.EnterInformationVerifiedOnCurrentDate();
		names.socialMediaTabs.criteriaTab.EnterAtInformationverifiedPFCode();
		names.socialMediaTabs.criteriaTab.VerifyNextReminderDate(); // issue on date calculation
		names.socialMediaTabs.criteriaTab.SaveCriteriaTab();

		String confidentialSourceID1 = names.socialMediaTabs.criteriaTab.getConfidentialSourceID1();

		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();

		names.nameEntry.socialMediaTab.VerifySiteNHistoryTabEnabled();
		names.nameEntry.socialMediaTab.ClickAllTabs();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		names.socialMediaTabs.criteriaTab.VerifyConfidentialSourceID(confidentialSourceID1);
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		names.nameEntry.verifySocialMediaTabChangeAsBlue();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();

	}

	@Test(groups = { "socialMedia" }) // URL Need to add Gor Case Number
	public void AddNewSitesDetailsandDelete_124557(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124557);
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();

		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToSitesTab();
		names.socialMediaTabs.sitesTab.ClickAddButton();
		names.socialMediaTabs.sitesTab.VerifyAcknowledgeMediaTypeMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToSitesTab();
		names.socialMediaTabs.sitesTab.ClickGplusSocialMediaIcon();
		names.socialMediaTabs.sitesTab.VerifyAtMediaTypeStatus();
		names.socialMediaTabs.sitesTab.ClickAddButton();
		names.socialMediaTabs.sitesTab.VerifyAcknowledgeUserNameMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToSitesTab();
		names.socialMediaTabs.sitesTab.EnterUserName();
		names.socialMediaTabs.sitesTab.EnterNotes();
		names.socialMediaTabs.sitesTab.enterSitesId();

		// names.socialMediaTabs.sitesTab.enterAtURL();

		names.socialMediaTabs.sitesTab.ClickSaveButton();
		names.socialMediaTabs.sitesTab.VerifyAcknowledgeUpdateMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToSitesTab();
		names.socialMediaTabs.sitesTab.ClickAddButton();
		// names.socialMediaTabs.sitesTab.VerifyMediaTypeAddedGrid(0);
		names.socialMediaTabs.sitesTab.SaveSitesTab();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.nameEntry.VerifyUpdateSuccessfulStatusMessage();

		names.nameEntry.switchToSocialMediaTab();

		names.nameEntry.socialMediaTab.switchToSitesTab();
		names.socialMediaTabs.sitesTab.VerifyUserNameAddedGrid(0);
		names.socialMediaTabs.sitesTab.VerifySiteIDAddedGrid(0);
		names.socialMediaTabs.sitesTab.verifyNotesAddedInGrid(0);
		names.socialMediaTabs.sitesTab.ClickAtUserName();
		names.socialMediaTabs.sitesTab.SelectAtFriendStatus();
		names.socialMediaTabs.sitesTab.clickUpdateButton();
		names.socialMediaTabs.sitesTab.VerifyFriendStatusAddedGrid(0);
		names.socialMediaTabs.sitesTab.SaveSitesTab();
		names.socialMediaTabs.sitesTab.verifySitesTabUpdateSuccessfulBottomMessage();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToHistoryTab();
		names.socialMediaTabs.socialMediaHistoryTab.VerifySiteDetailsInGrid();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToSitesTab();
		names.socialMediaTabs.sitesTab.DeleteByUserName();
		names.socialMediaTabs.sitesTab.SaveSitesTab();
		names.socialMediaTabs.sitesTab.VerifyMediaTypeDeletedGrid();
		names.socialMediaTabs.sitesTab.verifySitesTabAdditionsuccessfulBottomMessage();

		// names.socialMediaTabs.sitesTab.VerifyUCAccountNameAddedGrid(0);

	}

	@Test(groups = { "socialMedia" }, priority = 1)
	public void VerifySitesTab_124017(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124017);
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		/*
		 * names.switchToNameEntry(); names.nameEntry.switchToSocialMediaTab();
		 * names.nameEntry.socialMediaTab.VerifyCriteriaTabEnabled();
		 * names.nameEntry.socialMediaTab.VerifySiteNHistoryTabEnabled();
		 * names.nameEntry.socialMediaTab.switchToSitesTab();
		 * names.socialMediaTabs.sitesTab.SelectAtUCAccountName();
		 * names.socialMediaTabs.sitesTab.VerifyAtMediaTypeStatus();
		 * names.socialMediaTabs.sitesTab.VerifyAtURL();
		 * names.socialMediaTabs.sitesTab.VerifyAtUCUserName();
		 * names.socialMediaTabs.sitesTab.VerifyAtSiteID();
		 * names.socialMediaTabs.sitesTab.ClickLaunchBrowserButton();
		 * names.switchToGooglePlusLoginScreen();
		 * names.socialMediaTabs.sitesTab.verifyGoolePlusScreenLoaded();
		 * names.CloseGooglePlusLoginScreen(); names.switchToNameEntry();
		 * names.nameEntry.switchToSocialMediaTab();
		 * names.nameEntry.socialMediaTab.switchToSitesTab();
		 * names.socialMediaTabs.sitesTab.SelectAtFriendStatus();
		 * names.socialMediaTabs.sitesTab.EnterNotes();
		 * names.socialMediaTabs.sitesTab.ClickAddButton();
		 * names.socialMediaTabs.sitesTab.VerifyUCAccountNameAddedGrid(0);
		 * names.socialMediaTabs.sitesTab.VerifyFriendStatusAddedGrid(0);
		 * names.socialMediaTabs.sitesTab.SaveSitesTab();
		 * 
		 * names.switchToNameEntry(); names.nameEntry.SaveWithConfirmMessage();
		 * names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		 */
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToSitesTab();
		names.socialMediaTabs.sitesTab.VerifyUCAccountNameAddedGrid(0);
		names.socialMediaTabs.sitesTab.VerifyFriendStatusAddedGrid(0);
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToHistoryTab();
		names.socialMediaTabs.socialMediaHistoryTab.VerifySiteDetailsInGrid();
		names.nameEntry.closeTheScreen();
		loader.navigateToScreen("Social Media Sites");
		names.switchToSocialMediaSitesScreen();
		names.socialMediaSites.SelectAtSelectMediaType();
		names.socialMediaSites.EnterAtUCName();
		names.socialMediaSites.ClickSearchButton();
		names.socialMediaSites.VerifyAtMediaType(0);
		names.socialMediaSites.ClickAtUCNameInGrid();
		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.VerifyAtMediaTypeStatus();
		names.socialMediaSitesEntry.verifyAtUCCategory();
		names.socialMediaSitesEntry.VerifyAtURL();

		names.socialMediaSitesEntry.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToAllTab();
		names.nameEntry.closeTheScreen();
		names.switchToSocialMediaSitesEntryScreen();
		names.socialMediaSitesEntry.SaveScreen();
		names.socialMediaSitesEntry.verifyUpdateSuccessFullBottomMessage();

		// names.switchToSocialMediaSitesEntryScreen();
		// names.socialMediaSitesEntry.CloseScreen();
	}

	@Test(groups = { "socialMedia" })
	public void VerifyHistoryTab_124020(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124020);
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.verifySocialMediaTabChangeAsBlue();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToHistoryTab();
		names.socialMediaTabs.socialMediaHistoryTab.VerifySiteDetailsInGrid();
		names.socialMediaTabs.socialMediaHistoryTab.EnterUpdatedDateandTime();
		names.socialMediaTabs.socialMediaHistoryTab.EnterUpdatedByPF();
		names.socialMediaTabs.socialMediaHistoryTab.EnterAtNotes();
		names.socialMediaTabs.socialMediaHistoryTab.ClickSaveButton();
		names.socialMediaTabs.socialMediaHistoryTab.VerifyAtNotesAdded();
		names.socialMediaTabs.socialMediaHistoryTab.VerifyEditAndDeleteIconViewed();
		names.socialMediaTabs.socialMediaHistoryTab.ClickEditIcon();
		names.socialMediaTabs.socialMediaHistoryTab.EnterAtUpdatedNotes();
		names.socialMediaTabs.socialMediaHistoryTab.SaveUpdatePopupscreen();
		names.socialMediaTabs.socialMediaHistoryTab.VerifyAtUpdatedNotesAdded();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		names.nameEntry.verifySocialMediaTabChangeAsBlue();
		// names.switchToNameEntry();
		// names.nameEntry.closeTheScreen();
	}

	@Test(groups = { "socialMedia" })
	public void verifyaddedhistoryremoved_124021(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124021);
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.verifySocialMediaTabChangeAsBlue();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToHistoryTab();
		names.socialMediaTabs.socialMediaHistoryTab.VerifyAtUpdatedNotesAdded();
		names.socialMediaTabs.socialMediaHistoryTab.VerifyEditAndDeleteIconViewed();
		names.socialMediaTabs.socialMediaHistoryTab.DeleteUpdatedNotes();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToHistoryTab();
		names.socialMediaTabs.socialMediaHistoryTab.VerifyAtUpdatedNotesRemoved();
		names.socialMediaTabs.socialMediaHistoryTab.EnterUpdatedDateandTime();
		names.socialMediaTabs.socialMediaHistoryTab.EnterUpdatedByPF();
		names.socialMediaTabs.socialMediaHistoryTab.ClickReset28CFRVerificationDateCheckBox();
		names.socialMediaTabs.socialMediaHistoryTab.EnterAtNotes();
		names.socialMediaTabs.socialMediaHistoryTab.ClickSaveButton();
		names.socialMediaTabs.socialMediaHistoryTab.VerifyAs28CFRVerification();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
		names.nameEntry.verifySocialMediaTabChangeAsBlue();
		// names.switchToNameEntry();
		// names.nameEntry.closeTheScreen();

	}

	@Test(groups = { "socialMedia" }, priority = 2)
	public void VerifySocialmediaandbatchupdate_124022(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", 124022);
		String SourceIDYear = null;
		String SourceIDNumber = null;
		String NextReminderDate = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
	
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
	
		names.nameSearch.SelectNameTypeAsA();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToSocialMediaTab();
		names.nameEntry.socialMediaTab.switchToCriteriaTab();
		String SourceID = names.socialMediaTabs.criteriaTab.GetConfidentialSourceId();
		String ReminderDate = names.socialMediaTabs.criteriaTab.GetNextReminderDate();
		String VerifiedOnDate = names.socialMediaTabs.criteriaTab.getVerfiedOnDate();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		loader.navigateToScreen("Social Media Search");
		names.switchToSocialMediaSearchScreen();
		names.socialMediaSearch.EnterAtInformationVerifiedPFCode();
		names.socialMediaSearch.EnterConfidentialSourceID(SourceID);
		Playback.threadWait();
		names.socialMediaSearch.ClickSearchButton();

		names.socialMediaSearch.VerifyAsID(SourceID, 0);

		names.socialMediaSearch.VerifyVerifiedOnDate(VerifiedOnDate, 0);

		names.socialMediaSearch.VerifyAsNextReminderDate(ReminderDate, 0);

		names.socialMediaSearch.ClickCheckBoxUsingID(SourceID);

		names.socialMediaSearch.ClickBatchUpdateButton();
		names.socialMediaSearch.EnterAtUpdateVerifiedPFCode();
		names.socialMediaSearch.EnterAsUpdateNextReminderDate();
		names.socialMediaSearch.ClickUpdateButton();
		names.socialMediaSearch.VerifyNewNextReminderDate(0);
		names.socialMediaSearch.ClickResetButton();

		names.socialMediaSearch.SelectAtUCAccountName();
		names.socialMediaSearch.EnterAtSiteID();
		names.socialMediaSearch.EnterConfidentialSourceID(SourceID);
		names.socialMediaSearch.ClickSearchButton();

		names.socialMediaSearch.VerifyAsID(SourceID, 0);

		names.socialMediaSearch.VerifyVerifiedOnAsCurrentDate(0);

		names.socialMediaSearch.VerifyNewNextReminderDate(0);
	}
	@Test(groups = "jailCell", priority = 1)
	public void CellStatusCreateFacilityfromJailCell_124077(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124077);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Jail Cell");
		settings.switchToJailCell();
		settings.jailCell.clickAddNew();
		settings.switchToJailCellEntry();
		settings.jailCellEntry.selectAtFacility();
		settings.jailCellEntry.enterAtCellNo();
		settings.jailCellEntry.selectAtCellType();
		settings.jailCellEntry.enterAtCapacity();
		settings.jailCellEntry.enterAtNotes();
		settings.jailCellEntry.saveScreen();
		settings.jailCellEntry.verifyFooterStatusMessage();
		settings.jailCellEntry.verifyBarcodeIsDisplayed();
		settings.jailCellEntry.saveNCloseScreen();
		settings.switchToJailCell();
		settings.jailCell.verifyCellNoExistsInGridColumn();
		settings.jailCell.verifyNotesExistsInGridColumn();

	}

	@Test(groups = "jailCell", priority = 2)
	public void CellstatusAssignCell_124079(ITestContext testContext) {// CellStatus AssigncellFunctionality

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124079);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.SelectAtFacility();
		names.cellStatus.SelectAtInmateType();
		names.cellStatus.ClickAssignCellButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.EnterAtNameIDDetails();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickSaveButton();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyAcknowledgeCustodyMessage();
		names.switchToCellStatusArrestEntryScreen();// switchToCellStatus
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.SelectAtCustodyReason();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickSaveButton();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyAcknowledgeRisklevelMessage();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterCustodyAlert();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.SelectAtRiskLevel();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterAssignCellAsC1();
		// names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyAcknowledgeInactiveCellMessage();
		settings.switchToJailCellPopupScreen();
		settings.jailCellHelpWindow.closeJailCellPopupScreen();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterAssignCellAsC2();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyConfirmationCellOccupiedMessage();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterAtAssignCellNo();

		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickAssignCellInfoButton();
		settings.switchToJailCellEntry();

		settings.jailCellEntry.verifyJailCellScreenDisplayed();
		settings.jailCellEntry.verifyBarcodeIsDisplayed();

		settings.jailCellEntry.closeScreen();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterAssignBy();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.EnterAssignDateandTime();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.SaveScreen();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyAdditionsucessfulsMessage();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.VerifyAttachmentCellCheckButtonEnabled();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickCellHistoryButton();
		activity.switchToActivitySearchHelpWindow();

		activity.activitySearchHelpWindow.verifyAtActivityType(0);
		activity.activitySearchHelpWindow.closeScreen();
		names.switchToCellStatus();
		names.cellStatus.ClickRefreshButton();
		names.cellStatus.verifyAtDetaineeIDInGrid();
		names.cellStatus.verifyAtName();

	}

	@Test(groups = "jailCell", priority = 3)
	public void CellstatusVerifyNextCheckinMins_124080(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 124080);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Cell Status");
		names.switchToCellStatus();
		names.cellStatus.SelectAtCellNo();
		// names.cellStatus.SelectAllCheckBox();
		names.cellStatus.ClickCellCheckButton();
		names.cellStatus.ClickCategoryCellCheckButton();
		names.cellStatus.ClickActivityOkayAwakeButton();
		names.cellStatus.EnterAtPopupNotes();
		names.cellStatus.PopupSave();
		names.cellStatus.PopupClose();
		names.switchToCellStatus();
		// names.cellStatus.SelectAtCellNo();
		names.cellStatus.SelectAllCheckBox();
		names.cellStatus.VerifyAtNotes(0);
		// names.cellStatus.ClickAtDetaineeID();
		names.cellStatus.ClickCellUpdateButton();
		names.switchToCellStatusArrestEntryScreen();
		names.cellStatusArrestEntry.switchToCellTab();
		names.cellStatusArrestEntry.cellStatusArrestEntryCellTab.ClickCellHistoryButton();
		activity.switchToActivitySearchHelpWindow();

		activity.activitySearchHelpWindow.verifyAtActivityType(0);

	}
	
	//Automated by:-Dinesh , Date :-02/10/2022 , Quarter:-1 , Sprint:-3 , Module:-Names .

		@Test(groups = { "" })
		public void DeleteOptionShouldBeWorkedUnderQAFormsTabInArrestEntryScreen_289831(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "289831");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Names");
			loader.navigateToScreen("Arrest Search");
			names.switchToArrestSearch();
			names.arrestSearch.ClickClearDateButton();
			names.arrestSearch.EnterAtArrestNo();
			names.arrestSearch.ClickSearchButton();
			names.arrestSearch.SelectAtArrestNoInGrid();
			names.switchToArrestEntry();
			names.arrestEntry.switchToQAFormsTab();
			names.arrestEntry.arrestEntryQAFormsTab.verifyGridRowCountAs1();
//			names.arrestEntry.switchToQAFormsTab(); // added newly
			names.arrestEntry.arrestEntryQAFormsTab.deleteFirstRowInGrid();
			names.switchToArrestEntry();
			names.arrestEntry.Save();
			names.switchToArrestEntry();
			names.arrestEntry.verifyUpdateSucessfulStatusMsg();
			names.arrestEntry.switchToQAFormsTab();
			names.arrestEntry.arrestEntryQAFormsTab.verifyGridRowCountAs0();
			
			
		}
	 @AfterMethod(groups = {"2020DefectNameSearch",
			 "2021DefectTestCases",
			 "2020DefectNameEntry",
			 "2020DefectArrest",
			 "2020DefectAttachments",
			 "nameMerge",
			 "AdultArrest",
			 "gang",
			 "jailCell",
			 "2020DefectNameSearch", "2020DefectNameEntry", "2020DefectArrest", "2020DefectExpungement",
			"2020DefectAttachments", "2020DefectNameSearch2", "namesFunctionalAttachment", "namesFunctional2",
			"2021DefectTestcaseNames","Enanchment2022","namesFunctional3","namesFunctional1", "socialMedia"})
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

//			Playback.stop();
//			 ExtentReport.GenerateHTML();
//			login.Reset();
//			loader.Reset();
//			names.Reset();
//			geo.Reset();
//			popup.Reset();
		}
	  @AfterSuite(groups = {"2020DefectNameSearch",
			  "2020DefectNameEntry",
			  "2021DefectTestCases",
			  "2020DefectArrest",
			  "2020DefectAttachments",
			  "nameMerge",
			  "AdultArrest",
			  "gang",
			  "jailCell",
			   "2020DefectNameSearch", "2020DefectNameEntry", "2020DefectArrest", "2020DefectAttachments",
			"2020DefectExpungement", "2020DefectNameSearch2", "namesFunctionalAttachment", "namesFunctional2",
			"2021DefectTestcaseNames","Enanchment2022","namesFunctional3","namesFunctional1", "socialMedia"})
	  public void afterRunSuite()
	  {
		  ExtentReport.GenerateHTML();
	  	 System.gc();
	  	}


}
