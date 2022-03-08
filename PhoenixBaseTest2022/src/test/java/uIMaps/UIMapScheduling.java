package uIMaps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;


public class UIMapScheduling {

	public TimeEntry timeEntry;
	public TimeSearch timeSearch;
	public Calendar calendar;
	public TradeSwapSearch tradeSwapSearch;
	public EventCode eventCode;
	public EventCodeEntry eventCodeEntry;
	public EventResources eventResources;
	public EventResourcesEntry eventResourcesEntry;
	public ScheduleSettings scheduleSettings;
	public TourEntry tourEntry;
	public RotationCodeEntry rotationCodeEntry;
	public GroupEntry groupEntry;
	public TimeCategory timeCategory;
	public TimeCategoryEntry timeCategoryEntry;
	public TimeTypeEntry timeTypeEntry;
	public WorkSheet workSheet;

	public RosterWindow rosterWindow;

	public JobGrade jobGrade;

	public JobGradeEntry jobGradeEntry;

	public UIMapScheduling() {

		if (this.timeEntry == null)
			this.timeEntry = new TimeEntry();

		if (this.timeSearch == null)
			this.timeSearch = new TimeSearch();

		if (this.calendar == null)
			this.calendar = new Calendar();

		if (this.tradeSwapSearch == null)
			this.tradeSwapSearch = new TradeSwapSearch();

		if (this.eventCode == null)
			this.eventCode = new EventCode();

		if (this.eventCodeEntry == null)
			this.eventCodeEntry = new EventCodeEntry();

		if (this.eventResources == null)
			this.eventResources = new EventResources();

		if (this.eventResourcesEntry == null)
			this.eventResourcesEntry = new EventResourcesEntry();

		if (this.scheduleSettings == null)
			this.scheduleSettings = new ScheduleSettings();

		if (this.tourEntry == null)
			this.tourEntry = new TourEntry();

		if (this.rotationCodeEntry == null)
			this.rotationCodeEntry = new RotationCodeEntry();

		if (this.groupEntry == null)
			this.groupEntry = new GroupEntry();

		if (this.timeCategory == null)
			this.timeCategory = new TimeCategory();

		if (this.timeCategoryEntry == null)
			this.timeCategoryEntry = new TimeCategoryEntry();

		if (this.timeTypeEntry == null)
			this.timeTypeEntry = new TimeTypeEntry();

				if (this.workSheet == null)
			this.workSheet = new WorkSheet();

		if (this.rosterWindow == null)
			this.rosterWindow = new RosterWindow();

		if (this.jobGrade == null)
			this.jobGrade = new JobGrade();

		if (this.jobGradeEntry == null)
			this.jobGradeEntry = new JobGradeEntry();

	}

	public class TimeEntry {
		public WebDriver driver;
		public CalenderTab calenderTab;

		public TimeEntry() {
			if (this.calenderTab == null)
				this.calenderTab = new CalenderTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nbrRequest_Year")
		public WebElement uIRequestYearEdit;

		@FindBy(how = How.ID, using = "nbrRequest_Number")
		public WebElement uIRequestNumberEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "dttmEntryDateTime_Date_KPIDttmCtrl")
		public WebElement uIEntryDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@ID='dttmEntryDateTime_Time'//input")
		public WebElement uIEntryTimeEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFNumberEdit;

		@FindBy(how = How.ID, using = "cddTimeAccumulator")
		public WebElement uITimeCategoryComboBox;

		@FindBy(how = How.ID, using = "cddTimeReasonCode")
		public WebElement uITimeTypeComboBox;

		@FindBy(how = How.XPATH, using = "//*[@ID='dttmFrom_Date_KPIDttmCtrl'")
		public WebElement uIRequestedForDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@dttmFrom_Date_KPIDttmCtrlID='dttmFrom_Time'//input")
		public WebElement uIPeriodForTimeEdit;

		@FindBy(how = How.ID, using = "dttmToDate_KPIDttmCtrl")
		public WebElement uIRequestedToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@ID='dttmToTime_Time'//input")
		public WebElement uIRequestedToTimeEdit;

		@FindBy(how = How.ID, using = "imgClearDate")
		public WebElement uITimeResetButton;

		@FindBy(how = How.ID, using = "dttmHours")
		public WebElement uIHoursEdit;

		@FindBy(how = How.ID, using = "dttmCalHours")
		public WebElement uICalculatedHoursEdit;

