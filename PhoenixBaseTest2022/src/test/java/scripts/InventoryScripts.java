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
import application.Popup;
import application.Settings;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class InventoryScripts {

	public Inventory inventory;
	public Names names;
	public Login login;
	public Loader loader;
	public Popup popup;
	public Geo geo;
	public ObjectIdentification objectIdentification;
	public Home home;
	public Settings settings;
	public Vehicle vehicle;
	public Activity activity;

	/*
	 * public void BeforeTestMethod(ITestContext testContext) {
	 * testContext.setAttribute("moduleName", "Inventory"); Playback.testContext =
	 * testContext; Playback.start(); inventory = new Inventory(); login = new
	 * Login(); loader = new Loader(); names = new Names(); geo = new Geo();
	 * objectIdentification = new ObjectIdentification(); home = new Home(); popup =
	 * new Popup(); settings = new Settings(); vehicle = new Vehicle(); activity =
	 * new Activity(); }
	 */

	@BeforeSuite(groups = { "expandableItem", "fleet", "assertItem", "inventoryConfig" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);

	}

	@BeforeMethod(groups = { "expandableItem", "fleet", "assertItem", "inventoryConfig" })
	public void BeforeTestMethodSchedule(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Inventory");
		Playback.testContext = testContext;

		Playback.start();
		inventory = new Inventory();
		login = new Login();
		loader = new Loader();
		names = new Names();
		geo = new Geo();
		objectIdentification = new ObjectIdentification();
		home = new Home();
		popup = new Popup();
		settings = new Settings();
		vehicle = new Vehicle();
	}

	@Test(groups = { "expandableItem" }, priority = 8)
	public void ExpendableItem_119985(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "119985");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAddNew();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.TabEntryDate();
		inventory.inventoryEntry.verifyCurrentDateAutoPopulatesInEntryDate();
		inventory.inventoryEntry.selectAtInvName();
		inventory.inventoryEntry.selectAtCategory();
		inventory.inventoryEntry.verifyExpendableItemAppears();
		inventory.inventoryEntry.selectAtType();
		inventory.inventoryEntry.selectAtMake();
		inventory.inventoryEntry.enterAtModel();
		inventory.inventoryEntry.enterAtDescription();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyBarCodeImage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
	}

	@Test(groups = { "expandableItem" }, priority = 1)
	public void ExpendableItem_119993(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "119993");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtComment();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectAtCheckOutType();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterCheckout();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtExistingDeptTracking();
		inventory.inventoryEntry.inventoryEntryMainTab.Verify1046AcknowledgeMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtNewDeptTracking();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtReorderQuantity();
		inventory.inventoryEntry.inventoryEntryMainTab.clickLogEquipmentCheckBox();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
	}

	@Test(groups = { "expandableItem" }, priority = 2)
	public void ExpendableItem_120005(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "120005");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.TabOutPurchaseDate();
		inventory.inventoryEntry.purchaseHistoryTab.TabOutByPF();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyCurrentDateAutoPopulatesInPurchaseDate();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyDefaultLoggedPfAutoPopulatesInByField();
		inventory.inventoryEntry.purchaseHistoryTab.SelectAtInventoryLocation();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtVendorName();
		inventory.inventoryEntry.purchaseHistoryTab.SelectAtHowAccquired();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.purchaseHistoryTab.Verify3032EnterQtyReceivedAckMsg();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtQtyReceived();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyAcknowledgeCostMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtUnitCost();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyTotalCostByMultiplyQtyAndUnitCost();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyStatusAsQtyReceived();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyTotalQuantityAtQtyReceived();

	}

	@Test(groups = { "expandableItem" }, priority = 3)
	public void ExpendableItem_121369(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "121369");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.clickRowByAtVendorName();
		inventory.inventoryEntry.purchaseHistoryTab.clearScanBarCode();
		inventory.inventoryEntry.purchaseHistoryTab.clickBatchScanItemButton();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtPopUpScanBarCode();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtPopUpScanBarCode();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyAcknowledgeDuplicateMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtPopUpScanBarCode2();
		inventory.inventoryEntry.purchaseHistoryTab.clickUpdateButton();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.clickRowByAtVendorName();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyBatchScanButtonGreen();
		inventory.SwitchToInventoryEntry();

	}

	@Test(groups = { "expandableItem" }, priority = 4)
	public void ExpendableItem_121373(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "121373");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDateAutopopulatesInProcessedDateField();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyLoggedPFAutopopulates();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDateAutopopulatesInProcessedDateField();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyLoggedPFAutopopulates();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickFleetRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtFleetNo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtLocation();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.verify11028InvalidReturnAckMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickPersonnelRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();

	}

	@Test(groups = { "expandableItem" }, priority = 5)
	public void ExpendableItem_121374(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "121374");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.inventoryEntryMainTab.clearReorderQuantity();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtReorderQuantity();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDateAutopopulatesInProcessedDateField();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyLoggedPFAutopopulates();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickFleetRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtFleetNo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtLocation();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickFleetRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtFleetNo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtLocation();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterQuantityAs3();
		inventory.inventoryEntry.verify11027AbleToReturnOnly2AckMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clearQuantity();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.verify11039ConfirmMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();

	}

	@Test(groups = { "expandableItem" }, priority = 6)
	public void ExpendableItem_121376(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "121376");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDateAutopopulatesInProcessedDateField();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyLoggedPFAutopopulates();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickDivisionRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtDivision();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickDivisionRadioButton();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.verify3032EnterQtyAckMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.verify3032EnterDivisionAckMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtDivision();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
	}

	@Test(groups = { "expandableItem" }, priority = 7)
	public void ExpendableItem_121377(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "121377");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDateAutopopulatesInProcessedDateField();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyLoggedPFAutopopulates();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickStationRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.verify3032EnterStationAckMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtStation();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickStationRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtStation1();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtQuantity();
		inventory.inventoryEntry.verify11028InvalidReturnAckMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtStation();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
	}

	@Test(groups = { "expandableItem" }, priority = -1)
	public void ExpendableItem_126713(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "126713");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();

		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyCopyButtonDisabled();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.TabOutPurchaseDate();
		inventory.inventoryEntry.purchaseHistoryTab.TabOutByPF();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyCurrentDateAutoPopulatesInPurchaseDate();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyDefaultLoggedPfAutoPopulatesInByField();
		inventory.inventoryEntry.purchaseHistoryTab.SelectInventoryLocation();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtQtyReceived();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtUnitCost();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyTotalCostByMultiplyQtyAndUnitCost();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.purchaseHistoryTab.TabOutPurchaseDate();
		inventory.inventoryEntry.purchaseHistoryTab.TabOutByPF();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyCurrentDateAutoPopulatesInPurchaseDate();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyDefaultLoggedPfAutoPopulatesInByField();
		inventory.inventoryEntry.purchaseHistoryTab.SelectInventoryLocation();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtQtyReceived();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtUnitCost();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyTotalCostByMultiplyQtyAndUnitCost();
		inventory.inventoryEntry.purchaseHistoryTab.clickAddButton();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyAllTabsEnabledAndDispositionTabDisabled();

	}

	@Test(groups = { "inventoryConfig" }, priority = 2)
	public void InventoryConfiguration_118716(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118716");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");

		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();

		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtPopUpCodeValue();
		settings.maintainCodeValue.enterAtPopUpDescription();
		settings.maintainCodeValue.selectAtItemType();
		settings.maintainCodeValue.selectAtPanelType();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();

	}

	@Test(groups = { "inventoryConfig" }, priority = 3)
	public void InventoryConfiguration_118718(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118718");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");

		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();

		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtPopUpCodeValue();
		settings.maintainCodeValue.enterAtPopUpDescription();
		settings.maintainCodeValue.selectAtItemCategory();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();

	}

	@Test(groups = { "inventoryConfig" }, priority = 1)
	public void InventoryConfiguration_118721(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118721");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");

		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();

		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtPopUpCodeValue();
		settings.maintainCodeValue.enterAtPopUpDescription();
		settings.maintainCodeValue.selectAtInventoryType();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();

	}

	@Test(groups = { "inventoryConfig" }, priority = 4)
	public void InventoryConfiguration_118723(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118723");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");

		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();

		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtPopUpCodeValue();
		settings.maintainCodeValue.enterAtPopUpDescription();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();

	}

	@Test(groups = { "inventoryConfig" }, priority = 5)
	public void InventoryConfiguration_118724(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118724");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");

		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();

		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtPopUpCodeValue();
		settings.maintainCodeValue.enterAtPopUpDescription();
		// settings.maintainCodeValue.ClickSystemCheckBox(); No check box available in
		// screen
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();
		settings.maintainCodeValue.closeTheScreen();
		settings.switchToCodedScreen();
	}

	@Test(groups = { "inventoryConfig" }, priority = 6)
	public void InventoryConfiguration_118725(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118725");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");

		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();

		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtPopUpCodeValue();
		settings.maintainCodeValue.enterAtPopUpDescription();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();
		settings.maintainCodeValue.closeTheScreen();

	}

	@Test(groups = { "inventoryConfig" }, priority = 7)
	public void InventoryConfiguration_118729(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "118729");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Storage Location");

		inventory.SwitchToStorageLocation();
		inventory.storageLocation.clickAddNewButton();
		inventory.SwitchToStorageLocationEntry();
		inventory.storageLocationEntry.EnterAtDescription();
		inventory.storageLocationEntry.SelectAtLocationUseFor();
		inventory.storageLocationEntry.clickLockerCheckbox();
		inventory.storageLocationEntry.SaveNClose();
		inventory.SwitchToStorageLocation();
		inventory.storageLocation.EnterAtDescription();
		inventory.storageLocation.clickSearchButton();
		inventory.storageLocation.VerifyAtDescriptionInGrid();

	}

	@Test(groups = { "inventoryConfig" }, priority = 8)
	public void InventoryConfiguration_118730(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118730");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");

		names.switchToNameEntry();
		names.nameEntry.EnterNameIDAsB();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.SaveWithConfirmMessage();
		// names.nameEntry.Verify6031ConfirmMessage();
		names.nameEntry.switchToBusinessTab();
		names.nameEntry.businessTab.SelectBusinessType();
		names.nameEntry.businessTab.EnterAtBusinessID();
		names.nameEntry.businessTab.SelectAtState();
		names.nameEntry.businessTab.ClickInventoryVendorCheckbox();
		names.nameEntry.businessTab.EnterLicenseNo();
		names.nameEntry.businessTab.ClickAddButton();
		names.nameEntry.businessTab.SaveWithConfirm();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();

	}

	@Test(groups = { "inventoryConfig" }, priority = 9)
	public void InventoryConfiguration_119497(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "119497");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.clickAddNewButton();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.enterAtFleetID();
		vehicle.fleetEntry.enterAtMake();
		vehicle.fleetEntry.enterAtModel();
		vehicle.fleetEntry.enterAtYear();
		vehicle.fleetEntry.enterAtVin();
		vehicle.fleetEntry.fleetEntryMainTab.selectAtStorageLocation();
		vehicle.fleetEntry.fleetEntryMainTab.clickAddButton();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
	}

	@Test(groups = { "inventoryConfig" }, priority = 10)
	public void InventoryConfiguration_121378(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "121378");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();
		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtPopUpCodeValue();
		settings.maintainCodeValue.enterAtPopUpDescription();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();
		settings.maintainCodeValue.clickRowByAtCodeValue();
		settings.maintainCodeValue.clickPopUpCancelButton();
		settings.switchToMaintainCodeValue();
	}

	@Test(groups = { "inventoryConfig" }, priority = 11)
	public void InventoryConfiguration_127726(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "127726");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Vehicle Make Model");

		vehicle.switchToVehicleMakeModel();
		vehicle.vehicleMakeModel.enterAtMake();
		vehicle.vehicleMakeModel.enterAtModelCode();
		vehicle.vehicleMakeModel.enterAtModelDescription();
		vehicle.vehicleMakeModel.clickAddButton();
		vehicle.vehicleMakeModel.verifyModelAppearInGridByModel();
		vehicle.vehicleMakeModel.save();
		vehicle.switchToVehicleMakeModel();

	}

	@Test(groups = { "fleet" })
	public void Fleet_123011(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123011");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.clickAddNewButton();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.enterAtFleetID();
		vehicle.fleetEntry.enterAtDescription();
		vehicle.fleetEntry.enterAtMake();
		vehicle.fleetEntry.enterAtModel();
		vehicle.fleetEntry.enterAtYear();
		vehicle.fleetEntry.enterAtVin();
		vehicle.fleetEntry.selectAtColor();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMainTab();
		vehicle.fleetEntry.clickEquipmentSuppliesTab();
		vehicle.fleetEntry.clickMaintainenceScheduleTab();
		vehicle.fleetEntry.clickActivityLogTab();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.clickNotesTab();
		vehicle.fleetEntry.clickAttachmentsTab();
		vehicle.fleetEntry.clickTriggersTab();
		vehicle.switchToFleetEntry();

	}

	@Test(groups = { "fleet" })
	public void Fleet_123012(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123012");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.enterAtMake();
		vehicle.fleetSearch.enterAtYear();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.verifyAtFleetId();
		vehicle.fleetSearch.verifyAtDescriptionByFleetID();
		vehicle.fleetSearch.verifyAtMakeDescriptionByFleetID();
		vehicle.fleetSearch.verifyAtModelByFleetID();
		vehicle.fleetSearch.verifyAtYearByFleetID();
		vehicle.fleetSearch.verifyAtVinByFleetID();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtTag();
		vehicle.fleetEntry.fleetEntryMainTab.selectAtUsageType();
		vehicle.fleetEntry.fleetEntryMainTab.clickMarkedCheckbox();
		vehicle.fleetEntry.fleetEntryMainTab.selectAtFuelTye();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtVendorName();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtVendorRef();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtPO();
		vehicle.fleetEntry.fleetEntryMainTab.selectAtStorageLocation();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickSaveButton();
		vehicle.fleetEntry.verify1051UpdatedDataExistsInMainTabAckMsg();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.fleetEntryMainTab.clickAddButton();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
	}

	@Test(groups = { "fleet" })
	public void Fleet_123013(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123013");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtTag();
		vehicle.fleetSearch.enterAtMake();
		vehicle.fleetSearch.enterAtModel();
		vehicle.fleetSearch.enterAtVin();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtVendorRef();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickEquipmentSuppliesTab();
		vehicle.fleetEntry.equipmentSuppliesTab.clickAddNewEquipmentOrSupplyItemButton();
		inventory.SwitchToInventorySearchEntryWindow();
		inventory.inventorySearch.enterAtScanBarCode();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearchEntryWindow();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectCheckboxInGrid();
		inventory.inventorySearch.clickAssignButton();
		inventory.SwitchToBatchAssignReturn();
		inventory.batchAssignReturn.clickSaveButton();
		inventory.batchAssignReturn.Verify3032EnterLocationAcknowledgeMessage();
		inventory.SwitchToBatchAssignReturn();
		inventory.batchAssignReturn.SelectAtFleetLocation();
		inventory.batchAssignReturn.Save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickEquipmentSuppliesTab();
		vehicle.fleetEntry.equipmentSuppliesTab.verifyAtFleeetLocationInGrid();
		vehicle.fleetEntry.equipmentSuppliesTab.clickExpandCheckbox();
		vehicle.fleetEntry.equipmentSuppliesTab.verifyAssertItemByItemDescriptionInGrid();
		vehicle.switchToFleetEntry();

	}

	@Test(groups = { "fleet" })
	public void Fleet_123014(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "123014");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");

		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtPO();
		vehicle.fleetSearch.enterAtVendorRef();
		vehicle.fleetSearch.clickMarkedCheckbox();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtVendorRef();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickEquipmentSuppliesTab();
		vehicle.fleetEntry.equipmentSuppliesTab.clickPerformEquipmentServiceButton();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.enterNotes();
		vehicle.equipmentService.tabOutServicedTestedBy();
		vehicle.equipmentService.tabOutDate();
		vehicle.equipmentService.clickSelectAllCheckbox();
		vehicle.equipmentService.clickSaveButton();
		popup.acknowledge.ok();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.verifyGridDisappeared();

	}

	@Test(groups = { "fleet" })
	public void Fleet_123015(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123015");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMaintainenceScheduleTab();
		vehicle.fleetEntry.maintenanceScheduleTab.selectAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.selectPeriodAs1Month();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.fleetEntry.maintenanceScheduleTab.verifyNextDueDateAsCurrentDateOfFutureMonths(1);
		vehicle.fleetEntry.maintenanceScheduleTab.selectRowByAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.selectPeriodAs3Month();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.fleetEntry.maintenanceScheduleTab.verifyNextDueDateAsCurrentDateOfFutureMonths(3);
		vehicle.fleetEntry.maintenanceScheduleTab.selectRowByAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.selectPeriodAs4Month();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.fleetEntry.maintenanceScheduleTab.verifyNextDueDateAsCurrentDateOfFutureMonths(4);
		vehicle.fleetEntry.maintenanceScheduleTab.selectRowByAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.selectPeriodAsYear();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.fleetEntry.maintenanceScheduleTab.verifyNextDueDateAsCurrentDateOfFutureMonths(12);
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();

	}

	@Test(groups = { "fleet" })
	public void Fleet_123016(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123016");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMaintainenceScheduleTab();
		vehicle.fleetEntry.maintenanceScheduleTab.selectAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.enterAtMiles();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.maintenanceScheduleTab.selectRowByAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.clickViewMileageLogButton();
		vehicle.switchToFuelLogEntry();
		vehicle.fuelLogEntry.verifyAtFleetId();
		vehicle.fuelLogEntry.clickUpdateMileageButton();
		vehicle.fuelLogEntry.tabOutPopupDate();
		vehicle.fuelLogEntry.enterQuantityAs10();
		vehicle.fuelLogEntry.enterOilAs10();
		vehicle.fuelLogEntry.enterHours("2");
		vehicle.fuelLogEntry.enterPopupCurrentMileageAs10();
		vehicle.fuelLogEntry.savePopup();
		vehicle.fuelLogEntry.verify1002AdditionalSuccessfulAckMsg();
		vehicle.switchToFuelLogEntry();
		vehicle.fuelLogEntry.clickUpdateMileageButton();
		vehicle.fuelLogEntry.tabOutPopupDate();
		vehicle.fuelLogEntry.verifyMileageAppearAs10();
		vehicle.fuelLogEntry.enterOilAs10();
		vehicle.fuelLogEntry.enterHours("2");
		vehicle.fuelLogEntry.enterPopupCurrentMileageAs9();
		vehicle.fuelLogEntry.savePopup();
		vehicle.fuelLogEntry.verify3032GreaterThanLstMileageAckMsg();
		vehicle.switchToFuelLogEntry();
		vehicle.fuelLogEntry.enterPopupCurrentMileageAs50();
		vehicle.fuelLogEntry.enterHours("3");
		vehicle.fuelLogEntry.savePopup();
		vehicle.fuelLogEntry.verify1002AdditionalSuccessfulAckMsg();
		vehicle.switchToFuelLogEntry();
		vehicle.fuelLogEntry.saveNClose();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
	}

	@Test(groups = { "fleet" })
	public void Fleet_123017(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123017");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMainTab();
		vehicle.fleetEntry.fleetEntryMainTab.clickTrackHourCheckbox();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMaintainenceScheduleTab();
		vehicle.fleetEntry.maintenanceScheduleTab.selectAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.selectPeriodAs1Month();
		vehicle.fleetEntry.maintenanceScheduleTab.clickAddButton();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.maintenanceScheduleTab.selectRowByAtServiceType();
		vehicle.fleetEntry.maintenanceScheduleTab.clickViewMileageLogButton();
		vehicle.switchToFuelLogEntry();

	}

	@Test(groups = { "fleet" }, priority = -2)
	public void Fleet_123018(ITestContext testContext) throws Exception {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123018");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtMake();
		vehicle.fleetSearch.enterAtModel();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.selectActionAsAssigned();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedTime();
		vehicle.fleetEntry.clickSaveButton();
		vehicle.fleetEntry.verify3032EnterByAcknowledgeMessage();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.tabOutBy(); // tabbing out value is not populating
		vehicle.fleetEntry.assignmentsTab.verifyCurrentDateAutoPopulatesInAssignedDate();
		vehicle.fleetEntry.assignmentsTab.verifyDefaultLoggedPfAutoPopulatesInByField();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickSaveButton();
		vehicle.fleetEntry.verify3032EnterPFAcknowledgeMessage();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.enterAtPFCode();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.selectActionAsReturned();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutBy();
		vehicle.fleetEntry.assignmentsTab.verifyDivisionStationRadioButtonDisabled();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.enterAtPFCode();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
	}

	@Test(groups = { "fleet" })
	public void Fleet_123019(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "123019");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");

		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtVin();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.selectActionAsAssigned();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutBy();
		vehicle.fleetEntry.assignmentsTab.verifyCurrentDateAutoPopulatesInAssignedDate();
		vehicle.fleetEntry.assignmentsTab.verifyDefaultLoggedPfAutoPopulatesInByField();
		vehicle.fleetEntry.assignmentsTab.clickDivisionRadioButton();
		vehicle.fleetEntry.assignmentsTab.selectAtDivision();
		vehicle.fleetEntry.assignmentsTab.selectSection();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickMainTab();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.selectActionAsReturned();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutBy();
		vehicle.fleetEntry.assignmentsTab.verifyDivisionStationRadioButtonDisabled();
		vehicle.fleetEntry.assignmentsTab.enterAtPFCode();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
	}

	@Test(groups = { "fleet" })
	public void Fleet_123020(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "123020");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		// vehicle.fleetSearch.enterAtVendorName();
		vehicle.fleetSearch.enterAtVendorRef();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.selectActionAsAssigned();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutBy();
		vehicle.fleetEntry.assignmentsTab.verifyCurrentDateAutoPopulatesInAssignedDate();
		vehicle.fleetEntry.assignmentsTab.verifyDefaultLoggedPfAutoPopulatesInByField();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.assignmentsTab.clickStationRadioButton();
		vehicle.fleetEntry.clickSaveButton();
		vehicle.fleetEntry.verify3032EnterStationAcknowledgeMessage();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.assignmentsTab.selectAtStation();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.assignmentsTab.selectActionAsReturned();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutBy();
		vehicle.fleetEntry.assignmentsTab.verifyDivisionStationRadioButtonDisabled();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.assignmentsTab.enterAtPFCode();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();

	}

	@Test(groups = { "fleet" })
	public void Fleet_123021(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "123021");
		String comments = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtTag();
		vehicle.fleetSearch.enterAtVendorName();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.switchToNotesTab();
		vehicle.fleetEntry.fleetEntryNotesTab.tabOutUpdatedDateTime();
		vehicle.fleetEntry.fleetEntryNotesTab.verifyCurrentDateAutopopulatesInUpdatedDateField();
		vehicle.fleetEntry.fleetEntryNotesTab.save();
		vehicle.fleetEntry.verify1018RequiredEntriesAreMissingAckMsg();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.switchToNotesTab();
		vehicle.fleetEntry.fleetEntryNotesTab.enterComments(comments);
		vehicle.fleetEntry.fleetEntryNotesTab.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAttachmentsTab();
		vehicle.fleetEntry.switchToNotesTab();
		vehicle.fleetEntry.fleetEntryNotesTab.verifyAddedInGrid(Playback.getTestContextAttribute("comments"));
		vehicle.switchToFleetEntry();

	}

	@Test(groups = { "fleet" }, priority = -1)
	public void Fleet_123022(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "123022");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Mileage Log Entry");
		vehicle.switchToMileageLogEntry();
		vehicle.mileageLogEntry.selectAtFleedId();
		vehicle.mileageLogEntry.clickSearchButton();
		vehicle.mileageLogEntry.clickDeleteCellByFleetId();
		vehicle.mileageLogEntry.verifingDoYouWantToDeleteAcknowledgeMessage();
		vehicle.switchToMileageLogEntry();
		vehicle.mileageLogEntry.save();
		vehicle.switchToMileageLogEntry();
		vehicle.mileageLogEntry.verifyNoRecordExists();
		vehicle.mileageLogEntry.verifyNoRecordFoundAcknowledgeMessage();
		vehicle.switchToMileageLogEntry();

	}

	@Test(groups = { "fleet" })
	public void Fleet_126968(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "126968");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickEquipmentSuppliesTab();
		vehicle.fleetEntry.equipmentSuppliesTab.clickAddNewEquipmentOrSupplyItemButton();
		inventory.SwitchToInventorySearchEntryWindow();
		inventory.inventorySearch.clickExpendableItemOnlyCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.clickSelectCheckboxByAtInventoryNo();
		String qty = inventory.inventorySearch.readQuantityValueByAtInventoryNo();
		inventory.inventorySearch.clickAssignButton();
		inventory.SwitchToBatchAssignReturn();
		inventory.batchAssignReturn.DoubleclickQuantityCellByAtInventoryNo();
		inventory.batchAssignReturn.EnterQuantityInGridByAtInventoryNo(qty);
		Playback.controlReadyThreadWait();
		inventory.SwitchToBatchAssignReturn();
		inventory.batchAssignReturn.SelectAtLocation();
		inventory.batchAssignReturn.Save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickEquipmentSuppliesTab();
		vehicle.fleetEntry.equipmentSuppliesTab.verifyExpendableItemByAtLocationInGrid();

	}

	@Test(groups = { "assertItem" }, priority = 15)
	public void CreateAssertInventoryItem_133950(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "133950");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAddNew();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.enterEntryDate();
		inventory.inventoryEntry.verifyCurrentDate();
		inventory.inventoryEntry.selectAtInventoryName(); // No function written
		inventory.inventoryEntry.selectAtCategory();
		inventory.inventoryEntry.verifyAssertItemLableAppears();
		inventory.inventoryEntry.selectAtType();
		inventory.inventoryEntry.selectAtMake();
		inventory.inventoryEntry.enterAtModel();
		inventory.inventoryEntry.enterAtDescription();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyInventoryNoAutoPopulate();
		inventory.inventoryEntry.verifyAllTabEnabled();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtAction();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDate();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyAsByPF();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.verifyAcknowledgePurchaseHistory();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyBarCodeImage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterReplaceByAsCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyCurrentDateAutopopulatesInReplaceBy();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();

	}

	@Test(groups = { "assertItem" }, priority = 14)
	public void VerifyServicecyclefunctionality_134023(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "134023");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.selectAtInventoryName();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectSelectServiceAsMonth();
		inventory.inventoryEntry.inventoryEntryMainTab.clearLastServiceDate();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterLastDateAsCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyNextDueDateAsMonthLater();
		inventory.inventoryEntry.clickReset();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectSelectServiceAsQuarterly();
		inventory.inventoryEntry.inventoryEntryMainTab.clearLastServiceDate();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterLastDateAsCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyNextDueDateAsQuarterlyLater();
		inventory.inventoryEntry.clickReset();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectSelectServiceAsSemiAnnual();
		inventory.inventoryEntry.inventoryEntryMainTab.clearLastServiceDate();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterLastDateAsCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyNextDueDateAsSemiannualLater();
		inventory.inventoryEntry.clickReset();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectSelectServiceAsAnnual();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectBaseMonthAsCurrentMonth();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterLastDateAsCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyNextDueAsNextYearCurrentMonthFirstDay();

	}

	@Test(groups = { "assertItem" }, priority = 8)
	public void InventoryMainTab_134024(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "134024");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectAtLadderType();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterLadderLength();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectSelectServiceAsMonth();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterNextDueAsCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectColor();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtSerialNo();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtCustom1();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterWarrantyExpirationAsCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyCurrentDateAutopopulatesInWarrantyExpiration();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectAtCheckoutType();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtCheckoutNo();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtDeptTracking();
		inventory.inventoryEntry.inventoryEntryMainTab.clickLogEquipmentCheckBox();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();

	}

	@Test(groups = { "assertItem" }, priority = 16)
	public void InventoryPurchaseHistoryTab_134026(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "134026");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterPurchaseDate();
		inventory.inventoryEntry.purchaseHistoryTab.EnterByPF();
		inventory.inventoryEntry.purchaseHistoryTab.SelectAtInventoryLocation();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtVendorName();
		inventory.inventoryEntry.purchaseHistoryTab.SelectAtHowAccquired();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyAcknowledgeCostMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtUnitCost();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyAtTotalCost();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
	}

	@Test(groups = { "assertItem" }, priority = 0)
	public void AddMultipleCarCodeSameInventory_134027(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "134027");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterWarrantyExpirationAs30DayFutureFromCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyWarrantyExpirationAs30DayFutureFromCurrentDate();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.clearScanBarCode();
		inventory.inventoryEntry.purchaseHistoryTab.clickBatchScanItemButton();
		inventory.inventoryEntry.purchaseHistoryTab.EnterScanBarCodeAs1000();
		inventory.inventoryEntry.purchaseHistoryTab.EnterScanBarCodeAs1000();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyAcknowledgeDuplicateMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterScanBarCodeAs1001();
		inventory.inventoryEntry.purchaseHistoryTab.clickUpdateButton();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.verifyAcknowledgePurchaseHistory();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.enterUnitCostAcknowledgeMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtUnitCost();// Check here
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyBatchScanButtonGreen();
		inventory.inventoryEntry.verifyStatusAsAvaliable();
	}

	@Test(groups = { "assertItem" }, priority = 6)
	public void AssignedIssuedHistoryPFPersonnel_118903(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118903");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDate();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyAsByPF();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.verifyStatusAsPersonnelAssignedTo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyFleetDivisionStationDisabled();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyStatusAsAvaliable();
	}

	@Test(groups = { "assertItem" }, priority = 5)
	public void AssignedIssuedHistoryFleet_134028(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "134028");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDate();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyAsByPF();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickFleetCheckBox();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtFleetNo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtLocation();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.verifyStatusAsFleetAssignedTo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyFleetDivisionStationDisabled();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyStatusAsAvaliable();

	}

	@Test(groups = { "assertItem" }, priority = 4)
	public void AssignedIssuedHistoryDivision_134034(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "134034");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDate();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyAsByPF();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickDivisionCheckBox();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtDivision();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.verifyStatusAsDivisionAssignedTo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyFleetDivisionStationDisabled();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyStatusAsAvaliable();
	}

	@Test(groups = { "assertItem" }, priority = 7)
	public void AssignedIssuedHistoryStation_119496(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "119496");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyCurrentDate();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyAsByPF();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickStationCheckBox();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyAcknowledgeStationMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtStation();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.verifyStatusAsStationAssignedTo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyFleetDivisionStationDisabled();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.clickSaveButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.VerifyAcknowledgePFMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyStatusAsAvaliable();
	}

	@Test
	public void InventoryServiceHistoryTab_118904(ITestContext testContext) {
		testContext.setAttribute("testID", "118904");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.selectAtInventoryLocation();
		inventory.inventorySearch.enterAtPFNo();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickServiceHistoryTab();
		inventory.inventoryEntry.serviceHistoryTab.clickAddServiceHistoryButton();
		inventory.inventoryEntry.serviceHistoryTab.EnterDate();
		inventory.inventoryEntry.serviceHistoryTab.VerifyCurrentDate();
		inventory.inventoryEntry.serviceHistoryTab.EnterAtServicedTestedBy();
		inventory.inventoryEntry.serviceHistoryTab.SelectCondition();
		inventory.inventoryEntry.serviceHistoryTab.EnterNotes();
		inventory.inventoryEntry.serviceHistoryTab.clickAddButton();
		inventory.inventoryEntry.serviceHistoryTab.VerifyServiceAdded(0);
		inventory.inventoryEntry.save();
	}

	@Test(groups = { "assertItem" }, priority = 9)
	public void InventoryNotesTab_118906(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118906");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.selectAtFleetID();
		inventory.inventorySearch.selectAtLocation();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.switchToNotesTab();
		inventory.inventoryEntry.inventoryEntryNotesTab.EnterUpdatedDateTime();
		inventory.inventoryEntry.inventoryEntryNotesTab.clickSaveButton();
		inventory.inventoryEntry.inventoryEntryNotesTab.VerifyAcknowledgeRequiredMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.switchToNotesTab();
		inventory.inventoryEntry.inventoryEntryNotesTab.EnterComments();
		inventory.inventoryEntry.inventoryEntryNotesTab.clickSaveButton();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAttachmentTab();
		inventory.inventoryEntry.switchToNotesTab();
		inventory.inventoryEntry.inventoryEntryNotesTab.VerifyNotesAdded();
		inventory.SwitchToInventoryEntry();

	}

	@Test(groups = { "assertItem" }, priority = 12)
	public void VerifyCopyfunctionality_118908(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118908");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickCopyButton();
		inventory.inventoryEntry.verifyConfirmCopyMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyCopyScreenTabs();
		// inventory.inventoryEntry.verifyEntryDateFieldBlank();
		inventory.inventoryEntry.enterEntryDate();
		inventory.inventoryEntry.clickMainTab();
		// inventory.inventoryEntry.inventoryEntryMainTab.VerifySerialNoEmpty();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtSerialNo();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterCheckout();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyAllTabEnabled();
		// inventory.inventoryEntry.ClickServiceHistoryTab();
		// inventory.inventoryEntry.serviceHistoryTab.VerifyServiceHistoryNoData(); //
		// due to 2018 R2 stable
		/*
		 * inventory.inventoryEntry.clickDispositionTab();
		 * inventory.inventoryEntry.inventoryEntryDispositionTab.
		 * VerifyAuthorizedByFieldEmpty();
		 * inventory.inventoryEntry.inventoryEntryDispositionTab.
		 * VerifyDispositionDateFieldEmpty(); inventory.inventoryEntry.close();
		 */
		inventory.SwitchToInventoryEntry();
	}

	@Test(groups = { "assertItem" }, priority = 13)
	public void VerifyDuplicationCheckoutandDeptTracking_118939(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "118939");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtDeptTracking();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyAcknowledgeDeptTrackingMessage();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectAtCheckoutType();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterAtCheckoutNo();
		inventory.inventoryEntry.inventoryEntryMainTab.VerifyAcknowledgeCheckOutMessage();
		inventory.SwitchToInventoryEntry();

	}

	@Test(groups = { "assertItem" }, priority = 11)
	public void VerifyAddduplicatebarcode_118902(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "118902");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.EnterAtScanBarCode();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyConfirmDuplicateScanBarcodeMessage();
		inventory.SwitchToInventoryEntry();
	}

	@Test(groups = { "assertItem" }, priority = 10)
	public void AssertItem_126721(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "126721");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();

		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickPurchaseHistoryTab();
		inventory.inventoryEntry.purchaseHistoryTab.VerifyQuantityReceivedFieldAsDisabledAndValueAs1();
		inventory.inventoryEntry.verifyDispositionTabEnabled();
		inventory.inventoryEntry.clickDispositionTab();

	}

	@Test(groups = { "assertItem" }, priority = 2)
	public void AssertItem_126724(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "126724");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.verifyQuantityOneAppearInGridByAtInventoryNo();
		inventory.inventorySearch.selectRowByAtInventoryNo();

		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.selectAtCategory();
		inventory.inventoryEntry.selectAtType();
		inventory.inventoryEntry.selectAtMake();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.SelectAtLadderType();
		inventory.inventoryEntry.inventoryEntryMainTab.clearLastServiceDate();
		inventory.inventoryEntry.inventoryEntryMainTab.clearNextDueDate();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterLastServiceDateAsLastMonthCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterNextDueAsCurrentDate();
		inventory.inventoryEntry.saveNClose();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.RightclickRowByAtInventoryNoAndclickEquipmentServiceLink();

		vehicle.switchToEquipmentService();
		vehicle.equipmentService.clickSaveButton();
		vehicle.equipmentService.verify3032EnterTestedByAcknowledgeMessage();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.tabOutServicedTestedBy();
		vehicle.equipmentService.verifyLoggedPFAppear();
		vehicle.equipmentService.clickSaveButton();
		vehicle.equipmentService.verify3032EnterDateAcknowledgeMessage();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.tabOutDate();
		vehicle.equipmentService.verifyCurrentDateAutopopulates();
		vehicle.equipmentService.verifyAssertItemAppearInGridByAtLadderType();
		vehicle.equipmentService.clickServicedCheckboxByLadderType();
		vehicle.equipmentService.clickSaveButton();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.verifyNoRecordsFoundAcknowledgeMessage();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.verifyAssertItemDisAppearInGrid();

	}

	@Test(groups = { "assertItem" }, priority = 3)
	public void AssertItems_126725(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "126725");

		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickMainTab();
		inventory.inventoryEntry.inventoryEntryMainTab.clearLastServiceDate();
		inventory.inventoryEntry.inventoryEntryMainTab.clearNextDueDate();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterLastServiceDateAsLastMonthCurrentDate();
		inventory.inventoryEntry.inventoryEntryMainTab.EnterNextDueAsCurrentDate();
		inventory.inventoryEntry.saveNClose();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickBackButton();
		inventory.inventorySearch.clickShowDueCheckbox();
		inventory.inventorySearch.enterServiceDueAsCurrentDate();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.clickSelectCheckbox();
		inventory.inventorySearch.verifyPerformBatchServiceLinkEnables();
		inventory.inventorySearch.clickSelectCheckboxByAtInventoryNo();
		inventory.inventorySearch.clickPerformBatchServiceButton();
		vehicle.switchToEquipmentService();
		Playback.setFocus();
		vehicle.equipmentService.uncheckExpandCollapseCheckbox();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.clickExpandCollapseCheckbox();
		vehicle.equipmentService.clickSelectAllCheckbox();
		vehicle.equipmentService.tabOutServicedTestedBy();
		vehicle.equipmentService.tabOutDate();
		vehicle.equipmentService.clickSaveButton();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.verifyNoRecordsFoundAcknowledgeMessage();
		vehicle.switchToEquipmentService();
		vehicle.equipmentService.verifyAssertItemDisAppearInGrid();

	}

	@Test // Raga Ranjani

	public void Police2020DefectInventoryModule_254472(ITestContext testContext) {

		testContext.setAttribute("testID", "254472");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.clickAddNewButton();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.enterAtFleetID();
		vehicle.fleetEntry.enterDescription();
		vehicle.fleetEntry.enterAtMake();
		vehicle.fleetEntry.enterAtModel();
		vehicle.fleetEntry.enterAtYear();
		vehicle.fleetEntry.enterAtVin();
		vehicle.fleetEntry.clickInactiveCheckbox();
		vehicle.fleetEntry.clickIsFireCheckbox();
		vehicle.fleetEntry.clickMainTab();
		vehicle.fleetEntry.fleetEntryMainTab.selectUsageType();
		vehicle.fleetEntry.fleetEntryMainTab.selectAtStorageLocation();
		vehicle.fleetEntry.fleetEntryMainTab.clickAddButton();
		vehicle.fleetEntry.fleetEntryMainTab.clickLockableCheckbox();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtVendorName();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.selectActionAsDisposition();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutBy();
		vehicle.fleetEntry.assignmentsTab.enterAtPFCode();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.ClickDeleteIconInGrid();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.verifyActionFieldEnable();
		vehicle.fleetEntry.assignmentsTab.verifyAssignedDateFieldEnable();
		vehicle.fleetEntry.assignmentsTab.verifyByFieldEnable();
		vehicle.fleetEntry.assignmentsTab.verifyPFFieldEnable();

	}

	@Test // Automated by Stalin
	public void AssertitemAssigned(ITestContext testContext) {

		testContext.setAttribute("testID", "256428");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.verifyAtPurchaseDateAsCurrentDate();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsAssigned();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.clickFleetRadioButton();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtFleetNo();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectAtLocation();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyAtStatusInMenuBar();
		inventory.inventoryEntry.close();
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.verifyAtAssigedUsingInventoryNo();
		inventory.inventorySearch.clickBackButton();
		inventory.inventorySearch.clickResetButton();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickEquipmentSuppliesTab();
		vehicle.fleetEntry.equipmentSuppliesTab.clickExpandCheckbox();
		vehicle.fleetEntry.equipmentSuppliesTab.verifyAtModelInGrid();
		vehicle.fleetEntry.equipmentSuppliesTab.verifyAtDateAcqAsCurrentDate();
		vehicle.fleetEntry.close();
		vehicle.switchToFleetSearch();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearchII();
		inventory.inventorySearch.clickAssertOnlyCheckBox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.selectRowByAtInventoryNo();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickAssignedIssuedHistoryTab();
		inventory.inventoryEntry.assignedIssuedHistoryTab.SelectActionAsReturened();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutProcessedDateTime();
		inventory.inventoryEntry.assignedIssuedHistoryTab.TabOutBy();
		inventory.inventoryEntry.assignedIssuedHistoryTab.EnterAtPFCode();
		inventory.inventoryEntry.save();
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.verifyStatusAsGreenAndAvailable();
		inventory.inventoryEntry.close();

	}

	@Test // Nov Sprint 3 Automated by Mahesha
	public void VerifyServiceHistoryShowsVendorNotesCostInActivityEntryScreen_258915(ITestContext testContext) {
		testContext.setAttribute("testID", "258915");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickShowDueCheckbox();
		inventory.inventorySearch.clickSearchButton();
		inventory.inventorySearch.clickSelectCheckboxByAtInventoryNo(0);
		inventory.inventorySearch.clickSelectCheckboxByAtInventoryNo(1);
		inventory.inventorySearch.VerifyPerformBatchServiceLinkEnables();
		inventory.inventorySearch.clickPerformBatchServiceButton();
		inventory.switchToEquipmentServiceWindow();
		inventory.equipmentService.verifyServiceDueByAsCurrentDate();
		inventory.equipmentService.tabAtServicedBy();
		inventory.equipmentService.tabAtServiceDate();
		inventory.equipmentService.enterAtVendor();
		inventory.equipmentService.enterAtCost();
		inventory.equipmentService.enterAtNotes();
		int count = inventory.equipmentService.grtRowsCount();
		inventory.equipmentService.selectAtSevicedCheckBoxByItemType();
		inventory.equipmentService.clickSave();
		inventory.switchToEquipmentServiceWindow();
		inventory.equipmentService.verifyRowNotAvailableAfterSave(count);
		inventory.equipmentService.clickSaveNClose();

		inventory.SwitchToInventorySearch();
		inventory.inventorySearch.clickSelectCheckboxByAtInventoryNo(0);
		inventory.SwitchToInventoryEntry();
		inventory.inventoryEntry.clickActivityLogTab();
		inventory.inventoryEntry.inventoryEntryActivityLogTab.verifyAtActivityTypeInGrid(0);
		inventory.inventoryEntry.inventoryEntryActivityLogTab.verifyAtDateInGrid(0);
		inventory.inventoryEntry.inventoryEntryActivityLogTab.verifyAtSubjectInGrid(0);
		inventory.inventoryEntry.inventoryEntryActivityLogTab.selectRowByActivityType();

		activity.SwitchToActivityEntry();
		activity.activityEntry.switchToServiceHistoryTab();
		activity.activityEntry.activityEntryServiceHistoryTab.verifyAtVendorCode();
		activity.activityEntry.activityEntryServiceHistoryTab.verifyAtCost();
		activity.activityEntry.activityEntryServiceHistoryTab.verifyAtNotes();
	}

