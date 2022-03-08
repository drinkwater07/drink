package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapInventory 
{

	    public InventorySearch inventorySearch = null;
		public InventoryEntry inventoryEntry = null;
	    public BatchAssignReturn batchAssignReturn = null;
	    public StorageLocation storageLocation = null;
	    public StorageLocationEntry storageLocationEntry = null;
	    public CheckOutInEntry checkOutInEntry = null;
	    public SelfCheckOutIn selfCheckOutIn = null;
	    public EquipmentPFAuthentication equipmentPFAuthentication = null;
	    public EquipmentService equipmentService = null;
	    public ItemEntrySearch itemEntrySearch = null;

	    public UIMapInventory()
	    {
	    	if(this.inventorySearch == null)
	    		this.inventorySearch = new InventorySearch();
	    	if(this.inventoryEntry == null)
	    		this.inventoryEntry = new InventoryEntry();
	    	if(this.batchAssignReturn == null)
	    		this.batchAssignReturn = new BatchAssignReturn();
	    	if(this.storageLocation == null)
	    		this.storageLocation = new StorageLocation();
	    	if(this.storageLocationEntry == null)
	    		this.storageLocationEntry = new StorageLocationEntry();
	    	if(this.checkOutInEntry == null)
	    		this.checkOutInEntry = new CheckOutInEntry();
	    	if(this.selfCheckOutIn == null)
	    		this.selfCheckOutIn = new SelfCheckOutIn();
	    	if(this.equipmentPFAuthentication == null)
	    		this.equipmentPFAuthentication = new EquipmentPFAuthentication();
	    	
	    	if(this.equipmentService == null)
	    		this.equipmentService = new EquipmentService();
	    	
	    	if(itemEntrySearch == null)
	    		itemEntrySearch = new ItemEntrySearch();
	    	
	    }
	    	
public class InventorySearch
     {

         public WebDriver driver;

         public InventorySearch()
         {
             driver = Playback.driver;
             PageFactory.initElements(driver, this);
         }
        
           @FindBy(how = How.ID, using = "numInvNo_Year")
         public WebElement uIInventoryYearEdit;

           @FindBy(how = How.ID, using = "numInvNo_Number")
         public WebElement uIInventoryNumberEdit;

      @FindBy(how = How.XPATH, using = "(//span[text()='Search'])")
         public WebElement uISearchButton;

       @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Batch Scan')])")
         public WebElement uIBatchScanButton;

       @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
         public WebElement uIAddNewButton;

       @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
         public WebElement uIResetButton;

       @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
         public WebElement uIBackButton;

       @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Assign')])")
         public WebElement uIAssignButton;

       @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Perform Batch Service')])")
         public WebElement uIPerformBatchServiceButton;

           @FindBy(how = How.ID, using = "grdInvSrch")
         public WebElement uIInventoryTable;

           @FindBy(how = How.ID, using = "cddCategory_DropDown")
         public WebElement uICategoryComboBox;

           @FindBy(how = How.ID, using = "cddType_DropDown")
         public WebElement uITypeComboBox;

           @FindBy(how = How.ID, using = "txtDescription")
         public WebElement uIDescriptionEdit;

           @FindBy(how = How.ID, using = "lupMake_CodeValue")
         public WebElement uIMakeEdit;
           
           @FindBy(how = How.ID, using = "txtModel")
         public WebElement uIModelEdit;

           @FindBy(how = How.ID, using = "ddlDateTypes")
         public WebElement uIDateTypeComboBox;

           @FindBy(how = How.ID, using = "dttmFrom_KPIDttmCtrl")
         public WebElement uIFromDateEdit;

           @FindBy(how = How.ID, using = "dttmTo_KPIDttmCtrl")
         public WebElement uIToDateEdit;

           @FindBy(how = How.ID, using = "txtDeptTrack")
         public WebElement uIDeptTrackingNoEdit;

           @FindBy(how = How.ID, using = "chkAsset")
         public WebElement uIAssertOnlyCheckBox;

           @FindBy(how = How.ID, using = "chkGeneral")
         public WebElement uIExpendableOnlyCheckbox;

           @FindBy(how = How.ID, using = "chkEquipLog")
         public WebElement uIEquipmentLogOnlyCheckBox;

           @FindBy(how = How.ID, using = "txtScanBarcode")
         public WebElement uIScanBarCodeEdit;

           @FindBy(how = How.ID, using = "chkService")
         public WebElement uIShowDueCheckbox;

           @FindBy(how = How.ID, using = "cddCheckOutType_DropDown")
         public WebElement uICheckOutTypeComboBox;

           @FindBy(how = How.ID, using = "lupVName_CodeValue")
         public WebElement uIVendorCodeEdit;

           @FindBy(how = How.ID, using = "lupVName_imgBtn")
         public WebElement uIVendorCodeLookupButton;

           @FindBy(how = How.ID, using = "txtSerial")
         public WebElement uISerialNoEdit;

           @FindBy(how = How.ID, using = "dttmService_KPIDttmCtrl")
         public WebElement uIServiceDueByEdit;

           @FindBy(how = How.ID, using = "chkSelect")
         public WebElement uISelectCheckbox;

           @FindBy(how = How.ID, using = "cddInvLoc")
         public WebElement uIInventoryLocationComboBox;

           @FindBy(how = How.ID, using = "lupEMPCode_CodeValue")
         public WebElement uIPFNoCodeEdit;

           @FindBy(how = How.ID, using = "cddFleetID_DropDown")
         public WebElement uIFleetIDComboBox;

           @FindBy(how = How.ID, using = "cddDLocation")
         public WebElement uILocationComboBox;
     }
  
   public class InventoryEntry
  {

      public WebDriver driver;

      public InventoryEntry()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
          
          
        //Properties
	        
          if ((this.inventoryEntryMainTab == null))
          {
              this.inventoryEntryMainTab = new InventoryEntryMainTab();
          }
       
          if ((this.assignedIssuedHistoryTab == null))
          {
              this.assignedIssuedHistoryTab = new AssignedIssuedHistoryTab();
          }

          if ((this.purchaseHistoryTab == null))
          {
              this.purchaseHistoryTab = new PurchaseHistoryTab();
          }
          if ((this.serviceHistoryTab == null))
          {
              this.serviceHistoryTab = new ServiceHistoryTab();
          }
          if ((this.inventoryEntryNotesTab == null))
          {
              this.inventoryEntryNotesTab = new InventoryEntryNotesTab();
          }
          if ((this.inventoryEntryActivityLogTab == null))
          {
              this.inventoryEntryActivityLogTab = new InventoryEntryActivityLogTab();
          }
                 
       }

  //Fields
     public InventoryEntryMainTab inventoryEntryMainTab;
     public AssignedIssuedHistoryTab assignedIssuedHistoryTab;
     public PurchaseHistoryTab purchaseHistoryTab;
     public ServiceHistoryTab serviceHistoryTab;
     public InventoryEntryNotesTab inventoryEntryNotesTab;
     public InventoryEntryDispositionTab inventoryEntryDispositionTab;
     public InventoryEntryActivityLogTab inventoryEntryActivityLogTab;
          
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
      public WebElement uIMainTab;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Purchase History')]")
      public WebElement uIPurchaseHistoryTab;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Assigned/Issued History')]")
      public WebElement uIAssignedIssuedHistoryTab;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Service History')]")
      public WebElement uIServiceHistoryTab;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes')]")
      public WebElement uINotesTab;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
      public WebElement uIAttachmentsTab;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Disposition')]")
      public WebElement uIDispositionTab;

        @FindBy(how = How.ID, using = "cmdSave")
      public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
      public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "cmdRefresh")
      public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "cmdPrint")
      public WebElement uIPrintButton;

        @FindBy(how = How.ID, using = "cmdCustomize")
      public WebElement uICustomizeButton;

        @FindBy(how = How.ID, using = "lblAssignTo")
      public WebElement uIStatusMenuBarTextView;

       @FindBy(how = How.XPATH, using = "//input[@id='dttmPurchase_KPIDttmCtrl']")
      public WebElement uIEntryDateEdit;

        @FindBy(how = How.ID, using = "numInvNo_Year")
      public WebElement uIInventoryYearEdit;

        @FindBy(how = How.ID, using = "numInvNo_Number")
      public WebElement uIInventoryNumberEdit;

        @FindBy(how = How.ID, using = "cmdBarcode")
      public WebElement uIBarcodeButton;

        @FindBy(how = How.ID, using = "cmdCopy")
      public WebElement uICopyButton;

        @FindBy(how = How.ID, using = "cddInvCategory_DropDown")
      public WebElement uICategoryComboBox;

        @FindBy(how = How.ID, using = "txtDisplay")
      public WebElement uIExpendableItemButton;

        @FindBy(how = How.ID, using = "txtDisplay")
      public WebElement uICategoryTextDisplayButton;

        @FindBy(how = How.ID, using = "cddInvType_DropDown")
      public WebElement uITypeComboBox;

        @FindBy(how = How.ID, using = "cddInvMake")
      public WebElement uIMakeComboBox;

        @FindBy(how = How.ID, using = "txtModel")
      public WebElement uIModelEdit;

        @FindBy(how = How.ID, using = "txtDescription")
      public WebElement uIDescriptionEdit;

        @FindBy(how = How.ID, using = "chkIsRestricted")
      public WebElement uIRestrictedCheckBox;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Activity Log')]")
        public WebElement uIActivityLogTab;

	@FindBy(how = How.ID, using = "cddInvName")
		public WebElement uIInventoryNameComboBox;
  }

  public class InventoryEntryMainTab
  {

      public WebDriver driver;

      public InventoryEntryMainTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

 
        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtLadderLeng")
      public WebElement uILadderLengthEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_cddLadderType_DropDown")
      public WebElement uILadderTypeComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_dttmServiceDate_KPIDttmCtrl")
      public WebElement uINextDueDateEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtComment")
      public WebElement uICommentsEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_cddCheckOutType_DropDown")
      public WebElement uICheckOutTypeComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtCheckOutNbr")
      public WebElement uICheckOutEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtDeptTrack1")
      public WebElement uIDeptTrackingEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtReorderQty")
      public WebElement uIReorderQuantityEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_chkLogEquipment")
      public WebElement uILogEquipmentCheckBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_dttmLastServiceDttm_KPIDttmCtrl")
      public WebElement uILastServiceDateEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_cddServiceSchedule_DropDown")
      public WebElement uIServiceCycleComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_cddBaseMonth_DropDown")
      public WebElement uIBaseMonthComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_dttmNextDue_KPIDttmCtrl")
      public WebElement uIInServiceDateEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_cddColor1_DropDown")
      public WebElement uIColor1ComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_cddColor2_DropDown")
      public WebElement uIColor2ComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtSerial")
      public WebElement uISerialNoEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtUPC")
      public WebElement uIUPCEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtComment")
      public WebElement uICommentEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtCustom1")
      public WebElement uICustom1Edit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtCustom2")
      public WebElement uICustom2Edit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_dttmExpire_KPIDttmCtrl")
      public WebElement uIWarrantyExpirationDateEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_dttmReplaced_KPIDttmCtrl")
      public WebElement uIReplaceByDateEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtCheckOutNbr")
      public WebElement uICheckOutNoEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_txtDeptTrack1")
      public WebElement uIDeptTrackingNoEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl0_usrMain1_cddItemCode")
        public WebElement uIItemCodeComboBox; 
  }

  public class AssignedIssuedHistoryTab
  {
      public WebDriver driver;
      public AssignedIssuedHistoryTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddAction")
      public WebElement uIActionComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_dttmStatus_Date_KPIDttmCtrl")
      public WebElement uIProcessedDateEdit;

    @FindBy(how = How.XPATH, using = "//table[@id='tabItemEntry_tmpl2_usrAssigned1_dttmStatus_Time']//input")
      public WebElement uIProcessedTimeEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_lupASGMTPFCode_CodeValue")
      public WebElement uIByPFCodeEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_lupASGMTPFCode_imgBtn")
      public WebElement uIByPFCodeLookupButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_radPersonal")
      public WebElement uIPersonnelRadioButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_radFleet")
      public WebElement uIFleetRadioButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_radDivision")
      public WebElement uIDivisionRadioButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_radStation")
      public WebElement uIStationRadioButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_grdAssignment")
      public WebElement uIAssignedIssuedHistoryTabResultTable;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_lupEMPCode_CodeValue")
      public WebElement uIPFCodeEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_lupEMPCode_imgBtn")
      public WebElement uIPFCodeLookupButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_txtComment")
      public WebElement uICommentEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_txtQty")
      public WebElement uIQuantityEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddFleetID_DropDown")
      public WebElement uIFleetNoComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddFLocation")
      public WebElement uIFleetLocationComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddDivision_DropDown")
      public WebElement uIDivisionComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddSection_DropDown")
      public WebElement uISectionComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddSquad_DropDown")
      public WebElement uISquadComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddDLocation")
      public WebElement uIDivisionLocationComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_lupCurPF_CodeValue")
      public WebElement uICurrentlyWithPFCodeEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddStation_DropDown")
      public WebElement uIStationComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddSLocation")
      public WebElement uIStationLocationComboBox;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl2_usrAssigned1_cddFleetID_CodeValue")
      public WebElement uIFleetNoCodeEdit;
      
  }

  public class PurchaseHistoryTab
  {
      public WebDriver driver;
      public PurchaseHistoryTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_dttmPdate_KPIDttmCtrl")
      public WebElement uIPurchaseDateEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_lupBy_CodeValue")
      public WebElement uIByPFCodeEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_lupBy_imgBtn")
      public WebElement uIByPFCodeLookupButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_cddInvLoc")
      public WebElement uIInventoryLocationComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_lupVName_CodeValue")
      public WebElement uIVenderNameCodeEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_lupVName_imgBtn")
      public WebElement uIVenderNameCodeLookupButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_cddHAcq_DropDown")
      public WebElement uIHowAcquiredComboBox;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_dttmExpiryDttm_KPIDttmCtrl")
      public WebElement uIExpirationDateEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtPo")
      public WebElement uIPONoEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtUnitCost")
      public WebElement uIUnitCostEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtTotColAmount")
      public WebElement uITotalCostEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtVRef")
      public WebElement uIVenderRefEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtScanBarcode")
      public WebElement uIScanBarCodeRFIDEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtQtyReceived")
      public WebElement uIQtyReceivedEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtQtyReceived")
      public WebElement uIQtyReceivedTextView;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_cmdScan")
      public WebElement uIBatchScanItemButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtPanelScanBarcode")
      public WebElement uIPanelScanBarCodeRFIDEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_GrdScan")
      public WebElement uISanBarCodeResultTable;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_cmdAddPurHistory")
      public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_cmdupdate")
      public WebElement uIUpdateButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_cmdcancel")
      public WebElement uICancelButton;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtTotalQty")
      public WebElement uITotalQuantityEdit;     

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_txtScanBarcode")
      public WebElement uIPopupScanBarCodeRFIDEdit;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_GrdScan")
      public WebElement uIScanBarCodeResultTable;

        @FindBy(how = How.ID, using = "tabItemEntry_tmpl1_usrPurchaseHistory1_grdPurchaseHistory")
      public WebElement uIPurchaseHistoryTable;
  }

  public class ServiceHistoryTab
      {
       public WebDriver driver;
       
       public ServiceHistoryTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_btnAddNew")
       public WebElement uIAddServiceHistoryButton;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_grdServiceHistory")
       public WebElement uIServiceHistoryResultTable;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_dttmPdate_KPIDttmCtrl")
       public WebElement uIDateEdit;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_lupBy_CodeValue")
       public WebElement uIServicedTestedByPFCodeEdit;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_lupBy_imgBtn")
       public WebElement uIServicedTestedByPFCodeLookupButton;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_cddCondition_DropDown")
       public WebElement uIConditionComboBox;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_txtComment")
       public WebElement uINotesEdit;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_cmdOk")
       public WebElement uIAddButton;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrServiceHistory1_cmdCancel")
       public WebElement uICancelButton;
  }

  public class InventoryEntryNotesTab
  {
      public WebDriver driver;
      
      public InventoryEntryNotesTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

        @FindBy(how = How.ID, using = "dttmDate_Date_KPIDttmCtrl")
      public WebElement uIUpdateDateEdit;

    @FindBy(how = How.XPATH, using = "//table[@id='dttmDate_Time']//input")
      public WebElement uIProcessedTimeEdit;

        @FindBy(how = How.ID, using = "lupBy_CodeValue")
      public WebElement uIUpdatedByPFCodeEdit;

        @FindBy(how = How.ID, using = "lupBy_imgBtn")
      public WebElement uIUpdatedByPFCodeLookupButton;

        @FindBy(how = How.ID, using = "txtNotes")
      public WebElement uICommentsEdit;

        @FindBy(how = How.ID, using = "cmdSave")
      public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "grdInvHistory")
      public WebElement uINotesResultTable;
  
    @FindBy(how = How.XPATH, using = "//table[@id ='grdInvHistory']//table/tbody/tr/td")
      public WebElement uINotesGridDateText;

    @FindBy(how = How.XPATH, using = "//table[@id ='grdInvHistory']//div[@class='HistoryComments']")
      public WebElement uINotesGridCommentsText;
  }

  public class InventoryEntryDispositionTab
  {
       public WebDriver driver;
       public InventoryEntryDispositionTab()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }
         @FindBy(how = How.ID, using = "tabItemEntry_tmpl6_UsrDisposition1_lupDispPFCode_CodeValue")
       public WebElement uIAuthorizedByCodeEdit;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl6_UsrDisposition1_lupDispPFCode_imgBtn")
       public WebElement uIAuthorizedByCodeLookupButton;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl6_UsrDisposition1_dttmDisposition_KPIDttmCtrl")
       public WebElement uIDispositionDateEdit;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl6_UsrDisposition1_cddDisposition_DropDown")
       public WebElement uIDispositionComboBox;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl6_UsrDisposition1_txtQtyDispose")
       public WebElement uIQuantitytoDispositionEdit;

         @FindBy(how = How.ID, using = "tabItemEntry_tmpl6_UsrDisposition1_txtDispComments")
       public WebElement uICommentsEdit;

  }
  
  public class InventoryEntryActivityLogTab
  {
   public WebDriver driver;
   
   public InventoryEntryActivityLogTab()
  {
      driver = Playback.driver;
      PageFactory.initElements(driver, this);
  }   

     @FindBy(how = How.ID, using = "tabItemEntry_tmpl3_usrActivityLog1_grdequipment")
   public WebElement uIActivityResultTable;
}



  public class BatchAssignReturn
  {
      public WebDriver driver;

      public BatchAssignReturn()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
  }

        @FindBy(how = How.ID, using = "cmdSave")
      public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "ddlLocation")
      public WebElement uILocationComboBox;

        @FindBy(how = How.ID, using = "grdequipment")
      public WebElement uIBatchAssignTable;

  }

  public class StorageLocation
  {

      public WebDriver driver;

      public StorageLocation()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
  }

        @FindBy(how = How.ID, using = "cmdSearch")
      public WebElement uISearchButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
      public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "grdStorage")
      public WebElement uIStorageLocationTable;

        @FindBy(how = How.ID, using = "txtDesc")
      public WebElement uIDescriptionEdit;

  }
   
  public class StorageLocationEntry
  {
      public WebDriver driver;

      public StorageLocationEntry()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

        @FindBy(how = How.ID, using = "txtCode")
      public WebElement uICodeEdit;

        @FindBy(how = How.ID, using = "txtDescription")
      public WebElement uIDescriptionEdit;

        @FindBy(how = How.ID, using = "cddLocUsed_DropDown")
      public WebElement uILocationUseForComboBox;

        @FindBy(how = How.ID, using = "chkWeaponLocker")
      public WebElement uILockerCheckbox;

        @FindBy(how = How.ID, using = "cmdSave")
      public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
      public WebElement uISaveNCloseButton;

  }
 
  public class CheckOutInEntry
  {
      public WebDriver driver;

      public CheckOutInEntry()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

        @FindBy(how = How.ID, using = "lupPFCode_CodeValue")
      public WebElement uIProcessedByPFEdit;

        @FindBy(how = How.ID, using = "dttmDate_Date_KPIDttmCtrl")
      public WebElement uIProcessDateEdit;

    @FindBy(how = How.XPATH, using = "//table[@id='dttmDate_Time']//input")
      public WebElement uIProcessTimeEdit;

        @FindBy(how = How.ID, using = "lupCheckPF_CodeValue")
      public WebElement uICheckOutForOrCheckInByPFEdit;

        @FindBy(how = How.ID, using = "nIssueToNameID_NameType")
      public WebElement uINameIDEdit;

        @FindBy(how = How.ID, using = "nIssueToNameID_NameTypeID")
      public WebElement uINameTypeEdit;

        @FindBy(how = How.ID, using = "nIssueToNameID_LastName")
      public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "nIssueToNameID_FirstName")
      public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
      public WebElement uIAddressEdit;

        @FindBy(how = How.ID, using = "cusPhone")
      public WebElement uIPhoneHomeEdit;

        @FindBy(how = How.ID, using = "cusAlt")
      public WebElement uIPhoneCellEdit;
  }

  public class SelfCheckOutIn
  {
       public WebDriver driver;

       public SelfCheckOutIn()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }

         @FindBy(how = How.ID, using = "lupEmp_CodeValue")
       public WebElement uIPFNoEdit;

         @FindBy(how = How.ID, using = "ImgRefresh")
       public WebElement uIPFResetIcon;

         @FindBy(how = How.ID, using = "imgKeyboard")
       public WebElement uIKeyboardIcon;

         @FindBy(how = How.ID, using = "txtInventoryNo")
       public WebElement uIScanInventoryEdit;

         @FindBy(how = How.ID, using = "cddCheckOut_DropDown")
       public WebElement uICheckOutTypeComboBox;

         @FindBy(how = How.ID, using = "txtCheckOutNbr")
       public WebElement uICheckOutNoEdit;

         @FindBy(how = How.ID, using = "txtDesc")
       public WebElement uIDescriptionEdit;

         @FindBy(how = How.ID, using = "txtMake")
       public WebElement uIMakeEdit;

         @FindBy(how = How.ID, using = "txtSerial")
       public WebElement uISerialEdit;

         @FindBy(how = How.ID, using = "cmdSign")
       public WebElement uISignOutButton;

         @FindBy(how = How.ID, using = "cmdReturnAll")
       public WebElement uIReturnAllButton;

         @FindBy(how = How.ID, using = "grdEquipSignLog")
       public WebElement uISelfCheckOutInTable;
  }

  public class EquipmentPFAuthentication
  {
      public WebDriver driver;

      public EquipmentPFAuthentication()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
               
      }

        @FindBy(how = How.ID, using = "imgKeyboard")
      public WebElement uIKeyboardIcon;

        @FindBy(how = How.ID, using = "txtUserName")
      public WebElement uIUserNameEdit;

        @FindBy(how = How.ID, using = "txtPassword")
      public WebElement uIPasswordEdit;

        @FindBy(how = How.ID, using = "cmdLogin")
      public WebElement uIAcceptButton;

  }
	
  public class EquipmentService
  {
           public WebDriver driver;

         public EquipmentService()
         {
             driver = Playback.driver;
             PageFactory.initElements(driver, this);
         }
        
           @FindBy(how = How.ID, using = "lstJuris")
         public WebElement uIJurisDropDown;
           
           @FindBy(how = How.ID, using = "dtServicedueby_KPIDttmCtrl")
                  public WebElement uIServiceDueDateBy;
           
           @FindBy(how = How.ID, using = "cddServiceType_DropDown")
                  public WebElement uILocatedOnlyFleetIDropdown;
                  
                  @FindBy(how = How.ID, using = "lupEMPCode_CodeValue")
                  public WebElement uIServicedOrTestedBy;
                  
                  @FindBy(how = How.ID, using = "dtdate_KPIDttmCtrl")
                  public WebElement uITestedDate;
                  
                  @FindBy(how = How.ID, using = "cmdSearch")
                  public WebElement uISearchButton;
                  
                  @FindBy(how = How.ID, using = "lupVendorName_CodeValue")
                  public WebElement uIVendorCode;
                  
                  @FindBy(how = How.ID, using = "lupVendorName_CodeDescription")
                  public WebElement uIVendorDescription;
                  
                  @FindBy(how = How.ID, using = "txtvendorCost")
                  public WebElement uIVendorCost;
                  
                  @FindBy(how = How.ID, using = "txtNotes")
                  public WebElement uITextNotes;
                  
                  @FindBy(how = How.ID, using = "grdequipment2_ctl00_3_0_32_0")
                  public WebElement uIUnAssignInventoryToStorageTable;
                  
                  @FindBy(how = How.ID, using = "cmdSave")
                  public WebElement uISaveButton;

                     @FindBy(how = How.ID, using = "cmdSaveNClose")
                  public WebElement uISaveAndCloseButton;

                    @FindBy(how = How.ID, using = "cmdRefresh")
                  public WebElement uIResetButton;

                    @FindBy(how = How.ID, using = "cmdPrint")
                  public WebElement uIPrintButton;
  }

  public class ItemEntrySearch
  {
	  public WebDriver driver;
      public ItemEntrySearch()
      {
          driver = Playback.driver;
          PageFactory.initElements(driver, this);
      }  

      @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
      public WebElement uISearchButton;
      
      @FindBy(how = How.ID, using = "grdInvSrch")
      public WebElement uIItemEntrySearchResultTable;
      
      @FindBy(how = How.XPATH, using = " //span[contains(text(),'Assign')]")
      public WebElement uIAssignButton;
      
   
  }	
}
