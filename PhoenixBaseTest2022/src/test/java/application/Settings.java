package application;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dataAccess.BaseData;
import resources.PropertiesFile;
import uIMaps.UIMapPopup;
import uIMaps.UIMapSettings;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Settings {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapSettings uIMapSettings = new UIMapSettings();
	public Popup popup = new Popup();
	public Randomized randomized = new Randomized();
	public UIMapPopup uIMapPopup = new UIMapPopup();

	public SysParameter sysParameter;
	public AccessLog accessLog;
	public PhoenixAuthenticatorWindow phoenixAuthenticatorWindow;
	public Coded coded;
	public CFSCode cFSCode;
	public MaintainCodeValue maintainCodeValue;
	// public StorageLocation mStorageLocation;
	// public StorageLocationEntry mStorageLocationEntry;
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
	public Terminal terminal;
	public TerminalEntry terminalEntry;
	public TextScreen textScreen;
	public TextEntry textEntry;
	public Disposition disposition;
	public JobsScreen jobsScreen;
	public JobEntry jobEntry;
	public Juris juris;
	public EmailTemplate emailTemplate;
	public EmailTemplateEntry emailTemplateEntry;
	public FormRepositoryScreen formRepositoryScreen;
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

	public TextSearchHelpWindow textSearchHelpWindow;

	public ViewHistoryWindow viewHistoryWindow;

	public Settings() {
		if (sysParameter == null)
			sysParameter = new SysParameter();

		if (accessLog == null)
			accessLog = new AccessLog();

		if (terminal == null)
			terminal = new Terminal();

		if (terminalEntry == null)
			terminalEntry = new TerminalEntry();

		if (phoenixAuthenticatorWindow == null)
			phoenixAuthenticatorWindow = new PhoenixAuthenticatorWindow();

		if (coded == null)
			coded = new Coded();

		if (cFSCode == null)
			cFSCode = new CFSCode();

		if (maintainCodeValue == null)
			maintainCodeValue = new MaintainCodeValue();

		// if ( mStorageLocation == null)
		// mStorageLocation = new StorageLocation();

		// if ( mStorageLocationEntry == null)
		// mStorageLocationEntry = new StorageLocationEntry();

		if (jailCell == null)
			jailCell = new JailCell();

		if (jailCellEntry == null)
			jailCellEntry = new JailCellEntry();

		if (jailCellHelpWindow == null)
			jailCellHelpWindow = new JailCellHelpWindow();

		if (repositoryEntry == null)
			repositoryEntry = new RepositoryEntry();

		if (customFieldsScreen == null)
			customFieldsScreen = new CustomFieldsScreen();

		if (roles == null)
			roles = new Roles();

		if (fTPInterfaceSearch == null)
			fTPInterfaceSearch = new FTPInterfaceSearch();

		if (fTPInterfaceEntry == null)
			fTPInterfaceEntry = new FTPInterfaceEntry();

		if (repository == null)
			repository = new Repository();

		if (unitEntry == null)
			unitEntry = new UnitEntry();

		if (rolesEntry == null)
			rolesEntry = new RolesEntry();

		if (unitsScreen == null)
			unitsScreen = new UnitsScreen();

		if (chargeScreen == null)
			chargeScreen = new ChargeScreen();

		if (sharedCodes == null)
			sharedCodes = new SharedCodes();

		if (actionSearch == null)
			actionSearch = new ActionSearch();

		if (actionEntry == null)
			actionEntry = new ActionEntry();

		if (textScreen == null)
			textScreen = new TextScreen();

		if (textEntry == null)
			textEntry = new TextEntry();

		if (disposition == null)
			disposition = new Disposition();

		if (jobsScreen == null)
			jobsScreen = new JobsScreen();

		if (jobEntry == null)
			jobEntry = new JobEntry();

		if (juris == null)
			juris = new Juris();

		if (emailTemplate == null)
			emailTemplate = new EmailTemplate();

		if (emailTemplateEntry == null)
			emailTemplateEntry = new EmailTemplateEntry();

		if (formRepositoryScreen == null)
			formRepositoryScreen = new FormRepositoryScreen();

		if (cFSCodeEntry == null)
			cFSCodeEntry = new CFSCodeEntry();

		if (fireStationSearch == null)
			fireStationSearch = new FireStationSearch();

		if (fireStationEntry == null)
			fireStationEntry = new FireStationEntry();

		if (hazMatGuide == null)
			hazMatGuide = new HazMatGuide();

		if (hazMatEntry == null)
			hazMatEntry = new HazMatEntry();

		if (this.qaForms == null)
			this.qaForms = new QAForms();

		if (cFSCode == null)
			cFSCode = new CFSCode();

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

	// region Settings Window Switch Methods
	public void switchToSystemParamter() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Home/frmSysParams");
	}

	public void switchToAcessLog() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Setup/frmActivityLog");
	}

	public void switchToTerminalScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmTerminalSrch.aspx");
		// objectIdentification.windowHandle.switchToFrame("frmTerminalSrch.aspx");
	}

	public void switchToTerminalEntry() {

		objectIdentification.windowHandle.switchToWindow("Terminal Entry");
	}

	public void switchToActionSearch() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("BatchUpdate/frmActionSrch");
	}

	public void switchToActionEntry() {

		objectIdentification.windowHandle.switchToWindow("Action Entry");
	}

	public void switchToPhoenixAuthenticatorWindow() {
		objectIdentification.windowHandle.switchToWindow(":: Phoenix Authenticator ::");
	}

	public void switchToCodedScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmCodedTypeSrch");
	}

	public void switchToMaintainCodeValue() {
		objectIdentification.windowHandle.switchToWindow("Maintain Code Value");
	}

	public void switchToStorageLocation() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmStorageLocationSrch");
	}

	public void switchToRoles() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Setup/frmRoleSrch");
	}

	public void switchToStorageLocationEntry() {
		objectIdentification.windowHandle.switchToWindow("Storage Location Entry");
	}

	public void switchToJailCell() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmJailCellSearch");
	}

	public void switchToJailCellPopupScreen() {
		objectIdentification.windowHandle.switchToWindow("Jail Cell");
	}

	public void switchToJailCellEntry() {
		objectIdentification.windowHandle.switchToWindow("Jail Cell Entry");
	}

	public void switchToRepositoryEntry() {
		objectIdentification.windowHandle.switchToWindow("Repository Entry");
	}

	public void switchToCustomFields() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmCustomConfig_Id");
	}

	public void switchToFTPInterfaceSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Home/frmPnxFTPSrch");
	}

	public void switchToFTPInterfaceEntry() {
		objectIdentification.windowHandle.switchToWindow("FTP Intertface Entry");
	}

	public void switchToUnits() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Setup/frmUnitSrch");
	}

	public void switchToUnitsForFire() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Setup/frmFireUnitSrch.aspx");
	}

	public void switchToUnitEntry() {
		objectIdentification.windowHandle.switchToWindow("Unit Entry");
	}

	public void switchToRolesEntry() {
		objectIdentification.windowHandle.switchToWindow("Roles Entry");
	}
	public void switchToRolesEntryEditScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmScreenPermission.aspx");
		
	}
	public void switchToRepository() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Repository");
	}

	public void switchToRepositoryUnNameScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("hdnMode=ADD");
	}

	public void switchToRolesScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Setup/frmRoleSrch");
	}

	public void switchToCharge() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Static/frmChargeSrch");
	}

	public void switchToSharedCodes() {
		objectIdentification.windowHandle.switchToWindow("Shared Codes");
		Playback.controlReadyThreadWait();
	}

	public void switchToText() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("/frmTextSrch");
	}

	public void switchToTextEntry() {
		objectIdentification.windowHandle.switchToWindow("Text Entry");
	}

	public void switchToDisposition() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmDispositionSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToJobs() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmKPIJobsSrch");
	}
	
	public void switchToJobsScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmJobLog_Id");
	}

	public void switchToCFSCode() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("CFS Code");
	}

	public void switchToJobEntry() {
		objectIdentification.windowHandle.switchToWindow("Job Entry");
	}

	public void switchToJurisEntry() {
		objectIdentification.windowHandle.switchToWindow("Juris - 1310");
	}

	public void switchToEmailTemplate() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Email Template");
	}

	public void switchToEmailTemplateEntry() {
		objectIdentification.windowHandle.switchToWindow("Email Template Entry");
	}

	public void switchToFTPInterfaceSearchScreen() {
		objectIdentification.windowHandle.switchToWindow("FTP Interface Search");
		Playback.controlReadyThreadWait();
	}

	public void switchToCFSCodeEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmCFSCode");
	}

	public void switchToFireStationSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmFireStationSrch.aspx");
	}

	public void switchToFireStationEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Fire Station Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToFormRepositoryScreen() {
		objectIdentification.windowHandle.switchToWindow("frmFormRepository");
	}

	public void switchToHazMatGuide() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmHazMatSrch.aspx");
	}

	public void switchToHazMatEntry() {
		objectIdentification.windowHandle.switchToWindow("frmFormRepository");
	}

	public void switchToQAForms() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Settings&ScreenName=QA");
	}

	public void switchToQAFormsHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("QA Forms");
	}

	public void switchToSystemParamterScreen() {
		objectIdentification.windowHandle.switchToWindow("System Parameter");
	}

	public void switchToSystemParamterII() {
		objectIdentification.windowHandle.switchToFrame("Home/frmSysParams");
	}

	public void switchToApprovalParameterWindow() {
		objectIdentification.windowHandle.switchToWindow("frmPnxAprrovalParams");
	}

	public void switchToReportRepository() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Report Repository");
	}

	public void switchToReportRepositoryEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("Setup/frmFormsAndRepotsUpload.aspx");

	}

	public void closeActiveWindow() {
		objectIdentification.windowHandle.closeTheScreenByRobot();

	}

	public void switchToCodedMapScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmCodedMapSrch.aspx");
	}

	public void switchToCodedMapDetail() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmCodedMapDetail_Id");
	}

	public void switchToTextSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("Static/frmTextSrch");
	}

	public class SysParameter {
		public void reloadSystemParamter() {
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("System Parameter", "Reload Tab");
		}

		public void changeParameterById(String paramID, String controlType, String controlId, String paramValue) {
			WebDriver driver = Playback.driver;
			if (controlType == "input") {
				Playback.pageLoadThreadWait();
				System.out.println(readInputValue(paramID));
				if (!readInputValue(paramID).contains(paramValue)) {

					Playback.threadWait();
					driver.findElement(By.id(controlId)).clear();
					Playback.threadWait();
					driver.findElement(By.id(controlId)).sendKeys(paramValue);
					uIMapSettings.systemParameter.uISaveButton.click();
					popup.confirm.yes();
					Playback.pageLoadThreadWait();
					if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
						popup.acknowledge.ok();
					}

					else {
						Playback.pageLoadThreadWait();
						popup.acknowledge.sysParameterAcknowledgeOk();
					}
				}
			}
			if (controlType == "select") {
				Playback.pageLoadThreadWait();
				System.out.println(getSelectValue(paramID, controlId));
				if (!getSelectValue(paramID, controlId).contains(paramValue)) {
					// uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys("--"); //for chrome
					// Browser
					Playback.threadWait();
					new Select(driver.findElement(By.id(controlId))).selectByVisibleText(paramValue);
					// driver.findElement(By.id(controlId)).sendKeys(paramValue);
					uIMapSettings.systemParameter.uISaveButton.click();
					popup.confirm.yes();
					Playback.pageLoadThreadWait();
					Playback.pageLoadThreadWait();
					if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
						popup.acknowledge.ok();
					} else {
						Playback.pageLoadThreadWait();
						popup.acknowledge.sysParameterAcknowledgeOk();
					}
				}
			}
		}

		public void getPreviousInputValue(String paramID, String controlId) {
			WebDriver driver = Playback.driver;
			uIMapSettings.systemParameter.uIParameterIDEdit.clear();
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys(paramID);
			uIMapSettings.systemParameter.uISearchButton.click();
			Playback.threadWait();
			String paramPreviousInputValue = driver.findElement(By.id(controlId)).getAttribute("value");
			int paramInput = Integer.parseInt(paramPreviousInputValue);
			int IntParam = paramInput - 1;
			paramPreviousInputValue = String.valueOf(IntParam);
			System.console().printf(paramPreviousInputValue);
			Playback.testContext.setAttribute("paramInputValue", paramPreviousInputValue);
		}

		public String getInputValue(String paramID, String controlId) {
			WebDriver driver = Playback.driver;
			uIMapSettings.systemParameter.uIParameterIDEdit.clear();
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys(paramID);
			uIMapSettings.systemParameter.uISearchButton.click();
			Playback.threadWait();
			String paramInputValue = driver.findElement(By.id(controlId)).getAttribute("value");

			return paramInputValue;

		}

		public String readInputValue(String paramID) {
			WebDriver driver = Playback.driver;
			uIMapSettings.systemParameter.uIParameterIDEdit.clear();
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys(paramID);
			uIMapSettings.systemParameter.uISearchButton.click();
			Playback.threadWait();
			String IdField = "param_" + paramID + "_Dyn";
			String paramInputValue = driver.findElement(By.id(IdField)).getAttribute("value");
			return paramInputValue;
		}

		public String getSelectValue(String paramID, String controlId) {
			WebDriver driver = Playback.driver;
			uIMapSettings.systemParameter.uIParameterIDEdit.clear();
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys(paramID);
			Playback.threadWait();
			uIMapSettings.systemParameter.uISearchButton.click();
			Playback.threadWait();
			String paramSelectValue = objectIdentification.manualIdentify
					.getDropDwonSelectedItem(driver.findElement(By.id(controlId)));
			return paramSelectValue;

		}

		public void verifySytemParameterSelectedValue(String ParamID, String InputValue) {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("frmSysParams");
			String input = sysParameter.getSelectValue(ParamID, "param_" + ParamID + "_Dyn_DropDown");
			verify.ExpectedPropertyValueIsEqual(InputValue, input);
		}

		public void verifySytemParameterDropdownDisabled(String ParamID) {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("frmSysParams");
			verify.ExpectedValueIsFalse(sysParameter.getParameterStatus(ParamID, "param_" + ParamID + "_Dyn_DropDown"));
		}

		public boolean getParameterStatus(String paramID, String controlId) {
			WebDriver driver = Playback.driver;
			uIMapSettings.systemParameter.uIParameterIDEdit.clear();
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys(paramID);
			uIMapSettings.systemParameter.uISearchButton.click();
			Playback.threadWait();
			boolean paramInputValue = driver.findElement(By.id(controlId)).isEnabled();
			return paramInputValue;
		}

		public void clickSearchButton() {
			uIMapSettings.systemParameter.uISearchButton.click();
		}

		public void clickSaveButton() {
			uIMapSettings.systemParameter.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapSettings.systemParameter.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void setSystemparameter67AsTrue() {
			sysParameter.changeParameterById("67", "select", "param_67_Dyn_DropDown", "True");
		}

		public void setSystemparameter68AsHomeNo() {
			uIMapSettings.systemParameter.uIParameterIDEdit.clear();
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys("68");
			uIMapSettings.systemParameter.uISearchButton.click();
			Playback.driver.findElement(By.id("cddSelectViewOption_Input")).click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect("cddSelectViewOption_DropDown",
					"Home#");
			uIMapSettings.systemParameter.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
				popup.acknowledge.ok();
			}

			else {
				Playback.pageLoadThreadWait();
				popup.acknowledge.sysParameterAcknowledgeOk();
			}
		}

		public void enterParameterIDAs508() {
			sysParameter.changeParameterById("508", "input", "param_508_Dyn", BaseData.getSettingsModuleValue("URL"));
		}

		public void enterParameterIDAs509() {
			sysParameter.changeParameterById("509", "input", "param_509_Dyn", BaseData.getSettingsModuleValue("Name"));
		}

		public void enterAtParameterID() {
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys(BaseData.getSettingsModuleValue("ParameterID"));
		}

		public void setSystemparameter1018AsTrue() {
			sysParameter.changeParameterById("1018", "select", "param_1018_Dyn_DropDown", "True");
		}

		public void setSystemparameter1018AsFalse() {
			sysParameter.changeParameterById("1018", "select", "param_1018_Dyn_DropDown", "False");
		}

		public void selectBiasFormOrHateindicator714AsMandatory() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.systemParameter.uIBiasFormHateIndicatorComboBox, "Mandatory");
		}

		public void setSystemparameter282AsTrue() {
			sysParameter.changeParameterById("282", "select", "param_282_Dyn_DropDown", "True");
		}

		public void setSystemparameter282AsFalse() {
			sysParameter.changeParameterById("282", "select", "param_282_Dyn_DropDown", "False");
		}

		public void selectBiasFormOrHateindicator714AsHide() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.systemParameter.uIBiasFormHateIndicatorComboBox, "Hide");
		}

		public void setSystemparameter4339AsFalse() {
			sysParameter.changeParameterById("4339", "select", "param_4339_Dyn_DropDown", "False");
		}

		public void setSystemparameter4339AsTrue() {
			sysParameter.changeParameterById("4339", "select", "param_4339_Dyn_DropDown", "True");
		}

		public void setSystemparameter1773AsFalse() {
			sysParameter.changeParameterById("1773", "select", "param_1773_Dyn_DropDown", "False");
		}

		public void setSystemparameter794AsTrue() {
			sysParameter.changeParameterById("794", "select", "param_794_Dyn_DropDown", "True");
		}

		public void setSystemparameter794AsFalse() {
			sysParameter.changeParameterById("794", "select", "param_794_Dyn_DropDown", "False");
		}

		public void setSystemparameter1773AsTrue() {
			sysParameter.changeParameterById("1773", "select", "param_1773_Dyn_DropDown", "True");
		}

		public void setSystemparameter1728AsTrue() {
			sysParameter.changeParameterById("1728", "select", "param_1728_Dyn_DropDown", "True");
		}

		public void setSystemparameter1704AsFalse() {
			sysParameter.changeParameterById("1704", "select", "param_1704_Dyn_DropDown", "False");
		}

		public void setSystemparameter251AsTrue() {
			sysParameter.changeParameterById("251", "select", "param_251_Dyn_DropDown", "True");
		}

		public void setSystemparameter639AsFalse() {
			sysParameter.changeParameterById("639", "select", "param_639_Dyn_DropDown", "False");
		}

		public void setSystemparameter639AsTrue() {
			sysParameter.changeParameterById("639", "select", "param_639_Dyn_DropDown", "True");
		}

		public void setSystemparameter532AsFalse() {
			sysParameter.changeParameterById("532", "select", "param_532_Dyn_DropDown", "False");
		}

		public void setSystemparameter532AsTrue() {
			sysParameter.changeParameterById("532", "select", "param_532_Dyn_DropDown", "True");
		}

		public void setSystemparameter786AsTrue() {
			sysParameter.changeParameterById("786", "select", "param_786_Dyn_DropDown", "True");
		}

		public void setSystemparameter406AsRotationbyAreaTowType() {
			sysParameter.changeParameterById("406", "select", "param_406_Dyn_DropDown",
					"18 - Rotation by Area & Tow Type (Reg; Hvy; Spc)");
		}

		public void setSystemparameter406AsRotationbyAreaCycleTowType() {
			sysParameter.changeParameterById("406", "select", "param_406_Dyn_DropDown",
					"16 - Rotation by Area, Cycle & Tow Type (Reg; Hvy; Spc)");
		}

		public void setSystemparameter406As17RotationbyAreaAndTowVendor() {
			sysParameter.changeParameterById("406", "select", "param_406_Dyn_DropDown",
					"17 - Rotation by Area & Tow Vendor");
		}

		public void setSystemparameter406As20RotationbyZoneAndTowVendor() {
			sysParameter.changeParameterById("406", "select", "param_406_Dyn_DropDown",
					"20 - Rotation by Zone & Tow Vendor");
		}

		public void setSystemparameter406As22RotationbyZoneCycleAndTowVendor() {
			sysParameter.changeParameterById("406", "select", "param_406_Dyn_DropDown",
					"22 - Rotation by Zone Cycle & Tow Vendor(Reg; Hvy;Spc)");
		}

		public void setSystemparameter654AsGreen() {
			sysParameter.changeParameterById("654", "select", "param_654_Dyn_DropDown", "Green");
		}

		public void verifyUpdateSuccessfulAckMessage() {
			popup.acknowledge.okWithExpectedMessage(" 1003 - Update Successful");
			Playback.pageLoadThreadWait();
		}

		public void closeTheScreen() {
			uIMapSettings.systemParameter.driver.close();
		}

		public void setSystemparameter801AsDATransmit() {
			sysParameter.changeParameterById("801", "select", "param_801_Dyn_DropDown", "Only after DA transmit");
		}

		public void setSystemparameter801AsAlways() {
			sysParameter.changeParameterById("801", "select", "param_801_Dyn_DropDown", "Always");
		}

		public void setSystemparameter655AsRed() {
			sysParameter.changeParameterById("655", "select", "param_655_Dyn_DropDown", "Red");
		}

		public void setSystemparameter631AsAddressSSN() {
			sysParameter.changeParameterById("631", "select", "param_631_Dyn_DropDown", "Address & SSN");
		}

		public void setSystemparameter631AsRaceAgeHGT() {
			sysParameter.changeParameterById("631", "select", "param_631_Dyn_DropDown",
					"Race, Age, HGT, WGT, Hair, Eye");
		}

		public void setSystemparameter779AsTrue() {
			sysParameter.changeParameterById("779", "select", "param_779_Dyn_DropDown", "True");
		}

		public void enterSystemparameter59AsAutomationTest() {
			sysParameter.changeParameterById("59", "input", "param_59_Dyn", "Automation Script Test Purpose");
		}

		public void enterParameterIDAs266() {
			sysParameter.changeParameterById("266", "select", "param_266_Dyn_DropDown", "True");
		}

		public void setSystemparameter779AsFalse() {
			sysParameter.changeParameterById("779", "select", "param_779_Dyn_DropDown", "False");
		}

		public void setSystemparameter712AsNo() {
			sysParameter.changeParameterById("712", "select", "param_712_Dyn_DropDown", "No");
		}

		public void setSystemparameter712AsYes() {
			sysParameter.changeParameterById("712", "select", "param_712_Dyn_DropDown", "Yes");
		}

		public void setSystemparameter3260AsTrue() {
			sysParameter.changeParameterById("3260", "select", "param_3260_Dyn_DropDown", "True");
		}

		public void setSystemparameter3260AsFalse() {
			sysParameter.changeParameterById("3260", "select", "param_3260_Dyn_DropDown", "False");
		}

		public void EnterSystemparameter59AsAutomationTestScripts() {
			sysParameter.changeParameterById("59", "input", "param_59_Dyn",
					"Automation Test Script Verification Purpose");
		}

		public void setSystemparameter817AsOptional() {
			sysParameter.changeParameterById("817", "select", "param_817_Dyn_DropDown", "Optional");
		}

		public void setSystemparameter817AsMandatoryAll() {
			sysParameter.changeParameterById("817", "select", "param_817_Dyn_DropDown", "Mandatory for All");
		}

		public void setSystemparameter817AsMandatorySupplemental() {
			sysParameter.changeParameterById("817", "select", "param_817_Dyn_DropDown",
					"Mandatory for Supplemental only");
		}

		public void setSystemparameter912AsNo() {
			sysParameter.changeParameterById("912", "select", "param_912_Dyn_DropDown", "No");
		}

		public void setSystemparameter912AsYes() {
			sysParameter.changeParameterById("912", "select", "param_912_Dyn_DropDown", "Yes");
		}

		public void setSystemparameter4322AsFalse() {
			sysParameter.changeParameterById("4322", "select", "param_4322_Dyn_DropDown", "False");
		}

		public void setSystemparameter264AsFalse() {
			sysParameter.changeParameterById("264", "select", "param_264_Dyn_DropDown", "False");
		}

		public void setSystemparameter264AsTrue() {
			sysParameter.changeParameterById("264", "select", "param_264_Dyn_DropDown", "True");
		}

		public void setSystemparameter766AsFalse() {
			sysParameter.changeParameterById("766", "select", "param_766_Dyn_DropDown", "False");
		}

		public void setSystemparameter766AsTrue() {
			sysParameter.changeParameterById("766", "select", "param_766_Dyn_DropDown", "True");
		}

		public void setSystemparameter767AsTrue() {
			sysParameter.changeParameterById("767", "select", "param_767_Dyn_DropDown", "True");
		}

		public void setSystemparameter3252AsTrue() {
			sysParameter.changeParameterById("3252", "select", "param_3252_Dyn_DropDown", "True");
		}

		public void setSystemparameter3255AsTrue() {
			sysParameter.changeParameterById("3255", "select", "param_3255_Dyn_DropDown", "True");
		}

		public void setSystemparameter3255AsFalse() {
			sysParameter.changeParameterById("3255", "select", "param_3255_Dyn_DropDown", "False");
		}

		public void setSystemparameter3257AsFalse() {
			sysParameter.changeParameterById("3257", "select", "param_3257_Dyn_DropDown", "False");
		}

		public void setSystemparameter41AsActiveDirectory() {
			sysParameter.changeParameterById("41", "input", "param_41_Dyn", "Active Directory");
		}

		public void setSystemparameter41AsBlank() {
			sysParameter.changeParameterById("41", "input", "param_41_Dyn", "");
		}

		public void setSystemparameter1804AsFutureDate() {
			sysParameter.changeParameterById("1804", "input", "param_1804_Dyn", Randomized.getFutureDate(5));
		}

		public void setSystemparameter1804AsPreviousDate() {
			sysParameter.changeParameterById("1804", "input", "param_1804_Dyn", "01/01/2018");
		}

		public void setSystemparameter838AsTrue() {
			sysParameter.changeParameterById("838", "select", "param_838_Dyn_DropDown", "True");
		}

		public void setSystemparameter838AsFalse() {
			sysParameter.changeParameterById("838", "select", "param_838_Dyn_DropDown", "False");
		}

		public void setSystemparameter2033AsFalse() {
			sysParameter.changeParameterById("2033", "select", "param_2033_Dyn_DropDown", "False");
		}

		public void setSystemparameter2033AsTrue() {
			sysParameter.changeParameterById("2033", "select", "param_2033_Dyn_DropDown", "True");
		}

		public void ClickFTPInterfaceButton() {
			uIMapSettings.systemParameter.uIFTPInterfaceButton.click();
			Playback.controlReadyThreadWait();
		}

		public void setSystemparameter2006AsTrue() {
			sysParameter.changeParameterById("2006", "select", "param_2006_Dyn_DropDown", "True");
		}

		public void setSystemparameter2006AsFalse() {
			sysParameter.changeParameterById("2006", "select", "param_2006_Dyn_DropDown", "False");
		}

		public void setSystemparameter4322AsTrue() {
			sysParameter.changeParameterById("4322", "select", "param_4322_Dyn_DropDown", "True");
		}

		public void setSystemparameter4323AsFalse() {
			sysParameter.changeParameterById("4323", "select", "param_4323_Dyn_DropDown", "False");
		}

		public void setSystemparameter3320AsTrue() {
			sysParameter.changeParameterById("3320", "select", "param_3320_Dyn_DropDown", "True");
		}

		public void setSystemparameter3320AsFalse() {
			sysParameter.changeParameterById("3320", "select", "param_3320_Dyn_DropDown", "False");
		}

		public void setSystemparameter3319AsFalse() {
			sysParameter.changeParameterById("3319", "select", "param_3319_Dyn_DropDown", "False");
		}

		public void setSystemParameter3123AsLocalNoandStateNo() {
			sysParameter.changeParameterById("3123", "select", "param_3123_Dyn_DropDown", "Local# & State#");
		}

		public void setSystemParameter3123AsLocalNo() {
			sysParameter.changeParameterById("3123", "select", "param_3123_Dyn_DropDown", "Local#");
		}

		public void setSystemParameter3123AsStateNo() {
			sysParameter.changeParameterById("3123", "select", "param_3123_Dyn_DropDown", "State#");
		}

		public void setSystemparameter1804AsCurrentDate() {
			sysParameter.changeParameterById("1804", "input", "param_1804_Dyn", Randomized.getCurrentDate());
		}

		public void setSystemParameter2001AsUCRNIBRS() {
			sysParameter.changeParameterById("2001", "select", "param_2001_Dyn_DropDown", "3 - UCR & NIBRS");
		}

		public void setSystemParameter2001AsUCR() {
			sysParameter.changeParameterById("2001", "select", "param_2001_Dyn_DropDown", "1 - UCR");
		}

		public void setSystemParameter2001AsNIBRS() {
			sysParameter.changeParameterById("2001", "select", "param_2001_Dyn_DropDown", "2 - NIBRS");
		}

		public void setSystemParameter2001AsCJRS() {
			sysParameter.changeParameterById("2001", "select", "param_2001_Dyn_DropDown", "4 - CJRS");
		}

		public void setSystemparameter2017AsCurrentDate() {
			sysParameter.changeParameterById("2017", "input", "param_2017_Dyn", Randomized.getCurrentDate("MM/dd/yy"));
		}

		public void SetAtSystemparameter2002() {
			sysParameter.changeParameterById("2002", "input", "param_2002_Dyn",
					BaseData.getSettingsModuleValue("NIBRSFilePath"));
		}

		public void setSystemparameter2017AsCurrentMonthYear() {
			sysParameter.changeParameterById("2017", "input", "param_2017_Dyn",
					Randomized.getCurrentMonth() + "/" + Randomized.getCurrentYear());
		}

		public void setSystemparameter764AsArrestedAdult() {
			sysParameter.changeParameterById("764", "input", "param_764_Dyn_DropDown", "AAC - Arrested Adult (CM)");
		}

		public void SelectSystemparameter764AsArrestedAdult() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.systemParameter.uIDefaultCaseStatusComboBox, "AAC      - Arrested Adult (CM)");
			uIMapSettings.systemParameter.uIDefaultCaseStatusComboBox.sendKeys(Keys.TAB);
		}

		public void EnterParameterIDAs764() {
			uIMapSettings.systemParameter.uIParameterIDEdit.sendKeys("764");
		}

		public void setSystemparameter211AsTrue() {
			sysParameter.changeParameterById("211", "select", "param_211_Dyn_DropDown", "True");
		}

		public void setSystemparameter290AsTrue() {
			sysParameter.changeParameterById("290", "select", "param_290_Dyn_DropDown", "True");

		}

		public void setSystemparameter1737AsFalse() {
			sysParameter.changeParameterById("1737", "select", "param_1737_Dyn_DropDown", "False");

		}

		public void setSystemparameter1737AsTrue() {
			sysParameter.changeParameterById("1737", "select", "param_1737_Dyn_DropDown", "True");

		}

		public void setSystemparameter704AsFalse() {
			sysParameter.changeParameterById("704", "select", "param_704_Dyn_DropDown", "False");
		}

		public void setSystemparameter705Report() {
			sysParameter.changeParameterById("705", "input", "param_705_Dyn",
					"I swear or affirm this report is correct and true to the best of my knowledge and belief");
		}

		public void setSystemparameter706AsUndersignedAuthority() {
			sysParameter.changeParameterById("706", "input", "param_706_Dyn",
					"Sworn and subscribed before me, the undersigned authority");
		}

		public void setSystemparameter704AsTrue() {
			sysParameter.changeParameterById("704", "select", "param_704_Dyn_DropDown", "True");
		}

		public void setSystemparameter290AsFalse() {
			sysParameter.changeParameterById("290", "select", "param_290_Dyn_DropDown", "False");
		}

		public void setSystemparameter3128AsTrue() {
			sysParameter.changeParameterById("3128", "select", "param_3128_Dyn_DropDown", "True");
		}

		public void setSystemparameter827AsTrue() {
			sysParameter.changeParameterById("827", "select", "param_827_Dyn_DropDown", "True");
		}

		public void setSystemparameter827AsFalse() {
			sysParameter.changeParameterById("827", "select", "param_827_Dyn_DropDown", "False");
		}

		public void setSystemparameter828AsDONOTDISTRIBUTE() {
			sysParameter.changeParameterById("828", "input", "param_828_Dyn",
					"** CAUTION ** DO NOT DISTRIBUTE REPORTS **");
		}

		public void setSystemparameter6600AsTrue() {
			sysParameter.changeParameterById("6600", "select", "param_6600_Dyn_DropDown", "True");
		}

		public void setSystemparameter6600AsFalse() {
			sysParameter.changeParameterById("6600", "select", "param_6600_Dyn_DropDown", "False");
		}

		public void setSystemparameter540AsTrue() {
			sysParameter.changeParameterById("540", "select", "param_540_Dyn_DropDown", "True");
		}

		public void setSystemparameter541AsTrue() {
			sysParameter.changeParameterById("541", "select", "param_541_Dyn_DropDown", "True");
		}

		public void setSystemparameter541AsFalse() {
			sysParameter.changeParameterById("541", "select", "param_541_Dyn_DropDown", "False");
		}

		public void setSystemparameter1771AsFalse() {
			sysParameter.changeParameterById("1771", "select", "param_1771_Dyn_DropDown", "False");
		}

		public void setSystemparameter1776AsFalse() {
			sysParameter.changeParameterById("1776", "select", "param_1776_Dyn_DropDown", "False");
		}

		public void setSystemparameter1776AsTrue() {
			sysParameter.changeParameterById("1776", "select", "param_1776_Dyn_DropDown", "True");
		}

		public void setSystemparameter1771AsTrue() {
			sysParameter.changeParameterById("1771", "select", "param_1771_Dyn_DropDown", "True");
		}

		public void setSystemparameter839AsTrue() {
			sysParameter.changeParameterById("839", "select", "param_839_Dyn_DropDown", "True");
		}

		public void setSystemparameter641AsTrue() {
			sysParameter.changeParameterById("641", "select", "param_641_Dyn_DropDown", "True");
		}

		public void setSystemparameter641AsFalse() {
			sysParameter.changeParameterById("641", "select", "param_641_Dyn_DropDown", "False");
		}

		public void setSystemparameter5914AsFalse() {
			sysParameter.changeParameterById("5914", "select", "param_5914_Dyn_DropDown", "False");
		}

		public void setSystemparameter5914AsTrue() {
			sysParameter.changeParameterById("5914", "select", "param_5914_Dyn_DropDown", "True");
		}

		public void setSystemparameter1704AsTrue() {
			sysParameter.changeParameterById("1704", "select", "param_1704_Dyn_DropDown", "True");
		}

		public void setSystemparameter414AsTrue() {
			sysParameter.changeParameterById("414", "select", "param_414_Dyn_DropDown", "True");
		}

		public void setSystemparameter414AsFalse() {
			sysParameter.changeParameterById("414", "select", "param_414_Dyn_DropDown", "False");
		}

		public void setSystemparameter734AsTrue() {
			sysParameter.changeParameterById("734", "select", "param_734_Dyn_DropDown", "True");
		}

		public void setSystemparameter734AsFalse() {
			sysParameter.changeParameterById("734", "select", "param_734_Dyn_DropDown", "False");
		}

		public void setSystemparameter84AsHotSheet() {
			sysParameter.changeParameterById("84", "select", "param_84_Dyn_DropDown", "HS - Hot Sheet Report");
		}

		public void setSystemparameter85AsDailyBriefing() {
			sysParameter.changeParameterById("85", "select", "param_85_Dyn_DropDown", "DB - Daily Briefing");
		}

		public void setSystemparameter736AsDIVSEC() {
			sysParameter.changeParameterById("736", "select", "param_736_Dyn_DropDown", "DIV+SEC");
		}

		public void setSystemparameter736AsNull() {
			sysParameter.changeParameterById("736", "select", "param_736_Dyn_DropDown", "--");
		}

		public void setSystemparameter739AsFalse() {
			sysParameter.changeParameterById("739", "select", "param_739_Dyn_DropDown", "False");
		}

		public void setSystemparameter745AsFalse() {
			sysParameter.changeParameterById("745", "select", "param_745_Dyn_DropDown", "False");
		}

		public void setSystemparameter745AsTrue() {
			sysParameter.changeParameterById("745", "select", "param_745_Dyn_DropDown", "True");
		}

		public void setSystemparameter816AsTrue() {
			sysParameter.changeParameterById("816", "select", "param_816_Dyn_DropDown", "True");
		}

		public void setSystemparameter816AsFalse() {
			sysParameter.changeParameterById("816", "select", "param_816_Dyn_DropDown", "False");
		}

		public void verifySystemParameter705AsNotEmpty() {
			String text = uIMapSettings.systemParameter.uIAffirmationMessageEdit.getText();
			verify.ExpectedPropertyValueIsNotEqual(text, null);
		}

		public void setSystemParameter705AsEmpty() {
			uIMapSettings.systemParameter.uIAffirmationMessageEdit.clear();
		}

		public void verifySystemParameter705AsEmpty() {
			String text = uIMapSettings.systemParameter.uIAffirmationMessageEdit.getText();
			verify.ExpectedPropertyValueIsEqual(text, "");
		}

		public void setSystemParameter705AsYes() {
			uIMapSettings.systemParameter.uIAffirmationMessageEdit.sendKeys("Yes");
		}

		public void setSystemparameter759AsTrue() {
			sysParameter.changeParameterById("759", "select", "param_759_Dyn_DropDown", "True");
		}

		public void setSystemparameter759AsFalse() {
			sysParameter.changeParameterById("759", "select", "param_759_Dyn_DropDown", "False");
		}

		public void setSystemparameter917AsTrue() {
			sysParameter.changeParameterById("917", "select", "param_917_Dyn_DropDown", "True");
		}

		public void setSystemparameter917AsFalse() {
			sysParameter.changeParameterById("917", "select", "param_917_Dyn_DropDown", "False");
		}

		public void setSystemparameter918AsTrue() {
			sysParameter.changeParameterById("918", "select", "param_918_Dyn_DropDown", "True");
		}

		public void setSystemparameter918AsFalse() {
			sysParameter.changeParameterById("918", "select", "param_918_Dyn_DropDown", "False");
		}

		public void setSystemparameter919AsTrue() {
			sysParameter.changeParameterById("919", "select", "param_919_Dyn_DropDown", "True");
		}

		public void setSystemparameter919AsFalse() {
			sysParameter.changeParameterById("919", "select", "param_919_Dyn_DropDown", "False");
		}

		public void setSystemparameter920AsTrue() {
			sysParameter.changeParameterById("920", "select", "param_920_Dyn_DropDown", "True");
		}

		public void setSystemparameter926AsTrue() {
			sysParameter.changeParameterById("926", "select", "param_926_Dyn_DropDown", "True");
		}

		public void setSystemparameter926AsFalse() {
			sysParameter.changeParameterById("926", "select", "param_926_Dyn_DropDown", "False");
		}

		public void setSystemparameter920AsFalse() {
			sysParameter.changeParameterById("920", "select", "param_920_Dyn_DropDown", "False");
		}

		public void setSystemparameter909AsAdministration() {
			sysParameter.changeParameterById("909", "select", "param_909_Dyn_DropDown", "Administration");
		}

		public void setSystemparameter829AsYes() {
			sysParameter.changeParameterById("829", "select", "param_829_Dyn_DropDown", "Yes");
		}

		public void setSystemparameter829AsNill() {
			sysParameter.changeParameterById("829", "select", "param_829_Dyn_DropDown", "--");

		}

		public void setSystemparameter762AsTrue() {
			sysParameter.changeParameterById("762", "select", "param_762_Dyn_DropDown", "True");

		}

		public void setSystemparameter762AsFalse() {
			sysParameter.changeParameterById("762", "select", "param_762_Dyn_DropDown", "False");
		}

		public void setSystemparameter2017AtFromDate() {
			sysParameter.changeParameterById("2017", "input", "param_2017_Dyn",
					BaseData.getSettingsModuleValue("FromDate"));// FromDate must be 08/2020
		}

		public void setSystemparameter736AsDivSec() {
			sysParameter.changeParameterById("736", "select", "param_736_Dyn_DropDown", "DIV+SEC");
		}

		public void setSystemparameter785AsTrue() {
			sysParameter.changeParameterById("785", "select", "param_785_Dyn_DropDown", "True");
		}

		public void setSystemparameter835AsTrue() {
			sysParameter.changeParameterById("835", "select", "param_835_Dyn_DropDown", "True");
		}

		public void setSystemparameter1826AsFalse() {
			sysParameter.changeParameterById("1826", "select", "param_1826_Dyn_DropDown", "False");
		}

		public void setSystemparameter836AsFalse() {
			sysParameter.changeParameterById("836", "select", "param_836_Dyn_DropDown", "False");
		}

		public void setSystemparameter1826AsTrue() {
			sysParameter.changeParameterById("1826", "select", "param_1826_Dyn_DropDown", "True");
		}

		public void setSystemparameter203AsBlank() {
			sysParameter.changeParameterById("203", "input", "param_203_Dyn", " ");
		}

		public void setSystemparameter204AsBlank() {
			sysParameter.changeParameterById("204", "input", "param_204_Dyn", " ");
		}

		public void setSystemparameter205AsBlank() {
			sysParameter.changeParameterById("205", "input", "param_205_Dyn", " ");
		}

		public void setSystemparameter220AsBlank() {
			sysParameter.changeParameterById("220", "input", "param_220_Dyn", " ");
		}

		public void setSystemparameter203AsSMTPserver() {
			sysParameter.changeParameterById("203", "input", "param_203_Dyn", "192.168.15.57");
		}

		public void setSystemparameter204AsSMTPuser() {
			sysParameter.changeParameterById("204", "input", "param_204_Dyn", "phoenix");
		}

		public void setSystemparameter220AsSMTPpassword() {
			sysParameter.changeParameterById("220", "input", "param_220_Dyn", "spSS0377");
		}

		public void setSystemparameter220AsWebServerURL() {
			sysParameter.changeParameterById("220", "input", "param_220_Dyn",
					"http://192.168.14.82/PhoenixWebservice/notify/Notification.aspx");
		}

		public void setSystemparameter272AsFalse() {
			sysParameter.changeParameterById("272", "select", "param_272_Dyn_DropDown", "False");
		}

		public void setSystemparameter272AsTrue() {
			sysParameter.changeParameterById("272", "select", "param_272_Dyn_DropDown", "True");
		}

		public void setSystemparameter832AsTrue() {
			sysParameter.changeParameterById("832", "select", "param_832_Dyn_DropDown", "True");
		}

		public void setSystemparameter832AsFalse() {
			sysParameter.changeParameterById("832", "select", "param_832_Dyn_DropDown", "False");
		}

		public void setSystemparameter833AsTrue() {
			sysParameter.changeParameterById("833", "select", "param_833_Dyn_DropDown", "True");
		}

		public void setSystemparameter833AsFalse() {
			sysParameter.changeParameterById("833", "select", "param_833_Dyn_DropDown", "False");
		}

		public void setSystemparameter834AsTrue() {
			sysParameter.changeParameterById("834", "select", "param_834_Dyn_DropDown", "True");
		}

		public void setSystemparameter834AsFalse() {
			sysParameter.changeParameterById("834", "select", "param_834_Dyn_DropDown", "False");
		}

		public void setSystemparameter835AsFalse() {
			sysParameter.changeParameterById("835", "select", "param_835_Dyn_DropDown", "False");
		}

		public void setSystemparameter814AsDisseminateReport() {
			sysParameter.changeParameterById("814", "select", "param_814_Dyn_DropDown", "Disseminate Report");
		}

		public void setSystemparameter813AsTrue() {
			sysParameter.changeParameterById("813", "select", "param_813_Dyn_DropDown", "True");
		}

		public void setSystemparameter813AsFalse() {
			sysParameter.changeParameterById("813", "select", "param_813_Dyn_DropDown", "False");
		}

		public void setSystemparameter512AsESRI() {
			sysParameter.changeParameterById("512", "select", "param_512_Dyn_DropDown", "ESRI");
		}

		public void setSystemparameter512AsGoogleMap() {
			sysParameter.changeParameterById("512", "select", "param_512_Dyn_DropDown", "Google Map");
		}

		public void setSystemparameter512AsHEREMap() {
			sysParameter.changeParameterById("512", "select", "param_512_Dyn_DropDown", "HERE Map");
		}

		public void setSystemparameter427AsAbandoned() {
			sysParameter.changeParameterById("427", "input", "param_427_Dyn", "Abandoned");
		}

		public void setSystemParameter736AsDIVSEC() {
			sysParameter.changeParameterById("736", "select", "param_736_Dyn_DropDown", "DIV+SEC");
		}

		public void setSystemparameter760AsTrue() {
			sysParameter.changeParameterById("760", "select", "param_760_Dyn_DropDown", "True");
		}

		public void setSystemparameter712AsMandatory() {
			sysParameter.changeParameterById("712", "select", "param_712_Dyn_DropDown", "Mandatory");
		}

		public void setSystemparameter812As1() {
			sysParameter.changeParameterById("812", "input", "param_812_Dyn", "1");
		}

		public void setSystemparameter812As0() {
			sysParameter.changeParameterById("812", "input", "param_812_Dyn", "0");
		}

		public void setSystemparameter659AsAdult() {
			sysParameter.changeParameterById("659", "input", "param_659_Dyn_DropDown", "Adult");
		}

		public void setSystemparameter659AsNull() {
			sysParameter.changeParameterById("659", "input", "param_659_Dyn_DropDown", "--");
		}

		public void setSystemparameter221AsNotificationFrom() {
			sysParameter.changeParameterById("221", "input", "param_221_Dyn", "Support00@prophoenix.com");
		}

		public void setSystemparameter204AsSMTPuserGmai() {
			sysParameter.changeParameterById("204", "input", "param_204_Dyn", "ProPhoenixText@Gmail.com");
		}

		public void setSystemparameter205AsSMTPpassword() {
			sysParameter.changeParameterById("205", "input", "param_205_Dyn", "phoenix1text");
		}

		public void setSystemparameter206AsFromID() {
			sysParameter.changeParameterById("206", "input", "param_206_Dyn", "support@prophoenix.com");
		}

		public void setSystemparameter2504AsTrue() {
			sysParameter.changeParameterById("2504", "select", "param_2504_Dyn_DropDown", "True");
		}

		public void setSystemparameter2504AsFalse() {
			sysParameter.changeParameterById("2504", "select", "param_2504_Dyn_DropDown", "False");
		}

		public void setSystemparameter3137AsFalse() {
			sysParameter.changeParameterById("3137", "select", "param_3137_Dyn_DropDown", "False");
		}

		public void setSystemparameter3137AsTrue() {
			sysParameter.changeParameterById("3137", "select", "param_3137_Dyn_DropDown", "True");
		}

		public void setSystemparameter3140AsTrue() {
			sysParameter.changeParameterById("3140", "select", "param_3140_Dyn_DropDown", "True");
		}

		public void setSystemparameter3257AsTrue() {
			sysParameter.changeParameterById("3257", "select", "param_3257_Dyn_DropDown", "True");
		}

		public void setSystemparameter286AsFalse() {
			sysParameter.changeParameterById("286", "select", "param_286_Dyn_DropDown", "False");
		}

		public void setSystemparameter286AsTrue() {
			sysParameter.changeParameterById("286", "select", "param_286_Dyn_DropDown", "True");
		}

		public void setSystemparameter504AsValidApartment() {
			sysParameter.changeParameterById("504", "select", "param_504_Dyn_DropDown", "Valid Apartment or Blank");
		}

		public void setSystemparameter504AsVerifyApartment() {
			sysParameter.changeParameterById("504", "select", "param_504_Dyn_DropDown", "Verify Apartment");
		}

		public void setSystemparameter504AsNoVerification() {
			sysParameter.changeParameterById("504", "select", "param_504_Dyn_DropDown", "No Verification");
		}

		public void setSystemparameter540AsFalse() {
			sysParameter.changeParameterById("540", "select", "param_540_Dyn_DropDown", "False");
		}

		public void setSystemparameter549AsTrue() {
			sysParameter.changeParameterById("549", "select", "param_549_Dyn_DropDown", "True");
		}

		public void setSystemparameter549AsFalse() {
			sysParameter.changeParameterById("549", "select", "param_549_Dyn_DropDown", "False");
		}

		public void verifySytemParameter540SelectedValueAsFalse() {
			sysParameter.verifySytemParameterSelectedValue("540", "False");
		}

		public void verifySytemParameter549SelectedValueAsFalse() {
			sysParameter.verifySytemParameterSelectedValue("549", "False");
		}

		public void verifySytemParameter540Disabled() {
			sysParameter.verifySytemParameterDropdownDisabled("540");
		}

		public void verifySytemParameter549Disabled() {
			sysParameter.verifySytemParameterDropdownDisabled("549");
		}

		public void setSystemparameter200AsTrue() {
			sysParameter.changeParameterById("200", "select", "param_200_Dyn_DropDown", "True");
		}

		public void setSystemparameter203AsSSL() {
			sysParameter.changeParameterById("203", "input", "param_203_Dyn", "SMTP.GMAIL.COM");
		}

		public void setSystemparameter203AsNonSSL() {
			sysParameter.changeParameterById("203", "input", "param_203_Dyn", "192.168.15.57");
		}

		public void setSystemparameter200AsFalse() {
			sysParameter.changeParameterById("200", "select", "param_200_Dyn_DropDown", "False");
		}

		public void setSystemparameter558As8() {
			sysParameter.changeParameterById("558", "input", "param_558_Dyn", "8");
		}

		public void setSystemparameter633AsTrue() {
			sysParameter.changeParameterById("633", "select", "param_633_Dyn_DropDown", "True");
		}

		public void setSystemparameter633AsFalse() {
			sysParameter.changeParameterById("633", "select", "param_633_Dyn_DropDown", "False");
		}

		public void setSystemparameter653AsTrue() {
			sysParameter.changeParameterById("653", "select", "param_653_Dyn_DropDown", "True");
		}

		public void setSystemparameter615AsTrue() {
			sysParameter.changeParameterById("615", "select", "param_615_Dyn_DropDown", "True");
		}

		public void setSystemparameter615AsFalse() {
			sysParameter.changeParameterById("615", "select", "param_615_Dyn_DropDown", "False");
		}

		public void setSystemparameter731AsMandatory() {
			sysParameter.changeParameterById("731", "select", "param_731_Dyn_DropDown", "Mandatory");
		}

		public void setSystemparameter731AsYes() {
			sysParameter.changeParameterById("731", "select", "param_731_Dyn_DropDown", "Yes");
		}

		public void setSystemparameter731AsNo() {
			sysParameter.changeParameterById("731", "select", "param_731_Dyn_DropDown", "No");
		}

		public void setSystemparameter2501AsFutureDate(int Date) {
			sysParameter.changeParameterById("2501", "input", "param_2501_Dyn", Randomized.getFutureDate(Date));
		}

		public void verifySystemParameter501IsNotAsMNDB() {
			String inputValue = sysParameter.getInputValue("501", "param_501_Dyn_DropDown");
			verify.ExpectedValueIsNotTrue(inputValue.contains("MN"));
		}

		public void setSystemParameterID633AsTrue() {
			sysParameter.changeParameterById("633", "select", "param_633_Dyn_DropDown", "True");
		}

		public void verifyAtParameterValueByID() {

			String ParameterValue = sysParameter.readInputValue(BaseData.getSettingsModuleValue("ParameterID"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterValue"), ParameterValue);
		}

		public void setSystemparameter746AsTrue() {
			sysParameter.changeParameterById("746", "select", "param_746_Dyn_DropDown", "True");
		}

		public void setSystemparameter746AsFalse() {
			sysParameter.changeParameterById("746", "select", "param_746_Dyn_DropDown", "False");
		}

		public void clickRefreshButton() {
			uIMapSettings.systemParameter.uIResetButton.click();
		}

		public void setSystemparameter782AsTrue() {
			sysParameter.changeParameterById("782", "select", "param_782_Dyn_DropDown", "True");
		}

		public void setSystemparameter228AsNull() {
			sysParameter.changeParameterById("228", "select", "param_228_Dyn_DropDown", "--");
		}

		public void setSystemparameter231AsNetwork() {
			sysParameter.changeParameterById("231", "select", "param_231_Dyn_DropDown", "Network");
		}

		public void selectAtModule() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.systemParameter.uIModuleDropDown,
					BaseData.getSettingsModuleValue("Module"));
			uIMapSettings.systemParameter.uIModuleDropDown.sendKeys(Keys.TAB);
		}

		public void setSystemParameterID3118AsReportOfInspectionAndNoticeOfViolation() {
			sysParameter.changeParameterById("3118", "select", "param_3118_Dyn_DropDown",
					"Report of Inspection and Notice of Violation");
		}

		public void setSystemParameterID3143AsTrue() {
			sysParameter.changeParameterById("3143", "select", "param_3143_Dyn_DropDown", "True");
		}

		public void setSystemParameterID3140AsTrue() {
			sysParameter.changeParameterById("3140", "select", "param_3140_Dyn_DropDown", "True");
		}

		public void setSystemParameterID3144AsTrue() {
			sysParameter.changeParameterById("3144", "select", "param_3144_Dyn_DropDown", "True");
		}

		public void setSystemParameterID3144AsFalse() {
			sysParameter.changeParameterById("3144", "select", "param_3144_Dyn_DropDown", "False");
		}

		public void setSystemParameterID3107AsTrue() {
			sysParameter.changeParameterById("3107", "select", "param_3107_Dyn_DropDown", "True");
		}

		public void clickApprovalParameterButton() {
			uIMapSettings.systemParameter.uIApproveParameterButton.click();
		}

		public void setSystemparameter39AsWrongLocation() {
			sysParameter.changeParameterById("39", "input", "param_39_Dyn", "<C:<\\Program Files\\ProPhoe>>");
		}

		public void setSystemparameter39AsCorrectLocation() {
			sysParameter.changeParameterById("39", "input", "param_39_Dyn", "<C:<\\Program Files\\ProPhoenix>>");
		}

		public void setSystemparameter231AsDatabase() {
			sysParameter.changeParameterById("231", "select", "param_231_Dyn_DropDown", "Database");
		}

		public void setSystemparameter36AsHttps() {
			sysParameter.changeParameterById("36", "input", "param_36_Dyn",
					"https://192.168.14.45/PnxRptSvr/frmPnxRpt.aspx");
		}

		public void setSystemparameter36AsHttp() {
			sysParameter.changeParameterById("36", "input", "param_36_Dyn",
					"http://192.168.14.45/PnxRptSvr/frmPnxRpt.aspx");
		}

		public void setSystemparameter806AsEmailId() {
			sysParameter.changeParameterById("806", "input", "param_806_Dyn", "mithun@prophoenix.com");
		}

		public void setSystemparameter807As1() {
			sysParameter.changeParameterById("807", "input", "param_807_Dyn", "1");
		}

		public void setSystemparameter1203AsVEHCK() {
			sysParameter.changeParameterById("1203", "select", "param_1203_Dyn_DropDown", "VEHCK - Vehicle Inspection");
		}

		public void setSystemparameter4338AsNull() {
			sysParameter.changeParameterById("4338", "input", "param_4338_Dyn", " ");
		}

		public void setSystemParameter836AsTrue() {
			sysParameter.changeParameterById("836", "select", "param_836_Dyn_DropDown", "True");
		}

		public void setSystemparameter1804AsNull() {
			sysParameter.changeParameterById("1804", "input", "param_1804_Dyn", " ");
		}

		public void setSystemparameter905AsOpenPending() {
			sysParameter.changeParameterById("905", "select", "param_905_Dyn_DropDown", "OPN - Open/Pending (CM)");
		}

		public void setSystemparameter905AsNull() {
			sysParameter.changeParameterById("905", "select", "param_905_Dyn_DropDown", " ");
		}

		public void setSystemparameter808As1() {
			sysParameter.changeParameterById("808", "input", "param_808_Dyn", "1");
		}

		public void setSystemparameter809As1() {
			sysParameter.changeParameterById("809", "input", "param_809_Dyn", "1");
		}

		public void setSystemparameter274AsFalse() {
			sysParameter.changeParameterById("274", "select", "param_274_Dyn_DropDown", "False");
		}

		public void setSystemparameter275AsFalse() {
			sysParameter.changeParameterById("275", "select", "param_275_Dyn_DropDown", "False");
		}

		public void setSystemparameter764AsBlank() {
			sysParameter.changeParameterById("764", "input", "param_764_Dyn_DropDown", "  --  ");
		}

		public void setSystemparameter410AsTrue() {
			sysParameter.changeParameterById("410", "select", "param_410_Dyn_DropDown", "True");
		}

		public void setSystemparameter911AsYes() {
			sysParameter.changeParameterById("911", "select", "param_911_Dyn_DropDown", "Yes");
		}

		public void setSystemparameter206AsMailID() {
			sysParameter.changeParameterById("206", "input", "param_206_Dyn", "mithun@prophoenix.com");
		}

		public void setSystemparamete723AsYes() {
			sysParameter.changeParameterById("723", "select", "param_723_Dyn_DropDown", "Yes");
		}

		public void setSystemparamete721AsYes() {
			sysParameter.changeParameterById("721", "select", "param_721_Dyn_DropDown", "Yes");
		}

		public void ClickCaseNotificationeButton() {
			uIMapSettings.systemParameter.uICaseNotificationIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void enterParameter753As15Days() {
			sysParameter.changeParameterById("753", "input", "param_753_Dyn", BaseData.getSettingsModuleValue("Days"));
		}

		public void setSystemparameter428AsPattern() {
			sysParameter.changeParameterById("428", "input", "param_428_Dyn", "T[YY][PPPPPPP]$[III]");
		}

		public void setSystemparameter428AsPattern1() {
			sysParameter.changeParameterById("428", "input", "param_428_Dyn", "%T[YY][PPPPPPP]$ [iii]%");
		}

		public void setSystemparameter427AsAccident() {
			sysParameter.changeParameterById("427", "input", "param_427_Dyn", "Accident");
		}

		public void setSystemparameter36ForSetup() {
			Playback.driver.findElement(By.id("txtParamID")).click();
			Playback.driver.findElement(By.id("txtParamID")).sendKeys("36");
			Playback.driver.findElement(By.id("cmdSearch")).click();
			String setupUrl = PropertiesFile.readPropertiesFile("url").substring(0, 20);
			String reportServerUrl = Playback.driver.findElement(By.xpath("//input[@id='param_36_Dyn']"))
					.getAttribute("value");
			String IPServerUrl = reportServerUrl.substring(0, 20);
			String ChangedIPServerUrl = reportServerUrl.replaceAll(IPServerUrl, setupUrl);
			sysParameter.changeParameterById("36", "input", "param_36_Dyn", ChangedIPServerUrl);
		}

		public void setSystemparameter25AsScenePDWebSDKv75() // Added by Abi
		{
			sysParameter.changeParameterById("25", "select", "param_25_Dyn_DropDown", "Scene PD Web SDK v7.5");
		}

		public void setSystemparameter91AsLicensed() // Added by Abi
		{
			sysParameter.changeParameterById("91", "input", "param_91_Dyn", "64667972");
		}

		public void setSystemparameter92Aswebsdk() // Added by Abi
		{
			sysParameter.changeParameterById("92", "input", "param_92_Dyn", "websdk");
		}

		public void setSystemparameter743AsFalse() {
			sysParameter.changeParameterById("743", "select", "param_743_Dyn_DropDown", "False");
		}

		public void setSystemparameter743AsTrue() {
			sysParameter.changeParameterById("743", "select", "param_743_Dyn_DropDown", "True");
		}


		public void setSystemparameter5909AsTrue() {
			sysParameter.changeParameterById("5909", "select", "param_5909_Dyn_DropDown", "True");
		}

		public void setSystemparameter5909AsFalse() {
			sysParameter.changeParameterById("5909", "select", "param_5909_Dyn_DropDown", "False");
		}

		public void verifyComboBoxSystemParametersListedInScreen() {
			int size = Playback.driver.findElements(By.xpath("//select[contains(@id,'param')]")).size();
			verify.ExpectedIntergerValueIsNotEqualToActual(0, size);
		}

		public void verifyEditSystemParametersListedInScreen() {
			List<WebElement> newElements = new ArrayList<WebElement>();

			List<WebElement> allElements = Playback.driver.findElements(By.xpath("//input[contains(@id,'param')]"));
			for (WebElement element : allElements) {
				if (element.isDisplayed()) {
					newElements.add(element);
				}
			}
			System.out.println(newElements.size());
			verify.ExpectedIntergerValueIsNotEqualToActual(0, newElements.size());
		}

		public void selectModuleAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.systemParameter.uIModuleDropDown,
					"--");
			uIMapSettings.systemParameter.uIModuleDropDown.sendKeys(Keys.TAB);
		}

		public void resetParameterID() {
			uIMapSettings.systemParameter.uIParameterIDEdit.click();
			uIMapSettings.systemParameter.uIParameterIDEdit.clear();
		}

		public void enterAtParameterName() {
			uIMapSettings.systemParameter.uIParameterNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName"));
			uIMapSettings.systemParameter.uIParameterNameEdit.sendKeys(Keys.TAB);
		}

		public void clickViewHistoryButton() {
			uIMapSettings.systemParameter.uIViewHistoryButton.click();
		}

		public void switchToHistoryWindow() {
			objectIdentification.windowHandle.switchToWindowUsingURL("frmSysParamHistory");
		}

		public void setSystemparameter299AsTrue() {
			sysParameter.changeParameterById("299", "select", "param_299_Dyn_DropDown", "True");
		}

		public void setSystemparameter1728AsFalse() {												  // Added by Abi
			sysParameter.changeParameterById("1728", "select", "param_1728_Dyn_DropDown", "False");
		}

	}

	public class CFSCode {

		public void clickAddNewButton() {
			uIMapSettings.cFSCode.uIAddNewButton.click();
			Playback.pageLoadThreadWait();
		}

		public void enterAtCFSCode() {
			uIMapSettings.cFSCode.uICFSCodeEdit.sendKeys(BaseData.getSettingsModuleValue("CFSCode"));
		}

		public void clickSearch() {
			uIMapSettings.cFSCode.uISearchButton.click();
			Playback.gridLoadThreadWait();
		}

		public void VerifyTypeUsingCFSCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Type"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.cFSCode.uICFSCodeResultTable,
							BaseData.getSettingsModuleValue("CFSCode"), "Type").getText());
		}

		public void clickAtCFSCodeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.cFSCode.uICFSCodeResultTable,
					BaseData.getSettingsModuleValue("CFSCode"));
			Playback.pageLoadThreadWait();
		}

		public void selectAtType() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.cFSCode.uITypeComboBox,
					BaseData.getSettingsModuleValue("Type"));
		}

		public void enterAtCFSCodeForFire() {
			uIMapSettings.cFSCode.uICFSCodeEditFire.sendKeys(BaseData.getSettingsModuleValue("CFSCode"));
		}

		public void clickAtCFSCodeInGridForFire() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.cFSCode.uICFSCodeResultTableFire, BaseData.getSettingsModuleValue("CFSCode"));
			Playback.pageLoadThreadWait();
		}
	}

	public class AccessLog {

		public void enterAtPFCode() {
			uIMapSettings.accessLog.uIPFCodeEdit.sendKeys(BaseData.getSettingsModuleValue("PFCode"));
			uIMapSettings.accessLog.uIPFCodeEdit.sendKeys(Keys.TAB);

		}

		public void enterRepositoryAs3240() {
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys("3240");

		}

		public void enterRepositoryAs2273() {
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys("2273");
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterRepositoryAs1388() {
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys("1388");
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterRepositoryAs2272() {
			uIMapSettings.accessLog.uIRepositoryCodeEdit.click();
			uIMapSettings.accessLog.uIRepositoryCodeEdit.clear();
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys("2272");
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterRepositoryAs2275() {
			uIMapSettings.accessLog.uIRepositoryCodeEdit.click();
			uIMapSettings.accessLog.uIRepositoryCodeEdit.clear();
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys("2275");
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys(Keys.TAB);
		}

		public void tabTheFromDateAndTime() {
			uIMapSettings.accessLog.uIFromDateDEdit.sendKeys(Keys.TAB);
			uIMapSettings.accessLog.uIFromTimeEdit.sendKeys(Keys.TAB);
		}

		public void tabTheToDateAndTime() {
			uIMapSettings.accessLog.uIToDateEdit.sendKeys(Keys.TAB);
			uIMapSettings.accessLog.uIToTimeEdit.sendKeys(Keys.TAB);

		}

		public void enterAtRepositoryID() {
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys(BaseData.getSettingsModuleValue("Repository"));
			uIMapSettings.accessLog.uIRepositoryCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAccessLogAsLoginFailed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.accessLog.uIAccessTypeDropDown,
					"Login Failed");
		}

		public void clickSearch() {
			uIMapSettings.accessLog.uISearchButton.click();
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void verifyCurrentDateAsFrom() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapSettings.accessLog.uIFromDateDEdit.getAttribute("value"));
		}

		public void verifyCurrentDateAsTo() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapSettings.accessLog.uIToDateEdit.getAttribute("value"));
		}

		public void verifyActivityDateAsCurrentDate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Activity Date/Time", rowIndex)
					.contains(Randomized.getCurrentDate("MM/dd/yy")));
		}

		public void verifyAccessAsLoginFailed(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Access", rowIndex)
					.contains("Login Failed"));
		}

		public void verifyAccessAsAdd(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Access", rowIndex)
					.contains("ADD"));
		}

		public void verifyDescriptionAtUserName(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Description", rowIndex)
					.contains(BaseData.getSettingsModuleValue("UserName")));
		}

		public void verifyDescriptionAsLoginFailed(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Description", rowIndex)
					.contains("Login Failed"));
		}

		public void verifyAtDescription(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Description", rowIndex)
					.contains(BaseData.getSettingsModuleValue("Description")));
		}

		public void verifyAtDescription1(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Description", rowIndex)
					.contains(BaseData.getSettingsModuleValue("Description1")));
		}

		public void verifyAtScreen(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid,
									"Screen ID - Screen Name", rowIndex)
							.contains(BaseData.getSettingsModuleValue("Screen")));
		}

		public void verifyAtScreenID(int rowIndex, String Screen) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Screen ID - Screen Name",
							rowIndex)
					.contains(Screen));
		}

		public void verifyAtScreen1(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Screen", rowIndex)
					.contains(BaseData.getSettingsModuleValue("Screen1")));
		}

		public void verifyAtPFCode(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("PFCode"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "PF Code", rowIndex));
		}

		public void selectAccessLogAsAdd() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.accessLog.uIAccessTypeDropDown,
					"ADD");
		}

		public void selectAccessLogAsSearch() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.accessLog.uIAccessTypeDropDown,
					"Search");
		}

		public void verifyDescriptionAsJailCell(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Description", rowIndex)
					.contains("Jail Cell"));
		}

		public void enterAtCallNo() {
			uIMapSettings.accessLog.uICallNoYear.sendKeys(BaseData.getTestContextData("CallNo").substring(0, 2));
			uIMapSettings.accessLog.uICallNoEdit.sendKeys(BaseData.getTestContextData("CallNo").substring(3));
			uIMapSettings.accessLog.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCallNo(String CallNo) {
			uIMapSettings.accessLog.uICallNoYear.sendKeys(CallNo.substring(0, 2));
			uIMapSettings.accessLog.uICallNoEdit.sendKeys(CallNo.substring(3));
			uIMapSettings.accessLog.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNo(String CaseNo) {
			uIMapSettings.accessLog.uICaseNoYear.sendKeys(CaseNo.substring(0, 2));
			uIMapSettings.accessLog.uICaseNoEdit.sendKeys(CaseNo.substring(3));
			uIMapSettings.accessLog.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtDescription(int rowIndex, String Description) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Description", rowIndex)
					.contains(Description));
		}

		public void enterAtContainsDescription() {
			uIMapSettings.accessLog.uIDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("SearchDescription"));
		}

		public void enterAtDescription() {
			uIMapSettings.accessLog.uIDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("Description"));
		}

		public void verifyAccessAsChange(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Access", rowIndex)
					.contains("Change"));
		}

		public void verifyAccessAsDelete(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Access", rowIndex)
					.contains("Delete"));
		}

		public void verifyAccessAsPrint(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Access", rowIndex)
					.contains("Print"));
		}

		public void verifyScreenIDAndNameAsCallSearch(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Screen ID - Screen Name",
							rowIndex)
					.contains("Call Search"));
		}

		public void verifyScreenIDAndNameAsCaseSearch(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.accessLog.uIAccessLogResultGrid, "Screen ID - Screen Name",
							rowIndex)
					.contains("Case Search"));
		}

	}

	public class PhoenixAuthenticatorWindow {
		public void enterAtPassword() {
			uIMapSettings.phoenixAuthenticatorWindow.uIPasswordEdit
					.sendKeys(BaseData.getSettingsModuleValue("Password"));
		}

		public void clickAcceptButton() {
			uIMapSettings.phoenixAuthenticatorWindow.uIAcceptButton.click();
		}

		public void closeScreen() {
			uIMapSettings.phoenixAuthenticatorWindow.driver.close();
		}

		public void enterAtInvalidPassword() {
			uIMapSettings.phoenixAuthenticatorWindow.uIPasswordEdit
					.sendKeys(BaseData.getSettingsModuleValue("InvalidPassword"));
		}

		public void verifyInvalidUserNamePassAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1049 - Invalid User Name Password");
		}

		public void enterAtUserName() {
			uIMapSettings.phoenixAuthenticatorWindow.uIUserNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("UserName"));
		}

	}

	// region Coded Action Class
	public class Coded {

		public void enterAtCodeID() {
			uIMapSettings.coded.uICodeIDEdit.click();
			uIMapSettings.coded.uICodeIDEdit.clear();
			uIMapSettings.coded.uICodeIDEdit.sendKeys(BaseData.getSettingsModuleValue("CodeID"));
		}

		public void clickSearchButton() {
			uIMapSettings.coded.uISearchButton.click();
		}

		public void verifyAtCodeIDInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeID"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapSettings.coded.uICodedTable,
							"Code ID", rowIndex));
		}

		public void clickRowByAtCodeID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.coded.uICodedTable,
					BaseData.getSettingsModuleValue("CodeID"));
			Playback.threadWait(60000);
		}

		public void verifyDescriptionAsUnderCoverCategoryInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Under Cover Category", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.coded.uICodedTable, "Description", rowIndex));
		}

		public void verifyAtDescriptionInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapSettings.coded.uICodedTable,
							"Description", rowIndex));
		}

		public void clickRowByAtCodeID1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.coded.uICodedTable,
					BaseData.getSettingsModuleValue("CodeID1"));
			Playback.threadWait(60000);
		}

		public void clickRowByAtCodeID2() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.coded.uICodedTable,
					BaseData.getSettingsModuleValue("CodeID2"));
			Playback.threadWait(60000);
		}

		public void enterAtCodeID1() {
			uIMapSettings.coded.uICodeIDEdit.click();
			uIMapSettings.coded.uICodeIDEdit.clear();
			uIMapSettings.coded.uICodeIDEdit.sendKeys(BaseData.getSettingsModuleValue("CodeID1"));
		}

		public void enterAtCodeID2() {
			uIMapSettings.coded.uICodeIDEdit.click();
			uIMapSettings.coded.uICodeIDEdit.clear();
			uIMapSettings.coded.uICodeIDEdit.sendKeys(BaseData.getSettingsModuleValue("CodeID2"));
		}

		public void selectAtMJCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.coded.uIMJCategoryComboBox,
					BaseData.getSettingsModuleValue("MJCategory"));
		}

		public void selectAtMJCategory1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.coded.uIMJCategoryComboBox,
					BaseData.getSettingsModuleValue("MJCategory1"));
		}

	}

	// region Maintain Code Value Action Class
	public class MaintainCodeValue {

		public void clickAddNewButton() {
			uIMapSettings.maintainCodeValue.uIAddNewButton.click();
		}

		public void enterAtPopUpCodeValue() {
			uIMapSettings.maintainCodeValue.uIPopUpCodeValueEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue"));
		}

		public void enterAtPopUpDescription() {
			uIMapSettings.maintainCodeValue.uIPopUpDescriptionEdit
					.sendKeys(BaseData.getSettingsModuleValue("Description"));
		}

		public void clickPopUpCancelButton() {
			uIMapSettings.maintainCodeValue.uIPopUpCancelButton.click();
		}

		public void selectAtItemType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.maintainCodeValue.uIItemTypeComboBox,
					BaseData.getSettingsModuleValue("ItemType"));
		}

		public void selectAtPanelType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.maintainCodeValue.uIPanelTypeComboBox, BaseData.getSettingsModuleValue("PanelType"));
		}

		public void selectAtItemCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.maintainCodeValue.uIItemCategoryComboBox,
					BaseData.getSettingsModuleValue("ItemCategory"));
		}

		public void selectAtInventoryType() {
			uIMapSettings.maintainCodeValue.uIInventoryTypeRadArrow.click();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectRadControlDropDownCheckBoxes(
					uIMapSettings.maintainCodeValue.uIInventoryTypeRadComboBox,
					BaseData.getSettingsModuleValue("InventoryType"));
			Playback.gridLoadThreadWait();
			uIMapSettings.maintainCodeValue.uIInventoryTypeRadArrow.click();
		}

		public void clickAddButton() {
			uIMapSettings.maintainCodeValue.uIAddButton.click();
		}

		public void closeTheScreen() {
			Playback.driver.close();
		}

		public void enterAtCodeValue() {
			Playback.threadWait();
			Playback.waitForControlReady();
			uIMapSettings.maintainCodeValue.uICodeValueEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue"));
		}

		public void enterAtDescription() {

			uIMapSettings.maintainCodeValue.uICodeValueDesEdit.sendKeys(BaseData.getSettingsModuleValue("Description"));
		}

		public void clickSearchButton() {
			uIMapSettings.maintainCodeValue.uISearchButton.click();
			Playback.threadWait(2000);
		}

		public void verifyAtCodeValueInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeValue"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable,
									BaseData.getSettingsModuleValue("CodeValue"))
							.getText());
		}

		public void clickSystemCheckBox() {
			uIMapSettings.maintainCodeValue.uISystemCheckBox.click();
		}

		public void enterSortOrder() {
			uIMapSettings.maintainCodeValue.uISortOrderEdit.sendKeys(String.valueOf(Randomized.getRandomNumber(1)));
		}

		public void clickRowByCodeValue(int rowIndex) {
			WebElement element = objectIdentification.manualIdentify
					.getGridCell(uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable, "Code Value", rowIndex);
			element.click();
		}

		public void clickRowByAtCodeValue() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable,
					BaseData.getSettingsModuleValue("CodeValue"));
		}

		public void clickEnableFeesTabCheckbox() {
			uIMapSettings.maintainCodeValue.uIEnableFeesTabCheckbox.click();
		}

		public void enterAtURL() {
			uIMapSettings.maintainCodeValue.uIURLEdit.sendKeys(BaseData.getSettingsModuleValue("URL"));
		}

		public void selectAsGooglePlus() {
			uIMapSettings.maintainCodeValue.uISocialIconInputComboBox.click();
			// uIMapSettings.sharedCodes.uISocialIconDropdownList.sendKeys("google-plus");
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapSettings.maintainCodeValue.uISocialIconDropdownList, "google-plus");
		}

		public void verifyAtCodedID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeID"),
					uIMapSettings.maintainCodeValue.uICodeIDEdit.getAttribute("value"));
		}

		public void verifyAtCodeValueDescription(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable, "Code Value Description",
							rowIndex));
		}

		public void verifySystemCheckBoxChecked(int rowIndex) {
			WebElement SystemCheckBox = objectIdentification.manualIdentify
					.getGridCell(uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable, "System", rowIndex)
					.findElement(By.tagName("img"));
			// verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getChekboxCheckedStatus(SystemCheckBox));
			verify.ExpectedValueIsTrue(SystemCheckBox.getAttribute("alt").contains("Checked"));
		}

		public void verifyDivisionEnabled() {
			Playback.gridLoadThreadWait();
			verify.ExpectedValueIsTrue(uIMapSettings.maintainCodeValue.uIDivisionComboBox.isEnabled());
		}

		public void verifyDivisionDisabled() {
			Playback.gridLoadThreadWait();
			verify.ExpectedValueIsTrue(uIMapSettings.maintainCodeValue.uIDivisionComboBox.getAttribute("class")
					.contains("SELECTInActive"));
		}

		public void verifyCodeIDAs1105() {
			verify.ExpectedPropertyValueIsEqual("1105",
					uIMapSettings.maintainCodeValue.uICodeIDEdit.getAttribute("value"));
		}

		public void verifyCodeIDAs2016() {
			verify.ExpectedPropertyValueIsEqual("2016",
					uIMapSettings.maintainCodeValue.uICodeIDEdit.getAttribute("value"));
		}

		public void verifyCodeIDAs2001() {
			verify.ExpectedPropertyValueIsEqual("2001",
					uIMapSettings.maintainCodeValue.uICodeIDEdit.getAttribute("value"));
		}

		public void verifyCodeIDAs2006() {
			verify.ExpectedPropertyValueIsEqual("2006",
					uIMapSettings.maintainCodeValue.uICodeIDEdit.getAttribute("value"));
		}

		public void verifyCodeIDAs3026() {
			verify.ExpectedPropertyValueIsEqual("3026",
					uIMapSettings.maintainCodeValue.uICodeIDEdit.getAttribute("value"));
		}

		public void verifyCodeIDAs3021() {
			verify.ExpectedPropertyValueIsEqual("3021",
					uIMapSettings.maintainCodeValue.uICodeIDEdit.getAttribute("value"));
		}

		public void selectJurisAsBL() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.maintainCodeValue.uIJurisComboBox,
					"BL - BigLake Police Department");
		}

		public void selectJurisAsBE() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.maintainCodeValue.uIJurisComboBox,
					"BE - Becker Police Department");
		}

		public void enterAtCodeValue1() {
			Playback.threadWait();
			Playback.waitForControlReady();
			uIMapSettings.maintainCodeValue.uICodeValueEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue1"));
		}

		public void enterAtCodeValue2() {
			Playback.threadWait();
			Playback.waitForControlReady();
			uIMapSettings.maintainCodeValue.uICodeValueEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue2"));
		}

		public void verifyAtCodeValue1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeValue1"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable, "Code Value",
									rowIndex)
							.getText());
		}

		public void selectJurisAsSO() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.maintainCodeValue.uIJurisComboBox,
					"SO - Phoenix Police Department");
		}

		public void verifyAtCodeValue2InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeValue2"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable, "Code Value",
									rowIndex)
							.getText());
		}

		public void verifyAtShowOnWhiteboardCheckboxLabel() {
			String text = uIMapSettings.maintainCodeValue.uIShowOnWhiteboardLabel.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getSettingsModuleValue("Title")));
		}

		public void verifyJurisEnabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.coded.uIJurisComboBox.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapSettings.coded.uIJurisComboBox.isEnabled());
		}

		public void verifyJurisDisabled() {
			String attribute = uIMapSettings.coded.uIJurisComboBox.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(attribute, "true");
		}
	}

	public class JailCell {
		public void clickAddNew() {
			uIMapSettings.jailCell.uIAddNewButton.click();
		}

		public void verifyCellNoExistsInGridColumn() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapSettings.jailCell.uIJailCellResultTable, "Cell#")
					.contains(BaseData.getSettingsModuleValue("CellNo")));
		}

		public void verifyNotesExistsInGridColumn() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapSettings.jailCell.uIJailCellResultTable, "Notes")
					.contains(BaseData.getSettingsModuleValue("Notes")));
		}

	}

	public class JailCellHelpWindow {
		public void verifyRowByAtNotes() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Notes"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapSettings.jailCell.uIJailCellResultTable, "Notes", 3));
		}

		public void closeJailCellPopupScreen() {
			uIMapSettings.jailCellHelpWindow.driver.close();
		}

	}

	public class JailCellEntry {
		public void selectAtFacility() {
			uIMapSettings.jailCellEntry.uIFacilityComboBox.sendKeys(BaseData.getSettingsModuleValue("Facility"));
		}

		public void enterAtCellNo() {
			uIMapSettings.jailCellEntry.uICellNoEdit.sendKeys(BaseData.getSettingsModuleValue("CellNo"));
		}

		public void selectAtCellType() {
			uIMapSettings.jailCellEntry.uICellTypeComboBox.sendKeys(BaseData.getSettingsModuleValue("CellType"));
		}

		public void enterAtCapacity() {
			uIMapSettings.jailCellEntry.uICapacityEdit.sendKeys(BaseData.getSettingsModuleValue("Capacity"));
		}

		public void enterAtNotes() {
			uIMapSettings.jailCellEntry.uINotesEdit.sendKeys(BaseData.getSettingsModuleValue("Notes"));
		}

		public void clickSaveButton() {
			uIMapSettings.jailCellEntry.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapSettings.jailCellEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNCloseScreen() {
			uIMapSettings.jailCellEntry.uISaveandCloseButton.click();
			popup.confirm.yes();
		}

		public void closeScreen() {
			uIMapSettings.jailCellEntry.driver.close();
		}

		public void verifyFooterStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapSettings.jailCellEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1002 - Addition Successful"));
		}

		public void verifyJailCellScreenDisplayed() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("AssignCellNo"),
					uIMapSettings.jailCellEntry.uICellNoEdit.getAttribute("value"));
		}

		public void verifyBarcodeIsDisplayed() {
			uIMapSettings.jailCellEntry.uIIbarJailItem.isDisplayed();
			
		}

		
	}

	public class RepositoryEntry {
		public void selectFieldUsageAsHide() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.repositoryEntry.uIFieldUsageComboBox,
					"Hide");
		}

		public void selectFieldUsageAsShow() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.repositoryEntry.uIFieldUsageComboBox,
					"Show");
		}

		public void selectFieldUsageAsMandatory() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.repositoryEntry.uIFieldUsageComboBox,
					"Mandatory");
		}

		public void saveScreen() {
			uIMapSettings.repositoryEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapSettings.repositoryEntry.uISaveandCloseButton.click();
			popup.confirm.yes();
		}

		public void closeScreen() {
			uIMapSettings.repositoryEntry.driver.close();
		}

		public void enterWantChargeCustomName() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.sendKeys("Charge");
		}

		public void enterAtCustomName() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.sendKeys(BaseData.getSettingsModuleValue("CustomName"));

		}

		public void enterAtCustomName1() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.sendKeys(BaseData.getSettingsModuleValue("CustomName1"));

		}

		public void clearCustomName() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.click();
			uIMapSettings.repositoryEntry.uICustomNameEdit.clear();

		}

		public void enterSectionAsSEC() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.sendKeys("SEC");
		}

		public void enterDivisionAsDIV() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.sendKeys("DIV");
		}

		public void enterSquadAsSQ() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.sendKeys("SQ");
		}

		public void enterAtCustomName2() {
			uIMapSettings.repositoryEntry.uICustomNameEdit.sendKeys(BaseData.getSettingsModuleValue("CustomName2"));

		}

		public void verifyAtRepositoryID() {
			String attribute = uIMapSettings.repositoryEntry.uIRepositoryIDEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getSettingsModuleValue("RepositoryID")));
		}

		public void verifyAtDefaultName() {
			String attribute = uIMapSettings.repositoryEntry.uIDefaultNameEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getSettingsModuleValue("DefaultName")));
		}
	}

	public class RoleEntry {

		public void verifyAtRoleName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("RoleName"),
					uIMapSettings.rolesEntry.uIRoleNameEdit.getAttribute("value"));
		}

		public void close() {
			uIMapSettings.rolesEntry.driver.close();
		}

	}

	public class CustomFieldsScreen {
		public void verifyScreenID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ScreenID"),
					uIMapSettings.customFieldsScreen.uIScreenIDEdit.getAttribute("value"));
		}

		public void verifyScreenIDDescription() {
			String text = uIMapSettings.customFieldsScreen.uIScreenIDDescription.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(text, BaseData.getSettingsModuleValue("ScreenIDDescription"));
		}

		public void enterAtCustomTable() {
			uIMapSettings.customFieldsScreen.uICustomTableEdit.sendKeys("Auto");
		}

		public void enterTabName() {
			uIMapSettings.customFieldsScreen.uITabNameEdit.sendKeys("TeamWork");
		}

		public void saveScreen() {
			uIMapSettings.customFieldsScreen.uISaveButton.click();
		}

		public void closeTheScreen() {
			Playback.driver.close();
		}

		public void clickAddNewFieldButton() {
			uIMapSettings.customFieldsScreen.uIAddNewFieldButton.click();
		}

		public void enterDisplayName() {
			uIMapSettings.customFieldsScreen.uIPopupDisplayNameEdit.sendKeys("Automation");
		}

		public void enterColumnName() {
			uIMapSettings.customFieldsScreen.uIPopupColumnNameEdit.sendKeys("Team");
		}

		public void enterDescription() {
			uIMapSettings.customFieldsScreen.uIPopupDescriptionNameEdit.sendKeys(
					"Automation or automatic control, is the use of various control systems for operating equipment such as machinery, processes in factories, boilers and heat treating ovens, switching on telephone networks");
		}

		public void selectDataTypeAsSingleLine() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.customFieldsScreen.uIPopupDataTypeComboBox, "Single Line or Text");
		}

		public void selectFormat() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.customFieldsScreen.uIPopupFormatComboBox);
		}

		public void selectFormatAsText() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.customFieldsScreen.uIPopupFormatComboBox, "Text");
		}

		public void enterMaximumLength() {
			uIMapSettings.customFieldsScreen.uIPopupMaxLengthEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterMaximumLengthAs50() {
			uIMapSettings.customFieldsScreen.uIPopupMaxLengthEdit.sendKeys("50");
		}

		public void enterGroupName() {
			uIMapSettings.customFieldsScreen.uIPopupGroupNameEdit.sendKeys("AutoMation TeamWork");
		}

		public void selectNumberofColumnRadioButton() {
			uIMapSettings.customFieldsScreen.uIPopupOneColumnRadioButton.click();
		}

		public void enterLineNumberWithinGroup() {
			uIMapSettings.customFieldsScreen.uIPopupLineNumberWithinGroupEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumber()));
		}

		public void selectColumnRadioButton() {
			uIMapSettings.customFieldsScreen.uIPopupTwoRadioButton.click();
		}

		public void clickAddButton() {
			uIMapSettings.customFieldsScreen.uIPopupAddButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyDisplayNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridTableRow(uIMapSettings.customFieldsScreen.uICustomFieldResultTable, rowIndex).getText(),
					"Automation TeamWork");
		}

		public void verifyDataTypeAsSingleLineOrText(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridTableRow(uIMapSettings.customFieldsScreen.uICustomFieldResultTable, rowIndex).getText(),
					"Single Line of Text");
		}

		public void verifyLengthAs50(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridTableRow(uIMapSettings.customFieldsScreen.uICustomFieldResultTable, rowIndex).getText(),
					"50");
		}

		public void verifyBottomStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapSettings.customFieldsScreen.uIBottomLeftSideStatusBar.getText()
					.contains("1002 - Addition Successful"));
		}

		public void verifyRowTextDisplayedInGreenColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapSettings.customFieldsScreen.uICustomFieldResultTable, "50")
					.getAttribute("class").contains("gridrowclr"));
		}

		public void clickRepublishButton() {
			uIMapSettings.customFieldsScreen.uIPublishButton.click();
			Playback.pageLoadThreadWait();
		}

		public void verifyRepublishButtonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.customFieldsScreen.uIPublishButton.getAttribute("disabled").contains("true"));
		}

	}

	public class Roles {

		public void clickSearchButton() {
			uIMapSettings.roles.uISearchButton.click();

		}

		public void verifyAtRoleNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("RoleName"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.roles.uIRolesResultTable,
							BaseData.getSettingsModuleValue("RoleName")).getText());
		}

		public void rightClickByAtRoleName() {
			Actions action = new Actions(Playback.driver);
			WebElement row = objectIdentification.manualIdentify.getGridCell(uIMapSettings.roles.uIRolesResultTable,
					BaseData.getSettingsModuleValue("RoleName"));
			action.contextClick(row).perform();

		}

		public void verifyRightClickCopyRoleDisabled() {
			WebElement CopyRole = objectIdentification.manualIdentify.getContextMenuItemInTheGridRow(
					uIMapSettings.roles.uIRolesResultTable, BaseData.getSettingsModuleValue("RoleName"), "Role Name");
			verify.ExpectedValueIsTrue(CopyRole.getAttribute("unselectable").toString().contains("on"));
		}

		public void verifyCopyRoleLinkDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.roles.uICopyRoleButton.getAttribute("unselectable").contains("on"));
		}

		public void verifyCopyRoleEnabled() {
			WebElement CopyRole = objectIdentification.manualIdentify.getSettingsRolesContextMenuItemInTheGridRow(
					uIMapSettings.roles.uIRolesResultTable, BaseData.getSettingsModuleValue("RoleName"), "Copy Role");
			verify.ExpectedValueIsTrue(CopyRole.isEnabled());
		}

		public void clickCopyRoleInGrid() {
			WebElement CopyRole = objectIdentification.manualIdentify.getSettingsRolesContextMenuItemInTheGridRow(
					uIMapSettings.roles.uIRolesResultTable, BaseData.getSettingsModuleValue("RoleName"), "Copy Role");
			CopyRole.click();
		}

		public void selectAtRoleRowCheckBox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapSettings.roles.uIRolesResultTable, BaseData.getSettingsModuleValue("RoleName"));
		}

		public void verifyAtRoleInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("RoleName"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapSettings.roles.uIRolesResultTable,
							"Role Name", rowIndex));
		}

		public void enterAtRoleName() {
			uIMapSettings.roles.uIRoleNameEdit.sendKeys(BaseData.getSettingsModuleValue("RoleName"));
		}

		public void clickSearch() {
			uIMapSettings.roles.uISearchButton.click();
		}

		public void clickCopyRoleLink() {
			uIMapSettings.roles.uICopyRoleButton.click();
		}

		public void selectRowAtRoleName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.roles.uIRolesResultTable,
					BaseData.getSettingsModuleValue("RoleName"));
		}

		public void selectRowAtRoleName1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.roles.uIRolesResultTable,
					BaseData.getSettingsModuleValue("RoleName1"));
		}

		public void verifyNoRecordsFound() {
			popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");

		}

		public void enterAtRoleName1() {
			uIMapSettings.roles.uIRoleNameEdit.clear();
			uIMapSettings.roles.uIRoleNameEdit.sendKeys(BaseData.getSettingsModuleValue("RoleName1"));
		}

		public void verifyCopyToSameJurisIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.roles.uICopyToSameJurisButton.isEnabled());
		}

		public void verifyCopyToMultiJurisIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.roles.uICopyToMultiJurisButton.isEnabled());
		}

		public void selectAtRoleRowCheckBoxByIndex(int rowIndex) {
			objectIdentification.manualIdentify
					.getGridRowCheckBoxByIndex(uIMapSettings.roles.uIRolesResultTable, rowIndex).click();
		}

		public void clickCopyToSameJuris() {
			uIMapSettings.roles.uICopyToSameJurisButton.click();

		}

		public void clickCopyToMultiJuris() {
			uIMapSettings.roles.uICopyToMultiJurisButton.click();

		}

		public void enterAtCopyRoleName() {

			uIMapSettings.roles.uIRoleNameEdit.clear();
			uIMapSettings.roles.uIRoleNameEdit.sendKeys(BaseData.getSettingsModuleValue("CopyRoleName"));
		}

		public void verifyAtCopyRoleNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CopyRoleName"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.roles.uIRolesResultTable,
							BaseData.getSettingsModuleValue("CopyRoleName")).getText());

		}

		public void selectAtJurisAsBC() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.roles.uIJurisDropdown,
					"BC - Brown County Police Department");

		}

		public void selectAtJurisAsPX() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.roles.uIJurisDropdown,
					"PX - ProPhoenix");

		}

		public void enterAtRoleName2() {
			uIMapSettings.roles.uIRoleNameEdit.clear();
			uIMapSettings.roles.uIRoleNameEdit.sendKeys(BaseData.getSettingsModuleValue("RoleName2"));

		}

		public void verifyAtRoleName2InGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("RoleName2"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.roles.uIRolesResultTable,
							BaseData.getSettingsModuleValue("RoleName2")).getText());

		}

		public void verifyAtRoleName1InGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("RoleName1"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.roles.uIRolesResultTable,
							BaseData.getSettingsModuleValue("RoleName1")).getText());
		}

		public void selectAtRoleNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.roles.uIRolesResultTable, BaseData.getSettingsModuleValue("RoleName"));
			Playback.pageLoadThreadWait();

			
		}
	}

	public class FTPInterfaceSearch {
		public void clickAddButton() {
			uIMapSettings.fTPInterfaceSearch.uIAddNewButton.click();
		}

		public void selectAtInterface() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.fTPInterfaceSearch.uIInterfaceComboBox, BaseData.getSettingsModuleValue("Interface"));
		}

		public void clickSearch() {
			uIMapSettings.fTPInterfaceSearch.uISearchButton.click();
		}

		public void verifyAtInterfaceInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Interface"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.fTPInterfaceSearch.uIFTPInterfaceResultTable, "Interface", rowIndex));
		}
	}

	public class FTPInterfaceEntry {
		public void selectAtInterface() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.fTPInterfaceEntry.uIInterfaceComboBox, BaseData.getSettingsModuleValue("Interface"));
		}

		public void selectDBName() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.fTPInterfaceEntry.uIDBNameComboBox,
					"PoliceNJAutomation");
		}

		public void enterFolderPath() {
			uIMapSettings.fTPInterfaceEntry.uIFolderPAthEdit.sendKeys("ftp.prophoenix.com");
		}

		public void enterUserName() {
			uIMapSettings.fTPInterfaceEntry.uIUserNameEdit.sendKeys("Phoenix");
		}

		public void enterPassword() {
			uIMapSettings.fTPInterfaceEntry.uIPasswordEdit.sendKeys("ProPhoenix");
		}

		public void enterPort() {
			uIMapSettings.fTPInterfaceEntry.uIPortEdit.sendKeys("8888");
		}

		public void selectLocationType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.fTPInterfaceEntry.uILocationTypeComboBox);
		}

		public void enterCustom1() {
			Playback.controlReadyThreadWait();
			uIMapSettings.fTPInterfaceEntry.uICustom1Edit.click();
			uIMapSettings.fTPInterfaceEntry.uICustom1Edit.sendKeys(Randomized.randomString(15));
		}

		public void enterKeepLog() {
			uIMapSettings.fTPInterfaceEntry.uIKeepLogEdit.sendKeys(String.valueOf(Randomized.getRandomNumbers(2)));
		}

		public void selectType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapSettings.fTPInterfaceEntry.uITypeComboBox);
		}

		public void selectNonPeakHrs() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.fTPInterfaceEntry.uINonPeakHrsComboBox);
		}

		public void enterFrom() {
			uIMapSettings.fTPInterfaceEntry.uIFromEdit.sendKeys("Support@prophoenix.com");
		}

		public void enterTo() {
			uIMapSettings.fTPInterfaceEntry.uIToEdit.sendKeys("AutoTeam@prophoenix.com");
		}

		public void enterSubject() {
			uIMapSettings.fTPInterfaceEntry.uIFromEdit.sendKeys("Automation");
		}

		public void saveScreen() {
			uIMapSettings.fTPInterfaceEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void closeScreen() {
			uIMapSettings.fTPInterfaceEntry.driver.close();
		}

		public void clickCustom1Text() {
			uIMapSettings.fTPInterfaceEntry.uICustom1TextView.click();
		}

		public void verifyCustom1Disabled() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.fTPInterfaceEntry.uICustom1Edit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCustom1Mandatory() {
			verify.ExpectedValueIsTrue(uIMapSettings.fTPInterfaceEntry.uICustom1TextView.getAttribute("kpifieldusage")
					.contains("Mandatory"));

		}
	}

	public class UnitsScreen {
		public void enterAtUnit() {
			uIMapSettings.unitsScreen.uIUnitEdit.sendKeys(BaseData.getSettingsModuleValue("Unit"));
		}

		public void clickSearch() {
			uIMapSettings.unitsScreen.uISearchButton.click();
		}

		public void clickIncludeInactiveCheckBox() {
			uIMapSettings.unitsScreen.uIIncludeInactiveCheckBox.click();
		}

		public void verifyAtUnitInRow(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Unit"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapSettings.unitsScreen.uIUnitResultTable, "Unit", rowIndex));
		}

		public void clickUnitInGridRow() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.unitsScreen.uIUnitResultTable, BaseData.getSettingsModuleValue("Unit"));
		}

		public void clickAddnew() {
			uIMapSettings.unitsScreen.uIAddNewButton.click();
		}

		public void verifyNoRecordAcknowledgeMessgage() {
			// if (Playback.browserType == "Chrome")
			// popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			// else
			popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void enterAtOfficer() {
			uIMapSettings.unitsScreen.uIOfficerCodeEdit.sendKeys(BaseData.getSettingsModuleValue("Officer"));
		}

		public void verifyTrackCheckBoxChecked(int rowIndex) {
			WebElement TrackCheckBox = objectIdentification.manualIdentify
					.getGridCell(uIMapSettings.unitsScreen.uIUnitResultTable, "Track", rowIndex)
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(TrackCheckBox.getAttribute("alt").contains("Checked"));
		}

		public void selectAtPatrolArea() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.unitsScreen.uIPatrolAreaComboBox,
					BaseData.getSettingsModuleValue("PatrolArea"));
		}

		public void verifyInactiveCheckBoxChecked(int rowIndex) {
			WebElement InactiveCheckBox = objectIdentification.manualIdentify
					.getGridCell(uIMapSettings.unitsScreen.uIUnitResultTable, "Inactive", rowIndex)
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(InactiveCheckBox.getAttribute("alt").contains("Checked"));
		}

		public void verifyInactiveUnitRowColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapSettings.unitsScreen.uIUnitResultTable, rowIndex).getAttribute("class")
					.contains("GrayCss"));
		}
	}

	public class UnitEntry {
		public void enterAtUnit() {
			uIMapSettings.unitEntry.uIUnitEdit.sendKeys(BaseData.getSettingsModuleValue("Unit"));
		}

		public void enterVehicle() {
			uIMapSettings.unitEntry.uIDefaultVehicleCodeEdit.sendKeys("");
			uIMapSettings.unitEntry.uIDefaultVehicleCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickOnDutyNoReqCheckBox() {
			uIMapSettings.unitEntry.uIOnDutyNotReqCheckBox.click();
		}

		public void enterAtOnCallOfficer() {
			uIMapSettings.unitEntry.uIOnCallOfficerCodeEdit.sendKeys(BaseData.getSettingsModuleValue("OnCallOfficer"));
		}

		public void selectDispatchUnit() {
			uIMapSettings.unitEntry.uIDispatchUnitLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void clickInactiveCheckBox() {
			uIMapSettings.unitEntry.uIInActiveCheckBox.click();
		}

		public void selectPatrolAreaAsPatrolZone() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.unitEntry.uIPatrolAreaComboBox,
					"Patrol Zone");
		}

		public void selectPatrolAreaAsPatrolZone1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.unitEntry.uIPatrolAreaComboBox,
					"Patrol Zone1");
		}

		public void clickPatrolZone1InGrid() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapSettings.unitEntry.uIPatrolAreaResultTable, "Patrol Zone1");
		}

		public void clickAdd() {
			uIMapSettings.unitEntry.uIAddButton.click();
		}

		public void verifyRecordExistAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1046) Record already exists");
		}

		public void verifyPatrolZoneAddedGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Patrol Zone", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.unitEntry.uIPatrolAreaResultTable, "Patrol Area", rowIndex));
		}

		public void verifyInactiveDate() {
			verify.ExpectedValueIsTrue(uIMapSettings.unitEntry.uIInActiveDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));
		}

		public void saveScreen() {
			uIMapSettings.unitEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void close() {
			uIMapSettings.unitEntry.driver.close();
		}

		public void verifyPatrolZone1() {
			verify.ExpectedPropertyValueIsEqual("Patrol Zone1", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapSettings.unitEntry.uIPatrolAreaComboBox));
		}

		public void clickSaveButton() {
			uIMapSettings.unitEntry.uISaveButton.click();
		}

		public void verify1018RequiredEntriesAreMissingAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void selectAtDispatchUnitType() {
			uIMapSettings.unitEntry.uIDispatchUnitLookupButton.click();
//			popup.kPICodedLookup.kPIHelpSelect(BaseData.getSettingsModuleValue("DispatchUnitType"));
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.unitEntry.uIDispatchUnitLookupButton,
					BaseData.getSettingsModuleValue("DispatchUnitType"));
		}

		public void verifyOnCallOfficerFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.unitEntry.uIOnCallOfficerCodeEdit.getAttribute("class").contains("textboxInactive"),
					"Verify On call Officer fields disabled");
		}

		public void verifyOnCallOfficerFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.unitEntry.uIOnCallOfficerCodeEdit.getAttribute("class").contains("textbox"),
					"Verify On call Officer fields Enabled");
		}

		public void verifyPreAssignOfficer1FieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.unitEntry.uIPreAssignOfficer1CodeEdit.getAttribute("class")
					.contains("textboxInactive"), "Verify PreAssign Officer1 fields disabled");
		}

		public void verifyPreAssignOfficer2FieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.unitEntry.uIPreAssignOfficer2CodeEdit.getAttribute("class")
					.contains("textboxInactive"), "Verify PreAssign Officer2 fields disabled");
		}

		public void clickIsTrackableCheckBox() {
			uIMapSettings.unitEntry.uIIsTrackableCheckBox.click();
		}

		public void selectWDAGroup() {
			uIMapSettings.unitEntry.uIWDAGroupLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectAtPatrolArea() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.unitEntry.uIPatrolAreaComboBox,
					BaseData.getSettingsModuleValue("PatrolArea"));
		}

		public void selectCustomIcon() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapSettings.unitEntry.uICustomIconComboBox);
		}

		public void verify1002AdditionSuccessfulMessage() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapSettings.unitEntry.uIBottomMesssageTextView.getText(),
					"verify 1002 addition successful message is displayed");
		}

		public void ClickDeleteIcon() {
			uIMapSettings.unitEntry.uIDeleteIcon.click();
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");

		}

		public void verifyMutualAidUnitIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapSettings.unitEntry.uIMutualAidUnitLabel.isDisplayed());
		}

		public void clickMutualAidUnitCheckBox() {
			uIMapSettings.unitEntry.uIMutualAidUnitCheckBox.click();
		}

		public void verifyMutualAidUnitCheckBoxIsChecked() {
			verify.ExpectedValueIsTrue(uIMapSettings.unitEntry.uIMutualAidUnitCheckBox.isSelected());
		}
	}

	public class RolesEntry {

		public RolesEntry() {
			if (rolesEntryPermissionWindow == null)
				rolesEntryPermissionWindow = new RolesEntryPermissionWindow();
		}

		public RolesEntryPermissionWindow rolesEntryPermissionWindow;

		public void clickOverRideSelectAllCheckBox() {
			uIMapSettings.rolesEntry.uISelectAllOverrideCheckBox.click();
		}

		public void clickSaveButton() {
			uIMapSettings.rolesEntry.uISaveButton.click();
		}

		public void verifyOverRideConfirmMessage() {
			if (Playback.browserType.contains("Chrome"))
				popup.confirm.yesWithExpectedMessage("(1164) Do you want to override the Role?");
			else
				popup.confirm.yesWithExpectedMessage("(1164) Do you want to override the Role?");
			Playback.gridLoadThreadWait();
		}

		public void verifyRoleInactiveConfirmMessage() {
			if (Playback.browserType.contains("Chrome"))
				popup.confirm.noWithExpectedMessage(
						"(2000) This role is inactive in the other Juris. Do you still want to make this role active in the other Juris? Clicking the Cancel button will override and keep the role status in the other Juris as is.");
			else
				popup.confirm.noWithExpectedMessage(
						"(2000) This role is inactive in the other Juris. Do you still want to make this role active in the other Juris? Clicking the Cancel button will override and keep the role status in the other Juris as is.");
		}

		public void save() {

			uIMapSettings.rolesEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyAtRoleName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("RoleName"),
					uIMapSettings.rolesEntry.uIRoleNameEdit.getAttribute("value"));
		}

		public void close() {
			uIMapSettings.rolesEntry.driver.close();
		}

		public void verifyDeleteIconEnabledToClick() {
			verify.ExpectedValueIsTrue(uIMapSettings.rolesEntry.uIDeleteButton.isEnabled());

		}

		public void enterAtScreenID() {
			uIMapSettings.rolesEntry.uIScreenIDedit.sendKeys(BaseData.getSettingsModuleValue("ScreenID"));
			Playback.waitForControlReady();

		}

		public void clickSearchButton() {
			uIMapSettings.rolesEntry.uISearchButton.click();
			Playback.waitForControlReady();

		}

		public void verifyDeleteCheckBoxCheckedForLoginUser() {
			verify.ExpectedValueIsTrue(uIMapSettings.rolesEntry.uIDeleteCheckBoxInGridTable.isSelected());
			Playback.waitForControlReady();

		}

		public void mouseHoverOnDeleteIconAndVerifyDeleteRole() {
			Playback.actionDriver.moveToElement(uIMapSettings.rolesEntry.uIDeleteButton).build().perform();

			String Actual = uIMapSettings.rolesEntry.uIDeleteButton.getAttribute("title");

			verify.ExpectedPropertyValueIsEqual("Delete Role", Actual);
		}

		public void clickDeleteIcon() {
			uIMapSettings.rolesEntry.uIDeleteButton.click();

		}

		public void verifyDeleteCheckBoxNotCheckedForLoginUser() {
			verify.ExpectedValueIsFalse(uIMapSettings.rolesEntry.uIDeleteCheckBoxInGridTable.isSelected());
			Playback.waitForControlReady();

		}

		public void verifyDeleteIconNotEnabledToClick() {
			verify.ExpectedValueIsFalse(uIMapSettings.rolesEntry.uIDeleteButton.isEnabled());

		}

		public void mouseHoverOnDeleteIconAndVerifyDeleteRoleNotAllowed() {
			Playback.actionDriver.moveToElement(uIMapSettings.rolesEntry.uIDeleteButton).build().perform();

			String Actual = uIMapSettings.rolesEntry.uIDeleteButton.getAttribute("title");

			verify.ExpectedPropertyValueIsEqual("Deletion not allowed. Role assigned to Personnel", Actual);

		}

		public void enterAtCopyRoleName() {

			uIMapSettings.rolesEntry.uICopyRoleNameEdit.sendKeys(BaseData.getSettingsModuleValue("CopyRoleName"));
		}

		public void enterAtCopyRoleNameDescription() {
			uIMapSettings.rolesEntry.uICopyRoleDescriptionEdit
					.sendKeys(BaseData.getSettingsModuleValue("CopyRoleDescription"));

		}

		public void clickCopyNameSelectAllCheckbox() {
			uIMapSettings.rolesEntry.uISelectAllCopyRoleCheckBox.click();

		}

		public void clickSaveNClose() {

			uIMapSettings.rolesEntry.uISaveandCloseButton.click();

		}

		public void verifyCopyRoleConfirmMessage() {
			if (Playback.browserType.contains("Chrome"))
				popup.confirm.yesWithExpectedMessage("(1163) Do you want to copy the role in the selected agency?");
			else
				popup.confirm.yesWithExpectedMessage("(1163) Do you want to copy the role in the selected agency?");
			Playback.gridLoadThreadWait();
		}

		public void clickAlarmEntryEditPermission() {
			uIMapSettings.rolesEntry.uIAlarmEntryEditPermissionButton.click();
		}

		public void switchToRolesEntryScreenPermissionWindow() {
			objectIdentification.windowHandle.switchToWindow("frmScreenPermission");
		}

		public void clickAlarmsEditPermissionButton() {
			uIMapSettings.rolesEntry.uIAlarmsEditPermissionButton.click();
		}

		public class RolesEntryPermissionWindow {

			public void clickSelectAllCheckBox() {
				uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uISelectAllCheckBox.click();
			}

			public void verifyDeleteCheckBoxSelected(int rowIndex) {

				WebElement columnCell = objectIdentification.manualIdentify.getGridCell(
						uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uIScreenPermissionGridTable, "Delete",
						rowIndex);

				boolean result = columnCell.findElement(By.tagName("input")).isSelected();

				verify.ExpectedValueIsTrue(result);

			}

			public void clickSave() {
				uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uIsaveButton.click();
				Playback.pageLoadThreadWait();
			}

			public void closeScreen() {
				uIMapSettings.rolesEntry.rolesEntryPermissionWindow.driver.close();
			}

			public void enterAtScreenName() {
				uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uIScreenNameedit
						.sendKeys(BaseData.getSettingsModuleValue("ScreenName"));
				uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uIScreenNameedit.sendKeys(Keys.TAB);
			}

			public void clickSearchButton() {
				uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uISearchButton.click();
			}

			public void verifyChangeCheckBoxSelected(int rowIndex) {

				WebElement columnCell = objectIdentification.manualIdentify.getGridCell(
						uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uIScreenPermissionGridTable, "Change",
						rowIndex);
				boolean result = columnCell.findElement(By.tagName("input")).isSelected();
				verify.ExpectedValueIsTrue(result);

			}

			public void clickInvoiceEntryDeleteCheckBox() {

				WebElement columnCell = Playback.driver.findElement(
						By.xpath("//td[text()='Invoice Entry']/..//input[@id='grdScreenPermission_it14_3_CRemove']"));

				if (columnCell.isEnabled() && columnCell.isSelected()) {
					columnCell.click();
				}

			}

			public void clickSaveNClose() {
				uIMapSettings.rolesEntry.rolesEntryPermissionWindow.uIsaveButton.click();
				Playback.pageLoadThreadWait();
			}
		}

		public void clickTrafficEditPermissionButton() {
			uIMapSettings.rolesEntry.uITrafficEditPermissionButton.click();
		}

		public void clickReportRepositoryEntryEditPermissionButton() {
			uIMapSettings.rolesEntry.uIReportRepositoryEntryEditPermissionButton.click();
		}
		public void clickAccountingEditPermissionButton() {
			uIMapSettings.rolesEntry.uIAccountingEditPermissionButton.click();
		}

