package application;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataAccess.BaseData;
import dataAccess.PoliceData;
import uIMaps.UIMapK9;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class K9 {
	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapK9 uIMapK9 = new UIMapK9();
	public Popup popup = new Popup();
	public K9Search k9Search;
	public CPAEntry cpaEntry;
	public CPA cPA;
	public k9ReportsSearch k9ReportsSearch;
	public ReportEntry reportEntry;
	public K9Personnel k9Personnel;
	public K9PersonnelEntry k9PersonnelEntry;
	public K9TrainingEntry k9TrainingEntry;
	public K9Training k9Training;
	public K9ActivityEntry k9ActivityEntry;
	public K9Team k9Team;
	public K9TeamEntry k9TeamEntry;
	public K9Medical k9Medical;
	public MedicalVisitEntry medicalVisitEntry;
	public K9TrainingAid k9TrainingAid;
	public K9Reports k9Reports;

	public K9() {

		if (this.k9Search == null)
			this.k9Search = new K9Search();

		if (this.cpaEntry == null)
			this.cpaEntry = new CPAEntry();

		if (this.cPA == null)
			this.cPA = new CPA();

		if (this.k9Medical == null)
			this.k9Medical = new K9Medical();

		if (this.k9Medical == null)
			this.k9Medical = new K9Medical();

		if (this.medicalVisitEntry == null)
			this.medicalVisitEntry = new MedicalVisitEntry();

		if (this.k9ReportsSearch == null)
			this.k9ReportsSearch = new k9ReportsSearch();

		if (this.reportEntry == null)
			this.reportEntry = new ReportEntry();

		if (this.k9Personnel == null)
			this.k9Personnel = new K9Personnel();

		if (this.k9PersonnelEntry == null)
			this.k9PersonnelEntry = new K9PersonnelEntry();

		if (this.k9Training == null)
			this.k9Training = new K9Training();

		if (this.k9TrainingAid == null)
			this.k9TrainingAid = new K9TrainingAid();

		if (this.k9TrainingEntry == null)
			this.k9TrainingEntry = new K9TrainingEntry();

		if (this.k9Team == null)
			this.k9Team = new K9Team();

		if (this.k9TeamEntry == null)
			this.k9TeamEntry = new K9TeamEntry();

		if (this.k9ActivityEntry == null)
			this.k9ActivityEntry = new K9ActivityEntry();

		if (this.k9Reports == null)
			this.k9Reports = new K9Reports();
	}

	public void switchToK9Search() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("K9/frmRptMasterSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToCPAEntry() {
		objectIdentification.windowHandle.switchToWindow("CPA Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToK9ReportsSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmK9ReportsInquiry");
		Playback.controlReadyThreadWait();
	}

	public void switchToK9Reports() {
		objectIdentification.windowHandle.switchToWindow("K9 Reports");
	}

	public void switchToK9TrainingAid() {
		objectIdentification.windowHandle.switchToWindow("K9 Training Aid");
		Playback.controlReadyThreadWait();
	}

	public void switchToReportEntry() {
		objectIdentification.windowHandle.switchToWindow("Report Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToK9ActivityEntry() {
		objectIdentification.windowHandle.switchToWindow("K9 Activity Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToK9Personnel() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("K9/frmPersonnelSrch.aspx?");
		Playback.controlReadyThreadWait();
	}

	public void switchToK9PersonnelEntry() {
		objectIdentification.windowHandle.switchToWindow("K9 Personnel Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToK9TrainingScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmK9TrainingSrch.aspx");
	}

	public void switchToK9TrainingEntry() {
		objectIdentification.windowHandle.switchToWindow("K9 Training Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchTok9ActivityEntry() {
		objectIdentification.windowHandle.switchToWindow("K9 Activity Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToCPAScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmCPASrch.aspx");
	}

	public void switchToK9Medical() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmMedicalSrch.aspx");
	}

	public void switchToMedicalVisitEntry() {
		objectIdentification.windowHandle.switchToWindow("Medical Visit Entry");
	}

	public void switchToK9TeamScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmK9Team.aspx");
	}

	public void switchToK9TeamEntry() {
		objectIdentification.windowHandle.switchToWindow("K9 Team Entry");
	}

	public class K9Search {

		public void enterAtCallNo() {
			uIMapK9.k9Search.uICallNoYearEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(0, 2));
			uIMapK9.k9Search.uICallNoEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(3));
			uIMapK9.k9Search.uICallNoEdit.sendKeys(Keys.TAB);

		}

		public void clickSearch() {
			uIMapK9.k9Search.uISearchButton.click();
			Playback.pageLoadThreadWait();
		}

		public void verifyAddressContainsJurisAndCSZInTheAddressColumnByAtCallNo() {
			String address = objectIdentification.manualIdentify.getGridCell(uIMapK9.k9Search.uISearchResultTable,
					PoliceData.getK9ModuleValue("CallNo"), "Location").getText();
			String[] addressDetails = address.split(";");
			String regExp = "^[A-Z]{2},\\s[\\w\\s]+,\\s[A-Z]{2},\\s[0-9]{5}$";
			verify.ExpectedValueIsFalse(Pattern.matches(regExp, addressDetails[1]), "Address Fromat Wrong");

		}

	}

	public class CPAEntry {
		public void tabFromDateTime() {
			uIMapK9.cpaEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapK9.cpaEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void selectProofing() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapK9.cpaEntry.uIProofingComboBox);
			uIMapK9.cpaEntry.uIProofingComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtHandler() {
			uIMapK9.cpaEntry.uIHandlerK9CodeEdit.sendKeys(PoliceData.getK9ModuleValue("Handler"));
			uIMapK9.cpaEntry.uIHandlerK9CodeEdit.sendKeys(Keys.TAB);
		}

		public void clickPublicDemonstrationCheck() {
			uIMapK9.cpaEntry.uIPublicDemonstrationCheckBox.click();
		}

		public void enterAtLocationOfActivity() {
			uIMapK9.cpaEntry.uILocationActivityEdit.sendKeys(PoliceData.getK9ModuleValue("LocationOfActivity"));
			uIMapK9.cpaEntry.uILocationActivityEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickLocationVerifyCheckbox() {
			uIMapK9.cpaEntry.uILocationVerifyCheckBox.click();
			uIMapK9.cpaEntry.uILocationVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void enterAtReportingHandler() {
			uIMapK9.cpaEntry.uIReportHandlerCodeEdit.sendKeys(PoliceData.getK9ModuleValue("ReportingHandler"));
			uIMapK9.cpaEntry.uIReportHandlerCodeEdit.sendKeys(Keys.TAB);
		}

		public void saveScreen() {
			uIMapK9.cpaEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void close() {
			uIMapK9.cpaEntry.driver.close();
		}

		public void verifyLocationActivityFontColorAsRed() {
			verify.ExpectedValueIsTrue(
					uIMapK9.cpaEntry.uILocationActivityEdit.getAttribute("style").contains("color: red"));
		}

		public void enterToDateTimeAsFutureDate() {
			uIMapK9.cpaEntry.uIToDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapK9.cpaEntry.uIToTimeEdit.sendKeys(Keys.TAB);
		}

		public void clickTrainingCheckBox() {
			uIMapK9.cpaEntry.uITrainingCheckBox.click();
		}

		public void verifyLocationActivityFontColorAsBlack() {
			verify.ExpectedValueIsTrue(
					uIMapK9.cpaEntry.uILocationActivityEdit.getAttribute("style").contains("color: black"));
		}

		public void selectAtHandlerOrK9() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.cpaEntry.uIK9OrHandlerDropDown,
					PoliceData.getK9ModuleValue("Handler"));
		}

		public void enterToDateAsFutureDateAndClickTimeArrowButton() {
			uIMapK9.cpaEntry.uIToDateEdit.sendKeys(Randomized.getFutureDate(2));
			uIMapK9.cpaEntry.uIToTimeArrow.click();
		}

		public void selectAtTypeActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.cpaEntry.uITypeActivityDropDown,
					PoliceData.getK9ModuleValue("TypeActivity"));
		}

		public void selectAtProofing() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.cpaEntry.uIProofingComboBox,
					PoliceData.getK9ModuleValue("Proofing"));
		}

		public void enterAtCallNo() {
			uIMapK9.cpaEntry.uICallNoYearEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(0, 2));
			uIMapK9.cpaEntry.uICallNoEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(3));
			uIMapK9.cpaEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtLocationOfActivity() {
			String text = uIMapK9.cpaEntry.uILocationActivityEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getK9ModuleValue("LocationOfActivity")));
		}

		public void enterAtReportingPFNo() {
			uIMapK9.cpaEntry.uIReportingPFNoEdit.sendKeys(PoliceData.getK9ModuleValue("ReportingPFNo"));
			uIMapK9.cpaEntry.uIReportingPFNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtProofing() {
			String text = uIMapK9.cpaEntry.uIProofingComboBox.getText();
			verify.ExpectedValueIsTrue(text.contains(PoliceData.getK9ModuleValue("Proofing")));

		}

		public void verifyLocationOfActivityFontAsRedColor() {
			String attribute = uIMapK9.cpaEntry.uILocationActivityEdit.getAttribute("style");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("red"));
		}

		public void verifyLocationOfActivityFontAsBlackColor() {
			String attribute = uIMapK9.cpaEntry.uILocationActivityEdit.getAttribute("style");
			verify.ExpectedValueIsTrue(attribute.contains("black"));
		}

		public void clearLocationOfActivity() {
			uIMapK9.cpaEntry.uILocationActivityEdit.clear();
		}

		public void enterAtLocationOfActivity1() {
			uIMapK9.cpaEntry.uILocationActivityEdit.sendKeys(PoliceData.getK9ModuleValue("LocationOfActivity1"));
			uIMapK9.cpaEntry.uILocationActivityEdit.sendKeys(Keys.TAB);
		}

		public void verifyLocationOfActivityInfoIconIsDisplayed() {
			uIMapK9.cpaEntry.uILocationOfActivityInfoButton.isDisplayed();
		}

	}

	public class k9ReportsSearch {
		public void clickAddReport() {
			uIMapK9.k9ReportsSearch.uIAddReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtCaseNo() {
			uIMapK9.k9ReportsSearch.uICaseNoYearEdit.sendKeys(PoliceData.getK9ModuleValue("CaseNo").substring(0, 2));
			uIMapK9.k9ReportsSearch.uICaseNoEdit.sendKeys(PoliceData.getK9ModuleValue("CaseNo").substring(3));
			uIMapK9.k9ReportsSearch.uICaseNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtCallNo() {
			uIMapK9.k9ReportsSearch.uICallNoYearEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(0, 2));
			uIMapK9.k9ReportsSearch.uICallNoEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(3));
			uIMapK9.k9ReportsSearch.uICallNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtHandler() {
			uIMapK9.k9ReportsSearch.uIHandlerCodeEdit.sendKeys(PoliceData.getK9ModuleValue("Handler"));
			uIMapK9.k9ReportsSearch.uIHandlerCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickSearch() {
			uIMapK9.k9ReportsSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtCaseNoUsingHandlerK9() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapK9.k9ReportsSearch.uISearchResultTable,
							PoliceData.getK9ModuleValue("HandlerK9"), "Case#").getText());
		}

		public void verifyAtCallNoUsingHandlerK9() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("CallNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapK9.k9ReportsSearch.uISearchResultTable,
							PoliceData.getK9ModuleValue("HandlerK9"), "Call#").getText());
		}

		public void selectAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapK9.k9ReportsSearch.uISearchResultTable, PoliceData.getK9ModuleValue("CaseNo"));
			Playback.controlReadyThreadWait();
		}

		public void clickBack() {
			uIMapK9.k9ReportsSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtK9HandlerInGrid(int rowIndex) {
			String handler = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapK9.k9ReportsSearch.uISearchResultTable, "K9/Handler", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("K9Handler"), handler);
		}

		public void verifyAtActivityTypeInGrid(int rowIndex) {
			String ActvityType = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapK9.k9ReportsSearch.uISearchResultTable, "Activity Type", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("TypeOfIncident"), ActvityType);
		}

		public void verifyAtCallNoInGrid(int rowIndex) {
			String callNo = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapK9.k9ReportsSearch.uISearchResultTable, "Call#", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("CallNo"), callNo);
		}

		public void verifyApprovalStatusAsOnHold(int rowIndex) {
			String callNo = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapK9.k9ReportsSearch.uISearchResultTable, "Approval Status", rowIndex);
			verify.ExpectedPropertyValueIsEqual("On Hold", callNo);
		}

		public void verifyApprovalStatusAsApproved(int rowIndex) {
			String status = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapK9.k9ReportsSearch.uISearchResultTable, "Approval Status", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Approved", status);
		}

		public void verifyNorecordFoundAcknowledge() {
			popup.acknowledge.okWithExpectedContainMessage("1011 - No Record Found");

		}

		public void verifyK9HandlerInactive() {
			
			List <String> values = objectIdentification.manualIdentify.getDropDownValues(uIMapK9.k9ReportsSearch.uIK9HandlerDropDown);
			for( String val:values)
			{
				if(val.contains(PoliceData.getK9ModuleValue("K9HandlerInactive")))
				verify.ExpectedPropertyValueIsEqual(val ,PoliceData.getK9ModuleValue("K9HandlerInactive"));
			}
		
		}

	}

	public class ReportEntry {
		public DetectionTab detectionTab;
		public ApprovalTab approvalTab = null;
		public NamesTab namesTab;
		public PreventiveActionTab preventiveActionTab;
		public SearchTab searchTab;
		public TrackingTab trackingTab;
		public NarrativeTab narrativeTab;

		public ReportEntry() {

			if (this.detectionTab == null)
				this.detectionTab = new DetectionTab();

			if (this.approvalTab == null)
				this.approvalTab = new ApprovalTab();

			if (this.namesTab == null)
				this.namesTab = new NamesTab();

			if (this.preventiveActionTab == null)
				this.preventiveActionTab = new PreventiveActionTab();

			if (this.searchTab == null)
				this.searchTab = new SearchTab();

			if (this.trackingTab == null)
				this.trackingTab = new TrackingTab();

			if (this.narrativeTab == null)
				this.narrativeTab = new NarrativeTab();

		}

		public void saveScreen() {
			uIMapK9.reportEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifySaveFunctionalityDisabled() {
			verify.ExpectedValueIsFalse(uIMapK9.reportEntry.uISaveButton.isEnabled());
			verify.ExpectedValueIsFalse(uIMapK9.reportEntry.uISaveAndCloseButton.isEnabled());

		}

		public void close() {
			uIMapK9.reportEntry.driver.close();
		}

		public void enterAtHandlerK9() {
			uIMapK9.reportEntry.uIHandlerK9CodeEdit.sendKeys(PoliceData.getK9ModuleValue("HandlerK9"));
			uIMapK9.reportEntry.uIHandlerK9CodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtK9Handler() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.reportEntry.uIK9HandlerDropdown,
					PoliceData.getK9ModuleValue("K9Handler"));
			uIMapK9.reportEntry.uIK9HandlerDropdown.sendKeys(Keys.TAB);
		}

		public void selectAtTypeOfIncident() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.reportEntry.uITypeOfIncidentComboBox,
					PoliceData.getK9ModuleValue("TypeOfIncident"));
			uIMapK9.reportEntry.uITypeOfIncidentComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtCallNo() {
			uIMapK9.reportEntry.uICallNoYearEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(0, 2));
			uIMapK9.reportEntry.uICallNoEdit.sendKeys(PoliceData.getK9ModuleValue("CallNo").substring(3));
			uIMapK9.reportEntry.uICallNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtAddress() {
			verify.ExpectedValueIsTrue(uIMapK9.reportEntry.uIAddressEdit.getAttribute("value")
					.contains(PoliceData.getK9ModuleValue("Address")));
		}

		public void tabDateTime() {
			uIMapK9.reportEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapK9.reportEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void clickCallInfoIcon() {
			uIMapK9.reportEntry.uICallNoinfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyDateTimaAsReportedDateTime(String reportedDate, String reportedTime) {
			verify.ExpectedPropertyValueIsEqual(reportedDate, uIMapK9.reportEntry.uIDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(reportedTime, uIMapK9.reportEntry.uITimeEdit.getAttribute("value"));
		}
		public void verifyAtDateTimeAsReportedDateTime() {																						// Added by Abi
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Date"), uIMapK9.reportEntry.uIDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Time"), uIMapK9.reportEntry.uITimeEdit.getAttribute("value"));
		}
		public void selectTypeOfIncident() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapK9.reportEntry.uITypeOfIncidentComboBox);
			uIMapK9.reportEntry.uITypeOfIncidentComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtCallNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("CallNo").substring(0, 2),
					uIMapK9.reportEntry.uICallNoYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("CallNo").substring(3),
					uIMapK9.reportEntry.uICallNoEdit.getAttribute("value"));
		}

		public void verifyAtCallNo(String callNo) {
			verify.ExpectedPropertyValueIsEqual(callNo.substring(0, 2),
					uIMapK9.reportEntry.uICallNoYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(callNo.substring(3),
					uIMapK9.reportEntry.uICallNoEdit.getAttribute("value"));
		}

		public void verifyAtCaseNo(String caseNo) {
			verify.ExpectedPropertyValueIsEqual(caseNo.substring(0, 2),
					uIMapK9.reportEntry.uICaseNoYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(caseNo.substring(3),
					uIMapK9.reportEntry.uICaseNoEdit.getAttribute("value"));
		}

		public void VerifyAdditionSuccessfulMessage() {
			String UpdateMessage = uIMapK9.reportEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}

		public void VerifyUpdateSuccessfulMessage() {
			String UpdateMessage = uIMapK9.reportEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1003 - Update Successful"));
			Playback.wait(2000);
		}

		public void verifyK9HandlerFieldDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapK9.reportEntry.uIK9HandlerDropdown.getAttribute("disabled").contains("disabled"));

		}

		public void verifyAtK9Handler() {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapK9.reportEntry.uIK9HandlerDropdown), PoliceData.getK9ModuleValue("K9Handler"));

		}

		public void clickSave() {
			uIMapK9.reportEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();

		}

		public void verifyRequiredEntriesMissingAknowledge() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - Detection Type");

		}

		public void clickOnDetectionTab() {
			uIMapK9.reportEntry.uIDetectionTab.click();
			Playback.controlReadyThreadWait();

		}

		public void clickOnNamesTab() {
			uIMapK9.reportEntry.uINamesTab.click();
			Playback.controlReadyThreadWait();

		}

		public void clickOnPreventiveActionTab() {
			uIMapK9.reportEntry.uIPreventiveActionTab.click();
			Playback.controlReadyThreadWait();

		}

		public void clickOnSearchTab() {
			uIMapK9.reportEntry.uISearchTab.click();
			Playback.controlReadyThreadWait();

		}

		public void clickOnTrackingTab() {
			uIMapK9.reportEntry.uITrackingTab.click();
			Playback.controlReadyThreadWait();

		}

		public void switchToNarrativeTab() {
			uIMapK9.reportEntry.uINarrativeTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
			Playback.controlReadyThreadWait();

		}

		public void switchToQAFormsTab() {
			uIMapK9.reportEntry.uIQAFormTabSpan.click();
			objectIdentification.windowHandle.switchToFrame(uIMapK9.reportEntry.uIQaFormsFrame);
			Playback.controlReadyThreadWait();

		}

		public void clickOnApprovalTab() {
			uIMapK9.reportEntry.uIApprovalTabTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame(uIMapK9.reportEntry.uIApprovalTabTabFrame);

		}

		public void verifyReportStatusAsOnHold() {

			verify.ExpectedPropertyValueIsEqual("On Hold", uIMapK9.reportEntry.uIreportStatus.getText());

		}

		public void verifyReportStatusAsSubmitted() {

			verify.ExpectedPropertyValueIsEqual("Submitted", uIMapK9.reportEntry.uIreportStatus.getText());

		}

		public void verifyReportStatusAsApproved() {

			verify.ExpectedPropertyValueIsEqual("Approved", uIMapK9.reportEntry.uIreportStatus.getText());
		}

		public void clickDeleteIcon() {
			uIMapK9.reportEntry.uIDeleteIcon.click();

		}

		public void verifyDoyouWantToDeleteConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");

		}

		public void verifyDoyouSaveConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("(3)Do You Want To Save All Of The Entered Details?");

		}

		public class DetectionTab {

			public void selectAtDetectionType() {
				uIMapK9.reportEntry.detectionTab.uIDetectionTypeInput.click();
				objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
						uIMapK9.reportEntry.detectionTab.uIDetectionTypeRadDropDown,
						PoliceData.getK9ModuleValue("DetectionType"));
				uIMapK9.reportEntry.detectionTab.uIDetectionTypeInput.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void selectDetectionTypeAsCheckAll() {
				uIMapK9.reportEntry.detectionTab.uIDetectionTypeArrowButton.click();
				objectIdentification.manualIdentify.selectRadControlDropDownCheckAllSelect(
						uIMapK9.reportEntry.detectionTab.uIDetectionTypeRadDropDown, "Check All");
				uIMapK9.reportEntry.detectionTab.uIDetectionTypeArrowButton.click();
				uIMapK9.reportEntry.detectionTab.uIDetectionTypeInput.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void verifyDetectionTypeDefaultSelectedAsOthers() {
				String value = uIMapK9.reportEntry.detectionTab.uIDetectionTypeInput.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual("Others", value);
			}

		
			public void verifyDetectionTypeIsNotMandatory() {
				 String DetectionColor = uIMapK9.reportEntry.detectionTab.uIDetectionTypeLabel.getCssValue("color");
				 System.out.println(DetectionColor);
				 verify.ExpectedPropertyValueIsEqual(DetectionColor, PoliceData.getK9ModuleValue("Color"));
			}
			public void verifyCodeIDInExplosiveDetectionType() {
				objectIdentification.manualIdentify
						.getDropDownOptionsElements(uIMapK9.reportEntry.detectionTab.uIExplosiveDetectionTypeDropDown)
						.contains(PoliceData.getK9ModuleValue("ExplosiveCodeID"));

			}

			public void verifyCodeIDInFireArmsDetectionType() {
				objectIdentification.manualIdentify
						.getDropDownOptionsElements(uIMapK9.reportEntry.detectionTab.uIFireArmsDetectionTypeDropDown)
						.contains(PoliceData.getK9ModuleValue("FireArmsCodeID"));

			}

		}

		public class NamesTab {
			public void enterAtPFCode() {
				uIMapK9.reportEntry.namesTab.uIPFedit.sendKeys(PoliceData.getK9ModuleValue("PFCode"));
				Playback.controlReadyThreadWait();
			}

		public void verifyAtPFCode() {
				String value = uIMapK9.reportEntry.namesTab.uIPFedit.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("NameID"), value);
			}

			public void enterAtNotes() {
				uIMapK9.reportEntry.namesTab.uINotesEdit.sendKeys(PoliceData.getK9ModuleValue("Notes"));
				Playback.controlReadyThreadWait();
			}

			public void clickAdd() {
				uIMapK9.reportEntry.namesTab.uIAddButton.click();

			}

			public void verifyNameIntheGrid(int rowIndex) {
				String name = objectIdentification.manualIdentify
						.getGridCellInnerText(uIMapK9.reportEntry.namesTab.uINamesTable, "Name", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Name"), name);
			}

			public void verifyName1IntheGrid(int rowIndex) {
				String name1 = objectIdentification.manualIdentify
						.getGridCellInnerText(uIMapK9.reportEntry.namesTab.uINamesTable, "Name", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Name1"), name1);
			}

			public void enterAtNameID() {
				uIMapK9.reportEntry.namesTab.uINameTypeEdit
						.sendKeys(PoliceData.getK9ModuleValue("NameID").substring(0, 1));
				uIMapK9.reportEntry.namesTab.uINameIDEdit.sendKeys(PoliceData.getK9ModuleValue("NameID").substring(3));
				uIMapK9.reportEntry.namesTab.uINameIDEdit.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void selectParticipantsActivity() {
				objectIdentification.randomIdentify
						.selectDropDownOption(uIMapK9.reportEntry.namesTab.uIParticipantsActivity);
			}

			public void clickManualAidRadioButton() {
				Playback.controlReadyThreadWait();
				uIMapK9.reportEntry.namesTab.uIManualAidRadioButton.click();
			}

			public void clickAgencyRadioButton() {
				Playback.controlReadyThreadWait();
				uIMapK9.reportEntry.namesTab.uIAgencyRadioButton.click();
			}

			public void clickAtNameIDInGrid() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapK9.reportEntry.namesTab.uINamesGrid, PoliceData.getK9ModuleValue("NameID"));

			}

			public void verifyAtMutualAid() {
				String Mutual = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.reportEntry.namesTab.uINamesGrid, "Mutual Aid", 0).getText();
				verify.ExpectedPropertyValueIsEqual(Mutual, PoliceData.getK9ModuleValue("MutualAid"));

			}

			public void verifyAtNameIDInGrid() {
				String Mutual = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.reportEntry.namesTab.uINamesGrid, "ID#", 0).getText();
				verify.ExpectedPropertyValueIsEqual(Mutual, PoliceData.getK9ModuleValue("NameID"));

			}
			public void clickNameInfoIcon() {
				uIMapK9.reportEntry.namesTab.uINameInfoIcon.click();

			}

