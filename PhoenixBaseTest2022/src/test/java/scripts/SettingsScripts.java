package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Activity;
import application.BI;
import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Personnel;
import application.Popup;
import application.QA;
import application.Settings;
import dataAccess.BaseData;
import reports.ExtentReport;
import resources.PropertiesFile;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class SettingsScripts {

	public Geo geo;
	public Settings settings;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public QA qa;
	public Home home;
	public Personnel personnel;
	public Names names;
	public Activity activity;
	public BI bi;

	@BeforeSuite(groups = { "TerminalFunctional", "TextMgmtFunctional", "UnitScreenFunctional", "2020DefectSharedCodes",
			"2020DefectJobAndJuris", "2020DefectCodedAndCFS", "2020DefectQAFormsRolesAndReportRepository",
			"2020DefectSharedCodesSystemParameter", "2020DefectTestCases", "2021DefectTestCases", "2020DefectQAForm",
			"2022DefectTestCasesKIRAN", "2020DefectCodedCFSJobJuris" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());

	}

	@BeforeMethod(groups = { "TerminalFunctional", "TextMgmtFunctional", "UnitScreenFunctional",
			"2020DefectSharedCodes", "2020DefectJobAndJuris", "2020DefectCodedAndCFS",
			"2020DefectQAFormsRolesAndReportRepository", "2020DefectSharedCodesSystemParameter", "2020DefectTestCases",
			"2021DefectTestCases", "2020DefectQAForm", "2022DefectTestCasesKIRAN", "2020DefectCodedCFSJobJuris" })
	public void beforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Settings");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		settings = new Settings();
		geo = new Geo();
		qa = new QA();
		home = new Home();
		personnel = new Personnel();
		names = new Names();
		activity = new Activity();
		bi = new BI();

	}

