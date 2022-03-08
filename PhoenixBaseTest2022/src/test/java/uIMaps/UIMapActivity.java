package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import application.Activity.AddMultiplePF;
import utilities.Playback;

public class UIMapActivity {

	public ActivityEntry activityEntry;
	public ActivitySearch activitySearch;
	public ActivitySearchHelpWindow activitySearchHelpWindow;
	public ActivityCalendarEntry activityCalendarEntry;
	public ActivityQuickEntry activityQuickEntry;

	public AddMultiplePF addMultiplePF;

	public UIMapActivity() {

		if (this.activityEntry == null)
			this.activityEntry = new ActivityEntry();

		if (this.activitySearch == null)
			this.activitySearch = new ActivitySearch();

		if (this.activitySearchHelpWindow == null)
			this.activitySearchHelpWindow = new ActivitySearchHelpWindow();

		if (this.activityCalendarEntry == null)
			this.activityCalendarEntry = new ActivityCalendarEntry();

		if (this.activityQuickEntry == null)
			this.activityQuickEntry = new ActivityQuickEntry();

if (addMultiplePF == null)
			addMultiplePF = new AddMultiplePF();
	}

	public class ActivityEntry {

		public WebDriver driver;
		public ActivityEntryPFTab activityEntryPFTab;
		public ActivityEntryLogEntryTab activityEntryLogEntryTab;
		public ActivityEntryOtherTab activityEntryOtherTab;
		public ActivityEntryLogHistoryTab activityEntryLogHistoryTab;
		public ActivityEntryVisitorsTab activityEntryVisitorsTab;
		public ActivityEntryMaintenanceTab activityEntryMaintenanceTab;
		public ActivityEntryPublicEducationTab activityEntryPublicEducationTab;
		public ActivityEntryQAFormsTab activityEntryQAFormsTab;
		public NamesTab namesTab;
		public ActivityEntryFeesTab activityEntryFeesTab;
		public ActivityEntryServiceHistoryTab activityEntryServiceHistoryTab;
		public SchedulesTab schedulesTab;
		public RecurrencePopUp recurrencePopUp;
		public ActivityEntryAttachmentTab activityEntryAttachmentTab;
		public ActivityEntryTR1Tab activityEntryTR1Tab = null;