public void clickMutualAidTeamMembverRadioButton() {
				uIMapK9.reportEntry.namesTab.uIMutualAidTeamMemberRadioButton.click();
			}

			public void selectAtParticipantsActivity() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.reportEntry.namesTab.uIParticipantsActivity,
						PoliceData.getK9ModuleValue("ParticipantsActivity"));

			}

			public void verifyAtParticipantsActivity() {
				String CellValue = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.reportEntry.namesTab.uINamesTable, "Activity", 0).getText();
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("ParticipantsActivity"), CellValue);

			}

		}

		public class PreventiveActionTab {
			public void enterAtIfOther() {
				uIMapK9.reportEntry.preventiveActionTab.uIIfOtherEdit.sendKeys(PoliceData.getK9ModuleValue("IfOther"));
				Playback.controlReadyThreadWait();
			}

			public void enterNumberGiven() {
				uIMapK9.reportEntry.preventiveActionTab.uINumGiven.sendKeys(Randomized.enterRandomNumbers(2));
				Playback.controlReadyThreadWait();
			}

			public void selectWarningGiven() {
				objectIdentification.randomIdentify
						.selectDropDownOption(uIMapK9.reportEntry.preventiveActionTab.uIWarningsGivenDropdown);
			}

			public void selectAtTypeOfPreventiveAction() {
				uIMapK9.reportEntry.preventiveActionTab.uITypeOfPreventiveActionInput.click();
				objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
						uIMapK9.reportEntry.preventiveActionTab.uITypeOfPreventiveActionDropdown,
						PoliceData.getK9ModuleValue("TypeOfPreventiveAction"));
				uIMapK9.reportEntry.preventiveActionTab.uITypeOfPreventiveActionInput.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void selectk9Action() {
				uIMapK9.reportEntry.preventiveActionTab.uIK9ActionInput.click();
				objectIdentification.randomIdentify.selectRadControlDropDownValueSelect(
						uIMapK9.reportEntry.preventiveActionTab.uITypeOfPreventiveActionDropdown);
				uIMapK9.reportEntry.preventiveActionTab.uIK9ActionInput.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}

			public void selectActionofSuspect() {
				uIMapK9.reportEntry.preventiveActionTab.uIActionofSuspectInput.click();
				objectIdentification.randomIdentify.selectRadControlDropDownValueSelect(
						uIMapK9.reportEntry.preventiveActionTab.uIActionofSuspectDropdown);
				uIMapK9.reportEntry.preventiveActionTab.uIActionofSuspectInput.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}
		}

		public class SearchTab {
			public void selctWarningGiven() {
				objectIdentification.randomIdentify.selectDropDownOption(uIMapK9.reportEntry.searchTab.uIWarningGiven);
			}

			public void enterNumberGiven() {
				uIMapK9.reportEntry.searchTab.uINumGiven.sendKeys(Randomized.enterRandomNumbers(2));
				Playback.controlReadyThreadWait();
			}

			public void selectAtTypeOfSearch() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.reportEntry.searchTab.uITypeOfSearchDropdown,
						PoliceData.getK9ModuleValue("TypeOfSearch"));
			}

			public void selectAtSubType() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.reportEntry.searchTab.uISubTypeDropdown, PoliceData.getK9ModuleValue("SubType"));
			}

			public void enterAtNotes() {
				uIMapK9.reportEntry.searchTab.uINotesEdit.sendKeys(PoliceData.getK9ModuleValue("Notes"));
				Playback.controlReadyThreadWait();
			}

			public void clickAdd() {
				uIMapK9.reportEntry.searchTab.uIAddButton.click();
				Playback.controlReadyThreadWait();
			}

			public void verifyAtTypeOfSearch(int rowIndex) {
				String value = objectIdentification.manualIdentify
						.getGridCellInnerText(uIMapK9.reportEntry.searchTab.uISearchTable, "Type Of Search", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("TypeOfsearch"), value);
			}

			public void verifyAtSubType(int rowIndex) {
				String value = objectIdentification.manualIdentify
						.getGridCellInnerText(uIMapK9.reportEntry.searchTab.uISearchTable, "Sub Type", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("SubType"), value);
			}

			public void verifyAtNotes(int rowIndex) {
				String value = objectIdentification.manualIdentify
						.getGridCellInnerText(uIMapK9.reportEntry.searchTab.uISearchTable, "Notes", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Notes"), value);
			}
		}

		public class TrackingTab {
			public TrackData trackData;

			public TrackingTab() {
				if (trackData == null)
					trackData = new TrackData();
			}

			public void clickOnTrackDataTab() {
				uIMapK9.reportEntry.trackingTab.uITrackDataTab.click();
			}

			public class TrackData {
				public void enterLengthOfTrack() {
					uIMapK9.reportEntry.trackingTab.trackData.uILengthOfTrack
							.sendKeys(Randomized.enterRandomNumbers(3));
				}

				public void enterTrackSurfaces() {
					uIMapK9.reportEntry.trackingTab.trackData.uITrackSurfaces.sendKeys(Randomized.randomString(10));
					Playback.controlReadyThreadWait();
				}

				public void enterSurfaceCondition() {
					uIMapK9.reportEntry.trackingTab.trackData.uISurfaceCondition.sendKeys(Randomized.randomString(10));
					Playback.controlReadyThreadWait();
				}

				public void SelectSubjectLocated() {
					objectIdentification.randomIdentify
							.selectDropDownOption(uIMapK9.reportEntry.trackingTab.trackData.uISubjectLocated);
					Playback.controlReadyThreadWait();
				}

				public void enterAgeofTrack() {
					uIMapK9.reportEntry.trackingTab.trackData.uIAgeOfTrack.sendKeys(Randomized.enterRandomNumbers(2));
				}

				public void enteTimeofTrack() {
					uIMapK9.reportEntry.trackingTab.trackData.uITimeOfTrack.sendKeys(Randomized.enterRandomNumbers(2));
				}

				public void enterAtNotes() {
					uIMapK9.reportEntry.trackingTab.trackData.uILengthOfTrack
							.sendKeys(PoliceData.getK9ModuleValue("Notes"));
				}

			}
		}

		public class NarrativeTab {
			public void internalSave() {
				uIMapK9.reportEntry.narrativeTab.uIInternalSaveButton.click();
				popup.confirm.yes();
			}

			public void clickLoadButton() {
				uIMapK9.reportEntry.narrativeTab.uILoadButton.click();
			}

			public void selectAtTempelate() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.reportEntry.narrativeTab.uITemplateComboBox, PoliceData.getK9ModuleValue("Template"));
			}

			public void verifyAtText() {
				objectIdentification.windowHandle
						.switchToFrame(uIMapK9.reportEntry.narrativeTab.uINarrativeRichTextEdit);
				verify.ExpectedValueIsTrue(uIMapK9.reportEntry.narrativeTab.uITextBody.getText()
						.contains(PoliceData.getK9ModuleValue("Text")));
			}

			public void VerifyAdditionSuccessfulMessage() {
				String UpdateMessage = uIMapK9.reportEntry.narrativeTab.uILeftSideStatusBar.getText();
				verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
				Playback.wait(2000);
			}

			public void enterAtText() { // Added by Abi
				objectIdentification.windowHandle
						.switchToFrame(uIMapK9.reportEntry.narrativeTab.uINarrativeRichTextEdit);
				uIMapK9.reportEntry.narrativeTab.uITextBody.sendKeys(Keys.ENTER);
				uIMapK9.reportEntry.narrativeTab.uITextBody.sendKeys(PoliceData.getK9ModuleValue("Text"));
			}
		}

		public class ApprovalTab {
			public void SaveInternalTab() {
				uIMapK9.reportEntry.approvalTab.uISaveButton.click();
				popup.confirm.yes();
			}

			public void SelectAtNewAction() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.reportEntry.approvalTab.uINewActionComboBox, BaseData.getNamesModuleValue("NewAction"));
				uIMapK9.reportEntry.approvalTab.uINewActionComboBox.sendKeys(Keys.TAB);
			}

			public void TabDateTime() {
				uIMapK9.reportEntry.approvalTab.uIDateEdit.sendKeys(Keys.TAB);
				uIMapK9.reportEntry.approvalTab.uITimeEdit.sendKeys(Keys.TAB);
			}

			public void SelectAtDivision() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.reportEntry.approvalTab.uIDivisionComboBox, BaseData.getNamesModuleValue("Division"));
				uIMapK9.reportEntry.approvalTab.uIDivisionComboBox.sendKeys(Keys.TAB);
			}

			public void SelectAtSection() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.reportEntry.approvalTab.uISectionComboBox, BaseData.getNamesModuleValue("Section"));
				uIMapK9.reportEntry.approvalTab.uISectionComboBox.sendKeys(Keys.TAB);
			}

			public void selectActionAsSendForApproval() {

				objectIdentification.manualIdentify
						.selectDropDownOption(uIMapK9.reportEntry.approvalTab.uINewActionComboBox, "Send for Approval");
				uIMapK9.reportEntry.approvalTab.uINewActionComboBox.sendKeys(Keys.TAB);

			}

			public void selectActionAsApprove() {
				objectIdentification.manualIdentify
						.selectDropDownOption(uIMapK9.reportEntry.approvalTab.uINewActionComboBox, "Approve");
			}

			public void selectActionAsLock() {
				objectIdentification.manualIdentify
						.selectDropDownOption(uIMapK9.reportEntry.approvalTab.uINewActionComboBox, "Lock");
			}
		}

		public void verifyCallInfoIconIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapK9.reportEntry.uICallNoinfoIcon.isDisplayed());
		}

		public void verifyAddressInfoIconIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapK9.reportEntry.uIAddressIcon.isDisplayed());
		}

		public void verifyDetectionTypeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - Detection Type");

		}

		public int getK9HandlerDropdownOptionsCount(){
			
			int count =objectIdentification.manualIdentify.getDropDownOptionsCount(uIMapK9.reportEntry.uIK9HandlerDropdown);	
			return count;
		}
	public List<String> getK9HandlerDropdownOptions(){
			
			List<String> count =objectIdentification.manualIdentify.getDropDownValues(uIMapK9.reportEntry.uIK9HandlerDropdown);	
			return count;
		}

		public void verifyTheCountsofDropDown(int a , int b)
		{
			verify.ExpectedIntergerValueIsNotEqualToActual(b, a);
		}
		public void verifyTheCountsofDropDown(List<String> a , List<String> b)
		{
			verify.ExpectedValueIsFalse(a.equals(b));  
		}

		public void verifyK9HandlerInactive() {
			
			List <String> values = objectIdentification.manualIdentify.getDropDownValues(uIMapK9.k9Medical.uIK9HandlerDropdown);
			for( String val:values)
			{
				if(val.contains(PoliceData.getK9ModuleValue("K9HandlerInactive")))
				verify.ExpectedPropertyValueIsEqual(val ,PoliceData.getK9ModuleValue("K9HandlerInactive"));
			}
		
				
			}
		
		public void verifyAtK9HandlerInactive() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapK9.k9Medical.uIK9HandlerDropdown).contains("##"+PoliceData.getK9ModuleValue("K9Handler")));
				
			}

		public void EnterTextInDescribeArea() {
			uIMapK9.reportEntry.uIDescribeArea.sendKeys("Hello Automation testing");
		}

			public void verifyStatusBarMessageAsEmpty() { // Added by Abi

			List<WebElement> childs = uIMapK9.k9TrainingEntry.uIFooterStatus.findElements(By.xpath("./child::*"));

			for (WebElement e : childs) {
				if (e.getTagName().contains("b")) {
					System.out.println(e.getText());
					// verify.ExpectedValueIsFalse(e.isDisplayed());
					Assert.assertNull(e.getText(), "Error");
				} else {
					Assert.assertTrue(true);
				}
			}

		}
			public void verify1051UpdatedDataExistsAcknowledge() { // Added by Abi
				popup.acknowledge
						.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
			}

			public void clickAllTabs() {																						// Added by Abi
				uIMapK9.reportEntry.uIDetailsTab.click();
				uIMapK9.reportEntry.uIDetectionTab.click();
				uIMapK9.reportEntry.uINamesTab.click();
				uIMapK9.reportEntry.uIPreventiveActionTab.click();
				uIMapK9.reportEntry.uISearchTab.click();
				uIMapK9.reportEntry.uITrackingTab.click();
				uIMapK9.reportEntry.uINarrativeTab.click();
				uIMapK9.reportEntry.uIAttachmentTab.click();
				uIMapK9.reportEntry.uIQAFormTabSpan.click();
				uIMapK9.reportEntry.uIApprovalTabTab.click();
			}
			public void clickAllTabsBeforeSave() {
			uIMapK9.reportEntry.uIDetailsTab.click();
			uIMapK9.reportEntry.uIDetectionTab.click();
			uIMapK9.reportEntry.uINamesTab.click();
			uIMapK9.reportEntry.uIPreventiveActionTab.click();
			uIMapK9.reportEntry.uISearchTab.click();
			uIMapK9.reportEntry.uITrackingTab.click();
			}
			public void verifyAtTypeOfIncident() {																				// Added by Abi
				String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapK9.reportEntry.uITypeOfIncidentComboBox);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("TypeOfIncident"), dropDownSelectedItem);
			}

			public void clickResetButton() {																					// Added by Abi
				uIMapK9.reportEntry.uIResetButton.click();
			}
				public void clickOnAttachmentTab() {																				// Added by Abi
				uIMapK9.reportEntry.uIAttachmentTab.click();
				Playback.gridLoadThreadWait();
				objectIdentification.windowHandle.switchToFrame(uIMapK9.reportEntry.uIAttachmentTabFrame);
			}
			
	}

	public class K9PersonnelEntry {
		public K9PersonnelEntryPhysicalTab k9PersonnelEntryPhysicalTab;
		public K9PersonnelEntryMedicalTab k9PersonnelEntryMedicalTab;
		public K9PersonnelEntryReportsTab k9PersonnelEntryReportsTab;
		public K9PersonnelEntryTrainingTab k9PersonnelEntryTrainingTab;
		public K9PersonnelEntryCommentsTab k9PersonnelEntryCommentsTab;
		public K9PersonnelEntryAttachmentTab k9PersonnelEntryAttachmentTab;
		public K9PersonnelEntryCertificationsTab k9PersonnelEntryCertificationsTab;
		public K9PersonnelEntryAwardsTab k9PersonnelEntryAwardsTab;

		public K9PersonnelEntry() {
			if (k9PersonnelEntryPhysicalTab == null)
				k9PersonnelEntryPhysicalTab = new K9PersonnelEntryPhysicalTab();

			if (k9PersonnelEntryMedicalTab == null)
				k9PersonnelEntryMedicalTab = new K9PersonnelEntryMedicalTab();

			if (k9PersonnelEntryReportsTab == null)
				k9PersonnelEntryReportsTab = new K9PersonnelEntryReportsTab();

			if (k9PersonnelEntryTrainingTab == null)
				k9PersonnelEntryTrainingTab = new K9PersonnelEntryTrainingTab();

			if (k9PersonnelEntryCommentsTab == null)
				k9PersonnelEntryCommentsTab = new K9PersonnelEntryCommentsTab();

			if (k9PersonnelEntryAttachmentTab == null)
				k9PersonnelEntryAttachmentTab = new K9PersonnelEntryAttachmentTab();

			if (k9PersonnelEntryCertificationsTab == null)
				k9PersonnelEntryCertificationsTab = new K9PersonnelEntryCertificationsTab();

			if (k9PersonnelEntryAwardsTab == null)
				k9PersonnelEntryAwardsTab = new K9PersonnelEntryAwardsTab();
		}

		public void switchToTrainingTab() {
			uIMapK9.k9PersonnelEntry.uITrainingTab.click();
			Playback.pageLoadThreadWait();
		}

		public void switchToK9ReportsTab() {
			uIMapK9.k9PersonnelEntry.uIK9ReportsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmActivity.aspx");
			Playback.pageLoadThreadWait();
		}

		public void switchToCommentsTab() {
			uIMapK9.k9PersonnelEntry.uICommentsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmViewNotes");
			Playback.pageLoadThreadWait();
		}

		public void switchToCertificationsTab() {
			uIMapK9.k9PersonnelEntry.uICertificationsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCertificates");
			Playback.pageLoadThreadWait();
		}

		public void switchToAwardsTab() {
			uIMapK9.k9PersonnelEntry.uIAwardsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmAwards");
			Playback.pageLoadThreadWait();
		}

		public void switchToQAFormsTab() {
			uIMapK9.reportEntry.uIQAFormTabSpan.click();
			objectIdentification.windowHandle.switchToFrame(uIMapK9.reportEntry.uIQaFormsFrame);
			Playback.controlReadyThreadWait();

		}

		public void verifyAtK9Name() {
			String attribute = uIMapK9.k9PersonnelEntry.uIK9NameEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(attribute, PoliceData.getK9ModuleValue("K9Name"));
		}

		public void closeTheScreen() {
			Playback.driver.close();
		}

		public void switchToMedicalTab() {
			uIMapK9.k9PersonnelEntry.uIMedicalTab.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyMedicalTabInBlueColor() {
//	String attribute = uIMapK9.k9PersonnelEntry.uIMedicalTab.getAttribute("color");
//	System.out.println(attribute);
			// verify.ExpectedValueIsTrue(attribute.contains(""));
			String Blue = "rgba(0, 0, 255, 1)";

			verify.ExpectedPropertyValueIsEqual(uIMapK9.k9PersonnelEntry.uIMedicalTab.getCssValue("color"), Blue);
		}

		public void saveTheScreen() {
			objectIdentification.manualIdentify.saveTheScreenWithConfirm();

		}

		public void closeScreen() {
			uIMapK9.k9PersonnelEntry.driver.close();
		}

		public void refreshScreen() {
			objectIdentification.manualIdentify.resetTheScreen();
		}

		public class K9PersonnelEntryPhysicalTab {

			public void selectAtBreed() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.uIK9BreedCombobox,
						PoliceData.getK9ModuleValue("Breed"));
			}

			public void selectAtSex() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.uIK9SexCombobox,
						PoliceData.getK9ModuleValue("Sex"));
			}

			public void enterAtDOB() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.uIK9DOBEdit
						.sendKeys(PoliceData.getK9ModuleValue("DOB"));
			}

			public void enterHireDateAs4DaysFuture() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.uIHireDateEdit.click();
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.uIHireDateEdit
						.sendKeys(Randomized.getFutureDate(4));
				// uIMapK9.k9PersonnelEntry.k9PersonnelEntryPhysicalTab.uIHireDateEdit.sendKeys(Keys.TAB);
			}

		}

		public class K9PersonnelEntryMedicalTab {
			public K9PersonnelEntryCurrentTab k9PersonnelEntryCurrentTab;
			public K9PersonnelEntryVeterinarianVisitsTab k9PersonnelEntryVeterinarianVisitsTab;

			public K9PersonnelEntryMedicalTab() {
				if (k9PersonnelEntryCurrentTab == null)
					k9PersonnelEntryCurrentTab = new K9PersonnelEntryCurrentTab();

				if (k9PersonnelEntryVeterinarianVisitsTab == null)
					k9PersonnelEntryVeterinarianVisitsTab = new K9PersonnelEntryVeterinarianVisitsTab();
			}

			public void switchToCurrentTab() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.uICurrentTab.click();
			}

			public void switchToVeterinarianVisitsTab() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.uIVeterinarianVisitsTab.click();
				Playback.controlReadyThreadWait();
			}

			public class K9PersonnelEntryCurrentTab {

				public void enterAtMedications() {
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIMedicationsEdit
							.sendKeys(PoliceData.getK9ModuleValue("Medications"));
				}

				public void enterAtDossage() {
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIDossageEdit
							.sendKeys(PoliceData.getK9ModuleValue("Dossage"));
				}

				public void clickMedicationsAddButton() {
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIMedicationAddButton
							.click();
				}

				public void selectAtVaccine() {
					objectIdentification.manualIdentify.selectDropDownOption(
							uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIVaccineDropDown,
							PoliceData.getK9ModuleValue("Vaccine"));
				}

				public void enterIssuedDateAsCurrentDate() {
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIIssuedDate
							.sendKeys(Randomized.getCurrentDate());
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIIssuedDate
							.sendKeys(Keys.TAB);
				}

				public void enterNextDueDateAsFutureDate() {
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uINextDueDate
							.sendKeys(Randomized.getFutureDate(5));
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uINextDueDate
							.sendKeys(Keys.TAB);
				}

				public void clickVaccineAddButton() {
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIVaccineAddButton
							.click();
				}

				public void verifyRowCountIsZeroInMedicationsGrid() {
					int gridTableRowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(
							uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIMedicationResultTable);
					System.out.println(gridTableRowsCount);
					verify.ExpectedIntergerValueIsEqualToActual(gridTableRowsCount, 1);
				}

				public void verifyRowCountIsZeroInVaccineGrid() {
					int gridTableRowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(
							uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIVaccineResultTable);
					verify.ExpectedIntergerValueIsEqualToActual(gridTableRowsCount, 1);
				}

				public void verifyRowCountInMedicationsGrid() {
					int gridTableRowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(
							uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIMedicationResultTable);
					System.out.println(gridTableRowsCount);
					verify.ExpectedIntergerValueIsEqualToActual(gridTableRowsCount, 1);
				}

				public void verifyRowCountInVaccineGrid() {
					int gridTableRowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(
							uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryCurrentTab.uIVaccineResultTable);
					verify.ExpectedIntergerValueIsEqualToActual(gridTableRowsCount, 1);
				}

			}

			public class K9PersonnelEntryVeterinarianVisitsTab {

				public void clickAddNew() {
					uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab.uIAddNewButton
							.click();
				}

				public void verifyAtTypeOfVisitInGrid() {
					WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
							uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab.uIVeterinarianVisitsResultTable,
							PoliceData.getK9ModuleValue("TypeOfVisit"));
					verify.ExpectedValueIsTrue(
							gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("TypeOfVisit")));
				}

				public void verifyAtReasonInGrid() {
					WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
							uIMapK9.k9PersonnelEntry.k9PersonnelEntryMedicalTab.k9PersonnelEntryVeterinarianVisitsTab.uIVeterinarianVisitsResultTable,
							PoliceData.getK9ModuleValue("Reason"));
					verify.ExpectedValueIsTrue(
							gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("Reason")));
				}

			}

		}

		public class K9PersonnelEntryReportsTab {
			public void clickAddNew() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryReportsTab.uIAddNewButton.click();
			}

			public void verifyAtCallNo(int rowIndex) {
				String value = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryReportsTab.uIReportsTable, "Call#", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("CallNo"), value);
			}

			public void verifyAtCaseNo(int rowIndex) {
				String value = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryReportsTab.uIReportsTable, "Case#", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("CaseNo"), value);
			}

			public void verifyAtK9Handler(int rowIndex) {
				String value = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryReportsTab.uIReportsTable, "K9/Handler", rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("K9Handler"), value);
			}

			public List<String> GetDateListInGrid() {
				
				List<String> gridTableColumnCells = objectIdentification.manualIdentify.getGridRowCellsValues(uIMapK9.k9PersonnelEntry.k9PersonnelEntryReportsTab.uIReportsTable, 0);
				return gridTableColumnCells;
			}
			public void verifySortOrder(List<String> beforeSort,List<String> AfterSort) {
				verify.ExpectedValueIsFalse(  beforeSort.equals(AfterSort));
				
			}

			 public void ClickDateHeaderInGrid() {
			    	
			    	
			    	objectIdentification.manualIdentify.selectGridHeaderColumnName(uIMapK9.k9PersonnelEntry.k9PersonnelEntryReportsTab.uIReportsTable, "Date");
			    	
			    }
		}

		public class K9PersonnelEntryTrainingTab {

			public void clickAddTraining() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryTrainingTab.uIAddTrainingButton.click();
				Playback.pageLoadThreadWait();
			}

			public void selectAtK9HandlerInGrid() {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryTrainingTab.uIAddTrainingTable,
						PoliceData.getK9ModuleValue("K9Handler"));

			}

			public void verifyAtK9Handler(int rowIndex) {
				String value = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryTrainingTab.uIAddTrainingTable, "K9/Handler",
						rowIndex);
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("K9Handler"), value);
			}
		}

		public class K9PersonnelEntryCommentsTab {
			public void clickAddNotes() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCommentsTab.uIAddNotesButton.click();
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
			}

			public void verifyAtRemarks() {
				verify.ExpectedValueIsTrue(uIMapK9.k9PersonnelEntry.k9PersonnelEntryCommentsTab.uIEnteredRemarks
						.getText().contains(PoliceData.getK9ModuleValue("Remarks")));
			}

			public void verifyAtOfficer() {
				verify.ExpectedValueIsTrue(uIMapK9.k9PersonnelEntry.k9PersonnelEntryCommentsTab.uIEnteredOfficer
						.getText().contains(PoliceData.getK9ModuleValue("Officer")));
			}
		}

		public class K9PersonnelEntryAttachmentTab {

		}

		public class K9PersonnelEntryCertificationsTab {
			public void selectAtCertification() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uICertificationDropdown,
						PoliceData.getK9ModuleValue("Certification"));
			}

			public void enterAtLocation() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uILocationEdit
						.sendKeys(PoliceData.getK9ModuleValue("Location"));
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uILocationEdit.sendKeys(Keys.TAB);
			}

			public void enterCertifiedDateAsCurrentDate() {
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uIDateCertified
						.sendKeys(Randomized.getCurrentDate());
			}

			public void enterExpiredDateAsFuture15days() {
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uIExpireDate
						.sendKeys(Randomized.getFutureDate(15));
			}

			public void enterAtComments() {
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uICommentsEdit
						.sendKeys(PoliceData.getK9ModuleValue("Comments"));
			}

			public void verifyExpireDateAs15daysFuture(int rowIndex) {
				Playback.controlReadyThreadWait();

				String value = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uICertificationTable,
						"Expiration Date", rowIndex);

				verify.ExpectedValueIsTrue(Randomized.getFutureDate(15).contains(value));
			}

			public void verifyAtCertification(int rowIndex) {
				Playback.controlReadyThreadWait();
				verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uICertificationTable,
						"Certification", rowIndex), PoliceData.getK9ModuleValue("Certification"));
			}

			public void verifyAtComments(int rowIndex) {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify
						.getGridCell(uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uICertificationTable,
								"Comments", rowIndex)
						.click();
				objectIdentification.windowHandle.switchToWindow("Remarks");
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Comments"),
						Playback.driver.findElement(By.xpath("//b")).getText());
			}

			public void clickAdd() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uIAddButton.click();
			}

			public void saveInternal() {
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryCertificationsTab.uISaveButton.click();
				popup.confirm.yes();
			}

		}

		public class K9PersonnelEntryAwardsTab {
			public void enterAwardeddateAsCurrentDate() {
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uIDateAwarded.sendKeys(Randomized.getCurrentDate());
			}

			public void enterAtAward() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uIAwardEdit
						.sendKeys(PoliceData.getK9ModuleValue("Award"));
			}

			public void enterAtAwardingBody() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uIAwardingBodyEdit
						.sendKeys(PoliceData.getK9ModuleValue("AwardingBody"));
			}

			public void enterAtComments() {
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uICommentsEdit
						.sendKeys(PoliceData.getK9ModuleValue("Comments"));
			}

			public void verifyDateAwardedAsCurrentDate(int rowIndex) {
				Playback.controlReadyThreadWait();

				String value = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uIAwardsTable, "Date Awarded", rowIndex);

				verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"), value);
			}

			public void verifyAtAward(int rowIndex) {
				Playback.controlReadyThreadWait();
				verify.ExpectedPropertyValueIsEqual(
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uIAwardsTable, "Award", rowIndex),
						PoliceData.getK9ModuleValue("Award"));
			}

			public void verifyAtComments(int rowIndex) {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.getGridCell(
						uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uIAwardsTable, "Comments", rowIndex).click();
				objectIdentification.windowHandle.switchToWindow("Remarks");
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Comments"),
						Playback.driver.findElement(By.xpath("//b")).getText());
			}

			public void clickAdd() {
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uIAddButton.click();
			}

			public void saveInternal() {
				Playback.controlReadyThreadWait();
				uIMapK9.k9PersonnelEntry.k9PersonnelEntryAwardsTab.uISaveButton.click();
				popup.confirm.yes();
			}
		}

		public void clickInactiveCheckbox() {
			uIMapK9.k9PersonnelEntry.uIK9InactiveCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyHandlerNameAsEmpty() {

			verify.ExpectedValueIsFalse(
					objectIdentification.manualIdentify.controlExist(uIMapK9.k9PersonnelEntry.uIHandlerLabelEdit));
		}

		public void verifyAtHandlerName() {
			String attribute = uIMapK9.k9PersonnelEntry.uIHandlerLabelEdit.getText();
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getK9ModuleValue("Handler")));
		}

		public void enterAtK9Name() {
			uIMapK9.k9PersonnelEntry.uIK9NameEdit.sendKeys(PoliceData.getK9ModuleValue("K9Name"));

		}

		public void enterAtK9EmployeeName() {
			uIMapK9.k9PersonnelEntry.uIK9EmployeeEdit.sendKeys(PoliceData.getK9ModuleValue("K9EmployeeName"));

		}

		public void selectAtPrimaryFunction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapK9.k9PersonnelEntry.uIK9PrimaryFunctionCombobox,
					PoliceData.getK9ModuleValue("PrimaryFunction"));
		}

		public void switchToPhysicalTab() {
			uIMapK9.k9PersonnelEntry.uIPhysicalTab.click();

		}

		public void verifyimage() {
			System.out.println("WithImage");
			System.out.println(uIMapK9.k9PersonnelEntry.uIK9PersonnelImage.getCssValue("height"));
			System.out.println(uIMapK9.k9PersonnelEntry.uIK9PersonnelImage.getCssValue("width"));

		}
		public void verifyImageHeightIsPresent() {
			verify.ExpectedPropertyValueIsNotEqual(PoliceData.getK9ModuleValue("WithoutImgHeight"),
					uIMapK9.k9PersonnelEntry.uIK9PersonnelImage.getCssValue("height"));

		}
		public void verifyImageWidthIsPresent() {
			verify.ExpectedPropertyValueIsNotEqual(PoliceData.getK9ModuleValue("WithoutImgWidth"),
					uIMapK9.k9PersonnelEntry.uIK9PersonnelImage.getCssValue("width"));

		}

		public void saveAndCloseTheScreen() {
			objectIdentification.manualIdentify.saveAndCloseTheScreenWithConfirm();
			
		}
			public void verifyUpdateSucessFullMessage() {
						verify.ExpectedPropertyValueIsEqual(uIMapK9.k9PersonnelEntry.uIBottomMessage.getText(), "1003 - Update Successful");
			
		}

		public void ClickAtImage() {
			
			uIMapK9.k9PersonnelEntry.uIK9PersonnelImage.click();
		}



	}

	public class K9Personnel {

		public void clickSearch() {
			uIMapK9.k9Personnel.uISearchButton.click();
			Playback.pageLoadThreadWait();
		}

		public void selectAJAXInGrid() {
			uIMapK9.k9Personnel.uIAJAXinGrid.click();
			Playback.pageLoadThreadWait();
		}

		public void selectAtK9HandlerInGrid()

		{
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable,
					PoliceData.getK9ModuleValue("K9Handler"));
			Playback.controlReadyThreadWait();
//        objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable, PoliceData.getK9ModuleValue("K9Handler"), rowIndex);
		}

		public void selectAtHandlerInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable,
					PoliceData.getK9ModuleValue("Handler"));
			Playback.controlReadyThreadWait();