//	@BeforeMethod(groups = { "textMgmt", "terminal", "unitsScreen" })
	public void beforeTestMethodSettings(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Settings");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		settings = new Settings();
		geo = new Geo();
		activity = new Activity();

	}

	// region Police Sprint Defect CRM's
	@Test
	public void policeSprintGlobal_135733(ITestContext testContext) {
		testContext.setAttribute("testID", "135733");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		login.loginScreen.verifyAuthendicationFailedMessage();
		login.loginScreen.clickResetButton();
		login.loginScreen.clearUserName();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Access Log");
		settings.switchToAcessLog();
		settings.accessLog.tabTheFromDateAndTime();
		settings.accessLog.verifyCurrentDateAsFrom();
		settings.accessLog.tabTheToDateAndTime();
		settings.accessLog.verifyCurrentDateAsTo();
		settings.accessLog.selectAccessLogAsLoginFailed();
		settings.accessLog.clickSearch();
		settings.accessLog.verifyActivityDateAsCurrentDate(0);
		settings.accessLog.verifyAccessAsLoginFailed(0);
		settings.accessLog.verifyDescriptionAtUserName(0);
		settings.accessLog.verifyDescriptionAsLoginFailed(0);

	}

	@Test
	public void policeSprintGlobal_135732() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Property");
		loader.navigateToScreen("Property Search");
		/*
		 * Property.SwitchToPropertySearch();
		 * Property.PropertySearch.enterNumberControlCaseNo();
		 * Property.PropertySearch.clickBack(); Property.PropertySearch.clickReset();
		 * Property.PropertySearch.enterNumberControlPropertyNo();
		 * Property.PropertySearch.clickBack(); Property.PropertySearch.clickReset();
		 */
		loader.navigateToScreen("Bicycle Registration");
		/*
		 * Property.SwitchToBicycleRegistration();
		 * Property.BicycleRegistration.enterNumberControlRegistrationNo();
		 * Property.BicycleRegistration.verifyNoRecordAcknowledgeMessage();
		 * Property.BicycleRegistration.clickResetButton();
		 */

		loader.navigateToModule("Records");
		loader.navigateToScreen("Call Search");
		/*
		 * Records.SwitchToCallSearch(); Records.CallSearch.clickDateResetButton();
		 * Records.CallSearch.enterNumberControlCallNo();
		 * Records.CallSearch.verifyNoRecordAcknowledgeMessage();
		 * Records.CallSearch.clickResetButton();
		 */
		loader.navigateToScreen("Case Search");
		/*
		 * Records.SwitchToCaseSearch(); Records.CaseSearch.clickDateResetButton();
		 * Records.CaseSearch.enterNumberControlCaseNo();
		 * Records.CaseSearch.verifyNoRecordAcknowledgeMessage();
		 * Records.CaseSearch.clickReset();
		 */
		loader.navigateToScreen("IBR Search");
		// Records.SwitchToIBRSearch();
		// Records.IBRSerch.enterNumberControlCaseNo();

		loader.navigateToModule("Inventory & Fleet");
		loader.navigateToScreen("Inventory Search");
		/*
		 * Inventory.SwitchToInventorySearch();
		 * Inventory.InventorySearch.enterNumberControlInventoryNo();
		 * Inventory.InventorySearch.verifyNoRecordAcknowledgeMessage();
		 * Inventory.InventorySearch.clickResetButton();
		 */

	}

	@Test
	public void police2017Sprint2Settings_148763() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Roles");
		settings.switchToRoles();
		settings.roles.enterAtRoleName();
		settings.roles.clickSearch();
		settings.roles.verifyAtRoleInGrid(0);
		settings.roles.verifyRightClickCopyRoleDisabled();
		settings.roles.selectAtRoleRowCheckBox();
		settings.roles.verifyCopyRoleLinkDisabled();

	}

	@Test
	public void police2017Sprint2Settings_149106() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("FTP Interface Search");
		settings.switchToFTPInterfaceSearch();
		settings.fTPInterfaceSearch.clickAddButton();
		settings.switchToFTPInterfaceEntry();
		settings.fTPInterfaceEntry.selectAtInterface();
		settings.fTPInterfaceEntry.selectDBName();
		settings.fTPInterfaceEntry.enterFolderPath();
		settings.fTPInterfaceEntry.enterUserName();
		settings.fTPInterfaceEntry.enterPassword();
		settings.fTPInterfaceEntry.enterPort();
		settings.fTPInterfaceEntry.selectLocationType();
		settings.fTPInterfaceEntry.enterCustom1();
		settings.fTPInterfaceEntry.enterKeepLog();
		settings.fTPInterfaceEntry.selectType();
		settings.fTPInterfaceEntry.selectNonPeakHrs();
		settings.fTPInterfaceEntry.enterFrom();
		settings.fTPInterfaceEntry.enterTo();
		settings.fTPInterfaceEntry.enterSubject();
		settings.fTPInterfaceEntry.saveScreen();
		settings.switchToFTPInterfaceEntry();
		settings.fTPInterfaceEntry.clickCustom1Text();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.selectFieldUsageAsHide();
		settings.repositoryEntry.saveScreen();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.closeScreen();
		settings.switchToFTPInterfaceEntry();
		settings.fTPInterfaceEntry.verifyCustom1Disabled();
		settings.fTPInterfaceEntry.clickCustom1Text();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.selectFieldUsageAsMandatory();
		settings.repositoryEntry.saveScreen();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.closeScreen();
		settings.switchToFTPInterfaceEntry();
		settings.fTPInterfaceEntry.verifyCustom1Mandatory();
		settings.fTPInterfaceEntry.closeScreen();
		settings.switchToFTPInterfaceSearch();
		settings.fTPInterfaceSearch.selectAtInterface();
		settings.fTPInterfaceSearch.clickSearch();
		settings.fTPInterfaceSearch.verifyAtInterfaceInGrid(0);

	}

	@Test
	public void police2017Sprint2Settings_149124() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Units");
		settings.switchToUnits();
		settings.unitsScreen.clickAddnew();
		settings.switchToUnitEntry();
		settings.unitEntry.enterAtUnit();
		settings.unitEntry.enterVehicle();
		settings.unitEntry.selectDispatchUnit();
		settings.switchToUnitEntry();
		settings.unitEntry.clickOnDutyNoReqCheckBox();
		settings.unitEntry.enterAtOnCallOfficer();
		settings.unitEntry.selectPatrolAreaAsPatrolZone();
		settings.unitEntry.clickAdd();
		settings.unitEntry.verifyPatrolZoneAddedGrid(0);
		settings.unitEntry.selectPatrolAreaAsPatrolZone();
		settings.unitEntry.clickAdd();
		settings.unitEntry.verifyRecordExistAcknowledgeMessage();
		settings.unitEntry.selectPatrolAreaAsPatrolZone1();
		settings.unitEntry.clickAdd();
		settings.unitEntry.saveScreen();
		settings.switchToUnitEntry();
		settings.unitEntry.close();
		settings.switchToUnits();
		settings.unitsScreen.enterAtUnit();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.verifyAtUnitInRow(0);
		settings.unitsScreen.clickUnitInGridRow();
		settings.switchToUnitEntry();
		settings.unitEntry.clickPatrolZone1InGrid();
		settings.unitEntry.verifyPatrolZone1();
		settings.unitEntry.clickInactiveCheckBox();
		settings.unitEntry.verifyInactiveDate();
		settings.unitEntry.saveScreen();
		settings.switchToUnitEntry();
		settings.unitEntry.close();
		settings.switchToUnits();
		settings.unitsScreen.verifyNoRecordAcknowledgeMessgage();
		settings.unitsScreen.clickIncludeInactiveCheckBox();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.verifyAtUnitInRow(0);
	}

	@Test
	public void police2017Sprint2Settings_149200() // 14.43 Police MJ DB only
	{

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Roles");
		settings.switchToRoles();
		settings.roles.enterAtRoleName();
		settings.roles.clickSearch();
		settings.roles.verifyAtRoleInGrid(0);
		settings.roles.selectAtRoleRowCheckBox();
		settings.roles.clickCopyRoleLink();
		settings.switchToRolesEntry();
		settings.rolesEntry.clickOverRideSelectAllCheckBox();
		settings.rolesEntry.clickSaveButton();
		settings.rolesEntry.verifyOverRideConfirmMessage();
		settings.rolesEntry.verifyRoleInactiveConfirmMessage();
		settings.rolesEntry.close();
	}

	@Test
	public void police2017Sprint2Settings_149210() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Repository");
		settings.switchToRepository();
		settings.repository.selectTypeAsScreen();
		settings.repository.clickSearch();
		settings.repository.clickNextButton();
		settings.repository.selectGoToScreenMenu();
		settings.switchToRepositoryUnNameScreen();
		settings.repository.verifyScreenShowsError();
		settings.switchToRepository();
		settings.repository.clickNextButton();
		settings.repository.selectGoToScreenMenu();
		settings.switchToRepositoryUnNameScreen();
		settings.repository.verifyScreenShowsError();
	}

	@Test
	public void cRM_53575Settings_150443() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Roles");

		settings.switchToRolesScreen();
		settings.roles.enterAtRoleName();
		// settings.roles.clickSearchButton();
		// settings.roles.verifyAtRoleNameInGrid();
		// settings.roles.RightClickByAtRoleName();
		// settings.roles.verifyCopyRoleEnabled();
		// settings.roles.clickCopyRoleInGrid();
		settings.switchToRolesEntry();
		settings.rolesEntry.verifyAtRoleName();
		settings.rolesEntry.close();
		settings.switchToRolesScreen();
		settings.roles.selectAtRoleRowCheckBox();
		settings.roles.clickCopyRoleLink();
		settings.switchToRolesEntry();
		settings.rolesEntry.verifyAtRoleName();
		settings.rolesEntry.close();

	}

	@Test
	public void police2017Sprint2Settings_147351() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Repository");
		settings.switchToRepository();
		settings.repository.enterScreenIDAs2275();
		settings.repository.clickSearch();
		settings.repository.verifyRepositoryIDAs2275(0);
		settings.repository.verifyDefaultNameAsCellStatus(0);
		settings.repository.selectCheckBoxInGrid();
		settings.repository.clickGOTOScreenLink();
		settings.switchToRepositoryUnNameScreen();
		// Names.CellStatus.clickShowOnlyOccupiedCheckBox();
		settings.repository.close();
		settings.switchToRepository();
		settings.repository.enterScreenIDAs1387();
		settings.repository.clickSearch();
		settings.repository.verifyRepositoryIDAs1387(0);
		settings.repository.verifyDefaultNameAsJailCell(0);
		settings.repository.selectCheckBoxInGrid();
		settings.repository.clickGOTOScreenLink();
		settings.switchToRepositoryUnNameScreen();
		settings.jailCell.clickAddNew();
		settings.switchToJailCellEntry();
		settings.jailCellEntry.closeScreen();
		settings.switchToRepositoryUnNameScreen();
		settings.repository.close();

	}

	@Test
	public void police2017SprintSettingsModule_158772() {
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
		settings.maintainCodeValue.verifyAtCodedID();
		settings.maintainCodeValue.selectJurisAsSO();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodedID();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtCodeValue();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.verifyAtCodeValueInGrid();

		settings.maintainCodeValue.selectJurisAsBL();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodedID();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtCodeValue1();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.verifyAtCodeValue1InGrid(0);

		settings.maintainCodeValue.selectJurisAsBE();
		settings.maintainCodeValue.clickSearchButton();
		settings.maintainCodeValue.verifyAtCodedID();
		settings.maintainCodeValue.clickAddNewButton();
		settings.maintainCodeValue.enterAtCodeValue2();
		settings.maintainCodeValue.enterAtDescription();
		settings.maintainCodeValue.clickAddButton();
		settings.maintainCodeValue.verifyAtCodeValue2InGrid(0);

	}

	@Test
	public void police2017SprintSettingsModule_158776() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Charge");
		settings.switchToCharge();
		settings.chargeScreen.clickAddNew();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtChargeCode();
		settings.sharedCodes.selectAtChargeType();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.enterAtRelatedCFSCode();
		settings.sharedCodes.enterRelatedMOCCode();
		settings.sharedCodes.enterAtNIBRSCode();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.verifyAtNIBRSCodeinGrid(0);
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.closeScreen();
		settings.switchToCharge();
		settings.chargeScreen.enterAtChargeCode();
		settings.chargeScreen.clickSearchButton();
		settings.chargeScreen.verifyAtChargeCode(0);
		settings.chargeScreen.verifyAtCFSCode(0);
		settings.chargeScreen.verifyAtNIBRS(0);
		settings.chargeScreen.clickAtChargeCodeinGrid();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickInactiveCheckBox();
		settings.sharedCodes.verifyInactiveDateAsCurrentDate();
		settings.sharedCodes.saveScreen();
		settings.switchToCharge();
		popup.acknowledge.ok();
		settings.chargeScreen.clickInactiveCheckbox();
		settings.chargeScreen.clickSearchButton();
		settings.chargeScreen.verifyAtChargeCode(0);
		settings.chargeScreen.verifyAtCFSCode(0);
		settings.chargeScreen.verifyAtNIBRS(0);
		settings.chargeScreen.verifyInactiveChargeRowColor(0);

	}

	@Test
	public void cRM_72303Settings_163448() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Action search");

		settings.switchToActionSearch();
		settings.actionSearch.clickAddNewButton();
		settings.switchToActionEntry();
		settings.actionEntry.clickSaveButton();
		settings.actionEntry.verify1011NoMessagePresentAckMsg();
		settings.actionEntry.enterAtActionNo();
		settings.actionEntry.enterAtActionName();
		settings.actionEntry.enterDescription();
		settings.actionEntry.enterVerifySPName();
		settings.actionEntry.enterAtProcessSPName();
		settings.actionEntry.enterInputParameterName();
		settings.actionEntry.selectAtValueType();
		settings.actionEntry.clickAddButton();
		settings.actionEntry.verifyAtValueTypeInGrid();
		settings.actionEntry.saveNClose();
		settings.switchToActionSearch();
		settings.actionSearch.enterAtActionNo();
		settings.actionSearch.clickSearchButton();
		settings.actionSearch.verifyAtActionNoInGrid();
		settings.actionSearch.verifyAtProcessSPNameInGrid();
		settings.actionSearch.selectRowByAtActionName();
		settings.switchToActionEntry();
		settings.actionEntry.enterAtInputParameterName();
		settings.actionEntry.selectValueType();
		settings.actionEntry.clickAddButton();
		settings.actionEntry.verifyAtInputParameterNameInGrid();
		settings.actionEntry.selectRowByAtValueType();
		settings.actionEntry.clearInputParameterName();
		settings.actionEntry.enterAtInputParameterName1();
		settings.actionEntry.selectAtValueType1();
		settings.actionEntry.clickAddButton();
		settings.actionEntry.save();
		settings.switchToActionEntry();
		settings.actionEntry.verifyAtInputParameterName1InGrid();
		settings.actionEntry.verifyAtValueType1InGrid();
		settings.actionEntry.close();

	}

	@Test
	public void cRM_78749Settings_180961() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Disposition");
		settings.switchToDisposition();
		settings.disposition.clickAddNew();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtDisposition();
		settings.sharedCodes.enterDescriptionAsQualityAssurance();
		settings.sharedCodes.selectAtType();
		settings.sharedCodes.verifyManagementTabDisabled();
		settings.sharedCodes.clickCADTab();
		settings.sharedCodes.clickCaseGereratedNoCheckBox();
		settings.sharedCodes.selectAtReportCode();
		settings.sharedCodes.selectBackupUnitReportCodeAsIncidentReport();
		settings.sharedCodes.clickSave();
		settings.sharedCodes.verifyReportCodeBackupUnitReportCodeAcknowledgeMessage();
		settings.sharedCodes.selectBackupUnitReportCodeAsArrestReport();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.closeScreen();
		settings.switchToDisposition();
		settings.disposition.enterAtDisposition();
		settings.disposition.selectAtType();
		settings.disposition.clickSearchButton();
		settings.disposition.verifyAtDispoationInGrid(0);
		settings.disposition.verifyAtTypeInGrid(0);
	}

	// Terminal
	@Test(groups = { "TerminalFunctional" })
	public void terminal_166734() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Terminal");

		settings.switchToTerminalScreen();
		settings.terminal.clickAddNewButton();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickSaveButton();
		settings.terminalEntry.verify1018RequiredEntriesAreMissingAckMsg();
		settings.terminalEntry.enterAtTerminalName();
		settings.terminalEntry.verifyDispatchTabDisabled();
		settings.terminalEntry.clickIPAddressTab();
		settings.terminalEntry.clickSaveButton();
		settings.terminalEntry.verify1018RequiredEntriesAreMissingAckMsg();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickIPAddressTab();
		settings.terminalEntry.iPAddressTab.enterLocation();
		settings.terminalEntry.iPAddressTab.enterAtIPAddress();
		settings.terminalEntry.iPAddressTab.enterDeviceName();
		settings.terminalEntry.iPAddressTab.clickUsedForCADCheckbox();
		settings.terminalEntry.verifyDispatchTabEnabled();
		settings.terminalEntry.iPAddressTab.enterDefaultPrinter();
		settings.terminalEntry.iPAddressTab.enterBarCodePrinter();
		settings.terminalEntry.iPAddressTab.selectIdentixLocation();
		settings.terminalEntry.iPAddressTab.enterReceiptPrinter();
		settings.terminalEntry.iPAddressTab.selectPOSMaxCharLine();
		settings.terminalEntry.iPAddressTab.enterValidationPrinter();
		settings.terminalEntry.iPAddressTab.enterCheckPrinter();
		settings.terminalEntry.iPAddressTab.selectZetronDevice();
		settings.terminalEntry.save();
		settings.switchToTerminalEntry();
		settings.terminalEntry.verify1002AdditionSuccessfulMessage();
		settings.terminalEntry.clickAllTabs();

	}

	@Test(groups = { "TerminalFunctional" })
	public void terminal_166735() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Terminal");

		settings.switchToTerminalScreen();
		settings.terminal.enterAtTerminalName();
		settings.terminal.enterAtIPAddress();
		settings.terminal.clickSearchButton();
		settings.terminal.selectRowByAtTerminalName();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickDispatchTab();
		settings.terminalEntry.dispatchTab.clickPoliceTakeNewCallsCheckbox();
		settings.terminalEntry.dispatchTab.clickPoliceUsedForDispatchCheckbox();
		settings.terminalEntry.dispatchTab.clickPoliceReceivedCallsCheckbox();
		settings.terminalEntry.dispatchTab.clickFireTakeNewCallsCheckbox();
		settings.terminalEntry.dispatchTab.clickFireUsedForDispatchCheckbox();
		settings.terminalEntry.dispatchTab.clickFireReceivedCallsCheckbox();
		settings.terminalEntry.dispatchTab.clickEMSTakeNewCallsCheckbox();
		settings.terminalEntry.dispatchTab.clickOthersTakeNewCallsCheckbox();
		settings.terminalEntry.dispatchTab.selectAtDispatchRoute();
		settings.terminalEntry.dispatchTab.clickAddButton();
		settings.terminalEntry.dispatchTab.verifyAtDispatchRouteInGrid();
		settings.terminalEntry.save();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickNCICTab();
		settings.terminalEntry.nCICTab.enterORINo();
		settings.terminalEntry.nCICTab.enterMnemonic();
		settings.terminalEntry.nCICTab.enterWorkStationName();
		settings.terminalEntry.nCICTab.clickReceiveUnsolicitedMessageCheckbox();
		Playback.controlReadyThreadWait();
		settings.terminalEntry.nCICTab.clickReceiveUndeliveredMessageCheckbox();
		settings.terminalEntry.save();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickE911Tab();
		settings.terminalEntry.e911Tab.enterPositionID();
		settings.terminalEntry.save();

	}

	@Test(groups = { "TerminalFunctional" })
	public void terminal_166736() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Terminal");

		settings.switchToTerminalScreen();
		settings.terminal.enterAtTerminalName();
		settings.terminal.enterAtIPAddress();
		settings.terminal.clickSearchButton();
		settings.terminal.selectRowByAtTerminalName();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickScreensTab();
		settings.terminalEntry.screensTab.selectAtMonitor();
		settings.terminalEntry.screensTab.selectAtScreen();
		settings.terminalEntry.screensTab.selectCustomStatus();
		settings.terminalEntry.screensTab.clickAddButton();
		settings.terminalEntry.screensTab.verifyAtMonitorInGrid();
		settings.terminalEntry.screensTab.verifyAtScreenNameInGrid();
		settings.terminalEntry.save();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickScreensTab();
		settings.terminalEntry.screensTab.deleteAtMonitorInGrid();
		popup.confirm.yes();
		settings.switchToTerminalEntry();
		settings.terminalEntry.save();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickScreensTab();
		settings.terminalEntry.screensTab.veriftAtMonitorRowDeleted();
		settings.terminalEntry.clickInventoryTab();
		settings.terminalEntry.inventoryTab.clickCounterCheckOutRadioButton();
		settings.terminalEntry.inventoryTab.verifyAllCheckboxDisabled();
		settings.terminalEntry.inventoryTab.clickSelfCheckOutRadioButton();
		settings.terminalEntry.inventoryTab.verifyAllCheckboxEnabled();
		settings.terminalEntry.inventoryTab.clickAllCheckbox();
		settings.terminalEntry.save();
	}

	@Test(groups = { "TerminalFunctional" })
	public void terminal_166737() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Terminal");

		settings.switchToTerminalScreen();
		settings.terminal.enterAtTerminalName();
		settings.terminal.clickSearchButton();
		settings.terminal.selectRowByAtTerminalName();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickDevicesTab();
		settings.terminalEntry.deviceTab.clickTerminalTypeComputerRadioButton();
		settings.terminalEntry.deviceTab.selectDeviceType();
		settings.terminalEntry.deviceTab.enterSWDANotifyAddress();
		settings.terminalEntry.save();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickInterfaceTab();
		settings.terminalEntry.interfaceTab.selectAtInterfaceName();
		settings.terminalEntry.interfaceTab.enterAtLocationHostSite();
		settings.terminalEntry.interfaceTab.enterCustom1();
		settings.terminalEntry.interfaceTab.clickAddButton();
		settings.terminalEntry.interfaceTab.verifyAtInterfaceNameInGrid();
		settings.terminalEntry.interfaceTab.verifyAtLocationHostSiteInGrid();
		settings.terminalEntry.save();

	}

	@Test(groups = { "TerminalFunctional" })
	public void terminal_166738() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Terminal");

		settings.switchToTerminalScreen();
		settings.terminal.enterAtTerminalName();
		settings.terminal.clickSearchButton();
		settings.terminal.verify1011NoRecordFoundAcknowledgeMessage();
		settings.terminal.clickIncludeInactiveCheckbox();
		settings.terminal.clickSearchButton();
		settings.terminal.verifyAtTerminalNameInGrid();
		settings.terminal.verifyAtTerminalNameRowAppearGrayColor();
		settings.terminal.selectRowByAtTerminalName();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickAllTabs();
		settings.terminalEntry.saveNClose();
		settings.switchToTerminalScreen();
		settings.terminal.reloadTerminalScreen();
		settings.terminal.enterAtTerminalName1();
		settings.terminal.clickSearchButton();
		settings.terminal.verify1011NoRecordFoundAcknowledgeMessage();
		settings.terminal.clickIncludeFireCheckbox();
		settings.terminal.clickSearchButton();
		settings.terminal.verifyAtTerminalName1InGrid();
		settings.terminal.verifyAtTerminalName1RowAppearRedColor();
		settings.terminal.selectRowByAtTerminalName1();
		settings.switchToTerminalEntry();
		settings.terminalEntry.clickAllTabs();

	}

	@Test(groups = { "TextMgmtFunctional" })
	public void textMgmt_166741() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Text");
		settings.switchToText();
		settings.textScreen.clickAddNew();
		settings.switchToTextEntry();
		settings.textEntry.clickSave();
		settings.textEntry.verifyRequiredAcknowledgeMessage();
		settings.textEntry.clickSubjectTab();
		settings.textEntry.textSubjectTab.enterAtTextName();
		settings.textEntry.textSubjectTab.enterAtRemarks();
		settings.textEntry.textSubjectTab.enterSearchWords();
		settings.textEntry.textSubjectTab.enterRichText();
		settings.textEntry.saveScreen();
		settings.switchToTextEntry();
		settings.textEntry.verifyAttachmentTabEnabled();
		settings.textEntry.clickAllTabs();
		settings.textEntry.clickTemplatesForTab();
		settings.textEntry.templateForTab.clickAddButton();
		settings.textEntry.templateForTab.verifyRequiredAcknowledgeMessage();
		settings.textEntry.templateForTab.enterAtScreenID();
		settings.textEntry.templateForTab.clickAddButton();
		settings.textEntry.templateForTab.verifyAtScreenID(0);
		settings.textEntry.saveScreen();
		settings.switchToTextEntry();
		settings.textEntry.clickReportsThatUseThisTextTab();
		settings.textEntry.reportsThatUseThisTextTab.clickAddButton();
		settings.textEntry.reportsThatUseThisTextTab.verifyRequiredAcknowledgeMessage();
		settings.textEntry.reportsThatUseThisTextTab.selectAtScreenID();
		settings.switchToTextEntry();
		settings.textEntry.reportsThatUseThisTextTab.clickAddButton();
		settings.textEntry.reportsThatUseThisTextTab.verifyAtReportName(0);
		settings.textEntry.reportsThatUseThisTextTab.verifyAtScreenID(0);
		settings.textEntry.saveScreen();
		settings.switchToTextEntry();
		settings.textEntry.close();

	}

	@Test(groups = { "TextMgmtFunctional" })
	public void textMgmt_166742() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Text");
		settings.switchToText();
		settings.textScreen.enterAtTextName();
		settings.textScreen.clickSearch();
		settings.textScreen.verifyAtTextName(0);
		settings.textScreen.verifyAtExpiryDate(0);
		settings.textScreen.clickAtTextNameInGrid();
		settings.switchToTextEntry();
		settings.textEntry.clickDeleteIcon();
		settings.textEntry.verifyDeleteConfirmMessage();
		settings.switchToText();
		settings.textScreen.verifyNoRecordFoundAcknowledgeMessage();
	}

	@Test(groups = { "UnitScreenFunctional" })
	public void unitsScreen_166739() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreenByScreenID("5031 - Unit Search");
		settings.switchToUnits();
		settings.unitsScreen.clickAddnew();
		settings.switchToUnitEntry();
		settings.unitEntry.clickSaveButton();
		settings.unitEntry.verify1018RequiredEntriesAreMissingAckMsg();
		settings.unitEntry.enterAtUnit();
		settings.unitEntry.selectAtDispatchUnitType();
		settings.switchToUnitEntry();
		settings.unitEntry.verifyOnCallOfficerFieldDisabled();
		settings.unitEntry.clickOnDutyNoReqCheckBox();
		settings.unitEntry.verifyOnCallOfficerFieldEnabled();
		settings.unitEntry.verifyPreAssignOfficer1FieldDisabled();
		settings.unitEntry.verifyPreAssignOfficer2FieldDisabled();
		settings.unitEntry.enterAtOnCallOfficer();
		settings.unitEntry.clickIsTrackableCheckBox();
		settings.unitEntry.selectWDAGroup();
		settings.switchToUnitEntry();
		settings.unitEntry.selectCustomIcon();
		settings.unitEntry.selectAtPatrolArea();
		settings.unitEntry.clickAdd();
		settings.unitEntry.saveScreen();
		settings.switchToUnitEntry();
		settings.unitEntry.verify1002AdditionSuccessfulMessage();
		settings.unitEntry.close();
		settings.switchToUnits();
		settings.unitsScreen.enterAtUnit();
		settings.unitsScreen.enterAtOfficer();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.verifyAtUnitInRow(0);
		settings.unitsScreen.verifyTrackCheckBoxChecked(0);

	}

	@Test(groups = { "UnitScreenFunctional" })
	public void unitsScreen_166740() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreenByScreenID("5031 - Unit Search");
		settings.switchToUnits();
		settings.unitsScreen.enterAtUnit();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.verifyNoRecordAcknowledgeMessgage();
		settings.unitsScreen.clickIncludeInactiveCheckBox();
		settings.unitsScreen.selectAtPatrolArea();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.verifyAtUnitInRow(0);
		settings.unitsScreen.verifyInactiveCheckBoxChecked(0);
		settings.unitsScreen.verifyInactiveUnitRowColor(0);

	}

	/*
	 * @Test(groups = { "UnitScreenFunctional" }) public void
	 * Police2019SettingsModule_217502() {
	 * 
	 * Browser.NavigateToLoginScreen(); Login.LogOn();
	 * Loader.LeftNavigation.NavigateToModule("Setting");
	 * Loader.LeftNavigation.NavigateToScreenByScreenID("5011 - CFSCode Search");
	 * Settings.SwitchToCFSCodeScreen(); Settings.CFSCode.ClickAddNewButton();
	 * Settings.SwitchToCFSCodeEntry(); Settings.CFSCodeEntry.EnterAtCFSCode();
	 * Settings.CFSCodeEntry.SelectAtType();
	 * Settings.CFSCodeEntry.EnterAtDescription();
	 * Settings.CFSCodeEntry.EnterAtShortDescription();
	 * Settings.CFSCodeEntry.SelectAtServiceType();
	 * Settings.CFSCodeEntry.EnterAtCFSClass(); Settings.CFSCodeEntry.ClickCADTab();
	 * Settings.CFSCodeEntry.CFSCodeCADTab.TabDispatchPriority();
	 * Settings.CFSCodeEntry.CFSCodeCADTab.SelectReportCode();
	 * Settings.CFSCodeEntry.CFSCodeCADTab.VerifyDoNotSendSMSFromCTCheckboxDisplayed
	 * (); Settings.CFSCodeEntry.CFSCodeCADTab.ClickDoNotSendSMSFromCTCheckbox();
	 * Settings.CFSCodeEntry.CFSCodeCADTab.ClickDisplayHAZMATFlagsCheckbox();
	 * Settings.CFSCodeEntry.CFSCodeCADTab.ClickDetailedCFSRequiredCheckbox();
	 * Settings.CFSCodeEntry.CFSCodeCADTab.Click24HRReportableCheckbox();
	 * Settings.CFSCodeEntry.SaveScreen(); Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.Close(); Settings.SwitchToCFSCodeScreen();
	 * Settings.CFSCode.EnterAtCFSCode(); Settings.CFSCode.ClickSearch();
	 * Settings.CFSCode.VerifyTypeUsingCFSCode();
	 * Settings.CFSCode.ClickAtCFSCodeInGrid(); Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.ClickOthersTab();
	 * Settings.CFSCodeEntry.CFSCodeOthersTab.SelectReportingStructure2();
	 * Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.CFSCodeOthersTab.SelectReportingStructure3();
	 * Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.CFSCodeOthersTab.SelectTrafficCFSClass();
	 * Settings.CFSCodeEntry.CFSCodeOthersTab.ClickCreateCallCFSEnteredCheckBox();
	 * Settings.CFSCodeEntry.SaveScreen(); Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.ClickSOPTab();
	 * Settings.CFSCodeEntry.CFSCodeSOPTab.SelectSOPTypeAsAllCondition();
	 * Settings.CFSCodeEntry.CFSCodeSOPTab.SelectTextName();
	 * Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.CFSCodeSOPTab.ClickAdd();
	 * Settings.CFSCodeEntry.CFSCodeSOPTab.VerifySOPTypeAsAllConditionInGrid(0);
	 * Settings.CFSCodeEntry.SaveScreen(); Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.ClickLinkedCFSTab();
	 * Settings.CFSCodeEntry.CFSCodeLinkedCFSTab.SelectPoliceCFS();
	 * Settings.SwitchToCFSCodeEntry();
	 * Settings.CFSCodeEntry.CFSCodeLinkedCFSTab.SelectPoliceServiceTypeAsPolice();
	 * Settings.CFSCodeEntry.CFSCodeLinkedCFSTab.VerifyFireCFSDisabled();
	 * Settings.CFSCodeEntry.CFSCodeLinkedCFSTab.ClickAdd();
	 * Settings.CFSCodeEntry.SaveScreen(); Settings.SwitchToCFSCodeEntry(); }
	 */

	@Test(groups = { "2020DefectSharedCodesSystemParameter" }, enabled = false) // reworked by dinesh. functionality not
																				// available as discussed with mahesha.
	public void Police2020SettingsModule_243683(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "243683");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Disposition");
		settings.switchToDisposition();
		settings.disposition.clickAddNew();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtDisposition();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.selectAtType(); // both type is not available.
		settings.sharedCodes.clickCaseGereratedNoCheckBox();
		settings.sharedCodes.selectBackupUnitReportCodeAsIncidentReport();
		settings.sharedCodes.clickManagementTab();
		settings.sharedCodes.SelectCaseStatusAsOpen();
		settings.sharedCodes.saveScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectTestCases" }) // Raja Sadaraj
	public void Police2020SettingsModule_243682(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "243682");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Units");
		settings.switchToUnits();
		settings.unitsScreen.clickAddnew();
		settings.switchToUnitEntry();
		settings.unitEntry.enterAtUnit(); // error detected by dinesh
		settings.unitEntry.enterVehicle();
		settings.unitEntry.selectAtDispatchUnitType(); // error detected by dinesh
		settings.switchToUnitEntry();
		settings.unitEntry.clickOnDutyNoReqCheckBox();
		settings.unitEntry.enterAtOnCallOfficer();
		settings.unitEntry.clickIsTrackableCheckBox();
		settings.unitEntry.clickAdd();
		settings.unitEntry.saveScreen();
		settings.switchToUnitEntry();
		settings.unitEntry.close();
		settings.switchToUnits();
		settings.unitsScreen.enterAtUnit();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.verifyAtUnitInRow(0);

	}

	@Test(groups = { "2020DefectQAFormsRolesAndReportRepository" })
	public void VerifyCopyQAformToSameJuris_244232(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "244232");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("QA Forms");
		settings.switchToQAForms();
		settings.qaForms.clickOnSearch();
		settings.qaForms.clickOnGridrow();
		qa.SwitchToQAFormEntry();
		qa.qAFormEntry.ClickCopyToSameJurisButton();
		qa.switchToQAFormEntryCopyJuris();
		qa.qAFormEntry.EnterAtFormRefNo();
		qa.qAFormEntry.EnterAtFormName();
		qa.qAFormEntry.EnterAtVersion();
		qa.qAFormEntry.EnterActiveAsOfDateAsCurrentDate();
		qa.qAFormEntry.SaveScreen();
		qa.qAFormEntry.ClickReviewButton();
		qa.SwitchToQuestionReviewEntry();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectSharedCodesSystemParameter" })
	public void VerifythatNIBRScodevalueshouldnotdisplayLowerCasevalueunderChargescreeninGrid_250103(
			ITestContext testContext) {
		testContext.setAttribute("testID", "250103");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Charge");
		settings.switchToCharge();
		settings.chargeScreen.clickAddNew();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtChargeCode();
		settings.sharedCodes.selectAtChargeType();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.enterAtRelatedCFSCode();
		settings.sharedCodes.enterAtNIBRSCode();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.verifyAtNIBRSCodeinGrid(0); // error detected by dinesh
		settings.sharedCodes.saveNClose();
		settings.switchToCharge();
		settings.chargeScreen.enterAtNIBRS();
		settings.chargeScreen.clickNIBRSSearchIcon();
		popup.kPICodedLookup.verifyNIBRSInCodedScreen(0);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectCodedCFSJobJuris" }, priority = 1) // Automated by Stalin

	public void Able_to_delete_the_Unit_screen_details_250422(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250422");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreenByScreenID("5031 - Unit Search");
		System.out.println("before ");
		settings.switchToUnits();
		System.out.println("After");
		settings.unitsScreen.clickAddnew();
		settings.switchToUnitEntry();
		settings.unitEntry.enterAtUnit();
		settings.unitEntry.selectAtDispatchUnitType(); // error detected by dinesh
		settings.switchToUnitEntry();
		settings.unitEntry.saveScreen();
		settings.switchToUnitEntry();
		settings.unitEntry.close();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Settings");
		loader.navigateToScreenByScreenID("5031 - Unit Search");
		settings.switchToUnits();
		settings.unitsScreen.enterAtUnit();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.clickUnitInGridRow();
		settings.switchToUnitEntry();
		settings.unitEntry.ClickDeleteIcon();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectSharedCodesSystemParameter" }) // Vijay
	public void verifySystemParameter705_251301(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "251301");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.enterAtParameterID();
		settings.sysParameter.clickSearchButton();
		settings.sysParameter.verifySystemParameter705AsNotEmpty();
		settings.sysParameter.setSystemParameter705AsEmpty();
		settings.sysParameter.saveScreen();
		settings.popup.acknowledge.ok();
		settings.switchToSystemParamter();
		settings.sysParameter.verifySystemParameter705AsEmpty();
		settings.sysParameter.setSystemParameter705AsYes();
		settings.sysParameter.saveScreen();
		settings.popup.acknowledge.ok();
		settings.switchToSystemParamter();
		settings.sysParameter.verifySystemParameter705AsNotEmpty();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectCodedCFSJobJuris" }, priority = 2) // Vijay
	public void verifyKeyPunchStatusReports_252295(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "252295");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter736AsDIVSEC();
		settings.switchToSystemParamter();
		settings.sysParameter.clickRefreshButton();
		settings.sysParameter.setSystemparameter745AsFalse();
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
		home.switchToMyHomeScreen();
	}

	@Test(groups = { "2020DefectSharedCodesSystemParameter" }) // Raja Sadaraj
	public void Police2020SettingsModule_253689(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "253689");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Charge");
		settings.switchToCharge();
		settings.chargeScreen.enterAtChargeCode(); // error detected by dinesh
		settings.chargeScreen.clickSearchButton();
		settings.chargeScreen.clickAtChargeCodeinGrid();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyAtNIBRSCodeinGrid(0);
		settings.sharedCodes.verifyAtChargeCode();
		settings.sharedCodes.enterAtNIBRSCode1();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.enterAtNIBRSCode();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.verify1019DuplicationOfDataFound();
		settings.sharedCodes.saveScreen();
		settings.sharedCodes.closeScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "" }) // Vijay,reworked by dinesh. flow matches only for 87.
	public void verifyWaterMarkTemplateIsableToCreate_255127(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "255127");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Text");
		settings.switchToText();
		settings.textScreen.clickAddNew();
		settings.switchToTextEntry();
		settings.textEntry.clickSubjectTab();
		settings.textEntry.textSubjectTab.enterAtTextName();
		settings.textEntry.textSubjectTab.enterRichText();
		settings.switchToTextEntry();
		settings.textEntry.clickTemplatesForTab();
		settings.textEntry.templateForTab.enterAtScreenID();
		settings.textEntry.templateForTab.clickAddButton();
		settings.textEntry.templateForTab.verifyAtScreenName(0);
		settings.switchToTextEntry();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectCodedCFSJobJuris" }, priority = 3) // Vijay
	public void verifySystemCodedProtectiveCustodyAddedInCodeID3008_255526(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "255526");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtCodeValue(); // error detected by dinesh
		settings.sharedCodes.clickSearchButton();
		settings.sharedCodes.verifyAtCodeValueDescription(0);
		settings.switchToSharedCodes();
	}

	@Test(groups = { "2020DefectSharedCodesSystemParameter" }) // Automated by Stalin
	public void Applicationshouldcreateanewdisposition_254465(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254465");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Disposition");
		settings.switchToDisposition();
		settings.disposition.clickAddNew();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtDisposition();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.selectAtType();
		settings.sharedCodes.clickCADTab();
		settings.sharedCodes.clickCaseGereratedNoCheckBox();
		settings.sharedCodes.selectAtReportCode();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifySuccessfulBottomMessage();

	}

	@Test(groups = { "2020DefectQAFormsRolesAndReportRepository" }) // Oct Sprint 1 Automated by Mahesha
	public void VerifyRolesScreenAllowsPFtoDeleteRoleEntry1290_256104(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "256104");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Roles");
		settings.switchToRolesScreen();
		settings.roles.enterAtRoleName();
		settings.roles.clickSearch();
		settings.roles.selectRowAtRoleName();
		settings.switchToRolesEntry();
		settings.rolesEntry.verifyAtRoleName();
		settings.rolesEntry.verifyDeleteIconEnabledToClick();
		settings.rolesEntry.enterAtScreenID();
		settings.rolesEntry.clickSearchButton();
		settings.rolesEntry.verifyDeleteCheckBoxNotCheckedForLoginUser();
		settings.rolesEntry.mouseHoverOnDeleteIconAndVerifyDeleteRole();
		settings.rolesEntry.clickDeleteIcon();
		settings.roles.verifyNoRecordsFound();
		settings.switchToRolesScreen();
		settings.roles.enterAtRoleName1();
		settings.roles.clickSearch();
		settings.roles.selectRowAtRoleName1();
		settings.switchToRolesEntry();
		settings.rolesEntry.verifyDeleteIconNotEnabledToClick();
		settings.rolesEntry.mouseHoverOnDeleteIconAndVerifyDeleteRoleNotAllowed();

	}

	@Test(groups = { "2020DefectQAFormsRolesAndReportRepository" }) // Oct Sprint 1 Automated by Mahesha
	public void VerifyRoleAreAbleToCopyToSameJurisMultiJuris_256105(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "256105");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Roles");
		settings.switchToRolesScreen();
		settings.roles.enterAtRoleName();
		settings.roles.clickSearch();
		settings.roles.selectAtRoleRowCheckBoxByIndex(0);
		settings.roles.verifyCopyToSameJurisIsEnabled();
		settings.roles.verifyCopyToMultiJurisIsEnabled();

		// 1
		settings.roles.clickCopyToSameJuris();
		settings.switchToRolesEntry();
		settings.rolesEntry.verifyAtRoleName();
		settings.rolesEntry.enterAtCopyRoleName();
		settings.rolesEntry.enterAtCopyRoleNameDescription();
		settings.rolesEntry.clickSaveNClose();
		settings.switchToRolesScreen();
		settings.roles.enterAtCopyRoleName();
		settings.roles.clickSearch();
		settings.roles.verifyAtCopyRoleNameInGrid();

		// 2
		settings.switchToRolesScreen();
		settings.roles.enterAtRoleName1();
		settings.roles.clickSearch();
		settings.roles.selectAtRoleRowCheckBoxByIndex(0);
		settings.roles.clickCopyToMultiJuris();
		settings.switchToRolesEntry();
		settings.rolesEntry.clickCopyNameSelectAllCheckbox();
		settings.rolesEntry.clickSaveButton();
		settings.rolesEntry.verifyCopyRoleConfirmMessage();
		settings.switchToRolesScreen();
		settings.roles.selectAtJurisAsBC();
		settings.roles.enterAtRoleName1();
		settings.roles.clickSearch();
		settings.roles.verifyAtRoleName1InGrid();

		// 3
		settings.switchToRolesScreen();
		settings.roles.selectAtJurisAsPX();
		settings.roles.enterAtRoleName2();
		settings.roles.clickSearch();
		settings.roles.selectAtRoleRowCheckBoxByIndex(0);
		settings.roles.clickCopyToMultiJuris();
		settings.switchToRolesEntry();
		settings.rolesEntry.clickOverRideSelectAllCheckBox();
		settings.rolesEntry.clickSaveButton();
		settings.rolesEntry.verifyOverRideConfirmMessage();
		settings.switchToRolesScreen();
		settings.roles.selectAtJurisAsBC();
		settings.roles.enterAtRoleName2();
		settings.roles.clickSearch();
		settings.roles.verifyAtRoleName2InGrid();
		settings.switchToRolesScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectSharedCodesSystemParameter" }, enabled = false) // Oct Sprint 2 Automated by Mahesha
	public void SystemParameter540And549UpdatedInPoliceIsUpdatedInFire_257059(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		String url = PropertiesFile.readPropertiesFile("Fire93");
		testcontext.setAttribute("testID", "257059");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter540AsFalse();
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter549AsFalse(); // error detected by dinesh
		loader.logout();
		Browser.NavigateToUrl(url);
		login.loginScreen.logonUsingTestContextOtherDB(); // error detected by dinesh
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.verifySytemParameter540SelectedValueAsFalse();
		settings.sysParameter.verifySytemParameter540Disabled();
		settings.sysParameter.verifySytemParameter549SelectedValueAsFalse(); // error detected by dinesh
		settings.sysParameter.verifySytemParameter549Disabled();
	}

	@Test(groups = { "2020DefectSharedCodesSystemParameter" }) // Oct Sprint 3 Automated by Mahesha
	public void PoliceToFireAndFireToPoliceMapLayerEntryReflection_258280(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "258280");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtDescriptionInGrid(0);
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickAddNewButton();
		settings.sharedCodes.enterAtCodeValue();
		settings.sharedCodes.enterAtLayerDescription();
		settings.sharedCodes.selectAtLayerIcon();
		settings.sharedCodes.clickCodeAddButton();
		settings.sharedCodes.enterAtCodeValueSearch();
		settings.sharedCodes.clickSearchButton(); // error detected by dinesh
		settings.sharedCodes.verifyAtCodeValueinGrid(0);
		settings.sharedCodes.closeScreen();

		loader.navigateToModule("Geo");
		loader.navigateToScreen("Map Layer Search");
		geo.switchToMapLayerSearch();
		geo.mapLayerSearch.clickAddnewButton();
		geo.switchToMapLayerEntry();
		geo.mapLayerEntry.selectAtLayerType();
		geo.mapLayerEntry.selectAtLayerName(0);
		geo.mapLayerEntry.enterAtFeatureName();
		geo.mapLayerEntry.selectIsFireCheckBox();
		geo.mapLayerEntry.enterAtAddress();
		geo.mapLayerEntry.SaveScreen();
		geo.switchToMapLayerEntry();
		geo.mapLayerEntry.verifyIsFireCheckBoxSelectedAndDisabled();
		geo.mapLayerEntry.clickRefershButton();
		geo.mapLayerEntry.verifyAttachmentTabEnabled();

	}

	@Test // Oct Sprint 3 Automated by Mahesha
	public void PoliceToFireAndFireToPoliceMapLayerEntryReflection_258281(ITestContext testcontext) {
		String url = PropertiesFile.readPropertiesFile("Fire82");
		testcontext.setAttribute("testID", "258281");
		Browser.NavigateToUrl(url);
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Map Layer Search");
		geo.switchToMapLayerSearch();
		geo.mapLayerSearch.selectAtLayerName(0);
		geo.mapLayerSearch.clickSearchButton();
		geo.mapLayerSearch.verifyAtNameInGrid(0);
		geo.mapLayerSearch.selectGridRowByLayerName(0);
		geo.switchToMapLayerEntry();
		geo.mapLayerEntry.selectAtLayerName(1);
		geo.mapLayerEntry.enterAtFeatureName();
		geo.mapLayerEntry.enterAtAddress();
		geo.mapLayerEntry.switchToRemarksTab();
		geo.mapLayerEntry.enterAtRemarks();
		geo.switchToMapLayerEntry();
		geo.mapLayerEntry.clickSaveNCloseScreen();
		geo.switchToMapLayerSearch();
	}