		public ActivityEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.activityEntryPFTab == null)) {
				this.activityEntryPFTab = new ActivityEntryPFTab();
			}

			if ((this.activityEntryLogEntryTab == null)) {
				this.activityEntryLogEntryTab = new ActivityEntryLogEntryTab();
			}

			if ((this.activityEntryOtherTab == null)) {
				this.activityEntryOtherTab = new ActivityEntryOtherTab();
			}

			if ((this.activityEntryLogHistoryTab == null)) {
				this.activityEntryLogHistoryTab = new ActivityEntryLogHistoryTab();
			}

			if ((this.activityEntryAttachmentTab == null)) {
				this.activityEntryAttachmentTab = new ActivityEntryAttachmentTab();
			}

			if ((this.activityEntryVisitorsTab == null)) {
				this.activityEntryVisitorsTab = new ActivityEntryVisitorsTab();
			}

			if ((this.activityEntryMaintenanceTab == null)) {
				this.activityEntryMaintenanceTab = new ActivityEntryMaintenanceTab();
			}

			if ((this.activityEntryPublicEducationTab == null)) {
				this.activityEntryPublicEducationTab = new ActivityEntryPublicEducationTab();
			}

			if ((this.activityEntryQAFormsTab == null)) {
				this.activityEntryQAFormsTab = new ActivityEntryQAFormsTab();
			}
			if ((this.namesTab == null)) {
				this.namesTab = new NamesTab();
			}

			if ((this.activityEntryFeesTab == null)) {
				this.activityEntryFeesTab = new ActivityEntryFeesTab();
			}
			if ((this.activityEntryServiceHistoryTab == null)) {
				this.activityEntryServiceHistoryTab = new ActivityEntryServiceHistoryTab();
			}
			if ((this.schedulesTab == null)) {
				this.schedulesTab = new SchedulesTab();
			}
			if ((this.recurrencePopUp == null)) {
				this.recurrencePopUp = new RecurrencePopUp();
			}

			if ((this.activityEntryTR1Tab == null)) {
				this.activityEntryTR1Tab = new ActivityEntryTR1Tab();
			}
		}

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "cddCategoryGroup_DropDown")
		public WebElement uICategoryGroupComboBox;

		@FindBy(how = How.ID, using = "cddCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "cddActivityType")
		public WebElement uIActivityTypeComboBox;

		@FindBy(how = How.ID, using = "cddActivityStatus_DropDown")
		public WebElement uIActivityStatusComboBox;

		@FindBy(how = How.ID, using = "lblIncidentNo")
		public WebElement uIIncidentNoEdit;

		@FindBy(how = How.ID, using = "dtmActDttm_Date_KPIDttmCtrl")
		public WebElement uIActivityDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtmActDttm_Time']//input")
		public WebElement uIActivityTimeEdit;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "chkIsWhiteBoard")
		public WebElement uIWhiteBoardCheckBox;

		@FindBy(how = How.ID, using = "cddUnit_DropDown")
		public WebElement uIUnitComboBox;

		@FindBy(how = How.ID, using = "cddFleetNumber_DropDown")
		public WebElement uIFleetNoComboBox;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "adrLocation_chkVerify")
		public WebElement uILocationCheckbox;

		@FindBy(how = How.ID, using = "adrLocation_cmdIncOnAddr")
		public WebElement uILocationInfoIcon;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Other')]")
		public WebElement uIOtherTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'PF')]")
		public WebElement uIPFTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Log Entry')]")
		public WebElement uILogEntryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fees')]")
		public WebElement uIFeesTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "dtmActDttm_Date_KPIDttmCtrl")
		public WebElement uIActivityFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtmActDttm_Time']//input")
		public WebElement uIActivityFromTimeEdit;

		@FindBy(how = How.ID, using = "dttmActTo_Date_KPIDttmCtrl")
		public WebElement uIActivityToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmActTo_Time']//input")
		public WebElement uIActivityToTimeEdit;

		@FindBy(how = How.ID, using = "chkIsWhiteBoard")
		public WebElement uIShowonWhiteBoardCheckBox;

		@FindBy(how = How.ID, using = "chkIsPrivate")
		public WebElement uIPrivateCheckBox;

		@FindBy(how = How.ID, using = "chkAllActivityDay")
		public WebElement uIAllDayCheckBox;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uILocationTextbox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Log History')]")
		public WebElement uILogHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Visitors')]")
		public WebElement uIVisitorsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Maintenance')]")
		public WebElement uIMaintenanceTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Public Education')]")
		public WebElement uIPublicEducationTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[(text()='QA Forms')]")
		public WebElement uISmokeQAFormsTab;

		@FindBy(how = How.ID, using = "cddFleetNumber_DropDown")
		public WebElement uIFleetNumberComboBox;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteIcon;

		@FindBy(how = How.ID, using = "btnCopy")
		public WebElement uICopyButton;

		@FindBy(how = How.ID, using = "nbrActivity_Number")
		public WebElement uIActivityNoEdit;

		@FindBy(how = How.ID, using = "nbrActivity_Year")
		public WebElement uIActivityYearEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Names')]")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Service History')]")
		public WebElement uIServiceHistoryTab;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "//span[contains(@class,'igtab_BlueThemeTHCenterSel')]")
		public WebElement uIAttachmentTabBGcolor;

		@FindBy(how = How.ID, using = "dttmSchFrm_Date_KPIDttmCtrl")
		public WebElement uIScheduledFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmSchFrm_Time']//input")
		public WebElement uIScheduledFromTimeEdit;

		@FindBy(how = How.ID, using = "ChkRecurrence")
		public WebElement uIRecurrenceEdit;

		@FindBy(how = How.ID, using = "dttmSchTo_Date_KPIDttmCtrl")
		public WebElement uIScheduledToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmSchTo_Time']//input")
		public WebElement uIScheduledToTimeEdit;

		@FindBy(how = How.ID, using = "BtnOpenRecurrence")
		public WebElement uIOpenRecurrenceButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Schedules')]")
		public WebElement uISchedulesTab;

		@FindBy(how = How.CLASS_NAME, using = "statusBar")
		public WebElement uIStatusBar;

		@FindBy(how = How.XPATH, using = "//label[text()=' Show on Whiteboard']")
		public WebElement uIShowOnWhiteboardLabel;

		@FindBy(how = How.ID, using = "cmdInfo1")
		public WebElement uIFleetIBubble;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'TR1')]")
		public WebElement uITR1Tab;

		@FindBy(how = How.ID, using = "imgActivityTview")
		public WebElement uIActivityTypeTreeViewIcon;

