package uIMaps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import application.Home.MobileDeviceOTPScreen;
import utilities.Playback;

public class UIMapHome {

	public UIMapHome() {
		if (this.myHome == null)
			this.myHome = new MyHome();
		if (this.messageSearch == null)
			this.messageSearch = new MessageSearch();
		if (this.textMgmt == null)
			this.textMgmt = new TextMgmt();
		if (this.manageNotes == null)
			this.manageNotes = new ManageNotes();
		if (this.selectReport == null)
			this.selectReport = new SelectReport();
		if (this.pnxReportSSRSPDFScreen == null)
			this.pnxReportSSRSPDFScreen = new PnxReportSSRSPDFScreen();
		if (this.pnxReportCrystalPDFScreen == null)
			this.pnxReportCrystalPDFScreen = new PnxReportCrystalPDFScreen();
		if (this.allImagesScreen == null)
			this.allImagesScreen = new AllImagesScreen();
		if (this.manageComments == null)
			this.manageComments = new ManageComments();
		if (this.updateImageScreen == null)
			this.updateImageScreen = new UpdateImageScreen();
		if (this.imageFullViewScreen == null)
			this.imageFullViewScreen = new ImageFullViewScreen();
		if (this.viewPrintStatusScreen == null)
			this.viewPrintStatusScreen = new ViewPrintStatusScreen();
		if (this.nameComments == null)
			this.nameComments = new NameComments();
		if (this.attachment == null)
			this.attachment = new Attachment();
		if (this.getAttachment == null)
			this.getAttachment = new GetAttachment();
		if (this.phoneBookSearch == null)
			this.phoneBookSearch = new PhoneBookSearch();
		if (this.phoneBookContactEntry == null)
			this.phoneBookContactEntry = new PhoneBookContactEntry();
		if (this.manageLinks == null)
			this.manageLinks = new ManageLinks();
		if (this.aLCScreen == null)
			this.aLCScreen = new ALCScreen();
		if (this.globalMapScreen == null)
			this.globalMapScreen = new GlobalMapScreen();
		if (this.viewPrintHistory == null)
			this.viewPrintHistory = new ViewPrintHistory();
		if (this.notification == null)
			this.notification = new Notification();
		if (this.bulletinEntry == null)
			this.bulletinEntry = new BulletinEntry();
		if (this.messageSendScreen == null)
			this.messageSendScreen = new MessageSendScreen();
		if (this.addMultiplePF == null)
			this.addMultiplePF = new AddMultiplePF();
		if (this.messageReceivedScreen == null)
			this.messageReceivedScreen = new MessageReceivedScreen();
		if (this.bOLOMessageReceivedScreen == null)
			this.bOLOMessageReceivedScreen = new BOLOMessageReceivedScreen();
		if (this.textStatmentReport == null)
			this.textStatmentReport = new TextStatmentReport();
		if (this.signatureScreen == null)
			this.signatureScreen = new SignatureScreen();
		if (this.textSearch == null)
			this.textSearch = new TextSearch();
		if (this.printBatchScreen == null)
			this.printBatchScreen = new PrintBatchScreen();
		if (this.pnxCustomReportPDFScreen == null)
			this.pnxCustomReportPDFScreen = new PnxCustomReportPDFScreen();
		if (this.phoneBookEntry == null)
			this.phoneBookEntry = new PhoneBookEntry();
		if (this.myDashBoard == null)
			this.myDashBoard = new MyDashBoard();
		if (this.printEmailScreen == null)
			this.printEmailScreen = new PrintEmailScreen();
		if (this.multiFilesAttachments == null)
			this.multiFilesAttachments = new MultiFilesAttachments();
		if (this.notificationSearch == null)
			this.notificationSearch = new NotificationSearch();
		if (this.whiteBoard == null)
			this.whiteBoard = new WhiteBoard();
		if (this.trackSearch == null)
			this.trackSearch = new TrackSearch();
		if (this.trackEntry == null)
			this.trackEntry = new TrackEntry();
		if (this.reportLog == null)
			this.reportLog = new ReportLog();
		if (this.attachmentsTab == null)
			this.attachmentsTab = new AttachmentsTab();
		if (this.expenseEntry == null)
			this.expenseEntry = new ExpenseEntry();
		if (this.mobileDeviceOTPScreen == null)
			this.mobileDeviceOTPScreen = new MobileDeviceOTPScreen();
	}

	public MyHome myHome = null;
	public MessageSearch messageSearch = null;
	public TextMgmt textMgmt = null;
	public ManageNotes manageNotes;
	public SelectReport selectReport = null;
	public PnxReportSSRSPDFScreen pnxReportSSRSPDFScreen = null;
	public PnxReportCrystalPDFScreen pnxReportCrystalPDFScreen = null;
	public AllImagesScreen allImagesScreen = null;
	public ManageComments manageComments = null;
	public UpdateImageScreen updateImageScreen = null;
	public ImageFullViewScreen imageFullViewScreen = null;
	public ViewPrintStatusScreen viewPrintStatusScreen = null;
	public NameComments nameComments = null;
	public Attachment attachment = null;
	public GetAttachment getAttachment = null;
	public PhoneBookSearch phoneBookSearch = null;
	public PhoneBookContactEntry phoneBookContactEntry = null;
	public ManageLinks manageLinks = null;
	public ALCScreen aLCScreen = null;
	public GlobalMapScreen globalMapScreen = null;
	public ViewPrintHistory viewPrintHistory = null;
	public Notification notification = null;
	public BulletinEntry bulletinEntry = null;
	public MessageSendScreen messageSendScreen = null;
	public AddMultiplePF addMultiplePF = null;
	public MessageReceivedScreen messageReceivedScreen = null;
	public BOLOMessageReceivedScreen bOLOMessageReceivedScreen = null;
	public TextStatmentReport textStatmentReport = null;
	public SignatureScreen signatureScreen = null;
	public TextSearch textSearch = null;
	public PrintBatchScreen printBatchScreen = null;
	public PnxCustomReportPDFScreen pnxCustomReportPDFScreen = null;
	public PhoneBookEntry phoneBookEntry = null;
	public MyDashBoard myDashBoard = null;
	public PrintEmailScreen printEmailScreen = null;
	public MultiFilesAttachments multiFilesAttachments = null;
	public NotificationSearch notificationSearch = null;
	public WhiteBoard whiteBoard = null;
	public TrackSearch trackSearch = null;
	public TrackEntry trackEntry = null;
	public ReportLog reportLog = null;
	public AttachmentsTab attachmentsTab = null;
	public ExpenseEntry expenseEntry = null;
	
	public MobileDeviceOTPScreen mobileDeviceOTPScreen= null;

	public class MyHome {

		public WebDriver driver;

		public MyHome() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (messageTab == null)
				messageTab = new MessageTab();
			if (myRemindersTab == null)
				myRemindersTab = new MyRemindersTab();
			if (myReportsTab == null)
				myReportsTab = new MyReportsTab();
			if (myTrainingTab == null)
				myTrainingTab = new MyTrainingTab();
			if (myApprovalTab == null)
				myApprovalTab = new MyApprovalTab();
			if (myCMTab == null)
				myCMTab = new MyCMTab();
			if (whiteBoard == null)
				whiteBoard = new WhiteBoard();
		}

		public MessageTab messageTab;
		public MyRemindersTab myRemindersTab;
		public MyReportsTab myReportsTab;
		public MyTrainingTab myTrainingTab;
		public MyApprovalTab myApprovalTab;
		public MyCMTab myCMTab;
		public WhiteBoard whiteBoard;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Message')]")
		public WebElement uIMessageTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Message/Bulletin')]")
		public WebElement uIMessageBulletinTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Reminders')]")
		public WebElement uIMyReminderTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Reports')]")
		public WebElement uIMyReportsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Training')]")
		public WebElement uIMyTrainingTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Info')]")
		public WebElement uIMyInfoTab;

