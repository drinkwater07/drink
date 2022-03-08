package application;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import application.Popup.Confirm;
import dataAccess.BaseData;
import uIMaps.UIMapDetailWork;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class DetailWork {
	public DetailSearch detailSearch;
    public DetailEntry detailEntry;
    public OfficerPeckingOrderSearch officerPeckingOrderSearch;
    public ReferedToSearch referedToSearch;
    
      public ObjectIdentification objectIdentification= new ObjectIdentification();
	  public UIMapDetailWork uIMapDetailWork = new UIMapDetailWork();   
	  public Popup popup = new Popup();
	  public Confirm confirm = popup.new Confirm();
	  public Popup.Acknowledge acknowledge = popup.new Acknowledge();
	  public Randomized randomized =new Randomized(); 
	  
    public DetailWork() {
    	
    	if (this.detailSearch == null) 
            this.detailSearch = new DetailSearch();
        
        if (this.detailEntry == null)
            this.detailEntry = new DetailEntry();

        if (this.officerPeckingOrderSearch == null)
            this.officerPeckingOrderSearch = new OfficerPeckingOrderSearch();

        if (this.referedToSearch == null)
            this.referedToSearch = new ReferedToSearch();
    }
    
    
    
    
        public  void switchToDetailEntryScreen()
        {
            objectIdentification.windowHandle.switchToWindow("Detail Entry");
            Playback.controlReadyThreadWait();
        }
        public  void switchToDetailSearch()
        {
            objectIdentification.windowHandle.switchToMainWindowScreenTab("DetailWork/frmDetailSrch");
            Playback.controlReadyThreadWait();
        }
        public  void switchToOfficerPFHelpSearch()
        {
            objectIdentification.windowHandle.switchToWindowUsingURL("DtlPeckingOrderSearch");
            Playback.controlReadyThreadWait();
        }
        public  void switchToReferedToSearch()
        {
            objectIdentification.windowHandle.switchToWindowUsingURL("frmReferedToSearch");
            Playback.controlReadyThreadWait();
        }

     
    public class DetailSearch
    {
        public void enterAtDetailNo()
        {
            uIMapDetailWork.detailSearch.uIDetailYearEdit.sendKeys(BaseData.getDetailWorkModuleValue("DetailNo").substring(0,2));
            uIMapDetailWork.detailSearch.uIDetailNumberEdit.sendKeys(BaseData.getDetailWorkModuleValue("DetailNo").substring(3));
            uIMapDetailWork.detailSearch.uIDetailNumberEdit.sendKeys(Keys.TAB);
            Playback.controlReadyThreadWait();
        }
        public void clickNotFilledCheckbox()
        {
            uIMapDetailWork.detailSearch.uINotFilledCheckbox.click();
        }
        public void clickFilledCheckbox()
        {
            uIMapDetailWork.detailSearch.uIFilledCheckbox.click();
        }
        public void clickCompletedBilledCheckbox()
        {
            uIMapDetailWork.detailSearch.uICompletedBilledCheckbox.click();
        }
        public void clickHighRiskCheckbox()
        {
            uIMapDetailWork.detailSearch.uIHighRiskCheckbox.click();
        }
        public void clickSupervisorRequiredCheckbox()
        {
            uIMapDetailWork.detailSearch.uISupervisorRequiredCheckbox.click();
        }
        public void clickPriorityDetailYesRadiobutton()
        {
            uIMapDetailWork.detailSearch.uIPriorityDetailYesRadiobox.click();
        }
        public void clickPriorityDetailNoRadioButton()
        {
            uIMapDetailWork.detailSearch.uIPriorityDetailNoRadiobox.click();
        }
        public void enterAtLocationOfDetail()
        {
            uIMapDetailWork.detailSearch.uILocationOfDetailEdit.sendKeys(BaseData.getDetailWorkModuleValue("Location"));
        }
        public void selectAtTypeOfDetailWork()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapDetailWork.detailSearch.uITypeOfDetailWorkComboBox,
                BaseData.getDetailWorkModuleValue("TypeOfDetailWork"));
        }
        public void clickSearch()
        {
            uIMapDetailWork.detailSearch.uISearchButton.click();
            Playback.controlReadyThreadWait();
        }
        public void verifyAtDetailNo(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("DetailNo"), objectIdentification.manualIdentify.getGridCellInnerText(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, "Detail#", rowIndex));
        }
        public void verifyAtLocationUsingDetailNo()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Location"), objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("DetailNo"), "Location").getText());
        }
        public void verifyAtTypeOfDetailUsingDetailNo()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("TypeOfDetail"), objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("DetailNo"), "Type of Detail").getText());
        }
        public void verifyAtDurationUsingDetailNo()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Duration"), objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("DetailNo"), "Duration").getText());
        }
        public void clickAtDetailNoInGrid()
        {
            objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapDetailWork.detailSearch.uIDetailSearchResultGrid,
                BaseData.getDetailWorkModuleValue("DetailNo"));
            Playback.controlReadyThreadWait();
        }
        public void clickAtTypeOfDetailInGrid()
        {
            objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapDetailWork.detailSearch.uIDetailSearchResultGrid,
                BaseData.getDetailWorkModuleValue("TypeOfDetail"));
            Playback.controlReadyThreadWait();
        }
        public void clickAddNew()
        {
            uIMapDetailWork.detailSearch.uIAddNewButton.click();
            Playback.controlReadyThreadWait();
        }
        public void verifyAtLocationUsingTypeOfDetail()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Location"), objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("TypeOfDetail"), "Location").getText());
        }
        public void verifyStatusAsNotFilledUsingDetailNo()
        {
            verify.ExpectedPropertyValueIsEqual("Not Filled", objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("DetailNo"), "Status").getText());
        }
        public void verifyAtDurationUsingTypeOfDetail()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Duration"), objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("TypeOfDetail"), "Duration").getText());
        }
        public void verifyDateAsCurrentUsingTypeOfDetail()
        {
            verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("TypeOfDetail"), "Date").getText());
        }
        public void verifyRowColorAsRedUsingLocation()
        {
            Playback.controlReadyThreadWait();
            verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapDetailWork.detailSearch.uIDetailSearchResultGrid,
                BaseData.getDetailWorkModuleValue("Location")).getAttribute("class").contains("gridRedColor"));
        }
        public void clickBack()
        {
            uIMapDetailWork.detailSearch.uIBackButton.click();
            Playback.controlReadyThreadWait();
        }
        public void clickReset()
        {
            uIMapDetailWork.detailSearch.uIResetButton.click();
            Playback.controlReadyThreadWait();
        }
        public void verifyRowColorAsBlueUsingLocation()
        {
            Playback.controlReadyThreadWait();
            verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapDetailWork.detailSearch.uIDetailSearchResultGrid,
                BaseData.getDetailWorkModuleValue("Location")).getAttribute("class").contains("gridBlueColor"));
        }
        public void verifyNoRecordFoundAcknowledgeMessage()
        {
        	 popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
//            if (Playback.browserType.equalsIgnoreCase("Chrome"))
//            {
//                popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
//            }
//            else
//                popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
        }
        public void verifyStatusAsCancelledUsingDetailNo()
        {
            verify.ExpectedPropertyValueIsEqual("Cancelled", objectIdentification.manualIdentify.getGridCell(
                uIMapDetailWork.detailSearch.uIDetailSearchResultGrid, BaseData.getDetailWorkModuleValue("DetailNo"), "Status").getText());
        }

         public void verifyRowColorAsGrayUsingDetailNo()
        {
            Playback.controlReadyThreadWait();
            verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapDetailWork.detailSearch.uIDetailSearchResultGrid,
                BaseData.getDetailWorkModuleValue("DetailNo")).getAttribute("class").contains("gridGrayColor"));
        }
         public void clickPrintIcon() {
 			uIMapDetailWork.detailSearch.uIPrintIcon.click();

 		}
        
    }
    public class DetailEntry
    {
    	public DetailRequestedByTab detailRequestedByTab;
        public DetailBillToTab detailBillToTab;
        public DetailOfficersTab detailOfficersTab;
        public DetailStatusUpdateTab detailStatusUpdateTab;
        public DetailFeesTab detailFeesTab;
        public DetailInvoiceTab detailInvoiceTab;
        
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
        }
        public void clickSave()
        {
            uIMapDetailWork.detailEntry.uISaveButton.click();
            Playback.controlReadyThreadWait();
        }
        public void verifyDeailDateTimeAcknowledgeMessage()
        {
            popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - Date & Time of Detail");
        }
        public void enterDateTimeDetailAsCurrentDateTime()
        {
            uIMapDetailWork.detailEntry.uIDateOfDetailEdit.sendKeys(Randomized.getCurrentDate());
            uIMapDetailWork.detailEntry.uITimeOfDetailEdit.click();
            uIMapDetailWork.detailEntry.uITimeOfDetailEdit.sendKeys(Randomized.getCurrentTime("HH:mm"));
        }

        public void verifyDateOfDetailFieldIsEmpty()
        {
            verify.ExpectedValueIsFalse(uIMapDetailWork.detailEntry.uIDateOfDetailEdit.getAttribute("value") == null);
        }

        public void enterAtExpectedDuration()
        {
            uIMapDetailWork.detailEntry.uIExpectedDurationEdit.sendKeys(BaseData.getDetailWorkModuleValue("ExpectedDuration"));
        }

        public void verifyAtExpectedDuration()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("ExpectedDuration"),
                uIMapDetailWork.detailEntry.uIExpectedDurationEdit.getAttribute("value"));
        }

        public void selectAtTypeOfDetailWork()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapDetailWork.detailEntry.uITypeOfDetailWorkComboBox,
                BaseData.getDetailWorkModuleValue("TypeOfDetailWork"));
            uIMapDetailWork.detailEntry.uITypeOfDetailWorkComboBox.sendKeys(Keys.TAB);
        }
        public void enterAtLocationOfDetail()
        {
            uIMapDetailWork.detailEntry.uILocationOfDetailEdit.sendKeys(BaseData.getDetailWorkModuleValue("LocationOfDetail"));
            uIMapDetailWork.detailEntry.uILocationOfDetailVerifyCheckbox.sendKeys(Keys.TAB);
        }

        public void verifyAtLocationOfDetail()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("LocationOfDetail"),
                uIMapDetailWork.detailEntry.uILocationOfDetailEdit.getAttribute("value"));
        }

        public void enterAtNoOfOfficersRequested()
        {
            uIMapDetailWork.detailEntry.uINoOfficersRequestedEdit.sendKeys(BaseData.getDetailWorkModuleValue("NoOfOfficersRequested"));
        }

        public void verifyAtNoOfOfficersRequested()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("NoOfOfficersRequested"),
                uIMapDetailWork.detailEntry.uINoOfficersRequestedEdit.getAttribute("value"));
        }

        public void clickPriorityDetailYesRadiobutton()
        {
            uIMapDetailWork.detailEntry.uIPriorityDetailYesRadiobox.click();
        }
        public void clickHighRiskCheckBox()
        {
            uIMapDetailWork.detailEntry.uIHighRiskCheckbox.click();
        }
        public void clickSupervisorRequiredCheckBox()
        {
            uIMapDetailWork.detailEntry.uISupervisorRequiredCheckbox.click();
        }
        public void clickDetailRequestedByTab()
        {
            uIMapDetailWork.detailEntry.uIDetailRequestedByTab.click();
            Playback.controlReadyThreadWait();
        }
        public void clickBillToTab()
        {
            uIMapDetailWork.detailEntry.uIBillToTab.click();
            Playback.controlReadyThreadWait();
        }
        public void clickOfficersTab()
        {
            uIMapDetailWork.detailEntry.uIOfficersTab.click();
            Playback.controlReadyThreadWait();
        }
        public void clickStatusUpdateTab()
        {
            uIMapDetailWork.detailEntry.uIStatusUpdateTab.click();
            Playback.controlReadyThreadWait();
            objectIdentification.windowHandle.switchToFrame("frmLogHistory");
            Playback.controlReadyThreadWait();
        }
        public void clickAttachmentsTab()
        {
            uIMapDetailWork.detailEntry.uIAttachmentsTab.click();
            Playback.controlReadyThreadWait();
            objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgr");
            Playback.controlReadyThreadWait();
        }
        public void verifyDateTimeRequestAcknowledgeMessage()
        {
            popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - Date & Time of Request");
        }
        public void verifyBillToaAccountAcknowledgeMessage()
        {
            popup.acknowledge.okWithExpectedMessage("(33006) Bill To Account is required");
        }
         public void Save()
        {
            uIMapDetailWork.detailEntry.uISaveButton.click();
            Playback.controlReadyThreadWait();
            popup.confirm.yes();
        }
        public void closeScreen()
         {
                    uIMapDetailWork.detailEntry.driver.close();
          }

        public void verifyStatusAsNotFilled()
        {
            Playback.controlReadyThreadWait();
            verify.ExpectedPropertyValueIsEqual("NOT FILLED", uIMapDetailWork.detailEntry.uIMenuStatusTextView.getText());
        }
        public void verifyCopyButtonEnabled()
        {
            verify.ExpectedValueIsTrue(uIMapDetailWork.detailEntry.uICopyButton.isEnabled());
        }

        public void clickCopyButton()
        {
            uIMapDetailWork.detailEntry.uICopyButton.click();
        }

        public void getExpectedDuration( )
        {
        	
           String expectedDuration = uIMapDetailWork.detailEntry.uIExpectedDurationEdit.getAttribute("value");
           Playback.testContext.setAttribute("expectedDuration", expectedDuration);
        }
        public void verifyStatusAsCompletedBilled()
        {
            Playback.controlReadyThreadWait();
            verify.ExpectedPropertyValueIsEqual("COMPLETED/BILLED", uIMapDetailWork.detailEntry.uIMenuStatusTextView.getText());
        }
        public void clickFeesTab()
        {
            uIMapDetailWork.detailEntry.uIFeesTab.click();
            Playback.controlReadyThreadWait();
            objectIdentification.windowHandle.switchToFrame("frmFees");
            Playback.controlReadyThreadWait();
        }
        public void clickInvoiceTab()
        {
            uIMapDetailWork.detailEntry.uIInvoiceTab.click();
            Playback.controlReadyThreadWait();
        }
        public void clickDetailCancelledCheckbox()
        {
            uIMapDetailWork.detailEntry.uIDetailCancelledCheckbox.click();
            Playback.controlReadyThreadWait();
        }
        public void verifyStatusAsCancelled()
        {
            Playback.controlReadyThreadWait();
            verify.ExpectedPropertyValueIsEqual("CANCELLED", uIMapDetailWork.detailEntry.uIMenuStatusTextView.getText());
        }
		public void verifyCopiedSuccessfullyMessage() {
		String msg=	uIMapDetailWork.detailEntry.uIScreenButtonMessage.getText();
		verify.ExpectedPropertyValueIsEqual(msg, "2528 - Copied successfully");
		}
              

      
        
    }
    public class DetailRequestedByTab
    {
        public void tabDateTimeOfRequested()
        {
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIDateTimeOfRequestEdit.sendKeys(Keys.TAB);
            uIMapDetailWork.detailEntry.detailRequestedByTab.uITimeOfRequestEdit.sendKeys(Keys.TAB);
        }

        public void verifyDateOfRequestFieldIsEmpty()
        {
            verify.ExpectedValueIsFalse(uIMapDetailWork.detailEntry.detailRequestedByTab.
                uIDateTimeOfRequestEdit.getAttribute("value") == null);
        }

        public void tabOfficerTakingRequest()
        {
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIOfficeTakingRequestCodeEdit.sendKeys(Keys.TAB);
        }


        public void verifyOfficerTakingRequestFieldIsEmpty()
        {
            verify.ExpectedValueIsFalse(uIMapDetailWork.detailEntry.detailRequestedByTab.
                uIOfficeTakingRequestCodeEdit.getAttribute("value") == null);
        }


        public void enterAtBusinessNameID()
        {
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIBusinessPersonNameTypeEdit.clear();
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIBusinessPersonNameTypeEdit.sendKeys(BaseData.getDetailWorkModuleValue("BusinessNameID").substring(0, 1));
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIBusinessPersonNameIDEdit.sendKeys(BaseData.getDetailWorkModuleValue("BusinessNameID").substring(2));
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIBusinessPersonNameIDEdit.sendKeys(Keys.TAB);
            Playback.controlReadyThreadWait();
        }


        public void verifyAtBusinessNameID()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("BusinessNameID").substring(0, 1), uIMapDetailWork.detailEntry.detailRequestedByTab.
                uIBusinessPersonNameTypeEdit.getAttribute("value"));
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("BusinessNameID").substring(2), uIMapDetailWork.detailEntry.detailRequestedByTab.
                uIBusinessPersonNameIDEdit.getAttribute("value"));

        }

        public void enterAtContactLastName()
        {
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIContactLastNameEdit.sendKeys(BaseData.getDetailWorkModuleValue("ContactLastName"));
        }
        public void enterAtContactFirstName()
        {
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIContactFirstNameEdit.sendKeys(BaseData.getDetailWorkModuleValue("ContactFirstName"));
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIContactFirstNameEdit.sendKeys(Keys.TAB);
        }
        public void selectName()
        {
            Playback.controlReadyThreadWait();
            //Names.NameSearchHelpWindow.SelectName(); Need TO REMOVE
        }
        public void tabCancelledDateTime()
        {
            uIMapDetailWork.detailEntry.detailRequestedByTab.uICancelledDateEdit.sendKeys(Keys.TAB);
            uIMapDetailWork.detailEntry.detailRequestedByTab.uICancelledTimeEdit.sendKeys(Keys.TAB);
        }
        public void tabBy()
        {
            uIMapDetailWork.detailEntry.detailRequestedByTab.uIByCodeEdit.sendKeys(Keys.TAB);
            Playback.controlReadyThreadWait();
        }

		public void verifyCancellDateAndByFieldsEnabled() {
			verify.ExpectedValueIsTrue(uIMapDetailWork.detailEntry.detailRequestedByTab.uICancelledDateEdit.isDisplayed()); 
			verify.ExpectedValueIsTrue(	 uIMapDetailWork.detailEntry.detailRequestedByTab.uIByCodeEdit.isDisplayed());
		}

		public void verifyCancellDateAndByFieldsNotDispalyed() {
			verify.ExpectedValueIsFalse(uIMapDetailWork.detailEntry.detailRequestedByTab.uICancelledDateEdit.isDisplayed());
			verify.ExpectedValueIsFalse(uIMapDetailWork.detailEntry.detailRequestedByTab.uIByCodeEdit.isDisplayed());
			}
    }
    public class DetailBillToTab
    {
        public void clickSamAsBusinessAccountCheckBox()
        {
            uIMapDetailWork.detailEntry.detailBillToTab.uISameAsBusinessAccountCheckbox.click();
            Playback.controlReadyThreadWait();
        }

        public void verifySamAsBusinessAccountCheckBoxChecked()
        {
            verify.ExpectedValueIsFalse(uIMapDetailWork.detailEntry.detailBillToTab.uISameAsBusinessAccountCheckbox.isSelected());
        }


        public void verifyAtLastNameFirstName()
        {
           verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("LastName"), uIMapDetailWork.detailEntry.detailBillToTab.
               uIBillToAccountLastNameEdit.getAttribute("value"));
           verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("FirstName"), uIMapDetailWork.detailEntry.detailBillToTab.
             uIBillToAccountFirstNameEdit.getAttribute("value"));
        }

        public void verifyAtBillToAccountNameID()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("BillToAccountNameID").substring(0,1), uIMapDetailWork.detailEntry.detailBillToTab
                .uIBillToAccountNameTypeEdit.getAttribute("value"));
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("BillToAccountNameID").substring(2), uIMapDetailWork.detailEntry.detailBillToTab.
                uIBillToAccountNameIDEdit.getAttribute("value"));

        }
            
        public void verifyAtBillToAccountLastName()
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("BillToAccountLastName"), uIMapDetailWork.detailEntry.detailBillToTab.
                uIBillToAccountLastNameEdit.getAttribute("value"));

        }



    }
    public class DetailOfficersTab
    {
        public void tabScheduledFrom()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIScheduledFromDateEdit.sendKeys(Keys.TAB);
            uIMapDetailWork.detailEntry.detailOfficersTab.uIScheduledFromTimeEdit.sendKeys(Keys.TAB);
        }
        public void tabScheduledTo()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIScheduledToDateEdit.sendKeys(Keys.TAB);
            uIMapDetailWork.detailEntry.detailOfficersTab.uIScheduledToEdit.sendKeys(Keys.TAB);
        }
        public void verifyDuration(String duration)
        {
            verify.ExpectedPropertyValueIsEqual(duration, uIMapDetailWork.detailEntry.detailOfficersTab.uIDurationTextView.getAttribute("value"));
        }
        public void tabOfficerPF()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIOfficerPFCodeEdit.sendKeys(Keys.TAB);
            Playback.controlReadyThreadWait();
        }
        public void verifyHigherPriorityDetailAcknowledgeMessage()
        {
            Playback.controlReadyThreadWait();
            popup.acknowledge.okWithExpectedMessage("(33000) Please enter High Priority Detail before entering Low Priority Detail");
        }
        public void clickOfficerPFLookup()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIOfficerPFLookupButton.click();
            Playback.controlReadyThreadWait();
        }
        public void clickReferredToPFLookup()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIReferredToLookupButton.click();
            Playback.controlReadyThreadWait();
        }
        public void verifyAtOfficer(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Officer"), objectIdentification.manualIdentify.getGridCellInnerText(
                uIMapDetailWork.detailEntry.detailOfficersTab.uIDetailOfficerTabResultGrid, "Officer", rowIndex));
        }
        public void verifyAtOfficer1(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Officer1"), objectIdentification.manualIdentify.getGridCellInnerText(
                uIMapDetailWork.detailEntry.detailOfficersTab.uIDetailOfficerTabResultGrid, "Officer", rowIndex));
        }
        public void clickAtOfficerInGrid()
        {
            objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapDetailWork.detailEntry.detailOfficersTab.uIDetailOfficerTabResultGrid,
                BaseData.getDetailWorkModuleValue("Officer"));
        }
        public void verifyReferedToFieldDisabled()
        {
            verify.ExpectedValueIsTrue(Boolean.parseBoolean(uIMapDetailWork.detailEntry.detailOfficersTab.uIReferredToCodeEdit.getAttribute("disabled")));
        }
        public void tabDateFrom()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIDateFromEdit.sendKeys(Keys.TAB);
            uIMapDetailWork.detailEntry.detailOfficersTab.uITimeFromEdit.sendKeys(Keys.TAB);
        }
        public void selectAtRadeCode()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapDetailWork.detailEntry.detailOfficersTab.uIRateCodeComboBox,
                BaseData.getDetailWorkModuleValue("RateCode"));
            uIMapDetailWork.detailEntry.detailOfficersTab.uIRateCodeComboBox.sendKeys(Keys.TAB);
        }
        public void enterAtAmountToPaid()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIAmountToBePaidEdit.sendKeys(BaseData.getDetailWorkModuleValue("AmountToPaid"));
        }
         public void enterAtAmountToBilled()
        {
            uIMapDetailWork.detailEntry.detailOfficersTab.uIAmountToBeBilledEdit.sendKeys(BaseData.getDetailWorkModuleValue("AmountToBilled"));
        }
        public void clickAddButton()
         {
             uIMapDetailWork.detailEntry.detailOfficersTab.uIAddButton.click();
             Playback.controlReadyThreadWait();
         }
        public void verifyAtRateCode(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("RateCode"), objectIdentification.manualIdentify.getGridCellInnerText(
                uIMapDetailWork.detailEntry.detailOfficersTab.uIDetailOfficerTabResultGrid, "Rate Code", rowIndex));
        }
		public void verifyDurationLabelIsCustomField() {
			String cssValue = uIMapDetailWork.detailEntry.detailOfficersTab.uIDurationLabel
					.getCssValue("text-decoration");
			verify.ExpectedValueIsTrue(cssValue.contains("underline"));
		}

		public void verifyActualWorkedHoursLabelIsCustomField() {
			String cssValue = uIMapDetailWork.detailEntry.detailOfficersTab.uIActualWorkedHourLabel
					.getCssValue("text-decoration");
			verify.ExpectedValueIsTrue(cssValue.contains("underline"));
		}

		public void clickOnDurationLabel() {
			uIMapDetailWork.detailEntry.detailOfficersTab.uIDurationLabel.click();
		}

		public void clickOnActualWorkedHoursLabel() {
			uIMapDetailWork.detailEntry.detailOfficersTab.uIActualWorkedHourLabel.click();
		}

		public void verifyDurationFieldLabelNameChangedAsCustomName() {
			String text = uIMapDetailWork.detailEntry.detailOfficersTab.uIDurationLabel.getText();
			verify.ExpectedPropertyValueIsEqual(text, BaseData.getDetailWorkModuleValue("CustomName"));
		}

		public void verifyActualWorkedHoursFieldLabelNameChangedAsCustomName1() {
			String text = uIMapDetailWork.detailEntry.detailOfficersTab.uIActualWorkedHourLabel.getText();
			verify.ExpectedPropertyValueIsEqual(text, BaseData.getDetailWorkModuleValue("CustomName1"));
		}
    }
    public class DetailStatusUpdateTab
    {

        public void tabUpdateDateTime()
        {
            uIMapDetailWork.detailEntry.detailStatusUpdateTab.uIUpdateDateEdit.sendKeys(Keys.TAB);
            uIMapDetailWork.detailEntry.detailStatusUpdateTab.uIUpdateTimeEdit.sendKeys(Keys.TAB);
        }
        public void tabUpdateBy()
        {
            uIMapDetailWork.detailEntry.detailStatusUpdateTab.uIUpdateByEdit.sendKeys(Keys.TAB);
        }
        public void enterComments()
        {
            uIMapDetailWork.detailEntry.detailStatusUpdateTab.uICommentsEdit.sendKeys(Randomized.randomString(100));
        }
        public void enterAtComments()
        {
            uIMapDetailWork.detailEntry.detailStatusUpdateTab.uICommentsEdit.sendKeys(BaseData.getDetailWorkModuleValue("Comments"));
        }
        public void clickSaveButton()
        {
            uIMapDetailWork.detailEntry.detailStatusUpdateTab.uISaveButton.click();
            Playback.controlReadyThreadWait();
            Playback.controlReadyThreadWait();
        }
        public void verifyAtCommentsInListGrid()
        {
            verify.ExpectedValueIsTrue(uIMapDetailWork.detailEntry.detailStatusUpdateTab.uIStatusUpdateTabTable.getText().contains(
                BaseData.getDetailWorkModuleValue("Comments")), "Verify Added Comments show in grid");
        }      
        public void verifyDateAsCurrentDateListGrid()
        {
            verify.ExpectedValueIsTrue(uIMapDetailWork.detailEntry.detailStatusUpdateTab.uIStatusUpdateTabTable.getText().contains(
                Randomized.getCurrentDate()), "Verify Added Comments Date shows in grid");
        }
    }
    public class DetailFeesTab
    {
        public void selectItemCode()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapDetailWork.detailEntry.detailFeesTab.uIItemCodeComboBox,
                BaseData.getDetailWorkModuleValue("ItemCode"));
            uIMapDetailWork.detailEntry.detailFeesTab.uIItemCodeComboBox.sendKeys(Keys.TAB);
        }
        public void selectItemCode1()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapDetailWork.detailEntry.detailFeesTab.uIItemCodeComboBox,
                BaseData.getDetailWorkModuleValue("ItemCode1"));
            uIMapDetailWork.detailEntry.detailFeesTab.uIItemCodeComboBox.sendKeys(Keys.TAB);
        }
        public void enterConditionsNotes()
        {
            uIMapDetailWork.detailEntry.detailFeesTab.uIConditionNotesEdit.sendKeys(Randomized.randomString(50));
        }
        public void clickAddButton()
        {
            uIMapDetailWork.detailEntry.detailFeesTab.uIAddButton.click();
            Playback.controlReadyThreadWait();
        }
        public void clickReceivePaymentButton()
        {
            uIMapDetailWork.detailEntry.detailFeesTab.uIReceivePaymentButton.click();
            Playback.controlReadyThreadWait();
        }
        public void clickPrintContionsNotesCheckbox()
        {
            uIMapDetailWork.detailEntry.detailFeesTab.uIPrintConditionsNotesCheckbox.click();
        }
        public void verifyPrintCheckboxesChecked(int rowCount)
        {
            WebElement PrintIsChecked = objectIdentification.manualIdentify.getGridTableRow(uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, rowCount).findElement(By.tagName("img"));
            verify.ExpectedValueIsTrue(PrintIsChecked.getAttribute("alt").contains("Checked"));
        }
        public void verifyAtItemCode(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("ItemCode"), objectIdentification.manualIdentify.getGridCellInnerText
                (uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, "Item Code", rowIndex));
        }
        public void verifyAtItemCodeDescription(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Description"), objectIdentification.manualIdentify.getGridCellInnerText
                (uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, "Description", rowIndex));
        }
        public void verifyAtItemCodeDescription1(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Description1"), objectIdentification.manualIdentify.getGridCellInnerText
                (uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, "Description1", rowIndex));
        }
        public void verifyAtItemCode1(int rowIndex)
       {
           verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("ItemCode1"), objectIdentification.manualIdentify.getGridCellInnerText
               (uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, "Item Code", rowIndex));
       }
        public void saveTab()
       {
           uIMapDetailWork.detailEntry.detailFeesTab.uISaveButton.click();
           Playback.controlReadyThreadWait();
           popup.confirm.yes();
       }
        public String getBalanceAmount()
        {
           String balanceAmount = uIMapDetailWork.detailEntry.detailFeesTab.uIBalanceInvoiceAmountEdit.getAttribute("value");
           return balanceAmount;
        }
        public void verifyBalanceInvoiceAmountAs0()
        {
            verify.ExpectedValueIsTrue(uIMapDetailWork.detailEntry.detailFeesTab.uIBalanceInvoiceAmountEdit.getAttribute("value").contains("0.00"));
        }
        public void selectAtItemCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapDetailWork.detailEntry.detailFeesTab.uIItemCodeComboBox,
					BaseData.getDetailWorkModuleValue("ItemCode"));
			uIMapDetailWork.detailEntry.detailFeesTab.uIItemCodeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtQty(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("Qty") + ".00",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, "Qty", rowIndex));
		}

		public void verifyAtRate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("$" + BaseData.getDetailWorkModuleValue("Rate"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, "Rate", rowIndex));
		}

		public void verifyAtAmount(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("$" + BaseData.getDetailWorkModuleValue("Amount"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapDetailWork.detailEntry.detailFeesTab.uIFeesTabResultGrid, "Amount", rowIndex));
		}
    }
    public class DetailInvoiceTab
    {
        public void selectAtInvoiceType()
        {
            objectIdentification.manualIdentify.selectDropDownOption(uIMapDetailWork.detailEntry.detailInvoiceTab.uIInvoiceTypeComboBox,
                BaseData.getDetailWorkModuleValue("InvoiceType"));
        }
        public void clickSearch()
        {
            uIMapDetailWork.detailEntry.detailInvoiceTab.uISearchButton.click();
            Playback.controlReadyThreadWait();
        }
        public void clickAtInvoiceTypeInGrid()
        {
            objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapDetailWork.detailEntry.detailInvoiceTab.uIInvoiceTabResultGrid,
                BaseData.getDetailWorkModuleValue("InvoiceType"));
            Playback.controlReadyThreadWait();
        }
        public void verifyAtInvoiceTypeInGrid(int rowIndex)
        {
            verify.ExpectedPropertyValueIsEqual(BaseData.getDetailWorkModuleValue("InvoiceType"), objectIdentification.manualIdentify.getGridCellInnerText(
                uIMapDetailWork.detailEntry.detailInvoiceTab.uIInvoiceTabResultGrid, "Invoice Type", rowIndex));
        }
    }
    public class OfficerPeckingOrderSearch
    {
        public void clickAtPFNoUsingCheckbox()
        {
            objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapDetailWork.officerPeckingOrderSearch.uIBillingPFResultGrid,
                BaseData.getDetailWorkModuleValue("PFNo"));            
        }
        public void clickAddTheSelectedPF()
        {
            uIMapDetailWork.officerPeckingOrderSearch.uIAddTheSelectedPFButton.click();
            Playback.controlReadyThreadWait();
        }
    }
    public class ReferedToSearch
    {
        public void clickAtFullNameInGrid()
        {
            objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(uIMapDetailWork.referedToSearch.uIReferedToSearchResultGrid,
                BaseData.getDetailWorkModuleValue("FullName"));
            Playback.controlReadyThreadWait();
        }
        public void clickAddSelectedPFtoListbutton()
        {
        	uIMapDetailWork.referedToSearch.uIAddTheSelectedPFButton.click();
        }
    }


}
