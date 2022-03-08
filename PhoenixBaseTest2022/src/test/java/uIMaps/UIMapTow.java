package uIMaps;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Playback;

public class UIMapTow {
	
	public TowScreen towScreen;
    public TowEntry towEntry;
    public TowRotation towRotation;
    public TowVendor towVendor;
    public TowVendorEntry towVendorEntry;
    public TowRefuse towRefuse;
    public TowRefusePopUpScreen towRefusePopUpScreen;


      public UIMapTow() {
    	  

              if (this.towScreen == null)
               this.towScreen = new TowScreen();
              
              if (this.towEntry == null)
                  this.towEntry = new TowEntry();

              if (this.towRotation == null)
                  this.towRotation = new TowRotation();
     
              if (this.towVendor == null)
                this.towVendor = new TowVendor();
  
              if (this.towVendorEntry == null)
                  this.towVendorEntry = new TowVendorEntry();
 
              if (this.towRefuse == null)
                  this.towRefuse = new TowRefuse();
              
              if (this.towRefusePopUpScreen == null)
                  this.towRefusePopUpScreen = new TowRefusePopUpScreen();
  }

  //Tow Vendor UI Classes
  public class TowVendor
   {
       public WebDriver driver;
       public TowVendor()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
       public WebElement uIAddNewButton;

      @FindBy(how = How.ID, using = "tabVendorSrch_tmpl0_ctrlUsrVendor_txtVenCode")
       public WebElement uIVenderCodeEdit;

      @FindBy(how = How.ID, using = "tabVendorSrch_tmpl0_ctrlUsrVendor_DttmContractDate_Date_KPIDttmCtrl")
       public WebElement uIContractDateEdit;

      @FindBy(how = How.ID, using = "tabVendorSrch_tmpl0_ctrlUsrVendor_DttmContractExp_Date_KPIDttmCtrl")
       public WebElement uIContractExpiresDateEdit;

      @FindBy(how = How.ID, using = "tabVendorSrch_tmpl0_ctrlUsrVendor_chkIsActive")
       public WebElement uIIncludeInactiveCheckbox;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
       public WebElement uISearchButton;

      @FindBy(how = How.ID, using = "grdEquipments")
       public WebElement uITowVendorTable;

   }


  // Tow Vendor Entry UI Classes

  public class TowVendorEntry
   {
       public WebDriver driver;
       public Equipment equipment;
       public PhoneNumber phoneNumber;
       public AreaAssignment areaAssignment;
       public AuthDrivers authDrivers;
       
       public TowVendorEntry()
       {
    	   if (this.equipment == null)
               this.equipment = new Equipment();

           if (this.phoneNumber == null)
               this.phoneNumber = new PhoneNumber();
      
           if (this.areaAssignment == null)
               this.areaAssignment = new AreaAssignment();

           if (this.authDrivers == null)
              this.authDrivers = new AuthDrivers();
 
           driver = Playback.driver;
           PageFactory.initElements(driver, this);

       }

      @FindBy(how = How.ID, using = "cmdSave")
       public WebElement uISaveButton;

      @FindBy(how = How.ID, using = "txtVenCode")
       public WebElement uIVendorCodeEdit;

      @FindBy(how = How.ID, using = "nmcVendorName_LastName")
       public WebElement uILastNameEdit;

      @FindBy(how = How.ID, using = "nmcVendorName_FirstName")
       public WebElement uIFirstNameEdit;

      @FindBy(how = How.ID, using = "nmcVendorName_imgSrch")
       public WebElement uINameInfoButton;

      @FindBy(how = How.ID, using = "txtPhone")
       public WebElement uIOfficeContactEdit;

      @FindBy(how = How.ID, using = "DttmContractDate_Date_KPIDttmCtrl")
       public WebElement uIContractDateEdit;

      @FindBy(how = How.ID, using = "DttmContractDate_Date_KPIDttmCmd")
       public WebElement uIContractDateButton;

      @FindBy(how = How.XPATH, using = "//table[@id ='DttmContractDate_Time'//input")
       public WebElement uIContractTimeEdit;

      @FindBy(how = How.ID, using = "DttmContractExp_Date_KPIDttmCtrl")
       public WebElement uIContractExpiresDateEdit;

      @FindBy(how = How.ID, using = "DttmContractExp_Date_KPIDttmCmd")
       public WebElement uIContractExpiresDateButton;