//        objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable, PoliceData.getK9ModuleValue("K9Handler"), rowIndex);
		}

		public void selectRowByIndexInGrid(int rowIndex) {
			// objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable,
			// "Handler", rowIndex);
			objectIdentification.manualIdentify.selectGridTableRow(uIMapK9.k9Personnel.uISearchResultTable, rowIndex);
		}

		public void selectAtK9NameInGrid(int rowIndex) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable,
					PoliceData.getK9ModuleValue("K9Name"));
			Playback.controlReadyThreadWait();
		}

		public void enterAtHandler() {
			uIMapK9.k9Personnel.uIHandlerLookupEdit.sendKeys(PoliceData.getK9ModuleValue("Handler"));
			uIMapK9.k9Personnel.uIHandlerLookupEdit.sendKeys(Keys.TAB);
		}

		public void selectAtK9Name() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Personnel.uIK9NameDropDown,
					PoliceData.getK9ModuleValue("K9Name"));

		}

		public void clickHandlerLookup() {
			uIMapK9.k9Personnel.uIHandlerLookupButton.click();
		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Personnel.uIK9NameDropDown,
					PoliceData.getK9ModuleValue("Juris"));

		}

		public void clickAddNew() {
			uIMapK9.k9Personnel.uIAddNewButton.click();
			Playback.pageLoadThreadWait();
		}

		public void selectAtK9NameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable,
					PoliceData.getK9ModuleValue("K9Name"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtDOBInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapK9.k9Personnel.uISearchResultTable, PoliceData.getK9ModuleValue("DOB"));
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("DOB")));
		}

		public void verifyAtDateSinceAs4DaysFutureDateInGrid() {
			String futureDate = Randomized.getFutureDate(4, "MM/dd/yy");

			System.out.println(futureDate);
			// String futureDate = Randomized.getFutureDate(4, "mm/dd/yy");
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable, futureDate);
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getText().contains(futureDate));
		}
		public void clickInactiveCheckBox() 
		{
			uIMapK9.k9Personnel.uIInactiveCheckBox.click();
		}
