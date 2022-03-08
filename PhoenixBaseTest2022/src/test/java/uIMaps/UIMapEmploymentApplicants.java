package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import application.Popup;
import application.EmploymentApplicants.HiringTask;
import application.EmploymentApplicants.JobEntry;
import utilities.ObjectIdentification;
import utilities.Playback;

public class UIMapEmploymentApplicants {

	ObjectIdentification objectIdentification = new ObjectIdentification();
	Popup popup = new Popup();
	// EmploymentApplicants employmentApplicants = new EmploymentApplicants();
	public JobListings jobListings;
	public ApplicantEntry applicantEntry;
	public ApplicantSearch applicantSearch;
	public JobEntry jobEntry;
	public HiringTask hiringTask;

	public UIMapEmploymentApplicants() {
		if (jobListings == null)
			jobListings = new JobListings();

		if (applicantEntry == null)
			applicantEntry = new ApplicantEntry();

		if (applicantSearch == null)
			applicantSearch = new ApplicantSearch();

		if (jobEntry == null)
			jobEntry = new JobEntry();

		if (hiringTask == null)
			hiringTask = new HiringTask();
	}

	public class JobListings {
		WebDriver driver;

		public JobListings() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "cddJobName")
		public WebElement uIJobNameComboBox;

		@FindBy(how = How.ID, using = "cddLocation_DropDown")
		public WebElement uILocationComboBox;

