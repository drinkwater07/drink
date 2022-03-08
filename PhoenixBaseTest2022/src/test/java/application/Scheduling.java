package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import uIMaps.UIMapScheduling;
import application.Popup.Confirm;
import dataAccess.BaseData;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Scheduling {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapScheduling uIMapScheduling = new UIMapScheduling();
	public Popup popup = new Popup();
	public Confirm confirm = popup.new Confirm();
	public Popup.Acknowledge acknowledge = popup.new Acknowledge();
	public Randomized randomized = new Randomized();

	public TimeEntry timeEntry;
	public TimeSearch timeSearch;
	public Calendar calendar;
	public TradeSwapSearch tradeSwapSearch;
	public EventCode eventCode;
	public EventCodeEntry eventCodeEntry;
	public EventResources eventResources;
	public EventResourcesEntry eventResourcesEntry;
	public ScheduleSettings scheduleSettings;
	public TourEntry tourEntry;
	public RotationCodeEntry rotationCodeEntry;
	public GroupEntry groupEntry;
	public TimeCategory timeCategory;
	public TimeCategoryEntry timeCategoryEntry;
	public TimeTypeEntry timeTypeEntry;
	public WorkSheet workSheet;

	public RosterWindow rosterWindow;

	public JobGrade jobGrade;

	public JobGradeEntry jobGradeEntry;


	public Scheduling() {
		if (this.timeEntry == null)
			this.timeEntry = new TimeEntry();

		if (this.timeSearch == null)
			this.timeSearch = new TimeSearch();

		if (this.calendar == null)
			this.calendar = new Calendar();

		if (this.tradeSwapSearch == null)
			this.tradeSwapSearch = new TradeSwapSearch();

		if (this.eventCode == null)
			this.eventCode = new EventCode();

		if (this.eventCodeEntry == null)
			this.eventCodeEntry = new EventCodeEntry();

		if (this.eventResources == null)
			this.eventResources = new EventResources();

		if (this.eventResourcesEntry == null)
			this.eventResourcesEntry = new EventResourcesEntry();

		if (this.scheduleSettings == null)
			this.scheduleSettings = new ScheduleSettings();

		if (this.tourEntry == null)
			this.tourEntry = new TourEntry();

		if (this.rotationCodeEntry == null)
			this.rotationCodeEntry = new RotationCodeEntry();

		if (this.groupEntry == null)
			this.groupEntry = new GroupEntry();

		if (this.timeCategory == null)
			this.timeCategory = new TimeCategory();

		if (this.timeCategoryEntry == null)
			this.timeCategoryEntry = new TimeCategoryEntry();

		if (this.timeTypeEntry == null)
			this.timeTypeEntry = new TimeTypeEntry();

			if (this.workSheet == null)
			this.workSheet = new WorkSheet();

		if (this.rosterWindow == null)
			this.rosterWindow = new RosterWindow();

		if (this.jobGrade == null)
			this.jobGrade = new JobGrade();

		if (this.jobGradeEntry == null)
			this.jobGradeEntry = new JobGradeEntry();


	}

	public void switchToTimeEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Time Entry");
	}

	public void switchToTimeSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Scheduler/frmTimeSearch");
	}

	public void switchToCalenderScreen() {
		objectIdentification.windowHandle.switchToWindow("frmRADSchedulerKendo");
	}

	public void switchToTradeSwapSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Scheduler/frmTradeSwapSrch");
	}

	public void switchToEventCodeEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Event Code Entry");
	}

	public void switchToEventCode() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Scheduler/frmEventNameSrch");
	}

	public void switchToEventResourcesEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("EventResourcesEntry");
	}

	public void switchToEventResources() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Scheduler/frmResourceNameSrch");
	}

	public void switchToScheduleSettings() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Scheduler/frmScheduleSrch");
	}

	public void switchToTourEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Tour Entry");
	}

	public void switchToRotationCodeEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Rotation Code Entry");
	}

	public void switchToGroupEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Group Entry");
	}

	public void switchToCalendarScreen() {
		objectIdentification.windowHandle.switchToWindow("Calendar");

	}

	public void switchToTimeCategory() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Scheduler/frmAccumulatorSrch");
	}

	public void switchToTimeCategoryEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Time Category Entry");
	}

	public void switchToTimeTypeEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Time Type Entry");
	}

	public void switchToWorkSheetWindow() {
		objectIdentification.windowHandle.switchToWindow("Work Sheet");
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
	}

	public void switchToRosterWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmRosterFire.aspx");
	}

	public void switchToJobGradeScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmJobGradeSrch");
	}

	public void switchToJobGradeEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("JobGradeEntry.aspx");
	}

	public class TimeSearch {
		public void clickSearchButton() {
			uIMapScheduling.timeSearch.uISearchButton.click();
		}

		public void clickTimeSheetRadioButton() {
			uIMapScheduling.timeSearch.uITimeSheetRadioButton.click();
			Playback.waitForControlReady();
		}

		public void clickApprovedRadioButton() {
			uIMapScheduling.timeSearch.uIApprovedRadioButton.click();
		}

		public void enterAtPFCode() {
			uIMapScheduling.timeSearch.uIPFCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("PFCode"));
			uIMapScheduling.timeSearch.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickDateClearButton() {
			uIMapScheduling.timeSearch.uIDateClearButton.click();
		}

		public void clickDivisionText() {
			uIMapScheduling.timeSearch.uIDivisionTextView.click();
		}

		public void clickTeamText() {
			uIMapScheduling.timeSearch.uITeamTextView.click();
		}

		public void clickSectionText() {
			uIMapScheduling.timeSearch.uISectionTextView.click();
		}

		public void clickGroupText() {
			uIMapScheduling.timeSearch.uIGroupTextView.click();
		}

		public void verifyAtTimeCategory(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("TimeCategory"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapScheduling.timeSearch.uITimeSearchResultGrid, "Time Category", rowIndex));
		}

		public void verifyAtTimeType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("TimeType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapScheduling.timeSearch.uITimeSearchResultGrid, "Time Type", rowIndex));
		}

		public void selectAtPFCodeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.timeSearch.uITimeSearchResultGrid, BaseData.getSchedulingModuleValue("PFCode"));
		}

		public void verifyDivisionFieldHide() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapScheduling.timeSearch.uIDivisionComboBox.getAttribute("disabled")));
		}

		public void verifySectionFieldHide() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapScheduling.timeSearch.uISectionComboBox.getAttribute("disabled")));
		}

		public void verifyTeamFieldHide() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapScheduling.timeSearch.uITeamComboBox.getAttribute("disabled")));
		}

		public void verifyGroupFieldHide() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapScheduling.timeSearch.uIGroupComboBox.getAttribute("disabled")));
		}

	}

	public class TimeEntry {
		public CalenderTab calenderTab;

		public TimeEntry() {
			if (this.calenderTab == null)
				this.calenderTab = new CalenderTab();

		}

		public void enterAtPF() {
			uIMapScheduling.timeEntry.uIPFCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("PFCode"));
			uIMapScheduling.timeEntry.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void changeAtPF() {
			uIMapScheduling.timeEntry.uIPFCodeEdit.clear();
			uIMapScheduling.timeEntry.uIPFCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("PF1"));
			uIMapScheduling.timeEntry.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtTimeCategory() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.timeEntry.uITimeCategoryComboBox,
					3);
			uIMapScheduling.timeEntry.uITimeCategoryComboBox.sendKeys(Keys.TAB);

		}

		public void selectTimeCategoryAsVaccation() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.timeEntry.uITimeCategoryComboBox,
					2);
			uIMapScheduling.timeEntry.uITimeCategoryComboBox.sendKeys(Keys.TAB);

		}

		public void selectAtTimeType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.timeEntry.uITimeTypeComboBox,
					BaseData.getSchedulingModuleValue("TimeType"));
		}

		public void enterRequestedForDate() {
			uIMapScheduling.timeEntry.uIRequestedForDateEdit.sendKeys(Keys.TAB);
		}

		public void enterRequestedForTime() {
			uIMapScheduling.timeEntry.uIPeriodForTimeEdit.click();
			uIMapScheduling.timeEntry.uIPeriodForTimeEdit.sendKeys("0800");
		}

		public void enterRequestedToDate() {
			uIMapScheduling.timeEntry.uIRequestedToDateEdit.sendKeys(Randomized.getFutureDate(1));
			// uIMapScheduling.timeEntry.uIRequestedToDateEdit.sendKeys(Keys.TAB);
			// uIMapScheduling.timeEntry.uIPeriodToTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterHours() {
			uIMapScheduling.timeEntry.uIHoursEdit.click();
			uIMapScheduling.timeEntry.uIHoursEdit.sendKeys("8");
			uIMapScheduling.timeEntry.uIHoursEdit.sendKeys(Keys.TAB);
		}

		public void enterNotes() {
			uIMapScheduling.timeEntry.uINotesEdit.sendKeys(Randomized.randomString(50));
		}

		public void closeScreen() {
			uIMapScheduling.timeEntry.driver.close();
		}

		public void saveScreen() {
			uIMapScheduling.timeEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSave() {
			uIMapScheduling.timeEntry.uISaveButton.click();
		}

		public void veifyAtTimeCategory() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("TimeCategory"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapScheduling.timeEntry.uITimeCategoryComboBox));
		}

		public void veifyAtTimeType() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("TimeType"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapScheduling.timeEntry.uITimeTypeComboBox));
		}

		public void verifyAtPFCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("PFCode"),
					uIMapScheduling.timeEntry.uIPFCodeEdit.getAttribute("value"));
		}

		public void verifyTimeResonCodeShow() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getDropDownOptionsCount(uIMapScheduling.timeEntry.uITimeTypeComboBox) == 2);
		}

		public void switchToCalenderTab() {
			uIMapScheduling.timeEntry.uICalendarTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPnxScheduler");
		}

	}

	public class CalenderTab {
		public void clickShowFullCalenderButton() {
			uIMapScheduling.timeEntry.calenderTab.uIShowFullCalendarButton.click();
			Playback.waitForControlReady();
		}
	}

	public class Calendar {
		public AppointmentsPopup appointmentsPopup = null;

		public Calendar() {
			if ((this.appointmentsPopup == null)) {
				this.appointmentsPopup = new AppointmentsPopup();
			}
		}

		public void selectShowMyCalendarCheckbox() {
			uIMapScheduling.calendar.uIShowMyCalendarCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void selectActivityEntryFromCalendar() {
			uIMapScheduling.calendar.uISelectActivityrecordfromClander.click();
			uIMapScheduling.calendar.uISelectActivityrecordfromClander.click();
			uIMapScheduling.calendar.uISelectActivityrecordfromClander.click();
			Playback.pageLoadThreadWait();
		}

		public void clickSearchAppointments() {
			uIMapScheduling.calendar.uISearchAppointmentsButton.click();
			Playback.controlReadyThreadWait();
		}

		public void doubleClickInCalendarByCurrentDate() {
			Actions actions = new Actions(Playback.driver);
			WebElement elementLocator = uIMapScheduling.calendar.uIClickCurrentDate;
			actions.doubleClick(elementLocator).perform();

		}

		public void verifyAtAddressInAgendaView() {
			verify.ExpectedValueIsTrue(uIMapScheduling.calendar.uIAddressTextfromAgenda.getText()
					.contains(BaseData.getSchedulingModuleValue("Address")));
		}

		public void clickAgendaButton() {
			uIMapScheduling.calendar.uIAgendaButton.click();
		}

		public void verifyScheduleOnDateNotPresentInCalender() {
			WebElement element = Playback.driver.findElement(By.xpath("//div[@class='k-scheduler-content']//table"));

			try {
				element.findElement(By.tagName(".//tr"));
			} catch (Exception e) {
				Assert.assertFalse(element.isDisplayed());

			}

		}
	}

	public class AppointmentsPopup {

		public void enterAtSubject() {
			uIMapScheduling.calendar.appointmentsPopup.uISubjectCodeEdit
					.sendKeys(BaseData.getSchedulingModuleValue("Subject"));
			uIMapScheduling.calendar.appointmentsPopup.uISubjectCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterStartTime() {
			uIMapScheduling.calendar.appointmentsPopup.uIStartTime.sendKeys(Randomized.getCurrentDate());
			uIMapScheduling.calendar.appointmentsPopup.uIStartTime.sendKeys(Keys.TAB);
		}

		public void enterAtEndTime() {
			uIMapScheduling.calendar.appointmentsPopup.uIEndTime.sendKeys(BaseData.getSchedulingModuleValue("EndTime"));
			uIMapScheduling.calendar.appointmentsPopup.uIEndTime.sendKeys(Keys.TAB);
		}

		public void verifyStartTimeAsCurrentDate() {
			Playback.controlReadyThreadWait();
			String dd = uIMapScheduling.calendar.appointmentsPopup.uIStartTime.getAttribute("value");
			System.out.println(dd);
			verify.ExpectedValueIsTrue(uIMapScheduling.calendar.appointmentsPopup.uIStartTime.getAttribute("value")
					.contains(Randomized.getCurrentDate("MM/dd/yyyy")));

		}

		public void selectAtEventType() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			uIMapScheduling.calendar.appointmentsPopup.uIEventTypeComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelectCalender(
					uIMapScheduling.calendar.appointmentsPopup.uIEventTypeAndResourceComboBoxOptions,
					BaseData.getSchedulingModuleValue("EventType"));
//	    	uIMapScheduling.calendar.appointmentsPopup.uIEventTypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtResource() {
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
			uIMapScheduling.calendar.appointmentsPopup.uIResourceComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelectCalender(
					uIMapScheduling.calendar.appointmentsPopup.uIEventTypeAndResourceComboBoxOptions,
					BaseData.getSchedulingModuleValue("Resource"));
//	    	uIMapScheduling.calendar.appointmentsPopup.uIResourceComboBox.sendKeys(Keys.TAB);
		}

		public void save() {
			uIMapScheduling.calendar.appointmentsPopup.uISaveButton.click();

		}

		public void verifyAppointmentSavedSuccessfully() {
			Playback.controlReadyThreadWait();
			popup.confirm.yesWithExpectedMessage("Appointment saved successfully");
		}

		public void verifyAtInactivatedNameNotAvailableInResource()
    	{
    		Playback.pageLoadThreadWait();
    		Playback.controlReadyThreadWait();
    		uIMapScheduling.calendar.appointmentsPopup.uIResourceComboBox.click();
    	List<WebElement> options =objectIdentification.manualIdentify.getRadControlDropDownValuesCalender(uIMapScheduling.calendar.appointmentsPopup.uIEventTypeAndResourceComboBoxOptions);
    		for(WebElement resource : options)
    		{
    			if(resource.getText().contains(BaseData.getSchedulingModuleValue("InactivatedPF")))
    			{
    					verify.ExpectedValueIsTrue(false);
    			}
    			else
    			{
    				verify.ExpectedValueIsTrue(true);
    			}
    		}
    	
    	} 
	}

	public class TradeSwapSearch {
		public void clickDivisionText() {
			uIMapScheduling.tradeSwapSearch.uIDivisionTextView.click();
		}

		public void clickTeamText() {
			uIMapScheduling.tradeSwapSearch.uITeamTextView.click();
		}

		public void clickSectionText() {
			uIMapScheduling.tradeSwapSearch.uISectionTextView.click();
		}

		public void verifyDivisionFieldHide() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapScheduling.tradeSwapSearch.uIDivisionComboBox.getAttribute("disabled")));
		}

		public void verifySectionFieldHide() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapScheduling.tradeSwapSearch.uISectionComboBox.getAttribute("disabled")));
		}

		public void verifyTeamFieldHide() {
			verify.ExpectedValueIsFalse(
					Boolean.parseBoolean(uIMapScheduling.tradeSwapSearch.uITeamComboBox.getAttribute("disabled")));
		}

	}

	public class EventCode {
		public void enterAtCustomName() {
			uIMapScheduling.eventCode.uICustomNameEdit.sendKeys(BaseData.getSchedulingModuleValue("CustomName"));
		}

		public void clickSearchButton() {
			uIMapScheduling.eventCode.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAddNew() {
			uIMapScheduling.eventCode.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickCustomNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.eventCode.uIEventCodeResultGrid, BaseData.getSchedulingModuleValue("CustomName"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtEventCodeUsingCustomName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("EventCode"),
					objectIdentification.manualIdentify.getGridCell(uIMapScheduling.eventCode.uIEventCodeResultGrid,
							BaseData.getSchedulingModuleValue("CustomName"), "Event Code").getText());
		}

		public void verifyAtEventNameUsingCustomName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("EventName"),
					objectIdentification.manualIdentify.getGridCell(uIMapScheduling.eventCode.uIEventCodeResultGrid,
							BaseData.getSchedulingModuleValue("CustomName"), "Event Name").getText());
		}

		public void verifyAtEventColorUsingCustomName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("EventColor"),
					objectIdentification.manualIdentify.getGridCell(uIMapScheduling.eventCode.uIEventCodeResultGrid,
							BaseData.getSchedulingModuleValue("CustomName"), "EventColor").getText());
		}

		public void clickIncludeInactiveCheckbox() {
			uIMapScheduling.eventCode.uIIncludeInactiveBox.click();
		}

		public void verifyRowColorInActive(int rowIndex) {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridTableRow(uIMapScheduling.eventCode.uIEventCodeResultGrid, rowIndex).getAttribute("class")
					.contains("grdEvtSrch_row_Color"));
		}
	}

	public class EventCodeEntry {
		public void clickSave() {
			uIMapScheduling.eventCodeEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void save() {
			uIMapScheduling.eventCodeEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void verifyEventCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Event Code.");
		}

		public void enterAtEventCode() {
			uIMapScheduling.eventCodeEntry.uIEventCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("EventCode"));
		}

		public void enterAtEventName() {
			uIMapScheduling.eventCodeEntry.uIEventNameEdit.sendKeys(BaseData.getSchedulingModuleValue("EventName"));
		}

		public void enterAtCustomName() {
			uIMapScheduling.eventCodeEntry.uICustomNameEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapScheduling.eventCodeEntry.uICustomNameEdit.sendKeys(BaseData.getSchedulingModuleValue("CustomName"));
		}

		public void selectAtCustomColor() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapScheduling.eventCodeEntry.uICustomThemeComboBox,
					BaseData.getSchedulingModuleValue("Customcolor"));
			uIMapScheduling.eventCodeEntry.uICustomThemeComboBox.sendKeys(Keys.TAB);
		}

		public void enterDescription() {
			uIMapScheduling.eventCodeEntry.uIDescriptionEdit.sendKeys(Randomized.randomString(15));
		}

		public void clickInactiveCheckbox() {
			uIMapScheduling.eventCodeEntry.uIInactiveBox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyInactiveDateAsCurrentDate() {
			verify.ExpectedValueIsFalse(uIMapScheduling.eventCodeEntry.uIInactiveDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));
		}

		public void verifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapScheduling.eventCodeEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void close() {
			uIMapScheduling.eventCodeEntry.driver.close();
		}

	}

	public class EventResources {
		public void clickSearchButton() {
			uIMapScheduling.eventResources.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAddNew() {
			uIMapScheduling.eventResources.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickResourceNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.eventResources.uIEventResourcesResultGrid,
					BaseData.getSchedulingModuleValue("ResourceName"));
			Playback.controlReadyThreadWait();
		}

		public void clickIncludeInactiveCheckbox() {
			uIMapScheduling.eventResources.uIIncludeInactiveBox.click();
		}

		public void enterAtResourceName() {
			uIMapScheduling.eventResources.uIResourceNameEdit
					.sendKeys(BaseData.getSchedulingModuleValue("ResourceName"));
		}

		public void verifyAtPFCodeUsingResourceName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("PFCode"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.eventResources.uIEventResourcesResultGrid,
									BaseData.getSchedulingModuleValue("ResourceName"), "PF Code")
							.getText());
		}

		public void verifyAtDisplayNameUsingResourceName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("DisplayName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.eventResources.uIEventResourcesResultGrid,
									BaseData.getSchedulingModuleValue("ResourceName"), "Display Name")
							.getText());
		}

		public void verifyAtPFCodeInGrid(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("PFCode"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapScheduling.eventResources.uIEventResourcesResultGrid, "PF Code", rowCount));
		}

		public void clearResourceName() {
			uIMapScheduling.eventResources.uIResourceNameEdit.clear();
			Playback.controlReadyThreadWait();
		}

		public void verifyRowColorInActive(int rowIndex) {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridTableRow(uIMapScheduling.eventResources.uIEventResourcesResultGrid, rowIndex)
					.getAttribute("class").contains("InActive"));
		}

		public void enterAtPFCode() {
			uIMapScheduling.eventResources.uIPFCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("PFCode"));
			uIMapScheduling.eventResources.uIPFCodeEdit.sendKeys(Keys.TAB);
		}
	}

	public class EventResourcesEntry {
		public void enterAtPFCode() {
			uIMapScheduling.eventResourcesEntry.uIPFCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("PFCode"));
			uIMapScheduling.eventResourcesEntry.uIPFCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void verifyResourcesNameFieldDisabled() {
			verify.ExpectedValueIsFalse(uIMapScheduling.eventResourcesEntry.uIResourceNameEdit.getAttribute("class")
					.contains("textboxInactive"), "Verify Resource Name Field inactive");
		}

		public void enterAtResourcesName() {
			uIMapScheduling.eventResourcesEntry.uIResourceNameEdit
					.sendKeys(BaseData.getSchedulingModuleValue("ResourceName"));
			uIMapScheduling.eventResourcesEntry.uIResourceNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyPFCodeFieldDisabled() {
			verify.ExpectedValueIsFalse(
					uIMapScheduling.eventResourcesEntry.uIPFCodeEdit.getAttribute("class").contains("textboxInactive"),
					"Verify PF Code Field inactive");
		}

		public void enterAtDisplayName() {
			uIMapScheduling.eventResourcesEntry.uIDisplayNameEdit.clear();
			uIMapScheduling.eventResourcesEntry.uIDisplayNameEdit
					.sendKeys(BaseData.getSchedulingModuleValue("DisplayName"));
		}

		public void clickSave() {
			uIMapScheduling.eventResourcesEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void save() {
			uIMapScheduling.eventResourcesEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void verify8EnterMandatoryDataAckMsg() {
			Playback.pageLoadThreadWait();
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void clickInactiveCheckbox() {
			uIMapScheduling.eventResourcesEntry.uIInactiveBox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyInactiveDateAsCurrentDate() {
			verify.ExpectedValueIsFalse(uIMapScheduling.eventResourcesEntry.uIInactiveDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));
		}

		public void verifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapScheduling.eventResourcesEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void close() {
			uIMapScheduling.eventResourcesEntry.driver.close();
		}

		public void clearPFCode() {
			uIMapScheduling.eventResourcesEntry.uIPFCodeEdit.clear();
			uIMapScheduling.eventResourcesEntry.uIPFCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clearResourceName() {
			uIMapScheduling.eventResourcesEntry.uIResourceNameEdit.clear();
			uIMapScheduling.eventResourcesEntry.uIResourceNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}
	}

	public class ScheduleSettings {
		public WebDriver driver;
		public ScheduleSettingsTourTab scheduleSettingsTourTab;
		public ScheduleSettingsRotationTab scheduleSettingsRotationTab;
		public ScheduleSettingsGroupTab scheduleSettingsGroupTab;

		public ScheduleSettings() {
			if (this.scheduleSettingsTourTab == null)
				this.scheduleSettingsTourTab = new ScheduleSettingsTourTab();

			if ((this.scheduleSettingsRotationTab == null))
				this.scheduleSettingsRotationTab = new ScheduleSettingsRotationTab();

			if ((this.scheduleSettingsGroupTab == null))
				this.scheduleSettingsGroupTab = new ScheduleSettingsGroupTab();
		}

		public void clickTourShiftHoursTab() {
			uIMapScheduling.scheduleSettings.uITourTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickRotationTab() {
			uIMapScheduling.scheduleSettings.uIRotationTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickGroupTab() {
			uIMapScheduling.scheduleSettings.uIGroupTab.click();
			Playback.controlReadyThreadWait();
		}

	}

	public class ScheduleSettingsTourTab {
		public void clickRefresh() {
			uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAddTourCodeButton() {
			uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uIAddTourCodeButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickIncludeInactiveCheckbox() {
			uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uIIncludeInactiveBox.click();
		}

		public void verifyAtDescriptionUsingCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("Description"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uITourCodeResultGrid,
									BaseData.getSchedulingModuleValue("Code"), "Description")
							.getText());
		}

		public void verifyTimeFromCurrentDateUsingCode() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentTime("HH:mm"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uITourCodeResultGrid,
									BaseData.getSchedulingModuleValue("Code"), "Time From")
							.getText());
		}

		public void verifyTimeToFutureDateUsingCode() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureTimeByHours(4, "HH:mm"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uITourCodeResultGrid,
									BaseData.getSchedulingModuleValue("Code"), "Time To")
							.getText());
		}

		public void verifyInactiveRowColorUsingCode1() {
			verify.ExpectedValueIsFalse(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(
									uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uITourCodeResultGrid,
									BaseData.getSchedulingModuleValue("Code1"))
							.getAttribute("class").contains(" grdReadOnly"));
		}

		public void selectAtCode1InGridRow() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uITourCodeResultGrid,
					BaseData.getSchedulingModuleValue("Code1"));
			Playback.controlReadyThreadWait();
		}
		public void verifyTimeToFutureDateUsingCode(String futureTime) {
            verify.ExpectedPropertyValueIsEqual(futureTime,
                    objectIdentification.manualIdentify
                            .getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uITourCodeResultGrid,
                                    BaseData.getSchedulingModuleValue("Code"), "Time To")
                            .getText());
        }

		public void verifyTimeFromCurrentDateUsingCode(String FromTime) {
            verify.ExpectedPropertyValueIsEqual(FromTime,
                    objectIdentification.manualIdentify
                            .getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsTourTab.uITourCodeResultGrid,
                                    BaseData.getSchedulingModuleValue("Code"), "Time From")
                            .getText());
        }
	}

	public class ScheduleSettingsRotationTab {
		public void clickRefresh() {
			uIMapScheduling.scheduleSettings.scheduleSettingsRotationTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAddRotationCodeButton() {
			uIMapScheduling.scheduleSettings.scheduleSettingsRotationTab.uIAddRotationCodeButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickIncludeInactiveCheckbox() {
			uIMapScheduling.scheduleSettings.scheduleSettingsRotationTab.uIIncludeInactiveBox.click();
		}

		public void verifyAtDescriptionUsingCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("Description"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapScheduling.scheduleSettings.scheduleSettingsRotationTab.uIRotationResultGrid,
							BaseData.getSchedulingModuleValue("Code"), "Description").getText());
		}

		public void verifyInactiveRowColorUsingCode1() {
			verify.ExpectedValueIsFalse(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(
									uIMapScheduling.scheduleSettings.scheduleSettingsRotationTab.uIRotationResultGrid,
									BaseData.getSchedulingModuleValue("Code1"))
							.getAttribute("class").contains(" grdReadOnly"));
		}

		public void selectAtCode1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.scheduleSettings.scheduleSettingsRotationTab.uIRotationResultGrid,
					BaseData.getSchedulingModuleValue("Code1"));
			Playback.controlReadyThreadWait();
		}
	}

	public class ScheduleSettingsGroupTab {
		public void clickRefresh() {
			uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAddGroupCodeButton() {
			uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIAddGroupCodeButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickIncludeInactiveCheckbox() {
			uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIIncludeInactiveBox.click();
		}

		public void verifyAtDescriptionUsingGroup() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("Description"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIGroupResultGrid,
									BaseData.getSchedulingModuleValue("Group"), "Description")
							.getText());
		}

		public void verifyAtShiftUsingGroup() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("Shift"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIGroupResultGrid,
									BaseData.getSchedulingModuleValue("Group"), "Shift")
							.getText());
		}

		public void verifyAtRotationUsingGroup() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("Rotation"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIGroupResultGrid,
									BaseData.getSchedulingModuleValue("Group"), "Rotation")
							.getText());
		}

		public void verifyAtDisplayNameUsingGroup() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("DisplayName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIGroupResultGrid,
									BaseData.getSchedulingModuleValue("Group"), "Display Name")
							.getText());
		}

		public void verifyInactiveRowColorUsingGroup1() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(
							uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIGroupResultGrid,
							BaseData.getSchedulingModuleValue("Group1"))
					.getAttribute("class").contains(" grdReadOnly"));
		}

		public void selectAtGroup1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIGroupResultGrid,
					BaseData.getSchedulingModuleValue("Group1"));
			Playback.controlReadyThreadWait();
		}

		public void selectRowByAtGroup() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.scheduleSettings.scheduleSettingsGroupTab.uIGroupResultGrid,
					BaseData.getSchedulingModuleValue("Group"));
		}
	}

	public class TourEntry {
		public void verifyTourCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Tour Code.");
			Playback.controlReadyThreadWait();
		}

		public void enterAtTourCode() {
			Playback.controlReadyThreadWait();
			uIMapScheduling.tourEntry.uITourCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("TourCode"));
		}

		public void enterAtDescription() {
			uIMapScheduling.tourEntry.uIDescriptionEdit.sendKeys(BaseData.getSchedulingModuleValue("Description"));
		}

	
		public String tabTimeFromAndRead() {

            uIMapScheduling.tourEntry.uITimeFromEdit.sendKeys(Keys.TAB);
            String FromTime = uIMapScheduling.tourEntry.uITimeFromEdit.getAttribute("value");
            return FromTime;
        }
		public String enterTimeToAsFutureTimeandRead() {

            String futureTime = Randomized.getFutureTimeByHours(4, "HH:mm");
            uIMapScheduling.tourEntry.uITimeToEdit.sendKeys(futureTime);
            return futureTime;
        }

		public void enterNotes() {
			uIMapScheduling.tourEntry.uINotesEdit.sendKeys(Randomized.randomString(50));
		}

		public void verifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapScheduling.tourEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void clickInactiveCheckbox() {
			uIMapScheduling.tourEntry.uIInactiveCheckBox.click();
		}

		public void verifyInactiveDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"),
					uIMapScheduling.tourEntry.uIInactiveDateEdit.getAttribute("value"));
		}

		public void clickSave() {
			uIMapScheduling.tourEntry.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapScheduling.tourEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void closeSCreen() {
			uIMapScheduling.tourEntry.driver.close();
		}
	}

	public class RotationCodeEntry {
		public void verifyRotationCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Rotation Code.");
			Playback.controlReadyThreadWait();
		}

		public void enterAtRotationCode() {
			uIMapScheduling.rotationCodeEntry.uIRotationCodeEdit
					.sendKeys(BaseData.getSchedulingModuleValue("RotationCode"));
		}

		public void enterAtDescription() {
			uIMapScheduling.rotationCodeEntry.uIDescriptionEdit
					.sendKeys(BaseData.getSchedulingModuleValue("Description"));
		}

		public void clickInactiveCheckbox() {
			uIMapScheduling.rotationCodeEntry.uIInactiveCheckBox.click();
		}

		public void verifyInactiveDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"),
					uIMapScheduling.rotationCodeEntry.uIInactiveDateEdit.getAttribute("value"));
		}

		public void clickOnDutyRadioCheckbox() {
			uIMapScheduling.rotationCodeEntry.uIOnDutyRadioCheckBox.click();
		}

		public void clickOffDutyRadioCheckbox() {
			uIMapScheduling.rotationCodeEntry.uIOffDutyRadioCheckBox.click();
		}

		public void selectAtTour() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.rotationCodeEntry.uITourComboBox,
					BaseData.getSchedulingModuleValue("Tour"));
		}

		public void enterAtDayNo() {
			uIMapScheduling.rotationCodeEntry.uIDaysNoEdit.sendKeys(BaseData.getSchedulingModuleValue("DayNo"));
		}

		public void clickAddButton() {
			uIMapScheduling.rotationCodeEntry.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapScheduling.rotationCodeEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void clickSave() {
			uIMapScheduling.rotationCodeEntry.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapScheduling.rotationCodeEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void closeSCreen() {
			uIMapScheduling.rotationCodeEntry.driver.close();
		}

		public void enterNotes() {
			uIMapScheduling.rotationCodeEntry.uINotesEdit.sendKeys(Randomized.randomString(60));
		}

		public void selectAtTour1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.rotationCodeEntry.uITourComboBox,
					BaseData.getSchedulingModuleValue("Tour1"));
		}

		public void verifyAtTour1AddedToGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(BaseData.getSchedulingModuleValue("Tour1")
					.contains(objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapScheduling.rotationCodeEntry.uIRotationCodeResultGrid, "Tour", rowIndex)));
		}
	}

	public class GroupEntry {
		public void verifyGroupCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Group Code.");
			Playback.controlReadyThreadWait();
		}

		public void enterAtGroupCode() {
			uIMapScheduling.groupEntry.uIGroupCodeEdit.sendKeys(BaseData.getSchedulingModuleValue("GroupCode"));
		}

		public void enterAtDescription() {
			uIMapScheduling.groupEntry.uIDescriptionEdit.sendKeys(BaseData.getSchedulingModuleValue("Description"));
		}

		public void clickInactiveCheckbox() {
			uIMapScheduling.groupEntry.uIInactiveCheckBox.click();
		}

		public void verifyInactiveDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"),
					uIMapScheduling.groupEntry.uIInactiveDateEdit.getAttribute("value"));
		}

		public void selectAtShift() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.groupEntry.uIShiftComboBox,
					BaseData.getSchedulingModuleValue("Shift"));
		}

		public void selectAtRotationCode() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.groupEntry.uIRotationComboBox,
					BaseData.getSchedulingModuleValue("RotationCode"));
		}

		public void tabStartDate() {
			uIMapScheduling.groupEntry.uIStartDateEdit.sendKeys(Keys.TAB);
		}

		public void selectScheduleColor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapScheduling.groupEntry.uIScheduleColorComboBox);
		}

		public void enterNotes() {
			uIMapScheduling.groupEntry.uINotesEdit.sendKeys(Randomized.randomString(50));
		}

		public void verifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapScheduling.groupEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void enterAtCalenderDisplayLabel() {
			uIMapScheduling.groupEntry.uICalenderDisplayLabelEdit
					.sendKeys(BaseData.getSchedulingModuleValue("CalenderDisplayLabel"));
		}

		public void clickSave() {
			uIMapScheduling.groupEntry.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapScheduling.groupEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void closeScreen() {
			uIMapScheduling.groupEntry.driver.close();
		}

		public void verifyAtShift() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("Shift"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapScheduling.groupEntry.uIShiftComboBox));
		}

		public void verifyAtShiftType() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("ShiftType"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapScheduling.groupEntry.uIShiftTypeComboBox));
		}
	}

	public class TimeCategory {
		public void clickAddTimeCategoryButton() {
			uIMapScheduling.timeCategory.uIAddTimeCategoryButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAddTimeTypeButton() {
			uIMapScheduling.timeCategory.uIAddTimeTypeButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickExpandAllCheckBox() {
			uIMapScheduling.timeCategory.uIExpandAllCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void clickIncludeInactiveCheckBox() {
			uIMapScheduling.timeCategory.uIIncludeInactiveCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAtTimeCategoryInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
					BaseData.getSchedulingModuleValue("TimeCategory"));
			Playback.controlReadyThreadWait();
		}

		public void clickAtTimeTypeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
					BaseData.getSchedulingModuleValue("TimeType"));
			Playback.controlReadyThreadWait();
		}

		public void clickRefresh() {
			uIMapScheduling.timeCategory.uIRefreshIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtTimeCategoryInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSchedulingModuleValue("TimeCategory"),
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
									BaseData.getSchedulingModuleValue("TimeCategory"))
							.getText());
		}

		public void clickAtTimeCategory1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
					BaseData.getSchedulingModuleValue("TimeCategory1"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtTimeCategory1InactiveRowColor() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
							BaseData.getSchedulingModuleValue("TimeCategory1"))
					.getAttribute("class").contains("grdrowclrgray"));
		}

		public void verifyAtTimeTypeInGrid() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
							BaseData.getSchedulingModuleValue("TimeType"))
					.getText().contains(BaseData.getSchedulingModuleValue("TimeType")));
		}

		public void clickAtTimeType1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
					BaseData.getSchedulingModuleValue("TimeType1"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtTimeType1InactiveRowColor() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapScheduling.timeCategory.uITimeCategoryResultGrid,
							BaseData.getSchedulingModuleValue("TimeType1"))
					.getAttribute("class").contains("grdrowclrgray"));
		}
	}

	public class TimeCategoryEntry {
		public void clickSave() {
			uIMapScheduling.timeCategoryEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void save() {
			uIMapScheduling.timeCategoryEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyTimeCategoryCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Accumulator Code");
		}

		public void enterAtTimeCategoryCode() {
			uIMapScheduling.timeCategoryEntry.uITimeCategoryCodeEdit
					.sendKeys(BaseData.getSchedulingModuleValue("TimeCategoryCode"));
		}

		public void enterAtDescription() {
			uIMapScheduling.timeCategoryEntry.uIDescriptionEdit
					.sendKeys(BaseData.getSchedulingModuleValue("Description"));
		}

		public void enterNotes() {
			uIMapScheduling.timeCategoryEntry.uINotesEdit.sendKeys(Randomized.randomString(25));
		}

		public void selectAtScheduleColor() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapScheduling.timeCategoryEntry.uIScheduleColorComboBox,
					BaseData.getSchedulingModuleValue("ScheduleColor"));
			uIMapScheduling.timeCategoryEntry.uIScheduleColorComboBox.sendKeys(Keys.TAB);
		}

		public void verifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapScheduling.timeCategoryEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void clickInactiveCheckbox() {
			uIMapScheduling.timeCategoryEntry.uIInactiveCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyWarningConfirmMessage() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(
					uIMapScheduling.timeCategoryEntry.uIWarningMessageTextView.getText().contains("WARNING"));
			verify.ExpectedValueIsFalse(uIMapScheduling.timeCategoryEntry.uIWarningMessageTextView.getText().contains(
					"If you Inactivate this Accumulator, the automatic accrual configuration for this Accumulator will be lost"));
			verify.ExpectedValueIsFalse(uIMapScheduling.timeCategoryEntry.uIWarningMessageTextView.getText()
					.contains("Do You Want To Proceed ?"));
		}

		public void clickYes() {
			uIMapScheduling.timeCategoryEntry.uIYesButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyInactiveDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"),
					uIMapScheduling.timeCategoryEntry.uIInactiveDateEdit.getAttribute("value"));
		}

		public void closeScreen() {
			uIMapScheduling.timeCategoryEntry.driver.close();
		}
	}

	public class TimeTypeEntry {
		public void clickSave() {
			uIMapScheduling.timeTypeEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void save() {
			uIMapScheduling.timeTypeEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void close() {
			uIMapScheduling.timeTypeEntry.driver.close();
		}

		public void verifyTimeTypeCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Time Reason Code");
		}

		public void enterAtTimeTypeCode() {
			uIMapScheduling.timeTypeEntry.uITimeTypeCodeEdit
					.sendKeys(BaseData.getSchedulingModuleValue("TimeTypeCode"));
		}

		public void enterAtDescription() {
			uIMapScheduling.timeTypeEntry.uIDescriptionEdit.sendKeys(BaseData.getSchedulingModuleValue("Description"));
		}

		public void enterNotes() {
			uIMapScheduling.timeCategoryEntry.uINotesEdit.sendKeys(Randomized.randomString(25));
		}

		public void selectAtTimeCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapScheduling.timeTypeEntry.uITimeCategoryComboBox,
					BaseData.getSchedulingModuleValue("TimeCategory"));
			uIMapScheduling.timeTypeEntry.uITimeCategoryComboBox.sendKeys(Keys.TAB);
		}

		public void verifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapScheduling.timeTypeEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void enterAtMultiplicationFactor() {
			uIMapScheduling.timeTypeEntry.uIMultiplicationEdit
					.sendKeys(BaseData.getSchedulingModuleValue("MultiplicationFactor"));
		}

		public void selectReportable() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapScheduling.timeTypeEntry.uIReportableComboBox);
		}

		public void selectCodePermission() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapScheduling.timeTypeEntry.uICodePermissionComboBox);
		}

		public void verifyInactiveDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"),
					uIMapScheduling.timeTypeEntry.uIInactiveDateEdit.getAttribute("value"));
		}

		public void clickInactiveCheckbox() {
			uIMapScheduling.timeTypeEntry.uIInactiveCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyTimeCategoryAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Time Accumulator");
		}
	}

