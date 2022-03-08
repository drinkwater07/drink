package scripts;

import java.util.Set;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Accounting;
import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Settings;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class AccountingScripts {

	public Accounting accounting;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Settings settings;
	public Names names;
	public Home home;
	public Geo geo;

	@BeforeSuite(groups = { "2020DefectTestCases", "2021DefectTestCases", "2021AccountingDefect" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "2020DefectTestCases", "2021DefectTestCases", "2021AccountingDefect" })
	public void beforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Accounting");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		accounting = new Accounting();
		settings = new Settings();
		names = new Names();
		home = new Home();
		geo = new Geo();
	}

	@Test
	public void InvoiceTypeEntry() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.ClickAddNew();

		// String invoiceName = TestContext.DataRow["Inoviceclass"].ToString();
	}

	@Test
	public void InvoiceTypeEntry_110299() {

		Browser.NavigateToLoginScreen();
		Browser.navigateToNewTabAndEnterUrl();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");

		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.ClickAddNew();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.ClickSaveButton();
		accounting.invoiceTypeEntry.Verify8EnterMandatoryDataAcknowledgeMessage();
		accounting.invoiceTypeEntry.SelectAtInvoiceClass();
		accounting.invoiceTypeEntry.SelectDisbursementAccount();
		accounting.invoiceTypeEntry.EnterAtInvoiceType();
		accounting.invoiceTypeEntry.EnterDescription();
		accounting.invoiceTypeEntry.EnterCycleAsMonthly();
		accounting.invoiceTypeEntry.SelectDefaultBaseMonthAsCurrentMonth();
		accounting.invoiceTypeEntry.SelectAtInvoiceTemplate();
		accounting.invoiceTypeEntry.EnterAtSendFirstNoticeIn();
		accounting.invoiceTypeEntry.SelectTemplateAsInvoiceDue();
		accounting.invoiceTypeEntry.EnterAtSendSubsequentNoticeInEvery();
		accounting.invoiceTypeEntry.SelectTemplateAsInvoiceFinalNotice();
		accounting.invoiceTypeEntry.Save();
		accounting.invoiceTypeEntry.ClickIsPenaltyRadioButton();
		accounting.invoiceTypeEntry.ClickAddNewItemCodeButton();
		accounting.SwitchToItemCodeEntry();
		accounting.itemCodeEntry.Close();
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.VerifyExpandCollapseCheckboxChecked();
		accounting.invoiceType.VerifyAtInvoiceType();
		accounting.invoiceType.VerifyCycleAsMonthlyByAtInvoiceType();
		accounting.invoiceType.VerifyCurrentMonthAppearInMonthColumn();

	}

	@Test
	public void InvoiceTypeEntry_110300() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");

		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.SelectRowByAtInvoiceType();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.ClickAddNewItemCodeButton();
		accounting.SwitchToItemCodeEntry();
		accounting.itemCodeEntry.VerifyAtInvoiceClass();
		accounting.itemCodeEntry.VerifyAtInvoiceType();
		accounting.itemCodeEntry.EnterAtItemCode();
		accounting.itemCodeEntry.EnterAtDescription();
		accounting.itemCodeEntry.SaveNClose();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.VerifyAtItemCodeInGrid();
		accounting.invoiceTypeEntry.VerifyAtDescriptionInGrid();

	}

	@Test
	public void InvoiceTypeEntry_110301() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.ClickAddNew();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.VerifyInvoiceClassDispalyedAsInspection();
		accounting.invoiceTypeEntry.VerifyInvoiceClassDispalyedAsMiscellaneous();
		accounting.invoiceTypeEntry.SelectAdd2990InInvoiceClassComboBox();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickAddNewButton();
		// SettingsScripts.SettingsTestContext = AccountingTestContext;
		settings.sharedCodes.EnterAtPopUpCodeValue();
		settings.sharedCodes.EnterAtPopUpDescription();
		settings.sharedCodes.clickAddButton();
		settings.sharedCodes.closeScreen();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.VerifyInvoiceClassDispalyedAtDescription();

	}

	@Test
	public void CreateInvoiceEntry_110275() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Entry");
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.SelectAtInvoiceClass();
		Playback.controlReadyThreadWait();
		accounting.invoiceEntry.SelectAtInvoiceType();
		accounting.invoiceEntry.EnterAtBillToAccountNameID();
		Playback.pageLoadThreadWait();
		accounting.invoiceEntry.VerifyAtAddress();
		accounting.invoiceEntry.SelectAtBillingContact();
		accounting.invoiceEntry.VerifyAtPhoneType();
		accounting.invoiceEntry.VerifyAtPhoneNumber();
		accounting.invoiceEntry.ClickSaveButton();
		accounting.invoiceEntry.Verify21811EnterTheInvoiceDateAckMsg();
		accounting.invoiceEntry.TabOutInvoiceDate();
		accounting.invoiceEntry.VerifyInvoiceDateAsCurrentDate();
		accounting.invoiceEntry.VerifyDueDateAsNextMonthCurrentDate();
		accounting.invoiceEntry.VerifyOriginalpaymentDueDateAsNextMonthCurrentDate();
		accounting.invoiceEntry.invoiceDetailsTab.SelectAtItemCode();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyQualityAs1();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtRate();
		accounting.invoiceEntry.invoiceDetailsTab.ClickAddButton();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtDescription(0);
		accounting.invoiceEntry.SaveScreen();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.VerifyAdditionSuccessfulStatusMessage();
		accounting.invoiceEntry.VerifyReceivePaymentIconDisplayed();
		accounting.invoiceEntry.VerifyDeleteIconDisplayed();
		accounting.invoiceEntry.VerifyEmailInvoiceButtonEnabled();
		accounting.invoiceEntry.VerifyPrintInvoiceButtonEnabled();
		accounting.invoiceEntry.VerifyAtInvoiceTemplate();
		accounting.invoiceEntry.VerifyVoidInvoiceButtonEnabled();

	}

	@Test
	public void VerifyVoidInvoiceFunctionality_110207() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtInvoiceNo();
		accounting.invoiceSearch.ClickInvoiceInfoIcon();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickVoidInvoiceButton();
		accounting.invoiceEntry.Verify21858DoYouWishToVoidInvoiceConfirmMSg();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.VerifyVoidStatus();
		accounting.invoiceEntry.VerifyVoidInvoiceButtonDisabled();
		accounting.invoiceEntry.SaveScreen();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickTransactionsHistoryTab();
		accounting.invoiceEntry.transactionHistoryTab.VerifyVoidRowInGrid(1);

	}

	@Test
	public void UpdateItemCode_136914() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtInvoiceNo();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.invoiceDetailsTab.SelectRowByAtItemCode();
		accounting.invoiceEntry.invoiceDetailsTab.ClearRate();
		accounting.invoiceEntry.invoiceDetailsTab.EnterAtRate();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtAmount();
		accounting.invoiceEntry.invoiceDetailsTab.ClickAddButton();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtRateInGrid(0);
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtAmountInGrid(0);
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtTotalAmount();
		accounting.invoiceEntry.SaveScreen();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.VerifyAtInvoiceBalance();
		Playback.pageLoadThreadWait();
		accounting.invoiceEntry.VerifyUpdateSuccessfulStatusMessage();
		accounting.invoiceEntry.ClickTransactionsHistoryTab();
		accounting.invoiceEntry.transactionHistoryTab.VerifyActionAsCorrection(1);

	}

	@Test
	public void AddTransactionsHistory_110282() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtInvoiceNo();
		accounting.invoiceSearch.SelectAtInvoiceClass();
		Playback.controlReadyThreadWait();
		accounting.invoiceSearch.SelectAtInvoiceType();
		accounting.invoiceSearch.EnterAtAddress();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickTransactionsHistoryTab();
		accounting.invoiceEntry.transactionHistoryTab.ClickAddTransactionHistoryButton();
		accounting.SwitchToTransactionAndAdjustment();
		accounting.transactionAndAdjustment.VerifyAtInvoiceNo();
		accounting.transactionAndAdjustment.VerifyDateOfActionAsCurrentDate();
		accounting.transactionAndAdjustment.TabOutPFCode();
		accounting.transactionAndAdjustment.VerifyAtPFCode();
		accounting.transactionAndAdjustment.SelectAtActionType();
		accounting.transactionAndAdjustment.EnterAtAmount();
		accounting.transactionAndAdjustment.EnterTransactionNotes();
		accounting.transactionAndAdjustment.ClickSaveNClose();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickTransactionsHistoryTab();
		accounting.invoiceEntry.transactionHistoryTab.VerifyAtActionTypeInGrid(0);
		accounting.invoiceEntry.transactionHistoryTab.VerifyAtAdjustment();

	}

	@Test
	public void DeleteItemCode_110217() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.SelectAtInvoiceType();
		accounting.invoiceSearch.SelectAtItemCode();
		accounting.invoiceSearch.EnterAtAddress();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.invoiceDetailsTab.DeleteAtItemCodeInGrid();
		accounting.invoiceEntry.invoiceDetailsTab.Verify4DoYouWantToDeleteConfirmMsg();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.SaveScreen();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtItemCodeNotInGrid();
		accounting.invoiceEntry.invoiceDetailsTab.DeleteAtItemCode1InGrid();
		accounting.invoiceEntry.invoiceDetailsTab.Verify4DoYouWantToDeleteConfirmMsg();
		accounting.invoiceEntry.VerifyAtTotalAmount();
		accounting.invoiceEntry.VerifyAtInvoiceAmount();
		accounting.invoiceEntry.ClickSaveButton();
		accounting.invoiceEntry.Verify21829ItemCodeDetailsMandatoryAckMsg();

	}

	@Test
	public void CreateMiscellaneousInvocieEntry_110169() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Entry");
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.SelectAtInvoiceClass();
		Playback.controlReadyThreadWait();
		accounting.invoiceEntry.SelectAtInvoiceType();
		accounting.invoiceEntry.EnterAtBillToAccountLastName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.SelectName();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.VerifyAtAddress();
		accounting.invoiceEntry.TabOutInvoiceDate();
		accounting.invoiceEntry.VerifyInvoiceDateAsCurrentDate();
		accounting.invoiceEntry.TabOutDueDate();
		accounting.invoiceEntry.TabOutOriginalPaymentDueDate();
		accounting.invoiceEntry.VerifyOriginalpaymentDueDateAsNextMonthCurrentDate();
		accounting.invoiceEntry.SaveScreen();
		accounting.invoiceEntry.ClickSaveButton();
		accounting.invoiceEntry.Verify21829ItemCodeDetailsMandatoryAckMsg();
		accounting.invoiceEntry.invoiceDetailsTab.SelectAtItemCode();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyQualityAs1();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtRate();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtAmount();
		accounting.invoiceEntry.invoiceDetailsTab.ClearQuantity();
		accounting.invoiceEntry.invoiceDetailsTab.EnterAtQuantity();
		accounting.invoiceEntry.invoiceDetailsTab.TabOutRate();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtRate();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtAmount1();
		accounting.invoiceEntry.invoiceDetailsTab.ClickAddButton();
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtItemCode1InGrid(0);
		accounting.invoiceEntry.invoiceDetailsTab.VerifyAtTotalAmount();
		accounting.invoiceEntry.VerifyAtInvoiceAmount();
		accounting.invoiceEntry.SaveScreen();

	}

	@Test
	public void VerifyNegativeBalanceInInvoice_110298() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtInvoiceNo();
		accounting.invoiceSearch.ClickInvoiceInfoIcon();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickTransactionsHistoryTab();
		accounting.invoiceEntry.transactionHistoryTab.ClickAddTransactionHistoryButton();
		accounting.SwitchToTransactionAndAdjustment();
		accounting.transactionAndAdjustment.TabOutDateofAction();
		accounting.transactionAndAdjustment.TabOutPFCode();
		accounting.transactionAndAdjustment.SelectAtActionType();
		accounting.transactionAndAdjustment.EnterAtAmount();
		accounting.transactionAndAdjustment.EnterTransactionNotes();
		accounting.transactionAndAdjustment.ClickSaveNClose();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.transactionHistoryTab.VerifyAtActionTypeInGrid(1);
		accounting.invoiceEntry.transactionHistoryTab.VerifyAtCreditAmountDecreasedInGrid(1);
		accounting.invoiceEntry.transactionHistoryTab.VerifyAtAdjustment();

	}

	@Test
	public void DeleteInvoiceEntry_110297() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtAccountLastName();
		names.nameSearchHelpWindow.SelectName();
		accounting.invoiceSearch.ClickSearch();
		Playback.pageLoadThreadWait();
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.SelectRowByAtAccount();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickDeleteButton();
		accounting.invoiceEntry.Verify21827DoYouWantToDeleteInvoiceConfirmMsg();
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.ClickBackButton();
		Playback.pageLoadThreadWait();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.Verify1011NoRecordFoundAcknowledgeMessage();

	}

	@Test
	public void CreateItemCode_110322() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Item Code");
		accounting.SwitchToItemCode();
		accounting.itemCode.VerifyExpandCollapseCheckboxChecked();
		accounting.itemCode.ClickAddNewButton();
		accounting.SwitchToItemCodeEntry();
		accounting.itemCodeEntry.SelectAtInvoiceClass();
		accounting.itemCodeEntry.SelectAtInvoiceType();
		accounting.itemCodeEntry.EnterAtItemCode();
		accounting.itemCodeEntry.EnterAtDescription();
		accounting.itemCodeEntry.EnterAtConditionsNotes();
		accounting.itemCodeEntry.EnterAtAmount();
		Playback.controlReadyThreadWait();
		accounting.itemCodeEntry.VerifyDollarSymbol();
		accounting.itemCodeEntry.SaveNClose();
		accounting.SwitchToItemCode();
		accounting.itemCode.EnterAtItemCode();
		accounting.itemCode.ClickSearchButton();
		accounting.itemCode.VerifyAtItemCodeInGrid();

	}

	@Test
	public void InactiveItemCode_159903() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Item Code");
		accounting.SwitchToItemCode();
		accounting.itemCode.EnterAtItemCode();
		accounting.itemCode.EnterAtDescription();
		accounting.itemCode.ClickSearchButton();
		accounting.itemCode.VerifyAtItemCodeInGrid();
		accounting.itemCode.VerifyAtDescriptionInGrid();
		accounting.itemCode.SelectRowByAtItemCode();
		accounting.SwitchToItemCodeEntry();
		accounting.itemCodeEntry.ClickInactiveCheckbox();
		accounting.itemCodeEntry.ClickSaveButton();
		accounting.itemCodeEntry.Verify21857DoYouWantRegFeeItemCodeAckMsg();
		Playback.controlReadyThreadWait();
		popup.confirm.yes();
		accounting.SwitchToItemCode();
		accounting.itemCode.Verify6040NoRecordFoundMessage();
		accounting.SwitchToItemCode();
		accounting.itemCode.ClickIncludeInactiveCheckbox();
		accounting.itemCode.ClickSearchButton();
		accounting.itemCode.VerifyAtItemCodeInGrid();
		accounting.itemCode.VerifyAtItemCodeAppearsGrayColor();

	}

	@Test
	public void CreateInvoieFromFeeSearchScreen_211802() {
		int row = 0;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Inspection");
		loader.navigateToScreen("Fee Search");
		accounting.SwitchToFeeSearch();
		accounting.feeSearch.SelectAtInvoiceType();
		accounting.feeSearch.ClickSearchButton();
		accounting.feeSearch.ClickSelectAllCheckbox();
		accounting.feeSearch.GetFeeSearchGridRow(row);
		accounting.feeSearch.VerifyTotalRecordsSelectedAs1(row);
		accounting.feeSearch.ClickCreateInvoiceButton();
		accounting.feeSearch.VerifyRecordsSelectedTextInPopup(row);
		accounting.feeSearch.TabOutInvoiceDate();
		accounting.feeSearch.VerifyDueDateAsOneMonthFutureDate();
		accounting.feeSearch.ClickPopupCreateInvoiceButton();
		accounting.feeSearch.Verify6040TotalInvoiceGeneratedAckMsg();

	}

	@Test
	public void VerifyCashPayment_210379() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtInvoiceNo();
		accounting.receivePayment.VerifyAtInvoiceClass();
		accounting.receivePayment.VerifyAtAccountBalance();
		accounting.receivePayment.VerifyAtNameID();
		accounting.receivePayment.invoicesTab.ClickRowByInvoceNoCheckBox();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.invoicesTab.EnterAtPaymentAmountInGrid();
		accounting.receivePayment.clickSave();
		accounting.receivePayment.Verify21815PleaseSelectPaymentMethodAckMsg();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.clickSave();

	}

	@Test
	public void VerifyCreditCardPayment_210380() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtInvoiceNo();
		accounting.receivePayment.invoicesTab.ClickRowByInvoceNoCheckBox();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.invoicesTab.EnterAtPaymentAmountInGrid();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.clickSave();
		accounting.receivePayment.Verify8EnterMandatoryDataAckMsg();
		accounting.receivePayment.EnterAtTransactionReference();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.ClickPrintReceiptButton();
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		home.switchToPnxReportSSRSPDFScreen();
		home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.CloseScreen();
	}

	@Test
	public void VerifyCheckPayment_210390() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtInvoiceNo();
		accounting.receivePayment.invoicesTab.ClickRowByInvoceNoCheckBox();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.invoicesTab.VerifyAtPaymentInGrid();
		accounting.receivePayment.invoicesTab.VerifyAtApplied();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.EnterAtCheckNo();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();
	}

	@Test
	public void OverPaymentDue_210392() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtInvoiceNo();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.invoicesTab.VeriyApplyCheckboxChecked(0);
		accounting.receivePayment.invoicesTab.VerifyAtOverPayment();
		accounting.receivePayment.invoicesTab.clickLeaveCreditUsedLaterRadioButton();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.ClickEmailReceiptButton();
		home.switchToPnxCustomReportPDFScreen();
		home.pnxCustomReportPDFScreen.CloseScreen();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();

	}

	@Test
	public void VoidPayment_210403() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.EnterAtInvoiceNo();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.ClickVoidPaymentButton();
		accounting.receivePayment.VerifyVoidPaymentConfMsg();
		accounting.receivePayment.EnterVoidPaymentAtReason();
		accounting.receivePayment.ClickVoidOKButton();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.VerifyVoidAtReason();
		accounting.receivePayment.VerifyVoidReasonAppearsRedColor();
	}

	@Test
	public void PastDueByCreditCard_210414() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.ClickOverDueCheckbox();
		accounting.invoiceSearch.VerifyUnpaidRadioButtonAsSelected();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.VerifyAtInvoiceNo();
		accounting.invoiceEntry.VerifyPastDueStatus();
		accounting.invoiceEntry.ClickReceivePaymentIcon();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.EnterAtTransactionReference();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.ClickBackButton();
		accounting.invoiceSearch.ClickResetButton();
		Playback.pageLoadThreadWait();
		accounting.invoiceSearch.EnterAtInvoiceNoFromAndToFields();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.VerifyAtInvoiceNoAppearsGrayColor();
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.EnterAtInvoiceNo();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.VerifyAtPaidByInGrid(0);
		accounting.paymentSearch.VerifyAtReferenceNoInGrid(0);
		accounting.paymentSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.VerifyAtPaymentMethod();
		accounting.receivePayment.VerifyAtTransactionReference();

	}

	@Test
	public void CRM81597Accounting_202598() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");

		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.SelectAtInvoiceClass();
		accounting.invoiceSearch.ClickPrintButton();
		home.switchToSelectReport();
		home.selectReport.ClickPrintBatchInQueueButton();
		home.switchToPrintBatchScreen();
		home.printBatchScreen.SelectTwoRowsInGrid();
		home.printBatchScreen.ClickPrintBatchButton();
		home.printBatchScreen.ClickIndividualReportButton();
	}

	@Test
	public void VerifyEmailTemplate_213733() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Email Template");
		settings.switchToEmailTemplate();
		settings.emailTemplate.ClickAddNewButton();
		settings.switchToEmailTemplateEntry();
		// SettingsScripts.SettingsTestContext = AccountingTestContext;
		settings.emailTemplateEntry.EnterAtTemplateName();
		settings.emailTemplateEntry.EnterSubject();
		settings.emailTemplateEntry.EnterContentInTextBox();
		settings.emailTemplateEntry.SaveNClose();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.SelectRowByAtInvoiceType();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.ClickAttachReportTemplateButton();
		settings.switchToFormRepositoryScreen();
		// settingsScripts.SettingsTestContext = AccountingTestContext;
		settings.formRepositoryScreen.SelectAtEmailTemplate();
		settings.formRepositoryScreen.SaveNClose();
		loader.navigateToScreen("Invoice Entry");
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.SelectAtInvoiceClass();
		Playback.controlReadyThreadWait();
		accounting.invoiceEntry.SelectAtInvoiceType();
		accounting.invoiceEntry.TabOutDueDate();
		accounting.invoiceEntry.EnterAtBillToAccountNameID();
		accounting.invoiceEntry.TabOutInvoiceDate();
		accounting.invoiceEntry.invoiceDetailsTab.SelectAtItemCode();
		accounting.invoiceEntry.invoiceDetailsTab.ClickAddButton();
		accounting.invoiceEntry.SaveScreen();
		accounting.invoiceEntry.ClickEmailInvoiceButton();
		home.switchToViewPrintHistoryScreen();
		// homeScripts.HomeTestContext = AccountingTestContext;
		home.viewPrintHistory.VerifyAtEmailTemplateText();
	}

	@Test
	public void VerifyNoRecordFoundMessageInInvoiceSearch_216461() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtAddress();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.Verify1011NoRecordFoundAcknowledgeMessage();
		accounting.invoiceSearch.ClickResetButton();
		accounting.invoiceSearch.SelectAtInvoiceClass();
		accounting.invoiceSearch.EnterAtAddress();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.Verify1011NoRecordFoundAcknowledgeMessage();
	}

	@Test
	public void AccountingDefect_226226() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.SelectAtInvoiceClass();
		accounting.receivePayment.EnterAtAccountName();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.SaveScreen();
	}

	@Test
	public void VerfiyDetailBillingInvoiceClass_216463() {
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.SelectAtInvoiceClass();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.VerifyAtInvoiceClass();
		accounting.invoiceEntry.VerifyAtDetailNo();
		accounting.invoiceEntry.close();
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.SelectAtInvoiceClass();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.VerifyAtInvoiceClass();
		accounting.receivePayment.invoicesTab.SelectAtInvoiceNoInGrid();
		accounting.invoiceEntry.VerifyAtInvoiceClass();
		accounting.invoiceEntry.VerifyAtDetailNo();
		accounting.receivePayment.CloseScreen();

	}

	@Test
	public void Fire2020AccountingModule_243490(ITestContext testContext) {
		testContext.setAttribute("testID", 243490);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.ClickInvoiceNoLookup();
		accounting.SwitchToInvoiceSearchHelpWindow();
		accounting.invoiceSearchHelpWindow.SelectAtInvoiceNoInGrid();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.TabDate();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.SaveScreen();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();
		accounting.SwitchToReceivePayment();
	}

	@Test
	public void Fire2020AccountingModule_243674(ITestContext testContext) {
		testContext.setAttribute("testID", 243674);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.ClickInvoiceNoLookup();
		accounting.SwitchToInvoiceSearchHelpWindow();
		accounting.invoiceSearchHelpWindow.SelectAtInvoiceNoInGrid();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.TabDate();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.SaveScreen();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();
		accounting.SwitchToReceivePayment();
	}

	@Test
	public void Fire2020AccountingModule_243678(ITestContext testContext) {
		testContext.setAttribute("testID", 243678);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.SelectAtInvoiceType();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickReceivePaymentIcon();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.TabDate();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.EnterMemo();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.SaveScreen();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();
		accounting.SwitchToReceivePayment();
	}

	@Test
	public void VerifyPartialPaymentFromReceivePaymentscreen_243489(ITestContext testContext) {

		testContext.setAttribute("testID", "243489");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.SelectAtInvoiceType();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickReceivePaymentIcon();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.TabDate();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.clickSave();
		accounting.receivePayment.invoicesTab.VerifyAtAccountBalanceAfterPayment();

	}

	@Test // Raga Ranjani
	public void Fire2020AccountingModule_251401(ITestContext testContext) {
		testContext.setAttribute("testID", "251401");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.SelectRowByAtInvoiceType();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.ClickDeleteIcon();
		accounting.invoiceTypeEntry.Verify4DoYouWantToDeleteConfirmMsg();
	}

	@Test // Raga Ranjani
	public void FireDefect2020AccountingModule_251402(ITestContext testContext) {
		testContext.setAttribute("testID", "251402");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.SelectAtInvoiceType();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickReceivePaymentIcon();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.selectPaymentMethodAsCash();
		accounting.receivePayment.TabDate();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmountDue(); // wrong step
	}

	@Test // Raga Ranjani
	public void FireDefect2020AccountingModule_251416(ITestContext testContext) {

		testContext.setAttribute("testID", "251416");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtInvoiceNoFromAndToFields();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickReceivePaymentIcon();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.ClickFindAnAccountOrInvoiceButton();
		accounting.receivePayment.invoicesTab.SelectAtInvoiceNoInGrid();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.selectPaymentMethodAsCash();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.clickSave();
	}

	@Test // Raga Ranjani
	public void Fire2020DefectAccountingModule_252264(ITestContext testContext) {
		testContext.setAttribute("testID", "252264");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Item Code");
		accounting.SwitchToItemCode();
		accounting.itemCode.EnterAtItemCode();
		accounting.itemCode.ClickSearchButton();
		accounting.itemCode.SelectRowByAtItemCode();
		accounting.SwitchToItemCodeEntry();
		accounting.itemCodeEntry.clickDeleteButton();
		accounting.itemCodeEntry.verify4DoYouWantToDeleteConfirmMsg();
		// verify records not delete like VerifyAtItemcode.
		accounting.itemCodeEntry.ClickSaveButton();

	}

	@Test // Raga Ranjani

	public void Fire2020DefectAccountingModule_257076(ITestContext testContext) {
		testContext.setAttribute("testID", "257076");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.ClickFindAnAccountOrInvoiceButton();
		accounting.switchToSearchAccount();
		accounting.searchAccount.selectRowByAtName();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.invoicesTab.verifyAtInvoiceNoInGrid();
		accounting.receivePayment.invoicesTab.verifyAtInvoiceNo1InGrid();
		accounting.receivePayment.invoicesTab.verifyAtInvoiceNo2InGrid();

	}

	@Test // Vijay
	public void verifyTheParameterInPaymentReceiptReportAllowsToChangeToOccupancyName_255731(ITestContext testcontext) {
		testcontext.setAttribute("testID", "255731");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.clickPrintButton();
		home.switchToSelectReport();
		home.selectReport.selectReportInCategoryTable();
		home.switchToPnxReportCrystalPDFScreen();
		home.pnxReportCrystalPDFScreen.selectAtAccountNameOrOccupancyNameOptionInDropdown();
		home.pnxReportCrystalPDFScreen.clickViewReportButton();
	}

	public void Fire2020DefectAccountingModule_255848(ITestContext testContext) {
		testContext.setAttribute("testID", "255848");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.SelectInvoiceClassAsInspection();
		accounting.receivePayment.enterAtAccountNameID();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.invoicesTab.ClickRowByInvoceNoCheckBox();
		accounting.receivePayment.selectPaymentMethodAsCash();
		Playback.pageLoadThreadWait();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.clickSave();
		objectIdentification.windowHandle.phoenixMainWindow();
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.EnterAtInvoiceNo();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAmountAs0();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.invoicesTab.VerifyAtPaymentInGrid();

	}

	@Test // Raga Ranjani

	public void Fire2020DefectAccountingModule_255866(ITestContext testContext) {

		testContext.setAttribute("testID", "255866");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.SelectInvoiceClassAsInspection();
		accounting.receivePayment.enterAtAccountNameID();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.invoicesTab.ClickRowByInvoceNoCheckBox();
		accounting.receivePayment.SelectPaymentMethodAsMO();
		accounting.receivePayment.EnterCheckNo();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.clickSave();
		objectIdentification.windowHandle.phoenixMainWindow();
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.EnterAtInvoiceNo();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.VerifyAtAccountNameInGrid(0);
	}

	@Test // Raga Ranjani

	public void Fire2020DefectAccountingModule_259532(ITestContext testContext) {
		testContext.setAttribute("testID", "259532");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.SelectRowByAtInvoiceType();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.ClickInactiveCheckbox();
		accounting.invoiceTypeEntry.SaveNClose();
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.clickIncludeInactiveCheckbox();
		accounting.invoiceType.clickSearchButton();
		accounting.invoiceType.verifyAtInvoiceTypeShowsGrayColor();
		accounting.invoiceType.SelectRowByAtInvoiceType();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.ClickInactiveCheckbox();
		accounting.invoiceTypeEntry.SaveNClose();
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.clickSearchButton();
		accounting.invoiceType.verifyAtInvoiceTypeShowsBlackColor();

	}

	@Test // Raga Ranjani

	public void Fire2020DefectAccountingModule_260319(ITestContext testContext) {
		testContext.setAttribute("testID", "260319");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Entry");
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.SelectAtInvoiceClass();
		accounting.invoiceEntry.SelectAtInvoiceType();
		accounting.invoiceEntry.TabOutDueDate();
		accounting.invoiceEntry.EnterAtBillToAccountNameID();
		accounting.invoiceEntry.TabOutInvoiceDate();
		accounting.invoiceEntry.invoiceDetailsTab.SelectAtItemCode();
		accounting.invoiceEntry.invoiceDetailsTab.SelectAtSubItemCode();
		accounting.invoiceEntry.invoiceDetailsTab.ClickAddButton();
		accounting.invoiceEntry.SaveScreen();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickReceivePaymentIcon();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.selectPaymentMethodAsCash();
		accounting.receivePayment.invoicesTab.clickLeaveCreditUsedLaterRadioButton();
		accounting.receivePayment.invoicesTab.enterAtPaymentInGrid();
		accounting.receivePayment.SaveScreen();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.VerifyAtAvailableCredit();
		objectIdentification.windowHandle.phoenixMainWindow();
		loader.navigateToScreen("Invoice Entry");
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.SelectAtInvoiceClass();
		accounting.invoiceEntry.SelectAtInvoiceType();
		accounting.invoiceEntry.TabOutDueDate();
		accounting.invoiceEntry.EnterAtBillToAccountNameID();
		accounting.invoiceEntry.TabOutInvoiceDate();
		accounting.invoiceEntry.invoiceDetailsTab.SelectAtItemCode1();
		accounting.invoiceEntry.invoiceDetailsTab.SelectAtSubItemCode1();
		accounting.invoiceEntry.invoiceDetailsTab.ClickAddButton();
		accounting.invoiceEntry.SaveScreen();
		accounting.SwitchToInvoiceEntry();
		accounting.invoiceEntry.ClickReceivePaymentIcon();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.verify21844DoYouWantApplyCreditAckMessage();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.invoicesTab.verifyAtApplyCreditInGrid();
		accounting.receivePayment.invoicesTab.verifyAtAmountDueInGrid();
		accounting.receivePayment.invoicesTab.verifyAtApplyCredit1InGrid();
		accounting.receivePayment.invoicesTab.verifyAtAmountDue1InGrid();

	}

	@Test(groups = { "2020DefectTestCases" }) // Vijay
	public void verifyAccountNameShowingInPaymentSearchScreen_259715(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "259715");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.SelectAtInvoiceClass();
		accounting.receivePayment.enterAtLastName();
		accounting.receivePayment.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.EnterAtCheckNo();
		accounting.receivePayment.selectRowCheckBoxByAtInvoiceNoInGrid();
		accounting.receivePayment.enterAtPaymentEditInGrid();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.SaveNClose();
		loader.navigateToScreen("Invoice Search");
		accounting.SwitchToInvoiceSearch();
		accounting.invoiceSearch.EnterAtInvoiceNoFromAndToFields();
		accounting.invoiceSearch.ClickSearch();
		accounting.invoiceSearch.verifyAtInvoiceNoInGrid(0);

	}