//Issue in Fire to police Sync map layers
	@Test // Oct Sprint 3 Automated by Mahesha
	public void PoliceToFireAndFireToPoliceMapLayerEntryReflection_258282(ITestContext testcontext) {
		testcontext.setAttribute("testID", "258282");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Map Layer Search");
		geo.switchToMapLayerSearch();
		geo.mapLayerSearch.selectAtLayerName(0);
		geo.mapLayerSearch.selectIncludeFireCheckBox();
		geo.mapLayerSearch.clickSearchButton();
		geo.mapLayerSearch.verifyNoRecordsFoundAck();
		geo.switchToMapLayerSearch();
		geo.mapLayerSearch.selectAtLayerName(1);
		geo.mapLayerSearch.selectIncludeFireCheckBox();
		geo.mapLayerSearch.clickSearchButton();
		geo.mapLayerSearch.verifyAtNameInGrid(0);
		geo.mapLayerSearch.selectGridRowByLayerName(1);
		geo.switchToMapLayerEntry();
		geo.mapLayerEntry.switchToRemarksTab();
		geo.mapLayerEntry.verifyAtRemarksEntered();

	}

	@Test(groups = { "2020DefectQAFormsRolesAndReportRepository" }) // Automated by Stalin
	public void NewPDFRadiobuttoninQAFormEntry_258916(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258916");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("QA Forms");
		settings.switchToQAForms();
		settings.qaForms.clickAddNew();
		qa.SwitchToQAFormEntry();
		qa.qAFormEntry.EnterAtFormRefNo();
		qa.qAFormEntry.EnterAtFormName();
		qa.qAFormEntry.EnterAtVersion();
		qa.qAFormEntry.EnterActiveAsOfDateAsCurrentDate();
		qa.qAFormEntry.clickPDFRadioButton();
		qa.qAFormEntry.selectPdfFile(); // Error occures here.
		qa.qAFormEntry.SaveScreen();
		qa.SwitchToQAFormEntry();
		qa.qAFormEntry.clickPDFLink(); // changes made in method level.
		qa.SwitchToManageQuestionsEntry();
		qa.switchToPDFFormScreen();
		qa.pdfFormScreen.close();
		qa.SwitchToQAFormEntry();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectJobsAndJuris" }) // Vijay
	public void verifyThatFormNameNotAllowedToSelectInactiveReportFromJobEntryScreen_256807(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "256807");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Jobs");
		settings.switchToJobs();
		settings.jobsScreen.clickSearch();
		Playback.popupThreadWait();
		settings.jobsScreen.clickAtJobNameInGrid();
		settings.switchToJobEntry();
		Playback.popupThreadWait();
		settings.jobEntry.selectAtFormName();
		settings.jobEntry.verifyInactivePopupAcknowledgeMessage();
		settings.switchToJobEntry();
		settings.jobEntry.close();
	}

	@Test(groups = { "2020DefectCodedCFSJobJuris" }, priority = 4) // Automated by Mahesha
	public void VerifyThatAddedPatrolAreaFieldInCFSNotificationEntryScreen_260157(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260157");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("CFS Code");
		settings.switchToCFSCode();
		settings.cFSCode.enterAtCFSCode();
		settings.cFSCode.selectAtType();
		settings.cFSCode.clickSearch();
		settings.cFSCode.VerifyTypeUsingCFSCode();
		settings.cFSCode.clickAtCFSCodeInGrid();
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.clickEmailIcon();
		home.switchToNotificationScreen();
		home.notification.verifyAtNotificationSetupCFSCode();
		home.notification.verifyPatrolAreaDropdownDisplayed();
		home.notification.verifyAtRequestPFCode();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent();
		home.notification.selectAtPatrolArea();
		home.notification.clickAddButton();
		home.notification.SaveScreen();
		home.switchToNotificationScreen();
		home.notification.VerifySuccessfulBottomMessage();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectQAFormsRolesAndReportRepository" }, enabled = false) // Mithun Q4 Sprint 2 //Mahesha
	public void VerifyAbleToUploadDownloadCustomerReportUsingParamterWitHttpsAndHttp_256803(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256803");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter36AsHttps();
		loader.navigateToScreen("Report Repository");
		settings.switchToReportRepository();
		settings.reportRepository.selectTypeAsForm(); // error detected by dinesh, changes made in method level.
		settings.reportRepository.enterScreenIDAs2544();
		settings.reportRepository.clickSearch();
		settings.reportRepository.selectAtGridrowByName();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickDownloadButton(); // error detected by dinesh
		settings.closeActiveWindow();
		settings.switchToSharedCodes();
		settings.sharedCodes.shareDownloadedFileToServerAsTestCaseID(); // error detected by dinesh
		settings.sharedCodes.clickUploadButton();
		settings.switchToReportRepositoryEntry();
		settings.reportRepositoryEntry.clickSelectButton();
		settings.reportRepositoryEntry.selectPDFAtTestcaseID();
		settings.switchToReportRepositoryEntry();
		settings.reportRepositoryEntry.clickUploadPDFButton();
		settings.reportRepositoryEntry.verifyUploadedSuccessfulFooterStatusMessage(); // error detected by dinesh
		settings.reportRepositoryEntry.close();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyDeleteCustomReportButtonEnabled();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
	}

	@Test // Vijay
	public void verifyAlertTypenewlyAddedInCFSCodeEntryScreen_252888(ITestContext testcontext) {
		testcontext.setAttribute("testID", "252888");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("CFS Code");
		settings.switchToCFSCode();
		settings.cFSCode.clickAddNewButton();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtCFSCode();
		settings.sharedCodes.selectAtType();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.clickCADTab();
		settings.sharedCodes.verifyAlertTypeOptions();
		settings.sharedCodes.selectAtAlertType();
		settings.sharedCodes.saveNClose();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("CFS Code");
		settings.switchToCFSCode();
		settings.cFSCode.enterAtCFSCode();
		settings.cFSCode.clickSearch();
		settings.cFSCode.VerifyTypeUsingCFSCode();

	}

	@Test(groups = { "2020DefectCodedCFSJobJuris" }, priority = 6)

//Mithun
	public void DefectTestcaseSettings_250097(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250097");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Jobs");
		settings.switchToJobs();
		settings.jobsScreen.clickSearch();
		settings.jobsScreen.clickAddNew();
		settings.switchToJobEntry();
		settings.jobEntry.enterAtJobName();
		settings.jobEntry.selectAtJobType();
		settings.jobEntry.clickScheduleTab();
		settings.jobEntry.tabStartDate();
		settings.jobEntry.enterAtEndDate();
		settings.jobEntry.saveScreen();
		settings.switchToJobEntry();
		settings.jobEntry.clickDailyRadiobutton();
		settings.jobEntry.enterEveryDaysAs1();
		settings.switchToJobEntry(); // added by dinesh
		settings.jobEntry.clickInactiveCheckBox(); // error detected by dinesh
		settings.jobEntry.saveScreen();
		settings.switchToJobEntry();
		settings.jobEntry.close();
		objectIdentification.windowHandle.switchToMainWindow();
		settings.switchToJobs();
		settings.jobsScreen.enterAtJobName();
		settings.jobsScreen.clickIncludeInactiveCheckBox(); // error detected by dinesh
		settings.jobsScreen.clickSearch();
		settings.jobsScreen.verifyAtJobNameInGrid();
		settings.switchToJobs();
	}

	@Test(groups = { "2020DefectSharedCodesSystemParameter" }) // Automated by Stalin
	public void VerifyPhonefield_260394(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260394");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtCodeIDInGrid(0);
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickAddNewButton();
		settings.sharedCodes.EnterAtPopUpCodeValue();// error detected by dinesh, changes made by dinesh.
		settings.sharedCodes.EnterAtPopUpDescription();
		settings.sharedCodes.clickAddButtonInPopUp();
		settings.sharedCodes.verifyAtCodeValue();
		settings.sharedCodes.verifyAtCodeValueDescription();
		settings.sharedCodes.closeScreen();
		settings.switchToCodedScreen();
		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Entry");
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.verifyAtPhone1();
		personnel.personnelEntry.close();
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowInGrid(0);
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickMainTab();
		personnel.personnelEntry.personnelEntryMainTab.selectAtPhoneNoType();
		personnel.personnelEntry.personnelEntryMainTab.enterPhoneNo();
		personnel.personnelEntry.personnelEntryMainTab.clickAddButton();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.save();
		personnel.switchToPersonnelEntry();

	}

	@Test(groups = { "2020DefectQAFormsRolesAndReportRepository" }, enabled = false) // Mithun Missed test case // By
																						// Stalin
	public void VerifyAbleToUploadDownloadCustomerReportUsingParamterWitHttpsAndHttp_254474(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "254474");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter36AsHttps();
		settings.switchToSystemParamter();
		loader.navigateToScreen("Report Repository");
		settings.switchToReportRepository();
		settings.reportRepository.selectAtType();
		settings.reportRepository.clickSearch();
		settings.reportRepository.selectAtGridrowByName();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickDownloadButton();
		settings.closeActiveWindow();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickUploadButton();
		settings.switchToReportRepositoryEntry();
		settings.reportRepositoryEntry.clickSelectButton();
		settings.reportRepositoryEntry.selectPDFFile();
		settings.switchToReportRepositoryEntry();
		settings.reportRepositoryEntry.clickUploadPDFButton(); // error detected by dinesh
		settings.reportRepositoryEntry.verifyUploadedSuccessfulFooterStatusMessage();
		settings.reportRepositoryEntry.close();
		settings.switchToSharedCodes();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.closeScreen();
		settings.switchToReportRepository();
		settings.reportRepository.selectAtType1();
		settings.reportRepository.clickSearch();
		settings.reportRepository.selectAtGridrowByName1();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickDownloadButton();
		settings.closeActiveWindow();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickUploadButton();
		settings.switchToReportRepositoryEntry();
		settings.reportRepositoryEntry.clickSelectButton();
		settings.reportRepositoryEntry.selectRDLFile();
		settings.switchToReportRepositoryEntry();
		settings.reportRepositoryEntry.clickUploadPDFButton();
		settings.reportRepositoryEntry.verifyUploadedSuccessfulFooterStatusMessage();
		settings.reportRepositoryEntry.close();
		settings.switchToSharedCodes();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.closeScreen();
	}

	@Test(groups = { "2020DefectJobsAndJuris" }) // Mithun's Missed testcase // Reviewed By Stalin
	public void VerifyAbleToUpdateJurisInfo_256107(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256107");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Juris");
		settings.switchToJurisEntry();
		settings.juris.clickAddressTab();
		settings.juris.jusrisAddressTab.selectAtAddressType();
		settings.juris.jusrisAddressTab.enterAtAddress();
		settings.juris.jusrisAddressTab.clickAddBUtton();
		settings.switchToJurisEntry();
		settings.juris.saveButton();
		settings.switchToJurisEntry();
		settings.juris.verifyUpdateSuccessfulMessage();
		settings.juris.clickAddressTab();
		settings.juris.jusrisAddressTab.verifyAtAddressInGrid();
		settings.switchToJurisEntry();

	}

	@Test(groups = { "2020DefectJobsAndJuris" }) // Mithun's Missed Testcase // Automated by Stalin
	public void DefectTestcaseSettings_256108(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256108");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Jobs");
		settings.switchToJobs();
		settings.jobsScreen.clickSearch();
		settings.jobsScreen.clickAtJobNameInGrid();
		settings.switchToJobEntry();
		settings.jobEntry.clickScheduleTab();
		settings.jobEntry.clickWeeklyRadiobutton();
		settings.jobEntry.enterAtEvery();
		settings.jobEntry.clickMondayCheckBox();
		settings.jobEntry.clickTuesdayCheckBox();
		settings.jobEntry.clickWednesdayCheckBox();
		settings.jobEntry.clickThursdayCheckBox();
		settings.jobEntry.clickFridayCheckBox();
		settings.jobEntry.clickReCalculateCheckbox();
		settings.switchToJobEntry();
		settings.jobEntry.saveScreen();
		settings.switchToJobEntry();
	}

	@Test(groups = { "2020DefectQAFormsRolesAndReportRepository" }) // reworked by dinesh
	// Mithun
	public void VerifyRoleAreAbleToCopyToSameJurisMultiJuris_259724(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "259724");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("QA Forms");
		settings.switchToQAForms();
		settings.qaForms.clickOnSearch();
		settings.qaForms.selectManageRepositoryUsingFormRef();
		qa.switchToQuestionnaireRepository();
		qa.questionnarieRepository.EnterAtRepositoryID();
		qa.questionnarieRepository.clickAddButton();
		qa.questionnarieRepository.save();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Gun Permit entry");
		names.switchToGunPermitEntry();
		names.gunPermitEntry.enterAtNameID();
		names.gunPermitEntry.selectAtPermitType();
		names.gunPermitEntry.selectAtPermitStatus();
		names.gunPermitEntry.SaveScreen();
		names.switchToGunPermitEntry();
		names.gunPermitEntry.switchToQAFormTab(); // error detected by dinesh
		names.switchToGunPermitEntry();
		names.gunPermitEntry.SaveScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyRFARecoverForAnOtherAgencyCodeValueIsAvailableUnderCoded3557_263937(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "263937");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtDescriptionInGrid(0);
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyAtDescription();// Not Possible
		settings.sharedCodes.verifyAtCodeValueinGrid(0);
		settings.sharedCodes.verifyAtCodeValueDescriptionInGrid(0);
		settings.sharedCodes.verifyInactiveCheckboxUnChecked(0);
		settings.sharedCodes.verifyAtCodeValue1inGrid(1);
		settings.sharedCodes.verifyAtCodeValueDescription1InGrid(1);
		settings.sharedCodes.verifyInactiveCheckboxChecked();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay
	public void verifyTheTasksTabsAddedInTheCFSCodeAndCopyTheExistingTasks_265269(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "265269");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("CFS Code");
		settings.switchToCFSCode();
		settings.cFSCode.selectAtType();
		settings.cFSCode.enterAtCFSCode();
		settings.cFSCode.clickSearch();
		settings.cFSCode.clickAtCFSCodeInGrid();
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.verifyTasksTabDisplayed();
		settings.cFSCodeEntry.ClickTasksTab();
		settings.cFSCodeEntry.cFSCodeTasksTab.selectAtCopyTaskFromComboBox();
		settings.cFSCodeEntry.cFSCodeTasksTab.clickCopyButton();
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.SaveScreen();
		settings.switchToCFSCodeEntry();

	}

	@Test(priority = 1, groups = { "2021DefectTestCases" }) // Automated by Stalin
	public void EnterStatutoryLimitionfromChargeScreen_263422(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263422");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Charge");
		settings.switchToCharge();
		settings.chargeScreen.clickAddNew();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyStatutoryLimitationToRetainEvidenceIsEnabled();
		settings.sharedCodes.enterAtChargeCode();
		settings.sharedCodes.selectAtChargeType();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.enterAtRelatedCFSCode();
		settings.sharedCodes.enterAtStatutoryLimitationToRetainEvidence();
		settings.sharedCodes.enterAtNIBRSCode();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.verifyAtNIBRSCodeinGrid(0);
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifySuccessfulBottomMessage();
		settings.switchToSharedCodes();

	}

