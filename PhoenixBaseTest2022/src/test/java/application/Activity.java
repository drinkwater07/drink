
package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import application.Home.AddMultiplePF;
import dataAccess.BaseData;
import scripts.BaseSmokeTestDemo15100;
//import dataAccess.PoliceData;
import uIMaps.UIMapActivity;
import uIMaps.UIMapQA;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;
import utilities.ObjectIdentification.AttachmentsTab;

public class Activity {

	public ActivityEntry activityEntry;
	public ActivitySearch activitySearch;
	public ActivitySearchHelpWindow activitySearchHelpWindow;
	public ActivityCalendarEntry activityCalendarEntry;
	public ActivityQuickEntry activityQuickEntry;

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapActivity uIMapActivity = new UIMapActivity();
	public Popup popup = new Popup();
	public AddMultiplePF addMultiplePF = null;

	public Activity() {

		if (this.activityEntry == null)
			this.activityEntry = new ActivityEntry();

		if (this.activitySearch == null)
			this.activitySearch = new ActivitySearch();

		if (this.activitySearchHelpWindow == null)
			this.activitySearchHelpWindow = new ActivitySearchHelpWindow();

		if (this.activityCalendarEntry == null)
			this.activityCalendarEntry = new ActivityCalendarEntry();

		if (this.activityQuickEntry == null)
			this.activityQuickEntry = new ActivityQuickEntry();

			if (addMultiplePF == null)
			addMultiplePF = new AddMultiplePF();
	}

	public void Reset() {
		uIMapActivity = null;
	}

	public void switchToActivitySearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmActivityLogInquiry.aspx");
	}

	public void switchToActivitySearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Activity Search");
	}
