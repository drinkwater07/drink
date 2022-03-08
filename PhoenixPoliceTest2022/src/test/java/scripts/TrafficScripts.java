package scripts;

import java.io.IOException;

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
import application.Names;
import application.Personnel;
import application.Popup;
import application.Property;
import application.Records;
import application.Settings;
import application.Traffic;
import application.TrafficWI;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class TrafficScripts 
{
	public Records records;
	public Login login;
	public Loader loader;
	public Names names;
	public Popup popup;
	public Home home;
	public Settings settings;
	public ObjectIdentification objectIdentification;
	public Personnel personnel;
	public Vehicle vehicle;
	public Property property;
	public Traffic traffic;
	public TrafficWI trafficWI;
	public Geo geo;

	@BeforeSuite(groups={"2021DefectTestCases","2020DefectTestCases","ParkingEntryNJ", "CitationNJ", "CrashNJ"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups={"2021DefectTestCases","2020DefectTestCases","ParkingEntryNJ", "CitationNJ", "CrashNJ"})
	public void beforeTestMethod(ITestContext testContext) 
	{

		testContext.setAttribute("moduleName", "Traffic");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		settings = new Settings();
		geo = new Geo();
		traffic = new Traffic();
		trafficWI = new TrafficWI();
		personnel = new Personnel();
		vehicle = new Vehicle();
		property = new Property();
		names = new Names();
		records = new Records();
		home = new Home();

	}
		  
		 @Test(priority = 1, groups = { "CitationNJ" })
	public void TrafficCitationEntry_107802(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107802");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Entry");
		traffic.switchToCitationEntry();
		traffic.citationEntry.selectAtCEType();
		traffic.citationEntry.tabAtDateAndTime();
		traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
		traffic.citationEntry.verifyCitationNoDisabled();
		traffic.citationEntry.enterAtLastName();
		traffic.citationEntry.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		traffic.switchToCitationEntry();
		traffic.citationEntry.clickSaveButton();
		traffic.citationEntry.verifyAcknowledgeCharge();
		traffic.switchToCitationEntry();
	//traffic.switchToCitationEntry();
		traffic.citationEntry.switchToOffenseTab();
		traffic.citationEntry.offenseTab.enterAtCharge();
		traffic.citationEntry.offenseTab.selectAtNIBRS();
		traffic.switchToCitationArrest();
		traffic.citationArrest.selectArmedAsUnarmed();
		traffic.citationArrest.saveCloseScren();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToOffenseTab();
        		traffic.citationEntry.offenseTab.enterAtDescribeLocation();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToPlaintiffTab();
		traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsStateofNewJersey();
		traffic.switchToCitationEntry();
		traffic.citationEntry.save();
		traffic.switchToCitationEntry();
		traffic.citationEntry.verifyOnHoldAppears();
		traffic.citationEntry.switchToAllTabs();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 2, groups = { "CitationNJ" })
	public void TrafficCitationEntryLicenseTab_107978(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107978");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCitationNo(0);
		traffic.citationSearch.verifyName(0);
		// traffic.citationSearch.verifyStatus(0); //Status is not available in
		// PoliceNJAUtomation DB
		traffic.citationSearch.clickAtCitationNo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToLicenseTab();
		traffic.citationEntry.licenseTab.verifyAtDOB();
		traffic.citationEntry.licenseTab.verifyAtGender();
		traffic.citationEntry.licenseTab.verifyAtRace();
		traffic.citationEntry.licenseTab.verifyAtHeight();
		traffic.citationEntry.licenseTab.verifyAtWeight();
		traffic.citationEntry.licenseTab.verifyAtSSNo();
		traffic.citationEntry.licenseTab.verifyAtDrivierLicenseNo();
		traffic.citationEntry.licenseTab.verifyDLCheckBox();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 3, groups = { "CitationNJ" })
	public void TrafficCitationEntryVehicleTab_107979(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107979");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToVehicleTab();
		traffic.citationEntry.citationEntryVehicleTab.clickNoPlateCheckBox();
		traffic.citationEntry.citationEntryVehicleTab.verifyPlateOrVinNoGrayedOut();
		traffic.citationEntry.citationEntryVehicleTab.clickNoPlateCheckBox();
		traffic.citationEntry.citationEntryVehicleTab.enterAtPlateNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToVehicleTab();
		traffic.citationEntry.citationEntryVehicleTab.verifyVehicleInfoButton();
		traffic.citationEntry.citationEntryVehicleTab.verifyAtLicensePlateType();
		traffic.citationEntry.citationEntryVehicleTab.verifyAtIssueState();
		traffic.citationEntry.citationEntryVehicleTab.verifyAtPlateExpirationYear();
		traffic.citationEntry.citationEntryVehicleTab.verifyAtVehicleYear();
		traffic.citationEntry.citationEntryVehicleTab.verifyAtVehicleColor();
		traffic.citationEntry.citationEntryVehicleTab.verifyAtVehicleMake();
		traffic.citationEntry.citationEntryVehicleTab.verifyAtVinNo();
		traffic.switchToCitationEntry();

	}

	@Test(priority = 4, groups = { "CitationNJ" })
	public void TrafficCitationEntryOffenseTab_107981(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107981");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToOffenseTab();
		traffic.citationEntry.offenseTab.verifyAtInThe();
		traffic.citationEntry.offenseTab.verifyAtMunicipality();
		traffic.citationEntry.offenseTab.verifyUnclearPlateCheckBox();
		traffic.citationEntry.offenseTab.verifySatatueOrdinaceCodeValueGrayedOut();
		traffic.citationEntry.offenseTab.verifyAsServiceMethod();
		traffic.switchToCitationEntry();
		traffic.citationEntry.violationsTab.verifyViolationTabDisabled();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 5, groups = { "CitationNJ" })
	public void TrafficCitationEntryPlaintiffTab_108010(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108010");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToPlaintiffTab();
		traffic.citationEntry.plaintiffTab.verifyKPILable();
		traffic.citationEntry.plaintiffTab.verifyAtPliantiffType();
		traffic.citationEntry.plaintiffTab.verifyAtCityVillageTown();
		traffic.citationEntry.plaintiffTab.verifyAtCourtType();
		traffic.citationEntry.plaintiffTab.verifyAtCourt();
		traffic.citationEntry.plaintiffTab.verifyPaymentMethodTranProsOffGrayedOut();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 6, groups = { "CitationNJ" })
	public void TrafficCitationEntryOfficerTab_108019(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108019");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToOfficerTab();
		traffic.citationEntry.officerTab.verifyAtOfficer();
		traffic.citationEntry.officerTab.selectIssuingOfficer();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToOfficerTab();
		traffic.citationEntry.officerTab.selectArea();
		traffic.citationEntry.officerTab.selectRoad();
		traffic.citationEntry.officerTab.selectTraffic();
		traffic.citationEntry.officerTab.selectVisibility();
		traffic.citationEntry.officerTab.selectNoOfLanes();
		traffic.citationEntry.officerTab.selectAccidentAsNo();
		traffic.citationEntry.officerTab.checkRadar();
		traffic.citationEntry.officerTab.selectEquipOperatorName();
		traffic.switchToCitationEntry();
		traffic.citationEntry.save();
		traffic.citationEntry.switchToOfficerTab();
		traffic.citationEntry.officerTab.verifyInfoExist();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 7, groups = { "CitationNJ" })
	public void TrafficCitationEntryCourtTab_108020(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108020");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToCourtTab();
		traffic.citationEntry.courtTab.verifyGridAtOriginalCharge(0);
		traffic.citationEntry.courtTab.clickRowAtOriginalCharge();
		traffic.citationEntry.courtTab.verifyAtOriginalChrage();
		traffic.citationEntry.courtTab.enterCourtDateAsCurrentDate();
//	           traffic.switchToCitationEntry();
//	           traffic.citationEntry.switchToCourtTab();
		traffic.citationEntry.courtTab.enterCourtDateAsCurrentTime();
		traffic.citationEntry.courtTab.enterAtDisposition();
		traffic.citationEntry.courtTab.enterAtPenality();
		traffic.switchToCitationEntry();
		traffic.citationEntry.clickSaveButton();
		traffic.citationEntry.courtTab.verifyAcknoledgeUpdateCourtTab();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToCourtTab();
		traffic.citationEntry.courtTab.clickUpdateButton();
		traffic.citationEntry.courtTab.verifyCourtDateAsCurrentDate(0);
		traffic.citationEntry.courtTab.verifyAtDisposition(0);
		traffic.citationEntry.courtTab.verifyAtPenalty(0);
		traffic.switchToCitationEntry();
		traffic.citationEntry.save();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 8, groups = { "CitationNJ" })
	public void TrafficCitationEntryPaymentTab_108021(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108021");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToPaymentTab();
		traffic.citationEntry.citationEntryPaymentsTab.enterDateAsCurrentDate();
		traffic.citationEntry.citationEntryPaymentsTab.enterPayment();
		traffic.citationEntry.citationEntryPaymentsTab.selectMethod();
		traffic.citationEntry.citationEntryPaymentsTab.enterReciptReference();
		traffic.switchToCitationEntry();
		traffic.citationEntry.save();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToPaymentTab();
		traffic.citationEntry.citationEntryPaymentsTab.verifyBalance();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToCourtTab();
		traffic.citationEntry.courtTab.verifyBalance();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 9, groups = { "CitationNJ" })
	public void TrafficCitationEntryNarrativeTab_108023(ITestContext testContext) // issue reported
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108023");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToNarrativeTab();
		// traffic.citationEntry.citationEntryNarrativeTab.enterGroupOfStrings();
		System.out.println("middle");
		traffic.citationEntry.citationEntryNarrativeTab.enterNarative();
		traffic.switchToCitationEntry();
		traffic.citationEntry.clickSaveButton();
		traffic.citationEntry.citationEntryNarrativeTab.verifyAcknowledgeUpdateNarrativeTab();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToNarrativeTab();
		traffic.citationEntry.citationEntryNarrativeTab.internalSave();
		traffic.switchToCitationEntry();

	}

	@Test(priority = 10, groups = { "CitationNJ" })
	public void TrafficCitationEntryWitnessTab_108026(ITestContext testContext) // issue reported
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108026");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToWitnessTab();
		traffic.citationEntry.citationEntryWitnessTab.enterLastName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		traffic.switchToCitationEntry();
		traffic.citationEntry.clickSaveButton();
		traffic.citationEntry.citationEntryWitnessTab.verifyAcknowledgeUpdateWitnessTab();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToWitnessTab();
		traffic.citationEntry.citationEntryWitnessTab.clickAddButton();
		traffic.citationEntry.citationEntryWitnessTab.verifyNameAddedGrid();
		traffic.citationEntry.citationEntryWitnessTab.clickDeleteIconInGrid(0, 1);
		traffic.citationEntry.citationEntryWitnessTab.internalSave();
		traffic.citationEntry.citationEntryWitnessTab.verifyNameDeletedGrid();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 11, groups = { "CitationNJ" })
	public void TrafficCitationEntryCommentsTab_108028(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108028");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToCommentsTab();
		traffic.citationEntry.citationEntryCommentsTab.verifyCurrentDate();
		traffic.citationEntry.citationEntryCommentsTab.enterSubject();
		traffic.citationEntry.citationEntryCommentsTab.clickEnterCommentsButton();
		traffic.switchToCitationComments();
		Playback.pageLoadThreadWait();
		traffic.citationComments.enter100WordsRichText();
		traffic.citationComments.saveAndCloseScreen();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToCommentsTab();
		traffic.citationEntry.citationEntryCommentsTab.clickDeleteIconInGrid(0, 1);
		traffic.switchToCitationEntry();
		traffic.citationEntry.save();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToCommentsTab();
		traffic.citationEntry.citationEntryCommentsTab.verifyDeletedCommentsNotFound();
		traffic.switchToCitationEntry();
	}

	@Test(priority = 12, groups = { "CitationNJ" })
	public void TrafficCitationEntryMapTab_108036(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108036");
		String getLatLongvalue = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		traffic.switchToCitationSearch();
		traffic.citationSearch.enterCENumberAtCENo();
		traffic.citationSearch.clickClearButton();
		traffic.citationSearch.clickSearchButton();
		traffic.citationSearch.verifyAtCENo(0);
		traffic.citationSearch.clickAtCENo();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToOffenseTab();
		traffic.citationEntry.offenseTab.clickDescribeLocationInfoButton();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.SwitchToMapTab();
		geo.addressSearchHelp.addressSearchHelpMapTab.GetLatLongvalue(getLatLongvalue);
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.CloseAddressSearchScreen();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToMapTab();
		traffic.citationEntry.citationEntryMapTab.verifyAtCENo();
		traffic.citationEntry.citationEntryMapTab.verifyLatLongValue(Playback.getTestContextAttribute(getLatLongvalue));
		traffic.switchToCitationEntry();
	}

	@Test(priority = 13, groups = { "CitationNJ" })
	public void NonTrafficCitationEntry_108037(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108037");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Entry");
		traffic.switchToCitationEntry();
		traffic.citationEntry.selectAtCEType();
		traffic.citationEntry.tabAtDateAndTime();
		traffic.citationEntry.verifyCurrentDate();
		traffic.citationEntry.enterAtLastName();
		traffic.citationEntry.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToViolationsTab();
		traffic.citationEntry.violationsTab.enterAtLocation();     //UI Updated
		traffic.citationEntry.violationsTab.verifyAtPFInOfficeField();
		traffic.citationEntry.violationsTab.enterAtCharge();   //UI Updated
		
		
		traffic.switchToCitationArrest();
		traffic.citationArrest.selectArmedAsUnarmed();
		traffic.citationArrest.saveCloseScren();
        		traffic.switchToCitationEntry();
		traffic.citationEntry.clickSaveButton();
		traffic.citationEntry.violationsTab.verifyAcknowledgeViolationEntry();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToViolationsTab();
		traffic.citationEntry.violationsTab.clickAddButton();
		traffic.citationEntry.violationsTab.verifyViolationAddedGrid();
		traffic.switchToCitationEntry();
		traffic.citationEntry.save();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToCourtTab();
		traffic.citationEntry.courtTab.verifyAtCharge(0);
		traffic.citationEntry.courtTab.clickRowAtCharge();
		traffic.citationEntry.courtTab.enterAtPenality();
		traffic.citationEntry.courtTab.enterAtFine();
		traffic.citationEntry.courtTab.clickUpdateButton();
		traffic.citationEntry.courtTab.verifyAtPenalty(0);
		traffic.citationEntry.courtTab.verifyAtFineFineForfeiture(0);
		traffic.switchToCitationEntry();
		traffic.citationEntry.save();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToNonTrafficAllTabs();
		traffic.switchToCitationEntry();

	}

	@Test(priority = 1, groups = { "CrashNJ" })
	public void CreateCrashEntry_108088(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108088");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.clickAddNew();
		traffic.switchToCrashEntry();
		traffic.crashEntry.enterCaseNumberDetails();
		traffic.crashEntry.clickCaseInfo();
		records.switchToCaseUpdate();
		String readLocation = records.caseUpdate.readLocation();
		String readReportedDate = records.caseUpdate.readReportedDate();
		String readReportedTime = records.caseUpdate.readReportedTime();
		records.caseUpdate.closeTheScreen();
		traffic.switchToCrashEntry();
		traffic.crashEntry.verifyAtActiveLocation(readLocation);
		traffic.crashEntry.verifyAtActiveReportedDateAndTime(readReportedDate, readReportedTime);
		traffic.crashEntry.enterAtOfficer();
		// traffic.crashEntry.verifyAtOfficerBadge();
		traffic.crashEntry.enterAtNoOfUnits();
		traffic.crashEntry.save();
		popup.confirm.yes();
//	           Playback.pageLoadThreadWait();
//	           Playback.pageLoadThreadWait();
//	           popup.switchToAcknowledge();
//	           popup.acknowledge.ok();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToAllTab();
		traffic.crashEntry.verifyStatusAsOnHold();
		traffic.crashEntry.switchToMainTab();
		traffic.crashEntry.crashEntryMainTab.verifyAtMunicipalityCodeName();
		traffic.crashEntry.crashEntryMainTab.clickNJTR1BCheckBox();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToNarrative2Tab();
        traffic.switchToCrashEntry();
		traffic.crashEntry.switchToDiagram2Tab();
		traffic.switchToCrashEntry();
		traffic.crashEntry.verifyNarrative2Enabled();
		traffic.crashEntry.verifyDiagram2Enabled();
		traffic.switchToCrashEntry();

	}

	@Test(priority = 9, groups = { "CrashNJ" })
	public void CrashEntryMainTab_133591(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "133591");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToMainTab();
		traffic.crashEntry.crashEntryMainTab.verifyAtPoliceDept();
		traffic.crashEntry.crashEntryMainTab.verifyAtCode2();
		traffic.crashEntry.crashEntryMainTab.selectStationPrecinctAsStation();
		traffic.crashEntry.crashEntryMainTab.clickReportableCheckBox();
		traffic.crashEntry.crashEntryMainTab.verifyDateofCrashAsReportedDate();
		traffic.crashEntry.crashEntryMainTab.verifyTimeofCrashAsReportedTime();
		traffic.crashEntry.crashEntryMainTab.selectMunicipalityCode();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToMainTab();
		traffic.crashEntry.crashEntryMainTab.verifyAtRoadName();
		traffic.crashEntry.crashEntryMainTab.enterTotalInjured();
		traffic.crashEntry.crashEntryMainTab.enterAtCrossRoad();
		traffic.crashEntry.crashEntryMainTab.selectRoadDividedBy();
		traffic.crashEntry.crashEntryMainTab.selectTemproraryTrafficControlZone();
		traffic.crashEntry.crashEntryMainTab.selectLightCondition();
		traffic.crashEntry.crashEntryMainTab.selectRoadSystem();
		traffic.crashEntry.crashEntryMainTab.selectRoadCharacterHorizontalAlignment();
		traffic.crashEntry.crashEntryMainTab.selectRoadCharacterGrade();
		traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceType();
		traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceConditions();
		traffic.crashEntry.crashEntryMainTab.selectEnvironmentCondition();
		traffic.crashEntry.crashEntryMainTab.selectCrashType();
		traffic.crashEntry.crashEntryMainTab.selectFirstHarmfulEvent();
		traffic.crashEntry.crashEntryMainTab.clickDamageToOtherPropertyCheckBox();
		traffic.crashEntry.crashEntryMainTab.enterDamageToOtherProperty();
		traffic.switchToCrashEntry();
		traffic.crashEntry.save();
		traffic.switchToCrashEntry();

	}

	@Test(priority = 2, groups = { "CrashNJ" })
	public void CrashEntryMotoristNonMotoristTab_108096(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108096");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
//		traffic.crashSearch.clickRowAtCaseNo();
		traffic.crashSearch.verifyAtCaseNo(0);
		traffic.crashSearch.verifyAtApprovalStatus(0);
		traffic.crashSearch.verifyAsCR(0);
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToMotoristNonMotoristTab();
		traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
		traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
		traffic.switchToCrashUnit();
		traffic.crashUnit.verifyAtUnitNo();
		traffic.crashUnit.enterAtNoOfOccupants();
		traffic.crashUnit.switchToPersonTab();
		traffic.crashUnit.personTab.selecttypeOfPersonAsParked();
		traffic.crashUnit.personTab.verifyNameControlDisabled();
		traffic.crashUnit.personTab.selecttypeOfPersonAsPedalcylist();
		traffic.switchToCrashUnit();
        traffic.crashUnit.switchToPersonTab();
		// traffic.crashUnit.verifyVehicleTabDisabled();
		traffic.crashUnit.personTab.selectTypeOfPersonAsPedestrain();
		traffic.switchToCrashUnit();
		traffic.crashUnit.verifyOccupantsDisabled();
		// traffic.crashUnit.verifyVehicleTabDisabled();
		traffic.crashUnit.switchToPersonTab();
		traffic.crashUnit.personTab.selecttypeOfPersonAsDriver();
		traffic.crashUnit.personTab.clickHitAndRunCheckBox();
		traffic.switchToCrashUnit();
		traffic.crashUnit.switchToVehicleTab();
		traffic.crashUnit.crashUnitVehicleTab.verifyPlateNumberNonMandatory();
		traffic.switchToCrashUnit();
		traffic.crashUnit.closeCrashUnitScreen();
		traffic.switchToCrashEntry();
	}

	@Test(priority = 10, groups = { "CrashNJ" })
	public void CrashEntryMotoristNonMotoristTabCrashUnit_133600(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "133600");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToMotoristNonMotoristTab();
		traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
		traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
		traffic.switchToCrashUnit();
		traffic.crashUnit.enterNoOfOccupants();
		traffic.crashUnit.switchToPersonTab();
		traffic.crashUnit.personTab.selectAtTypeOfPerson();
		traffic.crashUnit.personTab.enterName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		traffic.switchToCrashUnit();
		traffic.crashUnit.switchToPersonTab();
		traffic.crashUnit.personTab.selectCharge();
		traffic.switchToCrashUnit();
		traffic.crashUnit.switchToPersonTab();
		traffic.crashUnit.personTab.clickMultiCharges();
		traffic.crashUnit.personTab.selectPositionInOnVehicle();
		traffic.crashUnit.personTab.selectEjection();
		traffic.crashUnit.personTab.selectSaftyEquipment();
		traffic.crashUnit.personTab.selectUsed();
		traffic.crashUnit.personTab.selectAirBag();
		traffic.crashUnit.personTab.selectVictimPhysicalCondition();
		traffic.crashUnit.personTab.selectLocofmostseverephysInj();
		traffic.crashUnit.personTab.selectTypeofmostseverephysInj();
		String nameType = traffic.crashUnit.personTab.getNameType();
		traffic.switchToCrashUnit();
		traffic.crashUnit.switchToVehicleTab();
		traffic.crashUnit.crashUnitVehicleTab.clickVehicleOwnerSameAsDriver();
		traffic.crashUnit.crashUnitVehicleTab.verifyNameFromPersonTab(nameType);
		traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
		traffic.crashUnit.crashUnitVehicleTab.selectAtState();
		vehicle.switchToVehicleBoatSearchHelpWindow();
		vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
		// traffic.crashUnit.crashUnitVehicleTab.selectVehicle();
		traffic.switchToCrashUnit();
		traffic.crashUnit.switchToVehicleTab();
		traffic.crashUnit.crashUnitVehicleTab.selectAtType();
		traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
		traffic.switchToCrashUnit();
		traffic.crashUnit.switchToDamageConditionsTab();
		traffic.crashUnit.damageConditionsTab.selectInitialImpact();
		traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
		traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
		traffic.crashUnit.damageConditionsTab.selectDirectionTravelOfTheVehicle();
		traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
		traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceB();
		traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
		traffic.crashUnit.damageConditionsTab.selectTrafficControls();
		traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
		traffic.crashUnit.damageConditionsTab.selectSequenceofEvents2nd();
		traffic.crashUnit.damageConditionsTab.selectSequenceofEvents3rd();
		traffic.crashUnit.damageConditionsTab.selectSequenceofEvents4th();
		traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
		traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
		traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusB();
		traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
		traffic.crashUnit.damageConditionsTab.selectAlcoholType();
        traffic.switchToCrashUnit();
		traffic.crashUnit.save();
		traffic.switchToCrashUnit();
		traffic.crashUnit.closeCrashUnitScreen();
		traffic.switchToCrashEntry();
		traffic.crashEntry.save();
		traffic.switchToCrashEntry();
	}

	@Test(priority = 3, groups = { "CrashNJ" })
	public void CrashEntryOccupantsTab_108119(ITestContext testContext) {
		testContext.setAttribute("testID", "108119");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToOccupantsTab();
		traffic.crashEntry.occupantsTab.verifyAtUnitNo();  //App Not Supporting
		traffic.crashEntry.occupantsTab.enterOccupant();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToOccupantsTab();
		traffic.crashEntry.occupantsTab.selectPositionInOnVehicle();
		traffic.crashEntry.occupantsTab.selectEjection();
		traffic.crashEntry.occupantsTab.selectSaftyEquipment();
		traffic.crashEntry.occupantsTab.selectUsed();
		traffic.crashEntry.occupantsTab.selectAirBag();
		traffic.crashEntry.occupantsTab.selectVictimPhysicalCondition();
		traffic.crashEntry.occupantsTab.selectLocofmostseverephysInj();
		traffic.crashEntry.occupantsTab.selectTypeofmostseverephysInj();
		traffic.crashEntry.occupantsTab.selectHospitalCode();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToOccupantsTab();
		traffic.crashEntry.occupantsTab.selectSeatingPosition();
		traffic.crashEntry.occupantsTab.selectBusType();
		traffic.crashEntry.occupantsTab.clickAddButton();
		traffic.switchToCrashEntry();
		traffic.crashEntry.save();
		traffic.crashEntry.occupantsTab.verifyAcknowledgeUpdateOccupantTab();
		traffic.crashEntry.switchToOccupantsTab();
		traffic.crashEntry.occupantsTab.internalSave();
		traffic.crashEntry.occupantsTab.enterOccupant();
		traffic.crashEntry.occupantsTab.clickAddButton();
		traffic.crashEntry.occupantsTab.verifyAcknowledgeTotalOccupant();
		traffic.crashEntry.occupantsTab.clickClearButton();

	}

	@Test(priority = 11, groups = { "CrashNJ" })
	public void CrashEntryTruckBusTab_133609(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "133609");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToTruckBusTab();
		traffic.crashEntry.truckBusTab.enterCarrierName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.SelectAtNameRow();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToTruckBusTab();
		// traffic.crashEntry.truckBusTab.clickNoneCheckBox();
		// traffic.crashEntry.truckBusTab.verifyCarrierNoDisabled();
		// traffic.crashEntry.truckBusTab.clickNoneCheckBox();
		traffic.crashEntry.truckBusTab.enterCarrierNo();
		traffic.crashEntry.truckBusTab.selectOversizeWeightPermit();
		traffic.crashEntry.truckBusTab.selectCargoBodyType();
		traffic.crashEntry.truckBusTab.selectCommercialVehicleWeight();
		// traffic.crashEntry.truckBusTab.clickHazardousNoneCheckBox();
		// // traffic.crashEntry.truckBusTab.verifyHazardClassDisabled();
		// traffic.crashEntry.truckBusTab.clickHazardousNoneCheckBox();
		// traffic.crashEntry.truckBusTab.enterHazardClass();
		traffic.crashEntry.truckBusTab.clickAddButton();
		traffic.switchToCrashEntry();
		traffic.crashEntry.clickSaveButton();
		traffic.crashEntry.truckBusTab.verifyAcknowledgeUpdateTruckBusTab();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToTruckBusTab();
		traffic.crashEntry.truckBusTab.internalSave();
		traffic.switchToCrashEntry();
		traffic.crashEntry.save();
		traffic.switchToCrashEntry();
	}

	@Test(priority = 4, groups = { "CrashNJ" })
	public void CrashEntryWitnessTab_108124(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108124");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToWitnessTab();
		traffic.crashEntry.witnessTab.verifyTextEditordisabled();
		traffic.crashEntry.witnessTab.enterAtOfficer();
		traffic.crashEntry.witnessTab.verifyAtLocation();
		traffic.crashEntry.witnessTab.enterName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToWitnessTab();
		Playback.pageLoadThreadWait();
		traffic.crashEntry.witnessTab.clickAddbutton();
		traffic.crashEntry.witnessTab.internalSave();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToWitnessTab();
		traffic.crashEntry.witnessTab.selectFirstRowGrid(1);
		traffic.crashEntry.witnessTab.verifyTextEditorEnabled();
		traffic.crashEntry.witnessTab.clickTextEditor();
		home.switchToManageCommentsScreen();
		home.manageComments.Enter100WordsRichText();
		home.manageComments.SaveAndCloseScreen();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToWitnessTab();
		traffic.crashEntry.witnessTab.clickAddbutton();
		traffic.crashEntry.witnessTab.internalSave();
		traffic.switchToCrashEntry();

	}

	@Test(priority = 5, groups = { "CrashNJ" })
	public void CrashEntryNarrativeTab_108126(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108126");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToNarrativeTab();
		traffic.crashEntry.crashEntryNarrativeTab.verifyCurrentDate();
		traffic.crashEntry.crashEntryNarrativeTab.enterSubject();
		traffic.crashEntry.crashEntryNarrativeTab.clickEnterCommentsButton();
		traffic.switchToCrashComments();
		traffic.crashComments.enter100WordsRichText();
        traffic.switchToCrashComments();
		traffic.crashComments.saveAndCloseScreen();
		traffic.switchToCrashEntry();
		traffic.crashEntry.save();
		traffic.crashEntry.switchToNarrativeTab();
		traffic.crashEntry.crashEntryNarrativeTab.verifyAtPFCode(0);
		traffic.switchToCrashEntry();

	}

	@Test(priority = 6, groups = { "CrashNJ" })
	public void CrashEntryDiagramTab_108127(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108127");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToDiagramTab();
		traffic.crashEntry.diagramTab.clickImportButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.EnterDate();
		home.updateImageScreen.EnterTime();
		// home.updateImageScreen.EnterCrashDiagramImage();
		home.updateImageScreen.clickChooseFileButtonAndSelectJPGFile();
		home.updateImageScreen.SaveAndClose();
		// Home.UpdateImageScreen.Close(); // no need
		traffic.switchToCrashEntry();
		traffic.crashEntry.save();
		popup.confirm.yes();
		traffic.crashEntry.switchToDiagramTab();
		traffic.crashEntry.diagramTab.verifyImageAppears();// No differents.
		traffic.switchToCrashEntry();

	}

	@Test(priority = 7, groups = { "CrashNJ" })
	public void CrashEntryMapTab_108128(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108128");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		String activeCrashNumber = traffic.crashEntry.getActiveCrashNumber();
		traffic.crashEntry.switchToMainTab();
		String activeLatLongValue = traffic.crashEntry.crashEntryMainTab.getActiveLatLongValue();
		traffic.switchToCrashEntry();
		traffic.crashEntry.switchToMapTab();
		traffic.crashEntry.crashEntryMapTab.verifyAtActiveCrashNo(activeCrashNumber);
		// traffic.crashEntry.crashEntryMapTab.verifyLatLongValue(activeLatLongValue);
		// //In Map tab lat/lon value will not same as Main Tab
		traffic.switchToCrashEntry();
	}

	@Test(priority = 8, groups = { "CrashNJ" })
	public void DeleteACrashReport_108728(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108728");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCaseNo();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.clickRowAtCaseNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.clickDeleteIcon();
		traffic.crashEntry.verifyConfirmDelete();
		// traffic.switchToCrashSearch();
		traffic.crashSearch.verifyAcknowledgeNoRecord();
		traffic.switchToCrashSearch();
		traffic.crashSearch.clickReset();
		traffic.crashSearch.clickApprovedCheckBox();
		traffic.crashSearch.clickSearch();
		traffic.crashSearch.selectRow();
		traffic.switchToCrashEntry();
		traffic.crashEntry.verifyMenuBarIcons();
		traffic.crashEntry.verifyApprovedAndColor();
		traffic.switchToCrashEntry();

	}

	   
	     @Test
	       public void KSCrash_127995(ITestContext testContext)
	       {
	    	
	    	 testContext.setAttribute("testID", "127995");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.clickAddNew();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.enterAtCaseNo();
	           traffic.crashEntry.tabOutOfficer();
	           traffic.crashEntry.verifyLoggedPFAutopupulates();
	           traffic.crashEntry.verifyAtKSOfficer();
	           traffic.crashEntry.verifyAtKSBadge();
	           traffic.crashEntry.enterAtUnit();
	           traffic.crashEntry.save();
	           traffic.crashEntry.yes();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToKSStateTabs();
	           traffic.crashEntry.verifyStatusAsOnHoldAndAppearAsGreenColor();
	           traffic.crashEntry.close();
	       }


	     @Test
	       public void KSCrash_127996(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "127996");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtKSCaseNo();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.clickRowAtCaseNo();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.verifyAtCaseNo();
	           traffic.crashEntry.verifyCaseFieldDisabled();
	           traffic.crashEntry.verifyAtLocation();
	           traffic.crashEntry.verifyLocationDisabled();
	           traffic.crashEntry.verifyReportedDateTimeDisabled();
	           traffic.crashEntry.verifyAtKSOfficer();
	           traffic.crashEntry.verifyKSOfficerFieldDisabled();
	           traffic.crashEntry.verifyAtKSBadge();
	           traffic.crashEntry.verifyBadgeFieldDisabled();
	           traffic.crashEntry.verifyAtUnit();
	           traffic.crashEntry.verifyNoOFUnitsFieldEnabled();
	           traffic.crashEntry.close();

	       }

	   
	     @Test
	       public void KSCrash_127997(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "127997");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtKSCrashNo();
	         
	           traffic.crashSearch.enterAtKSOfficer();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.selectRowByAtOfficer();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToMainTab();
	           traffic.crashEntry.crashEntryMainTab.verifyAtKSPoliceDepartment();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingCountyAckMsg();
	           traffic.crashEntry.crashEntryMainTab.enterAtCity();
	           traffic.crashEntry.crashEntryMainTab.selectCounty();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingLightConditionsAckMsg();
	           traffic.crashEntry.crashEntryMainTab.verifyDateSameAsReportedDate();
	           traffic.crashEntry.crashEntryMainTab.verifyDayFieldDisabled();
	           traffic.crashEntry.crashEntryMainTab.verifyAtLocation();
	           traffic.crashEntry.crashEntryMainTab.verifyAtBlockNo();
	           traffic.crashEntry.crashEntryMainTab.clickKSFatalCheckBox();
	           traffic.crashEntry.crashEntryMainTab.selectKSLightCondition();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingIntersectionTypeAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectKSIntersectionType();
	           traffic.crashEntry.crashEntryMainTab.selectKSLocationWorkZone();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingAdverseWeatherConditionsAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectAdverseWeatherConditionAs88OtherSpecify();
	           traffic.crashEntry.crashEntryMainTab.verifyAdverseWeatherConditionsFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInAdverseWeatherCondition();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingSurfaceConditionsAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectSurfaceConditionOnAs88OtherSpecify();
	           traffic.crashEntry.crashEntryMainTab.verifySurfaceConditionsOnFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInSurfaceConditionOn();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingSurfaceTypeAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectSurfaceTypeOnAs88OtherSpecify();
	           traffic.crashEntry.crashEntryMainTab.verifySurfaceTypeOnFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInSurfaceTypeOn();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingAccidentLocationAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectAccidentLocationOnAs88OtherSpecify();
	           traffic.crashEntry.crashEntryMainTab.verifyAccidentLocationOnFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInAccidentLocation();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingTrafficControlsAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectOnAt();
	           traffic.crashEntry.crashEntryMainTab.selectTypePresentAsOther();
	           traffic.crashEntry.crashEntryMainTab.selectOKNF();
	           traffic.crashEntry.crashEntryMainTab.verifyTrafficControlFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInTrafficControl();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingWorkZoneTypeAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectWorkZoneTypeOnAs01ConstructionZone();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingAccidentClass1stHarmfulAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectAccidentClass1stHarmfulEventAs07AnimalType();
	           traffic.crashEntry.crashEntryMainTab.verifyAccidentClass1stHarmfulEventFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInAccidentClass1stHarmfulEvent();
	           traffic.crashEntry.crashEntryMainTab.selectAccidentClassMostHarmfulEventAs09OtherObject();
	           traffic.crashEntry.crashEntryMainTab.verifyAccidentClassMostHarmfulEventFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInAccidentClassMostHarmfulEvent();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingRoadSpecialFeaturesAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectRoadSpecialFeatures1stAs01Bridge();
	           traffic.crashEntry.crashEntryMainTab.verifyRoadSpecialFeatures1stFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInRoadSpecialFeatures1stField();
	           traffic.crashEntry.crashEntryMainTab.selectRoadSpecialFeatures2ndAs04RRXING();
	           traffic.crashEntry.crashEntryMainTab.verifyRoadSpecialFeatures2ndFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInRoadSpecialFeatures2ndField();
	           traffic.crashEntry.crashEntryMainTab.selectRoadSpecialFeatures3rd();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingWorkZoneCategoryAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectWorkZoneCategoryAs88OtherSpecify();
	           traffic.crashEntry.crashEntryMainTab.verifyWorkZoneCategoryFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInWorkZoneCategoryField();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingFixedObjectType1stHarmfulAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectFixedObjectType1stHarmfulEventAsOther();
	           traffic.crashEntry.crashEntryMainTab.verifyFixedObjectType1stHarmfulEventFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInFixedObjectType1stHarmfulEventField();
	           traffic.crashEntry.crashEntryMainTab.selectFixedObjectTypeMostHarmfulEvent();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingRoadwayNumberOfLanesAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectRoadwayNumberOfLanesOnAsOtherSpecify();
	           traffic.crashEntry.crashEntryMainTab.verifyRoadwayNumberOfLanesOnFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInRoadwayNumberOfLanesOnField();
	           traffic.crashEntry.save();
	           traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingRoadCharacterAckMsg();
	           traffic.crashEntry.crashEntryMainTab.selectRoadCharacterOnAsOther();
	           traffic.crashEntry.crashEntryMainTab.verifyRoadCharacterOnFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInRoadCharacterOnField();
	        //   traffic.crashEntry.save();
	        //   traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingCollisionWithVehicle1stHarmfulAckMsg();                //spelling mistake for ack msg
	           traffic.crashEntry.crashEntryMainTab.selectCollisionWithVehicle1stHarmfulEventAs88Other();
	           traffic.crashEntry.crashEntryMainTab.verifyCollisionWithVehicle1stHarmfulEventFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInCollisionWithVehicle1stHarmfulEventField();
	           traffic.crashEntry.crashEntryMainTab.selectCollisionWithVehicleMostHarmfulEvent();
	        //   traffic.crashEntry.save();
	           //   traffic.crashEntry.crashEntryMainTab.verify10086MandatoryDataMissingSpecialJurisdictionAckMsg();                              //spelling mistake for ack msg
	           traffic.crashEntry.crashEntryMainTab.selectSpecialJurisdictionAs88OtherSpecify();
	           traffic.crashEntry.crashEntryMainTab.verifySpecialJurisdictionFieldEnabled();
	           traffic.crashEntry.crashEntryMainTab.enterTextInSpecialJurisdictionField();
	           traffic.crashEntry.save();
	           traffic.crashEntry.yes();
	           traffic.crashEntry.verify1003UpdateSuccessfulFooterMessage();
	           traffic.crashEntry.close();

	       }

	     @Test
	       public void KSCrash_127998(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "127998");
	           String lastName = null;
	           String firstName = null;

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtKSCaseNo();
	           traffic.crashSearch.selectCrashLocationAsAddress();
	           traffic.crashSearch.enterAtPremise();
	           traffic.crashSearch.enterAtStreet();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.clickRowByAtCrash();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToMotoristNonMotoristTab();
	           traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
	           traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
	           traffic.switchToCrashUnit();
	      //     traffic.crashUnit.enterAtNoOfOccupants();
	           traffic.crashUnit.switchToPersonTab();
	           traffic.crashUnit.personTab.selectKSTypeOfPersonAs02Parked();
	           traffic.crashUnit.personTab.verifyNoOfOccupantsFieldEnabled();
	           traffic.crashUnit.personTab.verifyPersonTabAllFieldsDisabledExpectHitRunAndDUICheckbox();
	           traffic.crashUnit.personTab.selectKSTypeOfPersonAs03Pedestrain();
	           traffic.crashUnit.verifyOccupantsDisabled();
	       //    traffic.crashUnit.verifyOccupantsFieldsContains1(ITestContext testContext);
	           traffic.crashUnit.personTab.verifyPersonTabAllFieldsEnabledExpectHitRunCheckBoxDisabled();
	           traffic.crashUnit.verifyVehicleTabDisabled();
	           traffic.crashUnit.personTab.selectKSTypeOfPersonAs04Pedalcylist();
	       //    traffic.crashUnit.verifyOccupantsFieldsEnabled();
	           traffic.crashUnit.personTab.verifyPersonTabAllFieldsEnabledExpectHitRunCheckBoxDisabled();
	           traffic.crashUnit.verifyVehicleTabDisabled();
	           traffic.crashUnit.personTab.selectKSTypeOfPersonAs01Driver();
	           traffic.crashUnit.personTab.enterAtNameID();
	           traffic.crashUnit.personTab.getLastAndFirstName(Playback.getTestContextAttribute("lastName"),Playback.getTestContextAttribute("firstName"));
	           traffic.crashUnit.personTab.clickHitAndRunCheckBox();
	           traffic.crashUnit.personTab.clickDUICheckBox();
	           traffic.crashUnit.personTab.enterAndCheckAllFields();
	           traffic.crashUnit.personTab.selectFiveValuesFromCommercialEndorsement();
	   //        traffic.crashUnit.verify6040SelectAny4ValuesOrLessThan4ValuesAckMsg();
	           traffic.crashUnit.personTab.selectEjectionTrappedAsEEjected();
	       //    traffic.crashUnit.clickSaveButton();
	    //       traffic.crashUnit.verify10086MandatoryDataMissingEjectionPathAckMsg();
	           traffic.switchToCrashUnit();
	           traffic.crashUnit.switchToPersonTab();
	           traffic.crashUnit.personTab.selectEjectionPath();
	           traffic.crashUnit.switchToVehicleTab();
	           traffic.crashUnit.crashUnitVehicleTab.clickKSVehicleOwnerSameAsDriver();
	           traffic.crashUnit.crashUnitVehicleTab.verifyNameFieldAutopopulatesFromPersonTab(lastName, firstName);
	           traffic.crashUnit.crashUnitVehicleTab.enterAtKSLicensePlate();
	           vehicle.switchToVehicleBoatEntry();
	           vehicle.vehicleBoatEntry.clickSelectButton();
	           traffic.crashUnit.crashUnitVehicleTab.selectVehicleBodyTypeAs11TruckAndTrailer();
	           traffic.crashUnit.crashUnitVehicleTab.enterMCCCs();
	           traffic.crashUnit.crashUnitVehicleTab.enterRemainingFieldsInVehicleTab();
	           traffic.crashUnit.switchToDamageConditionsTab();
	        //   Traffic.CrashUnit.DamageConditionsTab.EnterAndSelectDamageConditionsTabAllFields();         
	           traffic.crashUnit.saveAndClose();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.save();
	           traffic.crashEntry.yes();

	       }

	     @Test
	       public void KSCrash_128217(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "128217");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	         //  traffic.crashSearch.enterAtKSCase();
	           traffic.crashSearch.selectCrashLocationAsAddress();
	           traffic.crashSearch.enterAtPremise();
	           traffic.crashSearch.enterAtStreet();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.clickRowAtCaseNo();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToMotoristNonMotoristTab();
	           //traffic.crashEntry.motoristNonMotoristTab.clickRowByAtUnit();
	           //traffic.switchToCrashUnit();
	           //traffic.crashUnit.personTab.verifyAtHomePhone();
	           //traffic.crashUnit.personTab.verifyAtWorkPhone();
	           //traffic.crashUnit.personTab.clickNameInfoBubbleIcon();
	           //Names.SwitchToNameEntry();
	           //Names.NameEntry.SelectPhone1AsWWork();
	           //Names.NameEntry.SelectPhone2AsHHome();
	           //Names.NameEntry.SaveNCloseScreen();
	           //traffic.switchToCrashUnit();
	           //traffic.crashUnit.clickResetButton();
	           traffic.crashUnit.personTab.verifyHomePhoneAtWorkPhone();
	           traffic.crashUnit.personTab.verifyWorkPhoneAtHomePhone();
	           traffic.crashUnit.closeCrashUnitScreen();

	       }


	     
	     @Test
	       public void KSCrash_127999(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "127999");
	           //Browser.navigateToLoginScreen();
	           //login.loginScreen.Logon();
	           //loader.navigateToModule("Traffic");
	           //loader.navigateToScreen("Crash Search");
	           //traffic.switchToCrashSearch();
	           //traffic.crashSearch.clickFatalCheckBox();
	           //traffic.crashSearch.enterAtKSPlate();
	           //traffic.crashSearch.clickSearch();
	           //traffic.crashSearch.selectRowByAtApprovalStatus();
	           //traffic.switchToCrashEntry();
	           //traffic.crashEntry.switchToOccupantsTab();
	           //traffic.crashEntry.occupantsTab.enterKSOccupant();
	           //traffic.switchToCrashEntry();
	           //traffic.crashEntry.switchToOccupantsTab();
	           //traffic.crashEntry.occupantsTab.selectSaftyEquipment();
	           //traffic.crashEntry.occupantsTab.clickKSAddButton();
	           //traffic.crashEntry.occupantsTab.verifyAcknowledgeTotalOccupant();
	           //traffic.crashEntry.occupantsTab.clickResetButton();
	           //traffic.switchToCrashEntry();
	           //traffic.crashEntry.switchToMotoristNonMotoristTab();
	           //traffic.crashEntry.motoristNonMotoristTab.clickRowByAtUnit();
	           //traffic.switchToCrashUnit();
	           //traffic.crashUnit.clearNoOfOccupants();
	           //traffic.crashUnit.enterNoOfOccupantsAs2(ITestContext testContext);
	           //traffic.crashUnit.saveAndClose();
	           //traffic.switchToCrashEntry();
	           //traffic.crashEntry.switchToOccupantsTab();
	           //traffic.crashEntry.occupantsTab.enterKSOccupant();
	           //traffic.switchToCrashEntry();
	           //traffic.crashEntry.switchToOccupantsTab();
	           //traffic.crashEntry.occupantsTab.enterAndSelectOccupantAllFields();
	           //traffic.crashEntry.occupantsTab.clickKSAddButton();
	           //traffic.switchToCrashEntry();
	           //traffic.crashEntry.clickSaveButton();
	           //traffic.crashEntry.occupantsTab.verifyAcknowledgeUpdateOccupantTab();
	           //traffic.crashEntry.occupantsTab.internalSave();
	           //traffic.crashEntry.close();

	       }

	     @Test
	       public void KSCrash_128000(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "128000");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.clickFatalCheckBox();
	           traffic.crashSearch.selectAtApprovalStatus();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.selectRowByAtAccidentLocation();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToTruckBusTab();
	           traffic.crashEntry.truckBusTab.verifyVehicleNocontains1();
	           traffic.crashEntry.truckBusTab.enterAtCarrierID();
	           traffic.crashEntry.truckBusTab.clickNoneCheckbox();
	           traffic.crashEntry.truckBusTab.verifyCarrierIdentificationNumberFieldsDisabled();
	           traffic.crashEntry.truckBusTab.clickNoneCheckbox();
	           traffic.crashEntry.truckBusTab.verifyCarrierIdentificationNumberFieldsEnabled();
	           traffic.crashEntry.truckBusTab.enterUSDot();
	           traffic.crashEntry.truckBusTab.enterMCMX();
	           traffic.crashEntry.truckBusTab.selectAtTimeOfCrashThisVehicleWasAs88Other();
	           traffic.crashEntry.truckBusTab.verifyAtTimeOfCrashThisVehicleWasFieldEnabled();
	           traffic.crashEntry.truckBusTab.enterTextInAtTimeOfCrashThisVehicleWasField();
	           traffic.crashEntry.truckBusTab.clickKSAddButton();
	           traffic.crashEntry.truckBusTab.verify10086MandatoryDataMIssingGVWRGCWRAckMsg();
	           traffic.crashEntry.truckBusTab.selectGVWRGCWR();
	           traffic.crashEntry.truckBusTab.enterGVWRGCWRLBSEdit();
	           traffic.crashEntry.truckBusTab.selectSourceOfCarrierName();
	           traffic.crashEntry.truckBusTab.enterPermitIssuer();
	           traffic.crashEntry.truckBusTab.enterPermitNumber();
	           traffic.crashEntry.truckBusTab.enterTrailerDimensionWidth();
	           traffic.crashEntry.truckBusTab.verify6040ValuesShouldBe6DigitIntegerAndDecimal();
	           traffic.crashEntry.truckBusTab.clearTrailerDimensionWidth();
	           traffic.crashEntry.truckBusTab.enterTrailerDimensionWidthInDecimal();
	           traffic.crashEntry.truckBusTab.enterTrailerDimensionLength();
	           traffic.crashEntry.truckBusTab.verify6040ValuesShouldBe6DigitIntegerAndDecimal();
	           traffic.crashEntry.truckBusTab.clearTrailerDimensionLength();
	           traffic.crashEntry.truckBusTab.enterTrailerDimensionLengthInDecimal();
	           traffic.crashEntry.truckBusTab.selectTrailerDamaged();
	           traffic.crashEntry.truckBusTab.enterVehicleLength();
	           traffic.crashEntry.truckBusTab.verify6040ValuesShouldBe6DigitIntegerAndDecimal();
	           traffic.crashEntry.truckBusTab.clearVehicleLength();
	           traffic.crashEntry.truckBusTab.enterVehicleLengthInDecimal();
	           traffic.crashEntry.truckBusTab.selectVehicleConfigurationAs88Other();
	           traffic.crashEntry.truckBusTab.verifyVehicleConfigurationFieldEnabled();
	           traffic.crashEntry.truckBusTab.enterTextInVehicleConfigurationField();
	           traffic.crashEntry.truckBusTab.selectCargoBodyTypeAs88Other();
	           traffic.crashEntry.truckBusTab.verifyCargoBodyTypeFieldEnabled();
	           traffic.crashEntry.truckBusTab.enterTextInCargoBodyTypeField();
	           traffic.crashEntry.truckBusTab.selectCargoTypeAs88Other();
	           traffic.crashEntry.truckBusTab.verifyCargoTypeFieldEnabled();
	           traffic.crashEntry.truckBusTab.enterTextInCargoTypeField();
	           traffic.crashEntry.truckBusTab.enterHazmatWeightLbs();
	           traffic.crashEntry.truckBusTab.verify6040ValuesShouldBe6DigitIntegerAndDecimal();
	           traffic.crashEntry.truckBusTab.clearHazmatWeightLbs();
	           traffic.crashEntry.truckBusTab.enterHazmatWeightLbsInDecimal();
	           traffic.crashEntry.truckBusTab.enterDiamondShapeNumberInDecimal();
	           traffic.crashEntry.truckBusTab.selectCabType();
	           traffic.crashEntry.truckBusTab.selectOnRoadLaneType();
	           traffic.crashEntry.truckBusTab.selectVehicleAccessControlToRoadways();
	           traffic.crashEntry.truckBusTab.clickKSAddButton();
	           traffic.crashEntry.truckBusTab.verifyAddedRecordInGridByAtCarrierName();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.clickSaveButton();
	           traffic.crashEntry.truckBusTab.verifyAcknowledgeUpdateTruckBusTab();
	           traffic.crashEntry.switchToTruckBusTab();
	           traffic.crashEntry.truckBusTab.internalSave();
	           traffic.crashEntry.truckBusTab.enterAtCarrierID();
	           traffic.crashEntry.truckBusTab.selectGVWRGCWR();
	           traffic.crashEntry.truckBusTab.clickKSAddButton();
	           traffic.crashEntry.verify1019DuplicationOfDataFound();
	           traffic.crashEntry.switchToTruckBusTab();
	           traffic.crashEntry.truckBusTab.clickKSClearButton();


	       }


	      @Test
	       public void KSCrash_128001(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "128001");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtKSPlateNo();
	           traffic.crashSearch.selectAtApprovalStatus();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.selectRowByAtCrash();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToWitnessTab();
	           traffic.crashEntry.witnessTab.enterAtOfficer();
	           traffic.crashEntry.witnessTab.verifyAtLocation();
	           traffic.crashEntry.witnessTab.enterAtName();
	           traffic.crashEntry.witnessTab.verifyAtHomePhone();
	           traffic.crashEntry.witnessTab.verifyAtWorkPhone();
	           traffic.crashEntry.witnessTab.clickKSAddbutton();
	           traffic.crashEntry.witnessTab.internalSave();
	           traffic.crashEntry.witnessTab.selectFirstRowGrid(0);
	           traffic.crashEntry.witnessTab.clickNameInfoBubbleIcon();
	           names.switchToNameEntry();
	           //Names.NameEntry.SelectPhone1AsWWork();
	           //Names.NameEntry.SelectPhone2AsHHome();
	           names.nameEntry.SaveNCloseScreen();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToWitnessTab();
	           traffic.crashEntry.witnessTab.clickKSAddbutton();
	           traffic.crashEntry.witnessTab.internalSave();
	           traffic.crashEntry.witnessTab.selectFirstRowGrid(0);
	           traffic.crashEntry.witnessTab.verifyHomePhoneAtWorkPhone();
	           traffic.crashEntry.witnessTab.verifyWorkPhoneAtHomePhone();
	           traffic.crashEntry.witnessTab.clickTextEditor();
	          home.switchToManageCommentsScreen();
	           home.manageComments.Enter100WordsRichText();
	           home.manageComments.SaveAndCloseScreen();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToWitnessTab();
	           traffic.crashEntry.witnessTab.clickKSAddbutton();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.clickSaveButton();
	           traffic.crashEntry.witnessTab.verifyAcknowledgeUpdateWitnessTab();
	           traffic.crashEntry.witnessTab.internalSave();


	       }

	      
	      @Test
	       public void KSCrash_128002(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "128002");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtNameLast();
	           traffic.crashSearch.enterAtNameFirst();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.selectRowByAtCrash();
	           traffic.switchToCrashEntry();
	        //   traffic.crashEntry.clickAtTab();
	           traffic.crashEntry.crashEntryNarrativeTab.enterSubject();
	           traffic.crashEntry.crashEntryNarrativeTab.clickEnterCommentsButton();
	           traffic.switchToCrashComments();
	           traffic.crashComments.enter100WordsRichText();
	           traffic.crashComments.saveAndCloseScreen();
	           traffic.switchToCrashEntry();
	         //  traffic.crashEntry.clickAtTab();
	     //      traffic.crashEntry.crashEntryNarrativeTab.verifyNewlyAddedNarrativeInGrid();

	       }


	       
	       @Test
	       public void KSCrash_128003(ITestContext testContext)
	       {
	    	   
	    	   testContext.setAttribute("testID", "128003");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtNameLast();
	           traffic.crashSearch.enterAtNameFirst();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.clickRowAtCaseNo();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToDiagramTab();
	      //     traffic.crashEntry.diagramTab.clickKSImportButton();
	           home.switchToUpdateImageScreen();
	           home.updateImageScreen.EnterDate();
	           home.updateImageScreen.EnterTime();
	           home.updateImageScreen.EnterCrashDiagramImage();
	           home.updateImageScreen.SaveAndClose();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.save();
	           traffic.crashEntry.switchToDiagramTab();
	       //    Traffic.CrashEntry.DiagramTab.VerifyUploadedImageAppearsBySnapshot();

	       }

	      @Test  
	       public void KSCrash_128004(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "128004");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtNameLast();
	           traffic.crashSearch.enterAtNameFirst();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.selectRowByAtCrash();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.verifySaveButtonDisabled();
	           traffic.crashEntry.crashEntryApprovalTab.verifyNewActionDisabled();
	           traffic.crashEntry.crashEntryApprovalTab.verifyDateTimeDisabled();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToPoliceActionTab();
	           traffic.crashEntry.policeActionTab.clickCompleteCheckBox();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.save();
	           traffic.crashEntry.yes();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.verifySaveButtonEnabled();
	           traffic.crashEntry.crashEntryApprovalTab.verifyNewActionEnabled();
	           traffic.crashEntry.crashEntryApprovalTab.verifyDateTimeEnabled();

	       }


	   
	      @Test
	       public void KSCrash_128006(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "128006");
	           String LatLongValue = null;
	           String CrashNoDetails  =  null;

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtKSCaseNo();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.clickRowAtCaseNo();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToMainTab();
	         //  traffic.crashEntry.getCrashNumber(Playback.getTestContextAttribute("CrashNoDetails"));
	           traffic.crashEntry.crashEntryMainTab.getKSLatLongValue(Playback.getTestContextAttribute("LatLongValue"));
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToMapTab();
	           traffic.crashEntry.crashEntryMapTab.verifyLatLongValue(LatLongValue);
	        //   traffic.crashEntry.crashEntryMapTab.verifyCrashNoAppears(CrashNoDetails);

	       }

	    
	      @Test
	       public void KSCrash_128005(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "128005");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtKSCaseNo();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.selectRowByAtCrash();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.selectAtNewAction();
	           traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	           traffic.crashEntry.crashEntryApprovalTab.verifyCurrentDateAutopopulatesInDateField();
	           traffic.crashEntry.crashEntryApprovalTab.enterAtSupervisor();
	           traffic.switchToCrashEntry();
	         //  traffic.crashEntry.clickSaveButton();
	           traffic.crashEntry.verify1051UpdateDataExistsInApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.save();
	        //   traffic.crashEntry.verifyStatusAsSubmittedAndAppearAsGreenColor();

	       }

	       

	      @Test
	       public void KSCrash_128007(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "128007");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Home");
	           loader.navigateToScreen("My Home");

	          // HomeScripts.HomeTestContext = TrafficTestContext;
	           //Home.SwitchToMyHomeScreen();
	           //Home.MyHome.SwitchToMyApprovalTab();
	           //Home.MyHome.MyApprovalTab.SelectAtStatus();
	           //Home.MyHome.MyApprovalTab.SelectAtItemType();
	           //Home.MyHome.MyApprovalTab.SelectRowByAtRef();
	           traffic.switchToCrashEntry();
	         //  traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.selectAtNewAction();
	           traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	           traffic.crashEntry.crashEntryApprovalTab.selectRejectionCode();
	           traffic.crashEntry.crashEntryApprovalTab.save();
	        //   traffic.crashEntry.verifyStatusAsRejectedAndAppearAsGreenColor();
	        //   traffic.crashEntry.close();

	       }

	      
	      @Test
	       public void KSCrash_133495(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "133495");

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");
	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtKSCaseNo();
	           traffic.crashSearch.selectAtApprovalStatus();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.selectRowByAtApprovalStatus();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.verifySaveButtonDisabled();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToPoliceActionTab();
	           traffic.crashEntry.policeActionTab.verifyPendingCheckBoxChecked();
	           traffic.crashEntry.policeActionTab.clickCompleteCheckBox();
	           traffic.crashEntry.policeActionTab.save();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.verifyRejectCountAs1();
	           traffic.crashEntry.crashEntryApprovalTab.selectAtNewAction();
	           traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	           traffic.crashEntry.crashEntryApprovalTab.verifyCurrentDateAutopopulatesInDateField();
	           traffic.crashEntry.crashEntryApprovalTab.enterAtSupervisor();
	           traffic.crashEntry.crashEntryApprovalTab.save();
	           traffic.crashEntry.close();

	       }

	  
	      @Test
	       public void KSCrash_133496(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "133496");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Home");
	           loader.navigateToScreen("My Home");

	         //  HomeScripts.HomeTestContext = TrafficTestContext;
	           //Home.SwitchToMyHomeScreen();
	           //Home.MyHome.SwitchToMyApprovalTab();
	           //Home.MyHome.MyApprovalTab.SelectAtStatus();
	           //Home.MyHome.MyApprovalTab.SelectAtItemType();
	           //Home.MyHome.MyApprovalTab.SelectRowByAtOfficer();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.selectAtNewAction();
	           traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	           traffic.crashEntry.crashEntryApprovalTab.save();
	           traffic.crashEntry.verifyApprovedAndColor();
	           traffic.crashEntry.close();

	       }

	      
	  
	      @Test(priority = 1, groups = { "ParkingEntryNJ" })
	  	public void ParkingEntry_108894(ITestContext testContext) {
	  		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	  		testContext.setAttribute("testID", "108894");
	  		Browser.NavigateToLoginScreen();
	  		login.loginScreen.logonUsingTestContextOtherDB();
	  		loader.navigateToModule("Traffic");
	  		loader.navigateToScreen("Parking Search");
	  		traffic.switchToParkingSearch();
	  		traffic.parkingSearch.clickAddNewButton();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.verifyStatusAsIssued();
	  		traffic.parkingEntry.verifyStatusInYellowColor();
	  		traffic.parkingEntry.entercurrentValidationDate();
	  		traffic.parkingEntry.enterCurrentValidationTime();
	  		traffic.parkingEntry.verifyCurrentDate();
	  		traffic.parkingEntry.enterIssueDate();
	  		traffic.parkingEntry.verifyIssueDate();
	  		traffic.parkingEntry.clickSaveButton();
	  		traffic.parkingEntry.verifyTicketRequiredAckMsg();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.enterAtTicketNo();
	  		traffic.parkingEntry.clickSaveButton();
	  		traffic.parkingEntry.parkingEntryMainTab.verifyOfficerRequiredAckMsg();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.switchToMainTab();
	  		traffic.parkingEntry.parkingEntryMainTab.enterAtOfficer();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.clickSaveButton();
	  		traffic.parkingEntry.parkingEntryMainTab.verifyPlateOrHullRequiredAckMsg();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.switchToMainTab();
	  		traffic.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
	  		traffic.parkingEntry.parkingEntryMainTab.enterAtPlateState(); //Action Updated 
	  		vehicle.switchToVehicleBoatEntry();
	  		vehicle.vehicleBoatEntry.clickSelectButton();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.clickSaveButton();
	  		traffic.parkingEntry.parkingEntryMainTab.verifyChargeRequiredAckMsg();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.switchToMainTab();
	  		traffic.parkingEntry.parkingEntryMainTab.enterAtViolation();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.clickSaveButton();
	  		traffic.parkingEntry.parkingEntryMainTab.verifyLocationRequiredAckMsg();
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.switchToMainTab();
	  		traffic.parkingEntry.parkingEntryMainTab.enterAtLocation();  //Action Updated 
	  		traffic.switchToParkingEntry();
	  		traffic.parkingEntry.savetheScreen();
	  		traffic.switchToParkingEntry();

	  	}

	@Test(priority = 2, groups = { "ParkingEntryNJ" })
	public void ParkingEntry_108895(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108895");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.clickDefandant1Tab();
		traffic.parkingEntry.defendant1.enterAtDefendant1LastName();
		traffic.parkingEntry.defendant1.enterAtDefendant1FirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.SelectTrafficNameByDefendant1LastFirstName();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.savetheScreen();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.clickDefandant1Tab();
		traffic.parkingEntry.defendant1.clickNameInfoIcon();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();  //UI updated
		names.nameEntry.activityTab.SelectAtActivity();    //UI updated
		names.nameEntry.activityTab.VerifyActivityType();
		names.switchToNameEntry();
		names.nameEntry.closeTheScreen();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.clickDefandant2Tab();
		traffic.parkingEntry.defendant2.enterAtDefendant2LastName();
		traffic.parkingEntry.defendant2.enterAtDefendant2FirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.SelectTrafficNameByDefendant2LastFirstName();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.saveandClosetheScreen();
		Playback.pageLoadThreadWait();
		traffic.switchToParkingSearch();
		traffic.parkingSearch.verifyAtDefedant2();
		traffic.switchToParkingSearch();
	}

	@Test(priority = 3, groups = { "ParkingEntryNJ" })
	public void ParkingEntry_108903(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108903");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToMainTab();
		traffic.parkingEntry.parkingEntryMainTab.clickVehicleInfoIcon();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.enterAtYear();
		vehicle.vehicleBoatEntry.enterAtMake();
		vehicle.vehicleBoatEntry.enterAtModel();
		vehicle.vehicleBoatEntry.enterAtStyle();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToMainTab();
		traffic.parkingEntry.parkingEntryMainTab.verifyAtYear();
		// Code value PoliceData issue
		 traffic.parkingEntry.parkingEntryMainTab.verifyAtMake();
		 traffic.parkingEntry.parkingEntryMainTab.verifyAtModel();
		 traffic.parkingEntry.parkingEntryMainTab.verifyAtStyle();
		traffic.parkingEntry.parkingEntryMainTab.clickOnHoldCheckBox();
		traffic.parkingEntry.parkingEntryMainTab.verifyExpiresFieldEnable();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.clickSaveButton();
		traffic.parkingEntry.parkingEntryMainTab.verifyExpirationDateRequiredAckMsg();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToMainTab();
		traffic.parkingEntry.parkingEntryMainTab.enterExpires1DayFutureFromCurrentDate();
//		traffic.parkingEntry.clickSaveButton();
		traffic.switchToTicketHoldReason();
		traffic.ticketHoldReason.enterReason();
		traffic.ticketHoldReason.save();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.savetheScreen();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.verifyStatusAsOnHold();
		traffic.parkingEntry.switchToMainTab();
		traffic.parkingEntry.parkingEntryMainTab.clickOnHoldCheckBox();
		traffic.switchToTicketHoldReason();
		traffic.ticketHoldReason.close();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToHistoryTab();
		traffic.parkingEntry.parkingEntryHistoryTab.verifyTicketOnHoldReason();
		traffic.switchToParkingEntry();

	}

	@Test(priority = 4, groups = { "ParkingEntryNJ" })
	public void ParkingEntry_108909(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108909");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToMainTab();
		traffic.parkingEntry.parkingEntryMainTab.clickUnCheckOnHoldCheckBox();
		traffic.parkingEntry.parkingEntryMainTab.enterExpires1DayFutureFromCurrentDate();
		traffic.switchToTicketHoldReason();
		traffic.ticketHoldReason.enterReason();
		traffic.ticketHoldReason.save();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.savetheScreen();
		// traffic.parkingEntry.verifyStatusAsIssued(); //not changing to Issued state
		traffic.parkingEntry.switchToHistoryTab();
		traffic.parkingEntry.parkingEntryHistoryTab.verifyTicketOnHoldReason();
		traffic.switchToParkingEntry();
		
	}

	@Test(priority = 5, groups = { "ParkingEntryNJ" })
	public void ParkingEntry_108943(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108943");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToFineNoticesTab();
		traffic.parkingEntry.fineNoticesTab.verifyAtDefaultInitialFine();
		traffic.parkingEntry.fineNoticesTab.verifyAtDefaultFirstAdjustment();
		traffic.parkingEntry.fineNoticesTab.verifyAtDefaultSecondAdjustment();
		traffic.parkingEntry.fineNoticesTab.verifyAtDefaultThirdAdjustment();
		traffic.parkingEntry.fineNoticesTab.enterAtFirstAdjustmentValue();
		traffic.parkingEntry.fineNoticesTab.enterFirstNoticeAsCurrentDate();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.savetheScreen();
		traffic.switchToParkingEntry();
//		traffic.parkingEntry.verifyStatusAsFirstNotice();  //App Not Supporting
		traffic.parkingEntry.switchToFineNoticesTab();
		traffic.parkingEntry.fineNoticesTab.verifyGreyedOutFirstAdjustmentField();
		traffic.parkingEntry.fineNoticesTab.verifyFirstTotalAmtDueValue();
		traffic.parkingEntry.fineNoticesTab.verifyFirstCurrentBalanceValue();
		traffic.parkingEntry.fineNoticesTab.enterAtSecondAdjustmentValue();
		traffic.parkingEntry.fineNoticesTab.enterSecondNoticeAsCurrentDate();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.savetheScreen();
		traffic.switchToParkingEntry();
//		traffic.parkingEntry.verifyStatusAsSecondNotice();  //App not supporting
		traffic.parkingEntry.switchToFineNoticesTab();
		traffic.parkingEntry.fineNoticesTab.verifyGreyedOutSecondAdjustmentField();
		traffic.parkingEntry.fineNoticesTab.verifySecondTotalAmtDueValue();
		traffic.parkingEntry.fineNoticesTab.verifySecondCurrentBalanceValue();
		traffic.parkingEntry.fineNoticesTab.enterAtThirdAdjustmentValue();
		traffic.parkingEntry.fineNoticesTab.enterSuspensionNoticeAsCurrentDate();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.savetheScreen();
		traffic.switchToParkingEntry();
//		traffic.parkingEntry.verifyStatusAsRedColor();       //App Not Supporting
//		traffic.parkingEntry.verifyStatusAsSuspension();     //App not Supporting
		traffic.parkingEntry.switchToFineNoticesTab();
		traffic.parkingEntry.fineNoticesTab.verifyGreyedOutThirdAdjustmentField();
		traffic.parkingEntry.fineNoticesTab.verifyThirdTotalAmtDueValue();
		traffic.parkingEntry.fineNoticesTab.verifyThirdCurrentBalanceValue();
		traffic.switchToParkingEntry();
		
	}

	
	

	@Test(priority = 6, groups = { "ParkingEntryNJ" })
	public void ParkingEntry_108952(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108952");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToFineNoticesTab();
		traffic.parkingEntry.fineNoticesTab.clickCitationIssuedCheckBox();
		traffic.parkingEntry.fineNoticesTab.enterAtCitationNo();
		traffic.parkingEntry.fineNoticesTab.clickCitationInfoIcon();
		traffic.switchToCitationEntry();
		traffic.citationEntry.switchToAllTabs();
		traffic.citationEntry.closeCitationEntryScreen();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.savetheScreen();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.verifyStatusAsGreenColor();
		traffic.parkingEntry.verifyStatusAsCitation();
		traffic.parkingEntry.verifyIconsInMenyGreyedOutExceptPrintIcon();
		traffic.switchToParkingEntry();
	}

	@Test(priority = 7, groups = { "ParkingEntryNJ" })
	public void ParkingEntry_108953(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108953");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToPaymentsTab();
		traffic.parkingEntry.paymentsTab.clickAddotherPaymentsButton();  //Add other Payments button is Disabled 
		traffic.switchToParkingOtherPayment();
		traffic.parkingOtherPayment.enterAtPayment();
		traffic.parkingOtherPayment.selectAtPaymentMethod();
		traffic.parkingOtherPayment.savetheScreen();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.verifyStatusAsGreenColor();
		traffic.parkingEntry.verifyStatusAsPaid();
		traffic.parkingEntry.verifyIconsInMenyGreyedOutExceptPrintIcon();
		traffic.parkingEntry.verifyDefendant1NameEmpty();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToFineNoticesTab();
		traffic.parkingEntry.fineNoticesTab.verifyCurrentBalanceValueAsZero();
		traffic.parkingEntry.fineNoticesTab.verifyCitationIssuedFieldGreyedOut();
		traffic.parkingEntry.fineNoticesTab.verifyTicketVoidedFieldGreyedOut();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToHistoryTab();
		traffic.parkingEntry.parkingEntryHistoryTab.verifyPaymentReceipt();
		traffic.switchToParkingEntry();

	}

	@Test(priority = 8, groups = { "ParkingEntryNJ" })
	public void ParkingEntry_108955(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108955");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToCommentsTab();
		traffic.parkingEntry.commentsTab.enterAtSubject();
		traffic.parkingEntry.commentsTab.clickEnterComments();
		popup.confirm.yes();
		traffic.switchToParkingComments();
		traffic.namesComments.enterCommentsAsGroupOfString();
		traffic.namesComments.saveNClose();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.switchToCommentsTab();
		traffic.parkingEntry.commentsTab.verifyAtSubjectInGrid();
		traffic.switchToParkingEntry();
	}

	      
	    @Test
	       public void ParkingPermits_112076(ITestContext testContext)
	       {
	    	testContext.setAttribute("testID", "112076");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits");

	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.enterAtPlateNo();
	         vehicle.switchToVehicleBoatEntry();
	         vehicle.vehicleBoatEntry.clickSelectButton();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.enterActionDateAsPreviousMonthtFirstDay();
	           traffic.parkingPermits.enterAtPermitLocation();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterValidExtendFromAsPreviousMonthFirstDay();
	           traffic.parkingPermits.enterToAsSecondDayFromValidExtendFrom();
	           traffic.parkingPermits.selectAdultName();
	           Playback.pageLoadThreadWait();
	           traffic.switchToParkingPermit();           
	           traffic.parkingPermits.save();
	           popup.acknowledge.ok();
//	           traffic.parkingPermits.setPermitYearToXMLFile("112076");
//	           traffic.parkingPermits.setPermitNumberToXMLFile("112076");
//	           traffic.switchToParkingPermit();
//	           traffic.parkingPermits.verifyAtPermitYearByXMLFile("112076");
//	           traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112076");
//	           traffic.parkingPermits.verifyStatusAsExpired();
	           traffic.parkingPermits.verifyActionAsPermitInFirstGridRow(0);
	           traffic.parkingPermits.verifyAtPermitLocationInFirstGrid(0);
	           traffic.parkingPermits.verifyExpireDateAsNextDayFromToDate(0);

	       }

	     	@Test
	       public void ParkingPermits_112110(ITestContext testContext)
	       {
	     		testContext.setAttribute("testID", "112110");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	           traffic.parkingPermitsSearch.enterAtPlateNo();
	  //         traffic.parkingPermitsSearch.enterAtPermitNoByXMLValue("112076");
	           traffic.parkingPermitsSearch.selectStatusAsExpired();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.clickAttachmentButton();
	         home.switchToAttachmentScreen();
	           home.attachment.ClickAddFilesButton();
	           home.attachment.SelectCategory();
	           home.attachment.ClickSelectButton();
	           home.attachment.SelectFile();
	           Playback.controlReadyThreadWait();
	         home.attachment.ClickAddButton();
	         home.attachment.Close();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.save();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.verifyAttachImageInFirstRow(0);
	           traffic.parkingPermits.clickAttachImage(0);
	           home.switchToGetAttachmentScreen();
	          home.getAttachment.Close();

	       }

	      @Test
	       public void ParkingPermits_112111(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "112111");
	           String expireDate  =null;

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	           traffic.parkingPermitsSearch.enterAtPlateNo();
	           traffic.parkingPermitsSearch.selectStatusAsExpired();
	           traffic.parkingPermitsSearch.selectPermitAddressAsAddress(1);
	           traffic.parkingPermitsSearch.enterAtPremise();
	           traffic.parkingPermitsSearch.enterAtStreet();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.getExpireDateByAtPremiseStreet(Playback.getTestContextAttribute("expireDate"));
	           traffic.parkingPermitsSearch.clickRowByAtPremiseStreet();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.enterActionDateAsExpireDateGotFromPermitSearch(expireDate);
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterValidExtendDateAsExpireDateGotFromPermitSearch(expireDate);
	           traffic.parkingPermits.enterToAsSixthDayOfValidExtendFrom();
	           traffic.parkingPermits.verify10084AckMessage();
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verifyRequiredEntriesMissingAckMsg();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.enterToAsThirdDayOfValidExtendFrom();
	           traffic.parkingPermits.verifyExpireDateNextDayofToDate();
	           traffic.parkingPermits.save();
	           traffic.switchToParkingPermit();
