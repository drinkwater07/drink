package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import dataAccess.PoliceData;
import uIMaps.UIMapPopup;
import uIMaps.UIMapWarrants;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Warrants {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapWarrants uIMapWarrants = new UIMapWarrants();
	public Popup popup = new Popup();
	public Names names = new Names();
	public Vehicle vehicle = new Vehicle();
	public UIMapPopup uIMapPopup = new UIMapPopup();

	public WarrantSearch warrantSearch;
	public WarrantEntry warrantEntry;
	public WarrantNamesSearch warrantNamesSearch;
	public WarrantDetails warrantDetails;
	public BatchClearance batchClearance;
	public WarrantType warrantType;
	public WarrantTypeEntry warrantTypeEntry;
	public WarrentEntryAuthenticatorWindow warrentEntryAuthenticatorWindow;

	public Warrants() {
		if ((this.warrantSearch == null)) {
			this.warrantSearch = new WarrantSearch();
		}
		if ((this.warrentEntryAuthenticatorWindow == null)) {
			this.warrentEntryAuthenticatorWindow = new WarrentEntryAuthenticatorWindow();
		}
		if ((this.warrantNamesSearch == null)) {
			this.warrantNamesSearch = new WarrantNamesSearch();
		}
		if ((this.warrantEntry == null)) {
			this.warrantEntry = new WarrantEntry();
		}
		if ((this.warrantDetails == null)) {
			this.warrantDetails = new WarrantDetails();
		}
		if ((this.batchClearance == null)) {
			this.batchClearance = new BatchClearance();
		}
		if ((this.warrantType == null)) {
			this.warrantType = new WarrantType();
		}
		if ((this.warrantTypeEntry == null)) {
			this.warrantTypeEntry = new WarrantTypeEntry();
		}

		if ((this.warrentEntryAuthenticatorWindow == null)) {
			this.warrentEntryAuthenticatorWindow = new WarrentEntryAuthenticatorWindow();
		}
	}

	public void Reset() {
		uIMapWarrants = null;
	}

	public void switchToWarrantSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Warrants/frmWarrantsInquiry");
	}

	public void switchToWarrantEntry() {
		objectIdentification.windowHandle.switchToWindow("Warrant Entry - 2810");
	}

	public void switchToWarrantDetails() {
		objectIdentification.windowHandle.switchToWindow("Warrant Details - 2851");
	}

	public void switchToWarrantNamesSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Warrants/frmWarrantsNMInquiry");
	}

	public void switchToBatchClearance() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmBatchClearance");
	}

	public void switchToWarrantType() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmWarrantTypeSrch");

	}

	public void switchToWarrantTypeEntry() {
		objectIdentification.windowHandle.switchToWindow("Warrant Type Entry");
	}

	public void switchToWarrantEntryAuthenticateWindow() {
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingURL("frmTraPFAuthenticate.aspx");
	}

	public class WarrentEntryAuthenticatorWindow {
		public void enterAtPassword() {
			uIMapWarrants.warrentEntryAuthenticatorWindow.uIPasswordEdit
					.sendKeys(PoliceData.getWarrantModuleValue("Password"));
		}

		public void clickAcceptButton() {
			Playback.controlReadyThreadWait();
			uIMapWarrants.warrentEntryAuthenticatorWindow.uIAcceptButton.click();
		}

		public void closeScreen() {
			uIMapWarrants.warrentEntryAuthenticatorWindow.driver.close();
		}

		public void enterAtInvalidPassword() {
			Playback.controlReadyThreadWait();
			uIMapWarrants.warrentEntryAuthenticatorWindow.uIPasswordEdit
					.sendKeys(PoliceData.getWarrantModuleValue("InvalidPassword"));
			uIMapWarrants.warrentEntryAuthenticatorWindow.uIPasswordEdit.sendKeys(Keys.TAB);
		}

		public void verifyInvalidUserNamePassAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1049 - Invalid User Name Password");
		}
	}

	public class WarrantEntry {

		public void EnterAtWarrantNumber() {
			uIMapWarrants.warrantEntry.uIWarrantYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(0, 2));
			uIMapWarrants.warrantEntry.uIWarrantNumberEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(3));
			uIMapWarrants.warrantEntry.uIWarrantNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtWarrantLastName() {
			uIMapWarrants.warrantEntry.uILastNameEdit.sendKeys(PoliceData.getWarrantModuleValue("WarrantLastName"));
		}

		public void EnterAtWarrantFirstName() {
			uIMapWarrants.warrantEntry.uIFirstNameEdit.sendKeys(PoliceData.getWarrantModuleValue("WarrantFirstName"));
			uIMapWarrants.warrantEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectWarrantName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void VerfiyLastNameInNameEntry() {
			String lastName = uIMapWarrants.warrantEntry.uILastNameEdit.getAttribute("value");
			uIMapWarrants.warrantEntry.uINameInfoIconButton.click();
			names.switchToNameEntry();
			names.nameEntry.VerifyLastName(lastName);
			names.nameEntry.closeTheScreen();

		}

		public void EnterIssuedDate() {
			uIMapWarrants.warrantEntry.uIIssuedDateEdit.click();
			uIMapWarrants.warrantEntry.uIIssuedDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterExpiredDate() {
			uIMapWarrants.warrantEntry.uIExpiredDateEdit.sendKeys(Randomized.getFutureDate(1));
		}

		public void EnterAtPlateNumber() {
			uIMapWarrants.warrantEntry.uIPlateNumberEdit.sendKeys(PoliceData.getWarrantModuleValue("PlateNumber"));
		}

		public void EnterAtState() {
			uIMapWarrants.warrantEntry.uIVehicleStateComboBox.sendKeys(PoliceData.getWarrantModuleValue("State"));
			uIMapWarrants.warrantEntry.uIVehicleStateComboBox.sendKeys(Keys.TAB);

		}

		public void SelectVehicle() {
			vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
		}

		public void EnterLastName() {
			uIMapWarrants.warrantEntry.uILastNameEdit.sendKeys("");
		}

		public void EnterNameType() {
			uIMapWarrants.warrantEntry.uINameTypeEdit.sendKeys("a");
		}

		public void EnterAtNameID() {
			uIMapWarrants.warrantEntry.uINameTypeEdit
					.sendKeys(PoliceData.getWarrantModuleValue("NameID").substring(0, 1));
			uIMapWarrants.warrantEntry.uINameIDEdit.sendKeys(PoliceData.getWarrantModuleValue("NameID").substring(2));
			uIMapWarrants.warrantEntry.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterNameID() {
			uIMapWarrants.warrantEntry.uINameIDEdit.sendKeys("");
		}

		public void SelectType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapWarrants.warrantEntry.uITypeComboBox);
		}

		public void SelectStatusType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapWarrants.warrantEntry.uIStatusComboBox);
		}

		public void EnterCourtWarrantNo() {
			uIMapWarrants.warrantEntry.uICourtWarrantNoEdit.sendKeys(Randomized.randomNumberString(3));
		}

		public void ClickWarrantIcon() {
			uIMapWarrants.warrantEntry.uIWarrantIconButton.click();
		}

		public void ClickALCIcon() {
			uIMapWarrants.warrantEntry.uIALCIconButton.click();
		}

		public void Save() {
			uIMapWarrants.warrantEntry.uISaveButton.click();
			popup.confirm.yes();
		}
		public void clickSave() {
			uIMapWarrants.warrantEntry.uISaveButton.click();
		}

		public void ClickReopen() {
			uIMapWarrants.warrantEntry.uIReopenButton.click();
		}

		public void CloseWarrantEntryScreen() {
			uIMapWarrants.warrantEntry.driver.close();
		}

		public void SaveandClose() {
			uIMapWarrants.warrantEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void SwitchToAllTabs() {
			uIMapWarrants.warrantEntry.uIMainTab.click();
			uIMapWarrants.warrantEntry.uIChargesTab.click();
			uIMapWarrants.warrantEntry.uIClearTab.click();
			uIMapWarrants.warrantEntry.uIStatusTab.click();
			uIMapWarrants.warrantEntry.uINotesTab.click();
			uIMapWarrants.warrantEntry.uIAttachmentsTab.click();
		}

		public void SwitchToClearTab() {
			uIMapWarrants.warrantEntry.uIClearTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmClear");
		}

		public void SwitchToStatusTab() {
			uIMapWarrants.warrantEntry.uIStatusTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmStatus");
		}

		public void SwitchToMainTab() {
			uIMapWarrants.warrantEntry.uIMainTab.click();
			Playback.pageLoadThreadWait();
		}

		public void SwitchToChargesTab() {
			uIMapWarrants.warrantEntry.uIChargesTab.click();
			Playback.pageLoadThreadWait();
		}

		public void SwitchToServiceTab() {
			uIMapWarrants.warrantEntry.uIServiceTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmService");
		}

		public void SwitchToNarrativeTab() {
			uIMapWarrants.warrantEntry.uINarrativeTab.click();
			Playback.pageLoadThreadWait();
		}

		public void SwitchToNotesTab() {
			uIMapWarrants.warrantEntry.uINotesTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNotes");
		}

		public void clickRefreshButton() {
			uIMapWarrants.warrantEntry.uIResetButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();

		}

		public void SwitchToHistoryTab() {
			uIMapWarrants.warrantEntry.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickCourtWarrantNoTextView() {
			uIMapWarrants.warrantEntry.uICourtWarrantNoTextView.click();
		}

		public void ClickDocketNoTextView() {
			uIMapWarrants.warrantEntry.uIDocketNoTextView.click();
		}

		public void ClickCustom1TextView() {
			uIMapWarrants.warrantEntry.uICustom1TextView.click();
		}

		public void ClickCustom2TextView() {
			uIMapWarrants.warrantEntry.uICustom2TextView.click();
		}

		public void VerifyChargeTabAppears() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.uIChargesTab.getAttribute("class")
					.contains("igtab_BlueThemeTHText igtab_BlueThemeTHTextSel"));

		}

		public void VerifyIssuedDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapWarrants.warrantEntry.uIIssuedDateEdit.getAttribute("value"));
		}

		public void VerifyAcknowledgeDateRequired() {
			popup.acknowledge.okWithExpectedMessage("(1044) Date is Required");
		}

		public void VerifyTypeAsAnticipatoryBail() {
			verify.ExpectedPropertyValueIsEqual("Anticipatory Bail", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapWarrants.warrantEntry.uITypeComboBox));
		}

		public void VerifyStatusAsActiveOpen() {
			verify.ExpectedPropertyValueIsEqual("Active/Open", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapWarrants.warrantEntry.uIStatusComboBox));
		}

		public void VerifyWantOrWarrantNoEditable() {
			// verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.uIWarrantNumberEdit.getAttribute("onfocusout").contains("nbrWarrant_Number"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.uIWarrantNumberEdit.getAttribute("readonly") == null);
		}

		public void VerifyWarrantIcon() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uIWarrantIconButton.getAttribute("src").contains("warrant.gif"));
		}

		public void VerifyReopenAppear() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.uIReopenButton.isDisplayed());
		}

		public void VerifySaveIconDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uISaveButton.getAttribute("class").contains("DisabledImgMnuItem"));
		}

		public void VerifyConfirmReopenMessage() {
			popup.confirm.yesWithExpectedMessage("(8513) Do you really want to reopen?");
		}

		public void VerifyAcknowlegeReopenMessage() {
			popup.acknowledge.okWithExpectedMessage("(8529) To reopen the warrant, update the warrant status");
		}

		public void VerifyJnameDetailsRemoved() {
			verify.ExpectedPropertyValueIsEqual("", uIMapWarrants.warrantEntry.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual("", uIMapWarrants.warrantEntry.uINameIDEdit.getAttribute("value"));
		}

		public void VerifyAddressFieldRemoved() {
			verify.ExpectedPropertyValueIsEqual("", uIMapWarrants.warrantEntry.uIAddressEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual("", uIMapWarrants.warrantEntry.uICSZEdit.getAttribute("value"));
		}

		public void VerifyJuvinalNameConfirmMessage() {
			popup.confirm.noWithExpectedMessage(
					"(6125) You have selected a Juvenile Name record. This individual is no longer a Juvenile. Select YES to use this Juvenile Name record, or select NO to choose the Adult Name record or to create a 'New' Adult Name record for this individual.");
		}

		public void VerifyDocketNoFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uIDocketNoEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyCustom1Hide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uICustom1Edit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyCourtWarrantNoFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uICourtWarrantNoEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyCustom2FieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uICustom2Edit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyCustom2AsMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uICustom2TextView.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyCustom1AsMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uICustom1TextView.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyDocketNoAsMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uIDocketNoTextView.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyCourtWarrantNoAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.uICourtWarrantNoTextView.getAttribute("kpifieldusage")
					.contains("Mandatory"));
		}

		public void VerifyWarrantIconColorOrange() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uIWarrantIconButton.getAttribute("src").contains("warrantorange.png"));
		}

		public void VerifyWarrantIconColorGreen() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uIWarrantIconButton.getAttribute("src").contains("warrant.gif"));
		}

		public void VerifyAtExpiredDate() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("ExpiredDate"),
					uIMapWarrants.warrantEntry.uIExpiredDateEdit.getAttribute("value"));
		}

		public void VerifyAtExpiredDate1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("ExpiredDate1"),
					uIMapWarrants.warrantEntry.uIExpiredDateEdit.getAttribute("value"));
		}

		public void VerifyExpiredDateBlank() {
			verify.ExpectedPropertyValueIsEqual("", uIMapWarrants.warrantEntry.uIExpiredDateEdit.getAttribute("value"));
		}

		public void verifyWarrantIconNotShowing() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.uIWarrantIconButton.getAttribute("src").contains("16_L_remove.gif"));
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapWarrants.warrantEntry.uITypeComboBox,
					PoliceData.getWarrantModuleValue("Type"));
		}

		public void verifyAtDetails() {

			String actual = uIMapWarrants.warrantEntry.uIDetailsTextview.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("Details"), actual);
		}

		public void verifyProfilePicNotDisplayed() {
			String src = uIMapWarrants.warrantEntry.uIWarrantImage.getAttribute("value");
			verify.ExpectedValueIsTrue(src.contains("RefSeqNo=-32"));
		}

		public void verifyProfilePicDisplayed() {
			Playback.controlReadyThreadWait();
			String src = uIMapWarrants.warrantEntry.uIWarrantImage.getAttribute("value");
			verify.ExpectedValueIsTrue(src.contains("ImgID=10"));
		}

		public void selectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapWarrants.warrantEntry.uIStatusComboBox,
					PoliceData.getWarrantModuleValue("Status"));
		}

		public void verifyAtNameShownInWarrant() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("NameShownInWarrant"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapWarrants.warrantEntry.uINameShownInWarrantComboBox));
		}

		public void verifyAtAddressShownInWarrant() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("AtAddressShownInWarrant"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapWarrants.warrantEntry.uIAddressShownInWarrantComboBox));
		}
		public void verifyAdditionSuccessfulMessage() {
			String UpdateMessage =uIMapWarrants.warrantEntry.uIFooterStatusBar .getText();
			verify.ExpectedPropertyValueIsEqual(UpdateMessage,"1002 - Addition Successful");
		
		}
		public void verifyUpdatedSuccessfulMessage() {
			String UpdateMessage =uIMapWarrants.warrantEntry.uIFooterStatusBar .getText();
			verify.ExpectedPropertyValueIsEqual(UpdateMessage,"1003 - Update Successful");
		
		}

		public void enterAtAuthorityLookUpEdit() {
			uIMapWarrants.warrantEntry.uIAuthorityLookUpEdit.sendKeys(PoliceData.getWarrantModuleValue("Authority"));
			uIMapWarrants.warrantEntry.uIAuthorityLookUpEdit.sendKeys(Keys.TAB);
		}

		public void clickAuthorityLookUpIcon() {
			uIMapWarrants.warrantEntry.uIAuthorityLookUpIcon.click();
		}

		public void verifyAtAuthorityCodeDescription() {
			String attribute = uIMapWarrants.warrantEntry.uIAuthorityLookUpDescription.getAttribute("title");
			verify.ExpectedPropertyValueIsEqual(attribute, PoliceData.getWarrantModuleValue("AuthorityDescription"));
		}

		public void verifyAuthorityORINumberInCodedSearchGrid() {
			popup.switchToCodedSearch();
			String text = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "ORINbr", 0);
			verify.ExpectedPropertyValueIsEqual(text, PoliceData.getWarrantModuleValue("ORINumber"));
		}

		public void verifyAuthorityTitleInCodedSearchGrid() {
			popup.switchToCodedSearch();
			String text = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "Title", 0);
			verify.ExpectedPropertyValueIsEqual(text, PoliceData.getWarrantModuleValue("AuthorityTitle"));
		}
		public void clickNameInfoIcon()
		{
			uIMapWarrants.warrantEntry.uINameInfoIconButton.click();

		}
		public void veritfyStatusBarMessageAsEmpty() {
			List<WebElement> child = uIMapWarrants.warrantEntry.uIFooterStatusBar.findElements(By.xpath("./child::*"));

			for(WebElement e:child)
			{
			if(e.getTagName().contains("b")) {
			System.out.println(e.getText());
			Assert.assertNull(e.getText(), "Error");
			}
			else {
			Assert.assertTrue(true);
			}
			}
		}
		
		public WarrantEntry() {
			if ((this.warrantEntryMainTab == null)) {
				this.warrantEntryMainTab = new WarrantEntryMainTab();
			}

			if ((this.clearTab == null)) {
				this.clearTab = new ClearTab();
			}

			if ((this.statusTab == null)) {
				this.statusTab = new StatusTab();
			}

			if ((this.chargesTab == null)) {
				this.chargesTab = new ChargesTab();
			}

			if ((this.narrativeTab == null)) {
				this.narrativeTab = new NarrativeTab();
			}

			if ((this.serviceTab == null)) {
				this.serviceTab = new ServiceTab();
			}

			if ((this.warrantEntryHistoryTab == null)) {
				this.warrantEntryHistoryTab = new WarrantEntryHistoryTab();
			}

			if ((this.warrantEntryNotesTab == null)) {
				this.warrantEntryNotesTab = new WarrantEntryNotesTab();
			}
		}

		public WarrantEntryMainTab warrantEntryMainTab = null;
		public ClearTab clearTab = null;
		public StatusTab statusTab = null;
		public ChargesTab chargesTab = null;
		public NarrativeTab narrativeTab = null;
		public ServiceTab serviceTab = null;
		public WarrantEntryHistoryTab warrantEntryHistoryTab = null;
		public WarrantEntryNotesTab warrantEntryNotesTab = null;
		
		
	}

	public class WarrantEntryMainTab {

		public void EnterJudgeName() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIJudgeNameTypeEdit.sendKeys("a");
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIJudgeNameTypeIDEdit.sendKeys("42");
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIJudgeNameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterPetitionerName() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIPetitionerLastNameEdit.sendKeys("a");
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIPetitionerFirstNameEdit.sendKeys(Keys.TAB);
			names.nameSearchHelpWindow.SelectName();
		}

		public void SelectServiceLimitasStateWide() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIServiceLimitComboBox.sendKeys("State Wide");
		}

		public void SelectServiceLimit() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIServiceLimitComboBox);
		}

		public void EnterWantCharge() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIwantChargeEdit.sendKeys("358");
		}

		public void EnterAsWantCharge() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIwantChargeEdit.sendKeys("Aganist Law");
		}

		public void SelectProductionOrderRestrainingOrder() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapWarrants.warrantEntry.warrantEntryMainTab.uIProtectionRestrainingComboBox);
		}

		public void EnterBailAs100() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uITotalBailEdit.clear();
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uITotalBailEdit.sendKeys("100");
		}

		public void ClickDetailedChargesCheckBox() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIDetailChargesCheckBox.click();
		}

		public void ClickProtectionRestrainingOrderTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIProtectionRestrainingOrderTextView.click();
		}

		public void ClickBailAmountTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIBailAmountTextView.click();
		}

		public void ClickCautionRemarksTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uICautionRemarksTextView.click();
		}

		public void ClickCautionTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uICautionTextView.click();
		}

		public void ClickDateOfEmancipationTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIDateOfEmancipationTextView.click();
		}

		public void ClickGeoServiceLimitTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIGeoServiceLimitTextView.click();
		}

		public void ClickViolationDateTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIViolationDateTextView.click();
		}

		public void ClickWantChargeTextView() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIWantChargeTextView.click();
		}

		public void VerifyCompliantAsComplaint() {
			verify.ExpectedPropertyValueIsEqual("Complainant",
					uIMapWarrants.warrantEntry.warrantEntryMainTab.uIComplainantEdit.getAttribute("value"));
		}

		public void VerifyHeldByAsDefault() {
			verify.ExpectedPropertyValueIsEqual("Default",
					uIMapWarrants.warrantEntry.warrantEntryMainTab.uIHeldByEdit.getAttribute("value"));
		}

		public void VerifyProtectionRestrainingFieldHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIProtectionRestrainingComboBox
							.getAttribute("disabled")));
		}

		public void VerifyCautionFieldHide() {
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapWarrants.warrantEntry.warrantEntryMainTab.uICautionComboBox.getAttribute("disabled")));
		}

		public void VerifyWantChargeNameChanged() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.warrantEntryMainTab.uIWantChargeTextView.getText().contains("Charge"));
		}

		public void VerifyViolationDateFieldHide() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIViolationDateEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyGeoServiceLimitFieldHide() {
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapWarrants.warrantEntry.warrantEntryMainTab.uIGeoServiceLimitComboBox.getAttribute("disabled")));
		}

		public void VerifyCautionRemarksFieldHide() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uICautionRemarksEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyBailAmountFieldHide() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIBailAmountEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyDateOfEmancipationFieldHide() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIDateOfEmancipationEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyProtectionRestrainingOrderAsMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.warrantEntryMainTab.uIProtectionRestrainingOrderTextView
							.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyCautionAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uICautionTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyWantChargeAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIWantChargeTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyViolationDateAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIViolationDateTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyGeoServiceLimitAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIGeoServiceLimitTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyCautionRemarksAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uICautionRemarksTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyBailAmountAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIBailAmountTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyDateOfEmancipationAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.warrantEntryMainTab.uIDateOfEmancipationTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void enterAtWantCharge() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIwantChargeEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WantCharge"));
		}

		public void enterAtPetitionerNameID() {
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIPetitionerNameTypeEdit
					.sendKeys(PoliceData.getWarrantModuleValue("PetitionerNameID").substring(0, 1));
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIPetitionerNameTypeEdit.sendKeys(Keys.TAB);
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIPetitionerNameTypeIDEdit
					.sendKeys(PoliceData.getWarrantModuleValue("PetitionerNameID").substring(2));
			uIMapWarrants.warrantEntry.warrantEntryMainTab.uIPetitionerNameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtActiveDateOfEmancipation(String birthDate)
		{
		String attribute = uIMapWarrants.warrantEntry.warrantEntryMainTab.uIDateOfEmancipationEdit.getAttribute("value");
		verify.ExpectedValueIsTrue(attribute.contains(birthDate));
		}

		public void verifyAtDateOfEmancipation()
		{
		String attribute = uIMapWarrants.warrantEntry.warrantEntryMainTab.uIDateOfEmancipationEdit.getAttribute("value");
		verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getWarrantModuleValue("DateOfEmancipation")));
		}
	}

	public class ClearTab {

		public void SelectDispostionAsCancelled() {
			uIMapWarrants.warrantEntry.clearTab.uIDispostionComboBox.sendKeys("Cancelled");
		}

		public void SelectDispostionAsWithdrawn() {
			uIMapWarrants.warrantEntry.clearTab.uIDispostionComboBox.sendKeys("Withdrawn");
		}

		public void EnterCurrentDateAndTime() {
			uIMapWarrants.warrantEntry.clearTab.uIDateEdit.click();
			uIMapWarrants.warrantEntry.clearTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapWarrants.warrantEntry.clearTab.uITimeEdit.click();
			uIMapWarrants.warrantEntry.clearTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterLoggedPF() {
			uIMapWarrants.warrantEntry.clearTab.uIPFEdit.click();
			uIMapWarrants.warrantEntry.clearTab.uIPFEdit.sendKeys(Keys.TAB);
		}

		public void EnterRemarks() {
			uIMapWarrants.warrantEntry.clearTab.uIRemarksEdit.sendKeys(Randomized.randomString(56));
		}

		public void EnterRemarksAsWithdrawn() {
			uIMapWarrants.warrantEntry.clearTab.uIRemarksEdit.sendKeys("Withdrawn");
		}

		public void VerifyAcknowledgeUpdateClearTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Clear Tab. You must save or reset.");
		}

		public void VerifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapWarrants.warrantEntry.clearTab.uIDateEdit.getAttribute("value"));
		}

		public void VerifyCurrentTime() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapWarrants.warrantEntry.clearTab.uITimeEdit.getAttribute("value"));
		}

		public void VerifySaveAndResetButtonGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.clearTab.uISaveTabButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.clearTab.uIResetTabButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
		}

		public void VerifyDispositionGrayedOut() {
			verify.ExpectedValueIsFalse(uIMapWarrants.warrantEntry.clearTab.uIDispostionComboBox.isEnabled());
		}

		public void VerifyDateGrayedOut() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.clearTab.uIDateEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void SaveClearTab() {
			uIMapWarrants.warrantEntry.clearTab.uISaveTabButton.click();
			popup.confirm.yes();
		}

	}

	public class StatusTab {

		public void SelectStatusasActiveOpen() {
			uIMapWarrants.warrantEntry.statusTab.uIStatusComboBox.sendKeys("Active/Open");
		}

		public void SaveStatusTab() {
			uIMapWarrants.warrantEntry.statusTab.uISaveTabButton.click();
			popup.confirm.yes();
		}

		public void SelectStatusAsOther() {
			uIMapWarrants.warrantEntry.statusTab.uIStatusComboBox.sendKeys("Other");
		}

		public void EnterDateAsCurrentDate() {
			uIMapWarrants.warrantEntry.statusTab.uIStatusDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void EnterRemarksAsReOpentheWarrant() {
			uIMapWarrants.warrantEntry.statusTab.uIRemarksEdit.sendKeys("ReOpen the Warrant");
		}

		public void VerifyAcknowledgeUpdateStatus() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Status Tab. You must save or reset.");
		}

		public void VerifyAllFieldsGrayedOut() {
			verify.ExpectedValueIsFalse(uIMapWarrants.warrantEntry.statusTab.uIStatusComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.statusTab.uIStatusDateEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.statusTab.uIRemarksEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.statusTab.uISaveTabButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
		}

		public void SelectAtStatus() {
			uIMapWarrants.warrantEntry.statusTab.uIStatusComboBox
					.sendKeys(PoliceData.getWarrantModuleValue("UpdateStatus"));
			uIMapWarrants.warrantEntry.statusTab.uIStatusComboBox.sendKeys(Keys.TAB);
		}
	}

	public class ChargesTab {
		public void EnterAtCharge() {
			uIMapWarrants.warrantEntry.chargesTab.uIChargeEdit.sendKeys(PoliceData.getWarrantModuleValue("charge"));
			uIMapWarrants.warrantEntry.chargesTab.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapWarrants.warrantEntry.chargesTab.uIAddButton.click();
		}

	}

	public class NarrativeTab {
		public void EnterGroupofString() {

			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapWarrants.warrantEntry.narrativeTab.uINarrativeEdit).click();
			actions.sendKeys(Randomized.randomString(200)).build().perform();
			Playback.waitForControlReady();
		}

		public void ClickLockEntryCheckBox() {
			uIMapWarrants.warrantEntry.narrativeTab.uILockEntryCheckBox.click();
		}

		public void EnterAtEmpl() {
			uIMapWarrants.warrantEntry.narrativeTab.uIEmplNoEdit.sendKeys(PoliceData.getWarrantModuleValue("UserName"));
			uIMapWarrants.warrantEntry.narrativeTab.uIEmplNoEdit.sendKeys(Keys.TAB);
		}

		public void VerifyNarativeTextNonEditable() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.narrativeTab.uINarrativeEdit.getAttribute("readonly") == "true");
		}
		
		

		public void VerifyEmplNoMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.narrativeTab.uIEmplNoTextView.getAttribute("class").contains("req"));
		}

		public void enterAtNarrativeEmplDate() {
			Playback.controlReadyThreadWait();
			uIMapWarrants.warrantEntry.narrativeTab.uIDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void VerifyTemplateDisabled() {
			verify.ExpectedValueIsTrue(Boolean
					.parseBoolean(uIMapWarrants.warrantEntry.narrativeTab.uITemplateComboBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(Boolean
					.parseBoolean(uIMapWarrants.warrantEntry.narrativeTab.uILoadButton.getAttribute("disabled")));
		}

		public void verifyAtLockEntryAndEmpFieldsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.narrativeTab.uIEmplNoEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.narrativeTab.uILockEntryCheckBox.isDisplayed());
		}
		
		public void VerifyAtNarrativeText() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantEntry.narrativeTab.uINarrativeEdit.getText().contains(PoliceData.getWarrantModuleValue("TextData")));
		}

		public void VerifyAddNewOrEditDesabled() {
			verify.ExpectedValueIsTrue(Boolean
					.parseBoolean(uIMapWarrants.warrantEntry.narrativeTab.uIAddNewOrEditButton.getAttribute("disabled")));
			
		}
	}

	public class ServiceTab {
		public void TabServiceAttemptedDate() {
			uIMapWarrants.warrantEntry.serviceTab.uIServiceAttemptedDateEdit.click();
			uIMapWarrants.warrantEntry.serviceTab.uIServiceAttemptedDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtAttemptedBy() {
			uIMapWarrants.warrantEntry.serviceTab.uIAttemptedByEdit
					.sendKeys(PoliceData.getWarrantModuleValue("UserName"));
			uIMapWarrants.warrantEntry.serviceTab.uIAttemptedByEdit.sendKeys(Keys.TAB);
		}

		public void SaveServiceTab() {
			uIMapWarrants.warrantEntry.serviceTab.uISaveTabButton.click();
			popup.confirm.yes();
		}

		public void VerifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapWarrants.warrantEntry.serviceTab.uIServiceAttemptedDateEdit.getAttribute("value"));
		}

		public void VerifyAcknowledgeUpdateServiceTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Service Tab. You must save or reset.");
		}

		public void VerifyUpdateSuccessful() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.serviceTab.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update successful"));
		}

		public void VerifyAllFieldsGrayedOut() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.serviceTab.uIServiceAttemptedDateEdit
					.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.serviceTab.uIServiceAttemptedTimeEdit
					.getAttribute("class").contains("textboxInactivedatetime"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.serviceTab.uIAttemptedByEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.serviceTab.uICommentsEdit.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantEntry.serviceTab.uISaveTabButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
		}

	}

	public class WarrantEntryHistoryTab {
		public void VerifyHistoryTypeAsNarrativeLock(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Narrative Lock",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "History Type",
							rowIndex));
		}

		public void VerifyRemarksAsNarrativeLockedby(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Narrative Locked by",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "Remarks",
							rowIndex));

		}

		public void VerifyHistoryTypeAsStatusUpdate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Status Update",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "History Type",
							rowIndex));
		}

		public void VerifyRemarksAsOther(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("[ Other ]", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "Remarks", rowIndex));
		}

		public void VerifyHistoryTypeAsServiceUpdate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Service Update",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "History Type",
							rowIndex));
		}

		public void VerifyAtByPF(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("ByPF"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "By PF",
							rowIndex));

		}

		public void VerifyHistoryTypeAsNotes(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Notes",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "History Type",
							rowIndex));
		}

		public void ClickRemarkColumncell(int rowIndex) {
			objectIdentification.manualIdentify
					.getGridCell(uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "Remarks",
							rowIndex)
					.click();

		}

		public void ClickRemarksOkbutton() {
			popup.acknowledge.remarksAcknowledgeOk();
		}

		public void VerifyHistoryTypeAsWarrantClearance(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Warrant Clearance",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "History Type",
							rowIndex));
		}

		public void VerifyHistoryTypeAsWarrantReopened(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Warrant Reopened",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "History Type",
							rowIndex));
		}

		public void VerifyRemarkAsActiveOpen(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid,
							"Remarks", rowIndex)
					.contains("[ Active/Open ]"));

		}

		public void verifyAtDateTimeInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapWarrants.warrantEntry.warrantEntryHistoryTab.uIHistoryTabResultsGrid, "Date/Time");
			System.out.println(gridTableColumnValues);
			for (String value : gridTableColumnValues)
				verify.ExpectedValueIsTrue(value.contains(PoliceData.getWarrantModuleValue("DateTime")));
		}

		public void clickResetButton() {
			// TODO Auto-generated method stub
			uIMapWarrants.warrantEntry.warrantEntryHistoryTab.	uIHistoryTabResetButton.click();
		}

	}

	public class WarrantEntryNotesTab {
		public void EnterNotes() {
			uIMapWarrants.warrantEntry.warrantEntryNotesTab.uINotesEdit.sendKeys(Randomized.randomString(10));
		}

		public void SaveNotesTab() {
			uIMapWarrants.warrantEntry.warrantEntryNotesTab.uISaveTabButton.click();
			popup.confirm.yes();
		}

		public void VerifyAcknowledgeUpdateNotesTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Notes Tab. You must save or reset.");
		}
	}

	public class WarrantSearch {
		public void ClickWarNoCheckBox() {
			uIMapWarrants.warrantSearch.uIWarNoCheckBox.click();
		}

		public void clickAddNewButton() {
			uIMapWarrants.warrantSearch.uIAddNewButton.click();
		}

		public void EnterAtWarrantNoInFromAndTo() {
			uIMapWarrants.warrantSearch.uIWarrantFromYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(0, 2));
			uIMapWarrants.warrantSearch.uIWarrantFromNumberEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(3));
			uIMapWarrants.warrantSearch.uIWarrantFromNumberEdit.sendKeys(Keys.TAB);

			uIMapWarrants.warrantSearch.uIWarrantToYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(0, 2));
			uIMapWarrants.warrantSearch.uIWarrantToNumberEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(3));
			uIMapWarrants.warrantSearch.uIWarrantToNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtWarrantNoFrom() {
			uIMapWarrants.warrantSearch.uIWarrantFromYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(0, 2));
			uIMapWarrants.warrantSearch.uIWarrantFromNumberEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(3));
			uIMapWarrants.warrantSearch.uIWarrantFromNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtWarrantNoTo() {
			uIMapWarrants.warrantSearch.uIWarrantToYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(0, 2));
			uIMapWarrants.warrantSearch.uIWarrantToNumberEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(3));
			uIMapWarrants.warrantSearch.uIWarrantToNumberEdit.sendKeys(Keys.TAB);
		}

		public void SelectStatusAsActiveOpen() {
			uIMapWarrants.warrantSearch.uIStatusComboBox.sendKeys("Active/Open");
		}

		public void SelectStatusAsOther() {
			uIMapWarrants.warrantSearch.uIStatusComboBox.sendKeys("Other");
		}

		public void SelectClearanceStatusAsClosed() {
			uIMapWarrants.warrantSearch.uIClearanceComboBox.sendKeys("Closed");
		}

		public void SelectClearanceStatusAsOpen() {
			uIMapWarrants.warrantSearch.uIClearanceComboBox.sendKeys("Open");
		}

		public void ClickSearchButton() {
			uIMapWarrants.warrantSearch.uISearchButton.click();
		}

		public void ClickAtWarantNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapWarrants.warrantSearch.uIWarrantResultTable,
					PoliceData.getWarrantModuleValue("WarrantNo").toString());
		}

		public void ClickClearButton() {
			uIMapWarrants.warrantSearch.uIClearButton.click();
		}

		public void ClickResetButton() {
			uIMapWarrants.warrantSearch.uIResetButton.click();
		}

		public void ClickPrintIcon() {
			uIMapWarrants.warrantSearch.uIPrintIcon.click();
		}

		public void ClickRowWithActiveOpen() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapWarrants.warrantSearch.uIWarrantResultTable, "Active/Open");
		}

		public void ClickCourtWarrantNoTextView() {
			uIMapWarrants.warrantSearch.uICourtWarrantNoTextView.click();
		}

		public void ClickDocketNoTextView() {
			uIMapWarrants.warrantSearch.uIDocketNoTextView.click();
		}

		public void ClickNICIDTextView() {
			uIMapWarrants.warrantSearch.uINCICIDTextView.click();
		}

		public void ClickStateIDTextView() {
			uIMapWarrants.warrantSearch.uIStateIDTextView.click();
		}

		public void ClickCustom1TextView() {
			uIMapWarrants.warrantSearch.uICustom1TextView.click();
		}

		public void ClickCustom2TextView() {
			uIMapWarrants.warrantSearch.uICustom2TextView.click();
		}

		public void VerifyWarrantLastNameWarrantFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					PoliceData.getWarrantModuleValue("WarrantLastName") + ", "
							+ PoliceData.getWarrantModuleValue("WarrantFirstName"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapWarrants.warrantSearch.uIWarrantResultTable, "Name", rowIndex));

		}

		public void VerifyStatusAsWithdrawn(int rowIndex) {
//			verify.ExpectedPropertyValueIsEqual("Withdrawn", objectIdentification.manualIdentify
//					.getGridCellInnerText(uIMapWarrants.warrantSearch.uIWarrantResultTable, "Status", rowIndex));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapWarrants.warrantSearch.uIWarrantResultTable, "Status", rowIndex)
					.contains("Withdrawn"));

		}

		public void VerifyMouseOverNameColumn(int rowIndex) {
			Actions builder = new Actions(Playback.driver);
			builder.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapWarrants.warrantSearch.uIWarrantResultTable, "Name", rowIndex)).perform();
			builder = null;
			Playback.gridLoadThreadWait();
		}

		public void VerifyRecordInBlackColor(int rowIndex) {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridTableRow(uIMapWarrants.warrantSearch.uIWarrantResultTable, rowIndex).getAttribute("class")
					.contains("gridrowclr"));
		}

		public void VerifyRecordInGrayColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapWarrants.warrantSearch.uIWarrantResultTable, rowIndex).getAttribute("class")
					.contains("gridrowclr"));
		}

		public void VerifyWarNoAtWarrant(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("WarrantNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapWarrants.warrantSearch.uIWarrantResultTable, "War#", rowIndex));
		}

		public void VerifyAcknowledgeRecordFound() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void VerifyCourtWarrantNoFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantSearch.uICourtWarrantNoEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyDocketNoFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantSearch.uIDocketNoEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyNICIDFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantSearch.uINCICIDEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyCustom1FieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantSearch.uICustom1Edit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyCustom2FieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantSearch.uICustom2Edit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyStateIDFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantSearch.uIStateIDEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void EnterAtWarNoInFromAndTo() {
			uIMapWarrants.warrantSearch.uIWarrantFromYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarNo").substring(0, 2));
			uIMapWarrants.warrantSearch.uIWarrantFromNumberEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarNo").substring(3));
			uIMapWarrants.warrantSearch.uIWarrantFromNumberEdit.sendKeys(Keys.TAB);

			uIMapWarrants.warrantSearch.uIWarrantToYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarNo").substring(0, 2));
			uIMapWarrants.warrantSearch.uIWarrantToNumberEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarNo").substring(3));
			uIMapWarrants.warrantSearch.uIWarrantToNumberEdit.sendKeys(Keys.TAB);
		}

		public void ClickAtWarNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapWarrants.warrantSearch.uIWarrantResultTable, PoliceData.getWarrantModuleValue("WarNo"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtStatusUsingWarNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCell(uIMapWarrants.warrantSearch.uIWarrantResultTable,
							PoliceData.getWarrantModuleValue("WarNo"), "Status").getText());
		}

		public void verifyAtDateInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapWarrants.warrantSearch.uIWarrantResultTable, "Date");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(PoliceData.getWarrantModuleValue("Date")));
		}

	}

	public class WarrantDetails {
		public void VerifyWarrantCountAs2() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantDetails.uIWarrantCountEdit.getAttribute("value").contains("2"));
		}

		public void VerifyWarrantCountAs0() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.warrantDetails.uIWarrantCountEdit.getAttribute("value").contains("0"));
		}

		public void VerifyAtWarrantNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("WarrantNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid, "Warrant#", rowIndex));
		}

		public void VerifyWarrantStatusAsExpired(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Expired", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid, "Status", rowIndex));
		}

		public void VerifyWarrantStatusAsActiveOpen(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Active/Open", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid, "Status", rowIndex));
		}

		public void CloseWarrantDetailsScreen() {
			uIMapWarrants.warrantDetails.driver.close();
		}

		public void ClickAtWarantNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid,
					PoliceData.getWarrantModuleValue("WarrantNo").toString());
		}

		public void VerifyRecordInRedColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid, rowIndex)
					.getAttribute("class").contains("gridrowclr"));
		}

		public void ClickAtWarantNo1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid,
					PoliceData.getWarrantModuleValue("WarrantNo1").toString());
		}

		public void ClickAtWarantNo2InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid,
					PoliceData.getWarrantModuleValue("WarrantNo2").toString());
		}

		public void ClickAtWarantNo3InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapWarrants.warrantDetails.uIWarrantDetailsResultGrid,
					PoliceData.getWarrantModuleValue("WarrantNo3").toString());
		}

	}

	public class WarrantNamesSearch {
		public void EnterAtLastName() {
			uIMapWarrants.warrantNamesSearch.uILastNameEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantLastName"));
		}

		public void EnterAtFirstName() {
			uIMapWarrants.warrantNamesSearch.uIFirstNameEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantFirstName"));
		}

		public void SelectWarrantStatusAsActiveOpen() {
			uIMapWarrants.warrantNamesSearch.uIWarrantStatusComboBox.sendKeys("Active/Open");
		}

		public void ClickSearchButton() {
			uIMapWarrants.warrantNamesSearch.uISearchButton.click();
		}

		public void VerifyWarrantLastNameWarrantFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.warrantNamesSearch.uIWarrantNamesSearchResultGrid, "Name", rowIndex),
					PoliceData.getWarrantModuleValue("WarrantLastName") + ", "
							+ PoliceData.getWarrantModuleValue("WarrantFirstName"));

		}

		public void VerifyMouseOverNameColumn(int rowIndex) {
			Actions Mouseover = new Actions(Playback.driver);
			Mouseover
					.moveToElement(objectIdentification.manualIdentify.getGridCell(
							uIMapWarrants.warrantNamesSearch.uIWarrantNamesSearchResultGrid, "Name", rowIndex))
					.perform();
//		WebElement eles=Playback.driver.findElement(By.xpath("//span[@id='WzTtDiV']//table//tbody//tr//td//span[contains(text(),'Gon')]"));
//			System.out.println(eles.getText());
//		//	verify.ExpectedValueIsTrue(text.contains(PoliceData.getWarrantModuleValue("Name")));
			Mouseover = null;
			Playback.gridLoadThreadWait();
		}

		public void ClickRow(int rowIndex) {
			uIMapWarrants.warrantNamesSearch.uIWarrantNamesSearchResultGrid.click();
			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapWarrants.warrantNamesSearch.uIWarrantNamesSearchResultGrid, rowIndex);
		}

		public void ClickRowAtWarrantLastNameWarrantFirstName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapWarrants.warrantNamesSearch.uIWarrantNamesSearchResultGrid,
					PoliceData.getWarrantModuleValue("WarrantLastName") + ", "
							+ PoliceData.getWarrantModuleValue("WarrantFirstName"));
		}

		public void VerifyAcknowledgeRecordFound() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void ClickIncludeNameCheckBox() {
			uIMapWarrants.warrantNamesSearch.uIIncludeNameCheckBox.click();
		}

	}

	public class BatchClearance {
		public void SelectDispositionAsWithdrawn() {
			uIMapWarrants.batchClearance.uIDispositionComboBox.sendKeys("Withdrawn");
		}

		public void EnterDate() {
			uIMapWarrants.batchClearance.uIDateEdit.click();
			uIMapWarrants.batchClearance.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapWarrants.batchClearance.uIDateEdit.getAttribute("value"));
		}

		public void EnterRemarkAsBatchClearance() {
			uIMapWarrants.batchClearance.uIRemarksEdit.sendKeys("Batch Clearance");
		}

		public void EnterAtByPFCode() {
			uIMapWarrants.batchClearance.uIByPFEdit.sendKeys(PoliceData.getWarrantModuleValue("PFCode"));
			uIMapWarrants.batchClearance.uIByPFEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtWarrantNo() {
			uIMapWarrants.batchClearance.uIWarrantYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(0, 2));
			uIMapWarrants.batchClearance.uIWarrantNoEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo").substring(3));
			uIMapWarrants.batchClearance.uIWarrantNoEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtWarrantNo1() {
			uIMapWarrants.batchClearance.uIWarrantYearEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo1").substring(0, 2));
			uIMapWarrants.batchClearance.uIWarrantNoEdit
					.sendKeys(PoliceData.getWarrantModuleValue("WarrantNo1").substring(3));
			uIMapWarrants.batchClearance.uIWarrantNoEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCourtNo() {
			uIMapWarrants.batchClearance.uICourtNoEdit.sendKeys(PoliceData.getWarrantModuleValue("CourtNo"));
		}

		public void ClickAddButton() {
			uIMapWarrants.batchClearance.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void Save() {
			uIMapWarrants.batchClearance.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickSave() {
			uIMapWarrants.batchClearance.uISaveButton.click();
		}

		public void VerifyAcknowledgeUpdateSuccess() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1003 - Update Successful");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1003 - Update Successful");
		}

		public void VerifyRefreshADDClearbuttonEnabled() {
			verify.ExpectedValueIsTrue(uIMapWarrants.batchClearance.uIResetButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapWarrants.batchClearance.uIAddButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapWarrants.batchClearance.uIClearButton.isEnabled());

		}

		public void VerifyRefreshADDClearbuttonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uIResetButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uIAddButton.getAttribute("disabled").contains("true"));
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uIClearButton.getAttribute("disabled").contains("true"));

		}

		public void VerifyAllFieldsGrayedOut() {
			verify.ExpectedValueIsFalse(uIMapWarrants.batchClearance.uIDispositionComboBox.isEnabled());
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uIDateEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uIByPFEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uIRemarksEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uIWarrantNoEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uICourtNoEdit.getAttribute("class").contains("textboxInactive"));
			verify.ExpectedValueIsTrue(
					uIMapWarrants.batchClearance.uISaveButton.getAttribute("class").contains("DisabledImgMnuItem"));
		}

		public void VerifyAckMessageSelectWarrantDisposition() {
			popup.acknowledge.okWithExpectedMessage("(8512) Select warrant disposition");
		}

		public void VerifyAckMessageEnterCourt() {
			popup.acknowledge.okWithExpectedMessage("(8516) Enter Court # or Warrant #");
		}

		public void VerifyAckMessageSelectPF() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(8514) Select either PF or ORI No");
			} else
				popup.acknowledge.okWithExpectedMessage("(8514) Select either PF or ORI#");
		}

		public void VerifyAckMessageUpdatedDataExists() {
			popup.acknowledge.okWithExpectedMessage("(6040) Updated data exists in the fields.You must Add or Clear");
		}

		public void VerifyAckMessageWarrantCleared() {
			popup.acknowledge.okWithExpectedMessage("(8517) Warrant already cleared");
		}

		public void VerifyAtWarrantNo(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("WarrantNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.batchClearance.uIBatchClearanceResultGrid, "Warrant#", rowIndex));
		}

		public void VerifyAtCourtNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("CourtNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.batchClearance.uIBatchClearanceResultGrid, "Court#", rowIndex));
		}

		public void VerifyAtDOB(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("DOB"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.batchClearance.uIBatchClearanceResultGrid, "DOB", rowIndex));
		}

		public void VerifyAtAge(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("Age"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.batchClearance.uIBatchClearanceResultGrid, "Age", rowIndex));
		}

		public void VerifyAtCharge(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("Charge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapWarrants.batchClearance.uIBatchClearanceResultGrid, "Charge", rowIndex));
		}

		public void ClickDeleteIconInGrid() {
			uIMapWarrants.batchClearance.uIDeleteIconGridButton.click();
			popup.confirm.yes();
		}

		public void VerifyAddedRowDeleted() {
			verify.ExpectedIntergerValueIsEqualToActual(0, objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapWarrants.batchClearance.uIBatchClearanceResultGrid));
		}
	}

	public class WarrantType {
		public void VerifyWarrantTypeAsA(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("A", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapWarrants.warrantType.uIWarrantTypeResultGrid, "Warrant Type", rowIndex));
		}

		public void VerifyDescriptionAsAnticipatoryBail(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Anticipatory Bail", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapWarrants.warrantType.uIWarrantTypeResultGrid, "Description", rowIndex));
		}

		public void VerifyExpirationRequiredAsMandatory(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Mandatory", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapWarrants.warrantType.uIWarrantTypeResultGrid, "Expiration Required?", rowIndex));
		}

		public void VerifyDefaultDispostionAsBailPosted(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Bail Posted", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapWarrants.warrantType.uIWarrantTypeResultGrid, "Default Disposition", rowIndex));
		}

		public void VerifyWarrantIsChecked(int rowIndex) {
			WebElement WarrantIsChecked = objectIdentification.manualIdentify
					.getGridCell(uIMapWarrants.warrantType.uIWarrantTypeResultGrid, "Is Warrant?", rowIndex)
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(WarrantIsChecked.getAttribute("alt").contains("Checked"));
		}

		public void ClickRow(int rowIndex) {
			objectIdentification.manualIdentify.selectGridTableRow(uIMapWarrants.warrantType.uIWarrantTypeResultGrid,
					rowIndex);
		}

		public void ClickEnterKey() {
			Playback.controlReadyThreadWait();
			uIMapWarrants.warrantType.uIWarrantTypeResultGrid.sendKeys(Keys.ENTER);
		}

		public void TakeScreenShot() {
			// Playback.TakeScreenshot(warrantScripts.WarrantTestContext,
			// "PoliceSprintWarrant_135757_1");
		}

		public void ClickAddNew() {
			uIMapWarrants.warrantType.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyWarrantIsCheckedUsingWarrantType() {
			WebElement WarrantIsChecked = objectIdentification.manualIdentify
					.getGridCell(uIMapWarrants.warrantType.uIWarrantTypeResultGrid,
							PoliceData.getWarrantModuleValue("WarrantType"), "Is Warrant?")
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(WarrantIsChecked.getAttribute("alt").contains("Checked"));
		}

		public void VerifyAtDescriptionUsingWarrantType() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCell(uIMapWarrants.warrantType.uIWarrantTypeResultGrid,
							PoliceData.getWarrantModuleValue("WarrantType"), "Description").getText());
		}

		public void VerifyAtDescriptionUsingWarrantType1() {
			WebElement ele =objectIdentification.manualIdentify.getGridRowByCellInnerTextUsingText(uIMapWarrants.warrantType.uIWarrantTypeResultGrid,PoliceData.getWarrantModuleValue("WarrantType1"));
			String actual =	objectIdentification.manualIdentify.getGridCell(uIMapWarrants.warrantType.uIWarrantTypeResultGrid,ele,"Description").getText();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getWarrantModuleValue("Description1"),actual);
		}

		public void verifyWarrantIsNotPresentInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapWarrants.warrantType.uIWarrantTypeResultGrid, "Warrant Type");
			System.out.println(gridTableColumnValues);
			for(String letter:gridTableColumnValues)
			{
				verify.ExpectedValueIsFalse(letter.contains("C"));
			}
			
			
		}
	}

	public class WarrantTypeEntry {
		public void CloseWarrantTypeScreen() {
			uIMapWarrants.warrantTypeEntry.driver.close();
		}

		public void ClickSave() {
			uIMapWarrants.warrantTypeEntry.uISaveButton.click();
		}

		public void Save() {
			uIMapWarrants.warrantTypeEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void EnterAtWarrantType() {
			uIMapWarrants.warrantTypeEntry.uIWarrantTypeEdit.sendKeys(PoliceData.getWarrantModuleValue("WarrantType"));
		}

		public void EnterAtDescription() {
			uIMapWarrants.warrantTypeEntry.uIDescriptionEdit.sendKeys(PoliceData.getWarrantModuleValue("Description"));
		}

		public void ClickWarrantCheckbox() {
			uIMapWarrants.warrantTypeEntry.uIWarrantCheckBox.click();
		}

		public void SelectExpiration() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapWarrants.warrantTypeEntry.uIExpirationComboBox);
			uIMapWarrants.warrantTypeEntry.uIExpirationComboBox.sendKeys(Keys.TAB);
		}

		public void SelectDefaultDisposition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapWarrants.warrantTypeEntry.uIDefaultDispositionComboBox);
			uIMapWarrants.warrantTypeEntry.uIDefaultDispositionComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyBottomStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantTypeEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1002 - Addition Successful"));
		}

		public void SelectAtExpiration() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapWarrants.warrantTypeEntry.uIExpirationComboBox,
					PoliceData.getWarrantModuleValue("Expiration"));
			uIMapWarrants.warrantTypeEntry.uIExpirationComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyWarrantTypeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(8519) Select warrant type");
		}

		public void SelectNCICCategory() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapWarrants.warrantTypeEntry.uINCICCategoryComboBox);
			uIMapWarrants.warrantTypeEntry.uIDefaultDispositionComboBox.sendKeys(Keys.TAB);
		}

		public void clickDeleteIcon() {
			uIMapWarrants.warrantTypeEntry.uIDeleteIcon.click();
			
		}
		public void verify8536ThisWarrantTypecannotbedeleted() {
			popup.acknowledge.okWithExpectedMessage("(8536) This Warrant Type cannot be deleted because it is associated with a Warrant.");
		}

		public void verifyUpdatesucessFullMessage() {
			verify.ExpectedValueIsTrue(uIMapWarrants.warrantTypeEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update Successful"));
			
		}

		public void verifyDeleteConfirmMessage() {
			popup.confirm.yesWithExpectedMessage("(4)Do you really want to delete?");
			
		}
	}

}
