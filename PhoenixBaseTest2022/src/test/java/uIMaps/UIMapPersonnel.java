package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapPersonnel {

	public PersonnelSearch personnelSearch;
	public PersonnelEntry personnelEntry;
	public PerformanceReview performanceReview;
	public PerformanceReviewEntry performanceReviewEntry;
	public AssignmentHistoryScreen assignmentHistoryScreen;
	public PersonnelLockDetailsScreen personnelLockDetailsScreen;
	public PersonnelBatchUpdate personnelBatchUpdate;
	public BatchUpdateEntry batchUpdateEntry;
	public WorkHistorySearch workHistorySearch;
	public InjuryRptSearch injuryRptSearch;
	public MedHistorySearch medHistorySearch;
	public AllowanceCode allowanceCode;
	public AllowanceCodeEntry allowanceCodeEntry;
	public WorkHistoryEntry workHistoryEntry;
	public SupervisorSearch supervisorSearch;
	public InjuryReportEntry injuryReportEntry;
	public MedicalHistoryEntry medicalHistoryEntry;

	public UIMapPersonnel() {
		if (this.personnelSearch == null)
			this.personnelSearch = new PersonnelSearch();
		if (this.personnelEntry == null)
			this.personnelEntry = new PersonnelEntry();
		if (this.performanceReview == null)
			this.performanceReview = new PerformanceReview();
		if (this.performanceReviewEntry == null)
			this.performanceReviewEntry = new PerformanceReviewEntry();
		if (this.assignmentHistoryScreen == null)
			this.assignmentHistoryScreen = new AssignmentHistoryScreen();
		if (this.personnelLockDetailsScreen == null)
			this.personnelLockDetailsScreen = new PersonnelLockDetailsScreen();
		if (this.personnelBatchUpdate == null)
			this.personnelBatchUpdate = new PersonnelBatchUpdate();
		if (this.batchUpdateEntry == null)
			this.batchUpdateEntry = new BatchUpdateEntry();
		if (this.workHistorySearch == null)
			this.workHistorySearch = new WorkHistorySearch();
		if (this.injuryRptSearch == null)
			this.injuryRptSearch = new InjuryRptSearch();
		if (this.medHistorySearch == null)
			this.medHistorySearch = new MedHistorySearch();
		if (this.allowanceCode == null)
			this.allowanceCode = new AllowanceCode();
		if (this.allowanceCodeEntry == null)
			this.allowanceCodeEntry = new AllowanceCodeEntry();
		if (this.workHistoryEntry == null)
			this.workHistoryEntry = new WorkHistoryEntry();
		if (this.supervisorSearch == null)
			this.supervisorSearch = new SupervisorSearch();
		if (this.injuryReportEntry == null)
			this.injuryReportEntry = new InjuryReportEntry();
		if (this.medicalHistoryEntry == null)
			this.medicalHistoryEntry = new MedicalHistoryEntry();
	}

	public class AllowanceCode {
		public WebDriver driver;

		public AllowanceCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddAllowanceCode_DropDown")
		public WebElement uIAllowanceCodeComboBox;

		@FindBy(how = How.ID, using = "cddAllowanceYear_DropDown")
		public WebElement uIYearComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIIncludeInActiveCheckBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdAllowanceSrch")
		public WebElement uIAllowanceCodeResultTable;

	}

	public class AllowanceCodeEntry {
		public WebDriver driver;

		public AllowanceCodeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddAllowanceCode_DropDown")
		public WebElement uIAllowanceCodeComboBox;

		@FindBy(how = How.ID, using = "cddAllowanceYear_DropDown")
		public WebElement uIYearComboBox;

		@FindBy(how = How.ID, using = "curAllowAmt")
		public WebElement uIAmountEdit;

		@FindBy(how = How.ID, using = "dtAllowanceFrom_KPIDttmCtrl")
		public WebElement uIDateFromEdit;

		@FindBy(how = How.ID, using = "dtAllowanceTo_KPIDttmCtrl")
		public WebElement uIDateToEdit;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInActiveCheckBox;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInActiveDateTextEdit;

		@FindBy(how = How.ID, using = "imgAddAllowanceStatic")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearAllowanceStatic")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdAllowanceStatic")
		public WebElement uIAllowanceCodeEntryResultTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;
	}

	public class PersonnelSearch {

		public WebDriver driver;

		public PersonnelSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cddSubAgency_DropDown")
		public WebElement uIPFSubAgency;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeDescription")
		public WebElement uIPFDesEdit;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "txtLoginUserName")
		public WebElement uILoginUserNameEdit;

		@FindBy(how = How.ID, using = "chkShowFire")
		public WebElement uIFireCheckBox;

		@FindBy(how = How.XPATH, using = "//div[@id='grdPersonnel']")
		public WebElement uIPersonnelResultTable;

		@FindBy(how = How.ID, using = "grdPersonnel_ctl01_lnkbtnNext")
		public WebElement uINextIcon;

		@FindBy(how = How.ID, using = "grdPersonnel_ctl01_lnkbtnPrev")
		public WebElement uIPrevIcon;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'MJ Roles')]")
		public WebElement uIMJRolesButton;

		@FindBy(how = How.ID, using = "lblWorkgroup")
		public WebElement uIGroupTextView;

		@FindBy(how = How.ID, using = "cddWorkgroup_DropDown")
		public WebElement uIGroupComboBox;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSquad_DropDown")
		public WebElement uISquadComboBox;

		@FindBy(how = How.ID, using = "lblSquad")
		public WebElement uISquadTextView;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "lupOffPFID_cmdIncOnAddr")
		public WebElement uIPFInfoIcon;

		@FindBy(how = How.ID, using = "chkLocked")
		public WebElement uIIsLockedCheckBox;

		@FindBy(how = How.ID, using = "lupSupervisor_CodeValue")
		public WebElement uISupervisorPFCodeEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lupSupervisor_CodeDescription")
		public WebElement uISupervisorPFDesEdit;

		@FindBy(how = How.ID, using = "dtcHiredFrom_KPIDttmCtrl")
		public WebElement uIHiredDateFromEdit;

		@FindBy(how = How.ID, using = "dtcHiredTo_KPIDttmCtrl")
		public WebElement uIHiredDateToEdit;
	}

	public class PersonnelEntry {

		public WebDriver driver;
		public PersonnelEntryAssignmentTab personnelEntryAssignmentTab;
		public PersonnelEntryWorkRecordTab personnelEntryWorkRecordTab;
		public PersonnelEntryMainTab personnelEntryMainTab;
		public PersonnelEntryPreferencesTab personnelEntryPreferencesTab;
		public PersonnelEntrySecurityTab personnelEntrySecurityTab;
		public PersonnelEntryTimeTab personnelEntryTimeTab;
		public PersonnelEntryTrainingTab personnelEntryTrainingTab;
		public PersonnelEntryAllowanceTab personnelEntryAllowanceTab;
		public PersonnelEntryInventoryTab personnelEntryInventoryTab;
		public PersonnelEntryEmergencyDataTab personnelEntryEmergencyDataTab;

		public PersonnelEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.personnelEntryMainTab == null)) {
				this.personnelEntryMainTab = new PersonnelEntryMainTab();
			}

			if ((this.personnelEntryAssignmentTab == null)) {
				this.personnelEntryAssignmentTab = new PersonnelEntryAssignmentTab();
			}

			if ((this.personnelEntryWorkRecordTab == null)) {
				this.personnelEntryWorkRecordTab = new PersonnelEntryWorkRecordTab();
			}

			if ((this.personnelEntryPreferencesTab == null)) {
				this.personnelEntryPreferencesTab = new PersonnelEntryPreferencesTab();
			}

			if ((this.personnelEntrySecurityTab == null)) {
				this.personnelEntrySecurityTab = new PersonnelEntrySecurityTab();
			}

			if ((this.personnelEntryTimeTab == null)) {
				this.personnelEntryTimeTab = new PersonnelEntryTimeTab();
			}

			if ((this.personnelEntryTrainingTab == null)) {
				this.personnelEntryTrainingTab = new PersonnelEntryTrainingTab();
			}

			if ((this.personnelEntryAllowanceTab == null)) {
				this.personnelEntryAllowanceTab = new PersonnelEntryAllowanceTab();
			}

			if ((this.personnelEntryInventoryTab == null)) {

				this.personnelEntryInventoryTab = new PersonnelEntryInventoryTab();
			}

			if ((this.personnelEntryEmergencyDataTab == null)) {

				this.personnelEntryEmergencyDataTab = new PersonnelEntryEmergencyDataTab();
			}
		}

		@FindBy(how = How.ID, using = "cstName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "cstName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtPFCode")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "txtEmployeeNumber")
		public WebElement uIEmployeeNumberEdit;

		@FindBy(how = How.ID, using = "chkIsLocked")
		public WebElement uILockedCheckBox;

		@FindBy(how = How.ID, using = "chkIsFire")
		public WebElement uIFireCheckBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Assignment')]")
		public WebElement uIAssignmentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Preferences')]")
		public WebElement uIPreferencesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Work Record')]")
		public WebElement uIWorkRecordTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Security')]")
		public WebElement uISecurityTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Time')]")
		public WebElement uITimeTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Training')])[1]")
		public WebElement uITrainingTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Allowance')]")
		public WebElement uIAllowanceTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdALC")
		public WebElement uIALCButton;

		@FindBy(how = How.XPATH, using = "//span[@title = 'Customize']")
		public WebElement uICustomizeButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement uISaveAndNewButton;

		@FindBy(how = How.ID, using = "cmdLockInfo")
		public WebElement uILockedInfoButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshIcon;

		@FindBy(how = How.ID, using = "cmdAccLocked")
		public WebElement uILockedButton;

		@FindBy(how = How.ID, using = "cmdALC")
		public WebElement uIALCIconButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "cddSubAgency_DropDown")
		public WebElement uISubAgencyDropdown;

		@FindBy(how = How.ID, using = "cstName_Suffix_DropDown")
		public WebElement uISuffixDropdown;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "cstPhone1_PhoneType_DropDown")
		public WebElement uIPhone1Dropdown;

		@FindBy(how = How.ID, using = "cstPhone2_PhoneType_DropDown")
		public WebElement uIPhone2Dropdown;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Emergency Data')]")
		public WebElement uIEmergencyDataTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintIcon;
		
		@FindBy(how = How.ID, using = "imgPersonnel")
		public WebElement uIPictureNotAvailable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Inventory')]")
		public WebElement uIInventoryTab;

	}

	public class PersonnelEntryMainTab {
		public WebDriver driver;

		public PersonnelEntryMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_cddEmailType1_DropDown")
		public WebElement uIEmail1ComboBox;
		
		 @FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/b")
		
		 public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_lblCustom1")
		public WebElement uICustom1TextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtCustom1")
		public WebElement uICustom1EditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_lblCustom2")
		public WebElement uICustom2TextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtCustom2")
		public WebElement uICustom2EditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_lblCustom3")
		public WebElement uICustom3TextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtCustom3")
		public WebElement uICustom3EditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_lblCustom4")
		public WebElement uICustom4TextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtCustom4")
		public WebElement uICustom4EditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtEmail1")
		public WebElement uIEmail1EditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_cddEmailType2_DropDown")
		public WebElement uIEmail2ComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtEmail2")
		public WebElement uIEmail2EditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_dtcHireDate_KPIDttmCtrl")
		public WebElement uIHireDateEditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtServiceYears")
		public WebElement uIServiceYearEditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtServiceMonths")
		public WebElement uIServiceMonthsEditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtServiceDays")
		public WebElement uIServiceDaysEditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtAdditionalYears")
		public WebElement uIAdditionalYearsEditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtAdditionalMonths")
		public WebElement uIAdditionalMonthsEditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_txtAdditionalDate")
		public WebElement uIAdditionalDateEditText;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_cstPhone_PhoneType_DropDown")
		public WebElement uIPhoneNoTypeDropDown;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_cstPhone_PhoneNumber")
		public WebElement uIPhoneNoEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_imgAddPhone")
		public WebElement uIPhoneNoAddButton;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_grdTelephone")
		public WebElement uIPhoneNoTable;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl0_UsrPersonnelMain1_imgAddPhone")
		public WebElement uIAddButton;
	}

	public class PersonnelEntryInventoryTab {
		public WebDriver driver;

		public PersonnelEntryInventoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddNewButton;

	}

	public class PersonnelEntryEmergencyDataTab {
		public WebDriver driver;

		public PersonnelEntryEmergencyDataTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl2_UsrPersonnelEmgData1_txtOrder")
		public WebElement uIOrderNoEdit;

	}

	public class PersonnelEntryAssignmentTab {

		public WebDriver driver;

		public PersonnelEntryAssignmentTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_dttmAssignmentDate_KPIDttmCtrl")
		public WebElement uIAssignmentDateEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddReviewdue_DropDown")
		public WebElement uINextReviewDueInComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddJobGrade")
		public WebElement uIJobGradeComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cmdAssignment")
		public WebElement uIViewAssignmentHistoryButton;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lupSupervisor_CodeValue")
		public WebElement uISupervisorCodeEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lupSupervisor_CodeDescription")
		public WebElement uISupervisorCodeDescription;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lupSupervisor_imgBtn")
		public WebElement uISupervisorLookUpIcon;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lupSupervisor_cmdIncOnAddr")
		public WebElement uISupervisorInfoButton;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lblWorkgroup")
		public WebElement uIGroupTextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddWorkgroup_DropDown")
		public WebElement uIGroupComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddSquad_DropDown")
		public WebElement uISquadComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lblSquad")
		public WebElement uISquadTextView;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_cddRank_DropDown")
		public WebElement uITitleRankComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_txtBadge")
		public WebElement uIBadgeEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabPersonnel_tmpl1_UsrPersonnelAssignment1_dttmAssignmentTime_Time']//input")
		public WebElement uIEffectiveTimeEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_lblAssignmentDate")
		public WebElement uIEffectiveDateLabel;

		@FindBy(how = How.XPATH, using = "//table[@id='tabPersonnel_tmpl1_UsrPersonnelAssignment1_dttmAssignmentTime_Time']//input[@class='igte_BlueThemeEditInContainer']")
		public WebElement uIEffectiveTime1Edit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl1_UsrPersonnelAssignment1_txtPromotionSeniority")
		public WebElement uIPromotionSeniorityEdit;
	}

	public class PersonnelEntryWorkRecordTab {
		public WebDriver driver;
		public WorkHistoryTab workHistoryTab;
		public InjuryReportTab injuryReportTab;
		public MedicalHistoryTab medicalHistoryTab;

		public PersonnelEntryWorkRecordTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.workHistoryTab == null)) {
				this.workHistoryTab = new WorkHistoryTab();
			}
			if ((this.injuryReportTab == null)) {
				this.injuryReportTab = new InjuryReportTab();
			}

			if ((this.medicalHistoryTab == null)) {
				this.medicalHistoryTab = new MedicalHistoryTab();
			}
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Work History')]")
		public WebElement uIWorkHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Injury Report')]")
		public WebElement uIInjuryReportTab;

		@FindBy(how = How.ID, using = "tabWorkRecord_tmpl2_usrPersonnelInjury1_grdInjury_eppool")
		public WebElement uIWorkRecordResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Medical History')]")
		public WebElement uIMedicalHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Performance Evaluations')]")
		public WebElement uIPerformanceEvaluationsTab;

	}

	public class WorkHistoryTab {
		public WebDriver driver;

		public WorkHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabWorkRecord_tmpl0_usrPersonnelComments1_cmdComments")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabWorkRecord_tmpl0_usrPersonnelComments1_grdPersonnelcmtSrch")
		public WebElement uIWorkHistoryTabTable;

	}

	public class InjuryReportTab {

		public WebDriver driver;

		public InjuryReportTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabWorkRecord_tmpl2_usrPersonnelInjury1_cmdComments")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabWorkRecord_tmpl2_usrPersonnelInjury1_grdInjury")
		public WebElement uIInjuryReportTable;

	}

	public class MedicalHistoryTab {
		public WebDriver driver;

		public MedicalHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabWorkRecord_tmpl3_usrPersonnelMedicalHist1_cmdComments")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabWorkRecord_tmpl3_usrPersonnelMedicalHist1_grdMedicalHist")
		public WebElement uIMedicalHistoryTabTable;
	}

	public class PersonnelEntryPreferencesTab {
		public WebDriver driver;

		public PersonnelEntryPreferencesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl12_UsrPreference1_param_10_Dyn_DropDown")
		public WebElement uILogoutAcknowledgeRequirdComBoBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl12_UsrPreference1_param_201_Dyn_DropDown")
		public WebElement uIShowPFImageComBoBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl12_UsrPreference1_param_64_Dyn_DropDown")
		public WebElement uIHomeLinkAndWhiteBoardDisplayedComBoBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl12_UsrPreference1_param_20_Dyn_DropDown")
		public WebElement uIGenerateConfirmationMessageComBoBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl12_UsrPreference1_param_62_Dyn_DropDown")
		public WebElement uIDefaultActivityModeComBoBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl12_UsrPreference1_lstJuris")
		public WebElement uIDefaultJurisDropDown;

	}

	public class PersonnelEntrySecurityTab {
		public WebDriver driver;

		public PersonnelEntrySecurityTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_txtUserName")
		public WebElement uILoginUserNameEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_txtPassword")
		public WebElement uIEnterPasswordEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_txtPassword2")
		public WebElement uIConfirmPasswordEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_chksendDtl")
		public WebElement uISaveSendEmailCheckBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_dtcExpDate_KPIDttmCtrl")
		public WebElement uIExpireDateEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_cddRoles_DropDown")
		public WebElement uIRoleAssignmentComBoBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_imgAddRole")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_imgClearRole")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl3_UsrPersonnelSecurity1_grdRoles")
		public WebElement uISecurityTabResultTable;

	}

	public class PersonnelEntryTimeTab {
		public WebDriver driver;

		public PersonnelEntryTimeTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkExpandAll")
		public WebElement uIExpandAllCheckBox;

		@FindBy(how = How.ID, using = "cddForTheYear")
		public WebElement uIForYearComBoBox;

		@FindBy(how = How.ID, using = "cmdAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdPFDetails")
		public WebElement uITimeTabResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='grdPFDetails']//div[@id = 'grdPFDetails_ctl00']//tbody[contains(@class, 'ig_HGridItem igg_HGridItem')]")
		public WebElement uITimeTabHGridResultTable;

	}

	public class PersonnelEntryTrainingTab {
		public WebDriver driver;

		public PersonnelEntryTrainingTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.certificationTab == null)) {
				this.certificationTab = new CertificationTab();
			}
			if ((this.specialSkillsTab == null)) {
				this.specialSkillsTab = new SpecialSkillsTab();
			}
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain']//span[text()='Special Skills']")
		public WebElement uISpecialSkillsTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain']//span[text()='Certification']")
		public WebElement uICertificationTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain']//span[text()='Training']")
		public WebElement uITrainingTab;

		public CertificationTab certificationTab;
		public SpecialSkillsTab specialSkillsTab;

	}

	public class CertificationTab {

	}

	public class SpecialSkillsTab {
		public WebDriver driver;

		public SpecialSkillsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_cddSkills_DropDown")
		public WebElement uISkillsComboBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_dtEffective_KPIDttmCtrl")
		public WebElement uIEffectiveFromDateEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_grdSkills")
		public WebElement uISkillsTabTable;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_chkExpired")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_txtInActiveDttm")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.ID, using = "tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_cmdClear")
		public WebElement uIClearButton;
	}

	public class PersonnelEntryAllowanceTab {
		public WebDriver driver;

		public PersonnelEntryAllowanceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cddAllowCode_DropDown")
		public WebElement uIAllowanceComboBox;

		@FindBy(how = How.ID, using = "DDYear")
		public WebElement uIYearComboBox;

		@FindBy(how = How.ID, using = "dtAllowDttm_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "lstAllowType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "lstAllowItem_DropDown")
		public WebElement uIItemComboBox;

		@FindBy(how = How.ID, using = "lupAllowMake_CodeValue")
		public WebElement uIMakeCodeEdit;

		@FindBy(how = How.ID, using = "lupAllowMake_imgBtn")
		public WebElement uIMakeLookupButton;

		@FindBy(how = How.ID, using = "lupVendor_CodeValue")
		public WebElement uIVendorCodeEdit;

		@FindBy(how = How.ID, using = "lupVendor_imgBtn")
		public WebElement uIVendorLookupButton;

		@FindBy(how = How.ID, using = "txtInvoiceNbr")
		public WebElement uIInvoiceNoEdit;

		@FindBy(how = How.ID, using = "txtAmount")
		public WebElement uIAmountEdit;

		@FindBy(how = How.ID, using = "txtComment")
		public WebElement uICommentEdit;

		@FindBy(how = How.ID, using = "imgAddAllowance")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearAllowance")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdAllowance")
		public WebElement uIAllowanceTabTable;

	}

	public class WorkHistoryEntry {
		public WebDriver driver;
		public WorkHistoryEntryDispositionTab workHistoryEntryDispositionTab;

		public WorkHistoryEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.workHistoryEntryDispositionTab == null)) {
				this.workHistoryEntryDispositionTab = new WorkHistoryEntryDispositionTab();
			}
		}

		@FindBy(how = How.ID, using = "lupForPF_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "dttmForPeriodFrom_Date_KPIDttmCtrl")
		public WebElement uIForPeriodFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmForPeriodFrom_Time']//input")
		public WebElement uIForPeriodFromTimeEdit;

		@FindBy(how = How.ID, using = "dttmTo_Date_KPIDttmCtrl")
		public WebElement uIForPeriodToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmTo_Time']//input")
		public WebElement uIForPeriodToTimeEdit;

		@FindBy(how = How.ID, using = "lupEnteredBy_CodeValue")
		public WebElement uISelectPFCodeEdit;

		@FindBy(how = How.ID, using = "dttmEnteredDate_Date_KPIDttmCtrl")
		public WebElement uIEnteredDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmEnteredDate_Time']//input")
		public WebElement uIEnteredTimeEdit;

		@FindBy(how = How.ID, using = "cddCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "cddSubCategory")
		public WebElement uISubCategoryComboBox;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Disposition')]")
		public WebElement uIDispositionTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIApprovalStatusTextView;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

	}

	public class WorkHistoryEntryDispositionTab {
		public WebDriver driver;

		public WorkHistoryEntryDispositionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabComments_tmpl2_UsrDisposition1_lupSupervisor_CodeValue")
		public WebElement uISupervisorPFCodeEdit;

		@FindBy(how = How.ID, using = "tabComments_tmpl2_UsrDisposition1_cddDisposition_DropDown")
		public WebElement uIDispositionComboBox;

		@FindBy(how = How.ID, using = "tabComments_tmpl2_UsrDisposition1_dttmDispositionDate_Date_KPIDttmCtrl")
		public WebElement uIDispositionDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabComments_tmpl2_UsrDisposition1_dttmDispositionDate_Time']//input")
		public WebElement uIForPeriodFromTimeEdit;

		@FindBy(how = How.ID, using = "tabComments_tmpl2_UsrDisposition1_txtRemarks")
		public WebElement uIRemarksEdit;

	}

	public class AssignmentHistoryScreen {
		public WebDriver driver;

		public AssignmentHistoryScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "grdAssignmentHst")
		public WebElement uIAssignmentHistoryTable;
	}

	public class PerformanceReview {

		public WebDriver driver;

		public PerformanceReview() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeDescription")
		public WebElement uIPFDesEdit;

		@FindBy(how = How.ID, using = "lupPF_imgBtn")
		public WebElement uIPFSearchImageButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdPerformanceReviewSrch")
		public WebElement uIPerformanceReviewTable;

		@FindBy(how = How.ID, using = "grdPerformanceReviewSrch_ctl00_lnkbtnNext")
		public WebElement uINextIcon;

		@FindBy(how = How.ID, using = "grdPerformanceReviewSrch_ctl00_lnkbtnPrev")
		public WebElement uIPrevIcon;

		@FindBy(how = How.ID, using = "lblWorkgroup")
		public WebElement uIGroupTextView;

		@FindBy(how = How.ID, using = "cddWorkgroup_DropDown")
		public WebElement uIGroupComboBox;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "imgDivision")
		public WebElement uITreeIcon;
	}

	public class PerformanceReviewEntry {

		public WebDriver driver;
		public SupervisorReportTab supervisorReportTab;
		public ApprovalTab approvalTab;

		public PerformanceReviewEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.supervisorReportTab == null)) {
				supervisorReportTab = new SupervisorReportTab();
			}

			if ((this.approvalTab == null)) {
				approvalTab = new ApprovalTab();
			}
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Supervisor Report')]")
		public WebElement uISupervisorReportTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approval')]")
		public WebElement uIApprovalTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_dttmNextReviewDueIn_Date_KPIDttmCtrl")
		public WebElement uINextReviewDueInDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "lupForPF_CodeValue")
		public WebElement uIForPFEdit;

		@FindBy(how = How.ID, using = "dtcEvaluationFrom_Date_KPIDttmCtrl")
		public WebElement uIEvaluationFromDateEdit;

		@FindBy(how = How.XPATH, using = "(//table[@id = 'dtcEvaluationFrom_Time'] //input[@class='textboxdatetime igte_BlueThemeEditInContainer'])")
		public WebElement uIEvaluationFromTimeEdit;

		@FindBy(how = How.ID, using = "dtcTo_Date_KPIDttmCtrl")
		public WebElement uIEvaluationToDateEdit;

		@FindBy(how = How.XPATH, using = "(//table[@id = 'dtcTo_Time'] //input[@class='textboxdatetime igte_BlueThemeEditInContainer'])")
		public WebElement uIEvaluationToTimeEdit;

		@FindBy(how = How.ID, using = "txtPurpose")
		public WebElement uIPurposeEdit;

	}

	public class SupervisorReportTab {
		public WebDriver driver;

		public SupervisorReportTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uITextEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSave;
	}

	public class ApprovalTab {
		public WebDriver driver;

		public ApprovalTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_lupRaterPF_imgBtn")
		public WebElement uIRaterPFLookUPButton;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_lupAssignPF_imgBtn")
		public WebElement uIReviewAssignedPFLookUPButton;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_dttRaterDttm_Date_KPIDttmCtrl")
		public WebElement uIRaterDateEdit;

		@FindBy(how = How.XPATH, using = "(//table[@id = 'tabReview_tmpl2_usrApproval_dttRaterDttm_Time'] //input[@class='textboxdatetime igte_BlueThemeEditInContainer'])")
		public WebElement uIRaterTimeEdit;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_cddSquad_DropDown")
		public WebElement uISquadCombobox;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_lupReviewerPF_imgBtn")
		public WebElement uIReviewerPFLookUPButton;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_dttmNextReviewDueIn_Date_KPIDttmCtrl")
		public WebElement uINextReviewDueInDateEdit;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_imgReviewer_chkIsEnableSign")
		public WebElement uIEnableSignCheckBox;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_imgRaterSign_chkIsEnableSign")
		public WebElement uIRaterSignCheckBox;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_dttmReviewerDate_Date_KPIDttmCtrl")
		public WebElement uIRevierDateEdit;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_chkSign")
		public WebElement uIDeclareCheckBox;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_imgAgree_chkIsEnableSign")
		public WebElement uIAgreeSignCheckBox;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_dttmEmployeeRatedDate_Date_KPIDttmCtrl")
		public WebElement uIEmployeeDateEdit;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_imgDivision")
		public WebElement uITreeSymbolEdit;

		@FindBy(how = How.ID, using = "tabReview_tmpl2_usrApproval_lupAssignPF_CodeValue")
		public WebElement uIReviewAssignedPFCodeEdit;
	}

	public class PersonnelLockDetailsScreen {
		public WebDriver driver;

		public PersonnelLockDetailsScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdLockDetails")
		public WebElement uILockDetailsResultTable;
	}

	public class PersonnelBatchUpdate {
		public WebDriver driver;

		public PersonnelBatchUpdate() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeDescription")
		public WebElement uIPFDesEdit;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "txtLoginUserName")
		public WebElement uILoginUserNameEdit;

		@FindBy(how = How.ID, using = "grdPersonnel")
		public WebElement uIBatchUpdateResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Proceed')]")
		public WebElement uIProceedButton;

		@FindBy(how = How.ID, using = "lblWorkgroup")
		public WebElement uIGroupTextView;

		@FindBy(how = How.ID, using = "cddWorkgroup_DropDown")
		public WebElement uIGroupComboBox;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

	}

	public class BatchUpdateEntry {
		public WebDriver driver;

		public BatchUpdateEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "dttmAssignmentDate_KPIDttmCtrl")
		public WebElement uIAssignmentDateEdit;

		@FindBy(how = How.ID, using = "cddReviewdue_DropDown")
		public WebElement uINextReviewDueInComboBox;

		@FindBy(how = How.ID, using = "dttmReviewdue_KPIDttmCtrl")
		public WebElement uINextReviewDueInDateEdit;

		@FindBy(how = How.ID, using = "cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "cddWorkgroup_DropDown")
		public WebElement uIWorkGroupComboBox;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmAssignmentTime_Time']//input")
		public WebElement uIEffectiveTimeEdit;

		@FindBy(how = How.ID, using = "lblAssignmentDate")
		public WebElement uIEffectiveDateLabel;

		@FindBy(how = How.ID, using = "txtPromotionSeniority")
		public WebElement uIPromotionSeniorityEdit;

	}

	public class InjuryRptSearch {
		public WebDriver driver;

		public InjuryRptSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdInjury_ctl00_lnkbtnNext")
		public WebElement uINextIcon;

		@FindBy(how = How.ID, using = "grdInjury")
		public WebElement uIInjuryRptSearchResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdInjury_ctl00_lnkbtnPrev")
		public WebElement uIPrevIcon;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;
	}

	public class MedHistorySearch {
		public WebDriver driver;

		public MedHistorySearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdMedicalHist_ctl00_lnkbtnNext")
		public WebElement uINextIcon;

		@FindBy(how = How.ID, using = "grdMedicalHist")
		public WebElement uIMedHistorySearchResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdMedicalHist_ctl00_lnkbtnPrev")
		public WebElement uIPrevIcon;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

	}

	public class WorkHistorySearch {
		public WebDriver driver;

		public WorkHistorySearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdPersonnelcmtSrch_ctl00_lnkbtnNext")
		public WebElement uINextIcon;

		@FindBy(how = How.ID, using = "grdPersonnelcmtSrch")
		public WebElement uIWorkHistorySearchResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdPersonnelcmtSrch_ctl00_lnkbtnPrev")
		public WebElement uIPrevIcon;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

	}

	public class SupervisorSearch {
		public WebDriver driver;

		public SupervisorSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeDescription")
		public WebElement uIPFDesEdit;

		@FindBy(how = How.ID, using = "lupSupervisor_CodeValue")
		public WebElement uISupervisorCodeEdit;

		@FindBy(how = How.ID, using = "lupSupervisor_cmdIncOnAddr")
		public WebElement uISupervisorInfoButton;

		@FindBy(how = How.ID, using = "txtLoginUserName")
		public WebElement uILoginUserNameEdit;

		@FindBy(how = How.ID, using = "grdPersonnel")
		public WebElement uISupervisorResultTable;

		@FindBy(how = How.ID, using = "lblWorkgroup")
		public WebElement uIGroupTextView;

		@FindBy(how = How.ID, using = "cddWorkgroup_DropDown")
		public WebElement uIGroupComboBox;

		@FindBy(how = How.ID, using = "lblDivision")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "lblTeam")
		public WebElement uITeamTextView;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement uITeamComboBox;

		@FindBy(how = How.ID, using = "lblSection")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionComboBox;

	}

	public class InjuryReportEntry {

		public WebDriver driver;

		public InjuryReportEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIDateOfInjuryEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uITypeOfInjuryComboBox;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIStatusLabel;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

	}

	public class MedicalHistoryEntry {
		public WebDriver driver;

		public MedicalHistoryEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;
	}

}