public void switchToActivitySearchHelpWindow1() {
		objectIdentification.windowHandle.switchToWindowUsingURL("Home/frmAddMultiPF");
	}
	public void SwitchToActivityEntry() {
		objectIdentification.windowHandle.switchToWindow("Activity Entry");

	}

	public void SwitchToActivityCalendarEntry() {
		objectIdentification.windowHandle.switchToWindow("Activity Calendar");
	}

	public void pressF4keyToOpenQuickActivityEntry() {

		objectIdentification.windowHandle.switchToMainWindow();
		Playback.actionDriver.sendKeys(Keys.F4).perform();
	}

	public void switchToActivityQuickEntry() {
		objectIdentification.windowHandle.switchToWindow("Activity Quick Entry");
	}

	public void SwitchToQuickActivityLog() {
		objectIdentification.windowHandle.switchToWindow("Quick Activity Log");
	}

	public class ActivityEntry {
		public ActivityEntryPFTab activityEntryPFTab = null;
		public ActivityEntryLogEntryTab activityEntryLogEntryTab = null;
		public AttachmentsTab attachmentsTab = null;
		public LogHistoryTab logHistoryTab = null;
		public ActivityEntryVisitorsTab activityEntryVisitorsTab = null;
		public PublicEducationTab publicEducationTab = null;
		public MaintenanceTab maintenanceTab = null;
		public ActivityEntryOtherTab activityEntryOtherTab = null;
		public ActivityEntryQAFormsTab activityEntryQAFormsTab = null;
		public NamesTab namesTab = null;
		public ActivityEntryFeesTab activityEntryFeesTab = null;
		public ActivityEntryServiceHistoryTab activityEntryServiceHistoryTab = null;
		public SchedulesTab schedulesTab = null;
		public RecurrencePopUp recurrencePopUp = null;
		public ActivityEntryTR1Tab activityEntryTR1Tab = null;

		public ActivityEntry() {
			if ((this.activityEntryPFTab == null)) {
				this.activityEntryPFTab = new ActivityEntryPFTab();
			}
			if ((this.activityEntryLogEntryTab == null)) {
				this.activityEntryLogEntryTab = new ActivityEntryLogEntryTab();
			}
			if ((this.attachmentsTab == null)) {
				this.attachmentsTab = objectIdentification.new AttachmentsTab();
			}

			if ((this.logHistoryTab == null)) {
				this.logHistoryTab = new LogHistoryTab();
			}

			if ((this.activityEntryVisitorsTab == null)) {
				this.activityEntryVisitorsTab = new ActivityEntryVisitorsTab();
			}

			if ((this.publicEducationTab == null)) {
				this.publicEducationTab = new PublicEducationTab();
			}

			if ((this.maintenanceTab == null)) {
				this.maintenanceTab = new MaintenanceTab();
			}

			if ((this.activityEntryOtherTab == null)) {
				this.activityEntryOtherTab = new ActivityEntryOtherTab();
			}

			if ((this.activityEntryQAFormsTab == null)) {
				this.activityEntryQAFormsTab = new ActivityEntryQAFormsTab();
			}
			if ((this.namesTab == null)) {
				this.namesTab = new NamesTab();
			}

			if ((this.activityEntryFeesTab == null)) {
				this.activityEntryFeesTab = new ActivityEntryFeesTab();
			}
			if ((this.activityEntryServiceHistoryTab == null)) {
				this.activityEntryServiceHistoryTab = new ActivityEntryServiceHistoryTab();
			}
			if ((this.schedulesTab == null)) {
				this.schedulesTab = new SchedulesTab();
			}
			if ((this.recurrencePopUp == null)) {
				this.recurrencePopUp = new RecurrencePopUp();
			}

			if ((this.activityEntryTR1Tab == null)) {
				this.activityEntryTR1Tab = new ActivityEntryTR1Tab();
			}

		}

		public void SelectCategoryGroupAsPIPolice() {

			uIMapActivity.activityEntry.uICategoryGroupComboBox.sendKeys("PI - Police");
		}

		public void selectAtCategoryGroup() {

			uIMapActivity.activityEntry.uICategoryGroupComboBox
					.sendKeys(BaseData.getActivityModuleValue("CategoryGroup"));
		}

		public void SelectCategoryAsDamage() {

			uIMapActivity.activityEntry.uICategoryComboBox.sendKeys("Damage");
		}

		public void selectAtCategory() {
			Playback.waitForControlReady();
			uIMapActivity.activityEntry.uICategoryComboBox.sendKeys(BaseData.getActivityModuleValue("Category"));
		}

		public void SelectActivityTypeAsDamage() {

			uIMapActivity.activityEntry.uIActivityTypeComboBox.sendKeys("Damage");
		}

		public void SelectActivityTypeAsMaintenance() {

			uIMapActivity.activityEntry.uIActivityTypeComboBox.sendKeys("Maintenance");
		}

		public void selectAtActivityType() {

			uIMapActivity.activityEntry.uIActivityTypeComboBox
					.sendKeys(BaseData.getActivityModuleValue("ActivityType"));
		}

		public void clickActivityTypeTreeIcon() {
			uIMapActivity.activityEntry.uIActivityTypeTreeViewIcon.click();
		}

		public void VerifyAtActivityType() {
			String sd = uIMapActivity.activityEntry.uIActivityTypeComboBox.getAttribute("value");
			String ksfj = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapActivity.activityEntry.uIActivityTypeComboBox);
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("ActivityType"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapActivity.activityEntry.uIActivityTypeComboBox));
		}

		public void selectAtActivityStatus() {

			uIMapActivity.activityEntry.uIActivityStatusComboBox
					.sendKeys(BaseData.getActivityModuleValue("ActivityStatus"));
		}

		public void SelectActivityStatusAsRequestToDo() {

			uIMapActivity.activityEntry.uIActivityStatusComboBox.sendKeys("Request/To-Do");
		}

		public void SelectActivityStatusAsCompletedActivity() {

			uIMapActivity.activityEntry.uIActivityStatusComboBox.sendKeys("Completed Activity");

		}

		public void TabOutEnteredDateAndTime() {

			uIMapActivity.activityEntry.uIActivityDateEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.uIActivityTimeEdit.sendKeys(Keys.TAB);
		}

		public void TabOutActivityDateAndTime() {

			uIMapActivity.activityEntry.uIActivityDateEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.uIActivityTimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectUnit() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapActivity.activityEntry.uIUnitComboBox);
		}

		public void SelectFleetNo() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapActivity.activityEntry.uIFleetNoComboBox);
		}

		public void enterAtLocation() {
			uIMapActivity.activityEntry.uILocationEdit.sendKeys(BaseData.getActivityModuleValue("Location"));
			uIMapActivity.activityEntry.uILocationCheckbox.sendKeys(Keys.TAB);
		}

		public void ClickLocationInfoIcon() {
			uIMapActivity.activityEntry.uILocationInfoIcon.click();
		}

		public void EnterSubjectAsTesting() {
			uIMapActivity.activityEntry.uISubjectEdit.sendKeys("Testing");

		}

		public void enterAtSubject() {
			uIMapActivity.activityEntry.uISubjectEdit.sendKeys(BaseData.getActivityModuleValue("Subject"));

		}

		public void enterSubject() {
			uIMapActivity.activityEntry.uISubjectEdit.sendKeys(Randomized.randomString(15));

		}

		public void VerifyAtSubject() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("Subject"),
					uIMapActivity.activityEntry.uISubjectEdit.getAttribute("value"));

		}

		public void VerifyAtIncidentNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("IncidentNo"),
					uIMapActivity.activityEntry.uIIncidentNoEdit.getAttribute("value"));
		}

		public void VerifyAtActivityStatus() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("ActivityStatus"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapActivity.activityEntry.uIActivityStatusComboBox));
		}

		public void ClickLogEntryTab() {
			uIMapActivity.activityEntry.uILogEntryTab.click();
		}

		public void clickFeesTab() {
			uIMapActivity.activityEntry.uIFeesTab.click();
		}

		public void SwitchToOtherTab() {
			uIMapActivity.activityEntry.uIOtherTab.click();

		}

		public void Save() {
			uIMapActivity.activityEntry.uISaveButton.click();
			popup.confirm.yes();

		}

		public void Close() {

			uIMapActivity.activityEntry.driver.close();
		}

		public void SelectAtCategoryGroupforActivityFromHome() {

			uIMapActivity.activityEntry.uICategoryGroupComboBox
					.sendKeys(BaseData.getActivityModuleValue("CategoryGroup"));
			uIMapActivity.activityEntry.uICategoryGroupComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectAtCategoryforActivityFromHome() {

			uIMapActivity.activityEntry.uICategoryComboBox.sendKeys(BaseData.getActivityModuleValue("Category"));
			uIMapActivity.activityEntry.uICategoryComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void SelectAtActivityTypeforActivityFromHome() {

			uIMapActivity.activityEntry.uIActivityTypeComboBox
					.sendKeys(BaseData.getActivityModuleValue("ActivityType"));
		}

		public void SelectAtActivityStatusforActivityFromHome() {

			uIMapActivity.activityEntry.uIActivityStatusComboBox
					.sendKeys(BaseData.getActivityModuleValue("ActivityStatus"));
		}

		public void SelectActivityStatusAsScheduledItem() {

			uIMapActivity.activityEntry.uIActivityStatusComboBox.sendKeys("Scheduled Item");
			uIMapActivity.activityEntry.uIActivityStatusComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectActivityStatusAsInprogressActivity() {

			uIMapActivity.activityEntry.uIActivityStatusComboBox.sendKeys("In-Progress Activity");
			uIMapActivity.activityEntry.uIActivityStatusComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void TabOutActivityToDateAndTime() {

			uIMapActivity.activityEntry.uIActivityToDateEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.uIActivityToTimeEdit.sendKeys(Keys.TAB);
		}

		public void TabOutActivityFromDateAndTime() {

			uIMapActivity.activityEntry.uIActivityFromDateEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.uIActivityFromTimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectShowOnWhiteBoardCheckBox() {
			uIMapActivity.activityEntry.uIShowonWhiteBoardCheckBox.click();
		}

		public void SelectpublicCheckBox() {
			uIMapActivity.activityEntry.uIPrivateCheckBox.click();
		}

		public void SelectAtUnit() {
			uIMapActivity.activityEntry.uIUnitComboBox.sendKeys(BaseData.getActivityModuleValue("Unit"));
		}

		public void SelectAtFleet() {
			uIMapActivity.activityEntry.uIFleetNumberComboBox.sendKeys(BaseData.getActivityModuleValue("Fleet"));
		}

		public void EnterAtHomeActivityLocation() {
			uIMapActivity.activityEntry.uILocationTextbox.sendKeys(BaseData.getActivityModuleValue("Location"));
		}

		public void ClickDeleteIcon() {
			uIMapActivity.activityEntry.uIDeleteIcon.click();
		}

		public void VerifySaveNCloseButtonDisabled() {
			verify.ExpectedValueIsFalse(uIMapActivity.activityEntry.uISaveButton.isEnabled());
			verify.ExpectedValueIsFalse(uIMapActivity.activityEntry.uISaveAndCloseButton.isEnabled());
		}

		public void ClickSaveNCloseButton() {
			uIMapActivity.activityEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();

		}

		public void SelectCategoryAsFIFire() {

			uIMapActivity.activityEntry.uICategoryComboBox.sendKeys("FI - Fire");
		}

		public void SelectActivityTypeAsInspection() {

			uIMapActivity.activityEntry.uIActivityTypeComboBox.sendKeys("Inspection");
		}

		public void NavigateToPFTab() {
			uIMapActivity.activityEntry.uIPFTab.click();
		}

		public void NavigateToLogEntryTab() {
			uIMapActivity.activityEntry.uILogEntryTab.click();
		}

		public void NavigateToOtherTab() {
			uIMapActivity.activityEntry.uIOtherTab.click();
		}

		public void NavigateToQAFormsTab() {
			uIMapActivity.activityEntry.uISmokeQAFormsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmQuestionnaire");
		}

		public void clickQAFormsTab() {
			uIMapActivity.activityEntry.uISmokeQAFormsTab.click();
			Playback.controlReadyThreadWait();

		}

		public void NavigateToLogHistoryTab() {
			uIMapActivity.activityEntry.uILogHistoryTab.click();
			objectIdentification.windowHandle.switchToFrame("Home/frmLogHistory");
			//table[@id='listMsg']//div[contains(text(),' New Activity Log Created')]
		}

		public void NavigateToVisitorsTab() {
			uIMapActivity.activityEntry.uIVisitorsTab.click();
			Playback.controlReadyThreadWait();
		}

		public void NavigateToMaintenanaceTab() {
			uIMapActivity.activityEntry.uIMaintenanceTab.click();
			objectIdentification.windowHandle.switchToFrame("frmActMaintenance");
		}

		public void NavigateToPublicEducationTab() {
			uIMapActivity.activityEntry.uIPublicEducationTab.click();
		}

		public void NavigateToAttachmentTab() {
			uIMapActivity.activityEntry.uIAttachmentTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void switchToTR1Tab() {
			uIMapActivity.activityEntry.uITR1Tab.click();
			objectIdentification.windowHandle.switchToFrame("frmQnDataEnty.aspx?");

		}

		public void GetActivityNo(String activityYear, String activityNo) {
			activityYear = uIMapActivity.activityEntry.uIActivityYearEdit.getAttribute("value");
			activityNo = uIMapActivity.activityEntry.uIActivityNoEdit.getAttribute("value");
			Playback.setTestContextAttribute("activityYear", activityYear);
			Playback.setTestContextAttribute("activityNo", activityNo);
		}

		public void tabActivityDateTime() {
			uIMapActivity.activityEntry.uIActivityFromDateEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.uIActivityFromTimeEdit.sendKeys(Keys.TAB);
		}

		public void NavigateToNamesTab() {
			uIMapActivity.activityEntry.uINamesTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBENames");
		}

		public void switchToServiceHistoryTab() {
			uIMapActivity.activityEntry.uIServiceHistoryTab.click();

		}

		public void saveNClose() {
			uIMapActivity.activityEntry.uISaveNCloseButton.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yes();
			}

			else {

				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yes();

			}
		}

		public void switchToActivityEntryAttachmentTab() {
			uIMapActivity.activityEntry.uIAttachmentTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void verifyAttachmentTabIsDefaultTab() {
			String Bgcolor = "rgba(143, 198, 234, 1)";
			String bgcolor = uIMapActivity.activityEntry.uIAttachmentTabBGcolor.getCssValue("background-color");

			verify.ExpectedPropertyValueIsEqual(bgcolor, Bgcolor);
		}

		public void close() {
			uIMapActivity.activityEntry.driver.close();

		}

		public void selectAtActivityStatus1() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapActivity.activityEntry.uIActivityStatusComboBox,
					BaseData.getActivityModuleValue("ActivityStatus1"));
			uIMapActivity.activityEntry.uIActivityStatusComboBox.sendKeys(Keys.TAB);
		}

		public void tabOutScheduledFromDateAndTime() {
			uIMapActivity.activityEntry.uIScheduledFromDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapActivity.activityEntry.uIScheduledFromDateEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.uIScheduledFromTimeEdit.sendKeys(Keys.TAB);
		}

		public void tabOutScheduledToDateAndTime() {
			uIMapActivity.activityEntry.uIScheduledToDateEdit.sendKeys(Randomized.getFutureDate(5));
			uIMapActivity.activityEntry.uIScheduledToDateEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.uIScheduledToTimeEdit.sendKeys(Keys.TAB);
		}

		public void clickRecurrenceCheckBox() {
			uIMapActivity.activityEntry.uIRecurrenceEdit.click();
		}

		public void clickSave() {
			uIMapActivity.activityEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyEnterDateAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Date");

		}

		public void verifyEnterCFSAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter CFS");

		}

		public void verifyEnterSRCAcknowledge() {

			popup.acknowledge.okWithExpectedMessage("(30033) Enter SRC");
		}

		public void verifyAdditionSuccessfulBottomMessage() {
			verify.ExpectedValueIsTrue(uIMapActivity.activityEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1002 - Addition Successful"));
		}

		public void verifyChangeScheduleFutureInstanceConfirmMessage() {
			popup.confirm.yesWithExpectedMessage(
					"(2570)     Do you want to change the schedule for all future instances of this activity?");
			Playback.controlReadyThreadWait();
		}

		public void clickSchedulesTab() {
			uIMapActivity.activityEntry.uISchedulesTab.click();
		}

		public void clickOpenRecurrenceButton() {
			uIMapActivity.activityEntry.uIOpenRecurrenceButton.click();
		}

		public void verifyAllTabsDisabled() {
			String status = uIMapActivity.activityEntry.uIActivityTypeComboBox.getAttribute("disabled");
			verify.ExpectedValueIsTrue(status.contains("true"));
			String status2 = uIMapActivity.activityEntry.uICategoryGroupComboBox.getAttribute("disabled");
			verify.ExpectedValueIsTrue(status2.contains("true"));
			String status3 = uIMapActivity.activityEntry.uICategoryComboBox.getAttribute("disabled");
			verify.ExpectedValueIsTrue(status3.contains("true"));
			String status4 = uIMapActivity.activityEntry.uIActivityFromDateEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(status4.contains("true"));
			String status5 = uIMapActivity.activityEntry.uIActivityToDateEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(status5.contains("true"));
		}

		public void verifyAdditionSuccessfulInStatusBar() {
			String text = uIMapActivity.activityEntry.uIStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1002 - Addition Successful");
		}

		public void verifyAtWhiteBoardLabel() {
			String text = uIMapActivity.activityEntry.uIShowOnWhiteboardLabel.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getHomeModuleValue("Title")));
		}

		public void verifyPrivateCheckBoxIsDisplayed() {
			uIMapActivity.activityEntry.uIPrivateCheckBox.isDisplayed();
		}

		public void clickPrivateCheckBox() {
			uIMapActivity.activityEntry.uIPrivateCheckBox.click();
		}

		public void verifyPFTabIsDisplayed() {
			uIMapActivity.activityEntry.uIPFTab.isDisplayed();
		}

		public void verifyLogEntryTabIsDisplayed() {
			uIMapActivity.activityEntry.uILogEntryTab.isDisplayed();
		}

		public void verifyAttachmentTabIsDisplayed() {
			uIMapActivity.activityEntry.uIAttachmentTab.isDisplayed();
		}

		public void verifyMaintenanceTabIsDisplayed() {
			uIMapActivity.activityEntry.uIMaintenanceTab.isDisplayed();
		}

		public void verifyOtherTabIsDisplayed() {
			uIMapActivity.activityEntry.uIOtherTab.isDisplayed();
		}

		public void verifyLogHistoryTbIsDisplayed() {
			uIMapActivity.activityEntry.uILogHistoryTab.isDisplayed();
		}

		public void verifyAtCategory() {
			List<String> dropDownValues = objectIdentification.manualIdentify
					.getDropDownValues(uIMapActivity.activityEntry.uICategoryComboBox);
			verify.ExpectedValueIsTrue(dropDownValues.contains(BaseData.getActivityModuleValue("Category")));
		}

		public void verifyFleetNoIsDisabled() {
			String attribute = uIMapActivity.activityEntry.uIIncidentNoEdit.getAttribute("readonly");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("true"));

		}

		public void clickFleetIBubble() {
			uIMapActivity.activityEntry.uIFleetIBubble.click();

		}

		public void clickDeleteIconWithConfirmPopupMessage() {
			uIMapActivity.activityEntry.uIDeleteIcon.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yesWithExpectedMessage("(2554)     Do you want to delete this activity?");
		}

public void clickAddmultiplePFButton() {
			uIMapActivity.activityEntry.uIAddMultiplePFButton.click();
		}

	}

	public class ActivityEntryPFTab {

		public void enterAtPFNo() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFCodeEdit
					.sendKeys(BaseData.getActivityModuleValue("PFCode"));
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFCodeEdit.sendKeys(Keys.TAB);

		}

		public void SelectAtPFActivity() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFActivityComboBox
					.sendKeys(BaseData.getActivityModuleValue("PFActivity"));
		}

		public void SelectAtStatus() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIStatusComboBox
					.sendKeys(BaseData.getActivityModuleValue("Status"));
		}

		public void SelectAtUnit() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIUnitComboBox
					.sendKeys(BaseData.getActivityModuleValue("PFUnit"));
		}

		public void VerifyAtCustomNameInCustomField() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("CustomName"),
					uIMapActivity.activityEntry.activityEntryPFTab.uIPointsLabel.getText());
		}

		public void SelectAtFleetforFire() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIUnitComboBox.sendKeys(BaseData.getActivityModuleValue(""));
		}

		public void EnterAtStartDateTime() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabFromDateEdit
					.sendKeys(Randomized.getCurrentDate("MM/dd/yyyy"));
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabFromTimeEdit.sendKeys(Randomized.getCurrentTime());

		}

		public void EnterAtEndDateTime() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabToDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabToTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void EnterAtHoursWorked() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIHoursWorkedEdit
					.sendKeys(BaseData.getActivityModuleValue("HoursWorked"));
			uIMapActivity.activityEntry.activityEntryPFTab.uIHoursWorkedEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCredits() {
			uIMapActivity.activityEntry.activityEntryPFTab.uICreditsEdit
					.sendKeys(BaseData.getActivityModuleValue("Credits"));
		}

		public void EnterAtHoursPaid() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIHoursPaidEdit
					.sendKeys(BaseData.getActivityModuleValue("HoursPaid"));
		}

		public void SelectAtPayScale() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapActivity.activityEntry.activityEntryPFTab.uIPayScaleComboBox,
					BaseData.getActivityModuleValue("PayScale"));
			uIMapActivity.activityEntry.activityEntryPFTab.uIPayScaleComboBox.sendKeys(Keys.TAB);
		}

		public void ClickAddMultiplePFButton() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIAddMultiplePFButton.click();
		}

		public void clickAddButton() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIAddButton.click();
		}

		public void ClickClearbutton() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIClearButton.click();
		}

		public void SelectAllCheckbox() {
			uIMapActivity.activityEntry.activityEntryPFTab.uISelectAllCheckBox.click();
		}

		public void SelectPFRecordFromGrid() {

		}

		public void EnterAtScheduleDateTime() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabScheduledFromDateEdit
					.sendKeys(Randomized.getFutureDate(1));
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabScheduledFromTimeEdit
					.sendKeys(Randomized.getCurrentTime());
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabScheduledToDateEdit
					.sendKeys(Randomized.getFutureDate(3));
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabScheduledToTimeEdit
					.sendKeys(Randomized.getCurrentTime());

		}

		public void EnterAtScheduledPF() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFCodeEdit
					.sendKeys(BaseData.getActivityModuleValue("ScheduledPFCode"));
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFCodeEdit.sendKeys(Keys.TAB);

		}

		public void TaboutfromEndTime() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFTabToTimeEdit.sendKeys(Keys.TAB);
		}

		public void ClickDeleteIcon() {

		}

		public void EnterAtPFCode1() {
			uIMapActivity.activityEntry.activityEntryPFTab.uIPFCodeEdit
					.sendKeys(BaseData.getActivityModuleValue("PFCode1"));
		}

		public void verifyAtPFInGrid(int rowIndex) {
			String gridCellInnerText = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapActivity.activityEntry.activityEntryPFTab.uIResultPFTabGrid, "PF", rowIndex);
			verify.ExpectedPropertyValueIsEqual(gridCellInnerText, BaseData.getActivityModuleValue("PF"));
		}

		public void verifyAtPFInGrid() {
			String Pf = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapActivity.activityEntry.activityEntryPFTab.uIResultPFTabGrid, "PF", 0);
			verify.ExpectedPropertyValueIsEqual(Pf, BaseData.getActivityModuleValue("PFCode"));
		}
		public void verifyAtPFInGrid1() {
			String Pf = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapActivity.activityEntry.activityEntryPFTab.uIResultPFTabGrid, "PF", 0);
			verify.ExpectedPropertyValueIsEqual(Pf, BaseData.getActivityModuleValue("PFCode1"));
		}

		public void enterAtPoints() {
			uIMapActivity.activityEntry.activityEntryPFTab.uICreditsEdit
					.sendKeys(BaseData.getActivityModuleValue("Points"));
			uIMapActivity.activityEntry.activityEntryPFTab.uICreditsEdit.sendKeys(Keys.TAB);
		}

	}

	public class ActivityEntryOtherTab {

		public void EnterPFAtPFCode() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIMultiplePFLabel.click();
			uIMapActivity.activityEntry.activityEntryOtherTab.uIPFCodeEdit
					.sendKeys(BaseData.getActivityModuleValue("PFCode"));
			uIMapActivity.activityEntry.activityEntryOtherTab.uIPFCodeEdit.sendKeys(Keys.TAB);
			uIMapActivity.activityEntry.activityEntryOtherTab.uIAddButton.click();
		}

		public void SelectAtRefTypeNo() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIRefTypeComboBox
					.sendKeys(BaseData.getActivityModuleValue("RefType"));
			uIMapActivity.activityEntry.activityEntryOtherTab.uIRefTypeNumberEdit
					.sendKeys(BaseData.getActivityModuleValue("RefNo"));
		}

		public void EnterDueByDate() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIDueByDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapActivity.activityEntry.activityEntryOtherTab.uIDueByTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void SelectAtPriority() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIPriorityComboBox
					.sendKeys(BaseData.getActivityModuleValue("Priority"));
		}

		public void SelectReportablecheckbox() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIReportableCheckBox.click();
		}

		public void EnterCompletedDateTime() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uICompletedDateEdit.sendKeys(Randomized.getFutureDate(5));
			uIMapActivity.activityEntry.activityEntryOtherTab.uICompletedTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void EnterAtCustom() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uICustomFieldEdit
					.sendKeys(BaseData.getActivityModuleValue("Custom"));
		}

		public void EnterEntryDateTime() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIEntryDateEdit
					.sendKeys(BaseData.getActivityModuleValue(""));
			uIMapActivity.activityEntry.activityEntryOtherTab.uIEntryTimeEdit
					.sendKeys(BaseData.getActivityModuleValue(""));
		}

		public void EnterEnteredBy() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIEnteredByEdit.sendKeys(Keys.TAB);
		}

		public void SelectSendnoticeonChangescheckbox() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uISendNoticeOnChangesCheckBox.click();
		}

		public void ClickDivisionSectionSquadArrow() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIDivisionSectionSquadArrow.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectAtDivision() {

			uIMapActivity.activityEntry.activityEntryOtherTab.uIDivisionDropdown
					.sendKeys(BaseData.getActivityModuleValue(""));
		}

		public void SelectAtSection() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uISectionDropdown
					.sendKeys(BaseData.getActivityModuleValue(""));
		}

		public void SelectAtTeam() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uITeamDropdown
					.sendKeys(BaseData.getActivityModuleValue(""));
		}

		public void SelectAtSquad() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uISquadEdit.sendKeys(BaseData.getActivityModuleValue(""));
		}

		public void ClickAddButton() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIAdd1Button.click();
		}

		public void ClickClearButton() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIClear1Button.click();
		}

		public void EnterPFAtPF() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIPFCodeEdit
					.sendKeys(BaseData.getActivityModuleValue("PF"));
			uIMapActivity.activityEntry.activityEntryOtherTab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAssingedPFArrow() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIAssingedPFArrow.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPF() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIPFCodeEdit
					.sendKeys(BaseData.getActivityModuleValue("AssignedPF"));
			uIMapActivity.activityEntry.activityEntryOtherTab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickAdd1Button() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIAdd2Button.click();
		}

		public void ClickClear1Button() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIClear2Button.click();
		}

		public void ClickAddMultiplePFButton() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uIAddMultiplePFButton.click();
		}

		public void selectScheduleCallInCADCheckBox() {
			if (!uIMapActivity.activityEntry.activityEntryOtherTab.uIScheduleCADCheckBox.isSelected()) {
				uIMapActivity.activityEntry.activityEntryOtherTab.uIScheduleCADCheckBox.click();
			}
		}

		public void enterAtScheduledDate() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityEntry.activityEntryOtherTab.uIScheduleDateEdit.sendKeys(Randomized.getCurrentDate());

		}

		public void enterAtScheduledTime() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityEntry.activityEntryOtherTab.uIScheduleTimeEdit
					.sendKeys(Randomized.getCurrentTime("HH:mm"));
		}

		public void enterAtCFS() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityEntry.activityEntryOtherTab.uICFSedit
					.sendKeys(BaseData.getActivityModuleValue("CFS"));
		}

		public void selectAtSRC() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapActivity.activityEntry.activityEntryOtherTab.uISRCdropdown,
					BaseData.getActivityModuleValue("SRC"));

		}

		public void clickSquadLookUpButton() {
			uIMapActivity.activityEntry.activityEntryOtherTab.uISquadLookUpButton.click();
		}

		public void verifyAtDivisionInGrid(int rowIndex) {
			List<String> gridRowCellsValues = objectIdentification.manualIdentify.getGridRowCellsValues(
					uIMapActivity.activityEntry.activityEntryOtherTab.uIOtherTabResultTable, rowIndex);
//        	WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapActivity.activityEntry.activityEntryOtherTab.uIOtherTabResultTable, BaseData.getActivityModuleValue("Division"));
			verify.ExpectedValueIsTrue(gridRowCellsValues.contains(BaseData.getActivityModuleValue("Division")));
		}

	}

	public class ActivityEntryLogEntryTab {

		public void VerifyAtReferToFPBTextAutopopulated() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("ReferToFPB"),
					uIMapActivity.activityEntry.activityEntryLogEntryTab.uINarrativeRichTextEdit
							.findElement(By.tagName("body")).getText());
		}

		public void SelectAtTemplate() {
			uIMapActivity.activityEntry.activityEntryLogEntryTab.uITemplateComboBox
					.sendKeys(BaseData.getActivityModuleValue("Template"));
			Playback.controlReadyThreadWait();

		}

		public void ClickLoadButton() {
			uIMapActivity.activityEntry.activityEntryLogEntryTab.uILoadButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAddNewButton() {
			uIMapActivity.activityEntry.activityEntryLogEntryTab.uIAddnewButton.click();
		}

		public void EnterLog() {
			uIMapActivity.activityEntry.activityEntryLogEntryTab.uINarrativeRichTextEdit
					.sendKeys(Randomized.randomString(200));
		}

	}

	public class AttachmentTab {
		public AttachmentPopupWindow attachmentPopupWindow = null;

		public AttachmentTab() {
			if (this.attachmentPopupWindow == null)
				this.attachmentPopupWindow = new AttachmentPopupWindow();
		}

		public void clickAddFiles() {
			uIMapActivity.activityEntry.activityEntryAttachmentTab.uIAddFiles.click();

		}

		public class AttachmentPopupWindow {

			public void selectCategory() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapActivity.activityEntry.activityEntryAttachmentTab.attachmentPopupWindow.uICategoryComboBox,
						"Scan - Document");
				Playback.controlReadyThreadWait();
				uIMapActivity.activityEntry.activityEntryAttachmentTab.attachmentPopupWindow.uICategoryComboBox
						.sendKeys(Keys.TAB);
			}

			public void clickFileEdit() {
				uIMapActivity.activityEntry.activityEntryAttachmentTab.attachmentPopupWindow.uIContainer.click();
			}

			public void selectImgFile() {
				if (Playback.browserType.equals("Chrome")) {
					objectIdentification.filesHandle.fileAttach.fileUpload("img2.png");
				}

				else {
					objectIdentification.filesHandle.fileAttach.fileUploadAutoIt("img2.png");
				}
			}

			public void clickAddButton() {
				uIMapActivity.activityEntry.activityEntryAttachmentTab.attachmentPopupWindow.uIAddButton.click();
			}

		}

	}

	public class LogHistoryTab {
		public void EnterUpdateDateTime() {
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uIUpdateDateTextBox
					.sendKeys(Randomized.getCurrentDate());
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uIUpdateTimeTextBox
					.sendKeys(Randomized.getCurrentTime());
		}

		public void EnterUpdateBy() {
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uIUpdatedByTextBox.sendKeys(Keys.TAB);

		}

		public void EnterDuration() {
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uIDurationTextBox.click();
			Playback.controlReadyThreadWait();
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uIDurationTextBox
					.sendKeys(Randomized.randomNumberString(1));
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uIDurationTypeDropdown
					.sendKeys(BaseData.getActivityModuleValue("Duration"));

		}

		public void EnterAtComments() {
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uICommentsTextBox
					.sendKeys(BaseData.getActivityModuleValue("Comments"));
			Playback.controlReadyThreadWait();
		}

		public void ClickSaveButton() {
			uIMapActivity.activityEntry.activityEntryLogHistoryTab.uISaveButton.click();
		}

		public void verifyAthistoryGrid() {
			 String gridCell = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapActivity.activityEntry.activityEntryLogHistoryTab.uILogHistoryGridButton.getText(), BaseData.getActivityModuleValue("ActivityInGrid")).toString();
			 System.out.println(gridCell);
			//verify.ExpectedPropertyValueIsEqual(gridCell, BaseData.getActivityModuleValue("ActivityInGrid"));
			verify.ExpectedValueIsTrue(gridCell.contains(BaseData.getActivityModuleValue("ActivityInGrid")));
			  
		}
	}

	public class ActivityEntryVisitorsTab {
		public void EnterAtName() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uILastNameEdit
					.sendKeys(BaseData.getActivityModuleValue("LastName"));
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uIFirstNameEdit
					.sendKeys(BaseData.getActivityModuleValue("FirstName"));
		}

		public void EnterAtEmail() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uIEmailEdit
					.sendKeys(BaseData.getActivityModuleValue(""));
		}

		public void EnterAtNotes() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uINotesEdit
					.sendKeys(BaseData.getActivityModuleValue("Notes"));
		}

		public void EnterAtTime() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uITimeInEdit
					.sendKeys(BaseData.getActivityModuleValue("Time-In"));
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uITimeOutEdit
					.sendKeys(BaseData.getActivityModuleValue("Time-Out"));
		}

		public void ClickAddButton() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickClearButton() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uIClearButton.click();
		}

		public void EnterAtLastName() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uILastNameEdit
					.sendKeys(BaseData.getActivityModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uIFirstNameEdit
					.sendKeys(BaseData.getActivityModuleValue("FirstName"));
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtNameInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activityEntry.activityEntryVisitorsTab.uIVisitorGirdTable, "Name", rowIndex));
		}

		public void VerifyAtNotesInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("Notes"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activityEntry.activityEntryVisitorsTab.uIVisitorGirdTable, "Notes",
							rowIndex));
		}

		public void TabTimeIn() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uITimeInEdit.sendKeys(Keys.TAB);
		}

		public void EnterTimeOutAsFutureTime() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uITimeOutEdit
					.sendKeys(Randomized.getFutureTimeByHours(5, "HH:mm"));
		}

		public void ClickAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapActivity.activityEntry.activityEntryVisitorsTab.uIVisitorGirdTable,
					BaseData.getActivityModuleValue("Name"));
			Playback.controlReadyThreadWait();
		}

		public void ClickNameInfoIcon() {
			uIMapActivity.activityEntry.activityEntryVisitorsTab.uINameInfoIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAtName1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapActivity.activityEntry.activityEntryVisitorsTab.uIVisitorGirdTable,
					BaseData.getActivityModuleValue("Name1"));
			Playback.controlReadyThreadWait();
		}

	}

	public class PublicEducationTab {
		public void SelectAtProgramName() {
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uIProgramNameDropdown
					.sendKeys(BaseData.getActivityModuleValue("ProgramName"));
		}

		public void EnterAtQtyIfApplicable() {
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uIQtyifAppicableEdit
					.sendKeys(BaseData.getActivityModuleValue("Qty"));
		}

		public void EnterAtLocationName() {
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uILocationNameEdit
					.sendKeys(BaseData.getActivityModuleValue("LocationName"));

		}

		public void EnterAtContactName() {
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uIContactLastNameEdit
					.sendKeys(BaseData.getActivityModuleValue("ContactLastName"));
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uIContactFirstNameEdit
					.sendKeys(BaseData.getActivityModuleValue("ContactFirstName"));
		}

		public void EnterAtContactInfo() {
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uIContactInfoEdit
					.sendKeys(BaseData.getActivityModuleValue("ContactInfo"));
		}

		public void EnterAtNoOfAdults() {
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uINoOfAdultsEdit
					.sendKeys(BaseData.getActivityModuleValue("NoOfAdults"));
		}

		public void EnterAtNoOfChildren() {
			uIMapActivity.activityEntry.activityEntryPublicEducationTab.uINoOfChildrenEdit
					.sendKeys(BaseData.getActivityModuleValue("NoOfChildren"));
		}

	}

	public class MaintenanceTab {
		public void EnterAtCurrentMileage() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uICurrentMileageEdit
					.sendKeys(BaseData.getActivityModuleValue("CurrentMileage"));
		}

		public void EnterAtCurrentHours() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uICurrentHoursEdit
					.sendKeys(BaseData.getActivityModuleValue("CurrentHours"));
		}

		public void EnterAtVendor() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIVendorEdit
					.sendKeys(BaseData.getActivityModuleValue("Vendor"));
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIVendorEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCost() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uICostEdit
					.sendKeys(BaseData.getActivityModuleValue("Cost"));
		}

		public void EnterAtPartNo() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIEnterpartNoEdit
					.sendKeys(BaseData.getActivityModuleValue("EnterPartNo"));
		}

		public void EnterAtdescription() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIDescriptionEdit
					.sendKeys(BaseData.getActivityModuleValue("Description"));
		}

		public void EnterAtQty() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIQtyEdit
					.sendKeys(BaseData.getActivityModuleValue("Qty"));
		}

		public void EnterAtpartCost() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIQtyCostEdit
					.sendKeys(BaseData.getActivityModuleValue("InventryCost"));
		}

		public void ClickSaveButton() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uISaveButton.click();
		}

		public void ClickClearButton() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIClearButton.click();
		}

		public void ClickAddButton() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIAddButton.click();
		}

		public void ClickResetButton() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIResetButton.click();
		}

		public void clickUseItemsFromInventoryCheckBox() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIUseItemfromInventryCheckBox.click();
		}

		public void clickInventoryLookUpButton() {
			uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIInventoryLookUpButton.click();
		}

		public void verifyAtInvOrPartNo() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapActivity.activityEntry.activityEntryMaintenanceTab.uIMaintenanceGirdTable,
					BaseData.getActivityModuleValue("InvOrPartNo"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getActivityModuleValue("InvOrPartNo")));
		}
	}

	public class ActivityEntryQAFormsTab {

		public void ClickSaveButton() {
			uIMapActivity.activityEntry.activityEntryQAFormsTab.uISaveButton.click();
		}

		public void Save() {
			uIMapActivity.activityEntry.activityEntryQAFormsTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickPrintButton() {
			uIMapActivity.activityEntry.activityEntryQAFormsTab.uIPrintButton.click();
		}

		public void ClickDwellingType1RadioButton() {
			uIMapActivity.activityEntry.activityEntryQAFormsTab.uIDwellingType1RadioButton.click();
		}

		public void TabOutPFCode() {
			uIMapActivity.activityEntry.activityEntryQAFormsTab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void SwitchToSmokeQAFormTab() {
			uIMapActivity.activityEntry.activityEntryQAFormsTab.uISmokeQAFormsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmQnDataEnty");

		}

		public void selectAtSelectForm() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapActivity.activityEntry.activityEntryQAFormsTab.uISelectFormComboBox,
					BaseData.getSettingsModuleValue("QAForm"));
		}
		
		public void selectAtSelectForm1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapActivity.activityEntry.activityEntryQAFormsTab.uISelectFormComboBox,
					BaseData.getSettingsModuleValue("QAForm1"));
		}

		public void clickRefreshButton() {
			uIMapActivity.activityEntry.activityEntryQAFormsTab.uIRefreshButton.click();
		}

		public void verifyAtFormNameInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapActivity.activityEntry.activityEntryQAFormsTab.uIQAFormsTable,
					BaseData.getActivityModuleValue("FormName"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("FormName"), gridCell.getText());
		}

		public void verifyAtFormName1InGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapActivity.activityEntry.activityEntryQAFormsTab.uIQAFormsTable,
					BaseData.getActivityModuleValue("FormName1"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("FormName1"), gridCell.getText());
		}

	}

	public class NamesTab {
		public void EnterAtLastName() {
			uIMapActivity.activityEntry.namesTab.uILastNameEdit.sendKeys(BaseData.getActivityModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapActivity.activityEntry.namesTab.uILastNameEdit.sendKeys(BaseData.getActivityModuleValue("FirstName"));
			uIMapActivity.activityEntry.namesTab.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void clickAddbutton() {
			uIMapActivity.activityEntry.namesTab.uIAddButton.click();
		}

		public void selectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapActivity.activityEntry.namesTab.uIActivityCombobox,
					BaseData.getActivityModuleValue("Activity"));
			;
			uIMapActivity.activityEntry.namesTab.uIActivityCombobox.sendKeys(Keys.TAB);
		}

		public void saveInternalTab() {
			uIMapActivity.activityEntry.namesTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtActivityInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("Activity"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activityEntry.namesTab.uINamesGirdTable, "Activity", rowIndex));
		}

		public void VerifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activityEntry.namesTab.uINamesGirdTable, "Name", rowIndex));
		}

		public void DeleteAtName() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapActivity.activityEntry.namesTab.uINamesGirdTable, BaseData.getActivityModuleValue("Name"));
		}

		public void VerifyConfirmationDeleteMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4)     Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}
	}

	public class ActivityEntryFeesTab {

		public void selectInvoiceType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapActivity.activityEntry.activityEntryFeesTab.uIInvoiceTypeComboBox);
		}

		public void enterAtBillToAccountNameID() {

			uIMapActivity.activityEntry.activityEntryFeesTab.uIBillToAccountNameTypeEdit
					.sendKeys(BaseData.getAccountingModuleValue("BillToAccountNameID").substring(0, 1));
			uIMapActivity.activityEntry.activityEntryFeesTab.uIBillToAccountNameIDEdit
					.sendKeys(BaseData.getAccountingModuleValue("BillToAccountNameID").substring(2));
			uIMapActivity.activityEntry.activityEntryFeesTab.uIBillToAccountNameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void selectItemCode() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapActivity.activityEntry.activityEntryFeesTab.uIItemCodeComboBox);
		}

		public void clickAddButton() {
			uIMapActivity.activityEntry.activityEntryFeesTab.uIAddButton.click();
		}

		public void Save() {
			uIMapActivity.activityEntry.activityEntryFeesTab.uISaveButton.click();
			popup.confirm.yes();
		}

	}

	public class ActivityEntryServiceHistoryTab {
		public void verifyAtVendorCode() {
			String code = uIMapActivity.activityEntry.activityEntryServiceHistoryTab.uIVendorCode.getAttribute("value");

			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("VendorCode"), code);
		}

		public void verifyAtCost() {
			String Cost = uIMapActivity.activityEntry.activityEntryServiceHistoryTab.uICost.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Cost"), Cost);
		}

		public void verifyAtNotes() {
			String Notes = uIMapActivity.activityEntry.activityEntryServiceHistoryTab.uINotes.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(BaseData.getHomeModuleValue("Notes"), Notes);
		}
	}

	public class SchedulesTab {

		public void clickPFNotesIconInGrid(int rowIndex) {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapActivity.activityEntry.schedulesTab.uISchedulesResultTable, "PF", rowIndex);
			gridCell.click();
		}

		public void verifyAtPFNotesToolTip() {
			String text = uIMapActivity.activityEntry.schedulesTab.uIPFNotesIconToolTip.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getActivityModuleValue("PFNotesToolTip")));
		}

		public void clickCloseInPFNotesToolTip() {
			uIMapActivity.activityEntry.schedulesTab.uIPFNotesIconToolTipCloseButton.click();
		}

	}

	public class ActivityEntryTR1Tab {

		public void tabOutPFNo() {
			uIMapActivity.activityEntry.activityEntryTR1Tab.uIPFNoEdit.sendKeys(Keys.TAB);
		}

		public void clickYesRadioButton() {
			Playback.popupThreadWait();
			List<WebElement> uIRadoButtonCollection = uIMapActivity.activityEntry.activityEntryTR1Tab.uIDivQuestionTable
					.findElements(By.xpath("//input[@type='radio']"));
			int RadioButtonCount = uIRadoButtonCollection.size();

			int yesRadioIndex = Randomized.getRandomEvenNumber(uIRadoButtonCollection.size() - 1);
			uIRadoButtonCollection.get(yesRadioIndex).click();
		}

		public void clickSave() {
			uIMapActivity.activityEntry.activityEntryTR1Tab.uIInternalSaveButton.click();
		}

	}

	public class RecurrencePopUp {

		public void clickHourlyRadioButton() {
			uIMapActivity.activityEntry.recurrencePopUp.uIHourlyRadioButton.click();
		}

		public void clickDailyRadioButton() {
			uIMapActivity.activityEntry.recurrencePopUp.uIDailyRadioButton.click();
		}

		public void enterAtEndAfter() {
			uIMapActivity.activityEntry.recurrencePopUp.uIEndAfterCodeEdit.click();
			uIMapActivity.activityEntry.recurrencePopUp.uIEndAfterCodeEdit.clear();
			uIMapActivity.activityEntry.recurrencePopUp.uIEndAfterCodeEdit
					.sendKeys(BaseData.getActivityModuleValue("EndAfter"));
			uIMapActivity.activityEntry.recurrencePopUp.uIEndAfterCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickCloseButton() {
			uIMapActivity.activityEntry.recurrencePopUp.uICloseButton.click();
		}

	}

	public class ActivitySearch {

		public void EnterActivityPeriod() {
			uIMapActivity.activitySearch.uIActivityFromDateEdit.sendKeys(Randomized.getPreviousDate(30, "MM/dd/yyyy"));
			uIMapActivity.activitySearch.uIActivityFromTimeEdit.sendKeys(Randomized.getCurrentTime());
			uIMapActivity.activitySearch.uIActivityToDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapActivity.activitySearch.uIActivityToTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void SelectShowOnWhiteBoardCheckbox() {
			uIMapActivity.activitySearch.uIShowWhiteBoardItemOnlyCheckBox.click();
		}

		public void SelectAtCategoryGroup() {
			uIMapActivity.activitySearch.uICategoryGroupDropdown
					.sendKeys(BaseData.getActivityModuleValue("CategoryGroup"));
		}

		public void SelectAtCategory() {
			uIMapActivity.activitySearch.uICategoryDropdown.sendKeys(BaseData.getActivityModuleValue("Category"));
		}

		public void SelectAtActivityType() {
			uIMapActivity.activitySearch.uIActivityTypeDropdown
					.sendKeys(BaseData.getActivityModuleValue("ActivityType"));
		}

		public void SelectAtActivityStatus() {
			uIMapActivity.activitySearch.uIActivityStatusDropdown
					.sendKeys(BaseData.getActivityModuleValue("ActivityStatus"));
		}

		public void SelectAtPriority() {
			uIMapActivity.activitySearch.uIPriorityDropdown.sendKeys(BaseData.getActivityModuleValue("Priority"));
		}

		public void SelectAtFleet() {
			uIMapActivity.activitySearch.uIFleetDropdown.sendKeys(BaseData.getActivityModuleValue("Fleet"));
		}

		public void SelectAtUnit() {
			uIMapActivity.activitySearch.uIUnitDropdown.sendKeys(BaseData.getActivityModuleValue("Unit"));
		}

		public void EnterAtActivityBy() {
			uIMapActivity.activitySearch.uIActivityByEdit.sendKeys(BaseData.getActivityModuleValue("ActivityBy"));
		}

		public void SelectAtFollowUpBy() {
			uIMapActivity.activitySearch.uIFollowUpByDropdown.sendKeys(BaseData.getActivityModuleValue("Follow-UpBy"));
		}

		public void SelectAtApprovalStatus() {
			uIMapActivity.activitySearch.uIApprovalStatusDropdown
					.sendKeys(BaseData.getActivityModuleValue("ApprovalStatus"));
		}

		public void SelectAtDivision() {
			uIMapActivity.activitySearch.uIDivisionSectionSquadArrow.click();
			Playback.controlReadyThreadWait();
			uIMapActivity.activitySearch.uIDivisionDropdown.sendKeys(BaseData.getActivityModuleValue("Division"));
		}

		public void SelectAtSection() {
			uIMapActivity.activitySearch.uIDivisionSectionSquadArrow.click();
			Playback.controlReadyThreadWait();
			uIMapActivity.activitySearch.uISectionDropdown.sendKeys(BaseData.getActivityModuleValue("Section"));
		}

		public void SelectAtTeam() {
			uIMapActivity.activitySearch.uIDivisionSectionSquadArrow.click();
			Playback.controlReadyThreadWait();
			uIMapActivity.activitySearch.uITeamDropdown.sendKeys(BaseData.getActivityModuleValue("Team"));
		}

		public void SelectAtSquad() {
			uIMapActivity.activitySearch.uIDivisionSectionSquadArrow.click();
			Playback.controlReadyThreadWait();
			uIMapActivity.activitySearch.uISquadDropdown.sendKeys(BaseData.getActivityModuleValue("Squad"));
		}

		public void ClickAssignedToButton() {
			uIMapActivity.activitySearch.uIMultiplePFArrow.click();
			Playback.controlReadyThreadWait();
			uIMapActivity.activitySearch.uIAssignedToButton.click();
		}

		public void EnterAtPFNo() {
			uIMapActivity.activitySearch.uIPFNoEdit.sendKeys(BaseData.getActivityModuleValue("PFNo"));
			uIMapActivity.activitySearch.uIPFNoEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtPFActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapActivity.activitySearch.uIPFActivityDropdown,
					BaseData.getActivityModuleValue("PFActivity"));
			uIMapActivity.activitySearch.uIPFActivityDropdown.sendKeys(Keys.TAB);
		}

		public void SelectAtPFStatus() {
			uIMapActivity.activitySearch.uIPFStatusDropdown.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapActivity.activitySearch.uIPFStatusDropdown, BaseData.getActivityModuleValue("PFStatus"));
			uIMapActivity.activitySearch.uIPFStatusArrow.click();
		}

		public void SelectAtHoursWorked() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapActivity.activitySearch.uIHoursWorkedDropdown,
					BaseData.getActivityModuleValue("HoursWorkedOperator"));
			uIMapActivity.activitySearch.uIHoursWorkedDropdown.sendKeys(Keys.TAB);
			uIMapActivity.activitySearch.uIHoursWorkedValueEdit.sendKeys(BaseData.getActivityModuleValue("HoursValue"));
			uIMapActivity.activitySearch.uIHoursWorkedValueEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtcredits() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapActivity.activitySearch.uICreditsDropdown,
					BaseData.getActivityModuleValue("Credit"));
			uIMapActivity.activitySearch.uICreditsDropdown.sendKeys(Keys.TAB);
			uIMapActivity.activitySearch.uICreditsValueEdit.sendKeys(BaseData.getActivityModuleValue("CreditValue"));
			uIMapActivity.activitySearch.uICreditsValueEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtPayScale() {
			uIMapActivity.activitySearch.uIPayScaleDropdown.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapActivity.activitySearch.uIPayScaleDropdown, BaseData.getActivityModuleValue("PayScale"));
			uIMapActivity.activitySearch.uIPayScaleArrow.click();
		}

		public void SelectAtAssingedShift() {
			uIMapActivity.activitySearch.uIAssignedShiftDropdown
					.sendKeys(BaseData.getActivityModuleValue("AssignedShift"));
		}

		public void SelectAtType() {
			uIMapActivity.activitySearch.uITypeDropdown.sendKeys(BaseData.getActivityModuleValue("Type"));
		}

		public void clickAddMultiplePFButton() {
			uIMapActivity.activitySearch.uIAddMultiplePFButton.click();
		}

		public void EnterAtEnteredBy() {
			uIMapActivity.activitySearch.uIEnteredByEdit.sendKeys(BaseData.getActivityModuleValue("EnteredBy"));
			uIMapActivity.activitySearch.uIEnteredByEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtSubject() {
			uIMapActivity.activitySearch.uISubjectEdit.sendKeys(BaseData.getActivityModuleValue("Subject"));
		}

		public void SelectAtRefType() {
			uIMapActivity.activitySearch.uIRefTypeEdit.sendKeys(BaseData.getActivityModuleValue("RefType"));
			uIMapActivity.activitySearch.uIRefTypeValueEdit.sendKeys(BaseData.getActivityModuleValue("RefNo"));
		}

		public void EnterAtCustom() {
			uIMapActivity.activitySearch.uICustomEdit.sendKeys(BaseData.getActivityModuleValue("Custom"));
		}

		public void EnterAtVisitorName() {
			uIMapActivity.activitySearch.uIVisitorLastNameEdit
					.sendKeys(BaseData.getActivityModuleValue("VisitorLastName"));
			uIMapActivity.activitySearch.uIVisitorFirstNameEdit
					.sendKeys(BaseData.getActivityModuleValue("VisitorFirstName"));
		}

		public void ClickSearchLink() {
			uIMapActivity.activitySearch.uISearchButton.click();

		}

		public void ClickAcivityPeriodDateResetButton() {

			uIMapActivity.activitySearch.uIDateResetButton.click();
		}

		public void ClickPointsCustomLabel() {

			uIMapActivity.activitySearch.uIPointsCustomLabel.click();
		}

		public void ClickResetLink() {

			uIMapActivity.activitySearch.uIResetButton.click();
		}

		public void ClickBackLink() {
			uIMapActivity.activitySearch.uIBackButton.click();
		}

		public void clickAddNewButton() {
			uIMapActivity.activitySearch.uIAddNewButton.click();
		}

		public void VerifyAtActivityType(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("ActivityType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activitySearch.uIActivityLogResultTable, "Activity Type", rowIndex));
		}

		public void VerifyAtBy(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("By"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activitySearch.uIActivityLogResultTable, "By", rowIndex));
		}

		public void ClickAtActivityTypeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapActivity.activitySearch.uIActivityLogResultTable,
					BaseData.getActivityModuleValue("ActivityType"));
			Playback.controlReadyThreadWait();
		}

		public void ClickActivityTypeInGrid() {
			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapActivity.activitySearch.uIActivityLogResultTable);
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtCustomNameInCustomField() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("CustomName"),
					uIMapActivity.activitySearch.uIPointsCustomLabel.getText());
		}

		public void SelectAtActivityTypeRadControl() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activitySearch.uIActivityTypeDropdown.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapActivity.activitySearch.uIActivityTypeRadControlDropdown,
					BaseData.getGeoModuleValue("ActivityType"));
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIRelationComboBox,
			// BaseData.getGeoModuleValue("NameRelation"));
			// uIMapGeo.contactEntryScreen.uIRelationComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtSubjectInGrid() {
			List<String> list = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapActivity.activitySearch.uIActivityLogResultTable, "Subject");
			if (list.contains(BaseData.getHomeModuleValue("Subject")))
				verify.ExpectedValueIsTrue(list.contains(BaseData.getHomeModuleValue("Subject")));
		}

		public void verifyAtSubjectInGridWithNoDuplications() {
			List<String> list = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapActivity.activitySearch.uIActivityLogResultTable, "Subject");
			Object[] array = list.toArray();
			String subject = BaseData.getHomeModuleValue("Subject");
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				String temp = (String) array[i];
				if (subject.equals(temp)) {
					count = count + 1;
					verify.ExpectedIntergerValueIsEqualToActual(count, 1);
				}

			}

		}

		public void closeScreen() {
			uIMapActivity.activitySearch.driver.close();
		}

		public void verifyAtShowWhiteboardItemsOnlyCheckboxLabel() {
			String text = uIMapActivity.activitySearch.uIShowWhiteboardItemsOnlyLabel.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getHomeModuleValue("Title")));
		}

		public void verifyPFActivityIsDisplayed() {
			uIMapActivity.activitySearch.uIPFActivityDropdown.isDisplayed();
		}

		public void verifyPFStatusIsDisplayed() {
			uIMapActivity.activitySearch.uIPFStatusDropdown.isDisplayed();
		}

		public void verifyCreditsIsDisplayed() {
			uIMapActivity.activitySearch.uICreditsDropdown.isDisplayed();
			uIMapActivity.activitySearch.uICreditsValueEdit.isDisplayed();
		}

		public void verifyPayScaleIsDisplayed() {
			uIMapActivity.activitySearch.uIPayScaleDropdown.isDisplayed();
		}

		public void verifyHoursWorkedIsDisplayed() {
			uIMapActivity.activitySearch.uIHoursWorkedDropdown.isDisplayed();
			uIMapActivity.activitySearch.uIHoursWorkedValueEdit.isDisplayed();
		}

		public void verifyAssignedShiftIsDisplayed() {
			uIMapActivity.activitySearch.uIAssignedShiftDropdown.isDisplayed();
		}

		public void verifyAddMultiplePFButtonISDisplayed() {
			uIMapActivity.activitySearch.uIAddMultiplePFButton.isDisplayed();
		}

		public void verifyUnitIsDisplayed() {
			uIMapActivity.activitySearch.uIUnitDropdown.isDisplayed();
		}

		public void verifyFleetIsDisplayed() {
			uIMapActivity.activitySearch.uIFleetDropdown.isDisplayed();
		}

		public void verifyAtStatusInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapActivity.activitySearch.uIActivityLogResultTable, BaseData.getActivityModuleValue("Status"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getActivityModuleValue("Status")));
		}

		public void selectPFStatusAsCheckAll() {
			uIMapActivity.activitySearch.uIPFStatusDropdown.click();
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectRadControlDropDownCheckAllSelect(
					uIMapActivity.activitySearch.uIPFStatusDropdown, "Check All");
			uIMapActivity.activitySearch.uIPFStatusArrow.click();
		}

		public void selectPayScaleAsCheckAll() {
			uIMapActivity.activitySearch.uIPayScaleDropdown.click();
			objectIdentification.manualIdentify.selectRadControlDropDownCheckAllSelect(
					uIMapActivity.activitySearch.uIPayScaleDropdown, "Check All");
			uIMapActivity.activitySearch.uIPayScaleArrow.click();
		}

		public void SelectAtPFStatus1() {
//            uIMapActivity.activitySearch.uIPFStatusDropdown.sendKeys(BaseData.getActivityModuleValue("PFStatus"));
			uIMapActivity.activitySearch.uIPFStatusDropdown.click();
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapActivity.activitySearch.uIPFStatusDropdown, BaseData.getActivityModuleValue("PFStatus1"));
			uIMapActivity.activitySearch.uIPFStatusArrow.click();
		}

		public void clickAtStatusInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapActivity.activitySearch.uIActivityLogResultTable, BaseData.getActivityModuleValue("Status"));
			Playback.controlReadyThreadWait();
		}

		public void verifyNoRecordsFoundAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

	public void verifylogInPFIsDisplayed() {
			uIMapActivity.activitySearch.uILogInPFLabel.isDisplayed();
			
			
		}
	}

	public class ActivityCalendarEntry {
		public void SelectAtFilter() {
			uIMapActivity.activityCalendarEntry.uIFilterdropdown
					.sendKeys(BaseData.getActivityModuleValue("ActivityType"));
			Playback.controlReadyThreadWait();
		}

		public void SelectActivityEntryFromCalendar() {

		}

	}

	public class ActivitySearchHelpWindow {
		public void closeScreen() {
			uIMapActivity.activitySearchHelpWindow.driver.close();
		}

		public void verifyAtActivityType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("ActivityType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activitySearchHelpWindow.uIActivityLogResultTable, "Activity Type",
							rowIndex));
		}

		public void verifyActivityTypeAsCellAssigned(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Cell Assigned",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapActivity.activitySearchHelpWindow.uIActivityLogResultTable, "Activity Type",
							rowIndex));
		}
		public void clickSearch() {
			uIMapActivity.activitySearchHelpWindow.uISearchButton.click();
		}
		public void clickAddTheSelectedPFToTheList() {
			uIMapActivity.activitySearchHelpWindow.uIAddTheSelectedPFToTheList.click();
			
		}
		public void verifyAtPFName1() {
			uIMapActivity.activitySearchHelpWindow.uILogInPF.getText().contains(BaseData.getActivityModuleValue("PFName"));
			
		}

		public void verifyAtHomePhoneNo() {
			Playback.controlReadyThreadWait();
			String PhnNo = BaseData.getActivityModuleValue("PhoneNo") + BaseData.getActivityModuleValue("PhnType");
			WebElement ele = Playback.driver.findElement(
					By.xpath("//div[@id='RadTreeListAD']//tbody//tr//td//span[contains(text(),'" + PhnNo + "')]"));
			String actual = ele.getText();
			verify.ExpectedValueIsTrue(actual.contains(PhnNo));

		}

		public void verifyAtPFName() {
			Playback.controlReadyThreadWait();
			String PFName = BaseData.getActivityModuleValue("PFName");
			WebElement ele = Playback.driver.findElement(
					By.xpath("//div[@id='RadTreeListAD']//tbody//tr//td//span[contains(text(),'" + PFName + "')]"));
			String actual = ele.getText();
			verify.ExpectedValueIsTrue(actual.contains(PFName));
		}

		public void clickAtPhoneNo() {
			Playback.controlReadyThreadWait();
			String PhnNo = BaseData.getActivityModuleValue("PhoneNo") + BaseData.getActivityModuleValue("PhnType");
			WebElement ele = Playback.driver.findElement(
					By.xpath("//div[@id='RadTreeListAD']//tbody//tr//td//span[contains(text(),'" + PhnNo + "')]"));
			ele.click();
		}
		public void clickAtPFByName() {
		
			Playback.controlReadyThreadWait();
			String PFName = BaseData.getActivityModuleValue("AutoPFName");
			WebElement PFCheckBox = Playback.driver.findElement(
					By.xpath("//div[@id='RadMultiplePFTreeView']// span[contains(text(),'" + PFName + "')]/preceding-sibling::span[@class='rtUnchecked']"));
			PFCheckBox.click();
			
			
			
			
		}
		public void clickAtPFByName1() {
			
			Playback.controlReadyThreadWait();
			String PFName1 = BaseData.getActivityModuleValue("AutoPFName1");
			WebElement PFCheckBox = Playback.driver.findElement(
					By.xpath("//div[@id='RadMultiplePFTreeView']// span[contains(text(),'" + PFName1 + "')]/preceding-sibling::span[@class='rtUnchecked']"));
			PFCheckBox.click();
			
			
			
			
		}

		public void verifyPFNameAtDetailsPopup() {
			String actual = uIMapActivity.activitySearchHelpWindow.uIPFNamePopup.getText();
			verify.ExpectedValueIsTrue(actual.contains(BaseData.getPersonnelModuleValue("PFName")));
		}

		public void verifyPhoneNoAtDetailsPopup() {
			String actual = uIMapActivity.activitySearchHelpWindow.uIPhoneNoPopup.getText();
			verify.ExpectedValueIsTrue(actual.contains(BaseData.getPersonnelModuleValue("PhoneNo")));
		}

		public void verifyHomeNoColumnDisplayed() {
			verify.ExpectedValueIsTrue(uIMapActivity.activitySearchHelpWindow.uIHomeNoColumn.isDisplayed());
		}

		public void verifyAtSubjectInGrid() {
			List<String> list = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapActivity.activitySearch.uIActivityLogResultTable, "Subject");
			if (list.contains(BaseData.getHomeModuleValue("Subject")))
				verify.ExpectedValueIsTrue(list.contains(BaseData.getHomeModuleValue("Subject")));
		}

	}

	public class ActivityQuickEntry {
		public void clickCategoryGroupOperations() {
			uIMapActivity.activityQuickEntry.uICategoryGrpOperation.click();
		}

		public void clickCategoryPatrol() {
			uIMapActivity.activityQuickEntry.uICategory1.click();
		}

		public void clickActivityLogTypeParkPatrol() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityQuickEntry.uIActivityLog3.click();
		}

		public void enterAtUnit() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityQuickEntry.uIUnitCodeEdit.sendKeys(BaseData.getActivityModuleValue("Unit"));
			uIMapActivity.activityQuickEntry.uIUnitCodeEdit.sendKeys(Keys.TAB);
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtLocation() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityQuickEntry.uILocationEdit.sendKeys(BaseData.getActivityModuleValue("Location"));
			uIMapActivity.activityQuickEntry.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void verifyAddressValidated() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapActivity.activityQuickEntry.uIAddressBblIcon.isDisplayed());
		}

		public void enterAtNotes() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityQuickEntry.uINotesEdit.sendKeys(BaseData.getActivityModuleValue("Notes"));
		}

		public void save() {
			uIMapActivity.activityQuickEntry.uISaveBtn.click();
			popup.confirm.yes();
		}

		public void clickViewTodaysLog() {
			uIMapActivity.activityQuickEntry.uIDailyLog.click();
		}

		public void verifyAtActivityLocationFromQuickLog(int rowIndex) {
			Playback.controlReadyThreadWait();
			String loc = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapActivity.activityQuickEntry.uIActivityLogTable7087Screen, "Location", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("Location"), loc);
		}

		public void tabAtEndDateAndTime() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityQuickEntry.uIEndDate.click();
			uIMapActivity.activityQuickEntry.uIEndDate.sendKeys(Keys.TAB);
			uIMapActivity.activityQuickEntry.uIEndTime.sendKeys(Keys.TAB);
		}

		public void tabAtStartDateAndTime() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityQuickEntry.uIStartDate.sendKeys(Keys.TAB);
			uIMapActivity.activityQuickEntry.uIStartTime.sendKeys(Keys.TAB);
		}

		public void verifyAtShowOnWhiteboardLabel() {
			String text = uIMapActivity.activityQuickEntry.uIShowOnWhiteboardLabel.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getActivityModuleValue("Title")));
		}

		public void close() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				uIMapActivity.activityQuickEntry.driver.close();

			}

			else {
				uIMapActivity.activityQuickEntry.driver.close();
				objectIdentification.windowHandle.switchToWindowUsingURL("frmPnxGlbActivityLog.aspx");
				uIMapActivity.activityQuickEntry.driver.close();

			}
		}

		public void clickCategoryGroupFleet() {
			uIMapActivity.activityQuickEntry.uICategoryGrpFleet.click();
		}

		public void verifyCategoryGroupFleetButtonAsGreenColor() {
			String attribute = uIMapActivity.activityQuickEntry.uICategoryGrpFleet.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("green"));
		}

		public void verifyCategoryVehicleMaintenanceButtonAsGreenColor() {
			String attribute = uIMapActivity.activityQuickEntry.uICategory2.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("green"));
		}

		public void verifyActivityLogTypeCarWashButtonAsGreenColor() {
			String attribute = uIMapActivity.activityQuickEntry.uIActivityLog1.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("green"));
		}

		public void clickHelpButton() {
			uIMapActivity.activityQuickEntry.uIHelpButton.click();
		}

		public void clickCategoryVehicleMaintenance() {
			Playback.controlReadyThreadWait();
			uIMapActivity.activityQuickEntry.uICategory2.click();
		}

		public void clickActivityLogTypeCarWash() {
			uIMapActivity.activityQuickEntry.uIActivityLog1.click();
		}

		public void verifyAtActivityTypeFromQuickActivityLog(int rowIndex) {
			Playback.controlReadyThreadWait();
			String ActivityType = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapActivity.activityQuickEntry.uIActivityLogTable7087Screen, "Activity Type", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getActivityModuleValue("ActivityType"), ActivityType);
		}

		public void clickAtActivityTypeFromQuickActivityLogGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapActivity.activityQuickEntry.uIActivityLogTable7087Screen,
					BaseData.getActivityModuleValue("ActivityType"));
		}

	}

public class AddMultiplePF {
		public void ClickSelectAll() {
			uIMapActivity.addMultiplePF.uISelectAllCheckBox.click();
		}

		public void ClickAddTheSelectPFToList() {
			uIMapActivity.addMultiplePF.uIAddTheSelectPFToListButton.click();
			Playback.controlReadyThreadWait();
		}

		public void close() {
			Playback.driver.close();
		}

	}

	public void switchToAddMultiplePFScreen() {			  
		objectIdentification.windowHandle.switchToWindow("frmAddMultiPF");
	}

}
