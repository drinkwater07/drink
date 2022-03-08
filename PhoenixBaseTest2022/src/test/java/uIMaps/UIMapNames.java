package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapNames {

	public ArrestEntry arrestEntry;
	public NameEntry nameEntry;
	public NameSearch nameSearch;
	public ArrestSearch arrestSearch;
	public NameSearchHelpWindow nameSearchHelpWindow;
	public NameMerge nameMerge;
	public ExpungementSearch expungementSearch;
	public Expungement expungement;
	public FISearch fISearch;
	public FIEntry fIEntry;
	public GunPermitEntry gunPermitEntry;
	public GunPermitSearch gunPermitSearch;
	public DictionarytSearch dictionarytSearch;
	public DictionaryEntry dictionaryEntry;
	public SuspectEntry suspectEntry;

	public SuspectSearch suspectSearch;
	public NameMining nameMining;
	public NameSearchPopupScreen nameSearchPopupScreen;
	public NamesComments namesComments;
	public SocialMediaSites socialMediaSites;
	public SocialMediaSitesEntry socialMediaSitesEntry;
	public SocialMediaSearch socialMediaSearch;
	public CellStatus cellStatus;
	public CellStatusArrestEntry cellStatusArrestEntry;
	public AdditionalNumberScreen additionalNumberScreen;
	public NameMapScreen nameMapScreen;
	public PhotoLineupEntry photoLineupEntry;
	public BuildPhotoLineup buildPhotoLineup;
	public LineupSearch lineupSearch;
	public ContactEntry contactEntry;
	public GangSearch gangSearch;
	public GangMasterEntry gangMasterEntry;
	public GangDetailEntry gangDetailEntry;
	public ArrestSearchHelpWindow arrestSearchHelpWindow;
	public QuickName quickName;
	public IncidentNames incidentNames;
	public SocialMediaTabs socialMediaTabs;
	public ArrestEntryForCharge arrestEntryForCharge;
	public ArrestExpungement arrestExpungement;
	public ExpungementSearchLegacyWindow expungementSearchLegacyWindow;
	public PhotoLineupReportWindow photoLineupReportWindow;
	public OffenderSearch offenderSearch;
	public OffenderEntry offenderEntry;

	public UIMapNames() {
		if (this.arrestEntry == null)
			this.arrestEntry = new ArrestEntry();
		if (this.nameEntry == null)
			this.nameEntry = new NameEntry();
		if (this.nameSearch == null)
			this.nameSearch = new NameSearch();
		if (this.arrestSearch == null)
			this.arrestSearch = new ArrestSearch();
		if (this.nameSearchHelpWindow == null)
			this.nameSearchHelpWindow = new NameSearchHelpWindow();
		if (this.nameMerge == null)
			this.nameMerge = new NameMerge();
		if (this.expungementSearch == null)
			this.expungementSearch = new ExpungementSearch();
		if (this.expungement == null)
			this.expungement = new Expungement();
		if (this.fISearch == null)
			this.fISearch = new FISearch();
		if (this.gunPermitEntry == null)
			this.gunPermitEntry = new GunPermitEntry();
		if (this.gunPermitSearch == null)
			this.gunPermitSearch = new GunPermitSearch();
		if (this.suspectEntry == null)
			this.suspectEntry = new SuspectEntry();
		if (this.suspectSearch == null)
			this.suspectSearch = new SuspectSearch();
		if (this.nameMining == null)
			this.nameMining = new NameMining();
		if (this.nameSearchPopupScreen == null)
			this.nameSearchPopupScreen = new NameSearchPopupScreen();
		if (this.namesComments == null)
			this.namesComments = new NamesComments();
		if (this.socialMediaSites == null)
			this.socialMediaSites = new SocialMediaSites();
		if (this.socialMediaSitesEntry == null)
			this.socialMediaSitesEntry = new SocialMediaSitesEntry();
		if (this.socialMediaSearch == null)
			this.socialMediaSearch = new SocialMediaSearch();
		if (this.cellStatus == null)
			this.cellStatus = new CellStatus();
		if (this.cellStatusArrestEntry == null)
			this.cellStatusArrestEntry = new CellStatusArrestEntry();
		if (this.additionalNumberScreen == null)
			this.additionalNumberScreen = new AdditionalNumberScreen();
		if (this.nameMapScreen == null)
			this.nameMapScreen = new NameMapScreen();
		if (this.photoLineupEntry == null)
			this.photoLineupEntry = new PhotoLineupEntry();
		if (this.buildPhotoLineup == null)
			this.buildPhotoLineup = new BuildPhotoLineup();
		if (this.lineupSearch == null)
			this.lineupSearch = new LineupSearch();
		if (this.contactEntry == null)
			this.contactEntry = new ContactEntry();
		if (this.gangSearch == null)
			this.gangSearch = new GangSearch();
		if (this.gangMasterEntry == null)
			this.gangMasterEntry = new GangMasterEntry();
		if (this.gangDetailEntry == null)
			this.gangDetailEntry = new GangDetailEntry();
		if (this.arrestSearchHelpWindow == null)
			this.arrestSearchHelpWindow = new ArrestSearchHelpWindow();
		if (this.quickName == null)
			this.quickName = new QuickName();
		if (this.incidentNames == null)
			this.incidentNames = new IncidentNames();
		if (this.socialMediaTabs == null)
			this.socialMediaTabs = new SocialMediaTabs();
		if (this.arrestEntryForCharge == null)
			this.arrestEntryForCharge = new ArrestEntryForCharge();
		if (this.arrestExpungement == null)
			this.arrestExpungement = new ArrestExpungement();

		if (expungementSearchLegacyWindow == null)
			expungementSearchLegacyWindow = new ExpungementSearchLegacyWindow();
		if (photoLineupReportWindow == null)
			photoLineupReportWindow = new PhotoLineupReportWindow();
		if (offenderSearch == null)
			offenderSearch = new OffenderSearch();
		if (offenderEntry == null)
			offenderEntry = new OffenderEntry();
	}

	public class NameSearch {
		public WebDriver driver;

		public NameSearchAdvancedTab nameSearchAdvancedTab;
		public NameSearchMOTab nameSearchMOTab;
		public NameSearchQAFormTab nameSearchQAFormTab;

		public NameSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.nameSearchAdvancedTab == null)) {
				this.nameSearchAdvancedTab = new NameSearchAdvancedTab();
			}

			if ((this.nameSearchMOTab == null)) {
				this.nameSearchMOTab = new NameSearchMOTab();
			}

			if ((this.nameSearchQAFormTab == null)) {
				this.nameSearchQAFormTab = new NameSearchQAFormTab();
			}

		}

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_cddNameType_DropDown")
		public WebElement uINameTypeComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtMiddleName")
		public WebElement uIMiddleNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtNameID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_chkSound")
		public WebElement uISoundLikeCheckBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_chkNickName")
		public WebElement uINickNameCheckBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Refresh')])")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Show Map')])")
		public WebElement uIShowMapButton;

		@FindBy(how = How.ID, using = "cmdNameMine")
		public WebElement uINameMineImage;

		@FindBy(how = How.ID, using = "chkRptSelect")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "grdNames")
		public WebElement uIResultTable;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Basic')])")
		public WebElement uIBasicTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Advanced')])")
		public WebElement uIAdvancedTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'MO')])")
		public WebElement uIMOTab;

		@FindBy(how = How.XPATH, using = "(//span[text()='QA Form']")
		public WebElement uIQAFormTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Business')])")
		public WebElement uIBusinessTab;

		@FindBy(how = How.XPATH, using = "//table[@class ='NameActivitySrch']")
		public WebElement uINameActivityMouseover;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "NameReportList_ItemsCount")
		public WebElement uINameItemCountTextView;

		@FindBy(how = How.ID, using = "NameReportList_ImgClearAll")
		public WebElement uINameItemCountClearIcon;

		@FindBy(how = How.ID, using = "grdNames_ctl00_lnkbtnNext")
		public WebElement uINextLink;

		@FindBy(how = How.ID, using = "grdNames_ctl00_lnkbtnPrev")
		public WebElement uIPrevLink;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_cddPatrolArea_DropDown")
		public WebElement uIPatrolAreaComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_cddFlag")
		public WebElement uIFlagComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_cddFlag_Input")
		public WebElement uIFlagRadControlComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_chkPrimaryName")
		public WebElement uIPrimaryNameOnlyCheckBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Switch View')])")
		public WebElement uISwitchViewButton;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_dtcDOB_KPIDttmCtrl")
		public WebElement uIDOBEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_adrNameAddress_CddLocationType")
		public WebElement uIAddressComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_adrNameAddress_TxtStartPremise")
		public WebElement uIPremiseEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_adrNameAddress_TxtStreetName")
		public WebElement uIStreetEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_adrNameAddress_adrAddrsCtrl_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_adrNameAddress_adrAddrsCtrl_chkVerify")
		public WebElement uIAddressVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_mskTelephone")
		public WebElement uITelephoneEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtCity")
		public WebElement uICityEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_adrNameAddress_adrAddrsCtrl_cmdIncOnAddr")
		public WebElement uIAddressInfoIcon;

		@FindBy(how = How.ID, using = "cmdNameMine")
		public WebElement uINameMineIcon;

		@FindBy(how = How.ID, using = "cmdPhotBook")
		public WebElement uIPhotoBooIcon;

	}

	public class NameSearchAdvancedTab {
		public WebDriver driver;

		public NameSearchAdvancedTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_mskSSNo")
		public WebElement uISSNumberEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_txtState")
		public WebElement uIStateNumberEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_txtLegacyRef")
		public WebElement uILegacyRefNo1Edit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_txtLegacyRefTwo")
		public WebElement uILegacyRefNo2Edit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_chkLatLong")
		public WebElement uIShowOnlytheRecordsLatLongCheckbox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_dttFrom_Date_KPIDttmCtrl")
		public WebElement uINameEnteredFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabNameSrch_tmpl1_UsrNameSrchAdv1_dttFrom_Time']//input")
		public WebElement uINameEnteredFromTimeEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_dttTo_Date_KPIDttmCtrl")
		public WebElement uINameEnteredToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabNameSrch_tmpl1_UsrNameSrchAdv1_dttTo_Time']//input")
		public WebElement uINameEnteredToTimeEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_imgClear")
		public WebElement uIDateClearButton;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_cddEthnicity_DropDown")
		public WebElement uIEthnicityComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_txtPlateNbr")
		public WebElement uIPlateNoEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_cddState_DropDown")
		public WebElement uIPlateStateComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl1_UsrNameSrchAdv1_mskSSNo")
		public WebElement uISSNoEdit;
	}

	public class NameSearchMOTab {

		public WebDriver driver;

		public NameSearchMOTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl2_UsrSrchNameMO1_cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl2_UsrSrchNameMO1_cddCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl2_UsrSrchNameMO1_cddDetail_DropDown")
		public WebElement uIDetailsComboBox;
	}

	public class NameSearchQAFormTab {
		public WebDriver driver;

		public NameSearchQAFormTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl5_usrQASrchScreen1_cddForm")
		public WebElement uISelectFormComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl5_usrQASrchScreen1_chkInactive")
		public WebElement uIIncludeOnlyFormsCheckBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl5_usrQASrchScreen1_txtsrchName")
		public WebElement uISearchWords;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl5_usrQASrchScreen1_DttmFrom_Date_KPIDttmCtrl")
		public WebElement uIFromDate;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl5_usrQASrchScreen1_DttmEnd_Date_KPIDttmCtrl")
		public WebElement uIToDate;

	}

	public class NameSearchHelpWindow {

		public WebDriver driver;

		public NameSearchHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_cddNameType_DropDown")
		public WebElement uINameTypeComboBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtMiddleName")
		public WebElement uIMiddleNameEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_txtNameID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_chkSound")
		public WebElement uISoundLikeCheckBox;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_chkNickName")
		public WebElement uINickNameCheckBox;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Switch View')])")
		public WebElement uISwitchViewButton;

		@FindBy(how = How.ID, using = "cmdNameMine")
		public WebElement uINameMineImage;

		@FindBy(how = How.ID, using = "chkRptSelect")
		public WebElement uISelectAllCheckBox;

		// Resutl Screen UI collections

		@FindBy(how = How.XPATH, using = "//span[@title='SelectName']")
		public WebElement uISelectNameButton;

		@FindBy(how = How.ID, using = "grdNames")
		public WebElement uIResultTable;

		@FindBy(how = How.ID, using = "grdRptName")
		public WebElement uIIncidentNameResultTable;

		@FindBy(how = How.ID, using = "grdCBEReports")
		public WebElement uIIncidentActivityResultTable;

		@FindBy(how = How.ID, using = "btnIncName")
		public WebElement uISelectIncidentNameButton;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_UsrNameSrchBasic1_lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "cmdCopy")
		public WebElement uICopyButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "grdCBEReports_it1_0_chkSelect")
		public WebElement uIIncidentNameActivity0CheckBox;

		@FindBy(how = How.ID, using = "grdCBEReports_it1_1_chkSelect")
		public WebElement uIIncidentNameActivity1CheckBox;
	}

	public class NameSearchPopupScreen {

		public WebDriver driver;

		public NameSearchPopupScreen() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnSelect")
		public WebElement uISelectNameButton;

		@FindBy(how = How.ID, using = "grdNames")
		public WebElement uINameTable;

	}

	public class NameEntry {
		public WebDriver driver;

		public NameEntryMainTab nameEntryMainTab;
		public PhysicalTab physicalTab;
		public ActivityTab activityTab;
		public NameEntryFlagTab nameEntryFlagTab;
		public EmpSchoolTab empSchoolTab;
		public FamilyTab familyTab;
		public InfoTab infoTab;
		public GangTab gangTab;
		public AssociateTab associateTab;
		public VisitorsTab visitorsTab;
		public BNameVerifyScreen bNameVerifyScreen;
		public NameEntryMapTab nameEntryMapTab;
		public PhoneTab phoneTab;
		public AlaisTab alaisTab;
		public NameEntryAddressesTab nameEntryAddressesTab;
		public BusinessTab businessTab;
		public NameEntryContactsTab nameEntryContactsTab;
		public NameEntryCommentsTab nameEntryCommentsTab;
		public SocialMediaTab socialMediaTab;
		public DNATab dNATab;
		public NameEntryHistoryTab nameEntryHistoryTab;
		public NameEntryVehicleTab nameEntryVehicleTab;
		public NameEntryMJTab nameEntryMJTab;

		public NameEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.nameEntryMainTab == null)) {
				this.nameEntryMainTab = new NameEntryMainTab();
			}
			if ((this.physicalTab == null)) {
				this.physicalTab = new PhysicalTab();
			}
			if ((this.activityTab == null)) {
				this.activityTab = new ActivityTab();
			}
			if ((this.nameEntryFlagTab == null)) {
				this.nameEntryFlagTab = new NameEntryFlagTab();
			}
			if ((this.empSchoolTab == null)) {
				this.empSchoolTab = new EmpSchoolTab();
			}
			if ((this.familyTab == null)) {
				this.familyTab = new FamilyTab();
			}
			if ((this.infoTab == null)) {
				this.infoTab = new InfoTab();
			}
			if ((this.associateTab == null)) {
				this.associateTab = new AssociateTab();
			}
			if ((this.gangTab == null)) {
				this.gangTab = new GangTab();
			}
			if ((this.visitorsTab == null)) {
				this.visitorsTab = new VisitorsTab();
			}

			if ((this.nameEntryMapTab == null)) {
				this.nameEntryMapTab = new NameEntryMapTab();
			}
			if ((this.phoneTab == null)) {
				this.phoneTab = new PhoneTab();
			}

			if ((this.alaisTab == null)) {
				this.alaisTab = new AlaisTab();
			}
			if ((this.businessTab == null)) {
				this.businessTab = new BusinessTab();
			}
			if ((this.nameEntryAddressesTab == null)) {
				this.nameEntryAddressesTab = new NameEntryAddressesTab();
			}
			if ((this.nameEntryCommentsTab == null)) {
				this.nameEntryCommentsTab = new NameEntryCommentsTab();
			}
			if ((this.nameEntryContactsTab == null)) {
				this.nameEntryContactsTab = new NameEntryContactsTab();
			}
			if ((this.bNameVerifyScreen == null)) {
				this.bNameVerifyScreen = new BNameVerifyScreen();
			}

			if ((this.socialMediaTab == null)) {
				this.socialMediaTab = new SocialMediaTab();
			}
			if ((this.dNATab == null)) {
				this.dNATab = new DNATab();
			}
			if ((this.nameEntryHistoryTab == null)) {
				this.nameEntryHistoryTab = new NameEntryHistoryTab();
			}
			if ((this.nameEntryVehicleTab == null)) {
				this.nameEntryVehicleTab = new NameEntryVehicleTab();
			}
			if ((this.nameEntryMJTab == null)) {
				this.nameEntryMJTab = new NameEntryMJTab();
			}

		}

		@FindBy(how = How.ID, using = "txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "custNames_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "custNames_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
		public WebElement uIMainAddressEdit;

		@FindBy(how = How.ID, using = "adrMainAddress_chkVerify")
		public WebElement uIChkVerifyCheckBox;

		@FindBy(how = How.ID, using = "adrMainAddress_cmdIncOnAddr")
		public WebElement uIAddressInfoIconButton;

		@FindBy(how = How.ID, using = "imgWantBtn")
		public WebElement uIWarrantIconButton;

		@FindBy(how = How.ID, using = "dtcDeceased_KPIDttmCtrl")
		public WebElement uIDeceasedDateEdit;

		@FindBy(how = How.ID, using = "dtcDeceased_KPIDttmCtrl")
		public WebElement uIDefunctDateEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdNameMine")
		public WebElement uINameMineButton;

		@FindBy(how = How.ID, using = "imgMap")
		public WebElement uIMapIconButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "alcName")
		public WebElement uIALCButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tlbContextMenu']//img[@src = '/KPIImages/ico/Customize_1.png']")
		public WebElement uICustomIconButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Physical')]")
		public WebElement uIPhysicalTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Addresses')]")
		public WebElement uIAddressTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Activity']")
		public WebElement uIActivityTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Flag')]")
		public WebElement uINameFlagTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Emp/School')]")
		public WebElement uIEmpSchoolTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Family')]")
		public WebElement uIFamilyTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Info')]")
		public WebElement uIInfoTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Gang')]")
		public WebElement uIGangTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Associates')]")
		public WebElement uIAssociatesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Visitors')]")
		public WebElement uIVisitorsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Map')]")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Phones')]")
		public WebElement uIPhonesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Alias')]")
		public WebElement uIAliasTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Business')]")
		public WebElement uIBusinessTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Contacts')]")
		public WebElement uIContactsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Social Media')]")
		public WebElement uISocialMediaTab;

		// @FindBy(how = How.XPATH, using = "//span[contains(text(), 'History')]")
		// public WebElement uIHistoryTab;

		// @FindBy(how = How.XPATH, using = "//div[@id =
		// 'tabNames']//span[contains(text(), 'History')")
		@FindBy(how = How.XPATH, using = "//div[@id = 'tabNames']//span[@mkr= 'ti23']")
		public WebElement uIHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'DNA')]")
		public WebElement uIDNATab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Manage Custom Fields')]")
		public WebElement uIManageCustomFieldsMenuLink;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Manage QA Forms')]")
		public WebElement uIManageQAFormMenuLink;

		@FindBy(how = How.ID, using = "cmdPhotoLine")
		public WebElement uIPhotoLineButton;

		@FindBy(how = How.XPATH, using = "//td//b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "imgNameFrontView")
		public WebElement uINameImageFrontView;

		@FindBy(how = How.ID, using = "imgNameSideView")
		public WebElement uINameImageSideView;

		@FindBy(how = How.ID, using = "cusHeaderPhone1_PhoneType_DropDown")
		public WebElement uIPhoneType1ComboBox;

		@FindBy(how = How.ID, using = "cusHeaderPhone2_PhoneType_DropDown")
		public WebElement uIPhoneType2ComboBox;

		@FindBy(how = How.ID, using = "cusHeaderPhone1_PhoneNumber")
		public WebElement uIPhoneNumber1Edit;

		@FindBy(how = How.ID, using = "cusHeaderPhone2_PhoneNumber")
		public WebElement uIPhoneNumber2Edit;

		@FindBy(how = How.ID, using = "cmbNameType")
		public WebElement uISetThisNameAsComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Vehicle')]")
		public WebElement uIVehicleTab;

		@FindBy(how = How.ID, using = "custNames_MiddleName")
		public WebElement uIMiddleNameEdit;

		@FindBy(how = How.ID, using = "btnVistor")
		public WebElement uIVisitorButton;

		@FindBy(how = How.ID, using = "cddAddressType_DropDown")
		public WebElement uIPreviousAddressTypeComboBox;

		@FindBy(how = How.ID, using = "cmdOk")
		public WebElement uIAddressPopupOkButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uIAddressPopupCancelButton;

		@FindBy(how = How.ID, using = "imgExpungeMent")
		public WebElement uIExpungementButton;

		@FindBy(how = How.ID, using = "cmdNameMerge")
		public WebElement uINameMergeButton;

		@FindBy(how = How.ID, using = "cmdCreateAJName")
		public WebElement uICreateAdultNameButton;

		@FindBy(how = How.ID, using = "cmdCreateAJName")
		public WebElement uIViewAdultNameButton;

		@FindBy(how = How.ID, using = "cmdCreateAJName")
		public WebElement uIViewJuvenileNameButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteNameLinkButton;

		@FindBy(how = How.ID, using = "btnNotify")
		public WebElement uIEmailNotifyButton;

		@FindBy(how = How.ID, using = "custNames_Suffix_DropDown")
		public WebElement uISuffixDropDown;

		@FindBy(how = How.ID, using = "lblCreateDetails")
		public WebElement uINameCreatedDetails;

		@FindBy(how = How.ID, using = "cmdDeleteActivity")
		public WebElement uIDeleteNameIcon;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisCombobox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'MJ')]")
		public WebElement uIMJTab;

		@FindBy(how = How.XPATH, using = "//td[@class = 'status']/b")
		public WebElement uIBottomLeftSideStatus;
	}

	public class NameEntryMainTab {
		public WebDriver driver;

		public NameEntryMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_dtDOB_KPIDttmCtrl")
		public WebElement uIDOBEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtAge")
		public WebElement uIAgeTextView;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_imgClrDOB")
		public WebElement uIClearDOBButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddSex_DropDown")
		public WebElement uISexComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddRace_DropDown")
		public WebElement uIRaceComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddEthnicity_DropDown")
		public WebElement uIEthnicityComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtFBI")
		public WebElement uIFBINoEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtSBI")
		public WebElement uIStateNoEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_mskSSN")
		public WebElement uISSNoEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtDL")
		public WebElement uIDrivingLicenseNoEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddDLState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddLicenseType_DropDown")
		public WebElement uILicenseTypeComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_dtcExpiry_KPIDttmCtrl")
		public WebElement uIDrivingLicenseExpireDateEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddMaritalStatus_DropDown")
		public WebElement uIMaritalStatusComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtBirthCity")
		public WebElement uIBirthCityEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddBirthState_DropDown")
		public WebElement uIBirthStateComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddCounty_DropDown")
		public WebElement uIBirthCountryComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddResident_DropDown")
		public WebElement uIResidentComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_lupBirthCountry_CodeValue")
		public WebElement uIBirthCountryEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_lupBirthCountry_imgBtn")
		public WebElement uIBirthCountryLookupButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_lupCitizenship_CodeValue")
		public WebElement uICitizenshipEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_lupCitizenship_imgBtn")
		public WebElement uICitizenshipLookupButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtPassport")
		public WebElement uIPassportNoEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtImmigration")
		public WebElement uIImmigrationEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtFingerPrint")
		public WebElement uIFingerPrintEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtEmail")
		public WebElement uIEmailEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cddDNAType_DropDown")
		public WebElement uIDNATypeComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_dtcDnaType_KPIDttmCtrl")
		public WebElement uIDNATypeDateEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_cmdAddNumber")
		public WebElement uIAddNumberButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_lblLicenseType")
		public WebElement uILicenseTypeTextView;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_lblSBI")
		public WebElement uIStateNoTextView;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_imgClrDOB")
		public WebElement uIAgeResetIcon;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtAgeTo")
		public WebElement uIAgeToTextView;

		@FindBy(how = How.ID, using = "tabNames_tmpl0_usrMain1_txtJacket")
		public WebElement uIJacketTextView;
	}

	public class PhysicalTab {
		public WebDriver driver;

		public PhysicalTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_txtHeight")
		public WebElement uIHeightEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_txtWeight")
		public WebElement uIWeight_lbsEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddEyeColor_DropDown")
		public WebElement uIEyeColorComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddHairColor_DropDown")
		public WebElement uIHairColorComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddHairLength_DropDown")
		public WebElement uIHairLengthComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddHairStyle_DropDown")
		public WebElement uIHairStyleComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddFacial_DropDown")
		public WebElement uIFacialHairCombobox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddTeeth_DropDown")
		public WebElement uIteethComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddBuild_DropDown")
		public WebElement uIBuildComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddCondition_DropDown")
		public WebElement uIConditionComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_lupMarks_CodeValue")
		public WebElement uIMarksEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_lupMarks_imgBtn")
		public WebElement uIMarksLookupButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_txtSMTDesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cmdAddSMT")
		public WebElement uIPhysicalAddButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_txtChin")
		public WebElement uIChinEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cmdClearSMT")
		public WebElement uIPhysicalClearButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddSkin_DropDown")
		public WebElement uIComplexionComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddHandy_DropDown")
		public WebElement uIHandicappedComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_txtPhysDesc")
		public WebElement uIPhysicalDescriptionEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_cddHand_DropDown")
		public WebElement uIHandComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_grdMarks")
		public WebElement uIResultPhycialTabGrid;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_chkIsGlass")
		public WebElement uIGlassesCheckbox;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_grdMarks")
		public WebElement uISMTTable;

		@FindBy(how = How.ID, using = "tabNames_tmpl2_usrPhysical1_txtHtDttm")
		public WebElement uILastEntryDate;
	}

	public class ActivityTab {
		public WebDriver driver;

		public ActivityTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "chkCollapse")
		public WebElement uICollapseAllCheckbox;

		@FindBy(how = How.ID, using = "rdoGroupActivity_0")
		public WebElement uIDateRadioCheckBox;

		@FindBy(how = How.ID, using = "rdoGroupActivity_1")
		public WebElement uIActivityRadioCheckBox;

		@FindBy(how = How.ID, using = "rdoActivity_0")
		public WebElement uIPoliceRadioCheckBox;

		@FindBy(how = How.ID, using = "rdoActivity_1")
		public WebElement uICMSRadioCheckBox;

		@FindBy(how = How.ID, using = "rdoActivity_2")
		public WebElement uIAllRadioCheckBox;

		@FindBy(how = How.ID, using = "cddActivity")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "grdActivity_ctl00")
		public WebElement uIActivityTable;

		@FindBy(how = How.ID, using = "grdActivity")
		public WebElement uIActivityResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='grdActivity']//img[@alt = 'Expand Row']")
		public WebElement uIExpandRowGridButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdActivity']//img[@alt = 'Collapse Row']")
		public WebElement uICollapseRowGridButton;

		@FindBy(how = How.ID, using = "cmdExpungement")
		public WebElement uIExpungementActivityButton;

		@FindBy(how = How.ID, using = "cmdEvidence")
		public WebElement uIEvidenceButton;
	}

	public class NameEntryFlagTab {
		public WebDriver driver;

		public NameEntryFlagTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_btnAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_grdFlag")
		public WebElement uIFlagGridTable;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_cddFlag_DropDown")
		public WebElement uIFlagComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_chkIsCritical")
		public WebElement uICriticalCheckBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_lupEnteredBy_CodeValue")
		public WebElement uIEnteredByEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_dttmEnteredDttm_KPIDttmCtrl")
		public WebElement uIEnteredDateEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_dttmActiveDttm_KPIDttmCtrl")
		public WebElement uIActiveDateEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_dttmExpiryDttm_KPIDttmCtrl")
		public WebElement uIExpiredDateEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_txtFlagDesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_txtAuthorised")
		public WebElement uIAuthorizedByEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_cmdOk")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_cmdCancel")
		public WebElement uICancelButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tabNames_tmpl1_usrFlag1_grdFlag']//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl1_usrFlag1_ddlPhoneNbr")
		public WebElement uILinkedPhoneNoDropdown;

	}

	public class EmpSchoolTab {
		public WebDriver driver;

		public EmpSchoolTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uIBNameIDEdit;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_imgSrch")
		public WebElement uIBNameInfoIconButton;

		@FindBy(how = How.ID, using = "lupOccupation_CodeValue")
		public WebElement uIOccupationEdit;

		@FindBy(how = How.ID, using = "lupOccupation_imgBtn")
		public WebElement uIOccupationLookupButton;

		@FindBy(how = How.ID, using = "cddEmployerType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "chkUnEmp")
		public WebElement uIUnEmployedCheckBox;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddNameButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIEmpSchoolSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIEmpSchoolResetButton;

		@FindBy(how = How.ID, using = "imgClearName")
		public WebElement uIEmpSchoolClearButton;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "grdCBENames")
		public WebElement uIEmpSchoolGridTable;

	}

	public class FamilyTab {
		public WebDriver driver;

		public FamilyTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cddReciprocalRelationship_DropDown")
		public WebElement uIReciprocalRelationshipComboBox;

		@FindBy(how = How.ID, using = "cddRelationship_DropDown")
		public WebElement uIRelationshipComboBox;

		@FindBy(how = How.ID, using = "chkIsNearestRelative")
		public WebElement uINearestRelativeCheckBox;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddNameButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIFamilySaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIFamilyResetButton;

		@FindBy(how = How.ID, using = "imgClearName")
		public WebElement uIFamilyClearButton;
	}

	public class InfoTab {
		public WebDriver driver;

		public InfoTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtDLNo")
		public WebElement uIDLNumberEdit;

		@FindBy(how = How.ID, using = "txtADLNo")
		public WebElement uIActualDLNumberTextView;

		@FindBy(how = How.ID, using = "DLExpDttm_KPIDttmCtrl")
		public WebElement uIDLExpireDateEdit;

		@FindBy(how = How.ID, using = "cmdAddDL")
		public WebElement uIAddDLButton;

		@FindBy(how = How.ID, using = "cmdClearDL")
		public WebElement uIClearDLButton;

		@FindBy(how = How.ID, using = "mskSSNo")
		public WebElement uISSNumberEdit;

		@FindBy(how = How.ID, using = "txtASSNo")
		public WebElement uIActualSSNumberTextView;

		@FindBy(how = How.ID, using = "cmdAddSSNo")
		public WebElement uIAddSSNoButton;

		@FindBy(how = How.ID, using = "cmdClearSSNo")
		public WebElement uIClearSSNoButton;

		@FindBy(how = How.ID, using = "dtcDOB_KPIDttmCtrl")
		public WebElement uIDateofBirtEdit;

		@FindBy(how = How.ID, using = "txtActualDOB")
		public WebElement uIActualDateofBirtTextView;

		@FindBy(how = How.ID, using = "cmdAddDOB")
		public WebElement uIAddDOBButton;

		@FindBy(how = How.ID, using = "cmdClearDOB")
		public WebElement uIClearDOBButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInfoSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInfoResetButton;
	}

	public class GangTab {
		public WebDriver driver;

		public GangTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddGang_DropDown")
		public WebElement uIGangComboBox;

		@FindBy(how = How.ID, using = "dtcAffiDate_KPIDttmCtrl")
		public WebElement uIAffiliationDateEdit;

		@FindBy(how = How.ID, using = "txtGangSet")
		public WebElement uIGangSetEdit;

		@FindBy(how = How.ID, using = "chkIsSelf")
		public WebElement uISelfAdmissionCheckBox;

		@FindBy(how = How.ID, using = "chkIsTattoos")
		public WebElement uIGangTatooCheckBox;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentEdit;

		@FindBy(how = How.ID, using = "cmdAddGang")
		public WebElement uIAddGangButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIGangSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIGangResetButton;

		@FindBy(how = How.ID, using = "grdGang")
		public WebElement uIGangResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='grdGang']//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;

		@FindBy(how = How.XPATH, using = "//table[@id='Table1']//td[@class = 'status']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "grdGangDetails")
		public WebElement uIGangTabResultTable;
	}

	public class AssociateTab {
		public WebDriver driver;

		public AssociateTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcAssociate_NameType")
		public WebElement uIAssociateNameTypeEdit;

		@FindBy(how = How.ID, using = "nmcAssociate_NameTypeID")
		public WebElement uIAssociateNameIDEdit;

		@FindBy(how = How.ID, using = "nmcAssociate_LastName")
		public WebElement uIAssociateLastNameEdit;

		@FindBy(how = How.ID, using = "nmcAssociate_FirstName")
		public WebElement uIAssociateFirstNameEdit;

		@FindBy(how = How.ID, using = "nmcAssociate_MiddleName")
		public WebElement uIAssociateMiddleNameEdit;

		@FindBy(how = How.ID, using = "numCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "numCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "dtcActDttm_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddNameButton;

		@FindBy(how = How.ID, using = "imgClearName")
		public WebElement uIClearNameButton;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIAssociateSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIAssociateResetButton;

		@FindBy(how = How.ID, using = "numCaseNo_imgBtn")
		public WebElement uICaseInfoButton;

		@FindBy(how = How.ID, using = "txtRptDttm")
		public WebElement uIReportedOnTextView;

		@FindBy(how = How.ID, using = "grdAssociates")
		public WebElement uIAssociatesResultTable;
	}

	public class VisitorsTab {
		public WebDriver driver;

		public VisitorsTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "custNames_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "custNames_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "custNames_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "custNames_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cddRelation_DropDown")
		public WebElement uIRelationshipComboBox;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "chkIsVisit")
		public WebElement uIVisitationNotAllowedCheckBox;

		@FindBy(how = How.ID, using = "cmdAddVisitor")
		public WebElement uIAddVisitorsButton;

		@FindBy(how = How.ID, using = "cmdClearVisitor")
		public WebElement uIClearVisitorsButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIVisitorsSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIVisitorsResetButton;

		@FindBy(how = How.ID, using = "grdVisitor")
		public WebElement uIContactsResultTable;

	}

	public class NameEntryMapTab {
		public WebDriver driver;

		public NameEntryMapTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "frmGHydrantMap_Id")
		public WebElement uIFormName;

		@FindBy(how = How.ID, using = "lbllatLongvalue")
		public WebElement uILatLongTextView;

		@FindBy(how = How.XPATH, using = "//span[@id = 'lbllatLongvalue']//font")
		public WebElement uILatLongValueTextView;

		@FindBy(how = How.XPATH, using = "btnUpdateLatLong")
		public WebElement uIUpdateLatLongButton;

		@FindBy(how = How.ID, using = "lblLocTypeValue")
		public WebElement uIDiplayingMapIdForNameID;

	}

	public class PhoneTab {
		public WebDriver driver;

		public PhoneTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNames_tmpl5_usrusrPhone1_txtOrder")
		public WebElement uIOrderNoEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl5_usrusrPhone1_custPhone1_PhoneType_DropDown")
		public WebElement uIPhoneTypeComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl5_usrusrPhone1_custPhone1_PhoneNumber")
		public WebElement uIPhoneNumberEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl5_usrusrPhone1_txtExt")
		public WebElement uIExtnEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl5_usrusrPhone1_cmdPhoneAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl5_usrusrPhone1_cmdPhoneClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl5_usrusrPhone1_grdPhones")
		public WebElement uIPhoneResultTable;

	}

	public class AlaisTab {
		public WebDriver driver;

		public AlaisTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAlias1_cstNames_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAlias1_cstNames_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAlias1_chkMaiden")
		public WebElement uIaidenNameCheckBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAlias1_cmdAddAlias")
		public WebElement uIAliasAddButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAlias1_cmdClearAlias")
		public WebElement uIAliasClearButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tabNames_tmpl3_usrAlias1_grdAlias']//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAlias1_grdAlias")
		public WebElement uIAliasResultTable;

		@FindBy(how = How.ID, using = "tabNames_tmpl3_usrAlias1_cstNames_Suffix_DropDown")
		public WebElement uISuffix;

	}

	public class NameEntryAddressesTab {
		public WebDriver driver;

		public NameEntryAddressesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_adrAdditionalAddr_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_adrAdditionalAddr_chkVerify")
		public WebElement uIAddressCheckBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_lupAddrCountry_CodeValue")
		public WebElement uICountryCodeEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_lupAddrCountry_imgBtn")
		public WebElement uICountryCodeLookupButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_dtcDeleteDate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_cmdAddAddress")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_cmdClearAddress")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_grdAddress")
		public WebElement uIAddressResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='tabNames_tmpl4_usrAddresses1_grdAddress']//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;

		@FindBy(how = How.ID, using = "tabNames_tmpl4_usrAddresses1_chkEnableMailDelivery")
		public WebElement uIMailDeliveryCheckBox;

	}

	public class BusinessTab {
		public WebDriver driver;

		public BusinessTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddBusinessType_DropDown")
		public WebElement uIBusinessTypeComboBox;

		@FindBy(how = How.ID, using = "txtBusinessId")
		public WebElement uIBusinessIDEdit;

		@FindBy(how = How.ID, using = "cddBusinessRegState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "chkIdenType_0")
		public WebElement uIInventoryVentorCheckBox;


		@FindBy(how = How.ID, using = "chkIdenType_1")
		public WebElement uIAlarmVendorCheckBox;

      @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Approval')]")
      public WebElement uIApprovalTab;
      
      @FindBy(how = How.ID, using = "lblApprovalStatus")
      public WebElement uIArrestStatusText;
      
      @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Emp/School')]")
      public WebElement uIEmpSchoolTab;
      
      @FindBy(how = How.XPATH, using = "//span[contains(text(), 'QA Forms')]")
      public WebElement uIQAFormsTab;

		@FindBy(how = How.ID, using = "txtEmail")
		public WebElement uIEmailEdit;

		@FindBy(how = How.ID, using = "cddLicenceType_DropDown")
		public WebElement uILicenseTypeComboBox;

		@FindBy(how = How.ID, using = "txtLicenseNo")
		public WebElement uILicenseNumberEdit;

		@FindBy(how = How.ID, using = "dtcIssued_KPIDttmCtrl")
		public WebElement uIIssuedOnEdit;

		@FindBy(how = How.ID, using = "dtcRenewal_KPIDttmCtrl")
		public WebElement uIRenewalEdit;

		@FindBy(how = How.ID, using = "cmdAddLicense")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdLicense")
		public WebElement uILicenseResultTable;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIBusinessTabSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIBusinessTabResetButton;

		@FindBy(how = How.ID, using = "nmcContactPerson_NameType")
		public WebElement uIContactPersonNameTypeEdit;

		@FindBy(how = How.ID, using = "nmcContactPerson_NameTypeID")
		public WebElement uIContactPersonNameTypeIDEdit;

		@FindBy(how = How.ID, using = "nmcContactPerson_LastName")
		public WebElement uIContactPersonLastNameEdit;

		@FindBy(how = How.ID, using = "nmcContactPerson_FirstName")
		public WebElement uIContactPersonFirstNameEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='Table1']//td[@class = 'status']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "chkIdenType_3")
		public WebElement uIHelpDeskVendorCheckBox;

	}

	public class NameEntryCommentsTab {
		public WebDriver driver;

		public NameEntryCommentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		// [FindsBy(How = How.ID, using = "dtcCurrDate_KPIDttmCtrl")
		// public WebElement uIDateTextView;

		@FindBy(how = How.ID, using = "dtcCurrDate_Date_KPIDttmCtrl")
		public WebElement uIDateTextView;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uICommentsResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='grdComments']//td[@class='Delete_Icon_Style ig2d2816fe']")
		public WebElement uIDeleteIconGridButton;

		@FindBy(how = How.XPATH, using = "//span[text()='X']")
		public WebElement uIDeleteHeaderIcon;
	}

	public class NamesComments {
		public WebDriver driver;

		public NamesComments() {
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

		// @FindBy(how = How.XPATH, using = "
		// //table[@id='ctrlUsrKPITxtEdit_rteKPITxtWrapper']//iframe[@id='ctrlUsrKPITxtEdit_rteKPITxt_contentIframe']")
		// public WebElement uICommentsRichTextEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class NameEntryContactsTab {
		public WebDriver driver;

		public NameEntryContactsTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcIncident_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddContactsButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIContactsSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIContactsResetButton;

		@FindBy(how = How.ID, using = "grdCBENames")
		public WebElement uIContactsResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'status']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "grdContacts")
		public WebElement uIContactsTabTable;

		@FindBy(how = How.ID, using = "btnAddnew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "chkIncludeExpired")
		public WebElement uIIncludeInactiveCheckBox;
	}

	public class SocialMediaTab {
		public WebDriver driver;

		public SocialMediaTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Criteria')]")
		public WebElement uICriteriaTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Sites')]")
		public WebElement uISitesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'History')]")
		public WebElement uIHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attachments')]")
		public WebElement uIAttachmentsTab;

	}

	public class SocialMediaTabs {
		public WebDriver driver;

		public CriteriaTab criteriaTab;
		public SitesTab sitesTab;
		public SocialMediaHistoryTab socialMediaHistoryTab;

		public SocialMediaTabs() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.criteriaTab == null)) {
				this.criteriaTab = new CriteriaTab();
			}

			if ((this.sitesTab == null)) {
				this.sitesTab = new SitesTab();
			}

			if ((this.socialMediaHistoryTab == null)) {
				this.socialMediaHistoryTab = new SocialMediaHistoryTab();
			}

		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Criteria')]")
		public WebElement uICriteriaTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Sites')]")
		public WebElement uISitesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'History')]")
		public WebElement uIHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attachments')]")
		public WebElement uIAttachmentsTab;

	}

	public class CriteriaTab {
		public WebDriver driver;

		public CriteriaTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkKnownGang")
		public WebElement uIKnownGangmemberCheckBox;

		@FindBy(how = How.ID, using = "chkGangAffiliation")
		public WebElement uINameIndicateschkGangAffiliationCheckBox;

		@FindBy(how = How.ID, using = "chkMultipleGang")
		public WebElement uIAssociatesMultipleGangmemberCheckBox;

		@FindBy(how = How.ID, using = "chkCriminal")
		public WebElement uICriminalPredicateCheckBox;

		@FindBy(how = How.ID, using = "chkSuspect")
		public WebElement uISuspectCriminalInvestigationCheckBox;

		@FindBy(how = How.ID, using = "nbrCaseNo_1_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNo_1_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "nbrCaseNo_1_imgBtn")
		public WebElement uICaseNumberLookupButton;

		@FindBy(how = How.ID, using = "txtOtherNbr_1")
		public WebElement uIOtherNumberEdit;

		@FindBy(how = How.ID, using = "imgRemove_1")
		public WebElement uIDeleteIconButton;

		@FindBy(how = How.ID, using = "nbrCaseNo_2_Year")
		public WebElement uICaseYear2Edit;

		@FindBy(how = How.ID, using = "nbrCaseNo_2_Number")
		public WebElement uICaseNumber2Edit;

		@FindBy(how = How.ID, using = "nbrCaseNo_2_imgBtn")
		public WebElement uICaseNumber2LookupButton;

		@FindBy(how = How.ID, using = "txtOtherNbr_2")
		public WebElement uIOtherNumber2Edit;

		@FindBy(how = How.ID, using = "imgRemove_2")
		public WebElement uIDeleteIcon2Button;

		@FindBy(how = How.ID, using = "cmdAddMore")
		public WebElement uIAddMoreButton;

		@FindBy(how = How.ID, using = "chkPhotoMatching")
		public WebElement uIPhotoMatchingBookingCheckBox;

		@FindBy(how = How.ID, using = "chkDOBMatch")
		public WebElement uIDOBMatchNameCheckBox;

		@FindBy(how = How.ID, using = "chkNamePosted")
		public WebElement uINamePostedURLCheckBox;

		@FindBy(how = How.ID, using = "chkPhoneNbrLinked")
		public WebElement uIPhoneNumberLinkedPriorArrestCheckBox;

		@FindBy(how = How.ID, using = "txtPhoneNbr")
		public WebElement uIPhoneNumberEdit;

		@FindBy(how = How.ID, using = "chkEmailLinked")
		public WebElement uIEmailLinkedPriorArrestCheckBox;

		@FindBy(how = How.ID, using = "txtEmail")
		public WebElement uIEmailEdit;

		@FindBy(how = How.ID, using = "chkTattoosMatch")
		public WebElement uITattoosMatchBookingCheckBox;

		@FindBy(how = How.ID, using = "chkSpecify")
		public WebElement uISpecifyOwnValueCheckBox;

		@FindBy(how = How.ID, using = "txtSpecifyValue")
		public WebElement uISpecifyValueEdit;

		@FindBy(how = How.ID, using = "nbrSocialMedia_Year")
		public WebElement uIConfidentialSourceIDYearEdit;

		@FindBy(how = How.ID, using = "nbrSocialMedia_Number")
		public WebElement uIConfidentialSourceIDNumberEdit;

		@FindBy(how = How.ID, using = "chkGenerateNo")
		public WebElement uIGenerateNoCheckBox;

		@FindBy(how = How.ID, using = "txtConfidentialNbr")
		public WebElement uIOldConfidentialSourceIDEdit;

		@FindBy(how = How.ID, using = "dtcVerifiedOn_KPIDttmCtrl")
		public WebElement uIInformationVerifiedOnDateEdit;

		@FindBy(how = How.ID, using = "lupVerifiedPFID_CodeValue")
		public WebElement uIInformationVerifiedByPFEdit;

		@FindBy(how = How.ID, using = "lupVerifiedPFID_imgBtn")
		public WebElement uIInformationVerifiedByPFLookupButton;

		@FindBy(how = How.ID, using = "dtcReminderDttm_KPIDttmCtrl")
		public WebElement uINextReminderDateEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uICriteriaSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uICriteriaResetButton;

		@FindBy(how = How.ID, using = "btnDelete")
		public WebElement uICriteriaDeleteButton;

		@FindBy(how = How.ID, using = "chkSuspCriminalAct") // Added by Abi
		public WebElement uISuspectCriminalActivityCheckBox;

		@FindBy(how = How.ID, using = "lblOR") // Added by Abi
		public WebElement uIANDText;

		@FindBy(how = How.ID, using = "lblCreateDtl") // Added by Abi
		public WebElement uICreatedText;

	}

	public class SitesTab {

		public WebDriver driver;

		public SitesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSetupSocialMedia")
		public WebElement uISetupSocialMediaButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//div[@id = 'divSelectedSocialMedia']//span[@class='spnSelMedia'])")
		public WebElement uISelectedsocialMediaDescriptionTextView;

		@FindBy(how = How.XPATH, using = "(//div[@id = 'divMediaType']//a/img[@id='Img_GPLUS'])")
		public WebElement uIMediaTypeIconGplusImageView;

		@FindBy(how = How.ID, using = "ddlUCSite")
		public WebElement uIUCAccountNameComboBox;

		@FindBy(how = How.ID, using = "txtURL")
		public WebElement uIEnterURLEdit;

		@FindBy(how = How.ID, using = "txtUserName")
		public WebElement uIUCUserNameEdit;

		@FindBy(how = How.ID, using = "txtSiteID")
		public WebElement uISiteIDNoEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cddFriendStatus_DropDown")
		public WebElement uIFriendStatusComboBox;

		@FindBy(how = How.ID, using = "cmdLaunchBrowser")
		public WebElement uILaunchBrowserButton;

		@FindBy(how = How.ID, using = "cmdAddSocialMedia")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClearSocialMedia")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdSocialMediaSites")
		public WebElement uISocialMediaTabResultTable;
		
		@FindBy(how = How.ID, using = "cmdAddSocialMedia")
		public WebElement uIUpdateButton;
		
		@FindBy(how = How.XPATH, using = "//td[@class='status']//td/b")
		public WebElement SitesTabBottomStatusBar;
		
		@FindBy(how = How.XPATH, using = "//div[@id='identifierNext']")
		public WebElement uIGooglePlusLoginButton;
		
		
	}

	public class SocialMediaHistoryTab {
		public WebDriver driver;

		public SocialMediaHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dttmDate_Date_KPIDttmCtrl")
		public WebElement uIUpdatedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmDate_Time']//input")
		public WebElement uIUpdatedTimeEdit;

		@FindBy(how = How.ID, using = "chkCFRVerficationDate")
		public WebElement uIReset28CFRVerificationDate;

		@FindBy(how = How.ID, using = "lupBy_CodeValue")
		public WebElement uIUpdatedByPFEdit;

		@FindBy(how = How.ID, using = "lupBy_imgBtn")
		public WebElement uIUpdatedByPFLookupButton;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "txtEditComments")
		public WebElement uIEditNotesEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "btnUpdate")
		public WebElement uISaveUpdateButton;

		@FindBy(how = How.ID, using = "chkShowAll")
		public WebElement uIShowAllCheckBox;

		@FindBy(how = How.ID, using = "grdSocialMediaHistory")
		public WebElement uIHistoryTabResultTable;

		@FindBy(how = How.XPATH, using = "//table[@id='grdSocialMediaHistory']//div[@class='HistoryComments']")
		public WebElement uIHistoryCommentsTable;

		@FindBy(how = How.XPATH, using = "//table[@id='grdSocialMediaHistory']//input[@id='grdSocialMediaHistory_ctl00_btnEdit']")
		public WebElement uIEditButtonHistoryGridTable;

		@FindBy(how = How.XPATH, using = "//table[@id='grdSocialMediaHistory']//input[@id='grdSocialMediaHistory_ctl00_btnDelete']")
		public WebElement uIDeleteButtonHistoryGridTable;
	}

	public class BNameVerifyScreen {
		public WebDriver driver;
		/// <summary>
		/// If same B type Name is already in RMS, the verify window to displayed.
		/// </summary>

		public BNameVerifyScreen() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnSelect")
		public WebElement uICopyNameButton;

		@FindBy(how = How.ID, using = "btnNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdNames")
		public WebElement uIBNameVerifyResultTable;
	}

	public class DNATab {
		public WebDriver driver;

		public DNATab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInternalResetButton;

		@FindBy(how = How.ID, using = "cmdCrgHistory")
		public WebElement uIInternalHistoryButton;

		@FindBy(how = How.ID, using = "txtCaseNo")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "lupStatute_CodeValue")
		public WebElement uIStatuteCodeValueEdit;

		@FindBy(how = How.ID, using = "rbYes")
		public WebElement uISampleCollectedYesRadioButton;

		@FindBy(how = How.ID, using = "rbNo")
		public WebElement uISampleCollectedNoRadioButton;

		@FindBy(how = How.ID, using = "lupCollectedByPFID_CodeValue")
		public WebElement uICollectedByPFNumberEdit;

		@FindBy(how = How.ID, using = "lupCollectedByPFID_imgBtn")
		public WebElement uICollectedByPFLookupButton;

		@FindBy(how = How.ID, using = "radReasonCollected_DropDown")
		public WebElement uIReasonCollectedComBoBox;

		@FindBy(how = How.ID, using = "dttmCollection_Date_KPIDttmCtrl")
		public WebElement uICollectionDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmCollection_Time']//input")
		public WebElement uICollectionTimeEdit;

		@FindBy(how = How.ID, using = "grdNameDNA")
		public WebElement uIDNAResultGrid;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearName")
		public WebElement uIClearButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class NameEntryHistoryTab {
		public WebDriver driver;

		public NameEntryHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "rdbScreenView")
		public WebElement uIScreenViewRadioButton;

		@FindBy(how = How.ID, using = "rdbDateView")
		public WebElement uIDateViewRadioButton;

		@FindBy(how = How.ID, using = "grdHistory")
		public WebElement uIHistoryResultGrid;

		@FindBy(how = How.XPATH, using = "//img[@title = 'Expand Row']")
		public WebElement uIExpandRowButton;

		@FindBy(how = How.XPATH, using = "//img[@title = 'Collapse Row']")
		public WebElement uICollapseRowButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdHistory_ctl00']//img[@un = '1']")
		public WebElement uIExpandRow1Button;

		@FindBy(how = How.ID, using = "grdHistory_ctl00_Phones_0")
		public WebElement uIHistoryPhoneResultGrid;
	}

	public class NameEntryVehicleTab {
		public WebDriver driver;

		public NameEntryVehicleTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "chkCollapse")
		public WebElement uICollapseAllCheckbox;

		@FindBy(how = How.ID, using = "rdoActivity_1")
		public WebElement uIDateRadioCheckBox;

		@FindBy(how = How.ID, using = "rdoActivity_1")
		public WebElement uIActivityRadioCheckBox;

		@FindBy(how = How.ID, using = "cddVehicleActivity")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "grdHVehActivity_ctl00")
		public WebElement uIActivityTable;

		@FindBy(how = How.ID, using = "grdVehActivity")
		public WebElement uIVehicleTabResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='grdHVehActivity']//img[@alt = 'Expand Row']")
		public WebElement uIExpandRowGridButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdHVehActivity']//img[@alt = 'Collapse Row']")
		public WebElement uICollapseRowGridButton;

	}

	public class NameEntryMJTab {

		public WebDriver driver;

		public NameEntryMJTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdNameMJ")
		public WebElement uIMJTable;

	}

	public class NameMining {
		public WebDriver driver;

		public NameMining() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdFit")
		public WebElement uIFitButton;

		@FindBy(how = How.ID, using = "cmdZoomIn")
		public WebElement uIZoomInButton;

		@FindBy(how = How.ID, using = "cmdZoomOut")
		public WebElement uIZoomOutButton;

		@FindBy(how = How.ID, using = "cmPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdZoom")
		public WebElement uIFullZoomButton;
	}

	public class ArrestEntry {
		public WebDriver driver;
		public ArrestTab arrestTab;
		public MedicalTab medicalTab;
		public ChargeTab chargeTab;
		public DispositionTab dispositionTab;
		public ReleaseTab releaseTab;
		public PersonalDataTab personalDataTab;
		public AssociatesTab associatesTab;
		public ArrestEntryCommentsTab arrestEntryCommentsTab;
		public StatementTab statementTab;
		public ChargingConfTab chargingConfTab;
		public ArrestEntryMapTab arrestEntryMapTab;
		public HealthTab healthTab;
		public ArrestEntryQAFormsTab arrestEntryQAFormsTab;
		public ArrestEntryCellTab arrestEntryCellTab;
		public BookingComments bookingComments;
		public ArrestEntryApprovalTab arrestEntryApprovalTab;
		public ArrestEntryEmpSchoolTab arrestEntryEmpSchoolTab;

		public ArrestEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.arrestTab == null)) {
				this.arrestTab = new ArrestTab();
			}
			if ((this.medicalTab == null)) {
				this.medicalTab = new MedicalTab();
			}
			if ((this.chargeTab == null)) {
				this.chargeTab = new ChargeTab();
			}
			if ((this.dispositionTab == null)) {
				this.dispositionTab = new DispositionTab();
			}
			if ((this.releaseTab == null)) {
				this.releaseTab = new ReleaseTab();
			}
			if ((this.personalDataTab == null)) {
				this.personalDataTab = new PersonalDataTab();
			}
			if ((this.associatesTab == null)) {
				this.associatesTab = new AssociatesTab();
			}
			if ((this.arrestEntryCommentsTab == null)) {
				this.arrestEntryCommentsTab = new ArrestEntryCommentsTab();
			}
			if ((this.statementTab == null)) {
				this.statementTab = new StatementTab();
			}
			if ((this.chargingConfTab == null)) {
				this.chargingConfTab = new ChargingConfTab();
			}
			if ((this.arrestEntryMapTab == null)) {
				this.arrestEntryMapTab = new ArrestEntryMapTab();
			}
			if ((this.healthTab == null)) {
				this.healthTab = new HealthTab();
			}
			if ((this.arrestEntryQAFormsTab == null)) {
				this.arrestEntryQAFormsTab = new ArrestEntryQAFormsTab();
			}
			if ((this.arrestEntryCellTab == null)) {
				this.arrestEntryCellTab = new ArrestEntryCellTab();
			}
			if ((this.arrestEntryApprovalTab == null)) {
				this.arrestEntryApprovalTab = new ArrestEntryApprovalTab();
			}
			if ((this.bookingComments == null)) {
				this.bookingComments = new BookingComments();
			}
			if ((this.arrestEntryEmpSchoolTab == null)) {
				this.arrestEntryEmpSchoolTab = new ArrestEntryEmpSchoolTab();
			}
		}

		@FindBy(how = How.ID, using = "txtNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameID_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "txtNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_imgSrch")
		public WebElement uINameInfoButton;

		@FindBy(how = How.ID, using = "imgNameFrontView")
		public WebElement uIArrestEntryImageView;

		@FindBy(how = How.ID, using = "txtNameID_imgWant")
		public WebElement uIWarrantIconButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tabBooking']//span[@mkr = 'ti0']")
		public WebElement uIArrestTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Release')]")
		public WebElement uIReleaseTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Charge')]")
		public WebElement uIChargeTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Statement')]")
		public WebElement uIStatementTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Charging Conf')]")
		public WebElement uIChargingConfTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Associates')]")
		public WebElement uIAssociatesTab;

		// @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attachments')]")
		// public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tabBooking']//span[@mkr = 'ti12']")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Comments')]")
		public WebElement uICommentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Personal Data')]")
		public WebElement uIPersonalDataTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Disposition')]")
		public WebElement uIDispositionTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Cell')]")
		public WebElement uICellTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdAccessList")
		public WebElement uIALCButton;

		@FindBy(how = How.ID, using = "Identix")
		public WebElement uIBioMetricIcon;

		@FindBy(how = How.ID, using = "cmdEACCSubmission")
		public WebElement uIEACCSubmissionIcon;

		@FindBy(how = How.ID, using = "Mugsearch")
		public WebElement uIMugSearchIcon;

		@FindBy(how = How.ID, using = "cmdPicture")
		public WebElement uIPictureInterfaceIcon;

		@FindBy(how = How.ID, using = "cmdADR")
		public WebElement uISendDataToPreBookingQueueIcon;

		@FindBy(how = How.ID, using = "imgExpungeMent")
		public WebElement uIExpungementIcon;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "txtBookingNo_Year")
		public WebElement uIArrestYearEdit;

		@FindBy(how = How.ID, using = "txtBookingNo_Number")
		public WebElement uIArrestNumberEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_grdChargeLst")
		public WebElement uIPopupCopyChargeGridTable;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_cmdCopy")
		public WebElement uIPopupChargeCopyButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_cmdCancel")
		public WebElement uIPopupChargeCancelButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Medical')]")
		public WebElement uIMedicalTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Map')]")
		public WebElement uIMapTab;

		@FindBy(how = How.ID, using = "grdCaseLst")
		public WebElement uIPopupCaseGridTable;

		@FindBy(how = How.ID, using = "cmdCloseCasePopup")
		public WebElement uIPopupCaseCloseButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tabBooking']//span[@mkr= 'ti11']")
		public WebElement uIAttachmentsWithDataTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Approval')]")
		public WebElement uIApprovalTab;

		@FindBy(how = How.ID, using = "lblApprovalStatus")
		public WebElement uIArrestStatusText;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Emp/School')]")
		public WebElement uIEmpSchoolTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'QA Forms')]")
		public WebElement uIQAFormsTab;
	}

	public class ArrestTab {

		public WebDriver driver;

		public ArrestTab() {
			driver = Playback.driver;
			PageFactory.initElements(Playback.driver, this);
		}

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_nbrIncidentID_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_nbrIncidentID_Number")
		public WebElement uICaseNoEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_nbrIncidentID_imgBtn")
		public WebElement uICaselupSearchButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_nbrIncidentID_imgBtn")
		public WebElement uICaseInfoIcon;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_dttArrestDttm_Date_KPIDttmCtrl")
		public WebElement uIArrestDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabBooking_tmpl0_ctrlUsrBooking_dttArrestDttm_Time']//input")
		public WebElement uIArrestTimeEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_txtArrestPlace_txtFrom")
		public WebElement uIIncidentLocationEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_cddHowArrested_DropDown")
		public WebElement uIHowComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_cddArmed1_DropDown")
		public WebElement uIArmedComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_cddArmed2_DropDown")
		public WebElement uIArmed1ComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_lupOfficer1_CodeValue")
		public WebElement uIOfficer1Edit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_lupOfficer1_CodeDescription")
		public WebElement uIOfficer1DescEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_lupOfficer1_imgBtn")
		public WebElement uIOfficer1lupSrchButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_lupBookingPFID_CodeValue")
		public WebElement uISupervisorEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_lupBookingPFID_CodeDescription")
		public WebElement uISupervisorDescEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_lupBookingPFID_imgBtn")
		public WebElement uISupervisorlupButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_dttBookingDttm_Date_KPIDttmCtrl")
		public WebElement uIBookingDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='tabBooking_tmpl0_ctrlUsrBooking_dttBookingDttm_Time']//input")
		public WebElement uIBookingTimeEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_Kpilabel1")
		public WebElement uIOffenderIDText;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_txtOffenderID")
		public WebElement uIOffenderIDEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl0_ctrlUsrBooking_cddJuvStatus_DropDown")
		public WebElement uIJuvenileStatusComboBox;

	}

	public class MedicalTab {
		public WebDriver driver;

	}

	public class ChargeTab {
		public WebDriver driver;

		public ChargeTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_nbrCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_nbrCaseNo_Number")
		public WebElement uICaseNoEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_usrChargeMN1_nbrCaseNo_imgBtn")
		public WebElement uICaseSrchInfoButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_nbrCaseNo_imgBtn")
		public WebElement uICaseNoInfoIcon;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_txtCitation_imgBtn")
		public WebElement uICitationAddIcon;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_txtArrestLocation_txtFrom")
		public WebElement uIArrestLocationEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_usrChargeMN1_txtArrestLocation_chkVerify")
		public WebElement uIArrestLocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_dttOffenseDttm_Date_KPIDttmCtrl")
		public WebElement uIOffenseDate;

		@FindBy(how = How.XPATH, using = "//table[@id='tabBooking_tmpl2_ctrlUsrCharge_dttOffenseDttm_Time']//input")
		public WebElement uIOffenseTime;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_txtChargeCount")
		public WebElement uICountEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_usrChargeMN1_lupOrgCharge_CodeValue")
		public WebElement uIStateOrdNoEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_usrChargeMN1_lupOrgCharge_CodeDescription")
		public WebElement uIStateOrdNoDescEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_usrChargeMN1_lupOrgCharge_imgBtn")
		public WebElement uIStateOrdNolupButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_usrChargeMN1_cddDisposition_DropDown")
		public WebElement uIDispositionComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_cddCourtType_DropDown")
		public WebElement uICourtTypeComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_usrChargeMN1_cddGeneralOffense_DropDown")
		public WebElement uIGOCComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_lupOrgCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_imgAddCharge")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_cddChargeStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_grdCharge")
		public WebElement uIChargeTableId;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_cddNibrs")
		public WebElement uINIBRSOffenseComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_chkDNACollected")
		public WebElement uIDNACollectedCheckBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_cddJuvStatus_DropDown")
		public WebElement uIAgencyActionCombobox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_txtCitation_CitationNbr")
		public WebElement uICitationNoEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_txtCitation_imgBtn")
		public WebElement uICitationAddButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_txtCitation_imgBtn")
		public WebElement uICitationNoInfoIcon;

		@FindBy(how = How.ID, using = "tdchkModifier")
		public WebElement uIModifierCheckbox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl2_ctrlUsrCharge_cddJuvStatus_DropDown")
		public WebElement uIJuvenileStatusDropdown;
	}

	public class DispositionTab {

	}

	public class ReleaseTab {
		public WebDriver driver;

		public ReleaseTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabBooking_tmpl5_UsrBookingJuven1_cddSchool_DropDown")
		public WebElement uISchoolComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl5_UsrBookingJuven1_cddGrade_DropDown")
		public WebElement uIGradeComboBox;

	}

	public class PersonalDataTab {
		public WebDriver driver;

		public PersonalDataTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_custNames_LastName")
		public WebElement uIAliasLastNameEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_custNames_FirstName")
		public WebElement uIAliasFirstNameEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_txtHeight")
		public WebElement uIHeight;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_txtWeight")
		public WebElement uIWeightlbs;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_cddEyeColor_DropDown")
		public WebElement uIEyecolor;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_cddHairColor_DropDown")
		public WebElement uIHaircolor;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_cddHairLength_DropDown")
		public WebElement uIHairLength;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_cddHairStyle_DropDown")
		public WebElement uIHairStyleComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_cddBehavior_DropDown")
		public WebElement uIBehaviorComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_cddHandy_DropDown")
		public WebElement uIHandicappedComboBox;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_txtPhysDesc")
		public WebElement uIPhysicalDescEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_txtClothingDesc")
		public WebElement uIClothingEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_txtAppearanceDesc")
		public WebElement uIAppearanceEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_lupMarks_CodeValue")
		public WebElement uISMTCodeEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_txtSMTDesc")
		public WebElement uISMTDescriptionEdit;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_cmdAddSMT")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabBooking_tmpl6_UsrBookingName1_grdMarks")
		public WebElement uISMTResultTable;
	}

	public class AssociatesTab {

	}

	public class ArrestEntryCommentsTab {

		public WebDriver driver;

		public ArrestEntryCommentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uIEnterCommentsButton;

	}

	public class StatementTab {
		public WebDriver driver;

		public StatementTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxtContentHiddenTextarea")
		public WebElement uIWrapperCommentsEdit;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_lstTextName")
		public WebElement uITemplateNameComboBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdload")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdAddnew")
		public WebElement uIAddNewButton;

	}

	public class ChargingConfTab {
		public WebDriver driver;

		public ChargingConfTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "dttReviewDttm_KPIDttmCtrl")
		public WebElement uIReviewDate;

		@FindBy(how = How.ID, using = "lupCaseOfficer_CodeValue")
		public WebElement uICaseOfficerCodeEdit;

		@FindBy(how = How.ID, using = "txtNameID_NameType")
		public WebElement uIReviewingDAsNameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameID_NameTypeID")
		public WebElement uIReviewingDAsNameIDEdit;

		@FindBy(how = How.ID, using = "txtNameID_LastName")
		public WebElement uIReviewingDAsLastNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_FirstName")
		public WebElement uIReviewingDAsFirstNameEdit;

		@FindBy(how = How.ID, using = "grdDAConf")
		public WebElement uIChargingConfTable;

		@FindBy(how = How.ID, using = "imgAddCharge")
		public WebElement uIUpdateButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "lupNewCharge_CodeValue")
		public WebElement uINewChargeCodeEdit;

	}

	public class ArrestEntryMapTab {

	}

	public class HealthTab {

	}

	public class ArrestEntryQAFormsTab {

		public WebDriver driver;

		public ArrestEntryQAFormsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddForm_DropDown")
		public WebElement uISelectFormDropDown;
		
		@FindBy(how = How.ID, using = "grdQAForms")
		public WebElement uIGridTable;

	}

	public class ArrestEntryCellTab {
		public WebDriver driver;

		public ArrestEntryCellTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "btnCellHistory")
		public WebElement uICellHistoryButton;

		@FindBy(how = How.ID, using = "btnAddActivity")
		public WebElement uIAddActivityButton;

		@FindBy(how = How.ID, using = "btnDetention")
		public WebElement uIDetentionRecordButton;

		@FindBy(how = How.ID, using = "cddCustReason_DropDown")
		public WebElement uICustodyReasonComboBox;

		@FindBy(how = How.ID, using = "txtCustAlert")
		public WebElement uICustodyAlertEdit;

		@FindBy(how = How.ID, using = "cddRiskLevel_DropDown")
		public WebElement uIRiskLevelComboBox;

		@FindBy(how = How.ID, using = "txtCellNo")
		public WebElement uIAssignCellEdit;

		@FindBy(how = How.ID, using = "ImgParentCell")
		public WebElement uIAssignCellInfoButton;

		@FindBy(how = How.ID, using = "lupAssignedBy_CodeValue")
		public WebElement uIAssignByPFEdit;

		@FindBy(how = How.ID, using = "dttAssignedDate_Date_KPIDttmCtrl")
		public WebElement uIAssignedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttAssignedDate_Time']//input")
		public WebElement uIAssignedTimeEdit;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "cddTempLocation_DropDown")
		public WebElement uITemporaryLocationComboBox;

		@FindBy(how = How.ID, using = "dttMoved_Date_KPIDttmCtrl")
		public WebElement uIMovedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttMoved_Time']//input")
		public WebElement uIMovedTimeEdit;

		@FindBy(how = How.ID, using = "txtTempRemarks")
		public WebElement uITempRemarksEdit;

		@FindBy(how = How.ID, using = "chkRelease")
		public WebElement uIRemoveCheckBox;

		@FindBy(how = How.ID, using = "lupRleasedBy_CodeValue")
		public WebElement uIRemovedByPFEdit;

		@FindBy(how = How.ID, using = "dttReleaseDate_Date_KPIDttmCtrl")
		public WebElement uIRemovedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttReleaseDate_Time']//input")
		public WebElement uIRemovedTimeEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.XPATH, using = "//tr/td/a[contains(text(), 'Auto QA Form')")
		public WebElement uIAutoQAFormLink;

		@FindBy(how = How.ID, using = "hypQA0")
		public WebElement uIAutoQAFormLinkButton;

	}

	public class ArrestEntryApprovalTab {
		public WebDriver driver;

		public ArrestEntryApprovalTab() {
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

	public class BookingComments {
		// It should comes under the appropriate UI Map (Moudle).

		public WebDriver driver;

		public BookingComments() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "cdmSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

	}

	public class ArrestEntryEmpSchoolTab {
		public WebDriver driver;

		public ArrestEntryEmpSchoolTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcIncident_NameTypeID")
		public WebElement uIBNameIDEdit;

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_imgSrch")
		public WebElement uIBNameInfoIconButton;

		@FindBy(how = How.ID, using = "lupOccupation_CodeValue")
		public WebElement uIOccupationEdit;

		@FindBy(how = How.ID, using = "lupOccupation_imgBtn")
		public WebElement uIOccupationLookupButton;

		@FindBy(how = How.ID, using = "cddEmployerType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "chkUnEmp")
		public WebElement uIUnEmployedCheckBox;

		@FindBy(how = How.ID, using = "imgAddName")
		public WebElement uIAddNameButton;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIEmpSchoolSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIEmpSchoolResetButton;

		@FindBy(how = How.ID, using = "imgClearName")
		public WebElement uIEmpSchoolClearButton;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "grdCBENames")
		public WebElement uIEmpSchoolGridTable;
	}

	public class ArrestSearch {

		public WebDriver driver;

		public ArrestSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_nbrCaseNo_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_lupCharge_CodeValue")
		public WebElement uIChargeEdit;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_nbrCaseNo_Number")
		public WebElement uICaseNoEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_imgClear")
		public WebElement uIDateClearButton;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_nbrBookingNoFrom_Year")
		public WebElement uIArrestFromYear;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_nbrBookingNoFrom_Number")
		public WebElement uIArrestFromNumber;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_nbrBookingNoTo_Year")
		public WebElement uIArrestToYear;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_nbrBookingNoTo_Number")
		public WebElement uIArrestToNumber;

		@FindBy(how = How.ID, using = "grdBooking")
		public WebElement uIResultTable;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_dttArrestDttmFrom_KPIDttmCtrl")
		public WebElement uIDateFromEdit;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_cddNameType_DropDown")
		public WebElement uINameTypeComboBox;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_excel.gif']")
		public WebElement uIExcelImageButton;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_addIncidentLoc_txtFrom")
		public WebElement uIArrestLocationEdit;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_addIncidentLoc_chkVerify")
		public WebElement uIArrestLocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_addRprtdLoc_txtFrom")
		public WebElement uIIncidentLocationEdit;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_addRprtdLoc_chkVerify")
		public WebElement uIIncidentLocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_cddHowArrested_DropDown")
		public WebElement uIHowComboBox;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_txtQAFormData")
		public WebElement uIQAFormDataEdit;

		@FindBy(how = How.ID, using = "tabBookiingSrch_tmpl0_UsrBookingSrchBasic1_dttArrestDttmTo_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.ID, using = "grdBooking_ctl00_lnkbtnNext")
		public WebElement uINextButton;

		@FindBy(how = How.ID, using = "grdBooking_ctl00_lnkbtnPrev")
		public WebElement uIPREVButton;
	}

	public class NameMerge {
		public WebDriver driver;
		public NameMergeScreenDetailsPopup nameMergeScreenDetailsPopup;

		public NameMerge() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.nameMergeScreenDetailsPopup == null)) {
				this.nameMergeScreenDetailsPopup = new NameMergeScreenDetailsPopup();
			}
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.ID, using = "txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_cmdReset")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_cmdSrch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_txtUNID")
		public WebElement uINameMergeUNTypeEdit;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_txtUNameTypeID")
		public WebElement uINameMergeUNIDEdit;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_txtULastName")
		public WebElement uINameMergeLastNameEdit;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_cmdSrch")
		public WebElement uINameMergeSearchButton;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_chkCheckAll")
		public WebElement uISelectAllCheckbox;

		@FindBy(how = How.ID, using = "cmdMerge")
		public WebElement uIMergeButton;

		@FindBy(how = How.XPATH, using = "//input[@value='Batch Merge']")
		public WebElement uIBatchMergeButton;

		@FindBy(how = How.XPATH, using = "//input[@value='imgDetail']")
		public WebElement uINameMergeInfoButton;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_grdNameMergeLst")
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

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Merge List')]")
		public WebElement uIMergeListTab;

		@FindBy(how = How.ID, using = "tabNameMerge_tmpl0_UsrNameMergeLst1_txtUFirstName")
		public WebElement uINameMergeFirstNameEdit;

		@FindBy(how = How.ID, using = "cmdMergeHistory")
		public WebElement uIMergeHistoryButton;

		@FindBy(how = How.ID, using = "grdUnmerge")
		public WebElement uIUnMergeDetailsResultTable;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIUnMergeCancelButton;

		@FindBy(how = How.ID, using = "cmdUnMerge")
		public WebElement uIUnMergeButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.XPATH, using = "  //div[@id='grdUnmerge']//tbody//tr[@class='graycolor']")
		public WebElement uIGreyOutRow;

	}

	public class NameMergeScreenDetailsPopup {

		public WebDriver driver;

		public NameMergeScreenDetailsPopup() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdMerge")
		public WebElement uIMergeButton;

		@FindBy(how = How.ID, using = "grdNameMerge")
		public WebElement uINameMergeDetailsResultTable;
	}

	public class Expungement {
		public WebDriver driver;

		public Expungement() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
		public WebElement uIAcknowledgeOKButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
		public WebElement uIAcknowledgeCancelButton;

		@FindBy(how = How.ID, using = "txtID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameType")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uINameEdit;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "txtReason")
		public WebElement uIReasonEdit;

		@FindBy(how = How.ID, using = "cmdExpunge")
		public WebElement uIDeleteNameButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintRecordsButton;

		@FindBy(how = How.ID, using = "chkActivity")
		public WebElement uIShowAllActivityCheckBox;

		@FindBy(how = How.ID, using = "grdActivity")
		public WebElement uIActivityResultGrid;

		@FindBy(how = How.ID, using = "grdBooking")
		public WebElement uIArrestResultGrid;

		@FindBy(how = How.XPATH, using = "//div[@class = 'modal-body']")
		public WebElement uIConfirmMessageTextView;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
		public WebElement uIOKButton;

		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "rdETCharges")
		public WebElement uIOneOrMoreChangesRadioButton;

		@FindBy(how = How.ID, using = "btnExpunge")
		public WebElement uIExpungeButton;

		@FindBy(how = How.ID, using = "btnSubmit")
		public WebElement uIYesButtonInPopup;

		@FindBy(how = How.ID, using = "btnCloseSuc")
		public WebElement uIClosePopupButton;

		@FindBy(how = How.ID, using = "KPILabel3")
		public WebElement uITextLabel;

		@FindBy(how = How.ID, using = "txtBookingNo_imgBtn")
		public WebElement uIArrestBubbleIcon;

		@FindBy(how = How.ID, using = "btnReInstateExpunge")
		public WebElement uIReInstateButton;

		@FindBy(how = How.ID, using = "lblExpungedby")
		public WebElement uIlblExpungedby;

		@FindBy(how = How.ID, using = "lblExpBy")
		public WebElement uIlblExpByOfficerName;

		@FindBy(how = How.ID, using = "lblExpDate")
		public WebElement uIExpByDateTime;

		@FindBy(how = How.ID, using = "lblReinstatedBy")
		public WebElement uIlblReinstatedBy;

		@FindBy(how = How.ID, using = "lblReinstatBy")
		public WebElement uIlblReinstatByOfficerName;

		@FindBy(how = How.ID, using = "lblReinstateDate")
		public WebElement uIReInstateDateTime;

		@FindBy(how = How.ID, using = "txtMsgCnt")
		public WebElement uIBookingCountEdit;

		@FindBy(how = How.ID, using = "rdETEntireArrest")
		public WebElement uIEntireArrestRadioButton;

		@FindBy(how = How.ID, using = "grdCharge")
		public WebElement uIChargeTable;

		@FindBy(how = How.ID, using = "grdFindReplace")
		public WebElement uIFindReplaceTable;

	}

	public class ExpungementSearch {
		public WebDriver driver;

		public ExpungementSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabExpSrch_tmpl0_usrExpNameBasic1_txtName")
		public WebElement uINameEdit;

		@FindBy(how = How.ID, using = "grdExpunge")
		public WebElement uIExpungementResultGrid;

		@FindBy(how = How.ID, using = "grdExpunge_ctl00")
		public WebElement uIExpungementExpandResultGrid;

		@FindBy(how = How.ID, using = "tabExpSrch_tmpl0_usrExpungementBasic1_lstJuris")
		public WebElement uIJurisDropdown;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Legacy Expungement')])")
		public WebElement uILegacyExpungementButton;

	}

	public class LineupSearch {
		public WebDriver driver;

		public LineupSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrLineupSrchAdv1_nmcSuspect_NameType")
		public WebElement uISuspectNameTypeEdit;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrLineupSrchAdv1_nmcSuspect_NameTypeID")
		public WebElement uISuspectNameIDEdit;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrLineupSrchAdv1_nbrCase_Year")
		public WebElement uICaseYearEdit;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrLineupSrchAdv1_nbrCase_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrLineupSrchAdv1_nbrLineup_Year")
		public WebElement uILineupYearEdit;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrLineupSrchAdv1_nbrLineup_Number")
		public WebElement uILineupNumberEdit;

		@FindBy(how = How.ID, using = "grdPhotoLineup")
		public WebElement uILineupSearchResultTable;

	}

	public class FIEntry {
		public WebDriver driver;
		public FIEntryNamesTab fIEntryNamesTab;
		public FIEntryNarrativeTab fIEntryNarrativeTab;

		public FIEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.fIEntryNamesTab == null)) {
				this.fIEntryNamesTab = new FIEntryNamesTab();
			}
			if ((this.fIEntryNarrativeTab == null)) {
				this.fIEntryNarrativeTab = new FIEntryNarrativeTab();
			}

		}

		@FindBy(how = How.ID, using = "numCallNo_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "numCallNo_Number")
		public WebElement uICallNumberEdit;

		@FindBy(how = How.ID, using = "lupOfficers_CodeValue")
		public WebElement uIOfficerEdit;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIFIActivityComboBox;

		@FindBy(how = How.ID, using = "cddDisposition_DropDown")
		public WebElement uIDispositionComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Name(s)')])")
		public WebElement uINamesTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Vehicle(s)')])")
		public WebElement uIVehiclesTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Narrative')])")
		public WebElement uINarrativeTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Map')])")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachments')])")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "adrMainAddress_chkVerify")
		public WebElement uILocationVerifyCheckBox;

		@FindBy(how = How.ID, using = "dtcRptTime_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtcRptTime_Time']//input")
		public WebElement uITimeEdit;

	}

	public class FIEntryNamesTab {
		public WebDriver driver;

		public FIEntryNamesTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_nmcFIName_NameType")
		public WebElement uINamesTabNameTypeEdit;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_nmcFIName_NameTypeID")
		public WebElement uINamesTabNameIDEdit;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_txtAddress")
		public WebElement uINamesTabAddressEdit;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_chkClothing")
		public WebElement uINamesTabClothingCheckBox;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_cddClothType_DropDown")
		public WebElement uIClothItemComboBox;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_cddClothColor_DropDown")
		public WebElement uIClothColorComboBox;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_txtDescription")
		public WebElement uIClothDescriptionEdit;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_cmdAddItem")
		public WebElement uIClothAddItemButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_cmdAddCloth")
		public WebElement uIClothSaveButton;

		@FindBy(how = How.XPATH, using = "(//img[@Id = 'close'])")
		public WebElement uIClothCloseImageButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_imgAddName")
		public WebElement uINamesTabAddItemButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_plcVehicle_PlateNumber")
		public WebElement uINamesTabVehicleEdit;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_plcVehicle_KPIState")
		public WebElement uINamesTabStateComboBox;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_plcVehicle_imgBtn")
		public WebElement uINamesTabVehcileLookupButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_cmdInternalSave")
		public WebElement uINamesTabSaveButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_grdNames")
		public WebElement uINameTabResultTable;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_nmcFIName_imgSrch")
		public WebElement uIFINameInfoIcon;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_imgClearName")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_imgAddName")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_nmcFIName_LastName")
		public WebElement uINamesTabLastNameEdit;

		@FindBy(how = How.ID, using = "tabFI_tmpl0_usrFINames1_nmcFIName_FirstName")
		public WebElement uINamesTabFirstNameEdit;
	}

	public class FIEntryNarrativeTab {
		public WebDriver driver;

		public FIEntryNarrativeTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabFI_tmpl2_usrFINarrative1_cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl2_usrFINarrative1_cmdInternalRefresh")
		public WebElement uIInternalResetButton;

		@FindBy(how = How.ID, using = "tabFI_tmpl2_usrFINarrative1_rteKPITxt_contentIframe")
		public WebElement uINarrativeRichTextEdit;

	}

	public class FISearch {
		public WebDriver driver;

		public FISearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrFISrchBasic1_cddFIActivity_DropDown")
		public WebElement uIFIActivityComboBox;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrFISrchBasic1_cddDisposition_DropDown")
		public WebElement uIDispositionComboBox;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrFISrchBasic1_txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabFISrch_tmpl0_UsrFISrchBasic1_txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "grdNameFI")
		public WebElement uIFIResultTable;
	}

	public class GunPermitSearch {
		public WebDriver driver;

		public GunPermitSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabGunPermitsSrch_tmpl0_usrGunPermitsSrchBasic1_lblDecal")
		public WebElement uICustomText;

		@FindBy(how = How.ID, using = "tabGunPermitsSrch_tmpl0_usrGunPermitsSrchBasic1_txtDecal")
		public WebElement uICustomEdit;

		@FindBy(how = How.ID, using = "grdGunPermits")
		public WebElement uIGunPermitResultGrid;

		@FindBy(how = How.ID, using = "tabGunPermitsSrch_tmpl0_usrGunPermitsSrchBasic1_cddPermitType_DropDown")
		public WebElement uIPermitTypeComboBox;

		@FindBy(how = How.ID, using = "tabGunPermitsSrch_tmpl0_usrGunPermitsSrchBasic1_cddPermitStatus_DropDown")
		public WebElement uIPermitStatusComboBox;

		@FindBy(how = How.ID, using = "tabGunPermitsSrch_tmpl0_usrGunPermitsSrchBasic1_txtSerial")
		public WebElement uISerialNoEdit;

		@FindBy(how = How.ID, using = "tabGunPermitsSrch_tmpl0_usrGunPermitsSrchBasic1_lupGunMake_CodeValue")
		public WebElement uIGunMakeCodeEdit;

		@FindBy(how = How.ID, using = "tabGunPermitsSrch_tmpl0_usrGunPermitsSrchBasic1_cddGunType_DropDown")
		public WebElement uIGunTypeComboBox;

	}

	public class GunPermitEntry {
		public WebDriver driver;
		public GunPermitEntryScreenTab gunPermitEntryScreenTab;
		public GunPermitEntryRID256Tab gunPermitEntryRID256Tab;

		public GunPermitEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.gunPermitEntryScreenTab == null)) {
				this.gunPermitEntryScreenTab = new GunPermitEntryScreenTab();
			}
			if ((this.gunPermitEntryRID256Tab == null)) {
				this.gunPermitEntryRID256Tab = new GunPermitEntryRID256Tab();
			}
		}

		@FindBy(how = How.ID, using = "nIssueToNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nIssueToNameID_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "nIssueToNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nIssueToNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtRejReason")
		public WebElement uIReasonEdit;

		@FindBy(how = How.ID, using = "cddPermitType_DropDown")
		public WebElement uIPermitTypeComboBox;

		@FindBy(how = How.ID, using = "cddPermitStatus_DropDown")
		public WebElement uIPermitStatusComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "imgNameFrontView")
		public WebElement uINameImageFrontViewButton;

		@FindBy(how = How.ID, using = "nIssueToNameID_imgWant")
		public WebElement uIWarrantIconButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Main')])")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Narrative')])")
		public WebElement uINarrativeTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachment')])")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Registration')])")
		public WebElement uIRegistrationTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'History')])")
		public WebElement uIHistoryTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'RID256')]")
		public WebElement uIRID256Tab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'QAForm')]")
		public WebElement uIQAFormTab;

	}

	public class GunPermitEntryScreenTab {
		public WebDriver driver;

		public GunPermitEntryScreenTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_lupPFID_CodeValue")
		public WebElement uIMainTabOfficerIDEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_dtAppDate_KPIDttmCtrl")
		public WebElement uIMainTabApplicationDateEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_dtReappplied_KPIDttmCtrl")
		public WebElement uIMainTabReappliedDateEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_dtIssueDttm_KPIDttmCtrl")
		public WebElement uIMainTabIssuedDateEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_dtCCHCheck_KPIDttmCtrl")
		public WebElement uIMainTabLastCCHCheckDateEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_dtExpiryDttm_KPIDttmCtrl")
		public WebElement uIMainTabExpiryDateEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_dtPurchaseDttm_KPIDttmCtrl")
		public WebElement uIMainTabPurchaseDateEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_lblDecalNo")
		public WebElement uIMainTabCustomText;

		@FindBy(how = How.ID, using = "tabGun_tmpl0_usrGunMain1_txtDecal")
		public WebElement uIMainTabCustomEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl3_UsrGunReg1_txtSerialNbr")
		public WebElement uIRegistrationTabSerialNoEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl3_UsrGunReg1_cddGunType_DropDown")
		public WebElement uIRegistrationTabGunTypeComboBox;

		@FindBy(how = How.ID, using = "tabGun_tmpl3_UsrGunReg1_lupGunMake_imgBtn")
		public WebElement uIRegistrationTabGunMakeLookup;

		@FindBy(how = How.ID, using = "tabGun_tmpl3_UsrGunReg1_lupGunMake_CodeValue")
		public WebElement uIRegistrationTabGunMakeEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl3_UsrGunReg1_txtGunCaliber")
		public WebElement uIRegistrationTabCaliberEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl3_UsrGunReg1_dtSoldSttm_KPIDttmCtrl")
		public WebElement uIRegistrationTabSoldDateEdit;

		@FindBy(how = How.ID, using = "tabGun_tmpl4_UsrGunHist1_grdPermits")
		public WebElement uIHistoryTabResultTable;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uINarrativeTabSubjectEdit;

		@FindBy(how = How.ID, using = "btnComments")
		public WebElement uINarrativeTabEnterCommentsButton;

		@FindBy(how = How.ID, using = "dtcCurrDate_KPIDttmCtrl")
		public WebElement uINarrativeTabDateEdit;

		@FindBy(how = How.ID, using = "grdComments")
		public WebElement uINarrativeTabResultTable;
	}

	public class GunPermitEntryRID256Tab {

		@FindBy(how = How.ID, using = "lupEntryOfficer_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupEntryOfficer_CodeDescription")
		public WebElement uIPFCodeDescriptionEdit;

		@FindBy(how = How.ID, using = "dttmEntry_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "rdo100010000261290_0")
		public WebElement uIYesRadioButton;

		@FindBy(how = How.ID, using = "rdo100010000261290_1")
		public WebElement uINoRadioButton;

		@FindBy(how = How.ID, using = "rdo100010000261294_0")
		public WebElement uITrueRadioButton;

		@FindBy(how = How.ID, using = "rdo100010000261294_1")
		public WebElement uIFalseRadioButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "lupEntryOfficer_imgBtn")
		public WebElement uIPFCodeLookupIcon;

		@FindBy(how = How.ID, using = "imgLock")
		public WebElement uILockButton;

		@FindBy(how = How.XPATH, using = "(//input[contains(@class,'textboxdatetime')])")
		public WebElement uITimeEdit;

	}

	public class DictionarytSearch {
		public WebDriver driver;

		public DictionarytSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

	}

	public class DictionaryEntry {
		public WebDriver driver;

		public DictionaryEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uINameEdit;

		@FindBy(how = How.ID, using = "txtNickName")
		public WebElement uINickNameEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

	}

	public class SuspectEntry {
		public WebDriver driver;

		public SuspectEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "custNames_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "custNames_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "adrAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "adrAddress_chkVerify")
		public WebElement uIAddressheckBox;

		@FindBy(how = How.ID, using = "cddSex_DropDown")
		public WebElement uISexComboBox;

		@FindBy(how = How.ID, using = "cddRace_DropDown")
		public WebElement uIRaceComboBox;

		@FindBy(how = How.ID, using = "txtHeight")
		public WebElement uIHeightEdit;

		@FindBy(how = How.ID, using = "txtHeight2")
		public WebElement uIHeight2Edit;

		@FindBy(how = How.ID, using = "txtWeight")
		public WebElement uIWeightEdit;

		@FindBy(how = How.ID, using = "txtWeight2")
		public WebElement uIWeight2Edit;

		@FindBy(how = How.ID, using = "cddEyes_DropDown")
		public WebElement uIEyesComboBox;

		@FindBy(how = How.ID, using = "cddHairColor_DropDown")
		public WebElement uIHairColorComboBox;

		@FindBy(how = How.ID, using = "txtAge")
		public WebElement uIAgeEdit;

		@FindBy(how = How.ID, using = "txtAge2")
		public WebElement uIAge2Edit;

		@FindBy(how = How.ID, using = "cddClothType_DropDown")
		public WebElement uIItemComboBox;

		@FindBy(how = How.ID, using = "cddClothColor_DropDown")
		public WebElement uIColorComboBox;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "cmdAddItem")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClearItem")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdItem")
		public WebElement uIItemTable;

		@FindBy(how = How.ID, using = "lupMarks_CodeValue")
		public WebElement uIScarMarksEdit;

		@FindBy(how = How.ID, using = "lupMarks_imgBtn")
		public WebElement uIScarMarksLookupButton;

		@FindBy(how = How.ID, using = "cmdAddSMT")
		public WebElement uIAddSMTButton;

		@FindBy(how = How.ID, using = "cmdClearSMT")
		public WebElement uIClearSMTButton;

		@FindBy(how = How.ID, using = "grdMarks")
		public WebElement uIScarMarksTable;

		@FindBy(how = How.ID, using = "txtPlateNo")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "cddState_DropDown")
		public WebElement uIPlateStateComboBox;

		@FindBy(how = How.ID, using = "txtPlateDesc")
		public WebElement uIVehicleDetailsEdit;

		@FindBy(how = How.ID, using = "txtMake")
		public WebElement uIMakeEdit;

		@FindBy(how = How.ID, using = "cddColor1_DropDown")
		public WebElement uIColor1ComboBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//div[@class='statusbar']/b")
		public WebElement uIStatusBar;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
	      public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "numCallNo_imgBtn")
		public WebElement uICallNoInfoIcon;
		
		@FindBy(how = How.ID, using = "numCaseNo_imgBtn")
		public WebElement uICaseNoInfoIcon;
	}

	public class SuspectSearch {
		public WebDriver driver;

		public SuspectSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtLastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtFirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_cddSex_DropDown")
		public WebElement uISexComboBox;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_cddRace_DropDown")
		public WebElement uIRaceComboBox;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtFromHt")
		public WebElement uIHeightEdit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtToHT")
		public WebElement uIHeight2Edit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtFromWT")
		public WebElement uIWeightEdit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtToWT")
		public WebElement uIWeight2Edit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_cddEyes_DropDown")
		public WebElement uIEyesComboBox;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_cddHair_DropDown")
		public WebElement uIHairColorComboBox;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtStartAge")
		public WebElement uIAgeEdit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtEndAge")
		public WebElement uIAge2Edit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtPlate")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_cddState_DropDown")
		public WebElement uIPlateStateComboBox;

		@FindBy(how = How.ID, using = "tabSuspSrch_tmpl0_UsrSuspSrchBasic1_txtVehDtl")
		public WebElement uIVehicleDetailsEdit;

		@FindBy(how = How.XPATH, using = "//span[@title='Search']")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[@title='Print']")
		public WebElement uIPrintButton;

		@FindBy(how = How.XPATH, using = "//span[contains(@title,'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "//span[@title='Reset']")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdSuspect")
		public WebElement uISuspectTable;
		
		  @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		     public WebElement uIBottomLeftSideStatusBar;

				@FindBy(how = How.ID, using = "cmdSave")
				public WebElement uIPopupSaveButton;

				@FindBy(how = How.ID, using = "cmdClose")
				public WebElement uIPopupCloseButton;

	}

	public class SocialMediaSites {

		public WebDriver driver;

		public SocialMediaSites() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddMediaType_DropDown")
		public WebElement uISocialMediaTypeComboBox;

		@FindBy(how = How.ID, using = "cddUCCategory_DropDown")
		public WebElement uIUCCategoryComboBox;

		@FindBy(how = How.ID, using = "txtUCName")
		public WebElement uIUCNameEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cmdMediaSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdUCSocialMediaSites")
		public WebElement uISocialMediaSitesResultTable;
		
		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInActiveCheckBox;
		

	}

	public class SocialMediaSitesEntry {
		public WebDriver driver;

		public SocialMediaSitesEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSetupSocialMedia")
		public WebElement uISetupSocialMediaButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.XPATH, using = "(//div[@id = 'divSelectedSocialMedia']//span[@class='spnSelMedia'])")
		public WebElement uISelectedsocialMediaDescriptionTextView;

		@FindBy(how = How.XPATH, using = "(//div[@id = 'divMediaType']//a/img[@id='Img_GPLUS'])")
		public WebElement uIMediaTypeIconGplusImageView;

		@FindBy(how = How.XPATH, using = "(//div[@id = 'divMediaType']//a/img[@id='Img_11'])")
		public WebElement uIMediaTypeIconTwitterImageView;

		@FindBy(how = How.ID, using = "cddUCSite_DropDown")
		public WebElement uIUCCategoryComboBox;

		@FindBy(how = How.ID, using = "txtUCName")
		public WebElement uIUCAccountNameEdit;

		@FindBy(how = How.ID, using = "txtURL")
		public WebElement uIURLEdit;

		@FindBy(how = How.ID, using = "txtUserName")
		public WebElement uIUCUserNameEdit;

		@FindBy(how = How.ID, using = "txtPassword")
		public WebElement uIUCAccountPasswordEdit;

		@FindBy(how = How.ID, using = "txtSiteID")
		public WebElement uISiteIDNoEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cmdLaunchBrowser")
		public WebElement uILaunchBrowserButton;

		@FindBy(how = How.ID, using = "grdSocialMediaSites")
		public WebElement uISocialMediaSitesEntryResultTable;
		
		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
		public WebElement uIBottomMessage;
		
		
	}

	public class SocialMediaSearch {
		public WebDriver driver;

		public SocialMediaSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupVerifiedPFID_CodeValue")
		public WebElement uIInformationVerifiedbyPFEdit;

		@FindBy(how = How.ID, using = "nbrSocialMedia_Year")
		public WebElement uIConfidentialSourceIDYearEdit;

		@FindBy(how = How.ID, using = "nbrSocialMedia_Number")
		public WebElement uIConfidentialSourceIDNumberEdit;

		@FindBy(how = How.ID, using = "ddlUCSite")
		public WebElement uIUCAccountNameComboBox;

		@FindBy(how = How.ID, using = "txtSiteID")
		public WebElement uISiteIDEdit;

		@FindBy(how = How.ID, using = "dtcVerifyDttm_KPIDttmCtrl")
		public WebElement uIInformationVerifiedFromDateEdit;

		@FindBy(how = How.ID, using = "dtcVerifyDttmTo_KPIDttmCtrl")
		public WebElement uIInformationVerifiedToDateEdit;

		@FindBy(how = How.ID, using = "dtcReminderDttm_KPIDttmCtrl")
		public WebElement uINextRemiderByDateEdit;

		@FindBy(how = How.ID, using = "cmdMediaSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdMediaReset")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdBatchUpdate")
		public WebElement uIBatchUpdateButton;

		@FindBy(how = How.ID, using = "grdSocialMediaSites")
		public WebElement uISocialMediaSearchResultTable;

		@FindBy(how = How.ID, using = "lupUpdateVerifyPF_CodeValue")
		public WebElement uIUpdateVerifiedPFEdit;

		@FindBy(how = How.ID, using = "dtcNxtReminderDttm_KPIDttmCtrl")
		public WebElement uIUpdateNextRemiderByDateEdit;

		@FindBy(how = How.ID, using = "cmdUpdate")
		public WebElement uIUpdateButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelButton;
		
		@FindBy(how = How.ID, using = "lstJuris")									//Added by Abi
		public WebElement uIJurisCombobox;

	}

	public class AdditionalNumberScreen {
		public WebDriver driver;

		public AdditionalNumberScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "txtNumber")
		public WebElement uINumberEdit;

		@FindBy(how = How.ID, using = "txtComment")
		public WebElement uICommentEdit;

		@FindBy(how = How.ID, using = "cmdAddNumber")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClearNumber")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "grdNumber")
		public WebElement uIAdditionalNumberResultGrid;

	}

	public class CellStatus {
		public WebDriver driver;

		public CellStatus() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cddFacility_DropDown")
		public WebElement uIFacilityComboBox;

		@FindBy(how = How.ID, using = "cddInmateType_DropDown")
		public WebElement uIInmateTypeComboBox;

		@FindBy(how = How.ID, using = "cddCellNo")
		public WebElement uICellNoComboBox;

		@FindBy(how = How.ID, using = "chkShowOccupiedCell")
		public WebElement uIShowOnlyOccupaiedCheckBox;

		@FindBy(how = How.ID, using = "chkGroupBySex")
		public WebElement uIGroupByCheckBox;

		@FindBy(how = How.ID, using = "chkGroupByFacility")
		public WebElement uIGroupByFacilityCheckBox;

		@FindBy(how = How.ID, using = "chkCellSelect")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "cmdBatchUpdate")
		public WebElement uIBatchUpdateButton;

		@FindBy(how = How.ID, using = "cmdCellCheck")
		public WebElement uICellCheckButton;

		@FindBy(how = How.ID, using = "cmdCellUpdate")
		public WebElement uICellUpdateButton;

		@FindBy(how = How.ID, using = "cmdCellAssign")
		public WebElement uIAssignCellButton;

		@FindBy(how = How.ID, using = "cmdViewCamera")
		public WebElement uIViewCameraButton;

		@FindBy(how = How.ID, using = "grdJailStatus")
		public WebElement uICellStatusResultTable;

		@FindBy(how = How.ID, using = "txtCellNo")
		public WebElement uPopupCellNoEdit;

		@FindBy(how = How.ID, using = "BtnCategory1")
		public WebElement uIPopupCategoryDamageButton;

		@FindBy(how = How.ID, using = "BtnCategory2")
		public WebElement uIPopupCategoryCellCheckButton;

		@FindBy(how = How.ID, using = "BtnActivity1")
		public WebElement uIPopupActivityOkayAwakeButton;


		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uIPopupNotesEdit;

      @FindBy(how = How.ID, using = "cmdRefresh")
       public WebElement uIResetButton;
      

      @FindBy(how = How.ID, using = "numCallNo_imgBtn")
      public WebElement uICallNoInfoIcon;
      
      @FindBy(how = How.ID, using = "numCaseNo_imgBtn")
      public WebElement uICaseNoInfoIcon;

      @FindBy(how = How.ID, using = "cmdSave")
      public WebElement uIPopupSaveButton;

      @FindBy(how = How.ID, using = "cmdClose")
      public WebElement uIPopupCloseButton;
     
      @FindBy(how = How.XPATH, using = "//td[@class='statusBar']/b")
		public WebElement uILeftSideStatusBar;
	}


	public class CellStatusArrestEntry {
		public WebDriver driver;
		public CellStatusArrestEntryCellTab cellStatusArrestEntryCellTab;

		public CellStatusArrestEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.cellStatusArrestEntryCellTab == null)) {
				this.cellStatusArrestEntryCellTab = new CellStatusArrestEntryCellTab();
			}
		}

		@FindBy(how = How.ID, using = "txtNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "txtNameID_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "txtNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_imgSrch")
		public WebElement uINameInfoButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Cell')]")
		public WebElement uICellTab;

	}

	public class CellStatusArrestEntryCellTab {
		public WebDriver driver;

		public CellStatusArrestEntryCellTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "btnCellHistory")
		public WebElement uICellHistoryButton;

		@FindBy(how = How.ID, using = "btnAddActivity")
		public WebElement uIAddActivityButton;

		@FindBy(how = How.ID, using = "btnDetention")
		public WebElement uIDetentionRecordButton;

		@FindBy(how = How.ID, using = "btnAttachment")
		public WebElement uIAttachmentButton;

		@FindBy(how = How.ID, using = "btnCellCheck")
		public WebElement uICellCheckButton;

		@FindBy(how = How.ID, using = "hypQA0")
		public WebElement uIQAFormButton;

		@FindBy(how = How.ID, using = "cddCustReason_DropDown")
		public WebElement uICustodyReasonComboBox;

		@FindBy(how = How.ID, using = "txtCustAlert")
		public WebElement uICustodyAlertEdit;

		@FindBy(how = How.ID, using = "cddRiskLevel_DropDown")
		public WebElement uIRiskLevelComboBox;

		@FindBy(how = How.ID, using = "txtCellNo")
		public WebElement uIAssignCellEdit;

		@FindBy(how = How.ID, using = "ImgParentCell")
		public WebElement uIAssignCellInfoButton;

		@FindBy(how = How.ID, using = "lupAssignedBy_CodeValue")
		public WebElement uIAssignByPFEdit;

		@FindBy(how = How.ID, using = "dttAssignedDate_Date_KPIDttmCtrl")
		public WebElement uIAssignedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttAssignedDate_Time']//input")
		public WebElement uIAssignedTimeEdit;

		@FindBy(how = How.ID, using = "btnBacktoCell")
		public WebElement uIBacktoCellButton;

		@FindBy(how = How.ID, using = "txtRemarks")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "cddTempLocation_DropDown")
		public WebElement uITemporaryLocationComboBox;

		@FindBy(how = How.ID, using = "dttMoved_Date_KPIDttmCtrl")
		public WebElement uIMovedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttMoved_Time']//input")
		public WebElement uIMovedTimeEdit;

		@FindBy(how = How.ID, using = "txtTempRemarks")
		public WebElement uITempRemarksEdit;

		@FindBy(how = How.ID, using = "chkRelease")
		public WebElement uIRemoveCheckBox;

		@FindBy(how = How.ID, using = "lupRleasedBy_CodeValue")
		public WebElement uIRemovedByPFEdit;

		@FindBy(how = How.ID, using = "dttReleaseDate_Date_KPIDttmCtrl")
		public WebElement uIRemovedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttReleaseDate_Time']//input")
		public WebElement uIRemovedTimeEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "BtnCategory3")
		public WebElement uIPopupCategoryDetaineeButton;

		@FindBy(how = How.ID, using = "BtnCategory4")
		public WebElement uIPopupCategoryDetaineeMealsButton;

		@FindBy(how = How.ID, using = "BtnActivity2")
		public WebElement uIPopupActivityMealCompletedButton;

		@FindBy(how = How.ID, using = "BtnActivity1")
		public WebElement uIPopupActivityProvidedaMealButton;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uIPopupNotesEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIPopupSaveButton;

		@FindBy(how = How.ID, using = "cmdNew")
		public WebElement uIPopupNewButton;

		@FindBy(how = How.ID, using = "cmdClose")
		public WebElement uIPopupCloseButton;

		@FindBy(how = How.ID, using = "cmdLog")
		public WebElement uIPopupViewTodaysLogButton;

		@FindBy(how = How.XPATH, using = "//tr/td/a[contains(text(), 'Auto QA Form')")
		public WebElement uIAutoQAFormLink;

		@FindBy(how = How.ID, using = "hypQA0")
		public WebElement uIAutoQAFormLinkButton;
	}

	public class NameMapScreen {
		public WebDriver driver;

		public NameMapScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkOverLayYrs")
		public WebElement uIOverLayCheckBox;

		@FindBy(how = How.ID, using = "cddPeriod")
		public WebElement uIOverLayCurrentPeriodComboBox;

		@FindBy(how = How.ID, using = "dtcFromDate_Date_KPIDttmCtrl")
		public WebElement uIFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtcFromDate_Time']//input")
		public WebElement uIFromTimeEdit;

		@FindBy(how = How.ID, using = "dtcToDate_Date_KPIDttmCtrl")
		public WebElement uIToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtcToDate_Time']//input")
		public WebElement uIToTimeEdit;

		@FindBy(how = How.ID, using = "cddCADCFS_Input")
		public WebElement uICADCFSComboBox;

		@FindBy(how = How.ID, using = "cddPointLayers_Input")
		public WebElement uISelectOverLayComboBox;

		@FindBy(how = How.ID, using = "cmdUpdateLatLong")
		public WebElement uIUpdateLatLongButton;

		@FindBy(how = How.XPATH, using = "//tr/td/button[contains(text(), 'Reset')")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtPlaceSrch")
		public WebElement uILocationEdit;
	}

	public class PhotoLineupEntry {
		public WebDriver driver;

		public PhotoLineupEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetIconButton;

		@FindBy(how = How.ID, using = "DttmLineup_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "nbrLineUP_Year")
		public WebElement uILineupYearEdit;

		@FindBy(how = How.ID, using = "nbrLineUP_Number")
		public WebElement uILineupNumberEdit;

		@FindBy(how = How.ID, using = "nmcSuspect_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "nmcSuspect_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "nmcSuspect_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcSuspect_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdBuildLine")
		public WebElement uIBuildLineupButton;

		@FindBy(how = How.ID, using = "txtPhoSel")
		public WebElement uIPhotoSelectedEdit;

		@FindBy(how = How.ID, using = "cmdBuildLine")
		public WebElement uIViewPhotoLineupButton;

		@FindBy(how = How.ID, using = "nbrCaseNo_Year")
		public WebElement uICaseNoYearEdit;

		@FindBy(how = How.ID, using = "nbrCaseNo_Number")
		public WebElement uICaseNumberEdit;

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerCodeEdit;

		@FindBy(how = How.ID, using = "dttmOfficer_Date_KPIDttmCtrl")
		public WebElement uIOfficerDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmOfficer_Time']//input")
		public WebElement uIOfficerTimeEdit;

		@FindBy(how = How.ID, using = "nmeVicWit_NameType")
		public WebElement uIVictimWitnessNameTypeEdit;

		@FindBy(how = How.ID, using = "nmeVicWit_NameTypeID")
		public WebElement uIVictimWitnesNameTypeID;

		@FindBy(how = How.ID, using = "cddSelPhoto")
		public WebElement uIPhotoSelectComboBox;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdCaseDtls")
		public WebElement uIPhotoLineupCaseDetailsResultTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cddSex_DropDown")
		public WebElement uISexComboBox;

		@FindBy(how = How.ID, using = "cddRace_DropDown")
		public WebElement uIRaceComboBox;

		@FindBy(how = How.ID, using = "txtAge")
		public WebElement uIAgeEdit;

		@FindBy(how = How.ID, using = "nmeVicWit_LastName")
		public WebElement uIVictimLastNameEdit;

		@FindBy(how = How.ID, using = "nmeVicWit_FirstName")
		public WebElement uIVictimFirstNameEdit;
	}

	public class BuildPhotoLineup {
		public WebDriver driver;

		public BuildPhotoLineup() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "DttmPrint_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "nbrLineUP_Year")
		public WebElement uILineupYearEdit;

		@FindBy(how = How.ID, using = "nbrLineUP_Number")
		public WebElement uILineupNumberEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='cmdPrintSave']")
		public WebElement uISaveandViewButton;

		@FindBy(how = How.ID, using = "cmdAddImg")
		public WebElement uIBuildLineupButton;

		@FindBy(how = How.ID, using = "lupOfficer_CodeValue")
		public WebElement uIOfficerCodeEdit;

		@FindBy(how = How.ID, using = "cmdRandomSelect")
		public WebElement uIAutoRandomSelectButton;

		@FindBy(how = How.XPATH, using = "//div[@id='PrevPanal']//div[@id='dvimg_1']")
		public WebElement uIImagePosition1;

		@FindBy(how = How.ID, using = "dvimg_2")
		public WebElement uIImagePosition2;

		@FindBy(how = How.ID, using = "dvimg_3")
		public WebElement uIImagePosition3;

		@FindBy(how = How.ID, using = "dvimg_4")
		public WebElement uIImagePosition4;

		@FindBy(how = How.ID, using = "dvimg_5")
		public WebElement uIImagePosition5;

		@FindBy(how = How.ID, using = "dvimg_6")
		public WebElement uIImagePosition6;

		@FindBy(how = How.ID, using = "cmdPreview")
		public WebElement uIPreviewLineUpButton;

	}

	public class ContactEntry {
		public WebDriver driver;

		public ContactEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddRelation_Input")
		public WebElement uINameRelationCombobox;

		@FindBy(how = How.ID, using = "cddRelation_Arrow")
		public WebElement uINameRelationArrow;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "txtNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneType_DropDown")
		public WebElement uIPhoneTypeComboBox;

		@FindBy(how = How.ID, using = "txtNumber_1_PhoneNumber")
		public WebElement uIPhoneNumberEdit;

		@FindBy(how = How.ID, using = "chkIsdisasosiate")
		public WebElement uIInactiveCheckbox;

		@FindBy(how = How.ID, using = "dttmInActive_KPIDttmCtrl")
		public WebElement uIInactiveDateEdit;

	}

	public class GangSearch {
		public WebDriver driver;

		public GangSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "txtGang")
		public WebElement uIGangNameEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIIncludeInactiveCheckBox;

		@FindBy(how = How.ID, using = "grdGang")
		public WebElement uIGangSearchGridTable;

	}

	public class GangMasterEntry {
		public WebDriver driver;
		public IdentificationTab identificationTab;
		public MembersTab membersTab;
		public GangMapTab gangMapTab;
		public GangVehicleTab gangVehicleTab;
		public GangActivityTab gangActivityTab;
		public GangNotesTab gangNotesTab;

		public GangMasterEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.identificationTab == null)) {
				this.identificationTab = new IdentificationTab();
			}
			if ((this.membersTab == null)) {
				this.membersTab = new MembersTab();
			}
			if ((this.gangMapTab == null)) {
				this.gangMapTab = new GangMapTab();
			}
			if ((this.gangVehicleTab == null)) {
				this.gangVehicleTab = new GangVehicleTab();
			}
			if ((this.gangActivityTab == null)) {
				this.gangActivityTab = new GangActivityTab();
			}
			if ((this.gangNotesTab == null)) {
				this.gangNotesTab = new GangNotesTab();
			}
		}

		@FindBy(how = How.ID, using = "txtGungName")
		public WebElement uIGangNameEdit;

		@FindBy(how = How.ID, using = "dtcEstablished_KPIDttmCtrl")
		public WebElement uIDateEstablishedEdit;

		@FindBy(how = How.ID, using = "txtEstimatedMembers")
		public WebElement uIEstimatedMembersEdit;

		@FindBy(how = How.ID, using = "chkInactive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
		public WebElement uIAddress1Edit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uIAddress2Edit;

		@FindBy(how = How.ID, using = "adrMainAddress_chkVerify")
		public WebElement uIAddress1VerifyCheckBox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Identification')])")
		public WebElement uIIdentificationTab;

		@FindBy(how = How.XPATH, using = "(//div[@id='tabGang']//span[contains(text(),'Members')])")
		public WebElement uIMembersTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Vehicle')])")
		public WebElement uIVehicleTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Map')])")
		public WebElement uIMapTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachments')])")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Activity')])")
		public WebElement uIActivityTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Notes')])")
		public WebElement uINotesTab;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class IdentificationTab {
		public WebDriver driver;

		public IdentificationTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_cddIdentificationType_DropDown")
		public WebElement uIIdentificationTypeComboBox;

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_lblIdentification")
		public WebElement uITypeCodeTextView;

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_cddIdentification_DropDown")
		public WebElement uITypeCodeComboBox;

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "grdGangIdentification")
		public WebElement uIIdentificationTable;

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_cmdAddIdentification")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_lblIdentification")
		public WebElement uIIdentificationLabelTextView;

		@FindBy(how = How.ID, using = "cmdUpdate")
		public WebElement uIUpdateButton;

		@FindBy(how = How.ID, using = "cmdAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_cddSymbos_DropDown")
		public WebElement uISymbolsComboBox;

		@FindBy(how = How.ID, using = "tabGang_tmpl0_usrGangIdentification_lblClothingType")
		public WebElement uIClothingTypeLabelTextView;

		// [FindsBy(How = How.XPATH, using = "//iframe[@id
		// ='tabGang_tmpl0_usrGangIdentification_frmMemberImages']//input[@id=
		// 'cmdUpdate']")
		// public WebElement uIUpdateButton;

		// [FindsBy(How = How.XPATH, using = "//iframe[@id
		// ='tabGang_tmpl0_usrGangIdentification_frmMemberImages']//input[@id=
		// 'cmdAddNew']")
		// public WebElement uIAddNewButton;

	}

	public class MembersTab {
		public WebDriver driver;

		public MembersTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabGang_tmpl1_usrGangMembers_nIssueToNameID_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabGang_tmpl1_usrGangMembers_nIssueToNameID_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "tabGang_tmpl1_usrGangMembers_nIssueToNameID_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabGang_tmpl1_usrGangMembers_nIssueToNameID_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabGang_tmpl1_usrGangMembers_btnAffiliate")
		public WebElement uIAffiliateNameToGangButton;

		@FindBy(how = How.ID, using = "tabGang_tmpl1_usrGangMembers_grdGangMember")
		public WebElement uIMembersTable;

		// @FindBy(how = How.XPATH, using = "(//img[@Id =
		// 'tabGang_tmpl1_usrGangMembers_grdGangMember_it20_0_IsNameMining'])")
		// public WebElement uINameMiningImageIcon1;

		@FindBy(how = How.XPATH, using = "//div[@id = 'tabGang_tmpl1_usrGangMembers_grdGangMember'] //img[@id='tabGang_tmpl1_usrGangMembers_grdGangMember_it20_0_IsNameMining']")
		public WebElement uINameMiningImageIcon1;

	}

	public class GangMapTab {
		public WebDriver driver;

		public GangMapTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabGang_tmpl2_usrGangMap_cmdMapLayer")
		public WebElement uIMapLayerButtonButton;

		@FindBy(how = How.ID, using = "pac-input")
		public WebElement uISearchTheMapEdit;

		@FindBy(how = How.ID, using = "tabGang_tmpl2_usrGangMap_cddPointLayers_DropDown")
		public WebElement uISelectOverlayComboBox;

		@FindBy(how = How.ID, using = "tabGang_tmpl2_usrGangMap_cddPointLayers_Input")
		public WebElement uISelectOverlayRadControlComboBox;

	}

	public class GangVehicleTab {
		public WebDriver driver;

		public GangVehicleTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "pltVehicle_PlateNumber")
		public WebElement uIVehicleEdit;

		@FindBy(how = How.ID, using = "pltVehicle_KPIState")
		public WebElement uIVehicleStateComboBox;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "grdVehicle")
		public WebElement uIVehicleTabTable;

		@FindBy(how = How.ID, using = "cmdInternalSave")
		public WebElement uIInternalSaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIInternalResetButton;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;
	}

	public class GangActivityTab {
		public WebDriver driver;

		public GangActivityTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddActivity")
		public WebElement uIActivityComboBox;

		@FindBy(how = How.ID, using = "chkCollapse")
		public WebElement uICollapseAllCheckBox;

		@FindBy(how = How.ID, using = "rdoGroupActivity_0")
		public WebElement uIDateRadioButton;

		@FindBy(how = How.ID, using = "rdoGroupActivity_1")
		public WebElement uIActivityButton;

		@FindBy(how = How.ID, using = "grdActivity")
		public WebElement uIActivityTabTable;
	}

	public class GangNotesTab {
		public WebDriver driver;

		public GangNotesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dttmDate_Date_KPIDttmCtrl")
		public WebElement uIUpdateDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttmDate_Time']//input")
		public WebElement uIUpdateTimeEdit;

		@FindBy(how = How.ID, using = "lupBy_CodeValue")
		public WebElement uIUpdatedByCodeEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdReset")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "chkShowAll")
		public WebElement uIShowAllCheckBox;

		@FindBy(how = How.ID, using = "grdGangNotes")
		public WebElement uIGangNotesTabTable;

		@FindBy(how = How.ID, using = "grdGangNotes_ctl00_btnDelete")
		public WebElement uIDeleteIcon;

		@FindBy(how = How.ID, using = "grdGangNotes_ctl00_btnEdit")
		public WebElement uIEditIcon;

		@FindBy(how = How.ID, using = "txtEditComments")
		public WebElement uIPopupNotesEdit;

		@FindBy(how = How.ID, using = "btnUpdate")
		public WebElement uIPopupSaveButton;

		@FindBy(how = How.ID, using = "btnCancel")
		public WebElement uIPopupCancelButton;

		@FindBy(how = How.XPATH, using = "//table[@id ='grdGangNotes']//div[@class='HistoryComments']")
		public WebElement uINotesGridCommentsText;
	}

	public class GangDetailEntry {

		public WebDriver driver;
		public GangDetailMainTab gangDetailMainTab;
		public GangDetailIdentificationTab gangDetailIdentificationTab;
		public GangDetailNotesTab gangDetailNotesTab;

		public GangDetailEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.gangDetailMainTab == null)) {
				this.gangDetailMainTab = new GangDetailMainTab();
			}
			if ((this.gangDetailIdentificationTab == null)) {
				this.gangDetailIdentificationTab = new GangDetailIdentificationTab();
			}
			if ((this.gangDetailNotesTab == null)) {
				this.gangDetailNotesTab = new GangDetailNotesTab();
			}
		}

		@FindBy(how = How.ID, using = "cddgangName")
		public WebElement uIGangNameComboBox;

		@FindBy(how = How.ID, using = "NmNameDetail_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "NmNameDetail_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "NmNameDetail_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "NmNameDetail_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Identification')]")
		public WebElement uIIdentificationTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes')]")
		public WebElement uINotesTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "NmNameDetail_imgSrch")
		public WebElement uINameInfoIcon;

	}

	public class GangDetailMainTab {

		public WebDriver driver;

		public GangDetailMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_dttmAffliateDate_KPIDttmCtrl")
		public WebElement uIAffiliationDateEdit;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_cddStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_dttmCurrentStatusDate_KPIDttmCtrl")
		public WebElement uICurrentStatusDateEdit;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_cddRank_DropDown")
		public WebElement uIRankComboBox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_txtCriteria")
		public WebElement uILevelOfCriteriaEdit;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_txtGangSet")
		public WebElement uIGangSetEdit;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_txtLocationOfActivity")
		public WebElement uILocationOfActivityEdit;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_cddPatrolArea_DropDown")
		public WebElement uIPatrolAreaComboBox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_ChkJudicalFind")
		public WebElement uIJudicialFindingcheckbox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_ChkTattoos")
		public WebElement uIGangTattoosCheckbox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_ChkInternet")
		public WebElement uIInternetRecruitmentCheckbox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_ChkPossession")
		public WebElement uIPossessionOfGangMaterialCheckbox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_ChkSelfAdmission")
		public WebElement uISelfAdmissionCheckbox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl0_usrMainGang_txtSocialMedia")
		public WebElement uISocialMediaNotesEdit;

	}

	public class GangDetailIdentificationTab {

		public WebDriver driver;

		public GangDetailIdentificationTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl1_usrGangIdentification_cddIdentificationType_DropDown")
		public WebElement uIIdentificationTypeComboBox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl1_usrGangIdentification_lblIdentification")
		public WebElement uITypeCodeTextView;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl1_usrGangIdentification_cddIdentification_DropDown")
		public WebElement uITypeCodeComboBox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl1_usrGangIdentification_txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl1_usrGangIdentification_cmdAddIdentification")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdGangIdentification")
		public WebElement uIIdentificationTable;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl1_usrGangIdentification_cddGraffiti_DropDown")
		public WebElement uIGraffitiComboBox;

		@FindBy(how = How.ID, using = "tabGangDetail_tmpl1_usrGangIdentification_lblClothingType")
		public WebElement uIClothingTypeLabelTextView;
	}

	public class GangDetailNotesTab {
		public WebDriver driver;

		public GangDetailNotesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dttmDate_Date_KPIDttmCtrl")
		public WebElement uIUpdateDateEdit;

		@FindBy(how = How.ID, using = "lupBy_CodeValue")
		public WebElement uIUpdatedByCodeEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uIAddButton;

	}

	public class ArrestSearchHelpWindow {
		public WebDriver driver;

		public ArrestSearchHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "grdBooking")
		public WebElement uIResultTable;
	}

	public class QuickName {
		public WebDriver driver;

		public QuickName() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "custNames_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "custNames_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "btnSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdInternalRefresh")
		public WebElement uIResetButton;
	}

	public class IncidentNames {

		public WebDriver driver;

		public IncidentNames() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "nmcIncident_imgSrch")
		public WebElement uINameSearchButton;

		@FindBy(how = How.ID, using = "chkIncidentAddr")
		public WebElement uISameAsIncidentAddressCheckbox;

		@FindBy(how = How.ID, using = "adrRelAddress_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "adrRelAddress_chkVerify")
		public WebElement uIAddressCheckbox;

		@FindBy(how = How.ID, using = "cmdAddorUpdate")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "txtNameContact1_PhoneNumber")
		public WebElement uIPhoneNo1Edit;

		@FindBy(how = How.ID, using = "txtNameContact2_PhoneNumber")
		public WebElement uIPhoneNo2Edit;

		@FindBy(how = How.ID, using = "dtDOB_KPIDttmCtrl")
		public WebElement uIBirthDateEdit;

		@FindBy(how = How.ID, using = "txtAge")
		public WebElement uIAgeEdit;

		@FindBy(how = How.ID, using = "cddGender_DropDown")
		public WebElement uISexComboBox;

		@FindBy(how = How.ID, using = "cddRace_DropDown")
		public WebElement uIRaceComboBox;

		@FindBy(how = How.ID, using = "cddEthnicity_DropDown")
		public WebElement uIEthnicComboBox;

		@FindBy(how = How.ID, using = "cddActivity_DropDown")
		public WebElement uIActivityComboBox;

	}

	public class ArrestEntryForCharge {
		public WebDriver driver;

		public ArrestEntryForCharge() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCharge_CodeValue")
		public WebElement uICharge;

		@FindBy(how = How.ID, using = "lupModifier_CodeValue")
		public WebElement uIChargeModifier;

		@FindBy(how = How.ID, using = "lupModifier_imgBtn")
		public WebElement uIChargeModifierLup;

		@FindBy(how = How.ID, using = "imgAddCharge")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClearCharge")
		public WebElement uIResetCharge;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNClose;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISave;

		@FindBy(how = How.ID, using = "grdChargeModifier")
		public WebElement uIChargeTable;

		@FindBy(how = How.ID, using = "grdSrch")
		public WebElement uIChargeCodedSearchTable;

	}

	public class ArrestExpungement {
		public WebDriver driver;

		public ArrestExpungement() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "rdETCharges")
		public WebElement uIOneOrMoreCharge;

		@FindBy(how = How.ID, using = "grdCharge")
		public WebElement uIChargeTable;

		@FindBy(how = How.ID, using = "txtReason")
		public WebElement uIReasonEdit;

		@FindBy(how = How.ID, using = "btnExpunge")
		public WebElement uIExpungeButton;

		@FindBy(how = How.ID, using = "btnSubmit")
		public WebElement uIYesExpungeButton;

	}

	public class ExpungementSearchLegacyWindow {
		public WebDriver driver;

		public ExpungementSearchLegacyWindow() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabExpSrch_tmpl0_usrExpNameBasic1_lstJuris")
		public WebElement uIJuris;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdExpunge_ctl00")
		public WebElement uIExpungementSearchResultGrid;

	}

	public class PhotoLineupReportWindow {
		public WebDriver driver;

		public PhotoLineupReportWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

	}

	public class OffenderSearch {
		public WebDriver driver;

		public OffenderSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrOffenderSrch1_nOffName_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.XPATH, using = "//span[text()='Search']")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrOffenderSrch1_nOffName_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "grdOffNames")
		public WebElement uIOffenderTable;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrOffenderSrch1_lblprobAgent")
		public WebElement uIProbationAgentLabel;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrOffenderSrch1_nprobAgent_NameType")
		public WebElement uIProbationAgentIDType;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrOffenderSrch1_nprobAgent_NameTypeID")
		public WebElement uIProbationAgentIDNo;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrOffenderSrch1_nprobAgent_LastName")
		public WebElement uIProbationAgentLastName;

		@FindBy(how = How.ID, using = "tabNameSrch_tmpl0_usrOffenderSrch1_nprobAgent_FirstName")
		public WebElement uIProbationAgentFirstName;

		@FindBy(how = How.XPATH, using = "//span[text()='Add New']")
		public WebElement uIAddNewButton;

	}

	public class OffenderEntry {
		public WebDriver driver;
		public QaForms qAForms = new QaForms();

		public OffenderEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[text()='QA Forms']")
		public WebElement uIQAFormsTab;

		@FindBy(how = How.ID, using = "tabOffNames_tmpl0_usrOffMain_lblprobAgent")
		public WebElement uIProbationAgentLabel;

		@FindBy(how = How.ID, using = "tabOffNames_tmpl0_usrOffMain_nprobAgent_NameType")
		public WebElement uIProbationAgentIDType;

		@FindBy(how = How.ID, using = "tabOffNames_tmpl0_usrOffMain_nprobAgent_NameTypeID")
		public WebElement uIProbationAgentIDNo;

		@FindBy(how = How.ID, using = "tabOffNames_tmpl0_usrOffMain_nprobAgent_LastName")
		public WebElement uIProbationAgentLastName;

		@FindBy(how = How.ID, using = "tabOffNames_tmpl0_usrOffMain_nprobAgent_FirstName")
		public WebElement uIProbationAgentFirstName;

		public class QaForms {

			public QaForms() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "cddForm_DropDown")
			public WebElement uISelectFormComboBox;

		}

	}

}