public void verifyTheSelectedJuris() {
			String Juris =objectIdentification.manualIdentify.getDropDwonSelectedItem(uIMapK9.k9Personnel.uIJurisDropdown);
			verify.ExpectedPropertyValueIsEqual(Juris, PoliceData.getK9ModuleValue("SelectedJuris"));
			
		}

		public void verifyTheJurisListedInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapK9.k9Personnel.uISearchResultTable, "Juris");
			
			for(String value:gridTableColumnValues) {
				verify.ExpectedPropertyValueIsEqual(value,PoliceData.getK9ModuleValue("Juris"));
				
			}
		}
		public void verifyTheK9NameValuesAsSelectedJuris() {
			
			List<String> dropDownValues =objectIdentification.manualIdentify.getDropDownValues(uIMapK9.k9Personnel.uIK9NameDropDown);
			dropDownValues.remove(0);
			System.out.println(dropDownValues);
			List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapK9.k9Personnel.uISearchResultTable, "K9 Name");
			System.out.println(gridTableColumnValues);
			verify.ExpectedListValueIsTrue(gridTableColumnValues,dropDownValues);
			
			
		}
public void verifyTheJurisInGridAsSelectedJurisAsNull() {
			
	List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(uIMapK9.k9Personnel.uISearchResultTable, "Juris");
	
		
	for(String value:gridTableColumnValues) {
		if(value.equals(PoliceData.getK9ModuleValue("Juris"))) {
		
			verify.ExpectedPropertyValueIsEqual(value,PoliceData.getK9ModuleValue("Juris"));
		}
		else {
		
			verify.ExpectedPropertyValueIsEqual(value,PoliceData.getK9ModuleValue("Juris1"));
		}
		}
	}
		
		public void selectAtJurisAsBC() {
	objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Personnel.uIJurisDropdown,
		"BC - Brown County Police Department");

}
	public void selectAtJurisAsNull() {
	objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Personnel.uIJurisDropdown,
			"--");

	}

		
		

	}
		public class K9Training {

		public void selectAtJurisComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Training.uIJurisDropDown,
					PoliceData.getK9ModuleValue("Juris"));
		}

		public void selectAtK9Handler() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Training.uIK9HandlerDropDown,
					PoliceData.getK9ModuleValue("K9Handler"));
			uIMapK9.k9Training.uIK9HandlerDropDown.sendKeys(Keys.TAB);
		}

		public void selectAtTrainerComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Training.uIK9TrainerComboBox,
					PoliceData.getK9ModuleValue("Trainer"));
		}

		public void selectAtFacilityComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Training.uIFacilityComboBox,
					PoliceData.getK9ModuleValue("Facility"));
		}

		public void selectAtApprovalStatusComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Training.uIApprovalStatusComboBox,
					PoliceData.getK9ModuleValue("ApprovalStatus"));
		}

		public void clickAddNewLink() {
			uIMapK9.k9Training.uIAddNewLink.click();
		}

		public void clickSearchButton() {
			uIMapK9.k9Training.uISearchButton.click();
		}

		public void clickTrainingDetailRadioButton() {
			uIMapK9.k9Training.uITrainingDetailRadioButton.click();
		}

		public void clickTrainingSummaryRadioButton() {
			uIMapK9.k9Training.uITrainingSummaryRadioButton.click();
		}

		public void clickRowByTrainingNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Training.uIK9TrainingTable,
					PoliceData.getK9ModuleValue("TrainingNo"));
		}

		public void clickRowByK9HandlerInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Training.uIK9TrainingTable,
					PoliceData.getK9ModuleValue("K9Handler"));
		}

		public void verifyAtTrainerInGrid() {
			WebElement innerText = objectIdentification.manualIdentify.getGridCell(uIMapK9.k9Training.uIK9TrainingTable,
					PoliceData.getK9ModuleValue("Trainer"));

			verify.ExpectedPropertyValueIsEqual(innerText.getText(), PoliceData.getK9ModuleValue("Trainer"));
		}

		public void verifyAtK9HandlerInGrid() {
			WebElement innerText = objectIdentification.manualIdentify.getGridCell(uIMapK9.k9Training.uIK9TrainingTable,
					PoliceData.getK9ModuleValue("K9Handler"));

			verify.ExpectedPropertyValueIsEqual(innerText.getText(), PoliceData.getK9ModuleValue("K9Handler"));
		}

		public void clickK9HandlerInGridByStartDate() {
			objectIdentification.manualIdentify
					.getGridCell(uIMapK9.k9Training.uIK9TrainingTable, PoliceData.getK9ModuleValue("StartDate"))
					.click();
		}

		public void selectRowByAtTrainingNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Training.uIK9TrainingTable,
					PoliceData.getK9ModuleValue("TrainingNo"));
		}
	}

	public class K9TrainingEntry {

		public K9TrainingEntryActivityTab k9TrainingEntryActivityTab;
		public K9TrainingEntryApprovalTab k9TrainingEntryApprovalTab;
		public K9TrainingEntryAttachmentTab k9TrainingEntryAttachmentTab;

		public K9TrainingEntry() {
			if (k9TrainingEntryActivityTab == null)
				k9TrainingEntryActivityTab = new K9TrainingEntryActivityTab();

			if (k9TrainingEntryApprovalTab == null)
				k9TrainingEntryApprovalTab = new K9TrainingEntryApprovalTab();

			if (k9TrainingEntryAttachmentTab == null)
				k9TrainingEntryAttachmentTab = new K9TrainingEntryAttachmentTab();
		}

		public void selectAtK9Handler() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9TrainingEntry.uIK9HandlerDropDown,
					PoliceData.getK9ModuleValue("K9Handler"));
			uIMapK9.k9TrainingEntry.uIK9HandlerDropDown.sendKeys(Keys.TAB);
		}

		public void switchToActivityTab() {
			uIMapK9.k9TrainingEntry.uIActivityTab.click();
			Playback.pageLoadThreadWait();
		}

		public void selectFacility() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapK9.k9TrainingEntry.uIK9FacilityDropDown);
			uIMapK9.k9TrainingEntry.uIK9FacilityDropDown.sendKeys(Keys.TAB);
		}

		public void selectAtInstructor() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9TrainingEntry.uIK9InstructorDropDown,
					PoliceData.getK9ModuleValue("Instructor"));
			uIMapK9.k9TrainingEntry.uIK9InstructorDropDown.sendKeys(Keys.TAB);
		}

		public void tabStartDateTime() {
			uIMapK9.k9TrainingEntry.uIK9FromDateEdit.sendKeys(Keys.TAB);
			uIMapK9.k9TrainingEntry.uIK9FromTimeEdit.sendKeys(Keys.TAB);
		}

		public void tabEndDateTime() {
			uIMapK9.k9TrainingEntry.uIK9ToDateEdit.sendKeys(Keys.TAB);
			uIMapK9.k9TrainingEntry.uIK9ToTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterEndDateAsFutureDateByNextDate() {
			while (!uIMapK9.k9TrainingEntry.uIK9ToDateEdit.getAttribute("value").equals("")) {
				Playback.actionDriver.doubleClick(uIMapK9.k9TrainingEntry.uIK9ToDateEdit).build().perform();
				Playback.actionDriver.sendKeys(Keys.BACK_SPACE).build().perform();
			}
			uIMapK9.k9TrainingEntry.uIK9ToDateEdit.sendKeys(Randomized.getFutureDate(1));
		}

		public void tabOutEndTime() {
			uIMapK9.k9TrainingEntry.uIK9ToTimeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(10004) The To Date must be later than the From Date");
		}

		public void clickSave() {
			uIMapK9.k9TrainingEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
		}

		public void saveScreen() {
			uIMapK9.k9TrainingEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void verifySaveAsDisabled() {
			String attribute = uIMapK9.k9TrainingEntry.uISaveButton.getAttribute("disabled");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("true"));
		}

		public void verifyK9HandlerAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing K9/Handler");
		}

		public void verifyK9HandlerInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapK9.k9TrainingEntry.uIK9HandlerInfoIcon.isDisplayed());
		}

		public void clickK9HandlerInfoIcon() {
			uIMapK9.k9TrainingEntry.uIK9HandlerInfoIcon.click();
		}

		public void verifyAdditionSuccessfulMessageInFooterStatus() {
			String text = uIMapK9.k9TrainingEntry.uIFooterStatus.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1002 - Addition Successful");
		}

		public void verifyAllTabsEnabled() {
			verify.ExpectedValueIsTrue(uIMapK9.k9TrainingEntry.uIActivityTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapK9.k9TrainingEntry.uIAttachmentTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapK9.k9TrainingEntry.uIApprovalTab.isEnabled());
		}

		public void clickActivityTab() {
			uIMapK9.k9TrainingEntry.uIActivityTab.click();
		}

		public void clickAttachmentTab() {
			uIMapK9.k9TrainingEntry.uIAttachmentTab.click();
		}

		public void clickApprovalTab() {
			uIMapK9.k9TrainingEntry.uIApprovalTab.click();
		}

