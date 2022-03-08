package application;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dataAccess.BaseData;
import uIMaps.UIMapAccounting;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Accounting {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapAccounting uIMapAccounting = new UIMapAccounting();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public Names names = new Names();
	public static Accounting accounting = new Accounting();

	public InvoiceType invoiceType;
	public InvoiceTypeEntry invoiceTypeEntry;
	public ItemCode itemCode;
	public ItemCodeEntry itemCodeEntry;
	public InvoiceEntry invoiceEntry;
	public ReceivePayment receivePayment;
	public ReceivePaymentOption receivePaymentOption;
	public InvoiceSearch invoiceSearch;
	public TransactionAndAdjustment transactionAndAdjustment;
	public FeeSearch feeSearch;
	public PaymentSearch paymentSearch;
	public InvoiceSearchHelpWindow invoiceSearchHelpWindow;
	public SearchAccount searchAccount;

	public ExpenseSearch expenseSearch;

	public ExpenseEntry expenseEntry;

	public Accounting() {

		if (invoiceType == null)
			invoiceType = new InvoiceType();

		if (invoiceTypeEntry == null)
			invoiceTypeEntry = new InvoiceTypeEntry();

		if (itemCode == null)
			itemCode = new ItemCode();

		if (itemCodeEntry == null)
			itemCodeEntry = new ItemCodeEntry();

		if (invoiceEntry == null)
			invoiceEntry = new InvoiceEntry();

		if (receivePayment == null)
			receivePayment = new ReceivePayment();

		if (receivePaymentOption == null)
			receivePaymentOption = new ReceivePaymentOption();

		if (invoiceSearch == null)
			invoiceSearch = new InvoiceSearch();

		if (transactionAndAdjustment == null)
			transactionAndAdjustment = new TransactionAndAdjustment();

		if (feeSearch == null)
			feeSearch = new FeeSearch();

		if (paymentSearch == null)
			paymentSearch = new PaymentSearch();

		if (invoiceSearchHelpWindow == null)
			invoiceSearchHelpWindow = new InvoiceSearchHelpWindow();

		if (searchAccount == null)
			searchAccount = new SearchAccount();

		if (expenseSearch == null)
			expenseSearch = new ExpenseSearch();

		if (expenseEntry == null)
			expenseEntry = new ExpenseEntry();

	}

	public void SwitchToInvoiceTypeScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmInvoiceTypeInquiry.aspx");

	}

	public void SwitchToInvoiceSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Invoice Search");

	}

	public void SwitchToInvoiceEntry() {
		objectIdentification.windowHandle.switchToWindow("Invoice Entry");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToTransactionAndAdjustment() {
		objectIdentification.windowHandle.switchToWindow("Transaction & Adjustment");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToInvoiceTypeEntry() {
		objectIdentification.windowHandle.switchToWindow("Invoice Type Entry");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToItemCodeEntry() {
		objectIdentification.windowHandle.switchToWindow("Item Code Entry");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToItemCode() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Item Code");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToReceivePayment() {
		objectIdentification.windowHandle.switchToWindow("Receive Payment");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToReceivePaymentOption() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmReceiveOptions");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToReceivePaymentFindAccountScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmReceivePayment.aspx?NameID");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToFeeSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Fee Search");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToPaymentSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Billing/frmPaymentInquiry");
		Playback.controlReadyThreadWait();
	}

	public void SwitchToInvoiceSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Invoice Search");

	}

	public void switchToSearchAccount() {
		objectIdentification.windowHandle.switchToWindow("Billing/frmSearchAccount");

	}

	public class InvoiceType {

		public void ClickAddNew() {
			uIMapAccounting.invoiceType.uIAddNewButton.click();
		}

		public void VerifyExpandCollapseCheckboxChecked() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceType.uIExpandCheckbox.getAttribute("checked") == "true");
		}

		public void VerifyAtInvoiceType() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.invoiceType.uIInvoiceTypeTable,
							BaseData.getAccountingModuleValue("InvoiceType"), "Invoice Type").getText(),
					BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void VerifyCycleAsMonthlyByAtInvoiceType() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.invoiceType.uIInvoiceTypeTable,
							BaseData.getAccountingModuleValue("InvoiceType"), "Cycle").getText(),
					"Monthly");
		}

		public void VerifyCurrentMonthAppearInMonthColumn() {

			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.invoiceType.uIInvoiceTypeTable,
							BaseData.getAccountingModuleValue("InvoiceType"), "Month").getText(),
					Randomized.getCurrentMonthName());
		}

		public void SelectRowByAtInvoiceType() {
			WebElement row = objectIdentification.manualIdentify.getGridCell(
					uIMapAccounting.invoiceType.uIInvoiceTypeTable, BaseData.getAccountingModuleValue("InvoiceType"),
					"Invoice Type");
			row.click();
		}

		public void selectRowByAtInvoiceTypeInOpenRecordsRequest() {
			WebElement row = objectIdentification.manualIdentify.getGridCell(
					uIMapAccounting.invoiceType.uIInvoiceTypeOpenRecordsRequestGrid,
					BaseData.getAccountingModuleValue("InvoiceType"), "Invoice Type");
			row.click();
		}

		public void verifyAtInvoiceTypeShowsGrayColor() {
			List<WebElement> rows = objectIdentification.manualIdentify
					.getGridTableRowsCollection(uIMapAccounting.invoiceType.uIInvoiceTypeTable);
			verify.ExpectedValueIsTrue(rows.get(0).getAttribute("class").contains("gridrowclr"));
		}

		public void verifyAtInvoiceTypeShowsBlackColor() {
			List<WebElement> rows = objectIdentification.manualIdentify
					.getGridTableRowsCollection(uIMapAccounting.invoiceType.uIInvoiceTypeTable);
			verify.ExpectedValueIsTrue(rows.get(0).getAttribute("class").contains("gridrowblkclr"));
		}

		public void clickIncludeInactiveCheckbox() {
			uIMapAccounting.invoiceType.uIIncludeInactiveCheckbox.click();
		}

		public void clickSearchButton() {
			uIMapAccounting.invoiceType.uISearchButton.click();
		}
	}

	public class InvoiceTypeEntry {

		public void ClickSaveButton() {
			uIMapAccounting.invoiceTypeEntry.uISaveButton.click();
		}

		public void SelectAtInvoiceClass() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceTypeEntry.uIInvoiceClassComboBox,
					BaseData.getAccountingModuleValue("InvoiceClass"));
		}

		public void SelectDisbursementAccount() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapAccounting.invoiceTypeEntry.uIDisbursementAccountComboBox);
		}

		public void EnterAtInvoiceType() {
			uIMapAccounting.invoiceTypeEntry.uIInvoiceTypeEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void EnterDescription() {
			uIMapAccounting.invoiceTypeEntry.uIDescriptionEdit.sendKeys(Randomized.randomString(10));
		}

		public void EnterAtDescription() {
			uIMapAccounting.invoiceTypeEntry.uIDescriptionEdit
					.sendKeys(BaseData.getAccountingModuleValue("Description"));
		}

		public void EnterCycleAsMonthly() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAccounting.invoiceTypeEntry.uICycleComboBox,
					"Monthly");
		}

		public void SelectDefaultBaseMonthAsCurrentMonth() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceTypeEntry.uIDefaultBaseMonthComboBox, Randomized.getCurrentMonthName());
		}

		public void SelectAtInvoiceTemplate() {
			uIMapAccounting.invoiceTypeEntry.uIInvoiceTemplateComboBox
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceTemplate"));
		}

		public void EnterAtSendFirstNoticeIn() {
			uIMapAccounting.invoiceTypeEntry.uISendFirstNoticeInEdit
					.sendKeys(BaseData.getAccountingModuleValue("SendFirstNoticeIn"));
		}

		public void SelectTemplateAsInvoiceDue() {
			uIMapAccounting.invoiceTypeEntry.uIDaysFromInvoiceDateTemplateComboBox.sendKeys("Invoice Due");
		}

		public void EnterAtSendSubsequentNoticeInEvery() {
			uIMapAccounting.invoiceTypeEntry.uISendSubsequentFirstNoticeInEveryEdit
					.sendKeys(BaseData.getAccountingModuleValue("SendSubsequentNoticeInEvery"));
		}

		public void SelectTemplateAsInvoiceFinalNotice() {
			uIMapAccounting.invoiceTypeEntry.uIDaysFromLastNoticeDateTemplateComboBox.sendKeys("Invoice Final Notice");
		}

		public void Save() {
			uIMapAccounting.invoiceTypeEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickIsPenaltyRadioButton() {
			uIMapAccounting.invoiceTypeEntry.uIIsPenaltyRadioButton.click();
		}

		public void ClickIsPermitRadioButton() {
			uIMapAccounting.invoiceTypeEntry.uIIsPermitRadioButton.click();
		}

		public void ClickAttachReportTemplateButton() {
			uIMapAccounting.invoiceTypeEntry.uIAttachReportTemplateButton.click();
		}

		public void Verify8EnterMandatoryDataAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void ClickAddNewItemCodeButton() {
			uIMapAccounting.invoiceTypeEntry.uIAddNewItemCodeButton.click();
		}

		public void VerifyAtItemCodeInGrid() {

			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify
							.getGridCell(uIMapAccounting.invoiceTypeEntry.uIInvoiceTypeEntryTable,
									BaseData.getAccountingModuleValue("ItemCode"), "Item Code")
							.getText(),
					BaseData.getAccountingModuleValue("ItemCode"));
		}

		public void VerifyAtDescriptionInGrid() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify
							.getGridCell(uIMapAccounting.invoiceTypeEntry.uIInvoiceTypeEntryTable,
									BaseData.getAccountingModuleValue("ItemCode"), "Description")
							.getText(),
					BaseData.getAccountingModuleValue("Description"));
		}

		public void VerifyInvoiceClassDispalyedAsInspection() {
			verify.ExpectedValueIsTrue(
					uIMapAccounting.invoiceTypeEntry.uIInvoiceClassComboBox.getText().contains("Inspection"));
		}

		public void VerifyInvoiceClassDispalyedAsMiscellaneous() {
			verify.ExpectedValueIsTrue(
					uIMapAccounting.invoiceTypeEntry.uIInvoiceClassComboBox.getText().contains("Miscellaneous"));
		}

		public void VerifyInvoiceClassDispalyedAtDescription() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceTypeEntry.uIInvoiceClassComboBox.getText()
					.contains(BaseData.getAccountingModuleValue("Description")));
		}

		public void SelectAdd2990InInvoiceClassComboBox() {
			uIMapAccounting.invoiceTypeEntry.uIInvoiceClassComboBox.click();
			Select dropDown = new Select(Playback.driver.findElement(By.id("cddInvoiceClass_DropDown")));
			dropDown.selectByVisibleText("--Add 2990 --");
		}

		public void ClickDeleteIcon() {
			uIMapAccounting.invoiceTypeEntry.uIDeleteButton.click();
		}

		public void Verify4DoYouWantToDeleteConfirmMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage("(4)     Do you want to delete?");
			else
				popup.confirm.yesWithExpectedMessage("(4) Do you want to delete?");

		}

		public void close() {
			uIMapAccounting.invoiceTypeEntry.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void ClickInactiveCheckbox() {
			uIMapAccounting.invoiceTypeEntry.uIInactiveCheckbox.click();
		}

		public void SaveNClose() {
			uIMapAccounting.invoiceTypeEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}
	}

	public class ItemCodeEntry {

		public void Close() {
			uIMapAccounting.itemCodeEntry.driver.close();
		}

		public void VerifyAtInvoiceClass() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.itemCodeEntry.uIInvoiceClassComboBox),
					BaseData.getAccountingModuleValue("InvoiceClass"));
		}

		public void SelectAtInvoiceClass() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.itemCodeEntry.uIInvoiceClassComboBox,
					BaseData.getAccountingModuleValue("InvoiceClass"));
		}

		public void VerifyAtInvoiceType() {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.itemCodeEntry.uIInvoiceTypeComboBox),
					BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void SelectAtInvoiceType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.itemCodeEntry.uIInvoiceTypeComboBox,
					BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void EnterAtItemCode() {
			uIMapAccounting.itemCodeEntry.uIItemCodeEdit.sendKeys(BaseData.getAccountingModuleValue("ItemCode"));
		}

		public void ClickInactiveCheckbox() {
			uIMapAccounting.itemCodeEntry.uIInactiveCheckbox.click();
		}

		public void EnterAtDescription() {
			uIMapAccounting.itemCodeEntry.uIDescriptionEdit.sendKeys(BaseData.getAccountingModuleValue("Description"));
		}

		public void EnterAtConditionsNotes() {
			uIMapAccounting.itemCodeEntry.uIConditionsNotesEdit
					.sendKeys(BaseData.getAccountingModuleValue("Conditions"));
		}

		public void EnterAtAmount() {
			uIMapAccounting.itemCodeEntry.uIAmountEdit.sendKeys(BaseData.getAccountingModuleValue("Amount"));
			uIMapAccounting.itemCodeEntry.uIAmountEdit.sendKeys(Keys.TAB);
		}

		public void VerifyDollarSymbol() {
			verify.ExpectedValueIsTrue(uIMapAccounting.itemCodeEntry.uIAmountEdit.getAttribute("value").contains("$"));
		}

		public void SaveNClose() {
			uIMapAccounting.itemCodeEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveButton() {
			uIMapAccounting.itemCodeEntry.uISaveButton.click();
		}

		public void Verify21857DoYouWantRegFeeItemCodeAckMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage(
						"(21857)     Do you want to update the Registration Fee Item Code if the value is the same?");
			else
				popup.confirm.yesWithExpectedMessage(
						"(21857) Do you want to update the Registration Fee Item Code if the value is the same?");
		}

		public void enterConditionsNotes() {
			uIMapAccounting.itemCodeEntry.uIConditionsNotesEdit.sendKeys(Randomized.randomString(50));
		}

		public void clickPrintCheckbox() {
			uIMapAccounting.itemCodeEntry.uIPrintCheckbox.click();
		}

		public void clickDeleteButton() {
			uIMapAccounting.itemCodeEntry.uIDeleteButton.click();
		}

		public void verify4DoYouWantToDeleteConfirmMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.noWithExpectedMessage("(4)     Do you want to delete?");
			else
				popup.confirm.noWithExpectedMessage("(4) Do you want to delete?");
		}
	}

	public class ItemCode {

		public void VerifyExpandCollapseCheckboxChecked() {
			verify.ExpectedValueIsTrue(
					uIMapAccounting.itemCode.uIExpandCollapseCheckbox.getAttribute("checked") == "true");
		}

		public void ClickExpandCollapseCheckbox() {
			uIMapAccounting.itemCode.uIExpandCollapseCheckbox.click();
		}

		public void ClickAddNewButton() {
			uIMapAccounting.itemCode.uIAddNewButton.click();
		}

		public void ClickSearchButton() {
			uIMapAccounting.itemCode.uISearchButton.click();
		}

		public void ClickIncludeInactiveCheckbox() {
			uIMapAccounting.itemCode.uIIncludeInactiveCheckbox.click();
		}

		public void EnterAtItemCode() {
			uIMapAccounting.itemCode.uIItemCodeEdit.sendKeys(BaseData.getAccountingModuleValue("ItemCode"));
		}

		public void EnterAtItemCode1() {
			uIMapAccounting.itemCode.uIItemCodeEdit.sendKeys(BaseData.getAccountingModuleValue("ItemCode1"));
		}

		public void EnterAtDescription() {
			uIMapAccounting.itemCode.uIDescriptionEdit.sendKeys(BaseData.getAccountingModuleValue("Description"));
		}

		public void ClearItemCode() {
			uIMapAccounting.itemCode.uIItemCodeEdit.clear();
		}

		public void EnterItemCode() {
			uIMapAccounting.itemCode.uIItemCodeEdit.sendKeys(Randomized.randomString(6));
		}

		public void ClickShowPermitsOnlyCheckbox() {
			uIMapAccounting.itemCode.uIShowPermitsOnlyCheckbox.click();
		}

		public void VerifyAtItemCodeInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ItemCode"),
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.itemCode.uIItemCodeTable,
							BaseData.getAccountingModuleValue("ItemCode")).getText());
		}

		public void VerifyAtItemCodeAppearsGrayColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapAccounting.itemCode.uIItemCodeTable,
							BaseData.getAccountingModuleValue("ItemCode"))
					.getAttribute("class").contains("gridrowclrGray"));
		}

		public void VerifyAtDescriptionInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.itemCode.uIItemCodeTable,
							BaseData.getAccountingModuleValue("Description")).getText());
		}

		public void VerifyAtItemCode1InGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ItemCode1"),
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.itemCode.uIItemCodeTable,
							BaseData.getAccountingModuleValue("ItemCode1")).getText());
		}

		public void SelectRowByAtItemCode1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAccounting.itemCode.uIItemCodeTable,
					BaseData.getAccountingModuleValue("ItemCode1"));
		}

		public void SelectRowByAtItemCode() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapAccounting.itemCode.uIItemCodeTable,
					BaseData.getAccountingModuleValue("ItemCode"));
		}

		public void VerifyAtInvoiceClassInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceClass"),
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.itemCode.uIItemCodeTable,
							BaseData.getAccountingModuleValue("InvoiceClass")).getText());
		}

		public void VerifyAtInvoiceTypeInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceType"),
					objectIdentification.manualIdentify.getGridCell(uIMapAccounting.itemCode.uIItemCodeTable,
							BaseData.getAccountingModuleValue("InvoiceType")).getText());
		}

		public void SelectAtInvoiceClass() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAccounting.itemCode.uIInvoiceClassComboBox,
					BaseData.getAccountingModuleValue("InvoiceClass"));
		}

		public void SelectAtInvoiceType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAccounting.itemCode.uIInvoiceTypeComboBox,
					BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void ReloadScreen() {
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("Item Code", "Reload Tab");

		}

		public void Verify6040NoRecordFoundMessage() {
			popup.acknowledge.okWithExpectedMessage("(6040) No Record Found");
		}

	}

	public class InvoiceEntry {
		public InvoiceDetailsTab invoiceDetailsTab = null;
		public TransactionHistoryTab transactionHistoryTab = null;

		public InvoiceEntry() {
			if ((this.invoiceDetailsTab == null)) {
				this.invoiceDetailsTab = new InvoiceDetailsTab();
			}

			if ((this.transactionHistoryTab == null)) {
				this.transactionHistoryTab = new TransactionHistoryTab();
			}
		}

		public void VerifyInvoiceNo(String invoiceNo) {
			verify.ExpectedPropertyValueIsEqual(invoiceNo.substring(2, 4),
					uIMapAccounting.invoiceEntry.uIInvoiceNumberYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(invoiceNo.substring(5),
					uIMapAccounting.invoiceEntry.uIInvoiceNumberEdit.getAttribute("value"));
		}

		public void VerifyAtInvoiceNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo").substring(0, 2),
					uIMapAccounting.invoiceEntry.uIInvoiceNumberYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo").substring(3),
					uIMapAccounting.invoiceEntry.uIInvoiceNumberEdit.getAttribute("value"));
		}

		public void VerifyInvoiceTypeAsFalseAlarm() {
			verify.ExpectedPropertyValueIsEqual("False Alarm",
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.invoiceEntry.uIInvoiceTypeComboBox),
					"verify false alarm appread in invoice field");
		}

		public void close() {
			uIMapAccounting.invoiceEntry.driver.close();
		}

		public void EnterAtBillToAccountNameID() {
			uIMapAccounting.invoiceEntry.uIBillToAccountNameTypeEdit
					.sendKeys(BaseData.getAccountingModuleValue("BillToAccountNameID").substring(0, 1));
			uIMapAccounting.invoiceEntry.uIBillToAccountNameNumberEdit
					.sendKeys(BaseData.getAccountingModuleValue("BillToAccountNameID").substring(2));
			uIMapAccounting.invoiceEntry.uIBillToAccountNameNumberEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtBillToAccountLastName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("BillToAccountLastName"),
					uIMapAccounting.invoiceEntry.uIBillToAccountLastNameEdit.getAttribute("value"),
					"verify Bill To Account last name appeared");
		}

		public void EnterAtBillToAccountLastName() {
			uIMapAccounting.invoiceEntry.uIBillToAccountLastNameEdit
					.sendKeys(BaseData.getAccountingModuleValue("BillToAccountLastName"));
			uIMapAccounting.invoiceEntry.uIBillToAccountLastNameEdit.sendKeys(Keys.TAB);
			uIMapAccounting.invoiceEntry.uIBillToAccountFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void TabOutBillToAccountNameFields() {
			uIMapAccounting.invoiceEntry.uIBillToAccountLastNameEdit.click();
			uIMapAccounting.invoiceEntry.uIBillToAccountLastNameEdit.sendKeys(Keys.TAB);
			uIMapAccounting.invoiceEntry.uIBillToAccountFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void VerifyBillToAccountNameFieldIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIBillToAccountLastNameEdit.isEnabled());
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIBillToAccountFirstNameEdit.isEnabled());
		}

		public void VerifyAtBillToAccountFirstName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("BillToAccountFirstName"),
					uIMapAccounting.invoiceEntry.uIBillToAccountFirstNameEdit.getAttribute("value"),
					"verify Bill To Account first name appeared");
		}

		public void VerifyAtPhoneType() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("PhoneType"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.invoiceEntry.uIPhoneTypeComboBox));
		}

		public void VerifyAtPhoneNumber() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("PhoneNumber"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.invoiceEntry.uIPhoneTypeComboBox));
		}

		public void GetInvoiceNo(String invoiceNo) {
			String invoiceYear = uIMapAccounting.invoiceEntry.uIInvoiceNumberYearEdit.getAttribute("value");
			String invoiceNumber = uIMapAccounting.invoiceEntry.uIInvoiceNumberEdit.getAttribute("value");
			invoiceNo = invoiceYear + "-" + invoiceNumber;
			Playback.setTestContextAttribute("invoiceNo", invoiceNo);
		}

		public String readInvoiceNo() {
			String invoiceYear = uIMapAccounting.invoiceEntry.uIInvoiceNumberYearEdit.getAttribute("value");
			String invoiceNumber = uIMapAccounting.invoiceEntry.uIInvoiceNumberEdit.getAttribute("value");
			String invoiceNo = invoiceYear + "-" + invoiceNumber;
			return invoiceNo;
		}

		public void verifyAtInVoiceType() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceType"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.invoiceEntry.uIInvoiceTypeComboBox));
		}

		public void VerifyAtInvoiceClass() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceClass"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.invoiceEntry.uIInvoiceClassComboBox));
		}

		public void VerifyAtDetailNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("DetailNo").substring(0, 2),
					uIMapAccounting.invoiceEntry.uIDetailNumberYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("DetailNo").substring(3),
					uIMapAccounting.invoiceEntry.uIDetailNumberEdit.getAttribute("value"));
		}

		public void GetInvoiceNo(String invoiceYear, String invoiceNo) {
			invoiceYear = uIMapAccounting.invoiceEntry.uIInvoiceNumberYearEdit.getAttribute("value");
			Playback.setTestContextAttribute("invoiceYear", invoiceYear);
			invoiceNo = uIMapAccounting.invoiceEntry.uIInvoiceNumberEdit.getAttribute("value");
			Playback.setTestContextAttribute("invoiceNo", invoiceNo);
		}

		public void GetIDNo(String IDNo) {
			IDNo = uIMapAccounting.invoiceEntry.uIIDNoEdit.getAttribute("value");
			Playback.setTestContextAttribute("IDNo", IDNo);
		}

		public void SaveScreen() {
			uIMapAccounting.invoiceEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapAccounting.invoiceEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveButton() {
			uIMapAccounting.invoiceEntry.uISaveButton.click();
		}

		public void TabOutInvoiceDate() {
			uIMapAccounting.invoiceEntry.uIInvoiceDateEdit.sendKeys(Keys.TAB);
		}

		public void TabOutDueDate() {
			uIMapAccounting.invoiceEntry.uIDueDateEdit.sendKeys(Keys.TAB);
		}

		public void TabOutOriginalPaymentDueDate() {
			uIMapAccounting.invoiceEntry.uIOriginalPaymentDueDateEdit.sendKeys(Keys.TAB);
		}

		public void ClickIDInfoIcon() {
			uIMapAccounting.invoiceEntry.uIIDNoLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyIDNoAsAlarmNo(String alarmNo) {
			verify.ExpectedPropertyValueIsEqual(alarmNo, uIMapAccounting.invoiceEntry.uIIDNoEdit.getAttribute("value"));
		}

		public void VerifyAtIDNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("IDNo"),
					uIMapAccounting.invoiceEntry.uIIDNoEdit.getAttribute("value"));
		}

		public void SelectAtInvoiceClass() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceEntry.uIInvoiceClassComboBox,
					BaseData.getAccountingModuleValue("InvoiceClass"));
			Playback.controlReadyThreadWait();
			uIMapAccounting.invoiceEntry.uIInvoiceClassComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtInvoiceType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAccounting.invoiceEntry.uIInvoiceTypeComboBox,
					BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void SelectAtBillingContact() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceEntry.uIBillingContactComboBox,
					BaseData.getAccountingModuleValue("BillingContact"));
		}

		public void VerifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Address"),
					uIMapAccounting.invoiceEntry.uIAddressEdit.getAttribute("value"));
		}

		public void VerifyAtInvoiceBalance() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceBalance"),
					uIMapAccounting.invoiceEntry.uIInvoiceBalanceEdit.getAttribute("value"));
		}

		public void Verify21811EnterTheInvoiceDateAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(21811) Enter the Invoice Date");
		}

		public void VerifyInvoiceDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapAccounting.invoiceEntry.uIInvoiceDateEdit.getAttribute("value"));
		}

		public void VerifyDueDateAsNextMonthCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDateByMonth(1),
					uIMapAccounting.invoiceEntry.uIInvoiceDueDateEdit.getAttribute("value"));
		}

		public void VerifyOriginalpaymentDueDateAsNextMonthCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDateByMonth(1),
					uIMapAccounting.invoiceEntry.uIOriginalPaymentDueDateEdit.getAttribute("value"));
		}

		public void VerifyAdditionSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1002 - Addition Successful"));
		}

		public void VerifyUpdateSuccessfulStatusMessage() {

			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update successful"));
		}

		public void VerifyReceivePaymentIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIReceivePaymentIcon.isDisplayed());
		}

		public void ClickReceivePaymentIcon() {
			uIMapAccounting.invoiceEntry.uIReceivePaymentIcon.click();
		}

		public void VerifyDeleteIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIDeleteButton.isDisplayed());
		}

		public void ClickDeleteButton() {
			uIMapAccounting.invoiceEntry.uIDeleteButton.click();
		}

		public void VerifyEmailInvoiceButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIEmailInvoiceButton.isEnabled());
		}

		public void ClickEmailInvoiceButton() {
			uIMapAccounting.invoiceEntry.uIEmailInvoiceButton.click();
		}

		public void VerifyPrintInvoiceButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIPrintInvoiceButton.isEnabled());
		}

		public void VerifyVoidInvoiceButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIVoidInvoiceButton.isEnabled());
		}

		public void ClickVoidInvoiceButton() {
			uIMapAccounting.invoiceEntry.uIVoidInvoiceButton.click();
		}

		public void VerifyAtInvoiceTemplate() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceTemplate"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.invoiceEntry.uIInvoiceTemplateComboBox));
		}

		public void Verify21858DoYouWishToVoidInvoiceConfirmMSg() {
			popup.confirm.yesWithExpectedMessage("(21858)     Do you wish to void the Invoice?");
		}

		public void Verify21829ItemCodeDetailsMandatoryAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(21829) Item Code Details Mandatory");
		}

		public void Verify21827DoYouWantToDeleteInvoiceConfirmMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage("(21827)     Do you want to delete the Invoice?");
			else
				popup.confirm.yesWithExpectedMessage("(21827) Do you want to delete the Invoice?");
		}

		public void Verify1004DeletionSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1004 - Deletion Successful"));

		}

		public void VerifyAtTotalAmount() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("TotalAmount"),
					uIMapAccounting.invoiceEntry.uITotalAmountEdit.getAttribute("value"));

		}

		public void VerifyAtInvoiceAmount() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceAmount"),
					uIMapAccounting.invoiceEntry.uIInvoiceAmountEdit.getAttribute("value"));

		}

		public void VerifyVoidStatus() {
			verify.ExpectedValueIsTrue(
					uIMapAccounting.invoiceEntry.uIInvoiceStatusLabel.getAttribute("src").contains("VoidNew"));
		}

		public void VerifyPastDueStatus() {
			verify.ExpectedValueIsTrue(
					uIMapAccounting.invoiceEntry.uIInvoiceStatusLabel.getAttribute("src").contains("Pastdue"));
		}

		public void VerifyVoidInvoiceButtonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapAccounting.invoiceEntry.uIVoidInvoiceButton.getAttribute("disabled") == "true");
		}

		public void ClickTransactionsHistoryTab() {
			uIMapAccounting.invoiceEntry.uITransactionsHistoryTab.click();
		}

		public void VerifyOnlyInvoiceDetailsTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceEntry.uIInvoiceDetailsTab.isEnabled());
		}

		public void VerifyTransactionHistoryTabNotEnabled() {
			verify.ExpectedValueIsFalse(uIMapAccounting.invoiceEntry.uITransactionsHistoryTab.isEnabled());
		}

		public void clickInvoiceDetailsTab() {
			uIMapAccounting.invoiceEntry.uIInvoiceDetailsTab.click();
		}

	}

	public class InvoiceDetailsTab {

		public void SelectAtItemCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIItemCodeComboBox,
					BaseData.getAccountingModuleValue("ItemCode"));
		}

		public void ClearQuantity() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIQtyEdit.clear();
		}

		public void EnterAtQuantity() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIQtyEdit
					.sendKeys(BaseData.getAccountingModuleValue("Quantity"));
		}

		public void VerifyQualityAs1() {
			verify.ExpectedPropertyValueIsEqual("1",
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIQtyEdit.getAttribute("value"));
		}

		public void VerifyAtRate() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Rate"),
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIRateEdit.getAttribute("value"));
		}

		public void EnterAtRate() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIRateEdit
					.sendKeys(BaseData.getAccountingModuleValue("Rate"));
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIRateEdit.sendKeys(Keys.TAB);
		}

		public void ClearRate() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIRateEdit.clear();
		}

		public void TabOutRate() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIRateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtAmount() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIAmountEdit.sendKeys(Keys.TAB);
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Amount"),
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIAmountEdit.getAttribute("value"));
		}

		public void VerifyAtAmount1() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIAmountEdit.sendKeys(Keys.TAB);
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Amount1"),
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIAmountEdit.getAttribute("value"));
		}

		public void ClickAddButton() {
			uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIAddButton.click();
		}

		public void VerifyAtDescription(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable, "Description",
							rowIndex));
		}

		public void SelectRowByAtItemCode() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable,
					BaseData.getAccountingModuleValue("ItemCode"));
			Playback.controlReadyThreadWait();
		}

		public void DeleteAtItemCodeInGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable,
					BaseData.getAccountingModuleValue("ItemCode"));
		}

		public void DeleteAtItemCode1InGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable,
					BaseData.getAccountingModuleValue("ItemCode1"));
		}

		public void VerifyAtItemCodeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ItemCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable, "Item Code",
							rowIndex));
		}

		public void VerifyAtItemCode1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ItemCode1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable, "Item Code",
							rowIndex));
		}

		public void VerifyAtRateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Rate"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable, "Rate", rowIndex));
		}

		public void VerifyAtAmountInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Amount"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable, "Amount", rowIndex));
		}

		public void VerifyAtTotalAmount() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("TotalAmount"),
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uITotalAmountEdit.getAttribute("value"));
		}

		public void Verify4DoYouWantToDeleteConfirmMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage("(4)     Do you want to delete?");
			else
				popup.confirm.yesWithExpectedMessage("(4) Do you want to delete?");
		}

		public void VerifyAtItemCodeNotInGrid() {
			List<String> cells = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIInvoiceDetailsTable, "Item Code");
			verify.ExpectedValueIsFalse(cells.contains(BaseData.getAccountingModuleValue("ItemCode")));
		}

		public void SelectAtSubItemCode1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uISubItemCodeComboBox,
					BaseData.getAccountingModuleValue("SubItemCode1"));
		}

		public void SelectAtSubItemCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uISubItemCodeComboBox,
					BaseData.getAccountingModuleValue("SubItemCode"));
		}

		public void SelectAtItemCode1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceEntry.invoiceDetailsTab.uIItemCodeComboBox,
					BaseData.getAccountingModuleValue("ItemCode1"));
		}
	}

	public class TransactionHistoryTab {

		public void VerifyVoidRowInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Void(-)",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.transactionsHistoryTab.uITransactionsHistoryTable,
							"ActionType", rowIndex));
		}

		public void VerifyActionAsCorrection(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Correction(+ or -)",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.transactionsHistoryTab.uITransactionsHistoryTable,
							"ActionType", rowIndex));
		}

		public void VerifyAtActionTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ActionType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.transactionsHistoryTab.uITransactionsHistoryTable,
							"ActionType", rowIndex));
		}

		public void VerifyAtCreditAmountDecreasedInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("CreditAmountDecreased"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceEntry.transactionsHistoryTab.uITransactionsHistoryTable,
							"Credit Amount Decreased", rowIndex));
		}

		public void ClickAddTransactionHistoryButton() {
			uIMapAccounting.invoiceEntry.transactionsHistoryTab.uIAddTransactionHistoryButton.click();
		}

		public void VerifyAtAdjustment() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Adjustment"),
					uIMapAccounting.invoiceEntry.transactionsHistoryTab.uIAdjustmentEdit.getAttribute("value"));
		}

	}

	public class ReceivePayment {
		public WebDriver driver;
		public InvoicesTab invoicesTab = null;

		public ReceivePayment() {
			if ((this.invoicesTab == null)) {
				this.invoicesTab = new InvoicesTab();
			}

		}

		public void EnterAtAmount() {
			uIMapAccounting.receivePayment.uIAmountEdit.sendKeys(BaseData.getAccountingModuleValue("Amount"));
			uIMapAccounting.receivePayment.uIAmountEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtInvoiceNo() {
			uIMapAccounting.receivePayment.uIInvoiceNumberYearEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(0, 2));
			uIMapAccounting.receivePayment.uIInvoiceNumberEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(3));
			uIMapAccounting.receivePayment.uIInvoiceNumberEdit.sendKeys(Keys.TAB);
		}

		public void selectPaymentMethodAsCash() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapAccounting.receivePayment.uIPaymentMethodComboBox, "Cash");
			uIMapAccounting.receivePayment.uIPaymentMethodComboBox.sendKeys(Keys.TAB);
		}

		public void SelectPaymentMethodAsMO() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapAccounting.receivePayment.uIPaymentMethodComboBox, "MO");
			uIMapAccounting.receivePayment.uIPaymentMethodComboBox.sendKeys(Keys.TAB);
		}

		public void clickSave() {
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePayment.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapAccounting.receivePayment.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void getInvoiceNo(String invoiceYear, String invoiceNumber) {
			Playback.testContext.setAttribute("invoiceYear",
					uIMapAccounting.receivePayment.uIInvoiceNumberYearEdit.getAttribute("value"));
			Playback.testContext.setAttribute("invoiceNumber",
					uIMapAccounting.receivePayment.uIInvoiceNumberEdit.getAttribute("value"));
		}

		public void SaveNClose() {
			uIMapAccounting.receivePayment.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapAccounting.receivePayment.driver.close();
		}

		public void VerifyAtInvoiceClass() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceClass"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.receivePayment.uIInvoiceClassComboBox));
		}

		public void VerifyAtAccountBalance() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("AccountBalance"),
					uIMapAccounting.receivePayment.uIAccountBalanceEdit.getAttribute("value"));
		}

		public void VerifyAtBillToAccountNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("BillToAccountNo").substring(0, 1),
					uIMapAccounting.receivePayment.uIBillToAccountNameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("BillToAccountNo").substring(2),
					uIMapAccounting.receivePayment.uIBillToAccountNameIDEdit.getAttribute("value"));
		}

		public void VerifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("NameID").substring(0, 1),
					uIMapAccounting.receivePayment.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("NameID").substring(2),
					uIMapAccounting.receivePayment.uINameIDEdit.getAttribute("value"));
		}

		public void EnterAmount() {
			uIMapAccounting.receivePayment.uIAmountEdit.sendKeys(String.valueOf(Randomized.getRandomNumbers(3)));
		}

		public void EnterAmountAs0() {
			uIMapAccounting.receivePayment.uIAmountEdit.click();
			uIMapAccounting.receivePayment.uIAmountEdit.sendKeys("0");
		}

		public void enterAmount(String balanceAmount) {
			uIMapAccounting.receivePayment.uIAmountEdit.sendKeys(balanceAmount);
		}

		public void SelectAtPaymentMethod() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.receivePayment.uIPaymentMethodComboBox,
					BaseData.getAccountingModuleValue("PaymentMethod"));
			uIMapAccounting.receivePayment.uIPaymentMethodComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtTransactionReference() {
			uIMapAccounting.receivePayment.uITranscationReferenceEdit
					.sendKeys(BaseData.getAccountingModuleValue("TransactionReference"));
		}

		public void VerifyAtPaymentMethod() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("PaymentMethod"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapAccounting.receivePayment.uIPaymentMethodComboBox));

		}

		public void verifyAtPaymentMethodDropdownValue() {
			List<String> values = objectIdentification.manualIdentify
					.getDropDownValues(uIMapAccounting.receivePayment.uIPaymentMethodComboBox);
			verify.ExpectedValueIsTrue(values.contains(BaseData.getAccountingModuleValue("PaymentMethod")));
		}

		public void VerifyAtTransactionReference() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("TransactionReference"),
					uIMapAccounting.receivePayment.uITranscationReferenceEdit.getAttribute("value"));
		}

		public void EnterAtCheckNo() {
			uIMapAccounting.receivePayment.uIChequeNoEdit.sendKeys(BaseData.getAccountingModuleValue("CheckNo"));
		}

		public void EnterCheckNo() {
			uIMapAccounting.receivePayment.uIChequeNoEdit.sendKeys(Randomized.randomNumberString(5));
		}

		public void ClickVoidPaymentButton() {
			uIMapAccounting.receivePayment.uIVoidPaymentButton.click();
		}

		public void VerifyVoidPaymentConfMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage(
						"(21852)     Voiding a payment may affect Payment Ledger and reset the invoices as unpaid. Are you sure you want to continue?");
			else
				popup.confirm.yesWithExpectedMessage(
						"(21852) Voiding a payment may affect Payment Ledger and reset the invoices as unpaid. Are you sure you want to continue?");
		}

		public void Verify21815PleaseSelectPaymentMethodAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(21815) Please Select Payment Method");
		}

		public void Verify8EnterMandatoryDataAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void EnterVoidPaymentReason() {
			uIMapAccounting.receivePayment.uIVoidReasonEdit.sendKeys(Randomized.randomString(10));
		}

		public void EnterVoidPaymentAtReason() {
			uIMapAccounting.receivePayment.uIVoidReasonEdit.sendKeys(BaseData.getAccountingModuleValue("Reason"));
		}

		public void ClickVoidOKButton() {
			uIMapAccounting.receivePayment.uIVoidReasonOKButton.click();
		}

		public void VerifyVoidAtReason() {
			verify.ExpectedPropertyValueIsEqual("Void: " + BaseData.getAccountingModuleValue("Reason"),
					uIMapAccounting.receivePayment.uIVoidReasonLabel.getText());
		}

		public void VerifyVoidReasonAppearsRedColor() {
			verify.ExpectedValueIsTrue(
					uIMapAccounting.receivePayment.uIVoidReasonLabel.getAttribute("style").contains("red"));
		}

		public void SelectAtInvoiceClass() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapAccounting.receivePayment.uIInvoiceClassComboBox, "InvoiceClass");
		}

		public void SelectInvoiceClassAsInspection() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapAccounting.receivePayment.uIInvoiceClassComboBox, "Inspection");
		}

		public void enterAtAccountNameID() {

			uIMapAccounting.receivePayment.uINameTypeEdit
					.sendKeys(BaseData.getAccountingModuleValue("AccountNameID").substring(0, 1));
			uIMapAccounting.receivePayment.uINameIDEdit
					.sendKeys(BaseData.getAccountingModuleValue("AccountNameID").substring(2));
			uIMapAccounting.receivePayment.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void EnterAtAccountName() {
			uIMapAccounting.receivePayment.uINameIDEdit.sendKeys("B");
			uIMapAccounting.receivePayment.uILastNameEdit.sendKeys(BaseData.getAccountingModuleValue("LastName"));
			uIMapAccounting.receivePayment.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapAccounting.receivePayment.uIFirstNameEdit.sendKeys(Keys.TAB);
			names.nameSearchHelpWindow.SelectName();

		}

		public void ClickInvoiceNoLookup() {
			uIMapAccounting.receivePayment.uIInvoiceLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void TabDate() {
			uIMapAccounting.receivePayment.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterMemo() {
			uIMapAccounting.receivePayment.uIMemoEdit.sendKeys(Randomized.randomString(10));
		}

		public void ClickFindAnAccountOrInvoiceButton() {
			uIMapAccounting.receivePayment.uIFindAnAccountOrInvoiceButton.click();
		}

		public void EnterAtAmountDue() {
			uIMapAccounting.receivePayment.uIAmountDueEdit.sendKeys(BaseData.getAccountingModuleValue("AmountDue"));
		}

		public void clickPrintButton() {
			uIMapAccounting.receivePayment.uIPrintButton.click();
		}

		public void verify21844DoYouWantApplyCreditAckMessage() {
			popup.confirm.yesWithExpectedMessage("(21844) Do You Want to Apply Credit");
		}

		public void VerifyAtAvailableCredit() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("AvailableCredit"),
					uIMapAccounting.receivePayment.uIAvailableCreditEdit.getAttribute("value"));
		}

		public void enterAtLastName() {
			uIMapAccounting.receivePayment.uILastNameEdit.sendKeys(BaseData.getAccountingModuleValue("LastName"));
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePayment.uILastNameEdit.sendKeys(Keys.TAB);

		}

		public void enterAtFirstName() {
			uIMapAccounting.receivePayment.uIFirstNameEdit.sendKeys(BaseData.getAccountingModuleValue("FirstName"));
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePayment.uIFirstNameEdit.sendKeys(Keys.TAB);

		}

		public void selectRowCheckBoxByAtInvoiceNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapAccounting.receivePayment.uIReceivePaymentTable,
					BaseData.getAccountingModuleValue("InvoiceNo"));
		}

		public void enterAtPaymentEditInGrid() {
			Playback.pageLoadThreadWait();
			uIMapAccounting.receivePayment.uIPaymentEditInGrid.click();
			uIMapAccounting.receivePayment.uIPaymentEditInGrid.sendKeys(BaseData.getAccountingModuleValue("Payment"));
		}

		public void clickSaveNClose() {
			uIMapAccounting.receivePayment.uISaveAndCloseButton.click();
		}

		public String getWindowID() {
			String receivePaymentWindow1 = Playback.driver.getWindowHandle();
			return receivePaymentWindow1;
		}
	}

	public class InvoicesTab {
		public void ClickRowByInvoceNoCheckBox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable,
					BaseData.getAccountingModuleValue("InvoiceNo"));
		}

		public void ClickRowByInvoiceNoCheckBox() {
			objectIdentification.randomIdentify
					.selectRandomGridRowCheckbox(uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable);
		}

		public void ClickRowByInvoceNoCheckBox(String invoiceNo) {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable,
					invoiceNo.substring(2, 2) + "-" + invoiceNo.substring(5));

		}

		public void SelectAtInvoiceNoInGrid() {
			WebElement element = uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable.findElement(
					By.xpath(".//td/a[contains(text(), '" + BaseData.getAccountingModuleValue("InvoiceNo") + "')]"));
			element.click();
		}

		public void VeriyApplyCheckboxChecked(int rowIndex) {
			WebElement checkbox = uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable
					.findElement(By.xpath("//td//img[@title = 'Checked']"));
			verify.ExpectedValueIsTrue(checkbox.getAttribute("src").contains("checkbox_on"));
		}

		public void EnterAtPaymentAmountInGrid() {

			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.click();
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit
					.sendKeys(BaseData.getAccountingModuleValue("Amount"));
			uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.sendKeys(Keys.TAB);

		}

		public void VerifyAtPaymentInGrid() {
			Playback.controlReadyThreadWait();
			String payment = uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Payment"),
					uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.getAttribute("value"));
		}

		public void VerifyAtApplied() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Applied"),
					uIMapAccounting.receivePayment.invoicesTab.uIAppliedEdit.getText());
		}

		public void VerifyAtOverPayment() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("OverPayment"),
					uIMapAccounting.receivePayment.invoicesTab.uIOverPaymentEdit.getText());
		}

		public void clickLeaveCreditUsedLaterRadioButton() {
			uIMapAccounting.receivePayment.invoicesTab.uILeaveCreditUsedLaterRadioButton.click();
		}

		public void ClickSelectAllCheckbox() {
			uIMapAccounting.receivePayment.invoicesTab.uISelectAllCheckBox.click();
		}

		public void VerifyAtAccountBalanceAfterPayment() {

			String acc = uIMapAccounting.receivePayment.uIAccountBalanceEdit.getAttribute("value");

			String due = uIMapAccounting.receivePayment.invoicesTab.uIAmountDueEdit.getText();

			verify.ExpectedPropertyValueIsEqual(acc, due);
		}

		public void verifyAtInvoiceNoInGrid() {
			WebElement element = uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable.findElement(
					By.xpath(".//td/a[contains(text(), '" + BaseData.getAccountingModuleValue("InvoiceNo") + "')]"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo"), element.getText());
		}

		public void verifyAtInvoiceNo1InGrid() {
			WebElement element = uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable.findElement(
					By.xpath(".//td/a[contains(text(), '" + BaseData.getAccountingModuleValue("InvoiceNo1") + "')]"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo1"), element.getText());
		}

		public void verifyAtInvoiceNo2InGrid() {
			WebElement element = uIMapAccounting.receivePayment.invoicesTab.uIInvoicesTabTable.findElement(
					By.xpath(".//td/a[contains(text(), '" + BaseData.getAccountingModuleValue("InvoiceNo2") + "')]"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo2"), element.getText());
		}

		public void verifyAtApplyCreditInGrid() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ApplyCredit"),
					uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.getAttribute("value"));
		}

		public void verifyAtApplyCredit1InGrid() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ApplyCredit1"),
					uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid1Edit.getAttribute("value"));
		}

		public void verifyAtAmountDueInGrid() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("AmountDue"),
					uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.getAttribute("value"));
		}

		public void verifyAtAmountDue1InGrid() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("AmountDue1"),
					uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid1Edit.getAttribute("value"));
		}

		public void enterAtPaymentInGrid() {

			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.click();
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit
					.sendKeys(BaseData.getAccountingModuleValue("Payment"));
			uIMapAccounting.receivePayment.invoicesTab.uIPaymentGrid0Edit.sendKeys(Keys.TAB);

		}
	}

	public class ReceivePaymentOption {
		public void CloseScreen() {
			uIMapAccounting.receivePaymentOption.driver.close();
		}

		public void clickCloseButton() {
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePaymentOption.uICloseButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickPrintReceiptButton() {
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePaymentOption.uIPrintReceiptButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickEmailReceiptButton() {
			Playback.controlReadyThreadWait();
			uIMapAccounting.receivePaymentOption.uIEmailReceiptButton.click();
			Playback.controlReadyThreadWait();
		}

	}

	public class InvoiceSearch {

		public void ClickPrintButton() {
			uIMapAccounting.invoiceSearch.uIPrintIconButton.click();
		}

		public void SelectAtItemCode() {
			uIMapAccounting.invoiceSearch.uIItemCodeComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapAccounting.invoiceSearch.uIInvoiceTypeComboBox,
					BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void SelectAtInvoiceType() {
			uIMapAccounting.invoiceSearch.uIInvoiceTypeComboBox.click();
			uIMapAccounting.invoiceSearch.uIInvoiceTypeComboBox
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void SelectAtInvoiceClass() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.invoiceSearch.uIInvoiceClassComboBox,
					BaseData.getAccountingModuleValue("InvoiceClass"));
		}

		public void EnterAtAddress() {
			uIMapAccounting.invoiceSearch.uIAddressEdit.sendKeys(BaseData.getAccountingModuleValue("Address"));
			uIMapAccounting.invoiceSearch.uIAddressVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void EnterAtAccountName() {
			uIMapAccounting.invoiceSearch.uIAccountNameTypeEdit
					.sendKeys(BaseData.getAccountingModuleValue("AccountNameID").substring(0, 1));
			uIMapAccounting.invoiceSearch.uIAccountNameIDEdit
					.sendKeys(BaseData.getAccountingModuleValue("AccountNameID").substring(2));
			uIMapAccounting.invoiceSearch.uIAccountNameIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtAccountLastName() {
			uIMapAccounting.invoiceSearch.uIAccountLastNameEdit
					.sendKeys(BaseData.getAccountingModuleValue("AccountLastName"));
			uIMapAccounting.invoiceSearch.uIAccountLastNameEdit.sendKeys(Keys.TAB);
			uIMapAccounting.invoiceSearch.uIAccountFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void ClickSearch() {
			uIMapAccounting.invoiceSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickBackButton() {
			uIMapAccounting.invoiceSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickResetButton() {
			uIMapAccounting.invoiceSearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void Verify1011NoRecordFoundAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome"))
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void VerifyAtNameInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceSearch.uIInvoiceSearchResultTable, "Name", rowCount));
		}

		public void VerifyAtAccountInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("Account"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceSearch.uIInvoiceSearchResultTable, "Account", rowCount));
		}

		public void SelectAtInvoiceTypeinGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.invoiceSearch.uIInvoiceSearchResultTable,
					BaseData.getAccountingModuleValue("InvoiceType"));
			Playback.controlReadyThreadWait();
		}

		public void SelectRowByAtInvoiceNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.invoiceSearch.uIInvoiceSearchResultTable,
					BaseData.getAccountingModuleValue("InvoiceNo"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtInvoiceNoAppearsGrayColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapAccounting.invoiceSearch.uIInvoiceSearchResultTable,
							BaseData.getAccountingModuleValue("InvoiceNo"))
					.getAttribute("class").contains("gridGrayColor"));
		}

		public void SelectRowByAtAccount() {
			WebElement row = objectIdentification.manualIdentify.getGridCell(
					uIMapAccounting.invoiceSearch.uIInvoiceSearchResultTable,
					BaseData.getAccountingModuleValue("Account"));
			row.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtInvoiceNo() {
			uIMapAccounting.invoiceSearch.uIInvoiceYearFromEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(0, 2));
			uIMapAccounting.invoiceSearch.uIInvoiceNumberFromEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(3));
			uIMapAccounting.invoiceSearch.uIInvoiceNumberFromEdit.sendKeys(Keys.TAB);
		}

		public void ClickInvoiceInfoIcon() {
			uIMapAccounting.invoiceSearch.uIInvoiceInfoIcon.click();
		}

		public void EnterAtSystemIDFromAndToFields() {
			uIMapAccounting.invoiceSearch.uISystemIDNoFromEdit
					.sendKeys(BaseData.getAccountingModuleValue("SystemIDNo"));
			uIMapAccounting.invoiceSearch.uISystemIDNoToEdit.sendKeys(BaseData.getAccountingModuleValue("SystemIDNo"));
		}

		public void EnterAtInvoiceNoFromAndToFields() {
			uIMapAccounting.invoiceSearch.uIInvoiceYearFromEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(0, 2));
			uIMapAccounting.invoiceSearch.uIInvoiceNumberFromEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(3));
			uIMapAccounting.invoiceSearch.uIInvoiceYearToEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(0, 2));
			uIMapAccounting.invoiceSearch.uIInvoiceNumberToEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(3));
			uIMapAccounting.invoiceSearch.uIInvoiceNumberToEdit.sendKeys(Keys.TAB);
		}

		public void ClickOverDueCheckbox() {
			uIMapAccounting.invoiceSearch.uIOverdueOnlyCheckbox.click();
		}

		public void VerifyUnpaidRadioButtonAsSelected() {
			verify.ExpectedValueIsTrue(uIMapAccounting.invoiceSearch.uIUnpaidRadioButton.isSelected());
		}

		public void verifyAtInvoiceNoInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.invoiceSearch.uIInvoiceSearchResultTable, "Invoice#", rowCount));
		}

	}

	public class TransactionAndAdjustment {

		public void VerifyAtInvoiceNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo").substring(0, 2),
					uIMapAccounting.transactionAndAdjustment.uIInvoiceYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("InvoiceNo").substring(3),
					uIMapAccounting.transactionAndAdjustment.uIInvoiceNumberEdit.getAttribute("value"));
		}

		public void VerifyDateOfActionAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapAccounting.transactionAndAdjustment.uIDateOfActionEdit.getAttribute("value"));
		}

		public void TabOutDateofAction() {
			uIMapAccounting.transactionAndAdjustment.uIDateOfActionEdit.sendKeys(Keys.TAB);
		}

		public void TabOutPFCode() {
			uIMapAccounting.transactionAndAdjustment.uIPFCodeEdit.sendKeys(Keys.TAB);

		}

		public void VerifyAtPFCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("PFCode"),
					uIMapAccounting.transactionAndAdjustment.uIPFCodeEdit.getAttribute("value"));
		}

		public void SelectAtActionType() {
			uIMapAccounting.transactionAndAdjustment.uIActionTypeComboBox.click();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.transactionAndAdjustment.uIActionTypeComboBox,
					BaseData.getAccountingModuleValue("ActionType"));
		}

		public void EnterAtAmount() {
			uIMapAccounting.transactionAndAdjustment.uIAmountEdit.sendKeys(BaseData.getAccountingModuleValue("Amount"));
		}

		public void EnterTransactionNotes() {
			uIMapAccounting.transactionAndAdjustment.uITransactionNotesEdit.sendKeys(Randomized.randomString(15));
		}

		public void SaveNClose() {
			uIMapAccounting.transactionAndAdjustment.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveNClose() {
			uIMapAccounting.transactionAndAdjustment.uISaveNCloseButton.click();
		}

	}

	public class FeeSearch {

		public void VerifyAtForYear() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ForYear"),
					uIMapAccounting.feeSearch.uIForYearComboBox.getAttribute("value"));
		}

		public void SelectAtInvoiceType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAccounting.feeSearch.uIInvoiceTypeComboBox,
					BaseData.getAccountingModuleValue("InvoiceType"));
		}

		public void ClickIncludeBilledCheckbox() {
			uIMapAccounting.feeSearch.uIIncludeBilledCheckbox.click();
		}

		public void ClickSearchButton() {
			uIMapAccounting.feeSearch.uISearchButton.click();
		}

		public void ClickSelectAllCheckbox() {
			uIMapAccounting.feeSearch.uISelectAllCheckbox.click();
		}

		public void ClickCreateInvoiceButton() {
			uIMapAccounting.feeSearch.uICreateInvoiceButton.click();
		}

		public void Verify6040TotalInvoiceGeneratedAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(6040) Total Invoice Generated: 0");
		}

		public void VerifyAtSystemIDNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("SystemIDNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapAccounting.feeSearch.uIFeeSearchTable,
							"System ID#", rowIndex));
		}

		public void VerifyAtOccupancyNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("OccupancyName"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapAccounting.feeSearch.uIFeeSearchTable,
							"Occupancy Name", rowIndex));
		}

		public void GetFeeSearchGridRow(int row) {
			row = objectIdentification.manualIdentify.getGridTableRowsCount(uIMapAccounting.feeSearch.uIFeeSearchTable);
			Playback.setTestContextAttribute("row", String.valueOf(row));
		}

		public void VerifyTotalRecordsSelectedAs1(int row) {
			verify.ExpectedPropertyValueIsEqual("Total Records Selected :" + row,
					uIMapAccounting.feeSearch.uITotalRecordsSelectedLabel.getText());
		}

		public void VerifyRecordsSelectedTextInPopup(int row) {
			verify.ExpectedPropertyValueIsEqual(row + " Records Selected",
					uIMapAccounting.feeSearch.uIPopupRecordsSelectedLabel.getText());
		}

		public void TabOutInvoiceDate() {
			uIMapAccounting.feeSearch.uIPopupInvoiceDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyDueDateAsOneMonthFutureDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(30),
					uIMapAccounting.feeSearch.uIPopupDueDateEdit.getAttribute("value"));
		}

		public void ClickPopupCreateInvoiceButton() {
			uIMapAccounting.feeSearch.uIPopupCreateInvoiceButton.click();
		}

	}

	public class PaymentSearch {

		public void EnterAtInvoiceNo() {
			uIMapAccounting.paymentSearch.uIInvoiceYearEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(0, 2));
			uIMapAccounting.paymentSearch.uIInvoiceNumberEdit
					.sendKeys(BaseData.getAccountingModuleValue("InvoiceNo").substring(3));
			uIMapAccounting.paymentSearch.uIInvoiceNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterInvoiceNo(String invoiceYear, String invoiceNumber) {
			uIMapAccounting.paymentSearch.uIInvoiceYearEdit.sendKeys(invoiceYear);
			uIMapAccounting.paymentSearch.uIInvoiceNumberEdit.sendKeys(invoiceNumber);
			uIMapAccounting.paymentSearch.uIInvoiceNumberEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtInvoiceClass() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.paymentSearch.uIInvoiceClassComboBox,
					BaseData.getAccountingModuleValue("InvoiceClass"));
		}

		public void ClickSearchButton() {
			uIMapAccounting.paymentSearch.uISearchButton.click();
		}

		public void SelectRowByAtInvoiceNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.paymentSearch.uIPaymentSearchTable, BaseData.getAccountingModuleValue("InvoiceNo"));

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.paymentSearch.uIPaymentSearchTable, BaseData.getAccountingModuleValue("InvoiceNo"));
		}

		public void SelectRowByInvoiceNo(String invoiceYear, String invoiceNumber) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.paymentSearch.uIPaymentSearchTable, invoiceYear + "-" + invoiceNumber);

		}

		public void VerifyAtPaidByInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("PaidBy"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.paymentSearch.uIPaymentSearchTable, "Paid By", rowIndex));
		}

		public void VerifyAtReferenceNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("ReferenceNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.paymentSearch.uIPaymentSearchTable, "Reference#", rowIndex));
		}

		public void VerifyAtAccountNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getAccountingModuleValue("AccountName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapAccounting.paymentSearch.uIPaymentSearchTable, "Account Name", rowIndex));
		}

		public void selectPaymentDateAsToday() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapAccounting.paymentSearch.uIPaymentDateDropDown, "Today");
			uIMapAccounting.paymentSearch.uIPaymentDateDropDown.sendKeys(Keys.TAB);
		}

		public void verifyAtAccountNameInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapAccounting.paymentSearch.uIPaymentSearchTable,
					BaseData.getAccountingModuleValue("AccountName"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getAccountingModuleValue("AccountName")));
		}

		public void clickPrintIcon() {
			uIMapAccounting.paymentSearch.uIPrintICon.click();

		}

	}

	public class InvoiceSearchHelpWindow {
		public void SelectAtInvoiceNoInGrid() {
			accounting.SwitchToInvoiceSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapAccounting.invoiceSearchHelpWindow.uIInvoiceSearchHelpResultTable,
					BaseData.getAccountingModuleValue("InvoiceNo").toString());
			uIMapAccounting.invoiceSearchHelpWindow.uISelectInvoiceButton.click();
			Playback.threadWait();
			Playback.waitForPageLoad();
		}
	}

	public class SearchAccount {
		public void selectRowByAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.searchAccount.uISearchAccountTable, BaseData.getAccountingModuleValue("Name"));
		}

		public void selectRowByAtInvoiceNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapAccounting.searchAccount.uISearchAccountTable, BaseData.getAccountingModuleValue("InvoiceNo"));
		}
	}

	public class ExpenseSearch {

		public void clickSearchButton() {
			uIMapAccounting.expenseSearch.uISearchButton.click();
		}

		public void selectAtExpenseClass() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.expenseSearch.uIExpenseClassComboBox,
					BaseData.getAccountingModuleValue("ExpenseClass"));
		}

		public void selectAtCategoryComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapAccounting.expenseSearch.uICategoryComboBox,
					BaseData.getAccountingModuleValue("Category"));
		}

		public void enterAtExpenseFromDate() {
			uIMapAccounting.expenseSearch.uIExpenseFromDateEdit
					.sendKeys(BaseData.getAccountingModuleValue("ExpenseFromDate"));
			uIMapAccounting.expenseSearch.uIExpenseFromDateEdit.sendKeys(Keys.TAB);
		}

		public void enterAtExpenseToDate() {
			uIMapAccounting.expenseSearch.uIExpenseToDateEdit
					.sendKeys(BaseData.getAccountingModuleValue("ExpenseToDate"));
			uIMapAccounting.expenseSearch.uIExpenseToDateEdit.sendKeys(Keys.TAB);
		}

		public void selectAtApprovalStatusComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapAccounting.expenseSearch.uIApprovalStatusComboBox,
					BaseData.getAccountingModuleValue("ApprovalStatus"));
		}

		public void doubleClickRowByAtNameInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapAccounting.expenseSearch.uIExpenseTable, BaseData.getAccountingModuleValue("Name"));
			Actions ac = new Actions(Playback.driver);
			ac.doubleClick(gridCell).build().perform();
		}

		public void verifyExpenseEntryWindowOpened(Set<String> allwindowIDs) {
			boolean windowExist = objectIdentification.windowHandle.windowExist("Expense Entry");
			verify.ExpectedValueIsTrue(windowExist);

		}
	}

	public class ExpenseEntry {

		public void clickSaveNCloseButton() {
			uIMapAccounting.expenseEntry.uISaveNCloseButton.click();

		}

	}

	public Set<String> getAllWindowID() {
		Set<String> allHandles = Playback.driver.getWindowHandles();
		return allHandles;
	}

	public void switchToExpenseSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmExpenseSrch.aspx");
	}

	public void switchToExpenseEntry() {
		objectIdentification.windowHandle.switchToWindow("Expense Entry");
	}

}