      @FindBy(how = How.XPATH, using = "//table[@id ='DttmContractExp_Time']//input")
       public WebElement uIContractExpiresTimeEdit;

      @FindBy(how = How.ID, using = "cddPosition_DropDown")
       public WebElement uIRotationPOsitionComboBox;

      @FindBy(how = How.XPATH, using = "//select[@id ='cddPosition_DropDown' //title[contains(text(),'101 -')]")
       public WebElement uIRotationPositionTitleComboBox;

      @FindBy(how = How.ID, using = "chkIsActive")
       public WebElement uIInactiveCheckbox;

      @FindBy(how = How.ID, using = "txtInActiveDttm")
       public WebElement uIInactiveDateTimeEdit;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Equipment')]")
       public WebElement uIEquipmentTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Phone Number')]")
       public WebElement uIPhoneNumberTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Area Assignment')]")
       public WebElement uIAreaAssignmentTab;

 @FindBy(how = How.XPATH, using = "  //span[text()='Area/Zone Assignment']")
      public WebElement uIAreaZoneAssignmentTab;
      
      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Auth Drivers')]")
       public WebElement uIAuthDriversTab;

      @FindBy(how = How.XPATH, using =  "//div[@id='tab0']//td[@class = 'statusBar']//b")
       public WebElement uIBottomLeftSideStatusBar;
      
      @FindBy(how = How.ID, using = "nmcVendorName_NameType")
      public WebElement uITowVendorNameTypeEdit;
     
      @FindBy(how = How.ID, using = "nmcVendorName_NameTypeID")
      public WebElement uITowVendorNameIDEdit;
     
      @FindBy(how = How.ID, using = "cmdPrint")
      public WebElement uIPrintIcon;
      
      @FindBy(how = How.ID, using = "cmdSaveNClose")
      public WebElement uISaveNCloseButton;
   }

   public class Equipment
   {

       public WebDriver driver;

       public Equipment()
       {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabVendor_tmpl0_ctrlUsrEquip_txtQuan")
       public WebElement uIEquipmentQuantityEdit;

      @FindBy(how = How.ID, using = "tabVendor_tmpl0_ctrlUsrEquip_lupEquip_CodeValue")
       public WebElement uIEquipmentCodeEdit;

      @FindBy(how = How.ID, using = "tabVendor_tmpl0_ctrlUsrEquip_chkIsActive")
       public WebElement uIInactiveCheckbox;

      @FindBy(how = How.ID, using = "tabVendor_tmpl0_ctrlUsrEquip_imgAdd")
       public WebElement uIAddButton;

      @FindBy(how = How.ID, using = "tabVendor_tmpl0_ctrlUsrEquip_imgClear")
       public WebElement uIClearButton;

      @FindBy(how = How.ID, using = "tabVendor_tmpl0_ctrlUsrEquip_grdEquipments")
       public WebElement uIEquipmentTable;

   }

   public class PhoneNumber
   {

       public WebDriver driver;

       public PhoneNumber()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabVendor_tmpl1_ctrlUsrPhone_cstPhoneNoP_PhoneType_DropDown")
       public WebElement uIPhoneComboBox;

      @FindBy(how = How.ID, using = "tabVendor_tmpl1_ctrlUsrPhone_cstPhoneNoP_PhoneNumber")
       public WebElement uIPhoneEdit;

      @FindBy(how = How.ID, using = "tabVendor_tmpl1_ctrlUsrPhone_imgAdd")
       public WebElement uIAddButton;

      @FindBy(how = How.ID, using = "tabVendor_tmpl1_ctrlUsrPhone_imgClear")
       public WebElement uIClearButton;

   }

   public class AreaAssignment
   {
       public WebDriver driver;
       public AreaAssignment()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabVendor_tmpl2_ctrlUsrAreaAssign_cddPatrolArea_DropDown")
       public WebElement uIPatrolAreaComboBox;

      @FindBy(how = How.ID, using = "tabVendor_tmpl2_ctrlUsrAreaAssign_chkIsActive")
       public WebElement uIInactiveCheckbox;

      @FindBy(how = How.ID, using = "tabVendor_tmpl2_ctrlUsrAreaAssign_imgAdd")
       public WebElement uIAddButton;

      @FindBy(how = How.ID, using = "tabVendor_tmpl2_ctrlUsrAreaAssign_imgClear")
       public WebElement uIClearButton;

