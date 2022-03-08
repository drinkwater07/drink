package application;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import dataAccess.BaseData;
import uIMaps.UIMapEmploymentApplicants;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class EmploymentApplicants {

	ObjectIdentification objectIdentification = new ObjectIdentification();
	Popup popup = new Popup();
	UIMapEmploymentApplicants uIMapEmploymentApplicants = new UIMapEmploymentApplicants();
	public JobListings jobListings;
	public ApplicantEntry applicantEntry;
	public ApplicantSearch applicantSearch;
	public JobEntry jobEntry;
	public HiringTask hiringTask;

	public EmploymentApplicants() {
		if (jobListings == null)
			jobListings = new JobListings();

		if (applicantEntry == null)
			applicantEntry = new ApplicantEntry();

		if (applicantSearch == null)
			applicantSearch = new ApplicantSearch();

		if (jobEntry == null)
			jobEntry = new JobEntry();

		if (hiringTask == null)
			hiringTask = new HiringTask();

	}

	public void switchToJobListings() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmJobListingsSrch.aspx");
	}

	public void switchToApplicantEntry() {
		objectIdentification.windowHandle.switchToWindow("Applicant Entry");
	}

	public void switchToApplicantSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmApplicantSrch.aspx");
	}

	public void switchToJobEntry() {
		objectIdentification.windowHandle.switchToWindow("Job Entry");
	}

	public void switchToHiringTask() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmHiringTasks.aspx");
	}

	public class JobListings {

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.jobListings.uIJurisComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Juris"));
		}

		public void selectAtLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.jobListings.uILocationComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Location"));
		}

		public void selectAtJobName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.jobListings.uIJobNameComboBox,
					BaseData.getEmploymentApplicantsModuleValue("JobName"));
		}

		public void enterAtJobEdit() {
			uIMapEmploymentApplicants.jobListings.uIJobEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("JobEdit"));
		}

		public void enterAtPostFromDate() {
			uIMapEmploymentApplicants.jobListings.uIPostFromDateEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PostFromDate"));
		}
			public void enterPostToDate() {
			uIMapEmploymentApplicants.jobListings.uIPostToDateEdit
			.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PosttoDate"));
			
		}
		public String readPostFromDate(){
		String FromDate = 	uIMapEmploymentApplicants.jobListings.uIPostFromDateEdit.getAttribute("value");
		System.out.println(FromDate);
		return FromDate;
		
		
			
		}
		public String readPostToDate() {
			 String ToDate = uIMapEmploymentApplicants.jobListings.uIPostToDateEdit.getAttribute("value");
			 System.out.println(ToDate);
			 return ToDate;
	
			
		}
	

		public void clickIncludeInactiveCheckBox() {
			uIMapEmploymentApplicants.jobListings.uIIncludeInactiveCheckBox.click();

		}

		public void clickSearchButton() {
			uIMapEmploymentApplicants.jobListings.uISearchButton.click();

		}

		public void clickAddNewButton() {
			uIMapEmploymentApplicants.jobListings.uIAddNewButton.click();

		}

		public void clickResetButton() {
			uIMapEmploymentApplicants.jobListings.uIResetButton.click();

		}

		public void clickBackButton() {
			uIMapEmploymentApplicants.jobListings.uIBackButton.click();

		}

		public void verifyAtJOBNoInGrid(int index) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, "Job#", index)
					.getText();
			verify.ExpectedPropertyValueIsEqual(text, BaseData.getEmploymentApplicantsModuleValue("JOBNo"));

		}
		public void verifyPostFromDate(String ReadFromDate) {
			String VerifyFromDate = objectIdentification.manualIdentify.getGridCell(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, "Posting Date", 0).getText();
			System.out.println(VerifyFromDate);
			verify.ExpectedValueIsTrue(VerifyFromDate.contains(ReadFromDate));
			
			
		}
		public void verifyPostToDate(String ReadToDate) {
			String VerifyToDate = objectIdentification.manualIdentify.getGridCell(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, "Posting Date", 0).getText();
			System.out.println(VerifyToDate);
			verify.ExpectedValueIsTrue(VerifyToDate.contains(ReadToDate));
			
			
		}
		
		
		
		public void verifyatLocation(int index) {
			String Location = objectIdentification.manualIdentify.getGridCell(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, "Location", index).getText();
			verify.ExpectedPropertyValueIsEqual(Location, BaseData.getEmploymentApplicantsModuleValue("Location"));
			
		}

		public void verifyAtJobNameInGrid(int index) {
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, "Job Name", index)
					.getText();
			verify.ExpectedPropertyValueIsEqual(text, BaseData.getEmploymentApplicantsModuleValue("JobName"));
		}

		public void clickAtJobNameInGrid() {
			objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable,
							BaseData.getEmploymentApplicantsModuleValue("JobName"))
					.click();
		}

		public void verifyNorecordsFoundAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void verifyJobNameGridCellAsGreyOut() {
			String color = "rgba(128, 128, 128, 1)";
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, 0,
					BaseData.getEmploymentApplicantsModuleValue("JobName"));
			String cssValue = gridCell.getCssValue("color");
			verify.ExpectedPropertyValueIsEqual(cssValue, color);
		}

		public void enterPostFromDateAsCurrentDate()
		{
		uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostFromDate.sendKeys(Randomized.getCurrentDate());
		uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostFromDate.sendKeys(Keys.TAB);
		}

		public void enterPostToDateAs7DaysFuture()
		{
		uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostToDate.sendKeys(Randomized.getFutureDate(7));
		uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostToDate.sendKeys(Keys.TAB);
		}

		public void verifyPostingDateColumnValueAsCurrentDate()
		{
		List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, "Posting Date");

		for(String Values : gridTableColumnValues)
		{
		verify.ExpectedValueIsTrue(Values.contains(Randomized.getCurrentDate()));
		}

		}

	}

	public class ApplicantEntry {
		public ApplicantEntryMainTab applicantEntryMainTab;
		public ApplicantEntryTasksNScheduleTab applicantEntryTasksNScheduleTab;
		public ApplicantEntryNotesTab applicantEntryNotesTab;
		public ApprovalNStatusTab approvalNStatusTab;

		public ApplicantEntry() {
			if (applicantEntryMainTab == null)
				applicantEntryMainTab = new ApplicantEntryMainTab();

			if (applicantEntryTasksNScheduleTab == null)
				applicantEntryTasksNScheduleTab = new ApplicantEntryTasksNScheduleTab();

			if (applicantEntryNotesTab == null)
				applicantEntryNotesTab = new ApplicantEntryNotesTab();

			if (approvalNStatusTab == null)
				approvalNStatusTab = new ApprovalNStatusTab();

		}

		public void selectAtJobID() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantEntry.uIJobIDDropdown,
					BaseData.getEmploymentApplicantsModuleValue("JobID"));

		}

		public void enterAtLastName() {
			uIMapEmploymentApplicants.applicantEntry.uILastNameEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("LastName"));
			uIMapEmploymentApplicants.applicantEntry.uILastNameEdit.sendKeys(Keys.TAB);

		}

		public void enterAtFirstName() {
			uIMapEmploymentApplicants.applicantEntry.uIFirstNameEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("FirstName"));
			uIMapEmploymentApplicants.applicantEntry.uIFirstNameEdit.sendKeys(Keys.TAB);

		}

		public void enterAtPhoneNo() {
			uIMapEmploymentApplicants.applicantEntry.uIPhoneNoEdit.click();
			uIMapEmploymentApplicants.applicantEntry.uIPhoneNoEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PhoneNo"));

		}

		public void enterAtEmail() {
			uIMapEmploymentApplicants.applicantEntry.uIEmailEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("Email"));

		}

		public void switchToMainTab() {
			uIMapEmploymentApplicants.applicantEntry.uIMainTab.click();
		}

		public void switchToTasksNScheduleTab() {
			uIMapEmploymentApplicants.applicantEntry.uITasksNScheduleTab.click();
		}

		public void switchToNotesTab() {
			uIMapEmploymentApplicants.applicantEntry.uINotesTab.click();
			objectIdentification.windowHandle.switchToFrame("frmViewNotes.aspx");

		}

		public void switchToApprovalNStatusTab() {
			uIMapEmploymentApplicants.applicantEntry.uIApprovalNStatusTab.click();

		}

		public void clickRequestToSubmitApplication() {
			uIMapEmploymentApplicants.applicantEntry.uIRequestToSubmitApplication.click();
			popup.confirm.yesWithExpectedMessage("(22) Please save and continue");
		}

		public void save() {
			uIMapEmploymentApplicants.applicantEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapEmploymentApplicants.applicantEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void clickSave() {
			uIMapEmploymentApplicants.applicantEntry.uISaveButton.click();
		}

		public class ApplicantEntryMainTab {

			public void enterAtYOSYear() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIYOSYearEdit
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("YOSYear"));

			}

			public void enterAtYOSMonth() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIYOSMonthEdit
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("YOSMonth"));

			}

			public void enterAtDurationMonth() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIDurationMonthEdit
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("DurationMonth"));

			}

			public void enterAtDurationYear() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIDurationYearEdit
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("DurationYear"));

			}

			public void selectAtForLocation() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIForLocationDropdown,
						BaseData.getEmploymentApplicantsModuleValue("ForLocation"));

			}

			public void enterApplicationReceivedOnAsCurrentDate() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIHROwnerPFEdit
						.sendKeys(Randomized.getCurrentDate());
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIHROwnerPFEdit.sendKeys(Keys.TAB);
			}

			public void enterAtHROwnerPF() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIHROwnerPFEdit
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PF"));
				uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uIHROwnerPFEdit.sendKeys(Keys.TAB);
			}

		}

		public class ApplicantEntryTasksNScheduleTab {

			public void clickAddTask() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryTasksNScheduleTab.uIAddTaskButton.click();

			}

			public void verifyAtTaskDescriptionInGrid() {
				WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapEmploymentApplicants.applicantEntry.applicantEntryTasksNScheduleTab.uITaskScheduleResultTable,
						BaseData.getEmploymentApplicantsModuleValue("TaskDescription"));
				verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText()
						.contains(BaseData.getEmploymentApplicantsModuleValue("TaskDescription")));
			}

		}

		public class ApplicantEntryNotesTab {

			public void clickAddNotes() {
				uIMapEmploymentApplicants.applicantEntry.applicantEntryNotesTab.uIAddNotesButton.click();
			}

		}

		public class ApprovalNStatusTab {

			public void enterReviewCompletedAsCurrentDate() {
				uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIReviewCompletedEdit
						.sendKeys(Randomized.getCurrentDate());

			}

			public void selectAtResult() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIResultDropdown,
						BaseData.getEmploymentApplicantsModuleValue("Result"));
			}

			public void clickOfferDetails() {
				uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIOfferDetailsButton.click();

			}

			public void clickOfferAcceptedRadioButton() {
				uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIOfferAcceptedRadioButton.click();

			}

			public void verifyLoginUserNameIsEnabled() {
				verify.ExpectedValueIsTrue(
						uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uILoginUserNameEdit.isEnabled());

			}

			public void verifyPhoneExtIsEnabled() {
				verify.ExpectedValueIsTrue(
						uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIPhoneExtEdit.isEnabled());

			}

			public void verifyIPAddressForPCIsEnabled() {
				verify.ExpectedValueIsTrue(
						uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIIPAddressForPCEdit.isEnabled());

			}

			public void verifyLoginUserNameIsDisabled() {
				verify.ExpectedValueIsTrue(
						!uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uILoginUserNameEdit.isEnabled());

			}

			public void verifyPhoneExtIsDisabled() {
				verify.ExpectedValueIsTrue(
						!uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIPhoneExtEdit.isEnabled());

			}

			public void verifyIPAddressForPCIsDisabled() {
				verify.ExpectedValueIsTrue(
						!uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIIPAddressForPCEdit.isEnabled());

			}

			public void clickDeclinedRadioButton() {
				uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIDeclinedRadioButton.click();

			}

			public void enterAtLoginUserName() {
				uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uILoginUserNameEdit
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("LoginUserName"));

			}

			public void enterAcceptanceStatusDateAsCurrentDate() {
				uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIAcceptanceStatusDateEdit.click();
				uIMapEmploymentApplicants.applicantEntry.approvalNStatusTab.uIAcceptanceStatusDateEdit
						.sendKeys(Randomized.getCurrentDate());
			}

		}

		public void verifyUpdateSuccessfulBottomMessage() {

			String text = uIMapEmploymentApplicants.applicantEntry.applicantEntryMainTab.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(text.contains("1003 - Update Successful"));
		}

	}

	public class ApplicantSearch {

		public void clickSearchButton() {
			uIMapEmploymentApplicants.applicantSearch.uISearchButton.click();

		}

		public void clickAddNewButton() {
			uIMapEmploymentApplicants.applicantSearch.uIAddNewButton.click();

		}

		public void clickResetButton() {
			uIMapEmploymentApplicants.applicantSearch.uIResetButton.click();

		}

		public void clickBackButton() {
			uIMapEmploymentApplicants.applicantSearch.uIBackButton.click();

		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIJurisComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Juris"));
		}

		public void selectAtLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uILocationComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Location"));
		}

		public void selectAtJobName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIJobNameComboBox,
					BaseData.getEmploymentApplicantsModuleValue("JobName"));
		}

		public void enterAtJobNumberEdit() {
			uIMapEmploymentApplicants.applicantSearch.uIJobNumberEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("JobEdit"));
		}

		public void selectAtApplicationStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIApplicationStatusComboBox,
					BaseData.getEmploymentApplicantsModuleValue("ApplicationStatus"));
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIDivisionComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Division"));
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uISectionComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Section"));
		}

		public void selectAtSquad() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uISquadComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Squad"));
		}

		public void enterAtAssignedToEdit() {
			uIMapEmploymentApplicants.applicantSearch.uIAssignedToLookUpEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("AssignedTo"));
		}

		public void selectAtHROwnerDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIHROwnerDivisionComboBox,
					BaseData.getEmploymentApplicantsModuleValue("HROwnerDivision"));
		}

		public void selectAtHROwnerSection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIHROwnerSectionComboBox,
					BaseData.getEmploymentApplicantsModuleValue("HROwnerSection"));
		}

		public void selectAtHROwnerSquad() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIHROwnerSquadComboBox,
					BaseData.getEmploymentApplicantsModuleValue("HROwnerSquad"));
		}

		public void enterAtApplicantNo() {
			uIMapEmploymentApplicants.applicantSearch.uIApplicationYearEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicationNo").substring(0, 2));
			uIMapEmploymentApplicants.applicantSearch.uIApplicationNoEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicationNo").substring(3));

		}

		public void enterAtLastName() {
			uIMapEmploymentApplicants.applicantSearch.uILastNameEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapEmploymentApplicants.applicantSearch.uIFirstNameEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("FirstName"));
		}

		public void enterAtApplicantID() {
			uIMapEmploymentApplicants.applicantSearch.uIApplicantIDEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicantID"));
		}

		public void enterAtPhoneNo() {
			uIMapEmploymentApplicants.applicantSearch.uIPhoneNoEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PhoneNo"));
		}

		public void enterAtEMail() {
			uIMapEmploymentApplicants.applicantSearch.uIEMailEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("Email"));
		}

		public void selectAtSexComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uISexComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Sex"));
		}

		public void selectAtRaceComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIRaceComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Race"));
		}

		public void selectAtEthnicityComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIEthnicityComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Ethnicity"));
		}

		public void enterAtDOB() {
			uIMapEmploymentApplicants.applicantSearch.uIDOBEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("DOB"));
		}

		public void enterAtApplicationFromDate() {
			uIMapEmploymentApplicants.applicantSearch.uIApplicationFromDate
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicationFromDate"));
		}

		public void enterAtApplicationToDate() {
			uIMapEmploymentApplicants.applicantSearch.uIApplicationToDate
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicationToDate"));
		}

		public void selectAtExperienceLevelComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIExperienceLevelComboBox,
					BaseData.getEmploymentApplicantsModuleValue("ExperienceLevel"));
		}

		public void selectAtEducationComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.applicantSearch.uIEducationComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Education"));
		}

		public void selectAtApplicantNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapEmploymentApplicants.applicantSearch.uIApplicantSearchResultTable,
					BaseData.getEmploymentApplicantsModuleValue("ApplicantNo"));

		}

		public void verifyAtNameInGrid() {
			String text = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapEmploymentApplicants.applicantSearch.uIApplicantSearchResultTable,
							BaseData.getEmploymentApplicantsModuleValue("Name"))
					.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getEmploymentApplicantsModuleValue("Name")));
		}

	}

	public class JobEntry {

		public JobEntryMainTab jobEntryMainTab;
		public JobEntryJobDescriptionTab jobEntryJobDescriptionTab;

		public JobEntry() {

			if ((this.jobEntryMainTab == null))
				this.jobEntryMainTab = new JobEntryMainTab();

			if ((this.jobEntryJobDescriptionTab == null)) {
				this.jobEntryJobDescriptionTab = new JobEntryJobDescriptionTab();
			}
		}

		public void selectAtJurisComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapEmploymentApplicants.jobEntry.uIJurisComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Juris"));
		}

		public void enterAtJobName() {
			uIMapEmploymentApplicants.jobEntry.uIJobNameEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("JobName"));
		}

		public void selectAtLocationComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.jobEntry.uILocationComboBox,
					BaseData.getEmploymentApplicantsModuleValue("Location"));
		}

		public void enterAtJOBNoEdit() {
			uIMapEmploymentApplicants.jobEntry.uIJobNoEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("JOBNo"));
		}

		public void saveScreen() {
			uIMapEmploymentApplicants.jobEntry.uISaveButton.click();
			objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
		}

		public void clickSave() {
			uIMapEmploymentApplicants.jobEntry.uISaveButton.click();

		}

		public void clickSaveHandleConfirmPopupIfExists() {
			uIMapEmploymentApplicants.jobEntry.uISaveButton.click();
			objectIdentification.windowHandle.focusOnActiveElementAndSwitch();

		}

		public void saveNCloseScreen() {
			uIMapEmploymentApplicants.jobEntry.uISaveNCloseButton.click();

			popup.confirm.yes();

		}

		public void closeScreen() {
			Playback.driver.close();

		}

		public void verifyRequiredEntriesAreMissingAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void clickMainTab() {
			uIMapEmploymentApplicants.jobEntry.uIMainTab.click();
		}

		public void switchToJobDescriptionTab() {
			uIMapEmploymentApplicants.jobEntry.uIJobDescriptionTab.click();
			objectIdentification.windowHandle.switchToFrame("frmManageNotes.aspx");
		}

		public void verifyJobDescriptionTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapEmploymentApplicants.jobEntry.uIJobDescriptionTab.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapEmploymentApplicants.jobEntry.uIJobDescriptionTab.isEnabled());
		}

		public void clickInactiveCheckBox() {
			uIMapEmploymentApplicants.jobEntry.uIInactiveCheckBox.click();
		}

		public class JobEntryMainTab {

			public void selectAtJobApplicationComboBox() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIJobApplicationComboBox,
						BaseData.getEmploymentApplicantsModuleValue("JobApplication"));
			}

			public void enterAtPostFromDate() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostFromDate
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PostFromDate"));
			}

			public void enterAtPostFromTime() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostFromTime
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PostFromTime"));
			}

			public void enterAtPostToDate() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostToDate
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PostToDate"));
			}

			public void enterAtPostToTime() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostToTime
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PostToTime"));
			}

			public void enterAtApplicantPoolExpiresDate() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIApplicantPoolExpiresDate
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicationPoolDate"));
			}

			public void enterAtApplicantPoolExpiresTime() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIApplicantPoolExpiresTime
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicationPoolTime"));
			}

			public void clickCopyNewJobButton() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uICopyCreateNewJobButton.click();
			}

			public void clickCopyButton() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uICopyButton.click();
			}

			public void clickPreviewButton() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPreviewButton.click();
			}

			public void clickAddTaskButton() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIAddTaskButton.click();
			}

			public void enterAtPFEdit() {
				uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPFLookupEdit
						.sendKeys(BaseData.getEmploymentApplicantsModuleValue("ApplicationPoolTime"));
			}

			public void selectAtCopyTasksFromJobComboBox() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uICopyTasksFromJobComboBox,
						BaseData.getEmploymentApplicantsModuleValue("CopyTasksFromJob"));
			}

			public void verifyAtTaskDescriptionInGrid(int index) {
				WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
						uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uITaskGridTable, "Task Description", index);
				verify.ExpectedPropertyValueIsEqual(gridCell.getText(),
						BaseData.getEmploymentApplicantsModuleValue("TaskDescription"));
			}

			public void clickAtTaskDescriptionInGrid(int index) {
				objectIdentification.manualIdentify
						.getGridCell(uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uITaskGridTable,
								"Task Description", index)
						.click();
			}

			public void enterPostFromDateAsCurrentDate()
			{
			uIMapEmploymentApplicants.jobListings.uIPostFromDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapEmploymentApplicants.jobListings.uIPostFromDateEdit.sendKeys(Keys.TAB);

			}

			public void verifyPostingDateColumnValueAsCurrentDate()
			{
			List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapEmploymentApplicants.jobListings.uIJobListingSearchTable, "Posting Date");

			for(String Values : gridTableColumnValues)
			{
			verify.ExpectedValueIsTrue(Values.contains(Randomized.getCurrentDate()));
			}



			}

			public void enterPostToDateAs7DaysFuture()
			{
			uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostToDate.sendKeys(Randomized.getFutureDate(7));
			uIMapEmploymentApplicants.jobEntry.jobEntryMainTab.uIPostToDate.sendKeys(Keys.TAB);
			}

		}

		public class JobEntryJobDescriptionTab {

			public void clickInternelSaveButton() {
				uIMapEmploymentApplicants.jobEntry.jobEntryJobDescriptionTab.uIInternalSave.click();

			}

			public void clickLoadButton() {
				uIMapEmploymentApplicants.jobEntry.jobEntryJobDescriptionTab.uILoadButton.click();
			}

			public void clickAddNewButton() {
				uIMapEmploymentApplicants.jobEntry.jobEntryJobDescriptionTab.uIAddNewButton.click();
			}

			public void enterRichText() {
				uIMapEmploymentApplicants.jobEntry.jobEntryJobDescriptionTab.uIRichTextEdit
						.sendKeys("Test Automation Test Data");
			}

			public void selectAtTemplateComboBox() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapEmploymentApplicants.jobEntry.jobEntryJobDescriptionTab.uITemplateNameComboBox,
						BaseData.getEmploymentApplicantsModuleValue("Template"));
			}

		}

	}

	public class HiringTask {

		public void clickInterviewRadioButton() {
			uIMapEmploymentApplicants.hiringTask.uIInterviewRadioButton.click();

		}

		public void clickBackgroundRadioButton() {
			uIMapEmploymentApplicants.hiringTask.uIBackgroundCheckRadioButton.click();

		}

		public void clickOtherRadioButton() {
			uIMapEmploymentApplicants.hiringTask.uIOthersRadioButton.click();

		}

		public void enterAtOrder() {
			uIMapEmploymentApplicants.hiringTask.uIOrderEdit
					.sendKeys(BaseData.getEmploymentApplicantsModuleValue("Order"));

		}

		public void enterAtPFEdit() {
			uIMapEmploymentApplicants.hiringTask.uIPFEdit.sendKeys(BaseData.getEmploymentApplicantsModuleValue("PFNo"));

		}

		public void clickPFAddButton() {
			uIMapEmploymentApplicants.hiringTask.uIPFAddButton.click();

		}

		public void verifyAtPFInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapEmploymentApplicants.hiringTask.uIPFGridTable, "PF#", 0);
			verify.ExpectedPropertyValueIsEqual(gridCell.getText(),
					BaseData.getEmploymentApplicantsModuleValue("PFNo"));

		}

		public void clickEmailTemplateViewButton() {
			uIMapEmploymentApplicants.hiringTask.uIEmailTemplateViewButton.click();

		}

		public void clickPDFViewButton() {
			uIMapEmploymentApplicants.hiringTask.uIPDFViewButton.click();

		}

		public void clickEmailTemplateAddNewButton() {
			uIMapEmploymentApplicants.hiringTask.uIEmailTempalteAddNewButton.click();

		}

		public void clickPDFAddNewButton() {
			uIMapEmploymentApplicants.hiringTask.uIPDFAddNewButton.click();

		}

		public void save() {
			uIMapEmploymentApplicants.hiringTask.uISaveButton.click();
			popup.confirm.yes();

		}

		public void clickSaveButton() {
			uIMapEmploymentApplicants.hiringTask.uISaveButton.click();

		}

		public void clickCancelButton() {
			uIMapEmploymentApplicants.hiringTask.uICancelButton.click();

		}

		public void selectAtTaskDescriptionComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.hiringTask.uICopyTaskDescriptionComboBox,
					BaseData.getEmploymentApplicantsModuleValue("TaskDescription"));
		}

		public void selectAtEmailTemplateComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapEmploymentApplicants.hiringTask.uIEmailTemplateComboBox,
					BaseData.getEmploymentApplicantsModuleValue("EmailTemplate"));
		}

		public void selectPDFComboBoxAsOfficeWorkerResume() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapEmploymentApplicants.hiringTask.uIPDFComboBox,
					"Office Worker Resume");
		}

		public void closeScreen() {
			Playback.driver.close();
		}

		public void verifyRequiredEntriesAreMissingAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyAtEmailTemplateComboBox() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapEmploymentApplicants.hiringTask.uIEmailTemplateComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem,
					BaseData.getEmploymentApplicantsModuleValue("EmailTemplate"));
		}

		public void verifyPDFComboBoxAsOfficeWorkerResume() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapEmploymentApplicants.hiringTask.uIPDFComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem, "Office Worker Resume");
		}

	}

}
