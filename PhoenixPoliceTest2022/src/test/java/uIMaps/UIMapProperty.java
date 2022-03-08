package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.ObjectIdentification;
import utilities.Playback;

public class UIMapProperty {

	public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public ObjectIdentification.WindowHandle windowHandle=objectIdentification.new WindowHandle();
	  
	public PropertyEditEntry propertyEditEntry;
    public PropertyEntry propertyEntry;
    public PropertyUpdate propertyUpdate;
    public PropertyRoomRoles propertyRoomRoles;
    public AttachPropertyPopup attachPropertyPopup;
    public PropertySearch propertySearch;
    public AuditSearch auditSearch;
    public AuditEditEntry auditEditEntry;
    public Pawn pawn;
    public PawnEntry pawnEntry;
    public BicycleRegistration bicycleRegistration;
    public BicycleRegistrationEntry bicycleRegistrationEntry;
    public PawnHelpWindow pawnHelpWindow;
    public PropertyIndex propertyIndex;
    public PropertyNCICCode propertyNCICCode;
    public PropertyNCICEntry propertyNCICEntry;
    public PropertySearchHelpWindow propertySearchHelpWindow;
    public PullRequest pullRequest;
    public RequestEntry requestEntry;
    public PropertyUpdateHelpWindow propertyUpdateHelpWindow;
    public LocationSearch locationSearch;
    public StorageLocations storageLocations;
    public StorageLocationUpdate storageLocationUpdate;
    public Notify notify;
    public PropertyCodes propertyCodes;
	
	public PropertyCodesEntry propertyCodesEntry;
	
	public PropertyCodedLookup propertyCodedLookup;

    public UIMapProperty()
    {

        if (this.propertyEditEntry == null)
        	this.propertyEditEntry = new PropertyEditEntry();

    	 if ((this.propertyEntry == null))
    		 this.propertyEntry = new PropertyEntry();

    	  if ((this.propertyNCICCode == null))
          {
    		  this.propertyNCICCode = new PropertyNCICCode();
          }
    	 if ((this.propertyNCICEntry == null))
         {
    		 this.propertyNCICEntry = new PropertyNCICEntry();
         }

    	if ((this.propertyUpdate == null))
        {
    		this.propertyUpdate = new PropertyUpdate();
        }
    	 if ((this.propertyRoomRoles == null))
         {
    		 this.propertyRoomRoles = new PropertyRoomRoles();
         }     
    	   if ((this.attachPropertyPopup == null))
           {
    		   this.attachPropertyPopup = new AttachPropertyPopup();
           }
    	 if ((this.propertySearch == null))
         {
    		 this.propertySearch = new PropertySearch();
         }
        if ((this.auditSearch == null))
        {
        	this.auditSearch = new AuditSearch();
        }
        if ((this.auditEditEntry == null))
        {
        	this.auditEditEntry = new AuditEditEntry();
        }
    	  if ((this.propertySearch == null))
          {
              this.propertySearch = new PropertySearch();
          }
    	  if ((this.bicycleRegistration == null))
          {
              this.bicycleRegistration = new BicycleRegistration();
          }
    	  if ((this.bicycleRegistrationEntry == null))
          {
              this.bicycleRegistrationEntry = new BicycleRegistrationEntry();
          }
        if ((this.auditEditEntry == null))
        {
            this.auditEditEntry = new AuditEditEntry();
        }
    	   if ((this.pawn == null))
           {
               this.pawn = new Pawn();
           }
    	   if ((this.pawnEntry == null))
           {
               this.pawnEntry = new PawnEntry();
           }
    	 if ((this.pawnHelpWindow == null))
         {
             this.pawnHelpWindow = new PawnHelpWindow();
         }
    	 if ((this.pawnHelpWindow == null))
         {
             this.pawnHelpWindow = new PawnHelpWindow();
         }
    	 if ((this.pawnHelpWindow == null))
         {
             this.pawnHelpWindow = new PawnHelpWindow();
         }
        if ((this.propertyIndex == null))
        {
            this.propertyIndex = new PropertyIndex();
        }
    	 if ((this.propertySearchHelpWindow == null))
         {
             this.propertySearchHelpWindow = new PropertySearchHelpWindow();
         }
    	 if ((this.pullRequest == null))
         {
             this.pullRequest = new PullRequest();
         }
        if ((this.requestEntry == null))
        {
            this.requestEntry = new RequestEntry();
        }
    	 if ((this.propertyUpdateHelpWindow == null))
         {
             this.propertyUpdateHelpWindow = new PropertyUpdateHelpWindow();
         }
    	  if( this.locationSearch==null)
    		  this.locationSearch= new LocationSearch();
    	  
    	  if( this.storageLocationUpdate==null)
    		  this.storageLocationUpdate= new StorageLocationUpdate();
    	  
    	  if( this.storageLocations==null)
    		  this.storageLocations= new StorageLocations();
    	  
    	  if( this.notify==null)
    		  this.notify= new Notify();
    	  
    	  if (this.propertyCodedLookup == null)
  			this.propertyCodedLookup = new PropertyCodedLookup();

  		if (this.propertyCodes == null)
  			this.propertyCodes = new PropertyCodes();
  		
  		if (this.propertyCodesEntry == null)
  			this.propertyCodesEntry = new PropertyCodesEntry();
    	  
    }
    
    public class PropertyEditEntry
    {
        public  WebDriver driver;

        public PropertyEditEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }


        @FindBy(how = How.ID, using = "nbrCaseNo_Year")
        public WebElement uICaseYearEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_Number")
        public WebElement uICaseNumberEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_imgBtn")
        public WebElement uICaseInfoButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Attach Property Report')]")
        public WebElement uIAttachPropertyReportButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add New Property Report')]")
        public WebElement uIAddNewPropertyReportButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Reset')]")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "grdPropEntry")
        public WebElement uIPropertyEditEntryTable;

        @FindBy(how = How.ID, using = "dttRptDttm_Date_KPIDttmCtrl")
        public WebElement uIReportedDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dttRptDttm_Time']//input")
        public WebElement uIReportedTimeEdit;

        @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Select Property')]")
        public WebElement uISelectPropertyButton;
        
    }


    public class PropertyEntry
    {
        public PropertyEntryMainTab propertyEntryMainTab;
        public RecoveredTab recoveredTab;
        public PropertyEntryHistoryTab propertyEntryHistoryTab;

        public WebDriver driver;

        public PropertyEntry()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            
            if ((this.propertyEntryMainTab == null))
            {
                this.propertyEntryMainTab = new PropertyEntryMainTab();
            }

            if ((this.recoveredTab == null))
            {
                recoveredTab = new RecoveredTab();
            }     
            
            if ((this.propertyEntryHistoryTab == null))
            {
                this.propertyEntryHistoryTab = new PropertyEntryHistoryTab();
            }
        }

        @FindBy(how = How.ID, using = "cmdReportMaster")
        public WebElement uIReportDetailsButton;

         //lblRstStatus
        @FindBy(how = How.ID, using = "lblRstStatus")
        public WebElement uICurrentStatusLabel;

        @FindBy(how = How.ID, using = "nbrCaseNo_imgBtn")
        public WebElement uICaseInformationButton;

        @FindBy(how = How.ID, using = "nbrPropNo_Year")
        public WebElement uIPropertyYearEdit;

        @FindBy(how = How.ID, using = "nbrPropNo_Number")
        public WebElement uIPropertyNumberEdit;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "cmdPrint")
        public WebElement uIPrintButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "cmdDelete")
        public WebElement uIDeleteButton;

        @FindBy(how = How.ID, using = "cmdSubmit")
        public WebElement uISubmitButton;

        @FindBy(how = How.ID, using = "cmdAdd")
        public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "txtDescription")
        public WebElement uIDescriptionEdit;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
        public WebElement uIMainTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Recovered')]")
        public WebElement uIRecoveredTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
        public WebElement uIAttachmentTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
        public WebElement uICommentsTab;
       
        @FindBy(how = How.ID, using = "nbrCaseNo_Year")
        public WebElement uICaseYearEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_Number")
        public WebElement uICaseNumberEdit;

        @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "dttRecDttm_Date_KPIDttmCtrl")
        public WebElement uIReportedDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'dttRecDttm_Time']//input")
        public WebElement uIReportedTimeEdit;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'History')]")
        public WebElement uIHistoryTab;

        @FindBy(how = How.ID, using = "cmdCopy")
		public WebElement uICopyButton; 
        
        @FindBy(how = How.ID, using = "navMsg_CodeDescription")
        public WebElement uIPropertySequence;

        @FindBy(how = How.XPATH, using = "//span[text()='Recovered']")
        public WebElement uIRecoverdTabSpan;
        
        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uILeftSideStatusBar;
        
        @FindBy(how = How.ID, using = "imgDetail")
      		public WebElement uIPropertyBblIcon;
    }

    public class PropertyEntryMainTab
    {

        public WebDriver driver;

        public PropertyEntryMainTab()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);

        }

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddReason_DropDown")
        public WebElement uIReasonComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddCFSCode")
        public WebElement uIChargeorOffenseComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddPropCat_DropDown")
        public WebElement uIPropertyComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_TxtPropType")
        public WebElement uIPropertyTypeEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtDescription")
        public WebElement uIDescriptionEdit;


        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtPlateNbr_PlateNumber")
        public WebElement uIPlateNumberEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtQuantity")
        public WebElement uIQuantityEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtValue")
        public WebElement uIValueEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtSerialNbr")
        public WebElement uISerialEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtSerial")
        public WebElement uISerialClothingEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddGunType_DropDown")
        public WebElement uIGunTypeComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupGunMake_CodeValue")
        public WebElement uIGunMakeEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupGunMake_CodeDescription")
        public WebElement uIGunMakeDesEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupGunMake_imgBtn")
        public WebElement uIGunMakeSearchButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtGunCaliber")
        public WebElement uICaliberEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupNameRec_LastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupNameRec_FirstName")
        public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupNameRec_imgSrch")
        public WebElement uINameInfoImageButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_adrMainAddress_txtFrom")
        public WebElement uIAddressEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_adrMainAddress_chkVerify")
        public WebElement uIAddressVerifyCheckbox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtPlateNbr_KPIState")
        public WebElement uIVehiclePlateStateComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_imgClearAddr")
        public WebElement uIClearNameImageButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtPlateNbr_PlateNumber")
        public WebElement uIRegistrationNumEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtPlateNbr_KPIState")                                      
        public WebElement uIRegistrationStateEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddDrugType_DropDown")
        public WebElement uIDrugTypeComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtDrugQty")
        public WebElement uIDrugQuantityEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddDrugMeasure_DropDown")
        public WebElement uIMeasurementComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_nbrRelPropNo_Year")
        public WebElement uIRelatedPropertyNoYearEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_nbrRelPropNo_Number")
        public WebElement uIRelatedPropertyNumberEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtRelItemNo")
        public WebElement uIRelatedPropertyItemNoEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_imgRelated")
        public WebElement uIRelatedPropertyInfoIconButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtPlateNbr_PlateNumber")
        public WebElement uIVehiclePlateNoEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtPlateNbr_imgBtn")
        public WebElement uIVehicleSearchLookupButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddSecType_DropDown")
        public WebElement uISecurityTypeComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupPropCode_CodeValue")
        public WebElement uIPCLookup;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_TxtPropType")
        public WebElement uIPropertyTypeTextView;
                                        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupNameRec_imgSrch")
        public WebElement uIOwnerSearchButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lblDrugQty")
        public WebElement uIDrugQuantityLable;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_Kpilabel22")
        public WebElement uIMeasurementLabel;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddCFSCode")
        public WebElement uICFSCodeComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddCFSCode")
        public WebElement uIChargeOrOffenseComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddNibrs")
        public WebElement uINibrsComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_chkIsPlateOnly")
        public WebElement uIPlateOnlyCheckbox;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtmodel")
        public WebElement uIModelNoEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_ChkIsOwner")
        public WebElement uIOwnerUnknownCheckbox;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lupNameRec_MiddleName")
		public WebElement uIMiddleNameEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_chkIsRecForOther")
		public WebElement uIRecoverOtherAgencyCheckBox;

		@FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_Kpilabel14")
		public WebElement uIMandatorySerialLabel;

		@FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_lblModel")
		public WebElement uISerialLabel;
    }

    public class RecoveredTab
    {

        public WebDriver driver;

        public RecoveredTab()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);

        }

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_dttTranDttm_Date_KPIDttmCtrl")
        public WebElement uIDateEdit;
                                                          
        @FindBy(how = How.XPATH, using = "//table[@id = 'tabProperty_tmpl1_UsrPropRecovered1_dttTranDttm_Time']//input")
        public WebElement uITimeEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cddHoldCode_DropDown")
        public WebElement uIHoldComboBox;
      
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtRecQuantity")
        public WebElement uIQuantityEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtRecDrugQty")
        public WebElement uIQuantityDrugEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtValue")
        public WebElement uIValueEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cddDisposition_DropDown")
        public WebElement uIDispositionComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cddLocation_DropDown")
        public WebElement uIInitialStorageLocationComboBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_barPropItem")
        public WebElement uIBarcodeImageButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_nRecoveredname_LastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_nRecoveredname_FirstName")
        public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_ChkIsOwner")
        public WebElement uIOwnerCheckbox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_nReleasedName_LastName")
        public WebElement uIReleasedToLastNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_nReleasedName_FirstName")
        public WebElement uIReleasedToFirstNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_adrPossAddr_txtFrom")
        public WebElement uIAddressEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_adrPossAddr_chkVerify")
        public WebElement uIAddressVerifyCheckBox;

            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtRecDrugQty")
        public WebElement uIDrugPanelQuantityEdit;

            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupLocation_CodeValue")
            public WebElement uIInitialStorageLocationCodeEdit;

            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupLocation_imgBtn")
            public WebElement uIInitialStorageLocationLookupButton;

            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtRemarks")
            public WebElement uIRemarksEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_nSendLabName_LastName")
        public WebElement uISendToLastNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_nSendLabName_FirstName")
        public WebElement uISendToFirstNameEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtPrItemNo")
        public WebElement uIPRItemNoEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_adrPossAddr_cmdIncOnAddr")
        public WebElement uIAddressIbubble;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cddContainer_DropDown")
		public WebElement uIContainer;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cddInnerPack_DropDown")
		public WebElement uIPackage; 
        
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl4_UsrPropRecovered1_lupLocation_CodeDescription")
        public WebElement uIInitialStorageLocationTextView;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupOffPFID_CodeValue")
        public WebElement uIPFCodeEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupOffPFID_CodeDescription")
        public WebElement uIPFDescriptionEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupOffPFID_imgBtn")
        public WebElement uIPFLookupbutton;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_PackSeqNoCtrl")
      		public WebElement uIContainerSeqNo;
        
        @FindBy(how = How.XPATH, using = "//input[@id='tabProperty_tmpl1_UsrPropRecovered1_adrRecAddress_txtFrom']")
		public WebElement uIRecoveredLocationEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_ORIOtherAgency_KPIState")
		public WebElement uIORIDropdown;
        
