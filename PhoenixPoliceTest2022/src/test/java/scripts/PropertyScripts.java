package scripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.CM;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Personnel;
import application.Popup;
import application.Property;
import application.Records;
import application.Settings;
import application.Vehicle;
import dataAccess.PoliceData;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class PropertyScripts {

	public Property property;
	public Login login;
	public Loader loader;
	public Settings settings;
	public Popup popup;
	public Records records;
	public Home home;
	public Vehicle vehicle;
	public Names names;
	public ObjectIdentification objectIdentification;
	public Personnel personnel;
	public CM cM;

		@BeforeSuite(groups = { "PropertyEntry", "PropertyFunctional2020","PropertyFunctional2020_1", "PropertyFunctional2020_2", "PropertyEntry2", "PropertyEntry1",
			"PropertyUpdate", "PropertyUpdate1", "PropertySearch", "PropertyModuleOtherScreens", "PropertyEntry",
			"2021DefectTestCases", "2021DefectTestCasesBatch2", "2021DefectTestCasesBatch3", "PropertyApproval",
			"PropertyUpdate", "PropertySearch", "PropertyModuleOtherScreens" ,"2022DefectTestCasesProperty","2022RBTestCasesProperty",
			"PropertyFunctionalBatch1", "PropertyFunctionalBatch2","PropertyFunctionalBatch3"})
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "PropertyEntry", "PropertyFunctional2020", "PropertyFunctional2020_1", "PropertyFunctional2020_2", "PropertyEntry2", "PropertyEntry1",
			"PropertyUpdate", "PropertyUpdate1", "PropertySearch", "PropertyModuleOtherScreens", "PropertyEntry",
			"2021DefectTestCases", "2021DefectTestCasesBatch2", "2021DefectTestCasesBatch3", "PropertyApproval",
			"PropertyUpdate", "PropertySearch", "PropertyModuleOtherScreens"  ,"2022DefectTestCasesProperty","2022RBTestCasesProperty",
			"PropertyFunctionalBatch1", "PropertyFunctionalBatch2","PropertyFunctionalBatch3"})
	public void beforeMethodProperty(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Property");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		property = new Property();
		popup = new Popup();
		settings = new Settings();
		records = new Records();
		home = new Home();
		vehicle = new Vehicle();
		names = new Names();
		personnel = new Personnel();
		cM = new CM();
		objectIdentification = new ObjectIdentification();
	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void creatingPropertyEntryAndVerifyingBarcodeAvailable_100881(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "100881");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();

		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.selectPropertyAsFirearms();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterSerial();
		property.propertyEntry.propertyEntryMainTab.selectGunTypeAndTab();
		property.propertyEntry.propertyEntryMainTab.selectGunMake();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.EnterCaliber();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseNoConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();

	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void verifyBarCodeImageInPropertyEntry_101122(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101122");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.SelectRowFromGrid();

		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void VerifyAbleToCreateSequenceInPropertyEntryScreen_100946(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "100946");
		List<String> allProperty = new ArrayList<>();
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();

		// first sequence
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.selectPropertyAsFirearms();
		property.propertyEntry.propertyEntryMainTab.VerifyPropertyTypeAsGun();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterSerial();
		property.propertyEntry.propertyEntryMainTab.selectGunTypeAndTab();
		property.propertyEntry.propertyEntryMainTab.selectGunMake();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.EnterCaliber();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();

		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseNoConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.ClickAttachmentTab();
		String propertyNo = property.propertyEntry.readPropertyNo();
		allProperty.add(propertyNo);
		Playback.pageLoadThreadWait();

		// click AddNew Button
		property.propertyEntry.ClickAddNewButton();
		Playback.pageLoadThreadWait();
		// Second Sequence
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
		property.propertyEntry.propertyEntryMainTab.VerifyPropertyTypeAsVehicle();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectPlateNumber();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();

		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		popup.confirm.yes();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo1 = property.propertyEntry.readPropertyNo();
		allProperty.add(propertyNo1);
				// click AddNew Button
		property.propertyEntry.ClickAddNewButton();
		Playback.pageLoadThreadWait();

		// Third Sequence
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsWaterCraft();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectRandomRegistrationNumber();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.EnterQuantityAsOne();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();

		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		popup.confirm.yes();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo2 = property.propertyEntry.readPropertyNo();
		allProperty.add(propertyNo2);
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.verifyMultiplePropertyNoInGrid(allProperty);

	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void updatePropertyAsMovedIntoPropertyRoom_101133(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101133");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.VerifyCaseInfoButton();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyPropertyItemAppearsInTheGrid();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.VerifyStorageLocationAsMandateAcknowledge();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);
	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void verifyPropertyAbleToupdateAsMovedIntoPropertyRoom_101134(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101134");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.SelectTheLockerAllCheckBox();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.SelectTheSelectAllCheckBox();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.VerifyStorageLocationAsMandateAcknowledge();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);

	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void verifyAbleToSendPropertyItemsToLabAndReleaseThePropertyItemFromPropertyRoomRolesScreen_101135(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101135");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.SelectTheSelectAllCheckBox();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
		property.propertyUpdate.propertyUpdatePopup.EnterAtReceivedBy();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
			String status = property.propertyUpdate.readStatusInGridByIndex(0);
		property.propertyUpdate.VerifyPropertyStatusInTheGridAsSentToLab(0);
		property.propertyUpdate.ClickOnThePRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.VerifyPropertyStatusAsSentToLab();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.verifyPropertyStatusInTheGridByActiveData(status);
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyAtStatusInFirstElementHistory(status, 0);
		property.switchToPropertyUpdate();
		property.propertyUpdate.SelectTheSelectAllCheckBox();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		String status1 = property.propertyUpdate.readStatusInGridByIndex(0);
		property.propertyUpdate.verifyPropertyStatusInTheGridAsReceivedfromLab(0);
		property.propertyUpdate.ClickOnThePRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.verifyPropertyStatusInTheGridByActiveData(status1);
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyAtStatusInFirstElementHistory(status1, 0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToDispositionTab();
		property.propertyRoomRoles.dispositionTab.TabTheDateAndTime();
		property.propertyRoomRoles.dispositionTab.TabTheOfficer();
		property.propertyRoomRoles.dispositionTab.SelectDispositionAsReleased();
		property.propertyRoomRoles.dispositionTab.SelectReleasedTo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SaveTheScreen();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.VerifyPropertyStatusAsReleased();
		property.switchToPropertyUpdate();
		String status2 = property.propertyUpdate.readStatusInGridByIndex(0);
		property.propertyUpdate.ClickOnThePRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.verifyPropertyStatusInTheGridByActiveData(status2);
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyAtStatusInFirstElementHistory(status2, 0);
	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void Property_101204(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101204");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Access Log");
		settings.switchToAcessLog();
		settings.accessLog.enterRepositoryAs3240();
		settings.accessLog.tabTheFromDateAndTime();
		settings.accessLog.tabTheToDateAndTime();
		settings.accessLog.clickSearch();
		// Playback.TakeScreenshot(PropertyTestContext,
		// "AccessLogFromPropertyUdpateScreen");
	}

	@Test(groups = "PropertyApproval", priority = 1)
	public void Property_101171(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101171");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsGunsORFirearms();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterSerial();
		property.propertyEntry.propertyEntryMainTab.selectGunTypeAndTab();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsOnHold();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.updateStatusTab.EnterAtSupervisor();
		records.reportManager.save();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.reportManager.switchToHistoryTab();
		records.reportManager.reportManagerHistroyTab.VerifyActionOnTheTableAsSubmitted(0);

	}

@Test(groups = "PropertyApproval", priority = 2)
	public void Property_101172(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101172");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyCaseAtCaseNo();
		home.myHome.myReportsTab.VerifyTypeAsPropertyReport();
		home.myHome.myReportsTab.VerifyStatusAsSubmitted();
		home.myHome.myReportsTab.SelectRowByAtCaseNo();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.SelectActionAsReject();
		records.reportManager.updateStatusTab.SelectRejectionCode(1);
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerfiyStatusAsRejected();
		records.reportManager.switchToHistoryTab();
		records.reportManager.reportManagerHistroyTab.VerifyActionOnTheTableAsRejected(0);

	}

	@Test(groups = "PropertyApproval", priority = 3)
	public void Property_101173(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101173");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.SelectStatusAsRejected();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyCaseAtCaseNo();
		home.myHome.myReportsTab.VerifyTypeAsPropertyReport();
		home.myHome.myReportsTab.VerifyStatusAsRejected();
		home.myHome.myReportsTab.SelectRowByAtCaseNo();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.VerfiyStatusAsRejected();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.reportManager.switchToHistoryTab();
		records.reportManager.reportManagerHistroyTab.VerifyActionOnTheTableAsSubmitted(0);

	}

	@Test(groups = "PropertyApproval", priority = 4)
	public void Property_101174(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "101174");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportsTab();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyCaseAtCaseNo();
		home.myHome.myReportsTab.VerifyTypeAsPropertyReport();
		home.myHome.myReportsTab.VerifyStatusAsSubmitted();
		home.myHome.myReportsTab.SelectRowByAtCaseNo();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.reportManager.VerfiyStatusAsApproved();
		records.reportManager.switchToHistoryTab();
		records.reportManager.reportManagerHistroyTab.VerifyActionOnTheTableAsApproved(0);
	}

	@Test(groups = "PropertyFunctionalBatch1")
	public void CreateStolenPropertyItemRecover_111794(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111794");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.VerifyAtReason(0);
		property.propertyEditEntry.ClickCheckBoxfromGrid();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.propertyEditEntry.VerifyConfirmSelectedRowMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.VerifyReasonAsRecovered();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsRecovered();
		property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
		property.propertyEntry.propertyEntryMainTab.EnterSerial();
		String relatedPropertyNo = property.propertyEntry.propertyEntryMainTab.readRelatedPropertyNo();
		property.propertyEntry.propertyEntryMainTab.taboutRelatedPropertyNoField();
		property.propertyEntry.propertyEntryMainTab.ClickRelatedPropertyInfoIcon();
		property.switchToPropertyIndex();
		property.propertyIndex.verifyAtPropertyNo(relatedPropertyNo);
		property.propertyIndex.closeTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		// property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		Playback.setFocus();// Window hide issue after save the screen
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.VerifyReasonAsRecovered(0);
		property.propertyEditEntry.ClickRecoverdProperty();
		property.switchToPropertyEntry();
		property.propertyEntry.VerifyMenuBarIconsDisabled();

	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void ClosedPropertyItemsshowingGreyColor_111795(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111795");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.EnterFromCaseDetails();
		property.propertySearch.EnterToCaseDetails();
		property.propertySearch.ClickIncludeClosed();
		property.propertySearch.clickSearch();
		property.propertySearch.VerifyRowViewedGrayColor();

	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void CheckHoldCodePropertyItem_111845(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111845");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterAtSerialClothing();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtHold();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.VerifyAdditionSuccessfulMessage();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.VerifyRowFontViewedRedColor();

	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void DeletedPropertyItem_111846(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111846");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.EnterFromCaseDetails();
		property.propertySearch.EnterToCaseDetails();
		property.propertySearch.ClickIncludeClosed();
		property.propertySearch.clickSearch();
		property.propertySearch.ClickRowAtReason();
		property.switchToPropertyIndex();
		property.propertyIndex.ClickDelete();
		popup.confirm.yes();
		property.switchToPropertySearch();
		popup.acknowledge.ok();
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.VerifyReasonAsDeleted(1);
		property.propertyEditEntry.VerifyRowviewedRedColor();

	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void CheckPropertySearchScreenListingPropertyitems_111847(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111847");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterAtSerialClothing();
		property.switchToPropertySearchHelpWindow();
		property.propertySearchHelpWindow.ClickRow();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.EnterQuantityAs1000();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs12345607();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectInitialStorageLocationAsL0000000012();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.VerifyUpdateSuccessfulMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.VerifyAtSerialClothing();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed();

	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void CheckabletoDeleteHoldStatusProperty_111848(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111848");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.selectGunTypeAndTab();
		property.propertyEntry.propertyEntryMainTab.EnterSerial();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseNoConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.VerifyAdditionSuccessfulMessage();
		property.propertyEntry.ClickDeleteButton();
		popup.confirm.yes();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.verifyPropertyNoIsNotListed(propertyNo);

	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void VerifyPropertyalreadyavailablePawnmessage_111849(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111849");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtSerial();
		property.propertyEntry.propertyEntryMainTab.VerifyConfirmMessagePropertyIsAvailableInThePawnRecord();
		property.switchToPawnEntry();
		property.pawnEntry.pawnEntryMainTab.VerifySerial();
		property.pawnEntry.ClosePawnEntry();
		property.switchToPropertyEntry();
		property.propertyEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void CreateFullAudit_111850(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111850");
		String uIAuditBalance = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Audit Search");
		property.switchToAuditSearch();
		property.auditSearch.ClickAddNew();
		property.switchToAuditEditEntry();
		property.auditEditEntry.enterAtAuditName();
		property.auditEditEntry.SelectAtAuditType();
		property.auditEditEntry.tabOutAuditByLookUp();
		property.auditEditEntry.EnterAuditDateTime();
		property.auditEditEntry.VerifyAuditCurrentDateTime();
		property.auditEditEntry.ClickCreateAuditButton();
		property.switchToAuditEditEntry();
		property.auditEditEntry.switchToAuditTab();
		property.auditEditEntry.SelectAtAuditLocationLookUp();
		property.auditEditEntry.ClickStatusAsNotAudit();
		property.auditEditEntry.GetAuditBalanace(uIAuditBalance);
		property.auditEditEntry.ClickTransmitButton();
		property.auditEditEntry.VerifyStatusAsAuditedInTheGrid();
		property.auditEditEntry.VerifyAuditBalance(Playback.getTestContextAttribute("uIAuditBalance"));
		property.auditEditEntry.SelectRowAtStatus();
		property.auditEditEntry.ClickTransmitButton();
		property.auditEditEntry.VerifyAcknowledgePropertyIsAlreadyAudited();
		property.switchToAuditEditEntry();
	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void CreatePartialAudit_111851(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111851");
		String uIAuditBalance = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Audit Search");
		property.switchToAuditSearch();
		property.auditSearch.ClickAddNew();
		property.switchToAuditEditEntry();
		property.auditEditEntry.enterAtAuditName();
		property.auditEditEntry.SelectAtAuditType();
		property.auditEditEntry.tabOutAuditByLookUp();
		property.auditEditEntry.EnterAuditDateTime();
		property.auditEditEntry.VerifyAuditCurrentDateTime();
		property.auditEditEntry.SelectAtProperty();
		property.auditEditEntry.ClickCreateAuditButton();
		property.switchToAuditEditEntry();
		property.auditEditEntry.switchToAuditTab();
		property.auditEditEntry.SelectAtAuditLocationLookUp();
		property.auditEditEntry.ClickStatusAsNotAudit();
		property.auditEditEntry.GetAuditBalanace(uIAuditBalance);
		property.auditEditEntry.ClickTransmitButton();
		property.auditEditEntry.VerifyStatusAsAuditedInTheGrid();
		property.auditEditEntry.VerifyAuditBalance(Playback.getTestContextAttribute("uIAuditBalance"));
		property.auditEditEntry.SelectRowAtStatus();
		property.auditEditEntry.ClickTransmitButton();
		property.auditEditEntry.VerifyAcknowledgePropertyIsAlreadyAudited();
		property.switchToAuditEditEntry();

	}

	@Test(groups = { "PropertyFunctionalBatch2" })
	public void CreateNewPawn_111852(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111852");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Pawn");
		property.switchToPawn();
		property.pawn.clickAddNew();
		property.switchToPawnEntry();
		property.pawnEntry.selectAtType();
		property.pawnEntry.EnterAtPawnTagNo();
		property.pawnEntry.enterAtEnteredBy();
		property.pawnEntry.SelectAtDisposition();
		property.pawnEntry.switchToMainTab();
		property.pawnEntry.pawnEntryMainTab.selectAtPropertyType();
		property.pawnEntry.pawnEntryMainTab.enterDescription();
		property.pawnEntry.pawnEntryMainTab.SelectMake();
		property.switchToPawnEntry();
		property.pawnEntry.pawnEntryMainTab.EnterColor();
		property.pawnEntry.pawnEntryMainTab.EnterAtSerialNo();
		property.switchToPawnEntry();
		property.pawnEntry.switchToDealerTab();
		property.pawnEntry.dealerTab.SelectDealerID();
		property.pawnEntry.save();
		property.switchToPawnEntry();
		property.pawnEntry.verifyAdditionSuccessfulMessage();

	}

	@Test(groups = { "PropertyFunctionalBatch1" })
	public void createNewBicycleRegistration_111853(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "111853");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Bicycle Registration");
		property.switchToBicycleRegistration();
		property.bicycleRegistration.ClickAddNew();
		property.switchToBicycleRegistrationEntry();
		property.bicycleRegistrationEntry.EnterRegistrationDate();
		property.bicycleRegistrationEntry.EnterAdultName();
		property.switchToBicycleRegistrationEntry();
		property.bicycleRegistrationEntry.EnterAtMake();
		property.bicycleRegistrationEntry.EnterAtFrameSerialNo();
		property.bicycleRegistrationEntry.SelectAtColor();
		property.bicycleRegistrationEntry.EnterCustom();
		property.bicycleRegistrationEntry.Save();
		property.switchToBicycleRegistrationEntry();
		property.bicycleRegistrationEntry.VerifyAdditionSccessful();

	}

	@Test(groups = { "PropertyEntry" })
	public void Police2020PropertyModule_243288(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "243288");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.TabOfficer();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtPlateNumber();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.ClickPlateOnlyCheckbox();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.VerifyPropertyAsVehiclePartsAccessories();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyUpdate" })
	public void PropertyExceptionalDeletionPropertyManagerRole2020_244246(ITestContext testContext) {
		testContext.setAttribute("testID", "244246");
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNoAndCount();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.SelectTheUpdateCheckboxInTheGrid();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtExceptionalRemoval();
		property.propertyUpdate.propertyUpdatePopup.enterRemark();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryHistoryTab.VerifyHistroyAsExceptionalRemoval();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyModuleOtherScreens" }) // Raja Sadaraj
	public void Police2020PropertyModule_246286(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "246286");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Bicycle Registration");
		property.switchToBicycleRegistration();
		property.bicycleRegistration.EnterAtRegistrationNousingYear();
//    property.switchToBicycleRegistration();
//    property.bicycleRegistration.ClickSearchButton();
//    property.bicycleRegistration.clickAtRegistrationNoInGrid();
		property.switchToBicycleRegistrationEntry();
		property.bicycleRegistrationEntry.ClickInactive();
		// property.bicycleRegistrationEntry.VerifyInactiveDateAsCurrentDate(); //not
		// able to get date from date field
		property.bicycleRegistrationEntry.Save();
		popup.switchToAcknowledge();
		property.bicycleRegistration.VerifyNoRecordAcknowledgeMessage();
		property.switchToBicycleRegistrationEntry();
		property.bicycleRegistrationEntry.closeScreen();
//    property.switchToBicycleRegistration();
//    property.bicycleRegistration.VerifyNoRecordAcknowledgeMessage();
		property.switchToBicycleRegistration();
		property.bicycleRegistration.ClickResetButton();
		property.bicycleRegistration.ClickIncludeInactive();
		property.bicycleRegistration.ClickSearchButton();
		property.bicycleRegistration.VerifyAtRegistrationNoInGrid(2);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate" }) // Raja Sadaraj
	public void Police2020PropertyModule_246308(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "246308");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");

		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNoAndCount();

		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
    popup.confirm.yes();
		property.propertyUpdate.propertyUpdatePopup.VerifyStorageLocationAsMandateFiled();
		property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
		popup.confirm.yes();
		Playback.controlReadyThreadWait();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);
		property.propertyUpdate.VerifyPRIconViewInGridUsingPropertyNo();
		property.propertyUpdate.ClickPRIconUsingPropertyNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToPropertyTab();
		property.propertyRoomRoles.propertyTab.selectAtProperty();
		property.propertyRoomRoles.propertyTab.EnterAtSerial();
		property.propertyRoomRoles.propertyTab.EnterAtModel();
		property.propertyRoomRoles.SaveTheScreen();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.propertyTab.VerifyAtSerialNo();
		property.propertyRoomRoles.propertyTab.VerifyAtModelNo();
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyAtSerialNo();
		property.propertyRoomRoles.historyTab.VerifyAtModelNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.ClickPropertyInfoIcon();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.VerifyAtSerialNo();
		property.propertyEntry.propertyEntryMainTab.VerifyAtModelNo();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry" }) // Raja Sadaraj
	public void Police2020PropertyModule_246309(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "246309");

		String propertyYear = null;
		String propertyNumber = null;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");

		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();

		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.GetThePropertyYearAndNumber(propertyYear, propertyNumber);
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.VerifyAtStorageByAtReason();
		property.propertyEditEntry.ClickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.VerifyAtStorageUsingReason();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.VerifyPropertyStatusAsLocked();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertySearch" })
	public void VerifySignatureAuthentication_240631(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "240631");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.EnterFromCaseDetails();
		property.propertySearch.EnterToCaseDetails();
		property.propertySearch.clickSearch();
		property.switchToPropertySearch();
		property.propertySearch.ClickPRIconUsingCaseNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.VerifyAtStatus();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.TabDataAndTime();
		property.propertyRoomRoles.storageTab.TabOfficer();
		property.propertyRoomRoles.storageTab.SelectAtAction();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.SelectRelinquishedCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.chainTab.EnterAtReceivedBy();
		property.propertyRoomRoles.chainTab.SelectReceivedCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.chainTab.clickUpdateButtonWithConfrim();
		popup.confirm.yes();
		property.switchToPropertySearch();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry" })
	public void VerifythePropertyChange_240625(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "240625");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtPlateNumber();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveAndCloseScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.ClickPlateOnlyCheckbox();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.VerifyPropertyTypeAsVehicle();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyModuleOtherScreens" }) // Raja Sadaraj
	public void Police2020PropertyModule_248771(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "248771");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Pull Request");
		property.switchToPullRequest();
		property.pullRequest.ClickAddNew();
		property.switchToRequestEntry();
		property.requestEntry.VerifyAtRequestedBy();
		property.requestEntry.TabDateRequiredandTime();
		property.requestEntry.SelectAtReason();
		property.requestEntry.EnterAtPropertyYearUsingPropertyNo();
		property.requestEntry.EnterAtSequenceNoUsingPropertyNo();
		property.requestEntry.ClickPropertyLookupIcon();
//    property.switchToPropertyEditEntryPopup();
		property.switchToPropertySearchHelpWindow();
//    property.propertySearchHelpWindow.selectGridRowbyIndex(0);
		property.propertySearchHelpWindow.ClickAtProprtyNoRowCheckbox();
		property.propertySearchHelpWindow.ClickSelectProperty();
//    property.propertyEditEntry.SelectGridCheckboxByAtPropertyNo();
//    property.propertyEditEntry.ClickSelectProperty();
		property.switchToRequestEntry();
		property.requestEntry.VerifyAtPropertyNoInGrid(0);
		property.requestEntry.EnterAtPropertyNo();
//    property.requestEntry.VerifyAtPropertyDescription();
		property.requestEntry.ClickAdd();
		property.requestEntry.VerifyAtDuplicationAcknowledgeMessage();
		property.switchToRequestEntry();
		property.requestEntry.Save();
		property.switchToRequestEntry();
		property.requestEntry.VerifyStatusAsOpen();
		property.requestEntry.CloseScreen();
		property.switchToPullRequest();
		property.pullRequest.VerifyRequiredDateAsCurrentDateInGrid();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate" }) // Vijay
	public void VerifyThePropertyEntryStatusFieldShowingTheDropdownOptionsInTreeView_249230(ITestContext testContext) {
		testContext.setAttribute("testID", "249230");
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickEvidenceCheckbox();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.verifyUpdateButtonAsEnabled();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectStorageLocationAsL0000000012();
		property.propertyUpdate.propertyUpdatePopup.ClickActionDropdown();
		property.propertyUpdate.propertyUpdatePopup.ActionDropDownShownAsTreeView();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsSentToPropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.ClickStatusDropDown();
		property.propertyEntry.recoveredTab.StatusDropDownIsDisplayed();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.SelectAtStatus();
		property.propertySearch.clickBack();
		property.propertySearch.clickSearch();
		property.propertySearch.ClickPRIconUsingPropertyNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.ClickActionDropDown();
		property.propertyRoomRoles.storageTab.ActionDropDownIsDisplayed();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyEntry" }) // Vijay
	public void VerifyThatMultipleCasePropertiesAreAllowingToAssignInNonSharedEvidenceLocker_249231(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249231");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500(); // Added Tab
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
    property.propertyEntry.recoveredTab.verifyAtRecoveredValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.SelectInitialStorageLocation();
		popup.acknowledge.okIfWindowExist();
		popup.confirm.yesIfWindowExist();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumber1AndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation(); // Changed Storage Location L0000000024
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyModuleOtherScreens" }) // Vijay
	public void VerifyThatTheSharedEvidenceLockerIsAbleToCreate_249232(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249232");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Location Search");
		property.switchToLocationSearch();
		property.locationSearch.ClickAddNew();
		property.switchToStorageLocations();
		property.storageLocations.EnterAtDescription();
		property.storageLocations.ClickEvidenceLockerCheckBox();
		property.storageLocations.VerifySharedCheckBoxIsDisplayed();
		property.storageLocations.ClickSharedCheckBox();
		property.storageLocations.VerifySharedCheckBoxIsSelected();
		property.storageLocations.SaveTheScreen();
		property.switchToStorageLocations();
		property.storageLocations.CloseTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate" }) // Vijay
	public void VerifyThePropertyUpdateScreenActionsForPoliceOffice_250430(ITestContext testContext) {
		testContext.setAttribute("testID", "250430");
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtPlateNumber();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.saveScreen();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.closeScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.EnterAtLastNameInPossOf();
		property.propertyEntry.recoveredTab.EnterAtFirstNameInPossOf();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		String PropertyNo = property.propertyEditEntry.ReadPropertyNo();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterPropertyByActiveData(PropertyNo);
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.SelectUpdateCheckboxByActivePropertyNo(PropertyNo);
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyEntry" }) // Automated By Stalin
	public void Verify_that_used_Non_shared_location_is_allow_to_reuse_249126(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249126");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs12345607();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.SelectContainerAsBottle();
		property.propertyEntry.recoveredTab.SelectPackageAsBottle();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.Close();
		objectIdentification.windowHandle.switchToMainWindow();
//	loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();

	}

	@Test(groups = { "PropertyEntry" }) // Automated by Stalin

	public void Verify_the_Remarks_history_is_track_for_all_disposition_249127(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249127");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsSeized();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsAircraft();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.EnterAtRemark();
		property.propertyEntry.recoveredTab.enterReleaseName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.SelectName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();
		popup.confirm.yes();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.SelectRowFromGrid();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryHistoryTab.VerifyHistroyAsSentToLab();
		property.propertyEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.enterRemark();
		property.propertyUpdate.propertyUpdatePopup.EnterAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsSentToPropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.enterRemark();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickPRIconUsingCaseNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyHistroyAsSentToLab();
		property.propertyRoomRoles.SwitchToDispositionTab();
		property.propertyRoomRoles.dispositionTab.TabTheDateAndTime();
		property.propertyRoomRoles.dispositionTab.TabTheOfficer();
		property.propertyRoomRoles.dispositionTab.SelectDispositionAsReleased();
		property.propertyRoomRoles.dispositionTab.EnterAtNotes();
		property.propertyRoomRoles.dispositionTab.EnterAtLastNameandFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SaveTheScreen();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyReleasedHistory();

	}

	@Test(groups = { "PropertyEntry" }) // Automated By Stalin

	public void Verify_That_the_property_entry_is_showing_storage_location_properly_inupdate_grid_250421(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250421");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCase();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyAtStorage(0);
		property.propertyUpdate.VerifyAtStorage(1);

	}

	@Test(groups = { "PropertyUpdate" }) // Stalin
	public void Verify_adding_Evidence_Locker_under_the_property_module_249125(ITestContext testContext) {
		testContext.setAttribute("testID", "249125");
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter414AsTrue();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsSentToPropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.VerifySentToPropertyRoomInMenuBar();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyUpdate" }) // Raja Sadaraj
	public void Police2020PropertyModule_255534(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255534");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.verifyUpdateButtonAsEnabled();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
//		popup.confirm.yes();
		property.propertyUpdate.propertyUpdatePopup.VerifyStorageLocationAsMandateFiled();
		property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyStatusAsMovedIntoThePropertyRoomUsingPropertyNo();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.verifyUpdateButtonAsEnabled();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.EnterAtReceivedBy();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.VerifyRelinquishedReceivedByOfficersIdenticalConfirmMessage();
		popup.confirm.yes();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyPropertyStatusInTheGridAsSentToLab(0);
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.verifyUpdateButtonAsEnabled();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.verifyAtReceivedBy();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyPropertyStatusInTheGridAsReceivedfromLab(0);
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.verifyUpdateButtonAsEnabled();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.VerifyLastStorageLocationConfirmMessage();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.VerifyRelinquishedReceivedByOfficersIdenticalConfirmMessage();
		popup.confirm.yes();
		property.switchToPropertyUpdate();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyStatusAsMovedIntoThePropertyRoomUsingPropertyNo();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.switchToHistoryTab();
		property.propertyIndex.propertyIndexHistoryTab.VerifyAtPFCode();
		property.propertyIndex.propertyIndexHistoryTab.verifyHistroyAsSentToPropertyRoom();
		property.propertyIndex.propertyIndexHistoryTab.VerifyHistroyAsMovedPropertyRoom();
		property.propertyIndex.propertyIndexHistoryTab.VerifyHistroyAsSentToLab();
		property.propertyIndex.propertyIndexHistoryTab.verifyHistroyAsReceivedfromLab();
		property.switchToPropertyIndex();
		property.propertyIndex.ClickPropertyBblIcon();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryHistoryTab.VerifyAtPFCode();
		property.propertyEntry.propertyEntryHistoryTab.verifyHistroyAsSentToPropertyRoom();
		property.propertyEntry.propertyEntryHistoryTab.VerifyHistroyAsMovedPropertyRoom();
		property.propertyEntry.propertyEntryHistoryTab.VerifyHistroyAsSentToLab();
		property.propertyEntry.propertyEntryHistoryTab.verifyHistroyAsReceivedfromLab();
		property.switchToPropertyEntry();
		property.propertyEntry.closeTheScreen();
		property.switchToPropertyIndex();
		property.propertyIndex.closeTheScreen();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickPRIconUsingPropertyNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyAtPFCode();
		property.propertyRoomRoles.historyTab.verifyHistroyAsSentToPropertyRoom();
		property.propertyRoomRoles.historyTab.VerifyHistroyAsMovedPropertyRoom();
		property.propertyRoomRoles.historyTab.VerifyHistroyAsSentToLab();
		property.propertyRoomRoles.historyTab.verifyHistroyAsReceivedfromLab();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.CloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry" }) // Raga Ranjani

	public void Police2020DefectPropertyModule_254480(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254480");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Walk-In Entry");
		records.switchToWalkInEntry();
		records.walkInEntry.enterCADCFS();
		records.walkInEntry.tabTheReportedDate();
		records.walkInEntry.tabTheReportedTime();
		records.walkInEntry.enterLocation();
		records.walkInEntry.tabTheReceivedSource();
		records.walkInEntry.tabTheCADDispositon();
		records.walkInEntry.enterAtUnit(); // Changed SelectUnit to EnterAtUnit
		records.switchToWalkInEntry();
		records.walkInEntry.save();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();

		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.EnterAtReleaseToLastName(); // Added
		property.propertyEntry.recoveredTab.EnterAtReleaseToFirstName();//Added
    		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry(); // Added

		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry" }) // Raga Ranjani

	public void Police2020DefectPropertyModule_254620(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254620");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs0();
		property.propertyEntry.clickSaveButton();
		property.propertyEntry.Verify9124ValueRequiredAcknowledgemessage();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry" }) // Raga Ranjani

	public void Police2020DefectPropertyModule_254621(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254621");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterAtQuantity();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.verifyAtQuantity();
    	objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry" }) // Raja Sadaraj
	public void Police2020PropertyModule_255714(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255714");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.SelectDrugMeasurement();
		property.propertyEntry.propertyEntryMainTab.EnterDrugQuantityAs545();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.TabOutDrugQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtPFCode();
		property.propertyEntry.recoveredTab.SelectContainerAsBottle();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyContainerSeqNoAs1();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.verifySavebuttonsDisabled();
		records.reportManager.Close();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickAtResaonInGrid();
		property.switchToPropertyEntry();
		property.propertyEntry.VerifyMenuBarIconsDisabled();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate" }) // Raja Sadaraj
	public void Police2020PropertyModule_255715(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255715");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
//    property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.Close();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByCaseNo();
		property.propertyUpdate.verifyUpdateButtonAsEnabled();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.enterAtLastName();
		property.propertyUpdate.propertyUpdatePopup.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyAtStatusUsingCaseNo();
		property.propertyUpdate.ClickOnThePRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.VerifyPropertyStatusAsReleased();
		property.propertyRoomRoles.verifySaveButtonsDisabled();
		property.propertyRoomRoles.CloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate" }) // Raja Sadaraj
	public void Police2020PropertyModule_256148(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256148");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs0();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.Close();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByCaseNo();
		property.propertyUpdate.verifyUpdateButtonAsEnabled();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.enterRemark();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyAtStatusUsingCaseNo();
		property.propertyUpdate.ClickOnThePRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.VerifyAtStatus();
		property.propertyRoomRoles.verifySaveButtonsDisabled();
		property.propertyRoomRoles.CloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyModuleOtherScreens" }) // Vijay
	public void verifyWeAreAbleToDoPawnSearchUsingSellerName_254570(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "254570");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Pawn");
		property.switchToPawn();
		property.pawn.enterAtLastName();
		property.pawn.clickSearchButton();
		property.switchToPawn();
		property.pawn.selectRowByPawnType();
		property.switchToPawnEntry();
		property.pawnEntry.switchToDealerTab();
		property.pawnEntry.dealerTab.verifyDealerLastName();

	}

	@Test(groups = { "PropertyEntry" }) // Vijay
	public void propertyEntryRecoveredTabEnhancementsBasedOnDispositionSelected_254619(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "254619");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab(); // changed enterAtCaseNumber1AndTab to
																// enterAtCaseNumberAndTab
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
		property.propertyEntry.propertyEntryMainTab.enterDecriptionAs10Shirts();
		property.propertyEntry.propertyEntryMainTab.enterAtPlateNumber();
		property.propertyEntry.propertyEntryMainTab.enterQuantityAs10();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();// 1
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyInitialStorageFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyContainerDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyPackageDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();// 2
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyOwnerWithCheclboxIsDisplayed();
		property.propertyEntry.recoveredTab.verifyReleasedToNameIsDisplayed();
		property.propertyEntry.recoveredTab.verifyReleasedToAddressAndCSZIsDisplayed();
		property.propertyEntry.recoveredTab.selectAtDisposition();// 3
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyORIFieldIsDisplayed();
		property.propertyEntry.recoveredTab.selectAtDisposition1();// 4
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyContainerDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyPackageDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.recoveredTab.selectAtDisposition2();// 5
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyContainerDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyPackageDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.selectAtDisposition3();// 6
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyContainerDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyPackageDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.recoveredTab.selectAtDisposition4();// 7
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.verifyContainerDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyPackageDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyUpdate" }) // Vijay
	public void verifyTheUserWithoutHavingThePropertyManagerRoleShouldAbleToReceivePropertyFromLab_255541(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "255541");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.verifyAtStatusUsingPropertyNo();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedByIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.verifyReceivededByIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyAtStatus1UsingPropertyNo();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyUpdate" }) // Vijay
	public void verifyUserWithHavingThePropertyManagerRoleShouldAbleToReceivePropertyFromLabCourt_255540(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "255540");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.verifyAtStatusUsingPropertyNo();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedByIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.verifyReceivededByIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.enterAtReceivedByLastName();
		property.propertyUpdate.propertyUpdatePopup.enterAtReceivedByFirstName();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyAtStatus1UsingPropertyNo();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedByIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.verifyReceivededByIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.enterAtReceivedByPFNo();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyAtStatus2UsingPropertyNo();
	}

	@Test(groups = { "PropertyModuleOtherScreens" }) // Automated by Stalin
	public void PawnDateTimeneedstobeopen_254481(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254481");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Pawn");
		property.switchToPawn();
		property.pawn.clickAddNew();
		property.switchToPawnEntry();
		property.pawnEntry.tabOutDateAndTime();
		property.pawnEntry.selectAtType();
		property.pawnEntry.enterAtEnteredBy();
		property.pawnEntry.switchToMainTab();
		property.pawnEntry.pawnEntryMainTab.selectAtPropertyType();
		property.pawnEntry.pawnEntryMainTab.enterAtDescription();
		property.pawnEntry.switchToDealerTab();
		property.pawnEntry.dealerTab.selectAtDealerID();
		property.pawnEntry.save();
		property.switchToPawnEntry();
		property.pawnEntry.verifyAdditionSuccessfulMessage();
		property.switchToPawnEntry();
		property.pawnEntry.verifyDateAndTimeIsEnabled();
//	property.pawnEntry.enterAtDateAndTime();
		property.pawnEntry.save();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry" }) // Automated by Stalin
	public void Functionalityofsystemparameter760_254487(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254487");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter760AsTrue();

		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtSerial();
		property.propertyEntry.propertyEntryMainTab.selectGunTypeAndTab();
		property.propertyEntry.propertyEntryMainTab.selectGunMake();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.enterAtCaliber();
		property.propertyEntry.propertyEntryMainTab.enterAtQuantity();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.clickOwnerUnknownCheckbox();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.enterAtRecoveredLocation();
		property.propertyEntry.recoveredTab.SelectAtStatus(); // Changed Disposition to Status Method
		property.propertyEntry.recoveredTab.clickInitialStorageLookUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.enterAtDescription();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.clickAtDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyReportDetailsIsDisplayed();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.clickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.verifyAtStatusColumn1(); // Changed Key Status1
		records.switchToCaseUpdate();
		records.caseUpdate.closeTheScreen();
		records.switchToReportManager();
		records.reportManager.Close();
		property.switchToPropertyEditEntry();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Report Search");
		records.switchToReportSearch();
		records.reportSearch.clickDateTimeResetButton();
		records.reportSearch.enterAtFromCaseNo();
		records.reportSearch.clickSearch();
		records.reportSearch.verifyAtTypeInGrid(1);
		records.reportSearch.verifyGridColumnValuesAtStatus();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertySearch" }) // Automated by Stalin
	public void Verifythenamesearchfieldisshowing_254578(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254578");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.enterAtNameID();
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtCase(0);
		property.propertySearch.clickBack();
		property.propertySearch.clickReset();
		property.propertySearch.enterAtLastName();
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtCase(0);
		property.propertySearch.ClickAtCaseNoInGrid();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.verifyAtOwnerLastName();
		property.propertyEntry.closeTheScreen();
		property.switchToPropertySearch();
		property.propertySearch.clickBack();
		property.propertySearch.clickReset();
		property.propertySearch.enterAtFirstName();
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtCase(0);
		property.propertySearch.ClickAtCaseNoInGrid();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.verifyAtOwnerFirstName();
		property.propertyEntry.closeTheScreen();
		property.switchToPropertySearch();
		property.propertySearch.clickBack();
		property.propertySearch.clickReset();
		Playback.waitForPageLoad();
		property.propertySearch.enterAtMiddleName();
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtCase(0);
		property.propertySearch.ClickAtCaseNoInGrid();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.verifyAtOwnerMiddleName();
		property.propertyEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyEntry" }) // Automated by Stalin
	public void Recoveredforotheragencycheckbox_255535(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255535");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.clickRecoverForOtherAgencyCheckBox();
		property.propertyEntry.propertyEntryMainTab.verifyAcknowledgeNIBRSReportable();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();
		property.switchToPropertyEntry();
//	property.propertyEntry.verifyAcknowledgeNIBRSReportable();	//Not Getting the Acknowledgement
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate" }) // Automated by Stalin
	public void TransferPropertytootherofficer_255536(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255536");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.EnterDrugQuantity();
		property.propertyEntry.propertyEntryMainTab.SelectMeasurement();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.TabOutDrugQuantity();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.selectAtPF();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyAtPF();
		property.propertyEntry.recoveredTab.selectAtContainer();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String readPropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyAtPackSeqNo();
		property.propertyEntry.SaveTheScreen();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyAtPackSeqNo();
		property.propertyEntry.closeTheScreen();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.EnterDrugQuantity();
		property.propertyEntry.propertyEntryMainTab.SelectMeasurement();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.TabOutDrugQuantity();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String readPropertyNo1 = property.propertyEntry.readPropertyNo1();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.VerifyAtCaseNo();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.Saveandclose();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByActivePropertyNo(readPropertyNo);
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.verifyStatusRequiredAckMsg();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickCancelButton();
		property.propertyUpdate.clickUpdateCheckboxByActivePropertyNo(readPropertyNo);
		property.propertyUpdate.clickUpdateCheckboxByActivePropertyNo(readPropertyNo1);
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.EnterAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();

	}

	@Test(groups = { "PropertyUpdate1" }) // Automated by Stalin
	public void MovePropertytoEvidenceLocker_255542(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255542");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtQuantity();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.ClickSubmitButton();
		popup.confirm.yes();
		property.switchToPropertyEditEntry();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyByActiveData(PropertyNo);
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyAtCaseNo();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
//		property.propertyUpdate.propertyUpdatePopup.verifyAtActionDropdown();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsSentToPropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.verifyPropertyUpdateAcknowledge(PropertyNo);
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.verifyAtReceivedByPF();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyAtStatusInGrid();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsSentToPropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyAtStatus1InGrid();

	}

	@Test(groups = { "PropertyUpdate1" }) // Automated by Stalin
	public void ToSeeAllstatusofPropertyentry_255543(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255543");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.verifyOfficerIsEnabled();
		property.propertyUpdate.clickSearchButton();
//	property.propertyUpdate.VerifyStatusColumnAsSentToPropertyRoom();
		property.propertyUpdate.verifyAtStatusInGrid();
		property.propertyUpdate.ClickEvidenceCheckbox();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.verifyStorageColumnValuesIsNotNull();
//	property.propertyUpdate.VerifyStatusColumnAsSentToPropertyRoom();
		property.propertyUpdate.verifyAtStatus1InGrid();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate1" }) // Automated by Stalin
	public void SignOptionWithPF_255544(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255544");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickPRIconUsingPropertyNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.TabDataAndTime();
		property.propertyRoomRoles.storageTab.TabOfficer();
		property.propertyRoomRoles.storageTab.SelectAtAction();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.selectRelinquishedSignatureCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.verifyRelinquishedBySignImageIsDisplayed();
		property.propertyRoomRoles.chainTab.EnterAtReceivedBy();
		property.propertyRoomRoles.chainTab.selectReceivedBySignatureCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.verifyReceivedBySignImageIsDisplayed();
		property.propertyRoomRoles.chainTab.clickUpdateButtonWithConfrim();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.CloseScreen();
		property.switchToPropertyUpdate();
		property.propertyUpdate.enterAtPropertyNo1();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.EnterAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.SelectRelinquishedCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedBySignImageIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.selectReceivedCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.verifyReceivedBySignImageIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate1" }) // Sep sprint 6 Automated by Mahesha
	public void VerifyFollowupDateShouldMaintainedSamePropertyStatusChanged_254470(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254470");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickMoreFiltersButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByCaseNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.verifyAtTransPFNo();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickPRIconUsingCaseNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.switchToRecoverdTab();
		property.propertyRoomRoles.propertyRoomRolesRecoveredTab.verifyInitialStrorageLocationIsDisable();
		property.propertyRoomRoles.propertyRoomRolesRecoveredTab.verifyDispositionFieldDisabled();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.enterAtFollowUpDate();
		property.propertyRoomRoles.storageTab.enterAtNotes();
		property.propertyRoomRoles.saveAndClose();
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickUpdateCheckboxByCaseNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.VerifyStorageLocationAsMandateFiled();
		property.propertyUpdate.propertyUpdatePopup.SelectStorageLocationAsL0000000004();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		popup.confirm.yes();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickPRIconUsingCaseNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.verifyAtFollowUpDate();
		property.propertyRoomRoles.storageTab.verifyAtNotes();
	}

	@Test(groups = { "PropertySearch" }) // sprint 6 Mahesha
	public void VerifyClosedPropertyWhenUpdatingReason_254622(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254622");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.selectAtDisposition();
		property.propertySearch.clickSearch();
		property.propertySearch.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.VerifyAtCurrentStatus();
		property.propertyIndex.clickOnMainTab();
		property.propertyIndex.propertyIndexMainTab.selectAtReason();
		property.propertyIndex.saveTheScreen();
		property.switchToPropertyIndex();
		property.propertyIndex.VerifyAtCurrentStatus();
		property.propertyIndex.switchToHistoryTab();
		property.propertyIndex.propertyIndexHistoryTab.verifyStatusChangesInHistory();
		property.switchToPropertyIndex();
		property.propertyIndex.saveNCloseTheScreen();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.VerifyAtCurrentStatus();
	}

	@Test(groups = { "PropertyEntry" }) // Sprint 6 Mahesha
	public void VerifyReleasedToFieldInPropertyEntryScreen_254623(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254623");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.TabOfficer();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtQuantity();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.enterAtReleaseName1();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.SelectName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.propertyEntry.recoveredTab.VerifyAtReleasedLastName();
		property.propertyEntry.recoveredTab.VerifyAtReleasedLastName();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();

	}

	@Test(groups = { "PDFAttachment" }) // Oct Sprint 1 Automated by Mahesha
	public void VerifyLocationSearchIsAbleToPrintBarcodeForMoreThanOneItem_255546(ITestContext testContext)

	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		String testID = null;
		ArrayList<String> LocationDescription;
		testContext.setAttribute(testID, "255546");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Location Search");
		property.switchToLocationSearch();
		property.locationSearch.clickSearchButton();
		LocationDescription = property.locationSearch.selectFirstFewGridRowCheckBoxReadLocationDescription(5);
		property.locationSearch.clickBarcodeBatchPrint();
		property.locationSearch.switchToUnTitleDocumentWindow();
		property.locationSearch.savePDFfileFromUnTitleDocumentWindow();
		property.locationSearch.savePDFtoLocation(testID);
		String Data = property.locationSearch.readDataFromPDF();
		property.locationSearch.verifyBarCodeNamesFromReport(Data, LocationDescription);
		loader.navigateToScreen("Location Search");
		property.switchToLocationSearch();
	}

	@Test(groups = { "PropertyEntry1" }) // Nov Sprint 3 Automated by Mahesha
	public void PropertyEntry_238691(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "238691");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.TabOfficer();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtQuantity();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		String readValue = property.propertyEntry.propertyEntryMainTab.readValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.verifyAtQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
			property.propertyEntry.recoveredTab.verifyAtRecoveredValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.verifyInitialStrorageLocationIsMandatory();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.selectAtContainer();
		property.propertyEntry.recoveredTab.selectAtPackage();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.Saveandclose();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.selectRowByAtPropertyNo(PropertyNo);
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.verifySaveFunctionalityDisabled();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.verifyReasonAndPropertyDisabledToEdit();

	}

	@Test(groups = { "PropertyUpdate" }) // Mithun
	public void PoliceDefect2020_248797(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "248797");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAtProprtyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.ClickOnRecoveredTab();
	property.propertyIndex.propertyIndexRecoveredTab.verifyInitialStrorageLocation();
		property.propertyIndex.closeTheScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickMoreFiltersButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByCaseNo();
		property.propertyUpdate.clickUpdateButton();

		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
		property.propertyUpdate.propertyUpdatePopup.EnterAtReceivedBy();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();

		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyAtStatusUsingPropertyNo();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.ClickOnRecoveredTab();
			property.propertyIndex.propertyIndexRecoveredTab.verifyCurrentStorageLocationEmpty();
		property.propertyIndex.ClickPropertyBblIcon();

		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyInitialStrorageLocation();

	}

	@Test(groups = { "PropertyEntry1" }) // Mithun
	public void VerifySharedLockerAllowingToAssignMultiplePropertyEntries_249233(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249233");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();

		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();

		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumber1AndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectInitialStorageLocation();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();
	}

//Mithun
	@Test(groups = { "PropertyEntry2" })
	public void VerifyCreatingSequencesofSizedProperty10FromIncidentReport_249387(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249387");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.caseSearch.clickSearch();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.selectRowByAtType();
		records.switchToReportManager();
		records.reportManager.selectTypeAsIncidentReport();
		records.reportManager.tabReportedbyPF();
		records.reportManager.tabDateAndTime();
		records.reportManager.VerifyCurrentDate();
		records.reportManager.save();

		records.switchToReportStatus();
		records.reportStatus.verifyLabelStatusOfIncidentReportAsOnHold();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.SelectDrugMeasurement();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.SelectDrugMeasurement();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.SelectDrugMeasurement();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.SelectDrugMeasurement();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.SelectDrugMeasurement();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();

		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.VerifyAtReasonByAtPropertyNo();
		property.propertyEditEntry.closeTheScreen();

	}

	// Mithun
	@Test(groups = { "PropertyEntry" })
	public void VerifyCreatingSequencesofStolenProperty_249388(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249388");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.caseSearch.clickSearch();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.selectRowByAtType();
		records.switchToReportManager();
		records.reportManager.selectTypeAsIncidentReport();
		records.reportManager.tabReportedbyPF();
		records.reportManager.tabDateAndTime();
		records.reportManager.VerifyCurrentDate();
		records.reportManager.ClickSave();

		records.switchToReportStatus();
		records.reportStatus.verifyLabelStatusOfIncidentReportAsOnHold();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsReturnedToOwner();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickCopyButton();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickSubmitButton();

		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.VerifyAtReasonByAtPropertyNo();
		property.propertyEditEntry.closeTheScreen();

	}

	@Test(groups = { "PropertyEntry2" }) // Mithun
	public void Police2020PropertyModule_255531(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255531");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemParameter2001AsUCRNIBRS();

		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();

		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickSaveButton();
		property.propertyEntry.verifyAcknowledgeValue0();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.SaveTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertySearch" })
//Mithun
	public void DefectTestcase_255532(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255532");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.SelectAtStatus();
		property.propertySearch.clickSearch();
		property.propertySearch.clickPRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.TabDataAndTime();
		property.propertyRoomRoles.storageTab.TabOfficer();
		property.propertyRoomRoles.storageTab.SelectAtAction();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.SelectRelinquishedCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.chainTab.EnterAtReceivedBy();
		property.propertyRoomRoles.chainTab.SelectReceivedCheckbox();
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.chainTab.clickUpdateButtonWithConfrim();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.VerifyAtStatus();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate1" })
//Mithun
	public void Police2020PropertyModule_255533(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255533");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");

		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNoAndCount();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.enterAtReceivedByLastName();
		property.propertyUpdate.propertyUpdatePopup.enterAtReceivedByFirstName();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		// property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction1();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.verifyAtReceivedByLastName();
		property.propertyUpdate.propertyUpdatePopup.verifyAtReceivedByFirstName();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickPRIconUsingPropertyNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.VerifyAtRelinquishedBy();
		property.propertyRoomRoles.chainTab.verifyAtRecievedBy();
		property.propertyRoomRoles.chainTab.VerifyActionAsSentToLabInGrid(1);
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.VerifyAtPFCode();
		property.propertyRoomRoles.historyTab.VerifyHistroyAsSentToLab();

	}

	@Test(groups = { "PropertyUpdate1" })
//Mithun
	public void DefectTestCase2020_255537(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255537");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();

		property.propertyUpdate.ClickEvidenceCheckbox();
		property.propertyUpdate.clickSearchButton();

		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.enterRemark();
		property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyEntry.ClickHistoryTab();
		property.propertyEntry.propertyEntryHistoryTab.VerifyHistroyAsMovedPropertyRoom();

	}

	@Test(groups = { "PropertyUpdate1" }) // Mithun
	public void DefectTestcase_255538(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255538");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");

		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectInitialStorageLocation();
		popup.acknowledge.okIfWindowExist();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickEvidenceCheckbox();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByActivePropertyNo(PropertyNo);
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.EnterAtPFNo();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.EnterAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.EnterAtReceivedBy();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "PropertyUpdate1" }) // Mithun
	public void DefectTestcase_255539(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255539");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.verifyAtReceivedByPF();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyAtPropertyNo(0);
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.verifyAtReceivedByPF();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate1" }) // Vijay
	public void verifyPropertyEntryScreenDispositionLabelChangedAsStatus_248836(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "248836");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyStatusAsVisible();
		property.propertyEntry.closeTheScreen();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.propertyEntryMainTab.VerifyValueAs28500();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.selectContainerAsPlasticBag();
		property.propertyEntry.recoveredTab.selectPackageAsSealedPlasticBag();
		property.propertyEntry.recoveredTab.SelectInitialStorageLocationAsL0000000012();
		property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();// Changed
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.updateStatusTab.SelectAtDivision();
		records.reportManager.updateStatusTab.SelectAtSection();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerifyStatsAsApprovedInMenuBar();
		records.reportManager.Close();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.SelectPropertyRowInGrid(0);
		property.switchToPropertyIndex();
		property.propertyIndex.ClickOnRecoveredTab();
		property.propertyIndex.recoveredTab.verifyStatusAsVisible();
		property.propertyIndex.saveTheScreen();
		property.switchToPropertyIndex();
		property.propertyIndex.closeTheScreen();
		records.switchToCaseUpdate();
		records.caseUpdate.closeTheScreen();
//	objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickEvidenceCheckbox();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByCaseNo();
		property.propertyUpdate.clickUpdateButton();
		// property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
//	property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectStorageLocationAsL0000000012();
		property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseConfirmMessage();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickPRIconUsingCaseNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.verifyPropertyStatusAsMovedIntothePropertyRoom();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry1" }) // Mithun
	public void Police2020PropertyModule_254624(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254624");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");

		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();// Changed SelectAtDisposition to
																			// SelectDispositionAsSentToLab
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.SaveTheScreen();

		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.VerifyCurrentStatusAsSentToLab(); // Added
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry1" }) // Q4 Sprint 5 Automate by Mahesha
	public void VerifyPropertyReportAbletoSearchWithStatusFromReportSearchScreenPropertyEntryMadeFromPropertyModule_261093(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261093");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectInitialStorageLocation();
		popup.acknowledge.okIfWindowExist();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveNClose();

		loader.navigateToModule("Records");
		loader.navigateToScreen("Report Search");
		records.switchToReportSearch();
		records.reportSearch.clickDateTimeResetButton();
		records.reportSearch.enterAtFromCaseNo();
		records.reportSearch.SelectStatusAsOnHold();
		records.reportSearch.ClickSearchButton();
		records.reportSearch.VerifyGridColumnStatusAsOnHold();
		records.reportSearch.SelectRowByAtCaseNo();

		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();

		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.Saveandclose();

		records.reportSearch.reloadReportSearchScreen();
		records.reportSearch.clickDateTimeResetButton();
		records.reportSearch.enterAtFromCaseNo();
		records.reportSearch.SelectStatusAsSubmitted();
		records.reportSearch.ClickSearchButton();

		records.reportSearch.verifyGridColumnStatusAsSubmitted();
		records.reportSearch.SelectSubmittedReport();

		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();

		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.Saveandclose();

		property.switchToPropertyEntry();
		property.propertyEntry.verifySaveFunctionalityDisabled();
		property.propertyEntry.closeTheScreen();

		records.switchToReportSearch();
		records.reportSearch.reloadReportSearchScreen();
		records.switchToReportSearch();
		records.reportSearch.clickDateTimeResetButton();
		records.reportSearch.enterAtFromCaseNo();
		records.reportSearch.SelectStatusAsLocked();
		records.reportSearch.SelectStatusAsSubmitted();
		records.reportSearch.ClickSearchButton();
		records.reportSearch.verifyGridColumnStatusAsLocked();
		records.reportSearch.ClickLockedStatusRowInGrid();
		records.switchToReportStatus();
		records.reportStatus.verifyReportStatusAsLocked();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyUpdate1" }) // Mithun's Missed Testcase //Automated by Stalin
	public void updatedispositionasreceivedfromlab_255716(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255716");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
		property.propertyUpdate.propertyUpdatePopup.enterAtRemarks();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsReceivedFromLab();
		property.propertyUpdate.propertyUpdatePopup.EnterAtRelinquisheBy(); // Updated
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.mouseHoverAtRemarksColumnToVerify(0);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry1" }) // Mithun missed testcase //Reviewed By Stalin
	public void Property_255718(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255718");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.verifyContainerDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.verifyPackageDropdownIsDisplayed();
		property.propertyEntry.recoveredTab.SelectContainerAsBottle();
		property.propertyEntry.recoveredTab.SelectPackageAsBottle();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.switchToReportManager();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.switchToReportManager();
		records.reportManager.Saveandclose();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.selectRowByAtReason();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.verifyReasonIsDisabled();
		property.propertyEntry.closeTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry1" }) // Automated by Mithun
	public void Defectestcase2020_254629(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254629");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemParameter2001AsUCRNIBRS();

		loader.navigateToModule("Records");
		loader.navigateToScreen("Walk-In Entry");
		records.switchToWalkInEntry();
		records.walkInEntry.SelectAtJuris();
		records.walkInEntry.enterAtCADCFS();
		records.walkInEntry.tabTheReportedDate();
		records.walkInEntry.tabTheReportedTime();
		records.walkInEntry.enterAtLocation();
		records.walkInEntry.tabTheReceivedSource();
		records.walkInEntry.enterAtCADDispositon();
		records.walkInEntry.enterAtUnit();
		records.walkInEntry.save();
		records.switchToCaseUpdate();
		String CaseNo = records.caseUpdate.readCaseNo();
		records.caseUpdate.clickCaseDataTab();
		records.caseUpdate.caseUpdateCaseDataTab.enterAtCharge();
		records.caseUpdate.caseUpdateCaseDataTab.clickCFSAddButton();
		records.switchToFTC();
		records.fTC.selectAtAttemptedOrCompleted();
		records.fTC.selectAtNIBRS();
		records.fTC.selectCrimeAgainstAsProperty();
		records.fTC.SelectPropertyLossAsStolen();
		records.fTC.saveNClose();

		records.switchToCaseUpdate();
		records.caseUpdate.clickCaseDataTab();
		records.caseUpdate.caseUpdateCaseDataTab.tabOccurredAtDateTime();
		records.caseUpdate.caseUpdateCaseDataTab.selectPoliceForceUsedAsNone();
		records.caseUpdate.caseUpdateCaseDataTab.selectDomesticViolenceAsNo();
		records.caseUpdate.caseUpdateCaseDataTab.saveInternalTab();

		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.TabOutFirstName();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName(); // Changed
		names.nameSearchHelpWindow.verifyPopupNamesBelongsToAnotherJuris(); // Added
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.Saveandclose();

		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.selectAtJuris();
		property.propertySearch.enterFromAndToCaseDetails(CaseNo);
		property.propertySearch.clickSearch();
		property.propertySearch.clickAtCaseNoInGrid(CaseNo);
		property.switchToPropertyIndex();
		property.propertyIndex.verifyAtCaseNo(CaseNo);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "PropertyEntry1" })
	public void PoliceSprintRecord_250093(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250093");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();

		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();

		records.caseUpdate.clickReportingTab();
//    records.caseUpdate.reportingTab.selectRowByAtType();	//comment after run
		records.caseUpdate.reportingTab.clickAddReportButton();
		records.switchToReportManager();
		records.reportManager.selectTypeAsIncidentReport();
		records.reportManager.tabReportedbyPF();
		records.reportManager.tabDateAndTime();
		records.reportManager.Saveandclose(); // uncomment after run
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup(); // only switch method was changed, rest of all same
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		property.propertyEntry.propertyEntryMainTab.TabOutFirstName();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.switchToNamesTab();
		records.caseUpdate.caseUpdateNamesTab.VerifyActivityAsProperty(0);
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.ClickClearName();

		property.propertyEntry.propertyEntryMainTab.enterAtLastName1();
		property.propertyEntry.propertyEntryMainTab.enterAtFirstName1();
		property.propertyEntry.propertyEntryMainTab.TabOutFirstName();
		property.propertyEntry.propertyEntryMainTab.SelectName();
		property.switchToPropertyEntry(); // Added
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickCaseInfoIcon();
		records.switchToCaseUpdate();
//    records.caseUpdate.clickNamesTab();
		records.caseUpdate.switchToNamesTab();
		records.caseUpdate.caseUpdateNamesTab.VerifyActivityAsProperty(0);
	}

	@Test(groups = { "2021DefectTestCases" }) // 2021 defect //Mahesh
	public void VerifyThePropertyEntryScreenAllowsToScanBarcodeRFIDInTextbox_270890(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "270890");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.ClickAddNewPropertyButton();
		property.switchToPropertyEntry();
		property.propertyEntry.enterAtCaseNo();
		property.propertyEntry.VerifyOfficerDetails();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValue();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		property.propertyEntry.propertyEntryMainTab.EnterAtAddress();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtScanBarcodeRFID();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmContainMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.VerifyAdditionSuccessfulMessage();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.clickBatchScanItemsButton();
		property.propertyEntry.recoveredTab.verifyAtScanBarcodeValueInPopupGrid(0);
		property.propertyEntry.recoveredTab.clickCancleButtonRFIDpopup();

	}

	@Test(groups = { "2021DefectTestCases" }) // 2021 defect //Mahesh
	public void VerifyThePropertyEntryScreenAllowsToScanMutipleBarcodeRFIDInTextbox_270891(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "270891");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.ClickAddNewPropertyButton();
		property.switchToPropertyEntry();
		property.propertyEntry.enterAtCaseNo();
		property.propertyEntry.VerifyOfficerDetails();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValue();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		property.propertyEntry.propertyEntryMainTab.EnterAtAddress();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtScanBarcodeRFID();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmContainMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.VerifyAdditionSuccessfulMessage();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.clickBatchScanItemsButton();
		property.propertyEntry.recoveredTab.verifyAtScanBarcodeValueInPopupGrid(0);
		property.propertyEntry.recoveredTab.enterScanBarcodeRFIDPopup();
		property.propertyEntry.recoveredTab.clickUpdateButtonRFIDpopup();
		property.propertyEntry.recoveredTab.clickBatchScanItemsButton();
		property.propertyEntry.recoveredTab.enterScanBarcodeRFIDPopup();
		property.propertyEntry.recoveredTab.clickUpdateButtonRFIDpopup();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBatchScanItemChangedToGreenColor();

	}

	@Test(priority = 1, groups = { "2021DefectTestCases" }) // 2021 sequential 1 defect
	public void Verifyloginpatrolofficerabletosumbitthepropertyreporttosupervisor_272359(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272359");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValue();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String proNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.closeTheScreen();

		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.EnterPropertyNoFromAndTo(proNo);
		property.propertySearch.clickSearch();
		property.propertySearch.VerifyAtProperty(0, proNo);
		property.propertySearch.ClickAtCaseNoInGrid();

		property.switchToPropertyIndex();
		property.propertyIndex.clickReportDetailsButton();

		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsOnHold();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.updateStatusTab.verifySupervisorIsEnabled();
		records.reportManager.updateStatusTab.EnterAtSupervisor();
		records.switchToReportManager();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();

	}

	@Test(priority = 2, groups = { "2021DefectTestCases" }) // 2021 sequential 1 defect Mahesh
	public void VerifytheSupervisorcanabletorejectthepropertyreportinpropertyindexscreen_272360(
			ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272360");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();

		home.myHome.SwitchToMyReportsTab();

		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		// home.myHome.myReportsTab.SelectAtItemType();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.VerifyGridRowInMyReportsTab();
		home.myHome.myReportsTab.SelectRowByAtCaseNo();

		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.SelectActionAsReject();
		records.reportManager.updateStatusTab.SelectRejectionCode();
		records.switchToReportManager();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerfiyStatusAsRejected();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyPropertyEntryInPullRequestIsAbleToUpdateTheActionStatusByPoliceOfficer_263417(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263417");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Pull Request");
		property.switchToPullRequest();
		property.pullRequest.SelectAtReason();
		property.pullRequest.ClickSearchButton();
		property.pullRequest.VerifyStatusAsReadyInGrid();
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterRequestNo("21-000002");
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByCaseNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.VerifyPullRequestScreenUpdateAcknowledgeMessage();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Pull Request");
		property.switchToPullRequest();
		property.pullRequest.ClickAtRequestNoInGrid();
		property.switchToRequestEntry();
		property.requestEntry.ClickAtPropertyNoInGrid();

		property.switchToPropertyUpdateHelpWindow();

		property.propertyUpdateHelpWindow.clickUpdateCheckBoxByIndexInGrid(0);
		property.propertyUpdateHelpWindow.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();

		property.switchToPropertyUpdateHelpWindow();
		property.propertyUpdateHelpWindow.clickUpdateCheckBoxByIndexInGrid(1);
		property.propertyUpdateHelpWindow.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdateHelpWindow();
		property.propertyUpdateHelpWindow.clickUpdateCheckBoxByIndexInGrid(2);
		property.propertyUpdateHelpWindow.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdateHelpWindow();
		property.propertyUpdateHelpWindow.Close();
		property.switchToRequestEntry();
		property.requestEntry.clickRefreshButton();
		property.requestEntry.VerifyStatusAsClosed();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyPullRequestIsAllowingToCreateOneRequestWithMoreThenOnePropertyEntry_263418(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263418");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Pull Request");
		property.switchToPullRequest();
		property.pullRequest.ClickSearchButton();
		property.pullRequest.ClickAddNew();
		property.switchToRequestEntry();
		property.requestEntry.TabDateRequiredandTime();
		property.requestEntry.SelectAtReason();
		property.requestEntry.ClickPropertyLookupIcon();
		property.switchToPropertySearchHelpWindow();
		property.propertySearchHelpWindow.selectMultiplePropertyItemsInGrid(3);
		property.propertySearchHelpWindow.ClickSelectProperty();
		property.switchToRequestEntry();
		property.requestEntry.Save();
		property.switchToRequestEntry();
		property.requestEntry.verifyAdditionSccessful();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyCotainerBarcodeIsAvailableInPropertyScreenWhenPropertyStatusChanged_263419(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263419");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickMoreFiltersButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectStorageLocationAsL0000000012();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyStatusAsMovedIntoThePropertyRoomUsingPropertyNo();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.ClickOnRecoveredTab();
		property.propertyIndex.propertyIndexRecoveredTab.verifyStatusAsDisabled();
		property.propertyIndex.propertyIndexRecoveredTab.verifyBarcodeIsVisible();
		property.switchToPropertyIndex();
		property.propertyIndex.closeTheScreen();
		property.switchToPropertyUpdate();
		property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsSignedOutForCourt();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedByAndReceivedByIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedByPFNo();
		property.propertyUpdate.propertyUpdatePopup.enterReceivedByPFNoAsCadTest();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyStatusColumnAsSignedOutForCourt();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyPropertyEntryIsAbleToSearchByUsingCurrentStorageLocationInPropertyUpdateScreen_263420(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263420");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickMoreFiltersButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation();
		// property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseConfirmMessage();
		// property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		// property.propertyUpdate.propertyUpdatePopup.VerifyLastStorageLocationConfirmMessage();
		// property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.clearPropertyNo();
		property.propertyUpdate.enterAtStorageLocation();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyAtStorage(0);
		property.propertyUpdate.enterAtStorageLocation1();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyNoRecordAcknowledgeMessage();
		property.switchToPropertyUpdate();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyTheSerielChangedToMandatoryWhenPropertySetAsFirearms_263426(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263426");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.verifySerialLabelAsMandatory();
		property.propertyEntry.propertyEntryMainTab.EnterSerial();
		property.propertyEntry.propertyEntryMainTab.selectGunTypeAndTab();
		property.propertyEntry.propertyEntryMainTab.enterQuantityAs10();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.verifySerialLabelAsNonMandatory();
	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyStorageLocationFieldIsShowingAsCodedLookupInPropertyRoomRolesScreenPropertyUpdateScreen_263427(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263427");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter410AsTrue();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.verifyStorageLookUpIconDisplayed();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.verifyStorageLocationLookUpIconDisplayed();
		property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickOnThePRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.verifyStorageLocationLookUpIconDisplayed();
	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyPropertyEntryWithDrugsRelatedPCCodeIsAbleToOpenFromPropertySearch_263428(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263428");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.SelectPCAsACCESS();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValue();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.selectRowByAtPropertyNo(propertyNo);
		property.switchToPropertyEntry();
		property.propertyEntry.verifySaveFunctionalityDisabled();
		property.propertyEntry.closeTheScreen();
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.enterPropertyNobyActiveData(propertyNo);
		property.propertySearch.clickSearch();
		property.propertySearch.SelectRowByActivePropertyNo(propertyNo);
		property.switchToPropertyIndex();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyPropertyEntriesAreAllowingToSearchByDateAndOtherDetails_263429(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263429");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.selectDateSearchByAsReportedDate();
		property.propertySearch.enterAtFromAndToDate();
		property.propertySearch.clickSearch();
		property.propertySearch.verifyRowCountNotEqualToZeroInGrid();
		property.propertySearch.clickBack();
		property.propertySearch.enterAtFromAndToCaseNo();
		property.propertySearch.enterAtOfficerID();
		property.propertySearch.clickSearch();
		property.propertySearch.verifyRowCountNotEqualToZeroInGrid();

	}

	@Test(groups = { "2021DefectTestCasesBatch3" }) // Vijay
	public void verifyPropertyEntryIsAbleToCreateWithDrugsRelatedPropertyCode_263935(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263935");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtQuantity();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.selectRowByAtPropertyNo(propertyNo);
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.VerfiyStatusAsApproved();
	}

	@Test(groups = { "2021DefectTestCasesBatch3" }) // Vijay // Run in Local only
	public void verifyPropertyEntryIsAbleToCreateWithRecoverForAnOtherAgencyDisposition_263936(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263936");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();

		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterQuantityAs10();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.verifyRemarksFieldIsDisplayed();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo = property.propertyEntry.readPropertyNoWithoutSequence();
		property.propertyEntry.ClickSubmitButton();
		property.propertyEntry.VerifyConfirmSubmitMessage();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.VerifyAtStorageUsingReason();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.verifyPropertyReportStatusAsLocked(1);
		records.caseUpdate.reportingTab.selectRowByAtType();
		records.switchToReportStatus();
		records.reportStatus.downloadReport();
		records.reportStatus.saveTheReportToLocation("263936");
		String pdfContent = records.reportStatus.readPDFContent("263936");
		records.reportStatus.verifyPropertyNoInPDFReportByActiveData(pdfContent, propertyNo);
		records.reportStatus.verifyReasonInPDFReport(pdfContent);
		records.reportStatus.verifyDispostionInPDFReport(pdfContent);

	}

	@Test(groups = { "2021DefectTestCasesBatch3" }) // Automated by Mithun
	public void VerifythePropertyentryRecovereddateandtimeisallowingtoenterthedateandtimelessthenoccuredbetweendateandtime_263939(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263939");
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
		records.reportManager.tabDateAndTime();
		records.reportManager.tabReportedbyPF();
		records.reportManager.selectTypeAsIncidentReport();
		records.reportManager.Saveandclose();
		records.switchToReportStatus();
		records.reportStatus.clickCaseDataButton();
		records.switchToACD();
		records.aCD.enterAtCharge();
		records.aCD.clickAddButton();
		records.switchToFTC();
		records.fTC.selectAttemptedCompletedAsCompleted();
		records.fTC.selectAtNIBRS();
		records.fTC.selectAtCrimeAgainst();
		records.fTC.selectAtPropertyLoss();
		records.fTC.saveNClose();
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.clickAddNewPropertyReport();

		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.VerifyOfficerDetails();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
		property.propertyEntry.propertyEntryMainTab.VerifyPropertyTypeAsArticle();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectOwnerName();

		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.EnterDateAndTimeAs07022019();

		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();

		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.propertyEntry.SaveTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2021DefectTestCasesBatch3" })
//Mithun
	public void PoliceSprintProperty_263938(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263938");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyAtCodeValueDescription(1);
//    settings.sharedCodes.verifyCodedValueisInactive(1);
		settings.sharedCodes.closeScreen();

		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsSeized();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.recoveredTab.verifyAtDispositionNotPresent();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2021DefectTestCasesBatch2" }) // Automated by Satlin
	public void AuthorizedTransferStatus_263421(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263421");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedByPFIsEnabled();
		property.propertyUpdate.propertyUpdatePopup.verifyReceivedByPFIsEnabled();
		property.propertyUpdate.propertyUpdatePopup.enterAtReceivedByPFNo();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.switchToHistoryTab();
		property.propertyIndex.propertyIndexHistoryTab.VerifyAtPFCode();
		property.switchToPropertyIndex();
		property.propertyIndex.closeTheScreen();
		property.switchToPropertyUpdate();
		property.propertyUpdate.ClickEvidenceCheckbox();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyAtProperty();
		property.propertyUpdate.verifyAtStatusInGrid();
		property.switchToPropertyUpdate();

	}

//Testcase ID – 263430
	@Test(groups = { "2021DefectTestCasesBatch2" }) // Automated by Stalin 2021 Q1 S2
	public void PropertyRoomRolesScreenShowingCurrentStatus_263430(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263430");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsAircraft();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.ClickOwnerCheckbox();
		property.propertyEntry.recoveredTab.VerifyAtReleasedLastName();
		property.propertyEntry.recoveredTab.VerifyAtReleasedFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.switchToReportManager();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.switchToReportManager();
		records.reportManager.Saveandclose();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.VerifyPRIconViewInGrid(0);

	}

	@Test(groups = { "2021DefectTestCasesBatch3" }) // Automated by Stalin
	public void PropertyColumnInReportDisplayCorrectValue_263932(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263932");
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
		records.reportManager.selectTypeAsIncidentReport();
		records.reportManager.tabReportedbyPF();
		records.reportManager.tabDateAndTime();
		records.reportManager.save();
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterSerial();
		property.propertyEntry.propertyEntryMainTab.selectGunTypeAsMachineGun();
		property.propertyEntry.propertyEntryMainTab.selectGunMake();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.enterAtCaliber();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveNClose();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.closeTheScreen();
		records.switchToReportStatus();
		records.reportStatus.ClickRefreshButton();
		records.reportStatus.downloadReport();
		records.reportStatus.saveTheReportToLocation("263932");
		String readPDFContent = records.reportStatus.readPDFContent("263932");
		records.reportStatus.verifyAtCaliberInPDFReport(readPDFContent);
		records.switchToReportStatus();

	}

//Testcase ID – 263933
	@Test(groups = { "2021DefectTestCasesBatch2" }) // Automated by Stalin 2021 Q1 S3
	public void propertyEntryShowingErrorExistingRecords_263933(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263933");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.enterAtStorageLocation();
		property.propertySearch.clickSearch();
		property.propertySearch.selectRowByIndex(0);
		property.switchToPropertyIndex();
		property.propertyIndex.ClickOnRecoveredTab();
		property.propertyIndex.propertyIndexRecoveredTab.verifyAtInitialStrorageLocationDescription();
		property.switchToPropertyIndex();
		property.propertyIndex.ClickPropertyBblIcon();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyAtInitialStorageLocationDescription();
		property.switchToPropertyEntry();

	}

	@Test(priority = 1, groups = { "2021DefectTestCasesBatch2" }) // Mithun 2021 Sprint 2
	public void Property_263431(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263431");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");

		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNoAndCount();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation();
		popup.confirm.yes();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);
		property.propertyUpdate.VerifyPRIconColorAsGreenUsingStorage();
		property.propertyUpdate.ClickOnThePRIcon(0);
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.TabDataAndTime();
		property.propertyRoomRoles.storageTab.TabOfficer();
		property.propertyRoomRoles.storageTab.SelectAtAction();
		property.propertyRoomRoles.storageTab.enterAtNotes();
		property.propertyRoomRoles.SaveTheScreen();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.verifyAtRecentHistroy();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.verifyDateAndTimeFieldDisabled();
		property.propertyRoomRoles.storageTab.verifyOfficerFieldDisabled();
		property.propertyRoomRoles.storageTab.verifyActionFieldDisabled();
		property.propertyRoomRoles.storageTab.verifyNotesFieldDisabled();
		property.switchToPropertyRoomRoles();

	}

	@Test(priority = 2, groups = { "2021DefectTestCasesBatch2" }) // Mithun 2021 Sprint 2
	public void Property_263432(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263432");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");

		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNoAndCount();
		property.propertyUpdate.ClickIncludeClosedItemsCheckbox();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickOnThePRIcon(0);

		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		String LastAction = property.propertyRoomRoles.storageTab.readLastAction();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToDispositionTab();
		property.propertyRoomRoles.dispositionTab.verifyAtLastActionDateAndTime(LastAction);
		property.propertyRoomRoles.dispositionTab.verifyAtDisposition();

		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchHistoryTab();
		property.propertyRoomRoles.historyTab.verifyAtHistroy();
		property.propertyRoomRoles.historyTab.verifyAtRecentHistroy();
		property.switchToPropertyRoomRoles();

	}

	@Test(groups = { "2021DefectTestCasesBatch2" }) // Mithun 2021 Sprint 2
	public void Property_263433(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263433");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");

		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNoAndCount();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
// property.propertyUpdateHelpWindow.VerifyAtPFNo();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
		popup.confirm.yes();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
		property.propertyUpdate.VerifyAtPropertyStatusInTheGrid();
		property.propertyUpdate.VerifyPRIconColorAsGreenUsingStorage();
		property.propertyUpdate.ClickPRIconUsingPropertyNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToPropertyTab();
		property.propertyRoomRoles.propertyTab.EnterAtSerial();
		property.propertyRoomRoles.propertyTab.EnterAtModel();
		property.propertyRoomRoles.SaveTheScreen();
// property.switchToPropertyRoomRoles();
// property.propertyRoomRoles.SwitchHistoryTab();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.ClickPropertyInfoIcon();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.VerifyAtSerialNo();
		property.propertyEntry.propertyEntryMainTab.VerifyAtModelNo();

	}

	@Test(groups = { "2021DefectTestCasesBatch2" }) // Mithun 2021 Sprint 2
	public void Property_263929(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263929");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();

		property.switchToPropertyEntry();
    property.propertyIndex.propertyIndexRecoveredTab.verifyAtInitialStrorageLocationDescription();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();

		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
//     property.propertyEntry.recoveredTab.verifyAtValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
//     property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseNoConfirmMessage();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.verifyAtValue();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.closeTheScreen();

		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.enterAtPropertyFromAndToFields(PropertyNo);
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtProperty(0, PropertyNo);
		property.propertySearch.ClickAtCaseNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.verifyNotifyEnabled();

	}

	@Test(groups = { "2021DefectTestCasesBatch2" })
//Mithun
	public void Property_263928(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263928");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();

		property.switchToPropertyEntry();
    	property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();

		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.verifyAtRecoveredValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.verifyAt$Value();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeAvaliable();
		property.propertyEntry.closeTheScreen();

		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.enterAtPropertyFromAndToFields(PropertyNo);
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtProperty(0, PropertyNo);
		property.propertySearch.ClickAtCaseNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.verifyNotifyEnabled();
		property.switchToPropertyIndex();
		property.propertyIndex.closeTheScreen();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter912AsYes();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter909AsAdministration();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter206AsMailID();

		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickMainTab();
		personnel.personnelEntry.personnelEntryMainTab.enterEmail1Asrajas();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.save();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.close();

		loader.navigateToModule("CM");
		loader.navigateToScreen("Case Folder");
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.enterAtCaseNo();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.clickAssignmentTab();
		cM.caseFolder.caseFolderAssignmentTab.selectDivision();
		cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
		cM.caseFolder.caseFolderAssignmentTab.selectSection();
		cM.caseFolder.caseFolderAssignmentTab.tabOutPrimeInvestigator();
		cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
		cM.caseFolder.caseFolderAssignmentTab.tabOutNextReviewDate();
		cM.caseFolder.caseFolderAssignmentTab.tabOutNextReportDate();
		cM.switchToCaseFolderScreenTab();
		cM.caseFolder.save();

		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.clickBack();
		property.propertySearch.clickReset();
		property.propertySearch.enterAtPropertyFromAndToFields(PropertyNo);
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtProperty(0, PropertyNo);
		property.propertySearch.ClickAtCaseNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.clickNotifyButton();

		property.switchToNotifyScreen();
		property.notify.verifyAtCaseNoAndPropertyNoInSubject(PropertyNo);
		property.notify.enterDate();
		property.notify.clickSendButton();

	}

	@Test(groups = { "2021DefectTestCasesBatch2" }) // Mithun
	public void Verifythepropertysharedevidencelockerinusefunctionlaity_270901(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "270901");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.recoveredTab.clickInitialStorageLookUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.verifyAtDescription();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2021DefectTestCasesBatch2" }) // Mithun
	public void Verifytheunsharedevidencelockershowinginuseinlookup_270902(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "270902");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.recoveredTab.clickInitialStorageLookUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.verifyAtDescription();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2021DefectTestCasesBatch2" }) // Mithun
	public void Verifytheunsharedevidencelockerisnotallowedtoaccesswithanothercase_270903(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "270903");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.recoveredTab.clickInitialStorageLookUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.verifyAtDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.closeTheScreen();

		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumber1AndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValue();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseNoConfirmMessage();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(priority = 1, groups = { "2021DefectTestCasesBatch2" })
	public void Property_272356(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272356");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();

		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();

		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.EnterPropertyNoFromAndTo(PropertyNo);
		property.propertySearch.clickSearch();
		property.propertySearch.ClickAtPropertyNoInGrid(PropertyNo);
		property.switchToPropertyIndex();
		property.propertyIndex.ClickPropertyBblIcon();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyReportDetailsIsDisplayed();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(priority = 2, groups = { "2021DefectTestCasesBatch2" }) // Automated by Mithun
	public void Property_272357(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272357");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsAircraft();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.propertyEntry.recoveredTab.EnterRemarks();

		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();

		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.EnterPropertyNoFromAndTo(PropertyNo);
		property.propertySearch.clickSearch();
		property.propertySearch.ClickAtPropertyNoInGrid(PropertyNo);
		property.switchToPropertyIndex();
		property.propertyIndex.ClickPropertyBblIcon();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.updateStatusTab.EnterAtSupervisor();
		records.switchToReportManager();
		records.reportManager.save();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(priority = 3, groups = { "2021DefectTestCasesBatch2" }) // Mithun
	public void Property_272358(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272358");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyReportApprovalTab();
		home.myHome.myReportsTab.SelectStatusAsSubmitted();
		home.myHome.myReportsTab.ClickSearchButton();
		home.myHome.myReportsTab.SelectRowByAtCaseNo();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerfiyStatusAsApproved();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2021DefectTestCasesBatch3" }) // Automated by Mithun//Mohan
	public void PoliceSprint2021Record_265271(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265271");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.clickAddReportButton();
		records.switchToReportManager();
		records.reportManager.selectAsSupplementReport();
		records.reportManager.tabReportedbyPF();
		records.reportManager.tabReportedbyPF();

		records.reportManager.Saveandclose();
		records.switchToReportStatus();
		records.reportStatus.clickCaseDataButton();

		records.switchToACD();
		records.aCD.enterAtCharge();
		records.aCD.clickAddButton();
		records.switchToFTC();
		records.fTC.selectAtAttemptedOrCompleted();
		records.fTC.selectAtCrimeAgainst();
		records.fTC.saveNClose();
		records.switchToACD();
		records.aCD.TaboutOccuredAT();
		records.aCD.SelectPoliceForceUsedAsNone();
		records.aCD.SelectDomesticViolanceAsNo();
		records.aCD.Save();
		records.aCD.enterAtCharge1();
		records.aCD.clickAddButton();
		records.switchToFTC();
		records.fTC.selectAtAttemptedOrCompleted();
		records.fTC.selectAtCrimeAgainst();
		records.fTC.saveNClose();
		records.switchToACD();
		records.aCD.EnterAtCharge2();
		records.aCD.clickAddButton();
		records.switchToFTC();
		records.fTC.selectAtAttemptedOrCompleted();
		records.fTC.selectAtCrimeAgainst();
		records.fTC.selectAtPropertyLoss();
		records.fTC.selectAtLocationType();
		records.fTC.selectAtSuspectedOfUsing();
		records.fTC.saveNClose();
		records.switchToACD();
		records.aCD.enterAtCharge();
		records.aCD.clickAddButton();
		records.switchToFTC();
		records.fTC.selectAtAttemptedOrCompleted();
		records.fTC.selectAtCrimeAgainst();
		records.fTC.selectAtPropertyLoss();
		records.fTC.selectAtLocationType();
		records.fTC.selectAtSuspectedOfUsing();
		records.fTC.saveNClose();
		records.switchToACD();
		records.aCD.clickSave();

		records.switchToReportStatus();
		records.reportStatus.clickReportDetails();

	}

	@Test(groups = { "2021DefectTestCasesBatch3" }) // Automated by Mithun
	public void Verifythatthereportpropertyentryismovedtopropertymodulebeforeapproved_263931(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263931");
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
		records.reportManager.tabReportedbyPF();
		records.reportManager.selectAtType();
		records.reportManager.tabDateAndTime();
		records.reportManager.Saveandclose();
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.ClickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.verifyAtPropertyNo(PropertyNo, 0);
		records.caseUpdate.caseUpdatePropertyTab.SelectPropertyRowInGrid(0);
		property.propertyIndex.clickOnMainTab();
		property.propertyEntry.propertyEntryMainTab.enterAtSerial();
		property.propertyEntry.SaveNClose();
		records.switchToCaseUpdate();
		records.caseUpdate.closeTheScreen();
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.VerifyPropertyNo(PropertyNo, 0);
	}

	@Test(groups = { "2021DefectTestCasesBatch3" }) // Automated By Mithun
	public void Veirfythatthepropertyentryinitiatedoutsideofthereportentryismovedtoreportentrydefault_263930(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263930");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsDrugsNarcotics();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs12345607();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectDispositionAsSentToLab();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickCaseInfoIcon();
		records.switchToCaseUpdate();
		records.caseUpdate.clickReportingTab();
		records.caseUpdate.reportingTab.clickAddReportButton();
		records.switchToReportManager();
		records.reportManager.tabReportedbyPF();
		records.reportManager.selectAtType();
		records.reportManager.tabDateAndTime();
		records.reportManager.Saveandclose();
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.verifyPropertyListedInGrid();
	}

	@Test(groups = { "2021DefectTestCasesBatch4" }) // Automated by Mithun //Mithun
	public void VerifyPropertyentryisallowingtoenterquanitityfrommaintab_263941(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263941");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
    property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.VerifyValueAs000();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2021DefectTestCasesBatch4" }) // Automated by Mithun //Mithun
	public void Verifypropertybarcodeisabletogenerateasdifferentfromsequencenumber_263940(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263940");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");

		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtReason1();
		property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
		property.propertyEntry.propertyEntryMainTab.VerifyPropertyTypeAsVehicle();
		property.propertyEntry.propertyEntryMainTab.SelectPlateNumber();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.propertyEntryMainTab.enterOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.propertyEntryMainTab.VerifyValueAs000();
		property.propertyEntry.ClickAddNewButton();
		Playback.pageLoadThreadWait();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterQuantity();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();

		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed();
		property.switchToPropertyEntry();
		property.propertyEntry.clickReportDetailsButton();

		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsOnHold();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
		records.reportManager.save();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.save();
		records.reportManager.VerfiyStatusAsApproved();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed();

	}

	@Test(groups = { "2021DefectTestCasesBatch4" })
	public void DeleteAudit_263312(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263312");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Audit Search");
		property.switchToAuditSearch();
		property.auditSearch.ClickAddNew();
		property.switchToAuditEditEntry();
		property.auditEditEntry.SelectAtAuditType();
		property.auditEditEntry.EnterAuditDateTime();
		property.auditEditEntry.VerifyAuditCurrentDateTime();
		property.auditEditEntry.SelectAtProperty();
		property.auditEditEntry.ClickCreateAuditButton();
		property.auditEditEntry.SelectAtLocationTab();
		property.auditEditEntry.ClickStatusAsNotAudit();
		property.auditEditEntry.ClickTransmitButton();
		property.auditEditEntry.VerifyStatusAsAuditedInTheGrid();
		property.auditEditEntry.VerifyAuditBalance(Playback.getTestContextAttribute("uIAuditBalance"));
		property.auditEditEntry.SelectRowAtStatus();
		property.auditEditEntry.ClickTransmitButton();
		property.auditEditEntry.VerifyAcknowledgePropertyIsAlreadyAudited();
		property.switchToAuditSearch();
		property.auditSearch.VerifyAddNewDisabled();
		property.switchToAuditEditEntry();
		property.auditEditEntry.ClickLocationCompletedCheckBox();
		property.auditEditEntry.EnterAtAcceptedBy();
		property.auditEditEntry.EnterAcceptedDateTime();
		property.auditEditEntry.VerifyAcceptedCurrentDateTime();
		property.auditEditEntry.SaveAndClose();
		property.switchToAuditSearch();
		property.auditSearch.VerifyAddNewEnabled();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Access Log");
		settings.switchToAcessLog();
		settings.accessLog.tabTheFromDateAndTime();
		settings.accessLog.verifyCurrentDateAsFrom();
		settings.accessLog.tabTheToDateAndTime();
		settings.accessLog.verifyCurrentDateAsTo();
		settings.accessLog.enterAtPFCode();
		settings.accessLog.clickSearch();
		settings.accessLog.verifyActivityDateAsCurrentDate(0);

	}

	@Test(groups = { "2021DefectTestCasesBatch4" })
	public void BicycleRegistrationInactiveNumber_263313(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263313");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Bicycle Registration");
		property.switchToBicycleRegistration();
		property.bicycleRegistration.EnterAtRegistrationNo();
		property.bicycleRegistration.ClickIncludeInactive();
		property.bicycleRegistration.ClickSearchButton();
		property.bicycleRegistration.VerifyRowViewedGrayColor();

	}

	@Test(groups = { "2021DefectTestCasesBatch4" }) // Mithun
	public void VerifyLocationSearchAbleeToPrintMultipleBarcode_263314(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263314");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Location Search");
		property.switchToLocationSearch();
		property.locationSearch.EnterAtLocation();
		property.locationSearch.clickSearchButton();
		property.locationSearch.clickBarcodeBatchPrint();
		property.switchToLocationSearch();
		property.locationSearch.EnterAtLocation1();
		property.locationSearch.clickSearchButton();
		property.locationSearch.clickBarcodeBatchPrint();
		property.switchToLocationSearch();
		property.locationSearch.EnterAtLocation2();
		property.locationSearch.clickSearchButton();
		property.locationSearch.clickBarcodeBatchPrint();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2021DefectTestCasesBatch4" }) // Vijay
	public void verifyWhetherCreatedDateTimeModifiedDateTimeForAPropertyAppearsSameInDatabase_272380(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "272380");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType();
		property.propertyEntry.propertyEntryMainTab.SelectAtMeasurement();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.EnterAtDrugPanelQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveNClose();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickAtResaonInGrid();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtDrugType2();
		property.propertyEntry.SaveNClose();
		property.switchToPropertyEditEntry();
	}

	@Test(groups = { "2021DefectTestCasesBatch4" }) // Vijay
	public void verifySystemDisplaysCorrectPropertyDetailsWhenEnteringBarcodeInPropertyStorageLocationScreen_272381(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "272381");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Storage Location Update");
		property.switchToStorageLocationUpdate();
		property.storageLocationUpdate.enterAtScanBarCode();
		property.storageLocationUpdate.verifyAtDescription();
		property.storageLocationUpdate.clickResetButton();
		property.storageLocationUpdate.enterAtScanBarCode1();
		property.storageLocationUpdate.verifyAtDescription1();
	}

	@Test(groups = { "2021DefectTestCasesBtach4" }) // Vijay
	public void verifySharedNotSharedEvidenceLockerUsingInPropertyUpdateScreen_272997(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "272997");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByActivePropertyNo(PoliceData.getPropertyModuleValue("PropertyNo"));
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.clickStorageLocationLookUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.enterAtCode();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.clickAtDescription();
		popup.kPICodedLookup.verifyEvidenceLockerAcknowledgeMessage();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		popup.confirm.yes();
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickUpdateCheckboxByActivePropertyNo(PoliceData.getPropertyModuleValue("PropertyNo1"));
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.clickStorageLocationLookUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.enterAtCode1();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.clickAtDescription1();
		popup.kPICodedLookup.verifyEvidenceSharedAcknowledgeMessage();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
		popup.confirm.yes();
		property.switchToPropertyUpdate();
	}

	@Test(groups = { "2021DefectTestCasesBtach4" }) // Mahesha
	public void VerifytheStatutoryLimitationReachedcheckboxShouldenableinpropertyUpdatescreen_263424(
			ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263424");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyAtPropertyNo(0);
		property.propertyUpdate.clickStatutoryLimitationReachedCheckBoxIfNotSelected();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyNoRecordAcknowledgeMessage();
		property.switchToPropertyUpdate();
		property.propertyUpdate.uncheckStatutoryLimitationReachedCheckBox();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyAtPropertyNo(0);
	}
	//Automated By TesterName:- Mithun A Date:-18-08-2021	Sprint:-4
	@Test() 
	public void VerifythePropertybarcodeisdisplayedasgivenformatandscanthebarcodeusingscanner_201033(ITestContext testContext) throws IOException {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "201033");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
//		loader.navigateToModule("Settings");
//	  	loader.navigateToScreen("System Parameter");
//	  	settings.switchToSystemParamter();
//	  	settings.sysParameter.setSystemparameter428AsPattern();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
//		property.propertyEditEntry.clickAddNewPropertyReport();
		property.propertyEditEntry.SelectRowFromGrid();
//		property.switchToPropertyEntry();
//		property.propertyEntry.clickMainTab();
//		property.propertyEntry.propertyEntryMainTab.selectAtReason();
//		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
//		property.propertyEntry.propertyEntryMainTab.enterDescription();
//		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
//		property.propertyEntry.clickRecoveredTab();
//		property.propertyEntry.recoveredTab.tabDateAndTime();
//		property.propertyEntry.recoveredTab.tabOutQuantity();
//		property.propertyEntry.recoveredTab.tabOutValue();
//		property.propertyEntry.recoveredTab.selectAtDisposition();
//		property.propertyEntry.recoveredTab.EnterRemarks();
//		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
//		property.switchToPropertyEntry();
//		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
//		property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed1();
		property.switchToPropertyEntry();
		
	}
	
	//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property .
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void Police2019PropertyModule_216168(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "216168");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Update");
			property.switchToPropertyUpdate();
	        property.propertyUpdate.clickExpandButton();
	        property.propertyUpdate.enterAtPropertyNo();
	        property.propertyUpdate.clickSearchButton();
	        property.propertyUpdate.VerifyAtPropertyNo(0);
	        property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	        property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
	        property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation(); 
	        property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseConfirmMessage(); // Action Updated 
	        Playback.controlReadyThreadWait();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
	        property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);
	        property.propertyUpdate.veriyStatusColumnValuesAsDimGrayColor(0);   //
	        String StorageLocation = property.propertyUpdate.readStorageLocationInGrid(0);
	        property.propertyUpdate.ClickAtPropertyNoInGrid();
	        property.switchToPropertyIndex(); 
	        
	        property.propertyEntry.verifyAtPropertyNo();
	        
	        property.propertyEntry.clickRecoveredTab();
	        property.propertyEntry.recoveredTab.VerifyAtDisposition();
	        property.propertyEntry.recoveredTab.verifyActiveStorageLocationDescription(StorageLocation);
	        property.propertyEntry.recoveredTab.VerifyBarCodeAvaliable();
	        property.switchToPropertyIndex();
	        property.propertyEntry.closeTheScreen();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	        property.propertyUpdate.propertyUpdatePopup.SelectActionAsSignedOutForCourt();
	        property.propertyUpdate.propertyUpdatePopup.EnterAtReceivedBy();
	        property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
	        property.propertyUpdate.propertyUpdatePopup.VerifyRelinquishedReceivedByOfficersIdenticalConfirmMessage();
	        popup.confirm.yes();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.verifyAtStatusUsingPropertyNo();
	        property.propertyUpdate.ClickAtPropertyNoInGrid();
	        property.switchToPropertyIndex();
	        property.propertyEntry.clickRecoveredTab();
	        property.propertyEntry.recoveredTab.VerifyAtDisposition();
	        property.propertyEntry.recoveredTab.VerifyBarCodeAvaliable();
	        property.switchToPropertyIndex();
	        property.propertyEntry.closeTheScreen();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	        property.propertyUpdate.propertyUpdatePopup.SelectActionAsReceivedFromCourt();
	        property.propertyUpdate.propertyUpdatePopup.SelectReceivedBy();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.VerifyPropertyStatusInTheGridAsReceivedfromCourt(0);
	        property.propertyUpdate.veriyStatusColumnValuesAsDimGrayColor(0); //
	        property.propertyUpdate.ClickAtPropertyNoInGrid();
	        property.switchToPropertyIndex();
	        property.propertyEntry.verifyAtPropertyNo(); //
	        property.propertyEntry.clickRecoveredTab();
	        property.propertyEntry.recoveredTab.VerifyAtDisposition();
	        property.propertyEntry.recoveredTab.VerifyBarCodeAvaliable();
	        property.switchToPropertyIndex();
	        property.propertyEntry.closeTheScreen();  
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	        property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
	        property.propertyUpdate.propertyUpdatePopup.VerifyLastStorageLocationConfirmMessage();   //Action Updated 
	        property.switchToPropertyUpdate(); //if needed we can uncomment
//	        property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseNoConfirmMessage(); // error detected by dinesh
	        property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation(); // modified by dinesh
	        property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseConfirmMessage();
	        Playback.controlReadyThreadWait();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.propertyUpdatePopup.ClickUpdateButton();
	        property.propertyUpdate.propertyUpdatePopup.VerifyRelinquishedReceivedByOfficersIdenticalConfirmMessage();
	        popup.confirm.yes();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);
	        property.propertyUpdate.veriyStatusColumnValuesAsDimGrayColor(0);
	        String readStorageLocationInGrid = property.propertyUpdate.readStorageLocationInGrid(0);
	        property.propertyUpdate.ClickAtPropertyNoInGrid();
	        property.switchToPropertyIndex();
	        property.propertyEntry.clickRecoveredTab();
	        property.propertyEntry.recoveredTab.VerifyAtDisposition();
	        property.propertyEntry.recoveredTab.verifyActiveStorageLocationDescription(readStorageLocationInGrid);
	        property.propertyEntry.recoveredTab.VerifyBarCodeAvaliable();
	        property.switchToPropertyIndex();
		}

	
	//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property . run on 87
		@Test(groups = {"PropertyFunctionalBatch3"})
		public void Police2019PropertyModule_216169(ITestContext testcontext){
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "216169");
	        Browser.NavigateToLoginScreen();
	        login.loginScreen.Logon();
	        loader.navigateToModule("Property");
	        loader.navigateToScreen("Property Edit/Entry");
	        property.switchToPropertyEditEntry();
	        property.propertyEditEntry.enterAtCaseNumberAndTab();
	        property.propertyEditEntry.clickAddNewPropertyReport();
	        property.switchToPropertyEntry();
	        property.propertyEntry.verifyAtCaseNo();
	        property.propertyEntry.clickMainTab();
	        property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
	        property.propertyEntry.propertyEntryMainTab.selectAtReason();
	        property.propertyEntry.propertyEntryMainTab.selectAtProperty();
	        property.propertyEntry.propertyEntryMainTab.SelectPCAsACCESS();
	        property.propertyEntry.propertyEntryMainTab.VerifyPropertyTypeArticle();
	        property.propertyEntry.propertyEntryMainTab.enterDescription();
	        property.propertyEntry.propertyEntryMainTab.EnterValueAs100(); 
	        property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
	        property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
	        names.switchToNameSearchHelpWindow();
	        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName(); 
	        property.switchToPropertyEntry(); 
	        property.propertyEntry.SaveTheScreen(); 
	        property.propertyEntry.VerifyAdditionSuccessfulMessage();
	        property.switchToPropertyEntry();
	        property.propertyEntry.ClickAddNewButton(); 
	        property.propertyEntry.clickMainTab();
	        property.propertyEntry.propertyEntryMainTab.SelectAtReason1();
	        property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
	        property.propertyEntry.propertyEntryMainTab.enterDescription();
	        property.propertyEntry.propertyEntryMainTab.enterAtPlateNumber();
	        vehicle.switchToVehicleBoatEntry();
	        vehicle.vehicleBoatEntry.clickSelectButton();
	        property.switchToPropertyEntry();
	        property.propertyEntry.propertyEntryMainTab.enterValue();
	        property.propertyEntry.clickRecoveredTab();
	        property.propertyEntry.recoveredTab.tabDateAndTime();
	        property.propertyEntry.recoveredTab.tabOutQuantity();
	        property.propertyEntry.recoveredTab.tabOutValue();
	        property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
	        property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
	        property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
	        property.switchToPropertyEntry();
	        property.propertyEntry.SaveTheScreen();
	        property.switchToPropertyEntry();
	        property.propertyEntry.VerifyAdditionSuccessfulMessage();
	        property.propertyEntry.clickRecoveredTab();
	        property.propertyEntry.recoveredTab.VerifyBarCodeAvaliable();
//	      property.propertyEntry.recoveredTab.ClickBarCode(); // done by dinesh
//	      property.propertyEntry.recoveredTab.CloseTheBarcodeScreen(); //done by dinesh, error ditected by dinesh
//	      property.switchToPropertyEntry(); // done by dinesh
	        property.switchToPropertyEntry();
	    }
		
		//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property .ran on 87.passed
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void Police2019PropertyModule_213956(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "213956");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Update");
			property.switchToPropertyUpdate();
	        property.propertyUpdate.clickExpandButton();
	        property.propertyUpdate.EnterAtCaseNo();
	        property.propertyUpdate.VerifyCaseInfoButton();
	        property.propertyUpdate.clickSearchButton();
	        property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.propertyUpdatePopup.VerifyAtEMPPFNo();
	        property.propertyUpdate.propertyUpdatePopup.verifyAtEMPPFDescription();
	        property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	        property.propertyUpdate.propertyUpdatePopup.SelectAtAction();
	        property.propertyUpdate.propertyUpdatePopup.EnterAtPFNo();
	        property.propertyUpdate.propertyUpdatePopup.enterAtRemarks();
	        property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
	        Playback.controlReadyThreadWait();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.verifyAtStatusUsingPropertyNo();
	        property.propertyUpdate.mouseHoverAtRemarksColumnToVerify(1);
	        property.switchToPropertyUpdate();
	        
		}
		
		//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property .
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void Police2019PropertyModule_213953(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "213953");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Pull Request");
			property.switchToPullRequest();
	        property.pullRequest.VerifyRequestedByEnabled();
	        property.pullRequest.ClickSearchButton();
//	        property.pullRequest.VerifyStatusAsOpenInGrid(); // done by dinesh
//	        property.pullRequest.VerifyRequiredDateAsCurrentDateInGrid(); // error detected by dinesh,done by dinesh
//	        property.pullRequest.ClickRequiredDateASCurrentDateInGrid(); //done by dinesh
	        property.pullRequest.ClickAtRequestNoInGrid(); // added by dinesh
	        property.switchToRequestEntry();
	        property.requestEntry.VerifyStatusAsOpen();
	        property.requestEntry.VerifyAtRequestedBy();
//	        property.requestEntry.VerifyDateRequestedAsCurrentDate(); // done by diensh
	        property.requestEntry.ClickAtPropertyNoInGrid();
	        property.switchToPropertyRoomRoles();
	        property.propertyRoomRoles.SwitchToStorageTab();
	        property.propertyRoomRoles.storageTab.TabDataAndTime();
	        property.propertyRoomRoles.storageTab.TabOfficer();				
	        property.propertyRoomRoles.storageTab.SelectActionAsTOFTransferOutToAnOfficer(); // method added  and implimented by dinesh
	        property.propertyRoomRoles.storageTab.enterAtStorageLocation(); // added by dinesh
	        property.propertyRoomRoles.storageTab.VerifyEvidenceLockerUseConfirmMessage();
	        property.switchToPropertyRoomRoles();
	        property.propertyRoomRoles.chainTab.VerifyAtRelinquishedBy();
	        property.propertyRoomRoles.chainTab. SelectAtReceivedByInGrid(); // altered by dinesh
	        property.propertyRoomRoles.chainTab.ClickUpdateButton();
//	        popup.confirm.yes(); // altered by Dinesh
	        property.switchToPropertyRoomRoles();
	        property.propertyRoomRoles.VerifyAtStatus();
//	        property.propertyRoomRoles.SaveTheScreen(); // done by dinesh
	        property.switchToPropertyRoomRoles(); 
//	        property.propertyRoomRoles.VerifyAtStatus(); // done by dinesh
	        property.propertyRoomRoles.CloseScreen();
	        property.switchToRequestEntry();
	        property.requestEntry.ClickAtPropertyNo1InGrid();
	        property.switchToPropertyRoomRoles();
	        property.propertyRoomRoles.SwitchToStorageTab();
	        property.propertyRoomRoles.storageTab.TabDataAndTime();
	        property.propertyRoomRoles.storageTab.TabOfficer();
	        property.propertyRoomRoles.storageTab.SelectAtAction();
	        property.propertyRoomRoles.storageTab.enterAtStorageLocation(); // altered by diensh
	        property.propertyRoomRoles.storageTab.VerifyEvidenceLockerUseConfirmMessage();
	        property.switchToPropertyRoomRoles();
	        property.propertyRoomRoles.chainTab.VerifyAtRelinquishedBy();
	        property.propertyRoomRoles.chainTab.SelectReceivedBy(); // altered by diensh
	        property.propertyRoomRoles.chainTab.ClickUpdateButton();
//	        popup.confirm.yes(); // altered by diensh
	        property.switchToPropertyRoomRoles();
//	        property.propertyRoomRoles.SaveTheScreen(); // done by dinesh
	        property.switchToPropertyRoomRoles();
//	        property.propertyRoomRoles.VerifyAtStatus(); // done by dinesh
	        property.propertyRoomRoles.CloseScreen();
	        property.switchToRequestEntry();
	        property.requestEntry.TabAcceptedBy();
	        property.requestEntry.TabAcceptedDateTime();
	        property.requestEntry.Save();
	        property.switchToRequestEntry();
	        property.requestEntry.VerifyStatusAsReady();
	        property.requestEntry.CloseScreen();
	        property.switchToPullRequest();
	        property.pullRequest.ClickSearchButton();
	        property.pullRequest.VerifyStatusAsReadyInGrid();
	        property.pullRequest.VerifyRequiredDateAsCurrentDateInGrid();
		}
		
			//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property . 
		@Test(groups = { "PropertyFunctionalBatch3" })
			public void Police2019PropertyModule_213954(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "213954");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContext();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Pull Request");
			property.switchToPullRequest();
//	       property.pullRequest.VerifyRequestedByEnabled(); //  
	        property.pullRequest.verifyAtRequestedBy();
	        property.pullRequest.ClickSearchButton();
	        property.pullRequest.verifyStatusAsOnHoldInGrid();
	        property.pullRequest.selectRowByStatusAsOnHold();
		      property.switchToRequestEntry(); 
	       // property.requestEntry.VerifyStatusAsReady();
		     property.requestEntry.verifyStatusAsOnHoldInMenuBar();
		      property.requestEntry.VerifyDateRequestedAsCurrentDate(); 
	        String requestNo = property.requestEntry.getRequestNo();
	        property.requestEntry.CloseScreen();
	        objectIdentification.windowHandle.switchToMainWindow();
	        loader.navigateToScreen("Property Update");
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.clickExpandButton();
	        property.propertyUpdate.EnterRequestNo("requestNo");
	        property.propertyUpdate.clickSearchButton();
	        property.propertyUpdate.verifyAtStatusUsingPropertyNo();
	        property.propertyUpdate.VerifyAtStatusUsingPropertyNo1();
	        property.propertyUpdate.ClickSelectAllCheckbox();
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.VerifyPullRequestScreenUpdateAcknowledgeMessage();
	        objectIdentification.windowHandle.switchToMainWindow();
	        loader.navigateToScreen("Pull Request");
	        property.switchToPullRequest();
	        property.pullRequest.ClickRequestNoInGrid("requestNo");
	        property.switchToRequestEntry();
	        property.requestEntry.ClickAtPropertyNoInGrid();
	        property.switchToPropertyUpdateHelpWindow();
	        property.propertyUpdate.ClickSelectAllCheckbox();
	        property.propertyUpdateHelpWindow.ClickTheProceedWithSelectionButton();
	        property.propertyUpdateHelpWindow.TabTheDateAndTime();
	        property.propertyUpdateHelpWindow.SelectAtAction();
	        property.propertyUpdateHelpWindow.VerifyAtPFNo();
	        property.propertyUpdateHelpWindow.ClickUpdateButtonWithConfrim();
	        property.switchToPropertyUpdateHelpWindow();
	        property.propertyUpdateHelpWindow.Close();
	        property.switchToRequestEntry();
	        property.requestEntry.VerifyStatusAsClosed();
	        property.requestEntry.CloseScreen();
	        property.switchToPullRequest();
	        property.pullRequest.ClickSearchButton();
	        property.pullRequest.VerifyStatusAsClosedInGrid();
	    }
		
		//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property .passed on 87.
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void Police2019PropertyModule_213955(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "213955");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Edit/Entry");
			property.switchToPropertyEditEntry();
	        property.propertyEditEntry.enterAtCaseNumberAndTab();
	        property.propertyEditEntry.clickAddNewPropertyReport();
	        property.switchToPropertyEntry();
	        property.propertyEntry.verifyAtCaseNo();
	        property.propertyEntry.clickMainTab();
	        property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
	        property.propertyEntry.propertyEntryMainTab.selectAtReason();
	        property.propertyEntry.propertyEntryMainTab.selectAtProperty();
	        property.propertyEntry.propertyEntryMainTab.SelectPCAsACCESS();
	        property.propertyEntry.propertyEntryMainTab.VerifyPropertyTypeArticle();
	        property.propertyEntry.propertyEntryMainTab.enterDescription();
	        property.propertyEntry.propertyEntryMainTab.enterValue();
	        property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
	        property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
	        names.switchToNameSearchHelpWindow();
	        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName(); 
	        property.switchToPropertyEntry();
	        property.propertyEntry.clickRecoveredTab();
	        property.propertyEntry.recoveredTab.tabDateAndTime();
	        property.propertyEntry.recoveredTab.tabOutQuantity();
	        property.propertyEntry.recoveredTab.tabOutValue();
	        property.propertyEntry.recoveredTab.selectAtDisposition();
	        property.propertyEntry.recoveredTab.EnterRemarks();
	        property.switchToPropertyEntry();
	        property.propertyEntry.SaveTheScreen();
	        property.switchToPropertyEntry();
	        property.propertyEntry.VerifyAdditionSuccessfulMessage();
	        String PropertyNo=property.propertyEntry.readPropertyNo(); 
	        property.propertyEntry.clickMainTab(); 
	        property.propertyEntry.propertyEntryMainTab.VerifyPCfieldAsACCESS(); 
	        property.switchToPropertyEntry();
	        property.propertyEntry.ClickSubmitButton();
	        property.propertyEntry.VerifyConfirmSubmitMessage(); 
	        property.switchToPropertyEditEntry();
	        property.propertyEditEntry.VerifyPropertyNo(PropertyNo, 0); 
	        property.propertyEditEntry.verifyAtStorageInGrid(0); 
	        property.propertyEditEntry.VerifyAtReason(0);
	        property.switchToPropertyEditEntry();
//	        property.propertyEditEntry.VerifyClosedCheckboxCheckedUsingReason(); 
		}
		
		
		//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property .ran on 87.passed
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void Police2019PropertyModule_212271(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "212271");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContext();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Pull Request");
			property.switchToPullRequest();
	        property.pullRequest.VerifyRequestedByFieldDisabled();
	        property.pullRequest.verifyAtRequestedBy();
	        property.pullRequest.ClickAddNew();
	        property.switchToRequestEntry();
	       // property.requestEntry.VerifyStatusAsOpen();
	        property.requestEntry.VerifyAtRequestedBy();
	        property.requestEntry.VerifyDateRequestedAsCurrentDate();
	        property.requestEntry.TabDateRequiredandTime();
	        property.requestEntry.SelectAtReason();
	       // property.requestEntry.ClickPropertyLookupIcon();
	        property.requestEntry.ClickPropertyLookupIcon(); //Updated UI
	        property.switchToPropertySearchHelpWindow();
	        property.propertySearchHelpWindow.clickSearchButton();
	        property.propertySearchHelpWindow.ClickAtProprtyNoRowCheckbox();
	        property.propertySearchHelpWindow.ClickAtProprtyNo1RowCheckbox();
	        property.propertySearchHelpWindow.ClickSelectProperty();
	        property.switchToRequestEntry();
	        property.requestEntry.VerifyAtPropertyNo1InGrid(0); //Updated Table UI For 93
	        property.requestEntry.VerifyAtPropertyNoInGrid(1);
	        property.requestEntry.Save();
	        property.switchToRequestEntry();
	        property.requestEntry.verifyAdditionSccessful();
	        property.requestEntry.verifyStatusAsOnHoldInMenuBar();
	        property.requestEntry.CloseScreen();
	        property.switchToPullRequest();
	        property.pullRequest.ClickSearchButton();
	       // property.pullRequest.VerifyStatusAsOpenInGrid();
	        property.pullRequest.verifyStatusAsOnHoldInGrid();
	        property.pullRequest.VerifyRequiredDateAsCurrentDateInGrid();
	        property.switchToPullRequest();
		}
		
		//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property .
		@Test(groups = { "PropertyFunctionalBatch3"})
		public void Police2019PropertyModule_203114(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "203114");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Edit/Entry");
			property.switchToPropertyEditEntry();
	        property.propertyEditEntry.enterAtCaseNumberAndTab();
	        property.propertyEditEntry.clickAddNewPropertyReport();
	        property.switchToPropertyEntry();
	        property.propertyEntry.verifyAtCaseNo();
	        property.propertyEntry.verifyCaseInfoIconIsDisplayed();
	        property.propertyEntry.clickMainTab();
	        property.propertyEntry.propertyEntryMainTab.SelectNIBRS();
	        property.propertyEntry.propertyEntryMainTab.selectAtReason();
	        property.propertyEntry.propertyEntryMainTab.selectAtProperty();
	        property.propertyEntry.propertyEntryMainTab.enterDescription();
	        property.propertyEntry.propertyEntryMainTab.enterAtQuantity();
	        property.propertyEntry.propertyEntryMainTab.enterAtValue();
	        property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
	        property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
	        names.switchToNameSearchHelpWindow();
	        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName(); 
	        property.switchToPropertyEntry();
	        property.propertyEntry.SaveTheScreen();
	        property.switchToPropertyEntry();
	        property.propertyEntry.VerifyAdditionSuccessfulMessage();
	        String readPropertyNo = property.propertyEntry.readPropertyNo();
	        property.switchToPropertyEntry();
	        property.propertyEntry.closeTheScreen();
	        property.switchToPropertyEditEntry();
	        property.propertyEditEntry.verifyAtActivePropertyNoInGrid(readPropertyNo,0);
	        property.propertyEditEntry.VerifyAtQuantity(0); //Action Updated 
	        property.propertyEditEntry.selectRowByActivePropertyNoInGrid(readPropertyNo);
	        property.switchToPropertyEntry();
	        property.propertyEntry.verifyAtCaseNo();
	        property.propertyEntry.ClickSubmitButton();
	        property.propertyEntry.VerifyConfirmSubmitMessage();  //Action Updated
	        property.switchToPropertyEditEntry();
	        loader.navigateToScreen("Property Search");
	        property.switchToPropertySearch();
	        property.propertySearch.enterPropertyNobyActiveData(readPropertyNo);
	        property.propertySearch.clickSearch();
	        property.propertySearch.verifyAtCaseNoInGrid();
	        property.propertySearch.VerifyAtQuantity(0);   //Action Updated
	        property.switchToPropertySearch();
		}
		
		//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property . ran on 87.passed
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void Police2019PropertyModule_203124(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "203124");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Update");
			property.switchToPropertyUpdate();
	        property.propertyUpdate.clickExpandButton();
	        property.propertyUpdate.EnterAtProperty();
	        property.propertyUpdate.clickSearchButton();
	        property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo(); 
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	        property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
	        property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation(); 
	        property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseConfirmMessage(); 
	        Playback.controlReadyThreadWait();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);
	        property.propertyUpdate.veriyStatusColumnValuesAsDimGrayColor(0);
	        property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
	        property.propertyUpdate.ClickTheProceedWithSelectionButton();
	        property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	        property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
	        property.propertyUpdate.propertyUpdatePopup.VerifyAtRelinquisheBy();
	        property.propertyUpdate.propertyUpdatePopup.SelectReceivedBy();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
	        property.switchToPropertyUpdate();
	        property.propertyUpdate.VerifyPropertyStatusInTheGridAsSentToLab(0);
	        property.propertyUpdate.veriyStatusColumnValuesAsDimGrayColor(0);
	        property.propertyUpdate.ClickAtPropertyNoInGrid();
	        property.switchToPropertyIndex();
	        property.propertyEntry.verifyAtPropertyNo();
	        property.propertyEntry.ClickHistoryTab();
	        property.propertyEntry.propertyEntryHistoryTab.VerifyTransDateAsCurrentDate();
	        property.propertyEntry.propertyEntryHistoryTab.VerifyAtPFCode();
	        property.propertyEntry.propertyEntryHistoryTab.VerifyHistroyAsSentToLab();
	        property.propertyEntry.propertyEntryHistoryTab.VerifyHistroyAsMovedPropertyRoom();
	        property.switchToPropertyIndex();
		}
		
		//Reworked by:- Dinesh , Date :- 19-10-20201 , Quarter:- Q4 , Sprint:- 2 , Module:- Property .
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void Police2019PropertyModule_203126(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "203126");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Update");
			 property.switchToPropertyUpdate();
	         property.propertyUpdate.clickExpandButton();
	         property.propertyUpdate.EnterAtProperty();
	         property.propertyUpdate.clickSearchButton();
	         property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo(); 
	         property.propertyUpdate.ClickTheProceedWithSelectionButton();
	         property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	         property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
	         property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation(); 
	         property.propertyUpdate.propertyUpdatePopup.VerifyEvidenceLockerUseConfirmMessage();
	         Playback.controlReadyThreadWait();
	         property.switchToPropertyUpdate();
	         property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
	         property.switchToPropertyUpdate();
	         property.propertyUpdate.VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(0);
	         property.propertyUpdate.ClickPRIconUsingPropertyNo();
	         property.switchToPropertyRoomRoles();
	         property.propertyRoomRoles.SwitchToStorageTab();
	         property.propertyRoomRoles.storageTab.TabDataAndTime();
	         property.propertyRoomRoles.storageTab.TabOfficer();
	         property.propertyRoomRoles.storageTab.clickActionArrow();
	         property.propertyRoomRoles.storageTab.selectAtActionRadDropdown();
	         property.propertyRoomRoles.SwitchToChainTab();
	         property.propertyRoomRoles.chainTab.VerifyAtRelinquishedBy();
	         property.propertyRoomRoles.chainTab.VerifyReceivedByPFCodeEditable();
	         property.propertyRoomRoles.chainTab.VerifyActionAsMovedIntoPropertyRoomInGrid(0);
	         property.propertyRoomRoles.chainTab.SelectReceivedBy();
	         property.switchToPropertyRoomRoles();
	         property.propertyRoomRoles.SwitchToChainTab(); 
	         property.propertyRoomRoles.chainTab.ClickUpdateButton(); 
	         popup.confirm.yes();
	         property.switchToPropertyRoomRoles();
	         property.propertyRoomRoles.verifyUpdateSuccessfulBottomMessage();
	         property.propertyRoomRoles.SwitchToChainTab();
	         property.propertyRoomRoles.chainTab.VerifyActionAsSentToLabInGrid(0);
	         property.propertyRoomRoles.SwitchHistoryTab();
	         property.propertyRoomRoles.historyTab.VerifyTransDateAsCurrentDate();
	         property.propertyRoomRoles.historyTab.VerifyAtPFCode();
	         property.propertyRoomRoles.historyTab.VerifyHistroyAsSentToLab();
	         property.propertyRoomRoles.historyTab.VerifyHistroyAsMovedPropertyRoom();
	         property.switchToPropertyRoomRoles();
	         property.propertyRoomRoles.CloseScreen();
	         property.switchToPropertyUpdate();
	         property.propertyUpdate.VerifyPropertyStatusInTheGridAsSentToLab(0);
	         property.switchToPropertyUpdate();
		}
		
		//Automated by:-dinesh , Date :- 21-10-2021 , Quarter:- Q4 , Sprint:- 2 , Module:- property.ran on 45
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void VerifyPropertyReportIsAbleToAttachInReportingTabOfCase_213958(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "213958");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			String date=records.caseUpdate.readReportedDate1();
			records.caseUpdate.ClickPropertyTab();
			records.caseUpdate.caseUpdatePropertyTab.VerifyAtPropertyNoInGrid(0);
			records.switchToCaseUpdate();
			records.caseUpdate.clickReportingTab();
			records.caseUpdate.reportingTab.verifyPropertyReportStatusAsLocked(0);
			records.caseUpdate.reportingTab.verifyPropertyReportGenetatedTime(date, 0);
			records.caseUpdate.reportingTab.selectRowByAtType();
			records.switchToReportStatus();
			records.reportStatus.VerifyIncidentReportAsLockedIsOpening();
			records.switchToReportStatus();
		}
		
		//Automated by:-dinesh , Date :- 22-10-2021 , Quarter:- Q4 , Sprint:- 2 , Module:- property. SCRIPT ON HOLD
		@Test(groups = { "PropertyFunctional2020_1" },enabled=false)
		public void VerifyThePropertyAddedForLarcenyCFSCharge_210643(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "210643");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");   // SCRIPT ON HOLD.
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();       
		}
	//Run in local M/c  Used Robot
	@Test(groups = { "2021DefectTestCases" }) // Mahesha  Sprint : Q3 S4 08312021
	public void VerifyPropertyupdatescreenisallowingtoprinttheBarcodeformoreThenOneItem_281421(ITestContext testcontext) throws IOException {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "281421");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.verifyPrintBarCodeButtonDisable();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickAllUpdateCheckboxes();
		property.propertyUpdate.verifyPrintBarCodeButtonEnabled();
		property.propertyUpdate.clickPrintBarcodeForSelectedButton();
		//objectIdentification.windowHandle.switchToWindow("Untitled Document");
		Playback.threadWait(10000);
		objectIdentification.readPDF.pressEnter();
		objectIdentification.readPDF.SaveAsPDFfileToLocation("281421");
		String Content = objectIdentification.readPDF.ReadPDF("281421");
		objectIdentification.readPDF.verifyContentInsidePDF(Content, "21-000229");
		
	}
	
	@Test(groups = { "2021DefectTestcaseProperty" }) // Vijay // Q3 Sprint 1
	public void verifyNewSignatureControlFunctionWorkingInPropertyUpdateScreen_276787(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "276787");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.clickUpdateCheckboxByPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
		property.propertyUpdate.propertyUpdatePopup.EnterAtRelinquisheBy();
		property.propertyUpdate.propertyUpdatePopup.clickSignatureImageInRelinquishedBy();
		home.switchToSignatureScreen();
		home.signatureScreen.verifyViewSignatureAreaIsEmpty();
		home.signatureScreen.enterAtPassword();
		home.signatureScreen.clickShowSignatureButton();
		home.signatureScreen.verifyViewSignatureAreaHavingSignature();
		home.signatureScreen.clickApplyButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.EnterAtReceivedBy();
		property.propertyUpdate.propertyUpdatePopup.clickSignatureImageInReceivedBy();
		home.switchToSignatureScreen();
		home.signatureScreen.clickTypeButton();
		home.signatureScreen.enterAtSignTextArea("Cad Auto");
		home.signatureScreen.clickApplyButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
		property.switchToPropertyUpdate();
	}

	@Test(groups = { "2021DefectTestcaseProperty" }) // Vijay // Q3 Sprint 1
	public void verifyStolenPropertyIsAllowToCreateInIRSupplementReport_276788(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "276788");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.ClickAddNew();
		records.switchToWalkInEntry();
		records.walkInEntry.tabTheReportedDate();
		records.walkInEntry.tabTheReportedTime();
		records.walkInEntry.enterAtCADCFS();
		records.walkInEntry.enterAtLocation();
		records.walkInEntry.tabTheReceivedSource();
		records.walkInEntry.enterAtNameID();
		records.walkInEntry.selectAtActivity();
		records.walkInEntry.enterAtCADDispositon();
		records.walkInEntry.save();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsAircraft();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterQuantityAs10();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo = property.propertyEntry.readPropertyNo();
		String caseNo = property.propertyEntry.readCaseNo();
		property.propertyEntry.closeTheScreen();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterCaseNumberByActiveData(caseNo);
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsAircraft();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterQuantityAs10();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.propertyEntryMainTab.enterRelatedPropertyNo(propertyNo);
		Playback.controlReadyThreadWait();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String propertyNo1 = property.propertyEntry.readPropertyNo();
		property.propertyEntry.closeTheScreen();
		records.switchToCaseUpdate();
		records.caseUpdate.ClickPropertyTab();
		records.caseUpdate.caseUpdatePropertyTab.selectAtPropertyNoInGridByActiveData(propertyNo1);
		property.switchToPropertyEntry();
		property.propertyEntry.verifyPropertyNoIsDisplayed();
	}

	@Test(groups = { "2021DefectTestcaseProperty" }) // Vijay // Q3 Sprint 1
	public void verifySecurityTypeFieldIsEnabledWhenWeSelectPTCAsSecurityCode_276789(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "276789");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.SelectSecurityType();
		property.propertyEntry.propertyEntryMainTab.SelectSecurityType();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
	}

	@Test(groups = { "2021DefectTestcaseProperty" }) // Vijay // Q3 Sprint 3
	public void verifyAbleToUpdatePropertyEntryDescriptionAsStolen_278763(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278763");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickReset();
		property.propertyEditEntry.selectRowByAtPropertyNo(PropertyNo);
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo1 = property.propertyEntry.readPropertyNo();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickReset();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.VerifyAtPropertyNo(PropertyNo1, 0);

	}

	@Test(groups = { "2021DefectTestcaseProperty" }) // Vijay // Q3 Sprint 3
	public void verifyAbleToUpdatePropertyEntryDescriptionAsFound_278764(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278764");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo = property.propertyEntry.readPropertyNo();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickReset();
		property.propertyEditEntry.selectRowByAtPropertyNo(PropertyNo);
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.ClickAddNewButton();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String PropertyNo1 = property.propertyEntry.readPropertyNo();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.ClickReset();
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.VerifyAtPropertyNo(PropertyNo1, 0);

	}
	
	//Automated By TesterName:- Mithun A Date:-31-08-2021	Sprint:-4
	@Test(groups = {"2021Q4Sprint4"}) 
	public void Verifythepropertybarcodeisdisplayedinformat281034(ITestContext testContext) throws IOException {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281034");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter428AsPattern1();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
//		property.propertyEditEntry.SelectRowByAtCaseNo();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectAtReason();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsBicycles();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
		property.propertyEntry.recoveredTab.EnterRemarks();
		property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed();
		property.switchToPropertyEntry();
		
	}
	
	//Automated By TesterName:- Mithun A	Date:- 30-08-2021	Sprint:- 4
		@Test(groups = {"2021Q4Sprint4"})
		public void Verifythepropertystatusisdisplayedcorrectlyinpropertyroomrolesscreen_281035(ITestContext testContext) {
			testContext.setAttribute("testID", "281035");
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Update");
			property.switchToPropertyUpdate();
			property.propertyUpdate.clickExpandButton();
			property.propertyUpdate.enterAtPropertyNo();
			property.propertyUpdate.clickSearchButton();
			String Status=property.propertyUpdate.readPropertyUpdateStatusinGrid(0);
			property.propertyUpdate.ClickOnThePRIcon(0);
			property.switchToPropertyRoomRoles();
			property.propertyRoomRoles.VerifyAtStatus(Status);
			
		}
	
	@Test(groups = "PropertyFollowUpReminder", priority = 1)
	public void HomeMyReminders_105460(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105460");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.EnterAtCase();
		property.propertyUpdate.VerifyCaseInfoButton();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.VerifyPropertyItemAppearsInTheGrid();
		property.propertyUpdate.SelectTheSelectAllCheckBox();
		property.propertyUpdate.ClickTheProceedWithSelectionButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
		property.propertyUpdate.propertyUpdatePopup.SelectStorageLocation();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.EnterFollowDateAs5thDayFromCurrentDate();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();

	}

	@Test(groups = "PropertyFollowUpReminder", priority = 2)
	public void HomeMyReminders_105461(ITestContext testContext) {

	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105461");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");

		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();

		home.myHome.myRemindersTab.ClickPropertyAccordion();
		home.myHome.myRemindersTab.VerifyCaseAtCaseInProperty();
		home.myHome.myRemindersTab.VerifyEvidenceExistInTheReasonColumn();
		home.myHome.myRemindersTab.VerifyCyclesExistsInTheDescriptionColumn();
		home.myHome.myRemindersTab.VerifyFollowUpDateAs5thDayFromCurrentDate();
		home.myHome.myRemindersTab.SelectRowAtCase();

		// property.propertyIndex.closeTheScreen();
		
	}

	@Test(groups = "PropertyFollowUpReminder", priority = 3)
	public void HomeMyReminders_105462(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "105462");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.myHome.SwitchToMyRemindersTab();
		home.myHome.myRemindersTab.ClickPropertyAccordion();
		home.myHome.myRemindersTab.VerifyPropertyTabNotAppear();

	}
	

	@Test(groups= {"2021DefectTestCase4"}) // Automated by Stalin
	public void VerifytheEvidenceButtonisshowing(ITestContext testContext) {
		testContext.setAttribute("testID", "254572");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.verifyEvidenceButtonIsDisplayed();
		names.nameEntry.activityTab.clickEvidenceButton();
		property.switchToPropertySearchHelpWindow();
		property.propertySearchHelpWindow.clickSearchButton();
		property.propertySearchHelpWindow.verifyRecordAcknowledgeMessage();
		property.switchToPropertySearchHelpWindow();
		property.propertySearchHelpWindow.selectAtPropertyType();
		property.propertySearchHelpWindow.enterAtNameID1();
		property.propertySearchHelpWindow.enterAtLastName();
		property.propertySearchHelpWindow.enterAtFirstName();
		property.propertySearchHelpWindow.clickSearchButton();
		property.propertySearchHelpWindow.verifyAtTypeColumnValue();
	}

	//Oct Sprint 1 Automated By Mahesha
	@Test(groups= {"2021DefectTestCase4"})
	public void VerifyApplicationShouldShowTheResultBasedOnSearchFilterInPropertySearchScreen_255530(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255530");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterNameIDAsA();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.enterAtMiddleName();
		names.nameEntry.selectAtSuffix();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.SelectPhoneTypeAsHome();
		names.nameEntry.EnterAtPhoneNo();
		names.nameEntry.SelectPhoneType1AsWork();
		names.nameEntry.EnterAtPhoneNo1();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.SelectAtSex();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.SelectAtResident();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.switchToActivityTab();
		names.nameEntry.activityTab.clickEvidenceButton();
		property.switchToPropertySearchHelpWindow();
		property.propertySearchHelpWindow.clickSearchButton();
		property.propertySearchHelpWindow.verifyNoResultsFountAckMsg();
		property.switchToPropertySearchHelpWindow();
		property.propertySearchHelpWindow.enterAtNameID();
		property.propertySearchHelpWindow.clickSearchButton();
		property.propertySearchHelpWindow.ClickRow();
	}

	@Test(groups= {"2021DefectTestCase4"}) // Vijay
	public void verifyArrestEntryNameSearchWindow_251465(ITestContext testcontext) {
		testcontext.setAttribute("testID", "251465");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Report Search");
		records.switchToReportSearch();
		records.reportSearch.clickDateTimeResetButton();
		records.reportSearch.EnterFromAndEndAtCaseNo();
		records.reportSearch.clickSearch();
		records.reportSearch.SelectReportByAtType();
		records.switchToReportStatus();
		records.reportStatus.ClickArrestButton();
		names.switchToArrestEntry();
		names.arrestEntry.EnterAtLastName();
		names.arrestEntry.EnterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		names.switchToArrestEntry();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.SelectHowAsAttemptedArrest();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();// Changed
		records.switchToReportStatus();
		records.reportStatus.ClickArrestButton();
		names.switchToArrestSearchHelpWindow();
		names.arrestSearchHelpWindow.verifyNameByLastNameAndFirstName();
		names.arrestSearchHelpWindow.closeTheScreen();
		records.switchToReportStatus();
		records.reportStatus.ClickArrestButton();
		names.switchToArrestSearchHelpWindow();
		names.arrestSearchHelpWindow.ClickAddNew();
		names.switchToArrestEntry();
		names.arrestEntry.clickPopupChargeCancelButton();
		names.arrestEntry.enterAtLastName1();
		names.arrestEntry.enterAtFirstName1();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.verifyNameByLastNameAndFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastName1AndFirstName1();
		names.switchToArrestEntry();
		names.arrestEntry.clickPopupChargeCancelButton();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.SelectHowAsAttemptedArrest();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.switchToArrestEntry();
		names.arrestEntry.saveScreen();
	}

	@Test(groups= {"2021DefectTestCase4"}) //Mahesha
	public void CheckUserCanChangeValueofPropertyAfterSubmitOrApprove_280019(ITestContext testContext) {
		testContext.setAttribute("testID", "280019");
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
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
		records.reportManager.tabReportedbyPF();
		records.reportManager.save();
		
		records.switchToReportStatus();
		records.reportStatus.clickCaseDataButton();
		records.switchToACD();
		records.aCD.enterAtCharge();
		records.aCD.clickAddButton();
		records.switchToFTC();
		records.fTC.selectAttemptedCompletedAsCompleted();
		//records.fTC.selectAtNIBRS();
		//records.fTC.SelectCrimeAgainstAsSociety();
		records.fTC.selectAtPropertyLoss();
		records.fTC.selectAtLocationType();
		records.fTC.selectAtSuspectedOfUsing();
		records.fTC.selectAtCriminalActivity();
		records.fTC.saveNClose();
		records.switchToACD();
		records.aCD.TaboutOccuredAT();
		records.aCD.SelectPoliceForceUsedAsNone();
		records.aCD.SelectDomesticViolanceAsNo();
		records.aCD.SaveNClose();
		records.switchToReportStatus();
		records.reportStatus.clickPropertyButton();
		
		property.switchToPropertyEditEntryPopup();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.verifyAtCaseNo();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.verifyReasonAndPropertyDefaultSelected();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.enterQuantityAs10();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.clickOwnerUnknownCheckbox();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		
		property.propertyEntry.recoveredTab.selectAtDisposition();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveNClose();
		property.switchToPropertyEditEntryPopup();
		property.propertyEntry.closeTheScreen();
		records.switchToReportStatus();
		records.reportStatus.clickReportDetails();
		records.switchToReportManager();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsSendForApproval();
	//	records.reportManager.updateStatusTab.SelectAtDivision();
	//	records.reportManager.updateStatusTab.SelectAtSection();
		records.reportManager.save();
		records.switchToReportManager();
		records.reportManager.VerifiyStatusAsSubmitted();
		records.reportManager.switchToUpdateStatusTab();
		records.reportManager.updateStatusTab.selectActionAsApprove();
		records.reportManager.Saveandclose();
		
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickMoreFiltersButton();
		property.propertyUpdate.EnterAtCaseNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickAtCaseNoInGrid();
		property.switchToPropertyIndex();
		
		property.propertyIndex.clickOnMainTab();
		property.propertyIndex.propertyIndexMainTab.SelectAtNIBRS1();
		property.propertyIndex.propertyIndexMainTab.verifyReasonAndPropertyDefaultSelected();
		property.propertyIndex.propertyIndexMainTab.VerifyPropertyTypeDrugs();
		property.propertyIndex.propertyIndexMainTab.enterDescription();
		property.propertyIndex.propertyIndexMainTab.SelectAtDrugType();
		property.propertyIndex.propertyIndexMainTab.SelectAtMeasurement();
		property.propertyIndex.propertyIndexMainTab.EnterAtDrugQuantity();
		property.propertyIndex.propertyIndexMainTab.clickOwnerUnknownCheckbox();
		property.propertyIndex.ClickOnRecoveredTab();
		property.propertyIndex.recoveredTab.tabDateAndTime();
		property.propertyIndex.recoveredTab.TabOutDrugQuantity();
		property.propertyIndex.recoveredTab.verifyQuantityAsDrugQuantity();
		property.propertyIndex.recoveredTab.tabOutValue();
		property.propertyIndex.recoveredTab.VerifyValueAs0();
		property.propertyIndex.recoveredTab.SelectAtStatus();
		property.propertyIndex.saveTheScreen();
		property.switchToPropertyIndex();

	}
	
	@Test(groups= {"2021DefectTestCase4"})   //Automated By Mohan July29/07/2021 need to run and verify
	public void VerifytPropertyAddedByOfficer1AbleToEnterNewPropertyByOfficer2_278648(ITestContext testContext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278648");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDecriptionAs10Shirts();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		
		property.propertyEntry.propertyEntryMainTab.TabOutFirstName();
		property.propertyEntry.propertyEntryMainTab.SelectNameByLastName();
		property.propertyEntry.SaveTheScreen();
		property.propertyEntry.ClickAddNewButton();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtReason1();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty1();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();
		property.propertyEntry.SaveTheScreen();
				
		//Done
		
	}
	
	//Automated by TesterName :Mohan     Date :27-08-2021   Sprint:-
	@Test(groups= {"2021DefectTestCase4"})
	public void VerifyDateandTimeFieldPropertyRoomRoleScreen_281030(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281030");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");

		property.switchToPropertyUpdate();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickAtPropertyNoInGrid();
		property.switchToPropertyIndex();
		property.propertyIndex.ClickOnRecoveredTab();
		property.propertyIndex.recoveredTab.clickResetDateTime();
		property.propertyIndex.recoveredTab.tabDateAndTime();
		property.propertyIndex.saveTheScreen();
		
	}
	
	
	//Automated by TesterName :Mohan  Date :27-08-2021   Sprint:-
	@Test(groups= {"2021DefectTestCase4"})
	public void VerifyResetButtonfromPropertyEntry_281031(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	
		testContext.setAttribute("testID", "281031");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.clickRandomPropertyInGrid();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.clickResetDateTime();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.verifyRecoveredDateTimeAsCurrentDate();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
			
	}
	
	@Test (groups= {"2021DefectTestCase4"})  //Automated By Mohan Aug 30/08/2021 need to run and verify
	public void VerifytResetbuttonDateandTime_281032(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "281032");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Edit/Entry");
		property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
		property.propertyEntry.propertyEntryMainTab.selectAtProperty();
		property.propertyEntry.propertyEntryMainTab.enterDecriptionAs10Shirts();
		property.propertyEntry.propertyEntryMainTab.enterAtValue();
		property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
		property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
		
		property.propertyEntry.propertyEntryMainTab.TabOutFirstName();
		property.propertyEntry.propertyEntryMainTab.SelectNameByLastName();
		property.propertyEntry.SaveTheScreen();
			
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.clickResetDateTime();
		
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.verifyRecoveredDateTimeAsCurrentDate();
		
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();
		property.propertyEntry.SaveTheScreen();
				
		//
		
	}
	
	@Test	//Mithun
	public void VerifySignatureAuthentication_275262(ITestContext testContext)
	{
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "275262");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Records");
	loader.navigateToScreen("Case Search");
	records.switchToCaseSearch();
	records.caseSearch.enterAtCaseNo();
	records.switchToCaseUpdate();
	records.caseUpdate.ClickPropertyTab();
	records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
	property.switchToPropertyEntry();
	property.propertyEntry.clickMainTab();
	property.propertyEntry.propertyEntryMainTab.selectAtReason();
	property.propertyEntry.propertyEntryMainTab.selectAtProperty();
	property.propertyEntry.propertyEntryMainTab.enterDescription();
	property.propertyEntry.propertyEntryMainTab.EnterQuantity();
	property.propertyEntry.propertyEntryMainTab.EnterValueAs100();

	property.propertyEntry.clickRecoveredTab();
	property.propertyEntry.recoveredTab.tabDateAndTime();
	property.propertyEntry.recoveredTab.tabOutQuantity();
	property.propertyEntry.recoveredTab.tabOutValue();
	property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
	property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();
	property.switchToPropertyEntry();
	property.propertyEntry.SaveTheScreen();
	property.switchToPropertyEntry();
	String PropertyNo=property.propertyEntry.readPropertyNo();
	property.propertyEntry.closeTheScreen();
	loader.navigateToModule("Property");
	loader.navigateToScreen("Property Update");
	property.switchToPropertyUpdate();
	property.propertyUpdate.clickExpandButton();
	property.propertyUpdate.EnterPropertyByActiveData(PropertyNo);
	property.propertyUpdate.clickSearchButton();
	property.propertyUpdate.clickUpdateCheckboxByActivePropertyNo(PropertyNo);
	property.propertyUpdate.ClickTheProceedWithSelectionButton();
	property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
	property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();
	property.propertyUpdate.propertyUpdatePopup.SelectAtStorageLocation();
	popup.confirm.yes();
	property.switchToPropertyUpdate();

	records.switchToCaseUpdate();
	records.caseUpdate.clickResetButton();
	records.caseUpdate.ClickPropertyTab();
	records.caseUpdate.caseUpdatePropertyTab.clickPRIconViewInGridUsingPropertyNo(PropertyNo);
	property.switchToPropertyRoomRoles();
	property.propertyRoomRoles.VerifyAtStatus();
	property.propertyRoomRoles.SwitchToChainTab();
	property.propertyRoomRoles.chainTab.VerifyActionAsSentToLabInGrid(0);

	objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = {"Property2021"})  //Mithun
	public void VerifyinpropertyroomrolesscreenwhenweselectTransfertoanofficeractionshouldopeninchaintabtoenterPFID_278638(ITestContext testContext)
	{
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "278638");

	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Property");
	loader.navigateToScreen("Property Update");
	property.switchToPropertyUpdate();
	property.propertyUpdate.clickExpandButton();
	property.propertyUpdate.EnterAtCaseNo();
	property.propertyUpdate.clickSearchButton();
	property.propertyUpdate.ClickOnThePRIcon(0);
	property.switchToPropertyRoomRoles();
	property.propertyRoomRoles.SwitchToStorageTab();
	property.propertyRoomRoles.storageTab.SelectAtAction();
	//Flow Missing

	}


	

	

