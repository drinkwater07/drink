package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import application.Settings.CodedMap;
import application.Settings.CodedMapDetail;
import application.Settings.ReportRepository;
import application.Settings.ReportRepositoryEntry;
import application.Settings.TextSearchHelpWindow;
import application.Settings.ViewHistoryWindow;

import utilities.Playback;

public class UIMapSettings {

	public SystemParameter systemParameter;
	public AccessLog accessLog;
	public Terminal terminal;
	public TerminalEntry terminalEntry;
	public PhoenixAuthenticatorWindow phoenixAuthenticatorWindow;
	public Coded coded;
	public MaintainCodeValue maintainCodeValue;
	public JailCell jailCell;
	public JailCellEntry jailCellEntry;
	public JailCellHelpWindow jailCellHelpWindow;
	public RepositoryEntry repositoryEntry;
	public CustomFieldsScreen customFieldsScreen;
	public Roles roles;
	public FTPInterfaceSearch fTPInterfaceSearch;
	public FTPInterfaceEntry fTPInterfaceEntry;
	public UnitsScreen unitsScreen;
	public UnitEntry unitEntry;
	public RolesEntry rolesEntry;
	public Repository repository;
	public ChargeScreen chargeScreen;
	public SharedCodes sharedCodes;
	public ActionSearch actionSearch;
	public ActionEntry actionEntry;
	public TextEntry textEntry;
	public TextScreen textScreen;
	public Disposition disposition;
	public JobsScreen jobsScreen;
	public JobEntry jobEntry;
	public Juris juris;
	public EmailTemplate emailTemplate;
	public EmailTemplateEntry emailTemplateEntry;
	public FormRepositoryScreen formRepositoryScreen;
	public CFSCode cFSCode;
	public CFSCodeEntry cFSCodeEntry;
	public FireStationSearch fireStationSearch;
	public FireStationEntry fireStationEntry;
	public HazMatGuide hazMatGuide;
	public HazMatEntry hazMatEntry;
	public QAForms qaForms;
	public ApprovalParameter approvalParameter;
	public ReportRepository reportRepository;
	public ReportRepositoryEntry reportRepositoryEntry;
	public CodedMap codedMap;
	public CodedMapDetail codedMapDetail;
	public DistributionList distributionList;

	public DistributionEntry distributionEntry;

	public ViewHistoryWindow viewHistoryWindow;

	public TextSearchHelpWindow textSearchHelpWindow;

	public UIMapSettings() {

		if (this.systemParameter == null)
			this.systemParameter = new SystemParameter();

		if (this.accessLog == null)
			this.accessLog = new AccessLog();

		if (this.terminal == null)
			this.terminal = new Terminal();

		if (this.terminalEntry == null)
			this.terminalEntry = new TerminalEntry();

		if (this.phoenixAuthenticatorWindow == null)
			this.phoenixAuthenticatorWindow = new PhoenixAuthenticatorWindow();

		if (this.coded == null)
			this.coded = new Coded();

		if (this.maintainCodeValue == null)
			this.maintainCodeValue = new MaintainCodeValue();

		if (this.jailCell == null)
			this.jailCell = new JailCell();

		if (this.jailCellEntry == null)
			this.jailCellEntry = new JailCellEntry();

		if (this.jailCellHelpWindow == null)
			this.jailCellHelpWindow = new JailCellHelpWindow();

		if (this.repositoryEntry == null)
			this.repositoryEntry = new RepositoryEntry();

		if (this.customFieldsScreen == null)
			this.customFieldsScreen = new CustomFieldsScreen();

		if (this.roles == null)
			this.roles = new Roles();

		if (this.fTPInterfaceSearch == null)
			this.fTPInterfaceSearch = new FTPInterfaceSearch();

		if (this.fTPInterfaceEntry == null)
			this.fTPInterfaceEntry = new FTPInterfaceEntry();

		if (this.repository == null)
			this.repository = new Repository();

		if (this.unitEntry == null)
			this.unitEntry = new UnitEntry();

		if (this.rolesEntry == null)
			this.rolesEntry = new RolesEntry();

		if (this.unitsScreen == null)
			this.unitsScreen = new UnitsScreen();

		if (this.chargeScreen == null)
			this.chargeScreen = new ChargeScreen();

		if (this.sharedCodes == null)
			this.sharedCodes = new SharedCodes();

		if (this.actionSearch == null)
			this.actionSearch = new ActionSearch();

		if (this.actionEntry == null)
			this.actionEntry = new ActionEntry();

		if (this.textScreen == null)
			this.textScreen = new TextScreen();

		if (this.textEntry == null)
			this.textEntry = new TextEntry();

		if (this.disposition == null)
			this.disposition = new Disposition();

		if (this.jobsScreen == null)
			this.jobsScreen = new JobsScreen();

		if (this.jobEntry == null)
			this.jobEntry = new JobEntry();

		if (this.juris == null)
			this.juris = new Juris();

		if (this.emailTemplate == null)
			this.emailTemplate = new EmailTemplate();

		if (this.emailTemplateEntry == null)
			this.emailTemplateEntry = new EmailTemplateEntry();

		if (this.formRepositoryScreen == null)
			this.formRepositoryScreen = new FormRepositoryScreen();

		if (this.cFSCodeEntry == null)
			this.cFSCodeEntry = new CFSCodeEntry();

		if (this.cFSCode == null)
			this.cFSCode = new CFSCode();

		if (this.fireStationSearch == null)
			this.fireStationSearch = new FireStationSearch();

		if (this.fireStationEntry == null)
			this.fireStationEntry = new FireStationEntry();

		if (this.hazMatGuide == null)
			this.hazMatGuide = new HazMatGuide();

		if (this.hazMatEntry == null)
			this.hazMatEntry = new HazMatEntry();

		if (this.qaForms == null)
			this.qaForms = new QAForms();

		if (this.approvalParameter == null)
			this.approvalParameter = new ApprovalParameter();

		if (this.reportRepository == null)
			this.reportRepository = new ReportRepository();

		if (this.reportRepositoryEntry == null)
			this.reportRepositoryEntry = new ReportRepositoryEntry();

		if (this.codedMap == null)
			this.codedMap = new CodedMap();

		if (this.codedMapDetail == null)
			this.codedMapDetail = new CodedMapDetail();

		if (this.distributionList == null)
			this.distributionList = new DistributionList();

		if (this.distributionEntry == null)
			this.distributionEntry = new DistributionEntry();

		if (this.textSearchHelpWindow == null)
			this.textSearchHelpWindow = new TextSearchHelpWindow();

		if (this.viewHistoryWindow == null)
			this.viewHistoryWindow = new ViewHistoryWindow();

	}

	// region System Parameter Screen UI Classes
	public class SystemParameter {
		public WebDriver driver;

		public SystemParameter() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtParamID")
		public WebElement uIParameterIDEdit;

		@FindBy(how = How.ID, using = "txtParamName")
		public WebElement uIParameterNameEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdApproval")
		public WebElement uIApproveParameterButton;

		@FindBy(how = How.ID, using = "cmdParamName")
		public WebElement uIParameterNameButton;

		@FindBy(how = How.ID, using = "cmdFTP")
		public WebElement uIFTPInterfaceButton;

		@FindBy(how = How.ID, using = "param_714_Dyn_DropDown")
		public WebElement uIBiasFormHateIndicatorComboBox;

		@FindBy(how = How.ID, using = "param_764_Dyn_DropDown")
		public WebElement uIDefaultCaseStatusComboBox;

		@FindBy(how = How.ID, using = "param_705_Dyn")
		public WebElement uIAffirmationMessageEdit;

		@FindBy(how = How.ID, using = "lstModule")
		public WebElement uIModuleDropDown;

		@FindBy(how = How.ID, using = "btnCaseNotify")
		public WebElement uICaseNotificationIcon;

		@FindBy(how = How.ID, using = "cmdHistory")
		public WebElement uIViewHistoryButton;

	}

	// System Parameter Screen UI Classes
	public class AccessLog {
		public WebDriver driver;

		public AccessLog() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropDown;

		@FindBy(how = How.ID, using = "lupRepID_CodeValue")
		public WebElement uIRepositoryCodeEdit;

		@FindBy(how = How.ID, using = "lupRepID_CodeDescription")
		public WebElement uIRepositoryDescTextEdit;

		@FindBy(how = How.ID, using = "lupRepID_imgBtn")
		public WebElement uIRepositoryLupSrchButton;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeDescription")
		public WebElement uIPFDescTextEdit;

		@FindBy(how = How.ID, using = "lupPF_imgBtn")
		public WebElement uIPFLupSrchButton;

		@FindBy(how = How.ID, using = "lstActType_DropDown")
		public WebElement uIAccessTypeDropDown;

		@FindBy(how = How.ID, using = "dtcStartDttm_Date_KPIDttmCtrl")
		public WebElement uIFromDateDEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtcStartDttm_Time']//input")
		public WebElement uIFromTimeEdit;

		@FindBy(how = How.ID, using = "dtcToDttm_Date_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtcToDttm_Time']//input")
		public WebElement uIToTimeEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdActLog")
		public WebElement uIAccessLogResultGrid;

