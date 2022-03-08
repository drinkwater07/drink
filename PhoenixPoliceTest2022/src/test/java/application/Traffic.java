package application;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import dataAccess.PoliceData;
import uIMaps.UIMapHome;
import uIMaps.UIMapPopup;
import uIMaps.UIMapTraffic;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Traffic {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	UIMapTraffic uIMapTraffic = new UIMapTraffic();
	public Popup popUp = new Popup();
	Randomized randomized = new Randomized();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public Names names = new Names();
	public UIMapHome uIMapHome = new UIMapHome();

	public CrashEntry crashEntry = null;

	public CrashComments crashComments;

	public CrashSearch crashSearch = null;

	public CrashSearchHelpWindow crashSearchHelpWindow = null;

	public CrashUnit crashUnit = null;

	public DeerCrash deerCrash;

	public CitationEntry citationEntry;

	public CitationArrest citationArrest;

	public CitationComments citationComments;

	public CitationSearch citationSearch;

	public ParkingEntry parkingEntry;

	public ParkingOtherPayment parkingOtherPayment;

	public ParkingSearch parkingSearch;

	public TicketHoldReason ticketHoldReason;

	public NamesComments namesComments;

	public ParkingPermits parkingPermits;

	public ParkingPermitsSearch parkingPermitsSearch;

	public ParkingPermitsAuthenticate parkingPermitsAuthenticate;

	public Court court;

	public CourtEntry courtEntry;
	
	public KPICrimeSceneSDK kPICrimeSceneSDK;

	public Traffic() {

		if (crashEntry == null)
			crashEntry = new CrashEntry();

		if (crashComments == null)
			crashComments = new CrashComments();

		if (crashUnit == null)
			crashUnit = new CrashUnit();

		if (crashSearch == null)
			crashSearch = new CrashSearch();

		if (crashSearchHelpWindow == null)
			crashSearchHelpWindow = new CrashSearchHelpWindow();

		if (deerCrash == null)
			deerCrash = new DeerCrash();

		if (citationEntry == null)
			citationEntry = new CitationEntry();

		if (citationArrest == null)
			citationArrest = new CitationArrest();

		if (citationComments == null)
			citationComments = new CitationComments();

		if (citationSearch == null)
			citationSearch = new CitationSearch();

		if (parkingEntry == null)
			parkingEntry = new ParkingEntry();

		if (parkingOtherPayment == null)
			parkingOtherPayment = new ParkingOtherPayment();

		if (parkingSearch == null)
			parkingSearch = new ParkingSearch();

		if (ticketHoldReason == null)
			ticketHoldReason = new TicketHoldReason();

		if (namesComments == null)
			namesComments = new NamesComments();

		if (parkingPermits == null)
			parkingPermits = new ParkingPermits();

		if (parkingPermitsSearch == null)
			parkingPermitsSearch = new ParkingPermitsSearch();

		if (parkingPermitsAuthenticate == null)
			parkingPermitsAuthenticate = new ParkingPermitsAuthenticate();

		if (court == null)
			court = new Court();

		if (courtEntry == null)
			courtEntry = new CourtEntry();

		if (kPICrimeSceneSDK == null)
			kPICrimeSceneSDK = new KPICrimeSceneSDK();
	}

	public void Reset() {

		uIMapTraffic = null;
	}

	public void switchToCourtScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Court");
	}

	public void switchToCourtEntry() {
		objectIdentification.windowHandle.switchToWindow("Court Entry");
	}

	public void switchToCrashEntry() {
		objectIdentification.windowHandle.switchToWindow("Crash Entry");
		Playback.controlReadyThreadWait();
	}
    public void switchToParkingComments() 
	{
		objectIdentification.windowHandle.switchToWindow("Parking Comments");
		
	}

	public void switchToCrashEntryScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmCrash.aspx");
	}

	public void switchToCrashEntryByForm() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingFormName("Crash Entry", "frmNJCrash_Id");
	}

	public void switchToCrashSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Crash Search");
	}

	public void switchToCrashSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Crash Search");
	}

	public void switchToDeerCrash() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Deer Crash");
	}

	public void switchToCitationEntry() {
		objectIdentification.windowHandle.switchToWindow("Citation Entry - 3810");
	}

	public void switchToCitationSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Citation Search");
	}

	public void switchToCitationComments() {
		objectIdentification.windowHandle.switchToWindow("Citation Comments - 3812");
	}

	public void switchToNamesComments() {
		objectIdentification.windowHandle.switchToWindow("Names Comments - 2212");
	}

	public void switchToCrashComments() {
		objectIdentification.windowHandle.switchToWindow("Crash Comments - 3841");
	}

	public void switchToParkingEntry() {
		objectIdentification.windowHandle.switchToWindow("Parking Entry - 3822");
	}

	public void switchToParkingOtherPayment() {
		objectIdentification.windowHandle.switchToWindow("ParkingOtherPayment - 3823");
	}

	public void switchToParkingSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Parking Search");
	}

	public void switchToCrashUnit() {
		objectIdentification.windowHandle.switchToWindow("Crash Unit - 3832");
	}

	public void switchToTicketHoldReason() {
		objectIdentification.windowHandle.switchToWindow("Ticket Hold Reason");
	}

	public void switchToParkingPermit() {
		objectIdentification.windowHandle.switchToWindow("Parking Permits");
	}

	public void switchToParkingPermitMainWindow() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Parking Permits");
	}
	public void switchToKPICrimeSceneSDK() { // Added by Abi
		objectIdentification.windowHandle.switchToWindow("- KPI Crime Scene Drawing");
	}
	public void switchToParkingPermitsSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Parking Permits Search");

	}

	public void switchToParkingPermitAuthenticate() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmTraPFAuthenticate_Id");

	}

	public void switchToDeerCrashEntry() {
		objectIdentification.windowHandle.switchToWindow("Deer Crash");
	}

	public void switchToCitationArrest() {
		objectIdentification.windowHandle.switchToWindow("Citation Arrest");
	}

	public void switchToCrashReport() {
		objectIdentification.windowHandle.switchToWindow("Crash Report");
	}

	public class CrashEntry {

		public CrashEntryMainTab crashEntryMainTab;
		public WitnessTab witnessTab;
		public MotoristNonMotoristTab motoristNonMotoristTab;
		public OccupantsTab occupantsTab;
		public TruckBusTab truckBusTab;
		public CrashEntryNarrativeTab crashEntryNarrativeTab;
		public DiagramTab diagramTab;
		public DiagramTab2 diagramTab2;
		public CrashEntryMapTab crashEntryMapTab;
		public CrashEntryApprovalTab crashEntryApprovalTab;
		public PoliceActionTab policeActionTab;
		public AccidentTab accidentTab;
		public CrashEntryUnitTab crashEntryUnitTab;

		public CrashEntry() {

			if (crashEntryMainTab == null)
				crashEntryMainTab = new CrashEntryMainTab();

			if (witnessTab == null)
				witnessTab = new WitnessTab();

			if (motoristNonMotoristTab == null)
				motoristNonMotoristTab = new MotoristNonMotoristTab();

			if (occupantsTab == null)
				occupantsTab = new OccupantsTab();

			if (truckBusTab == null)
				truckBusTab = new TruckBusTab();

			if (crashEntryNarrativeTab == null)
				crashEntryNarrativeTab = new CrashEntryNarrativeTab();

			if (diagramTab == null)
				diagramTab = new DiagramTab();
			
			if (diagramTab2 == null)
				diagramTab2 = new DiagramTab2();

			if (crashEntryMapTab == null)
				crashEntryMapTab = new CrashEntryMapTab();

			if (crashEntryApprovalTab == null)
				crashEntryApprovalTab = new CrashEntryApprovalTab();

			if (policeActionTab == null)
				policeActionTab = new PoliceActionTab();

			if (accidentTab == null)
				accidentTab = new AccidentTab();

			if (crashEntryUnitTab == null)
				crashEntryUnitTab = new CrashEntryUnitTab();

			/*
			 * if(conclusionTab == null) conclusionTab = new ConclusionTab();
			 * 
			 * if(crashEntryAttachmentTab == null) crashEntryAttachmentTab = new
			 * CrashEntryAttachmentTab();
			 * 
			 * 
			 * 
			 * if(crashEntryTrailerTab == null) crashEntryTrailerTab = new
			 * CrashEntryTrailerTab();
			 * 
			 * if(propertyOwnerTab == null) propertyOwnerTab = new PropertyOwnerTab();
			 * 
			 * if(crashEntryCommentsTab == null) crashEntryCommentsTab = new
			 * CrashEntryCommentsTab();
			 */

		}

		public void verifyAtCrashNumber() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ActivityNo").substring(0, 2),
					uIMapTraffic.crashEntry.uICrashYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ActivityNo").substring(3),
					uIMapTraffic.crashEntry.uICrashNumberEdit.getAttribute("value"));
		}

		public void closeScreen() {
			uIMapTraffic.crashEntry.driver.close();
		}

		public void enterCaseNumberDetails() {
			uIMapTraffic.crashEntry.uICaseYearEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(3));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNo() {
			uIMapTraffic.crashEntry.uICaseYearEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(3));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNumber1() {
			uIMapTraffic.crashEntry.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CaseNo1").substring(0, 1));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo1").substring(4));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void clearTheCaseYearAndNo() {
			uIMapTraffic.crashEntry.uICaseYearEdit.clear();
			uIMapTraffic.crashEntry.uICaseNumberEdit.clear();
		}

		public void verifyTruckBusTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uITruckBusTab.getAttribute("class")
					.contains("igtab_BlueThemeTHText igtab_BlueThemeTHTextDis"));
		}

		public void verifyTruckBusTabEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uITruckBusTab.getAttribute("class").contains("igtab_BlueThemeTHText"));
		}

		public void clickCaseInfo() {
			Playback.pageLoadThreadWait();
			uIMapTraffic.crashEntry.uICaseDetailsInfoButton.click();
		}

		public void close() {
			uIMapTraffic.crashEntry.driver.close();
		}

		public void enterAtLocation() {

			uIMapTraffic.crashEntry.uILocationEdit.sendKeys(PoliceData.getTrafficModuleValue("Address"));
			uIMapTraffic.crashEntry.uILocationEdit.sendKeys(Keys.TAB);
			uIMapTraffic.crashEntry.uILocationCheckBox.sendKeys(Keys.TAB);

		}

		public void enterLocation(String address) {

			uIMapTraffic.crashEntry.uILocationEdit.sendKeys(address);
			uIMapTraffic.crashEntry.uILocationEdit.sendKeys(Keys.TAB);
			uIMapTraffic.crashEntry.uILocationCheckBox.sendKeys(Keys.TAB);

		}

		public void verifyInactiveAddressAcknowledge() {

			popUp.acknowledge.okWithExpectedMessage("(5097) This address is inactive");

		}

		public void verifyAcknowledgePremiseInactiveAddress() {
			popUp.acknowledge.okWithExpectedMessage("(5095) Premise is inactive");
		}

		public void enterLocation() {
			uIMapTraffic.crashEntry.uILocationEdit.sendKeys("b");
			uIMapTraffic.crashEntry.uILocationEdit.sendKeys(Keys.TAB);
			uIMapTraffic.crashEntry.uILocationCheckBox.sendKeys(Keys.TAB);
			// Geo.CommonNameHelp.SelectCommonName();
		}

		public void enterAtOfficer() {
			uIMapTraffic.crashEntry.uIOfficerEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.crashEntry.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void tabOutOfficer() {
			uIMapTraffic.crashEntry.uIOfficerEdit.click();
			uIMapTraffic.crashEntry.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void verifyLoggedPFAutopupulates() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("UserName"),
					uIMapTraffic.crashEntry.uIKSOfficerCodeEdit.getAttribute("value"));
		}

		public void verifyAtKSOfficer() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Officer"),
					uIMapTraffic.crashEntry.uIKSOfficerCodeEdit.getAttribute("value"));
		}

		public void selectOfficer() {
			uIMapTraffic.crashEntry.uIOfficerLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtNoOfUnits() {
			uIMapTraffic.crashEntry.uINoOfUnitsEdit.sendKeys(PoliceData.getTrafficModuleValue("NoOfUnits"));
		}

		public void enterAtUnit() {
			uIMapTraffic.crashEntry.uINoOfUnitsEdit.sendKeys(PoliceData.getTrafficModuleValue("Unit"));
		}

		public void save() {
			uIMapTraffic.crashEntry.uISaveButton.click();
			popUp.confirm.yes();

		}

		public void clickSaveButton() {
			uIMapTraffic.crashEntry.uISaveButton.click();
		}

		public void verify1051UpdateDataExistsInApprovalTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Approval Tab. You must save or reset.");
		}

		public void clickPrintButton() {
			uIMapTraffic.crashEntry.uIPrintButton.click();
		}

		public void yes() {
			popUp.confirm.yes();
		}

		public void enterCurrentDate() {
			uIMapTraffic.crashEntry.uIDateEdit.click();
			uIMapTraffic.crashEntry.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void enterCurrentTime() {
			uIMapTraffic.crashEntry.uITimeEdit.click();
			uIMapTraffic.crashEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void switchToMainTab() {
			uIMapTraffic.crashEntry.uICrashEntryMainTab.click();
		}

		public void switchToMotoristNonMotoristTab() {
			uIMapTraffic.crashEntry.uIMotoristNonMotoristTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("CrashMotorist");
		}
		
		public void switchToAttachmentTab() {
			uIMapTraffic.crashEntry.uIAttachmentTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void switchToWitnessTab() {
			uIMapTraffic.crashEntry.uIWitnessTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("Witness");
		}

		public void switchToOccupantsTab() {
			uIMapTraffic.crashEntry.uIOccupantsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmOccupants");
		}

		public void switchToTruckBusTab() {
			uIMapTraffic.crashEntry.uITruckBusTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("TruckBus");
		}

		public void switchToNarrativeTab() {
			uIMapTraffic.crashEntry.uINarrativeTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void switchToNarrative2Tab() {
			uIMapTraffic.crashEntry.uINarrative2Tab.click();
            	objectIdentification.windowHandle.switchToFrame("frmNameComments.aspx");
			Playback.controlReadyThreadWait();
		}

		public void switchToDiagramTab() {
			uIMapTraffic.crashEntry.uIDiagramTab.click();
		}

		public void switchToDiagram2Tab() {
			uIMapTraffic.crashEntry.uIDiagram2Tab.click();
		}

		public void switchToMapTab() {
			uIMapTraffic.crashEntry.uIMapTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("GHydrantMap");
		}

		public void switchToPoliceActionTab() {
			uIMapTraffic.crashEntry.uIPoliceActionTab.click();

		}

		public void switchToAllTab() {
			Playback.pageLoadThreadWait();
			uIMapTraffic.crashEntry.uICrashEntryMainTab.click();
			uIMapTraffic.crashEntry.uIMotoristNonMotoristTab.click();
			uIMapTraffic.crashEntry.uIOccupantsTab.click();
			uIMapTraffic.crashEntry.uIWitnessTab.click();
			uIMapTraffic.crashEntry.uINarrativeTab.click();
			uIMapTraffic.crashEntry.uIDiagramTab.click();
			uIMapTraffic.crashEntry.uIPoliceActionTab.click();
			uIMapTraffic.crashEntry.uIAttachmentTab.click();
			uIMapTraffic.crashEntry.uICommentsTab.click();
			uIMapTraffic.crashEntry.uIMapTab.click();
			// uIMapTraffic.crashEntry.uIApprovalTab.click();
			Playback.pageLoadThreadWait();
		}

		public void switchToApprovalTab() {
			uIMapTraffic.crashEntry.uIApprovalTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPnxGlobalApproval");
		}

		public void clickApprovalTab() {
			uIMapTraffic.crashEntry.uIApprovalTab.click();
		}

		public void clickWitnessTab() {
			uIMapTraffic.crashEntry.uIWitnessTab.click();
		}

	public void verify10089ActionTabConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage(
						"(10089) Action Tab- Case status is pending.Do you want to submit?");
			} else
				popUp.confirm
						.yesWithExpectedMessage("(10089) Action Tab- Case status is pending.Do you want to submit?");

		}

		public void switchToKSStateTabs() {
			uIMapTraffic.crashEntry.uICrashEntryMainTab.click();
			uIMapTraffic.crashEntry.uIMotoristNonMotoristTab.click();
			uIMapTraffic.crashEntry.uIOccupantsTab.click();
			uIMapTraffic.crashEntry.uIWitnessTab.click();
			uIMapTraffic.crashEntry.uINarrative1Tab.click();
			uIMapTraffic.crashEntry.uIDiagramTab.click();
			uIMapTraffic.crashEntry.uINarrative2Tab.click();
			uIMapTraffic.crashEntry.uIPoliceActionTab.click();
			uIMapTraffic.crashEntry.uIAttachmentTab.click();
			uIMapTraffic.crashEntry.uIErrorTab.click();
			uIMapTraffic.crashEntry.uICommentsTab.click();
			uIMapTraffic.crashEntry.uIMapTab.click();
			uIMapTraffic.crashEntry.uIApprovalTab.click();
			Playback.pageLoadThreadWait();
		}

		public void clickAtTab() {
			WebElement tab = uIMapTraffic.crashEntry.driver.findElement(
					By.xpath("//span[contains(text(),'" + PoliceData.getTrafficModuleValue("Tab") + "')]"));
			tab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void verifyCaseInfoAppears() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uICaseDetailsInfoButton.isDisplayed());
		}

		public void verifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2),
					uIMapTraffic.crashEntry.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CaseNo").substring(3),
					uIMapTraffic.crashEntry.uICaseNumberEdit.getAttribute("value"));
		}

		public void verifyCaseFieldDisabled() {
			String caseYear = uIMapTraffic.crashEntry.uICaseYearEdit.getAttribute("class");
			verify.ExpectedValueIsTrue(caseYear.contains("textboxInactive"));
			String caseNo = uIMapTraffic.crashEntry.uICaseNumberEdit.getAttribute("class");
			verify.ExpectedValueIsTrue(caseNo.contains("textboxInactive"));
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Location"),
					uIMapTraffic.crashEntry.uILocationEdit.getAttribute("value"));

		}

		public void verifyLocationDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uILocationEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyReportedDateTimeDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIDateEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uITimeEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyOfficerFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIOfficerEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyKSOfficerFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIKSOfficerCodeEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyBadgeFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIBadgeNumberEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyAtUnit() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Units"),
					uIMapTraffic.crashEntry.uINoOfUnitsEdit.getAttribute("value"));
		}

		public void verifyNoOFUnitsFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uINoOfUnitsEdit.getAttribute("class").contains("textbox"));
		}

		public void verifyAtActiveLocation(String location) {
			verify.ExpectedPropertyValueIsEqual(location, uIMapTraffic.crashEntry.uILocationEdit.getAttribute("value"));
		}

		public void verifyAtActiveReportedDateAndTime(String caseReportedDate1, String caseReportedTime1) {
			verify.ExpectedPropertyValueIsEqual(caseReportedDate1,
					uIMapTraffic.crashEntry.uIDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseReportedTime1,
					uIMapTraffic.crashEntry.uITimeEdit.getAttribute("value"));
		}

		public void getLocation(String location) {
			location = uIMapTraffic.crashEntry.uILocationEdit.getAttribute("value");
		}

		public void verifyAtOfficerBadge() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("OfficerBadge"),
					uIMapTraffic.crashEntry.uIBadgeNumberEdit.getAttribute("value"));
		}

		public void verifyAtKSBadge() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Badge"),
					uIMapTraffic.crashEntry.uIBadgeNumberEdit.getAttribute("value"));
		}

		public void verifyStatusAsOnHold() {
			verify.ExpectedPropertyValueIsEqual("On Hold", uIMapTraffic.crashEntry.uIStatusTextView.getText());
		}

		public void verifyStatusAsOnHoldAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("On Hold", uIMapTraffic.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsApprovedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Approved", uIMapTraffic.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsLockedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Locked", uIMapTraffic.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifySaveButtonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uISaveButton.getAttribute("class").contains("DisabledImgMnuItem"));
		}

		public void verifySaveNCloseButtonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uISaveAndCloseButton.getAttribute("class").contains("DisabledImgMnuItem"));
		}

		public void verifyStatusAsSubmittedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Submitted", uIMapTraffic.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsRejectedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Rejected", uIMapTraffic.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyNarrative2Enabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uINarrative2Tab.isEnabled());
		}

		public void verifyDiagram2Enabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uIDiagram2Tab.isEnabled());
		}

		public String getActiveCrashNumber() {
			String CrashYear = uIMapTraffic.crashEntry.uICrashYearEdit.getAttribute("value");
			String CrashNumber = uIMapTraffic.crashEntry.uICrashNumberEdit.getAttribute("value");
			String CrashNoDetails = CrashYear + "-" + CrashNumber;
			return CrashNoDetails;
		}

		public void verifyMenuBarIcons() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIDeleteIconButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uISaveButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uISaveAndCloseButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uIResetButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIPrintButton.getAttribute("src").contains("16_print.gif"));
		}

		public void verifyApprovedAndColor() {
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.crashEntry.uIStatusTextView.getText(), "Approved");
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAppearInGreenColor() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verify1003UpdateSuccessfulFooterMessage() {
			Playback.waitForPageLoad();
			String AdditionMessage = uIMapTraffic.crashEntry.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1003 - Update Successful"));
		}

		public void clickDeleteIcon() {
			uIMapTraffic.crashEntry.uIDeleteIconButton.click();
		}

		public void clickResetButton() {
			uIMapTraffic.crashEntry.uIResetButton.click();
		}

		public void verifyConfirmDelete() {

			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
				// popUp.confirm.yes();
			} else
				popUp.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void verify1019DuplicationOfDataFound() {
			popUp.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void verifyAtCrashNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CrashNo").substring(0, 2),
					uIMapTraffic.crashEntry.uICrashYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CrashNo").substring(3),
					uIMapTraffic.crashEntry.uICrashNumberEdit.getAttribute("value"));
		}

		public void clickNotificationIcon() {
			uIMapTraffic.crashEntry.uINotificationIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickALCIcon() {
			uIMapTraffic.crashEntry.uIALCIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyReportReviseConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm
						.yesWithExpectedMessage("(9165) Report is already submitted. Do you want to revise it?");
			} else
				popUp.confirm.yesWithExpectedMessage("(9165) Report is already submitted. Do you want to revise it?");

		}

		public void verifyCrashNoAutogenerated() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentYear().substring(2, 4),
					uIMapTraffic.crashEntry.uICrashYearEdit.getAttribute("value"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uICrashNumberEdit.getAttribute("value").contains("000"));
		}

		public void verifyAtWITracsRefNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("TracsRefNo").substring(0, 2),
					uIMapTraffic.crashEntry.uIWITracsYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("TracsRefNo").substring(3),
					uIMapTraffic.crashEntry.uIWITracsNumberEdit.getAttribute("value"));
		}

		public void clickWIWitnessTab() {
			uIMapTraffic.crashEntry.uIWitnessTab.click();
			Playback.pageLoadThreadWait();

		}

		public void verifyWIUpdateAcknowledgeMessageWitnessTab() {
			popUp.acknowledge.okWithExpectedMessage("(1056) Updated data exists in the fields. You must save or reset");
		}

		public void verifyAtReportedLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ReportedLocation"),
					uIMapTraffic.crashEntry.uIWIReportedLocationEdit.getAttribute("value"));
		}

		public void saveScreen() {
			uIMapTraffic.crashEntry.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void saveNClose() {
			uIMapTraffic.crashEntry.uISaveAndCloseButton.click();
			popUp.confirm.yes();
		}

		public void enterDOTNo() {
			uIMapTraffic.crashEntry.uIDOTNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAmendedNo() {
			uIMapTraffic.crashEntry.uIAmendedNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAccidentNo() {
			uIMapTraffic.crashEntry.uIAccidentNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void verifyWIDateAndTime(String caseReportedDate1, String caseReportedTime1) {
			verify.ExpectedPropertyValueIsEqual(caseReportedDate1,
					uIMapTraffic.crashEntry.uIWIDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseReportedTime1,
					uIMapTraffic.crashEntry.uIWITimeEdit.getAttribute("value"));
		}

		public void verifyWITruckBusTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.uIWITruckBusTab.isEnabled());
		}

		public void switchToWITruckBusTab() {
			uIMapTraffic.crashEntry.uIWITruckBusTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTruckBus");
			Playback.controlReadyThreadWait();
		}

		public void switchToWIAllTab() {
			Playback.pageLoadThreadWait();
			uIMapTraffic.crashEntry.uICrashEntryMainTab.click();
			uIMapTraffic.crashEntry.uIWIAccidentTab.click();
			// uIMapTraffic.crashEntry.uIWIUnitTab.click();
			// uIMapTraffic.crashEntry.uIWITrailerTab.click();
			// uIMapTraffic.crashEntry.uIOccupantsTab.click();
			uIMapTraffic.crashEntry.uIWIConclusionTab.click();
			uIMapTraffic.crashEntry.uIWIPropertyOwnerTab.click();
			uIMapTraffic.crashEntry.uIWitnessTab.click();
			uIMapTraffic.crashEntry.uINarrativeTab.click();
			uIMapTraffic.crashEntry.uIWICommentsTab.click();
			uIMapTraffic.crashEntry.uIAttachmentTab.click();
			uIMapTraffic.crashEntry.uIMapTab.click();
			// uIMapTraffic.crashEntry.uIApprovalTab.click();
			Playback.pageLoadThreadWait();

		}

		public void enterAtWIOfficer() {
			uIMapTraffic.crashEntry.uIWIOfficerCodeEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.crashEntry.uIWIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void switchToWIAccidentTab() {
			uIMapTraffic.crashEntry.uIWIStateAccidentTab.click();
			Playback.controlReadyThreadWait();
		}

		public void switchToWIUnitTab() {
			uIMapTraffic.crashEntry.uIWIUnitTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmUnit");
			Playback.controlReadyThreadWait();
		}

		public void switchToWITrailerTab() {
			uIMapTraffic.crashEntry.uIWITrailerTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTrailer");
			Playback.controlReadyThreadWait();

		}

		public void enterAtVehicle() {
			uIMapTraffic.crashEntry.uIVehicleNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void cancleVerifyReportReviseConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm
						.noWithExpectedMessage("(9165) Report is already submitted. Do you want to revise it?");
			} else {
				popUp.confirm.noWithExpectedMessage("(9165) Report is already submitted. Do you want to revise it?");
			}

		}

		public void verifyCaseNotValidated() {
			String src = uIMapTraffic.crashEntry.uICaseDetailsInfoButton.getAttribute("src");
			verify.ExpectedValueIsTrue(src.contains("detail.gif"));
		}

		public void verifyCaseValidated() {
			String src = uIMapTraffic.crashEntry.uICaseDetailsInfoButton.getAttribute("src");
			verify.ExpectedValueIsTrue(src.contains("debug.gif"));
		}

		public void enterAtCallNo() {
			uIMapTraffic.crashEntry.uICallYearEdit.sendKeys(PoliceData.getTrafficModuleValue("CallNo").substring(0, 2));
			uIMapTraffic.crashEntry.uICallNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CallNo").substring(3));
			uIMapTraffic.crashEntry.uICallNumberEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void enterAtOfficerLookUpEdit() {
			uIMapTraffic.crashEntry.uIKSOfficerCodeEdit.click();
			uIMapTraffic.crashEntry.uIKSOfficerCodeEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.crashEntry.uIKSOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAdditionSuccessfulAcknowledgeMessage() {
			popUp.switchToAcknowledge();
			popUp.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
		}

		public void verifyUpdateSuccessfulAcknowledgeMessage() {

			popUp.switchToAcknowledge();
			popUp.acknowledge.okWithExpectedMessage("1003 - Update Successful");
		}

		public void verifyStatusAsSubmitted() {
			verify.ExpectedPropertyValueIsEqual("Submitted", uIMapTraffic.crashEntry.uIStatusTextView.getText());
		}

		public String readCrashNo() {
			String year = uIMapTraffic.crashEntry.uICrashYearEdit.getAttribute("value");
			String number = uIMapTraffic.crashEntry.uICrashNumberEdit.getAttribute("value");
			String crashNo = year + "-" + number;
			return crashNo;
		}
		public void tabReportedDateTime() {

			uIMapTraffic.crashEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapTraffic.crashEntry.uITimeEdit.sendKeys(Keys.TAB);
		}
        public void verify1002AdditionSuccessfulAcknowledgeMessage() 
		{
			popUp.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
		}

		public void verifyAtCSZ() 
		{
			String attribute = uIMapTraffic.crashEntry.uICSZCityEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getTrafficModuleValue("CSZCity")));
		}

		public void enterAtCaseNo1() 
		{
			uIMapTraffic.crashEntry.uICaseYearEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo1").substring(0, 2));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo1").substring(3));
			uIMapTraffic.crashEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void verifyReportedLocationInfoIconIsDisplayed() {
			uIMapTraffic.crashEntry.uIReportedLocationInfoIcon.isDisplayed();
			
		}
		public void clickReportedLocationInfoIcon() {
			uIMapTraffic.crashEntry.uIReportedLocationInfoIcon.click();
		}
	}

	public class CrashEntryMainTab {
		public void clickNJTR1BCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uINJTR1BCheckBox.click();
		}

		public void clickKSFatalCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIKSFatalCheckBox.click();
		}

		public void selectStationPrecinct() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIStationPrecinctComboBox);
		}

		public void clickReportableCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIReportableCheckBox.click();
		}

		public void enterAtCrossRoad() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uICrossRoadNameEdit.click();
			uIMapTraffic.crashEntry.crashEntryMainTab.uICrossRoadNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CrossRoad"));
			uIMapTraffic.crashEntry.crashEntryMainTab.uICrossRoadNameVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void enterAtCity() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uICityEdit.sendKeys(PoliceData.getTrafficModuleValue("City"));
		}

		public void selectCounty() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uICountyComboBox);
		}

		public void tabOutDateOfAccident() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIDateOfAccidentEdit.sendKeys(Keys.TAB);
		}

		public void tabOutTimeOfAccident() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uITimeOfAccidentEdit.sendKeys(Keys.TAB);
		}

		public void verifyDayFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIDayComboBox.getAttribute("disabled") == "true");
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Location"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uILocationEdit.getAttribute("value"));
		}

		public void verifyAtBlockNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("BlockNo"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIBlockNoEdit.getAttribute("value"));
		}

		public void selectRoadDividedBy() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadDividedByComboBox);
		}

		public void selectTemproraryTrafficControlZone() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uITemproraryTrafficControlZoneComboBox);
		}

		public void selectLightCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uILightConditionComboBox);
		}

		public void selectKSLightCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIKSLightConditionComboBox);
		}

		public void selectKSIntersectionType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIIntersectionTypeComboBox);
		}

		public void selectKSLocationWorkZone() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uILocationWorkZoneComboBox);
		}

		public void selectAdverseWeatherConditionAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIAdverseWeatherConditionsComboBox,
					"88 - Other(Specify)");
		}

		public void verifyAdverseWeatherConditionsFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIAdverseWeatherConditionsEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAdverseWeatherCondition() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIAdverseWeatherConditionsEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSystem() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSystemComboBox);
		}

		public void selectRoadCharacter() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadCharacterComboBox);
		}

		public void selectRoadSurfaceConditions() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSurfaceConditionsComboBox);
		}

		public void selectRoadSurfaceType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSurfaceTypeComboBox);
		}

		public void selectEnvironmentCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIEnvironmentConditionComboBox);
		}

		public void enterTotalInjured() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uITotalInjuredEdit.sendKeys(Randomized.randomNumberString(1));
		}

		public void selectWithOtherMVasFirstEvent() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox);
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox.sendKeys(Keys.TAB);
		}

		public void selectAsWithOtherMVasFirstEvent() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox.sendKeys("  --  ");
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox.sendKeys(Keys.TAB);
		}

		public void selectWithBelowasFirstEvent() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIWithBelowAsFirstEventComboBox);
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWithBelowAsFirstEventComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtPoliceDept() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("PoliceDept"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIPoliceDptOfEdit.getAttribute("value"));
		}

		public void verifyAtKSPoliceDepartment() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("PoliceDept"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIKSPoliceDepartmentEdit.getAttribute("value"));
		}

		public void verifyAtCode2() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.crashEntry.crashEntryMainTab.uICode2ComboBox)
					.contains(PoliceData.getTrafficModuleValue("Code2")));
		}

		public void verifyDateofCrashAsReportedDate() {
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.crashEntry.uIDateEdit.getAttribute("value"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIDateOfCrashEdit.getAttribute("value"));
		}

		public void verifyDateSameAsReportedDate() {
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.crashEntry.uIDateEdit.getAttribute("value"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIDateOfAccidentEdit.getAttribute("value"));
		}

		public void verifyTimeofCrashAsReportedTime() {
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.crashEntry.uITimeEdit.getAttribute("value"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uITimeOfCrashEdit.getAttribute("value"));
		}

		public void verifyAtMunicipalityCodeName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("MunicipalityCode"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIMunicipalityCodeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("MunicipalityName"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIMunicipalityCodeTextView.getAttribute("value"));
		}

		public void selectMunicipalityCode() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIMunicipalityCodeLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyRoadNameAsLocation() {
			String location = Randomized
					.removeStringByIndexCount(uIMapTraffic.crashEntry.uILocationEdit.getAttribute("value"), 0, 5);
			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(location, 10, ";PX"),
					uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadNameEdit.getAttribute("value"));
		}

		public void verifyWithBelowAsFirstEventGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIWithBelowAsFirstEventComboBox
					.getAttribute("disabled") == "true");
		}

		public void verifyWithOtherMVAsFirstEventGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox
					.getAttribute("disabled") == "true");
		}

		public void verify10086MandatoryDataMissingCountyAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing County");
		}

		public void verify10086MandatoryDataMissingTimeOfAccidentAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Time of Accident");
		}

		public void verify10086MandatoryDataMissingLightConditionsAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Light Conditions");
		}

		public void verify10086MandatoryDataMissingIntersectionTypeAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Intersection Type");
		}

		public void verify10086MandatoryDataMissingAdverseWeatherConditionsAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Adverse Weather Conditions");
		}

		public void verify10086MandatoryDataMissingSurfaceConditionsAckMsg() {
			verify.ExpectedValueIsTrue(popUp.uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Surface Conditions"));
			popUp.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingSurfaceTypeAckMsg() {
			verify.ExpectedValueIsTrue(popUp.uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Surface Type"));
			popUp.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingAccidentLocationAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Accident Location");
		}

		public void verify10086MandatoryDataMissingTrafficControlsAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Traffic Control");
		}

		public void verify10086MandatoryDataMissingWorkZoneTypeAckMsg() {
			verify.ExpectedValueIsTrue(popUp.uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Work Zone Type"));
			popUp.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingAccidentClass1stHarmfulAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Accident Class(1st Harmful)");
		}

		public void verify10086MandatoryDataMissingRoadSpecialFeaturesAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Road Special Features");
		}

		public void verify10086MandatoryDataMissingWorkZoneCategoryAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Work Zone Category");
		}

		public void verify10086MandatoryDataMissingFixedObjectType1stHarmfulAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Fixed Object Type(1st Harmful)");
		}

		public void verify10086MandatoryDataMissingRoadwayNumberOfLanesAckMsg() {
			verify.ExpectedValueIsTrue(popUp.uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Roadway Number of Lanes"));
			popUp.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingRoadCharacterAckMsg() {
			verify.ExpectedValueIsTrue(popUp.uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Road Character"));
			popUp.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingCollisionWithVehicle1stHarmfulAckMsg() {
			popUp.acknowledge
					.okWithExpectedMessage("(10086) Mandatory data missing Collision With Vechicle(1st Harmful)");
		}

		public void verify10086MandatoryDataMissingSpecialJurisdictionAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Special Jurisdiction");
		}

		public void selectSurfaceConditionOnAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uISurfaceConditionsOnComboBox, "88 - Other(Specify)");
		}

		public void verifySurfaceConditionsOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uISurfaceConditionsOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInSurfaceConditionOn() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uISurfaceConditionsOnEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectSurfaceTypeOnAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uISurfaceTypeOnComboBox, "88 - Other(Specify)");
		}

		public void verifySurfaceTypeOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uISurfaceTypeOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInSurfaceTypeOn() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uISurfaceTypeOnEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectAccidentLocationOnAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentLocationComboBox, "88 - Other(Specify)");
		}

		public void verifyAccidentLocationOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentLocationEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAccidentLocation() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentLocationEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectOnAt() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uITrafficControlsOnAtComboBox);
		}

		public void selectTypePresentAsOther() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uITrafficControlsTypePresentComboBox, "Other");
		}

		public void selectOKNF() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uITrafficControlsOkNFComboBox);
		}

		public void verifyTrafficControlFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uITrafficControlsEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInTrafficControl() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uITrafficControlsEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectWorkZoneTypeOnAs01ConstructionZone() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIWorkZoneTypeOnComboBox, "01 - Construction Zone");
		}

		public void selectAccidentClass1stHarmfulEventAs07AnimalType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentClass1stHarmfulEventComboBox,
					"07 - Animal Type");
		}

		public void verifyAccidentClass1stHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentClass1stHarmfulEventEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAccidentClass1stHarmfulEvent() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentClass1stHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectAccidentClassMostHarmfulEventAs09OtherObject() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentClassMostHarmfulEventComboBox,
					"09 - Other Object");
		}

		public void verifyAccidentClassMostHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentClassMostHarmfulEventEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAccidentClassMostHarmfulEvent() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIAccidentClassMostHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSpecialFeatures1stAs01Bridge() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures1stComboBox, "01 - Bridge");
		}

		public void verifyRoadSpecialFeatures1stFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures1stEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadSpecialFeatures1stField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures1stEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSpecialFeatures2ndAs04RRXING() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures2ndComboBox, "04 - RRXING");
		}

		public void verifyRoadSpecialFeatures2ndFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures2ndEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadSpecialFeatures2ndField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures2ndEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSpecialFeatures3rd() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures3rdComboBox);
		}

		public void selectWorkZoneCategoryAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIWorkZoneCategoryComboBox, "88 - Other(Specify)");
		}

		public void verifyWorkZoneCategoryFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIWorkZoneCategoryEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInWorkZoneCategoryField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWorkZoneCategoryEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectFixedObjectType1stHarmfulEventAsOther() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIFixedObjectType1stHarmfulEventComboBox, "Other");
		}

		public void verifyFixedObjectType1stHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIFixedObjectType1stHarmfulEventEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInFixedObjectType1stHarmfulEventField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIFixedObjectType1stHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectFixedObjectTypeMostHarmfulEvent() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIFixedObjectTypeMostHarmfulEventComboBox);
		}

		public void selectRoadwayNumberOfLanesOnAsOtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadwayNumberOfLanesOnComboBox, "Other(Specify)");
		}

		public void verifyRoadwayNumberOfLanesOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadwayNumberOfLanesOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadwayNumberOfLanesOnField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadwayNumberOfLanesOnEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadCharacterOnAsOther() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadCharacterOnComboBox, "Other");
		}

		public void verifyRoadCharacterOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadCharacterOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadCharacterOnField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadCharacterOnEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectCollisionWithVehicle1stHarmfulEventAs88Other() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uICollisionWithVehicle1stHarmfulEventComboBox,
					"88 - Other");
		}

		public void verifyCollisionWithVehicle1stHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.crashEntryMainTab.uICollisionWithVehicle1stHarmfulEventEdit
							.getAttribute("class").contains("textbox"));
		}

		public void enterTextInCollisionWithVehicle1stHarmfulEventField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uICollisionWithVehicle1stHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectCollisionWithVehicleMostHarmfulEvent() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uICollisionWithVehicleMostHarmfulEventComboBox);
		}

		public void selectSpecialJurisdictionAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uISpecialJurisdictionComboBox, "88 - Other(Specify)");
		}

		public void verifySpecialJurisdictionFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uISpecialJurisdictionEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInSpecialJurisdictionField() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uISpecialJurisdictionEdit.sendKeys(Randomized.randomString(10));
		}

		public String getActiveLatLongValue() {
			String Latitute = uIMapTraffic.crashEntry.crashEntryMainTab.uILatituteEdit.getAttribute("value");
			String Longitute = uIMapTraffic.crashEntry.crashEntryMainTab.uILongitudeEdit.getAttribute("value");
			String LatLongValue = Latitute + " / " + Longitute;
			return LatLongValue;
		}

		public void getKSLatLongValue(String LatLongValue) {
			String Latitute = uIMapTraffic.crashEntry.crashEntryMainTab.uIKSLatituteEdit.getAttribute("value");
			String Longitute = uIMapTraffic.crashEntry.crashEntryMainTab.uIKSLongitudeEdit.getAttribute("value");
			LatLongValue = Latitute + " / " + Longitute;
		}

		public void selectRoadCharacterHorizontalAlignment() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadCharacterHorizontalAlignmentComboBox);
		}

		public void selectRoadCharacterGrade() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadCharacterGradeComboBox);
		}

		public void selectCrashType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uICrashTypeComboBox);
		}

		public void selectFirstHarmfulEvent() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIFirstHarmfulEventComboBox);
		}

		public void clickDamageToOtherPropertyCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIDamageOtherPropertyCheckBox.click();
		}

		public void enterDamageToOtherProperty() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIDamageToOtherPropertyEdit.sendKeys(Randomized.randomString(10));
		}

		public void clickWIReportableCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIReportableCheckBox.click();
		}

		public void clickWITruckBusCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWITruckBusCheckBox.click();
		}

		public void clickWITruckWith2Axles6TiresCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWITruckWith2Axles6TiresCheckBox.click();
		}

		public void clickWIMedicalTransportCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIMedicalTransportCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void enterWITotalInjured() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWITotalInjuiredEdit.sendKeys(Randomized.randomNumberString(1));
		}

		public void enterWITotalKilled() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWITotalKilledEdit.sendKeys(Randomized.randomNumberString(1));
		}

		public void enterAtWITotalUnit() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWITotalUnitEdit
					.sendKeys(PoliceData.getTrafficModuleValue("TotalUnits"));
		}

		public void enterAtEMSNo() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIEMSNoEdit.sendKeys(PoliceData.getTrafficModuleValue("EMSNo"));
		}

		public void clickWIFireCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIFireCheckBox.click();
		}

		public void clickWIHitAndRunCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIHitAndRunCheckBox.click();
		}

		public void clickWIGovermentPropertyCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIGovermentPropertyCheckBox.click();
		}

		public void clickWITrailerTowedCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWITrailerTowedCheckBox.click();
		}

		public void verifyTruckRelatedCheckboxEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIWITruckWith2Axles6TiresCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIWITruckWithHazardousPlacardCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIWIBusCarry16PersonsCheckBox.isEnabled());
		}

		public void verifyFatelMedicalTowedCheckboxEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIWIFatalInjuryCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.crashEntryMainTab.uIWIMedicalTransportCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryMainTab.uIWITowedCheckBox.isEnabled());
		}

		public void clickWIPhotoTakenCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIPhotoTakenCheckBox.click();
		}

		public void clickWIFatalInjuryCheckBox() {
			uIMapTraffic.crashEntry.crashEntryMainTab.uIWIFatalInjuryCheckBox.click();
			Playback.controlReadyThreadWait();
		}

			public void verifyAtRoadName()
		{
			String text = uIMapTraffic.crashEntry.crashEntryMainTab.uIRoadNameEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getTrafficModuleValue("RoadName")));
		}
		public void selectStationPrecinctAsStation()
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryMainTab.uIStationPrecinctComboBox, "Station");
			
		}
	}

	public class WitnessTab {

		public void enterAtOfficer() {
			uIMapTraffic.crashEntry.witnessTab.uIOfficerEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.crashEntry.witnessTab.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void enterName() {
			uIMapTraffic.crashEntry.witnessTab.uILastNameEdit.sendKeys("veera");
			uIMapTraffic.crashEntry.witnessTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void enterAtName() {
			uIMapTraffic.crashEntry.witnessTab.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("LastName"));
			uIMapTraffic.crashEntry.witnessTab.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("FirstName"));
			uIMapTraffic.crashEntry.witnessTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			// Names.NameSearchHelpWindow.SelectName();

		}

		public void enterAtWINameID() {
			uIMapTraffic.crashEntry.witnessTab.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(0, 1));
			uIMapTraffic.crashEntry.witnessTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(2));
			uIMapTraffic.crashEntry.witnessTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtHomePhone() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("HomePhone"),
					uIMapTraffic.crashEntry.witnessTab.uIHomePhoneEdit.getAttribute("value"));
		}

		public void verifyAtWorkPhone() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("WorkPhone"),
					uIMapTraffic.crashEntry.witnessTab.uIWorkPhoneEdit.getAttribute("value"));
		}

		public void clickNameInfoBubbleIcon() {
			uIMapTraffic.crashEntry.witnessTab.uINameInfoButton.click();
		}

		public void clickAddbutton() {
			uIMapTraffic.crashEntry.witnessTab.uIAddButton.click();
		}

		public void clickWIAddbutton() {
			uIMapTraffic.crashEntry.witnessTab.uIAddButton.click();
		}

		public void clickKSAddbutton() {
			uIMapTraffic.crashEntry.witnessTab.uIKSAddButton.click();
		}

		public void clickTextEditor() {
			uIMapTraffic.crashEntry.witnessTab.uITextEditorButton.click();
		}

		public void verifyLocation(String location) {
			verify.ExpectedPropertyValueIsEqual(location,
					uIMapTraffic.crashEntry.witnessTab.uILocationEdit.getAttribute("value"));
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Location"),
					uIMapTraffic.crashEntry.witnessTab.uILocationEdit.getAttribute("value"));
		}

		public void verifyHomePhoneAtWorkPhone() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("WorkPhone"),
					uIMapTraffic.crashEntry.witnessTab.uIHomePhoneEdit.getAttribute("value"));
		}

		public void verifyWorkPhoneAtHomePhone() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("HomePhone"),
					uIMapTraffic.crashEntry.witnessTab.uIWorkPhoneEdit.getAttribute("value"));
		}

		public void verifyTextEditorEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.witnessTab.uITextEditorButton.isEnabled());
		}

		public void verifyTextEditordisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.witnessTab.uITextEditorButton.getAttribute("disabled").contains("true"));
		}

		public void verifyAcknowledgeUpdateWitnessTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Witness Tab. You must save or reset.");
		}

		public void internalSave() {
			uIMapTraffic.crashEntry.witnessTab.uIInternalSaveButton.click();
			popUp.confirm.yes();
		}

		public void selectFirstRowGrid(int rowIndex) {
			objectIdentification.manualIdentify.selectGridTableRow(uIMapTraffic.crashEntry.witnessTab.uIWitnessTabTable,
					rowIndex);
		}

		public void verifyAtWINameInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashEntry.witnessTab.uIWIWitnessTabTable,
									PoliceData.getTrafficModuleValue("Name"))
							.getText());
		}

		public void verifyWitnessUpdateStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.witnessTab.uIWitnessTabStatusBar.getText()
					.contains("1003 - Update Successful"));
		}

		public void verifyAtWINameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashEntry.witnessTab.uIWIWitnessTabTable, "Name", rowIndex));
		}

		public void verifyAtWIName1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Name1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashEntry.witnessTab.uIWIWitnessTabTable, "Name", rowIndex));
		}

		public void DeleteAtWINameInGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapTraffic.crashEntry.witnessTab.uIWIWitnessTabTable, PoliceData.getTrafficModuleValue("Name"));
			popUp.confirm.yes();
		}

		public void verifyDeletedRowCountInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapTraffic.crashEntry.witnessTab.uIWIWitnessTabTable) == rowIndex);
		}

		public void verifyAtWIPhoneInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Phone"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashEntry.witnessTab.uIWIWitnessTabTable, "Phone#", rowIndex));
		}
	}

	public class MotoristNonMotoristTab {
		public void enterAtUnitNo() {
			uIMapTraffic.crashEntry.motoristNonMotoristTab.uIUnitNoEdit
					.sendKeys(PoliceData.getTrafficModuleValue("UnitNo"));
		}

public void enterAtUnitNo1() {
			uIMapTraffic.crashEntry.motoristNonMotoristTab.uIUnitNoEdit
					.sendKeys(PoliceData.getTrafficModuleValue("UnitNo1"));
		}

		// public void enterUnitNo()
		// {
		// uIMapTraffic.crashEntry.MotoristNonMotoristTab.uIUnitNoEdit.sendKeys(Randomized.GetRandomNumber(3).ToString());
		// }

		public void verifyNoUnitInGrid() {
			verify.ExpectedIntergerValueIsEqualToActual(0, objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapTraffic.crashEntry.motoristNonMotoristTab.uIMotoristNonMotoristTabResultGrid));
		}

		public void clickAddButton() {
			uIMapTraffic.crashEntry.motoristNonMotoristTab.uIAddButton.click();
		}

		public void selectRowByAtUnit(int rowIndex) {
			WebElement cell = objectIdentification.manualIdentify.getGridCell(
					uIMapTraffic.crashEntry.motoristNonMotoristTab.uIMotoristNonMotoristTabResultGrid, "Unit #",
					rowIndex);
			cell.click();
		}

		public void verifyAtUnitInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Unit"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapTraffic.crashEntry.motoristNonMotoristTab.uIMotoristNonMotoristTabResultGrid, "Unit #",
							rowIndex).getText());
		}

		public void selectGridRow(int rowIndex) {

			WebElement Cell = objectIdentification.manualIdentify.getGridCell(
					uIMapTraffic.crashEntry.motoristNonMotoristTab.uIMotoristNonMotoristTabResultGrid,
					"Vehicle Plate #", rowIndex);
			Cell.click();
		}

		public void verifyAtPlateNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("PlateNumber"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapTraffic.crashEntry.motoristNonMotoristTab.uIMotoristNonMotoristTabResultGrid,
							"Vehicle Plate #", rowIndex).getText());
		}

	}

	public class OccupantsTab {
		public void verifyAtUnitNo() {
			if (Playback.browserType == "Chrome") {
				verify.ExpectedPropertyValueIsEqual(
						objectIdentification.manualIdentify
								.getDropDownSelectedItem(uIMapTraffic.crashEntry.occupantsTab.uIUnitNoComboBox),
						PoliceData.getTrafficModuleValue("Unitno") + "   ");
			} else

				verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Unitno"),
						objectIdentification.manualIdentify
								.getDropDownSelectedItem(uIMapTraffic.crashEntry.occupantsTab.uIUnitNoComboBox));
		}

