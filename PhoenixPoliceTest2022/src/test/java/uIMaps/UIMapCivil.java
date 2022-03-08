package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import application.Civil.ServiceActionEntry;
import utilities.Playback;

public class UIMapCivil {

	public WebDriver driver;

	public PaperType paperType;
	public PaperTypesEntry paperTypesEntry;
	public CivilSearch civilSearch;
	public PaperEntry paperEntry;
	public CivilForm civilForm;
	public AuthenticationWindow authenticationWindow;
	public District district;
	public DistrictCode districtCode;
	public Payment payment;
	public CivilStatement civilStatement;
	public CivilContact civilContact;
	public PropertyInventoryScreen propertyInventoryScreen;
	public CivilProperty civilProperty;
	public CivilDetails civilDetails;
	public Assignment assignment;
	public ServiceAction serviceAction;
	public ServiceActionEntry serviceActionEntry;

	public UIMapCivil() {
		if (this.paperType == null)
			this.paperType = new PaperType();

		if (this.paperTypesEntry == null)
			this.paperTypesEntry = new PaperTypesEntry();

		if (this.civilSearch == null)
			this.civilSearch = new CivilSearch();

		if (this.paperEntry == null)
			this.paperEntry = new PaperEntry();

		if (this.civilForm == null)
			this.civilForm = new CivilForm();

		if (this.authenticationWindow == null)
			this.authenticationWindow = new AuthenticationWindow();

		if (this.district == null)
			this.district = new District();

		if (this.districtCode == null)
			this.districtCode = new DistrictCode();

		if (this.payment == null)
			this.payment = new Payment();

		if (this.civilStatement == null)
			this.civilStatement = new CivilStatement();

		if (this.civilContact == null)
			this.civilContact = new CivilContact();

		if (this.propertyInventoryScreen == null)
			this.propertyInventoryScreen = new PropertyInventoryScreen();

		if (this.civilProperty == null)
			this.civilProperty = new CivilProperty();

		if (this.civilDetails == null)
			this.civilDetails = new CivilDetails();

		if (this.assignment == null)
			this.assignment = new Assignment();

		if (this.serviceAction == null)
			this.serviceAction = new ServiceAction();
		
		if (serviceActionEntry == null)
			serviceActionEntry = new ServiceActionEntry();
		
	}

	public class PaperType {

		public PaperType() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtPaperCode")
		public WebElement uIPaperCodeEdit;

		@FindBy(how = How.ID, using = "txtPaperType")
		public WebElement uIPaperTypeEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdPaperType")
		public WebElement uIPaperTypeResultGrid;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;
	
	}

	public class PaperTypesEntry {

		public PaperTypesEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtPaperCode")
		public WebElement uICodeEdit;

		@FindBy(how = How.ID, using = "txtPaperType")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtDaysToServe")
		public WebElement uIDaysToServeEdit;

		@FindBy(how = How.ID, using = "txtSortOrder")
		public WebElement uISortOrderEdit;

		@FindBy(how = How.ID, using = "chkIsProperty")
		public WebElement uIPropertyCheckBox;

		@FindBy(how = How.ID, using = "chkIsExecution")
		public WebElement uIExectionCheckBox;

		@FindBy(how = How.ID, using = "chkIsSeizedPro")
		public WebElement uISeizedPropertyCheckBox;

		@FindBy(how = How.ID, using = "chkIsTRO")
		public WebElement uITROCheckBox;

		@FindBy(how = How.ID, using = "chkIsOther")
		public WebElement uIOtherCheckBox;

		@FindBy(how = How.ID, using = "chkPaperInact")
		public WebElement uIPaperInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInPaperInActiveDTTM")
		public WebElement uIPaperInactiveTextEdit;

		@FindBy(how = How.ID, using = "cddFeeType_DropDown")
		public WebElement uIFeeTypeComboBox;

		@FindBy(how = How.ID, using = "curFee")
		public WebElement uIPaperFeeEdit;

