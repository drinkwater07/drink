package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Popup;
//import application.Records;
import application.Settings;
import application.Tow;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class VehicleScripts {

	public Geo geo;
	public Vehicle vehicle;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Settings settings;
	public Tow tow;
	public Home home;

	@BeforeSuite(groups = { "2020DefectTestCases", "2021DefectTestCases", "2022DefectTestCasesKIRAN" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "2020DefectTestCases", "2021DefectTestCases", "2022DefectTestCasesKIRAN" })
	public void beforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Vehicle");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		vehicle = new Vehicle();
		geo = new Geo();
		settings = new Settings();
		tow = new Tow();
		home = new Home();
	}

	// Police Sprint Defect CRM's
	@Test
	public void policeSprintVehicle_135827() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		// Settings.SwitchToSystemParamter();
		// Settings.SysParameter.SetSystemparameter406AsRotationbyAreaTowType();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow Rotation");
		vehicle.switchToTowRotation();
		vehicle.towRotation.selectAtPatrolArea();
		vehicle.towRotation.selectAtEquipmentType1();
		vehicle.towRotation.selectAtVendor();
		vehicle.towRotation.selectAtPosition();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.verifyAtVendorNameInGrid();
		vehicle.towRotation.selectAtEquipmentType1();
		vehicle.towRotation.selectAtVendor();
		vehicle.towRotation.selectAtPosition1();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.verifyDuplicateAcknowledgeMessage();
		vehicle.towRotation.selectAtVendor1();
		vehicle.towRotation.selectAtPosition1();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.verifyAtVendorName1InGrid();
		vehicle.towRotation.verifyNoDuplicationInVendorDropdown();
	}

	@Test
	public void police2017Sprint1Vehicle_143761() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		// Settings.SwitchToSystemParamter();
		// Settings.SysParameter.SetSystemparameter406AsRotationbyAreaTowType();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow Rotation");
		vehicle.switchToTowRotation();
		vehicle.towRotation.selectAtPatrolArea();
		vehicle.towRotation.selectAtEquipmentType1();
		vehicle.towRotation.selectAtVendor();
		vehicle.towRotation.selectAtPosition();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.saveScreen();
		vehicle.switchToTowRotation();
		vehicle.towRotation.verifyAtPatrolArea(0);
		vehicle.towRotation.verifyAtVendor(0);
		vehicle.towRotation.clickAtPatrolAreaInGrid();
		vehicle.towRotation.selectPosition();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.saveScreen();
	}

	@Test
	public void police2017Sprint1Vehicle_143763() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter406AsRotationbyAreaCycleTowType();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow Rotation");
		vehicle.switchToTowRotation();
		vehicle.towRotation.selectAtPatrolArea();
		vehicle.towRotation.selectAtEquipmentType1();
		vehicle.towRotation.selectAtVendor();
		vehicle.towRotation.selectAtPosition();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.saveScreen();
		vehicle.towRotation.verifyAtPatrolArea(0);
		vehicle.towRotation.verifyAtVendor(0);
		vehicle.towRotation.clickAtPatrolAreaInGrid();
		vehicle.towRotation.selectPosition();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.saveScreen();

	}

	@Test
	public void police2017Sprint2Vehicle_148438() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		Playback.controlReadyThreadWait();
		vehicle.vehicleBoatSearch.vehicleTab.enterAtVehicleNo();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtVehicleNo(0);
		vehicle.vehicleBoatSearch.clickRowAtVehicleNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickFlagsTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.enterDateEntered();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.enterEnteredBy();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.selectFlag();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.enterComments();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickCommentIconInGrid(0);
		popup.acknowledge.remarksAcknowledgeOk();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickRefresh();
		vehicle.vehicleBoatSearch.verifyFlagIconInSearchscreen(0);
		Playback.controlReadyThreadWait();
		vehicle.vehicleBoatSearch.clickFlagIconInSearchScreen(0);
		vehicle.switchToVehicleFlagDetailsScreen();
		vehicle.vehicleFlagDetailsScreen.verifyCurrentDate(0);
		vehicle.vehicleFlagDetailsScreen.verifyFlagIconInFlagDetailScreen(0);
		vehicle.vehicleFlagDetailsScreen.closeScreen();
	}

	@Test
	public void police2017Sprint2Vehicle_149530() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickAddBoat();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSaveButton();
		vehicle.vehicleBoatEntry.verifyRegistrationNumberAcknowledgeMessage();
		vehicle.vehicleBoatEntry.enterAtBoatHullNo();
		vehicle.vehicleBoatEntry.enterAtYear();
		vehicle.vehicleBoatEntry.enterAtMake();
		vehicle.vehicleBoatEntry.enterAtPropulsion();
		vehicle.vehicleBoatEntry.enterAtMaterial();
		vehicle.vehicleBoatEntry.enterLength();
		vehicle.vehicleBoatEntry.selectVOD();
		vehicle.vehicleBoatEntry.enterDescription();
		vehicle.vehicleBoatEntry.saveAndCloseScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickBack();
		vehicle.vehicleBoatSearch.clickBoatTab();
		vehicle.vehicleBoatSearch.enterAtBoatHullNo();
		vehicle.vehicleBoatSearch.enterAtYear();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtBoatHullNo(0);
		vehicle.vehicleBoatSearch.verifyAtYear(0);
		vehicle.vehicleBoatSearch.clickRowAtBoatHullNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterAtRegistrationNo();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectStateAsWI();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterPlateExpireMonthAndYear();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectStatusAsActive();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectColors();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectPlateType();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterName();
		// Names.NameSearchHelpWindow.selectName();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.clickAddButton();
		Playback.controlReadyThreadWait();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAtRegistrationAndState();
		vehicle.vehicleBoatEntry.saveAndCloseScreen();
	}

	@Test
	public void police2017Sprint2Vehicle_147344(ITestContext testContext) {
		testContext.setAttribute("testID", "147344");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Entry");
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterAtPlateNumber();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectStateAsWI();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectStatusAsActive();
		vehicle.vehicleBoatEntry.clickFlagsTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.enterPreviousDateEntered();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.selectAtFlag();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.verifyAtFlagInGrid(0);
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.enterFutureDateEntered();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.selectAtFlag();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.verifyFutureDateAcknowledgeMessage();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickClearButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.enterDateEntered();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.selectAtFlag();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.verifyDuplicationAcknowledgeMessage();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.selectAtFlag1();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.verifyAtFlag1InGrid(1);
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.vehicleBoatEntry.closeScreen();

	}

	@Test
	public void police2017Sprint13Vehicle_153263() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickAddVehicle();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.enterAtVinNo();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.vehicleBoatEntry.verifyVinNoDuplicationAlertMessage();
		vehicle.vehicleBoatEntry.saveAndCloseScreen();
		vehicle.vehicleBoatEntry.verifyVinNoDuplicationAlertMessage();

	}

	@Test
	public void police2017Sprint13Vehicle_153239() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.vehicleTab.enterAtVinNumber();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.clickRowAtVinNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.enterAtVinNo1();
		vehicle.vehicleBoatEntry.enterAtYear();
		vehicle.vehicleBoatEntry.enterAtMake();
		vehicle.vehicleBoatEntry.enterAtModel();
		vehicle.vehicleBoatEntry.enterAtStyle();
		vehicle.vehicleBoatEntry.selectVOD();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtColor1();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAssociationAsModified(0);
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickBack();
		vehicle.vehicleBoatSearch.vehicleTab.enterAtVinNumber();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyNoRecordFoundAcknowledgeMessage();
		vehicle.vehicleBoatSearch.vehicleTab.clickShowAllCheckBox();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyUsingAtVinNoRowRed();
		vehicle.vehicleBoatSearch.verifyUsingVinNo1RowBlackColor();

	}

	@Test

	public void cRM_35977_70890Vehicle_163444() {

		Playback.testContext.setAttribute("testID", "163444");

		// Playback.testContext=testContext;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();

		vehicle.vehicleBoatSearch.enterAtPlate();
		// Test context for out method
		vehicle.vehicleBoatSearch.getPlateID();
		vehicle.vehicleBoatSearch.enterPlate(Playback.testContext.getAttribute("plateID").toString());

		// Enter test data by other moduleMethod
		Playback.threadWait();
		geo.streetEntry.enterAtStreetName();

		// For assigning another test ID to get the another test case data
		Playback.testContext.setAttribute("testID", "147344");
		vehicle.vehicleBoatSearch.enterAtPlate();

		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.clickRowAtVinNo();

		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtNameActivity();
		vehicle.vehicleBoatEntry.clickFlagsTab();

		vehicle.vehicleBoatEntry.clickAttachmentsTab();
		vehicle.vehicleBoatEntry.switchToAttachmentsTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryAttachmentsTab.clickRefershButton();

		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSaveButton();
		popup.acknowledge.ok();

	}

	@Test

	public void cRM_66988Vehicle_163451() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");

		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickAddVehicle();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSaveButton();
		vehicle.vehicleBoatEntry.verify9154EnterPlateNoOrVINNoAckMsg();
		vehicle.vehicleBoatEntry.enterAtVinNo();
		vehicle.vehicleBoatEntry.enterYearAsCurrentYear();
		vehicle.vehicleBoatEntry.selectMake();
		vehicle.vehicleBoatEntry.selectModel();
		vehicle.vehicleBoatEntry.selectStyle();
		vehicle.vehicleBoatEntry.selectInsuranceCompany();
		vehicle.vehicleBoatEntry.enterInsurancePoliceNumber();
		vehicle.vehicleBoatEntry.enterDescription();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterAtPlateNumber();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtState();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectColors();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtColor1();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterName();
		// Names.NameSearchHelpWindow.selectName();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectNameActivity();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAtPlateAndStateInGrid();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.vehicleBoatEntry.closeScreen();
	}

	@Test(groups = { "2020DefectTestCases" }) // Automated By Stalin
	public void VerifyPlateTransferLogic(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "251105");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.clickRowAtVehicleNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAtPlateAndState1(); // need to change
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtStatus();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyPlateAndStateIsDisplayed();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyPlateNoIsNull();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickAddVehicle();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterAtPlateNumber();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtState();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectNameActivity();
		vehicle.vehicleBoatEntry.enterAtVinNo();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickBack();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.enterAtVehicle1();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyUsingAtVinNoRowRed();
		vehicle.vehicleBoatSearch.clickRowAtVehicleNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAssociationAsTransfer(0);

	}

	@Test(groups = { "2020DefectTestCases" })
	public void AddressenteredinTowedFrom(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257679");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.enterAtTowedFrom();
		tow.towEntry.towTab.verifyAndCancel5100PopupMsg();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.enterAtTowedFromCSZ();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtZipCodeInGrid();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.enterAtTowedTo();
		tow.towEntry.towTab.verifyAndCancel5100PopupMsg();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.enterAtTowedToCSZ();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtZipCodeInGrid();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectAtEquipmentUsed();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.save();

	}

	@Test(groups = { "2020DefectTestCases" }) // Automated by Stalin
	public void RefusebuttondeleteInTowEntry(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "259714");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.verifyCallIBubbleIsDisplayed();
		tow.towEntry.verifyAtCaseNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectAtEquipmentUsed();
		tow.towEntry.towTab.selectAtWrecker();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.clickRefuseButton();
		tow.switchToTowRefusePopupScreen();
		tow.towRefusePopUpScreen.enterAtReason();
		tow.towRefusePopUpScreen.clickSaveButton();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.verifyHoldReasonIIconIsDisplayed();
		tow.towEntry.towTab.clickHoldReasonIIcon();
		tow.switchToTowRefusePopupScreen();
		tow.towRefusePopUpScreen.clickDeleteButton();
		tow.switchToTowEntry();

	}

	@Test(groups = { "2020DefectTestCases" }) // Automated by Stalin
	public void TowReasonconfiguration(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256100");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter427AsAbandoned();
		settings.switchToSystemParamter();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.verifyCallIBubbleIsDisplayed();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectAtEquipmentUsed();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastName();

	}

	@Test(groups = { "2020DefectTestCases" }) // Sprint 6 Mahesha
	public void PoliceDefect2020_254466(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254466");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickHoldReasonCheckbox();
		tow.towScreen.verifyHoldReaonCheckBoxIsSelected();
		tow.towScreen.selectAtHoldReasonDropDown();
		tow.towScreen.clickSearchButton();
		tow.towScreen.verifyAtHoldReasonInGrid(0);
		tow.towScreen.selectRowByAtTowNo();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyHoldCheckBoxSelected();
		tow.towEntry.release.verifyAtHoldReason();
		tow.towEntry.release.uncheckHoldCheckbox();
		tow.towEntry.release.verifyHoldReasonDropdownDisabled();
		tow.towEntry.release.clickHoldCheckbox();
		tow.towEntry.release.selectReason();
		tow.towEntry.save();
		tow.switchToTowEntry();

	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S3
	public void RefusedVendordetailsshowninTowRefuseSearchResult_272369(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272369");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickSearchButton();
		tow.towScreen.clickRowByAtCallNo();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.clickRefuseButton();
		tow.switchToTowRefusePopupScreen();
		tow.towRefusePopUpScreen.enterAtReason();
		tow.towRefusePopUpScreen.saveNCloseScreen();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.verify1003UpdateSuccessfulFooterMessage();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.verifyRefuseInfoIconIsDisplayed();
		tow.switchToTowEntry();
		tow.towEntry.closeTheScreen();
		loader.navigateToScreen("Tow Refuse");
		tow.switchToTowRefuseScreen();
		tow.towRefuse.clickSearchButton();
		tow.towRefuse.verifyAtCallNo();
		tow.towRefuse.verifyAtVendor();
		tow.switchToTowRefuseScreen();
	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S3 Ran in 87
	public void UserClickprinticonafteraddingdataunderAreaAssignmenttab_272372(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272372");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow Vendor");
		tow.switchToTowVendor();
		tow.towVendor.clickAddNewButton();
		tow.switchToTowVendorEntry();
		tow.towVendorEntry.enterAtVendorCode();
		tow.towVendorEntry.enterAtTowVendorNameID();
		tow.towVendorEntry.enterAtOfficeContactNo();
		tow.towVendorEntry.save();
		tow.switchToTowVendorEntry();
		tow.towVendorEntry.clickAreaAssignmentTab();
		tow.towVendorEntry.areaAssignment.selectAreaAsPatrolArea1();
		tow.towVendorEntry.areaAssignment.clickAddButton();
		tow.towVendorEntry.areaAssignment.selectAreaAsPatrolArea1();
		tow.towVendorEntry.areaAssignment.clickAddButton();
		tow.towVendorEntry.areaAssignment.verify1019DuplicationDataFoundAckMsg();
		tow.switchToTowVendorEntry();
		tow.towVendorEntry.clickPrintIcon();
		home.switchToSelectReport();
		// home.selectReport.verifyReportNameAsTowVendorDetails();
		home.selectReport.CloseTheScreen();
		tow.switchToTowVendorEntry();

	}

	// Testcase ID – 272370
	@Test(groups = { "2021DefectTestCases" })
	public void VerifyyearandVINNoinTowEntryscreenfromVehicleModule_272370(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272370");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.clickNoPlateCheckbox();
		tow.towEntry.verify7252ConfirmMessage();
		tow.switchToTowEntry();
		tow.towEntry.verifyYearIsEnabled();
		tow.towEntry.verifyMakeIsEnabled();
		tow.towEntry.verifyModelIsEnabled();
		tow.towEntry.verifyColorsIsEnabled();
		tow.towEntry.verifyVINIsEnabled();
		tow.towEntry.verifyStyleIsEnabled();
		tow.towEntry.enterAtYear();
		tow.towEntry.enterAtVINNo();
		tow.switchToTowEntry();
	}

	@Test(groups = { "2021DefectTestCases" }) // Mahesha
	public void VerifyVehicleBoatSearchisaddedwithIncidentActivitydropdownfield_263018(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263018");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.verifyIncidentActivityFieldDisplayed();
		vehicle.vehicleBoatSearch.selectAtIncidentActivity();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyRecordsListedInGrid();
		vehicle.vehicleBoatSearch.clickRowAtVinNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAtNameActivity();
	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S6
	public void ToverifywhetherTowSignaturelogicforReleasedTo_275269(ITestContext testContext) {
		testContext.setAttribute("testID", "275269");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.selectWrecker();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.towEntry.release.enterAtReleasedBy();
		tow.towEntry.release.clickReleasedBySignatureButton();
		home.switchToSignatureScreen();
		home.signatureScreen.clickTypeButton();
		home.signatureScreen.enterAtSignTextArea("Automation");
		home.signatureScreen.clickApplyButton();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();

	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin
	public void ToverifyFleetsectionloadinmyRemainderstab_275264(ITestContext testContext) {
		testContext.setAttribute("testID", "275264");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.clickAddNewButton();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.enterAtFleetID();
		vehicle.fleetEntry.clickMakeSearchIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.randomKPIHelpSelect();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.enterAtModel();
		vehicle.fleetEntry.enterAtYear();
		vehicle.fleetEntry.enterAtVin();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMaintainenceScheduleTab();
		vehicle.fleetEntry.maintenanceScheduleTab.selectAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.selectPeriodAs1Month();
		vehicle.fleetEntry.maintenanceScheduleTab.enterDateAsCurrentDate();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.close();
		vehicle.switchToFleetSearch();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickFleetAccordation();
		home.myHome.myRemindersTab.VerifyAtFleetId();
		home.switchToMyHomeScreen();

	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q3 S1
	public void TocheckwhetherCancelledTowrecordsdisplayinggrayed_275951(ITestContext testContext) {
		testContext.setAttribute("testID", "275951");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickSearchButton();
		tow.towScreen.selectRowByAtTowNo();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectAtTowReason();
		tow.towEntry.verify7251ConfirmMessage();
		tow.switchToTowEntry();
		tow.towEntry.saveNClose();
		tow.switchToTowScreen();
		tow.towScreen.clickBackButton();
		tow.towScreen.selectTowReasonAsCancel();
		tow.towScreen.clickSearchButton();
		tow.towScreen.verifyAtTowNoInGrid();
		tow.towScreen.verifyAtRowViewedAsGrayColor();
		tow.towScreen.clickBackButton();
		tow.switchToTowScreen();

	}

	@Test(groups = { "2021DefectTestCases" }) // Mohan Aug 17 2021
	public void police2020Vehicle_280007(ITestContext testContext) {

		testContext.setAttribute("testID", "280007");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		Playback.controlReadyThreadWait();
		vehicle.vehicleBoatSearch.vehicleTab.enterATWTVNumber();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyNoRecordFoundAcknowledgeMessage();
		vehicle.vehicleBoatSearch.vehicleTab.enterAtCallNo();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyNoRecordFoundAcknowledgeMessage();

	}

	// Automated by TesterName :Mohan Date :8/23/2021 Sprint:-
	@Test(groups = { "2021DefectTestCases" })
	public void ToCheckDateTimeLabelChangeVehicleFlagTab_280016(ITestContext testContext) {
		// ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "280016");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		Playback.controlReadyThreadWait();

		vehicle.vehicleBoatSearch.clickAddBoat();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSaveButton();
		vehicle.vehicleBoatEntry.verifyRegistrationNumberAcknowledgeMessage();

		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.enterAtBoatHullNo();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterAtRegistrationNo();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectStateAsWI();

		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickFlagsTab();

		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.selectFlag();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.verifyEffectiveDateTimeMandatory();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.enterFutureDateEntered();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.selectFlag();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.clickAddButton();
		vehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.verifyAtFlag1InGrid(0);
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.vehicleBoatEntry.closeScreen();

	}

	@Test // Automated by Stalin Q3 s4
	public void VerifyTowEntryReleaseTosignatureclearbuttonfunctionality_280021(ITestContext testContext) {
		testContext.setAttribute("testID", "280021");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter290AsFalse();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickSearchButton();
		tow.towScreen.selectRowByAtTowNo();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.towEntry.release.clickReleaseToSignatureButton();
		home.switchToSignatureScreen();
		home.signatureScreen.clickTypeButton();
		home.signatureScreen.enterAtSignTextArea("AutoTest");
		home.signatureScreen.enterAtName();
		home.signatureScreen.clickApplyButton();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyReleaseToClearButtonIsDisplayed();
		tow.towEntry.release.clickReleaseToClearButton();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.enterAtAuthorizedBy();
		tow.towEntry.towDispositionTab.clickSignatureButton();
		home.switchToSignatureScreen();
		home.signatureScreen.enterAtPassword();
		home.signatureScreen.clickShowSignatureButton();
		home.signatureScreen.clickApplyButton();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.verifyReleasedByClearButtonIsDisplayed();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.verifyReleasedByClearButtonIsDisplayed();
		tow.switchToTowEntry();

	}

	@Test // Automated by Stalin Q3 S5
	public void VerifyReleaseToNamefieldfunctionalitywithsystemparameter427_282074(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "282074");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter427AsAccident();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		String wreckerDropDownValue = tow.towEntry.towTab.getWreckerDropDownValue();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastNameWithActiveWrecker(wreckerDropDownValue);
		tow.towEntry.release.verifyReleaseToLastNameIsDisabled();
		// 9th line testcase doubt
		tow.switchToTowEntry();
		String readTowNo = tow.towEntry.readTowNo();
		tow.towEntry.closeTheScreen();
		// 2nd Scenario
		tow.switchToTowScreen();
		tow.towScreen.verifyAtActiveTowNoRowViewedAsGrayColor(readTowNo);
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber1();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason1();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyReleaseToLastNameIsEmpty();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastName();
		tow.switchToTowEntry();
		String readTowNo1 = tow.towEntry.readTowNo();
		tow.towEntry.closeTheScreen();
		// 3rd scenario
		tow.switchToTowScreen();
		tow.towScreen.verifyAtActiveTowNoRowViewedAsGrayColor(readTowNo1);
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber2();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastName();
		// 23rd line of testcase not able to perform on App
		tow.switchToTowEntry();
		tow.towEntry.closeTheScreen();
		// 4th scenario
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber3();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyReleaseToLastNameIsEmpty();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason1();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastName();
		tow.switchToTowEntry();

	}

	// Automated by Stalin // Date : 10/12/2021 //Quarter: // Sprint:
	// //Module:Vehicle
	// Application is not Supporting
	@Test
	public void TocheckwhetherSignatureisupdating_280018(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "280018");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter290AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickSearchButton();
		tow.towScreen.clickRowByAtCallNo();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.towEntry.release.enterAtReleasedBy();
		tow.towEntry.release.clickReleasedBySignatureCheckBox();
		home.switchToSignatureScreen();
		home.signatureScreen.Close();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.enterAtAuthorizedBy();
		tow.towEntry.towDispositionTab.clickAuthorizedBysignatureCheckBox();
		home.switchToSignatureScreen();
		home.signatureScreen.Close();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();

	}

	@Test // Automated by Stalin Q3 s4
	public void ToverifywhetherTowSignaturelogicforReleasedToReleaseBy_280015(ITestContext testContext) {
		testContext.setAttribute("testID", "280015");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter290AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectWrecker();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.towEntry.release.clickReleaseToSignatureButton();
		home.switchToSignatureScreen();
		home.signatureScreen.verifySignButtonIsDisplayed();
		home.signatureScreen.Close();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleasedBy();
		tow.towEntry.release.verifySignatureCheckBoxIsDisplayed();
		tow.towEntry.release.clickReleasedBySignatureCheckBox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.towEntry.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyReleasedBySignatureCheckBoxIsSelected();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter290AsFalse();
		settings.switchToSystemParamter();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleasedBy();
		tow.towEntry.release.clearReleasedBy();
		tow.towEntry.release.enterAtReleasedBy1();
		tow.towEntry.release.clickReleasedBySignatureCheckBox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.towEntry.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		// tow.towEntry.release.verifyReleasedBySignatureCheckBoxIsSelected(); //As per
		// test the Testcase App is not supporting in this line
		tow.switchToTowEntry();

	}

	@Test // Automated by Stalin Q3 s4
	public void TocheckwhetherReleasedBySignatureshouldshowproperly_280014(ITestContext testContext) {
		testContext.setAttribute("testID", "280014");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter290AsFalse();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectWrecker();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.clickTowDetailsInGrid();
		home.switchToPnxReportSSRSPDFScreen();
		home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.towEntry.release.enterAtReleasedBy();
		tow.towEntry.release.clickReleasedBySignatureButton();
		home.switchToSignatureScreen();
		home.signatureScreen.enterAtPassword();
		home.signatureScreen.clickShowSignatureButton();
		home.signatureScreen.clickApplyButton();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.clickClearButton();
		tow.towEntry.release.clearReleasedBy();
		tow.towEntry.release.enterAtReleasedBy1();
		tow.towEntry.release.clickReleasedBySignatureButton();
		home.switchToSignatureScreen();
		home.signatureScreen.clickTypeButton();
		home.signatureScreen.enterAtSignTextArea("Test");
		home.signatureScreen.clickApplyButton();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.clickTowDetailsInGrid();
		home.switchToPnxReportSSRSPDFScreen();
		home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		tow.switchToTowEntry();

	}

//Automated by Stalin // Date : 10/12/2021 //Quarter:3 // Sprint:4 //Module:Vehicle 

	@Test
	public void TocheckwhetherTowEntryScreenchangeworkingproperly_280013(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "280013");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.clickNoPlateCheckbox();
		tow.towEntry.verify7252ConfirmMessage();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectAtEquipmentUsed();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.verifyCreateCallCheckBoxIsNotDisplayed();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.verifyAtTowFrom();
		tow.towEntry.towTab.verifyAtTowedFromCSZ();
		tow.towEntry.towTab.verifyAtTowedTo();
		tow.towEntry.towTab.verifyAtTowedToCSZ();
		tow.towEntry.towTab.tabOutCancelDateNTime();
		tow.towEntry.towTab.verifyCancelDateNTimeisEmpty();
		tow.switchToTowEntry();
		tow.towEntry.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.verifyAtTowFrom();
		tow.switchToTowEntry();

	}

	@Test // Automated by Stalin Q3 s4
	public void TocheckwhetherSignatureLogicindispositiontabofTowEntry_280012(ITestContext testContext) {
		testContext.setAttribute("testID", "280012");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter290AsFalse();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.enterAtTowNo();
		tow.towScreen.clickSearchButton();
		tow.towScreen.selectRowByAtTowNo();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.enterAtAuthorizedBy();
		tow.towEntry.towDispositionTab.clickSignatureButton();
		home.switchToSignatureScreen();
		home.signatureScreen.enterAtPassword();
		home.signatureScreen.clickShowSignatureButton();
		home.signatureScreen.clickApplyButton();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.verifyClearButtonIsDisplayed();
		tow.towEntry.towDispositionTab.clickClearButton();
		tow.switchToTowEntry();
		tow.towEntry.closeTheScreen();
		tow.switchToTowScreen();
		tow.towScreen.clickBackButton();
		tow.towScreen.clickResetButton();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter290AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.enterAtTowNo();
		tow.towScreen.clickSearchButton();
		tow.towScreen.selectRowByAtTowNo();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.enterAtAuthorizedBy();
		tow.towEntry.towDispositionTab.verifySignatureCheckBoxIsDisplayed();
		tow.towEntry.towDispositionTab.clickSignatureCheckBox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.verifySignatureCheckBoxIsSelected();
		tow.switchToTowEntry();

	}

	@Test // Automated by Stalin Q3 s3
	public void TocheckwhetherLocationofVehiclekeyandTowreason_280011(ITestContext testContext) {
		testContext.setAttribute("testID", "280011");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.verifyLocationOfVehicleKeyIsDisplayed();
		tow.towEntry.selectLocationOfVehicleKeyAsAdd2390();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyAtCodeID();
		settings.sharedCodes.clickAddNewButton();
		settings.sharedCodes.EnterAtPopUpCodeValue();
		settings.sharedCodes.EnterAtPopUpDescription();
		settings.sharedCodes.clickAddButtonInPopUp();
		settings.sharedCodes.clickAddNewButton();
		settings.sharedCodes.enterAtPopUpCodeValue1();
		settings.sharedCodes.enterAtPopUpDescription1();
		settings.sharedCodes.clickAddButtonInPopUp();
		settings.sharedCodes.closeScreen();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.verifyTowResonTextFieldIsDisplayed();
		tow.towEntry.towTab.enterTowReason();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectWrecker();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.selectAtLocationOfVehicleKey();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.selectAtLocationOfVehicleKey1();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.clearTowReason();
		tow.towEntry.towTab.enterAtTowReason();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();

	}

	@Test // Automated by Stalin Q3 s3
	public void TocheckwhetherTypeFieldshowingproperdata_280010(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "280010");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Vehicle/Boat Search");
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickBoatTab();
		vehicle.vehicleBoatSearch.enterAtBoatNo();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtBoatNoDisplaysBoatRecords();
		vehicle.vehicleBoatSearch.selectRowByAtBoatNoInGrid();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtPlateType();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAtPlateTypeDropdown();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickRefresh();
		vehicle.vehicleBoatSearch.verifyAtTypeUsingBoatNoInGrid();
		vehicle.vehicleBoatSearch.clickBack();
		vehicle.vehicleBoatSearch.clickBoatTab();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtBoatNoDisplaysBoatRecords();
		vehicle.vehicleBoatSearch.verifyAtTypeUsingBoatNoInGrid();
		// scenario
		vehicle.vehicleBoatSearch.clickBack();
		vehicle.vehicleBoatSearch.clickReset();
		vehicle.vehicleBoatSearch.clickVehicleTab();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtVehicleNoDisplaysVehicleRecords();
		vehicle.vehicleBoatSearch.clickRowAtVehicleNo1();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtPlateType1();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickRefresh();
		vehicle.vehicleBoatSearch.verifyAtType1UsingVehicleNo1InGrid();
		vehicle.vehicleBoatSearch.clickBack();
		vehicle.vehicleBoatSearch.clickBoatTab();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtBoatNoDisplaysBoatRecords();
		vehicle.vehicleBoatSearch.verifyAtTypeUsingBoatNoInGrid();
		vehicle.switchToVehicleBoatSearch();
		// 2nd scene
		vehicle.vehicleBoatSearch.clickBack();
		vehicle.vehicleBoatSearch.clickReset();
		vehicle.vehicleBoatSearch.clickVehicleTab();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtVehicleNoDisplaysVehicleRecords();
		vehicle.vehicleBoatSearch.clickRowAtVehicleNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtPlateType1();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickRefresh();
		vehicle.vehicleBoatSearch.verifyAtType1UsingVehicleNoInGrid();
		vehicle.vehicleBoatSearch.clickBack();
		vehicle.vehicleBoatSearch.clickBoatTab();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickSearch();
		vehicle.vehicleBoatSearch.verifyAtBoatNoDisplaysBoatRecords();
		vehicle.vehicleBoatSearch.selectRowByAtBoatNo1InGrid();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtPlateType();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickMainTab();
		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAtPlateTypeDropdown();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickRefresh();
		vehicle.vehicleBoatSearch.verifyAtTypeUsingBoatNoInGrid();
		vehicle.switchToVehicleBoatSearch();

	}

	// Automated by KIRAN :- Date :-11/19/2021 Quarter:-4 Sprint:-4 Module:-Vehicle
	@Test(groups = { "2022DefectTestCasesKIRAN" })
	public void ToVerifyTowRotationScreenAreaAndZoneAssignmentTabBasedOnSystemParameterConfiguration406_284328(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "284328");
		Browser.NavigateToLoginScreen();

		login.loginScreen.Logon();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter406As20RotationbyZoneAndTowVendor();
		settings.sysParameter.saveScreen();

		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow Vendor");
		tow.switchToTowVendor();
		tow.towVendor.clickSearchButton();
		tow.towVendor.clickRowByAtVendorCode();
		tow.switchToTowVendorEntry();
		tow.towVendorEntry.clickAreaZoneAssignmentTab();

		tow.towVendorEntry.areaAssignment.selectAtTowZone();
		tow.towVendorEntry.areaAssignment.clickAddButton();
		tow.towVendorEntry.save();

		tow.towVendorEntry.areaAssignment.veifyTowZoneInGrid();

		loader.navigateToScreen("Tow Rotation");
		tow.switchToTowRotation();
		tow.towRotation.verifyAtRotationTypeLAbel(0);
		tow.towRotation.selectAtTowZone();
		tow.towRotation.selectAtVendor();
		tow.towRotation.selectAtPosition();
		tow.towRotation.clickAddButton();
		tow.towRotation.verifyAtVendorNameInGrid();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter406As22RotationbyZoneCycleAndTowVendor();
		settings.sysParameter.saveScreen();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow Rotation");
		tow.switchToTowRotation();
		tow.towRotation.verifyAtRotationTypeLAbel(1);
		tow.towRotation.selectAtTowZone();
		tow.towRotation.verifyAtVendorNameInGrid();
		// ----------------------------------------------------------------------------

	}

