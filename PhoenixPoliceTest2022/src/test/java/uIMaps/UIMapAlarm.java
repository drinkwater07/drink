package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import application.Alarms.AlarmCompanyEntry;
import utilities.Playback;

public class UIMapAlarm {

	
	
    public AlarmAccountSearch alarmAccountSearch;
    public AccountEntry accountEntry;
    public AlarmsEntry alarmsEntry;
    public AlarmSearch alarmSearch;
    public AlarmType alarmType;
    public AlarmCFSEntry alarmCFSEntry;
    public AlarmCompanySearch alarmCompanySearch;
    public NameEntry nameEntry;
    public FalseAlarms falseAlarms;
    public AlarmYearEndReport alarmYearEndReport;
    public AlarmCompanyEntry alarmCompanyEntry;
    
    public UIMapAlarm()
    {
    	if ((this.alarmAccountSearch == null))
        {
            this.alarmAccountSearch = new AlarmAccountSearch();
        }
    	 if ((this.alarmCompanySearch == null))
         {
             this.alarmCompanySearch = new AlarmCompanySearch();
         }
    	 if ((this.accountEntry == null))
         {
             this.accountEntry = new AccountEntry();
         }
    	 if ((this.alarmsEntry == null))
         {
             this.alarmsEntry = new AlarmsEntry();
         }
    	 if ((this.alarmSearch == null))
         {
             this.alarmSearch = new AlarmSearch();
         }
    	 if ((this.alarmType == null))
         {
             this.alarmType = new AlarmType();
         }
    	 if ((this.alarmCFSEntry == null))
         {
             this.alarmCFSEntry = new AlarmCFSEntry();
         }
    	 if ((this.nameEntry == null))
         {
             this.nameEntry = new NameEntry();
         }
    	  if ((this.falseAlarms == null))
          {
              this.falseAlarms = new FalseAlarms();
          }

          if ((this.alarmYearEndReport == null))
          {
              this.alarmYearEndReport = new AlarmYearEndReport();
          }
          
          if (this.alarmCompanyEntry == null)
        	  this.alarmCompanyEntry = new AlarmCompanyEntry();
    }
    
    public class AlarmAccountSearch
    {
        public WebDriver driver;
        public AlarmAccountSearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
        public WebElement uISearchButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
        public WebElement uIBackButton;

        @FindBy(how = How.ID, using = "grdAlarms")
        public WebElement uIAlarmAccountSearchGridTable;

        @FindBy(how = How.ID, using = "tabAlarms_tmpl0_UsrAlarmsrchBasic1_txtAccountNo")
        public WebElement uIAccountNoEdit;

        @FindBy(how = How.ID, using = "tabAlarms_tmpl0_UsrAlarmsrchBasic1_txtAlarmNo")
        public WebElement uIAlarmNoEdit;

    }

    public class AccountEntry
    {
        public WebDriver driver;
        public AccountEntry()
        {
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

        @FindBy(how = How.ID, using = "txtAccountNo")
        public WebElement uIAccountNoEdit;

        @FindBy(how = How.ID, using = "chkIsActive")
        public WebElement uIInactiveCheckBox;

        @FindBy(how = How.ID, using = "txtInactiveDttm")
        public WebElement uIInactiveDateEdit;

        @FindBy(how = How.ID, using = "dtAccountDate_KPIDttmCtrl")
        public WebElement uIAccountDateEdit;

        @FindBy(how = How.ID, using = "nameAccount_LastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "nameAccount_FirstName")
        public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "txtAccountAddress")
        public WebElement uIAccountAddressEdit;

        @FindBy(how = How.ID, using = "adrLocation_txtFrom")
        public WebElement uIAddressEdit;

        @FindBy(how = How.ID, using = "adrLocation_chkVerify")
        public WebElement uIAddressVerifyCheckBox;

        @FindBy(how = How.ID, using = "nameContact_LastName")
        public WebElement uIContactLastNameEdit;

        @FindBy(how = How.ID, using = "nameContact_FirstName")
        public WebElement uIContactFirstNameEdit;

        @FindBy(how = How.ID, using = "grdAccountEntry")
        public WebElement uIAccountEntryGridTable;

        @FindBy(how = How.ID, using = "cmdNewAlarm")
        public WebElement uINewAlarmButton;

        @FindBy(how = How.ID, using = "cmdTransaction")
        public WebElement uITransactionButton;

        @FindBy(how = How.ID, using = "nameAccount_imgSrch")
        public WebElement uINameInfoIcon;
    }
    
  
    public class AlarmType
    {