//Testcase ID – 263423
	@Test(priority = 2, groups = { "2021DefectTestCases" }) // Automated by Stalin
	public void EnterStatutoryLimitionfromCFSScreen_263423(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263423");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("CFS Code");
		settings.switchToCFSCode();
		settings.cFSCode.clickAddNewButton();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtCFSCode();
		settings.sharedCodes.enterAtDescription();
		settings.sharedCodes.selectAtCFSType();
		settings.sharedCodes.enterAtCFSClass();
		settings.sharedCodes.clickManagementTab();
		settings.sharedCodes.managementTab.verifyStatutoryLimitationToRetainEvidenceIsEnabled();
		settings.sharedCodes.managementTab.enterAtStatutoryLimitationToRetainEvidence();
		settings.switchToSharedCodes();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifySuccessfulBottomMessage();
		settings.switchToSharedCodes();

	}

//Testcase ID – 263425
	@Test(priority = 4, groups = { "2021DefectTestCases" }) // Automated by Stalin Q1 S2
	public void VerifyCoded3530IsAllowingToCreateMultipleCodeValues_263425(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263425");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickAddNewButton();
		settings.sharedCodes.EnterAtPopUpCodeValue(); // error detected by dinesh
		settings.sharedCodes.EnterAtPopUpDescription();
		settings.sharedCodes.clickAddButtonInPopUp();
		settings.sharedCodes.verifyAtCodeValueDescription();
		settings.sharedCodes.clickAddNewButton();
		settings.sharedCodes.enterAtPopUpCodeValue1();
		settings.sharedCodes.enterAtPopUpDescription1();
		settings.sharedCodes.clickAddButtonInPopUp();
		settings.sharedCodes.verifyAtCodeValueDescription1();
		settings.switchToSharedCodes();
		objectIdentification.windowHandle.switchToMainWindow();
	}