public void verifyAtUnitNo1() {
			if (Playback.browserType == "Chrome") {
				verify.ExpectedPropertyValueIsEqual(
						objectIdentification.manualIdentify
								.getDropDownSelectedItem(uIMapTraffic.crashEntry.occupantsTab.uIUnitNoComboBox),
						PoliceData.getTrafficModuleValue("Unitno1") + "   ");
			} else

				verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Unitno1"),
						objectIdentification.manualIdentify
								.getDropDownSelectedItem(uIMapTraffic.crashEntry.occupantsTab.uIUnitNoComboBox));
		}
		public void enterOccupant() {
			uIMapTraffic.crashEntry.occupantsTab.uILastNameEdit.sendKeys("Garry");
			uIMapTraffic.crashEntry.occupantsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void selectPositionInOnVehicle() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uIPositioninOnVehicleComboBox);
		}

		public void selectAtPositionInOnVehicle() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.occupantsTab.uIPositioninOnVehicleComboBox,
					PoliceData.getTrafficModuleValue("Position"));
		}

		public void selectEjection() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uIEjectionComboBox);
		}

		public void selectAtEjection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.occupantsTab.uIEjectionComboBox,
					PoliceData.getTrafficModuleValue("Ejection"));
		}

		public void selectSaftyEquipment() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uISafetyEquipmentComboBox);
		}

		public void selectAtSafetyEquipment() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.occupantsTab.uISafetyEquipmentComboBox,
					PoliceData.getTrafficModuleValue("SafetyEquipment"));
		}

		public void selectUsed() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uIUsedComboBox);
		}

		public void selectAirBag() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uIAirBagComboBox);
		}

		public void selectAtAirBag() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.occupantsTab.uIAirBagComboBox, PoliceData.getTrafficModuleValue("AirBag"));
		}

		public void selectVictimPhysicalCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uIVictamPhysicalConditionComboBox);
		}

		public void selectLocofmostseverephysInj() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uILocofmostseverephysInjComboBox);
		}

		public void selectTypeofmostseverephysInj() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uITypeofmostseverephysInjComboBox);
		}

		public void selectHospitalCode() {
			uIMapTraffic.crashEntry.occupantsTab.uIHospitalCodeLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectSeatingPosition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uISeatingPositionComboBox);
		}

		public void selectBusType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.occupantsTab.uIBusTypeComboBox);
		}

		public void verifyAcknowledgeUpdateOccupantTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Occupants Tab. You must save or reset.");
		}

		public void verifyAcknowledgeTotalOccupant() {

			if (Playback.browserType == "Chrome") {
				popUp.acknowledge
						.okWithExpectedMessage("(10021) Unit No: 2 occupant should not exceed total occupants");
			} else
				popUp.acknowledge.okWithExpectedMessage("(10021) Unit#: 2 occupant should not exceed total occupants");
		}

		public void clickAddButton() {
			uIMapTraffic.crashEntry.occupantsTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapTraffic.crashEntry.occupantsTab.uIClearButton.click();
		}

		public void internalSave() {
			uIMapTraffic.crashEntry.occupantsTab.uIInternalSaveButton.click();
			popUp.confirm.yes();
		}

		public void selectRowByAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.crashEntry.occupantsTab.uIOccupantsTabResultGrid,
					PoliceData.getTrafficModuleValue("Name"));
		}

		public void verifyAtPositionInOnVehicleInGrid(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Position"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashEntry.occupantsTab.uIOccupantsTabResultGrid,
									"Pos In/Out Veh", rowIndex)
							.getText());
		}

		public void verifyAtAirBagInGrid(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("AirBag"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashEntry.occupantsTab.uIOccupantsTabResultGrid, "Air bag",
									rowIndex)
							.getText());
		}

		public void verifyAtEjectionInGrid(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Ejection"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashEntry.occupantsTab.uIOccupantsTabResultGrid, "Ejection",
									rowIndex)
							.getText());
		}

	}

	public class TruckBusTab {
		public void enterCarrierName() {
			uIMapTraffic.crashEntry.truckBusTab.uILastNameEdit.sendKeys("pizza");
			uIMapTraffic.crashEntry.truckBusTab.uILastNameEdit.sendKeys(Keys.TAB);
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void enterCarrierNo() {
			uIMapTraffic.crashEntry.truckBusTab.uICarrierNumberEdit.sendKeys(Randomized.randomAlphanumeric(5));
		}

		public void enterHazardClass() {
			// uIMapTraffic.crashEntry.TruckBusTab.uIHazardClassEdit.sendKeys(Randomized.RandomAlphanumeric(5));
		}

		public void enterAtCarrierID() {
			uIMapTraffic.crashEntry.truckBusTab.uICarrierNameIDEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CarrierID"));
			uIMapTraffic.crashEntry.truckBusTab.uICarrierNameIDEdit.sendKeys(Keys.TAB);
		}

		public void selectOversizeWeightPermit() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uIOversizeWeightPermitComboBox);
			uIMapTraffic.crashEntry.truckBusTab.uIOversizeWeightPermitComboBox.sendKeys(Keys.TAB);
		}

		public void selectCargoBodyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uICargoBodyTypeComboBox);
		}

		public void selectCommercialVehicleWeight() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uICommercialVehicleWeightComboBox);
		}

		public void enterNameorPlacardNo() {
			uIMapTraffic.crashEntry.truckBusTab.uINameorPlacardNoEdit.sendKeys(Randomized.randomAlphanumeric(7));
		}

		public void clickAddButton() {
			uIMapTraffic.crashEntry.truckBusTab.uIAddButton.click();
		}

		public void clickKSAddButton() {
			uIMapTraffic.crashEntry.truckBusTab.uIKSAddButton.click();
		}

		public void clickClearButton() {
			uIMapTraffic.crashEntry.truckBusTab.uIClearButton.click();
		}

		public void clickKSClearButton() {
			uIMapTraffic.crashEntry.truckBusTab.uIKSClearButton.click();
		}

		public void internalSave() {
			uIMapTraffic.crashEntry.truckBusTab.uIInternalSaveButton.click();
			popUp.confirm.yes();
		}

		public void verifyAcknowledgeUpdateTruckBusTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Truck/Bus Tab. You must save or reset.");
		}

		public void verifyVehicleNocontains1() {

			verify.ExpectedPropertyValueIsEqual("1",
					uIMapTraffic.crashEntry.truckBusTab.uIKSVehicleNoComboBox.getText());
		}

		public void clickNoneCheckbox() {
			uIMapTraffic.crashEntry.truckBusTab.uINoneCheckBox.click();
		}

		public void clickHazardousNoneCheckbox() {
			uIMapTraffic.crashEntry.truckBusTab.uIHazMaterial4979Edit.click();
		}

		public void verifyCarrierNoDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.truckBusTab.uICarrierNumberEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void verifyHazardClassDisabled() {
			// verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.TruckBusTab.uIHazardClassEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCarrierIdentificationNumberFieldsDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.truckBusTab.uICarrierIdentificationNoUSDOTEdit
					.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.truckBusTab.uICarrierIdentificationNoMCMXEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCarrierIdentificationNumberFieldsEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.truckBusTab.uICarrierIdentificationNoUSDOTEdit
					.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.truckBusTab.uICarrierIdentificationNoMCMXEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterUSDot() {
			uIMapTraffic.crashEntry.truckBusTab.uICarrierIdentificationNoUSDOTEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void enterMCMX() {
			uIMapTraffic.crashEntry.truckBusTab.uICarrierIdentificationNoMCMXEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectAtTimeOfCrashThisVehicleWasAs88Other() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.truckBusTab.uIAtTimeOfCrashThisVehicleWasComboBox, "88 - Other");
		}

		public void verifyAtTimeOfCrashThisVehicleWasFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.truckBusTab.uIAtTimeOfCrashThisVehicleWasEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAtTimeOfCrashThisVehicleWasField() {
			uIMapTraffic.crashEntry.truckBusTab.uIAtTimeOfCrashThisVehicleWasEdit.sendKeys(Randomized.randomString(6));
		}

		public void verify10086MandatoryDataMIssingGVWRGCWRAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing GVWR/GCWR");
		}

		public void selectGVWRGCWR() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uIGVWRGCWRComboBox);
		}

		public void enterGVWRGCWRLBSEdit() {
			uIMapTraffic.crashEntry.truckBusTab.uIGVWRGCWRLBSEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumber(2)));
		}

		public void selectSourceOfCarrierName() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uISourceOfCarrierNameComboBox);
		}

		public void enterPermitIssuer() {
			uIMapTraffic.crashEntry.truckBusTab.uIPermitIssuer1Edit.sendKeys(Randomized.randomString(10));
		}

		public void enterPermitNumber() {
			uIMapTraffic.crashEntry.truckBusTab.uIPermitNumber1Edit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(2)));
		}

		public void enterTrailerDimensionWidth() {
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionWidth1Edit
					.sendKeys(Integer.toString(Randomized.getRandomNumber(7)));
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionWidth1Edit.sendKeys(Keys.TAB);
		}

		public void verify6040ValuesShouldBe6DigitIntegerAndDecimal() {
			Playback.waitForControlReady();
			popUp.acknowledge.okWithExpectedMessage("(6040) Values should be 6 digit integer and 3 deciamal.");
		}

		public void clearTrailerDimensionWidth() {
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionWidth1Edit.clear();
		}

		public void enterTrailerDimensionWidthInDecimal() {
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionWidth1Edit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(4)) + "."
							+ Integer.toString(Randomized.getRandomNumbers(2)));
		}

		public void enterTrailerDimensionLength() {
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionLength1Edit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(2)));
			Playback.waitForControlReady();
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionLength1Edit.sendKeys(Keys.TAB);
		}

		public void clearTrailerDimensionLength() {
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionLength1Edit.clear();
		}

		public void enterTrailerDimensionLengthInDecimal() {
			uIMapTraffic.crashEntry.truckBusTab.uITrailerDimensionLength1Edit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(4)) + "."
							+ Integer.toString(Randomized.getRandomNumbers(2)));
		}

		public void selectTrailerDamaged() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uITrailerDamagedComboBox);
		}

		public void enterVehicleLength() {
			uIMapTraffic.crashEntry.truckBusTab.uIVehicleLengthEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(8)));
			Playback.waitForControlReady();
			uIMapTraffic.crashEntry.truckBusTab.uIVehicleLengthEdit.sendKeys(Keys.TAB);
		}

		public void clearVehicleLength() {
			uIMapTraffic.crashEntry.truckBusTab.uIVehicleLengthEdit.clear();
		}

		public void enterVehicleLengthInDecimal() {
			uIMapTraffic.crashEntry.truckBusTab.uIVehicleLengthEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(4)) + "."
							+ Integer.toString(Randomized.getRandomNumbers(2)));
		}

		public void selectVehicleConfigurationAs88Other() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.truckBusTab.uIVehicleConfigurationComboBox, "88 - Other");
		}

		public void verifyVehicleConfigurationFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.truckBusTab.uIVehicleConfigurationEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInVehicleConfigurationField() {
			uIMapTraffic.crashEntry.truckBusTab.uIVehicleConfigurationEdit.sendKeys(Randomized.randomString(6));
		}

		public void selectCargoBodyTypeAs88Other() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uICargoBodyTypeComboBox, "88 - Other");
		}

		public void verifyCargoBodyTypeFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.truckBusTab.uICargoBodyTypeEdit.getAttribute("class").contains("textbox"));
		}

		public void enterTextInCargoBodyTypeField() {
			uIMapTraffic.crashEntry.truckBusTab.uICargoBodyTypeEdit.sendKeys(Randomized.randomString(6));
		}

		public void selectCargoTypeAs88Other() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uICargoTypeComboBox, "88 - Other");
		}

		public void verifyCargoTypeFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.truckBusTab.uICargoTypeEdit.getAttribute("class").contains("textbox"));
		}

		public void enterTextInCargoTypeField() {
			uIMapTraffic.crashEntry.truckBusTab.uICargoTypeEdit.sendKeys(Randomized.randomString(6));
		}

		public void enterHazmatWeightLbs() {
			uIMapTraffic.crashEntry.truckBusTab.uIHazmatWeightLBSEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumber(8)));
			Playback.waitForControlReady();
			uIMapTraffic.crashEntry.truckBusTab.uIHazmatWeightLBSEdit.sendKeys(Keys.TAB);
		}

		public void clearHazmatWeightLbs() {
			uIMapTraffic.crashEntry.truckBusTab.uIHazmatWeightLBSEdit.clear();
		}

		public void enterHazmatWeightLbsInDecimal() {
			uIMapTraffic.crashEntry.truckBusTab.uIHazmatWeightLBSEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(4)) + "."
							+ Integer.toString(Randomized.getRandomNumbers(2)));
		}

		public void enterDiamondShapeNumberInDecimal() {
			uIMapTraffic.crashEntry.truckBusTab.uIDiamondShapeEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(4)) + "."
							+ Integer.toString(Randomized.getRandomNumbers(2)));
		}

		public void selectCabType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uICabTypeComboBox);
		}

		public void selectOnRoadLaneType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uIOnRoadLaneTypeComboBox);
		}

		public void selectVehicleAccessControlToRoadways() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.truckBusTab.uIVehicleAccessControlToRoadwaysComboBox);
		}

		public void verifyAddedRecordInGridByAtCarrierName() {
			WebElement carrierName = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashEntry.truckBusTab.uITruckBusTabResultGrid,
					PoliceData.getTrafficModuleValue("CarrierName"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CarrierName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashEntry.truckBusTab.uITruckBusTabResultGrid, carrierName,
									"Carrier Name")
							.getText());
		}
	}

	public class CrashEntryApprovalTab {

		public void verifySaveButtonDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryApprovalTab.uISaveButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
		}

		public void verifySaveButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryApprovalTab.uISaveButton.isEnabled());
		}

		public void verifyNewActionDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryApprovalTab.uINewActionComboBox
					.getAttribute("disabled") == "true");
		}

		public void verifyNewActionEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryApprovalTab.uINewActionComboBox.isEnabled());
		}

		public void verifyDateTimeDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryApprovalTab.uIDateEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryApprovalTab.uITimeEdit.getAttribute("class")
					.contains("textboxInactivedatetime"));
		}

		public void verifyDateTimeEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.crashEntryApprovalTab.uIDateEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.crashEntryApprovalTab.uITimeEdit.getAttribute("class")
					.contains("textboxdatetime "));
		}

		public void selectAtNewAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryApprovalTab.uINewActionComboBox,
					PoliceData.getTrafficModuleValue("NewAction"));
		}

		public void tabThroughDateTime() {
			uIMapTraffic.crashEntry.crashEntryApprovalTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapTraffic.crashEntry.crashEntryApprovalTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void selectRejectionCode() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryApprovalTab.uIRejectionCodeComboBox);
		}

		public void selectActionAsSendForApproval() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashEntry.crashEntryApprovalTab.uINewActionComboBox, "Send for Approval");
		}

		public void selectActionAsApprove() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryApprovalTab.uINewActionComboBox, "Approve");
		}

		public void selectActionAsLock() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.crashEntryApprovalTab.uINewActionComboBox, "Lock");
		}

		public void verifyCurrentDateAutopopulatesInDateField() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTraffic.crashEntry.crashEntryApprovalTab.uIDateEdit.getAttribute("value"));
		}

		public void enterAtSupervisor() {
			uIMapTraffic.crashEntry.crashEntryApprovalTab.uISupervisorCodeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Supervisor"));
		}

		public void save() {
			uIMapTraffic.crashEntry.crashEntryApprovalTab.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void verifyRejectCountAs1() {
			verify.ExpectedPropertyValueIsEqual("1",
					uIMapTraffic.crashEntry.crashEntryApprovalTab.uIRejectCountTextView.getText());
		}

	}

	public class PoliceActionTab {

		public void clickCompleteCheckBox() {
			uIMapTraffic.crashEntry.policeActionTab.uICompleteCheckBox.click();

		}

		public void verifyPendingCheckBoxChecked() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.policeActionTab.uIPendingCheckBox.getAttribute("checked") == "true");
		}

		public void save() {
			uIMapTraffic.crashEntry.policeActionTab.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void clickNJCompleteCheckBox() {
			uIMapTraffic.crashEntry.policeActionTab.uINJCompleteCheckBox.click();
			popUp.confirm.yesWithContainsMessage("Do you want to submit?");
		}

		public void verify10091DoDoWantToSubmitPopup()
		{
			popUp.confirm.yesWithExpectedMessage("(10091)Action Tab - Case Status is Complete. Do you want to submit?");
			
		}

		public void verifyCaseStatusDisabled() { 																					// Added by Abi
			verify.ExpectedValueIsFalse(uIMapTraffic.crashEntry.policeActionTab.uINJCompleteCheckBox.isEnabled());
		}

	}

	public class AccidentTab {
		public void enterAtCounty() {
			uIMapTraffic.crashEntry.accidentTab.uICountyCodeEdit.sendKeys(PoliceData.getTrafficModuleValue("County"));
			uIMapTraffic.crashEntry.accidentTab.uICountyCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyMunicipalityCodeEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.accidentTab.uIMunicipalityCodeEdit.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.accidentTab.uIMunicipalityCodeEdit.getAttribute("class")
					.contains("textbox"));
		}

		public void enterAtMunicipality() {
			uIMapTraffic.crashEntry.accidentTab.uIMunicipalityCodeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Municipality"));
			uIMapTraffic.crashEntry.accidentTab.uIMunicipalityCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterOnHwyNo() {
			uIMapTraffic.crashEntry.accidentTab.uIOnHwyNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAtOnStreet() {
			uIMapTraffic.crashEntry.accidentTab.uIOnStreetEdit.sendKeys(PoliceData.getTrafficModuleValue("OnStreet"));
			uIMapTraffic.crashEntry.accidentTab.uIOnStreetVerifyCheckbox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectOnHwyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.accidentTab.uIOnHwyTypeComboBox);
			uIMapTraffic.crashEntry.accidentTab.uIOnHwyTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectAccidentLocationComboBox() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashEntry.accidentTab.uIAccidentLocationComboBox);
			uIMapTraffic.crashEntry.accidentTab.uIAccidentLocationComboBox.sendKeys(Keys.TAB);
		}

		public void enterStructureNo() {
			uIMapTraffic.crashEntry.accidentTab.uIStructureNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAtFromAlterStreetName() {
			uIMapTraffic.crashEntry.accidentTab.uIFromAlterStreetNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("FrmStreetName"));
			uIMapTraffic.crashEntry.accidentTab.uIFromAlterStreetNameVerifyCheckbox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAgencySpace() {
			uIMapTraffic.crashEntry.accidentTab.uIAgencySpaceEdit.sendKeys(Randomized.randomString(200));
		}
	}

	public class CrashEntryUnitTab {
		public void enterAtUnitNo() {
			uIMapTraffic.crashEntry.crashEntryUnitTab.uIUnitNoEdit.sendKeys(PoliceData.getTrafficModuleValue("UnitNo"));
		}

		public void clickAdd() {
			uIMapTraffic.crashEntry.crashEntryUnitTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void internalSave() {
			uIMapTraffic.crashEntry.crashEntryUnitTab.uISaveButton.click();
			Playback.controlReadyThreadWait();
			// popUp.confirm.yes();
		}

		public void verifyTotalOccupantsInGridUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("TotalOccupants"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashEntry.crashEntryUnitTab.uIUnitTabResultGrid,
									PoliceData.getTrafficModuleValue("UnitNo"), "Total Occ")
							.getText());
		}

		public void verifyAtUnitNoInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("UnitNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashEntry.crashEntryUnitTab.uIUnitTabResultGrid, "Unit#", rowCount));
		}

		public void verifyVehicleInGridUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Vehicle"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashEntry.crashEntryUnitTab.uIUnitTabResultGrid,
									PoliceData.getTrafficModuleValue("UnitNo"), "Veh#")
							.getText());
		}
	}

	public class CrashEntryNarrativeTab {

		public void enterAtSubject() {
			uIMapTraffic.crashEntry.crashEntryNarrativeTab.uISubjectEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Subject"));
		}

		public void enterSubject() {
			uIMapTraffic.crashEntry.crashEntryNarrativeTab.uISubjectEdit.sendKeys("Automation");
		}

		public void clickEnterCommentsButton() {
			uIMapTraffic.crashEntry.crashEntryNarrativeTab.uIEnterCommentsButton.click();
			popUp.confirm.yes();
		}

		public void verifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTraffic.crashEntry.crashEntryNarrativeTab.uIDateEdit.getAttribute("value"));
		}

		public void verifyAtPFCode(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("PFCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashEntry.crashEntryNarrativeTab.uINarrativeTabResultGrid, "PF Code",
							rowIndex));
		}

		public void verifyAtSubject(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Subject"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashEntry.crashEntryNarrativeTab.uINarrativeTabResultGrid, "Subject",
							rowIndex));
			Playback.waitForControlReady();
		}

	}

	public class DiagramTab {
		public void clickImportButton() {
			uIMapTraffic.crashEntry.diagramTab.uIImportButton.click();
		}

		public void verifyImageAppears() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashEntry.diagramTab.uIImageView.getAttribute("src").contains("frmHandle"));
		}

		public void verifyImageIsDisplayed() 
		{
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.diagramTab.uIImageView.getAttribute("class").contains("ImageMenuItem"));
			
		}

		public void clickAddNew() { // Added by Abi
			uIMapTraffic.crashEntry.diagramTab.uINewButton.click();
		}

	}

	public class DiagramTab2
	{

		public void clickImportButton() 
		{
			uIMapTraffic.crashEntry.diagramTab2.uIImportButton.click();
			
		}

		public void verifyImageAppears() 
		{
			verify.ExpectedValueIsTrue(uIMapTraffic.crashEntry.diagramTab2.uIImageView.getAttribute("src").contains("frmHandle"));
						
		}
		
		
	}
	public class CrashEntryMapTab {
		public void verifyAtActiveCrashNo(String CrashNoDetails) {
			verify.ExpectedValueIsTrue(
					CrashNoDetails.contains(uIMapTraffic.citationEntry.citationEntryMapTab.uICENoTextView.getText()));
		}

		public void verifyLatLongValue(String LatLongValue) {
			verify.ExpectedValueIsTrue(LatLongValue
					.contains(uIMapTraffic.citationEntry.citationEntryMapTab.uILatLongValueTextView.getText()));
		}

		public void verifyUpdateLatLongButtonDisabled() {
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashEntry.crashEntryMapTab.uIUpdateLatLongButton.isEnabled());
		}

		public void clickResetButton() {
			uIMapTraffic.crashEntry.crashEntryMapTab.uIResetButton.click();
		}

		public void verifyLatLongValueAs0() {
			verify.ExpectedPropertyValueIsEqual("0.000000000000 / 0.000000000000",
					uIMapTraffic.citationEntry.citationEntryMapTab.uILatLongValue0TextView.getText());
		}

		public void DragandDropMapLocationIcon() {
			objectIdentification.actionBuilder
					.DragAndDropBy(uIMapTraffic.citationEntry.citationEntryMapTab.uIMapLocationIconButton, 52, 65);

			Playback.gridLoadThreadWait();
		}

		public void clickUpdateLatLongButton() {
			uIMapTraffic.crashEntry.crashEntryMapTab.uIUpdateLatLongButton.click();
		}

		public void verifyGeoOverwriteConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage(
						"(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
			} else
				popUp.confirm
						.yesWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
		}

		public void verifyUpdateLatLongConfirmMessage() {
			if (Playback.browserType == "Chrome") {
				popUp.confirm.yes();
			}
			/*
			 * else { String warningMessage =
			 * PnxBaseTest.UIMappopUp.confirmWindow.uIErrorInfoTextEdit.getText();
			 * verify.ExpectedValueIsTrue(warningMessage.
			 * contains("(5102) Are you sure you want to update the Latitude and Longitude to"
			 * )); } // popUp.confirm.
			 * yesWithExpectedMessage("(5102) Are you sure you want to update the Latitude and Longitude to 40.922861567710406 / -73.08271639468995 ?"
			 * );
			 * 
			 */
		}

		public void verifyLatLongValueUpdated() {
			if (Playback.browserType == "Chrome") {
				verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.citationEntryMapTab.uILatLongValueTextView
						.getText().contains("40.9"));
				verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.citationEntryMapTab.uILatLongValueTextView
						.getText().contains("/ -73."));
			} else {
				verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.citationEntryMapTab.uILatLongValueTextView
						.getText().contains("40."));
				verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.citationEntryMapTab.uILatLongValueTextView
						.getText().contains("/ -74."));
			}
		}

		public void verifyAyCrashNoAppears() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CrashNo"),
					uIMapTraffic.citationEntry.citationEntryMapTab.uICENoTextView.getText());
		}
	}

	public class CrashComments {
		public void enter100WordsRichText() {

			Playback.waitForControlReady();
			objectIdentification.actionBuilder.MoveToElement(uIMapTraffic.crashComments.uICommentsRichTextEdit);

			objectIdentification.actionBuilder.SendKeys(
					"The Phoenix software’s advanced architecture and design help us in achieving the industry paradigm shift we seek to provide outstanding service to our clients and maintain 100% client satisfaction.  Additionally, our pricing philosophy includes both Perpetual Licensing and Software as a Service (SaaS) options as part of our efforts to offer a higher return on investment.");
			Playback.waitForControlReady();
		}

		public void saveAndCloseScreen() {
			uIMapTraffic.crashComments.uISaveCloseButton.click();
			popUp.confirm.yes();
		}

	}

	public class CrashUnit {

		public PersonTab personTab;
		public CrashUnitVehicleTab crashUnitVehicleTab;
		public DamageConditionsTab damageConditionsTab;

		public CrashUnit() {

			if (this.personTab == null)
				this.personTab = new PersonTab();

			if (this.crashUnitVehicleTab == null)
				this.crashUnitVehicleTab = new CrashUnitVehicleTab();

			if (this.damageConditionsTab == null)
				this.damageConditionsTab = new DamageConditionsTab();

		}

		public void verifyAtUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("UnitNo"),
					uIMapTraffic.crashUnit.uIUnitNoEdit.getAttribute("value"));
		}

		public void verifyOccupantsDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.uINoOfOccupantsEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyVehicleTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.uIVehicleTab.getAttribute("class")
					.contains("igtab_BlueThemeTHText igtab_BlueThemeTHTextDis"));
		}

		public void enterAtNoOfOccupants() {
			uIMapTraffic.crashUnit.uINoOfOccupantsEdit.sendKeys(PoliceData.getTrafficModuleValue("Occupants"));
		}

		public void enterNoOfOccupants() {
			uIMapTraffic.crashUnit.uINoOfOccupantsEdit.sendKeys(Integer.toString(Randomized.getRandomNumber(3)));
		}

		public void switchToPersonTab() {
			uIMapTraffic.crashUnit.uIPersonTab.click();
		}

		public void switchToVehicleTab() {
			uIMapTraffic.crashUnit.uIVehicleTab.click();
		}

		public void switchToDamageConditionsTab() {
			uIMapTraffic.crashUnit.uIDamageConditionsTab.click();
		}

		public void closeCrashUnitScreen() {
			uIMapTraffic.crashUnit.driver.close();
		}

		public void save() {
			uIMapTraffic.crashUnit.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void saveAndClose() {
			uIMapTraffic.crashUnit.uISaveAndCloseButton.click();
			popUp.confirm.yes();
		}

		public void verifyUpdateSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.uIBottomLeftSideStatusBar.getText().contains("1003 - Update Successful"));
		}

		public void verifyAdditionSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));
		}

			public void verifyVehicleFieldEnabled()
        {
            verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.uIUnitNoEdit.isEnabled());
        }
       
        public void verifyVehicleFieldDisabled()
        {
            verify.ExpectedValueIsFalse(uIMapTraffic.crashUnit.uIUnitNoEdit.getAttribute("readonly") == "true");
        }
	}

	public class PersonTab {

		public void selectAtTypeOfPerson() {
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("TypeOfPerson"));
		}

		public void selecttypeOfPersonAsParked() {
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys("02 - Parked");
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectKSTypeOfPersonAs02Parked() {
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys("02 - Parked");
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectTypeOfPersonAsPedestrain() {
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys("03 - Pedestrain");
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectKSTypeOfPersonAs03Pedestrain() {
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys("03 - Pedestrain");
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selecttypeOfPersonAsPedalcylist() {
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys("04 - Pedalcylist");
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectKSTypeOfPersonAs04Pedalcylist() {
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys("04 - Pedalcylist");
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selecttypeOfPersonAsDriver() {
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys("01 - Driver");
			uIMapTraffic.crashUnit.personTab.uITypeOfPersonComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectKSTypeOfPersonAs01Driver() {
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys("01 - Driver");
			uIMapTraffic.crashUnit.personTab.uIKSTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterName() {
			uIMapTraffic.crashUnit.personTab.uILastNameEdit.sendKeys("Raja");
			uIMapTraffic.crashUnit.personTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void enterAtKSNameID() {
			uIMapTraffic.crashUnit.personTab.uIKSNameTypeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(0, 1));
			uIMapTraffic.crashUnit.personTab.uIKSNameIDEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(2));
			uIMapTraffic.crashUnit.personTab.uIKSNameIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNameID() {
			uIMapTraffic.crashUnit.personTab.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(0, 1));
			uIMapTraffic.crashUnit.personTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(2));
			uIMapTraffic.crashUnit.personTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void verifyNameControlDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uINameTypeIDEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uILastNameEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIFirstNameEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyAtHomePhone() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("HomePhone"),
					uIMapTraffic.crashUnit.personTab.uIHomePhoneEdit.getAttribute("value"));
		}

		public void verifyAtWorkPhone() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("WorkPhone"),
					uIMapTraffic.crashUnit.personTab.uIWorkPhoneEdit.getAttribute("value"));
		}

		public void verifyHomePhoneAtWorkPhone() {
			Playback.waitForControlReady();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("WorkPhone"),
					uIMapTraffic.crashUnit.personTab.uIHomePhoneEdit.getAttribute("value"));
		}

		public void verifyWorkPhoneAtHomePhone() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("HomePhone"),
					uIMapTraffic.crashUnit.personTab.uIWorkPhoneEdit.getAttribute("value"));
		}

		public void verifyNoOfOccupantsFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.uINoOfOccupantsEdit.getAttribute("class").contains("textbox"));
		}

		public void verifyPersonTabAllFieldsDisabledExpectHitRunAndDUICheckbox() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIKSNameTypeEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIKSNameIDEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIKSLastNameEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIKSFirstNameEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIDriverForEmployerCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uICDLCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIDLClassComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIDLLicenseComplyComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIRestrictComplyYCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIRestrictComplyNCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIRestriction1ComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIRestriction1YCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIRestriction1NCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIKSHitandRunCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIDUICheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uICommercialEndrosementsComboBox
					.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIPositionInVehicleComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIKSSafetyEquipmentComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIInjurySeverityComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uITransportUnit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIEjectedTrappedComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIEjectionPathComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIInjuredTakenByEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIInjuredTakenToEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					!uIMapTraffic.crashUnit.personTab.uIPedestrainRoadwayLocationBeforeImpactComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					!uIMapTraffic.crashUnit.personTab.uIPedestrainActionBeforeCrashComboBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIOtherPedestrainLocationComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					!uIMapTraffic.crashUnit.personTab.uIPedestrainObedienceToTraficSignalComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIContributingCircumstancesComboBox
					.getAttribute("disabled") == "true");
		}

		public void verifyPersonTabAllFieldsEnabledExpectHitRunCheckBoxDisabled() {

			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIKSNameTypeEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIKSNameIDEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIKSLastNameEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIKSFirstNameEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIDriverForEmployerCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uICDLCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIDLClassComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIDLLicenseComplyComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIRestrictComplyYCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIRestrictComplyNCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIRestriction1ComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIRestriction1YCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIRestriction1NCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.crashUnit.personTab.uIHitandRunCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIDUICheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uICommercialEndrosementsComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIPositionInVehicleComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIKSSafetyEquipmentComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIInjurySeverityComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uITransportUnit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIEjectedTrappedComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIEjectionPathComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIInjuredTakenByEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIInjuredTakenToEdit.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIPedestrainRoadwayLocationBeforeImpactComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIPedestrainActionBeforeCrashComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIOtherPedestrainLocationComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIPedestrainObedienceToTraficSignalComboBox.isEnabled());
			// verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIContributingCircumstancesComboBox.isEnabled());

		}

		public void clickHitAndRunCheckBox() {
			uIMapTraffic.crashUnit.personTab.uIHitandRunCheckBox.click();
		}

		public void clickDUICheckBox() {
			uIMapTraffic.crashUnit.personTab.uIDUICheckBox.click();
		}

		public void clickNameInfoBubbleIcon() {
			uIMapTraffic.crashUnit.personTab.uINameInfoIconButton.click();
		}

		public void enterAndCheckAllFields() {

			uIMapTraffic.crashUnit.personTab.uIDriverForEmployerCheckBox.click();
			uIMapTraffic.crashUnit.personTab.uICDLCheckBox.click();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIDLLicenseComplyComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIKSSafetyEquipmentComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIPositionInVehicleComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIInjurySeverityComboBox);
			uIMapTraffic.crashUnit.personTab.uITransportUnit.sendKeys(Randomized.randomNumberString(2));
			uIMapTraffic.crashUnit.personTab.uIInjuredTakenByEdit.sendKeys(Randomized.randomNumberString(2));
			uIMapTraffic.crashUnit.personTab.uIInjuredTakenToEdit.sendKeys(Randomized.randomNumberString(2));
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIPedestrainActionBeforeCrashComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIPedestrainObedienceToTraficSignalComboBox);
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.personTab.uIPedestrainRoadwayLocationBeforeImpactComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIOtherPedestrainLocationComboBox);
		}

		public void selectFiveValuesFromCommercialEndorsement() {
			uIMapTraffic.crashUnit.personTab.uICommercialEndrosementsInputComboBox.click();
			// objectIdentification.randomIdentify.seselectRadControlDropDownCheckBoxes(uIMapTraffic.crashUnit.personTab.uICommercialEndrosementsComboBox,
			// 5);
		}

		public void selectCharge() {
			uIMapTraffic.crashUnit.personTab.uIChargeLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectPositionInOnVehicle() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIPositioninOnVehicleComboBox);
		}

		public void selectEjection() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIEjectionComboBox);
		}

		public void selectEjectionTrappedAsEEjected() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIEjectedTrappedComboBox, "E - Ejected");
		}

		public void selectEjectionPath() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIEjectionPathComboBox);
		}

		public void selectSaftyEquipment() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uISafetyEquipmentComboBox);
		}

		public void selectUsed() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIUsedComboBox);
		}

		public void selectAirBag() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIAirBagComboBox);
		}

		public void selectVictimPhysicalCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIVictamPhysicalConditionComboBox);
		}

		public void selectLocofmostseverephysInj() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uILocofmostseverephysInjComboBox);
		}

		public void selectTypeofmostseverephysInj() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uITypeofmostseverephysInjComboBox);
		}

		public void clickMultiCharges() {
			uIMapTraffic.crashUnit.personTab.uIMultiChargesCheckBox.click();
		}

		public String getNameType() {
			String NameTypeId = uIMapTraffic.crashUnit.personTab.uINameTypeIDEdit.getAttribute("value");
			return NameTypeId;
		}

		public void getLastAndFirstName(String lastName, String firstName) {
			lastName = uIMapTraffic.crashUnit.personTab.uIKSLastNameEdit.getAttribute("value");
			firstName = uIMapTraffic.crashUnit.personTab.uIKSFirstNameEdit.getAttribute("value");
		}

		public void verifyName2656LabelNonMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.personTab.uIName2656TextView.getAttribute("style").contains("color: black"));
		}

		public void verifyName2656LabelMandatory() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.personTab.uIName2656TextView.getAttribute("style")
					.contains("color: maroon"));
		}

		public void clickNJHitAndRunCheckBox() {
			uIMapTraffic.crashUnit.personTab.uIHitandRunCheckBox.click();
		}

		public void verifyAtEyeColour() {
			String color = uIMapTraffic.crashUnit.personTab.uIEyeColourEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(color, PoliceData.getTrafficModuleValue("EyeColor"));
		}

		public void selectAtSafetyEquipmentAvailable() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.personTab.uISafetyEquipmentComboBox,
					PoliceData.getTrafficModuleValue("SafetyEquipmentAvailable"));

		}

		public void selectAtSafetyEquipmentUsed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIUsedComboBox,
					PoliceData.getTrafficModuleValue("SafetyEquipmentUsed"));

		}

		public void selectAtDLClass() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.crashUnit.personTab.uIDLClassDropDown,
					PoliceData.getTrafficModuleValue("DLClass"));

		}

		public void clickNJNameInfoIcon() {
			uIMapTraffic.crashUnit.personTab.uINJNameInfoIcon.click();

		}

	}

	public class CrashUnitVehicleTab {
		public void verifyPlateNumberNonMandatory() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateNoTextView
					.getAttribute("class").contains("none"));
		}

		public void clickVehicleOwnerSameAsDriver() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVehicleOwnerSameAsDriverCheckBox.click();
		}

		public void clickKSVehicleOwnerSameAsDriver() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSVehicleOwnerSameAsDriverCheckBox.click();
		}

		public void verifyNameFromPersonTab(String NameTypeId) {
			verify.ExpectedPropertyValueIsEqual(NameTypeId,
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uINameTypeIDEdit.getAttribute("value"));
		}

		public void verifyNameFieldAutopopulatesFromPersonTab(String lastName, String firstName) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("NameID").substring(0, 1),
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSNameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("NameID").substring(2),
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSNameIDEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(lastName,
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSLastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(firstName,
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSFirstNameEdit.getAttribute("value"));
		}

		public void enterAtPlateNumber() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PlateNumber"));
		}

		public void enterAtKSLicensePlate() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSLicensePlateNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("LicensePlate").substring(0, 6));
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSLicensePlateStateComboBox,
					PoliceData.getTrafficModuleValue("LicensePlate").substring(7));
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSLicensePlateStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectVehicleBodyTypeAs11TruckAndTrailer() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVehicleBodyTypeComboBox, "11 - Truck & trailer(s)");
		}

		public void selectVehicleBodyTypeAs30BusLargeVanLimo() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVehicleBodyTypeComboBox,
					"30 - Bus/Large Van/Limo (9-15 Seats)");
		}

		public void selectVehicleBodyTypeAs31BusMoreThan15Seats() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVehicleBodyTypeComboBox,
					"31 - Bus (More than 15 Seats)");
		}

		public void enterMCCCs() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIMCCCEdit.sendKeys(Randomized.randomNumberString(3));
		}

		public void enterRemainingFieldsInVehicleTab() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIKSVehicleUseComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.crashUnitVehicleTab.uICountyComboBox);
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIRemovedByEdit.sendKeys(Randomized.randomNumberString(4));
		}

		public void selectAtState() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateStateComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("State"));
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectVehicle() {
			// Vehicle.VehicleBoatSearchHelpWindow.selectVehicle();
		}

		public void selectAtType() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uITypeComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("Type"));
		}

		public void selectVehicleUse() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVehicleUseComboBox);
		}

		public void enterAtPolicyNumber() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIInsurancePolicyNoEdit.sendKeys("PolicyNo");

		}

		public void selectAtInsuranceCompany() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIInsuranceCodeComboBox,
					PoliceData.getTrafficModuleValue("InsuranceCompany"));

		}

		public void verifyAtPolicyNumber() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIInsurancePolicyNoEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("InsurancePolicyNumber"));
		}

		public void verifyAllPlateRelatedFieldsAutoPopulated(String vinNo, String vehicleNo) {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVehicleNoEdit.getAttribute("value")
					.contains(vehicleNo));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIYearEdit.getAttribute("value")
					.contains(PoliceData.getTrafficModuleValue("Year")));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIMakeEdit.getAttribute("value")
					.contains(PoliceData.getTrafficModuleValue("Make")));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIModelEdit.getAttribute("value")
					.contains(PoliceData.getTrafficModuleValue("Model")));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVINEdit.getAttribute("value").contains(vinNo));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIColor1Edit.getAttribute("value")
					.contains(PoliceData.getTrafficModuleValue("Color1")));
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIColor2Edit.getAttribute("value")
					.contains(PoliceData.getTrafficModuleValue("Color2")));

		}

		public void verifyAtVinNo() {
			verify.ExpectedValueIsTrue(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVINEdit.getAttribute("value")
					.contains(PoliceData.getTrafficModuleValue("VinNo")));
		}

		public void selectVehicleBodyTypeAsUnknown() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.crashUnitVehicleTab.uIVehicleBodyTypeComboBox, "00 - Unknown");
		}

		public void enterAtPlateNumberAndSelectStateAsWI() {
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PlateNumber"));
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateNumberEdit.sendKeys(Keys.TAB);
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateStateComboBox, "WI");
			uIMapTraffic.crashUnit.crashUnitVehicleTab.uIPlateStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectTypeAsUnknown() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.crashUnitVehicleTab.uITypeComboBox, "00 - Unknown");

		}
	}

	public class DamageConditionsTab {
		public void selectInitialImpact() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIInitialImpactComboBox);
		}

		public void selectPrincipalDam() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIPrincipalDamComboBox);
		}

		public void selectExtentOfDamage() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIExtentOfDamageComboBox);
		}

		public void selectDirectionTravelOfTheVehicle() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.damageConditionsTab.uIDirectionTravelOfTheVehicleComboBox);
		}

		public void selectApparentContributingCircumstanceA() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.damageConditionsTab.uIApparentContributingCircumstanceAComboBox);
		}

		public void selectApparentContributingCircumstanceB() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.damageConditionsTab.uIApparentContributingCircumstanceBComboBox);
		}

		public void selectPreCrashAcrion() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIPreCrashAcrionComboBox);
		}

		public void selectTrafficControls() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uITrafficControlsComboBox);
		}

		public void selectSequenceofEvents1st() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents1stComboBox);
			uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents1stComboBox.sendKeys(Keys.TAB);
		}

		public void selectSequenceofEvents2nd() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents2ndComboBox);
			uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents2ndComboBox.sendKeys(Keys.TAB);
		}

		public void selectSequenceofEvents3rd() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents3rdComboBox);
			uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents3rdComboBox.sendKeys(Keys.TAB);
		}

		public void selectSequenceofEvents4th() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents4thComboBox);
			uIMapTraffic.crashUnit.damageConditionsTab.uISequenceofEvents4thComboBox.sendKeys(Keys.TAB);
		}

		public void selectMostHarmfulEvents4th() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIMostHarmfulEventComboBox);
			uIMapTraffic.crashUnit.damageConditionsTab.uIMostHarmfulEventComboBox.sendKeys(Keys.TAB);
		}

		public void selectApperantPhysicalStatusA() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIApperantPhysicalStatusAComboBox);
		}

		public void selectApperantPhysicalStatusB() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIApperantPhysicalStatusBComboBox);
		}

		public void selectAlcoholGiven() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIAlcoholGivenComboBox);
		}

		public void selectAlcoholType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.crashUnit.damageConditionsTab.uIAlcoholTypeComboBox);
		}

		public void enterAtAlcoholResultValue() {
			uIMapTraffic.crashUnit.damageConditionsTab.uIResultEdit
					.sendKeys(PoliceData.getTrafficModuleValue("ResultValue"));
		}

		public void selectAtApparentContributingCircumstanceA() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.damageConditionsTab.uIApparentContributingCircumstanceAComboBox,
					PoliceData.getTrafficModuleValue("ApparentContributingCircumstancesA"));

		}

		public void selectAtApperantPhysicalStatusA() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashUnit.damageConditionsTab.uIApperantPhysicalStatusAComboBox,
					PoliceData.getTrafficModuleValue("ApparentPhysicalStatus"));

		}

	}

	public class CrashSearchHelpWindow {

		public void verifyCrashNoInGrid(String crashNo) {
			String crashNum = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.crashSearchHelpWindow.uICrashSearchGrid, "Crash#", 0);
			verify.ExpectedPropertyValueIsEqual(crashNum, crashNo);
		}

		public void SelectRowByAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTraffic.crashSearchHelpWindow.uICrashSearchGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			
		}
		public void CloseScreen() {
			uIMapTraffic.crashSearchHelpWindow.driver.close();
			
		}
	}

	public class CrashSearch {

		public void selectJurisAsSO() {
			new Select(uIMapTraffic.crashSearch.uIJurisComboBox)
					.selectByVisibleText("SO - Prophoenix Police Department");
			Playback.pageLoadThreadWait();
		}

		public void selectJurisAsBE() {
			new Select(uIMapTraffic.crashSearch.uIJurisComboBox)
					.selectByVisibleText("BE - Prophoenix Police Department");
			Playback.pageLoadThreadWait();
		}

		public void selectJurisAsBL() {
			new Select(uIMapTraffic.crashSearch.uIJurisComboBox).selectByVisibleText("BL - Big lake Police Department");
			Playback.pageLoadThreadWait();
		}

		public void clickAddNew() {
			uIMapTraffic.crashSearch.uIAddNewButton.click();
		}

		public void selectCrashLocationAsIntersection() {
			new Select(uIMapTraffic.crashSearch.uICrashLocationComboBox).selectByVisibleText("Intersection");
			uIMapTraffic.crashSearch.uICrashLocationComboBox.sendKeys(Keys.TAB);
		}

		public void selectAddressAsIntersection() {
			new Select(uIMapTraffic.crashSearch.uICrashLocationComboBox).selectByVisibleText("Intersection");
			uIMapTraffic.crashSearch.uICrashLocationComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtStreet2() {
			uIMapTraffic.crashSearch.uIIntersectionStreet2Edit.sendKeys(PoliceData.getTrafficModuleValue("Street2"));
			uIMapTraffic.crashSearch.uIIntersectionStreet2Edit.sendKeys(Keys.TAB);
		}

		public void enterAtStreet1() {
			Playback.waitForControlReady();
			uIMapTraffic.crashSearch.uIIntersectionStreet1Edit.sendKeys(PoliceData.getTrafficModuleValue("Street1"));
			uIMapTraffic.crashSearch.uIIntersectionStreet1Edit.sendKeys(Keys.TAB);
		}

		public void enterAtStreet2InStreet1Field() {
			uIMapTraffic.crashSearch.uIIntersectionStreet1Edit.sendKeys(PoliceData.getTrafficModuleValue("Street2"));
			uIMapTraffic.crashSearch.uIIntersectionStreet1Edit.sendKeys(Keys.TAB);
		}

		public void clickSearch() {
			uIMapTraffic.crashSearch.uISearchButton.click();
		}

		public void clickBackButton() {
			uIMapTraffic.crashSearch.uIBackButton.click();
		}

		public void clickReset() {
			uIMapTraffic.crashSearch.uIResetButton.click();
		}

		public void enterAtCaseNo() {
			uIMapTraffic.crashSearch.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2));
			uIMapTraffic.crashSearch.uICaseNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(3));
			uIMapTraffic.crashSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCrashNo() {
			uIMapTraffic.crashSearch.uICrashYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CrashNo").substring(0, 2));
			uIMapTraffic.crashSearch.uICrashNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CrashNo").substring(3));
			uIMapTraffic.crashSearch.uICrashNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCrashNo1() {
			uIMapTraffic.crashSearch.uICrashYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CrashNo1").substring(0, 2));
			uIMapTraffic.crashSearch.uICrashNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CrashNo1").substring(3));
			uIMapTraffic.crashSearch.uICrashNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCase1() {
			uIMapTraffic.crashSearch.uICaseYearEdit.sendKeys(PoliceData.getTrafficModuleValue("Case1").substring(0, 2));
			uIMapTraffic.crashSearch.uICaseNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("Case1").substring(3));
			uIMapTraffic.crashSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtKSCaseNo() {
			uIMapTraffic.crashSearch.uIKSCaseYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2));
			uIMapTraffic.crashSearch.uIKSCaseNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(3));
			uIMapTraffic.crashSearch.uIKSCaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtKSCrashNo() {
			uIMapTraffic.crashSearch.uIKSCrashYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CrashNo").substring(0, 2));
			uIMapTraffic.crashSearch.uIKSCrashNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CrashNo").substring(3));
			uIMapTraffic.crashSearch.uIKSCrashNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickCaseInfoIcon() {
			uIMapTraffic.crashSearch.uICaseDetailsInfoButton.click();
		}

		public void enterAtOfficer() {
			uIMapTraffic.crashSearch.uIOfficerEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.crashSearch.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void enterAtWIOfficerCode() {
			uIMapTraffic.crashSearch.uIWIOfficerCodeEdit.sendKeys(PoliceData.getTrafficModuleValue("OfficerCode"));
			uIMapTraffic.crashSearch.uIWIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtKSOfficer() {
			uIMapTraffic.crashSearch.uIKSOfficerCodeEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.crashSearch.uIKSOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickInjuredCheckBox() {
			uIMapTraffic.crashSearch.uIInjuredCheckBox.click();
		}

		public void enterCrossRoadName() {
			uIMapTraffic.crashSearch.uICrossRoadNameEdit.sendKeys(PoliceData.getTrafficModuleValue("CrossRoadName"));
			uIMapTraffic.crashSearch.uICrossRoadNameVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void clickRowAtCaseNoByAtCrash() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficModuleValue("CaseNo"));
		}

		public void clickRowAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CaseNo"));
		}

		public void clickRowByAtCrash() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
		}

		public void clickRowByAtCrashNo1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo1"));
		}

		public void selectRowByAtOfficer() {
			Playback.gridLoadThreadWait();
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficModuleValue("Officer"));
		}

		public void selectRowByAtApprovalStatus() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficModuleValue("ApprovalStatus"));
		}

		public void selectRowByAtAccidentLocation() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficModuleValue("AccidentLocation"));

		}

		public void verifyTotalUnitAs0() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual("0", objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Total Unit").getText());
		}

		public void verifyTotalUnitAs1() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo1"));
			verify.ExpectedPropertyValueIsEqual("1", objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Total Unit").getText());
		}

		public void selectRowByAtUnit() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			WebElement location = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Total Unit");
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(location,
					PoliceData.getTrafficModuleValue("Unit"));

		}

		public void selectRowByAtCrash() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));

		}

		public void selectRowByAtCrashNo1() {
			Playback.waitForPageLoad();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo1"));

		}

		public void selectAtApprovalStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashSearch.uIKSApprovalStatusComboBox,
					PoliceData.getTrafficModuleValue("ApprovalStatus"));

		}

		public void selectCrashLocationAsAddress() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.crashSearch.uICrashLocationComboBox,
					"Address");
		}

		public void enterAtPremise() {
			uIMapTraffic.crashSearch.uICrashLocationPremiseEdit.sendKeys(PoliceData.getTrafficModuleValue("Premise"));
		}

		public void enterAtStreet() {
			uIMapTraffic.crashSearch.uICrashLocationStreetEdit.sendKeys(PoliceData.getTrafficModuleValue("Street"));
		}

		public void selectRow() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapTraffic.crashSearch.uICrashSearchResultGrid);
		}

		public void clickApprovedCheckBox() {
			uIMapTraffic.crashSearch.uIApprovalCheckBox.click();
		}

		public void verifyAtCaseNo(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CaseNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Case#", rowIndex));
		}

		public void verifyAtCaseNoByAtCrashNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CaseNo"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Case#").getText());
		}

		public void verifyApprovedStatusAsApprovedByAtCrash() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual("Approved", objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Approval Status").getText());
		}

		public void verifyAtCase1() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo1"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Case1"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Case#").getText());
		}

		public void verifyAtOfficerByAtCrashNo1() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo1"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Officer"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Officer").getText());
		}

		public void verifyAtOfficerByAtCrash() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Officer"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, row, "Officer").getText());
		}

		public void verifyAtOfficer(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Officer"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Officer", rowIndex)
							.getText());
		}

		public void verifyAtApprovalStatus(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Approval Status", rowIndex));
		}

		public void verifyAtAddress(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Address"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Location", rowIndex));
		}

		public void verifyAtCrash(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CrashNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Crash#", rowIndex));
		}

		public void verifyAsCR(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("I", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "CR", rowIndex));
		}

		public void verifyAcknowledgeNoRecord() {
			if (Playback.browserType == "Chrome") {
				popUp.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popUp.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void clickFatalCheckBox() {
			uIMapTraffic.crashSearch.uIFatalCheckBox.click();

		}

		public void clickRefreshButton() {
			uIMapTraffic.crashSearch.uIRefreshButton.click();
		}

		public void enterAtKSPlateNo() {
			uIMapTraffic.crashSearch.uIKSPlateEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PlateNo").substring(0, 6));
			uIMapTraffic.crashSearch.uIKSStateComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("PlateNo").substring(7));
			uIMapTraffic.crashSearch.uIKSStateComboBox.sendKeys(Keys.TAB);

		}

		public void enterAtNameLast() {
			uIMapTraffic.crashSearch.uIKSLastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("NameLast"));
		}

		public void enterAtNameFirst() {
			uIMapTraffic.crashSearch.uIKSFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("NameFirst"));
		}

		public void verifySOJurisRecords() {
			List<String> juris = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Juris");
			for (String value : juris)
				verify.ExpectedPropertyValueIsEqual(value, "");
		}

		public void verifyBEJurisRecords() {
			List<String> juris = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Juris");
			for (String value : juris)
				verify.ExpectedPropertyValueIsEqual(value, "BE");
		}

		public void verifyBLJurisRecords() {
			List<String> juris = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Juris");
			for (String value : juris)
				verify.ExpectedPropertyValueIsEqual(value, "BL");
		}

		public void clickNonReportableCheckBox() {
			uIMapTraffic.crashSearch.uINonReportableCheckBox.click();

		}

		public void clickReportableCheckBox() {
			uIMapTraffic.crashSearch.uIReportableCheckBox.click();

		}

		public void verifyCRAsCInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("C", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "CR", rowIndex));
		}

		public void verifyCrashNoInGrid(String CrashNoDetails, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(CrashNoDetails, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Crash#", rowIndex));
		}

		public void verifyCRAsIInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("I", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "CR", rowIndex));
		}

		public void enterAtTracsRefNo() {
			uIMapTraffic.crashSearch.uIWITracsYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("TracsRefNo").substring(0, 2));
			uIMapTraffic.crashSearch.uIWITracsNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("TracsRefNo").substring(3));
			uIMapTraffic.crashSearch.uIWITracsNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickPrint() {
			uIMapTraffic.crashSearch.uIPrintIconButton.click();
		}

		public void enterAtDOtNo() {
			uIMapTraffic.crashSearch.uIDOTNoEdit.sendKeys(PoliceData.getTrafficModuleValue("DOTNo"));
		}

		public void enterAtAccidentNo() {
			uIMapTraffic.crashSearch.uIAccidentNoEdit.sendKeys(PoliceData.getTrafficModuleValue("AccidentNo"));
		}

		public void selectCrashTypeAsDeerCrash() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.crashSearch.uICrashTypeComboBox,
					"Deer Crash");
		}

		public void verifyCrashTypeAsDInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("D", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Crash Type", rowIndex));
		}

		public void verifyCrashTypeAsCInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("C", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.crashSearch.uICrashSearchResultGrid, "Crash Type", rowIndex));
		}

		public void selectAtSafetyEquipmentUsed() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashSearch.uISafetyEquipmentUsedDropdown,
					PoliceData.getTrafficModuleValue("SafetyEquipmentUsed"));

		}

		public void selectAtApparentContributingCircumstances() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashSearch.uIApparentContributingCircumstancesDropdown,
					PoliceData.getTrafficModuleValue("ApparentContributingCircumstances"));

		}

		public void selectAtApparentPhysicalStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashSearch.uIApparentPhysicalStatusDropdown,
					PoliceData.getTrafficModuleValue("ApparentPhysicalStatus"));

		}

		public void selectAtApprovalStatusForNJ() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashSearch.uINJApprovalStatusComboBox,
					PoliceData.getTrafficModuleValue("ApprovalStatus"));

		}

		public void selectAtApprovalStatus1ForNJ() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.crashSearch.uINJApprovalStatusComboBox,
					PoliceData.getTrafficModuleValue("ApprovalStatus1"));

		}
	}

	public class DeerCrash {

		public DeerCrashAccidentTab deerCrashAccidentTab;
		public DriverTab driverTab;
		public DeerCrashNarrativeTab deerCrashNarrativeTab;

		public DeerCrash() {
			if (deerCrashAccidentTab == null)
				deerCrashAccidentTab = new DeerCrashAccidentTab();

			if (driverTab == null)
				driverTab = new DriverTab();

			if (deerCrashNarrativeTab == null)
				deerCrashNarrativeTab = new DeerCrashNarrativeTab();

		}

		public void enterRandomReportedLocation() {
			uIMapTraffic.deerCrash.uIReportedLocationEdit.sendKeys("b");
			uIMapTraffic.deerCrash.uIReportedLocationEdit.sendKeys(Keys.TAB);
			uIMapTraffic.deerCrash.uIReportedLocationVerifyCheckBox.sendKeys(Keys.TAB);
			// Geo.CommonNameHelp.SelectCommonName();
		}

		public void enterDotNo() {
			uIMapTraffic.deerCrash.uIDotNumberEdit.sendKeys(Randomized.randomNumberString(4));
		}

		public void enterAtOfficer() {
			uIMapTraffic.deerCrash.uIOfficerEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.deerCrash.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void selectRandomOfficer() {
			uIMapTraffic.deerCrash.uIOfficerLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void tabDateAndTime() {
			uIMapTraffic.deerCrash.uIDateEdit.click();
			uIMapTraffic.deerCrash.uIDateEdit.sendKeys(Keys.TAB);
			uIMapTraffic.deerCrash.uITimeEdit.click();
			uIMapTraffic.deerCrash.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void clickAccidentTab() {
			uIMapTraffic.deerCrash.uIAccidentTab.click();
		}

		public void clickDriverTab() {
			uIMapTraffic.deerCrash.uIDriverTab.click();
		}

		public void enterAtDotNo() {
			uIMapTraffic.deerCrash.uIDotNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("DotNo"));
		}

		public void enterAtAccidentNo() {
			uIMapTraffic.deerCrash.uIDotNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("AccidentNo"));
		}

		public void enterAtReportedLocation() {
			uIMapTraffic.deerCrash.uIReportedLocationEdit
					.sendKeys(PoliceData.getTrafficModuleValue("ReportedLocation"));
			uIMapTraffic.deerCrash.uIReportedLocationEdit.sendKeys(Keys.TAB);
		}

		public void clickSave() {
			uIMapTraffic.deerCrash.uISaveButton.click();
		}

		public void saveScreen() {
			Playback.controlReadyThreadWait();
			// objectIdentification.ActionBuilder.DoubleClick(uIMapTraffic.deerCrash.uISaveButton);
			// uIMapTraffic.deerCrash.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void verify1018RequiredEntriesAreMissingAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void switchToNarrativeTab() {
			uIMapTraffic.deerCrash.uINarrativeTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
		}

		public void verifyAcknoledgeUpdateNarrativeTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
		}

		public void clickAllTabs() {
			uIMapTraffic.deerCrash.uIAccidentTab.click();
			uIMapTraffic.deerCrash.uIDriverTab.click();
			uIMapTraffic.deerCrash.uINarrativeTab.click();
			uIMapTraffic.deerCrash.uIAttachmentTab.click();
			uIMapTraffic.deerCrash.uIMapTab.click();
		}

		public void verifyAtTracsRefNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("TracsRefNo").substring(0, 2),
					uIMapTraffic.deerCrash.uITracsRefYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("TracsRefNo").substring(3),
					uIMapTraffic.deerCrash.uITracsRefNumberEdit.getAttribute("value"));
		}

		public void clickDeleteIcon() {
			uIMapTraffic.deerCrash.uIDeleteButton.click();
		}

		public void verifyDeleteConfirmMrssage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType == "Chrome") {
				popUp.confirm.yes();
			} else {
				popUp.switchToConfirm();
				String ConfirmMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(ConfirmMessage.contains("(10090)"));
				verify.ExpectedValueIsTrue(ConfirmMessage.contains("CAUTION"));
				verify.ExpectedValueIsTrue(
						ConfirmMessage.contains("This record will be permanently deleted. Do you wish to proceed?"));
				popUp.confirm.yes();
			}
		}

		public void verify1002AdditionalSuccessfulAckMsg() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType == "Chrome") {
				popUp.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
			} else
				popUp.acknowledge.okWithExpectedMessage(" 1002 - Addition Successful");
			Playback.waitForPageLoad();
		}
	}

	public class DeerCrashAccidentTab {
		public void selectRandomFirstHarmfulEvent() {
			uIMapTraffic.deerCrash.deerCrashAccidentTab.uI1stHarmEventLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectAccidentLocation() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.deerCrashAccidentTab.uIAccidentLocationComboBox);
		}

		public void selectRandomCounty() {
			uIMapTraffic.deerCrash.deerCrashAccidentTab.uICountryLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterHwyNoAsNH() {
			uIMapTraffic.deerCrash.deerCrashAccidentTab.uIOnHwyNumberEdit.sendKeys("NH1");
		}

		public void enterAtOnStreet() {
			uIMapTraffic.deerCrash.deerCrashAccidentTab.uIOnStreetEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Onstreet"));
			uIMapTraffic.deerCrash.deerCrashAccidentTab.uIOnStreetEdit.sendKeys(Keys.TAB);
		}

		public void selectOnHwyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.deerCrashAccidentTab.uIOnHwyTypeComboBox);
			uIMapTraffic.deerCrash.deerCrashAccidentTab.uIOnHwyTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectFromHwyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.deerCrashAccidentTab.uIFromHwyTypeComboBox);
			uIMapTraffic.deerCrash.deerCrashAccidentTab.uIFromHwyTypeComboBox.sendKeys(Keys.TAB);
		}

	}

	public class DriverTab {

		public void selectSpeedLimit() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uISpeedLimitComboBox);
		}

		public void selectOnDutyAccident() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIOnDutyComboBox);
		}

		public void selectUnitStatus() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIUnitStatusComboBox);
		}

		public void selectUnitType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIUnitTypeComboBox);
		}

		public void selectEjected() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIEjectedComboBox);
		}

		public void selectDirectionofTravel() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIDriverTravelComboBox);
		}

		public void selectOperatingDLClass() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIOperatorDLClassComboBox);
		}

		public void selectOperatingDLEndrs() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIOperatorDLEndrsComboBox);
		}

		public void selectInjurySeverity() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIInjurySeverityComboBox);
		}

		public void selectAirBag() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIAirBagComboBox);
		}

		public void selectVehicleDamage() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIVehicleDamageComboBox);
			uIMapTraffic.deerCrash.driverTab.uIVehicleDamageComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectExtentofDamage() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.deerCrash.driverTab.uIExtentofDamageComboBox);
		}

		public void selectRandomVehicle() {
			uIMapTraffic.deerCrash.driverTab.uIVehicleNumberEdit.sendKeys("T1");
			uIMapTraffic.deerCrash.driverTab.uIVehicleLookupButton.click();
			// Vehicle.VehicleBoatSearchHelpWindow.SelectVehicle();
		}

		public void enterAtLastName() {
			uIMapTraffic.deerCrash.driverTab.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTraffic.deerCrash.driverTab.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("FirstName"));
			uIMapTraffic.deerCrash.driverTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterVehicle() {
			uIMapTraffic.deerCrash.driverTab.uIVehicleNumberEdit.sendKeys("85");
			uIMapTraffic.deerCrash.driverTab.uIVehicleNumberEdit.sendKeys(Keys.TAB);
			uIMapTraffic.deerCrash.driverTab.uIVehicleLookupButton.click();
			Playback.controlReadyThreadWait();
		}

	}

	public class DeerCrashNarrativeTab

	{
		public void saveInternalTab() {
			uIMapTraffic.deerCrash.deerCrashNarrativeTab.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void enterRichText() {
			uIMapTraffic.deerCrash.deerCrashNarrativeTab.uINarrativeRichTextEdit.sendKeys(Keys.ENTER);
			uIMapTraffic.deerCrash.deerCrashNarrativeTab.uINarrativeRichTextEdit.click();
			uIMapTraffic.deerCrash.deerCrashNarrativeTab.uINarrativeRichTextEdit.sendKeys(Randomized.randomString(150));
		}
	}

	public class CitationEntry {

		public ViolationsTab violationsTab;
		public LicenseTab licenseTab;
		public OffenseTab offenseTab;
		public PlaintiffTab plaintiffTab;
		public CitationEntryVehicleTab citationEntryVehicleTab;
		public OfficerTab officerTab;
		public CourtTab courtTab;
		public CitationEntryPaymentsTab citationEntryPaymentsTab;
		public CitationEntryNarrativeTab citationEntryNarrativeTab;
		public CitationEntryWitnessTab citationEntryWitnessTab;
		public CitationEntryCommentsTab citationEntryCommentsTab;
		public CitationEntryMapTab citationEntryMapTab;

		public CitationEntry() {

			if (violationsTab == null)
				violationsTab = new ViolationsTab();

			if (licenseTab == null)
				licenseTab = new LicenseTab();

			if (offenseTab == null)
				offenseTab = new OffenseTab();

			if (plaintiffTab == null)
				plaintiffTab = new PlaintiffTab();

			if (citationEntryVehicleTab == null)
				citationEntryVehicleTab = new CitationEntryVehicleTab();

			if (officerTab == null)
				officerTab = new OfficerTab();

			if (courtTab == null)
				courtTab = new CourtTab();

			if (citationEntryPaymentsTab == null)
				citationEntryPaymentsTab = new CitationEntryPaymentsTab();

			if (citationEntryNarrativeTab == null)
				citationEntryNarrativeTab = new CitationEntryNarrativeTab();

			if (citationEntryWitnessTab == null)
				citationEntryWitnessTab = new CitationEntryWitnessTab();

			if (citationEntryCommentsTab == null)
				citationEntryCommentsTab = new CitationEntryCommentsTab();

			if (citationEntryMapTab == null)
				citationEntryMapTab = new CitationEntryMapTab();
		}

		public void selectCETypeAsHandSummon() {
			uIMapTraffic.citationEntry.uICETypeComboBox.sendKeys("Hand Summons");
		}

		public void selectAtCEType() {
			uIMapTraffic.citationEntry.uICETypeComboBox.sendKeys(PoliceData.getTrafficModuleValue("CEType"));
		}

		public void enterAtCallNo() {
			uIMapTraffic.citationEntry.uICallYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CallNo").substring(0, 2));
			uIMapTraffic.citationEntry.uICallNoEdit.sendKeys(PoliceData.getTrafficModuleValue("CallNo").substring(3));
			uIMapTraffic.citationEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}
		public void enterAtCallNo1() {
			uIMapTraffic.citationEntry.uICallYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CallNo1").substring(0, 2));
			uIMapTraffic.citationEntry.uICallNoEdit.sendKeys(PoliceData.getTrafficModuleValue("CallNo1").substring(3));
			uIMapTraffic.citationEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void selectCETypeAsTrafficViolation() {
			uIMapTraffic.citationEntry.uICETypeComboBox.sendKeys("Traffic Violation");
		}

		public void selectCETypeAsNonTrafficViolation() {
			uIMapTraffic.citationEntry.uICETypeComboBox.sendKeys("Non-Traffic Violation");
		}

		public void verifyCENoFieldNotEmpty() {
			verify.ExpectedValueIsFalse(uIMapTraffic.citationEntry.uICENoEdit == null);
		}

		public void enterDate() {
			uIMapTraffic.citationEntry.uIDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterTime() {
			uIMapTraffic.citationEntry.uITimeEdit.click();
			uIMapTraffic.citationEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void enterNameType() {
			uIMapTraffic.citationEntry.uINameTypeEdit.sendKeys("A");
		}

		public void enterNameTypeID() {
			uIMapTraffic.citationEntry.uINameTypeIDEdit.sendKeys("");
		}

		public void save() {
			uIMapTraffic.citationEntry.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void Yes() {
			popUp.confirm.yes();
		}

		public void saveandCloseTheScreen() {
			uIMapTraffic.citationEntry.uISaveAndCloseButton.click();
			popUp.confirm.yes();
		}

		public void selectDefendantType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.citationEntry.uIDefendantTypeComboBox);
		}

		public void selectDefendantTypeAsIndividaulAdult() {
			uIMapTraffic.citationEntry.uIDefendantTypeComboBox.sendKeys("1 - Individaul - Adult");
		}

		public void enterAtLastName() {
			uIMapTraffic.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("FirstName"));
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterLastNameAtAdultLastName() {
			uIMapTraffic.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("AdultLastName"));
		}

		public void enterFirstNameAtAdultFirstName() {
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("AdultFirstName"));
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterCitationNumber() {
			uIMapTraffic.citationEntry.uICitationNumberEdit.sendKeys("783");
		}

		public void closeCitationEntryScreen() {
			uIMapTraffic.citationEntry.driver.close();
		}

		public void enterLastNameAtWarrantLastName() {
			uIMapTraffic.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("WarrantLastName"));
		}

		public void enterFirstNameAtWarrantFirstName() {
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("WarrantFirstName"));
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void enterAtNameID() {
			uIMapTraffic.citationEntry.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(0, 1));
			uIMapTraffic.citationEntry.uINameTypeIDEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(2));
			uIMapTraffic.citationEntry.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCitationNo() {
			uIMapTraffic.citationEntry.uICitationNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CitationNo"));
		}

		public void verifyJnameDetailsRemoved() {
			verify.ExpectedPropertyValueIsEqual("", uIMapTraffic.citationEntry.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual("", uIMapTraffic.citationEntry.uINameTypeIDEdit.getAttribute("value"));
		}

		public void verifyAddressFieldRemoved() {
			verify.ExpectedPropertyValueIsEqual("", uIMapTraffic.citationEntry.uIAddressEdit.getAttribute("value"));
		}
		public void verifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.citationEntry.uIAddressEdit.getText(), PoliceData.getTrafficModuleValue("Address"));
		}
		

		public void verifyJuvinalNameConfirmMessage() {
			popUp.confirm.noWithExpectedMessage(
					"(6125) You have selected a Juvenile Name record. This individual is no longer a Juvenile. Select YES to use this Juvenile Name record, or select NO to choose the Adult Name record or to create a 'New' Adult Name record for this individual.");
		}

		public void verify1018RequiredEntriesAreMissingAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyWarrantIcon() {
			verify.ExpectedValueIsFalse(
					uIMapTraffic.citationEntry.uIWarrantIconButton.getAttribute("src").contains("warrant"));
		}

		public void verifyAcknowledgeCharge() {
			popUp.acknowledge.okWithExpectedMessage("(6515) Charge is Required");
		}

		public void verifyAcknowlwdgeOfficerRequired() {
			popUp.acknowledge.okWithExpectedMessage("(10008) Officer is required");

		}

		public void switchToOffenseTab() {
			uIMapTraffic.citationEntry.uIOffenseTab.click();
		}

		public void switchToViolationsTab() {
			uIMapTraffic.citationEntry.uIViolationsTab.click();
		}

		public void switchToPlaintiffTab() {
			uIMapTraffic.citationEntry.uIPlaintiffTab.click();
		}

		public void switchToLicenseTab() {
			uIMapTraffic.citationEntry.uILicenseTab.click();
		}

		public void switchToVehicleTab() {
			uIMapTraffic.citationEntry.uIVehicleTab.click();
		}

		public void switchToOfficerTab() {
			uIMapTraffic.citationEntry.uIOfficerTab.click();
		}

		public void switchToCourtTab() {
			uIMapTraffic.citationEntry.uICourtTab.click();
		}

		public void switchToPaymentTab() {
			uIMapTraffic.citationEntry.uIPaymentsTab.click();
		}

		public void switchToNarrativeTab() {
			uIMapTraffic.citationEntry.uINarrativeTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
		}

		public void switchToWitnessTab() {
			uIMapTraffic.citationEntry.uIWitnessTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmWitness");
		}

		public void switchToCommentsTab() {
			uIMapTraffic.citationEntry.uICommentsTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void switchToMapTab() {
			uIMapTraffic.citationEntry.uIMapTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("GHydrantMap");
		}

		public void verifyOnHoldAppears() {
			verify.ExpectedPropertyValueIsEqual("On Hold",
					uIMapTraffic.citationEntry.uIApprovalStatusTextView.getText());
		}

		public void verifyCitationNoDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.citationEntry.uICitationNumberEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void clickNameInfoButton() {
			uIMapTraffic.citationEntry.uINameInfoButton.click();
		}

		public void clickCopyButton() {
			uIMapTraffic.citationEntry.uICopyButton.click();
		}

		public void verifyCitationFieldEditable() {
			verify.ExpectedValueIsFalse(
					uIMapTraffic.citationEntry.uICitationNumberEdit.getAttribute("class").contains("textbox"));
		}

		public void verifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTraffic.citationEntry.uIDateEdit.getAttribute("value"));
		}

		public void switchToAllTabs() {
			uIMapTraffic.citationEntry.uILicenseTab.click();
			uIMapTraffic.citationEntry.uIVehicleTab.click();
			uIMapTraffic.citationEntry.uIOffenseTab.click();
			uIMapTraffic.citationEntry.uIPlaintiffTab.click();
			// uIMapTraffic.citationEntry.uILicenseTab.click();
			uIMapTraffic.citationEntry.uIOfficerTab.click();
			uIMapTraffic.citationEntry.uICourtTab.click();
			uIMapTraffic.citationEntry.uIPaymentsTab.click();
			uIMapTraffic.citationEntry.uINarrativeTab.click();
			uIMapTraffic.citationEntry.uIAttachmentTab.click();
			uIMapTraffic.citationEntry.uICommentsTab.click();

		}

		public void switchToNonTrafficAllTabs() {
			uIMapTraffic.citationEntry.uIViolationsTab.click();
			uIMapTraffic.citationEntry.uICourtTab.click();
			uIMapTraffic.citationEntry.uIPaymentsTab.click();
			uIMapTraffic.citationEntry.uINarrativeTab.click();
			uIMapTraffic.citationEntry.uIAttachmentTab.click();
			uIMapTraffic.citationEntry.uIWitnessTab.click();
			uIMapTraffic.citationEntry.uICommentsTab.click();
			uIMapTraffic.citationEntry.uIMapTab.click();
			uIMapTraffic.citationEntry.uIApprovalTab.click();

		}

		public void verify6515ChargeRequiredAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(6515) Charge is Required");
		}

		public void savePrintButton() {
			uIMapTraffic.citationEntry.uISavePrintButton.click();
			popUp.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapTraffic.citationEntry.uISaveButton.click();

		}

		public void clickSavePrintButton() {
			uIMapTraffic.citationEntry.uISavePrintButton.click();
		}

		public void verifyHistroyCopyButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICopyButton.isEnabled());
			verify.ExpectedValueIsFalse(uIMapTraffic.citationEntry.uICopyButton.isDisplayed());
		}

		public void clickPrintButton() {
			Playback.controlReadyThreadWait();
			uIMapTraffic.citationEntry.uIPrintButton.click();
		}

		public void verifyCENoFieldEmpty() {
			verify.ExpectedValueIsFalse(uIMapTraffic.citationEntry.uICENoEdit.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICEYearEdit.getAttribute("value").contains(""));
		}
		public void verifyCaseNoCallNoEmpty() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICaseYearEdit.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICaseNoEdit.getAttribute("value").contains(""));
			
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICallYearEdit.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICallNoEdit.getAttribute("value").contains(""));
		
		}


		public void verifyAtCENo() {

			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.citationEntry.uICEYearEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CENo").substring(0, 2));
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.citationEntry.uICENoEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CENo").substring(3));
		}
		public void verifyAtCallNo() {

			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.citationEntry.uICallYearEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CallNo").substring(0, 2));
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.citationEntry.uICallNoEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CallNo").substring(3));
		}
		
		public void verifyAtCaseNo() {

			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.citationEntry.uICaseYearEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2));
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.citationEntry.uICaseNoEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CaseNo").substring(3));
		}


		public void tabAtDateAndTime()
        {
			uIMapTraffic.citationEntry.uIDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			uIMapTraffic.citationEntry.uITimeEdit.click();
			uIMapTraffic.citationEntry.uITimeEdit.sendKeys(Keys.TAB);
		}
		public void verifyNameFieldMandatory() {
			String attribute = uIMapTraffic.citationEntry.uINameIdlbl.getCssValue("color");
			verify.ExpectedValueIsTrue(attribute.contains("rgba(153, 0, 0, 1)"));
		}

		public void verifyAdditionSuccessfulMessage() 
        {
			String UpdateMessage = uIMapTraffic.citationEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}

		public void enterAtCaseNo() {
			uIMapTraffic.citationEntry.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2));
			uIMapTraffic.citationEntry.uICaseNoEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(3));
			uIMapTraffic.citationEntry.uICaseNoEdit.sendKeys(Keys.TAB);
		}
		
		public void selectAtDefendantType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.citationEntry.uIDefendantTypeComboBox,
					PoliceData.getTrafficModuleValue("DefendantType"));
			Playback.gridLoadThreadWait();
			uIMapTraffic.citationEntry.uIDefendantTypeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtCSZCounty() 
		{
			String attribute = uIMapTraffic.citationEntry.uICSZCountyEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getTrafficModuleValue("CSZCounty")));
		}

		public void verifyCSZCountyIsInDisabledMode() 
		{
			String attribute = uIMapTraffic.citationEntry.uICSZCountyEdit.getAttribute("class");
			verify.ExpectedValueIsTrue(attribute.contains("Inactive"));
		}

		public void switchToAttachmentTab()
		{
			uIMapTraffic.citationEntry.uIAttachmentTab.click();		
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx.aspx");
			
	}

		public void clickCaseInfoIcon() 
		{
			uIMapTraffic.citationEntry.uICaseInfoIcon.click();
			
		}

		public void clickResetIcon() 
		{
			uIMapTraffic.citationEntry.uIResetButton.click();
			
		}

		public void verifyCitationNo(String citation) {																							// Added by Abi
			verify.ExpectedPropertyValueIsEqual(citation, uIMapTraffic.citationEntry.violationsTab.uICitationNumberEdit.getAttribute("value"));
		}	

	public String readCENo() {																												// Added by Abi
	String idYear=uIMapTraffic.citationEntry.uICEYearEdit.getAttribute("value");
	String idNum=uIMapTraffic.citationEntry.uICENoEdit.getAttribute("value");
	return idYear+idNum;
}