@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_cmdAddMulPF")
		public WebElement uIAddMultiplePFButton;
	}

	public class ActivityEntryPFTab {
		public WebDriver driver;

		public ActivityEntryPFTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_lupPFNbr_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_lupPFNbr_imgBtn")
		public WebElement uIPFLookupButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_cddPFActivity_DropDown")
		public WebElement uIPFActivityComboBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_cddPFStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_cddUnit_DropDown")
		public WebElement uIUnitComboBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_txtHWork")
		public WebElement uIHoursWorkedEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_txtHCredit")
		public WebElement uICreditsEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_txtHPaid")
		public WebElement uIHoursPaidEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_cddScale_DropDown")
		public WebElement uIPayScaleComboBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_grdPFDtls")
		public WebElement uIResultPFTabGrid;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_dtmStart_Date_KPIDttmCtrl")
		public WebElement uIPFTabFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl0_usrPF1_dtmStart_Time']//input")
		public WebElement uIPFTabFromTimeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_dtmEnd_Date_KPIDttmCtrl")
		public WebElement uIPFTabToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl0_usrPF1_dtmEnd_Time']//input")
		public WebElement uIPFTabToTimeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_ChkSelectAll")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "dttmSchFrm_Date_KPIDttmCtrl")
		public WebElement uIPFTabScheduledFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmSchFrm_Time']//input")
		public WebElement uIPFTabScheduledFromTimeEdit;

		@FindBy(how = How.ID, using = "dttmSchTo_Date_KPIDttmCtrl")
		public WebElement uIPFTabScheduledToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmSchTo_Time']//input")
		public WebElement uIPFTabScheduledToTimeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_lblHourCredits")
		public WebElement uIPointsLabel;

		@FindBy(how = How.ID, using = "tabActivity_tmpl0_usrPF1_cmdAddMulPF")
		public WebElement uIAddMultiplePFButton;

	}

	public class ActivityEntryLogEntryTab {
		public WebDriver driver;

		public ActivityEntryLogEntryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabActivity_tmpl1_usrLogEntry1_cddTemplate")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl1_usrLogEntry1_btnLoad")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl1_usrLogEntry1_btnAddNew")
		public WebElement uIAddnewButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl1_usrLogEntry1_KPIRadActivityLog_contentIframe")
		public WebElement uINarrativeRichTextEdit;
	}

	public class ActivityEntryOtherTab {

		public WebDriver driver;

		public ActivityEntryOtherTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_dttmSchDate_Date_KPIDttmCtrl")
		public WebElement uIScheduleDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl6_usrWorkFlow1_dttmSchDate_Time']//input")
		public WebElement uIScheduleTimeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_lupCFS_CodeValue")
		public WebElement uICFSedit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cddSRC_DropDown")
		public WebElement uISRCdropdown;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_chkCADSchedule")
		public WebElement uIScheduleCADCheckBox;

		@FindBy(how = How.ID, using = "ui-accordion-Dv_accordion1-header-1")
		public WebElement uIMultiplePFLabel;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cddRefType_DropDown")
		public WebElement uIRefTypeComboBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_txtRefNo")
		public WebElement uIRefTypeNumberEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_dtmDueBy_Date_KPIDttmCtrl")
		public WebElement uIDueByDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl6_usrWorkFlow1_dtmDueBy_Time']//input")
		public WebElement uIDueByTimeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cddPriority_DropDown")
		public WebElement uIPriorityComboBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_chkIsReportable")
		public WebElement uIReportableCheckBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_dttmCompleted_Date_KPIDttmCtrl")
		public WebElement uICompletedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl6_usrWorkFlow1_dttmCompleted_Time']//input")
		public WebElement uICompletedTimeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_txtCustom")
		public WebElement uICustomFieldEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_dtmEntry_Date_KPIDttmCtrl")
		public WebElement uIEntryDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl6_usrWorkFlow1_dtmEntry_Time']//input")
		public WebElement uIEntryTimeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_lupPFNbr_CodeValue")
		public WebElement uIEnteredByEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_lupPFNbr_imgBtn")
		public WebElement uIEnteredByLookupButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_chkIsReportable")
		public WebElement uISendNoticeOnChangesCheckBox;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cddDivision_DropDown")
		public WebElement uIDivisionDropdown;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cddSection_DropDown")
		public WebElement uISectionDropdown;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cddTeam_DropDown")
		public WebElement uITeamDropdown;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_lupSquad_CodeValue")
		public WebElement uISquadEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cmdImgAdd")
		public WebElement uIAdd1Button;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cmdImgClear")
		public WebElement uIClear1Button;

		@FindBy(how = How.ID, using = "ui-accordion-Dv_accordion1-header-1")
		public WebElement uIAssingedPFArrow;

		@FindBy(how = How.ID, using = "ui-accordion-Dv_accordion1-header-0")
		public WebElement uIDivisionSectionSquadArrow;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_lupAssignedTo_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_lupAssignedTo_CodeDescription")
		public WebElement uIPFDesEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_imgAdd")
		public WebElement uIAdd2Button;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_imgClear")
		public WebElement uIClear2Button;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_cmdAddMulPF")
		public WebElement uIAddMultiplePFButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_lupSquad_imgBtn")
		public WebElement uISquadLookUpButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl6_usrWorkFlow1_grdDistributedPF")
		public WebElement uIOtherTabResultTable;

	}

	public class ActivityEntryLogHistoryTab {
		public WebDriver driver;

		public ActivityEntryLogHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "dtDate_Date_KPIDttmCtrl")
		public WebElement uIUpdateDateTextBox;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtDate_Time'] //input")
		public WebElement uIUpdateTimeTextBox;

		@FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
		public WebElement uIUpdatedByTextBox;

		@FindBy(how = How.ID, using = "txtDuration")
		public WebElement uIDurationTextBox;

		@FindBy(how = How.ID, using = "cddDurationType_DropDown")
		public WebElement uIDurationTypeDropdown;

		@FindBy(how = How.ID, using = "txtLog")
		public WebElement uICommentsTextBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		@FindBy(how = How.XPATH, using = "//table[@id='listMsg']//div")
		public WebElement uILogHistoryGridButton;
		
		

	}

	public class ActivityEntryAttachmentTab {
		public AttachmentPopupWindow attachmentPopupWindow = null;
		public WebDriver driver;

		public ActivityEntryAttachmentTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (this.attachmentPopupWindow == null)
				this.attachmentPopupWindow = new AttachmentPopupWindow();
		}

		@FindBy(how = How.ID, using = "cmdAddFile")
		public WebElement uIAddFiles;

		public class AttachmentPopupWindow {

			public AttachmentPopupWindow() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cddCategory_DropDown")
			public WebElement uICategoryComboBox;

			@FindBy(how = How.ID, using = "radFolderName_Input")
			public WebElement uIFolderNameEdit;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_txtDescription")
			public WebElement uIRemarksEdit;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnSingle")
			public WebElement uISingleFileRadioButton;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnBulk")
			public WebElement uIBulkAttachmentRadioButton;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnLink")
			public WebElement uILinkRadioButton;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_uploadfileTextBox0")
			public WebElement uIFileEdit;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_uploadfilefile0")
			public WebElement uISelectButton;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cmdAddAttachment")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cmdCancelAttachment")
			public WebElement uICancelButton;

			@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_uploadfileListContainer")
			public WebElement uIContainer;

		}

	}

	public class ActivityEntryVisitorsTab {
		public WebDriver driver;

		public ActivityEntryVisitorsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_nNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_txtEmail")
		public WebElement uIEmailEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl2_usrVisitors1_tmTimeIn_Time'] //input")
		public WebElement uITimeInEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabActivity_tmpl2_usrVisitors1_tmTimeOut_Time'] //input")
		public WebElement uITimeOutEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_grdVisitors")
		public WebElement uIVisitorGirdTable;

		@FindBy(how = How.ID, using = "tabActivity_tmpl2_usrVisitors1_nNameID_imgSrch")
		public WebElement uINameInfoIconButton;

	}

	public class ActivityEntryMaintenanceTab {
		public WebDriver driver;

		public ActivityEntryMaintenanceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCurrMil")
		public WebElement uICurrentMileageEdit;

		@FindBy(how = How.ID, using = "txtHrs")
		public WebElement uICurrentHoursEdit;

		@FindBy(how = How.ID, using = "lupSerVName_CodeValue")
		public WebElement uIVendorEdit;

		@FindBy(how = How.ID, using = "txtvendorCost")
		public WebElement uICostEdit;

		@FindBy(how = How.ID, using = "chkuseinventory")
		public WebElement uIUseItemfromInventryCheckBox;

		@FindBy(how = How.ID, using = "txtinventory")
		public WebElement uIInventoryNoEdit;

		@FindBy(how = How.ID, using = "txtpartnum")
		public WebElement uIEnterpartNoEdit;

		@FindBy(how = How.ID, using = "txtdesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtqty")
		public WebElement uIQtyEdit;

		@FindBy(how = How.ID, using = "txtcost")
		public WebElement uIQtyCostEdit;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdPartList")
		public WebElement uIMaintenanceGirdTable;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "imgLockup")
		public WebElement uIInventoryLookUpButton;

	}

	public class ActivityEntryPublicEducationTab {

		public WebDriver driver;

		public ActivityEntryPublicEducationTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_cddProgName_DropDown")
		public WebElement uIProgramNameDropdown;

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_txtQtyApplicable")
		public WebElement uIQtyifAppicableEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_txtLocationName")
		public WebElement uILocationNameEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_nNameID_LastName")
		public WebElement uIContactLastNameEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_nNameID_FirstName")
		public WebElement uIContactFirstNameEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_txtContactInfo")
		public WebElement uIContactInfoEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_txtAdults")
		public WebElement uINoOfAdultsEdit;

		@FindBy(how = How.ID, using = "tabActivity_tmpl3_usrPublicEducation1_txtChildren")
		public WebElement uINoOfChildrenEdit;

	}

	public class ActivityEntryQAFormsTab {
		public WebDriver driver;

		public ActivityEntryQAFormsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupEntryOfficer_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "rdo100020000045269_0")
		public WebElement uIDwellingType1RadioButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Smoke')]")
		public WebElement uISmokeQAFormsTab;

		@FindBy(how = How.ID, using = "cddForm_DropDown")
		public WebElement uISelectFormComboBox;

		@FindBy(how = How.ID, using = "cmdrefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdQAForms']")
		public WebElement uIQAFormsTable;

	}

	public class NamesTab {
		public WebDriver driver;

		public NamesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityCombobox;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "grdCBENames")
		public WebElement uINamesGirdTable;
	}

	public class ActivityEntryTR1Tab {
		public WebDriver driver;

		public ActivityEntryTR1Tab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "lupEntryOfficer_CodeValue")
		public WebElement uIPFNoEdit;

		@FindBy(how = How.ID, using = "ArpQuestion_1376")
		public WebElement uIDivQuestionTable;

	}

	public class ActivityEntryFeesTab {
		public WebDriver driver;

		public ActivityEntryFeesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddFeeInvoiceType")
		public WebElement uIInvoiceTypeComboBox;

		@FindBy(how = How.ID, using = "BillName_NameType")
		public WebElement uIBillToAccountNameTypeEdit;

		@FindBy(how = How.ID, using = "BillName_NameTypeID")
		public WebElement uIBillToAccountNameIDEdit;

		@FindBy(how = How.ID, using = "cddItemCode")
		public WebElement uIItemCodeComboBox;

		@FindBy(how = How.ID, using = "txtQty")
		public WebElement uIQuantityEdit;

		@FindBy(how = How.ID, using = "txtRate")
		public WebElement uIRateEdit;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

	}

	public class ActivityEntryServiceHistoryTab {
		public WebDriver driver;

		public ActivityEntryServiceHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabActivity_tmpl11_usrServiceHistory1_lupVendorName_CodeValue")
		public WebElement uIVendorCode;

		@FindBy(how = How.ID, using = "tabActivity_tmpl11_usrServiceHistory1_lupVendorName_CodeDescription")
		public WebElement uIVendorCodeDescription;

		@FindBy(how = How.ID, using = "tabActivity_tmpl11_usrServiceHistory1_txtvendorCost")
		public WebElement uICost;

		@FindBy(how = How.ID, using = "tabActivity_tmpl11_usrServiceHistory1_txtComment")
		public WebElement uINotes;
	}

	public class SchedulesTab {
		public WebDriver driver;

		public SchedulesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabActivity_tmpl14_Schedules_grdSchHist")
		public WebElement uISchedulesResultTable;

		@FindBy(how = How.ID, using = "spanKeyCode")
		public WebElement uIPFNotesIconToolTip;

		@FindBy(how = How.ID, using = "popupBoxClose")
		public WebElement uIPFNotesIconToolTipCloseButton;

	}

	public class RecurrencePopUp {
		public WebDriver driver;

		public RecurrencePopUp() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "AppointmentRecurrenceEditor_RepeatFrequencyHourly")
		public WebElement uIHourlyRadioButton;

		@FindBy(how = How.ID, using = "AppointmentRecurrenceEditor_RepeatFrequencyDaily")
		public WebElement uIDailyRadioButton;

		@FindBy(how = How.ID, using = "AppointmentRecurrenceEditor_RangeOccurrences")
		public WebElement uIEndAfterCodeEdit;

		@FindBy(how = How.ID, using = "btnClose")
		public WebElement uICloseButton;

	}

	public class ActivitySearch {

		public WebDriver driver;

		public ActivitySearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtActPeriod_Date_KPIDttmCtrl")
		public WebElement uIActivityFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtActPeriod_Time']//input")
		public WebElement uIActivityFromTimeEdit;

		@FindBy(how = How.ID, using = "dtActTo_Date_KPIDttmCtrl")
		public WebElement uIActivityToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtActTo_Time']//input")
		public WebElement uIActivityToTimeEdit;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIDateResetButton;

		@FindBy(how = How.ID, using = "chkIsWhiteBoard")
		public WebElement uIShowWhiteBoardItemOnlyCheckBox;

		@FindBy(how = How.ID, using = "cddCategoryGroup_DropDown")
		public WebElement uICategoryGroupDropdown;

		@FindBy(how = How.ID, using = "cddCategory_DropDown")
		public WebElement uICategoryDropdown;

		@FindBy(how = How.ID, using = "cddActivityType_Input")
		public WebElement uIActivityTypeDropdown;

		@FindBy(how = How.ID, using = "cddActivityType_DropDown")
		public WebElement uIActivityTypeRadControlDropdown;

		@FindBy(how = How.ID, using = "cddActivityStatus_DropDown")
		public WebElement uIActivityStatusDropdown;

		@FindBy(how = How.ID, using = "lupActivityBy_CodeValue")
		public WebElement uIActivityByEdit;

		@FindBy(how = How.ID, using = "cddPriority_DropDown")
		public WebElement uIPriorityDropdown;

		@FindBy(how = How.ID, using = "cddUnit_Input")
		public WebElement uIUnitDropdown;

		@FindBy(how = How.ID, using = "cddFleet_DropDown")
		public WebElement uIFleetDropdown;

		@FindBy(how = How.ID, using = "cddFollowupBy_DropDown")
		public WebElement uIFollowUpByDropdown;

		@FindBy(how = How.ID, using = "ddlApproval")
		public WebElement uIApprovalStatusDropdown;

		@FindBy(how = How.ID, using = "ui-accordion-Dv_accordion1-header-0")
		public WebElement uIDivisionSectionSquadArrow;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionDropdown;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionDropdown;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamDropdown;

		@FindBy(how = How.ID, using = "lupSquad_CodeValue")
		public WebElement uISquadDropdown;

		@FindBy(how = How.ID, using = "ui-accordion-Dv_accordion1-header-1")
		public WebElement uIMultiplePFArrow;

		@FindBy(how = How.ID, using = "cmdAddMulAssiPF")
		public WebElement uIAssignedToButton;

		@FindBy(how = How.ID, using = "lupPersonnelPF_CodeValue")
		public WebElement uIPFNoEdit;

		@FindBy(how = How.ID, using = "cddPFActivity_DropDown")
		public WebElement uIPFActivityDropdown;

		@FindBy(how = How.ID, using = "cddPFStatus_DropDown")
		public WebElement uIPFStatusDropdown;

		@FindBy(how = How.ID, using = "ddlHoursOperator")
		public WebElement uIHoursWorkedDropdown;

		@FindBy(how = How.ID, using = "txtHWork")
		public WebElement uIHoursWorkedValueEdit;

		@FindBy(how = How.ID, using = "ddlCreditOperator")
		public WebElement uICreditsDropdown;

		@FindBy(how = How.ID, using = "txtHCredit")
		public WebElement uICreditsValueEdit;

		@FindBy(how = How.ID, using = "cddScale_DropDown")
		public WebElement uIPayScaleDropdown;

		@FindBy(how = How.ID, using = "cddAssignedShift_DropDown")
		public WebElement uIAssignedShiftDropdown;

		@FindBy(how = How.ID, using = "cddType_DropDown")
		public WebElement uITypeDropdown;

		@FindBy(how = How.ID, using = "cmdAddMulPF")
		public WebElement uIAddMultiplePFButton;

		@FindBy(how = How.ID, using = "cddEnteredBy_CodeValue")
		public WebElement uIEnteredByEdit;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "cddRefType_DropDown")
		public WebElement uIRefTypeEdit;

		@FindBy(how = How.ID, using = "txtRefNo")
		public WebElement uIRefTypeValueEdit;

		@FindBy(how = How.ID, using = "txtCustom")
		public WebElement uICustomEdit;

		@FindBy(how = How.ID, using = "txtLastName")
		public WebElement uIVisitorLastNameEdit;

		@FindBy(how = How.ID, using = "txtFirstName")
		public WebElement uIVisitorFirstNameEdit;

		@FindBy(how = How.ID, using = "grdActLogSrch")
		public WebElement uIActivityLogResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "lblHourCredits")
		public WebElement uIPointsCustomLabel;

		@FindBy(how = How.CLASS_NAME, using = "statusBar")
		public WebElement uIStatusBar;

		@FindBy(how = How.XPATH, using = "//label[text()='  Show Whiteboard Items Only']")
		public WebElement uIShowWhiteboardItemsOnlyLabel;

		@FindBy(how = How.ID, using = "cddPFStatus_Arrow")
		public WebElement uIPFStatusArrow;
		@FindBy(how = How.ID, using = "cddScale_Arrow")
		public WebElement uIPayScaleArrow;

		@FindBy(how = How.ID, using = "//span[text()='Patrol, Officer-P001    ']")
		public WebElement uILogInPFLabel;

	}

	public class ActivitySearchHelpWindow {
		public WebDriver driver;

		public ActivitySearchHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "grdActLogSrch")
		public WebElement uIActivityLogResultTable;

		@FindBy(how = How.ID, using = "lblName")
		public WebElement uIPFNamePopup;

		@FindBy(how = How.ID, using = "lblHomeNbr")
		public WebElement uIPhoneNoPopup;

		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Home#')]")
		public WebElement uIHomeNoColumn;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;
		
		@FindBy(how = How.ID, using = "btnAddPFs")
		public WebElement uIAddTheSelectedPFToTheList;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Patrol, Officer-P001']")
		public WebElement uILogInPF;
	}

	public class ActivityCalendarEntry {

		public WebDriver driver;

		public ActivityCalendarEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cddActivityType_Input")
		public WebElement uIFilterdropdown;

		@FindBy(how = How.XPATH, using = "//table[@class='k-scheduler-layout k-scheduler-monthview'] //div[contains(text(),'CAD Activity')]")
		public WebElement uISelectActivityrecordfromClander;

	}

	public class ActivityQuickEntry {
		public WebDriver driver;

		public ActivityQuickEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lblDttmDisp")
		public WebElement uIDateTimeDisplay;

		@FindBy(how = How.ID, using = "lblPFNbrDisp")
		public WebElement uIPFNameDisplay;

		@FindBy(how = How.ID, using = "lblTerminalDisp")
		public WebElement uITerminalDisplay;

		@FindBy(how = How.ID, using = "BtnCatGroup1")
		public WebElement uICategoryGrpOperation;

		@FindBy(how = How.ID, using = "BtnCatGroup2")
		public WebElement uICategoryGrpFleet;

		@FindBy(how = How.ID, using = "BtnCatGroup3")
		public WebElement uICategoryGrpAdmin;

		@FindBy(how = How.ID, using = "BtnCatGroup4")
		public WebElement uICategoryGrpFacility;

		@FindBy(how = How.ID, using = "BtnCatGroup5")
		public WebElement uICategoryGrpJaiCell;

		@FindBy(how = How.ID, using = "BtnCategory1")
		public WebElement uICategory1;

		@FindBy(how = How.ID, using = "BtnCategory2")
		public WebElement uICategory2;

		@FindBy(how = How.ID, using = "BtnActivity1")
		public WebElement uIActivityLog1;

		@FindBy(how = How.ID, using = "BtnActivity2")
		public WebElement uIActivityLog2;

		@FindBy(how = How.ID, using = "BtnActivity3")
		public WebElement uIActivityLog3;

		@FindBy(how = How.ID, using = "lupUnit_CodeValue")
		public WebElement uIUnitCodeEdit;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "adrLocation_cmdIncOnAddr")
		public WebElement uIAddressBblIcon;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "dtmStartDTTM_Date_KPIDttmCtrl")
		public WebElement uIStartDate;

		@FindBy(how = How.XPATH, using = "//table[@id='dtmStartDTTM_Time']//input")
		public WebElement uIStartTime;

		@FindBy(how = How.ID, using = "dtmEndDTTM_Date_KPIDttmCtrl")
		public WebElement uIEndDate;

		@FindBy(how = How.XPATH, using = "//table[@id='dtmEndDTTM_Time']//input")
		public WebElement uIEndTime;

		@FindBy(how = How.ID, using = "BtnSave")
		public WebElement uISaveBtn;

		@FindBy(how = How.ID, using = "BtnNew")
		public WebElement uINewBtn;

		@FindBy(how = How.ID, using = "btnDailyLog")
		public WebElement uIDailyLog;

		@FindBy(how = How.ID, using = "grdDailyActivity")
		public WebElement uIActivityLogTable7087Screen;

		@FindBy(how = How.XPATH, using = "//label[text()=' Show on Whiteboard']")
		public WebElement uIShowOnWhiteboardLabel;

		@FindBy(how = How.ID, using = "BtnHelp")
		public WebElement uIHelpButton;

	}

public class AddMultiplePF {
		public WebDriver driver;

		public AddMultiplePF() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddDiv_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "cddSec_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "btnClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "chkSelectAll")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "chkExpandTreeList")
		public WebElement uIExpandAllCheckBox;

		@FindBy(how = How.ID, using = "btnAddPFs")
		public WebElement uIAddTheSelectPFToListButton;

	}
}