//Testcase ID – 263434
	@Test(priority = 5, groups = { "2021DefectTestCases" }) // Automated by Stalin Q1 S2
	public void Verify3551CodeValueIsAllowingToMapWithCoded3530CodeValue_263434(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263434");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded Map");
		settings.switchToCodedMapScreen();
		settings.codedMap.selectAtInterface();
		settings.codedMap.verifyAtInterfaceDropdownList();
		settings.codedMap.clickAddNewButton();
		settings.switchToCodedMapDetail();
		settings.codedMapDetail.enterAtCodeType();
		settings.codedMapDetail.clickAddNew();
		settings.codedMapDetail.clickPopUpPhoenixValueSearchIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtCodeValueInGrid();
		settings.switchToCodedMapDetail();
		settings.codedMapDetail.enterAtMapCodeValue();
		settings.codedMapDetail.enterAtMapDescription();
		settings.codedMapDetail.clickPopUpAddButton();
		settings.codedMapDetail.clickAddNew();
		settings.codedMapDetail.clickPopUpPhoenixValueSearchIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtCodeValueInGrid();
		settings.switchToCodedMapDetail();
		settings.codedMapDetail.enterAtMapCodeValue1();
		settings.codedMapDetail.enterAtMapDescription1();
		settings.codedMapDetail.clickPopUpAddButton();
		settings.codedMapDetail.verifyAtMapCodeValueInGrid();

	}

	@Test(priority = 3, groups = { "2021DefectTestCases" }) // Automated by Mahesha
	public void Verify3531CodeValueIsAllowingToMapWithCoded3530CodeValue_263927(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "263927");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded Map");
		settings.switchToCodedMapScreen();
		settings.codedMap.selectAtInterface();
		settings.codedMap.verifyAtInterfaceDropdownList();
		settings.codedMap.clickAddNewButton();
		settings.switchToCodedMapDetail();
		settings.codedMapDetail.enterAtCodeType();
		settings.codedMapDetail.clickAddNew();
		settings.codedMapDetail.clickPopUpPhoenixValueSearchIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtCodeValueInGrid();
		settings.switchToCodedMapDetail();
		settings.codedMapDetail.enterAtMapCodeValue();
		settings.codedMapDetail.enterAtMapDescription();
		settings.codedMapDetail.clickPopUpAddButton();
		settings.codedMapDetail.clickAddNew();
		settings.codedMapDetail.clickPopUpPhoenixValueSearchIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtCodeValueInGrid();
		settings.switchToCodedMapDetail();
		settings.codedMapDetail.enterAtMapCodeValue1();
		settings.codedMapDetail.enterAtMapDescription1();
		settings.codedMapDetail.clickPopUpAddButton();
		settings.codedMapDetail.verifyAtMapCodeValueInGrid();

	}

	@Test(groups = { "2021DefectTestCases" }) // Vijay // Q2 Sprint 3
	public void verifyJurisDropdownEnabledForLocalCoded_272999(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "272999");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.selectAtMJCategory();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID();
		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.verifyJurisEnabled();
		settings.maintainCodeValue.closeTheScreen();
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID1();
		settings.coded.selectAtMJCategory1();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID1();
		settings.switchToMaintainCodeValue();
		settings.maintainCodeValue.verifyJurisDisabled();
	}

	@Test(groups = { "2021DefectTestCases" }) // Mahesha
	public void police2021SprintSettingsModule_265270(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "265270");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("CFS Code");
		settings.switchToCFSCode();
		settings.cFSCode.selectAtType();
		settings.cFSCode.enterAtCFSCode();
		settings.cFSCode.clickSearch();
		settings.cFSCode.clickAtCFSCodeInGrid();
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.ClickTasksTab();
		settings.cFSCodeEntry.cFSCodeTasksTab.verifyTaskCodeAsMandatory();
		settings.cFSCodeEntry.cFSCodeTasksTab.EnterAtDueNoOfDays();
		settings.cFSCodeEntry.cFSCodeTasksTab.EnterSortOrderAs0();
		settings.cFSCodeEntry.cFSCodeTasksTab.enterAtTaskDetails();
		settings.cFSCodeEntry.cFSCodeTasksTab.clickAddButton();
		settings.cFSCodeEntry.cFSCodeTasksTab.verifyRequiredEntriesAreMissingAcknowledge();
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.ClickTasksTab();
		settings.cFSCodeEntry.cFSCodeTasksTab.SelectAtTaskCode();
		settings.cFSCodeEntry.cFSCodeTasksTab.clickAddButton();
		settings.cFSCodeEntry.SaveScreen();
		settings.switchToCFSCodeEntry();

		settings.cFSCodeEntry.ClickTasksTab();
		settings.cFSCodeEntry.cFSCodeTasksTab.verifyTaskDetailsAsMandatory();
		settings.cFSCodeEntry.cFSCodeTasksTab.SelectAtTaskCode1();
		settings.cFSCodeEntry.cFSCodeTasksTab.EnterAtDueNoOfDays();
		settings.cFSCodeEntry.cFSCodeTasksTab.EnterSortOrderAs1();
		settings.cFSCodeEntry.cFSCodeTasksTab.clickAddButton();
		settings.cFSCodeEntry.cFSCodeTasksTab.verifyRequiredEntriesAreMissingAcknowledge();
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.ClickTasksTab();
		settings.cFSCodeEntry.cFSCodeTasksTab.enterAtTaskDetails();
		settings.cFSCodeEntry.cFSCodeTasksTab.clickAddButton();
		settings.cFSCodeEntry.SaveScreen();
		settings.switchToCFSCodeEntry();
	}

	@Test(groups = { "2021DefectTestCases" }) // Mithun
	public void verifySystemParameterCaseNotification_273490(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273490");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter801AsDATransmit();
		settings.switchToSystemParamter();
		settings.sysParameter.ClickCaseNotificationeButton();
		home.switchToNotificationScreen();
		home.notification.selectAtDistributionList();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent1(); // error detected by dinesh
		home.notification.clickAddButton();
		home.notification.verifyAtRequestedByInGrid();
		home.notification.clickEMailRadioButton();
		home.notification.enterAtEmail();
		home.notification.enterAtName();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent2();
		home.notification.clickAddButton();
		home.notification.verifyAtRequestedByInGrid();
		home.notification.SaveScreen();
		home.switchToNotificationScreen();
	}

	@Test(groups = { "2021DefectTestCases" }) // Mithun
	public void verifySystemParameterCaseNotification_273491(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273491");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter801AsAlways();
		settings.switchToSystemParamter();
		settings.sysParameter.ClickCaseNotificationeButton();
		home.switchToNotificationScreen();
		home.notification.selectAtDistributionList(); // error detected by dinesh.
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent1();
		home.notification.clickAddButton();
		home.notification.verifyAtRequestedByInGrid(); // error detected by dinesh
		home.notification.clickEMailRadioButton();
		home.notification.enterAtEmail();
		home.notification.enterAtName();
		home.notification.selectAtReportingPeriod();
		home.notification.selectAtNotifyEvent2();
		home.notification.clickAddButton();
		home.notification.verifyAtRequestedByInGrid();
		home.notification.SaveScreen();
		home.switchToNotificationScreen();
	}

