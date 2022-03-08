package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dataAccess.PoliceData;
import uIMaps.UIMapAlarm;
import uIMaps.UIMapGeo;
import uIMaps.UIMapPopup;
import uIMaps.UIMapAlarm.AccountEntry;
import uIMaps.UIMapAlarm.AlarmAccountSearch;
import uIMaps.UIMapAlarm.AlarmCFSEntry;
import uIMaps.UIMapAlarm.AlarmCompanySearch;
import uIMaps.UIMapAlarm.AlarmSearch;
import uIMaps.UIMapAlarm.AlarmType;
import uIMaps.UIMapAlarm.AlarmYearEndReport;
import uIMaps.UIMapAlarm.AlarmsEntry;
import uIMaps.UIMapAlarm.FalseAlarms;
import uIMaps.UIMapAlarm.NameEntry;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Alarms {

	  public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public   UIMapAlarm uIMapAlarm = new UIMapAlarm();   
	  public Popup popup = new Popup();
	  public Names names = new Names();
	  public   UIMapPopup uIMapPopup = new UIMapPopup();
	  
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
	    
	    public Alarms()
	    {
	    	 if (alarmAccountSearch == null)
                 alarmAccountSearch = new AlarmAccountSearch();
	    	if (accountEntry == null)
                accountEntry = new AccountEntry();
	    	 if (alarmsEntry == null)
                 alarmsEntry = new AlarmsEntry();
	    	 if (alarmSearch == null)
                 alarmSearch = new AlarmSearch();
	    	if (alarmType == null)
                alarmType = new AlarmType();
	    	if (alarmCFSEntry == null)
                alarmCFSEntry = new AlarmCFSEntry();
	    	 if (alarmCompanySearch == null)
                 alarmCompanySearch = new AlarmCompanySearch();
	    	if (nameEntry == null)
                nameEntry = new NameEntry();
	    	 if (falseAlarms == null)
                 falseAlarms = new FalseAlarms();	    	
	    	if (alarmYearEndReport == null)
                alarmYearEndReport = new AlarmYearEndReport();	    	
	    	if (alarmCompanyEntry == null)
	    		alarmCompanyEntry = new AlarmCompanyEntry();
	    }
	    
	    public void Reset()
		   {			   
	    	uIMapAlarm=null;
		   }
	    
	 public void switchToAlarmAccountSearch()
     {
         objectIdentification.windowHandle.switchToMainWindowScreenTab("Alarm Account Search");
     }

     public void switchToAccountEntry()
     {
         objectIdentification.windowHandle.switchToWindow("Account Entry");
     }
     public void switchToAlarmsEntry()
     {
         objectIdentification.windowHandle.switchToWindow("Alarms Entry");
     }
          
     public void switchToAlarmsEntryScreenTab()
     {    		
    	 Playback.controlReadyThreadWait();
         objectIdentification.windowHandle.switchToMainWindowScreenTab("Alarm Entry");
     }
     
     public void switchToAlarmsSearch()
     {
         objectIdentification.windowHandle.switchToMainWindowScreenTab("Alarms/frmAlarmsSrch");
     }

     public void switchToAlarmsCFSEntry()
     {
         objectIdentification.windowHandle.switchToWindow("Alarm CFS Entry");
     }

     public void switchToAlarmType()
     {
         objectIdentification.windowHandle.switchToMainWindowScreenTab("Static/frmAlarmsCFSParameterSrch");
     }

     public void switchToAlarmCompanySearch()
     {
         objectIdentification.windowHandle.switchToMainWindowScreenTab("Static/frmALCMPSrch");
     }

     public void switchToNameEntry()
     {
         objectIdentification.windowHandle.switchToWindow("Name Entry");
     }

     public void switchToFalseAlarms()
     {
         objectIdentification.windowHandle.switchToMainWindowScreenTab("False Alarms");
     }
     public void switchToFalseAlarmYearEndReport()
     {
         objectIdentification.windowHandle.switchToMainWindowScreenTab("Alarms/frmYearEndRpt");
     }
     public void switchToAlarmCompanyEntry()
     {
         objectIdentification.windowHandle.switchToWindow("Alarm Company Entry");
     }
     
     public class AlarmAccountSearch
     {
         public void ClickAddNew()
         {
             uIMapAlarm.alarmAccountSearch.uIAddNewButton.click();
         }
         public void ClickSearch()
         {
             uIMapAlarm.alarmAccountSearch.uISearchButton.click();
         }
         public void ClickBack()
         {
             uIMapAlarm.alarmAccountSearch.uIBackButton.click();
         }
         public void EnterAtAlarmNo()
         {
             uIMapAlarm.alarmAccountSearch.uIAlarmNoEdit.sendKeys(PoliceData.getAlarmModuleValue("AlarmNo"));
         }
         public void EnterAtAccountNo()
         {
             uIMapAlarm.alarmAccountSearch.uIAccountNoEdit.sendKeys(PoliceData.getAlarmModuleValue("AccountNo"));
         }
         public void VerifyAtAccountNo(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AccountNo"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmAccountSearch
                 .uIAlarmAccountSearchGridTable, "Account#", rowIndex));
         }
         public void VerifyAtAlarmNo(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AlarmNo"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmAccountSearch
                 .uIAlarmAccountSearchGridTable, "Alarm#", rowIndex));
         }
         public void SelectAtAccountNoInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmAccountSearch.uIAlarmAccountSearchGridTable,
                PoliceData.getAlarmModuleValue("AccountNo"));
         }
         public void SelectAtAlarmNoInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmAccountSearch.uIAlarmAccountSearchGridTable,
                PoliceData.getAlarmModuleValue("AlarmNo"));
         }

     }
     public class AccountEntry
     {
         public void ClickSave()
         {
             uIMapAlarm.accountEntry.uISaveButton.click();
         }
         public void SaveScreen()
         {
             uIMapAlarm.accountEntry.uISaveButton.click();
             popup.confirm.yes();
         }
         public void EnterAtAccountNo()
         {
             uIMapAlarm.accountEntry.uIAccountNoEdit.sendKeys(PoliceData.getAlarmModuleValue("AccountNo"));
         }
         public void TabAccountDate()
         {
             uIMapAlarm.accountEntry.uIAccountDateEdit.sendKeys(Keys.TAB);
         }
         public void EnterAtLastName()
         {
             uIMapAlarm.accountEntry.uILastNameEdit.sendKeys(PoliceData.getAlarmModuleValue("LastName"));
         }
         public void EnterAtFirstName()
         {
             uIMapAlarm.accountEntry.uIFirstNameEdit.sendKeys(PoliceData.getAlarmModuleValue("FirstName"));
             uIMapAlarm.accountEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
         }
         public void SelectAtName()
         {
             names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
         }
         public void EnterAtAddress()
         {
             uIMapAlarm.accountEntry.uIAddressEdit.sendKeys(PoliceData.getAlarmModuleValue("Address"));
             uIMapAlarm.accountEntry.uIAddressEdit.sendKeys(Keys.TAB);
         }
         public void GetAccountAddress(String Address)  //out
         {
             Playback.controlReadyThreadWait();
             Playback.testContext.setAttribute("Address",uIMapAlarm.accountEntry.uIAccountAddressEdit.getAttribute("value"));
           //  Address = uIMapAlarm.accountEntry.uIAccountAddressEdit.getAttribute("value");
         }
         public void ClickNewAlarmButton()
         {
             uIMapAlarm.accountEntry.uINewAlarmButton.click();
         }
         public void VerifyAlarmButtonDisplayed()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.accountEntry.uINewAlarmButton.isDisplayed());
         }
         public void VerifyTransactionButtonDisplayed()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.accountEntry.uITransactionButton.isDisplayed());
         }
         public void CloseScreen()
         {
             uIMapAlarm.accountEntry.driver.close();
         }
         public void VerifyAcknowledgeMandatoryData()
         {
             popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory PoliceData");
         }
         public void VerifyAtAlarmType(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AlarmType"), objectIdentification.manualIdentify.getGridCellInnerText(
                 uIMapAlarm.accountEntry.uIAccountEntryGridTable, "Type", rowIndex));
         }
         public void VerifyAlarmNo(String AlarmNo, int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(AlarmNo, objectIdentification.manualIdentify.getGridCellInnerText(
                 uIMapAlarm.accountEntry.uIAccountEntryGridTable, "Alarm#", rowIndex));
         }
         public void ClickNameInfoIcon()
         {
             uIMapAlarm.accountEntry.uINameInfoIcon.click();
             Playback.controlReadyThreadWait();
         }
         public void ClickAtAlarmNoInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.accountEntry.uIAccountEntryGridTable,
                 PoliceData.getAlarmModuleValue("AlarmNo"));
         }
         public void VerifyAtAccountNo()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AccountNo"), uIMapAlarm.accountEntry.uIAccountNoEdit.getAttribute("value"));
         }
     }
     
     public class AlarmType
     {

         public void ClickAddNewButton()
         {
             uIMapAlarm.alarmType.uIAddNewButton.click();
         }

         public void VerifyAtAlarmTypeByUsingCADCFSCodeInGrid()
         {
    
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AlarmType"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmType.uIAlarmTypeTable, PoliceData.getAlarmModuleValue("CADCFSCode"),"Alarm Type").getText(),"Verify Alarm Type appread in grid");
         }


     }
     
     
     public class AlarmCFSEntry
     {
    	 public CADCFSAndDispositionTab cADCFSAndDispositionTab = null;
         public FeesAndSettingsTab feesAndSettingsTab = null;
    	 public AlarmCFSEntry()
    	 {
             if (this.cADCFSAndDispositionTab == null)
             {
                 this.cADCFSAndDispositionTab = new CADCFSAndDispositionTab();
             }

             if (this.feesAndSettingsTab == null)
             {
                 this.feesAndSettingsTab = new FeesAndSettingsTab();
             }
    	 }

         public void ClickSaveButton()
         {
             uIMapAlarm.alarmCFSEntry.uISaveButton.click();
         }

         public void SaveNClose()
         {
             uIMapAlarm.alarmCFSEntry.uISaveNCloseButton.click();
             popup.confirm.yes();
         }
         public void closeScreen()
         {
             Playback.driver.close();
         }

         public void EnterAtAlarmType()
         {
             uIMapAlarm.alarmCFSEntry.uIAlarmTypeEdit.sendKeys(PoliceData.getAlarmModuleValue("AlarmType"));
         }

         public void EnterAtDescription()
         {
             uIMapAlarm.alarmCFSEntry.uIDescriptionEdit.sendKeys(PoliceData.getAlarmModuleValue("Description"));
         }

         public void ClickCADCFSAndDispositionTab()
         {
             uIMapAlarm.alarmCFSEntry.uICADCFSAndDispositionTab.click();
         }

         public void ClickFeesAndSettingsTab()
         {
             uIMapAlarm.alarmCFSEntry.uIFeesAndSettingsTab.click();
         }

         public void Verify1018RequiredEntriesAreMissingAlarmTypeAckMsg()
         {
             popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -Alarm Type");
         }

         public void Verify1018RequiredEntriesAreMissingRegTypeAckMsg()
         {
             popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing -Registration Type");
         }

         public void Verify1018RequiredEntriesAreMissingCADCFSAckMsg()
         {
             popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - CAD CFS");
         }
         public void SelectAtRegistrationType()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.alarmCFSEntry.uIRegistrationTypeComboBox, 
                 PoliceData.getAlarmModuleValue("RegistrationType"));
             uIMapAlarm.alarmCFSEntry.uIRegistrationTypeComboBox.sendKeys(Keys.TAB);
         }

         public void SaveScreen()
         {
             uIMapAlarm.alarmCFSEntry.uISaveButton.click();
             popup.confirm.yes();
         }
         public void clickTrackFeesYesRadioButton()
         {
        	 uIMapAlarm.alarmCFSEntry.uITrackFeesYesRadioButton.click();
         }

         public void clickPrintButton() {
        	 uIMapAlarm.alarmCFSEntry.uIPrintButton.click();
        	 Playback.pageLoadThreadWait();
         }
         public void VerifyUpdatedSuccessfulMsg() {
       	  Playback.wait(2000);
             String AdditionMessage = uIMapAlarm.alarmCFSEntry.uIBottomLeftSideStatusBar.getText();
             System.out.println(AdditionMessage);
             Playback.controlReadyThreadWait();
             verify.ExpectedPropertyValueIsEqual(AdditionMessage,"1003 - Update Successful");
       }
         public void VerifyAdditionSuccessfulMsg() {
          	  Playback.wait(2000);
                String AdditionMessage = uIMapAlarm.alarmCFSEntry.uIBottomLeftSideStatusBar.getText();
                System.out.println(AdditionMessage);
                Playback.controlReadyThreadWait();
                verify.ExpectedPropertyValueIsEqual(AdditionMessage,"1002 - Addition Successful");
          }
     }

     public class CADCFSAndDispositionTab
     {

         public void EnterAtCADCFS()
         {
             uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uICADCFSCodeEdit.sendKeys(PoliceData.getAlarmModuleValue("CADCFS"));
             uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uICADCFSCodeEdit.sendKeys(Keys.TAB);
         }

         public void EnterAtDisposition()
         {
             uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uIDispositionCodeEdit.sendKeys(PoliceData.getAlarmModuleValue("Disposition"));
             uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uIDispositionCodeEdit.sendKeys(Keys.TAB);
         }

         public void ClickAddButton()
         {
             uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uIAddButton.click();
         }

         public void VerifyAtCADCFSInGrid()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("CADCFSDescription"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uICADCFSDispositionTable, PoliceData.getAlarmModuleValue("CADCFSDescription")).getText(),"Verify CAD CFS in grid");
         }
         public void verifyAtDispositionInGrid()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("DispositionDescription"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uICADCFSDispositionTable, PoliceData.getAlarmModuleValue("DispositionDescription")).getText(), "Verify CAD CFS in grid");
         }
         public void ClickCADCFSLookup()
         {
             uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uICADCFSLookupButton.click();
             Playback.controlReadyThreadWait();
         }
         public void ClickDispostionLookup()
         {
             uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uIDispositionLookupButton.click();
             Playback.controlReadyThreadWait();
         }
         public void SelectCADCFSDescription1InPopup()
         {
             popup.switchToCodedSearch();
             popup.kPICodedLookup.kPIHelpSelect(PoliceData.getAlarmModuleValue("CADCFSDescription1"));
             Playback.controlReadyThreadWait();
         }
         public void SelectDispositionDescription1InPopup()
         {
             popup.switchToCodedSearch();
             popup.kPICodedLookup.kPIHelpSelect(PoliceData.getAlarmModuleValue("DispositionDescription1"));
             Playback.controlReadyThreadWait();
         }
         public void DeleteAtCADCFSDescriptionRow()
         {
             objectIdentification.manualIdentify.deleteGridRowByCellInnerText(uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uICADCFSDispositionTable, 
                 PoliceData.getAlarmModuleValue("CADCFSDescription"));
             Playback.controlReadyThreadWait();
         }
         public void VerifyAtleastOneRecordAcknowledgeMessage()
         {
             popup.acknowledge.okWithExpectedMessage("(9513) At least one CAD CFS and CAD Disposition are required");
         }
         public void verifyAtDispositionInGrid1()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("DispositionDescription1"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmCFSEntry.cADCFSAndDispositionTab.uICADCFSDispositionTable, PoliceData.getAlarmModuleValue("DispositionDescription1")).getText(), "Verify CAD CFS in grid");
         }

     }

     public class FeesAndSettingsTab
     {

         public void SelectAtRegistrationType()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.alarmCFSEntry.feesAndSettingsTab.uIRegistrationTypeComboBox, PoliceData.getAlarmModuleValue("RegistrationType"));
         }

         public void EnterAtRegistrationFee()
         {
             uIMapAlarm.alarmCFSEntry.feesAndSettingsTab.uIRegistrationFeeEdit.sendKeys(PoliceData.getAlarmModuleValue("RegistrationFee"));
         }
         
         public void EnterFirstAlarmAmount()
         {
             uIMapAlarm.alarmCFSEntry.feesAndSettingsTab.uI1stAlarmAmountEdit.sendKeys(Randomized.randomNumberString(2));
         }
         public void EnterSecondAlarmAmount()
         {
             uIMapAlarm.alarmCFSEntry.feesAndSettingsTab.uI2ndAlarmAmountEdit.sendKeys(Randomized.randomNumberString(1));
         }
         public void EnterUnregisteredAlarmFineAmountFee()
         {
             uIMapAlarm.alarmCFSEntry.feesAndSettingsTab.uIUnregisteredAlarmFineAmountEdit.sendKeys(Randomized.randomNumberString(1));
         }
     }
     

     public class AlarmsEntry
     {
    	 
         public AlarmEntryContactTab alarmEntryContactTab = null;
         public AlarmEntryMainTab alarmEntryMainTab = null;
         public ProcessFalseAlarmTab processFalseAlarmTab = null;
         public TransactionHistoryTab transactionHistoryTab = null;
         public InvoicesTab invoicesTab = null;
         
         public AlarmsEntry()
         {
        	 if (this.alarmEntryContactTab == null)
             {
                 this.alarmEntryContactTab = new AlarmEntryContactTab();
             }

             if(this.alarmEntryMainTab == null)
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
         
         public void ClickSave()
         {
             uIMapAlarm.alarmsEntry.uISaveButton.click();
         }
         public void SaveScreen()
         {
             uIMapAlarm.alarmsEntry.uISaveButton.click();
             Playback.controlReadyThreadWait();
             popup.confirm.yes();
         }

         public void SaveNCloseScreen()
         {
             uIMapAlarm.alarmsEntry.uISaveAndCloseButton.click();
             popup.confirm.yes();
         }


         public void CloseScreen()
         {
             uIMapAlarm.alarmsEntry.driver.close();
         }

         public void selectAtAlarmType()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.alarmsEntry.uIAlarmTypeComboBox, PoliceData.getAlarmModuleValue("AlarmType"));
         }

         public void EnterAtAlarmLocation()
         {
             uIMapAlarm.alarmsEntry.uIAlarmLocationEdit.sendKeys(PoliceData.getAlarmModuleValue("AlarmLocation"));
         }

         public void EnterAtBusinessOrPersonNameID()
         {
             uIMapAlarm.alarmsEntry.uIBusinessOrPersonNameTypeEdit.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonNameID").substring(0, 1));
             uIMapAlarm.alarmsEntry.uIBusinessOrPersonNameIDEdit.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonNameID").substring(2));
             uIMapAlarm.alarmsEntry.uIBusinessOrPersonNameIDEdit.sendKeys(Keys.TAB);
         }

         public void VerifyAtAddress1()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Address1"), uIMapAlarm.alarmsEntry.uIAddress1Edit.getAttribute("value"));
         }

         public void clickMainTab()
         {
             uIMapAlarm.alarmsEntry.uIMainTab.click();
         }

         public void SwitchToContactTab()
         {
             uIMapAlarm.alarmsEntry.uIContactsTab.click();
             Playback.pageLoadThreadWait();
             objectIdentification.windowHandle.switchToFrame("frmContactNew"); 
         }

         public void ClickAttachmentsTab()
         {
             uIMapAlarm.alarmsEntry.uIAttachmentsTab.click();
         }

         public void ClickProcessFalseAlarmTab()
         {
             uIMapAlarm.alarmsEntry.uIProcessFalseAlarmTab.click();
         }

         public void ClickTransactionHistoryTab()
         {
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
             uIMapAlarm.alarmsEntry.uITransactionHistoryTab.click();
         }

         public void ClickInvoicesTab()
         {
             uIMapAlarm.alarmsEntry.uIInvoicesTab.click();
         }

         public void VerifyNewTabEnabled()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.uIContactsTab.isDisplayed(),"verify contact tab enabled");
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.uIAttachmentsTab.isDisplayed(), "verify Attachment tab enabled");
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.uIProcessFalseAlarmTab.isDisplayed(), "verify Process false alarm tab enabled");
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.uITransactionHistoryTab.isDisplayed(), "verify Transaction History tab enabled");
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.uIInvoicesTab.isDisplayed(), "verify Invoices tab enabled");
         }

         public void Verify1018RequiredEntriesareMissingAckMsg()
         {
             popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
         }

         public void SelectAlarmType()
         {
             objectIdentification.randomIdentify.selectDropDownOption(uIMapAlarm.alarmsEntry.uIAlarmTypeComboBox);
             uIMapAlarm.alarmsEntry.uIAlarmTypeComboBox.sendKeys(Keys.TAB);
         }
         public void VerifyAtAlarmNo()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AlarmNo"), uIMapAlarm.alarmsEntry.uIAlarmNoEdit.getAttribute("value"));
         }
         public void VerifyNameTypeAsO()
         {
             verify.ExpectedPropertyValueIsEqual("O", uIMapAlarm.alarmsEntry.uIBusinessOrPersonNameTypeEdit.getAttribute("value"));
         }
         public void VerifyLastNameAsCurrentOwner()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Current Owner"), uIMapAlarm.alarmsEntry.uIBusinessOrPersonLastNameEdit.getAttribute("value"));
         }
         public void VerifyFirstNameAsAlarmNo(String alarmNo)
         {
             verify.ExpectedPropertyValueIsEqual("Alarm:" + alarmNo, uIMapAlarm.alarmsEntry.uIBusinessOrPersonFirstNameEdit.getAttribute("value"));
         }
         public void GetAlarmNo(String alarmNo) //out
         {
             alarmNo = uIMapAlarm.alarmsEntry.uIAlarmNoEdit.getAttribute("value");
             Playback.testContext.setAttribute("AlarmNo",alarmNo);
         }
         
        
         public void VerifyTotalOccurrenceAs1()
         {
             verify.ExpectedPropertyValueIsEqual("1", uIMapAlarm.alarmsEntry.uITotalOccurrencesTextView.getText());
         }
         public void VerifyChargeableOccurrencesAs0()
         {
             verify.ExpectedPropertyValueIsEqual("0", uIMapAlarm.alarmsEntry.uIChargeableOccurrencesTestView.getText());
         }
         public void VerifyTotalOccurrenceAs0()
         {
             verify.ExpectedPropertyValueIsEqual("0", uIMapAlarm.alarmsEntry.uITotalOccurrencesTextView.getText());
         }

         public void EnterAlarmLocation(String evenNo)
         {
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.click();
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.clear();
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.sendKeys(evenNo + " " + PoliceData.getAlarmModuleValue("StreetName") + " " + PoliceData.getAlarmModuleValue("StreetType"));
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.sendKeys(Keys.TAB);
         }
         public void EnterAlarmLocationWithApartment(String evenNo)
         {
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.click();
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.clear();
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.sendKeys(evenNo + " " + PoliceData.getAlarmModuleValue("StreetName") + " " + PoliceData.getAlarmModuleValue("StreetType") + "," + 3);
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.sendKeys(Keys.TAB);
         }
         public void VerifyDeleteIconDisplayed()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.uIDeleteButton.isDisplayed());
         }
         public void DeleteAlarmEntry()
         {
             uIMapAlarm.alarmsEntry.uIDeleteButton.click();
             Playback.controlReadyThreadWait();
             popup.confirm.yes();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
         }
         public void ClearAlarmLocation()
         {
             uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.clear();
         }
         
         public void ChangeAlarmLocation()
         {
        	 uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.sendKeys(PoliceData.getAlarmModuleValue("AlarmLocation"));
        	 uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.sendKeys(Keys.TAB);
         }
         public void ChangeAlarmLocation1()
         {
        	 uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.sendKeys(PoliceData.getAlarmModuleValue("AlarmLocation1"));
         }

         public void VerifyAddressInactive()
         {
        	 Playback.pageLoadThreadWait();
            objectIdentification.windowHandle.switchToWindow("Acknowledge");
            String expected = "(5097) This address is inactive";
            String actual =Playback.driver.findElement(By.xpath("//span[@id='htmlErrorInfo']//b")).getText();
            if(actual==expected)
            {
            	uIMapPopup.acknowledgeWindow.uIOkButton.click();
            }
         }
         
         public void ClickInactiveChkBox()
         {
        	 uIMapAlarm.alarmsEntry.uIInactiveCheckBox.click();
         }
         public void verifyUpdateSuccessful() 
         {
 			String text = uIMapAlarm.alarmsEntry.uIstatusBar.getText();
 			verify.ExpectedPropertyValueIsEqual(text, " 1003 - Update Successful");
         }
         public void VerifyBusinessPersonIsNotMandatory()
         {
        	String Color = uIMapAlarm.alarmsEntry.uIBusinessPersonLable.getAttribute("style");
        	verify.ExpectedValueIsTrue(Color.contains("black"));
        	
         }
         public void VerifyBusinessPersonIsMandatory()
         {
        	 String Color = uIMapAlarm.alarmsEntry.uIBusinessPersonLable.getAttribute("style");
         	verify.ExpectedValueIsTrue(Color.contains("maroon"));
         }
         public void ClearBusinessPersonName()
         {
        	 uIMapAlarm.alarmsEntry.uIBusinessOrPersonNameIDEdit.clear();
        	 uIMapAlarm.alarmsEntry.uIBusinessOrPersonNameTypeEdit.clear();
        	 popup.acknowledge.okWithExpectedMessage("(6020) Invalid Name ID");
        	 
         }
        
         public void verifyAlarmLocationIBubble()
         {
        	 verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.uIAlarmLocationIBubble.isDisplayed());
         }

 public void verifyAdditionSuccessfulMessage()
	        {
	            Playback.wait(2000);
	            String AdditionMessage = uIMapAlarm.alarmsEntry.uIBottomLeftSideStatusBar.getText();
	            System.out.println(AdditionMessage);
	            Playback.controlReadyThreadWait();
	            verify.ExpectedPropertyValueIsEqual(AdditionMessage,"1002 - Addition Successful");
	            												
	        }
 
 public void clickResetButton()
 {
	 uIMapAlarm.alarmsEntry.uIResetButton.click();
 }
 public void verifyAtAlarmLocation()
 {
	 String attribute = uIMapAlarm.alarmsEntry.uIAlarmLocationMainAddressEdit.getAttribute("value");
	 verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getAlarmModuleValue("AlarmLocation")));
 }
 
