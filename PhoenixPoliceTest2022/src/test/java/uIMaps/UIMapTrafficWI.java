package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapTrafficWI 
{
	
	
	public DeerCrash deerCrash;	
		 public CitationEntry citationEntry;
     public CitationSearch citationSearch;
     public CrashEntry crashEntry;
     public ParkingEntry parkingEntry;
     public ParkingSearch parkingSearch;
     public ParkingOtherPayment parkingOtherPayment;
     public CitationComments citationComments;
     public CrashSearch crashSearch;
     public CrashComments crashComments;
     public TicketHoldReason ticketHoldReason;
     public CitationArrest citationArrest;
     public UnitDetails unitDetails;
     public CrashEntryMoreScreen crashEntryMoreScreen;
     public StruckObjects struckObjects;
     public CrashSearchHelpWindow crashSearchHelpWindow;
     public CitationSearchHelpWindow citationSearchHelpWindow;
     public PaymentMethodScreen paymentMethodScreen;
	
     public UIMapTrafficWI()
 	{
 		if(this.citationEntry == null)
 			this.citationEntry = new CitationEntry();
 		if(this.citationSearch == null)
 			this.citationSearch = new CitationSearch();
 		if(this.crashEntry == null)
 			this.crashEntry = new CrashEntry();
 		if(this.parkingEntry == null)
 			this.parkingEntry = new ParkingEntry();
 		if(this.parkingSearch == null)
 			this.parkingSearch = new ParkingSearch();
 		if(this.parkingOtherPayment == null)
 			this.parkingOtherPayment = new ParkingOtherPayment();
 		if(this.citationComments == null)
 			this.citationComments = new CitationComments();
 		if(this.crashSearch == null)
 			this.crashSearch = new CrashSearch();
 		if(this.crashComments == null)
 			this.crashComments = new CrashComments();
 		if(this.crashComments == null)
 			this.crashComments = new CrashComments();
 		if(this.ticketHoldReason == null)
 			this.ticketHoldReason = new TicketHoldReason();
 		if(this.citationArrest == null)
 			this.citationArrest = new CitationArrest();
 		if(this.unitDetails == null)
 			this.unitDetails = new UnitDetails();
 		if(this.crashEntryMoreScreen == null)
 			this.crashEntryMoreScreen = new CrashEntryMoreScreen();
 		if(this.struckObjects == null)
 			this.struckObjects = new StruckObjects();
 		if(this.crashSearchHelpWindow == null)
 			this.crashSearchHelpWindow = new CrashSearchHelpWindow();
 		if(this.citationSearchHelpWindow == null)
 			this.citationSearchHelpWindow = new CitationSearchHelpWindow();	
 		if(this.paymentMethodScreen == null)
 			this.paymentMethodScreen = new PaymentMethodScreen();
 		if(this.deerCrash == null)
 			this.deerCrash = new DeerCrash();	
 	}
	
	

	
	public class CitationEntry
    {
		
		
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
		public CitationEntryApprovalTab citationEntryApprovalTab;
		

		
        public WebDriver driver;
        public CitationEntry()
        {
    		if(this.violationsTab == null)
    			this.violationsTab= new ViolationsTab();
    		
    		if(this.licenseTab == null)
    			this.licenseTab= new LicenseTab();

    		if(this.offenseTab == null)
    			this.offenseTab= new OffenseTab();	
    		
    		if(this.plaintiffTab == null)
    			this.plaintiffTab = new PlaintiffTab();
    		
    		if(this.citationEntryVehicleTab == null)
    			this.citationEntryVehicleTab = new CitationEntryVehicleTab();
    		
    		if(this.officerTab == null)
    			this.officerTab = new OfficerTab();
    		
    		if(this.courtTab == null)
    			this.courtTab = new CourtTab();
        	
    		if(this.citationEntryPaymentsTab == null)
    			this.citationEntryPaymentsTab = new CitationEntryPaymentsTab();
    		
    		if(this.citationEntryNarrativeTab == null)
    			this.citationEntryNarrativeTab = new CitationEntryNarrativeTab();
    		
    		if(this.citationEntryWitnessTab == null)
    			this.citationEntryWitnessTab = new CitationEntryWitnessTab();
    		
    		if(this.citationEntryCommentsTab == null)
    			this.citationEntryCommentsTab = new CitationEntryCommentsTab();    		
    		
    		if(this.citationEntryMapTab == null)
    			this.citationEntryMapTab = new CitationEntryMapTab();

    		
    		if(this.citationEntryApprovalTab == null)
    			this.citationEntryApprovalTab = new CitationEntryApprovalTab();

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        
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
        
        @FindBy(how = How.ID, using = "nNameID_MiddleName")
        public WebElement uIMiddleNameEdit;

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

        @FindBy(how = How.ID, using = "nbrIncidentID_imgBtn")
        public WebElement uICaseInfoEdit;
        
        @FindBy(how = How.ID, using = "nbrCallNo_imgBtn")
        public WebElement uICallInfoEdit;
        
        @FindBy(how = How.XPATH, using = "//td[@class = 'status']/b")
        public WebElement uILeftSideStatusBar;
        
        @FindBy(how = How.ID, using = "lblNameID")
        public WebElement uINameIdlbl;
        
        @FindBy(how = How.XPATH, using = "//span[@mkr = 'ti13']")
        public WebElement uICommentsColorTab;
    }
	
	public class ViolationsTab
    {
        public WebDriver driver;
        public ViolationsTab()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_adrLocation_chkVerify")
        public WebElement uILocationCheckBox;

        @FindBy(how = How.ID, using = " tabCE_tmpl6_UsrViolations1_lupOffPFID_CodeValue")
        public WebElement uIVoilationOfficerEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_lupOffPFID_imgBtn")
        public WebElement uIOfficerLookupButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_txtCitNbr")
        public WebElement uICitationNumberEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_cddSrvMethod_DropDown")
        public WebElement uIServedMethodComboBox;
   
        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJViolations1_lupCharge_imgBtn")
        public WebElement uIChargeLookupButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_cddNibrs")
        public WebElement uINIBRSComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_lupOffPFID_CodeValue")
        public WebElement uIOfficerEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_lupCharge_CodeValue")
        public WebElement uIChargeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_grdViolations")
        public WebElement uIViolationTabResultGrid;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_cmdAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_cmdClear")
        public WebElement uIClearButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_adrLocation_txtFrom")
        public WebElement uILocationEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_adrLocation_cmdIncOnAddr")
        public WebElement uILocationInfoIconEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_adrLocation_chkVerify")
        public WebElement uILocationVerifyCheckBox;
        
        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_lupCharge_CodeDescription")
        public WebElement uIChargeDescripton;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrViolations1_btnNIBRS")
        public WebElement uINIBRSButton;
    }

    public class LicenseTab
    {
        public WebDriver driver;
        public LicenseTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_txtDOB")
        public WebElement uIDOBEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_txtGender")
        public WebElement uIGenderEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_txtRace")
        public WebElement uIRaceEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_txtHeight")
        public WebElement uIHeightEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_txtWeight")
        public WebElement uIWeightEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_txtSSNo")
        public WebElement uISSNoEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_chkNoDL")
        public WebElement uINoDLCheckbox;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_txtDrvLIC")
        public WebElement uIDrivierLicenseNoEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrLicense1_chkNoDL")
        public WebElement uINoDLCheckBox;
    }

    public class OffenseTab
    {
        public WebDriver driver;
        public OffenseTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_adrLocation_txtFrom")
        public WebElement uIDescribeLocationEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_lupCharge_CodeValue")
        public WebElement uIChargeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_stcOnStreet_txtFrom")
        public WebElement uIStreetNameEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_stcOnStreet_chkVerify")
        public WebElement uIStreetVerifyCheckbox;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrViolations1_lupCharge_imgBtn")
        public WebElement uIChargeLookupButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrViolations1_lupOffPFID_CodeValue")
        public WebElement uIOfficerEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_adrLocation_chkVerify")
        public WebElement uIDescribeLocationCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_adrLocation_cmdIncOnAddr")
        public WebElement uIDescribeLocationInfoButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_chkUnclearPlates")
        public WebElement uIUnclearPlatesCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_cddInThe_DropDown")
        public WebElement uIInTheComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_lupOf_CodeDescription")
        public WebElement uIMunicipalityDescribeTextView;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_cddSrvMethod_DropDown")
        public WebElement uIServedMethodComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_lupCharge_CodeValue")
        public WebElement uISatatueOrdinaceCodeValueEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_usrOffense1_dttmOffense_Date_KPIDttctrl")
        public WebElement uIOffenseDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id ='tabCE_tmpl2_usrOffense1_dttmOffense_Time']//input")
        public WebElement uIOffenseTimeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_cddAtHwyType_DropDown")
        public WebElement uIAtHwyTypeComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_stcAtStreet_txtFrom")
        public WebElement uIAtStreetNameEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_stcAtStreet_chkVerify")
        public WebElement uIAtStreetNameVerifyCheckbox;
        
        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrOffense1_stcOnStreet_txtFrom")
		public WebElement uIStreetEdit; 
    }

    public class PlaintiffTab
    {
        public WebDriver driver;
        public PlaintiffTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_cddPltType_DropDown")
        public WebElement uIPlaintiffTypeComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_lupCounty_imgBtn")
        public WebElement uICountySearchButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_lupCounty_CodeValue")
        public WebElement uICountyEdit;

         @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_lupCourtName_CodeValue")
        public WebElement uICourtTypeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_Kpilabel5")
        public WebElement uIKPILabelTextView;
   							   
        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_lupCVT_CodeValue")
        public WebElement uICityVillageTownEdit;
        
        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_lupCVT_CodeDescription")
        public WebElement uICityVillageTownTextView;
        

        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_lupCourtType_CodeDescription")
        public WebElement uICourtTypeTextView;

        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_lupCourtName_CodeDescription")
        public WebElement uICourtNameTextView;

        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_cddPayMethod_DropDown")
        public WebElement uIPaymentMethodComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl3_UsrNJPlaintiff1_cddDARoute_DropDown")
        public WebElement uITranProsOffComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl4_UsrPlaintiff1_curBailAmt")
        public WebElement uIDepositBailEdit;
    }

    public class CitationEntryVehicleTab
    {
        public WebDriver driver;
        public CitationEntryVehicleTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_plcVehicle_PlateNumber")
        public WebElement uIVehicleVinEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_plcVehicle_KPIState")
        public WebElement uIStateComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_plcVehicle_imgBtn")
        public WebElement uIVehicleInfoButton;
        //
        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_txtPlateTyp")
        public WebElement uILicensePlateTypeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_txtIssueSt")
        public WebElement uIIssuingStateEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_txtPltExpYear")
        public WebElement uIPlateExpirationYearEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_txtVehYear")
        public WebElement uIVehicleYearEdit;
        //
        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_txtVehMake")
        public WebElement uIVehicleMakeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_txtVehColor")
        public WebElement uIVehicleColorEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_txtVin")
        public WebElement uIVinNoEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_plcVehicle_PlateNumber")
        public WebElement uIPlateVinEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_chkNoPlate")
        public WebElement uINoPlateCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrTraVeh1_plcVehicle_imgBtn")
        public WebElement uIPlateVinLookupButton;
    }
  
    public class OfficerTab
    {
        public WebDriver driver;
        public OfficerTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupOffPFID_CodeValue")
        public WebElement uIOfficerPFEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupOffPFID_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupOffPFID_CodeValue")
        public WebElement uIOfficercomplianingWitnessEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupOffPFID_CodeDescription")
        public WebElement uIOfficercomplianingWitnessLookupButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupIssuOff_CodeValue")
        public WebElement uIIssuingOfficerEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupIssuOff_imgBtn")
        public WebElement uIIssuingOfficerLookupButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddArea_DropDown")
        public WebElement uIAreaComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddRdCondt_DropDown")
        public WebElement uIRoadComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddTrfCondt_DropDown")
        public WebElement uITrafficComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddLgtCondt_DropDown")
        public WebElement uIVisibilityComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddNLanes_DropDown")
        public WebElement uINoLanesComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_ccdAccident_DropDown")
        public WebElement uIAccidentComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_ccdSeverity_DropDown")
        public WebElement uISeverityComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupEquipOpr_CodeValue")
        public WebElement uIEquipOperatorNameEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupEquipOpr_imgBtn")
        public WebElement uIEquipOperatorNameLookupButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_ccdUnitCode_DropDown")
        public WebElement uIUnitCodeComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_txtEquipment")
        public WebElement uIEquipmentNoEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_chkEqipment_3")
        public WebElement uIRadarCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_chkEqipment_0")
        public WebElement uIHelicopterCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_chkEqipment_1")
        public WebElement uIPaceCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_chkEqipment_2")
        public WebElement uIVASCARCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_chkEqipment_4")
        public WebElement uIBreathalyzerCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_lupOffPFID_CodeValue")
        public WebElement uIOfficerEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddHighWay_DropDown")
        public WebElement uIHighWayComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddLgtCondt_DropDown")
        public WebElement uILightConditionComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddWtrCondt_DropDown")
        public WebElement uIWeatherConditionComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddTrfCondt_DropDown")
        public WebElement uITrafficConditionComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddNLanes_DropDown")
        public WebElement uINoofLanesComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrTraOfficer1_cddNLanes_DropDown")
        public WebElement uIRoadConditionComboBox;
        
    }
    
    
    public class CourtTab
    {
        public WebDriver driver;

        public CourtTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }


        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_grdCEViolations")
        public WebElement uICourtTabResultGrid;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_dtcCourtDttm_Date_KPIDttmCtrl")
        public WebElement uICourtDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'tabCE_tmpl7_UsrCourt1_dtcCourtDttm_Time']//input")
        public WebElement uICourtTimeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_lupDisposition_CodeValue")
        public WebElement uIDispositionEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl6_UsrNJCourt1_lupDisposition_imgBtn")
        public WebElement uIDispositionLookupButton;
        						
        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_lupCharge_CodeValue")
        public WebElement uIOriginalChargeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_curPaidAmt")
        public WebElement uIBalanceTextView;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_curCEPenaltyAmt")
        public WebElement uIPenaltyAmountEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_curCEFineAmt")
        public WebElement uIFineForfeitureEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_cmdAdd")
        public WebElement uIUpdateButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_cddMethod_DropDown")
        public WebElement uIMethodComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrCourt1_Kpilabel1")
        public WebElement uICourtDateLabel;
    }

    
    
    
    
    public class CitationEntryPaymentsTab
    {
        public WebDriver driver;

        public CitationEntryPaymentsTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }


        @FindBy(how = How.ID, using = "tabCE_tmpl8_UsrPayment1_grdPayment")
        public WebElement uIPaymentTabResultGrid;

         @FindBy(how = How.ID, using = "tabCE_tmpl8_UsrPayment1_dtcTrnDate_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl8_UsrPayment1_curPaidAmt")
        public WebElement uIPaymentEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl8_UsrPayment1_cddPayMethod_DropDown")
        public WebElement uIMethodComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl8_UsrPayment1_curBalance")
        public WebElement uIBalanceEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl8_UsrPayment1_txtReceiptRef")
        public WebElement uIReciptReferenceEdit;
    }
    
    

    public class CitationEntryNarrativeTab
    {
        public WebDriver driver;

        public CitationEntryNarrativeTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.XPATH, using = "//body")
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
    }

    
    
    public class CitationEntryWitnessTab
    {
        public WebDriver driver;
        public CitationEntryWitnessTab()
        {
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

        @FindBy(how = How.XPATH, using = "//div[@id='grdWitness']//td[@class='Delete_Icon_Style']")
        public WebElement uIDeleteIconGridButton;
    }

    
    
    public class CitationEntryCommentsTab
    {
        public WebDriver driver;
        public CitationEntryCommentsTab()
        {
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
    
    
    
    public class CitationComments
    {
        public WebDriver driver;
        public CitationComments()
        {
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
    
    

    public class CitationEntryMapTab
    {
        public WebDriver driver;
        public CitationEntryMapTab()
        {
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

    
 
     public class CitationEntryApprovalTab
     {
         public WebDriver driver;

         public CitationEntryApprovalTab()
         {
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
     
    public class CitationArrest
    {
        public WebDriver driver;
        public CitationArrest()
        {
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
        
        @FindBy(how = How.ID, using = "cddJuvStatus_DropDown")
		public WebElement uIAgencyActionCombobox; 
    }
    
    
    
    
    
    public class CitationSearch
    {

        public WebDriver driver;
        public CitationSearch()
        {

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

        @FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrSummonSrchBasic1_txtLastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrSummonSrchBasic1_txtFirstName")
        public WebElement uIFirstNameEdit;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_txtMiddleName")
        public WebElement uIMiddleNameEdit;

        @FindBy(how = How.XPATH, using = "//img[@src='/KPIImages/ico/16_print.gif']")
        public WebElement uIPrintIcon;
        
        @FindBy(how = How.ID, using = "tabPermitSrch_tmpl0_UsrSummonSrchBasic1_lupNibrs_CodeValue")
        public WebElement uINIBRSEdit;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_adrAtLoc_adrAddrsCtrl_txtFrom")
        public WebElement uICitationLocationEdit;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_adrAtLoc_CddLocationType")
        public WebElement uICitationLocationDropdown;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_adrAtLoc_TxtStartPremise")
        public WebElement uICitationLocPremiseNoEdit;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_adrAtLoc_TxtStreetName")
        public WebElement uICitationLocStreetEdit;

        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_adrAtLoc_TxtStreetName1")
        public WebElement uICitationLocStreet1Edit;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_adrAtLoc_TxtStreetName2")
        public WebElement uICitationLocStreet2Edit;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_lblDocket")
        public WebElement uIDocketNoLabel;
        
        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_txtDocketNbr")
        public WebElement uIDocketNoEdit;

        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_dttmDob_KPIDttmCtrl")
        public WebElement uIDOBEdit;

        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_nbrIncidentID_Year")
		public WebElement uICallYearEdit;

        @FindBy(how = How.ID, using = "tabSummonsSrch_tmpl0_UsrSummonSrchBasic1_nbrIncidentID_Number")
      		public WebElement uICallNumberEdit;
        
    }

    
    
    public class CitationSearchHelpWindow
    {
         public WebDriver driver;
         public CitationSearchHelpWindow()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

         @FindBy(how = How.ID, using = "grdSummons")
         public WebElement uICitationSearchResultGrid;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
         public WebElement uIRefreshButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
         public WebElement uIAddNewButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
         public WebElement uIResetButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
         public WebElement uIBackButton;
    }


    
    public class CrashEntry
    {
  
    	
    	 public CrashEntryMainTab crashEntryMainTab;
         public WitnessTab witnessTab;
         public OccupantsTab occupantsTab;
         public TruckBusTab truckBusTab;
         public CrashEntryNarrativeTab crashEntryNarrativeTab;
         public CrashEntryMapTab crashEntryMapTab;
         public CrashEntryApprovalTab crashEntryApprovalTab;
         public ConclusionTab conclusionTab;
         public AccidentTab accidentTab;
         public CrashEntryUnitTab crashEntryUnitTab;
         public CrashEntryTrailerTab crashEntryTrailerTab;
         public PropertyOwnerTab propertyOwnerTab;
         public CrashEntryCommentsTab crashEntryCommentsTab;
         
         
         public WebDriver driver;
	        public CrashEntry()
	        {
	        	
	        	
	        	if(this.crashEntryMainTab == null)
	        		this.crashEntryMainTab= new CrashEntryMainTab();
	    		
	    		if(this.witnessTab == null)
	    			this.witnessTab= new WitnessTab();
	    
	    		
	    		if(this.occupantsTab == null)
	    			this.occupantsTab= new OccupantsTab();
	    		
	    		if(this.truckBusTab == null)
	    			this.truckBusTab = new TruckBusTab();
	    		
	    		if(this.crashEntryNarrativeTab == null)
	    			this.crashEntryNarrativeTab = new CrashEntryNarrativeTab();
	    		
	   
	    		if(this.crashEntryMapTab == null)
	    			this.crashEntryMapTab = new CrashEntryMapTab();
	        	
	    		if(this.crashEntryApprovalTab == null)
	    			this.crashEntryApprovalTab = new CrashEntryApprovalTab();
	    		
	    	
	    		if(this.conclusionTab == null)
	    			this.conclusionTab = new ConclusionTab();
	    		
	    		
	    		if(this.accidentTab == null)
	    			this.accidentTab = new AccidentTab();
	    		
	    		if(this.crashEntryUnitTab == null)
	    			this.crashEntryUnitTab = new CrashEntryUnitTab();
	    		
	    		if(this.crashEntryTrailerTab == null)
	    			this.crashEntryTrailerTab = new CrashEntryTrailerTab();
	    		
	    		if(this.propertyOwnerTab == null)
	    			this.propertyOwnerTab = new PropertyOwnerTab();
	    		
	    		if(this.crashEntryCommentsTab == null)
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

        @FindBy(how = How.ID, using = "adrAtLoc_txtFrom")
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

        @FindBy(how = How.ID, using = "lupOffPFID_imgBtn")
        public WebElement uIOfficerLookupButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
        public WebElement uICrashEntryMainTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Witness')]")
        public WebElement uIWitnessTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Occupant')]")
        public WebElement uIOccupantTab;

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

        @FindBy(how = How.ID, using = "nbrTraCS_Year")
        public WebElement uITracsYearEdit;

        @FindBy(how = How.ID, using = "nbrTraCS_Number")
        public WebElement uITracsNumberEdit;

        @FindBy(how = How.ID, using = "adrAtLoc_txtFrom")
        public WebElement uIReportedLocationEdit;

        @FindBy(how = How.ID, using = "btnNotify")
        public WebElement uINotificationIconButton;

        @FindBy(how = How.ID, using = "ALC")
        public WebElement uIALCIconButton;

        @FindBy(how = How.ID, using = "txtDOTNo")
        public WebElement uIDOTNoEdit;

        @FindBy(how = How.ID, using = "txtAmended")
        public WebElement uIAmendedNoEdit;

        @FindBy(how = How.ID, using = "txtAcdNo")
        public WebElement uIAccidentNoEdit;

         @FindBy(how = How.ID, using = "dtmAcd_Date_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dtmAcd_Time']//input")
        public WebElement uITimeEdit;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'TruckBus')]")
        public WebElement uITruckBusTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Accident')]")
        public WebElement uIAccidentTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Unit')]")
        public WebElement uIUnitTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Vehicle')]")
        public WebElement uIVehicleTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Trailer')]")
        public WebElement uITrailerTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Conclusion')]")
        public WebElement uIConclusionTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Property Owner')]")
        public WebElement uIPropertyOwnerTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
        public WebElement uICommentsTab;

        @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.XPATH, using = "//span[@mkr = 'ti1']")
        public WebElement uIWIStateAccidentTab;

        @FindBy(how = How.ID, using = "adrAtLoc_cmdIncOnAddr")
        public WebElement uIAddressInfoIcon;
        
        @FindBy(how = How.ID, using = "nbrCallNo_Year")
        public WebElement uICallYearEdit;

@FindBy(how = How.ID, using = "nbrCallNo_Number")
        public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "nbrCallNo_imgBtn")
		public WebElement uICallNoInfoIcon;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIApprovalStatusTextView;

		@FindBy(how = How.ID, using = "custHeaderCSZ_State_DropDown")
		public WebElement uICountyEdit;
		@FindBy(how = How.ID, using = "lstJuris") // Added by Abi
		public WebElement uIJurisComboBox;
    }
    
    
    public class CrashEntryMainTab
    {
        public WebDriver driver;
        public CrashEntryMainTab()
        {

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

        @FindBy(how = How.ID, using = "tabCE_tmpl0_usrNJCrashSummary1_dtCrashDate_KPIDttctrl")
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
        public WebElement uIRoadSystecomboBox;

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

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrKSCrashMain1_dttmDOA_KPIDttctrl")
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

    
    
    public class WitnessTab
    {

        public WebDriver driver;
        public WitnessTab()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "lupOfficer_CodeValue")
        public WebElement uIOfficerEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrWitness1_nNameID_NameType")
        public WebElement uINameTypeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrWitness1_nNameID_NameTypeID")
        public WebElement uINameTypeIDEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrWitness1_nNameID_LastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrWitness1_nNameID_FirstName")
        public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrWitness1_cmdAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl5_UsrWitness1_grdWitness")
        public WebElement uIWitnessTabTable;

        @FindBy(how = How.XPATH, using = "//td[@class = 'status']/table/tbody/tr/td/b")
        public WebElement uIWitnessTabStatusBar;
    }

    
    
    public class OccupantsTab
    {
        public WebDriver driver;
        public OccupantsTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "cddUnitNo_DropDown")
        public WebElement uIUnitNoComboBox;

        @FindBy(how = How.ID, using = "nmOcupName_LastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "nmOcupName_FirstName")
        public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "chkAddrSame")
        public WebElement uIAddressSameOperatorCheckBox;

        @FindBy(how = How.ID, using = "chkAddrOwn")
        public WebElement uIAddressSameOwnerCheckBox;

        @FindBy(how = How.ID, using = "cddInjSvr_DropDown")
        public WebElement uIInjurySeverityComboBox;

        @FindBy(how = How.ID, using = "cddEjected_DropDown")
        public WebElement uIEjectedComboBox;

        @FindBy(how = How.ID, using = "cddAirBag_DropDown")
        public WebElement uIAirBagComboBox;

        @FindBy(how = How.ID, using = "chkMedical")
        public WebElement uIMedicalTransportCheckBox;

        @FindBy(how = How.ID, using = "lupSafeEquip_imgBtn")
        public WebElement uISafetyEquipmentLookupButton;

        @FindBy(how = How.ID, using = "lupSeatPos_imgBtn")
        public WebElement uISeatingPositionLookupButton;

        @FindBy(how = How.ID, using = "txtAgencySpace")
        public WebElement uIAgencySpaceEdit;

        @FindBy(how = How.ID, using = "cmdAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "cmdClear")
        public WebElement uIClearButton;

        @FindBy(how = How.ID, using = "cmdInternalSave")
        public WebElement uIInternalSaveButton;

        @FindBy(how = How.ID, using = "cmdInternalRefresh")
        public WebElement uIInternalResetButton;

        @FindBy(how = How.ID, using = "grdOccupants")
        public WebElement uIOccupantsTabResultGrid;

        @FindBy(how = How.ID, using = "txtTotOcp")
        public WebElement uITotalOccupantsEdit;

        @FindBy(how = How.ID, using = "nmOcupName_NameType")
        public WebElement uINameTypeEdit;

        @FindBy(how = How.ID, using = "nmOcupName_NameTypeID")
        public WebElement uINameIDEdit;
    }

    public class TruckBusTab
    {
        public WebDriver driver;
        public TruckBusTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "txtUnitNo")
        public WebElement uIUnitNoEdit;

        @FindBy(how = How.ID, using = "cddSource_DropDown")
        public WebElement uISourceComboBox;

        @FindBy(how = How.ID, using = "cmdAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "cmdClear")
        public WebElement uIClearButton;

        @FindBy(how = How.ID, using = "cmdInternalSave")
        public WebElement uIInternalSaveButton;

        @FindBy(how = How.ID, using = "cmdInternalRefresh")
        public WebElement uIInternalResetButton;

        @FindBy(how = How.ID, using = "grdTruckBus")
        public WebElement uITruckBusTabResultGrid;

        @FindBy(how = How.ID, using = "lupHazMatClass_CodeValue")
        public WebElement uIHazMatClassCodeEdit;

        @FindBy(how = How.ID, using = "lupHazMatClass_CodeDescription")
        public WebElement uIHazMatClassDescriptionEdit;

        @FindBy(how = How.ID, using = "txtHazMatNo")
        public WebElement uIHazMatUNNoEdit;

        @FindBy(how = How.ID, using = "chkPlyDisp")
        public WebElement uIHazMatPlacardDisplayedCheckBox;

        @FindBy(how = How.ID, using = "chkCargoRel")
        public WebElement uIHazardousCargoReleasedCheckBox;

        @FindBy(how = How.ID, using = "txtUSDot")
        public WebElement uIUSDOTEdit;

        @FindBy(how = How.ID, using = "txtICCMC")
        public WebElement uIICCMcNoEdit;

        @FindBy(how = How.ID, using = "txtCarrierName")
        public WebElement uICarrierNameEdit;

        @FindBy(how = How.ID, using = "adrLocation_txtFrom")
        public WebElement uICarrierAddressEdit;

        @FindBy(how = How.ID, using = "adrLocation_chkVerify")
        public WebElement uICarrierAddressVerifyCheckBox;

        @FindBy(how = How.ID, using = "txtLCNo")
        public WebElement uILCNoEdit;

        @FindBy(how = How.ID, using = "txtICNo")
        public WebElement uIICNoEdit;

        @FindBy(how = How.ID, using = "txtGVWR")
        public WebElement uIGVWREdit;

        @FindBy(how = How.ID, using = "chkIntCarrier")
        public WebElement uIInterstateCarrierCheckBox;

        @FindBy(how = How.ID, using = "cddVehConfig_DropDown")
        public WebElement uIVehicleConfigurationComboBox;

        @FindBy(how = How.ID, using = "cddBodyType_DropDown")
        public WebElement uICargoBodyTypeComboBox;

    }
    
    

    public class CrashEntryNarrativeTab
    {
        public WebDriver driver;
        public CrashEntryNarrativeTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

         @FindBy(how = How.XPATH, using = "//body")
        public WebElement uICommentsRichTextEdit;

        @FindBy(how = How.ID, using = "cmdInternalSave")
        public WebElement uIInternalSaveButton;

        @FindBy(how = How.ID, using = "cmdInternalRefresh")
        public WebElement uIInternalResetButton;

    }

    public class CrashEntryMapTab
    {
        public WebDriver driver;
        public CrashEntryMapTab()
        {
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

    public class CrashComments
    {
        public WebDriver driver;
        public CrashComments()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

 //        @FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
//        public WebElement uICommentsRichTextEdit;
        
        @FindBy(how = How.XPATH, using = "//body")
        public WebElement uICommentsRichTextEdit;
		
        @FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/table/tbody/tr/td/b")
        public WebElement uIBottomLeftSideStatusBar;
    }

    public class CrashEntryApprovalTab
    {
        public WebDriver driver;

        public CrashEntryApprovalTab()
        {
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

    public class ConclusionTab
    {
        public WebDriver driver;

        public ConclusionTab()
        {
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


    public class AccidentTab
    {
        public WebDriver driver;
        public AccidentTab()
        {

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

    public class CrashEntryUnitTab
    {
        public WebDriver driver;
        public CrashEntryUnitTab()
        {

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

    public class CrashEntryTrailerTab
    {
        public WebDriver driver;
        public CrashEntryTrailerTab()
        {

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

    public class PropertyOwnerTab
    {
        public WebDriver driver;
        public PropertyOwnerTab()
        {

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

        @FindBy(how = How.ID, using = "tabCE_tmpl7_UsrProperty1_cddOrgType_DropDown")
        public WebElement uIOrgTypeComboBox;
        
    }

    public class CrashEntryCommentsTab
    {

        public WebDriver driver;
        public CrashEntryCommentsTab()
        {
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

  
    public class CrashSearch
    {
        public WebDriver driver;
        public CrashSearch()
        {
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
        public WebElement uICaseYearEdit;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_nbrCaseNo_Number")
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
        public WebElement uIOfficerCodeEdit;

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

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_TxtStreetName1")
        public WebElement uIIntersectionStreet1Edit;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_TxtStreetName2")
        public WebElement uIIntersectionStreet2Edit;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_chkNonRpt")
        public WebElement uINonReportableCheckBox;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrNJCrashSrchBasic1_chkRpt")
        public WebElement uIReportableCheckBox;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_nbrTraCS_Year")
        public WebElement uITracsYearEdit;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_nbrTraCS_Number")
        public WebElement uITracsNumberEdit;

        @FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
        public WebElement uIPrintIconButton;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_txtDotNo")
        public WebElement uIDOTNoEdit;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_txtAcdNo")
        public WebElement uIAccidentNoEdit;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_cddCrashType")
        public WebElement uICrashTypeComboBox;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_CddLocationType")
        public WebElement uIAddressComboBox;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_adrAddrsCtrl_txtFrom")
        public WebElement uIAddressEdit;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_adrAtLoc_adrAddrsCtrl_chkVerify")
        public WebElement uIAddressVerifyCheckBox;

        @FindBy(how = How.ID, using = "tabCrash_tmpl0_UsrCrashSrchBasic1_lstApprovalStatusMN")
        public WebElement uIApprovalStatusComboBox;

    }

    public class CrashSearchHelpWindow
    {
        public WebDriver driver;
         public CrashSearchHelpWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

         @FindBy(how = How.ID, using = "grdCrash")
         public WebElement uICrashSearchResultGrid;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
         public WebElement uIRefreshButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
         public WebElement uIAddNewButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
         public WebElement uIBackButton;
    }



    public class ParkingEntry
    {
    	
    	
    	 public Defendant1 defendant1;
         public Defendant2 defendant2;
         public ParkingEntryMainTab parkingEntryMainTab;
         public FineNoticesTab fineNoticesTab;
         public PaymentsTab paymentsTab;
         public CommentsTab commentsTab;
         public ParkingEntryHistoryTab parkingEntryHistoryTab;
    	
         public WebDriver driver;
	        public ParkingEntry()
	        {
	        	
	        	
	        	if(this.defendant1 == null)
	        		this.defendant1 = new Defendant1();
	    		
	    		if(this.defendant2 == null)
	    			this.defendant2 = new Defendant2();
	    		
	    		if(this.parkingEntryMainTab == null)
	    			this.parkingEntryMainTab = new ParkingEntryMainTab();
	    		if(this.fineNoticesTab == null)
	    			this.fineNoticesTab = new FineNoticesTab();
	    		
	    		if(this.paymentsTab == null)
	    			this.paymentsTab = new PaymentsTab();
	    		
	    		if(this.commentsTab == null)
	    			this.commentsTab = new CommentsTab();
	    		
	    		if(this.parkingEntryHistoryTab == null)
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
        
        @FindBy(how = How.ID, using = "numCallNo_Year")
        public WebElement uICallYearEdit;
        
        @FindBy(how = How.ID, using = "numCallNo_Number")
        public WebElement uICallNumberEdit;
        
        @FindBy(how = How.ID, using = "numCallNo_imgBtn")
        public WebElement uICallNoInfoIcon;
        
        
        

    }
    
    public class Defendant1
    {
        public WebDriver driver;
        public Defendant1()
        {
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

    public class Defendant2
    {
        public WebDriver driver;
        public Defendant2()
        {

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

    public class ParkingEntryMainTab
    {
        public WebDriver driver;
        public ParkingEntryMainTab()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrParkMain1_dtcourtdate_Date_KPIDttctrl")
        public WebElement uICourtDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'tabCE_tmpl0_UsrParkMain1_dtcourtdate_Time']//input")
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

    public class FineNoticesTab
    {

        public WebDriver driver;
        public FineNoticesTab()
        {

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

    public class PaymentsTab
    {
        public WebDriver driver;
        public WebElement uIParkingPaymentFrame;
        public PaymentsTab()
        {

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

    public class CommentsTab
    {

        public WebDriver driver;

        public CommentsTab()
        {
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

    public class ParkingEntryHistoryTab
    {

        public WebDriver driver;

        public ParkingEntryHistoryTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);

        }

        @FindBy(how = How.XPATH, using = "//table[@id='listMsg']")
        public WebElement uIHistoryTable;

    }
    
    public class ParkingSearch
    {
        public WebDriver driver;
        public ParkingSearch()
        {

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

        @FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_dttArrestDttmFrom_KPIDttctrl")
        public WebElement uIDataTypeFromDateEdit;

        @FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_dttArrestDttmTo_KPIDttctrl")
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
        
        
        @FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_txtNID")
        public WebElement uINameIDTypeEdit;
        
        @FindBy(how = How.ID, using = "tabParkingSrch_tmpl0_UsrParkingSrchBasic1_txtNameTypeID")
        public WebElement uINameIDEdit;

    }

    public class ParkingOtherPayment
    {
        public WebDriver driver;
        public ParkingOtherPayment()
        {

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

   

    public class TicketHoldReason
    {

        public WebDriver driver;

        public TicketHoldReason()
        {
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


    public class UnitDetails
    {
    	public UnitDetailsDriverTab unitDetailsDriverTab;
        public UnitDetailsVehicleTab unitDetailsVehicleTab;
        public InsuranceSchoolTab insuranceSchoolTab;
    	
    	
    	
        public WebDriver driver;

        public UnitDetails()
        {
        	if(this.unitDetailsDriverTab == null)
        		this.unitDetailsDriverTab = new UnitDetailsDriverTab();
        	
        	if(this.unitDetailsVehicleTab == null)
        		this.unitDetailsVehicleTab = new UnitDetailsVehicleTab();
        	
        	if(this.insuranceSchoolTab == null)
        		this.insuranceSchoolTab = new InsuranceSchoolTab();
        	
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "lblUnitNo")
        public WebElement uIUnitNoTextView;

        @FindBy(how = How.ID, using = "nbrTraCs_Year")
        public WebElement uITracsRefYearEdit;

        @FindBy(how = How.ID, using = "nbrTraCs_Number")
        public WebElement uITracsRefNoEdit;

        @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "txtDotNo")
        public WebElement uIDOTNoEdit;

        @FindBy(how = How.ID, using = "dtmAcd_Date_KPIDttctrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dtmAcd_Time']//input")
        public WebElement uITimeEdit;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveNCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Driver')]")
        public WebElement uIDriverTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Vehicle')]")
        public WebElement uIVehicleTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Insurance/School')]")
        public WebElement uIInsuranceSchoolTab;

	}
    
    public class UnitDetailsDriverTab
    {
        public WebDriver driver;

        public UnitDetailsDriverTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_txtTotOcp")
        public WebElement uITotalOccupantsEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_nNameID_NameType")
        public WebElement uINameTypeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_nNameID_NameTypeID")
        public WebElement uINameIDEdit;

        @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cddDirTravel_DropDown")
        public WebElement uIDirTravelComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cddSpeedLmt_DropDown")
        public WebElement uISpeedLimitComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cddDrvAct_DropDown")
        public WebElement uIDriverActionComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cddOnDuty_DropDown")
        public WebElement uIOnDutyAccidentComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cmdDrvFact")
        public WebElement uIDriverFactorButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cmdHwy")
        public WebElement uIHWYFactorButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cddAirBag_DropDown")
        public WebElement uIAirBagComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cddAlTest_DropDown")
        public WebElement uIAlcoholTestComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl0_UsrDrivers1_cddTrfCnt_DropDown")
        public WebElement uITrafficControlComboBox;
    }
    
    
    public class UnitDetailsVehicleTab
    {
        public WebDriver driver;

        public UnitDetailsVehicleTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_plcVehicle_PlateNumber")
        public WebElement uIVehicleEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_plcVehicle_KPIState")
        public WebElement uIStateComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_cddVehDamage_DropDown")
        public WebElement uIVehicleDamageComboBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_chkIsTowed")
        public WebElement uITowedDueDamageCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_chkOwnOpr")
        public WebElement uIVehicleOwnerSameOperatorCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_nmVehOwner_NameType")
        public WebElement uINameTypeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_nmVehOwner_NameTypeID")
        public WebElement uINameIDEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl1_UsrVehicle1_cmdVehFact")
        public WebElement uIVehicleFactorButton;

    }
    public class InsuranceSchoolTab
    {
        public WebDriver driver;

        public InsuranceSchoolTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrInsSchool1_lupInsCompany_CodeValue")
        public WebElement uIInsuranceCompanyCodeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrInsSchool1_lupInsCompany_imgBtn")
        public WebElement uIInsuranceCompanyLookupButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrInsSchool1_chkOwner")
        public WebElement uIPolicyHolderSameOwnerCheckBox;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrInsSchool1_rbtFrom")
        public WebElement uIBusTravellingFromRadioButton;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrInsSchool1_txtSchool")
        public WebElement uISchoolNameEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrInsSchool1_nNameID_NameType")
        public WebElement uIPolicyHolderNameTypeEdit;

        @FindBy(how = How.ID, using = "tabCE_tmpl2_UsrInsSchool1_nNameID_NameTypeID")
        public WebElement uIPolicyHolderNameIDEdit;
       
       
      
    }

  

    public class CrashEntryMoreScreen
    {
        public WebDriver driver;

        public CrashEntryMoreScreen()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveNCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "cddCodeCmn_DropDown")
        public WebElement uICodeCommentFactorsComboBox;

        @FindBy(how = How.ID, using = "cmdAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "grdCodeObj")
        public WebElement uICrashMoreResultGrid;
    }

    public class StruckObjects
    {
        public WebDriver driver;

        public StruckObjects()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveNCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "cddUnitNo_DropDown")
        public WebElement uIUnitNoComboBox;

        @FindBy(how = How.ID, using = "cmdAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "grdStkObj")
        public WebElement uIStruckObjectsResultGrid;

        @FindBy(how = How.ID, using = "lupStruckObj_imgBtn")
        public WebElement uIStruckObjectsLookup;

        @FindBy(how = How.ID, using = "lupStruckObj_CodeDescription")
        public WebElement uIStruckObjectsDescription;

    }


    public class DeerCrash
    {
    	
    	public DeerCrashAccidentTab deerCrashAccidentTab;
        public DriverTab driverTab;
        public DeerCrashNarrativeTab deerCrashNarrativeTab;
    	
    	
    	
        public WebDriver driver;
        public DeerCrash()
        {
        	
        	if(deerCrashAccidentTab == null)
        		deerCrashAccidentTab = new DeerCrashAccidentTab();
    		
    		if(driverTab == null)
    			driverTab = new DriverTab();
    		
    		if(deerCrashNarrativeTab == null)
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
    
    public class DeerCrashAccidentTab
    {
        public WebDriver driver;
        public DeerCrashAccidentTab()
        {

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

    public class DriverTab
    {
        public WebDriver driver;
        public DriverTab()
        {

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

    public class DeerCrashNarrativeTab
    {
        public WebDriver driver;
        public DeerCrashNarrativeTab()
        {
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

    public class PaymentMethodScreen
    {
    	 public WebDriver driver;
         public PaymentMethodScreen()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
    	
         @FindBy(how = How.ID, using = "cddTxnType_DropDown")
	     public WebElement uITypeComboBox;
         
         @FindBy(how = How.ID, using = "txtAccountNo")
	     public WebElement uICreditCardNoCodeEdit;
         
         @FindBy(how = How.ID, using = "txtHolderName")
	     public WebElement uIHolderNameCodeEdit;
         
         @FindBy(how = How.ID, using = "txtExpMonth_DropDown")
	     public WebElement uIExpirationMonthComboBox;
         
         @FindBy(how = How.ID, using = "txtExpYear")
	     public WebElement uIExpirationYearComboBox;
         
         @FindBy(how = How.ID, using = "txtBankName")
	     public WebElement uIBankCodeEdit;
         
         @FindBy(how = How.ID, using = "cmdSave")
	        public WebElement uISaveButton;

	        @FindBy(how = How.ID, using = "cmdSaveNClose")
	        public WebElement uISaveAndCloseButton;
         
    }
    

}