// Automated by Vijay // Date : 08/31/2021 // Sprint: 2021 Q3 Sprint 4
	@Test
	public void verifyFromUnitScreenEnhancedTheAvailableMutualAidCheckboxAbleToSaveWithCheckboxChecked_281047(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281047");
		Browser.NavigateToLoginScreenForFire();
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Units");
		settings.switchToUnitsForFire();
		settings.unitsScreen.clickSearch();
		settings.unitsScreen.clickUnitInGridRow();
		settings.switchToUnitEntry();
		settings.unitEntry.verifyMutualAidUnitIsDisplayed();
		settings.unitEntry.clickMutualAidUnitCheckBox();
		settings.unitEntry.saveScreen();
		settings.switchToUnitEntry();
		settings.unitEntry.verifyMutualAidUnitCheckBoxIsChecked();
	}

// Automated by Vijay // Date :09/08/2021 // Sprint: Q3 Sprint 5
	@Test
	public void verifyWhetherTheQAFormTabIsShowingProperlyWhenTheActivityTypeHasSpecificQAFormIsMappedForTheScreen_281415(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281415");
		Browser.NavigateToLoginScreenForFire();
		login.loginScreen.LogonForFire();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("QA Forms");
		settings.switchToQAForms();
		settings.qaForms.enterAtFormNameEdit();
		settings.qaForms.clickOnSearch();
		settings.qaForms.selectCheckBoxOfTheRowByFormRefNO();
		settings.qaForms.clickManageRepository();
		qa.switchToQuestionnaireRepository();
		qa.questionnarieRepository.EnterAtRepositoryID();
		qa.questionnarieRepository.selectAtActivityType();
		qa.questionnarieRepository.clickAddButton();
		qa.questionnarieRepository.saveNClose();
		settings.switchToQAForms();
		settings.qaForms.enterAtFormNameEdit1();
		settings.qaForms.clickOnSearch();
		settings.qaForms.selectCheckBoxOfTheRowByFormRefNO1();
		settings.qaForms.clickManageRepository();
		qa.switchToQuestionnaireRepository();
		qa.questionnarieRepository.EnterAtRepositoryID();
		qa.questionnarieRepository.selectAtActivityType();
		qa.questionnarieRepository.clickAddButton();
		qa.questionnarieRepository.saveNClose();

		loader.navigateToModule("Home");
		loader.navigateToScreen("Activity Search");
		activity.switchToActivitySearch();
		activity.activitySearch.clickAddNewButton();
		activity.SwitchToActivityEntry();
		activity.activityEntry.clickActivityTypeTreeIcon();
		popup.switchToTreeViewHelp();
		popup.treeViewHelp.enterAtSearch();
		popup.treeViewHelp.selectOptionByAtActivityType();
		popup.treeViewHelp.clickSelect();
		activity.SwitchToActivityEntry();
		activity.activityEntry.SelectActivityStatusAsCompletedActivity();
		activity.activityEntry.tabActivityDateTime();
		activity.activityEntry.EnterSubjectAsTesting();
		activity.activityEntry.Save();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToQAFormsTab();
		activity.activityEntry.activityEntryQAFormsTab.selectAtSelectForm();
		qa.SwitchToQuestionDataEntry();
		qa.questionDataEntry.TabOutPF();
		qa.questionDataEntry.clickSaveNClose();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToQAFormsTab();
		activity.activityEntry.activityEntryQAFormsTab.clickRefreshButton();
		activity.activityEntry.activityEntryQAFormsTab.verifyAtFormNameInGrid();
		activity.activityEntry.activityEntryQAFormsTab.selectAtSelectForm1();
		qa.SwitchToQuestionDataEntry();
		qa.questionDataEntry.TabOutPF();
		qa.questionDataEntry.clickSaveNClose();
		activity.SwitchToActivityEntry();
		activity.activityEntry.NavigateToQAFormsTab();
		activity.activityEntry.activityEntryQAFormsTab.clickRefreshButton();
		activity.activityEntry.activityEntryQAFormsTab.verifyAtFormName1InGrid();

	}