@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_ORIOtherAgency_lupORI_CodeValue")
		public WebElement uIORICodeValue;

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_custRelCSZ_City")
		public WebElement uICSZ;

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_PackSeqNoCtrl")
public WebElement uIPackSeqNoDropDown;

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cddInnerPack_DropDown")
public WebElement uIContainerPackageDropdown;

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lblStorageLoc")
public WebElement uIInitialStorageLocationLable; 

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_imgAddName")
public WebElement uIContainerPackageIcon; 

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtScanBarcode")
public WebElement uIScanBarcodeRFIDedit; 

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cmdScan")
public WebElement uIBatchScanItems; 

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtPanelScanBarcode")
public WebElement uIScanBarcodeRFIDPopupedit; 

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_GrdScan")
public WebElement uIScanBarcodeRFIDPopupGrid; 

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cmdScanupdate")
public WebElement uIRFIDpopupUpdateButton;

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cmdScancancel")
public WebElement uIRFIDpopupCancleButton;

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupLocation_CodeDescription")
public WebElement uIInitStorageLocationDescription;

@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_imgClearDate")
	public WebElement uIResetDateTime;
    }

    public class PropertyEntryHistoryTab
    {
        public WebDriver driver;
        public PropertyEntryHistoryTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.XPATH, using = "//table[@id='tblBulletins']")
        public WebElement uIHistoryResultTable;

        @FindBy(how = How.XPATH, using = "//table[@id='listStack']")
        public WebElement uIHistoryListResultTable;
    }

    public class PropertyUpdate
    {     

    	public PropertyUpdatePopup propertyUpdatePopup;
        public WebDriver driver;

        public PropertyUpdate()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            if(this.propertyUpdatePopup==null)
            {

                this.propertyUpdatePopup = new PropertyUpdatePopup();

            }
       }

        @FindBy(how = How.ID, using = "txtbarcode")
        public WebElement uIScanBarCodeEdit;

        @FindBy(how = How.ID, using = "chkLockerAll")
        public WebElement uIEvidenceLockerCheckbox;

        @FindBy(how = How.ID, using = "cmdExpand")
        public WebElement uIExpandButton;

        @FindBy(how = How.ID, using = "cmdLoad")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "grdPRBatchUpdt_ctl00_lnkbtnNext")
        public WebElement uINextButton;

        @FindBy(how = How.ID, using = "nbrCaseNo_Year")
        public WebElement uICaseYearEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_Number")
        public WebElement uICaseNoEdit;

        @FindBy(how = How.ID, using = "nbrPropNo_Number")
        public WebElement uIPropertyNoEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_imgBtn")
        public WebElement uICaseInfoButton;

        //@FindBy(how = How.ID, using = "//span[@id = 'grdPRBatchUpdt']//ti")
        //public WebElement uIPropertyUpdateTable;

        @FindBy(how = How.ID, using = "grdPRBatchUpdt")
        public WebElement uIPropertyUpdateTable;

        @FindBy(how = How.ID, using = "cmdUpdate")
        public WebElement uIProceedWithSelectionButton;

        @FindBy(how = How.ID, using = "chkSelectAll")
        public WebElement uISelectAllCheckBox;

        @FindBy(how = How.ID, using = "chkLockerAll")
        public WebElement uIchkLockerAllCheckBox;
        
        @FindBy(how = How.ID, using = "chkIsclosed")
        public WebElement uIIncludeClosedItemsCheckbox;

        @FindBy(how = How.ID, using = "lupOfficer_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "nbrPropNo_Year")
        public WebElement uIPropertyYearEdit;

        @FindBy(how = How.ID, using = "txtItemNo")
        public WebElement uIPropertyItemNoEdit;

        @FindBy(how = How.ID, using = "nbrReqNo_Year")
        public WebElement uIRequestYearEdit;

        @FindBy(how = How.ID, using = "nbrReqNo_Number")
        public WebElement uIRequestNoEdit;

        @FindBy(how = How.ID, using = "txtCrimeNo")
        public WebElement uICrimeLabNoEdit;
        
        @FindBy(how = How.XPATH, using = "//div[@id='grdPRBatchUpdt']//td[@class='gridrowclrDimGrey']")
        public WebElement uIStatusColumnRowValue;

        @FindBy(how = How.ID, using = "cmdUpdate")
        public WebElement uIUpdateButton;
        
        
        @FindBy(how = How.ID, using = "lupStorageSrch_CodeValue")
		public WebElement uIStorageLocationEdit;

		@FindBy(how = How.ID, using = "lupStorageSrch_imgBtn")
		public WebElement uIStorageLocationLookUpIcon;
		
		 @FindBy(how = How.ID, using = "chkStatLimit")
	        public WebElement uIStatutoryLimitationReachedCheckBox;
		 
		  @FindBy(how = How.ID, using = "cmdPrintBarCode")
			public WebElement uIPrintBarcodeForSelectedItemsButton;

			 @FindBy(how = How.XPATH, using = " //input[@id='cmdPrint']")
	        public WebElement uIPrintButton;

		 
      
    }

    public class PropertyUpdatePopup
    {
        public WebDriver driver;
        public PropertyUpdatePopup()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cmdCancel")
        public WebElement uICloseButton;

        @FindBy(how = How.ID, using = "cmdUpdateSave")
        public WebElement uIUpdateButton;

        @FindBy(how = How.ID, using = "dttTranDttm_Date_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='dttTranDttm_Time']//input")
        public WebElement uITimeEdit;    

        @FindBy(how = How.ID, using = "lupStorage_CodeValue")
        public WebElement uIStorageLocationEdit;

        @FindBy(how = How.ID, using = "lupStorage_CodeDescription")
        public WebElement uIStorageLocationDescTextEdit;

        @FindBy(how = How.ID, using = "lupStorage_imgBtn")
        public WebElement uIStorageLocationlupSerchButton;

        @FindBy(how = How.ID, using = "lupOffBy_CodeValue")
        public WebElement uIEmpNoEdit;

        @FindBy(how = How.ID, using = "lupOffBy_CodeDescription")
        public WebElement uIEmpNoDescEdit;

        @FindBy(how = How.ID, using = "lupOffBy_imgBtn")
        public WebElement uIEmplupSrchButton;

        @FindBy(how = How.ID, using = "lupOffBy_cmdIncOnAddr")
        public WebElement uIEmpInfoButton;

        @FindBy(how = How.ID, using = "dttFlwUpDttm_KPIDttmCtrl")
        public WebElement uIFollowUpDate;

        @FindBy(how = How.ID, using = "cddStatus_DropDown")
        public WebElement uIActionComboBox;

        @FindBy(how = How.ID, using = "txtRemark")
        public WebElement uIRemarksEdit;
               
        @FindBy(how = How.ID, using = "lupOffPFID1_CodeValue")
        public WebElement uIRelinquishedByCodeEdit;

        @FindBy(how = How.ID, using = "lupOffPFID1_CodeDescription")
        public WebElement uIRelinquishedByDescTextEdit;

        @FindBy(how = How.ID, using = "lupOffPFID1_imgBtn")
        public WebElement uIRelinquishedBylupSrchButton;

        @FindBy(how = How.ID, using = "lupOffPFID2_CodeValue")
        public WebElement uIReceivedByCodetEdit;

        @FindBy(how = How.ID, using = "lupOffPFID2_CodeDescription")
        public WebElement uIReceivedByDescTextEdit;

        @FindBy(how = How.ID, using = "lupOffPFID2_imgBtn")
        public WebElement uIReceivedByLupSrchButton;

        @FindBy(how = How.ID, using = "nRelinName_LastName")
        public WebElement uIRelinquishedByLastNameEdit;

        @FindBy(how = How.ID, using = "nRelinName_FirstName")
        public WebElement uIRelinquishedByFirstNameEdit;

        @FindBy(how = How.ID, using = "nRelinName_FirstName")
        public WebElement uIRelinquishedByMiddleNameEdit;

        @FindBy(how = How.ID, using = "nRelinName_Suffix_DropDown")
        public WebElement uIRelinquishedBySuffixDropDown;

        @FindBy(how = How.ID, using = "nRelinName_imgSrch")
        public WebElement uIRelinquishedBylupNameSrchButton;

        @FindBy(how = How.ID, using = "nRecName_LastName")
        public WebElement uIReceivedByLastNameEdit;

        @FindBy(how = How.ID, using = "nRecName_FirstName")
        public WebElement uIReceivedByFirstNameEdit;

        @FindBy(how = How.ID, using = "nRecName_MiddleName")
        public WebElement uIReceivedByMiddleNameEdit;

        @FindBy(how = How.ID, using = "nRecName_Suffix_DropDown")
        public WebElement uIReceivedBySuffixDropDown;

        @FindBy(how = How.ID, using = "nRecName_imgSrch")
        public WebElement uIReceivedByLupNameSrchButton;

        @FindBy(how = How.ID, using = "adrRelinqAdr_txtFrom")
        public WebElement uIRelinquishedByAddressEdit;

        @FindBy(how = How.ID, using = "adrRelinqAdr_chkVerify")
        public WebElement uIRelinquishedByAddressVerifyCheckbox;

        @FindBy(how = How.ID, using = "adrRecAdr_txtFrom")
        public WebElement uIReceivedByAddressEdit;

        @FindBy(how = How.ID, using = "adrRecAdr_chkVerify")
        public WebElement uIReceivedByAddressVerifyCheckbox;

        @FindBy(how = How.ID, using = "custRelinqCSZ_City")
        public WebElement uIRelinquishedByCSZCityEdit;

        @FindBy(how = How.ID, using = "custRelinqCSZ_State_DropDown")
        public WebElement uIRelinquishedByCSZStateDropDown;

        @FindBy(how = How.ID, using = "custRelinqCSZ_Zip")
        public WebElement uIRelinquishedByCSZZipEdit;

        @FindBy(how = How.NAME, using = "custRelinqCSZ$ctl01")
        public WebElement uIRelinquishedByCSZLupSrchButton;

        @FindBy(how = How.ID, using = "custRecCSZ_City")
        public WebElement uIReceivedByCSZCityEdit;

        @FindBy(how = How.ID, using = "custRecCSZ_State_DropDown")
        public WebElement uIReceivedByCSZStateDropDown;

        @FindBy(how = How.ID, using = "custRecCSZ_Zip")
        public WebElement uIReceivedByCSZZipEdit;

        @FindBy(how = How.NAME, using = "custRecCSZ$ctl01")
        public WebElement uIReceivedByCSZLupSrchButton;

        @FindBy(how = How.ID, using = "cddLocation_DropDown")
        public WebElement uIStorageLocationComboBox;

        @FindBy(how = How.ID, using = "lupStorage_CodeValue")
        public WebElement uIStorageLocationCodeEdit;

        @FindBy(how = How.ID, using = "lupStorage_imgBtn")
        public WebElement uIStorageLocationLookupButton;

        @FindBy(how = How.ID, using = "lupTransOffPFID_CodeValue")
        public WebElement uIPFNoCodeEdit;

        @FindBy(how = How.ID, using = "lupTransOffPFID_CodeDescription")
        public WebElement uIPFNoDescTextEdit;

//        @FindBy(how = How.XPATH, using = "//div[@id='Radstatusdd']//span[@class='rddtInner']")
//        public WebElement uIActionRadComboBox;
        
        @FindBy(how = How.XPATH, using = "//div[@id='Radstatusdd']//span[@class='rddtInner']")
        public WebElement uIActionRadInput;

        @FindBy(how = How.ID, using = "Radstatusdd_EmbeddedTree")
        public WebElement uIActionRadDropComboBox;

        @FindBy(how = How.XPATH, using = "//span[@class='rddtInner focus rddtFocused']")
        public WebElement uIActionRadExpandComboBox;
        
        @FindBy(how = How.XPATH, using ="//span[text()='Select List']")
        public WebElement uIActionDropdown;
        
        @FindBy(how = How.ID, using = "ChkIsOwner")
		public WebElement uIOwnerCheckbox; 

        @FindBy(how = How.ID, using = "Radstatusdd_EmbeddedTree")
     		public WebElement uIActionTreeView; 
        
        @FindBy(how = How.ID, using = "lupName_LastName")
     		public WebElement uILastNameEdit; 
        
        @FindBy(how = How.ID, using = "lupName_FirstName")
     		public WebElement uIFirstNameEdit; 
        
        @FindBy(how = How.ID, using = "cmdCencel")
      		public WebElement uICancelButton;
        
        @FindBy(how = How.ID, using = "imgRelinqSign_chkIsEnableSign")
		public WebElement uIRelinquishedSignCheckBox;
        
        @FindBy(how = How.ID, using = "lblRelingby")
		public WebElement uIRelinquishedByLabel;

		@FindBy(how = How.ID, using = "lblRecBy")
		public WebElement uIReceivedByLabel;

		@FindBy(how = How.XPATH, using = "//input[@id='tabPropRoom_tmpl3_UsrCustody1_imgRelinq']")
        public WebElement uIRelinqSignImage;
		
		@FindBy(how = How.ID, using = "imgRecvdBySign_chkIsEnableSign")
		public WebElement uIReceivedSignCheckBox;
		
		@FindBy(how = How.ID, using = "imgRecvdBySign_imgSign")
		public WebElement uIRecvdBySignImage;

		@FindBy(how = How.ID, using = "lblRelingby")
		public WebElement uIReLinquishedByText;

		@FindBy(how = How.ID, using = "lblRecBy")
		public WebElement uIReceivedByText;

		@FindBy(how = How.ID, using = "lupOffPFID1_CodeValue")
		public WebElement uIReLinquishedByPFNo;

		@FindBy(how = How.ID, using = "lupOffPFID2_CodeValue")
		public WebElement uIReceivedByPFNo;

		@FindBy(how = How.XPATH, using = "//span[@class='rddtFakeInput rddtEmptyMessage']")
        public WebElement uIActionRadComboBox;

		@FindBy(how = How.XPATH, using = "//input[@id='imgRelinq']")
		public WebElement uIRelinquishedBySignImage;

		@FindBy(how = How.XPATH, using = "//input[@id='imgReceived']")
		public WebElement uIReceivedBySignImage;

		@FindBy(how = How.ID, using = "imgRelinq")
		public WebElement uIRelinqSignImageButton;

		@FindBy(how = How.ID, using = "imgReceived")
		public WebElement uIRecvdBySignImageButton;
		
    }

    public class PropertyUpdateHelpWindow
    {
    	public PropertyUpdateHelpWindowPopup propertyUpdateHelpWindowPopup;
        public WebDriver driver;

        public PropertyUpdateHelpWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
       	 if (this.propertyUpdateHelpWindowPopup == null)
         {
             this.propertyUpdateHelpWindowPopup = new PropertyUpdateHelpWindowPopup();
         }
        }

        @FindBy(how = How.ID, using = "txtbarcode")
        public WebElement uIScanBarCodeEdit;

        @FindBy(how = How.ID, using = "chkLockerAll")
        public WebElement uIEvidenceLockerCheckbox;

        @FindBy(how = How.ID, using = "cmdExpand")
        public WebElement uIExpandButton;

        @FindBy(how = How.ID, using = "cmdLoad")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "grdPRBatchUpdt_ctl00_lnkbtnNext")
        public WebElement uINextButton;

        @FindBy(how = How.ID, using = "nbrCaseNo_Year")
        public WebElement uICaseYearEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_Number")
        public WebElement uICaseNoEdit;

        @FindBy(how = How.ID, using = "nbrPropNo_Number")
        public WebElement uIPropertyNoEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_imgBtn")
        public WebElement uICaseInfoButton;

        //@FindBy(how = How.ID, using = "//span[@id = 'grdPRBatchUpdt']//ti")
        //public WebElement uIPropertyUpdateTable;

        @FindBy(how = How.ID, using = "grdPRBatchUpdt")
        public WebElement uIPropertyUpdateTable;

        @FindBy(how = How.ID, using = "cmdUpdate")
        public WebElement uIProceedWithSelectionButton;

        @FindBy(how = How.ID, using = "chkSelectAll")
        public WebElement uISelectAllCheckBox;

        @FindBy(how = How.ID, using = "chkLockerAll")
        public WebElement uIchkLockerAllCheckBox;

        @FindBy(how = How.ID, using = "chkIsclosed")
        public WebElement uIIncludeClosedItemsCheckbox;

        @FindBy(how = How.ID, using = "lupOfficer_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "nbrPropNo_Year")
        public WebElement uIPropertyYearEdit;

        @FindBy(how = How.ID, using = "txtItemNo")
        public WebElement uIPropertyItemNoEdit;

        @FindBy(how = How.ID, using = "nbrReqNo_Year")
        public WebElement uIRequestYearEdit;

        @FindBy(how = How.ID, using = "nbrReqNo_Number")
        public WebElement uIRequestNoEdit;

  		//txtRemark
        @FindBy(how = How.ID, using = "txtRemark")
        public WebElement uIRemarkEdit;
    }

    public class PropertyUpdateHelpWindowPopup
    {
        public WebDriver driver;
        public PropertyUpdateHelpWindowPopup()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cmdCancel")
        public WebElement uICloseButton;

        @FindBy(how = How.ID, using = "cmdUpdateSave")
        public WebElement uIUpdateButton;

        @FindBy(how = How.ID, using = "dttTranDttm_Date_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='dttTranDttm_Time']//input")
        public WebElement uITimeEdit;

        @FindBy(how = How.ID, using = "lupStorage_CodeValue")
        public WebElement uIStorageLocationEdit;

        @FindBy(how = How.ID, using = "lupStorage_CodeDescription")
        public WebElement uIStorageLocationDescTextEdit;

        @FindBy(how = How.ID, using = "lupStorage_imgBtn")
        public WebElement uIStorageLocationlupSerchButton;

        @FindBy(how = How.ID, using = "lupOffBy_CodeValue")
        public WebElement uIEmpNoEdit;

        @FindBy(how = How.ID, using = "lupOffBy_CodeDescription")
        public WebElement uIEmpNoDescEdit;

        @FindBy(how = How.ID, using = "lupOffBy_imgBtn")
        public WebElement uIEmplupSrchButton;

        @FindBy(how = How.ID, using = "lupOffBy_cmdIncOnAddr")
        public WebElement uIEmpInfoButton;

        @FindBy(how = How.ID, using = "dttFlwUpDttm_KPIDttmCtrl")
        public WebElement uIFollowUpDate;

        @FindBy(how = How.ID, using = "cddStatus_DropDown")
        public WebElement uIActionComboBox;

		 @FindBy(how = How.ID, using = "Radstatusdd_EmbeddedTree")
        public WebElement uIActionRadDropComboBox;

        @FindBy(how = How.XPATH, using = "//span[@class='rddtInner focus rddtFocused']")
        public WebElement uIActionRadExpandComboBox;

        @FindBy(how = How.ID, using = "txtRemark")
        public WebElement uIRemarksEdit;

        @FindBy(how = How.ID, using = "lupOffPFID1_CodeValue")
        public WebElement uIRelinquishedByCodeEdit;

        @FindBy(how = How.ID, using = "lupOffPFID1_CodeDescription")
        public WebElement uIRelinquishedByDescTextEdit;

        @FindBy(how = How.ID, using = "lupOffPFID1_imgBtn")
        public WebElement uIRelinquishedBylupSrchButton;

        @FindBy(how = How.ID, using = "lupOffPFID2_CodeValue")
        public WebElement uIReceivedByCodetEdit;

        @FindBy(how = How.ID, using = "lupOffPFID2_CodeDescription")
        public WebElement uIReceivedByDescTextEdit;

        @FindBy(how = How.ID, using = "lupOffPFID2_imgBtn")
        public WebElement uIReceivedByLupSrchButton;

        @FindBy(how = How.ID, using = "nRelinName_LastName")
        public WebElement uIRelinquishedByLastNameEdit;

        @FindBy(how = How.ID, using = "nRelinName_FirstName")
        public WebElement uIRelinquishedByFirstNameEdit;

        @FindBy(how = How.ID, using = "nRelinName_FirstName")
        public WebElement uIRelinquishedByMiddleNameEdit;

        @FindBy(how = How.ID, using = "nRelinName_Suffix_DropDown")
        public WebElement uIRelinquishedBySuffixDropDown;

        @FindBy(how = How.ID, using = "nRelinName_imgSrch")
        public WebElement uIRelinquishedBylupNameSrchButton;

        @FindBy(how = How.ID, using = "nRecName_LastName")
        public WebElement uIReceivedByLastNameEdit;

        @FindBy(how = How.ID, using = "nRecName_FirstName")
        public WebElement uIReceivedByFirstNameEdit;

        @FindBy(how = How.ID, using = "nRecName_MiddleName")
        public WebElement uIReceivedByMiddleNameEdit;

        @FindBy(how = How.ID, using = "nRecName_Suffix_DropDown")
        public WebElement uIReceivedBySuffixDropDown;

        @FindBy(how = How.ID, using = "nRecName_imgSrch")
        public WebElement uIReceivedByLupNameSrchButton;



        @FindBy(how = How.ID, using = "adrRelinqAdr_txtFrom")
        public WebElement uIRelinquishedByAddressEdit;

        @FindBy(how = How.ID, using = "adrRelinqAdr_chkVerify")
        public WebElement uIRelinquishedByAddressVerifyCheckbox;


        @FindBy(how = How.ID, using = "adrRecAdr_txtFrom")
        public WebElement uIReceivedByAddressEdit;

        @FindBy(how = How.ID, using = "adrRecAdr_chkVerify")
        public WebElement uIReceivedByAddressVerifyCheckbox;


        @FindBy(how = How.ID, using = "custRelinqCSZ_City")
        public WebElement uIRelinquishedByCSZCityEdit;

        @FindBy(how = How.ID, using = "custRelinqCSZ_State_DropDown")
        public WebElement uIRelinquishedByCSZStateDropDown;

        @FindBy(how = How.ID, using = "custRelinqCSZ_Zip")
        public WebElement uIRelinquishedByCSZZipEdit;

        @FindBy(how = How.NAME, using = "custRelinqCSZ$ctl01")
        public WebElement uIRelinquishedByCSZLupSrchButton;


        @FindBy(how = How.ID, using = "custRecCSZ_City")
        public WebElement uIReceivedByCSZCityEdit;

        @FindBy(how = How.ID, using = "custRecCSZ_State_DropDown")
        public WebElement uIReceivedByCSZStateDropDown;

        @FindBy(how = How.ID, using = "custRecCSZ_Zip")
        public WebElement uIReceivedByCSZZipEdit;

        @FindBy(how = How.NAME, using = "custRecCSZ$ctl01")
        public WebElement uIReceivedByCSZLupSrchButton;

        @FindBy(how = How.ID, using = "cddLocation_DropDown")
        public WebElement uIStorageLocationComboBox;

        @FindBy(how = How.ID, using = "lupStorage_CodeValue")
        public WebElement uIStorageLocationCodeEdit;

        @FindBy(how = How.ID, using = "lupStorage_imgBtn")
        public WebElement uIStorageLocationLookupButton;

        @FindBy(how = How.ID, using = "lupTransOffPFID_CodeValue")
        public WebElement uIPFNoCodeEdit;

        @FindBy(how = How.ID, using = "lupTransOffPFID_CodeDescription")
        public WebElement uIPFNoDescTextEdit;
    }

    public class PropertyRoomRoles
    {
        public  WebDriver driver;
        public PropertyTab propertyTab;
        public StorageTab storageTab;
        public DispositionTab dispositionTab;
        public ChainTab chainTab;
        public HistoryTab historyTab;      
        public PropertyRoomRolesRecoveredTab propertyRoomRolesRecoveredTab;
        public PropertyRoomRoles()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            if(this.propertyTab==null)
            {
                this.propertyTab=new PropertyTab();
            }
            if(this.storageTab==null)
            {
                this.storageTab=new StorageTab();
            }
            if(this.dispositionTab==null)
            {
                this.dispositionTab=new DispositionTab();
            }
            if(this.chainTab==null)
            {
                this.chainTab=new ChainTab();
            }
        
            
            if(this.historyTab==null)
            {
                this.historyTab=new HistoryTab();
            }
            
            if(this.propertyRoomRolesRecoveredTab==null)
            {
                this.propertyRoomRolesRecoveredTab=new PropertyRoomRolesRecoveredTab();
            }
        }


        @FindBy(how = How.ID, using = "lblRstStatus")
        public WebElement uIStatusLable;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Property')]")
        public WebElement uIPropertyTabSpan;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Storage')]")
        public WebElement uIStorageTabSpan;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Disposition')]")
        public WebElement uIDispositionTabSpan;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Chain')]")
        public WebElement uIChainTabSpan;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
        public WebElement uIAttachmentsTabSpan;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'History')]")
        public WebElement uIHistoryTabSpan;

        @FindBy(how = How.ID, using = "nbrPropNo_imgBtn")
        public WebElement uIPropertyNoInfoIcon;
        
        @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
        public WebElement uIPFCodeEdit;
        
        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "cmdPrint")
        public WebElement uIPrintButton;
        
        @FindBy(how = How.XPATH, using = "//span[text()='Recovered']")
        public WebElement uIRecoverdTab;

        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
        public WebElement uIBottomLeftSideStatusBar;
    }

    public class PropertyTab
    {
       
        public WebDriver driver;
        
        public PropertyTab()
        {
            driver = Playback.driver;
           PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl0_UsrProperty1_chkIsRecForOther")
        public WebElement uIRecoverForOtherAgencyCheckBox;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl0_UsrProperty1_lupPropCode_CodeValue")
        public WebElement uIPCLookup;
        
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl0_UsrProperty1_txtmodel")
        public WebElement uIModelEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl0_UsrProperty1_cddColor1_DropDown")
        public WebElement uIColorEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl0_UsrProperty1_txtSerial")
        public WebElement uISerialNoEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl0_UsrProperty1_cddPropCat_DropDown")
        public WebElement uIPropertyComboBox;
    }

    public class StorageTab
    {
        WebDriver driver;
        public StorageTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);

        }


        @FindBy(how = How.ID, using = "lblRstStatus")
        public WebElement uIStatusLable;
        
        @FindBy(how = How.ID, using = "Radstatusdd_EmbeddedTree")
        public WebElement uIActionRadDropComboBox;
        
		@FindBy(how = How.XPATH, using = "//span[@class='rddtFakeInput rddtEmptyMessage']")
        public WebElement uIActionRadComboBox;
                @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_dttRecDttm_Date_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='tabPropRoom_tmpl1_UsrStorage1_dttRecDttm_Time']//input")
        public WebElement uITimeEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_lupOffPF_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_cddStatus_DropDown")
        public WebElement uIActionCombobox;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_lblLocId")
        public WebElement uIStorageLocationLable;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_lupLocID_CodeValue")
        public WebElement uIStorageLocationCodeEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_lupLocID_imgBtn")
        public WebElement uIStorageLocationLookupIcon;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_txtCrime")
        public WebElement uICrimeLabEdit;
        
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_dttFlwUpDttm_KPIDttmCtrl")
        public WebElement uIFollowupDateEdit;     
    
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_txtFlwupNotes")
        public WebElement uIFollowupNoteEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_txtSummary")
        public WebElement uINotesEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='Radstatusdd']")
        public WebElement uIActionArrow;

			@FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_Radstatusdd_EmbeddedTree")
        public WebElement uIActionRadDropdown93;
    }

    public class DispositionTab
    {
       public WebDriver driver;
        public DispositionTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);

        }


        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_dttDisDttm_Date_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='tabPropRoom_tmpl2_UsrDisposed1_dttDisDttm_Time']//input")
        public WebElement uITimeEdit;    

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupOffPFID_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupOffPFID_CodeValue")
        public WebElement uIOfficerDescTextEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupOffPFID_CodeValue")
        public WebElement uIOfficerLupSrchButton;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupOffPFID_CodeValue")
        public WebElement uIStatusLable;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_cddDisposition_DropDown")
        public WebElement uIDispositionDropDown;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupName_LastName")
        public WebElement uIReleasedToLastNameEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupName_FirstName")
        public WebElement uIReleasedToFirstNameEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupName_MiddleName")
        public WebElement uIReleasedToMiddleNameEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupName_Suffix_DropDown")
        public WebElement uIReleasedToSuffixDropDown;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_lupName_imgSrch")
        public WebElement uIReleasedToLupSerchButton;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl2_UsrDisposed1_txtNotes")
		public WebElement uINotes;

    }

    public class ChainTab
    {
      public WebDriver driver;
        public ChainTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_grdCustody")
        public WebElement uIChainTabUsrCustodyTable;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_cmdUpdate")
        public WebElement uIUpdateButton;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_lupOffPFID2_CodeDescription")
        public WebElement uIReceivedByCombobox;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_lupOffPFID1_CodeValue")
        public WebElement uIRelinquishedByCodeEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_lupOffPFID2_CodeValue")
        public WebElement uIReceivedByCodeEdit;

        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_lupOffPFID2_imgBtn")
        public WebElement uIReceivedByLookupButton;
        
        @FindBy(how = How.ID, using ="tabPropRoom_tmpl3_UsrCustody1_imgRelinqSign_chkIsEnableSign")
        public WebElement uIRelinquishedSign;
        
        @FindBy(how = How.ID, using ="tabPropRoom_tmpl3_UsrCustody1_imgRecvdBySign_chkIsEnableSign")
        public WebElement uIReceivedSign;
        
        @FindBy(how = How.ID, using ="tabPropRoom_tmpl3_UsrCustody1_lupOffPFID2_CodeValue")
        public WebElement uIReceivedPFCode;
        
        @FindBy(how = How.ID, using ="tabPropRoom_tmpl3_UsrCustody1_lupOffPFID1_CodeValue")
        public WebElement uIRelinquishedPFCode;
        
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl1_UsrStorage1_lupLocID_imgBtn")
        public WebElement uIStorageLocationLookupIcon;
        
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_imgRelinqSign_imgSign")
		public WebElement uIRelinqSignImage;
        
        @FindBy(how = How.ID, using = "tabPropRoom_tmpl3_UsrCustody1_imgRecvdBySign_imgSign")
		public WebElement uIRecvdBySignImage; 
        
        @FindBy(how = How.ID, using = "imgRecvdBySign_chkIsEnableSign")
        public WebElement uIReceivedSignCheckBox; 
    }

   

    public class HistoryTab
    {
        public WebDriver driver;
       public HistoryTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);          
        }

       @FindBy(how = How.ID, using = "listStack")
       public WebElement uIHistoryListTable;

       @FindBy(how = How.ID, using = "frmCplPolStatus")
       public WebElement uIHistoryForm;

    }
    
    public class PropertyRoomRolesRecoveredTab
    {
    	
    	 public WebDriver driver;

         public PropertyRoomRolesRecoveredTab()
         {

             driver = Playback.driver;
             PageFactory.initElements(driver, this);

         }
       
         @FindBy(how = How.ID, using = "tabPropRoom_tmpl4_UsrPropRecovered1_cddDisposition_DropDown")
         public WebElement uIDispositionComboBox;

         @FindBy(how = How.ID, using = "tabPropRoom_tmpl4_UsrPropRecovered1_lupLocation_CodeDescription")
         public WebElement uIInitialStorageLocationRead; 
         
        
    }

    public class AttachPropertyPopup
    {

        public WebDriver driver;

        public AttachPropertyPopup()
        {

            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "grdPropEntry")
        public WebElement uIResultTable;

        @FindBy(how = How.ID, using = "cmdAttchProRpt")
        public WebElement uIAttachPropertyReportButton;


    }



    public class PropertySearch
    {

    	public PropertySearchAdvancedTab propertySearchAdvancedTab;
        public WebDriver driver;
        public PropertySearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);     
            if (this.propertySearchAdvancedTab == null)
            {
                this.propertySearchAdvancedTab = new PropertySearchAdvancedTab();
            }
        }

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New Property')]")
        public WebElement uIAddNewPropertyButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;

        @FindBy(how = How.XPATH, using = "//a/span[contains(text(),'Back')]")
        public WebElement uIBackButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtCaseNoFrom_Year")
        public WebElement uIFromCaseYearEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtCaseNoFrom_Number")
        public WebElement uIFromCaseNumberEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtCaseNoTo_Year")
        public WebElement uIToCaseYearEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtCaseNoTo_Number")
        public WebElement uIToCaseNumberEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_nbrPrpertyFrom_Year")
        public WebElement uIFromPropertyYearEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_nbrPrpertyFrom_Number")
        public WebElement uIFromPropertyNumberEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_nbrPrpertyTo_Year")
        public WebElement uIToPropertyYearEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_nbrPrpertyTo_Number")
        public WebElement uIToPropertyNumberEdit;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_chkIsclosed")
        public WebElement uIIncludeClosedItemsCheckBox;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_cddPropStatus_DropDown")
        public WebElement uIStatusComboBox;

        @FindBy(how = How.ID, using = "grdProperty")
        public WebElement uIPropertySearchResultTable;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Advanced')]")
        public WebElement uIAdvancedTab;
        
        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtNameID")
		public WebElement uINameTypeIDEdit;