public void closeTheScreen() {
			Playback.driver.close();
		}

		public void verifyAtCategoryColumnInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapK9.k9TrainingEntry.k9TrainingEntryActivityTab.uIActivityTable,
					PoliceData.getK9ModuleValue("Category"));
			verify.ExpectedPropertyValueIsEqual(gridCell.getText(), PoliceData.getK9ModuleValue("Category"));
		}

		public void verifyActivityTabShowsBlueColour() {
			String Blue = "rgba(0, 0, 255, 1)";
			String cssValue = uIMapK9.k9TrainingEntry.uIActivityTab.getCssValue("color");
			verify.ExpectedPropertyValueIsEqual(cssValue, Blue);
		}

		public void verifyUpdateSuccessfulMessageInFooterStatus() {
			String text = uIMapK9.k9TrainingEntry.uIFooterStatus.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1003 - Update Successful");
		}

		public class K9TrainingEntryActivityTab {

			public void clickAddNewActivity() {
				uIMapK9.k9TrainingEntry.k9TrainingEntryActivityTab.uIAddNewActivityButton.click();
			}

			public void clickRowByCategoryInGrid() {
				objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapK9.k9TrainingEntry.k9TrainingEntryActivityTab.uIActivityTable,
						PoliceData.getK9ModuleValue("Category"));
			}

			public void clickFirstRow() {
				objectIdentification.manualIdentify
						.selectGridTableRow(uIMapK9.k9TrainingEntry.k9TrainingEntryActivityTab.uIActivityTable, 0);
			}

		}

		public class K9TrainingEntryAttachmentTab {

		}

		public class K9TrainingEntryApprovalTab {

			public void selectAtNewActionComboBox() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uINewActionComboBox,
						PoliceData.getK9ModuleValue("NewAction"));
			}

			public void tabDateAndTime() {

				uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uIDateEdit.sendKeys(Keys.TAB);
				uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uITimeEdit.sendKeys(Keys.TAB);

			}

			public void tabByField() {
				uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uIByEdit.sendKeys(Keys.TAB);
			}

			public void selectAtDivision() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uIDivisionComboBox,
						PoliceData.getK9ModuleValue("Division"));
			}

			public void selectAtSection() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uISectionComboBox,
						PoliceData.getK9ModuleValue("Section"));
			}

			public void selectAtSquad() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uISquadComboBox,
						PoliceData.getK9ModuleValue("Squad"));
			}

			public void verifyAtHistoryInGrid() {
				Playback.threadWait();
				String Status = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uIHistoryGrid,
								PoliceData.getK9ModuleValue("HistoryStatus"))
						.getText();
				verify.ExpectedValueIsTrue(Status.contains(PoliceData.getK9ModuleValue("HistoryStatus")));

			}

			public void saveScreen() {
				uIMapK9.k9TrainingAid.uISaveButton.click();
				popup.confirm.yes();

			}

			public void selectAtNewActionAsApprove() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uINewActionComboBox, "Approve");

			}

			public void verifyAtHistoryInGridAsApproved() {
				Playback.threadWait();
				String Status = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uIHistoryGrid,
								PoliceData.getK9ModuleValue("HistoryStatus1"))
						.getText();
				verify.ExpectedValueIsTrue(Status.contains("Approved"));

			}

			public void selectActionAsSendForApproval() { // Added by Abi

				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9TrainingEntry.k9TrainingEntryApprovalTab.uINewActionComboBox, "Send for Approval");
				uIMapK9.reportEntry.approvalTab.uINewActionComboBox.sendKeys(Keys.TAB);

			}

		}

		public void switchToApprovalTab() {
			objectIdentification.windowHandle.switchToFrame("Home/frmPnxGlobalApproval");

		}

		public void verifyStatus() {
			verify.ExpectedPropertyValueIsEqual(uIMapK9.k9TrainingEntry.uIStatusLabel.getText(),
					PoliceData.getK9ModuleValue("Status"));

		}

		public void verifyStatusAsApproved() {
			verify.ExpectedPropertyValueIsEqual(uIMapK9.k9TrainingEntry.uIStatusLabel.getText(), "Approved");

		}

		public void verifyImageHeightIsPresent() {
			verify.ExpectedPropertyValueIsNotEqual(PoliceData.getK9ModuleValue("WithoutImgHeight"),
					uIMapK9.k9TrainingEntry.uIK9PersonnelImage.getCssValue("height"));

		}
		public void verifyImageWidthIsPresent() {
			verify.ExpectedPropertyValueIsNotEqual(PoliceData.getK9ModuleValue("WithoutImgWidth"),
					uIMapK9.k9TrainingEntry.uIK9PersonnelImage.getCssValue("width"));

		}

		public void verifyStatusAsSubmitted() {
			verify.ExpectedPropertyValueIsEqual(uIMapK9.k9TrainingEntry.uIStatusLabel.getText(), "Submitted");

		}

		public void verifyStatusBarMessageAsEmpty() { // Added by Abi

			List<WebElement> childs = uIMapK9.reportEntry.uIFooterStatusBar.findElements(By.xpath("./child::*"));

			for (WebElement e : childs) {
				if (e.getTagName().contains("b")) {
					System.out.println(e.getText());
					// verify.ExpectedValueIsFalse(e.isDisplayed());
					Assert.assertNull(e.getText(), "Error");
				} else {
					Assert.assertTrue(true);
				}
			}
//			verify.ExpectedValueIsTrue(
//					uIMapK9.reportEntry.uILeftSideStatusBar.getText().isEmpty());
		}

		public void verify1051UpdatedDataExistsAcknowledge() { // Added by Abi
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
		}
	}

	public class K9TrainingAid {

		public void VerifyRequireEntryMissingAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing Aid No");
			} else
				popup.acknowledge.okWithExpectedMessage("(1018)	Required Entries are Missing Aid No");
		}

		public void clickSave() {
			uIMapK9.k9TrainingAid.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapK9.k9TrainingAid.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveAndCloseScreen() {
			uIMapK9.k9TrainingAid.uISaveAndCloseButton.click();
			// popup.confirm.yes();
		}

		public void enterAtAidNo() {

			uIMapK9.k9TrainingAid.uIAidNoEdit.sendKeys(PoliceData.getK9ModuleValue("AidNo"));
		}

		public void selectAtAidType() {
			uIMapK9.k9TrainingAid.uIAidTypeInput.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapK9.k9TrainingAid.uIAidTypeDropdown, PoliceData.getK9ModuleValue("AidType"));
			uIMapK9.k9TrainingAid.uIAidTypeInput.sendKeys(Keys.TAB);
		}

		 public void clickVehicleInfoIcon()
		 {
			 uIMapK9.k9TrainingAid.uIVehicleInfoIcon.click();
		 }

		public void verifyUpdateSuccessfulMessage() {
			verify.ExpectedPropertyValueIsEqual( uIMapK9.k9TrainingAid.uIUpdateSuccessfulLable.getText(),"1003 - Update Successful" );
		}

		public void selectAtSearch() { 																			// Added by Abi
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9TrainingAid.uISearchDropdown,
					PoliceData.getK9ModuleValue("Search"));
		}

		public void enterAtBurried() { 																			// Added by Abi
			uIMapK9.k9TrainingAid.uIBurriedEdit.sendKeys(PoliceData.getK9ModuleValue("Burried"));
		}

		public void enterAtElevation() { 																		// Added by Abi
			uIMapK9.k9TrainingAid.uIElevationEdit.sendKeys(PoliceData.getK9ModuleValue("Elevation"));
		}

		public void selectAtResult() { 																			// Added by Abi
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9TrainingAid.uIResultDropdown,
					PoliceData.getK9ModuleValue("Result"));
		}

		public void enterAtPlant() { 																			// Added by Abi
			Playback.controlReadyThreadWait();
			uIMapK9.k9TrainingAid.uIPlantEdit.click();
			uIMapK9.k9TrainingAid.uIPlantEdit.sendKeys(PoliceData.getK9ModuleValue("Plant"));
		}

		public void enterAtStart() {																			 // Added by Abi
			Playback.controlReadyThreadWait();
			uIMapK9.k9TrainingAid.uIStartEdit.click();
			uIMapK9.k9TrainingAid.uIStartEdit.sendKeys(PoliceData.getK9ModuleValue("Start"));
		}

		public void enterAtFound() { 																			// Added by Abi
			Playback.controlReadyThreadWait();
			uIMapK9.k9TrainingAid.uIFoundEdit.click();
			uIMapK9.k9TrainingAid.uIFoundEdit.sendKeys(PoliceData.getK9ModuleValue("Found"));
		}

		public void verifyAdditionSuccessfulMsginFooterStatus() { 												// Added by Abi
			String text = uIMapK9.k9TrainingAid.uIFooterStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1002 - Addition Successful");
		}

		public void verifyK9Handler() { 																		// Added by Abi
			verify.ExpectedPropertyValueIsEqual(uIMapK9.k9TrainingAid.uIK9HandlerDropdown.getText(),
					PoliceData.getK9ModuleValue("K9OrHandler"));
		}

		 
	}

	public class K9ActivityEntry {

		public DetailsTab detailsTab;
		public ObjectivesTab objectivesTab;
		public CommentsTab commentsTab;
		public ParticipantsTab participantsTab;
		public TrainingAidsTab trainingAidsTab;

		public K9ActivityEntry() {

			if (detailsTab == null)
				detailsTab = new DetailsTab();

			if (objectivesTab == null)
				objectivesTab = new ObjectivesTab();

			if (commentsTab == null)
				commentsTab = new CommentsTab();

			if (participantsTab == null)
				participantsTab = new ParticipantsTab();

			if (trainingAidsTab == null)
				trainingAidsTab = new TrainingAidsTab();

		}

		public void saveScreen() {
			uIMapK9.k9TrainingEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void saveAndCloseScreen() {
			uIMapK9.k9TrainingEntry.uISaveNCloseButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void switchToActivityEntryDetailsTab() {
			uIMapK9.k9ActivityEntry.uIDetailsTab.click();
			Playback.pageLoadThreadWait();
		}

		public void selectAtTrainingCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapK9.k9ActivityEntry.uIK9TrainingCategoryDropdown,
					PoliceData.getK9ModuleValue("TrainingCategory"));
			uIMapK9.k9ActivityEntry.uIK9TrainingCategoryDropdown.sendKeys(Keys.TAB);
		}

		public void selectAtK9HandlerComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9ActivityEntry.uIK9HandlerComboBox,
					PoliceData.getK9ModuleValue("K9Handler"));
			uIMapK9.k9ActivityEntry.uIK9HandlerComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtK9HandlerComboBox() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapK9.k9ActivityEntry.uIK9HandlerComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem, PoliceData.getK9ModuleValue("K9Handler"));
		}

		public void selectAtTrainingTypeComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9ActivityEntry.uIK9TrainingTypeDropdown,
					PoliceData.getK9ModuleValue("TrainingType"));
			uIMapK9.k9ActivityEntry.uIK9TrainingTypeDropdown.sendKeys(Keys.TAB);
		}

		public void selectAtSubTypeComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9ActivityEntry.uIK9SubTypeDropdown,
					PoliceData.getK9ModuleValue("SubType"));
			uIMapK9.k9ActivityEntry.uIK9SubTypeDropdown.sendKeys(Keys.TAB);
		}

		public void clickDetailsTab() {
			uIMapK9.k9ActivityEntry.uIDetailsTab.click();
		}

		public void clickObjectivesTab() {
			uIMapK9.k9ActivityEntry.uIObjectivesTab.click();
		}

		public void clickCommentsTab() {
			uIMapK9.k9ActivityEntry.uICommentsTab.click();
		}

		public void verifyAdditionSuccessfulMessageInFooterStatus() {
			String text = uIMapK9.k9ActivityEntry.uIFooterStatusLabel.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1002 - Addition Successful");
		}
		
		public void verifyUpdateSuccessfulMessageInFooterStatus() {
			String text = uIMapK9.k9ActivityEntry.uIFooterStatusLabel.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1003 - Update Successful");
		}
		// (10004) The To Date must be later than the From Date

		public void VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(10004) The To Date must be later than the From Date");
			} else
				popup.acknowledge.okWithExpectedMessage("(10004) The To Date must be later than the From Date");
		}

		public void clickSave() {
			uIMapK9.k9ActivityEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
		}

		public void clickTrainingAidsTab() {
			uIMapK9.k9ActivityEntry.uITrainingAidsTab.click();
			Playback.pageLoadThreadWait();
		}

		public void switchToActiviyEntryParticipantsTab() {
			uIMapK9.k9ActivityEntry.uIParticipantsTab.click();
			Playback.pageLoadThreadWait();
		}

		public void clickAllTabs() {
			uIMapK9.k9ActivityEntry.uIDetailsTab.click();
			uIMapK9.k9ActivityEntry.uIObjectivesTab.click();
			uIMapK9.k9ActivityEntry.uICommentsTab.click();
			uIMapK9.k9ActivityEntry.uITrainingAidsTab.click();
			uIMapK9.k9ActivityEntry.uIParticipantsTab.click();
			uIMapK9.k9ActivityEntry.uITrackAndMapTab.click();

		}

		public void closeTheScreen() {
			Playback.driver.close();
		}

		public void saveNClose() {
			uIMapK9.k9TrainingEntry.uISaveNCloseButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public class DetailsTab {

			public void tabStartDateTime() {
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsFromDateEdit.sendKeys(Keys.TAB);
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsFromDateEdit.sendKeys(Keys.TAB);
			}

			public void tabScheduledDateTime() {
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsTabscheduledDateEdit.sendKeys(Keys.TAB);
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsTabscheduledTimeEdit.sendKeys(Keys.TAB);
			}

			public void tabEndDateTime() {
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit.sendKeys(Keys.TAB);
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToTimeEdit.sendKeys(Keys.TAB);
			}

			public void enterEndDateTime() {
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit.click();
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit.clear();
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit.sendKeys(Randomized.getFutureDate(1));
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit.sendKeys(Keys.TAB);
			}

			public void VerifyToDatemustbelaterthantheFromDateAcknowledgeMessage() {
				popup.acknowledge.okWithExpectedMessage("(10004) The To Date must be later than the From Date");
			}																						 

			public void enterEndDateAsFutureDateByNextDate() {
				while (!uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit.getAttribute("value").equals("")) {
					Playback.actionDriver.doubleClick(uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit).build()
							.perform();
					Playback.actionDriver.sendKeys(Keys.BACK_SPACE).build().perform();
				}
				uIMapK9.k9ActivityEntry.detailsTab.uIDetailsToDateEdit.sendKeys(Randomized.getFutureDate(1));
			}

			public void EnterTextInDescribeArea() {
				uIMapK9.k9ActivityEntry.detailsTab.uIDescribeArea.sendKeys("Hello Automation testing");
				}

		}

		public class TrainingAidsTab {

			public void enterHidesVerifiedBy() {
				uIMapK9.k9ActivityEntry.trainingAidsTab.uIHidesVerifyByEdit
						.sendKeys(PoliceData.getK9ModuleValue("HidesVerifiedBy"));
			}

			public void enterFalseAlerts() {
				uIMapK9.k9ActivityEntry.trainingAidsTab.uIFalseAlertsEdit
						.sendKeys(PoliceData.getK9ModuleValue("FalseAlerts"));
			}

			public void clickAddAidButton() {
				uIMapK9.k9ActivityEntry.trainingAidsTab.uIAddAidButton.click();
			}

			public void verifyAtAidNo() {
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("AidNo"),
						objectIdentification.manualIdentify
								.getGridCell(uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable,
										PoliceData.getK9ModuleValue("AidNo"), "Aid#")
								.getText());
			}

			  public void clickRowByAtAidTypeInGrid() {
		            objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable,
		                    PoliceData.getK9ModuleValue("AidType"));
		        }

			  public void verifyAtSearch() { // Added by Abi
					verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Search"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable, "Search", 0));
				}

				public void verifyAtBurried() { // Added by Abi
					verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Burried"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable, "Burried", 0));
				}

				public void verifyAtElevation() { // Added by Abi
					verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Elevation"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable, "Elevation", 0));
				}

				public void verifyAtResult() { // Added by Abi
					verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("ResultCode"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable, "Result", 0));
				}

				public void verifyAtPlant() { // Added by Abi
					verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Plant"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable, "Plant", 0));
				}

				public void verifyAtStart() { // Added by Abi
					verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Start"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable, "Start", 0));
				}

				public void verifyAtFound() { // Added by Abi
					verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("Found"),
							objectIdentification.manualIdentify.getGridCellInnerText(
									uIMapK9.k9ActivityEntry.trainingAidsTab.uITrainingAidTable, "Found", 0));
				}
			  
		}

		public class ParticipantsTab {

			public void clickAgencyRadioButton() {

				uIMapK9.k9ActivityEntry.participantsTab.uIAgencyRadioButton.click();
			}

			public void clickMutualAidTeamMemberRadioButton() {

				uIMapK9.k9ActivityEntry.participantsTab.uIMutualAidTeamMemberRadioButton.click();
			}

			public void enterAtPF() {

				uIMapK9.k9ActivityEntry.participantsTab.uIPFCodeEdit.sendKeys(PoliceData.getK9ModuleValue("PFCode"));
			}

			public void clickAddButton() {

				uIMapK9.k9ActivityEntry.participantsTab.uIAddButton.click();

			}

			public void clickPFSearchIcon() {
				uIMapK9.k9ActivityEntry.participantsTab.uIPFLookupButton.click();

			}

			public void verifyPFIBubbleIsDisplayed() {
				verify.ExpectedValueIsTrue(uIMapK9.k9ActivityEntry.participantsTab.uIPFIBubbleIcon.isDisplayed());

			}

			public void enterAtNameID() {
				uIMapK9.k9ActivityEntry.participantsTab.uINameTypeEdit
						.sendKeys(PoliceData.getK9ModuleValue("NameID").substring(0, 1));
				uIMapK9.k9ActivityEntry.participantsTab.uINameIDEdit
						.sendKeys(PoliceData.getK9ModuleValue("NameID").substring(2));
				uIMapK9.k9ActivityEntry.participantsTab.uINameIDEdit.sendKeys(Keys.TAB);
			}

			public void selectRowByAtIDNoInGrid() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapK9.k9ActivityEntry.participantsTab.uIParticipantsResultTable,
						PoliceData.getK9ModuleValue("PF"));

			}

			public void selectRowByAtNameInGrid() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapK9.k9ActivityEntry.participantsTab.uIParticipantsResultTable,
						PoliceData.getK9ModuleValue("Name"));

			}

			public void verifyDuplicationAcknowledgeMessageFor45() {
				popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");

			}

			public void verifyAddressIBubbleIsDisplayed() {
				verify.ExpectedValueIsTrue(uIMapK9.k9ActivityEntry.participantsTab.uIAddressIBubbleIcon.isDisplayed());

			}

			public void verifyNameIDInGrid() {
				String cellValue = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.k9ActivityEntry.participantsTab.uIParticipantsResultTable, "ID#", 0)
						.getText();
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("NameID"), cellValue);

			}

			public void verifyMutualAidInGrid() {
				String cellValue = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.k9ActivityEntry.participantsTab.uIParticipantsResultTable, "Mutual Aid", 0)
						.getText();
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("MutualAid"), cellValue);

			}

			public void selectAtParticipantsActivity() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapK9.k9ActivityEntry.participantsTab.uIParticipantsActivityComboBox,
						PoliceData.getK9ModuleValue("ParticipantsActivity"));
			}

			public void verifyActivityInGrid() {
				String cellValue = objectIdentification.manualIdentify
						.getGridCell(uIMapK9.k9ActivityEntry.participantsTab.uIParticipantsResultTable, "Activity", 0)
						.getText();
				verify.ExpectedPropertyValueIsEqual(PoliceData.getK9ModuleValue("ParticipantsActivity"), cellValue);

			}


		}

		public class ObjectivesTab {

			public void enterText() {
				uIMapK9.k9ActivityEntry.objectivesTab.uITextArea.sendKeys("Test Automation");
			}
		}

		public class CommentsTab {
			public void enterHandlerCommentsText() {
				uIMapK9.k9ActivityEntry.commentsTab.uIHandlerText.sendKeys("Test Automation");
			}

			public void enterTrainerCommentsText() {
				uIMapK9.k9ActivityEntry.commentsTab.uITrainerText.sendKeys("Test Automation");
			}
		}

		public void switchToActiviyEntryTrainingAidsTab() {
			uIMapK9.k9ActivityEntry.uITrainingAidsTab.click();
			Playback.pageLoadThreadWait();
		}

		public void verify6040UnableToLoadLocationFromCodeAck() {
			popup.confirm.yesWithExpectedMessage("(6040) Unable to load location from CodeID 5073");
			
		}

	}

	public class CPA {

		public void selectAtK9OrHandler() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.cPA.uIK9OrHandlerDropDown,
					PoliceData.getK9ModuleValue("Handler"));
		}

		public void clickSearch() {
			uIMapK9.cPA.uISearchButton.click();
		}

		public void selectRowByAtLocation() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.cPA.uICPAResultTable,
					PoliceData.getK9ModuleValue("Location"));
		}

		public void selectAtK9HandlerInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.cPA.uICPAResultTable,
					PoliceData.getK9ModuleValue("K9Handler"));
			Playback.controlReadyThreadWait();