		@FindBy(how = How.ID, using = "numCallNbr_Year")
		public WebElement uICallNoYear;

		@FindBy(how = How.ID, using = "numCallNbr_Number")
		public WebElement uICallNoEdit;

		@FindBy(how = How.ID, using = "numCaseNbr_Year")
		public WebElement uICaseNoYear;

		@FindBy(how = How.ID, using = "numCaseNbr_Number")
		public WebElement uICaseNoEdit;

		@FindBy(how = How.ID, using = "txtDesc")
		public WebElement uIDescriptionEdit;
	}

	// region Terminal UI Collections
	public class Terminal {
		public WebDriver driver;

		public Terminal() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtTerminalName")
		public WebElement uITerminalNameEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckbox;

		@FindBy(how = How.ID, using = "chkFireTerminal")
		public WebElement uIIncludeFireCheckbox;

		@FindBy(how = How.ID, using = "txtIPAddress")
		public WebElement uIIPAddressEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdTerminalSrch")
		public WebElement uITerminalTable;

	}

	// region Terminal Entry UI Collections
	public class TerminalEntry {
		public WebDriver driver;

		public IPAddressTab iPAddressTab;
		public DispatchTab dispatchTab;
		public NCICTab nCICTab;
		public E911Tab e911Tab;
		public ScreensTab screensTab;
		public InventoryTab inventoryTab;
		public DeviceTab deviceTab;
		public InterfaceTab interfaceTab;

