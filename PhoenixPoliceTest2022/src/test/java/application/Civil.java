package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataAccess.PoliceData;
import uIMaps.UIMapCivil;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Civil {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	UIMapCivil uIMapCivil = new UIMapCivil();
	public Popup popUp = new Popup();
	public Popup.Acknowledge acknowledge = popUp.new Acknowledge();
	Randomized randomized = new Randomized();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public Names names = new Names();

	public PaperType paperType;
	public PaperTypesEntry paperTypesEntry;
	public CivilSearch civilSearch;
	public PaperEntry paperEntry;
	public CivilForm civilForm;
	public AuthenticationWindow authenticationWindow;
	public District district;
	public DistrictCode districtCode;
	public Payment payment;
	public CivilStatement civilStatement;
	public CivilContact civilContact;
	public PropertyInventoryScreen propertyInventoryScreen;
	public CivilProperty civilProperty;
	public CivilDetails civilDetails;
	public Assignment assignment;
	public ServiceAction serviceAction;
	public ServiceActionEntry serviceActionEntry;

	public Civil() {
		if (paperType == null)
			paperType = new PaperType();

		if (paperTypesEntry == null)
			paperTypesEntry = new PaperTypesEntry();

		if (civilSearch == null)
			civilSearch = new CivilSearch();

		if (paperEntry == null)
			paperEntry = new PaperEntry();

		if (civilForm == null)
			civilForm = new CivilForm();

		if (authenticationWindow == null)
			authenticationWindow = new AuthenticationWindow();

		if (district == null)
			district = new District();

		if (districtCode == null)
			districtCode = new DistrictCode();

		if (payment == null)
			payment = new Payment();

		if (civilStatement == null)
			civilStatement = new CivilStatement();

		if (civilContact == null)
			civilContact = new CivilContact();

		if (propertyInventoryScreen == null)
			propertyInventoryScreen = new PropertyInventoryScreen();

		if (civilProperty == null)
			civilProperty = new CivilProperty();

		if (civilDetails == null)
			civilDetails = new CivilDetails();

		if (assignment == null)
			assignment = new Assignment();
		
		if (serviceAction == null)
			serviceAction = new ServiceAction();

		if (serviceActionEntry == null)
			serviceActionEntry = new ServiceActionEntry();

	}

	public void switchToCivilSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Civil Search");
		Playback.controlReadyThreadWait();
	}

	public void switchToCivilForm() {
		objectIdentification.windowHandle.switchToWindow("Civil Form");
		Playback.controlReadyThreadWait();

	}

	public void switchToPaperEntry() {
		objectIdentification.windowHandle.switchToWindow("Paper Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToPaperInfoEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPaperInfo");
		Playback.controlReadyThreadWait();
	}

	public void switchToAuthenticationWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmCivilPFAuthentication");
	}

	public void switchToDistrict() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("District");
		Playback.controlReadyThreadWait();

	}

	public void switchToDistrictCode() {
		objectIdentification.windowHandle.switchToWindow("District Code");
		Playback.controlReadyThreadWait();
	}

	public void switchToPayment() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Payment");
	}

	public void switchToCivilStatement() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Civil Statement");
	}

	public void switchToCivilStatementEntry() {
		objectIdentification.windowHandle.switchToWindow("Civil Statement");
	}

	public void switchToPaperType() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Paper Type");
		Playback.controlReadyThreadWait();
	}

	public void switchToPaperTypeEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPaperType");
		Playback.controlReadyThreadWait();
	}

	public void switchToCivilContact() {
		objectIdentification.windowHandle.switchToWindow("Civil Contact");
	}

	public void switchToPropertyInventoryScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPropertyInventory");
		Playback.controlReadyThreadWait();
	}

	public void switchToCivilPropertyScreen() {
		objectIdentification.windowHandle.switchToWindow("Civil Property");
		Playback.controlReadyThreadWait();
	}

	public void switchToCivilDetailsScreen() {
		objectIdentification.windowHandle.switchToWindow("Civil Details");
		Playback.controlReadyThreadWait();
	}

	public void switchToCivilFormTROInfoEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmCvlTRO");
		Playback.controlReadyThreadWait();
	}

	public void switchToAssignment() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Assignment");
		Playback.controlReadyThreadWait();
	}
	
	public void switchToServiceAction() 
	{
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Service Action");
		Playback.controlReadyThreadWait();
		
	}
	
	public void switchToServiceActionEntry()
	{
		objectIdentification.windowHandle.switchToWindow("Service Action Entry");
	}

	public class CivilSearch {
		public void enterAtCivilProcessNo() {
			uIMapCivil.civilSearch.uICivilProcessFromYearEdit
					.sendKeys(PoliceData.getCivilModuleValue("CivilProcessNo").substring(0, 2));
			uIMapCivil.civilSearch.uICivilProcessFromNumberEdit
					.sendKeys(PoliceData.getCivilModuleValue("CivilProcessNo").substring(3));
			uIMapCivil.civilSearch.uICivilProcessFromNumberEdit.sendKeys(Keys.TAB);
			uIMapCivil.civilSearch.uICivilProcessToYearEdit
					.sendKeys(PoliceData.getCivilModuleValue("CivilProcessNo").substring(0, 2));
			uIMapCivil.civilSearch.uICivilProcessToNumberEdit
					.sendKeys(PoliceData.getCivilModuleValue("CivilProcessNo").substring(3));
			uIMapCivil.civilSearch.uICivilProcessToNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapCivil.civilSearch.uISearchButton.click();
			Playback.gridLoadThreadWait();
		}

		public void enterAtCourtCase() {
			uIMapCivil.civilSearch.uICourtCaseNumberEdit.sendKeys(PoliceData.getCivilModuleValue("CourtCaseNo"));
		}

		public void selectAtCivilIDInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.civilSearch.uICivilSearchResultGrid, PoliceData.getCivilModuleValue("CivilID"));
		}

		public void selectAtCivilNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.civilSearch.uICivilSearchResultGrid, PoliceData.getCivilModuleValue("CivilNo"));
		}

		public void clickAddNewButton() {
			uIMapCivil.civilSearch.uIAddNewButton.click();
			Playback.gridLoadThreadWait();
		}

		public void clickCourtCaseText() {
			uIMapCivil.civilSearch.uICourtCaseLabelText.click();
		}

		public void clickCustomText() {
			uIMapCivil.civilSearch.uICustomLabelText.click();
		}

		public void verifyAtCivilNumber(int rowIndex) // table issue
		{
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilNo"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCivil.civilSearch.uICivilSearchResultGrid, "Civil ID", rowIndex)
							.getText());
		}

		public void verifyAtStatus(int rowIndex, int columnIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Status"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCivil.civilSearch.uICivilSearchResultGrid, rowIndex, columnIndex)
							.getText());
		}

		public void verifyCourtCaseFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilSearch.uICourtCaseNumberEdit.isEnabled());
		}

		public void verifyCustomEnabled() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilSearch.uICustomEdit.isEnabled());
		}

		public void verifyCourtCaseFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilSearch.uICourtCaseNumberEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCustomHide() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilSearch.uICustomEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void enterAtCivilRefID() {
			uIMapCivil.civilSearch.uICivilRefIDEdit.sendKeys(PoliceData.getCivilModuleValue("CivilRefID"));
		}

		public void verifyAtCivilID(int rowIndex)// table column issue
		{
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilID"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCivil.civilSearch.uICivilSearchResultGrid, "Person", rowIndex).getText());
		}

		public void verifyAtCivilNo(int rowIndex)// table column issue
		{

			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilNo"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCivil.civilSearch.uICivilSearchResultGrid, "Civil ID", rowIndex)
							.getText());
		}

		public void selectAtPaperType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.civilSearch.uIPaperTypeComboBox,
					PoliceData.getCivilModuleValue("PaperType"));
		}

		public void verifyAtPaperType(int rowIndex)// table column issue
		{
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperType"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCivil.civilSearch.uICivilSearchResultGrid, "Status", rowIndex).getText());
		}

		public void selectAtPaperInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.civilSearch.uICivilSearchResultGrid, PoliceData.getCivilModuleValue("Paper"));
		}

		public void selectAtServiceAction() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.civilSearch.uIServiceActionComboBox,
					PoliceData.getCivilModuleValue("ServiceAction"));
		}

		public void enterCivilProcessNo(String civilProcessYear, String civilProcessNo) {
			uIMapCivil.civilSearch.uICivilProcessFromYearEdit.sendKeys(civilProcessYear);
			uIMapCivil.civilSearch.uICivilProcessFromNumberEdit.sendKeys(civilProcessNo);
			uIMapCivil.civilSearch.uICivilProcessFromNumberEdit.sendKeys(Keys.TAB);
			uIMapCivil.civilSearch.uICivilProcessToYearEdit.sendKeys(civilProcessYear);
			uIMapCivil.civilSearch.uICivilProcessToNumberEdit.sendKeys(civilProcessNo);
			uIMapCivil.civilSearch.uICivilProcessToNumberEdit.sendKeys(Keys.TAB);
		}

		public void selectCivilIDInGrid(String civilID) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapCivil.civilSearch.uICivilSearchResultGrid, civilID);

		}

		public void verifyAtPaperColumnValues()// table column issue
		{
			// Assert.AreEqual(PoliceData.getCivilModuleValue("Paper"),
			// objectIdentification.manualIdentify.getGridTableColumnValues
			// (uIMapCivil.civilSearch.uICivilSearchResultGrid, "Paper"));

			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapCivil.civilSearch.uICivilSearchExpandResultGrid, "Status");

			for (String paper : cellValues) {
				if (paper != "") {
					verify.ExpectedPropertyValueIsEqual(paper, PoliceData.getCivilModuleValue("Paper"));
				} else
					Playback.controlReadyThreadWait();
			}
		}

		public void clickBackButton() {
			uIMapCivil.civilSearch.uIBackButton.click();
			Playback.gridLoadThreadWait();
		}

		public void clickResetButton() {
			uIMapCivil.civilSearch.uIResetButton.click();
			Playback.gridLoadThreadWait();
		}

		public void enterAtServiceLocation() {
			uIMapCivil.civilSearch.uIServiceLocationEdit.sendKeys(PoliceData.getCivilModuleValue("ServiceLocation"));
			uIMapCivil.civilSearch.uIServiceLocationVerifyCheckBox.sendKeys(Keys.TAB);
		}
	}

	public class CivilForm {

		public CivilFeesPaymentsTab civilFeesPaymentsTab;
		public CivilNamesTab civilNamesTab;
		public CivilServiceTab civilServiceTab;
		public CivilPropertyTab civilPropertyTab;
		public CivilCommentsTab civilCommentsTab;

		public CivilForm() {
			if (civilFeesPaymentsTab == null)
				civilFeesPaymentsTab = new CivilFeesPaymentsTab();

			if (civilNamesTab == null)
				civilNamesTab = new CivilNamesTab();

			if (civilServiceTab == null)
				civilServiceTab = new CivilServiceTab();

			if (civilPropertyTab == null)
				civilPropertyTab = new CivilPropertyTab();

			if (civilCommentsTab == null)
				civilCommentsTab = new CivilCommentsTab();

		}

		public void clickFeesPaymentTab() {
			uIMapCivil.civilForm.uIFeesPaymentsTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickNamesTab() {
			uIMapCivil.civilForm.uINamesTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickServiceTab() {
			Playback.controlReadyThreadWait();
			uIMapCivil.civilForm.uIServiceTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickPropertyTab() {
			Playback.controlReadyThreadWait();
			uIMapCivil.civilForm.uIPropertyTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCivilSrchAdv");
			Playback.controlReadyThreadWait();
		}

		public void verifyAtCivilProcessNumber() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilNo").substring(0, 2),
					uIMapCivil.civilForm.uICivilProcessYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilNo").substring(3),
					uIMapCivil.civilForm.uICivilProcessNumberEdit.getAttribute("value"));
		}

		public void verifyStatusAsOpen() {
			verify.ExpectedPropertyValueIsEqual("OPEN", uIMapCivil.civilForm.uICivilFormStatusTextView.getText());
		}

		public void verifyStatusAsServed() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.uICivilFormStatusLableTextView.getText().contains("SERVED"));
		}

		public void verifyStatusAsClosed() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilForm.uICivilFormStatusTextView.getText().contains("CLOSED"));
		}

		public void verifyAtCivilID() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilForm.uICivilIDEdit.getAttribute("value")
					.contains(PoliceData.getCivilModuleValue("CivilID")));
		}

		public void saveScreen() {
			uIMapCivil.civilForm.uISaveButton.click();
			Playback.pageLoadThreadWait();

			popUp.confirm.yes();
			Playback.pageLoadThreadWait();

		}

		public void verifySaveScreenConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage("(3)     Do You Want To Save All Of The Entered Details?");
			} else
				popUp.confirm.yesWithExpectedMessage("(3)Do You Want To Save All Of The Entered Details?");
			Playback.controlReadyThreadWait();
		}

		public void closeScreen() {
			Playback.driver.close();
		}

		public void clickSave() {
			uIMapCivil.civilForm.uISaveButton.click();

		}

		public void clickSaveButton() {
			uIMapCivil.civilForm.uISaveButton.click();
			if (Playback.browserType.contains("Chrome")) {
				try {
					Playback.driver.switchTo().alert().accept();
				} catch (NoAlertPresentException ex) {
					uIMapCivil.civilForm.uISaveButton.click();
				}
			} else if (Playback.browserType.contains("Chrome")) {
				try {
					popUp.confirm.yes();
				} catch (NoAlertPresentException ex) {
					uIMapCivil.civilForm.uISaveButton.click();
				}
			}

		}

		public void clickPaperButton() {
			uIMapCivil.civilForm.uIPaperButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtCourtCaseNo() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilForm.uICourtCaseNoEdit.getAttribute("value")
					.contains(PoliceData.getCivilModuleValue("CourtCaseNo")));
		}

		public void verifyAtExecution() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilForm.uIExecutionEdit.getAttribute("value")
					.contains(PoliceData.getCivilModuleValue("Execution")));
		}

		public void verifyAtPaperDescription() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Description"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapCivil.civilForm.uIPaperDescriptionCombobox));
		}

		public void verifyAtOtherPaper() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("OtherPaper"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapCivil.civilForm.uIPaperDescriptionCombobox));
		}

		public void clickAllTabs() {
			uIMapCivil.civilForm.uINamesTab.click();
			uIMapCivil.civilForm.uIServiceTab.click();
			uIMapCivil.civilForm.uIFeesPaymentsTab.click();
			uIMapCivil.civilForm.uICommentsTab.click();
			uIMapCivil.civilForm.uIAttachmentTab.click();
		}

		public void verifyPaperCountAs4() {
			verify.ExpectedPropertyValueIsEqual("4", uIMapCivil.civilForm.uIPaperCountEdit.getAttribute("value"),
					"Verify Paper Count Match with 4");
		}

		public void verifyAtPaperType() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperType"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapCivil.civilForm.uIPaperDescriptionCombobox));
		}

		public void verifyPaperCountAs1() {
			verify.ExpectedPropertyValueIsEqual("1", uIMapCivil.civilForm.uIPaperCountEdit.getAttribute("value"),
					"Verify Paper Count Match with 1");
		}

		public void verifyWaiveFeesFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.uIFeeWaivedCombobox.getAttribute("class").contains("SELECTInActive"),
					"verify waive Fees field disabled");
		}

		public void clickAccompaningDocumentCheckbox() {
			uIMapCivil.civilForm.uIAccompaningDocumentationCheckbox.click();
		}

		public void enterAtCivilID() {
			uIMapCivil.civilForm.uICivilIDEdit.clear();
			uIMapCivil.civilForm.uICivilIDEdit.sendKeys(PoliceData.getCivilModuleValue("CivilID"));
		}

		public void enterAtCourtCase() {
			uIMapCivil.civilForm.uICourtCaseNoEdit.clear();
			uIMapCivil.civilForm.uICourtCaseNoEdit.sendKeys(PoliceData.getCivilModuleValue("CourtCase"));
		}

		public void clickWaivedReasonCheckbox() {
			uIMapCivil.civilForm.uIFeeWaivedCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyWaiveFeesConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage("(20010) Do you really want to waive the fees?");
			} else
				popUp.confirm.yesWithExpectedMessage("(20010)     Do you really want to waive the fees?");
			Playback.controlReadyThreadWait();
		}

		public void verifyWaiveFeesFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilForm.uIFeeWaivedCombobox.isEnabled(),
					"verify waive Fees field enabled");
		}

		public void selectWaivedFees() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapCivil.civilForm.uIFeeWaivedCombobox);
			uIMapCivil.civilForm.uIFeeWaivedCombobox.sendKeys(Keys.TAB);
		}

		public void enterCourtDateAsCurrentDate() {
			uIMapCivil.civilForm.uICourtDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapCivil.civilForm.uICourtDateEdit.sendKeys(Keys.TAB);
		}

		public void enterServeByAsFutureDate() {
			uIMapCivil.civilForm.uIServeByDateEdit.clear();
			uIMapCivil.civilForm.uIServeByDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapCivil.civilForm.uIServeByDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyServeFutureDateAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(20024) Serve Date must be prior to Court Date");
		}

		public void enterServeByAsCurrentDate() {
			uIMapCivil.civilForm.uIServeByDateEdit.click();
			uIMapCivil.civilForm.uIServeByDateEdit.clear();
			uIMapCivil.civilForm.uIServeByDateEdit.clear();
			uIMapCivil.civilForm.uIServeByDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapCivil.civilForm.uIServeByDateEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCustom() {
			uIMapCivil.civilForm.uICustomEdit.sendKeys(PoliceData.getCivilModuleValue("Custom"));
		}

		public void enterBond() {
			uIMapCivil.civilForm.uIBondEdit.click();
			uIMapCivil.civilForm.uIBondEdit.sendKeys(Randomized.randomNumberString(2));
		}

		public void enterExecutionAmountAs25() {
			uIMapCivil.civilForm.uIExecutionEdit.sendKeys("25");
		}

		public void verifyStatusAsServiceAttempt() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.uICivilFormStatusLableTextView.getText().contains("SERVICE ATTEMPT"));
		}

		public void clickCommentsTab() {
			Playback.controlReadyThreadWait();
			uIMapCivil.civilForm.uICommentsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmPersonnelComments");
			Playback.controlReadyThreadWait();
		}

		public void clickTROButton() {
			uIMapCivil.civilForm.uITROButton.click();
		}

		public void verifyIssuedDateAscurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapCivil.civilForm.uIIssuingDateEdit.getAttribute("value"));
		}

		public void veifyAtIssuingOfficial() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("IssuingOfficialID").substring(0, 1),
					uIMapCivil.civilForm.uIIssuingOfficalNameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("IssuingOfficialID").substring(2),
					uIMapCivil.civilForm.uIIssuingOfficalNameIDEdit.getAttribute("value"));
		}

		public void clickSaveandClose() {
			uIMapCivil.civilForm.uISaveAndCloseButton.click();
		}

		public void getCivilProcessNo(String civilProcessYear, String civilProcessNo) {
			civilProcessYear = uIMapCivil.civilForm.uICivilProcessYearEdit.getAttribute("value");
			civilProcessNo = uIMapCivil.civilForm.uICivilProcessNumberEdit.getAttribute("value");
		}

		public void getCivilID(String civilID) {
			civilID = uIMapCivil.civilForm.uICivilIDEdit.getAttribute("value");
		}

		public void veifyIssuingOfficialAtPrimaryNameID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PrimaryNameID").substring(0, 1),
					uIMapCivil.civilForm.uIIssuingOfficalNameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PrimaryNameID").substring(2),
					uIMapCivil.civilForm.uIIssuingOfficalNameIDEdit.getAttribute("value"));
		}

		public void verifyAtAddressForTROScreen() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilForm.uITROAddressEdit.getAttribute("value")
					.contains(PoliceData.getCivilModuleValue("Address")));
		}

	}

	public class CivilFeesPaymentsTab {
		public void clickWriteOffCheckBox() {
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIWriteOffCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void selectMethod() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethodComboBox);
		}

		public void enterAtAuthBy() {
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIAuthByEdit.sendKeys(PoliceData.getCivilModuleValue("AuthBy"));
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIAuthByEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyCurrentDateInDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIDateEdit.getAttribute("value"));
		}

		public void verifyDateMethodAuthByMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIDateLabelText.getAttribute("class").contains("req"));
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethodLableText.getAttribute("class").contains("req"));
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIAuthByLableTest.getAttribute("class").contains("req"));
		}

		public void verifyAtPaperFee() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperFee"),
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIPaperFeeEdit.getAttribute("value"));
		}

		public void verifyAtServiceFee() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("ServiceFee"),
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIServiceFeeEdit.getAttribute("value"));
		}

		public void verifyTransactionAsExecutionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Execution", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIFeePaymentResultGrid, "Transaction", rowIndex));
		}

		public void verifyAtDebitInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Debit"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilFeesPaymentsTab.uIFeePaymentResultGrid, "Debit", rowIndex));
		}

		public void verifyAtFeeBalance() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("FeeBalance"),
					uIMapCivil.civilForm.civilFeesPaymentsTab.uIFeesBalanceEdit.getAttribute("value"));
		}

		public void selectTransactionTypeAsPaperFee() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCivil.civilForm.civilFeesPaymentsTab.uITransactionTypeComboBox, "Paper Fee");
			uIMapCivil.civilForm.civilFeesPaymentsTab.uITransactionTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectServiceMethodsAsCashCredit() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethodComboBox, "Cash");
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethodComboBox.sendKeys(Keys.TAB);
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethod2ComboBox, "Credit");
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethod2ComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtAmount() {
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIAmountEdit.sendKeys(PoliceData.getCivilModuleValue("Amount"));
		}

		public void enterNote() {
			uIMapCivil.civilForm.civilFeesPaymentsTab.uINoteEdit.sendKeys(Randomized.randomString(25));
		}

		public void selectAtName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCivil.civilForm.civilFeesPaymentsTab.uINamesComboBox, PoliceData.getCivilModuleValue("Name"));
			uIMapCivil.civilForm.civilFeesPaymentsTab.uINamesComboBox.sendKeys(Keys.TAB);
		}

		public void clickAdd() {
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIAddButton.click();
			Playback.threadWait();
		}

		public void verifyAtNameInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilFeesPaymentsTab.uIFeePaymentResultGrid, "Name", rowIndex));
		}

		public void verifyAtCreditInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Credit"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilFeesPaymentsTab.uIFeePaymentResultGrid, "Credit", rowIndex));
		}

		public void selectServiceMethodsAsCashDebit() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethodComboBox, "Cash");
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethodComboBox.sendKeys(Keys.TAB);
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethod2ComboBox, "Debit");
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIMethod2ComboBox.sendKeys(Keys.TAB);
		}

		public void selectTransactionType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilFeesPaymentsTab.uITransactionTypeComboBox);
			uIMapCivil.civilForm.civilFeesPaymentsTab.uITransactionTypeComboBox.sendKeys(Keys.TAB);
		}

		public void tabDate() {
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIDateEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterNotes() {
			uIMapCivil.civilForm.civilFeesPaymentsTab.uINotesEdit.sendKeys(Randomized.randomString(25));
		}

		public void selectWriteMethod() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilFeesPaymentsTab.uIWriteMethodComboBox);
			uIMapCivil.civilForm.civilFeesPaymentsTab.uIWriteMethodComboBox.sendKeys(Keys.TAB);
		}
	}

	public class CivilNamesTab {
		public void enterAtLastName() {
			uIMapCivil.civilForm.civilNamesTab.uILastNameEdit.sendKeys(PoliceData.getCivilModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapCivil.civilForm.civilNamesTab.uIFirstNameEdit.sendKeys(PoliceData.getCivilModuleValue("FirstName"));
			uIMapCivil.civilForm.civilNamesTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void selectAtNameInNameSearchHelpWindow() {
			Playback.controlReadyThreadWait();
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void verifyAtAddressWithJuris() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilNamesTab.uIAddressEdit.getAttribute("value").contains("PX"));
		}

		public void verifyAtAddressWithoutJuris() {
			verify.ExpectedValueIsFalse(
					uIMapCivil.civilForm.civilNamesTab.uIAddressEdit.getAttribute("value").contains("PX"));
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.civilForm.civilNamesTab.uITypeComboBox,
					PoliceData.getCivilModuleValue("Type"));
		}

		public void clickToBeServedCheckBox() {
			uIMapCivil.civilForm.civilNamesTab.uIToServedCheckBox.click();
		}

		public void clickAddButton() {
			uIMapCivil.civilForm.civilNamesTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyDistrictAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(20040) District is Mandatory");
		}

		public void selectDistrict() {
			uIMapCivil.civilForm.civilNamesTab.uIDistrictLookupButton.click();
			objectIdentification.windowHandle.switchToWindow("Coded Search");
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyAtTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Type"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Type", rowIndex));
		}

		public void clickDistrictLookupButton() {
			uIMapCivil.civilForm.civilNamesTab.uIDistrictLookupButton.click();
		}

		public void verifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Name", rowIndex));
		}

		public void selectAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, PoliceData.getCivilModuleValue("Name"));
			Playback.controlReadyThreadWait();
		}

		public void verifyPrimaryContactCheckBoxChecked() {
			verify.ExpectedValueIsTrue((uIMapCivil.civilForm.civilNamesTab.uIPrimaryContactCheckBox.isSelected()));
		}

		public void clickClearButton() {
			uIMapCivil.civilForm.civilNamesTab.uIClearButton.click();
		}

		public void clickPrimaryContactCheckBox() {
			uIMapCivil.civilForm.civilNamesTab.uIPrimaryContactCheckBox.click();
		}

		public void selectAtName1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, PoliceData.getCivilModuleValue("Name1"));
			Playback.controlReadyThreadWait();
		}

		public void selectTypeAsDefendant() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.civilForm.civilNamesTab.uITypeComboBox,
					"Defendant");
			uIMapCivil.civilForm.civilNamesTab.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectTypeAsWitness() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.civilForm.civilNamesTab.uITypeComboBox,
					"Witness");
			uIMapCivil.civilForm.civilNamesTab.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAddressDistrictLabelMandatory() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilNamesTab.uIAddressDistrictLabel.getAttribute("class").contains("req"),
					"Verifying Address Disticts Label Mandatory");
		}

		public void enterAtNameID() {
			uIMapCivil.civilForm.civilNamesTab.uINameTypeEdit
					.sendKeys(PoliceData.getCivilModuleValue("NameID").substring(0, 1));
			uIMapCivil.civilForm.civilNamesTab.uINameTypeIDEdit
					.sendKeys(PoliceData.getCivilModuleValue("NameID").substring(2));
			uIMapCivil.civilForm.civilNamesTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void clickBillableCheckBox() {
			uIMapCivil.civilForm.civilNamesTab.uIBillableCheckBox.click();
		}

		public void enterComments() {
			uIMapCivil.civilForm.civilNamesTab.uICommentsEdit.sendKeys(Randomized.randomString(25));
		}

		public void verifyTypeAsDefendantInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Defendant", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Type", rowIndex));
		}

		public void verifyBillableCheckboxCheckedInGrid() {
			WebElement BillableCheck = objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Defendant", "Billable")
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(BillableCheck.getAttribute("alt").contains("Checked"));
		}

		public void verifyToBeServedCheckboxCheckedInGrid() {
			WebElement BillableCheck = objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Defendant", "Served")
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(BillableCheck.getAttribute("alt").contains("Checked"));
		}

		public void verifyDefendantRowColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Defendant")
					.getAttribute("class").contains("gridrowclr_Red"), "Verifing the Defendant row color as red");
		}

		public void verifyEtAlCheckboxDisabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapCivil.civilForm.civilNamesTab.uIETAlCheckBox.getAttribute("disabled")),
					"Verifing Et Al Checkbox unChecked");
		}

		public void verifyTypeAsWitnessInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Witness", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Type", rowIndex));
		}

		public void clickAssociatesLookupIcon() {
			uIMapCivil.civilForm.civilNamesTab.uIAssociatesLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAssociatesIconInGrid(int rowIndex) {
			WebElement uIAssociates = objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, rowIndex, 34);
			verify.ExpectedValueIsTrue(uIAssociates.getAttribute("class").contains("gridrowclr_Contact"));
		}

		public void verifyAtNameRowColorAsBlack() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid,
									PoliceData.getCivilModuleValue("Name"))
							.getCssValue("color").contains("0, 0, 0, 1"),
					"Verifying Color As Black");
		}

		public void clickAssociatesIconInGrid(int rowIndex) {
			objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, rowIndex, 34).click();
			Playback.controlReadyThreadWait();
		}

		public void clickNameInfoIcon() {
			uIMapCivil.civilForm.civilNamesTab.uINameInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtAddressInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.civilForm.civilNamesTab.uINamesTabResultGrid, "Address", rowIndex)
					.contains(PoliceData.getCivilModuleValue("Address")));
		}
	}

	public class CivilServiceTab {
		public void clickAddButton() {
			uIMapCivil.civilForm.civilServiceTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyServiceAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(20040) ServiceAction is Mandatory");
		}

		public void selectActionAsServed() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilServiceTab.uIActionComboBox, "Served");
			uIMapCivil.civilForm.civilServiceTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCivil.civilForm.civilServiceTab.uIActionComboBox, PoliceData.getCivilModuleValue("Action"));
			uIMapCivil.civilForm.civilServiceTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectReason() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilServiceTab.uIReasonComboBox);
			uIMapCivil.civilForm.civilServiceTab.uIReasonComboBox.sendKeys(Keys.TAB);
		}

		public void enterDateandTimeAsPreviousDate() {
			uIMapCivil.civilForm.civilServiceTab.uIDateEdit.click();
			uIMapCivil.civilForm.civilServiceTab.uIDateEdit.sendKeys("02/02/2018");
			uIMapCivil.civilForm.civilServiceTab.uIDateEdit.click();
			uIMapCivil.civilForm.civilServiceTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapCivil.civilForm.civilServiceTab.uITimeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyPriorDateConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage(
						"(20015) The service date you selected is prior to the date received, do you want to continue?");
			} else {
				popUp.confirm.yesWithExpectedMessage(
						"(20015)     The service date you selected is prior to the date received, do you want to continue?");
			}
		}

		public void enterLocation() {
			uIMapCivil.civilForm.civilServiceTab.uILocationEdit.sendKeys("6 Jefferson Ave");
			uIMapCivil.civilForm.civilServiceTab.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void selectDistrict() {
			uIMapCivil.civilForm.civilServiceTab.uIDistrictLookupButton.click();
			objectIdentification.windowHandle.switchToWindow("Coded Search");
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterServiceFee() {
			uIMapCivil.civilForm.civilServiceTab.uIServiceFeeEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumber(2)));
		}

		public void enterNarrative() {
			uIMapCivil.civilForm.civilServiceTab.uINarrativeEdit.sendKeys(Randomized.randomString(20));
		}

		public void verifyAtName() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapCivil.civilForm.civilServiceTab.uINameCombobox)
					.contains(PoliceData.getCivilModuleValue("LastName") + ", "
							+ PoliceData.getCivilModuleValue("FirstName")));
		}

		public void verifyNamesMandatoryFields() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilServiceTab.uINameTextView.getAttribute("class").contains("req"));
		}

		public void verifyServiceFeeMandatoryFields() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilServiceTab.uISeviceFeeTextView.getAttribute("class").contains("req"));
		}

		public void selectActionAsServiceAttempt() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilServiceTab.uIActionComboBox, "Service Attempt");
			uIMapCivil.civilForm.civilServiceTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectActionAsServedNoCharge() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCivil.civilForm.civilServiceTab.uIActionComboBox, "Served No Charge");
			uIMapCivil.civilForm.civilServiceTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyLocationDistrictMandantoryFields() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilServiceTab.uILocationTextView.getAttribute("class").contains("req"));
		}

		public void VerifyLocationSelected() {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Address"),
					uIMapCivil.civilForm.civilServiceTab.uILocationEdit.getAttribute("value"));
		}

		public void verifyReasonMandantoryFields() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilForm.civilServiceTab.uIReasonTextView.getAttribute("class").contains("req"));
		}

		public void verifyCollectionTypeMandantoryFields() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilForm.civilServiceTab.uICollectionTypeTextView
					.getAttribute("class").contains("req"));
		}

		public void selectAtName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCivil.civilForm.civilServiceTab.uINameCombobox, PoliceData.getCivilModuleValue("Name"));
			uIMapCivil.civilForm.civilServiceTab.uINameCombobox.sendKeys(Keys.TAB);
		}

		public void enterAtLocation() {
			uIMapCivil.civilForm.civilServiceTab.uILocationEdit.sendKeys(PoliceData.getCivilModuleValue("Location"));
			uIMapCivil.civilForm.civilServiceTab.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void tabDateandTime() {
			uIMapCivil.civilForm.civilServiceTab.uIDateEdit.click();
			uIMapCivil.civilForm.civilServiceTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapCivil.civilForm.civilServiceTab.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void selectAtName1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCivil.civilForm.civilServiceTab.uINameCombobox, PoliceData.getCivilModuleValue("Name1"));
			uIMapCivil.civilForm.civilServiceTab.uINameCombobox.sendKeys(Keys.TAB);
		}

		public void enterAtServiceFee() {
			uIMapCivil.civilForm.civilServiceTab.uIServiceFeeEdit.clear();
			uIMapCivil.civilForm.civilServiceTab.uIServiceFeeEdit
					.sendKeys(PoliceData.getCivilModuleValue("ServiceFee"));
		}

		public void verifyActionAsServedInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Served",
					objectIdentification.manualIdentify
							.getGridCell(uIMapCivil.civilForm.civilServiceTab.uIServiceAttemptResultGrid,
									"Service Action", rowIndex)
							.getText());
		}

		public void selectAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.civilForm.civilServiceTab.uIServiceAttemptResultGrid,
					PoliceData.getCivilModuleValue("Name"));
		}

		public void clickPropertyInventoryButton() {
			uIMapCivil.civilForm.civilServiceTab.uIPropertyInventoryButton.click();
			Playback.controlReadyThreadWait();
		}
	}

	public class CivilPropertyTab {
		public void verifyAtLocation(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Location"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilPropertyTab.uIPropertyTabResultGrid, "Property Location",
							rowIndex));
		}

		public void verifyAtSaleDateAsCurrentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilPropertyTab.uIPropertyTabResultGrid, "Sale Date", rowIndex));
		}

		public void verifyAtPropertyLocation(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PropertyLocation"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilPropertyTab.uIPropertyTabResultGrid, "Property Location",
							rowIndex));
		}

		public void clickAddNew() {
			uIMapCivil.civilForm.civilPropertyTab.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtPropertyLocation1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PropertyLocation1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilPropertyTab.uIPropertyTabResultGrid, "Property Location",
							rowIndex));
		}

		public void verifyAtBuyerName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("BuyerName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilPropertyTab.uIPropertyTabResultGrid, "Buyer Name", rowIndex));
		}

		public void verifySaleDateAsCurrentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilPropertyTab.uIPropertyTabResultGrid, "Sale Date", rowIndex));
		}

		public void verifyAdjournedDateAsFutureDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(5),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilPropertyTab.uIPropertyTabResultGrid, "Adjourned", rowIndex));
		}
	}

	public class CivilCommentsTab {
		public void selectCode() {
			uIMapCivil.civilForm.civilCommentsTab.uICodeLookupButton.click();
			objectIdentification.windowHandle.switchToWindow("Coded Search");
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtHeading() {
			uIMapCivil.civilForm.civilCommentsTab.uIHeadingEdit.sendKeys(PoliceData.getCivilModuleValue("Heading"));
		}

		public void clickEnterCommentsButton() {
			uIMapCivil.civilForm.civilCommentsTab.uIEnterCommentsButton.click();
			Playback.controlReadyThreadWait();
			Playback.threadWait(2000);
		}

		public void verifyDateAsCurrentDate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapCivil.civilForm.civilCommentsTab.uICommentsResultGrid, "Date Time", rowIndex)
					.contains(Randomized.getCurrentDate("MM/dd/yy")), "verifing Date shows as current date");
		}

		public void verifyAtHeading(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Heading"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilForm.civilCommentsTab.uICommentsResultGrid, "Heading", rowIndex));
		}

		public void deleteAtHeading1Row() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapCivil.civilForm.civilCommentsTab.uICommentsResultGrid,
					PoliceData.getCivilModuleValue("Heading1"));
		}

		public void verifyConfirmDeleteMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popUp.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void verifyRowCountInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(Integer.toString(rowCount),
					Integer.toString(objectIdentification.manualIdentify
							.getGridTableRowsCount(uIMapCivil.civilForm.civilCommentsTab.uICommentsResultGrid)));
		}
	}

	public class AuthenticationWindow {
		public void enterAtPassword() {
			uIMapCivil.authenticationWindow.uIPasswordEdit.sendKeys(PoliceData.getCivilModuleValue("Password"));
		}

		public void clickAcceptButton() {
			uIMapCivil.authenticationWindow.uIAcceptButton.click();
		}
	}

	public class PaperEntry {
		public void closeScreen() {
			Playback.driver.close();
		}

		public void clickCourtCaseNumberText() {
			uIMapCivil.paperEntry.uICourtCaseNumberText.click();
		}

		public void verifyCourtCaseFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapCivil.paperEntry.uICourtNumberEdit.isEnabled());
		}

		public void verifyCourtCaseFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.paperEntry.uICourtNumberEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCourtCaseMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.paperEntry.uICourtCaseNumberText.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void enterAtCivilID() {
			uIMapCivil.paperEntry.uICivilIDEdit.sendKeys(PoliceData.getCivilModuleValue("CivilID"));
		}

		public void enterAtCourtCaseNo() {
			uIMapCivil.paperEntry.uICourtNumberEdit.sendKeys(PoliceData.getCivilModuleValue("CourtCaseNo"));
		}

		public void enterAtPaperType() {
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperType"));
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterRecivedDateandTime() {
			uIMapCivil.paperEntry.uIReceivedDateEdit.click();
			uIMapCivil.paperEntry.uIReceivedDateEdit.sendKeys(Keys.TAB);
			uIMapCivil.paperEntry.uIReceivedTimeEdit.sendKeys(Keys.TAB);
		}

		public void clickSaveButton() {
			uIMapCivil.paperEntry.uISaveButton.click();
		}

		public void clickAddButton() {
			uIMapCivil.paperEntry.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyRequiredAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyOneRowAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(8515) Enter at least one row");

		}

		public void enterPropertyTypeAsPRO() {
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys("Pro");
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPaperInfoLocation() {
			uIMapCivil.paperEntry.uIPaperInfoLocationEdit.sendKeys(PoliceData.getCivilModuleValue("Location"));
			uIMapCivil.paperEntry.uIPaperInfoLocationEdit.sendKeys(Keys.TAB);
		}

		public void selectPaperInfoDistrict() {
			uIMapCivil.paperEntry.uIPaperInfoDistrictLookupbutton.click();
			objectIdentification.windowHandle.switchToWindow("Coded Search");
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterPaperInfoSaleDateandTime() {
			uIMapCivil.paperEntry.uIPaperInfoSaleDateEdit.click();
			uIMapCivil.paperEntry.uIPaperInfoSaleDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapCivil.paperEntry.uIPaperInfoSaleTimeEdit.click();
			uIMapCivil.paperEntry.uIPaperInfoSaleTimeEdit.sendKeys(Randomized.getCurrentTime());
			uIMapCivil.paperEntry.uIPaperInfoSaleTimeEdit.sendKeys(Keys.TAB);
		}

		public void savePaperInfoScreen() {
			uIMapCivil.paperEntry.uIPaperInfoSaveButton.click();
			popUp.confirm.yes();
		}

		public void verifyPaperInfoLocationAddedInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapCivil.paperEntry.uIPaperInfoResultGrid) == 1);
		}

		public void verifyPROaddedInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.paperEntry.uIPaperEntryResultGrid, "Code", rowIndex)
					.contains("Pro"));
		}

		public void saveScreen() {
			uIMapCivil.paperEntry.uISaveButton.click();
			popUp.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void clickAtCodeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.paperEntry.uIPaperEntryResultGrid, PoliceData.getCivilModuleValue("Code"));
		}

		public void clickPaperInfoDistrictLookup() {
			uIMapCivil.paperEntry.uIPaperInfoDistrictLookupbutton.click();
		}

		public void tabReceivedDateTime() {
			uIMapCivil.paperEntry.uIReceivedDateEdit.click();
			uIMapCivil.paperEntry.uIReceivedDateEdit.sendKeys(Keys.TAB);
			uIMapCivil.paperEntry.uIReceivedTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPaperInfoExecutionAmount() {
			uIMapCivil.paperEntry.uIPaperInfoExecutionAmountEdit
					.sendKeys(PoliceData.getCivilModuleValue("ExecutionAmount"));
		}

		public void saveClosePaperInfoScreen() {
			uIMapCivil.paperEntry.uIPaperInfoSaveAndCloseButton.click();
			popUp.confirm.yes();
		}

		public void verifyAtCodeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Code"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapCivil.paperEntry.uIPaperEntryResultGrid, "Code", rowIndex));
		}

		public void clickPaperInfoApplyCheckBox() {
			uIMapCivil.paperEntry.uIApplyCheckbox.click();
		}

		public void enterCourtCaseNo() {
			uIMapCivil.paperEntry.uICourtNumberEdit.sendKeys(Randomized.randomNumberString(4));
		}

		public void enterAtPaperInfoDistrict() {
			uIMapCivil.paperEntry.uIPaperInfoDistrictCodeEdit.sendKeys(PoliceData.getCivilModuleValue("District"));
			uIMapCivil.paperEntry.uIPaperInfoDistrictCodeEdit.sendKeys(Keys.TAB);
		}

		public void tabIssuingDateTime() {
			Playback.controlReadyThreadWait();
			uIMapCivil.paperEntry.uITROIssuedDateEdit.sendKeys(Keys.TAB);
			uIMapCivil.paperEntry.uITROTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterExpireDateAsFutureDate() {
			uIMapCivil.paperEntry.uITROExpiredDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapCivil.paperEntry.uITROExpiredTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void selectRelationship() {
			uIMapCivil.paperEntry.uITRORelationshipLookupbutton.click();
			objectIdentification.windowHandle.switchToWindow("Coded Search");
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtIssuingOfficalNameID() {
			uIMapCivil.paperEntry.uITROIssuingOfficialNameTypeEdit
					.sendKeys(PoliceData.getCivilModuleValue("NameID").substring(0, 1));
			uIMapCivil.paperEntry.uITROIssuingOfficialNameIDEdit
					.sendKeys(PoliceData.getCivilModuleValue("NameID").substring(2));
			uIMapCivil.paperEntry.uITROIssuingOfficialNameIDEdit.sendKeys(Keys.TAB);
		}

		public void selectFirearmsProhibted() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapCivil.paperEntry.uIFireArmsProhibtedCombobox);
			uIMapCivil.paperEntry.uIFireArmsProhibtedCombobox.sendKeys(Keys.TAB);
		}

		public void enterAtOtherPaper() {
			Playback.controlReadyThreadWait();
			uIMapCivil.paperEntry.uIOtherPaperEdit.clear();
			uIMapCivil.paperEntry.uIOtherPaperEdit.sendKeys(PoliceData.getCivilModuleValue("OtherPaper"));
		}

		public void verifyOtherPaperAtDescription() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Description"),
					uIMapCivil.paperEntry.uIOtherPaperEdit.getAttribute("value"));
		}

		public void verifyPaperTypeAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage(
					"(20043) Valid Paper Types include Property, TRO, Execution, and Other ONLY");
		}

		public void enterAtPaperType3() {
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperType3"));
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPaperType1() {
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperType1"));
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPaperType2() {
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperType2"));
			uIMapCivil.paperEntry.uIPaperTypeCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtCode1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Code1"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapCivil.paperEntry.uIPaperEntryResultGrid, "Code", rowIndex));
		}

		public void verifyAtCode2InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Code2"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapCivil.paperEntry.uIPaperEntryResultGrid, "Code", rowIndex));
		}

		public void verifyAtCode3InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Code3"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapCivil.paperEntry.uIPaperEntryResultGrid, "Code", rowIndex));
		}

		public void selectName() // still we didnt have few leter Name's, in future we changed in random leter
									// generation
		{
			uIMapCivil.paperEntry.uITROLastNameEdit.sendKeys("Mikenwp");
			uIMapCivil.paperEntry.uITROFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			names.nameSearchHelpWindow.SelectName();
		}

		public void verifyAtPaperTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.paperEntry.uIPaperEntryResultGrid, "Paper Type", rowIndex));
		}

		public void verifyAtPaperTypeDescription() {
			String attribute = uIMapCivil.paperEntry.uIPaperTypeCodeDescriptionTextEdit.getAttribute("title");
			verify.ExpectedPropertyValueIsEqual(attribute, PoliceData.getCivilModuleValue("PaperTypeDescription"));
		}

		public void clickPaperTypeLookUpIcon() {
			uIMapCivil.paperEntry.uIPaperTypeLookUpIcon.click();
		}

		public void verifyPaperTypeCodeValueInCodedSearchGrid() {
			popUp.switchToCodedSearch();
			String text = objectIdentification.manualIdentify
					.getGridCellInnerTextByText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "CodeValue", 0);
			verify.ExpectedPropertyValueIsEqual(text, PoliceData.getCivilModuleValue("CodeValue"));
		}

		public void verifyPapertTypeDescriptionInCodedSearchGrid() {
			popUp.switchToCodedSearch();
			String text = objectIdentification.manualIdentify
					.getGridCellInnerTextByText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "Description", 0);
			verify.ExpectedPropertyValueIsEqual(text, PoliceData.getCivilModuleValue("Description"));
		}

	}

	public class District {
		public void clickAddNew() {
			uIMapCivil.district.uIAddNewLink.click();
		}

		public void enterAtDistrict() {
			uIMapCivil.district.uIDistrictEdit.sendKeys(PoliceData.getCivilModuleValue("District"));
		}

		public void enterAtCity() {
			uIMapCivil.district.uICityEdit.sendKeys(PoliceData.getCivilModuleValue("City"));
		}

		public void clickSearchButton() {
			uIMapCivil.district.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtDistrict(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("District"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapCivil.district.uIDistrictResultGrid,
							"District", rowIndex));
		}

		public void verifyAtCity(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("City"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapCivil.district.uIDistrictResultGrid,
							"City", rowIndex));
		}

		public void verifyAtMileage(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.district.uIDistrictResultGrid, "Mileage", rowIndex)
					.contains(PoliceData.getCivilModuleValue("Mileage")));
		}

		public void clickAtDistrictinRow() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCivil.district.uIDistrictResultGrid,
					PoliceData.getCivilModuleValue("District"));
		}

		public void verifyNoRecordAcknowledgeMessge() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
			} else {
				popUp.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			}
		}

		public void clickInactiveCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapCivil.district.uIInactiveCheckbox.click();
		}

		public void deleteAtDistrictRow() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(uIMapCivil.district.uIDistrictResultGrid,
					PoliceData.getCivilModuleValue("District"));
		}

		public void verifyConfirmDeleteMessage() {

			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popUp.confirm.yesWithExpectedMessage("(4)     Do you really want to delete?");
		}

		public void verifyDistrictRowCount() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapCivil.district.uIDistrictResultGrid) == 1);
		}

		public void verifyInactiveRowColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapCivil.district.uIDistrictResultGrid, rowIndex).getAttribute("class")
					.contains("gridrowclr"));
		}

		public void deleteAtDistrictSelectedRow() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapCivil.district.uIDistrictResultGrid, PoliceData.getCivilModuleValue("District"));
		}
	}

	public class DistrictCode {
		public void enterAtDistrict() {
			uIMapCivil.districtCode.uIDistrictEdit.sendKeys(PoliceData.getCivilModuleValue("District"));
		}

		public void enterAtCity() {
			uIMapCivil.districtCode.uICityEdit.sendKeys(PoliceData.getCivilModuleValue("City"));
		}

		public void enterAtMileage() {
			uIMapCivil.districtCode.uIMilesEdit.sendKeys(PoliceData.getCivilModuleValue("Mileage"));
		}

		public void enterAtMiles() {
			uIMapCivil.districtCode.uIMilesEdit.sendKeys(PoliceData.getCivilModuleValue("Miles"));
		}

		public void enterAtPostLocation() {
			uIMapCivil.districtCode.uIPostLocationEdit.sendKeys(PoliceData.getCivilModuleValue("PostLocation"));
			uIMapCivil.districtCode.uIPostLocationEdit.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapCivil.districtCode.uIAddButton.click();
		}

		public void verifyAtPostLocation(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PostLocation"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.districtCode.uIDistrictCodeResultGrid, "Post Location", rowIndex));
		}

		public void verifyAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void save() {
			uIMapCivil.districtCode.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void close() {
			Playback.controlReadyThreadWait();
			Playback.driver.close();
		}

		public void deleteAtPostLocation() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapCivil.districtCode.uIDistrictCodeResultGrid, PoliceData.getCivilModuleValue("PostLocation"));
			Playback.controlReadyThreadWait();
			popUp.confirm.yes();
		}

		public void verifyPostLocationDeleted(int rowCount) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapCivil.districtCode.uIDistrictCodeResultGrid) == rowCount);
		}

		public void clickAtPostLocationInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.districtCode.uIDistrictCodeResultGrid, PoliceData.getCivilModuleValue("PostLocation"));
		}

		public void verifyAtAddressInPostLocationField() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PostLocation"),
					uIMapCivil.districtCode.uIPostLocationEdit.getAttribute("value"));
		}

		public void clickInactiveCheckBox() {
			uIMapCivil.districtCode.uIInactiveCheckbox.click();
		}

		public void verifyInactiveDateAsCurrentDate() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapCivil.districtCode.uIInactiveDateTextView.getAttribute("value")
					.contains(Randomized.getCurrentDate()), "Verify Current Date Shows");
		}

		public void enterAtPostLocation1() {
			uIMapCivil.districtCode.uIPostLocationEdit.sendKeys(PoliceData.getCivilModuleValue("PostLocation1"));
			uIMapCivil.districtCode.uIPostLocationEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPostLocation2() {
			uIMapCivil.districtCode.uIPostLocationEdit.sendKeys(PoliceData.getCivilModuleValue("PostLocation2"));
			uIMapCivil.districtCode.uIPostLocationEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtPostLocation1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PostLocation1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.districtCode.uIDistrictCodeResultGrid, "Post Location", rowIndex));
		}

		public void verifyAtPostLocation2(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PostLocation2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.districtCode.uIDistrictCodeResultGrid, "Post Location", rowIndex));
		}
	}

	public class Payment {
		public void clickReset() {
			uIMapCivil.payment.uIRefreshButton.click();
		}

		public void enterAtInvoiceID() {
			uIMapCivil.payment.uIInvoiceNoYearEdit
					.sendKeys(PoliceData.getCivilModuleValue("InvoiceNo").substring(0, 2));
			uIMapCivil.payment.uIInvoiceNoEdit.sendKeys(PoliceData.getCivilModuleValue("InvoiceNo").substring(3));
			uIMapCivil.payment.uIInvoiceNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Name"),
					uIMapCivil.payment.uINameEdit.getAttribute("value"));
		}

		public void verifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Address"),
					uIMapCivil.payment.uIAddressEdit.getAttribute("value"));
		}

		public void verifyAtCivilIDInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilID"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapCivil.payment.uIPaymentGridTable,
							"CivilID", rowIndex));
		}

		public void clickPaymentMethodIconInGrid(int rowIndex) {
			WebElement paymentIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.payment.uIPaymentGridTable, "Payment Method", rowIndex);
			paymentIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void clickPrintReceiptButton() {
			uIMapCivil.payment.uIPrintReceiptButton.click();
		}

		public void selectPopupPaymentMethodAsCash() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.payment.uIPopupPaymentMethodCombobox,
					"1 - Cash");
			uIMapCivil.payment.uIPopupPaymentMethodCombobox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtPopupAmount() {
			uIMapCivil.payment.uIPopupAmountEdit.sendKeys(PoliceData.getCivilModuleValue("Amount"));
		}

		public void enterPopupAmountAs9999() {
			uIMapCivil.payment.uIPopupAmountEdit.sendKeys("9999");
			uIMapCivil.payment.uIPopupAmountEdit.sendKeys(Keys.TAB);
		}

		public void enterPopupComments() {
			uIMapCivil.payment.uIPopupCommentsEdit.sendKeys(Randomized.randomString(150));
		}

		public void saveButton() {
			uIMapCivil.payment.uIPopupSaveButton.click();
			popUp.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapCivil.payment.uIPopupSaveButton.click();
		}

		public void selectPopupPaymentMethodAsCheck() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.payment.uIPopupPaymentMethodCombobox,
					"2 - Check");
			uIMapCivil.payment.uIPopupPaymentMethodCombobox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectPopupPaymentMethodAsCreditcard() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.payment.uIPopupPaymentMethodCombobox,
					"3 - Credit Card");
			uIMapCivil.payment.uIPopupPaymentMethodCombobox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyCheckNoDisplayed() {
			verify.ExpectedValueIsTrue(uIMapCivil.payment.uIPopupCheckNoEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapCivil.payment.uIPopupCheckNoTextView.isDisplayed());
		}

		public void verifyCreditcardNoDisplayed() {
			verify.ExpectedValueIsTrue(uIMapCivil.payment.uIPopupCreditCardNoEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapCivil.payment.uIPopupCreditCardNoTextView.isDisplayed());
		}

		public void verifyAtPopupCivilID() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilID"),
					uIMapCivil.payment.uIPopupCivilIDTextView.getText());
		}

		public void verifyPaymentExceedAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(11508) Payment amount cannot exceed the Balance amount");
		}

		public void verifyBalanceAs0InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("0", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.payment.uIPaymentGridTable, "Balance", rowIndex));
		}

		public void clickInvoiceNoInfoIcon() {
			uIMapCivil.payment.uIInvoiceNoIconButton.click();
		}

	}

	public class CivilStatement {
		public void verifyStatusAsCompleted() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilStatement.uIStatusTextView.getText().contains("Status : Completed"));
		}

		public void clickSearchButton() {
			uIMapCivil.civilStatement.uISearchButton.click();
		}

		public void clickRefreshButton() {
			uIMapCivil.civilStatement.uIRefreshButton.click();
		}

		public void clickCreateStatementButton() {
			uIMapCivil.civilStatement.uICreateStatementButton.click();
		}

		public void verifySelectAllCheckboxChecked() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapCivil.civilStatement.uISelectAllCheckbox.getAttribute("checked")));
		}

		public void verifyStatusAsNew() {
			verify.ExpectedValueIsTrue(uIMapCivil.civilStatement.uIStatusTextView.getText().contains("Status : New"));
		}

		public void verifyFlagIconInApproveColumn(int rowIndex) {
			String Flag = objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.civilStatement.uICivilStatementTableGrid, "Approve", rowIndex)
					.getAttribute("class");
			verify.ExpectedValueIsTrue(Flag.contains("Flag"));
		}

		public void clickFlagIconInGrid(int rowIndex) {
			WebElement FlagIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.civilStatement.uICivilStatementTableGrid, "Approve", rowIndex);
			FlagIcon.click();
		}

		public void verifyApprovedConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.confirm.yesWithExpectedMessage("(9510)     Do you want to approve this statement?");
			} else
				popUp.confirm.yesWithExpectedMessage("(9510) Do you want to approve this statement?");
		}

		public void verifyStatusAsApprovedInProcess() {
			verify.ExpectedValueIsTrue(
					uIMapCivil.civilStatement.uIStatusTextView.getText().contains("Status : Approved & In-Progess"));
		}

		public void verifySearchButtonDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapCivil.civilStatement.uISearchButton.getAttribute("disabled")));
		}
	}

	public class PaperType {
		public void selectJurisAsSO() {
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.paperType.uIJurisComboBox,
			// "SO - ProPhoenix Police Department");
			uIMapCivil.paperType.uIJurisComboBox.sendKeys("SO - ProPhoenix Police Department");
		}

		public void selectJurisAsPX() {
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.paperType.uIJurisComboBox,
			// "PX - ProPhoenix Police Department");
			uIMapCivil.paperType.uIJurisComboBox.sendKeys("PX - ProPhoenix Police Department");
		}

		public void selectJurisAsBE() {
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.paperType.uIJurisComboBox,
			// "BE - Prophoenix Police Department");
			uIMapCivil.paperType.uIJurisComboBox.sendKeys("BE - Prophoenix Police Department");
		}

		public void selectJurisAsBL() {
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.paperType.uIJurisComboBox,
			// "BL - Big lake Police Department");
			uIMapCivil.paperType.uIJurisComboBox.sendKeys("BL - Big lake Police Department");
		}

		public void selectPaperTypeInGrid() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapCivil.paperType.uIPaperTypeResultGrid);
		}

		public void clickSearch() {
			uIMapCivil.paperType.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterPaperCode() {
			uIMapCivil.paperType.uIPaperCodeEdit.sendKeys("25");
		}

		public void clickAddNew() {
			uIMapCivil.paperType.uIAddNewButton.click();
		}

		public void enterAtPaperCode() {
			uIMapCivil.paperType.uIPaperCodeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperCode"));
		}

		public void enterAtPaperType() {
			uIMapCivil.paperType.uIPaperTypeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperType"));
		}

		public void verifyAtPaperCode(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapCivil.paperType.uIPaperTypeResultGrid,
							"Paper Code", rowIndex));
		}

		public void verifyAtPaperType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperType"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapCivil.paperType.uIPaperTypeResultGrid,
							"Paper Type", rowIndex));
		}

		public void verifyAtPaperFee(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.paperType.uIPaperTypeResultGrid, "Paper Fee", rowIndex)
					.contains(PoliceData.getCivilModuleValue("PaperFee")));
		}

		public void verifyAtServiceFee(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCivil.paperType.uIPaperTypeResultGrid, "Service Fee", rowIndex)
					.contains(PoliceData.getCivilModuleValue("ServiceFee")));
		}

		public void verifyExecutionCheckBoxCheckedInGrid(int rowCount) {
			WebElement ExecutionCheck = objectIdentification.manualIdentify
					.getGridCell(uIMapCivil.paperType.uIPaperTypeResultGrid,
							PoliceData.getCivilModuleValue("PaperCode"), "Execution")
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(ExecutionCheck.getAttribute("alt").contains("Checked"));
		}

		public void clickAtPaperCodeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCivil.paperType.uIPaperTypeResultGrid,
					PoliceData.getCivilModuleValue("PaperCode"));
			Playback.controlReadyThreadWait();
		}

		public void verifyNoRecordAcknowledgeMessge() {
			if (Playback.browserType.contains("Chrome")) {
				popUp.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
			} else
				popUp.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void clickInactiveCheckbox() {
			uIMapCivil.paperType.uIIncludeInactiveCheckBox.click();
		}

		public void verifyInactiveRowColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapCivil.paperType.uIPaperTypeResultGrid, rowIndex).getAttribute("class")
					.contains("gridrowclr"));
		}

		
	}

	public class PaperTypesEntry {
		public void enterAtCode() {
			uIMapCivil.paperTypesEntry.uICodeEdit.sendKeys(PoliceData.getCivilModuleValue("Code"));
			uIMapCivil.paperTypesEntry.uICodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtDescription() {
			uIMapCivil.paperTypesEntry.uIDescriptionEdit.sendKeys(PoliceData.getCivilModuleValue("Description"));
		}

		public void enterDaysToServeAs10() {
			uIMapCivil.paperTypesEntry.uIDaysToServeEdit.sendKeys("10");
		}

		public void clickExecutionCheckBox() {
			uIMapCivil.paperTypesEntry.uIExectionCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void selectAtFeeType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.paperTypesEntry.uIFeeTypeComboBox,
					PoliceData.getCivilModuleValue("FeeType"));
			uIMapCivil.paperTypesEntry.uIFeeTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtFeeType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.paperTypesEntry.uIFeeTypeComboBox,
					PoliceData.getCivilModuleValue("FeeType1"));
			uIMapCivil.paperTypesEntry.uIFeeTypeComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtPaperFee() {
			uIMapCivil.paperTypesEntry.uIPaperFeeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperFee"));
			uIMapCivil.paperTypesEntry.uIPaperFeeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPaperFee1() {
			uIMapCivil.paperTypesEntry.uIPaperFeeEdit.sendKeys(PoliceData.getCivilModuleValue("PaperFee1"));
		}

		public void clickAddButton() {
			uIMapCivil.paperTypesEntry.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtFeeTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("FeeType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.paperTypesEntry.uIPaperTypesResultGrid, "Fee Type", rowIndex));
		}

		public void verifyAtFeeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Fee"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapCivil.paperTypesEntry.uIPaperTypesResultGrid, "Fee", rowIndex));
			/*
			 * WebElement element = Playback.driver.findElement(By.xpath(
			 * "//div[@id='grdPaperType']//table/tbody/tr[contains(@class,'Header')]//th[text()='Fee']"
			 * )); int indexFee = Integer.parseInt(element.getAttribute("idx"));
			 * List<WebElement> eleValue = Playback.driver.findElements(By.xpath(
			 * "//div[@id='grdPaperType']//table/tbody[contains(@class,'Item')]/tr/td"));
			 * String value = eleValue.get(indexFee).getText();
			 * verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Fee"),
			 * value);
			 */

		}

		public void clickSave() {
			uIMapCivil.paperTypesEntry.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapCivil.paperTypesEntry.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void verifyAtFeeType1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("FeeType1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.paperTypesEntry.uIPaperTypesResultGrid, "Fee Type", rowIndex));
		}

		public void verifyAtFee1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Fee1"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapCivil.paperTypesEntry.uIPaperTypesResultGrid, "Fee", rowIndex));
		}

		public void verifyFeeRequiredAcknowledgeMessage() {
			popUp.acknowledge.okWithExpectedMessage("(20035) Paper fee, Service Fee entries required");
		}

		public void closeScreen() {
			Playback.driver.close();
		}

		public void verifyPropertyCheckBoxDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapCivil.paperTypesEntry.uIPropertyCheckBox.getAttribute("disabled")));
		}

		public void verifyExecutionCheckboxDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapCivil.paperTypesEntry.uIExectionCheckBox.getAttribute("disabled")));
		}

		public void verifyTROCheckBoxDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapCivil.paperTypesEntry.uITROCheckBox.getAttribute("disabled")));
		}

		public void verifyOtherCheckBoxDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapCivil.paperTypesEntry.uIOtherCheckBox.getAttribute("disabled")));
		}

		public void verifySeziedPropertyCheckBoxEnabled() {
			verify.ExpectedValueIsTrue(uIMapCivil.paperTypesEntry.uISeizedPropertyCheckBox.isEnabled());
		}

		public void verifyTROCheckBoxEnabled() {
			verify.ExpectedValueIsTrue(uIMapCivil.paperTypesEntry.uITROCheckBox.isEnabled());
		}

		public void verifyOtherCheckBoxEnabled() {
			verify.ExpectedValueIsTrue(uIMapCivil.paperTypesEntry.uIOtherCheckBox.isEnabled());
		}

		public void clickTROCheckBox() {
			uIMapCivil.paperTypesEntry.uITROCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void clickOtherCheckBox() {
			uIMapCivil.paperTypesEntry.uIOtherCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void clickPaperInactiveCheckBox() {
			uIMapCivil.paperTypesEntry.uIPaperInactiveCheckBox.click();
		}

		public void verifyPaperTypeCodeExistsAcknowledgePopup() 
		{
			popUp.acknowledge.okWithExpectedMessage("(20038) Paper Type Code already exists");
			
		}

		public void enterAtCode1() {
			uIMapCivil.paperTypesEntry.uICodeEdit.sendKeys(PoliceData.getCivilModuleValue("Code1"));
			uIMapCivil.paperTypesEntry.uICodeEdit.sendKeys(Keys.TAB);
		}
		
		public void enterAtCode2() {
			uIMapCivil.paperTypesEntry.uICodeEdit.sendKeys(PoliceData.getCivilModuleValue("Code2"));
			uIMapCivil.paperTypesEntry.uICodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyFeeAmountIsMandatoryAcknowledgePopup()
		{
			popUp.acknowledge.okWithExpectedMessage("(20040) FeeAmount is Mandatory");
			
		}

		public void verifyPaperFeeIsRequiredAcknowledgePopup()
		{
			popUp.acknowledge.okWithExpectedMessage("(6040) Paper Fee is required");
			
		}

	}

	public class CivilContact {
		public void enterAtLastName() {
			uIMapCivil.civilContact.uILastNameEdit.sendKeys(PoliceData.getCivilModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapCivil.civilContact.uIFirstNameEdit.sendKeys(PoliceData.getCivilModuleValue("FirstName"));
			uIMapCivil.civilContact.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void clickNameQuickIcon() {
			uIMapCivil.civilContact.uINameQuickEntryIcon.click();
		}

		public void clickAddButton() {
			uIMapCivil.civilContact.uIAddButton.click();
		}

		public void clickSave() {
			uIMapCivil.civilContact.uISaveButton.click();
		}

		public void verifyAtAssociates(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Associates"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.civilContact.uICivilStatementTableGrid, "Associates", rowIndex));
		}

		public void close() {
			Playback.driver.close();
		}

		public void save() {
			uIMapCivil.civilContact.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void saveAndClose() {
			uIMapCivil.civilContact.uISaveAndCloseButton.click();
			popUp.confirm.yes();
		}

		public void enterAtNameID() 
		{
			uIMapCivil.civilContact.uINameTypeEdit.sendKeys(PoliceData.getCivilModuleValue("NameID").substring(0, 1));
			uIMapCivil.civilContact.uINameIDEdit.sendKeys(PoliceData.getCivilModuleValue("NameID").substring(2));
			uIMapCivil.civilContact.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void verifyAssociateIBubbleIsDisplayed() 
		{
			verify.ExpectedValueIsTrue(uIMapCivil.civilContact.uIAssociateIBubbleIcon.isDisplayed());
			
		}

		public void verifyAtPhoneInGrid() 
		{
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapCivil.civilContact.uICivilStatementTableGrid, PoliceData.getCivilModuleValue("Phone"));
			System.out.println(gridRowByCellInnerText);
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(PoliceData.getCivilModuleValue("Phone")));
		}

		public void selectAtPhoneInGrid() 
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCivil.civilContact.uICivilStatementTableGrid, PoliceData.getCivilModuleValue("Phone"));
			
		}
		
		public void enterAtNameType()
		{
			uIMapCivil.civilContact.uINameTypeEdit.sendKeys(PoliceData.getCivilModuleValue("NameID").substring(0, 1));
			uIMapCivil.civilContact.uINameTypeEdit.sendKeys(Keys.TAB);
		}
	}

	public class PropertyInventoryScreen {
		public void selectAtProperty() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCivil.propertyInventoryScreen.uIPropertyCombobox, PoliceData.getCivilModuleValue("Property"));
			uIMapCivil.propertyInventoryScreen.uIPropertyCombobox.sendKeys(Keys.TAB);
		}

		public void enterAtDescription() {
			uIMapCivil.propertyInventoryScreen.uIDescriptionEdit
					.sendKeys(PoliceData.getCivilModuleValue("Description"));
		}

		public void selectAtNames() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCivil.propertyInventoryScreen.uINamesCombobox,
					PoliceData.getCivilModuleValue("Names"));
			uIMapCivil.propertyInventoryScreen.uINamesCombobox.sendKeys(Keys.TAB);
		}

		public void clickAdd() {
			uIMapCivil.propertyInventoryScreen.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void saveScreen() {
			uIMapCivil.propertyInventoryScreen.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void closeScreen() {
			Playback.driver.close();
		}

		public void verifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Names"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.propertyInventoryScreen.uIPropertyInventoryGrid, "Defendant", rowIndex));
		}

		public void verifyAtDescriptionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapCivil.propertyInventoryScreen.uIPropertyInventoryGrid, "Description", rowIndex));
		}

		public void verifyTotalItemSeizedCountAs1() {
			verify.ExpectedPropertyValueIsEqual("1",
					uIMapCivil.propertyInventoryScreen.uITotalItemSeziedEdit.getAttribute("value"));
		}

		public void selectGunType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCivil.propertyInventoryScreen.uIGunTypeCombobox);
			uIMapCivil.propertyInventoryScreen.uIGunTypeCombobox.sendKeys(Keys.TAB);
		}
	}

	public class CivilProperty {
		public void enterAtPropertyLocation1() {
			uIMapCivil.civilProperty.uIPropertyLocationEdit
					.sendKeys(PoliceData.getCivilModuleValue("PropertyLocation1"));
			uIMapCivil.civilProperty.uIPropertyLocationEdit.sendKeys(Keys.TAB);
		}

		public void selectDistrict() {
			uIMapCivil.civilProperty.uIDistrictLookupButton.click();
			popUp.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterDateAndTimeOfSaleAsCurrentDate() {
			uIMapCivil.civilProperty.uIDateOfSaleEdit.click();
			uIMapCivil.civilProperty.uIDateOfSaleEdit.sendKeys(Randomized.getCurrentDate());
			uIMapCivil.civilProperty.uITimeOfSaleEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void enterAdjournedDateAndTimeAs5DaysFuture() {
			uIMapCivil.civilProperty.uIAdjournedDateEdit.click();
			uIMapCivil.civilProperty.uIAdjournedDateEdit.sendKeys(Randomized.getFutureDate(5));
			uIMapCivil.civilProperty.uIAdjournedTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void enterAtBuyerID() {
			uIMapCivil.civilProperty.uIBuyerNameTypeEdit
					.sendKeys(PoliceData.getCivilModuleValue("BuyerID").substring(0, 1));
			uIMapCivil.civilProperty.uIBuyerNameTypeIDEdit
					.sendKeys(PoliceData.getCivilModuleValue("BuyerID").substring(2));
			uIMapCivil.civilProperty.uIBuyerNameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void saveScreen() {
			uIMapCivil.civilProperty.uISaveButton.click();
			popUp.confirm.yes();
		}

		public void closeScreen() {
			Playback.driver.close();
		}

		public void enterAtDistrict() {
			uIMapCivil.civilProperty.uIDistrictCodeEdit.sendKeys(PoliceData.getCivilModuleValue("District"));
			uIMapCivil.civilProperty.uIDistrictCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtLocationInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Location"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapCivil.civilProperty.uILocationResultGrid, "Location", rowIndex));
		}
	}

	public class CivilDetails {
		public void verifyAtFullName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("FullName"),
					uIMapCivil.civilDetails.uIFullNameEdit.getAttribute("value"));
		}

		public void verifyAtLocation() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("Location"),
					uIMapCivil.civilDetails.uILocationEdit.getAttribute("value"));
		}

		public void verifyAtCivilCount() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("CivilCount"),
					uIMapCivil.civilDetails.uICivilCountEdit.getAttribute("value"));
		}

		public void verifyAtPaperTypeUsingCivilNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperType"),
					objectIdentification.manualIdentify.getGridCell(uIMapCivil.civilDetails.uICivilDetailsResultGrid,
							PoliceData.getCivilModuleValue("CivilNo"), "Paper Type").getText());
		}

		public void verifyAtNameTypeUsingCivilNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("NameType"),
					objectIdentification.manualIdentify.getGridCell(uIMapCivil.civilDetails.uICivilDetailsResultGrid,
							PoliceData.getCivilModuleValue("CivilNo"), "NameType").getText());
		}

		public void clickAtCivilNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCivil.civilDetails.uICivilDetailsResultGrid, PoliceData.getCivilModuleValue("CivilNo"));
			Playback.controlReadyThreadWait();
		}

		public void MouseHoverAtNameTypeAndVerify() // mousehover was not identified
		{

			objectIdentification.actionBuilder.MoveToElement(objectIdentification.manualIdentify.getGridCell(
					uIMapCivil.civilDetails.uICivilDetailsResultGrid, PoliceData.getCivilModuleValue("NameType")));
			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			// verify.ExpectedValueIsTrue(uIMapCivil.civilDetails.uIToolTipGrid.getText().contains(PoliceData.getCivilModuleValue("NameType")));

		}

		public void MouseHoverAtPaperTypeAndVerify() // mousehover was not identified
		{

			objectIdentification.actionBuilder.MoveToElement(objectIdentification.manualIdentify.getGridCell(
					uIMapCivil.civilDetails.uICivilDetailsResultGrid, PoliceData.getCivilModuleValue("PaperType")));
			Playback.controlReadyThreadWait();

			Playback.gridLoadThreadWait();
			// verify.ExpectedValueIsTrue(uIMapCivil.civilDetails.uIToolTipGrid.getText().contains(PoliceData.getCivilModuleValue("PaperType")));
			// verify.ExpectedPropertyValueIsEqual(PoliceData.getCivilModuleValue("PaperType"),
			// uIMapCivil.civilDetails.uIToolTipGrid.getText());
		}
	}

	public class Assignment {
		public void clickIncludeAssignedCheckbox() {
			uIMapCivil.assignment.uIIncludeAssignedCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtDistrict() {
			uIMapCivil.assignment.uIDistrictCodeEdit.sendKeys(PoliceData.getCivilModuleValue("District"));
			uIMapCivil.assignment.uIDistrictCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickSearch() {
			uIMapCivil.assignment.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtServiceAreaValues() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapCivil.assignment.uIAssignmentResultGrid, "Service Area");
			for (String strServiceArea : cellValues)
				Assert.assertEquals(strServiceArea, PoliceData.getCivilModuleValue("ServiceArea"));

		}
	}

	public class ServiceAction
	{

		public void clickAddNew()
		{
			uIMapCivil.serviceAction.uIAddNewButton.click();
			
		}
		
		
		
		
	}
	
	public class ServiceActionEntry
	{

		public void enterAtCode() 
		{
			uIMapCivil.serviceActionEntry.uICodeEdit.sendKeys(PoliceData.getCivilModuleValue("Code"));
			uIMapCivil.serviceActionEntry.uICodeEdit.sendKeys(Keys.TAB);
			
		}
		public void enterAtCode1() 
		{
			uIMapCivil.serviceActionEntry.uICodeEdit.sendKeys(PoliceData.getCivilModuleValue("Code1"));
			uIMapCivil.serviceActionEntry.uICodeEdit.sendKeys(Keys.TAB);
			
		}
		public void enterAtDescription()
		{
			uIMapCivil.serviceActionEntry.uIDescriptionEdit.sendKeys(PoliceData.getCivilModuleValue("Description"));
			uIMapCivil.serviceActionEntry.uIDescriptionEdit.sendKeys(Keys.TAB);
		}
		
		public void enterAtSortOrder()
		{
			uIMapCivil.serviceActionEntry.uISortOrderEdit.sendKeys(PoliceData.getCivilModuleValue("SortOrder"));
			uIMapCivil.serviceActionEntry.uISortOrderEdit.sendKeys(Keys.TAB);
		}
		public void verifyServiceActionCodeAlreadyExistsAcknowledgePopup() 
		{
			popUp.acknowledge.okWithExpectedMessage("(20037) Service Action Code already exists");
			
		}
		public void closeScreen() 
		{
			Playback.driver.close();
		}
		
	}
	

}
