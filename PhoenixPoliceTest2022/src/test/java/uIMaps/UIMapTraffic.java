package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapTraffic {

	public CitationEntry citationEntry;
	public CitationSearch citationSearch;
	public CrashEntry crashEntry;
	public CrashSearch crashSearch;
	public CrashSearchHelpWindow crashSearchHelpWindow;
	public DeerCrash deerCrash;
	public ParkingEntry parkingEntry;
	public ParkingSearch parkingSearch;
	public ParkingOtherPayment parkingOtherPayment;
	public CitationComments citationComments;
	public CrashUnit crashUnit;
	public CrashComments crashComments;
	public TicketHoldReason ticketHoldReason;
	public ParkingPermits parkingPermits;
	public ParkingPermitsSearch parkingPermitsSearch;
	public ParkingPermitsAuthenticate parkingPermitsAuthenticate;
	public Court court;
	public CourtEntry courtEntry;
	public CitationArrest citationArrest;
	public KPICrimeSceneSDK kPICrimeSceneSDK;

	public UIMapTraffic() {
		if (this.citationEntry == null)
			this.citationEntry = new CitationEntry();
		if (this.citationSearch == null)
			this.citationSearch = new CitationSearch();
		if (this.crashEntry == null)
			this.crashEntry = new CrashEntry();
		if (this.crashSearch == null)
			this.crashSearch = new CrashSearch();
		if (this.crashSearchHelpWindow == null)
			this.crashSearchHelpWindow = new CrashSearchHelpWindow();
		if (this.deerCrash == null)
			this.deerCrash = new DeerCrash();
		if (this.parkingSearch == null)
			this.parkingSearch = new ParkingSearch();
		if (this.parkingEntry == null)
			this.parkingEntry = new ParkingEntry();
		if (this.parkingOtherPayment == null)
			this.parkingOtherPayment = new ParkingOtherPayment();
		if (this.citationComments == null)
			this.citationComments = new CitationComments();
		if (this.crashUnit == null)
			this.crashUnit = new CrashUnit();
		if (this.crashComments == null)
			this.crashComments = new CrashComments();
		if (this.ticketHoldReason == null)
			this.ticketHoldReason = new TicketHoldReason();
		if (this.parkingPermits == null)
			this.parkingPermits = new ParkingPermits();
		if (this.parkingPermitsSearch == null)
			this.parkingPermitsSearch = new ParkingPermitsSearch();
		if (this.parkingPermitsAuthenticate == null)
			this.parkingPermitsAuthenticate = new ParkingPermitsAuthenticate();
		if (this.court == null)
			this.court = new Court();
		if (this.courtEntry == null)
			this.courtEntry = new CourtEntry();
		if (this.citationArrest == null)
			this.citationArrest = new CitationArrest();
		if (this.crashComments == null)
			this.citationComments = new CitationComments();
		if (this.kPICrimeSceneSDK == null)
			this.kPICrimeSceneSDK = new KPICrimeSceneSDK();
	}

	public class CitationEntry {
		public ViolationsTab violationsTab;
		public LicenseTab licenseTab;
		public OffenseTab offenseTab;
		public PlaintiffTab plaintiffTab;
		public CitationEntryVehicleTab citationEntryVehicleTab;
		public OfficerTab officerTab;
		public CourtTab courtTab;
		public CitationEntryPaymentsTab citationEntryPaymentsTab;
		public CitationEntryNarrativeTab citationEntryNarrativeTab;
		public CitationEntryWitnessTab citationEntryWitnessTab;
		public CitationEntryCommentsTab citationEntryCommentsTab;
		public CitationEntryMapTab citationEntryMapTab;

		public WebDriver driver;

		public CitationEntry() {
			if (this.violationsTab == null)
				this.violationsTab = new ViolationsTab();

			if (this.licenseTab == null)
				this.licenseTab = new LicenseTab();

			if (this.offenseTab == null)
				this.offenseTab = new OffenseTab();

			if (this.plaintiffTab == null)
				this.plaintiffTab = new PlaintiffTab();

			if (this.citationEntryVehicleTab == null)
				this.citationEntryVehicleTab = new CitationEntryVehicleTab();

			if (this.officerTab == null)
				this.officerTab = new OfficerTab();

			if (this.courtTab == null)
				this.courtTab = new CourtTab();

			if (this.citationEntryPaymentsTab == null)
				this.citationEntryPaymentsTab = new CitationEntryPaymentsTab();

			if (this.citationEntryNarrativeTab == null)
				this.citationEntryNarrativeTab = new CitationEntryNarrativeTab();

			if (this.citationEntryWitnessTab == null)
				this.citationEntryWitnessTab = new CitationEntryWitnessTab();

			if (this.citationEntryCommentsTab == null)
				this.citationEntryCommentsTab = new CitationEntryCommentsTab();

			if (this.citationEntryMapTab == null)
				this.citationEntryMapTab = new CitationEntryMapTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkRptSelect")
		public WebElement uISelectedCheckbox;

		@FindBy(how = How.ID, using = "nbrCeID_Number")
		public WebElement uICENoEdit;

		@FindBy(how = How.ID, using = "cddCeType_DropDown")
		public WebElement uICETypeComboBox;

		@FindBy(how = How.ID, using = "dttmCeDttm_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmCeDttm_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "cddDefType_DropDown")
		public WebElement uIDefendantTypeComboBox;

		@FindBy(how = How.ID, using = "txtCitNbr")
		public WebElement uICitationNumberEdit;

		@FindBy(how = How.ID, using = "txtOverRite")
		public WebElement uIOverRiteNumberEdit;

		@FindBy(how = How.ID, using = "nNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "nNameID_imgSrch")
		public WebElement uINameInfoButton;

		@FindBy(how = How.ID, using = "nNameID_imgWant")
		public WebElement uIWarrantIconButton;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "cmdCopy")
		public WebElement uICopyButton;

		@FindBy(how = How.ID, using = "adrLocation_chkVerify")
		public WebElement uILocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Violations')]")
		public WebElement uIViolationsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Court')]")
		public WebElement uICourtTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Payments')]")
		public WebElement uIPaymentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'License')]")
		public WebElement uILicenseTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Vehicle')]")
		public WebElement uIVehicleTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Offense')]")
		public WebElement uIOffenseTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Plaintiff')]")
		public WebElement uIPlaintiffTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Officer')]")
		public WebElement uIOfficerTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Narrative')]")
		public WebElement uINarrativeTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Map')]")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approval')]")
		public WebElement uIApprovalTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Witness')]")
		public WebElement uIWitnessTab;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIApprovalStatusTextView;

		@FindBy(how = How.ID, using = "cmdSavePrint")
		public WebElement uISavePrintButton;

		@FindBy(how = How.ID, using = "nbrCeID_Year")
		public WebElement uICEYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNo_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNo_Number")
		public WebElement uICallNoEdit;

		@FindBy(how = How.ID, using = "nbrIncidentID_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrIncidentID_Number")
		public WebElement uICaseNoEdit;
		
		 @FindBy(how = How.ID, using = "lblNameID")
	        public WebElement uINameIdlbl;

		 @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
	        public WebElement uILeftSideStatusBar;
		 
			@FindBy(how = How.ID, using = "custHeaderCSZ_City")
			public WebElement uICSZCountyEdit;

			@FindBy(how = How.ID, using = "nbrIncidentID_imgBtn")
			public WebElement uICaseInfoIcon;
	}

	public class ViolationsTab {

		public WebDriver driver;

		public ViolationsTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_adrLocation_chkVerify")
		public WebElement uILocationCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_adrLocation_cmdIncOnAddr")
		public WebElement uILocationInfoIcon;

			@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_lupOffPFID_CodeValue")
		public WebElement uIOfficerEdit;
					                    
		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_lupOffPFID_CodeValue")
		public WebElement uIVoilationOfficerEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_lupOffPFID_imgBtn")
		public WebElement uIOfficerLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_txtCitNbr")
		public WebElement uICitationNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_cddSrvMethod_DropDown")
		public WebElement uIServedMethodComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_lupCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_lupCharge_imgBtn")
		public WebElement uIChargeLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_grdViolations")
		public WebElement uIViolationTabResultGrid;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_cddNibrs")
		public WebElement uINIBRSComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_lupOffPFID_CodeValue")
		public WebElement uIOfficerWIEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_lupCharge_CodeValue")
		public WebElement uIChargeWIEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_grdViolations")
		public WebElement uIViolationTabWIResultGrid;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_cmdAdd")
		public WebElement uIAddWIButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_cmdClear")
		public WebElement uIClearWIButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_adrLocation_txtFrom")
		public WebElement uILocationWIEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_adrLocation_cmdIncOnAddr")
		public WebElement uILocationInfoIconWIEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_adrLocation_chkVerify")
		public WebElement uILocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_lupCharge_CodeDescription")
        public WebElement uIChargeDescripton; 
		
	
	}
	

	public class LicenseTab {

		public WebDriver driver;

		public LicenseTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_txtDOB")
		public WebElement uIDOBEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_txtGender")
		public WebElement uIGenderEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_txtRace")
		public WebElement uIRaceEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_txtHeight")
		public WebElement uIHeightEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_txtWeight")
		public WebElement uIWeightEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_txtSSNo")
		public WebElement uISSNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_chkNoDL")
		public WebElement uINoDLCheckbox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_txtDrvLIC")
		public WebElement uIDrivierLicenseNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJLicense1_chkNoDL")
		public WebElement uINoDLCheckBox;

	}

	public class OffenseTab {
		public WebDriver driver;

		public OffenseTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_adrLocation_txtFrom")
		public WebElement uIDescribeLocationEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_lupCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_stcOnStreet_txtFrom")
		public WebElement uIStreetEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_lupCharge_imgBtn")
		public WebElement uIChargeLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrNJViolations1_lupOffPFID_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_adrLocation_chkVerify")
		public WebElement uIDescribeLocationCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_adrLocation_cmdIncOnAddr")
		public WebElement uIDescribeLocationInfoButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_chkUnclearPlates")
		public WebElement uIUnclearPlatesCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_cddInThe_DropDown")
		public WebElement uIInTheComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_lupOf_CodeDescription")
		public WebElement uIMunicipalityDescribeTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_cddSrvMethod_DropDown")
		public WebElement uIServiceMethodComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_cddAtHwyType_DropDown")
		public WebElement uIAtHwyTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_lupCharge_CodeValue")
		public WebElement uISatatueOrdinaceCodeValueEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_dttmOffense_Date_KPIDttmCtrl")
		public WebElement uIOffenseDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id ='tabCE_tmpl2_usrNJOffense1_dttmOffense_Time']//input")
		public WebElement uIOffenseTimeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_lupCharge_imgBtn")
        public WebElement uIStatueValueSearchIcon;
     
     @FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_cddNibrs1")
        public WebElement uINIBRSDropDown;
     
     @FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_btnNIBRS1")
        public WebElement uINIBRSButton;

     @FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_lupCharge_imgBtn")
		public WebElement uICodeValueNJLookupIcon;

     @FindBy(how = How.ID, using = "tabCE_tmpl2_usrNJOffense1_lblNibrs1")										// Added by Abi
  	public WebElement uINIBRSText;
	}

	public class PlaintiffTab {

		public WebDriver driver;

		public PlaintiffTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_cddPltType_DropDown")
		public WebElement uIPlaintiffTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_lupCounty_imgBtn")
		public WebElement uICountySearchButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_lupCourtType_CodeValue")
		public WebElement uICourtTypeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_Kpilabel5")
		public WebElement uIKPILabelTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_lupCVT_CodeDescription")
		public WebElement uICityVillageTownTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_lupCourtType_CodeDescription")
		public WebElement uICourtTypeTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_lupCourtName_CodeDescription")
		public WebElement uICourtNameTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_cddPayMethod_DropDown")
		public WebElement uIPaymentMethodComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_cddDARoute_DropDown")
		public WebElement uITranProsOffComboBox;

	}

	public class CitationEntryVehicleTab {
		public WebDriver driver;

		public CitationEntryVehicleTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_plcVehicle_PlateNumber")
		public WebElement uIPlateVinEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_chkNoPlate")
		public WebElement uINoPlateCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_plcVehicle_imgBtn")
		public WebElement uIPlateVinLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_plcVehicle_KPIState")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_plcVehicle_imgBtn")
		public WebElement uIVehicleInfoButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_txtPlateTyp")
		public WebElement uILicensePlateTypeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_txtIssueSt")
		public WebElement uIIssuingStateEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_txtPltExpYear")
		public WebElement uIPlateExpirationYearEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_txtVehYear")
		public WebElement uIVehicleYearEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_txtVehMake")
		public WebElement uIVehicleMakeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_txtVehColor")
		public WebElement uIVehicleColorEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJTraVeh1_txtVin")
		public WebElement uIVinNoEdit;
	}

	public class OfficerTab {
		public WebDriver driver;

		public OfficerTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupOffPFID_CodeValue")
		public WebElement uIOfficerPFEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_lupOffPFID_CodeValue")
		public WebElement uIOfficercomplianingWitnessEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_lupOffPFID_CodeDescription")
		public WebElement uIOfficercomplianingWitnessLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_lupIssuOff_CodeValue")
		public WebElement uIIssuingOfficerEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_lupIssuOff_imgBtn")
		public WebElement uIIssuingOfficerLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_cddArea_DropDown")
		public WebElement uIAreaComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_cddRdCondt_DropDown")
		public WebElement uIRoadComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_cddTrfCondt_DropDown")
		public WebElement uITrafficComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_cddLgtCondt_DropDown")
		public WebElement uIVisibilityComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_cddNLanes_DropDown")
		public WebElement uINoLanesComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_ccdAccident_DropDown")
		public WebElement uIAccidentComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_ccdSeverity_DropDown")
		public WebElement uISeverityComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_lupEquipOpr_CodeValue")
		public WebElement uIEquipOperatorNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_lupEquipOpr_imgBtn")
		public WebElement uIEquipOperatorNameLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_ccdUnitCode_DropDown")
		public WebElement uIUnitCodeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_txtEquipment")
		public WebElement uIEquipmentNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_chkEqipment_3")
		public WebElement uIRadarCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_chkEqipment_0")
		public WebElement uIHelicopterCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_chkEqipment_1")
		public WebElement uIPaceCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_chkEqipment_2")
		public WebElement uIVASCARCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl4_UsrNJTraOfficer1_chkEqipment_4")
		public WebElement uIBreathalyzerCheckBox;

	}

	public class CourtTab {
		public WebDriver driver;

		public CourtTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_grdCEViolations")
		public WebElement uICourtTabResultGrid;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_dtcCourtDttm_Date_KPIDttmCtrl")
		public WebElement uICourtDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabCE_tmpl6_UsrNJCourt1_dtcCourtDttm_Time']//input")
		public WebElement uICourtTimeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_lupDisposition_CodeValue")
		public WebElement uIDispositionEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_lupDisposition_imgBtn")
		public WebElement uIDispositionLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_lupCharge_CodeValue")
		public WebElement uIOriginalChargeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_curPaidAmt")
		public WebElement uIBalanceTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_curCEPenaltyAmt")
		public WebElement uIPenaltyAmountEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_curCEFineAmt")
		public WebElement uIFineForfeitureEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_cmdAdd")
		public WebElement uIUpdateButton;

	
		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_lblDocket")
		public WebElement uIDocketLabel;
		
		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_txtDocketNbr")
		public WebElement uIDocketNoEdit;
		
	}

	public class CitationEntryPaymentsTab {
		public WebDriver driver;

		public CitationEntryPaymentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrNJPayment1_grdPayment")
		public WebElement uIPaymentTabResultGrid;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrNJPayment1_dtcTrnDate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrNJPayment1_curPaidAmt")
		public WebElement uIPaymentEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrNJPayment1_cddPayMethod_DropDown")
		public WebElement uIMethodComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrNJPayment1_curBalance")
		public WebElement uIBalanceEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrNJPayment1_txtReceiptRef")
		public WebElement uIReciptReferenceEdit;

	}

	public class CitationEntryNarrativeTab {
		public WebDriver driver;

		public CitationEntryNarrativeTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uINarrativeRichTextEdit;

		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uINarrativeEditField;
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

	}

	public class CitationEntryWitnessTab {
		public WebDriver driver;

		public CitationEntryWitnessTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "nNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "nNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNarrative")
		public WebElement uINarrativeEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdWitness")
		public WebElement uIWitnessTabResultGrid;

		@FindBy(how = How.XPATH, using = "//div[@id='grdWitness'//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;
	}

	public class CitationEntryCommentsTab {
		public WebDriver driver;

		public CitationEntryCommentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtcCurrDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uICommentsTabResultGrid;

	}

	public class CitationComments {
		public WebDriver driver;

		public CitationComments() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uICommentsRichTextEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class CitationEntryMapTab {
		public WebDriver driver;

		public CitationEntryMapTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "frmGHydrantMap_Id")
		public WebElement uIFormName;

		@FindBy(how = How.ID, using = "lbllatLongvalue")
		public WebElement uILatLongTextView;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lbllatLongvalue']/font")
		public WebElement uILatLongValueTextView;

		@FindBy(how = How.ID, using = "cddPointLayers_Input")
		public WebElement uISelectOverlayComboBox;

		@FindBy(how = How.ID, using = "pac-input")
		public WebElement uIEnterLocationEdit;

		@FindBy(how = How.ID, using = "lblLocTypeValue")
		public WebElement uICENoTextView;

		@FindBy(how = How.ID, using = "lbllatLongvalue")
		public WebElement uILatLongValue0TextView;

		@FindBy(how = How.XPATH, using = "//img[@src = 'https://maps.gstatic.com/mapfiles/api-3/images/spotlight-poi.png']")
		public WebElement uIMapLocationIconButton;

	}

	public class CitationArrest {
		public WebDriver driver;

		public CitationArrest() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "pac-lupNIBRS_CodeValue")
		public WebElement uINIBRSCodeEdit;

		@FindBy(how = How.ID, using = "lupNIBRS_CodeDescription")
		public WebElement uINIBRSDescriptionEdit;

		@FindBy(how = How.ID, using = "ArrestDttm_KPIDttmCtrl")
		public WebElement uIArrestDateEdit;

		@FindBy(how = How.ID, using = "cddArmed1_DropDown")
		public WebElement uIArmedCombobox;

		@FindBy(how = How.ID, using = "cddArrestType_DropDown")
		public WebElement uITypeOfArrestCombobox;

	}

	public class CitationSearch {

		public WebDriver driver;

		public CitationSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_nbrCENo_Year")
		public WebElement uICENoYearEdit;

		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_nbrCENo_Number")
		public WebElement uICENoNumberEdit;

		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_cddCeType_DropDown")
		public WebElement uICETypeComboBox;

		@FindBy(how = How.ID, using = "grdSummons")
		public WebElement uICitationSearchResultGrid;

		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.XPATH, using = "//img[@src='/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIcon;

		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_lupOffPFID_CodeValue")
		public WebElement uIOfficerEdit;
        
		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_lblDocket")
		public WebElement uIDocketNoLabel;
		
		@FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_txtDocketNbr")
		public WebElement uIDocketNo;

	}
	public class CrashSearchHelpWindow {

		public WebDriver driver;

		public CrashSearchHelpWindow() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		 @FindBy(how = How.ID, using = "grdCrash")
	        public WebElement uICrashSearchGrid;

       }

	public class CrashEntry {

		public CrashEntryMainTab crashEntryMainTab;
		public WitnessTab witnessTab;
		public MotoristNonMotoristTab motoristNonMotoristTab;
		public OccupantsTab occupantsTab;
		public TruckBusTab truckBusTab;
		public CrashEntryNarrativeTab crashEntryNarrativeTab;
		public DiagramTab diagramTab;
		public DiagramTab2 diagramTab2;
		public CrashEntryMapTab crashEntryMapTab;
		public CrashEntryApprovalTab crashEntryApprovalTab;
		public PoliceActionTab policeActionTab;
		public ConclusionTab conclusionTab;
		public AccidentTab accidentTab;
		public CrashEntryUnitTab crashEntryUnitTab;
		public CrashEntryTrailerTab crashEntryTrailerTab;
		public PropertyOwnerTab propertyOwnerTab;
		public CrashEntryCommentsTab crashEntryCommentsTab;

		public WebDriver driver;

		public CrashEntry() {

			if (this.crashEntryMainTab == null)
				this.crashEntryMainTab = new CrashEntryMainTab();

			if (this.witnessTab == null)
				this.witnessTab = new WitnessTab();

			if (this.motoristNonMotoristTab == null)
				this.motoristNonMotoristTab = new MotoristNonMotoristTab();

			if (this.occupantsTab == null)
				this.occupantsTab = new OccupantsTab();

			if (this.truckBusTab == null)
				this.truckBusTab = new TruckBusTab();

			if (this.crashEntryNarrativeTab == null)
				this.crashEntryNarrativeTab = new CrashEntryNarrativeTab();

			if (this.diagramTab == null)
				this.diagramTab = new DiagramTab();
			
			if (this.diagramTab2 == null)
				this.diagramTab2 = new DiagramTab2();

			if (this.crashEntryMapTab == null)
				this.crashEntryMapTab = new CrashEntryMapTab();

			if (this.crashEntryApprovalTab == null)
				this.crashEntryApprovalTab = new CrashEntryApprovalTab();

			if (this.policeActionTab == null)
				this.policeActionTab = new PoliceActionTab();

			if (this.conclusionTab == null)
				this.conclusionTab = new ConclusionTab();

			if (this.accidentTab == null)
				this.accidentTab = new AccidentTab();

			if (this.crashEntryUnitTab == null)
				this.crashEntryUnitTab = new CrashEntryUnitTab();

			if (this.crashEntryTrailerTab == null)
				this.crashEntryTrailerTab = new CrashEntryTrailerTab();

			if (this.propertyOwnerTab == null)
				this.propertyOwnerTab = new PropertyOwnerTab();

			if (this.crashEntryCommentsTab == null)
				this.crashEntryCommentsTab = new CrashEntryCommentsTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nbrTraCS_Year")
		public WebElement uICrashYearEdit;

		@FindBy(how = How.ID, using = "nbrTraCS_Number")
		public WebElement uICrashNumberEdit;

		@FindBy(how = How.ID, using = "nbrIncidentID_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrIncidentID_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "nbrIncidentID_imgBtn")
		public WebElement uICaseDetailsInfoButton;

		@FindBy(how = How.ID, using = "adrCrashLoc_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "adrAtLoc_chkVerify")
		public WebElement uILocationCheckBox;

		@FindBy(how = How.ID, using = "txtBadge")
		public WebElement uIBadgeNumberEdit;

		@FindBy(how = How.ID, using = "txtUnits")
		public WebElement uINoOfUnitsEdit;

		@FindBy(how = How.ID, using = "lupOff_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIKSOfficerCodeEdit;

		@FindBy(how = How.ID, using = "lupOff_imgBtn")
		public WebElement uIOfficerLookupButton;

		@FindBy(how = How.ID, using = "dtmReportedDttm_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtmReportedDttm_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uICrashEntryMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Motorist/Non Motorist')]")
		public WebElement uIMotoristNonMotoristTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Witness')]")
		public WebElement uIWitnessTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Occupants')]")
		public WebElement uIOccupantsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Truck/Bus')]")
		public WebElement uITruckBusTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Narrative')]")
		public WebElement uINarrativeTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Narrative1')]")
		public WebElement uINarrative1Tab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Diagram')]")
		public WebElement uIDiagramTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Narrative2')]")
		public WebElement uINarrative2Tab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Diagram2')]")
		public WebElement uIDiagram2Tab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Police Action')]")
		public WebElement uIPoliceActionTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Error')]")
		public WebElement uIErrorTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Map')]")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approval')]")
		public WebElement uIApprovalTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "KPIImageButton1")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteIconButton;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIStatusTextView;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']//b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "btnNotify")
		public WebElement uINotificationIconButton;

		@FindBy(how = How.ID, using = "nbrTraCS_Year")
		public WebElement uIWITracsYearEdit;

		@FindBy(how = How.ID, using = "nbrTraCS_Number")
		public WebElement uIWITracsNumberEdit;

		@FindBy(how = How.ID, using = "adrAtLoc_txtFrom")
		public WebElement uIWIReportedLocationEdit;

		@FindBy(how = How.ID, using = "ALC")
		public WebElement uIALCIconButton;

		@FindBy(how = How.ID, using = "txtDOTNo")
		public WebElement uIDOTNoEdit;

		@FindBy(how = How.ID, using = "txtAmended")
		public WebElement uIAmendedNoEdit;

		@FindBy(how = How.ID, using = "txtAcdNo")
		public WebElement uIAccidentNoEdit;

		@FindBy(how = How.ID, using = "dtmAcd_Date_KPIDttmCtrl")
		public WebElement uIWIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtmAcd_Time']//input")
		public WebElement uIWITimeEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'TruckBus')]")
		public WebElement uIWITruckBusTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Accident')]")
		public WebElement uIWIAccidentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Unit')]")
		public WebElement uIWIUnitTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Trailer')]")
		public WebElement uIWITrailerTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Conclusion')]")
		public WebElement uIWIConclusionTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Property Owner')]")
		public WebElement uIWIPropertyOwnerTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uIWICommentsTab;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIWIOfficerCodeEdit;

		@FindBy(how = How.XPATH, using = "//span[@mkr = 'ti1']")
		public WebElement uIWIStateAccidentTab;

		@FindBy(how = How.ID, using = "txtUnits")
		public WebElement uIVehicleNoEdit;
		
		@FindBy(how = How.ID, using = "nbrCallNo_Year")
        public WebElement uICallYearEdit;

        @FindBy(how = How.ID, using = "nbrCallNo_Number")
        public WebElement uICallNumberEdit;
        
		@FindBy(how = How.ID, using = "custHeaderCSZ_City")
		public WebElement uICSZCityEdit;
		
		@FindBy(how = How.ID, using = "adrAtLoc_cmdIncOnAddr")
		public WebElement uIReportedLocationInfoIcon;
	}

	public class CrashEntryMainTab {
		public WebDriver driver;

		public CrashEntryMainTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_txtEmsNo")
		public WebElement uIEMSNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtTolKill")
		public WebElement uITotalKilledEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtTolInjur")
		public WebElement uITotalInjuredEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_txtTotUnit")
		public WebElement uITotalUnitEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_chkRpt")
		public WebElement uIReportableCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_chkNonRpt")
		public WebElement uINonReportableCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkGvtProp")
		public WebElement uIFatalCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_chkChgRpt")
		public WebElement uIChangeReportCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_chkPhotoTkn")
		public WebElement uIPhotoTakenCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_chkNJTR_1A")
		public WebElement uINJTR1ACheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_chkNJTR_1B")
		public WebElement uINJTR1BCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_chkFatal")
		public WebElement uIKSFatalCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtPoliceDpt")
		public WebElement uIPoliceDptOfEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtPoliceDpt")
		public WebElement uIKSPoliceDepartmentEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_ccdCode_DropDown")
		public WebElement uICode2ComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddStation_DropDown")
		public WebElement uIStationPrecinctComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_dtCrashDate_KPIDttmCtrl")
		public WebElement uIDateOfCrashEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabCE_tmpl0_usrNJCrashSummary1_dtCrashTime_Time']//input")
		public WebElement uITimeOfCrashEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddDay_DropDown")
		public WebElement uIDayOfWeekComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_lupOf_CodeValue")
		public WebElement uIMunicipalityCodeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_lupOf_CodeDescription")
		public WebElement uIMunicipalityCodeTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_lupOf_imgBtn")
		public WebElement uIMunicipalityCodeLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtCrashPrefix")
		public WebElement uICrashOccuredonPreffixEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_adrCrashLoc_txtFrom")
		public WebElement uIRoadNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_adrCrashLoc_chkVerify")
		public WebElement uIRoadNameVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddDir_DropDown")
		public WebElement uIDir10ComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtSpeedLimit")
		public WebElement uISppedLimit11Edit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_lupRoute_CodeValue")
		public WebElement uIRouteNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_lupRoute_imgBtn")
		public WebElement uIRouteNumberLookupEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddSuffix_DropDown")
		public WebElement uISuffixComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_adrCrossLoc_txtFrom")
		public WebElement uICrossRoadNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_adrCrossLoc_chkVerify")
		public WebElement uICrossRoadNameVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtLatitude")
		public WebElement uILatituteEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtLati")
		public WebElement uIKSLatituteEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtLongitude")
		public WebElement uILongitudeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtlongi")
		public WebElement uIKSLongitudeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddRdDivBy_DropDown")
		public WebElement uIRoadDividedByComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddTempTraCtrl_DropDown")
		public WebElement uITemproraryTrafficControlZoneComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddLightCondition_DropDown")
		public WebElement uILightConditionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddlightCondition_DropDown")
		public WebElement uIKSLightConditionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddRdSys_DropDown")
		public WebElement uIRoadSystemComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddRdChar_DropDown")
		public WebElement uIRoadCharacterComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddRdSurfType_DropDown")
		public WebElement uIRoadSurfaceTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddRdSurfCond_DropDown")
		public WebElement uIRoadSurfaceConditionsComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddEnvirCond_DropDown")
		public WebElement uIEnvironmentConditionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddOthrMV_DropDown")
		public WebElement uIWithOtherMVAsFirstEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddBelow_DropDown")
		public WebElement uIWithBelowAsFirstEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_txtDamageProperty")
		public WebElement uIDamageToOtherPropertyEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_adrRouteName_txtFrom")
		public WebElement uIRouteNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtCity")
		public WebElement uICityEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddCounty_DropDown")
		public WebElement uICountyComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_dttmDOA_KPIDttmCtrl")
		public WebElement uIDateOfAccidentEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabCE_tmpl0_UsrKSCrashMain1_dttmTOA_Time']//input")
		public WebElement uITimeOfAccidentEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddDay_DropDown")
		public WebElement uIDayComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_adrCrashLoc_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtBlockNo")
		public WebElement uIBlockNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddIntType_DropDown")
		public WebElement uIIntersectionTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cssLocationZone_DropDown")
		public WebElement uILocationWorkZoneComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddAdversecondition_DropDown")
		public WebElement uIAdverseWeatherConditionsComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtWeathercond")
		public WebElement uIAdverseWeatherConditionsEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddSurfaceCondition_DropDown")
		public WebElement uISurfaceConditionsOnComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtSufaceCond")
		public WebElement uISurfaceConditionsOnEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddSurface_DropDown")
		public WebElement uISurfaceTypeOnComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtSurfaceType")
		public WebElement uISurfaceTypeOnEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddAccLocation_DropDown")
		public WebElement uIAccidentLocationComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtAccLocation")
		public WebElement uIAccidentLocationEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddOnAt1_DropDown")
		public WebElement uITrafficControlsOnAtComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddtype1_DropDown")
		public WebElement uITrafficControlsTypePresentComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddOkNF1_DropDown")
		public WebElement uITrafficControlsOkNFComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtTypePresent")
		public WebElement uITrafficControlsEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddWorKZoneType_DropDown")
		public WebElement uIWorkZoneTypeOnComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddFirstHarm_DropDown")
		public WebElement uIAccidentClass1stHarmfulEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtFirstHarm")
		public WebElement uIAccidentClass1stHarmfulEventEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddMostHarm_DropDown")
		public WebElement uIAccidentClassMostHarmfulEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtMostHarm")
		public WebElement uIAccidentClassMostHarmfulEventEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddRoad1_DropDown")
		public WebElement uIRoadSpecialFeatures1stComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtRoad1")
		public WebElement uIRoadSpecialFeatures1stEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddRoad2_DropDown")
		public WebElement uIRoadSpecialFeatures2ndComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtRoad2")
		public WebElement uIRoadSpecialFeatures2ndEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddRoad3_DropDown")
		public WebElement uIRoadSpecialFeatures3rdComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddWorkZone_DropDown")
		public WebElement uIWorkZoneCategoryComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtWorkZoneCategory")
		public WebElement uIWorkZoneCategoryEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cssFixedHarmEvent_DropDown")
		public WebElement uIFixedObjectType1stHarmfulEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtFirsFixed")
		public WebElement uIFixedObjectType1stHarmfulEventEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cssMostHarmEvent_DropDown")
		public WebElement uIFixedObjectTypeMostHarmfulEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddRoadWay_DropDown")
		public WebElement uIRoadwayNumberOfLanesOnComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtRoadLanes")
		public WebElement uIRoadwayNumberOfLanesOnEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddRoadchar_DropDown")
		public WebElement uIRoadCharacterOnComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtRoadchar")
		public WebElement uIRoadCharacterOnEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddCollEvent_DropDown")
		public WebElement uICollisionWithVehicle1stHarmfulEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtFirstCollWithVeh")
		public WebElement uICollisionWithVehicle1stHarmfulEventEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddCollHarmEvent_DropDown")
		public WebElement uICollisionWithVehicleMostHarmfulEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_cddSpecialJuris_DropDown")
		public WebElement uISpecialJurisdictionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_txtSpecialJuris")
		public WebElement uISpecialJurisdictionEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddRdGrade_DropDown")
		public WebElement uIRoadCharacterGradeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddOthrMV_DropDown")
		public WebElement uICrashTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddRdChar_DropDown")
		public WebElement uIRoadCharacterHorizontalAlignmentComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_cddFirstHarmful_DropDown")
		public WebElement uIFirstHarmfulEventComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_ChkDamage")
		public WebElement uIDamageOtherPropertyCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_txtEmsNo")
		public WebElement uIWIEMSNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_txtTotKilled")
		public WebElement uIWITotalKilledEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_txtTotInj")
		public WebElement uIWITotalInjuiredEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_txtTotUnit")
		public WebElement uIWITotalUnitEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkReport")
		public WebElement uIWIReportableCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkFire")
		public WebElement uIWIFireCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkTruckBus")
		public WebElement uIWITruckBusCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkHitRun")
		public WebElement uIWIHitAndRunCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkPhotoTaken")
		public WebElement uIWIPhotoTakenCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkGvtProp")
		public WebElement uIWIGovermentPropertyCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkTrk26")
		public WebElement uIWITruckWith2Axles6TiresCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkTrkHaz")
		public WebElement uIWITruckWithHazardousPlacardCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkMedTrans")
		public WebElement uIWIMedicalTransportCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkFatInj")
		public WebElement uIWIFatalInjuryCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkTowed")
		public WebElement uIWITowedCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkTrailTow")
		public WebElement uIWITrailerTowedCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrActMain1_chkBusCap")
		public WebElement uIWIBusCarry16PersonsCheckBox;

	}

	public class WitnessTab {

		public WebDriver driver;

		public WitnessTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "lupOfficer_imgBtn")
		public WebElement uIOfficerLookupButton;

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "nNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIKSAddButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIKSClearButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInternalResetButton;

		@FindBy(how = How.ID, using = "txtNarrative")
		public WebElement uINarrativeEdit;

		@FindBy(how = How.ID, using = "cmdtextEditor")
		public WebElement uITextEditorButton;

		@FindBy(how = How.ID, using = "txtHomePhone")
		public WebElement uIHomePhoneEdit;

		@FindBy(how = How.ID, using = "txtWorkPhone")
		public WebElement uIWorkPhoneEdit;

		@FindBy(how = How.ID, using = "nNameID_imgSrch")
		public WebElement uINameInfoButton;

		@FindBy(how = How.ID, using = "grdWitness")
		public WebElement uIWitnessTabTable;

		@FindBy(how = How.ID, using = "tabCE_tmpl5_UsrWitness1_grdWitness")
		public WebElement uIWIWitnessTabTable;

		@FindBy(how = How.XPATH, using = "//td[@class = 'status']/table/tbody/tr/td/b")
		public WebElement uIWitnessTabStatusBar;

	}

	public class MotoristNonMotoristTab {
		public WebDriver driver;

		public MotoristNonMotoristTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUnit")
		public WebElement uIUnitNoEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdUnits")
		public WebElement uIMotoristNonMotoristTabResultGrid;

	}

	public class OccupantsTab {
		public WebDriver driver;

		public OccupantsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddUnitNo_DropDown")
		public WebElement uIUnitNoComboBox;

		@FindBy(how = How.ID, using = "nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cddVehPosition_DropDown")
		public WebElement uIPositioninOnVehicleComboBox;

		@FindBy(how = How.ID, using = "cddEjected_DropDown")
		public WebElement uIEjectionComboBox;

		@FindBy(how = How.ID, using = "cddSafty_DropDown")
		public WebElement uISafetyEquipmentComboBox;

		@FindBy(how = How.ID, using = "cddUsed_DropDown")
		public WebElement uIUsedComboBox;

		@FindBy(how = How.ID, using = "cddAirBag_DropDown")
		public WebElement uIAirBagComboBox;

		@FindBy(how = How.ID, using = "cddPhysicCond_DropDown")
		public WebElement uIVictamPhysicalConditionComboBox;

		@FindBy(how = How.ID, using = "cddSevereInj_DropDown")
		public WebElement uILocofmostseverephysInjComboBox;

		@FindBy(how = How.ID, using = "cddTypeInj_DropDown")
		public WebElement uITypeofmostseverephysInjComboBox;

		@FindBy(how = How.ID, using = "lupHospital_CodeValue")
		public WebElement uIHospitalCodeEdit;

		@FindBy(how = How.ID, using = "lupHospital_imgBtn")
		public WebElement uIHospitalCodeLookupButton;

		@FindBy(how = How.ID, using = "cddRefused_DropDown")
		public WebElement uIRefusedMedicalTreatmentComboBox;

		@FindBy(how = How.ID, using = "cddSeating_DropDown")
		public WebElement uISeatingPositionComboBox;

		@FindBy(how = How.ID, using = "cddBusType_DropDown")
		public WebElement uIBusTypeComboBox;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIKSAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInternalResetButton;

		@FindBy(how = How.ID, using = "grdOccupants")
		public WebElement uIOccupantsTabResultGrid;

		@FindBy(how = How.ID, using = "cddPosition_DropDown")
		public WebElement uIKSPositionInVehicleComboBox;

		@FindBy(how = How.ID, using = "cddEjection_DropDown")
		public WebElement uIKSEjectionTrappedComboBox;

		@FindBy(how = How.ID, using = "cddEjectionPath_DropDown")
		public WebElement uIKSEjectionPathComboBOx;

		@FindBy(how = How.ID, using = "txtInjuredTaken")
		public WebElement uIKSInjuredTakenByEdit;

		@FindBy(how = How.ID, using = "txtInjuredTakenTo")
		public WebElement uIKSInjuredTakenToEdit;

		@FindBy(how = How.ID, using = "cddInjuredServerity_DropDown")
		public WebElement uIKSInjurySeverityComboBox;

		@FindBy(how = How.ID, using = "txtTransunit")
		public WebElement uIKSTransportUnitEdit;

	}

	public class TruckBusTab {
		public WebDriver driver;

		public TruckBusTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddUnitNo_DropDown")
		public WebElement uIVehicleNoComboBox;

		@FindBy(how = How.ID, using = "cddVehNo_DropDown")
		public WebElement uIKSVehicleNoComboBox;

		@FindBy(how = How.ID, using = "nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIKSAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIKSClearButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInternalResetButton;

		@FindBy(how = How.ID, using = "grdTruckBus")
		public WebElement uITruckBusTabResultGrid;

		@FindBy(how = How.ID, using = "ChkDot")
		public WebElement uIUSDotCheckBox;

		@FindBy(how = How.ID, using = "txtCarrierNo")
		public WebElement uICarrierNumberEdit;

		@FindBy(how = How.ID, using = "nNameID_NameTypeID")
		public WebElement uICarrierNameIDEdit;

		@FindBy(how = How.ID, using = "ChkOther")
		public WebElement uIOtherCheckBox;

		@FindBy(how = How.ID, using = "cddOverWeight_DropDown")
		public WebElement uIOversizeWeightPermitComboBox;

		@FindBy(how = How.ID, using = "cddVehWeight_DropDown")
		public WebElement uICommercialVehicleWeightComboBox;

		@FindBy(how = How.ID, using = "chkOnboard")
		public WebElement uIOnBoardCheckBox;

		@FindBy(how = How.ID, using = "chkPill")
		public WebElement uISpillCheckBox;

		@FindBy(how = How.ID, using = "txtHazMaterial")
		public WebElement uIHazMaterial4979Edit;

		@FindBy(how = How.ID, using = "chkHazNone")
		public WebElement uIHazardousMaterialNoneCheckbox;

		@FindBy(how = How.ID, using = "txtPlacardNbr")
		public WebElement uIHazardClassEdit;

		@FindBy(how = How.ID, using = "txtPlacardNbr")
		public WebElement uINameorPlacardNoEdit;

		@FindBy(how = How.ID, using = "chkNone")
		public WebElement uINoneCheckBox;

		@FindBy(how = How.ID, using = "txtUSDOT")
		public WebElement uICarrierIdentificationNoUSDOTEdit;

		@FindBy(how = How.ID, using = "txtMCNo")
		public WebElement uICarrierIdentificationNoMCMXEdit;

		@FindBy(how = How.ID, using = "cddAttime_DropDown")
		public WebElement uIAtTimeOfCrashThisVehicleWasComboBox;

		@FindBy(how = How.ID, using = "txtAttime")
		public WebElement uIAtTimeOfCrashThisVehicleWasEdit;

		@FindBy(how = How.ID, using = "cddGVWR_DropDown")
		public WebElement uIGVWRGCWRComboBox;

		@FindBy(how = How.ID, using = "txtGVWR")
		public WebElement uIGVWRGCWRLBSEdit;

		@FindBy(how = How.ID, using = "cddSourceName_DropDown")
		public WebElement uISourceOfCarrierNameComboBox;

		@FindBy(how = How.ID, using = "txtpermit1")
		public WebElement uIPermitIssuer1Edit;

		@FindBy(how = How.ID, using = "txtpermitNo1")
		public WebElement uIPermitNumber1Edit;

		@FindBy(how = How.ID, using = "txtWidth1")
		public WebElement uITrailerDimensionWidth1Edit;

		@FindBy(how = How.ID, using = "txtlength1")
		public WebElement uITrailerDimensionLength1Edit;

		@FindBy(how = How.ID, using = "cddDamaged_DropDown")
		public WebElement uITrailerDamagedComboBox;

		@FindBy(how = How.ID, using = "txtVehlength")
		public WebElement uIVehicleLengthEdit;

		@FindBy(how = How.ID, using = "cddVehCon_DropDown")
		public WebElement uIVehicleConfigurationComboBox;

		@FindBy(how = How.ID, using = "txtVehCon")
		public WebElement uIVehicleConfigurationEdit;

		@FindBy(how = How.ID, using = "cddCargoBody_DropDown")
		public WebElement uICargoBodyTypeComboBox;

		@FindBy(how = How.ID, using = "txtCargoType")
		public WebElement uICargoBodyTypeEdit;

		@FindBy(how = How.ID, using = "cddCargoType_DropDown")
		public WebElement uICargoTypeComboBox;

		@FindBy(how = How.ID, using = "txtCargoType")
		public WebElement uICargoTypeEdit;

		@FindBy(how = How.ID, using = "txtHazMatweight")
		public WebElement uIHazmatWeightLBSEdit;

		@FindBy(how = How.ID, using = "txtDiamondFrm")
		public WebElement uIDiamondShapeEdit;

		@FindBy(how = How.ID, using = "cddCab_DropDown")
		public WebElement uICabTypeComboBox;

		@FindBy(how = How.ID, using = "cddOnRoad_DropDown")
		public WebElement uIOnRoadLaneTypeComboBox;

		@FindBy(how = How.ID, using = "cddVehicleAccess_DropDown")
		public WebElement uIVehicleAccessControlToRoadwaysComboBox;

	}

	public class CrashEntryNarrativeTab {
		public WebDriver driver;

		public CrashEntryNarrativeTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtcCurrDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uINarrativeTabResultGrid;

	}

	public class DiagramTab {
		public WebDriver driver;

		public DiagramTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJDiagram1_imgDiagram")
		public WebElement uIImageView;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJDiagram1_cmdAddNew")
		public WebElement uINewButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJDiagram1_cmdEdit")
		public WebElement uIEditButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJDiagram1_cmdImport")
		public WebElement uIImportButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrKSDiagram1_cmdImport")
		public WebElement uIKSImportButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJDiagram1_cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJDiagram1_cddDirection_DropDown")
		public WebElement uINorthDirectionNoComboBox;

	}
	public class DiagramTab2 {
		public WebDriver driver;

		public DiagramTab2() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl8_UsrNJ2Diagram1_cmdImport")
		public WebElement uIImportButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl8_UsrNJ2Diagram1_cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl8_UsrNJ2Diagram1_imgDiagram")
		public WebElement uIImageView;

	}
	public class CrashEntryMapTab {
		public WebDriver driver;

		public CrashEntryMapTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "frmGHydrantMap_Id")
		public WebElement uIFormName;

		@FindBy(how = How.ID, using = "lbllatLongvalue")
		public WebElement uILatLongTextView;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lbllatLongvalue']/font")
		public WebElement uILatLongValueTextView;

		@FindBy(how = How.ID, using = "cddPointLayers_Input")
		public WebElement uISelectOverlayComboBox;

		@FindBy(how = How.ID, using = "pac-input")
		public WebElement uIEnterLocationEdit;

		@FindBy(how = How.ID, using = "lblLocTypeValue")
		public WebElement uICENoTextView;

		@FindBy(how = How.ID, using = "btnUpdateLatLong")
		public WebElement uIUpdateLatLongButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Reset')]")
		public WebElement uIResetButton;

	}

	public class CrashComments {
		public WebDriver driver;

		public CrashComments() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uICommentsRichTextEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class='statusBar']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class CrashEntryApprovalTab {
		public WebDriver driver;

		public CrashEntryApprovalTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lstStatus")
		public WebElement uINewActionComboBox;

		@FindBy(how = How.ID, using = "cddRejCode_DropDown")
		public WebElement uIRejectionCodeComboBox;

		@FindBy(how = How.ID, using = "dttStatusDttm_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id ='dttStatusDttm_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "lupSupervisor_CodeValue")
		public WebElement uISupervisorCodeEdit;

		@FindBy(how = How.ID, using = "lblrejcountvalue")
		public WebElement uIRejectCountTextView;

	}

	public class PoliceActionTab {
		public WebDriver driver;

		public PoliceActionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl8_UsrKSPoliceAction1_chkComplete")
		public WebElement uICompleteCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl9_UsrNJPoliceAction1_chkPending") // Added by Abi
		public WebElement uINJPendingCheckBox;

		@FindBy(how = How.XPATH, using = "//input[@id='tabCE_tmpl9_UsrNJPoliceAction1_chkComplete']")
		public WebElement uINJCompleteCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl8_UsrKSPoliceAction1_chkPending")
		public WebElement uIPendingCheckBox;
	}

	public class ConclusionTab {
		public WebDriver driver;

		public ConclusionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_lupHarmEvt_CodeValue")
		public WebElement uI1stHarmfulEventEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_lupHarmEvt_imgBtn")
		public WebElement uI1stHarmfulEventLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_cddColMan_DropDown")
		public WebElement uICollisionMannerComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_cddSplStd_DropDown")
		public WebElement uISpecialStudyComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_cddTrfWay_DropDown")
		public WebElement uITrafficWayComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_cddWeather_DropDown")
		public WebElement uIWeatherComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_cddRdSurfCndt_DropDown")
		public WebElement uIRoadSurfaceConditionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl6_UsrConclusion1_cddAccCntl_DropDown")
		public WebElement uIAccessControlComboBox;

	}

	public class AccidentTab {
		public WebDriver driver;

		public AccidentTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_lupCounty_CodeValue")
		public WebElement uICountyCodeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_lupCVT_CodeValue")
		public WebElement uIMunicipalityCodeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_txtOnHwyNo")
		public WebElement uIOnHwyNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_stcOnStreet_txtFrom")
		public WebElement uIOnStreetEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_stcOnStreet_chkVerify")
		public WebElement uIOnStreetVerifyCheckbox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_cddOnHwyType_DropDown")
		public WebElement uIOnHwyTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_cddAcdLoc_DropDown")
		public WebElement uIAccidentLocationComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_cddFrmHwyType_DropDown")
		public WebElement uIFrmHwyTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_stFAStreet_txtFrom")
		public WebElement uIFromAlterStreetNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_stFAStreet_chkVerify")
		public WebElement uIFromAlterStreetNameVerifyCheckbox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_txtAgencySpace")
		public WebElement uIAgencySpaceEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrAcdLoc1_txtStruNo")
		public WebElement uIStructureNoEdit;

	}

	public class CrashEntryUnitTab {
		public WebDriver driver;

		public CrashEntryUnitTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUnitNo")
		public WebElement uIUnitNoEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdUnit")
		public WebElement uIUnitTabResultGrid;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

	}

	public class CrashEntryTrailerTab {
		public WebDriver driver;

		public CrashEntryTrailerTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUnitNo")
		public WebElement uITrailerUnitNoEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cddUnitType_DropDown")
		public WebElement uIUnitTypeComboBox;

		@FindBy(how = How.ID, using = "plcVehicle_PlateNumber")
		public WebElement uIVehicleEdit;

		@FindBy(how = How.ID, using = "plcVehicle_KPIState")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "grdTrailTow")
		public WebElement uITrailerTabResultGrid;
	}

	public class PropertyOwnerTab {
		public WebDriver driver;

		public PropertyOwnerTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_cmdStruckObject")
		public WebElement uIStruckObjectButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_cddPropType_DropDown")
		public WebElement uIPropertyTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_txtTagNo")
		public WebElement uIDamageTagNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_nNameID_NameType")
		public WebElement uIOwnerNameTypeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_nNameID_NameTypeID")
		public WebElement uIOwnerNameIDEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_grdProperty")
		public WebElement uIPropertyOwnerTabResultGrid;

	}

	public class CrashEntryCommentsTab {

		public WebDriver driver;

		public CrashEntryCommentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uICommentsTabResultGrid;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

		@FindBy(how = How.ID, using = "dtcCurrDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

	}

	public class CrashSearch {
		public WebDriver driver;

		public CrashSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_nbrTraCS_Year")
		public WebElement uICrashYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_nbrTraCS_Number")
		public WebElement uICrashNumberEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_nbrCaseNo_Year")
		public WebElement uIWICaseYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_nbrCaseNo_Number")
		public WebElement uIWICaseNumberEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_nbrCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_nbrCrashNo_Year")
		public WebElement uIKSCrashYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_nbrCrashNo_Number")
		public WebElement uIKSCrashNumberEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_nbrCaseNo_Year")
		public WebElement uIKSCaseYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_nbrCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_nbrCallNo_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_nbrCallNo_Number")
		public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_nbrCaseNo_Number")
		public WebElement uIKSCaseNumberEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_nbrCaseNo_imgBtn")
		public WebElement uICaseDetailsInfoButton;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_lupOff_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_lupOff_CodeValue")
		public WebElement uIWIOfficerCodeEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_lupOff_CodeValue")
		public WebElement uIKSOfficerCodeEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_chkInjuried")
		public WebElement uIInjuredCheckBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_adrCrossLoc_txtFrom")
		public WebElement uICrossRoadNameEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_adrCrossLoc_chkVerify")
		public WebElement uICrossRoadNameVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_ChkApproval")
		public WebElement uIApprovalCheckBox;

		@FindBy(how = How.ID, using = "grdCrash")
		public WebElement uICrashSearchResultGrid;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_adrAtLoc_CddLocationType")
		public WebElement uIKSCrashLocationComboBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_adrAtLoc_TxtStartPremise")
		public WebElement uICrashLocationPremiseEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_adrAtLoc_TxtStreetName")
		public WebElement uICrashLocationStreetEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_chkFatal")
		public WebElement uIFatalCheckBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_txtPlateNo")
		public WebElement uIKSPlateEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_cddState_DropDown")
		public WebElement uIKSStateComboBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_lstApprovalStatusKS")
		public WebElement uIKSApprovalStatusComboBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_txtLastName")
		public WebElement uIKSLastNameEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrKSCrashSrchBasic1_txtFirstName")
		public WebElement uIKSFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_adrAtLoc_CddLocationType")
		public WebElement uICrashLocationComboBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_adrAtLoc_TxtStreetName1")
		public WebElement uIIntersectionStreet1Edit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_adrAtLoc_TxtStreetName2")
		public WebElement uIIntersectionStreet2Edit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_chkNonRpt")
		public WebElement uINonReportableCheckBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_chkRpt")
		public WebElement uIReportableCheckBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_nbrTraCS_Year")
		public WebElement uIWITracsYearEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_nbrTraCS_Number")
		public WebElement uIWITracsNumberEdit;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_txtDotNo")
		public WebElement uIDOTNoEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_txtAcdNo")
		public WebElement uIAccidentNoEdit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_cddCrashType")
		public WebElement uICrashTypeComboBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_CddLocationType")
		public WebElement uIWIAddressComboBox;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_TxtStreetName1")
		public WebElement uIWIIntersectionStreet1Edit;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_TxtStreetName2")
		public WebElement uIWIIntersectionStreet2Edit;

	@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_cddUsed_DropDown")
		public WebElement uISafetyEquipmentUsedDropdown;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_cddCircumstanceA_DropDown")
		public WebElement uIApparentContributingCircumstancesDropdown;
		
		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_cddPhysicalStatus_DropDown")
		public WebElement uIApparentPhysicalStatusDropdown;

		@FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_lstApprovalStatusNJ")
		public WebElement uINJApprovalStatusComboBox;
	}

	public class DeerCrash {

		public DeerCrashAccidentTab deerCrashAccidentTab;
		public DriverTab driverTab;
		public DeerCrashNarrativeTab deerCrashNarrativeTab;

		public WebDriver driver;

		public DeerCrash() {

			if (deerCrashAccidentTab == null)
				deerCrashAccidentTab = new DeerCrashAccidentTab();

			if (driverTab == null)
				driverTab = new DriverTab();

			if (deerCrashNarrativeTab == null)
				deerCrashNarrativeTab = new DeerCrashNarrativeTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "adrAtLoc_txtFrom")
		public WebElement uIReportedLocationEdit;

		@FindBy(how = How.ID, using = "adrAtLoc_chkVerify")
		public WebElement uIReportedLocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "txtDotNo")
		public WebElement uIDotNumberEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "lupOffPFID_imgBtn")
		public WebElement uIOfficerLookupButton;

		@FindBy(how = How.ID, using = "dttmAcd_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmAcd_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Driver')]")
		public WebElement uIDriverTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Accident')]")
		public WebElement uIAccidentTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Narrative')]")
		public WebElement uINarrativeTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Map')]")
		public WebElement uIMapTab;

		@FindBy(how = How.ID, using = "nbrTraCS_Year")
		public WebElement uITracsRefYearEdit;

		@FindBy(how = How.ID, using = "nbrTraCS_Number")
		public WebElement uITracsRefNumberEdit;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "nbrCallNo_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNo_Number")
		public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "nbrCallNo_imgBtn")
		public WebElement uICallNoInfoIcon;

		@FindBy(how = How.ID, using = "nbrIncidentID_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrIncidentID_Number")
		public WebElement uICaseNumberEdit;

	}

	public class DeerCrashAccidentTab {
		public WebDriver driver;

		public DeerCrashAccidentTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_lupHarmEvt_CodeValue")
		public WebElement uI1stHarmfulEventEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_lupHarmEvt_imgBtn")
		public WebElement uI1stHarmEventLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_cddAcdLoc_DropDown")
		public WebElement uIAccidentLocationComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_lupCounty_CodeValue")
		public WebElement uICountryEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_lupCounty_imgBtn")
		public WebElement uICountryLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_lupCVT_imgBtn")
		public WebElement uIMunicipalityLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_txtOnHwyNo")
		public WebElement uIOnHwyNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_cddOnHwyType_DropDown")
		public WebElement uIOnHwyTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_stcOnStreet_txtFrom")
		public WebElement uIOnStreetEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDeerAcd1_cddFrmHwyType_DropDown")
		public WebElement uIFromHwyTypeComboBox;
	}

	public class DriverTab {
		public WebDriver driver;

		public DriverTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_nNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_nNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddSpeedLimit_DropDown")
		public WebElement uISpeedLimitComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddOnDutyAcd_DropDown")
		public WebElement uIOnDutyComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddUnitStatus_DropDown")
		public WebElement uIUnitStatusComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddUnitType_DropDown")
		public WebElement uIUnitTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddEjected_DropDown")
		public WebElement uIEjectedComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddDirTravel_DropDown")
		public WebElement uIDriverTravelComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddOprDLClass_DropDown")
		public WebElement uIOperatorDLClassComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddOprDLEndrs_DropDown")
		public WebElement uIOperatorDLEndrsComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddInjSvr_DropDown")
		public WebElement uIInjurySeverityComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddAirBag_DropDown")
		public WebElement uIAirBagComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_plcVehicle_PlateNumber")
		public WebElement uIVehicleNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_plcVehicle_imgBtn")
		public WebElement uIVehicleLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddVehDamage_DropDown")
		public WebElement uIVehicleDamageComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_cddExtDamage_DropDown")
		public WebElement uIExtentofDamageComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrDeerDrv1_nNameID_FirstName")
		public WebElement uIFirstNameEdit;
	}

	public class DeerCrashNarrativeTab {
		public WebDriver driver;

		public DeerCrashNarrativeTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uINarrativeRichTextEdit;
	}

	public class ParkingEntry {

		public Defendant1 defendant1;
		public Defendant2 defendant2;
		public ParkingEntryMainTab parkingEntryMainTab;
		public FineNoticesTab fineNoticesTab;
		public PaymentsTab paymentsTab;
		public CommentsTab commentsTab;
		public ParkingEntryHistoryTab parkingEntryHistoryTab;

		public WebDriver driver;

		public ParkingEntry() {

			if (this.defendant1 == null)
				this.defendant1 = new Defendant1();

			if (this.defendant2 == null)
				this.defendant2 = new Defendant2();

			if (this.parkingEntryMainTab == null)
				this.parkingEntryMainTab = new ParkingEntryMainTab();
			if (this.fineNoticesTab == null)
				this.fineNoticesTab = new FineNoticesTab();

			if (this.paymentsTab == null)
				this.paymentsTab = new PaymentsTab();

			if (this.commentsTab == null)
				this.commentsTab = new CommentsTab();

			if (this.parkingEntryHistoryTab == null)
				this.parkingEntryHistoryTab = new ParkingEntryHistoryTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtmViolation_Date_KPIDttmCtrl")
		public WebElement uIViolationDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtmViolation_Time']//input")
		public WebElement uIViolationTimeEdit;

		@FindBy(how = How.ID, using = "txtTicket")
		public WebElement uITicketNumberEdit;

		@FindBy(how = How.ID, using = "txtMeter")
		public WebElement uIMeterNumberEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Defendant1')]")
		public WebElement uIDefendant1Tab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Defendant2')]")
		public WebElement uIDefendant2Tab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fine/Notices')]")
		public WebElement uIFineNoticesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'History')]")
		public WebElement uIHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Payments')]")
		public WebElement uIPaymentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lblStatus']")
		public WebElement uIStatusTextView;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdSaveNAddNew")
		public WebElement uISaveAndAddNewButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "dtmIssueDate_KPIDttmCtrl")
		public WebElement uIIssueDateEdit;
		
		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']//b")
		public WebElement uIStatusbar;
		@FindBy(how = How.ID, using = "nbrParking_Year")
		public WebElement uIParkingYear;
		
		@FindBy(how = How.ID, using = "nbrParking_Number")
		public WebElement uIParkingNumber;

	}

	public class Defendant1 {
		public WebDriver driver;

		public Defendant1() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "TabC_tmpl0_UsrParkFirstDefendant1_nNameID_NameType")
		public WebElement uIDefendant1NameTypeEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl0_UsrParkFirstDefendant1_nNameID_NameTypeID")
		public WebElement uIDefendant1NameTypeIDEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl0_UsrParkFirstDefendant1_nNameID_LastName")
		public WebElement uIDefendant1LastNameEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl0_UsrParkFirstDefendant1_nNameID_FirstName")
		public WebElement uIDefendant1FirstNameEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl0_UsrParkFirstDefendant1_nNameID_imgWant")
		public WebElement uIWarrantIconButton;

		@FindBy(how = How.ID, using = "TabC_tmpl0_UsrParkFirstDefendant1_nNameID_imgSrch")
		public WebElement uINameInfoIcon;

		@FindBy(how = How.ID, using = "TabC_tmpl0_UsrParkFirstDefendant1_adrMainAddress_txtFrom")
		public WebElement uIAddressEdit;

	}

	public class Defendant2 {
		public WebDriver driver;

		public Defendant2() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "TabC_tmpl1_UsrParkSecondDefendant1_nNameID_NameType")
		public WebElement uIDefendant2NameTypeEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl1_UsrParkSecondDefendant1_nNameID_NameTypeID")
		public WebElement uIDefendant2NameTypeIDEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl1_UsrParkSecondDefendant1_nNameID_LastName")
		public WebElement uIDefendant2LastNameEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl1_UsrParkSecondDefendant1_nNameID_FirstName")
		public WebElement uIDefendant2FirstNameEdit;

		@FindBy(how = How.ID, using = "TabC_tmpl1_UsrParkSecondDefendant1_nNameID_imgSrch")
		public WebElement uINameInfoIcon;

	}

	public class ParkingEntryMainTab {
		public WebDriver driver;

		public ParkingEntryMainTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_dtmCourtdate_Date_KPIDttmCtrl")
		public WebElement uICourtDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabCE_tmpl0_UsrParkMain1_dtmCourtdate_Time']//input")
		public WebElement uICourtTimeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_lupOffPFID_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_lupOffPFID_imgBtn")
		public WebElement uIOfficerLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_plcVehicle_PlateNumber")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_plcVehicle_KPIState")
		public WebElement uIPlateStateComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_plcVehicle_imgBtn")
		public WebElement uIPlateNumberLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_lupCharge_CodeValue")
		public WebElement uIViolationEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_lupCharge_imgBtn")
		public WebElement uIViolationLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_adrLocation_chkVerify")
		public WebElement uILocationCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_plcVehicle_imgBtn")
		public WebElement uIPlateInfoIcon;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_txtVehYear")
		public WebElement uIYearEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_txtVehMake")
		public WebElement uIMakeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_txtVehModel")
		public WebElement uIModelEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_txtVehStyle")
		public WebElement uIStyleEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_chkOnHold")
		public WebElement uIOnHoldCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_dtmExpire_KPIDttmCtrl")
		public WebElement uIExpiresDateEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_imgHoldReason")
		public WebElement uIOnHoldInfoIcon;

	}

	public class FineNoticesTab {

		public WebDriver driver;

		public FineNoticesTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txtVioBalance")
		public WebElement uIInitialFineEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_ChkTicketDismissed")
		public WebElement uITicketVoidCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_lupOffPFID_CodeValue")
		public WebElement uIAuthorisedByEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_lupOffPFID_imgBtn")
		public WebElement uIAuthorisedByLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_lblFirstAdjAmt")
		public WebElement uIFirstAdjustmentText;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_lblSecondAdjAmt")
		public WebElement uISecondAdjustmentText;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_lblThirdAdjAmt")
		public WebElement uIThirdAdjustmentText;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txt7thDayBalance")
		public WebElement uIFirstAdjustmentEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txt28thDayBalance")
		public WebElement uISecondAdjustmentEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txt3rdDayBalance")
		public WebElement uIThirdAdjustmentEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_dtmFirstNotice_KPIDttmCtrl")
		public WebElement uIFirstNoticeDateEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_dtmSecondNotice_KPIDttmCtrl")
		public WebElement uISecondNoticeDateEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_dtmThirdNotice_KPIDttmCtrl")
		public WebElement uISuspensionNoticeDateEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txtTotAmtDue")
		public WebElement uITotalAmountDueEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txtCurrBalance")
		public WebElement uICurrentBalanceEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_chkCitation")
		public WebElement uICitationIssuedCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txtCitation_CitationNbr")
		public WebElement uICitationIssuedEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txtCitation_imgBtn")
		public WebElement uICitationInfoIcon;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrParkNotices1_txtDismissReason")
		public WebElement uITicketVoidedEdit;

	}

	public class PaymentsTab {
		public WebDriver driver;
		public WebElement uIParkingPaymentFrame;

		public PaymentsTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "btndelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "btnBackPayment")
		public WebElement uIAddOtherPaymentButton;

		@FindBy(how = How.ID, using = "grdPayments")
		public WebElement uIPaymentsTabGridTable;
	}

	public class CommentsTab {

		public WebDriver driver;

		public CommentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uICommentsTable;

	}

	public class ParkingEntryHistoryTab {

		public WebDriver driver;

		public ParkingEntryHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//table[@id='listMsg']")
		public WebElement uIHistoryTable;

	}

	public class ParkingSearch {
		public WebDriver driver;

		public ParkingSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_nbrParkingNoFrom_Year")
		public WebElement uIParkingNumberFromYear;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_nbrParkingNoTo_Year")
		public WebElement uIParkingNumberToYear;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_nbrParkingNoFrom_Number")
		public WebElement uIParkingNumberFromNumber;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_nbrParkingNoTo_Number")
		public WebElement uIParkingNumberToNumber;

		@FindBy(how = How.ID, using = "grdParking")
		public WebElement uIParkingSearchTable;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_cddDtSrchType_DropDown")
		public WebElement uIDataTypeComboBox;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_dttArrestDttmFrom_KPIDttmCtrl")
		public WebElement uIDataTypeFromDateEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_dttArrestDttmTo_KPIDttmCtrl")
		public WebElement uIDataTypeToDateEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_cddAdjLevel")
		public WebElement uIAdjustmentLevelComboBox;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_txtTicketNbr")
		public WebElement uITicketEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_lupOffPFID_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_custNames_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_custNames_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_custNames_MiddleName")
		public WebElement uIMiddleNameEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_lupCharge_CodeValue")
		public WebElement uIViolationCodeEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_txtPlateNbr")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_cddState_DropDown")
		public WebElement uIPlateStateComboBox;

	}

	public class CrashUnit {

		public PersonTab personTab;
		public CrashUnitVehicleTab crashUnitVehicleTab;
		public DamageConditionsTab damageConditionsTab;

		public WebDriver driver;

		public CrashUnit() {
			if (this.personTab == null)
				this.personTab = new PersonTab();

			if (this.crashUnitVehicleTab == null)
				this.crashUnitVehicleTab = new CrashUnitVehicleTab();

			if (this.damageConditionsTab == null)
				this.damageConditionsTab = new DamageConditionsTab();

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtUnit")
		public WebElement uIUnitNoEdit;

		@FindBy(how = How.ID, using = "txtOcc")
		public WebElement uINoOfOccupantsEdit;

		@FindBy(how = How.ID, using = "nbrTraCS_Year")
		public WebElement uICrashYearEdit;

		@FindBy(how = How.ID, using = "nbrTraCS_Number")
		public WebElement uICrashNumberEdit;

		@FindBy(how = How.ID, using = "dtmRptDttm_Date_KPIDttmCtrl")
		public WebElement uIReportedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtmRptDttm_Time']//input")
		public WebElement uITimeEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Person')]")
		public WebElement uIPersonTab;

			@FindBy(how = How.XPATH, using = "//span[text()='Vehicle']")
		public WebElement uIVehicleTab;
		
//		@FindBy(how = How.XPATH, using = "//span//span[contains(@class, 'igtab_BlueThemeTHText igtab_BlueThemeTHTextSel')]")
//		public WebElement uIVehicleTab;
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Damage / Conditions')]")
		public WebElement uIDamageConditionsTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']//b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class PersonTab {
		public WebDriver driver;

		public PersonTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddPerson_DropDown")
		public WebElement uITypeOfPersonComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddPerson_DropDown")
		public WebElement uIKSTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_nNameID_NameType")
		public WebElement uIKSNameTypeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_nNameID_NameTypeID")
		public WebElement uIKSNameIDEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_lblAtDistFrom")
		public WebElement uIName2656TextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_nNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_nNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_nNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_nNameID_LastName")
		public WebElement uIKSLastNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_nNameID_FirstName")
		public WebElement uIKSFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtPersonAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_custHeaderCSZ_City")
		public WebElement uICityEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_custHeaderCSZ_State_DropDown")
		public WebElement uISTComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_custHeaderCSZ_Zip")
		public WebElement uIZipEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtPersonalPhone")
		public WebElement uIHomePhoneEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtWorkPhone")
		public WebElement uIWorkPhoneEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_dtDOB_KPIDttmCtrl")
		public WebElement uIDOBEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtAge")
		public WebElement uIAgeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtSex")
		public WebElement uIGenderEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtDL")
		public WebElement uIDLEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_ChkDrivforEmp")
		public WebElement uIDriverForEmployerCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_ChkCDL")
		public WebElement uICDLCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddDLLIc_DropDown")
		public WebElement uIDLLicenseComplyComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddCommercial_Input")
		public WebElement uICommercialEndrosementsInputComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddCommercial_DropDown")
		public WebElement uICommercialEndrosementsComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddDLState_DropDown")
		public WebElement uIDLStateComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_dlExpiration_KPIDttmCtrl")
		public WebElement uIDLExpirationEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddDLClass_DropDown")
		public WebElement uIDLClassComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddNo1_DropDown")
		public WebElement uIRestriction1ComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_ChkYes1")
		public WebElement uIRestriction1YCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_ChkNo1")
		public WebElement uIRestriction1NCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_chkHit")
		public WebElement uIHitandRunCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_chkHit")
		public WebElement uIKSHitandRunCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_ChkDUI")
		public WebElement uIDUICheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_nNameID_imgSrch")
		public WebElement uINameInfoIconButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_ChkYes")
		public WebElement uIRestrictComplyYCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_ChkNo")
		public WebElement uIRestrictComplyNCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_lupCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_lupCharge_imgBtn")
		public WebElement uIChargeLookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_lupCharge2_CodeValue")
		public WebElement uICharge2Edit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_lupCharge2_imgBtn")
		public WebElement uICharge2LookupButton;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_chkMultiCharge")
		public WebElement uIMultiChargesCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_txtCitation_CitationNbr")
		public WebElement uISummonNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_txtCitation2_CitationNbr")
		public WebElement uISummonNo2Edit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddPosition_DropDown")
		public WebElement uIPositioninOnVehicleComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddEjection_DropDown")
		public WebElement uIEjectionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddSafty_DropDown")
		public WebElement uISafetyEquipmentComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddSafty_DropDown")
		public WebElement uIKSSafetyEquipmentComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddUsed_DropDown")
		public WebElement uIUsedComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddAirBag_DropDown")
		public WebElement uIAirBagComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddPhysicCond_DropDown")
		public WebElement uIVictamPhysicalConditionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddinjLoc_DropDown")
		public WebElement uILocofmostseverephysInjComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddTypeInj_DropDown")
		public WebElement uITypeofmostseverephysInjComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddPosition_DropDown")
		public WebElement uIPositionInVehicleComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddInjuredServerity_DropDown")
		public WebElement uIInjurySeverityComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtTranspt")
		public WebElement uITransportUnit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddEjection_DropDown")
		public WebElement uIEjectedTrappedComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtInjuredTaken")
		public WebElement uIInjuredTakenByEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddEjectionPath_DropDown")
		public WebElement uIEjectionPathComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_txtInjuredTakenTo")
		public WebElement uIInjuredTakenToEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddPedestrian1_DropDown")
		public WebElement uIPedestrainRoadwayLocationBeforeImpactComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddOtherPadestrian_DropDown")
		public WebElement uIOtherPedestrainLocationComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddPedestrian2_DropDown")
		public WebElement uIPedestrainActionBeforeCrashComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddPedestrainObediencce_DropDown")
		public WebElement uIPedestrainObedienceToTraficSignalComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSPerson1_cddContributing_Input")
		public WebElement uIContributingCircumstancesComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_txtEyes")
		public WebElement uIEyeColourEdit;
		
		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_cddDLClass_DropDown")
		public WebElement uIDLClassDropDown;
		
		@FindBy(how = How.ID, using = "tabCE_tmpl0_UsrNJPerson1_nNameID_imgSrch")
        public WebElement uINJNameInfoIcon;
		
	}

	public class CrashUnitVehicleTab {
		public WebDriver driver;

		public CrashUnitVehicleTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_plcVehicle_PlateNumber")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_plcVehicle_KPIState")
		public WebElement uIPlateStateComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_plcVehicle_PlateNumber")
		public WebElement uIKSLicensePlateNumberEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_plcVehicle_KPIState")
		public WebElement uIKSLicensePlateStateComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_plcVehicle_imgBtn")
		public WebElement uIPlateLookupButton;

		@FindBy(how = How.XPATH, using = "//span[@id ='tabCE_tmpl1_UsrNJVehicle1_lblVehPlate']/ancestor::td[@align='right']")
		public WebElement uIPlateNoTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_chkDriver")
		public WebElement uIVehicleOwnerSameAsDriverCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_chkDriver")
		public WebElement uIKSVehicleOwnerSameAsDriverCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_nNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_nNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_nNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_nOwnerNameID_NameType")
		public WebElement uIKSNameTypeEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_nOwnerNameID_NameTypeID")
		public WebElement uIKSNameIDEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_nOwnerNameID_LastName")
		public WebElement uIKSLastNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_nOwnerNameID_FirstName")
		public WebElement uIKSFirstNameEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_cddVehUse_DropDown")
		public WebElement uIVehicleUseComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_cddSpl_DropDown")
		public WebElement uISpecialFunctionVehicleComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtInsurance")
		public WebElement uIInsurancePolicyNoEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_cddInsurance_DropDown")
		public WebElement uIInsuranceCodeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_cddBodyType_DropDown")
		public WebElement uIKSVehicleBodyTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_cddType_DropDown")
		public WebElement uIVehicleBodyTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_txtBodyType")
		public WebElement uIMCCCEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_cddVehUse_DropDown")
		public WebElement uIKSVehicleUseComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_cddOwnercounty_DropDown")
		public WebElement uICountyComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrKSVehicle1_txRemovedBy")
		public WebElement uIRemovedByEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtVehNo")
        public WebElement uIVehicleNoEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtVehYear")
        public WebElement uIYearEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtVehMake")
        public WebElement uIMakeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtVehModel")
        public WebElement uIModelEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtVehVin")
        public WebElement uIVINEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtVehColor1")
        public WebElement uIColor1Edit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrNJVehicle1_txtVehColor2")
        public WebElement uIColor2Edit;

	}

	public class DamageConditionsTab {
		public WebDriver driver;

		public DamageConditionsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddInitialImpact_DropDown")
		public WebElement uIInitialImpactComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddPrincipal_DropDown")
		public WebElement uIPrincipalDamComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddDirectionTravel_DropDown")
		public WebElement uIDirectionTravelOfTheVehicleComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddExtDamage_DropDown")
		public WebElement uIExtentOfDamageComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddCircumstanceA_DropDown")
		public WebElement uIApparentContributingCircumstanceAComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddCircumstanceB_DropDown")
		public WebElement uIApparentContributingCircumstanceBComboBox;

		// @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddCellUse_DropDown")
		// public WebElement uICellPhoneUseByDriverComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddPreCrash_DropDown")
		public WebElement uIPreCrashAcrionComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddTrafficCntl_DropDown")
		public WebElement uITrafficControlsComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddNonCollSeqEvnt1_DropDown")
		public WebElement uISequenceofEvents1stComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddNonCollSeqEvnt2_DropDown")
		public WebElement uISequenceofEvents2ndComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddNonCollSeqEvnt3_DropDown")
		public WebElement uISequenceofEvents3rdComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddNonCollSeqEvnt4_DropDown")
		public WebElement uISequenceofEvents4thComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddMostHarmful_DropDown")
		public WebElement uIMostHarmfulEventComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollSeqEvnt1_DropDown")
		// public WebElement uICollisionwithPersonMVorNonFixedObject1stComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollSeqEvnt2_DropDown")
		// public WebElement uICollisionwithPersonMVorNonFixedObject2ndComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollSeqEvnt3_DropDown")
		// public WebElement uICollisionwithPersonMVorNonFixedObject3rdComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollSeqEvnt4_DropDown")
		// public WebElement uICollisionwithPersonMVorNonFixedObject4thComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollFixSeqEvnt1_DropDown")
		// public WebElement uICollisionwithFixedObject1stComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollFixSeqEvnt2_DropDown")
		// public WebElement uICollisionwithFixedObject2ndComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollFixSeqEvnt3_DropDown")
		// public WebElement uICollisionwithFixedObject3rdComboBox;

		// @FindBy(how = How.ID, using =
		// "tabCE_tmpl2_UsrNJDamage1_cddCollFixSeqEvnt4_DropDown")
		// public WebElement uICollisionFixedObject4thComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddPhysicalStatus_DropDown")
		public WebElement uIApperantPhysicalStatusAComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddPhysicalStatus2_DropDown")
		public WebElement uIApperantPhysicalStatusBComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddAlcoholGiven_DropDown")
		public WebElement uIAlcoholGivenComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_cddAlcoholType_DropDown")
		public WebElement uIAlcoholTypeComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_txtAlcoholResult")
		public WebElement uIResultTextView;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_txtAlcoholTestResult")
		public WebElement uIResultEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrNJDamage1_chkPending")
		public WebElement uIPendingCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddFirstImpact_DropDown")
		public WebElement uIKSFirstImpactComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddMajorImpact_DropDown")
		public WebElement uIKSMajorImpactComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddVehDamage_DropDown")
		public WebElement uIKSVehicleDamageComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddDirection_DropDown")
		public WebElement uIKSDirectionOfTravelComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddVehManeuver_DropDown")
		public WebElement uIKSVehicleManeuverBeforeUnstableSituationComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_txtCalculated")
		public WebElement uIKSCalculatedSpeedAtAImpactEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkFire")
		public WebElement uIKSFireCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddSpecial_Input")
		public WebElement uIKSSpecialConditionsForTrafficUnitComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddSpecial_DropDown")
		public WebElement uIKSSpecialConditionsForTrafficUnitComboBox1;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddTrailer_DropDown")
		public WebElement uIKSTrailerPresentDamagedComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddNonColl1_DropDown")
		public WebElement uIKSNonCollision1stComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddNonColl2_DropDown")
		public WebElement uIKSNonCollision2ndComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddNonColl3_DropDown")
		public WebElement uIKSNonCollision3rdComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddNonColl4_DropDown")
		public WebElement uIKSNonCollision4thComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddColl1_DropDown")
		public WebElement uIKSCollisionWith1stComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddColl2_DropDown")
		public WebElement uIKSCollisionWith2ndComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddColl3_DropDown")
		public WebElement uIKSCollisionWith3rdComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddColl4_DropDown")
		public WebElement uIKSCollisionWith4thComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddSubstance_Input")
		public WebElement uIKSSubstanceUseComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddSubstance_DropDown")
		public WebElement uIKSSubstanceUseComboBox1;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddAlcohol_Input")
		public WebElement uIKSAlcoholComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddAlcohol_DropDown")
		public WebElement uIKSAlcoholComboBox1;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddDrugs_Input")
		public WebElement uIKSDrugsComboBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_cddDrugs_DropDown")
		public WebElement uIKSDrugsComboBox1;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkTest")
		public WebElement uIKSNoTestGivenCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkEvidentiary")
		public WebElement uIKSEvidentiaryTestGivenCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkTestRef")
		public WebElement uIKSTestRefusedCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkBlood")
		public WebElement uIKSBloodCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_txtDrugScreen")
		public WebElement uIKSDrugScreenResultEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_txtEye2")
		public WebElement uIKSEyeFluidEdit;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkPrelim")
		public WebElement uIKSPrelimPositiveTestCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkEvidentiaryBreath")
		public WebElement uIKSEvidentiaryBreathCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkResults")
		public WebElement uIKSResultPendingCheckBox;

		@FindBy(how = How.ID, using = "tabCE_tmpl2_UsrKSDamage1_chkOther")
		public WebElement uIKSOtherCheckBox;

	}

	public class ParkingOtherPayment {
		public WebDriver driver;

		public ParkingOtherPayment() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dtcCurDttm_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "txtTotalCost")
		public WebElement uIPaymentEdit;

		@FindBy(how = How.ID, using = "cddPaymethod_DropDown")
		public WebElement uIPaymentMethodComboBox;

		@FindBy(how = How.ID, using = "txtCmt")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

	}

	public class TicketHoldReason {

		public WebDriver driver;

		public TicketHoldReason() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtHoldReason")
		public WebElement uIReasonEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

	}

	public class ParkingPermits {
		public WebDriver driver;

		public ParkingPermits() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lblActionDate")
		public WebElement uIActionDateLbl;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "grdPermits")
		public WebElement uIPermitTable;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "plcVehID_PlateNumber")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "plcVehID_KPIState")
		public WebElement uIPlateStateComboBox;

		@FindBy(how = How.ID, using = "cddAction_DropDown")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "dttmActionDate_KPIDttmCtrl")
		public WebElement uIActionDateEdit;

		@FindBy(how = How.ID, using = "dttmDenialDate_KPIDttmCtrl")
		public WebElement uIDenialDateEdit;

		@FindBy(how = How.ID, using = "adrPermitAddress_txtFrom")
		public WebElement uIPermitLocationEdit;

		@FindBy(how = How.ID, using = "adrPermitAddress_chkVerify")
		public WebElement uIPermitLocationCheckbox;

		@FindBy(how = How.ID, using = "cddReason_DropDown")
		public WebElement uIReasonComboBox;

		@FindBy(how = How.ID, using = "dttmValidfrm_KPIDttmCtrl")
		public WebElement uIValidExtendFromDateEdit;

		@FindBy(how = How.ID, using = "dttmValidto_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.ID, using = "txtExtensionsday")
		public WebElement uINoOfDaysRequestedEdit;

		@FindBy(how = How.ID, using = "dtExpireDate_KPIDttmCtrl")
		public WebElement uIExpireDateEdit;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "nIssueToNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nIssueToNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "nIssueToNameID_imgSrch")
		public WebElement uINameInfoButton;
		
		@FindBy(how = How.ID, using = "plcVehID_imgBtn")
		public WebElement uIPlateInfoButton;
		
		@FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "nbrPermitNo_Year")
		public WebElement uIPermitYearEdit;

		@FindBy(how = How.ID, using = "nbrPermitNo_Number")
		public WebElement uIPermitNumberEdit;

		@FindBy(how = How.ID, using = "txtPermitsCount")
		public WebElement uIpermitMidddleFieldCountEdit;

		@FindBy(how = How.ID, using = "txtStatus")
		public WebElement uIStatusEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdPermits")
		public WebElement uIPermitHistoryTable;

		@FindBy(how = How.ID, using = "btnAttach")
		public WebElement uIAttachmentButton;

		@FindBy(how = How.XPATH, using = "//td[contains(@class,'GridImage1')]")
		public WebElement uIAttachImageButton;

		@FindBy(how = How.ID, using = "lblPermitAddress")
		public WebElement uIPermitLocationTextView;

		@FindBy(how = How.ID, using = "cddPermitType_DropDown")
		public WebElement uIPermitTypeComboBox;

		@FindBy(how = How.ID, using = "imgClearOper")
		public WebElement uINameClearButton;
		
		@FindBy(how = How.ID, using = "plcVehID_imgBtn")
		public WebElement uIPlateLookupIcon;

	}

	public class ParkingPermitsSearch {

		public WebDriver driver;

		public ParkingPermitsSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_txtPlateNbr")
		public WebElement uIPlateEdit;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_cddState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_nbrPermits_Year")
		public WebElement uIPermitYearEdit;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_nbrPermits_Number")
		public WebElement uIPermitNuumberEdit;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_cddStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_cddReason_DropDown")
		public WebElement uIReasonComboBox;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_adrPermits_CddLocationType")
		public WebElement uIPermitAddressComboBox;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_adrPermits_TxtStartPremise")
		public WebElement uIPermitAddressPremiseEdit;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_adrPermits_TxtStreetName")
		public WebElement uIPermitAddressStreetEdit;

		@FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrPermitsSrchBasic1_adrPermits_adrAddrsCtrl_txtFrom")
		public WebElement uIPermitAddressEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdParkingPermitSrch")
		public WebElement uIParkingPermitSearchTable;
		
		@FindBy(how = How.ID, using = "cddDateType")
		public WebElement uIDateTypeDropdown;
		
		@FindBy(how = How.ID, using = "dtActionPrFrom_KPIDttmCtrl")
		public WebElement uIFromDateEdit;
		
		@FindBy(how = How.ID, using = "dtActionPrTo_KPIDttmCtrl")
		public WebElement uIToDateEdit;
	}

	public class ParkingPermitsAuthenticate {

		public WebDriver driver;

		public ParkingPermitsAuthenticate() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtPassWord")
		public WebElement uIPasswordEdit;

		@FindBy(how = How.ID, using = "cmdLogin")
		public WebElement uIAcceptButton;

	}

	public class Court {
		public WebDriver driver;

		public Court() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

	}

	public class CourtEntry {

		public WebDriver driver;

		public CourtEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lblXref2")
		public WebElement uICustomText;

	}
	public class KPICrimeSceneSDK { // Added by Abi

		public WebDriver driver;

		public KPICrimeSceneSDK() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ttn-navTab-draw")
		public WebElement uIDrawTab;

		@FindBy(how = How.XPATH, using = "//div[@id='teton-template-start']")
		public WebElement uIStartTemplateButton;

		@FindBy(how = How.XPATH, using = "//table[@id='ttn-template-mgr-table']//div[@id='ttn-thumbnail-21']")
		public WebElement uITemplate;

		@FindBy(how = How.ID, using = "teton-tmpl-mgr-ok-button")
		public WebElement uIOkButton;

		@FindBy(how = How.XPATH, using = "input[@id='btnSave']")
		public WebElement uISaveButton;
	}

}