//Automated by KIRAN :-     Date :-10/12/2021  Quarter:-4  Sprint:-1 
	@Test(groups = { "2022DefectTestCasesKIRAN" })
	public void QAFormTabDisplayedWithoutAnyConfigurationInDashboardEntryScreen_283634(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "283634");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("QA Forms");
		settings.switchToQAForms();
		settings.qaForms.enterAtScreenID();
		settings.qaForms.clickOnSearch();
		settings.qaForms.VerifyNoRecordAcknowledgeMessage();
		loader.navigateToModule("BI");
		loader.navigateToScreen("DashBoard Config");
		bi.switchToDashBoardConfig();
		bi.dashBoardConfig.SelectRandomValueInGrid();
		bi.switchToDashBoardEntry();
		bi.dashBoardEntry.verifyQaFormTabIsNotAvialable();

	}

//Automated by KIRAN :-     Date :-26/11/2021  Quarter:-4  Sprint:-4  Module:-Settings
	@Test(groups = { "2022RBTestCasesKIRAN" })
	public void VerifyThatInactivePFShouldBeRemovedFromTheDistributionList_285052(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "285052");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Distribution List");
		settings.switchToDistributionList();
		;
		settings.distributionList.clickSearch();
		settings.distributionList.selectByDistributionName();
		settings.switchToDistributionEntry();
		settings.distributionEntry.verifyAtDistributionListName();
		settings.distributionEntry.closeSreen();

		loader.navigateToModule("Personnel");
		loader.navigateToScreen("Personnel Search");
		personnel.switchToPersonnelSearch();
		personnel.personnelSearch.enterAtPF();
		personnel.personnelSearch.clickSearchButton();
		personnel.personnelSearch.selectRowAtPFCode();
		personnel.switchToPersonnelEntry();
		personnel.personnelEntry.clickInactiveCheckBox();
		personnel.personnelEntry.save();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Distribution List");
		settings.switchToDistributionList();
		settings.distributionList.clickSearch();
		settings.distributionList.selectByDistributionName();
		settings.switchToDistributionEntry();
		settings.distributionEntry.verifyAtDistributionListNameIsNotPresent();

	}