//        objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Personnel.uISearchResultTable, PoliceData.getK9ModuleValue("K9Handler"), rowIndex);
		}
	}

	public class K9Medical {

		public void selectAtK9OrHandler() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Medical.uIK9OrHandlerDropDown,
					PoliceData.getK9ModuleValue("K9Handler"));
		}

		public void selectAtK9OrHandler1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Medical.uIK9OrHandlerDropDown,
					PoliceData.getK9ModuleValue("K9Handler1"));
		}

		public void selectAtTypeOfVisit() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Medical.uITypeOfVisitDropDown,
					PoliceData.getK9ModuleValue("TypeOfVisit"));
		}

		public void clickSearch() {
			uIMapK9.k9Medical.uISearchButton.click();
		}

		public void clickAddNew() {
			uIMapK9.k9Medical.uIAddNewButton.click();
		}

		public void verifyAtReasonInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapK9.k9Medical.uIK9MedicalResulTable, PoliceData.getK9ModuleValue("Reason"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("Reason")));
		}

		public void verifyAtTypeOfVisitInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapK9.k9Medical.uIK9MedicalResulTable, PoliceData.getK9ModuleValue("TypeOfVisit"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("TypeOfVisit")));
		}

		public void verifyDateAsCurrentDateInGrid() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapK9.k9Medical.uIK9MedicalResulTable, "Date");
			System.out.println(gridTableColumnValues);
			// System.out.println(Randomized.getCurrentDate("mm/dd/yy"));
			// System.out.println(Randomized.getCurrentDate());
			for (String value : gridTableColumnValues) {
				verify.ExpectedValueIsTrue(value.contains(Randomized.getCurrentDate("mm/dd/yy")));
			}
		}

		public void selectRowByAtK9OrHandlerInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Medical.uIK9MedicalResulTable,
					PoliceData.getK9ModuleValue("K9Handler"));

		}

		public void verifyK9HandlerInactive() {
			
			List <String> values = objectIdentification.manualIdentify.getDropDownValues(uIMapK9.k9Medical.uIK9HandlerDropdown);
			for( String val:values)
			{
				if(val.contains(PoliceData.getK9ModuleValue("K9HandlerInactive")))
				verify.ExpectedPropertyValueIsEqual(val ,PoliceData.getK9ModuleValue("K9HandlerInactive"));
			}
		
				
			}
		
		public void verifyAtK9HandlerInactive() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapK9.k9Medical.uIK9HandlerDropdown).contains("##"+PoliceData.getK9ModuleValue("K9Handler")));
				
			}
	}

	public class MedicalVisitEntry {

		public DetailsTab detailsTab;

		public MedicalVisitEntry() {

			if (this.detailsTab == null)
				this.detailsTab = new DetailsTab();

		}

		public void selectAtK9OrHandler() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.medicalVisitEntry.uIK9OrHandlerDropDown,
					PoliceData.getK9ModuleValue("Handler"));
		}

		public void selectAtTypeOfVisit() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.medicalVisitEntry.uITypeOfVisitDropDown,
					PoliceData.getK9ModuleValue("TypeOfVisit"));
		}

		public void enterAtReasonForVisit() {
			uIMapK9.medicalVisitEntry.uIReasonForVisitEdit.sendKeys(PoliceData.getK9ModuleValue("ReasonForVisit"));
		}
		public void verifyImageHeightIsPresent() {
			verify.ExpectedPropertyValueIsNotEqual(PoliceData.getK9ModuleValue("WithoutImgHeight"),
					uIMapK9.medicalVisitEntry.uIK9PersonnelImage.getCssValue("height"));

		}
		public void verifyImageWidthIsPresent() {
			verify.ExpectedPropertyValueIsNotEqual(PoliceData.getK9ModuleValue("WithoutImgWidth"),
					uIMapK9.medicalVisitEntry.uIK9PersonnelImage.getCssValue("width"));

		}

		public void verifyDateOfVisitAsCurrentDate() {
			String attribute = uIMapK9.medicalVisitEntry.uIDateOfVisitEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
		}

		public void switchToDetailsTab() {
			uIMapK9.medicalVisitEntry.uIDetailsTab.click();
		}

		public void save() {
			uIMapK9.medicalVisitEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapK9.medicalVisitEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public class DetailsTab {

			public void enterAtVeterinarianNameID() {
				uIMapK9.medicalVisitEntry.detailsTab.uINameTypeEdit
						.sendKeys(PoliceData.getK9ModuleValue("NameID").substring(0, 1));
				uIMapK9.medicalVisitEntry.detailsTab.uINameIDEdit
						.sendKeys(PoliceData.getK9ModuleValue("NameID").substring(2));
				uIMapK9.medicalVisitEntry.detailsTab.uINameIDEdit.sendKeys(Keys.TAB);
			}

			public void enterAtVeterinarianLastName() {
				uIMapK9.medicalVisitEntry.detailsTab.uILastNameEdit.sendKeys(PoliceData.getK9ModuleValue("LastName"));
				uIMapK9.medicalVisitEntry.detailsTab.uILastNameEdit.sendKeys(Keys.TAB);

			}

			public void enterAtVeterinarianFirstName() {
				uIMapK9.medicalVisitEntry.detailsTab.uIFirstNameEdit.sendKeys(PoliceData.getK9ModuleValue("FirstName"));
				uIMapK9.medicalVisitEntry.detailsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			}

			public void verifyAtLastName() {
				String attribute = uIMapK9.medicalVisitEntry.detailsTab.uILastNameEdit.getAttribute("value");
				verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getK9ModuleValue("LastName")));
			}

			public void verifyAtFirstName() {
				String attribute = uIMapK9.medicalVisitEntry.detailsTab.uIFirstNameEdit.getAttribute("value");
				verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getK9ModuleValue("FirstName")));
			}

			public void verifyVeterinarianIBubbleIsDisplayed() {
				verify.ExpectedValueIsTrue(uIMapK9.medicalVisitEntry.detailsTab.uIVeterinarianIBubble.isDisplayed());
			}

			public void verifyVeterinarianLastnameIsDisabled() {
				String attribute = uIMapK9.medicalVisitEntry.detailsTab.uILastNameEdit.getAttribute("class");
				verify.ExpectedValueIsTrue(attribute.contains("textboxInactive"));
			}

			public void verifyVeterinarianFirstnameIsDisabled() {
				String attribute = uIMapK9.medicalVisitEntry.detailsTab.uIFirstNameEdit.getAttribute("class");
				verify.ExpectedValueIsTrue(attribute.contains("textboxInactive"));
			}
		}

		public void verifyAtK9OrHandler() {

			String attribute = uIMapK9.medicalVisitEntry.uIK9OrHandlerDropDown.getAttribute("value");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getK9ModuleValue("K9OrHandler")));
		}

		public void verifyDateOfVisitIsDisabled() {
			String attribute = uIMapK9.medicalVisitEntry.uIDateOfVisitEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
		}

		public List<String> getK9HandlerDropdownOptions(){
			
			List<String> count =objectIdentification.manualIdentify.getDropDownValues(uIMapK9.medicalVisitEntry.uIK9HandlerDropdown);	
			return count;
		}
		 public void verifyTheCountsofDropDown(int a , int b)
			{
				verify.ExpectedIntergerValueIsNotEqualToActual(b, a);
			}
			public void verifyTheCountsofDropDown(List<String> a , List<String> b)
			{
				verify.ExpectedValueIsFalse(a.equals(b));  
			}
			public void verifyReportStatusAsOnHold() {
				
				
				verify.ExpectedPropertyValueIsEqual("On Hold", uIMapK9.reportEntry.uIreportStatus.getText());
				
			}
		public void verifyReportStatusAsSubmitted() {
				
				
				verify.ExpectedPropertyValueIsEqual("Submitted", uIMapK9.reportEntry.uIreportStatus.getText());
				
			}
		public void verifyReportStatusAsApproved() {
			
			
			verify.ExpectedPropertyValueIsEqual("Approved", uIMapK9.reportEntry.uIreportStatus.getText());
		}
		public void clickDeleteIcon() {
			uIMapK9.reportEntry.uIDeleteIcon.click();
			
		}

		public void verifyDoyouWantToDeleteConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			
		}
		public void verifyDoyouSaveConfirmPopup() {
			popup.confirm.yesWithExpectedMessage("(3)Do You Want To Save All Of The Entered Details?");
			
		}

		public void close()
	    {
	       uIMapK9.medicalVisitEntry.driver.close();
	    }

		public void verifyK9HandlerInactive() {
		verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapK9.medicalVisitEntry.uIK9HandlerDropdown).contains("##"));
			
		}
		
		public void verifyAtK9HandlerInactive() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapK9.medicalVisitEntry.uIK9HandlerDropdown).contains("##"+PoliceData.getK9ModuleValue("K9Handler")));
				
			}

		public void verifyAtK9HandlerValueNotFound() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapK9.medicalVisitEntry.uIK9HandlerDropdown).contains(PoliceData.getK9ModuleValue("K9Handler")));
			
		}
	}

	public class K9Team {

		public void clickAddNew() {
			uIMapK9.k9Team.uIAddNewButton.click();

		}

		public void clickSearch() {
			uIMapK9.k9Team.uISearchButton.click();
		}

		public void selectAtK9Name() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9Team.uIK9NameDropDown,
					PoliceData.getK9ModuleValue("K9Name"));
		}

		public void enterAtOfficerOrHandler() {
			uIMapK9.k9Team.uIOfficerOrHandlerEdit.sendKeys(PoliceData.getK9ModuleValue("Officer"));
			uIMapK9.k9Team.uIOfficerOrHandlerEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtK9NameInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapK9.k9Team.uIK9TeamResultTable, PoliceData.getK9ModuleValue("K9Name"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("K9Name")));
		}

		public void verifyAtHandlerInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapK9.k9Team.uIK9TeamResultTable, PoliceData.getK9ModuleValue("Handler"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("Handler")));
		}

		public void selectRowByAtHandler() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Team.uIK9TeamResultTable,
					PoliceData.getK9ModuleValue("Handler"));
		}

		public void clickInactiveCheckBox() {
			uIMapK9.k9Team.uIInactiveCheckBox.click();
		}

		public void verifyRowAsGrayColor(int rowIndex) {
			String gray = objectIdentification.manualIdentify
					.getGridCell(uIMapK9.k9Team.uIK9TeamResultTable, "K9 Name", rowIndex).getCssValue("color");
			System.out.println(gray);
			verify.ExpectedValueIsTrue(gray.contains("rgba(128, 128, 128, 1)"));

		}

	}

	public class K9TeamEntry {

		public void selectAtK9Name() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapK9.k9TeamEntry.uIK9NameDropDown,
					PoliceData.getK9ModuleValue("K9Name"));
		}

		public void enterAtOfficerOrHandler() {
			uIMapK9.k9TeamEntry.uIOfficerOrHandlerEdit.sendKeys(PoliceData.getK9ModuleValue("Officer"));
			uIMapK9.k9TeamEntry.uIOfficerOrHandlerEdit.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapK9.k9TeamEntry.uIAddButton.click();
		}

		public void save() {
			uIMapK9.k9TeamEntry.uISaveButton.click();
			// popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapK9.k9TeamEntry.uISaveNCloseButton.click();
			// popup.confirm.yes();
		}

		public void enterEffectiveFromAsCurrentDate() {
			uIMapK9.k9TeamEntry.uIEffectiveFromEdit.sendKeys(Randomized.getCurrentDate());
			uIMapK9.k9TeamEntry.uIEffectiveFromEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtHandlerInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapK9.k9TeamEntry.uIK9TeamEntryResultTable, PoliceData.getK9ModuleValue("Handler"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(PoliceData.getK9ModuleValue("Handler")));
		}

		public void selectRowByAtHandler() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapK9.k9TeamEntry.uIK9TeamEntryResultTable, PoliceData.getK9ModuleValue("Handler"));
		}

		public void clickInactiveCheckBox() {
			uIMapK9.k9TeamEntry.uIInactiveCheckBox.click();
		}

		public void verifyNoRecordsFoundAcknowledgeMessage() {
			popup.switchToAcknowledge();
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void verifyAtInactiveHandlerInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapK9.k9TeamEntry.uIK9TeamEntryResultTable, PoliceData.getK9ModuleValue("Handler"));
			System.out.println(gridRowByCellInnerText.getCssValue("color").toString());
			verify.ExpectedValueIsTrue(gridRowByCellInnerText.getCssValue("color")
					.contains(PoliceData.getK9ModuleValue("rgba(128, 128, 128, 1)")));
		}

		public void ClickUpdateButton(){
			uIMapK9.k9TeamEntry.uIUpdateButton.click();
		}

	}

	public class K9Reports {
		public void verifyAtCaseNoInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapK9.k9Reports.uIK9ReportSearchTable, PoliceData.getK9ModuleValue("CaseNo"));
			verify.ExpectedValueIsTrue(gridCell.getText().contains(PoliceData.getK9ModuleValue("CaseNo")));
		}

		public void close() {
			Playback.driver.close();
		}

	public void clickAtCaseNoInGrid() {																				// added by Abi
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapK9.k9Reports.uIK9ReportSearchTable, PoliceData.getK9ModuleValue("CaseNo"));
		}

		public void verifyAtApprovalStatusInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapK9.k9Reports.uIK9ReportSearchTable, PoliceData.getK9ModuleValue("ApprovalStatus"));
			verify.ExpectedValueIsTrue(gridCell.getText().contains(PoliceData.getK9ModuleValue("ApprovalStatus")));
		}

	}

}