//	           traffic.parkingPermits.setPermitYearToXMLFile("112111");
//	           traffic.parkingPermits.setPermitNumberToXMLFile("112111");
//	           traffic.parkingPermits.verifyAtPermitYearByXMLFile("112111");
//	           traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112111");
//	           traffic.switchToParkingPermit();      
//	           traffic.parkingPermits.verifyMiddleFieldAs7();
//	           traffic.parkingPermits.verifyStatusAsExpired();
//	           traffic.parkingPermits.verifyAtPermitInGrid("112111");
	           traffic.parkingPermits.verifyActionAsPermit();

	       }

	      @Test
	       public void ParkingPermits_112112(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "112112");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits");

	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.enterAtPlateNo();
	           vehicle.switchToVehicleBoatEntry();
	       		vehicle.vehicleBoatEntry.clickSelectButton();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.enterAtPermitLocation();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.tabOutValidExtendDate();
	           traffic.parkingPermits.tabOutToDate();                                                  
	           traffic.parkingPermits.verfiyExpireDateAsTomorrowDate();
	           traffic.parkingPermits.selectAdultName();
	           Playback.pageLoadThreadWait();
	           traffic.switchToParkingPermit();            
	           Playback.pageLoadThreadWait();
	           traffic.parkingPermits.save();
	          // traffic.parkingPermits.clickSaveButton();
	           popup.acknowledge.ok();
