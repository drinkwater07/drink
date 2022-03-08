package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapAnimalControl {

	public AnimalNameEntry animalNameEntry;
	public AnimalCaseSearch animalCaseSearch;
	public AnimalCaseEntry animalCaseEntry;
	public AnimalRegistrationSearch animalRegistrationSearch;
	public AnimalRegistrationEntry animalRegistrationEntry;
	public AnimalLostOrFoundEntry animalLostOrFoundEntry;
	public AnimalLostOrFoundSearch animalLostOrFoundSearch;
	public AnimalNameSearch animalNameSearch;
	public AnimalCageRental animalCageRental;
	
	public AnimalNameMerge animalNameMerge;
	public AnimalNameMergeHelpWindow animalNameMergeHelpWindow;
	public AnimalNameEntryMedicalProcedure animalNameEntryMedicalProcedure;

	public UIMapAnimalControl() {

		if (animalNameEntry == null)
			animalNameEntry = new AnimalNameEntry();
		
		if (this.animalNameEntryMedicalProcedure == null)
			this.animalNameEntryMedicalProcedure = new AnimalNameEntryMedicalProcedure();

		if (this.animalCaseSearch == null)
			this.animalCaseSearch = new AnimalCaseSearch();

		if (this.animalCaseEntry == null)
			this.animalCaseEntry = new AnimalCaseEntry();

		if (this.animalRegistrationSearch == null)
			this.animalRegistrationSearch = new AnimalRegistrationSearch();

		if (this.animalRegistrationEntry == null)
			this.animalRegistrationEntry = new AnimalRegistrationEntry();

		if (this.animalNameSearch == null)
			this.animalNameSearch = new AnimalNameSearch();

		if (this.animalLostOrFoundEntry == null)
			this.animalLostOrFoundEntry = new AnimalLostOrFoundEntry();

		if (this.animalLostOrFoundSearch == null)
			this.animalLostOrFoundSearch = new AnimalLostOrFoundSearch();

		if (this.animalCageRental == null)
			this.animalCageRental = new AnimalCageRental();
    
    if (this.animalNameMerge == null)
			this.animalNameMerge = new AnimalNameMerge();

		if (animalNameMergeHelpWindow == null)
			animalNameMergeHelpWindow = new AnimalNameMergeHelpWindow();
	}

	public class AnimalNameSearch {
		public WebDriver driver;

		public AnimalNameSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_cddNameType")
		public WebElement uIAnimalNameType;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_txtNameID")
		public WebElement uIAnimalNameIDEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_txtLastName")
		public WebElement uIAnimalLastNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_txtFirstName")
		public WebElement uIAnimalFirstNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_txtMiddleName")
		public WebElement uIAnimalMiddleEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_cddSex_DropDown")
		public WebElement uISexDropDown;
		
		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_cddSpecies_DropDown")
		public WebElement uISpeciesDropdown;
		
		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_cddProcedure_DropDown")
		public WebElement uITypeofProcedureDropDown;
		

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_cddBreed1")
		public WebElement uIBreed1DropDown;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_cddBreed2")
		public WebElement uIBreed2DreopDown;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[(text()='Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdNames")
		public WebElement uIAnimalNameSearchResultGrid;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_txtCustome1")
		public WebElement uIAIDCodeEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_txtCustome2")
		public WebElement uIPIDCodeEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrAnimalSrchAdv1_txtCustome3")
		public WebElement uISBCodeEdit;

	}

	public class AnimalNameEntry {

		public WebDriver driver;
		public AnimalNameEntryMainTab animalNameEntryMainTab;
		public AnimalNameEntryOwnerDetailsTab animalNameEntryOwnerDetailsTab;
		public AnimalNameEntryActivityTab animalNameEntryActivityTab;
		public AnimalNameEntryCommentsTab animalNameEntryCommentsTab;
		public AnimalNameEntryMedicalTab animalNameEntryMedicalTab;
		public AnimalNameEntryAddressesTab animalNameEntryAddressesTab;

		public AnimalNameEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.animalNameEntryMainTab == null)) {
				this.animalNameEntryMainTab = new AnimalNameEntryMainTab();
			}

			if ((this.animalNameEntryOwnerDetailsTab == null)) {
				this.animalNameEntryOwnerDetailsTab = new AnimalNameEntryOwnerDetailsTab();
			}

			if ((this.animalNameEntryActivityTab == null)) {
				this.animalNameEntryActivityTab = new AnimalNameEntryActivityTab();
			}

			if ((this.animalNameEntryCommentsTab == null)) {
				this.animalNameEntryCommentsTab = new AnimalNameEntryCommentsTab();
			}

			if ((this.animalNameEntryMedicalTab == null)) {
				this.animalNameEntryMedicalTab = new AnimalNameEntryMedicalTab();
			}

			if ((this.animalNameEntryAddressesTab == null)) {
				this.animalNameEntryAddressesTab = new AnimalNameEntryAddressesTab();
			}

		}

		@FindBy(how = How.ID, using = "txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "custNames_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "custNames_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "custNames_MiddleName")
		public WebElement uIMiddleNameEdit;

		@FindBy(how = How.ID, using = "custHeaderCSZ_City")
		public WebElement uICSZCountryCityEdit;

		@FindBy(how = How.ID, using = "custHeaderCSZ_State_DropDown")
		public WebElement uICSZCountryStateDropDown;

		@FindBy(how = How.ID, using = "custHeaderCSZ_Zip")
		public WebElement uICSZCountryZipEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Medical')]")
		public WebElement uIMedicalTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Owner Details')]")
		public WebElement uIOwnersDetailsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Addresses')]")
		public WebElement uIAddressesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Activity')]")
		public WebElement uIActivityTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "adrMainAddress_cmdIncOnAddr")
		public WebElement uIAddressInfoIcon;
		
		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
 		public WebElement uILeftSideStatusBar;
		@FindBy(how = How.ID, using = "imgNameFrontView")
		public WebElement uIImageArea;
		
		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;
		

		public class AnimalNameEntryMainTab {
			public WebDriver driver;

			public AnimalNameEntryMainTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddSpecies_DropDown")
			public WebElement uISpeciesDropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtCustome1")
			public WebElement uIAnimalIDCodeEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtMicroChipID")
			public WebElement uIMicroChipIDEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtPedigreeName")
			public WebElement uIPedigreeNameEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtHeight")
			public WebElement uIHeightEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddColor1")
			public WebElement uIColor1DropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtLicenseTag")
			public WebElement uILicenseOrTagNoEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtRabiesTag")
			public WebElement uIRabiesTagNoEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddBreed1")
			public WebElement uIBreed1DropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddSex_DropDown")
			public WebElement uISexDropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtWeight")
			public WebElement uIWeightEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddColor2")
			public WebElement uIColor2DropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_dtcExpiration_KPIDttmCtrl")
			public WebElement uIExpirationEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_dtcRSE_KPIDttmCtrl")
			public WebElement uIRabiesShotExpirationEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtCustome3")
			public WebElement uISBCaseEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddBreed2")
			public WebElement uIBreed2DropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_dtcDOB_KPIDttmCtrl")
			public WebElement uIDOBEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtLength")
			public WebElement uILengthEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddMarkings")
			public WebElement uIMarkingsDropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddIssuing_DropDown")
			public WebElement uIIssuingAgencyDropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_cddMfg_DropDown")
			public WebElement uIMfgDropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_nVeterinarian_NameType")
			public WebElement uIVeterinarianNameTypeEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_nVeterinarian_NameTypeID")
			public WebElement uIVeterinarianNameIDEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_nVeterinarian_LastName")
			public WebElement uIVeterinarianLastNameEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_nVeterinarian_FirstName")
			public WebElement uIVeterinarianFirstNameEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_nVeterinarian_MiddleName")
			public WebElement uIVeterinarianMiddleNameEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_lblCustome1")
			public WebElement uIAIDCustomField;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_lblCustome2")
			public WebElement uIPIDCustomField;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_lblCustome3")
			public WebElement uISBCaseDCustomField;

			@FindBy(how = How.ID, using = "tabNames_tmpl0_ctrlAnimalMain_txtCustome2")
			public WebElement uIPIDCodeEdit;
		}

		public class AnimalNameEntryOwnerDetailsTab {

			public WebDriver driver;

			public AnimalNameEntryOwnerDetailsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_nmcOwnerName_NameType")
			public WebElement uIOwnersNameTypeEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_nmcOwnerName_NameTypeID")
			public WebElement uIOwnersNameIDEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_nmcOwnerName_LastName")
			public WebElement uIOwnersLastNameEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_nmcOwnerName_FirstName")
			public WebElement uIOwnersFirstNameEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_nmcOwnerName_MiddleName")
			public WebElement uIOwnersMiddleNameEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_txtAddress")
			public WebElement uIAddressEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_cmdAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_cmdClear")
			public WebElement uIClearButton;

			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_grdOwner")
			public WebElement uIOwnersDetailsTable;
			
			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_numACE_Year")
			public WebElement uIAceYear;
			
			@FindBy(how = How.ID, using = "tabNames_tmpl1_ctrlOwnerDtl_numACE_Number")
			public WebElement uIAceNo;
			
			@FindBy(how = How.CLASS_NAME, using = "statusBar")
			public WebElement uIBottomStatusLable;

		}

		public class AnimalNameEntryActivityTab {

			public WebDriver driver;

			public AnimalNameEntryActivityTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabNames_tmpl4_usrActivity1_grdAnimalActivity")
			public WebElement uIActivityTable;

		}

		public class AnimalNameEntryAddressesTab {

			public WebDriver driver;

			public AnimalNameEntryAddressesTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAddress1_adrAdditionalAddr_txtFrom")
			public WebElement uIAddressEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAddress1_cddType_DropDown")
			public WebElement uIAddressTypeDropDown;

			@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAddress1_cmdAddAddress")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAddress1_grdAddress")
			public WebElement uIAddressResultTable;

			@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAddress1_adrAdditionalAddr_cmdIncOnAddr")
			public WebElement uIAddressInfoBblIcon;

			
		}

		public class AnimalNameEntryCommentsTab {

			public WebDriver driver;

			public AnimalNameEntryCommentsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "txtSubject")
			public WebElement uISubjectCodeEdit;

			@FindBy(how = How.ID, using = "btnComments")
			public WebElement uIEnterCommentsButton;

			@FindBy(how = How.ID, using = "grdComments")
			public WebElement uICommentsResulTable;

		}

		public class AnimalNameEntryMedicalTab {
			public WebDriver driver;

			public AnimalNameEntryMedicalTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabNames_tmpl2_ususrMedical_dtcProcidure_KPIDttmCtrl")
			public WebElement uIDateOfProcedureEdit;

			@FindBy(how = How.ID, using = "tabNames_tmpl2_ususrMedical_cddType_DropDown")
			public WebElement uITypeOfProcedure;

			@FindBy(how = How.ID, using = "tabNames_tmpl2_ususrMedical_cddReason_DropDown")
			public WebElement uIReasonOfProcedure;

			@FindBy(how = How.ID, using = "tabNames_tmpl2_ususrMedical_grdMedicalAnimal")
			public WebElement uIMedicalResultTable;

			@FindBy(how = How.ID, using = "tabNames_tmpl2_ususrMedical_cmdAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabNames_tmpl2_ususrMedical_cmdClear")
			public WebElement uIClearButton;

		}

	}

	public class AnimalCaseSearch {
		public WebDriver driver;
		public AnimalCaseSearchBasicTab animalCaseSearchBasicTab;
		public AnimalCaseSearchAdvancedTab animalCaseSearchAdvancedTab;

		public AnimalCaseSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.animalCaseSearchBasicTab == null)) {
				this.animalCaseSearchBasicTab = new AnimalCaseSearchBasicTab();
			}

			if ((this.animalCaseSearchAdvancedTab == null)) {
				this.animalCaseSearchAdvancedTab = new AnimalCaseSearchAdvancedTab();
			}

		}

		@FindBy(how = How.ID, using = "grdCaseEntry")
		public WebElement uIAnimalCaseSearchResulTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[(text()='Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//div[@mkr='container']")
		public WebElement uIAnimalCaseSearchResultGrid;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_radResolution_Input")
		public WebElement uIResolutionsInput;
		
		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_radResolution_DropDown")
		public WebElement uIResolutionsDropdown;
		
		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_chkIntake")
		public WebElement uIIntakeCheckbox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_chkDischarged")
		public WebElement uIDischargedCheckBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_chkBoth")
		public WebElement uIBothCheckBox;

		public class AnimalCaseSearchBasicTab {

			public AnimalCaseSearchBasicTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_lstJuris")
			public WebElement uIJurisDropdown;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_nbrcaseNo_Year")
			public WebElement uICaseYearEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_nbrcaseNo_Number")
			public WebElement uICaseNumberEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_nbrCallNo_Year")
			public WebElement uICallYearEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_nbrCallNo_Number")
			public WebElement uICallNumberEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_adrAtLoc_txtFrom")
			public WebElement uILocationEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_cddNameType")
			public WebElement uINameType;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtNameID")
			public WebElement uINameIDEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtLastName")
			public WebElement uILastNameEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtFirstName")
			public WebElement uIFirstNameEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtMiddleName")
			public WebElement uIMiddleEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_cddNameType0")
			public WebElement uIAnimalNameType;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtNameID0")
			public WebElement uIAnimalNameIDEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtLastName0")
			public WebElement uIAnimalLastNameEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtFirstName0")
			public WebElement uIAnimalFirstNameEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_txtMiddleName0")
			public WebElement uIAnimalMiddleEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_dtmFollowUpDttm_KPIDttmCtrl")
			public WebElement uIFollowUpDate;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_dtmFollowupTodDttm_KPIDttmCtrl")
			public WebElement uIFollowUpToDate;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_lupOff_CodeValue")
			public WebElement uIOfficerEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_chkIntake")
			public WebElement uIIntakeCheckBox;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_chkDischarged")
			public WebElement uIDischargedCheckBox;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_chkBoth")
			public WebElement uIBothCheckBox;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_dtmReportedDttm_Date_KPIDttmCtrl")
			public WebElement uIFromDate;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_dtmReportedDttm_Time")
			public WebElement uIFromTime;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_dtmReportedToDttm_Date_KPIDttmCtrl")
			public WebElement uIToDate;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_dtmReportedToDttm_Time")
			public WebElement uIToTime;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_nbrACENo_Year")
			public WebElement uIACEYearEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_nbrACENo_Number")
			public WebElement uIACENumberEdit;
			

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_lupCFS_CodeValue")
			public WebElement uICFSEdit;
			
			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_radCage_Input")
			public WebElement uICageNoinput;
			
			@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrAnimalSrchBasic1_radCage_DropDown")
			public WebElement uICageNoDropdown;

		}

		public class AnimalCaseSearchAdvancedTab {

			public WebDriver driver;

			public AnimalCaseSearchAdvancedTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_usrAnimalCaseSrchAdv1_cddSpecies_DropDown")
			public WebElement uISpeciesDropdown;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_usrAnimalCaseSrchAdv1_cddBreed1")
			public WebElement uIBreed1Dropdown;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_usrAnimalCaseSrchAdv1_cddBreed2")
			public WebElement uIBreed2Dropdown;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_usrAnimalCaseSrchAdv1_txtPedigree")
			public WebElement uIPedigreeNameEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_usrAnimalCaseSrchAdv1_txtLicNO")
			public WebElement uILicenseTagEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_usrAnimalCaseSrchAdv1_txtMICID")
			public WebElement uIMicroChipIDEdit;

			@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_usrAnimalCaseSrchAdv1_cddSex_DropDown")
			public WebElement uISexDropdown;

		}

	}

	public class AnimalCaseEntry {
		public WebDriver driver;
		public AnimalCaseEntryMainTab animalCaseEntryMainTab;
		public AnimalCaseEntryAnimalInfoTab animalCaseEntryAnimalInfoTab;
		public AnimalCaseEntryObservationsTab animalCaseEntryObservationsTab;
		public AnimalCaseEntryResolutionsTab animalCaseEntryResolutionsTab;
		public AnimalCaseEntryBiteReportTab animalCaseEntryBiteReportTab;
		public NarrativeTab narrativeTab;
		public ReportingTab reportingTab;
		public AnimalCaseEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (this.animalCaseEntryMainTab == null)
				this.animalCaseEntryMainTab = new AnimalCaseEntryMainTab();

			if (this.animalCaseEntryAnimalInfoTab == null)
				this.animalCaseEntryAnimalInfoTab = new AnimalCaseEntryAnimalInfoTab();

			if (this.animalCaseEntryObservationsTab == null)
				this.animalCaseEntryObservationsTab = new AnimalCaseEntryObservationsTab();

			if (this.animalCaseEntryResolutionsTab == null)
				this.animalCaseEntryResolutionsTab = new AnimalCaseEntryResolutionsTab();

			if (this.animalCaseEntryBiteReportTab == null)
				this.animalCaseEntryBiteReportTab = new AnimalCaseEntryBiteReportTab();
			
			if (this.narrativeTab == null)
				this.narrativeTab = new NarrativeTab();
			
			if (this.reportingTab == null)
				this.reportingTab = new ReportingTab();
		}

		@FindBy(how = How.ID, using = "lblCall")
		public WebElement uICallNoLable;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIJSaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uIJSaveNCloseButton;

		@FindBy(how = How.ID, using = "nbrACE_Year")
		public WebElement uIACEYearEdit;

		@FindBy(how = How.ID, using = "nbrACE_Number")
		public WebElement uIACENumberEdit;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "lupOfficer_imgBtn")
		public WebElement uIOfficerLookUp;

		@FindBy(how = How.XPATH, using = "//input[@id='nbrIncidentID_Year']")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrIncidentID_imgBtn")
		public WebElement uICaseNoLookup;

		@FindBy(how = How.XPATH, using = "//input[@id='nbrIncidentID_Number']")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='nbrCall_Year']")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "nbrCall_imgBtn")
		public WebElement uICallNoLookup;

		@FindBy(how = How.XPATH, using = "//input[@id='nbrCall_Number']")
		public WebElement uICallnumberEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='dttmReported_Date_KPIDttmCtrl']")
		public WebElement uIReportedDateEdit;

		@FindBy(how = How.XPATH, using = "//input[contains(@class,'textboxdatetime')]")
		public WebElement uIReportedTimeEdit;

		@FindBy(how = How.ID, using = "cddComplaintType_DropDown")
		public WebElement uIComplaintTypeDropdown;

		@FindBy(how = How.ID, using = "chkInvestAuth")
		public WebElement uIInvestigationAuthorizedCheckBox;

		@FindBy(how = How.XPATH, using = "//span[text()='Main']")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Animal Info']")
		public WebElement uIAnimalInfoTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Observations']")
		public WebElement uIObservationsTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Resolutions']")
		public WebElement uIResolutionsTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Bite Report']")
		public WebElement uIBiteReportTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Narrative']")
		public WebElement uINarrativeTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Reporting']")
		public WebElement uIReportingTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Attachments']")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[text()='QA Forms']")
		public WebElement uIQaFormsTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;
		
		@FindBy(how = How.ID, using = "adrLocation_cmdIncOnAddr")
		public WebElement uILocationInfoIcon;
		
		@FindBy(how = How.ID, using = "lupOfficer_cmdIncOnAddr")
		public WebElement uIOfficerInfoIcon;

		public class AnimalCaseEntryMainTab {

			public AnimalCaseEntryMainTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_cddMinicipality_DropDown")
			public WebElement uImunicipalityDropdown;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_lupCFSRpt_CodeValue")
			public WebElement uICFSReportedViolationEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_txtNarrative")
			public WebElement uIInitialNatureOfComplaintEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_nName_NameType")
			public WebElement uINameTypeEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_nName_NameTypeID")
			public WebElement uINameTypeIDEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_nName_LastName")
			public WebElement uILastNameEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_nName_FirstName")
			public WebElement uIFirstNameEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_cddActivity_DropDown")
			public WebElement uIActivityDropdown;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_cmdAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_txtHomePhone")
			public WebElement uIPhoneNumber1Edit;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_txtWorkPhone")
			public WebElement uIPhoneNumber2Edit;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_grdAnimal")
			public WebElement uIMainTabResultTable;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl0_ctrlACIMain_nName_imgSrch")
			public WebElement uINameInfoButton;
		}

		public class AnimalCaseEntryAnimalInfoTab {
			public AnimalCaseEntryAnimalInfoTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "nNameID_NameType")
			public WebElement uIAnimalNameTypeEdit;

			@FindBy(how = How.ID, using = "nNameID_NameTypeID")
			public WebElement uIAnimalNameTypeIDEdit;

			@FindBy(how = How.ID, using = "nNameID_LastName")
			public WebElement uIAnimalLastNameEdit;

			@FindBy(how = How.ID, using = "nNameID_FirstName")
			public WebElement uIAnimalFirstNameEdit;

			@FindBy(how = How.ID, using = "nVeterinarian_LastName")
			public WebElement uIVeterinarianLastNameEdit;

			@FindBy(how = How.ID, using = "nVeterinarian_FirstName")
			public WebElement uIVeterinarianFirstNameEdit;

			@FindBy(how = How.ID, using = "cmdAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "cmdClear")
			public WebElement uIClearButton;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uIAnimalInfoSaveButton;

			@FindBy(how = How.ID, using = "Reset")
			public WebElement uIAnimalInfoResetButton;

			@FindBy(how = How.ID, using = "grdAnimalInfo")
			public WebElement uIAnimalInfoGridTable;
			
			@FindBy(how = How.ID, using = "cddSex_DropDown")
			public WebElement uIAnimalInfosexDropdown;
			
			@FindBy(how = How.ID, using = "cddBreed1_DropDown")
			public WebElement uIAnimalInfoBreed1Dropdown;
			
			@FindBy(how = How.ID, using = "cddBreed2_DropDown")
			public WebElement uIAnimalInfoBreed2Dropdown;
			
			@FindBy(how = How.ID, using = "dtcDOB_KPIDttmCtrl")
			public WebElement uIAnimalInfoDOB;
			
			@FindBy(how = How.ID, using = "txtMicroChipID")
			public WebElement uIAnimalInfoMicroChipId;
			
				@FindBy(how = How.CLASS_NAME, using = "statusBar")
			public WebElement uIBottomStatusLable;
		}

		public class AnimalCaseEntryObservationsTab {

			public AnimalCaseEntryObservationsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_cddAnimalName")
			public WebElement uIAnimalNameDropdown;

			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_dttmReported_Date_KPIDttmCtrl")
			public WebElement uIDateEdit;

			@FindBy(how = How.XPATH, using = "//table[@id='tabANI_tmpl2_ctrlObserResolution_dttmReported_Time']//input")
			public WebElement uITimeEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_cmdAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_grdObservations")
			public WebElement uIObservationsGridTable;

			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_chkIntake")
			public WebElement uIIntakeCheckBox;

			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_cddCage_DropDown")
			public WebElement uICageDropdown;

			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_imgAnimalIcon")
			public WebElement uIAnimalNameInfoIcon;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_cddAnimalHeldAt_DropDown")
			public WebElement uIAnimalheldAt;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_cddCapture_DropDown")
			public WebElement uIMethodOfCapture;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_cddMethodofIntake_DropDown")
			public WebElement uIMethodOfIntake;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl2_ctrlObserResolution_lblCage")
			public WebElement uICageDropdownLable;

		}

		public class AnimalCaseEntryResolutionsTab {

			public AnimalCaseEntryResolutionsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_cddAnimalName")
			public WebElement uIAnimalNameDropdown;

			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_dttmReported_Date_KPIDttmCtrl")
			public WebElement uIDateEdit;

			@FindBy(how = How.XPATH, using = "//table[@id='tabANI_tmpl3_ctrlResolution_dttmReported_Time']")
			public WebElement uITimeEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_cmdAddCitation")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_grdResolutions")
			public WebElement uIResolutionsGridTable;

			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_txtWarningSummons_CitationNbr")
			public WebElement uIWarningSummonsEdit;

			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_chkDischarged")
			public WebElement uIDischargedCheckBox;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_imgAnimalIcon")
			public WebElement uIAnimalNameInfoIcon;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_chkCompliance")
			public WebElement uICopmlianceCheckBox;
		
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_chkFallowUp")
			public WebElement uIFollowUpCheckBox;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_dtcFollowUpDates1_KPIDttmCtrl")
			public WebElement uIFollowUpDate1;
		
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_dtcFollowUpDates2_KPIDttmCtrl")
			public WebElement uIFollowUpDate2;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_cddHealthStatusOut_Input")
			public WebElement uIHealthSatusOutInput;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_cddHealthStatusOut_DropDown")
			public WebElement uIHealthSatusOutDropdown;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_radResolutions_Input")
			public WebElement uIResolutionsInput;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_radResolutions_DropDown")
			public WebElement uIResolutionsDropdown;
			
			@FindBy(how = How.ID, using = "tabANI_tmpl3_ctrlResolution_dtcResolutionDate_KPIDttmCtrl")
			public WebElement uIResolutionDate;
			
			
		}
		

		public class AnimalCaseEntryBiteReportTab {

			public AnimalCaseEntryBiteReportTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);

			}

			@FindBy(how = How.ID, using = "nName_NameType")
			public WebElement uIVictimNameTypeEdit;

			@FindBy(how = How.ID, using = "nName_NameTypeID")
			public WebElement uIVictimNameTypeIDEdit;

			@FindBy(how = How.ID, using = "nName_LastName")
			public WebElement uIVictimLastNameEdit;

			@FindBy(how = How.ID, using = "nName_FirstName")
			public WebElement uIVictimFirstNameEdit;

			@FindBy(how = How.ID, using = "cddLocationofWounds1_DropDown")
			public WebElement uILocationOfWoundDropdown;

			@FindBy(how = How.ID, using = "cddAnimalName")
			public WebElement uIAnimalNameDropdown;

			@FindBy(how = How.ID, using = "cmdAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "grdBitReport")
			public WebElement uIBiteReportGridTable;

			@FindBy(how = How.ID, using = "nName_imgSrch")
			public WebElement uIVictimsNameInfoIcon;
			
			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;

			@FindBy(how = How.ID, using = "Reset")
			public WebElement uIResetButton;
			
			@FindBy(how = How.ID, using = "cddAttack_DropDown")
			public WebElement uIAttackDropdown;
			
			@FindBy(how = How.ID, using = "cddAnimalHeldAt_DropDown")
			public WebElement uIAnimalHeldAtDropDown;
			
			
			
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
	public class AnimalLostOrFoundSearch {
		public WebDriver driver;

		public AnimalLostOrFoundSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabLostFound_tmpl0_ctrlusrLFBasicSrch1_lstJuris")
		public WebElement uIJurisDropDown;

		@FindBy(how = How.ID, using = "tabLostFound_tmpl0_ctrlusrLFBasicSrch1_adrAnimalLF_txtFrom")
		public WebElement uILostOrFoundLocation;

		@FindBy(how = How.ID, using = "tabLostFound_tmpl0_ctrlusrLFBasicSrch1_txtLastName")
		public WebElement uIOwnerLastName;

		@FindBy(how = How.ID, using = "tabLostFound_tmpl0_ctrlusrLFBasicSrch1_txtLastName")
		public WebElement uIOwnerFirstName;

		@FindBy(how = How.ID, using = "tabLostFound_tmpl0_ctrlusrLFBasicSrch1_txtAnimalLastName")
		public WebElement uIAnimalLastName;

		@FindBy(how = How.ID, using = "tabLostFound_tmpl0_ctrlusrLFBasicSrch1_txtAnimalFirstName")
		public WebElement uIAnimalFirstName;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[(text()='Search')]")
		public WebElement uISearchButton;

	}

	public class AnimalLostOrFoundEntry {
		public WebDriver driver;

		public AnimalLostOrFoundEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropDown;

		@FindBy(how = How.ID, using = "chkLost")
		public WebElement uILostCheckBoc;

		@FindBy(how = How.ID, using = "chkFound")
		public WebElement uIFoundCheckBox;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uIAnimalLostOrFoundLocation;

		@FindBy(how = How.ID, using = "dttmRpt_Date_KPIDttmCtrl")
		public WebElement uIReportedDate;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmRpt_Time']//input")
		public WebElement uIReportedTime;

		@FindBy(how = How.ID, using = "dttmILF_Date_KPIDttmCtrl")
		public WebElement uILostOrFoundDate;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmILF_Time']//input")
		public WebElement uILostOrFoundTime;

		@FindBy(how = How.ID, using = "nRptName_NameType")
		public WebElement uIReportingPersonNameType;

		@FindBy(how = How.ID, using = "nRptName_NameTypeID")
		public WebElement uIReportingPersonNameTypeID;

		@FindBy(how = How.ID, using = "nRptName_LastName")
		public WebElement uIReportingPersonLastName;

		@FindBy(how = How.ID, using = "nRptName_FirstName")
		public WebElement uIReportingPersonFirstName;

		@FindBy(how = How.ID, using = "nRptName_MiddleName")
		public WebElement uIReportingPersonMiddleName;

		@FindBy(how = How.ID, using = "AnimalCtrl_NameTypeID")
		public WebElement uIAnimalNameTypeID;

		@FindBy(how = How.ID, using = "AnimalCtrl_MiddleName")
		public WebElement uIAnimalMiddleName;

		@FindBy(how = How.ID, using = "AnimalCtrl_LastName")
		public WebElement uIAnimalLastName;

		@FindBy(how = How.ID, using = "AnimalCtrl_FirstName")
		public WebElement uIAnimalFirstName;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;
		
		@FindBy(how = How.ID, using = "rdoShelyes")
		public WebElement uIAnimalShelterYesRadioButton;
		
		@FindBy(how = How.ID, using = "rdoShelNo")
		public WebElement uIAnimalShelterNoRadioButton;
		
		@FindBy(how = How.ID, using = "chkACH")
		public WebElement uIAnimalCollarOrHalterCheckkBox;
		
		@FindBy(how = How.ID, using = "rdoShareyes")
		public WebElement uIReportingPersonsInfoYesRadioButton;
		
		@FindBy(how = How.ID, using = "rdoShareNo")
		public WebElement uIReportingPersonsInfoNoRadioButton;
		
		@FindBy(how = How.ID, using = "AnimalCtrl_NameType")
		public WebElement uIAnimalNameType;
		
		@FindBy(how = How.ID, using = "chkLost")
		public WebElement uILostCheckBox; 

        @FindBy(how = How.ID, using = "chkLocated")
        public WebElement uIAnimalLocationCheckBox;

        @FindBy(how = How.ID, using = "adrLocation_cmdIncOnAddr")
        public WebElement uIAddressBubbleIcon;

        @FindBy(how = How.ID, using = "LFEntryCSZ_City")
        public WebElement uICSZCity;

        @FindBy(how = How.ID, using = "LFEntryCSZ_State_DropDown")
        public WebElement uICSZState;

        @FindBy(how = How.ID, using = "LFEntryCSZ_Zip")
        public WebElement uICSZZip;

        @FindBy(how = How.ID, using = "nRptName_imgSrch")
        public WebElement uIReportingPersonBubbleIcon;

        @FindBy(how = How.ID, using = "AnimalCtrl_imgSrch")
        public WebElement uIAnimalNameBubbleIcon;

	}

	public class AnimalRegistrationSearch {
		public WebDriver driver;

		public AnimalRegistrationSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_lstJuris")
		public WebElement uIJurisDropDown;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_nbrReg_Year")
		public WebElement uIRegEntryYearEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_nbrReg_Number")
		public WebElement uIRegEntryNumberEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_DttmIssueFrom_KPIDttmCtrl")
		public WebElement uIIssueFromDateEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_DttmIssueTo_KPIDttmCtrl")
		public WebElement uIIssueToDateEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_DttmExpireFrom_KPIDttmCtrl")
		public WebElement uIExpirationFromDateEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_DttmExpireTo_KPIDttmCtrl")
		public WebElement uIExpirationToDateEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtLicTagNbr")
		public WebElement uILicTagFieldEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_cddTagTypeA")
		public WebElement uILicTagTypeDropdown;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_cddIssueAgency_DropDown")
		public WebElement uILicenseIssuingAgencyDropdown;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtAnimalLast")
		public WebElement uIAnimalLastNameEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtAnimalFirst")
		public WebElement uIAnimalFirstNameEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtAnimalMiddle")
		public WebElement uIAnimalmiddleNameEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtLastName")
		public WebElement uIOwnerLastNameEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtFirstName")
		public WebElement uIOwnerFirstNameEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtMiddleName")
		public WebElement uIOwnerMiddleNameEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_cddBreed1")
		public WebElement uIBreed1Dropdown;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_cddBreed2")
		public WebElement uIBreed2Dropdown;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtMicroChipID")
		public WebElement uIMicroChipID;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_cddSpecies_DropDown")
		public WebElement uISpeciesDropdown;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[(text()='Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdEquipments")
		public WebElement uIgridResultsTable;

	}

	public class AnimalCageRental {
		public WebDriver driver;
		public InventoryItemTab InventoryItemTab;
		public FeesTab feesTab;
		public InvoiceTab invoiceTab;

		public AnimalCageRental() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (this.InventoryItemTab == null)
				this.InventoryItemTab = new InventoryItemTab();

			if (this.feesTab == null)
				this.feesTab = new FeesTab();

			if (this.invoiceTab == null)
				this.invoiceTab = new InvoiceTab();
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cmdSignOut")
		public WebElement uISignOutButton;

		@FindBy(how = How.ID, using = "cmdSignIn")
		public WebElement uISignInButton;

		@FindBy(how = How.ID, using = "lupIssuingPF_CodeValue")
		public WebElement uIIssuingPFCodeEdit;

		@FindBy(how = How.ID, using = "lupIssuedPF_CodeValue")
		public WebElement uIIssuedPFCodeEdit;

		@FindBy(how = How.ID, using = "lupIssuedPF_CodeDescription")
		public WebElement uIIssuedPFDescriptionEdit;

		@FindBy(how = How.ID, using = "lupIssuingPF_CodeDescription")
		public WebElement uIIssuingPFDescriptionEdit;

		@FindBy(how = How.ID, using = "nName_NameType")
		public WebElement uIIssuedNameType;

		@FindBy(how = How.ID, using = "nName_NameTypeID")
		public WebElement uIIssuedNameID;

		@FindBy(how = How.ID, using = "nName_LastName")
		public WebElement uIIssuedLastName;

		@FindBy(how = How.ID, using = "nName_FirstName")
		public WebElement uIIssuedFirstName;

		@FindBy(how = How.ID, using = "numInvNo_Year")
		public WebElement uIInvYearEdit;

		@FindBy(how = How.ID, using = "numInvNo_Number")
		public WebElement uIInvNoEdit;

		@FindBy(how = How.ID, using = "numInvNo_imgBtn")
		public WebElement uIInvNoInfoIcon;

		public class InventoryItemTab {
			public InventoryItemTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.XPATH, using = "//div[@id='tabInventory_tmpl0_ctrlInvItem_grdEquipSignLog']")
			public WebElement uIInventoryItemTable;

		}

		public class FeesTab {

		}

		public class InvoiceTab {
			@FindBy(how = How.XPATH, using = "//div[@id='tabInventory_tmpl3_usrGenericInvoicePayments1_grdInvoice']")
			public WebElement uIInvoiceTable;
		}

	}

	public class AnimalRegistrationEntry {
		public WebDriver driver;
		public AnimalRegistrationEntryApplicantTab animalRegistrationEntryApplicantTab;
		public AnimalRegistrationEntryFeesTab animalRegistrationEntryFeesTab;
		public AnimalRegistrationEntryNotesOrConditionsTab animalRegistrationEntryNotesOrConditionsTab;

		public AnimalRegistrationEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (this.animalRegistrationEntryApplicantTab == null)
				this.animalRegistrationEntryApplicantTab = new AnimalRegistrationEntryApplicantTab();

			if (this.animalRegistrationEntryFeesTab == null)
				this.animalRegistrationEntryFeesTab = new AnimalRegistrationEntryFeesTab();

			if (this.animalRegistrationEntryNotesOrConditionsTab == null)
				this.animalRegistrationEntryNotesOrConditionsTab = new AnimalRegistrationEntryNotesOrConditionsTab();

		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "nbrReg_Year")
		public WebElement uIRegEntryYearEdit;

		@FindBy(how = How.ID, using = "nbrReg_Number")
		public WebElement uIRegEntrynumberEdit;

		@FindBy(how = How.ID, using = "curCost_clientState")
		public WebElement uICost;

		@FindBy(how = How.XPATH, using = "//input[@id='dttmIssue_Date_KPIDttmCtrl']")
		public WebElement uIIssuedDateEdit;

		@FindBy(how = How.XPATH, using = "//input[contains(@class,'textboxdatetime')]")
		public WebElement uIIssuedTimeEdit;

		@FindBy(how = How.ID, using = "cddTagType")
		public WebElement uILicTagTypeDropdown;
		
		@FindBy(how = How.ID, using = "cddIssueAgency_DropDown")
		public WebElement uIIssuingAgencyDropdown;

		@FindBy(how = How.XPATH, using = "//input[@id='dttmExpire_KPIDttmCtrl']")
		public WebElement uIExpirationDateEdit;

		@FindBy(how = How.ID, using = "txtLicTagNbr")
		public WebElement uILicTagEdit;

		@FindBy(how = How.ID, using = "AnimalCtrl_NameType")
		public WebElement uIAnimalNameTypeEdit;

		@FindBy(how = How.ID, using = "AnimalCtrl_imgSrch")
		public WebElement uIAnimalNameInfoIcon;

		@FindBy(how = How.ID, using = "AnimalCtrl_NameTypeID")
		public WebElement uIAnimalNameTypeIDEdit;

		@FindBy(how = How.ID, using = "AnimalCtrl_LastName")
		public WebElement uIAnimalLastNameEdit;

		@FindBy(how = How.ID, using = "AnimalCtrl_FirstName")
		public WebElement uIAnimalFirstNameEdit;

		@FindBy(how = How.ID, using = "AnimalCtrl_MiddleName")
		public WebElement uIAnimalMiddleNameEdit;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "tabLicense_tmpl0_ctrlusrLicenSrchBasic_txtAnimalMiddle")
		public WebElement uIAnimalmiddleNameEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Applicant')]")
		public WebElement uIApplicantTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fees')]")
		public WebElement uIFeesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes/Conditions')]")
		public WebElement uINotesOrConditionTab;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl1_usrAnimalEntryNotes_rteKPITxt_contentIframe")
		public WebElement uINotesOrConditionsIFrame;

	}

	public class AnimalRegistrationEntryApplicantTab {
		public WebDriver driver;

		public AnimalRegistrationEntryApplicantTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_cddSpecies_DropDown")
		public WebElement uISpeciesDropdown;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_cddBreed1_DropDown")
		public WebElement uIBreed1Dropdown;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_cddBreed2_DropDown")
		public WebElement uIBreed2Dropdown;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nOwnerName_NameType")
		public WebElement uIOwnerNameTypeEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nOwnerName_NameTypeID")
		public WebElement uIOwnerNameTypeIDEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nOwnerName_LastName")
		public WebElement uIOwnerLastNameEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nOwnerName_FirstName")
		public WebElement uIOwnerFirstNameEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_txtOwnAddress")
		public WebElement uIOwnerAddressEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nOwnerName_MiddleName")
		public WebElement uIOwnerMiddleNameEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nVeterName_NameType")
		public WebElement uIVeterinarianNameTypeEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nVeterName_NameTypeID")
		public WebElement uIVeterinarianNameTypeIDEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nVeterName_LastName")
		public WebElement uIVeterinarianLastNameEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nVeterName_FirstName")
		public WebElement uIVeterinarianFirstNameEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_nVeterName_MiddleName")
		public WebElement uIVeterinarianMiddleNameEdit;

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_txtVeterAddress")
		public WebElement uIVeterinarianAddressEdit;

	}

	public class AnimalRegistrationEntryFeesTab {
		WebDriver driver;

		public AnimalRegistrationEntryFeesTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "TabAnimal_tmpl0_usrApplicantID_cddSpecies_DropDown")
		public WebElement uISpeciesDropdown;

		@FindBy(how = How.ID, using = "txtTotalInvoiceAmt")
		public WebElement uIInvoiceAmount;

	}

	public class AnimalRegistrationEntryNotesOrConditionsTab {
		public WebDriver driver;

		public AnimalRegistrationEntryNotesOrConditionsTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uINotesEdit;

	}


	public class AnimalNameMerge
	{
		public WebDriver driver;

		public AnimalNameMerge() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "imgDetail")
		public WebElement uINameBblIcon;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_imgDetail3")
		public WebElement uIMergeNameBblIcon;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_cmdReset")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_cmdSrch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_txtUNID")
		public WebElement uINameMergeUNTypeEdit;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_txtUNameTypeID")
		public WebElement uINameMergeUNIDEdit;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_txtULastName")
		public WebElement uINameMergeLastNameEdit;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_txtUFirstName")
		public WebElement uINameMergeFirstNameEdit;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_chkCheckAll")
		public WebElement uISelectAllCheckbox;

		@FindBy(how = How.ID, using = "cmdMerge")
		public WebElement uIMergeButton;

		@FindBy(how = How.ID, using = "tabAnimalNameMerge_tmpl0_usrAnimalNameMergeLst1_grdAnimalNameMergeLst")
		public WebElement uINameMergeLstResultTable;

		@FindBy(how = How.ID, using = "txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "imgDetail")
		public WebElement uIPrimaryNameInfoIcon;

		@FindBy(how = How.ID, using = "txtNID2")
		public WebElement uIMergeNameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameTypeID2")
		public WebElement uIMergeNameIDEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class AnimalNameMergeHelpWindow {
		public WebDriver driver;

		public AnimalNameMergeHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdMerge")
		public WebElement uIMergeButton;

		@FindBy(how = How.ID, using = "grdNameMerge")
		public WebElement uINameMergeTable;

	}
	public class AnimalNameEntryMedicalProcedure {
		public WebDriver driver;

		public AnimalNameEntryMedicalProcedure() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "curCost")
		public WebElement uITotalCostEdit;

		@FindBy(how = How.ID, using = "dtcProcidure_KPIDttmCtrl")
		public WebElement uIDateOfProcedure;
		
		@FindBy(how = How.ID, using = "nVeterinarian_NameTypeID")
		public WebElement uIVeterinarianNameIDEdit;
		
		@FindBy(how = How.ID, using = "nVeterinarian_NameType")
		public WebElement uIVeterinarianNameTypeEdit;
		
		@FindBy(how = How.ID, using = "cddVacType_DropDown")
		public WebElement uIVacTypeDropdown;
		
		@FindBy(how = How.ID, using = "cddBrand_DropDown")
		public WebElement uIBrandDropdown;
		
		@FindBy(how = How.ID, using = "txtProcedurePerformed")
		public WebElement uIProcedurePerformed;
		
		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		
	}


}
