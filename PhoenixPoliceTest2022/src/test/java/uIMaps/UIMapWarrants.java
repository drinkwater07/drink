package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapWarrants {

	public WarrantSearch warrantSearch;
	public WarrantEntry warrantEntry;
	public WarrantNamesSearch warrantNamesSearch;
	public WarrantDetails warrantDetails;
	public BatchClearance batchClearance;
	public WarrantType warrantType;
	public WarrantTypeEntry warrantTypeEntry;
	public WarrentEntryAuthenticatorWindow warrentEntryAuthenticatorWindow;

	public UIMapWarrants() {
		if ((this.warrantSearch == null)) {
			this.warrantSearch = new WarrantSearch();
		}
		if ((this.warrentEntryAuthenticatorWindow == null)) {
			this.warrentEntryAuthenticatorWindow = new WarrentEntryAuthenticatorWindow();
		}
		if ((this.warrantNamesSearch == null)) {
			this.warrantNamesSearch = new WarrantNamesSearch();
		}
		if ((this.warrantEntry == null)) {
			this.warrantEntry = new WarrantEntry();
		}
		if ((this.warrantDetails == null)) {
			this.warrantDetails = new WarrantDetails();
		}
		if ((this.batchClearance == null)) {
			this.batchClearance = new BatchClearance();
		}
		if ((this.warrantType == null)) {
			this.warrantType = new WarrantType();
		}
		if ((this.warrantTypeEntry == null)) {
			this.warrantTypeEntry = new WarrantTypeEntry();
		}
		if ((this.warrentEntryAuthenticatorWindow == null)) {
			this.warrentEntryAuthenticatorWindow = new WarrentEntryAuthenticatorWindow();
		}
	}

	public class WarrantSearch {
		public WebDriver driver;

		public WarrantSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Warrant Update Status')]")
		public WebElement uIWarrantUpdateStatusButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Warrant Update')]")
		public WebElement uIWarrantUpdateButton;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_chkWarNo")
		public WebElement uIWarNoCheckBox;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_nbrWarfrm_Year")
		public WebElement uIWarrantFromYearEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_nbrWarfrm_Number")
		public WebElement uIWarrantFromNumberEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_nbrWarTo_Year")
		public WebElement uIWarrantToYearEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_nbrWarTo_Number")
		public WebElement uIWarrantToNumberEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_cddStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_lstStatus_DropDown")
		public WebElement uIClearanceComboBox;

		@FindBy(how = How.ID, using = "grdWarrants")
		public WebElement uIWarrantResultTable;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.XPATH, using = "//img[@src='/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIcon;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_lblCourtWarNo")
		public WebElement uICourtWarrantNoTextView;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_txtCourtWarNo")
		public WebElement uICourtWarrantNoEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_lblDocketNo")
		public WebElement uIDocketNoTextView;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_txtDocketNo")
		public WebElement uIDocketNoEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_lblNICID")
		public WebElement uINCICIDTextView;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_txtNCIC")
		public WebElement uINCICIDEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_lblStateID")
		public WebElement uIStateIDTextView;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_txtStateID")
		public WebElement uIStateIDEdit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_lblCustom1")
		public WebElement uICustom1TextView;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_txtCustom1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_lblCustom2")
		public WebElement uICustom2TextView;

		@FindBy(how = How.ID, using = "tabWarrant_tmpl0_UsrWarrantSrchBasic1_txtCustom2")
		public WebElement uICustom2Edit;

		@FindBy(how = How.XPATH, using = "(//span[@id='WzTtDiV']//table//tbody//tr//td//table//tbody//tr//td//table//tbody//tr//td//span//br)[1]")
		public WebElement uINameToolTip;

	}

	public class WarrantEntry {
		public WebDriver driver;
		public WarrantEntryMainTab warrantEntryMainTab;
		public ClearTab clearTab;
		public StatusTab statusTab;
		public ChargesTab chargesTab;
		public ServiceTab serviceTab;
		public NarrativeTab narrativeTab;
		public WarrantEntryNotesTab warrantEntryNotesTab;
		public WarrantEntryHistoryTab warrantEntryHistoryTab;

		public WarrantEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.warrantEntryMainTab == null)) {
				this.warrantEntryMainTab = new WarrantEntryMainTab();
			}

			if ((this.clearTab == null)) {
				this.clearTab = new ClearTab();
			}

			if ((this.chargesTab == null)) {
				this.chargesTab = new ChargesTab();
			}

			if ((this.statusTab == null)) {
				this.statusTab = new StatusTab();
			}

			if ((this.serviceTab == null)) {
				this.serviceTab = new ServiceTab();
			}

			if ((this.narrativeTab == null)) {
				this.narrativeTab = new NarrativeTab();
			}

			if ((this.warrantEntryNotesTab == null)) {
				this.warrantEntryNotesTab = new WarrantEntryNotesTab();
			}

			if ((this.warrantEntryHistoryTab == null)) {
				this.warrantEntryHistoryTab = new WarrantEntryHistoryTab();
			}
		}

		@FindBy(how = How.ID, using = "nbrWarrant_Year")
		public WebElement uIWarrantYearEdit;

		@FindBy(how = How.ID, using = "nbrWarrant_Number")
		public WebElement uIWarrantNumberEdit;

		@FindBy(how = How.ID, using = "dttmIssued_KPIDttmCtrl")
		public WebElement uIIssuedDateEdit;
		
		@FindBy(how = How.ID, using = "dttmExpired_KPIDttmCtrl")
		public WebElement uIExpiredDateEdit;

		@FindBy(how = How.ID, using = "cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "txtPhysicalDesc")
		public WebElement uIDetailsTextview;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "txtCourtWarNo")
		public WebElement uICourtWarrantNoEdit;

		@FindBy(how = How.ID, using = "nameWar_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nameWar_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "nameWar_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nameWar_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "txtCSZ")
		public WebElement uICSZEdit;

		@FindBy(how = How.ID, using = "nameWar_imgSrch")
		public WebElement uINameInfoIconButton;

		@FindBy(how = How.ID, using = "nameWar_imgWant")
		public WebElement uIWarrantIconButton;

		@FindBy(how = How.ID, using = "txtPlateNbr_PlateNumber")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "txtPlateNbr_KPIState")
		public WebElement uIVehicleStateComboBox;

		@FindBy(how = How.ID, using = "txtPlateNbr_imgBtn")
		public WebElement uIPlateNumberLookupButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Charges')]")
		public WebElement uIChargesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Narrative')]")
		public WebElement uINarrativeTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabWarrants']//span[contains(text(),'Status')]")
		public WebElement uIStatusTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Service')]")
		public WebElement uIServiceTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes')]")
		public WebElement uINotesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Clear')]")
		public WebElement uIClearTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'History')]")
		public WebElement uIHistoryTab;

		@FindBy(how = How.ID, using = "cmdReopen")
		public WebElement uIReopenButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "imgWarrant")
		public WebElement uIWarrantImage;

		@FindBy(how = How.ID, using = "alcName")
		public WebElement uIALCIconButton;

		@FindBy(how = How.ID, using = "lblCourtWarNo")
		public WebElement uICourtWarrantNoTextView;

		@FindBy(how = How.ID, using = "lblDocketNo")
		public WebElement uIDocketNoTextView;

		@FindBy(how = How.ID, using = "txtDocketNo")
		public WebElement uIDocketNoEdit;

		@FindBy(how = How.ID, using = "lblCustom1")
		public WebElement uICustom1TextView;

		@FindBy(how = How.ID, using = "txtCustom1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "lblCustom2")
		public WebElement uICustom2TextView;

		@FindBy(how = How.ID, using = "txtCustom2")
		public WebElement uICustom2Edit;

		@FindBy(how = How.ID, using = "drpName")
		public WebElement uINameShownInWarrantComboBox;

		@FindBy(how = How.ID, using = "drpAddress")
		public WebElement uIAddressShownInWarrantComboBox;

		@FindBy(how = How.ID, using = "ORIAuthority_lupORI_CodeDescription")
		public WebElement uIAuthorityLookUpDescription;

		@FindBy(how = How.ID, using = "ORIAuthority_lupORI_CodeValue")
		public WebElement uIAuthorityLookUpEdit;

		@FindBy(how = How.ID, using = "ORIAuthority_lupORI_imgBtn")
		public WebElement uIAuthorityLookUpIcon;
		
		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']//b")
		public WebElement uIFooterStatusBar;
	}

	public class WarrantEntryMainTab {
		public WebDriver driver;

		public WarrantEntryMainTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_txtComplainant")
		public WebElement uIComplainantEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_txtHeldBy")
		public WebElement uIHeldByEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_cddRestraining_DropDown")
		public WebElement uIProtectionRestrainingComboBox;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_nameJudge_NameType")
		public WebElement uIJudgeNameTypeEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_nameJudge_NameTypeID")
		public WebElement uIJudgeNameTypeIDEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_nameJudge_LastName")
		public WebElement uIJudgeLastNameEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_nameJudge_FirstName")
		public WebElement uIJudgeFirstNameEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_namePetitioner_NameType")
		public WebElement uIPetitionerNameTypeEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_namePetitioner_NameTypeID")
		public WebElement uIPetitionerNameTypeIDEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_namePetitioner_LastName")
		public WebElement uIPetitionerLastNameEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_namePetitioner_FirstName")
		public WebElement uIPetitionerFirstNameEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_cddServiceLimit_DropDown")
		public WebElement uIServiceLimitComboBox;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_txtChargeDesc")
		public WebElement uIwantChargeEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_curBailAmt")
		public WebElement uITotalBailEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_chkDetailCharges")
		public WebElement uIDetailChargesCheckBox;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblRestraining")
		public WebElement uIProtectionRestrainingOrderTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblDataChargeDescription")
		public WebElement uIWantChargeTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblCaution")
		public WebElement uICautionTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_cddCaution_DropDown")
		public WebElement uICautionComboBox;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblViolationDate")
		public WebElement uIViolationDateTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_dttmViolation_KPIDttmCtrl")
		public WebElement uIViolationDateEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblGeo")
		public WebElement uIGeoServiceLimitTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_cddGeoSrv_DropDown")
		public WebElement uIGeoServiceLimitComboBox;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblRemarks")
		public WebElement uICautionRemarksTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_txtRemarks")
		public WebElement uICautionRemarksEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblChargesBail")
		public WebElement uIBailAmountTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_curBailAmt")
		public WebElement uIBailAmountEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_lblEmancipation")
		public WebElement uIDateOfEmancipationTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl0_UsrMain1_dttmEmancipation_KPIDttmCtrl")
		public WebElement uIDateOfEmancipationEdit;

	}

	public class ClearTab {
		public WebDriver driver;

		public ClearTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddDisposition_DropDown")
		public WebElement uIDispostionComboBox;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveTabButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetTabButton;

		@FindBy(how = How.ID, using = "dtcClearDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtcClearDate_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "txtClearRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "lupByPF_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.ID, using = "lupByPF_imgBtn")
		public WebElement uIPFLookupButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;
	}

	public class StatusTab {
		public WebDriver driver;

		public StatusTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "ORINewLocation_KPIState")
		public WebElement uINewLocationSateComboBox;

		@FindBy(how = How.ID, using = "ORINewLocation_lupORI_CodeValue")
		public WebElement uINewLocationCodeEdit;

		@FindBy(how = How.ID, using = "ORINewLocation_lupORI_imgBtn")
		public WebElement uINewLocationCodeLookupButton;

		@FindBy(how = How.ID, using = "dtcStatusDate_KPIDttmCtrl")
		public WebElement uIStatusDateEdit;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveTabButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetTabButton;
	}

	public class ChargesTab {
		public WebDriver driver;

		public ChargesTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabWarrants_tmpl1_UsrCharges1_lupCharge_imgBtn")
		public WebElement uIChargeLookupButton;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl1_UsrCharges1_lupCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl1_UsrCharges1_lupNCIC_CodeValue")
		public WebElement uIOCCCodeEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl1_UsrCharges1_lupNCIC_imgBtn")
		public WebElement uIOCCCodeLookupButton;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl1_UsrCharges1_txtCount")
		public WebElement uICountEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl1_UsrCharges1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl1_UsrCharges1_imgClear")
		public WebElement uIClearButton;
	}

	public class NarrativeTab {
		public WebDriver driver;

		public NarrativeTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_rteKPITxt_contentIframe")
		public WebElement uINarrativeEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_chkLock")
		public WebElement uILockEntryCheckBox;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_lupEmpPFID_CodeValue")
		public WebElement uIEmplNoEdit;

		@FindBy(how = How.XPATH, using = "//span[@id ='tabWarrants_tmpl2_UsrNarrative1_lblEmp']/ancestor::td[@align='right']")
		public WebElement uIEmplNoTextView;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_lupEmpPFID_imgBtn")
		public WebElement uIEmplNoLookupButton;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_dtEmpDate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_cddTemplate")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_btnLoad")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "tabWarrants_tmpl2_UsrNarrative1_btnAddNew")
		public WebElement uIAddNewOrEditButton;
	}

	public class ServiceTab {
		public WebDriver driver;

		public ServiceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtServiceAttmd_Date_KPIDttmCtrl")
		public WebElement uIServiceAttemptedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtServiceAttmd_Time']//input")
		public WebElement uIServiceAttemptedTimeEdit;

		@FindBy(how = How.ID, using = "lupAttemptedBy_CodeValue")
		public WebElement uIAttemptedByEdit;

		@FindBy(how = How.ID, using = "lupAttemptedBy_imgBtn")
		public WebElement uIAttemptedByLookupButton;

		@FindBy(how = How.ID, using = "dtcNextAttempt_KPIDttmCtrl")
		public WebElement uINextAttemptedDateEdit;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveTabButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetTabButton;

		@FindBy(how = How.XPATH, using = "//table[@class='layout']//td[@class = 'status']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class WarrantEntryNotesTab {
		public WebDriver driver;

		public WarrantEntryNotesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtcNotesDate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveTabButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetTabButton;

	}

	public class WarrantEntryHistoryTab {
		public WebDriver driver;

		public WarrantEntryHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabWarrants_tmpl8_Usrhistory2_grdHistory")
		public WebElement uIHistoryTabResultsGrid;
		
		@FindBy(how = How.ID, using = "tabWarrants_tmpl8_Usrhistory2_cmdInternalRefresh")
		public WebElement uIHistoryTabResetButton;
	}

	public class WarrantDetails {
		public WebDriver driver;

		public WarrantDetails() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtWarCount")
		public WebElement uIWarrantCountEdit;

		@FindBy(how = How.ID, using = "grdWarDtls")
		public WebElement uIWarrantDetailsResultGrid;

	}

	public class WarrantNamesSearch {
		public WebDriver driver;

		public WarrantNamesSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_chkSound")
		public WebElement uISoundalikeCheckBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_chkIncludeName")
		public WebElement uIIncludeNameCheckBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_cddStatus_DropDown")
		public WebElement uIWarrantStatusComboBox;

		@FindBy(how = How.ID, using = "grdNames")
		public WebElement uIWarrantNamesSearchResultGrid;

//         @FindBy(how = How.XPATH, using = "(//span[@id='WzTtDiV']//table//tbody//tr//td//table//tbody//tr//td//table//tbody//tr//td//span//br)[1]")
//         public WebElement uINameToolTip;

//        		 @FindBy(how = How.XPATH, using = "(//span[@id='WzTtDiV']//table//tbody//tr//td//table//tbody//tr//td//table//tbody//tr//td//span)[2]")
//               public WebElement uINameToolTip;

		@FindBy(how = How.XPATH, using = "//span[@id='WzTtDiV']//table//tbody//tr//td//table//tbody//tr//td//table//tbody//tr//td//span/br")
		public WebElement uINameToolTip;
	}

	public class BatchClearance {

		public WebDriver driver;

		public BatchClearance() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cddDisposition_DropDown")
		public WebElement uIDispositionComboBox;

		@FindBy(how = How.ID, using = "dtcClearDate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "lupByPF_CodeValue")
		public WebElement uIByPFEdit;

		@FindBy(how = How.ID, using = "lupByPF_imgBtn")
		public WebElement uIByPFLookupButton;

		@FindBy(how = How.ID, using = "txtClearRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "nbrWarrantNo_Year")
		public WebElement uIWarrantYearEdit;

		@FindBy(how = How.ID, using = "nbrWarrantNo_Number")
		public WebElement uIWarrantNoEdit;

		@FindBy(how = How.ID, using = "txtCourtNo")
		public WebElement uICourtNoEdit;

		@FindBy(how = How.ID, using = "grdClearance")
		public WebElement uIBatchClearanceResultGrid;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdClearance']//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;
	}

	public class WarrantType {
		public WebDriver driver;

		public WarrantType() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdWarType")
		public WebElement uIWarrantTypeResultGrid;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;
	}

	public class WarrantTypeEntry {
		public WebDriver driver;

		public WarrantTypeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtWarrantType")
		public WebElement uIWarrantTypeEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIWarrantCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cddExpiration_DropDown")
		public WebElement uIExpirationComboBox;

		@FindBy(how = How.ID, using = "cddDisposition_DropDown")
		public WebElement uIDefaultDispositionComboBox;

		@FindBy(how = How.ID, using = "cddNCIC_DropDown")
		public WebElement uINCICCategoryComboBox;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteIcon;
	}

	public class WarrentEntryAuthenticatorWindow {
		public WebDriver driver;

		public WarrentEntryAuthenticatorWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUserName")
		public WebElement uIUserNameEdit;

		@FindBy(how = How.ID, using = "txtPassWord")
		public WebElement uIPasswordEdit;

		@FindBy(how = How.ID, using = "cmdLogin")
		public WebElement uIAcceptButton;
	}
}
