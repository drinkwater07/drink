package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;


public class UIMapCoroner {
	
	
	public CoronerCaseSearch coronerCaseSearch;
	public CoronerCaseEntry coronerCaseEntry;
	public CoronerReview coronerReview;
	public CoronerEfforts coronerEfforts;
	public CoronerCaseReportEntry coronerCaseReportEntry;
	public CoronerEvidenceEntry coronerEvidenceEntry;
	public CoronerEvidenceSearch coronerEvidenceSearch;
	public CoronerEvidenceHistory coronerEvidenceHistory;
	
	public UIMapCoroner() {


		if (this.coronerCaseSearch == null)
			this.coronerCaseSearch = new CoronerCaseSearch();

		if (this.coronerCaseEntry == null)
			this.coronerCaseEntry = new CoronerCaseEntry();
		
		if (this.coronerReview == null)
			this.coronerReview = new CoronerReview();

		if (this.coronerEfforts == null)
			this.coronerEfforts = new CoronerEfforts();
		
		if (this.coronerCaseReportEntry == null)
			this.coronerCaseReportEntry = new CoronerCaseReportEntry();

		if (this.coronerEvidenceEntry == null)
			this.coronerEvidenceEntry = new CoronerEvidenceEntry();
		
		if (this.coronerEvidenceSearch == null)
			this.coronerEvidenceSearch = new CoronerEvidenceSearch();
		
		if (this.coronerEvidenceHistory == null)
			this.coronerEvidenceHistory = new CoronerEvidenceHistory();
		
	}
	
	public class CoronerCaseEntry {
		public WebDriver driver;
		
		public CoronerCaseEntryMainTab coronerCaseEntryMainTab;
		public CoronerCaseEntryNamesTab coronerCaseEntryNamesTab;
		public CoronerCaseEntryReviewTab coronerCaseEntryReviewTab;
		public CoronerCaseEntryEffortsTab coronerCaseEntryEffortsTab;
		public CoronerCaseEntryReportsTab coronerCaseEntryReportsTab;
		public CoronerCaseEntryEvidenceTab coronerCaseEntryEvidenceTab;
		