@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtLastName")
		public WebElement uILastNameEdit;
		
		@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtFirstName")
		public WebElement uIFirstNameEdit;

	@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtMiddleName")
		public WebElement uIMiddleNameEdit;
	
    @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_cddDisposition_DropDown")
    public WebElement uIDispositionComboBox;
    
    @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_lstJuris")
    public WebElement uIJurisComboBox;
    
    @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_dttFrom_KPIDttmCtrl")
	public WebElement uIFromDateEdit;

	@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_dttTo_KPIDttmCtrl")
	public WebElement uIToDateEdit;

	@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_lupOfficer_CodeValue")
	public WebElement uIOfficerID;

	@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_lupStorageSrch_CodeValue")
	public WebElement uIStorageLocationEdit;

	@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_lupStorageSrch_CodeDescription")
	public WebElement uIStorageLocationDescription;
	
	@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_cddDtSrchType_DropDown")
		public WebElement uIDateSearchByComboBox;
	
	@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_lupStorageSrch_imgBtn")
	public WebElement uIStorageLocationSearchButton;

    }
    public class PropertySearchAdvancedTab
    {
        public WebDriver driver;
        public PropertySearchAdvancedTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }
        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropSrchAdv_lupPropCode_CodeValue")
        public WebElement uIPCEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropSrchAdv_txtBrand")
        public WebElement uIBrandEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropSrchAdv_txtModel")
        public WebElement uIModelEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropSrchAdv_lupGunMake_CodeValue")
        public WebElement uIGunMakeEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropSrchAdv_txtGunModel")
        public WebElement uIGunModelEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropSrchAdv_txtGunCaliber")
        public WebElement uICaliberGaugeEdit;

        @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropSrchAdv_chkIsTrace")
        public WebElement uITraceCheckBox;

    }

    public class PropertySearchHelpWindow
    {
        public WebDriver driver;
        public PropertySearchHelpWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New Property')]")
        public WebElement uIAddNewPropertyButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
        public WebElement uIBackButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
        public WebElement uIRefreshButton;

        @FindBy(how = How.ID, using = "grdProperty")
        public WebElement uIPropertySearchResultTable;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Select Property')]")
        public WebElement uISelectPropertyButton;

        @FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_cddPropType_DropDown")
		public WebElement uIPropertyTypeComboBox;
		
		@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtNID")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtNameID")
		public WebElement uINameTypeIDEdit;
		
		@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtLastName")
		public WebElement uILastNameEdit;
		
		@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtFirstName")
		public WebElement uIFirstNameEdit;
		
		@FindBy(how = How.ID, using = "tabProperty_tmpl0_ctrlUsrPropSrchBasic_txtMiddleName")
		public WebElement uIMiddleNameEdit;
    }

    public class PropertyIndex
    {
		public PropertyIndexMainTab propertyIndexMainTab;
		public PropertyIndexRecoveredTab propertyIndexRecoveredTab;
        public PropertyIndexHistoryTab propertyIndexHistoryTab;

        public WebDriver driver;
        public PropertyIndex()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            if ((this.propertyIndexMainTab == null))
            {
                this.propertyIndexMainTab = new PropertyIndexMainTab();
            }
            if ((this.propertyIndexHistoryTab == null))
            {
                this.propertyIndexHistoryTab = new PropertyIndexHistoryTab();
            }

            if ((this.propertyIndexRecoveredTab == null))
            {
                this.propertyIndexRecoveredTab = new PropertyIndexRecoveredTab();

            }
        }

        @FindBy(how = How.ID, using = "cmdReportMaster")
        public WebElement uIReportDetailsButton;

        @FindBy(how = How.ID, using = "nbrCaseNo_imgBtn")
        public WebElement uICaseInformationButton;

        @FindBy(how = How.ID, using = "nbrPropNo_Year")
        public WebElement uIPropertyYearEdit;

        @FindBy(how = How.ID, using = "nbrPropNo_Number")
        public WebElement uIPropertyNumberEdit;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "cmdPrint")
        public WebElement uIPrintButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "cmdDelete")
        public WebElement uIDeleteButton;

        @FindBy(how = How.ID, using = "cmdSubmit")
        public WebElement uISubmitButton;

        @FindBy(how = How.ID, using = "cmdAdd")
        public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "txtDescription")
        public WebElement uIDescriptionEdit;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
        public WebElement uIMainTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Recovered')]")
        public WebElement uIRecoveredTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
        public WebElement uIAttachmentTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Comments')]")
        public WebElement uICommentsTab;

        @FindBy(how = How.ID, using = "nbrCaseNo_Year")
        public WebElement uICaseYearEdit;

        @FindBy(how = How.ID, using = "nbrCaseNo_Number")
        public WebElement uICaseNumberEdit;

        @FindBy(how = How.ID, using = "lupOffPFID_CodeValue")
        public WebElement uIOfficerCodeEdit;

        @FindBy(how = How.ID, using = "lblRstStatus")
		public WebElement uIMenubar; 
        
        @FindBy(how = How.ID, using = "imgDetail")
        public WebElement uIPropertyBblIcon; 

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'History')]")
        public WebElement uIHistoryTab;
        
        @FindBy(how = How.ID, using = "lblRstStatus")
        public WebElement uIStatusTextView;
        
        @FindBy(how = How.ID, using = "BtnNotify")
        public WebElement uINotifyButton;

    }

        public class PropertyIndexMainTab
        {
            public WebDriver driver;

            public PropertyIndexMainTab()
            {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }
            
            @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddReason_DropDown")
            public WebElement uIReasonComboBox;

            @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_cddPropCat_DropDown")
            public WebElement uIPropertyComboBox;

            @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_TxtPropType")
            public WebElement uIPropertyTypeEdit;

            @FindBy(how = How.ID, using = "tabProperty_tmpl0_UsrProperty1_txtSerial")
            public WebElement uISerialEdit;
        }
        public class PropertyIndexHistoryTab
        {
            public WebDriver driver;

            public PropertyIndexHistoryTab()
            {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }            
            
            @FindBy(how = How.XPATH, using = "(//table[@id='Table2'])[1]")
            public WebElement uIHistoryChangeStatus;
            
            @FindBy(how = How.XPATH, using = "//table[@id='tblBulletins']")
            public WebElement uIHistoryResultTable;

            @FindBy(how = How.XPATH, using = "//table[@id='listStack']")
            public WebElement uIHistoryListResultTable;
        }
        
      
        
        public class PropertyIndexRecoveredTab
        {
            public WebDriver driver;

            public PropertyIndexRecoveredTab()
            {
                driver = Playback.driver;
                PageFactory.initElements(driver, this);
            }
            
            
            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupLocation_CodeDescription")
            public WebElement uIInitStorageLocation;
            
            //tabProperty_tmpl1_UsrPropRecovered1_lupLocation_CodeValue
            
            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupLocation_CodeValue")
            public WebElement uIInitStorageLocationValue;
            
            
            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_txtCurrentLocation")
            public WebElement uIcurrentStorageLocation;
            
            @FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_cddDisposition_DropDown")
            public WebElement uIStatusDropdown;


			@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_barPropItem")
			public WebElement uIBarCode;


			@FindBy(how = How.ID, using = "tabProperty_tmpl1_UsrPropRecovered1_lupLocation_CodeDescription")
            public WebElement uIInitStorageLocationDescription;

        }



    public class PropertyNCICCode
    {
        public WebDriver driver;
        public PropertyNCICCode()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewLink;

        @FindBy(how = How.ID, using = "cmdSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "grdProperty")
        public WebElement uIPropertyNCICResultGrid;
    }


    public class PropertyNCICEntry
    {
        public WebDriver driver;
        public PropertyNCICEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cddPropCat_DropDown")
        public WebElement uIPropertyCategoryComboBox;

        @FindBy(how = How.ID, using = "txtPropCode")
        public WebElement uIPropertyCodeEdit;

        @FindBy(how = How.ID, using = "txtDescription")
        public WebElement uIDescriptionEdit;

        @FindBy(how = How.ID, using = "txtDescription")
        public WebElement uIUCRLineNoEdit;

        @FindBy(how = How.ID, using = "cddNIBRSProp_DropDown")
        public WebElement uINIBRSComboBox;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;


    }

    public class AuditSearch
    {
        public WebDriver driver;
        public AuditSearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }

        @FindBy(how = How.ID, using = "Search")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[text()='Add New']")
        public WebElement uIAddNewButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]/ancestor::li[@unselectable='on']")
        public WebElement uIAddNewView;

        @FindBy(how = How.ID, using = "grdPropAudit")
        public WebElement uIAuditSearchResultgrid;

    }

    public class AuditEditEntry
    {
        public WebDriver driver;
        public AuditEditEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }

        @FindBy(how = How.ID, using = "cddAuditType_DropDown")

		public WebElement uIAuditTypeComboBox;

		@FindBy(how = How.ID, using = "Auditdttm_Date_KPIDttmCtrl")

		public WebElement uIAuditDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='Auditdttm_Time']//input")

		public WebElement uIAuditTimeEdit;

		@FindBy(how = How.ID, using = "nmcAuditNo_Year")

		public WebElement uIAuditYearEdit;

		@FindBy(how = How.ID, using = "nmcAuditNo_Number")

		public WebElement uIAuditNumberEdit;

		@FindBy(how = How.ID, using = "txtAuditName")

		public WebElement uIAuditNameEdit;

		@FindBy(how = How.ID, using = "cddAuditType_DropDown")

		public WebElement uIAuditCombobox;

		@FindBy(how = How.ID, using = "lblAuditDateTime")

		public WebElement uIAuditDateTimeLabel;

		@FindBy(how = How.ID, using = "lblAuditBy")

		public WebElement uIAuditByLabel;

		@FindBy(how = How.ID, using = "lblAuditType")

		public WebElement uIAuditTypeLabel;

		@FindBy(how = How.ID, using = "lblAuditName")

		public WebElement uIAuditNameLabel;

		@FindBy(how = How.ID, using = "cmdCancel")

		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "cddStorageRow_DropDown")

		public WebElement uIStorageRowCombobox;

		@FindBy(how = How.ID, using = "cddStorageRoom_DropDown")

		public WebElement uIStorageRoomCombobox;

		@FindBy(how = How.ID, using = "cddStorageBuilding_DropDown")

		public WebElement uIStorageBuildingCombobox;

		@FindBy(how = How.ID, using = "cddPropType_DropDown")

		public WebElement uIPropertyTypeComboBox;

		@FindBy(how = How.ID, using = "cmdAudit")

		public WebElement uICreateAuditButton;

		@FindBy(how = How.ID, using = "lstJuris")

		public WebElement uIJurisCombobox;

		@FindBy(how = How.ID, using = "lupStorageSrch_CodeValue")

		public WebElement uIAuditLocationEdit;

		@FindBy(how = How.ID, using = "lupLocation_CodeValue")

		public WebElement uILocationEdit;

		@FindBy(how = How.ID, using = "lupLocation_imgBtn")

		public WebElement uILocationLookupButton;

		@FindBy(how = How.ID, using = "ChkIsLocCompleted")

		public WebElement uILocationCompletedCheckBox;

		@FindBy(how = How.ID, using = "cmdTransmit")

		public WebElement uITransmitButton;

		@FindBy(how = How.ID, using = "grdAudit")

		public WebElement uIAuditEntryResultgrid;

		@FindBy(how = How.ID, using = "txtAuditBalance")

		public WebElement uIAuditBalanceTextView;

		@FindBy(how = How.ID, using = "txtLocCount")

		public WebElement uICountTextView;

		@FindBy(how = How.ID, using = "lupAccOffPFID_CodeValue")

		public WebElement uIAcceptedByEdit;

		@FindBy(how = How.ID, using = "lupAccOffPFID_imgBtn")

		public WebElement uIAcceptedByLookupButton;

		@FindBy(how = How.ID, using = "dttAcceptDttm_Date_KPIDttmCtrl")

		public WebElement uIAcceptedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dttAcceptDttm_Time']//input")

		public WebElement uIAcceptedTimeEdit;

		@FindBy(how = How.ID, using = "cmdSave")

		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")

		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")

		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")

		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "lupAuditby_imgBtn")

		public WebElement uIAuditedByLookup;

		@FindBy(how = How.ID, using = "lupAuditby_CodeValue")

		public WebElement uIAuditedByEdit;

		@FindBy(how = How.ID, using = "lupStorageSrch_CodeDescription")

		public WebElement uIStorageLocationDescriptionEdit;

		@FindBy(how = How.ID, using = "lupAuditby_imgBtn")

		public WebElement uIStorageLocationLookup;

		@FindBy(how = How.ID, using = "lupStorageSrch_CodeValue")

		public WebElement uIStorageLocationEdit;
		@FindBy(how = How.XPATH, using = "//span[text()='Audit']")
		public WebElement uIAuditTab;

	}


    public class PawnEntry
    {
             public PawnEntryMainTab pawnEntryMainTab;
           public DealerTab dealerTab;
         public WebDriver driver;
        public PawnEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);   
            if (this.pawnEntryMainTab == null)
            {
                this.pawnEntryMainTab = new PawnEntryMainTab();
            }
            if (this.dealerTab == null)
            {
                this.dealerTab = new DealerTab();
            }
        }

        @FindBy(how = How.ID, using = "cddPawnType_DropDown")
        public WebElement uITypeComboBox;

        @FindBy(how = How.ID, using = "Pawndttmtime_Date_KPIDttmCtrl")
        public WebElement uIDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id = 'Pawndttmtime_Time'] //input")
        public WebElement uITimeEdit;

        @FindBy(how = How.ID, using = "txtPawnTagNo")
        public WebElement uIPawnTagNoEdit;

        @FindBy(how = How.ID, using = "lupPFID_CodeValue")
        public WebElement uIEnteredByPFEdit;

        @FindBy(how = How.ID, using = "lupPFID_imgBtn")
        public WebElement uIEnteredByPFLookupButton;

        @FindBy(how = How.ID, using = "cddDispostion_DropDown")
        public WebElement uIDispostionComboBox;

        @FindBy(how = How.ID, using = "dttmDispDate_KPIDttmCtrl")
        public WebElement uIDispostionDateEdit;

        @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Main')]")
        public WebElement uIPawnEntryMainTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Dealer')]")
        public WebElement uIDealerTab;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
        public WebElement uIBottomLeftSideStatusBar;
    }

    public class PawnEntryMainTab
    {
        public WebDriver driver;
        public PawnEntryMainTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }
        @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnMain1_cddPropertyType_DropDown")
        public WebElement uIPropertyTypeComboBox;

        @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnMain1_txtDescription")
        public WebElement uIDescriptionEdit;

        @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnMain1_lupMake_CodeValue")
        public WebElement uIMakeEdit;

        @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnMain1_lupMake_imgBtn")
        public WebElement uIMakeLookupButton;

        @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnMain1_txtModel")
        public WebElement uIModelEdit;

        @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnMain1_txtColor")
        public WebElement uIColorEdit;

        @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnMain1_txtSerialNo")
        public WebElement uISerialNoEdit;

    }

    public class DealerTab
    {
        public WebDriver driver;
        public DealerTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "tabPawn_tmpl1_UsrPawnCust1_cddDealerIDNo_DropDown")
        public WebElement uIDealerIDNoComboBox;
        
    	@FindBy(how = How.ID, using = "tabPawn_tmpl1_UsrPawnCust1_nSellerNameID_LastName")
		public WebElement uIDealerLastNameEdit;

    }

    public class Pawn
    {
         public WebDriver driver;
         public Pawn()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }

         @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnSrchBasic1_cddPropertyType_DropDown")
         public WebElement uIPropertyTypeComboBox;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add New')]")
         public WebElement uIAddNewButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Search')]")
         public WebElement uISearchButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Reset')]")
         public WebElement uIResetButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Back')]")
         public WebElement uIBackButton;

         @FindBy(how = How.ID, using = "grdPawn")
         public WebElement uIPawnResultTable;

         @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnSrchBasic1_txtLastName")
 		public WebElement uISellerNameEdit;


    }

    public class PawnHelpWindow
    {
        public WebDriver driver;
        public PawnHelpWindow()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }

         @FindBy(how = How.ID, using = "tabPawn_tmpl0_UsrPawnSrchBasic1_cddPropertyType_DropDown")
         public WebElement uIPropertyTypeComboBox;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add New')]")
         public WebElement uIAddNewButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Search')]")
         public WebElement uISearchButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Reset')]")
         public WebElement uIResetButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Back')]")
         public WebElement uIBackButton;

         @FindBy(how = How.ID, using = "grdPawn")
         public WebElement uIPawnResultTable;
    }

   
    public class BicycleRegistration
    {
        public WebDriver driver;
        public BicycleRegistration()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add New')]")
         public WebElement uIAddNewButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Search')]")
         public WebElement uISearchButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Reset')]")
         public WebElement uIResetButton;

         @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Back')]")
         public WebElement uIBackButton;

         @FindBy(how = How.ID, using = "grdBicycle")
         public WebElement uIBicycleRegistrationTable;

         @FindBy(how = How.ID, using = "tabBicycle_tmpl0_UsrBicycleBasic1_nbrBicycleReg_Year")
         public WebElement uIRegistrationYearEdit;

         @FindBy(how = How.ID, using = "tabBicycle_tmpl0_UsrBicycleBasic1_nbrBicycleReg_Number")
         public WebElement uIRegistrationNumberEdit;

         @FindBy(how = How.ID, using = "tabBicycle_tmpl0_UsrBicycleBasic1_chkIsActive")
         public WebElement uIIncludeInactiveCheckBox;
                 
    }

    public class BicycleRegistrationEntry
    {
        public WebDriver driver;
        public BicycleRegistrationEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "dtcRegistrationDate_KPIDttmCtrl")
        public WebElement uIRegistrationDateEdit;

        @FindBy(how = How.ID, using = "nmcBicycleOwner_NameType")
        public WebElement uINameTypeEdit;

        @FindBy(how = How.ID, using = "nmcBicycleOwner_LastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "nmcBicycleOwner_FirstName")
        public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "txtMake")
        public WebElement uIMakeEdit;

        @FindBy(how = How.ID, using = "txtFrameSerialNo")
        public WebElement uIFrameSerialNoEdit;

        @FindBy(how = How.ID, using = "cddColor1_DropDown")
        public WebElement uIColor1ComboBox;

        @FindBy(how = How.ID, using = "cddColor2_DropDown")
        public WebElement uIColor2ComboBox;

        @FindBy(how = How.ID, using = "txtValue")
        public WebElement uIValueEdit;

        @FindBy(how = How.ID, using = "txtDescription")
        public WebElement uIDescriptionEdit;

        @FindBy(how = How.ID, using = "txtCustom1")
        public WebElement uICustom1Edit;

        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
        public WebElement uIBottomLeftSideStatusBar;
        
        @FindBy(how = How.ID, using = "chkIsActive")
        public WebElement uIInactiveCheckBox;
        
        @FindBy(how = How.ID, using = "txtInActiveDttm")
        public WebElement uIInactiveDateEdit;

    }

    public class PullRequest
    {
        public WebDriver driver;
        public PullRequest()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);            
        }

        @FindBy(how = How.ID, using = "cmdSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "grdPullSrch")
        public WebElement uIPullRequestResultgrid;

        @FindBy(how = How.ID, using = "cddReason_DropDown")
        public WebElement uIReasonComboBox;

        @FindBy(how = How.ID, using = "lupReqOffPFID_CodeValue")
        public WebElement uIRequestedByEdit;
    }

    public class RequestEntry
    {
        public WebDriver driver;
 public ItemsTab itemsTab;
        public RoutingTab routingTab;
        public RequestEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);    
                   
            if (this.itemsTab == null)
            {
                this.itemsTab = new ItemsTab();
            }
            if (this.routingTab == null)
            {
                this.routingTab = new RoutingTab();
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

        @FindBy(how = How.ID, using = "nmcReq_Year")
        public WebElement uIRequestYearEdit;

        @FindBy(how = How.ID, using = "nmcReq_Number")
        public WebElement uIRequestNumberEdit;

        @FindBy(how = How.ID, using = "lupReqOffPFID_CodeValue")
        public WebElement uIRequestedByEdit;

        @FindBy(how = How.ID, using = "dttRequested_Date_KPIDttmCtrl")
        public WebElement uIDateRequestedEdit;

		// @FindBy(how = How.ID, using = "dttRequested_KPIDttmCtrl")
       // public WebElement uIDateRequestedEdit;

        @FindBy(how = How.ID, using = "dttRequiredDttm_Date_KPIDttmCtrl")
        public WebElement uIDateRequiredEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='dttRequiredDttm_Time']//input")
        public WebElement uIDateRequiredTimeEdit;

        @FindBy(how = How.ID, using = "cddReason_DropDown")
        public WebElement uIReasonComboBox;

        @FindBy(how = How.ID, using = "nbrPropNo_Year")
        public WebElement uIPropertyYearEdit;

        @FindBy(how = How.ID, using = "nbrPropNo_Number")
        public WebElement uIPropertyNumberEdit;
		
		@FindBy(how = How.ID, using = "lupAccOffPFID_CodeValue")
        public WebElement uIAcceptedByEdit;

        @FindBy(how = How.ID, using = "dttAcceptDttm_Date_KPIDttmCtrl")
        public WebElement uIAcceptedDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='dttAcceptDttm_Time']//input")
        public WebElement uIAcceptedTimeEdit;

        @FindBy(how = How.ID, using = "lblDispStatus")
        public WebElement uIStatusTextView;
        
        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;
        
        @FindBy(how = How.XPATH, using = "//span[text()='Routing']")
		public WebElement uIRoutingTab;
        
        @FindBy(how = How.XPATH, using = "//span[text()='Items']")
		public WebElement uIItemsTab;
        @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_grdPullRequest")
        public WebElement uIRequestEntryResultgrid;
			@FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_nbrCaseNo_Number")
            public WebElement uICaseNoEdit;
        	
        	@FindBy(how = How.ID, using = "txtItemNo")
            public WebElement uIPropertyItemNoEdit;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_txtDescription")
            public WebElement uIPropertyDescriptionEdit;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_imgRelated")
            public WebElement uIPropertyLookupButton;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_imgAdd")
            public WebElement uIAddButton;
        
        public class ItemsTab{
        	
        	public ItemsTab() {
        		
        		driver = Playback.driver;
                PageFactory.initElements(driver, this);
        	}
        	
        	@FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_nbrCaseNo_Year")
            public WebElement uICaseYearEdit;

        	@FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_nbrCaseNo_Number")
            public WebElement uICaseNoEdit;
        	
        	@FindBy(how = How.ID, using = "txtItemNo")
            public WebElement uIPropertyItemNoEdit;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_txtDescription")
            public WebElement uIPropertyDescriptionEdit;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_grdPullRequest")
            public WebElement uIRequestEntryResultgrid;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_imgRelated")
            public WebElement uIPropertyLookupButton;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_imgAdd")
            public WebElement uIAddButton;

            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_imgClear")
            public WebElement uIClearButton;
            
            //tabPullRequest_tmpl0_usrPullRequestItems_txtItemNo
            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_txtItemNo")
            public WebElement uIPropertyItemNumberEdit;
            
            //tabPullRequest_tmpl0_usrPullRequestItems_nbrPropNo_Number
            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_nbrPropNo_Number")
            public WebElement uIPropertyNumberEdit;
            
            //tabPullRequest_tmpl0_usrPullRequestItems_nbrPropNo_Year
            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_nbrPropNo_Year")
            public WebElement uIPropertyYearEdit;
            
            //tabPullRequest_tmpl0_usrPullRequestItems_grdPullRequest
            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_grdPullRequest")
            public WebElement uIItemsTable;
            
            //tabPullRequest_tmpl0_usrPullRequestItems_cmdProceedToUpdate
            @FindBy(how = How.ID, using = "tabPullRequest_tmpl0_usrPullRequestItems_cmdProceedToUpdate")
            public WebElement uIProceedToPropertyUpdateButton;
            
        }
        
        public class RoutingTab{
        	
        	
        	public RoutingTab() {
        		
        		driver = Playback.driver;
                PageFactory.initElements(driver, this);
        	}

        	@FindBy(how = How.ID, using = "cmdSave")
        	public WebElement uISaveButton;

        	@FindBy(how = How.ID, using = "cmdReset")
        	public WebElement uIResetButton;
        	
        	@FindBy(how = How.ID, using = "lstStatus")
        	public WebElement uINweActionCombobox;
        	
        	@FindBy(how = How.ID, using = "lupPFID_CodeValue")
        	public WebElement uIByValueEdit;
        	
        	@FindBy(how = How.ID, using = "lupPFID_CodeDescription")
        	public WebElement uIByDescriptionEdit;
        	
        	@FindBy(how = How.NAME, using = "lupPFID$cmdIncOnAddr")
        	public WebElement uIByBubbleIcon;
        	
        	 @FindBy(how = How.ID, using = "dttRequiredDttm_Date_KPIDttmCtrl")
             public WebElement uIRequiredDateEdit;

             @FindBy(how = How.XPATH, using = "//table[@id='dttRequiredDttm_Time']//input")
             public WebElement uIRequiredTimeEdit;
        	
        	@FindBy(how = How.ID, using = "lblRoom")
        	public WebElement uIRouteToValue;
        	
        	@FindBy(how = How.ID, using = "txtComments")
        	public WebElement uINotesEdit;
        	
        	@FindBy(how = How.ID, using = "listMsg")
        	public WebElement uIRoutingTable;
        	
        	//lblrejcountvalue
        	@FindBy(how = How.ID, using = "lblrejcountvalue")
        	public WebElement uIRejectedCount;

        }
	}
    