 	@FindBy(how = How.ID, using = "tabVendor_tmpl2_ctrlUsrAreaAssign_grdAssign")
      public WebElement uITowZoneGrid;

   }

   public class AuthDrivers
   {
       public WebDriver driver;
       public AuthDrivers()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_nmcDriver_LastName")
       public WebElement uIDriverLastNameEdit;

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_nmcDriver_FirstName")
       public WebElement uIDriverFirstNameEdit;

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_dtEmployed_KPIDttmCtrl")
       public WebElement uIEmployedDateEdit;

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_dtTerminated_KPIDttmCtrl")
       public WebElement uITerminatedDateEdit;

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_chkShowAll")
       public WebElement uIShowAllCheckBox;

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_imgAdd")
       public WebElement uIAddButton;

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_imgClear")
       public WebElement uIClearButton;

      @FindBy(how = How.ID, using = "tabVendor_tmpl3_ctrlUsrTowDriver_grdTowDriver")
       public WebElement uIAuthDriverTable;

    @FindBy(how = How.XPATH, using = "//div[@id='tabVendor_tmpl3_ctrlUsrTowDriver_grdTowDriver']//td[@class='Delete_Icon_Style']")
       public WebElement uIDeleteIconGridButton;

   }

   

 // Tow Rotation UI Classes
   public class TowRotation
   {

       public WebDriver driver;

       public TowRotation()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);

       }

      @FindBy(how = How.ID, using = "cddWrecker")
       public WebElement uIVendorComboBox;

      @FindBy(how = How.ID, using = "cddPosition_DropDown")
       public WebElement uIPositionComboBox;

      @FindBy(how = How.ID, using = "imgAdd")
       public WebElement uIAddButton;

      @FindBy(how = How.ID, using = "imgClear")
       public WebElement uIClearButton;

      @FindBy(how = How.ID, using = "cmdSave")
       public WebElement uISaveButton;

      @FindBy(how = How.ID, using = "cmdRefresh")
       public WebElement uIRefreshButton;

      @FindBy(how = How.ID, using = "grdPosition")
       public WebElement uITowRotationTable;

  @FindBy(how = How.XPATH, using = " //span[@id='lblRotaType']")
      public WebElement uIRotationTypeLabel;
     
