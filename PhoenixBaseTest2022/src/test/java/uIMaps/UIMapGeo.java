package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapGeo {

	// public ObjectIdentification objectIdentification= new ObjectIdentification();
	// public ObjectIdentification.WindowHandle
	// windowHandle=objectIdentification.new WindowHandle();

	public StreetEntry streetEntry;
	public StreetSearch streetSearch;
	public CommonNameHelp commonNameHelp;
	public CommonNames commonNames;
	public CommonNamesEntry commonNamesEntry;
	public StreetUpdate streetUpdate;
	public AddressIntersection addressIntersection;
	public AddressIntersection2040 addressIntersection2040;
	public Apartment apartment;
	public ApartmentEntry apartmentEntry;
	public ApartmentHelpWindow apartmentHelpWindow;
	public AddressSearch addressSearch;
	public FastGeo fastGeo;
	public AddressFlag addressFlag;
	public AddressFlagEntry addressFlagEntry;
	public BatchUpdate batchUpdate;
	public HazMatFlags hazMatFlags;
	public HazMatFlagEntry hazMatFlagEntry;
	public HydrantSearch hydrantSearch;
	public HydrantEntry hydrantEntry;
	public WeatherScreen weatherScreen;
	public ContactEntryScreen contactEntryScreen;
	public ContactSearch contactSearch;
	public GeoContactNewEntry geoContactNewEntry;
	public HydrantTest hydrantTest;
	public MapLayerEntry mapLayerEntry;
	public AddressSearchHelp addressSearchHelp;
	public RealAddressHelpWindow realAddressHelpWindow;
	public UpdateGeoCode updateGeoCode;
	public MapLayerSearch mapLayerSearch;
	public AVLReplay aVLReplay;
	public AddressIntersection2040UpdateLatLongWindow addressIntersection2040UpdateLatLongWindow;
	public ZipCode zipCode;
	public PremiseHelpWindow premiseHelpWindow;
	public AddressIntersectionHelpWindow addressIntersectionHelpWindow;
	public ZipCodeEntry zipCodeEntry;

	public UIMapGeo() {
		if (this.streetEntry == null)
			this.streetEntry = new StreetEntry();

		if (this.streetSearch == null)
			this.streetSearch = new StreetSearch();

		if (this.commonNameHelp == null)
			this.commonNameHelp = new CommonNameHelp();

		if (this.commonNames == null)
			this.commonNames = new CommonNames();

		if (this.commonNamesEntry == null)
			this.commonNamesEntry = new CommonNamesEntry();

		if (this.addressSearchHelp == null)
			this.addressSearchHelp = new AddressSearchHelp();

		if (this.streetUpdate == null)
			this.streetUpdate = new StreetUpdate();

		if (this.addressIntersection == null)
			this.addressIntersection = new AddressIntersection();

		if (this.addressIntersection2040 == null)
			this.addressIntersection2040 = new AddressIntersection2040();

		if (this.apartment == null)
			this.apartment = new Apartment();

		if (this.apartmentEntry == null)
			this.apartmentEntry = new ApartmentEntry();

		if (this.apartmentHelpWindow == null)
			this.apartmentHelpWindow = new ApartmentHelpWindow();

		if (this.addressSearch == null)
			this.addressSearch = new AddressSearch();

		if (this.fastGeo == null)
			this.fastGeo = new FastGeo();

		if (this.addressFlag == null)
			this.addressFlag = new AddressFlag();

		if (this.addressFlagEntry == null)
			this.addressFlagEntry = new AddressFlagEntry();

		if (this.batchUpdate == null)
			this.batchUpdate = new BatchUpdate();

		if (this.hazMatFlags == null)
			this.hazMatFlags = new HazMatFlags();

		if (this.hazMatFlagEntry == null)
			this.hazMatFlagEntry = new HazMatFlagEntry();

		if (this.hydrantSearch == null)
			this.hydrantSearch = new HydrantSearch();

		if (this.hydrantEntry == null)
			this.hydrantEntry = new HydrantEntry();

		if (this.weatherScreen == null)
			this.weatherScreen = new WeatherScreen();

		if (this.contactEntryScreen == null)
			this.contactEntryScreen = new ContactEntryScreen();

		if (this.contactSearch == null)
			this.contactSearch = new ContactSearch();

		if (this.geoContactNewEntry == null)
			this.geoContactNewEntry = new GeoContactNewEntry();

		if (this.hydrantTest == null)
			this.hydrantTest = new HydrantTest();

		if (this.mapLayerEntry == null)
			this.mapLayerEntry = new MapLayerEntry();

		if (this.mapLayerSearch == null)
			this.mapLayerSearch = new MapLayerSearch();

		if (this.realAddressHelpWindow == null)
			this.realAddressHelpWindow = new RealAddressHelpWindow();

		if (this.updateGeoCode == null)
			this.updateGeoCode = new UpdateGeoCode();

		if (this.aVLReplay == null)
			this.aVLReplay = new AVLReplay();

		if (this.addressIntersection2040UpdateLatLongWindow == null)
			this.addressIntersection2040UpdateLatLongWindow = new AddressIntersection2040UpdateLatLongWindow();

		if (this.zipCode == null)
			this.zipCode = new ZipCode();

		if (premiseHelpWindow == null)
			premiseHelpWindow = new PremiseHelpWindow();

		if (addressIntersectionHelpWindow == null)
			addressIntersectionHelpWindow = new AddressIntersectionHelpWindow();
		if (this.zipCodeEntry == null)
			this.zipCodeEntry = new ZipCodeEntry();

	}

	public class StreetEntry {
		public WebDriver driver;

		public StreetEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddPrefix_DropDown")
		public WebElement uIPrefixComboBox;
		

		@FindBy(how = How.XPATH, using = "//input[@id='txtStreetName']")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.ID, using = "lupType_CodeValue")
		public WebElement uIStreetTypeEdit;

		@FindBy(how = How.ID, using = "cddSuffix_DropDown")
		public WebElement uISuffixComboBox;

		@FindBy(how = How.ID, using = "imgAddStreet")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearStreet")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "grdStreet")
		public WebElement uIStreetEntryResultGrid;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "lupZipcode_CodeValue")
		public WebElement uIZipcodeEdit;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "lupZipcode_CodeDescription")
		public WebElement uIZipCodeDescription;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;
		
		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIReset;

	}

	
	public class StreetSearch {
		public WebDriver driver;

		public StreetSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddPrefix_DropDown")
		public WebElement uIPrefixComboBox;

		@FindBy(how = How.ID, using = "txtStreetname")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.ID, using = "lupType_CodeValue")
		public WebElement uIStreetTypeEdit;

		@FindBy(how = How.ID, using = "lupType_imgBtn")
		public WebElement uIStreetTypeLookupButton;

		@FindBy(how = How.ID, using = "cddSuffix_DropDown")
		public WebElement uISuffixComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(xpath = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewPane;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Batch Update')])")
		public WebElement uIBatchUpdateButton;

		@FindBy(how = How.ID, using = "chkAlternate")
		public WebElement uIShowAlternateCheckBox;

		@FindBy(how = How.ID, using = "ChkIntersection")
		public WebElement uIIntersectionCheckBox;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "grdStreet")
		public WebElement uIStreetSearchResultGrID;

		@FindBy(how = How.ID, using = "chkCellSelect")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "lupZipcodeSearch_CodeValue")
		public WebElement uIPopupZipCodeEdit;

		@FindBy(how = How.ID, using = "lupZipcodeSearch_imgBtn")
		public WebElement uIZipCodeLookupButton;

		@FindBy(how = How.ID, using = "cmdUpdate")
		public WebElement uIPopupUpdateButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uIPopupCancelButton;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Manage Intersection')])")
		public WebElement uIManageIntersectionButton;
	}

	public class CommonNameHelp {
		public WebDriver driver;

		public CommonNameHelp() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@ID='grdCommonName']")
		public WebElement uICommonNameTable;

		@FindBy(how = How.ID, using = "radAlpha")
		public WebElement uIAlphaRadioButton;

		@FindBy(how = How.ID, using = "radSoundEX")
		public WebElement uISoundEXRadioButton;

		@FindBy(how = How.ID, using = "radContains")
		public WebElement uIContainsRadioButton;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddCommonNameToGeoButton;

	}

	public class CommonNames {
		public WebDriver driver;

		public CommonNames() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "adrAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintImageButton;

		@FindBy(how = How.ID, using = "grdCMNName")
		public WebElement uICommonNameSearchTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNew;

		@FindBy(how = How.ID, using = "lupZipCode_CodeValue")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "chkSoundex")
		public WebElement uISoundAlike;

		@FindBy(how = How.ID, using = "adrAddress_cmdIncOnAddr")
		public WebElement uIAddressInfoIcon;
	}

	public class CommonNamesEntry {
		public WebDriver driver;

		public CommonNamesEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "adrAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "txtCmnName")
		public WebElement uICommonNameEdit;

		@FindBy(how = How.ID, using = "txtViewOrder")
		public WebElement uISortOrderEdit;

		@FindBy(how = How.ID, using = "chkReplace")
		public WebElement uIReplaceCheckBox;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdCmnName")
		public WebElement uICommonNameEntryResultTable;

		@FindBy(how = How.ID, using = "dtcDelDttm_KPIDttmCtrl")
		public WebElement uIInactiveDateEdit;

	}

	public class StreetUpdate {

		public WebDriver driver;

		public StreetUpdate() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cddMainPrefix_DropDown")
		public WebElement uIMainPrefixComboBox;

		@FindBy(how = How.ID, using = "txtMainStreetName")
		public WebElement uIMainStreetNameEdit;

		@FindBy(how = How.ID, using = "lupMainStreetType_CodeValue")
		public WebElement uIMainStreetTypeEdit;

		@FindBy(how = How.ID, using = "cddMainStreetSuffix_DropDown")
		public WebElement uIMainSuffixComboBox;

		@FindBy(how = How.ID, using = "cddPrefix_DropDown")
		public WebElement uIAltPrefixComboBox;

		@FindBy(how = How.ID, using = "txtStreetName")
		public WebElement uIAltStreetNameEdit;

		@FindBy(how = How.ID, using = "lupType_CodeValue")
		public WebElement uIAltStreetTypeEdit;

		@FindBy(how = How.ID, using = "cddSuffix_DropDown")
		public WebElement uIAltSuffixComboBox;

		@FindBy(how = How.ID, using = "chkReplace")
		public WebElement uIReplaceCheckBox;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIMainInactiveCheckBox;

		@FindBy(how = How.ID, using = "chkAlInActive")
		public WebElement uIAltInactiveCheckBox;

		@FindBy(how = How.ID, using = "imgAddStreet")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearStreet")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "grdStreet")
		public WebElement uIStreetUpdateResultGrid;

		@FindBy(how = How.ID, using = "cstLeft_txtFrom")
		public WebElement uIPremieOddEdit;

		@FindBy(how = How.ID, using = "cstRight_txtFrom")
		public WebElement uIPremieEvenEdit;
		
		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")           // Added by Abi
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class AddressIntersection {

		public WebDriver driver;

		public AddressIntersection() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInactiveDateTextView;

		@FindBy(how = How.ID, using = "txtStreetName")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.ID, using = "stcIntStreetName_txtFrom")
		public WebElement uIIntersectionStreetNameEdit;

		@FindBy(how = How.ID, using = "stcIntStreetName_chkVerify")
		public WebElement uIIntersectionStreetNameVerifyCheckBox;

		@FindBy(how = How.ID, using = "txtIdentifier")
		public WebElement uIIdentifierEdit;

		@FindBy(how = How.ID, using = "txtPremise")
		public WebElement uIPremiseEdit;

		@FindBy(how = How.ID, using = "txtIntPremise")
		public WebElement uIIntPremiseEdit;

		@FindBy(how = How.ID, using = "cstLeft_txtFrom")
		public WebElement uIPremiseOddFromEdit;

		@FindBy(how = How.ID, using = "cstLeft_txtTo")
		public WebElement uIPremiseOddToEdit;

		@FindBy(how = How.ID, using = "cstRight_txtFrom")
		public WebElement uIPremiseEvenFromEdit;

		@FindBy(how = How.ID, using = "cstRight_txtTo")
		public WebElement uIPremiseEvenToEdit;

		@FindBy(how = How.ID, using = "cstGeoCords_txtFrom")
		public WebElement uIGeoCordsXEdit;

		@FindBy(how = How.ID, using = "cstGeoCords_txtTo")
		public WebElement uIGeoCordsYEdit;

		@FindBy(how = How.ID, using = "cddPremiseEvenOdd_DropDown")
		public WebElement uIPremiseComboBox;

		@FindBy(how = How.ID, using = "cddPatrolzone_DropDown")
		public WebElement uIPatrolZoneComboBox;

		@FindBy(how = How.ID, using = "cddSubZone_DropDown")
		public WebElement uISubZoneComboBox;

		@FindBy(how = How.ID, using = "lupURACard_CodeValue")
		public WebElement uINPACardEdit;

		@FindBy(how = How.ID, using = "lupURACard_imgBtn")
		public WebElement uINPACardLookupButton;

		@FindBy(how = How.ID, using = "lupZipcode_CodeValue")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "lupZipcode_imgBtn")
		public WebElement uIZipCodeLookupButton;

		@FindBy(how = How.ID, using = "txtCensusTract")
		public WebElement uICensusTractEdit;

		@FindBy(how = How.ID, using = "cddVotingDist_DropDown")
		public WebElement uIVotingDistrictComboBox;

		@FindBy(how = How.ID, using = "imgAddStreet")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearStreet")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdStreet")
		public WebElement uIAddressIntersectionResultGrid;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "cddPatrolzone_DropDown")
		public WebElement uIDistrictComboBox;

		@FindBy(how = How.ID, using = "cddSubZone_DropDown")
		public WebElement uISubDistrictComboBox;
	}

	public class AddressIntersection2040 {
		public WebDriver driver;
		public AddressIntersectionMainTab addressIntersectionMainTab;
		public PoliceTab policeTab;
		public FireTab fireTab;

		public AddressIntersection2040() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.addressIntersectionMainTab == null)) {
				this.addressIntersectionMainTab = new AddressIntersectionMainTab();
			}
			if ((this.policeTab == null)) {
				this.policeTab = new PoliceTab();
			}
			if ((this.fireTab == null)) {
				this.fireTab = new FireTab();
			}
		}

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "txtStreetName")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.ID, using = "txtFrmLeft")
		public WebElement uIPremiseOddFromEdit;

		@FindBy(how = How.ID, using = "txtToLeft")
		public WebElement uIPremiseOddToEdit;

		@FindBy(how = How.ID, using = "txtFrmRight")
		public WebElement uIPremiseEvenFromEdit;

		@FindBy(how = How.ID, using = "txtToRight")
		public WebElement uIPremiseEvenToEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Police')]")
		public WebElement uIPoliceTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Fire')]")
		public WebElement uIFireTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;
		@FindBy(how = How.ID, using = "cmdRefresh")										// Added by Abi
		public WebElement uIRefreshButton;

	}

	public class AddressIntersectionMainTab {
		public WebDriver driver;

		public AddressIntersectionMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabAddress_tmpl0_ctrlUsrAddressMain_cddPremiseType_DropDown")
		public WebElement uIPremiseTypeComboBox;

		@FindBy(how = How.ID, using = "tabAddress_tmpl0_ctrlUsrAddressMain_txtCensus")
		public WebElement uICensusEdit;

		@FindBy(how = How.ID, using = "tabAddress_tmpl0_ctrlUsrAddressMain_cddVotingDist_DropDown")
		public WebElement uIVotingDistComboBox;

		@FindBy(how = How.ID, using = "tabAddress_tmpl0_ctrlUsrAddressMain_btnShowMap")
		public WebElement uIMapButton;

		@FindBy(how = How.ID, using = "tabAddress_tmpl0_ctrlUsrAddressMain_btnGetLatiLongi")
		public WebElement uIGetButton;
	}

	public class PoliceTab {
		public WebDriver driver;

		public PoliceTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupPatrolZone_CodeValue")
		public WebElement uIPatrolZoneEdit;

		@FindBy(how = How.ID, using = "lupSubZone_CodeValue")
		public WebElement uISubZoneEdit;

		@FindBy(how = How.ID, using = "lupURACard_CodeValue")
		public WebElement uINPACardEdit;

		@FindBy(how = How.ID, using = "lupServiceArea_CodeValue")
		public WebElement uICivilDistrictEdit;

		@FindBy(how = How.ID, using = "txtCustom1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "grdTracking")
		public WebElement uITrackingDetailsResultGrid;

		@FindBy(how = How.ID, using = "grdBZPatrol")
		public WebElement uIBorderPZTable;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lupTracking_CodeValue")
		public WebElement uITrackingNoCodedEdit;

		@FindBy(how = How.ID, using = "imgAddTracking")
		public WebElement uITrackingNoAddButton;

		@FindBy(how = How.ID, using = "lupBZPatrolZone_CodeValue")
		public WebElement uIBorderPZCodedEdit;

		@FindBy(how = How.ID, using = "imgAddBZP")
		public WebElement uIBorderPZAddButton;

		@FindBy(how = How.ID, using = "grdMultiJuris")
		public WebElement uIMultiJurisGridTable;

		@FindBy(how = How.ID, using = "lupTowArea_CodeValue")
		public WebElement uITowAreaCodedEdit;
	}

	public class FireTab {
		public WebDriver driver;

		public FireTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupMutualAid_CodeValue")
		public WebElement uIMutualAidCodedEdit;

		@FindBy(how = How.ID, using = "grdMutualAid")
		public WebElement uIMutualAidTable;

		@FindBy(how = How.ID, using = "imgAddMutualAid")
		public WebElement uIMutualAidAddButton;

		@FindBy(how = How.ID, using = "lupTracking_CodeValue")
		public WebElement uITrackingNoCodedEdit;

		@FindBy(how = How.ID, using = "grdTracking")
		public WebElement uITrackingNoTable;

		@FindBy(how = How.ID, using = "imgAddTracking")
		public WebElement uITrackingNoAddButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lupFRC_CodeValue")
		public WebElement uIRANoCodedEdit;

		@FindBy(how = How.ID, using = "lupFRC_CodeDescription")
		public WebElement uIRANoDescriptionEdit;

		@FindBy(how = How.ID, using = "grdMultiJuris")
		public WebElement uIMultiJurisGridTable;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "lupFixPropUse_CodeValue")
		public WebElement uIPropertyUseEdit;

		@FindBy(how = How.ID, using = "lupFixPropUse_CodeDescription")
		public WebElement uIPropertyUseDescriptionEdit;
	}

	public class Apartment {
		public WebDriver driver;

		public Apartment() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtStreetName")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNew;

		@FindBy(how = How.ID, using = "grdStreet")
		public WebElement uIApartmentResultGrid;
	}

	public class ApartmentEntry {

		public WebDriver driver;

		public ApartmentEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtPremise")
		public WebElement uIPremiseEdit;

		@FindBy(how = How.ID, using = "txtAptFrom")
		public WebElement uIApartmentFromEdit;

		@FindBy(how = How.ID, using = "txtAptTo")
		public WebElement uIApartmentToEdit;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "imgAddStreet")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearStreet")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdStreet")
		public WebElement uIApartmentEntryResultGrid;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInactiveDateEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class ApartmentHelpWindow {
		public WebDriver driver;

		public ApartmentHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtApartment")
		public WebElement uIApartmentEdit;

		@FindBy(how = How.ID, using = "cmdLoad")
		public WebElement uIUseThisAptNoButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelAndReenterButton;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddThisAptNoToGeoButton;

		@FindBy(how = How.ID, using = "txtApartRangeInfo")
		public WebElement uIAppartmentRaneInfoEdit;

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uILocationTextView;

		@FindBy(how = How.ID, using = "cmdBaseAddr")
		public WebElement uIUseBaseAddressButton;
	}

	public class AddressSearchHelp {
		public WebDriver driver;
		public AddressSearchHelpMapTab addressSearchHelpMapTab;
		public AddressSearchHelpDetailsTab addressSearchHelpDetailsTab;
		public AddressSearchHelpContactTab addressSearchHelpContactTab;
		public AddressSearchHelpFlagsTab addressSearchHelpFlagsTab;
		public AddressSearchHelpCommonNameTab addressSearchHelpCommonNameTab;

		public AddressSearchHelp() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.addressSearchHelpMapTab == null)) {
				this.addressSearchHelpMapTab = new AddressSearchHelpMapTab();
			}
			if ((this.addressSearchHelpDetailsTab == null)) {
				this.addressSearchHelpDetailsTab = new AddressSearchHelpDetailsTab();
			}
			if ((this.addressSearchHelpContactTab == null)) {
				this.addressSearchHelpContactTab = new AddressSearchHelpContactTab();
			}
			if ((this.addressSearchHelpFlagsTab == null)) {
				this.addressSearchHelpFlagsTab = new AddressSearchHelpFlagsTab();
			}
			if ((this.addressSearchHelpCommonNameTab == null)) {
				this.addressSearchHelpCommonNameTab = new AddressSearchHelpCommonNameTab();
			}
		}

		@FindBy(how = How.ID, using = "addrLoc_cmdIncOnAddr")
		public WebElement uIAddressDetailsInfoButton;

		@FindBy(how = How.ID, using = "btnDetails")
		public WebElement uIAddressDetailsButton;

		@FindBy(how = How.ID, using = "addrLoc_txtFrom")
		public WebElement uIAddressTextView;

		@FindBy(how = How.ID, using = "addrLoc_chkVerify")
		public WebElement uIAddressVerifyCheckBox;

		@FindBy(how = How.ID, using = "cmdReset")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtZip")
		public WebElement uIZipCodeTextView;

		@FindBy(how = How.ID, using = "imgWeather")
		public WebElement uIWeatherIconButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Map')]")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Flags')]")
		public WebElement uIFlagsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Names')]")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Details')]")
		public WebElement uIDetailsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Contacts')]")
		public WebElement uIContactsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Common Name')]")
		public WebElement uICommonNameTab;

	}

	public class AddressSearchHelpMapTab {
		public WebDriver driver;

		public AddressSearchHelpMapTab() {
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

		@FindBy(how = How.XPATH, using = "//button[@class = 'CustomBtn']")
		public WebElement uIResetButton;
	}

	public class AddressSearchHelpDetailsTab {
		public WebDriver driver;

		public AddressSearchHelpDetailsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCitizenFlag1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "txtCitizenFlag2")
		public WebElement uICustom2Edit;

		@FindBy(how = How.ID, using = "txtLatitude")
		public WebElement uILatitudeEdit;

		@FindBy(how = How.ID, using = "txtLongitude")
		public WebElement uILongitudeEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;
	}

	public class AddressSearchHelpContactTab {
		public WebDriver driver;

		public AddressSearchHelpContactTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnAddnew")
		public WebElement uIAddNewButton;
	}

	public class AddressSearchHelpFlagsTab {
		public WebDriver driver;

		public AddressSearchHelpFlagsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddFlagsButton;

	}

	public class AddressSearchHelpCommonNameTab {
		public WebDriver driver;

		public AddressSearchHelpCommonNameTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddCommonNameButton;

	}

	public class AddressSearch {
		public WebDriver driver;
		public AddressSearchMapTab addressSearchMapTab;
		public AddressSearchFlagsTab addressSearchFlagsTab;
		public AddressSearchActivitiesTab addressSearchActivitiesTab;
		public AddressSearchContactTab addressSearchContactTab;
		public MergeAddressPopup mergeAddressPopup;
		public AddressSearchNamesTab addressSearchNamesTab;
		public AddressSearchCommonNameTab addressSearchCommonNameTab;
		public AddressSearchDetailsTab addressSearchDetailsTab;

		public AddressSearchHazMatTab addressSearchHazMatTab;
		public AddressSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.addressSearchMapTab == null)) {
				this.addressSearchMapTab = new AddressSearchMapTab();
			}
			if ((this.addressSearchFlagsTab == null)) {
				this.addressSearchFlagsTab = new AddressSearchFlagsTab();
			}
			if ((this.addressSearchActivitiesTab == null)) {
				this.addressSearchActivitiesTab = new AddressSearchActivitiesTab();
			}
			if ((this.addressSearchContactTab == null)) {
				this.addressSearchContactTab = new AddressSearchContactTab();
			}
			if ((this.mergeAddressPopup == null)) {
				this.mergeAddressPopup = new MergeAddressPopup();
			}
			if ((this.addressSearchNamesTab == null)) {
				this.addressSearchNamesTab = new AddressSearchNamesTab();
			}
			if ((this.addressSearchCommonNameTab == null)) {
				this.addressSearchCommonNameTab = new AddressSearchCommonNameTab();
			}
			if ((this.addressSearchDetailsTab == null)) {
				this.addressSearchDetailsTab = new AddressSearchDetailsTab();
			}
			if ((this.addressSearchHazMatTab == null)) {
				this.addressSearchHazMatTab = new AddressSearchHazMatTab();
			}

		}

		@FindBy(how = How.ID, using = "btnDetails")
		public WebElement uIaddressButton;

		@FindBy(how = How.ID, using = "addrLoc_txtFrom") // Changed by Abi
		public WebElement uIAddressLocationEdit;

		@FindBy(how = How.ID, using = "addrLoc_chkVerify")
		public WebElement uIAddessLocationCheckBox;

		@FindBy(how = How.ID, using = "cmdReset")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtZip")
		public WebElement uIZipCodeTextView;

		@FindBy(how = How.ID, using = "lblCSZ")
		public WebElement uICSZTextView;

		@FindBy(how = How.ID, using = "btnMergeAddress")
		public WebElement uIMergeAddressButton;

		@FindBy(how = How.ID, using = "imgWeather")
		public WebElement uIWeatherIconButton;

		@FindBy(how = How.ID, using = "btnWeather")
		public WebElement uIWeatherButton;

		@FindBy(how = How.ID, using = "btnView")
		public WebElement uIParaIDNameButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "lblCPName")
		public WebElement uICommonNameTextView;

		@FindBy(how = How.ID, using = "lblPremisesubAlt")
		public WebElement uIAltStreetTextView;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Premise History')]")
		public WebElement uIPremiseHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Contacts')]")
		public WebElement uIContactsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[text()='HazMat']") // added by Abi
		public WebElement uIHazMatTab;
		
		//@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Map')]")                // commented by Abi
		@FindBy(how = How.XPATH, using = "//div[@id = 'tabAddrDtls']//span[@mkr='ti12']")	 // uncommented
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Activities')]")
		public WebElement uIActivitiesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Flags')]")
		// @FindBy(how = How.XPATH, using = "//div[@id = 'tabAddrDtls']//span[@mkr=
		// 'ti2']")
		public WebElement uIFlagsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Names')]")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Common Name')]")
		public WebElement uICommonNameTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Details')]")
		public WebElement uIDetailsTab;

		@FindBy(how = How.ID, using = "addrLoc_cmdIncOnAddr")
		public WebElement uIAddressBubble;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Notification')]")
		public WebElement uINotificationTab;

		public class AddressSearchHazMatTab { // added by Abi

			public WebDriver driver;

			public AddressSearchHazMatTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.XPATH, using = "//div[@id='tabAddrDtls_tmpl6_UsraddrHazMat1_grdHazMatFlag']")
			public WebElement uIHazMatTable;

		}
	}

	public class AddressSearchMapTab {
		public WebDriver driver;

		public AddressSearchMapTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			// windowHandle.SwitchToFrame("Home/GHydrantMapHERE.aspx");
		}

		@FindBy(how = How.ID, using = "frmGHydrantMap_Id")
		public WebElement uIFormName;

		@FindBy(how = How.ID, using = "lbllatLongvalue")
		public WebElement uILatLongTextView;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lbllatLongvalue']/font")
		public WebElement uILatLongValueTextView;

		@FindBy(how = How.ID, using = "btnUpdateLatLong")
		public WebElement uILatLongButton;

		@FindBy(how = How.XPATH, using = "//button[@class = 'CustomBtn']")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//img[@src = 'https://maps.gstatic.com/mapfiles/api-3/images/spotlight-poi2.png']")
		public WebElement uIMapLocationIconButton;

		@FindBy(how = How.ID, using = "cddPointLayers_Input")
		public WebElement uISelectOverlayInputComboBox;

		@FindBy(how = How.ID, using = "cddPointLayers_DropDown")
		public WebElement uISelectOverlayComboBox;

		@FindBy(how = How.ID, using = "pac-input")
		public WebElement uILocationSearchEdit;

		@FindBy(how = How.XPATH, using = "//iframe[contains(@src, 'Home/GHydrantMapHERE.aspx')]") // Changed by Abi
		public WebElement uIAddressSearchHereMapTabIframe;

		@FindBy(how = How.XPATH, using = "//iframe[contains(@src, 'Home/GHydrantMap.aspx')]") // Changed by Abi
		public WebElement uIAddressSearchGoogleMapTabIframe;

	}

	public class AddressSearchFlagsTab {
		public WebDriver driver;

		public AddressSearchFlagsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddFlagsButton;

		@FindBy(how = How.ID, using = "grdFlags")
		public WebElement uIGridsResultTable;

		@FindBy(how = How.ID, using = "grdFlags_it5_0_lbl_Activeof")
		public WebElement uIActiveAsOfInGridTable;

		@FindBy(how = How.XPATH, using = "//iframe[contains(@src, 'GEO/frmAddrInfoFlags.aspx')]")
		public WebElement uIAddressSearchFlagsTabIframe;

		@FindBy(how = How.XPATH, using = "//td[contains(@class,'Delete_Icon_Style')]")
		public WebElement uIDeleteGridRow;

		@FindBy(how = How.XPATH, using = "//div[@id='grdFlags_it5_0_ConDiv']")
		public WebElement uIRemarksGridTable;

		@FindBy(how = How.ID, using = "grdFlags_it5_0_lbl_DelDttm")
		public WebElement uIInActiveOfGridTable;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIShowInActiveCheckbox;

	}

	public class AddressSearchContactTab {
		public WebDriver driver;

		public AddressSearchContactTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdContacts")
		public WebElement uIContactsTabResultTable;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "btnAddnew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "chkIncludeExpired")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneType_DropDown")
		public WebElement uIPhoneType1ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneNumber")
		public WebElement uIPhoneNumber1Edit;

		@FindBy(how = How.ID, using = "txtNotes_1")
		public WebElement uINotes1Edit;

		@FindBy(how = How.ID, using = "imgRemove_1")
		public WebElement uIDeleteicon1Button;

		@FindBy(how = How.ID, using = "txtNumber_2_PhoneType_DropDown")
		public WebElement uIPhoneType2ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_2_PhoneNumber")
		public WebElement uIPhoneNumber2Edit;

		@FindBy(how = How.ID, using = "txtNotes_2")
		public WebElement uINotes2Edit;

		@FindBy(how = How.ID, using = "imgRemove_2")
		public WebElement uIDeleteicon2Button;

		@FindBy(how = How.ID, using = "txtNumber_3_PhoneType_DropDown")
		public WebElement uIPhoneType3ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_3_PhoneNumber")
		public WebElement uIPhoneNumber3Edit;

		@FindBy(how = How.ID, using = "txtNotes_3")
		public WebElement uINotes3Edit;

		@FindBy(how = How.ID, using = "imgRemove_3")
		public WebElement uIDeleteicon3Button;

		@FindBy(how = How.ID, using = "AddMorePhoneNumber")
		public WebElement uIAddMorePhoneNumberButton;

		@FindBy(how = How.ID, using = "txtOrder_1")
		public WebElement uIOrder1Edit;

		@FindBy(how = How.ID, using = "txtOrder_2")
		public WebElement uIOrder2Edit;

		@FindBy(how = How.ID, using = "chkInactive_1")
		public WebElement uIPhoneInactive1;

		@FindBy(how = How.ID, using = "chkInactive_2")
		public WebElement uIPhoneInactive2;

	}

	public class AddressSearchActivitiesTab {
		public WebDriver driver;

		public AddressSearchActivitiesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdActLogSrch")
		public WebElement uIActivitiesTable;

	}

	public class MergeAddressPopup {
		public WebDriver driver;

		public MergeAddressPopup() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "addrMergetoAddr_txtFrom")
		public WebElement uIMergeToAddressEdit;

		@FindBy(how = How.ID, using = "addrMergetoAddr_chkVerify")
		public WebElement uIAddrMergeChkVerifyCheckbox;

		@FindBy(how = How.ID, using = "lblFrmAddr")
		public WebElement uIFromAddressTextView;

		@FindBy(how = How.ID, using = "btnCount")
		public WebElement uIGetCountButton;

		@FindBy(how = How.ID, using = "btnMerge")
		public WebElement uIMergeButton;

		@FindBy(how = How.ID, using = "btnCancel")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "lblCount")
		public WebElement uIRecordCountTextView;

		@FindBy(how = How.ID, using = "lblMergeZip")
		public WebElement uICSZValue;

		@FindBy(how = How.ID, using = "addrMergetoAddr_cmdIncOnAddr")
		public WebElement uIMergeAddressInfoIcon;

	}

	public class AddressSearchNamesTab {
		public WebDriver driver;

		public AddressSearchNamesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdNames")
		public WebElement uINamesTable;

	}

	public class AddressSearchCommonNameTab {
		public WebDriver driver;

		public AddressSearchCommonNameTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddCommonNameButton;

		@FindBy(how = How.ID, using = "grdCMNName")
		public WebElement uICommonNameTable;
	}

	public class AddressSearchDetailsTab {
		public WebDriver driver;

		public AddressSearchDetailsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtLatitude")
		public WebElement uILatitudeEdit;

		@FindBy(how = How.ID, using = "txtLongitude")
		public WebElement uILongitudeEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

	}

	public class FastGeo {
		public WebDriver driver;

		public FastGeo() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "radAddress")
		public WebElement uIAddessCheckBox;

		@FindBy(how = How.ID, using = "radIntersection")
		public WebElement uIIntersectionCheckBox;

		@FindBy(how = How.ID, using = "txtPremiseNo")
		public WebElement uIPremiseNoEdit;

		@FindBy(how = How.ID, using = "cddStreetPrefix_DropDown")
		public WebElement uIPrefixComboBox;

		@FindBy(how = How.ID, using = "txtStreetName")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.ID, using = "lupType_CodeValue")
		public WebElement uIStreetTypeEdit;

		@FindBy(how = How.ID, using = "lupType_imgBtn")
		public WebElement uIStreetTypeLookupButton;

		@FindBy(how = How.ID, using = "cddStreetSuffix_DropDown")
		public WebElement uISuffixComboBox;

		@FindBy(how = How.ID, using = "txtSuitApt")
		public WebElement uIAppartmentEdit;

		@FindBy(how = How.ID, using = "lupZipcode_CodeValue")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "lupZipcode_CodeDescription")
		public WebElement uIZipCodeDescriptionEdit;

		@FindBy(how = How.ID, using = "lupZipcode_imgBtn")
		public WebElement uIZipCodeLookupButton;

		@FindBy(how = How.ID, using = "txtCommonName")
		public WebElement uICommonNameEdit;

		@FindBy(how = How.ID, using = "btnVerifyGPS")
		public WebElement uIVerifyAndGetGPSButton;

		@FindBy(how = How.ID, using = "txtLatitude")
		public WebElement uILatitudeEdit;

		@FindBy(how = How.ID, using = "txtLongitute")
		public WebElement uILongituteEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveAndUseThisAddressButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelAndContinueWithUnverifiedAddressButton;

		@FindBy(how = How.ID, using = "cddIntStreetPrefix_DropDown")
		public WebElement uIIntersectionPrefixComboBox;

		@FindBy(how = How.ID, using = "txtIntStreetName")
		public WebElement uIIntersectionStreetNameEdit;

		@FindBy(how = How.ID, using = "lupIntStreetType_CodeValue")
		public WebElement uIIntersectionStreetTypeEdit;

		@FindBy(how = How.ID, using = "lupIntStreetType_imgBtn")
		public WebElement uIIntersectionStreetTypeLookupButton;

		@FindBy(how = How.ID, using = "cddIntStreetSuffix_DropDown")
		public WebElement uIIntersectionStreetSuffixComboBox;

		@FindBy(how = How.ID, using = "btnReset")
		public WebElement uIRefreshMapButton;

		@FindBy(how = How.ID, using = "lblLatLongValue")
		public WebElement uILatLongValueTextEdit;

		@FindBy(how = How.ID, using = "lupTracking_imgBtn")
		public WebElement uITrackingLookUpIcon;

		@FindBy(how = How.ID, using = "cddPremiseType_DropDown")
		public WebElement uIPremiseTypeComboBox;

		@FindBy(how = How.ID, using = "lupDist_imgBtn")
		public WebElement uIPatrolZoneLookUpIcon;

		@FindBy(how = How.ID, using = "lupFixPropUse_imgBtn")
		public WebElement uINPACardLookUpIcon;

		@FindBy(how = How.ID, using = "lupCivilDist_imgBtn")
		public WebElement uICivilDistrictLookUpIcon;

		@FindBy(how = How.ID, using = "cddVotingDist_DropDown")
		public WebElement uIVotingDistrictComboBox;

		@FindBy(how = How.ID, using = "lupTracking_CodeValue")
		public WebElement uITrackingEdit;

		@FindBy(how = How.ID, using = "lupDist_CodeValue")
		public WebElement uIPatrolZoneEdit;

		@FindBy(how = How.ID, using = "lupSubDist_CodeValue")
		public WebElement uISubZoneEdit;

		@FindBy(how = How.ID, using = "lupFixPropUse_CodeValue")
		public WebElement uINPACardEdit;

		@FindBy(how = How.ID, using = "lupCivilDist_CodeValue")
		public WebElement uICivilDistrictEdit;

	}

	public class AddressFlag {
		public WebDriver driver;

		public AddressFlag() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "adrFlags_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "txtRemark")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "cddDipsCondition_DropDown")
		public WebElement uIDisplayConditionComboBox;

		@FindBy(how = How.ID, using = "txtLastUpDate")
		public WebElement uIShowUpdatesOlderThanDaysEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNew;

		@FindBy(how = How.ID, using = "grdAddrFlags")
		public WebElement uIAddressFlagResultGrid;

		@FindBy(how = How.ID, using = "dttmActive_KPIDttmCtrl")
		public WebElement uIActiveAsDate;

		@FindBy(how = How.ID, using = "dttmInActive_KPIDttmCtrl")
		public WebElement uIInactiveAfter;

		@FindBy(how = How.ID, using = "adrFlags_cmdIncOnAddr")
		public WebElement uIAddressInfoIconButton;

	}

	public class AddressFlagEntry {
		public WebDriver driver;

		public AddressFlagEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "adrFlags_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "adrFlags_chkVerify")
		public WebElement uIAddressVerifyCheckBox;

		@FindBy(how = How.ID, using = "cstFromRange_txtFrom")
		public WebElement uIOddFromEdit;

		@FindBy(how = How.ID, using = "adrFlags_chkVerify")
		public WebElement uIchkIsCriticalCheckBox;

		@FindBy(how = How.ID, using = "cstFromRange_txtTo")
		public WebElement uIOddToEdit;

		@FindBy(how = How.ID, using = "cstToRange_txtFrom")
		public WebElement uIEvenFromEdit;

		@FindBy(how = How.ID, using = "cstToRange_txtTo")
		public WebElement uIEvenToEdit;

		@FindBy(how = How.ID, using = "rteKPITxt_contentIframe")
		public WebElement uIRemarkEdit;
		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIRemarkBody;

		@FindBy(how = How.ID, using = "lupFlags_CodeValue")
		public WebElement uITextEdit;

		@FindBy(how = How.ID, using = "lupFlags_imgBtn")
		public WebElement uITextLookupButton;

		@FindBy(how = How.ID, using = "lupFlags_imgAdd")
		public WebElement uITextEditButton;

		@FindBy(how = How.ID, using = "cddDipsCondition_DropDown")
		public WebElement uIDisplayConditionComboBox;

		@FindBy(how = How.ID, using = "txtSort")
		public WebElement uISortOrderEdit;

		@FindBy(how = How.ID, using = "dttmActive_KPIDttmCtrl")
		public WebElement uIActiveAsDateEdit;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uPrintButton;

		@FindBy(how = How.ID, using = "dttmInActive_KPIDttmCtrl")
		public WebElement uIInActiveDateEdit;

		@FindBy(how = How.ID, using = "chkIsShared")
		public WebElement uISharedCheckBox;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdFlags")
		public WebElement uIAddressFlagResultGrid;

		@FindBy(how = How.ID, using = "rteKPITxt_contentIframe")
		public WebElement uICommentsRichTextEdit;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "chkIsCritical")
		public WebElement uIIsCriticalCheckBox;

	}

	public class BatchUpdate {
		public WebDriver driver;

		public BatchUpdatePopUp batchUpdatePopup;

		public BatchUpdate() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (batchUpdatePopup == null)
				batchUpdatePopup = new BatchUpdatePopUp();
		}

		@FindBy(how = How.ID, using = "cddPrefix_DropDown")
		public WebElement uIPrefixComboBox;

		@FindBy(how = How.ID, using = "txtStreetName")
		public WebElement uIStreetNameEdit;

		@FindBy(how = How.ID, using = "lupType_CodeValue")
		public WebElement uIStreetTypeEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "chkCheckAll")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "grdBatchUpdate")
		public WebElement uIBatchUpdateResultGrid;

		@FindBy(how = How.ID, using = "lupZipCode_CodeValue")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "lupZipCode_imgBtn") // UI changed by Abi
		public WebElement uIZipCodeLookupButton;

		@FindBy(how = How.ID, using = "lupPatSubZone_CodeValue")
		public WebElement uISubZoneEdit;

		@FindBy(how = How.ID, using = "lupPatSubZone_imgBtn")
		public WebElement uIPatSubZoneLookupButton;

		@FindBy(how = How.ID, using = "lupCvlDist_CodeValue")
		public WebElement uICivilDistrictEdit;

		@FindBy(how = How.ID, using = "lupCvlDist_imgBtn")
		public WebElement uICivilDistrictLookupButton;

		@FindBy(how = How.ID, using = "lupPatrolArea_CodeValue")
		public WebElement uIPatrolZoneEdit;