public void verifyCENo(String ceNo) {																									//Added by Abi
	verify.ExpectedValueIsTrue(ceNo.contains(uIMapTraffic.citationEntry.uICEYearEdit.getAttribute("value")));
	verify.ExpectedValueIsTrue(ceNo.contains(uIMapTraffic.citationEntry.uICENoEdit.getAttribute("value")));
}

	}

	public class ViolationsTab {
		public void enterLocation() {
			uIMapTraffic.citationEntry.violationsTab.uILocationEdit.sendKeys("107 Walnut Ave");
		}

		public void enterOfficer() {
			uIMapTraffic.citationEntry.violationsTab.uIOfficerEdit.sendKeys("");
		}

		public void enterAtLocation() {
			// uIMapTraffic.citationEntry.violationsTab.uILocationEdit.clear();
			uIMapTraffic.citationEntry.violationsTab.uILocationEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Location"));
			uIMapTraffic.citationEntry.violationsTab.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void clickLocationVerifyCheckbox() {
			uIMapTraffic.citationEntry.violationsTab.uIChargeLookupButton.click();
			uIMapTraffic.citationEntry.violationsTab.uIChargeLookupButton.sendKeys(Keys.TAB);
		}

		public void enterCharge() {
			uIMapTraffic.citationEntry.violationsTab.uIChargeEdit.sendKeys("11.");
			uIMapTraffic.citationEntry.violationsTab.uIChargeLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Location"),
					uIMapTraffic.citationEntry.violationsTab.uILocationEdit.getAttribute("value"));
		}

		public void enterAtCharge() {
			uIMapTraffic.citationEntry.violationsTab.uIChargeEdit.sendKeys(PoliceData.getTrafficModuleValue("Charge"));
			uIMapTraffic.citationEntry.violationsTab.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void selectServedMethodasInPersion() {
			uIMapTraffic.citationEntry.violationsTab.uIServedMethodComboBox.sendKeys("P-IN PERSON");
		}

		public void clickAddButton() {
			uIMapTraffic.citationEntry.violationsTab.uIAddButton.click();
		}

		public void verifyChargeAcknowledge() {
			popUp.acknowledge.okWithExpectedMessage("(10013) At least one Violation entry is required");
		}

		public void verifyViolationTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uIViolationsTab.getAttribute("class")
					.contains("igtab_BlueThemeTHText igtab_BlueThemeTHTextDis"));
		}

		public void verifyOfficeField() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.violationsTab.uIOfficerEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("UserName"));
		}

		public void verifyAtPFInOfficeField() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.violationsTab.uIOfficerEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("PF"));
		}

		public void tabOfficer() {
			uIMapTraffic.citationEntry.violationsTab.uIVoilationOfficerEdit.sendKeys(Keys.TAB);
		}

		public void verifyNIBRSField() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.violationsTab.uIOfficerEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("UserName"));
		}

		public void verifyAcknowledgeViolationEntry() {
			popUp.acknowledge.okWithExpectedMessage("(10013) At least one Violation entry is required");
		}

		public void verifyViolationAddedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapTraffic.citationEntry.violationsTab.uIViolationTabResultGrid) == 1);
		}

		public void selectAtWINIBRS() {
			uIMapTraffic.citationEntry.violationsTab.uINIBRSComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("NIBRS"));
			uIMapTraffic.citationEntry.violationsTab.uINIBRSComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void tabOfficerWI() {
			uIMapTraffic.citationEntry.violationsTab.uIOfficerWIEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtChargeWI() {
			uIMapTraffic.citationEntry.violationsTab.uIChargeWIEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Charge"));
			uIMapTraffic.citationEntry.violationsTab.uIChargeWIEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickAddWIButton() {
			uIMapTraffic.citationEntry.violationsTab.uIAddWIButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtNIBRSWI() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("NIBRS"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapTraffic.citationEntry.violationsTab.uINIBRSComboBox));
		}

		public void clickRowInGrid(int rowIndex) {
			objectIdentification.manualIdentify
					.getGridTableRow(uIMapTraffic.citationEntry.violationsTab.uIViolationTabResultGrid, rowIndex);
			Playback.controlReadyThreadWait();
		}

		public void verifyAtLocationWI() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Location"),
					uIMapTraffic.citationEntry.violationsTab.uILocationWIEdit.getAttribute("value"));
		}

		public void enterAtLocationWI() {
			uIMapTraffic.citationEntry.violationsTab.uILocationWIEdit.clear();
			uIMapTraffic.citationEntry.violationsTab.uILocationWIEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Location"));
			uIMapTraffic.citationEntry.violationsTab.uILocationWIEdit.sendKeys(Keys.TAB);
		}

		public void verifyViolationWIAddedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapTraffic.citationEntry.violationsTab.uIViolationTabWIResultGrid) == 1);
		}

		public void clickLocationInfoIconWI() {
			uIMapTraffic.citationEntry.violationsTab.uILocationInfoIconWIEdit.click();
			Playback.controlReadyThreadWait();
		}

		public void clickLocationVerifyWICheckbox() {
			uIMapTraffic.citationEntry.violationsTab.uILocationVerifyCheckBox.click();
			uIMapTraffic.citationEntry.violationsTab.uILocationVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void clickLocationInfoIcon() {
			uIMapTraffic.citationEntry.violationsTab.uILocationInfoIconWIEdit.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtNIBRS() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("NIBRS"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapTraffic.citationEntry.violationsTab.uINIBRSComboBox));
		}

		public void verifyLocationInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.violationsTab.uILocationInfoIcon.isDisplayed());

		}

		public void verifyAtChargeDescription() {
			String desc = uIMapTraffic.citationEntry.violationsTab.uIChargeDescripton.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ChargeDescription"), desc);
		}

		public void verifyAtChargeInTheGrid(int rowIndex) {
			String chargeAndDesc = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapTraffic.citationEntry.violationsTab.uIViolationTabResultGrid, "Charge", rowIndex);
			String charge = PoliceData.getTrafficModuleValue("Charge");
			String chargeDis = PoliceData.getTrafficModuleValue("ChargeDescription");
			verify.ExpectedPropertyValueIsEqual(charge + ", " + chargeDis, chargeAndDesc);
		}

		public void VerifyAdditionSuccessfulMessage() {
			String UpdateMessage = uIMapTraffic.citationEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}

		public void enterAtCitationNo() {
			uIMapTraffic.citationEntry.violationsTab.uICitationNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CitationNo"));
			uIMapTraffic.citationEntry.violationsTab.uICitationNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCharge1() {
			uIMapTraffic.citationEntry.violationsTab.uIChargeEdit.sendKeys(PoliceData.getTrafficModuleValue("Charge1"));
			uIMapTraffic.citationEntry.violationsTab.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void verifyCitationNoisEnabled() {												// Added by Abi
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.violationsTab.uICitationNumberEdit.isEnabled());
		}
		public void verifyCitationNoisDisabled() {												// Added by Abi
			verify.ExpectedValueIsFalse(uIMapTraffic.citationEntry.violationsTab.uICitationNumberEdit.isEnabled());
		}

		public void verifyCitationNo(String citation) {											// Added by Abi
			verify.ExpectedPropertyValueIsEqual(citation, uIMapTraffic.citationEntry.violationsTab.uICitationNumberEdit.getAttribute("value"));
		}
	}

	public class OffenseTab {
		public void enterAtDescribeLocation() {
			uIMapTraffic.citationEntry.offenseTab.uIDescribeLocationEdit.clear();
			uIMapTraffic.citationEntry.offenseTab.uIDescribeLocationEdit
					.sendKeys(PoliceData.getTrafficModuleValue("DescribeLocation"));

			uIMapTraffic.citationEntry.offenseTab.uIDescribeLocationEdit.sendKeys(Keys.TAB);

		}

		public void enterCharge() {
			uIMapTraffic.citationEntry.offenseTab.uIChargeEdit.sendKeys("11.");
			uIMapTraffic.citationEntry.offenseTab.uIChargeLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtCharge() {
			uIMapTraffic.citationEntry.offenseTab.uIChargeEdit.sendKeys(PoliceData.getTrafficModuleValue("Charge"));
			uIMapTraffic.citationEntry.offenseTab.uIChargeEdit.sendKeys(Keys.TAB);

		}

		public void enterChargeAsFugitiveFelony() {
			uIMapTraffic.citationEntry.offenseTab.uIChargeEdit.sendKeys("FUGITIVE-FELONY");
			uIMapTraffic.citationEntry.offenseTab.uIChargeLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtStreet2() {
			uIMapTraffic.crashSearch.uIIntersectionStreet2Edit.sendKeys(PoliceData.getTrafficModuleValue("Street2"));
			uIMapTraffic.crashSearch.uIIntersectionStreet2Edit.sendKeys(Keys.TAB);
		}

		public void enterAtStreet() {
			uIMapTraffic.citationEntry.offenseTab.uIStreetEdit.sendKeys(PoliceData.getTrafficModuleValue("Street"));
			uIMapTraffic.citationEntry.offenseTab.uIStreetEdit.sendKeys(Keys.TAB);
		}

		public void clickUnclearPlates() {
			uIMapTraffic.citationEntry.offenseTab.uIUnclearPlatesCheckBox.click();
		}

		public void verifyAtInThe() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.citationEntry.offenseTab.uIInTheComboBox)
					.contains(PoliceData.getTrafficModuleValue("Inthe")));
		}

		public void verifyNIBRSField() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.offenseTab.uIChargeEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("UserName"));
		}

		public void verifyAtMunicipality() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.offenseTab.uIMunicipalityDescribeTextView.getAttribute("value"),
					PoliceData.getTrafficModuleValue("Municipality"));
		}