		@FindBy(how = How.XPATH, using = "//span[@title='My Reports']//span[text()='My Approval']")
		public WebElement uIMyApprovalTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'My CM')]")
		public WebElement uIMyCMTab;

		@FindBy(how = How.ID, using = "cmdLinkAdd")
		public WebElement uIAddLinkButton;

		@FindBy(how = How.ID, using = "QuickLink")
		public WebElement uILinkName;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Reports/Approval')]")
		public WebElement uIMyReportsApprovalTab;

	}

	public class MessageTab {
		public WebDriver driver;

		public MessageTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabMain_tmpl0_cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "tabMain_tmpl0_cmdNewMsg")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabMain_tmpl0_cmdMsgSrch")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//div[@id='grdNames']//tbody[contains(@class,'ThemeItem']")
		public WebElement uIResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id='tabMain_tmpl0_updPnlMsg']//table[@id='Table1']")
		public WebElement uIMessageTable1TextView;

		@FindBy(how = How.ID, using = "tabMain_tmpl0_cmdBulletinAdd")
		public WebElement uIBulletinAddNewButton;

		@FindBy(how = How.ID, using = "tabMain_tmpl0_cmdBulletinSrch")
		public WebElement uIBulletinSearchButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tabMain_tmpl0_listBulletin']")
		public WebElement uIBulletinResultTable;

		@FindBy(how = How.ID, using = "tabMain_tmpl0_cmdBulletinRefresh")
		public WebElement uIBulletinRefreshButton;

		@FindBy(how = How.XPATH, using = "//div[@id='tabMain_tmpl0_listMsg']")
		public WebElement uIMessageListResultTable;
	}

	public class MyRemindersTab {
		public WebDriver driver;

		public MyRemindersTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "chkExpand")
		public WebElement uIExpandAllCheckBox;

		@FindBy(how = How.ID, using = "hActivity")
		public WebElement uIMyActivitiesAccordion;

		@FindBy(how = How.ID, using = "TrainingHeader")
		public WebElement uITrainingAccordion;

		@FindBy(how = How.ID, using = "TrainingCertHeader")
		public WebElement uICertificationAccordion;

		@FindBy(how = How.ID, using = "hAddrFlags")
		public WebElement uIAddressFlags_P_Accordion;

		@FindBy(how = How.ID, using = "grdCertification")
		public WebElement uICertificationResultGrid;

		@FindBy(how = How.ID, using = "grdAddrFlags")
		public WebElement uIAddressFlagsPResultGrid;

		@FindBy(how = How.ID, using = "grdTraining")
		public WebElement uITrainingResultGrid;

		@FindBy(how = How.ID, using = "hCaseManagement")
		public WebElement uICaseManagementAccordation;

		@FindBy(how = How.ID, using = "hProperty")
		public WebElement uIPropertyAccordation;

		@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Job Grade Review')]")
		public WebElement uIJobGradeReviewAccordation;

		@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Performance Review')]")
		public WebElement uIPerformanceReviewAccordation;

		@FindBy(how = How.ID, using = "hFleet")
		public WebElement uIFleetAccordation;

		@FindBy(how = How.ID, using = "rdlSchedule_0")
		public WebElement uICMReviewDueRadioButton;

		@FindBy(how = How.ID, using = "rdlSchedule_1")
		public WebElement uICMReportDueRadioButton;

		@FindBy(how = How.ID, using = "rdlSchedule_2")
		public WebElement uICMNewAssignmentsRadioButton;

		@FindBy(how = How.ID, using = "grdCases")
		public WebElement uICaseManagementTable;

		@FindBy(how = How.ID, using = "grdProperty")
		public WebElement uIPropertyTable;

		@FindBy(how = How.ID, using = "grdPersonnel")
		public WebElement uIJobGradeTable;

		@FindBy(how = How.ID, using = "grdPerformanceReviewSrch")
		public WebElement uIPerformanceReviewTable;

		@FindBy(how = How.ID, using = "lblmsgProperty")
		public WebElement uIPropertyNoDataDisplayText;

		@FindBy(how = How.ID, using = "grdFleet")
		public WebElement uIFleetTable;

		@FindBy(how = How.ID, using = "lblmsgFleet")
		public WebElement uIFleetNoDataDisplayText;

		@FindBy(how = How.ID, using = "hinventory")
		public WebElement uIInventoryAccordation;

		@FindBy(how = How.ID, using = "grdInvSrch")
		public WebElement uIInventoryTable;

		@FindBy(how = How.ID, using = "lblmsgInventory")
		public WebElement uIInventoryNoDataDisplayText;

		@FindBy(how = How.XPATH, using = " //div[@id='grdInvSrch'] //td[@class = 'RedCss']")
		public WebElement uIInventoryLastDueText;

		@FindBy(how = How.ID, using = "grdActLogSrch")
		public WebElement uIMyActivityTable;

		@FindBy(how = How.ID, using = "lblmsgActivity")
		public WebElement uIActivityNoDataDisplayText;

		@FindBy(how = How.ID, using = "hinspection")
		public WebElement uIInspectionAccordation;

		@FindBy(how = How.ID, using = "grdInspection")
		public WebElement uIInspectionTable;

		@FindBy(how = How.ID, using = "hORRequestCount")
		public WebElement uIRecordsRequestsAccordion;

		@FindBy(how = How.ID, using = "grdORRequest")
		public WebElement uIRecordRrequestGrid;

		@FindBy(how = How.ID, using = "lblmsgFleet")
		public WebElement uIInventoryNoDataDisplay;

		@FindBy(how = How.XPATH, using = "//h3[@id='hProperty']")
		public WebElement uIPropertyTabNotAppear;

		@FindBy(how = How.ID, using = "hPhoneFlags")
		public WebElement uIPhoneNumberFlagsAccordion;

		@FindBy(how = How.ID, using = "grdPhoneFlags")
		public WebElement uIPhoneNoFlagsTable;
	}

	public class MyReportsTab {
		public WebDriver driver;
		public WebElement uIMyReportsFrame;

		public MyReportsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstReportStatus")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisComboBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add New')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "grdCBEReports")
		public WebElement uIReportTable;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cddRepositoryID_DropDown")
		public WebElement uIItemTypeComboBox;

		@FindBy(how = How.ID, using = "chkMyItem")
		public WebElement uIShowMyItemsOnlyCheckBox;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refresh')]")
		public WebElement uIRefreshLink;
	}

	public class MessageSearch {

		public WebDriver driver;

		public MessageSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdMsgSrch")
		public WebElement uIMessageTable;

		@FindBy(how = How.ID, using = "lupContactPFID_CodeValue")
		public WebElement uIPFInboxEdit;

		@FindBy(how = How.ID, using = "lupContactPFID_cmdIncOnAddr")
		public WebElement uIPFInfoIcon;

		@FindBy(how = How.ID, using = "rbMessage")
		public WebElement uIMessageRadioButton;

		@FindBy(how = How.ID, using = "rbBolo")
		public WebElement uIBoloRadioButton;

		@FindBy(how = How.ID, using = "chkViewMsg")
		public WebElement uIIncludeViewedCheckBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "lst91Juris")
		public WebElement uIJurisComboBox;
	}

	public class MyTrainingTab {
		public WebDriver driver;

		public MyTrainingTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "chkExpandAll")
		public WebElement uIExpandAllCheckBox;

		@FindBy(how = How.ID, using = "ui-accordion-accordion-header-0")
		public WebElement uIMyTrainingHistoryAccordion;

		@FindBy(how = How.ID, using = "ui-accordion-accordion-header-1")
		public WebElement uIMycertificationsAccordion;

		@FindBy(how = How.ID, using = "ui-accordion-accordion-header-2")
		public WebElement uIUpcommingTrainingclassesAccordion;

		@FindBy(how = How.ID, using = "grdClass")
		public WebElement uIUpcommingTrainingclassesResultGrid;

	}

	public class MyApprovalTab {
		public WebDriver driver;

		public MyApprovalTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstReportStatus")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "cddRepositoryID")
		public WebElement uIItemTypeComboBox;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdApprovalstatus")
		public WebElement uIApprovalStatusReportTable;

		@FindBy(how = How.ID, using = "lblDisplayTExt")
		public WebElement uINoRecordFoundText;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "lupSupervisor_CodeValue")
		public WebElement uISupervisorEdit;

		@FindBy(how = How.ID, using = "grdCBEReports")
		public WebElement uIReportsTable;

	}

	public class MyCMTab {
		public WebDriver driver;

		public MyCMTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//h3[contains(text(),'New Assignments')]")
		public WebElement uINewAssignmentAccordion;

		@FindBy(how = How.ID, using = "ui-accordion-accordion-header-1")
		public WebElement uIOverDueTaskAccordion;

		@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Open Case Folder')]")
		public WebElement uIOpenCaseFolderAccordion;

		@FindBy(how = How.ID, using = "grdOpenCaseFolder_ctl00_Prophoenix, Automation_0")
		public WebElement uIOpenCaseFolderTable;

		@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Tasks')]")
		public WebElement uITasksAccordion;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "chkExpandAll")
		public WebElement uIExpandAllCheckBox;

		@FindBy(how = How.ID, using = "grdNewAssignments")
		public WebElement uINewAssignmentsReportTable;

		@FindBy(how = How.ID, using = "lblNewAssignments")
		public WebElement uINewAssignmentsLable;

		@FindBy(how = How.ID, using = "grdOverdueTask")
		public WebElement uITasksReportTable;

		@FindBy(how = How.ID, using = "lblNewAssignmentsCont")
		public WebElement uINeAssignmentsLabel;
		// @FindsBy(how = How.XPath, Using = "//div[@id = 'divOverdueTask']//div[@id =
		// 'grdOverdueTask']")
		// public WebElement uITasksReportTable;

		@FindBy(how = How.XPATH, using = "//tr[@chlgcnt='1']//td[text()='CM, Investigator']")
		public WebElement uIHeaderLineOpenCaseFolder;

	}

	public class ManageLinks {
		public WebDriver driver;

		public ManageLinks() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "txtLinkName")
		public WebElement uILinkNameEdit;

		@FindBy(how = How.ID, using = "lupScreens_CodeValue")
		public WebElement uIScreenEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdLink")
		public WebElement uIManageLinkTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "txtURL")
		public WebElement uIEnterURL;

		@FindBy(how = How.ID, using = "txtFilePath")
		public WebElement uIEnterFilePath;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "chkShowAll")
		public WebElement uIShowAllCheckbox;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;
	}

	public class PhoneBookSearch {
		public WebDriver driver;

		public PhoneBookSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'New Contact')]")
		public WebElement uINewContactButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Back')]")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "tabCanact_tmpl0_UsrCanactBasicSrch1_lupBookName_CodeValue")
		public WebElement uIPhoneBookEdit;

		@FindBy(how = How.ID, using = "grdSearchDisplay")
		public WebElement uIPhoneBookSearchTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'New PhoneBook')]")
		public WebElement uINewPhoneBookButton;

		@FindBy(how = How.ID, using = "tabCanact_tmpl0_UsrCanactBasicSrch1_lupBookName_imgBtn")
		public WebElement uIPhoneBookLookupbutton;
	}

	public class PhoneBookContactEntry {

		public WebDriver driver;

		public PhoneBookContactEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.phoneNumberTab == null)) {
				this.phoneNumberTab = new PhoneNumberTab();
			}
			if ((this.callBackTab == null)) {
				this.callBackTab = new CallBackTab();
			}
			if ((this.contactEntryHistoryTab == null)) {
				this.contactEntryHistoryTab = new ContactEntryHistoryTab();
			}
		}

		public PhoneNumberTab phoneNumberTab = null;
		public CallBackTab callBackTab = null;
		public ContactEntryHistoryTab contactEntryHistoryTab = null;

		@FindBy(how = How.ID, using = "lupBookName_CodeValue")
		public WebElement uIBookNameEdit;

		@FindBy(how = How.ID, using = "txtLast")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "txtMiddle")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "txtFirst")
		public WebElement uIMiddleNameEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Phone Number')]")
		public WebElement uIPhoneNumberTab;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "txtAddress")
		public WebElement uIAddressEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Call Back')]")
		public WebElement uICallBackTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Custom')]")
		public WebElement uICustomTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(), 'History')]")
		public WebElement uIHistoryTab;

	}

	public class PhoneNumberTab {
		public WebDriver driver;

		public PhoneNumberTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl0_UsrPhoneEnrty2_cstPhone_PhoneType_DropDown")
		public WebElement uIPhoneComboBox;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl0_UsrPhoneEnrty2_cstPhone_PhoneNumber")
		public WebElement uIPhoneEdit;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl0_UsrPhoneEnrty2_chkPrimary")
		public WebElement uIPrimaryCheckbox;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl0_UsrPhoneEnrty2_txtExtn")
		public WebElement uIExtensionEdit;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl0_UsrPhoneEnrty2_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl0_UsrPhoneEnrty2_grdTelephone")
		public WebElement uIPhoneNumberTable;

	}

	public class CallBackTab {
		public WebDriver driver;

		public CallBackTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl2_UsrCallBack1_cddRoster_DropDown")
		public WebElement uIRosterComboBox;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl2_UsrCallBack1_txtRosterPosition")
		public WebElement uIPositionEdit;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl2_UsrCallBack1_dttmPeriod_Date_KPIDttmCtrl")
		public WebElement uIPeriodFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabContactEntry_tmpl2_UsrCallBack1_dttmPeriod_Time'] //input")
		public WebElement uIPeriodFromTimeEdit;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl2_UsrCallBack1_dttmToDate_Date_KPIDttmCtrl")
		public WebElement uIPeriodToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabContactEntry_tmpl2_UsrCallBack1_dttmToDate_Time'] //input")
		public WebElement uIPeriodToTimeEdit;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl2_UsrCallBack1_txtComments")
		public WebElement uICommentsEdit;
	}

	public class ContactEntryHistoryTab {
		public WebDriver driver;

		public ContactEntryHistoryTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl4_UsrHistory1_dtDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabContactEntry_tmpl4_UsrHistory1_dtDate_Time'] //input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl4_UsrHistory1_txtLog")
		public WebElement uILogEdit;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl4_UsrHistory1_grdHistory")
		public WebElement uIHistoryTabTable;

		@FindBy(how = How.ID, using = "tabContactEntry_tmpl4_UsrHistory1_imgAdd")
		public WebElement uIAddButton;
	}

	public class TextMgmt {
		public WebDriver driver;

		public TextMgmt() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (subjectTab == null)
				subjectTab = new SubjectTab();
			if (templateFor == null)
				templateFor = new TemplateFor();
		}

		public SubjectTab subjectTab = null;
		public TemplateFor templateFor = null;

		@FindBy(how = How.XPATH, using = "//Table[@id = 'ctrlUsrKPITxtEdit_rteKPITxtWrapper']//iframe[@id = 'ctrlUsrKPITxtEdit_rteKPITxt_contentIframe']")
		public WebElement uISummaryTextEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uISummaryRichTabTextEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Subject')]")
		public WebElement uISubjectTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Templates For')]")
		public WebElement uITemplateForTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_lstTextName")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdload")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_cmdAddnew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uISummaryRichTextEdit;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//body//span[3]")
		public WebElement uIFromTextFieldFilled;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_lblAutoSaveTime")
		public WebElement uIAutoSaveTxt;

		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIFromTextFieldEmpty;
		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']//b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class ManageNotes {
		public WebDriver driver;

		public ManageNotes() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "rteKPITxt_contentIframe")
		public WebElement uISummaryRichTabTextEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "lstTextName")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "cmdload")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "cmdAddnew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "dtDate_Date_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dtDate_Time'] //input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "lupPFNbr_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.XPATH, using = "//body")
		public WebElement uIFromTextFieldEmpty;

	}

	public class TextSearch {
		public WebDriver driver;

		public TextSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdText")
		public WebElement uITextSearchTable;

		@FindBy(how = How.ID, using = "cmdClose")
		public WebElement uICloseButton;

		@FindBy(how = How.ID, using = "txtSearchWords")
		public WebElement uISearchWordsField;

	}

	public class SubjectTab {
		public WebDriver driver;

		public SubjectTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabKPIText_tmpl0_ctrlUsrKPITxtEdit_txtName")
		public WebElement uITextNameEdit;

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uITextNameEditFor93;

		@FindBy(how = How.ID, using = "tabKPIText$tmpl0$ctrlUsrKPITxtEdit$txtDescription")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.XPATH, using = "//Table[@id = 'tabKPIText_tmpl0_ctrlUsrKPITxtEdit_rteKPITxtWrapper']//iframe[@id = 'tabKPIText_tmpl0_ctrlUsrKPITxtEdit_rteKPITxt_contentIframe']")
		public WebElement uITextNameRichTextEdit;

	}

	public class TemplateFor {
		public WebDriver driver;

		public TemplateFor() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_lupReportID_CodeValue")
		public WebElement uIScreenIdEdit;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_lupReportID_imgBtn")
		public WebElement uIScreenIdLookupButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_imgAdd")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabKPIText_tmpl2_usrTxtTemplate1_grdTxtRepository")
		public WebElement uITemplatesForResultTable;

	}

	public class SelectReport {
		public WebDriver driver;

		public SelectReport() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "rdoExport_0")
		public WebElement uIPDFRadioButton;

		@FindBy(how = How.ID, using = "btnprintbatch")
		public WebElement uIPrintBatchInQueueButton;

		@FindBy(how = How.ID, using = "rdoExport_1")
		public WebElement uIExcelRadioButton;

		@FindBy(how = How.ID, using = "rdoExport_2")
		public WebElement uIScreenRadioButton;

		@FindBy(how = How.ID, using = "rdoExport_3")
		public WebElement uIWordRadioButton;

		@FindBy(how = How.ID, using = "grdRptMgr")
		public WebElement uISelectReportMainResultTable;

		@FindBy(how = How.ID, using = "grdRptMgr_ctl00_Others_0")
		public WebElement uISelectReportOthersResultTable;

		@FindBy(how = How.ID, using = "grdRptMgr_ctl00_Reports_0")
		public WebElement uISelectReportsResultTable;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Name Detail')]")
		public WebElement uISelectReportOthersNameDetails;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Name Mining Image')]")
		public WebElement uISelectReportOthersNameMiningImage;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Crash Report 2017')]")
		public WebElement uISelectReportCrashReport2017Record;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Crash Report')]")
		public WebElement uISelectReportCrashReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Detention Record')]")
		public WebElement uISelectReportDetentionRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Common Names')]")
		public WebElement uICommonNamesRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Call Simple Lists')]")
		public WebElement uICallSimpleListRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Call Detail Report')]")
		public WebElement uICallDetailReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[text()='Unit Run Assignment Summary']")
		public WebElement uIUnitRunAssignmentSummaryReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Call Summary')]")
		public WebElement uICallSummaryRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Call Detail Report SSRS')]")
		public WebElement uICallDetailReportSSRSRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Inspections Checklist Only')]")
		public WebElement uIInspectionChecklistOnlyReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'QA Form')]")
		public WebElement uIQAFormReport;

		@FindBy(how = How.ID, using = "chkselectreport")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "Printer")
		public WebElement uIPrinterRadioButton;

		@FindBy(how = How.ID, using = "lblIsMainDB")
		public WebElement uIRecordCountTextView;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'VEH Tow Rotation')]")
		public WebElement uIVEHTowRotationsRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Photo Lineup')]")
		public WebElement uIPhotoLineupRecord;

		@FindBy(how = How.ID, using = "btnPrintSelectedReport")
		public WebElement uIPrintSelectedReportButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'RadContextMenu1_detached']//span[contains(text(),'Consolidated Report')]")
		public WebElement uIConsolidatedReportButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Citation Summary')]")
		public WebElement uICitationSummaryRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Citations by Officers')]")
		public WebElement uICitationsbyOfficersRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Citations Summary')]")
		public WebElement uICitationSummaryReportsRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Citations by Statutes')]")
		public WebElement uICitationsbyStatutesRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Civil Payment')]")
		public WebElement uICivilPaymentRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Photo Lineup Report')]")
		public WebElement uIPhotoLineupReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Incident Analysis Report')]")
		public WebElement uIIncidentAnalysisReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Pursuit Incident Report')]")
		public WebElement uIPursuitIncidentReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Fire Code Violations')]")
		public WebElement uIFireCodeViolationReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Forms_0'] //td[contains(text(), 'Preliminary Report of Life Safety and Physical Plant Survey')]")
		public WebElement uIPreliminaryLifeSafetyPhysicalPlantReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'EMS Demographic Summary Report')]")
		public WebElement uIEMSDemographicSummaryReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'EMS Medications Given Report')]")
		public WebElement uIEMSMedicationsGivenReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Use of Force')]")
		public WebElement uIUseOfForcePDFReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Certificates_0'] //td[contains(text(), 'Certificate of Smoke Alarm, Carbon Monoxide Alarm and Portable Fire Extinguisher Compliance')]")
		public WebElement uICSDCMACComplianceReport;

		@FindBy(how = How.ID, using = "btnEmailReport")
		public WebElement uIEmailReportButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'RadContextMenu2_detached']//span[contains(text(),'Individual Report')]")
		public WebElement uIIndividualReportButton;

		@FindBy(how = How.ID, using = "cmdSendEmail")
		public WebElement uISendEmailButton;

		@FindBy(how = How.ID, using = "grdRptMgr_ctl00_Certificates_0")
		public WebElement uICertificatesTable;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Case Names')]")
		public WebElement uICaseNamesReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'EMS Patient Care Detailed')]")
		public WebElement uIEMSPatientCareDetailedReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'EMS Patient Care Summary')]")
		public WebElement uIEMSPatientCareSummaryReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'UOF Details')]")
		public WebElement uISelectReportUOFDetails;

		@FindBy(how = How.ID, using = "grdRptMgr_ctl00_Notices_0")
		public WebElement uINoticesTable;

		@FindBy(how = How.XPATH, using = "//div[@id='grdRptMgr_ctl00_Reports_0']")
		public WebElement uICategoryTable;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Certificates_0'] //td[contains(text(), 'Certificate of Inspection')]")
		public WebElement uICertificateOfInspectionReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Notices_0'] //td[contains(text(), 'Notice of Violations and Order to Correct')]")
		public WebElement uINoticeOfViolationReport;

		@FindBy(how = How.XPATH, using = "(//table[@mkr='dataTbl.hdn']//tbody//tr//td[contains(text(),'Use of Force')])[1]")
		public WebElement uIUseOfForceReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Address Detail Report')]")
		public WebElement uIAddressDetailReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'CAD Summary Date Specific Report')]")
		public WebElement uICADSummaryDateSpecificRecord;

		@FindBy(how = How.XPATH, using = "//div[@mkr='container']")
		public WebElement uIReportSearchTable;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00'] //td[contains(text(), 'CAD Activity Detail Report')]")
		public WebElement uICADActivityDetailReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Others_0'] //td[contains(text(), 'Alarm CFS')]")
		public WebElement uIAlarmCFSRecord;

		@FindBy(how = How.XPATH, using = "//td[contains(text(),'UCR Domestic Violence Case Report')]")
		public WebElement uISelectUCRDomesticViolenceReport;

		@FindBy(how = How.XPATH, using = "//td[text()='Notice of Decision on Request for Time Extension']")
		public WebElement uINoticeOfDecisionOnRequestForTimeExtensionReport;

		@FindBy(how = How.XPATH, using = "//td[contains(text(),'Alarm Year End Report')]")
		public WebElement uIAlarmYearEndReport;

		@FindBy(how = How.XPATH, using = "//div[@id='grdRptMgr_ctl00']//td[text()='Order to Pay Penalty - Recurring Violations']")
		public WebElement uIOrderToPayPenaltyRecurringViolationsReport;

		@FindBy(how = How.XPATH, using = "//div[@id='grdRptMgr_ctl00']//td[text()='No Entry Report']")
		public WebElement uINoEntryReport;

		@FindBy(how = How.XPATH, using = "//td[text()='NFIRS Mutual Aid Summary Report']")
		public WebElement uINFIRSMutualAidSummaryReport;

		@FindBy(how = How.XPATH, using = "//td[text()='NFIRS Incident Analysis']")
		public WebElement uINFIRSIncidentAnalysisReport;

		@FindBy(how = How.XPATH, using = "//td[text()='Accountability Tag']")
		public WebElement uIAccountabilityTagReport;

		@FindBy(how = How.XPATH, using = "//td[text()='Accountability ID']")
		public WebElement uIAccountabilityIDReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'Case Details Report')]")
		public WebElement uICaseDetailsReportRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00'] //td[contains(text(),'Tow Details')]")
		public WebElement uITowDetailsReport;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0'] //td[contains(text(), 'EMS Billing Report with Assessments')]")
		public WebElement uIEMSBillingReportWithAssessmentsReport;

		@FindBy(how = How.XPATH, using = "//td[text()='Payments Ledger']")
		public WebElement uIPaymentsLedger;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00_Reports_0']//td[contains( text(),'Report Manager')]")
		public WebElement uIReportManagerRecord;

		@FindBy(how = How.XPATH, using = "//div[@id = 'grdRptMgr_ctl00']")
		public WebElement uIReportsGridTable;
	}

	public class PnxReportSSRSPDFScreen {
		public WebDriver driver;

		public PnxReportSSRSPDFScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl4_txtValue")
		public WebElement uIExpirationDateEdit;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl0")
		public WebElement uIViewReport;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Effective Date: ')]/../span[2]")
		public WebElement uIEffectiveDateInPDF;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Expiration Date: ')]/../span[2]")
		public WebElement uIExpirationDateInPDF;

		@FindBy(how = How.XPATH, using = "//span[text()='Granted - The new date by which compliance is ordered is:  ']//following-sibling::span")
		public WebElement uIGrantedDateInPDF;

		@FindBy(how = How.ID, using = "btnPrintReport")
		public WebElement uIPrintReport;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl4_txtValue")
		public WebElement uIFromDate;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl6_txtValue")
		public WebElement uIToDate;
	}

	public class PnxReportCrystalPDFScreen {
		public WebDriver driver;

		public PnxReportCrystalPDFScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl4_txtValue")
		public WebElement uIExpirationDateEdit;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl0")
		public WebElement uIViewReport;

		@FindBy(how = How.XPATH, using = "//td[@style='HEIGHT:5.08mm']/../td/div")
		public List<WebElement> uItablecontent;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl4_ddValue")
		public WebElement uIAccountNameOccupancyNameDdn;
	}

	public class PnxCustomReportPDFScreen {
		public WebDriver driver;

		public PnxCustomReportPDFScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl4_txtValue")
		public WebElement uIEnterRefTextEdit;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl6_ddValue")
		public WebElement uIIncludeEmployeeSignatureComboBox;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl0")
		public WebElement uIViewReportButton;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl4_ddValue")
		public WebElement uIIncludeQAFormCombobox;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl4_txtValue")
		public WebElement uIFromDateEdit;

		@FindBy(how = How.ID, using = "rsvCustomRpt__ctl4__ctl6_txtValue")
		public WebElement uIToDateEdit;

		@FindBy(how = How.ID, using = "btnEmailReport")
		public WebElement uIEmailReportButton;

		@FindBy(how = How.ID, using = "txtFromEmail")
		public WebElement uIFromEmail;

		@FindBy(how = How.ID, using = "txtToEmail")
		public WebElement uIToEmail;

		@FindBy(how = How.ID, using = "txtccEmail")
		public WebElement uIToCCEmail;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uIEmailSubject;

		@FindBy(how = How.ID, using = "txtMessage")
		public WebElement uIEmailMessage;

		@FindBy(how = How.ID, using = "btnSendEmail")
		public WebElement uISendEmailButton;

		@FindBy(how = How.ID, using = "btnCancel")
		public WebElement uICancelEmailButton;

		@FindBy(how = How.ID, using = "lblEmailMessage")
		public WebElement uIEmailSentMessage;

		@FindBy(how = How.XPATH, using = "//td[@class='statusBar']")
		public WebElement uIReportStatusLabel;

	}

	public class AllImagesScreen {
		public WebDriver driver;

		public AllImagesScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdUpdate")
		public WebElement uIUpdateButton;

		@FindBy(how = How.ID, using = "chkAllImages")
		public WebElement uIShowAllImagesCheckBox;

		@FindBy(how = How.ID, using = "cmdFingerPrint")
		public WebElement uIFingerPrintButton;

		@FindBy(how = How.ID, using = "cmdIQEye")
		public WebElement uICameraButton;

		@FindBy(how = How.ID, using = "cmdCapture")
		public WebElement uICaptureButton;

		@FindBy(how = How.ID, using = "cmdAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "ImageList_ctl00_imgName")
		public WebElement uIImageView;

		@FindBy(how = How.ID, using = "ImageList_ctl01_imgName")
		public WebElement uIImageView1;

		@FindBy(how = How.ID, using = "ImageList_ctl00_cddImageType")
		public WebElement uIImageTypeComboBox;

		@FindBy(how = How.ID, using = "ImageList_ctl00_imgFullWindow")
		public WebElement uIZoomButton;

		@FindBy(how = How.ID, using = "ImageList_ctl00_chkIsActive")
		public WebElement uIActiveCheckBox;

		@FindBy(how = How.ID, using = "ImageList_ctl01_chkIsActive")
		public WebElement uIActiveCheckBox1;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/16_close.gif']")
		public WebElement uIDeleteImageButton;

		@FindBy(how = How.XPATH, using = "//img[@src = '/KPIImages/ico/imageeditor1.png']")
		public WebElement uIImageEditorButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;
		
		@FindBy(how = How.ID, using = "cmdmblCam")
		public WebElement uIMobileDeviceCamera;
		
	}

	public class ManageComments {
		public WebDriver driver;

		public ManageComments() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uICommentsRichTextEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='tab0']//td[@class = 'statusBar']/table/tbody/tr/td/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class UpdateImageScreen {
		public WebDriver driver;

		public UpdateImageScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.XPATH, using = "//img[contains(src,'Home/frmHandle.aspx')]")
		public WebElement uIUpdatedImage;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "dttPhotoDate_Date_KPIDttmCtrl")
		public WebElement uIPhotoDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'dttPhotoDate_Time'] //input")
		public WebElement uITimeEdit;

		@FindBy(how = How.ID, using = "imgFileUpload")
		public WebElement uIFileUploadTextViewButton;
	}

	public class ImageFullViewScreen {
		public WebDriver driver;

		public ImageFullViewScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//td[@id='tdImageDelete']//img")
		public WebElement uIDeleteButton;

	}

	public class ViewPrintStatusScreen {
		public WebDriver driver;

		public ViewPrintStatusScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdPrintStatus")
		public WebElement uIPrintStatusTable;
	}

	public class NameComments {

		public WebDriver driver;

		public NameComments() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtEdit_rteKPITxt_contentIframe")
		public WebElement uINameCommentsEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

	}

	public class Attachment {

		public WebDriver driver;

		public Attachment() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cmdAddFile")
		public WebElement uIAddFilesButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cddCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_uploadfile")
		public WebElement uISelectButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cmdAddAttachment")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_grdKPITxtAttach_ctl00")
		public WebElement uIAttachmentsTable;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_grdKPITxtAttach_ctl00_FOLDER_0")
		public WebElement uIAttachmentsFolderTable;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnSingle")
		public WebElement uISingleFileRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnBulk")
		public WebElement uIBulkUploadRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnFolder")
		public WebElement uIFolderRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnLink")
		public WebElement uILinkRadioButton;

		@FindBy(how = How.ID, using = "upload")
		public WebElement uIFolderAddButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_ChkIsPrivate")
		public WebElement uIShowInCallDetailsCheckBox;

		@FindBy(how = How.ID, using = "btnMobile")
		public WebElement uIAttachmentUsingMobileDeviceButton;

	}

	public class GetAttachment {

		public WebDriver driver;

		public GetAttachment() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

	}

	public class ALCScreen {
		public WebDriver driver;

		public ALCScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (aLCPFTab == null)
				aLCPFTab = new ALCPFTab();
			if (aLCGroupTab == null)
				aLCGroupTab = new ALCGroupTab();

		}

		public ALCPFTab aLCPFTab = null;
		public ALCGroupTab aLCGroupTab = null;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uISetPermissionForEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'PF#')]")
		public WebElement uIPFNumberTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Group')]")
		public WebElement uIGroupTab;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

	}

	public class ALCPFTab {
		public WebDriver driver;

		public ALCPFTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_cddAction_DropDown")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_lupPF_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_cmdAddPF")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_cmdClearPF")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_grdPF")
		public WebElement uIPFGridResult;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_lupPF_CodeDescription")
		public WebElement uIPFDescriptionEdit;

		@FindBy(how = How.ID, using = "tabALC_tmpl0_UsrALPF1_cmdAddPF")
		public WebElement uIUpdateButton;
	}

	public class ALCGroupTab {
		public WebDriver driver;

		public ALCGroupTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_cddAction_DropDown")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_lupSquad_CodeValue")
		public WebElement uISquadCodeEdit;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_cmdGrpAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_grdGrp")
		public WebElement uIGroupGridTable;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_lblDiv")
		public WebElement uIDivisionTextView;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_lblSec")
		public WebElement uISectionTextView;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_Kpilabel1")
		public WebElement uISquadTextView;

		@FindBy(how = How.ID, using = "tabALC_tmpl1_UsrALGrp1_cddTitle_DropDown")
		public WebElement uITitleComboBox;

	}

	public class GlobalMapScreen {
		public WebDriver driver;

		public GlobalMapScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddPointLayers_Input")
		public WebElement uISelectOverLayComboBox;

		@FindBy(how = How.ID, using = "cddPointLayers_DropDown")
		public WebElement uISelectOverLayRadControlComboBox;

		@FindBy(how = How.ID, using = "pac-input")
		public WebElement uISearchTheMapEdit;

		@FindBy(how = How.ID, using = "side_bar")
		public WebElement uIMapDisplayNameText;

	}

	public class ViewPrintHistory {
		public WebDriver driver;

		public ViewPrintHistory() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtReasonPrntReport")
		public WebElement uIReasonForPrintingThisReportEdit;

		@FindBy(how = How.ID, using = "btnviewprint")
		public WebElement uIViewAndPrintButton;

		@FindBy(how = How.ID, using = "lblemailexist")
		public WebElement uIEmailTemplateText;

		@FindBy(how = How.ID, using = "btnEmail")
		public WebElement uIEmailButton;

	}

	public class Notification {
		public WebDriver driver;

		public Notification() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddPatrolArea_Input")
		public WebElement uIPatrolAreaInput;

		@FindBy(how = How.ID, using = "cddPatrolArea_DropDown")
		public WebElement uIPatrolAreaDropdown;

		@FindBy(how = How.ID, using = "lblNotification")
		public WebElement uINotificationLable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIRequestedPFCodeEdit;

		@FindBy(how = How.ID, using = "lupPF_CodeDescription")
		public WebElement uIRequestedPFCodeDescriptionTextView;

		@FindBy(how = How.ID, using = "DttmStart_KPIDttmCtrl")
		public WebElement uIStartDateEdit;

		@FindBy(how = How.ID, using = "dttmExpire_KPIDttmCtrl")
		public WebElement uIExpireDateEdit;

		@FindBy(how = How.ID, using = "rdoList_0")
		public WebElement uIDistributionRadioButton;

		@FindBy(how = How.ID, using = "rdoList_1")
		public WebElement uIPFRadioButton;

		@FindBy(how = How.ID, using = "rdoList_2")
		public WebElement uIEmailRadioButton;

		@FindBy(how = How.ID, using = "chkSendMobile")
		public WebElement uISendTextMessageCheckBox;

		@FindBy(how = How.ID, using = "cddDistribution_DropDown")
		public WebElement uIDistributionListComboBox;

		@FindBy(how = How.ID, using = "cddRptPrd_DropDown")
		public WebElement uIReportingPeriodComboBox;

		@FindBy(how = How.ID, using = "cddNotifyType_Input")
		public WebElement uINotifyEventComboBox;

		@FindBy(how = How.ID, using = "cddNotifyType_DropDown")
		public WebElement uINotifyEventRadControlComboBox;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdNotificationType")
		public WebElement uINotificationGridTable;

		@FindBy(how = How.ID, using = "lupPFID_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupPFID_CodeDescription")
		public WebElement uIPFCodeDescriptionTextView;

		@FindBy(how = How.ID, using = "cmdAddMulPF")
		public WebElement uIAddMulitiplePFButton;

		@FindBy(how = How.ID, using = "txtEmail")
		public WebElement uIEmailEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "txtName")
		public WebElement uINameEdit;

		@FindBy(how = How.ID, using = "lupPF_cmdIncOnAddr")
		public WebElement uIRequestedByPFInfoIcon;

		@FindBy(how = How.ID, using = "kpitxtreason") // Added by Abi
		public WebElement uIReasonEdit;
	}

	public class BulletinEntry {
		public WebDriver driver;

		public BulletinEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (textTab == null)
				textTab = new TextTab();
			if (distributionTab == null)
				distributionTab = new DistributionTab();
			if (bulletinAttachmentsTab == null)
				bulletinAttachmentsTab = new BulletinAttachmentsTab();
			if (bulletinEmailTextTab == null)
				bulletinEmailTextTab = new BulletinEmailTextTab();
		}

		public TextTab textTab;
		public DistributionTab distributionTab;
		public BulletinAttachmentsTab bulletinAttachmentsTab;
		public BulletinEmailTextTab bulletinEmailTextTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "txtMsgRef")
		public WebElement uIMessageIDEdit;

		@FindBy(how = How.ID, using = "txtAuthorityOf")
		public WebElement uIAuthorityOfEdit;

		@FindBy(how = How.ID, using = "txtSubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Text')]")
		public WebElement uITextTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Distribution')]")
		public WebElement uIDistributionTab;

		@FindBy(how = How.ID, using = "cmdEmail")
		public WebElement uISendEmailReminderButton;

		@FindBy(how = How.ID, using = "lblunviewedcount")
		public WebElement uIUnviewedTextView;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Email Text')]")
		public WebElement uIEmailTextTab;

	}

	public class TextTab {
		public WebDriver driver;

		public TextTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabBulletin_tmpl0_ctrlUsrKPITxtEdit_cddTemplate")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl0_ctrlUsrKPITxtEdit_btnLoad")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl0_ctrlUsrKPITxtEdit_btnAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl0_ctrlUsrKPITxtEdit_txtMsg_contentIframe")
		public WebElement uITextEdit;

	}

	public class DistributionTab {
		public WebDriver driver;

		public DistributionTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_dttPostFrom_Date_KPIDttmCtrl")
		public WebElement uIPostFromDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabBulletin_tmpl2_ctrlUsrBulletinTo_dttPostFrom_Time'] //input")
		public WebElement uIPostFromTimeEdit;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_dttPostTo_Date_KPIDttmCtrl")
		public WebElement uIPostToDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id = 'tabBulletin_tmpl2_ctrlUsrBulletinTo_dttPostTo_Time'] //input")
		public WebElement uIPostToTimeEdit;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cddPriority_DropDown")
		public WebElement uIPriorityComboBox;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_chkIsCritical")
		public WebElement uICriticalCheckBox;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_chkIsAll")
		public WebElement uIAddressAllCheckBox;

		@FindBy(how = How.ID, using = "ui-accordion-Dv_accordion-header-0")
		public WebElement uIDivisionSectionSquadAccordian;

		@FindBy(how = How.ID, using = "ui-accordion-Dv_accordion-header-1")
		public WebElement uIMultiplePFAccordian;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_lupSquad_CodeValue")
		public WebElement uISquadCodeEdit;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cmdImgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cmdImgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_grdTo")
		public WebElement uIDivisionSectionGridTable;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_lupPFID_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cmdAdd")
		public WebElement uIMultiplePFAddButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cmdClear")
		public WebElement uIMultiplePFClearButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_cmdAddMulPF")
		public WebElement uIAddMultiplePFButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_chkgroupby")
		public WebElement uIGroupbyCheckBox;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl2_ctrlUsrBulletinTo_lupPFID_imgBtn")
		public WebElement uIPFLookupButton;

	}

	public class BulletinAttachmentsTab {
		public WebDriver driver;

		public BulletinAttachmentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdoGroupBy_0")
		public WebElement uICategoryRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdoGroupBy_1")
		public WebElement uIFolderRadioButton;

		@FindBy(how = How.XPATH, using = "//img[@title = 'Expand Row']")
		public WebElement uIExpandRowButton;

		@FindBy(how = How.XPATH, using = "//img[@title = 'Collapse Row']")
		public WebElement uICollapseRowButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cmdAddFile")
		public WebElement uIAddFilesButton;

		@FindBy(how = How.ID, using = "cmdCapture")
		public WebElement uICaptureButton;

		@FindBy(how = How.ID, using = "cmdscanner")
		public WebElement uIScannerButton;

		@FindBy(how = How.ID, using = "btnDrawing")
		public WebElement uIDrawingButton;

		@FindBy(how = How.ID, using = "KPIALCPermission")
		public WebElement uIKPIALCPermisstionButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_grdKPITxtAttach_ctl00")
		public WebElement uIAttachmentsTable;

	}

	public class BulletinEmailTextTab {
		public WebDriver driver;

		public BulletinEmailTextTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabBulletin_tmpl3_UsrEmailText_cddEmailTemplate")
		public WebElement uITemplateComboBox;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl3_UsrEmailText_btnLoad")
		public WebElement uILoadButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl3_UsrEmailText_btnAddNew")
		public WebElement uIAddNewButton;

		@FindBy(how = How.ID, using = "tabBulletin_tmpl3_UsrEmailText_txtEmailMsg_contentIframe")
		public WebElement uIEmailRichTextEdit;
	}

	public class MessageSendScreen {
		public WebDriver driver;

		public MessageSendScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uISendToJurisComboBox;

		@FindBy(how = How.ID, using = "lupPFList_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "txtMsg")
		public WebElement uIMessageEdit;

		@FindBy(how = How.ID, using = "txtTo")
		public WebElement uIToEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdPF")
		public WebElement uIAddMultiplePFButton;

		@FindBy(how = How.ID, using = "chkSendAsBolo")
		public WebElement uISendAsBoloCheckBox;

		@FindBy(how = How.ID, using = "chkALL")
		public WebElement uISendAsTxtMessageCheckBox;

		@FindBy(how = How.ID, using = "chkEMail")
		public WebElement uISendAsEmailCheckBox;

		@FindBy(how = How.ID, using = "cmdShift")
		public WebElement uIShiftNotesButton;

		@FindBy(how = How.ID, using = "cmdSend")
		public WebElement uISendButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "lupPFList_imgBtn")
		public WebElement uIPFLookupButton;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "CddBoloType_DropDown")
		public WebElement uIBoloTypeComboBox;

		@FindBy(how = How.ID, using = "CddBoloStatus_DropDown")
		public WebElement uIBoloStatusComboBox;

		@FindBy(how = How.ID, using = "lupUnit_CodeValue")
		public WebElement uIUnitEdit;

	}

	public class AddMultiplePF {
		public WebDriver driver;

		public AddMultiplePF() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddDiv_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "cddSec_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "btnSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "btnClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "chkSelectAll")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "chkExpandTreeList")
		public WebElement uIExpandAllCheckBox;

		@FindBy(how = How.ID, using = "btnAddPFs")
		public WebElement uIAddTheSelectPFToListButton;

	}

	public class MessageReceivedScreen {
		public WebDriver driver;

		public MessageReceivedScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdReadPrev")
		public WebElement uIReadPreviousButton;

		@FindBy(how = How.ID, using = "cmdReadNext")
		public WebElement uIReadNextButton;

		@FindBy(how = How.ID, using = "cmdNewMsg")
		public WebElement uINewMessageButton;

		@FindBy(how = How.ID, using = "cmdReply")
		public WebElement uIReplyButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "txtMessages")
		public WebElement uIMessageEdit;

		@FindBy(how = How.ID, using = "txtReply")
		public WebElement uIReplyEdit;

		@FindBy(how = How.ID, using = "cmdReplyAll")
		public WebElement uIReplyAllButton;
	}

	public class BOLOMessageReceivedScreen {
		public WebDriver driver;

		public BOLOMessageReceivedScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "CddBoloStatus_DropDown")
		public WebElement uIBoloStatusComboBox;

		@FindBy(how = How.ID, using = "cmdUpdate")
		public WebElement uIUpdateButton;

		@FindBy(how = How.ID, using = "cmdCancel")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "txtMessages")
		public WebElement uIMessageEdit;

		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;
	}

	public class TextStatmentReport {
		public WebDriver driver;

		public TextStatmentReport() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "btnClearStartOver")
		public WebElement uIClearStartOverButton;

		@FindBy(how = How.ID, using = "btnOfficeUseOnly")
		public WebElement uIOfficeAccessOnlyButton;

		@FindBy(how = How.ID, using = "txtStmt")
		public WebElement uITextStatementEdit;

		@FindBy(how = How.ID, using = "imgStatementSign")
		public WebElement uISignHereButton;
	}

	public class SignatureScreen {
		public WebDriver driver;

		public SignatureScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdSign")
		public WebElement uISignButton;

		@FindBy(how = How.ID, using = "btnDraw") // Created by Abi
		public WebElement uIDrawButton;

		@FindBy(how = How.ID, using = "btnType")
		public WebElement uITypeButton;

		@FindBy(how = How.ID, using = "txttype")
		public WebElement uITypeTextEdit;

		@FindBy(how = How.ID, using = "signature-pad") // Created by Abi
		public WebElement uISignaturePadEdit;

		@FindBy(how = How.ID, using = "btnapply")
		public WebElement uIApplyButton;

		@FindBy(how = How.ID, using = "txtPassword")
		public WebElement uIPasswordEdit;

		@FindBy(how = How.ID, using = "btnshowSign_Pwd")
		public WebElement uIShowSignatureButton;

		@FindBy(how = How.XPATH, using = "//img[@id='PwdSign']")
		public WebElement uIViewSignatureArea;

		@FindBy(how = How.ID, using = "txtname")
		public WebElement uINameEdit;
	}

	public class PrintBatchScreen {

		public WebDriver driver;

		public PrintBatchScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdFrmBatchPrint")
		public WebElement uIPrintBatchTable;

		@FindBy(how = How.ID, using = "cmdbatchprint")
		public WebElement uIPrintBatchButton;

		@FindBy(how = How.XPATH, using = "//div[@id = 'RadContextMenu1_detached']//span[contains(text(),'Individual Report')]")
		public WebElement uIIndividualReportButton;

	}

	public class PhoneBookEntry {
		public WebDriver driver;

		public PhoneBookEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtBookName")
		public WebElement uIBookNameEdit;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.ID, using = "grdAssignments")
		public WebElement uIPhoneBookEntryTable;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "chkGlobal")
		public WebElement uIGlobalCheckBox;

		@FindBy(how = How.ID, using = "chkdtlBilling")
		public WebElement uIDetailBillingCheckBox;
	}

	public class MyDashBoard {
		public WebDriver driver;

		public MyDashBoard() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Live CAD Police')]")
		public WebElement uILiveCADPoliceTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Live CAD Fire')]")
		public WebElement uILiveCADFireTab;

	}

	public class PrintEmailScreen {
		public WebDriver driver;

		public PrintEmailScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtfromemail")
		public WebElement uIFromMainEdit;

		@FindBy(how = How.ID, using = "txtMessage")
		public WebElement uIMessageEdit;

		@FindBy(how = How.ID, using = "cmdSendEmail")
		public WebElement uISendEmailButton;

		@FindBy(how = How.ID, using = "txtsubject")
		public WebElement uISubjectEdit;

		@FindBy(how = How.ID, using = "cmdcancel")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "btnOK")
		public WebElement uIDoneButton;

		@FindBy(how = How.ID, using = "txttomail")
		public WebElement uIToEdit;

		@FindBy(how = How.ID, using = "txtfromemail")
		public WebElement uIFromEdit;

		@FindBy(how = How.XPATH, using = "//div[@id='divParameter']//input[@id='dttmExpireDate_KPIDttmCtrl']")
		public WebElement uIExpiredDate;

		@FindBy(how = How.XPATH, using = "dttmEffectiveDate_KPIDttmCtrl")
		public WebElement uIEffectiveDate;

	}

	public class MultiFilesAttachments {
		public WebDriver driver;

		public MultiFilesAttachments() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "AjaxFileUpload1_SelectFileContainer")
		public WebElement uIBrowseButton;

		@FindBy(how = How.ID, using = "AjaxFileUpload1_UploadOrCancelButton")
		public WebElement uIUploadButton;

		@FindBy(how = How.ID, using = "btn_Close")
		public WebElement uICloseButton;

		@FindBy(how = How.ID, using = "lblerrstatus")
		public WebElement uIUnableLocateMsg;

	}

	public class NotificationSearch {

		public WebDriver driver;

		public NotificationSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdNotifySrch")
		public WebElement uINotificationSearchResultTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Update')]")
		public WebElement uIUpdateButton;

	}

	public class PaymentMethodScreen {
		public WebDriver driver;

		public PaymentMethodScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddTxnType_DropDown")
		public WebElement uITypeComboBox;

		@FindBy(how = How.ID, using = "txtAccountNo")
		public WebElement uICreditCardNoCodeEdit;

		@FindBy(how = How.ID, using = "txtHolderName")
		public WebElement uIHolderNameCodeEdit;

		@FindBy(how = How.ID, using = "txtExpMonth_DropDown")
		public WebElement uIExpirationMonthComboBox;

		@FindBy(how = How.ID, using = "txtExpYear")
		public WebElement uIExpirationYearComboBox;

		@FindBy(how = How.ID, using = "txtBankName")
		public WebElement uIBankCodeEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

	}

	public class WhiteBoard {
		public WebDriver driver;

		public WhiteBoard() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "//div[@id='Wtboard']")
		public WebElement uIWhiteBoardGrid;

		@FindBy(how = How.ID, using = "btnWBAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgMax")
		public WebElement uIMaximizeButton;

		@FindBy(how = How.XPATH, using = "//span[@id='lblCurTime']")
		public WebElement uIWhiteboardHeader;

	}

	public class ReportLog {
		public WebDriver driver;

		public ReportLog() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "dtStartDttm_Date_KPIDttmCtrl")
		public WebElement uIDateFromEdit;

		@FindBy(how = How.XPATH, using = "//table[@id='dtStartDttm_Time']//input")
		public WebElement uITimeFromEdit;

		@FindBy(how = How.ID, using = "ddlProduct")
		public WebElement uIProductDropDown;

		@FindBy(how = How.ID, using = "chkErrorlog")
		public WebElement uIIncludeErrorLogCheckBox;

		@FindBy(how = How.ID, using = "txtReportName")
		public WebElement uIReportNameEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uIJurisDropDown;

		@FindBy(how = How.ID, using = "updateGrid")
		public WebElement uIReportLogTable;

	}

	public class TrackSearch {
		public WebDriver driver;

		public TrackSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabTrackSrch_tmpl0_UsrBase1_lupOwner_CodeValue")
		public WebElement uIOwnerCodeEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdTrack")
		public WebElement uITrackSearchTable;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'AddNew')]")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reset')]")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "tabTrackSrch_tmpl0_UsrBase1_lupCustomer_CodeValue")
		public WebElement uIVendorEdit;

	}

	public class TrackEntry {
		public WebDriver driver;

		public TrackEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupCustomer_CodeValue")
		public WebElement uIVendorCodeEdit;

		@FindBy(how = How.ID, using = "txtSummary")
		public WebElement uISummaryCodeEdit;

		@FindBy(how = How.ID, using = "lstContact")
		public WebElement uIContactDropDown;

		@FindBy(how = How.ID, using = "cddTrackStatus_DropDown")
		public WebElement uIStatusDropDown;

		@FindBy(how = How.ID, using = "lupOwner_CodeValue")
		public WebElement uIOwnerCodeEdit;

		@FindBy(how = How.ID, using = "lupCustomer_imgBtn")
		public WebElement uIVendorSearchICon;

		@FindBy(how = How.ID, using = "lupOwner_imgBtn")
		public WebElement uIOwnerSearchICon;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "lupCustomer_cmdIncOnAddr")
		public WebElement uIVendorIBubble;

	}

	public class AttachmentsTab {
		public WebDriver driver;
		public AttachmentsCategoryPopup attachmentsCategoryPopup = null;

		public AttachmentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if (this.attachmentsCategoryPopup == null)
				this.attachmentsCategoryPopup = new AttachmentsCategoryPopup();
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdoGroupBy_0")
		public WebElement uICategoryRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdoGroupBy_1")
		public WebElement uIFolderRadioButton;

		@FindBy(how = How.XPATH, using = "//img[@title = 'Expand Row']")
		public WebElement uIExpandRowButton;

		@FindBy(how = How.XPATH, using = "//img[@title = 'Collapse Row']")
		public WebElement uICollapseRowButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cmdAddFile")
		public WebElement uIAddFilesButton;

		@FindBy(how = How.ID, using = "cmdCapture")
		public WebElement uICaptureButton;

		@FindBy(how = How.ID, using = "cmdscanner")
		public WebElement uIScannerButton;

		@FindBy(how = How.ID, using = "btnDrawing")
		public WebElement uIDrawingButton;

		@FindBy(how = How.ID, using = "KPIALCPermission")
		public WebElement uIKPIALCPermisstionButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_grdKPITxtAttach_ctl00")
		public WebElement uIAttachmentsTable;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cmdDownloadFiles")
		public WebElement uIDownloadSelectedFilesButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cmdMakePDF")
		public WebElement uICreateAsPDFButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_grdKPITxtAttach_ctl00_FOLDER_0")
		public WebElement uIAttachmentsFolderTable;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_ChkSelectAll")
		public WebElement uISelectAllCheckBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_grdKPITxtAttach_ctl00_Records_0")
		public WebElement uIRecordsFolderTable;

	}

	public class AttachmentsCategoryPopup {

		public WebDriver driver;

		public AttachmentsCategoryPopup() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_lblCategory")
		public WebElement uICategorylbl;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_lblLink")
		public WebElement uILinklbl;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cddCategory_DropDown")
		public WebElement uICategoryComboBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_txt_FolderName")
		public WebElement uIFolderNameEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_txtDescription")
		public WebElement uIRemarksEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnSingle")
		public WebElement uISingleFileRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnBulk")
		public WebElement uIBulkAttachmentRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnLink")
		public WebElement uILinkRadioButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_uploadfile")
		public WebElement uIFileEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_uploadfile")
		public WebElement uISelectButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cmdAddAttachment")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cmdCancelAttachment")
		public WebElement uICancelButton;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_txtLink")
		public WebElement uILinkEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_uploadfileTextBox0")
		public WebElement uIFileUploadEdit;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_ChkIsPrivate")
		public WebElement uIShowInCallDetailsCheckBox;

		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_rdbtnFolder")
		public WebElement uIFolderRadioButton;

		@FindBy(how = How.ID, using = "upload")
		public WebElement uIFolderAddButton;
		@FindBy(how = How.ID, using = "ctrlUsrKPITxtAttachment_cddDNDCategory_DropDown")
		public WebElement uIFolderCategoryCombobox;

	}

	public class ExpenseEntry {

		public ExpenseEntryItemsTab expenseEntryItemsTab;
//        public ExpenseEntryAttachmentTab expenseEntryAttachmentTab; 
		public ExpenseEntryApprovalTab expenseEntryApprovalTab;

		public WebDriver driver;

		public ExpenseEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			if ((this.expenseEntryItemsTab == null)) {
				this.expenseEntryItemsTab = new ExpenseEntryItemsTab();
			}

//            if ((this.expenseEntryAttachmentTab == null)) {
//                this.expenseEntryAttachmentTab = new ExpenseEntryAttachmentTab();
//            }

			if ((this.expenseEntryApprovalTab == null)) {
				this.expenseEntryApprovalTab = new ExpenseEntryApprovalTab();
			}
		}

		@FindBy(how = How.ID, using = "cddExpClass_DropDown")
		public WebElement uIExpenseClassEdit;

		@FindBy(how = How.ID, using = "cddCategory_DropDown")
		public WebElement uICategoryDropDown;

		@FindBy(how = How.ID, using = "lupPF_CodeValue")
		public WebElement uIPFEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Items')]")
		public WebElement uIItemsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachment')]")
		public WebElement uIAttachmentTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Approval')]")
		public WebElement uIApprovalTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIRefreshButton;

		public class ExpenseEntryItemsTab {
			public WebDriver driver;

			public ExpenseEntryItemsTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_dtExpense_KPIDttmCtrl")
			public WebElement uIDateEdit;

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_cddItemCategory_DropDown")
			public WebElement uIExpenseItemCategoryDropDown;

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_txtDesc")
			public WebElement uIDescriptionEdit;

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_txtCost")
			public WebElement uICostEdit;

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_cddPaidMtd_DropDown")
			public WebElement uIPaidMethodDropDown;

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_imgAdd")
			public WebElement uIAddButton;

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_imgClear")
			public WebElement uIClearButton;

			@FindBy(how = How.ID, using = "tabExpenses_tmpl0_usrExpenses1_grdExpenses")
			public WebElement uIItemsResultTable;

		}

		public class ExpenseEntryApprovalTab {
			public WebDriver driver;

			public ExpenseEntryApprovalTab() {
				driver = Playback.driver;
				PageFactory.initElements(driver, this);
			}

			@FindBy(how = How.ID, using = "lstStatus")
			public WebElement uINewActionDropdown;

			@FindBy(how = How.ID, using = "lupPFID_CodeValue")
			public WebElement uIByCodeEdit;

			@FindBy(how = How.ID, using = "dttStatusDttm_Date_KPIDttmCtrl")
			public WebElement uIDateEdit;

			@FindBy(how = How.XPATH, using = "//table[@id = 'dttStatusDttm_Time']//input[@class='textboxdatetime igte_BlueThemeEditInContainer']")
			public WebElement uITimeEdit;

			@FindBy(how = How.ID, using = "cddDivision_DropDown")
			public WebElement uIDivisionDropdown;

			@FindBy(how = How.ID, using = "cddSection_DropDown")
			public WebElement uISectionDropdown;

			@FindBy(how = How.ID, using = "cmdSave")
			public WebElement uISaveButton;

			@FindBy(how = How.ID, using = "cmdReset")
			public WebElement uIResetButton;

		}

	}
	public class MobileDeviceOTPScreen{
		public WebDriver driver;
		
		public MobileDeviceOTPScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(how=How.XPATH,using="//input[@id='txtPhone']")
		public WebElement uITextPhoneEdit;
		
		@FindBy(how = How.ID, using = "btnSend")
		public WebElement uISendLinkToMobileButton;
		
		@FindBy(how = How.XPATH, using = "//input[@id='btnCancel']")
		public WebElement uICancelButton;
		
		@FindBy(how = How.ID, using = "lblAuthCode")
		public WebElement uIAuthenticationCode;
		
	}


}