public class LocationSearch
{
	 public WebDriver driver;
     public LocationSearch()
     {
         driver = Playback.driver;
         PageFactory.initElements(driver, this);            
     }
     
     @FindBy(how = How.XPATH, using = "//span[@title='Add New Item']")
		public WebElement uIAddNew;

     @FindBy(how = How.ID, using = "txtCode")
     public WebElement uICodeEdit;

     @FindBy(how = How.ID, using = "txtDesc")
     public WebElement uIDescriptionEdit;

     @FindBy(how = How.ID, using = "cmdSearch")
     public WebElement uISearchButton;
     
     @FindBy(how = How.XPATH, using = " //span[contains(text(),'Barcode Batch Print')]")
     public WebElement uIBarcodeBatchPrintButton;
     
     
     @FindBy(how = How.ID, using = "chkCheckAll")
     public WebElement uISelectAllChkBox;
     
   //div[@id='grdStorage']
     @FindBy(how = How.ID, using = "grdStorage")
     public WebElement uILocationTable;


}

public class StorageLocations
{
	public WebDriver driver;
    public StorageLocations()
    {
        driver = Playback.driver;
        PageFactory.initElements(driver, this);            
    }
    @FindBy(how = How.ID, using = "txtDescription")
	public WebElement uIDescription;
    
@FindBy(how = How.ID, using = "chkLocker")
	public WebElement uIEvidenceLockerCheckBox;

@FindBy(how = How.ID, using = "chkShared")
	public WebElement uISharedCheckBox;

@FindBy(how = How.ID, using = "cmdSave")
	public WebElement uISave;

}
public class Notify
{
	