//	           traffic.parkingPermits.setPermitYearToXMLFile("112112");
//	           traffic.parkingPermits.setPermitNumberToXMLFile("112112");
//	           traffic.parkingPermits.verifyAtPermitYearByXMLFile("112112");
//	           traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112112");
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.verifyMiddleFieldAs1();
	           traffic.parkingPermits.verifyStatusAsValid();

	       }

	       
	       @Test
	       public void ParkingPermits_112113(ITestContext testContext)
	       {

	    	   testContext.setAttribute("testID", "112113");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	       //    traffic.parkingPermitsSearch.enterAtPermitNoByXMLValue("112112");
	           traffic.parkingPermitsSearch.selectStatusAsValid();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsExtension();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterNoOfDaysRequestedAs6();
	           traffic.parkingPermits.verify10084AckMessage();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.enterNoOfDaysRequestedAs5();
	           traffic.parkingPermits.save();
	           traffic.switchToParkingPermit();
//	           traffic.parkingPermits.verifyAtPermitYearByXMLFile("112112");
//	           traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112112");
//	           traffic.parkingPermits.verifyMiddleFieldAs6();
//	           traffic.parkingPermits.verifyStatusAsValid();
//	           traffic.parkingPermits.verifyActionAsExtensionInFirstGridRow(0);
//	           traffic.parkingPermits.verifyExtensionDayAs5InFirstGridRow(0);
//	           traffic.parkingPermits.verifyAtPermitInGrid("112112");

	       }

	      @Test
	       public void ParkingPermits_112114(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "112114");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	       //    traffic.parkingPermitsSearch.enterAtPermitNoByXMLValue("112112");
	           traffic.parkingPermitsSearch.selectStatusAsValid();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsExtension();
	           traffic.parkingPermits.tabOutNoOfRequested();
	           traffic.parkingPermits.verify10016ConfirmMsg();          //confirm window not found in chrome
	           traffic.switchToParkingPermitAuthenticate();
	           traffic.parkingPermitsAuthenticate.enterAtPassword();
	           traffic.parkingPermitsAuthenticate.clickAcceptButton();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.clearNoOfRequested();
	           traffic.parkingPermits.enterNoOfRequestedAs2();
	           traffic.parkingPermits.save();
	           traffic.switchToParkingPermit();
	    //       traffic.parkingPermits.verifyAtPermitYearByXMLFile("112112");
	    //       traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112112");
	           traffic.parkingPermits.verifyMiddleFieldAs8();
	           traffic.parkingPermits.verifyStatusAsValid();
	           traffic.parkingPermits.verifyActionAsExtensionInFirstGridRow(0);
	           traffic.parkingPermits.verifyExtensionDayAs2InFirstGridRow(0);
	    //       traffic.parkingPermits.verifyAtPermitInGrid("112112");

	       }

	      @Test
	       public void ParkingPermits_112115(ITestContext testContext)
	       {

	    	  testContext.setAttribute("testID", "112115");
	           String expireDate = null;

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	       //    traffic.parkingPermitsSearch.enterAtPermitNoByXMLValue("112112");
	           traffic.parkingPermitsSearch.selectStatusAsValid();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsAdjustPermit();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.getExpireDate(Playback.getTestContextAttribute("expireDate"));
	           Playback.controlReadyThreadWait();
	           Playback.threadWait();
	           traffic.parkingPermits.clearToFields();
	           Playback.controlReadyThreadWait();
	           traffic.parkingPermits.enterToAsExpireDate(expireDate);
	           traffic.parkingPermits.verify10073AckMsg();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.clearToFields();
	           Playback.controlReadyThreadWait();
	           traffic.parkingPermits.enterToDateAsTwoDaysBeforeFromExpireDate(expireDate);
	           traffic.parkingPermits.enterNotes();
	           traffic.parkingPermits.save();
	           traffic.switchToParkingPermit();
	    //       traffic.parkingPermits.verifyAtPermitYearByXMLFile("112112");
	   //        traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112112");
	           traffic.parkingPermits.verifyMiddleFieldAs7();
	           traffic.parkingPermits.verifyStatusAsValid();
	           traffic.parkingPermits.verifyActionAsAdjustPermitInFirstGridRow(0);
	     //      traffic.parkingPermits.verifyAtPermitInGrid("112112");

	       }

	     @Test
	       public void ParkingPermits_112121(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "112121");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	     //      traffic.parkingPermitsSearch.enterAtPermitNoByXMLValue("112112");
	           traffic.parkingPermitsSearch.selectStatusAsValid();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsDenail();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.verifyCurrentDateAutoPopulatesInActionDate();
	           traffic.parkingPermits.tabOutDenialDate();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterNotes();
	           traffic.parkingPermits.save();
	           traffic.switchToParkingPermit();
	      //     traffic.parkingPermits.verifyAtPermitYearByXMLFile("112112");
	     //      traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112112");
	           traffic.parkingPermits.verifyMiddleFieldAs7();
	           traffic.parkingPermits.verifyStatusAsDenial();
	           traffic.parkingPermits.verifyActionAsDenialInFirstGridRow(0);
	    //       traffic.parkingPermits.verifyAtPermitInGrid("112112");

	       }

	       @Test
	       public void ParkingPermits_112122(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "112122");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	      //     traffic.parkingPermitsSearch.enterAtPermitNoByXMLValue("112112");
	           traffic.parkingPermitsSearch.selectStatusAsDenial();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsCancelDenial();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.verifyCurrentDateAutoPopulatesInActionDate();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterNotes();
	           traffic.parkingPermits.save();
	           settings.switchToPhoenixAuthenticatorWindow();
	         ////  settingsScripts.SettingsTestContext = TrafficTestContext;
	           settings.phoenixAuthenticatorWindow.enterAtPassword();
	           settings.phoenixAuthenticatorWindow.clickAcceptButton();                    //error is showing in chrome browser when click accept button
	           traffic.switchToParkingPermit(); 
	     //      traffic.parkingPermits.verifyAtPermitYearByXMLFile("112112");
	     //      traffic.parkingPermits.verifyAtPermitNumberByXMLFile("112112");
	           traffic.parkingPermits.verifyMiddleFieldAs7();
	           traffic.parkingPermits.verifyStatusAsValid();
	           traffic.parkingPermits.verifyActionAsCanceDenialInFirstGridRow(0);
	     //.parkingPermits.verifyAtPermitInGrid("112112");

	       }

	       
	       @Test
	       public void ParkingPermits_112367(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "112367");
	           String expireDate  = null;

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	           traffic.parkingPermitsSearch.enterAtPlateNo();
	           traffic.parkingPermitsSearch.selectStatusAsExpired();
	           traffic.parkingPermitsSearch.selectPermitAddressAsAddress(1);
	           traffic.parkingPermitsSearch.enterAtPremise();
	           traffic.parkingPermitsSearch.enterAtStreet();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.getExpireDateByAtPremiseStreet(Playback.getTestContextAttribute("expireDate"));
	           traffic.parkingPermitsSearch.clickRowByAtPremiseStreet();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.enterActionDateAsExpireDateGotFromPermitSearch(expireDate);
	           traffic.parkingPermits.enterValidExtendDateAsExpireDateGotFromPermitSearch(expireDate);
	           traffic.parkingPermits.enterToDateAsExpireDateGotFromPermitSearch(expireDate);
	           traffic.parkingPermits.verify10083AckMessage();                                       //issue 10083 ack msg and required entries msg is displaying at a time
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verifyRequiredEntriesMissingAckMsg();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.closeParkingPermitScreen();

	       }

	     
	       @Test
	       public void ParkingPermits_112499(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "112499");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");

	           traffic.switchToParkingPermitsSearch();
	         //  traffic.parkingPermitsSearch.enterAtPermitNoByXMLValue("112112");
	           traffic.parkingPermitsSearch.selectStatusAsValid();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.selectActionAsExtension();
	           traffic.parkingPermits.verify10085AckMessage();

	       }


	       
	       @Test
	       public void ParkingPermits_112532(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "112532");
	           String expireDate = null;

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits");

	           traffic.switchToParkingPermitMainWindow();
	           traffic.parkingPermits.enterAtPlateNo();
	        	vehicle.switchToVehicleBoatEntry();
	        vehicle.vehicleBoatEntry.clickSelectButton();
	           traffic.switchToParkingPermitMainWindow();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.enterActionDateAsPreviousMonthtFirstDay();
	           traffic.parkingPermits.enterAtPermitLocation();
	           Playback.controlReadyThreadWait();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterValidExtendFromAsPreviousMonthFirstDay();
	           traffic.parkingPermits.enterToAsFourthDayOfValidExtendFrom();
	           traffic.parkingPermits.selectAdultName();
	           Playback.pageLoadThreadWait();
	           traffic.switchToParkingPermitMainWindow();
	           traffic.parkingPermits.save();                          
	           popup.acknowledge.ok();
	           traffic.switchToParkingPermitMainWindow();
	           traffic.parkingPermits.getExpireDateInGrid(Playback.getTestContextAttribute("expireDate"),0);
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.enterActionDateAsExpireDateGotFromPermitHistorySearch(expireDate);
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterValidExtendDateAsExpireDateGotFromPermitHistorySearch(expireDate);
	           traffic.parkingPermits.enterToAsFourthDayOfValidExtendFrom();
	           traffic.parkingPermits.save();
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verify1003UpdateSuccessfulAckMsg();
	           traffic.parkingPermits.verifyMiddleFieldAs10();
	           traffic.parkingPermits.verifyStatusAsDenial();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.tabOutValidExtendDate();
	           traffic.parkingPermits.tabOutToDate();
	           traffic.parkingPermits.verify10014AckMsg();                  //issue - 10014 ack msg and required entries msg is displaying at a time in chrome
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verifyRequiredEntriesMissingAckMsg();

	       }

	       
	       @Test
	       public void ParkingPermits_112566(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "112566");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits");

	           traffic.switchToParkingPermitMainWindow();
	           traffic.parkingPermits.enterAtPlateNo();
	          vehicle.switchToVehicleBoatEntry();
	          vehicle.vehicleBoatEntry.clickSelectButton();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.enterActionDateAsPreviousMonthtFirstDay();
	           traffic.parkingPermits.enterAtPermitLocation();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterValidExtendFromAsPreviousMonthFirstDay();
	           traffic.parkingPermits.enterToDateAsPreviousMonthSixthDay();
	           traffic.parkingPermits.verify10083AckMessage();                                 // issue in chrome browser
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verifyRequiredEntriesMissingAckMsg();
	           traffic.parkingPermits.enterToDateAsPreviousMonthSecondDay();
	           traffic.parkingPermits.selectAdultName();
	           Playback.pageLoadThreadWait();
	           traffic.parkingPermits.save();                                                        
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verify1002AdditionalSuccessfulAckMsg();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.enterActionDateAsPreviousMonthtThirdDay();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterValidExtendFromAsPreviousMonthThirdDay();
	           traffic.parkingPermits.tabOutToDate();
	           traffic.parkingPermits.verify10083AckMessage();                                 // issue in chrome browser
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verifyRequiredEntriesMissingAckMsg();

	       }

	      
	       @Test
	       public void ParkingPermits_112570(ITestContext testContext)
	       {

	    	   testContext.setAttribute("testID", "112570");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits");

	           traffic.switchToParkingPermitMainWindow();
	           traffic.parkingPermits.enterAtPlateNo();
	          vehicle.switchToVehicleBoatEntry();
	         vehicle.vehicleBoatEntry.clickSelectButton();
	           traffic.switchToParkingPermitMainWindow();
	           traffic.parkingPermits.selectActionAsPermit();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.enterAtPermitLocation();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.tabOutValidExtendDate();
	           traffic.parkingPermits.enterToDateAsNextDayFromcurrentDate();
	           traffic.parkingPermits.save();
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verify1003UpdateSuccessfulAckMsg();
	           traffic.parkingPermits.selectActionAsExtension();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.enterNoOfDaysRequestedAs6();
	           traffic.parkingPermits.verify10084AckMessage();
	           traffic.parkingPermits.enterNoOfDaysRequestedAs3();
	           traffic.parkingPermits.save();
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verify1003UpdateSuccessfulAckMsg();
	           traffic.parkingPermits.selectActionAsExtension();
	           traffic.parkingPermits.tabOutActionDate();
	           traffic.parkingPermits.selectReason();
	           traffic.parkingPermits.clearNoOfRequested();
	           traffic.parkingPermits.enterNoOfDaysRequestedAs3();
	           traffic.parkingPermits.save();
	           traffic.parkingPermits.switchToPopupAcknowledge();
	           traffic.parkingPermits.verify1003UpdateSuccessfulAckMsg();
	           traffic.parkingPermits.selectActionAsExtension();
	           traffic.parkingPermits.verify10085AckMessage();

	       }


	      @Test
	       public void PoliceSprintTraffic_172005(ITestContext testContext)   
	       {
	    	  testContext.setAttribute("testID", "172005");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Permits Search");
	           traffic.switchToParkingPermitsSearch();
	           traffic.parkingPermitsSearch.enterAtPlateNo();
	           traffic.parkingPermitsSearch.enterAtPermitNo();
	           traffic.parkingPermitsSearch.selectStatusAsExpired();
	           traffic.parkingPermitsSearch.clickSearchButton();
	           traffic.parkingPermitsSearch.clickRowByAtPlate();
	           traffic.switchToParkingPermit();
	           traffic.parkingPermits.enterNotes();
	           traffic.parkingPermits.clickResetButton();
	           traffic.parkingPermits.verifyNotesCleared();
	      //     traffic.parkingPermits.verifyAtPermitNo();
	           traffic.parkingPermits.verifyAtPlateNo();
	           traffic.parkingPermits.verifyAtLocation();
	           traffic.parkingPermits.verifyAtLastName();
	           traffic.parkingPermits.verifyAtFirstName();
	    //       traffic.parkingPermits.verifyAtPermitInGrid("172005");
	       }

	     @Test
	       public void Police2017Sprint1Traffic_172006(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "172006");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Settings");
	           loader.navigateToScreen("System Parameter");
	       	settings.switchToSystemParamter();
	       settings.sysParameter.setSystemparameter1773AsTrue();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Citation Search");
	           traffic.switchToCitationSearch();
	           traffic.citationSearch.clickClearButton();
	           traffic.citationSearch.enterCENumberCE();
	           traffic.citationSearch.clickSearchButton();
	           traffic.citationSearch.verifyCaseColumnShows();
	           loader.navigateToModule("Settings");
	           loader.navigateToScreen("System Parameter");
	       settings.switchToSystemParamter();
	       settings.sysParameter.setSystemparameter1773AsFalse();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Citation Search");
	           traffic.switchToCitationSearch();
	           traffic.citationSearch.clickRefreshButton();
	           traffic.citationSearch.verifyCallColumnShows();


	       }


	     
	     
	@Test(groups = { "2020DefectTestCases" })
	public void Police2020RecordsModule_244238(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "244238");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter1771AsTrue();
		objectIdentification.windowHandle.phoenixMainWindow();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Permits");

		traffic.switchToParkingPermit();
		traffic.parkingPermits.verifyPermitLocationMandatory();
		traffic.parkingPermits.closeParkingPermitScreen();
		objectIdentification.windowHandle.phoenixMainWindow();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter1771AsFalse();
		objectIdentification.windowHandle.phoenixMainWindow();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Permits");

		traffic.switchToParkingPermit();

		traffic.parkingPermits.enterAtPlateNo();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		traffic.switchToParkingPermit();
		traffic.parkingPermits.enterAtLastName();
		traffic.parkingPermits.enterAtFirstName();
		traffic.parkingPermits.enterAtAddress();
		traffic.parkingPermits.selectAtPermitType();
		traffic.parkingPermits.selectActionAsPermit();
		traffic.parkingPermits.tabOutActionDate();
		traffic.parkingPermits.enterAtPermitLocation();
		Playback.controlReadyThreadWait();
		traffic.parkingPermits.selectReason();
		traffic.parkingPermits.tabOutValidExtendDate();
		traffic.parkingPermits.enterToAsFourthDayOfValidExtendFrom();
		Playback.pageLoadThreadWait();
		traffic.parkingPermits.save();
		traffic.switchToParkingPermitMainWindow();

	}

	     


	    
	      @Test
	       public void CRM_63071Traffic149227(ITestContext testContext)
	       {

	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");

	           traffic.switchToCrashSearch();
	           traffic.crashSearch.selectJurisAsBE();
	           traffic.crashSearch.enterAtCaseNo();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.clickRowAtCaseNo();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToNarrativeTab();
	           traffic.crashEntry.crashEntryNarrativeTab.verifyCurrentDate();
	           traffic.crashEntry.crashEntryNarrativeTab.enterAtSubject();
	           traffic.crashEntry.crashEntryNarrativeTab.clickEnterCommentsButton();
	           traffic.switchToCrashComments();
	           traffic.crashComments.enter100WordsRichText();
	           traffic.crashComments.saveAndCloseScreen();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToNarrativeTab();
	           traffic.crashEntry.crashEntryNarrativeTab.verifyAtSubject(0);
	           traffic.crashEntry.crashEntryNarrativeTab.verifyAtPFCode(0);
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.save();
	           traffic.crashEntry.yes();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToNarrativeTab();
	           traffic.crashEntry.crashEntryNarrativeTab.verifyAtPFCode(0);

	       }

	   
	      @Test
	       public void CRM_65205Traffic172009(ITestContext testContext)
	       {
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Parking Search");

	           traffic.switchToParkingSearch();
	           traffic.parkingSearch.enterAtParkingNoFromField();
	           traffic.parkingSearch.enterAtParkingNoToField();
	           traffic.parkingSearch.clickSearchButton();
	           traffic.parkingSearch.verifyAtParkingNo();
	           traffic.parkingSearch.mouseHoverOnDefendant(0);
	      //     Playback.TakeScreenshot(TrafficTestContext, "VeriftDefendantAndAddress");
	           traffic.parkingSearch.selectRowByAtDefendant();
	           traffic.switchToParkingEntry();
	           traffic.parkingEntry.clickDefandant1Tab();
	           traffic.parkingEntry.defendant1.verifyAtAddress();
	           traffic.parkingEntry.defendant1.clickNameInfoIcon();
	        /*
	            NamesScripts.NamesTestContext = TrafficTestContext;
	           Names.SwitchToNameEntry();
	           Names.NameEntry.VerifyAtAddress(); */

	       }

	      @Test
	       public void CRM_52967Traffic_149528(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "149528");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");

	           traffic.switchToCrashSearch();
	           traffic.crashSearch.enterAtCaseNo();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.clickRowAtCaseNo();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.clickApprovalTab();
	           traffic.crashEntry.verify10089ActionTabConfirmMessage();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
	           traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.clickSaveButton();
	           traffic.crashEntry.verify1051UpdateDataExistsInApprovalTab();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.save();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.verifyStatusAsSubmittedAndAppearAsGreenColor();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.selectActionAsApprove();
	           traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	           traffic.crashEntry.crashEntryApprovalTab.save();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.verifyStatusAsApprovedAndAppearAsGreenColor();
	           traffic.crashEntry.verifySaveButtonDisabled();
	           traffic.crashEntry.verifySaveNCloseButtonDisabled();
	           traffic.crashEntry.switchToApprovalTab();
	           traffic.crashEntry.crashEntryApprovalTab.selectActionAsLock();
	           traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	           traffic.crashEntry.crashEntryApprovalTab.save();
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.verifyStatusAsLockedAndAppearAsGreenColor();
	           traffic.crashEntry.verifySaveButtonDisabled();
	           traffic.crashEntry.verifySaveNCloseButtonDisabled();

	       }

	    
	      @Test
	       public void CRM_58142Traffic_149562(ITestContext testContext)
	       {
	    	  testContext.setAttribute("testID", "149562");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Settings");
	           loader.navigateToScreen("System Parameter");
	        //   Settings.SwitchToSystemParamter();
	      //     Settings.SysParameter.SetSystemparameter1728AsTrue();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Citation Search");

	           traffic.switchToCitationSearch();
	           traffic.citationSearch.clickAddNewButton();
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.selectCETypeAsTrafficViolation();
	           traffic.citationEntry.tabAtDateAndTime();
	           traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
	           traffic.citationEntry.enterAtCitationNo();
	           traffic.citationEntry.enterAtNameID();
	           traffic.citationEntry.switchToLicenseTab();
	           traffic.citationEntry.licenseTab.verifyAtDOB(); 
	           traffic.citationEntry.licenseTab.verifyAtGender(); 
	           traffic.citationEntry.licenseTab.clickNoDLCheckbox();
	           traffic.citationEntry.switchToOffenseTab();
	           traffic.citationEntry.offenseTab.enterAtDescribeLocation();
	           traffic.citationEntry.offenseTab.verifyAtMunicipality();
	           traffic.citationEntry.offenseTab.clickUnclearPlates();
	           traffic.citationEntry.offenseTab.tabOutOffenseDateTime();
	           traffic.citationEntry.switchToPlaintiffTab();
	           traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
	           traffic.citationEntry.clickSaveButton();
	           traffic.citationEntry.verify1018RequiredEntriesAreMissingAckMsg();
	           traffic.citationEntry.plaintiffTab.selectCounty();
	           traffic.citationEntry.save();
	           traffic.citationEntry.clickCopyButton();
	           traffic.citationEntry.verifyCitationFieldEditable();

	       }           

	   
	       
	     @Test
	       public void CRM_66242Traffic_147424(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "147424");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");

	           traffic.switchToCrashSearch();
	           traffic.crashSearch.selectJurisAsSO();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.verifySOJurisRecords();
	           traffic.crashSearch.clickBackButton();
	           traffic.crashSearch.selectJurisAsBL();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.verifyBLJurisRecords();  
	           traffic.crashSearch.clickBackButton();
	           traffic.crashSearch.selectJurisAsBE();
	           traffic.crashSearch.clickSearch();
	           traffic.crashSearch.verifyBEJurisRecords();
	           traffic.crashSearch.clickBackButton();

	       }

	      
	     @Test
	       public void CRM_62649Traffic_147425(ITestContext testContext)                                                  // issue reported
	       {
	    	 testContext.setAttribute("testID", "147425");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Crash Search");

	           traffic.switchToCrashSearch();
	      /*     TrafficWI.CrashSearch.EnterAtCaseNo();
	           TrafficWI.CrashSearch.EnterAtOfficerCode();
	           TrafficWI.CrashSearch.ClickSearch();
	           TrafficWI.CrashSearch.VerifyAtCaseNoByAtCrashNo();
	           TrafficWI.CrashSearch.VerifyAtOfficer(0);
	           TrafficWI.CrashSearch.ClickRowAtCaseNo();
	           TrafficWI.SwitchToCrashEntry();
	           TrafficWI.CrashEntry.ClickWitnessTab();
	           TrafficWI.CrashEntry.WitnessTab.EnterAtNameID();
	           TrafficWI.CrashEntry.WitnessTab.ClickAddbutton();
	           TrafficWI.CrashEntry.WitnessTab.VerifyAtNameInGrid();                          
	           TrafficWI.CrashEntry.Save();
	           TrafficWI.CrashEntry.ClickCaseInfo();
	           RecordsScripts.RecordsTestContext = TrafficTestContext;
	           Records.SwitchToCaseUpdate();
	           Records.CaseUpdate.SwitchToNamesTab();
	           Records.CaseUpdate.CaseUpdateNamesTab.VerifyAtNameInGrid();
	           Records.CaseUpdate.CloseTheScreen();  */
	           traffic.switchToCrashEntry();
	           traffic.crashEntry.clearTheCaseYearAndNo();
	           traffic.crashEntry.enterAtCaseNumber1();
	           traffic.crashEntry.save();
	           traffic.crashEntry.verify1003UpdateSuccessfulFooterMessage();
	           traffic.crashEntry.clickCaseInfo();
	       /*    RecordsScripts.RecordsTestContext = TrafficTestContext;
	           Records.SwitchToCaseUpdate();
	           Records.CaseUpdate.SwitchToNamesTab();
	           Records.CaseUpdate.CaseUpdateNamesTab.VerifyAtNameInGrid();
	           Records.CaseUpdate.CloseTheScreen();  */
	           traffic.crashEntry.close();
	           popup.acknowledge.ok();                                             // NO record message is coming, its automatically searching case no in search screen
	           loader.navigateToModule("Records");
	           loader.navigateToScreen("Case Search");
	     /*      Records.SwitchToCaseSearch();
	           Records.CaseSearch.EnterAtCaseNo();
	           Records.SwitchToCaseUpdate();
	           Records.CaseUpdate.SwitchToNamesTab();
	           Records.CaseUpdate.CaseUpdateNamesTab.VerifyNamesTabGridBlank();  */

	       }

	     
	     @Test
	       public void CRM_63514Traffic_172011(ITestContext testContext)
	        {
	    	 testContext.setAttribute("testID", "172011");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Search");

	        /*    TrafficWI.SwitchToCrashSearch();
	            TrafficWI.CrashSearch.SelectAddressAsIntersection();
	            TrafficWI.CrashSearch.EnterAtStreet1(ITestContext testContext);
	            TrafficWI.CrashSearch.EnterAtStreet2(ITestContext testContext);
	            TrafficWI.CrashSearch.ClickSearch();
	            TrafficWI.CrashSearch.VerifyAtCrash(0);
	            TrafficWI.CrashSearch.SelectRowByAtCrash();
	            TrafficWI.SwitchToCrashEntry();
	            TrafficWI.CrashEntry.VerifyAtReportedLocation();
	            TrafficWI.CrashEntry.SaveNClose();
	            TrafficWI.SwitchToCrashSearch();
	            TrafficWI.CrashSearch.ClickBackButton();
	            TrafficWI.CrashSearch.ClickReset();
	            TrafficWI.CrashSearch.SelectAddressAsIntersection();
	            TrafficWI.CrashSearch.EnterAtStreet1(ITestContext testContext);
	            TrafficWI.CrashSearch.ClickSearch();         
	            TrafficWI.CrashSearch.VerifyAtCrash(0);
	            TrafficWI.CrashSearch.SelectRowByAtCrash();
	            TrafficWI.SwitchToCrashEntry();
	            TrafficWI.CrashEntry.VerifyAtReportedLocation();
	            TrafficWI.CrashEntry.SaveNClose();
	            TrafficWI.SwitchToCrashSearch();
	            TrafficWI.CrashSearch.ClickBackButton();
	            TrafficWI.CrashSearch.ClickReset();
	            TrafficWI.CrashSearch.SelectAddressAsIntersection();
	            TrafficWI.CrashSearch.EnterAtStreet2InStreet1Field();
	            TrafficWI.CrashSearch.ClickSearch();            
	            TrafficWI.CrashSearch.VerifyAtCrash(0);
	            TrafficWI.CrashSearch.SelectRowByAtCrash();
	            TrafficWI.SwitchToCrashEntry();
	            TrafficWI.CrashEntry.VerifyAtReportedLocation();  */
	            
	          
	       }

	 
	     @Test
	       public void CRM_61865Traffic_172012(ITestContext testContext)
	        {
	    	 testContext.setAttribute("testID", "172012");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Search");

	            traffic.switchToCrashSearch();
	            traffic.crashSearch.enterAtCaseNo();
	            traffic.crashSearch.enterAtOfficer();
	            traffic.crashSearch.clickSearch();
	            traffic.crashSearch.verifyAtCaseNoByAtCrashNo();
	            traffic.crashSearch.verifyAtOfficer(0);
	            traffic.crashSearch.verifyTotalUnitAs0();
	            traffic.crashSearch.clickRowAtCaseNo();
	            traffic.switchToCrashEntry();
	            traffic.crashEntry.clickPrintButton();
	      /*      HomeScripts.HomeTestContext = TrafficTestContext;
	            Home.SwitchToSelectReport();
	            Home.SelectReport.ClickCrashReport2017InGrid();
	            Home.SelectReport.Verify6040CrashReportNotGenerateWithoutVehicleAckMsg();
	            Home.SelectReport.CloseCrashPDFWindow();
	            Home.SelectReport.CloseTheScreen();  */
	            traffic.crashEntry.close();
	            traffic.switchToCrashSearch();
	            traffic.crashSearch.clickBackButton();
	            traffic.crashSearch.clickReset();
	            traffic.crashSearch.enterAtCaseNo();
	            traffic.crashSearch.enterAtOfficer();
	            traffic.crashSearch.clickSearch();
	            traffic.crashSearch.verifyAtCaseNoByAtCrashNo();
	            traffic.crashSearch.verifyAtOfficerByAtCrashNo1();
	            traffic.crashSearch.verifyTotalUnitAs1();
	            traffic.crashSearch.clickRowByAtCrashNo1();
	            traffic.switchToCrashEntry();
	            traffic.crashEntry.clickPrintButton();
	   /*         HomeScripts.HomeTestContext = TrafficTestContext;
	            Home.SwitchToSelectReport();
	            Home.SelectReport.ClickCrashReport2017InGrid();
	            Playback.pageLoadThreadWait();
	            Playback.ThreadWait();
	            Playback.TakeScreenshot(TrafficTestContext, "Verify SSRS Report Opened");
	            Home.SelectReport.CloseTheScreen();  */

	        }

	     
	     @Test
	       public void CRM_61226Traffic_172013(ITestContext testContext)
	       {
	    	 testContext.setAttribute("testID", "172013");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Court");

	            traffic.switchToCourtScreen();
	            traffic.court.clickAddNewButton();
	            traffic.switchToCourtEntry();
	            traffic.courtEntry.clickCustomText();
	        /*    SettingsScripts.SettingsTestContext = TrafficTestContext;
	            Settings.SwitchToRepositoryEntry();
	            Settings.RepositoryEntry.EnterAtCustomName();
	            Settings.RepositoryEntry.SaveNClose();   */
	            traffic.switchToCourtEntry();
	            traffic.courtEntry.verifyAtCustomNameAppears();
	            traffic.courtEntry.closeTheScreen();
	        }




	     @Test
	        public void Police2017SprintTrafficModule_155201(ITestContext testContext)
	        {
	    	 testContext.setAttribute("testID", "155201");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Search");
	            traffic.switchToCrashSearch();
	            traffic.crashSearch.enterAtCaseNo();
	            traffic.crashSearch.clickSearch();
	            traffic.crashSearch.verifyAtCrash(0);
	            traffic.crashSearch.selectRowByAtCrash();
	            traffic.switchToCrashEntry();
	            traffic.crashEntry.verifyAtCrashNo();
	            traffic.crashEntry.clickNotificationIcon();
	          /*  Home.SwitchToNotificationScreen();
	            HomeScripts.HomeTestContext = TrafficTestContext;
	            Home.Notification.VerifyAtRequestPFCode();
	            Home.Notification.EnterStartDateAsCurrentDate();
	            Home.Notification.EnterExpireDateAsFutureDate();
	            Home.Notification.ClickPFRadioButton();
	            Home.Notification.EnterAtPFCode();
	            Home.Notification.SelectAtReportingPeriod();
	            Home.Notification.SelectNotifyEvent();
	            Home.Notification.ClickAddButton();
	            Home.Notification.VerifyAtPeriod(0);
	            Home.Notification.VerifyStartDateAsCurrentDate(0);
	            Home.Notification.VerifyExpireDateAsFutureDate(0);
	            Home.Notification.SaveScreen();   //issue in police NJ Automation DB Build error shows
	            Home.SwitchToNotificationScreen();
	            Home.Notification.VerifySuccessfulBottomMessage();
	            Home.Notification.CloseScreen(); */
	            traffic.switchToCrashEntry();
	            traffic.crashEntry.clickALCIcon();
	         /*   Home.SwitchToALCScreen();
	            HomeScripts.HomeTestContext = TrafficTestContext;
	            Home.ALCScreen.ClickPFTab();
	            Home.ALCScreen.ALCPFTab.SelectAtAction();
	            Home.ALCScreen.ALCPFTab.EnterAtPFCode();
	            Home.ALCScreen.ALCPFTab.ClickAddButton();
	            Home.ALCScreen.ALCPFTab.VerifyAtActionInGrid(0);
	            Home.ALCScreen.ClickGroupTab();
	            Home.ALCScreen.ALCGroupTab.SelectAtAction();
	            Home.ALCScreen.ALCGroupTab.SelectDivision();
	            Home.ALCScreen.ALCGroupTab.SelectSection();
	            Home.ALCScreen.ALCGroupTab.ClickAdd();
	            Home.ALCScreen.ALCGroupTab.VerifyAtActionInGrid(0);
	            Home.ALCScreen.SaveScreen();
	            Home.SwitchToALCScreen();
	            Home.ALCScreen.VerifySuccessfulStatusMessage();
	            Home.ALCScreen.CloseScreen(); */
	            traffic.switchToCrashEntry();
	            traffic.crashEntry.close();
	        }


	     @Test
	        public void Police2017SprintTrafficModule_155208(ITestContext testContext)
	        {
	    	 testContext.setAttribute("testID", "155208");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Parking Search");
	            traffic.switchToParkingSearch();
	            traffic.parkingSearch.enterAtParkingFromField();
	            traffic.parkingSearch.enterAtParkingToField();
	            traffic.parkingSearch.clickSearchButton();
	            traffic.parkingSearch.selectRowByAtTicketNo();
	            traffic.switchToParkingEntry();
	            traffic.parkingEntry.verifyStatusAsIssued();
	            traffic.parkingEntry.switchToPaymentsTab();
	            traffic.parkingEntry.paymentsTab.clickAddotherPaymentsButton();
	            traffic.switchToParkingOtherPayment();
	            traffic.parkingOtherPayment.tabDate();
	            traffic.parkingOtherPayment.enterAtPayment();
	            traffic.parkingOtherPayment.selectPaymentmethodAsCreditAdjustment();
	            traffic.parkingOtherPayment.enterRemarksAsCreditAdjustmentAmount();
	            traffic.parkingOtherPayment.saveandClosetheScreen();
	            traffic.switchToParkingEntry();
	            traffic.parkingEntry.verifyStatusAsPaid();
	            traffic.parkingEntry.switchToPaymentsTab();
	            traffic.parkingEntry.paymentsTab.verifyTypeAsCreditAdjustment(0);
	            traffic.switchToParkingEntry();
	            traffic.parkingEntry.switchToHistoryTab();
	            traffic.parkingEntry.parkingEntryHistoryTab.verifyPaymentReceipt();
	            traffic.parkingEntry.parkingEntryHistoryTab.verifyCreditAdjustment();
	            traffic.parkingEntry.parkingEntryHistoryTab.verifyAtPayment();
	            traffic.parkingEntry.parkingEntryHistoryTab.verifyRemarksCreditAdjustmentAmount();
	            traffic.switchToParkingEntry();
	            traffic.parkingEntry.savetheScreen();
	            traffic.switchToParkingEntry();
	            traffic.parkingEntry.closeParkingEntryScreen();
	        }

	    
	     @Test
	        public void Police2017SprintTrafficModule_155958(ITestContext testContext)
	        {
	    	 testContext.setAttribute("testID", "155958");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Citation Search");
	            traffic.switchToCitationSearch();
	            traffic.citationSearch.enterCENumberAtCENo();
	            traffic.citationSearch.clickClearButton();
	            traffic.citationSearch.enterAtLastName();
	            traffic.citationSearch.enterAtFirstName();
	            traffic.citationSearch.clickSearchButton();
	            traffic.citationSearch.verifyAtCENo(0);
	            traffic.citationSearch.verifyAtName();
	            traffic.citationSearch.clickAtCENo();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.clickPrintButton();
	         /*   Home.SwitchToSelectReport();
	            Home.SelectReport.ClickCitationSummaryReport();
	            Home.SwitchToPnxReportSSRSPDFScreen();
	            Home.PnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
	            Home.SwitchToSelectReport();
	            Home.SelectReport.CloseTheScreen(); */
	        }


	        
	        
	        public void Police2017SprintTrafficModule_155959(ITestContext testContext)
	        {
	        	testContext.setAttribute("testID", "155959");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Citation Search");
	            traffic.switchToCitationSearch();
	            traffic.citationSearch.clickClearButton();
	            traffic.citationSearch.selectCETypeAsTrafficViolation();
	            traffic.citationSearch.clickSearchButton();
	            traffic.citationSearch.clickPrintButton();
	    /*        Home.SwitchToSelectReport();
	            Home.SelectReport.ClickCitationsbyOfficersReportRecord();
	            Home.PnxReportCrystalPDFScreen.ClosePnxReportCrystalPDFScreen();

	            Home.SwitchToSelectReport();
	            Home.SelectReport.ClickCitationSummaryReportRecord();
	            Home.PnxReportCrystalPDFScreen.ClosePnxReportCrystalPDFScreen();

	            Home.SwitchToSelectReport();
	            Home.SelectReport.ClickCitationsbyStatutesReportRecord();
	            Home.PnxReportCrystalPDFScreen.ClosePnxReportCrystalPDFScreen();

	            Home.SwitchToSelectReport();
	            Home.SelectReport.CloseTheScreen();  */

	        }


	        @Test
	        public void Police2017SprintTrafficModule_155962(ITestContext testContext)
	        {
	        	testContext.setAttribute("testID", "155962");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Citation Search");
	            traffic.switchToCitationSearch();
	            traffic.citationSearch.clickAddNewButton();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.selectCETypeAsTrafficViolation();
	            traffic.citationEntry.tabAtDateAndTime();
	            traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
	            traffic.citationEntry.enterAtLastName();
	            traffic.citationEntry.enterAtFirstName();
	     /*       Names.SwitchToNameSearchHelpWindow();
	            NamesScripts.NamesTestContext = TrafficTestContext;
	            Names.NameSearchHelpWindow.SelectNameByLastNameAndFirstName();
	            traffic.switchToCitationEntry();   */
	            traffic.citationEntry.clickSavePrintButton();
	            traffic.citationEntry.verifyAcknowledgeCharge();
	            traffic.citationEntry.switchToOffenseTab();
	            traffic.citationEntry.offenseTab.enterAtDescribeLocation();
	            traffic.citationEntry.offenseTab.clickUnclearPlates();
	            traffic.citationEntry.offenseTab.tabOutOffenseDateTime();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.clickSavePrintButton();
	            traffic.citationEntry.verify1018RequiredEntriesAreMissingAckMsg();
	            traffic.citationEntry.switchToPlaintiffTab();
	            traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
	            traffic.citationEntry.plaintiffTab.selectCounty();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.savePrintButton();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.verifyHistroyCopyButtonEnabled();
	            traffic.citationEntry.switchToAllTabs();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.clickCopyButton();
	            traffic.switchToCitationEntry();  
	            traffic.citationEntry.verifyCENoFieldEmpty();
	            traffic.citationEntry.clickSavePrintButton();
	            traffic.citationEntry.verifyAcknowledgeCharge();
	            traffic.citationEntry.closeCitationEntryScreen();

	        }

	       @Test
	        public void Police2017SprintTrafficModule_155963(ITestContext testContext)  //police MJ WI DB
	        {
	    	   testContext.setAttribute("testID", "155963");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Search");
	      /*      TrafficWI.SwitchToCrashSearch();
	            TrafficWI.CrashSearch.EnterAtTracsRefNo();
	            TrafficWI.CrashSearch.ClickSearch();
	            TrafficWI.CrashSearch.VerifyAtCrash(0);
	            TrafficWI.CrashSearch.VerifyAtCaseNo(0);
	            TrafficWI.CrashSearch.SelectRowByAtCrash();
	            TrafficWI.SwitchToCrashEntry();
	            TrafficWI.CrashEntry.VerifyAtTracsRefNo();
	            TrafficWI.CrashEntry.ClickWitnessTab();
	            TrafficWI.CrashEntry.WitnessTab.VerifyAtNameInGrid(0);
	            TrafficWI.CrashEntry.WitnessTab.EnterAtNameID();
	            TrafficWI.CrashEntry.ClickSaveButton();
	            TrafficWI.CrashEntry.VerifyWIUpdateAcknowledgeMessageWitnessTab();
	            TrafficWI.CrashEntry.ClickWitnessTab();
	            TrafficWI.CrashEntry.WitnessTab.ClickAddbutton();
	            TrafficWI.CrashEntry.WitnessTab.VerifyAtName1InGrid(1);
	            TrafficWI.CrashEntry.WitnessTab.VerifyAtPhoneInGrid(1);
	            TrafficWI.CrashEntry.WitnessTab.DeleteAtNameInGrid();
	            TrafficWI.CrashEntry.Save();
	            TrafficWI.SwitchToCrashEntry();
	            TrafficWI.CrashEntry.ClickWitnessTab();
	            TrafficWI.CrashEntry.WitnessTab.VerifyDeletedRowCountInGrid(1);
	            TrafficWI.CrashEntry.WitnessTab.VerifyAtName1InGrid(0);  */
	        }

	       @Test
	        public void Police2017SprintTrafficModule_158779(ITestContext testContext)  //Police MJ DB
	        {

	    	   testContext.setAttribute("testID", "158779");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Search");
	            traffic.switchToCrashSearch();
	            traffic.crashSearch.enterAtCaseNo();
	            traffic.crashSearch.clickSearch();
	            traffic.crashSearch.clickRowByAtCrash();
	            traffic.switchToCrashEntry();
	            traffic.crashEntry.clickALCIcon();
	        /*    Home.SwitchToALCScreen();
	            HomeScripts.HomeTestContext = TrafficTestContext;
	            Home.ALCScreen.ClickPFTab();
	            Home.ALCScreen.ALCPFTab.SelectAtAction();
	            Home.ALCScreen.ALCPFTab.EnterAtPFCode();
	            Home.ALCScreen.ALCPFTab.ClickAddButton();
	            Home.ALCScreen.ALCPFTab.VerifyAtActionInGrid(0);
	            Home.ALCScreen.SaveScreen();
	            Home.SwitchToALCScreen();
	            Home.ALCScreen.CloseScreen();  */
	            traffic.switchToCrashEntry();
	            traffic.crashEntry.closeScreen();
	           // loader.header.LogOutRMS();
	            objectIdentification.windowHandle.switchToWindowUsingURL("Police");
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Search");
	            traffic.switchToCrashSearch();
	            traffic.crashSearch.enterAtCaseNo();
	            traffic.crashSearch.clickSearch();
	            traffic.crashSearch.verifyAcknowledgeNoRecord();
	            traffic.crashSearch.clickReset();
	            traffic.crashSearch.clickSearch();
	            traffic.crashSearch.clickPrint();
	        //    Home.SwitchToSelectReport();
	        //    Home.SelectReport.VerifyRecordCountCrashSearch();

	        }

	     @Test
	        public void Police2017SprintTrafficModule_158782(ITestContext testContext)
	        {
	    	 testContext.setAttribute("testID", "158782");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Deer Crash");
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.clickSave();
	            traffic.deerCrash.verify1018RequiredEntriesAreMissingAckMsg();
	            traffic.deerCrash.enterAtReportedLocation();
	            traffic.deerCrash.enterAtDotNo();
	            traffic.deerCrash.enterAtAccidentNo();
	            traffic.deerCrash.enterAtOfficer();
	            traffic.deerCrash.tabDateAndTime();
	            traffic.deerCrash.clickSave();
	            traffic.deerCrash.verify1018RequiredEntriesAreMissingAckMsg();
	            traffic.deerCrash.clickAccidentTab();
	            traffic.deerCrash.deerCrashAccidentTab.selectRandomFirstHarmfulEvent();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.deerCrashAccidentTab.selectAccidentLocation();
	            traffic.deerCrash.deerCrashAccidentTab.selectRandomCounty();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.deerCrashAccidentTab.enterHwyNoAsNH();
	            traffic.deerCrash.deerCrashAccidentTab.selectOnHwyType();
	            traffic.deerCrash.deerCrashAccidentTab.selectFromHwyType();
	            traffic.deerCrash.clickDriverTab();
	            traffic.deerCrash.driverTab.selectDirectionofTravel();
	            traffic.deerCrash.driverTab.selectSpeedLimit();
	            traffic.deerCrash.driverTab.selectOnDutyAccident();
	            traffic.deerCrash.driverTab.selectUnitStatus();
	            traffic.deerCrash.driverTab.selectEjected();
	            traffic.deerCrash.driverTab.selectUnitType();
	            traffic.deerCrash.driverTab.enterAtLastName();
	            traffic.deerCrash.driverTab.enterAtFirstName();
	      //      NamesScripts.NamesTestContext = TrafficTestContext;
	     //       Names.NameSearchHelpWindow.SelectNameByLastNameAndFirstName();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.driverTab.selectOperatingDLClass();
	            traffic.deerCrash.driverTab.selectOperatingDLEndrs();
	            traffic.deerCrash.driverTab.selectInjurySeverity();
	            traffic.deerCrash.driverTab.selectAirBag();
	            traffic.deerCrash.driverTab.enterVehicle();
	       //     VehicleScripts.VehicleTestContext = TrafficTestContext;
	     //       Vehicle.SwitchToVehicleBoatSearchHelpWindow();
	      //      Vehicle.VehicleBoatSearchHelpWindow.SelectVehicle();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.driverTab.selectExtentofDamage();
	            traffic.deerCrash.driverTab.selectVehicleDamage();
	            traffic.deerCrash.saveScreen();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.verify1002AdditionalSuccessfulAckMsg();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.clickAllTabs();
	            traffic.deerCrash.switchToNarrativeTab();
	            traffic.deerCrash.deerCrashNarrativeTab.enterRichText();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.clickSave();
	            traffic.deerCrash.verifyAcknoledgeUpdateNarrativeTab();
	            traffic.deerCrash.switchToNarrativeTab();
	            traffic.deerCrash.deerCrashNarrativeTab.saveInternalTab();
	            traffic.switchToDeerCrash();
	            traffic.deerCrash.saveScreen();
	        }

	       @Test
	        public void Police2017SprintTrafficModule_158783(ITestContext testContext)   //Police MJ 
	        {
	    	   testContext.setAttribute("testID", "158783");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	         //   login.loginScreen.clickCJISpolicyCheckBox();
	         //   login.loginScreen.ClickCJISpolicyOK();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Search");
	          /*  TrafficWI.SwitchToCrashSearch();
	            TrafficWI.CrashSearch.EnterAtTracsRefNo();
	            TrafficWI.CrashSearch.EnterAtDOTNo();
	            TrafficWI.CrashSearch.EnterAtAccidentNo();
	            TrafficWI.CrashSearch.SelectCrashTypeAsDeerCrash();
	            TrafficWI.CrashSearch.ClickSearch();
	            TrafficWI.CrashSearch.VerifyAtCrash(0);
	            TrafficWI.CrashSearch.VerifyCrashTypeAsDInGrid(0);
	            TrafficWI.CrashSearch.SelectRowByAtCrash();
	            TrafficWI.SwitchToDeerCrashEntry();
	            TrafficWI.DeerCrash.VerifyAtTracsRefNo();
	            TrafficWI.DeerCrash.ClickDeleteIcon();
	            TrafficWI.DeerCrash.VerifyDeleteConfirmMrssage();
	            TrafficWI.SwitchToCrashSearch();
	            TrafficWI.CrashSearch.VerifyAcknowledgeNoRecord();  */

	        }

	    
	       @Test
	       public void CreatingCitationEntryforParkingViolation_199143(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "199143");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Citation Entry");
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.enterAtCallNo();
	           traffic.citationEntry.selectCETypeAsTrafficViolation();
	           traffic.citationEntry.enterAtNameID();
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.switchToViolationsTab();
	           traffic.citationEntry.violationsTab.tabOfficer();
	           traffic.citationEntry.violationsTab.enterCharge();
	           traffic.citationEntry.violationsTab.verifyAtNIBRS();
	           traffic.citationEntry.violationsTab.clickAddButton();
	           traffic.citationEntry.save();
	       }

	       @Test
	       public void VerifyCitationEntryforTrafficViolation_202669(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "202669");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Citation Entry");
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.enterAtCallNo();
	           traffic.citationEntry.selectCETypeAsTrafficViolation();
	           traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
	           traffic.citationEntry.enterAtNameID();
	           traffic.citationEntry.switchToOffenseTab();
	           traffic.citationEntry.offenseTab.enterChargeAsFugitiveFelony();
	           traffic.citationEntry.offenseTab.enterAtStreet();
	           traffic.citationEntry.switchToOfficerTab();
	           traffic.citationEntry.officerTab.enterAtPFCode();
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.saveandCloseTheScreen();
	       }

	     
	       @Test
	       public void TrafficModuleCRM_203135(ITestContext testContext)
	       {
	    	   testContext.setAttribute("testID", "203135");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Settings");
	           loader.navigateToScreen("System Parameter");
	        /*   Settings.SwitchToSystemParamterScreen();
	           Settings.SysParameter.SetSystemparameter2006AsTrue();
	           Settings.SwitchToSystemParamterScreen();  */
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Citation Entry");
	           traffic.citationEntry.selectCETypeAsNonTrafficViolation();
	           traffic.citationEntry.enterAtNameID();
	           traffic.citationEntry.switchToViolationsTab();
	           traffic.citationEntry.violationsTab.enterAtLocation();
	           traffic.citationEntry.violationsTab.tabOfficer();
	           traffic.citationEntry.violationsTab.enterAtCharge();
	           //need to add citation Arrest screen
	           traffic.switchToCitationEntry();
	           loader.navigateToModule("Settings");
	           loader.navigateToScreen("System Parameter");
	        /*   Settings.SwitchToSystemParamterScreen();
	           Settings.SysParameter.SetSystemparameter2006AsFalse();
	           Settings.SwitchToSystemParamterScreen();   */
	           traffic.citationEntry.selectCETypeAsNonTrafficViolation();
	           traffic.citationEntry.enterAtNameID();
	           traffic.citationEntry.switchToViolationsTab();
	           traffic.citationEntry.violationsTab.enterAtLocation();
	           traffic.citationEntry.violationsTab.tabOfficer();
	           traffic.citationEntry.violationsTab.enterAtCharge();
	           traffic.citationEntry.violationsTab.clickAddButton();
	           traffic.citationEntry.save();


	        }

	        @Test
	        public void Police2018TrafficModule_196729(ITestContext testContext) 
	        {
	        	testContext.setAttribute("testID", "196729");
	           Browser.NavigateToLoginScreen();
	           login.loginScreen.Logon();
	           loader.navigateToModule("Traffic");
	           loader.navigateToScreen("Citation Search");
	           traffic.switchToCitationSearch();
	           traffic.citationSearch.clickAddNewButton();
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.selectAtCEType();
	           traffic.citationEntry.tabAtDateAndTime();
	           traffic.citationEntry.enterAtNameID();
	           traffic.citationEntry.switchToViolationsTab();
	           traffic.citationEntry.violationsTab.enterAtLocation();
	           traffic.citationEntry.violationsTab.tabOfficer();
	           traffic.citationEntry.violationsTab.enterAtCharge();
	           traffic.switchToCitationArrest();
	           traffic.citationArrest.selectArmed();
	           traffic.citationArrest.saveCloseScren();
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.violationsTab.selectAtWINIBRS(); //no need to select already it shows in field
	           traffic.citationEntry.violationsTab.verifyAtNIBRSWI();
	           traffic.citationEntry.violationsTab.clickAddButton();
	           traffic.citationEntry.violationsTab.verifyViolationAddedGrid();
	           traffic.citationEntry.save();
	           traffic.switchToCitationEntry();
	           traffic.citationEntry.violationsTab.clickRowInGrid(0);
	           traffic.citationEntry.violationsTab.verifyAtNIBRSWI();
	           traffic.citationEntry.violationsTab.verifyAtLocation();
	       }


	       @Test
	        public void Police2018TrafficModule_199136(ITestContext testContext)
	        {
	    	   testContext.setAttribute("testID", "199136");
	            String getLatLongvalue = null;
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Citation Search");
	            traffic.switchToCitationSearch();
	            traffic.citationSearch.enterCENumberAtCENo();
	            traffic.citationSearch.clickClearButton();
	            traffic.citationSearch.clickSearchButton();
	            traffic.citationSearch.verifyAtCENo(0);
	            traffic.citationSearch.verifyAtCallNo(0);
	            traffic.citationSearch.clickAtCENo();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.switchToViolationsTab();
	            traffic.citationEntry.violationsTab.enterAtLocation();
	            traffic.citationEntry.violationsTab.clickLocationVerifyCheckbox();
	            traffic.citationEntry.violationsTab.enterAtCharge();
	            traffic.switchToCitationArrest();
	            traffic.citationArrest.close();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.violationsTab.clickAddButton();
	            traffic.citationEntry.save();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.switchToViolationsTab();
	            traffic.citationEntry.violationsTab.clickLocationInfoIconWI();
	        /*    Geo.SwitchToAddressSearchHelpWindow();
	            Geo.AddressSearchHelp.SwitchToDetailsTab();
	          //  GeoScripts.GeoTestContext = TrafficTestContext;
	            Geo.AddressSearchHelp.AddressSearchHelpDetailsTab.EnterAtLatitude();
	            Geo.AddressSearchHelp.AddressSearchHelpDetailsTab.EnterAtLongitude();
	            Geo.AddressSearchHelp.AddressSearchHelpDetailsTab.SaveTab();
	            Geo.SwitchToAddressSearchHelpWindow();
	            Geo.AddressSearchHelp.SwitchToMapTab();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyAtLatitudeLongitude();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.ClickReset();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.ClickUpdateLatLangButton();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyLatLongUpdateConfirmMessage();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyUpdateLatLongValueConfirmMessage();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyLatlongUpdatedSuccessfullyAcknowledge();
	            Geo.SwitchToAddressSearchHelpWindow();
	            Geo.AddressSearchHelp.SwitchToMapTab();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.GetLatLongvalue(getLatLongvalue);
	            Geo.AddressSearchHelp.CloseAddressSearchScreen();	*/
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.save();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.switchToMapTab();
	            traffic.citationEntry.citationEntryMapTab.verifyLatLongValue(getLatLongvalue);

	        }

	     
	        public void Police2018TrafficModule_199137(ITestContext testContext)
	        {
	        	testContext.setAttribute("testID", "199137");
	            String getLatLongvalue = null;
	            Browser.NavigateToLoginScreen();
	         //   login.loginScreen.LogonNJ(TrafficTestContext);
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Citation Search");
	            traffic.switchToCitationSearch();
	            traffic.citationSearch.clickClearButton();
	            traffic.citationSearch.enterCENumberAtCENo();
	            traffic.citationSearch.clickSearchButton();
	            traffic.citationSearch.verifyAtCENo(0);
	            traffic.citationSearch.verifyAtCallNo(0);
	            traffic.citationSearch.clickAtCENo();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.switchToOffenseTab();
	            traffic.citationEntry.offenseTab.clickDescribeLocationInfoButton();
	      /*      Geo.SwitchToAddressSearchHelpWindow();
	            Geo.AddressSearchHelp.SwitchToDetailsTab();
	            GeoScripts.GeoTestContext = TrafficTestContext;
	            Geo.AddressSearchHelp.AddressSearchHelpDetailsTab.EnterAtLatitude();
	            Geo.AddressSearchHelp.AddressSearchHelpDetailsTab.EnterAtLongitude();
	            Geo.AddressSearchHelp.AddressSearchHelpDetailsTab.SaveTab();
	            Geo.SwitchToAddressSearchHelpWindow();
	            Geo.AddressSearchHelp.SwitchToMapTab();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyAtLatitudeLongitudeNJ();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.ClickReset();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.ClickUpdateLatLangButton();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyLatLongUpdateConfirmMessage();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyUpdateLatLongValueConfirmMessage();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.VerifyLatlongUpdatedSuccessfullyAcknowledge();
	            Geo.SwitchToAddressSearchHelpWindow();
	            Geo.AddressSearchHelp.SwitchToMapTab();
	            Geo.AddressSearchHelp.AddressSearchHelpMapTab.GetLatLongvalue(out getLatLongvalue);
	            Geo.AddressSearchHelp.CloseAddressSearchScreen(); */
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.save();
	            traffic.switchToCitationEntry();
	            traffic.citationEntry.switchToMapTab();
	            traffic.citationEntry.citationEntryMapTab.verifyLatLongValue(getLatLongvalue);

	        }  
		  

	    	@Test(groups={"2020DefectTestCases"})
	    	public void VerifyCrashReportBloodAlcoholLevels_244235(ITestContext testContext)
	    	{
	    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "244235");
	    	      Browser.NavigateToLoginScreen();
	    	      login.loginScreen.logonUsingTestContext();
	    	      loader.navigateToModule("Traffic");
	    	      loader.navigateToScreen("Crash Entry");
	    	      traffic.switchToCrashEntryScreen();
	    	      traffic.crashEntry.enterAtCaseNo();
	    	      traffic.crashEntry.enterAtOfficer();
	    	      traffic.crashEntry.enterAtUnit();
	    	      traffic.crashEntry.save();
	    	      traffic.switchToCrashEntry();
	    	      traffic.crashEntry.switchToMainTab();
	    	      traffic.crashEntry.crashEntryMainTab.clickReportableCheckBox();
	    	      traffic.crashEntry.crashEntryMainTab.selectRoadDividedBy();
	    	      traffic.crashEntry.crashEntryMainTab.selectRoadSystem();
	    	      traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceType();
	    	      traffic.crashEntry.crashEntryMainTab.selectCrashType();
	    	      traffic.crashEntry.crashEntryMainTab.selectFirstHarmfulEvent();
	    	      traffic.crashEntry.crashEntryMainTab.selectTemproraryTrafficControlZone();
	    	      traffic.crashEntry.crashEntryMainTab.selectRoadCharacterHorizontalAlignment();
	    	      traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceConditions();
	    	      traffic.crashEntry.crashEntryMainTab.selectLightCondition();
	    	      traffic.crashEntry.crashEntryMainTab.selectRoadCharacterGrade();
	    	      traffic.crashEntry.crashEntryMainTab.selectEnvironmentCondition();
	    	      traffic.crashEntry.save();
	    	      traffic.switchToCrashEntry();
	    	      traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	      traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
	    	      traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
	    	      traffic.switchToCrashUnit();
	    	      traffic.crashUnit.enterAtNoOfOccupants();
	    	      traffic.crashUnit.switchToPersonTab();
	    	      traffic.crashUnit.personTab.selectAtTypeOfPerson();
	    	      traffic.switchToCrashUnit();
	    	      traffic.crashUnit.switchToVehicleTab();
	    	      traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
	    	      vehicle.switchToVehicleBoatEntry();
	    	      vehicle.vehicleBoatEntry.saveAndCloseScreen();
	    	      traffic.switchToCrashUnit();
	    	      traffic.crashUnit.switchToVehicleTab();
	    	      traffic.crashUnit.crashUnitVehicleTab.selectAtType();
	    	      traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
	    	      traffic.switchToCrashUnit();
	    	      traffic.crashUnit.switchToDamageConditionsTab();
	    	      traffic.crashUnit.damageConditionsTab.selectInitialImpact();
	    	      traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
	    	      traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
	    	      traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
	    	      traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
	    	      traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
	    	      traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
	    	      traffic.crashUnit.damageConditionsTab.selectTrafficControls();
	    	      traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
	    	      traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
	    	      traffic.crashUnit.damageConditionsTab.selectAlcoholType();
	    	      traffic.crashUnit.damageConditionsTab.enterAtAlcoholResultValue();
	    	      traffic.crashUnit.saveAndClose();
	    	      traffic.switchToCrashEntry();
	    	      traffic.crashEntry.clickPrintButton();
	    	      home.switchToSelectReport();
	    	      home.selectReport.ClickCrashReport2017InGrid();
	    	     traffic.switchToCrashReport();
	    	
	    	}	 	
		 
	    	
	    	// july Sprint 2 Automated by Mahesha
	        @Test(groups={"2020DefectTestCases"})
	        public void PoliceDefect2020PolicyNoVerify_250100(ITestContext testContext)
	        {
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	                 testContext.setAttribute("testID", "250100");
	              Browser.NavigateToLoginScreen();
	              login.loginScreen.logonUsingTestContext();
	              
	              loader.navigateToModule("Vehicle");
	              loader.navigateToScreen("Vehicle/Boat Entry");
	              vehicle.switchToVehicleBoatEntry();
	          
	              vehicle.vehicleBoatEntry.enterAtVinNo();
	              vehicle.vehicleBoatEntry.enterAtYear();
	              vehicle.vehicleBoatEntry.enterAtMake();
	              vehicle.vehicleBoatEntry.enterAtModel();
	             
	              vehicle.vehicleBoatEntry.selectVOD();
	              vehicle.vehicleBoatEntry.enterAtStyle();
	              vehicle.vehicleBoatEntry.selectAtInsuranceCompanyByValue();
	              vehicle.vehicleBoatEntry.enterInsurancePoliceNumber();
	              vehicle.vehicleBoatEntry.enterDescription();
	              vehicle.vehicleBoatEntry.clickMainTab();
	              vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterAtPlateNumber();
	              vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectStateAsWI();
	             
	              vehicle.vehicleBoatEntry.saveAndCloseScreen();
	             
	              loader.navigateToModule("Traffic");
	              loader.navigateToScreen("Crash Entry");
	              traffic.switchToCrashEntryScreen();
	              traffic.crashEntry.enterAtCaseNo();
	              traffic.crashEntry.enterAtOfficer();
	              traffic.crashEntry.enterAtVehicle();
	              traffic.crashEntry.save();
	               
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.switchToMainTab();
	              traffic.crashEntry.crashEntryMainTab.clickReportableCheckBox();
	              traffic.crashEntry.crashEntryMainTab.selectRoadDividedBy();
	              traffic.crashEntry.crashEntryMainTab.selectRoadSystem();
	              traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceType();
	              traffic.crashEntry.crashEntryMainTab.selectCrashType();
	              traffic.crashEntry.crashEntryMainTab.selectFirstHarmfulEvent();
	              traffic.crashEntry.crashEntryMainTab.selectTemproraryTrafficControlZone();
	              traffic.crashEntry.crashEntryMainTab.selectRoadCharacterHorizontalAlignment();
	              traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceConditions();
	              traffic.crashEntry.crashEntryMainTab.selectLightCondition();
	              traffic.crashEntry.crashEntryMainTab.selectRoadCharacterGrade();
	              traffic.crashEntry.crashEntryMainTab.selectEnvironmentCondition();
	              traffic.crashEntry.save();
	              traffic.switchToCrashEntry(); 
	              traffic.crashEntry.switchToMotoristNonMotoristTab();
	              traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
	              traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.enterAtNoOfOccupants();
	              traffic.crashUnit.switchToPersonTab();
	              traffic.crashUnit.personTab.selectAtTypeOfPerson();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToVehicleTab();
	              traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
	              vehicle.switchToVehicleBoatEntry();
	              vehicle.vehicleBoatEntry.saveAndCloseScreen();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToVehicleTab();
	              traffic.crashUnit.crashUnitVehicleTab.verifyAtPolicyNumber();
	              
	              traffic.crashUnit.crashUnitVehicleTab.selectAtType();
	              traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToDamageConditionsTab();
	              traffic.crashUnit.damageConditionsTab.selectInitialImpact();
	              traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
	              traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
	              traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
	              traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
	              traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
	              traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
	              traffic.crashUnit.damageConditionsTab.selectTrafficControls();
	              traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
	              traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
	              traffic.crashUnit.damageConditionsTab.selectAlcoholType();
	              traffic.crashUnit.save();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.verifyVehicleTabDisabled();
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.clickPrintButton();
	              home.switchToSelectReport();
	              home.selectReport.ClickCrashReport2017InGrid();
	             traffic.switchToCrashReport();
	             
	        }

	        @Test(groups={"2020DefectTestCases"})
	        public void PoliceDefect2020PolicyNoVerify_250445(ITestContext testContext) throws IOException
	        {
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	                 testContext.setAttribute("testID", "250445");
	              Browser.NavigateToLoginScreen();
	              login.loginScreen.logonUsingTestContext();
	              
	             
	             //scenario2
	              loader.navigateToModule("Warrant");
	             loader.navigateToModule("Traffic");
	              loader.navigateToScreen("Crash Search");
	              traffic.switchToCrashSearch();
	              traffic.crashSearch.enterAtCaseNo();
	              traffic.crashSearch.clickSearch();
	              traffic.crashSearch.clickRowAtCaseNo();
	              traffic.switchToCrashEntry(); 
	              traffic.crashEntry.switchToMotoristNonMotoristTab();
	              traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToVehicleTab();
	              traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
	              vehicle.switchToVehicleBoatEntry();
	              vehicle.vehicleBoatEntry.saveAndCloseScreen();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToVehicleTab();
	              traffic.crashUnit.crashUnitVehicleTab.enterAtPolicyNumber();
	              traffic.crashUnit.crashUnitVehicleTab.selectAtInsuranceCompany();
	              traffic.crashUnit.saveAndClose();
	              
	              traffic.switchToCrashEntry(); 
	              traffic.crashEntry.switchToMotoristNonMotoristTab();
	              traffic.crashEntry.motoristNonMotoristTab.verifyAtPlateNoInGrid(0);
	              traffic.switchToCrashEntry(); 
	              traffic.crashEntry.clickPrintButton();
	              home.switchToSelectReport();
	              home.selectReport.ClickCrashReport2017InGrid();
	             traffic.switchToCrashReport();      
	              
	        }

	        @Test(groups={"2020DefectTestCases"}) // Vijay
	    	public void verifyTheOfficerPFColumnIsAddedToTheCitationParkingSearchScreen_256103(ITestContext testcontext) {
	        	
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testcontext.setAttribute("testID", "256103");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.Logon();
	    		loader.navigateToModule("Warrant");
	    		loader.navigateToModule("Traffic");
	    		loader.navigateToScreen("Citation Search");
	    		traffic.switchToCitationSearch();
	    		traffic.citationSearch.enterAtOfficer();
	    		traffic.citationSearch.clickSearchButton();
	    		traffic.citationSearch.verifyOfficerPF();
	    		traffic.citationSearch.verifyOfficerName();
	    		traffic.citationSearch.verifyOfficerColumnAfterNamesColumnAndBeforeCEColumn();
	    		objectIdentification.windowHandle.switchToMainWindow();
	    		loader.navigateToScreen("Parking Search");
	    		traffic.switchToParkingSearch();
	    		traffic.parkingSearch.enterAtOfficer();
	    		traffic.parkingSearch.clickSearchButton();
	    		traffic.parkingSearch.verifyOfficerName();
	    		traffic.parkingSearch.verifyOfficerColumnAfterChargeColumnAndBeforeTicketBalanceColumn();
	    	}

	         
	        @Test(groups={"2020DefectTestCases"}) //Q4 Sprint 3 Automated by Mahesha
	        public void ToVerifyCrashRecordForInvalidCaseIdinCrashEntryScreen_258300(ITestContext testContext)
	        {
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	              testContext.setAttribute("testID", "258300");
	              Browser.NavigateToLoginScreen();
	              login.loginScreen.logonUsingTestContext();
	              loader.navigateToModule("Warrant");
              loader.navigateToModule("Traffic");
	              loader.navigateToScreen("Crash Search");
	              traffic.switchToCrashSearch();
	              traffic.crashSearch.clickAddNew();
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.enterAtCaseNo();
	              traffic.crashEntry.cancleVerifyReportReviseConfirmMessage();
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.verifyCaseNotValidated();
	              traffic.crashEntry.enterAtCaseNo();
	              traffic.crashEntry.verifyReportReviseConfirmMessage();
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.verifyAtCaseNo();
	              traffic.crashEntry.verifyCaseValidated();
	              traffic.crashEntry.saveScreen();
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.save();
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.verify1003UpdateSuccessfulFooterMessage();
	        }


	    	//Nov sprint 3 Automated by Mahesha(PoliceNJ)
	        @Test(groups={"2020DefectTestCases"})
	        public void ToVerifyEyeColorMappingInCrashReport_258301(ITestContext testContext)
	        {
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	        	  testContext.setAttribute("testID", "258301");
	              Browser.NavigateToLoginScreen();
	              login.loginScreen.logonUsingTestContext();
	              loader.navigateToModule("Traffic");
	              loader.navigateToScreen("Crash Search");
	              traffic.switchToCrashSearch();
	              traffic.crashSearch.enterAtCaseNo();
	              traffic.crashSearch.clickSearch();
	              traffic.crashSearch.clickRowAtCaseNo();
	              traffic.switchToCrashEntry();
	              traffic.crashEntry.switchToMotoristNonMotoristTab();
	              traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToPersonTab();
	              traffic.crashUnit.personTab.enterAtNameID();
	              traffic.crashUnit.personTab.clickNameInfoBubbleIcon();
	              names.switchToNameEntry();
	              names.nameEntry.switchToPhysicalTab();
	              names.nameEntry.physicalTab.selectAtEyeColor();
	              names.nameEntry.Save();
	              names.switchToNameEntry();
	             names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
	             names.nameEntry.closeTheScreen();
	             traffic.switchToCrashUnit();
	             traffic.crashUnit.save();
	             traffic.switchToCrashUnit();
	             traffic.crashUnit.personTab.verifyAtEyeColour();
	             traffic.crashUnit.verifyUpdateSuccessfulStatusMessage();
	             traffic.crashUnit.saveAndClose();
	             traffic.switchToCrashEntry();
	             traffic.crashEntry.clickResetButton();
	             traffic.crashEntry.clickPrintButton();
	             home.switchToSelectReport();
	             home.selectReport.ClickCrashReport2017InGrid();
	             home.switchToKPITempPDFScreen();
	             
	        }
	        
	        @Test (groups={"2020DefectTestCases"})//Q4 Sprint 4 Automated by Mahesha 
	  	  public void VerifyToEnterMoreThanOneParkingPermitEntryForAVehicle_260156(ITestContext testContext)
	  	  {
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	  		  testContext.setAttribute("testID", "260156");
	  	      Browser.NavigateToLoginScreen();
	  	      login.loginScreen.Logon();
	  	    loader.navigateToModule("Warrant");
	  	      loader.navigateToModule("Traffic");
	  	      loader.navigateToScreen("Parking Permits");
	  	      
	  	      //create
	  	      traffic.switchToParkingPermit();
	  	      traffic.parkingPermits.enterAtPlateNo();
	  	      
	  	      vehicle.switchToVehicleBoatEntry();
	  	      vehicle.vehicleBoatEntry.clickSelectButton();
	  	      
	  	      traffic.switchToParkingPermit();
	  	      traffic.parkingPermits.enterAtLastName();
	  	      traffic.parkingPermits.enterAtFirstName();
	  	      traffic.parkingPermits.selectNameFromHelpWindow();
	  	      
	  	      traffic.switchToParkingPermit();
	  	      traffic.parkingPermits.verifyAtAddress();
	  	      traffic.parkingPermits.verifyActionDateIsNotMandatory();
	  	      traffic.parkingPermits.selectActionAsPermit();
	  	      traffic.parkingPermits.selectAtPermitType();
	  	      traffic.parkingPermits.verifyActionDateIsMandatory();
	  	      traffic.parkingPermits.tabOutActionDate();
	  	      traffic.parkingPermits.enterAtPermitLocation();
	  	      traffic.parkingPermits.selectReason();
	  	      traffic.parkingPermits.tabOutValidExtendDate();
	  	      traffic.parkingPermits.tabOutActionDate();
	  	      traffic.parkingPermits.enterToDateAsNextDayFromcurrentDate();
	  	      traffic.parkingPermits.clickAddButton();
	  	      
	  	      traffic.parkingPermits.save();
	  	      
	  	    
	  	      //Extend
	  	      traffic.switchToParkingPermit();
	  	      traffic.parkingPermits.verify1003UpdateSuccessfulStatusBarMsg();
	  	      String PermitNo=   traffic.parkingPermits.readPermitNoFromGrid(0);
	  	      traffic.parkingPermits.closeParkingPermitScreen();
	  	      
	  	      loader.navigateToScreen("Parking Permits Search");
	  	      traffic.switchToParkingPermitsSearch();
	  	      traffic.parkingPermitsSearch.clickSearchButton();
	  	      traffic.parkingPermitsSearch.clickRowByAtPlate();
	  	      
	  	      traffic.switchToParkingPermit();
	  	      traffic.parkingPermits.clickAtGridRowByPermitNo(PermitNo);
	  	      traffic.parkingPermits.verifyNoOfDaysRequestedDisabled();
	  	      traffic.parkingPermits.selectActionAsExtension();
	  	      traffic.parkingPermits.verifyNoOfDaysRequestedEnabled();
	  	      traffic.parkingPermits.enterAtNoOfDaysRequested();
	  	      traffic.parkingPermits.clickAddButton();
	  	      traffic.parkingPermits.save();
	  	      
	  	      //detete
	  	      traffic.switchToParkingPermit();
	  	      traffic.parkingPermits.verifyAtExtendedDaysInGrid(0);
	  	      traffic.parkingPermits.clickDeleteIconInGridByPermitNo();
	  	      traffic.parkingPermits.clickOkWithUpdateSuccessfulMessage();
	  	      traffic.switchToParkingPermit();
	  	      traffic.parkingPermits.verify1003UpdateSuccessfulStatusBarMsg();
	  	  }

	        @Test(groups={"2020DefectTestCases"}) //Q4 Sprint 5 Automated by Mahesha 
		  	  public void VerifyNIBRSValueBindAttheFirstTimeForTheChargeAdded_261088(ITestContext testContext)
		  	  {
	        	
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		  		  testContext.setAttribute("testID", "261088");
		  	      Browser.NavigateToLoginScreen();
		  	      login.loginScreen.logonUsingTestContext();
		  	    loader.navigateToModule("Warrant");
		  	      loader.navigateToModule("Traffic");
		  	      loader.navigateToScreen("Citation Entry");
			      traffic.switchToCitationEntry();
			      traffic.citationEntry.selectAtCEType();
			      traffic.citationEntry.tabAtDateAndTime();
			      traffic.citationEntry.verifyNameFieldMandatory();
			      traffic.citationEntry.enterAtNameID();
			      traffic.citationEntry.switchToViolationsTab();
			      traffic.citationEntry.violationsTab.enterAtLocation();
			      traffic.citationEntry.violationsTab.verifyLocationInfoIconDisplayed();
			      traffic.citationEntry.violationsTab.tabOfficer();
			      traffic.citationEntry.violationsTab.verifyAtPFInOfficeField();
			      traffic.citationEntry.violationsTab.enterAtCharge();
			      traffic.citationEntry.violationsTab.verifyAtChargeDescription();
			      traffic.citationEntry.violationsTab.verifyAtNIBRS();
		           traffic.citationEntry.violationsTab.clickAddButton();
		           traffic.citationEntry.violationsTab.verifyViolationAddedGrid();
		           traffic.citationEntry.violationsTab.verifyAtChargeInTheGrid(0);
		           traffic.citationEntry.violationsTab.clickRowInGrid(0);
		           traffic.citationEntry.violationsTab.verifyAtNIBRS();
		           traffic.citationEntry.violationsTab.verifyAtChargeDescription();
		           traffic.citationEntry.violationsTab.clickAddButton();
		           traffic.citationEntry.save();
		           traffic.switchToCitationEntry();
		           traffic.citationEntry.verifyAdditionSuccessfulMessage();

		  	  }
	        @Test(groups={"2020DefectTestCases"}) // Vijay
	    	public void VerifyThePlateFieldFromTheSearchWindow_250118(ITestContext testContext) {
	        	
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "250118");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.Logon();
	    		loader.navigateToModule("Traffic");
	    		loader.navigateToScreen("Parking Entry");
	    		traffic.switchToParkingEntry();
	    		traffic.parkingEntry.entercurrentValidationDate();
	    		traffic.parkingEntry.enterCurrentValidationTime();
	    		traffic.parkingEntry.enterAtTicketNo();
	    		traffic.parkingEntry.parkingEntryMainTab.enterAtOfficer();
	    		traffic.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
	    		traffic.parkingEntry.parkingEntryMainTab.TabOutStateEdit();
	    		vehicle.switchToVehicleBoatEntry();
	    		vehicle.vehicleBoatEntry.clickSelectButton();
	    		traffic.switchToParkingEntry();
	    		traffic.parkingEntry.parkingEntryMainTab.enterAtViolation();
	    		popup.acknowledge.ok();
	    		traffic.switchToParkingEntry();
	    		traffic.parkingEntry.parkingEntryMainTab.enterAtLocation();
	    		traffic.parkingEntry.switchToFineNoticesTab();
	    		traffic.parkingEntry.fineNoticesTab.enterInitialAmount();
	    		traffic.parkingEntry.savetheScreen();
	    		traffic.switchToParkingEntry();
	    		traffic.parkingEntry.closeParkingEntryScreen();
	    		objectIdentification.windowHandle.switchToMainWindow();
	    		loader.navigateToScreen("Parking Search");
	    		traffic.switchToParkingSearch();
	    		traffic.parkingSearch.enterAtOfficer();
	    		traffic.parkingSearch.enterAtTicketNo();
	    		traffic.parkingSearch.clickSearchButton();
	    		traffic.parkingSearch.selectRowByAtTicketNo();
	    		traffic.switchToParkingEntry();
	    		traffic.parkingEntry.parkingEntryMainTab.EnterAtPlate1();
	    		traffic.parkingEntry.parkingEntryMainTab.TabOutStateEdit();
	    		vehicle.switchToVehicleBoatSearchHelpWindow();
	    		vehicle.vehicleBoatSearchHelpWindow.selectCheckBoxByPlate();
	    		vehicle.vehicleBoatSearchHelpWindow.ClickRefreshButton();
	    		vehicle.vehicleBoatSearchHelpWindow.ClickBackButton();
	    		vehicle.vehicleBoatSearchHelpWindow.ClickResetButton();
	    	}
	        
	        
	        @Test(groups={"2021DefectTestCases"}) //2021 defect Automated by Mahesha
	        public void NJCrashDLClasscodevalue2129_272375(ITestContext testContext)
	        {
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	              testContext.setAttribute("testID", "272375");
	              Browser.NavigateToLoginScreen();
	              login.loginScreen.logonUsingTestContextOtherDB();
	              
	              loader.navigateToModule("Settings");
	              loader.navigateToScreen("Coded");
	              settings.switchToCodedScreen();
	              settings.coded.enterAtCodeID();
	              settings.coded.clickSearchButton();
	              settings.coded.verifyAtCodeIDInGrid(0);
	              settings.coded.clickRowByAtCodeID();
	              settings.switchToSharedCodes();
	              settings.maintainCodeValue.enterAtDescription();
	              settings.maintainCodeValue.clickSearchButton();
	              settings.maintainCodeValue.verifyAtCodeValueDescription(0);
	              settings.maintainCodeValue.closeTheScreen();
	                           
	              loader.navigateToModule("Traffic");
	              loader.navigateToScreen("Crash Entry");
	    	      traffic.switchToCrashEntryScreen();
	    	      traffic.crashEntry.enterAtCaseNo();
	    	      traffic.crashEntry.enterAtOfficer();
	    	      traffic.crashEntry.enterAtUnit();
	    	      traffic.crashEntry.save();
	    	      traffic.switchToCrashEntry();
	    	      traffic.crashEntry.switchToMotoristNonMotoristTab();
	              traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
	              traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.enterAtNoOfOccupants();
	              traffic.crashUnit.switchToPersonTab();
	              traffic.crashUnit.personTab.selectAtTypeOfPerson();
	              traffic.crashUnit.personTab.enterAtNameID();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToVehicleTab();
	              traffic.crashUnit.crashUnitVehicleTab.clickVehicleOwnerSameAsDriver();
	              traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
	              traffic.crashUnit.crashUnitVehicleTab.selectAtState();
	              vehicle.switchToVehicleBoatEntry();
	              vehicle.vehicleBoatEntry.clickSelectButton();
	              
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToVehicleTab();
	              
	              traffic.crashUnit.crashUnitVehicleTab.selectAtType();
	              traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToDamageConditionsTab();
	              traffic.crashUnit.damageConditionsTab.selectInitialImpact();
	              traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
	              traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
	              traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
	              traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
	              traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
	              traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
	              traffic.crashUnit.damageConditionsTab.selectTrafficControls();
	              traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
	              traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
	              traffic.crashUnit.damageConditionsTab.selectAlcoholType();
	              traffic.crashUnit.save();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.switchToPersonTab();
	              traffic.crashUnit.personTab.selectAtDLClass();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.save();
	              traffic.switchToCrashUnit();
	              traffic.crashUnit.verifyUpdateSuccessfulStatusMessage();
	            
	        }
	        @Test(groups={"2021DefectTestCases"}) // Vijay //Police NJ
	    	public void verifyVINNoPrintingInCrashReportsInNJ_263014(ITestContext testcontext) {
	        	
	        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testcontext.setAttribute("testID", "263014");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.logonUsingTestContextOtherDB();
	    		loader.navigateToModule("Vehicle");
	    		loader.navigateToScreen("Vehicle/Boat Entry");
	    		vehicle.switchToVehicleBoatEntry();
	    		vehicle.vehicleBoatEntry.enterVINNoAsMoreThan17Characters();
	    		vehicle.vehicleBoatEntry.verifyVinNoExceedingLimitOf17Characters();
	    		vehicle.switchToVehicleBoatEntry();
	    		vehicle.vehicleBoatEntry.enterAtVinNo();
	    		vehicle.vehicleBoatEntry.clickMainTab();
	    		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.enterAtPlateNumber();
	    		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtState();
	    		vehicle.switchToVehicleBoatEntry();
	    		vehicle.vehicleBoatEntry.saveAndCloseScreen();
	    		loader.navigateToModule("Traffic");
	    		loader.navigateToScreen("Crash Search");
	    		traffic.switchToCrashSearch();
	    		traffic.crashSearch.clickSearch();
	    		traffic.crashSearch.selectRowByAtCrash();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.switchToMotoristNonMotoristTab();
	    		traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToVehicleTab();
	    		traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();// Changed
	    		traffic.crashUnit.crashUnitVehicleTab.selectAtState();
	    		vehicle.switchToVehicleBoatEntry();
	    		vehicle.vehicleBoatEntry.clickSelectButton();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToVehicleTab();
	    		traffic.crashUnit.crashUnitVehicleTab.verifyAtVinNo();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.saveAndClose();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.saveScreen();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.clickPrintButton();
	    		home.switchToSelectReport();
	    		home.selectReport.ClickCrashReport2017InGrid();
	    		home.switchToKPITempPDFScreen();
	    		/*
	    		 * home.selectReport.downloadReport();
	    		 * home.selectReport.SaveReportToLocation("263014"); String content =
	    		 * home.selectReport.readPDFContent("263014");
	    		 * home.selectReport.verifyPDFContent(content);
	    		 */

	    	}

	    	@Test(groups={"2021DefectTestCases"}) // Vijay // Police NJ
	    	public void ToVerifyDetailsOfVehicleShownInCrashUnitScreen_263015(ITestContext testcontext) {

	    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testcontext.setAttribute("testID", "263015");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.logonUsingTestContextOtherDB();
	    		loader.navigateToModule("Traffic");
	    		loader.navigateToScreen("Crash Search");
	    		traffic.switchToCrashSearch();
	    		traffic.crashSearch.clickSearch();
	    		traffic.crashSearch.clickRowByAtCrash();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.switchToMotoristNonMotoristTab();
	    		traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
	    		traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.enterAtNoOfOccupants();
	    		traffic.crashUnit.switchToPersonTab();
	    		traffic.crashUnit.personTab.selecttypeOfPersonAsDriver();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToVehicleTab();// Changed
	    		traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
	    		traffic.crashUnit.crashUnitVehicleTab.selectAtState();
	    		vehicle.switchToVehicleBoatEntry();
	    		String vehicleNo = vehicle.vehicleBoatEntry.readVehicleNo();
	    		vehicle.vehicleBoatEntry.enterAtYear();
	    		vehicle.vehicleBoatEntry.enterAtMake();
	    		vehicle.vehicleBoatEntry.enterAtModel();
	    		String vinNo = vehicle.vehicleBoatEntry.readVINNo();
	    		vehicle.vehicleBoatEntry.clickMainTab();
	    		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtColor1();
	    		vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.selectAtColor2();
	    		vehicle.switchToVehicleBoatEntry();
	    		vehicle.vehicleBoatEntry.clickSelectButton();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToVehicleTab();
	    		traffic.crashUnit.crashUnitVehicleTab.verifyAllPlateRelatedFieldsAutoPopulated(vinNo, vehicleNo);
	    		traffic.crashUnit.crashUnitVehicleTab.selectVehicleBodyTypeAs30BusLargeVanLimo();
	    		traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToDamageConditionsTab();
	    		traffic.crashUnit.damageConditionsTab.selectInitialImpact();
	    		traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
	    		traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
	    		traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
	    		traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
	    		traffic.crashUnit.damageConditionsTab.selectTrafficControls();
	    		traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
	    		traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
	    		traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
	    		traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
	    		traffic.crashUnit.damageConditionsTab.selectAlcoholType();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.save();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.verifyAdditionSuccessfulStatusMessage();
	    	}

	    	@Test(groups={"2021DefectTestCases"}) // Vijay //Police NJ
	    	public void ToVerifyEyeColorMappingInCrashReport_263016(ITestContext testContext) {

	    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "263016");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.logonUsingTestContextOtherDB();
	    		loader.navigateToModule("Traffic");
	    		loader.navigateToScreen("Crash Search");
	    		traffic.switchToCrashSearch();
	    		traffic.crashSearch.clickSearch();
	    		traffic.crashSearch.clickRowByAtCrash();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.switchToMotoristNonMotoristTab();
	    		traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToPersonTab();
	    		traffic.crashUnit.personTab.enterAtNameID();
	    		traffic.crashUnit.personTab.clickNJNameInfoIcon();
	    		names.switchToNameEntry();
	    		names.nameEntry.switchToPhysicalTab();
	    		names.nameEntry.physicalTab.selectAtEyeColor();
	    		names.nameEntry.Save();
	    		names.switchToNameEntry();
	    		names.nameEntry.VerifyUpdateSuccessfulStatusMessage();
	    		names.nameEntry.closeTheScreen();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.save();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.personTab.verifyAtEyeColour();
	    		traffic.crashUnit.verifyUpdateSuccessfulStatusMessage();
	    		traffic.crashUnit.saveAndClose();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.clickResetButton();
	    		traffic.crashEntry.clickPrintButton();
	    		home.switchToSelectReport();
	    		home.selectReport.ClickCrashReport2017InGrid();
	    		home.switchToKPITempPDFScreen();

	    	}
	    	@Test(groups={"2021DefectTestCases"})
	    	public void ToVerifySystemParameter1776functionalityforVehicleFieldinCrashUnitScreenfromCrashEntry_272365(ITestContext testContext)
	    	{
	    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    	testContext.setAttribute("testID", "272365");
	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();

	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1776AsTrue();
	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.enterAtCrashNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowByAtCrash();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
	    	traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.enterNoOfOccupants();
	    	traffic.crashUnit.switchToPersonTab();
	    	traffic.crashUnit.personTab.selecttypeOfPersonAsDriver();
	    	traffic.crashUnit.switchToVehicleTab();
	    	traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
	    	traffic.crashUnit.crashUnitVehicleTab.selectAtState();
	    	vehicle.switchToVehicleBoatEntry();
	    	vehicle.vehicleBoatEntry.clickSelectButton();
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.switchToVehicleTab();
	    	traffic.crashUnit.crashUnitVehicleTab.selectVehicleBodyTypeAsUnknown();
	    	traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
	    	traffic.crashUnit.switchToDamageConditionsTab();
	    	traffic.crashUnit.damageConditionsTab.selectInitialImpact();
	    	traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
	    	traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
	    	traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
	    	traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
	    	traffic.crashUnit.damageConditionsTab.selectTrafficControls();
	    	traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
	    	traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
	    	traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
	    	traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
	    	traffic.crashUnit.damageConditionsTab.selectAlcoholType();
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.save();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	}

	    	//MITHUN
	    	@Test(groups={"2021DefectTestCases"})
	    	public void ToVerifySystemParameter1776functionalityforVehicleFieldinCrashUnitScreenfromCrashEntry_272366(ITestContext testContext)
	    	{
	    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    	testContext.setAttribute("testID", "272366");
	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();
	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1776AsFalse();
	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCaseNo();
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowAtCaseNo();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldDisabled();
	    	
	    	}

	    	//MITHUN
	    	@Test(groups={"2021DefectTestCases"})
	    	public void toVerifyVehiclefieldconfigurationbyusingsystemparameter1776And759fromcrashunitentry_272367(ITestContext testContext)
	    	{
	    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    	testContext.setAttribute("testID", "272367");
	    	//Scenario 1
	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();
	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1776AsTrue();
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsTrue();

	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCaseNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowAtCaseNo();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldEnabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	//Scenario 2

	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();
	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1771AsFalse();
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsFalse();
	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCaseNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowAtCaseNo();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldDisabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	//Scenario 3

	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();

	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsTrue();

	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCaseNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowAtCaseNo();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldDisabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	//Scenario 4

	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();
	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1776AsTrue();
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsFalse();

	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCaseNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowAtCaseNo();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldEnabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	//Scenario 5
	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();
	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1776AsTrue();
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsTrue();

	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCrashNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowByAtCrash();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldEnabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	//Scenario 6

	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();
	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1771AsFalse();
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsFalse();
	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCrashNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowByAtCrash();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldDisabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	//Scenario 7

	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();

	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsTrue();

	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCrashNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowByAtCrash();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldDisabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	//Scenario 8

	    	Browser.NavigateToLoginScreen();
	    	login.loginScreen.logonUsingTestContextOtherDB();
	    	loader.navigateToModule("Settings");
	    	loader.navigateToScreen("System Parameter");
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter1776AsTrue();
	    	settings.switchToSystemParamter();
	    	settings.sysParameter.setSystemparameter794AsFalse();

	    	loader.navigateToModule("Traffic");
	    	loader.navigateToScreen("Crash Search");
	    	traffic.switchToCrashSearch();
	    	traffic.crashSearch.clickReset();
	    	traffic.crashSearch.enterAtCrashNo();
	    	traffic.crashSearch.clickSearch();
	    	traffic.crashSearch.clickRowByAtCrash();
	    	traffic.switchToCrashEntry();
	    	traffic.crashEntry.switchToMotoristNonMotoristTab();
	    	traffic.crashEntry.motoristNonMotoristTab.selectGridRow(0);
	    	traffic.switchToCrashUnit();
	    	traffic.crashUnit.verifyVehicleFieldEnabled();
	    	objectIdentification.windowHandle.switchToMainWindow();
	    	loader.logout();

	    	}
	    	@Test(groups={"2021DefectTestCases"}) // Vijay // Q2 Sprint 3
	        public void verifyWhetherOfficerNameIsDisplayingAsCorrectOnSubmittingAndApprovingCrashRecordWithDifferentCredential_272373(
	                ITestContext testcontext) {
	            ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	            testcontext.setAttribute("testID", "272373");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.logonUsingTestContext();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Entry");
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.enterAtCallNo();
	            traffic.crashEntry.enterAtOfficerLookUpEdit();
	            traffic.crashEntry.save();
	            traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.verifyStatusAsOnHold();
	            traffic.crashEntry.switchToApprovalTab();
	            traffic.crashEntry.crashEntryApprovalTab.selectAtNewAction();
	            traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	            traffic.crashEntry.crashEntryApprovalTab.enterAtSupervisor();
	            traffic.crashEntry.crashEntryApprovalTab.save();
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.saveScreen();
	            traffic.crashEntry.verifyUpdateSuccessfulAcknowledgeMessage();
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.verifyStatusAsSubmitted();
	        }

	        @Test(groups={"2021DefectTestCases"}) // Vijay
	        public void verifySupervisorFilterInCrashSearchScreenWorksProperly_272374(ITestContext testcontext) {
	            ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	            testcontext.setAttribute("testID", "272374");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.logonUsingTestContext();
	            loader.navigateToModule("Traffic");
	            loader.navigateToScreen("Crash Entry");
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.enterAtCallNo();
	            traffic.crashEntry.enterAtOfficerLookUpEdit();
	            traffic.crashEntry.save();
	            traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.verifyStatusAsOnHold();
	            traffic.crashEntry.switchToApprovalTab();
	            traffic.crashEntry.crashEntryApprovalTab.selectAtNewAction();
	            traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	            traffic.crashEntry.crashEntryApprovalTab.enterAtSupervisor();
	            traffic.crashEntry.crashEntryApprovalTab.save();
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.saveScreen();
	            traffic.crashEntry.verifyUpdateSuccessfulAcknowledgeMessage();
	            traffic.switchToCrashEntryScreen();
	            traffic.crashEntry.verifyStatusAsSubmitted();
	        }
	        
	        @Test(groups={"2021DefectTestCases"}) // Vijay// NJ Automation// Q2 Sprint 3
	    	public void verifyCrashRecordsShownForCaseCallInCrashSearchScreen_273000(ITestContext testcontext) {
	    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testcontext.setAttribute("testID", "273000");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.logonUsingTestContextOtherDB();
	    		loader.navigateToModule("Traffic");
	    		loader.navigateToScreen("Crash Entry");
	    		traffic.switchToCrashEntryScreen();
	    		traffic.crashEntry.enterAtCaseNo();
	    		traffic.crashEntry.enterAtOfficer();
	    		traffic.crashEntry.enterAtVehicle();
	    		traffic.crashEntry.save();
	    		traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
	    		loader.navigateToScreen("Crash Search");
	    		traffic.switchToCrashSearch();
	    		traffic.crashSearch.enterAtCaseNo();
	    		traffic.crashSearch.clickSearch();
	    		traffic.crashSearch.clickRowAtCaseNo();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.switchToMainTab();
	    		traffic.crashEntry.crashEntryMainTab.clickReportableCheckBox();
	    		traffic.crashEntry.crashEntryMainTab.selectRoadDividedBy();
	    		traffic.crashEntry.crashEntryMainTab.selectRoadSystem();
	    		traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceType();
	    		traffic.crashEntry.crashEntryMainTab.selectCrashType();
	    		traffic.crashEntry.crashEntryMainTab.selectFirstHarmfulEvent();
	    		traffic.crashEntry.crashEntryMainTab.selectTemproraryTrafficControlZone();
	    		traffic.crashEntry.crashEntryMainTab.selectRoadCharacterHorizontalAlignment();
	    		traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceConditions();
	    		traffic.crashEntry.crashEntryMainTab.selectLightCondition();
	    		traffic.crashEntry.crashEntryMainTab.selectRoadCharacterGrade();
	    		traffic.crashEntry.crashEntryMainTab.selectEnvironmentCondition();
	    		traffic.crashEntry.save();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.switchToMotoristNonMotoristTab();
	    		traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
	    		traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.enterAtNoOfOccupants();
	    		traffic.crashUnit.switchToPersonTab();
	    		traffic.crashUnit.personTab.selectAtTypeOfPerson();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToVehicleTab();
	    		traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumberAndSelectStateAsWI();
	    		vehicle.switchToVehicleBoatEntry();
	    		vehicle.vehicleBoatEntry.saveAndCloseScreen();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToVehicleTab();
	    		traffic.crashUnit.crashUnitVehicleTab.selectTypeAsUnknown();
	    		traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
	    		traffic.switchToCrashUnit();
	    		traffic.crashUnit.switchToDamageConditionsTab();
	    		traffic.crashUnit.damageConditionsTab.selectInitialImpact();
	    		traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
	    		traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
	    		traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
	    		traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
	    		traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
	    		traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
	    		traffic.crashUnit.damageConditionsTab.selectTrafficControls();
	    		traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
	    		traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
	    		traffic.crashUnit.damageConditionsTab.selectAlcoholType();
	    		traffic.crashUnit.damageConditionsTab.enterAtAlcoholResultValue();
	    		traffic.crashUnit.saveAndClose();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.switchToPoliceActionTab();
	    		traffic.crashEntry.policeActionTab.clickNJCompleteCheckBox();
	    		traffic.switchToCrashEntry();
	    		traffic.crashEntry.switchToApprovalTab();
	    		traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
	    		traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
	    		traffic.crashEntry.crashEntryApprovalTab.save();
	    		traffic.switchToCrashEntry();
	    		String crashNo = traffic.crashEntry.readCrashNo();
	    		traffic.crashEntry.clickCaseInfo();
	    		records.switchToCaseUpdate();
	    		records.caseUpdate.clickReportingTab();
	    		records.caseUpdate.reportingTab.selectRowByAtType();
	    		records.switchToReportStatus();
	    		records.reportStatus.clickCrashButton();
	    		traffic.switchToCrashSearchHelpWindow();
	    		traffic.crashSearchHelpWindow.verifyCrashNoInGrid(crashNo);
	    	}
	        @Test(groups={"2021DefectTestCases"}) //Automated by Stalin Q2 S6 Ran in 45 
	    	public void ToverifyArmedFieldfromCitationArrestEntryscreen_275253(ITestContext testContext)
	    	{
	    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "275253");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.logonUsingTestContextOtherDB();
	    		loader.navigateToModule("Traffic");
	    		loader.navigateToScreen("Citation Search");
	    		traffic.switchToCitationSearch();
	    		traffic.citationSearch.clickAddNewButton();
	    		traffic.switchToCitationEntry();
	    		traffic.citationEntry.enterAtCallNo();
	    		traffic.citationEntry.selectAtCEType();
	    		traffic.citationEntry.tabAtDateAndTime();
	    		traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
	    		traffic.citationEntry.enterAtNameID();
	    		traffic.citationEntry.switchToOffenseTab();
	    		traffic.citationEntry.offenseTab.enterAtDescribeLocation();
	    		traffic.citationEntry.offenseTab.clickCodeValueSearchIcon();
	    		popup.switchToCodedSearch();
	    		popup.kPICodedLookup.enterAtCharge();
	    		popup.kPICodedLookup.clickSearchIcon();
	    		popup.kPICodedLookup.clickAtChargeInGrid();
	    		traffic.switchToCitationArrest();
	    		//traffic.citationArrest.selectTypeOfArrestAsOnViewArrest();
	    		traffic.citationArrest.selectArmedAsUnarmed();
	    		traffic.citationArrest.saveCloseScren();
	    		traffic.switchToCitationEntry();
	    		traffic.citationEntry.switchToOffenseTab();
	    		traffic.citationEntry.offenseTab.tabOutOffenseDateTime();
	    		traffic.citationEntry.offenseTab.verifyNIBRSFieldAsDisabled();
	    		traffic.switchToCitationEntry();
	    		traffic.switchToCitationEntry();
	    		traffic.citationEntry.savePrintButton();
	    		home.switchToKPITempPDFScreen();
	    		traffic.switchToCitationEntry();
	    		traffic.citationEntry.switchToOffenseTab();
	    		traffic.citationEntry.offenseTab.clickNIBRSButton();
	    		traffic.switchToCitationArrest();
	    		//traffic.citationArrest.selectTypeOfArrestAsOnViewArrest();
	    		traffic.citationArrest.selectArmedAsUnarmed();
	    		traffic.citationArrest.saveCloseScren();
	    		traffic.switchToCitationEntry();
	    		traffic.citationEntry.switchToOffenseTab();
	    		traffic.citationEntry.offenseTab.clickNIBRSButton();
	    		traffic.switchToCitationArrest();
	    		traffic.citationArrest.verifyArmedAsUnarmed();
	    		traffic.switchToCitationArrest();
	    		
	    	}
	        
	      //Oct Sprint 1 Automated By Mahesha
	    	@Test(groups={"2021DefectTestCases"})
	    	public void AbleToViewCitationActivitiesThroughExpungementScreen_256414(ITestContext testContext) {

	    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "256414");
	    		Browser.NavigateToLoginScreen();
	    		login.loginScreen.Logon();
	    		loader.navigateToModule("Names");
	    		loader.navigateToScreen("Expungement");
	    		names.switchToExpungement();
	    		names.expungement.EnterAtNameID();
	    		names.expungement.VerifyAtAddress();
	    		names.expungement.VerifyAtName();
	    		names.expungement.SelectTypeAsDeletion();
	    		names.expungement.EnterReason();
	    		names.expungement.VerifyAtCallActivityNumber(1);
	    		names.expungement.verifyAtCitationActivityNumber(0);
	    		// names.expungement.deleteAtSelectedCallActivity();
	    		names.expungement.deleteAtActivityRow1InGrid();
	    		names.expungement.VerifyDeletedBookingConfirmeMessage();
	    		names.BackToExpungement();
	    		names.expungement.doubleClickAtCitationActivity();
	    		traffic.switchToCitationEntry();
	    		traffic.citationEntry.verifyAtCENo();
	    	}

	    	
	    	 @Test(groups={"2021DefectTestCases"}) // Vijay// NJ Automation// Q3 Sprint 2
		    	public void verifyNotificationScreenFromCrashEntry_278632(ITestContext testcontext) {
		    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		    		testcontext.setAttribute("testID", "278632");
		    		Browser.NavigateToLoginScreen();
		    		login.loginScreen.logonUsingTestContextOtherDB();
		    		loader.navigateToModule("Traffic");
		    		loader.navigateToScreen("Crash Search");
		    		traffic.switchToCrashSearch();
		    		traffic.crashSearch.clickSearch();
		    		traffic.crashSearch.selectRowByAtCrash();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.clickNotificationIcon();
		    		home.switchToNotificationScreen();
		    		home.notification.SaveScreen();
		    		home.switchToNotificationScreen();
		    		home.notification.CloseScreen();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.close();
		    		traffic.switchToCrashSearch();
		    		traffic.crashSearch.clickAddNew();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.enterAtCaseNo();
		    		traffic.crashEntry.tabReportedDateTime();
		    		traffic.crashEntry.enterAtOfficer();
		    		traffic.crashEntry.enterAtVehicle();
		    		traffic.crashEntry.save();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.clickNotificationIcon();
		    		home.switchToNotificationScreen();
		    		home.notification.EnterStartDateAsCurrentDate();
		    		home.notification.selectAtDistributionList();
		    		home.notification.selectAtNotifyEvent();
		    		home.notification.clickAddButton();
		    		home.notification.SaveScreen();
		    		home.switchToNotificationScreen();
		    	}

		    	@Test(groups={"2021DefectTestCases"}) // Vijay // Q3 Sprint 2
		    	public void ToCheckWhetherUserIsAbleToResetTheScreenWithoutAnyErrorAfterAddingDataOnNarrativeTabCitationEntryScreen_278634(
		    			ITestContext testcontext) {
		    		testcontext.setAttribute("testID", "278634");
		    		Browser.NavigateToLoginScreen();
		    		login.loginScreen.logonUsingTestContextOtherDB();
		    		loader.navigateToModule("Traffic");
		    		loader.navigateToScreen("Citation Entry");
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.enterAtCaseNo();
		    		traffic.citationEntry.selectCETypeAsTrafficViolation();
		    		traffic.citationEntry.selectAtDefendantType();
		    		traffic.citationEntry.enterAtNameID();
		    		traffic.citationEntry.switchToOffenseTab();
		    		traffic.citationEntry.offenseTab.clickCodeValueNJLookUpIcon();
		    		popup.switchToCodedSearch();
		    		popup.kPICodedLookup.enterAtCharge();
		    		popup.kPICodedLookup.clickSearchIcon();
		    		popup.kPICodedLookup.clickAtChargeInGrid();
		    		traffic.switchToCitationArrest();
		    		traffic.citationArrest.enterArrestDateAsCurrentDate();
		    		traffic.citationArrest.selectAtTypeOfArrestComboBox();
		    		traffic.citationArrest.selectArmed();
		    		traffic.citationArrest.saveCloseScren();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToOfficerTab();
		    		traffic.citationEntry.officerTab.tabOfficerNJ();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToPlaintiffTab();
		    		traffic.citationEntry.plaintiffTab.selectCounty();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToPlaintiffTab();
		    		traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.save();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.clickAddNewButton();
		    		home.switchToTextMgmtScreen();
		    		home.textMgmt.EnterAtTextName();
		    		home.textMgmt.EnterSummaryRichTextAsTestAutomation();
		    		home.switchToTextMgmtScreen();
		    		home.textMgmt.SaveAndCloseScreen();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyAtTemplateComboBoxAsExistingValue();
		    		traffic.citationEntry.citationEntryNarrativeTab.clickLoadButton();
		    		traffic.citationEntry.citationEntryNarrativeTab.selectAtTemplate();
		    		traffic.citationEntry.citationEntryNarrativeTab.clickLoadButton();
		    		String richText = trafficWI.citationEntry.citationEntryNarrativeTab.getRichText();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.internalSave();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.clickResetButton();
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.selectAtTemplate1();
		    		traffic.citationEntry.citationEntryNarrativeTab.clickLoadButton();
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextFromTemplate1();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.internalSave();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextFromTemplate1();
		    		traffic.switchToCitationEntry();
		    		traffic.citationEntry.switchToNarrativeTab();
		    		traffic.citationEntry.citationEntryNarrativeTab.clickResetButton();
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
		    		traffic.citationEntry.citationEntryNarrativeTab.verifyRichTextFromTemplate1();
		    	}

		    	@Test(groups={"2021DefectTestCases"}) // Vijay // Q3 Sprint 3
		    	public void verifyAbleToPrintCrashReport_278765(ITestContext testcontext) {
		    		testcontext.setAttribute("testID", "278765");
		    		Browser.NavigateToLoginScreen();
		    		login.loginScreen.logonUsingTestContextOtherDB();
		    		loader.navigateToModule("Traffic");
		    		loader.navigateToScreen("Crash Search");
		    		traffic.switchToCrashSearch();
		    		traffic.crashSearch.selectAtApprovalStatusForNJ();
		    		traffic.crashSearch.clickSearch();
		    		traffic.crashSearch.clickRowAtCaseNo();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.clickPrintButton();
		    		home.switchToSelectReport();
		    		home.selectReport.ClickCrashReportInGrid();
		    		home.switchToKPITempPDFScreen();
		    		Playback.driver.close();
		    		home.switchToSelectReport();
		    		home.selectReport.CloseTheScreen();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.close();
		    		traffic.switchToCrashSearch();
		    		traffic.crashSearch.clickBackButton();
		    		traffic.crashSearch.selectAtApprovalStatus1ForNJ();
		    		traffic.crashSearch.clickSearch();
		    		traffic.crashSearch.clickRowByAtCrash();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.clickPrintButton();
		    		home.switchToSelectReport();
		    		home.selectReport.ClickCrashReportInGrid();
		    		home.switchToKPITempPDFScreen();
		    		Playback.driver.close();
		    		home.switchToSelectReport();
		    	}
		    	
		    	 @Test (groups={"2020DefectTestCases"})//Q4 Sprint 4 Automated by Mithun
			  	  public void ParkingPermitsSearch_276780(ITestContext testContext)
			  	  {
			        	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			  		  testContext.setAttribute("testID", "276780");
			  	      Browser.NavigateToLoginScreen();
			  	      login.loginScreen.Logon();
			  	    loader.navigateToModule("Warrant");
			  	      loader.navigateToModule("Traffic");
			  	    loader.navigateToScreen("Parking Permits Search");
			  	      traffic.switchToParkingPermitsSearch();
			  	      traffic.parkingPermitsSearch.clickSearchButton();
			  	      traffic.parkingPermitsSearch.clickRowByAtPlate();
			  	      
			  	      traffic.switchToParkingPermit();
			  	      traffic.parkingPermits.clickAtGridRowByPermitNo();
			  	      traffic.parkingPermits.verifyNoOfDaysRequestedDisabled();
			  	      traffic.parkingPermits.selectActionAsExtension();
			  	      traffic.parkingPermits.verifyNoOfDaysRequestedEnabled();
			  	      traffic.parkingPermits.enterAtNoOfDaysRequested();
			  	      traffic.parkingPermits.clickAddButton();
			  	      traffic.parkingPermits.save();
			  	  }
		    	 
			        //Automated By TesterName:-Mithun A	Date:-30-08-2021	Sprint:-4
					@Test(groups={"2021DefectTestCases"})
					public void Verifycrashsearchshouldbringstheresultwhensearchwithexistingcrash_280020(ITestContext testContext) {
						testContext.setAttribute("testID", "280020");
						ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
						Browser.NavigateToLoginScreen();
						login.loginScreen.logonUsingTestContext();
						loader.navigateToModule("Traffic");
			    		loader.navigateToScreen("Crash Search");
			    		traffic.switchToCrashSearch();
			    		traffic.crashSearch.clickSearch();
			    		traffic.crashSearch.selectRowByAtCrash();
			    		traffic.switchToCrashEntry();
			    		traffic.crashEntry.verifyAtCrashNo();
			    		traffic.switchToCrashSearch();
			    		traffic.crashSearch.clickBackButton();
			    		traffic.crashSearch.enterAtTracsRefNo();
			    		traffic.crashSearch.clickSearch();
			    		traffic.crashSearch.selectRowByAtCrash();
			    		traffic.switchToCrashEntry();
			    		traffic.crashEntry.verifyAtCrashNo();

					}
					
					

					
					@Test //Automated by Stalin Q3 S1  
					public void ToVerifywhethertheDocketfieldfunctionalityisworking_275950(ITestContext testContext)
					{
						ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
						testContext.setAttribute("testID", "275950");
						Browser.NavigateToLoginScreen();
						login.loginScreen.logonUsingTestContextOtherDB();
						loader.navigateToModule("Traffic");
						loader.navigateToScreen("Citation Search");
						traffic.switchToCitationSearch();
						traffic.citationSearch.verifyDocketNoAsCustomField();
						traffic.citationSearch.enterAtDocketNo();
						traffic.citationSearch.clickSearchButton();
						traffic.citationSearch.selectAtCETypeInGrid(); 
						traffic.switchToCitationEntry();
						traffic.citationEntry.switchToCourtTab();
						traffic.citationEntry.courtTab.verifyDocketLabelAsCustomField();
						traffic.citationEntry.courtTab.clickDocketNoLabel();
						settings.switchToRepositoryEntry();
						settings.repositoryEntry.selectFieldUsageAsShow();
						settings.repositoryEntry.saveNClose();
						traffic.switchToCitationEntry();
						traffic.citationEntry.switchToCourtTab();
						traffic.citationEntry.courtTab.verifyDocketLabelAsCustomField();
						traffic.citationEntry.courtTab.clickDocketNoLabel();
						settings.switchToRepositoryEntry();
						settings.repositoryEntry.selectFieldUsageAsHide();
						settings.repositoryEntry.saveNClose();
						traffic.switchToCitationEntry();
						traffic.citationEntry.switchToCourtTab();
						traffic.citationEntry.courtTab.verifyDocketNoLabelInDisabledMode();
						traffic.citationEntry.courtTab.clickDocketNoLabel();
						settings.switchToRepositoryEntry();
						settings.repositoryEntry.selectFieldUsageAsMandatory();
						settings.repositoryEntry.saveNClose();
						traffic.switchToCitationEntry();
						traffic.citationEntry.switchToCourtTab();
						traffic.citationEntry.courtTab.verifyDocketNoLabelAsMandatory();
						traffic.citationEntry.courtTab.clickRowAtCharge();
						traffic.citationEntry.courtTab.clearDocketNo();
						traffic.citationEntry.courtTab.clickUpdateButton();
						traffic.citationEntry.courtTab.verifyDocketNoAcknowledgeMessageFor45();
						traffic.switchToCitationEntry();
						traffic.citationEntry.switchToCourtTab();
						traffic.citationEntry.courtTab.enterAtDocketNo();
						traffic.citationEntry.courtTab.clickUpdateButton();
						traffic.switchToCitationEntry();
						traffic.citationEntry.savePrintButton();
						home.switchToKPITempPDFScreen();

						
					}

					