		public CoronerCaseEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			
			if (this.coronerCaseEntryMainTab == null)
				this.coronerCaseEntryMainTab = new CoronerCaseEntryMainTab();
			if (this.coronerCaseEntryNamesTab == null)
				this.coronerCaseEntryNamesTab = new CoronerCaseEntryNamesTab();
			if (this.coronerCaseEntryReviewTab == null)
				this.coronerCaseEntryReviewTab = new CoronerCaseEntryReviewTab();
			if (this.coronerCaseEntryEffortsTab == null)
				this.coronerCaseEntryEffortsTab = new CoronerCaseEntryEffortsTab();
			if (this.coronerCaseEntryReportsTab == null)
				this.coronerCaseEntryReportsTab = new CoronerCaseEntryReportsTab();
			if (this.coronerCaseEntryEvidenceTab == null)
				this.coronerCaseEntryEvidenceTab = new CoronerCaseEntryEvidenceTab();
		
		}
		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uILeftSideStatusBar;

		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Property')]")
		public WebElement uIPropertyTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Names')])[2]")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Review')]")
		public WebElement uIReviewTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Efforts')])[2]")
		public WebElement uIEffortsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reports')]")
		public WebElement uIReportsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Evidence')]")
		public WebElement uIEvidenceTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;


		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.ID, using = "txtNameID_NameType")
		public WebElement uINameType;

		@FindBy(how = How.ID, using = "txtNameID_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "txtNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_MiddleName")
		public WebElement uIMiddleEdit;
		
		@FindBy(how = How.ID, using = "numTaskNbr_Year")
		public WebElement uICoronerInvestYear;
		
		@FindBy(how = How.ID, using = "numTaskNbr_Number")
		public WebElement uICoronerInvestNo;
		
		@FindBy(how = How.ID, using = "ncRmsCase_Year")
		public WebElement uIRMSCaseYear;
		
		@FindBy(how = How.ID, using = "ncRmsCase_Number")
		public WebElement uIRMSCaseNo;
				
		@FindBy(how = How.ID, using = "dttofDeath_Date_KPIDttmCtrl")
		public WebElement uIDateofDeath;
		
		@FindBy(how = How.ID, using = "dttofDeath_Time")
		public WebElement uITimeofdeath;
		
		@FindBy(how = How.ID, using = "chkDOD")
		public WebElement uIDodUknownCheckbox;
		
		@FindBy(how = How.ID, using = "txtNameID_imgSrch")
		public WebElement uINameIbobble;
		
		@FindBy(how = How.ID, using = "txtSex")
		public WebElement uISex;
		
		@FindBy(how = How.ID, using = "lblDOB")
		public WebElement uIDOB;
		
		@FindBy(how = How.ID, using = "txtAge")
		public WebElement uIAge;
		
		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddress;
		
		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		
		public class CoronerCaseEntryMainTab
		{
			public WebDriver driver;
			
			public CoronerCaseEntryMainTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_lupInvPFID_CodeValue")
			public WebElement uIInvestigator;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_dttDttmFrom_KPIDttmCtrl")
			public WebElement uIDateAssigned;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_dttNxtRevDate_KPIDttmCtrl")
			public WebElement uINextReviewdate;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_addrLocation_txtFrom")
			public WebElement uILocationOfDeath;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_cddCauseOfDeath_Input")
			public WebElement uICauseOfDeathInput;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_cddCauseOfDeath_DropDown")
			public WebElement uICauseOfDeathCombobox;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_CddMannerofDeath_Input")
			public WebElement uIMannerOfDeathInput;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_CddMannerofDeath_DropDown")
			public WebElement uIMannerOfDeathCombobox;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtCaseStatus")
			public WebElement uICaseStatus;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_CddMortuary_DropDown")
			public WebElement uILocalMortuary;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_CddSubstancesInvolved_Input")
			public WebElement uISubstanceInvolvedInput;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_CddSubstancesInvolved_DropDown")
			public WebElement uISubstanceInvolvedDropDown;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtAgeDOD")
			public WebElement uIAgeAtDOD;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtFacID_NameType")
			public WebElement uIFacilitynameType;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtFacID_NameTypeID")
			public WebElement uIFacilityNameIDEdit;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtFacID_LastName")
			public WebElement uIFacilityLastNameEdit;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtFacID_FirstName")
			public WebElement uIFacilityFirstNameEdit;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtFacID_MiddleName")
			public WebElement uIFacilityMiddleEdit;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_txtRemarks")
			public WebElement uIRemarksEdit;
			
		
			
		}
		
		
		public class CoronerCaseEntryNamesTab
		{
			public WebDriver driver;
			
			public CoronerCaseEntryNamesTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(how = How.ID, using = "nmcIncident_NameType")
			public WebElement uINameTypeEdit;

			@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
			public WebElement uINameTypeIDEdit;

			@FindBy(how = How.ID, using = "txtAddress")
			public WebElement uIAddressEdit;

			@FindBy(how = How.ID, using = "cddRelationship_DropDown")
			public WebElement uIRelationshipComboBox;

			@FindBy(how = How.ID, using = "imgAddName")
			public WebElement uIAddNameButton;

			@FindBy(how = How.ID, using = "imgClearName")
			public WebElement uIClearButton;

			@FindBy(how = How.ID, using = "cmdInternalSave")
			public WebElement uISaveNamesTabButton;

			@FindBy(how = How.ID, using = "nmcIncident_LastName")
			public WebElement uILastNameEdit;

			@FindBy(how = How.ID, using = "nmcIncident_FirstName")
			public WebElement uIFirstNameEdit;

			@FindBy(how = How.ID, using = "grdCBENames")
			public WebElement uINamesTabGridTable;

			@FindBy(how = How.ID, using = "nmcIncident_imgSrch")
			public WebElement uINamesInfoIcon;
			
			 @FindBy(how = How.XPATH, using = "//td[@class='status']/b")
		        public WebElement uILeftSideStatusBar;

		}
		
		public class CoronerCaseEntryReviewTab {

			public CoronerCaseEntryReviewTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl2_userReview_btnAddNotes")
			public WebElement uIAddNewReviewButton;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl2_userReview_grdLog_ctl00_lblStatusDate")
			public WebElement uIStatusDateTextView;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl2_userReview_grdLog_ctl00_lblChagedTo")
			public WebElement uIStatusChangedToTextView;
			
			@FindBy(how = How.ID, using = "tabCorEntry_tmpl2_userReview_grdLog_ctl00_lblNxtReview")
			public WebElement uINextReportDateTextView;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl2_userReview_grdLog_ctl00_lblStatusDate")
			public WebElement uINextReviewDateTextView;

			@FindBy(how = How.XPATH, using = "//table[@id='tabCorEntry_tmpl2_userReview_grdLog']")
			public WebElement uIRemarksTableTextView;

			@FindBy(how = How.XPATH, using = "//a//img[@id='imgLoading']")
			public WebElement uIEditIcon;

		}
		
		public class CoronerCaseEntryEffortsTab {

			public CoronerCaseEntryEffortsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl3_userEffort_btnAddNotes")
			public WebElement uIAddNewEffortsButton;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl3_userEffort_grdLog_ctl00_lblChagedTo")
			public WebElement uIInvestogatorNameTextView;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl3_userEffort_grdLog_ctl00_lblStatusDate")
			public WebElement uIActivityCodeTextView;

			@FindBy(how = How.ID, using = "tabCorEntry_tmpl3_userEffort_grdLog_ctl00_lblNxtReview")
			public WebElement uIDateFromTextView;
			
			@FindBy(how = How.XPATH, using = "(//table[@id='tabCorEntry_tmpl3_userEffort_grdLog']//tr//td[@colspan='3'])[3]")
			public WebElement uIRemarksTableTextView;

			@FindBy(how = How.XPATH, using = "//a//img[@id='imgLoading']")
			public WebElement uIEditInfoIcon;

		}
		
		public class CoronerCaseEntryReportsTab {
			public WebDriver driver;

			public CoronerCaseEntryReportsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "grdCoronerReports")
			public WebElement uIReportingTable;

			@FindBy(how = How.ID, using = "cmdPrintAll")
			public WebElement uIViewCaseFileButton;

			@FindBy(how = How.ID, using = "cmdAddReport")
			public WebElement uIAddReportButton;

			@FindBy(how = How.ID, using = "btnRefresh")
			public WebElement uIRefreshButton;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;

		}
		
		public class CoronerCaseEntryEvidenceTab {
			public WebDriver driver;

			public CoronerCaseEntryEvidenceTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "grdEvi")
			public WebElement uIEvidenceTable;

			@FindBy(how = How.ID, using = "cmdPrintAll")
			public WebElement uIViewCaseFileButton;

			@FindBy(how = How.ID, using = "btnAdd")
			public WebElement uIAddNewButton;

			@FindBy(how = How.ID, using = "btnReset")
			public WebElement uIResetButton;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;

		}

	

	}

	public class CoronerCaseSearch {

		public WebDriver driver;
	
		public CoronerCaseSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

	
		}	

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[(text()='Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_numTaskNbr_Year")
		public WebElement uIInvestYearEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_numTaskNbr_Year")
		public WebElement uIInvestNoEdit;
		
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcName_NameType")
		public WebElement uINameType;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcName_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcName_MiddleName")
		public WebElement uIMiddleEdit;
		
		
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_ncRmsCase_Year")
		public WebElement uIRMSCaseYear;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_ncRmsCase_Number")
		public WebElement uIRMSCaseNo;
				
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_dttDeathFrom_KPIDttmCtrl")
		public WebElement uIDateofDeathFrom;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_dttDeathTo_KPIDttmCtrl")
		public WebElement uIDateofDeathTo;
		
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_chkDOD")
		public WebElement uIDodUknownCheckbox;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcName_imgSrch")
		public WebElement uINameIbobble;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_CddStatus_DropDown")
		public WebElement uIStatusDropDown;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_CddCaseStatus")
		public WebElement uICaseStatusDropDown;
		

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_lupInvPF_CodeValue")
		public WebElement uIInvestigator;
		
		@FindBy(how = How.ID, using = "tabCorEntry_tmpl0_usrmain1_dttDttmFrom_KPIDttmCtrl")
		public WebElement uIDateAssigned;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_addrRprtdLoc_txtFrom")
		public WebElement uIAddressOfDeath;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_CddCauseofDeath_Input")
		public WebElement uICauseOfDeathInput;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_CddCauseofDeath_DropDown")
		public WebElement uICauseOfDeathCombobox;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_CddMannerofDeath_Input")
		public WebElement uIMannerOfDeathInput;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_CddMannerofDeath_DropDown")
		public WebElement uIMannerOfDeathCombobox;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_CddMortuary_DropDown")
		public WebElement uILocalMortuary;	
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_txtAgeatDOD")
		public WebElement uIAgeAtDOD;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcFName_NameType")
		public WebElement uIFacilitynameType;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcFName_NameTypeID")
		public WebElement uIFacilityNameIDEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcFName_LastName")
		public WebElement uIFacilityLastNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcFName_FirstName")
		public WebElement uIFacilityFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_nmcFName_MiddleName")
		public WebElement uIFacilityMiddleEdit;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlusrCoronerSrchMain_txtremarks")
		public WebElement uIRemarksEdit;
		
		@FindBy(how = How.ID, using = "grdCBE")
		public WebElement uICaseSearchTable;
	
	
		
	}
	
	public class CoronerReview
	{
		public WebDriver driver;
		public CoronerReview() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how = How.ID, using = "dttCurrentReviewDate_KPIDttmCtrl")
		public WebElement uICurrentReviewDate;
		
		@FindBy(how = How.ID, using = "CddCaseStatus_DropDown")
		public WebElement uICoronerCaseStatusDropDown;
		
		@FindBy(how = How.ID, using = "dttstatusdatetime_Date_KPIDttmCtrl")
		public WebElement uIDate;
		
		@FindBy(how = How.XPATH, using = "//input[@class='textboxdatetime igte_BlueThemeEditInContainer']")
		public WebElement uITime;
		
		@FindBy(how = How.ID, using = "lstTextName")
		public WebElement uIRemarksTemplateDropDown;
		
		@FindBy(how = How.ID, using = "cmdload")
		public WebElement uIRemarksTemplateLoad;
		
		@FindBy(how = How.ID, using = "rteKPITxt_contentIframe")
		public WebElement uIRemarksFrame;
		
		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIRemarksTextBody;
		
		@FindBy(how = How.ID, using = "dttnxtReviewDate_KPIDttmCtrl")
		public WebElement uINextReviewDate;
		
		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
	}
	
	public class CoronerEfforts
	{
		public WebDriver driver;
		public CoronerEfforts() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how = How.ID, using = "lupInvPFID_CodeValue")
		public WebElement uIInvestigatorEdit;
		
		@FindBy(how = How.ID, using = "CddCorCtegory_DropDown")
		public WebElement uICoronerCategoryDropDown;
		
		@FindBy(how = How.ID, using = "CddActivity")
		public WebElement uICoronerActivityDropDown;
		
		@FindBy(how = How.ID, using = "dttmstarted_Date_KPIDttmCtrl")
		public WebElement uIStartedDate;
		
		
		@FindBy(how = How.ID, using = "dttmfinished_Time")
		public WebElement uIFinishedTime;
		
		@FindBy(how = How.ID, using = "dttmfinished_Date_KPIDttmCtrl")
		public WebElement uIFinishedDate;
		
		@FindBy(how = How.ID, using = "txtHours")
		public WebElement uICumlativeHours;
		
		@FindBy(how = How.ID, using = "txtMinutes")
		public WebElement uICumlativeMinutes;
		
		@FindBy(how = How.XPATH, using = "//input[@class='textboxdatetime igte_BlueThemeEditInContainer']")
		public WebElement uIStartedTime;
		
		@FindBy(how = How.ID, using = "lstTextName")
		public WebElement uIRemarksTemplateDropDown;
		
		@FindBy(how = How.ID, using = "cmdload")
		public WebElement uIRemarksTemplateLoad;
		
		@FindBy(how = How.ID, using = "rteKPITxt_contentIframe")
		public WebElement uIRemarksFrame;
		
		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIRemarksTextBody;
		
		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
	}
	
	public class CoronerCaseReportEntry
	{
		public WebDriver driver;
		public CoronerCaseReportEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how = How.ID, using = "numTaskNbr_Year")
		public WebElement uICoronerInvestYear;
		
		@FindBy(how = How.ID, using = "numTaskNbr_Number")
		public WebElement uICoronerInvestNo;
		
		@FindBy(how = How.ID, using = "cddRptType_DropDown")
		public WebElement uICoronerReportTypeDropDown;
		
		@FindBy(how = How.ID, using = "lstReportStatus_DropDown")
		public WebElement uIStatusDropDown;
		
		@FindBy(how = How.ID, using = "lupReportedPF_CodeValue")
		public WebElement uIReportedByEdit;
		
		@FindBy(how = How.ID, using = "lupReportedPF_CodeDescription")
		public WebElement uIReportedOfficerEdit;
		
		
		@FindBy(how = How.ID, using = "dttReported_Time_clientState")
		public WebElement uITime;
		
		@FindBy(how = How.ID, using = "dttReported_Date_KPIDttmCtrl")
		public WebElement uIDate;
		
		@FindBy(how = How.ID, using = "txtRptDesc")
		public WebElement uIDescription;
		
		@FindBy(how = How.ID, using = "lstTextName")
		public WebElement uIRemarksTemplateDropDown;
		
		@FindBy(how = How.ID, using = "cmdload")
		public WebElement uIRemarksTemplateLoad;
		
		@FindBy(how = How.ID, using = "rteKPITxt_contentIframe")
		public WebElement uIRemarksFrame;
		
		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIRemarksTextBody;
		
		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
	}

	public class CoronerEvidenceEntry
	{
		public WebDriver driver;
		public CoronerEvidenceEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uILeftSideStatusBar;

		
		@FindBy(how = How.ID, using = "nbrInvestNumber_Year")
		public WebElement uICoronerInvestYear;
		
		@FindBy(how = How.ID, using = "nbrInvestNumber_Number")
		public WebElement uICoronerInvestNo;
		
		@FindBy(how = How.ID, using = "nbrEvidenceNumber_Year")
		public WebElement uIEvidenceYear;
		
		@FindBy(how = How.ID, using = "nbrEvidenceNumber_Number")
		public WebElement uIEvidenceNo;
		
		@FindBy(how = How.ID, using = "txtItemNbr")
		public WebElement uIEvidenceItemSequenceNo;
		
		@FindBy(how = How.ID, using = "cddReason_DropDown")
		public WebElement uIReasonDropDown;
		
		@FindBy(how = How.ID, using = "cddEvidenceType_DropDown")
		public WebElement uIEvidenceTypeDropDown;
		
		
		@FindBy(how = How.ID, using = "dttmDeathDate_Time")
		public WebElement uITimeOfDeath;
		
		@FindBy(how = How.ID, using = "dttmDeathDate_Date_KPIDttmCtrl")
		public WebElement uIDateofdeath;
		
		@FindBy(how = How.ID, using = "txtDesc")
		public WebElement uIDescription;
		
		@FindBy(how = How.ID, using = "cddStorageLoc")
		public WebElement uIEvidenceStorageLocationDropDown;
		
		@FindBy(how = How.ID, using = "cddEvidenceStatus_DropDown")
		public WebElement uIEvidenceStatusDropDown;
		
		@FindBy(how = How.ID, using = "txtQty")
		public WebElement uIQuantity;
		
		@FindBy(how = How.ID, using = "dtLocDate_KPIDttmCtrl")
		public WebElement uIChangeLocDate;
		
		@FindBy(how = How.ID, using = "txtLocChangeReason")
		public WebElement uIChangeLocReason;
		
		@FindBy(how = How.ID, using = "lblLocChangeReason")
		public WebElement uIChangeLocReasonLbl;
		
		
		
		@FindBy(how = How.ID, using = "btnViewHistory")
		public WebElement uIViewhistory;
		
		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		
		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		@FindBy(how = How.ID, using = "cmdAddNew")
		public WebElement uIAddnew;
		
	}
	public class CoronerEvidenceSearch {

		public WebDriver driver;
	
		public CoronerEvidenceSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

	
		}	

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[(text()='Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrCoronerInvest_Year")
		public WebElement uIInvestYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrCoronerInvest_Number")
		public WebElement uIInvestNoEdit;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_lstJuris")
		public WebElement uIJurisDropdown;
			
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrRMSCase_Year")
		public WebElement uIRMSCaseYear;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrRMSCase_Number")
		public WebElement uIRMSCaseNo;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrPrpertyFrom_Year")
		public WebElement uIEvidenceYearFrom;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrPrpertyFrom_Number")
		public WebElement uIEvidenceNoFrom;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_txtnbrPrpertyFrom")
		public WebElement uIEvidenceSeqFrom;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrPrpertyTo_Year")
		public WebElement uIEvidenceYearTo;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_nbrPrpertyTo_Number")
		public WebElement uIEvidenceNoTo;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_txtnbrPrpertyTo")
		public WebElement uIEvidenceSeqTo;
		
					
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_cddlblEvidenceType_DropDown")
		public WebElement uIEvidenceTypeDropDown;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_cddReason_DropDown")
		public WebElement uIReasonDropDown;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCorSrchBasic_cddPropStatus_DropDown")
		public WebElement uIStatusDropDown;
		
		
		@FindBy(how = How.ID, using = "grdEvi")
		public WebElement uIEvidenceSearchTable;
	
	
		
	}
	
	public class CoronerEvidenceHistory {

		public WebDriver driver;
	
		public CoronerEvidenceHistory() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

	
		}	
		@FindBy(how = How.ID, using = "grdLocationHistory")
		public WebElement uIEvidenceHistoryTable;
		
	}

	
	


}
