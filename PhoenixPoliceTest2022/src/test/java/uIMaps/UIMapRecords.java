package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapRecords {

	public CallEntry callEntry;
	public CallSearch callSearch;
	public CaseSearch caseSearch;
	public WalkInEntry walkInEntry;
	public CaseUpdate caseUpdate;
	public ReportManager reportManager;
	public ReportStatus reportStatus;
	public RedactStatus redactStatus;
	public ReportSearch reportSearch;
	public ACD aCD;
	public FTCScreen fTCScreen;
	public CaseNames caseNames;
	public NameVictim nameVictim;
	public VictimOffender victimOffender;
	public DomesticViolence domesticViolence;
	public LeokaScreen leokaScreen;
	public Questionnarie questionnarie;
	public QuestionDataEntry questionDataEntry;
	public CaseData caseData;
	public CaseVehicle caseVehicle;
	public CaseSuspect caseSuspect;
	public Narrative narrative;
	public IBRSearch iBRSearch;
	public DVEntry dVEntry;
	public DVSearch dVSearch;
	public UOFEntry uOFEntry;
	public UOFSearchHelpWindow uOFSearchHelpWindow;
	public CaseUnits caseUnits;
	public UOFSearch uOFSearch;
	public UCR uCR;
	public ALCScreen aLCScreen;
	public OpenRecordsRequest openRecordsRequest;
	public OpenRecordRequestEntry openRecordRequestEntry;
	public ReportStatusScreenTab reportStatusScreenTab;
	public BoloScreenTab boloScreenTab;
	public ComplaintEntry complaintEntry;
	public PursuitCaseEntry pursuitCaseEntry;
	public IBRSubmissionScreenTab iBRSubmissionScreenTab;
	public IBRSubmissionEntry iBRSubmissionEntry;
	public ReportRelatedToPF reportRelatedToPF;
	public VehicleProfile vehicleProfile;
	public ProfileSearch profileSearch;
	public ViewTextFileEntry viewTextFileEntry;
	public OpenRecordsRequestHelpWindow openRecordsRequestHelpWindow;
	public NIBRSCheck nIBRSCheck;
	public UOFDetail uOFDetail;
	public ReportStatusNarrative reportStatusNarrative;
	 public ReportStatusForRedact reportStatusForRedact;
	    public ReportStatusViewRedactReport reportStatusViewRedactReport;
	    public RedactExpungement redactExpungement;
	    public UseOfForceReportEntry useOfForceReportEntry;
		 public RepositoryEntry repositoryEntry;
	    public PursuitReportEntry pursuitReportEntry;
	public DirectReportEntry directReportEntry;
	public UnitHistorySearch unitHistorySearch;
	    
	    public SuspectSearch suspectSearch;
	public UIMapRecords() {
		if ((this.callEntry == null)) {
			this.callEntry = new CallEntry();
		}
		if ((this.callSearch == null)) {
			this.callSearch = new CallSearch();
		}
		if ((this.caseSearch == null)) {
			this.caseSearch = new CaseSearch();
		}
		if ((this.uCR == null)) {
			this.uCR = new UCR();
		}
		if ((this.walkInEntry == null)) {
			this.walkInEntry = new WalkInEntry();
		}
		if ((this.caseUpdate == null)) {
			this.caseUpdate = new CaseUpdate();
		}
		if ((this.reportManager == null)) {
			this.reportManager = new ReportManager();
		}
		if ((this.reportStatus == null)) {
			this.reportStatus = new ReportStatus();
		}

		if ((this.redactStatus == null)) {
			this.redactStatus = new RedactStatus();
		}
		if ((this.reportSearch == null)) {
			this.reportSearch = new ReportSearch();
		}
		if ((this.aCD == null)) {
			this.aCD = new ACD();
		}
		if ((this.fTCScreen == null)) {
			this.fTCScreen = new FTCScreen();
		}
		if ((this.caseNames == null)) {
			this.caseNames = new CaseNames();
		}
		if ((this.nameVictim == null)) {
			this.nameVictim = new NameVictim();
		}
		if ((this.victimOffender == null)) {
			this.victimOffender = new VictimOffender();
		}
		if ((this.caseData == null)) {
			this.caseData = new CaseData();
		}
		if ((this.caseVehicle == null)) {
			this.caseVehicle = new CaseVehicle();
		}
		if ((this.caseSuspect == null)) {
			this.caseSuspect = new CaseSuspect();
		}
		if ((this.domesticViolence == null)) {
			this.domesticViolence = new DomesticViolence();
		}
		if ((this.leokaScreen == null)) {
			this.leokaScreen = new LeokaScreen();
		}
		if ((this.questionnarie == null)) {
			this.questionnarie = new Questionnarie();
		}
		if ((this.questionDataEntry == null)) {
			this.questionDataEntry = new QuestionDataEntry();
		}

		if ((this.narrative == null)) {
			this.narrative = new Narrative();
		}
		if ((this.iBRSearch == null)) {
			this.iBRSearch = new IBRSearch();
		}

		if ((this.dVEntry == null)) {
			this.dVEntry = new DVEntry();
		}
		if ((this.dVSearch == null)) {
			this.dVSearch = new DVSearch();
		}
		if ((this.uOFEntry == null)) {
			this.uOFEntry = new UOFEntry();
		}
		if ((this.uOFSearchHelpWindow == null)) {
			this.uOFSearchHelpWindow = new UOFSearchHelpWindow();
		}
		if ((this.uOFSearch == null)) {
			this.uOFSearch = new UOFSearch();
		}
		if ((this.caseUnits == null)) {
			this.caseUnits = new CaseUnits();
		}
		if ((this.aLCScreen == null)) {
			this.aLCScreen = new ALCScreen();
		}
		if ((this.reportStatusScreenTab == null)) {
			this.reportStatusScreenTab = new ReportStatusScreenTab();
		}
		if ((this.boloScreenTab == null)) {
			this.boloScreenTab = new BoloScreenTab();
		}

		if ((this.openRecordsRequest == null)) {
			this.openRecordsRequest = new OpenRecordsRequest();
		}
		if ((this.openRecordRequestEntry == null)) {
			this.openRecordRequestEntry = new OpenRecordRequestEntry();
		}
		if ((this.complaintEntry == null)) {
			this.complaintEntry = new ComplaintEntry();
		}
		if ((this.pursuitCaseEntry == null)) {
			this.pursuitCaseEntry = new PursuitCaseEntry();
		}
		if ((this.iBRSubmissionScreenTab == null)) {
			this.iBRSubmissionScreenTab = new IBRSubmissionScreenTab();
		}
		if ((this.iBRSubmissionEntry == null)) {
			this.iBRSubmissionEntry = new IBRSubmissionEntry();
		}
		if ((this.vehicleProfile == null)) {
			this.vehicleProfile = new VehicleProfile();
		}
		if ((this.profileSearch == null)) {
			this.profileSearch = new ProfileSearch();
		}
		if ((this.viewTextFileEntry == null)) {
			this.viewTextFileEntry = new ViewTextFileEntry();
		}
		if ((this.reportRelatedToPF == null)) {
			this.reportRelatedToPF = new ReportRelatedToPF();
		}

		if ((this.nIBRSCheck == null)) {
			this.nIBRSCheck = new NIBRSCheck();
		}
		if ((this.uOFDetail == null)) {
			this.uOFDetail = new UOFDetail();
		}

		if ((this.reportStatusNarrative == null)) {
			this.reportStatusNarrative = new ReportStatusNarrative();
		}
		
		 if ((this.reportStatusForRedact == null))
         {
             this.reportStatusForRedact = new ReportStatusForRedact();
         }
         
         if ((this.redactExpungement == null))
         {
             this.redactExpungement = new RedactExpungement();
         }
         if ((this.reportStatusViewRedactReport == null))
         {
             this.reportStatusViewRedactReport = new ReportStatusViewRedactReport();
         }
         if ((this.useOfForceReportEntry == null))
         {
             this.useOfForceReportEntry = new UseOfForceReportEntry();
         }
		  if ((this.repositoryEntry == null)) {
 			this.repositoryEntry = new RepositoryEntry();
 		}

 		if ((this.pursuitReportEntry == null)) {
 			this.pursuitReportEntry = new PursuitReportEntry();
 		}
         if ((this.directReportEntry == null)) {
 			this.directReportEntry = new DirectReportEntry();
		}
 		if ((this.suspectSearch == null)) {
 			this.suspectSearch = new SuspectSearch();
		}
 		if ((this.unitHistorySearch == null)) {
 			this.unitHistorySearch = new UnitHistorySearch();
		}
 		
	}

	public class CallEntry {
		public CallEntryMainTab callEntryMainTab;
		public CallEntryNamesTab callEntryNamesTab;
		public NotesTab notesTab;
		public CallSummaryTab callSummaryTab;
		public VehicleTab vehicleTab;
		public CallEntryUnitsTab callEntryUnitsTab;
		public CallEntryRelatedCallsTab callEntryRelatedCallsTab;
		public CallEntrySuspectsTab callEntrySuspectsTab;
		public CallEntryMapTab callEntryMapTab;
		public CallEntryRequestTab callEntryRequestTab;
		public CallEntryEditTab callEntryEditTab;
		public CallEntryANCATab callEntryANCATab;
		public CallEntryDispositionTab callEntryDispositionTab;
		public CallEntryApprovalTab callEntryApprovalTab;
		public WebDriver driver;

		public CallEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.callEntryMainTab == null)) {
				this.callEntryMainTab = new CallEntryMainTab();
			}
			if ((this.callEntryNamesTab == null)) {
				this.callEntryNamesTab = new CallEntryNamesTab();
			}

			if ((this.notesTab == null)) {
				this.notesTab = new NotesTab();
			}

			if ((this.callSummaryTab == null)) {
				this.callSummaryTab = new CallSummaryTab();
			}

			if ((this.vehicleTab == null)) {
				this.vehicleTab = new VehicleTab();
			}
			if ((this.callEntryUnitsTab == null)) {
				this.callEntryUnitsTab = new CallEntryUnitsTab();
			}
			if ((this.callEntryRelatedCallsTab == null)) {
				this.callEntryRelatedCallsTab = new CallEntryRelatedCallsTab();
			}
			if ((this.callEntrySuspectsTab == null)) {
				this.callEntrySuspectsTab = new CallEntrySuspectsTab();
			}
			if ((this.callEntryMapTab == null)) {
				this.callEntryMapTab = new CallEntryMapTab();
			}
			if ((this.callEntryRequestTab == null)) {
				this.callEntryRequestTab = new CallEntryRequestTab();
			}
			if ((this.callEntryEditTab == null)) {
				this.callEntryEditTab = new CallEntryEditTab();
			}
			if ((this.callEntryANCATab == null)) {
				this.callEntryANCATab = new CallEntryANCATab();
			}
			if ((this.callEntryApprovalTab == null)) {
				this.callEntryApprovalTab = new CallEntryApprovalTab();
			}
			if ((this.callEntryDispositionTab == null)) {
				this.callEntryDispositionTab = new CallEntryDispositionTab();
			}

		}

		@FindBy(how = How.ID, using = "nbrCallNumber_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNumber_Number")
		public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNumber_imgBtn")
		public WebElement uICaseInfoIcon;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "lupInitialCFS_CodeValue")
		public WebElement uIInitialCFSEdit;

		@FindBy(how = How.ID, using = "cddRcvSource_imgBtn")
		public WebElement uIReceivedSourceSearchButton;

		@FindBy(how = How.ID, using = "cddRcvSource_CodeValue")
		public WebElement uIReceivedSourceEdit;

		@FindBy(how = How.ID, using = "addrRprtdLoc_txtFrom")
		public WebElement uIReportedLocationEdit;

		@FindBy(how = How.ID, using = "lblCommanName")
		public WebElement uIReportedLocationLabel;

		@FindBy(how = How.ID, using = "addrRprtdLoc_chkVerify")
		public WebElement uIReportedLocationVerifyCheckbox;

		@FindBy(how = How.ID, using = "chkGenrateCaseNbr")
		public WebElement uIGenerateCheckbox;

		@FindBy(how = How.ID, using = "dttmReported_Date_KPIDttmCtrl")
		public WebElement uIReportedDateEdit;

		@FindBy(how = How.XPATH, using = "(//table[@id = 'dttmReported_Time'] //input[@class='textboxdatetime igte_BlueThemeEditInContainer'])")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_dttmStacked_Date_KPIDttmCtrl")
		public WebElement uIStackedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabCBE_tmpl7_ctrlUsrCBEEdit_dttmStacked_Time']//input")
		public WebElement uIStackedTimeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_dttmFinished_Date_KPIDttmCtrl")
		public WebElement uIFinishedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id ='tabCBE_tmpl7_ctrlUsrCBEEdit_dttmFinished_Time'] //input")
		public WebElement uIFinishedTimeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_addrCallCompletionLoc_txtFrom")
		public WebElement uICallCompletionLocationEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_addrCallCompletionLoc_chkVerify")
		public WebElement uICallCompletionLocationVerifyCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupCADCFS_CodeValue")
		public WebElement uICADCFSEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupCADDisposition_CodeValue")
		public WebElement uICADDispositionEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
		public WebElement uIEditTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Names')]")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes')]")
		public WebElement uINotesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Suspects')]")
		public WebElement uISuspectsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Units')]")
		public WebElement uIUnitsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Call Summary')]")
		public WebElement uICallSummaryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Vehicle')]")
		public WebElement uIVehicleTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Video')]")
		public WebElement uIVideoTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Disposition')]")
		public WebElement uIDispositionTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Map')]")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'QA Forms')]")
		public WebElement uIQAFormsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approval')]")
		public WebElement uIApprovalTab;

		@FindBy(how = How.ID, using = "KPIAccessControl1")
		public WebElement uIALCIcon;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Related Calls')]")
		public WebElement uIRelatedCallsTab;

		@FindBy(how = How.ID, using = "lupInitialCFS_CodeDescription")
		public WebElement uIInitialCFSDescriptionEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupPrimeUnit_CodeValue")
		public WebElement uIPrimeUnitEdit;

		@FindBy(how = How.ID, using = "imgSummon")
		public WebElement uICitationIcon;
		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupCADDisposition_imgBtn")
		public WebElement uICADDispositionLookUpIcon;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Request')]")
		public WebElement uIRequestTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'ANCA#')]")
		public WebElement uIANCATab;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_addrCallCompletionLoc_cmdIncOnAddr")
		public WebElement uILocationInfoIcon;

	    @FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
        public WebElement uILeftSideStatusBar;
	    
	  	@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_cddEvent_DropDown")
			public WebElement uIEventLegacyComboBox;
	     	
	     	@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_nbrActivityNo_imgBtn")
	        public WebElement uIEventLookupIcon;
	     	
	     	@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lblEventDes")
	        public WebElement uIEventDescEdit;

	     	@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_nbrActivityNo_imgBtn")
	        public WebElement uIEventInfoIcon;
			
			@FindBy(how = How.ID, using = "imgCrash")
	        public WebElement uICrashIcon;
			
	}

	public class CallEntryMainTab {
		public WebDriver driver;

		public CallEntryMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_grdCBEMainCmts")
		public WebElement uIMainTable;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtOfficer1")
		public WebElement uIOfficer1Edit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_addrCallCompletionLoc_cmdIncOnAddr")
		public WebElement uILocationInfoIcon;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtAlarmNo")
		public WebElement uIAlarmNoEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtTowZone")
		public WebElement uITowZoneEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtExactLocation")
		public WebElement uIExactLocationEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtCADCompletionCFS")
		public WebElement uICADCFSEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtDisposition")
		public WebElement uICADDispositionEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtStackedDttm")
		public WebElement uIStackedEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCBEMain_txtFinishedDttm")
		public WebElement uIFinishedEdit;
	}

	public class CallEntryNamesTab {
		public WebDriver driver;

		public CallEntryNamesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

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

	public class NotesTab {
		public WebDriver driver;

		public NotesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dttmCmts_Date_KPIDttmCtrl")
		public WebElement uINotesDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmCmts_Time']//input")
		public WebElement uINotesTimeEdit;

		@FindBy(how = How.ID, using = "lupUnit_CodeValue")
		public WebElement uIUnitEdit;

		@FindBy(how = How.ID, using = "lupUnit_imgBtn")
		public WebElement uIUnitLookupButton;

		@FindBy(how = How.ID, using = "txtComment")
		public WebElement uINotesCommentEdit;

		@FindBy(how = How.ID, using = "imgAddComments")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearComments")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveNotesTabButton;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFCodeEdit;
		
		@FindBy(how = How.ID, using = "lupPF_imgBtn")
		public WebElement uIPFCodeLookup;

		@FindBy(how = How.ID, using = "grdCBEMainCmts")
		public WebElement uINotesTable;
		
		@FindBy(how = How.ID, using = "lupPF_cmdIncOnAddr")
		public WebElement uIPFIBubbleIcon;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

	}

	public class CallSummaryTab {
		public WebDriver driver;

		public CallSummaryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_lstTextName")
		public WebElement uITemplateNameComboBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdload")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveCallSummaryTabButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxtWrapper")
		public WebElement uIRichTextWrapperEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uIRichTextEdit;
		
		
		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;
		
		@FindBy(how = How.ID, using = "lblAppPFID")
		public WebElement uISummaryTabGreenMessage;
		
		
	}

	public class VehicleTab {
		public WebDriver driver;

		public VehicleTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "pltVehicle_PlateNumber")
		public WebElement uIPlateNoEdit;

		@FindBy(how = How.ID, using = "pltVehicle_KPIState")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "cddInsurComp_DropDown")
		public WebElement uIInsuranceCompanyComboBox;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uIOtherVehicleInformationEdit;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "grdVehicle")
		public WebElement uIVehicleTable;

		@FindBy(how = How.XPATH, using = "//div[@id='grdVehicle']//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;

		@FindBy(how = How.ID, using = "pltVehicle_imgBtn")
		public WebElement uIVehicleLookupButton;

		@FindBy(how = How.ID, using = "nmcIncident_imgSrch")
		public WebElement uINameInfoIcon;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIVehicleTabResetButton;

		@FindBy(how = How.ID, using = "txtNCIC")
		public WebElement uINCICEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
        public WebElement uINameIDTypeEdit;
       
        @FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
        public WebElement uINameIDEdit;

		
		@FindBy(how = How.ID, using = "KPICustom1")
		public WebElement uICustomlabel1;
		
		@FindBy(how = How.ID, using = "KPICustom2")
		public WebElement uICustomlabel2;

		@FindBy(how = How.ID, using = "txtCustom1")
		public WebElement uICustomEdit1;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;
	}

	public class CallEntryUnitsTab {
		public WebDriver driver;

		public CallEntryUnitsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAddHistory")
		public WebElement uIEditButton;

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdCBEUnits")
		public WebElement uIUnitsTabTable;
	}

	public class CallEntryRelatedCallsTab {
		public WebDriver driver;

		public CallEntryRelatedCallsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "imgAddRLC")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInternalRefreshButton;

		@FindBy(how = How.ID, using = "grdCBERelatedCalls")
		public WebElement uIRelatedCallsTabTable;

		@FindBy(how = How.ID, using = "numRelatedCallNo_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "numRelatedCallNo_Number")
		public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "txtCFS")
		public WebElement uICFSEdit;

		@FindBy(how = How.ID, using = "txtDateTime")
		public WebElement uIDateTimeEdit;

		@FindBy(how = How.ID, using = "imgClearRLC")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "txtComment")
		public WebElement uINotesEdit;
		
		 @FindBy(how = How.XPATH, using = "//td[@class='status']/b")
	        public WebElement uILeftSideStatusBar;

		 @FindBy(how = How.ID, using = "chkPolice")
			public WebElement uIPoliceCheckBox;

			@FindBy(how = How.ID, using = "numRelatedCallNo_imgBtn")
			public WebElement uIRelatedCallNoInfoIcon;
	}

	public class CallEntrySuspectsTab {
		public WebDriver driver;

		public CallEntrySuspectsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddSuspectButton;

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdSuspect")
		public WebElement uISuspectTabTable;
	}

	public class CallEntryMapTab {
		public WebDriver driver;

		public CallEntryMapTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "frmGHydrantMap_Id")
		public WebElement uIFormName;

		@FindBy(how = How.ID, using = "lbllatLongvalue")
		public WebElement uILatLongTextView;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lbllatLongvalue']/font")
		public WebElement uILatLongValueTextView;

		@FindBy(how = How.ID, using = "btnUpdateLatLong")
		public WebElement uIUpdateLatLongButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//body/form[@id='frmGHydrantMapHERE_Id']/div[@id='map_canvas']/div[1]/div[3]/div[3]/div[2]/*[1]")
		public WebElement uILocationPointer;

	}

	

	public class CallEntryRequestTab {
		public WebDriver driver;

		public CallEntryRequestTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Request')])")
		public WebElement uIRequestTab;

		@FindBy(how = How.ID, using = "grdORDetails")
		public WebElement uIRequestTabResultTable;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;
	}

	public class CallSearch {
		public WebDriver driver;

		public CallSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Show Map')]")
		public WebElement uIShowMapButton;

		@FindBy(how = How.ID, using = "grdCBE_ctl00_lnkbtnNext")
		public WebElement uINextButton;

		@FindBy(how = How.ID, using = "grdCBE_ctl00_lnkbtnPrev")
		public WebElement uIPreviousButton;

		@FindBy(how = How.XPATH, using = "//img[contains(@src,'print.gif')]")
		public WebElement uIPrintButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_numCADNbr_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_numCADNbr_Number")
		public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "grdCBE")
		public WebElement uICallSearchTable;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_imgClear")
		public WebElement uIDateResetButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_CddLocationType")
		public WebElement uILocationComboBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_TxtStartPremise")
		public WebElement uIPremiseEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_TxtStreetName")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_TxtStreetName1")
		public WebElement uIStreet1Edit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_TxtAptNo")
		public WebElement uIApartmentEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_dttFrom_Date_KPIDttmCtrl")
		public WebElement uIFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabCBE_tmpl0_ctrlUsrCallSrchBasic_dttFrom_Time'//input")
		public WebElement uIFromTimeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_dttTo_Date_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.ID, using = "chkRptSelect")
		public WebElement uISelectedCheckbox;

		@FindBy(how = How.ID, using = "CallReportList_ItemsCount")
		public WebElement uISelectedReportsCount;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif'")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupCFSCode1_CodeValue")
		public WebElement uICFSRangeFromcodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupCFSCode1_CodeDescription")
		public WebElement uICFSRangeFromDescriptionEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupCFSCode2_CodeValue")
		public WebElement uICFSRangeToCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupCFSCode2_CodeDescription")
		public WebElement uICFSRangeDescriptionToEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_cddRcvSource_CodeValue")
		public WebElement uIReceivedSourceCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_TxtCommonName")
		public WebElement uICommonNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_TxtStreetName2")
		public WebElement uIStreet2Edit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupDisposition_CodeValue")
		public WebElement uICADDispositionCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupOfficer_CodeValue")
		public WebElement uIOfficerCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupCvlDist_CodeValue")
		public WebElement uICivilDistrictCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_adrAddrsCtrl_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_adrAddrsCtrl_chkVerify")
		public WebElement uILocationVerifyCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_txtVinNbr")
		public WebElement uIVinNoEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lupTracking_CodeValue")
		public WebElement uITrackingEdit;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_lsLocationSearch_adrAddrsCtrl_cmdIncOnAddr")
        public  WebElement uIAddressInfoIconButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_cddVehFlag_DropDown")
		public WebElement uIVehicleDropdown;


		@FindBy(how = How.ID, using = "tabCBE$tmpl0$ctrlUsrCallSrchBasic$ChkExpiredFlags")
        public  WebElement uIExpiredFlagCheckBox;

			@FindBy(how = How.XPATH, using = "//span[text()='Type']")
		public WebElement uICustomLabel;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCallSrchBasic_txtCustom1")
		public WebElement uICustomEdit;

	}

	public class CallEntryEditTab {
		public WebDriver driver;

		public CallEntryEditTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupCADDisposition_CodeValue")
		public WebElement uICADDispositionEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_cddRptDue_DropDown")
		public WebElement uIReportDue;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_dttmStacked_divDateTime")
		public WebElement uIStackedDate;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_dttmDispatched_divDateTime")
		public WebElement uIDispatchedDate;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_dttmArrived_divDateTime")
		public WebElement uIArrivedDate;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_dttmFinished_divDateTime")
		public WebElement uIFinishedDate;
																
		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_addrCallCompletionLoc_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupCallTaker_CodeValue")
		public WebElement uICallTakerEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupDispatcherDispAck_CodeValue")
		public WebElement UiDispatcherEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupCADCFS_CodeValue")
		public WebElement uICADCFSEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_imgAddReportDue")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupCADDisposition_imgBtn")
		public WebElement uICADDispositionLookUpIcon;
		
		 @FindBy(how = How.ID, using = "tabCBE_tmpl7_ctrlUsrCBEEdit_lupPrimeUnit_CodeValue")
         public WebElement uIPrimeUnitEdit; 
	}

	public class CallEntryANCATab {
		public WebDriver driver;

		public CallEntryANCATab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddnewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//img[contains(@src,'print')]")
		public WebElement uIPrintIcon;

		@FindBy(how = How.XPATH, using = "//img[contains(@src,'excel')]")
		public WebElement uIExcelIcon;

		@FindBy(how = How.ID, using = "grdAnimalCaseDtl")
		public WebElement uIANCATable;
	}

	public class CallEntryDispositionTab {
		public WebDriver driver;

		public CallEntryDispositionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEDispo_lupDisposition_imgBtn")
		public WebElement uIDispositionSearchButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEDispo_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEDispo_grdCBEDispo")
		public WebElement uIDispositionResultTable;

		
		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEDispo_lupDisposition_CodeValue")
		public WebElement uIDispositionCodeEdit;

	}
	
	public class CallEntryApprovalTab
	{
		WebDriver driver;
		public CallEntryApprovalTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstStatus")
		public WebElement uINewActionDropdown;

		@FindBy(how = How.XPATH, using = "//input[@id='dttStatusDttm_Date_KPIDttmCtrl']")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveApprovalTab;
		
		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement uIByOfficerCode;
		
		
	}

	public class CaseSearch {
		public AdvancedTab advancedTab;
		
		public PoliceForceTab policeForceTab;
		public WebDriver driver;

		public CaseSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.advancedTab == null)) {
				this.advancedTab = new AdvancedTab();
			}
			if ((this.policeForceTab == null)) {
				this.policeForceTab = new PoliceForceTab();
			}
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Show Map')]")
		public WebElement uIShowMapButton;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Clear Map')]")
		public WebElement uIClearMapButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_dttFrom_Date_KPIDttmCtrl")
		public WebElement uIStartDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabCBE_tmpl0_ctrlUsrCaseSrchBasic_dttFrom_Time']//input")
		public WebElement uIStartTimeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_dttTo_Date_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_numCaseNbr_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_numCaseNbr_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "grdCBE")
		public WebElement uICaseSearchTable;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lsLocationSearch_CddLocationType")
		public WebElement uILocationComboBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lsLocationSearch_TxtStreetName1")
		public WebElement uIStreet1Edit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupOfficer_CodeValue")
		public WebElement uIOfficerCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_imgClear")
		public WebElement uIDateResetButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_cddRcvSource_CodeValue")
		public WebElement uIReceivedSourceCodeEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='Table1']//span[@id = 'SP1']")
		public WebElement uIToolTipStatusBar;

		@FindBy(how = How.XPATH, using = "//a//img[contains(@src , 'print.gif')]")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupCFSCode1_CodeValue")
		public WebElement uICFSRangeFromCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupCFSCode1_CodeDescription")
		public WebElement uICFSRangeFromDescriptionEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupCFSCode2_CodeValue")
		public WebElement uICFSRangeToCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupCFSCode2_CodeDescription")
		public WebElement uICFSRangeDescriptionToEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Advanced')]")
		public WebElement uIAdvancedTab;

		@FindBy(how = How.ID, using = "tabCBE_tmpl1_ctrlUsrCaseSrchAdv_chkNotForPublic")
		public WebElement uIHoldForPublicCheckBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupDisposition_CodeValue")
		public WebElement uICADDispositionCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lsLocationSearch_adrAddrsCtrl_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lsLocationSearch_adrAddrsCtrl_chkVerify")
		public WebElement uILocationVerifyCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_numCaseNbr_imgBtn")
		public WebElement uICaseNoInfoIcon;

		@FindBy(how = How.ID, using = "grdCBE_it16_0_IsReportsImg")
		public WebElement uIReportsStatusIconInGrid;

		@FindBy(how = How.XPATH, using = "//input[@id='tabCBE_tmpl0_ctrlUsrCaseSrchBasic_ChkIsPrime']")
		public WebElement uIPrimeOnlyCheckBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_cddDomesticViolence_DropDown")
		public WebElement uIDomesticViolenceDropDown;

		@FindBy(how = How.ID, using = "chkRptSelect")
		public WebElement uISelectedCheckbox;
		
		   @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lsLocationSearch_TxtStreetName2")
	        public WebElement uIStreet2Edit; 
		   
		   @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_rngGEOCoords_txtTo")
	        public WebElement uIGeoCoordsTo;
	       
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_rngGEOCoords_txtFrom")
	        public WebElement uIGeoCoordsFrom;
	   
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_cddPatrolArea_DropDown")
	        public WebElement uIPatrolZoneComboBox;
	       
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_cddSubPatrolArea_DropDown")
	        public WebElement uISubZoneComboBox;
	       
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupCharge_imgBtn")
	        public WebElement uIChargeSearchIcon;
	       
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupPrimePF_CodeValue")
	        public WebElement uIPrimeInvestigator;
	       
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupMgmtDisposition_CodeValue")
	        public WebElement uICaseStatus;
	       
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupMgmtDisposition_imgBtn")
	        public WebElement uICaseStatusSearchIcon;
	       
	        @FindBy(how = How.ID, using = "tabCBE_tmpl0_ctrlUsrCaseSrchBasic_lupOfficer_imgBtn")
	        public WebElement uIofficerSearchIcon;
	       
	        @FindBy(how = How.XPATH, using = "//span[text()='Police Force']")
	        public WebElement uIPoliceTab;

	        @FindBy(how = How.XPATH, using = "//input[@id='tabCBE_tmpl0_ctrlUsrCaseSrchBasic_chkCasesReports']")
			public WebElement uIShowOnlyCasesWithReportCheckBox;
			   
			@FindBy(how = How.XPATH, using = "//input[@id='tabCBE_tmpl0_ctrlUsrCaseSrchBasic_chkNotReviewed']")
			public WebElement uINotReviewedOnlyCheckBox;
			
			@FindBy(how = How.ID, using = "grdCBE_it16_0_IsReportsImg")
			public WebElement uIReportNotReviewedIconInGrid;

			@FindBy(how = How.XPATH, using = "//input[@id='tabCBE_tmpl0_ctrlUsrCaseSrchBasic_chkCasesWithoutReports']")
			public WebElement uIShowOnlyCasesWithoutReportCheckBox;
	}

	public class AdvancedTab {
		public WebDriver driver;

		public AdvancedTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl1_ctrlUsrCaseSrchAdv_chkNotForPublic")
		public WebElement uIHoldForPublicCheckBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl1_ctrlUsrCaseSrchAdv_numInvestNbr_Year")
		public WebElement uIInvestYearEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl1_ctrlUsrCaseSrchAdv_numInvestNbr_Number")
		public WebElement uIInvestNumberEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl1_ctrlUsrCaseSrchAdv_chkIsBodyWorn")
		public WebElement uIUsedBodyWornCheckBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl1_ctrlUsrCaseSrchAdv_ChkIsCarVideo")
		public WebElement uIInCarVideoAvailableCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl1_ctrlUsrCaseSrchAdv_CHkBothVideos")
		public WebElement uIBothVideoTypesAvailable;

	}

	public class CaseUpdate {

		public WebDriver driver;
		public ReportingTab reportingTab;
		public CaseUpdateNamesTab caseUpdateNamesTab;
		public CaseUpdateCaseDataTab caseUpdateCaseDataTab;
		public MOTab mOTab;
		public UCRTab uCRTab;
		public NIBRSCheckTab nIBRSCheckTab;
		public ActivityLogTab activityLogTab;
		public CaseUpdateVehicleTab caseUpdateVehicleTab;
		public CaseUpdateUseOfForceTab caseUpdateUseOfForceTab;
		public CaseUpdatePropertyTab caseUpdatePropertyTab;
		public CaseUpdateRelatedCasesTab caseUpdateRelatedCasesTab;
		public CaseUpdateRequestTab caseUpdateRequestTab;
		public CaseUpdateANCATab caseUpdateANCATab;
		public CaseUpdateMapTab caseUpdateMapTab;
		public CaseUpdateSuspectTab caseUpdateSuspectTab;

		public CaseUpdateCadDataTab caseUpdateCadDataTab;

		public CaseUpdate() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.reportingTab == null)) {
				this.reportingTab = new ReportingTab();
			}

			if ((this.mOTab == null)) {
				this.mOTab = new MOTab();
			}

			if ((this.uCRTab == null)) {
				this.uCRTab = new UCRTab();
			}

			if ((this.nIBRSCheckTab == null)) {
				this.nIBRSCheckTab = new NIBRSCheckTab();
			}

			if ((this.caseUpdateNamesTab == null)) {
				this.caseUpdateNamesTab = new CaseUpdateNamesTab();
			}

			if ((this.caseUpdateCaseDataTab == null)) {
				this.caseUpdateCaseDataTab = new CaseUpdateCaseDataTab();
			}

			if ((this.activityLogTab == null)) {
				activityLogTab = new ActivityLogTab();
			}

			if ((this.caseUpdateVehicleTab == null)) {
				this.caseUpdateVehicleTab = new CaseUpdateVehicleTab();
			}

			if ((this.caseUpdateUseOfForceTab == null)) {
				this.caseUpdateUseOfForceTab = new CaseUpdateUseOfForceTab();
			}

			if ((this.caseUpdatePropertyTab == null)) {
				this.caseUpdatePropertyTab = new CaseUpdatePropertyTab();
			}

			if ((this.caseUpdateRelatedCasesTab == null)) {
				this.caseUpdateRelatedCasesTab = new CaseUpdateRelatedCasesTab();
			}

			if ((this.caseUpdateRequestTab == null)) {
				this.caseUpdateRequestTab = new CaseUpdateRequestTab();
			}

			if ((this.caseUpdateANCATab == null)) {
				this.caseUpdateANCATab = new CaseUpdateANCATab();
			}
			
			if ((this.caseUpdateMapTab == null)) {
				this.caseUpdateMapTab = new CaseUpdateMapTab();

			if ((this.caseUpdateSuspectTab == null)) {
				this.caseUpdateSuspectTab = new CaseUpdateSuspectTab();

			}
			if ((this.caseUpdateCadDataTab == null)) {
				this.caseUpdateCadDataTab = new CaseUpdateCadDataTab();
			}
			}
		}

		@FindBy(how = How.ID, using = "nbrCaseNumber_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Case Data')])")
		public WebElement uICaseDataTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reporting')])")
		public WebElement uIReportingTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'CAD Data')])")
		public WebElement uICADDataTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Map')])")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Names')])")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Related Cases')])")
		public WebElement uIRelatedCasesTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Property')])")
		public WebElement uIPropertyTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'UCR')])")
		public WebElement uIUCRTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'NIBRS Check')])")
		public WebElement uINIBRSCheckTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'MO')])")
		public WebElement uIMOTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Activity Log')])")
		public WebElement uIActivityLogTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachments')])")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Suspects')])")
		public WebElement uISuspectsTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Vehicle')])")
		public WebElement uIVehicleTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'CJRS')])")
		public WebElement uICJRSTab;

		@FindBy(how = How.ID, using = "chkNotForPublic")
		public WebElement uINotForPublicCheckBox;

		@FindBy(how = How.ID, using = "dttmReported_Date_KPIDttmCtrl")
		public WebElement uIReportedDateTextView;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmReported_Time']//input")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "addrFinalLoc_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "cmdInvest")
		public WebElement uICMIconButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInvest")
		public WebElement uICaseManagementIcon;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "ALC")
		public WebElement uIALCIcon;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Use Of Force')])")
		public WebElement uIUseOfForceTab;

		@FindBy(how = How.ID, using = "nbrCallNumber_imgBtn")
		public WebElement uICallInfoIcon;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[@mkr = 'ti11']")
		public WebElement uINIBRSCheckSpanColorTab;

		@FindBy(how = How.ID, using = "nbrCallNumber_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNumber_Number")
		public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "imgCrash")
		public WebElement uICrashIcon;
		
		@FindBy(how = How.ID, using = "imgK9Report")
		public WebElement uIK9ReportIcon;
		
		@FindBy(how = How.ID, using = "iconCoroner")
		public WebElement uICoronerIcon;

		@FindBy(how = How.ID, using = "imgSummon")
		public WebElement uICitationIcon;

		@FindBy(how = How.XPATH, using = "//span[@mkr = 'ti12']")
		public WebElement uICJRSSpanColorTab;

		@FindBy(how = How.ID, using = "lnkDiscoveryList")
		public WebElement uIDiscoveryRequestLink;

		@FindBy(how = How.ID, using = "btnNotify")
		public WebElement uINotificationIcon;

		@FindBy(how = How.ID, using = "lupStatusUpdate_CodeValue")
		public WebElement uICaseStatusCodeEdit;

		@FindBy(how = How.ID, using = "lupStatusUpdate_CodeDescription")
		public WebElement uICaseStatusDescriptionEdit;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisCombobox;

		@FindBy(how = How.ID, using = "chkDNDRpt")
		public WebElement uIDoNotDistributeReportsCheckbox;

		@FindBy(how = How.XPATH, using = "//label[@for = 'chkDNDRpt']")
		public WebElement uIDoNotDistributeReportsTextView;
		@FindBy(how = How.XPATH, using = "//th[text()='Offender Name']")
		public WebElement uIOffenderName;

		@FindBy(how = How.ID, using = "lblDNDrptMsg")
		public WebElement uIDNDStatusTextView;

		@FindBy(how = How.ID, using = "chkDNP")
		public WebElement uIDoNotPurgeCheckBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Request')])")
		public WebElement uIRequestTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'ANCA#')]")
		public WebElement uIANCATab;
		
		@FindBy(how = How.ID, using = "lblCommanName")
		public WebElement uICommonNameLabel;
		
		@FindBy(how = How.XPATH, using = "//div[@id = 'tab0'] //td[@class = 'statusBar']")
		public WebElement uILeftSideStatusBar;

	}

	public class ReportingTab {
		public WebDriver driver;

		public ReportingTab() {
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

		@FindBy(how = How.ID, using = "chkShowPageNumber")
		public WebElement uIIncludeCombinedCheckBox;

		@FindBy(how = How.ID, using = "chkIncSelectAll")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "chkIncAllList_1")
		public WebElement uIIncidentReportCheckBox;

		@FindBy(how = How.XPATH, using = "//label/span[@class = 'hideThis']")
		public WebElement uIIncidentReportStatusTextView;

		@FindBy(how = How.ID, using = "chkIncAllList_3")
		public WebElement uIPropertyReportCheckBox;

		@FindBy(how = How.XPATH, using = "//label[@for ='chkIncAllList_3']/span[@class = 'hideThis']")
		public WebElement uIPropertyReportStatusTextView;

		
		
	}

	public class CaseUpdateNamesTab {
		public WebDriver driver;

		public CaseUpdateNamesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddNameButton;

		@FindBy(how = How.ID, using = "imgClearName")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveNamesTabButton;

		@FindBy(how = How.ID, using = "grdCBENames")
		public WebElement uINamesTabResultTable;

		@FindBy(how = How.ID, using = "grdCBENames")
		public WebElement uINamesTable;

		@FindBy(how = How.XPATH, using = "//div[@id ='grdCBENames']//table//td//img[@title = 'LEOKA']")
		public WebElement uILeokaIcon;

		@FindBy(how = How.XPATH, using = "//img[@title='Domestic Violence']")
		public WebElement uIDVEntryIcon;

	}

	public class MOTab {
		public WebDriver driver;

		public MOTab() {
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
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "grdCBEMO")
		public WebElement uIMOTabTable;

		@FindBy(how = How.ID, using = "imgAddMO")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;
	}

	public class UCRTab {
		public WebDriver driver;

		public UCRTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_lupUCRCode_CodeValue")
		public WebElement uIUCRCodeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtNoOfOfficeAssulted")
		public WebElement uIOfficerAssaultedEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtNoOfOfficersKilled")
		public WebElement uIOfficersKilledEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_lupCaseDisposition_CodeValue")
		public WebElement uIUCRDispositionEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_lblClearanceDate")
		public WebElement uIClearanceDateTextView;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_dttClearanceDate_Date_KPIDttmCtrl")
		public WebElement uIClearanceDateEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtPropDamaged")
		public WebElement uIPropertyDamagedEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtVictimCount")
		public WebElement uIVictimCountEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_cddPropClass_DropDown")
		public WebElement uIPropertyClassificationComboBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_chkArsonInvolved")
		public WebElement uIArsonInvolvedCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_chkUninhabited")
		public WebElement uIUninhabitedCheckbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtUCRLine")
		public WebElement uIUCRLineNoEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtUCR")
		public WebElement uIUCRMethodEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_lupCaseDisposition_imgBtn")
		public WebElement uIUCRDispositionLookup;

		@FindBy(how = How.XPATH, using = "//table[@id='tabCBE_tmpl13_ctrlUsrCBEUCR_dttClearanceDate_Time']//input")
		public WebElement uIClearanceTimeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_lupCaseDisposition_CodeDescription")
		public WebElement uIUCRDispositionDescriptionEdit;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtCaseCFS")
		public WebElement uIMgmtCFSEdit;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtCADCFS")
		public WebElement uICADCFSEdit;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_txtCallDisposition")
		public WebElement uICADDispositionEdit;
		
		@FindBy(how = How.ID, using = "tabCBE_tmpl13_ctrlUsrCBEUCR_lupUCRCode_CodeDescription")
		public WebElement uIUCRCodeDescriptionEdit;
	}

	public class NIBRSCheckTab {

		public WebDriver driver;

		public NIBRSCheckTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddNIBRSDispo_DropDown")
		public WebElement uIClearenceTypeComboBox;

		@FindBy(how = How.ID, using = "dttClearanceDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttClearanceDate_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "grdErrorCheck")
		public WebElement uINIBRSCheckTable;

		@FindBy(how = How.ID, using = "lblNoError")
		public WebElement uINoErrorLabel;

	}

	public class CaseUpdateCaseDataTab {
		public WebDriver driver;

		public CaseUpdateCaseDataTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCADCFS_CodeValue")
		public WebElement uICFSCodeEdit;

		@FindBy(how = How.ID, using = "grdCBEFTC")
		public WebElement uICFSGridResultTable;

		@FindBy(how = How.ID, using = "dttmOccuredAt_Date_KPIDttmCtrl")
		public WebElement uIOccuredAtDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmOccuredAt_Time']//input")
		public WebElement uIOccuredAtTimeEdit;

		@FindBy(how = How.ID, using = "imgAddCFS")
		public WebElement uIADDCFSButton;

		@FindBy(how = How.ID, using = "chkBodyWorn")
		public WebElement uIUsedBodyWornCheckBox;

		@FindBy(how = How.ID, using = "cddDomesticViolence_DropDown")
		public WebElement uIDomesticViolenceComboBox;

		@FindBy(how = How.ID, using = "chkUnknown")
		public WebElement uIUnknownCheckBox;

		@FindBy(how = How.ID, using = "cddPoliceForceUsed_DropDown")
		public WebElement uIPoliceForceUsedComboBox;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdPursuit")
		public WebElement uIPursuitButton;

		@FindBy(how = How.ID, using = "lupCADCFS_imgBtn")
		public WebElement uIChargeLookupIcon;

		@FindBy(how = How.ID, using = "dttmOccuredFrom_Date_KPIDttmCtrl")
		public WebElement uIOccuredBetweenDateEdit;

		@FindBy(how = How.ID, using = "ChkIsCar")
		public WebElement uIInCarVideoCheckBox;

		@FindBy(how = How.ID, using = "lblUserDefinedCode")
		public WebElement uIIdentityTheft;

		@FindBy(how = How.ID, using = "cddUserDefinedCode_DropDown")
		public WebElement uIIdentityTheftComboBox;
		
		@FindBy(how = How.ID, using = "lblCADCFS")
		public WebElement uIChargeLable;
		
		@FindBy(how = How.ID, using = "chkCaseNotify")
        public WebElement uICaseFileSentToDACheckbox;

		@FindBy(how = How.ID, using = "cddEvidence_DropDown")
		public WebElement uIEvidenceComboBox;
		
		@FindBy(how = How.ID, using = "txtOthers")
		public WebElement uIEvidenceTextBox;
		

		@FindBy(how = How.ID, using = "imgAddEvidence")
		public WebElement uIADDEvidenceButton;
		
		
	

	}

	
	public class ActivityLogTab {
		public WebDriver driver;

		public ActivityLogTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCode_CodeValue")
		public WebElement uICodeEdit;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uIHeadingEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uIActivityLogTabTable;

		@FindBy(how = How.ID, using = "lupCode_CodeDescription")
		public WebElement uICodeDescriptionEdit;
	}

	public class CaseUpdateVehicleTab {
		public WebDriver driver;

		public CaseUpdateVehicleTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdVehicle")
		public WebElement uIVehicleTabTable;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "pltVehicle_PlateNumber")
		public WebElement uIVehicleEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameIDEdit;
		
		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;
		
		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;
	}

	public class CaseUpdateUseOfForceTab {
		public WebDriver driver;

		public CaseUpdateUseOfForceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewLink;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetLink;

		@FindBy(how = How.ID, using = "grdUseOfForce")
		public WebElement uIUseOfForceTabTable;
	}

	public class CaseUpdatePropertyTab {
		public WebDriver driver;

		public CaseUpdatePropertyTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attach Property Report')]")
		public WebElement uIAttachPropertyReportButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add New Property Report')]")
		public WebElement uIAddNewPropertyReportButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdPropEntry")
		public WebElement uIPropertyEditEntryTable;

		@FindBy(how = How.ID, using = "grdPropEntry")
		public WebElement uIPropertyEntryTable;
	}

	public class CaseUpdateRelatedCasesTab {
		public WebDriver driver;

		public CaseUpdateRelatedCasesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "imgAddRLC")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInternalRefreshButton;

		@FindBy(how = How.ID, using = "grdCBERelatedCalls")
		public WebElement uIRelatedCaseTabTable;

		@FindBy(how = How.ID, using = "numRelatedCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "numRelatedCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "txtCFS")
		public WebElement uICFSEdit;

		@FindBy(how = How.ID, using = "txtDateTime")
		public WebElement uIDateTimeEdit;

		@FindBy(how = How.ID, using = "imgClearRLC")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "txtComment")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "chkSendToNIBRS")
		public WebElement uISendToNIBRSCheckBox;
		
		@FindBy(how = How.ID, using = "numRelatedCaseNo_imgBtn")
        public WebElement uIRelatedCaseInfoIcon;
	}

	public class CaseUpdateRequestTab {
		public WebDriver driver;

		public CaseUpdateRequestTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}
		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Request')])")
		public WebElement uIRequestTab;

		@FindBy(how = How.XPATH, using = "//span[@mkr = 'ti21']")
		public WebElement uIRequestColorTab;

		@FindBy(how = How.ID, using = "grdORDetails")
		public WebElement uIRequestTabResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add New')]")
		public WebElement uIAddNewButton;

	}

	public class CaseUpdateANCATab {
		public WebDriver driver;

		public CaseUpdateANCATab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddnewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//img[contains(@src,'print')]")
		public WebElement uIPrintIcon;

		@FindBy(how = How.XPATH, using = "//img[contains(@src,'excel')]")
		public WebElement uIExcelIcon;

		@FindBy(how = How.ID, using = "grdAnimalCaseDtl")
		public WebElement uIANCATable;
	}
