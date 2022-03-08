package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapFRPersonnel {

	 public CertificationSearchWindow certificationSearchWindow;
     public CertificationManualEntryWindow certificationManualEntryWindow;
     public ClassSearchWindow classSearchWindow;
     public TrainingClassEntryWindow trainingClassEntryWindow;
     
     
     public UIMapFRPersonnel()
     {
   	  if (this.certificationSearchWindow == null)
   		this.certificationSearchWindow = new CertificationSearchWindow();
   	  if (this.certificationManualEntryWindow == null)
   		this.certificationManualEntryWindow = new CertificationManualEntryWindow();
   	  if (this.classSearchWindow == null)
   		this.classSearchWindow = new ClassSearchWindow();
   	  if (this.trainingClassEntryWindow == null)
   		this.trainingClassEntryWindow = new TrainingClassEntryWindow();
   	  
     }
	
    public class CertificationSearchWindow
    {
          public WebDriver driver;

          public CertificationSearchWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "lupEmployeePF_CodeValue")
        public  WebDriver uIEmployeePFNumberEdit;

        @FindBy(how = How.ID, using = "lupEmployeePF_imgBtn")
        public  WebDriver uIEmployeePFLookupButton;

        @FindBy(how = How.ID, using = "cddCertification_DropDown")
        public WebElement uICertificationComboBox;

        @FindBy(how = How.ID, using = "dtReCertify_KPIDttmCtrl")
        public WebElement uIRecertificationByDateEdit;

        @FindBy(how = How.ID, using = "cmdSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;
      
        @FindBy(how = How.ID, using = "grdCertifications1")
        public WebElement uICertificationSearchTable;

    }
    public class CertificationManualEntryWindow
    {
         public WebDriver driver;

         public CertificationManualEntryWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

         @FindBy(how = How.ID, using = "lupPF_CodeValue")
         public WebElement uIPFNumberEdit;

         @FindBy(how = How.ID, using = "lupPF_imgBtn")
         public WebElement uIPFLookupButton;

         @FindBy(how = How.ID, using = "cddCertification_DropDown")
         public WebElement uICertificationComboBox;

        @FindBy(how = How.ID, using = "lblEarnedCEU")
        public WebElement uIEarnedCEUsLabel;

       // @FindBy(how = How.ID, using = "txtEarnedCEU")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_txtEarnedCEU")
        public WebElement uIEarnedCEUsEdit;

         @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_txtEarnedHour")
       // @FindBy(how = How.ID, using = "txtEarnedHour")
        public WebElement uIEarnedHourEdit;

        // @FindBy(how = How.ID, using = "lblEarnedHour")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_lblEarnedHour")
        public WebElement uIEarnedHourLabel;

        // @FindBy(how = How.ID, using = "dtEffectiveFrom_KPIDttmCtrl")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_dtEffectiveFrom_KPIDttmCtrl")
        public WebElement uIEffectiveFromDateEdit;

        // @FindBy(how = How.ID, using = "dtRecertificationBy_KPIDttmCtrl")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_dtRecertificationBy_KPIDttmCtrl")
        public WebElement uIRecertificationByDateEdit;

        @FindBy(how = How.ID, using = "chkInstructor")
        public WebElement uIInstructorCheckbox;

        @FindBy(how = How.ID, using = "chkIsEMS")
        public WebElement uIIsEMSCheckbox;

       // @FindBy(how = How.ID, using = "txtReason")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_txtReason")        
         public WebElement uIReasonEdit;

        // @FindBy(how = How.ID, using = "txtLicense")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_txtLicense") 
         public WebElement uICertificationOrLicenseNoEdit;

         @FindBy(how = How.ID, using = "cddLicenseLvl_DropDown")
         public WebElement uIEMSLicenseLevelComboBox;

        // @FindBy(how = How.ID, using = "lupEnteredBy_CodeValue")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_lupEnteredBy_CodeValue")
        public WebElement uIEnteredByEdit;

        // @FindBy(how = How.ID, using = "lupEnteredBy_imgBtn")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_lupEnteredBy_imgBtn")
        public WebElement uIEnteredByLookupButton;

        // @FindBy(how = How.ID, using = "dtEnteredDate_KPIDttmCtrl")
        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_dtEnteredDate_KPIDttmCtrl")
        public WebElement uIEnteredDateEdit;

         @FindBy(how = How.ID, using = "cmdSave")
         public WebElement uISaveButton;

         @FindBy(how = How.ID, using = "cmdSaveNClose")
         public WebElement uISaveCloseButton;

         @FindBy(how = How.ID, using = "cmdRefresh")
         public WebElement uIResetButton;

         @FindBy(how = How.ID, using = "cmdDelete")
         public WebElement uIDeleteButton;

        @FindBy(how = How.ID, using = "radotherjobrole")
        public WebElement uIOtherJobRolesCombobox;

        @FindBy(how = How.ID, using = "cddPrimaryEMSRole_DropDown")
        public WebElement uIPrimaryEMSRoleCombobox;

        @FindBy(how = How.ID, using = "CddPracticelevel_DropDown")
        public WebElement uIAgencyEMSPracticeLevelCombobox;

        @FindBy(how = How.ID, using = "dtPracticeDate_KPIDttmCtrl")
        public WebElement uIAgencyEMSPracticeLevelDateEdit;

        @FindBy(how = How.ID, using = "imgPracticeAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "tabusrCertManualEntry_tmpl0_usrCertificationMain1_cmdSaveMain")
        public WebElement uIInternalSaveButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
        public WebElement uIMainTab;

    }
    public class ClassSearchWindow
    {
        public WebDriver driver;
        public ClassSearchWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
        public WebElement uIBackButton;
    }
    public class TrainingClassEntryWindow
    {
    	
        public WebDriver driver;
        public RequestTab requestTab;
        public TrainingClassEntryWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            
            if ((this.requestTab == null))
            {
                this.requestTab = new RequestTab();
            }
        }

        @FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
        public WebElement uITrainingCategoryComboBox;

        @FindBy(how = How.ID, using = "cddTrainingType_DropDown")
        public WebElement uITrainingTypeComboBox;

        @FindBy(how = How.ID, using = "txtNoStudents")
        public WebElement uINoOfStudentEdit;

        @FindBy(how = How.ID, using = "lupCourseID_CodeValue")
        public WebElement uICourseNoEdit;

        @FindBy(how = How.ID, using = "lupCourseID_imgBtn")
        public WebElement uICourseNoLookupButton;

        @FindBy(how = How.ID, using = "dtEntryDate_KPIDttmCtrl")
        public WebElement uIEntryDateEdit;

        @FindBy(how = How.ID, using = "dttmTrainingSchedule_Date_KPIDttmCtrl")
        public WebElement uIEnterTrainingScheduleDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dttmTrainingSchedule_Time']//input")
        public WebElement uIEnterTrainingScheduleTimeEdit;

        @FindBy(how = How.ID, using = "dttmTo_Date_KPIDttmCtrl")
        public WebElement uIEnterToDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dttmTo_Time']//input")
        public WebElement uIEnterToTimeEdit;

        @FindBy(how = How.ID, using = "txtCourseHours")
        public WebElement uICourseHoursEdit;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Students')]")
        public WebElement uIStudentsTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Training Detail')]")
        public WebElement uITrainingDetailTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Instructors')]")
        public WebElement uIInstructorsTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Course Description')]")
        public WebElement uICourseDescriptionTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes For Students')]")
        public WebElement uINotesForStudentsTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Evaluations')]")
        public WebElement uIEvaluationsTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'CEUs')]")
        public WebElement uICEUsTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Request')]")
        public WebElement uIRequestTab;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "BtnSignUp")
        public WebElement uISignUpButton;


               
    } 
    public class RequestTab
    {
        public WebDriver driver;
        public RequestTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabUnit_tmpl1_usrTrainingRequest_grdStudentsRequest")
        public WebElement uIRequestTabReportTable;
    }
    
}
