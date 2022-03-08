package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapAccounting {

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

	public UIMapAccounting() {

		if (this.invoiceType == null)
			this.invoiceType = new InvoiceType();

		if (this.invoiceTypeEntry == null)
			this.invoiceTypeEntry = new InvoiceTypeEntry();

		if (this.itemCode == null)
			this.itemCode = new ItemCode();

		if (this.itemCodeEntry == null)
			this.itemCodeEntry = new ItemCodeEntry();

		if (this.invoiceEntry == null)
			this.invoiceEntry = new InvoiceEntry();

		if (this.receivePayment == null)
			this.receivePayment = new ReceivePayment();

		if (this.receivePaymentOption == null)
			this.receivePaymentOption = new ReceivePaymentOption();

		if (this.invoiceSearch == null)
			this.invoiceSearch = new InvoiceSearch();

		if (this.transactionAndAdjustment == null)
			this.transactionAndAdjustment = new TransactionAndAdjustment();

		if (this.feeSearch == null)
			this.feeSearch = new FeeSearch();

		if (this.paymentSearch == null)
			this.paymentSearch = new PaymentSearch();

		if (this.invoiceSearchHelpWindow == null)
			this.invoiceSearchHelpWindow = new InvoiceSearchHelpWindow();

		if (this.searchAccount == null)
			this.searchAccount = new SearchAccount();

		if (this.expenseSearch == null)
			this.expenseSearch = new ExpenseSearch();

		if (this.expenseEntry == null)
			this.expenseEntry = new ExpenseEntry();

	}

	public class InvoiceType {
		public WebDriver driver;

		public InvoiceType() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "chkExpand")
		public WebElement uIExpandCheckbox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdInvoiceTypeSrch_ctl00_Inspection_0")
		public WebElement uIInvoiceTypeTable;

		@FindBy(how = How.ID, using = "grdInvoiceTypeSrch_ctl00")
		public WebElement uIInvoiceTypePoliceTable;

		@FindBy(how = How.ID, using = "grdInvoiceTypeSrch_ctl00_Open Records Request_0")
		public WebElement uIInvoiceTypeOpenRecordsRequestGrid;

		@FindBy(how = How.ID, using = "grdInvoiceTypeSrch_ctl00_Animal Control (Law)_0")
		public WebElement uIInvoiceTypeAnimalControlGrid;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIIncludeInactiveCheckbox;

	}

	public class InvoiceTypeEntry {

		public WebDriver driver;

		public InvoiceTypeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdsave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cddInvoiceClass_DropDown")
		public WebElement uIInvoiceClassComboBox;

		@FindBy(how = How.ID, using = "cddDisburseAccount_DropDown")
		public WebElement uIDisbursementAccountComboBox;

		@FindBy(how = How.ID, using = "txtInvoiceType")
		public WebElement uIInvoiceTypeEdit;

		@FindBy(how = How.ID, using = "txtInvoiceTypeDesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "chkIsPermit")
		public WebElement uIIsPermitRadioButton;

		@FindBy(how = How.ID, using = "chkIsPenalty")
		public WebElement uIIsPenaltyRadioButton;

		@FindBy(how = How.ID, using = "btnAddInvoiceTemplate")
		public WebElement uIAttachReportTemplateButton;

		@FindBy(how = How.ID, using = "cddCycle_DropDown")
		public WebElement uICycleComboBox;

		@FindBy(how = How.ID, using = "cddBaseMonth_DropDown")
		public WebElement uIDefaultBaseMonthComboBox;

		@FindBy(how = How.ID, using = "cddInvoiceTemplate")
		public WebElement uIInvoiceTemplateComboBox;

		@FindBy(how = How.ID, using = "txtFirstNotice")
		public WebElement uISendFirstNoticeInEdit;

		@FindBy(how = How.ID, using = "cddFirstNoticeTemplate")
		public WebElement uIDaysFromInvoiceDateTemplateComboBox;

		@FindBy(how = How.ID, using = "txtSubseqNotice")
		public WebElement uISendSubsequentFirstNoticeInEveryEdit;

		@FindBy(how = How.ID, using = "cddSubseqNoticeTemplate")
		public WebElement uIDaysFromLastNoticeDateTemplateComboBox;

		@FindBy(how = How.ID, using = "btnAddNewItem")
		public WebElement uIAddNewItemCodeButton;

		@FindBy(how = How.ID, using = "grdItems")
		public WebElement uIInvoiceTypeEntryTable;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckbox;

	}

	public class ItemCode {

		public WebDriver driver;

		public ItemCode() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkExpand")
		public WebElement uIExpandCollapseCheckbox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "txtItemCode")
		public WebElement uIItemCodeEdit;

		@FindBy(how = How.ID, using = "chkInActive")
		public WebElement uIIncludeInactiveCheckbox;

		@FindBy(how = How.ID, using = "txtItemCodedesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "cddInvoiceClass_DropDown")
		public WebElement uIInvoiceClassComboBox;

		@FindBy(how = How.ID, using = "cddInvoiceType")
		public WebElement uIInvoiceTypeComboBox;

		@FindBy(how = How.ID, using = "grdItemCodeSrch")
		public WebElement uIItemCodeTable;

		@FindBy(how = How.ID, using = "chkIsPermit")
		public WebElement uIShowPermitsOnlyCheckbox;

	}

	public class ItemCodeEntry {

		public WebDriver driver;

		public ItemCodeEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cddInvoiceClass_DropDown")
		public WebElement uIInvoiceClassComboBox;

		@FindBy(how = How.ID, using = "cddInvoiceType")
		public WebElement uIInvoiceTypeComboBox;

		@FindBy(how = How.ID, using = "txtItemCode")
		public WebElement uIItemCodeEdit;

		@FindBy(how = How.ID, using = "txtItemCodedesc")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uIConditionsNotesEdit;

		@FindBy(how = How.ID, using = "txtAmount")
		public WebElement uIAmountEdit;

		@FindBy(how = How.ID, using = "cmdsave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckbox;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "chkPrint")
		public WebElement uIPrintCheckbox;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;
	}

	public class InvoiceEntry {
		public WebDriver driver;
		public InvoiceDetailsTab invoiceDetailsTab;
		public TransactionsHistoryTab transactionsHistoryTab;

		public InvoiceEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.invoiceDetailsTab == null)) {
				this.invoiceDetailsTab = new InvoiceDetailsTab();
			}

			if ((this.transactionsHistoryTab == null)) {
				this.transactionsHistoryTab = new TransactionsHistoryTab();
			}
		}

		@FindBy(how = How.ID, using = "cmdsave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdDelete")
		public WebElement uIDeleteButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdReceivePayment")
		public WebElement uIReceivePaymentIcon;

		@FindBy(how = How.ID, using = "cmdEmailInvoice")
		public WebElement uIEmailInvoiceButton;

		@FindBy(how = How.ID, using = "cmdPrintInvoice")
		public WebElement uIPrintInvoiceButton;

		@FindBy(how = How.ID, using = "CmdVoidInvoice")
		public WebElement uIVoidInvoiceButton;

		@FindBy(how = How.ID, using = "cddInvoiceClass_DropDown")
		public WebElement uIInvoiceClassComboBox;

		@FindBy(how = How.ID, using = "cddInvoiceType")
		public WebElement uIInvoiceTypeComboBox;

		@FindBy(how = How.ID, using = "cddInvoiceSendTo")
		public WebElement uIInvoiceSendToComboBox;

		@FindBy(how = How.ID, using = "txtRegistration")
		public WebElement uIRegistrationEdit;

		@FindBy(how = How.ID, using = "txtAccountBalance")
		public WebElement uIAccountBalanceEdit;

		@FindBy(how = How.ID, using = "InvoiceAccount_nbrInvoiceNumber_Year")
		public WebElement uIInvoiceNumberYearEdit;

		@FindBy(how = How.ID, using = "InvoiceAccount_nbrInvoiceNumber_Number")
		public WebElement uIInvoiceNumberEdit;

		@FindBy(how = How.ID, using = "nbrDetailNoTo_Year")
		public WebElement uIDetailNumberYearEdit;

		@FindBy(how = How.ID, using = "nbrDetailNoTo_Number")
		public WebElement uIDetailNumberEdit;

		@FindBy(how = How.ID, using = "InvoiceAccount_txtInvoiceBalance")
		public WebElement uIInvoiceBalanceEdit;

		@FindBy(how = How.ID, using = "NameCtrl1")
		public WebElement uIOccupancyNameEdit;

		@FindBy(how = How.ID, using = "InvoiceAccount_dtdueTo_KPIDttmCtrl")
		public WebElement uIInvoiceDueDateEdit;

		@FindBy(how = How.ID, using = "chkPrinted")
		public WebElement uIToBePrintCheckBox;

		@FindBy(how = How.ID, using = "chkEmailed")
		public WebElement uIToBeEmailedCheckBox;

		@FindBy(how = How.ID, using = "drpInvoiceTem")
		public WebElement uIInvoiceTemplateComboBox;

		@FindBy(how = How.ID, using = "dtOriginalDate_KPIDttmCtrl")
		public WebElement uIInvoiceDateEdit;

		@FindBy(how = How.ID, using = "dtDueDate_KPIDttmCtrl")
		public WebElement uIOriginalPaymentDueDateEdit;

		@FindBy(how = How.ID, using = "txtAmount")
		public WebElement uIInvoiceAmountEdit;

		@FindBy(how = How.ID, using = "txtInvoiceNotes")
		public WebElement uIInvoiceNotesEdit;

		@FindBy(how = How.ID, using = "BillAcName_NameType")
		public WebElement uIBillToAccountNameTypeEdit;

		@FindBy(how = How.ID, using = "BillAcName_NameTypeID")
		public WebElement uIBillToAccountNameNumberEdit;

		@FindBy(how = How.ID, using = "BillAcName_LastName")
		public WebElement uIBillToAccountLastNameEdit;

		@FindBy(how = How.ID, using = "BillAcName_FirstName")
		public WebElement uIBillToAccountFirstNameEdit;

		@FindBy(how = How.ID, using = "cddBillCon")
		public WebElement uIBillingContactComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Invoice Details')]")
		public WebElement uIInvoiceDetailsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Transactions & History')]")
		public WebElement uITransactionsHistoryTab;

		@FindBy(how = How.ID, using = "ImgRegdtl")
		public WebElement uIIDNoLookupButton;

		@FindBy(how = How.ID, using = "txtRegFrom")
		public WebElement uIIDNoEdit;

		@FindBy(how = How.ID, using = "adrBillAcAddress1_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "CustomAccPhone_PhoneType_DropDown")
		public WebElement uIPhoneTypeComboBox;

		@FindBy(how = How.ID, using = "CustomAccPhone_PhoneNumber")
		public WebElement uIPhoneNumberEdit;

		@FindBy(how = How.ID, using = "InvoiceAccount_dtdueTo_KPIDttmCtrl")
		public WebElement uIDueDateEdit;

		@FindBy(how = How.ID, using = "cmdInvoiceStatus")
		public WebElement uIInvoiceStatusLabel;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_TotalAmount")
		public WebElement uITotalAmountEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'status']/b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class InvoiceDetailsTab {

		public WebDriver driver;

		public InvoiceDetailsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_InvoiceDetails_cddItemCode")
		public WebElement uIItemCodeComboBox;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_InvoiceDetails_txtQty")
		public WebElement uIQtyEdit;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_InvoiceDetails_txtRate")
		public WebElement uIRateEdit;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_InvoiceDetails_txtAmount")
		public WebElement uIAmountEdit;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_InvoiceDetails_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_InvoiceDetails_grdInvoice")
		public WebElement uIInvoiceDetailsTable;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_TotalAmount")
		public WebElement uITotalAmountEdit;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl0_InvoiceDetails_cddSubItemCode")
		public WebElement uISubItemCodeComboBox;

	}

	public class TransactionsHistoryTab {
		public WebDriver driver;

		public TransactionsHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl1_TransactionAndHistory_grdTransaction")
		public WebElement uITransactionsHistoryTable;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl1_TransactionAndHistory_btnAdd")
		public WebElement uIAddTransactionHistoryButton;

		@FindBy(how = How.ID, using = "tabInvoiceDetail_tmpl1_TransactionAndHistory_txtAdjustment")
		public WebElement uIAdjustmentEdit;

	}

	public class ReceivePayment {
		public WebDriver driver;
		public InvoicesTab invoicesTab;

		public ReceivePayment() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			if ((this.invoicesTab == null)) {
				this.invoicesTab = new InvoicesTab();
			}
		}

		@FindBy(how = How.ID, using = "cmdsave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "nbrInvoiceNumber_Year")
		public WebElement uIInvoiceNumberYearEdit;

		@FindBy(how = How.ID, using = "nbrInvoiceNumber_Number")
		public WebElement uIInvoiceNumberEdit;

		@FindBy(how = How.ID, using = "cddInvoiceClass_DropDown")
		public WebElement uIInvoiceClassComboBox;

		@FindBy(how = How.ID, using = "txtBalance")
		public WebElement uIAccountBalanceEdit;

		@FindBy(how = How.ID, using = "txtContactName_NameType")
		public WebElement uIBillToAccountNameTypeEdit;

		@FindBy(how = How.ID, using = "txtContactName_NameTypeID")
		public WebElement uIBillToAccountNameIDEdit;

		@FindBy(how = How.ID, using = "PaymentNameCrtl_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "PaymentNameCrtl_NameTypeID")
		public WebElement uINameIDEdit;

		@FindBy(how = How.ID, using = "PaymentNameCrtl_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "PaymentNameCrtl_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtamt")
		public WebElement uIAmountEdit;

		@FindBy(how = How.ID, using = "dttReceived_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "cddPaymentMethod_DropDown")
		public WebElement uIPaymentMethodComboBox;

		@FindBy(how = How.ID, using = "txtChequeNo")
		public WebElement uIChequeNoEdit;

		@FindBy(how = How.ID, using = "txtMemo")
		public WebElement uIMemoEdit;

		@FindBy(how = How.ID, using = "txtCardNo")
		public WebElement uITranscationReferenceEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Invoices')]")
		public WebElement uIInvoicesTab;

		@FindBy(how = How.ID, using = "cddCashRegister_DropDown")
		public WebElement uICashRegisterComboBox;

		@FindBy(how = How.ID, using = "cmdPrintReceipt")
		public WebElement uIPrintReceiptButton;

		@FindBy(how = How.ID, using = "cmdEmailReceipt")
		public WebElement uIEmailReceiptButton;

		@FindBy(how = How.ID, using = "btnVoidPayment")
		public WebElement uIVoidPaymentButton;

		@FindBy(how = How.ID, using = "txtVoidReason")
		public WebElement uIVoidReasonEdit;

		@FindBy(how = How.ID, using = "btnVoidOk")
		public WebElement uIVoidReasonOKButton;

		@FindBy(how = How.ID, using = "lblShowVoidReason")
		public WebElement uIVoidReasonLabel;

		@FindBy(how = How.ID, using = "nbrInvoiceNumber_imgBtn")
		public WebElement uIInvoiceLookupButton;

		@FindBy(how = How.ID, using = "cmdFindAccount")
		public WebElement uIFindAnAccountOrInvoiceButton;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_txtAmountDue")
		public WebElement uIAmountDueEdit;

		@FindBy(how = How.ID, using = "txtAvailableCredit")
		public WebElement uIAvailableCreditEdit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails")
		public WebElement uIReceivePaymentTable;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails_it11_0_Payment")
		public WebElement uIPaymentEditInGrid;

	}

	public class InvoicesTab {
		public WebDriver driver;

		public InvoicesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails")
		public WebElement uIInvoicesTabTable;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_txtAmountDue")
		public WebElement uIAmountDueEdit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_txtApplied")
		public WebElement uIAppliedEdit;

		@FindBy(how = How.XPATH, using = "//div[@id ='tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails']//input[@id='tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails_it11_2_Payment']")
		public WebElement uIPaymentGrid4Edit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails_it11_3_Payment")
		public WebElement uIPaymentGrid3Edit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails_it11_2_Payment")
		public WebElement uIPaymentGrid2Edit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails_it11_1_Payment")
		public WebElement uIPaymentGrid1Edit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_grdInvoiceDetails_it11_0_Payment")
		public WebElement uIPaymentGrid0Edit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_txtOverPayment")
		public WebElement uIOverPaymentEdit;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_rbtLeaveCredit")
		public WebElement uILeaveCreditUsedLaterRadioButton;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_rbtRefund")
		public WebElement uIRefundRadioButton;

		@FindBy(how = How.ID, using = "tabReceivePayment_tmpl0_usrInvoiceDtl_ChkSelectAll")
		public WebElement uISelectAllCheckBox;

	}

	public class ReceivePaymentOption {
		public WebDriver driver;

		public ReceivePaymentOption() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdPrintReceipt")
		public WebElement uIPrintReceiptButton;

		@FindBy(how = How.ID, using = "cmdEmailReceipt")
		public WebElement uIEmailReceiptButton;

		@FindBy(how = How.ID, using = "cmdContToEdit")
		public WebElement uIContinueToEditButton;

		@FindBy(how = How.ID, using = "cmdClose")
		public WebElement uICloseButton;

		@FindBy(how = How.ID, using = "cmdCloseProcess")
		public WebElement uICloseandProcessButton;
	}

	public class InvoiceSearch {

		public WebDriver driver;

		public InvoiceSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintIconButton;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_cddInvoiceType")
		public WebElement uIInvoiceTypeComboBox;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_cddInvoiceClass_DropDown")
		public WebElement uIInvoiceClassComboBox;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_nbrInvoiceNumber_Year")
		public WebElement uIInvoiceYearFromEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_nbrInvoiceNumber_Number")
		public WebElement uIInvoiceNumberFromEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_nbrToInvoiceNumber_Year")
		public WebElement uIInvoiceYearToEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_nbrToInvoiceNumber_Number")
		public WebElement uIInvoiceNumberToEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Receive Payment')])")
		public WebElement uIReceivePaymentButton;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_AddressCtrl1_txtFrom")
		public WebElement uIAddressEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_AddressCtrl1_chkVerify")
		public WebElement uIAddressVerifyCheckBox;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_NameCtrl1_NameType")
		public WebElement uIAccountNameTypeEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_NameCtrl1_NameTypeID")
		public WebElement uIAccountNameIDEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_NameCtrl1_LastName")
		public WebElement uIAccountLastNameEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_NameCtrl1_FirstName")
		public WebElement uIAccountFirstNameEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_RadItemCode")
		public WebElement uIItemCodeComboBox;

		@FindBy(how = How.ID, using = "grdInvInq")
		public WebElement uIInvoiceSearchResultTable;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_nbrInvoiceNumber_imgBtn")
		public WebElement uIInvoiceInfoIcon;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_txtRegFrom")
		public WebElement uISystemIDNoFromEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_txtRegTo")
		public WebElement uISystemIDNoToEdit;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_chkDueDate")
		public WebElement uIOverdueOnlyCheckbox;

		@FindBy(how = How.ID, using = "InvoiceInquiryBasic_rbUnpaid")
		public WebElement uIUnpaidRadioButton;

	}

	public class TransactionAndAdjustment {

		public WebDriver driver;

		public TransactionAndAdjustment() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtInvoiceNo_Year")
		public WebElement uIInvoiceYearEdit;

		@FindBy(how = How.ID, using = "txtInvoiceNo_Number")
		public WebElement uIInvoiceNumberEdit;

		@FindBy(how = How.ID, using = "dttmDateofAction_KPIDttmCtrl")
		public WebElement uIDateOfActionEdit;

		@FindBy(how = How.ID, using = "luppf_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "cddActionType_DropDown")
		public WebElement uIActionTypeComboBox;

		@FindBy(how = How.ID, using = "txtAmount")
		public WebElement uIAmountEdit;

		@FindBy(how = How.ID, using = "txtTrnNotes")
		public WebElement uITransactionNotesEdit;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;
	}

	public class FeeSearch {

		public WebDriver driver;

		public FeeSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddInvoiceType_DropDown")
		public WebElement uIInvoiceTypeComboBox;

		@FindBy(how = How.ID, using = "chkIncludeBilled")
		public WebElement uIIncludeBilledCheckbox;

		@FindBy(how = How.ID, using = "cddItemCode")
		public WebElement uIItemCodeComboBox;

		@FindBy(how = How.ID, using = "cddForYear")
		public WebElement uIForYearComboBox;

		@FindBy(how = How.ID, using = "cddForYear_DropDown")
		public WebElement uIForYear1ComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdCreateInVoice")
		public WebElement uICreateInvoiceButton;

		@FindBy(how = How.ID, using = "chkSelectAll")
		public WebElement uISelectAllCheckbox;

		@FindBy(how = How.ID, using = "grdFeeSrch")
		public WebElement uIFeeSearchTable;

		@FindBy(how = How.ID, using = "lblFeesRecords")
		public WebElement uITotalRecordsSelectedLabel;

		@FindBy(how = How.ID, using = "lblRecordsCount")
		public WebElement uIPopupRecordsSelectedLabel;

		@FindBy(how = How.ID, using = "dttmInvoiceDate_KPIDttmCtrl")
		public WebElement uIPopupInvoiceDateEdit;

		@FindBy(how = How.ID, using = "dttmDueDate_KPIDttmCtrl")
		public WebElement uIPopupDueDateEdit;

		@FindBy(how = How.ID, using = "cmdSaveInVoice")
		public WebElement uIPopupCreateInvoiceButton;

	}

	public class PaymentSearch {

		public WebDriver driver;

		public PaymentSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "nbrInvoiceNumber_Year")
		public WebElement uIInvoiceYearEdit;

		@FindBy(how = How.ID, using = "nbrInvoiceNumber_Number")
		public WebElement uIInvoiceNumberEdit;

		@FindBy(how = How.ID, using = "cddInvoiceClass_DropDown")
		public WebElement uIInvoiceClassComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdPaymentInq")
		public WebElement uIPaymentSearchTable;

		@FindBy(how = How.XPATH, using = "//img[@src='/KPIImages/ico/16_print.gif']")
		public WebElement uIPrintICon;

		@FindBy(how = How.ID, using = "cddPaymentDate_DropDown")
		public WebElement uIPaymentDateDropDown;

	}

	public class InvoiceSearchHelpWindow {
		public WebDriver driver;

		public InvoiceSearchHelpWindow() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Receive Payment')])")
		public WebElement uIReceivePaymentButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Select Invoice')])")
		public WebElement uISelectInvoiceButton;

		@FindBy(how = How.ID, using = "grdInvInq")
		public WebElement uIInvoiceSearchHelpResultTable;
	}

	public class SearchAccount {
		public WebDriver driver;

		public SearchAccount() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdAccountSearch")
		public WebElement uISearchAccountTable;

	}

	public class ExpenseSearch {

		public WebDriver driver;

		public ExpenseSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdExpenselist")
		public WebElement uIExpenseTable;

		@FindBy(how = How.ID, using = "cddExpClass_DropDown")
		public WebElement uIExpenseClassComboBox;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.XPATH, using = "//input[@id='dtExpFrom_KPIDttmCtrl']")
		public WebElement uIExpenseFromDateEdit;

		@FindBy(how = How.ID, using = "//input[@id='dtExpTo_KPIDttmCtrl']")
		public WebElement uIExpenseToDateEdit;

		@FindBy(how = How.ID, using = "cddCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "cddApprovalSt")
		public WebElement uIApprovalStatusComboBox;

	}

	public class ExpenseEntry {
		public WebDriver driver;

		public ExpenseEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;
	}

}