//Local run
				
					
					@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S6
					public void PoliceDefectTestCase_275935(ITestContext testContext) {
						ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
						testContext.setAttribute("testID", "275935");
						Browser.NavigateToLoginScreen();
						login.loginScreen.Logon();
						loader.navigateToModule("Settings");
						loader.navigateToScreen("System Parameter");
						settings.switchToSystemParamter();
						settings.sysParameter.setSystemparameter1704AsFalse();
						settings.switchToSystemParamter();
						settings.sysParameter.setSystemparameter1728AsTrue();
						settings.switchToSystemParamter();
						loader.navigateToModule("Names");
						loader.navigateToScreen("Arrest Search");
						names.switchToArrestSearch();
						names.arrestSearch.ClearFromDate();
						names.arrestSearch.ClickSearchButton();
						names.arrestSearch.selectRowByAtCaseNo();
						names.switchToArrestEntry();
						names.arrestEntry.switchToChargeTab();
						names.arrestEntry.chargeTab.ClickAtChargeInGrid();
						names.arrestEntry.chargeTab.verifyAtStatus();
						names.arrestEntry.chargeTab.enterAtCitationNo();
						names.arrestEntry.chargeTab.ClickCitationAddbutton();
						names.arrestEntry.chargeTab.clickTheAddButton();
						names.switchToArrestEntry();
						names.arrestEntry.SaveNCloseScreen();
						names.switchToArrestSearch();
						names.arrestSearch.ClickBackButton();
						loader.navigateToModule("Traffic");
						loader.navigateToScreen("Citation Entry");
						traffic.switchToCitationEntry();
						traffic.citationEntry.selectCETypeAsNonTrafficViolation();
						traffic.citationEntry.tabAtDateAndTime();
						traffic.citationEntry.enterAtNameID();
						traffic.citationEntry.switchToViolationsTab();
						traffic.citationEntry.violationsTab.enterAtLocation();
						traffic.citationEntry.violationsTab.tabOfficer();
						traffic.citationEntry.violationsTab.enterAtCitationNo();
						traffic.citationEntry.violationsTab.enterAtCharge1();
						traffic.switchToCitationArrest();
						// traffic.citationArrest.enterDateAsCurrentDate();
						traffic.citationArrest.selectArmed();
						traffic.citationArrest.saveCloseScren();
						traffic.switchToCitationEntry();
						traffic.citationEntry.switchToViolationsTab();
						traffic.citationEntry.violationsTab.clickAddButton();
						traffic.switchToCitationEntry();
						traffic.citationEntry.saveandCloseTheScreen();
						loader.navigateToModule("Names");
						loader.navigateToScreen("Arrest Search");
						names.switchToArrestSearch();
						names.arrestSearch.ClearFromDate();
						names.nameSearch.clickSearchButton();
						names.nameSearch.selectRowByAtCaseNo();
						names.switchToArrestEntry();
						names.arrestEntry.switchToChargeTab();
						names.arrestEntry.chargeTab.ClickAtChargeInGrid();
						names.arrestEntry.chargeTab.verifyAtChargeAreDifferentPopupMessageAndClickCancel();
						names.switchToArrestEntry();
						names.arrestEntry.switchToChargeTab();
						names.arrestEntry.chargeTab.ClickAtChargeInGrid();
						names.arrestEntry.chargeTab.verifyAtChargeAreDifferentPopupMessageAndClickOk();
						names.switchToArrestEntry();
						names.arrestEntry.switchToChargeTab();
						names.arrestEntry.chargeTab.clickTheAddButton();
						names.switchToArrestEntry();
						names.arrestEntry.saveScreen();
						names.switchToArrestEntry();
					}

					@Test //Automated by Stalin Q2 S3
					public void VerifyDateTypefiltershouldbringscorrectresult_275947(ITestContext testContext)
					{
						ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
						testContext.setAttribute("testID", "275947");
						Browser.NavigateToLoginScreen();
						login.loginScreen.Logon();
						loader.navigateToModule("Traffic");
						loader.navigateToScreen("Parking Permits");
						traffic.switchToParkingPermit();
						traffic.parkingPermits.enterAtPlateNo();
						vehicle.switchToVehicleBoatEntry();
						vehicle.vehicleBoatEntry.clickSelectButton();
						traffic.switchToParkingPermit();
						traffic.parkingPermits.enterAtLastName();
						traffic.parkingPermits.enterAtFirstName();
						names.switchToNameSearchHelpWindow();
						names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
						traffic.switchToParkingPermit();
						traffic.parkingPermits.selectAtPermitType();
						traffic.parkingPermits.selectActionAsPermit();
						traffic.parkingPermits.tabOutActionDate();
						traffic.parkingPermits.enterAtPermitLocation();
						traffic.parkingPermits.selectAtReason();
						traffic.parkingPermits.tabOutValidExtendDate();
						traffic.parkingPermits.enterToAsSecondDayFromValidExtendFrom();
						traffic.parkingPermits.clickAddButton();
						traffic.parkingPermits.save();
						traffic.switchToParkingPermit();
						traffic.parkingPermits.closeParkingPermitScreen();
						loader.navigateToScreen("Parking Permits Search");
						traffic.switchToParkingPermitsSearch();
						traffic.parkingPermitsSearch.selectAtDateType();
						traffic.parkingPermitsSearch.enterFromDateAsCurrentDate();
						traffic.parkingPermitsSearch.enterToDateAs2DaysFutureFromCurrentDate();
						traffic.parkingPermitsSearch.clickSearchButton();
						traffic.parkingPermitsSearch.verifyAtPlateInGrid();
						traffic.switchToParkingPermitsSearch(); 

					}
					
				@Test // Automated by Stalin Q3 S1
					public void VerifySafetyEquipmentApparentContributingCircumstances_275948(ITestContext testContext) {
						ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
						testContext.setAttribute("testID", "275948");
						Browser.NavigateToLoginScreen();
						login.loginScreen.logonUsingTestContextOtherDB();
						loader.navigateToModule("Traffic");
						loader.navigateToScreen("Crash Entry");
						traffic.switchToCrashEntryScreen();
						traffic.crashEntry.enterAtCaseNo();
						traffic.crashEntry.enterCurrentDate();
						traffic.crashEntry.enterCurrentTime();
						traffic.crashEntry.tabOutOfficer();
						traffic.crashEntry.enterAtNoOfUnits();
						traffic.crashEntry.saveScreen();
						traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
						traffic.switchToCrashEntry();
						traffic.crashEntry.switchToMotoristNonMotoristTab();
						traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
						traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
						traffic.switchToCrashUnit();
						traffic.crashUnit.enterAtNoOfOccupants();
						traffic.crashUnit.switchToPersonTab();
						traffic.crashUnit.personTab.selectAtTypeOfPerson();
						traffic.crashUnit.personTab.selectAtSafetyEquipmentAvailable();
						traffic.crashUnit.personTab.selectAtSafetyEquipmentUsed();
						traffic.switchToCrashUnit();
						traffic.crashUnit.switchToVehicleTab();
						traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
						traffic.crashUnit.crashUnitVehicleTab.selectAtState();
						vehicle.switchToVehicleBoatEntry();
						vehicle.vehicleBoatEntry.clickSelectButton();
						traffic.switchToCrashUnit();
						traffic.crashUnit.switchToVehicleTab();
						traffic.crashUnit.crashUnitVehicleTab.selectTypeAsUnknown();
						traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
						traffic.switchToCrashUnit();
						traffic.crashUnit.switchToDamageConditionsTab();
						traffic.crashUnit.damageConditionsTab.selectInitialImpact();
						traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
						traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
						traffic.crashUnit.damageConditionsTab.selectAtApparentContributingCircumstanceA();
						traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
						traffic.crashUnit.damageConditionsTab.selectTrafficControls();
						traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
						traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
						traffic.crashUnit.damageConditionsTab.selectAtApperantPhysicalStatusA();
						traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
						traffic.crashUnit.damageConditionsTab.selectAlcoholType();
						traffic.switchToCrashUnit();
						traffic.crashUnit.saveAndClose();
						traffic.switchToCrashEntry();
						traffic.crashEntry.switchToMainTab();
						traffic.crashEntry.crashEntryMainTab.clickReportableCheckBox();
						traffic.crashEntry.crashEntryMainTab.selectRoadDividedBy();
						traffic.crashEntry.crashEntryMainTab.selectRoadSystem();
						traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceType();
						traffic.crashEntry.crashEntryMainTab.selectCrashType();
						traffic.crashEntry.crashEntryMainTab.selectFirstHarmfulEvent();
						traffic.crashEntry.crashEntryMainTab.selectTemproraryTrafficControlZone();
						traffic.crashEntry.crashEntryMainTab.selectRoadCharacterHorizontalAlignment();
						traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceConditions();
						traffic.crashEntry.crashEntryMainTab.selectLightCondition();
						traffic.crashEntry.crashEntryMainTab.selectRoadCharacterGrade();
						traffic.crashEntry.crashEntryMainTab.selectEnvironmentCondition();
						traffic.switchToCrashEntry();
						traffic.crashEntry.saveNClose();
						loader.navigateToScreen("Crash Search");
						traffic.switchToCrashSearch();
						traffic.crashSearch.selectAtSafetyEquipmentUsed();
						traffic.crashSearch.clickSearch();
						traffic.crashSearch.verifyAtCaseNo(0);
						traffic.crashSearch.clickBackButton();
						traffic.crashSearch.selectAtApparentContributingCircumstances();
						traffic.crashSearch.clickSearch();
						traffic.crashSearch.verifyAtCaseNo(0);
						traffic.crashSearch.clickBackButton();
						traffic.crashSearch.selectAtApparentPhysicalStatus();
						traffic.crashSearch.clickSearch();
						traffic.crashSearch.verifyAtCaseNo(0);
						traffic.crashSearch.clickBackButton();
						traffic.switchToCrashSearch();

					}

				@Test //Automated by Stalin Q3 s4 
		    	public void Toverifythebackgroundcontrolnavigationwhileinserting_282069(ITestContext testContext)
		    	{
		    		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		    		testContext.setAttribute("testID", "282069");
		    		Browser.NavigateToLoginScreen();
		    		login.loginScreen.logonUsingTestContextOtherDB();
		    		loader.navigateToModule("Traffic");
		    		loader.navigateToScreen("Crash Entry");
		    		traffic.switchToCrashEntryScreen();
		    		traffic.crashEntry.enterCaseNumberDetails();
		    		traffic.crashEntry.enterAtOfficer();
		    		traffic.crashEntry.enterAtNoOfUnits();
		    		traffic.crashEntry.saveScreen();
		    		traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.switchToMotoristNonMotoristTab();
		    		traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
		    		traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
		    		traffic.switchToCrashUnit();
		    		traffic.crashUnit.enterAtNoOfOccupants();
		    		traffic.crashUnit.switchToPersonTab();
		    		traffic.crashUnit.personTab.selectAtTypeOfPerson();
		    		traffic.crashUnit.personTab.enterAtNameID();
		    		traffic.switchToCrashUnit();
		    		traffic.crashUnit.switchToVehicleTab();
		    		traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumber();
		    		traffic.crashUnit.crashUnitVehicleTab.selectAtState();
		    		vehicle.switchToVehicleBoatEntry();
		    		vehicle.vehicleBoatEntry.clickSelectButton();
		    		traffic.switchToCrashUnit();
		    		traffic.crashUnit.switchToVehicleTab();
		    		traffic.crashUnit.crashUnitVehicleTab.selectVehicleBodyTypeAs31BusMoreThan15Seats();
		    		traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
		    		traffic.switchToCrashUnit();
		    		traffic.crashUnit.switchToDamageConditionsTab();
		    		traffic.crashUnit.damageConditionsTab.selectInitialImpact();
		    		traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
		    		traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
		    		traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
		    		traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
		    		traffic.crashUnit.damageConditionsTab.selectTrafficControls();
		    		traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
		    		traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
		    		traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
		    		traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
		    		traffic.crashUnit.damageConditionsTab.selectAlcoholType();
		    		traffic.switchToCrashUnit();
		    		traffic.crashUnit.saveAndClose();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.switchToMainTab();
		    		traffic.crashEntry.crashEntryMainTab.clickReportableCheckBox();
		    		traffic.crashEntry.crashEntryMainTab.selectRoadDividedBy();
		    		traffic.crashEntry.crashEntryMainTab.selectRoadSystem();
		    		traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceType();
		    		traffic.crashEntry.crashEntryMainTab.selectCrashType();
		    		traffic.crashEntry.crashEntryMainTab.selectFirstHarmfulEvent();
		    		traffic.crashEntry.crashEntryMainTab.selectTemproraryTrafficControlZone();
		    		traffic.crashEntry.crashEntryMainTab.selectRoadCharacterHorizontalAlignment();
		    		traffic.crashEntry.crashEntryMainTab.selectRoadSurfaceConditions();
		    		traffic.crashEntry.crashEntryMainTab.selectLightCondition();
		    		traffic.crashEntry.crashEntryMainTab.selectRoadCharacterGrade();
		    		traffic.crashEntry.crashEntryMainTab.selectEnvironmentCondition();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.save();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.switchToDiagramTab();
		    		traffic.crashEntry.diagramTab.clickImportButton();
		    		home.switchToUpdateImageScreen();
		    		home.updateImageScreen.EnterDate();
		    		home.updateImageScreen.EnterTime();
		    		home.updateImageScreen.clickChooseFileButtonAndSelectJPGFile();
		    		home.switchToUpdateImageScreen();
		    		home.updateImageScreen.ClickSaveAndCloseButton();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.saveScreen();
		    		traffic.switchToCrashEntry();
		    		traffic.crashEntry.switchToDiagramTab();
		    		traffic.crashEntry.diagramTab.verifyImageIsDisplayed();
		    		traffic.switchToCrashEntry();

		    	}

				@Test //Automated by Stalin Q3 s4
				public void TocheckwhetherPDFattachmentincallcaseupdatescreen_281027(ITestContext testContext)
				{
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "281027");
					Browser.NavigateToLoginScreen();
					login.loginScreen.logonUsingTestContextOtherDB();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsFalse();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Citation Entry");
					traffic.switchToCitationEntry();
					traffic.citationEntry.enterAtCallNo();
					traffic.citationEntry.selectCETypeAsTrafficViolation();
					traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
					traffic.citationEntry.enterAtNameID();
					traffic.citationEntry.switchToOffenseTab();
					traffic.citationEntry.offenseTab.enterAtCharge();
					traffic.switchToCitationArrest();
				//	traffic.citationArrest.enterDateAsCurrentDate();
					//traffic.citationArrest.selectTypeOfArrestAsOnViewArrest();
					traffic.citationArrest.selectArmedAsUnarmed();
					traffic.citationArrest.saveCloseScren();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToPlaintiffTab();
					traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
					traffic.citationEntry.plaintiffTab.selectCounty();
					traffic.switchToCitationEntry();
					traffic.citationEntry.save();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCitationEntry();
					traffic.citationEntry.clickCaseInfoIcon();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCitationEntry();
					traffic.citationEntry.closeCitationEntryScreen();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsTrue();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Citation Entry");
					traffic.switchToCitationEntry();
					traffic.citationEntry.enterAtCallNo1();
					traffic.citationEntry.selectCETypeAsTrafficViolation();
					traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
					traffic.citationEntry.enterAtNameID();
					traffic.citationEntry.switchToOffenseTab();
					traffic.citationEntry.offenseTab.enterAtCharge();
					traffic.switchToCitationArrest();
					//traffic.citationArrest.enterDateAsCurrentDate();
					//traffic.citationArrest.selectTypeOfArrestAsOnViewArrest();
					traffic.citationArrest.selectArmedAsUnarmed();
					traffic.citationArrest.saveCloseScren();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToPlaintiffTab();
					traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
					traffic.citationEntry.plaintiffTab.selectCounty();
					traffic.switchToCitationEntry();
					traffic.citationEntry.save();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCitationEntry();
					traffic.citationEntry.clickCaseInfoIcon();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCitationEntry();
					
				}
			@Test //Automated by Stalin Q3 s4
				public void TocheckwhetherPDFattachmentincallCaseupdatescreen_281026(ITestContext testContext)
				{
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "281026");
					Browser.NavigateToLoginScreen();
					login.loginScreen.logonUsingTestContextOtherDB();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsFalse();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Crash Entry");
					traffic.switchToCrashEntryScreen();
					traffic.crashEntry.enterAtCaseNo();
					traffic.crashEntry.verifyAtLocation();
					traffic.crashEntry.verifyAtCSZ();
					traffic.crashEntry.enterAtOfficer();
					traffic.crashEntry.enterAtNoOfUnits();
					traffic.crashEntry.saveScreen();
					traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickCaseInfo();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickApprovalTab();
					traffic.crashEntry.verify10089ActionTabConfirmMessage();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsApprove();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.verifyStatusAsApprovedAndAppearAsGreenColor();
					traffic.crashEntry.close();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsTrue();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Crash Entry");
					traffic.switchToCrashEntryScreen();
					traffic.crashEntry.enterAtCaseNo1();
					traffic.crashEntry.verifyAtLocation();
					traffic.crashEntry.verifyAtCSZ();
					traffic.crashEntry.enterAtOfficer();
					traffic.crashEntry.enterAtNoOfUnits();
					traffic.crashEntry.saveScreen();
					traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickCaseInfo();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickApprovalTab();
					traffic.crashEntry.verify10089ActionTabConfirmMessage();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsApprove();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.verifyStatusAsApprovedAndAppearAsGreenColor();
					traffic.switchToCrashEntry();
						
				}
			@Test //Automated by Stalin Q3 s4
				public void ToverifyCountyfieldbindinginCitationEntryscreen_281024(ITestContext testContext)
				{
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "281024");
					Browser.NavigateToLoginScreen();
					login.loginScreen.logonUsingTestContextOtherDB();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Citation Entry");
					traffic.switchToCitationEntry();
					traffic.citationEntry.enterAtCallNo();
					traffic.citationEntry.selectCETypeAsTrafficViolation();
					traffic.citationEntry.tabAtDateAndTime();
					traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
					traffic.citationEntry.enterAtNameID();
					traffic.citationEntry.verifyAtCSZCounty(); 
					traffic.citationEntry.verifyCSZCountyIsInDisabledMode();
					traffic.switchToCitationEntry();

				}

				
				@Test //Automated by Stalin Q3 s4
				public void VerifytheCrashEntryshouldnavigatetoApprovaltab_281023(ITestContext testContext)
				{
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "281023");
					Browser.NavigateToLoginScreen();
					login.loginScreen.logonUsingTestContextOtherDB();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Crash Search");
					traffic.switchToCrashSearch();
					traffic.crashSearch.clickSearch();
					traffic.crashSearch.selectRowByAtCrash();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToPoliceActionTab();
					traffic.crashEntry.policeActionTab.clickCompleteCheckBox();
					traffic.crashEntry.policeActionTab.verify10091DoDoWantToSubmitPopup();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToApprovalTab();
					traffic.switchToCrashEntry();

				}
				

			@Test //Automated by Stalin Q3 s4
				public void VerifyCrashEntryshouldnotnavigatetoothertabwhenclickedonImport_281022(ITestContext testContext)
				{
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "281022");
					Browser.NavigateToLoginScreen();
					login.loginScreen.logonUsingTestContextOtherDB();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Crash Search");
					traffic.switchToCrashSearch();
					traffic.crashSearch.clickSearch();
					traffic.crashSearch.selectRowByAtCrash();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToDiagramTab();
					traffic.crashEntry.diagramTab.clickImportButton();
					home.switchToUpdateImageScreen();
					home.updateImageScreen.EnterDate();
					home.updateImageScreen.EnterTime();
					home.updateImageScreen.clickChooseFileButtonAndSelectJPGFile();
					home.updateImageScreen.SaveAndClose();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToDiagramTab();
					traffic.crashEntry.diagramTab.verifyImageAppears();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToDiagram2Tab();
					traffic.crashEntry.diagramTab2.clickImportButton();
					home.switchToUpdateImageScreen();
					home.updateImageScreen.EnterDate();
					home.updateImageScreen.EnterTime();
					home.updateImageScreen.clickChooseFileButtonAndSelectJPGFile();
					home.updateImageScreen.SaveAndClose();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToDiagram2Tab();
					traffic.crashEntry.diagramTab2.verifyImageAppears();
					traffic.switchToCrashEntry();	}
			
			
			
			//Automated by KIRAN :-     Date :-11/10/2021  Quarter:-4  Sprint:-3 Module:-Traffic
			@Test(groups = { "2022DefectTestCasesKIRAN"},enabled=false)
			public void ToVerifyWhetherTheOfficeNameIsDisplayingAsCorrectOrNotUnderReportingTabOfCaseDetailScreenWhileSubmittingAndApprovingACrashRecordWithDifferentCredentiale_272543(ITestContext testContext) {
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testContext.setAttribute("testID", "272543");
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Traffic");
				loader.navigateToScreen("Crash Search");
				traffic.switchToCrashSearch();
				traffic.crashSearch.clickRowAtCaseNo();
				traffic.switchToCrashEntry();
				traffic.crashEntry.clickApprovalTab();
				traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
				traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
				traffic.crashEntry.crashEntryApprovalTab.save();
				traffic.crashEntry.switchToAttachmentTab();
				traffic.crashEntry.clickCaseInfo();
				records.switchToCaseUpdate();
				records.caseUpdate.clickReportingTab();
				records.caseUpdate.reportingTab.VerifyColumnValueAtOfficer();
				
			}

			// Automated by TesterName :- Vijay Date :- 12/27/2021 Sprint:- Sprint 6
			// Quarter:- Q4 Module:- Traffic
			@Test(groups = { "" })
			public void verifyParkingCitationPDFReportIsShowingOrNotInMJDB_289943(ITestContext testContext) {
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testContext.setAttribute("testID", "289943");
				Browser.NavigateToLoginScreen();
				login.loginScreen.logonUsingTestContextOtherDB();
				loader.navigateToModule("Settings");
				loader.navigateToScreen("System Parameter");
				settings.switchToSystemParamter();
				settings.sysParameter.verifySystemParameter501IsNotAsMNDB();
				loader.navigateToModule("Traffic");
				loader.navigateToScreen("Parking Entry");
				traffic.switchToParkingEntry();
				traffic.parkingEntry.entercurrentValidationDate();
				traffic.parkingEntry.enterAtTicketNo();
				traffic.parkingEntry.switchToMainTab();
				traffic.parkingEntry.parkingEntryMainTab.enterAtOfficer();
				traffic.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
				traffic.parkingEntry.parkingEntryMainTab.enterAtStateEdit();
				vehicle.switchToVehicleBoatSearchHelpWindow();
				vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
				traffic.switchToParkingEntry();
				traffic.parkingEntry.switchToMainTab();
				traffic.parkingEntry.parkingEntryMainTab.enterAtViolation();
				traffic.switchToParkingEntry();
				traffic.parkingEntry.verifyCitationFineIsNotSpecifiedAcknowledgeMessage();
				traffic.switchToParkingEntry();
				traffic.parkingEntry.switchToMainTab();
				traffic.parkingEntry.parkingEntryMainTab.enterAtLocation();
				traffic.switchToParkingEntry();
				traffic.parkingEntry.switchToFineNoticesTab();
				traffic.parkingEntry.fineNoticesTab.enterInitialAmount();
				traffic.switchToParkingEntry();
				traffic.parkingEntry.savetheScreen();
				traffic.switchToParkingEntry();
				traffic.parkingEntry.verifyAdditionSuccessfulStatusMessage();
				traffic.parkingEntry.clickPrintButton();
				home.switchToSelectReport();
				home.selectReport.verifyReportNameIsNotEqualToParkingCitation();

			}
			
			//Automated by:-Dinesh , Date :-24/12/2021 , Quarter:-4 , Sprint:-6 , Module:-Traffic .
			@Test(groups = { "" })
			public void VerifyCrashEntryOccupantsShouldUpdatedWhenAddingDataInCrashUnitScreen_288593(ITestContext testcontext) {
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testcontext.setAttribute("testID", "288593");
				Browser.NavigateToLoginScreen();
				login.loginScreen.logonUsingTestContextOtherDB();
				loader.navigateToModule("Traffic");
				loader.navigateToScreen("Crash Search");
				traffic.switchToCrashSearch();
				traffic.crashSearch.enterAtCrashNo();
				traffic.crashSearch.clickSearch();
				traffic.crashSearch.selectRowByAtCrash();
				traffic.switchToCrashEntry();
				traffic.crashEntry.switchToMotoristNonMotoristTab();
				traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo();
				traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
				traffic.switchToCrashUnit();
				traffic.crashUnit.enterNoOfOccupants();
				traffic.crashUnit.switchToPersonTab();
				traffic.crashUnit.personTab.selectAtTypeOfPerson();
				traffic.crashUnit.switchToVehicleTab();
				traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumberAndSelectStateAsWI();
				traffic.crashUnit.crashUnitVehicleTab.selectTypeAsUnknown();
				traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
				traffic.crashUnit.switchToDamageConditionsTab();
				traffic.crashUnit.damageConditionsTab.selectInitialImpact();
				traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
				traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
				traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
				traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
				traffic.crashUnit.damageConditionsTab.selectTrafficControls();
				traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
				traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
				traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
				traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
				traffic.switchToCrashUnit();
				traffic.crashUnit.saveAndClose();
				traffic.switchToCrashEntry();
				traffic.crashEntry.save();
				traffic.switchToCrashEntry();
				traffic.crashEntry.switchToOccupantsTab();
				traffic.crashEntry.occupantsTab.verifyAtUnitNo();
				//Second entry
				traffic.crashEntry.switchToMotoristNonMotoristTab();
				traffic.crashEntry.motoristNonMotoristTab.enterAtUnitNo1();
				traffic.crashEntry.motoristNonMotoristTab.clickAddButton();
				traffic.switchToCrashUnit();
				traffic.crashUnit.enterNoOfOccupants();
				traffic.crashUnit.switchToPersonTab();
				traffic.crashUnit.personTab.selectAtTypeOfPerson();
				traffic.crashUnit.switchToVehicleTab();
				traffic.crashUnit.crashUnitVehicleTab.enterAtPlateNumberAndSelectStateAsWI();
				traffic.crashUnit.crashUnitVehicleTab.selectTypeAsUnknown();
				traffic.crashUnit.crashUnitVehicleTab.selectVehicleUse();
				traffic.crashUnit.switchToDamageConditionsTab();
				traffic.crashUnit.damageConditionsTab.selectInitialImpact();
				traffic.crashUnit.damageConditionsTab.selectPrincipalDam();
				traffic.crashUnit.damageConditionsTab.selectExtentOfDamage();
				traffic.crashUnit.damageConditionsTab.selectApparentContributingCircumstanceA();
				traffic.crashUnit.damageConditionsTab.selectPreCrashAcrion();
				traffic.crashUnit.damageConditionsTab.selectTrafficControls();
				traffic.crashUnit.damageConditionsTab.selectSequenceofEvents1st();
				traffic.crashUnit.damageConditionsTab.selectMostHarmfulEvents4th();
				traffic.crashUnit.damageConditionsTab.selectApperantPhysicalStatusA();
				traffic.crashUnit.damageConditionsTab.selectAlcoholGiven();
				traffic.switchToCrashUnit();
				traffic.crashUnit.saveAndClose();
				traffic.switchToCrashEntry();
				traffic.crashEntry.save();
				traffic.switchToCrashEntry();
				traffic.crashEntry.switchToOccupantsTab();
				traffic.crashEntry.occupantsTab.verifyAtUnitNo1();
			}
			
			//Automated by:-Dinesh , Date :-27/12/2021 , Quarter:-4 , Sprint:-6 , Module:-Traffic .

			@Test(groups = { "" })
			public void VerifyCallShouldBringsTheCaseAfterResetTheCitationEntryScreen_289934(ITestContext testcontext) {
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testcontext.setAttribute("testID", "289934");
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Traffic");
				loader.navigateToScreen("Citation Entry");
				traffic.switchToCitationEntry();
				traffic.citationEntry.enterAtCallNo();
				traffic.citationEntry.verifyAtCaseNo();
				traffic.citationEntry.enterAtCaseNo();
				traffic.citationEntry.verifyAtCallNo();
				traffic.citationEntry.clickResetIcon();
				traffic.citationEntry.verifyCaseNoCallNoEmpty();
				traffic.citationEntry.enterAtCallNo();
				traffic.citationEntry.verifyAtCaseNo();
				traffic.citationEntry.enterAtCaseNo();
				traffic.citationEntry.verifyAtCallNo();
				objectIdentification.windowHandle.switchToMainWindow();

			}
			//Automated by KIRAN :-     Date :-12/22/2021  Quarter:-4  Sprint:-6  Module:-Traffic