@Test //Automated by Stalin 2021 Q3 S1
	public void VerifySignaturecontrolshowsupdatedsignaturesinPropertyRoomRoles_276786(ITestContext testContext) {
		testContext.setAttribute("testID", "276786");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Update");
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickExpandButton();
		property.propertyUpdate.enterAtPropertyNo();
		property.propertyUpdate.clickSearchButton();
		property.propertyUpdate.ClickUpdateCheckboxUsingPropertyNo();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
		property.propertyUpdate.propertyUpdatePopup.selectActionAsSTLSentToLab();
		property.propertyUpdate.propertyUpdatePopup.clickRelinqByClickHereToSignButton();
		home.switchToSignatureScreen();
		home.signatureScreen.enterAtPassword();
		home.signatureScreen.clickShowSignatureButton();
		home.signatureScreen.clickApplyButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedBySignatureImageIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.EnterAtReceivedBy();
		property.propertyUpdate.propertyUpdatePopup.clickRcvdByClickHereToSignButton();
		home.switchToSignatureScreen();
		home.signatureScreen.clickTypeButton();
		home.signatureScreen.enterAtSignTextArea("P001");
		home.signatureScreen.clickApplyButton();
		property.switchToPropertyUpdate();
		property.propertyUpdate.propertyUpdatePopup.verifyReceivedBySignatureImageIsDisplayed();
		property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim(); 
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickPRColumnByIndex(0); 
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToChainTab();
		property.propertyRoomRoles.chainTab.selectAtActionInGrid();
		property.propertyRoomRoles.chainTab.verifyRelinquishedBySignatureImageIsDisplayed();
		property.propertyRoomRoles.chainTab.verifyReceivedBySignatureImageIsDisplayed();
		property.switchToPropertyRoomRoles();
		
	}
  	//Automated by:-dinesh , Date :- 22-10-2021 , Quarter:- Q4 , Sprint:- 2 , Module:- property. passed on 87
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void VerifyStolenAndRecoveredPropertyCountDisplayedForDispositionValueAsRecoveredByOtherAgency_210636(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "210636");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickPropertyTab();
			records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
			property.switchToPropertyEntry();
			property.propertyEntry.clickMainTab();
			property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
			property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
			property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
			//property.propertyEntry.propertyEntryMainTab.verifySerialLabelAsMandatory();
			property.propertyEntry.propertyEntryMainTab.enterDescription();
			property.propertyEntry.propertyEntryMainTab.enterAtPlateNumber(); 
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.clickSelectButton();
			property.switchToPropertyEntry();
			property.propertyEntry.clickMainTab();
			property.propertyEntry.propertyEntryMainTab.enterValue();
			property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
			property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
			names.switchToNameSearchHelpWindow();
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
			property.switchToPropertyEntry();
			property.propertyEntry.clickRecoveredTab();
			property.propertyEntry.recoveredTab.tabDateAndTime();
			property.propertyEntry.recoveredTab.tabOutQuantity();
			property.propertyEntry.recoveredTab.tabOutValue();
			property.propertyEntry.recoveredTab.SelectAtStatus();
			property.switchToPropertyEntry();
			property.propertyEntry.SaveTheScreen();  
			property.switchToPropertyEntry();
			property.propertyEntry.VerifyAdditionSuccessfulMessage();
			property.propertyEntry.ClickSubmitButton();
			property.propertyEntry.VerifyConfirmSubmitMessage();
			records.switchToCaseUpdate(); 
			records.caseUpdate.clickReportingTab();
			records.caseUpdate.reportingTab.VerifyPropertyStatusAsLocked();  //Action Updated 
			records.switchToCaseUpdate();
			records.caseUpdate.ClickPropertyTab(); 
			records.caseUpdate.caseUpdatePropertyTab.VerifyAtReasonInGrid(0);
			records.caseUpdate.caseUpdatePropertyTab.SelectPropertyRowInGrid(0); 
			property.switchToPropertyIndex();
			property.propertyIndex.clickReportDetailsButton();
			records.switchToReportManager();
			records.reportManager.VerifyStatsAsApprovedInMenuBar();
			records.switchToReportManager();
		}
