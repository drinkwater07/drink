package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Civil;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Settings;
import application.Traffic;
import application.TrafficWI;
import application.Vehicle;
import application.Warrants;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class WarrantScripts {

	public Warrants warrants;
	public Login login;
	public Loader loader;
	// public Names names;
	public Popup popup;
	public Settings settings;
	public ObjectIdentification objectIdentification;
	public Names names;
		public Vehicle vehicle;
	public Home home;
	public TrafficWI trafficWI;
	public Traffic traffic;
	public Civil civil;

	@BeforeSuite (groups={"2020DefectTestCases","WarrantFunctional"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod (groups={"2020DefectTestCases","WarrantFunctional"})
	public void beforeMethodRecords(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Warrants");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		warrants = new Warrants();
		popup = new Popup();
		settings = new Settings();
		objectIdentification = new ObjectIdentification();
		names = new Names();
		 vehicle = new Vehicle();
		 home = new Home();
		 traffic = new Traffic(); 
	      trafficWI = new TrafficWI();
	      civil = new Civil();

	}

	@Test (groups = { "WarrantFunctional"},priority =1)
	public void WarrentEntry_107576(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107576");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Entry");
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerifyWantOrWarrantNoEditable();
		warrants.warrantEntry.EnterAtWarrantNumber();
		warrants.warrantEntry.EnterAtWarrantLastName();
		warrants.warrantEntry.EnterAtWarrantFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerfiyLastNameInNameEntry();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.EnterIssuedDate();
		warrants.warrantEntry.VerifyIssuedDateAsCurrentDate();
		warrants.warrantEntry.clickSave();
		warrants.warrantEntry.VerifyAcknowledgeDateRequired();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.EnterExpiredDate();
		warrants.warrantEntry.VerifyTypeAsAnticipatoryBail();
		warrants.warrantEntry.VerifyStatusAsActiveOpen();
		warrants.warrantEntry.EnterAtPlateNumber();
		warrants.warrantEntry.EnterAtState();
		vehicle.switchToVehicleBoatSearchHelpWindow();
		vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToMainTab();
		warrants.warrantEntry.warrantEntryMainTab.EnterAsWantCharge();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.verifyAdditionSuccessfulMessage();
	}

	@Test (groups = { "WarrantFunctional"},priority =2)
	public void WarrantEntryMainTab_107577(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107577");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarrantNoInFromAndTo();
		warrants.warrantSearch.SelectStatusAsActiveOpen();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantSearch.VerifyMouseOverNameColumn(0);
		warrants.warrantSearch.VerifyRecordInBlackColor(0);
		warrants.warrantSearch.ClickAtWarantNo();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerfiyLastNameInNameEntry();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerifyWarrantIconColorOrange(); // due color changes id was not correct
		warrants.warrantEntry.ClickWarrantIcon();
		warrants.switchToWarrantDetails();
		warrants.warrantDetails.VerifyWarrantCountAs2();
		warrants.warrantDetails.CloseWarrantDetailsScreen();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToMainTab();
		warrants.warrantEntry.warrantEntryMainTab.VerifyCompliantAsComplaint();
		warrants.warrantEntry.warrantEntryMainTab.VerifyHeldByAsDefault();
		warrants.warrantEntry.warrantEntryMainTab.SelectProductionOrderRestrainingOrder();
		warrants.warrantEntry.warrantEntryMainTab.EnterJudgeName();
		warrants.warrantEntry.warrantEntryMainTab.enterAtPetitionerNameID(); 
		warrants.warrantEntry.warrantEntryMainTab.SelectServiceLimit();
		warrants.warrantEntry.warrantEntryMainTab.EnterBailAs100();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.verifyUpdatedSuccessfulMessage();

	}

	@Test (groups = { "WarrantFunctional","Exclude93"},priority =3) //Only 87 and 82
	public void WarrantEntryChargeTab_107580(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107580");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Names Search");
		warrants.switchToWarrantNamesSearch();
		warrants.warrantNamesSearch.EnterAtLastName();
		warrants.warrantNamesSearch.EnterAtFirstName();
		warrants.warrantNamesSearch.SelectWarrantStatusAsActiveOpen();
		warrants.warrantNamesSearch.ClickSearchButton();
		warrants.warrantNamesSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantNamesSearch.VerifyMouseOverNameColumn(0);
		 //PlayBack.TakeScreenshot(WarrantTestContext, "MouseOverScreenShot");
		warrants.switchToWarrantNamesSearch();
		warrants.warrantNamesSearch.ClickRow(0);
		warrants.switchToWarrantDetails();
		warrants.warrantDetails.VerifyAtWarrantNo(0);
		warrants.warrantDetails.ClickAtWarantNoInGrid();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerifyWarrantIconColorOrange(); // color changed
		warrants.warrantEntry.SwitchToMainTab();
		warrants.warrantEntry.warrantEntryMainTab.ClickDetailedChargesCheckBox();
		warrants.warrantEntry.VerifyChargeTabAppears();
		warrants.warrantEntry.SwitchToChargesTab();
		warrants.warrantEntry.chargesTab.EnterAtCharge();
		warrants.warrantEntry.chargesTab.ClickAddButton();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToHistoryTab();

	}

	@Test(groups = { "WarrantFunctional"},priority =4)
	public void WarrantEntryNarrativeTab_107582(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107582");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarrantNoInFromAndTo();
		warrants.warrantSearch.SelectStatusAsActiveOpen();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantSearch.ClickAtWarantNo();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToNarrativeTab();
		warrants.warrantEntry.narrativeTab.EnterGroupofString();
		warrants.warrantEntry.narrativeTab.ClickLockEntryCheckBox();
		warrants.warrantEntry.narrativeTab.VerifyEmplNoMandatory();
		warrants.warrantEntry.narrativeTab.EnterAtEmpl();  //updated
		warrants.switchToWarrantEntryAuthenticateWindow();
		warrants.warrentEntryAuthenticatorWindow.enterAtPassword();
		warrants.warrentEntryAuthenticatorWindow.clickAcceptButton();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.narrativeTab.VerifyTemplateDisabled();
		warrants.warrantEntry.SwitchToHistoryTab();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyHistoryTypeAsNarrativeLock(0);
		warrants.switchToWarrantEntry();
	}

	@Test(groups = { "WarrantFunctional","Exclude93"},priority =5)//Only 87 and 82
	public void WarrantEntryStatusTab_107583(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107583");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Names Search");
		warrants.switchToWarrantNamesSearch();
		warrants.warrantNamesSearch.EnterAtLastName();
		warrants.warrantNamesSearch.EnterAtFirstName();
		warrants.warrantNamesSearch.SelectWarrantStatusAsActiveOpen();
		warrants.warrantNamesSearch.ClickSearchButton();
		warrants.warrantNamesSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantNamesSearch.ClickRow(0);
		warrants.switchToWarrantDetails();
		warrants.warrantDetails.VerifyAtWarrantNo(0);
		warrants.warrantDetails.ClickAtWarantNoInGrid();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToStatusTab();
		warrants.warrantEntry.statusTab.SelectStatusAsOther();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.warrantEntry.statusTab.VerifyAcknowledgeUpdateStatus();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToStatusTab();
		warrants.warrantEntry.statusTab.SaveStatusTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToHistoryTab();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyHistoryTypeAsStatusUpdate(0);
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyRemarksAsOther(0);
		warrants.switchToWarrantEntry();

	}

	@Test(priority=6,groups = { "WarrantFunctional"})
	public void WarrantEntryServiceTab_107584(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107584");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarrantNoInFromAndTo();
		warrants.warrantSearch.SelectStatusAsActiveOpen();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantSearch.ClickAtWarantNo();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerifyWarrantIconColorOrange();
		warrants.warrantEntry.SwitchToServiceTab();
		warrants.warrantEntry.serviceTab.TabServiceAttemptedDate();
		warrants.warrantEntry.serviceTab.VerifyCurrentDate();
		warrants.warrantEntry.serviceTab.EnterAtAttemptedBy();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.clickSave();
		warrants.warrantEntry.serviceTab.VerifyAcknowledgeUpdateServiceTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToServiceTab();
		warrants.warrantEntry.serviceTab.SaveServiceTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToHistoryTab();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyHistoryTypeAsServiceUpdate(0);
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyAtByPF(0);
		warrants.switchToWarrantEntry();
	}

	@Test (priority=7,groups = { "WarrantFunctional"})
	public void WarrantEntryNotesTabandClearTab_107587(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107587");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarrantNoInFromAndTo();
		warrants.warrantSearch.SelectStatusAsActiveOpen();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantSearch.ClickAtWarantNo();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerifyWarrantIconColorOrange();
		warrants.warrantEntry.SwitchToNotesTab();
		warrants.warrantEntry.warrantEntryNotesTab.EnterNotes();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.clickSave();
		warrants.warrantEntry.warrantEntryNotesTab.VerifyAcknowledgeUpdateNotesTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToNotesTab();
		warrants.warrantEntry.warrantEntryNotesTab.SaveNotesTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToHistoryTab();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyHistoryTypeAsNotes(0);
		warrants.warrantEntry.warrantEntryHistoryTab.ClickRemarkColumncell(0);
		warrants.warrantEntry.warrantEntryHistoryTab.ClickRemarksOkbutton();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToClearTab();
		warrants.warrantEntry.clearTab.SelectDispostionAsWithdrawn();
		warrants.warrantEntry.clearTab.EnterCurrentDateAndTime();
		warrants.warrantEntry.clearTab.VerifyCurrentDate();
		warrants.warrantEntry.clearTab.EnterLoggedPF();
		warrants.warrantEntry.clearTab.EnterRemarksAsWithdrawn();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.clickSave();
		warrants.warrantEntry.clearTab.VerifyAcknowledgeUpdateClearTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToClearTab();
		warrants.warrantEntry.clearTab.SaveClearTab();
		settings.switchToPhoenixAuthenticatorWindow(); // Authendicator window not opened properly in chrome
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		warrants.switchToWarrantEntry();
//		warrants.warrantEntry.Save();
//		warrants.warrantEntry.Yes();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToHistoryTab();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyHistoryTypeAsWarrantClearance(0);
		warrants.warrantEntry.warrantEntryHistoryTab.ClickRemarkColumncell(0);
		warrants.warrantEntry.warrantEntryHistoryTab.ClickRemarksOkbutton();
		warrants.switchToWarrantEntry();

	}

	@Test (groups = { "WarrantFunctional"},priority =8)
	public void VerifyWarrantClearance_107588(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107588");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarrantNoInFromAndTo();
		warrants.warrantSearch.SelectClearanceStatusAsClosed();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantSearch.VerifyStatusAsWithdrawn(0);
		warrants.warrantSearch.VerifyRecordInGrayColor(0);
		warrants.warrantSearch.ClickAtWarantNo();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerifyReopenAppear();
		warrants.warrantEntry.VerifySaveIconDisabled();
		warrants.warrantEntry.ClickReopen();  
		warrants.warrantEntry.VerifyConfirmReopenMessage();  //updated
		settings.switchToPhoenixAuthenticatorWindow();
		settings.phoenixAuthenticatorWindow.enterAtPassword(); // Authendicator window not opened properly in chrome
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		warrants.warrantEntry.VerifyAcknowlegeReopenMessage();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToStatusTab();
		warrants.warrantEntry.statusTab.SelectStatusasActiveOpen();
		warrants.warrantEntry.statusTab.EnterDateAsCurrentDate();
		warrants.warrantEntry.statusTab.EnterRemarksAsReOpentheWarrant();
		warrants.warrantEntry.statusTab.SaveStatusTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.VerifyWarrantIconColorOrange();
		warrants.warrantEntry.SwitchToHistoryTab();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyHistoryTypeAsWarrantReopened(0);
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyAtByPF(0);
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyRemarkAsActiveOpen(0);
		warrants.warrantEntry.CloseWarrantEntryScreen();
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.VerifyAcknowledgeRecordFound();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test (groups = { "WarrantFunctional"},priority =9)
	public void WarrantBatchClearance_107592(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107592");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Batch Clearance");
		warrants.switchToBatchClearance();
		warrants.batchClearance.SelectDispositionAsWithdrawn();
		warrants.batchClearance.EnterDate();
		warrants.batchClearance.EnterAtByPFCode();
		warrants.batchClearance.EnterRemarkAsBatchClearance();
		warrants.batchClearance.EnterAtWarrantNo();
		warrants.batchClearance.ClickAddButton();
		warrants.batchClearance.Save();
		settings.switchToPhoenixAuthenticatorWindow(); // Authendicator window not opened properly in chrome
		settings.phoenixAuthenticatorWindow.enterAtPassword();
		settings.phoenixAuthenticatorWindow.clickAcceptButton();
		warrants.batchClearance.VerifyAcknowledgeUpdateSuccess();
		warrants.switchToBatchClearance();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarrantNoInFromAndTo();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.VerifyWarNoAtWarrant(0);
		warrants.warrantSearch.VerifyStatusAsWithdrawn(0);
		warrants.warrantSearch.VerifyRecordInGrayColor(0);

	}

	@Test(groups = { "WarrantFunctional","Exclude93"},priority =10)//Only 87 and 82
	public void VerifyWarrantClearanceName_107617(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107617");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Names Search");
		warrants.switchToWarrantNamesSearch();
		warrants.warrantNamesSearch.EnterAtLastName();
		warrants.warrantNamesSearch.EnterAtFirstName();
		warrants.warrantNamesSearch.ClickSearchButton();
		warrants.warrantNamesSearch.VerifyAcknowledgeRecordFound();
		warrants.switchToWarrantNamesSearch();
		warrants.warrantNamesSearch.ClickIncludeNameCheckBox();
		warrants.warrantNamesSearch.ClickSearchButton();
		warrants.warrantNamesSearch.VerifyWarrantLastNameWarrantFirstName(0);
		warrants.warrantNamesSearch.ClickRowAtWarrantLastNameWarrantFirstName();
		warrants.switchToWarrantDetails();
		warrants.warrantDetails.VerifyWarrantCountAs0(); //updated
		warrants.warrantDetails.VerifyAtWarrantNo(0);
		warrants.warrantDetails.VerifyRecordInRedColor(0);
		warrants.warrantDetails.CloseWarrantDetailsScreen();
		warrants.switchToWarrantNamesSearch();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Warrant Type");
		warrants.switchToWarrantType();
		warrants.warrantType.VerifyWarrantTypeAsA(1);
		warrants.warrantType.VerifyDefaultDispostionAsBailPosted(1);
		warrants.warrantType.VerifyDescriptionAsAnticipatoryBail(1);
		warrants.warrantType.VerifyExpirationRequiredAsMandatory(1);
		warrants.warrantType.VerifyWarrantIsChecked(1);
		warrants.warrantType.ClickRow(1);
		warrants.switchToWarrantTypeEntry();
		warrants.warrantTypeEntry.CloseWarrantTypeScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "WarrantFunctional"},priority =11)
	public void VerifyWarrantIconApearsinotherModules_107745(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "107745");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.EnterAtWarrantLastName();
		names.nameSearch.EnterAtWarrantFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyWarrantIconInSearchscreen(0);
		names.nameSearch.VerifyWarrantLastNameWarrantFirstName(0);
		names.nameSearch.ClickRowAtWarrantLastNameWarrantFirstName();
		names.switchToNameEntry();
		names.nameEntry.VerifyWarrantIconButton();
		names.nameEntry.closeTheScreen();
		names.switchToNameSearch();
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.clickAddnewButton();
		names.switchToArrestEntry();
		names.arrestEntry.EnterLastNameAtWarrantLastName();
		names.arrestEntry.EnterFirstNameAtWarrantFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		names.switchToArrestEntry();
		names.arrestEntry.VerifyWarrantIconButton();
		names.arrestEntry.closeTheScreen();
		names.switchToArrestSearch();
		loader.navigateToScreen("Gun Permit entry");
		names.switchToGunPermitEntry();
		names.gunPermitEntry.EnterLastNameAtWarrantLastName();
		names.gunPermitEntry.EnterFirstNameAtWarrantFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		names.switchToGunPermitEntry();
		names.gunPermitEntry.VerifyWarrantIconButton();
		names.gunPermitEntry.CloseGunPermitEntryScreen();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Entry");
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.enterLastNameAtWarrantLastName();
		trafficWI.citationEntry.enterFirstNameAtWarrantFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.verifyWarrantIcon();
		trafficWI.citationEntry.closeCitationEntryScreen();
		loader.navigateToScreen("Parking Entry");
		trafficWI.switchToParkingEntry();
		trafficWI.parkingEntry.defendant1.enterLastNameAtWarrantLastName();
		trafficWI.parkingEntry.defendant1.enterFirstNameAtWarrantFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		trafficWI.switchToParkingEntry();
		trafficWI.parkingEntry.defendant1.verifyWarrantIconButton();
		trafficWI.parkingEntry.closeParkingEntryScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "WarrantFunctional"},priority =12)
	public void VerifyRolesPermission_108044(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "108044");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.ClickRowWithActiveOpen();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToStatusTab();
		warrants.warrantEntry.statusTab.VerifyAllFieldsGrayedOut();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToServiceTab();
		warrants.warrantEntry.serviceTab.VerifyAllFieldsGrayedOut();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToClearTab();
		warrants.warrantEntry.clearTab.VerifySaveAndResetButtonGrayedOut();
		warrants.warrantEntry.clearTab.VerifyDispositionGrayedOut();
		warrants.warrantEntry.clearTab.VerifyDateGrayedOut();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.CloseWarrantEntryScreen();
		warrants.switchToWarrantSearch();
		loader.navigateToScreen("Batch Clearance");
		warrants.switchToBatchClearance();
		warrants.batchClearance.VerifyAllFieldsGrayedOut();
		warrants.batchClearance.VerifyRefreshADDClearbuttonDisabled();

	}

	@Test(groups={"2020DefectTestCases"})
	public void Police2020RecordsModule_245188(ITestContext testContext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "245188");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.SelectStatusAsActiveOpen();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.ClickAtWarNoInGrid();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToStatusTab();
		warrants.warrantEntry.statusTab.SelectAtStatus();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.statusTab.VerifyAcknowledgeUpdateStatus();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToStatusTab();
		warrants.warrantEntry.statusTab.SaveStatusTab();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
	}

	@Test(groups={"2020DefectTestCases"}) // Automated by Stalin
	public void Warrantsearchresultsscreen_257054(ITestContext testContext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257054");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Entry");
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.EnterAtWarrantNumber();
		warrants.warrantEntry.EnterAtNameID();
		warrants.warrantEntry.verifyAtNameShownInWarrant();
		warrants.warrantEntry.verifyAtAddressShownInWarrant();
		warrants.warrantEntry.EnterIssuedDate();
		warrants.warrantEntry.EnterExpiredDate();
		warrants.warrantEntry.selectAtType();
		warrants.warrantEntry.selectAtStatus();
		warrants.warrantEntry.SwitchToMainTab();
		warrants.warrantEntry.warrantEntryMainTab.enterAtWantCharge();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToHistoryTab();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyAtByPF(0);
		warrants.warrantEntry.warrantEntryHistoryTab.verifyAtDateTimeInGrid();
		warrants.warrantEntry.warrantEntryHistoryTab.VerifyRemarkAsActiveOpen(0);
		warrants.warrantEntry.CloseWarrantEntryScreen();
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.verifyAtDateInGrid();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups={"2020DefectTestCases"}) // oct Sprint 2 Automated by Mahesha
	public void PoliceDefect2020_257057(ITestContext testContext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257057");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.clickAddNewButton();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.EnterAtNameID();
		warrants.warrantEntry.verifyAtNameShownInWarrant();
		warrants.warrantEntry.verifyAtAddressShownInWarrant();
		warrants.warrantEntry.verifyAtDetails();
		warrants.warrantEntry.verifyProfilePicDisplayed();
		warrants.warrantEntry.EnterIssuedDate();
		warrants.warrantEntry.EnterExpiredDate();
		warrants.warrantEntry.EnterAtWarrantNumber();
		warrants.warrantEntry.SwitchToMainTab();
		warrants.warrantEntry.warrantEntryMainTab.EnterAsWantCharge();
		warrants.warrantEntry.Save();
		warrants.switchToWarrantEntry();

	}

	@Test(groups={"2020DefectTestCases"}) // Q4 sprint4 Automated by Mahesha
	public void Police2020RecordsModule_260152(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260152");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter1018AsTrue();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarNoInFromAndTo();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.ClickAtWarNoInGrid();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToNarrativeTab();
		warrants.warrantEntry.narrativeTab.ClickLockEntryCheckBox();
		warrants.warrantEntry.narrativeTab.VerifyEmplNoMandatory();
		warrants.warrantEntry.narrativeTab.EnterAtEmpl();
		warrants.switchToWarrantEntryAuthenticateWindow();
		warrants.warrentEntryAuthenticatorWindow.enterAtInvalidPassword();
		warrants.warrentEntryAuthenticatorWindow.clickAcceptButton();
		warrants.warrentEntryAuthenticatorWindow.verifyInvalidUserNamePassAckMsg();
		warrants.switchToWarrantEntryAuthenticateWindow();
		warrants.warrentEntryAuthenticatorWindow.enterAtPassword();
		warrants.warrentEntryAuthenticatorWindow.clickAcceptButton();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToNarrativeTab();
		warrants.warrantEntry.narrativeTab.enterAtNarrativeEmplDate();
		warrants.warrantEntry.Save();

		warrants.switchToWarrantEntry();
		warrants.warrantEntry.clickRefreshButton();
		warrants.warrantEntry.SwitchToNarrativeTab();
		warrants.warrantEntry.narrativeTab.verifyAtLockEntryAndEmpFieldsDisplayed();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter1018AsFalse();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Search");
		warrants.switchToWarrantSearch();
		warrants.warrantSearch.ClickClearButton();
		warrants.warrantSearch.ClickWarNoCheckBox();
		warrants.warrantSearch.EnterAtWarNoInFromAndTo();
		warrants.warrantSearch.ClickSearchButton();
		warrants.warrantSearch.ClickAtWarNoInGrid();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.SwitchToNarrativeTab();
		warrants.warrantEntry.narrativeTab.verifyAtLockEntryAndEmpFieldsDisplayed();
	}
	
	
	@Test(groups = { "2020DefectTestCases"})// Q4 Sprint 5 Automated by Mahesha
	public void WarrantIconColorChangesforNames_261092(ITestContext testContext)
	{

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		 testContext.setAttribute("testID", "261092"); 
	    Browser.NavigateToLoginScreen();
	    login.loginScreen.Logon();
	    loader.navigateToModule("Names");
	    loader.navigateToScreen("Name Search");
	    names.switchToNameSearch();
	    names.nameSearch.enterAtNameID();
	    names.nameSearch.clickSearchButton();
	    names.nameSearch.ClickAtNameID();
	    names.switchToNameEntry();
	    names.nameEntry.clickWarrantIcon(); 
	    warrants.switchToWarrantDetails();
	    warrants.warrantDetails.VerifyAtWarrantNo(0);
	    warrants.warrantDetails.VerifyWarrantStatusAsActiveOpen(0);
	    warrants.warrantDetails.CloseWarrantDetailsScreen();
	   
	    names.switchToNameSearch();
	    names.nameSearch.reloadNameSearch();
	    names.switchToNameSearch();
	    names.nameSearch.enterAtNameID();
	    names.nameSearch.clickSearchButton();
	    names.nameSearch.VerifyWarrantIconColorIsOrangeInGrid(0);
	  
	    names.nameSearch.reloadNameSearch();
	    names.switchToNameSearch();
	    names.nameSearch.enterAtNameID1();
	    names.nameSearch.clickSearchButton();
	    
	    names.nameSearch.VerifyWarrantIconColorIsGreenInGrid(0);
	    names.nameSearch.ClickWarrantIconInGridUsingNameIDs(1);
	    warrants.switchToWarrantDetails();
	    warrants.warrantDetails.VerifyWarrantStatusAsActiveOpen(0);
	    warrants.warrantDetails.VerifyWarrantStatusAsExpired(1);
	    warrants.warrantDetails.VerifyRecordInRedColor(1);
	    warrants.warrantDetails.CloseWarrantDetailsScreen();
	   
	    names.nameSearch.reloadNameSearch();
	    names.switchToNameSearch();
	    names.nameSearch.EnterAtLastName();
	    names.nameSearch.EnterAtFirstName();
	    names.nameSearch.clickSearchButton();
	    names.nameSearch.VerifyWarrantIconColorIsGreenInGrid(0);
	    names.nameSearch.ClickWarrantIconInGridUsingNameIDs(2);
	    //names.nameSearch.VerifyWarrantIconNotDisplayed(0);
	    warrants.switchToWarrantDetails();
	    warrants.warrantDetails.VerifyWarrantStatusAsActiveOpen(0);
	    warrants.warrantDetails.CloseWarrantDetailsScreen();
	    
	    names.nameSearch.reloadNameSearch();
	    names.switchToNameSearch();
	    names.nameSearch.enterAtLastName1();
	    names.nameSearch.clickSearchButton();
	    
	    names.nameSearch.VerifyWarrantIconNotDisplayed(0); 
	    names.nameSearch.VerifyWarrantIconColorIsOrangeInGrid(0);
	    names.nameSearch.ClickWarrantIconInGridUsingNameIDs(3);
	    names.nameSearch.VerifyWarrantIconNotDisplayed(0);
	    warrants.switchToWarrantDetails();
	    warrants.warrantDetails.VerifyWarrantStatusAsExpired(0);
	    warrants.warrantDetails.VerifyWarrantStatusAsExpired(1);
	    warrants.warrantDetails.VerifyRecordInRedColor(0);
	    warrants.warrantDetails.VerifyRecordInRedColor(1);
	}
	
	@Test(groups = { "2020DefectTestCases"}) // Q3 Sprint 3
	public void toVerifyLookUpFunctionalityFromWarrantEntryAndPaperEntryScreen_278655(ITestContext testcontext) {
		testcontext.setAttribute("testID", "278655");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Warrant");
		loader.navigateToScreen("Warrant Entry");
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.enterAtAuthorityLookUpEdit();
		warrants.warrantEntry.verifyAtAuthorityCodeDescription();
		warrants.warrantEntry.clickAuthorityLookUpIcon();
		warrants.warrantEntry.verifyAuthorityORINumberInCodedSearchGrid();
		warrants.warrantEntry.verifyAuthorityTitleInCodedSearchGrid();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.closeScreen();
		warrants.switchToWarrantEntry();
		warrants.warrantEntry.CloseWarrantEntryScreen();
		loader.navigateToModule("Civil");
		loader.navigateToScreen("Paper Entry");
		civil.switchToPaperEntry();
		civil.paperEntry.enterAtPaperType();
		civil.paperEntry.verifyAtPaperTypeDescription();
		civil.paperEntry.clickPaperTypeLookUpIcon();
		civil.paperEntry.verifyPaperTypeCodeValueInCodedSearchGrid();
		civil.paperEntry.verifyPapertTypeDescriptionInCodedSearchGrid();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.closeScreen();
		civil.switchToPaperEntry();
	}

	
	
	//Automated by:- Mahesha, Date :-  10/19/2021 , Quarter:- Q4 , Sprint:- 2  , Module:-  Warrant .

	@Test(groups = { "2020DefectTestCases" })
	public void NameSearchScreenWarrantIconColumn_278224(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	      testcontext.setAttribute("testID", 278224);
	       Browser.NavigateToLoginScreen();
	       login.loginScreen.Logon();
	       loader.navigateToModule("Names");
	       loader.navigateToScreen("Name Search");
	       names.switchToNameSearch();
	       names.nameSearch.enterAtNameID();
	       names.nameSearch.clickSearchButton();
	       names.nameSearch.ClickWarrantIconInGridUsingNameID();
	       warrants.switchToWarrantDetails();
	       warrants.warrantDetails.VerifyWarrantStatusAsActiveOpen(0);
	       warrants.warrantDetails.VerifyAtWarrantNo(0);

	}
	
	// Automated by Stalin // Date :12/27/2021 //Quarter:04 // Sprint:06 //Module:Warrant //DB: PoliceMJAutomation
	@Test
	public void VerifyDateofEmancipatioJuvFieldvalueDisplayUnderWarrantEntry_289953(ITestContext testContext)
	{
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "289953");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Warrant");
	loader.navigateToScreen("Warrant Entry");
	warrants.switchToWarrantEntry();
	warrants.warrantEntry.EnterAtWarrantNumber();
	warrants.warrantEntry.EnterAtNameID();
	warrants.warrantEntry.EnterIssuedDate();
	warrants.warrantEntry.EnterExpiredDate();
	warrants.warrantEntry.clickNameInfoIcon();
	names.switchToNameEntry();
	names.nameEntry.switchToMainTab();
	String birthDate = names.nameEntry.nameEntryMainTab.getBirthDate();
	names.switchToNameEntry();
	names.nameEntry.closeTheScreen();
	warrants.switchToWarrantEntry();
	warrants.warrantEntry.SwitchToMainTab();
	warrants.warrantEntry.warrantEntryMainTab.verifyAtActiveDateOfEmancipation(birthDate);
	warrants.warrantEntry.warrantEntryMainTab.verifyAtDateOfEmancipation();
	warrants.warrantEntry.warrantEntryMainTab.enterAtWantCharge();
	warrants.switchToWarrantEntry();
	warrants.warrantEntry.Save();
	warrants.switchToWarrantEntry();

	}
	//Automated by TesterName :- Mani Date :-12/27/2021 Sprint:-6 Quarter:-4 Module:-Warrant
		@Test(groups = { "" })
		public void ToVerifyWarrantResetButtonFromWarrantHistory_289940(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "289940");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Warrant");
			loader.navigateToScreen("Warrant Entry");
			warrants.switchToWarrantEntry();
			warrants.warrantEntry.SwitchToMainTab();
			warrants.warrantEntry.SwitchToHistoryTab();
			warrants.warrantEntry.warrantEntryHistoryTab.clickResetButton();
			warrants.switchToWarrantEntry();
			warrants.warrantEntry.veritfyStatusBarMessageAsEmpty();
		}
		//Automated by KIRAN :-     Date :-2/7/2022  Quarter:-1  Sprint:-3  Module:-Warrant
		@Test
		public void ToVerifyDeleteOptionFromWarrantTypeEntry_292613(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "292613");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Warrant");
			loader.navigateToScreen("Warrant Type");
			warrants.switchToWarrantType();
			warrants.warrantType.VerifyAtDescriptionUsingWarrantType();
			warrants.warrantType.VerifyWarrantIsCheckedUsingWarrantType();
			
			warrants.warrantType.ClickRow(1);
			warrants.switchToWarrantTypeEntry();
			warrants.warrantTypeEntry.clickDeleteIcon();
			warrants.warrantTypeEntry.verify8536ThisWarrantTypecannotbedeleted();
			warrants.switchToWarrantTypeEntry();
			warrants.warrantTypeEntry.Save();
			warrants.warrantTypeEntry.verifyUpdatesucessFullMessage();
			warrants.warrantTypeEntry.CloseWarrantTypeScreen();
			warrants.switchToWarrantType();
			warrants.warrantType.VerifyAtDescriptionUsingWarrantType1();
			warrants.warrantType.ClickRow(0);
			warrants.switchToWarrantTypeEntry();
			warrants.warrantTypeEntry.clickDeleteIcon();
			warrants.warrantTypeEntry.verifyDeleteConfirmMessage();
			warrants.switchToWarrantType();
			warrants.warrantType.verifyWarrantIsNotPresentInGrid();
			
			
		}
		
		//Automated by:-Dinesh , Date :-02/14/2022 , Quarter:-Q1 , Sprint:-3 , Module:-Warrant.

		@Test(groups = { "" })
		public void AbleToFetchTheTextSearchResultsBasedOnSearchCriteria_289839(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "289839");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
//			loader.navigateToModule("Module");
//			loader.navigateToScreen("Screen");
			loader.clickOnPNXLogo();
			loader.mouseHoverOnPnxLogoAction("Tools");
			loader.mouseHoverAndClickOnPnxLogoAction("Text Search");
			settings.switchToTextSearchHelpWindow();
			settings.textSearchHelpWindow.selectAtTextType();
			settings.textSearchHelpWindow.deleteFromDate();
			settings.textSearchHelpWindow.clickSearchButton();
			settings.textSearchHelpWindow.selectAtRowInGridUsingIndex(0);
			warrants.switchToWarrantEntry();
			warrants.warrantEntry.SwitchToNarrativeTab();
			warrants.warrantEntry.narrativeTab.VerifyAddNewOrEditDesabled();
			
		}
	@AfterMethod(groups={"WarrantFunctional","2020DefectTestCases"})
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
			warrants.Reset();
		}
	  @AfterSuite(groups={"WarrantFunctional","2020DefectTestCases"})
	  public void afterRunSuite()
	  {
		  ExtentReport.GenerateHTML();
	  	System.gc();
	  	}
}