		@FindBy(how = How.ID, using = "txtJob")
		public WebElement uIJobEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='dtcFromDate_KPIDttmCtrl']")
		public WebElement uIPostFromDateEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='dtcToDate_KPIDttmCtrl']")
		public WebElement uIPostToDateEdit;

		@FindBy(how = How.ID, using = "chkIsInActive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.XPATH, using = "//span[text()='Add New']")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Reset']")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Search']")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Back']")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "grdJobListing")
		public WebElement uIJobListingSearchTable;

	}

	public class ApplicantEntry {
		public ApplicantEntryMainTab applicantEntryMainTab;
		public ApplicantEntryTasksNScheduleTab applicantEntryTasksNScheduleTab;
		public ApplicantEntryNotesTab applicantEntryNotesTab;
		public ApprovalNStatusTab approvalNStatusTab;

		WebDriver driver;

		public ApplicantEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			
			if (applicantEntryMainTab == null)
				applicantEntryMainTab = new ApplicantEntryMainTab();
			
			if (applicantEntryTasksNScheduleTab == null)
				applicantEntryTasksNScheduleTab = new ApplicantEntryTasksNScheduleTab();
			
			if (applicantEntryNotesTab == null)
				applicantEntryNotesTab = new ApplicantEntryNotesTab();
			
			if (approvalNStatusTab == null)
				approvalNStatusTab = new ApprovalNStatusTab();
			
			
		}

		@FindBy(how = How.ID, using = "cddJobID")
		public WebElement uIJobIDDropdown;

		@FindBy(how = How.ID, using = "cstName_LastName")
		public WebElement uILastNameEdit;
		
		@FindBy(how = How.ID, using = "cstName_FirstName")
		public WebElement uIFirstNameEdit;
		
		@FindBy(how = How.ID, using = "mskPhoneNo")
		public WebElement uIPhoneNoEdit;
		
		@FindBy(how = How.ID, using = "txtEmail")
		public WebElement uIEmailEdit;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Main']")
		public WebElement uIMainTab;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Tasks & Schedule']")
		public WebElement uITasksNScheduleTab;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Approval & Status']")
		public WebElement uIApprovalNStatusTab;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Notes']")
		public WebElement uINotesTab;
		
		@FindBy(how = How.ID, using = "btnSubmitApplication")
		public WebElement uIRequestToSubmitApplication;
		
		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;
		
		
		
		
		public class ApplicantEntryMainTab {
			public WebDriver driver;

			public ApplicantEntryMainTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl0_usrApplicantEntryMain_txtYear")
			public WebElement uIYOSYearEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl0_usrApplicantEntryMain_txtMonth")
			public WebElement uIYOSMonthEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl0_usrApplicantEntryMain_txtDurYear")
			public WebElement uIDurationYearEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl0_usrApplicantEntryMain_txtDurMonth")
			public WebElement uIDurationMonthEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl0_usrApplicantEntryMain_cddLocation_DropDown")
			public WebElement uIForLocationDropdown;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl0_usrApplicantEntryMain_dtAppRevOn_KPIDttmCtrl")
			public WebElement uIApplicationReceivedOnEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl0_usrApplicantEntryMain_lupPF_CodeValue")
			public WebElement uIHROwnerPFEdit;
			
			@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
			public WebElement uILeftSideStatusBar;
		}
		
		public class ApplicantEntryTasksNScheduleTab
		{
			public WebDriver driver;

			public ApplicantEntryTasksNScheduleTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl1_usrTasksSchedule_cmdAddTask")
			public WebElement uIAddTaskButton;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl1_usrTasksSchedule_grdTaskSchedule")
			public WebElement uITaskScheduleResultTable;
			
			
			
		}
		
		public class  ApplicantEntryNotesTab 
		{
			
			public WebDriver driver;

			public ApplicantEntryNotesTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}
 
			@FindBy(how = How.ID, using = "btnAddNotes")
			public WebElement uIAddNotesButton;
			
			
		}
		
		public class  ApprovalNStatusTab 
		{
			
			public WebDriver driver;

			public ApprovalNStatusTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}
 
			
			
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_dtReviewCompleted_KPIDttmCtrl")
			public WebElement uIReviewCompletedEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_cddResult_DropDown")
			public WebElement uIResultDropdown;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_cmdOffDet")
			public WebElement uIOfferDetailsButton;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_dtOfferSentON_KPIDttmCtrl")
			public WebElement uIOfferSentOnEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_RdnOffAcc")
			public WebElement uIOfferAcceptedRadioButton;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_RdnOffDec")
			public WebElement uIDeclinedRadioButton;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_dtDate_KPIDttmCtrl")
			public WebElement uIAcceptanceStatusDateEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_txtUserName")
			public WebElement uILoginUserNameEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_txtPhone")
			public WebElement uIPhoneExtEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_txtIPAddress")
			public WebElement uIIPAddressForPCEdit;
			
			@FindBy(how = How.ID, using = "tabApplicantEntry_tmpl4_usrApplicantApproval_KpiSendMail")
			public WebElement uISendEmailToITButton;
			
			
		}
		
		
	}

	public class ApplicantSearch {

		WebDriver driver;

		public ApplicantSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_CddJobID")
		public WebElement uIJobNameComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddLocation_DropDown")
		public WebElement uILocationComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddApplicationStatus_DropDown")
		public WebElement uIApplicationStatusComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_lupAssignedTo_CodeValue")
		public WebElement uIAssignedToLookUpEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddAssDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_txtJobNo")
		public WebElement uIJobNumberEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_lupPF_CodeValue")
		public WebElement uIHROwnerPFLookUpEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddAssSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddAssSquad_DropDown")
		public WebElement uISquadComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddDivision_DropDown")
		public WebElement uIHROwnerDivisionComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddSection_DropDown")
		public WebElement uIHROwnerSectionComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddSquad_DropDown")
		public WebElement uIHROwnerSquadComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_numApplicationNo_Year")
		public WebElement uIApplicationYearEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_numApplicationNo_Number")
		public WebElement uIApplicationNoEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cstName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cstName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_txtApplicantID")
		public WebElement uIApplicantIDEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_mskPhoneNo")
		public WebElement uIPhoneNoEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_txtEmail")
		public WebElement uIEMailEdit;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddSex_DropDown")
		public WebElement uISexComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddRace_DropDown")
		public WebElement uIRaceComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddethnicity_DropDown")
		public WebElement uIEthnicityComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_dtDOB_KPIDttmCtrl")
		public WebElement uIDOBEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='tabApplicantBaic_tmpl0_usrApplicantBasicInfo_dtcFromDate_KPIDttmCtrl']")
		public WebElement uIApplicationFromDate;

		@FindBy(how = How.XPATH, using = "//input[@id='tabApplicantBaic_tmpl0_usrApplicantBasicInfo_dtcToDate_KPIDttmCtrl']")
		public WebElement uIApplicationToDate;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddExpLevel_DropDown")
		public WebElement uIExperienceLevelComboBox;

		@FindBy(how = How.ID, using = "tabApplicantBaic_tmpl0_usrApplicantBasicInfo_cddEducation_DropDown")
		public WebElement uIEducationComboBox;

		@FindBy(how = How.XPATH, using = "//span[text()='Add New']")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Reset']")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Search']")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Back']")
		public WebElement uIBackButton;
		
		@FindBy(how = How.ID, using = "grdApplicant")
        public WebElement uIApplicantSearchResultTable;

	}

	public class JobEntry {
		WebDriver driver;
		public JobEntryMainTab jobEntryMainTab;
		public JobEntryJobDescriptionTab jobEntryJobDescriptionTab;

		public JobEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (jobEntryMainTab == null) {
				jobEntryMainTab = new JobEntryMainTab();
			}

			if (jobEntryJobDescriptionTab == null) {
				jobEntryJobDescriptionTab = new JobEntryJobDescriptionTab();
			}

		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "txtJobName")
		public WebElement uIJobNameEdit;

		@FindBy(how = How.ID, using = "lstLocation_DropDown")
		public WebElement uILocationComboBox;

		@FindBy(how = How.ID, using = "txtJob")
		public WebElement uIJobNoEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='cmdSave'and //input[@tabindex='-1']]")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Main']")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Job Description']")
		public WebElement uIJobDescriptionTab;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;

		public class JobEntryMainTab {
			WebDriver driver;

			public JobEntryMainTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabEmptEntry_tmpl0_usrEmpEntryMain_btnCopy")
			public WebElement uICopyButton;

			@FindBy(how = How.ID, using = "btnCreate")
			public WebElement uICopyCreateNewJobButton;

			@FindBy(how = How.XPATH, using = "//input[@id='tabEmptEntry_tmpl0_usrEmpEntryMain_dttmFromDate_Date_KPIDttmCtrl']")
			public WebElement uIPostFromDate;

			@FindBy(how = How.XPATH, using = "//input[@id='tabEmptEntry_tmpl0_usrEmpEntryMain_dtmToDate_Date_KPIDttmCtrl']")
			public WebElement uIPostToDate;

			@FindBy(how = How.XPATH, using = "//table[@id='tabEmptEntry_tmpl0_usrEmpEntryMain_dttmFromDate_Time']//input")
			public WebElement uIPostFromTime;

			@FindBy(how = How.XPATH, using = "//table[@id='tabEmptEntry_tmpl0_usrEmpEntryMain_dtmToDate_Time']//input")
			public WebElement uIPostToTime;

			@FindBy(how = How.XPATH, using = "//input[@id='tabEmptEntry_tmpl0_usrEmpEntryMain_DtmAppPoolExpire_Date_KPIDttmCtrl']")
			public WebElement uIApplicantPoolExpiresDate;

			@FindBy(how = How.XPATH, using = "//table[@id='tabEmptEntry_tmpl0_usrEmpEntryMain_DtmAppPoolExpire_Time']//input")
			public WebElement uIApplicantPoolExpiresTime;

			@FindBy(how = How.ID, using = "tabEmptEntry_tmpl0_usrEmpEntryMain_cddJobApplication_DropDown")
			public WebElement uIJobApplicationComboBox;

			@FindBy(how = How.ID, using = "tabEmptEntry_tmpl0_usrEmpEntryMain_imgPersonnel")
			public WebElement uIPreviewButton;

			@FindBy(how = How.ID, using = "tabEmptEntry_tmpl0_usrEmpEntryMain_lupPF_CodeValue")
			public WebElement uIPFLookupEdit;

			@FindBy(how = How.ID, using = "tabEmptEntry_tmpl0_usrEmpEntryMain_lsCopyTask")
			public WebElement uICopyTasksFromJobComboBox;

			@FindBy(how = How.ID, using = "tabEmptEntry_tmpl0_usrEmpEntryMain_imgbtnAddTask")
			public WebElement uIAddTaskButton;

			@FindBy(how = How.ID, using = "tabEmptEntry_tmpl0_usrEmpEntryMain_grdEmpEntry")
			public WebElement uITaskGridTable;

		}

		public class JobEntryJobDescriptionTab {
			WebDriver driver;

			public JobEntryJobDescriptionTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.XPATH, using = "//div[@id='pnlTlbExternal']//input[@id='cmdSave']")
			public WebElement uIInternalSave;

			@FindBy(how = How.ID, using = "lstTextName")
			public WebElement uITemplateNameComboBox;

			@FindBy(how = How.ID, using = "cmdload")
			public WebElement uILoadButton;

			@FindBy(how = How.ID, using = "cmdAddnew")
			public WebElement uIAddNewButton;

			@FindBy(how = How.ID, using = "rteKPITxt_contentIframe")
			public WebElement uIRichTextEdit;

		}
	}

	public class HiringTask {
		WebDriver driver;

		public HiringTask() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstTaskDescription_DropDown")
		public WebElement uICopyTaskDescriptionComboBox;

		@FindBy(how = How.ID, using = "optInterview")
		public WebElement uIInterviewRadioButton;

		@FindBy(how = How.ID, using = "optBackgroundCheck")
		public WebElement uIBackgroundCheckRadioButton;

		@FindBy(how = How.ID, using = "optOthers")
		public WebElement uIOthersRadioButton;

		@FindBy(how = How.ID, using = "txtOrder")
		public WebElement uIOrderEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIPFAddButton;

		@FindBy(how = How.ID, using = "lstEmailTemplate")
		public WebElement uIEmailTemplateComboBox;

		@FindBy(how = How.ID, using = "btnEmailTemplateView")
		public WebElement uIEmailTemplateViewButton;

		@FindBy(how = How.ID, using = "btnEmailTemplateAddNew")
		public WebElement uIEmailTempalteAddNewButton;

		@FindBy(how = How.ID, using = "lstPDF_DropDown")
		public WebElement uIPDFComboBox;

		@FindBy(how = How.ID, using = "btnPDFView")
		public WebElement uIPDFViewButton;

		@FindBy(how = How.ID, using = "btnPDFAddNew")
		public WebElement uIPDFAddNewButton;

		@FindBy(how = How.ID, using = "btnSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "btnCancel")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "grdAssignedPF")
		public WebElement uIPFGridTable;

	}

}