public void clickBusinessOrPersonNameInfoButton()
 {
	 uIMapAlarm.alarmsEntry.uIBusinessOrPersonNameInfoIcon.click();
	 Playback.pageLoadThreadWait();
 }

public String readAlarmNo()
{
	  String attribute = uIMapAlarm.alarmsEntry.uIAlarmNoEdit.getAttribute("value");
	  return attribute; 
}
public void verifyAtTotalOccurrences()
{
	 String text = uIMapAlarm.alarmsEntry.uITotalOccurrencesTextView.getText();
	 verify.ExpectedValueIsTrue(text.contains(PoliceData.getAlarmModuleValue("TotalOccurrences")));
}
 
public void verifyAtCommonNames()
{
String text = uIMapAlarm.alarmsEntry.uICommonNameLabel.getText();
verify.ExpectedValueIsTrue(text.contains(PoliceData.getAlarmModuleValue("CommonNames")));        
}

public void verifyInactiveDateAsCurrentDate()
{
	String attribute = uIMapAlarm.alarmsEntry.uIInactiveDateEdit.getAttribute("value");
	verify.ExpectedValueIsTrue(Randomized.getCurrentDate().contains(attribute));
}

public void VerifyUpdatedSuccessfulMsg() {
	  Playback.wait(2000);
      String AdditionMessage = uIMapAlarm.alarmsEntry.uIBottomLeftSideStatusBar.getText();
      System.out.println(AdditionMessage);
      Playback.controlReadyThreadWait();
      verify.ExpectedPropertyValueIsEqual(AdditionMessage,"1003 - Update Successful");
}