	public  WebDriver driver;

    public Notify()
    {
        driver = Playback.driver;
        PageFactory.initElements(driver, this);   
        
    }  
        
        //txtSubject	--SubjectEdit
    	
    	@FindBy(how = How.ID, using = "txtSubject")
    	public WebElement uISubjectEdit;
    	
        //lupPFList_CodeValue	--PFEdit
    
		@FindBy(how = How.ID, using = "lupPFList_CodeValue")
		public WebElement uIPFEdit;
        
        //txtTo	--ToEdit
    
    	@FindBy(how = How.ID, using = "txtTo")
    	public WebElement uIToEdit;
        
        //lupPFList_imgBtn	--PFLookupButton
    
    	@FindBy(how = How.ID, using = "lupPFList_imgBtn")
    	public WebElement uIPFLookupButton;
        
        //cmdAdd	--AddButton
    
    	@FindBy(how = How.ID, using = "cmdAdd")
    	public WebElement uIAddButton;
        
        //cmdClear	--ClearButton
    
    	@FindBy(how = How.ID, using = "cmdClear")
    	public WebElement uIClearButton;
        
        //cmdPF	--AddMultiplePFButton
    
    	@FindBy(how = How.ID, using = "cmdPF")
    	public WebElement uIAddMultiplePFButton;
        