public void clickAtAddNewCheckbox() {
			uIMapSettings.rolesEntry.uIAddNewCheckBox.click();
			
		}
		
		public void clickAtCheckBoxInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapSettings.rolesEntry.uISearchResultTable, BaseData.getSettingsModuleValue("Functionality"));
			
		}

		public void verifyUpdateSuccessfulMessage() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.rolesEntry.uIBottomLeftSideStatusBar.getText().contains("1003 - Update Successful"));
		}
	}

	public class Repository {
		public void clickSearch() {
			uIMapSettings.repository.uISearchButton.click();
		}

		public void selectTypeAsScreen() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.repository.uIRepositoryTypeComboBox,
					"Screen");
		}

		public void enterScreenIDAs2275() {
			uIMapSettings.repository.uIRepositoryIDEdit.sendKeys("2275");
		}

		public void enterScreenIDAs1387() {
			uIMapSettings.repository.uIRepositoryIDEdit.clear();
			uIMapSettings.repository.uIRepositoryIDEdit.sendKeys("1387");
		}

		public void clickNextButton() {
			uIMapSettings.repository.uINextButton.click();
		}

		public void clickPrevButton() {
			uIMapSettings.repository.uIPrevButton.click();
		}

		public void selectGoToScreenMenu() {
			objectIdentification.randomIdentify.selectContextMenuItemInRepositoryGridRow("GoTo Screen");
		}

		public void selectCheckBoxInGrid() {
			objectIdentification.randomIdentify
					.selectRandomGridRowCheckbox(uIMapSettings.repository.uIRepositoryResultTable);
		}

		public void clickGOTOScreenLink() {
			uIMapSettings.repository.uIGoToScreenButton.click();
		}

		public void verifyScreenShowsError() {
			if (objectIdentification.windowHandle.windowExist("Acknowledge"))
				popup.acknowledge.ok();

			else {
				if (Playback.driver.findElement(By.id("cmdSearch")).isDisplayed()) {
					Playback.driver.findElement(By.id("cmdSearch")).click();
					uIMapSettings.repository.driver.close();
				} else {
					if (Playback.driver.findElement(By.xpath("//span[contains(text(),'Search')]")).isDisplayed()) {
						uIMapSettings.repository.uISearchLinkButton.click();
						uIMapSettings.repository.driver.close();
					} else
						verify.ExpectedValueIsTrue(
								uIMapSettings.repository.uIJurisEdit.getAttribute("value").contains("Prophoenix"));
				}
				Playback.pageLoadThreadWait();
			}

		}

		public void close() {
			uIMapSettings.repository.driver.close();
		}

		public void verifyDefaultNameAsCellStatus(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Cell Status", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.repository.uIRepositoryResultTable, "Default Name", rowIndex));
		}

		public void verifyRepositoryIDAs2275(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("2275", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.repository.uIRepositoryResultTable, "Repository ID", rowIndex));
		}

		public void verifyRepositoryIDAs1387(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("1387", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.repository.uIRepositoryResultTable, "Repository ID", rowIndex));
		}

		public void verifyDefaultNameAsJailCell(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Jail Cell", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.repository.uIRepositoryResultTable, "Default Name", rowIndex));
		}

	}

	public class ChargeScreen {
		public void enterAtChargeCode() {
			uIMapSettings.chargeScreen.uIChargeCodeEdit.sendKeys(BaseData.getSettingsModuleValue("ChargeCode"));
		}

		public void clickAddNew() {
			uIMapSettings.chargeScreen.uIAddNewButton.click();
		}

		public void clickSearchButton() {
			uIMapSettings.chargeScreen.uISearchButton.click();
		}

		public void verifyAtChargeCode(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ChargeCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.chargeScreen.uIChargeResultTable, "Charge Code", rowIndex));
		}

		public void verifyAtCFSCode(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CFSCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.chargeScreen.uIChargeResultTable, "CFS Code", rowIndex));
		}

		public void verifyAtNIBRS(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("NIBRS"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapSettings.chargeScreen.uIChargeResultTable, "NIBRS", rowIndex));
		}

		public void clickAtChargeCodeinGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.chargeScreen.uIChargeResultTable, BaseData.getSettingsModuleValue("ChargeCode"));
		}

		public void clickInactiveCheckbox() {
			uIMapSettings.chargeScreen.uIInactiveCheckBox.click();
		}

		public void verifyInactiveChargeRowColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapSettings.chargeScreen.uIChargeResultTable, rowIndex).getAttribute("class")
					.contains("IsActive"));
		}

		public void enterAtNIBRS() {
			uIMapSettings.chargeScreen.uINIBRSCodeEdit.sendKeys(BaseData.getSettingsModuleValue("NIBRS"));
			uIMapSettings.chargeScreen.uINIBRSCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickNIBRSSearchIcon() {
			uIMapSettings.chargeScreen.uINIBRSSearchICon.click();
		}

		public void enterAtCFSCode() {
			uIMapSettings.chargeScreen.uICFSCodeEdit.sendKeys(BaseData.getSettingsModuleValue("CFSCode"));
			uIMapSettings.chargeScreen.uICFSCodeEdit.sendKeys(Keys.TAB);

		}

		public void selectAtCFSCodeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.chargeScreen.uIChargeResultTable, BaseData.getSettingsModuleValue("CFSCode"));
		}
	}

	public class SharedCodes {

		public SOPTab sOPTab = null;
		public ManagementTab managementTab = null;

		public SharedCodes() {

			if ((this.sOPTab == null)) {
				this.sOPTab = new SOPTab();
			}

			if ((this.managementTab == null)) {
				this.managementTab = new ManagementTab();
			}
		}

		public void enterAtChargeCode() {
			uIMapSettings.sharedCodes.uIChargeCodeEdit.sendKeys(BaseData.getSettingsModuleValue("ChargeCode"));
			uIMapSettings.sharedCodes.uIChargeCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtChargeType() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uIChargeTypeComboBox,
					BaseData.getSettingsModuleValue("ChargeType"));
		}

		public void enterAtDescription() {
			uIMapSettings.sharedCodes.uIDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("Description"));
		}

		public void enterAtRelatedCFSCode() {
			uIMapSettings.sharedCodes.uIRelatedCFSCodeEdit.sendKeys(BaseData.getSettingsModuleValue("RelatedCFSCode"));
			uIMapSettings.sharedCodes.uIRelatedCFSCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNIBRSCode() {
			uIMapSettings.sharedCodes.uINibrsCodeEdit.sendKeys(BaseData.getSettingsModuleValue("NIBRSCode"));
			uIMapSettings.sharedCodes.uINibrsCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapSettings.sharedCodes.uIAddButton.click();
		}

		public void clickAddNewButton() {
			uIMapSettings.sharedCodes.uIAddNewButton.click();
		}

		public void verifyAtNIBRSCodeinGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("NIBRSCode"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapSettings.sharedCodes.uINibrsResultTable, "NIBRS", rowIndex));
		}

		public void saveScreen() {
			uIMapSettings.sharedCodes.uISaveButton.click();
			popup.confirm.yes();
		}

		public void closeScreen() {
			uIMapSettings.sharedCodes.driver.close();
		}

		public void clickInactiveCheckBox() {
			uIMapSettings.sharedCodes.uIInactiveCheckBox.click();
		}

		public void verifyInactiveDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapSettings.sharedCodes.uIInactiveDateEdit.getAttribute("value"));
		}

		public void enterRelatedMOCCode() {
			uIMapSettings.sharedCodes.uIRelatedMOCCodeEdit.sendKeys("10.5-52");
		}

		public void enterAtDisposition() {
			uIMapSettings.sharedCodes.uIDispositionEdit.sendKeys(BaseData.getSettingsModuleValue("Disposition"));
		}

		public void enterDescriptionAsQualityAssurance() {
			uIMapSettings.sharedCodes.uIDescriptionEdit.sendKeys("QualityAssurance");
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uITypeComboBox,
					BaseData.getSettingsModuleValue("Type"));
			uIMapSettings.sharedCodes.uITypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickCADTab() {
			uIMapSettings.sharedCodes.uICADTab.click();
		}

		public void clickCaseGereratedNoCheckBox() {
			uIMapSettings.sharedCodes.cADTab.uIGenerateCaseNoCheckBox.click();
		}

		public void selectAtReportCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.sharedCodes.cADTab.uIReportCodeComboBox,
					BaseData.getSettingsModuleValue("ReportCode"));
			uIMapSettings.sharedCodes.cADTab.uIReportCodeComboBox.sendKeys(Keys.TAB);
		}

		public void selectBackupUnitReportCodeAsIncidentReport() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.sharedCodes.cADTab.uIBackupReportCodeComboBox, "Incident Report");
			uIMapSettings.sharedCodes.cADTab.uIBackupReportCodeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyManagementTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.sharedCodes.uIManagementTab.getAttribute("class").contains("Dis"));
		}

		public void clickSave() {
			uIMapSettings.sharedCodes.uISaveButton.click();
		}

		public void verifyReportCodeBackupUnitReportCodeAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(22540) Report Code and Backup Unit Report Code cannot be the same");
		}

		public void selectBackupUnitReportCodeAsArrestReport() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.sharedCodes.cADTab.uIBackupReportCodeComboBox, "Arrest Report");
			uIMapSettings.sharedCodes.cADTab.uIBackupReportCodeComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyManagementTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.sharedCodes.uIManagementTab.getAttribute("class").contains("Dis"));
		}

		public void ClickSave() {
			uIMapSettings.sharedCodes.uISaveButton.click();
		}

		public void VerifyReportCodeBackupUnitReportCodeAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(22540) Report Code and Backup Unit Report Code cannot be the same");
		}

		public void SelectBackupUnitReportCodeAsArrestReport() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.sharedCodes.cADTab.uIBackupReportCodeComboBox, "Arrest Report");
			uIMapSettings.sharedCodes.cADTab.uIBackupReportCodeComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtCallForService() {
			uIMapSettings.sharedCodes.uICallForServiceEdit.sendKeys(BaseData.getSettingsModuleValue("CallForService"));
		}

		public void SelectAtAlarm() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uIAlarmComboBox,
					BaseData.getSettingsModuleValue("Alarm"));
		}

		public void SelectAtSubLevel() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uISubLevelComboBox,
					BaseData.getSettingsModuleValue("SubLevel"));
		}

		public void SelectAtDispatchPriority() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.sharedCodes.uIDispatchPriorityComboBox,
					BaseData.getSettingsModuleValue("DispatchPriority"));
		}

		public void SelectAtAgency() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uIAgencyComboBox,
					BaseData.getSettingsModuleValue("Agency"));
		}

		public void ClickNFIRSCheckbox() {
			uIMapSettings.sharedCodes.uINFIRSReportCheckbox.click();

		}

		public void ClickEMSCheckbox() {
			uIMapSettings.sharedCodes.uIEMSReportCheckbox.click();

		}

		public void EnterAtPopUpCodeValue() {
			uIMapSettings.sharedCodes.uIPopUpCodeValueEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue"));
		}

		public void EnterAtPopUpDescription() {
			uIMapSettings.sharedCodes.uIPopUpDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("Description"));
		}

		public void clickManagementTab() {
			uIMapSettings.sharedCodes.uIManagementTab.click();

		}

		public void SelectCaseStatusAsOpen() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.sharedCodes.managementTab.uICaseStatusComboBox, "Open");
			uIMapSettings.sharedCodes.managementTab.uICaseStatusComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtChargeCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ChargeCode"),
					uIMapSettings.sharedCodes.uIChargeCodeEdit.getAttribute("value"));
		}

		public void enterAtNIBRSCode1() {
			uIMapSettings.sharedCodes.uINibrsCodeEdit.sendKeys(BaseData.getSettingsModuleValue("NIBRSCode1"));
			uIMapSettings.sharedCodes.uINibrsCodeEdit.sendKeys(Keys.TAB);
		}

		public void verify1019DuplicationOfDataFound() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void enterAtCodeValue() {
			Playback.controlReadyThreadWait();
			uIMapSettings.sharedCodes.uIPopUpCodeValueEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue"));
		}

		public void clickSearchButton() {
			uIMapSettings.sharedCodes.uISearchButton.click();
		}

		public void verifySuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(uIMapSettings.sharedCodes.uIBottomLeftSideStatusBar.getText()
					.contains("1002 - Addition Successful"));
		}

		public void verifyAtCodeValueDescription(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable, "Code Value Description",
							rowIndex));
		}

		public void enterAtLayerDescription() {
			uIMapSettings.sharedCodes.uIDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("LayerDescription"));
		}

		public void selectAtLayerIcon() {
			Playback.controlReadyThreadWait();
			uIMapSettings.sharedCodes.uIMapLayerIconSelect.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValue(
					uIMapSettings.sharedCodes.uIMapLayerIconDropdown, BaseData.getSettingsModuleValue("LayerIcon"));
			Playback.controlReadyThreadWait();
		}

		public void clickCodeAddButton() {
			uIMapSettings.sharedCodes.uICodeAddButton.click();
		}

		public void enterAtCodeValueSearch() {
			Playback.controlReadyThreadWait();
			uIMapSettings.sharedCodes.uICodeValueSeachEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue"));

		}

		public void verifyAtCodeValueinGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeValue"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapSettings.sharedCodes.uICodeValueTable,
							"Code Value", rowIndex));
		}

		public void deleteAtCCInGridWithConfirmMsg() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapSettings.sharedCodes.uISharedCodesResultTable, BaseData.getSettingsModuleValue("CC"), "X");
			gridCell.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();

		}

		public void verifyNoRecordFoundAckwMsg() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void enterAtUserCommandCode() {
			uIMapSettings.sharedCodes.uIUserCommandCodeEdit
					.sendKeys(BaseData.getSettingsModuleValue("UserCommandCode"));
			uIMapSettings.sharedCodes.uIUserCommandCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtDispOrder() {
			uIMapSettings.sharedCodes.uIDispOrderCodeEdit.sendKeys(BaseData.getSettingsModuleValue("DispOrder"));
			uIMapSettings.sharedCodes.uIDispOrderCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCFSCode() {
			uIMapSettings.sharedCodes.uICallForServiceEdit.sendKeys(BaseData.getSettingsModuleValue("CFSNo"));

		}

		public void verifyAlertTypeOptions() {
			List<String> allValues = objectIdentification.manualIdentify
					.getDropDownValues(uIMapSettings.sharedCodes.cADTab.uIAlertTypeDropdown);

			List<String> downValues = new ArrayList<String>();
			downValues.add("  --  ");
			downValues.add("Active Shooter Alert");
			downValues.add("Fight");
			downValues.add("Fire");
			downValues.add("Medical Emergency");
			downValues.add("Other");
			downValues.add("All");
			downValues.add("Drill");
			downValues.add("Hard Lock Down");
			downValues.add("  --Inq 3997 --  ");
			verify.ExpectedValueIsTrue(CollectionUtils.containsAll(allValues, downValues));

		}

		public void selectAtAlertType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.sharedCodes.cADTab.uIAlertTypeDropdown, BaseData.getSettingsModuleValue("AlertType"));
		}

		public void saveNClose() {
			uIMapSettings.sharedCodes.uISaveandCloseButton.click();
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yes();
			}

			else {
				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yes();

			}
		}

		public void enterAtZipCode() {
			uIMapSettings.sharedCodes.uIZipCodeEdit.sendKeys(BaseData.getSettingsModuleValue("ZipCode"));
			uIMapSettings.sharedCodes.uIZipCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtZipCode2() {
			uIMapSettings.sharedCodes.uIZipCodeEdit.sendKeys(BaseData.getSettingsModuleValue("ZipCode2"));
			uIMapSettings.sharedCodes.uIZipCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uIStateDropDown,
					BaseData.getSettingsModuleValue("State"));
			uIMapSettings.sharedCodes.uIStateDropDown.sendKeys(Keys.TAB);
		}

		public void enterAtCity() {
			uIMapSettings.sharedCodes.uICityEdit.sendKeys(BaseData.getSettingsModuleValue("City"));
			uIMapSettings.sharedCodes.uICityEdit.sendKeys(Keys.TAB);
		}

		public void selectLocationType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uILocationTypeDropDown);
			uIMapSettings.sharedCodes.uILocationTypeDropDown.sendKeys(Keys.TAB);
		}

		public void enterAtLocationName() {
			uIMapSettings.sharedCodes.uILocationNameEdit.sendKeys(BaseData.getSettingsModuleValue("LocationName"));
			uIMapSettings.sharedCodes.uILocationNameEdit.sendKeys(Keys.TAB);
		}

		public void verifyInvalidZipCodeAckwMsg() {
			popup.acknowledge.okWithExpectedMessage("(1063) Invalid zip code");
		}

		public void verifyDeleteCustomReportButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.sharedCodes.uIDeleteCustomReport.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapSettings.sharedCodes.uIDeleteCustomReport.isEnabled());
		}

		public void clickUploadButton() {
			Playback.controlReadyThreadWait();
			uIMapSettings.sharedCodes.uIUploadButton.click();
		}

		public void shareDownloadedFileToServerAsTestCaseID() {
			Playback.controlReadyThreadWait();
			String testid = BaseData.getSettingsModuleValue("TestCaseID");
			objectIdentification.readPDF.SendLocalDownloadedFileToServerPath(testid);
			Playback.controlReadyThreadWait();
		}

		public void clickDownloadButton() {
			Playback.controlReadyThreadWait();
			uIMapSettings.sharedCodes.uIDownloadButton.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void clickAddButtonInPopUp() {
			uIMapSettings.sharedCodes.uIAddButtonInPopUp.click();
		}

		public void verifyStatutoryLimitationToRetainEvidenceIsEnabled() {
			uIMapSettings.sharedCodes.uIStatutoryLimitationEdit.isEnabled();
		}

		public void enterAtStatutoryLimitationToRetainEvidence() {
			uIMapSettings.sharedCodes.uIStatutoryLimitationEdit
					.sendKeys(BaseData.getSettingsModuleValue("StatutoryLimitation"));
			uIMapSettings.sharedCodes.uIStatutoryLimitationEdit.sendKeys(Keys.TAB);
		}

		public void selectAtCFSType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uICFSTypeComboBox,
					BaseData.getSettingsModuleValue("Type"));
			uIMapSettings.sharedCodes.uICFSTypeComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtCFSClass() {
			uIMapSettings.sharedCodes.uICFSClassEdit.sendKeys(BaseData.getSettingsModuleValue("CFSClass"));
			uIMapSettings.sharedCodes.uICFSClassEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPopUpCodeValue1() {
			uIMapSettings.sharedCodes.uIPopUpCodeValueEdit.sendKeys(BaseData.getSettingsModuleValue("CodeValue1"));
		}

		public void enterAtPopUpDescription1() {
			uIMapSettings.sharedCodes.uIPopUpDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("Description1"));
		}

		public void verifyAtCodeValue() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapSettings.sharedCodes.uISharedCodesResultTable, BaseData.getSettingsModuleValue("CodeValue"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getSettingsModuleValue("CodeValue")));
		}

		public void verifyAtCodeValueDescription() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapSettings.sharedCodes.uISharedCodesResultTable,
					BaseData.getSettingsModuleValue("CodeValueDescription"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getSettingsModuleValue("CodeValueDescription")));
		}

		public void verifyAtCodeValueDescription1() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapSettings.sharedCodes.uISharedCodesResultTable,
					BaseData.getSettingsModuleValue("CodeValueDescription1"));
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText()
					.contains(BaseData.getSettingsModuleValue("CodeValueDescription1")));
		}

		public void verifyAtCodeValueDescription2() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapSettings.sharedCodes.uISharedCodesResultTable,
					BaseData.getSettingsModuleValue("CodeValueDescription2"));
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText()
					.contains(BaseData.getSettingsModuleValue("CodeValueDescription2")));
		}

		public void clickUpdateButton() {
			uIMapSettings.sharedCodes.uIAddButton.click();
		}

		public void enterAtRef1() {
			uIMapSettings.sharedCodes.uIRefEdit.click();
			uIMapSettings.sharedCodes.uIRefEdit.clear();
			uIMapSettings.sharedCodes.uIRefEdit.sendKeys(BaseData.getSettingsModuleValue("Ref1"));
		}

		public void clickPopupInactiveCheckBox() {
			uIMapSettings.sharedCodes.uIPopupInactiveCheckBox.click();
		}

		public void SelectAtCodeValueDescription1() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable,
					BaseData.getSettingsModuleValue("Description1"));
		}

		public void SelectAtCodeValueDescription() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.maintainCodeValue.uIMaintainCodeValueTable,
					BaseData.getSettingsModuleValue("Description"));
		}

		public void verifyAtDescription() {
			String description = uIMapSettings.sharedCodes.uIDescriptionEdit.getAttribute("value");
			String description1 = uIMapSettings.sharedCodes.uIDescriptionEdit.getAttribute("title");
			String description2 = uIMapSettings.sharedCodes.uIDescriptionEdit.getText();
			System.out.println(description + "--" + description1 + "--" + description2);
			// verify.ExpectedPropertyValueIsEqual(description,
			// BaseData.getSettingsModuleValue("Description"));
		}

		public void verifyAtCodeValueDescriptionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeValueDescription"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.sharedCodes.uISharedCodesResultTable, "Code Value Description", rowIndex));
		}

		public void verifyInactiveCheckboxUnChecked(int rowIndex) {
			WebElement status = objectIdentification.manualIdentify
					.getGridRowCheckBoxByIndex(uIMapSettings.sharedCodes.uISharedCodesResultTable, rowIndex);
			verify.ExpectedPropertyValueIsEqual(status.getAttribute("title"), "Unchecked");
		}

		public void verifyAtCodeValueDescription1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeValueDescription1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.sharedCodes.uISharedCodesResultTable, "Code Value Description", rowIndex));
		}

		public void verifyAtCodeValue1inGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("CodeValue1"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapSettings.sharedCodes.uICodeValueTable,
							"Code Value", rowIndex));
		}

		public void verifyInactiveCheckboxChecked() {

			List<WebElement> checkboxes = Playback.driver
					.findElements(By.xpath("//div[@id='grdCodeValue']//table/tbody/tr//td/img"));
			for (WebElement checkbox : checkboxes) {
				if (checkbox.isDisplayed() && checkbox.getAttribute("src").contains("checkbox_on.gif")) {
					verify.ExpectedPropertyValueIsEqual(checkbox.getAttribute("title"), "Checked");
				}
			}

		}

		public List<String> readCodeValueDescriptionColumnInTable() {
			List<String> columnValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapSettings.sharedCodes.uISharedCodesResultTable, "Code Value Description");

			return columnValues;
		}

		public void verifyAtCodeID() {
			String value = uIMapSettings.sharedCodes.uICodeIDEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(value.contains(BaseData.getSettingsModuleValue("CodeID")));

		}

		public void clickAtCodeValueDescription() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.sharedCodes.uISharedCodesResultTable,
					BaseData.getSettingsModuleValue("CodeValueDescription"));

		}

		public void SelectAtTowVendor() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.uIPopUpTowVendor,
					BaseData.getSettingsModuleValue("Towvendor"));

		}

		public void verifyAllowPurgeCheckBoxIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapSettings.sharedCodes.uIAllowPurgeCheckBox.isDisplayed());

		}

		public void verifyAtRelatedCFSCode() {
			String attribute = uIMapSettings.sharedCodes.uIRelatedCFSCodeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getSettingsModuleValue("RelatedCFSCode")));
		}

		public void verifyDoNotPurgeCheckBoxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.sharedCodes.uIDoNotPurgeCheckBox.isEnabled());

		}

		public void clickAllowPurgeCheckBox() {
			uIMapSettings.sharedCodes.uIAllowPurgeCheckBox.click();

		}
	}

	public class SOPTab {

		public void SelectAtSOPType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.sharedCodes.sOPTab.uISOPTypeComboBox,
					BaseData.getSettingsModuleValue("SOPType"));
		}

		public void EnterAtTextName() {
			uIMapSettings.sharedCodes.sOPTab.uITextNameEdit.sendKeys(BaseData.getSettingsModuleValue("TextName"));
		}

		public void ClickAddButton() {
			uIMapSettings.sharedCodes.sOPTab.uIAddButton.click();
		}

	}

	public class ManagementTab {
		public void verifyStatutoryLimitationToRetainEvidenceIsEnabled() {
			uIMapSettings.sharedCodes.managementTab.uIStatutoryLimitationEdit.isEnabled();
		}

		public void enterAtStatutoryLimitationToRetainEvidence() {
			uIMapSettings.sharedCodes.managementTab.uIStatutoryLimitationEdit
					.sendKeys(BaseData.getSettingsModuleValue("StatutoryLimitation"));
			uIMapSettings.sharedCodes.managementTab.uIStatutoryLimitationEdit.sendKeys(Keys.TAB);
		}

	}

	// region Action Search Action Classes
	public class ActionSearch {

		public void enterAtActionNo() {
			uIMapSettings.actionSearch.uIActionNoEdit.sendKeys(BaseData.getSettingsModuleValue("ActionNo"));
		}

		public void clickSearchButton() {
			uIMapSettings.actionSearch.uISearchButton.click();
		}

		public void clickAddNewButton() {
			uIMapSettings.actionSearch.uIAddNewButton.click();
		}

		public void verifyAtActionNoInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ActionNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.actionSearch.uIActionSearchTable,
							BaseData.getSettingsModuleValue("ActionNo"), "Action#").getText());

		}

		public void verifyAtProcessSPNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ProcessSPName"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.actionSearch.uIActionSearchTable,
							BaseData.getSettingsModuleValue("ProcessSPName"), "Process SPName").getText());
		}

		public void selectRowByAtActionName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.actionSearch.uIActionSearchTable, BaseData.getSettingsModuleValue("ActionName"));
		}

	}

	// region Action Entry Action Classes
	public class ActionEntry {
		public void clickSaveButton() {
			uIMapSettings.actionEntry.uISaveButton.click();
		}

		public void verify1011NoMessagePresentAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(1101) No Message Present");
		}

		public void enterAtActionNo() {
			uIMapSettings.actionEntry.uIActionNoEdit.sendKeys(BaseData.getSettingsModuleValue("ActionNo"));
		}

		public void enterAtActionName() {
			uIMapSettings.actionEntry.uIActionNameEdit.sendKeys(BaseData.getSettingsModuleValue("ActionName"));
		}

		public void enterDescription() {
			uIMapSettings.actionEntry.uIDescriptionEdit.sendKeys(Randomized.randomString(15));

		}

		public void enterVerifySPName() {
			uIMapSettings.actionEntry.uIVerifySPName.sendKeys(Randomized.randomString(8));
		}

		public void enterAtProcessSPName() {
			uIMapSettings.actionEntry.uIProcessSPNameEdit.sendKeys(BaseData.getSettingsModuleValue("ProcessSPName"));
		}

		public void enterInputParameterName() {
			uIMapSettings.actionEntry.uIInputParameterNameEdit.sendKeys(Randomized.randomString(8));
		}

		public void selectAtValueType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.actionEntry.uIValueTypeComboBox,
					BaseData.getSettingsModuleValue("ValueType"));
		}

		public void clickAddButton() {
			uIMapSettings.actionEntry.uIAddButton.click();
		}

		public void verifyAtValueTypeInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ValueType"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.actionEntry.uIActionEntryTable,
							BaseData.getSettingsModuleValue("ValueType"), "Value Type").getText());
		}

		public void saveNClose() {
			uIMapSettings.actionEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void save() {
			uIMapSettings.actionEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void enterAtInputParameterName() {
			uIMapSettings.actionEntry.uIInputParameterNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("InputParameterName"));
		}

		public void selectValueType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapSettings.actionEntry.uIValueTypeComboBox);
		}

		public void verifyAtInputParameterNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("InputParameterName"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.actionEntry.uIActionEntryTable,
							BaseData.getSettingsModuleValue("InputParameterName"), "Parameter Name").getText());
		}

		public void selectRowByAtValueType() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.actionEntry.uIActionEntryTable, BaseData.getSettingsModuleValue("ValueType"));
		}

		public void clearInputParameterName() {
			uIMapSettings.actionEntry.uIInputParameterNameEdit.clear();
		}

		public void enterAtInputParameterName1() {
			uIMapSettings.actionEntry.uIInputParameterNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("InputParameterName1"));
		}

		public void selectAtValueType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.actionEntry.uIValueTypeComboBox,
					BaseData.getSettingsModuleValue("ValueType1"));
		}

		public void verifyAtInputParameterName1InGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("InputParameterName1"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.actionEntry.uIActionEntryTable,
									BaseData.getSettingsModuleValue("InputParameterName1"), "Parameter Name")
							.getText());
		}

		public void verifyAtValueType1InGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ValueType1"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.actionEntry.uIActionEntryTable,
							BaseData.getSettingsModuleValue("ValueType1"), "Value Type").getText());

		}

		public void close() {
			uIMapSettings.actionEntry.driver.close();
		}

	}

	// region Terminal Screen Action Classes
	public class Terminal {

		public void clickAddNewButton() {
			uIMapSettings.terminal.uIAddNewButton.click();
		}

		public void enterAtTerminalName() {
			uIMapSettings.terminal.uITerminalNameEdit.sendKeys(BaseData.getSettingsModuleValue("TerminalName"));
		}

		public void enterAtTerminalName1() {
			uIMapSettings.terminal.uITerminalNameEdit.sendKeys(BaseData.getSettingsModuleValue("TerminalName1"));
		}

		public void enterAtIPAddress() {
			uIMapSettings.terminal.uIIPAddressEdit.sendKeys(BaseData.getSettingsModuleValue("IPAddress"));
		}

		public void clickSearchButton() {
			uIMapSettings.terminal.uISearchButton.click();
		}

		public void reloadTerminalScreen() {
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("Terminal", "Reload Tab");
		}

		public void selectRowByAtTerminalName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.terminal.uITerminalTable,
					BaseData.getSettingsModuleValue("TerminalName"));
		}

		public void selectRowByAtTerminalName1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.terminal.uITerminalTable,
					BaseData.getSettingsModuleValue("TerminalName1"));
		}

		public void verify1011NoRecordFoundAcknowledgeMessage() {
			// if(Playback.browserType == "Chrome")
			// popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			// else
			popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void clickIncludeInactiveCheckbox() {
			uIMapSettings.terminal.uIIncludeInactiveCheckbox.click();
		}

		public void clickIncludeFireCheckbox() {
			uIMapSettings.terminal.uIIncludeFireCheckbox.click();
		}

		public void verifyAtTerminalNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("TerminalName"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.terminal.uITerminalTable,
							BaseData.getSettingsModuleValue("TerminalName")).getText());
		}

		public void verifyAtTerminalName1InGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("TerminalName1"),
					objectIdentification.manualIdentify.getGridCell(uIMapSettings.terminal.uITerminalTable,
							BaseData.getSettingsModuleValue("TerminalName1")).getText());
		}

		public void verifyAtTerminalNameRowAppearGrayColor() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapSettings.terminal.uITerminalTable,
									BaseData.getSettingsModuleValue("TerminalName"))
							.getAttribute("class").contains("red"),
					"verify terminal row appears gray color");
		}

		public void verifyAtTerminalName1RowAppearRedColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapSettings.terminal.uITerminalTable,
							BaseData.getSettingsModuleValue("TerminalName1"))
					.getAttribute("class").contains("Firebrick"), "verify terminal row appears red color");
		}

	}

	// region Terminal Entry Action Classes
	public class TerminalEntry {

		public IPAddressTab iPAddressTab;
		public DispatchTab dispatchTab;
		public NCICTab nCICTab;
		public E911Tab e911Tab;
		public ScreensTab screensTab;
		public InventoryTab inventoryTab;
		public DeviceTab deviceTab;
		public InterfaceTab interfaceTab;

		public TerminalEntry() {

			if (this.iPAddressTab == null)
				this.iPAddressTab = new IPAddressTab();

			if (this.dispatchTab == null)
				this.dispatchTab = new DispatchTab();

			if (this.nCICTab == null)
				this.nCICTab = new NCICTab();

			if ((this.e911Tab == null))
				this.e911Tab = new E911Tab();

			if (this.screensTab == null)
				this.screensTab = new ScreensTab();

			if ((this.inventoryTab == null))
				this.inventoryTab = new InventoryTab();

			if ((this.deviceTab == null))
				this.deviceTab = new DeviceTab();

			if (this.interfaceTab == null)
				this.interfaceTab = new InterfaceTab();
		}

		public void clickSaveButton() {
			uIMapSettings.terminalEntry.uISaveButton.click();
		}

		public void enterAtTerminalName() {
			uIMapSettings.terminalEntry.uITerminalNameEdit.sendKeys(BaseData.getSettingsModuleValue("TerminalName"));
		}

		public void clickIPAddressTab() {
			uIMapSettings.terminalEntry.uIIPAddressTab.click();

		}

		public void verifyDispatchTabDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.terminalEntry.uIDispatchTab.getAttribute("class").contains("TextDis"));
		}

		public void verifyDispatchTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.terminalEntry.uIDispatchTab.isEnabled());
		}

		public void verify1018RequiredEntriesAreMissingAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void save() {
			uIMapSettings.terminalEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapSettings.terminalEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void verify1002AdditionSuccessfulMessage() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapSettings.terminalEntry.uIBottomMesssageTextView.getText(),
					"verify 1002 addition successful message is displayed");
		}

		public void clickAllTabs() {
			uIMapSettings.terminalEntry.uIIPAddressTab.click();
			uIMapSettings.terminalEntry.uIDispatchTab.click();
			uIMapSettings.terminalEntry.uIScreensTab.click();
			uIMapSettings.terminalEntry.uIInventoryTab.click();
			uIMapSettings.terminalEntry.uIDeviceTab.click();
			uIMapSettings.terminalEntry.uIInterfaceTab.click();
			uIMapSettings.terminalEntry.uICMSTab.click();
		}

		public void clickDispatchTab() {
			uIMapSettings.terminalEntry.uIDispatchTab.click();
		}

		public void clickNCICTab() {
			uIMapSettings.terminalEntry.uINCICTab.click();
		}

		public void clickE911Tab() {
			uIMapSettings.terminalEntry.uIE911Tab.click();
		}

		public void clickScreensTab() {
			uIMapSettings.terminalEntry.uIScreensTab.click();
		}

		public void clickInventoryTab() {
			uIMapSettings.terminalEntry.uIInventoryTab.click();
		}

		public void clickDevicesTab() {
			uIMapSettings.terminalEntry.uIDeviceTab.click();
		}

		public void clickInterfaceTab() {
			uIMapSettings.terminalEntry.uIInterfaceTab.click();
		}

	}

	public class IPAddressTab {

		public void enterLocation() {
			uIMapSettings.terminalEntry.iPAddressTab.uILocationEdit.sendKeys(Randomized.randomString(10));
		}

		public void enterAtIPAddress() {
			uIMapSettings.terminalEntry.iPAddressTab.uIIPaddressEdit
					.sendKeys(BaseData.getSettingsModuleValue("IPAddress"));
		}

		public void enterDeviceName() {
			uIMapSettings.terminalEntry.iPAddressTab.uIDeviceNameEdit.sendKeys(Randomized.randomString(10));
		}

		public void clickUsedForCADCheckbox() {
			uIMapSettings.terminalEntry.iPAddressTab.uIUseforCADCheckBox.click();

		}

		public void enterDefaultPrinter() {
			uIMapSettings.terminalEntry.iPAddressTab.uIDefaultPrinterEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectIdentixLocation() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.terminalEntry.iPAddressTab.uIIdentixLocationComboBox);
		}

		public void enterBarCodePrinter() {
			uIMapSettings.terminalEntry.iPAddressTab.uIBarCodePrinterEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectPOSMaxCharLine() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.terminalEntry.iPAddressTab.uIPOSMaxCharComboBox);
		}

		public void enterReceiptPrinter() {
			uIMapSettings.terminalEntry.iPAddressTab.uIReceiptPrinterEdit.sendKeys(Randomized.randomString(10));
		}

		public void enterValidationPrinter() {
			uIMapSettings.terminalEntry.iPAddressTab.uIValidationPrinterEdit.sendKeys(Randomized.randomString(10));
		}

		public void enterCheckPrinter() {
			uIMapSettings.terminalEntry.iPAddressTab.uICheckPrinterEdit.sendKeys(Randomized.randomString(10));

		}

		public void selectZetronDevice() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.terminalEntry.iPAddressTab.uIZetronDeviceComboBox);
		}

	}

	public class DispatchTab {

		public void clickPoliceTakeNewCallsCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIPoliceTakeNewCallCheckBox.click();
		}

		public void clickPoliceUsedForDispatchCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIPoliceUsedforDispatchCheckBox.click();
		}

		public void clickPoliceReceivedCallsCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIPoliceReceivedCallsCheckBox.click();
		}

		public void clickFireTakeNewCallsCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIFireTakeNewCallCheckBox.click();
		}

		public void clickFireUsedForDispatchCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIFireUsedforDispatchCheckBox.click();
		}

		public void clickFireReceivedCallsCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIFireReceivedCallsCheckBox.click();
		}

		public void clickEMSTakeNewCallsCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIEMSTakeNewCallCheckBox.click();
		}

		public void clickOthersTakeNewCallsCheckbox() {
			uIMapSettings.terminalEntry.dispatchTab.uIOthersTakeNewCallCheckBox.click();
		}

		public void selectAtDispatchRoute() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.terminalEntry.dispatchTab.uIDispatchRouteComboBox,
					BaseData.getSettingsModuleValue("DispatchRoute"));
		}

		public void clickAddButton() {
			uIMapSettings.terminalEntry.dispatchTab.uIAddButton.click();
		}

		public void verifyAtDispatchRouteInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("DispatchRoute"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.terminalEntry.dispatchTab.uIDispatchRouteTable,
									BaseData.getSettingsModuleValue("DispatchRoute"))
							.getText(),
					"Verify DispatchRoute is available in Grid");
		}

	}

	public class NCICTab {

		public void enterORINo() {
			uIMapSettings.terminalEntry.nCICTab.uIORINoEdit.sendKeys(Randomized.randomString(15));
		}

		public void enterMnemonic() {
			uIMapSettings.terminalEntry.nCICTab.uIMnemonicEdit.sendKeys(Randomized.randomString(15));
		}

		public void enterWorkStationName() {
			uIMapSettings.terminalEntry.nCICTab.uIWorkStationNameEdit.sendKeys(Randomized.randomString(15));
		}

		public void clickReceiveUnsolicitedMessageCheckbox() {
			uIMapSettings.terminalEntry.nCICTab.uIReceivedUnsolicitedMessageCheckBox.click();

		}

		public void clickReceiveUndeliveredMessageCheckbox() {
			uIMapSettings.terminalEntry.nCICTab.uIReceivedUndeliveredMessageCheckBox.click();

		}

	}

	public class E911Tab {

		public void enterPositionID() {
			uIMapSettings.terminalEntry.e911Tab.uIPositionIDEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumbers(3)));
		}

	}

	public class ScreensTab {

		public void selectAtMonitor() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.terminalEntry.screensTab.uIMonitorComboBox,
					BaseData.getSettingsModuleValue("Monitor"));
		}

		public void selectAtScreen() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.terminalEntry.screensTab.uIScreenComboBox, BaseData.getSettingsModuleValue("Screen"));
		}

		public void selectCustomStatus() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.terminalEntry.screensTab.uICustomStatusComboBox);
		}

		public void clickAddButton() {
			uIMapSettings.terminalEntry.screensTab.uIAddButton.click();
		}

		public void verifyAtMonitorInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Monitor"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.terminalEntry.screensTab.uIScreensTable,
									BaseData.getSettingsModuleValue("Monitor"))
							.getText(),
					"Verify monitor is avaialble in grid");
		}

		public void verifyAtScreenNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ScreenName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.terminalEntry.screensTab.uIScreensTable,
									BaseData.getSettingsModuleValue("ScreenName"))
							.getText(),
					"verify screen name is available in grid");
		}

		public void deleteAtMonitorInGrid() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapSettings.terminalEntry.screensTab.uIScreensTable, BaseData.getSettingsModuleValue("Monitor"));
		}

		public void veriftAtMonitorRowDeleted() {
			verify.ExpectedValueIsFalse(uIMapSettings.terminalEntry.screensTab.uIScreensTable.getText()
					.contains(BaseData.getSettingsModuleValue("Monitor")), "verify row deleted from grid");
		}

	}

	public class InventoryTab {

		public void clickCounterCheckOutRadioButton() {
			uIMapSettings.terminalEntry.inventoryTab.uICountercheckoutRadioButton.click();
		}

		public void clickSelfCheckOutRadioButton() {
			uIMapSettings.terminalEntry.inventoryTab.uISelfCheckOutRadioButton.click();
		}

		public void verifyAllCheckboxDisabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.terminalEntry.inventoryTab.uIAllowTrackingNumberCheckbox
					.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(uIMapSettings.terminalEntry.inventoryTab.uIBarcodeScanningEnabledCheckbox
					.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(uIMapSettings.terminalEntry.inventoryTab.uIPFPasswordRequiredCheckbox
					.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(uIMapSettings.terminalEntry.inventoryTab.uIEnableReturnAllButtonChcekbox
					.getAttribute("disabled") == "true");
		}

		public void verifyAllCheckboxEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapSettings.terminalEntry.inventoryTab.uIAllowTrackingNumberCheckbox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapSettings.terminalEntry.inventoryTab.uIBarcodeScanningEnabledCheckbox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapSettings.terminalEntry.inventoryTab.uIPFPasswordRequiredCheckbox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapSettings.terminalEntry.inventoryTab.uIEnableReturnAllButtonChcekbox.isEnabled());
		}

		public void clickAllCheckbox() {
			uIMapSettings.terminalEntry.inventoryTab.uIAllowTrackingNumberCheckbox.click();
			uIMapSettings.terminalEntry.inventoryTab.uIBarcodeScanningEnabledCheckbox.click();
			uIMapSettings.terminalEntry.inventoryTab.uIPFPasswordRequiredCheckbox.click();
			uIMapSettings.terminalEntry.inventoryTab.uIEnableReturnAllButtonChcekbox.click();
		}

	}

	public class DeviceTab {

		public void clickTerminalTypeComputerRadioButton() {
			uIMapSettings.terminalEntry.deviceTab.uITerminalTypeComputerRadioButton.click();
		}

		public void selectDeviceType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.terminalEntry.deviceTab.uIDeviceTypeComboBox);
		}

		public void enterSWDANotifyAddress() {
			uIMapSettings.terminalEntry.deviceTab.uISWDANotifyAddressEdit.sendKeys(Randomized.randomString(16));
		}

	}

	public class InterfaceTab {

		public void selectAtInterfaceName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.terminalEntry.interfaceTab.uIInterfaceNameComboBox,
					BaseData.getSettingsModuleValue("InterfaceName"));
		}

		public void enterAtLocationHostSite() {
			uIMapSettings.terminalEntry.interfaceTab.uILocationHostSiteEdit
					.sendKeys(BaseData.getSettingsModuleValue("LocationHostSite"));
		}

		public void enterCustom1() {
			uIMapSettings.terminalEntry.interfaceTab.uICustom1Edit.sendKeys(Randomized.randomString(16));
		}

		public void clickAddButton() {
			uIMapSettings.terminalEntry.interfaceTab.uIAddButton.click();
		}

		public void verifyAtInterfaceNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("InterfaceName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.terminalEntry.interfaceTab.uIInterfaceTable,
									BaseData.getSettingsModuleValue("InterfaceName"))
							.getText(),
					"verify interface name is available in grid");
		}

		public void verifyAtLocationHostSiteInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("LocationHostSite"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapSettings.terminalEntry.interfaceTab.uIInterfaceTable,
									BaseData.getSettingsModuleValue("LocationHostSite"))
							.getText(),
					"verify location host site is available in grid");
		}

	}

	// region Text Screens Action Classes
	public class TextScreen {
		public void clickAddNew() {
			uIMapSettings.textScreen.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickSearch() {
			uIMapSettings.textScreen.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtTextName() {
			uIMapSettings.textScreen.uITextNameEdit.sendKeys(BaseData.getSettingsModuleValue("TextName"));
		}

		public void verifyAtTextName(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("TextName"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapSettings.textScreen.uITextResultTable,
							"Text Name", rowIndex));
		}

		public void verifyAtExpiryDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ExpiryDate"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapSettings.textScreen.uITextResultTable,
							"Expiry Date", rowIndex));
		}

		public void clickAtTextNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapSettings.textScreen.uITextResultTable,
					BaseData.getSettingsModuleValue("TextName"));
		}

		public void verifyNoRecordFoundAcknowledgeMessage() {
			// if (Playback.browserType == "Chrome")
			// {
			// popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			// }
			// else
			popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}
	}

	public class TextEntry {

		public TextSubjectTab textSubjectTab;
		public TemplateForTab templateForTab;
		public ReportsThatUseThisTextTab reportsThatUseThisTextTab;

		public TextEntry() {

			if ((this.textSubjectTab == null))
				this.textSubjectTab = new TextSubjectTab();

			if ((this.templateForTab == null))
				this.templateForTab = new TemplateForTab();

			if ((this.reportsThatUseThisTextTab == null))
				this.reportsThatUseThisTextTab = new ReportsThatUseThisTextTab();

		}

		public void clickSave() {
			uIMapSettings.textEntry.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapSettings.textEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void close() {
			uIMapSettings.textEntry.driver.close();
		}

		public void verifyRequiredAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyAttachmentTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.textEntry.uIAttachmentTab.isEnabled(),
					"Verify attachment Tab enabled");
		}

		public void clickAllTabs() {
			uIMapSettings.textEntry.uISubjectTab.click();
			uIMapSettings.textEntry.uIAttachmentTab.click();
			uIMapSettings.textEntry.uITemplatesForTab.click();
			uIMapSettings.textEntry.uIReportsThatUseThisTextTab.click();
		}

		public void clickSubjectTab() {
			uIMapSettings.textEntry.uISubjectTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickTemplatesForTab() {
			uIMapSettings.textEntry.uITemplatesForTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickReportsThatUseThisTextTab() {
			uIMapSettings.textEntry.uIReportsThatUseThisTextTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickDeleteIcon() {
			uIMapSettings.textEntry.uIDeleteButton.click();
		}

		public void verifyDeleteConfirmMessage() {
			if (Playback.browserType == "Chrome") {
				Playback.driver.switchTo().alert().accept();
			} else {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
		}

	}

	public class Juris {

		public Juris() {
			if (this.mJurisSubAgencyTab == null)
				this.mJurisSubAgencyTab = new JurisSubAgencyTab();

			if (this.mJurisSubAgencyDetailsTab == null)
				this.mJurisSubAgencyDetailsTab = new JurisSubAgencyDetailsTab();

			if (this.jusrisAddressTab == null)
				this.jusrisAddressTab = new JurisAddressTab();
		}

		public JurisSubAgencyTab mJurisSubAgencyTab;
		public JurisSubAgencyDetailsTab mJurisSubAgencyDetailsTab;
		public JurisAddressTab jusrisAddressTab;

		public void selectAtJuris() {
			uIMapSettings.juris.uIJurisDropdown.sendKeys(BaseData.getSettingsModuleValue("Juris"));
		}

		public void enterAtJurisName() {
			uIMapSettings.juris.uIJurisNameEdit.sendKeys(BaseData.getSettingsModuleValue("Juris"));
		}

		public void enterAtJurisPoliceDepartmentName() {
			uIMapSettings.juris.uIJurisPoliceDepartmentNameEdit.sendKeys(BaseData.getSettingsModuleValue(""));
		}

		public void enterAtJurisFireDepartmentName() {
			uIMapSettings.juris.uIJurisFireDepartmentNameEdit.sendKeys(BaseData.getSettingsModuleValue(""));
		}

		public void clickSaveButton() {
			uIMapSettings.juris.uIJurisSaveButton.click();
		}

		public void clickSaveNcloseButton() {
			uIMapSettings.juris.uIJurisSaveNcloseButton.click();
		}

		// region Navigate To Juris Tab

		public void navigateToSubAgnecyTab() {
			uIMapSettings.juris.jurisSubAgencyTab.uINavigateToSubAgencyTab.click();
		}

		public void navigateToSubAgnecyDetailsTab() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.uINavigateToSubAgencyDetailsTab.click();
		}

		public void saveButton() {
			uIMapSettings.juris.uIJurisSaveButton.click();
			popup.confirm.yes();
		}

		public void saveNcloseButton() {
			Playback.controlReadyThreadWait();
			uIMapSettings.juris.uIJurisSaveNcloseButton.click();
			popup.confirm.yes();
		}

		public void clickAddressTab() {
			uIMapSettings.juris.uIAddressTab.click();

		}

		public void verifyUpdateSuccessfulMessage() {

			verify.ExpectedValueIsTrue(
					uIMapSettings.juris.uIUpdateSuccessfulLabel.getText().contains("1003 - Update Successful"));
		}

	}

	public class JurisSubAgencyTab {
		public void enterAtSubAgencyCode() {
			uIMapSettings.juris.jurisSubAgencyTab.uISubAgencyCodeEdit
					.sendKeys(BaseData.getSettingsModuleValue("SubAgencyCode"));
		}

		public void enterAtSubAgencyName() {
			uIMapSettings.juris.jurisSubAgencyTab.uISubAgencyNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("SubAgencyName"));
		}

		public void clickAddButton() {
			uIMapSettings.juris.jurisSubAgencyTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapSettings.juris.jurisSubAgencyTab.uIClearButton.click();
		}

		public void selectRecordfromGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.juris.jurisSubAgencyTab.uISubAgencyGridTable, "Milwaukee Co Jail");
		}

		public void selectInactiveCheckBox() {
			uIMapSettings.juris.jurisSubAgencyTab.uIInactiveCheckBox.click();
		}

	}

	public class JurisSubAgencyDetailsTab {
		public JurisSADetailsContactDetailsTab mJurisSADetailsContactDetailsTab;
		public JurisSADetailsLogoTab mJurisSADetailsLogoTab;
		public JurisSADetailsAddressTab mJurisSADetailsAddressTab;
		public JurisSADetailsReportHeaderFooterTab mJurisSADetailsReportHeaderFooterTab;

		public JurisSubAgencyDetailsTab() {

			if (this.mJurisSADetailsContactDetailsTab == null)
				this.mJurisSADetailsContactDetailsTab = new JurisSADetailsContactDetailsTab();

			if (this.mJurisSADetailsLogoTab == null)
				this.mJurisSADetailsLogoTab = new JurisSADetailsLogoTab();

			if (this.mJurisSADetailsAddressTab == null)
				this.mJurisSADetailsAddressTab = new JurisSADetailsAddressTab();

			if (this.mJurisSADetailsReportHeaderFooterTab == null)
				this.mJurisSADetailsReportHeaderFooterTab = new JurisSADetailsReportHeaderFooterTab();
		}

		// region Navigate To Juris Tab
		public void navigateToConactDetailsTab() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uINavigateToContactDetailsTab
					.click();
		}

		public void navigateToLogoTab() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsLogoTab.uINavigateToLogoTab.click();
		}

		public void navigateToAddressTab() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsAddressTab.uINavigateToAddressTab.click();
		}

		public void navigateToReportHeaderFooterTab() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uINavigateToReportHeaderFooterTab
					.click();
		}

	}

	public class JurisAddressTab {

		public void selectAtAddressType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.juris.jusrisAddressTab.uIAddressTypeDropdown,
					BaseData.getSettingsModuleValue("AddressType"));
			uIMapSettings.juris.jusrisAddressTab.uIAddressTypeDropdown.sendKeys(Keys.TAB);
		}

		public void enterAtAddress() {
			uIMapSettings.juris.jusrisAddressTab.uIAddressEdit.sendKeys(BaseData.getSettingsModuleValue("Address"));
			uIMapSettings.juris.jusrisAddressTab.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void clickAddBUtton() {
			uIMapSettings.juris.jusrisAddressTab.uIAddButton.click();
		}

		public void verifyAtAddressInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapSettings.juris.jusrisAddressTab.uIJurisAddressTabTable,
					BaseData.getSettingsModuleValue("Address"));
			verify.ExpectedValueIsTrue(gridCell.getText().contains(BaseData.getSettingsModuleValue("Address")));
		}

	}

	public class JurisSADetailsContactDetailsTab {

		public void selectAtSubAgency() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uISubAgencyDropdown
					.sendKeys(BaseData.getSettingsModuleValue("SubAgency"));
		}

		public void enterAtCountyName() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uICountyNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("CountyName"));
		}

		public void enterAtAddress() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIAddressEdit
					.sendKeys(BaseData.getSettingsModuleValue("Address"));
		}

		public void enterAtCSZ() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uITownEdit
					.sendKeys(BaseData.getSettingsModuleValue("Town"));
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIStateDropdown
					.sendKeys(BaseData.getSettingsModuleValue("State"));
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIZipCodeEdit
					.sendKeys(BaseData.getSettingsModuleValue("ZIP"));
		}

		public void enterAtContactPF() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIContactPFEdit
					.sendKeys(BaseData.getSettingsModuleValue("ContactPF"));
		}

		public void enterAtORINo() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIORINoEdit
					.sendKeys(BaseData.getSettingsModuleValue("ORINo"));
		}

		public void enterAtContactName() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIContactLastNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ContactLastname"));
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIContactFirstNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ContactFirstname"));
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIContactMiddleNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ContactMiddlename"));
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIContactSuffixDrodown
					.sendKeys(BaseData.getSettingsModuleValue("ContactSuffixname"));
		}

		public void enterAtPhoneNo() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIPhoneNoEdit
					.sendKeys(BaseData.getSettingsModuleValue("PhoneNo"));
		}

		public void enterAtMobileNo() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIMobileNoEdit
					.sendKeys(BaseData.getSettingsModuleValue("MobileNo"));
		}

		public void enterAtFaxNo() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIFaxNoEdit
					.sendKeys(BaseData.getSettingsModuleValue("FaxNo"));
		}

		public void enterAtDefaultZip() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIDefaultZipEdit
					.sendKeys(BaseData.getSettingsModuleValue("DefaultZip"));
		}

		public void enterAtFirstEMail() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIFirstEMailEdit
					.sendKeys(BaseData.getSettingsModuleValue("FirstE-Mail"));
		}

		public void enterAtSecondEMail() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uISecondEMailEdit
					.sendKeys(BaseData.getSettingsModuleValue("SecondE-Mail"));
		}

		public void enterAtDefaultArea() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIDefaultAreaEdit
					.sendKeys(BaseData.getSettingsModuleValue("DefaultArea"));
		}

		public void enterAtRemarks() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIRemarksEdit
					.sendKeys(BaseData.getSettingsModuleValue("Remarks"));
		}

		public void clickAddButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIClearButton.click();
		}

		public void selectRecordfromGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsContactDetailsTab.uIContactDetailsGridTable,
					"MCJ - Milwaukee Co Jail");
		}

	}

	public class JurisSADetailsLogoTab {

		public void selectAtSubAgency() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsLogoTab.uISubAgencyDropdown
					.sendKeys(BaseData.getSettingsModuleValue("SubAgency"));
		}

		public void clickSelectButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsLogoTab.uISelectButton.click();
		}

		public void clickAddButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsLogoTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsLogoTab.uIClearButton.click();
		}

		public void selectRecordfromGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsLogoTab.uILogoGridTable,
					"MCJ - Milwaukee Co Jail");
		}

	}

	public class JurisSADetailsAddressTab {
		public void selectAtSubAgency() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsAddressTab.uISubAgencyDropdown
					.sendKeys(BaseData.getSettingsModuleValue("SubAgency"));
		}

		public void selectAtAddressType() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsAddressTab.uIAddressTypeDropdown
					.sendKeys(BaseData.getSettingsModuleValue("AddressType"));
		}

		public void enterAtAddress() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsAddressTab.uIAddressEdit
					.sendKeys(BaseData.getSettingsModuleValue("Address"));
		}

		public void clickAddButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsAddressTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsAddressTab.uIClearButton.click();
		}

		public void selectRecordfromGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsAddressTab.uIAddressGridTable,
					"MCJ - Milwaukee Co Jail");
		}

	}

	public class JurisSADetailsReportHeaderFooterTab {
		public void selectAtSubAgency() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uISubAgencyDropdown
					.sendKeys(BaseData.getSettingsModuleValue("SubAgency"));
		}

		public void clickReportHeaderButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIReportHeaderselectButton
					.click();
		}

		public void clickReportFooterButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIReportFooterselectButton
					.click();
		}

		public void clickPageHeaderButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIPageHeaderselectButton
					.click();
		}

		public void clickPageFooterButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIPageFooterselectButton
					.click();
		}

		public void clickWatermarkButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIWaterMarkselectButton
					.click();
		}

		public void clickAddButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIClearButton.click();
		}

		public void selectRecordfromGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.juris.jurisSubAgencyDetailsTab.jurisSADetailsReportHeaderFooterTab.uIReportHeaderFooterGridTable,
					"MCJ - Milwaukee Co Jail");
		}

	}

	public class TextSubjectTab {
		public void enterAtTextName() {
			uIMapSettings.textEntry.textSubjectTab.uITextNameEdit.sendKeys(BaseData.getSettingsModuleValue("TextName"));
		}

		public void enterAtRemarks() {
			uIMapSettings.textEntry.textSubjectTab.uIRemarksEdit.sendKeys(BaseData.getSettingsModuleValue("Remarks"));
		}

		public void enterSearchWords() {
			uIMapSettings.textEntry.textSubjectTab.uISearchWordsEdit.sendKeys("Automation");
		}

		public void enterRichText() {
			Playback.waitForPageLoad();
			uIMapSettings.textEntry.textSubjectTab.uISubjectRichTabTextEdit.click();
			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapSettings.textEntry.textSubjectTab.uISubjectRichTabTextEdit).click();
			actions.sendKeys(Randomized.randomAlphanumericSpecialCharsString(500)).build().perform();
			Playback.waitForControlReady();

		}

		public void verifyTextNameAsBolo() {
			verify.ExpectedPropertyValueIsEqual("BOLO",

					uIMapSettings.textEntry.textSubjectTab.uITextNameEdit.getAttribute("value"));
		}

		public void updateExpiryDateAsFutureYear() {
			uIMapSettings.textEntry.textSubjectTab.uIExpireDateEdit.clear();
			uIMapSettings.textEntry.textSubjectTab.uIExpireDateEdit.click();
			uIMapSettings.textEntry.textSubjectTab.uIExpireDateEdit.sendKeys(Randomized.getFutureDateByMonth(20));
			uIMapSettings.textEntry.textSubjectTab.uIExpireDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtRichTextForRecurringViolations() {
			Playback.waitForPageLoad();
			uIMapSettings.textEntry.textSubjectTab.uISubjectRichTabTextEdit.click();
			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapSettings.textEntry.textSubjectTab.uISubjectRichTabTextEdit).click();
			actions.sendKeys(Keys.HOME);
			actions.sendKeys(Keys.PAGE_UP);
			actions.sendKeys(BaseData.getTestContextData("RecurringViolations")).build().perform();
			Playback.waitForControlReady();

		}

		public void enterAtRichTextForInspectionAppealsTo() {
			Playback.waitForPageLoad();
			uIMapSettings.textEntry.textSubjectTab.uISubjectRichTabTextEdit.click();
			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapSettings.textEntry.textSubjectTab.uISubjectRichTabTextEdit).click();
			actions.sendKeys(Keys.HOME);
			actions.sendKeys(Keys.PAGE_UP);
			actions.sendKeys(BaseData.getTestContextData("InspectionAppealsTo")).build().perform();
			Playback.waitForControlReady();
		}
	}

	public class TemplateForTab {
		public void clickAddButton() {
			uIMapSettings.textEntry.templateForTab.uIAddButton.click();
		}

		public void verifyRequiredAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void enterAtScreenID() {
			uIMapSettings.textEntry.templateForTab.uITemplateForCodeEdit
					.sendKeys(BaseData.getSettingsModuleValue("ScreenID"));
			uIMapSettings.textEntry.templateForTab.uITemplateForCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtScreenID(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ScreenID"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.textEntry.templateForTab.uITemplateForTabResultTable, "Screen ID", rowIndex));
		}

		public void verifyAtScreenName(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ScreenName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.textEntry.templateForTab.uITemplateForTabResultTable, "Screen Name",
							rowIndex));
		}

	}

	public class ReportsThatUseThisTextTab {
		public void clickAddButton() {
			uIMapSettings.textEntry.reportsThatUseThisTextTab.uIAddButton.click();
		}

		public void verifyRequiredAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void enterAtReportName() {
			uIMapSettings.textEntry.reportsThatUseThisTextTab.uIReportNameCodeEdit
					.sendKeys(BaseData.getSettingsModuleValue("ReportName"));
			uIMapSettings.textEntry.reportsThatUseThisTextTab.uIReportNameCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtReportName(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ReportName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.textEntry.reportsThatUseThisTextTab.uIReportsTabResultTable, "Report Name",
							rowIndex));
		}

		public void selectAtScreenID() {
			uIMapSettings.textEntry.reportsThatUseThisTextTab.uIReportNameLookupButton.click();
			popup.kPICodedLookup.kPIHelpSelect(BaseData.getSettingsModuleValue("ScreenID"));
		}

		public void verifyAtScreenID(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ScreenID"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.textEntry.reportsThatUseThisTextTab.uIReportsTabResultTable, "Screen ID",
							rowIndex));
		}
	}

	public class Disposition {
		public void clickAddNew() {
			uIMapSettings.disposition.uIAddNewLink.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtDisposition() {
			uIMapSettings.disposition.uIDispositionCodeEdit.sendKeys

			(BaseData.getSettingsModuleValue("Disposition"));
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption

			(uIMapSettings.disposition.uITypeComboBox, BaseData.getSettingsModuleValue("Type"));
			uIMapSettings.disposition.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapSettings.disposition.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtDispoationInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue

			("Disposition"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.disposition.uIDispositionResultTable,

							"Disposition", rowIndex));
		}

		public void verifyAtTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("Type"),

					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.disposition.uIDispositionResultTable, "Type",

							rowIndex));
		}
	}

	public class JobsScreen {
		public void clickSearch() {
			uIMapSettings.jobsScreen.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtJobName() {
			uIMapSettings.jobsScreen.uIJobNameEdit.sendKeys(BaseData.getSettingsModuleValue("JobName"));
		}

		public void clickAtJobNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText

			(uIMapSettings.jobsScreen.uIJobsResultTable, BaseData.getSettingsModuleValue

			("JobName"));
			Playback.controlReadyThreadWait();
		}

		public void clickAddNew() {
			uIMapSettings.jobsScreen.uIAddNewLink.click();
			Playback.waitForControlReady();
		}

		public void clearJobName() {
			Playback.controlReadyThreadWait();
			uIMapSettings.jobsScreen.uIJobNameEdit.clear();
		}

		public void clickIncludeInactiveCheckBox() {
			uIMapSettings.jobsScreen.uIInactiveCheckbox.click();
		}

		public void verifyAtJobNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapSettings.jobsScreen.uIJobsResultTable, "Job Name", 0),
					BaseData.getSettingsModuleValue("JobName"));
		}

		public void selectAtJobType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.jobsScreen.uIJobTypeCombobox, BaseData.getSettingsModuleValue("JobType"));
			
		}

		public void selectAtDBName() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.jobsScreen.uIDBNameComboBox, BaseData.getSettingsModuleValue("DBName"));
			
		}
		
		public void verifyJobNameInGrid() {
			verify.ExpectedValueIsTrue(uIMapSettings.jobsScreen.uIJobsResultTable.getText() != null);
		}

	}

	public class JobEntry {
		public ParameterJobScreenTab parameterJobScreenTab;
		public NotificationJobScreenTab notificationJobScreenTab;

		public JobEntry() {
			if (this.parameterJobScreenTab == null)
				this.parameterJobScreenTab = new ParameterJobScreenTab();

			if (this.notificationJobScreenTab == null)
				this.notificationJobScreenTab = new NotificationJobScreenTab();
		}

		public void verifyAtJobName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("JobName"),
					uIMapSettings.jobEntry.uIJobNameEdit.getAttribute("value"));
		}

		public void clickScheduleTab() {
			uIMapSettings.jobEntry.uIScheduleTab.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtEndDate() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIEndDateEdit.click();
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIEndDateEdit.sendKeys((Keys.CONTROL + "a" + Keys.CONTROL));
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIEndDateEdit.sendKeys(Keys.DELETE);
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIEndDateEdit
					.sendKeys(BaseData.getSettingsModuleValue("EndDate"));
		}

		public void saveScreen() {
			uIMapSettings.jobEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void close() {
			uIMapSettings.jobEntry.driver.close();
		}

		public void verifyAtEndDate() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("EndDate"),

					uIMapSettings.jobEntry.scheduleJobScreenTab.uIEndDateEdit.getAttribute("value"));
		}

		public void enterAtJobName() {
			uIMapSettings.jobEntry.uIJobNameEdit.sendKeys(BaseData.getSettingsModuleValue("JobName"));
		}

		public void selectAtJobType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.jobEntry.uIJobTypeCombobox,
					BaseData.getSettingsModuleValue("JobType"));
		}

		public void enterAtReportID() {
			uIMapSettings.jobEntry.uIReportIDCodeEdit.sendKeys(BaseData.getSettingsModuleValue("ReportID"));
			uIMapSettings.jobEntry.uIReportIDCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtFormName() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.jobEntry.uIFormNameCombobox,
					BaseData.getSettingsModuleValue("FormName"));
		}

		public void tabStartDate() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIStartDateEdit.click();
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIStartDateEdit.sendKeys(Keys.TAB);
		}

		public void clickRecurrenceCheckbox() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIRecurrenceCheckbox.click();
		}

		public void enterEveryDaysAs1() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIEveryDaysEdit.sendKeys("1");
		}

		public void clickHourRadiobutton() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIHourRadiobutton.click();
		}

		public void clickDailyRadiobutton() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIDailyRadiobutton.click();
		}

		public void clickRunJobButton() {
			uIMapSettings.jobEntry.uIRunJobButton.click();
		}

		public void clickReCalculateCheckbox() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIReCalculateCheckbox.click();
		}

		public void clickParameterTab() {
			uIMapSettings.jobEntry.uIParameterTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickNotificationTab() {
			uIMapSettings.jobEntry.uINotificationTab.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyInactivePopupAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge
						.okWithExpectedMessage("The selected report is inactive. Please select an active report");
			}

			else {
				popup.switchToAcknowledge();
				Playback.gridLoadThreadWait();
				popup.acknowledge
						.okWithExpectedMessage("The selected report is inactive. Please select an active report");
			}

		}

		public void clickInactiveCheckBox() {
			uIMapSettings.jobEntry.uIInactiveCheckbox.click();
		}

		public void clickWeeklyRadiobutton() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIWeeklyRadiobutton.click();
		}

		public void enterAtEvery() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIEveryEdit.sendKeys(BaseData.getSettingsModuleValue("Every"));
		}

		public void clickMondayCheckBox() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIMondayCheckBox.click();
		}

		public void clickTuesdayCheckBox() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uITuesdayCheckBox.click();
		}

		public void clickWednesdayCheckBox() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIWednesdayCheckBox.click();
		}

		public void clickThursdayCheckBox() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIThursdayCheckBox.click();
		}

		public void clickFridayCheckBox() {
			uIMapSettings.jobEntry.scheduleJobScreenTab.uIFridayCheckBox.click();
		}

		public void saveNClose() {
			uIMapSettings.jobEntry.uISaveandCloseButton.click();
			popup.confirm.yes();
			
		}

	}

	public class ParameterJobScreenTab {
		public void enterAtParameterName() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName"));
		}

		public void enterAtParameterValue() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit.clear();
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterValue"));
		}

		public void clickAdd() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIAddbutton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtParameterNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}

		public void enterAtParameterName1() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName1"));
		}

		public void enterAtParameterValue1() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit.clear();
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterValue1"));
		}

		public void enterAtParameterName2() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName2"));
		}

		public void enterAtParameterValue2() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit.clear();
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterValue2"));
		}

		public void enterAtParameterName3() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName3"));
		}

		public void enterAtParameterValue6() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit.clear();
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamValueEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterValue6"));
		}

		public void enterAtParameterName4() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName4"));
		}

		public void enterAtParameterName5() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName5"));
		}

		public void enterAtParameterName6() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName6"));
		}

		public void enterAtParameterName7() {
			uIMapSettings.jobEntry.parameterJobScreenTab.uIParamNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("ParameterName7"));
		}

		public void verifyAtParameterName1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}

		public void verifyAtParameterName2InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}

		public void verifyAtParameterName3InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName3"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}

		public void verifyAtParameterName4InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName4"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}

		public void verifyAtParameterName5InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName5"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}

		public void verifyAtParameterName6InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName6"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}

		public void verifyAtParameterName7InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("ParameterName7"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.jobEntry.parameterJobScreenTab.uIParameterResultTable, "Param Name",
							rowIndex));
		}
	}

	public class NotificationJobScreenTab {
		public void enterAtNotifyEmail() {
			uIMapSettings.jobEntry.notificationJobScreenTab.uINotifyEmailIDEdit.clear();
			uIMapSettings.jobEntry.notificationJobScreenTab.uINotifyEmailIDEdit
					.sendKeys(BaseData.getSettingsModuleValue("NotifyEmail"));
		}

		public void clickAdd() {
			uIMapSettings.jobEntry.notificationJobScreenTab.uIAddbutton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtServerFolder() {
			uIMapSettings.jobEntry.notificationJobScreenTab.uIServerFolderEdit.clear();
			uIMapSettings.jobEntry.notificationJobScreenTab.uIServerFolderEdit
					.sendKeys(BaseData.getSettingsModuleValue("ServerFolder"));
		}
	}

	public class EmailTemplate {
		public void ClickAddNewButton() {
			uIMapSettings.emailTemplate.uIAddNewButton.click();
		}

	}

	public class EmailTemplateEntry {

		public void EnterAtTemplateName() {
			uIMapSettings.emailTemplateEntry.uITemplateNameEdit
					.sendKeys(BaseData.getSettingsModuleValue("TemplateName"));
		}

		public void EnterSubject() {
			uIMapSettings.emailTemplateEntry.uISubjectEdit.sendKeys(Randomized.randomString(5));
		}

		public void EnterContentInTextBox() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapSettings.emailTemplateEntry.uITextEdit).click();
			actions.sendKeys(Randomized.randomString(15)).build().perform();
			Playback.controlReadyThreadWait();
		}

		public void SaveNClose() {
			uIMapSettings.emailTemplateEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void save() {
			uIMapSettings.emailTemplateEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyAdditionSuccessfulMessageInStatusBar() {
			String message = uIMapSettings.emailTemplateEntry.uIStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(message, "1002 - Addition Successful");
		}

	}

	public class FormRepositoryScreen {

		public void SelectAtEmailTemplate() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.formRepositoryScreen.uIEmailTemplateComboBox,
					BaseData.getSettingsModuleValue("EmailTemplate"));
		}

		public void SaveNClose() {
			uIMapSettings.formRepositoryScreen.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

	}

	public class FireStationSearch {
		public void ClickAddNewButton() {
			uIMapSettings.fireStationSearch.uIAddNewButton.click();
		}

		public void VerifyAtStationCode(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("StationCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.fireStationSearch.uIFireStationGrid, "Station Code", rowIndex));
		}

		public void VerifyAtStationName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("StationName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.fireStationSearch.uIFireStationGrid, "Station Name", rowIndex));
		}

		public void VerifyAtDistrict(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("District"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.fireStationSearch.uIFireStationGrid, "District", rowIndex));
		}

		public void enterAtStationCodeEdit() {
			uIMapSettings.fireStationSearch.uIFireStationCodeEdit
					.sendKeys(BaseData.getSettingsModuleValue("StationCode"));
		}

		public void clickSearchButton() {
			uIMapSettings.fireStationSearch.uISearchButton.click();
		}
	}

	public class FireStationEntry {
		public void EnterAtStation() {
			uIMapSettings.fireStationEntry.uIStationTextBox.sendKeys(BaseData.getSettingsModuleValue("Station"));
			uIMapSettings.fireStationEntry.uIStationTextBox.sendKeys(Keys.TAB);
		}

		public void SelectAtDistrict() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.fireStationEntry.uIDistrictDropDown,
					BaseData.getSettingsModuleValue("District"));
			uIMapSettings.fireStationEntry.uIDistrictDropDown.sendKeys(Keys.TAB);
		}

		public void EnterAtStationName() {
			uIMapSettings.fireStationEntry.uIStationNameTextBox
					.sendKeys(BaseData.getSettingsModuleValue("StationName"));
		}

		public void EnterAtEmail() {
			uIMapSettings.fireStationEntry.uIEmailTextbox.sendKeys(BaseData.getSettingsModuleValue("Email"));
		}

		public void Save() {
			uIMapSettings.fireStationEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSave() {
			uIMapSettings.fireStationEntry.uISaveButton.click();
		}

		public void clickSaveNClose() {
			uIMapSettings.fireStationEntry.uISaveAndCloseButton.click();
		}

		public void SaveNClose() {
			uIMapSettings.fireStationEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void verifyAdditionSuccessfulStatusMessage() {
			String text = uIMapSettings.fireStationEntry.uIStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1002 - Addition successful");
		}

		public void verifyUpdateSuccessfulStatusMessage() {
			String text = uIMapSettings.fireStationEntry.uIStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1003 - Update successful");
		}
	}

	public class CFSCodeEntry {

		public CFSCodeCADTab cFSCodeCADTab;
		public CFSCodeManagementTab cFSCodeManagementTab;
		public CFSCodeOthersTab cFSCodeOthersTab;
		public CFSCodeTasksTab cFSCodeTasksTab;
		public CFSCodeSOPTab cFSCodeSOPTab;
		public CFSCodeLinkedCFSTab cFSCodeLinkedCFSTab;

		public CFSCodeEntry() {
			if (cFSCodeCADTab == null)
				cFSCodeCADTab = new CFSCodeCADTab();
			if (cFSCodeManagementTab == null)
				cFSCodeManagementTab = new CFSCodeManagementTab();
			if (cFSCodeOthersTab == null)
				cFSCodeOthersTab = new CFSCodeOthersTab();
			if (cFSCodeTasksTab == null)
				cFSCodeTasksTab = new CFSCodeTasksTab();
			if (cFSCodeSOPTab == null)
				cFSCodeSOPTab = new CFSCodeSOPTab();
			if (cFSCodeLinkedCFSTab == null)
				cFSCodeLinkedCFSTab = new CFSCodeLinkedCFSTab();

		}

		public void clickEmailIcon() {
			Playback.controlReadyThreadWait();
			uIMapSettings.cFSCodeEntry.uIEmailIcon.click();

		}

		public void EnterAtCFSCode() {
			uIMapSettings.cFSCodeEntry.uICFSCodeEdit.sendKeys(BaseData.getSettingsModuleValue("CFSCode"));
		}

		public void SelectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.cFSCodeEntry.uITypeComboBox,
					BaseData.getSettingsModuleValue("Type"));
			uIMapSettings.cFSCodeEntry.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtDescription() {
			uIMapSettings.cFSCodeEntry.uIDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("Description"));
		}

		public void EnterAtShortDescription() {
			uIMapSettings.cFSCodeEntry.uIShortDescriptionEdit
					.sendKeys(BaseData.getSettingsModuleValue("ShortDescription"));
		}

		public void EnterAtCFSClass() {
			uIMapSettings.cFSCodeEntry.uICFSClassCodeEdit.sendKeys(BaseData.getSettingsModuleValue("CFSClass"));
			uIMapSettings.cFSCodeEntry.uICFSClassCodeEdit.sendKeys(Keys.TAB);
		}

		public void SaveScreen() {
			uIMapSettings.cFSCodeEntry.uISaveButton.click();
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
				Playback.popupThreadWait();
			} else {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
				Playback.popupThreadWait();
			}
		}

		public void Close() {
			uIMapSettings.cFSCodeEntry.driver.close();
			Playback.popupThreadWait();
		}

		public void SelectAtServiceType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.cFSCodeEntry.uIServiceTypeComboBox,
					BaseData.getSettingsModuleValue("ServiceType"));
			uIMapSettings.cFSCodeEntry.uIServiceTypeComboBox.sendKeys(Keys.TAB);
		}

		public void ClickCADTab() {
			uIMapSettings.cFSCodeEntry.uICADTab.click();
		}

		public void ClickManagementTab() {
			uIMapSettings.cFSCodeEntry.uIManagementTab.click();
		}

		public void ClickOthersTab() {
			uIMapSettings.cFSCodeEntry.uIOthersTab.click();
		}

		public void ClickSOPTab() {
			uIMapSettings.cFSCodeEntry.uISOPTab.click();
		}

		public void ClickTasksTab() {
			uIMapSettings.cFSCodeEntry.uITasksTab.click();
		}

		public void ClickLinkedCFSTab() {
			uIMapSettings.cFSCodeEntry.uILinkedCFSTab.click();
		}

		public void verifyTasksTabDisplayed() {
			verify.ExpectedValueIsTrue(uIMapSettings.cFSCodeEntry.uITasksTab.isDisplayed());

		}

		public String getAlarmValueInDropdown() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapSettings.cFSCodeEntry.uIAlarmComboBox);
			return selectedItem;
		}

		public void verifyAtCFSClassDescription() {
			String attribute = uIMapSettings.cFSCodeEntry.uICFSClassDescription.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getSettingsModuleValue("CFSClassDescription")));
		}

		public void verifyDoNotPurgeCheckBoxIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapSettings.cFSCodeEntry.uIDoNotPurgeCheckBox.isDisplayed());

		}

	}

	public class CFSCodeManagementTab {

	}

	public class CFSCodeTasksTab {

		public void selectAtCopyTaskFromComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uICopyTaskFromComboBox,
					BaseData.getSettingsModuleValue("CopyTaskFrom"));
		}

		public void clickCopyButton() {
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uICopyButton.click();
		}

		public void SelectAtTaskCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uITaskcodeComboBox,
					BaseData.getSettingsModuleValue("TaskCode"));
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uITaskcodeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtTaskCode1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uITaskcodeComboBox,
					BaseData.getSettingsModuleValue("TaskCode1"));
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uITaskcodeComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtDueNoOfDays() {
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uIDueWithinNumberEdit
					.sendKeys(BaseData.getSettingsModuleValue("DueNoOfDays"));
		}

		public void EnterSortOrderAs0() {
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uISortOrderEdit.sendKeys("0");
		}

		public void EnterSortOrderAs1() {
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uISortOrderEdit.sendKeys("1");
		}

		public void verifyTaskCodeAsMandatory() {
			String clr = "rgba(153, 0, 0, 1)";
			String color = uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uITaskCodeLable.getCssValue("color");
			verify.ExpectedPropertyValueIsEqual(clr, color);
		}

		public void verifyTaskDetailsAsMandatory() {
			String clr = "rgba(153, 0, 0, 1)";
			String color = uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uITaskDetailsLable.getCssValue("color");
			verify.ExpectedPropertyValueIsEqual(clr, color);
		}

		public void enterAtTaskDetails() {
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uITaskDetailsEdit
					.sendKeys(BaseData.getSettingsModuleValue("TaskDetails"));
		}

		public void clickAddButton() {
			uIMapSettings.cFSCodeEntry.cFSCodeTasksTab.uIAddButton.click();
		}

		public void verifyRequiredEntriesAreMissingAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

	}

	public class CFSCodeCADTab {
		public void TabDispatchPriority() {
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIDispatchPriority1Edit.sendKeys(Keys.TAB);
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIDispatchPriority2Edit.sendKeys(Keys.TAB);
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIDispatchPriority3Edit.sendKeys("1");
		}

		public void ClickDoNotSendSMSFromCTCheckbox() {
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIDoNotSendSMSCTCheckBox.click();
		}

		public void VerifyDoNotSendSMSFromCTCheckboxDisplayed() {
			verify.ExpectedValueIsTrue(uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIDoNotSendSMSCTCheckBox.isDisplayed());
		}

		public void Click24HRReportableCheckbox() {
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uI24HRReportableCheckBox.click();
		}

		public void ClickDisplayHAZMATFlagsCheckbox() {
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIDisplayHAZMATFlagsCheckBox.click();
		}

		public void ClickDetailedCFSRequiredCheckbox() {
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIDetailedCFSRequiredCheckBox.click();
		}

		public void SelectReportCode() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIReportCodeComboBox);
			uIMapSettings.cFSCodeEntry.cFSCodeCADTab.uIReportCodeComboBox.sendKeys(Keys.TAB);
		}
	}

	public class CFSCodeOthersTab {
		public void SelectReportingStructure2() {
			uIMapSettings.cFSCodeEntry.cFSCodeOthersTab.uIReportingStructure2Lookup.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void SelectReportingStructure3() {
			uIMapSettings.cFSCodeEntry.cFSCodeOthersTab.uIReportingStructure3Lookup.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void SelectTrafficCFSClass() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapSettings.cFSCodeEntry.cFSCodeOthersTab.uITrafficCFSClassComboBox);
			uIMapSettings.cFSCodeEntry.cFSCodeOthersTab.uITrafficCFSClassComboBox.sendKeys(Keys.TAB);
		}

		public void ClickCreateCallCFSEnteredCheckBox() {
			uIMapSettings.cFSCodeEntry.cFSCodeOthersTab.uICreateCallCFSEnteredCheckBox.click();
		}
	}

	public class CFSCodeSOPTab {
		public void SelectSOPTypeAsAllCondition() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.cFSCodeEntry.cFSCodeSOPTab.uISOPTypeComboBox, "All Condition");
			uIMapSettings.cFSCodeEntry.cFSCodeSOPTab.uISOPTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectTextName() {
			uIMapSettings.cFSCodeEntry.cFSCodeSOPTab.uITextNameLookup.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void ClickAdd() {
			uIMapSettings.cFSCodeEntry.cFSCodeSOPTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifySOPTypeAsAllConditionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("All Condition",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapSettings.cFSCodeEntry.cFSCodeSOPTab.uISOPTabResultTable, "SOP Type", rowIndex));
		}
	}

	public class CFSCodeLinkedCFSTab {
		public void SelectPoliceCFS() {
			uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIPoliceOEMOtherCFSLookup.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void SelectPoliceServiceTypeAsPolice() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIPoliceServiceTypeComboBox, "1 - Police");
			uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIPoliceServiceTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectFireCFS() {
			uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIFireEMSOtherCFSLookup.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void SelectFireServiceTypeAsFire() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIFireServiceTypeComboBox, "F - Fire");
			uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIFireServiceTypeComboBox.sendKeys(Keys.TAB);
		}

		public void ClickAdd() {
			uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyFireCFSDisabled() {
			verify.ExpectedValueIsTrue(uIMapSettings.cFSCodeEntry.cFSCodeLinkedCFSTab.uIFireCFSCodeEdit
					.getAttribute("class").contains("textboxInactive"));
		}
	}

	public class HazMatGuide {
		public void ClickAddNew() {
			uIMapSettings.hazMatGuide.uIAddNewLink.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtChemicalName() {
			uIMapSettings.hazMatGuide.uIChemicalNameEdit.sendKeys(BaseData.getSettingsModuleValue("ChemicalName"));

		}

		public void selectRowByAtChemicalNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.hazMatGuide.uIHazMatResultTable, BaseData.getSettingsModuleValue("ChemicalName"));
		}

		public void clickSearch() {
			uIMapSettings.hazMatGuide.uISearchButton.click();
		}
	}

	public class HazMatEntry {
		public void EnterAtChemicalName() {
			uIMapSettings.hazMatEntry.uIChemicalNameEdit.sendKeys(BaseData.getSettingsModuleValue("ChemicalName"));
		}

		public void EnterDOTID() {
			uIMapSettings.hazMatEntry.uIDOTIDEdit.sendKeys(String.valueOf(Randomized.getRandomNumber(3)));
		}

		public void EnterDOTGuide() {
			uIMapSettings.hazMatEntry.uIDOTGuideEdit.sendKeys(Randomized.randomString(15));
		}

		public void EnterComments() {
			uIMapSettings.hazMatEntry.uICommentEdit.sendKeys(Randomized.randomString(50));
		}

		public void verifyInfoIconNotDisplayed() {
			// *[contains(@src,'custinfo_Pursuit.gif')]
			List<WebElement> allElements = Playback.driver.findElements(By.xpath("//*[contains(@src,'.gif')]"));
			for (WebElement elem : allElements) {
				String value = elem.getAttribute("src");
				verify.ExpectedValueIsNotTrue(value.contains("custinfo_Pursuit"));
			}
		}

		public void Save() {
			uIMapSettings.hazMatEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapSettings.hazMatEntry.uISaveandCloseButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapSettings.hazMatEntry.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void clickRefreshIcon() {
			uIMapSettings.hazMatEntry.uIResetButton.click();
		}
	}

	public class QAForms {
		public void selectManageRepositoryUsingFormRef() {
			objectIdentification.manualIdentify.selectContextMenuItemInTheGridRow(uIMapSettings.qaForms.uIGridTable,
					BaseData.getGeoModuleValue("FormRef"), "Manage Repository");
		}

		public void clickOnSearch() {
			uIMapSettings.qaForms.uISearchButton.click();

		}

		public void clickOnGridrow() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();

			objectIdentification.randomIdentify.selectRandomGridRow(uIMapSettings.qaForms.uIGridTable);
		}

		public void clickAddNew() {
			uIMapSettings.qaForms.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtFormRef() {
			Playback.controlReadyThreadWait();
			uIMapSettings.qaForms.uIFormRefNo.sendKeys(BaseData.getSettingsModuleValue("FormRefNo"));

		}

		public void selectCheckBoxOfTheRowByFormRefNO() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapSettings.qaForms.uIGridTable,
					BaseData.getSettingsModuleValue("FormRefNo"));

		}

		public void selectCheckBoxOfTheRowByFormRefNO1() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapSettings.qaForms.uIGridTable,
					BaseData.getSettingsModuleValue("FormRefNo1"));

		}

		public void clickManageRepository() {
			Playback.controlReadyThreadWait();
			uIMapSettings.qaForms.uIManageRepositoryButton.click();

		}

		public void enterAtFormNameEdit() {
			uIMapSettings.qaForms.uIFormNameEdit.click();
			uIMapSettings.qaForms.uIFormNameEdit.clear();
			uIMapSettings.qaForms.uIFormNameEdit.sendKeys(BaseData.getSettingsModuleValue("FormName"));
		}

		public void enterAtFormNameEdit1() {
			uIMapSettings.qaForms.uIFormNameEdit.click();
			uIMapSettings.qaForms.uIFormNameEdit.clear();
			uIMapSettings.qaForms.uIFormNameEdit.sendKeys(BaseData.getSettingsModuleValue("FormName1"));
		}

		public void enterAtFormNameEdit2() {
			uIMapSettings.qaForms.uIFormNameEdit.click();
			uIMapSettings.qaForms.uIFormNameEdit.clear();
			uIMapSettings.qaForms.uIFormNameEdit.sendKeys(BaseData.getSettingsModuleValue("FormName2"));
		}

		public void selectCheckBoxOfTheRowByFormName() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapSettings.qaForms.uIGridTable,
					BaseData.getSettingsModuleValue("FormName"));

		}

		public void selectCheckBoxOfTheRowByFormName1() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapSettings.qaForms.uIGridTable,
					BaseData.getSettingsModuleValue("FormName1"));

		}

		public void selectCheckBoxOfTheRowByFormName2() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapSettings.qaForms.uIGridTable,
					BaseData.getSettingsModuleValue("FormName2"));

		}

		public void enterAtScreenID() {
			uIMapSettings.qaForms.uIScreenIdEdit.sendKeys(BaseData.getSettingsModuleValue("ScreenID"));
			uIMapSettings.qaForms.uIScreenIdEdit.sendKeys(Keys.TAB);
		}

		public void VerifyNoRecordAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void verifyScreenIDDescription() {
			String text = uIMapSettings.qaForms.uIScreenIDDescription.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(text, BaseData.getSettingsModuleValue("ScreenIDDescription"));
		}

	}

	public class ApprovalParameter {

		public void selectAtApprovalProcess() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.approvalParameter.uIApprovalProcessComboBox,
					BaseData.getSettingsModuleValue("ApprovalProcess"));
			Playback.pageLoadThreadWait();
		}

		public void setEnableApprovalProcessAsTrue() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapSettings.approvalParameter.uIEnableApprovalProcessComboBox, "True");
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesIfWindowExist();
			}

			else {
				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yesIfWindowExist();
			}
		}

		public void saveScreen() {
			uIMapSettings.approvalParameter.uIsaveButton.click();
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yes();
			}

			else {
				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yes();
			}
		}

		public void selectAtApprovalProcess1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapSettings.approvalParameter.uIApprovalProcessComboBox,
					BaseData.getSettingsModuleValue("ApprovalProcess1"));
			Playback.pageLoadThreadWait();

			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesIfWindowExist();
			}

			else {
				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yesIfWindowExist();
			}

		}

		public void closeScreen() {
			uIMapSettings.approvalParameter.driver.close();
		}

	}

	public class ReportRepository {
		public void clickSearch() {
			uIMapSettings.reportRepository.uISearchButton.click();
		}

		public void selectTypeAsForm() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.reportRepository.uITypeComboBox,
					"Form");
		}

		public void enterScreenIDAs2544() {
			uIMapSettings.reportRepository.uIScreenIDEdit.clear();
			uIMapSettings.reportRepository.uIScreenIDEdit.sendKeys("2544");
			uIMapSettings.reportRepository.uIScreenIDEdit.sendKeys(Keys.TAB);
		}

		public void enterScreenIDAs1387() {
			uIMapSettings.reportRepository.uIScreenIDEdit.clear();
			uIMapSettings.reportRepository.uIScreenIDEdit.sendKeys("1387");
		}

		public void selectCheckBoxInGrid() {
			objectIdentification.randomIdentify
					.selectRandomGridRowCheckbox(uIMapSettings.reportRepository.uIReportRepositoryResultTable);
		}

		public void close() {
			uIMapSettings.reportRepository.driver.close();
		}

		public void selectAtGridrowByName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.reportRepository.uIReportRepositoryResultTable,
					BaseData.getSettingsModuleValue("Name"));
		}

		public void selectGridrow() {
			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapSettings.reportRepository.uIReportRepositoryResultTable);
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.reportRepository.uITypeComboBox,
					BaseData.getSettingsModuleValue("Type"));

		}

		public void selectAtType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.reportRepository.uITypeComboBox,
					BaseData.getSettingsModuleValue("Type1"));

		}

		public void selectAtGridrowByName1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.reportRepository.uIReportRepositoryResultTable,
					BaseData.getSettingsModuleValue("Name1"));
		}
	}

	public class ReportRepositoryEntry {

		public void clickSelectButton() {
			Playback.controlReadyThreadWait();
			uIMapSettings.reportRepositoryEntry.uIFileSelectButton.click();
			Playback.controlReadyThreadWait();

		}

		public void clickUploadPDFButton() {
			Playback.controlReadyThreadWait();
			uIMapSettings.reportRepositoryEntry.uIUploadPDF.click();
			Playback.controlReadyThreadWait();

		}

		public void verifyUploadedSuccessfulFooterStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapSettings.reportRepositoryEntry.uIBottomMesssageTextView.getText()
					.contains("Successfully file uploaded the into above uploaded path"));
		}

		public void selectPDFAtTestcaseID() {
			String TestCaseID = BaseData.getSettingsModuleValue("TestCaseID");
			objectIdentification.filesHandle.fileAttach.fileUpload(TestCaseID);
		}

		public void close() {
			// TODO Auto-generated method stub
			uIMapSettings.reportRepositoryEntry.driver.close();
		}

		public void selectPDFFile() {
			objectIdentification.filesHandle.fileAttach.fileUploadAutoIt("Crash.pdf");

		}

		public void selectRDLFile() {
			objectIdentification.filesHandle.fileAttach.fileUploadAutoIt("Journal.rdl");
		}

	}

	public class CodedMap {

		public void selectAtInterface() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.codedMap.uIInterfaceDropDown,
					BaseData.getSettingsModuleValue("Interface"));
			uIMapSettings.codedMap.uIInterfaceDropDown.sendKeys(Keys.TAB);

		}

		public void clickAddNewButton() {
			uIMapSettings.codedMap.uIAddNewButton.click();
		}

		public void verifyAtInterfaceDropdownList() {
			uIMapSettings.codedMap.uIInterfaceDropDown.click();
			List<String> dropDownValues = objectIdentification.manualIdentify
					.getDropDownValues(uIMapSettings.codedMap.uIInterfaceDropDown);
			verify.ExpectedValueIsTrue(dropDownValues.contains(BaseData.getSettingsModuleValue("Interface")));

		}

	}

	public class CodedMapDetail {

		public void enterAtCodeType() {
			uIMapSettings.codedMapDetail.uICodeTypeEdit.sendKeys(BaseData.getSettingsModuleValue("CodeType"));
			uIMapSettings.codedMapDetail.uICodeTypeEdit.sendKeys(Keys.TAB);
		}

		public void clickAddNew() {
			uIMapSettings.codedMapDetail.uIAddNewButton.click();
		}

		public void enterAtPopUpPhoenixValue() {
			uIMapSettings.codedMapDetail.uIPopUpPhoenixValueEdit
					.sendKeys(BaseData.getSettingsModuleValue("PhoenixValue"));
			uIMapSettings.codedMapDetail.uIPopUpPhoenixValueEdit.sendKeys(Keys.TAB);
		}

		public void clickPopUpPhoenixValueSearchIcon() {
			uIMapSettings.codedMapDetail.uIPopUpPhoenixValueSearchIcon.click();
		}

		public void enterAtMapCodeValue() {
			uIMapSettings.codedMapDetail.uIPopUpMapCodeValueEdit
					.sendKeys(BaseData.getSettingsModuleValue("MapCodeValue"));
			uIMapSettings.codedMapDetail.uIPopUpMapCodeValueEdit.sendKeys(Keys.TAB);
		}

		public void enterAtMapDescription() {
			uIMapSettings.codedMapDetail.uIPopUpMapDescriptionEdit
					.sendKeys(BaseData.getSettingsModuleValue("MapDescription"));
			uIMapSettings.codedMapDetail.uIPopUpMapDescriptionEdit.sendKeys(Keys.TAB);
		}

		public void clickPopUpAddButton() {
			uIMapSettings.codedMapDetail.uIPopUpAddButton.click();
		}

		public void enterAtMapCodeValue1() {
			uIMapSettings.codedMapDetail.uIPopUpMapCodeValueEdit
					.sendKeys(BaseData.getSettingsModuleValue("MapCodeValue1"));
			uIMapSettings.codedMapDetail.uIPopUpMapCodeValueEdit.sendKeys(Keys.TAB);
		}

		public void enterAtMapDescription1() {
			uIMapSettings.codedMapDetail.uIPopUpMapDescriptionEdit
					.sendKeys(BaseData.getSettingsModuleValue("MapDescription1"));
			uIMapSettings.codedMapDetail.uIPopUpMapDescriptionEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtMapCodeValueInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapSettings.codedMapDetail.uICodedMapDetailTable,
					BaseData.getSettingsModuleValue("MapCodeValue"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getSettingsModuleValue("MapCodeValue")));
		}

	}

	public class DistributionList {

		public void clickSearch() {
			uIMapSettings.distributionList.uISearchButton.click();
		}

		public void selectByDistributionName() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapSettings.distributionList.uIDistributionsearchGrid,
					(BaseData.getSettingsModuleValue("DistributionList")));
		}

		public void CloseDistributionScreen() {
			Playback.threadWait();
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("Distribution List", "Close Tab");

		}
	}

	public class DistributionEntry {

		public void verifyAtDistributionListName() {
			String PF = objectIdentification.manualIdentify
					.getGridCell(uIMapSettings.distributionEntry.uIDistributionEntryhGrid, "Text", 0).getText();
			verify.ExpectedPropertyValueIsEqual(PF, BaseData.getSettingsModuleValue("PF"));
		}

		public void verifyAtDistributionListNameIsNotPresent() {
			String PFIsFalse = objectIdentification.manualIdentify
					.getGridCell(uIMapSettings.distributionEntry.uIDistributionEntryhGrid, "Text", 0).getText();
			System.out.println(PFIsFalse);
			verify.ExpectedPropertyValueIsEqual(PFIsFalse, "");
		}

		public void closeSreen() {
			uIMapSettings.distributionEntry.driver.close();

		}

	}

	public class TextSearchHelpWindow {

		public void clickExcelIcon() {
			uIMapSettings.textSearchHelpWindow.uIExcelIcon.click();
		}

		public String readSearchWord() {
			String text = uIMapSettings.textSearchHelpWindow.uISearchWordsEdit.getAttribute("value");

			return text;

		}

		public void verifyTheTextInGrid(String text) {
			List<WebElement> allRows = uIMapSettings.textSearchHelpWindow.uITextTable
					.findElements(By.xpath("//div[@id='grdText']//tbody[@mkr='rows']//tr"));
			for (WebElement row : allRows) {
				List<WebElement> allCells = row.findElements(By.xpath(".//td"));

				for (WebElement cell : allCells) {
					if (cell.isDisplayed()) {
						if (cell.getText().contains(text)) {
							verify.ExpectedValueIsTrue(cell.getText().contains(text));
						}
					}
				}

			}
		}

		public void selectAtTextType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapSettings.textSearchHelpWindow.uITextType, BaseData.getHomeModuleValue("TextType"));
			
		}

		public void clickSearchButton() {
			uIMapSettings.textSearchHelpWindow.uISearchButton.click();
			
		}

		public void deleteFromDate() {
			uIMapSettings.textSearchHelpWindow.uIDateEdit.click();
			uIMapSettings.textSearchHelpWindow.uIDateEdit.sendKeys(Keys.CLEAR);
			
		}

		public void selectAtRowInGridUsingIndex(int indexNo) {
			objectIdentification.manualIdentify.selectGridRowByIndex(uIMapSettings.textSearchHelpWindow.uITextTable, indexNo);
			
		}
	}

	public class ViewHistoryWindow {

		public void enterAtParameterID() {
			uIMapSettings.viewHistoryWindow.uIParameterIDEdit.sendKeys(BaseData.getSettingsModuleValue("ParameterID"));
		}

		public void clickSearchButton() {
			uIMapSettings.viewHistoryWindow.uISearchButton.click();

		}

		public String readValuesInGrid(String ColumnName, int rowIndex) {
			String cellvalue = objectIdentification.manualIdentify
					.getGridCell(uIMapSettings.viewHistoryWindow.uIHistoryTable, ColumnName, rowIndex).getText();

			return cellvalue;
		}

		public void verifyCellValueWithExpectedData(String cellValue, String jsonData) {
			verify.ExpectedPropertyValueIsEqual(jsonData, cellValue);
		}

		public void verifyPFColumnCheckboxDisplayed(int rowIndex) {
			WebElement checkbox = Playback.driver
					.findElement(By.xpath("(//div[@id='grdHistory_ctl00_880_0_5909_0']//td/img)[" + rowIndex + "]"));
			verify.ExpectedValueIsTrue(checkbox.isDisplayed());
		}

	}

	public void reset() {
		uIMapSettings = null;
	}

	public void switchToDistributionList() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Home/frmDistributionSrch");

	}

	public void switchToDistributionEntry() {
		objectIdentification.windowHandle.switchToWindow("Distribution - 1092");

	}

}