@Test
public void VerifyTicketDuplicationWarningPopUpInParkingEntryScreen_ALLDB_286718(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "286718");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Traffic");
	loader.navigateToScreen("Parking Entry");
	traffic.switchToParkingEntry();
	traffic.parkingEntry.entercurrentValidationDate();
	traffic.parkingEntry.enterCurrentValidationTime();
	traffic.parkingEntry.enterAtTicketNo();
	traffic.parkingEntry.switchToMainTab();
	traffic.parkingEntry.parkingEntryMainTab.enterAtOfficer();
	traffic.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
	traffic.parkingEntry.parkingEntryMainTab.enterAtPlateState();
	vehicle.switchToVehicleBoatEntry();
	vehicle.vehicleBoatEntry.clickSelectButton();
//	vehicle.vehicleBoatEntry.closeScreen();
	
	traffic.switchToParkingEntry();
	traffic.parkingEntry.switchToMainTab();
	traffic.parkingEntry.parkingEntryMainTab.enterAtViolation();
	traffic.parkingEntry.parkingEntryMainTab.enterAtLocation();
	traffic.parkingEntry.clickSaveButton();
	traffic.parkingEntry.verifyInitialFineAmountAcknowledgeMessage();
	traffic.switchToParkingEntry();
	traffic.parkingEntry.switchToFineNoticesTab();
	traffic.parkingEntry.fineNoticesTab.enterInitialAmount();
	traffic.parkingEntry.savetheScreen();
	traffic.parkingEntry.verifyBottomMessage();
	traffic.parkingEntry.getParkingID();
	traffic.parkingEntry.closeParkingEntryScreen();
	objectIdentification.windowHandle.switchToMainWindow();
	loader.navigateToScreen("Parking Search");
	traffic.switchToParkingSearch();
	traffic.parkingSearch.clickAddNewButton();
	traffic.switchToParkingEntry();
	traffic.parkingEntry.enterAtTicketNo();
	traffic.parkingEntry.verify10041TicketNumberAlreadyExist();
		
	
}
//Automated by:- Abinaya, Date :-12/22/2021 , Quarter:- Q4, Sprint:-6 , Module:-Traffic .