public void VerifyDuplicateAlarmsExistduetoAlarmaddressmerge() {
	  Playback.controlReadyThreadWait();
	 Playback.wait(2000);
	popup.confirm.yes();
	
}

public void verifyFiscalYearEndDateNotConfiguredAcknowledgeMessage() {
            if (Playback.browserType.contains("Chrome")) {
                popup.acknowledge.okWithExpectedMessage(
                        "(9531) The Fiscal Year End date is not configured. Please update system parameter 1804.");
                        
            } else {
                popup.switchToAcknowledge();
                popup.acknowledge.okWithExpectedMessage(
                        "(9531) The Fiscal Year End date is not configured. Please update system parameter 1804.");
                        
                     
            }
        }

     }
     

     public class AlarmEntryContactTab
     {
         public void EnterAtLastName()
         {
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uILastNameEdit.sendKeys(PoliceData.getAlarmModuleValue("LastName"));
         }
         public void EnterAtFirstName()
         {
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIFirstNameEdit.sendKeys(PoliceData.getAlarmModuleValue("FirstName"));
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIFirstNameEdit.sendKeys(Keys.TAB);
         }
         public void SelectAtNameFromNameSearch()
         {
             names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
         }
         public void clickAddNewButton()
         {
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIAddNewButton.click();
             Playback.controlReadyThreadWait();
         }

         public void ClickSearchButton()
         {
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uISearchButton.click();
             Playback.controlReadyThreadWait();
         }

         public void VerifyAtName(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Name"), objectIdentification.manualIdentify.getGridCellInnerText(
                 uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable, "Name", rowIndex),"verify Name appeared");
         }
         public void VerifyAtAddress(int rowIndex)
         {
             verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmsEntry.
                 alarmEntryContactTab.uIContactEntryGridTable, "Address", rowIndex).contains(PoliceData.getAlarmModuleValue("Address")));
         }
         public void SaveInternalTab()
         {
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uISaveButton.click();
             popup.confirm.yes();
         }
         public void ClickAtNameInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable,
                 PoliceData.getAlarmModuleValue("Name"));
         }

         public void ClickIncludeInactiveCheckbox()
         {
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIIncludeInactiveCheckbox.click();
         }
         public void EnterComments()
         {
             uIMapAlarm.alarmsEntry.alarmEntryContactTab.uICommentsEdit.sendKeys(Randomized.randomString(15));
         }
         public void VerifyAtName1(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Name1"), objectIdentification.manualIdentify.getGridCellInnerText(
                 uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable, "Name", rowIndex));
         }
         public void DeleteAtName1InGrid()
         {
             objectIdentification.manualIdentify.deleteGridRowByCellInnerText(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable,
                 PoliceData.getAlarmModuleValue("Name1"));
         }
         public void VerifyDeleteConfirmMessage()
         {
             if (Playback.browserType.contains("Chrome"))
             {
                 popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
             }
             else
                 popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
         }
         public void VerifyContactTableRowCount(int rowIndex)
         {
             verify.ExpectedIntergerValueIsEqualToActual(rowIndex, objectIdentification.manualIdentify.getGridTableRowsCount(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable));
         }

         public void VerifyPrimaryCheckboxCheckedByAtName()
         {
             WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable,
                PoliceData.getAlarmModuleValue("Name"));
             verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable, row, "Primary").findElement(By.tagName("img")).getAttribute("title").contains("Checked"),"verify Primary checkbox checked in grid");
         }

         public void VerifyAtNameRowAppearGrayColor(int rowIndex)
         {
             verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRow(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable, rowIndex).getAttribute("class").contains("Gray"), "Verify Name appear as Gray color");
         }

         public void verifyAtBillingContactDropDownList()
         {
        	 List<String> dropDownValues = objectIdentification.manualIdentify.getDropDownValues(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBillingContactComboBox);
        	 for(String values: dropDownValues)
        	 {
        		 if(values.contains(PoliceData.getAlarmModuleValue("BillingContactDropDownList")))
        		 {
        	 verify.ExpectedValueIsTrue(values.contains(PoliceData.getAlarmModuleValue("BillingContactDropDownList")));
        		 }
        	 }
         }
         
         public void verifyAtPhoneInGrid()
         {
        	List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable, "Phone#");
        	verify.ExpectedValueIsTrue(gridTableColumnValues.contains(PoliceData.getAlarmModuleValue("Phone")));
         }

     }

     public class AlarmEntryMainTab
         {

         public void EnterInstalledDateAsCurrentDate()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIInstalledDateEdit.sendKeys(Randomized.getCurrentDate());
         }

         public void SelectAlarmCompany()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIAlarmCompanySearchButton.click();
             popup.kPICodedLookup.randomKPIHelpSelect();
         }

         public void SelectWaiveNoticeReason()
         {
             objectIdentification.randomIdentify.selectDropDownOption(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIWaiveNoticeReasonComboBox);
         }

         public void EnterComments()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uICommentsEdit.sendKeys(Randomized.randomString(16));
         }

         public void clickSameAsBusinessAccountCheckbox()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uISameAsBusinessAccountCheckbox.click();
         }

         public void VerifyAtBusinessOrPersonNameID()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("BusinessOrPersonNameID").substring(0,1), uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonNameTypeEdit.getAttribute("value"),"verify Business or Pesron Name Type appeared ");
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("BusinessOrPersonNameID").substring(2), uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonNameIDEdit.getAttribute("value"), "verify Business or Pesron Name ID appeared ");
         }

         public void VerifyAtAddress1()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Address1"), uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIAddress1Edit.getAttribute("value"),"Verify address appeared");

         }

         public void VerifyBusinessPersonNameFieldsEmpty()
         {
             verify.ExpectedPropertyValueIsEqual("", uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonLastNameEdit.getText(),"verify Business or person last name field is blank");
             verify.ExpectedPropertyValueIsEqual("", uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonFirstNameEdit.getText(), "verify Business or person first name field is blank");
         }

         public void EnterAtBusinessOrPersonLastName()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonLastNameEdit.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonLastName"));
             
         }

         public void EnterAtBusinessOrPersonFirstName()
         {
      
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonFirstNameEdit.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonFirstName"));
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonFirstNameEdit.sendKeys(Keys.TAB);
         }

         public void ClickNotRegisteredCreateInvoiceButton()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uINotRegisteredCreateInvoiceButton.click();
         }

         public void VerifyRegisteredViewInvoiceButtonDisplayed()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uINotRegisteredCreateInvoiceButton.getAttribute("value").contains("Registered , View Invoice:" ));
         }

         public void ClickRegisteredVieweInvoiceButton()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uINotRegisteredCreateInvoiceButton.click();
         }

         public void VerifyInvoiceNo(String invoiceNo)
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uINotRegisteredCreateInvoiceButton.getAttribute("value").contains(invoiceNo),"verify Invoice Number");
         }

         public void ClickEnterNewNameButton()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIEnterNewNameButton.click();
         }

         public void VerifyAtBillingContact()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("BillingContact"), objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBillingContactComboBox),"verify Billing Contact appeared");
         }

         public void ClickInactiveCheckbox()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIInactiveCheckbox.click();
             Playback.controlReadyThreadWait();
         }
         public void VerifyInactiveDateAsCurrentDate()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIInstalledDateEdit.getAttribute("value").contains(Randomized.getCurrentDate()));
         }
         public void VerifyNameTypeAsO()
         {
             verify.ExpectedPropertyValueIsEqual("O", uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonNameTypeEdit.getAttribute("value"));
         }
         public void VerifyLastNameAsCurrentOwner()
         {
             verify.ExpectedPropertyValueIsEqual("Current Owner", uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonLastNameEdit.getAttribute("value"));
         }
         public void VerifyFirstNameAsAlarmNo(String alarmNo)
         {
             verify.ExpectedPropertyValueIsEqual("Alarm:" + alarmNo, uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonFirstNameEdit.getAttribute("value"));
         }
         public void EnterInstalledDateAsPreviousDate()
         {
             uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIInstalledDateEdit.sendKeys(Randomized.getPreviousDate(2, "MM/dd/yyyy"));
         }
         public void VerifyRegisteredViewInvoiceButton()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uINotRegisteredCreateInvoiceButton.getAttribute("value").
                 contains("Registered , View Invoice:"), "verify Registered, View Invoice button displayed ");
         }
         public void VerifyInvoiceNo(String invoiceYear, String invoiceNo)
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uINotRegisteredCreateInvoiceButton.getAttribute("value").contains
                 (invoiceYear + "-" + invoiceNo));
         }
         public void EnterAtBillAccount()
         {
      
        	  uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonNameTypeEdit.sendKeys(PoliceData.getAlarmModuleValue("NameID1").substring(0, 1));
              uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonNameIDEdit.sendKeys(PoliceData.getAlarmModuleValue("NameID1").substring(2));
              uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonNameIDEdit.sendKeys(Keys.TAB);
            
         }
         public void clearAlarmCompany() 
         {
 			uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIAlarmCompanyCodeEdit.clear();
 			Playback.controlReadyThreadWait();
 			uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIAlarmCompanyCodeEdit.sendKeys(Keys.TAB);
 		}
         public void clickAlarmCompanyLookup() 
         {
 			uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIAlarmCompanySearchButton.click();
 			Playback.controlReadyThreadWait();
 		}

         public void VerifyAtBillingAccountAutoPopulatedWithName()
         {
        	verify.ExpectedPropertyValueIsEqual( uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonLastNameEdit.getAttribute("Value"),PoliceData.getAlarmModuleValue("LastName"));
        	verify.ExpectedPropertyValueIsEqual( uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBusinessOrPersonFirstNameEdit.getAttribute("Value"),PoliceData.getAlarmModuleValue("FirstName"));
         }
         public void VerifySameBusinessAccountCheckboxEnabled()
         {
           verify.ExpectedValueIsTrue( uIMapAlarm.alarmsEntry.alarmEntryMainTab.uISameAsBusinessAccountCheckbox.isEnabled());
         }
         public void VerifySameBusinessAccountCheckboxNotEnabled()
         {
        	 verify.ExpectedValueIsFalse( uIMapAlarm.alarmsEntry.alarmEntryMainTab.uISameAsBusinessAccountCheckbox.isEnabled());
         }
         public void verifyAtBillToAccountNameID()
         {
        	 verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("NameID").substring(0,1), uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBillToAccountNameTypeEdit.getAttribute("value"));
        	 Playback.controlReadyThreadWait();
        	 verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("NameID").substring(2), uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBillToAccountNameIDEdit.getAttribute("value"));
         }
         
         public void clickAddress1IBubble()
         {
        	 uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIAddress1IBubble.click();
         }
         
         public void clickBillingContact()
         {
        	 uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBillingContactComboBox.click();
         }

         public void verifyAtBillingContactDropDownList()
         {
        	 List<String> dropDownValues = objectIdentification.manualIdentify.getDropDownValues(uIMapAlarm.alarmsEntry.alarmEntryMainTab.uIBillingContactComboBox);
        	 for(String values: dropDownValues)
        	 {
        		 if(values.contains(PoliceData.getAlarmModuleValue("BillingContactDropDownList")))
        		 {
        	 verify.ExpectedValueIsTrue(values.contains(PoliceData.getAlarmModuleValue("BillingContactDropDownList")));
        		 }
        	 }
         }
         public void verifyAtPhoneInGrid()
         {
        	List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapAlarm.alarmsEntry.alarmEntryContactTab.uIContactEntryGridTable, "Phone#");
        	verify.ExpectedValueIsTrue(gridTableColumnValues.contains(PoliceData.getAlarmModuleValue("Phone")));
         }

     }

     public class ProcessFalseAlarmTab
     {

         public void VerifyRemoveRadioButtonDisabled()
         {
            
             verify.ExpectedValueIsTrue(Boolean.parseBoolean(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIRemoveRadioButton.getAttribute("disabled")));
         }

         public void VerifyProcessButtonDisabled()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIProcessButton.getAttribute("disabled").contains("true"));
         }

         public void VerifyCancelButtonDisabled()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICancelButton.getAttribute("disabled").contains("true"));
         }

         public void ClearCallNo()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallYearEdit.clear();
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallNumberEdit.clear();
         }


         public void EnterAtCallNo()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallYearEdit.sendKeys(PoliceData.getAlarmModuleValue("CallNo").substring(0, 2));
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallNumberEdit.sendKeys(PoliceData.getAlarmModuleValue("CallNo").substring(3));
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallNumberEdit.sendKeys(Keys.TAB);
             Playback.controlReadyThreadWait();
             Playback.pageLoadThreadWait();
             Playback.popupThreadWait();
         }

         public void EnterAtCallNo1()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallYearEdit.sendKeys(PoliceData.getAlarmModuleValue("CallNo1").substring(0, 2));
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallNumberEdit.sendKeys(PoliceData.getAlarmModuleValue("CallNo1").substring(3));
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallNumberEdit.sendKeys(Keys.TAB);
             Playback.controlReadyThreadWait();
             Playback.pageLoadThreadWait();
         }

         public void VerifyAtCADCFS()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICADCFSEdit.getAttribute("value").contains(PoliceData.getAlarmModuleValue("CADCFS")) ,"verify CAD CFS appeared");
         }


         public void VerifyRemoveRadioButtonEnabled()
         {
             Playback.controlReadyThreadWait();
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIRemoveRadioButton.isEnabled(),"verify Remove radio button enabled");
         }

         public void VerifyProcessButtonEnabled()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIProcessButton.isEnabled(), "verify Process radio button enabled");
         }

         public void VerifyCancelButtonEnabled()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICancelButton.isEnabled(), "verify cancel radio button enabled");
         }

         public void ClickRemoveRadioButton()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIRemoveRadioButton.click();
         }

         public void Click1stAlarmCharge25RadioButton()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uI1stAlarmChargeRadioButton.click();
         }

         public void EnterReasonForRemovalEdit()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIReasonForRemovalEdit.sendKeys(Randomized.randomString(15));
         }

         public void ClickProcessButton()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIProcessButton.click();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
         }
         public void ClickNonChargeableDonotChargeRadioButton()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uINonChargeableDonotChargeRadioButton.click();
             Playback.controlReadyThreadWait();
         }
         public void Click1stAlarmChargeRadioButton()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uI1stAlarmChargeRadioButton.click();
         }
         public void VerifyResonForRemovalMandatory()
         {
             verify.ExpectedPropertyValueIsEqual("req", uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIReasonForRemovalLabel.getAttribute("class"));
         }
         public void VerifyAtDisposition()
         {
             verify.ExpectedValueIsTrue(uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIDispositionEdit.getAttribute("value").contains(PoliceData.getAlarmModuleValue("Disposition")), "verify Disposition appeared");
         }
         public void GetReasonForRemoval(String status) //out
         {
             status = uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIReasonForRemovalEdit.getAttribute("value");
             Playback.testContext.setAttribute("Status", status);
         }
         public String readReasonForRemoval() 
         {
        	 String status = uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIReasonForRemovalEdit.getAttribute("value");
            return status;
         }
         public void ClickNonChargeableRadioButton()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uINonChargeableRadioButton.click();
             Playback.controlReadyThreadWait();
         }
         public void EnterForResonNonChargable()
         {
             uIMapAlarm.alarmsEntry.processFalseAlarmTab.uIReasonForNonChargeableEdit.sendKeys(Randomized.randomString(20));
         }
         public void VerifyAddressMismatchConfirmMessage()
         {
             if (Playback.browserType.contains("Chrome"))
             {
                 popup.confirm.yesWithExpectedMessage("(9530) The entered Alarm address is mismatched for this Alarm address. Are you sure you want to process this alarm?");
                 Playback.controlReadyThreadWait();
             }
             else
             {
                 popup.confirm.yesWithExpectedMessage("(9530) The entered Alarm address is mismatched for this Alarm address. Are you sure you want to process this alarm?");
                 Playback.controlReadyThreadWait();
             }
         }
         
         public void verifyAtCallNo()
         {
        	 String callYear = uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallYearEdit.getAttribute("value");
        	 String callNo = uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallNumberEdit.getAttribute("value");
        	 verify.ExpectedValueIsTrue(callYear.contains(PoliceData.getAlarmModuleValue("CallNo").substring(0, 2)));
        	 verify.ExpectedValueIsTrue(callNo.contains(PoliceData.getAlarmModuleValue("CallNo").substring(3)));
         }
         public void verifyCallNoByActiveData(String callNo)
         {
        	 String callYear = uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallYearEdit.getAttribute("value");
        	 String calNo = uIMapAlarm.alarmsEntry.processFalseAlarmTab.uICallNumberEdit.getAttribute("value"); 
        	 verify.ExpectedValueIsTrue(callNo.substring(0, 2).contains(callYear));
        	 verify.ExpectedValueIsTrue(callNo.substring(3).contains(calNo));
         }
         
         public void verifyAs1stAlarmChargeLabel()
         {
        	 String text = uIMapAlarm.alarmsEntry.processFalseAlarmTab.uI1stAlarmChargeLabel.getText();
        	 verify.ExpectedValueIsTrue(text.contains("1st Alarm, Charge $0.00"));
         }

         public void verifyNonChargeableDNCIsDisplayed()
         {
        	 uIMapAlarm.alarmsEntry.processFalseAlarmTab.uINonChargeableDonotChargeRadioButton.isDisplayed();
         }
     }

     public class TransactionHistoryTab
     {

         public void VerifyAtPFUsingTypeInGrid()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("PF"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable, PoliceData.getAlarmModuleValue("Type"), "PF").getText(),"Verify PF appeared in grid");
         }

         public void VerifyAtTypeInGrid()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Type"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable, PoliceData.getAlarmModuleValue("Type"), "Type").getText(),"verify Type appeared in grid");
         }

         public void Verify1018RequiredEntriesAreMissingAckMsg()
         {
             popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
         }

         public void ClickAddButton()
         {
             uIMapAlarm.alarmsEntry.transactionHistoryTab.uIAddButton.click();
         }

         public void TabOutUpdatedDate()
         {
             uIMapAlarm.alarmsEntry.transactionHistoryTab.uIUpdatedDateEdit.sendKeys(Keys.TAB);
         }

         public void EnterAtUpdatedBy()
         {
             uIMapAlarm.alarmsEntry.transactionHistoryTab.uIUpdatedByCodeEdit.sendKeys(PoliceData.getAlarmModuleValue("UpdatedBy"));
             uIMapAlarm.alarmsEntry.transactionHistoryTab.uIUpdatedByCodeEdit.sendKeys(Keys.TAB);
         }

         public void EnterAtNotes()
         {
             uIMapAlarm.alarmsEntry.transactionHistoryTab.uINotesEdit.sendKeys(PoliceData.getAlarmModuleValue("Notes"));
         }

         public void VerifyAtNotesInGrid()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Notes"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable, PoliceData.getAlarmModuleValue("Notes"), "Notes").getText(),"verify notes appeared in grid");
         }
         public void DeleteRowUsingAtType()
         {
             objectIdentification.manualIdentify.deleteGridRowByCellInnerTextUsingContainsClass(uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable,
                 PoliceData.getAlarmModuleValue("Type"));
             Playback.controlReadyThreadWait();
         }
         public void VerifyDeleteConfirmMessage()
         {
             if (Playback.browserType.contains("Chrome"))
             {
                 popup.confirm.yesWithExpectedMessage("(9533) Are you sure you want to delete this transaction history item?");
             }
             else
                 popup.confirm.yesWithExpectedMessage("(9533) Are you sure you want to delete this transaction history item?");
         }
         public void VerifyRowDeletedUsingRowCount()
         {
             verify.ExpectedPropertyValueIsEqual("0", String.valueOf(objectIdentification.manualIdentify.getGridTableRowsCount(uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable)));
         }
         public void VerifyAtCallNoInGrid(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("CallNo"), objectIdentification.manualIdentify.getGridCellInnerText
                 (uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable, "Call#", rowIndex), "Verify PF appeared in grid");
         }

         public void ClickCallInfoIconInGrid()
         {
             WebElement callRow = objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable,
                 PoliceData.getAlarmModuleValue("CallNo"));
             WebElement CallInfoIcon = callRow.findElement(By.xpath("//td[@title='Call Details']"));
             CallInfoIcon.click();
             Playback.controlReadyThreadWait();
         }

         public void verifyAtFeeInGrid()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Fee"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.transactionHistoryTab.uITransactionHistoryTable, PoliceData.getAlarmModuleValue("Fee"), "Fee $").getText(),"verify Type appeared in grid");
         }
         
         public void verifyAdjustInvoiceAmountConfirmMessage()
         {
        	 if (Playback.browserType.contains("Chrome"))
             {
                 popup.confirm.yesWithExpectedMessage("(9534) Do you want to adjust the invoice amount?");
             }
        	 else 
        	 {
        		 popup.switchToConfirm();
        		 Playback.pageLoadThreadWait();
                 popup.confirm.yesWithExpectedMessage("(9534) Do you want to adjust the invoice amount?");
        	 }
         }
     }

     public class InvoicesTab
     {

         public void SelectInvoiceTypeAsRegistration()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.alarmsEntry.invoicesTab.uIInvoiceTypeDropdown, "Registration");
         }

         public void ClickSearchButton()
         {
             uIMapAlarm.alarmsEntry.invoicesTab.uISearchButton.click();
         }

         public void SelectInvoiceTypeAsFalseAlarm()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.alarmsEntry.invoicesTab.uIInvoiceTypeDropdown, "False Alarm");
         }

         public void VerifyInvoiceTypeAsRegistrationInGrid()
         {
             verify.ExpectedPropertyValueIsEqual("Registration", objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.invoicesTab.uIInvoiceTable, "Registration", "Invoice Type").getText(), "verify Registration appeared in grid below Invoice type column");
         }

         public void VerifyInvoiceTypeAsFalseAlarmInGrid()
         {
             verify.ExpectedPropertyValueIsEqual("False Alarm", objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.invoicesTab.uIInvoiceTable, "False Alarm", "Invoice Type").getText(), "verify False Alarm appeared in grid below Invoice type column");
         }

         public void SelectGridRowByFalseAlarm()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmsEntry.invoicesTab.uIInvoiceTable, "False Alarm");
         }

         public void VerifyBalanceAsZeroUsingInvoiceTypeInGrid()
         {
             verify.ExpectedPropertyValueIsEqual("$0.00", objectIdentification.manualIdentify.getGridCell
                 (uIMapAlarm.alarmsEntry.invoicesTab.uIInvoiceTable, PoliceData.getAlarmModuleValue("InvoiceType"), "Balance").getText(), "verify False Alarm appeared in grid below Invoice type column");
         }

         public void VerifyBalanceAsZero()
         {
             verify.ExpectedPropertyValueIsEqual("$0.00", uIMapAlarm.alarmsEntry.invoicesTab.uIBalanceEdit.getAttribute("value"));
         }

         public void verifyAdjustmentsInGrid()
         {
        	 String text = objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmsEntry.invoicesTab.uIInvoiceTable, PoliceData.getAlarmModuleValue("Adjustments"), "Adjustments").getText();
        	 verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Adjustments"), text);
         }
     }


     public class AlarmSearch
     {

         public void ClickAddNewButton()
         {
             uIMapAlarm.alarmSearch.uIAddNewButton.click();
         }

         public void EnterAtAlarmNo()
         {
             uIMapAlarm.alarmSearch.uIAlarmNo.sendKeys(PoliceData.getAlarmModuleValue("AlarmNo"));
         }

         public void EnterAtAlarmLocation()
         {
             uIMapAlarm.alarmSearch.uIAlarmLocationEdit.sendKeys(PoliceData.getAlarmModuleValue("AlarmLocation"));
         }

         public void EnterAtAddress()
         {
             uIMapAlarm.alarmSearch.uIAddressEdit.sendKeys(PoliceData.getAlarmModuleValue("Address"));

         }

         public void SelectAtAlarmType()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.alarmSearch.uIAlarmTypeComboBox, PoliceData.getAlarmModuleValue("AlarmType"));
         }

         public void ClickSearch()
         {
             uIMapAlarm.alarmSearch.uISearchButton.click();
         }

         public void VerifyAtAlarmTypeByAtAlarmNoInGrid()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AlarmType"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("AlarmNo"), "Alarm Type").getText(),"verify alarm type appeared in grid");
         }

         public void VerifyAtAlarmTypeInGrid(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("AlarmType"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable,"Alarm Type",rowIndex), "verify alarm type appeared in grid");
         }
         public void VerifyAtAlarmNoRowAppearAsRedColor(int rowIndex)
         {

             verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRow(uIMapAlarm.alarmSearch.uIAlarmSearchTable, rowIndex).getAttribute("class").contains("Red"), "Verify Alarm No row appear as Red color");
         }

         public void SelectGridRowByAtAlarmNo()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("AlarmNo"));
         }

         public void VerifyAtAddress()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Address"),objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("Address")).getText(),"verify address appears in grid");
         }

         public void SelectGridRowByAtAlarmType()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("AlarmType"));
         }

         public void SelectGridRowByAtBusinessName()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("BusinessName"));
         }

         public void EnterAtBusinessOrPersonLastName()
         {
             uIMapAlarm.alarmSearch.uIBusinessOrPersonLastName.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonLastName"));
         }

         public void EnterAtBusinessOrPersonFirstName()
         {
             uIMapAlarm.alarmSearch.uIBusinessOrPersonFirstName.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonFirstName"));
             uIMapAlarm.alarmSearch.uIBusinessOrPersonFirstName.sendKeys(Keys.TAB);
         }

         public void ClickAtAddressInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("Address"));
         }

         public void EnterAtAlarmCompany()
         {
             uIMapAlarm.alarmSearch.uIAlarmCompanyCodeEdit.sendKeys(PoliceData.getAlarmModuleValue("AlarmCompany"));
             uIMapAlarm.alarmSearch.uIAlarmCompanyCodeEdit.sendKeys(Keys.TAB);
         }
         public void SelectGridRowByAtAddress()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("Address"));
         }
         public void EnterAlarmNo(String alarmNo)
         {
             uIMapAlarm.alarmSearch.uIAlarmNo.sendKeys(alarmNo);
         }
         public void SelectGridRowByAlarmNo(String alarmNo)
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, alarmNo);
             Playback.controlReadyThreadWait();
             Playback.pageLoadThreadWait();
         }
         public void ClickRefresh()
         {
             uIMapAlarm.alarmSearch.uIRefreshButton.click();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
         }
         public void clickPrintButton()
         {
             uIMapAlarm.alarmSearch.uIPrintButton.click();
             Playback.pageLoadThreadWait();
             Playback.pageLoadThreadWait();
         }
         public void SelectGridRowByAtAddress1()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("Address1"));
         }
         public String readAlarmNo() 
         {
 			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmSearch.uIAlarmSearchTable, PoliceData.getAlarmModuleValue("Address"), "Alarm#");
 			String alarmNo = gridCell.getText();
 			return alarmNo;

 		}
         public void selectGridRowByActiveAlarmNo(String alarmNo)
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, alarmNo);
         }

		public void enterAtBalanceAmount() {
			Playback.controlReadyThreadWait();
			uIMapAlarm.alarmSearch.uIBalanceAmount.sendKeys(PoliceData.getAlarmModuleValue("BalanceAmount"));			
		}

		public void enterAtTotalYTDOccurrences() {
			Playback.controlReadyThreadWait();
			uIMapAlarm.alarmSearch.uIYTDOccur.sendKeys(PoliceData.getAlarmModuleValue("YTDOccurrences"));
		}

		public void verifyAtBalanceFromGridRow(int rowIndex) {
			Playback.controlReadyThreadWait();
			String balance = objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, "Balance", rowIndex);
			verify.ExpectedValueIsTrue(balance.contains(PoliceData.getAlarmModuleValue("BalanceAmount")));
		}

		public void verifyAtYTDOccurrenceFromGridRow(int rowIndex) {
			Playback.controlReadyThreadWait();
			String ytd = objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmSearch.uIAlarmSearchTable, "YTD Count", rowIndex);
			verify.ExpectedValueIsTrue(ytd.contains(PoliceData.getAlarmModuleValue("YTDOccurrences")));
		}
		public String getRowsCount()
		{
			int rows = objectIdentification.manualIdentify.getGridTableRowsCount(uIMapAlarm.alarmSearch.uIAlarmSearchTable);
			String count = String.valueOf(rows);
			return count;
		}

		public void reloadAlarmSearch()
        {
            objectIdentification.manualIdentify.reloadScreen("Alarm Search");
        }

		 public void verifyAtYTDCountInGrid(int rowIndex)
         {
        	 WebElement gridCell = objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmSearch.uIAlarmSearchTable, "YTD Count", rowIndex);
        	 verify.ExpectedValueIsTrue(gridCell.getText().contains(PoliceData.getAlarmModuleValue("YTDCount")));
         }

		 public void enterAlarmNoByActiveData(String alarmNo)
         {
        	 uIMapAlarm.alarmSearch.uIAlarmNo.sendKeys(alarmNo);
        	 uIMapAlarm.alarmSearch.uIAlarmNo.sendKeys(Keys.TAB);
         }
         
         public void clickBackButton()
         {
        	 uIMapAlarm.alarmSearch.uIBackButton.click();
        	 
         }
         
         public void clickResetButton()
         { 
        	 uIMapAlarm.alarmSearch.uIResetButton.click();
        	 
         }

		public void enterAtBusinessOrPersonNameID() {
			uIMapAlarm.alarmSearch.uIBusinessOrPersonNameIDType.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonNameID").substring(0, 1));
			uIMapAlarm.alarmSearch.uIBusinessOrPersonNameIDType.sendKeys(Keys.TAB);
			uIMapAlarm.alarmSearch.uIBusinessOrPersonNameID.sendKeys(PoliceData.getAlarmModuleValue("BusinessOrPersonNameID").substring(2));
			uIMapAlarm.alarmSearch.uIBusinessOrPersonNameID.sendKeys(Keys.TAB);
		}

		public void verifyNoRecordFoundAcknowlede() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			
		}

		public void clickShowUnregisteredOnlyCheckBox() {
            uIMapAlarm.alarmSearch.uIShowUnregisteredOnlyCheckBox.click();
        }
     }



     public class AlarmCompanySearch
     {

         public void ClickAddNewButton()
         {
             uIMapAlarm.alarmCompanySearch.uIAddNewButton.click();
         }

         public void EnterAtCompanyCode()
         {
             uIMapAlarm.alarmCompanySearch.uICompanyCodeEdit.sendKeys(PoliceData.getAlarmModuleValue("CompanyCode"));
         }

         public void EnterAtCompanyName()
         {
             uIMapAlarm.alarmCompanySearch.uICompanyNameEdit.sendKeys(PoliceData.getAlarmModuleValue("CompanyName"));
         }

         public void ClickSearchButton()
         {
           uIMapAlarm.alarmCompanySearch.uISearchButton.click();        
         }

         public void VerifyAtName(int rowIndex)
         {
           
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Name"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmCompanySearch.uIAlarmCompanySearchTable, "Name", rowIndex).toString(),"verify Name appeared in grid");
         }

         public void VerifyAtCompanyCode(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("CompanyCode"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmCompanySearch.uIAlarmCompanySearchTable,"Company Code",rowIndex).toString(), "verify Company code appeared in grid");
         }

         public void VerifyAtZip(int rowIndex)
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("Zip"), objectIdentification.manualIdentify.getGridCellInnerText(uIMapAlarm.alarmCompanySearch.uIAlarmCompanySearchTable, "Zip",rowIndex).toString(), "verify Zip appeared in grid");
         }
         public void ClickAtCompanyCodeInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.alarmCompanySearch.uIAlarmCompanySearchTable, PoliceData.getAlarmModuleValue("CompanyCode"));
             Playback.controlReadyThreadWait();
         }        
         public void verifyJurisAsPX() 
         {
 			WebElement gridCell1 = objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmCompanySearch.uIAlarmCompanySearchTable, "Juris", 0);
 			String text = gridCell1.getText();
 			verify.ExpectedPropertyValueIsEqual(text, "");
         }

 		public void verifyJurisAsBC() 
 		{
 			WebElement gridCell1 = objectIdentification.manualIdentify.getGridCell(uIMapAlarm.alarmCompanySearch.uIAlarmCompanySearchTable, "Juris", 1);
 			String text = gridCell1.getText();
 			verify.ExpectedPropertyValueIsEqual(text, "BC");
 		}
 		public void selectJurisAsEmpty() {

			new Select(uIMapAlarm.alarmCompanySearch.uIJurisDropdown).selectByIndex(0);
			Playback.controlReadyThreadWait();
		}

     }
     
     public class NameEntry
     {

         public void ClickSaveButton()
         {
             uIMapAlarm.nameEntry.uISaveButton.click();
         }

         public void Verify1018RequiredEntriesAreMissingAckMsg()
         {
             popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
         }

         public void EnterAtBusinessID()
         {
             uIMapAlarm.nameEntry.uIBusinessIDEdit.sendKeys(PoliceData.getAlarmModuleValue("BusinessID"));
         }

         public void EnterAtName()
         {
             uIMapAlarm.nameEntry.uINameEdit.sendKeys(PoliceData.getAlarmModuleValue("Name"));
         }

         public void EnterAtAddress()
         {
             uIMapAlarm.nameEntry.uIAddressEdit.sendKeys(PoliceData.getAlarmModuleValue("Address"));
             uIMapAlarm.nameEntry.uIAddressEdit.sendKeys(Keys.TAB);
         }

         public void Save()
         {
             uIMapAlarm.nameEntry.uISaveButton.click();
             popup.confirm.yes();
         }

         public void Verify1002AdditionSuccessfulMessage()
         {
             verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful", uIMapAlarm.nameEntry.uIBottomLeftSideStatusBar.getText());
         }

         public void Close()
         {
             uIMapAlarm.nameEntry.driver.close();
         }

         public void VerifyBusinessIDExitsAckMsg()
         {
             popup.acknowledge.okWithExpectedMessage("(6040) Already BusinessID Exits");
         }
         public void EnterBusinessIDAs1000()
         {
             uIMapAlarm.nameEntry.uIBusinessIDEdit.sendKeys("1000");
             uIMapAlarm.nameEntry.uIBusinessIDEdit.sendKeys(Keys.TAB);
         }
         public void SelectAtPhoneType1()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.nameEntry.uIPhoneType1Combobox, PoliceData.getAlarmModuleValue("PhoneType"));
                 uIMapAlarm.nameEntry.uIPhoneType1Combobox.sendKeys(Keys.TAB);
         }
         public void SelectAtPhoneType2()
         {
             objectIdentification.manualIdentify.selectDropDownOption(uIMapAlarm.nameEntry.uIPhoneType2Combobox, PoliceData.getAlarmModuleValue("PhoneType"));
             uIMapAlarm.nameEntry.uIPhoneType2Combobox.sendKeys(Keys.TAB);
         }
         public void EnterAtPhone1()
         {
             uIMapAlarm.nameEntry.uIPhoneNumber1Edit.click();
             uIMapAlarm.nameEntry.uIPhoneNumber1Edit.sendKeys(PoliceData.getAlarmModuleValue("Phone1"));
         }
         public void EnterAtPhone2()
         {
             uIMapAlarm.nameEntry.uIPhoneNumber2Edit.click();
             uIMapAlarm.nameEntry.uIPhoneNumber2Edit.sendKeys(PoliceData.getAlarmModuleValue("Phone2"));
         }

     } 

     public class FalseAlarms
     {
         public void ClickSearchButton()
         {
             uIMapAlarm.falseAlarms.uISearchButton.click();
             Playback.controlReadyThreadWait();
         }
         public void VerifyCallNoUsingUniqueRow(String callYear, String callNo)
         {
             verify.ExpectedPropertyValueIsEqual(callYear + "." + callNo, objectIdentification.manualIdentify.getGridCell(uIMapAlarm.falseAlarms.uIFalseAlarmTable,
                 PoliceData.getAlarmModuleValue("Address"), "Call#").getText());
         }
         public void VerifyAlarmNotFoundConfirmMessage()
         {
             verify.ExpectedPropertyValueIsEqual("Alarm not found. Do you want to create an alarm and then process?",
                 uIMapAlarm.falseAlarms.uIAccountNotFoundText.getText());
             uIMapAlarm.falseAlarms.uIYesButton.click();
             Playback.controlReadyThreadWait();
         }
         public void SelectAtAddressInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.falseAlarms.uIFalseAlarmTable, PoliceData.getAlarmModuleValue("Address"));
             Playback.controlReadyThreadWait();
         }
         public void SelectCallNoInGrid(String callYear, String callNo)
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.falseAlarms.uIFalseAlarmTable, callYear + "." + callNo);
             Playback.controlReadyThreadWait();
         }
         public void ClickAtCallNoInGrid()
         {
             objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.falseAlarms.uIFalseAlarmTable, PoliceData.getAlarmModuleValue("CallNo"));
             Playback.controlReadyThreadWait();
         }
         public void ClickRemovedOnlyCheckbox()
         {
             uIMapAlarm.falseAlarms.uIRemovedOnlyCheckbox.click();
             Playback.controlReadyThreadWait();
         }
         public void ClickIncludeProcessedCheckbox()
         {
             uIMapAlarm.falseAlarms.uIIncludeProcessedCheckbox.click();
             Playback.controlReadyThreadWait();
         }
         public void VerifyAlarmUsingCallNo(String alarmNo)
         {
             verify.ExpectedPropertyValueIsEqual(alarmNo, objectIdentification.manualIdentify.getGridCell(uIMapAlarm.falseAlarms.uIFalseAlarmTable,
                 PoliceData.getAlarmModuleValue("CallNo"), "Alarm#").getText());
         }

         public void VerifyReopenConfirmMessage()
         {
           
                 popup.confirm.yesWithExpectedMessage("(9535) Do you want to reopen the false alarm that was removed?");
                 Playback.controlReadyThreadWait();
         }
         
         public void VerifyAtCallNoUsindCADCFS()
         {
             verify.ExpectedPropertyValueIsEqual(PoliceData.getAlarmModuleValue("CallNo"), objectIdentification.manualIdentify.getGridCell(uIMapAlarm.falseAlarms.uIFalseAlarmTable,
                 PoliceData.getAlarmModuleValue("CADCFS"), "Call#").getText());
         }
         public void VerifyStatusUsingCallNo(String status)
         {
             verify.ExpectedPropertyValueIsEqual(status, objectIdentification.manualIdentify.getGridCell(uIMapAlarm.falseAlarms.uIFalseAlarmTable,
                 PoliceData.getAlarmModuleValue("CallNo"), "Status").getText());
         }
         public void VerifyStatusAsNotChargedUsingCallNo()
         {
             verify.ExpectedPropertyValueIsEqual("Not Charged", objectIdentification.manualIdentify.getGridCell(uIMapAlarm.falseAlarms.uIFalseAlarmTable,
                 PoliceData.getAlarmModuleValue("CallNo"), "Status").getText());
         }
         public void alarmNotFoundPopupClickYesToCreate()
         {
        	 verify.ExpectedPropertyValueIsEqual(uIMapAlarm.falseAlarms.uIAlarmNotFoundPopupMsg.getText(),"Alarm not found. Do you want to create an alarm and then process?");
        	 uIMapAlarm.falseAlarms.uIAlarmNotFoundPopupYes.click();
         }
         public void clickDeleteCallNoInGrid(String callNo) 
         {
         objectIdentification.manualIdentify.deleteGridRowByCellInnerTextUsingContainsClass(uIMapAlarm.falseAlarms.uIFalseAlarmTable, callNo);
         }

         public void clickDeleteCallNoInGrid() 
         {
         objectIdentification.manualIdentify.deleteGridRowByCellInnerTextUsingContainsClass(uIMapAlarm.falseAlarms.uIFalseAlarmTable, PoliceData.getAlarmModuleValue("CallNo"));
         }

         public void verifyFalseAlarmCannotBeDeletedAck() 
         {
                   popup.acknowledge.okWithExpectedMessage("(6040) This False Alarm cannot be deleted; It was Processed.");
                   
         }
         public void selectRowByAtAlarmType()
         {
        	 objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.falseAlarms.uIFalseAlarmTable, PoliceData.getAlarmModuleValue("AlarmType"));
         }
         public void selectRowByAtActiveCallNo(String callNo)
         {
        	 objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAlarm.falseAlarms.uIFalseAlarmTable, callNo);
         }
         public void verifyCallNoInGridByActiveData(String callNo) {
 			List<String> gridTableColumnValues = objectIdentification.manualIdentify
 					.getGridTableColumnValues(uIMapAlarm.falseAlarms.uIFalseAlarmTable, "Call#");
 			for (String values : gridTableColumnValues) {
 				if (values.contains(callNo)) {
 					verify.ExpectedValueIsTrue(values.contains(callNo));
 				}

 			}
 		}

 		public void verifyAtCallNoInGrid()
 		{
 			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapAlarm.falseAlarms.uIFalseAlarmTable, PoliceData.getAlarmModuleValue("CallNo"));
 			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(PoliceData.getAlarmModuleValue("CallNo")));
 		}
 		
 		public void clickResetButton()
 		{
 			uIMapAlarm.falseAlarms.uIResetButton.click();
 		}
		public void verifyDoYouWantDeleteConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("Do you want to delete the False Alarm?");
			
		}
     }
     
     public class AlarmYearEndReport
     {
         public void ClickProcessYearEndButton()
         {
             uIMapAlarm.alarmYearEndReport.uIProceedYearEndButton.click();
             Playback.controlReadyThreadWait();
         }
         public void VerifyFutureDateAcknowledgeMessage()
         {
             if (Playback.browserType.contains("Chrome"))
             {
                 popup.acknowledge.ok();
             }
             else
             {
                 String htmlErrorInfo = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();
                 verify.ExpectedValueIsTrue(htmlErrorInfo.contains("(6040) Year End Process should not open until Fiscal Date"));
                 popup.acknowledge.ok();
             }
         }
         public void VerifyFasialRearEndDateAsPreviousDate()
         {
             verify.ExpectedPropertyValueIsEqual(Randomized.getPreviousDateByMonth(5), uIMapAlarm.alarmYearEndReport.uIPopupFiscalYearEndDateEdit.getAttribute("value"));
         }
         public void ClickResetAlarmOccuercesCheckbox()
         {
             uIMapAlarm.alarmYearEndReport.uIPopupResetAlarmOccurencesCheckbox.click();
             Playback.controlReadyThreadWait();
         }
         public void ClickCreateRegistrationFeeInvoiceCheckbox()
         {
             uIMapAlarm.alarmYearEndReport.uIPopupCreateRegistrationFeeCheckbox.click();
         }
         public void clickZeroBalanceAccountsCheckbox()
         {
             uIMapAlarm.alarmYearEndReport.uIPopupZeroBalanceAccountsCheckbox.click();
             Playback.controlReadyThreadWait();
         }
         public void ClickClearAllOpenInvoicesCheckbox()
         {
             uIMapAlarm.alarmYearEndReport.uIPopupClearAllTheOpenInvoicesCheckbox.click();
             Playback.controlReadyThreadWait();
         }
         public void EnterComments()
         {
             uIMapAlarm.alarmYearEndReport.uIPopupCommentEdit.sendKeys(Randomized.randomString(10));
         }

         public void VerifyResetAlarmOccurrencesConfirmMessage()
         {
             Playback.controlReadyThreadWait();
             if (Playback.browserType.contains("Chrome"))
             {
                 String warningMessage = uIMapAlarm.alarmYearEndReport.uIWarningMessageTextView.getText();
                 verify.ExpectedValueIsTrue(warningMessage.contains("Are you sure you want to reset alarm occurrences?"));
                 verify.ExpectedValueIsTrue(warningMessage.contains("Occurrences CANNOT be restored after completion of this option."));
                 uIMapAlarm.alarmYearEndReport.uIOkButton.click();
             }
             else
             {

                 String warningMessage = uIMapAlarm.alarmYearEndReport.uIWarningMessageTextView.getText();
                 verify.ExpectedValueIsTrue(warningMessage.contains("(9519) Are you sure you want to reset alarm occurrences?"));
                 verify.ExpectedValueIsTrue(warningMessage.contains("Occurrences CANNOT be restored after completion of this option."));
                 uIMapAlarm.alarmYearEndReport.uIOkButton.click();
             }
         }
         public void VerifyAlarmTransactionConfirmMessage()
         {
             Playback.controlReadyThreadWait();
             if (Playback.browserType.contains("Chrome"))
             {
                 String warningMessage = uIMapAlarm.alarmYearEndReport.uIWarningMessageTextView.getText();
                 verify.ExpectedValueIsTrue(warningMessage.contains("Are you sure you want to reset alarm Transaction?"));
                 verify.ExpectedValueIsTrue(warningMessage.contains("Transactions CANNOT be restored after completion of this option."));
                 uIMapAlarm.alarmYearEndReport.uIOkButton.click();
             }
             else
             {

                 String warningMessage = uIMapAlarm.alarmYearEndReport.uIWarningMessageTextView.getText();
                 verify.ExpectedValueIsTrue(warningMessage.contains("(9526) Are you sure you want to reset alarm Transaction?"));
                 verify.ExpectedValueIsTrue(warningMessage.contains("Transactions CANNOT be restored after completion of this option."));
                 uIMapAlarm.alarmYearEndReport.uIOkButton.click();
             }
         }
         public void ClickRunYearEndProcessButton()
         {
             uIMapAlarm.alarmYearEndReport.uIPopupRunYearEndProcessButton.click();
             Playback.controlReadyThreadWait();
         }
         public void VerifyRawDataPriorAcknowledgeMessage()
         {
             if (Playback.browserType.contains("Chrome"))
             {
                 popup.acknowledge.ok();
             }
             else
             {
                 String htmlErrorInfo = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();
                 verify.ExpectedValueIsTrue(htmlErrorInfo.contains("(6040) Raw data prior to the fiscal year"));
                 popup.acknowledge.ok();
             }
         }
         public void VerifyYearEndDateAsCurrentDate(int rowIndex)
         {
        	 verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), objectIdentification.manualIdentify.getGridCellInnerText(
                 uIMapAlarm.alarmYearEndReport.uIAlarmYearEndReportTable, "Year End Date", rowIndex));
         }
		public void clickViewReportOnly() {
			uIMapAlarm.alarmYearEndReport.uIPopupViewReportOnlyButton.click();
			
		}

     }
     
     public class AlarmCompanyEntry
     {
         public void selectJurisAsProPhoenix() {
             new Select(uIMapAlarm.alarmCompanyEntry.uIJurisDropdown).selectByVisibleText("PX - ProPhoenix");
             Playback.controlReadyThreadWait();

        }

        public void selectJurisAsBrownCounty() {
             new Select(uIMapAlarm.alarmCompanyEntry.uIJurisDropdown)
                        .selectByVisibleText("BC - Brown County Police Department");

             uIMapAlarm.alarmCompanyEntry.uIJurisDropdown.sendKeys(Keys.TAB);
             Playback.popupThreadWait();

        }

        public void enterAtBusinessID() {
             uIMapAlarm.alarmCompanyEntry.uIBusinessID.clear();
        uIMapAlarm.alarmCompanyEntry.uIBusinessID.sendKeys(PoliceData.getAlarmModuleValue("BusinessID"));
             uIMapAlarm.alarmCompanyEntry.uIName.sendKeys(Keys.TAB);
        }

        public void enterAtBusinessID1() {
        uIMapAlarm.alarmCompanyEntry.uIBusinessID.sendKeys(PoliceData.getAlarmModuleValue("BusinessID1"));
             uIMapAlarm.alarmCompanyEntry.uIName.sendKeys(Keys.TAB);
        }

        public void enterAtName() {
        uIMapAlarm.alarmCompanyEntry.uIName.sendKeys(PoliceData.getAlarmModuleValue("Name"));
             Playback.controlReadyThreadWait();
             uIMapAlarm.alarmCompanyEntry.uIName.sendKeys(Keys.TAB);
        }

        public void enterAtAddress() {
        uIMapAlarm.alarmCompanyEntry.uIAddress.sendKeys(PoliceData.getAlarmModuleValue("Address"));
        }

        public void enterAtPhone1Type() {
        uIMapAlarm.alarmCompanyEntry.uIPhone1Type.sendKeys(PoliceData.getAlarmModuleValue("Phone1"));
             uIMapAlarm.alarmCompanyEntry.uIPhone1Type.sendKeys(Keys.TAB);
        }

        public void enterAtPhone2Type() {
        uIMapAlarm.alarmCompanyEntry.uIPhone2Type.sendKeys(PoliceData.getAlarmModuleValue("Phone2"));
             uIMapAlarm.alarmCompanyEntry.uIPhone2Type.sendKeys(Keys.TAB);
        }

        public void enterAtPhone1() {
        uIMapAlarm.alarmCompanyEntry.uIPhone1Edit.sendKeys(PoliceData.getAlarmModuleValue("PhoneNo1"));
             uIMapAlarm.alarmCompanyEntry.uIPhone1Edit.sendKeys(Keys.TAB);
        }

        public void enterAtPhone2() {
        uIMapAlarm.alarmCompanyEntry.uIPhone2Edit.sendKeys(PoliceData.getAlarmModuleValue("PhoneNo2"));
             uIMapAlarm.alarmCompanyEntry.uIPhone2Edit.sendKeys(Keys.TAB);
        }

        public void enterAtEmail() {
        uIMapAlarm.alarmCompanyEntry.uIEmailEdit.sendKeys(PoliceData.getAlarmModuleValue("Email"));
        }

        public void saveTheScreen() {
             uIMapAlarm.alarmCompanyEntry.uISave.click();
             Playback.gridLoadThreadWait();
             popup.confirm.yes();
        }

        public void verifyAdditionSuccessful() {
             String text = uIMapAlarm.alarmCompanyEntry.uIstatusBar.getText();
             verify.ExpectedPropertyValueIsEqual(text, " 1002 - Addition Successful");
        }

        public void verifyNameType() {
             String IDtype = uIMapAlarm.alarmCompanyEntry.uINameType.getAttribute("value");
             verify.ExpectedPropertyValueIsEqual(IDtype, "Business");
        }

        public void closeTheScreen() {
             uIMapAlarm.alarmCompanyEntry.driver.close();
        }

        public String readNameTypeID() {
             String IDtype = uIMapAlarm.alarmCompanyEntry.uINameType.getAttribute("value");
             char charAt = IDtype.charAt(0);
             String name = uIMapAlarm.alarmCompanyEntry.uINameTypeID.getAttribute("value");
             String id = name.substring(8);
             String nameID = charAt + "-" + id;
             IDtype = charAt + "-" + name;
             return IDtype;
        }

        public void verifyName() {
             String text = uIMapAlarm.alarmCompanyEntry.uIName.getAttribute("value");
             verify.ExpectedPropertyValueIsEqual(text, PoliceData.getAlarmModuleValue("Name"));
        }

        public void verifyPhone1() {
             String phone1old = uIMapAlarm.alarmCompanyEntry.uIPhone1Edit.getAttribute("value");
             String phone1 = phone1old.replaceAll("[^0-9]", "");
             verify.ExpectedPropertyValueIsEqual(phone1, PoliceData.getAlarmModuleValue("PhoneNo1"));
        }

        public void verifyPhone2() {
             String phone2old = uIMapAlarm.alarmCompanyEntry.uIPhone2Edit.getAttribute("value");
             String phone2 = phone2old.replaceAll("[^0-9]", "");
             verify.ExpectedPropertyValueIsEqual(phone2, PoliceData.getAlarmModuleValue("PhoneNo2"));
        }

        public void verifyAddress() {
             String address = uIMapAlarm.alarmCompanyEntry.uIAddress.getAttribute("value");
             verify.ExpectedPropertyValueIsEqual(address, PoliceData.getAlarmModuleValue("Address"));
        }

        public void verifyEmail() {
             String email = uIMapAlarm.alarmCompanyEntry.uIEmailEdit.getAttribute("value");
             verify.ExpectedPropertyValueIsEqual(email, PoliceData.getAlarmModuleValue("Email"));
        }


     }

	
     
}