//Issue with the product
	@Test // Q4 Sprint 4 Automated by Mahesha
	public void VerifyFleetEntryAssignmentTabDispositionFunctionality_259719(ITestContext testContext) {
		testContext.setAttribute("testID", "259719");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule(" Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");

		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.clickAddNewButton();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.enterAtFleetID();
		vehicle.fleetEntry.enterAtDescription();
		vehicle.fleetEntry.enterAtMake();
		vehicle.fleetEntry.enterAtModel();
		vehicle.fleetEntry.enterAtYear();
		vehicle.fleetEntry.enterAtVin();
		vehicle.fleetEntry.selectAtColor();
		vehicle.fleetEntry.selectInactiveCheckBox();
		vehicle.fleetEntry.verifyInactiveDateAsCurrentDate();
		vehicle.fleetEntry.clickMainTab();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtTag();
		vehicle.fleetEntry.fleetEntryMainTab.selectAtUsageType();
		vehicle.fleetEntry.fleetEntryMainTab.selectAtStorageLocation();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtComments();
		vehicle.fleetEntry.fleetEntryMainTab.selectLockableCheckBox();
		vehicle.fleetEntry.fleetEntryMainTab.clickAddButton();
		vehicle.fleetEntry.fleetEntryMainTab.enterAtVendorName();
		vehicle.fleetEntry.save();

		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickAssignmentTab();
		vehicle.fleetEntry.assignmentsTab.selectAtAction();
		vehicle.fleetEntry.assignmentsTab.tabOutAssignedDate();
		vehicle.fleetEntry.assignmentsTab.tabOutBy();
		vehicle.fleetEntry.assignmentsTab.verifyDefaultLoggedPfAutoPopulatesInByField();
		vehicle.fleetEntry.assignmentsTab.enterAtPFCode();
		vehicle.fleetEntry.save();

		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.verifySaveFunctionalitiesDisabled();
		vehicle.fleetEntry.assignmentsTab.verifyAtActionFromTable(0);
		vehicle.fleetEntry.assignmentsTab.deleteGridRowByAction();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.save();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.verifySaveFunctionalitiesEnabled();

	}

	@Test // Automated by Stalin
	public void UsingCategorycreatingActivitylog(ITestContext testContext) {
		testContext.setAttribute("testID", "261420");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter1203AsVEHCK();
		settings.switchToSystemParamter();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickActivityLogTab();
		vehicle.fleetEntry.activityLogTab.clickAddNewActivity();
		activity.SwitchToActivityEntry();
		activity.activityEntry.verifyAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.VerifyAtActivityStatus();
		activity.activityEntry.TabOutActivityFromDateAndTime();
		activity.activityEntry.enterSubject();
		activity.activityEntry.verifyFleetNoIsDisabled();
		activity.activityEntry.clickFleetIBubble();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.close();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.Close();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.close();
		vehicle.switchToFleetSearch();
		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.ClickSearchLink();
		activity.activitySearch.ClickAtActivityTypeInGrid();
		activity.SwitchToActivityEntry();
		activity.activityEntry.VerifyAtActivityType();
		activity.SwitchToActivityEntry();

	}

	// Automated by TesterName :- Vijay Date :- Sprint:- Quarter:- Module:-
	@Test(groups = { "" })
	public void toVerifyTheMobileDeviceCameraButtonFunctionalityInFleetEntryScreen_292511(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "292511");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Fleet Search");
		vehicle.switchToFleetSearch();
		vehicle.fleetSearch.enterAtFleetId();
		vehicle.fleetSearch.clickSearchButton();
		vehicle.fleetSearch.selectRowByAtFleetId();
		vehicle.switchToFleetEntry();
		vehicle.fleetEntry.clickPictureImage();
		home.switchToAllImageScreen();
		home.allImagesScreen.clickMobileDeviceCameraButton();
		home.allImagesScreen.verifyNoErrorWindowOpens();
		home.switchToMobileDeviceOTPScreen();
		home.mobileDeviceOTPScreen.enterAtMobileNo();
		home.mobileDeviceOTPScreen.clickSendLinkToMobileButton();
		home.mobileDeviceOTPScreen.VerifyAtAuthenticaionCodeGeneratedAs6Digit();

	}

	@AfterMethod(groups = { "expandableItem", "fleet", "assertItem", "inventoryConfig" })
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
		geo.Reset();
		popup.Reset();

	}

	@AfterSuite(groups = { "expandableItem", "fleet", "assertItem", "inventoryConfig" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}

}
