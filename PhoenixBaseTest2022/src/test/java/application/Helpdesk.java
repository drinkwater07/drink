package application;

import org.openqa.selenium.Keys;

import dataAccess.BaseData;
import uIMaps.UIMapHelpdesk;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Helpdesk {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapHelpdesk uIMapHelpdesk = new UIMapHelpdesk();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();

	public EmailSettings emailSettings;
	public TicketEntry ticketEntry;
	public TicketSearch ticketSearch;

	public Helpdesk() {

		if (emailSettings == null)
			emailSettings = new EmailSettings();

		if (ticketEntry == null)
			ticketEntry = new TicketEntry();

		if (ticketSearch == null)
			ticketSearch = new TicketSearch();

	}

	public void Reset() {

		uIMapHelpdesk = null;
		uIMapPopup = null;
	}

	public void switchToTicketSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("HelpDesk/frmTicketSearch.aspx");

	}

	public void switchToEmailSettings() {
		objectIdentification.windowHandle.switchToWindow("Email Settings");
	}

	public void switchToTicketEntry() {
		objectIdentification.windowHandle.switchToWindow("Ticket Entry");
	}

	public class EmailSettings {

		public void selectAtHelpDeskClass() {

			uIMapHelpdesk.emailSettings.uIHelpdeskClassComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("HelpDeskClass"));
		}

		public void enterAtEmailAddressToWatch() {
			uIMapHelpdesk.emailSettings.uIEmailAddressToWatchEdit.sendKeys(BaseData.getHelpdeskModuleValue("EmailID"));
			uIMapHelpdesk.emailSettings.uIEmailAddressToWatchEdit.sendKeys(Keys.TAB);
		}

		public void enterAtSmtpServer() {
			uIMapHelpdesk.emailSettings.uISmtpServerEdit.sendKeys(BaseData.getHelpdeskModuleValue("EmailID"));
			uIMapHelpdesk.emailSettings.uISmtpServerEdit.sendKeys(Keys.TAB);
		}

		public void enterAtSmtpPassWord() {
			uIMapHelpdesk.emailSettings.uIPasswordEdit.sendKeys(BaseData.getHelpdeskModuleValue("PassWord"));
			uIMapHelpdesk.emailSettings.uIPasswordEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNotificationEmail() {
			uIMapHelpdesk.emailSettings.uINotificationEmailEdit.sendKeys(BaseData.getHelpdeskModuleValue("Emails"));
			uIMapHelpdesk.emailSettings.uINotificationEmailEdit.sendKeys(Keys.TAB);
		}

		public void selectAtCategory() {

			uIMapHelpdesk.emailSettings.uICategoryComboBox.sendKeys(BaseData.getHelpdeskModuleValue("Category"));
		}

		public void selectAtStatus() {

			uIMapHelpdesk.emailSettings.uIStatusComboBox.sendKeys(BaseData.getHelpdeskModuleValue("Status"));
		}

		public void selectAtPriority() {

			uIMapHelpdesk.emailSettings.uIPriorityComboBox.sendKeys(BaseData.getHelpdeskModuleValue("Priority"));
		}

		public void selectAtType() {

			uIMapHelpdesk.emailSettings.uITypeComboBox.sendKeys(BaseData.getHelpdeskModuleValue("Type"));
		}

		public void selectAtOwnerPF() {

			uIMapHelpdesk.emailSettings.uIOwnerPFCodeEdit.sendKeys(BaseData.getHelpdeskModuleValue("PFID"));
		}

		public void selectAtDistributionList() {

			uIMapHelpdesk.emailSettings.uIManagersDistributionListComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("DistributionList"));
		}

		public void save() {
			uIMapHelpdesk.emailSettings.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapHelpdesk.emailSettings.uISaveAndAddNewButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapHelpdesk.emailSettings.uISaveButton.click();
		}

		public void close() {
			uIMapHelpdesk.emailSettings.driver.close();
		}

		public void clickRefreshIcon() {
			uIMapHelpdesk.emailSettings.uIRefreshIcon.click();
		}

	}

	public class TicketEntry {

		public void selectAtHelpDeskClass() {

			uIMapHelpdesk.ticketEntry.uIHelpdeskClassComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("HelpDeskClass"));
		}

		public void selectAtStatus() {

			uIMapHelpdesk.ticketEntry.uIStatusComboBox.sendKeys(BaseData.getHelpdeskModuleValue("Status"));
		}

		public void enterAtCreatorPF() {
			uIMapHelpdesk.ticketEntry.uICreatorPFEdit.sendKeys(BaseData.getHelpdeskModuleValue("CreatorPF"));
			uIMapHelpdesk.ticketEntry.uICreatorPFEdit.sendKeys(Keys.TAB);
		}

		public void enterAtOwnerPF() {
			uIMapHelpdesk.ticketEntry.uIOwnerPFEdit.sendKeys(BaseData.getHelpdeskModuleValue("OwnerPF"));
			uIMapHelpdesk.ticketEntry.uIOwnerPFEdit.sendKeys(Keys.TAB);
		}

		public void selectAtPriority() {

			uIMapHelpdesk.ticketEntry.uIPriorityComboBox.sendKeys(BaseData.getHelpdeskModuleValue("Priority"));
		}

		public void enterAtSubject() {
			uIMapHelpdesk.ticketEntry.uISubjectEdit.sendKeys(BaseData.getHelpdeskModuleValue("Subject"));
			uIMapHelpdesk.ticketEntry.uISubjectEdit.sendKeys(Keys.TAB);
		}

		public void enterSubject() {
			Playback.controlReadyThreadWait();
			uIMapHelpdesk.ticketEntry.uISubjectEdit.sendKeys(Randomized.randomString(20));
			uIMapHelpdesk.ticketEntry.uISubjectEdit.sendKeys(Keys.TAB);
		}

		public void enterAtProblemDescription() {
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIProblemDescriptionEdit
					.sendKeys(BaseData.getHelpdeskModuleValue("ProblemDescription"));
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIProblemDescriptionEdit.sendKeys(Keys.TAB);
		}

		public void enterProblemDescription() {
			Playback.controlReadyThreadWait();
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIProblemDescriptionEdit
					.sendKeys(Randomized.randomString(20));
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIProblemDescriptionEdit.sendKeys(Keys.TAB);
		}

		public void VendorNotes() {
			Playback.controlReadyThreadWait();
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIVendotNotesEdit.sendKeys(Randomized.randomString(10));
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIVendotNotesEdit.sendKeys(Keys.TAB);
		}

		public void enterAtVersion() {
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIVersionEdit
					.sendKeys(BaseData.getHelpdeskModuleValue("Version"));
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIVersionEdit.sendKeys(Keys.TAB);
		}

		public void enterAtRelatedCRM() {
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIRelatedCrmEdit
					.sendKeys(BaseData.getHelpdeskModuleValue("RelatedCRM"));
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIRelatedCrmEdit.sendKeys(Keys.TAB);
		}

		public void selectAtCategory() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uICategoryComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("Category"));
		}

		public void selectAtProject() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIProjectComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("Project"));
		}

		public void selectAtType() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uITypeComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("Type"));
		}

		public void selectAtModule() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIModuleComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("Module"));
		}

		public void selectAtCreatorJuris() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uICreatorJurisComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("Createdjuris"));
		}

		public void selectAtVendorName() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIVendorNameComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("Vendor"));
		}

		public void selectAtVendorContact() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIVendorContactComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("VendorContact"));
		}

		public void selectAtHowWasitClosed() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIhowWasitClosedComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("Closed"));
		}

		public void selectAtActionPlan() {

			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIActionPlanComboBox
					.sendKeys(BaseData.getHelpdeskModuleValue("ActionPlan"));
		}

		public void verifyEnterHelpDeskClassAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Help Desk Class");
		}

		public void verifyEnterSubjectAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Subject");
		}

		public void verifyEnterCreatorAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Creator");
		}

		public void verifyEnterStatusAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Status");
		}

		public void verifyEnterPriorityAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Priority");
		}

		public void verifyEnterOwnerAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Owner");
		}

		public void clickDetailTab() {
			uIMapHelpdesk.ticketEntry.uIDetailTab.click();
		}

		// public void save() {
		// uIMapHelpdesk.ticketEntry.uISaveButton.click();
		// popup.confirm.yes();
		// }

		public void saveNClose() {
			uIMapHelpdesk.ticketEntry.uISaveAndAddNewButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapHelpdesk.ticketEntry.uISaveButton.click();
		}

		public void clickRefreshIcon() {
			uIMapHelpdesk.ticketEntry.uIRefreshButton.click();
		}

		public void close() {
			Playback.controlReadyThreadWait();
			uIMapHelpdesk.ticketEntry.driver.close();

		}

		public void save() {
			objectIdentification.manualIdentify.SaveTheScreen();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void saveandclose() {
			objectIdentification.manualIdentify.saveAndCloseTheScreen();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void tabDueByDateAndTime() {
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIDueByDateEdit.sendKeys(Keys.TAB);
			uIMapHelpdesk.ticketEntry.ticketEntryDetailTab.uIDueByTimeEdit.sendKeys(Keys.TAB);

		}

	}

	public class TicketSearch {

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIJurisDropdown,
					BaseData.getHelpdeskModuleValue("Juris"));
		}

		public void selectAtCreatorJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIJurisDropdown,
					BaseData.getHelpdeskModuleValue("CreatorJuris"));
		}

		public void selectJurisAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIJurisDropdown, "--");
		}

		public void selectCreatorAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uICreatorJurisComboBox,
					"--");
		}

		public void selectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIStatusComboBox,
					BaseData.getHelpdeskModuleValue("Status"));
		}

		public void selectAtPriority() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIPriorityComboBox,
					BaseData.getHelpdeskModuleValue("priority"));
		}

		public void selectAtCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uICategoryComboBox,
					BaseData.getHelpdeskModuleValue("Category"));
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uITypeComboBox,
					BaseData.getHelpdeskModuleValue("Type"));
		}

		public void selectAtModule() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIModuleComboBox,
					BaseData.getHelpdeskModuleValue("Module"));
		}

		public void selectAtProject() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIProjectComboBox,
					BaseData.getHelpdeskModuleValue("Project"));
		}

		public void selectAtHowItWasClosed() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapHelpdesk.ticketSearch.uIHowItWasClosedComboBox, BaseData.getHelpdeskModuleValue("How"));
		}

		public void selectAtActionPlan() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapHelpdesk.ticketSearch.uIActionPlanComboBox,
					BaseData.getHelpdeskModuleValue("Plan"));
		}

		public void clickSearchButton() {
			uIMapHelpdesk.ticketSearch.uISearchButton.click();
			Playback.waitForControlReady();
		}

		public void ClickResetButton() {
			Playback.waitForControlReady();
			uIMapHelpdesk.ticketSearch.uIResetButton.click();
			Playback.waitForControlReady();
		}

		public void ClickDateResetButton() {
			uIMapHelpdesk.ticketSearch.uIDateResetButton.click();
			Playback.waitForControlReady();
		}

		public void BackButton() {
			uIMapHelpdesk.ticketSearch.uIBackButton.click();
			Playback.waitForControlReady();
		}

		public void ClickPrintButton() {
			uIMapHelpdesk.ticketSearch.uIPrintButton.click();
			Playback.waitForControlReady();
		}

		public void ClickRefreshButton() {
			uIMapHelpdesk.ticketSearch.uIRefreshButton.click();
			Playback.waitForControlReady();
		}

		public void clickBackButton() {
			uIMapHelpdesk.ticketSearch.uIBackButton.click();
			Playback.waitForControlReady();
		}

		public void AddNewButton() {
			uIMapHelpdesk.ticketSearch.uIAddNewButton.click();

		}

		public void EnterTicketYear(String TicketYear) {
			uIMapHelpdesk.ticketSearch.uITicketYearEdit.sendKeys(TicketYear);
		}

		public void EnterTicketNumber(String TicketNumber) {
			uIMapHelpdesk.ticketSearch.uITicketNumberEdit.sendKeys(TicketNumber);
			uIMapHelpdesk.ticketSearch.uITicketNumberEdit.sendKeys(Keys.TAB);
		}

		public void VerifyTicketNumberInGrid(String TicketNo) {
			verify.ExpectedPropertyValueIsEqual(TicketNo, objectIdentification.manualIdentify
					.getGridCell(uIMapHelpdesk.ticketSearch.uISearchResultGrid, TicketNo).getText());
		}

		public void enterAtTicketNo() {
			uIMapHelpdesk.ticketSearch.uITicketYearEdit
					.sendKeys(BaseData.getHelpdeskModuleValue("TicketNo").substring(0, 2));
			uIMapHelpdesk.ticketSearch.uITicketNumberEdit
					.sendKeys(BaseData.getHelpdeskModuleValue("TicketNo").substring(3));
			uIMapHelpdesk.ticketSearch.uITicketNumberEdit.sendKeys(Keys.TAB);

		}
		// public void ClickNextButton() {
		// uIMapHelpdesk.ticketSearch.uINextButton.click();
		// }

		// public void ClickPreviousButton() {
		// uIMapHelpdesk.ticketSearch.uIPreviousButton.click();
		// }
	}

}