		@FindBy(how = How.ID, using = "rdoRequested")
		public WebElement uIRequestedRadioButton;

		@FindBy(how = How.ID, using = "rdoEarned")
		public WebElement uIEarnedRadioButton;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Calendar')")
		public WebElement uICalendarTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Other')")
		public WebElement uIOtherTab;

	}

	public class CalenderTab {
		public WebDriver driver;
		public CalenderTab calenderTab;

		public CalenderTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnFullCalendar")
		public WebElement uIShowFullCalendarButton;

	}

	public class TimeSearch {
		public WebDriver driver;

		public TimeSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Approval')")
		public WebElement uIAddApprovalButton;

		@FindBy(how = How.ID, using = "cddTimeAccumulator")
		public WebElement uITimeCategoryComboBox;

		@FindBy(how = How.ID, using = "cddTimeReasonCode")
		public WebElement uITimeTypeComboBox;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "rbTimeSheet")
		public WebElement uITimeSheetRadioButton;

		@FindBy(how = How.ID, using = "rbTSApproved")
		public WebElement uIApprovedRadioButton;

		@FindBy(how = How.ID, using = "rbTSNotApproved")
		public WebElement uINotApprovedRadioButton;

		@FindBy(how = How.ID, using = "grdTimeSearch")
		public WebElement uITimeSearchResultGrid;

		@FindBy(how = How.ID, using = "imgClearDate")
		public WebElement uIDateClearButton;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblWorkgroup")
		public WebElement uIGroupTextView;