		@FindBy(how = How.ID, using = "chkApply")
		public WebElement uIApplyCheckBox;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIFeeInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInactiveDttm")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "btnAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "btnClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdPaperType")
		public WebElement uIPaperTypesResultGrid;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;
	}

	public class CivilSearch {

		public CivilSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_txtCivilNbrFrm_Year")
		public WebElement uICivilProcessFromYearEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_txtCivilNbrFrm_Number")
		public WebElement uICivilProcessFromNumberEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_txtCivilNbrTo_Year")
		public WebElement uICivilProcessToYearEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_txtCivilNbrTo_Number")
		public WebElement uICivilProcessToNumberEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_txtCourtCaseNo")
		public WebElement uICourtCaseNumberEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_Kpilabel2")
		public WebElement uICourtCaseLabelText;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_txtDocketNo")
		public WebElement uICustomEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_lblCustom")
		public WebElement uICustomLabelText;

		@FindBy(how = How.ID, using = "grdInquiryResults")
		public WebElement uICivilSearchResultGrid;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_txtCivilID")
		public WebElement uICivilRefIDEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_drpPaper")
		public WebElement uIPaperTypeComboBox;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_cddDistrict")
		public WebElement uIDistrictNoComboBox;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_cddStatus")
		public WebElement uIServiceActionComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdInquiryResults_ctl00")
		public WebElement uICivilSearchExpandResultGrid;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_adrLocation_adrAddrsCtrl_txtFrom")
		public WebElement uIServiceLocationEdit;

		@FindBy(how = How.ID, using = "tabCivilSrch_tmpl0_usrCivilSrchBasic1_adrLocation_adrAddrsCtrl_chkVerify")
		public WebElement uIServiceLocationVerifyCheckBox;
	}

	public class CivilForm {
		public CivilFeesPaymentsTab civilFeesPaymentsTab;
		public CivilNamesTab civilNamesTab;
		public CivilServiceTab civilServiceTab;
		public CivilPropertyTab civilPropertyTab;
		public CivilCommentsTab civilCommentsTab;

		public CivilForm() {
			if (this.civilFeesPaymentsTab == null)
				this.civilFeesPaymentsTab = new CivilFeesPaymentsTab();

			if (this.civilNamesTab == null)
				this.civilNamesTab = new CivilNamesTab();

			if (this.civilServiceTab == null)
				this.civilServiceTab = new CivilServiceTab();

			if (this.civilPropertyTab == null)
				this.civilPropertyTab = new CivilPropertyTab();

			if (this.civilCommentsTab == null)
				this.civilCommentsTab = new CivilCommentsTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lblCvlStatus")
		public WebElement uICivilLableStatusText;

		@FindBy(how = How.ID, using = "nbrCivilNbr_Year")
		public WebElement uICivilProcessYearEdit;

		@FindBy(how = How.ID, using = "nbrCivilNbr_Number")
		public WebElement uICivilProcessNumberEdit;

		@FindBy(how = How.ID, using = "dttRecvDttm_Date_KPIDttmCtrl")
		public WebElement uIReceivedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttRecvDttm_Time']//input")
		public WebElement uIReceivedTimeEdit;

		@FindBy(how = How.ID, using = "txtCivilRefID")
		public WebElement uICivilIDEdit;

		@FindBy(how = How.XPATH, using = "//*[@id='cmdSave']")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Names')]")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tabCivilDetails']//span[contains(text(),'Service')]")
		public WebElement uIServiceTab;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tabCivilDetails']//span[contains(text(),'Property')]")
		public WebElement uIPropertyTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fees/Payments')]")
		public WebElement uIFeesPaymentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lblCvlStatus']")
		public WebElement uICivilFormStatusTextView;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lblStatus']")
		public WebElement uICivilFormStatusLableTextView;

		@FindBy(how = How.ID, using = "btnPaper")
		public WebElement uIPaperButton;

		@FindBy(how = How.ID, using = "txtCourtNbr")
		public WebElement uICourtCaseNoEdit;

		@FindBy(how = How.ID, using = "curExecutionAmt")
		public WebElement uIExecutionEdit;

		@FindBy(how = How.ID, using = "drpPaper")
		public WebElement uIPaperDescriptionCombobox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.ID, using = "txtNOP")
		public WebElement uIPaperCountEdit;

		@FindBy(how = How.ID, using = "curFee")
		public WebElement uIFeesEdit;

		@FindBy(how = How.ID, using = "chkIsDocAccom")
		public WebElement uIAccompaningDocumentationCheckbox;

		@FindBy(how = How.ID, using = "chkIsFeeWaived")
		public WebElement uIFeeWaivedCheckbox;

		@FindBy(how = How.ID, using = "cddWaivedReason_DropDown")
		public WebElement uIFeeWaivedCombobox;

		@FindBy(how = How.ID, using = "dttCourtDate_KPIDttmCtrl")
		public WebElement uICourtDateEdit;

		@FindBy(how = How.ID, using = "dtmServe_KPIDttmCtrl")
		public WebElement uIServeByDateEdit;

		@FindBy(how = How.ID, using = "curBondAmt")
		public WebElement uIBondEdit;

		@FindBy(how = How.ID, using = "txtCustom1")
		public WebElement uICustomEdit;

		@FindBy(how = How.ID, using = "btnTRO")
		public WebElement uITROButton;

		@FindBy(how = How.ID, using = "dttmIssueDate_Date_KPIDttmCtrl")
		public WebElement uIIssuingDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmIssueDate_Time']//input")
		public WebElement uIIssuingTimeEdit;

		@FindBy(how = How.ID, using = "nmcName_NameType")
		public WebElement uIIssuingOfficalNameTypeEdit;

		@FindBy(how = How.ID, using = "nmcName_NameTypeID")
		public WebElement uIIssuingOfficalNameIDEdit;

		@FindBy(how = How.ID, using = "txtcAddress")
		public WebElement uITROAddressEdit;

	}

	public class CivilFeesPaymentsTab {

		public CivilFeesPaymentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_txtPaper")
		public WebElement uIPaperFeeEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_txtPerAttempt")
		public WebElement uIServiceFeeEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_curHourly")
		public WebElement uIHourlyEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_chkWriteOff")
		public WebElement uIWriteOffCheckBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_dttWrtDate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "lblWrtDate")
		public WebElement uIDateLabelText;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_cddMethod1_DropDown")
		public WebElement uIMethodComboBox;

		@FindBy(how = How.ID, using = "lblWrtMth")
		public WebElement uIMethodLableText;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_lupAuthBy_CodeValue")
		public WebElement uIAuthByEdit;

		@FindBy(how = How.ID, using = "lblAuthBy")
		public WebElement uIAuthByLableTest;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_lupAuthBy_imgBtn")
		public WebElement uIAuthByLookupButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_grdFeePayment")
		public WebElement uIFeePaymentResultGrid;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_curFeesBalance")
		public WebElement uIFeesBalanceEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_cddTransType_DropDown")
		public WebElement uITransactionTypeComboBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_cddMethod2_DropDown")
		public WebElement uIMethod2ComboBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_curAmount")
		public WebElement uIAmountEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_txtReference")
		public WebElement uINoteEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_drpDefendant")
		public WebElement uINamesComboBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_txtNotes")
		public WebElement uINotesEdit;
		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl3_UsrFeesPayment1_cddWrtMethod_DropDown")
		public WebElement uIWriteMethodComboBox;
	}

	public class CivilNamesTab {

		public CivilNamesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_nmcName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_nmcName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_txtcAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_txtContact")
		public WebElement uIAssociatesEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_imgLookUp")
		public WebElement uIAssociatesLookupButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_txtComment")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_chkToServed")
		public WebElement uIToServedCheckBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_chkIsAtEI")
		public WebElement uIETAlCheckBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_chkBillable")
		public WebElement uIBillableCheckBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_imgAddName")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_imgClearName")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_grdCvlNames")
		public WebElement uINamesTabResultGrid;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_lupDist_imgBtn")
		public WebElement uIDistrictLookupButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_chkIsPrmContact")
		public WebElement uIPrimaryContactCheckBox;

		@FindBy(how = How.ID, using = "tdAddress")
		public WebElement uIAddressDistrictLabel;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_nmcName_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_nmcName_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl0_UsrCvlNames1_nmcName_imgSrch")
		public WebElement uINameInfoIcon;

	}

	public class CivilServiceTab {

		public CivilServiceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_dtmServiceDttm_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabCivilDetails_tmpl1_UsrCvlService1_dtmServiceDttm_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_cddServiceAction_DropDown")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_cddReason_DropDown")
		public WebElement uIReasonComboBox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_addLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_lupDistrict_imgBtn")
		public WebElement uIDistrictLookupButton;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_grdSeviceAttempt")
		public WebElement uIServiceAttemptResultGrid;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_drpDefendant")
		public WebElement uINameCombobox;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_curAttemptAmt")
		public WebElement uIServiceFeeEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_txtComments")
		public WebElement uINarrativeEdit;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_imgEditor")
		public WebElement uINarrativeIconButton;

		@FindBy(how = How.ID, using = "tdDefendant")
		public WebElement uINameTextView;

		@FindBy(how = How.ID, using = "tdLocation")
		public WebElement uILocationTextView;

		@FindBy(how = How.ID, using = "tdReturnReason")
		public WebElement uIReasonTextView;

		@FindBy(how = How.ID, using = "tdAttempt")
		public WebElement uISeviceFeeTextView;

		@FindBy(how = How.ID, using = "tdCollection")
		public WebElement uICollectionTypeTextView;

		@FindBy(how = How.ID, using = "tabCivilDetails_tmpl1_UsrCvlService1_btnSeizedPro")
		public WebElement uIPropertyInventoryButton;
	}

	public class CivilPropertyTab {

		public CivilPropertyTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdCivilData")
		public WebElement uIPropertyTabResultGrid;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;
	}

	public class CivilCommentsTab {

		public CivilCommentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCode_CodeValue")
		public WebElement uICodeEdit;

		@FindBy(how = How.ID, using = "lupCode_imgBtn")
		public WebElement uICodeLookupButton;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uIHeadingEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uICommentsResultGrid;

	}

	public class PaperEntry {

		public PaperEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nbrCivilNbr_Year")
		public WebElement uICivilProcessYearEdit;

		@FindBy(how = How.ID, using = "nbrCivilNbr_Number")
		public WebElement uICivilProcessNumberEdit;

		@FindBy(how = How.ID, using = "dtmRcvDttm_Date_KPIDttmCtrl")
		public WebElement uIReceivedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtmRcvDttm_Time']//input")
		public WebElement uIReceivedTimeEdit;

		@FindBy(how = How.ID, using = "txtCivilRefID")
		public WebElement uICivilIDEdit;

		@FindBy(how = How.ID, using = "txtCourtNbr")
		public WebElement uICourtNumberEdit;

		@FindBy(how = How.ID, using = "lblCourtCaseNo")
		public WebElement uICourtCaseNumberText;

		@FindBy(how = How.ID, using = "lupPaperType_CodeValue")
		public WebElement uIPaperTypeCodeEdit;

		@FindBy(how = How.ID, using = "lupPaperType_CodeDescription")
		public WebElement uIPaperTypeCodeDescriptionTextEdit;

		@FindBy(how = How.ID, using = "grdPaperType")
		public WebElement uIPaperEntryResultGrid;

		@FindBy(how = How.ID, using = "btnAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "btnClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uIPaperInfoLocationEdit;

		@FindBy(how = How.ID, using = "cddDistrict_CodeValue")
		public WebElement uIPaperInfoDistrictCodeEdit;

		@FindBy(how = How.ID, using = "cddDistrict_imgBtn")
		public WebElement uIPaperInfoDistrictLookupbutton;

		@FindBy(how = How.ID, using = "dttmSale_Date_KPIDttmCtrl")
		public WebElement uIPaperInfoSaleDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmSale_Time']//input")
		public WebElement uIPaperInfoSaleTimeEdit;

		@FindBy(how = How.ID, using = "grdPostedAt")
		public WebElement uIPaperInfoResultGrid;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIPaperInfoSaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uIPaperInfoSaveAndCloseButton;

		@FindBy(how = How.ID, using = "CurExeAmt")
		public WebElement uIPaperInfoExecutionAmountEdit;

		@FindBy(how = How.ID, using = "chkApply")
		public WebElement uIApplyCheckbox;

		@FindBy(how = How.ID, using = "dttmIssueDate_Date_KPIDttmCtrl")
		public WebElement uITROIssuedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmIssueDate_Time']//input")
		public WebElement uITROTimeEdit;

		@FindBy(how = How.ID, using = "dttmExpireDate_Date_KPIDttmCtrl")
		public WebElement uITROExpiredDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmExpireDate_Time']//input")
		public WebElement uITROExpiredTimeEdit;

		@FindBy(how = How.ID, using = "lupRelation_imgBtn")
		public WebElement uITRORelationshipLookupbutton;

		@FindBy(how = How.ID, using = "nmcName_NameType")
		public WebElement uITROIssuingOfficialNameTypeEdit;

		@FindBy(how = How.ID, using = "nmcName_NameTypeID")
		public WebElement uITROIssuingOfficialNameIDEdit;

		@FindBy(how = How.ID, using = "drpFireArms_DropDown")
		public WebElement uIFireArmsProhibtedCombobox;

		@FindBy(how = How.ID, using = "txtOtherPaper")
		public WebElement uIOtherPaperEdit;

		@FindBy(how = How.ID, using = "nmcName_LastName")
		public WebElement uITROLastNameEdit;

		@FindBy(how = How.ID, using = "nmcName_FirstName")
		public WebElement uITROFirstNameEdit;

		@FindBy(how = How.ID, using = "lupPaperType_imgBtn")
		public WebElement uIPaperTypeLookUpIcon;

	}

	public class AuthenticationWindow {

		public AuthenticationWindow() {
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

	public class District {

		public District() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtDistrict")
		public WebElement uIDistrictEdit;

		@FindBy(how = How.ID, using = "txtCity")
		public WebElement uICityEdit;

		@FindBy(how = How.ID, using = "grdCityCode")
		public WebElement uIDistrictResultGrid;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewLink;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckbox;

	}

	public class DistrictCode {

		public DistrictCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtDistrict")
		public WebElement uIDistrictEdit;

		@FindBy(how = How.ID, using = "txtCity")
		public WebElement uICityEdit;

		@FindBy(how = How.ID, using = "txtMiles")
		public WebElement uIMilesEdit;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uIPostLocationEdit;

		@FindBy(how = How.ID, using = "grdCvlDistrictCode")
		public WebElement uIDistrictCodeResultGrid;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckbox;

		@FindBy(how = How.ID, using = "txtInactiveDttm")
		public WebElement uIInactiveDateTextView;
	}

	public class Payment {

		public Payment() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "txtTerminal")
		public WebElement uITerminalEdit;

		@FindBy(how = How.ID, using = "nbrInvoiceNo_Year")
		public WebElement uIInvoiceNoYearEdit;

		@FindBy(how = How.ID, using = "nbrInvoiceNo_Number")
		public WebElement uIInvoiceNoEdit;

		@FindBy(how = How.ID, using = "ImgInvoice")
		public WebElement uIInvoiceNoIconButton;

		@FindBy(how = How.ID, using = "dtInvoice_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uINameEdit;

		@FindBy(how = How.ID, using = "txtcAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "grdCvlPayment")
		public WebElement uIPaymentGridTable;

		@FindBy(how = How.ID, using = "cmdPrtRec")
		public WebElement uIPrintReceiptButton;

		@FindBy(how = How.ID, using = "dttmInvoice_KPIDttmCtrl")
		public WebElement uIDatedEdit;

		@FindBy(how = How.ID, using = "drpPayment_DropDown")
		public WebElement uIPopupPaymentMethodCombobox;

		@FindBy(how = How.ID, using = "curAmtTen")
		public WebElement uIPopupAmountEdit;

		@FindBy(how = How.ID, using = "lblActualCivil0")
		public WebElement uIPopupCivilIDTextView;

		@FindBy(how = How.ID, using = "txtDescriptionOTH")
		public WebElement uIPopupCommentsEdit;

		@FindBy(how = How.ID, using = "cmdUpdateSave")
		public WebElement uIPopupSaveButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uIPopupCancelButton;

		@FindBy(how = How.ID, using = "txtAccountNo")
		public WebElement uIPopupCreditCardNoEdit;

		@FindBy(how = How.ID, using = "txtCheckNo")
		public WebElement uIPopupCheckNoEdit;

		@FindBy(how = How.ID, using = "lblCheck")
		public WebElement uIPopupCheckNoTextView;

		@FindBy(how = How.ID, using = "lblCreditAccNo")
		public WebElement uIPopupCreditCardNoTextView;
	}

	public class CivilStatement {

		public CivilStatement() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCivilRefID")
		public WebElement uICivilIDEdit;

		@FindBy(how = How.ID, using = "txtCourtNbr")
		public WebElement uICourtCaseNoEdit;

		@FindBy(how = How.ID, using = "txtDocketNbr")
		public WebElement uIDocketNoEdit;

		@FindBy(how = How.ID, using = "txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "ddOperator")
		public WebElement uIFeeBalanceOperatorCombobox;

		@FindBy(how = How.ID, using = "curFeeBalance")
		public WebElement uIFeeBalanceEdit;

		@FindBy(how = How.ID, using = "grdAccount")
		public WebElement uICivilStatementTableGrid;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "lblStatus")
		public WebElement uIStatusTextView;

		@FindBy(how = How.ID, using = "chkSelectAll")
		public WebElement uISelectAllCheckbox;

		@FindBy(how = How.ID, using = "btnPrintInv")
		public WebElement uICreateStatementButton;

		@FindBy(how = How.ID, using = "grdAccount")
		public WebElement uICivilStatementEntryTableGrid;

	}

	public class CivilContact {

		public CivilContact() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcName_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcName_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "nmcName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "grdCvlContact")
		public WebElement uICivilStatementTableGrid;

		@FindBy(how = How.ID, using = "nmcName_imgAdd")
		public WebElement uINameQuickEntryIcon;

		@FindBy(how = How.ID, using = "nmcName_imgSrch")
		public WebElement uIAssociateIBubbleIcon;
	}

	public class PropertyInventoryScreen {

		public PropertyInventoryScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddProp_DropDown")
		public WebElement uIPropertyCombobox;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "drpDefendant")
		public WebElement uINamesCombobox;

		@FindBy(how = How.ID, using = "btnAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "btnClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "grdPropInventory")
		public WebElement uIPropertyInventoryGrid;

		@FindBy(how = How.ID, using = "txtItemsSeized")
		public WebElement uITotalItemSeziedEdit;

		@FindBy(how = How.ID, using = "cddGunType_DropDown")
		public WebElement uIGunTypeCombobox;

		@FindBy(how = How.ID, using = "txtSerial1")
		public WebElement uISerialNoEdit;
	}

	public class CivilProperty {

		public CivilProperty() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uIPropertyLocationEdit;

		@FindBy(how = How.ID, using = "cddDistrict_imgBtn")
		public WebElement uIDistrictLookupButton;

		@FindBy(how = How.ID, using = "nmBuyer_NameType")
		public WebElement uIBuyerNameTypeEdit;

		@FindBy(how = How.ID, using = "nmBuyer_NameTypeID")
		public WebElement uIBuyerNameTypeIDEdit;

		@FindBy(how = How.ID, using = "dtnDateTime_Date_KPIDttmCtrl")
		public WebElement uIDateOfSaleEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtnDateTime_Time']//input")
		public WebElement uITimeOfSaleEdit;

		@FindBy(how = How.ID, using = "dttmAdj_Date_KPIDttmCtrl")
		public WebElement uIAdjournedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmAdj_Time']//input")
		public WebElement uIAdjournedTimeEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cddDistrict_CodeValue")
		public WebElement uIDistrictCodeEdit;

		@FindBy(how = How.ID, using = "grdPostedAt")
		public WebElement uILocationResultGrid;
	}

	public class CivilDetails {

		public CivilDetails() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdCivilDtls")
		public WebElement uICivilDetailsResultGrid;

		@FindBy(how = How.ID, using = "txtFullName")
		public WebElement uIFullNameEdit;

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "txtCivilCount")
		public WebElement uICivilCountEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'History']//span[@id='SP1']")
		public WebElement uIToolTipGrid;

	}

	public class Assignment {

		public Assignment() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdAssignment")
		public WebElement uIAssignmentResultGrid;

		@FindBy(how = How.ID, using = "cddPaperType_CodeValue")
		public WebElement uIPaperTypeCodeEdit;

		@FindBy(how = How.ID, using = "lupDistrict_CodeValue")
		public WebElement uIServiceAreaCodeEdit;

		@FindBy(how = How.ID, using = "lupCvlDistrict_CodeValue")
		public WebElement uIDistrictCodeEdit;

		@FindBy(how = How.ID, using = "chkIsAssigned")
		public WebElement uIIncludeAssignedCheckbox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

	}
	
	public class ServiceAction {
		public ServiceAction() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtSerCode")
		public WebElement uICodeEdit;
		
		@FindBy(how = How.ID, using = "txtSerDescription")
		public WebElement uIDescriptionEdit;
		
		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;
		
		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;
		
		@FindBy(how = How.ID, using = "grdServiceAction")
		public WebElement uIServiceActionResultTable;
		
		
	}
	
	public class ServiceActionEntry {
		public ServiceActionEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCode")
		public WebElement uICodeEdit;
		
		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtSortOrder")
		public WebElement uISortOrderEdit;
		
		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;
		
		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;
}
}