//Automated by Vijay // Date :09/09/2021 // Sprint: Q3 Sprint 5
	@Test
	public void verifyFromAccountingModuleUnderReceivePaymentScreenInPaymentMethodFieldEnhancedDebitCard_282103(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "282103");
		Browser.NavigateToLoginScreenForFire();
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.EnterAtInvoiceNo();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.SelectRowByAtInvoiceNo();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.verifyAtPaymentMethodDropdownValue();
		accounting.receivePayment.SelectAtPaymentMethod();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePayment();

	}

	@Test // Mithun
	public void InvoiceTypeEntry_276779(ITestContext testContext) {
		testContext.setAttribute("testID", "276779");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Invoice Type");
		accounting.SwitchToInvoiceTypeScreen();
		accounting.invoiceType.ClickAddNew();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.SelectAtInvoiceClass();
		accounting.invoiceTypeEntry.SelectDisbursementAccount();
		accounting.invoiceTypeEntry.EnterAtInvoiceType();
		accounting.invoiceTypeEntry.EnterAtDescription();
		accounting.invoiceTypeEntry.ClickIsPermitRadioButton();
		accounting.invoiceTypeEntry.SelectAtInvoiceTemplate();
		accounting.invoiceTypeEntry.Save();
		accounting.invoiceTypeEntry.ClickAddNewItemCodeButton();
		accounting.SwitchToInvoiceTypeEntry();
		accounting.invoiceTypeEntry.Save();
		Playback.pageLoadThreadWait();
		accounting.invoiceTypeEntry.VerifyAtItemCodeInGrid();
	}