        //txtMsg	--NotesEdit
    
    	@FindBy(how = How.ID, using = "txtMsg")
    	public WebElement uINotesEdit;
        
        //dttNameFlagTo_KPIDttmCtrl	--FollowUpDateEdit
        
        @FindBy(how = How.ID, using = "dttNameFlagTo_KPIDttmCtrl")
        public WebElement uIFollowUpDateEdit;
        
        //cmdSend	--SendButton
        
        @FindBy(how = How.ID, using = "cmdSend")
        public WebElement uISendButton;
        
        //cmdCancel	--CancelButton
        
        @FindBy(how = How.ID, using = "cmdCancel")
        public WebElement uICancelButton;
        
    
}
public class StorageLocationUpdate {

    public WebDriver driver;

    public StorageLocationUpdate() {
        driver = Playback.driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "txtBarCode")
    public WebElement uIScanBarCodeEdit;

    @FindBy(how = How.ID, using = "txtDescription")
    public WebElement uIDescriptionEdit;

    @FindBy(how = How.ID, using = "cmdRefresh")
    public WebElement uIResetButton;
}

public class PropertyCodes {

	public WebDriver driver;

	public PropertyCodes() {

		driver = Playback.driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "rdoCode_0")

	public WebElement uIPropertyEntryCodesRadioButton;

