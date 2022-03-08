package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapTraining {

	public FacilityCode facilityCode;
	public GuestSearch guestSearch;
	public InstructorSearch instructorSearch;
	public CourseSearch courseSearch;
	public CertificationSearch certificationSearch;
	public ClassSearch classSearch;
	public TrainingSearch trainingSearch;
	public TrainingEntry trainingEntry;
	public TrainingClassEntry trainingClassEntry;
	public FacilityEntry facilityEntry;
	public GuestEntry guestEntry;
	public InstructorEntry instructorEntry;
	public CourseEntry courseEntry;
	public CertificationEntry certificationEntry;
	public CertificationManualEntry certificationManualEntry;
	public TrainingScheduleEntry trainingScheduleEntry;
	public MultiPFWindow multiPFWindow;

	public UIMapTraining() {

		if (this.facilityCode == null)
			this.facilityCode = new FacilityCode();

		if (this.guestSearch == null)
			this.guestSearch = new GuestSearch();

		if (this.instructorSearch == null)
			this.instructorSearch = new InstructorSearch();

		if (this.courseSearch == null)
			this.courseSearch = new CourseSearch();

		if (this.certificationSearch == null)
			this.certificationSearch = new CertificationSearch();

		if (this.classSearch == null)
			this.classSearch = new ClassSearch();

		if (this.trainingSearch == null)
			this.trainingSearch = new TrainingSearch();

		if (this.trainingEntry == null)
			this.trainingEntry = new TrainingEntry();

		if (this.trainingClassEntry == null)
			this.trainingClassEntry = new TrainingClassEntry();

		if (this.facilityEntry == null)
			this.facilityEntry = new FacilityEntry();

		if (this.guestEntry == null)
			this.guestEntry = new GuestEntry();

		if (this.instructorEntry == null)
			this.instructorEntry = new InstructorEntry();

		if (this.courseEntry == null)
			this.courseEntry = new CourseEntry();

		if (this.certificationEntry == null)
			this.certificationEntry = new CertificationEntry();

		if (this.certificationManualEntry == null)
			this.certificationManualEntry = new CertificationManualEntry();

		if (this.trainingScheduleEntry == null)
			this.trainingScheduleEntry = new TrainingScheduleEntry();

		if (this.multiPFWindow == null)
			this.multiPFWindow = new MultiPFWindow();

	}

	public class FacilityCode {
		public WebDriver driver;

		public FacilityCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtFacilityCode")
		public WebElement UICodeNoTxtbox;

		@FindBy(how = How.ID, using = "cstCSZ_City")
		public WebElement UICSZCityTxtbox;

		@FindBy(how = How.ID, using = "cstCSZ_State_DropDown")
		public WebElement UICSZStateDropdown;

		@FindBy(how = How.ID, using = "cstCSZ_Zip")
		public WebElement UICSZZipLookUp;

		@FindBy(how = How.XPATH, using = "txtFacilityName")
		public WebElement UINametxtbox;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement UIIncludeInactiveCheckBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement UIAddNewLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')")
		public WebElement UIResetLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement UISearchLink;

		@FindBy(how = How.ID, using = "grdFacility")
		public WebElement UIResultTable;

	}

	public class GuestSearch {
		public WebDriver driver;

		public GuestSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "mskSSNo")
		public WebElement UISSNoTxtbox;

		@FindBy(how = How.ID, using = "lupORINbr_CodeValue")
		public WebElement UIAgencyTxtbox;

		@FindBy(how = How.ID, using = "txtLastName")
		public WebElement UILastNameTxtbox;

		@FindBy(how = How.ID, using = "txtFirstName")
		public WebElement UIFirstNameTxtbox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement UIAddNewLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')")
		public WebElement UIResetLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement UISearchLink;

		@FindBy(how = How.ID, using = "grdGuest")
		public WebElement UIResultTable;

	}

	public class InstructorSearch {
		public WebDriver driver;

		public InstructorSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "txtInstructorNo")
		public WebElement UIInstructorIDNoTxtbox;

		@FindBy(how = How.ID, using = "txtLastName")
		public WebElement UILastNameTxtbox;

		@FindBy(how = How.ID, using = "txtFirstName")
		public WebElement UIFirstNameTxtbox;

		@FindBy(how = How.ID, using = "lupORINbr_CodeValue")
		public WebElement UIAgencyORITxtbox;

		@FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
		public WebElement UITrainingCategoryDropdown;

		@FindBy(how = How.ID, using = "cddTrainingType_DropDown")
		public WebElement UITrainingTypeDropdown;

		@FindBy(how = How.ID, using = "dtcPeriodFromDttm_KPIDttmCtrl")
		public WebElement UIPeriodFromDateTxtbox;

		@FindBy(how = How.ID, using = "dtcToDttm_KPIDttmCtrl")
		public WebElement UIPeriodToDateTxtbox;

		@FindBy(how = How.ID, using = "cddCertification_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "RecertificatedByDttm_KPIDttmCtrl")
		public WebElement UIRecertifyDateTxtbox;

		@FindBy(how = How.ID, using = "ChkToday")
		public WebElement UIRecertifyTodayCheckbox;

		@FindBy(how = How.ID, using = "ChkIsActive")
		public WebElement UIIncludeInactiveCheckbox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement UIAddNewLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')")
		public WebElement UIResetLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement UISearchLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')")
		public WebElement UIBackLink;

		@FindBy(how = How.ID, using = "grdInstructor")
		public WebElement UIResultTable;

	}

	public class CourseSearch {
		public WebDriver driver;

		public CourseSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCourseNo")
		public WebElement UICourseSystemIDTxtbox;

		@FindBy(how = How.ID, using = "cddTrainCategory_DropDown")
		public WebElement UITrainingCategoryDropdown;

		@FindBy(how = How.ID, using = "cddTrainType_DropDown")
		public WebElement UITrainingTypeDropdown;

		@FindBy(how = How.ID, using = "lupCourseNbr_CodeValue")
		public WebElement UICourseNoTxtbox;

		@FindBy(how = How.ID, using = "txtCourseName")
		public WebElement UICourseTitleTxtbox;

		@FindBy(how = How.ID, using = "CddQualificationperiod_DropDown")
		public WebElement UIQualificationPeriodDropdown;

		@FindBy(how = How.ID, using = "ChkIsActive")
		public WebElement UIIncludeInactiveCheckbox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement UIAddNewLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')")
		public WebElement UIResetLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement UISearchLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')")
		public WebElement UIBackLink;

		@FindBy(how = How.ID, using = "grdCourse")
		public WebElement UIResultTable;

	}

	public class CertificationSearch {
		public WebDriver driver;

		public CertificationSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupEmployeePF_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "cddCertification_Input")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "chkPFWOCert")
		public WebElement UIShowOnlyPFNoWithoutCertifcationCheckBox;

		@FindBy(how = How.ID, using = "dtReCertify_KPIDttmCtrl")
		public WebElement UIRecertificationByDateTxtbox;

		@FindBy(how = How.ID, using = "chkToday")
		public WebElement UIRecertificationByTodayCheckbox;

		@FindBy(how = How.ID, using = "dtEffectiveFrom_KPIDttmCtrl")
		public WebElement UIEffectiveFromDateTxtbox;

		@FindBy(how = How.ID, using = "ChkGroupByList_0")
		public WebElement UIGroupByNoneRadioButton;

		@FindBy(how = How.ID, using = "ChkGroupByList_1")
		public WebElement UIGroupByPFNoRadioButton;

		@FindBy(how = How.ID, using = "ChkGroupByList_2")
		public WebElement UIGroupByCertificationRadioButton;

		@FindBy(how = How.ID, using = "chkActive")
		public WebElement UIShowOnlyActiveCheckbox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement UISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement UIAddNewLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')")
		public WebElement UIResetLink;

		@FindBy(how = How.ID, using = "grdCertifications1")
		public WebElement UIResultTable;

	}

	public class ClassSearch {
		public WebDriver driver;

		public ClassSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtStartDttm_KPIDttmCtrl")
		public WebElement UITrainingFromDateTxtbox;

		@FindBy(how = How.ID, using = "dtEndDttm_KPIDttmCtrl")
		public WebElement UITrainingToDateTxtbox;

		@FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
		public WebElement UITrainingCategoryDropdown;

		@FindBy(how = How.ID, using = "cddTrainingType_DropDown")
		public WebElement UITrainingTypeDropdown;

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UICourseNoTxtbox;

		@FindBy(how = How.ID, using = "txtCourseTitle")
		public WebElement UICourseTitleTxtbox;

		@FindBy(how = How.ID, using = "lupEmployee_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "lupAgency_CodeValue")
		public WebElement UIAgencyTxtbox;

		@FindBy(how = How.ID, using = "cddSelectName_Input")
		public WebElement UINameDropdown;

		@FindBy(how = How.ID, using = "cddMethodInstruction_DropDown")
		public WebElement UIMethodOfInstructionDropdown;

		@FindBy(how = How.ID, using = "lupFacility_CodeValue")
		public WebElement UIFacilityCodeTxtbox;

		@FindBy(how = How.ID, using = "lupInstructor_CodeValue")
		public WebElement UIInstructorTxtbox;

		@FindBy(how = How.ID, using = "ChkShowCancelledClasses")
		public WebElement UIShowCancelledClassesCheckbox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement UIAddNewLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')")
		public WebElement UIResetLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement UISearchLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')")
		public WebElement UIBackLink;

		@FindBy(how = How.ID, using = "grdClassSrch")
		public WebElement UIResultTable;

	}

	public class TrainingSearch {
		public WebDriver driver;

		public TrainingSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupInstructor_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "lupAgency_CodeValue")
		public WebElement UIAgencyTxtbox;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIStatusDropdown;

		@FindBy(how = How.ID, using = "chkPFOnly")
		public WebElement UIShowOnlyPFsWithOutTrainingCheckbox;

		@FindBy(how = How.ID, using = "cddSelectName_Input")
		public WebElement UINameDropdown;

		@FindBy(how = How.ID, using = "cddDivision_DropDown")
		public WebElement UIDivisionDropdown;

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement UISectionDropdown;

		@FindBy(how = How.ID, using = "cddStation_DropDown")
		public WebElement UIStationDropdown;

		@FindBy(how = How.ID, using = "lupUnit_CodeValue")
		public WebElement UIUnitTxtbox;

		@FindBy(how = How.ID, using = "cddShift_DropDown")
		public WebElement UIShiftDropdown;

		@FindBy(how = How.ID, using = "cddTeam_DropDown")
		public WebElement UITeamDropdown;

		@FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
		public WebElement UITrainingCategoryDropdown;

		@FindBy(how = How.ID, using = "cddTrainingType_DropDown")
		public WebElement UITrainingTypeDropdown;

		@FindBy(how = How.ID, using = "lupCourseID_CodeValue")
		public WebElement UICourseNoTxtbox;

		@FindBy(how = How.ID, using = "txtCourseTitle")
		public WebElement UICourseTitleTxtbox;

		@FindBy(how = How.ID, using = "dtFrom_KPIDttmCtrl")
		public WebElement UITrainingFromDateTxtbox;

		@FindBy(how = How.ID, using = "dtTo_KPIDttmCtrl")
		public WebElement UITrainingToDateTxtbox;

		@FindBy(how = How.ID, using = "dtRecertification_KPIDttmCtrl")
		public WebElement UIRequalifyByDateTxtbox;

		@FindBy(how = How.ID, using = "chkToday")
		public WebElement UIRequalifyByTodayCheckbox;

		@FindBy(how = How.ID, using = "rbOnDuty")
		public WebElement UITrainingWhileOnDutyRadiobox;

		@FindBy(how = How.ID, using = "rbOffDuty")
		public WebElement UITrainingWhileOffDutyRadiobox;

		@FindBy(how = How.ID, using = "rbAll")
		public WebElement UITrainingWhileAllRadiobox;

		@FindBy(how = How.ID, using = "cddResult_DropDown")
		public WebElement UIResultDropdown;

		@FindBy(how = How.ID, using = "cddCertification_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "cddMethodofInstruction_DropDown")
		public WebElement UIMethodOfInstructionDropdown;

		@FindBy(how = How.ID, using = "lupTrainingFacility_CodeValue")
		public WebElement UIFacilityCodeTxtbox;

		@FindBy(how = How.ID, using = "lupInstructorInTab_CodeValue")
		public WebElement UIInstructorTxtbox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')")
		public WebElement UIAddNewLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')")
		public WebElement UIResetLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')")
		public WebElement UISearchLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')")
		public WebElement UIBackLink;

		@FindBy(how = How.ID, using = "grdTrainingSrch")
		public WebElement UIResultTable;
	}

	public class TrainingEntry {
		public WebDriver driver;

		public TrainingDetailTab trainingDetailTab;
		public AdditionalPFTab additionalPFTab;
		public InstructorsTab instructorsTab;
		public CEUsTab cEUsTab;
		
		public TrainingEntry() {

			if (this.trainingDetailTab == null)
				this.trainingDetailTab = new TrainingDetailTab();

			if (this.additionalPFTab == null)
				this.additionalPFTab = new AdditionalPFTab();

			if (this.instructorsTab == null)
				this.instructorsTab = new InstructorsTab();

			if (this.cEUsTab == null)
				this.cEUsTab = new CEUsTab();
			
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "lupORINbr_CodeValue")
		public WebElement UIAgencyTxtbox;

		@FindBy(how = How.ID, using = "ddlNameList")
		public WebElement UINameDropdown;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIStatusDropdown;

		@FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
		public WebElement UITrainingCategoryDropdown;

		@FindBy(how = How.ID, using = "cddTrainingType_DropDown")
		public WebElement UITrainingTypeDropdown;

		@FindBy(how = How.ID, using = "lupCourseID_CodeValue")
		public WebElement UICourseNoTxtbox;

		@FindBy(how = How.ID, using = "txtTitle")
		public WebElement UICourseTitleTxtbox;

		@FindBy(how = How.ID, using = "dtFrom_Date_KPIDttmCtrl")
		public WebElement UITrainingFromDateTxtbox;

		@FindBy(how = How.XPATH, using = "//table[@id='dtFrom_Time'//input")
		public WebElement UITrainingFromTimeTxtbox;

		@FindBy(how = How.ID, using = "dtTo_Date_KPIDttmCtrl")
		public WebElement UITrainingToDateTxtbox;

		@FindBy(how = How.ID, using = "//table[@id='dtTo_Time'//input")
		public WebElement UITrainingToTimeTxtbox;

		@FindBy(how = How.ID, using = "txtCourseHours")
		public WebElement UICourseHoursTxtbox;

		@FindBy(how = How.ID, using = "cmdTrainingSchedule")
		public WebElement UIMultidayScheduleButton;

		@FindBy(how = How.ID, using = "cmdTest")
		public WebElement UITakeTheTestByButton;

		@FindBy(how = How.ID, using = "cmdEvaluation")
		public WebElement UICompleteEvaluationButton;

		@FindBy(how = How.ID, using = "imgFrontView")
		public WebElement UICertificationImageIcon;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement UISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement UISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement UISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement UIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement UIRefreshButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement UIDeleteIcon;

		@FindBy(how = How.ID, using = "cmdActivity")
		public WebElement UIActivityLogButton;

	}

	public class TrainingDetailTab {
		public WebDriver driver;

		public TrainingDetailTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabTrainEntry'//span[contains(text(),'Training Detail')")
		public WebElement UINavigatetoTrainingDetailTab;

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UIOtherSchoolNoTxtbox;

		@FindBy(how = How.ID, using = "lupORINbr_CodeValue")
		public WebElement UIMethodOfInstructionDropdown;

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UIFacilityCodeTxtbox;

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UILocationTxtbox;

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UICostTxtbox;

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UIMealsAndOtherCostsTxtbox;

		@FindBy(how = How.ID, using = "ddlNameList")
		public WebElement UIMethodOfPaymentDropdown;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UICostCenterDropdown;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIEnableOnlineTestCheckbox;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIEvaluationMandatoryRadioButton;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIEvaluationOptionalRadioButton;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIEvaluationNARadioButton;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIResultDropdown;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIScoreTxtbox;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIUpdateAllPFRecordsCheckbox;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UITrainingWhileOnDutyRadioButton;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UITrainingWhileOffDutyRadioButton;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UINotesTxtbox;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIQualificationPeriodDropdown;

		@FindBy(how = How.ID, using = "cddStatus_DropDown")
		public WebElement UIRequalifyByDateTxtbox;

	}

	public class AdditionalPFTab {
		public WebDriver driver;

		public AdditionalPFTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabTrainEntry'//span[contains(text(),'Additional PF')")
		public WebElement UINavigatetoAdditionalPFTab;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_lupInstructor_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_lupORINbr_CodeValue")
		public WebElement UIAgencytxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_cddSelectName_Input")
		public WebElement UINameDropdown;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_cmdAddNew")
		public WebElement UIAddNewButton;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_cmdAdd")
		public WebElement UIAddMultipleEmployeesButton;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_cmdPrintCertificate")
		public WebElement UIPrintTrainingCertificateButton;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_imgAdd")
		public WebElement UIAddButton;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl1_AdditionalPF_imgClear")
		public WebElement UIClearButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tabTrainEntry_tmpl1_AdditionalPF_grdAdditionalPF'//td[@class='Delete_Icon_Style'")
		public WebElement UIDeleteIcon;
	}

	public class InstructorsTab {
		public WebDriver driver;

		public InstructorsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabTrainEntry'//span[contains(text(),'Instructors')")
		public WebElement UINavigatetoInstructorsTab;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_dtFromDate_KPIDttmCtrl")
		public WebElement UITrainingFromDateTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_dtToDate_KPIDttmCtrl")
		public WebElement UITrainingToDateTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_lupInstructor_CodeValue")
		public WebElement UIInstrcutorTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_cddSubject_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_cddPosition_DropDown")
		public WebElement UIPositionDropdown;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_dtExpiryDttm_KPIDttmCtrl")
		public WebElement UICertificationExpiresDateTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_txtTrainHours")
		public WebElement UITrainingHoursTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_txtComments")
		public WebElement UICommentsTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_imgAdd")
		public WebElement UIAddButton;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl2_usrInstructor_imgClear")
		public WebElement UIClearButton;
	}

	public class CEUsTab {
		public WebDriver driver;

		public CEUsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabTrainEntry'//span[contains(text(),'CEUs')")
		public WebElement UINavigatetoCEUsTab;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl4_usrTrainingCEU_cddCertification_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl4_usrTrainingCEU_chkApplyToAllStudents")
		public WebElement UIApplyCredittoallCheckbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl4_usrTrainingCEU_txtCEUEarn")
		public WebElement UIEarnedCEUsTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl4_usrTrainingCEU_txtHrsCredit")
		public WebElement UICreditedHoursTxtbox;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl4_usrTrainingCEU_imgAdd")
		public WebElement UIAddButton;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl4_usrTrainingCEU_imgClear")
		public WebElement UIClearButton;

		@FindBy(how = How.ID, using = "tabTrainEntry_tmpl4_usrTrainingCEU_grdCEUs")
		public WebElement UICEUsgridTable;

	}

	public class ClassEntry {

		public WebDriver driver;

		public ClassEntryStudentsTab classEntryStudentsTab;
		public ClassEntryTrainingDetailTab classEntryTrainingDetailTab;
		public ClassEntryInstructorsTab classEntryInstructorsTab;
		public ClassEntryCourseDescriptionTab classEntryCourseDescriptionTab;
		public ClassEntryNotesForStudentsTab classEntryNotesForStudentsTab;
		public ClassEntryInstructorNotesTab classEntryInstructorNotesTab;
		public ClassEntryEvaluationsTab classEntryEvaluationsTab;
		public ClassEntryCEUsTab classEntryCEUsTab;

		public ClassEntry() {
			if (this.classEntryStudentsTab == null)
				this.classEntryStudentsTab = new ClassEntryStudentsTab();

			if (this.classEntryTrainingDetailTab == null)
				this.classEntryTrainingDetailTab = new ClassEntryTrainingDetailTab();

			if (this.classEntryInstructorsTab == null)
				this.classEntryInstructorsTab = new ClassEntryInstructorsTab();

			if (this.classEntryCourseDescriptionTab == null)
				this.classEntryCourseDescriptionTab = new ClassEntryCourseDescriptionTab();

			if (this.classEntryNotesForStudentsTab == null)
				this.classEntryNotesForStudentsTab = new ClassEntryNotesForStudentsTab();

			if (this.classEntryEvaluationsTab == null)
				this.classEntryEvaluationsTab = new ClassEntryEvaluationsTab();

			if (this.classEntryCEUsTab == null)
				this.classEntryCEUsTab = new ClassEntryCEUsTab();

			if (this.classEntryInstructorNotesTab == null)
				this.classEntryInstructorNotesTab = new ClassEntryInstructorNotesTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement UISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement UISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement UISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement UIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement UIRefreshButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement UIDeleteIcon;

		@FindBy(how = How.ID, using = "cmdActivity")
		public WebElement UIActivityLogButton;

		@FindBy(how = How.ID, using = "dtEntryDate_KPIDttmCtrl")
		public WebElement UIEntryDateTxtbox;

		@FindBy(how = How.ID, using = "txtNoStudents")
		public WebElement UINoOfSutendtsTxtbox;

		@FindBy(how = How.ID, using = "txtRemaining")
		public WebElement UINoOfSlotsRemainingTxtbox;

		@FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
		public WebElement UITrainingCategoryDropdown;

		@FindBy(how = How.ID, using = "cddTrainingType_DropDown")
		public WebElement UITrainingTypeDropdown;

		@FindBy(how = How.ID, using = "lupCourseID_CodeValue")
		public WebElement UICourseNoTxtbox;

		@FindBy(how = How.ID, using = "txtTitle")
		public WebElement UICourseTitleTxtbox;

		@FindBy(how = How.ID, using = "dttmTrainingSchedule_Date_KPIDttmCtrl")
		public WebElement UITrainingFromDateTxtbox;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmTrainingSchedule_Time'//input")
		public WebElement UITrainingFromTimeTxtbox;

		@FindBy(how = How.ID, using = "dttmTo_Date_KPIDttmCtrl")
		public WebElement UITrainingToDateTxtbox;

		@FindBy(how = How.ID, using = "//table[@id='dttmTo_Time'//input")
		public WebElement UITrainingToTimeTxtbox;

		@FindBy(how = How.ID, using = "txtCourseHours")
		public WebElement UICourseHoursTxtbox;

		@FindBy(how = How.ID, using = "cmdTrainingSchedule")
		public WebElement UIMultidayScheduleButton;

		@FindBy(how = How.ID, using = "cmdDuplicate")
		public WebElement UIDuplicatedButton;

		@FindBy(how = How.ID, using = "BtnSignUp")
		public WebElement UISignUpButton;

		@FindBy(how = How.ID, using = "cmdPublishTo")
		public WebElement UIPublishToButton;

		@FindBy(how = How.ID, using = "cmdCancelClass")
		public WebElement UICancelTheClassButton;

		@FindBy(how = How.ID, using = "ChkShwSchCal")
		public WebElement UIShowInCalendarCheckbox;

		@FindBy(how = How.ID, using = "chkPublish")
		public WebElement UIDoNotPublishCheckbox;

		@FindBy(how = How.ID, using = "chkEmployees")
		public WebElement UIEmployeesOnlyCheckbox;

	}

	public class ClassEntryStudentsTab {
		public WebDriver driver;

		public ClassEntryStudentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Students')")
		public WebElement UINavigatetoStudentsTab;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_lupPF_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_lupORINbr_CodeValue")
		public WebElement UIAgencytxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cddSelectName_Input")
		public WebElement UINameDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdAddNew")
		public WebElement UIAddNewButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdAddEmployee")
		public WebElement UIAddMultipleEmployeesButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdPrintCertificate")
		public WebElement UIPrintTrainingCertificateButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_imgAdd")
		public WebElement UIAddButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_imgClear")
		public WebElement UIClearButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_lblOnlineTest")
		public WebElement UIEnableOnlineTestCheckbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_chkSelectAll")
		public WebElement UISelectAllCheckbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cddResult_DropDown")
		public WebElement UIResultDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_txtScore")
		public WebElement UIScoreTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_txtNotes")
		public WebElement UINotesTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdApply")
		public WebElement UIApplyButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdEmail")
		public WebElement UINotificationIcon;

		@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_grdStudentEnrolled")
		public WebElement UIGridTable;

	}

	public class ClassEntryTrainingDetailTab {
		public WebDriver driver;

		public ClassEntryTrainingDetailTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Training Detail')")
		public WebElement UINavigatetoTrainingDetailTab;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddMethodofInstruction_DropDown")
		public WebElement UIMethodOfInstructionDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_lupTrainingFacility_CodeValue")
		public WebElement UIFacilityCodeTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostEmployee")
		public WebElement UICostPerEmployeeTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostGuest")
		public WebElement UICostPerGuestTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curClassCost")
		public WebElement UIClassCostTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtNotes")
		public WebElement UINotesTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddQualificationPeriod_DropDown")
		public WebElement UIQualificationPeriodDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtReQualifyBy_KPIDttmCtrl")
		public WebElement UIRequalifyByDateTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_chkEnrollment")
		public WebElement UIEnrollmentCheckbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_chkCompletion")
		public WebElement UICompletionCheckbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse1_DropDown")
		public WebElement UICourse1Dropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse2_DropDown")
		public WebElement UICourse2Dropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse3_DropDown")
		public WebElement UICourse3Dropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse4_DropDown")
		public WebElement UICourse4Dropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_lupTrainingFacility_CodeValue")
		public WebElement uITrainingFacilityEdit;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_lupTrainingFacility_imgBtn")
		public WebElement uITrainingFacilityLookupButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddMethodofInstruction_DropDown")
		public WebElement uIMethodofInstructionComboBox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostEmployee")
		public WebElement uICostPerEmployeeEdit;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostGuest")
		public WebElement uICostPerGuestEdit;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddQualificationPeriod_DropDown")
		public WebElement uIQualificationPeriodComboBox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtReQualifyBy_KPIDttmCtrl")
		public WebElement uIReQualifyByDateEdit;

		@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_chkEnrollment")
		public WebElement uIEnrollmentCheckBox;

	}

	public class ClassEntryInstructorsTab {
		public WebDriver driver;

		public ClassEntryInstructorsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Instructors')")
		public WebElement UINavigatetoInstructorsTab;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtFromDate_KPIDttmCtrl")
		public WebElement UITrainingFromDateTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtToDate_KPIDttmCtrl")
		public WebElement UITrainingToDateTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_lupInstructor_CodeValue")
		public WebElement UIInstrcutorTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_cddSubject_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_cddPosition_DropDown")
		public WebElement UIPositionDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtExpiryDttm_KPIDttmCtrl")
		public WebElement UICertificationExpiresDateTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_txtTrainHours")
		public WebElement UITrainingHoursTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_txtComments")
		public WebElement UICommentsTxtbox;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_imgAdd")
		public WebElement UIAddButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_imgClear")
		public WebElement UIClearButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_grdInstructors")
		public WebElement UIGridTable;

	}

	public class ClassEntryCourseDescriptionTab {
		public WebDriver driver;

		public ClassEntryCourseDescriptionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Course Description')")
		public WebElement UINavigatetoInstructorsTab;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtFromDate_KPIDttmCtrl")
		public WebElement UITemplateDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtToDate_KPIDttmCtrl")
		public WebElement UILoadbutton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_lupInstructor_CodeValue")
		public WebElement UIAddnewButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl5_usrCourseDescription_KPIRadCourseDescription_contentIframe")
		public WebElement UIEditorControl;
	}

	public class ClassEntryNotesForStudentsTab {
		public WebDriver driver;

		public ClassEntryNotesForStudentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Notes For Students')")
		public WebElement UINavigatetoNotesforStudentsTab;

		@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_cddTemplate")
		public WebElement UITemplateDropdown;

		@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_btnLoad")
		public WebElement UILoadbutton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_btnAddNew")
		public WebElement UIAddnewButton;

		@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_KPIRadNotesForStudents_contentIframe")
		public WebElement UIEditorControl;

	}

	public class ClassEntryInstructorNotesTab {
		public WebDriver driver;

		public ClassEntryInstructorNotesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Instructor Notes')")
		public WebElement UINavigatetoInstructorNotesTab;

		@FindBy(how = How.ID, using = "dtDate_Date_KPIDttmCtrl")
		public WebElement uIUpdateDateTextbox;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtDate_Time' //input")
		public WebElement uIUpdateTimeTextbox;

		@FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
		public WebElement uIUpdatedByTxtbox;

		@FindBy(how = How.ID, using = "txtDuration")
		public WebElement uIDuratioNoTxtbox;

		@FindBy(how = How.ID, using = "cddDurationType_DropDown")
		public WebElement uIDurationTypeDropdown;

		@FindBy(how = How.ID, using = "txtLog")
		public WebElement uICommentsTextbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

	}

	public class ClassEntryEvaluationsTab {
		public WebDriver driver;

		public ClassEntryEvaluationsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Evaluations')")
		public WebElement UINavigatetoEvaluationsTab;

		@FindBy(how = How.ID, using = "tabUnit_tmpl8_usrEvaluations_grdEvaluations")
		public WebElement uIGridTable;

	}

	public class ClassEntryCEUsTab {
		public WebDriver driver;

		public ClassEntryCEUsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'CEUs')")
		public WebElement UINavigatetoCEUsTab;

		@FindBy(how = How.ID, using = "tabUnit_tmpl9_usrClassCEU_grdClassCEU")
		public WebElement uIGridTable;

	}

	public class FacilityEntry {
		public WebDriver driver;

		public FacilityEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtFacilityCode")
		public WebElement UIFacilityIDTxtbox;

		@FindBy(how = How.ID, using = "txtFacilityName")
		public WebElement UINameTxtbox;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement UIAddressTxtbox;

		@FindBy(how = How.ID, using = "cstCSZ_City")
		public WebElement UICSZCityTxtbox;

		@FindBy(how = How.ID, using = "cstCSZ_State_DropDown")
		public WebElement UICSZStateDropdown;

		@FindBy(how = How.ID, using = "cstCSZ_Zip")
		public WebElement UICSZZipLookUp;

		@FindBy(how = How.XPATH, using = "lupCounty_CodeValue")
		public WebElement UICountrytxtbox;

		@FindBy(how = How.XPATH, using = "cstPhone1_PhoneType_DropDown")
		public WebElement UIPhoneNoType1Dropdown;

		@FindBy(how = How.XPATH, using = "cstPhone1_PhoneNumber")
		public WebElement UIPhoneNo1txtbox;

		@FindBy(how = How.XPATH, using = "txtExt1")
		public WebElement UIPhoneExt1txtbox;

		@FindBy(how = How.XPATH, using = "cstPhone2_PhoneType_DropDown")
		public WebElement UIPhoneNoType2Dropdown;

		@FindBy(how = How.XPATH, using = "cstPhone2_PhoneNumber")
		public WebElement UIPhoneNo2txtbox;

		@FindBy(how = How.XPATH, using = "txtExt2")
		public WebElement UIPhoneExt2txtbox;

		@FindBy(how = How.XPATH, using = "txtEmail")
		public WebElement UIEmailtxtbox;

		@FindBy(how = How.XPATH, using = "txtNotes")
		public WebElement UINotestxtbox;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement UIInactiveCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement UISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement UISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement UISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement UIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement UIRefreshButton;

	}

	public class GuestEntry {
		public WebDriver driver;

		public GuestEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cstName_LastName")
		public WebElement UILastNameTxtbox;

		@FindBy(how = How.ID, using = "cstName_FirstName")
		public WebElement UIFirstNameTxtbox;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement UIAddressTxtbox;

		@FindBy(how = How.ID, using = "cstCSZ_City")
		public WebElement UICSZCityTxtbox;

		@FindBy(how = How.ID, using = "cstCSZ_State_DropDown")
		public WebElement UICSZStateDropdown;

		@FindBy(how = How.ID, using = "cstCSZ_Zip")
		public WebElement UICSZZipLookUp;

		@FindBy(how = How.XPATH, using = "lupCounty_CodeValue")
		public WebElement UICountrytxtbox;

		@FindBy(how = How.XPATH, using = "cstPhone1_PhoneType_DropDown")
		public WebElement UIPhoneNoType1Dropdown;

		@FindBy(how = How.XPATH, using = "cstPhone1_PhoneNumber")
		public WebElement UIPhoneNo1txtbox;

		@FindBy(how = How.XPATH, using = "txtExt1")
		public WebElement UIPhoneExt1txtbox;

		@FindBy(how = How.XPATH, using = "cstPhone2_PhoneType_DropDown")
		public WebElement UIPhoneNoType2Dropdown;

		@FindBy(how = How.XPATH, using = "cstPhone2_PhoneNumber")
		public WebElement UIPhoneNo2txtbox;

		@FindBy(how = How.XPATH, using = "txtExt2")
		public WebElement UIPhoneExt2txtbox;

		@FindBy(how = How.XPATH, using = "txtEmail")
		public WebElement UIEmailtxtbox;

		@FindBy(how = How.XPATH, using = "txtNotes")
		public WebElement UINotestxtbox;

		@FindBy(how = How.XPATH, using = "mskSSNo_clientState")
		public WebElement UIStudentsSSNotxtbox;

		@FindBy(how = How.XPATH, using = "lupORINbr_CodeValue")
		public WebElement UIAgencyORItxtbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement UISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement UISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement UISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement UIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement UIRefreshButton;

	}

	public class InstructorEntry {
		public WebDriver driver;

		public InstructorEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement UIEmployeePFNoTxtbox;

		@FindBy(how = How.ID, using = "lupORINbr_CodeValue")
		public WebElement UIAgencyTxtbox;

		@FindBy(how = How.ID, using = "ddlNameList")
		public WebElement UIAgencyNameDropdown;

		@FindBy(how = How.XPATH, using = "txtNotes")
		public WebElement UINotestxtbox;

		@FindBy(how = How.XPATH, using = "txtCustom1")
		public WebElement UICustom1txtbox;

		@FindBy(how = How.XPATH, using = "txtCustom2")
		public WebElement UICustom2txtbox;

		@FindBy(how = How.XPATH, using = "cddCertificate_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.XPATH, using = "txtCurrencyCostPerHr")
		public WebElement UICostPerHourtxtbox;

		@FindBy(how = How.XPATH, using = "dtExpiryDttm_KPIDttmCtrl")
		public WebElement UIExpiresDatetxtbox;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement UIAddButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement UIClearButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement UIInactiveCheckbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement UISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement UISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement UISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement UIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement UIRefreshButton;

	}

	public class CourseEntry {
		public WebDriver driver;

		public CourseDescriptionTab courseDescriptionTab;
		public NotesForStudentsTab notesForStudentsTab;
		public InstructorNotesTab instructorNotesTab;
		public CourseCEUsTab courseCEUsTab;
		public OtherSettingsTab otherSettingsTab;
		
		public CourseEntry() {
			if (this.courseDescriptionTab == null)
				this.courseDescriptionTab = new CourseDescriptionTab();

			if (this.notesForStudentsTab == null)
				this.notesForStudentsTab = new NotesForStudentsTab();

			if (this.instructorNotesTab == null)
				this.instructorNotesTab = new InstructorNotesTab();

			if (this.courseCEUsTab == null)
				this.courseCEUsTab = new CourseCEUsTab();

			if (this.otherSettingsTab == null)
				this.otherSettingsTab = new OtherSettingsTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement UISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement UISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement UISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement UIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement UIRefreshButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement UIDeleteButton;

		@FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
		public WebElement UITrainingCategoryDropdown;

		@FindBy(how = How.ID, using = "cddTrainingType_DropDown")
		public WebElement UITrainingTypeDropdown;

		@FindBy(how = How.ID, using = "txtTitle")
		public WebElement UICourseTitleTxtbox;

		@FindBy(how = How.ID, using = "lupCourseID_CodeValue")
		public WebElement UICourseNoTxtbox;

		@FindBy(how = How.ID, using = "dttmTrainingSchedule_Date_KPIDttmCtrl")
		public WebElement UIRequalificationPeriodDropdown;

		@FindBy(how = How.ID, using = "txtRemaining")
		public WebElement UIInactiveCheckboxbox;

	}

	public class CourseDescriptionTab {
		public WebDriver driver;

		public CourseDescriptionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabCourseCode'//span[contains(text(),'Course Description')")
		public WebElement UINavigatetoInstructorsTab;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl0_usrCourseDescription_cddTemplate")
		public WebElement UITemplateDropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl0_usrCourseDescription_btnLoad")
		public WebElement UILoadbutton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl0_usrCourseDescription_btnAddNew")
		public WebElement UIAddnewButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl0_usrCourseDescription_KPIRadCourseDescription_contentIframe")
		public WebElement UIEditorControl;
	}

	public class NotesForStudentsTab {
		public WebDriver driver;

		public NotesForStudentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabCourseCode'//span[contains(text(),'Notes For Students')")
		public WebElement UINavigatetoNotesForStudentsTab;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl1_usrNotesForStudents_cddTemplate")
		public WebElement UITemplateDropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl1_usrNotesForStudents_btnLoad")
		public WebElement UILoadbutton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl1_usrNotesForStudents_btnAddNew")
		public WebElement UIAddnewButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl1_usrNotesForStudents_KPIRadNotesForStudents_contentIframe")
		public WebElement UIEditorControl;

	}

	public class InstructorNotesTab {
		public WebDriver driver;

		public InstructorNotesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabCourseCode'//span[contains(text(),'Instructor Notes')")
		public WebElement UINavigatetoInstructorNotesTab;

		@FindBy(how = How.ID, using = "dtDate_Date_KPIDttmCtrl")
		public WebElement uIUpdateDateTextbox;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtDate_Time' //input")
		public WebElement uIUpdateTimeTextbox;

		@FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
		public WebElement uIUpdatedByTxtbox;

		@FindBy(how = How.ID, using = "txtDuration")
		public WebElement uIDuratioNoTxtbox;

		@FindBy(how = How.ID, using = "cddDurationType_DropDown")
		public WebElement uIDurationTypeDropdown;

		@FindBy(how = How.ID, using = "txtLog")
		public WebElement uICommentsTextbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

	}

	public class CourseCEUsTab {
		public WebDriver driver;

		public CourseCEUsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabCourseCode'//span[contains(text(),'CEUs')")
		public WebElement UINavigatetoCEUsTab;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl5_usrCourseCEU_cddCertification_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl5_usrCourseCEU_chkApplyToAllStudents")
		public WebElement UIApplyCredittoallCheckbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl5_usrCourseCEU_txtCEUsEarned")
		public WebElement UIEarnedCEUsTxtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl5_usrCourseCEU_txtHoursCredited")
		public WebElement UICreditedHoursTxtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl5_usrCourseCEU_imgAdd")
		public WebElement UIAddButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl5_usrCourseCEU_imgClear")
		public WebElement UIClearButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl5_usrCourseCEU_grdCourseCEUs")
		public WebElement UICEUsgridTable;

	}

	public class OtherSettingsTab {
		public WebDriver driver;

		public OtherSettingsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='tabCourseCode'//span[contains(text(),'Other Settings')")
		public WebElement UINavigatetoOtherSettingsTab;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtCostPerEmployee")
		public WebElement UICostperEmployeeTxtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtCostPerGuest")
		public WebElement UICostperGuestTxtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_chkEnroll")
		public WebElement UIEnrollmentCheckbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_chkCompletion")
		public WebElement UICompletionCheckbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cddCourse1_DropDown")
		public WebElement UICourse1Dropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cddCourse2_DropDown")
		public WebElement UICourse2Dropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cddCourse3_DropDown")
		public WebElement UICourse3Dropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cddCourse4_DropDown")
		public WebElement UICourse4Dropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cddSpecialSkills_DropDown")
		public WebElement UIAddSpecialSkillDropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cddRequalCourse_DropDown")
		public WebElement UISatisfyRequalificationDropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_rbMandatory")
		public WebElement UIEvaluationMandatoryRadioButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_rbOptional")
		public WebElement UIEvaluationOptionalRadioButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_rbNA")
		public WebElement UIEvaluationNARadioButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtScore")
		public WebElement UIPassScoreGreaterThanTxtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cmdMaitainOnlineTestForm")
		public WebElement UIMaintainOnlineTestFormButton;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cddCertificateTemplate")
		public WebElement UITemplateDropdown;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtText1")
		public WebElement UIText1Txtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtText2")
		public WebElement UIText2Txtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtText3")
		public WebElement UIText3Txtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtText4")
		public WebElement UIText4Txtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_txtText5")
		public WebElement UIText5Txtbox;

		@FindBy(how = How.ID, using = "tabCourseCode_tmpl4_usrOtherSettings_cmdPreview")
		public WebElement UIPreviewButton;

	}

	public class CertificationEntry {
		public WebDriver driver;

		public CertificationEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement UIPFNoTxtbox;

		@FindBy(how = How.ID, using = "cddCertification_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "cmdAddManualEntry")
		public WebElement UIAddManualEntryButton;

		@FindBy(how = How.ID, using = "chkExpiredEntries")
		public WebElement UIInculdeExpiredEntries;

		@FindBy(how = How.ID, using = "grdCertification")
		public WebElement UIgridTable;

	}

	public class CertificationManualEntry {
		public WebDriver driver;

		public CertificationManualEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement UIPFNoTxtbox;

		@FindBy(how = How.ID, using = "cddCertification_DropDown")
		public WebElement UICertificationDropdown;

		@FindBy(how = How.ID, using = "chkInstructor")
		public WebElement UIInstructorCheckbox;

		@FindBy(how = How.ID, using = "cmdAddMulPF")
		public WebElement UIAddMultiplePFButton;

		@FindBy(how = How.ID, using = "txtEarnedCEU")
		public WebElement UIEarnedCEUsTxtbox;

		@FindBy(how = How.ID, using = "txtEarnedHour")
		public WebElement UIEarnedHoursTxtbox;

		@FindBy(how = How.ID, using = "dtEffectiveFrom_KPIDttmCtrl")
		public WebElement UIEffectiveFromDateTxtbox;

		@FindBy(how = How.ID, using = "dtRecertificationBy_KPIDttmCtrl")
		public WebElement UIRecertificationByDateTxtbox;

		@FindBy(how = How.ID, using = "txtReason")
		public WebElement UIReasonTxtbox;

		@FindBy(how = How.ID, using = "txtLicense")
		public WebElement UICertificationORLicenseNoTxtbox;

		@FindBy(how = How.ID, using = "cddLicenseLvl_DropDown")
		public WebElement UIEMSLicenseLevelDropdown;

		@FindBy(how = How.ID, using = "lupEnteredBy_CodeValue")
		public WebElement UIEnteredByTxtbox;

		@FindBy(how = How.ID, using = "dtEnteredDate_KPIDttmCtrl")
		public WebElement UIEnteredDateTxtbox;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement UIDeleteIcon;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement UISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement UISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement UISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement UIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement UIRefreshButton;

	}

	public class TrainingClassEntry {

		public WebDriver driver;

		public ClassEntryStudentsTab classEntryStudentsTab;
		public ClassEntryTrainingDetailTab classEntryTrainingDetailTab;
		public ClassEntryInstructorsTab classEntryInstructorsTab;
		public ClassEntryCourseDescriptionTab classEntryCourseDescriptionTab;
		public ClassEntryNotesForStudentsTab classEntryNotesForStudentsTab;
		public ClassEntryInstructorNotesTab classEntryInstructorNotesTab;
		public ClassEntryEvaluationsTab classEntryEvaluationsTab;
		public ClassEntryCEUsTab classEntryCEUsTab;
	
		public TrainingClassEntry() {
			if (this.classEntryStudentsTab == null)
				this.classEntryStudentsTab = new ClassEntryStudentsTab();

			if (this.classEntryTrainingDetailTab == null)
				this.classEntryTrainingDetailTab = new ClassEntryTrainingDetailTab();

			if (this.classEntryInstructorsTab == null)
				this.classEntryInstructorsTab = new ClassEntryInstructorsTab();

			if (this.classEntryCourseDescriptionTab == null)
				this.classEntryCourseDescriptionTab = new ClassEntryCourseDescriptionTab();

			if (this.classEntryNotesForStudentsTab == null)
				this.classEntryNotesForStudentsTab = new ClassEntryNotesForStudentsTab();

			if (this.classEntryEvaluationsTab == null)
				this.classEntryEvaluationsTab = new ClassEntryEvaluationsTab();

			if (this.classEntryCEUsTab == null)
				this.classEntryCEUsTab = new ClassEntryCEUsTab();

			if (this.classEntryInstructorNotesTab == null)
				this.classEntryInstructorNotesTab = new ClassEntryInstructorNotesTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement uISaveandAddnewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIprintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteIcon;

		@FindBy(how = How.ID, using = "cmdActivity")
		public WebElement uIActivityLogButton;

		@FindBy(how = How.ID, using = "dtEntryDate_KPIDttmCtrl")
		public WebElement uIEntryDateTxtbox;

		@FindBy(how = How.ID, using = "txtNoStudents")
		public WebElement uINoOfSutendtsTxtbox;

		@FindBy(how = How.ID, using = "txtRemaining")
		public WebElement uINoOfSlotsRemainingTxtbox;

		@FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
		public WebElement uITrainingCategoryComboBox;

		@FindBy(how = How.ID, using = "cddTrainingType_DropDown")
		public WebElement uITrainingTypeComboBox;

		@FindBy(how = How.ID, using = "lupCourseID_CodeValue")
		public WebElement uICourseNoTxtbox;

		@FindBy(how = How.ID, using = "txtTitle")
		public WebElement uICourseTitleTxtbox;

		@FindBy(how = How.ID, using = "dttmTrainingSchedule_Date_KPIDttmCtrl")
		public WebElement uITrainingFromDateTxtbox;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmTrainingSchedule_Time'//input")
		public WebElement uITrainingFromTimeTxtbox;

		@FindBy(how = How.ID, using = "dttmTo_Date_KPIDttmCtrl")
		public WebElement uITrainingToDateTxtbox;

		@FindBy(how = How.ID, using = "//table[@id='dttmTo_Time'//input")
		public WebElement uITrainingToTimeTxtbox;

		@FindBy(how = How.ID, using = "txtCourseHours")
		public WebElement uICourseHoursTxtbox;

		@FindBy(how = How.ID, using = "cmdTrainingSchedule")
		public WebElement uIMultidayScheduleButton;

		@FindBy(how = How.ID, using = "cmdDuplicate")
		public WebElement uIDuplicatedButton;

		@FindBy(how = How.ID, using = "BtnSignUp")
		public WebElement uISignUpButton;

		@FindBy(how = How.ID, using = "cmdPublishTo")
		public WebElement uIPublishToButton;

		@FindBy(how = How.ID, using = "cmdCancelClass")
		public WebElement uICancelTheClassButton;

		@FindBy(how = How.ID, using = "ChkShwSchCal")
		public WebElement uIShowInCalendarCheckbox;

		@FindBy(how = How.ID, using = "chkPublish")
		public WebElement uIDoNotPublishCheckbox;

		@FindBy(how = How.ID, using = "chkEmployees")
		public WebElement uIEmployeesOnlyCheckbox;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "txtNoStudents")
		public WebElement uINoOfStudents;

		@FindBy(how = How.XPATH, using = "//span[text()='Students']")
		public WebElement uIStudentsTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Training Detail']")
		public WebElement uITrainingDetailTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Instructors']")
		public WebElement uIInstructorsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Course Description')]")
		public WebElement uICourseDescriptionTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes For Students')]")
		public WebElement uINotesforStudentsTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Evaluations')]")
		public WebElement uIEvaluationsTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'CEUs')]")
		public WebElement uICEUsTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Instructor Notes')]")
		public WebElement uIInstructorNotesTab;

		@FindBy(how = How.XPATH, using = "//div[@id='tabUnit'//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		public class ClassEntryStudentsTab {
			public WebDriver driver;

			public ClassEntryStudentsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_lupPF_CodeValue")
			public WebElement uIEmployeePFNoTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_lupORINbr_CodeValue")
			public WebElement uIAgencytxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cddSelectName_Input")
			public WebElement uINameDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdAddNew")
			public WebElement uIAddNewButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdAddEmployee")
			public WebElement uIAddMultipleEmployeesButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdPrintCertificate")
			public WebElement uIPrintTrainingCertificateButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_imgAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_imgClear")
			public WebElement uIClearButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_lblOnlineTest")
			public WebElement uIEnableOnlineTestCheckbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_chkSelectAll")
			public WebElement uISelectAllCheckbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cddResult_DropDown")
			public WebElement uIResultDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_txtScore")
			public WebElement uIScoreTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_txtNotes")
			public WebElement uINotesTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdApply")
			public WebElement uIApplyButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_cmdEmail")
			public WebElement uINotificationIcon;

			@FindBy(how = How.ID, using = "tabUnit_tmpl0_usrClassStudents_grdStudentEnrolled")
			public WebElement uIGridTable;

		}

		public class ClassEntryTrainingDetailTab {
			public WebDriver driver;

			public ClassEntryTrainingDetailTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddMethodofInstruction_DropDown")
			public WebElement uIMethodOfInstructionDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_lupTrainingFacility_CodeValue")
			public WebElement uIFacilityCodeTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostEmployee")
			public WebElement uICostPerEmployeeTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostGuest")
			public WebElement uICostPerGuestTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curClassCost")
			public WebElement uIClassCostTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtNotes")
			public WebElement uINotesTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddQualificationPeriod_DropDown")
			public WebElement uIQualificationPeriodDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtReQualifyBy_KPIDttmCtrl")
			public WebElement uIRequalifyByDateTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_chkEnrollment")
			public WebElement uIEnrollmentCheckbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_chkCompletion")
			public WebElement uICompletionCheckbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse1_DropDown")
			public WebElement uICourse1Dropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse2_DropDown")
			public WebElement uICourse2Dropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse3_DropDown")
			public WebElement uICourse3Dropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddCourse4_DropDown")
			public WebElement uICourse4Dropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_lupTrainingFacility_CodeValue")
			public WebElement uITrainingFacilityEdit;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_lupTrainingFacility_imgBtn")
			public WebElement uITrainingFacilityLookupButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddMethodofInstruction_DropDown")
			public WebElement uIMethodofInstructionComboBox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostEmployee")
			public WebElement uICostPerEmployeeEdit;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_curCostGuest")
			public WebElement uICostPerGuestEdit;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtNotes")
			public WebElement uINotesEdit;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_cddQualificationPeriod_DropDown")
			public WebElement uIQualificationPeriodComboBox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_txtReQualifyBy_KPIDttmCtrl")
			public WebElement uIReQualifyByDateEdit;

			@FindBy(how = How.ID, using = "tabUnit_tmpl2_usrTrainingDetails_chkEnrollment")
			public WebElement uIEnrollmentCheckBox;

		}

		public class ClassEntryInstructorsTab {
			public WebDriver driver;

			public ClassEntryInstructorsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtFromDate_KPIDttmCtrl")
			public WebElement uITrainingFromDateTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtToDate_KPIDttmCtrl")
			public WebElement uITrainingToDateTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_lupInstructor_CodeValue")
			public WebElement uIInstructorEdit;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_cddSubject_DropDown")
			public WebElement uICertificationDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_cddPosition_DropDown")
			public WebElement uIPositionDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtExpiryDttm_KPIDttmCtrl")
			public WebElement uICertificationExpiresDateTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_txtTrainHours")
			public WebElement uITrainingHoursTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_txtComments")
			public WebElement uICommentsTxtbox;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_imgAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_imgClear")
			public WebElement uIClearButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_grdInstructors")
			public WebElement uIGridTable;

		}

		public class ClassEntryCourseDescriptionTab {
			public WebDriver driver;

			public ClassEntryCourseDescriptionTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtFromDate_KPIDttmCtrl")
			public WebElement uITemplateDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_dtToDate_KPIDttmCtrl")
			public WebElement uILoadbutton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl3_usrInstructor_lupInstructor_CodeValue")
			public WebElement uIAddnewButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl5_usrCourseDescription_KPIRadCourseDescription_contentIframe")
			public WebElement uIEditorControl;
		}

		public class ClassEntryNotesForStudentsTab {
			public WebDriver driver;

			public ClassEntryNotesForStudentsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_cddTemplate")
			public WebElement uITemplateDropdown;

			@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_btnLoad")
			public WebElement uILoadbutton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_btnAddNew")
			public WebElement uIAddnewButton;

			@FindBy(how = How.ID, using = "tabUnit_tmpl6_NotesStudent_KPIRadNotesForStudents_contentIframe")
			public WebElement uIEditorControl;

		}

		public class ClassEntryInstructorNotesTab {
			public WebDriver driver;

			public ClassEntryInstructorNotesTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "dtDate_Date_KPIDttmCtrl")
			public WebElement uIUpdateDateTextbox;

			@FindBy(how = How.XPATH, using = "//table[@id = 'dtDate_Time' //input")
			public WebElement uIUpdateTimeTextbox;

			@FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
			public WebElement uIUpdatedByTxtbox;

			@FindBy(how = How.ID, using = "txtDuration")
			public WebElement uIDuratioNoTxtbox;

			@FindBy(how = How.ID, using = "cddDurationType_DropDown")
			public WebElement uIDurationTypeDropdown;

			@FindBy(how = How.ID, using = "txtLog")
			public WebElement uICommentsTextbox;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;

		}

		public class ClassEntryEvaluationsTab {
			public WebDriver driver;

			public ClassEntryEvaluationsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabUnit_tmpl8_usrEvaluations_grdEvaluations")
			public WebElement uIGridTable;

		}

		public class ClassEntryCEUsTab {
			public WebDriver driver;

			public ClassEntryCEUsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabUnit_tmpl9_usrClassCEU_grdClassCEU")
			public WebElement uIGridTable;

		}

	}

	public class TrainingScheduleEntry {
		public WebDriver driver;

		public TrainingScheduleEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtStartDttm_KPIDttmCtrl")
		public WebElement uITrainingStartDateEdit;

		@FindBy(how = How.ID, using = "dtStartDttm_KPIDttmCtrl")
		public WebElement uITrainingEndDateEdit;

		@FindBy(how = How.XPATH, using = "//input[@class='igte_BlueThemeEditInContainer'and@tabindex='502']")
		public WebElement uIClassHoursFromEdit;

		@FindBy(how = How.XPATH, using = "//input[@class='igte_BlueThemeEditInContainer'and@tabindex='503']")
		public WebElement uIClassHoursToEdit;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNClose;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISave;

	}

	public class MultiPFWindow {
		public WebDriver driver;

		public MultiPFWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "RadMultiplePFTreeView")
		public WebElement uISelectPFRadOpenComboBox;

		@FindBy(how = How.ID, using = "btnAddPFs")
		public WebElement uIAddSelectedPFToList;

		@FindBy(how = How.ID, using = "chkSelectAll")
		public WebElement uISelectAllCheckBox;

	}

}