//		@FindBy(how = How.ID, using = "lupPatrolAreaSelect_imgBtn")
//		public WebElement uIPatrolZoneLookupButton;

		@FindBy(how = How.ID, using = "cddPremiseType_DropDown")
		public WebElement uIPremiseTypeComboBox;

		@FindBy(how = How.ID, using = "txtCustom1")
		public WebElement uICustom1Edit;

		@FindBy(how = How.ID, using = "lupNPACard_CodeValue")
		public WebElement uINPACardEdit;

		@FindBy(how = How.ID, using = "lupNPACard_imgBtn")
		public WebElement uINPACardLookupButton;

		@FindBy(how = How.ID, using = "lupTrackSrch_CodeValue")
		public WebElement uITrackNoEdit;

		@FindBy(how = How.ID, using = "lupTrackSrch_imgBtn")
		public WebElement uITrackNoLookupButton;

		@FindBy(how = How.ID, using = "txtCensusTract")
		public WebElement uICensusTractEdit;

		@FindBy(how = How.ID, using = "cmdBatchUpdate")
		public WebElement uIUpdateButton;

		@FindBy(how = How.ID, using = "cmdReset")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "chkIntersection")
		public WebElement uIIntersectionCheckBox;

		@FindBy(how = How.ID, using = "chkAdd")
		public WebElement uIAddCheckBox;

		@FindBy(how = How.ID, using = "chkModify")
		public WebElement uIModifyCheckBox;

		@FindBy(how = How.ID, using = "chkRNBlank")
		public WebElement uIBlankRACheckBox;

		@FindBy(how = How.ID, using = "lblRecordsCount")
		public WebElement uITotalRecordsSelected;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