	@FindBy(how = How.ID, using = "rdoCode_1")

	public WebElement uIPropertyRoomActionRadioButton;

	@FindBy(how = How.ID, using = "rdoCode_2")

	public WebElement uIDispositionRadioButton;

	@FindBy(how = How.ID, using = "rdoCode_3")

	public WebElement uIOfficerStatusRadioButton;

	@FindBy(how = How.ID, using = "rdoCode_4")

	public WebElement uISealStatusRadioButton;

	@FindBy(how = How.ID, using = "rdoCode_5")

	public WebElement uIHoldStatusRadioButton;

	@FindBy(how = How.ID, using = "lstJuris")

	public WebElement uIJurisDropdown;

	@FindBy(how = How.ID, using = "chkInActive")

	public WebElement uIIncludeInactiveCheckbox;

	@FindBy(how = How.ID, using = "chkCheckAll")

	public WebElement uICheckAllCheckbox;

	@FindBy(how = How.ID, using = "grdPropertyEntry")

	public WebElement uIPropertyCodesTable;

	@FindBy(how = How.ID, using = "cmdRefresh")

	public WebElement uIRefreshButton;

	@FindBy(how = How.ID, using = "cmdPrint")

	public WebElement uIPrintButton;

	@FindBy(how = How.ID, using = "cmdSaveNClose")