public void verifyUnclearPlateCheckBox() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.citationEntry.offenseTab.uIUnclearPlatesCheckBox.getAttribute("checked").contains("true"));
		}

		public void verifySatatueOrdinaceCodeValueGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.offenseTab.uISatatueOrdinaceCodeValueEdit
					.getAttribute("class").contains("textboxInactive"));
		}

	public void verifyAsServiceMethod() {
			if (Playback.browserType.contains ("Chrome")) {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
						uIMapTraffic.citationEntry.offenseTab.uIServiceMethodComboBox).contains("P - IN PERSON "));
			} else
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
						uIMapTraffic.citationEntry.offenseTab.uIServiceMethodComboBox).contains("P - IN PERSON"));
		}


		public void clickDescribeLocationInfoButton() {
			uIMapTraffic.citationEntry.offenseTab.uIDescribeLocationInfoButton.click();
		}

		public void tabOutOffenseDateTime() {
			uIMapTraffic.citationEntry.offenseTab.uIOffenseDateEdit.sendKeys(Keys.TAB);
			uIMapTraffic.citationEntry.offenseTab.uIOffenseTimeEdit.sendKeys(Keys.TAB);
		}

		public void clickCodeValueSearchIcon()
        {
            uIMapTraffic.citationEntry.offenseTab.uIStatueValueSearchIcon.click();
            
        }

		public void verifyNIBRSFieldAsDisabled()
        {
            verify.ExpectedValueIsTrue(!uIMapTraffic.citationEntry.offenseTab.uINIBRSDropDown.isEnabled());
           
        }
		public void clickNIBRSButton()
		{
			uIMapTraffic.citationEntry.offenseTab.uINIBRSButton.click();
		}


		public void clickCodeValueNJLookUpIcon() {
			uIMapTraffic.citationEntry.offenseTab.uICodeValueNJLookupIcon.click();
		}

		public void selectAtNIBRS() 
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.citationEntry.offenseTab.uINIBRSDropDown, PoliceData.getTrafficModuleValue("NIBRS"));
			
		}
		public void verifyNIBRSAsMandatory() {
			String text = uIMapTraffic.citationEntry.offenseTab.uINIBRSText.getAttribute("style");
			verify.ExpectedValueIsTrue(text.contains("rgb(153, 0, 0)"));
		}
	}

	public class PlaintiffTab {

		public void selectPlaintiffTypeAsStateofNewJersey() {
			uIMapTraffic.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox.sendKeys("4 - State of New Jersey");
		}

		public void selectPlaintiffTypeAsCountyOf() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox, "2 - County of");

		}

		public void selectCounty() {
			uIMapTraffic.citationEntry.plaintiffTab.uICountySearchButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyKPILable() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.plaintiffTab.uIKPILabelTextView.getText()
					.contains("To Update A 'Read Only' Field, Go To The Court Tab"));
		}

		public void verifyAtPliantiffType() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapTraffic.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox).contains(PoliceData
							.getTrafficModuleValue("PlaintiffType")));
		}


		public void verifyAtCityVillageTown() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.plaintiffTab.uICityVillageTownTextView.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CityVlgTwn"));
		}

		public void verifyAtCourtType() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.plaintiffTab.uICourtTypeTextView.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CourtType"));
		}

		public void verifyAtCourt() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.citationEntry.plaintiffTab.uICourtNameTextView.getAttribute("value"),
					PoliceData.getTrafficModuleValue("Court"));
		}

		public void verifyPaymentMethodTranProsOffGrayedOut() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.citationEntry.plaintiffTab.uIPaymentMethodComboBox.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapTraffic.citationEntry.plaintiffTab.uITranProsOffComboBox.getAttribute("disabled").contains("true"));
		}

	}

	public class LicenseTab {
		public void verifyAtDOB() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("DOB"),
					uIMapTraffic.citationEntry.licenseTab.uIDOBEdit.getAttribute("value"));
		}

		public void verifyAtGender() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Gender"),
					uIMapTraffic.citationEntry.licenseTab.uIGenderEdit.getAttribute("value"));
		}

		public void verifyAtRace() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Race"),
					uIMapTraffic.citationEntry.licenseTab.uIRaceEdit.getAttribute("value"));
		}

		public void verifyAtHeight() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Height"),
					uIMapTraffic.citationEntry.licenseTab.uIHeightEdit.getAttribute("value"));
		}

		public void verifyAtWeight() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Weight"),
					uIMapTraffic.citationEntry.licenseTab.uIWeightEdit.getAttribute("value"));
		}

		public void verifyAtSSNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("SSNo"),
					uIMapTraffic.citationEntry.licenseTab.uISSNoEdit.getAttribute("value"));
		}

		public void verifyAtDrivierLicenseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("DriverLicNo"),
					uIMapTraffic.citationEntry.licenseTab.uIDrivierLicenseNoEdit.getAttribute("value"));
		}

		public void verifyDLCheckBox() {
			verify.ExpectedValueIsFalse(uIMapTraffic.citationEntry.licenseTab.uINoDLCheckBox.isEnabled());
		}

		public void clickNoDLCheckbox() {
			uIMapTraffic.citationEntry.licenseTab.uINoDLCheckbox.click();
		}
	}

	public class CitationEntryVehicleTab {
		public void clickNoPlateCheckBox() {
			uIMapTraffic.citationEntry.citationEntryVehicleTab.uINoPlateCheckBox.click();
		}

		public void enterAtPlateNo() {
			uIMapTraffic.citationEntry.citationEntryVehicleTab.uIPlateVinEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PlateNo"));
			uIMapTraffic.citationEntry.citationEntryVehicleTab.uIStateComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("PlateState"));
			uIMapTraffic.citationEntry.citationEntryVehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectVehicle() {
			// Vehicle.VehicleBoatSearchHelpWindow.selectVehicleAtVinNo();
		}

		public void verifyPlateOrVinNoGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.citationEntryVehicleTab.uIPlateVinEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyAtLicensePlateType() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("LicPlateType"),
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uILicensePlateTypeEdit.getAttribute("value"));
		}

		public void verifyAtIssueState() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("IssueState"),
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uIIssuingStateEdit.getAttribute("value"));
		}

		public void verifyAtPlateExpirationYear() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("PlateExpirationYear"),
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uIPlateExpirationYearEdit.getAttribute("value"));
		}

		public void verifyAtVehicleYear() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("VehicleYear"),
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uIVehicleYearEdit.getAttribute("value"));
		}

		public void verifyAtVehicleMake() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("VehicleMake"),
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uIVehicleMakeEdit.getAttribute("value"));
		}

		public void verifyAtVehicleColor() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("VehicleColor"),
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uIVehicleColorEdit.getAttribute("value"));
		}

		public void verifyAtVinNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("VINNo"),
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uIVinNoEdit.getAttribute("value"));
		}

		public void verifyVehicleInfoButton() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.citationEntry.citationEntryVehicleTab.uIVehicleInfoButton.isDisplayed());
		}
	}

	public class OfficerTab {
		public void verifyAtOfficer() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Officer"),
					uIMapTraffic.citationEntry.officerTab.uIOfficercomplianingWitnessEdit.getAttribute("value"));

					System.out.println(uIMapTraffic.citationEntry.officerTab.uIOfficercomplianingWitnessEdit.getAttribute("value"));
		}

		public void selectIssuingOfficer() {
			uIMapTraffic.citationEntry.officerTab.uIIssuingOfficerLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectArea() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.citationEntry.officerTab.uIAreaComboBox);
		}

		public void selectRoad() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.citationEntry.officerTab.uIRoadComboBox);
		}

		public void selectTraffic() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.citationEntry.officerTab.uITrafficComboBox);
		}

		public void selectVisibility() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.citationEntry.officerTab.uIVisibilityComboBox);
		}

		public void selectNoOfLanes() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.citationEntry.officerTab.uINoLanesComboBox);
		}

		public void selectAccidentAsNo() {
			uIMapTraffic.citationEntry.officerTab.uIAccidentComboBox.sendKeys("No");
		}

		public void checkRadar() {
			uIMapTraffic.citationEntry.officerTab.uIRadarCheckBox.click();
		}

		public void selectEquipOperatorName() {
			uIMapTraffic.citationEntry.officerTab.uIEquipOperatorNameLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyInfoExist() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.citationEntry.officerTab.uIRoadComboBox).contains("--"));
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.citationEntry.officerTab.uIAreaComboBox).contains("--"));
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.citationEntry.officerTab.uINoLanesComboBox).contains("--"));
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.citationEntry.officerTab.uIAccidentComboBox).contains("--"));
		}

		public void enterAtPFCode() {
			uIMapTraffic.citationEntry.officerTab.uIOfficerPFEdit.sendKeys(PoliceData.getTrafficModuleValue("PFCode"));
			uIMapTraffic.citationEntry.officerTab.uIOfficerPFEdit.sendKeys(Keys.TAB);
		}

		public void tabOfficerNJ() {
			uIMapTraffic.citationEntry.officerTab.uIOfficercomplianingWitnessEdit.sendKeys(Keys.TAB);
		}
	}

	public class CourtTab {
		public void verifyGridAtOriginalCharge(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("OriginalCharge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid, "Charge", rowIndex));
		}

		public void verifyAtCharge(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Charge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid, "Charge", rowIndex));
		}

		public void clickRowAtOriginalCharge() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid,
					PoliceData.getTrafficModuleValue("OriginalCharge"));
		}

		public void clickRowAtCharge() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid,
					PoliceData.getTrafficModuleValue("Charge"));
		}

		public void verifyAtOriginalChrage() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("OriginalCharge"),
					uIMapTraffic.citationEntry.courtTab.uIOriginalChargeEdit.getAttribute("value"));
		}

		public void enterCourtDateAsCurrentDate() {
			uIMapTraffic.citationEntry.courtTab.uICourtDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapTraffic.citationEntry.courtTab.uICourtDateEdit.sendKeys(Keys.TAB);
		}

		public void enterCourtDateAsCurrentTime() {
			uIMapTraffic.citationEntry.courtTab.uICourtTimeEdit.sendKeys(Randomized.getCurrentTime("HH:mm"));
			uIMapTraffic.citationEntry.courtTab.uICourtTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtDisposition() {
			uIMapTraffic.citationEntry.courtTab.uIDispositionEdit.click();
			uIMapTraffic.citationEntry.courtTab.uIDispositionEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Disposition"));
			uIMapTraffic.citationEntry.courtTab.uIDispositionEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPenality() {
			uIMapTraffic.citationEntry.courtTab.uIPenaltyAmountEdit.click();
			uIMapTraffic.citationEntry.courtTab.uIPenaltyAmountEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Penalty"));
		}

		public void clickUpdateButton() {
			uIMapTraffic.citationEntry.courtTab.uIUpdateButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyCourtDateAsCurrentDate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid, "Court", rowIndex)
					.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtDisposition(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Disposition"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid,
									"Disposition", rowIndex)
							.toUpperCase());
		}

		public void verifyAtPenalty(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid, "Penalty", rowIndex)
					.replace("$", "").contains(PoliceData.getTrafficModuleValue("Penalty")));
		}

		public void verifyAtFineFineForfeiture(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapTraffic.citationEntry.courtTab.uICourtTabResultGrid,
									"Fine/Forfeiture", rowIndex)
							.replace("$", "").contains(PoliceData.getTrafficModuleValue("Penalty")));
		}

		public void verifyAcknoledgeUpdateCourtTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Court Tab. You must save or reset.");
		}

		public void verifyBalance() {
			verify.ExpectedPropertyValueIsEqual("$0.00",
					uIMapTraffic.citationEntry.courtTab.uIBalanceTextView.getAttribute("value"));
		}

		public void enterAtFine() {
			uIMapTraffic.citationEntry.courtTab.uIFineForfeitureEdit.sendKeys(PoliceData.getTrafficModuleValue("Fine"));
		}

		public void verifyDocketLabelAsCustomField() {
			String attribute = uIMapTraffic.citationEntry.courtTab.uIDocketLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("underline"));

		}

		public void clickDocketNoLabel() {
			uIMapTraffic.citationEntry.courtTab.uIDocketLabel.click();
		}

		public void verifyDocketNoLabelInDisabledMode() {
			String attribute = uIMapTraffic.citationEntry.courtTab.uIDocketLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("gray"));

		}

		public void verifyDocketNoLabelAsMandatory() {
			String attribute = uIMapTraffic.citationEntry.courtTab.uIDocketLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("rgb(153, 0, 0)"));
		}

		public void enterAtDocketNo() {
			uIMapTraffic.citationEntry.courtTab.uIDocketNoEdit.sendKeys(PoliceData.getTrafficModuleValue("DocketNo"));
			uIMapTraffic.citationEntry.courtTab.uIDocketNoEdit.sendKeys(Keys.TAB);
		}

		public void clearDocketNo() {
			uIMapTraffic.citationEntry.courtTab.uIDocketNoEdit.clear();

		}

		public void verifyDocketNoAcknowledgeMessageFor45() {
			popUp.acknowledge.okWithExpectedContainMessage("(1018)Required Entries are Missing Docket No");

		}

	}

	public class CitationEntryPaymentsTab {
		public void enterDateAsCurrentDate() {
			uIMapTraffic.citationEntry.citationEntryPaymentsTab.uIDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void enterPayment() {
			uIMapTraffic.citationEntry.citationEntryPaymentsTab.uIPaymentEdit.click();
			uIMapTraffic.citationEntry.citationEntryPaymentsTab.uIPaymentEdit
					.sendKeys(uIMapTraffic.citationEntry.citationEntryPaymentsTab.uIBalanceEdit.getAttribute("value")
							.replace("$", ""));
		}

		public void selectMethod() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTraffic.citationEntry.citationEntryPaymentsTab.uIMethodComboBox);
		}

		public void enterReciptReference() {
			uIMapTraffic.citationEntry.citationEntryPaymentsTab.uIReciptReferenceEdit
					.sendKeys(Randomized.randomString(25));
		}

		public void verifyBalance() {
			verify.ExpectedPropertyValueIsEqual("$0.00",
					uIMapTraffic.citationEntry.citationEntryPaymentsTab.uIBalanceEdit.getAttribute("value"));
		}
	}

	public class CitationEntryNarrativeTab {
		public void enterGroupOfStrings() {

			Playback.controlReadyThreadWait();
			objectIdentification.actionBuilder
					.MoveToElement(uIMapTraffic.citationEntry.citationEntryNarrativeTab.uINarrativeRichTextEdit);
			objectIdentification.actionBuilder.SendKeys(Randomized.randomString(200));
			Playback.controlReadyThreadWait();

		}

		public void verifyAcknowledgeUpdateNarrativeTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
		}

		public void internalSave() {
			uIMapTraffic.citationEntry.citationEntryNarrativeTab.uIInternalSaveButton.click();
			popUp.confirm.yes();
		}

		public void enterNarative() {
			objectIdentification.windowHandle
					.switchToFrame(uIMapTraffic.citationEntry.citationEntryNarrativeTab.uINarrativeRichTextEdit);
			uIMapTraffic.citationEntry.citationEntryNarrativeTab.uINarrativeEditField.click();
			uIMapTraffic.citationEntry.citationEntryNarrativeTab.uINarrativeEditField.sendKeys("Automation Test");

		}

		public void clickAddNewButton() {
			uIMapTraffic.citationEntry.citationEntryNarrativeTab.uIAddNewButton.click();
		}

		public void verifyAtTemplateComboBoxAsExistingValue() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.citationEntry.citationEntryNarrativeTab.uITemplateComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem, PoliceData.getTrafficModuleValue("Template"));

		}

		public void clickLoadButton() {
			uIMapTraffic.citationEntry.citationEntryNarrativeTab.uILoadButton.click();
		}

		public void selectAtTemplate() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.citationEntry.citationEntryNarrativeTab.uITemplateComboBox,
					PoliceData.getTrafficModuleValue("Template"));

		}

		public void verifyRichTextIsDisplayed(String richText) {
			objectIdentification.windowHandle
					.switchToFrame(uIMapTraffic.citationEntry.citationEntryNarrativeTab.uINarrativeRichTextEdit);
			String text = Playback.driver.findElement(By.xpath(".//body")).getText();
			verify.ExpectedValueIsTrue(text.contains(richText));

		}

		public void clickResetButton() {
			uIMapTraffic.citationEntry.citationEntryNarrativeTab.uIResetButton.click();

		}

		public void selectAtTemplate1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.citationEntry.citationEntryNarrativeTab.uITemplateComboBox,
					PoliceData.getTrafficModuleValue("Template1"));
		}

		public void verifyRichTextFromTemplate1() {
			String text = Playback.driver.findElement(By.xpath(".//body")).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getTrafficModuleValue("RichTextFromTemplate1")));
		}
	}

	public class CitationEntryWitnessTab {
		public void enterLastName() {
			uIMapTraffic.citationEntry.citationEntryWitnessTab.uILastNameEdit.sendKeys("Raja");
			uIMapTraffic.citationEntry.citationEntryWitnessTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectName() {
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void verifyAcknowledgeUpdateWitnessTab() {
			popUp.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Witness Tab. You must save or reset.");
		}

		public void clickAddButton() {
			uIMapTraffic.citationEntry.citationEntryWitnessTab.uIAddButton.click();
		}

		public void verifyNameAddedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapTraffic.citationEntry.citationEntryWitnessTab.uIWitnessTabResultGrid) == 2);
		}

		public void clickDeleteIconInGrid(int rowIndex, int columnIndex) {
			objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.citationEntry.citationEntryWitnessTab.uIWitnessTabResultGrid, rowIndex,
							columnIndex)
					.click();
			popUp.confirm.yes();
		}

		public void internalSave() {
			uIMapTraffic.citationEntry.citationEntryWitnessTab.uIInternalSaveButton.click();
			popUp.confirm.yes();
		}

		public void verifyNameDeletedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapTraffic.citationEntry.citationEntryWitnessTab.uIWitnessTabResultGrid) == 1);
		}

	}

	public class CitationEntryCommentsTab {
		public void enterSubject() {
			uIMapTraffic.citationEntry.citationEntryCommentsTab.uISubjectEdit.sendKeys("Automation");
		}

		public void clickEnterCommentsButton() {
			uIMapTraffic.citationEntry.citationEntryCommentsTab.uIEnterCommentsButton.click();
			popUp.confirm.yes();
		}

		public void verifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTraffic.citationEntry.citationEntryCommentsTab.uIDateEdit.getAttribute("value"));
		}

		public void clickDeleteIconInGrid(int rowIndex, int columnIndex) {
			objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.citationEntry.citationEntryCommentsTab.uICommentsTabResultGrid, rowIndex,
							columnIndex)
					.click();
			popUp.confirm.yes();
		}

		public void verifyDeletedCommentsNotFound() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapTraffic.citationEntry.citationEntryCommentsTab.uICommentsTabResultGrid) == 0);
		}

	}

	public class CitationEntryMapTab {
		public void verifyAtCENo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CENo"),
					uIMapTraffic.citationEntry.citationEntryMapTab.uICENoTextView.getText());
		}

		public void verifyLatLongValue(String getLatLongvalue) {
			verify.ExpectedPropertyValueIsEqual(getLatLongvalue,
					uIMapTraffic.citationEntry.citationEntryMapTab.uILatLongValueTextView.getText());
		}
	}

	public class CitationComments {
		public void enter100WordsRichText() {

			Playback.controlReadyThreadWait();
			objectIdentification.actionBuilder.MoveToElement(uIMapTraffic.citationComments.uICommentsRichTextEdit);
			objectIdentification.actionBuilder.SendKeys(
					"The Phoenix software’s advanced architecture and design help us in achieving the industry paradigm shift"
							+ " we seek to provide outstanding service to our clients and maintain 100% client satisfaction. "
							+ " Additionally, our pricing philosophy includes both Perpetual Licensing and Software as a Service (SaaS) "
							+ "options as part of our efforts to offer a higher return on investment.");
			Playback.controlReadyThreadWait();

		}

		public void clickResetButton() {
			uIMapTraffic.citationComments.uIResetButton.click();
		}

		public void saveAndCloseScreen() {
			uIMapTraffic.citationComments.uISaveCloseButton.click();
			popUp.confirm.yes();
		}

		public void save() {
			uIMapTraffic.citationComments.uISaveButton.click();
		}
	}

	public class CitationArrest {
		public void selectArmed() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTraffic.citationArrest.uIArmedCombobox);
			uIMapTraffic.citationArrest.uIArmedCombobox.sendKeys(Keys.TAB);
		}

		public void saveScren() {
			uIMapTraffic.citationArrest.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popUp.confirm.yes();
		}

		public void close() {
			uIMapTraffic.citationArrest.driver.close();
		}

		public void saveCloseScren() {
			uIMapTraffic.citationArrest.uISaveCloseButton.click();
			Playback.controlReadyThreadWait();
			popUp.confirm.yes();
		}

		public void enterDateAsCurrentDate() {
			uIMapTraffic.citationArrest.uIArrestDateEdit.click();
			uIMapTraffic.citationArrest.uIArrestDateEdit.sendKeys(randomized.getCurrentDate());
			uIMapTraffic.citationArrest.uIArrestDateEdit.sendKeys(Keys.TAB);
		}

		public void selectTypeOfArrestAsOnViewArrest() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.citationArrest.uITypeOfArrestCombobox,
					"On-View Arrest");

		}

		public void selectArmedAsUnarmed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.citationArrest.uIArmedCombobox,
					"Unarmed");

		}

		public void verifyArmedAsUnarmed() {
			String dropDwonSelectedItem = objectIdentification.manualIdentify
					.getDropDwonSelectedItem(uIMapTraffic.citationArrest.uIArmedCombobox);
			verify.ExpectedValueIsTrue(dropDwonSelectedItem.contains("Unarmed"));
		}

		public void enterArrestDateAsCurrentDate() {
			uIMapTraffic.citationArrest.uIArrestDateEdit.click();
			uIMapTraffic.citationArrest.uIArrestDateEdit.clear();
			uIMapTraffic.citationArrest.uIArrestDateEdit.click();
			uIMapTraffic.citationArrest.uIArrestDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void selectAtTypeOfArrestComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.citationArrest.uITypeOfArrestCombobox,
					PoliceData.getTrafficModuleValue("TypeOfArrest"));
		}
	}

	public class CitationSearch {
		public void enterCENumberAtCENo() {
			uIMapTraffic.citationSearch.uICENoYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CENo").substring(0, 2));
			uIMapTraffic.citationSearch.uICENoNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CENo").substring(3));
			uIMapTraffic.citationSearch.uICENoNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterCENumberCE() {
			uIMapTraffic.citationSearch.uICENoYearEdit.sendKeys("16");
			uIMapTraffic.citationSearch.uICENoNumberEdit.sendKeys("70");
			uIMapTraffic.citationSearch.uICENoNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapTraffic.citationSearch.uISearchButton.click();
		}

		public void clickAddNewButton() {
			uIMapTraffic.citationSearch.uIAddNewButton.click();
		}

		public void clickRefreshButton() {
			uIMapTraffic.citationSearch.uIRefreshButton.click();
		}

		public void clickAtCitationNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.citationSearch.uICitationSearchResultGrid,
					PoliceData.getTrafficModuleValue("CitationNo"));
		}

		public void clickAtCENo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.citationSearch.uICitationSearchResultGrid, PoliceData.getTrafficModuleValue("CENo"));
		}

		public void SelectGrid() {

			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapTraffic.citationSearch.uICitationSearchResultGrid);
		}

		public void clickClearButton() {
			uIMapTraffic.citationSearch.uIClearButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtCitationNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CitationNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Citation#", rowIndex));
		}

		public void verifyAtCENo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CENo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.citationSearch.uICitationSearchResultGrid, "CE#", rowIndex));
		}

		public void verifyName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficModuleValue("CitationLastName") + ", "
							+ PoliceData.getTrafficModuleValue("CitationFirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Name", rowIndex));
		}

		public void verifyStatus(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("On Hold", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Status", rowIndex));
		}

		@SuppressWarnings("unchecked")
		public void verifyCallColumnShows() {
			verify.ExpectedValueIsTrue(((List<String>) objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapTraffic.citationSearch.uICitationSearchResultGrid.getText()))
							.contains("Call#"));
		}

		@SuppressWarnings("unchecked")
		public void verifyCaseColumnShows() {

			verify.ExpectedValueIsTrue(((List<String>) objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapTraffic.citationSearch.uICitationSearchResultGrid.getText()))
							.contains("Case#"));
		}

		public void enterAtLastName() {
			uIMapTraffic.citationSearch.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTraffic.citationSearch.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("FirstName"));
		}

		public void verifyAtName() {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficModuleValue("LastName") + ", " + PoliceData.getTrafficModuleValue("FirstName"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Name", 0));
		}

		public void selectCETypeAsTrafficViolation() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.citationSearch.uICETypeComboBox,
					"Traffic Violation");
		}

		public void selectAtCEType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.citationSearch.uICETypeComboBox,
					PoliceData.getTrafficModuleValue("CEType"));
		}

		public void clickPrintButton() {
			uIMapTraffic.citationSearch.uIPrintIcon.click();
		}

		public void verifyAtCaseNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Case#", rowIndex));
		}

		public void verifyAtCallNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CallNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Call#", rowIndex));
		}

		public void enterAtOfficer() {
			uIMapTraffic.citationSearch.uIOfficerEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			Playback.controlReadyThreadWait();
			uIMapTraffic.citationSearch.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void verifyOfficerPF() {
			String officerPF = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.citationSearch.uICitationSearchResultGrid,
							PoliceData.getTrafficModuleValue("Officer"))
					.getText();
			verify.ExpectedPropertyValueIsEqual(officerPF, PoliceData.getTrafficModuleValue("Officer"));
			Playback.pageLoadThreadWait();
		}

		public void verifyOfficerName() {

			Actions mousehover = new Actions(Playback.driver);

			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Officer", 0));

			WebElement ele = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.citationSearch.uICitationSearchResultGrid, "Officer", 0);

			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(ele.getAttribute("title"),
					PoliceData.getTrafficModuleValue("OfficerName"));
			Playback.pageLoadThreadWait();

		}

		public void verifyOfficerColumnAfterNamesColumnAndBeforeCEColumn() {

			List<WebElement> headerElements = Playback.driver.findElements(
					By.xpath("//div[@id='grdSummons']/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/th"));
			List<String> alltext = new ArrayList<String>();

			for (WebElement headerElement : headerElements) {
				String text = headerElement.getText();
				alltext.add(text);
			}

			if (alltext.get(7).contains("Name") && (alltext.get(9).contains("CE#"))) {
				verify.ExpectedPropertyValueIsEqual(alltext.get(8), "Officer");
			}

		}

		public void verifyOfficerColumnAfterChargeColumnAndBeforeTicketBalanceColumn() {

			List<WebElement> headerElements = Playback.driver.findElements(
					By.xpath("//div[@id='grdParking']/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/th"));
			List<String> alltext = new ArrayList<String>();

			for (WebElement headerElement : headerElements) {
				String text = headerElement.getText();
				System.out.println(text);
				alltext.add(text);
			}

			if (alltext.get(7).contains("Charge") && (alltext.get(9).contains("Ticket Balance"))) {
				verify.ExpectedPropertyValueIsEqual(alltext.get(8), "Officer");
			}

		}

		public void verifyDocketNoAsCustomField() {
			String attribute = uIMapTraffic.citationSearch.uIDocketNoLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("underline"));

		}

		public void enterAtDocketNo() {
			uIMapTraffic.citationSearch.uIDocketNo.sendKeys(PoliceData.getTrafficModuleValue("DocketNo"));
			uIMapTraffic.citationSearch.uIDocketNo.sendKeys(Keys.TAB);
		}

		public void clickBackButton() {
			uIMapTraffic.citationSearch.uIBackButton.click();

		}

		public void selectAtCETypeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.citationSearch.uICitationSearchResultGrid, PoliceData.getTrafficModuleValue("CEType"));

		}
		
		public void selectCENoInGrid(String ceNo) {																		// Added by Abi
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.citationSearch.uICitationSearchResultGrid, ceNo);
		}

	}

	public class ParkingEntry {

		public Defendant1 defendant1;
		public Defendant2 defendant2;
		public ParkingEntryMainTab parkingEntryMainTab;
		public FineNoticesTab fineNoticesTab;
		public PaymentsTab paymentsTab;
		public ParkingEntryHistoryTab parkingEntryHistoryTab;
		public CommentsTab commentsTab;

		public ParkingEntry() {
			if (defendant1 == null)
				defendant1 = new Defendant1();
			if (defendant2 == null)
				defendant2 = new Defendant2();
			if (parkingEntryMainTab == null)
				parkingEntryMainTab = new ParkingEntryMainTab();
			if (fineNoticesTab == null)
				fineNoticesTab = new FineNoticesTab();
			if (paymentsTab == null)
				paymentsTab = new PaymentsTab();
			if (parkingEntryHistoryTab == null)
				parkingEntryHistoryTab = new ParkingEntryHistoryTab();
			if (commentsTab == null)
				commentsTab = new CommentsTab();

		}

		public void clickDefandant1Tab() {
			uIMapTraffic.parkingEntry.uIDefendant1Tab.click();

		}

		public void clickDefandant2Tab() {
			uIMapTraffic.parkingEntry.uIDefendant2Tab.click();

		}

		public void entercurrentValidationDate() {
			uIMapTraffic.parkingEntry.uIViolationDateEdit.click();
			uIMapTraffic.parkingEntry.uIViolationDateEdit.sendKeys(Keys.TAB);
		}

		public void enterCurrentValidationTime() {
			uIMapTraffic.parkingEntry.uIViolationTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterRandomTicketNo() {
			String TicketNo = Integer.toString(Randomized.getRandomNumber(4));
			uIMapTraffic.parkingEntry.uITicketNumberEdit.sendKeys(TicketNo);
		}

		public void savetheScreen() {
			uIMapTraffic.parkingEntry.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void saveandClosetheScreen() {
			uIMapTraffic.parkingEntry.uISaveAndCloseButton.click();
			popUp.confirm.yes();
		}

		public void switchToMainTab() {
			uIMapTraffic.parkingEntry.uIMainTab.click();
		}

		public void switchToFineNoticesTab() {
			uIMapTraffic.parkingEntry.uIFineNoticesTab.click();
		}

		public void switchToPaymentsTab() {
			uIMapTraffic.parkingEntry.uIPaymentsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmParkPayment");
		}

		public void switchToHistoryTab() {
			uIMapTraffic.parkingEntry.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmParkingNotes");
		}

		public void switchToCommentsTab() {
			uIMapTraffic.parkingEntry.uICommentsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void closeParkingEntryScreen() {
			uIMapTraffic.parkingEntry.driver.close();
		}

		public void verifyStatusAsIssued() {
			WebElement status = uIMapTraffic.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual(status.getText(), "Issued");
		}

		public void verifyStatusInYellowColor() {
			String Status = uIMapTraffic.parkingEntry.uIStatusTextView.getAttribute("style");
			verify.ExpectedValueIsTrue(Status.contains("yellow"));
		}

		public void verifyCurrentDate() {
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingEntry.uIViolationDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));
		}

		public void enterIssueDate() {
			uIMapTraffic.parkingEntry.uIIssueDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyIssueDate() {
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingEntry.uIIssueDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));

		}

		public void clickSaveButton() {
			uIMapTraffic.parkingEntry.uISaveButton.click();
		}

		public void verifyTicketRequiredAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10035) Ticket No required");
		}

		public void enterAtTicketNo() {
			Playback.gridLoadThreadWait();
			uIMapTraffic.parkingEntry.uITicketNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("TicketNo"));
		}

		public void verifyStatusAsOnHold() {
			Playback.pageLoadThreadWait();
			WebElement status = uIMapTraffic.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("On - Hold", status.getText());
		}

		public void verifyStatusAsFirstNotice() {
			WebElement status = uIMapTraffic.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("First Notice", status.getText());
		}

		public void verifyStatusAsSecondNotice() {
			WebElement status = uIMapTraffic.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("Second Notice", status.getText());
		}

		public void verifyStatusAsSuspension() {
			WebElement status = uIMapTraffic.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("Suspension", status.getText());
		}

		public void verifyStatusAsCitation() {
			WebElement status = uIMapTraffic.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("Citation", status.getText());
		}

		public void verifyStatusAsPaid() {
			WebElement status = uIMapTraffic.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("PAID", status.getText());
		}

		public void verifyStatusAsRedColor() {

			String status = uIMapTraffic.parkingEntry.uIStatusTextView.getAttribute("style");
			verify.ExpectedValueIsTrue(status.contains("red"));
		}

		public void verifyStatusAsGreenColor() {
			String status = uIMapTraffic.parkingEntry.uIStatusTextView.getAttribute("style");
			verify.ExpectedValueIsTrue(status.contains("green"));
		}

		public void verifyIconsInMenyGreyedOutExceptPrintIcon() {
			verify.ExpectedValueIsTrue(!uIMapTraffic.parkingEntry.uISaveButton.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.parkingEntry.uISaveAndCloseButton.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.parkingEntry.uISaveAndAddNewButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingEntry.uIPrintButton.isEnabled());
			verify.ExpectedValueIsTrue(!uIMapTraffic.parkingEntry.uIResetButton.isEnabled());
		}

		public void verifyDefendant1NameEmpty() {
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.clear();
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeEdit.clear();
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1LastNameEdit.clear();
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit.clear();
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.getText());
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeEdit.getText());
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1LastNameEdit.getText());
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit.getText());
		}

		public void enterAtLastName() {
			uIMapTraffic.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("FirstName"));
			uIMapTraffic.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void savePrintButton() {
			uIMapTraffic.citationEntry.uISavePrintButton.click();
			popUp.confirm.yes();
		}

		public void clickSavePrintButton() {
			uIMapTraffic.citationEntry.uISavePrintButton.click();
		}

		public void verifyHistroyCopyButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICopyButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICopyButton.isDisplayed());
		}

		public void clickPrintButton() {
			Playback.controlReadyThreadWait();
			uIMapTraffic.citationEntry.uIPrintButton.click();
		}

		public void verifyCENoFieldEmpty() {
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICENoEdit.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapTraffic.citationEntry.uICEYearEdit.getAttribute("value").contains(""));
		}

		public void verifyInitialFineAmountAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(10039) Initial fine amount required. Please check Notices tab");
		}

	public void verifyCitationFineIsNotSpecifiedAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedContainMessage("(10037)");
		}

		public void verifyAdditionSuccessfulStatusMessage() {
			String text = uIMapTraffic.parkingEntry.uIStatusbar.getText();

			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful", text);
		}
		public void verifyBottomMessage() {
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingEntry.uIStatusbar.getText().contains("1002 - Addition Successful"));
			
		}

		public void verify10041TicketNumberAlreadyExist() {
			popUp.acknowledge.okWithExpectedMessage("(10041)This Ticket Number already exists. Please enter a unique Ticket Number");
			
		}

		public String getParkingID() {
			String PakingYear = uIMapTraffic.parkingEntry.uIParkingYear.getAttribute("value");
			String ParkingNumber = uIMapTraffic.parkingEntry.uIParkingNumber.getAttribute("Value");
			
			 String ParkingID = PakingYear+"-"+ParkingNumber;
			 System.out.println(ParkingID);
			return ParkingID;
			
		}

	}
	public class Defendant1 {

		public void enterRandomNameType() {
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeEdit.sendKeys("A");
		}

		public void enterRandomNameTypeID() {
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.sendKeys("");
		}

		public void enterLastNameAtWarrantLastName() {
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1LastNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("WarrantLastName"));
		}

		public void enterFirstNameAtWarrantFirstName() {
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("WarrantFirstName"));
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectName() {
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void verifyWarrantIconButton() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.parkingEntry.defendant1.uIWarrantIconButton.getAttribute("src").contains("warrant"));
		}

		public void enterAtDefendant1LastName() {
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1LastNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Defendant1LastName"));

		}

		public void enterAtDefendant1FirstName() {
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Defendant1FirstName"));
			uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit.sendKeys(Keys.TAB);
		}

		/*
		 * public void verifyLastNameInNameEntryScreen()
		 * 
		 * { string lastName =
		 * uIMapTraffic.parkingEntry.defendant1.uIDefendant1LastNameEdit.getAttribute(
		 * "value"); uIMapTraffic.parkingEntry.defendant1.uINameInfoIcon.click(); //
		 * Names.SwitchToNameEntry(); // Names.NameEntry.VerifyLastName(lastName); //
		 * Names.NameEntry.SaveNCloseScreen();
		 * 
		 * }
		 */

		public void verifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Address"),
					uIMapTraffic.parkingEntry.defendant1.uIAddressEdit.getAttribute("value"));
		}

		/*
		 * public void selectNameByDefendant1LastFirstName() {
		 * Names.SwitchToNameSearchHelpWindow(); Playback.gridLoadThreadWait();
		 * objectIdentification.manualIdentify.SelectGridRowCheckBoxByCellInnerText(
		 * uIMapNames.NameSearchHelpWindow.uIResultTable,
		 * PoliceData.getTrafficModuleValue("Defendant1LastName") + ", " +
		 * PoliceData.getTrafficModuleValue("Defendant1FirstName"));
		 * uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
		 * Playback.ThreadWait(); Playback.waitForPageLoad();
		 * 
		 * }
		 */
		public void clickNameInfoIcon() {
			uIMapTraffic.parkingEntry.defendant1.uINameInfoIcon.click();

		}

		public void verifyAtDefendant1NameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant1").substring(0, 1),
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant1").substring(2),
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.getAttribute("value"));
		}

		public void verifyDefendant1AtDefendant1LastNameFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant1LastName"),
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1LastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant1FirstName"),
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit.getAttribute("value"));
		}

		public void verifyDefendant1AtDefendant2LastNameFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant2LastName"),
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1LastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant2FirstName"),
					uIMapTraffic.parkingEntry.defendant1.uIDefendant1FirstNameEdit.getAttribute("value"));
		}
	}

	public class Defendant2 {

		public void enterAtDefendant2LastName() {
			uIMapTraffic.parkingEntry.defendant2.uIDefendant2LastNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Defendant2LastName"));

		}

		public void enterAtDefendant2FirstName() {
			uIMapTraffic.parkingEntry.defendant2.uIDefendant2FirstNameEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Defendant2FirstName"));
			uIMapTraffic.parkingEntry.defendant2.uIDefendant2FirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectNameByDefendant2LastFirstName() {
			/*
			 * Names.SwitchToNameSearchHelpWindow(); Playback.gridLoadThreadWait();
			 * objectIdentification.manualIdentify.SelectGridRowCheckBoxByCellInnerText(
			 * PnxBaseTest.UIMapNames.NameSearchHelpWindow.uIResultTable,
			 * PoliceData.getTrafficModuleValue("Defendant2LastName").ToString() + ", " +
			 * PoliceData.getTrafficModuleValue("Defendant2FirstName"));
			 * PnxBaseTest.UIMapNames.NameSearchHelpWindow.uISelectNameButton.click();
			 * Playback.ThreadWait(); Playback.waitForPageLoad();
			 */

		}

		public void verifyAtDefendant2NameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant2").substring(0, 1),
					uIMapTraffic.parkingEntry.defendant2.uIDefendant2NameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant2").substring(2),
					uIMapTraffic.parkingEntry.defendant2.uIDefendant2NameTypeIDEdit.getAttribute("value"));
		}

		public void verifyDefendant2AtDefendant2LastNameFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant2LastName"),
					uIMapTraffic.parkingEntry.defendant2.uIDefendant2LastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Defendant2FirstName"),
					uIMapTraffic.parkingEntry.defendant2.uIDefendant2FirstNameEdit.getAttribute("value"));
		}

		public void verifyDefendant2Empty() {
			verify.ExpectedValueIsTrue(
					uIMapTraffic.parkingEntry.defendant2.uIDefendant2LastNameEdit.getAttribute("value") == "");
			verify.ExpectedValueIsTrue(
					uIMapTraffic.parkingEntry.defendant2.uIDefendant2FirstNameEdit.getAttribute("value") == "");
		}
	}

	public class ParkingEntryMainTab {

		public void enterRandomCourtDate() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uICourtDateEdit.sendKeys("12/02/2015");
		}

		public void enterRansomCourtTime() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uICourtTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterOfficerID() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOfficerEdit.sendKeys("PRMS");
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void selectRandomOfficerID() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOfficerLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterRandomPlateNumber() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit.sendKeys("T1");
		}

		public void selectRandomVehicle() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateNumberLookupButton.click();
			// vehicle.VehicleBoatSearchHelpWindow.selectVehicle();
		}

		public void enterRandomViolation() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIViolationEdit.sendKeys("100.03(22)(b)");
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIViolationEdit.sendKeys(Keys.TAB);
		}

		public void enterRandomLocation() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uILocationEdit.sendKeys("ba");
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uILocationCheckBox.sendKeys(Keys.TAB);
			// Geo.CommonNameHelp.SelectCommonName();
		}

		public void verifyOfficerRequiredAckMsg() {

			popUp.acknowledge.okWithExpectedMessage("(10008) Officer is required");
		}

		public void enterAtOfficer() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOfficerEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void verifyPlateOrHullRequiredAckMsg() {

			popUp.acknowledge.okWithExpectedMessage("(9006) Plate No or Hull No is required");
		}

		public void enterAtPlateNumber() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PlateNumber"));

		}

		public void enterAtPlateNumberInPlatestateField() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PlateNumber"));
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtPlateState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox, PoliceData.getTrafficModuleValue("PlateState"));
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox.sendKeys(Keys.TAB);
		}


		public void verifyChargeRequiredAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(6515) Charge is Required");
		}

		public void enterAtViolation() {

			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIViolationEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Violation"));

		}

		public void verifyLocationRequiredAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10007) Location is required");

		}

		public void enterAtLocation() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uILocationEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Location"));
					uIMapTraffic.parkingEntry.parkingEntryMainTab.uILocationEdit.sendKeys(Keys.TAB);

		}

		public void clickVehicleInfoIcon() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateInfoIcon.click();

		}

		public void verifyAtYear() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Year"),
					uIMapTraffic.parkingEntry.parkingEntryMainTab.uIYearEdit.getAttribute("value"));
		}

		public void verifyAtMake() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Make"),
					uIMapTraffic.parkingEntry.parkingEntryMainTab.uIMakeEdit.getAttribute("value"));
		}

		public void verifyAtModel() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Model"),
					uIMapTraffic.parkingEntry.parkingEntryMainTab.uIModelEdit.getAttribute("value"));
		}

		public void verifyAtStyle() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Style"),
					uIMapTraffic.parkingEntry.parkingEntryMainTab.uIStyleEdit.getAttribute("value"));
		}

		public void verifyAtCharge() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Charge"),
					uIMapTraffic.parkingEntry.parkingEntryMainTab.uIViolationEdit.getAttribute("value"));

		}

		public void clickOnHoldCheckBox() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOnHoldCheckBox.click();

		}

		public void clickUnCheckOnHoldCheckBox() {
			WebElement OnHold = uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOnHoldCheckBox;
			boolean result = OnHold.isSelected();
			if (result == false) {
				OnHold.click();
			}

		}

		public void verifyExpiresFieldEnable() {
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingEntry.parkingEntryMainTab.uIExpiresDateEdit.isEnabled());

		}

		public void verifyExpirationDateRequiredAckMsg() {

			popUp.acknowledge.okWithExpectedMessage("(10045) Expiration Date is required to hold the ticket");
		}

		public void enterExpires1DayFutureFromCurrentDate() {

			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIExpiresDateEdit.sendKeys(Randomized.getFutureDate(1));
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIExpiresDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickOnHoldInfoIcon() {

			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIOnHoldInfoIcon.click();
		}

		public void EnterAtPlate1() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Plate1"));
			Playback.controlReadyThreadWait();
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void TabOutStateEdit() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

public void enterAtStateEdit() {
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox.click();
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("State"));
			uIMapTraffic.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

	}

	public class FineNoticesTab {

		public void enterInitialAmount() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uIInitialFineEdit.click();
			uIMapTraffic.parkingEntry.fineNoticesTab.uIInitialFineEdit.sendKeys(Randomized.randomNumberString(3));
		}

		public void CheckTicketVoid() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uITicketVoidCheckBox.click();
		}

		public void enterReason() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uITicketVoidedEdit.sendKeys("");
		}

		public void selectRandomAuthorizedBy() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uIAuthorisedByLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyAtDefaultInitialFine() {

			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.parkingEntry.fineNoticesTab.uIInitialFineEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("InitialFine"));
		}

		public void verifyAtDefaultFirstAdjustment() {

			WebElement FirstAdjust = uIMapTraffic.parkingEntry.fineNoticesTab.uIFirstAdjustmentText;
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("1stAdjustment"),
					FirstAdjust.getText());
		}

		public void verifyAtDefaultSecondAdjustment() {

			WebElement SecondAdjust = uIMapTraffic.parkingEntry.fineNoticesTab.uISecondAdjustmentText;
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("2ndAdjustment"),
					SecondAdjust.getText());
		}

		public void verifyAtDefaultThirdAdjustment() {

			WebElement ThirdAdjust = uIMapTraffic.parkingEntry.fineNoticesTab.uIThirdAdjustmentText;
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("3rdAdjustment"),
					ThirdAdjust.getText());
		}

		public void enterAtFirstAdjustmentValue() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uIFirstAdjustmentEdit
					.sendKeys(PoliceData.getTrafficModuleValue("1stAdjustmentValue"));

		}

		public void enterFirstNoticeAsCurrentDate() {

			uIMapTraffic.parkingEntry.fineNoticesTab.uIFirstNoticeDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void verifyGreyedOutFirstAdjustmentField() {

			verify.ExpectedValueIsTrue(!uIMapTraffic.parkingEntry.fineNoticesTab.uIFirstAdjustmentEdit.isEnabled());
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.parkingEntry.fineNoticesTab.uIFirstAdjustmentEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("1stAdjustmentValue"));

		}

		public void verifyFirstTotalAmtDueValue() {

			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment);
			String TotalAmount = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");
			System.out.println(TotalAmount);
			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(TotalAmount, 4, "."),
					uIMapTraffic.parkingEntry.fineNoticesTab.uITotalAmountDueEdit.getAttribute("value"));
		}

		public void verifyFirstCurrentBalanceValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment);
			String CurrentBalance = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(CurrentBalance, 4, "."),
					uIMapTraffic.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"));
		}

		public void enterAtSecondAdjustmentValue() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uISecondAdjustmentEdit
					.sendKeys(PoliceData.getTrafficModuleValue("2ndAdjustmentValue"));

		}

		public void enterSecondNoticeAsCurrentDate() {

			uIMapTraffic.parkingEntry.fineNoticesTab.uISecondNoticeDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void verifyGreyedOutSecondAdjustmentField() {

			verify.ExpectedValueIsTrue(!uIMapTraffic.parkingEntry.fineNoticesTab.uISecondAdjustmentEdit.isEnabled());
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.parkingEntry.fineNoticesTab.uISecondAdjustmentEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("2ndAdjustmentValue"));

		}

		public void verifySecondTotalAmtDueValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment);
			String TotalAmount = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(TotalAmount, 4, "."),
					uIMapTraffic.parkingEntry.fineNoticesTab.uITotalAmountDueEdit.getAttribute("value"));

		}

		public void verifySecondCurrentBalanceValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment);
			String CurrentBalance = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(CurrentBalance, 4, "."),
					uIMapTraffic.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"));
		}

		public void enterAtThirdAdjustmentValue() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uIThirdAdjustmentEdit
					.sendKeys(PoliceData.getTrafficModuleValue("3rdAdjustmentValue"));

		}

		public void enterSuspensionNoticeAsCurrentDate() {

			uIMapTraffic.parkingEntry.fineNoticesTab.uISuspensionNoticeDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void verifyGreyedOutThirdAdjustmentField() {

			verify.ExpectedValueIsTrue(!uIMapTraffic.parkingEntry.fineNoticesTab.uIThirdAdjustmentEdit.isEnabled());
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.parkingEntry.fineNoticesTab.uIThirdAdjustmentEdit.getAttribute("value"),
					PoliceData.getTrafficModuleValue("3rdAdjustmentValue"));

		}

		public void verifyThirdTotalAmtDueValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			String ThirdAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("3rdAdjustmentValue"), 0, 1);
			String ThirdAdjustment = Randomized.removeCharAt(ThirdAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment) + Integer.parseInt(ThirdAdjustment);
			String TotalAmount = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(TotalAmount, 4, "."),
					uIMapTraffic.parkingEntry.fineNoticesTab.uITotalAmountDueEdit.getAttribute("value"));

		}

		public void verifyThirdCurrentBalanceValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			String ThirdAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficModuleValue("3rdAdjustmentValue"), 0, 1);
			String ThirdAdjustment = Randomized.removeCharAt(ThirdAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment) + Integer.parseInt(ThirdAdjustment);
			String CurrentBalance = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(CurrentBalance, 4, "."),
					uIMapTraffic.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"));

		}

		public void clickCitationIssuedCheckBox() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uICitationIssuedCheckBox.click();

		}

		public void enterAtCitationNo() {

			uIMapTraffic.parkingEntry.fineNoticesTab.uICitationIssuedEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CitationNo"));
			uIMapTraffic.parkingEntry.fineNoticesTab.uICitationIssuedEdit.sendKeys(Keys.TAB);
		}

		public void clickCitationInfoIcon() {
			uIMapTraffic.parkingEntry.fineNoticesTab.uICitationInfoIcon.click();
		}

		public void verifyCurrentBalanceValueAsZero() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTraffic.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"), "$0.00");

		}

		public void verifyCitationIssuedFieldGreyedOut() {

			verify.ExpectedValueIsTrue(uIMapTraffic.parkingEntry.fineNoticesTab.uICitationIssuedEdit
					.getAttribute("readonly").contains("true"));
		}

		public void verifyTicketVoidedFieldGreyedOut() {
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingEntry.fineNoticesTab.uITicketVoidedEdit.getAttribute("class")
					.contains("textboxInactive"));

		}

	}

	public class PaymentsTab {

		public void clickAddotherPaymentsButton() {
			uIMapTraffic.parkingEntry.paymentsTab.uIAddOtherPaymentButton.click();
		}

		public void verifyTypeAsCreditAdjustment(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Credit Adjustment",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.parkingEntry.paymentsTab.uIPaymentsTabGridTable, "Type", rowIndex));
		}
	}

	public class ParkingOtherPayment {

		public void enterPayMents() {
			uIMapTraffic.parkingOtherPayment.uIPaymentEdit.click();
		}

		public void selectPaymentmethosAsCash() {
			uIMapTraffic.parkingOtherPayment.uIPaymentMethodComboBox.sendKeys("1 - Cash");
		}

		public void enterRandomRemarks() {
			uIMapTraffic.parkingOtherPayment.uIRemarksEdit.sendKeys("Paid Cash Amount");
		}

		public void savetheScreen() {
			uIMapTraffic.parkingOtherPayment.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void saveandClosetheScreen() {
			uIMapTraffic.parkingOtherPayment.uISaveAndCloseButton.click();
			popUp.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void enterAtPayment() {
			uIMapTraffic.parkingOtherPayment.uIPaymentEdit.sendKeys(PoliceData.getTrafficModuleValue("Payment"));
		}

		public void selectAtPaymentMethod() {
			uIMapTraffic.parkingOtherPayment.uIPaymentMethodComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("PaymentMethod"));

		}

		public void tabDate() {
			uIMapTraffic.parkingOtherPayment.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void selectPaymentmethodAsCreditAdjustment() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.parkingOtherPayment.uIPaymentMethodComboBox, "18 - Credit Adjustment");
		}

		public void enterRemarksAsCreditAdjustmentAmount() {
			uIMapTraffic.parkingOtherPayment.uIRemarksEdit.sendKeys("Credit Adjustment Amount Paid");
		}
	}

	public class ParkingEntryHistoryTab {

		public void verifyTicketOnHoldReason() {
			String reason = uIMapTraffic.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Ticket On-Hold Reason"));

		}

		public void verifyPaymentReceipt() {
			String reason = uIMapTraffic.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Payment [Receipt#"));

		}

		public void verifyCreditAdjustment() {
			String reason = uIMapTraffic.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Credit Adjustment"));

		}

		public void verifyAtPayment() {
			String reason = uIMapTraffic.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains(PoliceData.getTrafficModuleValue("Payment")));
		}

		public void verifyRemarksCreditAdjustmentAmount() {
			String reason = uIMapTraffic.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Credit Adjustment Amount Paid"));

		}

	}

	public class CommentsTab

	{
		public void enterSubject(String subject) {

			uIMapTraffic.parkingEntry.commentsTab.uISubjectEdit.sendKeys(Randomized.randomString(10));
			Playback.waitForPageLoad();
			subject = uIMapTraffic.parkingEntry.commentsTab.uISubjectEdit.getAttribute("value");
		}

		public void clickEnterComments() {
			uIMapTraffic.parkingEntry.commentsTab.uIEnterCommentsButton.click();

		}

		public void verifySubjectInGrid(String subject, int rowIndex) {

			WebElement commentsTable = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingEntry.commentsTab.uICommentsTable, "Subject", rowIndex);
			verify.ExpectedPropertyValueIsEqual(subject, commentsTable.getText());
		}

		public void enterAtSubject() {
			uIMapTraffic.parkingEntry.commentsTab.uISubjectEdit.sendKeys(PoliceData.getTrafficModuleValue("Subject"));
		}

		public void verifyAtSubjectInGrid() {
			WebElement commentsTable = objectIdentification.manualIdentify.getGridCell(
					uIMapTraffic.parkingEntry.commentsTab.uICommentsTable, PoliceData.getTrafficModuleValue("Subject"));
			verify.ExpectedValueIsTrue(commentsTable.getText().contains(PoliceData.getTrafficModuleValue("Subject")));
		}
	}

	public class ParkingSearch {

		public void clickAddNewButton() {

			uIMapTraffic.parkingSearch.uIAddNewButton.click();

		}

		public void selectAtDateType() {
			uIMapTraffic.parkingSearch.uIDataTypeComboBox.sendKeys(PoliceData.getTrafficModuleValue("DateType"));
			uIMapTraffic.parkingSearch.uIDataTypeComboBox.sendKeys(Keys.TAB);

		}

		public void enterDataTypeFromAsCurrentDate() {
			uIMapTraffic.parkingSearch.uIDataTypeFromDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void enterDataTypeToAsCurrentDate() {
			uIMapTraffic.parkingSearch.uIDataTypeToDateEdit.sendKeys(Randomized.getCurrentDate());

		}

		public void selectAtAdjustmentLevel() {
			uIMapTraffic.parkingSearch.uIAdjustmentLevelComboBox
					.sendKeys(PoliceData.getTrafficModuleValue("AdjustmentLevel"));

		}

		public void enterAtTicketNo() {
			Playback.gridLoadThreadWait();
			uIMapTraffic.parkingSearch.uITicketEdit.sendKeys(PoliceData.getTrafficModuleValue("TicketNo"));
			uIMapTraffic.parkingSearch.uITicketEdit.sendKeys(Keys.TAB);

		}

		public void clickSearchButton() {
			uIMapTraffic.parkingSearch.uISearchButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyAtTicketNo() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("TicketNo"));
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficModuleValue("TicketNo")));
		}

		public void verifyAtStatusByAtTicketNo() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("TicketNo"));
			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, uIRow, "Status");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Status"), Status.getText());

		}

		public void verifyStatusAsPaidByAtTicketNo() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("TicketNo"));
			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, uIRow, "Status");
			verify.ExpectedPropertyValueIsEqual("PAID", Status.getText());
		}

		public void verifyDefendantEmptyByAtTicketNo() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("TicketNo"));

			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, uIRow, "Defendant");
			verify.ExpectedPropertyValueIsEqual("", Status.getText());

		}

		public void verifyAtStatus() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("Status"));
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficModuleValue("Status")));
		}

		public void verifyAtDefedant2() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("Defedant2"));
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficModuleValue("Defedant2")));

		}

		public void verifyDefendantNameByAtTicketNo() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("TicketNo"));

			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, uIRow, "Defendant");
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficModuleValue("Name")));

		}

		public void selectRowByAtTicketNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("TicketNo"));

		}

		public void selectRowByAtDefendant2() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("Defedant2"));
		}

		public void selectRowByAtDefendant() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("Defendant"));

		}

		public void verifyAtChargeByAtTicketNo() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("TicketNo"));

			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, uIRow, "Charge");
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficModuleValue("Charge")));
		}

		public void enterAtOfficer() {
			uIMapTraffic.parkingSearch.uIOfficerEdit.sendKeys(PoliceData.getTrafficModuleValue("Officer"));
			uIMapTraffic.parkingSearch.uIOfficerEdit.sendKeys(Keys.TAB);

		}

		public void enterAtViolation() {
			uIMapTraffic.parkingSearch.uIViolationCodeEdit.sendKeys(PoliceData.getTrafficModuleValue("Violation"));
		}

		public void enterAtDefendant2LastName() {
			uIMapTraffic.parkingSearch.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("Defedant2Last"));
		}

		public void enterAtDefendant2FirstName() {
			uIMapTraffic.parkingSearch.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("Defedant2First"));
			uIMapTraffic.parkingSearch.uIFirstNameEdit.sendKeys(Keys.TAB);
			uIMapTraffic.parkingSearch.uIMiddleNameEdit.sendKeys(Keys.TAB);

		}

		/*
		 * public void selectNameByDefendant2LastFirstName() {
		 * Names.SwitchToNameSearchHelpWindow();
		 * objectIdentification.manualIdentify.SelectGridRowCheckBoxByCellInnerText(
		 * PnxBaseTest.UIMapNames.NameSearchHelpWindow.uIResultTable,
		 * PoliceData.getTrafficModuleValue("Name"));
		 * PnxBaseTest.UIMapNames.NameSearchHelpWindow.uISelectNameButton.click();
		 * Playback.ThreadWait(); Playback.waitForPageLoad();
		 * 
		 * }
		 */

		public void enterAtPlateNumber() {
			uIMapTraffic.parkingSearch.uIPlateNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("PlateNumber"));

		}

		public void selectAtPlateState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.parkingSearch.uIPlateStateComboBox,
					PoliceData.getTrafficModuleValue("PlateState"));
		}

		public void verifyAtDefendant() {
			WebElement uICell = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficModuleValue("Defendant"));
			verify.ExpectedValueIsTrue(uICell.getText().contains(PoliceData.getTrafficModuleValue("Defendant")));
		}

		public void enterAtParkingNoFromField() {
			uIMapTraffic.parkingSearch.uIParkingNumberFromYear
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNo").substring(0, 2));
			uIMapTraffic.parkingSearch.uIParkingNumberFromNumber
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNo").substring(3));
		}

		public void enterAtParkingNoToField() {
			uIMapTraffic.parkingSearch.uIParkingNumberToYear
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNo").substring(0, 2));
			uIMapTraffic.parkingSearch.uIParkingNumberToNumber
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNO").substring(3));
		}

		public void verifyAtParkingNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ParkingNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable,
							PoliceData.getTrafficModuleValue("ParkingNo")).getText());
		}

		public void mouseHoverOnDefendant(int rowIndex) {
			WebElement row = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, "Defendant", rowIndex);
			objectIdentification.actionBuilder.MoveToElement(row);
			Playback.threadWait();
		}

		public void clickRefreshButton() {
			uIMapTraffic.parkingSearch.uIRefreshButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyAtDefendant1LastNameFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficModuleValue("Defendant1LastName") + ", "
							+ PoliceData.getTrafficModuleValue("Defendant1FirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.parkingSearch.uIParkingSearchTable, "Defendant", rowIndex));
		}

		public void verifyAtDefendant2LastNameFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficModuleValue("Defendant2LastName") + ", "
							+ PoliceData.getTrafficModuleValue("Defendant2FirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTraffic.parkingSearch.uIParkingSearchTable, "Defendant", rowIndex));

		}

		public void enterAtParkingFromField() {
			uIMapTraffic.parkingSearch.uIParkingNumberFromYear
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNo").substring(0, 2));
			uIMapTraffic.parkingSearch.uIParkingNumberFromNumber
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNo").substring(3));
		}

		public void enterAtParkingToField() {
			uIMapTraffic.parkingSearch.uIParkingNumberToYear
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNo").substring(0, 2));
			uIMapTraffic.parkingSearch.uIParkingNumberToNumber
					.sendKeys(PoliceData.getTrafficModuleValue("ParkingNo").substring(3));
		}

		public void verifyAtParking() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Parking"),
					objectIdentification.manualIdentify.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable,
							PoliceData.getTrafficModuleValue("Parking")).getText());
		}

		public void MouseHoverOnDefendant() {
			WebElement row = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, "Defendant", 0);
			objectIdentification.actionBuilder.MoveToElement(row);

			Playback.threadWait();
		}

		public void verifyOfficerName() {

			Actions mousehover = new Actions(Playback.driver);

			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, "Officer", 0));

			WebElement ele = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingSearch.uIParkingSearchTable, "Officer", 0);

			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(ele.getAttribute("title"),
					PoliceData.getTrafficModuleValue("OfficerName"));
			Playback.pageLoadThreadWait();

		}

		public void verifyOfficerColumnAfterChargeColumnAndBeforeTicketBalanceColumn() {

			List<WebElement> headerElements = Playback.driver.findElements(
					By.xpath("//div[@id='grdParking']/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/th"));
			List<String> alltext = new ArrayList<String>();

			for (WebElement headerElement : headerElements) {
				String text = headerElement.getText();
				System.out.println(text);
				alltext.add(text);
			}

			if (alltext.get(7).contains("Charge") && (alltext.get(9).contains("Ticket Balance"))) {
				verify.ExpectedPropertyValueIsEqual(alltext.get(8), "Officer");
			}

		}

	}

	public class TicketHoldReason {

		public void enterReason() {

			uIMapTraffic.ticketHoldReason.uIReasonEdit.sendKeys(Randomized.randomAlphanumeric(10));
		}

		public void save() {
			uIMapTraffic.ticketHoldReason.uISaveButton.click();
			popUp.confirm.yes();

		}

		public void close() {
			uIMapTraffic.ticketHoldReason.driver.close();

		}

	}

	public class NamesComments {

		public void enterCommentsAsGroupOfString() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.nameComments.uINameCommentsEdit).click();
			actions.sendKeys(Randomized.randomString(150)).build().perform();
			Playback.controlReadyThreadWait();

		}

		public void save() {
			uIMapHome.nameComments.uISaveButton.click();
			popUp.confirm.yes();

		}

		public void saveNClose() {
			uIMapHome.nameComments.uISaveNCloseButton.click();
			popUp.confirm.yes();

		}

	}

	public class ParkingPermits {

		public void enterAtPlateNo() {

			uIMapTraffic.parkingPermits.uIPlateNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("PlateNo"));
			uIMapTraffic.parkingPermits.uIPlateNumberEdit.sendKeys(Keys.TAB);
			uIMapTraffic.parkingPermits.uIPlateStateComboBox.sendKeys(Keys.TAB);
//			String plateInf = PoliceData.getTrafficModuleValue("PlateNo");
//			String[] plateInfo = plateInf.split("-");
//			uIMapTraffic.parkingPermits.uIPlateNumberEdit.sendKeys(plateInfo[0]);
//			uIMapTraffic.parkingPermits.uIPlateStateComboBox.sendKeys(plateInfo[1]);
//			uIMapTraffic.parkingPermits.uIPlateStateComboBox.sendKeys(Keys.TAB);
//			uIMapTraffic.parkingPermits.uIPlateLookupIcon.click();
		}

		public void verifyActionDateIsNotMandatory() {

			String Black = "rgba(0, 0, 0, 1)";
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.parkingPermits.uIActionDateLbl.getCssValue("color"),
					Black);
		}

		public void verifyActionDateIsMandatory() {

			String red = "rgba(128, 0, 0, 1)";
			verify.ExpectedPropertyValueIsEqual(uIMapTraffic.parkingPermits.uIActionDateLbl.getCssValue("color"), red);
		}

		public void clickAddButton() {
			uIMapTraffic.parkingPermits.uIAddButton.click();

		}

		public void selectNameFromHelpWindow() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void verifyAtAddress() {
			String address = uIMapTraffic.parkingPermits.uIAddressEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Address"), address);

		}

		public void enterAtState() {
			uIMapTraffic.parkingPermits.uIPlateStateComboBox.sendKeys(PoliceData.getTrafficModuleValue("State"));
			uIMapTraffic.parkingPermits.uIPlateStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectActionAsPermit() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.parkingPermits.uIActionComboBox,
					"Permit");
			Playback.waitForControlReady();
		}

		public void selectActionAsExtension() {
			uIMapTraffic.parkingPermits.uIActionComboBox.sendKeys("Extension");
			uIMapTraffic.parkingPermits.uIActionComboBox.sendKeys(Keys.TAB);
		}

		public void selectActionAsAdjustPermit() {
			uIMapTraffic.parkingPermits.uIActionComboBox.sendKeys("Adjust Permit");
			uIMapTraffic.parkingPermits.uIActionComboBox.sendKeys(Keys.TAB);
		}

		public void selectActionAsCancelDenial() {
			Playback.pageLoadThreadWait();
			uIMapTraffic.parkingPermits.uIActionComboBox.sendKeys("Cancel Denial");
		}

		public void tabOutNoOfRequested() {
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.sendKeys(Keys.TAB);
		}

		public void selectActionAsDenail() {
			uIMapTraffic.parkingPermits.uIActionComboBox.sendKeys("Denial");
		}

		public void enterActionDateAsPreviousMonthtFirstDay() {
			uIMapTraffic.parkingPermits.uIActionDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(1) + "01" + Randomized.getCurrentYear());

		}

		public void enterActionDateAsPreviousMonthtThirdDay() {
			uIMapTraffic.parkingPermits.uIActionDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(1) + "03" + Randomized.getCurrentYear());
			uIMapTraffic.parkingPermits.uIActionDateEdit.sendKeys(Keys.TAB);
		}

		public void tabOutActionDate() {
			Playback.waitForControlReady();
			uIMapTraffic.parkingPermits.uIActionDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void tabOutDenialDate() {
			uIMapTraffic.parkingPermits.uIDenialDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyCurrentDateAutoPopulatesInActionDate() {

			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTraffic.parkingPermits.uIActionDateEdit.getAttribute("value"));

		}

		public void enterAtPermitLocation() {
			uIMapTraffic.parkingPermits.uIPermitLocationEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PermitLocation"));
			uIMapTraffic.parkingPermits.uIPermitLocationEdit.sendKeys(Keys.TAB);
		}

		public void selectReason() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTraffic.parkingPermits.uIReasonComboBox);
		}

		public void getExpireDate(String expireDate) {
			expireDate = uIMapTraffic.parkingPermits.uIExpireDateEdit.getAttribute("value");
		}

		public void getExpireDateInGrid(String expireDate, int rowIndex) {
			expireDate = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Expire Date", rowIndex);
		}

		public void clearToFields() {

			uIMapTraffic.parkingPermits.uIToDateEdit.click();
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.CONTROL + "a" + Keys.CONTROL);
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.DELETE);
		}

		public void enterToAsExpireDate(String expireDate) {
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(expireDate);
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void enterValidExtendFromAsPreviousMonthFirstDay() {

			uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(1, "MM/01/yyyy"));
		}

		public void enterValidExtendFromAsPreviousMonthThirdDay() {
			uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(1, "MM/03/yyyy"));
			uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.sendKeys(Keys.TAB);
		}

		public void enterNotes() {
			uIMapTraffic.parkingPermits.uINotesEdit.sendKeys(Randomized.randomAlphanumericSpecialCharsString(10));
		}

		public void tabOutValidExtendDate() {
			uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.sendKeys(Keys.TAB);
		}

		public void tabOutToDate() {
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void enterToAsSecondDayFromValidExtendFrom() {
			String Validate = uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.getAttribute("value");

			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getFutureDate(Validate, 2));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);

		}

		public void enterToAsThirdDayOfValidExtendFrom() {
			Playback.waitForControlReady();
			String Validate = uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.getAttribute("value");
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getFutureDate(Validate, 3));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);

		}

		public void enterToAsFourthDayOfValidExtendFrom() {
			String Validate = uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.getAttribute("value");
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getFutureDate(Validate, 4));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);

		}

		public void enterToAsFifthDayOfValidExtendFrom() {
			String Validate = uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.getAttribute("value");
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getFutureDate(Validate, 5));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);

		}

		public void enterToAsSixthDayOfValidExtendFrom() {
			String Validate = uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.getAttribute("value");
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getFutureDate(Validate, 6));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);

		}

		public void enterToDateAsPreviousMonthSixthDay() {
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getPreviousDateByMonth(1, "MM/06/yyyy"));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void enterToDateAsPreviousMonthSecondDay() {
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getPreviousDateByMonth(1, "MM/02/yyyy"));
		}

		public void enterToDateAsNextDayFromcurrentDate() {
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getFutureDate(1));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void enterToDateAsTwoDaysBeforeFromExpireDate(String expireDate) {
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Randomized.getPreviousDate(2, expireDate));
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyExpireDateNextDayofToDate() {
			String toDate = uIMapTraffic.parkingPermits.uIToDateEdit.getAttribute("value");
			String expireDate = uIMapTraffic.parkingPermits.uIExpireDateEdit.getAttribute("value");
			String nextDate = Randomized.getFutureDate(toDate, 1);
			verify.ExpectedPropertyValueIsEqual(nextDate, expireDate);

		}

		public void verfiyExpireDateAsTomorrowDate() {
			String expireDate = uIMapTraffic.parkingPermits.uIExpireDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(1), expireDate);

		}

		public void verfiyExpireDateAsFuturDateNoOfdays(int days) {
			String expireDate = uIMapTraffic.parkingPermits.uIExpireDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(days), expireDate);

		}

		public void selectAdultName() {
			uIMapTraffic.parkingPermits.uILastNameEdit.sendKeys("mar");
			uIMapTraffic.parkingPermits.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapTraffic.parkingPermits.uIFirstNameEdit.sendKeys(Keys.TAB);
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void save() {
			uIMapTraffic.parkingPermits.uISaveButton.click();
			popUp.confirm.yes();
			Playback.waitForPageLoad();
		}

		public void clickOkWithUpdateSuccessfulMessage() {
			popUp.acknowledge.ok();
		}

		public void verify1003UpdateSuccessfulAckMsg() {
			popUp.acknowledge.okWithExpectedMessage(" 1003 - Update Successful");
			Playback.waitForPageLoad();
		}

		public void verify1002AdditionalSuccessfulAckMsg() {
			popUp.acknowledge.okWithExpectedMessage(" 1002 - Addition Successful");
			Playback.waitForPageLoad();
		}

		public void verifyAtPlateNo() {
			String plateInf = PoliceData.getTrafficModuleValue("PlateNo");
			String[] plateInfo = plateInf.split("-");
			verify.ExpectedPropertyValueIsEqual(plateInfo[0],
					uIMapTraffic.parkingPermits.uIPlateNumberEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(plateInfo[1], objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTraffic.parkingPermits.uIPlateStateComboBox));
		}

		public void verifyAtState() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("State"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapTraffic.parkingPermits.uIPlateStateComboBox));
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Location"),
					uIMapTraffic.parkingPermits.uIPermitLocationEdit.getAttribute("value"));
		}

		public void verifyAtLastName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("LastName"),
					uIMapTraffic.parkingPermits.uILastNameEdit.getAttribute("value"));
		}

		public void verifyAtFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("FirstName"),
					uIMapTraffic.parkingPermits.uIFirstNameEdit.getAttribute("value"));
		}

		public void verifyMiddleFieldAs3() {
			verify.ExpectedPropertyValueIsEqual("3",
					uIMapTraffic.parkingPermits.uIpermitMidddleFieldCountEdit.getAttribute("value"));
		}

		public void verifyMiddleFieldAs7() {
			verify.ExpectedPropertyValueIsEqual("7",
					uIMapTraffic.parkingPermits.uIpermitMidddleFieldCountEdit.getAttribute("value"));
		}

		public void verifyMiddleFieldAs1() {
			verify.ExpectedPropertyValueIsEqual("1",
					uIMapTraffic.parkingPermits.uIpermitMidddleFieldCountEdit.getAttribute("value"));
		}

		public void verifyMiddleFieldAs8() {
			verify.ExpectedPropertyValueIsEqual("8",
					uIMapTraffic.parkingPermits.uIpermitMidddleFieldCountEdit.getAttribute("value"));
		}

		public void verifyMiddleFieldAs6() {
			verify.ExpectedPropertyValueIsEqual("6",
					uIMapTraffic.parkingPermits.uIpermitMidddleFieldCountEdit.getAttribute("value"));
		}

		public void verifyMiddleFieldAs10() {
			verify.ExpectedPropertyValueIsEqual("10",
					uIMapTraffic.parkingPermits.uIpermitMidddleFieldCountEdit.getAttribute("value"));
		}

		public void verifyStatusAsExpired() {
			verify.ExpectedPropertyValueIsEqual("Expired",
					uIMapTraffic.parkingPermits.uIStatusEdit.getAttribute("value"));
		}

		public void verifyStatusAsDenial() {
			verify.ExpectedPropertyValueIsEqual("Denial",
					uIMapTraffic.parkingPermits.uIStatusEdit.getAttribute("value"));
		}

		public void verifyStatusAsValid() {
			verify.ExpectedPropertyValueIsEqual("Valid",
					uIMapTraffic.parkingPermits.uIStatusEdit.getAttribute("value"));
		}

		public void verifyActionAsPermitInFirstGridRow(int rowIndex) {
			WebElement action = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Action", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Permit", action.getText());
		}

		public void verifyActionAsExtensionInFirstGridRow(int rowIndex) {
			WebElement action = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Action", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Extension", action.getText());
		}

		public void verifyActionAsAdjustPermitInFirstGridRow(int rowIndex) {
			WebElement action = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Action", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Adjust Permit", action.getText());
		}

		public void verifyActionAsCanceDenialInFirstGridRow(int rowIndex) {
			WebElement action = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Action", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Cancel Denial", action.getText());
		}

		public void verifyActionAsDenialInFirstGridRow(int rowIndex) {
			WebElement action = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Action", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Denial", action.getText());
		}

		public void verifyExtensionDayAs5InFirstGridRow(int rowIndex) {
			WebElement extnDay = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Extn Days", rowIndex);
			verify.ExpectedPropertyValueIsEqual("5", extnDay.getText());
		}

		public void verifyExtensionDayAs2InFirstGridRow(int rowIndex) {
			WebElement extnDay = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Extn Days", rowIndex);
			verify.ExpectedPropertyValueIsEqual("2", extnDay.getText());
		}

		public void verifyAtPermitLocationInFirstGrid(int rowIndex) {
			WebElement Location = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Location", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("Location"), Location.getText());
		}

		public void verifyActionAsPermit() {
			WebElement Action = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Permit", "Action");
			verify.ExpectedPropertyValueIsEqual("Permit", Action.getText());
		}

		public void verifyExpireDateAsNextDayFromToDate(int rowIndex) {
			String ToDate = uIMapTraffic.parkingPermits.uIToDateEdit.getAttribute("value");
			String date = ToDate.substring(3, 2);
			int intDate = Integer.parseInt(date);
			int incrementDate = intDate + 1;
			String expireDate = Randomized.removeStringByIndexCount(ToDate, 3, 2);
			Randomized.insertStringByIndex(expireDate, 3, Integer.toString(rowIndex + incrementDate));
			WebElement Date = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Expire Date", rowIndex);
			verify.ExpectedPropertyValueIsEqual(expireDate, Date.getText());

		}

		public void verifyNotesCleared() {
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingPermits.uINotesEdit.getAttribute("value").contains(""));
		}

		public void clickAttachmentButton() {
			uIMapTraffic.parkingPermits.uIAttachmentButton.click();
		}

		public void verifyAttachImageInFirstRow(int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Attach", rowIndex)
					.getAttribute("class").contains("GridImage1"));

		}

		public void clickAttachImage(int rowIndex) {
			Playback.pageLoadThreadWait();
			WebElement AttachImage = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermits.uIPermitHistoryTable, "Attach", rowIndex);
			AttachImage.click();
		}

		public void enterActionDateAsExpireDateGotFromPermitSearch(String expireDate) {

			uIMapTraffic.parkingPermits.uIActionDateEdit.sendKeys(expireDate);
		}

		public void enterActionDateAsExpireDateGotFromPermitHistorySearch(String expireDate) {

			uIMapTraffic.parkingPermits.uIActionDateEdit.sendKeys(expireDate);
		}

		public void enterValidExtendDateAsExpireDateGotFromPermitSearch(String expireDate) {
			uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.sendKeys(expireDate);
		}

		public void enterToDateAsExpireDateGotFromPermitSearch(String expireDate) {
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(expireDate);
			uIMapTraffic.parkingPermits.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void enterValidExtendDateAsExpireDateGotFromPermitHistorySearch(String expireDate) {
			uIMapTraffic.parkingPermits.uIValidExtendFromDateEdit.sendKeys(expireDate);
		}

		public void verify10084AckMessage() {
			popUp.acknowledge
					.okWithExpectedMessage("(10084) Maximum # of Maximum Days per Permit/Extension has been exceeded");

		}

		public void verify10083AckMessage() {
			popUp.acknowledge.okWithExpectedMessage(
					"(10083) Maximum # of permits allowed has been reached. Further permits cannot be issued for the current month.");

		}

		public void verify10085AckMessage() {
			popUp.acknowledge.okWithExpectedMessage(
					"(10085) Maximum # of extensions allowed has been reached. No more extensions can be issued for this permit.");

		}

		public void switchToPopupAcknowledge() {
			popUp.switchToAcknowledge();
		}

		public void verify10016ConfirmMsg() {
			popUp.confirm.yesWithExpectedMessage(
					"(10016) Number of Permits limit has been reached. Do you want to override Denial Status?");
		}

		public void verify10073AckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(10073) The To Date must be later than the Expiration Date");
		}

		public void verify10014AckMsg() {
			popUp.acknowledge.okWithExpectedMessage(
					"(10014) Number of Days allowed per year has been reached. Cannot issue a permit extension for the current year.");
		}

		public void verifyRequiredEntriesMissingAckMsg() {
			popUp.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void closeParkingPermitScreen() {

			Playback.driver.close();

		}

		public void enterNoOfDaysRequestedAs6() {
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.sendKeys("6");
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.sendKeys(Keys.TAB);
		}

		public void enterNoOfDaysRequestedAs5() {
			Playback.pageLoadThreadWait();
			Playback.waitForControlReady();
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.sendKeys("5");
		}

		public void enterNoOfDaysRequestedAs3() {
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.sendKeys("3");
		}

		public void clearNoOfRequested() {
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.clear();
		}

		public void enterNoOfRequestedAs2() {
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.sendKeys("2");
		}

		public void clickResetButton() {
			uIMapTraffic.parkingPermits.uIResetButton.click();
		}

		public void clickSaveButton() {
			uIMapTraffic.parkingPermits.uISaveButton.click();
		}

		public void verifyPermitLocationMandatory() {
			verify.ExpectedValueIsTrue(uIMapTraffic.parkingPermits.uIPermitLocationTextView.getAttribute("style")
					.contains("rgb(153, 0, 0)"));
		}

		public void enterAtLastName() {
			uIMapTraffic.parkingPermits.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("LastName"));
			uIMapTraffic.parkingPermits.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapTraffic.parkingPermits.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("FirstName"));
			uIMapTraffic.parkingPermits.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtAddress() {
			uIMapTraffic.parkingPermits.uIAddressEdit.sendKeys(PoliceData.getTrafficModuleValue("Address"));
			uIMapTraffic.parkingPermits.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void SelectPermitType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTraffic.parkingPermits.uIPermitTypeComboBox);
			uIMapTraffic.parkingPermits.uIPermitTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtPermitType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.parkingPermits.uIPermitTypeComboBox,
					PoliceData.getTrafficModuleValue("PermitType"));
			uIMapTraffic.parkingPermits.uIPermitTypeComboBox.sendKeys(Keys.TAB);
		}

		public void verify1003UpdateSuccessfulStatusBarMsg() {
			String expect = uIMapTraffic.parkingPermits.uIBottomLeftSideStatusBar.getText();
			String msg = "1003 - Update Successful";
			verify.ExpectedPropertyValueIsEqual(msg, expect);
		}

		public String readPermitNoFromGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String permit = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.parkingPermits.uIPermitTable, "Permit#", rowIndex);
			return permit;
		}

		public void clickAtGridRowByPermitNo() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTraffic.parkingPermits.uIPermitTable,
					PoliceData.getTrafficModuleValue("PermitNo"));
		}

		public void clickAtGridRowByPermitNo(String PermitNo) {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTraffic.parkingPermits.uIPermitTable,
					PermitNo);
		}

		public void verifyNoOfDaysRequestedDisabled() {
			String clsText = uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.getAttribute("class");
			System.out.println(clsText);
			verify.ExpectedValueIsTrue(clsText.contains("Inactive"));
		}

		public void verifyNoOfDaysRequestedEnabled() {
			String clsText = uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.getAttribute("class");
			verify.ExpectedValueIsFalse(clsText.contains("Inactive"));
		}

		public void clickDeleteIconInGridByPermitNo() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(uIMapTraffic.parkingPermits.uIPermitTable,
					PoliceData.getTrafficModuleValue("PermitNo"));

		}

		public void clickDeleteIconInGridByPermitNo(String PermitNo) {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(uIMapTraffic.parkingPermits.uIPermitTable,
					PermitNo);

		}

		public void clickRefreshButton() {
			uIMapTraffic.parkingPermits.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtNoOfDaysRequested() {
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NoOfDaysRequested"));
			uIMapTraffic.parkingPermits.uINoOfDaysRequestedEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtExtendedDaysInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String days = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTraffic.parkingPermits.uIPermitTable, "Extn Days", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("NoOfDaysRequested"), days);
		}

		public void selectAtReason()
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTraffic.parkingPermits.uIReasonComboBox, PoliceData.getTrafficModuleValue("Reason"));
		}

		public void clickPlateInfoIcon() {
			uIMapTraffic.parkingPermits.uIPlateInfoButton.click();

		}

		public void clickNameClearOperatorIcon() {
			uIMapTraffic.parkingPermits.uINameClearButton.click();
		}

		public void enterAtLastName1() {
			uIMapTraffic.parkingPermits.uILastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("LastName1"));
			uIMapTraffic.parkingPermits.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName1() {
			uIMapTraffic.parkingPermits.uIFirstNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("FirstName1"));
			uIMapTraffic.parkingPermits.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPermitLocation1() {
			uIMapTraffic.parkingPermits.uIPermitLocationEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PermitLocation1"));
		}

	}

	public class ParkingPermitsSearch {

		public void enterAtPlateNo() {
			String plateInf = PoliceData.getTrafficModuleValue("PlateNo");
			String[] plateInfo = plateInf.split("-");
			uIMapTraffic.parkingPermitsSearch.uIPlateEdit.sendKeys(plateInfo[0]);
			uIMapTraffic.parkingPermitsSearch.uIStateComboBox.sendKeys(plateInfo[1]);
			uIMapTraffic.parkingPermitsSearch.uIStateComboBox.sendKeys(Keys.TAB);

		}

		public void enterAtPermitNo() {
			uIMapTraffic.parkingPermitsSearch.uIPermitYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PermitNo").substring(0, 2));
			uIMapTraffic.parkingPermitsSearch.uIPermitNuumberEdit
					.sendKeys(PoliceData.getTrafficModuleValue("PermitNo").substring(3));
			uIMapTraffic.parkingPermitsSearch.uIPermitNuumberEdit.sendKeys(Keys.TAB);
		}

		public void enterpermit() {
			uIMapTraffic.parkingPermitsSearch.uIPermitYearEdit.sendKeys("15");
			uIMapTraffic.parkingPermitsSearch.uIPermitNuumberEdit.sendKeys("000");

		}

		public void selectStatusAsExpired() {
			uIMapTraffic.parkingPermitsSearch.uIStatusComboBox.sendKeys("Expired");
		}

		public void selectStatusAsValid() {
			uIMapTraffic.parkingPermitsSearch.uIStatusComboBox.sendKeys("Valid");
		}

		public void selectStatusAsDenial() {
			uIMapTraffic.parkingPermitsSearch.uIStatusComboBox.sendKeys("Denied");
		}

		public void clickSearchButton() {
			uIMapTraffic.parkingPermitsSearch.uISearchButton.click();
		}

		public void verifyAddressContainsJurisAndCSZInTheAddressColumn() {

			WebElement addressElement = objectIdentification.manualIdentify.getGridCell(
					uIMapTraffic.parkingPermitsSearch.uIParkingPermitSearchTable,
					PoliceData.getTrafficModuleValue("Address"));
			String address = objectIdentification.manualIdentify.getGridTableRow(addressElement, 4).getText();
			String[] addressDetails = address.split(";");
			String regExp = "^[A-Z]{2},\\s[\\w\\s]+,\\s[A-Z]{2},\\s[0-9]{5}$";
			verify.ExpectedValueIsTrue(Pattern.matches(addressDetails[1], regExp), "Address Fromat Wrong");

		}

		public void enterAtAddress() {
			uIMapTraffic.parkingPermitsSearch.uIPermitAddressEdit.sendKeys(PoliceData.getTrafficModuleValue("Address"));
			uIMapTraffic.parkingPermitsSearch.uIPermitAddressEdit.sendKeys(Keys.TAB);
		}

		public void clickRowByAtPlate() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.parkingPermitsSearch.uIParkingPermitSearchTable,
					PoliceData.getTrafficModuleValue("Plate"));
		}

		public void getPlateFromGrid(int rowIndex, String plate) {
			plate = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapTraffic.parkingPermitsSearch.uIParkingPermitSearchTable, "Plate", rowIndex);
		}

		public void selectPermitAddressAsAddress(int rowIndex) {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraffic.parkingPermitsSearch.uIPermitAddressComboBox, rowIndex);

		}

		public void enterAtPremise() {
			uIMapTraffic.parkingPermitsSearch.uIPermitAddressPremiseEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Premise"));

		}

		public void enterAtStreet() {
			uIMapTraffic.parkingPermitsSearch.uIPermitAddressStreetEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Street"));

		}

		public void getExpireDateByAtPremiseStreet(String expireDate) {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTraffic.parkingPermitsSearch.uIParkingPermitSearchTable,
					PoliceData.getTrafficModuleValue("Premise") + " " + PoliceData.getTrafficModuleValue("Street"));
			WebElement Date = objectIdentification.manualIdentify
					.getGridCell(uIMapTraffic.parkingPermitsSearch.uIParkingPermitSearchTable, uIRow, "Status");
			expireDate = Date.getText();

		}

		public void clickRowByAtPremiseStreet() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTraffic.parkingPermitsSearch.uIParkingPermitSearchTable,
					PoliceData.getTrafficModuleValue("Premise") + " " + PoliceData.getTrafficModuleValue("Street"));
		}

		public void selectAtDateType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraffic.parkingPermitsSearch.uIDateTypeDropdown, PoliceData.getTrafficModuleValue("DateType"));
		}

		public void enterFromDateAsCurrentDate() {
			uIMapTraffic.parkingPermitsSearch.uIFromDateEdit.sendKeys(randomized.getCurrentDate());
			uIMapTraffic.parkingPermitsSearch.uIFromDateEdit.sendKeys(Keys.TAB);
		}

		public void enterToDateAs2DaysFutureFromCurrentDate() {
			uIMapTraffic.parkingPermitsSearch.uIToDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapTraffic.parkingPermitsSearch.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtPlateInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapTraffic.parkingPermitsSearch.uIParkingPermitSearchTable,
					PoliceData.getTrafficModuleValue("Plate"));
			verify.ExpectedValueIsTrue(gridCell.getText().contains(PoliceData.getTrafficModuleValue("Plate")));
		}

	}

	public class ParkingPermitsAuthenticate {

		public void enterAtPassword() {
			uIMapTraffic.parkingPermitsAuthenticate.uIPasswordEdit
					.sendKeys(PoliceData.getTrafficModuleValue("Password"));

		}

		public void clickAcceptButton() {
			uIMapTraffic.parkingPermitsAuthenticate.uIAcceptButton.click();
			Playback.threadWait();
		}

	}

	public class Court {

		public void clickAddNewButton() {
			uIMapTraffic.court.uIAddNewButton.click();
		}

	}

	public class CourtEntry {

		public void clickCustomText() {
			uIMapTraffic.courtEntry.uICustomText.click();
		}

		public void verifyAtCustomNameAppears() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("CustomName"),
					uIMapTraffic.courtEntry.uICustomText.getText());
		}

		public void closeTheScreen() {
			uIMapTraffic.courtEntry.driver.close();
		}
		
	}
		public class KPICrimeSceneSDK { // Added by Abi

			public void clickDrawTab() {
				uIMapTraffic.kPICrimeSceneSDK.uIDrawTab.click();
			}

			public void clickStartWithATemplateButton() {
				uIMapTraffic.kPICrimeSceneSDK.uIStartTemplateButton.click();
			}

			public void chooseATemplate() {
				Playback.controlReadyThreadWait();
//				WebElement template = uIMapTraffic.kPICrimeSceneSDK.uITemplate;
//				Actions choose = new Actions(Playback.driver);
//				choose.click(template).build().perform();
				uIMapTraffic.kPICrimeSceneSDK.uIOkButton.click();
			}

			public void clickSaveButton() {
				Playback.controlReadyThreadWait();
				 uIMapTraffic.kPICrimeSceneSDK.uISaveButton.click();

			}

		
	
}

}