//Automated by Stalin // Date :11/01/2021 //Quarter:04 // Sprint: 03//Module:Settings
	@Test
	public void VerifytheCFSchargeisallowingtomapwithPurge_273499(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "273499");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.SelectAtCodeValueDescription();
		settings.sharedCodes.verifyAllowPurgeCheckBoxIsDisplayed();
		settings.sharedCodes.clickAllowPurgeCheckBox();
		settings.sharedCodes.clickAddButtonInPopUp();
		settings.sharedCodes.closeScreen();
		settings.switchToCodedScreen();
		loader.navigateToScreen("CFS Code");
		settings.switchToCFSCode();
		settings.cFSCode.enterAtCFSCode();
		settings.cFSCode.clickSearch();
		settings.cFSCode.clickAtCFSCodeInGrid();
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.verifyAtCFSClassDescription();
		settings.cFSCodeEntry.verifyDoNotPurgeCheckBoxIsDisplayed();
		settings.cFSCodeEntry.SaveScreen(); // method Updated
		settings.switchToCFSCodeEntry();
		settings.cFSCodeEntry.Close();
		loader.navigateToScreen("Charge");
		settings.switchToCharge();
		settings.chargeScreen.enterAtCFSCode();
		settings.chargeScreen.clickSearchButton();
		settings.chargeScreen.selectAtCFSCodeInGrid();
		settings.switchToSharedCodes();
		settings.sharedCodes.verifyAtRelatedCFSCode();
		settings.sharedCodes.verifyDoNotPurgeCheckBoxIsEnabled();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
	}

//Automated by:-Dinesh , Date :-02/09/2022 , Quarter:-1 , Sprint:-3 , Module:-Settings .

@Test(groups = { "" })
public void SelectReportScreenShouldOpenWithoutAnyErrorInIncidentSearchScreenWhenAddNewPermissionDisabled_289921(ITestContext testcontext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "289921");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Settings");
	loader.navigateToScreen("Roles");
	settings.switchToRoles();
	settings.roles.enterAtRoleName();
	settings.roles.clickSearchButton();
	settings.roles.selectAtRoleNameInGrid();
	settings.switchToRolesEntry();
	settings.rolesEntry.enterAtScreenID();
	settings.rolesEntry.clickSearchButton();
	settings.rolesEntry.clickReportRepositoryEntryEditPermissionButton();
	settings.switchToRolesEntryEditScreen();
	settings.rolesEntry.clickAtAddNewCheckbox();
	settings.rolesEntry.clickSaveButton();
	settings.switchToRolesEntryEditScreen();
	settings.rolesEntry.verifyUpdateSuccessfulMessage();
	settings.rolesEntry.clickSaveNClose();
    // since concurrent required module is not covered as per Mahesha intimated stopped TC flow here.
}

	// Automated by TesterName :- Vijay Date :- 02/03/2022 Sprint:-Sprint 3
	// Quarter:- 2022 Q1 Module:- Settings
	@Test(groups = { "" })
	public void verifyThatExportToExcelIconInTheTextSearchScreen_292512(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "292512");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.ClickTextMsgSrchImageIcon();
		loader.EnterAutomationinTextMsgSrchTextBox();
		loader.pressEnterInTextMsgSrchTextBox();
		settings.switchToTextSearchHelpWindow();
		String text = settings.textSearchHelpWindow.readSearchWord();
		String concat = text.concat("sdjbfsdjfnsdjkf");
		settings.textSearchHelpWindow.verifyTheTextInGrid(concat);
		settings.textSearchHelpWindow.clickExcelIcon();

	}

	// Automated by TesterName :- Vijay Date :-02/09/2022 Sprint:-Sprint 3
	// Quarter:-Q1 Module:- Settings
	@Test(groups = { "" })
	public void verifyTheFunctionalitiesOfSystemParameterScreen_292508(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "292508");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();

		settings.sysParameter.selectAtModule();
		settings.sysParameter.clickSearchButton();
		settings.sysParameter.verifyComboBoxSystemParametersListedInScreen();
		settings.sysParameter.verifyEditSystemParametersListedInScreen();
		settings.sysParameter.selectModuleAsNull();
		settings.sysParameter.clickRefreshButton();
		settings.sysParameter.setSystemparameter5909AsFalse();
		settings.switchToSystemParamter();
		settings.sysParameter.resetParameterID();
		settings.sysParameter.enterAtParameterName();
		settings.sysParameter.clickSearchButton();
		settings.sysParameter.verifyComboBoxSystemParametersListedInScreen();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter5909AsTrue();
		settings.switchToSystemParamter();
		settings.sysParameter.clickViewHistoryButton();
		settings.sysParameter.switchToHistoryWindow();
		settings.viewHistoryWindow.enterAtParameterID();
		settings.viewHistoryWindow.clickSearchButton();
		String oldValue1 = settings.viewHistoryWindow.readValuesInGrid("Old Value", 8);
		String newValue1 = settings.viewHistoryWindow.readValuesInGrid("New Value", 8);
		String oldPF = settings.viewHistoryWindow.readValuesInGrid("PF Code", 8);
		settings.viewHistoryWindow.verifyCellValueWithExpectedData(oldPF, BaseData.getSettingsModuleValue("OldPFCode"));
		settings.viewHistoryWindow.verifyCellValueWithExpectedData(oldValue1,
				BaseData.getSettingsModuleValue("OldValue1"));
		settings.viewHistoryWindow.verifyCellValueWithExpectedData(newValue1,
				BaseData.getSettingsModuleValue("NewValue1"));
		String NewPF = settings.viewHistoryWindow.readValuesInGrid("PF Code", 7);
		String oldValue2 = settings.viewHistoryWindow.readValuesInGrid("Old Value", 7);
		String newValue2 = settings.viewHistoryWindow.readValuesInGrid("New Value", 7);
		settings.viewHistoryWindow.verifyCellValueWithExpectedData(NewPF, BaseData.getSettingsModuleValue("NewPFCode"));
		settings.viewHistoryWindow.verifyCellValueWithExpectedData(oldValue2,
				BaseData.getSettingsModuleValue("OldValue2"));
		settings.viewHistoryWindow.verifyCellValueWithExpectedData(newValue2,
				BaseData.getSettingsModuleValue("NewValue2"));
		settings.viewHistoryWindow.verifyPFColumnCheckboxDisplayed(1);
		settings.viewHistoryWindow.verifyPFColumnCheckboxDisplayed(2);

	}
	
	//Automated by:-Dinesh , Date :-02/14/2022 , Quarter:-Q1 , Sprint:-3 , Module:-Settings .

		@Test(groups = { "" })
		public void JobStatusShouldBeShownAsSuccessInJobsScreen_289924(ITestContext testcontext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "289924");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Settings");
			loader.navigateToScreen("Jobs");
			settings.switchToJobs();
			settings.jobsScreen.selectAtJobType();
			settings.jobsScreen.clickSearch();
			settings.jobsScreen.clickAtJobNameInGrid();
			settings.switchToJobEntry();
			settings.jobEntry.clickRunJobButton();
			settings.jobEntry.saveNClose();
			loader.clickOnPNXLogo();
			loader.mouseHoverOnPnxLogoAction("Tools");
			loader.mouseHoverAndClickOnPnxLogoAction("Job Log");
			settings.switchToJobsScreen();
			settings.jobsScreen.selectAtDBName();
			settings.jobsScreen.clickSearch();
			settings.jobsScreen.verifyJobNameInGrid();
			
		}
	
	

	@AfterMethod(groups = { "TerminalFunctional", "TextMgmtFunctional", "UnitScreenFunctional", "2020DefectSharedCodes",
			"2020DefectJobAndJuris", "2020DefectCodedAndCFS", "2020DefectQAFormsRolesAndReportRepository",
			"2020DefectSharedCodesSystemParameter", "2020DefectTestCases", "2021DefectTestCases", "2020DefectQAForm",
			"2022DefectTestCasesKIRAN", "2020DefectCodedCFSJobJuris" })
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
		settings.reset();
	}

	@AfterSuite(groups = { "TerminalFunctional", "TextMgmtFunctional", "UnitScreenFunctional", "2020DefectSharedCodes",
			"2020DefectJobAndJuris", "2020DefectCodedAndCFS", "2020DefectQAFormsRolesAndReportRepository",
			"2020DefectSharedCodesSystemParameter", "2020DefectTestCases", "2021DefectTestCases", "2020DefectQAForm",
			"2022DefectTestCasesKIRAN", "2020DefectCodedCFSJobJuris" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}

}