@Test(groups = { "2022DefectTestcaseTraffic" })
public void VerifyWhetherCrashEntryThrowingAnyErrorWhenUserDoingAnyActivityFromApprovalTab_288587(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "288587");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Crash Search");
			traffic.switchToCrashSearch();
			traffic.crashSearch.clickSearch();
			traffic.crashSearch.selectRowByAtCrash();
			traffic.switchToCrashEntry();
			traffic.crashEntry.switchToPoliceActionTab();
			traffic.crashEntry.policeActionTab.clickNJCompleteCheckBox();
			traffic.crashEntry.policeActionTab.verify10091DoDoWantToSubmitPopup();
			traffic.crashEntry.save();
			traffic.crashEntry.clickApprovalTab();
			traffic.crashEntry.switchToApprovalTab();
			traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
			traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
			traffic.crashEntry.crashEntryApprovalTab.save();
			
			traffic.crashEntry.saveScreen();
			traffic.crashEntry.verifyStatusAsSubmittedAndAppearAsGreenColor();
			traffic.crashEntry.clickApprovalTab();
			traffic.crashEntry.switchToApprovalTab();
			traffic.crashEntry.crashEntryApprovalTab.selectActionAsApprove();
			traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
			traffic.crashEntry.crashEntryApprovalTab.save();
			
			traffic.crashEntry.verifyStatusAsApprovedAndAppearAsGreenColor();
			traffic.crashEntry.switchToPoliceActionTab();
			traffic.crashEntry.policeActionTab.verifyCaseStatusDisabled();

}