	public WebElement uISaveAndCloseButton;

	@FindBy(how = How.ID, using = "cmdSave")

	public WebElement uISaveButton;

	@FindBy(how = How.ID, using = "txtClear")

	public WebElement uIClearEdit;

	@FindBy(how = How.ID, using = "txtAction")

	public WebElement uIActionEdit;

	@FindBy(how = How.ID, using = "txtPropertyEntry")

	public WebElement uItxtPropertyEntryEdit;

	@FindBy(how = How.ID, using = "txtDisposition")

	public WebElement uIDispositionEdit;

	@FindBy(how = How.ID, using = "txtUndo")

	public WebElement uIUndoEdit;

	@FindBy(how = How.ID, using = "txtOfficerStatus")

	public WebElement uIOfficerStatusEdit;

	@FindBy(how = How.ID, using = "txtSealStatus")

	public WebElement uISealStatusEdit;

	@FindBy(how = How.ID, using = "txtHoldReason")

	public WebElement uIHoldReasonEdit;

	@FindBy(how = How.ID, using = "txtLocation")

	public WebElement uILocationEdit;

	@FindBy(how = How.ID, using = "txtProcess")

	public WebElement uIProcessEdit;

	@FindBy(how = How.XPATH, using = "//label[@for='rdoCode_0']")

	public WebElement uIPropertyEntryCodesLabel;

	@FindBy(how = How.XPATH, using = "//label[@for='rdoCoderdoCode_1']")

	public WebElement uIPropertyRoomActionLabel;

	@FindBy(how = How.XPATH, using = "//label[@for='rdoCoderdoCode_2']")

	public WebElement uIDispositionLabel;

	@FindBy(how = How.XPATH, using = "//label[@for='rdoCoderdoCode_3']")

	public WebElement uIOfficerStatusLabel;

	@FindBy(how = How.XPATH, using = "//label[@for='rdoCoderdoCode_4']")

	public WebElement uISealStatusLabel;

	@FindBy(how = How.XPATH, using = "//label[@for='rdoCoderdoCode_5']")

	public WebElement uIHoldStatusLabel;

	@FindBy(how = How.XPATH, using = "//span[text()='Add New']']")

	public WebElement uIAddNewButton;

	@FindBy(how = How.XPATH, using = "//span[text()='Print Barcode']")

	public WebElement uIPrintBarcodeButton;

}

public class PropertyCodesEntry {

	public WebDriver driver;

	public PropertyCodesEntry() {

		driver = Playback.driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "cmdRefresh")

	public WebElement uIRefreshButton;

	@FindBy(how = How.ID, using = "cmdPrint")

	public WebElement uIPrintButton;

	@FindBy(how = How.ID, using = "cmdSaveNClose")

	public WebElement uISaveAndCloseButton;

	@FindBy(how = How.ID, using = "cmdSave")

	public WebElement uISaveButton;

	@FindBy(how = How.ID, using = "lstJuris")

	public WebElement uIJurisDropdown;

	@FindBy(how = How.ID, using = "lblCodeName")

	public WebElement uICodeForLabel;

	@FindBy(how = How.ID, using = "txtDescrption")

	public WebElement uIDescriptionEdit;

	@FindBy(how = How.ID, using = "lblDescrption")

	public WebElement uIDescriptionLabel;

	@FindBy(how = How.ID, using = "txtSortOrder")

	public WebElement uISortOrderEdit;

	@FindBy(how = How.ID, using = "txtRef1")

	public WebElement uIRef1Edit;

	@FindBy(how = How.ID, using = "txtRef2")

	public WebElement uIRef2Edit;

	@FindBy(how = How.ID, using = "cddSystemCode")

	public WebElement uISystemCodedCombobox;

	@FindBy(how = How.ID, using = "cddCategory_DropDown")

	public WebElement uICategoryCombobox;

	@FindBy(how = How.ID, using = "chkInactive")

	public WebElement uIInactiveCheckbox;

	@FindBy(how = How.ID, using = "chkShared")

	public WebElement uISharedCheckbox;

	@FindBy(how = How.ID, using = "lblSystemCode")

	public WebElement uISystemCodedLabel;

	@FindBy(how = How.ID, using = "barPropItem")

	public WebElement uIBarcodeImage;

}

public class PropertyCodedLookup {

	public WebDriver driver;

	public PropertyCodedLookup() {
		driver = Playback.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "grdSrch")
	public WebElement uIKPIHelpWindowTable;

	@FindBy(how = How.ID, using = "txtCodeProp")
	public WebElement uICodeValueEdit;

	@FindBy(how = How.ID, using = "txtDescProp")
	public WebElement uIDescriptionEdit;

	@FindBy(how = How.ID, using = "imgSrchProp")
	public WebElement uISearchIconButton;

	@FindBy(how = How.ID, using = "imgClearProp")
	public WebElement uIClearIconButton;

	@FindBy(how = How.ID, using = "chkIsActiveProp")
	public WebElement uIIncludeInactiveCheckBox;

	@FindBy(how = How.ID, using = "cmdAdd")
	public WebElement uIAddNewButton;
	
	@FindBy(how = How.ID, using = "cddStorageBuilding_DropDown")
	public WebElement uIStorageBuildingCombobox;
	
	@FindBy(how = How.ID, using = "cddStorageRoom_DropDown")
	public WebElement uIStorageRoomCombobox;
	
	@FindBy(how = How.ID, using = "cddStorageRow_DropDown")
	public WebElement uIStorageRowCombobox;

	@FindBy(how = How.ID, using = "txtCodeValue")
		public WebElement uICodeValueEditFor87;

		@FindBy(how = How.ID, using = "txtDesc")
		public WebElement uIDescriptionEditFor87;

		@FindBy(how = How.ID, using = "imgSrchButton")
		public WebElement uISearchIconButtonFor87;
}
}