@Test //Automated by Stalin 2021 Q3 S1
	public void VerifyPropertylocationsearchlookupissearchbasedoncodedvalue_276785(ITestContext testContext) {
		testContext.setAttribute("testID", "276785");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Location Search");
		property.switchToLocationSearch();
		property.locationSearch.ClickAddNew();
		property.switchToStorageLocations();
		property.storageLocations.EnterAtDescription();
		property.storageLocations.SaveTheScreen();
		property.switchToStorageLocations();
		property.storageLocations.CloseTheScreen();
		property.switchToLocationSearch();
		loader.navigateToScreen("Property Edit/Entry");
        property.switchToPropertyEditEntry();
		property.propertyEditEntry.enterAtCaseNumberAndTab();
		property.propertyEditEntry.clickAddNewPropertyReport();
		property.switchToPropertyEntry();
		property.propertyEntry.clickMainTab();
		property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
		property.propertyEntry.propertyEntryMainTab.SelectReasonAsEvidence();
		property.propertyEntry.propertyEntryMainTab.SelectPropertyAsAircraft();
		property.propertyEntry.propertyEntryMainTab.enterDescription();
		property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
		property.switchToPropertyEntry();
		property.propertyEntry.clickRecoveredTab();
		property.propertyEntry.recoveredTab.tabDateAndTime();
		property.propertyEntry.recoveredTab.tabOutQuantity();
		property.propertyEntry.recoveredTab.tabOutValue();
		property.propertyEntry.recoveredTab.SelectAtStatus();
		property.propertyEntry.recoveredTab.clickInitialStorageLookUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.enterAtDescription();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.clickAtDescription();
		property.switchToPropertyEntry();
		property.propertyEntry.SaveTheScreen();
		property.switchToPropertyEntry();
		String readPropertyNo = property.propertyEntry.readPropertyNo();
		property.propertyEntry.closeTheScreen();
        property.switchToPropertyEditEntry();
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.clickStorageLocationSearchButton();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.enterAtDescription();
		popup.kPICodedLookup.clickSearchIcon();
		popup.kPICodedLookup.clickAtDescription();
		property.switchToPropertySearch();
		property.propertySearch.clickSearch();
		property.propertySearch.verifyAtCase(0);
		property.switchToPropertySearch();

		
	}