//Automated by:- Abinaya , Date :- 12/28/2021 , Quarter:-Q4 , Sprint:- 6 , Module:- Traffic .

@Test(groups = { "TrafficEnhancement" })
public void VerifySDKDiagramShouldAddedToCrashEntryDiagramWithoutAnyIssue_289933(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "289933");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule("Settings");
			loader.navigateToScreen("System Parameter");
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter25AsScenePDWebSDKv75();
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter91AsLicensed();
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter92Aswebsdk();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Crash Search");
			traffic.switchToCrashSearch();
			traffic.crashSearch.clickSearch();
			traffic.crashSearch.selectRowByAtCrash();
			traffic.switchToCrashEntry();
			traffic.crashEntry.switchToDiagramTab();
			traffic.crashEntry.diagramTab.clickAddNew();
			traffic.switchToKPICrimeSceneSDK();
			
			traffic.kPICrimeSceneSDK.clickStartWithATemplateButton();
			traffic.kPICrimeSceneSDK.chooseATemplate();
			//traffic.kPICrimeSceneSDK.clickDrawTab();
			traffic.switchToKPICrimeSceneSDK();
			traffic.kPICrimeSceneSDK.clickSaveButton();
			traffic.switchToCrashEntry();
			traffic.crashEntry.switchToDiagramTab();
			traffic.crashEntry.diagramTab.verifyImageIsDisplayed();
			traffic.switchToCrashEntry();
			traffic.crashEntry.saveScreen();
			traffic.crashEntry.verify1003UpdateSuccessfulFooterMessage();
			traffic.crashEntry.switchToDiagramTab();
			traffic.crashEntry.diagramTab.verifyImageIsDisplayed();
}
//Automated by:-Abinaya , Date :-02/09/2022 , Quarter:-1 , Sprint:-3 , Module:-Traffic .