		public TerminalEntry() {
			if (this.dispatchTab == null)
				this.dispatchTab = new DispatchTab();

			if (this.iPAddressTab == null)
				this.iPAddressTab = new IPAddressTab();

			if (this.nCICTab == null)
				this.nCICTab = new NCICTab();

			if (this.e911Tab == null)
				this.e911Tab = new E911Tab();

			if (this.screensTab == null)
				this.screensTab = new ScreensTab();

			if (this.inventoryTab == null)
				this.inventoryTab = new InventoryTab();

			if (this.deviceTab == null)
				this.deviceTab = new DeviceTab();

			if (this.interfaceTab == null)
				this.interfaceTab = new InterfaceTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtTerminalName")
		public WebElement uITerminalNameEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "chkIsFire")
		public WebElement uIFireCheckBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Main')])")
		public WebElement uITerminalEntryMainTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'IP Address(s)')])")
		public WebElement uIIPAddressTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Dispatch')])")
		public WebElement uIDispatchTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'NCIC')])")
		public WebElement uINCICTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'E-911')])")
		public WebElement uIE911Tab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Screens')])")
		public WebElement uIScreensTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Inventory')])")
		public WebElement uIInventoryTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Device')])")
		public WebElement uIDeviceTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Interface')])")
		public WebElement uIInterfaceTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Interface')])")
		public WebElement uICMSTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		public WebElement uIBottomMesssageTextView;

	}

	public class IPAddressTab {
		public WebDriver driver;

		public IPAddressTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtLocation")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtIPaddress")
		public WebElement uIIPaddressEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_chkCAD")
		public WebElement uIUseforCADCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtDeviceName")
		public WebElement uIDeviceNameEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtDefaultPrinter")
		public WebElement uIDefaultPrinterEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtBarCodePrinter")
		public WebElement uIBarCodePrinterEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtReceiptPrinter")
		public WebElement uIReceiptPrinterEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_ccdZetronDevice_DropDown")
		public WebElement uIZetronDeviceComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_cddIdentixLoc_DropDown")
		public WebElement uIIdentixLocationComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_cddPOSMaxChar_DropDown")
		public WebElement uIPOSMaxCharComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtValidationPrinter")
		public WebElement uIValidationPrinterEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtCheckPrinter")
		public WebElement uICheckPrinterEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl0_UsrMain1_txtIQEye")
		public WebElement uIIQEyeEdit;

	}

	public class DispatchTab {
		public WebDriver driver;

		public DispatchTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkNewCalls")
		public WebElement uIPoliceTakeNewCallCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkDispatch")
		public WebElement uIPoliceUsedforDispatchCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkACD")
		public WebElement uIPoliceReceivedCallsCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkNewCallsFire")
		public WebElement uIFireTakeNewCallCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkDispatchFire")
		public WebElement uIFireUsedforDispatchCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkACDFire")
		public WebElement uIFireReceivedCallsCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkNewCallsEMS")
		public WebElement uIEMSTakeNewCallCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_chkNewCallsOthers")
		public WebElement uIOthersTakeNewCallCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_cddDispatchRoute_DropDown")
		public WebElement uIDispatchRouteComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl2_UsrPolice1_grdDispatchRoute")
		public WebElement uIDispatchRouteTable;

	}

	public class NCICTab {
		public WebDriver driver;

		public NCICTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl3_UsrNCIC1_txtORIno")
		public WebElement uIORINoEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl3_UsrNCIC1_txtPSN")
		public WebElement uIMnemonicEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl3_UsrNCIC1_txtWorkStationName")
		public WebElement uIWorkStationNameEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl3_UsrNCIC1_chkUnsolicitedMsg")
		public WebElement uIReceivedUnsolicitedMessageCheckBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl3_UsrNCIC1_chkUndeliveredMsg")
		public WebElement uIReceivedUndeliveredMessageCheckBox;
	}

	public class E911Tab {

		public WebDriver driver;

		public E911Tab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl4_UsrE9111_txtPositionId")
		public WebElement uIPositionIDEdit;

	}

	public class ScreensTab {
		public WebDriver driver;

		public ScreensTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl5_UsrDispatchRoutes1_cddMonitor_DropDown")
		public WebElement uIMonitorComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl5_UsrDispatchRoutes1_cddScreenName_DropDown")
		public WebElement uIScreenComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl5_UsrDispatchRoutes1_cddCustomizeName_DropDown")
		public WebElement uICustomStatusComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl5_UsrDispatchRoutes1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl5_UsrDispatchRoutes1_cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl5_UsrDispatchRoutes1_grdTerminalScreen")
		public WebElement uIScreensTable;

	}

	public class InventoryTab {
		public WebDriver driver;

		public InventoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl6_UsrInventory1_RdnCounter")
		public WebElement uICountercheckoutRadioButton;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl6_UsrInventory1_RdnSelf")
		public WebElement uISelfCheckOutRadioButton;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl6_UsrInventory1_chkATrack")
		public WebElement uIAllowTrackingNumberCheckbox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl6_UsrInventory1_chkBarcode")
		public WebElement uIBarcodeScanningEnabledCheckbox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl6_UsrInventory1_chkPwdRqd")
		public WebElement uIPFPasswordRequiredCheckbox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl6_UsrInventory1_chkReturnAll")
		public WebElement uIEnableReturnAllButtonChcekbox;

	}

	public class DeviceTab {

		public WebDriver driver;

		public DeviceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl7_UsrTerminalDevice1_RdnComputer")
		public WebElement uITerminalTypeComputerRadioButton;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl7_UsrTerminalDevice1_cddDeviceType_DropDown")
		public WebElement uIDeviceTypeComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl7_UsrTerminalDevice1_txtDeviceID")
		public WebElement uIDeviceIDEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl7_UsrTerminalDevice1_txtSWDANotifyAddr")
		public WebElement uISWDANotifyAddressEdit;

	}

	public class InterfaceTab {

		public WebDriver driver;

		public InterfaceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTerminal_tmpl8_UsrTerminalInterface1_cddInterfaceName_DropDown")
		public WebElement uIInterfaceNameComboBox;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl8_UsrTerminalInterface1_txtHostName")
		public WebElement uILocationHostSiteEdit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl8_UsrTerminalInterface1_txtCustom1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl8_UsrTerminalInterface1_txtCustom2")
		public WebElement uICustom2Edit;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl8_UsrTerminalInterface1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabTerminal_tmpl8_UsrTerminalInterface1_grdTerminalInterface")
		public WebElement uIInterfaceTable;

	}

	public class PhoenixAuthenticatorWindow {
		public WebDriver driver;

		public PhoenixAuthenticatorWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUserName")
		public WebElement uIUserNameEdit;

		@FindBy(how = How.ID, using = "txtPassword")
		public WebElement uIPasswordEdit;

		@FindBy(how = How.ID, using = "cmdValidate")
		public WebElement uIAcceptButton;
	}

	// region Coded Screen UI Classes
	public class Coded {

		public WebDriver driver;

		public Coded() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCodeID")
		public WebElement uICodeIDEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdCodeType")
		public WebElement uICodedTable;

		@FindBy(how = How.ID, using = "cddMJGlobal_DropDown")
		public WebElement uIMJCategoryComboBox;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

	}

	// region Maintain Code Value Screen UI Classes
	public class MaintainCodeValue {
		public WebDriver driver;

		public MaintainCodeValue() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCodeType")
		public WebElement uICodeIDEdit;

		@FindBy(how = How.ID, using = "cmdAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "txtInqcodevalue")
		public WebElement uICodeValueEdit;

		@FindBy(how = How.ID, using = "txtInqdescription")
		public WebElement uICodeValueDesEdit;

		@FindBy(how = How.ID, using = "grdCodeValue")
		public WebElement uIMaintainCodeValueTable;

		@FindBy(how = How.ID, using = "txtCodeValue")
		public WebElement uIPopUpCodeValueEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIPopUpDescriptionEdit;

		@FindBy(how = How.ID, using = "cddFormRepositoryID_DropDown")
		public WebElement uIItemTypeComboBox;

		@FindBy(how = How.ID, using = "cddRelation_DropDown")
		public WebElement uIItemCategoryComboBox;

		@FindBy(how = How.ID, using = "cddRelation_DropDown")
		public WebElement uIInventoryTypeComboBox;

		@FindBy(how = How.ID, using = "chkEnableFees")
		public WebElement uIEnableFeesTabCheckbox;

		@FindBy(how = How.ID, using = "cddInvPanelType_DropDown")
		public WebElement uIPanelTypeComboBox;

		@FindBy(how = How.ID, using = "txtSortSeqNo")
		public WebElement uISortOrderEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIPopUpCancelButton;

		@FindBy(how = How.ID, using = "chkIsSystem")
		public WebElement uISystemCheckBox;

		@FindBy(how = How.ID, using = "radSocialSiteIcon_Input")
		public WebElement uISocialIconInputComboBox;

		@FindBy(how = How.ID, using = "radSocialSiteIcon_DropDown")
		public WebElement uISocialIconDropdownList;

		@FindBy(how = How.ID, using = "txtDefaultURL")
		public WebElement uIURLEdit;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.XPATH, using = "//label[text()='Show on Whiteboard']")
		public WebElement uIShowOnWhiteboardLabel;

		@FindBy(how = How.ID, using = "cddInvMultiSelect_Input")
		public WebElement uIInventoryTypeRadComboBox;

		@FindBy(how = How.ID, using = "cddInvMultiSelect_Arrow")
		public WebElement uIInventoryTypeRadArrow;
	}

	public class JailCell {
		public WebDriver driver;

		public JailCell() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdJailCell")
		public WebElement uIJailCellResultTable;

	}

	public class JailCellHelpWindow {
		public WebDriver driver;

		public JailCellHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdHelpCell")
		public WebElement uIJailCellHelpResultTable;

	}

	public class JailCellEntry {

		public WebDriver driver;

		public JailCellEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cddFacility_DropDown")
		public WebElement uIFacilityComboBox;

		@FindBy(how = How.ID, using = "txtUCName")
		public WebElement uICellNoEdit;

		@FindBy(how = How.ID, using = "ddlCellType_DropDown")
		public WebElement uICellTypeComboBox;

		@FindBy(how = How.ID, using = "txtCapacity")
		public WebElement uICapacityEdit;

		@FindBy(how = How.ID, using = "ddlCamera")
		public WebElement uICameraComboBox;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;
		
		@FindBy(how = How.ID, using = "barJailItem")
		public WebElement uIIbarJailItem;

	}

	public class RepositoryEntry {
		public WebDriver driver;

		public RepositoryEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtRepositoryID")
		public WebElement uIRepositoryIDEdit;

		@FindBy(how = How.ID, using = "txtDefaultName")
		public WebElement uIDefaultNameEdit;

		@FindBy(how = How.ID, using = "txtCustomName")
		public WebElement uICustomNameEdit;

		@FindBy(how = How.ID, using = "cddFieldUsage_DropDown")
		public WebElement uIFieldUsageComboBox;
	}

	public class CustomFieldsScreen {

		public WebDriver driver;

		public CustomFieldsScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupScreenID_CodeValue")
		public WebElement uIScreenIDEdit;

		@FindBy(how = How.ID, using = "txtCustomTableName")
		public WebElement uICustomTableEdit;

		@FindBy(how = How.ID, using = "txtTableName")
		public WebElement uITabNameEdit;

		@FindBy(how = How.ID, using = "btnReview")
		public WebElement uIPreviewButton;

		@FindBy(how = How.ID, using = "btnAddNew")
		public WebElement uIAddNewFieldButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "btnPublish")
		public WebElement uIPublishButton;

		@FindBy(how = How.ID, using = "grdCustomConfig")
		public WebElement uICustomFieldResultTable;

		@FindBy(how = How.ID, using = "lupPanelScreenID_CodeValue")
		public WebElement uIPopupScreenIDEdit;

		@FindBy(how = How.ID, using = "txtPanelCustomTableName")
		public WebElement uIPopupCustomTableEdit;

		@FindBy(how = How.ID, using = "txtDisplayName")
		public WebElement uIPopupDisplayNameEdit;

		@FindBy(how = How.ID, using = "txtColumnName")
		public WebElement uIPopupColumnNameEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIPopupDescriptionNameEdit;

		@FindBy(how = How.ID, using = "chkMandatory")
		public WebElement uIPopupMandatoryCheckBox;

		@FindBy(how = How.ID, using = "cddDateType")
		public WebElement uIPopupDataTypeComboBox;

		@FindBy(how = How.ID, using = "txtSingleMax")
		public WebElement uIPopupMaxLengthEdit;

		@FindBy(how = How.ID, using = "cddFormat")
		public WebElement uIPopupFormatComboBox;

		@FindBy(how = How.ID, using = "txtGroupName")
		public WebElement uIPopupGroupNameEdit;

		@FindBy(how = How.ID, using = "rdoOneColumn")
		public WebElement uIPopupOneColumnRadioButton;

		@FindBy(how = How.ID, using = "rdoTwoColumn")
		public WebElement uIPopupTwoColumnRadioButton;

		@FindBy(how = How.ID, using = "txtGrp")
		public WebElement uIPopupLineNumberWithinGroupEdit;

		@FindBy(how = How.ID, using = "rdoOne")
		public WebElement uIPopupOneRadioButton;

		@FindBy(how = How.ID, using = "rdoTwo")
		public WebElement uIPopupTwoRadioButton;

		@FindBy(how = How.ID, using = "cmdOk")
		public WebElement uIPopupAddButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uIPopupCancelButton;

		@FindBy(how = How.ID, using = "btnDelete")
		public WebElement uIPopupDeleteButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "lupScreenID_CodeDescription")
		public WebElement uIScreenIDDescription;

	}

	public class Roles {
		public WebDriver driver;

		public Roles() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdRoleType")
		public WebElement uIRolesResultTable;

		@FindBy(how = How.ID, using = "txtRoleName")
		public WebElement uIRoleNameEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Copy Role')]")
		public WebElement uICopyRoleButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Linked Role')]")
		public WebElement uILinkedRoleButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'ModulePermissions')]")
		public WebElement uIModulePermissionsButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'PF Allowed')]")
		public WebElement uIPFAllowedButton;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Copy To Same Juris')]")
		public WebElement uICopyToSameJurisButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Copy To Multi Juris')]")
		public WebElement uICopyToMultiJurisButton;
	}

	public class FTPInterfaceSearch {
		public WebDriver driver;

		public FTPInterfaceSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddInterface_DropDown")
		public WebElement uIInterfaceComboBox;

		@FindBy(how = How.ID, using = "lstInterfaceDB")
		public WebElement uIDBNameComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "grdSrch")
		public WebElement uIFTPInterfaceResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

	}

	public class FTPInterfaceEntry {
		public WebDriver driver;

		public FTPInterfaceEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddInterface_DropDown")
		public WebElement uIInterfaceComboBox;

		@FindBy(how = How.ID, using = "lstProductDBList")
		public WebElement uIDBNameComboBox;

		@FindBy(how = How.ID, using = "chkActive")
		public WebElement uIActiveCheckBox;

		@FindBy(how = How.ID, using = "ChkIsShared")
		public WebElement uISharedCheckBox;

		@FindBy(how = How.ID, using = "txtHostSite")
		public WebElement uIFolderPAthEdit;

		@FindBy(how = How.ID, using = "txtUserName")
		public WebElement uIUserNameEdit;

		@FindBy(how = How.ID, using = "txtPassword")
		public WebElement uIPasswordEdit;

		@FindBy(how = How.ID, using = "txtPort")
		public WebElement uIPortEdit;

		@FindBy(how = How.ID, using = "cddLocType_DropDown")
		public WebElement uILocationTypeComboBox;

		@FindBy(how = How.ID, using = "txtSendPath")
		public WebElement uISubPathEdit;

		@FindBy(how = How.ID, using = "txtCustom1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "txtCustom2")
		public WebElement uICustom2Edit;

		@FindBy(how = How.ID, using = "txtKeepLog")
		public WebElement uIKeepLogEdit;

		@FindBy(how = How.ID, using = "cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "cddPeakHr_DropDown")
		public WebElement uINonPeakHrsComboBox;

		@FindBy(how = How.ID, using = "cddEmailTemplate")
		public WebElement uIEmailTemplateComboBox;

		@FindBy(how = How.ID, using = "txtFrom")
		public WebElement uIFromEdit;

		@FindBy(how = How.ID, using = "txtTo")
		public WebElement uIToEdit;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "KPILabel1")
		public WebElement uICustom1TextView;

	}

	public class UnitsScreen {
		public WebDriver driver;

		public UnitsScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUnitRef")
		public WebElement uIUnitEdit;

		@FindBy(how = How.ID, using = "lupUnitType_CodeValue")
		public WebElement uIUnitTypeCodeEdit;

		@FindBy(how = How.ID, using = "lupVehicle_CodeValue")
		public WebElement uIDefaultVehicleEdit;

		@FindBy(how = How.ID, using = "cddPatrolArea_DropDown")
		public WebElement uIPatrolAreaComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "grdUnit")
		public WebElement uIUnitResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'AddNew')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "lupOnCallOffID_CodeValue")
		public WebElement uIOfficerCodeEdit;

	}

	public class UnitEntry {
		public WebDriver driver;

		public UnitEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUnitRef")
		public WebElement uIUnitEdit;

		@FindBy(how = How.ID, using = "lupUnitType_CodeValue")
		public WebElement uIUnitTypeCodeEdit;

		@FindBy(how = How.ID, using = "lupVehicle_CodeValue")
		public WebElement uIDefaultVehicleCodeEdit;

		@FindBy(how = How.ID, using = "chkIsOnCall")
		public WebElement uIOnDutyNotReqCheckBox;

		@FindBy(how = How.ID, using = "lupOnCallOffID_CodeValue")
		public WebElement uIOnCallOfficerCodeEdit;

		@FindBy(how = How.ID, using = "lupUnitType_imgBtn")
		public WebElement uIDispatchUnitLookupButton;

		@FindBy(how = How.ID, using = "lstPatrolArea_DropDown")
		public WebElement uIPatrolAreaComboBox;

		@FindBy(how = How.ID, using = "tdExpirationDate")
		public WebElement uIExpirationDateEdit;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInActiveDateEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInActiveCheckBox;

		@FindBy(how = How.ID, using = "lupWDAGroup_CodeValue")
		public WebElement uIWDAGroupCodeEdit;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdPatrolArea")
		public WebElement uIPatrolAreaResultTable;

		@FindBy(how = How.ID, using = "lupOff1PFID_CodeValue")
		public WebElement uIPreAssignOfficer1CodeEdit;

		@FindBy(how = How.ID, using = "lupOff2PFID_CodeValue")
		public WebElement uIPreAssignOfficer2CodeEdit;

		@FindBy(how = How.ID, using = "chkIsTrackable")
		public WebElement uIIsTrackableCheckBox;

		@FindBy(how = How.ID, using = "lupWDAGroup_imgBtn")
		public WebElement uIWDAGroupLookupButton;

		@FindBy(how = How.ID, using = "ddlCustomIcon_DropDown")
		public WebElement uICustomIconComboBox;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		public WebElement uIBottomMesssageTextView;

		@FindBy(how = How.ID, using = "cmdUnitDelete")
		public WebElement uIDeleteIcon;

		@FindBy(how = How.XPATH, using = "//label[text()=' Mutual Aid Unit?']")
		public WebElement uIMutualAidUnitLabel;

		@FindBy(how = How.XPATH, using = "//input[@id='chkMutualAid']")
		public WebElement uIMutualAidUnitCheckBox;

	}

	public class RolesEntry {
		public WebDriver driver;
		public RolesEntryPermissionWindow rolesEntryPermissionWindow;

		public RolesEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (this.rolesEntryPermissionWindow == null)
				this.rolesEntryPermissionWindow = new RolesEntryPermissionWindow();
		}

		@FindBy(how = How.ID, using = "grdCopyRole")
		public WebElement uICopyRoleResultTable;

		@FindBy(how = How.ID, using = "txtRoleName")
		public WebElement uIRoleNameEdit;

		@FindBy(how = How.ID, using = "chkCopyAll")
		public WebElement uISelectAllCopyRoleCheckBox;

		@FindBy(how = How.ID, using = "chkOverrideAll")
		public WebElement uISelectAllOverrideCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "btnSrch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "txtScreenID")
		public WebElement uIScreenIDedit;

		@FindBy(how = How.ID, using = "grdPermission_ctl00_500_0_it13_0_CRemove")
		public WebElement uIDeleteCheckBoxInGridTable;

		@FindBy(how = How.ID, using = "txt_CopyRoleName")
		public WebElement uICopyRoleNameEdit;

		@FindBy(how = How.ID, using = "txt_CopyRoleDesc")
		public WebElement uICopyRoleDescriptionEdit;

		@FindBy(how = How.ID, using = "grdPermission_ctl00_it5_0_btnScreenPermission")
		public WebElement uIAlarmEntryEditPermissionButton;

		@FindBy(how = How.ID, using = "grdPermission_ctl00_it5_3_btnScreenPermission")
		public WebElement uIAlarmsEditPermissionButton;

		@FindBy(how = How.ID, using = "grdPermission_ctl00_it5_0_btnScreenPermission")
		public WebElement uITrafficEditPermissionButton;

		@FindBy(how = How.ID, using = "grdPermission_ctl00_it5_0_btnScreenPermission")
		public WebElement uIAccountingEditPermissionButton;

		@FindBy(how = How.ID, using = "grdPermission_ctl00_it5_0_btnScreenPermission")
		public WebElement uIReportRepositoryEntryEditPermissionButton;
		
		@FindBy(how = How.ID, using = "grdScreenPermission_it13_0_CKAdd")
		public WebElement uIAddNewCheckBox;
		
		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		public WebElement uIBottomLeftSideStatusBar;
		
		@FindBy(how = How.XPATH, using = "//div[@id='grdScreenPermission']")
		public String uISearchResultTable;
	}

	public class Repository {
		public WebDriver driver;

		public Repository() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdRepository")
		public WebElement uIRepositoryResultTable;

		@FindBy(how = How.ID, using = "txtRepositoryID")
		public WebElement uIRepositoryIDEdit;

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uIDefaultNameEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "lstIDType")
		public WebElement uIRepositoryTypeComboBox;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//a[@id ='grdRepository_ctl00_lnkbtnNext']")
		public WebElement uINextButton;

		@FindBy(how = How.XPATH, using = "//a[@id ='grdRepository_ctl00_lnkbtnPrev']")
		public WebElement uIPrevButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchLinkButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'GoTo Screen')]")
		public WebElement uIGoToScreenButton;

		@FindBy(how = How.ID, using = "txtRoleName")
		public WebElement uIRoleNameEdit;

	}

	public class ChargeScreen {
		public WebDriver driver;

		public ChargeScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtChargeCode")
		public WebElement uIChargeCodeEdit;

		@FindBy(how = How.ID, using = "txtShortDesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cddChargeType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "grdCharge")
		public WebElement uIChargeResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "lupNibrs_CodeValue")
		public WebElement uINIBRSCodeEdit;

		@FindBy(how = How.ID, using = "lupNibrs_imgBtn")
		public WebElement uINIBRSSearchICon;

		@FindBy(how = How.ID, using = "lupRelCFSCode_CodeValue")
		public WebElement uICFSCodeEdit;
	}

	// region Shared Codes Screen UI
	public class SharedCodes {
		public WebDriver driver;
		public CADTab cADTab;
		public ManagementTab managementTab;
		public SOPTab sOPTab;

		public SharedCodes() {
			if (this.cADTab == null)
				this.cADTab = new CADTab();

			if (this.managementTab == null)
				this.managementTab = new ManagementTab();

			if (this.sOPTab == null)
				this.sOPTab = new SOPTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtChargeCode")
		public WebElement uIChargeCodeEdit;

		@FindBy(how = How.ID, using = "txtStateSeqNo")
		public WebElement uIStateSequanceEdit;

		@FindBy(how = How.ID, using = "cddChargeType_DropDown")
		public WebElement uIChargeTypeComboBox;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "lupRelCFSCode_CodeValue")
		public WebElement uIRelatedCFSCodeEdit;

		@FindBy(how = How.ID, using = "txtCFScode")
		public WebElement uICallForServiceEdit;

		@FindBy(how = How.ID, using = "cddAlarm_DropDown")
		public WebElement uIAlarmComboBox;

		@FindBy(how = How.ID, using = "cddSubAlarm_DropDown")
		public WebElement uISubLevelComboBox;

		@FindBy(how = How.ID, using = "cddDPPri_DropDown")
		public WebElement uIDispatchPriorityComboBox;

		@FindBy(how = How.ID, using = "cddAgency_DropDown")
		public WebElement uIAgencyComboBox;

		@FindBy(how = How.ID, using = "chkNFIRS")
		public WebElement uINFIRSReportCheckbox;

		@FindBy(how = How.ID, using = "chkEMS")
		public WebElement uIEMSReportCheckbox;

		@FindBy(how = How.ID, using = "cddDaRoute_DropDown")
		public WebElement uIDARouteComboBox;

		@FindBy(how = How.ID, using = "txtMOC")
		public WebElement uIRelatedMOCCodeEdit;

		@FindBy(how = How.ID, using = "txtchargelocalcode")
		public WebElement uIChargeLocalCodeEdit;

		@FindBy(how = How.ID, using = "lupNibrsCode_CodeValue")
		public WebElement uINibrsCodeEdit;

		@FindBy(how = How.ID, using = "lupNCIC_CodeValue")
		public WebElement uINCICCodeEdit;

		@FindBy(how = How.ID, using = "grdNibrs")
		public WebElement uINibrsResultTable;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtDisposition")
		public WebElement uIDispositionEdit;

		@FindBy(how = How.ID, using = "cddActCode_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'CAD')]")
		public WebElement uICADTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Management')]")
		public WebElement uIManagementTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'SOP')]")
		public WebElement uISOPTab;

		@FindBy(how = How.ID, using = "txtCodeValue")
		public WebElement uIPopUpCodeValueEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIPopUpDescriptionEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "txtInqcodevalue")
		public WebElement uICodeValueEdit;

		@FindBy(how = How.ID, using = "radMapLayer_Input")
		public WebElement uIMapLayerIconSelect;

		@FindBy(how = How.ID, using = "radMapLayer_DropDown")
		public WebElement uIMapLayerIconDropdown;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uICodeAddButton;

		@FindBy(how = How.ID, using = "txtInqcodevalue")
		public WebElement uICodeValueSeachEdit;

		@FindBy(how = How.ID, using = "grdCodeValue")
		public WebElement uICodeValueTable;

		@FindBy(how = How.ID, using = "grdCodeValue")
		public WebElement uISharedCodesResultTable;

		@FindBy(how = How.ID, using = "txtUserCC")
		public WebElement uIUserCommandCodeEdit;

		@FindBy(how = How.ID, using = "txtDispOrder")
		public WebElement uIDispOrderCodeEdit;

		@FindBy(how = How.ID, using = "txtZIP")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "cddState_DropDown")
		public WebElement uIStateDropDown;

		@FindBy(how = How.ID, using = "txtCity")
		public WebElement uICityEdit;

		@FindBy(how = How.ID, using = "cddLocType_DropDown")
		public WebElement uILocationTypeDropDown;

		@FindBy(how = How.ID, using = "txtLocDesc")
		public WebElement uILocationNameEdit;

		@FindBy(how = How.ID, using = "cmdCustomize")
		public WebElement uIDownloadButton;

		@FindBy(how = How.ID, using = "cmdUpload")
		public WebElement uIUploadButton;

		@FindBy(how = How.ID, using = "cmdDeleteCustom")
		public WebElement uIDeleteCustomReport;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButtonInPopUp;

		@FindBy(how = How.ID, using = "txtStatutoryLimit")
		public WebElement uIStatutoryLimitationEdit;

		@FindBy(how = How.ID, using = "cddCFSType_DropDown")
		public WebElement uICFSTypeComboBox;

		@FindBy(how = How.ID, using = "lupCFSClass_CodeValue")
		public WebElement uICFSClassEdit;

		@FindBy(how = How.ID, using = "chkActive")
		public WebElement uIPopupInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtCodeType")
		public WebElement uICodeIDEdit;

		@FindBy(how = How.ID, using = "lstVendor")
		public WebElement uIPopUpTowVendor;

		@FindBy(how = How.ID, using = "txtXRef1")
		public WebElement uIRefEdit;

		@FindBy(how = How.ID, using = "chkPurge")
		public WebElement uIAllowPurgeCheckBox;

		@FindBy(how = How.ID, using = "chkAllowPurge")
		public WebElement uIDoNotPurgeCheckBox;
	}

	public class CADTab {
		public WebDriver driver;

		public CADTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabDisposition_tmpl0_UsrDispCAD1_chkFollowUp")
		public WebElement uIFollowUpCheckBox;

		@FindBy(how = How.ID, using = "tabDisposition_tmpl0_UsrDispCAD1_chkUnFounded")
		public WebElement uIUnFoundedCheckBox;

		@FindBy(how = How.ID, using = "tabDisposition_tmpl0_UsrDispCAD1_chkCaseNbr")
		public WebElement uIGenerateCaseNoCheckBox;

		@FindBy(how = How.ID, using = "tabDisposition_tmpl0_UsrDispCAD1_chkAnimalCaseNbr")
		public WebElement uIGenerateAnimalCaseNoCheckBox;

		@FindBy(how = How.ID, using = "tabDisposition_tmpl0_UsrDispCAD1_cddReportCode_DropDown")
		public WebElement uIReportCodeComboBox;

		@FindBy(how = How.ID, using = "tabDisposition_tmpl0_UsrDispCAD1_cddBackupReportCode_DropDown")
		public WebElement uIBackupReportCodeComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_cddAlertType_DropDown")
		public WebElement uIAlertTypeDropdown;

	}

	public class ManagementTab {
		public WebDriver driver;

		public ManagementTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabDisposition_tmpl1_UsrDispMGMT1_cddStatus_DropDown")
		public WebElement uICaseStatusComboBox;

		@FindBy(how = How.ID, using = "tabDisposition_tmpl1_UsrDispMGMT1_cddExcepClr_DropDown")
		public WebElement uIUCRMethodComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl1_Usrmgmt2_txtStatutoryLimit")
		public WebElement uIStatutoryLimitationEdit;

	}

	public class SOPTab {
		public WebDriver driver;

		public SOPTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl1_UsrSOP2_cddSopType_DropDown")
		public WebElement uISOPTypeComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl1_UsrSOP2_lupTextName_CodeValue")
		public WebElement uITextNameEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl1_UsrSOP2_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

	}

	// region Action Search UI Classes
	public class ActionSearch {
		public WebDriver driver;

		public ActionSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "txtAction")
		public WebElement uIActionNoEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdActionSrch")
		public WebElement uIActionSearchTable;

	}

	// region Action Entry screen UI Classes
	public class ActionEntry {

		public WebDriver driver;

		public ActionEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "txtAction")
		public WebElement uIActionNoEdit;

		@FindBy(how = How.ID, using = "txtActName")
		public WebElement uIActionNameEdit;

		@FindBy(how = How.ID, using = "txtDesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtVerSPName")
		public WebElement uIVerifySPName;

		@FindBy(how = How.ID, using = "txtProSPName")
		public WebElement uIProcessSPNameEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckbox;

		@FindBy(how = How.ID, using = "txtParamName")
		public WebElement uIInputParameterNameEdit;

		@FindBy(how = How.ID, using = "cddValueType_DropDown")
		public WebElement uIValueTypeComboBox;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdAction")
		public WebElement uIActionEntryTable;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

	}

	// region Text screen UI
	public class TextScreen {
		public WebDriver driver;

		public TextScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdText")
		public WebElement uITextResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "chkActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "lupScreenID_CodeValue")
		public WebElement uITemplateScreenIDCodeEdit;

		@FindBy(how = How.ID, using = "txtTextName")
		public WebElement uITextNameEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

	}

	public class TextEntry {
		public WebDriver driver;
		public TextSubjectTab textSubjectTab;
		public TemplateForTab templateForTab;
		public ReportsThatUseThisTextTab reportsThatUseThisTextTab;

		public TextEntry() {
			if (this.textSubjectTab == null)
				this.textSubjectTab = new TextSubjectTab();

			if (this.templateForTab == null)
				this.templateForTab = new TemplateForTab();

			if (this.reportsThatUseThisTextTab == null)
				this.reportsThatUseThisTextTab = new ReportsThatUseThisTextTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Subject')])")
		public WebElement uISubjectTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Templates For')])")
		public WebElement uITemplatesForTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reports that Use this Text')])")
		public WebElement uIReportsThatUseThisTextTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachment')])")
		public WebElement uIAttachmentTab;

	}

	public class TextSubjectTab {
		public WebDriver driver;

		public TextSubjectTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_txtName")
		public WebElement uITextNameEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_txtDescription")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_txtSearchWords")
		public WebElement uISearchWordsEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_dttExpDttm_KPIDttmCtrl")
		public WebElement uIExpireDateEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_cddRptKey_DropDown")
		public WebElement uIReportKeyCodeComboBox;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_cddState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uISubjectRichTabTextEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_imgAdd")
		public WebElement uIAddIcon;
	}

	public class TemplateForTab {
		public WebDriver driver;

		public TemplateForTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_grdTxtRepository")
		public WebElement uITemplateForTabResultTable;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_lupReportID_CodeValue")
		public WebElement uITemplateForCodeEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_txtbcc")
		public WebElement uIBccEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_txtSubject")
		public WebElement uISubjectEdit;
	}

	public class ReportsThatUseThisTextTab {
		public WebDriver driver;

		public ReportsThatUseThisTextTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabKPIText_tmpl3_usrRptTemplate1_grdRptTemplate")
		public WebElement uIReportsTabResultTable;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl3_usrRptTemplate1_lupReportID_CodeValue")
		public WebElement uIReportNameCodeEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl3_usrRptTemplate1_lupReportID_imgBtn")
		public WebElement uIReportNameLookupButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl3_usrRptTemplate1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl3_usrRptTemplate1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl3_usrRptTemplate1_txtSeqNo")
		public WebElement uISeqNoEdit;
	}

	public class Disposition {
		public WebDriver driver;

		public Disposition() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdDisposition")
		public WebElement uIDispositionResultTable;

		@FindBy(how = How.ID, using = "txtDisposition")
		public WebElement uIDispositionCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cddActCode_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewLink;
	}

	public class JobsScreen {
		public WebDriver driver;

		public JobsScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//table[@mkr='dataTbl.hdn']")
		public WebElement uIJobsResultTable;

		@FindBy(how = How.ID, using = "txtJobName")
		public WebElement uIJobNameEdit;

		@FindBy(how = How.ID, using = "cddJobType_DropDown")
		public WebElement uIJobTypeCombobox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewLink;

		@FindBy(how = How.ID, using = "cmdRun")
		public WebElement uIRunJobButton;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInactiveCheckbox;

		@FindBy(how = How.ID, using = "ddlDBName")
		public WebElement uIDBNameComboBox;

	}

	public class JobEntry {
		public WebDriver driver;
		public ScheduleJobScreenTab scheduleJobScreenTab;
		public ParameterJobScreenTab parameterJobScreenTab;
		public NotificationJobScreenTab notificationJobScreenTab;

		public JobEntry() {
			if (this.scheduleJobScreenTab == null)
				this.scheduleJobScreenTab = new ScheduleJobScreenTab();

			if (this.parameterJobScreenTab == null)
				this.parameterJobScreenTab = new ParameterJobScreenTab();

			if (this.notificationJobScreenTab == null)
				this.notificationJobScreenTab = new NotificationJobScreenTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdRun")
		public WebElement uIRunJobButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Schedule')])")
		public WebElement uIScheduleTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Parameter')])")
		public WebElement uIParameterTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Notification')])")
		public WebElement uINotificationTab;

		@FindBy(how = How.ID, using = "txtJobName")
		public WebElement uIJobNameEdit;

		@FindBy(how = How.ID, using = "lupRptID_CodeValue")
		public WebElement uIReportIDCodeEdit;

		@FindBy(how = How.ID, using = "cddJobType_DropDown")
		public WebElement uIJobTypeCombobox;

		@FindBy(how = How.ID, using = "lstFormName")
		public WebElement uIFormNameCombobox;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckbox;

	}

	public class ScheduleJobScreenTab {
		public WebDriver driver;

		public ScheduleJobScreenTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_dttmStartDate_Date_KPIDttmCtrl")
		public WebElement uIStartDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabJobs_tmpl0_UsrJobSchedule1_dttmStartDate_Time']//input")
		public WebElement uIStartTimeEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_dttmEndDate_Date_KPIDttmCtrl")
		public WebElement uIEndDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabJobs_tmpl0_UsrJobSchedule1_dttmEndDate_Time']//input")
		public WebElement uIEndTimeEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_chkRecurrence")
		public WebElement uIRecurrenceCheckbox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_rdReccType_2")
		public WebElement uIDailyRadiobutton;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_rdReccType_1")
		public WebElement uIHourRadiobutton;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_txtDays")
		public WebElement uIEveryDaysEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_chkReCalculate")
		public WebElement uIReCalculateCheckbox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_rdReccType_3")
		public WebElement uIWeeklyRadiobutton;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_txtWeek")
		public WebElement uIEveryEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_chkMonday")
		public WebElement uIMondayCheckBox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_chkTuesday")
		public WebElement uITuesdayCheckBox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_chkWednesday")
		public WebElement uIWednesdayCheckBox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_chkThursday")
		public WebElement uIThursdayCheckBox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_chkFriday")
		public WebElement uIFridayCheckBox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl0_UsrJobSchedule1_dttmNextExec_Date_KPIDttmCtrl")
		public WebElement uINextExecDateEdit;

	}

	public class ParameterJobScreenTab {
		public WebDriver driver;

		public ParameterJobScreenTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabJobs_tmpl1_UsrRptParam1_txtParamName")
		public WebElement uIParamNameEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl1_UsrRptParam1_txtParamValue")
		public WebElement uIParamValueEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl1_UsrRptParam1_cddParamValue_DropDown")
		public WebElement uIParamValueCombobox;

		@FindBy(how = How.ID, using = "tabJobs_tmpl1_UsrRptParam1_grdJobParam")
		public WebElement uIParameterResultTable;

		@FindBy(how = How.ID, using = "tabJobs_tmpl1_UsrRptParam1_cmdAdd")
		public WebElement uIAddbutton;

	}

	public class NotificationJobScreenTab {
		public WebDriver driver;

		public NotificationJobScreenTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabJobs_tmpl2_UsrJobNotify1_lupNotifyTo_CodeValue")
		public WebElement uINotifyToPFEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl2_UsrJobNotify1_txtNotifyEmailID")
		public WebElement uINotifyEmailIDEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl2_UsrJobNotify1_txtStoreFolder")
		public WebElement uIServerFolderEdit;

		@FindBy(how = How.ID, using = "tabJobs_tmpl2_UsrJobNotify1_grdJobNotify")
		public WebElement uINotificationResultTable;

		@FindBy(how = How.ID, using = "tabJobs_tmpl2_UsrJobNotify1_cmdAdd")
		public WebElement uIAddbutton;
	}

	public class Juris {
		public WebDriver driver;

		public JurisSubAgencyTab jurisSubAgencyTab;
		public JurisSubAgencyDetailsTab jurisSubAgencyDetailsTab;
		public JurisAddressTab jusrisAddressTab;

		public Juris() {
			if ((this.jurisSubAgencyTab == null)) {
				this.jurisSubAgencyTab = new JurisSubAgencyTab();
			}

			if ((this.jurisSubAgencyDetailsTab == null)) {
				this.jurisSubAgencyDetailsTab = new JurisSubAgencyDetailsTab();
			}

			if (this.jusrisAddressTab == null)
				this.jusrisAddressTab = new JurisAddressTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uIJurisNameEdit;

		@FindBy(how = How.ID, using = "txtDepartmentName")
		public WebElement uIJurisPoliceDepartmentNameEdit;

		@FindBy(how = How.ID, using = "txtFireDepartmentName")
		public WebElement uIJurisFireDepartmentNameEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIJurisSaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uIJurisSaveNcloseButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Addresses')]")
		public WebElement uIAddressTab;

		@FindBy(how = How.XPATH, using = "//td[@class = 'status']/b")
		public WebElement uIUpdateSuccessfulLabel;

	}

	public class JurisSubAgencyTab {
		public WebDriver driver;

		public JurisSubAgencyTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabJuris'] //span[contains(text(),'Sub Agency')]")
		public WebElement uINavigateToSubAgencyTab;

		@FindBy(how = How.ID, using = "tabJuris_tmpl7_ctrlusrSubAgency_txtSubAgencyCode")
		public WebElement uISubAgencyCodeEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl7_ctrlusrSubAgency_txtSubAgencyDesc")
		public WebElement uISubAgencyNameEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl7_ctrlusrSubAgency_chkIsActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "tabJuris_tmpl7_ctrlusrSubAgency_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl7_ctrlusrSubAgency_cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl7_ctrlusrSubAgency_grdSubAgency")
		public WebElement uISubAgencyGridTable;

	}

	public class JurisSubAgencyDetailsTab {
		public WebDriver driver;

		public JurisSADetailsContactDetailsTab jurisSADetailsContactDetailsTab;
		public JurisSADetailsLogoTab jurisSADetailsLogoTab;
		public JurisSADetailsAddressTab jurisSADetailsAddressTab;
		public JurisSADetailsReportHeaderFooterTab jurisSADetailsReportHeaderFooterTab;

		public JurisSubAgencyDetailsTab() {
			if (this.jurisSADetailsContactDetailsTab == null)
				this.jurisSADetailsContactDetailsTab = new JurisSADetailsContactDetailsTab();

			if (this.jurisSADetailsLogoTab == null)
				this.jurisSADetailsLogoTab = new JurisSADetailsLogoTab();

			if (this.jurisSADetailsAddressTab == null)
				this.jurisSADetailsAddressTab = new JurisSADetailsAddressTab();

			if (this.jurisSADetailsReportHeaderFooterTab == null)
				this.jurisSADetailsReportHeaderFooterTab = new JurisSADetailsReportHeaderFooterTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabJuris'] //span[contains(text(),'Sub Agency Details')]")
		public WebElement uINavigateToSubAgencyDetailsTab;

	}

	public class JurisSADetailsContactDetailsTab {
		public WebDriver driver;

		public JurisSADetailsContactDetailsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabJuris'] //span[contains(text(),'Contact Details')]")
		public WebElement uINavigateToContactDetailsTab;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cddSubAgency_DropDown")
		public WebElement uISubAgencyDropdown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_txtCountyName")
		public WebElement uICountyNameEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_txtAddress1")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cstCSZ_City")
		public WebElement uITownEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cstCSZ_State_DropDown")
		public WebElement uIStateDropdown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cstCSZ_Zip")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_lupContactPFID_CodeValue")
		public WebElement uIContactPFEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_lupORINo_CodeValue")
		public WebElement uIORINoEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cstName_Suffix_DropDown")
		public WebElement uIContactSuffixDrodown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cstName_LastName")
		public WebElement uIContactLastNameEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cstName_FirstName")
		public WebElement uIContactFirstNameEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_cstName_MiddleName")
		public WebElement uIContactMiddleNameEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_mskPhoneNo")
		public WebElement uIPhoneNoEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_mskMobileNo")
		public WebElement uIMobileNoEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_mskFaxNo")
		public WebElement uIFaxNoEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_lupDefaultZip_CodeValue")
		public WebElement uIDefaultZipEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_txtFirstEMail")
		public WebElement uIFirstEMailEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_txtSecondEmail")
		public WebElement uISecondEMailEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_txtDefaultArea")
		public WebElement uIDefaultAreaEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_txtRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl0_usrSaContactDetails_grdSAContactDtls")
		public WebElement uIContactDetailsGridTable;

	}

	public class JurisSADetailsLogoTab {
		public WebDriver driver;

		public JurisSADetailsLogoTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails'] //span[contains(text(),'Logo')]")
		public WebElement uINavigateToLogoTab;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl1_usrSaLogo_cddSubAgency_DropDown")
		public WebElement uISubAgencyDropdown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl1_usrSaLogo_RadUploadLogoTextBox0")
		public WebElement uISelectButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl1_usrSaLogo_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl1_usrSaLogo_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl1_usrSaLogo_grdSALogo")
		public WebElement uILogoGridTable;
	}

	public class JurisSADetailsAddressTab {
		public WebDriver driver;

		public JurisSADetailsAddressTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails'] //span[contains(text(),'Address')]")
		public WebElement uINavigateToAddressTab;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl2_usrSaAddress_cddSubAgency_DropDown")
		public WebElement uISubAgencyDropdown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl2_usrSaAddress_cddAddressType_DropDown")
		public WebElement uIAddressTypeDropdown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl2_usrSaAddress_txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl2_usrSaAddress_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl2_usrSaAddress_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl2_usrSaAddress_grdSaJurisAddress")
		public WebElement uIAddressGridTable;

	}

	public class JurisAddressTab {
		public WebDriver driver;

		public JurisAddressTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabJuris_tmpl5_usrJurisAddress1_cddAddressType_DropDown")
		public WebElement uIAddressTypeDropdown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl5_usrJurisAddress1_txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabJuris_tmpl5_usrJurisAddress1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl5_usrJurisAddress1_grdJurisAddress")
		public WebElement uIJurisAddressTabTable;

	}

	public class JurisSADetailsReportHeaderFooterTab {
		public WebDriver driver;

		public JurisSADetailsReportHeaderFooterTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails'] //span[contains(text(),'Report Header & Footer')]")
		public WebElement uINavigateToReportHeaderFooterTab;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_cddSubAgency_DropDown")
		public WebElement uISubAgencyDropdown;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_RadRptHeaderTextBox0")
		public WebElement uIReportHeaderselectButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_RadRptFooterTextBox0")
		public WebElement uIReportFooterselectButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_RadRptPgFooterTextBox0")
		public WebElement uIPageFooterselectButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_RadRptPgHeaderTextBox0")
		public WebElement uIPageHeaderselectButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_RadRptWaterMrkImgTextBox0")
		public WebElement uIWaterMarkselectButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabJuris_tmpl8_ctrlusrSubAgencyDetails_usrSagDetails_tmpl3_usrSaReport_grdSAReport")
		public WebElement uIReportHeaderFooterGridTable;

	}

	public class EmailTemplate {

		public WebDriver driver;

		public EmailTemplate() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

	}

	public class EmailTemplateEntry {
		public WebDriver driver;

		public EmailTemplateEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtemailname")
		public WebElement uITemplateNameEdit;

		@FindBy(how = How.ID, using = "txtNotes_contentIframe")
		public WebElement uITextEdit;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']//b")
		public WebElement uIStatusBar;

	}

	public class FormRepositoryScreen {

		public WebDriver driver;

		public FormRepositoryScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddEmailTemplate")
		public WebElement uIEmailTemplateComboBox;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

	}

	public class FireStationSearch {
		public WebDriver driver;

		public FireStationSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdFireStation")
		public WebElement uIFireStationGrid;

		@FindBy(how = How.ID, using = "txtFireStationRef")
		public WebElement uIFireStationCodeEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

	}

	public class FireStationEntry {
		public WebDriver driver;

		public FireStationEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtFireStationRef")
		public WebElement uIStationTextBox;

		@FindBy(how = How.ID, using = "txtStationName")
		public WebElement uIStationNameTextBox;

		@FindBy(how = How.ID, using = "cddFireDistrict_DropDown")
		public WebElement uIDistrictDropDown;

		@FindBy(how = How.ID, using = "txtEmail")
		public WebElement uIEmailTextbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
		public WebElement uIStatusBar;

	}

	public class CFSCode {

		public WebDriver driver;

		public CFSCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "txtCFScode")
		public WebElement uICFSCodeEdit;

		@FindBy(how = How.ID, using = "cddCFSType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdCFSCode")
		public WebElement uICFSCodeResultTable;

		@FindBy(how = How.ID, using = "txtCFSCode")
		public WebElement uICFSCodeEditFire;

		@FindBy(how = How.ID, using = "grdFCFS")
		public WebElement uICFSCodeResultTableFire;
	}

	public class CFSCodeEntry {
		public WebDriver driver;
		public CFSCodeCADTab cFSCodeCADTab;
		public CFSCodeManagementTab cFSCodeManagementTab;
		public CFSCodeOthersTab cFSCodeOthersTab;
		public CFSCodeSOPTab cFSCodeSOPTab;
		public CFSCodeTasksTab cFSCodeTasksTab;
		public CFSCodeLinkedCFSTab cFSCodeLinkedCFSTab;

		public CFSCodeEntry() {
			if ((this.cFSCodeCADTab == null)) {
				this.cFSCodeCADTab = new CFSCodeCADTab();
			}

			if ((this.cFSCodeManagementTab == null)) {
				this.cFSCodeManagementTab = new CFSCodeManagementTab();
			}

			if ((this.cFSCodeOthersTab == null)) {
				this.cFSCodeOthersTab = new CFSCodeOthersTab();
			}

			if ((this.cFSCodeSOPTab == null)) {
				this.cFSCodeSOPTab = new CFSCodeSOPTab();
			}

			if ((this.cFSCodeTasksTab == null)) {
				this.cFSCodeTasksTab = new CFSCodeTasksTab();
			}

			if ((this.cFSCodeLinkedCFSTab == null)) {
				this.cFSCodeLinkedCFSTab = new CFSCodeLinkedCFSTab();
			}

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnNotify")
		public WebElement uIEmailIcon;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtCFScode")
		public WebElement uICFSCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtShortDesc")
		public WebElement uIShortDescriptionEdit;

		@FindBy(how = How.ID, using = "cddCFSType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "cddAgency_DropDown")
		public WebElement uIServiceTypeComboBox;

		@FindBy(how = How.ID, using = "lupCFSClass_CodeValue")
		public WebElement uICFSClassCodeEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'CAD')])")
		public WebElement uICADTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Management')])")
		public WebElement uIManagementTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Others')])")
		public WebElement uIOthersTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'SOP')])")
		public WebElement uISOPTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Tasks')])")
		public WebElement uITasksTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Linked CFS')])")
		public WebElement uILinkedCFSTab;

		@FindBy(how = How.ID, using = "cddAlarm_DropDown")
		public WebElement uIAlarmComboBox;

		@FindBy(how = How.ID, using = "lupCFSClass_CodeDescription")
		public WebElement uICFSClassDescription;

		@FindBy(how = How.ID, using = "chkAllowPurge")
		public WebElement uIDoNotPurgeCheckBox;
	}

	public class CFSCodeCADTab {
		public WebDriver driver;

		public CFSCodeCADTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_txtDPPriRange1")
		public WebElement uIDispatchPriority1Edit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_txtDPPriRange2")
		public WebElement uIDispatchPriority2Edit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_txtDPPri")
		public WebElement uIDispatchPriority3Edit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_cddRso_DropDown")
		public WebElement uIReceiveSrcOverrideComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_cddReportCode1_DropDown")
		public WebElement uIReportCodeComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_chkSF")
		public WebElement uIForceCADSFEntryCheckBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_chkHazMat")
		public WebElement uIDisplayHAZMATFlagsCheckBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_chkDoNotSendSMS")
		public WebElement uIDoNotSendSMSCTCheckBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_chklblIsTwrep")
		public WebElement uI24HRReportableCheckBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_chkIsDetailCFS")
		public WebElement uIDetailedCFSRequiredCheckBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_lupPrimeDispo_CodeValue")
		public WebElement uIPrimeUnitDispositionEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl0_UsrCAD1_lupMgmtCFS_CodeValue")
		public WebElement uIManagementCFSEdit;

	}

	public class CFSCodeManagementTab {
		public WebDriver driver;

		public CFSCodeManagementTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

	}

	public class CFSCodeOthersTab {
		public WebDriver driver;

		public CFSCodeOthersTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_lupReportClass1_CodeValue")
		public WebElement uIReportingStructure2CodeEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_lupReportClass1_imgBtn")
		public WebElement uIReportingStructure2Lookup;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_lupReportClass2_CodeValue")
		public WebElement uIReportingStructure3CodeEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_lupReportClass2_imgBtn")
		public WebElement uIReportingStructure3Lookup;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_cddTraCFSClass_DropDown")
		public WebElement uITrafficCFSClassComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_cddForm_DropDown")
		public WebElement uIQuestionnaireForCalltakerComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_cmdPreview")
		public WebElement uIPreviewButton;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl2_Usrreportclass2_ChkIsCallCreate")
		public WebElement uICreateCallCFSEnteredCheckBox;

	}

	public class CFSCodeSOPTab {
		public WebDriver driver;

		public CFSCodeSOPTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl3_UsrSOP1_cddRecType_DropDown")
		public WebElement uISOPTypeComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl3_UsrSOP1_lupTextName_CodeValue")
		public WebElement uITextNameEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl3_UsrSOP1_lupTextName_imgBtn")
		public WebElement uITextNameLookup;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl3_UsrSOP1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl3_UsrSOP1_cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl3_UsrSOP1_grdCFSSop")
		public WebElement uISOPTabResultTable;
	}

	public class CFSCodeTasksTab {
		public WebDriver driver;

		public CFSCodeTasksTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_cddCopytask")
		public WebElement uICopyTaskFromComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_cddTaskcode_DropDown")
		public WebElement uITaskcodeComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_txtDue")
		public WebElement uIDueWithinNumberEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_txttaskDetails")
		public WebElement uITaskDetailsEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_grdCFSTask")
		public WebElement uISOPTabResultTable;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_cmdCopy")
		public WebElement uICopyButton;

		// tabCFSCode_tmpl8_usrTasks_TxtSort
		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_TxtSort")
		public WebElement uISortOrderEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_lblTaskcode")
		public WebElement uITaskCodeLable;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl8_usrTasks_lblTaskdtl")
		public WebElement uITaskDetailsLable;
	}

	public class CFSCodeLinkedCFSTab {
		public WebDriver driver;

		public CFSCodeLinkedCFSTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_lupPoliceCFS_imgBtn")
		public WebElement uIPoliceOEMOtherCFSLookup;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_lupFireCFS_imgBtn")
		public WebElement uIFireEMSOtherCFSLookup;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_cddPolServiceType_DropDown")
		public WebElement uIPoliceServiceTypeComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_cddFireServiceType_DropDown")
		public WebElement uIFireServiceTypeComboBox;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_Grd_CFS")
		public WebElement uILinkedCFSTabResultTable;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_lupPoliceCFS_CodeValue")
		public WebElement uIPoliceCFSCodeEdit;

		@FindBy(how = How.ID, using = "tabCFSCode_tmpl6_UsrCFS1_lupFireCFS_CodeValue")
		public WebElement uIFireCFSCodeEdit;
	}

	public class HazMatGuide {
		public WebDriver driver;

		public HazMatGuide() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtChemicalGuide")
		public WebElement uINIOSHGuideEdit;

		@FindBy(how = How.ID, using = "txtChemicalName")
		public WebElement uIChemicalNameEdit;

		@FindBy(how = How.ID, using = "txtDotID")
		public WebElement uIDOTIDEdit;

		@FindBy(how = How.ID, using = "txtDotGuide")
		public WebElement uIDOTGuideEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewLink;

		@FindBy(how = How.ID, using = "grdHazMat")
		public WebElement uIHazMatResultTable;
	}

	public class HazMatEntry {
		public WebDriver driver;

		public HazMatEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtChemicalGuide")
		public WebElement uINIOSHGuideEdit;

		@FindBy(how = How.ID, using = "txtChemicalName")
		public WebElement uIChemicalNameEdit;

		@FindBy(how = How.ID, using = "txtDotID")
		public WebElement uIDOTIDEdit;

		@FindBy(how = How.ID, using = "txtDotGuide")
		public WebElement uIDOTGuideEdit;

		@FindBy(how = How.ID, using = "txtCASNo")
		public WebElement uICASNOEdit;

		@FindBy(how = How.ID, using = "txtRTECSNo")
		public WebElement uIRTECSNoEdit;

		@FindBy(how = How.ID, using = "txtCmt")
		public WebElement uICommentEdit;

		@FindBy(how = How.ID, using = "txtCustom1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "txtCustom2")
		public WebElement uICustom2Edit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveandCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

	}

	public class QAForms {
		public WebDriver driver;

		public QAForms() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdFormSrch")
		public WebElement uIGridTable;

		@FindBy(how = How.ID, using = "txtRefNo")
		public WebElement uIFormRefNo;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Manage Repository')]")
		public WebElement uIManageRepositoryButton;

		@FindBy(how = How.ID, using = "txtFormName")
		public WebElement uIFormNameEdit;

		@FindBy(how = How.ID, using = "lupReportID_CodeValue")
		public WebElement uIScreenIdEdit;

		@FindBy(how = How.ID, using = "lupReportID_CodeDescription")
		public WebElement uIScreenIDDescription;

	}

	public class RolesEntryPermissionWindow {
		public WebDriver driver;

		public RolesEntryPermissionWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "chkExternal")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "grdScreenPermission")
		public WebElement uIScreenPermissionGridTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIsaveButton;

		@FindBy(how = How.ID, using = "txtScrnName")
		public WebElement uIScreenNameedit;

		@FindBy(how = How.ID, using = "btnSrch")
		public WebElement uISearchButton;

	}

	public class ApprovalParameter {

		public WebDriver driver;

		public ApprovalParameter() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIsaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uIsaveNCloseButton;

		@FindBy(how = How.ID, using = "cddRepositoryID_DropDown")
		public WebElement uIApprovalProcessComboBox;

		@FindBy(how = How.ID, using = "chkExternal")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "param_1_Dyn_DropDown")
		public WebElement uIEnableApprovalProcessComboBox;

	}

	public class ReportRepository {
		public WebDriver driver;

		public ReportRepository() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdFrmRepository")
		public WebElement uIReportRepositoryResultTable;

		@FindBy(how = How.ID, using = "lupReportID_CodeValue")
		public WebElement uIScreenIDEdit;

		@FindBy(how = How.ID, using = "txtFrmSubCategory")
		public WebElement uIFormNameEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cddFrmCat_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "lstFormType")
		public WebElement uITypeComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

	}

	public class ReportRepositoryEntry {
		public WebDriver driver;

		public ReportRepositoryEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//input[contains(@value,'Select')]")
		public WebElement uIFileSelect;

		@FindBy(how = How.XPATH, using = "//span[contains(@class,'ruFileWrap')]")
		public WebElement uIFileSelectButton;

		@FindBy(how = How.ID, using = "cmdUpload")
		public WebElement uIUploadPDF;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']")
		public WebElement uIBottomMesssageTextView;
	}

	public class CodedMap {
		public WebDriver driver;

		public CodedMap() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddInterface_DropDown")
		public WebElement uIInterfaceDropDown;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

	}

	public class CodedMapDetail {
		public WebDriver driver;

		public CodedMapDetail() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCodeID_CodeValue")
		public WebElement uICodeTypeEdit;

		@FindBy(how = How.ID, using = "cmdAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "lupCodedValue_CodeValue")
		public WebElement uIPopUpPhoenixValueEdit;

		@FindBy(how = How.ID, using = "lupCodedValue_imgBtn")
		public WebElement uIPopUpPhoenixValueSearchIcon;

		@FindBy(how = How.ID, using = "txtMapCodeValue")
		public WebElement uIPopUpMapCodeValueEdit;

		@FindBy(how = How.ID, using = "txtMapDescription")
		public WebElement uIPopUpMapDescriptionEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIPopUpAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIPopUpCancelButton;

		@FindBy(how = How.ID, using = "grdCodedMapDetail")
		public WebElement uICodedMapDetailTable;

	}

	public class DistributionList {
		public WebDriver driver;

		public DistributionList() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Add New']")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "txtFormName")
		public WebElement uIuIListNameContainsEdit;

		@FindBy(how = How.ID, using = "grdDistributionSrch")
		public WebElement uIDistributionsearchGrid;

	}

	public class DistributionEntry {
		public WebDriver driver;

		public DistributionEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "txtDistribution")
		public WebElement uIDistributionListNameEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.ID, using = "cmdAddMulPF")
		public WebElement uIAddMultiplePFButton;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdDistribution")
		public WebElement uIDistributionEntryhGrid;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISave;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uIsaveAndClose;

	}

	public class TextSearchHelpWindow {
		public WebDriver driver;

		public TextSearchHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//img[@src='/KPIImages/ico/16_excel.gif']")
		public WebElement uIExcelIcon;

		@FindBy(how = How.XPATH, using = "//div[@id='grdText']")
		public WebElement uITextTable;

		@FindBy(how = How.ID, using = "txtSearchWords")
		public WebElement uISearchWordsEdit;

		@FindBy(how = How.ID, using = "cddTextType_DropDown")
		public WebElement uITextType;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "dttTextDttmFrom_KPIDttmCtrl")
		public WebElement uIDateEdit;

	}

	public class ViewHistoryWindow {
		public WebDriver driver;

		public ViewHistoryWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//input[@id='txtParamID']")
		public WebElement uIParameterIDEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdHistory_ctl00']")
		public WebElement uIHistoryTable;

	}

}
