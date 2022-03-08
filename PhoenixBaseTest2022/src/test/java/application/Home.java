package application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import dataAccess.BaseData;

import uIMaps.UIMapActivity;
import uIMaps.UIMapHome;
import uIMaps.UIMapLogin;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Home {

	ObjectIdentification objectIdentification = new ObjectIdentification();
	Randomized randomized = new Randomized();
	UIMapHome uIMapHome = new UIMapHome();
	Popup popup = new Popup();
	Popup.Confirm confirm = popup.new Confirm();
	Popup.Acknowledge acknowledge = popup.new Acknowledge();
	UIMapPopup uIMapPopup = new UIMapPopup();
	UIMapLogin uIMapLogin = new UIMapLogin();
	UIMapActivity uIMapActivity = new UIMapActivity();

	public Home() {
		if (myHome == null)
			myHome = new MyHome();
		if (messageSearch == null)
			messageSearch = new MessageSearch();
		if (textMgmt == null)
			textMgmt = new TextMgmt();
		if (manageNotes == null)
			manageNotes = new ManageNotes();
		if (selectReport == null)
			selectReport = new SelectReport();
		if (pnxReportSSRSPDFScreen == null)
			pnxReportSSRSPDFScreen = new PnxReportSSRSPDFScreen();
		if (pnxReportCrystalPDFScreen == null)
			pnxReportCrystalPDFScreen = new PnxReportCrystalPDFScreen();
		if (allImagesScreen == null)
			allImagesScreen = new AllImagesScreen();
		if (manageComments == null)
			manageComments = new ManageComments();
		if (updateImageScreen == null)
			updateImageScreen = new UpdateImageScreen();
		if (imageFullViewScreen == null)
			imageFullViewScreen = new ImageFullViewScreen();
		if (viewPrintStatusScreen == null)
			viewPrintStatusScreen = new ViewPrintStatusScreen();
		if (attachment == null)
			attachment = new Attachment();
		if (getAttachment == null)
			getAttachment = new GetAttachment();
		if (phoneBookSearch == null)
			phoneBookSearch = new PhoneBookSearch();
		if (phoneBookContactEntry == null)
			phoneBookContactEntry = new PhoneBookContactEntry();
		if (manageLinks == null)
			manageLinks = new ManageLinks();
		if (aLCScreen == null)
			aLCScreen = new ALCScreen();
		if (globalMapScreen == null)
			globalMapScreen = new GlobalMapScreen();
		if (viewPrintHistory == null)
			viewPrintHistory = new ViewPrintHistory();
		if (notification == null)
			notification = new Notification();
		if (bulletinEntry == null)
			bulletinEntry = new BulletinEntry();
		if (messageSendScreen == null)
			messageSendScreen = new MessageSendScreen();
		if (addMultiplePF == null)
			addMultiplePF = new AddMultiplePF();
		if (messageReceivedScreen == null)
			messageReceivedScreen = new MessageReceivedScreen();
		if (bOLOMessageReceivedScreen == null)
			bOLOMessageReceivedScreen = new BOLOMessageReceivedScreen();
		if (textStatmentReport == null)
			textStatmentReport = new TextStatmentReport();
		if (signatureScreen == null)
			signatureScreen = new SignatureScreen();
		if (textSearch == null)
			textSearch = new TextSearch();
		if (printBatchScreen == null)
			printBatchScreen = new PrintBatchScreen();
		if (pnxCustomReportPDFScreen == null)
			pnxCustomReportPDFScreen = new PnxCustomReportPDFScreen();
		if (phoneBookEntry == null)
			phoneBookEntry = new PhoneBookEntry();
		if (myDashBoard == null)
			myDashBoard = new MyDashBoard();
		if (printEmailScreen == null)
			printEmailScreen = new PrintEmailScreen();
		if (multiFilesAttachments == null)
			multiFilesAttachments = new MultiFilesAttachments();
		if (notificationSearch == null)
			notificationSearch = new NotificationSearch();
		if (whiteBoard == null)
			whiteBoard = new WhiteBoard();
		if (this.trackSearch == null)
			this.trackSearch = new TrackSearch();
		if (this.trackEntry == null)
			this.trackEntry = new TrackEntry();
		if (reportLog == null)
			reportLog = new ReportLog();
		if (expenseEntry == null)
			expenseEntry = new ExpenseEntry();
		if (kPITempPDFScreen == null)
			kPITempPDFScreen = new KPITempPDFScreen();
		
		if (mobileDeviceOTPScreen == null)
			mobileDeviceOTPScreen = new MobileDeviceOTPScreen();
		
		

		if (mobileDeviceOTPScreen == null)
			mobileDeviceOTPScreen = new MobileDeviceOTPScreen();

	}

	public MyHome myHome = null;
	public MessageSearch messageSearch = null;
	public TextMgmt textMgmt = null;
	public ManageNotes manageNotes = null;
	public SelectReport selectReport = null;
	public PnxReportSSRSPDFScreen pnxReportSSRSPDFScreen = null;
	public PnxReportCrystalPDFScreen pnxReportCrystalPDFScreen = null;
	public AllImagesScreen allImagesScreen = null;
	public ManageComments manageComments = null;
	public UpdateImageScreen updateImageScreen = null;
	public ImageFullViewScreen imageFullViewScreen = null;
	public ViewPrintStatusScreen viewPrintStatusScreen = null;
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
	public KPITempPDFScreen kPITempPDFScreen = null;
	public MultiFilesAttachments multiFilesAttachments;
	public NotificationSearch notificationSearch;
	public WhiteBoard whiteBoard;
	public TrackSearch trackSearch;
	public TrackEntry trackEntry;
	public ReportLog reportLog;
	public ExpenseEntry expenseEntry;
	
	public MobileDeviceOTPScreen mobileDeviceOTPScreen;

	public void Reset() {
		uIMapHome = null;
		uIMapPopup = null;
	}

	public void switchToMessageSearch() {
		objectIdentification.windowHandle.switchToWindow("Message Search");
		Playback.controlReadyThreadWait();
	}

	public void switchToSelectReport() {
		objectIdentification.windowHandle.switchToWindow("Select Report");
	}

	public void switchToPnxReportSSRSPDFScreen() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("frmPnxSQLRpt");
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
	}

	public void switchToPnxReportCrystalPDFScreen() {
		objectIdentification.windowHandle.switchToWindow("frmPnxRpt");
	}

	public void switchToPnxCustomReportPDFScreen() {
		objectIdentification.windowHandle.switchToWindow("frmPnxRpt");
	}

	public void switchToGlobalMapScreen() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("frmGlobalMap");
	}

	public void switchToAllImageScreen() {
		Playback.gridLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("Home/frmAllImages");
	}
	public void switchToAllImageScreen1() {
		Playback.gridLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingURL("Home/frmAllImages");
	}

	public void switchToImageEditorScreen() {
		objectIdentification.windowHandle.switchToWindow("frmImageEditor");
	}

	public void switchToManageCommentsScreen() {
		objectIdentification.windowHandle.switchToWindow("Manage Comments - 1033");
	}

	public void switchToGunPermitManageCommentsScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmManageComments");
		Playback.controlReadyThreadWait();
	}

	public void switchToManageNotesScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmManageNotes");
		Playback.controlReadyThreadWait();
	}

	public void switchToAttachmentScreen() {
		objectIdentification.windowHandle.switchToWindow("Attachment");

	}

	public void switchToGetAttachmentScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmGetAttachment");

	}

	public void switchToUpdateImageScreen() {
		objectIdentification.windowHandle.switchToWindow("frmUpdateImg.aspx");
	}

	public void switchToTextSearchScreen() {
		objectIdentification.windowHandle.switchToWindow("frmTextSrch");
	}

	public void switchToFullImageViewScreen() {
		objectIdentification.windowHandle.switchToWindow("frmViewFullImage.aspx");
	}

	public void switchToMyHomeScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Home/frmMyHome");
		Playback.controlReadyThreadWait();
	}

	public void switchToExpenseEntry() {
		objectIdentification.windowHandle.switchToWindow("Expense Entry");
	}

	public void switchToALCScreen() {
		objectIdentification.windowHandle.switchToWindow("Access List Control (ALC)");
	}

	public void switchToPhoneBookSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Home/frmGlbContactSrch");

	}

	public void switchToPhoneBookContactEntry() {
		objectIdentification.windowHandle.switchToWindow("Contact Entry");

	}

	public void switchToTextMgmtScreen() {
		objectIdentification.windowHandle.switchToWindow("Text Mgmt");
		Playback.gridLoadThreadWait();
	}

	public void switchToViewPrintHistoryScreen() {

		objectIdentification.windowHandle.switchToWindow("frmViewPrintHist");
	}

	public void switchToNotificationScreen() {
		objectIdentification.windowHandle.switchToWindow("Notification");
	}

	public void switchToBulletinEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Bulletin Entry");
	}

	public void switchToReportStatusTextMgmtScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmTextMgrEx");
		Playback.gridLoadThreadWait();
	}

	public void switchToReportAttachmentScreen() {
		objectIdentification.windowHandle.switchToWindow("Report Attachment");

	}

	public void switchToActivitySearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Activity/frmActivityLogInquiry");
	}

	public void switchToActivityEntry() {
		objectIdentification.windowHandle.switchToWindow("Activity Entry");

	}

	public void switchToReportLog() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("Report Log");

	}

	public void switchToPrintBatchScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmPrintBatch_Id");
	}

	public void switchToMessageSend() {
		objectIdentification.windowHandle.switchToWindow("frmChatMsgSend");
	}

	public void switchToAddMultiplePFScreen() {
		objectIdentification.windowHandle.switchToWindow("frmAddMultiPF");
	}

	public void switchToMessageReceivedScreen() {
		objectIdentification.windowHandle.switchToWindow("frmChatMsgReceived");
	}

	public void switchToBoloMessageReceivedScreen() {
		objectIdentification.windowHandle.switchToWindow("frmBoloMsgReceived");
	}

	public void switchToTextStatmentReportScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmTextStmtRpt");
		Playback.controlReadyThreadWait();
	}

	public void switchToSignatureScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmSignature");
		Playback.controlReadyThreadWait();
	}

	public void switchToViewPrintStatusScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmViewPrintStatus.aspx");
		Playback.controlReadyThreadWait();
	}

	public void switchToPhoneBookEntry() {
		objectIdentification.windowHandle.switchToWindow("PhoneBook Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToMyDashBoard() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPropAuditSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToPrintEmailScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPrintEmailRpt.aspx");
		Playback.controlReadyThreadWait();
	}

	public void switchToPermitPrintScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("Fire/KPITemp");
		Playback.controlReadyThreadWait();
	}

	public void switchToMultiFilesAttachment() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmMultiFilesAttach");
	}

	public void switchToKPITempPDFScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("KPITemp");
		System.out.println("Switched");

	}

	public void switchToNotificationSearch() {

		objectIdentification.windowHandle.switchToFrame("Home/frmNotificationInquiry.aspx?");
	}

	public void switchToWhiteBoardWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmWhiteBoardDetails");
	}

	public void switchToTrackSearchScreenTab() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmCRMTrackSrch.aspx");
	}

	public void switchToTrackEntry() {
		objectIdentification.windowHandle.switchToWindow("Track Entry");
	}

	public void switchToMobileDeviceOTPScreen() {
		Playback.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objectIdentification.windowHandle.switchToWindowUsingURL("Home/frmePicture");
	}

	public class MyHome {

		public MyHome() {

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
			if (manageLinks == null)
				manageLinks = new ManageLinks();
			if (whiteBoard == null)
				whiteBoard = new WhiteBoard();
		}

		public MessageTab messageTab;
		public MyRemindersTab myRemindersTab;
		public MyReportsTab myReportsTab;
		public MyTrainingTab myTrainingTab;
		public MyApprovalTab myApprovalTab;
		public MyCMTab myCMTab;
		public ManageLinks manageLinks;
		public WhiteBoard whiteBoard;

		public void SwitchToMyHomeScreen() {

			objectIdentification.windowHandle.switchToMainWindowScreenTab("MyHome");
		}

		public void SwitchToMessageSearch() {

			objectIdentification.windowHandle.switchToWindow("Message Search");
		}

		public void SwitchToSelectReport() {
			objectIdentification.windowHandle.switchToWindow("Select Report");
		}

		public void SwitchToPnxReportSSRSPDFScreen() {
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindow("frmPnxSQLRpt");
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void SwitchToPnxReportCrystalPDFScreen() {
			objectIdentification.windowHandle.switchToWindow("frmPnxRpt");
		}

		public void SwitchToAllImageScreen() {
			objectIdentification.windowHandle.switchToWindow("frmAllImages.aspx");
		}

		public void SwitchToImageEditorScreen() {
			objectIdentification.windowHandle.switchToWindow("frmImageEditor");
		}

		public void SwitchToManageCommentsScreen() {
			objectIdentification.windowHandle.switchToWindow("Manage Comments - 1033");
		}

		public void SwitchToGunPermitManageCommentsScreen() {
			objectIdentification.windowHandle.switchToWindow("frmManageComments");
		}

		public void SwitchToAttachmentScreen() {
			objectIdentification.windowHandle.switchToWindow("Attachment");

		}

		public void SwitchToGetAttachmentScreen() {
			objectIdentification.windowHandle.switchToWindowUsingURL("frmGetAttachment");

		}

		public void SwitchToUpdateImageScreen() {
			objectIdentification.windowHandle.switchToWindow("frmUpdateImg.aspx");
		}

		public void SwitchToMainWindow() {
			objectIdentification.windowHandle.switchToMainWindowScreenTab("MyHome");
		}

		public void SwitchToALCScreen() {
			objectIdentification.windowHandle.switchToWindow("Access List Control (ALC)");
		}

		public void SwitchToGlobalMapScreen() {
			objectIdentification.windowHandle.switchToWindow("frmGlobalMap");
			Playback.gridLoadThreadWait();
		}

		public void SwitchToMessageTab() {
			uIMapHome.myHome.uIMessageTab.click();
		}

		public void SwitchToMessageBulletinTab() {
			uIMapHome.myHome.uIMessageBulletinTab.click();
		}

		public void SwitchToMyRemindersTab() {
			Playback.controlReadyThreadWait();
			uIMapHome.myHome.uIMyReminderTab.click();
			objectIdentification.windowHandle.switchToFrame("frmMyReminders");
			Playback.controlReadyThreadWait();
		}

		public void SwitchToMyReportsTab() {
			Playback.controlReadyThreadWait();
			uIMapHome.myHome.uIMyReportsTab.click();
			// objectIdentification.windowHandle.switchToFrame("frmRptStatusINQ");
			objectIdentification.windowHandle.switchToFrame("frmRptApproval");
			Playback.controlReadyThreadWait();

		}

		public void SwitchToManageLinks() {
			objectIdentification.windowHandle.switchToWindow("Manage Links");
			Playback.controlReadyThreadWait();
		}

		public void SwitchToMyTrainingTab() {
			uIMapHome.myHome.uIMyTrainingTab.click();
			objectIdentification.windowHandle.switchToFrame("frmPFTrainingHome");

		}

		public void SwitchToMyApprovalTab() {
			uIMapHome.myHome.uIMyApprovalTab.click();
			objectIdentification.windowHandle.switchToFrame("frmApprovalStatusINQ");
		}

		public void SwitchToMyCMTab() {
			uIMapHome.myHome.uIMyCMTab.click();
			objectIdentification.windowHandle.switchToFrame("frmMyCM");
		}

		public void ClickAddLinkButton() {
			uIMapHome.myHome.uIAddLinkButton.click();
		}

		public void ReloadMyHomeScreen() {
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("My Home", "Reload Tab");
			// Playback.driver.SwitchTo().Alert().Accept();
		}

		public void ClickCallEntryLink() {
			Playback.pageLoadThreadWait();
			uIMapHome.myHome.uILinkName.click();
		}

		public void SwitchToMyReportApprovalTab() {
			Playback.controlReadyThreadWait();
			uIMapHome.myHome.uIMyReportsApprovalTab.click();
			// objectIdentification.windowHandle.switchToFrame("frmRptStatusINQ");
			objectIdentification.windowHandle.switchToFrame("frmRptApproval");
			Playback.controlReadyThreadWait();
		}

		public void ClickPoliceOfficeRoleTabsEnabled() {
			uIMapHome.myHome.uIMessageTab.click();
			uIMapHome.myHome.uIMyReminderTab.click();
			uIMapHome.myHome.uIMyReportsApprovalTab.click();
			uIMapHome.myHome.uIMyTrainingTab.click();
			uIMapHome.myHome.uIMyCMTab.click();
			uIMapHome.myHome.uIMyInfoTab.click();

		}

		public void refreshWhiteBoardScreen() {
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_R);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);

		}

		public void switchToWhiteBoardWindow() {
			objectIdentification.windowHandle.switchToWindowUsingURL("frmWhiteBoardDetails");
		}

		public void verifyPoliceOfficeRoleTabsEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.uIMessageTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapHome.myHome.uIMyReminderTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapHome.myHome.uIMyReportsApprovalTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapHome.myHome.uIMyTrainingTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapHome.myHome.uIMyCMTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapHome.myHome.uIMyInfoTab.isEnabled());

		}

		public void verifyNoOfTabsEnabledForUserIs(int tabNo) {
			List<WebElement> tabs = Playback.driver.findElements(By.xpath(
					"//span[contains(@class,'igtab_BlueThemeTH')]//span[contains(@class,'igtab_BlueThemeTHText')]"));
			int count = 0;
			for (WebElement tab : tabs) {
				if (tab.isDisplayed()) {
					count++;
				}
			}
			verify.ExpectedIntergerValueIsEqualToActual(tabNo, count);
		}

	}

	public class MessageTab {
		public void VerifyMessageBulletinTable() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.messageTab.uIMessageTable1TextView.getText()
					.contains("You have been assigned a Task related to Invest #17-000002, Case# 17-000007."));
		}

		public void VerifyMessageBulletinPrimeInvest() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.messageTab.uIMessageTable1TextView.getText()
					.contains("Prime Investigator changed for Investigation# 17-000006, Case# 17-000016"));
		}

		public void ClickBulletinAddNew() {
			uIMapHome.myHome.messageTab.uIBulletinAddNewButton.click();
		}

		public void ClickBulletinRefreshButton() {
			uIMapHome.myHome.messageTab.uIBulletinRefreshButton.click();
		}

		public void ClickMessageAddNew() {
			uIMapHome.myHome.messageTab.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickMessageSearch() {
			uIMapHome.myHome.messageTab.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickMessageRefresh() {
			uIMapHome.myHome.messageTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtMessageInFirstMessageGrid() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.messageTab.uIMessageTable1TextView.getText()
					.contains(BaseData.getHomeModuleValue("Message")));
		}

		public void ClickFirstMessageRow() {
			uIMapHome.myHome.messageTab.uIMessageTable1TextView.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtMessageBulletinPrimeInvestigator() {
			String value = uIMapHome.myHome.messageTab.uIMessageTable1TextView.getText();
			System.out.println(value);
			verify.ExpectedValueIsTrue(uIMapHome.myHome.messageTab.uIMessageTable1TextView.getText()
					.contains("Prime Investigator changed for Investigation#" + "Case#"
							+ BaseData.getHomeModuleValue("CaseNo")
							+ BaseData.getHomeModuleValue("PrimeInvestigatorPF")));
		}

		public void VerifyAtMessageBulletinOfficerDescription() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.messageTab.uIMessageTable1TextView.getText()
					.contains("Prime Investigator changed for Investigation#" + "Case#"
							+ BaseData.getHomeModuleValue("CaseNo")
							+ BaseData.getHomeModuleValue("OfficeDescription")));
		}
	}

	public class MyRemindersTab {

		public void ClickRefreshButton() {
			uIMapHome.myHome.myRemindersTab.uIRefreshButton.click();
		}

		public void ClickExpandAllCheckBox() {
			uIMapHome.myHome.myRemindersTab.uIExpandAllCheckBox.click();
		}

		public void ClickMyActivitiesAccordion() {
			uIMapHome.myHome.myRemindersTab.uIMyActivitiesAccordion.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickTrainingAccordion() {
			uIMapHome.myHome.myRemindersTab.uITrainingAccordion.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickCertificationAccordion() {
			uIMapHome.myHome.myRemindersTab.uICertificationAccordion.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAddressFlags_P_Accordion() {
			uIMapHome.myHome.myRemindersTab.uIAddressFlags_P_Accordion.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtAddressInAddressFlagsP() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Address"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myRemindersTab.uIAddressFlagsPResultGrid,
									BaseData.getGeoModuleValue("Address"))
							.getText());

		}

		public void VerifyCertificationAsSeleniumCertification(int rowIndex) {
			String uICertification = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uICertificationResultGrid, "Certification", rowIndex);
			verify.ExpectedValueIsTrue(uICertification.contains("Selenium Certification"));

		}

		public void VerifyRecertifyByAsFeatureDate(int rowIndex) {
			String uIRecertify = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uICertificationResultGrid, "Recertify-By", rowIndex);
			verify.ExpectedPropertyValueIsEqual(uIRecertify, Randomized.getFutureDate(1, "MM/dd/yy"));

		}

		public void VerifyPFNameAsPatrolOfficer(int rowIndex) {
			String uIPatrolOfficer = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uITrainingResultGrid, "PF Name", rowIndex)
					.replace(",", "");
			verify.ExpectedValueIsTrue(uIPatrolOfficer.contains("Patrol Officer"));
		}

		public void VerifyTitleAsSeleniumAutomationTraining(int rowIndex) {
			String uITitle = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uITrainingResultGrid, "Title", rowIndex);
			verify.ExpectedValueIsTrue(uITitle.contains("Selenium Automation Training"));

		}

		public void VerifyRequalifyByAsFeatureDate(int rowIndex) {
			String uIRecertify = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uITrainingResultGrid, "Re-qualify By", rowIndex);
			verify.ExpectedPropertyValueIsEqual(uIRecertify, Randomized.getFutureDate(1, "MM/dd/yy"));

		}

		public void ClickCaseManagementAccordion() {
			uIMapHome.myHome.myRemindersTab.uICaseManagementAccordation.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickPropertyAccordion() {

			uIMapHome.myHome.myRemindersTab.uIPropertyAccordation.click();
		}

		public void ClickJobGradeReviewAccordion() {

			uIMapHome.myHome.myRemindersTab.uIJobGradeReviewAccordation.click();
		}

		public void ClickPerformanceReviewAccordation() {

			uIMapHome.myHome.myRemindersTab.uIPerformanceReviewAccordation.click();
		}

		public void ClickFleetAccordation() {

			uIMapHome.myHome.myRemindersTab.uIFleetAccordation.click();
		}

		public void ClickInventoryAccordation() {

			uIMapHome.myHome.myRemindersTab.uIInventoryAccordation.click();
		}

		public void VerifyCaseAtCaseInCM() {
			List<String> Case = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myRemindersTab.uICaseManagementTable, "Case#");
			verify.ExpectedValueIsTrue(Case.contains(BaseData.getHomeModuleValue("CaseNo")));
		}

		public void VerifyCaseAtCaseInProperty() {
			List<String> Case = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myRemindersTab.uIPropertyTable, "Case#");
			verify.ExpectedValueIsTrue(Case.contains(BaseData.getHomeModuleValue("CaseNo")));
		}

		public void VerifyAtFleetId() {
			WebElement uIFleetRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIFleetTable, BaseData.getHomeModuleValue("FleetID"));
			verify.ExpectedValueIsTrue(uIFleetRow.getText().contains(BaseData.getHomeModuleValue("FleetID")));

		}

		public void VerifyAtFleetIdNotAppearInGrid() {
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual("No Data To Display",
					uIMapHome.myHome.myRemindersTab.uIFleetNoDataDisplayText.getText());

		}

		public void VerifyDueOneMonthFutureDateFromCurrentDate() {

			WebElement uIFleetRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIFleetTable, BaseData.getHomeModuleValue("FleetID"));
			WebElement FleetDue = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIFleetTable, uIFleetRow, "Due");

			String futureDate = Randomized.getFutureDateByMonth(1, "MM/dd/yy");
			verify.ExpectedPropertyValueIsEqual(futureDate, FleetDue.getText());

		}

		public void SelectRowByAtFleetId() {
			WebElement uIFleetRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIFleetTable, BaseData.getHomeModuleValue("FleetID"));
			uIFleetRow.click();
		}

		public void VerifyGridRowStatusOpenByCaseId() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uICaseManagementTable, BaseData.getHomeModuleValue("CaseNo"));
			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uICaseManagementTable, uICaseRow, "Status");
			verify.ExpectedValueIsTrue(status.getText().contains("Open"));

		}

		public void VerifyReportDueAs7thDayFromCurrentDate() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uICaseManagementTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement ReportDue = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uICaseManagementTable, uICaseRow, "Rpt Due");
			verify.ExpectedValueIsTrue(ReportDue.getText().contains(Randomized.getFutureDate(7, "MM/dd/yy")));

		}

		public void SelectInquiryTypeAsReviewDue() {

			uIMapHome.myHome.myRemindersTab.uICMReviewDueRadioButton.click();
		}

		public void VerifyReviewDueAs7thDayFromCurrentDate() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uICaseManagementTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement ReviewDue = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uICaseManagementTable, uICaseRow, "Rev Due");
			verify.ExpectedValueIsTrue(ReviewDue.getText().contains(Randomized.getFutureDate(7, "MM/dd/yy")));

		}

		public void SelectInquiryTypeAsNewAssignments() {

			uIMapHome.myHome.myRemindersTab.uICMNewAssignmentsRadioButton.click();

		}

		public void VerifyAssignedDateAsCurrentDate() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uICaseManagementTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement AssignDate = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uICaseManagementTable, uICaseRow, "Assigned Date");
			verify.ExpectedValueIsTrue(AssignDate.getText().contains(Randomized.getCurrentDate()));

		}

		public void VerifyEvidenceExistInTheReasonColumn() {

			List<String> uICaseRow = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myRemindersTab.uIPropertyTable, "Reason");
			verify.ExpectedValueIsTrue(uICaseRow.contains("Evidence"));

		}

		public void VerifyCyclesExistsInTheDescriptionColumn() {
			List<String> uICaseRow = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myRemindersTab.uIPropertyTable, "Description");
			verify.ExpectedValueIsTrue(uICaseRow.contains("Cycles"));

		}

		public void VerifyFollowUpDateAs5thDayFromCurrentDate() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPropertyTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement FollowUpDate = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIPropertyTable, uICaseRow, "Follow-Up Date");
			verify.ExpectedValueIsTrue(FollowUpDate.getText().contains(Randomized.getFutureDate(5, "MM/dd/yy")));

		}

		public void VerifyExpirationDateAsOneDayFutureFromCurrentDateByAtInventoryNo() {

			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIInventoryTable, BaseData.getHomeModuleValue("InventoryNo"));

			WebElement expireDate = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIInventoryTable, row, "Expired Date");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(1, "MM/dd/yy"), expireDate.getText());

		}

		public void SelectRowAtCase() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPropertyTable, BaseData.getHomeModuleValue("CaseNo"));

		}

		public void VerifyAtInventoryNo() {
			WebElement uIInventoryRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIInventoryTable, BaseData.getHomeModuleValue("InventoryNo"));
			verify.ExpectedValueIsTrue(uIInventoryRow.getText().contains(BaseData.getHomeModuleValue("InventoryNo")));

		}

		public void VerifyItemTypeAsDesktopComputerByAtInventoryNo() {

			WebElement uIInventoryRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIInventoryTable, BaseData.getHomeModuleValue("InventoryNo"));

			WebElement ItemType = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIInventoryTable, uIInventoryRow, "Item Type");
			verify.ExpectedPropertyValueIsEqual("Desktop Computer", ItemType.getText());

		}

		public void VerifyItemDescriptionAsComputerPartsByAtInventoryNo() {

			WebElement uIInventoryRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIInventoryTable, BaseData.getHomeModuleValue("InventoryNo"));

			WebElement ItemDescription = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIInventoryTable, uIInventoryRow, "Item Description");
			verify.ExpectedPropertyValueIsEqual("Computer Parts", ItemDescription.getText());

		}

		public void SelectRowAtInventoryNo() {
			WebElement uIInventoryRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIInventoryTable, BaseData.getHomeModuleValue("InventoryNo"));
			uIInventoryRow.click();
		}

		public void VerifyInventoryAtInventoryNotAppearInGrid() {

			verify.ExpectedPropertyValueIsEqual("No Data To Display",
					uIMapHome.myHome.myRemindersTab.uIInventoryNoDataDisplayText.getText());
		}

		public void VerifyAtInventoryNoNotAppearInGrid() {
			List<WebElement> Allelements = Playback.driver.findElements(By.xpath("//div[@id='accordion']//h3"));
			for (WebElement element : Allelements) {
				String text = element.getText();
				verify.ExpectedValueIsFalse(text.contains("Inventory"));
			}
		}

		public void VerifyCaseAtCaseNotAppearInGrid() {

			verify.ExpectedValueIsTrue(uIMapHome.myHome.myRemindersTab.uIPropertyNoDataDisplayText.isDisplayed());
		}

		public void VerifyLastDateInRedColor() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.myRemindersTab.uIInventoryLastDueText.isDisplayed());

		}

		public void VerifyPFCodeAtPFCode() {
			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIJobGradeTable, BaseData.getHomeModuleValue("PFCode"));
			verify.ExpectedValueIsTrue(uIPFRow.getText().contains(BaseData.getHomeModuleValue("PFCode")));

		}

		public void VerifyRankAsDetectiveByAtPFCode() {

			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIJobGradeTable, BaseData.getHomeModuleValue("PFCode"));

			WebElement Rank = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIJobGradeTable, uIPFRow, "Rank");
			verify.ExpectedValueIsTrue(Rank.getText().contains("Detective"));

		}

		public void VerifyBadgeNoAs100ByAtPFCode() {

			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIJobGradeTable, BaseData.getHomeModuleValue("PFCode"));

			WebElement BadgeNo = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIJobGradeTable, uIPFRow, "BadgeNo");
			verify.ExpectedValueIsTrue(BadgeNo.getText().contains("100"));

		}

		public void VerifyJobGradeAsJobGrade1ByAtPFCode() {

			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIJobGradeTable, BaseData.getHomeModuleValue("PFCode"));

			WebElement JobGrade = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIJobGradeTable, uIPFRow, "Job Grade");
			verify.ExpectedValueIsTrue(JobGrade.getText().contains("Job Grade 1"));

		}

		public void VerifyNextReviewDateAsCurrentDateByAtPFCode() {

			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIJobGradeTable, BaseData.getHomeModuleValue("PFCode"));

			WebElement NextReviewDate = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIJobGradeTable, uIPFRow, "Next Review Date");
			verify.ExpectedValueIsTrue(NextReviewDate.getText().contains(Randomized.getCurrentDate()));

		}

		public void SelectRowAtPFCode() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIJobGradeTable, BaseData.getHomeModuleValue("PFCode"));

		}

		public void VerifyPFCodeAtPFCodeInPerformanceRev(int rowIndex) {
			Playback.controlReadyThreadWait();
			WebElement uIPFRow = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, "PF Code", rowIndex);
			verify.ExpectedValueIsTrue(uIPFRow.getText().contains(BaseData.getHomeModuleValue("PFCode")));

		}

		public void VerifyBadgeAs100InPerformanceRevByAtPFCode() {

			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, BaseData.getHomeModuleValue("PFCode"));

			WebElement Badge = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, uIPFRow, "Badge");
			verify.ExpectedValueIsTrue(Badge.getText().contains("100"));

		}

		public void VerifyTitleAsDetectiveByAtPFCode() {

			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, BaseData.getHomeModuleValue("PFCode"));

			WebElement Title = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, uIPFRow, "Title");
			verify.ExpectedValueIsTrue(Title.getText().contains("Detective"));

		}

		public void VerifyNextReviewDateAs2DaysFutureFromCurrentDayByAtPFCode() {

			WebElement uIPFRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, BaseData.getHomeModuleValue("PFCode"));
			String tg = Randomized.getFutureDate(2, "MM/dd/yyyy");
			WebElement NextReviewDate = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, uIPFRow, "Next Review");
			verify.ExpectedValueIsTrue(NextReviewDate.getText().contains(Randomized.getFutureDate(2, "MM/dd/yy")));

		}

		public void SelectRowAtPFCodeInPerformanceRev() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPerformanceReviewTable, BaseData.getHomeModuleValue("PFCode"));

		}

		public void VerifyDateTimeAsCurrentDate(int rowIndex) {

			String DateTime = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Date Time", rowIndex);
			verify.ExpectedValueIsTrue(DateTime.contains(Randomized.getCurrentDate("MM/dd/YY")));
		}

		public void VerifyDateTimeAsCurrentDateinFirstRow() {

			String DateTime = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Date Time", 0);
			verify.ExpectedValueIsTrue(DateTime.contains(Randomized.getCurrentDate()));

		}

		public void VerifyStatusAsRequestToDo(int rowIndex) {

			String status = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Status", rowIndex);
			verify.ExpectedValueIsTrue(status.contains("Request/To-Do"));

		}

		public void VerifyStatusAsRequestToDo() {

			String status = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Status", 0);
			verify.ExpectedValueIsTrue(status.contains("Request/To-Do"));

		}

		public void VerifyStatusAsScheduledItem() {

			String status = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Status", 0);
			verify.ExpectedValueIsTrue(status.contains("Scheduled Item"));

		}

		public void VerifyStatusAsCompletedActivity() {

			String status = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Status", 0);
			verify.ExpectedValueIsTrue(status.contains("Completed Activity"));

		}

		public void VerifySubjectAsTesting(int rowIndex) {

			String subject = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Subject", rowIndex);
			verify.ExpectedValueIsTrue(subject.contains("Testing"));

		}

		public void VerifySubjectAsMaintenanceActivity() {

			String subject = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Subject", 0);
			verify.ExpectedValueIsTrue(subject.contains("Maintenance Activity"));

		}

		public void VerifySubjectNotAppearInGrid() {

			verify.ExpectedPropertyValueIsEqual("No Data To Display",
					uIMapHome.myHome.myRemindersTab.uIActivityNoDataDisplayText.getText());
		}

		public void ClickActivityRow(int rowIndex) {
			objectIdentification.manualIdentify.selectGridTableRow(uIMapHome.myHome.myRemindersTab.uIMyActivityTable,
					rowIndex);

		}

		public void ClickActivityRow() {
			objectIdentification.manualIdentify.selectGridTableRow(uIMapHome.myHome.myRemindersTab.uIMyActivityTable,
					0);

		}

		public void ClickInspectionAccordian() {
			uIMapHome.myHome.myRemindersTab.uIInspectionAccordation.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtSystemID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("SystemID"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myRemindersTab.uIInspectionTable,
							BaseData.getHomeModuleValue("OccupancyName"), "Reg#").getText());
		}

		public void VerifyAtOccupancyName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("OccupancyName"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myRemindersTab.uIInspectionTable,
							BaseData.getHomeModuleValue("SystemID"), "Occupancy Name").getText());
		}

		public void VerifyAtType() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Type"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myRemindersTab.uIInspectionTable,
							BaseData.getHomeModuleValue("SystemID"), "Type").getText());
		}

		public void VerifyDueDateAsFutureDate(int dateCount) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(dateCount, "MM/dd/yy"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myRemindersTab.uIInspectionTable,
							BaseData.getHomeModuleValue("SystemID"), "Due Date").getText());
		}

		public void SelectRowByAtSubject() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIMyActivityTable, BaseData.getHomeModuleValue("Subject"));
		}

		public void VerifyCertificationAsFirefighter(int rowIndex) {
			String uICertification = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uICertificationResultGrid, "Certification", rowIndex);
			verify.ExpectedValueIsTrue(uICertification.contains("Firefighter I"));

		}

		public void VerifyTitleAsFireFightingResponse(int rowIndex) {
			String uITitle = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uITrainingResultGrid, "Title", rowIndex);
			verify.ExpectedValueIsTrue(uITitle.contains("Fire Fighting Response"));

		}

		public void VerifyPFNameAsFireDispatcher(int rowIndex) {
			String uIPatrolOfficer = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uITrainingResultGrid, "PF Name", rowIndex)
					.replace(",", "");
			verify.ExpectedValueIsTrue(uIPatrolOfficer.contains("Fire Dispatcher"));
		}

		public void ClickRecordsRequestsAccordion() {
			uIMapHome.myHome.myRemindersTab.uIRecordsRequestsAccordion.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyRecordsRequestsISEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.myRemindersTab.uIRecordsRequestsAccordion.isEnabled());

		}

		public void VerifyRecordsRequestsCount() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapHome.myHome.myRemindersTab.uIRecordsRequestsAccordion);
			System.out.println(rowsCount);
		}

		public void VerifyAtRequestNoFromGrid(int rowIndex) {
			String RequestNo = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIRecordRrequestGrid, "Request#", rowIndex);
			System.out.println(RequestNo);
			verify.ExpectedValueIsTrue(RequestNo.contains(BaseData.getHomeModuleValue("RequestNo")));

		}

		public void VerifyAtRequestedByFromGrid(int rowIndex) {
			String RequestedBy = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIRecordRrequestGrid, "Requested By", rowIndex);
			System.out.println(RequestedBy);
			verify.ExpectedValueIsTrue(RequestedBy.contains(BaseData.getHomeModuleValue("RequestedBy")));

		}

		public void VerifyAtRequestTypeFromGrid(int rowIndex) {
			String RequestType = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIRecordRrequestGrid, "Request Type", rowIndex);
			System.out.println(RequestType);
			verify.ExpectedValueIsTrue(RequestType.contains(BaseData.getHomeModuleValue("RequestType")));

		}

		public void VerifyAtDueClosedDateFromGrid(int rowIndex) {
			String duecloseddate = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIRecordRrequestGrid, "Due/Closed Date", rowIndex);
			System.out.println(duecloseddate);
			verify.ExpectedValueIsTrue(duecloseddate.contains(BaseData.getHomeModuleValue("DueClosedDate")));

		}

		public void VerifyAtCallAndCaseFromGrid(int rowIndex) {
			String CallandCase = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myRemindersTab.uIRecordRrequestGrid, "Call/Case#", rowIndex);
			System.out.println(CallandCase);
			verify.ExpectedValueIsTrue(CallandCase.contains(BaseData.getHomeModuleValue("CallAndCase")));

		}

		public void VerifyAtAssignedToFromGrid(int rowIndex) {
			String assingedTo = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIRecordRrequestGrid, "Assigned To", rowIndex);
			System.out.println(assingedTo);
			verify.ExpectedValueIsTrue(assingedTo.contains(BaseData.getHomeModuleValue("AssignedTo")));

		}

		public void verifyAtRegNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("RegNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myRemindersTab.uIInspectionTable,
							BaseData.getHomeModuleValue("RegNo"), "Reg#").getText());
		}

		public void verifyAtSubjectInActivitiesTable() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myRemindersTab.uIMyActivityTable, "Subject");
			for (String values : gridTableColumnValues)
				verify.ExpectedValueIsTrue(values.contains(BaseData.getHomeModuleValue("Subject")));

		}

		public void verifyAtSubjectInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapHome.myHome.myRemindersTab.uIMyActivityTable, BaseData.getHomeModuleValue("Subject"));
			verify.ExpectedValueIsTrue(gridCell.getText().contains(BaseData.getHomeModuleValue("Subject")));
		}

		public void VerifyFleetNoDataDisplay() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.myRemindersTab.uIInventoryNoDataDisplay.isDisplayed());
		}

		public void VerifyPropertyTabNotAppear() {
			String Status = uIMapHome.myHome.myRemindersTab.uIPropertyTabNotAppear.getAttribute("aria-selected");
			verify.ExpectedPropertyValueIsEqual(Status, "false");
		}

		public void clickPhoneNumberFlagsAccordion() {
			uIMapHome.myHome.myRemindersTab.uIPhoneNumberFlagsAccordion.click();
		}

		public void verifyAtPhoneNoInPhoneNumberFlagsGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPhoneNoFlagsTable, BaseData.getHomeModuleValue("PhoneNumber"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getHomeModuleValue("PhoneNumber")));
		}

		public void verifyAtFlagInInPhoneNumberFlagsGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myRemindersTab.uIPhoneNoFlagsTable, BaseData.getHomeModuleValue("Flags"));
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(BaseData.getHomeModuleValue("Flags")));
		}
	}

	public class MyTrainingTab {
		public void ClickUpcommingTrainingclassesAccordion() {
			uIMapHome.myHome.myTrainingTab.uIUpcommingTrainingclassesAccordion.click();
		}

		public void VerifyTrainingTypeAsSeleniumTraining(int rowIndex) {
			String uITrainingclasses = objectIdentification.manualIdentify.getGridCellInnerText("grdClass",
					"Training Type", rowIndex);
			verify.ExpectedValueIsTrue(uITrainingclasses.contains("Selenium Training"));

		}

		public void VerifyCurrentDate(int rowIndex) {
			Playback.gridLoadThreadWait();
			String uICurrentDate = objectIdentification.manualIdentify.getGridCell("grdClass", "Date", rowIndex)
					.getText();
			verify.ExpectedPropertyValueIsEqual(uICurrentDate, Randomized.getCurrentDate());
		}

		public void ClickRowInUpcomingTrainingClassesGrid(int rowIndex) {
			WebElement uIClassGridRow = objectIdentification.manualIdentify.getGridCell(
					uIMapHome.myHome.myTrainingTab.uIUpcommingTrainingclassesResultGrid, "Training Type", rowIndex);
			uIClassGridRow.click();
		}

		public void VerifyTrainingTypeAsFireResponse(int rowIndex) {
			String uITrainingclasses = objectIdentification.manualIdentify.getGridCellInnerText("grdClass",
					"Training Type", rowIndex);
			verify.ExpectedValueIsTrue(uITrainingclasses.contains("Fire Response"));

		}

	}

	public class MyReportsTab {
		public void SelectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					BaseData.getHomeModuleValue("Status"));
			uIMapHome.myHome.myReportsTab.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void Verify13AccessRestrictedByAUTOAckMsg() {
			acknowledge.okWithExpectedMessage("(13) Access Restricted by Prophoenix, Automation");
		}

		public void SelectStatusAsReportDue() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"Report Due");
			Playback.gridLoadThreadWait();
		}

		public void SelectStatusAsOnHold() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"OnHold");
			Playback.gridLoadThreadWait();
		}

		public void SelectStatusAsKeypunch() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"Keypunch");
			Playback.gridLoadThreadWait();
		}

		public void SelectStatusAsReadyToSubmit() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"Ready To Submit");
			Playback.gridLoadThreadWait();
		}

		public void SelectStatusAsMoreInfoNeeded() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"More Info Needed");
			Playback.gridLoadThreadWait();
		}

		public void SelectStatusAsRejected() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"Rejected");
			Playback.gridLoadThreadWait();
		}

		public void SelectStatusAsSubmitted() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"Submitted");
			Playback.gridLoadThreadWait();
		}

		public void VerifyCaseAtCaseNo() {
			List<String> Case = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Ref#");
			verify.ExpectedValueIsTrue(Case.contains(BaseData.getHomeModuleValue("CaseNo")));
		}

		public void VerifyTypeAsPropertyReport() {

			WebElement PropertyType = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, "Property Report");
			Assert.assertEquals(PropertyType.getText(), "Property Report");

		}

		public void VerifyStatusAsRejected() {

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, "Rejected");
			Assert.assertEquals(status.getText(), "Rejected");

		}

		public void VerifyStatusAsSubmitted() {

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, "Submitted");
			Assert.assertEquals(status.getText(), "Submitted");

		}

		public void SelectRowByAtCaseNo() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));
		}

		public void AssignAsKeypunch() {
			// Popup.Confirm.yesWithExpectedMessage("(7267) This report was Sent to
			// Keypunch. Do you want to start editing the report?");
			confirm.yes();
		}

		public void SelectRowFromGrid() {

			objectIdentification.randomIdentify.selectRandomGridRow(uIMapHome.myHome.myReportsTab.uIReportTable);

		}

		public void ClickAddNewButton() {

			uIMapHome.myHome.myReportsTab.uIAddNewButton.click();

		}

		public void VerifyGridRowInMyReportsTab() {
			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));
			List<String> cellValues = objectIdentification.manualIdentify.getGridRowCellsValues(uICaseRow);
			verify.ExpectedValueIsTrue(cellValues.contains(BaseData.getHomeModuleValue("Type")));
			verify.ExpectedValueIsTrue(cellValues.contains(BaseData.getHomeModuleValue("MyReportStatus")));

		}

		public void VerifyGridRowTypeAsIncidentReportByCaseNo() {

			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable,
									BaseData.getHomeModuleValue("CaseNo"), "Item Type")
							.getText().contains("Incident Report"));

		}

		public void VerifyGridRowStatusAsReportDueByCaseNo() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, uICaseRow, "Status");
			verify.ExpectedValueIsTrue(status.getText().contains("Report Due"));

		}

		public void VerifyGridRowAtUnitByCaseNo() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable,
									BaseData.getHomeModuleValue("CaseNo"), "Unit")
							.getText().contains(BaseData.getHomeModuleValue("Unit")));

		}

		public void VerifyGridRowAtOfficerByCaseNo() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable,
									BaseData.getHomeModuleValue("CaseNo"), "Officer")
							.getText().contains(BaseData.getHomeModuleValue("Officer")));

		}

		public void VerifyGridRowAtOfficerByCaseNo(String caseNo) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, caseNo, "Officer").getText()
					.contains(BaseData.getHomeModuleValue("OfficerPF")));

		}

		public void VerifyGridRowAtMgmtCFSByCaseNo() {
			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));
			WebElement CFS = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, uICaseRow, "Mgmt-CFS");
			verify.ExpectedValueIsTrue(CFS.getText().contains("0901"));

		}

		public void VerifyGridRowStatusAsReportDue() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Report Due");
		}

		public void VerifyGridRowStatusAsOnHold() {
			
			
			boolean res = true;
			while(res)
				try {
					List<String> cellValues = objectIdentification.manualIdentify
							.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
					for (String strStatus : cellValues) {
						if (strStatus.contains("OnHold")) {
							Assert.assertEquals(strStatus, "OnHold");
						}
					}
						break;
				}
			catch(StaleElementReferenceException e)
			{
				Playback.implictwait();
				continue;
			}
			
			
		}

		public void MouseOverOfficerNameCellByAtCase() {

			Actions action = new Actions(Playback.driver);
			WebElement cell = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));
			WebElement OfficerName = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, cell, "Officer");
			action.moveToElement(OfficerName).perform();
			// Playback.TakeScreenshot(HomeScripts.HomeTestContext, "Patrol Officer");

		}

		public void SelectRowByAtType() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("Type"));
		}

		public void ClickSearchButton() {
			uIMapHome.myHome.myReportsTab.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyGridRowStatusAsTranscriber() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Transcriber");
		}

		/*
		 * public void VerifyOtherOfficerToKeypunchConfirmMessage() { if
		 * (Playback.browserType.contains("Chrome")) { confirm.yesWithExpectedMessage(
		 * "(7267) This report was Sent to Keypunch. Do you want to start editing the report?"
		 * ); Playback.controlReadyThreadWait(); } else {
		 * confirm.yesWithExpectedMessage(
		 * "(7267) This report was Sent to Keypunch. Do you want to start editing the report?"
		 * ); Playback.controlReadyThreadWait(); } }
		 */

		public void VerifyOtherOfficerToKeypunchConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				confirm.yesWithExpectedMessage(
						"(7267) This report was Sent to Keypunch. Do you want to start editing the report?");
				Playback.controlReadyThreadWait();
			} else {
				confirm.yesWithExpectedMessage(
						"(7267) This report was Sent to Keypunch. Do you want to start editing the report?");
				Playback.controlReadyThreadWait();
			}
		}

		public void VerifyReportBeingUpdatedByKeypunchConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				confirm.yesWithExpectedMessage(
						"(7268)The report is being updated by  KeyPunch, Officer, P003     . Editing is not allowed. Do you want to view the report?");
				Playback.controlReadyThreadWait();
			} else {
				confirm.yesWithExpectedMessage(
						"(7268)The report is being updated by  KeyPunch, Officer, P003     . Editing is not allowed. Do you want to view the report?");
				Playback.controlReadyThreadWait();
			}
		}

		public void VerifyKeypunchOfficerToAccessConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				confirm.yesWithExpectedMessage(
						"(7265) This report was Sent to Keypunch and is in Keypunch Status.  Upon completion of your review or edit, the report must again be Sent to Keypunch");

				Playback.controlReadyThreadWait();
			} else {
				confirm.yesWithExpectedMessage(
						"(7265) This report was Sent to Keypunch and is in Keypunch Status. Upon completion of your review or edit, the report must again be Sent to Keypunch");
				Playback.controlReadyThreadWait();
			}
		}

		public void SelectItemTypeAsReportEntry() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIItemTypeComboBox,
					"Report Entry");
			Playback.gridLoadThreadWait();
			Playback.gridLoadThreadWait();
		}

		public void SelectItemTypeAsK9ReportEntry() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIItemTypeComboBox,
					"K9 Report Entry");
			Playback.gridLoadThreadWait();
			Playback.gridLoadThreadWait();
		}

		public void SelectItemTypeAsTrainingClass() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIItemTypeComboBox,
					"Training Class");
			Playback.gridLoadThreadWait();
			Playback.gridLoadThreadWait();
		}

		public void SelectAtItemType1() {
			// objectIdentification.manualIdentify.selectDropDownOption(
			// uIMapHome.myHome.myReportsTab.uIItemTypeComboBox,
			// BaseData.getHomeModuleValue("ItemType1"));
			uIMapHome.myHome.myReportsTab.uIItemTypeComboBox.sendKeys(BaseData.getHomeModuleValue("ItemType1"));
			uIMapHome.myHome.myReportsTab.uIItemTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtItemType() {
			// objectIdentification.manualIdentify.selectDropDownOption(
			// uIMapHome.myHome.myReportsTab.uIItemTypeComboBox,
			// BaseData.getHomeModuleValue("ItemType"));
			uIMapHome.myHome.myReportsTab.uIItemTypeComboBox.sendKeys(BaseData.getHomeModuleValue("ItemType"));
			uIMapHome.myHome.myReportsTab.uIItemTypeComboBox.sendKeys(Keys.TAB);
		}

		public void ClickShowMyItemsOnly() {
			uIMapHome.myHome.myReportsTab.uIShowMyItemsOnlyCheckBox.click();
		}

		public void VerifyAtOfficerInColumnValues() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Officer");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, BaseData.getHomeModuleValue("Officer"));
		}

		public void ClickRefreshButton() {
			uIMapHome.myHome.myReportsTab.uIRefreshLink.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtRefNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("RefNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable,
							BaseData.getHomeModuleValue("RefNo")).getText());
		}

		public void VerifyGridRowStatusAsSubmitted() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Submitted");
		}

		public void VerifyGridRowStatusAsReadyToSubmit() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Ready To Submit");
		}

		public void VerifyStatusAsOnHold() {

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, "OnHold");
			Assert.assertEquals(status.getText(), "OnHold");

		}

		public void VerifyStatusAsReportDue() {

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, "Report Due");
			Assert.assertEquals(status.getText(), "Report Due");

		}

		public void selectAtStatus1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					BaseData.getHomeModuleValue("Status1"));
			uIMapHome.myHome.myReportsTab.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void verifyGridRowAtStatus() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, BaseData.getHomeModuleValue("Status"));
		}

		public void verifyGridRowAtStatus1() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, BaseData.getHomeModuleValue("Status1"));
		}

		public void selectStatusAsDefault() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"--");
			uIMapHome.myHome.myReportsTab.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void selectStatusAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					"--");
			Playback.gridLoadThreadWait();
		}

		public void selectAtStatus2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIStatusComboBox,
					BaseData.getHomeModuleValue("Status2"));
			uIMapHome.myHome.myReportsTab.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void selectByActiveCaseNo(String caseNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, caseNo);
		}

		public void verifyGridRowTypeAsIncidentReportByCaseNo(String CaseNo) {

			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo, "Item Type").getText()
					.contains("Incident Report"));

		}

		public void verifyGridRowStatusAsReportDueByCaseNo(String CaseNo) {

			WebElement uICaseRow = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo);

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, uICaseRow, "Status");
			verify.ExpectedValueIsTrue(status.getText().contains("Report Due"));

		}

		public void VerifyGridRowAtOfficer1ByCaseNo() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable,
									BaseData.getHomeModuleValue("CaseNo"), "Officer")
							.getText().contains(BaseData.getHomeModuleValue("Officer1")));

		}

		public void verifyGridRowStatusAsOnHoldByCaseNo() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, uICaseRow, "Status");
			verify.ExpectedValueIsTrue(status.getText().contains("OnHold"));

		}

		public void verifyGridRowStatusAsTranscriberByCaseNo() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, uICaseRow, "Status");
			verify.ExpectedValueIsTrue(status.getText().contains("Transcriber"));

		}

		public void verifyGridRowStatusAsReadyToSubmitByCaseNo() {

			WebElement uICaseRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("CaseNo"));

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, uICaseRow, "Status");
			verify.ExpectedValueIsTrue(status.getText().contains("Ready To Submit"));

		}

		public void verifyRejectionCountAs1(int rowIndex) {
			String uICaseRow = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, "Rejection Count", rowIndex);
			verify.ExpectedPropertyValueIsEqual("1", uICaseRow);
		}

		public void VerifyAtRefNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("RefNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, "Ref#", rowIndex));

		}

		public void verifyListOfStatusAvailable() {
			List<String> values = objectIdentification.manualIdentify
					.getDropDownValues(uIMapHome.myHome.myReportsTab.uIStatusComboBox);
			List<String> valuesExpected = new ArrayList<String>();
			valuesExpected.add("--");
			valuesExpected.add("OnHold");
			valuesExpected.add("Ready To Submit");
			valuesExpected.add("Submitted");
			valuesExpected.add("Rejected");
			valuesExpected.add("Report Due");
			valuesExpected.add("Review");
			valuesExpected.add("More Info Needed");
			valuesExpected.add("Keypunch");
			valuesExpected.add("Remote Transcription");
			verify.ExpectedValueIsTrue(values.equals(valuesExpected));
		}

		public void selectGridRowByStatusAsHold() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, "OnHold");

		}

		public void verifyAtStatusUsingRefNo() {
			String text = objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable,
					BaseData.getHomeModuleValue("RefNo"), "Status").getText();
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Status"), text);

		}

		public void selectRowByAtRefNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myReportsTab.uIReportTable, BaseData.getHomeModuleValue("RefNo"));

		}

		public void verifyAccessRestrictedByCaseFolderAcknowledge() {

			Playback.pageLoadThreadWait();
			popup.acknowledge.okWithExpectedMessage("(6071) Access Restricted by Case Folder");

		}

		public void selectJurisAsBC() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myReportsTab.uIJurisComboBox,
					"BC - Brown County Police Department");
		}

		public void verifyShownRecordsBelongsToBCInGrid() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Juris");
			for (String strStatus : cellValues) {
				if (strStatus.contains("BC")) {
					Assert.assertEquals(strStatus, "BC");
				}
			}
		}

		public void selectOnHoldReportInGrid() {
			objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, "20-000003", "Status").click();

		}

		public List<String> getOfficerColumnValues() {
			List<String> columnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Officer");

			return columnValues;
		}

		public void verifyOfficerColumnValuesareNotEqual(List<String> allItems, List<String> myItems) {
			verify.ExpectedValueIsNotTrue(CollectionUtils.isEqualCollection(allItems, myItems));
		}

		public void selectIncidentReportOnHoldTypeInGrid() {
			objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable,
					BaseData.getHomeModuleValue("CaseNo"), "Item Type").click();
		}

		public void VerifyGridRowInMyReportsTabUsingJsonReadFile(String testCaseId) {
			String caseYear = BaseData.readJson(testCaseId, "caseYear");
			String caseNo = BaseData.readJson(testCaseId, "caseNo");
			String CaseNo = caseYear + "-" + caseNo;
			System.out.println(CaseNo);
			WebElement uICaseRow = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo);
			List<String> cellValues = objectIdentification.manualIdentify.getGridRowCellsValues(uICaseRow);
			verify.ExpectedValueIsTrue(cellValues.contains(BaseData.getHomeModuleValue("Type")));
			verify.ExpectedValueIsTrue(cellValues.contains(BaseData.getHomeModuleValue("MyReportStatus")));

		}

		public void verifyreportSenttoKeypunchConfirmMessage() {
			// Popup.Confirm.yesWithExpectedMessage("(7267) This report was Sent to
			// Keypunch. Do you want to start editing the report?");
			if (Playback.browserType.contains("Chrome")) {

				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains("(7267)"));
				Assert.assertTrue(Playback.driver.switchTo().alert().getText()
						.contains("This report was Sent to Keypunch. Do you want to start editing the report?"));
				popup.confirm.yes();
			} else if (Playback.browserType.contains("Edge")) {
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains("(7267)"));
				Assert.assertTrue(Playback.driver.switchTo().alert().getText()
						.contains("This report was Sent to Keypunch. Do you want to start editing the report?"));
				popup.confirm.yes();

			} else {
				popup.switchToConfirm();
				String keypunch = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();

				verify.ExpectedValueIsTrue(keypunch.contains("(7267)"));
				verify.ExpectedValueIsTrue(keypunch
						.contains("This report was Sent to Keypunch. Do you want to start editing the report?"));
				popup.confirm.yes();
			}

		}

		public void selectAtCaseNoUsingJsonReadFile(String testCaseId) {

			Playback.pageLoadThreadWait();
			Playback.threadWait();
			String caseYear = BaseData.readJson(testCaseId, "caseYear");
			String caseNo = BaseData.readJson(testCaseId, "caseNo");
			String CaseNo = caseYear + "-" + caseNo;
			System.out.println(CaseNo);
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo);

		}

		public void VerifyAtCaseNoUsingJsonReadFile(String testCaseId) {
			String caseYear = BaseData.readJson(testCaseId, "caseYear");
			String caseNo = BaseData.readJson(testCaseId, "caseNo");
			String CaseNo = caseYear + "-" + caseNo;
			
			List<String> Case = null;
			boolean res = true;
			while(res)
				try {
			 Case = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myReportsTab.uIReportTable, "Ref#");
			verify.ExpectedValueIsTrue(Case.contains(CaseNo));	
			break;
				}
			catch(StaleElementReferenceException e)
			{
				Playback.implictwait();
				continue;
			}
		}
		



			
		

		public void VerifyGridRowStatusAsReportDueByCaseNoUsingJsonReadFile(String testCaseId) {

			String caseYear = BaseData.readJson(testCaseId, "caseYear");
			String caseNo = BaseData.readJson(testCaseId, "caseNo");
			String CaseNo = caseYear + "-" + caseNo;

			WebElement uICaseRow = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo);

			WebElement status = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, uICaseRow, "Status");
			verify.ExpectedValueIsTrue(status.getText().contains("Report Due"));

		}

		public void VerifyGridRowAtUnitByCaseNoUsingJsonReadFile(String testCaseId) {
			String caseYear = BaseData.readJson(testCaseId, "caseYear");
			String caseNo = BaseData.readJson(testCaseId, "caseNo");
			String CaseNo = caseYear + "-" + caseNo;
			WebElement ele = null;
			boolean res = true;
			while(res)
				try {
					 ele = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo, "Unit");
				break;
				}
			catch(StaleElementReferenceException e)
			{
				Playback.implictwait();
				continue;
			}
			verify.ExpectedPropertyValueIsEqual(ele.getText()
					,BaseData.getHomeModuleValue("Unit"));	

		}

		public void VerifyGridRowAtOfficerByCaseNoUsingJsonReadFile(String testCaseId) {
			String caseYear = BaseData.readJson(testCaseId, "caseYear");
			String caseNo = BaseData.readJson(testCaseId, "caseNo");
			String CaseNo = caseYear + "-" + caseNo;
			
			WebElement ele = null;
			boolean res = true;
			while(res)
				try {
			ele = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo, "Officer");
				break;
				}
			catch(StaleElementReferenceException e)
			{
				Playback.implictwait();
				continue;
			}
			verify.ExpectedPropertyValueIsEqual(ele.getText()
					,BaseData.getHomeModuleValue("Officer"));	

		}

		public void VerifyGridRowTypeAsIncidentReportByCaseNoUsingJSONReadFile(String testCaseId) {

			String caseYear = BaseData.readJson(testCaseId, "caseYear");
			String caseNo = BaseData.readJson(testCaseId, "caseNo");
			String CaseNo = caseYear + "-" + caseNo;
			WebElement ele = null;
			boolean res = true;
			while(res)
				try {
			ele = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myReportsTab.uIReportTable, CaseNo, "Item Type");
				break;
				}
			catch(StaleElementReferenceException e)
			{
				Playback.implictwait();
				continue;
			}
			verify.ExpectedPropertyValueIsEqual(ele.getText()
					,"Incident Report");
		}

	}

	public class MyApprovalTab {
		public void SelectStatusAsSubmitted() {
			uIMapHome.myHome.myApprovalTab.uIStatusComboBox.sendKeys("Submitted");
			Playback.controlReadyThreadWait();
		}

		public void SelectStatusAsOnHold() {
			uIMapHome.myHome.myApprovalTab.uIStatusComboBox.sendKeys("OnHold");
			uIMapHome.myHome.myApprovalTab.uIStatusComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectItemTypeAsPersonnelTimeEntry() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox,
					"Personnel Time Entry");
			Playback.controlReadyThreadWait();
			uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectItemTypeAsPersonnelInjury() {
			uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox.sendKeys("Personnel Injury");
		}

		public void SelectItemTypeAsTrainingClass() {
			uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox.sendKeys("Training Class");
		}

		public void SelectItemTypeAsCrashEntry() {
			uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox.sendKeys("Crash Entry");
		}

		public void SelectAtItemType() {
			uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox.sendKeys(BaseData.getHomeModuleValue("ItemType"));
		}

		public void VerifyRefAsSeleniumTraining(int rowIndex) {
			String uIRefNo = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Ref#", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(uIRefNo.contains("Selenium Training"));

		}

		public void VerifyCurrentDate(int rowIndex) {
			Playback.gridLoadThreadWait();
			String uICurrentDate = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Date", rowIndex)
					.getText();
			verify.ExpectedPropertyValueIsEqual(uICurrentDate, Randomized.getCurrentDate());
		}

		public void ClickRowInApprovalTabGrid(int rowIndex) {

			objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Ref#", rowIndex).click();

		}

		public void VerifyNoRecordFoundMessage() {
			verify.ExpectedPropertyValueIsEqual("No Data To Display",
					uIMapHome.myHome.myApprovalTab.uINoRecordFoundText.getText());
		}

		public void VerifyAtRefNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("RefNo"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
									BaseData.getHomeModuleValue("RefNo"))
							.getText());
		}

		public void VerifyAtPFCodeByAtRefNoInOfficerColumn() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, BaseData.getHomeModuleValue("RefNo"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("PFCode"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, row, "Officer")
							.getText());

		}

		public void VerifyStatusAsOnHoldByAtRefNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, BaseData.getHomeModuleValue("RefNo"));
			verify.ExpectedPropertyValueIsEqual("OnHold", objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, row, "Status").getText());
		}

		public void VerifyItemTypeAsCrashByAtRefNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, BaseData.getHomeModuleValue("RefNo"));
			verify.ExpectedPropertyValueIsEqual("Crash",
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, row, "Item Type")
							.getText());
		}

		public void VerifyRefAsFireResponse(int rowIndex) {
			String uIRefNo = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Ref#", rowIndex)
					.getText();
			verify.ExpectedValueIsTrue(uIRefNo.contains("Fire Response"));
		}

		public void SelectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myApprovalTab.uIStatusComboBox,
					BaseData.getHomeModuleValue("Status"));
			Playback.gridLoadThreadWait();
		}

		public void VerifyGridColumnStatusAsReportDue() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Report Due");
		}

		public void VerifyItemTypeAsNFIRS(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("NFIRS", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Item Type", rowIndex));
		}

		public void VerifyItemTypeAsEMS(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("EMS", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Item Type", rowIndex));
		}

		public void VerifyAtLocationUsingNFIRS() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Location"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "NFIRS", "Location").getText());
		}

		public void VerifyAtLocationUsingEMS() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Location"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "EMS", "Location")
							.getText());
		}

		public void ClickRefreshButton() {

			uIMapHome.myHome.myApprovalTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectAtItemTypeUsingLocationInGrid() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
					BaseData.getHomeModuleValue("Location"));

		}

		public void VerifyRefNoUsingItemType(String IncidentYear, String IncidentNo) {
			verify.ExpectedPropertyValueIsEqual(IncidentYear + "-" + IncidentNo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
									BaseData.getHomeModuleValue("ItemType"), "Ref#")
							.getText());
		}

		public void VerifyRefNoUsingItemType(String IncidentYear, String IncidentNo, String ExpNo) {
			verify.ExpectedPropertyValueIsEqual(IncidentYear + "-" + IncidentNo + "-" + ExpNo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
									BaseData.getHomeModuleValue("ItemType"), "Ref#")
							.getText());
		}

		public void VerifyRefNoUsingLocation(String IncidentYear, String IncidentNo) {
			verify.ExpectedPropertyValueIsEqual(IncidentYear + "-" + IncidentNo,
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
									BaseData.getHomeModuleValue("Location"), "Ref#")
							.getText());
		}

		public void VerifyRefNoForNFIRS(String IncidentYear, String IncidentNo) {
			verify.ExpectedPropertyValueIsEqual(IncidentYear + "-" + IncidentNo + "-000",
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "NFIRS", "Ref#")
							.getText());
		}

		public void ClickSearchButton() {
			uIMapHome.myHome.myApprovalTab.uISearchButton.click();
			Playback.controlReadyThreadWait();
			Playback.gridLoadThreadWait();
		}

		public void selectAtItemType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox,
					BaseData.getHomeModuleValue("ItemType1"));
			uIMapHome.myHome.myApprovalTab.uIItemTypeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtItemTypeInColumnValues() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Item Type");
			for (String strStatus : cellValues)
				Assert.assertEquals(BaseData.getHomeModuleValue("ItemType"), strStatus);
		}

		public void verifyAtItemType1InColumnValues() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Item Type");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, BaseData.getHomeModuleValue("ItemType1"));
		}

		public void verifyAtStatusInColumnValues() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, BaseData.getHomeModuleValue("Status"));
		}

		public void verifyAtStatus1InColumnValues() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, BaseData.getHomeModuleValue("Status1"));
		}

		public void selectAtStatus1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.myHome.myApprovalTab.uIStatusComboBox,
					BaseData.getHomeModuleValue("Status1"));
			Playback.gridLoadThreadWait();
		}

		public void VerifyAtRefNoNotAvailable() {
			List<WebElement> allRefNo = objectIdentification.manualIdentify
					.getGridTableColumnCells(uIMapHome.myHome.myReportsTab.uIReportTable, "Ref#");

			for (WebElement refNo : allRefNo) {

				String text = refNo.getText();
				System.out.println(text);
				verify.ExpectedValueIsFalse(text.contains(BaseData.getHomeModuleValue("RefNo")));
			}
		}

		public void SelectAtItemTypeUsingItemTypeInGrid() {
			Playback.pageLoadThreadWait();
			WebElement EMSRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
					BaseData.getHomeModuleValue("ItemType"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(EMSRow,
					BaseData.getHomeModuleValue("Type"));
		}

		public void SelectAtItemTypeUsingItemType1InGrid() {
			Playback.pageLoadThreadWait();
			WebElement EMSRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
					BaseData.getHomeModuleValue("ItemType"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(EMSRow,
					BaseData.getHomeModuleValue("Type1"));
		}

		public void SelectAtItemTypeUsingItemType2InGrid() {
			Playback.pageLoadThreadWait();
			WebElement EMSRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable,
					BaseData.getHomeModuleValue("ItemType"));
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(EMSRow,
					BaseData.getHomeModuleValue("Type2"));
		}

		public void verifySupervisorFieldDisplayed() {

			verify.ExpectedValueIsTrue(uIMapHome.myHome.myApprovalTab.uISupervisorEdit.isDisplayed());
		}

		public void enterAtSupervisorPF() {
			uIMapHome.myHome.myApprovalTab.uISupervisorEdit.sendKeys(BaseData.getHomeModuleValue("SupervisorPF"));
		}

		public void verifySubmittedToColumnDisplayed() {

			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderColumnCell(uIMapHome.myHome.myApprovalTab.uIApprovalStatusReportTable, "Submitted To")
					.isDisplayed());
		}

		public void verifySubmittedToOfficerRecordsOnlyListed() {

			List<WebElement> cells = objectIdentification.manualIdentify
					.getGridTableColumnCells(uIMapHome.myHome.myApprovalTab.uIReportsTable, "Submitted To");
			for (WebElement ele : cells)
				if (ele.getText().contains(BaseData.getHomeModuleValue("SupervisorName")))
					;
			verify.ExpectedValueIsTrue(true);

		}

		public void verifyAtSubmittedToSupervisorName() {

			WebElement ele = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myApprovalTab.uIReportsTable, "Submitted To", 0);
			verify.ExpectedPropertyValueIsEqual(ele.getText(), BaseData.getHomeModuleValue("SupervisorName"));

		}

	}

	public class MyCMTab {
		public void ClickNewAssignmentAccordion() {
			uIMapHome.myHome.myCMTab.uINewAssignmentAccordion.click();
		}

		public void clickOpenCaseFolderAccordion() {
			uIMapHome.myHome.myCMTab.uIOpenCaseFolderAccordion.click();
		}

		public void VerifyAtCaseNoInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("CaseNo"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable,
									BaseData.getHomeModuleValue("CaseNo"), "Case#")
							.getText());
		}

		public void VerifyAtSupervisorPFByAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("SupervisorPF"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable,
									BaseData.getHomeModuleValue("CaseNo"), "Supervisor PF")
							.getText());
		}

		public void ClickOverDueTask() {
			uIMapHome.myHome.myCMTab.uIOverDueTaskAccordion.click();
			Playback.waitForControlReady();
		}

		public void ClickRefreshButton() {
			uIMapHome.myHome.myCMTab.uIRefreshButton.click();
		}

		public void VerifyAtInvestNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("InvestNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Invest#", rowIndex));
		}

		public void VerifyAtCaseNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("CaseNumber"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Case#", rowIndex));
		}

		public void VerifyStatusAsOpen(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Open", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Status", rowIndex));
		}

		public void ClickRowAtInvestNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, BaseData.getHomeModuleValue("InvestNo"));
		}

		public void VerifyAssignmentGridDisappear() {
			verify.ExpectedPropertyValueIsEqual("No Data To Display",
					uIMapHome.myHome.myCMTab.uINewAssignmentsLable.getText());
		}

		public void ClickCaseNoColumnNameNewAssignment() {
			objectIdentification.manualIdentify
					.selectGridHeaderColumnName(uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Case#");
			Playback.waitForControlReady();
		}

		public void ClickInvestNoColumnNameNewAssignment() {
			objectIdentification.manualIdentify
					.selectGridHeaderColumnName(uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Invest#");
			Playback.waitForControlReady();
		}

		public void VerifyInvestColumnDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() == "Invest#") {
					break;
				}
			}

		}

		public void VerifyInvestColumnNotDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() != "Invest#") {
					break;
				}
			}
		}

		public void VerifySupervisorPFColumnDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() == "Supervisor PF") {
					break;
				}
			}
		}

		public void VerifySupervisorPFColumnNotDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() != "Supervisor PF") {
					break;
				}
			}
		}

		public void VerifyPrimePFColumnDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() == "Prime PF") {
					break;
				}
			}
		}

		public void VerifyPrimePFColumnNotDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() != "Prime PF") {
					break;
				}
			}
		}

		public void VerifyHighestCATColumnDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() == "Highest-CAT") {
					break;
				}
			}
		}

		public void VerifyChargeOrCFSColumnDisplayed() {
			List<WebElement> elements = Playback.driver.findElements(By.xpath(
					"//div[@id='grdOpenCaseFolder_ctl00_Prophoenix, Automation_0']/table/tbody/tr[2]/td/table/tbody[1]/tr/td/div/table/tbody/tr/th"));
			for (WebElement column : elements) {
				if (column.getText() == "Charge/CFS") {
					break;
				}
			}
		}

		public void ClickCaseNoColumnNameTasks() {
			Playback.waitForControlReady();
			// objectIdentification.manualIdentify.selectGridHeaderColumnName(
			// uIMapHome.myHome.myCMTab.uITasksReportTable, "Case#");
			WebElement Newreder = objectIdentification.manualIdentify
					.getGridHeaderColumnCell(uIMapHome.myHome.myCMTab.uITasksReportTable, "Case#");
			Newreder.click();
			Playback.waitForControlReady();
		}

		public void clickAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.myHome.myCMTab.uITasksReportTable, BaseData.getHomeModuleValue("CaseNo"));
		}

		public void ClickAssignedTaskColumnNameTasks() {
			Playback.waitForControlReady();
			objectIdentification.manualIdentify.selectGridHeaderColumnName(uIMapHome.myHome.myCMTab.uITasksReportTable,
					"Assigned Task");
			Playback.waitForControlReady();
		}

		public void ClickInvestNoColumnNameTasks() {
			Playback.waitForControlReady();
			objectIdentification.manualIdentify.selectGridHeaderColumnName(uIMapHome.myHome.myCMTab.uITasksReportTable,
					"Invest#");
			// WebElement Newreder =
			// objectIdentification.manualIdentify.GetGridHeaderColumnCell(
			// uIMapHome.myHome.myCMTab.uITasksReportTable, "Invest#");
			// Newreder.click();
			Playback.waitForControlReady();
		}

		public void ClickTasksAccordion() {
			uIMapHome.myHome.myCMTab.uITasksAccordion.click();
		}

		public void VerifyAtCaseNoSortOrderNewAssignment(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Case#", rowIndex));
		}

		public void VerifyAtInvestNoSortOrderNewAssignment(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("InvestNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Invest#", rowIndex));
		}

		public void VerifyAtCaseNoSortOrderTask(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("CaseTask"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.myHome.myCMTab.uITasksReportTable, "Case#", rowIndex));
		}

		public void VerifyAtInvestNoSortOrderTask(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("InvestNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.myHome.myCMTab.uITasksReportTable, "Invest#", rowIndex));
		}

		public void VerifyAtAssignedTaskSortOrderTask(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("AssignedTask"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.myHome.myCMTab.uITasksReportTable, "Assigned Task", rowIndex));
		}

		public void verifyAsInvestColumnNameInTable() {
			Playback.pageLoadThreadWait();

			String table = uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable.getText();
			System.out.println(table);
			verify.ExpectedValueIsTrue(table.contains("Invest#"));

		}

		public void verifyAsSupervisorPFColumnNameInTable() {
			Playback.pageLoadThreadWait();
			String table = uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable.getText();
			verify.ExpectedValueIsTrue(table.contains("Supervisor PF"));

		}

		public void verifyAsSupervisorPFColumnNameNotInTable() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsFalse(
					uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable.getText().contains("Supervisor PF"));
		}

		public void verifyAsChargeCFSColumnNameInTable() {
			Playback.pageLoadThreadWait();
			String table = uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable.getText();
			verify.ExpectedValueIsTrue(table.contains("Charge/CFS"));

		}

		public void verifyAsPrimePFColumnNameInTable() {
			Playback.pageLoadThreadWait();
			String table = uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable.getText();
			verify.ExpectedValueIsTrue(table.contains("Prime PF"));

		}

		public void verifyAsHighestCATColumnNameInTable() {
			Playback.pageLoadThreadWait();
			String table = uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable.getText();
			verify.ExpectedValueIsTrue(table.contains("Highest-CAT"));

		}

		public void verifyAsInvestColumnNameNotInTable() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsFalse(uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable.getText().contains("Invest#"));
		}

		public void verifyAtCaseNoFromOpenCaseFolder() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable,
							BaseData.getHomeModuleValue("CaseNo"), "Case#").getText());

		}

		public void verifyAtCaseNo(String CaseNo) {
			int Count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable);
			verify.ExpectedPropertyValueIsEqual(CaseNo, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable, "Case#", Count - 1));

		}

		public void verifyInvestNo(String InvestNo) {
			int Count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable);
			verify.ExpectedPropertyValueIsEqual(InvestNo, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.myHome.myCMTab.uIOpenCaseFolderTable, "Invest#", Count - 1));

		}

		public void VerifyAtCaseNoSortOrderNewAssignment() {
			WebElement caseNo = Playback.driver
					.findElement(By.xpath("//div[@id='divNewAssignments']//table/tbody/tr//td[contains(text(),'"
							+ BaseData.getHomeModuleValue("CaseNo") + "')]"));
			Playback.controlReadyThreadWait();
			System.out.println(caseNo.getText());
			verify.ExpectedValueIsTrue(caseNo.getText().contains(BaseData.getHomeModuleValue("CaseNo")));
		}

		public void verifyNewAssignmentsLabelShowingRecordsCountProperly() {
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable);
			String text = uIMapHome.myHome.myCMTab.uINeAssignmentsLabel.getText();
			verify.ExpectedPropertyValueIsEqual("(" + Integer.toString(count) + ")", text);
		}

		public void VerifyAtPrimePFSortOrderNewAssignment(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("PrimePF"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.myHome.myCMTab.uINewAssignmentsReportTable, "Prime PF", rowIndex));
		}

		public void verifyNewAssignmentsAccordionIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.myCMTab.uINewAssignmentAccordion.isDisplayed());
		}

		public void verifyTasksAccordionIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.myCMTab.uITasksAccordion.isDisplayed());
		}

		public void verifyOpenCaseFolderAccordionIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.myHome.myCMTab.uIOpenCaseFolderAccordion.isDisplayed());
		}

		public void clickAtCaseNoInNewAssignmentsTabInGrid() {
			Playback.controlReadyThreadWait();
			WebElement caseNo = Playback.driver
					.findElement(By.xpath("//div[@id='divNewAssignments']//table/tbody/tr//td[contains(text(),'"
							+ BaseData.getHomeModuleValue("CaseNo") + "')]"));
			Playback.controlReadyThreadWait();
			caseNo.click();
		}

		public void verifyCaseNoInTaskGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.myHome.myCMTab.uITasksReportTable,
							BaseData.getHomeModuleValue("CaseNo"), "Case#").getText());

		}

		public void verifyTaskRowColor() {
			String color = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.myHome.myCMTab.uITasksReportTable, "Case#", 0).getCssValue("color");
			System.out.println(color);
		}

		public void verifyHeaderLineInOpenCase() {
			String Header = uIMapHome.myHome.myCMTab.uIHeaderLineOpenCaseFolder.getText();
			System.out.println();
			verify.ExpectedPropertyValueIsEqual(Header, BaseData.getHomeModuleValue("Header"));

		}
	}

	public class MessageSearch {

		public void VerfiyMessagefromMessageScreen() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.messageSearch.uIMessageTable, "Sender");
			cellValues.contains(BaseData.getHomeModuleValue("MessageSender"));
			cellValues.contains(BaseData.getHomeModuleValue("MessageReceiver"));
			cellValues.contains(BaseData.getHomeModuleValue("MessageContains"));

		}

		public void Close() {
			uIMapHome.messageSearch.driver.close();
		}

		public void VerifyDateAsCurrentDateInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.messageSearch.uIMessageTable, "Date", rowIndex)
							.contains(Randomized.getCurrentDate("MM/dd/yy")),
					"Verify Date displayed as Current Date in Grid");
		}

		public void VerifySentArrowinGrid(int rowIndex) {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			WebElement LeokaIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.messageSearch.uIMessageTable, rowIndex, 22).findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(LeokaIcon.getAttribute("src").contains("RightArrow"));

		}

		public void ClickAtSenderInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.messageSearch.uIMessageTable,
					BaseData.getHomeModuleValue("Sender"));
			Playback.controlReadyThreadWait();
		}

		public void ClickBoloRadioButton() {
			uIMapHome.messageSearch.uIBoloRadioButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtReceiverInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Receiver"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapHome.messageSearch.uIMessageTable,
							"Receiver", rowIndex));
		}

		public void VerifyAtSenderInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Sender"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapHome.messageSearch.uIMessageTable,
							"Sender", rowIndex));
		}

		public void Click2ndRowInGrid() {
			objectIdentification.manualIdentify.selectGridTableRow(uIMapHome.messageSearch.uIMessageTable, 1);
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtMessageInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Message"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapHome.messageSearch.uIMessageTable,
							"Message", rowIndex));
		}

		public void clickAddNewButton() {
			uIMapHome.messageSearch.uIAddNewButton.click();

		}

		public void enterPFInboxCode() {
			uIMapHome.messageSearch.uIPFInboxEdit.sendKeys("Test");

		}

		public void SelectAtJuris() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Juris"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapHome.messageSearch.uIJurisComboBox));
		}

	}

	public class ManageLinks {

		public void EnterAtLinkName() {
			uIMapHome.manageLinks.uILinkNameEdit.click();
			uIMapHome.manageLinks.uILinkNameEdit.sendKeys(BaseData.getHomeModuleValue("LinkName"));
		}

		public void EnterAtScreenID() {
			uIMapHome.manageLinks.uIScreenEdit.sendKeys(BaseData.getHomeModuleValue("ScreenID"));
			uIMapHome.manageLinks.uIScreenEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapHome.manageLinks.uIAddButton.click();
		}

		public void ClickSaveButton() {
			uIMapHome.manageLinks.uISaveButton.click();
		}

		public void Save() {
			uIMapHome.manageLinks.uISaveButton.click();
			confirm.yes();
		}

		public void CloseTheScreen() {
			uIMapHome.manageLinks.driver.close();
		}

		public void VerifyAtLinkName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("LinkName"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.manageLinks.uIManageLinkTable,
							BaseData.getHomeModuleValue("LinkName")).getText());
		}

		public void VerifyAtScreenName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("ScreenName"),
					objectIdentification.manualIdentify.getGridCell(uIMapHome.manageLinks.uIManageLinkTable,
							BaseData.getHomeModuleValue("ScreenName")).getText());
		}

		public void VerifyViewOrderAsMinusOne(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("-1", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.manageLinks.uIManageLinkTable, "View Order", rowIndex));

		}

		public void EnterAtURL() {
			uIMapHome.manageLinks.uIEnterURL.sendKeys(BaseData.getHomeModuleValue("URL"));
			uIMapHome.manageLinks.uIEnterURL.sendKeys(Keys.TAB);
		}

		public void EnterAtFilePath() {
			uIMapHome.manageLinks.uIEnterFilePath.sendKeys(BaseData.getHomeModuleValue("FilePath"));
			uIMapHome.manageLinks.uIEnterFilePath.sendKeys(Keys.TAB);
		}

		public void verifyAcceptLinkorURLAcknowledgeMEssage() {
			popup.acknowledge.okWithExpectedMessage("(2010) Accepts either screen link or URL");
		}

		public void VerifyBottomStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapHome.manageLinks.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));
		}

		public void SelectAtLinkNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.manageLinks.uIManageLinkTable,
					BaseData.getHomeModuleValue("LinkName"));
			Playback.controlReadyThreadWait();
		}

		public void verifyUpdateButton() {
			verify.ExpectedValueIsTrue(uIMapHome.manageLinks.uIAddButton.isDisplayed());
		}

		public void ClickShowAllCheckbox() {
			uIMapHome.manageLinks.uIShowAllCheckbox.click();
		}

		public void verifyShowAllCheckboxIsSelected() {
			verify.ExpectedValueIsTrue(uIMapHome.manageLinks.uIShowAllCheckbox.isSelected());
		}

		public void clickClearButton() {
			uIMapHome.manageLinks.uIClearButton.click();
		}

		public void verifyAtLinkNameIsGreenInGrid() {
			String colour = objectIdentification.manualIdentify
					.getGridCell(uIMapHome.manageLinks.uIManageLinkTable, BaseData.getHomeModuleValue("LinkName"))
					.getCssValue("color");
			System.out.println(colour);
//            verify.ExpectedValueIsTrue(colour.contains("green"));
		}
	}

	public class SelectReport {

		public void CloseTheScreen() {
			uIMapHome.selectReport.driver.close();
		}

		public void VerifyRecordCountName3() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 3"));
		}

		public void ClickPrintBatchInQueueButton() {
			uIMapHome.selectReport.uIPrintBatchInQueueButton.click();
		}

		public void VerifySelectReportScreenOpened() {
			String uIVerifyPDF = uIMapHome.selectReport.uIPDFRadioButton.getAttribute("checked");
			verify.ExpectedValueIsTrue(uIVerifyPDF.contains("true"));
		}

		public void ClickNameDetailInGrid() {
			uIMapHome.selectReport.uISelectReportOthersNameDetails.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void VerifyInspectionChecklistOnlyReportIsSSRSReport() {

			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapHome.selectReport.uISelectReportsResultTable, "Type", 3).getAttribute("title")
					.contains("SSRS Report"));
		}

		public void ClickInspectionChecklistOnlyReport() {
			uIMapHome.selectReport.uIInspectionChecklistOnlyReport.click();
		}

		public void ClickCrashReport2017InGrid() {
			uIMapHome.selectReport.uISelectReportCrashReport2017Record.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickFireCodeViolationReport() {
			((JavascriptExecutor) Playback.driver).executeScript("scroll(0,1000);");

			Actions action = new Actions(Playback.driver);
			action.moveToElement(uIMapHome.selectReport.uIFireCodeViolationReportRecord).build().perform();
			action.click(uIMapHome.selectReport.uIFireCodeViolationReportRecord);
		}

		public void ClickCrashReportInGrid() {
			uIMapHome.selectReport.uISelectReportCrashReportRecord.click();
			Playback.pageLoadThreadWait();
		}

		public void Verify6040CrashReportNotGenerateWithoutVehicleAckMsg() {
			acknowledge.okWithExpectedMessage(
					"(6040) Crash Report can not generate without vehicle#. Motorist/Non-Motorist tab should have minimum one record.");

		}

		public void CloseCrashPDFWindow() {
			WebDriver CrashPDF = objectIdentification.windowHandle.switchToWindowUsingFormName("frmCitation_Id");
			CrashPDF.close();
		}

		public void SelectThreeReportsFromOthersCategoryInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.selectReport.uISelectReportsResultTable, "CAD Activity Detail");
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.selectReport.uISelectReportsResultTable, "Case Details Report");
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.selectReport.uISelectReportsResultTable, "Roll Calls Report");

		}

		public void ClickNameMineImageInGrid() {
			uIMapHome.selectReport.uISelectReportOthersNameMiningImage.click();
		}

		public void ClickDetentionRecordInGrid() {
			uIMapHome.selectReport.uISelectReportDetentionRecord.click();
		}

		public void ClickCommonNamesInGrid() {
			uIMapHome.selectReport.uICommonNamesRecord.click();
			// confirm.yes();
		}

		public void VerifyRecordCountWarrant() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 1"));
		}

		public void VerifyRecordCountName() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 1"));
		}

		public void VerifyRecordCountArrest() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 1"));
		}

		public void VerifyRecordCountPersonnel() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 36"));
		}

		public void VerifyRecordCountCallSearch() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 36"));
		}

		public void VerifyRecordCountCaseSearch() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 36"));
		}

		public void GetRecordCount(String count) {
			Playback.testContext.setAttribute(count, uIMapHome.selectReport.uIRecordCountTextView.getText());
		}

		public void VerifyRecordCount(String count) {
			verify.ExpectedValueIsTrue(uIMapHome.selectReport.uIRecordCountTextView.getText().contains(count),
					"Verify record count");
		}

		public void ClickVEHTowRotationInGrid() {
			uIMapHome.selectReport.uIVEHTowRotationsRecord.click();
		}

		public void ClickPhotoLineupInGrid() {
			uIMapHome.selectReport.uIPhotoLineupRecord.click();
		}

		public void TakeScreenshot() {
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			// Playback.TakeScreenshot(HomeScripts.HomeTestContext,
			// "TowRotationPrintReport");
		}

		public void ClickCallSimpleListInGrid() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.scrollIntoView(uIMapHome.selectReport.uICallSimpleListRecord);

			uIMapHome.selectReport.uICallSimpleListRecord.click();

		}

		public void ClickCallDetailReportSSRSInGrid() {
			uIMapHome.selectReport.uICallDetailReportSSRSRecord.click();

		}

		public void ClickCallDetailReportInGrid() {
			uIMapHome.selectReport.uICallDetailReportRecord.click();

		}

		public void clickUnitRunAssignmentSummaryReport() {
			Playback.driver.findElement(By.xpath("//img[@class='ighg_HGridExpandButton']")).click();
			Playback.controlReadyThreadWait();
			uIMapHome.selectReport.uIUnitRunAssignmentSummaryReport.click();
		}

		public void SelectRandomGridCheckboxes() {
			uIMapHome.selectReport.uISelectReportsResultTable.click();
			uIMapHome.selectReport.uISelectReportsResultTable.click();
			objectIdentification.randomIdentify
					.selectRandomGridRowsCheckboxes(uIMapHome.selectReport.uISelectReportsResultTable);
		}

		public void ClosePnxReportScreen() {
			objectIdentification.windowHandle.switchToWindowUsingFormName("frmPnxRpt").close();
		}

		public void ClickPrintSelectedReportButton() {
			uIMapHome.selectReport.uIPrintSelectedReportButton.click();
		}

		public void ClickConsolidatedReportButton() {
			uIMapHome.selectReport.uIConsolidatedReportButton.click();
		}

		public void ClickCallSummaryReport() {
			uIMapHome.selectReport.uICallSummaryRecord.click();
		}

		public void ClickCitationSummaryReport() {
			uIMapHome.selectReport.uICitationSummaryRecord.click();
		}

		public void ClickCitationSummaryReportRecord() {
			uIMapHome.selectReport.uICitationSummaryReportsRecord.click();
		}

		public void ClickCitationsbyOfficersReportRecord() {
			uIMapHome.selectReport.uICitationsbyOfficersRecord.click();
		}

		public void ClickCitationsbyStatutesReportRecord() {
			uIMapHome.selectReport.uICitationsbyStatutesRecord.click();
		}

		public void ClickCivilPaymentReportRecord() {
			uIMapHome.selectReport.uICivilPaymentRecord.click();
		}

		public void VerifyRecordCountCrashSearch() {
			verify.ExpectedValueIsTrue(
					uIMapHome.selectReport.uIRecordCountTextView.getText().contains("Record Count: 109"));
		}

		public void clickAccountabilityTagReportInGrid() {
			uIMapHome.selectReport.uIAccountabilityTagReport.click();
		}

		public void clickAccountabilityIDReportInGrid() {
			uIMapHome.selectReport.uIAccountabilityIDReport.click();
		}

		public void ClickPhotoLineupReportInGrid() {
			uIMapHome.selectReport.uIPhotoLineupReportRecord.click();
		}

		public void ClickPursuitIncidentReport() {
			uIMapHome.selectReport.uIPursuitIncidentReportRecord.click();
			Playback.controlReadyThreadWait();
			Playback.threadWait();
		}

		public void ClickIncidentAnalysisReport() {
			uIMapHome.selectReport.uIIncidentAnalysisReportRecord.click();
			Playback.controlReadyThreadWait();
			Playback.threadWait();
		}

		public void ClickReportManageReport() {
			uIMapHome.selectReport.uIReportManagerRecord.click();
			Playback.controlReadyThreadWait();
			Playback.threadWait();
		}

		public void ClickQAFormReportInGrid() {
			uIMapHome.selectReport.uIQAFormReport.click();
		}

		public void ClickPreliminaryLifeSafetyPhysicalPlantSSRSInGrid() {
			uIMapHome.selectReport.uIPreliminaryLifeSafetyPhysicalPlantReport.click();
		}

		public void ClickEMSDemographicSummaryReport() {
			uIMapHome.selectReport.uIEMSDemographicSummaryReportRecord.click();
		}

		public void ClickEMSMedicationsGivenReport() {
			uIMapHome.selectReport.uIEMSMedicationsGivenReportRecord.click();
		}

		public void ClickUseOfForcePDFReport() {
			uIMapHome.selectReport.uIUseOfForcePDFReportRecord.click();
		}

		public void verifyPDFcontent() throws IOException {
			objectIdentification.readPDF.ReadFile();

		}

		public void clickCSDCMACComplianceReport() {
			uIMapHome.selectReport.uICSDCMACComplianceReport.click();
		}

		public void selectReportCheckbox() {
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapHome.selectReport.uICertificatesTable);
		}

		public void clickIndividualReportButton() {
			uIMapHome.selectReport.uIIndividualReportButton.click();
		}

		public void clickEmailReportButton() {
			uIMapHome.selectReport.uIEmailReportButton.click();
		}

		public void ClickCaseNamesInGrid() {
			uIMapHome.selectReport.uICaseNamesReport.click();
			// confirm.yes();
		}

		public void ClickEMSPatientCareDetailedReport() {
			uIMapHome.selectReport.uIEMSPatientCareDetailedReportRecord.click();
		}

		public void ClickEMSPatientCareSummaryReport() {
			uIMapHome.selectReport.uIEMSPatientCareSummaryReportRecord.click();
		}

		public void clickUOFDetailsInGrid() {
			uIMapHome.selectReport.uISelectReportUOFDetails.click();

		}

		public void selectReportInCertificatesTable() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.selectReport.uICertificatesTable,
					BaseData.getTestContextData("CertificateType"));
		}

		public void selectOrderToPayPenaltyAndAbateViolationReportInNoticesTable() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.selectReport.uINoticesTable,
					"Order to Pay Penalty and Abate Violation");
		}

		public void selectReportInCategoryTable() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.selectReport.uICategoryTable,
					BaseData.getTestContextData("CertificateType"));
		}

		public void verifyReportNameIsNotEqualToParkingCitation() {
			List<WebElement> allReports = Playback.driver.findElements(By.xpath("//td[@title='SSRS Report']"));
			for (WebElement report : allReports) {
				String reportName = report.findElement(By.xpath("//td[@title='SSRS Report']/..//td[4]")).getText();
				verify.ExpectedPropertyValueIsNotEqual("Parking Citation", reportName);
			}

		}

		public void selectCheckBoxInReportInCertificatesTable() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.selectReport.uICertificatesTable, BaseData.getTestContextData("CertificateType"));
			Playback.popupThreadWait();
		}

		public void clickCertificateOfInspectionReportInGrid() {
			uIMapHome.selectReport.uICertificateOfInspectionReport.click();

		}

		public void clickNoticeOfViolationsAndOrderToCorrectReportInGrid() {
			uIMapHome.selectReport.uINoticeOfViolationReport.click();

		}

		public void verifyAtReportName(int rowIndex) {
			List<WebElement> reportnameCells = objectIdentification.manualIdentify
					.getGridRowCells(uIMapHome.selectReport.uISelectReportsResultTable, rowIndex);
			for (WebElement ele : reportnameCells) {
				if (ele.isDisplayed() && ele.getText().contains(BaseData.getNamesModuleValue("ReportName"))) {
					verify.ExpectedPropertyValueIsEqual(ele.getText(), BaseData.getNamesModuleValue("ReportName"));
					System.out.println("Verified Name");
				}
			}

		}

		public void clickUseOfForceReport() {
			uIMapHome.selectReport.uIUseOfForceReport.click();

		}

		public void clickAddressDetailReportInGrid() {
			uIMapHome.selectReport.uIAddressDetailReportRecord.click();

		}

		public void ClickCADSummaryDateSpecificReport() {
			uIMapHome.selectReport.uICADSummaryDateSpecificRecord.click();
		}

		public void selectDBRCitationWrittenCountsCheckboxInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.selectReport.uISelectReportMainResultTable, "DBR Citation Written Counts");
		}

		public void selectApprovedReport() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.selectReport.uIReportSearchTable,
					"Approved Report");
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			if (Playback.browserType == "IE") {
				objectIdentification.windowHandle.switchToWindowUsingURL("frmCustomRpt.aspx").close();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
			}

		}

		public void verifyReportNameAsAlarmCFS() {
			String text = uIMapHome.selectReport.uIAlarmCFSRecord.getText();
			verify.ExpectedValueIsTrue(text.contains("Alarm CFS"));
		}

		public void minimizeTheScreen() {
			objectIdentification.windowHandle.minimizeTheScreen();
		}

		public void verifyReportNameAsCADActivityDetailReport() {
			String text = uIMapHome.selectReport.uICADActivityDetailReport.getText();
			verify.ExpectedValueIsTrue(text.contains("CAD Activity Detail Report"));
		}

		public void clickUCRDomesticViolenceReport() {
			uIMapHome.selectReport.uISelectUCRDomesticViolenceReport.click();
		}

		public void downloadReport() {
			objectIdentification.readPDF.DownloadReports();
		}

		public void SaveReportToLocation(String PDFname) {
			// WindowsControl.ReportStatusPDFWindow.OpenSaveBrowseWindow();
			// WindowsControl.FileBrowserWindow.EnterSaveFileName(Randomized.ManualPlusRandomString("Incidnet
			// Report", 5));
			// WindowsControl.FileBrowserWindow.ClickSave();

			objectIdentification.readPDF.SaveAsPDFfileToLocation(PDFname);
			Playback.controlReadyThreadWait();
		}

		public String readPDFContent(String reportName) {
			Playback.controlReadyThreadWait();
			Playback.threadWait(5000);
			String PDFContent = objectIdentification.readPDF.ReadPDF(reportName);
			return PDFContent;
		}

		public void verifyPDFContent(String content) {
			verify.ExpectedValueIsTrue(content.contains(BaseData.getHomeModuleValue("VinNo")));
		}

		public void selectCheckBoxUsingAtOthersType1() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.selectReport.uISelectReportOthersResultTable, BaseData.getHomeModuleValue("OthersType1"));
			Playback.popupThreadWait();

		}

		public void selectCheckBoxUsingAtOthersType() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.selectReport.uISelectReportOthersResultTable, BaseData.getHomeModuleValue("OthersType"));
			Playback.popupThreadWait();
		}

		public void clickNoticeOfDecisionOnRequestForTimeExtensionInGrid() {
			uIMapHome.selectReport.uINoticeOfDecisionOnRequestForTimeExtensionReport.click();

		}

		public void clickAlarmYearEndReport() {
			uIMapHome.selectReport.uIAlarmYearEndReport.click();
		}

		public void closePnxReportServerScreen() {
			objectIdentification.windowHandle.switchToWindowUsingFormName("frmPnxSQLRpt").close();
		}

		public void switchToKPITempPDFScreen() {
			objectIdentification.windowHandle.switchToWindowUsingURL("KPITemp");

		}

		public void clickOrderToPayPenaltyRecurringViolationsReportInGrid() {
			uIMapHome.selectReport.uIOrderToPayPenaltyRecurringViolationsReport.click();
		}

		public void clickNoEntryReportInGrid() {
			uIMapHome.selectReport.uINoEntryReport.click();
		}

		public void clickNFIRSIncidentAnalysisReportInGrid() {

			uIMapHome.selectReport.uINFIRSIncidentAnalysisReport.click();
		}

		public void verifyNoOfIncidentColumnAndNoOfUnitsColumnAsSeparateColumn() {

			WebElement NoOfIncident = Playback.driver
					.findElement(By.xpath("//div[text()='Mutual Aid Type']/following::td[2]//div"));
			WebElement NoOfUnits = Playback.driver
					.findElement(By.xpath("//div[text()='Mutual Aid Type']/following::td[3]//div"));

			verify.ExpectedValueIsTrue(NoOfIncident.getText().contains("Number of Incidents"));
			verify.ExpectedValueIsTrue(NoOfUnits.getText().contains("Number of Units"));

		}

		public void clickNFIRSMutualAidSummaryReportInGrid() {

			uIMapHome.selectReport.uINFIRSMutualAidSummaryReport.click();
		}

		public void ClickCaseDetailReportInGrid() {
			uIMapHome.selectReport.uICaseDetailsReportRecord.click();

		}

		public void clickTowDetailsInGrid() {
			uIMapHome.selectReport.uITowDetailsReport.click();

		}

		public void clickEMSBillingReportWithAssessmentsReport() {
			uIMapHome.selectReport.uIEMSBillingReportWithAssessmentsReport.click();
		}

		public void clickPaymentsLedgerReportInGrid() {
			uIMapHome.selectReport.uIPaymentsLedger.click();

		}

		public void clickOfficerAccountDetailByDateReportInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.selectReport.uIReportsGridTable,
					"Officer Account Detail by Date");
		}
	}

	public class PnxReportSSRSPDFScreen {
		public void ClosePnxReportSSRSPDFScreen() {
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			uIMapHome.pnxReportSSRSPDFScreen.driver.close();
		}

		public void enterExpirationDateAsFutureDate() {
			uIMapHome.pnxReportSSRSPDFScreen.uIExpirationDateEdit.sendKeys(Randomized.getFutureDate(15));
			uIMapHome.pnxReportSSRSPDFScreen.uIExpirationDateEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void clickViewReportButton() {
			uIMapHome.pnxReportSSRSPDFScreen.uIViewReport.click();
		}

		public void verifyExpirationDateInPDF() {
			String expirationDate = uIMapHome.pnxReportSSRSPDFScreen.uIExpirationDateInPDF.getText();
			verify.ExpectedPropertyValueIsEqual(expirationDate, Randomized.getFutureDate(15));
		}

		public void verifyEffectiveDateInPDF() {
			String effectiveDate = uIMapHome.pnxReportSSRSPDFScreen.uIEffectiveDateInPDF.getText();
			verify.ExpectedPropertyValueIsEqual(effectiveDate, Randomized.getCurrentDate());
		}

		public void verifyGrantedDateInPDF() {
			String grantedDate = uIMapHome.pnxReportSSRSPDFScreen.uIGrantedDateInPDF.getText();
			verify.ExpectedPropertyValueIsEqual(grantedDate, Randomized.getFutureDate(3));
		}

		public void verifyContentInPDF(String Pdf, String content) {
			verify.ExpectedValueIsTrue(Pdf.contains(content));

		}

		public void clickPrintReportButton() {
			uIMapHome.pnxReportSSRSPDFScreen.uIPrintReport.click();
			Playback.gridLoadThreadWait();
			Playback.gridLoadThreadWait();
		}

		public void verifyNoOfIncidentColumnAndNoOfUnitsColumnAsSeparateColumn() {

			WebElement NoOfIncident = Playback.driver
					.findElement(By.xpath("//div[text()='Mutual Aid Type']/following::td[2]//div"));
			WebElement NoOfUnits = Playback.driver
					.findElement(By.xpath("//div[text()='Mutual Aid Type']/following::td[3]//div"));

			verify.ExpectedValueIsTrue(NoOfIncident.getText().contains("Number of Incidents"));
			verify.ExpectedValueIsTrue(NoOfUnits.getText().contains("Number of Units"));
		}

		public void enterAtFromDate() {
			uIMapHome.pnxReportSSRSPDFScreen.uIFromDate.sendKeys(BaseData.getHomeModuleValue("FromDate"));
		}

		public void enterToDateAsCurrentDate() {
			uIMapHome.pnxReportSSRSPDFScreen.uIToDate.sendKeys(Randomized.getCurrentDate());
		}

	}

	public class PnxReportCrystalPDFScreen {
		public void ClosePnxReportCrystalPDFScreen() {
			Playback.pageLoadThreadWait();
			uIMapHome.pnxReportSSRSPDFScreen.driver.close();
		}

		public void enterExpirationDateAsCurrentDate() {

			uIMapHome.pnxReportCrystalPDFScreen.uIExpirationDateEdit.sendKeys(Randomized.getCurrentDate());
			Playback.controlReadyThreadWait();
			uIMapHome.pnxReportCrystalPDFScreen.uIExpirationDateEdit.sendKeys(Keys.TAB);

		}

		public void clickViewReportButton() {
			uIMapHome.pnxReportCrystalPDFScreen.uIViewReport.click();
			Playback.pageLoadThreadWait();
		}

		public void verifyLocalIDAndStateNoAndSystemID() {
			String[] alltext = { "" };
			List<WebElement> allElements = uIMapHome.pnxReportCrystalPDFScreen.uItablecontent;
			for (WebElement element : allElements) {
				String text = element.getText();
				alltext = text.split("");
			}

			for (int i = 0; i < alltext.length; i++) {
				if (alltext[i].equals("SystemID#: ")) {
					verify.ExpectedValueIsTrue(true);
				} else if (alltext[i].equals("55")) {
					verify.ExpectedValueIsTrue(true);
				} else if (alltext[i].equals("Local ID:")) {
					verify.ExpectedValueIsTrue(true);
				} else if (alltext[i].equals("563")) {
					verify.ExpectedValueIsTrue(true);
				} else if (alltext[i].equals("State Reg#:")) {
					verify.ExpectedValueIsTrue(true);
				} else if (alltext[i].equals("356")) {
					verify.ExpectedValueIsTrue(true);
				}
			}

		}

		public void selectAtAccountNameOrOccupancyNameOptionInDropdown() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapHome.pnxReportCrystalPDFScreen.uIAccountNameOccupancyNameDdn,
					BaseData.getHomeModuleValue("NameType"));

		}

	}

	public class PnxCustomReportPDFScreen {

		public void EnterRefText() {
			uIMapHome.pnxCustomReportPDFScreen.uIEnterRefTextEdit.sendKeys(Randomized.randomString(7));
		}

		public void VerifyIncludeEmployeeSignatureDefaultAsYes() {
			verify.ExpectedPropertyValueIsEqual("Yes", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapHome.pnxCustomReportPDFScreen.uIIncludeEmployeeSignatureComboBox));
		}

		public void ClickViewReportButton() {
			uIMapHome.pnxCustomReportPDFScreen.uIViewReportButton.click();
		}

		public void CloseScreen() {
			uIMapHome.pnxCustomReportPDFScreen.driver.close();
		}

		public void selectIncludeQAFormAsYes() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapHome.pnxCustomReportPDFScreen.uIIncludeQAFormCombobox, "Yes");

		}

		public void selectIncludeQAFormAsNo() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapHome.pnxCustomReportPDFScreen.uIIncludeQAFormCombobox, "No");
		}

		public void enterAtFromDate() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			uIMapHome.pnxCustomReportPDFScreen.uIFromDateEdit.sendKeys(BaseData.getHomeModuleValue("FromDate"));
		}

		public void enterToDate() {
			Playback.controlReadyThreadWait();
			uIMapHome.pnxCustomReportPDFScreen.uIToDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void enterAtToDate() {
			Playback.controlReadyThreadWait();
			uIMapHome.pnxCustomReportPDFScreen.uIToDateEdit.sendKeys(BaseData.getHomeModuleValue("ToDate"));
		}

		public void clickEmailReportButton() {
			Playback.controlReadyThreadWait();
			uIMapHome.pnxCustomReportPDFScreen.uIEmailReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtFromEmailID() {
			uIMapHome.pnxCustomReportPDFScreen.uIFromEmail.sendKeys(BaseData.getHomeModuleValue("FromEmailID"));
		}

		public void enterAtToEmailID() {
			uIMapHome.pnxCustomReportPDFScreen.uIToEmail.sendKeys(BaseData.getHomeModuleValue("ToEmailID"));
		}

		public void enterAtSubject() {
			uIMapHome.pnxCustomReportPDFScreen.uIEmailSubject.sendKeys(BaseData.getHomeModuleValue("Subject"));
		}

		public void enterAtEmailMessage() {
			uIMapHome.pnxCustomReportPDFScreen.uIEmailMessage.sendKeys(BaseData.getHomeModuleValue("Message"));
		}

		public void clickAtSendEmailButton() {
			Playback.controlReadyThreadWait();
			uIMapHome.pnxCustomReportPDFScreen.uISendEmailButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtEmailSentMessageDisplayed() {
			String msg = uIMapHome.pnxCustomReportPDFScreen.uIEmailSentMessage.getText();
			verify.ExpectedValueIsTrue(msg.contains("Email is Sent"));
		}

		public void verifyReportIsOpened() {
			String text = uIMapHome.pnxCustomReportPDFScreen.uIReportStatusLabel.getText();
			verify.ExpectedValueIsNotTrue(text.contains("NullReferenceException"));
		}
	}

	public class AllImagesScreen {
		public void ClickPictureEditIcon() {
			Playback.controlReadyThreadWait();
			uIMapHome.allImagesScreen.uIImageEditorButton.click();
		}

		public void CloseScreen() {
			uIMapHome.allImagesScreen.driver.close();
		}

		public void ClickDeleteIcon() {
			Playback.controlReadyThreadWait();
			uIMapHome.allImagesScreen.uIDeleteImageButton.click();
		}

		public void VerifyConfirmationDeleteMessage() {
			if (Playback.browserType == "Chrome") {
				confirm.yesWithExpectedMessage("(4)     Do you really want to delete?");
			} else
				confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void VerifyImage1DeletedSuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(uIMapHome.allImagesScreen.uIBottomLeftSideStatusBar.getText()
					.contains("1004 - Deletion Successful"));
		}

		public void ClickCheckedCheckbox() {
			uIMapHome.allImagesScreen.uIActiveCheckBox.click();
		}

		public void ClickUpdateButton() {
			uIMapHome.allImagesScreen.uIUpdateButton.click();
		}

		public void VerifyImageDeletedSuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(uIMapHome.allImagesScreen.uIBottomLeftSideStatusBar.getText()
					.contains("1004 - Deletion Successful"));
		}

		public void Close() {
			uIMapHome.allImagesScreen.driver.close();
		}

		public void ClickShowAllImagesCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapHome.allImagesScreen.uIShowAllImagesCheckBox.click();
		}

		public void ClickFullImageButton() {
			Playback.controlReadyThreadWait();
			uIMapHome.allImagesScreen.uIZoomButton.click();
		}

		public void ClickAddNewButton() {
			uIMapHome.allImagesScreen.uIAddNewButton.click();
		}

		public void clickActiveCheckboxWithConfirmMsg() {
			uIMapHome.allImagesScreen.uIActiveCheckBox.click();
			popup.confirm.yes();
		}

		public void clickZoomIcon() {
			uIMapHome.allImagesScreen.uIZoomButton.click();

		}

		public void clickResetButton() {
			uIMapHome.allImagesScreen.uIResetButton.click();
		}

		public void clickMobileDeviceCameraButton() {
			uIMapHome.allImagesScreen.uIMobileDeviceCamera.click();
		}

		public void verifyNoErrorWindowOpens() {
			Set<String> allWindows = objectIdentification.windowHandle.collectWindowHandles();
			int size = allWindows.size();
			verify.ExpectedIntergerValueIsEqualToActual(size, 4);
		}

	}

	public class Attachment {

		public void ClickAddFilesButton() {
			uIMapHome.attachment.uIAddFilesButton.click();
		}

		public void SelectCategory() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapHome.attachment.uICategoryComboBox);
		}

		public void ClickSelectButton() {
			Playback.waitForControlReady();
			uIMapHome.attachment.uISelectButton.click();
		}

		public void ClickAddButton() {
			uIMapHome.attachment.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectFile()//////
		{
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "img4");
			// WindowsControl.FileBrowserWindow.ClickOpen();
			objectIdentification.filesHandle.fileAttach.fileUpload("img2.png");
		}

		public void selectFolder()//////
		{
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "img4");
			// WindowsControl.FileBrowserWindow.ClickOpen();
			objectIdentification.filesHandle.fileAttach.folderUpload("folderAttachment");
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void Close() {
			Playback.driver.close();

		}

		public void VerifyAddedAttachementExistInTheGrid(int rowCount) {
			verify.ExpectedIntergerValueIsEqualToActual(rowCount,
					objectIdentification.manualIdentify.getGridTableRowsCount(uIMapHome.attachment.uIAttachmentsTable));
		}

		public void VerifyAddedAttachementFolderWiseExistInTheGrid(int rowCount) {
			verify.ExpectedIntergerValueIsEqualToActual(rowCount, objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapHome.attachment.uIAttachmentsFolderTable));
		}

		public void SelectImageFile() {
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "img5.jpg");
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.ClickOpen();
			objectIdentification.filesHandle.fileAttach.fileUpload("img2.png");
		}

		public void ClickRefreshButton() {
			uIMapHome.attachment.uIRefreshButton.click();
		}

		public void SelectPDFFile() {
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "IncidentRpt.pdf");
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.ClickOpen();
			objectIdentification.filesHandle.fileAttach.fileUpload("Crash.pdf");
		}

		public void SelectAtCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.attachment.uICategoryComboBox,
					BaseData.getHomeModuleValue("Category"));
		}

		public void ClickFolderRadioButton() {
			uIMapHome.attachment.uIFolderRadioButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickSingleFileRadioButton() {
			uIMapHome.attachment.uISingleFileRadioButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickBulkUploadRadioButton() {
			uIMapHome.attachment.uIBulkUploadRadioButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickFolderAddButton() {
			uIMapHome.attachment.uIFolderAddButton.click();
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void selectTextFile() {
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "IncidentRpt.pdf");
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.ClickOpen();
			objectIdentification.filesHandle.fileAttach.fileUpload("TextDoc1.txt");
		}

		public void verifyShowInCallDetailsCheckbox() {
			verify.ExpectedValueIsTrue(uIMapHome.attachment.uIShowInCallDetailsCheckBox.isDisplayed());
		}

		public void clickShowInCallDetailsCheckbox() {
			uIMapHome.attachment.uIShowInCallDetailsCheckBox.click();
		}

		public void clickAttachmentUsingMobileDeviceButton() {
			uIMapHome.attachment.uIAttachmentUsingMobileDeviceButton.click();
		}
		public void selectFileInTheGrid() {                                                                        

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.attachment.uIAttachmentsFolderTable, "K9 Incident Detail.PDF");

			}
	}

	public class GetAttachment {

		public void Close() {
			uIMapHome.getAttachment.driver.close();

		}

	}

	public class ManageComments {
		public void EnterText() {
			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.manageComments.uICommentsRichTextEdit).click();
			actions.sendKeys(Randomized.randomString(500)).build().perform();
			Playback.waitForControlReady();
		}

		public void Enter100WordsRichText() {
			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.manageComments.uICommentsRichTextEdit).click();
			actions.sendKeys(Randomized.randomString(150)).build().perform();
			Playback.waitForControlReady();
		}

		public void ClickResetButton() {
			uIMapHome.manageComments.uIResetButton.click();
		}

		public void SaveAndCloseScreen() {
			uIMapHome.manageComments.uISaveCloseButton.click();
			confirm.yes();
		}

		public void Save() {
			uIMapHome.manageComments.uISaveButton.click();
			confirm.yes();
		}
	}

	public class UpdateImageScreen {
		public void EnterDate() {
			uIMapHome.updateImageScreen.uIPhotoDateEdit.click();
			uIMapHome.updateImageScreen.uIPhotoDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterTime() {
			uIMapHome.updateImageScreen.uITimeEdit.click();
			uIMapHome.updateImageScreen.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterCrashDiagramImage() {
			// uIMapHome.updateImageScreen.uIFileUploadTextViewButton.sendKeys(Playback.TestResourceFolderPath
			// + "img4.jpg");
		}

		public void TabDateTime() {
			uIMapHome.updateImageScreen.uIPhotoDateEdit.sendKeys(Keys.TAB);
			uIMapHome.updateImageScreen.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyImageUploaded() {
			verify.ExpectedValueIsTrue(uIMapHome.updateImageScreen.uIUpdatedImage.isDisplayed());
		}

		public void SaveAndClose() {
			uIMapHome.updateImageScreen.uISaveCloseButton.click();
			confirm.yes();
		}

		public void Save() {
			uIMapHome.updateImageScreen.uISaveButton.click();

		}

		public void ClickSaveAndCloseButton() {
			uIMapHome.updateImageScreen.uISaveCloseButton.click();

		}

		public void Close() {
			uIMapHome.updateImageScreen.driver.close();

		}

		public void clickChooseFileButtonAndSelectPNGFile() {

			Playback.controlReadyThreadWait();
			Playback.actionDriver.moveToElement(uIMapHome.updateImageScreen.uIFileUploadTextViewButton).click().build()
					.perform();
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			objectIdentification.filesHandle.fileAttach.fileUpload("Profile.png");
		}

		public void clickChooseFileButtonAndSelectJPGFile() {

			Playback.controlReadyThreadWait();
			Playback.actionDriver.moveToElement(uIMapHome.updateImageScreen.uIFileUploadTextViewButton).click().build()
					.perform();
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			objectIdentification.filesHandle.fileAttach.fileUpload("Picture.jpg");
		}

		public void switchtoUploadedImage() {

			objectIdentification.windowHandle.switchToFrame("frmDBImage");

		}

	}

	public class ImageFullViewScreen {
		public void ClickResetButton() {
			uIMapHome.imageFullViewScreen.uIResetButton.click();
		}

		public void clickDeleteIcon() {
			uIMapHome.imageFullViewScreen.uIDeleteButton.click();

		}

		public void verifyDeleteConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void close() {
			uIMapHome.imageFullViewScreen.driver.close();
		}
	}

	public class ViewPrintStatusScreen {
		public void VerifycurrentdateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.viewPrintStatusScreen.uIPrintStatusTable, "Date/Time", rowIndex));
		}
	}

	public class PhoneBookSearch {

		public void ClickNewContactButton() {
			uIMapHome.phoneBookSearch.uINewContactButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtBookName() {
			uIMapHome.phoneBookSearch.uIPhoneBookEdit.sendKeys(BaseData.getHomeModuleValue("BookName"));
			Playback.controlReadyThreadWait();
		}

		public void ClickSearchButton() {
			uIMapHome.phoneBookSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickBackButton() {
			uIMapHome.phoneBookSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtLastFirstNameAppearsAsFirstRowInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("LastName"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.phoneBookSearch.uIPhoneBookSearchTable, "Name", rowIndex));
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("FirstName"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.phoneBookSearch.uIPhoneBookSearchTable, "Name", rowIndex));
		}

		public void VerifyAtLastFirstName1AppearsAsSecondRowInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("LastName1"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.phoneBookSearch.uIPhoneBookSearchTable, "Name", rowIndex));
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("FirstName1"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.phoneBookSearch.uIPhoneBookSearchTable, "Name", 1));
		}

		public void ClickNewPhoneBookButton() {
			uIMapHome.phoneBookSearch.uINewPhoneBookButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickPhoneBookLookup() {
			uIMapHome.phoneBookSearch.uIPhoneBookLookupbutton.click();
		}

		public void SelectAtPhoneBook() {
			popup.kPICodedLookup.kPIHelpSelect(BaseData.getHomeModuleValue("PhoneBook"));
		}

		public void VerifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Name"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.phoneBookSearch.uIPhoneBookSearchTable, "Name", rowIndex));
		}
	}

	public class PhoneBookContactEntry {

		public PhoneBookContactEntry() {
			if (phoneNumberTab == null)
				phoneNumberTab = new PhoneNumberTab();
			if (callBackTab == null)
				callBackTab = new CallBackTab();
			if (contactEntryHistoryTab == null)
				contactEntryHistoryTab = new ContactEntryHistoryTab();
		}

		public PhoneNumberTab phoneNumberTab = null;
		public CallBackTab callBackTab = null;
		public ContactEntryHistoryTab contactEntryHistoryTab = null;

		public void EnterAtBookName() {
			uIMapHome.phoneBookContactEntry.uIBookNameEdit.sendKeys(BaseData.getHomeModuleValue("BookName"));
		}

		public void EnterAtLastName() {
			uIMapHome.phoneBookContactEntry.uILastNameEdit.sendKeys(BaseData.getHomeModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapHome.phoneBookContactEntry.uIFirstNameEdit.sendKeys(BaseData.getHomeModuleValue("FirstName"));
		}

		public void EnterAtLastName1() {
			uIMapHome.phoneBookContactEntry.uILastNameEdit.sendKeys(BaseData.getHomeModuleValue("LastName1"));
		}

		public void EnterAtFirstName1() {
			uIMapHome.phoneBookContactEntry.uIFirstNameEdit.sendKeys(BaseData.getHomeModuleValue("FirstName1"));
		}

		public void ClickPhoneNumberTab() {
			uIMapHome.phoneBookContactEntry.uIPhoneNumberTab.click();
		}

		public void SaveNClose() {
			uIMapHome.phoneBookContactEntry.uISaveNCloseButton.click();
			confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void Save() {
			uIMapHome.phoneBookContactEntry.uISaveButton.click();
			confirm.yes();
		}

		public void ClickSaveButton() {
			uIMapHome.phoneBookContactEntry.uISaveButton.click();
		}

		public void EnterAtMiddleName() {
			uIMapHome.phoneBookContactEntry.uIMiddleNameEdit.sendKeys(BaseData.getHomeModuleValue("MiddleName"));
		}

		public void EnterAtAddress() {
			uIMapHome.phoneBookContactEntry.uIAddressEdit.sendKeys(BaseData.getHomeModuleValue("Address"));
		}

		public void ClickAllTabs() {
			uIMapHome.phoneBookContactEntry.uIPhoneNumberTab.click();
			uIMapHome.phoneBookContactEntry.uICallBackTab.click();
			uIMapHome.phoneBookContactEntry.uICustomTab.click();
			uIMapHome.phoneBookContactEntry.uIHistoryTab.click();
		}

		public void ClickCallBackTab() {
			uIMapHome.phoneBookContactEntry.uICallBackTab.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickHistoryTab() {
			uIMapHome.phoneBookContactEntry.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
		}

		public void Close() {
			uIMapHome.phoneBookContactEntry.driver.close();
			Playback.pageLoadThreadWait();
		}

	}

	public class PhoneNumberTab {

		public void SelectPhoneAsHome() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneComboBox.sendKeys("H - Home");
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneComboBox.sendKeys(Keys.TAB);
		}

		public void SelectPhoneAsCell() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneComboBox.sendKeys("C - Cell");
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneComboBox.sendKeys(Keys.TAB);
			Playback.waitForControlReady();
		}

		public void SelectPhoneAsWork() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneComboBox.sendKeys("W - Work");

		}

		public void SeletRowByAsCell() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneNumberTable, "Cell");
		}

		public void EnterPhoneNumber() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumber(10)));
		}

		public void ClickPrimaryCheckbox() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPrimaryCheckbox.click();

		}

		public void EnterAtExtension() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIExtensionEdit
					.sendKeys(BaseData.getHomeModuleValue("Extension"));
		}

		public void ClickAddButton() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIAddButton.click();
		}

		public void VerifyPhoneTypeAsHomeAppearsInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("H - Home", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneNumberTable, "Phone Type", rowIndex));

		}

		public void VerifyPhoneTypeAsCellAppearsInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Cell", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneNumberTable, "Phone Type", rowIndex));

		}

		public void VerifyPhoneTypeAsWorkAppearsInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("W - Work", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneNumberTable, "Phone Type", rowIndex));

		}

		public void VerifyAtExtension(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Extension"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneNumberTable, "Extn", rowIndex));
		}

		public void VerifyPrimaryCheckboxChecked(int rowIndex) {

			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneNumberTable, "Primary", rowIndex)
					.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
		}

		public void EnterAtPhoneNumber() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneEdit.click();
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneEdit.sendKeys(BaseData.getHomeModuleValue("PhoneNo"));
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIPhoneEdit.sendKeys(Keys.TAB);
		}

		public void EnterExtension() {
			uIMapHome.phoneBookContactEntry.phoneNumberTab.uIExtensionEdit.sendKeys(Randomized.randomString(3));
		}
	}

	public class CallBackTab {
		public void SelectAtRoster() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapHome.phoneBookContactEntry.callBackTab.uIRosterComboBox,
					BaseData.getHomeModuleValue("Roster"));
			uIMapHome.phoneBookContactEntry.callBackTab.uIRosterComboBox.sendKeys(Keys.TAB);
		}

		public void EnterComments() {
			uIMapHome.phoneBookContactEntry.callBackTab.uICommentsEdit.sendKeys(Randomized.randomString(25));
		}

		public void EnterPeriodFromDateAsPreviousDate() {
			uIMapHome.phoneBookContactEntry.callBackTab.uIPeriodFromDateEdit
					.sendKeys(Randomized.getPreviousDate(5, "MM/dd/yyyy"));
			uIMapHome.phoneBookContactEntry.callBackTab.uIPeriodFromTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void EnterPeriodToDateAsFutureDate() {
			uIMapHome.phoneBookContactEntry.callBackTab.uIPeriodToDateEdit
					.sendKeys(Randomized.getFutureDate(5, "MM/dd/yyyy"));
			uIMapHome.phoneBookContactEntry.callBackTab.uIPeriodToTimeEdit.sendKeys(Randomized.getCurrentTime());
		}
	}

	public class ContactEntryHistoryTab {
		public void TabDateTime() {
			uIMapHome.phoneBookContactEntry.contactEntryHistoryTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapHome.phoneBookContactEntry.contactEntryHistoryTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtLog() {
			uIMapHome.phoneBookContactEntry.contactEntryHistoryTab.uILogEdit
					.sendKeys(BaseData.getHomeModuleValue("Log"));
		}

		public void ClickAdd() {
			uIMapHome.phoneBookContactEntry.contactEntryHistoryTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtLogInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Log"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.phoneBookContactEntry.contactEntryHistoryTab.uIHistoryTabTable, "Log", rowIndex));

		}
	}

	public class ALCScreen {

		public ALCScreen() {
			if (aLCPFTab == null)
				aLCPFTab = new ALCPFTab();
			if (aLCGroupTab == null)
				aLCGroupTab = new ALCGroupTab();
		}

		public ALCPFTab aLCPFTab = null;
		public ALCGroupTab aLCGroupTab = null;

		public void SaveScreen() {
			uIMapHome.aLCScreen.uISaveButton.click();
			confirm.yes();
		}

		public void SaveAndClose() {
			uIMapHome.aLCScreen.uISaveCloseButton.click();
			confirm.yes();
		}

		public void CloseScreen() {
			uIMapHome.aLCScreen.driver.close();
		}

		public void ClickPFTab() {
			uIMapHome.aLCScreen.uIPFNumberTab.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickGroupTab() {
			uIMapHome.aLCScreen.uIGroupTab.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifySuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapHome.aLCScreen.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"),
					"Addition Successful");
		}

		public void clickPrintButton() {
			uIMapHome.aLCScreen.uIPrintButton.click();
			Playback.controlReadyThreadWait();

		}

		public void verifyAtSetPermissionForRedact() {
			String permission = uIMapHome.aLCScreen.uISetPermissionForEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual("Redact", permission);
		}

		public void verifyAtSetPermissionForIncident() {
			String permission = uIMapHome.aLCScreen.uISetPermissionForEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(permission.equalsIgnoreCase("Incident Report"));
		}

		public void verifyAtSetPermissionForArrestNo(String arrestNo) {
			String permission = uIMapHome.aLCScreen.uISetPermissionForEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(permission.equalsIgnoreCase(arrestNo));
		}

		public void clickSaveButton() {
			uIMapHome.aLCScreen.uISaveButton.click();
		}

		public void verifyNoDataPresentAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(7) No data present");
			}

			else {
				popup.switchToAcknowledge();
				Playback.controlReadyThreadWait();
				popup.acknowledge.okWithExpectedMessage("(7) No data present");
			}
		}

		public void clickResetButton() {
			uIMapHome.aLCScreen.uIResetButton.click();
		}

	}

	public class ALCPFTab {
		public void SelectAtAction() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCPFTab.uIActionComboBox,
					BaseData.getHomeModuleValue("Action"));
		}

		public void EnterAtPFCode() {

			uIMapHome.aLCScreen.aLCPFTab.uIPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("PFCode"));
		}

		public void EnterAtPFCode1() {
			uIMapHome.aLCScreen.aLCPFTab.uIPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("PFCode1"));
		}

		public void ClickAddButton() {
			uIMapHome.aLCScreen.aLCPFTab.uIAddButton.click();
		}

		public void VerifyActionAsDenyInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Deny", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.aLCScreen.aLCPFTab.uIPFGridResult, "Allow/Deny", rowIndex));
		}

		public void VerifyAtActionInGrid(int rowIndex) {
			if (rowIndex == 0) {
				verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Action"),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapHome.aLCScreen.aLCPFTab.uIPFGridResult, "Allow/Deny", rowIndex));
			} else {
				verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Action" + rowIndex + ""),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapHome.aLCScreen.aLCPFTab.uIPFGridResult, "Allow/Deny", rowIndex));
			}

		}

		public void VerifyAtAllowOrDenyInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("AllowOrDeny"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.aLCScreen.aLCPFTab.uIPFGridResult, "Allow/Deny", rowIndex));
		}

		public void VerifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Name"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.aLCScreen.aLCPFTab.uIPFGridResult, "Name", rowIndex));
		}

		public void VerifyAtPFDescription() {
			uIMapHome.aLCScreen.aLCPFTab.uIPFDescriptionEdit.sendKeys(BaseData.getHomeModuleValue("PFDescription"));
		}

		public void selectActionAsDeny() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCPFTab.uIActionComboBox,
					"Deny");

		}

		public void selectAtActionInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.aLCScreen.aLCPFTab.uIPFGridResult, BaseData.getHomeModuleValue("Action"));
		}

		public void SelectAtAction1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCPFTab.uIActionComboBox,
					BaseData.getHomeModuleValue("Action1"));
		}

		public void deleteAtAction1() { // Added by Abi
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapHome.aLCScreen.aLCPFTab.uIPFGridResult, BaseData.getHomeModuleValue("Action1"));
			popup.confirm.yes();
		}

		public void ClickUpdateButton() { // Added by Abi
			uIMapHome.aLCScreen.aLCPFTab.uIUpdateButton.click();
		}
	}

	public class ALCGroupTab {
		public void SelectAtAction() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uIActionComboBox,
					BaseData.getHomeModuleValue("Action"));
		}

		public void selectActionAsDeny() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uIActionComboBox,
					"Deny");

		}

		public void selectDivision() {
			Playback.threadWait(600);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uIDivisionComboBox);
		}

		public void selectAtSection() {
			Playback.threadWait(600);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uISectionComboBox,
					BaseData.getHomeModuleValue("Section"));
		}

		public void selectAtDivision() {
			Playback.threadWait(600);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uIDivisionComboBox,
					BaseData.getHomeModuleValue("Division"));
		}

		public void selectAtDivision1() {
			Playback.threadWait(600);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uIDivisionComboBox,
					BaseData.getHomeModuleValue("Division1"));
		}

		public void selectTitle() {
			Playback.threadWait(600);
			objectIdentification.randomIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uITitleComboBox);
		}

		public void SelectSection() {
			Playback.threadWait(600);
			objectIdentification.randomIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uISectionComboBox);
		}

		public void selectAtSquad() {
			Playback.threadWait(600);
			uIMapHome.aLCScreen.aLCGroupTab.uISquadCodeEdit.sendKeys(BaseData.getTestContextData("SquadCode"));
		}

		public void ClickAdd() {
			Playback.threadWait(600);
			uIMapHome.aLCScreen.aLCGroupTab.uIAddButton.click();
		}

		public void VerifyAtActionInGrid(int rowIndex) {
			if (rowIndex == 0) {
				verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Action"),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapHome.aLCScreen.aLCGroupTab.uIGroupGridTable, "Action", rowIndex));
			} else {
				verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Action" + rowIndex + ""),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapHome.aLCScreen.aLCGroupTab.uIGroupGridTable, "Action", rowIndex));
			}

		}

		public void VerifySectionLableAsSEC() {
			verify.ExpectedPropertyValueIsEqual("SEC", uIMapHome.aLCScreen.aLCGroupTab.uISectionTextView.getText());
		}

		public void VerifyDivisionLableAsDIV() {
			verify.ExpectedPropertyValueIsEqual("DIV", uIMapHome.aLCScreen.aLCGroupTab.uIDivisionTextView.getText());
		}

		public void VerifySquadLableAsSQ() {
			verify.ExpectedPropertyValueIsEqual("SQ", uIMapHome.aLCScreen.aLCGroupTab.uISquadTextView.getText());
		}

		public void selectAtSection1() {
			Playback.threadWait(600);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uISectionComboBox,
					BaseData.getHomeModuleValue("Section1"));
		}

		public void selectAtTitle() { // Added by Abi
			Playback.threadWait(600);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.aLCScreen.aLCGroupTab.uITitleComboBox,
					BaseData.getHomeModuleValue("Title"));
		}

		public void verifyActionAsDenyInGrid(int rowIndex) { // Added by Abi
			verify.ExpectedPropertyValueIsEqual("Deny", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.aLCScreen.aLCGroupTab.uIGroupGridTable, "Action", rowIndex));
		}
	}

	public class GlobalMapScreen {
		public void SelectSelectOverlay() {
			uIMapHome.globalMapScreen.uISelectOverLayComboBox.click();
			objectIdentification.randomIdentify
					.selectRadControlDropDownCheckBoxes(uIMapHome.globalMapScreen.uISelectOverLayRadControlComboBox);
		}

		public void VerifyMapNamesShows() {
			verify.ExpectedValueIsTrue(uIMapHome.globalMapScreen.uIMapDisplayNameText.getText().contains("A-000000"));
		}

		public void EnterSearchTheMap() {
			uIMapHome.globalMapScreen.uISearchTheMapEdit.sendKeys(Randomized.randomString(4));
		}

		public void Close() {
			uIMapHome.globalMapScreen.driver.close();
		}

		public void VerifyMapCaseDetailsShows() {
			verify.ExpectedValueIsTrue(uIMapHome.globalMapScreen.uIMapDisplayNameText.getText().contains("18-000"));
		}

		public void verifyAtAddressInSideBar() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			String loc = BaseData.getHomeModuleValue("Location");
			WebElement SideBar = uIMapHome.globalMapScreen.uIMapDisplayNameText;
			SideBar.findElement(By.xpath(".//table/tbody/tr/td[contains(text(),'" + loc + "')]"));
			String gridRowByCellInnerText = SideBar.getText();

			verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(loc));
		}

		public void verifySelectedCaseNoShowingInMapScreen(ArrayList<String> Casenos) {
			// Reading Caseno from Search screen and Map screen and comparing
			Collections.sort(Casenos);
			WebElement Table = uIMapHome.globalMapScreen.uIMapDisplayNameText;
			List<WebElement> eles = Table.findElements(By.xpath("//table//tbody//tr//b"));
			ArrayList<String> NosMap = new ArrayList<>();

			for (WebElement ele : eles) {
				if (ele.getText().contains("-")) {
					NosMap.add(ele.getText());

				} else {
					break;
				}
			}
			Collections.sort(NosMap);

			verify.ExpectedValueIsTrue(NosMap.equals(Casenos));

		}

		public void verifySelectedCallNoShowingInMapScreen(ArrayList<String> Callnos) {
			// Reading Callno from Search screen and Map screen and comparing
			Collections.sort(Callnos);
			WebElement Table = uIMapHome.globalMapScreen.uIMapDisplayNameText;
			List<WebElement> eles = Table.findElements(By.xpath("//table//tbody//tr//b"));
			ArrayList<String> NosMap = new ArrayList<>();

			for (WebElement ele : eles) {
				if (ele.getText().contains(".")) {
					NosMap.add(ele.getText());

				} else {
					break;
				}
			}
			Collections.sort(NosMap);

			verify.ExpectedListValueIsTrue(NosMap, Callnos);

		}

		public void verifyAtLocationInSideBar() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			String loc = BaseData.getHomeModuleValue("Location");
			WebElement SideBar = uIMapHome.globalMapScreen.uIMapDisplayNameText;
			SideBar.findElement(By.xpath(".//table/tbody/tr/td[contains(text(),'" + loc + "')]"));
			String gridRowByCellInnerText = SideBar.getText();
			System.out.println(gridRowByCellInnerText);

			verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(loc));
		}

		public void verifyAtLocation1InSideBar() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			String loc = BaseData.getHomeModuleValue("Location1");
			WebElement SideBar = uIMapHome.globalMapScreen.uIMapDisplayNameText;
			SideBar.findElement(By.xpath(".//table/tbody/tr/td[contains(text(),'" + loc + "')]"));
			String gridRowByCellInnerText = SideBar.getText();

			verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(loc));
		}

		public void verifyAtLocation2InSideBar() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			String loc = BaseData.getHomeModuleValue("Location2");
			WebElement SideBar = uIMapHome.globalMapScreen.uIMapDisplayNameText;
			SideBar.findElement(By.xpath(".//table/tbody/tr/td[contains(text(),'" + loc + "')]"));
			String gridRowByCellInnerText = SideBar.getText();
			System.out.println(gridRowByCellInnerText);

			verify.ExpectedValueIsTrue(gridRowByCellInnerText.contains(loc));
		}

		public void SelectSelectOverlay1() {
			uIMapHome.globalMapScreen.uISelectOverLayComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapHome.globalMapScreen.uISelectOverLayRadControlComboBox, "Crash - Fatal");

		}
	}

	public class TextMgmt {

		public TemplatesForTab templatesForTab;

		public TextMgmt() {
			if (templatesForTab == null)
				templatesForTab = new TemplatesForTab();
		}

		public void SaveScreen() {
			uIMapHome.textMgmt.uISaveButton.click();
			confirm.yes();
		}

		public void SaveAndCloseScreen() {
			uIMapHome.textMgmt.uISaveAndCloseButton.click();
			confirm.yes();
		}

		public void EnterAtTextName() {
			uIMapHome.textMgmt.subjectTab.uITextNameEdit.sendKeys(BaseData.getHomeModuleValue("TextName"));
		}

		public void EnterRichTextAsStatementTab() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.textMgmt.uISummaryRichTabTextEdit).click();
			actions.sendKeys("Need to verify whether added text in Text Mgmt screen loads in Statement tab").build()
					.perform();
			Playback.controlReadyThreadWait();

		}

		public void EnterRichText() {
			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.textMgmt.uISummaryRichTabTextEdit).click();
			actions.sendKeys(Randomized.randomString(1000)).build().perform();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtText() {
			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.textMgmt.uISummaryRichTabTextEdit).click();
			actions.sendKeys(BaseData.getHomeModuleValue("Text")).build().perform();
			Playback.controlReadyThreadWait();
		}

		public void ClickLoadButton() {
			uIMapHome.textMgmt.uILoadButton.click();
		}

		public void SelectTemplate() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapHome.textMgmt.uITemplateComboBox);
		}

		public void EnterSummaryRichTextInIRReport() {
			Playback.controlReadyThreadWait();
			uIMapHome.textMgmt.uISummaryRichTextEdit.click();
			uIMapHome.textMgmt.uISummaryRichTextEdit.sendKeys(Keys.ENTER);
			uIMapHome.textMgmt.uISummaryRichTextEdit.sendKeys(Randomized.randomString(1000));
		}

		public void EnterNarrativeRichTextInReport() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.textMgmt.uISummaryRichTextEdit).click();
			actions.sendKeys(Randomized.randomString(500)).build().perform();
			Playback.controlReadyThreadWait();

		}

		public void Close() {
			uIMapHome.textMgmt.driver.close();
		}

		public void waitForMinAndclickRefreshButton() {
			Playback.threadWait(70000);
			uIMapHome.textMgmt.uIRefreshButton.click();
		}

		public void verifyTextAvailableInsideForm() {
			Playback.gridLoadThreadWait();

			String text = uIMapHome.textMgmt.uIFromTextFieldFilled.getText();
			verify.ExpectedValueIsTrue(text.contains("production"));

			// switchToReportStatusTextMgmtScreen();

		}

		public void verifyUpdateSucessfulStatusMsg() {
			Playback.gridLoadThreadWait();

			String text = uIMapHome.textMgmt.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1003 - Update Successful");

			// switchToReportStatusTextMgmtScreen();

		}

		public void verifyAdditionSucessfulStatusMsg() {
			Playback.gridLoadThreadWait();
			String text = uIMapHome.textMgmt.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1002 - Addition Successful");

		}

		public void SelectAtTemplate() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.textMgmt.uITemplateComboBox,
					BaseData.getHomeModuleValue("Template"));
		}

		public void verifyAutoSavingTextDisplayed() {
			String Actual = uIMapHome.textMgmt.uIAutoSaveTxt.getText();
			verify.ExpectedPropertyValueIsEqual("Auto save enabled for every [1] minutes.", Actual);
		}

		public void switchToTextTempletForm() {
			objectIdentification.windowHandle.switchToFrame(uIMapHome.textMgmt.uISummaryRichTextEdit);

		}

		public void verifyNoTextAvailableInsideForm() {
			Playback.gridLoadThreadWait();
			String text = uIMapHome.textMgmt.uIFromTextFieldEmpty.getText();
			verify.ExpectedValueIsFalse(text.contains("production"));

			// switchToReportStatusTextMgmtScreen();

		}

		public void clickTemplatesForTab() {
			uIMapHome.textMgmt.uITemplateForTab.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterSummaryRichTextAsTestAutomation() {
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame(uIMapHome.textMgmt.uISummaryRichTextEdit);
			uIMapHome.textMgmt.uIFromTextFieldEmpty.sendKeys("Test Automation");
		}

		public void clickSaveAndCloseButton() {
			uIMapHome.textMgmt.uISaveAndCloseButton.click();

		}

		public void EnterAtTextNamefor93() {
			uIMapHome.textMgmt.uISummaryRichTextEdit.sendKeys(BaseData.getTestContextData("TextName"));

		}

	}

	public class TemplatesForTab {
		public void enterAtTemplateForScreenID() {
			uIMapHome.textMgmt.templateFor.uIScreenIdEdit.sendKeys(BaseData.getHomeModuleValue("ScreenID"));
			uIMapHome.textMgmt.templateFor.uIScreenIdEdit.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapHome.textMgmt.templateFor.uIAddNewButton.click();
		}

		public void verifyAtScreenIDInGrid() {
			objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.textMgmt.templateFor.uITemplatesForResultTable, BaseData.getHomeModuleValue("ScreenID"));
		}
	}

	public class ManageNotes {
		public void SaveScreen() {
			uIMapHome.manageNotes.uISaveButton.click();
			confirm.yes();
		}

		public void SaveAndCloseScreen() {
			uIMapHome.manageNotes.uISaveAndCloseButton.click();
			confirm.yes();
		}

		public void clickSaveAndCloseScreen() {
			uIMapHome.manageNotes.uISaveAndCloseButton.click();

		}

		public void SelectAtTemplate() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.manageNotes.uITemplateComboBox,
					BaseData.getHomeModuleValue("Template"));
		}

		public void tabDateAndTime() {
			Playback.controlReadyThreadWait();
			uIMapHome.manageNotes.uIDateEdit.sendKeys(Keys.TAB);
			uIMapHome.manageNotes.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void tabPF() {
			Playback.controlReadyThreadWait();
			uIMapHome.manageNotes.uIPFEdit.sendKeys(Keys.TAB);

		}

		public void enterAtRemarks() {
			objectIdentification.windowHandle.switchToFrame(uIMapHome.manageNotes.uISummaryRichTabTextEdit);
			uIMapHome.manageNotes.uIFromTextFieldEmpty.sendKeys(BaseData.getHomeModuleValue("Remarks"));
		}

		public void ClickLoadButton() {
			uIMapHome.manageNotes.uILoadButton.click();
		}

		public void SelectTemplate() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapHome.manageNotes.uITemplateComboBox);
		}

		public void Close() {
			uIMapHome.textMgmt.driver.close();
		}

		public void verifyRichTextFieldIsFilled() {
			objectIdentification.windowHandle.switchToFrame(uIMapHome.manageNotes.uISummaryRichTabTextEdit);
			String text = uIMapHome.manageNotes.uIFromTextFieldEmpty.getText();
			System.out.println(text);
			verify.ExpectedValueIsTrue(text.contains("the"));
		}

		public void clickAddNew() {
			uIMapHome.manageNotes.uIAddNewButton.click();

		}
	}

	public class ViewPrintHistory {

		public void EnterReasonForPrintingThisReport() {
			Playback.waitForControlReady();
			uIMapHome.viewPrintHistory.uIReasonForPrintingThisReportEdit.click();
			uIMapHome.viewPrintHistory.uIReasonForPrintingThisReportEdit.sendKeys(Randomized.randomString(15));
		}

		public void ClickViewAndPintButton() {
			uIMapHome.viewPrintHistory.uIViewAndPrintButton.click();
		}

		public void VerifyAtEmailTemplateText() {
			verify.ExpectedPropertyValueIsEqual("Email Template Name:" + BaseData.getHomeModuleValue("EmailTemplate"),
					uIMapHome.viewPrintHistory.uIEmailTemplateText.getText());
		}

		public void EnterAtReason() {
			uIMapHome.viewPrintHistory.uIReasonForPrintingThisReportEdit.click();
			uIMapHome.viewPrintHistory.uIReasonForPrintingThisReportEdit
					.sendKeys(BaseData.getHomeModuleValue("Reason"));
		}

		public void ClickEmailButton() {
			uIMapHome.viewPrintHistory.uIEmailButton.click();
		}

	}

	public class Notification {
		public void verifyAtRequestPFCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("PFCode"),
					uIMapHome.notification.uIRequestedPFCodeEdit.getAttribute("value"));
		}

		public void EnterStartDateAsCurrentDate() {
			uIMapHome.notification.uIStartDateEdit.click();
			uIMapHome.notification.uIStartDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void EnterExpireDateAsFutureDate() {
			uIMapHome.notification.uIExpireDateEdit.click();
			uIMapHome.notification.uIExpireDateEdit.sendKeys(Randomized.getFutureDate(2, "MM/dd/yyyy"));
		}

		public void ClickPFRadioButton() {
			uIMapHome.notification.uIPFRadioButton.click();
			Playback.gridLoadThreadWait();
		}

		public void EnterAtPFCode() {
			uIMapHome.notification.uIPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("PFNo"));
			uIMapHome.notification.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtReportingPeriod() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.notification.uIReportingPeriodComboBox,
					BaseData.getHomeModuleValue("ReportingPeriod"));
			uIMapHome.notification.uIReportingPeriodComboBox.sendKeys(Keys.TAB);
		}

		public void SelectNotifyEvent() {
			uIMapHome.notification.uINotifyEventComboBox.click();
			Playback.controlReadyThreadWait();
			objectIdentification.randomIdentify
					.selectRadControlDropDownCheckBoxes(uIMapHome.notification.uINotifyEventRadControlComboBox, 2);
		}

		public void clickAddButton() {
			uIMapHome.notification.uIAddButton.click();
		}

		public void VerifyAtPeriod(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("ReportingPeriod"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.notification.uINotificationGridTable, "Period", rowIndex));
		}

		public void VerifyStartDateAsCurrentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapHome.notification.uINotificationGridTable, "Start Date", rowIndex));
		}

		public void VerifyExpireDateAsFutureDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(2, "MM/dd/yyyy"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.notification.uINotificationGridTable, "Expire Date", rowIndex));
		}

		public void ClickSave() {
			uIMapHome.notification.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapHome.notification.uISaveButton.click();
			confirm.yes();
		}

		public void VerifySuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(
					uIMapHome.notification.uIBottomLeftSideStatusBar.getText().contains("1003 - Update Successful"));
		}

		public void CloseScreen() {
			uIMapHome.notification.driver.close();
		}

		public void ClickDistributionListRadioButton() {
			uIMapHome.notification.uIDistributionRadioButton.click();
			Playback.gridLoadThreadWait();
		}

		public void clickEMailRadioButton() {
			uIMapHome.notification.uIEmailRadioButton.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickSendTextMessageCheckBox() {
			uIMapHome.notification.uISendTextMessageCheckBox.click();
			Playback.gridLoadThreadWait();
		}

		public void selectAtDistributionList() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.notification.uIDistributionListComboBox,
					BaseData.getHomeModuleValue("DistributionList"));
			uIMapHome.notification.uIDistributionListComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtNotifyEvent() {
			Playback.controlReadyThreadWait();
			uIMapHome.notification.uINotifyEventComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapHome.notification.uINotifyEventRadControlComboBox, BaseData.getHomeModuleValue("NotifyEvent"));
			uIMapHome.notification.uINotifyEventComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyAtNotifyEvent(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("NotifyEvent"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.notification.uINotificationGridTable, "Notify Event", rowIndex));
		}

		public void enterAtEmail() {
			uIMapHome.notification.uIEmailEdit.sendKeys(BaseData.getHomeModuleValue("Email"));
		}

		public void verifyEmailAdressFieldIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.notification.uIEmailEdit.isEnabled());
		}

		public void enterAtName() {
			uIMapHome.notification.uINameEdit.sendKeys(BaseData.getHomeModuleValue("Name"));
		}

		public void verifyEmailAddressFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.notification.uIEmailEdit.isDisplayed());
		}

		public void verifyReportingPeriodFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.notification.uIReportingPeriodComboBox.isDisplayed());
		}

		public void verifyEmailNotifyEventIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.notification.uINotifyEventRadControlComboBox.isEnabled());
		}

		public void saveNCloseScreen() {
			uIMapHome.notification.uISaveCloseButton.click();
			confirm.yes();
		}

		public void clickRequestedByPFInfoButton() {
			uIMapHome.notification.uIRequestedByPFInfoIcon.click();

		}

		public void enterAtRequestedbyPF() {
			uIMapHome.notification.uIRequestedPFCodeEdit.clear();
			uIMapHome.notification.uIRequestedPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("RequestedbyPF"));
			uIMapHome.notification.uIRequestedPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyInactiveCodeSelectedAwckMsg() {
			Playback.pageLoadThreadWait();
			popup.acknowledge.okWithExpectedMessage("(1119) Warning – Inactive code selected");
		}

		public void enterAtRequestedbyPF1() {
			uIMapHome.notification.uIRequestedPFCodeEdit.clear();
			uIMapHome.notification.uIRequestedPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("RequestedbyPF1"));
			uIMapHome.notification.uIRequestedPFCodeEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void verifyAtRequestedByInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.notification.uINotificationGridTable, "Requested By");
			System.out.println(gridTableColumnValues);
			for (String value : gridTableColumnValues)
				if (value.contains(BaseData.getHomeModuleValue("RequestedBy"))) {
					Assert.assertTrue(gridTableColumnValues.contains(BaseData.getHomeModuleValue("RequestedBy")));
				}
		}

		public void verifyPatrolAreaDropdownDisplayed() {

			verify.ExpectedValueIsTrue(uIMapHome.notification.uIPatrolAreaInput.isDisplayed());
		}

		public void selectAtPatrolArea() {
			Playback.controlReadyThreadWait();
			uIMapHome.notification.uIPatrolAreaInput.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapHome.notification.uIPatrolAreaDropdown, BaseData.getHomeModuleValue("PatrolArea"));
			uIMapHome.notification.uIPatrolAreaInput.sendKeys(Keys.TAB);
		}

		public void verifyAtNotificationSetupCFSCode() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapHome.notification.uINotificationLable.getText()
					.contains(BaseData.getHomeModuleValue("CFSCode")));
		}

		public void selectAtNotifyEvent1() {
			Playback.controlReadyThreadWait();
			uIMapHome.notification.uINotifyEventComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapHome.notification.uINotifyEventRadControlComboBox,
					BaseData.getHomeModuleValue("NotifyEvent1"));
			uIMapHome.notification.uINotifyEventComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtNotifyEvent2() {
			Playback.controlReadyThreadWait();
			uIMapHome.notification.uINotifyEventComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapHome.notification.uINotifyEventRadControlComboBox,
					BaseData.getHomeModuleValue("NotifyEvent2"));
			uIMapHome.notification.uINotifyEventComboBox.sendKeys(Keys.TAB);
		}

		public void verifyPFfieldIsDisplayed() { // Added by Abi
			verify.ExpectedValueIsTrue(uIMapHome.notification.uIPFCodeEdit.isDisplayed());
		}

		public void enterAtReason() { // Added by Abi
			uIMapHome.notification.uIReasonEdit.sendKeys(BaseData.getHomeModuleValue("Reason"));
		}

		public void verifyAtNotificationListDetailsInGrid(int rowIndex) { // Added by Abi
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("NotificationListDetails"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.notification.uINotificationGridTable, "Notification List Details", rowIndex));
		}

		public void verifyAtReasonInGrid() { // Added by Abi
			// WebElement gridCell = objectIdentification.manualIdentify
			// .getGridCell(uIMapHome.notification.uINotificationGridTable, "Reason", 0);
			// WebElement row = gridCell.findElement(By.xpath("./.."));
			// System.out.println(row.getText());
			// String reason =
			// gridCell.findElement(By.xpath("./following-sibling::td[contains(@class,'igede12b9e')]"))
			// .getText();
			String reason = Playback.driver
					.findElement(By.xpath("(//div[@id='grdNotificationType']/table//table)[3]//tr/td[27]")).getText();
			Playback.controlReadyThreadWait();
			// String reason = Playback.driver.findElement(By.id("WzBoDyI")).getText();
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Reason"), reason);

		}

		public void clickResetButton() { // Added by Abi
			uIMapHome.notification.uIResetButton.click();
		}

		public void selectAtGridRowByNotifyEvent() { // Added by Abi
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapHome.notification.uINotificationGridTable, BaseData.getHomeModuleValue("NotifyEvent"));
		}

		public void verifyPFIsSelected() { // Added by Abi
			uIMapHome.notification.uIPFRadioButton.isSelected();
		}

		public void verifyAtPFCode() { // Added by Abi

			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("PFNo"),
					uIMapHome.notification.uIPFCodeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("NotificationListDetails"),
					uIMapHome.notification.uIPFCodeDescriptionTextView.getAttribute("value"));

		}

		public void verifyAtReportingPeriod() { // Added by Abi
			String dropDownSelectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapHome.notification.uIReportingPeriodComboBox);
			verify.ExpectedPropertyValueIsEqual(dropDownSelectedItem, BaseData.getHomeModuleValue("ReportingPeriod"));
		}

		public void verifyAtNotifyEvent() { // Added by Abi
//			System.out.println("text"+uIMapHome.notification.uINotifyEventComboBox.getText());
//			System.out.println("value"+uIMapHome.notification.uINotifyEventComboBox.getAttribute("value"));
//			System.out.println("title"+uIMapHome.notification.uINotifyEventComboBox.getAttribute("title"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("NotifyEvent"),
					uIMapHome.notification.uINotifyEventComboBox.getAttribute("value"));
		}

		public void verifyAtReason() { // Added by Abi
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Reason"),
					uIMapHome.notification.uIReasonEdit.getAttribute("value"));
		}

		public void VerifyAtNotifyEvent1InGrid(int rowIndex) { // Added by Abi
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("NotifyEvent1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.notification.uINotificationGridTable, "Notify Event", rowIndex));
		}

		public void VerifyAtPeriod1(int rowIndex) { // Added by Abi
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("ReportingPeriod1"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapHome.notification.uINotificationGridTable, "Period", rowIndex));
		}

		public void selectAtReportingPeriod1() { // Added by Abi
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.notification.uIReportingPeriodComboBox,
					BaseData.getHomeModuleValue("ReportingPeriod1"));
			uIMapHome.notification.uIReportingPeriodComboBox.sendKeys(Keys.TAB);
		}

	}

	public class BulletinEntry {
		public void ClickSaveButton() {
			uIMapHome.bulletinEntry.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapHome.bulletinEntry.uISaveButton.click();
			confirm.yes();
		}

		public void CloseScreen() {
			uIMapHome.bulletinEntry.driver.close();
		}

		public void ClickTextTab() {
			uIMapHome.bulletinEntry.uITextTab.click();
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickAttachmentTab() {
			uIMapHome.bulletinEntry.uIAttachmentTab.click();

		}

		public void SwitchToAttachmentTab() {
			uIMapHome.bulletinEntry.uIAttachmentTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void ClickDistributionTab() {
			uIMapHome.bulletinEntry.uIDistributionTab.click();
		}

		public void EnterAtMessageID() {
			uIMapHome.bulletinEntry.uIMessageIDEdit.sendKeys(BaseData.getHomeModuleValue("MessageID"));
		}

		public void EnterAtSubject() {
			uIMapHome.bulletinEntry.uISubjectEdit.sendKeys(BaseData.getHomeModuleValue("Subject"));
		}

		public void VerifyMessageIDAcknowledgeMessage() {
			acknowledge.okWithExpectedMessage("(2007) Message ID is required");
		}

		public void VerifySubjectAcknowledgeMessage() {
			acknowledge.okWithExpectedMessage("(2008) Subject is required");
		}

		public void EnterAuthorityOf() {
			uIMapHome.bulletinEntry.uIAuthorityOfEdit.sendKeys("Automation");
		}

		public void VerifyDistributionAcknowledgeMessage() {
			acknowledge.okWithExpectedMessage("(2013) Distribution is required");
		}

		public void EnterRichText() {
			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.bulletinEntry.textTab.uITextEdit).click();
			actions.sendKeys(Randomized.randomString(500)).build().perform();
			Playback.controlReadyThreadWait();
		}

		public void SelectTemplate() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapHome.bulletinEntry.textTab.uITemplateComboBox);
		}

		public void ClickLoadButton() {
			uIMapHome.bulletinEntry.textTab.uILoadButton.click();
		}

		public void EnterPostFromDateAndTime() {
			uIMapHome.bulletinEntry.distributionTab.uIPostFromDateEdit.sendKeys(Keys.TAB);
			uIMapHome.bulletinEntry.distributionTab.uIPostFromTimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterPostToDateAndTimeAsFuture() {
			uIMapHome.bulletinEntry.distributionTab.uIPostToDateEdit
					.sendKeys(Randomized.getFutureDate(1, "MM/dd/yyyy"));
			uIMapHome.bulletinEntry.distributionTab.uIPostToTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void SelectPriority() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapHome.bulletinEntry.distributionTab.uIPriorityComboBox);
		}

		public void ClickCriticalCheckBox() {
			uIMapHome.bulletinEntry.distributionTab.uICriticalCheckBox.click();
		}

		public void ClickAddressToAllCheckbox() {
			uIMapHome.bulletinEntry.distributionTab.uIAddressAllCheckBox.click();
		}

		public void VerifyDivisionSectionSquadDisabled() {
			verify.ExpectedValueIsTrue(Boolean
					.parseBoolean(uIMapHome.bulletinEntry.distributionTab.uIDivisionComboBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(Boolean
					.parseBoolean(uIMapHome.bulletinEntry.distributionTab.uISectionComboBox.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(uIMapHome.bulletinEntry.distributionTab.uISquadCodeEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyPFCodeDisabled() {
			verify.ExpectedValueIsTrue(uIMapHome.bulletinEntry.distributionTab.uIPFCodeEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void SelectAtDivision() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapHome.bulletinEntry.distributionTab.uIDivisionComboBox,
					BaseData.getHomeModuleValue("Division"));
		}

		public void SelectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapHome.bulletinEntry.distributionTab.uISectionComboBox, BaseData.getHomeModuleValue("Section"));
		}

		public void ClickAddButton() {
			uIMapHome.bulletinEntry.distributionTab.uIAddButton.click();
		}

		public void VerifyAtDivisionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Division"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.bulletinEntry.distributionTab.uIDivisionSectionGridTable, "Division", rowIndex));
		}

		public void VerifyAtSectionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Section"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapHome.bulletinEntry.distributionTab.uIDivisionSectionGridTable, "Section", rowIndex));
		}

		public void ClickDivisionSectionSquadAccordion() {
			Playback.controlReadyThreadWait();
			uIMapHome.bulletinEntry.distributionTab.uIDivisionSectionSquadAccordian.click();
		}

		public void ClickMultiplePFAccordion() {
			Playback.controlReadyThreadWait();
			uIMapHome.bulletinEntry.distributionTab.uIMultiplePFAccordian.click();
		}

		public void EnterAtPFCode() {
			uIMapHome.bulletinEntry.distributionTab.uIPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("PFCode"));
			uIMapHome.bulletinEntry.distributionTab.uIPFCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPFCode1() {
			uIMapHome.bulletinEntry.distributionTab.uIPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("PFCode1"));
			uIMapHome.bulletinEntry.distributionTab.uIPFCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void ClickMultiplePFAddButton() {
			uIMapHome.bulletinEntry.distributionTab.uIMultiplePFAddButton.click();
		}

		public void VerifySendEmailReminderButtonDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.bulletinEntry.uISendEmailReminderButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapHome.bulletinEntry.uISendEmailReminderButton.isEnabled());
		}

		public void VerifyUnviewedLabelDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.bulletinEntry.uIUnviewedTextView.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapHome.bulletinEntry.uIUnviewedTextView.isEnabled());
		}

		public void ClickFolderViewRadioButton() {
			uIMapHome.bulletinEntry.bulletinAttachmentsTab.uIFolderRadioButton.click();
		}

		public void VerifyAddFilesButtonDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.bulletinEntry.bulletinAttachmentsTab.uIAddFilesButton.isDisplayed());
		}

		public void SelectEmailTemplate() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapHome.bulletinEntry.bulletinEmailTextTab.uITemplateComboBox);
			uIMapHome.bulletinEntry.bulletinEmailTextTab.uITemplateComboBox.sendKeys(Keys.TAB);
		}

		public void ClickEmailLoadButton() {
			uIMapHome.bulletinEntry.bulletinEmailTextTab.uILoadButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterEmailTextRichText() {
			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapHome.bulletinEntry.bulletinEmailTextTab.uIEmailRichTextEdit).click();
			actions.sendKeys(Randomized.randomString(500)).build().perform();
			Playback.waitForControlReady();

		}

		public void ClickEmailTextTab() {
			uIMapHome.bulletinEntry.uIEmailTextTab.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectDivision() {
			Playback.controlReadyThreadWait();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapHome.bulletinEntry.distributionTab.uIDivisionComboBox);
		}

		public void SelectSection() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapHome.bulletinEntry.distributionTab.uISectionComboBox);
		}

		public void SelectPF() {
			uIMapHome.bulletinEntry.distributionTab.uIPFLookupButton.click();
			Playback.controlReadyThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void ClickSendEmailReminderButton() {
			uIMapHome.bulletinEntry.uISendEmailReminderButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyEmailSentAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			acknowledge.okWithExpectedMessage("(25506) Mail Sent");
		}
	}

	public class LogintoRMS {
		public void EnterAtUsername() {
			uIMapLogin.loginScreen.uIUserNameEdit.sendKeys(BaseData.getLoginModuleValue("SchedulePFUsername"));
		}

		public void EnterAtPassword() {
			uIMapLogin.loginScreen.uIPasswordEdit.click();
			uIMapLogin.loginScreen.uIPasswordEdit.sendKeys(BaseData.getLoginModuleValue("SchedulePFPassword"));
		}

		public void ClickLoginButton() {
			uIMapLogin.loginScreen.uILoginButton.click();
			objectIdentification.windowHandle.switchToMainWindow();
		}

	}

	public class MessageSendScreen {
		public void EnterAtPF() {
			uIMapHome.messageSendScreen.uIPFCodeEdit.sendKeys(BaseData.getHomeModuleValue("PF"));
			uIMapHome.messageSendScreen.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapHome.messageSendScreen.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterMessage() {
			uIMapHome.messageSendScreen.uIMessageEdit.sendKeys("Automation Team Testing the send Message Screen");
		}

		public void ClickSendAsTextMessageCheckbox() {
			uIMapHome.messageSendScreen.uISendAsTxtMessageCheckBox.click();
		}

		public void ClickSendAsEmailCheckbox() {
			uIMapHome.messageSendScreen.uISendAsEmailCheckBox.click();
		}

		public void ClickSendAsBolo() {
			uIMapHome.messageSendScreen.uISendAsBoloCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickShiftNotes() {
			uIMapHome.messageSendScreen.uIShiftNotesButton.click();
		}

		public void ClickSendButton() {
			uIMapHome.messageSendScreen.uISendButton.click();
		}

		public void ClickAddMultiplePFButton() {
			uIMapHome.messageSendScreen.uIAddMultiplePFButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectPF() {
			uIMapHome.messageSendScreen.uIPFLookupButton.click();
			Playback.controlReadyThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void VerifyAllPFConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				confirm.yesWithExpectedMessage("(2544) Do you want to send the message to all PF?");
			} else
				confirm.yesWithExpectedMessage("(2544) Do you want to send the message to all PF?");
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtTo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("To"),
					uIMapHome.messageSendScreen.uIToEdit.getAttribute("value"));
		}

		public void VerifyMessageSuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(uIMapHome.messageSendScreen.uIBottomLeftSideStatusBar.getText()
					.contains("2520 - Message sent successfully"), "Message Sent Successfully Message");
		}

		public void CloseScreen() {
			uIMapHome.messageSendScreen.driver.close();
		}

		public void VerifyPFAndAddMultiplePFButtonDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapHome.messageSendScreen.uIPFCodeEdit.getAttribute("class").contains("textboxInactive"),
					"Verify PF Code Field Disabled");
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapHome.messageSendScreen.uIAddMultiplePFButton.getAttribute("disabled")),
					"Verify Add Multiple PF Button Disabled");
		}

		public void SelectBoloType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapHome.messageSendScreen.uIBoloTypeComboBox);
			uIMapHome.messageSendScreen.uIBoloTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtBoloStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.messageSendScreen.uIBoloStatusComboBox,
					BaseData.getHomeModuleValue("BoloStatus"));
			uIMapHome.messageSendScreen.uIBoloStatusComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyBoloMessageConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				confirm.yesWithExpectedMessage(
						"(2563) Message will be sent as a BOLO message. Do you want to continue?");
			} else
				confirm.yesWithExpectedMessage(
						"(2563) Message will be sent as a BOLO message. Do you want to continue?");
			Playback.controlReadyThreadWait();
		}

		public void EnterAtMessage() {
			uIMapHome.messageSendScreen.uIMessageEdit.sendKeys(BaseData.getHomeModuleValue("Message"));
		}

		public void enterAtUnit() {
			uIMapHome.messageSendScreen.uIUnitEdit.sendKeys(BaseData.getHomeModuleValue("Unit"));

		}
	}

	public class AddMultiplePF {
		public void ClickSelectAll() {
			uIMapHome.addMultiplePF.uISelectAllCheckBox.click();
		}

		public void ClickAddTheSelectPFToList() {
			uIMapHome.addMultiplePF.uIAddTheSelectPFToListButton.click();
			Playback.controlReadyThreadWait();
		}

	}

	public class MessageReceivedScreen {
		public void VerifyReplyTextDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapHome.messageReceivedScreen.uIReplyEdit.getAttribute("readonly")),
					"Verify Replt edit field is read only mode");
		}

		public void VerifyReplybuttonDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapHome.messageReceivedScreen.uIReplyButton.getAttribute("disabled")),
					"Verify Replt edit field is read only mode");
		}

		public void CloseScreen() {
			uIMapHome.messageReceivedScreen.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void VerifyReplyTextEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.messageReceivedScreen.uIReplyEdit.isEnabled());
		}

		public void VerifyReplybuttonEnabled() {
			verify.ExpectedValueIsTrue(uIMapHome.messageReceivedScreen.uIReplyButton.isEnabled());
		}

		public void EnterReply() {
			uIMapHome.messageReceivedScreen.uIReplyEdit.sendKeys(Randomized.randomString(50));
		}

		public void ClickReplyButton() {
			uIMapHome.messageReceivedScreen.uIReplyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickReplyAllButton() {
			uIMapHome.messageReceivedScreen.uIReplyAllButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickReadPreviousButton() {
			uIMapHome.messageReceivedScreen.uIReadPreviousButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickReadNextButton() {
			uIMapHome.messageReceivedScreen.uIReadNextButton.click();
			Playback.controlReadyThreadWait();
		}
	}

	public class BOLOMessageReceivedScreen {
		public void EnterMessage() {
			uIMapHome.bOLOMessageReceivedScreen.uIMessageEdit
					.sendKeys("ProPhoenix Automation Team updated the Comments ");
		}

		public void VerifyAtBoloStatus() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("BoloStatus"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapHome.bOLOMessageReceivedScreen.uIBoloStatusComboBox));
		}

		public void ClickUpdateButton() {
			uIMapHome.bOLOMessageReceivedScreen.uIUpdateButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifySuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(uIMapHome.bOLOMessageReceivedScreen.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update Successful"));
		}

		public void CloseScreen() {
			uIMapHome.bOLOMessageReceivedScreen.driver.close();
		}
	}

	public class PrintBatchScreen {

		public void SelectTwoRowsInGrid() {
			objectIdentification.randomIdentify
					.selectRandomGridRowsCheckboxes(uIMapHome.printBatchScreen.uIPrintBatchTable, 2);
		}

		public void ClickPrintBatchButton() {
			uIMapHome.printBatchScreen.uIPrintBatchButton.click();
		}

		public void ClickIndividualReportButton() {
			uIMapHome.printBatchScreen.uIIndividualReportButton.click();
		}

	}

	public class TextStatmentReport {
		public void EnterStatement() {
			uIMapHome.textStatmentReport.uITextStatementEdit.click();
			uIMapHome.textStatmentReport.uITextStatementEdit.sendKeys(Randomized.randomString(200));
		}

		public void ClickOfficialAccessOnlyButton() {
			uIMapHome.textStatmentReport.uIOfficeAccessOnlyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtStatement() {
			uIMapHome.textStatmentReport.uITextStatementEdit.click();
			uIMapHome.textStatmentReport.uITextStatementEdit.sendKeys(BaseData.getHomeModuleValue("Statement"));
		}

		public void VerifyAtStatement() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Statement"),
					uIMapHome.textStatmentReport.uITextStatementEdit.getText());
		}

		public void ClickSignHereButton() {
			uIMapHome.textStatmentReport.uISignHereButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyConfirmNoUpdateMessage() {
			if (Playback.browserType.contains("Chrome")) {
				confirm.yesWithExpectedMessage(
						"(2527) No further updates are allowed. Are you sure you want to continue?");
			} else
				confirm.yesWithExpectedMessage(
						"(2527) No further updates are allowed. Are you sure you want to continue?");
		}
	}

	public class SignatureScreen {
		public void ClickSignButton() {
			uIMapHome.signatureScreen.uISignButton.click();
			Playback.controlReadyThreadWait();
		}

		public void Close() {
			uIMapHome.signatureScreen.driver.close();
		}

		public void clickTypeButton() {
			uIMapHome.signatureScreen.uITypeButton.click();
		}

		public void enterAtSignTextArea(String sign) {
			uIMapHome.signatureScreen.uITypeTextEdit.sendKeys(sign);
		}

		public void clickApplyButton() {
			uIMapHome.signatureScreen.uIApplyButton.click();
		}

		public void enterAtPassword() {
			uIMapHome.signatureScreen.uIPasswordEdit.sendKeys(BaseData.getTestContextData("Password"));
		}

		public void clickShowSignatureButton() {
			uIMapHome.signatureScreen.uIShowSignatureButton.click();
		}

		public void verifyViewSignatureAreaIsEmpty() {
			String attribute = uIMapHome.signatureScreen.uIViewSignatureArea.getAttribute("src");
			verify.ExpectedValueIsTrue(attribute == "");
		}

		public void verifyViewSignatureAreaHavingSignature() {
			String attribute = uIMapHome.signatureScreen.uIViewSignatureArea.getAttribute("src");
			verify.ExpectedValueIsTrue(attribute.contains("image/png"));
		}

		public void enterAtName() {
			uIMapHome.signatureScreen.uINameEdit.sendKeys(BaseData.getHomeModuleValue("Name"));
			uIMapHome.signatureScreen.uINameEdit.sendKeys(Keys.TAB);
		}

		public void verifySignButtonIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapHome.signatureScreen.uISignButton.isDisplayed());

		}

		public void clickDrawButton() { // Created by Abi
			uIMapHome.signatureScreen.uIDrawButton.click();
			Playback.controlReadyThreadWait();
		}

		public void drawSign() { // Created by Abi
			Actions builder = new Actions(Playback.driver);
			WebElement signPad = uIMapHome.signatureScreen.uISignaturePadEdit;
			Action signature = builder.contextClick(signPad).clickAndHold().moveToElement(signPad, 20, -50)
					.moveByOffset(-100, -50).moveByOffset(80, -100).moveByOffset(-70, 50).moveByOffset(-20, -10)
					.release(signPad).build();
			signature.perform();

		}
	}

	public class TextSearch {
		public void SwitchToTextSearch() {
			objectIdentification.windowHandle.switchToWindow("frmTextSrch");
		}

		public void ClickSearchButton() {
			uIMapHome.textSearch.uISearchButton.click();
		}

		public void DoubleclickOnTextSearchWordField() {
			uIMapHome.textSearch.uISearchWordsField.click();
		}

		public void RemoveTextOnTextSearchWordField() {
			uIMapHome.textSearch.uISearchWordsField.clear();
		}

		public void EnterTextInSearchWordsField() {
			uIMapHome.textSearch.uISearchWordsField.sendKeys("Sa");
		}

		public void EnterTextInSearchWordsField1() {
			uIMapHome.textSearch.uISearchWordsField.sendKeys("Ta");
		}

		public void EnterTextInSearchWordsField2() {
			uIMapHome.textSearch.uISearchWordsField.sendKeys("pa");
		}

		public void EnterTextInSearchWordsField3() {
			uIMapHome.textSearch.uISearchWordsField.sendKeys("pa or ta");
		}

		public void EnterTextInSearchWordsField4() {
			uIMapHome.textSearch.uISearchWordsField.sendKeys("pa and ta");
		}

		public void EnterTextInSearchWordsField5() {
			uIMapHome.textSearch.uISearchWordsField.sendKeys("iphone or ipad");
		}

		public void EnterTextInSearchWordsField6() {
			uIMapHome.textSearch.uISearchWordsField.sendKeys("iphone and ipad");
		}

		public void SelectOneRecordfromTextSearchWindow() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapHome.textSearch.uITextSearchTable);
		}

		public void ClickCloseButton() {
			Playback.controlReadyThreadWait();
			uIMapHome.textSearch.uICloseButton.click();
			Playback.controlReadyThreadWait();
		}

		public void CloseScreen() {
			uIMapHome.textSearch.driver.close();
		}

		public void SelectGridRowByTextType() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapHome.textSearch.uITextSearchTable,
					BaseData.getHomeModuleValue("AlarmNo"));
		}
	}

	public class PhoneBookEntry {
		public void EnterAtBookName() {
			uIMapHome.phoneBookEntry.uIBookNameEdit.sendKeys(BaseData.getHomeModuleValue("BookName"));
		}

		public void EnterAtDescription() {
			uIMapHome.phoneBookEntry.uIDescriptionEdit.sendKeys(BaseData.getHomeModuleValue("Description"));
		}

		public void ClickAdd() {
			uIMapHome.phoneBookEntry.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickGlobalCheckbox() {
			uIMapHome.phoneBookEntry.uIGlobalCheckBox.click();
		}

		public void ClickDetailBillingCheckbox() {
			uIMapHome.phoneBookEntry.uIDetailBillingCheckBox.click();
		}

		public void Save() {
			uIMapHome.phoneBookEntry.uISaveButton.click();
			confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void VerifyGlobalCheckboxcheckedUsingBookName() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.phoneBookEntry.uIPhoneBookEntryTable, BaseData.getHomeModuleValue("BookName"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapHome.phoneBookEntry.uIPhoneBookEntryTable, row, "Global")
					.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
		}

		public void VerifyDetailBillingCheckboxcheckedUsingBookName() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapHome.phoneBookEntry.uIPhoneBookEntryTable, BaseData.getHomeModuleValue("BookName"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapHome.phoneBookEntry.uIPhoneBookEntryTable, row, "IsDtlBilling")
					.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
		}

		public void Close() {
			uIMapHome.phoneBookEntry.driver.close();
		}
	}

	public class MyDashBoard {
		public void ClickLiveCADPoliceTab() {
			uIMapHome.myDashBoard.uILiveCADPoliceTab.click();
		}

		public void ClickLiveCADFireTab() {
			uIMapHome.myDashBoard.uILiveCADFireTab.click();
		}
	}

	public class PrintEmailScreen {
		public void Close() {
			uIMapHome.printEmailScreen.driver.close();
		}

		public void ClickSendEmail() {
			uIMapHome.printEmailScreen.uISendEmailButton.click();
		}

		public void verifyAtFrom() {
			verify.ExpectedPropertyValueIsEqual("support@prophoenix.com",
					uIMapHome.printEmailScreen.uIFromMainEdit.getAttribute("value"));
		}

		public void verifySendEmailButtonDisplay() {
			verify.ExpectedValueIsTrue(uIMapHome.printEmailScreen.uISendEmailButton.isDisplayed());
		}

		public void clickDoneButton() {
			uIMapHome.printEmailScreen.uIDoneButton.click();
		}

		public void enterAtTo() {
			uIMapHome.printEmailScreen.uIToEdit.sendKeys(BaseData.getTestContextData("To"));
		}

		public void enterAtSubject() {
			uIMapHome.printEmailScreen.uISubjectEdit.sendKeys(BaseData.getTestContextData("Subject"));
		}

		public void enterAtMessage() {
			uIMapHome.printEmailScreen.uIMessageEdit.sendKeys(BaseData.getTestContextData("Message"));
		}

		public void verifyEmailSentAcknowledgeMsg() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(6040) Email has been Sent.");
			} else {
				popup.switchToAcknowledge();
				popup.acknowledge.okWithExpectedMessage("(6040) Email has been Sent.");
			}
		}

		public void enterAtFrom() {
			uIMapHome.printEmailScreen.uIFromEdit.sendKeys(BaseData.getHomeModuleValue("From"));
			uIMapHome.printEmailScreen.uIFromEdit.sendKeys(Keys.TAB);
		}

		public void enterMessage() {
			uIMapHome.printEmailScreen.uIMessageEdit.sendKeys(Randomized.randomString(10));
			uIMapHome.printEmailScreen.uIMessageEdit.sendKeys(Keys.TAB);
		}

		public void enterExpirationDateAsFutureDay(int futureDay) {
			uIMapHome.printEmailScreen.uIExpiredDate.sendKeys(Randomized.getFutureDate(futureDay));
			uIMapHome.printEmailScreen.uIExpiredDate.sendKeys(Keys.TAB);
		}

		public void enterEffectiveDateAsCurrentDate() {
			uIMapHome.printEmailScreen.uIEffectiveDate.sendKeys(Randomized.getCurrentDate());
			uIMapHome.printEmailScreen.uIEffectiveDate.sendKeys(Keys.TAB);
		}
	}

	public class ReportLog {
		public void enterFromDateAsLastYear() {
			Playback.pageLoadThreadWait();
			uIMapHome.reportLog.uIDateFromEdit.clear();
			uIMapHome.reportLog.uIDateFromEdit.sendKeys(Randomized.getPreviousDateByMonth(12));
		}

		public void verifyFromDateAsCurrentDate() {
			Playback.pageLoadThreadWait();
			String date = uIMapHome.reportLog.uIDateFromEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), date);
		}

		public void clickSearchButton() {
			Playback.pageLoadThreadWait();
			uIMapHome.reportLog.uISearchButton.click();
		}

		public void selectProductAsCAD() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.reportLog.uIProductDropDown, "CAD");
		}

		public void selectAtProduct() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.reportLog.uIProductDropDown,
					BaseData.getHomeModuleValue("Product"));
			Playback.pageLoadThreadWait();
		}

		public void selectAtjuris() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.reportLog.uIJurisDropDown,
					BaseData.getHomeModuleValue("Juris"));
		}

		public void enterAtReportName() {
			uIMapHome.reportLog.uIReportNameEdit.sendKeys(BaseData.getHomeModuleValue("ReportName"));
		}

		public void clearReportName() {
			uIMapHome.reportLog.uIReportNameEdit.clear();
		}

		public void unCheckIncludeErrorCheckBox() {
			if (uIMapHome.reportLog.uIIncludeErrorLogCheckBox.isSelected())
				uIMapHome.reportLog.uIIncludeErrorLogCheckBox.click();
		}

		public void checkIncludeErrorCheckBox() {
			if (!uIMapHome.reportLog.uIIncludeErrorLogCheckBox.isSelected())
				uIMapHome.reportLog.uIIncludeErrorLogCheckBox.click();
		}

		public void verifyNoRecordFoundAcknowledge() {
			Playback.pageLoadThreadWait();
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void verifyTableListOutResults() {
			Playback.pageLoadThreadWait();
			int count = objectIdentification.manualIdentify.getGridTableRowsCount(uIMapHome.reportLog.uIReportLogTable);
			verify.ExpectedValueIsTrue(count > 0);
		}

		public void verifyAtProductInGrid(int rowIndex) {
			String product = objectIdentification.manualIdentify
					.getGridCellInnerTextByText(uIMapHome.reportLog.uIReportLogTable, "Product", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Product"), product);
		}
	}

	public class MultiFilesAttachments {

		public void clickBrowseButton() {
			uIMapHome.multiFilesAttachments.uIBrowseButton.click();
			Playback.controlReadyThreadWait();

		}

		public void clickUploadButton() {
			uIMapHome.multiFilesAttachments.uIUploadButton.click();
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void clickCloseButton() {
			uIMapHome.multiFilesAttachments.uICloseButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();

		}

		public void selectBulkAttachment() {
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "IncidentRpt.pdf");
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			// WindowsControl.FileBrowserWindow.ClickOpen();
			objectIdentification.filesHandle.fileAttach
					.BulkFileAttachment("\\\"img5\" \"TextDoc1\" \"img2\" \"frmPnxRpt\" \"img4\"");
		}

		public void verifyAtCloseCurrentPagePopup() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType == "Chrome") {
				popup.confirm.yesWithExpectedMessage("Are you sure, you want to Close the Page?\r\n"
						+ " Press OK to continue, or Cancel to stay on the current page");
			} else {
				Playback.controlReadyThreadWait();
				Playback.gridLoadThreadWait();
				objectIdentification.filesHandle.handleWindowsPopupClickOk();
			}

		}

		public void verifyUnableToAccessNetworkPathMessage() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			String msg = uIMapHome.multiFilesAttachments.uIUnableLocateMsg.getText();
			verify.ExpectedPropertyValueIsEqual(
					"Unable to access network path. Please verify system parameters 29 and 39.", msg);
		}
	}

	public class NotificationSearch {

		public void clickSearch() {
			Playback.pageLoadThreadWait();
			uIMapHome.notificationSearch.uISearchButton.click();
		}

		public void clickUpdateButton() {
			uIMapHome.notificationSearch.uIUpdateButton.click();
		}

		public void selectCheckBoxInGridByUsingRequestedPF() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapHome.notificationSearch.uINotificationSearchResultTable,
					BaseData.getHomeModuleValue("RequestedPF"));
		}

	}

	public class WhiteBoard {

		public void clickAddButton() {
			uIMapHome.myHome.whiteBoard.uIAddButton.click();
		}

		public void clickMaximizeButton() {
			uIMapHome.myHome.whiteBoard.uIMaximizeButton.click();
			Playback.pageLoadThreadWait();
		}

		public void selectRowByAtSubject() {
			WebElement row = Playback.driver.findElement(By.xpath("//table[@id='listActivityLog']"));
			WebElement data = row
					.findElement(By.xpath("//td[contains(text(),'" + BaseData.getHomeModuleValue("Subject") + "')]"));
			data.click();

		}

		public void verifyAtTitle() {
			WebElement title = Playback.driver.findElement(By.xpath("//span[@id='lblCurTime']/.."));
			String text = title.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getHomeModuleValue("Title")));
		}

		public void close() {
			uIMapHome.myHome.whiteBoard.driver.close();
		}

		public void verifyNoRecordFoundAcknowledgeMessage() {

			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			}

			else {
				popup.switchToAcknowledge();
				Playback.controlReadyThreadWait();
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
			}
		}

	}

	public class TrackSearch {

		public void clickAddNew() {
			uIMapHome.trackSearch.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickSearch() {
			uIMapHome.trackSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtOwner() {
			String attribute = uIMapHome.trackSearch.uIOwnerCodeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getHomeModuleValue("Owner")));
		}

		public void clickReset() {
			uIMapHome.trackSearch.uIResetButton.click();
		}

		public void enterAtVendor() {
			uIMapHome.trackSearch.uIVendorEdit.sendKeys(BaseData.getHomeModuleValue("Vendor"));
			uIMapHome.trackSearch.uIVendorEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtSummaryInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapHome.trackSearch.uITrackSearchTable, "Summary");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getHomeModuleValue("Summary")));

		}
	}

	public class TrackEntry {

		public void enterAtVendor() {
			uIMapHome.trackEntry.uIVendorCodeEdit.sendKeys(BaseData.getHomeModuleValue("Vendor"));
			uIMapHome.trackEntry.uIVendorCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtSummary() {
			uIMapHome.trackEntry.uISummaryCodeEdit.sendKeys(BaseData.getHomeModuleValue("Summary"));
			uIMapHome.trackEntry.uISummaryCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtContact() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.trackEntry.uIContactDropDown,
					BaseData.getHomeModuleValue("Contact"));
			uIMapHome.trackEntry.uIContactDropDown.sendKeys(Keys.TAB);
		}

		public void selectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHome.trackEntry.uIStatusDropDown,
					BaseData.getHomeModuleValue("Status"));
			uIMapHome.trackEntry.uIStatusDropDown.sendKeys(Keys.TAB);
		}

		public void enterAtOwner() {
			uIMapHome.trackEntry.uIOwnerCodeEdit.sendKeys(BaseData.getHomeModuleValue("Owner"));
			uIMapHome.trackEntry.uIOwnerCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtOwner() {
			String attribute = uIMapHome.trackEntry.uIOwnerCodeEdit.getAttribute("tittle");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getHomeModuleValue("Owner")));
		}

		public void verifyAtOwner1() {
			String attribute = uIMapHome.trackEntry.uIOwnerCodeEdit.getAttribute("title");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getHomeModuleValue("Owner1")));
		}

		public void clickVendorSearchButton() {
			uIMapHome.trackEntry.uIVendorSearchICon.click();
			Playback.pageLoadThreadWait();
		}

		public void clickOwnerSearchButton() {
			uIMapHome.trackEntry.uIOwnerSearchICon.click();
			Playback.pageLoadThreadWait();
		}

		public void clickVendorInfoIcon() {
			uIMapHome.trackEntry.uIVendorIBubble.click();
			Playback.controlReadyThreadWait();
		}

		public void saveScreen() {
			uIMapHome.trackEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapHome.trackEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

	}

	public class ExpenseEntry {
		public ExpenseEntryItemsTab expenseEntryItemsTab = null;
//	    public ExpenseEntryAttachmentTab expenseEntryAttachmentTab; 
		public ExpenseEntryApprovalTab expenseEntryApprovalTab = null;

		public ExpenseEntry() {
			if ((this.expenseEntryItemsTab == null)) {
				this.expenseEntryItemsTab = new ExpenseEntryItemsTab();
			}

//	        if ((this.expenseEntryAttachmentTab == null)) {
//	            this.expenseEntryAttachmentTab = new ExpenseEntryAttachmentTab();
//	        }

			if ((this.expenseEntryApprovalTab == null)) {
				this.expenseEntryApprovalTab = new ExpenseEntryApprovalTab();
			}
		}

		public void switchToApprovalTab() {
			uIMapHome.expenseEntry.uIApprovalTab.click();
			objectIdentification.windowHandle.switchToFrame("frmPnxGlobalApproval.aspx");
			Playback.controlReadyThreadWait();

		}

		public void closeScreen() {
			Playback.driver.close();
		}

		public void save() {
			uIMapHome.expenseEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapHome.expenseEntry.uISaveButton.click();
		}

		public void saveNClose() {
			uIMapHome.expenseEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public class ExpenseEntryItemsTab {

		}

		public class ExpenseEntryApprovalTab {

			public void selectNewActionAsSendForApproval() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapHome.expenseEntry.expenseEntryApprovalTab.uINewActionDropdown, "Send for Approval");
			}

			public void tabOutDateAndTime() {
				uIMapHome.expenseEntry.expenseEntryApprovalTab.uIDateEdit.sendKeys(Keys.TAB);
				uIMapHome.expenseEntry.expenseEntryApprovalTab.uITimeEdit.click();
				uIMapHome.expenseEntry.expenseEntryApprovalTab.uITimeEdit.sendKeys(Keys.TAB);

			}

			public void internalSave() {
				uIMapHome.expenseEntry.expenseEntryApprovalTab.uISaveButton.click();
				popup.confirm.yes();
			}

		}
		

	}

	public class KPITempPDFScreen {

		public KPITempPDFScreen() {

		}

		public void verifyContentInPDF(String Pdf, String content) {
			verify.ExpectedValueIsTrue(Pdf.contains(content));

		}

	}

	public class MobileDeviceOTPScreen {

		public void VerifyAtMobileNumber() {
			System.out.println(uIMapHome.mobileDeviceOTPScreen.uITextPhoneEdit.getAttribute("value"));

			verify.ExpectedPropertyValueIsEqual(uIMapHome.mobileDeviceOTPScreen.uITextPhoneEdit.getAttribute("value"),
					"(789) 654-1233");
		}

		public void clickSendLinkToMobileButton() {
			uIMapHome.mobileDeviceOTPScreen.uISendLinkToMobileButton.click();
		}

		public void VerifyAtAuthenticaionCodeGeneratedAs6Digit() {

			String Authcode = uIMapHome.mobileDeviceOTPScreen.uIAuthenticationCode.getText();

			int i = Authcode.length();
			System.out.println(Authcode);

			verify.ExpectedIntergerValueIsEqualToActual(6, i);

		}

		public void closeMobileDeviceOTPScreen() {

			uIMapHome.mobileDeviceOTPScreen.driver.close();

		}

		public void enterAtMobileNo() {
			uIMapHome.mobileDeviceOTPScreen.uITextPhoneEdit.click();
			uIMapHome.mobileDeviceOTPScreen.uITextPhoneEdit.sendKeys(BaseData.getHomeModuleValue("MobileNo"));
		}

	}

}