@Test(groups = { "" })
public void VerifyWhetherCitationInCitationEntryScreenIsWorkingBasedOnSystemParameter1728_292632(ITestContext testcontext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "292632");
	Browser.NavigateToLoginScreen();
	login.loginScreen.logonUsingTestContextOtherDB();
	loader.navigateToModule("Settings");
    loader.navigateToScreen("System Parameter");
 	settings.switchToSystemParamter();
	settings.sysParameter.setSystemparameter1728AsTrue();
	loader.navigateToModule("Traffic");
    loader.navigateToScreen("Citation Entry");
    traffic.citationEntry.selectCETypeAsNonTrafficViolation();
	traffic.citationEntry.tabAtDateAndTime();
	traffic.citationEntry.enterAtNameID();
	traffic.citationEntry.switchToViolationsTab();
	traffic.citationEntry.violationsTab.enterAtLocation();
	traffic.citationEntry.violationsTab.tabOfficer();
	traffic.citationEntry.violationsTab.verifyCitationNoisEnabled();
	traffic.citationEntry.violationsTab.enterAtCitationNo();
	traffic.citationEntry.violationsTab.enterAtCharge1();
	traffic.switchToCitationArrest();
	// traffic.citationArrest.enterDateAsCurrentDate();
	traffic.citationArrest.selectArmed();
	traffic.citationArrest.saveCloseScren();
	traffic.switchToCitationEntry();
	traffic.citationEntry.switchToViolationsTab();
	traffic.citationEntry.violationsTab.clickAddButton();
	traffic.switchToCitationEntry();
	traffic.citationEntry.clickSaveButton();
	traffic.citationEntry.verifyAdditionSuccessfulMessage();
	traffic.citationEntry.saveandCloseTheScreen();
	
	 loader.navigateToScreen("Citation Entry");
	 traffic.citationEntry.selectCETypeAsTrafficViolation();
	 traffic.citationEntry.tabAtDateAndTime();
	 traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
	 traffic.citationEntry.verifyCitationFieldEditable();
	 traffic.citationEntry.enterAtCitationNo();
	 traffic.citationEntry.enterAtNameID();
	 traffic.citationEntry.switchToLicenseTab();
	 traffic.citationEntry.licenseTab.verifyAtDOB(); 
	 traffic.citationEntry.licenseTab.verifyAtGender(); 
	 traffic.citationEntry.licenseTab.clickNoDLCheckbox();
	 traffic.citationEntry.switchToOffenseTab();
	 traffic.citationEntry.offenseTab.enterAtDescribeLocation();
	 traffic.citationEntry.offenseTab.verifyAtMunicipality();
	 traffic.citationEntry.offenseTab.clickUnclearPlates();
	 traffic.citationEntry.offenseTab.tabOutOffenseDateTime();
	 traffic.citationEntry.switchToPlaintiffTab();
	 traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
	 traffic.citationEntry.plaintiffTab.selectCounty();
	 traffic.citationEntry.clickSaveButton();
	 traffic.citationEntry.verifyAdditionSuccessfulMessage();
	 traffic.citationEntry.saveandCloseTheScreen();
	
	settings.switchToSystemParamter();
	settings.sysParameter.setSystemparameter1728AsFalse();
	String prefix= settings.sysParameter.readInputValue("1729");
	String citationNo=settings.sysParameter.readInputValue("1730");
	loader.navigateToScreen("Citation Entry");
	traffic.citationEntry.selectCETypeAsNonTrafficViolation();
	traffic.citationEntry.tabAtDateAndTime();
	traffic.citationEntry.enterAtNameID();
	traffic.citationEntry.switchToViolationsTab();
	traffic.citationEntry.violationsTab.enterAtLocation();
	traffic.citationEntry.violationsTab.tabOfficer();
	traffic.citationEntry.violationsTab.verifyCitationNoisDisabled();
	traffic.citationEntry.violationsTab.enterAtCharge1();
	traffic.switchToCitationArrest();
	// traffic.citationArrest.enterDateAsCurrentDate();
	traffic.citationArrest.selectArmed();
	traffic.citationArrest.saveCloseScren();
	traffic.switchToCitationEntry();
	traffic.citationEntry.switchToViolationsTab();
	traffic.citationEntry.violationsTab.clickAddButton();
	traffic.switchToCitationEntry();
	traffic.citationEntry.clickSaveButton();
	traffic.citationEntry.verifyAdditionSuccessfulMessage();
	traffic.citationEntry.switchToViolationsTab();
	traffic.citationEntry.violationsTab.verifyCitationNo(prefix+citationNo);
	traffic.citationEntry.saveandCloseTheScreen();
	
	
	settings.switchToSystemParamter();
	String prefix1= settings.sysParameter.readInputValue("1729");
	String citationNo1=settings.sysParameter.readInputValue("1730");
	loader.navigateToScreen("Citation Entry");
    traffic.citationEntry.selectCETypeAsTrafficViolation();
    traffic.citationEntry.tabAtDateAndTime();
    traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
    traffic.citationEntry.verifyCitationNoDisabled();
    traffic.citationEntry.enterAtNameID();
    traffic.citationEntry.switchToLicenseTab();
    traffic.citationEntry.licenseTab.verifyAtDOB(); 
    traffic.citationEntry.licenseTab.verifyAtGender(); 
    traffic.citationEntry.licenseTab.clickNoDLCheckbox();
    traffic.citationEntry.switchToOffenseTab();
    traffic.citationEntry.offenseTab.enterAtDescribeLocation();
    traffic.citationEntry.offenseTab.verifyAtMunicipality();
    traffic.citationEntry.offenseTab.clickUnclearPlates();
    traffic.citationEntry.offenseTab.tabOutOffenseDateTime();
    traffic.citationEntry.switchToPlaintiffTab();
    traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
    traffic.citationEntry.plaintiffTab.selectCounty();
    traffic.citationEntry.clickSaveButton();
    traffic.citationEntry.verifyAdditionSuccessfulMessage();
    traffic.citationEntry.verifyCitationNo(prefix1+citationNo1);
    traffic.citationEntry.save();
    
}

//Automated by:-Abinaya , Date :-02/09/2022 , Quarter:-1 , Sprint:-3 , Module:-Traffic .

@Test(groups = { "" })
public void VerifyWhetherOffenseTabIsThrowingAnyJSErrorWhenSecondStatuteFieldOccupiedWithMultipleNIBRS_292633(ITestContext testcontext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "292633");
	Browser.NavigateToLoginScreen();
	login.loginScreen.logonUsingTestContextOtherDB();
	loader.navigateToModule("Traffic");
    loader.navigateToScreen("Citation Entry");
    traffic.citationEntry.selectCETypeAsTrafficViolation();
    traffic.citationEntry.tabAtDateAndTime();
    traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
    traffic.citationEntry.enterAtNameID();
    traffic.citationEntry.switchToOffenseTab();
    traffic.citationEntry.offenseTab.enterAtDescribeLocation();
    traffic.citationEntry.offenseTab.enterAtCharge();
    traffic.citationEntry.offenseTab.verifyNIBRSAsMandatory();
    traffic.citationEntry.offenseTab.selectAtNIBRS();
    traffic.switchToCitationArrest();
    traffic.citationArrest.selectArmed();
    traffic.citationArrest.saveCloseScren();
    traffic.switchToCitationEntry();
    traffic.citationEntry.switchToOffenseTab();
    traffic.citationEntry.offenseTab.tabOutOffenseDateTime();
    traffic.citationEntry.switchToPlaintiffTab();
    traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
    traffic.citationEntry.plaintiffTab.selectCounty();
    traffic.citationEntry.clickSaveButton();
    traffic.citationEntry.verifyAdditionSuccessfulMessage();
    String ceNo= traffic.citationEntry.readCENo();
    traffic.citationEntry.saveandCloseTheScreen();
    loader.navigateToScreen("Citation Search");
    traffic.switchToCitationSearch();
    traffic.citationSearch.clickSearchButton();
    traffic.citationSearch.selectCENoInGrid(ceNo);
    traffic.switchToCitationEntry();
    traffic.citationEntry.verifyCENo(ceNo);
}
//Automated by:- Mithun , Date :- 02/09/2022 , Quarter:-Q1 , Sprint:- 3 ,
	// Module:- Traffic .

	@Test(groups = { "" })
	public void VerifyUserIsAbleToOpenCrashEntryWithoutJSError_292629(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "292629");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Search");
		traffic.switchToCrashSearch();
		traffic.crashSearch.enterAtCrashNo();
		traffic.switchToCrashEntry();
		traffic.crashEntry.verifyAtCaseNo();
		traffic.crashEntry.verifyLoggedPFAutopupulates();
		traffic.crashEntry.save();
		objectIdentification.windowHandle.switchToMainWindow();

	}		
	        @AfterMethod(groups={"2021DefectTestCases","2020DefectTestCases","ParkingEntryNJ", "CitationNJ", "CrashNJ"})
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
	  			 ExtentReport.GenerateHTML();
	  			login.Reset();
	  			loader.Reset();
	  			traffic.Reset();
	  		}
	  	  @AfterSuite(groups={"2021DefectTestCases","2020DefectTestCases","ParkingEntryNJ", "CitationNJ", "CrashNJ"})
	  	  public void afterRunSuite()
	  	  {
	  		  ExtentReport.GenerateHTML();
	  	  	
	  	  	}

}