//Automated by KIRAN :-     Date :-10/20/2021  Quarter:-4  Sprint:-2 Module:-Vehicle
	@Test(groups = { "2022DefectTestCasesKIRAN" })
	public void VerifyTheTowReasonvaluesshouldautopopulatetheVendorinTowEntryScreen_284329(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "284329");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyAtCodeValueDescriptionInGrid(1);
		settings.sharedCodes.clickAtCodeValueDescription();//
		settings.sharedCodes.SelectAtTowVendor();
		settings.sharedCodes.clickUpdateButton();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();

		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.verifyTowReasonisEnabled();
		tow.towEntry.towTab.selectAtTowReason();
		tow.towEntry.towTab.selectAtEquipmentUsed();

		tow.towEntry.towTab.verifyAtWrecker();
		tow.towEntry.towTab.verifyCurrentDateAutoPopulatesInTowRequestedDate();
		tow.towEntry.save();
		tow.towEntry.verify1002AdditionSuccessfulFooterMessage();

	}

	// Automated by KIRAN :- Date :-10/20/2021 Quarter:-4 Sprint:-1 Module:-Vehicle
	@Test(groups = { "2022DefectTestCasesKIRAN" })
	public void TocheckWhetherUseRGettingWarningMessageProperlyWhenEnteringVINWhichIsAlreadyHavingAnotherVehicle_284326(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "284326");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();

		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatSearch();
		vehicle.vehicleBoatSearch.clickRowAtPlateNo();

		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.verifyTowReasonisEnabled();
		tow.towEntry.towTab.selectAtTowReason();
		tow.towEntry.towTab.selectAtEquipmentUsed();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.clickPlateInfoIcon();// NEW METHOD////
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.enterAtVinNo1();
		vehicle.vehicleBoatEntry.verifyVinNoDuplicationAlertMessage();

		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.towEntry.verify1002AdditionSuccessfulFooterMessage();

	}
	
	//Automated by:-Dinesh , Date :-27/12/2021 , Quarter:-4 , Sprint:-6 , Module:-Vehicle . on hold need to verify flow with with Mahesha.

	@Test(groups = { "" })
	public void VerifyTheTowRelatedScreensFunctionality_289936(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "289936");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow Rotation");
		vehicle.switchToTowRotation();
		vehicle.towRotation.selectAtVendor();
		vehicle.towRotation.selectPosition();
		vehicle.towRotation.clickAddButton();
		vehicle.towRotation.saveScreen();
		vehicle.switchToTowRotation();
		vehicle.towRotation.DeleteAtVendorNameInGrid();
		vehicle.switchToTowRotation();
		vehicle.towRotation.saveScreen();
		vehicle.switchToTowRotation();
	}

	// Automated by KIRAN :- Date :-24/12/2021 Quarter:-4 Sprint:-6 Module:-vehicle
	@Test
	public void VerifyThePlateControlSearchResultGridIfClickedOnTheRowSelectRightClickViewDetailsVehicleEntryScreen_286928(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "286928");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.selectAtPlateState();

		vehicle.switchToVehicleBoatSearchHelpWindow();
		vehicle.vehicleBoatSearchHelpWindow.selectAtVehicleUsingVehicleNo();
		;
		tow.switchToTowEntry();
		tow.towEntry.verifyAtPlateVInNo();
		tow.towEntry.VerifyAtState();
		tow.towEntry.clickRefreshButton();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatSearchHelpWindow();
		vehicle.vehicleBoatSearchHelpWindow.RightClickInStatePlate("V-11");
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.verifyAtPalte();

		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.verifyAtPlateVInNo();
		tow.towEntry.VerifyAtState();

	}

	@AfterMethod(groups = { "2020DefectTestCases", "2021DefectTestCases", "2022DefectTestCasesKIRAN" })
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
		Playback.stop();
		ExtentReport.GenerateHTML();
		login.Reset();
		loader.Reset();
		vehicle.reset();
		geo.Reset();
		popup.Reset();
	}

	@AfterSuite(groups = { "2020DefectTestCases", "2021DefectTestCases", "2022DefectTestCasesKIRAN" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}

}