//		@FindBy(how = How.ID, using = "cmdUpdate")
//		public WebElement uIUpdateButtonInPopup;

//		@FindBy(how = How.ID, using = "lupZip_CodeValue")
//		public WebElement uIZipCodeInPopupEdit;

		public class BatchUpdatePopUp {

			public WebDriver driver;

			public BatchUpdatePopUp() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "lupZip_CodeValue")
			public WebElement uIZipCodeEditInPopup;

			@FindBy(how = How.ID, using = "lupZip_imgBtn")
			public WebElement uIZipCodeLookupButtonInPopup;

			@FindBy(how = How.ID, using = "lupSubZone_CodeValue")
			public WebElement uISubZoneEditInPopup;

			@FindBy(how = How.ID, using = "lupSubZone_imgBtn")
			public WebElement uISubZoneLookupButtonInPopup;

			@FindBy(how = How.ID, using = "lupCivilDist_CodeValue")
			public WebElement uICivilDistrictEditInPopup;

			@FindBy(how = How.ID, using = "lupCivilDist_imgBtn")
			public WebElement uICivilDistrictLookupButtonInPopup;

			@FindBy(how = How.ID, using = "lupPatrolAreaSelect_CodeValue")
			public WebElement uIPatrolZoneEditInPopup;

			@FindBy(how = How.ID, using = "lupPatrolAreaSelect_imgBtn")
			public WebElement uIPatrolZoneLookupButtonInPopup;

			@FindBy(how = How.ID, using = "cddPremiseType_DropDown")
			public WebElement uIPremiseTypeComboBoxInPopup;

			@FindBy(how = How.ID, using = "txtCustom1")
			public WebElement uICustom1EditInPopup;

			@FindBy(how = How.ID, using = "lupURACard_CodeValue")
			public WebElement uINPACardEditInPopup;

			@FindBy(how = How.ID, using = "lupURACard_imgBtn")
			public WebElement uINPACardLookupButtonInPopup;

			@FindBy(how = How.ID, using = "lupTrack_CodeValue")
			public WebElement uITrackNoEditInPopup;

			@FindBy(how = How.ID, using = "lupTrack_imgBtn")
			public WebElement uITrackNoLookupButtonInPopup;

			@FindBy(how = How.ID, using = "txtCensusTract")
			public WebElement uICensusTractEditInPopup;

			@FindBy(how = How.ID, using = "cmdUpdate")
			public WebElement uIUpdateButtonInPopup;

			@FindBy(how = How.ID, using = "cmdReset")
			public WebElement uIResetButtonInPopup;

			@FindBy(how = How.ID, using = "chkAdd")
			public WebElement uIAddCheckBoxInPopup;

			@FindBy(how = How.ID, using = "chkModify")
			public WebElement uIModifyCheckBoxInPopup;

			@FindBy(how = How.ID, using = "lupPatrolAreaSelect_CodeValue")
			public WebElement uIDistrictEdit;

			@FindBy(how = How.ID, using = "lupURACard_CodeValue")
			public WebElement uISubDistrictEdit;
		}
	}

	public class HazMatFlags {
		public WebDriver driver;

		public HazMatFlags() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "adrLocation_chkVerify")
		public WebElement uILocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "lupDotID_CodeValue")
		public WebElement uIChemicalNameEdit;

		@FindBy(how = How.ID, using = "txtSystemID")
		public WebElement uISystemIDNoEdit;

		@FindBy(how = How.ID, using = "lupDotID_imgBtn")
		public WebElement uIChemicalNameLookupButton;

		@FindBy(how = How.ID, using = "cddLocationCode_DropDown")
		public WebElement uIGeneralLocationComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdHazMatFlag")
		public WebElement uIHazMatFlagResultGrid;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInactiveCheckBox;

	}

	public class HazMatFlagEntry {
		public WebDriver driver;
		public ChemicalsTab chemicalsTab;
		public LocationRemarksTab locationRemarksTab;

		public HazMatFlagEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.chemicalsTab == null))
				this.chemicalsTab = new ChemicalsTab();

			if (this.locationRemarksTab == null)
				this.locationRemarksTab = new LocationRemarksTab();
		}

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Chemicals')])")
		public WebElement uIChemicalsTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Location Remark')])")
		public WebElement uILocationRemarkTab;
		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']")
		public WebElement uIFooterStatusBar;

	}

	public class ChemicalsTab {
		public WebDriver driver;

		public ChemicalsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_lupDotID_CodeValue")
		public WebElement uIChemicalNameEdit;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_cddLocationCode_DropDown")
		public WebElement uIGeneralLocationComboBox;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_lupContType_CodeValue")
		public WebElement uIContainerTypeEdit;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_lupcapacityunits_CodeValue")
		public WebElement uICapacityUnitsEdit;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_txtContCapacity")
		public WebElement uIContainerCapacityUnitsEdit;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_grdChemical")
		public WebElement uIChemicalsTabResultGrid;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_ImgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "tabHazMat_tmpl0_UsrChemicals1_dttmDelDttm_KPIDttmCtrl")
		public WebElement uIInactiveDateEdit;
	}

	public class LocationRemarksTab {
		public WebDriver driver;

		public LocationRemarksTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabHazMat_tmpl1_UsrLocationRemark1_rteKPITxt_contentIframe")
		public WebElement uIRichTextFrame;

		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIRichTextBody;

	}

	public class HydrantSearch {
		public WebDriver driver;

		public HydrantSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtHydrantNbr")
		public WebElement uIHydantIDEdit;

		@FindBy(how = How.ID, using = "chkOutofService")
		public WebElement uIOutofServiceCheckBox;

		@FindBy(how = How.ID, using = "chkIsDryHydrant")
		public WebElement uIDryHydrantCheckBox;

		@FindBy(how = How.ID, using = "txtGridNbr")
		public WebElement uIWaterGridNoEdit;

		@FindBy(how = How.ID, using = "txtSize")
		public WebElement uISizeEdit;

		@FindBy(how = How.ID, using = "cddHydrantClass_DropDown")
		public WebElement uIHydrantClassComboBox;

		@FindBy(how = How.ID, using = "lsLocationSearch_CddLocationType")
		public WebElement uILocationComboBox;

		@FindBy(how = How.ID, using = "lsLocationSearch_adrAddrsCtrl_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "lsLocationSearch_adrAddrsCtrl_chkVerify")
		public WebElement uILocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "cddInspectZone_DropDown")
		public WebElement uIHydrantZoneComboBox;

		@FindBy(how = How.ID, using = "cddModel_DropDown")
		public WebElement uIModelComboBox;

		@FindBy(how = How.ID, using = "txtMainSize")
		public WebElement uIMainSizeEdit;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearch;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNew;

		@FindBy(how = How.ID, using = "grdHydrant")
		public WebElement uIHydrantResultGrid;

		@FindBy(how = How.ID, using = "lsLocationSearch_CddLocationType")
		public WebElement uILocationCombobox;

		@FindBy(how = How.ID, using = "lsLocationSearch_TxtStreetName")
		public WebElement uIStreetEdit;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIcon;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_excel.gif']")
		public WebElement uIExcelIcon;
	}

	public class HydrantEntry {
		public WebDriver driver;
		public SpecificationTab specificationTab;

		public HydrantEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.specificationTab == null)) {
				this.specificationTab = new SpecificationTab();
			}
		}

		@FindBy(how = How.ID, using = "txtHydrantNbr")
		public WebElement uIHydantIDEdit;

		@FindBy(how = How.ID, using = "txtGridNbr")
		public WebElement uIWaterGridNoEdit;

		@FindBy(how = How.ID, using = "chkIsRestrict")
		public WebElement uIRestrictCheckBox;

		@FindBy(how = How.ID, using = "chkIsDryHydrant")
		public WebElement uIDryHydrantCheckBox;

		@FindBy(how = How.ID, using = "cddModel_DropDown")
		public WebElement uIModelComboBox;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "dttmInstallDttm_KPIDttmCtrl")
		public WebElement uIInstallDateEdit;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uINearestAddressEdit;

		@FindBy(how = How.XPATH, using = "(//span/b[contains(text(),'Specification')])")
		public WebElement uISpecificationTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Activity')])")
		public WebElement uIActivityTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Remarks')])")
		public WebElement uIRemarksTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Map')])")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachment')])")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;
		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']")				// Added by Abi
		public WebElement uIFooterStatusBar;
	}

	public class SpecificationTab {
		public WebDriver driver;

		public SpecificationTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_TxtCoefficient")
		public WebElement uICoefficientEdit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_CddOrficeType_DropDown")
		public WebElement uIOrificeTypeComboBox;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtSizeOutlet1")
		public WebElement uISizeOutletDiameterD1Edit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtSizeOutlet2")
		public WebElement uISizeOutletDiameterD2Edit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtSizeOutlet3")
		public WebElement uISizeOutletDiameterD3Edit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtStaticPress")
		public WebElement uIStaticPressureEdit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtResidPres")
		public WebElement uIResidualPressureEdit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtPitotPres")
		public WebElement uIPitotPressureEdit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtCalculatedFlow")
		public WebElement uICalculatedFlowEdit;

		@FindBy(how = How.ID, using = "tabHydrantEntry_tmpl0_UsrSpec2_txtAvailableFlow")
		public WebElement uIAvailableFlowEdit;

	}

	public class WeatherScreen {

		public WebDriver driver;

		public WeatherScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "Label1")
		public WebElement uITitleTextView;

		@FindBy(how = How.ID, using = "lblLoc")
		public WebElement uILocationTextView;

		@FindBy(how = How.ID, using = "lblTemp")
		public WebElement uITempTextView;

	}

	public class ContactEntryScreen {
		public WebDriver driver;

		public ContactEntryScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lblLocName")
		public WebElement uILocationTextView;

		@FindBy(how = How.ID, using = "cddRelation_Input")
		public WebElement uIRelationInputComboBox;

		@FindBy(how = How.ID, using = "cddRelation_DropDown")
		public WebElement uIRelationComboBox;

		@FindBy(how = How.ID, using = "radBusiness")
		public WebElement uINameTypeBusinessRadioButton;

		@FindBy(how = How.ID, using = "chkIsPrimary")
		public WebElement uIPrimaryContactCheckBox;

		@FindBy(how = How.ID, using = "radPerson")
		public WebElement uINameTypePersonRadioButton;

		@FindBy(how = How.ID, using = "txtNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "AddressCtrl2_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "custHeaderCSZ_City")
		public WebElement uICSZEdit;

		@FindBy(how = How.ID, using = "txtAType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtAID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneType_DropDown")
		public WebElement uIPhoneType1ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneNumber")
		public WebElement uIPhoneNumber1Edit;

		@FindBy(how = How.ID, using = "txtNotes_1")
		public WebElement uINotes1Edit;

		@FindBy(how = How.ID, using = "imgRemove_1")
		public WebElement uIDeleteicon1Button;

		@FindBy(how = How.ID, using = "chkInactive_1")
		public WebElement uIInactive1CheckBox;

		@FindBy(how = How.ID, using = "txtNumber_2_PhoneType_DropDown")
		public WebElement uIPhoneType2ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_2_PhoneNumber")
		public WebElement uIPhoneNumber2Edit;

		@FindBy(how = How.ID, using = "txtNotes_2")
		public WebElement uINotes2Edit;

		@FindBy(how = How.ID, using = "imgRemove_2")
		public WebElement uIDeleteicon2Button;

		@FindBy(how = How.ID, using = "chkInactive_2")
		public WebElement uIInactive2CheckBox;

		@FindBy(how = How.ID, using = "txtNumber_3_PhoneType_DropDown")
		public WebElement uIPhoneType3ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_3_PhoneNumber")
		public WebElement uIPhoneNumber3Edit;

		@FindBy(how = How.ID, using = "txtNotes_3")
		public WebElement uINotes3Edit;

		@FindBy(how = How.ID, using = "imgRemove_3")
		public WebElement uIDeleteicon3Button;

		@FindBy(how = How.ID, using = "chkInactive_3")
		public WebElement uIInactive3CheckBox;

		@FindBy(how = How.ID, using = "AddMorePhoneNumber")
		public WebElement uIAddMorePhoneNumberButton;

		@FindBy(how = How.ID, using = "txtEmail")
		public WebElement uIEmailEdit;

		@FindBy(how = How.ID, using = "txtNotes1")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "txtSSN")
		public WebElement uISSNEINNoEdit;

		@FindBy(how = How.ID, using = "txtContactOrder")
		public WebElement uIContactOrderEdit;

		@FindBy(how = How.ID, using = "dttmInActive_KPIDttmCtrl")
		public WebElement uIInActiveDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "lblLocName")
		public WebElement uIContactGroupEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "chkIsKGIS")
		public WebElement uINotSharedCheckBox;

		@FindBy(how = How.ID, using = "chkIsdisasosiate")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "cddRelation_Arrow")
		public WebElement uINameRelationDropDownArrow;

		@FindBy(how = How.ID, using = "cddContactGroup_DropDown")
		public WebElement uIContactGroupComboBox;

	}

	public class ContactSearch {
		public WebDriver driver;

		public ContactSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "adrAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewLink;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdContact")
		public WebElement uIContactSearchResultGrid;

	}

	public class GeoContactNewEntry {
		public WebDriver driver;

		public GeoContactNewEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdContacts")
		public WebElement uIContactsTabResultTable;

		@FindBy(how = How.ID, using = "AddressCtrl2_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "btnAddnew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "chkIncludeExpired")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneType_DropDown")
		public WebElement uIPhoneType1ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneNumber")
		public WebElement uIPhoneNumber1Edit;

		@FindBy(how = How.ID, using = "txtNotes_1")
		public WebElement uINotes1Edit;

		@FindBy(how = How.ID, using = "imgRemove_1")
		public WebElement uIDeleteicon1Button;

		@FindBy(how = How.ID, using = "txtNumber_2_PhoneType_DropDown")
		public WebElement uIPhoneType2ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_2_PhoneNumber")
		public WebElement uIPhoneNumber2Edit;

		@FindBy(how = How.ID, using = "txtNotes_2")
		public WebElement uINotes2Edit;

		@FindBy(how = How.ID, using = "imgRemove_2")
		public WebElement uIDeleteicon2Button;

		@FindBy(how = How.ID, using = "txtNumber_3_PhoneType_DropDown")
		public WebElement uIPhoneType3ComboBox;

		@FindBy(how = How.ID, using = "txtNumber_3_PhoneNumber")
		public WebElement uIPhoneNumber3Edit;

		@FindBy(how = How.ID, using = "txtNotes_3")
		public WebElement uINotes3Edit;

		@FindBy(how = How.ID, using = "imgRemove_3")
		public WebElement uIDeleteicon3Button;

		@FindBy(how = How.ID, using = "AddMorePhoneNumber")
		public WebElement uIAddMorePhoneNumberButton;
	}

	public class HydrantTest {
		public WebDriver driver;

		public HydrantTest() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtHydrantNbr")
		public WebElement uIHydrantIDEdit;

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uINearestAddressEdit;

		@FindBy(how = How.ID, using = "CddActType")
		public WebElement uIActivityTypeComboBox;

		@FindBy(how = How.ID, using = "dttmActivityFrmDttm_Date_KPIDttmCtrl")
		public WebElement uIActivityDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttmActivityFrmDttm_Time']//input")
		public WebElement uIActivityFromTimeEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tmActivityFrmEndHours_Time']//input")
		public WebElement uIActivityToTimeEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "chkReferToFPB")
		public WebElement uIReferToFPBCheckBox;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar'/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class MapLayerEntry {
		public WebDriver driver;

		public MapLayerEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cddLayerType_DropDown")
		public WebElement uILayerTypeComboBox;

		@FindBy(how = How.ID, using = "cddMapType")
		public WebElement uILayerNameComboBox;

		@FindBy(how = How.ID, using = "txtPointName")
		public WebElement uIFeatureNameEdit;

		@FindBy(how = How.ID, using = "adrLocation_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "chkIsFire")
		public WebElement uIIsFireChkBox;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIInactiveChkBox;

		@FindBy(how = How.ID, using = "txtInactive")
		public WebElement uIInactiveDate;

		@FindBy(how = How.XPATH, using = "//span[text()='Attachments']")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Remarks']")
		public WebElement uIRemarksTab;

		@FindBy(how = How.ID, using = "tabMapPointEntry_tmpl0_UsrRemarks2_rteKPITxt_contentIframe")
		public WebElement uIRemarksTxtFieldFrame;

		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIRemarksTxtBody;

		@FindBy(how = How.ID, using = "chkGeoFence")
		public WebElement uIIsGeoFenceChkBox;

	}

	public class RealAddressHelpWindow {
		public WebDriver driver;

		public RealAddressHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='grdRealAddress']")
		public WebElement uIRealAddressTable;
	}

	public class UpdateGeoCode {
		public WebDriver driver;

		public UpdateGeoCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lsLocationSearch_adrAddrsCtrl_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "grdLatLong")
		public WebElement uIUpdateGeoCodeTable;

	}

	public class MapLayerSearch {
		public WebDriver driver;

		public MapLayerSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[text()='Add New']")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cddLayerType_DropDown")
		public WebElement uILayerTypeComboBox;

		@FindBy(how = How.ID, using = "cddMapType")
		public WebElement uILayerNameComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "ChkIncFire")
		public WebElement uIIncludeFireChkBox;

		@FindBy(how = How.XPATH, using = "//div[@id='grdMapPoints']")
		public WebElement uIMapLayerTable;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeInactiveCheckBox;

	}

	public class AVLReplay {
		public WebDriver driver;

		public AVLReplay() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//input[@id='dttFrom_Date_KPIDttmCtrl']")
		public WebElement uIFromDate;

		@FindBy(how = How.XPATH, using = "//table[@id='dttFrom_Time']//input")
		public WebElement uIFromTime;

		@FindBy(how = How.ID, using = "dttTo_Date_KPIDttmCtrl")
		public WebElement uIToDate;

		@FindBy(how = How.XPATH, using = "//table[@id ='dttTo_Time']//input")
		public WebElement uIToTime;

		@FindBy(how = How.ID, using = "btnShowUnits")
		public WebElement uIShowUnitsButton;

		@FindBy(how = How.ID, using = "btnPolygon")
		public WebElement uIPolygonButton;

		@FindBy(how = How.ID, using = "MapPanel")
		public WebElement uIMapPanel;

		@FindBy(how = How.XPATH, using = "//input[@value='Reset']")
		public WebElement uIResetButton;
	}

	public class AddressIntersection2040UpdateLatLongWindow {

		public WebDriver driver;

		public AddressIntersection2040UpdateLatLongWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnMap")
		public WebElement uIMapButton;

		@FindBy(how = How.ID, using = "btnGetLatiLongi")
		public WebElement uIGetButton;

		@FindBy(how = How.ID, using = "btnAutoCalculate")
		public WebElement uIAddCalculateButton;

	}

	public class ZipCode {

		public WebDriver driver;

		public ZipCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtCity")
		public WebElement uICityCodeEdit;

		@FindBy(how = How.ID, using = "cddState_DropDown")
		public WebElement uIStateDropDown;

		@FindBy(how = How.ID, using = "txtZIP")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdZip")
		public WebElement uIZipcodeResultTable;

		@FindBy(how = How.ID, using = "chkIsFrequent")
		public WebElement uIIsFrequentCheckBox;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIIncludeActiveCheckBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

	}

	public class PremiseHelpWindow {
		public WebDriver driver;

		public PremiseHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtLocation")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "txtPremise")
		public WebElement uIPremiseEdit;

		@FindBy(how = How.ID, using = "cmdLoad")
		public WebElement uIUseThisPremiseButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelAndReEnterAddressButton;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddThisPremiseToGeoButton;

		@FindBy(how = How.ID, using = "cmdDetail")
		public WebElement uIShowDetailButton;

		@FindBy(how = How.ID, using = "grdRealAddress")
		public WebElement uIPremiseTable;

		@FindBy(how = How.ID, using = "txtPremise")
		public WebElement uIValidPremiseEdit;

		@FindBy(how = How.ID, using = "lblNextMaxPremise")
		public WebElement uINextMaximPremise;

	}

	public class AddressIntersectionHelpWindow {
		public WebDriver driver;

		public AddressIntersectionHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtFirstStreet")
		public WebElement uIFirstStreetEdit;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelReEnterButton;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddIntersectionButton;

		@FindBy(how = How.ID, using = "grdIntersection")
		public WebElement uIIntersectionTable;

	}

	public class ZipCodeEntry {
		public WebDriver driver;

		public ZipCodeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtZIP")
		public WebElement uIZipCodeEdit;

		@FindBy(how = How.ID, using = "cddState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "txtCity")
		public WebElement uICityEdit;

		@FindBy(how = How.ID, using = "cddLocType_DropDown")
		public WebElement uILocaionTypeComboBox;

		@FindBy(how = How.ID, using = "txtLocDesc")
		public WebElement uILocationNameEdit;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "chkFrequent")
		public WebElement uIIsFrequentCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

	}

}
