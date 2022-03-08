package application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import dataAccess.PoliceData;
import uIMaps.UIMapHome;
import uIMaps.UIMapPopup;
import uIMaps.UIMapTrafficWI;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class TrafficWI {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapTrafficWI uIMapTrafficWI = new UIMapTrafficWI();
	public Popup popup = new Popup();
	public Randomized randomized = new Randomized();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public UIMapHome uIMapHome = new UIMapHome();
	public Names names = new Names();
	public Geo geo = new Geo();

	public CitationEntry citationEntry;
	public CitationSearch citationSearch;
	public CrashEntry crashEntry;
	public DeerCrash deerCrash;
	public ParkingEntry parkingEntry;
	public ParkingSearch parkingSearch;
	public ParkingOtherPayment parkingOtherPayment;
	public CitationComments citationComments;
	public CrashSearch crashSearch;
	public CrashComments crashComments;
	public TicketHoldReason ticketHoldReason;
	public CitationArrest citationArrest;
	public UnitDetails unitDetails;
	public CrashEntryMoreScreen crashEntryMoreScreen;
	public StruckObjects struckObjects;
	public CrashSearchHelpWindow crashSearchHelpWindow;
	public CitationSearchHelpWindow citationSearchHelpWindow;
	public NamesComments namesComments;
	public PaymentMethodScreen paymentMethodScreen;

	public TrafficWI() {
		if (citationEntry == null)
			citationEntry = new CitationEntry();
		if (citationSearch == null)
			citationSearch = new CitationSearch();
		if (crashEntry == null)
			crashEntry = new CrashEntry();
		if (deerCrash == null)
			deerCrash = new DeerCrash();
		if (parkingEntry == null)
			parkingEntry = new ParkingEntry();
		if (parkingSearch == null)
			parkingSearch = new ParkingSearch();
		if (parkingOtherPayment == null)
			parkingOtherPayment = new ParkingOtherPayment();
		if (citationComments == null)
			citationComments = new CitationComments();
		if (crashSearch == null)
			crashSearch = new CrashSearch();
		if (crashComments == null)
			crashComments = new CrashComments();
		if (ticketHoldReason == null)
			ticketHoldReason = new TicketHoldReason();
		if (citationArrest == null)
			citationArrest = new CitationArrest();
		if (unitDetails == null)
			unitDetails = new UnitDetails();
		if (crashEntryMoreScreen == null)
			crashEntryMoreScreen = new CrashEntryMoreScreen();
		if (struckObjects == null)
			struckObjects = new StruckObjects();
		if (crashSearchHelpWindow == null)
			crashSearchHelpWindow = new CrashSearchHelpWindow();
		if (citationSearchHelpWindow == null)
			citationSearchHelpWindow = new CitationSearchHelpWindow();
		if (namesComments == null)
			namesComments = new NamesComments();
		if (paymentMethodScreen == null)
			paymentMethodScreen = new PaymentMethodScreen();
	}

	public void Reset() {

		uIMapTrafficWI = null;
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

	public void switchToCrashEntryScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Crash Entry");
	}

	public void switchToCrashEntryByForm() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingFormName("Crash Entry", "frmNJCrash_Id");
	}

	public void switchToCrashSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Crash Search");
	}

	public void switchToDeerCrash() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Deer Crash");
	}

	public void switchToCitationEntry() {
		objectIdentification.windowHandle.switchToWindow("Citation Entry");
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

	public void switchToUnitDetails() {
		objectIdentification.windowHandle.switchToWindow("Unit Details");
		Playback.controlReadyThreadWait();
	}

	public void switchToCrashEntryMoreScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmCrashMore");
		Playback.controlReadyThreadWait();
	}

	public void switchToStruckObjects() {
		objectIdentification.windowHandle.switchToWindow("Struck Objects");
		Playback.controlReadyThreadWait();
	}

	public void switchToCrashSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Crash Search");
	}

	public void switchToCitationSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Citation Search");
	}

	public void switchToPaymentMethodScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmPaymentMethod.aspx?");
	}

	public class CrashEntry {

		public CrashEntryMainTab crashEntryMainTab;
		public WitnessTab witnessTab;
		public OccupantsTab occupantsTab;
		public TruckBusTab truckBusTab;
		public CrashEntryNarrativeTab crashEntryNarrativeTab;
		public CrashEntryMapTab crashEntryMapTab;
		public CrashEntryApprovalTab crashEntryApprovalTab;
		public ConclusionTab conclusionTab;
		public AttachmentsTab attachmentsTab;
		public AccidentTab accidentTab;
		public CrashEntryUnitTab crashEntryUnitTab;
		public CrashEntryTrailerTab crashEntryTrailerTab;
		public PropertyOwnerTab propertyOwnerTab;
		public CrashEntryCommentsTab crashEntryCommentsTab;

		public CrashEntry() {

			if (crashEntryMainTab == null)
				crashEntryMainTab = new CrashEntryMainTab();

			if (witnessTab == null)
				witnessTab = new WitnessTab();

			if (occupantsTab == null)
				occupantsTab = new OccupantsTab();

			if (truckBusTab == null)
				truckBusTab = new TruckBusTab();

			if (crashEntryNarrativeTab == null)
				crashEntryNarrativeTab = new CrashEntryNarrativeTab();

			if (crashEntryMapTab == null)
				crashEntryMapTab = new CrashEntryMapTab();

			if (crashEntryApprovalTab == null)
				crashEntryApprovalTab = new CrashEntryApprovalTab();

			if (conclusionTab == null)
				conclusionTab = new ConclusionTab();

			if (attachmentsTab == null)
				attachmentsTab = objectIdentification.new AttachmentsTab();

			if (accidentTab == null)
				accidentTab = new AccidentTab();

			if (crashEntryUnitTab == null)
				crashEntryUnitTab = new CrashEntryUnitTab();

			if (crashEntryTrailerTab == null)
				crashEntryTrailerTab = new CrashEntryTrailerTab();

			if (propertyOwnerTab == null)
				propertyOwnerTab = new PropertyOwnerTab();

			if (crashEntryCommentsTab == null)
				crashEntryCommentsTab = new CrashEntryCommentsTab();

		}

		public void verifyAtCrashNumber() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("ActivityNo").substring(0, 2),
					uIMapTrafficWI.crashEntry.uICrashYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("ActivityNo").substring(3),
					uIMapTrafficWI.crashEntry.uICrashNumberEdit.getAttribute("value"));
		}

		public void closeScreen() {
			uIMapTrafficWI.crashEntry.driver.close();
		}

		public void enterAtCaseNo() {
			uIMapTrafficWI.crashEntry.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo").substring(0, 2));
			uIMapTrafficWI.crashEntry.uICaseNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo").substring(3));
			uIMapTrafficWI.crashEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNumber1() {
			uIMapTrafficWI.crashEntry.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo1").substring(0, 1));
			uIMapTrafficWI.crashEntry.uICaseNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo1").substring(4));
			uIMapTrafficWI.crashEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void clearTheCaseYearAndNo() {
			uIMapTrafficWI.crashEntry.uICaseYearEdit.clear();
			uIMapTrafficWI.crashEntry.uICaseNumberEdit.clear();
		}

		public void clickCaseInfo() {
			Playback.pageLoadThreadWait();
			uIMapTrafficWI.crashEntry.uICaseDetailsInfoButton.click();
		}

		public void close() {
			uIMapTrafficWI.crashEntry.driver.close();
		}

		public void enterAtLocation() {

			uIMapTrafficWI.crashEntry.uILocationEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Address"));
			uIMapTrafficWI.crashEntry.uILocationEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.crashEntry.uILocationCheckBox.sendKeys(Keys.TAB);

		}

		public void enterLocation(String address) {

			uIMapTrafficWI.crashEntry.uILocationEdit.sendKeys(address);
			uIMapTrafficWI.crashEntry.uILocationEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.crashEntry.uILocationCheckBox.sendKeys(Keys.TAB);

		}

		public void verifyInactiveAddressAcknowledge() {

			popup.acknowledge.okWithExpectedMessage("(5097) This address is inactive");

		}

		public void verifyAcknowledgePremiseInactiveAddress() {
			popup.acknowledge.okWithExpectedMessage("(5095) Premise is inactive");
		}

		public void enterLocation() {
			uIMapTrafficWI.crashEntry.uILocationEdit.sendKeys("b");
			uIMapTrafficWI.crashEntry.uILocationEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.crashEntry.uILocationCheckBox.sendKeys(Keys.TAB);
			geo.commonNameHelp.SelectCommonName();
		}

		public void tabOutOfficer() {
			uIMapTrafficWI.crashEntry.uIKSOfficerCodeEdit.click();
			uIMapTrafficWI.crashEntry.uIKSOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyLoggedPFAutopupulates() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("UserName"),
					uIMapTrafficWI.crashEntry.uIKSOfficerCodeEdit.getAttribute("value"));
		}

		public void verifyAtKSOfficer() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Officer"),
					uIMapTrafficWI.crashEntry.uIKSOfficerCodeEdit.getAttribute("value"));
		}

		public void selectOfficer() {
			uIMapTrafficWI.crashEntry.uIOfficerLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtNoOfUnits() {
			uIMapTrafficWI.crashEntry.uINoOfUnitsEdit.sendKeys(PoliceData.getTrafficWIModuleValue("NoOfUnits"));
		}

		public void enterAtUnit() {
			uIMapTrafficWI.crashEntry.uINoOfUnitsEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Unit"));
		}

		public void save() {
			uIMapTrafficWI.crashEntry.uISaveButton.click();

		}

		public void clickSaveButton() {
			uIMapTrafficWI.crashEntry.uISaveButton.click();
		}

		public void verify1051UpdateDataExistsInApprovalTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Approval Tab. You must save or reset.");
		}

		public void clickPrintButton() {
			uIMapTrafficWI.crashEntry.uIPrintButton.click();
		}

		public void yes() {
			popup.switchToConfirm();
			popup.confirm.yes();
		}

		public void enterCurrentDate() {
			uIMapTrafficWI.crashEntry.uIDateEdit.click();
			uIMapTrafficWI.crashEntry.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void enterCurrentTime() {
			uIMapTrafficWI.crashEntry.uITimeEdit.click();
			uIMapTrafficWI.crashEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void switchToMainTab() {
			uIMapTrafficWI.crashEntry.uICrashEntryMainTab.click();
		}

		public void switchToAttachmentTab() {
			uIMapTrafficWI.crashEntry.uIAttachmentTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void switchToWitnessTab() {
			uIMapTrafficWI.crashEntry.uIWitnessTab.click();
			Playback.pageLoadThreadWait();
		}

		public void switchToOccupantTab() {
			uIMapTrafficWI.crashEntry.uIOccupantTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmOccupants");
		}

		public void switchToNarrativeTab() {
			uIMapTrafficWI.crashEntry.uINarrativeTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
		}

		public void switchToNarrative2Tab() {
			uIMapTrafficWI.crashEntry.uINarrative2Tab.click();
		}

		public void switchToDiagramTab() {
			uIMapTrafficWI.crashEntry.uIDiagramTab.click();
		}

		public void switchToDiagram2Tab() {
			uIMapTrafficWI.crashEntry.uIDiagram2Tab.click();
		}

		public void switchToMapTab() {
			uIMapTrafficWI.crashEntry.uIMapTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("GHydrantMap");
		}

		public void switchToApprovalTab() {
			uIMapTrafficWI.crashEntry.uIApprovalTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPnxGlobalApproval");
		}

		public void clickApprovalTab() {
			uIMapTrafficWI.crashEntry.uIApprovalTab.click();
		}

		public void verify10089ActionTabConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(10089) Action Tab- Case status is pending.Do you want to submit?");
			} else
				popup.confirm
						.yesWithExpectedMessage("(10089) Action Tab- Case status is pending.Do you want to submit?");

		}

		public void clickAtTab() {
			WebElement tab = uIMapTrafficWI.crashEntry.driver.findElement(
					By.xpath("//span[contains(text(),'" + PoliceData.getTrafficWIModuleValue("Tab") + "')]"));
			tab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void verifyCaseInfoAppears() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uICaseDetailsInfoButton.isDisplayed());
		}

		public void verifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo").substring(0, 2),
					uIMapTrafficWI.crashEntry.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo").substring(3),
					uIMapTrafficWI.crashEntry.uICaseNumberEdit.getAttribute("value"));
		}

		public void verifyCaseFieldDisabled() {
			String caseYear = uIMapTrafficWI.crashEntry.uICaseYearEdit.getAttribute("class");
			verify.ExpectedValueIsTrue(caseYear.contains("textboxInactive"));
			String caseNo = uIMapTrafficWI.crashEntry.uICaseNumberEdit.getAttribute("class");
			verify.ExpectedValueIsTrue(caseNo.contains("textboxInactive"));
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Location"),
					uIMapTrafficWI.crashEntry.uILocationEdit.getAttribute("value"));

		}

		public void verifyLocationDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uILocationEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyReportedDateTimeDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIDateEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uITimeEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyOfficerFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIOfficerEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyKSOfficerFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIKSOfficerCodeEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyBadgeFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIBadgeNumberEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyAtUnit() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Units"),
					uIMapTrafficWI.crashEntry.uINoOfUnitsEdit.getAttribute("value"));
		}

		public void verifyNoOFUnitsFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uINoOfUnitsEdit.getAttribute("class").contains("textbox"));
		}

		public void verifyLocation(String location) {
			verify.ExpectedPropertyValueIsEqual(location,
					uIMapTrafficWI.crashEntry.uILocationEdit.getAttribute("value"));
		}

		public void verifyReportedDateAndTime(String caseReportedDate1, String caseReportedTime1) {
			verify.ExpectedPropertyValueIsEqual(caseReportedDate1,
					uIMapTrafficWI.crashEntry.uIDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseReportedTime1,
					uIMapTrafficWI.crashEntry.uITimeEdit.getAttribute("value"));
		}

		public void getLocation(String location) {
			location = uIMapTrafficWI.crashEntry.uILocationEdit.getAttribute("value");
		}

		public void verifyAtOfficerBadge() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("OfficerBadge"),
					uIMapTrafficWI.crashEntry.uIBadgeNumberEdit.getAttribute("value"));
		}

		public void verifyAtKSBadge() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Badge"),
					uIMapTrafficWI.crashEntry.uIBadgeNumberEdit.getAttribute("value"));
		}

		public void verifyStatusAsOnHold() {
			verify.ExpectedPropertyValueIsEqual("On Hold", uIMapTrafficWI.crashEntry.uIStatusTextView.getText());
		}

		public void verifyStatusAsOnHoldAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("On Hold", uIMapTrafficWI.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsApprovedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Approved", uIMapTrafficWI.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsLockedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Locked", uIMapTrafficWI.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifySaveButtonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uISaveButton.getAttribute("class").contains("DisabledImgMnuItem"));
		}

		public void verifySaveNCloseButtonDisabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uISaveAndCloseButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
		}

		public void verifyStatusAsSubmittedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Submitted", uIMapTrafficWI.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsRejectedAndAppearAsGreenColor() {
			verify.ExpectedPropertyValueIsEqual("Rejected", uIMapTrafficWI.crashEntry.uIStatusTextView.getText());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyNarrative2Enabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uINarrative2Tab.isEnabled());
		}

		public void verifyDiagram2Enabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uIDiagram2Tab.isEnabled());
		}

		public void getCrashNumber(String CrashNoDetails) {
			String CrashYear = uIMapTrafficWI.crashEntry.uICrashYearEdit.getAttribute("value");
			String CrashNumber = uIMapTrafficWI.crashEntry.uICrashNumberEdit.getAttribute("value");
			CrashNoDetails = CrashYear + "-" + CrashNumber;
		}

		public void verifyMenuBarIcons() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uIDeleteIconButton.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uISaveButton.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uISaveAndCloseButton.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uIResetButton.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIPrintButton.getAttribute("src").contains("16_print.gif"));
		}

		public void verifyStatusAsApprovedAndColor() {
			verify.ExpectedPropertyValueIsEqual(uIMapTrafficWI.crashEntry.uIStatusTextView.getText(), "Approved");
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAppearInGreenColor() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uIStatusTextView.getAttribute("style").contains("green"));
		}

		public void verify1003UpdateSuccessfulFooterMessage() {
			Playback.waitForPageLoad();
			String AdditionMessage = uIMapTrafficWI.crashEntry.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1003 - Update Successful"));
		}

		public void clickDeleteIcon() {
			uIMapTrafficWI.crashEntry.uIDeleteIconButton.click();
		}

		public void clickResetButton() {
			uIMapTrafficWI.crashEntry.uIResetButton.click();
		}

		public void verifyConfirmDelete() {

			Playback.controlReadyThreadWait();
			Assert.assertTrue(Playback.driver.switchTo().alert().getText()
					.contains("This record will be permanently deleted. Do you wish to proceed?"));
			Playback.driver.switchTo().alert().accept();

		}

		public void verify1019DuplicationOfDataFound() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void verifyAtCrashNo() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CrashNo").substring(0, 2),
					uIMapTrafficWI.crashEntry.uICrashYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CrashNo").substring(3),
					uIMapTrafficWI.crashEntry.uICrashNumberEdit.getAttribute("value"));
		}

		public void clickNotificationIcon() {
			uIMapTrafficWI.crashEntry.uINotificationIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickALCIcon() {
			uIMapTrafficWI.crashEntry.uIALCIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyReportReviseConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm
						.yesWithExpectedMessage("(9165) Report is already submitted. Do you want to revise it?");
			} else
				popup.confirm.yesWithExpectedMessage("(9165) Report is already submitted. Do you want to revise it?");

		}

		public void verifyCrashNoAutogenerated() {
			verify.ExpectedPropertyValueIsEqual(Randomized.removeStringByIndexCount(Randomized.getCurrentYear(), 0, 2),
					uIMapTrafficWI.crashEntry.uICrashYearEdit.getAttribute("value"));
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.uICrashNumberEdit.getAttribute("value").contains("000"));
		}

		public void verifyAtTracsRefNo() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(0, 2),
					uIMapTrafficWI.crashEntry.uITracsYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(3),
					uIMapTrafficWI.crashEntry.uITracsNumberEdit.getAttribute("value"));
		}

		public void clickWitnessTab() {
			uIMapTrafficWI.crashEntry.uIWitnessTab.click();
			Playback.pageLoadThreadWait();

		}

		public void verifyWIUpdateAcknowledgeMessageWitnessTab() {
			popup.acknowledge.okWithExpectedMessage("(1056) Updated data exists in the fields. You must save or reset");
		}

		public void verifyAtReportedLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("ReportedLocation"),
					uIMapTrafficWI.crashEntry.uIReportedLocationEdit.getAttribute("value"));
		}

		public void saveScreen() {
			uIMapTrafficWI.crashEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapTrafficWI.crashEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void enterDOTNo() {
			uIMapTrafficWI.crashEntry.uIDOTNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAmendedNo() {
			uIMapTrafficWI.crashEntry.uIAmendedNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAccidentNo() {
			uIMapTrafficWI.crashEntry.uIAccidentNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void verifyWIDateAndTime(String caseReportedDate1, String caseReportedTime1) {
			verify.ExpectedPropertyValueIsEqual(caseReportedDate1,
					uIMapTrafficWI.crashEntry.uIDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseReportedTime1,
					uIMapTrafficWI.crashEntry.uITimeEdit.getAttribute("value"));
		}

		public void verifyTruckBusTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.uITruckBusTab.isEnabled());
		}

		public void switchToTruckBusTab() {
			uIMapTrafficWI.crashEntry.uITruckBusTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTruckBus");
			Playback.controlReadyThreadWait();
		}

		public void switchToConclusionTab() {
			uIMapTrafficWI.crashEntry.uIConclusionTab.click();
			Playback.controlReadyThreadWait();
		}

		public void switchToPropertyOwnerTab() {
			uIMapTrafficWI.crashEntry.uIPropertyOwnerTab.click();
			Playback.controlReadyThreadWait();
		}

		public void switchToAllTab() {
			Playback.pageLoadThreadWait();
			uIMapTrafficWI.crashEntry.uICrashEntryMainTab.click();
			uIMapTrafficWI.crashEntry.uIAccidentTab.click();
			// uIMapTrafficWI.crashEntry.uIWIUnitTab.click();
			// uIMapTrafficWI.crashEntry.uIWITrailerTab.click();
			// uIMapTrafficWI.crashEntry.uIOccupantsTab.click();
			uIMapTrafficWI.crashEntry.uIConclusionTab.click();
			uIMapTrafficWI.crashEntry.uIPropertyOwnerTab.click();
			uIMapTrafficWI.crashEntry.uIWitnessTab.click();
			uIMapTrafficWI.crashEntry.uINarrativeTab.click();
			uIMapTrafficWI.crashEntry.uICommentsTab.click();
			uIMapTrafficWI.crashEntry.uIAttachmentTab.click();
			uIMapTrafficWI.crashEntry.uIMapTab.click();
			uIMapTrafficWI.crashEntry.uIApprovalTab.click();
			Playback.pageLoadThreadWait();

		}

		public void enterAtOfficer() {
			uIMapTrafficWI.crashEntry.uIOfficerCodeEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Officer"));
			uIMapTrafficWI.crashEntry.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void switchToWIAccidentTab() {
			uIMapTrafficWI.crashEntry.uIWIStateAccidentTab.click();
			Playback.controlReadyThreadWait();
		}

		public void switchToWIUnitTab() {
			uIMapTrafficWI.crashEntry.uIUnitTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmUnit");
			Playback.controlReadyThreadWait();
		}

		public void switchToWIVehicleTab() {
			uIMapTrafficWI.crashEntry.uIVehicleTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmUnit");
			Playback.controlReadyThreadWait();
		}

		public void switchToTrailerTab() {
			uIMapTrafficWI.crashEntry.uITrailerTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTrailer");
			Playback.controlReadyThreadWait();

		}

		public void verify1051UpdateDataExistsInTrailerTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Trailer Tab. You must save or reset.");
		}

		public void switchToCommentsTab() {
			uIMapTrafficWI.crashEntry.uICommentsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
			Playback.controlReadyThreadWait();

		}

		public void clickAddressInfoIcon() {
			uIMapTrafficWI.crashEntry.uIAddressInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void getTracsRefNumber(String TracsRefNo) {
			String TracsYear = uIMapTrafficWI.crashEntry.uITracsYearEdit.getAttribute("value");
			String TracsNumber = uIMapTrafficWI.crashEntry.uITracsNumberEdit.getAttribute("value");
			TracsRefNo = TracsYear + "-" + TracsNumber;
		}

		public void enterAtDOTNo() {
			uIMapTrafficWI.crashEntry.uIDOTNoEdit.sendKeys(PoliceData.getTrafficWIModuleValue("DOTNo"));
			uIMapTrafficWI.crashEntry.uIDOTNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtCallNo() {
			String attribute = uIMapTrafficWI.crashEntry.uICallYearEdit.getAttribute("value");
			String attribute2 = uIMapTrafficWI.crashEntry.uICallNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getTrafficModuleValue("CallNo").substring(0, 1)));
			verify.ExpectedValueIsTrue(attribute2.contains(PoliceData.getTrafficModuleValue("CallNo").substring(4)));
		}

		public void verify1002AdditionSuccessfulAcwkMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
		}

		public void clickCallNoInfoIcon() {
			uIMapTrafficWI.crashEntry.uICallNoInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtActiveCaseNo(String caseNo) {
			String attribute = uIMapTrafficWI.crashEntry.uICaseYearEdit.getAttribute("value");
			String attribute1 = uIMapTrafficWI.crashEntry.uICaseNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(caseNo.substring(0, 2)));
			verify.ExpectedValueIsTrue(attribute1.contains(caseNo.substring(3)));
		}

		public void verifyAtActiveCallNo(String caseNo) {
			String attribute = uIMapTrafficWI.crashEntry.uICallYearEdit.getAttribute("value");
			String attribute1 = uIMapTrafficWI.crashEntry.uICallNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(caseNo.substring(0, 2)));
			verify.ExpectedValueIsTrue(attribute1.contains(caseNo.substring(3)));
		}

		public void clickOfficerLookUpIcon() {
			uIMapTrafficWI.crashEntry.uIOfficerLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verify1003UpdateSuccessfulAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1003 - Update Successful");
		}

		public void verifyAtActiveReportedLocation(String location) {
			String attribute = uIMapTrafficWI.crashEntry.uIReportedLocationEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(location));

		}

		public void verifyAtActiveDate(String date) {
			String attribute = uIMapTrafficWI.crashEntry.uIDateEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(date));

		}

		public void verifyAtActiveTime(String time) {
			String attribute = uIMapTrafficWI.crashEntry.uITimeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(time));

		}
			public void clickAllTabBeforeSave() {															// Added by Abi
			Playback.pageLoadThreadWait();
			uIMapTrafficWI.crashEntry.uICrashEntryMainTab.click();
			uIMapTrafficWI.crashEntry.uIAccidentTab.click();
			uIMapTrafficWI.crashEntry.uIConclusionTab.click();
			uIMapTrafficWI.crashEntry.uIPropertyOwnerTab.click();
			uIMapTrafficWI.crashEntry.uIWitnessTab.click();
			Playback.pageLoadThreadWait();
		}

		public void verifyTracsRefNo(String traCSRefNo) {																										// Added by Abi
			verify.ExpectedValueIsTrue(traCSRefNo.contains(uIMapTrafficWI.crashEntry.uITracsYearEdit.getAttribute("value")));
			verify.ExpectedValueIsTrue(traCSRefNo.contains(uIMapTrafficWI.crashEntry.uITracsNumberEdit.getAttribute("value")));
		}

		public String readTraCSRefNo() {																														// Added by Abi																			
				String year = uIMapTrafficWI.crashEntry.uITracsYearEdit.getAttribute("value");
				String number = uIMapTrafficWI.crashEntry.uITracsNumberEdit.getAttribute("value");
				System.out.println( year+"-"+number);
				return year+"-"+number;
				
		}

		public void verifyAtJuris() {																															// Added by Abi
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTrafficWI.crashEntry.uIJurisComboBox);
			verify.ExpectedValueIsTrue(PoliceData.getTrafficModuleValue("Juris").contains(dropDownSelectedItem));
		}
	}

	public class CrashEntryMainTab {

		public void clickNJTR1BCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uINJTR1BCheckBox.click();
		}

		public void clickKSFatalCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIKSFatalCheckBox.click();
		}

		public void selectStationPrecinct() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIStationPrecinctComboBox);
		}

		public void enterCrossRoad() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uICrossRoadNameEdit.click();
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uICrossRoadNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CrossRoad"));
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uICrossRoadNameVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void enterAtCity() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uICityEdit.sendKeys(PoliceData.getTrafficWIModuleValue("City"));
		}

		public void selectCounty() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uICountyComboBox);
		}

		public void tabOutDateOfAccident() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIDateOfAccidentEdit.sendKeys(Keys.TAB);
		}

		public void tabOutTimeOfAccident() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uITimeOfAccidentEdit.sendKeys(Keys.TAB);
		}

		public void verifyDayFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIDayComboBox.getAttribute("disabled") == "true");
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Location"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uILocationEdit.getAttribute("value"));
		}

		public void verifyAtBlockNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("BlockNo"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIBlockNoEdit.getAttribute("value"));
		}

		public void selectRoadDividedBy() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadDividedByComboBox);
		}

		public void selectTemproraryTrafficControlZone() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uITemproraryTrafficControlZoneComboBox);
		}

		public void selectLightCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uILightConditionComboBox);
		}

		public void selectKSLightCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIKSLightConditionComboBox);
		}

		public void selectKSIntersectionType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIIntersectionTypeComboBox);
		}

		public void selectKSLocationWorkZone() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uILocationWorkZoneComboBox);
		}

		public void selectAdverseWeatherConditionAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAdverseWeatherConditionsComboBox,
					"88 - Other(Specify)");
		}

		public void verifyAdverseWeatherConditionsFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAdverseWeatherConditionsEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAdverseWeatherCondition() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAdverseWeatherConditionsEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSystem() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSystecomboBox);
		}

		public void selectRoadCharacter() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadCharacterComboBox);
		}

		public void selectRoadSurfaceConditions() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSurfaceConditionsComboBox);
		}

		public void selectRoadSurfaceType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSurfaceTypeComboBox);
		}

		public void selectEnvironmentCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIEnvironmentConditionComboBox);
		}

		public void selectWithOtherMVasFirstEvent() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox);
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox.sendKeys(Keys.TAB);
		}

		public void selectAsWithOtherMVasFirstEvent() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox.sendKeys("  --  ");
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox.sendKeys(Keys.TAB);
		}

		public void selectWithBelowasFirstEvent() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithBelowAsFirstEventComboBox);
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithBelowAsFirstEventComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtPoliceDept() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("PoliceDept"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIPoliceDptOfEdit.getAttribute("value"));
		}

		public void verifyAtKSPoliceDepartment() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("PoliceDept"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIKSPoliceDepartmentEdit.getAttribute("value"));
		}

		public void verifyAtCode2() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTrafficWI.crashEntry.crashEntryMainTab.uICode2ComboBox) == PoliceData
							.getTrafficWIModuleValue("Code2"));
		}

		public void verifyDateofCrashAsReportedDate() {
			verify.ExpectedPropertyValueIsEqual(uIMapTrafficWI.crashEntry.uIDateEdit.getAttribute("value"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIDateOfCrashEdit.getAttribute("value"));
		}

		public void verifyDateSameAsReportedDate() {
			verify.ExpectedPropertyValueIsEqual(uIMapTrafficWI.crashEntry.uIDateEdit.getAttribute("value"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIDateOfAccidentEdit.getAttribute("value"));
		}

		public void verifyTimeofCrashAsReportedTime() {
			verify.ExpectedPropertyValueIsEqual(uIMapTrafficWI.crashEntry.uITimeEdit.getAttribute("value"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uITimeOfCrashEdit.getAttribute("value"));
		}

		public void verifyAtMunicipalityCodeName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("MunicipalityCode"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIMunicipalityCodeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("MunicipalityName"),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIMunicipalityCodeTextView.getAttribute("value"));
		}

		public void verifyRoadNameAsLocation() {
			verify.ExpectedPropertyValueIsEqual(Randomized
					.removeStringByIndexCount(uIMapTrafficWI.crashEntry.uILocationEdit.getAttribute("value"), 0, 4),
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadNameEdit.getAttribute("value"));
		}

		public void verifyWithBelowAsFirstEventGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithBelowAsFirstEventComboBox
					.getAttribute("disabled") == "true");
		}

		public void verifyWithOtherMVAsFirstEventGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWithOtherMVAsFirstEventComboBox
					.getAttribute("disabled") == "true");
		}

		public void verify10086MandatoryDataMissingCountyAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing County");
		}

		public void verify10086MandatoryDataMissingTimeOfAccidentAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Time of Accident");
		}

		public void verify10086MandatoryDataMissingLightConditionsAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Light Conditions");
		}

		public void verify10086MandatoryDataMissingIntersectionTypeAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Intersection Type");
		}

		public void verify10086MandatoryDataMissingAdverseWeatherConditionsAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Adverse Weather Conditions");
		}

		public void verify10086MandatoryDataMissingSurfaceConditionsAckMsg() {
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Surface Conditions"));
			popup.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingSurfaceTypeAckMsg() {
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Surface Type"));
			popup.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingAccidentLocationAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Accident Location");
		}

		public void verify10086MandatoryDataMissingTrafficControlsAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Traffic Control");
		}

		public void verify10086MandatoryDataMissingWorkZoneTypeAckMsg() {
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Work Zone Type"));
			popup.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingAccidentClass1stHarmfulAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Accident Class(1st Harmful)");
		}

		public void verify10086MandatoryDataMissingRoadSpecialFeaturesAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Road Special Features");
		}

		public void verify10086MandatoryDataMissingWorkZoneCategoryAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Work Zone Category");
		}

		public void verify10086MandatoryDataMissingFixedObjectType1stHarmfulAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Fixed Object Type(1st Harmful)");
		}

		public void verify10086MandatoryDataMissingRoadwayNumberOfLanesAckMsg() {
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Roadway Number of Lanes"));
			popup.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingRoadCharacterAckMsg() {
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("(10086) Mandatory data missing Road Character"));
			popup.acknowledge.ok();
		}

		public void verify10086MandatoryDataMissingCollisionWithVehicle1stHarmfulAckMsg() {
			popup.acknowledge
					.okWithExpectedMessage("(10086) Mandatory data missing Collision With Vechicle(1st Harmful)");
		}

		public void verify10086MandatoryDataMissingSpecialJurisdictionAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10086) Mandatory data missing Special Jurisdiction");
		}

		public void selectSurfaceConditionOnAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uISurfaceConditionsOnComboBox, "88 - Other(Specify)");
		}

		public void verifySurfaceConditionsOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uISurfaceConditionsOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInSurfaceConditionOn() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uISurfaceConditionsOnEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectSurfaceTypeOnAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uISurfaceTypeOnComboBox, "88 - Other(Specify)");
		}

		public void verifySurfaceTypeOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uISurfaceTypeOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInSurfaceTypeOn() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uISurfaceTypeOnEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectAccidentLocationOnAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentLocationComboBox, "88 - Other(Specify)");
		}

		public void verifyAccidentLocationOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentLocationEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAccidentLocation() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentLocationEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectOnAt() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uITrafficControlsOnAtComboBox);
		}

		public void selectTypePresentAsOther() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uITrafficControlsTypePresentComboBox, "Other");
		}

		public void selectOKNF() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uITrafficControlsOkNFComboBox);
		}

		public void verifyTrafficControlFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uITrafficControlsEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInTrafficControl() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uITrafficControlsEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectWorkZoneTypeOnAs01ConstructionZone() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWorkZoneTypeOnComboBox, "01 - Construction Zone");
		}

		public void selectAccidentClass1stHarmfulEventAs07AnimalType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentClass1stHarmfulEventComboBox,
					"07 - Animal Type");
		}

		public void verifyAccidentClass1stHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentClass1stHarmfulEventEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAccidentClass1stHarmfulEvent() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentClass1stHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectAccidentClassMostHarmfulEventAs09OtherObject() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentClassMostHarmfulEventComboBox,
					"09 - Other Object");
		}

		public void verifyAccidentClassMostHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentClassMostHarmfulEventEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInAccidentClassMostHarmfulEvent() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIAccidentClassMostHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSpecialFeatures1stAs01Bridge() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures1stComboBox, "01 - Bridge");
		}

		public void verifyRoadSpecialFeatures1stFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures1stEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadSpecialFeatures1stField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures1stEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSpecialFeatures2ndAs04RRXING() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures2ndComboBox, "04 - RRXING");
		}

		public void verifyRoadSpecialFeatures2ndFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures2ndEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadSpecialFeatures2ndField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures2ndEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadSpecialFeatures3rd() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadSpecialFeatures3rdComboBox);
		}

		public void selectWorkZoneCategoryAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWorkZoneCategoryComboBox, "88 - Other(Specify)");
		}

		public void verifyWorkZoneCategoryFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWorkZoneCategoryEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInWorkZoneCategoryField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWorkZoneCategoryEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectFixedObjectType1stHarmfulEventAsOther() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIFixedObjectType1stHarmfulEventComboBox, "Other");
		}

		public void verifyFixedObjectType1stHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIFixedObjectType1stHarmfulEventEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInFixedObjectType1stHarmfulEventField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIFixedObjectType1stHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectFixedObjectTypeMostHarmfulEvent() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIFixedObjectTypeMostHarmfulEventComboBox);
		}

		public void selectRoadwayNumberOfLanesOnAsOtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadwayNumberOfLanesOnComboBox, "Other(Specify)");
		}

		public void verifyRoadwayNumberOfLanesOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadwayNumberOfLanesOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadwayNumberOfLanesOnField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadwayNumberOfLanesOnEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectRoadCharacterOnAsOther() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadCharacterOnComboBox, "Other");
		}

		public void verifyRoadCharacterOnFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadCharacterOnEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInRoadCharacterOnField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadCharacterOnEdit.sendKeys(Randomized.randomString(10));
		}

		public void selectCollisionWithVehicle1stHarmfulEventAs88Other() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uICollisionWithVehicle1stHarmfulEventComboBox,
					"88 - Other");
		}

		public void verifyCollisionWithVehicle1stHarmfulEventFieldEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uICollisionWithVehicle1stHarmfulEventEdit
							.getAttribute("class").contains("textbox"));
		}

		public void enterTextInCollisionWithVehicle1stHarmfulEventField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uICollisionWithVehicle1stHarmfulEventEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void selectCollisionWithVehicleMostHarmfulEvent() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uICollisionWithVehicleMostHarmfulEventComboBox);
		}

		public void selectSpecialJurisdictionAs88OtherSpecify() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uISpecialJurisdictionComboBox, "88 - Other(Specify)");
		}

		public void verifySpecialJurisdictionFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uISpecialJurisdictionEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterTextInSpecialJurisdictionField() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uISpecialJurisdictionEdit.sendKeys(Randomized.randomString(10));
		}

		public void getLatLongValue(String LatLongValue) {
			String Latitute = uIMapTrafficWI.crashEntry.crashEntryMainTab.uILatituteEdit.getAttribute("value");
			String Longitute = uIMapTrafficWI.crashEntry.crashEntryMainTab.uILongitudeEdit.getAttribute("value");
			LatLongValue = Latitute + " / " + Longitute;
		}

		public void getKSLatLongValue(String LatLongValue) {
			String Latitute = uIMapTrafficWI.crashEntry.crashEntryMainTab.uIKSLatituteEdit.getAttribute("value");
			String Longitute = uIMapTrafficWI.crashEntry.crashEntryMainTab.uIKSLongitudeEdit.getAttribute("value");
			LatLongValue = Latitute + " / " + Longitute;
		}

		public void selectRoadCharacterHorizontalAlignment() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadCharacterHorizontalAlignmentComboBox);
		}

		public void selectRoadCharacterGrade() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIRoadCharacterGradeComboBox);
		}

		public void selectCrashType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uICrashTypeComboBox);
		}

		public void selectFirstHarmfulEvent() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIFirstHarmfulEventComboBox);
		}

		public void clickDamageToOtherPropertyCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIDamageOtherPropertyCheckBox.click();
		}

		public void enterDamageToOtherProperty() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIDamageToOtherPropertyEdit
					.sendKeys(Randomized.randomString(10));
		}

		public void clickReportableCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIReportableCheckBox.click();
		}

		public void clickTruckBusCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITruckBusCheckBox.click();
		}

		public void clickTruckWith2Axles6TiresCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITruckWith2Axles6TiresCheckBox.click();
		}

		public void clickMedicalTransportCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIMedicalTransportCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void enterTotalInjured() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITotalInjuiredEdit
					.sendKeys(Randomized.randomNumberString(1));
		}

		public void enterTotalKilled() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITotalKilledEdit.sendKeys(Randomized.randomNumberString(1));
		}

		public void enterAtTotalUnit() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITotalUnitEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("TotalUnits"));
		}

		public void enterAtEMSNo() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIEMSNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("EMSNo"));
		}

		public void clickFireCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIFireCheckBox.click();
		}

		public void clickHitAndRunCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIHitAndRunCheckBox.click();
		}

		public void clickGovermentPropertyCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIGovermentPropertyCheckBox.click();
		}

		public void clickTrailerTowedCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITrailerTowedCheckBox.click();
		}

		public void verifyTruckRelatedCheckboxEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITruckWith2Axles6TiresCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITruckWithHazardousPlacardCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIBusCarry16PersonsCheckBox.isEnabled());
		}

		public void verifyFatelMedicalTowedCheckboxEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIFatalInjuryCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIMedicalTransportCheckBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITowedCheckBox.isEnabled());
		}

		public void clickPhotoTakenCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIPhotoTakenCheckBox.click();
		}

		public void clickFatalInjuryCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWIFatalInjuryCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void clickTowedCheckBox() {
			uIMapTrafficWI.crashEntry.crashEntryMainTab.uIWITowedCheckBox.click();
			Playback.controlReadyThreadWait();
		}
	}

	public class WitnessTab {

		public void enterAtLastNameFirstName() {
			uIMapTrafficWI.crashEntry.witnessTab.uILastNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("LastName"));
			uIMapTrafficWI.crashEntry.witnessTab.uIFirstNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("FirstName"));
			uIMapTrafficWI.crashEntry.witnessTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNameID() {
			uIMapTrafficWI.crashEntry.witnessTab.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.crashEntry.witnessTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(2));
			uIMapTrafficWI.crashEntry.witnessTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void clickAddbutton() {
			uIMapTrafficWI.crashEntry.witnessTab.uIAddButton.click();
		}

		public void verifyAcknowledgeUpdateWitnessTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Witness Tab. You must save or reset.");
		}

		public void selectFirstRowGrid(int rowIndex) {
			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabTable, rowIndex);
		}

		public void verifyAtNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabTable,
									PoliceData.getTrafficWIModuleValue("Name"))
							.getText());
		}

		public void verifyWitnessUpdateStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabStatusBar.getText()
					.contains("1003 - Update Successful"));
		}

		public void verifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabTable, "Name", rowIndex));
		}

		public void verifyAtName1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Name1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabTable, "Name", rowIndex));
		}

		public void DeleteAtNameInGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabTable, PoliceData.getTrafficWIModuleValue("Name"));
			popup.confirm.yes();
		}

		public void verifyDeletedRowCountInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabTable) == rowIndex);
		}

		public void verifyAtPhoneInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("PhoneNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.witnessTab.uIWitnessTabTable, "Phone#", rowIndex));
		}
	}

	public class OccupantsTab {

		public void selectAirBag() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.occupantsTab.uIAirBagComboBox);
		}

		public void verifyAcknowledgeUpdateOccupantTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Occupant Tab. You must save or reset.");
		}

		public void verifyAcknowledgeTotalOccupant() {

			if (Playback.browserType == "Chrome") {
				popup.acknowledge
						.okWithExpectedMessage("(10021) Unit No: 1 occupant should not exceed total occupants");
			} else
				popup.acknowledge.okWithExpectedMessage("(10021) Unit#: 1 occupant should not exceed total occupants");
		}

		public void clickAddButton() {
			uIMapTrafficWI.crashEntry.occupantsTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapTrafficWI.crashEntry.occupantsTab.uIClearButton.click();
		}

		public void InternalSave() {
			uIMapTrafficWI.crashEntry.occupantsTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void selectRowByAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashEntry.occupantsTab.uIOccupantsTabResultGrid,
					PoliceData.getTrafficWIModuleValue("Name"));
		}

		public void selectAtUnitNo() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.occupantsTab.uIUnitNoComboBox,
					PoliceData.getTrafficWIModuleValue("Unitno"));
			uIMapTrafficWI.crashEntry.occupantsTab.uIUnitNoComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyAtTotalOccupants() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TotalOccupants"),
					uIMapTrafficWI.crashEntry.occupantsTab.uITotalOccupantsEdit.getAttribute("value"));
		}

		public void enterAtLastName() {
			uIMapTrafficWI.crashEntry.occupantsTab.uILastNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTrafficWI.crashEntry.occupantsTab.uIFirstNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("FirstName"));
			uIMapTrafficWI.crashEntry.occupantsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void clickAddressSameOperatorCheckbox() {
			uIMapTrafficWI.crashEntry.occupantsTab.uIAddressSameOperatorCheckBox.click();
		}

		public void clickAddressSameOwnerCheckbox() {
			uIMapTrafficWI.crashEntry.occupantsTab.uIAddressSameOwnerCheckBox.click();
		}

		public void verifyAddressSameOwnerDisabled() {
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapTrafficWI.crashEntry.occupantsTab.uIAddressSameOwnerCheckBox.getAttribute("disabled")));
		}

		public void verifyAddressSameOperatorDisabled() {
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapTrafficWI.crashEntry.occupantsTab.uIAddressSameOperatorCheckBox.getAttribute("disabled")));
		}

		public void clickMedicalTransportCheckbox() {
			uIMapTrafficWI.crashEntry.occupantsTab.uIMedicalTransportCheckBox.click();
		}

		public void selectAtInjurySeverity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.occupantsTab.uIInjurySeverityComboBox,
					PoliceData.getTrafficWIModuleValue("InjurySeverity"));
		}

		public void verifyAtInjurySeverityUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("InjurySeverity"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.occupantsTab.uIOccupantsTabResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "Injury Severity")
							.getText());
		}

		public void selectSeatPosition() {
			uIMapTrafficWI.crashEntry.occupantsTab.uISeatingPositionLookupButton.click();
			Playback.controlReadyThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtNameID() {
			uIMapTrafficWI.crashEntry.occupantsTab.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.crashEntry.occupantsTab.uINameIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(2));
			uIMapTrafficWI.crashEntry.occupantsTab.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void selectInjurySeverity() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.occupantsTab.uIInjurySeverityComboBox);
		}
	}

	public class TruckBusTab {

		public void enterAtHazmatClass() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIHazMatClassCodeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("HazmatClass"));
			uIMapTrafficWI.crashEntry.truckBusTab.uIHazMatClassCodeEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void enterAtUnitNo() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIUnitNoEdit.sendKeys(PoliceData.getTrafficWIModuleValue("UnitNo"));
			uIMapTrafficWI.crashEntry.truckBusTab.uIUnitNoEdit.sendKeys(Keys.TAB);
		}

		public void selectSource() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.truckBusTab.uISourceComboBox);
			uIMapTrafficWI.crashEntry.truckBusTab.uISourceComboBox.sendKeys(Keys.TAB);
		}

		public void selectCargoBodyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.truckBusTab.uICargoBodyTypeComboBox);
			uIMapTrafficWI.crashEntry.truckBusTab.uICargoBodyTypeComboBox.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIClearButton.click();
		}

		public void InternalSave() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void verifyAcknowledgeUpdateTruckBusTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the TruckBus Tab. You must save or reset.");
		}

		public void enterUSDot() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIUSDOTEdit.sendKeys(Randomized.randomString(5));
		}

		public void enterGVWR() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIGVWREdit.sendKeys(Randomized.randomString(10));
		}

		public void selectVehicleConfiguration() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.truckBusTab.uIVehicleConfigurationComboBox);
		}

		public void enterAtCarrierName() {
			uIMapTrafficWI.crashEntry.truckBusTab.uICarrierNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CarrierName"));
		}

		public void enterAtCarrierAddress() {
			uIMapTrafficWI.crashEntry.truckBusTab.uICarrierAddressEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CarrierAddress"));
			uIMapTrafficWI.crashEntry.truckBusTab.uICarrierAddressVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void enterAtHazmatUNNo() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIHazMatUNNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("HazmatUNNo"));
		}

		public void enterLCNo() {
			uIMapTrafficWI.crashEntry.truckBusTab.uILCNoEdit.sendKeys(Integer.toString(Randomized.getRandomNumbers(4)));
		}

		public void enterAtLCNo() {
			uIMapTrafficWI.crashEntry.truckBusTab.uILCNoEdit.sendKeys(PoliceData.getTrafficWIModuleValue("LCNo"));
		}

		public void enterICCMCNo() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIICCMcNoEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumbers(7)));

		}

		public void clickHazMatPlacardDisplayedCheckBox() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIHazMatPlacardDisplayedCheckBox.click();
		}

		public void clickHazardousCargoReleasedCheckBox() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIHazardousCargoReleasedCheckBox.click();
		}

		public void verifyAtUnitNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("UnitNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.truckBusTab.uITruckBusTabResultGrid, "Vehicle#", rowIndex));
		}

		public void verifyAtHazmatUNNoUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("HazmatUNNo"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.truckBusTab.uITruckBusTabResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "HazMat UN#")
							.getText());
		}

		public void verifyHazmatClassUsingUnitNo(String HazmatClass) {
			verify.ExpectedPropertyValueIsEqual(HazmatClass,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.truckBusTab.uITruckBusTabResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "HazMat Class")
							.getText());
		}

		public void getHazmatClassDescription(String HazmatClass) {
			HazmatClass = uIMapTrafficWI.crashEntry.truckBusTab.uIHazMatClassDescriptionEdit.getAttribute("title");

		}

		public String readHazmatClassDescription() {
			String attribute = uIMapTrafficWI.crashEntry.truckBusTab.uIHazMatClassDescriptionEdit.getAttribute("value");
			System.out.println(attribute);
			return attribute;
		}

		public void verifyAtHazMatClassDescription(String readHazmatClass) {
			// objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapTrafficWI.crashEntry.truckBusTab.uIHazMatClassDescriptionEdit,
			// readHazmatClass);
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridCell(
					uIMapTrafficWI.crashEntry.truckBusTab.uITruckBusTabResultGrid,
					PoliceData.getTrafficWIModuleValue("UnitNo"), "HazMat Class");
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(readHazmatClass));
		}

		public void enterAtICCMCNo() {
			uIMapTrafficWI.crashEntry.truckBusTab.uIICCMcNoEdit.sendKeys(PoliceData.getTrafficWIModuleValue("ICCMNo"));

		}

	}

	public class CrashEntryNarrativeTab {

		public void enterNarrativeComments() {
			uIMapTrafficWI.crashEntry.crashEntryNarrativeTab.uICommentsRichTextEdit.click();
			Playback.controlReadyThreadWait();
			objectIdentification.actionBuilder
					.MoveToElement(uIMapTrafficWI.crashEntry.crashEntryNarrativeTab.uICommentsRichTextEdit);
			objectIdentification.actionBuilder.SendKeys(Randomized.randomString(200));
			Playback.controlReadyThreadWait();

			uIMapTrafficWI.crashEntry.crashEntryNarrativeTab.uICommentsRichTextEdit.sendKeys(Keys.ENTER);
			uIMapTrafficWI.crashEntry.crashEntryNarrativeTab.uICommentsRichTextEdit
					.sendKeys(Randomized.randomString(500));
			Playback.controlReadyThreadWait();
		}

		public void InternalSave() {
			uIMapTrafficWI.crashEntry.crashEntryNarrativeTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void verifyAcknowledgeUpdateNarrativeTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
		}

		public void selectCargoBodyTypeAs88Other() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.truckBusTab.uICargoBodyTypeComboBox, "88 - Other");
		}

	}

	public class CrashEntryApprovalTab {

		public void verifySaveButtonDisabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uISaveButton
					.getAttribute("class").contains("DisabledImgMnuItem"));
		}

		public void verifySaveButtonEnabled() {
			verify.ExpectedValueIsTrue(

					uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uISaveButton.isEnabled());
		}

		public void verifyNewActionDisabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uINewActionComboBox
					.getAttribute("disabled") == "true");
		}

		public void verifyNewActionEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uINewActionComboBox.isEnabled());
		}

		public void verifyDateTimeDisabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uIDateEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uITimeEdit.getAttribute("class")
					.contains("textboxInactivedatetime"));
		}

		public void verifyDateTimeEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uIDateEdit.getAttribute("class")
					.contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uITimeEdit.getAttribute("class")
					.contains("textboxdatetime "));
		}

		public void selectAtNewAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uINewActionComboBox,
					PoliceData.getTrafficWIModuleValue("NewAction"));
		}

		public void tabThroughDateTime() {
			uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void selectRejectionCode() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uIRejectionCodeComboBox);
		}

		public void selectActionAsSendForApproval() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uINewActionComboBox, "Send for Approval");
		}

		public void selectActionAsApprove() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uINewActionComboBox, "Approve");
		}

		public void selectActionAsLock() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uINewActionComboBox, "Lock");
		}

		public void verifyCurrentDateAutopopulatesInDateField() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uIDateEdit.getAttribute("value"));
		}

		public void enterAtSupervisor() {
			uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uISupervisorCodeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Supervisor"));
		}

		public void save() {
			uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyRejectCountAs1() {
			verify.ExpectedPropertyValueIsEqual("1",
					uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uIRejectCountTextView.getText());
		}

	}

	public class ConclusionTab {

		public void select1stHarmfulEvent() {
			uIMapTrafficWI.crashEntry.conclusionTab.uI1stHarmfulEventLookupButton.click();
			Playback.controlReadyThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectSpecialStudy() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.conclusionTab.uISpecialStudyComboBox);
			uIMapTrafficWI.crashEntry.conclusionTab.uISpecialStudyComboBox.sendKeys(Keys.TAB);
		}

		public void selectCollisionManner() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.conclusionTab.uICollisionMannerComboBox);
			uIMapTrafficWI.crashEntry.conclusionTab.uICollisionMannerComboBox.sendKeys(Keys.TAB);
		}

		public void selectTrafficWay() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.conclusionTab.uITrafficWayComboBox);
			uIMapTrafficWI.crashEntry.conclusionTab.uITrafficWayComboBox.sendKeys(Keys.TAB);
		}

		public void selectRoadSurfaceCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.conclusionTab.uIRoadSurfaceConditionComboBox);
			uIMapTrafficWI.crashEntry.conclusionTab.uIRoadSurfaceConditionComboBox.sendKeys(Keys.TAB);
		}

		public void selectWeather() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.conclusionTab.uIWeatherComboBox);
			uIMapTrafficWI.crashEntry.conclusionTab.uIWeatherComboBox.sendKeys(Keys.TAB);
		}

		public void selectAccessControl() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.conclusionTab.uIAccessControlComboBox);
			uIMapTrafficWI.crashEntry.conclusionTab.uIAccessControlComboBox.sendKeys(Keys.TAB);
		}

	}

	public class AccidentTab {

		public void enterAtCounty() {
			uIMapTrafficWI.crashEntry.accidentTab.uICountyCodeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("County"));
			uIMapTrafficWI.crashEntry.accidentTab.uICountyCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyMunicipalityCodeEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.accidentTab.uIMunicipalityCodeEdit.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.accidentTab.uIMunicipalityCodeEdit
					.getAttribute("class").contains("textbox"));
		}

		public void enterAtMunicipality() {
			uIMapTrafficWI.crashEntry.accidentTab.uIMunicipalityCodeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Municipality"));
			uIMapTrafficWI.crashEntry.accidentTab.uIMunicipalityCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterOnHwyNo() {
			uIMapTrafficWI.crashEntry.accidentTab.uIOnHwyNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAtOnStreet() {
			uIMapTrafficWI.crashEntry.accidentTab.uIOnStreetEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("OnStreet"));
			uIMapTrafficWI.crashEntry.accidentTab.uIOnStreetVerifyCheckbox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectOnHwyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.accidentTab.uIOnHwyTypeComboBox);
			uIMapTrafficWI.crashEntry.accidentTab.uIOnHwyTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectAccidentLocationComboBox() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.accidentTab.uIAccidentLocationComboBox);
			uIMapTrafficWI.crashEntry.accidentTab.uIAccidentLocationComboBox.sendKeys(Keys.TAB);
		}

		public void enterStructureNo() {
			uIMapTrafficWI.crashEntry.accidentTab.uIStructureNoEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterAtFromAlterStreetName() {
			uIMapTrafficWI.crashEntry.accidentTab.uIFromAlterStreetNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("FrmStreetName"));
			uIMapTrafficWI.crashEntry.accidentTab.uIFromAlterStreetNameVerifyCheckbox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAgencySpace() {
			uIMapTrafficWI.crashEntry.accidentTab.uIAgencySpaceEdit.sendKeys(Randomized.randomString(200));
		}

	}

	public class CrashEntryUnitTab {

		public void enterAtUnitNo() {
			uIMapTrafficWI.crashEntry.crashEntryUnitTab.uIUnitNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("UnitNo"));
		}

		public void clickAdd() {
			uIMapTrafficWI.crashEntry.crashEntryUnitTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
			// popUp.confirm.yes();
		}

		public void InternalSave() {
			uIMapTrafficWI.crashEntry.crashEntryUnitTab.uISaveButton.click();
			Playback.controlReadyThreadWait();
			// popUp.confirm.yes();
		}

		public void verifyTotalOccupantsInGridUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TotalOccupants"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.crashEntryUnitTab.uIUnitTabResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "Total Occ")
							.getText());
		}

		public void verifyAtUnitNoInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("UnitNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.crashEntryUnitTab.uIUnitTabResultGrid, "Unit#", rowCount));
		}

		public void verifyVehicleInGridUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Vehicle"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.crashEntryUnitTab.uIUnitTabResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "Veh#")
							.getText());
		}

	}

	public class CrashEntryTrailerTab {

		public void enterAtTrailerUnitNo() {
			uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uITrailerUnitNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("TrailerUnitNo"));
		}

		public void enterAtVehicle() {
			uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIVehicleEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Vehicle"));
		}

		public void selectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIStateComboBox,
					PoliceData.getTrafficWIModuleValue("State"));
			uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIStateComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectUnitType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIUnitTypeComboBox);
			uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIUnitTypeComboBox.sendKeys(Keys.TAB);
		}

		public void clickAdd() {
			uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void InternalSave() {
			uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void verifyAtUnitNoInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("UnitNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uITrailerTabResultGrid, "Unit#", rowCount));
		}

		public void verifyAtVehicleInGridUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Vehicle"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uITrailerTabResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "Veh#")
							.getText());
		}

		public void clickAtUnitNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uITrailerTabResultGrid,
					PoliceData.getTrafficWIModuleValue("UnitNo"));
		}

		public void selectAtUnitType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIUnitTypeComboBox,
					PoliceData.getTrafficWIModuleValue("UnitType"));
			uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uIUnitTypeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtUnitTypeInGridUsingUnitNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("UnitType"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.crashEntryTrailerTab.uITrailerTabResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "Unit Type")
							.getText());
		}

	}

	public class PropertyOwnerTab {

		public void enterAtNameID() {
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIOwnerNameTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIOwnerNameIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(2));
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIOwnerNameIDEdit.sendKeys(Keys.TAB);
		}

		public void selectAtPropertyType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyTypeComboBox,
					PoliceData.getTrafficWIModuleValue("PropertyType"));
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtDamageTagNo() {
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIDamageTagNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("TagNo"));
		}

		public void clickAdd() {
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIAddButton.click();
			Playback.pageLoadThreadWait();
		}

		public void clickStruckObject() {
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIStruckObjectButton.click();
			Playback.pageLoadThreadWait();
		}

		public void verifyStruckObjectDisabled() {
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapTrafficWI.crashEntry.propertyOwnerTab.uIStruckObjectButton.getAttribute("disabled")));
		}

		public void verifyStruckObjectEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashEntry.propertyOwnerTab.uIStruckObjectButton.isEnabled());
		}

		public void verifyAtTagNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TagNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyOwnerTabResultGrid, "Tag#", rowIndex));
		}

		public void verifyAtPropertyTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("PropertyType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyOwnerTabResultGrid, "Property Type",
							rowIndex));
		}

		public void verifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyOwnerTabResultGrid, "Name", rowIndex));
		}

		public void clickAtPropertyTypeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyOwnerTabResultGrid,
					PoliceData.getTrafficWIModuleValue("PropertyType"));
			Playback.controlReadyThreadWait();
		}

		public void verifyStruckObjectsUsingNameInGrid(String struckObject) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(struckObject,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyOwnerTabResultGrid,
									PoliceData.getTrafficWIModuleValue("Name"), "Struck Objects")
							.getText());
		}

		public void clickAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyOwnerTabResultGrid,
					PoliceData.getTrafficWIModuleValue("Name"));
			Playback.controlReadyThreadWait();
		}

		public void enterDamageTagNo() {
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIDamageTagNoEdit.sendKeys(randomized.randomNumberString(5));
		}

		public void selectPropertyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyTypeComboBox);
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIPropertyTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectOrgType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.propertyOwnerTab.uIOrgTypeComboBox);
			uIMapTrafficWI.crashEntry.propertyOwnerTab.uIOrgTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}
	}

	public class CrashEntryCommentsTab {

		public void verifyDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTrafficWI.crashEntry.crashEntryCommentsTab.uIDateEdit.getAttribute("value"));
		}

		public void enterAtSubject() {
			uIMapTrafficWI.crashEntry.crashEntryCommentsTab.uISubjectEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Subject"));
		}

		public void clickEnterComments() {
			uIMapTrafficWI.crashEntry.crashEntryCommentsTab.uIEnterCommentsButton.click();
			popup.confirm.yes();
		}

		public void verifyAtPFCode(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("PFCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.crashEntryCommentsTab.uICommentsTabResultGrid, "PF Code",
							rowIndex));
		}

		public void verifyAtSubject(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Subject"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashEntry.crashEntryCommentsTab.uICommentsTabResultGrid, "Subject",
							rowIndex));
			Playback.waitForControlReady();
		}

	}

	public class CrashEntryMapTab {

		public void verifyCrashNoAppears(String CrashNoDetails) {
			verify.ExpectedPropertyValueIsEqual(CrashNoDetails,
					uIMapTrafficWI.citationEntry.citationEntryMapTab.uICENoTextView.getText());
		}

		public void verifyLatLongValue(String LatLongValue) {
			verify.ExpectedPropertyValueIsEqual(LatLongValue,
					uIMapTrafficWI.citationEntry.citationEntryMapTab.uILatLongValueTextView.getText());
		}

		public void verifyUpdateLatLongButtonDisabled() {
			verify.ExpectedValueIsTrue(!uIMapTrafficWI.crashEntry.crashEntryMapTab.uIUpdateLatLongButton.isEnabled());
		}

		public void clickResetButton() {
			uIMapTrafficWI.crashEntry.crashEntryMapTab.uIResetButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyLatLongValueAs0() {
			verify.ExpectedPropertyValueIsEqual("0.000000000000 / 0.000000000000",
					uIMapTrafficWI.citationEntry.citationEntryMapTab.uILatLongValue0TextView.getText());
		}

		public void DragandDropMapLocationIcon() {

			objectIdentification.actionBuilder
					.DragAndDropBy(uIMapTrafficWI.citationEntry.citationEntryMapTab.uIMapLocationIconButton, 52, 65);

			Playback.gridLoadThreadWait();
		}

		public void clickUpdateLatLongButton() {
			uIMapTrafficWI.crashEntry.crashEntryMapTab.uIUpdateLatLongButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyGeoOverwriteConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
			} else
				popup.confirm
						.yesWithExpectedMessage("(5115) Master Geo already has Lat/Long. Do you want to overwrite?");
		}

		public void verifyUpdateLatLongConfirmMessage() {
			if (Playback.browserType == "Chrome") {
				popup.confirm.yes();
			} else {
				String warningMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(warningMessage
						.contains("(5102) Are you sure you want to update the Latitude and Longitude to"));
				popup.confirm.yes();
			}
			// popUp.confirm.yesWithExpectedMessage("(5102) Are you sure you want to update
			// the Latitude and Longitude to 40.922861567710406 / -73.08271639468995 ?");
		}

		public void verifyAyCrashNoAppears() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CrashNo"),
					uIMapTrafficWI.citationEntry.citationEntryMapTab.uICENoTextView.getText());
		}

		public void verifyAtActiveLatLong(String readLatLong) {
			String attribute = uIMapTrafficWI.crashEntry.crashEntryMapTab.uILatLongValueTextView.getText();
			verify.ExpectedValueIsTrue(attribute.contains(readLatLong));
		}

	}

	public class CrashComments {

		public void enterRichText() {
			// uIMapTrafficWI.crashComments.uICommentsRichTextEdit.click();

			objectIdentification.actionBuilder.MoveToElement(uIMapTrafficWI.crashComments.uICommentsRichTextEdit);
			objectIdentification.actionBuilder.SendKeys(Randomized.randomString(200));
			Playback.controlReadyThreadWait();

			// uIMapTrafficWI.crashComments.uICommentsRichTextEdit.sendKeys(Keys.ENTER);
			// uIMapTrafficWI.crashComments.uICommentsRichTextEdit.sendKeys("The
			// Phoenix software’s advanced architecture and design help us in achieving the
			// industry paradigm shift we seek to provide outstanding service to our clients
			// and maintain 100% client satisfaction. Additionally, our pricing philosophy
			// includes both Perpetual Licensing and Software as a Service (SaaS) options as
			// part of our efforts to offer a higher return on investment.");
		}

		public void saveAndCloseScreen() {
			uIMapTrafficWI.crashComments.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void saveScreen() {
			uIMapTrafficWI.crashComments.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyAdditionSuccessful() {
			Playback.waitForPageLoad();
			String AdditionMessage = uIMapTrafficWI.crashComments.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
		}

	}

	public class CrashSearch {

		public void selectJurisAsSO() {
			new Select(uIMapTrafficWI.crashSearch.uIJurisComboBox)
					.selectByVisibleText("SO - Prophoenix Police Department");
			Playback.pageLoadThreadWait();
		}

		public void selectJurisAsBE() {
			new Select(uIMapTrafficWI.crashSearch.uIJurisComboBox)
					.selectByVisibleText("BE - Prophoenix Police Department");
			Playback.pageLoadThreadWait();
		}

		public void selectJurisAsBL() {
			new Select(uIMapTrafficWI.crashSearch.uIJurisComboBox)
					.selectByVisibleText("BL - Big lake Police Department");
			Playback.pageLoadThreadWait();
		}

		public void clickAddNew() {
			uIMapTrafficWI.crashSearch.uIAddNewButton.click();
		}

		public void selectCrashLocationAsIntersection() {
			new Select(uIMapTrafficWI.crashSearch.uICrashLocationComboBox).selectByVisibleText("Intersection");
			uIMapTrafficWI.crashSearch.uICrashLocationComboBox.sendKeys(Keys.TAB);
		}

		public void selectAddressAsIntersection() {
			new Select(uIMapTrafficWI.crashSearch.uIAddressComboBox).selectByVisibleText("Intersection");
			uIMapTrafficWI.crashSearch.uIAddressComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtStreet2() {
			uIMapTrafficWI.crashSearch.uIIntersectionStreet2Edit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Street2"));
			uIMapTrafficWI.crashSearch.uIIntersectionStreet2Edit.sendKeys(Keys.TAB);
		}

		public void enterAtStreet1() {
			Playback.waitForControlReady();
			uIMapTrafficWI.crashSearch.uIIntersectionStreet1Edit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Street1"));
			uIMapTrafficWI.crashSearch.uIIntersectionStreet1Edit.sendKeys(Keys.TAB);
		}

		public void enterAtStreet2InStreet1Field() {
			uIMapTrafficWI.crashSearch.uIIntersectionStreet2Edit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Street2"));
			uIMapTrafficWI.crashSearch.uIIntersectionStreet1Edit.sendKeys(Keys.TAB);
		}

		public void clickSearch() {
			uIMapTrafficWI.crashSearch.uISearchButton.click();
		}

		public void clickBackButton() {
			uIMapTrafficWI.crashSearch.uIBackButton.click();
		}

		public void clickReset() {
			uIMapTrafficWI.crashSearch.uIResetButton.click();
		}

		public void enterAtCrashNo() {
			uIMapTrafficWI.crashSearch.uICrashYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CrashNo").substring(0, 2));
			uIMapTrafficWI.crashSearch.uICrashNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CrashNo").substring(3));
			uIMapTrafficWI.crashSearch.uICrashNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCrashNo1() {
			uIMapTrafficWI.crashSearch.uICrashYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CrashNo1").substring(0, 2));
			uIMapTrafficWI.crashSearch.uICrashNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CrashNo1").substring(3));
			uIMapTrafficWI.crashSearch.uICrashNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCase1() {
			uIMapTrafficWI.crashSearch.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Case1").substring(0, 2));
			uIMapTrafficWI.crashSearch.uICaseNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Case1").substring(3));
			uIMapTrafficWI.crashSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNo() {
			uIMapTrafficWI.crashSearch.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo").substring(0, 2));
			uIMapTrafficWI.crashSearch.uICaseNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo").substring(3));
			uIMapTrafficWI.crashSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickCaseInfoIcon() {
			uIMapTrafficWI.crashSearch.uICaseDetailsInfoButton.click();
		}

		public void enterAtOfficer() {
			uIMapTrafficWI.crashSearch.uIOfficerEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Officer"));
			uIMapTrafficWI.crashSearch.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void enterAtOfficerCode() {
			uIMapTrafficWI.crashSearch.uIOfficerCodeEdit.sendKeys(PoliceData.getTrafficWIModuleValue("OfficerCode"));
			uIMapTrafficWI.crashSearch.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtKSOfficer() {
			uIMapTrafficWI.crashSearch.uIKSOfficerCodeEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Officer"));
			uIMapTrafficWI.crashSearch.uIKSOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickInjuredCheckBox() {
			uIMapTrafficWI.crashSearch.uIInjuredCheckBox.click();
		}

		public void enterCrossRoadName() {
			uIMapTrafficWI.crashSearch.uICrossRoadNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CrossRoadName"));
			uIMapTrafficWI.crashSearch.uICrossRoadNameVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void clickRowAtCaseNoByAtCrash() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficWIModuleValue("CaseNo"));
		}

		public void clickRowAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CaseNo"));
		}

		public void clickRowByAtCrash() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
		}

		public void clickRowByAtCrashNo1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo1"));
		}

		public void selectRowByAtOfficer() {
			Playback.gridLoadThreadWait();
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficWIModuleValue("Officer"));
		}

		public void selectRowByAtApprovalStatus() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficWIModuleValue("ApprovalStatus"));
		}

		public void selectRowByAtAccidentLocation() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(row,
					PoliceData.getTrafficWIModuleValue("AccidentLocation"));

		}

		public void verifyTotalUnitAs0() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual("0", objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Total Unit").getText());
		}

		public void verifyTotalUnitAs1() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo1"));
			verify.ExpectedPropertyValueIsEqual("1", objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Total Unit").getText());
		}

		public void selectRowByAtUnit() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			WebElement location = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Total Unit");
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(location,
					PoliceData.getTrafficWIModuleValue("Unit"));

		}

		public void selectRowByAtCrash() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));

		}

		public void selectRowByAtCrashNo1() {
			Playback.waitForPageLoad();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo1"));

		}

		public void selectAtApprovalStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.crashSearch.uIKSApprovalStatusComboBox,
					PoliceData.getTrafficWIModuleValue("ApprovalStatus"));

		}

		public void selectCrashLocationAsAddress() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.crashSearch.uICrashLocationComboBox,
					"Address");
		}

		public void enterAtPremise() {
			uIMapTrafficWI.crashSearch.uICrashLocationPremiseEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Premise"));
		}

		public void enterAtStreet() {
			uIMapTrafficWI.crashSearch.uICrashLocationStreetEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Street"));
		}

		public void selectRow() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid);
		}

		public void clickApprovedCheckBox() {
			uIMapTrafficWI.crashSearch.uIApprovalCheckBox.click();
		}

		public void verifyAtCaseNo(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Case#", rowIndex));
		}

		public void verifyAtCaseNoByAtCrashNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Case#").getText());
		}

		public void verifyApprovedStatusAsApprovedByAtCrash() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual("Approved", objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Approval Status").getText());
		}

		public void verifyAtCase1() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo1"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Case1"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Case#").getText());
		}

		public void verifyAtOfficerByAtCrashNo1() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo1"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Officer"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Officer").getText());
		}

		public void verifyAtOfficerByAtCrash() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CrashNo"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Officer"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, row, "Officer").getText());
		}

		public void verifyAtOfficer(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Officer"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Officer", rowIndex)
							.getText());
		}

		public void verifyAtApprovalStatus(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Approval Status", rowIndex));
		}

		public void verifyAtAddress(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Address"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Location", rowIndex));
		}

		public void verifyAtCrash(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CrashNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Crash#", rowIndex));
		}

		public void verifyAsCR(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("I", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "CR", rowIndex));
		}

		public void verifyAcknowledgeNoRecord() {

			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");

		}

		public void clickFatalCheckBox() {
			uIMapTrafficWI.crashSearch.uIFatalCheckBox.click();

		}

		public void clickRefreshButton() {
			uIMapTrafficWI.crashSearch.uIRefreshButton.click();
		}

		public void enterAtKSPlateNo() {
			uIMapTrafficWI.crashSearch.uIKSPlateEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("PlateNo").substring(0, 6));
			uIMapTrafficWI.crashSearch.uIKSStateComboBox
					.sendKeys(PoliceData.getTrafficWIModuleValue("PlateNo").substring(7));
			uIMapTrafficWI.crashSearch.uIKSStateComboBox.sendKeys(Keys.TAB);

		}

		public void enterAtNameLast() {
			uIMapTrafficWI.crashSearch.uIKSLastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("NameLast"));
		}

		public void enterAtNameFirst() {
			uIMapTrafficWI.crashSearch.uIKSFirstNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("NameFirst"));
		}

		public void verifySOJurisRecords() {
			List<String> juris = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Juris");
			for (String value : juris)
				verify.ExpectedPropertyValueIsEqual(value, "");
		}

		public void verifyBEJurisRecords() {
			List<String> juris = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Juris");
			for (String value : juris)
				verify.ExpectedPropertyValueIsEqual(value, "BE");
		}

		public void verifyBLJurisRecords() {
			List<String> juris = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Juris");
			for (String value : juris)
				verify.ExpectedPropertyValueIsEqual(value, "BL");
		}

		public void clickNonReportableCheckBox() {
			uIMapTrafficWI.crashSearch.uINonReportableCheckBox.click();

		}

		public void clickReportableCheckBox() {
			uIMapTrafficWI.crashSearch.uIReportableCheckBox.click();

		}

		public void verifyCRAsCInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("C", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "CR", rowIndex));
		}

		public void verifyCrashNoInGrid(String CrashNoDetails, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(CrashNoDetails, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Crash#", rowIndex));
		}

		public void verifyCRAsIInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("I", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "CR", rowIndex));
		}

		public void enterAtTracsRefNo() {
			uIMapTrafficWI.crashSearch.uITracsYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(0, 2));
			uIMapTrafficWI.crashSearch.uITracsNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(3));
			uIMapTrafficWI.crashSearch.uITracsNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickPrint() {
			uIMapTrafficWI.crashSearch.uIPrintIconButton.click();
		}

		public void enterAtDOTNo() {
			uIMapTrafficWI.crashSearch.uIDOTNoEdit.sendKeys(PoliceData.getTrafficWIModuleValue("DOTNo"));
		}

		public void enterAtAccidentNo() {
			uIMapTrafficWI.crashSearch.uIAccidentNoEdit.sendKeys(PoliceData.getTrafficWIModuleValue("AccidentNo"));
		}

		public void selectCrashTypeAsDeerCrash() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.crashSearch.uICrashTypeComboBox,
					"Deer Crash");
		}

		public void verifyCrashTypeAsDInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("D", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Crash Type", rowIndex));
		}

		public void verifyCrashTypeAsCInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("C", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.crashSearch.uICrashSearchResultGrid, "Crash Type", rowIndex));
		}

		public void enterAtAddress() {
			uIMapTrafficWI.crashSearch.uIAddressEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Address"));
			uIMapTrafficWI.crashSearch.uIAddressVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void selectApprovalStatusAsApproved() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.crashSearch.uIApprovalStatusComboBox, "Approved");
		}

	}

	public class CrashSearchHelpWindow {

		public void verifyAtCaseNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.crashSearchHelpWindow.uICrashSearchResultGrid, "Case#", rowIndex));
		}

		public void verifyCrashNoUsingCaseNo(String TracsRefNo) {
			verify.ExpectedPropertyValueIsEqual(TracsRefNo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.crashSearchHelpWindow.uICrashSearchResultGrid,
									PoliceData.getTrafficWIModuleValue("CaseNo"), "Crash#")
							.getText());
		}

		public void verifyBackButtonDisabled() {
			verify.ExpectedValueIsFalse(uIMapTrafficWI.crashSearchHelpWindow.uIBackButton.isSelected());
		}

		public void verifyResetButtonDisabled() {
			verify.ExpectedValueIsFalse(uIMapTrafficWI.crashSearchHelpWindow.uIResetButton.isSelected());
		}

		public void verifyAddNewButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.crashSearchHelpWindow.uIAddNewButton.isEnabled());
		}

		public void verifyAtActiveCaseNoInGrid(String Case) {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapTrafficWI.crashSearchHelpWindow.uICrashSearchResultGrid, "Crash#");

			for (String values : gridTableColumnValues) {
				if (values.contains(Case)) {
					verify.ExpectedValueIsTrue(values.contains(Case));
				}

			}
		}

		public void clickAddNew() {
			uIMapTrafficWI.crashSearchHelpWindow.uIAddNewButton.click();

		}

		public void closeTheScreen() {

			uIMapTrafficWI.crashSearchHelpWindow.driver.close();
		}
			public void verifyAtApprovalStatusInGrid() {																										// Added by Abi
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.crashSearchHelpWindow.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("ApprovalStatus"));
			verify.ExpectedValueIsTrue(gridCell.getText().contains(PoliceData.getTrafficWIModuleValue("ApprovalStatus")));
		}

		public void clickAtCaseNoInGrid() {																													// Added by Abi
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTrafficWI.crashSearchHelpWindow.uICrashSearchResultGrid, PoliceData.getTrafficWIModuleValue("CaseNo"));

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
			uIMapTrafficWI.deerCrash.uIReportedLocationEdit.sendKeys("b");
			uIMapTrafficWI.deerCrash.uIReportedLocationEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.deerCrash.uIReportedLocationVerifyCheckBox.sendKeys(Keys.TAB);
			// Geo.CommonNameHelp.SelectCommonName();
		}

		public void enterDotNo() {
			uIMapTrafficWI.deerCrash.uIDotNumberEdit.sendKeys(Randomized.randomNumberString(4));
		}

		public void enterAtOfficer() {
			uIMapTrafficWI.deerCrash.uIOfficerEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Officer"));
			uIMapTrafficWI.deerCrash.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void selectRandomOfficer() {
			uIMapTrafficWI.deerCrash.uIOfficerLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void tabDateAndTime() {
			uIMapTrafficWI.deerCrash.uIDateEdit.click();
			uIMapTrafficWI.deerCrash.uIDateEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.deerCrash.uITimeEdit.click();
			uIMapTrafficWI.deerCrash.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void clickAccidentTab() {
			uIMapTrafficWI.deerCrash.uIAccidentTab.click();
		}

		public void clickDriverTab() {
			uIMapTrafficWI.deerCrash.uIDriverTab.click();
		}

		public void enterAtDotNo() {
			uIMapTrafficWI.deerCrash.uIDotNumberEdit.sendKeys(PoliceData.getTrafficWIModuleValue("DotNo"));
		}

		public void enterAtAccidentNo() {
			uIMapTrafficWI.deerCrash.uIDotNumberEdit.sendKeys(PoliceData.getTrafficWIModuleValue("AccidentNo"));
		}

		public void enterAtReportedLocation() {
			uIMapTrafficWI.deerCrash.uIReportedLocationEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("ReportedLocation"));
			uIMapTrafficWI.deerCrash.uIReportedLocationEdit.sendKeys(Keys.TAB);
		}

		public void clickSave() {
			uIMapTrafficWI.deerCrash.uISaveButton.click();
		}

		public void saveScreen() {
			Playback.controlReadyThreadWait();

			objectIdentification.actionBuilder.DoubleClick(uIMapTrafficWI.deerCrash.uISaveButton);

			// uIMapTrafficWI.deerCrash.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verify1018RequiredEntriesAreMissingAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void switchToNarrativeTab() {
			uIMapTrafficWI.deerCrash.uINarrativeTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
		}

		public void verifyAcknoledgeUpdateNarrativeTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
		}

		public void clickAllTabs() {
			uIMapTrafficWI.deerCrash.uIAccidentTab.click();
			uIMapTrafficWI.deerCrash.uIDriverTab.click();
			uIMapTrafficWI.deerCrash.uINarrativeTab.click();
			uIMapTrafficWI.deerCrash.uIAttachmentTab.click();
			uIMapTrafficWI.deerCrash.uIMapTab.click();
		}

		public void verifyAtTracsRefNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(0, 2),
					uIMapTrafficWI.deerCrash.uITracsRefYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(3),
					uIMapTrafficWI.deerCrash.uITracsRefNumberEdit.getAttribute("value"));
		}

		public void clickDeleteIcon() {
			uIMapTrafficWI.deerCrash.uIDeleteButton.click();
		}

		public void verifyDeleteConfirmMrssage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType == "Chrome") {
				popup.confirm.yes();
			} else {
				popup.switchToConfirm();
				String ConfirmMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(ConfirmMessage.contains("(10090)"));
				verify.ExpectedValueIsTrue(ConfirmMessage.contains("CAUTION"));
				verify.ExpectedValueIsTrue(
						ConfirmMessage.contains("This record will be permanently deleted. Do you wish to proceed?"));
				popup.confirm.yes();
			}
		}

		public void verify1002AdditionalSuccessfulAckMsg() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType == "Chrome") {
				popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1002 - Addition Successful");
			Playback.waitForPageLoad();
		}

		public void enterAtCaseNo() {
			uIMapTrafficWI.deerCrash.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(0, 2));
			uIMapTrafficWI.deerCrash.uICaseNumberEdit.sendKeys(PoliceData.getTrafficModuleValue("CaseNo").substring(3));
			uIMapTrafficWI.deerCrash.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtCallNo() {
			String attribute = uIMapTrafficWI.deerCrash.uICallYearEdit.getAttribute("value");
			String attribute2 = uIMapTrafficWI.deerCrash.uICallNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getTrafficModuleValue("CallNo").substring(0, 1)));
			verify.ExpectedValueIsTrue(attribute2.contains(PoliceData.getTrafficModuleValue("CallNo").substring(4)));
		}

		public void verifyAtReportedLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ReportedLocation"),
					uIMapTrafficWI.deerCrash.uIReportedLocationEdit.getAttribute("value"));
		}

		public void clickCallNoInfoIcon() {
			uIMapTrafficWI.deerCrash.uICallNoInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void verify1002AdditionSuccessfulAcwkMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
		}

	}

	public class DeerCrashAccidentTab {

		public void selectRandomFirstHarmfulEvent() {
			uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uI1stHarmEventLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectAccidentLocation() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIAccidentLocationComboBox);
		}

		public void selectRandomCounty() {
			uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uICountryLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterHwyNoAsNH() {
			uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIOnHwyNumberEdit.sendKeys("NH1");
		}

		public void enterAtOnStreet() {
			uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIOnStreetEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Onstreet"));
			uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIOnStreetEdit.sendKeys(Keys.TAB);
		}

		public void selectOnHwyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIOnHwyTypeComboBox);
			uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIOnHwyTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectFromHwyType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIFromHwyTypeComboBox);
			uIMapTrafficWI.deerCrash.deerCrashAccidentTab.uIFromHwyTypeComboBox.sendKeys(Keys.TAB);
		}

	}

	public class DriverTab {

		public void selectSpeedLimit() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uISpeedLimitComboBox);
		}

		public void selectOnDutyAccident() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIOnDutyComboBox);
		}

		public void selectUnitStatus() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIUnitStatusComboBox);
		}

		public void selectUnitType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIUnitTypeComboBox);
		}

		public void selectEjected() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIEjectedComboBox);
		}

		public void selectDirectionofTravel() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIDriverTravelComboBox);
		}

		public void selectOperatingDLClass() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIOperatorDLClassComboBox);
		}

		public void selectOperatingDLEndrs() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIOperatorDLEndrsComboBox);
		}

		public void selectInjurySeverity() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIInjurySeverityComboBox);
		}

		public void selectAirBag() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIAirBagComboBox);
		}

		public void selectVehicleDamage() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIVehicleDamageComboBox);
			uIMapTrafficWI.deerCrash.driverTab.uIVehicleDamageComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectExtentofDamage() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.deerCrash.driverTab.uIExtentofDamageComboBox);
		}

		public void selectRandomVehicle() {
			uIMapTrafficWI.deerCrash.driverTab.uIVehicleNumberEdit.sendKeys("T1");
			uIMapTrafficWI.deerCrash.driverTab.uIVehicleLookupButton.click();
			// Vehicle.VehicleBoatSearchHelpWindow.SelectVehicle();
		}

		public void enterAtLastName() {
			uIMapTrafficWI.deerCrash.driverTab.uILastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTrafficWI.deerCrash.driverTab.uIFirstNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("FirstName"));
			uIMapTrafficWI.deerCrash.driverTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterVehicle() {
			uIMapTrafficWI.deerCrash.driverTab.uIVehicleNumberEdit.sendKeys("85");
			uIMapTrafficWI.deerCrash.driverTab.uIVehicleNumberEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.deerCrash.driverTab.uIVehicleLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtNameID() {
			uIMapTrafficWI.deerCrash.driverTab.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.deerCrash.driverTab.uINameTypeEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.deerCrash.driverTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getTrafficModuleValue("NameID").substring(2));
			uIMapTrafficWI.deerCrash.driverTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}
	}

	public class DeerCrashNarrativeTab {

		public void saveInternalTab() {
			uIMapTrafficWI.deerCrash.deerCrashNarrativeTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void enterRichText() {
			uIMapTrafficWI.deerCrash.deerCrashNarrativeTab.uINarrativeRichTextEdit.sendKeys(Keys.ENTER);
			uIMapTrafficWI.deerCrash.deerCrashNarrativeTab.uINarrativeRichTextEdit.click();
			uIMapTrafficWI.deerCrash.deerCrashNarrativeTab.uINarrativeRichTextEdit
					.sendKeys(Randomized.randomString(150));
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
		public AttachmentsTab attachmentsTab;
		public CitationEntryApprovalTab citationEntryApprovalTab;

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

			if (attachmentsTab == null)
				attachmentsTab = objectIdentification.new AttachmentsTab();

			if (citationEntryApprovalTab == null)
				citationEntryApprovalTab = new CitationEntryApprovalTab();
		}

		public void selectCETypeAsHandSummon() {
			uIMapTrafficWI.citationEntry.uICETypeComboBox.sendKeys("Hand Summons");
		}

		public void selectAtCEType() {
			uIMapTrafficWI.citationEntry.uICETypeComboBox.sendKeys(PoliceData.getTrafficWIModuleValue("CEType"));
			uIMapTrafficWI.citationEntry.uICETypeComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtCallNo() {
			uIMapTrafficWI.citationEntry.uICallYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CallNo").substring(0, 2));
			uIMapTrafficWI.citationEntry.uICallNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CallNo").substring(3));
			uIMapTrafficWI.citationEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void selectCETypeAsTrafficViolation() {
			uIMapTrafficWI.citationEntry.uICETypeComboBox.sendKeys("Traffic Violation");
		}

		public void selectCETypeAsNonTrafficViolation() {
			uIMapTrafficWI.citationEntry.uICETypeComboBox.sendKeys("Non-Traffic Violation");
		}

		public void verifyCENoFieldNotEmpty() {
			verify.ExpectedValueIsFalse(uIMapTrafficWI.citationEntry.uICENoEdit == null);
		}

		public void enterDate() {
			uIMapTrafficWI.citationEntry.uIDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterTime() {
			uIMapTrafficWI.citationEntry.uITimeEdit.click();
			uIMapTrafficWI.citationEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void enterNameType() {
			uIMapTrafficWI.citationEntry.uINameTypeEdit.sendKeys("A");
		}

		public void enterNameTypeID() {
			uIMapTrafficWI.citationEntry.uINameTypeIDEdit.sendKeys("");
		}

		public void save() {
			uIMapTrafficWI.citationEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void Yes() {
			popup.switchToConfirm();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.threadWait(5000);
		}

		public void saveandCloseTheScreen() {
			uIMapTrafficWI.citationEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void selectDefendantType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.uIDefendantTypeComboBox);
		}

		public void selectDefendantTypeAsIndividualAdult() {
			Playback.pageLoadThreadWait();
			uIMapTrafficWI.citationEntry.uIDefendantTypeComboBox.sendKeys("1 - Individual - Adult");
		}

		public void enterAtLastName() {
			uIMapTrafficWI.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTrafficWI.citationEntry.uIFirstNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("FirstName"));
			uIMapTrafficWI.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterCitationNumber() {
			uIMapTrafficWI.citationEntry.uICitationNumberEdit.sendKeys("783");
		}

		public void closeCitationEntryScreen() {
			uIMapTrafficWI.citationEntry.driver.close();
		}

		public void enterLastNameAtWarrantLastName() {
			uIMapTrafficWI.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("WarrantLastName"));
		}

		public void enterFirstNameAtWarrantFirstName() {
			uIMapTrafficWI.citationEntry.uIFirstNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("WarrantFirstName"));
			uIMapTrafficWI.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void enterAtNameID() {
			uIMapTrafficWI.citationEntry.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.citationEntry.uINameTypeIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(2));
			uIMapTrafficWI.citationEntry.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCitationNo() {
			uIMapTrafficWI.citationEntry.uICitationNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CitationNo"));
		}

		public void verifyJnameDetailsRemoved() {
			verify.ExpectedPropertyValueIsEqual("", uIMapTrafficWI.citationEntry.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTrafficWI.citationEntry.uINameTypeIDEdit.getAttribute("value"));
		}

		public void verifyAddressFieldRemoved() {
			verify.ExpectedPropertyValueIsEqual("", uIMapTrafficWI.citationEntry.uIAddressEdit.getAttribute("value"));
		}

		public void verifyJuvinalNameConfirmMessage() {
			popup.confirm.noWithExpectedMessage(
					"(6125) You have selected a Juvenile Name record. This individual is no longer a Juvenile. Select YES to use this Juvenile Name record, or select NO to choose the Adult Name record or to create a 'New' Adult Name record for this individual.");
		}

		public void verify1018RequiredEntriesAreMissingAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyWarrantIcon() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.citationEntry.uIWarrantIconButton.getAttribute("src").contains("warrant"));
		}

		public void verifyAcknowledgeCharge() {
			popup.acknowledge.okWithExpectedMessage("(6515) Charge is Required");
		}

		public void verifyOfficerRequiredAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(10008) Officer is required");
		}

		public void switchToOffenseTab() {
			uIMapTrafficWI.citationEntry.uIOffenseTab.click();
		}

		public void switchToViolationsTab() {
			uIMapTrafficWI.citationEntry.uIViolationsTab.click();
		}

		public void switchToPlaintiffTab() {
			uIMapTrafficWI.citationEntry.uIPlaintiffTab.click();
		}

		public void switchToLicenseTab() {
			uIMapTrafficWI.citationEntry.uILicenseTab.click();
		}

		public void switchToVehicleTab() {
			uIMapTrafficWI.citationEntry.uIVehicleTab.click();
		}

		public void switchToOfficerTab() {
			uIMapTrafficWI.citationEntry.uIOfficerTab.click();
		}

		public void switchToCourtTab() {
			uIMapTrafficWI.citationEntry.uICourtTab.click();
		}

		public void switchToPaymentTab() {
			uIMapTrafficWI.citationEntry.uIPaymentsTab.click();
		}

		public void switchToNarrativeTab() {
			uIMapTrafficWI.citationEntry.uINarrativeTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
		}

		public void switchToWitnessTab() {
			Playback.gridLoadThreadWait();
			uIMapTrafficWI.citationEntry.uIWitnessTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmWitness");
		}

		public void switchToCommentsTab() {
			uIMapTrafficWI.citationEntry.uICommentsTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void switchToMapTab() {
			uIMapTrafficWI.citationEntry.uIMapTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("GHydrantMap");
		}

		public void verifyOnHoldAppears() {
			verify.ExpectedPropertyValueIsEqual("On Hold",
					uIMapTrafficWI.citationEntry.uIApprovalStatusTextView.getText());
		}

		public void verifyCitationNoDisabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICitationNumberEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void clickNameInfoButton() {
			uIMapTrafficWI.citationEntry.uINameInfoButton.click();
		}

		public void clickCopyButton() {
			uIMapTrafficWI.citationEntry.uICopyButton.click();
		}

		public void verifyCitationFieldEditable() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.citationEntry.uICitationNumberEdit.getAttribute("class").contains("textbox"));
		}

		public void verifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTrafficWI.citationEntry.uIDateEdit.getAttribute("value"));
		}

		public void switchToAllTabs() {
			uIMapTrafficWI.citationEntry.uILicenseTab.click();
			uIMapTrafficWI.citationEntry.uIVehicleTab.click();
			uIMapTrafficWI.citationEntry.uIOffenseTab.click();
			uIMapTrafficWI.citationEntry.uIPlaintiffTab.click();
			uIMapTrafficWI.citationEntry.uILicenseTab.click();
			uIMapTrafficWI.citationEntry.uIOfficerTab.click();
			uIMapTrafficWI.citationEntry.uICourtTab.click();
			uIMapTrafficWI.citationEntry.uIPaymentsTab.click();
			uIMapTrafficWI.citationEntry.uINarrativeTab.click();
			uIMapTrafficWI.citationEntry.uIAttachmentTab.click();
			uIMapTrafficWI.citationEntry.uICommentsTab.click();

		}

		public void switchToNonTrafficAllTabs() {
			uIMapTrafficWI.citationEntry.uIViolationsTab.click();
			uIMapTrafficWI.citationEntry.uICourtTab.click();
			uIMapTrafficWI.citationEntry.uIPaymentsTab.click();
			uIMapTrafficWI.citationEntry.uINarrativeTab.click();
			uIMapTrafficWI.citationEntry.uIAttachmentTab.click();
			uIMapTrafficWI.citationEntry.uIWitnessTab.click();
			uIMapTrafficWI.citationEntry.uICommentsTab.click();
			uIMapTrafficWI.citationEntry.uIMapTab.click();
			Playback.controlReadyThreadWait();
			uIMapTrafficWI.citationEntry.uIApprovalTab.click();

		}

		public void verify6515ChargeRequiredAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(6515) Charge is Required");
		}

		public void savePrintButton() {
			uIMapTrafficWI.citationEntry.uISavePrintButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapTrafficWI.citationEntry.uISaveButton.click();

		}

		public void clickSavePrintButton() {
			uIMapTrafficWI.citationEntry.uISavePrintButton.click();
		}

		public void verifyHistroyCopyButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICopyButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICopyButton.isDisplayed());
		}

		public void clickPrintButton() {
			Playback.controlReadyThreadWait();
			uIMapTrafficWI.citationEntry.uIPrintButton.click();
		}

		public void verifyCENoFieldEmpty() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICENoEdit.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICEYearEdit.getAttribute("value").contains(""));
		}

		public void verifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo").substring(0, 2),
					uIMapTrafficWI.citationEntry.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo").substring(3),
					uIMapTrafficWI.citationEntry.uICaseNoEdit.getAttribute("value"));
		}

		public void verifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1),
					uIMapTrafficWI.citationEntry.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("NameID").substring(2),
					uIMapTrafficWI.citationEntry.uINameTypeIDEdit.getAttribute("value"));
		}

		public void verifyAtCENo() {

			verify.ExpectedPropertyValueIsEqual(uIMapTrafficWI.citationEntry.uICEYearEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("CENo").substring(0, 2));
			verify.ExpectedPropertyValueIsEqual(uIMapTrafficWI.citationEntry.uICENoEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("CENo").substring(3));
		}

		public void selectAtDefendantType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.uIDefendantTypeComboBox,
					PoliceData.getTrafficWIModuleValue("DefendantType"));
			uIMapTrafficWI.citationEntry.uIDefendantTypeComboBox.sendKeys(Keys.TAB);
		}

		public void getCitationNo(String citationNo) {
			citationNo = uIMapTrafficWI.citationEntry.uICitationNumberEdit.getAttribute("value");
		}

		public void verifyAtCallNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CallNo").substring(0, 2),
					uIMapTrafficWI.citationEntry.uICallYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CallNo").substring(3),
					uIMapTrafficWI.citationEntry.uICallNoEdit.getAttribute("value"));
		}

		public void getCENo(String CENo) {
			String CEYear = uIMapTrafficWI.citationEntry.uICEYearEdit.getAttribute("value");
			String CENumber = uIMapTrafficWI.citationEntry.uICENoEdit.getAttribute("value");
			CENo = CEYear + "-" + CENumber;
		}

		public void verifySaveConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
				// Playback.pageLoadThreadWait();
				// Playback.pageLoadThreadWait();
				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			} else {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
				Playback.pageLoadThreadWait();
				Playback.pageLoadThreadWait();
			}
		}

		public void enterCallNo(String callYear, String callNo) {
			uIMapTrafficWI.citationEntry.uICallYearEdit.sendKeys(callYear);
			uIMapTrafficWI.citationEntry.uICallNoEdit.sendKeys(callNo);
			uIMapTrafficWI.citationEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNo() {
			uIMapTrafficWI.citationEntry.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo").substring(0, 2));
			uIMapTrafficWI.citationEntry.uICaseNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo").substring(3));
			uIMapTrafficWI.citationEntry.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNumber1() {
			uIMapTrafficWI.citationEntry.uICaseYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo1").substring(0, 1));
			uIMapTrafficWI.citationEntry.uICaseNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CaseNo1").substring(4));
			uIMapTrafficWI.citationEntry.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void clearTheCaseYearAndNo() {
			uIMapTrafficWI.citationEntry.uICaseYearEdit.clear();
			uIMapTrafficWI.citationEntry.uICaseNoEdit.clear();
		}

		public void switchToAttachmentTab() {
			uIMapTrafficWI.citationEntry.uIAttachmentTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
			Playback.waitForPageLoad();
		}

		public void switchToApprovalTab() {
			uIMapTrafficWI.citationEntry.uIApprovalTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPnxGlobalApproval");
		}

		public void ClickCaseInfoIcon() {
			uIMapTrafficWI.citationEntry.uICaseInfoEdit.click();
			Playback.gridLoadThreadWait();
		}

		public void enterAtLastName1() {
			uIMapTrafficWI.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficModuleValue("LastName1"));
		}

		public void enterAtFirstName1() {
			uIMapTrafficWI.citationEntry.uIFirstNameEdit.sendKeys(PoliceData.getTrafficModuleValue("FirstName1"));
			uIMapTrafficWI.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void tabAtDateAndTime() {
			uIMapTrafficWI.citationEntry.uIDateEdit.click();
			uIMapTrafficWI.citationEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.citationEntry.uITimeEdit.sendKeys(Keys.TAB);
		}
		public void tabAtCallNo() {
			uIMapTrafficWI.citationEntry.uICallYearEdit.click();
			uIMapTrafficWI.citationEntry.uICallYearEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.citationEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyNameFieldMandotory() {
			String attribute = uIMapTrafficWI.citationEntry.uINameIdlbl.getCssValue("color");
			verify.ExpectedValueIsTrue(attribute.contains("rgba(153, 0, 0, 1)"));

		}

		public void verifyNameFieldNotMandotory() {
			String attribute = uIMapTrafficWI.citationEntry.uINameIdlbl.getCssValue("color");
			verify.ExpectedValueIsTrue(attribute.contains("black"));

		}

		public void VerifyAdditionSuccessfulMessage() {
			String UpdateMessage = uIMapTrafficWI.citationEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}

		public void clickCommentsTab() {
			uIMapTrafficWI.citationEntry.uICommentsTab.click();
		}

		public void verifyAtMiddleName() {

			verify.ExpectedPropertyValueIsEqual(uIMapTrafficWI.citationEntry.uIMiddleNameEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("MiddleName"));
			Playback.controlReadyThreadWait();

		}

		public void verifyCommentsTabAsBlueColor() {
			String attribute = uIMapTrafficWI.citationEntry.uICommentsColorTab.getAttribute("class");
			verify.ExpectedValueIsTrue(attribute.contains("Blue"));
		}

		public void clickResetButton() {
			uIMapTrafficWI.citationEntry.uIResetButton.click();

		}

		public void verifyNarrativeTabNotAvailable() {
			verify.ExpectedValueIsFalse(
					objectIdentification.manualIdentify.controlExist(uIMapTrafficWI.citationEntry.uINarrativeTab));

		}

		public void enterAtOfficer() {
			uIMapTrafficWI.crashEntry.uIOfficerCodeEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Officer"));
			uIMapTrafficWI.crashEntry.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAdditionalSuccessfulAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");

		}

		public void verifyAsSubmittedInMenuBar() {
			String text = uIMapTrafficWI.crashEntry.uIApprovalStatusTextView.getText();
			verify.ExpectedValueIsTrue(text.contains("Submitted"));
		}

		public void verifyAtCounty() 
		{
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTrafficWI.crashEntry.uICountyEdit);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(PoliceData.getTrafficWIModuleValue("County")));
		}

public String readCENo() {																														// Added by Abi
			String year =uIMapTrafficWI.citationEntry.uICEYearEdit.getAttribute("value");
			String number = uIMapTrafficWI.citationEntry.uICENoEdit.getAttribute("value");
			return year+"-"+number;
		}

		public void verifyCENo(String cENo) {																											// Added by Abi
				verify.ExpectedValueIsTrue(cENo.contains(uIMapTrafficWI.citationEntry.uICENoEdit.getAttribute("value")));
				verify.ExpectedValueIsTrue(cENo.contains( uIMapTrafficWI.citationEntry.uICEYearEdit.getAttribute("value")));
		}

		public void verifyCitationNo(String citationNo) {																								// Added by Abi
			verify.ExpectedValueIsTrue(citationNo.contains(uIMapTrafficWI.citationEntry.uICitationNumberEdit.getAttribute("value")));
		}

		public void verifyAtCEType() {																													// Added by Abi
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.uICETypeComboBox);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(PoliceData.getTrafficWIModuleValue("CEType")));			
		}

		public void verifyReportedDateAndTime(String caseReportedDate1, String caseReportedTime1) {														// Added by Abi
				verify.ExpectedPropertyValueIsEqual(caseReportedDate1,
						uIMapTrafficWI.citationEntry.uIDateEdit.getAttribute("value"));
				verify.ExpectedPropertyValueIsEqual(caseReportedTime1,
						uIMapTrafficWI.citationEntry.uITimeEdit.getAttribute("value"));
		}

	}

	public class ViolationsTab {

		public void enterLocation() {
			uIMapTrafficWI.citationEntry.violationsTab.uILocationEdit.sendKeys("107 Walnut Ave");
		}

		public void enterOfficer() {
			uIMapTrafficWI.citationEntry.violationsTab.uIOfficerEdit.sendKeys("");
		}

		public void enterAtLocation() {
			uIMapTrafficWI.citationEntry.violationsTab.uILocationEdit.clear();
			uIMapTrafficWI.citationEntry.violationsTab.uILocationEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Location"));
			uIMapTrafficWI.citationEntry.violationsTab.uILocationCheckBox.sendKeys(Keys.TAB);
		}

		public void enterCharge() {
			uIMapTrafficWI.citationEntry.violationsTab.uIChargeEdit.sendKeys("11.");
			uIMapTrafficWI.citationEntry.violationsTab.uIChargeLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectServedMethodasInPersion() {
			uIMapTrafficWI.citationEntry.violationsTab.uIServedMethodComboBox.sendKeys("P-IN PERSON");
		}

		public void verifyChargeAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(10013) At least one Violation entry is required");
		}

		public void verifyViolationTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uIViolationsTab.getAttribute("class")
					.contains("igtab_BlueThemeTHText igtab_BlueThemeTHTextDis"));
		}

		public void verifyNIBRSField() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.violationsTab.uIOfficerEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("UserName"));
		}

		public void verifyAcknowledgeViolationEntry() {
			popup.acknowledge.okWithExpectedMessage("(10013) At least one Violation entry is required");
		}

		public void selectAtWINIBRS() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapTrafficWI.citationEntry.violationsTab.uIViolationTabResultGrid) == 1);
		}

		public void selectAtNIBRSWI() {
			uIMapTrafficWI.citationEntry.violationsTab.uINIBRSComboBox
					.sendKeys(PoliceData.getTrafficWIModuleValue("NIBRS"));
			uIMapTrafficWI.citationEntry.violationsTab.uINIBRSComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void tabOutOfficer() {
			uIMapTrafficWI.citationEntry.violationsTab.uIOfficerEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyAtPFInOfficeField() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.violationsTab.uIOfficerEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("PF"));
		}

		public void enterAtCharge() {
			uIMapTrafficWI.citationEntry.violationsTab.uIChargeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Charge"));
			uIMapTrafficWI.citationEntry.violationsTab.uIChargeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickAddButton() {
			uIMapTrafficWI.citationEntry.violationsTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtNIBRSWI() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("NIBRS"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.violationsTab.uINIBRSComboBox));
		}

		public void clickRowInGrid(int rowIndex) {
			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapTrafficWI.citationEntry.violationsTab.uIViolationTabResultGrid, rowIndex);
			Playback.controlReadyThreadWait();
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Location"),
					uIMapTrafficWI.citationEntry.violationsTab.uILocationEdit.getAttribute("value"));
		}

		public void verifyViolationAddedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapTrafficWI.citationEntry.violationsTab.uIViolationTabResultGrid) == 1);
		}

		public void clickLocationVerifyCheckbox() {
			uIMapTrafficWI.citationEntry.violationsTab.uILocationVerifyCheckBox.click();
			uIMapTrafficWI.citationEntry.violationsTab.uILocationVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void clickLocationInfoIcon() {
			uIMapTrafficWI.citationEntry.violationsTab.uILocationInfoIconEdit.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyNIBRS() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.violationsTab.uINIBRSComboBox.getText().trim(),
					PoliceData.getTrafficWIModuleValue("NIBRS"));
		}

		public void verifyNIBRS1() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.violationsTab.uINIBRSComboBox.getText().trim(),
					PoliceData.getTrafficWIModuleValue("NIBRS1"));
		}

		public void enterAtCharge1() {
			uIMapTrafficWI.citationEntry.violationsTab.uIChargeEdit.clear();
			uIMapTrafficWI.citationEntry.violationsTab.uIChargeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Charge1"));
			uIMapTrafficWI.citationEntry.violationsTab.uIChargeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyLocationInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.violationsTab.uILocationInfoIconEdit.isDisplayed());

		}

		public void verifyAtChargeDescription() {
			String desc = uIMapTrafficWI.citationEntry.violationsTab.uIChargeDescripton.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ChargeDescription"), desc);
		}

		public void verifyAtChargeInTheGrid(int rowIndex) {
			String chargeAndDesc = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapTrafficWI.citationEntry.violationsTab.uIViolationTabResultGrid, "Charge", rowIndex);
			String charge = PoliceData.getTrafficModuleValue("Charge");
			String chargeDis = PoliceData.getTrafficModuleValue("ChargeDescription");
			verify.ExpectedPropertyValueIsEqual(charge + ", " + chargeDis, chargeAndDesc);
		}

		public void clickNIBRSButton()
		{
		uIMapTrafficWI.citationEntry.violationsTab.uINIBRSButton.click();
		}
	}

	public class OffenseTab {

		public void enterAtDescribeLocation() {
			uIMapTrafficWI.citationEntry.offenseTab.uIDescribeLocationEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("DescribeLocation"));
			uIMapTrafficWI.citationEntry.offenseTab.uIDescribeLocationCheckBox.sendKeys(Keys.TAB);
		}

		public void enterCharge() {
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.sendKeys("11.");
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtCharge() {
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Charge"));
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.sendKeys(Keys.TAB);

		}

			public void clearCharge() {
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.click();
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.clear();
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterChargeAsFugitiveFelony() {
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.sendKeys("FUGITIVE-FELONY");
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtStreet2() {
			uIMapTrafficWI.crashSearch.uIIntersectionStreet2Edit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Street2"));
			uIMapTrafficWI.crashSearch.uIIntersectionStreet2Edit.sendKeys(Keys.TAB);
		}

		public void enterAtStreetName() {
			uIMapTrafficWI.citationEntry.offenseTab.uIStreetNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("StreetName"));
			uIMapTrafficWI.citationEntry.offenseTab.uIStreetVerifyCheckbox.sendKeys(Keys.TAB);
		}

		// public void enterAtStreetNameAsCharlieAnnaDr()
		// {
		// uIMapTrafficWI.citationEntry.offenseTab.uIAtStreetNameEdit.clear();
		// uIMapTrafficWI.citationEntry.offenseTab.uIAtStreetNameEdit.sendKeys("Charlie
		// Anna Dr");
		// uIMapTrafficWI.citationEntry.offenseTab.uIAtStreetNameVerifyCheckbox.sendKeys(Keys.TAB);
		// }
		public void selectAtHwyTypeAsCountyHighway() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.offenseTab.uIAtHwyTypeComboBox, "CTH - County Highway");
			uIMapTrafficWI.citationEntry.offenseTab.uIAtHwyTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectServedMethodAsMailed() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.offenseTab.uIServedMethodComboBox, "M - MAILED");
			uIMapTrafficWI.citationEntry.offenseTab.uIServedMethodComboBox.sendKeys(Keys.TAB);
		}

		public void clickUnclearPlates() {
			uIMapTrafficWI.citationEntry.offenseTab.uIUnclearPlatesCheckBox.click();
		}

		public void verifyAtInThe() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.offenseTab.uIInTheComboBox) == PoliceData
							.getTrafficWIModuleValue("Inthe"));
		}

		public void verifyNIBRSField() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("UserName"));
		}

		public void verifyAtMunicipality() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.offenseTab.uIMunicipalityDescribeTextView.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("Municipality"));
		}

		public void verifyUnclearPlateCheckBox() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.citationEntry.offenseTab.uIUnclearPlatesCheckBox.getAttribute("checked") == "true");
		}

		public void verifySatatueOrdinaceCodeValueGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.offenseTab.uISatatueOrdinaceCodeValueEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyAsServiceMethod() {
			if (Playback.browserType == "Chrome") {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
						uIMapTrafficWI.citationEntry.offenseTab.uIServedMethodComboBox) == "P - IN PERSON ");
			} else
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
						uIMapTrafficWI.citationEntry.offenseTab.uIServedMethodComboBox) == "P - IN PERSON");
		}

		public void clickDescribeLocationInfoButton() {
			uIMapTrafficWI.citationEntry.offenseTab.uIDescribeLocationInfoButton.click();
		}

		public void tabOutOffenseDateTime() {
			uIMapTrafficWI.citationEntry.offenseTab.uIOffenseDateEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.citationEntry.offenseTab.uIOffenseTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtStreet() {
			uIMapTrafficWI.citationEntry.offenseTab.uIStreetEdit.sendKeys(PoliceData.getTrafficModuleValue("Street"));
			uIMapTrafficWI.citationEntry.offenseTab.uIStreetEdit.sendKeys(Keys.TAB);
		}

		public void clearStreetName() {
			uIMapTrafficWI.citationEntry.offenseTab.uIStreetNameEdit.click();
			uIMapTrafficWI.citationEntry.offenseTab.uIStreetNameEdit.clear();
			uIMapTrafficWI.citationEntry.offenseTab.uIStreetNameEdit.sendKeys(Keys.TAB);
		}
		public void clickChargeLookUpIcon() {
			uIMapTrafficWI.citationEntry.offenseTab.uIChargeLookupButton.click();
		}

		public void verifyAtChargeDescription() {
			String desc = uIMapTrafficWI.citationEntry.violationsTab.uIChargeDescripton.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficModuleValue("ChargeDescription"), desc);
		}

		public void verifyAtChargeInTheGrid(int rowIndex) {
			String chargeAndDesc = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapTrafficWI.citationEntry.violationsTab.uIViolationTabResultGrid, "Charge", rowIndex);
			String charge = PoliceData.getTrafficModuleValue("Charge");
			String chargeDis = PoliceData.getTrafficModuleValue("ChargeDescription");
			verify.ExpectedPropertyValueIsEqual(charge + ", " + chargeDis, chargeAndDesc);
		}

		public void verifyAtCharge() 
		{
			String attribute = uIMapTrafficWI.citationEntry.offenseTab.uIChargeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getTrafficWIModuleValue("Charge")));
		}
	}

	public class PlaintiffTab {

		public void selectPlaintiffTypeAsStateofNewJersey() {
			uIMapTrafficWI.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox.sendKeys("1 - State of New Jersey");
		}

		public void selectPlaintiffTypeAsStateofWisconsin() {
			uIMapTrafficWI.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox.sendKeys("1 - State of Wisconsin");
		}

		public void selectPlaintiffTypeAsCountyOf() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox, "2 - County of");

		}

		public void selectCounty() {
			uIMapTrafficWI.citationEntry.plaintiffTab.uICountySearchButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyKPILable() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.plaintiffTab.uIKPILabelTextView.getText()
					.contains("To Update A 'Read Only' Field, Go To The Court Tab"));
		}

		public void verifyAtPliantiffType() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapTrafficWI.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox) == PoliceData
							.getTrafficWIModuleValue("PlaintiffType"));
		}

		public void verifyAtCityVillageTown() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.plaintiffTab.uICityVillageTownTextView.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("CityVlgTwn"));
		}

		public void verifyAtCourtType() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.plaintiffTab.uICourtTypeTextView.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("CourtType"));
		}

		public void verifyAtCourt() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.plaintiffTab.uICourtNameTextView.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("Court"));
		}

		public void verifyPaymentMethodTranProsOffGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.plaintiffTab.uIPaymentMethodComboBox
					.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.citationEntry.plaintiffTab.uITranProsOffComboBox.getAttribute("disabled") == "true");
		}

		public void selectAtPlaintiffType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox,
					PoliceData.getTrafficModuleValue("PlaintiffType"));
		}

		public void selectAtCourtType() {
			uIMapTrafficWI.citationEntry.plaintiffTab.uICourtTypeEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CourtType"));
			uIMapTrafficWI.citationEntry.plaintiffTab.uICourtTypeEdit.sendKeys(Keys.TAB);
		}

		public void verifyCountyEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.plaintiffTab.uICountyEdit.isEnabled());
		}

		public void enterAtCounty() {
			uIMapTrafficWI.citationEntry.plaintiffTab.uICountyEdit.sendKeys(PoliceData.getTrafficModuleValue("County"));
			uIMapTrafficWI.citationEntry.plaintiffTab.uICountyEdit.sendKeys(Keys.TAB);
		}

		public void verifyCityVillageTownEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.plaintiffTab.uICityVillageTownEdit.isEnabled());
		}

		public void enterAtCityVillageTown() {
			uIMapTrafficWI.citationEntry.plaintiffTab.uICityVillageTownEdit
					.sendKeys(PoliceData.getTrafficModuleValue("CityVlgTown"));
			uIMapTrafficWI.citationEntry.plaintiffTab.uICityVillageTownEdit.sendKeys(Keys.TAB);
		}

		public void enterDepositBail() {
			uIMapTrafficWI.citationEntry.plaintiffTab.uIDepositBailEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void selectWIPaymentMethod() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.plaintiffTab.uIPaymentMethodComboBox);
		}

		public void verifyAtPliantiffTypeInWI() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapTrafficWI.citationEntry.plaintiffTab.uIPlaintiffTypeComboBox) == PoliceData
							.getTrafficModuleValue("PlaintiffType"));
		}

		public void verifyAtCityVillageTownInWI() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.plaintiffTab.uICityVillageTownTextView.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CityVlgTwn"));
		}

		public void verifyAtCourtTypeInWI() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.plaintiffTab.uICourtTypeTextView.getAttribute("value"),
					PoliceData.getTrafficModuleValue("CourtType"));
		}

		public void verifyAtCourtInWI() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.citationEntry.plaintiffTab.uICourtNameTextView.getAttribute("value"),
					PoliceData.getTrafficModuleValue("Court"));
		}

		public void verifyPaymentMethodTranProsOffGrayedOutInWI() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.plaintiffTab.uIPaymentMethodComboBox
					.getAttribute("disabled") == "true");
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.citationEntry.plaintiffTab.uITranProsOffComboBox.getAttribute("disabled") == "true");
		}
	}

	public class LicenseTab {

		public void verifyAtDOB() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("DOB"),
					uIMapTrafficWI.citationEntry.licenseTab.uIDOBEdit.getAttribute("value"));
		}

		public void verifyAtGender() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Gender"),
					uIMapTrafficWI.citationEntry.licenseTab.uIGenderEdit.getAttribute("value"));
		}

		public void verifyAtRace() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Race"),
					uIMapTrafficWI.citationEntry.licenseTab.uIRaceEdit.getAttribute("value"));
		}

		public void verifyAtHeight() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Height"),
					uIMapTrafficWI.citationEntry.licenseTab.uIHeightEdit.getAttribute("value"));
		}

		public void verifyAtWeight() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Weight"),
					uIMapTrafficWI.citationEntry.licenseTab.uIWeightEdit.getAttribute("value"));
		}

		public void verifyAtSSNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("SSNo"),
					uIMapTrafficWI.citationEntry.licenseTab.uISSNoEdit.getAttribute("value"));
		}

		public void verifyAtDrivierLicenseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("DriverLicNo"),
					uIMapTrafficWI.citationEntry.licenseTab.uIDrivierLicenseNoEdit.getAttribute("value"));
		}

		public void verifyDLCheckBox() {
			verify.ExpectedValueIsFalse(uIMapTrafficWI.citationEntry.licenseTab.uINoDLCheckBox.isEnabled());
		}

		public void clickNoDLCheckbox() {
			uIMapTrafficWI.citationEntry.licenseTab.uINoDLCheckbox.click();
		}
	}

	public class CitationEntryVehicleTab {

		public void clickNoPlateCheckBox() {
			uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uINoPlateCheckBox.click();
		}

		public void enterAtPlateNo() {
			uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIPlateVinEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("PlateNo").substring(0, 3));
			uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIStateComboBox
					.sendKeys(PoliceData.getTrafficWIModuleValue("PlateNo").substring(4));
			uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectVehicle() {
			// Vehicle.VehicleBoatSearchHelpWindow.SelectVehicleAtVinNo();
		}

		public void enterAtVehicleNo() {
			uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIVehicleVinEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("VehicleNo"));
			uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIStateComboBox
					.sendKeys(PoliceData.getTrafficWIModuleValue("State"));
			uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
		}

		public void verifyPlateOrVinNoGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIPlateVinEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyAtLicensePlateType() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("LicPlateType"),
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uILicensePlateTypeEdit.getAttribute("value"));
		}

		public void verifyAtIssueState() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("IssueState"),
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIIssuingStateEdit.getAttribute("value"));
		}

		public void verifyAtPlateExpirationYear() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("PlateExpirationYear"),
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIPlateExpirationYearEdit
							.getAttribute("value"));
		}

		public void verifyAtVehicleYear() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("VehicleYear"),
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIVehicleYearEdit.getAttribute("value"));
		}

		public void verifyAtVehicleMake() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("VehicleMake"),
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIVehicleMakeEdit.getAttribute("value"));
		}

		public void verifyAtVehicleColor() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("VehicleColor"),
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIVehicleColorEdit.getAttribute("value"));
		}

		public void verifyAtVinNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("VINNo"),
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIVinNoEdit.getAttribute("value"));
		}

		public void verifyVehicleInfoButton() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.citationEntry.citationEntryVehicleTab.uIVehicleInfoButton.isDisplayed());
		}
	}

	public class OfficerTab {

		public void tabOutOfficer() {

			uIMapTrafficWI.citationEntry.officerTab.uIOfficerCodeEdit.click();
			uIMapTrafficWI.citationEntry.officerTab.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectIssuingOfficer() {
			uIMapTrafficWI.citationEntry.officerTab.uIIssuingOfficerLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectArea() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uIAreaComboBox);
		}

		public void selectRoad() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uIRoadComboBox);
		}

		public void selectTraffic() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uITrafficComboBox);
		}

		public void selectVisibility() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uIVisibilityComboBox);
		}

		public void selectNoOfLanes() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uINoLanesComboBox);
		}

		public void selectAccidentAsNo() {
			uIMapTrafficWI.citationEntry.officerTab.uIAccidentComboBox.sendKeys("No");
		}

		public void checkRadar() {
			uIMapTrafficWI.citationEntry.officerTab.uIRadarCheckBox.click();
		}

		public void selectEquipOperatorName() {
			uIMapTrafficWI.citationEntry.officerTab.uIEquipOperatorNameLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyInfoExist() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.officerTab.uIRoadComboBox) == "--");
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.officerTab.uIAreaComboBox) == "--");
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.officerTab.uINoLanesComboBox) == "--");
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.officerTab.uIAccidentComboBox) == "--");
		}

		public void enterAtPFCode() {
			uIMapTrafficWI.citationEntry.officerTab.uIOfficerPFEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("PFCode"));
			uIMapTrafficWI.citationEntry.officerTab.uIOfficerPFEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtOfficer() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Officer"),
					uIMapTrafficWI.citationEntry.officerTab.uIOfficerEdit.getAttribute("value"));
		}

		public void verifyOfficerAsPatrolOfficer() {
			Playback.pageLoadThreadWait();
			String Officer = uIMapTrafficWI.citationEntry.officerTab.uIOfficerPFEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(Officer.contains("P001"));
			Playback.pageLoadThreadWait();
		}

		public void selectHighWayCondition() {
			uIMapTrafficWI.citationEntry.officerTab.uIHighWayComboBox.click();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uIHighWayComboBox);
		}

		public void selectLightCondition() {
			uIMapTrafficWI.citationEntry.officerTab.uILightConditionComboBox.click();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uILightConditionComboBox);
		}

		public void selectWeatherCodition() {
			uIMapTrafficWI.citationEntry.officerTab.uIWeatherConditionComboBox.click();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uIWeatherConditionComboBox);
		}

		public void selectTrafficCondition() {
			uIMapTrafficWI.citationEntry.officerTab.uITrafficConditionComboBox.click();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uITrafficConditionComboBox);
		}

		public void selectRoadCondition() {
			uIMapTrafficWI.citationEntry.officerTab.uIRoadConditionComboBox.click();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.officerTab.uIRoadConditionComboBox);
		}

	}

	public class CourtTab {

		public void verifyGridAtOriginalCharge(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("OriginalCharge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid, "Charge", rowIndex));
		}

		public void verifyAtCharge(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Charge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid, "Charge", rowIndex));
		}

		public void clickRowAtOriginalCharge() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid,
					PoliceData.getTrafficWIModuleValue("OriginalCharge"));
		}

		public void clickRowAtCharge() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid,
					PoliceData.getTrafficWIModuleValue("Charge"));
		}

		public void verifyAtOriginalChrage() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("OriginalCharge"),
					uIMapTrafficWI.citationEntry.courtTab.uIOriginalChargeEdit.getAttribute("value"));
		}

		public void enterCourtDateAsCurrentDate() {
			uIMapTrafficWI.citationEntry.courtTab.uICourtDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapTrafficWI.citationEntry.courtTab.uICourtDateEdit.sendKeys(Keys.TAB);
		}

		public void enterCourtDateAsCurrentTime() {
			uIMapTrafficWI.citationEntry.courtTab.uICourtTimeEdit.sendKeys(Randomized.getCurrentTime("HH:mm"));
			uIMapTrafficWI.citationEntry.courtTab.uICourtTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtDisposition() {
			uIMapTrafficWI.citationEntry.courtTab.uIDispositionEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Disposition"));
			uIMapTrafficWI.citationEntry.courtTab.uIDispositionEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPenality() {
			uIMapTrafficWI.citationEntry.courtTab.uIPenaltyAmountEdit.click();
			uIMapTrafficWI.citationEntry.courtTab.uIPenaltyAmountEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Penalty"));
                    uIMapTrafficWI.citationEntry.courtTab.uIPenaltyAmountEdit.sendKeys(Keys.TAB);
		}

		public void clickUpdateButton() {
			uIMapTrafficWI.citationEntry.courtTab.uIUpdateButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyCourtDateAsCurrentDate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid, "Court", rowIndex)
					.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtDisposition(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Disposition1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid, "Disposition", rowIndex));
		}

		public void verifyAtPenalty(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid, "Penalty",
							rowIndex)
					.replace("$", "").contains(PoliceData.getTrafficWIModuleValue("Penalty")));
		}

		public void verifyAtFineForfeiture(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapTrafficWI.citationEntry.courtTab.uICourtTabResultGrid,
									"Fine/Forfeiture", rowIndex)
							.replace("$", "").contains(PoliceData.getTrafficWIModuleValue("Fine")));
		}

		public void verifyAcknoledgeUpdateCourtTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Court Tab. You must save or reset.");
		}

		public void verifyBalance() {
			verify.ExpectedPropertyValueIsEqual("$0.00",
					uIMapTrafficWI.citationEntry.courtTab.uIBalanceTextView.getAttribute("value"));
		}

		public void enterAtFine() {
			uIMapTrafficWI.citationEntry.courtTab.uIFineForfeitureEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Fine"));
		}

		public void selectMethod() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.courtTab.uIMethodComboBox);
		}

		public void enterFineAs200() {
			uIMapTrafficWI.citationEntry.courtTab.uIFineForfeitureEdit.sendKeys("200");
			uIMapTrafficWI.citationEntry.courtTab.uIFineForfeitureEdit.sendKeys(Keys.TAB);
		}

		public void verifyCourtDateLabelIsDisplayed() 
		{
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.courtTab.uICourtDateLabel.isDisplayed());
			
		}

	}

	public class CitationEntryPaymentsTab {

		public void enterDateAsCurrentDate() {
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void enterPayment() {
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIPaymentEdit.click();
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIPaymentEdit
					.sendKeys(uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIBalanceEdit.getAttribute("value")
							.replace("$", ""));
		}

		public void selectMethod() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIMethodComboBox);
		}

		public void enterReciptReference() {
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIReciptReferenceEdit
					.sendKeys(Randomized.randomString(25));
		}

		public void verifyBalance() {
			verify.ExpectedPropertyValueIsEqual("$0.00",
					uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIBalanceEdit.getAttribute("value"));
		}

		public void enterAtPayment() {
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIPaymentEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Payment"));
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIPaymentEdit.sendKeys(Keys.TAB);

		}

		public void selectAtMethod() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIMethodComboBox,
					PoliceData.getTrafficWIModuleValue("Method"));
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIMethodComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtMethod1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIMethodComboBox,
					PoliceData.getTrafficWIModuleValue("Method1"));
			uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIMethodComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtMethodInTable() {
			objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.citationEntry.citationEntryPaymentsTab.uIPaymentTabResultGrid,
					PoliceData.getTrafficWIModuleValue("Method"));
		}

	}

	public class CitationEntryNarrativeTab {

		public void enterGroupOfStrings() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uINarrativeRichTextEdit)
					.click();
			actions.sendKeys(Randomized.randomString(200)).build().perform();
			Playback.controlReadyThreadWait();

		}

		public void verifyAcknowledgeUpdateNarrativeTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
		}

		public void InternalSave() {
			uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void clickAddNew() {
			uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uIAddNewButton.click();

		}

		public String getRichText() {
			objectIdentification.windowHandle
					.switchToFrame(uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uINarrativeRichTextEdit);
			String text = Playback.driver.findElement(By.xpath(".//body")).getText();
			return text;
		}

		public void clickAddNewButton() {
			uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uIAddNewButton.click();
		}

		public void clickLoadButton() {
			uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uILoadButton.click();
		}

		public void verifyAtTemplateComboBoxAsExistingValue() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uITemplateComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem, PoliceData.getTrafficWIModuleValue("Template"));
		}

		public void verifyRichTextIsDisplayed(String richText) {
			objectIdentification.windowHandle
					.switchToFrame(uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uINarrativeRichTextEdit);
			String text = Playback.driver.findElement(By.xpath(".//body")).getText();
			verify.ExpectedValueIsTrue(text.contains(richText));
		}

		public void clickResetButton() {
			uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uIResetButton.click();
		}

		public void selectAtTemplate1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uITemplateComboBox,
					PoliceData.getTrafficWIModuleValue("Template1"));
		}

		public void selectAtTemplate() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.citationEntryNarrativeTab.uITemplateComboBox,
					PoliceData.getTrafficWIModuleValue("Template"));
		}

		public void verifyRichTextFromTemplate1() {
			String text = Playback.driver.findElement(By.xpath(".//body")).getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getTrafficWIModuleValue("RichTextFromTemplate1")));
		}
	}

	public class CitationEntryWitnessTab {

		public void enterLastName() {
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uILastNameEdit.sendKeys("Raja");
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectName() {
			// Names.NameSearchHelpWindow.SelectName();
		}

		public void verifyAcknowledgeUpdateWitnessTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Witness Tab. You must save or reset.");
		}

		public void clickAddButton() {
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIAddButton.click();
		}

		public void verifyNameAddedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIWitnessTabResultGrid) == 2);
		}

		public void clickDeleteIconInGrid(int rowIndex, int columnIndex) {
			objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIWitnessTabResultGrid, rowIndex,
							columnIndex)
					.click();
			popup.confirm.yes();
		}

		public void InternalSave() {
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void verifyNameDeletedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIWitnessTabResultGrid) == 1);
		}

		public void enterAtNameID() {
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(2));
		}

		public void verifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIWitnessTabResultGrid, "Name",
							rowIndex));
		}

		public void enterAtLastName() {
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uILastNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("LastName"));
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.citationEntry.citationEntryWitnessTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}
	}

	public class CitationEntryCommentsTab {

		public void enterSubject() {
			uIMapTrafficWI.citationEntry.citationEntryCommentsTab.uISubjectEdit.sendKeys("Automation");
		}

		public void clickEnterCommentsButton() {
			uIMapTrafficWI.citationEntry.citationEntryCommentsTab.uIEnterCommentsButton.click();
			popup.confirm.yes();
		}

		public void verifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTrafficWI.citationEntry.citationEntryCommentsTab.uIDateEdit.getAttribute("value"));
		}

		public void clickDeleteIconInGrid(int rowIndex, int columnIndex) {
			objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.citationEntry.citationEntryCommentsTab.uICommentsTabResultGrid,
							rowIndex, columnIndex)
					.click();
			popup.confirm.yes();
		}

		public void verifyDeletedCommentsNotFound() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapTrafficWI.citationEntry.citationEntryCommentsTab.uICommentsTabResultGrid) == 0);
		}

		public void enterAtSubject() {
			uIMapTrafficWI.citationEntry.citationEntryCommentsTab.uISubjectEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Subject"));
		}

		public void verifyAtSubjectInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.citationEntry.citationEntryCommentsTab.uICommentsTabResultGrid,
					PoliceData.getTrafficWIModuleValue("Subject"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getTrafficWIModuleValue("Subject")));
		}
	}

	public class CitationEntryMapTab {

		public void verifyAtCENo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CENo"),
					uIMapTrafficWI.citationEntry.citationEntryMapTab.uICENoTextView.getText());
		}

		public void verifyLatLongValue(String getLatLongvalue) {
			verify.ExpectedPropertyValueIsEqual(getLatLongvalue,
					uIMapTrafficWI.citationEntry.citationEntryMapTab.uILatLongValueTextView.getText());
		}
	}

	public class CitationEntryApprovalTab {
		public void tabThroughDateTime() {
			uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void selectRejectionCode() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uIRejectionCodeComboBox);
		}

		public void selectActionAsSendForApproval() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uINewActionComboBox, "Send for Approval");
		}

		public void selectActionAsApprove() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uINewActionComboBox, "Approve");
		}

		public void selectActionAsLock() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntry.crashEntryApprovalTab.uINewActionComboBox, "Lock");
		}

		public void verifyCurrentDateAutopopulatesInDateField() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uIDateEdit.getAttribute("value"));
		}

		public void enterAtSupervisor() {
			uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uISupervisorCodeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Supervisor"));
		}

		public void save() {
			uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyRejectCountAs1() {
			verify.ExpectedPropertyValueIsEqual("1",
					uIMapTrafficWI.citationEntry.citationEntryApprovalTab.uIRejectCountTextView.getText());
		}
	}

	public class CitationComments {
		public void enter100WordsRichText() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapTrafficWI.citationComments.uICommentsRichTextEdit).click();
			actions.sendKeys(
					"The Phoenix software’s advanced architecture and design help us in achieving the industry paradigm shift"
							+ " we seek to provide outstanding service to our clients and maintain 100% client satisfaction. "
							+ " Additionally, our pricing philosophy includes both Perpetual Licensing and Software as a Service (SaaS) "
							+ "options as part of our efforts to offer a higher return on investment.")
					.build().perform();
			Playback.controlReadyThreadWait();

		}

		public void clickResetButton() {
			uIMapTrafficWI.citationComments.uIResetButton.click();
		}

		public void saveAndCloseScreen() {
			uIMapTrafficWI.citationComments.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void save() {
			uIMapTrafficWI.citationComments.uISaveButton.click();
		}

	}

	public class CitationArrest {
		public void selectArmed() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapTrafficWI.citationArrest.uIArmedCombobox);
			uIMapTrafficWI.citationArrest.uIArmedCombobox.sendKeys(Keys.TAB);
		}

		public void saveScren() {
			uIMapTrafficWI.citationArrest.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void close() {
			uIMapTrafficWI.citationArrest.driver.close();
		}

		public void saveCloseScren() {
			uIMapTrafficWI.citationArrest.uISaveCloseButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void selectAgencyActionAsHandledWithintheDepartment() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationArrest.uIAgencyActionCombobox, "Handled Within the Department");

		}

		public void enterDateAsCurrentDate() {
			uIMapTrafficWI.citationArrest.uIArrestDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapTrafficWI.citationArrest.uIArrestDateEdit.sendKeys(Keys.TAB);
		}

		public void selectTypeOfArrestAsOnViewArrest() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.citationArrest.uITypeOfArrestCombobox, "On-View Arrest");
		}

		public void enterArrestDateAsCurrentDate() {
			uIMapTrafficWI.citationArrest.uIArrestDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void selectAtTypeOfArrestComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.citationArrest.uITypeOfArrestCombobox,
					PoliceData.getTrafficWIModuleValue("TypeOfArrest"));
		}

		public void selectArmedAsUnarmed()
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.citationArrest.uIArmedCombobox, "Unarmed");

			}

			public void verifyArmedAsUnarmed()
			{
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTrafficWI.citationArrest.uIArmedCombobox);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains("Unarmed"));
			}

			public void verifyAtAgencyAction()
			{
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapTrafficWI.citationArrest.uIAgencyActionCombobox);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(PoliceData.getTrafficWIModuleValue("AgencyAction")));
			}
	}

	public class CitationSearch {
		public void enterCENumberAtCENo() {
			uIMapTrafficWI.citationSearch.uICENoYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CENo").substring(0, 2));
			uIMapTrafficWI.citationSearch.uICENoNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CENo").substring(3));
			uIMapTrafficWI.citationSearch.uICENoNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterCENumberCE() {
			uIMapTrafficWI.citationSearch.uICENoYearEdit.sendKeys("16");
			uIMapTrafficWI.citationSearch.uICENoNumberEdit.sendKeys("70");
			uIMapTrafficWI.citationSearch.uICENoNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapTrafficWI.citationSearch.uISearchButton.click();
		}

		public void clickAddNewButton() {
			uIMapTrafficWI.citationSearch.uIAddNewButton.click();
		}

		public void clickRefreshButton() {
			uIMapTrafficWI.citationSearch.uIRefreshButton.click();
		}

		public void clickAtCitationNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.citationSearch.uICitationSearchResultGrid,
					PoliceData.getTrafficWIModuleValue("CitationNo"));
		}

		public void SelectGrid() {

			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapTrafficWI.citationSearch.uICitationSearchResultGrid);
		}

		public void clickAtCENo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.citationSearch.uICitationSearchResultGrid,
					PoliceData.getTrafficWIModuleValue("CENo"));
		}

		public void clickClearButton() {
			uIMapTrafficWI.citationSearch.uIClearButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtCitationNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CitationNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, "Citation#", rowIndex));
		}

		public void verifyAtCENo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CENo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, "CE#", rowIndex));
		}

		public void verifyName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficWIModuleValue("CitationLastName") + ", "
							+ PoliceData.getTrafficWIModuleValue("CitationFirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, "Name", rowIndex));
		}

		public void verifyStatus(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("On Hold", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, "Status", rowIndex));
		}

		@SuppressWarnings("unchecked")
		public void verifyCallColumnShows() {
			verify.ExpectedValueIsTrue((((List<String>) objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapTrafficWI.citationSearch.uICitationSearchResultGrid.getText()))
							.contains("Call#")));
		}

		@SuppressWarnings("unchecked")
		public void verifyCaseColumnShows() {
			verify.ExpectedValueIsTrue(((List<String>) objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapTrafficWI.citationSearch.uICitationSearchResultGrid.getText()))
							.contains("Case#"));
		}

		public void enterAtLastName() {
			uIMapTrafficWI.citationSearch.uILastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("LastName"));
			uIMapTrafficWI.citationSearch.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapTrafficWI.citationSearch.uIFirstNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("FirstName"));
			uIMapTrafficWI.citationSearch.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtMiddleName() {
			uIMapTrafficWI.citationSearch.uIMiddleNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("MiddleName"));
			uIMapTrafficWI.citationSearch.uIMiddleNameEdit.sendKeys(Keys.TAB);
		}

		public void clearMiddleName() {
			uIMapTrafficWI.citationSearch.uIMiddleNameEdit.clear();
		}

		public void verifyAtName() {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficWIModuleValue("LastName") + ", "
							+ PoliceData.getTrafficWIModuleValue("FirstName"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, "Name", 0));
		}

		public void selectCETypeAsTrafficViolation() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.citationSearch.uICETypeComboBox,
					"Traffic Violation");
		}

		public void selectAtCEType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.citationSearch.uICETypeComboBox,
					PoliceData.getTrafficWIModuleValue("CEType"));
		}

		public void clickPrintButton() {
			uIMapTrafficWI.citationSearch.uIPrintIcon.click();
		}

		public void verifyAtCaseNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, "Case#", rowIndex));
		}

		public void verifyAtCallNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CallNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, "Call#", rowIndex));
		}

		public void selectAtCENoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.citationSearch.uICitationSearchResultGrid, PoliceData.getTrafficModuleValue("CENo"));
		}

		public void pressShiftNTabFunction() throws AWTException {
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
				System.out.println("No");
			}

			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_SHIFT);

		}

		public void enterAtNIBRS() {
			uIMapTrafficWI.citationSearch.uINIBRSEdit.sendKeys(PoliceData.getTrafficModuleValue("NIBRS"));
			uIMapTrafficWI.citationSearch.uINIBRSEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtFirstName() {
			String attribute = uIMapTrafficWI.citationSearch.uIFirstNameEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getTrafficModuleValue("FirstName")));
		}

		public void enterAtCitationLocation() {
			uIMapTrafficWI.citationSearch.uICitationLocationEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CitationLocation"));
			uIMapTrafficWI.citationSearch.uICitationLocationEdit.sendKeys(Keys.TAB);
		}

		public void enterATDOB() {
			Playback.controlReadyThreadWait();
			uIMapTrafficWI.citationSearch.uIDOBEdit.sendKeys(PoliceData.getTrafficWIModuleValue("DOB"));
		}

		public void enterAtCallNo() {
			uIMapTrafficWI.citationSearch.uICallYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CallNo").substring(0, 2));
			uIMapTrafficWI.citationSearch.uICallNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CallNo").substring(3));
			uIMapTrafficWI.citationSearch.uICallNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickBackButton() {
			uIMapTrafficWI.citationSearch.uIBackButton.click();
		}

		public void selectLocationTypeAsAddress() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.citationSearch.uICitationLocationDropdown, "Address");

		}

		public void enterAtPremiseNoInCitationLocation() {
			uIMapTrafficWI.citationSearch.uICitationLocPremiseNoEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("PremiseNo"));
			uIMapTrafficWI.citationSearch.uICitationLocPremiseNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtStreetInCitationLocation() {
			uIMapTrafficWI.citationSearch.uICitationLocStreetEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Street"));
			uIMapTrafficWI.citationSearch.uICitationLocStreetEdit.sendKeys(Keys.TAB);

		}

		public void clickResetButton() {
			uIMapTrafficWI.citationSearch.uIResetButton.click();

		}

		public void selectLocationTypeAsIntersection() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTrafficWI.citationSearch.uICitationLocationDropdown, "Intersection");

		}

		public void enterAtStreet1InCitationLocation() {
			uIMapTrafficWI.citationSearch.uICitationLocStreet1Edit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Street1"));
			uIMapTrafficWI.citationSearch.uICitationLocStreet1Edit.sendKeys(Keys.TAB);

		}

		public void enterAtStreet2InCitationLocation() {
			uIMapTrafficWI.citationSearch.uICitationLocStreet2Edit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Street2"));
			uIMapTrafficWI.citationSearch.uICitationLocStreet2Edit.sendKeys(Keys.TAB);

		}

		public void clickDocketNoLabel() {
			uIMapTrafficWI.citationSearch.uIDocketNoLabel.click();

		}

		public void verifyDocketNoAsCustomField() {
			String attribute = uIMapTrafficWI.citationSearch.uIDocketNoLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("underline"));
		}

		public void enterAtDocketNo() {
			uIMapTrafficWI.citationSearch.uIDocketNoEdit.sendKeys(PoliceData.getTrafficWIModuleValue("DocketNo"));

		}

	}

	public class CitationSearchHelpWindow {
		public void verifyAtCaseNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationSearchHelpWindow.uICitationSearchResultGrid, "Case#", rowIndex));
		}

		public void verifyCitationNoUsingCallNo(String citationNo) {
			verify.ExpectedPropertyValueIsEqual(citationNo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.citationSearchHelpWindow.uICitationSearchResultGrid,
									PoliceData.getTrafficWIModuleValue("CallNo"), "Citation#")
							.getText());
		}

		public void verifyCENoUsingCallNo(String CENo) {
			verify.ExpectedPropertyValueIsEqual(CENo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.citationSearchHelpWindow.uICitationSearchResultGrid,
									PoliceData.getTrafficWIModuleValue("CallNo"), "CE#")
							.getText());
		}

		public void verifyAtCallNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("CallNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.citationSearchHelpWindow.uICitationSearchResultGrid, "Call#", rowIndex));
		}

		public void verifyCitationNoUsingCaseNo(String citationNo) {
			verify.ExpectedPropertyValueIsEqual(citationNo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.citationSearchHelpWindow.uICitationSearchResultGrid,
									PoliceData.getTrafficWIModuleValue("CaseNo"), "Citation#")
							.getText());
		}

		public void verifyCENoUsingCaseNo(String CENo) {
			verify.ExpectedPropertyValueIsEqual(CENo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.citationSearchHelpWindow.uICitationSearchResultGrid,
									PoliceData.getTrafficWIModuleValue("CaseNo"), "CE#")
							.getText());
		}

	public void clickAtCETypeInGrid() {																			// Added by Abi
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapTrafficWI.citationSearchHelpWindow.uICitationSearchResultGrid, PoliceData.getTrafficWIModuleValue("CEType"));			
		}

		public void close() {																						// Added by Abi
			uIMapTrafficWI.citationSearchHelpWindow.driver.close();
		}

	}

	public class ParkingEntry {

		public Defendant1 defendant1;
		public Defendant2 defendant2;
		public ParkingEntryMainTab parkingEntryMainTab;
		public FineNoticesTab fineNoticesTab;
		public PaymentsTab paymentsTab;
		public CommentsTab commentsTab;
		public ParkingEntryHistoryTab parkingEntryHistoryTab;

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

			if (commentsTab == null)
				commentsTab = new CommentsTab();

			if (parkingEntryHistoryTab == null)
				parkingEntryHistoryTab = new ParkingEntryHistoryTab();

		}

		public void clickDefandant1Tab() {
			uIMapTrafficWI.parkingEntry.uIDefendant1Tab.click();

		}

		public void clickDefandant2Tab() {
			uIMapTrafficWI.parkingEntry.uIDefendant2Tab.click();

		}

		public void entercurrentValidationDate() {
			uIMapTrafficWI.parkingEntry.uIViolationDateEdit.click();
			uIMapTrafficWI.parkingEntry.uIViolationDateEdit.sendKeys(Keys.TAB);
		}

		public void enterCurrentValidationTime() {
			uIMapTrafficWI.parkingEntry.uIViolationTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterRandomTicketNo() {
			String TicketNo = Integer.toString(Randomized.getRandomNumber(4));
			uIMapTrafficWI.parkingEntry.uITicketNumberEdit.sendKeys(TicketNo);
		}

		public void savetheScreen() {
			uIMapTrafficWI.parkingEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveandClosetheScreen() {
			uIMapTrafficWI.parkingEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void switchToMainTab() {
			uIMapTrafficWI.parkingEntry.uIMainTab.click();
		}

		public void switchToFineNoticesTab() {
			uIMapTrafficWI.parkingEntry.uIFineNoticesTab.click();
		}

		public void switchToPaymentsTab() {
			uIMapTrafficWI.parkingEntry.uIPaymentsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmParkPayment");
		}

		public void switchToHistoryTab() {
			uIMapTrafficWI.parkingEntry.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmParkingNotes");
		}

		public void switchToCommentsTab() {
			uIMapTrafficWI.parkingEntry.uICommentsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void closeParkingEntryScreen() {
			uIMapTrafficWI.parkingEntry.driver.close();
		}

		public void verifyStatusAsIssued() {
			WebElement status = uIMapTrafficWI.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual(status.getText(), "Issued");
		}

		public void verifyStatusInYellowColor() {
			String Status = uIMapTrafficWI.parkingEntry.uIStatusTextView.getAttribute("style");
			verify.ExpectedValueIsTrue(Status.contains("yellow"));
		}

		public void verifyCurrentDate() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.parkingEntry.uIViolationDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));
		}

		public void enterIssueDate() {
			uIMapTrafficWI.parkingEntry.uIIssueDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyIssueDate() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.parkingEntry.uIIssueDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));

		}

		public void clickSaveButton() {
			uIMapTrafficWI.parkingEntry.uISaveButton.click();
		}

		public void verifyTicketRequiredAckMsg() {
//				popup.acknowledge.okWithExpectedMessage("(10035) Ticket # required");
			popup.acknowledge.okWithExpectedMessage("(10035) Ticket No required");
		}

		public void enterAtTicketNo() {
			Playback.gridLoadThreadWait();
			uIMapTrafficWI.parkingEntry.uITicketNumberEdit.sendKeys(PoliceData.getTrafficWIModuleValue("TicketNo"));
		}

		public void enterAtTicketNo1() {
			Playback.gridLoadThreadWait();
			uIMapTrafficWI.parkingEntry.uITicketNumberEdit.sendKeys(PoliceData.getTrafficWIModuleValue("TicketNo1"));
		}

		public void verifyStatusAsOnHold() {
			Playback.pageLoadThreadWait();
			WebElement status = uIMapTrafficWI.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("On - Hold", status.getText());
		}

		public void verifyStatusAsFirstNotice() {
			WebElement status = uIMapTrafficWI.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("First Notice", status.getText());
		}

		public void verifyStatusAsSecondNotice() {
			WebElement status = uIMapTrafficWI.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("Second Notice", status.getText());
		}

		public void verifyStatusAsSuspension() {
			WebElement status = uIMapTrafficWI.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("Suspension", status.getText());
		}

		public void verifyStatusAsCitation() {
			WebElement status = uIMapTrafficWI.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("Citation", status.getText());
		}

		public void verifyStatusAsPaid() {
			WebElement status = uIMapTrafficWI.parkingEntry.uIStatusTextView;
			verify.ExpectedPropertyValueIsEqual("PAID", status.getText());
		}

		public void verifyStatusAsRedColor() {

			String status = uIMapTrafficWI.parkingEntry.uIStatusTextView.getAttribute("style");
			verify.ExpectedValueIsTrue(status.contains("red"));
		}

		public void verifyStatusAsGreenColor() {
			String status = uIMapTrafficWI.parkingEntry.uIStatusTextView.getAttribute("style");
			verify.ExpectedValueIsTrue(status.contains("green"));
		}

		public void verifyIconsInMenyGreyedOutExceptPrintIcon() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.parkingEntry.uISaveButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.parkingEntry.uISaveAndCloseButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.parkingEntry.uISaveAndAddNewButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(uIMapTrafficWI.parkingEntry.uIPrintButton.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.parkingEntry.uIResetButton.getAttribute("disabled").contains("true"));
		}

		public void verifyDefendant1NameEmpty() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.clear();
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeEdit.clear();
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1LastNameEdit.clear();
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit.clear();
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.getText());
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeEdit.getText());
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1LastNameEdit.getText());
			verify.ExpectedPropertyValueIsEqual("",
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit.getText());
		}

		public void enterAtLastName() {
			uIMapTrafficWI.citationEntry.uILastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapTrafficWI.citationEntry.uIFirstNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("FirstName"));
			uIMapTrafficWI.citationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void savePrintButton() {
			uIMapTrafficWI.citationEntry.uISavePrintButton.click();
			popup.confirm.yes();
		}

		public void clickSavePrintButton() {
			uIMapTrafficWI.citationEntry.uISavePrintButton.click();
		}

		public void verifyHistroyCopyButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICopyButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICopyButton.isDisplayed());
		}

		public void clickPrintButton() {
			Playback.controlReadyThreadWait();
			uIMapTrafficWI.citationEntry.uIPrintButton.click();
		}

		public void verifyCENoFieldEmpty() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICENoEdit.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapTrafficWI.citationEntry.uICEYearEdit.getAttribute("value").contains(""));
		}

		public void verifyInitialFineAmountAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(10039) Initial fine amount required. Please check Notices tab");
		}

		public void verifyCitationAmountNotSpecifiedAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedContainMessage("Citation fine amount is not specified for");
		}

		public void enterAtCallNo() {
			Playback.controlReadyThreadWait();
			uIMapTrafficWI.parkingEntry.uICallYearEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CallNo").substring(0, 2));
			uIMapTrafficWI.parkingEntry.uICallYearEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.parkingEntry.uICallNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CallNo").substring(3));
			uIMapTrafficWI.parkingEntry.uICallNumberEdit.sendKeys(Keys.TAB);
		}

		public void tabOutViolationDateAndTime() {
			uIMapTrafficWI.parkingEntry.uIViolationDateEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.parkingEntry.uIViolationTimeEdit.sendKeys(Keys.TAB);

		}
	}

	public class Defendant1 {

		public void enterRandomNameType() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeEdit.sendKeys("A");
		}

		public void enterRandomNameTypeID() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.sendKeys("");
		}

		public void enterLastNameAtWarrantLastName() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1LastNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("WarrantLastName"));
		}

		public void enterFirstNameAtWarrantFirstName() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("WarrantFirstName"));
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNameID() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeEdit.clear();
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(3));
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void selectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void verifyWarrantIconButton() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.parkingEntry.defendant1.uIWarrantIconButton.getAttribute("src").contains("warrant"));
		}

		public void enterAtDefendant1LastName() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1LastNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Defendant1LastName"));

		}

		public void enterAtDefendant1FirstName() {
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Defendant1FirstName"));
			uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit.sendKeys(Keys.TAB);
		}

		public void verifyLastNameInNameEntryScreen() {
			String lastName = uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1LastNameEdit.getAttribute("value");
			uIMapTrafficWI.parkingEntry.defendant1.uINameInfoIcon.click();
			// Names.SwitchToNameEntry();
			// Names.NameEntry.VerifyLastName(lastName);
			// Names.NameEntry.SaveNCloseScreen();

		}

		public void verifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Address"),
					uIMapTrafficWI.parkingEntry.defendant1.uIAddressEdit.getAttribute("value"));
		}

		public void selectNameByDefendant1LastFirstName() {
			/*
			 * Names.SwitchToNameSearchHelpWindow(); Playback.gridLoadThreadWait();
			 * objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
			 * uIMapNames.nameSearchHelpWindow.uIResultTable,
			 * PoliceData.getTrafficWIModuleValue("Defendant1LastName") + ", " +
			 * PoliceData.getTrafficWIModuleValue("Defendant1FirstName"));
			 * PnxBaseTest.UIMapNames.NameSearchHelpWindow.uISelectNameButton.click();
			 * Playback.threadWait(); Playback.waitForPageLoad();
			 */

		}

		public void clickNameInfoIcon() {
			uIMapTrafficWI.parkingEntry.defendant1.uINameInfoIcon.click();

		}

		public void verifyAtDefendant1NameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant1").substring(0, 1),
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant1").substring(2),
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1NameTypeIDEdit.getAttribute("value"));
		}

		public void verifyDefendant1AtDefendant1LastNameFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant1LastName"),
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1LastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant1FirstName"),
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit.getAttribute("value"));
		}

		public void verifyDefendant1AtDefendant2LastNameFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant2LastName"),
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1LastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant2FirstName"),
					uIMapTrafficWI.parkingEntry.defendant1.uIDefendant1FirstNameEdit.getAttribute("value"));
		}
	}

	public class Defendant2 {

		public void enterAtDefendant2LastName() {
			uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2LastNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Defendant2LastName"));

		}

		public void enterAtDefendant2FirstName() {
			uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2FirstNameEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Defendant2FirstName"));
			uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2FirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectNameByDefendant2LastFirstName() {
			/*
			 * Names.SwitchToNameSearchHelpWindow(); Playback.gridLoadThreadWait();
			 * objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
			 * PnxBaseTest.UIMapNames.NameSearchHelpWindow.uIResultTable,
			 * PoliceData.getTrafficWIModuleValue("Defendant2LastName").ToString() + ", " +
			 * PoliceData.getTrafficWIModuleValue("Defendant2FirstName"));
			 * PnxBaseTest.UIMapNames.NameSearchHelpWindow.uISelectNameButton.click();
			 * Playback.threadWait(); Playback.waitForPageLoad();
			 */

		}

		public void verifyAtDefendant2NameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant2").substring(0, 1),
					uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2NameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant2").substring(2),
					uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2NameTypeIDEdit.getAttribute("value"));
		}

		public void verifyDefendant2AtDefendant2LastNameFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant2LastName"),
					uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2LastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Defendant2FirstName"),
					uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2FirstNameEdit.getAttribute("value"));
		}

		public void verifyDefendant2Empty() {
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2LastNameEdit.getAttribute("value") == "");
			verify.ExpectedValueIsTrue(
					uIMapTrafficWI.parkingEntry.defendant2.uIDefendant2FirstNameEdit.getAttribute("value") == "");
		}
	}

	public class ParkingEntryMainTab {

		public void enterRandomCourtDate() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uICourtDateEdit.sendKeys("12/02/2015");
		}

		public void enterRansomCourtTime() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uICourtTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterOfficerID() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOfficerEdit.sendKeys("PRMS");
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void selectRandomOfficerID() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOfficerLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterRandomPlateNumber() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit.sendKeys("T1");
		}

		public void selectRandomVehicle() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIPlateNumberLookupButton.click();
			// Vehicle.VehicleBoatSearchHelpWindow.SelectVehicle();
		}

		public void enterRandomViolation() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIViolationEdit.sendKeys("100.03(22)(b)");
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIViolationEdit.sendKeys(Keys.TAB);
		}

		public void enterRandomLocation() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uILocationEdit.sendKeys("ba");
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uILocationCheckBox.sendKeys(Keys.TAB);
			// Geo.CommonNameHelp.SelectCommonName();
		}

		public void verifyOfficerRequiredAckMsg() {

			popup.acknowledge.okWithExpectedMessage("(10008) Officer is required");
		}

		public void enterAtOfficer() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOfficerEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Officer"));
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void verifyPlateOrHullRequiredAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(9006) Plate No or Hull No is required");
//				popup.acknowledge.okWithExpectedMessage("(9006) Plate # or Hull # is required");
		}

		public void enterAtPlateNumber() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIPlateNumberEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("PlateNumber"));
		}

		public void enterAtPlateState() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox
					.sendKeys(PoliceData.getTrafficWIModuleValue("PlateState"));
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIPlateStateComboBox.sendKeys(Keys.TAB);
		}

		public void verifyChargeRequiredAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(6515) Charge is Required");
		}

		public void enterAtViolation() {

			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIViolationEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Violation"));
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIViolationEdit.sendKeys(Keys.TAB);

		}

		public void verifyLocationRequiredAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(10007) Location is required");

		}

		public void enterAtLocation() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uILocationEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Location"));
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uILocationEdit.sendKeys(Keys.TAB);

		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uILocationEdit.getAttribute("value"),
					(PoliceData.getTrafficWIModuleValue("Location")));

		}

		public void clickVehicleInfoIcon() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIPlateInfoIcon.click();

		}

		public void verifyAtYear() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Year"),
					uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIYearEdit.getAttribute("value"));
		}

		public void verifyAtMake() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Make"),
					uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIMakeEdit.getAttribute("value"));
		}

		public void verifyAtModel() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Model"),
					uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIModelEdit.getAttribute("value"));
		}

		public void verifyAtStyle() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Style"),
					uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIStyleEdit.getAttribute("value"));
		}

		public void verifyAtCharge() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Charge"),
					uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIViolationEdit.getAttribute("value"));

		}

		public void clickOnHoldCheckBox() {
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOnHoldCheckBox.click();

		}

		public void clickUnCheckOnHoldCheckBox() {
			WebElement OnHold = uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOnHoldCheckBox;
			if (OnHold.isSelected() == false) {
				OnHold.click();
			}

		}

		public void verifyExpiresFieldEnable() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIExpiresDateEdit.isEnabled());

		}

		public void verifyExpirationDateRequiredAckMsg() {

			popup.acknowledge.okWithExpectedMessage("(10045) Expiration Date is required to hold the ticket");
		}

		public void enterExpires1DayFutureFromCurrentDate() {

			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIExpiresDateEdit.sendKeys(Randomized.getFutureDate(1));
			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIExpiresDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickOnHoldInfoIcon() {

			uIMapTrafficWI.parkingEntry.parkingEntryMainTab.uIOnHoldInfoIcon.click();
		}

	}

	public class FineNoticesTab {

		public void enterInitialAmount() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit.click();
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit.sendKeys(Randomized.randomNumberString(3));
		}

		public void enterAtInitialAmount1() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit.click();
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("InitialFine1"));
		}

		public void checkTicketVoid() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uITicketVoidCheckBox.click();
		}

		public void enterReason() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uITicketVoidedEdit.sendKeys("");
		}

		public void selectRandomAuthorizedBy() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIAuthorisedByLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyAtDefaultInitialFine() {

			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("InitialFine"));
		}

		public void verifyAtDefaultFirstAdjustment() {

			WebElement FirstAdjust = uIMapTrafficWI.parkingEntry.fineNoticesTab.uIFirstAdjustmentText;
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("1stAdjustment"),
					FirstAdjust.getText());
		}

		public void verifyAtDefaultSecondAdjustment() {

			WebElement SecondAdjust = uIMapTrafficWI.parkingEntry.fineNoticesTab.uISecondAdjustmentText;
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("2ndAdjustment"),
					SecondAdjust.getText());
		}

		public void verifyAtDefaultThirdAdjustment() {

			WebElement ThirdAdjust = uIMapTrafficWI.parkingEntry.fineNoticesTab.uIThirdAdjustmentText;
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("3rdAdjustment"),
					ThirdAdjust.getText());
		}

		public void enterAtFirstAdjustmentValue() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIFirstAdjustmentEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"));

		}

		public void enterFirstNoticeAsCurrentDate() {

			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIFirstNoticeDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void verifyGreyedOutFirstAdjustmentField() {

			verify.ExpectedValueIsTrue(!uIMapTrafficWI.parkingEntry.fineNoticesTab.uIFirstAdjustmentEdit.isEnabled());
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uIFirstAdjustmentEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"));

		}

		public void verifyFirstTotalAmtDueValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment);
			String TotalAmount = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(TotalAmount, 4, "."),
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uITotalAmountDueEdit.getAttribute("value"));
		}

		public void verifyFirstCurrentBalanceValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment);
			String CurrentBalance = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(CurrentBalance, 4, "."),
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"));
		}

		public void enterAtSecondAdjustmentValue() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uISecondAdjustmentEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("2ndAdjustmentValue"));

		}

		public void enterSecondNoticeAsCurrentDate() {

			uIMapTrafficWI.parkingEntry.fineNoticesTab.uISecondNoticeDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void verifyGreyedOutSecondAdjustmentField() {

			verify.ExpectedValueIsTrue(!uIMapTrafficWI.parkingEntry.fineNoticesTab.uISecondAdjustmentEdit.isEnabled());
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uISecondAdjustmentEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("2ndAdjustmentValue"));

		}

		public void verifySecondTotalAmtDueValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment);
			String TotalAmount = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(TotalAmount, 4, "."),
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uITotalAmountDueEdit.getAttribute("value"));

		}

		public void verifySecondCurrentBalanceValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment);
			String CurrentBalance = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(CurrentBalance, 4, "."),
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"));
		}

		public void enterAtThirdAdjustmentValue() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIThirdAdjustmentEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("3rdAdjustmentValue"));

		}

		public void enterSuspensionNoticeAsCurrentDate() {

			uIMapTrafficWI.parkingEntry.fineNoticesTab.uISuspensionNoticeDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void verifyGreyedOutThirdAdjustmentField() {

			verify.ExpectedValueIsTrue(!uIMapTrafficWI.parkingEntry.fineNoticesTab.uIThirdAdjustmentEdit.isEnabled());
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uIThirdAdjustmentEdit.getAttribute("value"),
					PoliceData.getTrafficWIModuleValue("3rdAdjustmentValue"));

		}

		public void verifyThirdTotalAmtDueValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			String ThirdAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("3rdAdjustmentValue"), 0, 1);
			String ThirdAdjustment = Randomized.removeCharAt(ThirdAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment) + Integer.parseInt(ThirdAdjustment);
			String TotalAmount = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(TotalAmount, 4, "."),
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uITotalAmountDueEdit.getAttribute("value"));

		}

		public void verifyThirdCurrentBalanceValue() {
			String fine = Randomized.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("InitialFine"), 0, 1);
			String InitialFine = Randomized.removeCharAt(fine, 3);

			String FirstAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("1stAdjustmentValue"), 0, 1);
			String FirstAdjustment = Randomized.removeCharAt(FirstAdjust, 2);

			String SecondAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("2ndAdjustmentValue"), 0, 1);
			String SecondAdjustment = Randomized.removeCharAt(SecondAdjust, 2);

			String ThirdAdjust = Randomized
					.removeStringByIndexCount(PoliceData.getTrafficWIModuleValue("3rdAdjustmentValue"), 0, 1);
			String ThirdAdjustment = Randomized.removeCharAt(ThirdAdjust, 2);

			int total = Integer.parseInt(InitialFine) + Integer.parseInt(FirstAdjustment)
					+ Integer.parseInt(SecondAdjustment) + Integer.parseInt(ThirdAdjustment);
			String CurrentBalance = Randomized.insertStringByIndex(Integer.toString(total), 0, "$");

			verify.ExpectedPropertyValueIsEqual(Randomized.insertStringByIndex(CurrentBalance, 4, "."),
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"));

		}

		public void clickCitationIssuedCheckBox() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uICitationIssuedCheckBox.click();

		}

		public void enterAtCitationNo() {

			uIMapTrafficWI.parkingEntry.fineNoticesTab.uICitationIssuedEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CitationNo"));
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uICitationIssuedEdit.sendKeys(Keys.TAB);
		}

		public void clickCitationInfoIcon() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uICitationInfoIcon.click();
		}

		public void verifyCurrentBalanceValueAsZero() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapTrafficWI.parkingEntry.fineNoticesTab.uICurrentBalanceEdit.getAttribute("value"), "$0.00");

		}

		public void verifyCitationIssuedFieldGreyedOut() {

			verify.ExpectedValueIsTrue(uIMapTrafficWI.parkingEntry.fineNoticesTab.uICitationIssuedEdit
					.getAttribute("readonly").contains("true"));
		}

		public void verifyTicketVoidedFieldGreyedOut() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.parkingEntry.fineNoticesTab.uITicketVoidedEdit
					.getAttribute("class").contains("textboxInactive"));

		}

		public void enterAtInitialAmount() {
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit.click();
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("InitialFine"));
			uIMapTrafficWI.parkingEntry.fineNoticesTab.uIInitialFineEdit.sendKeys(Keys.TAB);

		}
	}

	public class PaymentsTab {

		public void clickAddotherPaymentsButton() {
			uIMapTrafficWI.parkingEntry.paymentsTab.uIAddOtherPaymentButton.click();
		}

		public void verifyTypeAsCreditAdjustment(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Credit Adjustment",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.parkingEntry.paymentsTab.uIPaymentsTabGridTable, "Type", rowIndex));
		}

		public void tabOutViolationDateAndTime() {
			uIMapTrafficWI.parkingEntry.uIViolationDateEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.parkingEntry.uIViolationTimeEdit.sendKeys(Keys.TAB);

		}

		public void verifyTypeAsCashInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Cash", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapTrafficWI.parkingEntry.paymentsTab.uIPaymentsTabGridTable, "Type", rowIndex));
		}
	}

	public class ParkingOtherPayment {

		public void enterPayMents() {
			uIMapTrafficWI.parkingOtherPayment.uIPaymentEdit.click();
		}

		public void selectPaymentmethosAsCash() {
			uIMapTrafficWI.parkingOtherPayment.uIPaymentMethodComboBox.sendKeys("1 - Cash");
		}

		public void enterRandomRemarks() {
			uIMapTrafficWI.parkingOtherPayment.uIRemarksEdit.sendKeys("Paid Cash Amount");
		}

		public void savetheScreen() {
			uIMapTrafficWI.parkingOtherPayment.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveandClosetheScreen() {
			uIMapTrafficWI.parkingOtherPayment.uISaveAndCloseButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void enterAtPayment() {
			uIMapTrafficWI.parkingOtherPayment.uIPaymentEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Payment"));
		}

		public void selectAtPaymentMethod() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.parkingOtherPayment.uIPaymentMethodComboBox,
					PoliceData.getTrafficWIModuleValue("PaymentMethod"));

		}

		public void tabDate() {
			uIMapTrafficWI.parkingOtherPayment.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void selectPaymentmethodAsCreditAdjustment() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.parkingOtherPayment.uIPaymentMethodComboBox, "18 - Credit Adjustment");
		}

		public void enterRemarksAsCreditAdjustmentAmount() {
			uIMapTrafficWI.parkingOtherPayment.uIRemarksEdit.sendKeys("Credit Adjustment Amount Paid");
		}
	}

	public class ParkingEntryHistoryTab {

		public void verifyTicketOnHoldReason() {
			String reason = uIMapTrafficWI.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Ticket On-Hold Reason"));

		}

		public void verifyPaymentReceipt() {
			String reason = uIMapTrafficWI.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Payment [Receipt#"));

		}

		public void verifyCreditAdjustment() {
			String reason = uIMapTrafficWI.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Credit Adjustment"));

		}

		public void verifyAtPayment() {
			String reason = uIMapTrafficWI.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains(PoliceData.getTrafficWIModuleValue("Payment")));
		}

		public void verifyRemarksCreditAdjustmentAmount() {
			String reason = uIMapTrafficWI.parkingEntry.parkingEntryHistoryTab.uIHistoryTable.getText();
			verify.ExpectedValueIsTrue(reason.contains("Credit Adjustment Amount Paid"));

		}

	}

	public class CommentsTab {

		public void enterSubject(String subject) {

			uIMapTrafficWI.parkingEntry.commentsTab.uISubjectEdit.sendKeys(Randomized.randomString(10));
			Playback.waitForPageLoad();
			subject = uIMapTrafficWI.parkingEntry.commentsTab.uISubjectEdit.getAttribute("value");
		}

		public void clickEnterComments() {
			uIMapTrafficWI.parkingEntry.commentsTab.uIEnterCommentsButton.click();

		}

		public void verifySubjectInGrid(String subject, int rowIndex) {

			WebElement commentsTable = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingEntry.commentsTab.uICommentsTable, "Subject", rowIndex);
			verify.ExpectedPropertyValueIsEqual(subject, commentsTable.getText());
		}

		public void enterAtSubject() {
			uIMapTrafficWI.parkingEntry.commentsTab.uISubjectEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Subject"));
		}

		public void verifyAtSubjectInGrid(int rowIndex) {
			WebElement commentsTable = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingEntry.commentsTab.uICommentsTable, "Subject", rowIndex);
			verify.ExpectedValueIsTrue(commentsTable.getText().contains(PoliceData.getTrafficWIModuleValue("Subject")));
		}
	}

	public class ParkingSearch {

		public void clickAddNewButton() {

			uIMapTrafficWI.parkingSearch.uIAddNewButton.click();

		}

		public void selectAtDateType() {
			uIMapTrafficWI.parkingSearch.uIDataTypeComboBox.sendKeys(PoliceData.getTrafficWIModuleValue("DateType"));
			uIMapTrafficWI.parkingSearch.uIDataTypeComboBox.sendKeys(Keys.TAB);

		}

		public void enterDataTypeFromAsCurrentDate() {
			uIMapTrafficWI.parkingSearch.uIDataTypeFromDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void enterDataTypeToAsCurrentDate() {
			uIMapTrafficWI.parkingSearch.uIDataTypeToDateEdit.sendKeys(Randomized.getCurrentDate());

		}

		public void selectAtAdjustmentLevel() {
			uIMapTrafficWI.parkingSearch.uIAdjustmentLevelComboBox
					.sendKeys(PoliceData.getTrafficWIModuleValue("AdjustmentLevel"));

		}

		public void enterAtTicketNo() {
			Playback.gridLoadThreadWait();
			uIMapTrafficWI.parkingSearch.uITicketEdit.sendKeys(PoliceData.getTrafficWIModuleValue("TicketNo"));
			uIMapTrafficWI.parkingSearch.uITicketEdit.sendKeys(Keys.TAB);

		}

		public void clickSearchButton() {
			uIMapTrafficWI.parkingSearch.uISearchButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyAtTicketNo() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("TicketNo"));
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficWIModuleValue("TicketNo")));
		}

		public void verifyAtStatusByAtTicketNo() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("TicketNo"));
			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, uIRow, "Status");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("Status"), Status.getText());

		}

		public void verifyStatusAsPaidByAtTicketNo() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("TicketNo"));
			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, uIRow, "Status");
			verify.ExpectedPropertyValueIsEqual("PAID", Status.getText());
		}

		public void verifyDefendantEmptyByAtTicketNo() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("TicketNo"));

			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, uIRow, "Defendant");
			verify.ExpectedPropertyValueIsEqual("", Status.getText());

		}

		public void verifyAtStatus() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("Status"));
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficWIModuleValue("Status")));
		}

		public void verifyAtStatus(int rowIndex) {
			String uIRow = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, "Status", rowIndex);
			verify.ExpectedValueIsTrue(uIRow.contains(PoliceData.getTrafficWIModuleValue("Status")));
		}

		public void verifyAtBalance(int rowIndex) {
			String uIRow = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, "Balance", rowIndex);
			verify.ExpectedValueIsTrue(uIRow.contains(PoliceData.getTrafficWIModuleValue("BalanceFine")));
		}

		public void verifyAtDefedant2() {

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("Defedant2"));
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficWIModuleValue("Defedant2")));

		}

		public void verifyDefendantNameByAtTicketNo() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("TicketNo"));

			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, uIRow, "Defendant");
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficWIModuleValue("Name")));

		}

		public void selectRowByAtTicketNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("TicketNo"));

		}

		public void selectRowByAtDefendant2() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("Defedant2"));
		}

		public void selectRowByAtDefendant() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("Defendant"));

		}

		public void verifyAtChargeByAtTicketNo() {
			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("TicketNo"));

			WebElement Status = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, uIRow, "Charge");
			verify.ExpectedValueIsTrue(uIRow.getText().contains(PoliceData.getTrafficWIModuleValue("Charge")));
		}

		public void enterAtOfficer() {
			uIMapTrafficWI.parkingSearch.uIOfficerEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Officer"));
			uIMapTrafficWI.parkingSearch.uIOfficerEdit.sendKeys(Keys.TAB);

		}

		public void enterAtViolation() {
			uIMapTrafficWI.parkingSearch.uIViolationCodeEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Violation"));
		}

		public void enterAtDefendant2LastName() {
			uIMapTrafficWI.parkingSearch.uILastNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Defedant2Last"));
		}

		public void enterAtDefendant2FirstName() {
			uIMapTrafficWI.parkingSearch.uIFirstNameEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Defedant2First"));
			uIMapTrafficWI.parkingSearch.uIFirstNameEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.parkingSearch.uIMiddleNameEdit.sendKeys(Keys.TAB);

		}

		public void enterAtNameID() {
			uIMapTrafficWI.parkingSearch.uINameIDTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.parkingSearch.uINameIDTypeEdit.sendKeys(Keys.TAB);
			uIMapTrafficWI.parkingSearch.uINameIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(3));
			uIMapTrafficWI.parkingSearch.uINameIDEdit.sendKeys(Keys.TAB);

		}

		public void selectNameByDefendant2LastFirstName() {
//				names.switchToNameSearchHelpWindow();
//				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
//					uIMapNames.nameSearchHelpWindow.nameSearchHelpWindow.uIResultTable,
//						PoliceData.getTrafficWIModuleValue("Name"));
//				PnxBaseTest.UIMapNames.NameSearchHelpWindow.uISelectNameButton.click();
//				Playback.threadWait();
//				Playback.waitForPageLoad();

		}

		public void enterAtPlateNumber() {
			uIMapTrafficWI.parkingSearch.uIPlateNumberEdit.sendKeys(PoliceData.getTrafficWIModuleValue("PlateNumber"));

		}

		public void selectAtPlateState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.parkingSearch.uIPlateStateComboBox,
					PoliceData.getTrafficWIModuleValue("PlateState"));
		}

		public void verifyAtDefendant() {
			WebElement uICell = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapTrafficWI.parkingSearch.uIParkingSearchTable, PoliceData.getTrafficWIModuleValue("Defendant"));
			verify.ExpectedValueIsTrue(uICell.getText().contains(PoliceData.getTrafficWIModuleValue("Defendant")));
		}

		public void enterAtParkingNoFromField() {
			uIMapTrafficWI.parkingSearch.uIParkingNumberFromYear
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNo").substring(0, 2));
			uIMapTrafficWI.parkingSearch.uIParkingNumberFromNumber
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNo").substring(3));
		}

		public void enterAtParkingNoToField() {
			uIMapTrafficWI.parkingSearch.uIParkingNumberToYear
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNo").substring(0, 2));
			uIMapTrafficWI.parkingSearch.uIParkingNumberToNumber
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNO").substring(3));
		}

		public void verifyAtParkingNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("ParkingNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable,
							PoliceData.getTrafficWIModuleValue("ParkingNo")).getText());
		}

		public void MouseHoverOnDefendant(int rowIndex) {
			WebElement row = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, "Defendant", rowIndex);

			Actions action = new Actions(Playback.driver);
			action.moveToElement(row).perform();
			Playback.threadWait();
		}

		public void clickRefreshButton() {
			uIMapTrafficWI.parkingSearch.uIRefreshButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyAtDefendant1LastNameFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficWIModuleValue("Defendant1LastName") + ", "
							+ PoliceData.getTrafficWIModuleValue("Defendant1FirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.parkingSearch.uIParkingSearchTable, "Defendant", rowIndex));
		}

		public void verifyAtDefendant2LastNameFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getTrafficWIModuleValue("Defendant2LastName") + ", "
							+ PoliceData.getTrafficWIModuleValue("Defendant2FirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapTrafficWI.parkingSearch.uIParkingSearchTable, "Defendant", rowIndex));

		}

		public void enterAtParkingFromField() {
			uIMapTrafficWI.parkingSearch.uIParkingNumberFromYear
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNo").substring(0, 2));
			uIMapTrafficWI.parkingSearch.uIParkingNumberFromNumber
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNo").substring(3));
		}

		public void enterAtParkingToField() {
			uIMapTrafficWI.parkingSearch.uIParkingNumberToYear
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNo").substring(0, 2));
			uIMapTrafficWI.parkingSearch.uIParkingNumberToNumber
					.sendKeys(PoliceData.getTrafficWIModuleValue("ParkingNo").substring(3));
		}

		public void VerifyAtParkingNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("ParkingNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable,
							PoliceData.getTrafficWIModuleValue("ParkingNo")).getText());
		}

		public void MouseHoverOnDefendant() {
			WebElement row = objectIdentification.manualIdentify
					.getGridCell(uIMapTrafficWI.parkingSearch.uIParkingSearchTable, "Defendant", 0);
			Actions action = new Actions(Playback.driver);
			action.moveToElement(row).perform();
			Playback.threadWait();
		}

	}

	public class TicketHoldReason {

		public void enterReason() {

			uIMapTrafficWI.ticketHoldReason.uIReasonEdit.sendKeys(Randomized.randomAlphanumeric(10));
		}

		public void save() {
			uIMapTrafficWI.ticketHoldReason.uISaveButton.click();
			popup.confirm.yes();

		}

		public void close() {
			uIMapTrafficWI.ticketHoldReason.driver.close();

		}

	}

	public class UnitDetails {

		public UnitDetailsDriverTab unitDetailsDriverTab;
		public UnitDetailsVehicleTab unitDetailsVehicleTab;
		public InsuranceSchoolTab insuranceSchoolTab;

		public UnitDetails() {
			if (unitDetailsDriverTab == null)
				unitDetailsDriverTab = new UnitDetailsDriverTab();

			if (unitDetailsVehicleTab == null)
				unitDetailsVehicleTab = new UnitDetailsVehicleTab();

			if (insuranceSchoolTab == null)
				insuranceSchoolTab = new InsuranceSchoolTab();

		}

		public void saveScreen() {
			uIMapTrafficWI.unitDetails.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void close() {
			uIMapTrafficWI.unitDetails.driver.close();
		}

		public void verifyAtTracsRefNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(0, 2),
					uIMapTrafficWI.unitDetails.uITracsRefYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("TracsRefNo").substring(3),
					uIMapTrafficWI.unitDetails.uITracsRefNoEdit.getAttribute("value"));
		}

		public void clickDriverTab() {
			uIMapTrafficWI.unitDetails.uIDriverTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickVehicleTab() {
			uIMapTrafficWI.unitDetails.uIVehicleTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickInsuranceSchoolTab() {
			uIMapTrafficWI.unitDetails.uIInsuranceSchoolTab.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtUnitNo() {
			verify.ExpectedValueIsTrue(uIMapTrafficWI.unitDetails.uIUnitNoTextView.getText()
					.contains(PoliceData.getTrafficWIModuleValue("UnitNo")));
		}

	}

	public class UnitDetailsDriverTab {
		public void enterAtTotalOccupants() {
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uITotalOccupantsEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("TotalOccupants"));
		}

		public void selectDirectionOfTravel() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIDirTravelComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIDirTravelComboBox.sendKeys(Keys.TAB);
		}

		public void selectSpeedLimit() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uISpeedLimitComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uISpeedLimitComboBox.sendKeys(Keys.TAB);
		}

		public void selectOnDutyAccident() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIOnDutyAccidentComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIOnDutyAccidentComboBox.sendKeys(Keys.TAB);
		}

		public void selectDriverAction() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIDriverActionComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIDriverActionComboBox.sendKeys(Keys.TAB);
		}

		public void selectAirBag() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIAirBagComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIAirBagComboBox.sendKeys(Keys.TAB);
		}

		public void selectAlcoholTest() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIAlcoholTestComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIAlcoholTestComboBox.sendKeys(Keys.TAB);
		}

		public void clickDriverFactor() {
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIDriverFactorButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickHWYFactor() {
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uIHWYFactorButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtNameID() {
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uINameTypeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1));
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uINameIDEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("NameID").substring(2));
		}

		public void selectTrafficControl() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uITrafficControlComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsDriverTab.uITrafficControlComboBox.sendKeys(Keys.TAB);
		}
	}

	public class UnitDetailsVehicleTab {
		public void enterAtVehicle() {
			uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uIVehicleEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("Vehicle"));
		}

		public void selectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uIStateComboBox,
					PoliceData.getTrafficWIModuleValue("State"));
			uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
		}

		public void selectVehicleDamage() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uIVehicleDamageComboBox);
			uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uIVehicleDamageComboBox.sendKeys(Keys.TAB);
		}

		public void clickTowedDueToDamageCheckbox() {
			uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uITowedDueDamageCheckBox.click();
		}

		public void clickVehicleOwnerSameOperatorCheckbox() {
			uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uIVehicleOwnerSameOperatorCheckBox.click();
		}

		public void clickVehicleFactor() {
			uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uIVehicleFactorButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1),
					uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("NameID").substring(2),
					uIMapTrafficWI.unitDetails.unitDetailsVehicleTab.uINameIDEdit.getAttribute("value"));
		}
	}

	public class InsuranceSchoolTab {

		public void selectInsuranceCompany() {
			uIMapTrafficWI.unitDetails.insuranceSchoolTab.uIInsuranceCompanyLookupButton.click();
			Playback.controlReadyThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void clickPolicyHolderSameOwnerCheckbox() {
			uIMapTrafficWI.unitDetails.insuranceSchoolTab.uIPolicyHolderSameOwnerCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("NameID").substring(0, 1),
					uIMapTrafficWI.unitDetails.insuranceSchoolTab.uIPolicyHolderNameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getTrafficWIModuleValue("NameID").substring(2),
					uIMapTrafficWI.unitDetails.insuranceSchoolTab.uIPolicyHolderNameIDEdit.getAttribute("value"));
		}

		public void clickBusTravellingFromRadioButton() {
			uIMapTrafficWI.unitDetails.insuranceSchoolTab.uIBusTravellingFromRadioButton.click();
		}

		public void enterSchoolName() {
			uIMapTrafficWI.unitDetails.insuranceSchoolTab.uISchoolNameEdit.sendKeys(Randomized.randomString(25));
		}
	}

	public class CrashEntryMoreScreen {
		public void selectDriverFactor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntryMoreScreen.uICodeCommentFactorsComboBox);
			uIMapTrafficWI.crashEntryMoreScreen.uICodeCommentFactorsComboBox.sendKeys(Keys.TAB);
		}

		public void selectHWYFactor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntryMoreScreen.uICodeCommentFactorsComboBox);
			uIMapTrafficWI.crashEntryMoreScreen.uICodeCommentFactorsComboBox.sendKeys(Keys.TAB);
		}

		public void selectVehicleFactor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapTrafficWI.crashEntryMoreScreen.uICodeCommentFactorsComboBox);
			uIMapTrafficWI.crashEntryMoreScreen.uICodeCommentFactorsComboBox.sendKeys(Keys.TAB);
		}

		public void clickAdd() {
			uIMapTrafficWI.crashEntryMoreScreen.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void saveScreen() {
			uIMapTrafficWI.crashEntryMoreScreen.uISaveButton.click();
			Playback.controlReadyThreadWait();
			// popUp.confirm.yes();
		}

		public void saveNCloseScreen() {
			uIMapTrafficWI.crashEntryMoreScreen.uISaveNCloseButton.click();
			Playback.controlReadyThreadWait();
			// popUp.confirm.yes();
		}
	}

	public class StruckObjects {
		public void selectAtUnitNo() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.struckObjects.uIUnitNoComboBox,
					PoliceData.getTrafficWIModuleValue("UnitNo"));
			uIMapTrafficWI.struckObjects.uIUnitNoComboBox.sendKeys(Keys.TAB);
		}

		public void selectStruckObject() {
			uIMapTrafficWI.struckObjects.uIStruckObjectsLookup.click();
			Playback.controlReadyThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void getStruckObjects(String struckObject) {
			struckObject = uIMapTrafficWI.struckObjects.uIStruckObjectsDescription.getAttribute("title");
		}

		public void clickAdd() {
			uIMapTrafficWI.struckObjects.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void saveScreen() {
			uIMapTrafficWI.struckObjects.uISaveButton.click();
			Playback.controlReadyThreadWait();
			// popUp.confirm.yes();
		}

		public void saveNCloseScreen() {
			uIMapTrafficWI.struckObjects.uISaveNCloseButton.click();
			Playback.controlReadyThreadWait();
			// popUp.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtstruckObjectUsingUnitNoInGrid(String struckObject) {
			verify.ExpectedPropertyValueIsEqual(struckObject,
					objectIdentification.manualIdentify
							.getGridCell(uIMapTrafficWI.struckObjects.uIStruckObjectsResultGrid,
									PoliceData.getTrafficWIModuleValue("UnitNo"), "Struck Object")
							.getText());
		}

		public String readStruckObjectDescription() {
			String attribute = uIMapTrafficWI.struckObjects.uIStruckObjectsDescription.getAttribute("title");
			return attribute;
		}

	}

	public class NamesComments {

		public void EnterCommentsAsGroupOfString() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.nameComments.uINameCommentsEdit).click();
			actions.sendKeys(randomized.randomString(150)).build().perform();
			Playback.controlReadyThreadWait();

		}

		public void Save() {
			uIMapHome.nameComments.uISaveButton.click();
			popup.confirm.yes();

		}

		public void SaveNClose() {
			uIMapHome.nameComments.uISaveNCloseButton.click();
			popup.confirm.yes();

		}

	}

	public class PaymentMethodScreen {

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapTrafficWI.paymentMethodScreen.uITypeComboBox,
					PoliceData.getTrafficWIModuleValue("Type"));
			uIMapTrafficWI.paymentMethodScreen.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtCreditCardNo() {
			uIMapTrafficWI.paymentMethodScreen.uICreditCardNoCodeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("CreditCardNo"));
			uIMapTrafficWI.paymentMethodScreen.uICreditCardNoCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtHolderName() {
			uIMapTrafficWI.paymentMethodScreen.uIHolderNameCodeEdit
					.sendKeys(PoliceData.getTrafficWIModuleValue("HolderName"));
			uIMapTrafficWI.paymentMethodScreen.uIHolderNameCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtExpiration() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.paymentMethodScreen.uIExpirationMonthComboBox,
					PoliceData.getTrafficWIModuleValue("ExpirationMonth"));
			uIMapTrafficWI.paymentMethodScreen.uIExpirationMonthComboBox.sendKeys(Keys.TAB);
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTrafficWI.paymentMethodScreen.uIExpirationYearComboBox,
					PoliceData.getTrafficWIModuleValue("ExpirationYear"));
			uIMapTrafficWI.paymentMethodScreen.uIExpirationYearComboBox.sendKeys(Keys.TAB);

		}

		public void enterAtBank() {
			uIMapTrafficWI.paymentMethodScreen.uIBankCodeEdit.sendKeys(PoliceData.getTrafficWIModuleValue("Bank"));
			uIMapTrafficWI.paymentMethodScreen.uIBankCodeEdit.sendKeys(Keys.TAB);
		}

		public void saveScreen() {
			uIMapTrafficWI.paymentMethodScreen.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapTrafficWI.paymentMethodScreen.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

	}

}
