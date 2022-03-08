package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataAccess.PoliceData;
import uIMaps.UIMapCoroner;
import uIMaps.UIMapNames;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;


	
	public class Coroner {

		
	    public ObjectIdentification objectIdentification = new ObjectIdentification();
	    
	    public UIMapNames uIMapNames = new UIMapNames();
	    public Popup popup = new Popup();
	    public UIMapPopup uIMapPopup = new UIMapPopup();
	    public UIMapCoroner uIMapCoroner = new UIMapCoroner();
	    public Loader loader = new Loader();
	    public Names names = new Names();
	    public CoronerCaseSearch coronerCaseSearch;
	    public CoronerEvidenceSearch coronerEvidenceSearch;
		public CoronerCaseEntry coronerCaseEntry;
		public CoronerReview coronerReview;
		public CoronerEfforts coronerEfforts;
		public CoronerCaseReportEntry coronerCaseReportEntry;
		public CoronerEvidenceEntry coronerEvidenceEntry;
		public CoronerEvidenceHistory coronerEvidenceHistory;
	   
	    
	    public Coroner()
	    {
	           if (coronerCaseSearch == null)
	        	   coronerCaseSearch = new CoronerCaseSearch();
	           
	           if (this.coronerCaseEntry == null)
	   			this.coronerCaseEntry = new CoronerCaseEntry();
	   		
	   		if (this.coronerReview == null)
	   			this.coronerReview = new CoronerReview();

	   		if (this.coronerEfforts == null)
	   			this.coronerEfforts = new CoronerEfforts();
	   		
	   		if (this.coronerCaseReportEntry == null)
	   			this.coronerCaseReportEntry = new CoronerCaseReportEntry();

	   		if (this.coronerEvidenceEntry == null)
	   			this.coronerEvidenceEntry = new CoronerEvidenceEntry();
	   		
	   		if (this.coronerEvidenceSearch == null)
	   			this.coronerEvidenceSearch = new CoronerEvidenceSearch();
	   		
	   		if (this.coronerEvidenceHistory == null)
	   			this.coronerEvidenceHistory = new CoronerEvidenceHistory();
	        
	    }
	    
	    
	    public void Reset() {
	    	uIMapCoroner = null;
	           uIMapPopup = null;
	           uIMapNames = null;
	    }
	    
	    
	   
	    public void switchToCoronerCaseEntry() {
	    	objectIdentification.windowHandle.switchToWindow("Coroner Case Entry");
	           Playback.controlReadyThreadWait();
		}
	    public void switchToCoronerReview() {
	    	objectIdentification.windowHandle.switchToWindow("Coroner Review");
	           Playback.controlReadyThreadWait();
		}
	    public void switchToCoronerEfforts() {
	    	objectIdentification.windowHandle.switchToWindow("Coroner Efforts");
	           Playback.controlReadyThreadWait();
		}
	    public void switchToCoronerCaseReportsEntry() {
	    	objectIdentification.windowHandle.switchToWindowUsingURL("Coroner/frmCorRptMain.aspx?");
	           Playback.controlReadyThreadWait();
		}
	    public void switchToCoronerEvidenceHistory() {
	    	objectIdentification.windowHandle.switchToWindowUsingURL("frmCorEvidLocHistory");
	           Playback.controlReadyThreadWait();
		}
	    public void switchToCoronerEvidenceEntry() {
	    	objectIdentification.windowHandle.switchToWindow("Coroner Evidence Entry");
	           Playback.controlReadyThreadWait();
		}
	    public void switchToCoronerCaseSearchScreen()
	    {
	           objectIdentification.windowHandle.switchToMainWindowScreenTab("Coroner Case Search");
	           Playback.controlReadyThreadWait();
	    }
	    public void switchToCoronerEvidenceSearchScreen()
	    {
	           objectIdentification.windowHandle.switchToMainWindowScreenTab("Coroner Evidence Search");
	           Playback.controlReadyThreadWait();
	    }
	    	public void switchToCoronerSearchHelpWindow() {																					//Added by Abi														
			objectIdentification.windowHandle.switchToWindow("Coroner Case Search - 6301");
		}

		public class CoronerCaseSearch
		{

			public void clickAddNew() {
				uIMapCoroner.coronerCaseSearch.uIAddNewButton.click();
				 Playback.controlReadyThreadWait();
				
			}

			public void enterAtInvestNo() {
				 Playback.controlReadyThreadWait();
				uIMapCoroner.coronerCaseSearch.uIInvestYearEdit.sendKeys(PoliceData.getCoronerModuleValue("InvestNo").substring(0, 2));
				uIMapCoroner.coronerCaseSearch.uIInvestNoEdit.sendKeys(PoliceData.getCoronerModuleValue("InvestNo").substring(3));
				uIMapCoroner.coronerCaseSearch.uIInvestNoEdit.sendKeys(Keys.TAB);
			}
			public void clickOnSearch() {
				uIMapCoroner.coronerCaseSearch.uISearchButton.click();
				 Playback.gridLoadThreadWait();
				
			}
			public void enterAtAddressOfDeath() {
				uIMapCoroner.coronerCaseSearch.uIAddressOfDeath.sendKeys(PoliceData.getCoronerModuleValue("LocationOfDeath"));
				uIMapCoroner.coronerCaseSearch.uIAddressOfDeath.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void selectAtCauseOfDeath() {
				uIMapCoroner.coronerCaseSearch.uICauseOfDeathInput.click();
				objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(uIMapCoroner.coronerCaseSearch.uICauseOfDeathCombobox, PoliceData.getCoronerModuleValue("CauseOfDeath"));
				
			}
			
			public void selectAtCaseStatus() {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerCaseSearch.uIStatusDropDown, PoliceData.getCoronerModuleValue("CaseStatus"));
			}

			public void selectGridRowByInvestNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCoroner.coronerCaseSearch.uICaseSearchTable, PoliceData.getCoronerModuleValue("InvestNo"));
				 Playback.controlReadyThreadWait();
				
			}
			public void selectGridRowByName() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCoroner.coronerCaseSearch.uICaseSearchTable, PoliceData.getCoronerModuleValue("Name"));
					 Playback.controlReadyThreadWait();
					
				}
			public void verifyNameIntheGridByLatNameFistName(int rowIndex)
			{
			String name =PoliceData.getRecordsModuleValue("LastName")+","+" "+PoliceData.getRecordsModuleValue("FirstName");
			verify.ExpectedPropertyValueIsEqual(name,
	                objectIdentification.manualIdentify.getGridCellInnerText(uIMapCoroner.coronerCaseSearch.uICaseSearchTable,
	                "Deceased Name", rowIndex));

			}
			public void verifyNameIntheGrid(int rowIndex)
			{
			String name =PoliceData.getRecordsModuleValue("Name");
			verify.ExpectedPropertyValueIsEqual(name,
	                objectIdentification.manualIdentify.getGridCellInnerText(uIMapCoroner.coronerCaseSearch.uICaseSearchTable,
	                "Deceased Name", rowIndex));

			}
			public void verifyAtCaseStatus(int rowIndex)
			{
			String status =PoliceData.getRecordsModuleValue("CaseStatus");
			verify.ExpectedPropertyValueIsEqual(status,
	                objectIdentification.manualIdentify.getGridCellInnerText(uIMapCoroner.coronerCaseSearch.uICaseSearchTable,
	                "Status", rowIndex));

			}

			public void enterAtNameID() {
				 Playback.controlReadyThreadWait();
					uIMapCoroner.coronerCaseSearch.uINameType.sendKeys(PoliceData.getCoronerModuleValue("NameID").substring(0, 2));
					uIMapCoroner.coronerCaseSearch.uINameIDEdit.sendKeys(PoliceData.getCoronerModuleValue("NameID").substring(3));
					uIMapCoroner.coronerCaseSearch.uINameIDEdit.sendKeys(Keys.TAB);
			}
			public void close() {
				uIMapCoroner.coronerCaseSearch.driver.close();
			}
		}
		
		public class CoronerEvidenceSearch
		{

			public void clickAddNew() {
				uIMapCoroner.coronerEvidenceSearch.uIAddNewButton.click();
				 Playback.controlReadyThreadWait();
				
			}

			public void enterAtInvestNo() {
				 Playback.controlReadyThreadWait();
				uIMapCoroner.coronerEvidenceSearch.uIInvestYearEdit.sendKeys(PoliceData.getCoronerModuleValue("InvestNo").substring(0, 2));
				uIMapCoroner.coronerEvidenceSearch.uIInvestNoEdit.sendKeys(PoliceData.getCoronerModuleValue("InvestNo").substring(3));
				uIMapCoroner.coronerEvidenceSearch.uIInvestNoEdit.sendKeys(Keys.TAB);
			}
			
			public void enterAtFromEvidenceNo() {
				 Playback.controlReadyThreadWait();
				uIMapCoroner.coronerEvidenceSearch.uIEvidenceYearFrom.sendKeys(PoliceData.getCoronerModuleValue("EvidenceNo").substring(0, 2));
				uIMapCoroner.coronerEvidenceSearch.uIEvidenceNoFrom.sendKeys(PoliceData.getCoronerModuleValue("EvidenceNo").substring(3,9));
				uIMapCoroner.coronerEvidenceSearch.uIEvidenceSeqFrom.sendKeys(PoliceData.getCoronerModuleValue("EvidenceNo").substring(10));
				uIMapCoroner.coronerEvidenceSearch.uIInvestNoEdit.sendKeys(Keys.TAB);
			}
			public void enterAtToEvidenceNo() {
				 Playback.controlReadyThreadWait();
				uIMapCoroner.coronerEvidenceSearch.uIEvidenceYearTo.sendKeys(PoliceData.getCoronerModuleValue("EvidenceNo").substring(0, 2));
				uIMapCoroner.coronerEvidenceSearch.uIEvidenceNoTo.sendKeys(PoliceData.getCoronerModuleValue("EvidenceNo").substring(3,9));
				uIMapCoroner.coronerEvidenceSearch.uIEvidenceSeqTo.sendKeys(PoliceData.getCoronerModuleValue("EvidenceNo").substring(10));
				uIMapCoroner.coronerEvidenceSearch.uIInvestNoEdit.sendKeys(Keys.TAB);
			}
			public void clickOnSearch() {
				uIMapCoroner.coronerEvidenceSearch.uISearchButton.click();
				 Playback.gridLoadThreadWait();
				
			}
			
			public void selectAtCaseStatus() {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceSearch.uIStatusDropDown, PoliceData.getCoronerModuleValue("CaseStatus"));
			}

			public void selectGridRowByInvestNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCoroner.coronerEvidenceSearch.uIEvidenceSearchTable, PoliceData.getCoronerModuleValue("InvestNo"));
				 Playback.controlReadyThreadWait();
				
			}
			public void selectGridRowByEvidenceNo(String EvidenceNo) {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCoroner.coronerEvidenceSearch.uIEvidenceSearchTable, EvidenceNo);
					 Playback.controlReadyThreadWait();
					
				}
			public void selectGridRowByEvidenceNo() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCoroner.coronerEvidenceSearch.uIEvidenceSearchTable, PoliceData.getCoronerModuleValue("EvidenceNo"));
					 Playback.controlReadyThreadWait();
					
				}
			public void selectGridRowByName() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCoroner.coronerEvidenceSearch.uIEvidenceSearchTable, PoliceData.getCoronerModuleValue("Name"));
					 Playback.controlReadyThreadWait();
					
				}
			public void verifyNameIntheGrid(int rowIndex)
			{
			String name =PoliceData.getRecordsModuleValue("LastName")+","+" "+PoliceData.getRecordsModuleValue("FirstName");
			verify.ExpectedPropertyValueIsEqual(name,
	                objectIdentification.manualIdentify.getGridCellInnerText(uIMapCoroner.coronerEvidenceSearch.uIEvidenceSearchTable,
	                "Deceased Name", rowIndex));

			}
			public void verifyAtCaseStatus(int rowIndex)
			{
			String status =PoliceData.getRecordsModuleValue("CaseStatus");
			verify.ExpectedPropertyValueIsEqual(status,
	                objectIdentification.manualIdentify.getGridCellInnerText(uIMapCoroner.coronerEvidenceSearch.uIEvidenceSearchTable,
	                "Status", rowIndex));

			}

			public void selectAtReason() {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceSearch.uIReasonDropDown, PoliceData.getCoronerModuleValue("Reason"));
				
			}

		}
		public class CoronerCaseEntry
		{
			public CoronerCaseEntryMainTab coronerCaseEntryMainTab;
			public CoronerCaseEntryNamesTab coronerCaseEntryNamesTab;
			public CoronerCaseEntryReviewTab coronerCaseEntryReviewTab;
			public CoronerCaseEntryEffortsTab coronerCaseEntryEffortsTab;
			public CoronerCaseEntryReportsTab coronerCaseEntryReportsTab;
			public CoronerCaseEntryEvidenceTab coronerCaseEntryEvidenceTab;
			public AttachmentsTab attachmentsTab;
			
			public CoronerCaseEntry()
			{
			if (this.coronerCaseEntryMainTab == null)
				this.coronerCaseEntryMainTab = new CoronerCaseEntryMainTab();
			if (this.coronerCaseEntryNamesTab == null)
				this.coronerCaseEntryNamesTab = new CoronerCaseEntryNamesTab();
			if (this.coronerCaseEntryReviewTab == null)
				this.coronerCaseEntryReviewTab = new CoronerCaseEntryReviewTab();
			if (this.coronerCaseEntryEffortsTab == null)
				this.coronerCaseEntryEffortsTab = new CoronerCaseEntryEffortsTab();
			if (this.coronerCaseEntryReportsTab == null)
				this.coronerCaseEntryReportsTab = new CoronerCaseEntryReportsTab();
			if (this.coronerCaseEntryEvidenceTab == null)
				this.coronerCaseEntryEvidenceTab = new CoronerCaseEntryEvidenceTab();
			if (this.attachmentsTab == null)
				this.attachmentsTab =   objectIdentification.new AttachmentsTab();
			
			
			}
			
		
			public void enterAtRMSCaseNo() {
				uIMapCoroner.coronerCaseEntry.uIRMSCaseYear.sendKeys(PoliceData.getCoronerModuleValue("RMSCaseNo").substring(0, 2));
				uIMapCoroner.coronerCaseEntry.uIRMSCaseNo.sendKeys(PoliceData.getCoronerModuleValue("RMSCaseNo").substring(3));
				uIMapCoroner.coronerCaseEntry.uIRMSCaseNo.sendKeys(Keys.TAB);
				 Playback.controlReadyThreadWait();
			}
			public void clickDODUkownCheckBox() {
				if(!uIMapCoroner.coronerCaseEntry.uIDodUknownCheckbox.isSelected())
				uIMapCoroner.coronerCaseEntry.uIDodUknownCheckbox.click();
				
			}
			public void enterAtNameID() {
				 Playback.controlReadyThreadWait();
				uIMapCoroner.coronerCaseEntry.uINameType.sendKeys(PoliceData.getCoronerModuleValue("NameID").substring(0, 1));
				uIMapCoroner.coronerCaseEntry.uINameIDEdit.sendKeys(PoliceData.getCoronerModuleValue("NameID").substring(2));
				uIMapCoroner.coronerCaseEntry.uINameIDEdit.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
				 Playback.controlReadyThreadWait();
			}
			public void verifyAtSex() {
				
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("Sex"), uIMapCoroner.coronerCaseEntry.uISex.getText());
			}
			public void clickOnReviewTab() {
				uIMapCoroner.coronerCaseEntry.uIReviewTab.click();
				
			}
			public void clickOnEffortsTab() {
				uIMapCoroner.coronerCaseEntry.uIEffortsTab.click();
				
			}
			public void verifyMainTabAsBlueColour() {
			String clr=	uIMapCoroner.coronerCaseEntry.uIMainTab.getCssValue("color");
				verify.ExpectedValueIsTrue(clr.contains("blue"));
			}
			public void verifyNamesTabAsBlueColour() {
				String blue="rgba(0, 0, 255, 1)";
				String clr=	uIMapCoroner.coronerCaseEntry.uINamesTab.getCssValue("color");
				verify.ExpectedValueIsTrue(clr.contains(blue));
			}
			public void verifyReviewTabAsBlueColour() {
				String blue="rgba(0, 0, 255, 1)";
				String clr=	uIMapCoroner.coronerCaseEntry.uIReviewTab.getCssValue("color");
				verify.ExpectedValueIsTrue(clr.contains(blue));
			}
			public void verifyEffortTabAsBlueColour() {
				String blue="rgba(0, 0, 255, 1)";
				String clr=	uIMapCoroner.coronerCaseEntry.uIEffortsTab.getCssValue("color");
				verify.ExpectedValueIsTrue(clr.contains(blue));
			}
			public void verifyReportTabAsBlueColour() {
				String blue="rgba(0, 0, 255, 1)";
				String clr=	uIMapCoroner.coronerCaseEntry.uIReportsTab.getCssValue("color");
				verify.ExpectedValueIsTrue(clr.contains(blue));
			}
			
			public void clickOnNamesTab() {
				uIMapCoroner.coronerCaseEntry.uINamesTab.click();
				Playback.controlReadyThreadWait();
				objectIdentification.windowHandle.switchToFrame("frmCorName.aspx");
				Playback.controlReadyThreadWait();
				
			}
			public void clickOnReportsTab() {
				uIMapCoroner.coronerCaseEntry.uIReportsTab.click();
				objectIdentification.windowHandle.switchToFrame("frmCoronerReports");
				Playback.pageLoadThreadWait();
				
			}
			public void clickOnAttachmentsTab() {
				uIMapCoroner.coronerCaseEntry.uIAttachmentTab.click();
				Playback.threadWait(3000);
				objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
				Playback.pageLoadThreadWait();
			}
			
			public void clickOnMainTab() {
				uIMapCoroner.coronerCaseEntry.uIMainTab.click();
				
			}
			public void clickOnEvidenceTab() {
				uIMapCoroner.coronerCaseEntry.uIEvidenceTab.click();
				objectIdentification.windowHandle.switchToFrame("frmCorEvidSrch");
				Playback.pageLoadThreadWait();
			}
			public void verifyAtAge() {
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("Age"), uIMapCoroner.coronerCaseEntry.uIAge.getText());
				
			}

			public void verifyAtAddress() {
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("Address"), uIMapCoroner.coronerCaseEntry.uIAddress.getText());
				
			}
			
			public void save() {
				uIMapCoroner.coronerCaseEntry.uISaveButton.click();
				popup.confirm.yes();
				
			}

			public void saveNClose() {
				uIMapCoroner.coronerCaseEntry.uISaveNCloseButton.click();
				popup.confirm.yes();
			}

			public void clickSave() {
				uIMapCoroner.coronerCaseEntry.uISaveButton.click();
				
			}

			public void clickSaveNClose() {
				uIMapCoroner.coronerCaseEntry.uISaveNCloseButton.click();
			
			}
			
			public String readInvestNo()
			{
			String year =	uIMapCoroner.coronerCaseEntry.uICoronerInvestYear.getAttribute("value");
			String no =		uIMapCoroner.coronerCaseEntry.uICoronerInvestNo.getAttribute("value");
				String InvestNo = year+"-"+no;
				return InvestNo;
			}
			public String readDateOfDeath()
			{
			String dateOfDeath =	uIMapCoroner.coronerCaseEntry.uIDateofDeath.getAttribute("value");
				return dateOfDeath;
			}
			public void verifyInvestNoGenerated() {
				String InvestNo =readInvestNo();
				verify.ExpectedValueIsFalse(InvestNo.contains("null"));
			}

			public void clickOnAllTheTabs() {
				uIMapCoroner.coronerCaseEntry.uIMainTab.click();
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerCaseEntry.uINamesTab.click();
				uIMapCoroner.coronerCaseEntry.uIReviewTab.click();
				uIMapCoroner.coronerCaseEntry.uIEffortsTab.click();
				uIMapCoroner.coronerCaseEntry.uIReportsTab.click();
				uIMapCoroner.coronerCaseEntry.uIEvidenceTab.click();																// Added by Abi
				uIMapCoroner.coronerCaseEntry.uIAttachmentTab.click();
				uIMapCoroner.coronerCaseEntry.uIPropertyTab.click();	
			}
			public void verifyAtInvestNo() {
				String investNo= readInvestNo();
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("InvestNo"), investNo);
			}
			public void verifyAtRMSCaseNo() {
				
				
				Playback.controlReadyThreadWait();
				String CaseNo =uIMapCoroner.coronerCaseEntry.uIRMSCaseYear.getAttribute("value")+"-"+uIMapCoroner.coronerCaseEntry.uIRMSCaseNo.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("CaseNo"), CaseNo);
			}
			public void verifyAtName() {
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("LastName"), uIMapCoroner.coronerCaseEntry.uILastNameEdit.getAttribute("value"));
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("FirstName"), uIMapCoroner.coronerCaseEntry.uIFirstNameEdit.getAttribute("value"));
			
			}
			

			
			public class CoronerCaseEntryMainTab
			{

				public void enterAtInvestigator() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIInvestigator.sendKeys(PoliceData.getCoronerModuleValue("Investigator"));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIInvestigator.sendKeys(Keys.TAB);
					Playback.controlReadyThreadWait();
				}

				public void enterDateAssignedAsCurrentDate() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIDateAssigned.sendKeys(Randomized.getCurrentDate());
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIDateAssigned.sendKeys(Keys.TAB);
					Playback.controlReadyThreadWait();
				}

				public void verifyNextReviewDateAs7DaysAfterAssign() {
					Playback.controlReadyThreadWait();
					verify.ExpectedPropertyValueIsEqual("7", Randomized.getNoOfDaysDifferenceBetweenTwoDates(uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIDateAssigned.getAttribute("value"), uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uINextReviewdate.getAttribute("value")));
					 
				}

				public void enterAtLocationOfDeath() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uILocationOfDeath.sendKeys(PoliceData.getCoronerModuleValue("LocationOfDeath"));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uILocationOfDeath.sendKeys(Keys.TAB);
					Playback.controlReadyThreadWait();
				}

				public void selectAtCauseOfDeath() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uICauseOfDeathInput.click();
					objectIdentification.manualIdentify.selectRadControlDropDownValue(uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uICauseOfDeathCombobox, PoliceData.getCoronerModuleValue("CauseOfDeath"));
					
				}

				public void selectAtLocalMortuary() {
					objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uILocalMortuary, PoliceData.getCoronerModuleValue("LocalMortuary"));
					
				}

				public void selectAtSubstanceInvolved() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uISubstanceInvolvedInput.click();
					objectIdentification.manualIdentify.selectRadControlDropDownValue(uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uISubstanceInvolvedDropDown, PoliceData.getCoronerModuleValue("SubstanceInvolved"));
				}

				public void selectMannerOfDeath() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIMannerOfDeathInput.click();
					objectIdentification.manualIdentify.selectRadControlDropDownValue(uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIMannerOfDeathCombobox, PoliceData.getCoronerModuleValue("MannerOfDeath"));
				}

				public void verifyAgeOfDeath() {
					
					verify.ExpectedPropertyValueIsEqual(uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIAgeAtDOD.getAttribute("Value"),PoliceData.getCoronerModuleValue("AgeOfDeath"));
				}

				public void enterAtFacilityNameID() {
					 Playback.controlReadyThreadWait();
						uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIFacilitynameType.sendKeys(PoliceData.getCoronerModuleValue("NameID").substring(0, 1));
						uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIFacilityNameIDEdit.sendKeys(PoliceData.getCoronerModuleValue("NameID").substring(2));
						uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIFacilityNameIDEdit.sendKeys(Keys.TAB);
						Playback.controlReadyThreadWait();
				}

				public void enterRemarks() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryMainTab.uIRemarksEdit.sendKeys(Randomized.randomString(20));
					
				}
				
			}
			
			public class CoronerCaseEntryNamesTab
			{
				
				public void SelectRelationship() {
					objectIdentification.randomIdentify
							.selectDropDownOption(uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox);
				}

				public void clickAddNameButton() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIAddNameButton.click();
					Playback.controlReadyThreadWait();
				}

				public void clickInternalSaveButton() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uISaveNamesTabButton.click();
				}

				public void VerifyNamesTabValidation() {
					popup.acknowledge
							.okWithExpectedMessage("(1051) Updated data exists in the Names Tab. You must save or reset.");
				}
				public void VerifyAdditionSuccessfulAcknowledge() {
					popup.acknowledge
							.okWithExpectedMessage("1002 - Addition Successful");
				}
				public void VerifyAdditionSuccessfulMessage() {
					String UpdateMessage = uIMapCoroner.coronerCaseEntry.uILeftSideStatusBar.getText();
					verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
					Playback.wait(2000);
				}


				public void enterAtNameID() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeEdit.click();
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeEdit
							.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(0, 1));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit
							.sendKeys(PoliceData.getRecordsModuleValue("NameID").substring(2));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
				}
				
				public void enterAtLastName() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uILastNameEdit
							.sendKeys(PoliceData.getRecordsModuleValue("LastName"));
				}

				public void enterAtFirstName() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIFirstNameEdit
							.sendKeys(PoliceData.getRecordsModuleValue("FirstName"));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIFirstNameEdit.sendKeys(Keys.TAB);
				}

				public void selectAtRelationship() {
					objectIdentification.manualIdentify.selectDropDownOption(
							uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox,
							PoliceData.getRecordsModuleValue("Relationship"));
				}

				public void selectRelationshipAsNextOfKin() {
					objectIdentification.manualIdentify
							.selectDropDownOption(uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox, "Next of Kin");
				}

				public void selectRelationshipAsPhysician() {
					objectIdentification.manualIdentify
							.selectDropDownOption(uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox, "Physician");
				}

				
				public void VerifyAtRelationshipInGrid(int rowIndex) {
					verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Relationship"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINamesTabGridTable, "Relationship", rowIndex));
				}

				public void VerifyAtLastNameFirstNameInGrid(int rowIndex) {
					String name =PoliceData.getRecordsModuleValue("LastName")+","+" "+PoliceData.getRecordsModuleValue("FirstName");
					verify.ExpectedPropertyValueIsEqual(name,
			                objectIdentification.manualIdentify.getGridCellInnerText(uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINamesTabGridTable,
			                "Name", rowIndex));
				}

				public void saveNamesTab() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uISaveNamesTabButton.click();
					popup.confirm.yes();
				}

				public void enterAtNameID1() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeEdit.click();
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeEdit
							.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(0, 1));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit
							.sendKeys(PoliceData.getRecordsModuleValue("NameID1").substring(2));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
				}

				public void SelectRowByAtName() {
					objectIdentification.manualIdentify.selectGridRowByCellInnerText(
							uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINamesTabGridTable,
							PoliceData.getRecordsModuleValue("Name"));
				}

				public void SelectRowByAtRelationship() {
					objectIdentification.manualIdentify.selectGridRowByCellInnerText(
							uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINamesTabGridTable,
							PoliceData.getRecordsModuleValue("Relationship"));
				}

				public void ClickNameInfoIcon() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINamesInfoIcon.click();
				}

				public void verifyNameInfoIconDisplayed() {
					verify.ExpectedValueIsTrue(uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINamesInfoIcon.isDisplayed()); 
				}

				public void VerifyAtRelationship() {
					verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Relationship"),
							objectIdentification.manualIdentify
									.getDropDownSelectedItem(uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox));
				}

				public void enterNameID(String nameID) {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeEdit.click();
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeEdit.sendKeys(nameID.substring(0, 1));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit.sendKeys(nameID.substring(2));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
				}

			
				public void selectAtRelationship1() {
					objectIdentification.manualIdentify.selectDropDownOption(
							uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox,
							PoliceData.getRecordsModuleValue("Relationship1"));
				}

				public void selectAtRelationship2() {
					objectIdentification.manualIdentify.selectDropDownOption(
							uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox,
							PoliceData.getRecordsModuleValue("Relationship2"));
				}

				public void enterAtNameID2() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeEdit
							.sendKeys(PoliceData.getRecordsModuleValue("NameID2").substring(0, 1));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit
							.sendKeys(PoliceData.getRecordsModuleValue("NameID2").substring(3));
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
					Playback.popupThreadWait();
				}

				public void selectAtRelationship3() {
					objectIdentification.manualIdentify.selectDropDownOption(
							uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIRelationshipComboBox,
							PoliceData.getRecordsModuleValue("Relationship3"));
				}

				public void selectNameFromHelpWindow() {
					names.nameSearchHelpWindow.SelectName();
					
				}
				public void verifyAtAddress()
				{
					String actualAddress  =uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uIAddressEdit.getAttribute("value");
					 verify.ExpectedPropertyValueIsEqual(PoliceData.getRecordsModuleValue("Address"), actualAddress);
				}
				
			
				public void verifyUpdatedDataExistinNameTabAcknowledge() {
					popup.switchToAcknowledge();
					String warningMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();

					if (Playback.browserType.equals("Chrome")) {
						verify.ExpectedValueIsTrue(
								warningMessage.contains("(1051) Updated data exists in the Names Tab. You must save or reset."));
						popup.acknowledge.ok();
					} else {
						verify.ExpectedValueIsTrue(
								warningMessage.contains("(1051) Updated data exists in the Names Tab. You must save or reset."));
						popup.acknowledge.ok();
					}
				}

				public void verifyUpdatedSuccessfulStatusMessage() {
					 String UpdateMessage = uIMapCoroner.coronerCaseEntry.coronerCaseEntryNamesTab.uILeftSideStatusBar.getText();
				       verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", UpdateMessage);
				       Playback.wait(2000);
				}

				
			}
			public class CoronerCaseEntryReviewTab
			{

				public void clickAddNewReview() {
					Playback.controlReadyThreadWait();
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryReviewTab.uIAddNewReviewButton.click();
				}

				public void verifyStatusDateAsCurrentDate() {
					Playback.controlReadyThreadWait();
					verify.ExpectedValueIsTrue(uIMapCoroner.coronerCaseEntry.coronerCaseEntryReviewTab.uIStatusDateTextView.getText().contains(Randomized.getCurrentDate()));
				}

				public void verifyNextReviewDateAs7DaysAfterAssign() {
					Playback.controlReadyThreadWait();
					verify.ExpectedPropertyValueIsEqual("7", Randomized.getNoOfDaysDifferenceBetweenTwoDates(uIMapCoroner.coronerCaseEntry.coronerCaseEntryReviewTab.uINextReportDateTextView.getText(), Randomized.getCurrentDate()));
					 
				}

				public void verifyAtStatusChangedTo() {
					Playback.controlReadyThreadWait();
					verify.ExpectedValueIsTrue(uIMapCoroner.coronerCaseEntry.coronerCaseEntryReviewTab.uIStatusChangedToTextView.getText().contains(PoliceData.getCoronerModuleValue("Status")));
				}
				
			}
			public class CoronerCaseEntryEffortsTab
			{

				public void clickAddEffort() {
					Playback.controlReadyThreadWait();
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryEffortsTab.uIAddNewEffortsButton.click();
					
				}
				
				public void verifyAtInvestigatorName() {
					Playback.controlReadyThreadWait();
					
					verify.ExpectedPropertyValueIsEqual(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEffortsTab.uIInvestogatorNameTextView.getText(), PoliceData.getCoronerModuleValue("InvestigatorName"));
				}

				public void verifyDateFromAsCurrentDate() {
					Playback.controlReadyThreadWait();
					
					verify.ExpectedValueIsTrue(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEffortsTab.uIDateFromTextView.getText().contains(Randomized.getCurrentDate()));
				}

				public void verifyAtActivityCode() {
					Playback.controlReadyThreadWait();
					
					verify.ExpectedPropertyValueIsEqual(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEffortsTab.uIActivityCodeTextView.getText(), PoliceData.getCoronerModuleValue("CoronerActivity"));
				}
				public void verifyAtRemarks(int effortNo) {
					Playback.controlReadyThreadWait();
				List<WebElement> efforts =	Playback.driver.findElements(By.xpath("(//table[@id='tabCorEntry_tmpl3_userEffort_grdLog']//tr//td[@colspan='3'])"));
				verify.ExpectedValueIsTrue( efforts.get(3*effortNo-1).getText().contains(PoliceData.getCoronerModuleValue("Remarks")));
				}			
			}
			public class CoronerCaseEntryReportsTab
			{
				public void clickAddReportButton() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uIAddReportButton.click();
					Playback.controlReadyThreadWait();
				}

				public void SaveInternalTab() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uISaveButton.click();
					popup.confirm.yes();
					Playback.controlReadyThreadWait();
				}

				public void ClickRefreshButton() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uIRefreshButton.click();
				}

				public void ClickViewCaseFileButton() {
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uIViewCaseFileButton.click();
				}
				
				public void selectRowByAtType() {
					objectIdentification.manualIdentify.selectGridRowByCellInnerText(
							uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uIReportingTable, PoliceData.getCoronerModuleValue("Type"));
					Playback.controlReadyThreadWait();
					Playback.pageLoadThreadWait();
				}
				
				public void verifyReportStatusAsOnHold(int rowIndex) {
					WebElement ReportStatus = objectIdentification.manualIdentify
							.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uIReportingTable, "Status", rowIndex);
					Assert.assertEquals(ReportStatus.getText(), "On Hold");
				}
				public void verifyReportTypeAsCoronerReport(int rowIndex) {
					WebElement ReportStatus = objectIdentification.manualIdentify
							.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uIReportingTable, "Type", rowIndex);
					Assert.assertEquals(ReportStatus.getText(), "Coroner Report");
				}
				public void verifyReportTypeAsPostMortem(int rowIndex) {
					WebElement ReportStatus = objectIdentification.manualIdentify
							.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryReportsTab.uIReportingTable, "Type", rowIndex);
					Assert.assertEquals(ReportStatus.getText(), "Post-Mortems");
				}

			}
			public class CoronerCaseEntryEvidenceTab
			{

				public void clickAddNew() {
					Playback.controlReadyThreadWait();
					uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIAddNewButton.click();
					Playback.controlReadyThreadWait();
				}

				public void verifyAtInvestNo(int rowIndex) {
					WebElement InvestNo = objectIdentification.manualIdentify
							.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, "Invest#", rowIndex);
					Assert.assertEquals(InvestNo.getText(), PoliceData.getCoronerModuleValue("InvestNo"));
				}

				public void verifyAtReason(int rowIndex) {
					WebElement reason = objectIdentification.manualIdentify
							.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, "Reason", rowIndex);
					Assert.assertEquals(reason.getText(), PoliceData.getCoronerModuleValue("Reason"));
				}

				public void verifyAtCaseNo(int rowIndex) {
					WebElement caseNo = objectIdentification.manualIdentify
							.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, "Case#", rowIndex);
					Assert.assertEquals(caseNo.getText(), PoliceData.getCoronerModuleValue("CaseNo"));
				}

				public void verifyAtEvidenceNo(String evidenceNo,int rowIndex) {
					WebElement evidence = objectIdentification.manualIdentify
							.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, "Evidence#", rowIndex);
					Assert.assertEquals(evidence.getText(), evidenceNo);
				}

				public void selectGridRowByEvidenceNo() {
					Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, PoliceData.getCoronerModuleValue("EvidenceNo"));
						
				}

				public void verifyStatusAsOpenInvestigationByEvidenceNo() {
					Playback.controlReadyThreadWait();
					String status =objectIdentification.manualIdentify.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, PoliceData.getCoronerModuleValue("EvidenceNo"), "Status").getText();
					verify.ExpectedPropertyValueIsEqual("Open Investigation", status);
				}
				public void verifyAtStatusByEvidenceNo() {
					Playback.controlReadyThreadWait();
					String status =objectIdentification.manualIdentify.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, PoliceData.getCoronerModuleValue("EvidenceNo"), "Status").getText();
					verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("EvidenceStatus"), status);
				}
				
				public void verifyClosedStatusShowingAsGrayColor() {
					Playback.controlReadyThreadWait();
					WebElement statuscell =objectIdentification.manualIdentify.getGridCell(uIMapCoroner.coronerCaseEntry.coronerCaseEntryEvidenceTab.uIEvidenceTable, PoliceData.getCoronerModuleValue("EvidenceNo"), "Status");
					String value = statuscell.getText();
					System.out.println(value);
				String color =	statuscell.getCssValue("color");
				System.out.println(color);
					verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("EvidenceStatus"), value);
				}
				
			}
			public void enterAtLastName() {
				uIMapCoroner.coronerCaseEntry.uILastNameEdit.sendKeys(PoliceData.getCoronerModuleValue("LastName"));
				uIMapCoroner.coronerCaseEntry.uILastNameEdit.sendKeys(Keys.TAB);
			}


			public void enterAtFirstName() {
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerCaseEntry.uIFirstNameEdit.sendKeys(PoliceData.getCoronerModuleValue("FirstName"));
				uIMapCoroner.coronerCaseEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
				
			}


			public void verifyPropertyTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapCoroner.coronerCaseEntry.uIPropertyTab.isDisplayed());	
			uIMapCoroner.coronerCaseEntry.uIPropertyTab.click();
			}
			
		
			public void clickResetButton() {																				// Added by Abi
				uIMapCoroner.coronerCaseEntry.uIResetButton.click();
			}


			public void verifyInvestNo(String investNo) {
				String year =	uIMapCoroner.coronerCaseEntry.uICoronerInvestYear.getAttribute("value");
				String no =		uIMapCoroner.coronerCaseEntry.uICoronerInvestNo.getAttribute("value");
				verify.ExpectedValueIsTrue(investNo.contains(year));
				verify.ExpectedValueIsTrue(investNo.contains(no));
			}	
		}
		
		public class CoronerReview
		{

			public void verifyCurrentReviewDateAsTodaysDate() {
				
				Playback.controlReadyThreadWait();
				verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), uIMapCoroner.coronerReview.uICurrentReviewDate.getAttribute("value"));
			}

			public void selectAtCoronerStatus() {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerReview.uICoronerCaseStatusDropDown, PoliceData.getCoronerModuleValue("Status"));
			}

			public void tabDateAndTime() {
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerReview.uIDate.click();
				uIMapCoroner.coronerReview.uIDate.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerReview.uITime.sendKeys(Keys.TAB);
			}

			public void verifyNextReviewDateAs7DaysAfterAssign() {
				Playback.controlReadyThreadWait();
				verify.ExpectedPropertyValueIsEqual("7", Randomized.getNoOfDaysDifferenceBetweenTwoDates(uIMapCoroner.coronerReview.uINextReviewDate.getAttribute("value"), Randomized.getCurrentDate()));
			}

			public void selectAtTemplate() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerReview.uIRemarksTemplateDropDown, PoliceData.getCoronerModuleValue("Template"));
			}

			public void clickOnLoad() {
				uIMapCoroner.coronerReview.uIRemarksTemplateLoad.click();
				
			}

			public void clickSave() {
				uIMapCoroner.coronerReview.uISaveButton.click();
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				
			}
			

		}
		
		public class CoronerEfforts
		{

			public void enterAtInvestigator() {
				uIMapCoroner.coronerEfforts.uIInvestigatorEdit.sendKeys(PoliceData.getCoronerModuleValue("Investigator"));
				uIMapCoroner.coronerEfforts.uIInvestigatorEdit.sendKeys(Keys.TAB);
				
			}

			public void selectAtCoronerCatogory() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEfforts.uICoronerCategoryDropDown, PoliceData.getCoronerModuleValue("CoronerCategory"));
				uIMapCoroner.coronerEfforts.uICoronerCategoryDropDown.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				
			}

			public void selectAtCoronerActivity() {
				Playback.pageLoadThreadWait();
				uIMapCoroner.coronerEfforts.uICoronerActivityDropDown.click();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEfforts.uICoronerActivityDropDown, PoliceData.getCoronerModuleValue("CoronerActivity"));
			}

		
			public void tabStartedDateAndTime() {
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerEfforts.uIStartedDate.click();
				uIMapCoroner.coronerEfforts.uIStartedDate.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerEfforts.uIStartedTime.sendKeys(Keys.TAB);
			}

			public void selectAtTemplate() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEfforts.uIRemarksTemplateDropDown, PoliceData.getCoronerModuleValue("Template"));
			}

			public void clickOnLoad() {
				uIMapCoroner.coronerEfforts.uIRemarksTemplateLoad.click();
				
			}

			public void clickSave() {
				uIMapCoroner.coronerEfforts.uISaveButton.click();
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				
			}
			
			public void enterAtRemarksText() {
				objectIdentification.windowHandle.switchToFrame(uIMapCoroner.coronerEfforts.uIRemarksFrame);
				uIMapCoroner.coronerEfforts.uIRemarksTextBody.sendKeys(PoliceData.getCoronerModuleValue("Remarks"));
			}

		}
		
		public class CoronerCaseReportEntry
		{
			
			public void selectAtType() {
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerCaseReportEntry.uICoronerReportTypeDropDown.click();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerCaseReportEntry.uICoronerReportTypeDropDown, PoliceData.getCoronerModuleValue("Type"));
			}

		

			public void selectAtTemplate() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerCaseReportEntry.uIRemarksTemplateDropDown, PoliceData.getCoronerModuleValue("Template"));
			}

			public void clickOnLoad() {
				uIMapCoroner.coronerCaseReportEntry.uIRemarksTemplateLoad.click();
				
			}

		
			public void enterAtRemarksText() {
				objectIdentification.windowHandle.switchToFrame(uIMapCoroner.coronerCaseReportEntry.uIRemarksFrame);
				uIMapCoroner.coronerCaseReportEntry.uIRemarksTextBody.sendKeys(PoliceData.getCoronerModuleValue("Remarks"));
			}

			public void verifyAtCoronerInvestNo() {
			
					String investNo= uIMapCoroner.coronerCaseReportEntry.uICoronerInvestYear.getAttribute("value")+"-"+uIMapCoroner.coronerCaseReportEntry.uICoronerInvestNo.getAttribute("value");
					verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("InvestNo"), investNo);
				
			}

			public void verifyAtReportedOfficer() {
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("ReportedOfficer"),uIMapCoroner.coronerCaseReportEntry.uIReportedOfficerEdit.getAttribute("value"));
				
			}

			public void selectAtStatus() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerCaseReportEntry.uIStatusDropDown, PoliceData.getCoronerModuleValue("Status"));
			}

			public void enterDescription() {
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerCaseReportEntry.uIDescription.sendKeys(Randomized.randomString(50));
			}


		
			public void clickSave() {
				uIMapCoroner.coronerCaseReportEntry.uISaveButton.click();
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				
			}
			

		}
		
		public class CoronerEvidenceEntry
		{

			public void verifyInvestNo(String investNo) {
				
			String investyear =	uIMapCoroner.coronerEvidenceEntry.uICoronerInvestYear.getAttribute("value");
			String investNum =uIMapCoroner.coronerEvidenceEntry.uICoronerInvestNo.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(investNo,investyear+ "-"+investNum);
			}

			public void verifyAtInvestNo() {
				
				String investyear =	uIMapCoroner.coronerEvidenceEntry.uICoronerInvestYear.getAttribute("value");
				String investNum =uIMapCoroner.coronerEvidenceEntry.uICoronerInvestNo.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("InvestNo"),investyear+ "-"+investNum);
				}

			public void enterAtInvestNo() {
				
				uIMapCoroner.coronerEvidenceEntry.uICoronerInvestYear.sendKeys(PoliceData.getCoronerModuleValue("InvestNo").substring(0, 2));
				uIMapCoroner.coronerEvidenceEntry.uICoronerInvestYear.sendKeys(Keys.TAB);
				uIMapCoroner.coronerEvidenceEntry.uICoronerInvestNo.sendKeys(PoliceData.getCoronerModuleValue("InvestNo").substring(3));
				uIMapCoroner.coronerEvidenceEntry.uICoronerInvestNo.sendKeys(Keys.TAB);
				}

			public void verifyDateOfDeath(String dateOfDeath) {
				String DOD =	uIMapCoroner.coronerEvidenceEntry.uIDateofdeath.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(dateOfDeath,DOD);
			}
			
			public void verifyAtDateOfDeath() {
				String DOD =	uIMapCoroner.coronerEvidenceEntry.uIDateofdeath.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("DateOfDeath"),DOD);
			}

			public void selectAtReason() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceEntry.uIReasonDropDown, PoliceData.getCoronerModuleValue("Reason"));
			}

			public void verifyAtReason() {
				Playback.controlReadyThreadWait();
				verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify.getDropDwonSelectedItem(uIMapCoroner.coronerEvidenceEntry.uIReasonDropDown), PoliceData.getCoronerModuleValue("Reason")); 
			}
			public String readSelectedStorageLocation() {
				Playback.controlReadyThreadWait();
				String reason =objectIdentification.manualIdentify.getDropDwonSelectedItem(uIMapCoroner.coronerEvidenceEntry.uIEvidenceStorageLocationDropDown); 
			return reason;
			}
			public void selectAtEvidenceType() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceEntry.uIEvidenceTypeDropDown, PoliceData.getCoronerModuleValue("EvidenceType"));
			}

			public void enterDescription() {
				uIMapCoroner.coronerEvidenceEntry.uIDescription.sendKeys(Randomized.randomString(50));
				
			}

			public void enterQuantity() {
				
				uIMapCoroner.coronerEvidenceEntry.uIQuantity.clear();
				uIMapCoroner.coronerEvidenceEntry.uIQuantity.sendKeys(Randomized.enterRandomNumbers(10));
			}

			public void selectAtStorageLocation() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceEntry.uIEvidenceStorageLocationDropDown, PoliceData.getCoronerModuleValue("StorageLocation"));
			}

			public void selectAtEvidenceStatus() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceEntry.uIEvidenceStatusDropDown, PoliceData.getCoronerModuleValue("EvidenceStatus"));
			}

			public void saveNclose() {
				uIMapCoroner.coronerEvidenceEntry.uISaveNCloseButton.click();
				Playback.controlReadyThreadWait();
				popup.confirm.yes();
				
			}

			public void save() {
				uIMapCoroner.coronerEvidenceEntry.uISaveButton.click();
				Playback.controlReadyThreadWait();
				popup.confirm.yes();
			}

			public void verifyAddnewButtonDisabled() {
				verify.ExpectedValueIsFalse(uIMapCoroner.coronerEvidenceEntry.uIAddnew.isEnabled()); 
				
			}

			public void verifyAddnewButtonEnabled() {
				verify.ExpectedValueIsTrue(uIMapCoroner.coronerEvidenceEntry.uIAddnew.isEnabled()); 
				
			}

			public String readEvidenceNo() {
				String yr =uIMapCoroner.coronerEvidenceEntry.uIEvidenceYear.getAttribute("value");
				String no =uIMapCoroner.coronerEvidenceEntry.uIEvidenceNo.getAttribute("value");
				String seq =uIMapCoroner.coronerEvidenceEntry.uIEvidenceItemSequenceNo.getAttribute("value");
				return yr+"-"+no+"-"+seq;
			}

			public int readItemNo() {
				
				String seq =uIMapCoroner.coronerEvidenceEntry.uIEvidenceItemSequenceNo.getAttribute("value");
				return Integer.parseInt(seq);
			}

			public void VerifyAdditionSuccessfulMessage() {
				String UpdateMessage = uIMapCoroner.coronerEvidenceEntry.uILeftSideStatusBar.getText();
				verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
				Playback.wait(2000);
			}

			public void VerifyUpdateSuccessfulMessage() {
				String UpdateMessage = uIMapCoroner.coronerEvidenceEntry.uILeftSideStatusBar.getText();
				verify.ExpectedValueIsTrue(UpdateMessage.contains("1003 - Update Successful"));
				Playback.wait(2000);
			}

			public void clickAddnewBotton() {
				uIMapCoroner.coronerEvidenceEntry.uIAddnew.click();
			}

			public void verifySeqGeneratedAsNextNo(int previousSeq) {
				Playback.controlReadyThreadWait();
				String seq =uIMapCoroner.coronerEvidenceEntry.uIEvidenceItemSequenceNo.getAttribute("value");
				int seqNo =Integer.parseInt(seq);
				verify.ExpectedValueIsTrue(seqNo>previousSeq);
			}
			public void verifySeqNo(int previousSeq) {
				Playback.controlReadyThreadWait();
				String seq =uIMapCoroner.coronerEvidenceEntry.uIEvidenceItemSequenceNo.getAttribute("value");
				int seqNo =Integer.parseInt(seq);
				verify.ExpectedValueIsTrue(seqNo==previousSeq);
			}

			public void selectReasonAsMentalIllness() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceEntry.uIReasonDropDown, "Mental illness");
			}

			public void verifyDefaultQuantityAs1() {
		
				verify.ExpectedPropertyValueIsEqual("1", uIMapCoroner.coronerEvidenceEntry.uIQuantity.getAttribute("value"));

			}

			public void verifyLocationChangeDateDisplayed() {
				verify.ExpectedValueIsTrue( uIMapCoroner.coronerEvidenceEntry.uIChangeLocDate.isDisplayed());
				
			}

			public void verifyLocationChangeReasonDisplayed() {
				Playback.controlReadyThreadWait();
				verify.ExpectedValueIsTrue( uIMapCoroner.coronerEvidenceEntry.uIChangeLocReason.isDisplayed());
				
			}
			public void verifyLocationChangeReasonAsMandatory() {
				Playback.controlReadyThreadWait();
				verify.ExpectedValueIsTrue( uIMapCoroner.coronerEvidenceEntry.uIChangeLocReasonLbl.getCssValue("color").contains("rgba(153, 0, 0, 1)"));
				
			}

			public void verifyViewHistoryButtonDisplayed() {
				verify.ExpectedValueIsTrue( uIMapCoroner.coronerEvidenceEntry.uIViewhistory.isDisplayed());
				
			}

			

			public void enterAtChangeReason() {
				 uIMapCoroner.coronerEvidenceEntry.uIChangeLocReason.sendKeys(PoliceData.getCoronerModuleValue("ChangeReason"));	
			}

			public void enterChangeDateAsCurrentDate() {
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerEvidenceEntry.uIChangeLocDate.sendKeys(Randomized.getCurrentDate());
				uIMapCoroner.coronerEvidenceEntry.uIChangeLocDate.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void selectStorageLocationAsCoronerLocation() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(uIMapCoroner.coronerEvidenceEntry.uIEvidenceStorageLocationDropDown, "Coroner Location");
		
			}

			public void verifyAtEvidenceNo() {
				String yr =uIMapCoroner.coronerEvidenceEntry.uIEvidenceYear.getAttribute("value");
				String no =uIMapCoroner.coronerEvidenceEntry.uIEvidenceNo.getAttribute("value");
				String seq =uIMapCoroner.coronerEvidenceEntry.uIEvidenceItemSequenceNo.getAttribute("value");
				String evidenceNo= yr+"-"+no+"-"+seq;
				verify.ExpectedPropertyValueIsEqual(PoliceData.getCoronerModuleValue("EvidenceNo"), evidenceNo);
			}

			public void clickViewHistoryButton() {
				Playback.controlReadyThreadWait();
				uIMapCoroner.coronerEvidenceEntry.uIViewhistory.click();
				Playback.controlReadyThreadWait();			
			}

		}

		public void reloadCoronerEvidenceScreen() {
			loader.ReLoadScreen("Coroner Evidence..");
			
		}

		public class CoronerEvidenceHistory
		{
			public void verifyAtPFName(int rowIndex)
			{
				Playback.controlReadyThreadWait();			
				WebElement reason = objectIdentification.manualIdentify
						.getGridCell(uIMapCoroner.coronerEvidenceHistory.uIEvidenceHistoryTable, "PF Name", rowIndex);
				Assert.assertEquals(reason.getText(), PoliceData.getCoronerModuleValue("PFName"));
				
			}
			public void verifyAtLocationFrom(int rowIndex)
			{
				Playback.controlReadyThreadWait();			
				WebElement reason = objectIdentification.manualIdentify
						.getGridCell(uIMapCoroner.coronerEvidenceHistory.uIEvidenceHistoryTable, "Location From", rowIndex);
				Assert.assertEquals(reason.getText(), PoliceData.getCoronerModuleValue("LocationFrom"));
				
			}
			public void verifyAtLocationTo(int rowIndex)
			{
				
				WebElement reason = objectIdentification.manualIdentify
						.getGridCell(uIMapCoroner.coronerEvidenceHistory.uIEvidenceHistoryTable, "Location To", rowIndex);
				Assert.assertEquals(reason.getText(), PoliceData.getCoronerModuleValue("LocationTo"));
				
			}
			public void verifyLocationTo(String location,int rowIndex)
			{
				Playback.controlReadyThreadWait();			
				WebElement reason = objectIdentification.manualIdentify
						.getGridCell(uIMapCoroner.coronerEvidenceHistory.uIEvidenceHistoryTable, "Location To", rowIndex);
				Assert.assertEquals(reason.getText(), location);
				
			}
			public void verifyAtChangedReason(int rowIndex)
			{
				Playback.controlReadyThreadWait();			
				WebElement reason = objectIdentification.manualIdentify
						.getGridCell(uIMapCoroner.coronerEvidenceHistory.uIEvidenceHistoryTable, "Reason", rowIndex);
				Assert.assertEquals(reason.getText(), PoliceData.getCoronerModuleValue("ChangeReason"));
				
			}
			public void verifyChangedReasonAsNull(int rowIndex) {
				Playback.controlReadyThreadWait();			
				WebElement reason = objectIdentification.manualIdentify
						.getGridCell(uIMapCoroner.coronerEvidenceHistory.uIEvidenceHistoryTable, "Reason", rowIndex);
				Assert.assertEquals(reason.getText(), "");
			}
			public void verifyLocationFrom(String location, int rowIndex) {
				Playback.controlReadyThreadWait();			
				WebElement reason = objectIdentification.manualIdentify
						.getGridCell(uIMapCoroner.coronerEvidenceHistory.uIEvidenceHistoryTable, "Location From", rowIndex);
				Assert.assertEquals(reason.getText(),location);
				
			}
			public void closeScreen() {
				uIMapCoroner.coronerEvidenceHistory.driver.close();
				
			}		
		}

		
		
	}
