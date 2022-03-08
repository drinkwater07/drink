package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapCM {
	public WebDriver driver;

	public CMSearch cMSearch;
	public CaseFolder caseFolder;
	public MOSearch mOSearch;
	public CaseReview caseReview;
	public CaseEfforts caseEfforts;

	public UIMapCM() {
		if (this.cMSearch == null)
			this.cMSearch = new CMSearch();

		if (this.caseFolder == null)
			this.caseFolder = new CaseFolder();

		if (this.mOSearch == null)
			this.mOSearch = new MOSearch();

		if (this.caseReview == null)
			this.caseReview = new CaseReview();

		if (this.caseReview == null)
			this.caseReview = new CaseReview();

		if (this.caseEfforts == null)
			this.caseEfforts = new CaseEfforts();

	}

	public class CMSearch {

		public CMSearchAdvancedTab cMSearchAdvancedTab;

		public CMSearch() {
			if (cMSearchAdvancedTab == null)
				cMSearchAdvancedTab = new CMSearchAdvancedTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_numCaseNbr_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_numCaseNbr_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_nbrInvest_Year")
		public WebElement uIInvestYearEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_imgClear")
		public WebElement uIDateRangeClearButton;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_nbrInvest_Number")
		public WebElement uIInvestNumberEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_lupOfficers_CodeValue")
		public WebElement uIInvestigatorCodeEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_lupSupervisor_CodeValue")
		public WebElement uISupervisorCodeEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "grdCases")
		public WebElement uICMSearchTable;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_cddShowOnly_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Advanced')]")
		public WebElement uIAdvancedTab;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_DttmFrom_Date_KPIDttmCtrl")
		public WebElement uIDateRangeFromEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl0_Usrcasesrchbsc2_DttmEnd_Date_KPIDttmCtrl")
		public WebElement uIDateRangeToEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabCase_tmpl0_Usrcasesrchbsc2_DttmFrom_Time']//input")
		public WebElement uIFromTimeEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabCase_tmpl0_Usrcasesrchbsc2_DttmEnd_Time']//input")
		public WebElement uIToTimeEdit;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIconButton;

	}

	public class CMSearchAdvancedTab {

		public CMSearchAdvancedTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_cddMOType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_LstCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_LstDetail_DropDown")
		public WebElement uIDetailComboBox;

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_txtMOMoment")
		public WebElement uIMOCommentEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_cddEffortsCat_DropDown")
		public WebElement uIEffortsCategoryComboBox;

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_cddActivity_DropDown")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_txtTotEffort")
		public WebElement uITotalEffortHoursEdit;

		@FindBy(how = How.ID, using = "tabCase_tmpl1_Usrcasesrchbsc3_txtTextSrch")
		public WebElement uIHistoryTextEdit;
	}

	public class CaseFolder {

		public CaseFolderAssignmentTab caseFolderAssignmentTab;
		public CaseFolderTasksTab caseFolderTasksTab;
		public CaseFolderHistoryTab caseFolderHistoryTab;
		public CaseFolderCustomTab caseFolderCustomTab;
		public CaseFolderInvestigatorsTab caseFolderInvestigatorsTab;
		public ReviewTab reviewTab;
		public CaseFolderEffortsTab caseFolderEffortsTab;
		public CaseFolderMOTab caseFolderMOTab;
		public CaseFolderUCRTab caseFolderUCRTab;
		public CaseFolderReportingTab caseFolderReportingTab;
		

		public CaseFolder() {
			if (this.caseFolderAssignmentTab == null)
				this.caseFolderAssignmentTab = new CaseFolderAssignmentTab();

			if (this.caseFolderTasksTab == null)
				this.caseFolderTasksTab = new CaseFolderTasksTab();

			if (this.caseFolderHistoryTab == null)
				this.caseFolderHistoryTab = new CaseFolderHistoryTab();

			if (this.caseFolderCustomTab == null)
				this.caseFolderCustomTab = new CaseFolderCustomTab();

			if (this.caseFolderInvestigatorsTab == null)
				this.caseFolderInvestigatorsTab = new CaseFolderInvestigatorsTab();

			if (this.reviewTab == null)
				this.reviewTab = new ReviewTab();

			if (this.caseFolderEffortsTab == null)
				this.caseFolderEffortsTab = new CaseFolderEffortsTab();

			if (this.caseFolderMOTab == null)
				this.caseFolderMOTab = new CaseFolderMOTab();

			if (this.caseFolderUCRTab == null)
				this.caseFolderUCRTab = new CaseFolderUCRTab();

			if (this.caseFolderReportingTab == null)
				this.caseFolderReportingTab = new CaseFolderReportingTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "numCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "numCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "numInvestPFNo_Year")
		public WebElement uIInvenstYearEdit;

		@FindBy(how = How.ID, using = "numInvestPFNo_Number")
		public WebElement uIInvestNumberEdit;

		@FindBy(how = How.ID, using = "txtLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "custHeaderCSZ_City")
		public WebElement uICSZCityEdit;

		@FindBy(how = How.ID, using = "custHeaderCSZ_State_DropDown")
		public WebElement uICSZStateComboBox;

		@FindBy(how = How.ID, using = "custHeaderCSZ_Zip")
		public WebElement uICSZZipEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Assignment')]")
		public WebElement uIAssignmentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Investigator(s)')]")
		public WebElement uIInvestigatorsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Review')]")
		public WebElement uIReviewTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Task')]")
		public WebElement uITasksTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabCaseMgmt']//span[@mkr ='ti3']")
		public WebElement uIEffortsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'MO')]")
		public WebElement uIMOTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabCaseMgmt']//span[@mkr ='ti6']")
		public WebElement uIUCRTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reporting')]")
		public WebElement uIReportingTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'History')]")
		public WebElement uIHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'TeamWork')]")
		public WebElement uICustomTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'QAForm')]")
		public WebElement uIQAFormsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "lblCaseStatus")
		public WebElement uICaseStatusTextView;

		@FindBy(how = How.ID, using = "cmdClose")
		public WebElement uIReopenButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdScheduler")
		public WebElement uICalenderIcon;

		@FindBy(how = How.XPATH, using = "//img[contains(@src,'ico/Customize_1.png')]")
		public WebElement uICustomSettingIcon;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Manage Custom Fields')]")
		public WebElement uIManageCustomField;

		@FindBy(how = How.ID, using = "lblCaseStatus")
		public WebElement uIStatusTextView;

		@FindBy(how = How.ID, using = "lblDispositonStatus")
		public WebElement uIDispositionStatusTextView;
		

        @FindBy(how = How.ID, using = "numCaseNo_imgBtn")
        public WebElement uICaseInfoIcon;

		  @FindBy(how = How.ID, using = "lstJuris")
        public WebElement uIJurisComboBox;
        
		 @FindBy(how = How.XPATH, using = "//div[@id='tabCaseMgmt']//span[text()='Review']")
        public WebElement uIReviewText;
		 
		 @FindBy(how = How.ID, using = "lblAssignedDttm")											// added by Abi
	        public WebElement uIAssignedDateText;
		 
	}

	public class CaseFolderAssignmentTab {

		public CaseFolderAssignmentTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_lupSupervisor_CodeValue")
		public WebElement uISupervisorCodeEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_lupSupervisor_CodeDescription")
		public WebElement uISupervisorDesEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_lupSupervisor_imgBtn")
		public WebElement uISupervisorSearchImageButton;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_dttmAssigned_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabCaseMgmt_tmpl0_usrCMAssign1_dttmAssigned_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_lupPrime_CodeValue")
		public WebElement uIPrimeInvestigatorCodeEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_lupPrime_CodeDescription")
		public WebElement uIPrimeInvestigatorDesEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_lupPrime_imgBtn")
		public WebElement uIPrimeInvestigatorSearchButton;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_txtSF")
		public WebElement uISolvabilityFactorEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_dtcReview_KPIDttmCtrl")
		public WebElement uINextReviewDateEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_dtcReport_KPIDttmCtrl")
		public WebElement uINextReportDateEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_rteKPITxt_contentIframe")
		public WebElement uICommentsRichTextEdit;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_cddTemplate")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_btnLoad")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "tabCaseMgmt_tmpl0_usrCMAssign1_txtStatus")
		public WebElement uICaseStatusTextView;

	}

	public class CaseFolderTasksTab {

		public CaseFolderTasksTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "CmdAddNew")
		public WebElement uIAddNewTaskButton;

		@FindBy(how = How.ID, using = "lupAssignsuper_CodeValue")
		public WebElement uIAssignedSupervisorCodeEdit;

		@FindBy(how = How.ID, using = "lupAssignsuper_CodeDescription")
		public WebElement uIAssignedSupervisorDescriptionEdit;

		@FindBy(how = How.ID, using = "lupAssignTo_CodeValue")
		public WebElement uIAssignedToPFEdit;

		@FindBy(how = How.ID, using = "lupAssignTo_CodeDescription")
		public WebElement uIAssignedToPFDescriptionEdit;

		@FindBy(how = How.ID, using = "cddTaskcode_DropDown")
		public WebElement uITaskCodeComboBox;

		@FindBy(how = How.ID, using = "txttaskDetails")
		public WebElement uITaskDetailsEdit;

		@FindBy(how = How.ID, using = "AssignedDttm_Date_KPIDttmCtrl")
		public WebElement uIAssignedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'AssignedDttm_Time']//input")
		public WebElement uIAssignedTimeEdit;

		@FindBy(how = How.ID, using = "DueDttm_Date_KPIDttmCtrl")
		public WebElement uIDueByDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'DueDttm_Time']//input")
		public WebElement uIDueByTimeEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "grdCFSTask")
		public WebElement uITasksTabTable;

		@FindBy(how = How.ID, using = "Completeddttm_Date_KPIDttmCtrl")
		public WebElement uICompletedDateEdit;

		@FindBy(how = How.ID, using = "dttmTo_KPIDttmCtrl")
		public WebElement uICompletedFinishDateEdit;

	}

	public class CaseFolderHistoryTab {

		public CaseFolderHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdHistory1")
		public WebElement uIHistoryTabTable;

		@FindBy(how = How.ID, using = "rdoHistory_0")
		public WebElement uIInvestigatorRadioButton;

		@FindBy(how = How.ID, using = "rdoHistory_1")
		public WebElement uIEffortsRadioButton;

		@FindBy(how = How.ID, using = "rdoHistory_2")
		public WebElement uICaseStudiesRadioButton;

		@FindBy(how = How.ID, using = "rdoHistory_3")
		public WebElement uITasksRadioButton;

		@FindBy(how = How.ID, using = "rdoHistory_4")
		public WebElement uIShowAllRadioButton;

		// @FindBy(how = How.XPATH, using =
		// "//div[@table='grdHistory1']//span[@id='grdHistory1_ctl00_lblDttm']")
		// public WebElement uIHistory1DateTextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblDttm")
		public WebElement uIHistory1DateTextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl01_lblDttm")
		public WebElement uIHistory2DateTextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl02_lblDttm")
		public WebElement uIHistory3DateTextView;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeDescription")
		public WebElement uIPFDescriptionEdit;

		@FindBy(how = How.ID, using = "btnFilter")
		public WebElement uILoadButton;

		@FindBy(how = How.XPATH, using = "//div[@table='grdHistory1']//span[@id='grdHistory1_ctl00_lblEnteredBy']")
		public WebElement uIEnteredByPF1TextView;

		// @FindBy(how = How.ID, using = "grdHistory1_ctl00_lblEnteredBy")
		// public WebElement uIEnteredByPF1TextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblEnteredBy")
		public WebElement uIEnteredByPF2TextView;

		@FindBy(how = How.XPATH, using = "//table[@id = 'grdHistory1']//td")
		public WebElement uIEffortsTable;

		@FindBy(how = How.XPATH, using = "//table[@id = 'grdHistory1']//td")
		public WebElement uITasksTable;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblC1")
		public WebElement uIInvestigatorName2TextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl02_lblC1")
		public WebElement uIInvestigatorName1TextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl03_lblC1")
		public WebElement uIInvestigatorNameTextView;

	}

	public class CaseFolderCustomTab {

		public CaseFolderCustomTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtTeam")
		public WebElement uICustomFieldsEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uICustomTabSaveButton;
	}

	public class CaseFolderInvestigatorsTab {

		public CaseFolderInvestigatorsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdOfficers")
		public WebElement uIInvestigatorsTabTable;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "lupOfficers_CodeValue")
		public WebElement uIOfficersCodeEdit;

		@FindBy(how = How.ID, using = "txtTeam")
		public WebElement uICustomFieldsEdit;

		@FindBy(how = How.ID, using = "dttmAssigned_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmAssigned_Time']//input")
		public WebElement uIAssignedTimeEdit;

		@FindBy(how = How.ID, using = "cddAction_DropDown")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "chkPrime")
		public WebElement uITaskCodeComboBox;

		@FindBy(how = How.ID, using = "cmdAddPF")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClearPF")
		public WebElement uIClearButton;

	}

	public class ReviewTab {

		public ReviewTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnAddReview")
		public WebElement uIAddNewReviewButton;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblC1")
		public WebElement uICaseStatusTextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblC3")
		public WebElement uINextReviewDateTextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblC4")
		public WebElement uINextReportDateTextView;

		@FindBy(how = How.XPATH, using = "//a//img[@id='imgLoading']")
		public WebElement uIEditIcon;

	}

	public class CaseFolderEffortsTab {

		public CaseFolderEffortsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnAddEffort")
		public WebElement uIAddNewEffortsButton;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblC1")
		public WebElement uIInvestogatorNameTextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblC2")
		public WebElement uIActivityCodeTextView;

		@FindBy(how = How.ID, using = "grdHistory1_ctl00_lblC4")
		public WebElement uICumulativeHoursTextView;

		@FindBy(how = How.XPATH, using = "//a//img[@id='imgLoading']")
		public WebElement uIEditInfoIcon;

	}

	public class CaseFolderMOTab {

		public CaseFolderMOTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cddMOType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "LstCategory")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "LstDetail")
		public WebElement uIDetailComboBox;

		@FindBy(how = How.ID, using = "txtComment")
		public WebElement uICommentEdit;

		@FindBy(how = How.ID, using = "imgAddMO")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdCBEMO")
		public WebElement uIMOTable;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

	}

	public class CaseFolderUCRTab {

		public CaseFolderUCRTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupDisposition_CodeValue")
		public WebElement uIUCRDispositionCodeEdit;

		@FindBy(how = How.ID, using = "lupDisposition_imgBtn")
		public WebElement uIUCRDispositionSearchButton;

		@FindBy(how = How.ID, using = "dtcDisposition_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "cddTemplate")
		public WebElement uITTemplateComboBox;

		@FindBy(how = How.ID, using = "btnLoad")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "btnInternalSave")
		public WebElement uISaveButton;

	}

	public class CaseFolderReportingTab {

		public CaseFolderReportingTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdCBEReports")
		public WebElement uIReportingTable;

		@FindBy(how = How.ID, using = "cmdPrintAll")
		public WebElement uIViewCaseFileButton;

		@FindBy(how = How.ID, using = "chkIncAll")
		public WebElement uIViewCaseFilePopUpScreenSelectAllCheckbox;

		@FindBy(how = How.ID, using = "chkPrintRPT")
		public WebElement uIViewCaseFilePopUpScreenIncludeProeprtyReportCheckbox;

		@FindBy(how = How.ID, using = "cmdIncRpt")
		public WebElement uIViewCaseFilePopUpScreenShowPDFButton;

		@FindBy(how = How.ID, using = "cmdAddReport")
		public WebElement uIAddReportButton;

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
	}

	public class MOSearch {

		public MOSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cddMOType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "LstCategory")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "LstDetail")
		public WebElement uIDetailComboBox;

		@FindBy(how = How.ID, using = "grdMO")
		public WebElement uIMOSearchTable;
	}

	public class CaseReview {

	

		public CaseReview() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lupStatusUpdate_DropDown")
		public WebElement uICaseStatusComboBox;

		@FindBy(how = How.ID, using = "dtcDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "dtcNewRevDate_KPIDttmCtrl")
		public WebElement uINextReviewDateEdit;

		@FindBy(how = How.ID, using = "dtcNewRptDate_KPIDttmCtrl")
		public WebElement uINextReportDateEdit;

		@FindBy(how = How.ID, using = "cddTemplate")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "btnLoad")
		public WebElement uILoadButton;
		
		@FindBy(how = How.ID, using = "lblCaseDesc")
		public WebElement uIStatusLabel;
		
	     @FindBy(how = How.XPATH, using = "//input[@class='textboxdatetime igte_BlueThemeEditInContainer']")
	        public WebElement uITimeEdit;

	}

	public class CaseEfforts {

		public CaseEfforts() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lupOfficers_CodeValue")
		public WebElement uIInvestigatorCodeEdit;

		@FindBy(how = How.ID, using = "lupCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "lupActivity")
		public WebElement uIActivityCodeComboBox;

		@FindBy(how = How.ID, using = "dttmStart_Date_KPIDttmCtrl")
		public WebElement uIDateStartedEdit;

		@FindBy(how = How.ID, using = "cddTemplate")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "btnLoad")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "dttmFinished_Date_KPIDttmCtrl")
		public WebElement uIDateFinishedEdit;

		@FindBy(how = How.XPATH, using = "//td//table//tbody//tr//input[@id ='txtCTime']")
		public WebElement uICumulativeTimeHoursEdit;

		@FindBy(how = How.XPATH, using = "//td//input[@id ='txtMinitus']")
		public WebElement uICumulativeTimeMinutesEdit;

	}

}
