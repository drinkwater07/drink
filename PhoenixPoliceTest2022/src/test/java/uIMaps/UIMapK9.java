package uIMaps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapK9 {
	
		 	public K9Search k9Search;
	        public CPAEntry cpaEntry;
	        public CPA cPA;
	        public K9ReportsSearch k9ReportsSearch;
	        public ReportEntry reportEntry;      
	        public K9PersonnelEntry k9PersonnelEntry;
	        public K9Personnel k9Personnel;
	        public K9Training k9Training;
	        public K9TrainingEntry k9TrainingEntry;
	        public K9ActivityEntry k9ActivityEntry;
	        public K9Team k9Team;
	        public K9TeamEntry k9TeamEntry;
	        public K9Medical k9Medical;
	        public MedicalVisitEntry medicalVisitEntry;
	        public K9TrainingAid k9TrainingAid;
	        public K9Reports k9Reports;
	        
	        public UIMapK9() {
	        	
	        
                if (this.k9Search == null)
                    this.k9Search = new K9Search();
              
                if (this.cpaEntry == null)
                     this.cpaEntry = new CPAEntry();
                
                if (this.cPA == null)
                    this.cPA = new CPA();
                
                if (this.k9Medical == null)
                    this.k9Medical = new K9Medical();
                
                if (this.k9Medical == null)
                    this.k9Medical = new K9Medical();
                
                if (this.medicalVisitEntry == null)
                    this.medicalVisitEntry = new MedicalVisitEntry();
      
                if (this.reportEntry == null)
                    this.reportEntry = new ReportEntry();        
                
                if (this.k9ReportsSearch == null)
                    this.k9ReportsSearch = new K9ReportsSearch(); 
                
                if (this.k9PersonnelEntry == null)
                    this.k9PersonnelEntry = new K9PersonnelEntry();        
                
                if (this.k9Personnel == null)
                    this.k9Personnel = new K9Personnel();    
                
                if (this.k9TrainingAid == null)
                    this.k9TrainingAid = new K9TrainingAid();  
                
                if (this.k9Training == null)
                    this.k9Training = new K9Training();  
                
                if (this.k9TrainingEntry == null)
                    this.k9TrainingEntry = new K9TrainingEntry();  
                
                
                if (this.k9Team == null)
                    this.k9Team = new K9Team();
                

                if (this.k9TeamEntry == null)
                    this.k9TeamEntry = new K9TeamEntry();  
                
                if (this.k9ActivityEntry == null)
                    this.k9ActivityEntry = new K9ActivityEntry();  
                
                if (this.k9Reports == null)
                    this.k9Reports = new K9Reports();
 }

    public class K9Search
    {
    	public WebDriver driver;
        public K9Search()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);

        }

        @FindBy(how = How.ID, using = "nbrCallNo_Year")
        public WebElement uICallNoYearEdit;

        @FindBy(how = How.ID, using = "nbrCallNo_Number")
        public WebElement uICallNoEdit;

        @FindBy(how = How.ID, using = "cmdSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "grdPersonnelSearch")
        public WebElement uISearchResultTable;

    }
    public class CPA {
		public WebDriver driver;

		public CPA() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddK9Handler_DropDown")
		public WebElement uIK9OrHandlerDropDown;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdCPASearch")
		public WebElement uICPAResultTable;

	}



    public class CPAEntry {
        public WebDriver driver;

        public CPAEntry() {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "nbrCallNo_Year")
        public WebElement uICallNoYearEdit;
        
        @FindBy(how = How.ID, using = "nbrCallNo_Number")
        public WebElement uICallNoEdit;
        
        @FindBy(how = How.ID, using = "dttmFrom_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dttmFromTime_Time']//input")
        public WebElement uITimeEdit;

        @FindBy(how = How.ID, using = "cddProofing_DropDown")
        public WebElement uIProofingComboBox;

        @FindBy(how = How.ID, using = "chkIsTraining")
        public WebElement uITrainingCheckBox;

        @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
        public WebElement uIHandlerK9CodeEdit;

        @FindBy(how = How.ID, using = "chkWalkThrough")
        public WebElement uIWalkThroughCheckBox;

        @FindBy(how = How.ID, using = "chkPublicDemo")
        public WebElement uIPublicDemonstrationCheckBox;

        @FindBy(how = How.ID, using = "chkOtherActivity")
        public WebElement uIOtherCheckBox;

        @FindBy(how = How.ID, using = "adrLocation_txtFrom")
        public WebElement uILocationActivityEdit;

        @FindBy(how = How.ID, using = "adrLocation_chkVerify")
        public WebElement uILocationVerifyCheckBox;

        @FindBy(how = How.ID, using = "lupOffPFID1_CodeValue")
        public WebElement uIReportHandlerCodeEdit;

        @FindBy(how = How.ID, using = "dttmTo_KPIDttmCtrl")
        public WebElement uIToDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dttmToTime_Time']//input")
        public WebElement uIToTimeEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dttmToTime_Time']//td[@class='igte_BlueThemeButton']")
        public WebElement uIToTimeArrow;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
        public WebElement uIK9OrHandlerDropDown;

        @FindBy(how = How.ID, using = "cddTypeofActivity_DropDown")
        public WebElement uITypeActivityDropDown;

        @FindBy(how = How.ID, using = "lupOffPFID1_CodeValue")
        public WebElement uIReportingPFNoEdit;
        
        @FindBy(how = How.ID, using = "adrLocation_cmdIncOnAddr")
        public WebElement uILocationOfActivityInfoButton;

 
    }

    public class K9Medical {
		public WebDriver driver;

		public K9Medical() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
		public WebElement uIK9OrHandlerDropDown;

		@FindBy(how = How.ID, using = "drpTypeOfVisit_DropDown")
		public WebElement uITypeOfVisitDropDown;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdMedicalSearch")
		public WebElement uIK9MedicalResulTable;

		@FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
         public WebElement uIK9HandlerDropdown;

	}
    public class MedicalVisitEntry {
		public WebDriver driver;
		public DetailsTab detailsTab;

		public MedicalVisitEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (this.detailsTab == null)
				this.detailsTab = new DetailsTab();
		}

		@FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
		public WebElement uIK9OrHandlerDropDown;

		@FindBy(how = How.ID, using = "cddVisitType_DropDown")
		public WebElement uITypeOfVisitDropDown;

		@FindBy(how = How.ID, using = "txtVisitReason")
		public WebElement uIReasonForVisitEdit;

		@FindBy(how = How.ID, using = "dttmMedicalVisit_KPIDttmCtrl")
		public WebElement uIDateOfVisitEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Details')]")
		public WebElement uIDetailsTab;
		
		 @FindBy(how = How.ID, using = "imgNameFrontView")
	        public WebElement uIK9PersonnelImage;

			@FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
         public WebElement uIK9HandlerDropdown;

		public class DetailsTab {
			
			public WebDriver driver;

			public DetailsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}
			
			
			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrVeteriDetails1_VeterinarianNameCtl_NameType")
			public WebElement uINameTypeEdit;

			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrVeteriDetails1_VeterinarianNameCtl_NameTypeID")
			public WebElement uINameIDEdit;

			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrVeteriDetails1_VeterinarianNameCtl_LastName")
			public WebElement uILastNameEdit;

			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrVeteriDetails1_VeterinarianNameCtl_FirstName")
			public WebElement uIFirstNameEdit;

			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrVeteriDetails1_VeterinarianNameCtl_imgSrch")
			public WebElement uIVeterinarianIBubble;
		}

	}

	public class K9Team {
		public WebDriver driver;

		public K9Team() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "ddlK9Name")
		public WebElement uIK9NameDropDown;

		@FindBy(how = How.ID, using = "lupK9Officer_CodeValue")
		public WebElement uIOfficerOrHandlerEdit;
		
		@FindBy(how = How.ID, using = "grdTeam")
		public WebElement uIK9TeamResultTable;
		
		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

	}

	public class K9TeamEntry {
		public WebDriver driver;

		public K9TeamEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ddlK9Name")
		public WebElement uIK9NameDropDown;
		
		@FindBy(how = How.ID, using = "lupK9Officer_CodeValue")
		public WebElement uIOfficerOrHandlerEdit;
		
		@FindBy(how = How.ID, using = "dtEffective_KPIDttmCtrl")
		public WebElement uIEffectiveFromEdit;
		
		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;
		
		@FindBy(how = How.ID, using = "imgAddK9Team")
		public WebElement uIAddButton;
		
		@FindBy(how = How.ID, using = "imgClearK9Team")
		public WebElement uIClearButton;
		
		@FindBy(how = How.ID, using = "grdTeam")
		public WebElement uIK9TeamEntryResultTable;
		
		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;
	
		@FindBy(how = How.ID, using = "imgAddK9Team")
		public WebElement uIUpdateButton;
				
	}

    public class K9ReportsSearch
    {
        public WebDriver driver;
        public K9ReportsSearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
    }
        @FindBy(how = How.ID, using = "btnSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddReportButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add CPA')]")
        public WebElement uIAddCPAButton;

        @FindBy(how = How.ID, using = "nbrCallNo_Year")
        public WebElement uICallNoYearEdit;

        @FindBy(how = How.ID, using = "nbrCallNo_Number")
        public WebElement uICallNoEdit;

        @FindBy(how = How.ID, using = "nbrIncidentID_Year")
        public WebElement uICaseNoYearEdit;

        @FindBy(how = How.ID, using = "nbrIncidentID_Number")
        public WebElement uICaseNoEdit;

        @FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
        public WebElement uIHandlerCodeEdit;

        @FindBy(how = How.ID, using = "grdK9ReportSearch")
        public WebElement uISearchResultTable;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
        public WebElement uIBackButton;

		 @FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
        public WebElement uIK9HandlerDropDown;
    }

    public class ReportEntry
    {
         public WebDriver driver;
         
         public DetectionTab detectionTab;
         public ApprovalTab approvalTab=null;
         public NamesTab namesTab;
         public PreventiveActionTab preventiveActionTab;
         public SearchTab searchTab;
         public TrackingTab trackingTab;
         public NarrativeTab narrativeTab;
         public ReportEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            
            if (this.detectionTab == null)
                this.detectionTab = new DetectionTab();  
            
            if (this.approvalTab == null)
                this.approvalTab = new ApprovalTab(); 
            
            if (this.namesTab == null)
                this.namesTab = new NamesTab(); 
            
            if (this.preventiveActionTab == null)
                this.preventiveActionTab = new PreventiveActionTab(); 
            
            if (this.searchTab == null)
                this.searchTab = new SearchTab(); 
            
            if (this.trackingTab == null)
                this.trackingTab = new TrackingTab(); 
            
            if (this.narrativeTab == null)
                this.narrativeTab = new NarrativeTab(); 
            
        }
         
         @FindBy(how = How.ID, using = "nbrCallNo_Year")
         public WebElement uICallNoYearEdit;

         @FindBy(how = How.ID, using = "nbrCallNo_Number")
         public WebElement uICallNoEdit;
         
         @FindBy(how = How.ID, using = "nbrIncidentID_Year")
         public WebElement uICaseNoYearEdit;

         @FindBy(how = How.ID, using = "nbrIncidentID_Number")
         public WebElement uICaseNoEdit;

         @FindBy(how = How.ID, using = "dttmRptDtm_Date_KPIDttmCtrl")
         public WebElement uIDateEdit;

         @FindBy(how = How.XPATH, using = "//table[@id = 'dttmRptDtm_Time']//input")
         public WebElement uITimeEdit;

         @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
         public WebElement uIHandlerK9CodeEdit;

         @FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
         public WebElement uIAddressEdit;

         @FindBy(how = How.ID, using = "drpTypeInc_DropDown")
         public WebElement uITypeOfIncidentComboBox;

         @FindBy(how = How.ID, using = "cmdSave")
         public WebElement uISaveButton;

         @FindBy(how = How.ID, using = "cmdSaveNClose")
         public WebElement uISaveAndCloseButton;

         @FindBy(how = How.ID, using = "nbrCallNo_imgBtn")
         public WebElement uICallNoinfoIcon;
         
         @FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
         public WebElement uIK9HandlerDropdown;
         
         @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
 		public WebElement uILeftSideStatusBar;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Details')]")
  		public WebElement uIDetailsTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Detection')]")
   		public WebElement uIDetectionTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Preventive Action')]")
    		public WebElement uIPreventiveActionTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Names')]")
    		public WebElement uINamesTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
 		public WebElement uISearchTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Tracking')]")
 		public WebElement uITrackingTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Narrative')]")
  		public WebElement uINarrativeTab;
          
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Approval')]")
    		public WebElement uIApprovalTabTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
 		public WebElement uIAttachmentTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'QA Forms')]")
 		public WebElement uIQAFormTabSpan;
         
         @FindBy(how = How.ID, using = "lblApprovalStatus")
    		public WebElement uIreportStatus;
         

        		 @FindBy(how = How.XPATH, using = "(//iframe[contains(@src,'frmPnxGlobalApproval')])[2]")
         		public WebElement uIApprovalTabTabFrame;
        		 
        		 @FindBy(how = How.XPATH, using = "(//iframe[contains(@src,'frmQuestionnaire')])[2]")
          		public WebElement uIQaFormsFrame;
        		 
        		 @FindBy(how = How.ID, using = "cmdDelete")
         		public WebElement uIDeleteIcon ;
              
        		 @FindBy(how = How.ID, using = "adrMainAddress_cmdIncOnAddr")
        	        public WebElement uIAddressIcon;

        		 @FindBy(how = How.ID, using = "tabCE_tmpl0_usrK9Details1_txtDescription")
        		 public WebElement uIDescribeArea;

        			@FindBy(how = How.XPATH, using = "//table[@id='dttmPlant_Time']//input")     		// Added by Abi
        			public WebElement uIPlantEdit;
        			
        			@FindBy(how = How.XPATH, using = "//table[@id='dttmStart_Time']//input")			// Added by Abi
        			public WebElement uIStartEdit;
        			
        			@FindBy(how = How.XPATH, using = "//table[@id='dttmFound_Time']//input")			//Added by Abi
        			public WebElement uIFoundEdit;
        			
        			@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']")						//Added by Abi
        			public WebElement uIFooterStatusBar;

        			 @FindBy(how = How.ID, using = "cmdReset")
        		       public WebElement uIResetButton;

					@FindBy(how = How.XPATH, using = "//iframe[contains(@src,'frmTxtAttachMgrEx')]") // Added by Abi
					public WebElement uIAttachmentTabFrame;
        		
    }
    
   public class DetectionTab
   {
	   public WebDriver driver;
       public DetectionTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this); 
          
      }
       
       @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNarcoticsDetection1_cddDetectionType_Input")
       public WebElement uIDetectionTypeInput;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNarcoticsDetection1_cddDetectionType_DropDown")
       public WebElement uIDetectionTypeRadDropDown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNarcoticsDetection1_cddDetectionType_Arrow")
       public WebElement uIDetectionTypeArrowButton;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNarcoticsDetection1_cddSuspecttype_DropDown")
       public WebElement uIExplosiveDetectionTypeDropDown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNarcoticsDetection1_cddFirearmsDetType_DropDown")
       public WebElement uIFireArmsDetectionTypeDropDown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNarcoticsDetection1_lblDetectionType")
       public WebElement uIDetectionTypeLabel;
       
       
   }
   public class NamesTab
   {
	   public WebDriver driver;
       public NamesTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this); 
          
      }
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_rdoTeam_0")
       public WebElement uIAgencyRadioButton;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_rdoTeam_1")
       public WebElement uIManualAidRadioButton;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_lupPF_CodeValue")
       public WebElement uIPFedit;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_cddActivity_DropDown")
       public WebElement uIParticipantsActivity;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_txtNotes")
       public WebElement uINotesEdit;
   
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_imgAddComments")
       public WebElement uIAddButton;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_imgClearComments")
       public WebElement uIClearButton;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_grdNames")
       public WebElement uINamesTable;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_nmcName_NameType")
       public WebElement uINameTypeEdit;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_nmcName_NameTypeID")
       public WebElement uINameIDEdit;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_nmcName_LastName")
       public WebElement uILastNameEdit;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_nmcName_FirstName")
       public WebElement uIFirstNameEdit;

	 @FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_grdNames")
       public WebElement uINamesGrid;

	@FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_nmcName_imgSrch")
       public WebElement uINameInfoIcon;

	@FindBy(how = How.ID, using = "tabCE_tmpl2_usrK9Names1_rdoTeam_1")
	public WebElement uIMutualAidTeamMemberRadioButton;
       
   }
   
   public class PreventiveActionTab
   {
	   public WebDriver driver;
       public PreventiveActionTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this); 
          
      }
       
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_cddPreventiveActionType_Input")
       public WebElement uITypeOfPreventiveActionInput;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_cddPreventiveActionType_DropDown")
       public WebElement uITypeOfPreventiveActionDropdown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_txtOther")
       public WebElement uIIfOtherEdit;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_cddPAWarning_DropDown")
       public WebElement uIWarningsGivenDropdown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_txtNoGiven")
       public WebElement uINumGiven;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_cddK9Actions_Input")
       public WebElement uIK9ActionInput;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_cddK9Actions_DropDown")
       public WebElement uIK9ActionDropdown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_cddSuspectActions_Input")
       public WebElement uIActionofSuspectInput;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrPreventiveAction1_cddSuspectActions_DropDown")
       public WebElement uIActionofSuspectDropdown;
   }

   
   public class SearchTab
   {
	   public WebDriver driver;
       public SearchTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this); 
          
      }
       
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_cddWarning_DropDown")
       public WebElement uIWarningGiven;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_txtNumber")
       public WebElement uINumGiven;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_cddTypeSearch_DropDown")
       public WebElement uITypeOfSearchDropdown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_cddSubType_DropDown")
       public WebElement uISubTypeDropdown;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_txtBuildingFloor")
       public WebElement uIFloorEdit;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_cddResult_DropDown")
       public WebElement uIResultDropDown;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_txtNotes")
       public WebElement uINotesEdit;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_imgAddSearch")
       public WebElement uIAddButton;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_imgClearSearch")
       public WebElement uIClearButton;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrSearch1_grdSearchData")
       public WebElement uISearchTable;
       
   }
   
   public class TrackingTab
   {
	   public WebDriver driver;
	   
	   public TrackData trackData;
       public TrackingTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this); 
          
          if(trackData==null)
        	  trackData = new TrackData();
      }
       
       @FindBy(how = How.XPATH, using = "//span[contains(text(),'Track Data')]")
       public WebElement uITrackDataTab;
       
       public class TrackData
       {
    	   
    	   public TrackData()
    	   {
    		   driver = Playback.driver;
           PageFactory.initElements(driver, this); 
    	   }
       
       @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_txtLen")
       public WebElement uILengthOfTrack;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_txtTrack")
       public WebElement uITrackSurfaces;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_txtSurface")
       public WebElement uISurfaceCondition;
       
       @FindBy(how = How.XPATH, using = "//table[@id='tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_tmTrackAge_Time']//input")
       public WebElement uIAgeOfTrack;
       
       @FindBy(how = How.XPATH, using = "//table[@id='tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_tmTrackTaken_Time']//input")
       public WebElement uITimeOfTrack;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_cddSuspectLocated_DropDown")
       public WebElement uISubjectLocated;
	   
       @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_chkTracking")
       public WebElement uITrackingTeamCheckbox;
       
       @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTracking1_tabTracking_tmpl0_usrTrackData_txtNotes")
       public WebElement uInotesEdit;
	   
       }
   }
   
	public class NarrativeTab {
		public WebDriver driver;

		public NarrativeTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uINarrativeRichTextEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_lstTextName")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdload")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdAddnew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;
		
		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uITextBody;

		@FindBy(how = How.XPATH, using = "//b")
		public WebElement  uILeftSideStatusBar;

	}

   public class ApprovalTab
   {
   	   public WebDriver driver;
       public ApprovalTab()
       {         
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }
       
       @FindBy(how = How.ID, using = "cmdSave")
       public WebElement uISaveButton;

      @FindBy(how = How.ID, using = "cmdReset")
       public WebElement uIResetButton;
      
      @FindBy(how = How.ID, using = "lstStatus")
      public WebElement uINewActionComboBox;
      
      @FindBy(how = How.ID, using = "dttStatusDttm_Date_KPIDttmCtrl")
      public WebElement uIDateEdit;

     @FindBy(how = How.XPATH, using = "//table[@id='dttStatusDttm_Time']//input")
      public WebElement uITimeEdit;

     @FindBy(how = How.ID, using = "txtComments")
      public WebElement uINotesEdit;
     
     @FindBy(how = How.ID, using = "cddDivision_DropDown")
     public WebElement uIDivisionComboBox;
     
     @FindBy(how = How.ID, using = "cddSection_DropDown")
     public WebElement uISectionComboBox;
     
     
   }
   
   
	public class K9PersonnelEntry
    {
        public WebDriver driver;
        public K9PersonnelEntryPhysicalTab k9PersonnelEntryPhysicalTab;
        public K9PersonnelEntryMedicalTab k9PersonnelEntryMedicalTab;
        public K9PersonnelEntryReportsTab k9PersonnelEntryReportsTab;
        public K9PersonnelEntryTrainingTab k9PersonnelEntryTrainingTab;
        public K9PersonnelEntryCommentsTab k9PersonnelEntryCommentsTab;
        public K9PersonnelEntryAttachmentTab k9PersonnelEntryAttachmentTab;
        public K9PersonnelEntryCertificationsTab k9PersonnelEntryCertificationsTab;
        public K9PersonnelEntryAwardsTab k9PersonnelEntryAwardsTab;
       
		public K9PersonnelEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (k9PersonnelEntryPhysicalTab == null) {
				k9PersonnelEntryPhysicalTab = new K9PersonnelEntryPhysicalTab();
			}

			if (k9PersonnelEntryTrainingTab == null) {
				k9PersonnelEntryTrainingTab = new K9PersonnelEntryTrainingTab();
			}
			if (k9PersonnelEntryMedicalTab == null) {
				k9PersonnelEntryMedicalTab = new K9PersonnelEntryMedicalTab();
			}
			if (k9PersonnelEntryReportsTab == null) {
				k9PersonnelEntryReportsTab = new K9PersonnelEntryReportsTab();
			}
			
			
			if (k9PersonnelEntryCommentsTab == null) {
				k9PersonnelEntryCommentsTab = new K9PersonnelEntryCommentsTab();
			}
			if (k9PersonnelEntryCertificationsTab == null) {
				k9PersonnelEntryCertificationsTab = new K9PersonnelEntryCertificationsTab();
			}
			if (k9PersonnelEntryAwardsTab == null) {
				k9PersonnelEntryAwardsTab = new K9PersonnelEntryAwardsTab();
			}
			
			

		}
		@FindBy(how = How.ID, using = "txtK9Name")
        public WebElement uIK9NameEdit;
		
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Training')]")
        public WebElement uITrainingTab;
       
       
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Physical')]")
        public WebElement uIPhysicalTab;
        
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Medical')]")
        public WebElement uIMedicalTab;
        
        
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'K9 Reports')]")
        public WebElement uIK9ReportsTab;
        
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
        public WebElement uICommentsTab;
        
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Certifications')]")
        public WebElement uICertificationsTab;
        
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Awards')]")
        public WebElement uIAwardsTab;
      
        @FindBy(how = How.ID, using = "chkInactive")
        public WebElement uIInactiveCheckBox;
      
        @FindBy(how = How.ID, using = "lblHandlers")
        public WebElement uIHandlerLabelEdit;
       
        @FindBy(how = How.ID, using = "chkIsActive")
        public WebElement uIK9InactiveCheckbox;
		
        @FindBy(how = How.ID, using = "cddPrimaryFunction_DropDown")
        public WebElement uIK9PrimaryFunctionCombobox;
        
        @FindBy(how = How.ID, using = "imgNameFrontView")
        public WebElement uIK9PersonnelImage;
        
        @FindBy(how = How.ID, using = "txtEmp")
        public WebElement uIK9EmployeeEdit;
        
		@FindBy(how = How.ID, using = "txtEmp")
		public WebElement uIGridHeaderDate;

		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
		public WebElement uIBottomMessage;

        public class K9PersonnelEntryPhysicalTab
        {
        	
        	 public K9PersonnelEntryPhysicalTab()
           	 {
        	driver = Playback.driver;
            PageFactory.initElements(driver, this);
            
           	 }
        	 @FindBy(how = How.ID, using = "tabCE_tmpl0_usrPhysical1_cddBreed_DropDown")
        	 public WebElement uIK9BreedCombobox;
        	 
        	 @FindBy(how = How.ID, using = "tabCE_tmpl0_usrPhysical1_cddSex_DropDown")
        	 public WebElement uIK9SexCombobox;
        	 
        	 @FindBy(how = How.ID, using = "tabCE_tmpl0_usrPhysical1_dtmDOB_KPIDttmCtrl")
        	 public WebElement uIK9DOBEdit;

			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrPhysical1_dtmHire_KPIDttmCtrl")
			public WebElement uIHireDateEdit;
           
        }
       
        public class K9PersonnelEntryMedicalTab
        {
        	public K9PersonnelEntryCurrentTab k9PersonnelEntryCurrentTab;
       	 public K9PersonnelEntryVeterinarianVisitsTab k9PersonnelEntryVeterinarianVisitsTab;
       	 
       	 public K9PersonnelEntryMedicalTab()
       	 {
       		driver = Playback.driver;
            PageFactory.initElements(driver, this);
       		
       		 if (k9PersonnelEntryCurrentTab == null)
       			 k9PersonnelEntryCurrentTab = new K9PersonnelEntryCurrentTab();
       		 
       		 if (k9PersonnelEntryVeterinarianVisitsTab == null)
       			 k9PersonnelEntryVeterinarianVisitsTab = new K9PersonnelEntryVeterinarianVisitsTab();
       		 
       	 }
       	 
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Current')]")
         public WebElement uICurrentTab;
         
         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Veterinarian Visits')]")
         public WebElement uIVeterinarianVisitsTab;
       	 
       	 
       	 
       	 public class K9PersonnelEntryCurrentTab    	 
       	 {
       		 public K9PersonnelEntryCurrentTab()
       		 {
       		 driver = Playback.driver;
             PageFactory.initElements(driver, this);
       		 }
             
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_txtMedications")
            public WebElement uIMedicationsEdit;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_txtDosage")
            public WebElement uIDossageEdit;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_imgAddMedication")
            public WebElement uIMedicationAddButton;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_grdMedication")
            public WebElement uIMedicationResultTable;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_cddVaccine_DropDown")
            public WebElement uIVaccineDropDown;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_dtcIssuedDate_KPIDttmCtrl")
            public WebElement uIIssuedDate;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_dtcNextDueDate_KPIDttmCtrl")
            public WebElement uINextDueDate;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_imgAddVaccine")
            public WebElement uIVaccineAddButton;
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl0_usrCurrent1_grdVacination")
            public WebElement uIVaccineResultTable;
       		
       		
       	 }
       	 
       	 
       	 public class K9PersonnelEntryVeterinarianVisitsTab
       	 {
       		public K9PersonnelEntryVeterinarianVisitsTab()
      		 {
      		 driver = Playback.driver;
      		 PageFactory.initElements(driver, this);
      		 
      		 }
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl1_usrVeteri1_cmdAddNew")
            public WebElement uIAddNewButton; 
       		
       		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl1_usrVeteri1_grdMedicalVeteri")
            public WebElement uIVeterinarianVisitsResultTable;
       		
       		 
       	 }
             	
        }
       
        public class K9PersonnelEntryReportsTab
        {
        	
        	public K9PersonnelEntryReportsTab()
     		 {
     		 driver = Playback.driver;
     		 PageFactory.initElements(driver, this);
     		 
     		 }
        	@FindBy(how = How.ID, using = "cmdAddNew")
            public WebElement uIAddNewButton; 
        	
        	@FindBy(how = How.ID, using = "grdActivity")
            public WebElement uIReportsTable;
        }
       
        public class K9PersonnelEntryTrainingTab
        {
            public WebDriver driver;
            public K9PersonnelEntryTrainingTab()
            {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }
            @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrTraining1_btnAddTraining")
            public WebElement uIAddTrainingButton;
           
            @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrTraining1_grdTraining")
            public WebElement uIAddTrainingTable;
        }
  
       
        public class K9PersonnelEntryCommentsTab
        {
        	   public WebDriver driver;
               public K9PersonnelEntryCommentsTab()
               {
                   driver = Playback.driver;
                   PageFactory.initElements(driver, this);
               }
               @FindBy(how = How.ID, using = "btnAddNotes")
               public WebElement uIAddNotesButton;
              
               @FindBy(how = How.ID, using = "grdLog_ctl00_lblEnteredBy")
               public WebElement uIEnteredOfficer;
               
               @FindBy(how = How.XPATH, using = "//table[@id='grdLog']//tr[2]//td//tr//td")
               public WebElement uIEnteredRemarks;
               
             
               
        }
       
        public class K9PersonnelEntryAttachmentTab
        {
           
        }
       
        public class K9PersonnelEntryCertificationsTab
        {
        	 public WebDriver driver;
             public K9PersonnelEntryCertificationsTab()
             {
                 driver = Playback.driver;
                 PageFactory.initElements(driver, this);
             }
             
             @FindBy(how = How.ID, using = "cddCertification_DropDown")
             public WebElement uICertificationDropdown;
           
             @FindBy(how = How.ID, using = "txtCertificateNo")
             public WebElement uICertificationNoEdit;
           
             @FindBy(how = How.ID, using = "cddCertificateBody_DropDown")
             public WebElement uICertifiyingBodyDropdown;
             
             @FindBy(how = How.ID, using = "dttmCertified_KPIDttmCtrl")
             public WebElement uIDateCertified;
             
             @FindBy(how = How.ID, using = "dtmExpiration_KPIDttmCtrl")
             public WebElement uIExpireDate;
             
             @FindBy(how = How.ID, using = "adrLocation_txtFrom")
             public WebElement uILocationEdit;
             
             @FindBy(how = How.ID, using = "txtComments")
             public WebElement uICommentsEdit;
             
             @FindBy(how = How.ID, using = "cmdAdd")
             public WebElement uIAddButton;
             
             @FindBy(how = How.ID, using = "cmdClear")
             public WebElement uIClear;
             
             @FindBy(how = How.ID, using = "grdCertification")
             public WebElement uICertificationTable;
             
             @FindBy(how = How.ID, using = "cmdSave")
             public WebElement uISaveButton;
             
             @FindBy(how = How.ID, using = "cmdRefresh")
             public WebElement uIRefreshButton;
             
        }
        
       
        public class K9PersonnelEntryAwardsTab
        {
        	 public WebDriver driver;
             public K9PersonnelEntryAwardsTab()
             {
                 driver = Playback.driver;
                 PageFactory.initElements(driver, this);
             }
             
        	
        	@FindBy(how = How.ID, using = "cmdSave")
            public WebElement uISaveButton;
            
            @FindBy(how = How.ID, using = "cmdRefresh")
            public WebElement uIRefreshButton;
           
            @FindBy(how = How.ID, using = "grdAwards")
            public WebElement uIAwardsTable;
            
            @FindBy(how = How.ID, using = "txtAward")
            public WebElement uIAwardEdit;
            
            @FindBy(how = How.ID, using = "dttmAwarded_KPIDttmCtrl")
            public WebElement uIDateAwarded;
            
            @FindBy(how = How.ID, using = "txtAwardingBody")
            public WebElement uIAwardingBodyEdit;
            
            @FindBy(how = How.ID, using = "txtComments")
            public WebElement uICommentsEdit;
            
            @FindBy(how = How.ID, using = "cmdAdd")
            public WebElement uIAddButton;
            
            @FindBy(how = How.ID, using = "cmdClear")
            public WebElement uIClear;
            
        }
       
    }

	public class K9Personnel
    {
      public WebDriver driver;
          public K9Personnel()
          {
              driver = Playback.driver;
              PageFactory.initElements(driver, this);
          }
        
          @FindBy(how = How.ID, using = "lstJuris")
          public WebElement uIJurisDropdown;
        
          @FindBy(how = How.ID, using = "txtK9Name")
          public WebElement uIK9NameDropDown;
        
          @FindBy(how = How.ID, using = "cddPrimaryFun_DropDown")
          public WebElement uIPrimaryFunctionDropDown;
         
          @FindBy(how = How.ID, using = "lupOffPartner_CodeValue")
          public WebElement uIHandlerLookupEdit;
        
          @FindBy(how = How.ID, using = "cddSex_DropDown")
          public WebElement uISexDropDown;
        
          @FindBy(how = How.ID, using = "cddBreed_DropDown")
          public WebElement uIBreedDropDown;
        
          @FindBy(how = How.ID, using = "chkIsActive")
          public WebElement uIActiveCheckbox;
        
          @FindBy(how = How.ID, using = "cmdSearch")
          public WebElement uISearchButton;
        
          @FindBy(how = How.XPATH, using = "//span[contains(text(),'Legacy K9')]")
          public WebElement uILegacyK9Button;
        
          @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
          public WebElement uIAddNewSearchButton;
                                         
          @FindBy(how = How.ID, using = "grdPersonnelSearch")
          public WebElement uISearchResultTable;
        
          @FindBy(how = How.XPATH, using = ".//table/tbody/tr/td[contains(text(),'AJAX')]")
          public WebElement uIAJAXinGrid;

		@FindBy(how = How.ID, using = "lupOffPartner_imgBtn")
          public WebElement uIHandlerLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_usrMedical1_tabMedical_tmpl1_usrVeteri1_cmdAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;
      }
	
	
	public class K9Training {

		public WebDriver driver;

		public K9Training() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropDown;

		@FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
		public WebElement uIK9HandlerDropDown;

		@FindBy(how = How.ID, using = "cddTrainer_DropDown")
		public WebElement uIK9TrainerComboBox;

		@FindBy(how = How.ID, using = "imgLoadK9")
		public WebElement K9HandlerInfoIcon;

		@FindBy(how = How.ID, using = "cddFacility_DropDown")
		public WebElement uIFacilityComboBox;

		@FindBy(how = How.XPATH, using = "//input[@id='dtmFromDate_KPIDttmCtrl']")
		public WebElement uITrainingFromDateEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='dtmToDate_KPIDttmCtrl']")
		public WebElement uITrainingFromTimeEdit;

		@FindBy(how = How.ID, using = "lstTrainingApprovalStatus")
		public WebElement uIApprovalStatusComboBox;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "rdoTraining_0")
		public WebElement uITrainingDetailRadioButton;

		@FindBy(how = How.ID, using = "rdoTraining_1")
		public WebElement uITrainingSummaryRadioButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Add New']")
		public WebElement uIAddNewLink;

		@FindBy(how = How.XPATH, using = "//input[@id='dtmFromDate_KPIDttmCtrl']")
		public WebElement uITrainingToTimeEdit;

		@FindBy(how = How.ID, using = "grdTraineDetail")
		public WebElement uIK9TrainingTable;

	}

	public class K9TrainingEntry {
		public K9TrainingEntryActivityTab k9TrainingEntryActivityTab;
		public K9TrainingEntryApprovalTab k9TrainingEntryApprovalTab;
		public WebDriver driver;

		public K9TrainingEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (k9TrainingEntryActivityTab == null)
				k9TrainingEntryActivityTab = new K9TrainingEntryActivityTab();

			if (k9TrainingEntryApprovalTab == null)
				k9TrainingEntryApprovalTab = new K9TrainingEntryApprovalTab();
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropDown;

		@FindBy(how = How.ID, using = "ddlHandler_DropDown")
		public WebElement uIK9HandlerDropDown;

		@FindBy(how = How.ID, using = "numTraining_Year")
		public WebElement uIK9TrainingYearEdit;

		@FindBy(how = How.ID, using = "numTraining_Number")
		public WebElement uIK9TrainingNumberEdit;

		@FindBy(how = How.ID, using = "cddFacility_DropDown")
		public WebElement uIK9FacilityDropDown;

		@FindBy(how = How.ID, using = "cddInstructor_DropDown")
		public WebElement uIK9InstructorDropDown;

		@FindBy(how = How.ID, using = "dttmFrom_KPIDttmCtrl")
		public WebElement uIK9FromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmFromTime_Time']//input")
		public WebElement uIK9FromTimeEdit;

		@FindBy(how = How.ID, using = "dttmTo_KPIDttmCtrl")
		public WebElement uIK9ToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmToTime_Time']//input")
		public WebElement uIK9ToTimeEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "imgLoadK9")
		public WebElement uIK9HandlerInfoIcon;

		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']")
		public WebElement uIFooterStatus;

		@FindBy(how = How.XPATH, using = "//span[text()='Attachment']")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Approval']")
		public WebElement uIApprovalTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Activity']")
		public WebElement uIActivityTab;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;
		
		@FindBy(how = How.ID, using = "imgNameFrontView")
        public WebElement uIK9PersonnelImage;
		
		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIStatusLabel;
		
			@FindBy(how = How.XPATH, using = "//*[@mkr='outerTbl.hdn']")
		public WebElement uIK9TrainingEntryTable;

		public class K9TrainingEntryActivityTab {
			WebDriver driver;

			public K9TrainingEntryActivityTab() {

				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrActivity1_btnAddComment")
			public WebElement uIAddNewActivityButton;

			@FindBy(how = How.ID, using = "tabCE_tmpl0_usrActivity1_grdTraining")
			public WebElement uIActivityTable;

		}

		public class K9TrainingEntryApprovalTab {
			WebDriver driver;

			public K9TrainingEntryApprovalTab() {

				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "lstStatus")
			public WebElement uINewActionComboBox;

			@FindBy(how = How.ID, using = "lupPFID_CodeValue")
			public WebElement uIByEdit;

			@FindBy(how = How.XPATH, using = "//input[@id='dttStatusDttm_Date_KPIDttmCtrl']")
			public WebElement uIDateEdit;

			@FindBy(how = How.XPATH, using = "//table[@id='dttStatusDttm_Time']//input")
			public WebElement uITimeEdit;

			@FindBy(how = How.ID, using = "cddDivision_DropDown")
			public WebElement uIDivisionComboBox;

			@FindBy(how = How.ID, using = "cddSection_DropDown")
			public WebElement uISectionComboBox;

			@FindBy(how = How.ID, using = "cddSquad_DropDown")
			public WebElement uISquadComboBox;

			@FindBy(how = How.ID, using = "lupSupervisor_CodeValue")
			public WebElement uISupervisorCodeEdit;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;

			@FindBy(how = How.ID, using = "cmdReset")
			public WebElement uIResetButton;

			@FindBy(how = How.XPATH, using = "//table[@id='listMsg']")
			public WebElement uIHistoryGrid;

		}
	}
	 public class K9TrainingAid{
     	
    	 public WebDriver driver;

            public K9TrainingAid() {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }
    	
            @FindBy(how = How.ID, using = "lstJuris")
            public WebElement uIJurisDropDown;
            
            @FindBy(how = How.ID, using = "txtAid")
            public WebElement uIAidNoEdit;
                        
            @FindBy(how = How.ID, using = "cddAidType_Input")
            public WebElement uIAidTypeInput;
        
            @FindBy(how = How.ID, using = "cddAidType_DropDown")
            public WebElement uIAidTypeDropdown;
            
            @FindBy(how = How.ID, using = "cmdSave")
            public WebElement uISaveButton;
            
            @FindBy(how = How.ID, using = "cmdSaveNClose")
            public WebElement uISaveAndCloseButton;
          
		    @FindBy(how = How.ID, using = "pltVehicle_imgBtn")
            public WebElement uIVehicleInfoIcon;
            
            @FindBy(how = How.XPATH, using = "//b[text()='1003 - Update Successful']")
	         public WebElement uIUpdateSuccessfulLable;

            @FindBy(how = How.ID, using = "cddSearch_DropDown")		//Added by Abi
    		public WebElement uISearchDropdown;
    		@FindBy(how = How.ID, using = "txtBurried")				// Added by Abi
    		public WebElement uIBurriedEdit;
    		
    		@FindBy(how = How.ID, using = "txtElevation")			// Added by Abi
    		public WebElement uIElevationEdit;
    		
    		@FindBy(how = How.ID, using = "CddResult_DropDown")		// Added by Abi
    		public WebElement uIResultDropdown;
    		
    		@FindBy(how = How.XPATH, using = "//table[@id='dttmPlant_Time']//input")     		// Added by Abi
    		public WebElement uIPlantEdit;
    		
    		@FindBy(how = How.XPATH, using = "//table[@id='dttmStart_Time']//input")			// Added by Abi
    		public WebElement uIStartEdit;
    		
    		@FindBy(how = How.XPATH, using = "//table[@id='dttmFound_Time']//input")			//Added by Abi
    		public WebElement uIFoundEdit;
    		
    		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']")						//Added by Abi
    		public WebElement uIFooterStatusBar;
    		@FindBy(how = How.XPATH, using = "//select[@id='cddK9nHandler_DropDown']//option[@selected='selected']")	//Added by Abi
    		public WebElement uIK9HandlerDropdown;
          
    }
	
	public class K9ActivityEntry {
        public DetailsTab detailsTab;
        public ObjectivesTab objectivesTab;
        public CommentsTab commentsTab;
        public ParticipantsTab participantsTab;
        public TrainingAidsTab trainingAidsTab;
        public WebDriver driver;


        public K9ActivityEntry() {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);

            if (detailsTab == null)
                detailsTab = new DetailsTab();

            if (objectivesTab == null)
                objectivesTab = new ObjectivesTab();

            if (commentsTab == null)
                commentsTab = new CommentsTab();
            
            if (participantsTab == null)
            	participantsTab = new ParticipantsTab();
            
            if (trainingAidsTab == null)
            	trainingAidsTab = new TrainingAidsTab();
        }

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;
        
        @FindBy(how = How.ID, using = "cddTrainingCategory_DropDown")
        public WebElement uIK9TrainingCategoryDropdown;
        
        @FindBy(how = How.ID, using = "cddTrainingType_DropDown")
        public WebElement uIK9TrainingTypeDropdown;

        @FindBy(how = How.ID, using = "cddSubType_DropDown")
        public WebElement uIK9SubTypeDropdown;

        @FindBy(how = How.ID, using = "cddK9nHandler_DropDown")
        public WebElement uIK9HandlerComboBox;

        @FindBy(how = How.XPATH, using = "//span[text()='Details']")
        public WebElement uIDetailsTab;
        
        @FindBy(how = How.XPATH, using = "//span[text()='Objectives']")
        public WebElement uIObjectivesTab;

        @FindBy(how = How.XPATH, using = "//span[text()='Comments']")
        public WebElement uICommentsTab;
        
        @FindBy(how = How.XPATH, using = "//span[text()='Training Aids']")
        public WebElement uITrainingAidsTab;

        @FindBy(how = How.XPATH, using = "//span[text()='Participants']")
        public WebElement uIParticipantsTab;

        @FindBy(how = How.XPATH, using = "//span[text()='Track & Map']")
        public WebElement uITrackAndMapTab;
        
        @FindBy(how = How.XPATH, using = "//td[@class='statusBar']")
        public WebElement uIFooterStatusLabel;

        public class DetailsTab {

            public WebDriver driver;

            public DetailsTab() {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }

            @FindBy(how = How.ID, using = "tabAE_tmpl0_usrDetails1_dttmFrom_KPIDttmCtrl")
            public WebElement uIDetailsFromDateEdit;

            @FindBy(how = How.XPATH, using = "//table[@id = 'tabAE_tmpl0_usrDetails1_dttmFromTime_Time']//input")
            public WebElement uIDetailsFromTimeEdit;

            @FindBy(how = How.ID, using = "tabAE_tmpl0_usrDetails1_dttmTo_KPIDttmCtrl")
            public WebElement uIDetailsToDateEdit;

            @FindBy(how = How.XPATH, using = "//table[@id = 'tabAE_tmpl0_usrDetails1_dttmToTime_Time']//input")
            public WebElement uIDetailsToTimeEdit;

            @FindBy(how = How.XPATH, using = "//table[@id = 'tabAE_tmpl0_usrDetails1_dttmSchTime_Time']//input")
            public WebElement uIDetailsTabscheduledTimeEdit;

            @FindBy(how = How.ID, using = "tabAE_tmpl0_usrDetails1_dttmSchDate_KPIDttmCtrl")
            public WebElement uIDetailsTabscheduledDateEdit;

			 @FindBy(how = How.ID, using = "tabAE_tmpl0_usrDetails1_txtDescribeArea")
			 public WebElement uIDescribeArea;


        }
        public class TrainingAidsTab
        {
        public TrainingAidsTab() {
			 driver = Playback.driver;
            PageFactory.initElements(driver, this);
		 }
		 
		
		 
		 //tabAE_tmpl3_usrTrainingAid1_txtHides		HidesVerifyByEdit
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_txtHides")
           public WebElement uIHidesVerifyByEdit;
		 
		 //tabAE_tmpl3_usrTrainingAid1_txtFalseAlerts		FalseAlertsEdit
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_txtFalseAlerts")
           public WebElement uIFalseAlertsEdit;
		 
		 //tabAE_tmpl3_usrTrainingAid1_chkBlindSearch		BlindSearchCheckbox
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_chkBlindSearch")
           public WebElement uIBlindSearchCheckbox;
		 
		 //tabAE_tmpl3_usrTrainingAid1_chkDoubleBlind		DoubleBlindSearchbox
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_chkDoubleBlind")
           public WebElement uIDoubleBlindSearchbox;
		 
		 //tabAE_tmpl3_usrTrainingAid1_chkAidAccounted		AllAidCheckbox
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_chkAidAccounted")
           public WebElement uIAllAidCheckbox;
		 
		 //tabAE_tmpl3_usrTrainingAid1_chkAidLost			AnyTrainingCheckbox
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_chkAidLost")
           public WebElement uIAnyTrainingCheckbox;
		 
		 //tabAE_tmpl3_usrTrainingAid1_btnAddComment		AddAidButton
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_btnAddComment")
           public WebElement uIAddAidButton;
		 
		 //tabAE_tmpl3_usrTrainingAid1_grdTrainingAid		TrainingAidTable
		 @FindBy(how = How.ID, using = "tabAE_tmpl3_usrTrainingAid1_grdTrainingAid")
           public WebElement uITrainingAidTable;
	 }
	 
        public class ParticipantsTab{
   		 
   		 public WebDriver driver;
   		 public ParticipantsTab() {
   			 driver = Playback.driver;
                PageFactory.initElements(driver, this);
   		 
   	 }
   		 
   		 //tabAE_tmpl4_usrParticipants1_rdoTeam_0
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_rdoTeam_0")
	            public WebElement uIAgencyRadioButton;
   		 
   		 //tabAE_tmpl4_usrParticipants1_rdoTeam_1
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_rdoTeam_1")
	            public WebElement uIMutualAidTeamMemberRadioButton;
   		 
   		 //tabAE_tmpl4_usrParticipants1_lupPF_CodeValue		PFCodeEdit
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_lupPF_CodeValue")
	            public WebElement uIPFCodeEdit;
   		 
   		 //tabAE_tmpl4_usrParticipants1_lupPF_imgBtn		PFLookup
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_lupPF_imgBtn")
	            public WebElement uIPFLookupButton;
   		 
   		 //tabAE_tmpl4_usrParticipants1_cddActivity_DropDown		ParticipantsActivityDropdown
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_cddActivity_DropDown")
	            public WebElement uIParticipantsActivityDropdown;
   		 
   		 //tabAE_tmpl4_usrParticipants1_txtNotes		NotesEdit
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_txtNotes")
	            public WebElement uINotesEdit;
   		 
   		 //tabAE_tmpl4_usrParticipants1_imgAddComments	AddButton
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_imgAddComments")
	            public WebElement uIAddButton;
   		 
   		 //tabAE_tmpl4_usrParticipants1_imgClearComments		ClearButton
   		 @FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_imgClearComments")
	            public WebElement uIClearButton;

   		@FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_nmcName_NameType")
   		public WebElement uINameTypeEdit;

   		@FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_nmcName_NameTypeID")
   		public WebElement uINameIDEdit;

   		@FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_grdNames")
   		public WebElement uIParticipantsResultTable;

   		@FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_nmcName_imgSrch")
   		public WebElement uIAddressIBubbleIcon;

   		@FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_lupPF_cmdIncOnAddr")
   		public WebElement uIPFIBubbleIcon;

   		@FindBy(how = How.ID, using = "tabAE_tmpl4_usrParticipants1_cddActivity_DropDown")
		public WebElement uIParticipantsActivityComboBox;

   	 }
   	 
   	 public class TracksAndMapsTab{
   		 
   		 public WebDriver driver;
   		 public TrackDataTab trackDataTab;
   		 public LayTrackTab layTrackTab;
   		 public TrackK9Tab trackK9Tab;
   		 public TracksAndMapsTab() {
   			 driver = Playback.driver;
                PageFactory.initElements(driver, this);
                
                if (trackDataTab == null)
               	 trackDataTab = new TrackDataTab();
                
                if (layTrackTab == null)
               	 layTrackTab = new LayTrackTab();
                
                if (trackK9Tab == null)
               	 trackK9Tab = new TrackK9Tab();
   		 
   	 }
   		 
   	 public class TrackDataTab{
   		 
   		 public WebDriver driver;
   		 public TrackDataTab() {
   			 driver = Playback.driver;
                PageFactory.initElements(driver, this);
   		 
   	 }
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtLen		LengthOfTrackEdit
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtLen")
	            public WebElement uILengthOfTrackEdit;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_cddMeasurement_DropDown		LengthOfTrackDropdown
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_cddMeasurement_DropDown")
	            public WebElement uILengthOfTrackDropdown;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtTrack		TrackSurfacesEdit
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtTrack")
	            public WebElement uITrackSurfacesEdit;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtSurface		GroundSurfaceConditionEdit	
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtSurface")
	            public WebElement uIGroundSurfaceConditionEdit;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_tmTrackAge_Time	ApproxAgeOfTrackTimeEdit
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_tmTrackAge_Time")
	            public WebElement uIApproxAgeOfTrackTimeEdit;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_tmTrackTaken_Time		TimeTakenToTrackEdit
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_tmTrackTaken_Time")
	            public WebElement uITimeTakenToTrackEdit;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_cddSuspectLocated_DropDown		SuspectObjectLocatedDropdown
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_cddSuspectLocated_DropDown")
	            public WebElement uISuspectObjectLocatedDropdown;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_chkTracking		ByTrackingTeamCheckbox
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_chkTracking")
	            public WebElement uIByTrackingTeamCheckbox;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_chkPerimeter		ByPerimeterCheckbox
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_chkPerimeter")
	            public WebElement uIByPerimeterCheckbox;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_chkOtherMeans		ByOtherMeansCheckbox
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_chkOtherMeans")
	            public WebElement uIByOtherMeansCheckbox;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtNotes		NotesEdit
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl0_usrTrackData_txtNotes")
	            public WebElement uINotesEdit;
   		 
   	 }
   	 
   	 public class LayTrackTab{
   		 
   		 public WebDriver driver;
   		 public LayTrackTab() {
   			 driver = Playback.driver;
                PageFactory.initElements(driver, this);
   		 
   	 }
   		 //pac-input		EnterLocationEdit
   		 @FindBy(how = How.ID, using = "pac-input")
	            public WebElement uIEnterLocationEdit;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl1_usrMaptrack_cmdMapLayer		AddTrackButton
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl1_usrMaptrack_cmdMapLayer")
	            public WebElement uIAddTrackButton;
   		 
   	 }
   		
   	 public class TrackK9Tab{
   		 
   		 public WebDriver driver;
   		 public TrackK9Tab() {
   			 driver = Playback.driver;
                PageFactory.initElements(driver, this);
   		 
   	 }
   		 
   		 //pac-inputK9		EnterLocationEdit
   		 @FindBy(how = How.ID, using = "pac-inputK9")
	            public WebElement uIEnterLocationEdit;
   		 
   		 //tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl2_usrMapTrackK9_cmdMapLayerK9		AddTrackButton	
   		 @FindBy(how = How.ID, using = "tabAE_tmpl5_usrTrackMap1_tabTrackMap_tmpl2_usrMapTrackK9_cmdMapLayerK9")
	            public WebElement uIAddTrackButton;
   	 }
   		 
   		 
   	 }
   	
   	
   
        public class ObjectivesTab {

            public WebDriver driver;
            public ObjectivesTab() {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }


            @FindBy(how = How.ID, using = "tabAE_tmpl1_usrObjectives1_rteKPITxt_contentIframe")
            public WebElement uITextArea;

        }

 
        public class CommentsTab {

            public WebDriver driver;

            public CommentsTab() {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }

            @FindBy(how = How.ID, using = "tabAE_tmpl2_usrComments1_rteKPITxtHandler_contentIframe")
            public WebElement uIHandlerText;

            @FindBy(how = How.ID, using = "tabAE_tmpl2_usrComments1_rteKPITxtTrainer_contentIframe")
            public WebElement uITrainerText;

        }
    }
	public class K9Reports
    {
        public WebDriver driver;

        public K9Reports() {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "grdK9ReportSearch")
        public WebElement uIK9ReportSearchTable;
        
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewButton;
        
    }
}