//Automated by Stalin // Date :10/06/2021 //Quarter:2 // Sprint: 06 //Module:Accounting
	@Test
	public void VerifythePaymentLedgershowstheNetReceivedCorrectly_275934(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275934");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Receive Payment");
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.ClickFindAnAccountOrInvoiceButton();
		accounting.switchToSearchAccount();
		accounting.searchAccount.selectRowByAtName();
		accounting.SwitchToReceivePaymentFindAccountScreen();
		accounting.receivePayment.EnterAtAmount();
		accounting.receivePayment.selectPaymentMethodAsCash();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.invoicesTab.clickLeaveCreditUsedLaterRadioButton();
		accounting.SwitchToReceivePaymentFindAccountScreen();
		accounting.receivePayment.clickSaveNClose();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.CloseScreen();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.CloseScreen();
		loader.navigateToScreen("Payment Search");
		accounting.SwitchToPaymentSearch();
		accounting.paymentSearch.selectPaymentDateAsToday();
		accounting.paymentSearch.ClickSearchButton();
		accounting.paymentSearch.verifyAtAccountNameInGrid();
		accounting.paymentSearch.clickPrintIcon();
		home.switchToSelectReport();
		home.selectReport.clickPaymentsLedgerReportInGrid();
		home.switchToPnxCustomReportPDFScreen();
		home.pnxCustomReportPDFScreen.verifyReportIsOpened();
		home.switchToPnxCustomReportPDFScreen();

	}


	// Automated by TesterName :- Vijay Date :- 01/03/2022 Sprint:-Sprint 1
	// Quarter:- Q1 Module:- Accounting
	@Test(groups = { "2021AccountingDefect" })
	public void verifyTheExpenseSearchGridValuesNotAllowsToEdit_288316(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "288316");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Accounting");
		loader.navigateToScreen("Expense Search");
		accounting.switchToExpenseSearch();
		accounting.expenseSearch.clickSearchButton();
		accounting.expenseSearch.doubleClickRowByAtNameInGrid();
		Set<String> allWindowID = accounting.getAllWindowID();
		accounting.expenseSearch.verifyExpenseEntryWindowOpened(allWindowID);
		accounting.switchToExpenseEntry();
		accounting.expenseEntry.clickSaveNCloseButton();
		accounting.switchToExpenseEntry();
		accounting.expenseEntry.clickSaveNCloseButton();
		accounting.switchToExpenseSearch();

	}

	@AfterMethod(groups = { "2020DefectTestCases", "2021DefectTestCases", "2021AccountingDefect" })
	public void afterMethodRecords(ITestResult testResult) {
		/*
		 * try Playback.takeScreenShotOnFailure(testResult); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		try {

			ExtentReport.getResult(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Playback.stop();

		login.Reset();
		loader.Reset();
		names.Reset();
		geo.Reset();

	}

	@AfterSuite(groups = { "2020DefectTestCases", "2021DefectTestCases", "2021AccountingDefect" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}
}