public class CaseUpdateSuspectTab {

		public WebDriver driver;

		public CaseUpdateSuspectTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdSuspect']/table")
		public WebElement uISuspectTable;

	}

	public class CaseUpdateCadDataTab {

		public WebDriver driver;

		public CaseUpdateCadDataTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtExactLocation")
		public WebElement uIReportedLocationEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtDispatcher")
		public WebElement uIDispatcherEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtCADCompletionCFS")
		public WebElement uICADCFSEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtDisposition")
		public WebElement uICadDispositionEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtPrimeUnit")
		public WebElement uIPrimeUnitEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtOfficer1")
		public WebElement uIOfficer1Edit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtStackedDttm")
		public WebElement uIStackedDate;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtDispatchedDttm")
		public WebElement uIDispatchedDateEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtArrivedDttm")
		public WebElement uIArrivedDateEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl8_ctrlUsrCBEMain_txtFinishedDttm")
		public WebElement uIFinishedDateEdit;

	}
	public class WalkInEntry {
		public WebDriver driver;

		public WalkInEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}
		

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Year")
		public WebElement uICaseNoEdit;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Number")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNumber_Year")
		public WebElement uICallNoEdit;

		@FindBy(how = How.ID, using = "nbrCallNumber_Number")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "lupCADCFS_CodeValue")
		public WebElement uICADCFSCodeEdit;

		@FindBy(how = How.ID, using = "lupCADCFS_CodeDescription")
		public WebElement uICADCFSTextEdit;

		@FindBy(how = How.ID, using = "lupCADCFS_imgBtn")
		public WebElement uICADCFSlupButton;

		@FindBy(how = How.ID, using = "dttmReported_Date_KPIDttmCtrl")
		public WebElement uIReportedDate;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmReported_Time']//input")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "addrCallCompletionLoc_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "addrCallCompletionLoc_chkVerify")
		public WebElement uILocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "cddRcvSource_CodeValue")
		public WebElement uIRcvSourceCodeEdit;

		@FindBy(how = How.ID, using = "cddRcvSource_CodeDescription")
		public WebElement uIRcvSourceDescTextEdit;

		@FindBy(how = How.ID, using = "cddRcvSource_imgBtn")
		public WebElement uIRcvSourcelupButton;

		@FindBy(how = How.ID, using = "lupCADDisposition_CodeValue")
		public WebElement uICADDispositionCodeEdit;

		@FindBy(how = How.ID, using = "lupCADDisposition_CodeDescription")
		public WebElement uICADDispositionDescTextEdit;

		@FindBy(how = How.ID, using = "lupCADDisposition_imgBtn")
		public WebElement uICADDispostionlupButton;

		@FindBy(how = How.ID, using = "lupPrimeUnit_CodeValue")
		public WebElement uIUnitCodeEdit;

		@FindBy(how = How.ID, using = "lupPrimeUnit_CodeDescription")
		public WebElement uIUnitDescTextEdit;

		@FindBy(how = How.ID, using = "lupPrimeUnit_imgBtn")
		public WebElement uIUnitLookupButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "addrCallCompletionLoc_cmdIncOnAddr")
		public WebElement uILocationInfoIcon;

		@FindBy(how = How.XPATH, using = "//div[@class = 'modal-body']")
		public WebElement uIConfirmMessageTextView;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
		public WebElement uIYesButton;
		
		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameIDTypeEdit;
		
		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameIDEdit;
		
		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastName;
		
		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstName;
		
		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityDropdown;
		
		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "chkRequ")
        public WebElement uICreateCallInCADForDispatchCheckBox;

	@FindBy(how = How.ID, using = "lblActivity")
		public WebElement uIActivityLabel;

	}

	public class ReportManager {

		public ReportManagerMainTab reportManagerMainTab;
		public UpdateStatusTab updateStatusTab;
		public ReportManagerHistroyTab reportManagerHistroyTab;
		public ReportManagerNIBRSCheckTab reportManagerNIBRSCheckTab;
		public WebDriver driver;

		public ReportManager() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.reportManagerMainTab == null)) {
				this.reportManagerMainTab = new ReportManagerMainTab();
			}

			if ((this.updateStatusTab == null)) {
				this.updateStatusTab = new UpdateStatusTab();
			}

			if ((this.reportManagerHistroyTab == null)) {
				this.reportManagerHistroyTab = new ReportManagerHistroyTab();
			}

			if ((this.reportManagerNIBRSCheckTab == null)) {
				this.reportManagerNIBRSCheckTab = new ReportManagerNIBRSCheckTab();
			}
		}

		@FindBy(how = How.ID, using = "lstReportStatus")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "lupReportedPF_CodeValue")
		public WebElement uIReportedbyPFCodeValue;

		@FindBy(how = How.ID, using = "dttReported_Date_KPIDttmCtrl")
		public WebElement uIReportedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttReported_Time']//input")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "lblRptStatus")
		public WebElement uIMenubarStatus;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTabSpan;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Update Status')]")
		public WebElement uIUpdateStatusSpan;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'History')]")
		public WebElement uIHistoryTabSpan;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'QA Forms')]")
		public WebElement uIQAFormTabSpan;

		@FindBy(how = How.ID, using = "lupReportedPF_cmdIncOnAddr")
		public WebElement uIReportedByPFInfoIcon;

		@FindBy(how = How.ID, using = "lupReportedPF_imgBtn")
		public WebElement uIReportedByPFSearchButton;

		@FindBy(how = How.ID, using = "numCaseNumber_imgBtn")
		public WebElement uICaseInfoButton;

		@FindBy(how = How.ID, using = "cddRptType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "numCaseNumber_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "numCaseNumber_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "btnViewReport")
		public WebElement uIViewReportButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'NIBRS Check')]")
		public WebElement uINIBRSCheckTabSpan;
		
		@FindBy(how = How.XPATH, using = "//span[@mkr = 'ti11']")
		public WebElement uINIBRSCheckSpanColorTab;

		@FindBy(how = How.ID, using = "txtRptDesc")
		public WebElement uIReportDescriptionEdit;

		@FindBy(how = How.ID, using = "lblRptDesc")
		public WebElement uIReportDescriptionLabel;

		@FindBy(how = How.ID, using = "cddStatementName")
		public WebElement uIStatementNameComboBox;

		@FindBy(how = How.XPATH, using = "//div[@class = 'modal-body']")
		public WebElement uIConfirmMessageTextView;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
		public WebElement uIYesButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'No')]")
		public WebElement uINoButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
		public WebElement uIStatusBar;
	}

	public class ReportManagerMainTab {
		public WebDriver driver;

		public ReportManagerMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl0_ctrlUsrRptMain_txtApprovedBy")
		public WebElement uIApprovedBy;

	}

	public class UpdateStatusTab {

		public PDFUploadPanel pDFUploadPanel;
		public WebDriver driver;

		public UpdateStatusTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.pDFUploadPanel == null)) {
				this.pDFUploadPanel = new PDFUploadPanel();
			}

		}

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_lstStatus")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_cddRejCode_DropDown")
		public WebElement uIRejectionCodeComboBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_cddSquad_DropDown")
		public WebElement uISquadComboBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_lupSupervisor_CodeValue")
		public WebElement uISupervisorCodeEdit;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_lupSupervisor_CodeDescription")
		public WebElement uISupervisorDescTextEdit;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_lupSupervisor_imgBtn")
		public WebElement uISupervisorLupSrchButton;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_btnOpenPDF")
		public WebElement uIOpenPDFForMarkupButton;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_btnUploadPDF")
		public WebElement uIUploadPDFButton;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_lblRejCount")
		public WebElement uIRejectionCode;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_imgPFSign_chkIsEnableSign")
		public WebElement uIEnableSignCheckBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_chkShareCaseUpdate")
		public WebElement uIShareCaseUpdateCheckBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_chkShareCaseFolder")
		public WebElement uIShareCaseFolderCheckBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_imgNotarySign_chkIsEnableSign")
		public WebElement uINotarySignCheckBox;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_imgPFSign_imgSign")
		public WebElement uIPFSignImage;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_imgNotarySign_imgSign")
		public WebElement uINotarySignImage;
		
		 @FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_lblRejCode")
	        public WebElement uIRejectionCodeLable;
		

	}

	public class ReportManagerHistroyTab {
		public WebDriver driver;

		public ReportManagerHistroyTab() {
			this.driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdRptHistory")
		public WebElement uIReportHistroyTable;

	}

	public class PDFUploadPanel {
		public WebDriver driver;

		public PDFUploadPanel() {
			this.driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_uploadfileTextBox0")
		public WebElement uISelectButton;

		@FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_cmdSavePDF")
		public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "tabRptEntry_tmpl1_ctrlUsrRptStatusUpdate_uploadfilefile0")
        public WebElement uIFilePathEdit;
	}

	public class ReportManagerNIBRSCheckTab {
		public WebDriver driver;

		public ReportManagerNIBRSCheckTab() {
			this.driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdErrorCheck")
		public WebElement uINIBRSCheckTabTable;

	}

	public class UCR {

		public WebDriver driver;

		public UCR() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dttSubFrom_KPIDttmCtrl")
		public WebElement uISubmissionPeriodEdit;

		// dttSubFrom_KPIDttmCtrl
		@FindBy(how = How.ID, using = "dttSubTo_KPIDttmCtrl")
		public WebElement uIToEdit;

		@FindBy(how = How.ID, using = "txtPrepBy")
		public WebElement uIPreparedByEdit;

		@FindBy(how = How.ID, using = "txtTitle")
		public WebElement uITitleEdit;

		@FindBy(how = How.ID, using = "txtDeptHead")
		public WebElement uIHeadoFTheDepartmentEdit;

		@FindBy(how = How.ID, using = "chkIsArson")
		public WebElement uIArsonReportCheckbox;

		@FindBy(how = How.ID, using = "chkIsAdult")
		public WebElement uIAdultArrestReportCheckbox;

		@FindBy(how = How.ID, using = "chkIsPropStln")
		public WebElement uIPropertyStolenReportCheckbox;

		@FindBy(how = How.ID, using = "cmdReport")
		public WebElement uIGenerateReportButton;

		@FindBy(how = How.ID, using = "cmdVwLogFile")
		public WebElement uIViewLogFileButton;

		@FindBy(how = How.ID, using = "chkIsAll")
		public WebElement uIAllReportCheckbox;

		@FindBy(how = How.ID, using = "chkIsReturnA")
		public WebElement uIReturnAOffenseReportCheckbox;

		@FindBy(how = How.ID, using = "chkIsLEOKA")
		public WebElement uILeokaReportCheckbox;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "chkIsJuvenile")
		public WebElement uIJuvenileArrestReportCheckbox;

		@FindBy(how = How.ID, using = "chkIsSupRetA")
		public WebElement uISupplementalToReturnAReportCheckbox;

		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uILogWindowBody;
	}

	public class ReportStatus {
		public WebDriver driver;
		public DistributeReport distributeReport;

		public ReportStatus() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.distributeReport == null)) {
				this.distributeReport = new DistributeReport();
			}
		}

		@FindBy(how = How.ID, using = "cmdReportDetails")
		public WebElement uIReportDetailsButton;

		@FindBy(how = How.ID, using = "cmdCaseData")
		public WebElement uICaseDataButton;

		@FindBy(how = How.ID, using = "cmdNames")
		public WebElement uINamesButton;

		@FindBy(how = How.ID, using = "cmdSuspect")
		public WebElement uISuspectButton;

		@FindBy(how = How.ID, using = "cmdProperty")
		public WebElement uIPropertyButton;

		@FindBy(how = How.ID, using = "cmdVehicle")
		public WebElement uIVehicleButton;

		@FindBy(how = How.ID, using = "cmdSummary")
		public WebElement uISummaryButton;

		@FindBy(how = How.ID, using = "cmdNarrative")
		public WebElement uINarrativeButton;

		@FindBy(how = How.ID, using = "cmdQAForm")
		public WebElement uIQAFormButton;

		@FindBy(how = How.ID, using = "cmdAttachment")
		public WebElement uIAttachmentsButton;

		@FindBy(how = How.ID, using = "cmdRedact")
		public WebElement uIRedactButton;

		@FindBy(how = How.ID, using = "cmdReportComments")
		public WebElement uIReportHistroyButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "lblRptStatus")
		public WebElement uIReportStatus;

		@FindBy(how = How.ID, using = "cmdImgAttach")
		public WebElement uIPaperIcon;

		@FindBy(how = How.ID, using = "cmdArrest")
		public WebElement uIArrestButton;

		@FindBy(how = How.ID, using = "cmdUseofForce")
		public WebElement uIUseOfForceButton;

		@FindBy(how = How.ID, using = "cmdMail")
		public WebElement uIConfigrueMailExtenstionButton;

		@FindBy(how = How.XPATH, using = "//div//p/a[contains(text(),'Click here to download MailExtension Sdk.')")
		public WebElement uIdownloadMailExtensionSdkLink;

		@FindBy(how = How.ID, using = "cmdDistribute")
		public WebElement uIDistributeReportButton;

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIAssignRefreshButton;

		@FindBy(how = How.ID, using = "btnNext")
		public WebElement uIAssignNextButton;

		@FindBy(how = How.ID, using = "btnPrevious")
		public WebElement uIAssignPreviousButton;

		@FindBy(how = How.ID, using = "btnAssign")
		public WebElement uIAssignCaseButton;

		@FindBy(how = How.ID, using = "nbrCaseNumber_imgBtn")
		public WebElement uIAssignCaseNoInfoIcon;

		@FindBy(how = How.ID, using = "cmdEmail")
		public WebElement uISendEmailButton;

		@FindBy(how = How.ID, using = "txttomail")
		public WebElement uISendEmailTo;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISendEmailSubject;

		@FindBy(how = How.ID, using = "lblAttachedFileName")
		public WebElement uISendEmailAttachmentName;

		@FindBy(how = How.ID, using = "txtMessage")
		public WebElement uISendEmaiMassage;

		@FindBy(how = How.ID, using = "cmdSendEmail")
		public WebElement uISendEmaiSendButton;

		@FindBy(how = How.XPATH, using = "//div[@id='emailCont']//input[2]")
		public WebElement uISendEmailCancleButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uISendEmaiCloseButton;

		@FindBy(how = How.ID, using = "lblError")
		public WebElement uISendEmaiErrorMsg;

		@FindBy(how = How.ID, using = "lblMailTo")
		public WebElement uISendEmaiTotext;

		@FindBy(how = How.ID, using = "cmdNibrsCheck")
		public WebElement uINibrsCheckButton;

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIReportStatusRefreshButton;

		@FindBy(how = How.ID, using = "btnNext")
		public WebElement uIReportStatusNextButton;

		@FindBy(how = How.ID, using = "btnPrevious")
		public WebElement uIReportStatusPreviousButton;

		@FindBy(how = How.ID, using = "chkReviewed")
		public WebElement uIReviewedCheckBox;

		@FindBy(how = How.ID, using = "lblDNDMsg")
		public WebElement uIDNDReportInStatusBar;

		@FindBy(how = How.XPATH, using = "//tr[@id='trExisting']")
		public WebElement uIHeaderButtons;
		
		@FindBy(how = How.ID, using = "cmdCrash")
        public WebElement uICrashButton;

		@FindBy(how = How.ID, using = "cmdDelete")
        public WebElement uIDeleteIcon;
		
		@FindBy(how = How.XPATH, using = "//input[@name='LastName']")
        public WebElement uILastNameEditQAForm;
 
        @FindBy(how = How.XPATH, using = "//input[@name='FirstName']")
        public WebElement uIFirstNameEditQAForm;
 
        @FindBy(how = How.ID, using = "saveExit")
        public WebElement uISaveNExitButton;
	}

	public class DistributeReport {
		public WebDriver driver;

		public DistributeReport() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtReleasedTo")
		public WebElement uIReleasedToEdit;

		@FindBy(how = How.ID, using = "ddlWatermark")
		public WebElement uISelectWatermarkComboBox;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "btnPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "btnCancel")
		public WebElement uICancelButton;

	}

	public class RedactStatus {
		public WebDriver driver;

		public RedactStatus() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnOpenPDF")
		public WebElement uIOpenPDFforRedactionButton;

		@FindBy(how = How.ID, using = "btnUploadPDF")
		public WebElement uIUploadPDFButton;

		@FindBy(how = How.ID, using = "txtRptDesc")
		public WebElement uIReasonforRedactionEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdXclose")
		public WebElement uICancelButton;

	}

	public class ReportSearch {
		public WebDriver driver;

		public ReportSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_lstReportStatus")
		public WebElement uIStatusCombobox;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_cddRptType_DropDown")
		public WebElement uIReportTypeCombobox;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_nbrCaseNoStart_Year")
		public WebElement uICaseYearFromEdit;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_nbrCaseNoStart_Number")
		public WebElement uICaseNumberFromEdit;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_nbrCaseNoEnd_Year")
		public WebElement uICaseYearEndEdit;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_nbrCaseNoEnd_Number")
		public WebElement uICaseNumberEndEdit;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_lupPF_CodeValue")
		public WebElement uIOfficerPFEdit;

		@FindBy(how = How.XPATH, using = "//span[@title='Search']")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdCBEReports")
		public WebElement uISearchResultGrid;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_imgClear")
		public WebElement uIDateResetButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdCBEReports']//div[@style='height: 823px; overflow: hidden;']//table//tbody//tr//td")
		public WebElement uIToolTipStatusBar;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_DttmFrom_Date_KPIDttmCtrl")
		public WebElement uIFromDateEdit;

		@FindBy(how = How.ID, using = "tabRpt_tmpl0_ctrlusrRptSrchBSC_DttmEnd_Date_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//*[@id='WzBoDy']//table//td[@id='WzBoDyI']//span")
		public WebElement uIToolTipStatusBarOfficerColumn;

		@FindBy(how = How.XPATH, using = "//img[contains(@src,'print.gif')]")
		public WebElement uIPrintButton;

		@FindBy(how = How.XPATH, using = "//table[@id='tabRpt_tmpl0_ctrlusrRptSrchBSC_DttmFrom_Time']//input")
		public WebElement uIFromTimeEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabRpt_tmpl0_ctrlusrRptSrchBSC_DttmEnd_Time']//input")
		public WebElement uIToTimeEdit;

		@FindBy(how = How.ID, using = "grdCBEReports_ctl00_lnkbtnNext")
		public WebElement uINextButton;
	}

	public class ACD {
		public WebDriver driver;

		public ACD() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCADCFS_imgBtn")
		public WebElement uIChargeSearchButton;

		@FindBy(how = How.ID, using = "lupCADCFS_CodeValue")
		public WebElement uIChargeCodeValue;

		@FindBy(how = How.ID, using = "imgAddCFS")
		public WebElement uIAddCFS;

		@FindBy(how = How.ID, using = "dttmOccuredAt_Date_KPIDttmCtrl")
		public WebElement uIOccuredAtDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmOccuredAt_Time']//input")
		public WebElement uIOccuredAtTimeEdit;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNClose;

		@FindBy(how = How.ID, using = "cddDomesticViolence_DropDown")
		public WebElement uIDomesticViolationComboBox;

		@FindBy(how = How.ID, using = "grdChargeLst")
		public WebElement uIPopupCopyChargeGridTable;

		@FindBy(how = How.ID, using = "cmdCopy")
		public WebElement uIPopupChargeCopyButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uIPopupChargeCancelButton;

		@FindBy(how = How.ID, using = "grdCBEFTC")
		public WebElement uIACDChargeGridTable;

		@FindBy(how = How.ID, using = "txtDamageAmount")
		public WebElement uIDamageAmountEdit;

		@FindBy(how = How.ID, using = "chkBodyWorn")
		public WebElement uIUsedBodyWornCameraCheckbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cddPoliceForceUsed_DropDown")
		public WebElement uIPoliceForceUsedComboBox;

		@FindBy(how = How.ID, using = "chkUnknown")
		public WebElement uIUnknownCheckbox;

		@FindBy(how = How.ID, using = "dttmOccuredFrom_Date_KPIDttmCtrl")
		public WebElement uIOccuredBetweenDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmOccuredFrom_Time']//input")
		public WebElement uIOccuredBetweenTimeEdit;

		@FindBy(how = How.ID, using = "dttmOccuredTo_Date_KPIDttmCtrl")
		public WebElement uIOccuredToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmOccuredTo_Time']//input")
		public WebElement uIOccuredToTimeEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uILeftSideStatusBar;

		@FindBy(how = How.ID, using = "lblCADCFS")
		public WebElement uIChargeLable;

		@FindBy(how = How.ID, using = "lblGamblingInvolved")
		public WebElement uIGamblingLabel;

		@FindBy(how = How.ID, using = "lblSafeEntered")
		public WebElement uISafeEnteredLabel;

		@FindBy(how = How.ID, using = "cddGamblingInvolved_DropDown")
		public WebElement uIGamblingInvolvedCombobox;

		@FindBy(how = How.ID, using = "cddSafeEntered_DropDown")
		public WebElement uISafeEnteredCombobox;

		@FindBy(how = How.ID, using = "lblUserDefinedCode")
		public WebElement uIIdentityTheft;

		@FindBy(how = How.ID, using = "cddUserDefinedCode_DropDown")
		public WebElement uIIdentityTheftComboBox;
		
			@FindBy(how = How.ID, using = "cmdPursuitRpt")
		public WebElement uIPursuitReport;
	}

	public class FTCScreen {
		public WebDriver driver;

		public FTCScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddAttemptedRCompleted_DropDown")
		public WebElement uIAttemptedCompletedComboBox;

		@FindBy(how = How.ID, using = "cddBiasMotivation_DropDown")
		public WebElement uIBiasMotivationComboBox;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lblGeography")
		public WebElement uIGeographyTextView;

		@FindBy(how = How.ID, using = "cddGeography_DropDown")
		public WebElement uIGeographyComboBox;

		@FindBy(how = How.ID, using = "lblSHFIncidentClery")
		public WebElement uIStudentHousingFacilityTextView;

		@FindBy(how = How.ID, using = "cddSHFIncidentClery_DropDown")
		public WebElement uIStudentHousingFacilityComboBox;

		@FindBy(how = How.ID, using = "lblGeneralLocation")
		public WebElement uIGeneralLocationTextView;

		@FindBy(how = How.ID, using = "cddGeneralLocation_DropDown")
		public WebElement uIGeneralLocationComboBox;

		@FindBy(how = How.ID, using = "cddLocationType_DropDown")
		public WebElement uILocationTypeComboBox;

		@FindBy(how = How.ID, using = "cddSuspectUsing1_DropDown")
		public WebElement uISuspectedOfUsingComboBox;

		@FindBy(how = How.ID, using = "lblDomesticViolence")
		public WebElement uIDomesticViolenceTextView;

		@FindBy(how = How.ID, using = "cddDomesticViolence_DropDown")
		public WebElement uIDomesticViolenceComboBox;

		@FindBy(how = How.ID, using = "lblDatingViolence")
		public WebElement uIDatingViolenceTextView;

		@FindBy(how = How.ID, using = "cddDatingViolence_DropDown")
		public WebElement uIDatingViolenceComboBox;

		@FindBy(how = How.ID, using = "lblStalking")
		public WebElement uIStalkingTextView;

		@FindBy(how = How.ID, using = "cddStalking_DropDown")
		public WebElement uIStalkingComboBox;

		@FindBy(how = How.ID, using = "txtCFS")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "lblHateIndicator")
		public WebElement uIHateIndicatorTextView;

		@FindBy(how = How.ID, using = "cddHateIndicator_DropDown")
		public WebElement uIHateIndicatorComboBox;

		@FindBy(how = How.ID, using = "lupCFS_CodeValue")
		public WebElement uICFSEdit;

		@FindBy(how = How.ID, using = "cddNibrs")
		public WebElement uINIBRSComboBox;

		@FindBy(how = How.ID, using = "lstCrimeAgainst")
		public WebElement uICrimeAgainstComboBox;

		@FindBy(how = How.ID, using = "cddPropType_DropDown")
		public WebElement uIPropertyLossComboBox;

		@FindBy(how = How.ID, using = "cddCriminalAct1_DropDown")
		public WebElement uICriminalActivityComboBox;

		@FindBy(how = How.ID, using = "cddWeaponsUsed1_DropDown")
		public WebElement uIWeaponsUsedComboBox;

		@FindBy(how = How.ID, using = "cddSuspectUsing1_DropDown")
		public WebElement uISuspectUsingComboBox;

		@FindBy(how = How.ID, using = "OHrdoForced_0")
		public WebElement uIMethodofEntryForcedRadioButton;

		@FindBy(how = How.ID, using = "OHrdoForced_1")
		public WebElement uIMethodofEntryNonForcedRadioButton;

		@FindBy(how = How.ID, using = "cddSuspDrugType_DropDown")
		public WebElement uISuspectedDrugTypeComboBox;

		@FindBy(how = How.ID, using = "cddCrimeType_DropDown")
		public WebElement uIDegreeComboBox;

		@FindBy(how = How.ID, using = "cddSHFFOpenFlame_DropDown")
		public WebElement uIStudentHousingFF;

		@FindBy(how = How.ID, using = "lblBiasMotivation")
		public WebElement uIBiasMotivationLable;
	}

	public class CaseData {
		public WebDriver driver;

		public CaseData() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCADCFS_CodeValue")
		public WebElement uIChargeTextEdit;

		@FindBy(how = How.ID, using = "lupCADCFS_imgBtn")
		public WebElement uIChargeLookupButton;

		@FindBy(how = How.ID, using = "imgAddCFS")
		public WebElement uIAddChargeButton;

		@FindBy(how = How.ID, using = "imgClearCFS")
		public WebElement uIClearChargeButton;

		@FindBy(how = How.ID, using = "grdCBEFTC")
		public WebElement uIChargeTable;

		@FindBy(how = How.ID, using = "cddEvidence_DropDown")
		public WebElement uIEvidenceComboBox;

		@FindBy(how = How.ID, using = "imgAddEvidence")
		public WebElement uIAddEvidenceButton;

		// @FindBy(how = How.ID, using = "imgAddEvidence")
		// public WebElement uIAddEvidenceButton;

		@FindBy(how = How.ID, using = "imgClearEvidence")
		public WebElement uIClearEvidenceButton;

		@FindBy(how = How.ID, using = "grdCBEEvidences")
		public WebElement uIEvidenceTable;

		@FindBy(how = How.ID, using = "cddScene_DropDown")
		public WebElement uISceneComboBox;

		@FindBy(how = How.ID, using = "cddTypeOfSecurity_DropDown")
		public WebElement uITypeofSecurityComboBox;

		@FindBy(how = How.ID, using = "cmdPursuit")
		public WebElement uIAddPursuitButton;

		@FindBy(how = How.ID, using = "cddDomesticViolence_DropDown")
		public WebElement uIDomesticViolenceComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

	}

	public class CaseSuspect {
		public WebDriver driver;

		public CaseSuspect() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddSuspectButton;

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdSuspect")
		public WebElement uISuspectTable;
	}

	public class CaseVehicle {
		public WebDriver driver;

		public CaseVehicle() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "pltVehicle_PlateNumber")
		public WebElement uIVehicleNumberEdit;

		@FindBy(how = How.ID, using = "pltVehicle_KPIState")
		public WebElement uIVehicleStateComboBox;

		@FindBy(how = How.ID, using = "pltVehicle_imgBtn")
		public WebElement uIVehicleLookupButton;

		@FindBy(how = How.ID, using = "txtNCIC")
		public WebElement uINCICEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "cddInsurComp_DropDown")
		public WebElement uIInsuranceCompanyComboBox;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uIOtherVehicleInformationEdit;

		@FindBy(how = How.ID, using = "grdVehicle")
		public WebElement uIVehicleTable;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "nmcIncident_imgSrch")
		public WebElement uINameInfoIcon;
		
		  @FindBy(how = How.ID, using = "cmdSave")
	        public WebElement uISaveButton;

	        @FindBy(how = How.ID, using = "cmdSaveNClose")
	        public WebElement uISaveNCloseButton;
	}

	public class CaseNames {

		public WebDriver driver;

		public CaseNames() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "nmcIncident_imgSrch")
		public WebElement uINamesSearchButton;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.NAME, using = "nmcIncident$imgSrch")
		public WebElement uINameInfoIcon;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdCBENames'] //img[@id='grdCBENames_it35_0_imgNameVictim']")
		public WebElement uIVictimOffenderIcon;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdCBENames'] //img[@id='grdCBENames_it36_0_imgDVName']")
		public WebElement uIDomesticViolenceIcon;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdCBENames'] //img[@id='grdCBENames_it37_2_imgLEOKA1']")
		public WebElement uILeokaIcon;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tab0'] //td[@class = 'statusBar']")
		public WebElement uILeftSideStatusBar;

		@FindBy(how = How.ID, using = "chkLEOKA")
		public WebElement uILEOKACheckbox;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdCBENames']")
		public WebElement uINamesTable;

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "CBEReports")
		public WebElement uIPopupCopyNamesGridTable;

		@FindBy(how = How.ID, using = "cmdCopy")
		public WebElement uIPopupNamesCopyButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uIPopupNamesCancelButton;

		@FindBy(how = How.ID, using = "txtSortSeqNo")
		public WebElement uISortNoEdit;

		@FindBy(how = How.ID, using = "cmdUseOfForce")
		public WebElement uIUseOfForceButton;

		@FindBy(how = How.ID, using = "grdUseOfForce")
		public WebElement uIPopupUseOfForceGridTable;

		@FindBy(how = How.ID, using = "close")
		public WebElement uIPopupUseOfForceCloseIcon;

		@FindBy(how = How.ID, using = "nmJuvenile_NameType")
		public WebElement uIParantGaurdianNameTypeEdit;

		@FindBy(how = How.ID, using = "nmJuvenile_NameTypeID")
		public WebElement uIParantGaurdianNameTypeIDEdit;

		@FindBy(how = How.ID, using = "cddJuvenileReletionship_DropDown")
		public WebElement uIReletionshipComboBox;

		@FindBy(how = How.ID, using = "cddReciprocalRelationship_DropDown")
		public WebElement uIReciprocalRelationshipComboBox;

		@FindBy(how = How.ID, using = "lblJuvenileRelationShip")
		public WebElement uIReletionshipLabel;

		@FindBy(how = How.ID, using = "lblReciprocalRelationship")
		public WebElement uIReciprocalRelationshipLabel;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;
		
		@FindBy(how = How.ID, using = "imgQAForm")
		public WebElement uIQaFormIcon;
		
		@FindBy(how = How.ID, using = "imgVictimOffender")
		public WebElement uIVictimOffendrOuterIcon;

		@FindBy(how = How.ID, using = "imgUOFReport")
        public WebElement uIUseOfForceReportButton;


        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIRefreshIcon;

      //imgDomesticViolence
        @FindBy(how = How.ID, using = "imgDomesticViolence")
        public WebElement uIDVReportButton;
       
        //imgQAForm
        @FindBy(how = How.ID, using = "imgQAForm")
        public WebElement uIQAFormButton;
	}

	public class NameVictim {

		public WebDriver driver;

		public NameVictim() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcVictim_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcVictim_imgSrch")
		public WebElement uINameInfoButton;

		@FindBy(how = How.ID, using = "cddVictimType_DropDown")
		public WebElement uIVictimTypeComboBox;

		@FindBy(how = How.ID, using = "cddCFSCode")
		public WebElement uICFSComboBox;

		@FindBy(how = How.ID, using = "cddCFSCode")
		public WebElement uIChargeComboBox;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefresh;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdVicCFS']")
		public WebElement uIResultTable;

		@FindBy(how = How.ID, using = "'grdVicCFS_it12_0_imgOffender")
		public WebElement uIOffenderIcon;

		@FindBy(how = How.ID, using = "cddDomesVio_DropDown")
		public WebElement uIDomesticViolationComboBox;

		@FindBy(how = How.ID, using = "cddCircum1_DropDown")
		public WebElement uICircumstances1ComboBox;

		@FindBy(how = How.ID, using = "cddInjType_DropDown")
		public WebElement uIInjuryLevelComboBox;

		@FindBy(how = How.ID, using = "imgInjAdd")
		public WebElement uIInjuryLevelAddButton;

		@FindBy(how = How.ID, using = "cddAddCircum_DropDown")
		public WebElement uIJustifiableHomicideComboBox;

		@FindBy(how = How.ID, using = "cddCircum2_DropDown")
		public WebElement uICircumstances2ComboBox;
		
		@FindBy(how = How.ID, using = "txtVICSeq")
		public WebElement uIVicOffVicitmSequenceNo;
		
		@FindBy(how = How.ID, using = "nmcVictim")
		public WebElement uIVicOffVicitmName;
		
		@FindBy(how = How.ID, using = "txtContactName_NameType")
		public WebElement uIVicOffVicitmNameType;
		
		@FindBy(how = How.ID, using = "txtContactName_NameTypeID")
		public WebElement uIVicOffVicitmNameID;
		
		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIVicOffAddressText;
		
		@FindBy(how = How.ID, using = "lblNamedetails")
		public WebElement uIVicOffNameDetailsText;
		
		@FindBy(how = How.ID, using = "cddCFSCode_Input")
		public WebElement uIVicOffChargeOffenceRadInput;
		
		@FindBy(how = How.ID, using = "cddCFSCode_DropDown")
		public WebElement uIVicOffChargeOffenceRadDropdown;
		
		@FindBy(how = How.ID, using = "grdVicOff")
		public WebElement uIVicOffOffenderTable;
		
		@FindBy(how = How.ID, using = "grdVicOff_it6_0_drpRelation")
		public WebElement uIVicOff1RelationshipDropdown;
		
		@FindBy(how = How.ID, using = "grdVicOff_it6_1_drpRelation")
		public WebElement uIVicOff2RelationshipDropdown;
		
		@FindBy(how = How.ID, using = "cddVioType_DropDown")
		public WebElement uIVicOffViolencetypeDropdown;
		
		@FindBy(how = How.ID, using = "cddInjury_Input")
		public WebElement uIVicOffInjuryLevelInput;
		
		@FindBy(how = How.ID, using = "cddInjury_DropDown")
		public WebElement uIVicOffInjuryLevelDropDown;
		
		
		
	}

	public class VictimOffender {

		public WebDriver driver;

		public VictimOffender() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVictim_tmpl0_UsrOffender1_cddRelationship_DropDown")
		public WebElement uIRelationshipComboBox;

		@FindBy(how = How.ID, using = "tabVictim_tmpl0_UsrOffender1_cddOffndr")
		public WebElement uIOffenderComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "tabVictim_tmpl0_UsrOffender1_imgOffAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "tabVictim_tmpl0_UsrOffender1_ChkOffUnkn")
		public WebElement uIOffenderUnknownCheckBox;

	}

	public class DomesticViolence {
		public WebDriver driver;

		public DomesticViolence() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcVictim_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcVictim_imgSrch")
		public WebElement uINameInfoButton;

		@FindBy(how = How.ID, using = "drpOffender")
		public WebElement uIOffenderComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tab0'] //td[@class = 'statusBar']")
		public WebElement uILeftSideStatusBar;

	}

	public class LeokaScreen {

		public WebDriver driver;

		public LeokaScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkOfficerKilled")
		public WebElement uIOfficerKilledCheckbox;

		@FindBy(how = How.ID, using = "rdoByFerAct")
		public WebElement uIFeloniousActRadioButton;

		@FindBy(how = How.ID, using = "cddCircum_DropDown")
		public WebElement uICircumstanceComboBox;

		@FindBy(how = How.ID, using = "cddAssign_DropDown")
		public WebElement uITypeOfAssignmentComboBox;

		@FindBy(how = How.ID, using = "cddWeapon_DropDown")
		public WebElement uIWeaponUsedComboBox;

		@FindBy(how = How.ID, using = "rdoPersonInj")
		public WebElement uIPersonalInqCheckBox;

		@FindBy(how = How.ID, using = "rdoPoliceAss")
		public WebElement uIPoliceAssualtClearedCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

	}

	public class Questionnarie {

		public WebDriver driver;

		public Questionnarie() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cddForm_DropDown")
		public WebElement uISelectFormComboBox;

		@FindBy(how = How.ID, using = "cmdTakeTest")
		public WebElement uIFillFormButton;

		@FindBy(how = How.ID, using = "cmdrefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdQAForms")
		public WebElement uIResultTable;

	}

	public class QuestionDataEntry {
		public WebDriver driver;

		public QuestionDataEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupEntryOfficer_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "rdo100010000456301_0")
		public WebElement uIYesRadioButton;

		@FindBy(how = How.ID, using = "txt100010000456304")
		public WebElement uIEnterSomeTextEdit;

	}

	public class Narrative {
		public WebDriver driver;

		public Narrative() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_lstTextName")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdload")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdAddnew")
		public WebElement uIAddnewButton;

		@FindBy(how = How.XPATH, using = "//Table[@id = 'ctrlUsrKPITxtEdit_rteKPITxtWrapper']//iframe[@id = 'ctrlUsrKPITxtEdit_rteKPITxt_contentIframe']")
		public WebElement uINarrativeRichTextEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;
	}

	public class IBRSearch {
		public WebDriver driver;

		public IBRSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "nbrCaseNoEnd_Year")
		public WebElement uICaseYearToEdit;

		@FindBy(how = How.XPATH, using = "nbrCaseNoEnd_Number")
		public WebElement uICaseNumberToEdit;

		@FindBy(how = How.ID, using = "nbrCaseNoStart_Year")
		public WebElement uICaseYearFromEdit;

		@FindBy(how = How.ID, using = "nbrCaseNoStart_Number")
		public WebElement uICaseNumberFromEdit;

		@FindBy(how = How.ID, using = "grdSubInquiry")
		public WebElement uIIBRSearchTable;

	}

	public class DVEntry {
		public WebDriver driver;

		public DVEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "txtHours")
		public WebElement uITotalTimeSpentHourEdit;

		@FindBy(how = How.ID, using = "txtMin")
		public WebElement uITotalTimeSpentMinEdit;

		@FindBy(how = How.ID, using = "chkAlcholInv")
		public WebElement uIAlcoholInolvedCheckBox;

		@FindBy(how = How.ID, using = "chkOthDrugInv")
		public WebElement uIotherDrugsInvolvedCheckBox;

		@FindBy(how = How.ID, using = "cddDomesticViolence_DropDown")
		public WebElement uIDomesticViolenceRestrainingComboBox;

		@FindBy(how = How.ID, using = "nmcVictim_LastName")
		public WebElement uIVictimLastNameEdit;

		@FindBy(how = How.ID, using = "nmcVictim_FirstName")
		public WebElement uIVictimFirstNameEdit;

		@FindBy(how = How.ID, using = "lblVicSex")
		public WebElement uIVictimLabelSexTextView;

		@FindBy(how = How.ID, using = "lblVicRace")
		public WebElement uIVictimLableRaceTextView;

		@FindBy(how = How.ID, using = "chkVictPreg")
		public WebElement uIPergenantCheckBox;

		@FindBy(how = How.ID, using = "chkPscyn")
		public WebElement uIDisabledPsycologicalCheckBox;

		@FindBy(how = How.ID, using = "chkChildInvol")
		public WebElement uIChildrenInolvedCheckBox;

		@FindBy(how = How.ID, using = "chkDatingRel")
		public WebElement uIDatingRelationshipCheckBox;

		@FindBy(how = How.ID, using = "chkPhysical")
		public WebElement uIDisabledPhysicalCheckBox;

		@FindBy(how = How.ID, using = "chkChildPresent")
		public WebElement uIChildPresentCheckBox;

		@FindBy(how = How.ID, using = "chkIsAbandonment")
		public WebElement uIDisabledor60YearsOldCheckBox;

		@FindBy(how = How.ID, using = "cddOffRel_DropDown")
		public WebElement uIVORelationshipComboBox;

		@FindBy(how = How.ID, using = "drpOffender")
		public WebElement uIOffenderNameComboBox;

		@FindBy(how = How.ID, using = "cddOffenderHouseHold_DropDown")
		public WebElement uIHouseHoldStatusComboBox;

		@FindBy(how = How.ID, using = "cddDefArrested_DropDown")
		public WebElement uIArrestedForComboBox;

		@FindBy(how = How.ID, using = "chkdomesticViolence")
		public WebElement uIHasADVOrderCheckBox;

		@FindBy(how = How.ID, using = "chkincidentInvolve")
		public WebElement uIDoesThisIncidentInolvedCheckBox;

		@FindBy(how = How.ID, using = "chkDVrestraining")
		public WebElement uIAsAResultOfThisIncidentCheckBox;

		@FindBy(how = How.ID, using = "chkOffSuic")
		public WebElement uIOffenderCommitSucideCheckBox;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "chkGun")
		public WebElement uIGunCheckBox;

		@FindBy(how = How.ID, using = "chkKnife")
		public WebElement uIKnifeCheckBox;

		@FindBy(how = How.ID, using = "chkOther")
		public WebElement uIOtherDangerousCheckBox;

		@FindBy(how = How.ID, using = "cddOffenseComplaint_DropDown")
		public WebElement uIOffenseComplaintComboBox;

		@FindBy(how = How.ID, using = "cddDegreeInjury_DropDown")
		public WebElement uIDegreeInjuryComboBox;

		@FindBy(how = How.ID, using = "txtAdultMale")
		public WebElement uIAdultMaleEdit;

		@FindBy(how = How.ID, using = "txtAdultFemale")
		public WebElement uIAdultFemaleEdit;

		@FindBy(how = How.ID, using = "txtJuvenMale")
		public WebElement uIJuvinalMaleEdit;

		@FindBy(how = How.ID, using = "lblOffSex")
		public WebElement uIOffenderLabelSexTextView;

		@FindBy(how = How.ID, using = "lblOffRace")
		public WebElement uIOffenderLableRaceTextView;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uILeftSideStatusBar;

		@FindBy(how = How.XPATH, using = "//div[@class = 'modal-body']")
		public WebElement uIWarningMessageTextView;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
		public WebElement uIYesButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'No')]")
		public WebElement uINoButton;
															
		@FindBy(how = How.ID, using = "lblOffAgeCode")
		public WebElement uIOffenderLabelAgeTextView;

		@FindBy(how = How.ID, using = "dttmReported_Date_KPIDttmCtrl")
		public WebElement uIReportedDateEdit;

		@FindBy(how = How.XPATH, using = "//span[@id='dttmReported_divDateTime']//td//table//tbody//tr//td//input[contains(@class,'textboxdatetime')]")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;
		
		@FindBy(how = How.ID, using = "nbrCaseNumber_imgBtn")
		public WebElement uICaseInfoIcon;

	}

	public class DVSearch {
		public WebDriver driver;

		public DVSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIReportedDateClearButton;

		@FindBy(how = How.ID, using = "nbrCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "txtVLastName")
		public WebElement uIVictimLastNameEdit;

		@FindBy(how = How.ID, using = "txtVFirstName")
		public WebElement uIVictimFirstNameEdit;

		@FindBy(how = How.ID, using = "grdDVSearch")
		public WebElement uIDVSearchTable;

		@FindBy(how = How.ID, using = "dttFrom_Date_KPIDttmCtrl")
		public WebElement uIReportedDateFromEdit;

		@FindBy(how = How.ID, using = "dttmTo_Date_KPIDttmCtrl")
		public WebElement uIReportedDateToEdit;

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerCodeEdit;

		@FindBy(how = How.ID, using = "radVORel")
		public WebElement uIVORelationshipCombobox;

		@FindBy(how = How.ID, using = "txtOLastName")
		public WebElement uIOffenderLastNameEdit;

		@FindBy(how = How.ID, using = "txtOFirstName")
		public WebElement uIOffenderFirstNameEdit;

		@FindBy(how = How.ID, using = "RadOffComplaint")
		public WebElement uIOffenseComplaintComboBox;

		@FindBy(how = How.ID, using = "chkAlcohol")
		public WebElement uIAlcoholInvolvedCheckbox;

		@FindBy(how = How.ID, using = "chkOthDrugs")
		public WebElement uIOtherDrigsInvolvedCheckbox;

		@FindBy(how = How.ID, using = "chkChildInv")
		public WebElement uIChildrenInvolvedCheckbox;

	}

	public class OpenRecordsRequest {

		public WebDriver driver;

		public OpenRecordsRequest() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "numCaseNbr_Year")
		public WebElement uIRelatedCaseNoYearEdit;

		@FindBy(how = How.ID, using = "numCaseNbr_Number")
		public WebElement uIRelatedCaseNumberEdit;

		@FindBy(how = How.ID, using = "grdORRequest")
		public WebElement uIOpenRecordsRequestTable;

		@FindBy(how = How.ID, using = "txtPhone")
		public WebElement uIPhoneNoEdit;

		@FindBy(how = How.ID, using = "numCallNbr_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "numCallNbr_Number")
		public WebElement uICallNoEdit;

		@FindBy(how = How.ID, using = "lupAssignedTo_imgBtn")
		public WebElement uIAssignedToLookupIcon;

		@FindBy(how = How.ID, using = "dttmClosedDttm_Date_KPIDttmCtrl")
		public WebElement uIClosedDateEdit;

		@FindBy(how = How.ID, using = "lupAssignedTo_CodeValue")
		public WebElement uIAssignedToEdit;

		@FindBy(how = How.ID, using = "numCaseNbr_Number")
		public WebElement uICaseNoEdit;

		@FindBy(how = How.ID, using = "numCaseNbr_Year")
		public WebElement uICaseYearEdit;


		@FindBy(how = How.ID, using = "nbrRequestNumber_Year")
        public WebElement uIRequestNoYearEdit;
        
        @FindBy(how = How.ID, using = "nbrRequestNumber_Number")
        public WebElement uIRequestNoEdit;
    
        @FindBy(how = How.ID, using = "Namectrl1_LastName")
        public WebElement uILastName;
        
        @FindBy(how = How.ID, using = "Namectrl1_FirstName")
        public WebElement uIFirstName;
	}

	public class OpenRecordsRequestHelpWindow {
		public WebDriver driver;

		public OpenRecordsRequestHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Refresh')])")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "grdORRequest")
		public WebElement uIOpenRecordsRequestTable;

	}

	public class OpenRecordRequestEntry {

		public RequestDetailsTab requestDetailsTab;
		public ActivityHistoryTab activityHistoryTab;
		public OpenRecordRequestFeesTab openRecordRequestFeesTab;
		public WebDriver driver;

		public OpenRecordRequestEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.requestDetailsTab == null)) {
				this.requestDetailsTab = new RequestDetailsTab();
			}

			if ((this.activityHistoryTab == null)) {
				this.activityHistoryTab = new ActivityHistoryTab();
			}

			if ((this.openRecordRequestFeesTab == null)) {
				this.openRecordRequestFeesTab = new OpenRecordRequestFeesTab();
			}
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Request Details')])")
		public WebElement uIRequestDetailsTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Activity History')])")
		public WebElement uIActivityHistoryTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Fees')])")
		public WebElement uIFeesTab;

		@FindBy(how = How.ID, using = "dttmReceivedDttm_Date_KPIDttmCtrl")
		public WebElement uIReceivedDateEdit;

		@FindBy(how = How.ID, using = "dttmDueDate_KPIDttmCtrl")
		public WebElement uIDueByDateEdit;

		@FindBy(how = How.ID, using = "lupRequestType_DropDown")
		public WebElement uIRequestTypeComboBox;

		@FindBy(how = How.ID, using = "numCaseNbr_Year")
		public WebElement uIRelatedCaseYearEdit;

		@FindBy(how = How.ID, using = "numCaseNbr_Number")
		public WebElement uIRelatedCaseNumberEdit;

		@FindBy(how = How.ID, using = "txtTotalPages")
		public WebElement uITotalPagesEdit;

		@FindBy(how = How.ID, using = "radOpen")
		public WebElement uIStatusOpenRadioButton;

		@FindBy(how = How.ID, using = "radClose")
		public WebElement uIStatusCloseRadioButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "lblStatus")
		public WebElement uIStatusTextView;

		@FindBy(how = How.ID, using = "lblOpenDays")
		public WebElement uIStatusDueDateTextView;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachments')])")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.ID, using = "lupAssignedTo_CodeValue")
		public WebElement uIAssignedToEdit;

		@FindBy(how = How.ID, using = "numCallNbr_Year")
		public WebElement uICallyearEdit;

		@FindBy(how = How.ID, using = "numCallNbr_Number")
		public WebElement uICallNoEdit;

		@FindBy(how = How.ID, using = "lupAssignedTo_imgBtn")
		public WebElement uIAssignedToLookUpButton;
		@FindBy(how = How.ID, using = "nbrRequestNumber_Year")
		public WebElement uIRequestYearEdit;
		
		@FindBy(how = How.ID, using = "nbrRequestNumber_Number")
		public WebElement uIRequestNoEdit;
		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
		public WebElement uILeftSideStatusBar;
	}

	public class RequestDetailsTab {

		public WebDriver driver;

		public RequestDetailsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabORR_tmpl0_ctrlUsrORRRequest_NmComplaintName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabORR_tmpl0_ctrlUsrORRRequest_NmComplaintName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabORR_tmpl0_ctrlUsrORRRequest_txtRequestDetails")
		public WebElement uIRequestInformationDetailsEdit;

		@FindBy(how = How.ID, using = "tabORR_tmpl0_ctrlUsrORRRequest_addrAddress_txtFrom")
		public WebElement uIAddressEdit;
		
		@FindBy(how = How.ID, using = "tabORR_tmpl0_ctrlUsrORRRequest_custHeaderCSZ_City")
		public WebElement uICSZ;
		
		@FindBy(how = How.ID, using = "tabORR_tmpl0_ctrlUsrORRRequest_custHeaderCSZ_Zip")
		public WebElement uIPincode;

	}

	public class ActivityHistoryTab {
		public WebDriver driver;

		public ActivityHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtDate_Date_KPIDttmCtrl")
		public WebElement uIUpdatedDateEdit;

		@FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
		public WebElement uIUpdatedByCodeEdit;

		@FindBy(how = How.ID, using = "txtLog")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "chkShowAll")
		public WebElement uIShowSystemCommentsCheckbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIAddButton;

		@FindBy(how = How.XPATH, using = "//div[@class ='HistoryComments']")
		public WebElement uIActivityHistorytable;

		@FindBy(how = How.ID, using = "listMsg_ctl00_imgEdit")
		public WebElement uIPencilEditImageButton;

		@FindBy(how = How.ID, using = "txtDurationtMin")
        public WebElement uIDurationMinEdit;
		
        @FindBy(how = How.ID, using = "txtDurationHrs")
        public WebElement uIDurationHourEdit;

        @FindBy(how = How.XPATH, using = "(//table[@id='listMsg']//table//table//td)[1]")
		public WebElement uIActivityHistoryDateVerify;
		
		@FindBy(how = How.XPATH, using = "(//table[@id='listMsg']//table//table//td)[1]")
		public WebElement uIActivityHistoryTopSystemCommentVerify;
		
		@FindBy(how = How.XPATH, using = "(//table[@id='listMsg']//table//table//td)[3]")
		public WebElement uIActivityHistoryUpdatedByVerify;
		

	}

	public class OpenRecordRequestFeesTab {
		public WebDriver driver;

		public OpenRecordRequestFeesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddItemCode")
		public WebElement uIItemCodeComboBox;

		@FindBy(how = How.ID, using = "txtQty")
		public WebElement uIQtyEdit;

		@FindBy(how = How.ID, using = "txtRate")
		public WebElement uIRateEdit;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdInvoice")
		public WebElement uIFeesTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "txtTotalInvoiceAmt")
		public WebElement uITotalInvoiceAmountEdit;

		@FindBy(how = How.ID, using = "txtBalanceInvoiceAmt")
		public WebElement uIBalanceInvoiceAmountEdit;

		@FindBy(how = How.ID, using = "cmdRecPaym")
		public WebElement uIReceivePaymentButton;

		@FindBy(how = How.ID, using = "txtInvoice")
		public WebElement uIInvoiceNoEdit;
		
		@FindBy(how = How.ID, using = "txtAmount")                              
		public WebElement uIAmountEdit;
		
		@FindBy(how = How.ID, using = "txtConditionNotes")
		public WebElement uIConditionEdit;
		
		@FindBy(how = How.ID, using = "chkprint")
		public WebElement uIPrintConditions;

	}

	public class UOFSearchHelpWindow {
		public WebDriver driver;

		public UOFSearchHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdUseOfForce")
		public WebElement uIUseOfForceTabGridTable;

		@FindBy(how = How.ID, using = "nbrCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uILocationEdit;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;
	}

	public class UOFEntry {
		public WebDriver driver;
		public IncidentSubjectInformationTab incidentSubjectInformationTab;
		public TypeOfForceTab typeOfForceTab;
		public OfficerInformationTab officerInformationTab;
		public UOFDispositionTab uOFDispositionTab;
		public InjuryReportTab injuryReportTab;
		public ApprovalTab approvalTab;

		public UOFEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.incidentSubjectInformationTab == null)) {
				this.incidentSubjectInformationTab = new IncidentSubjectInformationTab();
			}

			if ((this.typeOfForceTab == null)) {
				this.typeOfForceTab = new TypeOfForceTab();
			}

			if ((this.officerInformationTab == null)) {
				this.officerInformationTab = new OfficerInformationTab();
			}

			if ((this.uOFDispositionTab == null)) {
				this.uOFDispositionTab = new UOFDispositionTab();
			}

			if ((this.injuryReportTab == null)) {
				this.injuryReportTab = new InjuryReportTab();
			}
			if ((this.approvalTab == null)) {
				this.approvalTab = new ApprovalTab();
			}
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNumber_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "nbrUOFNumber_Year")
		public WebElement uIUOFYearEdit;

		@FindBy(how = How.ID, using = "nbrUOFNumber_Number")
		public WebElement uIUOFNumberEdit;

		@FindBy(how = How.ID, using = "lupOffPF_CodeValue")
		public WebElement uIOfficerPFCodeEdit;

		@FindBy(how = How.ID, using = "NmSubjectName_LastName")
		public WebElement uISubjectLastNameEdit;

		@FindBy(how = How.ID, using = "NmSubjectName_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "NmSubjectName_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "NmSubjectName_FirstName")
		public WebElement uISubjectFirstNameEdit;

		@FindBy(how = How.ID, using = "addrAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "dttmUOFTime_Date_KPIDttmCtrl")
		public WebElement uIUOFDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmUOFTime_Time']//input")
		public WebElement uIUOFTimeEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Incident & Subject Information')]")
		public WebElement uIIncidentSubjectInformationTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Type of Force')]")
		public WebElement uITypeofForceTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Officer Information')]")
		public WebElement uIOfficerInformationTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Disposition')]")
		public WebElement uIDispositionTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Injury Report')]")
		public WebElement uIInjuryReportTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approval')]")
		public WebElement uIApprovalTab;

		@FindBy(how = How.ID, using = "nbrCaseNumber_imgBtn")
		public WebElement uIRelatedCaseNumberInfoIcon;

		@FindBy(how = How.XPATH, using = "//div[@class = 'modal-body']")
		public WebElement uIWarningMessageTextView;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
		public WebElement uIYesButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'No')]")
		public WebElement uINoButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteIcon;

		@FindBy(how = How.ID, using = "NmSubjectName_imgSrch")
		public WebElement uISubjectNameInfoIcon;

		@FindBy(how = How.ID, using = "lupOffPF_CodeDescription")
		public WebElement uIOfficerdescriptionEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIStatusLabel;

	}

	public class IncidentSubjectInformationTab {
		public WebDriver driver;

		public IncidentSubjectInformationTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddLocationType_DropDown")
		public WebElement uILocationTypeComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddPatrolArea_DropDown")
		public WebElement uIPatrolAreaComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddReasonInitialContact_DropDown")
		public WebElement uIReasonInitialContactComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddSupPre_DropDown")
		public WebElement uIWasSupervisorPresentComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_lupCharge_CodeValue")
		public WebElement uIChargeCodeEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_lupCharge_imgBtn")
		public WebElement uIChargeCodeLookupIcon;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_txtTotalOfc")
		public WebElement uITotalNoOfOfficersUsedForceEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_txtTotalOfcAgency")
		public WebElement uITotalNoOfOfficersUsedForceFromYourAgencyEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_lupSupervisorPF_CodeValue")
		public WebElement uISupervisorPFCodeEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_lupSupervisorPF_imgBtn")
		public WebElement uISupervisorPFLookupIcon;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddTotalOfc_DropDown")
		public WebElement uITotalNoOfOfficersUsedForceComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddTotalOfcAgency_DropDown")
		public WebElement uITotalNoOfOfficersUsedForceFromYourAgencyComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddPhyCond_DropDown")
		public WebElement uIListKnownMentalPhysicalConditionComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_rcConditions_Input")
		public WebElement uIConditionsInputComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_rcConditions_DropDown")
		public WebElement uIConditionsComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddSubWeapon_DropDown")
		public WebElement uIWasSubjectArmedWithWeaponComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_rcWeapons_Input")
		public WebElement uIWeaponsInputComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_rcWeapons_DropDown")
		public WebElement uIWeaponsComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_rcSubActions_Input")
		public WebElement uIListSubjectActionInputComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_rcSubActions_DropDown")
		public WebElement uIListSubjectActionComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_txtSubActions")
		public WebElement uISubjectActionsEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddSubInfluence_DropDown")
		public WebElement uIWasSubjectUnderInfluenceComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_lblMedAssistReq")
        public WebElement uIMedicalAssistanceRequiredLabel;
       
        @FindBy(how = How.ID, using = "tabUOF_tmpl0_ctrlusrISI_cddMedAssistReq_DropDown")
        public WebElement uIMedicalAssistanceRequiredDropDown;
	}

	public class TypeOfForceTab {
		public WebDriver driver;

		public TypeOfForceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_ImgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_txtForceSeq")
		public WebElement uIForceSeqNoEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_chkDisplay")
		public WebElement uIDisplayOnlyCheckBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_cddTOF_DropDown")
		public WebElement uIListtheTypeofForceUsedOfficerComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_cddEffectiveness_DropDown")
		public WebElement uIEffectivenessComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_grdTOF")
		public WebElement uITypeOfForceTabGridTable;

		@FindBy(how = How.ID, using = "tabUOF_tmpl1_ctrlusrTOF_imgAdd")
		public WebElement uIUpdateButton;
	}

	public class OfficerInformationTab {
		public WebDriver driver;

		public OfficerInformationTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabUOF_tmpl2_ctrlusrOI_cddOffFullTime_DropDown")
		public WebElement uIOfficerFullTimeEmployeeComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl2_ctrlusrOI_cddOnDuty_DropDown")
		public WebElement uIWasOfficerOnDutyComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl2_ctrlusrOI_cddOffInjured_DropDown")
		public WebElement uIWasOfficerInjuredComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl2_ctrlusrOI_rcInjuries_Input")
		public WebElement uIOfficersInjuriesInputComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl2_ctrlusrOI_rcInjuries_DropDown")
		public WebElement uIOfficersInjuriesComboBox;
	}

	public class UOFDispositionTab {
		public WebDriver driver;

		public UOFDispositionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabUOF_tmpl4_ctrlusrDisposition_lupDisPFID_CodeValue")
		public WebElement uIDispositionPFNoEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl4_ctrlusrDisposition_dttmDisp_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabUOF_tmpl4_ctrlusrDisposition_dttmDisp_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl4_ctrlusrDisposition_cddDisposition_DropDown")
		public WebElement uIDispositionComboBox;

		@FindBy(how = How.ID, using = "tabUOF_tmpl4_ctrlusrDisposition_rteKPITxt_contentIframe")
		public WebElement uINotesRichTextEdit;

		@FindBy(how = How.ID, using = "tabUOF_tmpl4_ctrlusrDisposition_lupDisPFID_CodeDescription")
		public WebElement uIDispositionPFDescription;
		
		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uINotesRichTextEdit1;
	}

	public class InjuryReportTab {
		public InjuredPartsPanel injuredPartsPanel;
		public WebDriver driver;

		public InjuryReportTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.injuredPartsPanel == null)) {
				this.injuredPartsPanel = new InjuredPartsPanel();
			}
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISave;

		@FindBy(how = How.XPATH, using = "//g[@id='119']//path")
		public WebElement uIInjuredFrontUpperLeftChest;

		@FindBy(how = How.XPATH, using = "//div[@class = 'ng-pristine ng-untouched ng-valid ng-empty ng-valid-maxlength']")
		public WebElement uIInjuredPartDescription;

		@FindBy(how = How.XPATH, using = "//div[@id='injured - parts']/ul/li/div[2]/p[2]/input")
		public WebElement uIInjuredPartPanel;

		@FindBy(how = How.XPATH, using = "//div[@class='panel']//*[name()='g' and @id='212']")
		public WebElement uIInjuredRearRightShoulder;

		@FindBy(how = How.ID, using = "rdoOfficer")
		public WebElement uIOfficerRadioButton;

		@FindBy(how = How.ID, using = "rdoSub")
		public WebElement uISubjectRadioButton;
		@FindBy(how = How.XPATH, using = "//label[text()='Subject'and@for='rdoSub']")
		public WebElement uISubjectLabel;
		
		@FindBy(how = How.XPATH, using = "//label[text()='Officer']")
		public WebElement uIOfficerLabel;
	}

	public class InjuredPartsPanel {

	}

	public class ApprovalTab {
		public WebDriver driver;

		public ApprovalTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstStatus")
		public WebElement uINewActionDropdown;

		@FindBy(how = How.XPATH, using = "//input[@id='dttStatusDttm_Date_KPIDttmCtrl']")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveApprovalTab;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIApprovalStatusLabel;
		
		@FindBy(how = How.XPATH, using = "(//table[@id='listMsg']//td[5])[1]")
		public WebElement uIStatusInGrid ;
		
		@FindBy(how = How.ID, using = "cddRejCode_DropDown")
		public WebElement uIRejectionCodeDropDown;
		
		@FindBy(how = How.ID, using = "lblrejcountvalue")
		public WebElement uIRejectionCount;

	}

	public class UOFSearch {
		public WebDriver driver;

		public UOFSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nbrCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "nbrUOFNo_Year")
		public WebElement uIUOFYearEdit;

		@FindBy(how = How.ID, using = "nbrUOFNo_Number")
		public WebElement uIUOFNumberEdit;

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerPFCodeEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "grdUseOfForce")
		public WebElement uIUseOfForceSearchGridTable;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIDateResetIcon;

		@FindBy(how = How.ID, using = "txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "cddTypeOfForceUsed_Input")
		public WebElement uITypeOfForceRadInput;
		
		
		@FindBy(how = How.ID, using = "cddTypeOfForceUsed_DropDown")
		public WebElement uITypeOfForceRadDropDown;
		
		
		@FindBy(how = How.ID, using = "cddEffectiveness_DropDown")
		public WebElement uIEffectivenessComboBox;
	}

	public class CaseUnits {
		public WebDriver driver;

		public CaseUnits() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtDispatched")
		public WebElement uIDispatchedEdit;

		@FindBy(how = How.ID, using = "txtDisposition")
		public WebElement uIDispositionEdit;

		@FindBy(how = How.ID, using = "lupUnit_CodeValue")
		public WebElement uIUnitEdit;

		@FindBy(how = How.ID, using = "lupUnit_imgBtn")
		public WebElement uIUnitLookupButton;

		@FindBy(how = How.ID, using = "lupOfficer1_CodeValue")
		public WebElement uIOfficer1Edit;

		@FindBy(how = How.ID, using = "lupOfficer2_CodeValue")
		public WebElement uIOfficer2Edit;

		@FindBy(how = How.ID, using = "cddCommandCodes_DropDown")
		public WebElement uICCComboBox;

		@FindBy(how = How.ID, using = "cddDisposition_DropDown")
		public WebElement uIDispositionComboBox;

		@FindBy(how = How.ID, using = "imgAddUnit")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdCBEUnitHistory")
		public WebElement uICaseUnitsGridTable;

		@FindBy(how = How.ID, using = "dttUnitCC_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttUnitCC_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "txtFinished")
		public WebElement uIFinishedEdit;
		
		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;
		
		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
		public WebElement uILeftSideStatusBar;
	}

	public class ALCScreen {
		public WebDriver driver;
		public ALCScreenPFTab aLCScreenPFTab;

		public ALCScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.aLCScreenPFTab == null)) {
				this.aLCScreenPFTab = new ALCScreenPFTab();
			}
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'PF#')]")
		public WebElement uIPFTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

	}

	public class ALCScreenPFTab {

		public WebDriver driver;

		public ALCScreenPFTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_cddAction_DropDown")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_lupPF_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_cmdAddPF")
		public WebElement uIAddButton;

	}

	public class ReportStatusScreenTab {
		public WebDriver driver;

		public ReportStatusScreenTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdCBEReports")
		public WebElement uISearchResultGrid;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "lstReportStatus")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "chkMyItem")
		public WebElement uIShowMyItemOnlyCheckBox;

	}

	public class BoloScreenTab {
		public WebDriver driver;

		public BoloScreenTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdEditBoloText")
		public WebElement uIEditBoloTextButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;
	}

	public class ComplaintEntry {
		public WebDriver driver;
		public ComplaintsDetailsTab complaintsDetailsTab;

		public ComplaintEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.complaintsDetailsTab == null)) {
				this.complaintsDetailsTab = new ComplaintsDetailsTab();
			}
		}

		@FindBy(how = How.ID, using = "nbrComplaintNumber_Year")
		public WebElement uIComplaintYearEdit;

		@FindBy(how = How.ID, using = "nbrComplaintNumber_Number")
		public WebElement uIComplaintNumberEdit;

		@FindBy(how = How.ID, using = "dttmReported_Date_KPIDttmCtrl")
		public WebElement uIReportedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmReported_Time']//input")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "cddCompType_DropDown")
		public WebElement uIComplaintTypeComboBox;

		@FindBy(how = How.ID, using = "NmRawEntryComplaintAgainst_LastName")
		public WebElement uIComplaintAgainstLastNameEdit;

		@FindBy(how = How.ID, using = "NmRawEntryComplaintAgainst_FirstName")
		public WebElement uIComplaintAgainstFirstNameEdit;

		@FindBy(how = How.ID, using = "addrAddress_txtFrom")
		public WebElement uIIncidentLocationEdit;

		@FindBy(how = How.ID, using = "addrAddress_chkVerify")
		public WebElement uIIncidentLocationVerifyCheckbox;

		@FindBy(how = How.ID, using = "CddAgencyEmpBy_DropDown")
		public WebElement uIAgencyEmployedByComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "chkAnonymous")
		public WebElement uIAnonymousCheckbox;

		@FindBy(how = How.ID, using = "txtComplaintAgainst")
		public WebElement uIComplaintAgainstEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Complaint Details')]")
		public WebElement uIComplaintDetailsTab;

		@FindBy(how = How.ID, using = "cddIncCategory_DropDown")
		public WebElement uIIncidentCategoryComboBox;

	}

	public class ComplaintsDetailsTab {
		public WebDriver driver;

		public ComplaintsDetailsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_ChkAnonymous")
		public WebElement uIAnonymousCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_cddComplaintBy_DropDown")
		public WebElement uIComplaintByComboBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_cddReceiveSource_DropDown")
		public WebElement uIReceiveSourceComboBox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_NmComplaintName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_NmComplaintName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_addrAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_addrAddress_chkVerify")
		public WebElement uIAddressVerifyCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_nbrOtherAgency_Year")
		public WebElement uILocalAgencyCallYearEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_nbrOtherAgency_Number")
		public WebElement uILocalAgencyCallNumberEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_dttmIncidentDttm_Date_KPIDttmCtrl")
		public WebElement uIIncidentDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabCBE_tmpl0_CtrlusrCBECompDtl_dttmIncidentDttm_Time']//input")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_AddrCompLocation_txtFrom")
		public WebElement uIComplaintLocationEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_AddrCompLocation_chkVerify")
		public WebElement uIComplaintLocationVerifyCheckbox;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_txtCompDtl")
		public WebElement uIComplaintDetailsEdit;

		@FindBy(how = How.ID, using = "tabCBE_tmpl0_CtrlusrCBECompDtl_cddComplaintBy_DropDown")
		public WebElement uIReportedByComboBox;
	}

	public class PursuitCaseEntry {
		public WebDriver driver;

		public PursuitCaseEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "lupOfficer_CodeDescription")
		public WebElement uIOfficerDescriptionEdit;

		@FindBy(how = How.ID, using = "lupSupOfficer_CodeValue")
		public WebElement uISupervisorEdit;

		@FindBy(how = How.ID, using = "chkTraffViol")
		public WebElement uITrafficViolationCheckbox;

		@FindBy(how = How.ID, using = "cddWeather_DropDown")
		public WebElement uIWeatherComboBox;

		@FindBy(how = How.ID, using = "chkWarrant")
		public WebElement uIWarrantCheckbox;

		@FindBy(how = How.ID, using = "chkSuspCrim")
		public WebElement uISuspectCriminalInvolmentCheckbox;

		@FindBy(how = How.ID, using = "lupOrgCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdPursuitCharge")
		public WebElement uIPursuitChargeTable;

		@FindBy(how = How.ID, using = "cddReasonPurTermin_DropDown")
		public WebElement uIReasonPursuitTerminatedComboBox;

		@FindBy(how = How.ID, using = "lupOrgCharge_imgBtn")
		public WebElement uIChargeLookupIcon;

		@FindBy(how = How.ID, using = "txtPeoplePursedVeh")
		public WebElement uINoPeoplePursedVehicleEdit;

		@FindBy(how = How.ID, using = "txtNoPeopleArrested")
		public WebElement uINoPeopleArrestedEdit;
		
		@FindBy(how = How.ID, using = "cddRoadSurface_DropDown")
		public WebElement uIRoadSurfaceComboBox;
	}

	public class IBRSubmissionScreenTab {
		public WebDriver driver;

		public IBRSubmissionScreenTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[@title = 'Submission']")
		public WebElement uISubmissionLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'ReSubmission')]")
		public WebElement uIReSubmissionLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Details')]")
		public WebElement uIDetailsLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'View Text File')]")
		public WebElement uIViewTextFileLink;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdSubInquiry")
		public WebElement uIIBRSubmissionTable;
	}

	public class IBRSubmissionEntry {
		public WebDriver driver;

		public IBRSubmissionEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdReport")
		public WebElement uIViewReportButton;

		@FindBy(how = How.ID, using = "dttSubTo_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "cmdIncData")
		public WebElement uIIncidentDataButton;

		@FindBy(how = How.ID, using = "cmdGenFile")
		public WebElement uIGenerateFileButton;

		@FindBy(how = How.ID, using = "cmdDetails")
		public WebElement uIDetailsButton;

		@FindBy(how = How.XPATH, using = "//div[@class = 'modal-body']")
		public WebElement uIWarningMessageTextView;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
		public WebElement uIYesButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'No')]")
		public WebElement uINoButton;

		@FindBy(how = How.XPATH, using = "//span[@id = 'btnDetailIncInfo']")
		public WebElement uIDetailInfoButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "nbrBatchNo_Year")
		public WebElement uIBatchYearEdit;

		@FindBy(how = How.ID, using = "nbrBatchNo_Number")
		public WebElement uIBatchNoEdit;

		@FindBy(how = How.ID, using = "cmdViewText")
		public WebElement uIViewTextFileButton;

	}

	public class ReportRelatedToPF {
		public WebDriver driver;

		public ReportRelatedToPF() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdCBEReports")
		public WebElement uIReportRelatedToPFTable;
	}

	public class ProfileSearch {
		public WebDriver driver;

		public ProfileSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;
		
		@FindBy(how = How.XPATH, using = "(//li[contains(@title,'Print')])")
		public WebElement uIPrintIcon;
		
		@FindBy(how = How.ID, using = "grdProfile")
		public WebElement uIProfileTable;

		@FindBy(how = How.ID, using = "tabProfile_tmpl0_ctrlUsrProfileMain_cddTow_DropDown")
		public WebElement uITowComboBox;

		@FindBy(how = How.ID, using = "tabProfile_tmpl0_ctrlUsrProfileMain_txtOccupants")
		public WebElement uITotalNoOfOccupantsInCarEdit;

		@FindBy(how = How.ID, using = "tabProfile_tmpl0_ctrlUsrProfileMain_chkCompleted")
		public WebElement uIInclideCompletedCheckbox;

		@FindBy(how = How.ID, using = "cddEthicity_DropDown")
		public WebElement uIEthicityofDriverComboBox;
		
		@FindBy(how = How.ID, using = "tabProfile_tmpl0_ctrlUsrProfileMain_nmcProNbr_Year")
		public WebElement uIProfileYearEdit;
		
		@FindBy(how = How.ID, using = "tabProfile_tmpl0_ctrlUsrProfileMain_nmcProNbr_Number")
		public WebElement uIProfileNoEdit;
	}

	public class VehicleProfile {
		public WebDriver driver;

		public VehicleProfile() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "nbrCallNbr_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNbr_Number")
		public WebElement uICallNoEdit;

		@FindBy(how = How.ID, using = "nbrCallNbr_imgBtn")
		public WebElement uICallInfoIcon;
		@FindBy(how = How.ID, using = "nbrProfileNbr_Year")
		public WebElement uIProfileYearEdit;

		@FindBy(how = How.ID, using = "nbrProfileNbr_Number")
		public WebElement uIProfileNoEdit;

		@FindBy(how = How.ID, using = "nbrCallNbr_imgBtn")
		public WebElement uICallNoInfoButton;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "dttmCall_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id ='dttmCall_Time'] //input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "txtLocCode")
		public WebElement uILocationCodeEdit;

		@FindBy(how = How.ID, using = "plcVeh_PlateNumber")
		public WebElement uIPlateNoEdit;

		@FindBy(how = How.ID, using = "plcVeh_KPIState")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "cddRace_DropDown")
		public WebElement uIRaceOfDriverComboBox;

		@FindBy(how = How.ID, using = "cddSex_DropDown")
		public WebElement uIDriverGenderComboBox;

		@FindBy(how = How.ID, using = "txtOccupants")
		public WebElement uITotalNoOfOccupantsInCarEdit;

		@FindBy(how = How.ID, using = "cddAssignStatus_DropDown")
		public WebElement uIAssignmentStatusComboBox;

		@FindBy(how = How.ID, using = "cddReason_DropDown")
		public WebElement uIReasonForStopComboBox;

		@FindBy(how = How.ID, using = "cddResult_DropDown")
		public WebElement uIResultOfStopComboBox;

		@FindBy(how = How.ID, using = "cddDuration_DropDown")
		public WebElement uIDurationOfStopComboBox;

		@FindBy(how = How.ID, using = "cddRoadClass_DropDown")
		public WebElement uIRoadClassificationComboBox;

		@FindBy(how = How.ID, using = "cddSrchAsStop_DropDown")
		public WebElement uISearchAsResultStopComboBox;

		@FindBy(how = How.ID, using = "cddTow_DropDown")
		public WebElement uITowComboBox;

		@FindBy(how = How.ID, using = "chkIsSuspicion")
		public WebElement uIReasonableSuspicionCheckbox;

		@FindBy(how = How.ID, using = "chkIsInventory")
		public WebElement uIInventoryCheckbox;

		@FindBy(how = How.ID, using = "chkIsDriver")
		public WebElement uIDriverCheckbox;

		@FindBy(how = How.ID, using = "chkIsVehicle")
		public WebElement uIVehicleCheckbox;

		@FindBy(how = How.ID, using = "chkIsDrugs")
		public WebElement uIDrugsDrugParaphernaliaCheckbox;

		@FindBy(how = How.ID, using = "chkIsWeapons")
		public WebElement uIWeaponsCheckbox;

		@FindBy(how = How.ID, using = "cddEthicity_DropDown")
		public WebElement uIEthicityofDriverComboBox;
		@FindBy(how = How.ID, using = "txtPlateType")
		
		public WebElement uIPlateTypeComboBox;
		
		@FindBy(how = How.ID, using = "txtRaceInfo")
		public WebElement uIOptionalRaceInfo;
		
		@FindBy(how = How.ID, using = "txtCitationNo_CitationNbr")
		public WebElement uICitationNo;
		
		@FindBy(how = How.ID, using = "txtCustom3")
		public WebElement uICustomField;
		@FindBy(how = How.ID, using = "cddResidency_DropDown")
		public WebElement uIResidencyComboBox;
		
		@FindBy(how = How.ID, using = "txtBirthYear")
		public WebElement uIDriverYearOfBirth;
		
		@FindBy(how = How.ID, using = "cddSpeed_DropDown")
		public WebElement uISpeedDeterminedByDropdown;
		
		@FindBy(how = How.ID, using = "txtRaceInfo")
        public WebElement uIOptionalRaceInformationEdit;
        
        @FindBy(how = How.ID, using = "cddResidency_DropDown")
        public WebElement uIResidencyDropDown;
       
        @FindBy(how = How.ID, using = "cddSpeed_DropDown")
        public WebElement uISpeedDeterminedByDropDown;
        
        @FindBy(how = How.ID, using = "lblTow")
        public WebElement uITowLabel;
        
		 @FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
        public WebElement uIFooterStatusLabel;
	}

	public class ViewTextFileEntry {
		public WebDriver driver;

		public ViewTextFileEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.TAG_NAME, using = "pre")
		public WebElement uIViewText;

	}

	public class NIBRSCheck {
		public WebDriver driver;

		public NIBRSCheck() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddNIBRSDispo_DropDown")
		public WebElement uIClearenceTypeComboBox;

		@FindBy(how = How.ID, using = "dttClearanceDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttClearanceDate_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "grdErrorCheck")
		public WebElement uINIBRSCheckTable;

		@FindBy(how = How.ID, using = "lblNoError")
		public WebElement uINoErrorLabel;

	}

	public class UOFDetail {
		public WebDriver driver;

		public UOFDetail() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

	}

	public class ReportStatusNarrative {

		public WebDriver driver;

		public ReportStatusNarrative() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtStmt")
		public WebElement uITextEdit;

		@FindBy(how = How.ID, using = "btnOfficeUseOnly")
		public WebElement uIOfficialUseOnlyButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;
		
		   @FindBy(how = How.ID, using = "cmdSave")
	        public WebElement uISaveButton;

	        @FindBy(how = How.ID, using = "cmdSaveNClose")
	        public WebElement uISaveAndCloseButton;

	        @FindBy(how = How.XPATH, using = "//body")
	        public WebElement uITextBody;
	        
	        @FindBy(how = How.XPATH, using = "//body//div//p//span")
	        public WebElement uITextEnteredtoBody;
	        
	        @FindBy(how = How.XPATH, using = "//li//a[@title='Font Name']")
	        public WebElement uIFontNameDropdown;
	        
	        @FindBy(how = How.XPATH, using = "//li//a[@title='Real font size']")
	        public WebElement uIFontSizeDropDown;
	     
	        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Arial')]")
	        public WebElement uIFontArial;
	        
	        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Courier New')]")
	        public WebElement uIFontCourierNew;
	        
	        @FindBy(how = How.XPATH, using = "//li//a[@title='Font Name']//span")
	        public WebElement uIFontNameDropdownvalue;
	        
	        @FindBy(how = How.XPATH, using = "//li//a[@title='Real font size']//span")
	        public WebElement uIFontSizeDropDownvalue;
	        
	        
	        @FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
	        public WebElement uITextFrame;
	      
	        @FindBy(how = How.CLASS_NAME, using = "Bold")
	        public WebElement uIBoldButton;
	}

    
    public class ReportStatusForRedact
    {
        public WebDriver driver;
        public ReportStatusForRedact()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
         
        }
        @FindBy(how = How.ID, using = "cmdFields") 
        public WebElement uIFieldsButton;
        
        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIReportStatusRefreshButton;
        
        @FindBy(how = How.ID, using = "cmdRptSave")
        public WebElement uISaveAndCloseButton;
        
        @FindBy(how = How.ID, using = "txtRedResaon")
        public WebElement uIReasonForRedact;
        
        @FindBy(how = How.ID, using = "cmdSaveReason")
        public WebElement uIReasonSaveNClose;
        
        @FindBy(how = How.ID, using = "btnRedCancel")
        public WebElement uIReasonCancel;
        
    }
    public class RedactExpungement
    {
    	public WebDriver driver;
        public RedactExpungement()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
         
        }
        @FindBy(how = How.ID, using = "grdFieldsData") 
        public WebElement uIFieldsTable;
        
        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

             
    }
    public class ReportStatusViewRedactReport
    {
    	public WebDriver driver;
        
        public ReportStatusViewRedactReport()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
         
        }
        @FindBy(how = How.ID, using = "grdRedact") 
        public WebElement uIRedactTable;
        
        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "lblAddDesc")
        public WebElement uIScreenLableMoreThanOneReport;
        
             
    }
    public class UseOfForceReportEntry
    {
    	public WebDriver driver;
        
        public UseOfForceReportEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
         
        }

        @FindBy(how = How.XPATH, using = "//span[text()='Add New']")
        public WebElement uIAddNewButton;

        @FindBy(how = How.XPATH, using = "//span[text()='Reset']")
        public WebElement uIResetButton;
    }
    
    public class PoliceForceTab{
        public WebDriver driver;
        
        public PoliceForceTab() {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
           
            }
        @FindBy(how = How.ID, using = "tabCBE_tmpl2_ctrlUsrPoliceForce_chkIsPhysical")
        public WebElement uIPhysicalForceCheckBox;
       
        @FindBy(how = How.ID, using = "tabCBE_tmpl2_ctrlUsrPoliceForce_chkIsVehicle")
        public WebElement uIVechicleForceCheckBox;
       
        @FindBy(how = How.ID, using = "tabCBE_tmpl2_ctrlUsrPoliceForce_chkIsDeadly")
        public WebElement uIDeadlyForceCheckBox;
       
       
    }
	 public class RepositoryEntry {
		public WebDriver driver;

		public RepositoryEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//input[@id='txtRepositoryID']")
		public WebElement uIRepositoryIDEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISave;
		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndClose;

		@FindBy(how = How.XPATH, using = "//input[@id='txtDefaultName']")
		public WebElement uIDefaultNameEdit;

		@FindBy(how = How.ID, using = "txtCustomName")
		public WebElement uICustomNameEdit;

		@FindBy(how = How.ID, using = "cddFieldUsage_DropDown")
		public WebElement uIFieldUsageComboBox;

	}
    public class PursuitReportEntry {
		public WebDriver driver;

		public PursuitReportEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "lupSupOfficer_CodeValue")
		public WebElement uISupervisorEdit;

		@FindBy(how = How.ID, using = "cddWeather_DropDown")
		public WebElement uIWeatherComboBox;

		@FindBy(how = How.ID, using = "cddRoadSurface_DropDown")
		public WebElement uIRoadSurfaceCombo;

		@FindBy(how = How.ID, using = "lupOrgCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdPursuitCharge']")
		public WebElement uIChargeGrid;

		@FindBy(how = How.ID, using = "txtInjPursedVeh")
		public WebElement uINoOFPeopleInjuredEdit;

		@FindBy(how = How.ID, using = "txtKIlledPursedVeh")
		public WebElement uINoOFPeoplekilledEdit;

		@FindBy(how = How.ID, using = "txtVehAccPursedVeh")
		public WebElement uINoOfPeopleInPursuedVechicleEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISave;

	}
	 public class DirectReportEntry{
    	public WebDriver driver;

		public DirectReportEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//input[@id='dttmReported_Date_KPIDttmCtrl']")
		public WebElement uIReportedDate;
		
		
		@FindBy(how = How.XPATH, using = "//input[@class='textboxdatetime igte_BlueThemeEditInContainer']")
		public WebElement uIReportedTime;
		
		@FindBy(how = How.ID, using = "addrCallCompletionLoc_txtFrom")
		public WebElement uILocation;
		
		@FindBy(how = How.ID, using = "nbrCaseNumber_Number")
		public WebElement uICaseNumberEdit;
		
		@FindBy(how = How.ID, using = "nbrCaseNumber_Year")
		public WebElement uIYearEdit;
		
		@FindBy(how = How.XPATH, using = "//input[@id='cmdSave']")
		public WebElement uISave;
		
		@FindBy(how = How.XPATH, using = "//input[@id='cmdSaveNClose']")
		public WebElement uISaveNClose;
    }
    
    public class SuspectSearch{
    	public WebDriver driver;

		public SuspectSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;
		
		@FindBy(how = How.ID, using = "grdSuspect")
		public WebElement uISuspectSearchResultgrid;
		
		}
    public class UnitHistorySearch{
    	public WebDriver driver;

		public UnitHistorySearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}
		@FindBy(how = How.ID, using = "lupOnCallOffID_CodeValue")
		public WebElement uIOfficerNoEdit;
		
		@FindBy(how = How.ID, using = "txtUnitRef")
		public WebElement uIUnitnameEdit;
		
		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;
		
		@FindBy(how = How.CLASS_NAME, using = "ighg_HGridExpandButton")
		public WebElement uIExpandButton;
		
		@FindBy(how = How.XPATH, using = "//div[@id='grdUnit_ctl00_21-000240_0']/table")
		public WebElement uIUnitHistorySearchTable;

		@FindBy(how = How.ID, using = "dtFromCallDate_Date_KPIDttmCtrl")
		public WebElement uIActionFromDateEdit;
		
		@FindBy(how = How.XPATH, using = "(//table[@id = 'dtFromCallDate_Time'] //input[@class='textboxdatetime igte_BlueThemeEditInContainer'])")
		public WebElement uIActionFromTimeEdit;
		
			
    }
    public class CaseUpdateMapTab {
		public WebDriver driver;

		public CaseUpdateMapTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "frmGHydrantMapHERE_Id")
		public WebElement uIFormName;

		@FindBy(how = How.ID, using = "lbllatLongvalue")
		public WebElement uILatLongTextView;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lbllatLongvalue']/font")
		public WebElement uILatLongValueTextView;

		@FindBy(how = How.ID, using = "btnUpdateLatLong")
		public WebElement uIUpdateLatLongButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//body/form[@id='frmGHydrantMapHERE_Id']/div[@id='map_canvas']/div[1]/div[3]/div[3]/div[2]/*[1]")
		public WebElement uILocationPointer;

	}
}