		@FindBy(how = How.ID, using = "cddWorkgroup_DropDown")
		public WebElement uIGroupComboBox;

	}

	public class Calendar {
		public AppointmentsPopup appointmentsPopup;
		public WebDriver driver;

		public Calendar() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.appointmentsPopup == null)) {
				this.appointmentsPopup = new AppointmentsPopup();
			}

		}

		@FindBy(how = How.ID, using = "chkShowMyCalndr")
		public WebElement uIShowMyCalendarCheckbox;

		@FindBy(how = How.XPATH, using = "//table[@class='k-scheduler-layout k-scheduler-monthview' //div[contains(text(),'CAD Activity')")
		public WebElement uISelectActivityrecordfromClander;

		@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Show My Calendar')])")
		public WebElement uIShowMyCalenderButton;

		@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Search Appointments')])")
		public WebElement uISearchAppointmentsButton;

		@FindBy(how = How.XPATH, using = "//td[@class='k-today']")
		public WebElement uIClickCurrentDate;

		@FindBy(how = How.XPATH, using = "//table[@class='k-scheduler-layout k-scheduler-agendaview k-scheduler-agenda k-scrollbar-h']//div")
		public WebElement uIAddressTextfromAgenda;
		
		@FindBy(how = How.XPATH, using = "//li[(@class='k-state-default k-view-agenda k-state-selected')]/a[text()='Agenda']")
		public WebElement uIAgendaButton;
		
		
	}

	public class AppointmentsPopup {
		public WebDriver driver;

		public AppointmentsPopup() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//input[@name='title']")
		public WebElement uISubjectCodeEdit;

		@FindBy(how = How.ID, using = "txtFromDate")
		public WebElement uIStartTime;

		@FindBy(how = How.ID, using = "txtEndDate")
		public WebElement uIEndTime;

		@FindBy(how = How.ID, using = "resourcesContainer")
		public WebElement uIResourceComboBox;

		@FindBy(how = How.ID, using = "roomId")
		public WebElement uIEventTypeAndResourceComboBoxOptions;

		@FindBy(how = How.ID, using = "eventContainer")
		public WebElement uIEventTypeComboBox;

		@FindBy(how = How.XPATH, using = "//div//a[text()='Save']")
		public WebElement uISaveButton;

	}

	public class TradeSwapSearch {
		public WebDriver driver;

		public TradeSwapSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

	}

	public class EventCode {
		public WebDriver driver;

		public EventCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdEvtSrch")
		public WebElement uIEventCodeResultGrid;

		@FindBy(how = How.ID, using = "txtEventCode")
		public WebElement uIEventCodeEdit;

		@FindBy(how = How.ID, using = "txtEventName")
		public WebElement uIEventNameEdit;

		@FindBy(how = How.ID, using = "txtCustomName")
		public WebElement uICustomNameEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveBox;
	}

	public class EventCodeEntry {
		public WebDriver driver;

		public EventCodeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtEventCode")
		public WebElement uIEventCodeEdit;

		@FindBy(how = How.ID, using = "txtEventName")
		public WebElement uIEventNameEdit;

		@FindBy(how = How.ID, using = "txtCustomName")
		public WebElement uICustomNameEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "CDDCustomTheme_DropDown")
		public WebElement uICustomThemeComboBox;

		@FindBy(how = How.ID, using = "txtSortSeqNo")
		public WebElement uISortSeqNoEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveBox;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class EventResources {
		public WebDriver driver;

		public EventResources() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdResSrch")
		public WebElement uIEventResourcesResultGrid;

		@FindBy(how = How.ID, using = "lupPFCode_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "txtResourceName")
		public WebElement uIResourceNameEdit;

		@FindBy(how = How.ID, using = "txtDisplayName")
		public WebElement uIDisplayNameEdit;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIIncludeInactiveBox;
	}

	public class EventResourcesEntry {
		public WebDriver driver;

		public EventResourcesEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPFCode_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "txtResource")
		public WebElement uIResourceNameEdit;

		@FindBy(how = How.ID, using = "txtDisplayName")
		public WebElement uIDisplayNameEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveBox;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class ScheduleSettings {
		public WebDriver driver;
		public ScheduleSettingsTourTab scheduleSettingsTourTab;
		public ScheduleSettingsRotationTab scheduleSettingsRotationTab;
		public ScheduleSettingsGroupTab scheduleSettingsGroupTab;

		public ScheduleSettings() {

			if (this.scheduleSettingsTourTab == null)
				this.scheduleSettingsTourTab = new ScheduleSettingsTourTab();

			if ((this.scheduleSettingsRotationTab == null))
				this.scheduleSettingsRotationTab = new ScheduleSettingsRotationTab();

			if ((this.scheduleSettingsGroupTab == null))
				this.scheduleSettingsGroupTab = new ScheduleSettingsGroupTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Tour (Shift Hours)')")
		public WebElement uITourTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Rotation')")
		public WebElement uIRotationTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Group')")
		public WebElement uIGroupTab;

	}

	public class ScheduleSettingsTourTab {
		public WebDriver driver;

		public ScheduleSettingsTourTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabSchedule_tmpl0_usrTourCode_cmdSearch")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl0_usrTourCode_cmdTour")
		public WebElement uIAddTourCodeButton;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl0_usrTourCode_grdTourCode")
		public WebElement uITourCodeResultGrid;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl0_usrTourCode_chkIsActive")
		public WebElement uIIncludeInactiveBox;
	}

	public class ScheduleSettingsRotationTab {
		public WebDriver driver;

		public ScheduleSettingsRotationTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabSchedule_tmpl1_usrRotation_cmdSearch")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl1_usrRotation_cmdRotation")
		public WebElement uIAddRotationCodeButton;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl1_usrRotation_grdRotation")
		public WebElement uIRotationResultGrid;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl1_usrRotation_chkIsActive")
		public WebElement uIIncludeInactiveBox;
	}

	public class ScheduleSettingsGroupTab {
		public WebDriver driver;

		public ScheduleSettingsGroupTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabSchedule_tmpl2_usrWorkGroups_cmdSearch")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl2_usrWorkGroups_cmdWorkGroup")
		public WebElement uIAddGroupCodeButton;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl2_usrWorkGroups_grdWorkGroup")
		public WebElement uIGroupResultGrid;

		@FindBy(how = How.ID, using = "tabSchedule_tmpl2_usrWorkGroups_chkIsActive")
		public WebElement uIIncludeInactiveBox;
	}

	public class TourEntry {
		public WebDriver driver;

		public TourEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtTourCode")
		public WebElement uITourCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInactive")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "txtDispseq")
		public WebElement uIDisplaySeqEdit;

		@FindBy(how = How.XPATH, using = "//table[@ID = 'txtTimeFrom_Time' //input")
		public WebElement uITimeFromEdit;

		@FindBy(how = How.XPATH, using = "//table[@ID = 'txtTimeTo_Time' //input")
		public WebElement uITimeToEdit;
	}

	public class RotationCodeEntry {
		public WebDriver driver;

		public RotationCodeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtRotation")
		public WebElement uIRotationCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtScheduleMin")
		public WebElement uIScheduleMinEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInactive")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "cddTour")
		public WebElement uITourComboBox;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "rbtOnDuty")
		public WebElement uIOnDutyRadioCheckBox;

		@FindBy(how = How.ID, using = "rbtOffDuty")
		public WebElement uIOffDutyRadioCheckBox;

		@FindBy(how = How.ID, using = "txtDay")
		public WebElement uIDaysNoEdit;

		@FindBy(how = How.ID, using = "grdRotation")
		public WebElement uIRotationCodeResultGrid;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;
	}

	public class GroupEntry {
		public WebDriver driver;

		public GroupEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtWorkgroupCode")
		public WebElement uIGroupCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "dtStart_KPIDttmCtrl")
		public WebElement uIStartDateEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInactive")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "cddShift_DropDown")
		public WebElement uIShiftComboBox;

		@FindBy(how = How.ID, using = "cddShiftType_DropDown")
		public WebElement uIShiftTypeComboBox;

		@FindBy(how = How.ID, using = "cddScheduleColor_DropDown")
		public WebElement uIScheduleColorComboBox;

		@FindBy(how = How.ID, using = "cddRotation")
		public WebElement uIRotationComboBox;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "txtCalDisplay")
		public WebElement uICalenderDisplayLabelEdit;
	}

	public class TimeCategory {
		public WebDriver driver;

		public TimeCategory() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkExpandAll")
		public WebElement uIExpandAllCheckBox;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "cmdAddAcc")
		public WebElement uIAddTimeCategoryButton;

		@FindBy(how = How.ID, using = "cmdAddReason")
		public WebElement uIAddTimeTypeButton;

		@FindBy(how = How.ID, using = "grdAccumulator")
		public WebElement uITimeCategoryResultGrid;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uIRefreshIconButton;

		@FindBy(how = How.ID, using = "grdAccumulator_ctl00")
		public WebElement uITimeCategoryControlResultGrid;
	}

	public class TimeCategoryEntry {
		public WebDriver driver;

		public TimeCategoryEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtAccumulator")
		public WebElement uITimeCategoryCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInactive")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cddScheduleColor_DropDown")
		public WebElement uIScheduleColorComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.XPATH, using = "//div[@class = 'modal-body'")
		public WebElement uIWarningMessageTextView;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')")
		public WebElement uIYesButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'No')")
		public WebElement uINoButton;
	}

	public class TimeTypeEntry {
		public WebDriver driver;

		public TimeTypeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtTimeReason")
		public WebElement uITimeTypeCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInactive")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "cddTimeAccumulator")
		public WebElement uITimeCategoryComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "txtMultiplication")
		public WebElement uIMultiplicationEdit;

		@FindBy(how = How.ID, using = "txtAccountingSeq")
		public WebElement uIAccountingSeqEdit;

		@FindBy(how = How.ID, using = "cddReportable_DropDown")
		public WebElement uIReportableComboBox;

		@FindBy(how = How.ID, using = "cddCodeUsage_DropDown")
		public WebElement uICodePermissionComboBox;
	}
	public class WorkSheet {
		public WebDriver driver;

		public WorkSheet() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[text()='Roster']")
		public WebElement uIRosterButton;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.XPATH, using = "//input[contains(@src,'refresh.gif')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "chkShowCertifications")
		public WebElement uIShowCertificationsCheckBox;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "//div[@id='grid']")
		public WebElement uIWorkSheetResultGrid;

	}

	public class RosterWindow {
		public WebDriver driver;

		public RosterWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.XPATH, using = "//span[text()='Work Sheet']")
		public WebElement uIWorkSheetButton;
	}

	public class JobGrade {
		public WebDriver driver;

		public JobGrade() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAddJob")
		public WebElement uIAddJobGradeButton;

		@FindBy(how = How.ID, using = "grdJobGrade")
		public WebElement uIJobGradeTable;
	}

	public class JobGradeEntry {
		public WebDriver driver;

		public JobGradeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtJobGradeCode")
		public WebElement uIJobGradeCodeEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='dtmDateFrom_KPIDttmCtrl']")
		public WebElement uIEffectiveFromDate;

		@FindBy(how = How.XPATH, using = "//input[@id='dtmDateTo_KPIDttmCtrl']")
		public WebElement uIEffectiveToDate;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

	

	}
}