public class WorkSheet {

		public void clickRosterButton() {
			uIMapScheduling.workSheet.uIRosterButton.click();
		}

		public void selectAtJurisDropdown() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.workSheet.uIJurisComboBox,
					BaseData.getSchedulingModuleValue("Juris"));
		}

		public void selectAtDivisionDropdown() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.workSheet.uIDivisionComboBox,
					BaseData.getSchedulingModuleValue("Division"));
		}

		public void clickRefreshButton() {
			uIMapScheduling.workSheet.uIRefreshButton.click();
		}

		public void clickShowCertificationsCheckBox() {
			uIMapScheduling.workSheet.uIShowCertificationsCheckBox.click();
		}

		public void clickSearchButton() {
			uIMapScheduling.workSheet.uISearchButton.click();
		}

		public void verifyAtJurisDropdown() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapScheduling.workSheet.uIJurisComboBox);

			verify.ExpectedPropertyValueIsEqual(selectedItem, BaseData.getSchedulingModuleValue("Juris"));
		}

	}

	public class RosterWindow {
		public void selectAtJurisDropdown() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapScheduling.rosterWindow.uIJurisComboBox,
					BaseData.getSchedulingModuleValue("Juris"));
		}

		public void verifyAtJurisDropdown() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapScheduling.rosterWindow.uIJurisComboBox);

			verify.ExpectedPropertyValueIsEqual(selectedItem, BaseData.getSchedulingModuleValue("Juris"));
		}

		public void clickWorkSheetButton() {
			uIMapScheduling.rosterWindow.uIWorkSheetButton.click();
		}
	}

	public class JobGrade {
		public void clickAddJobGradeButton() {
			uIMapScheduling.jobGrade.uIAddJobGradeButton.click();
		}

		public void selectRowByAtJobGrade() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapScheduling.jobGrade.uIJobGradeTable,
					BaseData.getSchedulingModuleValue("JobGrade"));

		}

		public void verifyJobGradeIsNotDisplayed() {
			try {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapScheduling.jobGrade.uIJobGradeTable, BaseData.getSchedulingModuleValue("JobGrade"));
				System.out.println("Element Displayed");
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.out.println("Element Not Displayed");
			}

		}

	}

	public class JobGradeEntry {
		public void enterAtJobGradeCode() {
			uIMapScheduling.jobGradeEntry.uIJobGradeCodeEdit
					.sendKeys(BaseData.getSchedulingModuleValue("JobGradeCode"));
		}

		public void enterAtDescription() {
			uIMapScheduling.jobGradeEntry.uIDescriptionEdit.sendKeys(BaseData.getSchedulingModuleValue("Description"));
		}

		public void enterEffectiveFromDateAs1MonthBeforeCurrentDate() {
			uIMapScheduling.jobGradeEntry.uIEffectiveFromDate.sendKeys(Randomized.getPreviousDateByMonth(1));
		}

		public void enterAtEffectiveToDateAsCurrentDate() {
			uIMapScheduling.jobGradeEntry.uIEffectiveToDate.sendKeys(Randomized.getCurrentDate());
		}

		public void enterAtEffectiveToDateAs10DaysBeforeCurrentDate() {
			while (!uIMapScheduling.jobGradeEntry.uIEffectiveToDate.getAttribute("value").isEmpty()) {
				uIMapScheduling.jobGradeEntry.uIEffectiveToDate.click();
				uIMapScheduling.jobGradeEntry.uIEffectiveToDate.sendKeys(Keys.BACK_SPACE);
			}
			uIMapScheduling.jobGradeEntry.uIEffectiveToDate.sendKeys(Randomized.getPreviousDate(10, "MM/dd/yyyy"));
			uIMapScheduling.jobGradeEntry.uIEffectiveToDate.sendKeys(Keys.TAB);
			System.out.println(Randomized.getPreviousDate(10, "MM/dd/yyyy"));
		}

		public void saveNClose() {
			uIMapScheduling.jobGradeEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}
	}
}