        public WebDriver driver;

        public AlarmType()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
        public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "grdCFS")
        public WebElement uIAlarmTypeTable;


    }

   
    public class AlarmCFSEntry
    {

        public WebDriver driver;
        public CADCFSAndDispositionTab cADCFSAndDispositionTab;
        public FeesAndSettingsTab feesAndSettingsTab;
        public AlarmCFSEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            if(this.cADCFSAndDispositionTab == null)
            {
                this.cADCFSAndDispositionTab = new CADCFSAndDispositionTab();
            }   

            if (this.feesAndSettingsTab == null)
            {
                this.feesAndSettingsTab = new FeesAndSettingsTab();
            }
        }

        @FindBy(how = How.ID, using = "txtOccurances")
        public WebElement uIAlarmTypeEdit;

        @FindBy(how = How.ID, using = "txtDescription")
        public WebElement uIDescriptionEdit;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'CAD CFS & Disposition')])")
        public WebElement uICADCFSAndDispositionTab;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Fees & Settings')])")
        public WebElement uIFeesAndSettingsTab;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveNCloseButton;

        @FindBy(how = How.ID, using = "cddRegType_DropDown")
        public WebElement uIRegistrationTypeComboBox;

        @FindBy(how = How.ID, using = "rbTrackYes")
        public WebElement uITrackFeesYesRadioButton;
        
        @FindBy(how = How.ID, using = "rbTrackNo")
        public WebElement uITrackFeesNoRadioButton;

        @FindBy(how = How.ID, using = "cmdPrint")
        public WebElement uIPrintButton;
        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
        public WebElement uIBottomLeftSideStatusBar;
    }

    public class CADCFSAndDispositionTab
    {

        public WebDriver driver;

        public CADCFSAndDispositionTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }


        @FindBy(how = How.ID, using = "tabAlarmType_tmpl0_usrCADCFS_lupCADCFS_CodeValue")
        public WebElement uICADCFSCodeEdit;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl0_usrCADCFS_lupDisposition_CodeValue")
        public WebElement uIDispositionCodeEdit;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl0_usrCADCFS_cmdAdd")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl0_usrCADCFS_grdAlarmsStmt")
        public WebElement uICADCFSDispositionTable;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl0_usrCADCFS_lupCADCFS_imgBtn")
        public WebElement uICADCFSLookupButton;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl0_usrCADCFS_lupDisposition_imgBtn")
        public WebElement uIDispositionLookupButton;
    }

    public class FeesAndSettingsTab
    {

        public WebDriver driver;

        public FeesAndSettingsTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl1_usrFeesSettings_cddRegType_DropDown")
        public WebElement uIRegistrationTypeComboBox;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl1_usrFeesSettings_txtRegFee")
        public WebElement uIRegistrationFeeEdit;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl1_usrFeesSettings_txt1stAlarmAmt")
        public WebElement uI1stAlarmAmountEdit;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl1_usrFeesSettings_txtUnRegFine")
        public WebElement uIUnregisteredAlarmFineAmountEdit;

        @FindBy(how = How.ID, using = "tabAlarmType_tmpl1_usrFeesSettings_txt2ndAlarmAmt")
        public WebElement uI2ndAlarmAmountEdit;
    }



    public class AlarmsEntry
    {
        public WebDriver driver;
        public AlarmEntryContactTab alarmEntryContactTab;
        public AlarmEntryMainTab alarmEntryMainTab;
        public ProcessFalseAlarmTab processFalseAlarmTab;
        public TransactionHistoryTab transactionHistoryTab;
        public InvoicesTab invoicesTab;
        public AlarmsEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
            if (this.alarmEntryContactTab == null)
            {
                this.alarmEntryContactTab = new AlarmEntryContactTab();
            }

            if (this.alarmEntryMainTab == null)
            {
                this.alarmEntryMainTab = new AlarmEntryMainTab();
            }         

            if (this.processFalseAlarmTab == null)
            {
                this.processFalseAlarmTab = new ProcessFalseAlarmTab();
            }       
            if (this.transactionHistoryTab == null)
            {
                this.transactionHistoryTab = new TransactionHistoryTab();
            }         

            if (this.invoicesTab == null)
            {
                this.invoicesTab = new InvoicesTab();
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

        @FindBy(how = How.ID, using = "cddAlarmType")
        public WebElement uIAlarmTypeComboBox;

        @FindBy(how = How.ID, using = "txtAlarmLocation")
        public WebElement uIAlarmLocationEdit;

        @FindBy(how = How.ID, using = "AlarmNameID_NameType")
        public WebElement uIBusinessOrPersonNameTypeEdit;

        @FindBy(how = How.ID, using = "AlarmNameID_NameTypeID")
        public WebElement uIBusinessOrPersonNameIDEdit;

        @FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
        public WebElement uIAddress1Edit;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Main')])")
        public WebElement uIMainTab;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Contact')])")
        public WebElement uIContactsTab;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Process False Alarm')])")
        public WebElement uIProcessFalseAlarmTab;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Transaction History')])")
        public WebElement uITransactionHistoryTab;

        @FindBy(how = How.XPATH, using = "//div[@id = 'tabAlarm']//span[@mkr = 'ti5']")
        public WebElement uIInvoicesTab;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Attachments')])")
        public WebElement uIAttachmentsTab;

        @FindBy(how = How.ID, using = "txtAlarm")
        public WebElement uIAlarmNoEdit;

        @FindBy(how = How.ID, using = "AlarmNameID_LastName")
        public WebElement uIBusinessOrPersonLastNameEdit;

        @FindBy(how = How.ID, using = "AlarmNameID_FirstName")
        public WebElement uIBusinessOrPersonFirstNameEdit;

        @FindBy(how = How.ID, using = "lblNoOcc")
        public WebElement uITotalOccurrencesTextView;

        @FindBy(how = How.ID, using = "lblChargeableOcc")
        public WebElement uIChargeableOccurrencesTestView;

        @FindBy(how = How.ID, using = "cmdDelete")
        public WebElement uIDeleteButton;

        @FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
        public WebElement uIAlarmLocationMainAddressEdit;        
      
        @FindBy(how = How.ID, using = "chkInactive")
        public WebElement uIInactiveCheckBox;
        
        @FindBy(how = How.CLASS_NAME, using = "statusBar")
		public WebElement uIstatusBar;
        
        @FindBy(how = How.ID, using = "lblPersonNames")
        public WebElement uIBusinessPersonLable; 

        @FindBy(how = How.ID, using = "adrMainAddress_cmdIncOnAddr")
        public WebElement uIAlarmLocationIBubble;
        
        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
        public WebElement uIBottomLeftSideStatusBar;
                
        @FindBy(how = How.ID, using = "AlarmNameID_imgSrch")
        public WebElement uIBusinessOrPersonNameInfoIcon;
        
        @FindBy(how = How.ID, using = "lblCommanName")
        public WebElement uICommonNameLabel;
        							   
        @FindBy(how = How.ID, using = "txtInActiveDttm")
        public WebElement uIInactiveDateEdit;

    }

    public class AlarmEntryMainTab
    {

        public WebDriver driver;

        public AlarmEntryMainTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_dtAdjustmentsDate_KPIDttmCtrl")
        public WebElement uIInstalledDateEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_chkInactive")
        public WebElement uIInactiveCheckbox;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_lupAlarmCompany_CodeValue")
        public WebElement uIAlarmCompanyCodeEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_lupAlarmCompany_imgBtn")
        public WebElement uIAlarmCompanySearchButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_cddWNR_DropDown")
        public WebElement uIWaiveNoticeReasonComboBox;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_txtComments")
        public WebElement uICommentsEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_chkBnsName")
        public WebElement uISameAsBusinessAccountCheckbox;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_BillAcName_NameType")
        public WebElement uIBusinessOrPersonNameTypeEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_BillAcName_NameTypeID")
        public WebElement uIBusinessOrPersonNameIDEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_BillAcName_LastName")
        public WebElement uIBusinessOrPersonLastNameEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_BillAcName_FirstName")
        public WebElement uIBusinessOrPersonFirstNameEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_adrBillAcAddress1_txtFrom")
        public WebElement uIAddress1Edit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_btnRegView")
        public WebElement uINotRegisteredCreateInvoiceButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_cmdNewName")
        public WebElement uIEnterNewNameButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_cddBillCon")
        public WebElement uIBillingContactComboBox;
        
        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_adrBillAcAddress1_cmdIncOnAddr")
        public WebElement uIAddress1IBubble;
        
        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_BillAcName_NameTypeID")
        public WebElement uIBillToAccountNameIDEdit;
        
        @FindBy(how = How.ID, using = "tabAlarm_tmpl0_usrMasterMain_BillAcName_NameType")
        public WebElement uIBillToAccountNameTypeEdit;

    }

    public class AlarmEntryContactTab
    {
        public WebDriver driver;
        public AlarmEntryContactTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.ID, using = "nmcIncident_LastName")
        public WebElement uILastNameEdit;

        @FindBy(how = How.ID, using = "nmcIncident_FirstName")
        public WebElement uIFirstNameEdit;

        @FindBy(how = How.ID, using = "grdContacts")
        public WebElement uIContactEntryGridTable;

        @FindBy(how = How.ID, using = "btnAddnew")
        public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "btnSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdInternalRefresh")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "txtComments")
        public WebElement uICommentsEdit;

        @FindBy(how = How.ID, using = "chkIncludeExpired")
        public WebElement uIIncludeInactiveCheckbox;

    }

    public class ProcessFalseAlarmTab
    {

        public WebDriver driver;

        public ProcessFalseAlarmTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_nbrCallNo_Year")
        public WebElement uICallYearEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_nbrCallNo_Number")
        public WebElement uICallNumberEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_rdoSrchDttm_0")
        public WebElement uIRemoveRadioButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_txtReason")
        public WebElement uIReasonForRemovalEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_rdoSrchDttm_1")
        public WebElement uI1stAlarmChargeRadioButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_cmdProcess")
        public WebElement uIProcessButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_cmdCancel")
        public WebElement uICancelButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_txtCADCFS")
        public WebElement uICADCFSEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_rdoSrchDttm_1")
        public WebElement uINonChargeableDonotChargeRadioButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_rdoSrchDttm_2")
        public WebElement uINonChargeableRadioButton;

         @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_txtReason")
        public WebElement uIReasonForNonChargeableEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl3_usrProcessFalseAlarm_txtDisposition")
        public WebElement uIDispositionEdit;

        @FindBy(how = How.XPATH, using = "//div[@id = 'tabAlarm_tmpl3_usrProcessFalseAlarm_pnlUpdate']//td")
        public WebElement uIReasonForRemovalLabel;
        
        @FindBy(how = How.XPATH, using = "//td//label[contains(text(),'1st Alarm')]")
        public WebElement uI1stAlarmChargeLabel;
    }

    public class TransactionHistoryTab
    {

        public WebDriver driver;

        public TransactionHistoryTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabAlarm_tmpl4_UsrTransactionHistory_dtcUpdatDttm_Date_KPIDttmCtrl")
        public WebElement uIUpdatedDateEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl4_UsrTransactionHistory_lupUpdatePF_CodeValue")
        public WebElement uIUpdatedByCodeEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl4_UsrTransactionHistory_txtNotes")
        public WebElement uINotesEdit;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl4_UsrTransactionHistory_cmdAddHistory")
        public WebElement uIAddButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl4_UsrTransactionHistory_grdTransHistory")
        public WebElement uITransactionHistoryTable;


    }

    public class InvoicesTab
    {
        public WebDriver driver;

        public InvoicesTab()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "tabAlarm_tmpl5_usrGenericInvoicePayments1_cddInvoiceType_DropDown")
        public WebElement uIInvoiceTypeDropdown;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl5_usrGenericInvoicePayments1_cmdSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl5_usrGenericInvoicePayments1_grdInvoice")
        public WebElement uIInvoiceTable;

        @FindBy(how = How.ID, using = "tabAlarm_tmpl5_usrGenericInvoicePayments1_txtCurrentBalance")
        public WebElement uIBalanceEdit;
    }
    
  
    public class AlarmSearch
    {

        public WebDriver driver;

        public AlarmSearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
        public WebElement uIAddNewButton;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "txtAlarm")
        public WebElement uIAlarmNo;

        @FindBy(how = How.ID, using = "txtAlarmLocation")
        public WebElement uIAlarmLocationEdit;

        @FindBy(how = How.ID, using = "cddAlarmType")
        public WebElement uIAlarmTypeComboBox;

        @FindBy(how = How.ID, using = "grdAlarms")
        public WebElement uIAlarmSearchTable;

        @FindBy(how = How.ID, using = "nBusinessPersonName_LastName")
        public WebElement uIBusinessOrPersonLastName;

        @FindBy(how = How.ID, using = "nBusinessPersonName_FirstName")
        public WebElement uIBusinessOrPersonFirstName;

        @FindBy(how = How.ID, using = "adrMainAddress_txtFrom")
        public WebElement uIAddressEdit;

        @FindBy(how = How.ID, using = "cddAlarmCompany_CodeValue")
        public WebElement uIAlarmCompanyCodeEdit;

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Refresh')])")
        public WebElement uIRefreshButton;
        
        @FindBy(how = How.XPATH, using = "//li[@title='Print']")
        public WebElement uIPrintButton;
                 
        @FindBy(how = How.ID, using = "txtBalanceAmt")
        public WebElement uIBalanceAmount;
        
        @FindBy(how = How.ID, using = "txtYTDOcc")
        public WebElement uIYTDOccur;

      @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
        public WebElement uIBackButton;
        
        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;
      
        @FindBy(how = How.ID, using = "nBusinessPersonName_NameType")
        public WebElement uIBusinessOrPersonNameIDType;
        
        @FindBy(how = How.ID, using = "nBusinessPersonName_NameTypeID")
        public WebElement uIBusinessOrPersonNameID;

		@FindBy(how = How.ID, using = "chkShowUnreg")
        public WebElement uIShowUnregisteredOnlyCheckBox;
       
    }


    public class AlarmCompanySearch
    {

        public WebDriver driver;

        public AlarmCompanySearch()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
        public WebElement uIAddNewButton;

        @FindBy(how = How.ID, using = "txtCMPCode")
        public WebElement uICompanyCodeEdit;

        @FindBy(how = How.ID, using = "txtLastName")
        public WebElement uICompanyNameEdit;

        @FindBy(how = How.ID, using = "cmdSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "grdALCMP")
        public WebElement uIAlarmCompanySearchTable;

        @FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

        
    }



    public class NameEntry
    {

        public WebDriver driver;

        public  NameEntry()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "txtCMPCode")
        public WebElement uIBusinessIDEdit;

        @FindBy(how = How.ID, using = "txtBusinessName")
        public WebElement uINameEdit;

        @FindBy(how = How.ID, using = "adrAlarmAddress1_txtFrom")
        public WebElement uIAddressEdit;

        @FindBy(how = How.ID, using = "adrAlarmAddress1_chkVerify")
        public WebElement uIAddressCheckbox;

        @FindBy(how = How.ID, using = "cmdSave")
        public WebElement uISaveButton;

        @FindBy(how = How.ID, using = "cmdSaveNClose")
        public WebElement uISaveNCloseButton;

        @FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
        public WebElement uIBottomLeftSideStatusBar;

        @FindBy(how = How.ID, using = "txtNumber_PhoneType_DropDown")
        public WebElement uIPhoneType1Combobox;

        @FindBy(how = How.ID, using = "txtNumber_PhoneNumber")
        public WebElement uIPhoneNumber1Edit;

        @FindBy(how = How.ID, using = "txtPhNumber_PhoneType_DropDown")
        public WebElement uIPhoneType2Combobox;

        @FindBy(how = How.ID, using = "txtPhNumber_PhoneNumber")
        public WebElement uIPhoneNumber2Edit;
    }
    
    public class FalseAlarms
    {
        public WebDriver driver;

        public FalseAlarms()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "cmdBatchProcess")
        public WebElement uIBatchProcessButton;

        @FindBy(how = How.ID, using = "cmdSearch")
        public WebElement uISearchButton;

        @FindBy(how = How.ID, using = "dtcFromDate_KPIDttmCtrl")
        public WebElement uIFromDateEdit;

        @FindBy(how = How.ID, using = "adrAlarmAddress1_txtFrom")
        public WebElement uIToDateEdit;

        @FindBy(how = How.ID, using = "grdFalseAlarm")
        public WebElement uIFalseAlarmTable;

        @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
        public WebElement uIResetButton;

        @FindBy(how = How.ID, using = "lblAccount")
        public WebElement uIAccountNotFoundText;

        @FindBy(how = How.ID, using = "btnYes")
        public WebElement uIYesButton;

        @FindBy(how = How.ID, using = "btnNo")
        public WebElement uINoGoBackButton;

        @FindBy(how = How.ID, using = "chkIsProcess")
        public WebElement uIIncludeProcessedCheckbox;

        @FindBy(how = How.ID, using = "chkIsRemoved")
        public WebElement uIRemovedOnlyCheckbox;
        
        @FindBy(how = How.XPATH, using = "//div[@id='pnlUpdate']//table//tbody//tr//td//span")
        public WebElement uIAlarmNotFoundPopupMsg;
        
        @FindBy(how = How.XPATH, using = "//input[@id='btnYes']")
        public WebElement uIAlarmNotFoundPopupYes;
        
        @FindBy(how = How.XPATH, using = "//input[@id='btnNo']")
        public WebElement uIAlarmNotFoundPopupNo;

    }

    public class AlarmYearEndReport
    {
         public WebDriver driver;

         public AlarmYearEndReport()
        {
            driver = Playback.driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.ID, using = "grdAlarmYearEnd")
         public WebElement uIAlarmYearEndReportTable;

        @FindBy(how = How.ID, using = "cmdYearEnd")
        public WebElement uIProceedYearEndButton;

        @FindBy(how = How.ID, using = "dtcReport_KPIDttmCtrl")
        public WebElement uIPopupFiscalYearEndDateEdit;

        @FindBy(how = How.ID, using = "chkIsReset")
        public WebElement uIPopupResetAlarmOccurencesCheckbox;

        @FindBy(how = How.ID, using = "chkIsRegFee")
        public WebElement uIPopupCreateRegistrationFeeCheckbox;

        @FindBy(how = How.ID, using = "chkIsClearInvoice")
        public WebElement uIPopupClearAllTheOpenInvoicesCheckbox;

        @FindBy(how = How.ID, using = "chkIsZeroBalance")
        public WebElement uIPopupZeroBalanceAccountsCheckbox;

        @FindBy(how = How.ID, using = "cmdView")
        public WebElement uIPopupViewReportOnlyButton;

        @FindBy(how = How.ID, using = "cmdRun")
        public WebElement uIPopupRunYearEndProcessButton;

        @FindBy(how = How.ID, using = "cmdCancel")
        public WebElement uIPopupCancelButton;

        @FindBy(how = How.ID, using = "txtCmt")
        public WebElement uIPopupCommentEdit;

        @FindBy(how = How.XPATH, using = "//div[@class = 'modal-body']")
        public WebElement uIWarningMessageTextView;

        @FindBy(how = How.XPATH, using = "//button[contains(text(),'Ok')]")
        public WebElement uIOkButton;

        @FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
        public WebElement uICancelButton;

    }
    
    public class AlarmCompanyEntry
    {
    	public WebDriver driver;

        public AlarmCompanyEntry()
       {
           driver = Playback.driver;
           PageFactory.initElements(driver, this);
       }
        
        @FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropdown;

        @FindBy(how = How.ID, using = "txtCMPCode")
		public WebElement uIBusinessID;

        @FindBy(how = How.ID, using = "txtBusinessName")
		public WebElement uIName;

        @FindBy(how = How.ID, using = "adrAlarmAddress1_txtFrom")
		public WebElement uIAddress;
        
        @FindBy(how = How.ID, using = "txtNumber_PhoneType_DropDown")
		public WebElement uIPhone1Type;

        @FindBy(how = How.ID, using = "txtNumber_PhoneNumber")
		public WebElement uIPhone1Edit;

        @FindBy(how = How.ID, using = "txtPhNumber_PhoneType_DropDown")
		public WebElement uIPhone2Type;

        @FindBy(how = How.ID, using = "txtPhNumber_PhoneNumber")
		public WebElement uIPhone2Edit;

        @FindBy(how = How.ID, using = "txtEmail")
		public WebElement uIEmailEdit;

        @FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISave;
        
        @FindBy(how = How.ID, using = "txtBusinessName_NameType")
        public WebElement uINameType;

        @FindBy(how = How.ID, using = "txtBusinessName_NameTypeID")
        public WebElement uINameTypeID;

        @FindBy(how = How.CLASS_NAME, using = "statusBar")
        public WebElement uIstatusBar;


    }

}