//Automated by KIRAN :-     Date :-10/7/2021  Quarter:-4  Sprint:-1 Module:-Property 
	@Test(groups = {  "2022DefectTestCasesProperty" })
	public void VerifytheNewSignaturePopupIsDisplayedInPropertyRoomRolesScreenStorageTab_278641(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "278641");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		property.switchToPropertySearch();
		property.propertySearch.EnterFromCaseDetails();
		property.propertySearch.enterAtPropertyFrom();
		property.propertySearch.clickSearch();
		property.propertySearch.ClickPRIconUsingCaseNo();
		property.switchToPropertyRoomRoles();
		property.propertyRoomRoles.SwitchToStorageTab();
		property.propertyRoomRoles.storageTab.TabDataAndTime();
		property.propertyRoomRoles.storageTab.TabOfficer();
		property.propertyRoomRoles.storageTab.clickActionArrow();
		property.propertyRoomRoles.storageTab.SelectAtAction1();
	
		property.switchToPropertyUpdate();
		property.propertyUpdate.clickUpdateButton();
		property.propertyUpdate.verify9011TranscationDateIsrequired();
		
		
		
	}
  	//Automated by:-dinesh , Date :- 25-10-2021 , Quarter:- Q4 , Sprint:- 2 , Module:- property. // ON HOLD
		@Test(groups = { "PropertyFunctionalBatch3" })
		public void VerifyStolenAndRecoveredPropertyCountDisplayedForDispositionValueAsOther_210634(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "210634");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.clickCaseDataTab();
			records.caseUpdate.caseUpdateCaseDataTab.VerifyAtChargeInGrid();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickPropertyTab();
			records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
			property.switchToPropertyEntry();
			property.propertyEntry.clickMainTab();
			property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
			property.propertyEntry.propertyEntryMainTab.selectAtReason();
			property.propertyEntry.propertyEntryMainTab.selectAtProperty();
			//property.propertyEntry.propertyEntryMainTab.verifySerialLabelAsMandatory(); // on HOLD.
			property.propertyEntry.propertyEntryMainTab.enterDescription();
			property.propertyEntry.propertyEntryMainTab.enterAtPlateNumber();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.clickSelectButton();
			property.switchToPropertyEntry();
			property.propertyEntry.clickMainTab();
			property.propertyEntry.propertyEntryMainTab.enterValue();
			property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
			property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
			names.switchToNameSearchHelpWindow();
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
			property.switchToPropertyEntry();
			property.propertyEntry.clickRecoveredTab();
			property.propertyEntry.recoveredTab.tabDateAndTime();
			property.propertyEntry.recoveredTab.tabOutQuantity();
			property.propertyEntry.recoveredTab.tabOutValue();
			property.propertyEntry.recoveredTab.SelectAtStatus();
			property.switchToPropertyEntry();
			property.propertyEntry.SaveTheScreen();
			property.switchToPropertyEntry();
			property.propertyEntry.VerifyAdditionSuccessfulMessage();
			String readPropertyNo = property.propertyEntry.readPropertyNo();
			property.propertyEntry.ClickSubmitButton();
			property.propertyEntry.VerifyConfirmSubmitMessage();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickPropertyTab();
			records.caseUpdate.caseUpdatePropertyTab.verifyAtPropertyNo(readPropertyNo, 0);
			records.switchToCaseUpdate();
		}



	//Automated by KIRAN :-     Date :-10/11/2021  Quarter:-4  Sprint:-1 
		@Test(groups = {  "2022DefectTestCasesProperty"})
		public void VerifyTheNewSignaturePopupIsDisplayedInThePropertyRoomRolesScreen_278643
		(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "278643");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Update");
			property.switchToPropertyUpdate();
			property.propertyUpdate.clickExpandButton();
			property.propertyUpdate.EnterAtCaseNo();
		//	property.propertyUpdate.enterAtPropertyNo();
			property.propertyUpdate.clickSearchButton();
			property.propertyUpdate.selectUpdateCheckboxByAtPropertyNo();
			property.propertyUpdate.clickUpdateButton();

			property.propertyUpdate.propertyUpdatePopup.SelectActionAsPROMovedIntothePropertyRoom();;
			property.propertyUpdate.propertyUpdatePopup.enterAtStorageLocation();
			property.propertyUpdate.propertyUpdatePopup.tabTheDateAndTime();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.clickAtDescription();
			property.switchToPropertyUpdate();
			
			property.propertyUpdate.propertyUpdatePopup.clickUpdateButtonWithConfrim();
			property.propertyUpdate.ClickPRIconUsingCaseNo();
			property.switchToPropertyRoomRoles();
			property.propertyRoomRoles.SwitchToChainTab();
			property.propertyRoomRoles.chainTab.clickPropertyInGridByPF();
			property.propertyUpdate.propertyUpdatePopup.verifyRelinquishedBySignImageIsDisplayed();
			
			
			
		}
		//Automated by KIRAN :-     Date :-11/12/2021  Quarter:-4  Sprint:-3 Module:-PROPERTY
		@Test(groups = {  "2022DefectTestCasesProperty"})
		public void VerifyThePropertyIsAddedFromOfficer1AndAbleToAddedTheSequenceFromOfficer2_278649(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "278649");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Search");
			property.switchToPropertySearch();
			property.propertySearch.EnterToCaseDetails();
			property.propertySearch.clickSearch();
			property.propertySearch.ClickAtCaseNoInGrid();
			property.switchToPropertyIndex();
			property.propertyIndex.verifyAtCaseNo("21-000209");
			property.propertyIndex.verifyAddButtonIsDisable();
			property.propertyIndex.ClickPropertyBblIcon();
			property.switchToPropertyEntry();
			property.propertyEntry.ClickAddNewButton();
			property.propertyEntry.clickMainTab();
			property.propertyEntry.propertyEntryMainTab.selectAtProperty();
			property.propertyEntry.propertyEntryMainTab.enterDescription();
			property.propertyEntry.propertyEntryMainTab.enterAtValue();
			property.propertyEntry.clickRecoveredTab();
			property.propertyEntry.recoveredTab.tabDateAndTime();
			property.propertyEntry.recoveredTab.tabOutQuantity();
			property.propertyEntry.recoveredTab.tabOutValue();
			property.propertyEntry.recoveredTab.verifyAtValue();
			property.propertyEntry.recoveredTab.SelectAtStatus();
			property.propertyEntry.recoveredTab.selectAtInitialStorageLocation();
			property.switchToPropertyEntry();
			property.propertyEntry.SaveTheScreen();
			property.propertyEntry.verifyAtPropertySequence();
			property.propertyEntry.closeTheScreen();
			loader.logout();
			login.loginScreen.logonUsingTestContext();
			loader.navigateToModule("Property");
			loader.navigateToScreen("Property Search");
			property.switchToPropertySearch();
			property.propertySearch.EnterToCaseDetails();
			property.propertySearch.clickSearch();
			property.propertySearch.ClickAtCaseNoInGrid();
			property.switchToPropertyIndex();
			property.propertyIndex.verifyAtCaseNo("21-000209");
			property.propertyIndex.verifyAddButtonIsDisable();
			property.propertyIndex.ClickPropertyBblIcon();
		
			property.propertyEntry.verifyAddButtonIsDisabled();
			
			
		
		}
		//Automated by KIRAN :-     Date :-11/24/2021  Quarter:-4  Sprint:-4 Module:-PROPERTY
				@Test(groups = { "2022RBTestCasesProperty" })
				public void PropertyUpdatePrintIssue_287547(ITestContext testContext) {
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "287547");
					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
					loader.navigateToModule("Property");
					loader.navigateToScreen("Property Update");
					property.switchToPropertyUpdate();
					property.propertyUpdate.clickMoreFiltersButton();
					property.propertyUpdate.EnterAtCase();
					property.propertyUpdate.clickSearchButton();
					property.propertyUpdate.VerifyAtCaseNo();
					property.propertyUpdate.clickPrintButton();
					home.switchToSelectReport();
					home.selectReport.verifyAtReportName(3);
					
				}
		
		//Automated By Mithun, Date :- 28-12-2021 , Quarter:- Q4 , Sprint:- 6 , Module:- property
				@Test(groups = "PropertyEnhancement")
				public void VerifyThePropertyCodesAreDisplayed_284332(ITestContext testContext) {
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testContext.setAttribute("testID", "284332");
				
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Property");
				loader.navigateToScreen("Property Codes");
				property.switchToPropertyCodes();
				property.propertyCodes.verifyPropertyRoomActionLable();
				property.propertyCodes.verifyPropertyEntryCodesLable();
				property.propertyCodes.verifyDispositionLable();
				property.propertyCodes.verifyOfficerStatusLable();
				property.propertyCodes.verifySealStatusLable();
				property.propertyCodes.verifyHoldStatusLable();
				property.propertyCodes.clickPropertyEntryCodesRadioButton();
				property.propertyCodes.verifyAtDescriptionInGrid();
				property.propertyCodes.clickAtAtDescriptionInGrid();
				property.switchToPropertyCodesEntry();
				property.propertyCodesEntry.verifyAtDescription();
				property.propertyCodes.saveAndClose();
				property.switchToPropertyCodes();

				property.propertyCodes.clickPropertyRoomActionRadioButton();
				property.propertyCodes.verifyAtDescription1InGrid();

				property.propertyCodes.clickDispositionRadioButton();
				property.propertyCodes.verifyAtDescription2InGrid();

				property.propertyCodes.clickOfficerStatusRadioButton();
				property.propertyCodes.verifyAtDescription3InGrid();

				property.propertyCodes.clickSealStatusRadioButton();
				property.propertyCodes.verifyAtDescription4InGrid();

				property.propertyCodes.clickHoldStatusRadioButton();
				property.propertyCodes.verifyAtDescription5InGrid();

				objectIdentification.windowHandle.switchToMainWindow();
				}
				
				//Automated By Mithun, Date :- 28-12-2021 , Quarter:- Q4 , Sprint:- 6 , Module:- property 

				@Test(groups = "PropertyEnhancement") 

				public void VerifyTheNewAuditScreenIsDisplayedIn2022Version_289866(ITestContext testContext) { 

				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName()); 
				testContext.setAttribute("testID", "289866"); 

				Browser.NavigateToLoginScreen(); 
				login.loginScreen.Logon(); 
				loader.navigateToModule("Property"); 
				loader.navigateToScreen("Audit Search"); 
				property.switchToAuditSearch(); 
				property.auditSearch.ClickAddNew(); 
				property.switchToAuditEditEntry(); 
				property.auditEditEntry.verifyAuditNameLabelAsMandatory(); 
				property.auditEditEntry.verifyAuditTypeLabelAsMandatory(); 
				property.auditEditEntry.verifyAuditByLabelAsMandatory(); 
				property.auditEditEntry.verifyAuditDateTimeLabelAsMandatory(); 
				property.auditEditEntry.verifyCreateAuditButtonIsDisplayedAndEnabled(); 	
				property.switchToAuditEditEntry();				
			
				} 
				// Automated by KIRAN :- Date :- Quarter:-1 Sprint:- Module:-
				@Test
				public void VerifyTheCopyOptionShouldNotCopyRFIDInPropertyEntryScreen_289861(ITestContext testContext) {
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "289861");
					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
					loader.navigateToModule("Property");
					loader.navigateToScreen("Property Edit/Entry");
					property.switchToPropertyEditEntry();
					property.propertyEditEntry.enterAtCaseNumberAndTab();
					property.propertyEditEntry.clickAddNewPropertyReport();
					property.switchToPropertyEntry();
					property.propertyEntry.propertyEntryMainTab.SelectAtNIBRS();
					property.propertyEntry.propertyEntryMainTab.selectReasonAsStolen();
					property.propertyEntry.propertyEntryMainTab.selectPropertyAsAutomobiles();
					property.propertyEntry.propertyEntryMainTab.enterDecriptionAs10Shirts();
					property.propertyEntry.propertyEntryMainTab.EnterValueAs100();
					property.propertyEntry.propertyEntryMainTab.enterAtOwnerName();
					property.propertyEntry.clickRecoveredTab();
					property.propertyEntry.recoveredTab.tabDateAndTime();
					property.propertyEntry.recoveredTab.tabOutQuantity();
					property.propertyEntry.recoveredTab.tabOutValue();
					property.propertyEntry.recoveredTab.verifyAtValue();
					property.propertyEntry.recoveredTab.SelectAtStatus();
					property.propertyEntry.recoveredTab.SelectAtInitialStorageUsingCodeValue();
					property.propertyEntry.recoveredTab.enterAtScanBarcodeRFID();
					property.propertyEntry.SaveTheScreen();
					property.propertyEntry.VerifyAdditionSuccessfulMessage();
					property.propertyEntry.clickRecoveredTab();
					property.propertyEntry.recoveredTab.verifyBarCodeIsDisplayed();
					property.propertyEntry.ClickCopyButton();
					property.propertyEntry.clickRecoveredTab();
					property.propertyEntry.recoveredTab.verifyAtRFIDAsNull();
					property.propertyEntry.SaveTheScreen();
					property.propertyEntry.VerifyAdditionSuccessfulMessage();
					property.propertyEntry.verifyAtPropertySequence();
					property.switchToPropertyEditEntry();
					String PropertyNo= property.propertyEditEntry.ReadPropertyNo();
					property.propertyEditEntry.VerifyAtPropertyNo(PropertyNo, 0);
					
					
				}
				//Automated By Mithun, Date :- 31-01-2022 , Quarter:- Q1 , Sprint:- 2 , Module:- property 

				@Test(groups = "PropertyPullRequestFunctional", priority = 1) 

				public void VerifyWhetherOfficerAbleToSubmitThePullRequest_291886(ITestContext testContext) { 

				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName()); 
				testContext.setAttribute("testID", "291886"); 

				Browser.NavigateToLoginScreen(); 
				login.loginScreen.logonUsingTestContext();
				loader.navigateToModule("Property"); 
				loader.navigateToScreen("Request Entry"); 
				property.switchToRequestEntry();
				property.requestEntry.VerifyAtRequestedBy();
				property.requestEntry.TabDateRequiredandTime();
				property.requestEntry.SelectAtReason();
				property.requestEntry.itemsTab.EnterAtPropertyNo();
				property.requestEntry.itemsTab.ClickAdd();
				property.requestEntry.Save();
				property.switchToRequestEntry();
				property.requestEntry.verifyAdditionSccessful();
				String RequestNo=property.requestEntry.readRequestNo();
				property.requestEntry.VerifyAtRequestedBy();
				property.requestEntry.VerifyAtStatus();
				property.requestEntry.verifyRoutingTabDisplayed();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy();
				property.requestEntry.routingTab.verifyAtStatus();
				property.requestEntry.routingTab.selectAtNewAction();
				property.requestEntry.routingTab.tabDateAndTime();
				property.requestEntry.routingTab.save();
				property.switchToRequestEntry();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy1();
				property.requestEntry.routingTab.verifyAtStatus1();
				}
				
				
				//Automated By Mithun, Date :- 31-01-2022 , Quarter:- Q1 , Sprint:- 2 , Module:- property 
				@Test(groups = "PropertyPullRequestFunctional",priority = 2) 

				public void VerifyWhetherPropertyManagerAbletoRejectThePropertyinPullRequest_291896(ITestContext testContext) { 

				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName()); 
				testContext.setAttribute("testID", "291896"); 

				Browser.NavigateToLoginScreen(); 
				login.loginScreen.logonUsingTestContext();
				loader.navigateToModule("Property"); 
				loader.navigateToScreen("Pull Request"); 
				property.switchToPullRequest();
				property.pullRequest.enterAtRequestedBy();
				property.pullRequest.ClickSearchButton();
				property.pullRequest.ClickAtStatusInGrid(0);
				property.switchToRequestEntry();
				property.requestEntry.VerifyAtStatus();
				property.requestEntry.verifyRoutingTabDisplayed();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy();
				property.requestEntry.routingTab.verifyAtStatus();
				property.requestEntry.routingTab.selectAtNewAction();
				property.requestEntry.routingTab.tabDateAndTime();
				property.requestEntry.routingTab.save();
				property.switchToRequestEntry();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyRejectedCountAs1();
				property.requestEntry.routingTab.verifyAtRequestedBy1();
				property.requestEntry.routingTab.verifyAtStatus1();
				
				}			
				
				//Automated By Mithun, Date :- 31-01-2022 , Quarter:- Q1 , Sprint:- 2 , Module:- property 
				@Test(groups = "PropertyPullRequestFunctional",priority = 3) 

				public void VerifyWhetherOfficerAbleToReSubmitThePropertyInPullRequest_291899(ITestContext testContext) { 

				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName()); 
				testContext.setAttribute("testID", "291899"); 

				Browser.NavigateToLoginScreen(); 
				login.loginScreen.logonUsingTestContext();
				loader.navigateToModule("Property"); 
				loader.navigateToScreen("Pull Request"); 
				property.switchToPullRequest();
				property.pullRequest.enterAtRequestedBy();
				property.pullRequest.ClickSearchButton();
				property.pullRequest.ClickAtStatusInGrid(0);
				property.switchToRequestEntry();
				property.requestEntry.VerifyAtStatus();
				property.requestEntry.verifyRoutingTabDisplayed();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy();
				property.requestEntry.routingTab.verifyAtStatus();
				property.requestEntry.routingTab.selectAtNewAction();
				property.requestEntry.routingTab.tabDateAndTime();
				property.requestEntry.routingTab.save();
				property.switchToRequestEntry();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy1();
				property.requestEntry.routingTab.verifyAtStatus1();
				
				}
				
				//Automated By Mithun, Date :- 01-02-2022 , Quarter:- Q1 , Sprint:- 3 , Module:- property 
				@Test(groups = "PropertyPullRequestFunctional",priority = 4) 

				public void VerifyWhetherPropertyManagerAbleToUpdateThePropertyInPullRequest_291892(ITestContext testContext) { 

				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName()); 
				testContext.setAttribute("testID", "291892"); 

				Browser.NavigateToLoginScreen(); 
				login.loginScreen.logonUsingTestContext();
				loader.navigateToModule("Property"); 
				loader.navigateToScreen("Pull Request"); 
				property.switchToPullRequest();
				property.pullRequest.enterAtRequestedBy();
				property.pullRequest.ClickSearchButton();
				property.pullRequest.ClickAtStatusInGrid(0);
				property.switchToRequestEntry();
				property.requestEntry.itemsTab.clickCheckboxInGridUsingIndex(1);
				property.requestEntry.itemsTab.clickProceedToPropertyUpdateButton();
				property.switchToPropertyUpdateHelpWindow();
				property.propertyUpdateHelpWindow.ClickSelectAllCheckbox();
				property.propertyUpdateHelpWindow.ClickTheProceedWithSelectionButton();
				property.propertyUpdateHelpWindow.TabTheDateAndTime();
				property.propertyUpdateHelpWindow.SelectAtAction();
				property.propertyUpdateHelpWindow.EnterRemarks();
				property.propertyUpdateHelpWindow.ClickUpdateButtonWithConfrim();
				property.switchToPropertyUpdateHelpWindow();
				property.propertyUpdateHelpWindow.VerifyAtStatusUsingPropertyNo();
				property.propertyUpdateHelpWindow.Close();
				property.switchToRequestEntry();
				property.requestEntry.itemsTab.verifyClosedCheckboxCheckedInGridUsingPropertyNo();
				}
				
				//Automated By Mithun, Date :- 01-02-2022 , Quarter:- Q1 , Sprint:- 3 , Module:- property 
				@Test(groups = "PropertyPullRequestFunctional",priority = 5) 

				public void VerifyWhetherPropertyManagerAbleToAcceptThePullRequest_291891(ITestContext testContext) { 

				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName()); 
				testContext.setAttribute("testID", "291891"); 

				Browser.NavigateToLoginScreen(); 
				login.loginScreen.logonUsingTestContext();
				loader.navigateToModule("Property"); 
				loader.navigateToScreen("Pull Request"); 
				property.switchToPullRequest();
				property.pullRequest.enterAtRequestedBy();
				property.pullRequest.ClickSearchButton();
				property.pullRequest.ClickAtStatusInGrid(0);
				property.switchToRequestEntry();
				property.requestEntry.VerifyAtStatus();
				property.requestEntry.verifyRoutingTabDisplayed();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy();
				property.requestEntry.routingTab.verifyAtStatus();
				property.requestEntry.routingTab.selectAtNewAction();
				property.requestEntry.routingTab.tabDateAndTime();
				property.requestEntry.routingTab.save();
				property.switchToRequestEntry();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy1();
				property.requestEntry.routingTab.verifyAtStatus1();
				
				}
				
				//Automated By Mithun, Date :- 01-02-2022 , Quarter:- Q1 , Sprint:- 3 , Module:- property 
				@Test(groups = "PropertyPullRequestFunctional",priority = 6) 

				public void VerifyWhetherOfficerAbleToReadyThePropertyInPullRequest_291917(ITestContext testContext) { 

				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName()); 
				testContext.setAttribute("testID", "291917"); 

				Browser.NavigateToLoginScreen(); 
				login.loginScreen.logonUsingTestContext();
				loader.navigateToModule("Property"); 
				loader.navigateToScreen("Pull Request"); 
				property.switchToPullRequest();
				property.pullRequest.enterAtRequestedBy();
				property.pullRequest.ClickSearchButton();
				property.pullRequest.ClickAtStatusInGrid(0);
				property.switchToRequestEntry();
				property.requestEntry.VerifyAtStatus();
				property.requestEntry.verifyRoutingTabDisplayed();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy();
				property.requestEntry.routingTab.verifyAtStatus();
				property.requestEntry.routingTab.selectAtNewAction();
				property.requestEntry.routingTab.tabDateAndTime();
				property.requestEntry.routingTab.save();
				property.switchToRequestEntry();
				property.requestEntry.switchToRoutingTab();
				property.requestEntry.routingTab.verifyAtRequestedBy1();
				property.requestEntry.routingTab.verifyAtStatus1();
				
				}


		@AfterMethod(groups = { "PropertyEntry", "PropertyFunctional2020", "PropertyFunctional2020_1", "PropertyFunctional2020_2", "PropertyEntry2", "PropertyEntry1",
			"PropertyUpdate", "PropertyUpdate1", "PropertySearch", "PropertyModuleOtherScreens", "PropertyEntry",
			"2021DefectTestCases", "2021DefectTestCasesBatch2", "2021DefectTestCasesBatch3", "PropertyApproval",
			"PropertyUpdate", "PropertySearch", "PropertyModuleOtherScreens" ,"2022DefectTestCasesProperty","2022RBTestCasesProperty",
			"PropertyFunctionalBatch1", "PropertyFunctionalBatch2" ,"PropertyFunctionalBatch3"})
	public void afterMethodRecords(ITestResult testResult) {
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
		property.Reset();
	}

	@AfterSuite(groups = { "PropertyEntry", "PropertyFunctional2020", "PropertyFunctional2020_1", "PropertyFunctional2020_2", "PropertyEntry2", "PropertyEntry1",
			"PropertyUpdate", "PropertyUpdate1", "PropertySearch", "PropertyModuleOtherScreens", "PropertyEntry",
			"2021DefectTestCases", "2021DefectTestCasesBatch2", "2021DefectTestCasesBatch3", "PropertyApproval",
			"PropertyUpdate", "PropertySearch", "PropertyModuleOtherScreens","2022RBTestCasesProperty","2022DefectTestCasesProperty",
			"PropertyFunctionalBatch1", "PropertyFunctionalBatch2","PropertyFunctionalBatch3" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();

	}

}
