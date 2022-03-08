package uIMaps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapDetailWork {
	
	public DetailSearch detailSearch;
    public DetailEntry detailEntry;
    public OfficerPeckingOrderSearch officerPeckingOrderSearch;
    public ReferedToSearch referedToSearch;
   
       public UIMapDetailWork() {

                if (this.detailSearch == null) 
                    this.detailSearch = new DetailSearch();
                
                if (this.detailEntry == null)
                    this.detailEntry = new DetailEntry();

                if (this.officerPeckingOrderSearch == null)
                    this.officerPeckingOrderSearch = new OfficerPeckingOrderSearch();

                if (this.referedToSearch == null)
                    this.referedToSearch = new ReferedToSearch();

       }

        
        
        
    
        
    public class DetailSearch
    {
        public WebDriver driver;
        public DetailSearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "nbrDetailNo_Year")
        public WebElement uIDetailYearEdit;

        @FindBy(how = How.ID, using = "nbrDetailNo_Number")
        public WebElement uIDetailNumberEdit;

        @FindBy(how = How.ID, using = "chkNotFilled")
        public WebElement uINotFilledCheckbox;

        @FindBy(how = How.ID, using = "chkFilled")
        public WebElement uIFilledCheckbox;

        @FindBy(how = How.ID, using = "chkCompletedBilled")
        public WebElement uICompletedBilledCheckbox;

        @FindBy(how = How.ID, using = "chkCancelled")
        public WebElement uICancelledCheckbox;

        @FindBy(how = How.ID, using = "rbtStatus_0")
        public WebElement uIPriorityDetailYesRadiobox;

        @FindBy(how = How.ID, using = "rbtStatus_1")
        public WebElement uIPriorityDetailNoRadiobox;

        @FindBy(how = How.ID, using = "chkHighRisk")
        public WebElement uIHighRiskCheckbox;

        @FindBy(how = How.ID, using = "chkSupervisorRequired")
        public WebElement uISupervisorRequiredCheckbox;

        @FindBy(how = How.ID, using = "adrLocationOfDetail_txtFrom")
        public WebElement uILocationOfDetailEdit;

        @FindBy(how = How.ID, using = "adrLocationOfDetail_chkVerify")
        public WebElement uILocationOfDetailVerifyCheckbox;

        @FindBy(how = How.ID, using = "cddTypeOfDetailWork_DropDown")
        public WebElement uITypeOfDetailWorkComboBox;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "grdDetailInq")
        public WebElement uIDetailSearchResultGrid;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
        public WebElement uIBackButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;

        @FindBy(how = How.XPATH, using = "//img[@src='/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIcon;
    }
    public class DetailEntry   
    {
    	
    	public DetailRequestedByTab detailRequestedByTab;
        public DetailBillToTab detailBillToTab;
        public DetailOfficersTab detailOfficersTab;
        public DetailStatusUpdateTab detailStatusUpdateTab;
        public DetailFeesTab detailFeesTab;
        public DetailInvoiceTab detailInvoiceTab;
        public WebDriver driver;
        public DetailEntry()
        {
        	
        	if (this.detailRequestedByTab == null)
                this.detailRequestedByTab = new DetailRequestedByTab();
  
        	if (this.detailBillToTab == null)
               this.detailBillToTab = new DetailBillToTab();
           
            if (this.detailOfficersTab == null)
            	this.detailOfficersTab = new DetailOfficersTab();

            if (this.detailStatusUpdateTab == null)
            	this.detailStatusUpdateTab = new DetailStatusUpdateTab();

            if (this.detailFeesTab == null)
            	this.detailFeesTab = new DetailFeesTab();
 
            if (this.detailInvoiceTab == null)
                this.detailInvoiceTab = new DetailInvoiceTab();
            
            driver = Playback.driver;
            PageFactory.initElements(driver, this);

        }

         @FindBy(how = How.ID, using = "nbrDetailNo_Year")
         public WebElement uIDetailYearEdit;

         @FindBy(how = How.ID, using = "nbrDetailNo_Number")
         public WebElement uIDetailNumberEdit;

         @FindBy(how = How.ID, using = "dtDateTimeOfDetail_Date_KPIDttmCtrl")
        public WebElement uIDateOfDetailEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='dtDateTimeOfDetail_Time']//input")
         public WebElement uITimeOfDetailEdit;

        @FindBy(how = How.ID, using = "txtExpectedDuration")
        public WebElement uIExpectedDurationEdit;

        @FindBy(how = How.ID, using = "cddTypeOfDetailWork_DropDown")
        public WebElement uITypeOfDetailWorkComboBox;

        @FindBy(how = How.ID, using = "adrLocationOfDetail_txtFrom")
        public WebElement uILocationOfDetailEdit;

        @FindBy(how = How.ID, using = "adrLocationOfDetail_chkVerify")
        public WebElement uILocationOfDetailVerifyCheckbox;

        @FindBy(how = How.ID, using = "rbtStatus1_0")
        public WebElement uIDetailCancelledCheckbox;

        @FindBy(how = How.ID, using = "rbtStatus_0")
        public WebElement uIPriorityDetailYesRadiobox;

        @FindBy(how = How.ID, using = "rbtStatus_1")
        public WebElement uIPriorityDetailNoRadiobox;

        @FindBy(how = How.ID, using = "chkHighRisk")
        public WebElement uIHighRiskCheckbox;

        @FindBy(how = How.ID, using = "chkSupervisorRequired")
        public WebElement uISupervisorRequiredCheckbox;

        @FindBy(how = How.ID, using = "chkAlcoholServed")
        public WebElement uIAlcoholServedCheckbox;

        @FindBy(how = How.ID, using = "chkDtlFil")
        public WebElement uIDetailFilledCheckbox;

        @FindBy(how = How.ID, using = "cmdsave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveAndCloseButton;

        @FindBy(how = How.ID, using = "txtOfficersRequested")
        public WebElement uINoOfficersRequestedEdit;

        @FindBy(how = How.ID, using = "lblStatus")
        public WebElement uIMenuStatusTextView;
        
        @FindBy(how = How.XPATH, using = "//b")
        public WebElement uIScreenButtonMessage;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Detail Requested By')]")
        public WebElement uIDetailRequestedByTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Bill To')]")
        public WebElement uIBillToTab;

        @FindBy(how = How.XPATH, using = "//span[@title='Officers']")
        public WebElement uIOfficersTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Status Update')]")
        public WebElement uIStatusUpdateTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Fees')]")
        public WebElement uIFeesTab;

        @FindBy(how = How.XPATH, using = "//span[@title='Invoice']")
        public WebElement uIInvoiceTab;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
        public WebElement uIAttachmentsTab;

        @FindBy(how = How.ID, using = "btnCopy")
        public WebElement uICopyButton;

        
        
                

                
        

        

        

        
    }
    public class DetailRequestedByTab
    {
         public WebDriver driver;
         public DetailRequestedByTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_dtDateTimeOfRequest_Date_KPIDttmCtrl")
         public WebElement uIDateTimeOfRequestEdit;

         @FindBy(how = How.XPATH, using = "//table[@id='tabDetailBilling_tmpl0_usrDetailRequestedBy_dtDateTimeOfRequest_Time']//input")
         public WebElement uITimeOfRequestEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_lupOfficeTakingRequest_CodeValue")
         public WebElement uIOfficeTakingRequestCodeEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlBusinessOrPersonName_NameType")
         public WebElement uIBusinessPersonNameTypeEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlBusinessOrPersonName_NameTypeID")
         public WebElement uIBusinessPersonNameIDEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlBusinessOrPersonName_LastName")
         public WebElement uIBusinessPersonLastNameEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlBusinessOrPersonName_FirstName")
         public WebElement uIBusinessPersonFirstNameEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlContactName_NameType")
         public WebElement uIContactNameTypeEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlContactName_NameTypeID")
         public WebElement uIContactNameIDEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlContactName_LastName")
         public WebElement uIContactLastNameEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_ncrlContactName_FirstName")
         public WebElement uIContactFirstNameEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_dtCancelledDateTime_Date_KPIDttmCtrl")
         public WebElement uICancelledDateEdit;

         @FindBy(how = How.XPATH, using = "//table[@id='tabDetailBilling_tmpl0_usrDetailRequestedBy_dtCancelledDateTime_Time']//input")
         public WebElement uICancelledTimeEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl0_usrDetailRequestedBy_lupBy_CodeValue")
         public WebElement uIByCodeEdit;
    }
    public class DetailBillToTab
    {
         public WebDriver driver;
         public DetailBillToTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl1_usrBillTo_chkSameAsBusinessAccount")
         public WebElement uISameAsBusinessAccountCheckbox;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl1_usrBillTo_CddSelectName")
         public WebElement uISelectNameComboBox;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl1_usrBillTo_ncrBillToAccount_NameType")
         public WebElement uIBillToAccountNameTypeEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl1_usrBillTo_ncrBillToAccount_NameTypeID")
         public WebElement uIBillToAccountNameIDEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl1_usrBillTo_ncrBillToAccount_LastName")
         public WebElement uIBillToAccountLastNameEdit;

         @FindBy(how = How.ID, using = "tabDetailBilling_tmpl1_usrBillTo_ncrBillToAccount_FirstName")
         public WebElement uIBillToAccountFirstNameEdit;
    }
    public class DetailOfficersTab
    {
        public WebDriver driver;
        public DetailOfficersTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_dtScheduledfrom_Date_KPIDttmCtrl")
        public WebElement uIScheduledFromDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='tabDetailBilling_tmpl2_usrOfficers_dtScheduledfrom_Time']//input")
        public WebElement uIScheduledFromTimeEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_dtScheduledto_Date_KPIDttmCtrl")
        public WebElement uIScheduledToDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='tabDetailBilling_tmpl2_usrOfficers_dtScheduledto_Time']//input")
        public WebElement uIScheduledToEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_txtDuration")
        public WebElement uIDurationTextView;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_lupOfficerPF_CodeValue")
        public WebElement uIOfficerPFCodeEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_lupReferredto_CodeValue")
        public WebElement uIReferredToCodeEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_lupOfficerPF_imgBtn")
        public WebElement uIOfficerPFLookupButton;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_lupReferredto_imgBtn")
        public WebElement uIReferredToLookupButton;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_dtActualFrom_Date_KPIDttmCtrl")
        public WebElement uIDateFromEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='tabDetailBilling_tmpl2_usrOfficers_dtScheduledfrom_Time']//input")
        public WebElement uITimeFromEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_txtActualDuration")
        public WebElement uIDurationEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_cddRateCode")
        public WebElement uIRateCodeComboBox;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_txtAmounttobepaid")
        public WebElement uIAmountToBePaidEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_txtAmounttobefilled")
        public WebElement uIAmountToBeBilledEdit;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_imgAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_imgClear")
        public WebElement uIClearButton;

        @FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_grdOfficersDetail")
        public WebElement uIDetailOfficerTabResultGrid;

		@FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_lblActualDuration")
		public WebElement uIDurationLabel;

		@FindBy(how = How.ID, using = "tabDetailBilling_tmpl2_usrOfficers_lblActualWorkhours")
		public WebElement uIActualWorkedHourLabel;
    }
    public class DetailStatusUpdateTab
    {
        public WebDriver driver;
        public DetailStatusUpdateTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "dtDate_Date_KPIDttmCtrl")
        public WebElement uIUpdateDateEdit;

        @FindBy(how = How.XPATH, using = "//table[@id='dtDate_Time']//input")
        public WebElement uIUpdateTimeEdit;

        @FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
        public WebElement uIUpdateByEdit;

        @FindBy(how = How.ID, using = "txtLog")
        public WebElement uICommentsEdit;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.XPATH, using = "//table[@id='listMsg']")
        public WebElement uIStatusUpdateTabTable;
    }
    public class DetailFeesTab
    {
        public WebDriver driver;
        public DetailFeesTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "cddItemCode")
        public WebElement uIItemCodeComboBox;

        @FindBy(how = How.ID, using = "txtDescription")
        public WebElement uIDescriptionEdit;

        @FindBy(how = How.ID, using = "txtQty")
        public WebElement uIQuantityEdit;

        @FindBy(how = How.ID, using = "txtRate")
        public WebElement uIRateEdit;

        @FindBy(how = How.ID, using = "txtAmount")
        public WebElement uIAmountEdit;

        @FindBy(how = How.ID, using = "txtConditionNotes")
        public WebElement uIConditionNotesEdit;

        @FindBy(how = How.ID, using = "imgAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "imgClear")
        public WebElement uIClearButton;

        @FindBy(how = How.ID, using = "grdInvoice")
        public WebElement uIFeesTabResultGrid;

        @FindBy(how = How.ID, using = "txtTotalInvoiceAmt")
        public WebElement uITotalInvoiceNumberEdit;

        @FindBy(how = How.ID, using = "cmdRecPaym")
        public WebElement uIReceivePaymentButton;

        @FindBy(how = How.ID, using = "chkprint")
        public WebElement uIPrintConditionsNotesCheckbox;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdReset")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "txtBalanceInvoiceAmt")
        public WebElement uIBalanceInvoiceAmountEdit;
    }
    public class DetailInvoiceTab
    {
          public WebDriver driver;
          public DetailInvoiceTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_cddInvoiceType_DropDown")
          public WebElement uIInvoiceTypeComboBox;

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_dttmDateRange_KPIDttmCtrl")
          public WebElement uIDateRangeFromEdit;

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_dttmTo_KPIDttmCtrl")
          public WebElement uIDateRangeToEdit;

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_cddForYear")
          public WebElement uIForYearComboboxComboBox;

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_chkIncludePaid")
          public WebElement uIIncludePaidCheckbox;

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_chkIncludeParent")
          public WebElement uIIncludeParentCheckbox;

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_grdInvoice")
          public WebElement uIInvoiceTabResultGrid;

          @FindBy(how = How.ID, using = "tabDetailBilling_tmpl7_usrGenericInvoicePayments1_cmdSearch")
          public WebElement uISearchButton;
    }
    public class OfficerPeckingOrderSearch
    {
        public WebDriver driver;
        public OfficerPeckingOrderSearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cddDetailPeckingOrder")
        public WebElement uIShowListForComboBox;

        @FindBy(how = How.ID, using = "btnAddPFs")
        public WebElement uIAddTheSelectedPFButton;

        @FindBy(how = How.ID, using = "grdBillingPF")
        public WebElement uIBillingPFResultGrid;
    }
    public class ReferedToSearch
    {
        public WebDriver driver;
        public ReferedToSearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "txtCodeValue")
        public WebElement uIPhoneBookNameEdit;

        @FindBy(how = How.ID, using = "txtDesc")
        public WebElement uIPFNameEdit;

        @FindBy(how = How.ID, using = "btnAddPFs")
        public WebElement uIAddTheSelectedPFButton;

        @FindBy(how = How.ID, using = "grdBillingPF")
        public WebElement uIReferedToSearchResultGrid;
    }


}