      @FindBy(how = How.ID, using = "cddTowZone_DropDown")
      public WebElement uITowZoneComboBox;

   }

   
  // Tow Screen UI Classes
   public class TowScreen
   {
       public WebDriver driver;

       public TowScreen()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_txtPlateNbr")
       public WebElement uIPlateNumberEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_cddState_DropDown")
       public WebElement uIPlateStateComboBox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_nbrCallNumber_Year")
       public WebElement uICallYearEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_nbrCallNumber_Number")
       public WebElement uICallNumberEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_dtStartDttm_KPIDttmCtrl")
       public WebElement uITowRequestDateFromEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_cddState_DropDown")
       public WebElement uITowRequestDateToEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_lupMake_CodeValue")
       public WebElement uIMakeCodeEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_cddWrecker")
       public WebElement uIContractorComboBox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_txtLastName")
       public WebElement uIOwnerLastNameEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_txtFirstName")
       public WebElement uIOwnerFirstNameEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_lupOfficer_CodeValue")
       public WebElement uIOfficerCodeEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_cddTowType_DropDown")
       public WebElement uITowTypeComboBox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_cddReason_DropDown")
       public WebElement uITowReasonComboBox;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
       public WebElement uIAddNewButton;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
       public WebElement uISearchButton;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
       public WebElement uIBackButton;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_adrTowedFrom_CddLocationType")
       public WebElement uITowedFromComboBox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_adrTowedFrom_adrAddrsCtrl_txtFrom")
       public WebElement uITowedFromEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_adrTowedFrom_TxtStartPremise")
       public WebElement uITowedFromPremiseEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_adrTowedFrom_TxtStreetName")
       public WebElement uITowedFromStreetEdit;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_adrTowedTo_CddLocationType")
       public WebElement uITowedToComboBox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_adrTowedTo_adrAddrsCtrl_txtFrom")
       public WebElement uITowedToEdit;

      @FindBy(how = How.ID, using = "grdTow")
       public WebElement uITowTable;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_chkNotRlsd")
       public WebElement uINotReleasedOnlyCheckbox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_chkReleased")
       public WebElement uIReleasedCheckbox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_chkNoPlate")
       public WebElement uINoPlateCheckbox;

      @FindBy(how = How.ID, using = "tdHold")
       public WebElement uIHoldStatusBar;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_txtVinNbr")
      public WebElement uIVinNoEdit; 
      
      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_chkIsHold")
      public WebElement uIHoldReasonCheckbox;

      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_radHoldReason_DropDown")
      public WebElement uIHoldReasonDropDown;
      
      @FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_radHoldReason_Input")
      public WebElement uIHoldReasonDropDownInput;
  	
	@FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_nbrTowNbr_Number")
	public WebElement uITowNoEdit;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
	public WebElement uIResetButton;
	
	@FindBy(how = How.ID, using = "tabTowSrch_tmpl0_ctrlUsrTowBasic_nbrTowNbr_Year")
	public WebElement uITowTypeEdit;

   }

 // Tow Entry UI Classes

   public class TowEntry
   {
       public WebDriver driver;
       public TowTab towTab;
       public Owner owner;
       public Driver mDriver;
       public DamageMissing damageMissing;
       public PropertyInventory propertyInventory;
       public Forfeiture forfeiture;
       public Release release;
       public TowDispositionTab towDispositionTab;
       public TowNotesTab towNotesTab;
      
      


       public TowEntry()
       {
    	   if (this.towTab == null)
               this.towTab = new TowTab();
                 
           if (this.owner == null)
               this.owner = new Owner();
                     
           if (this.mDriver == null)
               this.mDriver = new Driver();
                  
           if (this.damageMissing == null)
               this.damageMissing = new DamageMissing();

           if (this.propertyInventory == null)
               this.propertyInventory = new PropertyInventory();
                     
           if (this.forfeiture == null)
               this.forfeiture = new Forfeiture();
                  
           if (this.release == null)
              this.release = new Release();
               
           if (this.towDispositionTab == null)
               this.towDispositionTab = new TowDispositionTab();
                  
           if (this.towNotesTab == null)
               this.towNotesTab = new TowNotesTab();
           
     

           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "cmdSave")
       public WebElement uISaveButton;
      
      @FindBy(how = How.ID, using = "cmdRefresh")
      public WebElement uIRefreshButton;

      @FindBy(how = How.ID, using = "cmdSaveNClose")
       public WebElement uISaveNCloseButton;
 
      @FindBy(how = How.ID, using = "nbrCallNumber_Year")
       public WebElement uICallYearEdit;

      @FindBy(how = How.ID, using = "nbrCallNumber_Number")
       public WebElement uICallNumberEdit;

      @FindBy(how = How.ID, using = "plcVehID_PlateNumber")
       public WebElement uIPlateNumberEdit;

      @FindBy(how = How.ID, using = "plcVehID_KPIState")
       public WebElement uIPlateStateComboBox;

      @FindBy(how = How.ID, using = "chkNoPlate")
       public WebElement uINoPlateCheckbox;

      @FindBy(how = How.ID, using = "dttmCall_Date_KPIDttmCtrl")
       public WebElement uICallDateEdit;

      @FindBy(how = How.ID, using = "txtYear1")
       public WebElement uIYearEdit;

      @FindBy(how = How.ID, using = "lupMake_CodeValue")
       public WebElement uIMakeEdit2;

      @FindBy(how = How.ID, using = "lupModel_CodeValue")
       public WebElement uIModelEdit2;

      @FindBy(how = How.ID, using = "cddColor1_DropDown")
       public WebElement uIColorEdit;
      
      @FindBy(how = How.ID, using = "txtYear2")
      public WebElement uIYearEdit2;

     @FindBy(how = How.ID, using = "txtMake")
      public WebElement uIMakeEdit;

     @FindBy(how = How.ID, using = "txtModel")
      public WebElement uIModelEdit;

     @FindBy(how = How.ID, using = "cddColor2_DropDown")
      public WebElement uIColorEdit2;

       @FindBy(how = How.XPATH, using = "//span[text()='Tow']")
       public WebElement uITowTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Owner')]")
       public WebElement uIOwnerTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
      public WebElement uIAttachmentsTab;
      
      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Driver')]")
       public WebElement uIDriverTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Damage/Missing')]")
       public WebElement uIDamageMissingTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Property Inventory')]")
       public WebElement uIPropertyInventoryTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Forfeiture')]")
       public WebElement uIForfeitureTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Release')]")
       public WebElement uIReleaseTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Disposition')]")
       public WebElement uIDispositionTab;

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes')]")
       public WebElement uINotesTab;

      @FindBy(how = How.ID, using = "txtHoldReason")
       public WebElement uIReasonEdit;

      @FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']//b")
       public WebElement uIBottomLeftSideStatusBar;
   
      @FindBy(how = How.ID, using = "nbrCallNumber_imgBtn")
      public WebElement uICallInfoIcon;
      
      @FindBy(how = How.ID, using = "nbrCaseNumber_Year")
      public WebElement uICaseNoYear;
      
      @FindBy(how = How.ID, using = "nbrCaseNumber_Number")
      public WebElement uICaseNo; 
      
      @FindBy(how = How.XPATH, using = "//table[@id='dttmCall_Time']//input")
		public WebElement uICallTimeEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_cddEquipType_DropDown")
		public WebElement uIEquipmentUsedDropdown;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_lstVendor")
		public WebElement uIWreckerDropdown;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_dtTowReqDttm_Date_KPIDttmCtrl")
		public WebElement uITowRequestDate;
    
    @FindBy(how = How.ID, using = "cddColor1_DropDown")
    public WebElement uIColorDropDown;
    
    @FindBy(how = How.ID, using = "txtVIN2")
    public WebElement uIVINEdit;
 
  @FindBy(how = How.ID, using = "lupStyle_CodeValue")
    public WebElement uIStyleEdit;
	
	@FindBy(how = How.ID, using = "cddLocationKey1_DropDown")
	public WebElement uILocationOfVehicleKeyDropDown;
	
	
	 @FindBy(how = How.ID, using = "nbrTowNumber_Year")
	  public WebElement uITowNoYearEdit;

	  @FindBy(how = How.ID, using = "nbrTowNumber_Number")
	  public WebElement uITowNoEdit;
	  
	  @FindBy(how = How.ID, using = "chkCreateCall")
	  public WebElement uICreateCallCheckBox;

	     @FindBy(how = How.ID, using = "plcVehID_imgBtn")
      public WebElement uIPlateVinInfoIcon;

      @FindBy(how = How.ID, using = "cmdPrint")
  public WebElement uIPrintIcon;
	  
   }

   public class TowTab
   {

       public WebDriver driver;

       public TowTab()
       {
    	   
    	  
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_cddEquipType_DropDown")
       public WebElement uIEquipmentUsedComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_lstVendor")
       public WebElement uIWreckerComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_grdEquipments")
       public WebElement uITowQuantityGrid;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_dtTowReqDttm_Date_KPIDttmCtrl")
       public WebElement uITowRequestDateEdit;

      @FindBy(how = How.XPATH, using = "//table[@id ='tabTow_tmpl0_ctrlUsrTow_dtTowReqDttm_Time']//input")
       public WebElement uITowRequestDateTimeEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_txtAddress")
       public WebElement uIAddressEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_cddTowedType_DropDown")
       public WebElement uITowTypeComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_cddReason_DropDown")
       public WebElement uITowReasonComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_adrTowedFrom_txtFrom")
       public WebElement uITowedFromEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_adrTowedTo_txtFrom")
       public WebElement uITowedToEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_ddlTowDriver")
       public WebElement uITowDriverComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_lupUnitPF_CodeValue")
       public WebElement uIOfficerCodeEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_dttNotifiedDttm1_Date_KPIDttmCtrl")
       public WebElement uINotifiedDateEdit;

      @FindBy(how = How.XPATH, using = "//table[@id ='tabTow_tmpl0_ctrlUsrTow_dttNotifiedDttm1_Time']//input")
       public WebElement uINotifiedTimeEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_cddMethod1_DropDown")
       public WebElement uIMethodComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_cmdRefuse")
       public WebElement uIRefuseButton;

      @FindBy(how = How.ID, using = "txtHoldReason")
       public WebElement uIReasonEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_adrTowedTo_chkVerify")
       public WebElement uITowedToCheckBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_dttmTow_Date_KPIDttmCtrl")
       public WebElement uITowedCompletedDateEdit;

      @FindBy(how = How.XPATH, using = "//table[@id ='tabTow_tmpl0_ctrlUsrTow_dttmTow_Time'//input")
       public WebElement uITowCompletedToEdit;
      

      @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_custTowedFromCSZ_City")
          public WebElement uITowedFromCSZEdit;


    @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_custTowedToCSZ_City")
          public WebElement uITowedToCSZEdit;

    @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_imgHoldReason")
    public WebElement uIHoldReasonIIcon;
    
    @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_txtTowReason")
	public WebElement uITowReasonEdit; 	
    
    @FindBy(how = How.ID, using = "tabTow_tmpl0_ctrlUsrTow_dtCancelDttm_Date_KPIDttmCtrl")
    public WebElement uICancelDateEdit;
    
    @FindBy(how = How.XPATH, using = "//table[@id='tabTow_tmpl0_ctrlUsrTow_dtCancelDttm_Time']//input")
    public WebElement uICancelDateTimeEdit;
   }

   public class Owner
   {
      public WebDriver driver;

       public Owner()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_dttNotifiedDttm1_Date_KPIDttmCtrl")
       public WebElement uINotified1DateEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_cddMethod1_DropDown")
       public WebElement uIMethod1ComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_imgClearOper")
       public WebElement uIClearIcon;

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_nmcOwnerID_LastName")
       public WebElement uIOwnerLastNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_nmcOwnerID_FirstName")
       public WebElement uIOwnerFirstNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_nmcOwnerID_imgSrch")
       public WebElement uIOwnerNameInfoButton;

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_dtDOB_KPIDttmCtrl")
       public WebElement uIDOBEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_adrMainAddress_txtFrom")
       public WebElement uIAddressEdit;

 @FindBy(how = How.ID, using = "tabTow_tmpl1_ctrlUsrOwner_nmcOwnerID_imgSrch")
      public WebElement uIOwnerNamesearchButton;
   }

   public class Driver
   {
       public WebDriver driver;

       public Driver()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabTow_tmpl2_ctrlUsrDriver_chkIsOwner")
       public WebElement uIOwnerCheckbox;

      @FindBy(how = How.ID, using = "tabTow_tmpl2_ctrlUsrDriver_nmcDriverID_LastName")
       public WebElement uILastNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl2_ctrlUsrDriver_nmcDriverID_FirstName")
       public WebElement uIFirstNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl2_ctrlUsrDriver_dtDOB_KPIDttmCtrl")
       public WebElement uIDOBEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl2_ctrlUsrDriver_adrMainAddress_txtFrom")
       public WebElement uIAddressEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl2_ctrlUsrDriver_txtDvrComments")
       public WebElement uICommentsEdit;


   }

   public class DamageMissing
   {
       public WebDriver driver;

       public DamageMissing()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
       public WebElement uIDamageMissingRichTextEdit;

      @FindBy(how = How.ID, using = "cmdInternalSave")
       public WebElement uIInternalSaveButton;

      @FindBy(how = How.ID, using = "cmdInternalRefresh")
       public WebElement uIInternalResetButton;

       @FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'status']//b")
       public WebElement uIBottomLeftSideStatusBar;

   }

   public class PropertyInventory
   {
       public WebDriver driver;

       public PropertyInventory()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
       public WebElement uIPropertyInventoryRichTextEdit;

      @FindBy(how = How.ID, using = "cmdInternalSave")
       public WebElement uIInternalSaveButton;

      @FindBy(how = How.ID, using = "cmdInternalRefresh")
       public WebElement uIInternalResetButton;

      @FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'status']//b")
       public WebElement uIBottomLeftSideStatusBar;


   }

   public class Forfeiture
   {
       public WebDriver driver;
    
       public Forfeiture()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_txtCrime")
       public WebElement uICrimeEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_curEstimateVal")
       public WebElement uIEstimatedValueEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_curLienAmt")
       public WebElement uILienOfAmountEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_imgClearOper")
       public WebElement uIClearIcon;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_nmcLienID_LastName")
       public WebElement uILastNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_nmcLienID_FirstName")
       public WebElement uIFirstNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_nmcLienID_FirstName")
       public WebElement uIAirConditionerRadioButton;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_nmcLienID_FirstName")
       public WebElement uIKeysRadioButton;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_nmcLienID_FirstName")
       public WebElement uISpeakersRadioButton;

      @FindBy(how = How.ID, using = "tabTow_tmpl5_ctrlUsrForfeiture_nmcLienID_FirstName")
       public WebElement uITapeDeckRadioButton;

   }

   public class Release
   {
       public WebDriver driver;

       public Release()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_chkIsHold")
       public WebElement uIHoldCheckbox;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_cddHoldReason_DropDown")
       public WebElement uIReasonComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_txtProofofOwner")
       public WebElement uIProofOfEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_nmcRelName_LastName")
       public WebElement uILastNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_nmcRelName_FirstName")
       public WebElement uIFirstNameEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_dttmReleaseDttm_Date_KPIDttmCtrl")
       public WebElement uIReleaseDateEdit;

      @FindBy(how = How.XPATH, using = "//table[@id='tabTow_tmpl6_ctrlUsrRelease_dttmReleaseDttm_Time']//input")
       public WebElement uIReleaseTimeEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_lupRelBy_imgBtn")
       public WebElement uIReleasedBySearchButton;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_txtRelComments")
       public WebElement uICommentsEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_nmcRelName_NameType")
      public WebElement uIReleaseToNameTypeEdit;
      
      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_nmcRelName_NameTypeID")
      public WebElement uIReleaseToNameIDEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_lupRelBy_CodeValue")
      public WebElement uIReleasedByEdit;
      
      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_imgRelSign")
      public WebElement uIReleasedBySignatureButton;

      @FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_imgClrRelinq")
		public WebElement uIReleasedByClearButton;

		@FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_imgClrRelTo")
		public WebElement uIReleaseToClearButton;

		@FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_imgSign")
		public WebElement uIReleaseToSignatureButton;

		@FindBy(how = How.ID, using = "tabTow_tmpl6_ctrlUsrRelease_imgReleasedSign_chkIsEnableSign")
		public WebElement uIReleasedBySignatureCheckBox;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;
   }

   public class TowDispositionTab
   {
       public WebDriver driver;

       public TowDispositionTab()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_lupAuthorizedBy_imgBtn")
       public WebElement uIAuthorizedBySearchButton;

      @FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_dttmDatetime_Date_KPIDttmCtrl")
       public WebElement uIDateEdit;

      @FindBy(how = How.ID, using = "//table[@id='tabTow_tmpl7_ctrlUsrDisposition_dttmDatetime_Time'//input")
       public WebElement uITimeEdit;

      @FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_cddMethod_DropDown")
       public WebElement uIMethodComboBox;

      @FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_txtCustom1")
       public WebElement uICustom1Edit;

      @FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_lupAuthorizedBy_CodeValue")
		public WebElement uIAuthorizedByEdit;

		@FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_imgAuthSign")
		public WebElement uIClickHereToSignButton;

		@FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_imgClrRelinq")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_imgAuthorizedSign_chkIsEnableSign")
		public WebElement uISignatureCheckBox;

		@FindBy(how = How.ID, using = "tabTow_tmpl7_ctrlUsrDisposition_imgAuthorizedSign_chkIsEnableSign")
	      public WebElement uIAuthorizedBySignatureCheckBox;
   }

   public class TowNotesTab
   {
       public WebDriver driver;

       public TowNotesTab()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
   }

      @FindBy(how = How.ID, using = "txtNotes")
       public WebElement uINotesEdit;

      @FindBy(how = How.ID, using = "cmdSave")
       public WebElement uISaveButton;

      @FindBy(how = How.ID, using = "cmdReset")
       public WebElement uIResetButton;

      @FindBy(how = How.ID, using = "grdHistory")
       public WebElement uINotesTable;

   }

  //Tow Refuse UI Classes
   public class TowRefuse
   {
       public WebDriver driver;

       public TowRefuse()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }

      @FindBy(how = How.ID, using = "nbrCallNumber_Year")
       public WebElement uICallYearEdit;

      @FindBy(how = How.ID, using = "nbrCallNumber_Number")
       public WebElement uICallNumberEdit;

      @FindBy(how = How.ID, using = "cddWrecker")
       public WebElement uIVendorComboBox;

      @FindBy(how = How.ID, using = "cmdSearch")
       public WebElement uISearchButton;

      @FindBy(how = How.ID, using = "grdTowRefusal")
       public WebElement uITowRefuseTable;

   }

   public class TowRefusePopUpScreen
   {
	   public WebDriver driver;

       public TowRefusePopUpScreen()
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
       
       @FindBy(how = How.ID, using = "cmdDelete")
       public WebElement uIDeleteButton; 
       
     
	   
   }

}
