package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import dataAccess.BaseData;
import uIMaps.UIMapPersonnel;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Personnel {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapPersonnel uIMapPersonnel = new UIMapPersonnel();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();

	public PersonnelSearch personnelSearch;
	public PersonnelEntry personnelEntry;
	public PerformanceReview performanceReview;
	public PerformanceReviewEntry performanceReviewEntry;
	public AssignmentHistoryScreen assignmentHistoryScreen;
	public PersonnelLockDetailsScreen personnelLockDetailsScreen;
	public PersonnelBatchUpdate personnelBatchUpdate;
	public BatchUpdateEntry batchUpdateEntry;
	public WorkHistorySearch workHistorySearch;
	public InjuryRptSearch injuryRptSearch;
	public MedHistorySearch medHistorySearch;
	public AllowanceCode allowanceCode;
	public AllowanceCodeEntry allowanceCodeEntry;
	public WorkHistoryEntry workHistoryEntry;
	public SupervisorSearch supervisorSearch;
	public InjuryReportEntry injuryReportEntry;
	public MedicalHistoryEntry medicalHistoryEntry;

	public Personnel() {
		if (personnelSearch == null)
			personnelSearch = new PersonnelSearch();
		if (personnelEntry == null)
			personnelEntry = new PersonnelEntry();
		if (performanceReview == null)
			performanceReview = new PerformanceReview();
		if (performanceReviewEntry == null)
			performanceReviewEntry = new PerformanceReviewEntry();
		if (assignmentHistoryScreen == null)
			assignmentHistoryScreen = new AssignmentHistoryScreen();
		if (personnelLockDetailsScreen == null)
			personnelLockDetailsScreen = new PersonnelLockDetailsScreen();
		if (personnelBatchUpdate == null)
			personnelBatchUpdate = new PersonnelBatchUpdate();
		if (batchUpdateEntry == null)
			batchUpdateEntry = new BatchUpdateEntry();
		if (workHistorySearch == null)
			workHistorySearch = new WorkHistorySearch();
		if (injuryRptSearch == null)
			injuryRptSearch = new InjuryRptSearch();
		if (medHistorySearch == null)
			medHistorySearch = new MedHistorySearch();
		if (allowanceCode == null)
			allowanceCode = new AllowanceCode();
		if (allowanceCodeEntry == null)
			allowanceCodeEntry = new AllowanceCodeEntry();
		if (workHistoryEntry == null)
			workHistoryEntry = new WorkHistoryEntry();
		if (supervisorSearch == null)
			supervisorSearch = new SupervisorSearch();
		if (injuryReportEntry == null)
			injuryReportEntry = new InjuryReportEntry();
		if (medicalHistoryEntry == null)
			medicalHistoryEntry = new MedicalHistoryEntry();
	}

	public void switchToPersonnelSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmPersonnelSrch");
	}

	public void switchToPersonnelEntry() {
		objectIdentification.windowHandle.switchToWindow("Personnel Entry");
	}

	public void switchToPersonnelEntryURL() {
		objectIdentification.windowHandle.switchToWindowUsingURL("PFID=100010000462127");
	}

	public void switchToPerformanceReview() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Personnel/frmEvaluationSrch");
	}

	public void switchToPerformanceReviewEntry() {
		objectIdentification.windowHandle.switchToWindow("Performance Review Entry");
	}

	public void switchToAssignmentHistoryScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmAssignmentHistory");
	}

	public void switchToPersonnelLockDetailsScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPersonnelLockDetails");
	}

	public void switchToBatchUpdateSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Personnel/frmBatchUpdateSrch");
	}

	public void switchToBatchUpdateEntry() {
		objectIdentification.windowHandle.switchToWindow("Batch Update");
	}

	public void switchToInjuryRptSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Personnel/frmInjurySrch");
	}

	public void switchToMedHistorySearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Personnel/frmMedicalHistSrch");
	}

	public void switchToWorkHistorySearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Personnel/frmPersonnelcmtSrch");
	}

	public void switchToAllowanceCode() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("FRPersonnel/frmPFAllowCodeSrch");
	}

	public void switchToAllowanceCodeEntry() {
		objectIdentification.windowHandle.switchToWindow("Allowance Code Entry");
	}

	public void switchToWorkHistoryEntry() {
		objectIdentification.windowHandle.switchToWindow("Work History Entry");
	}

	public void switchToUserParamScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPersonnel.aspx?hdnType=UserParam&hdnMode=CHG");
	}

	public void switchToSupervisorSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Setup/frmPersonnelSrch");
	}

	public void switchToInjuryReportEntry() {
		objectIdentification.windowHandle.switchToWindow("Injury Rpt Entry");
	}

	public void switchToMedicalHistoryEntry() {
		objectIdentification.windowHandle.switchToWindow("Medical History Entry");
	}

	public class PersonnelSearch {

		public void selectSubAgnecyDropdown() {
			uIMapPersonnel.personnelSearch.uIPFSubAgency.sendKeys(BaseData.getPersonnelModuleValue("SubAgency"));
		}

		public void enterAtPF() {
			uIMapPersonnel.personnelSearch.uIPFCodeEdit.sendKeys(BaseData.getPersonnelModuleValue("PFCode"));
			uIMapPersonnel.personnelSearch.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPFNo() {
			uIMapPersonnel.personnelSearch.uIPFCodeEdit.sendKeys(BaseData.getPersonnelModuleValue("PFNo"));
			uIMapPersonnel.personnelSearch.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapPersonnel.personnelSearch.uISearchButton.click();
		}

		public void clickAddNewButton() {
			uIMapPersonnel.personnelSearch.uIAddNewButton.click();
		}

		public void verifyActiveDivision(List<String> columnValues) {
			List<String> dropdownList = objectIdentification.manualIdentify
					.getDropDownValues(uIMapPersonnel.personnelSearch.uIDivisionComboBox);
			verify.ExpectedListValueIsTrue(columnValues, dropdownList);
		}

		public void clickResetButton() {
			uIMapPersonnel.personnelSearch.uIResetButton.click();
		}

		public void clickRefreshButton() {
			uIMapPersonnel.personnelSearch.uIRefreshButton.click();
			Playback.pageLoadThreadWait();
		}

		public void enterAtLoginUserName() {
			uIMapPersonnel.personnelSearch.uILoginUserNameEdit
					.sendKeys(BaseData.getPersonnelModuleValue("LoginUserName"));
		}

		public void selectAsDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.personnelSearch.uIDivisionComboBox,
					"Administration");
		}

		public void selectAsSection() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.personnelSearch.uISectionComboBox,
					"Community Support");
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.personnelSearch.uIDivisionComboBox,
					BaseData.getPersonnelModuleValue("Division"));
		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.personnelSearch.uIJurisComboBox,
					BaseData.getPersonnelModuleValue("Juris"));
		}

		public void selectJurisAsProphoenix() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.personnelSearch.uIJurisComboBox,
					"PX - ProPhoenix");
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.personnelSearch.uISectionComboBox,
					BaseData.getPersonnelModuleValue("Section"));
		}

		public void verifyAtPFCodeInGrid(int rowIndex) {
			String PFCode = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapPersonnel.personnelSearch.uIPersonnelResultTable, "PF Code", rowIndex);
			verify.ExpectedValueIsTrue(PFCode.contains(BaseData.getPersonnelModuleValue("PFCode")));

		}

		public void verifyAtPFNameInGrid(int rowIndex) {
			String PFCode = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapPersonnel.personnelSearch.uIPersonnelResultTable, "PF Name", rowIndex);
			verify.ExpectedValueIsTrue(PFCode.contains(BaseData.getPersonnelModuleValue("PFName")));

		}

		public void selectRowAtPFCode() {
			Playback.threadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.personnelSearch.uIPersonnelResultTable, BaseData.getPersonnelModuleValue("PFCode"));
		}

		public void selectRowByPFCodeAsAUTO() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPersonnel.personnelSearch.uIPersonnelResultTable, "AUTO");
		}

		public void selectRowAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.personnelSearch.uIPersonnelResultTable, BaseData.getPersonnelModuleValue("Name"));
		}

		public void clickFireCheckBox() {
			uIMapPersonnel.personnelSearch.uIFireCheckBox.click();
		}

		public void clickGroupTextView() {
			uIMapPersonnel.personnelSearch.uIGroupTextView.click();
		}

		public void clickDivisionTextView() {
			uIMapPersonnel.personnelSearch.uIDivisionTextView.click();
		}

		public void clickTeamTextView() {
			uIMapPersonnel.personnelSearch.uITeamTextView.click();
		}

		public void clickSquadTextView() {
			uIMapPersonnel.personnelSearch.uISquadTextView.click();
		}

		public void clickSectionTextView() {
			uIMapPersonnel.personnelSearch.uISectionTextView.click();
		}

		public void verifyAtSection(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Section"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelSearch.uIPersonnelResultTable, "Sections", rowIndex));
		}

		public void verifyNextIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelSearch.uINextIcon.isDisplayed());
		}

		public void verifyAtDivision(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Division"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelSearch.uIPersonnelResultTable, "Division", rowIndex));
		}

		public void verifyAtBadge(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Badge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelSearch.uIPersonnelResultTable, "Badge", rowIndex));
		}

		public void verifyAtTitleRank(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("TitleRank"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelSearch.uIPersonnelResultTable, "Title", rowIndex));
		}

		public void verifyMJRolesDisabled() {
			verify.ExpectedValueIsFalse(uIMapPersonnel.personnelSearch.uIMJRolesButton.isEnabled());
		}

		public void verifyMJRolesDisabledinRightClick() {
			WebElement MJRoles = objectIdentification.manualIdentify.getContextMenuItemInTheGridRow(
					uIMapPersonnel.personnelSearch.uIPersonnelResultTable, BaseData.getPersonnelModuleValue("PFCode"),
					"MJ Roles");
			verify.ExpectedValueIsTrue(MJRoles.getAttribute("unselectable").toString().contains("on"));
		}

		public void verifyAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
			Playback.controlReadyThreadWait();
		}

		public void verifyAsSection() {
			verify.ExpectedPropertyValueIsEqual("Community Support", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapPersonnel.personnelSearch.uISectionComboBox));

		}

		public void verifyAsDivision() {
			verify.ExpectedPropertyValueIsEqual("Administration", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapPersonnel.personnelSearch.uIDivisionComboBox));
		}

		public void verifySectionFieldHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelSearch.uISectionComboBox.getAttribute("disabled")));
		}

		public void verifySquadHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelSearch.uISquadComboBox.getAttribute("disabled")));
		}

		public void verifyTeamHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelSearch.uITeamComboBox.getAttribute("disabled")));
		}

		public void verifyGroupHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelSearch.uIGroupComboBox.getAttribute("disabled")));
		}

		public void verifyDivisionHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelSearch.uIDivisionComboBox.getAttribute("disabled")));
		}

		public void clickPrintButton() {
			uIMapPersonnel.personnelSearch.uIPrintIconButton.click();
		}

		public void selectRowAtPFName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.personnelSearch.uIPersonnelResultTable, BaseData.getPersonnelModuleValue("PFName"));
		}

		public void clickPFInfoIcon() {
			uIMapPersonnel.personnelSearch.uIPFInfoIcon.click();
			Playback.pageLoadThreadWait();
		}

		public void clickLockedCheckBox() {
			uIMapPersonnel.personnelSearch.uIIsLockedCheckBox.click();
		}

		public void enterAtSupervisorPFCode() {
			uIMapPersonnel.personnelSearch.uISupervisorPFCodeEdit
					.sendKeys(BaseData.getPersonnelModuleValue("SupervisorPF"));
			uIMapPersonnel.personnelSearch.uISupervisorPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtSupervisorWithInActive() {
			verify.ExpectedPropertyValueIsEqual("##" + BaseData.getPersonnelModuleValue("Supervisor"),
					uIMapPersonnel.personnelSearch.uISupervisorPFDesEdit.getAttribute("value"));
		}

		public void enterAtSupervisorPFCode1() {
			uIMapPersonnel.personnelSearch.uISupervisorPFCodeEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapPersonnel.personnelSearch.uISupervisorPFCodeEdit
					.sendKeys(BaseData.getPersonnelModuleValue("SupervisorPF1"));
			uIMapPersonnel.personnelSearch.uISupervisorPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtSupervisor1WithActive() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Supervisor1"),
					uIMapPersonnel.personnelSearch.uISupervisorPFDesEdit.getAttribute("value"));
		}

		public void verifyPFValidateInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelSearch.uIPFInfoIcon.isDisplayed());
		}

		public void verifyNoRecordFoundAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
			Playback.controlReadyThreadWait();
		}

		public void selectRowInGrid(int rowIndex) {
			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapPersonnel.personnelSearch.uIPersonnelResultTable, rowIndex);
		}

		public void verifyFromHiredDateIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelSearch.uIHiredDateFromEdit.isDisplayed());

		}

		public void verifyToHiredDateIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelSearch.uIHiredDateToEdit.isDisplayed());

		}

		public void enterAtFromHiredDate() {
			uIMapPersonnel.personnelSearch.uIHiredDateFromEdit
					.sendKeys(BaseData.getPersonnelModuleValue("FromHiredDate"));
			uIMapPersonnel.personnelSearch.uIHiredDateFromEdit.sendKeys(Keys.TAB);
		}

		public void enterToHiredDateAsCurrentDate() {
			uIMapPersonnel.personnelSearch.uIHiredDateToEdit.sendKeys(Randomized.getCurrentDate());
			uIMapPersonnel.personnelSearch.uIHiredDateToEdit.sendKeys(Keys.TAB);

		}

		public void verifyAtPFNameInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapPersonnel.personnelSearch.uIPersonnelResultTable, BaseData.getPersonnelModuleValue("PFName"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getPersonnelModuleValue("PFName")));
		}

	}

	public class PersonnelEntry {
		public void clickAssignmentTab() {
			uIMapPersonnel.personnelEntry.uIAssignmentTab.click();
		}

		public void switchToWorkRecordTab() {
			uIMapPersonnel.personnelEntry.uIWorkRecordTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPersonnelWorkRecord");
		}

		public void switchToEmergencyDataTab() {
			uIMapPersonnel.personnelEntry.uIEmergencyDataTab.click();
		}

		public void switchToAttachmentTab() {
			uIMapPersonnel.personnelEntry.uIAttachmentTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void switchToTrainingTab() {
			uIMapPersonnel.personnelEntry.uITrainingTab.click();
			Playback.threadWait();
			Playback.threadWait();
		}

		public void verifyTimeTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uITimeTab.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uITimeTab.isEnabled());
		}

		public void verifySubAgencyDropdownEnabled() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uISubAgencyDropdown.isEnabled());
		}

		public void selectAtSubAgency() {
			uIMapPersonnel.personnelEntry.uISubAgencyDropdown.sendKeys(BaseData.getPersonnelModuleValue("SubAgency"));
		}

		public void verifySubAgency(String LoggedinSubAgnecy) {
			LoggedinSubAgnecy = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapPersonnel.personnelEntry.uISubAgencyDropdown);

			// Console.WriteLine("Logged In SubAgnecy: ",
			// objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapPersonnel.personnelEntry.uISubAgencyDropdown.getAttribute("value")));
			Playback.setTestContextAttribute("LoggedinSubAgnecy", LoggedinSubAgnecy);
		}

		public void save() {
			uIMapPersonnel.personnelEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapPersonnel.personnelEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapPersonnel.personnelEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void close() {
			uIMapPersonnel.personnelEntry.driver.close();
		}

		public void enterAtPFCode() {
			uIMapPersonnel.personnelEntry.uIPFCodeEdit.sendKeys(BaseData.getPersonnelModuleValue("PFCode"));
			uIMapPersonnel.personnelEntry.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtLastName() {
			uIMapPersonnel.personnelEntry.uILastNameEdit.sendKeys(BaseData.getPersonnelModuleValue("LastName"));
			uIMapPersonnel.personnelEntry.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapPersonnel.personnelEntry.uIFirstNameEdit.sendKeys(BaseData.getPersonnelModuleValue("FirstName"));
			uIMapPersonnel.personnelEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void clickLockedInfoIcon() {
			uIMapPersonnel.personnelEntry.uILockedInfoButton.click();
		}

		public void clickRefreshIcon() {
			uIMapPersonnel.personnelEntry.uIRefreshIcon.click();
		}

		public void clickPrintIcon() {
			uIMapPersonnel.personnelEntry.uIPrintIcon.click();
		}

		public void clickMainTab() {
			uIMapPersonnel.personnelEntry.uIMainTab.click();
		}

		public void verifyLockedbuttonDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uILockedButton.isDisplayed());
		}

		public void verifyLockedCheckBoxChecked() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uILockedCheckBox.isSelected());
		}

		public void verifyALCAndCustomIconDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.uISaveButton.getAttribute("class").contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uISaveAndCloseButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uISaveAndNewButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.uIALCButton.getAttribute("class").contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.uICustomizeButton.getAttribute("unselectable").contains("on"));

		}

		public void verifyAtPFCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PFCode"),
					uIMapPersonnel.personnelEntry.uIPFCodeEdit.getAttribute("value"));
		}

		public void switchToPreferenceTab() {
			uIMapPersonnel.personnelEntry.uIPreferencesTab.click();
		}

		public void switchToSecurityTab() {
			uIMapPersonnel.personnelEntry.uISecurityTab.click();
		}

		public void switchToTimeTab() {
			uIMapPersonnel.personnelEntry.uITimeTab.click();
			objectIdentification.windowHandle.switchToFrame("frmPFTimeReport");
		}

		public void verifyRequiredAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyUpdateSuccessfulMessage() {
			Playback.popupThreadWait();
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update Successful"));
		}

		public void clickALCIcon() {
			uIMapPersonnel.personnelEntry.uIALCIconButton.click();
		}

		public void clickPictureNotAvailable() {
			uIMapPersonnel.personnelEntry.uIPictureNotAvailable.click();
		}

		public void switchToAllowanceTab() {
			uIMapPersonnel.personnelEntry.uIAllowanceTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmAllowance");
		}

		public void verifyUpadteAllowanceTabAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Allowance Tab. You must save or reset.");
		}

		public void verifyEmailExistsAcknowledgemessage() {
			popup.acknowledge.okWithExpectedMessage("(1779) Email ID already exists");
		}

		public void clickLockedCheckbox() {
			uIMapPersonnel.personnelEntry.uILockedCheckBox.click();
		}

		public void verifyPFCodeExistAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1027) PF Code Exist");
		}

		public void verifyConfirmationReusePFCodeMessage() {
			Playback.controlReadyThreadWait();
			popup.confirm.yesWithExpectedMessage("(1782) Do you want to reuse the inactive PF Code?");
		}

		public void clickInactiveCheckBox() {
			uIMapPersonnel.personnelEntry.uIInactiveCheckBox.click();
		}

		public void verifyPFValidateInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelSearch.uIPFInfoIcon.isDisplayed());
		}

		public void verifyNoRecordFoundAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
			Playback.controlReadyThreadWait();
		}

		public void verifyAtPhone1() {
			String text = uIMapPersonnel.personnelEntry.uIPhone1Dropdown.getText();
			verify.ExpectedValueIsTrue(text.contains(BaseData.getPersonnelModuleValue("PhoneType")));
		}

		public void enterAtPFCode1() {
			uIMapPersonnel.personnelEntry.uIPFCodeEdit.sendKeys(BaseData.getPersonnelModuleValue("PFCode1"));
			uIMapPersonnel.personnelEntry.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAdditionSuccessfulAcknowledgeMessage() {
			String text = uIMapPersonnel.personnelEntry.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1002 - Addition successful");
		}

		public void switchToInventoryTab() {
			uIMapPersonnel.personnelEntry.uIInventoryTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPersonnelInv.aspx");

		}

		public PersonnelEntry() {

			if ((this.personnelEntryAssignmentTab == null)) {
				this.personnelEntryAssignmentTab = new PersonnelEntryAssignmentTab();
			}

			if ((this.personnelEntryMainTab == null)) {
				this.personnelEntryMainTab = new PersonnelEntryMainTab();
			}

			if ((this.personnelEntryWorkRecordTab == null)) {
				this.personnelEntryWorkRecordTab = new PersonnelEntryWorkRecordTab();
			}

			if ((this.personnelEntryPreferencesTab == null)) {
				this.personnelEntryPreferencesTab = new PersonnelEntryPreferencesTab();
			}

			if ((this.personnelEntrySecurityTab == null)) {
				this.personnelEntrySecurityTab = new PersonnelEntrySecurityTab();
			}

			if ((this.personnelEntryTimeTab == null)) {
				this.personnelEntryTimeTab = new PersonnelEntryTimeTab();
			}

			if ((this.personnelEntryTrainingTab == null)) {
				this.personnelEntryTrainingTab = new PersonnelEntryTrainingTab();
			}

			if ((this.personnelEntryAllowanceTab == null)) {

				this.personnelEntryAllowanceTab = new PersonnelEntryAllowanceTab();

			}
			if ((this.personnelEntryInventoryTab == null)) {

				this.personnelEntryInventoryTab = new PersonnelEntryInventoryTab();

			}
			if ((this.personnelEntryEmergencyDataTab == null)) {

				this.personnelEntryEmergencyDataTab = new PersonnelEntryEmergencyDataTab();
			}
		}

		public PersonnelEntryAssignmentTab personnelEntryAssignmentTab;
		public PersonnelEntryMainTab personnelEntryMainTab;
		public PersonnelEntryWorkRecordTab personnelEntryWorkRecordTab;
		public PersonnelEntryPreferencesTab personnelEntryPreferencesTab;
		public PersonnelEntrySecurityTab personnelEntrySecurityTab;
		public PersonnelEntryTimeTab personnelEntryTimeTab;
		public PersonnelEntryTrainingTab personnelEntryTrainingTab;
		public PersonnelEntryAllowanceTab personnelEntryAllowanceTab;
		public PersonnelEntryInventoryTab personnelEntryInventoryTab;
		public PersonnelEntryEmergencyDataTab personnelEntryEmergencyDataTab;

		public void verifyBottomStatusMessage() { // changed from PersonnelEntryMainTab class to PersonalEntry class
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapPersonnel.personnelEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void verifyInactiveCodeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1119) Warning – Inactive code selected");
			Playback.controlReadyThreadWait();
		}

	}

	public class PersonnelEntryMainTab {

		public void clickCustom1TextView() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom1TextView.click();
		}

		public void clickCustom2TextView() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom2TextView.click();
		}

		public void clickCustom3TextView() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom3TextView.click();
		}

		public void clickCustom4TextView() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom4TextView.click();
		}

		public void verifyCustom4FieldHide() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom4EditText
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCustom3FieldHide() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom3EditText
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCustom2FieldHide() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom2EditText
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCustom1FieldHide() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom1EditText
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyCustom1AsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom1TextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifyCustom2AsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom2TextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifyCustom3AsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom3TextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifyCustom4AsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uICustom4TextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void selectEMail1() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1ComboBox);
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1ComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtEmail1() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1EditText.click();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1EditText.clear();
			Playback.controlReadyThreadWait();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1EditText.click();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1EditText
					.sendKeys(BaseData.getPersonnelModuleValue("Email1"));
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1EditText.sendKeys(Keys.TAB);
		}

		public void enterEmail1Asrajas() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIEmail1EditText.sendKeys("rajas@prophoenix.com");
		}

		public void enterAtHiredDate() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIHireDateEditText
					.sendKeys(BaseData.getPersonnelModuleValue("HiredDate"));
		}

		public void verifyServiceYearsDisabled() {
			verify.ExpectedPropertyValueIsEqual("textboxInactive",
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIServiceYearEditText.getAttribute("class"));
			verify.ExpectedPropertyValueIsEqual("textboxInactive",
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIServiceMonthsEditText.getAttribute("class"));
			verify.ExpectedPropertyValueIsEqual("textboxInactive",
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIServiceDaysEditText.getAttribute("class"));
		}

		public void verifyAdditionalYearsEnabled() {
			verify.ExpectedPropertyValueIsEqual("textbox",
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIAdditionalYearsEditText
							.getAttribute("class"));
			verify.ExpectedPropertyValueIsEqual("textbox",
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIAdditionalMonthsEditText
							.getAttribute("class"));
			verify.ExpectedPropertyValueIsEqual("textbox",
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIAdditionalDateEditText.getAttribute("class"));
		}

		public void enterAdditionalYearsAs4() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIAdditionalYearsEditText.sendKeys("4");
		}

		public void enterAdditionalMonthsAs3() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIAdditionalMonthsEditText.sendKeys("3");
		}

		public void enterAdditionalDateAs25() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIAdditionalDateEditText.sendKeys("25");
		}

		public void enterHiredDateAsPreviousYear() {
			System.out.println(Randomized.getPreviousYearByNoOfYears(2, "MM/dd/yyyy"));
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIHireDateEditText.click();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIHireDateEditText.clear();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIHireDateEditText.click();
			Playback.controlReadyThreadWait();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIHireDateEditText
					.sendKeys(Randomized.getPreviousYearByNoOfYears(2, "MM/dd/yyyy"));
			Playback.controlReadyThreadWait();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIHireDateEditText.sendKeys(Keys.TAB);
		}

		public void veifySearviceYearAs2() {
			System.out.println(
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIServiceYearEditText.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual("2",
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIServiceYearEditText.getAttribute("value"));
		}

		public void selectAtPhoneNoType() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoTypeDropDown,
					BaseData.getPersonnelModuleValue("PhoneType"));
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoTypeDropDown.sendKeys(Keys.TAB);

		}

		public void enterAtPhoneNo() {

			Playback.controlReadyThreadWait();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoEdit.click();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoEdit.clear();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoEdit.click();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoEdit
					.sendKeys(BaseData.getPersonnelModuleValue("PhoneNumber"));
		}

		public void clickPhoneNoAddButton() {
			Playback.controlReadyThreadWait();
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoAddButton.click();

		}

		public void verifyAtPhoneNoInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String phnNo = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoTable, "Phone#", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PhoneNo"), phnNo);
		}

		public void verifyAtPhoneNoTypeInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String phntype = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoTable, "Phone Type", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PhoneType"), phntype);
		}

		public void enterPhoneNo() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoEdit
					.sendKeys(Randomized.enterRandomNumbers(10));
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIPhoneNoEdit.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapPersonnel.personnelEntry.personnelEntryMainTab.uIAddButton.click();
		}
	}

	public class PersonnelEntryAssignmentTab {

		public void enterAssignmentDateAs30DaysPastFromCurrentDate() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIAssignmentDateEdit.clear();
			String futureDate = Randomized.getPreviousDateByMonth(1);
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIAssignmentDateEdit.sendKeys(futureDate);
		}

		public void selectNextReviewDueInAsOneMonth() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uINextReviewDueInComboBox.sendKeys("1 Month");
		}

		public void selectJobGradeAsJobGrade1() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIJobGradeComboBox.sendKeys("Job Grade 1");
		}

		public void tabOutAssignmentDate() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIAssignmentDateEdit.sendKeys(Keys.TAB);
		}

		public void enterAssignmentDateAsCurrentDate() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIAssignmentDateEdit
					.sendKeys(Randomized.getCurrentDate());
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionComboBox,
					BaseData.getPersonnelModuleValue("Division"));
		}

		public void selectAtDivision1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionComboBox,
					BaseData.getPersonnelModuleValue("Division1"));
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionComboBox,
					BaseData.getPersonnelModuleValue("Section"));
		}

		public void selectAtSection1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionComboBox,
					BaseData.getPersonnelModuleValue("Section1"));
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickViewAssignmentHistoryButton() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIViewAssignmentHistoryButton.click();
		}

		public void clickDivisionLabel() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionTextView.click();
		}

		public void clickSectionLabel() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionTextView.click();
		}

		public void clickSquadLabel() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISquadTextView.click();
		}

		public void clickTeamTextView() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITeamTextView.click();
		}

		public void clickGroupTextView() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIGroupTextView.click();
		}

		public void verifyAtSupervisor() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Supervisor"),
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorCodeDescription
							.getAttribute("value"));
		}

		public void verifyExistingwindowCount() {
			verify.ExpectedValueIsTrue(Playback.driver.getWindowHandles().size() == 3);
		}

		public void clickSupervisorIcon() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorInfoButton.click();
		}

		public void verifyAssignmentDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIAssignmentDateEdit
							.getAttribute("value"));
		}

		public void verifyAtDivision() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Division"),
					objectIdentification.manualIdentify.getDropDownSelectedItem(
							uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionComboBox));
		}

		public void verifyAtSection() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Section"),
					objectIdentification.manualIdentify.getDropDownSelectedItem(
							uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionComboBox));
		}

		public void verifyDivisionAcknowledgeMessage() {
			verify.ExpectedValueIsTrue(
					uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("(3230) Warning"));
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("Cannot assign multiple divisions to a single section/battalion. Please re-enter."));
			popup.acknowledge.ok();
		}

		public void verifySectionAcknowledgeMessage() {
			// popup.acknowledge.okWithExpectedMessage("(3230) Warning - Cannot assign
			// multiple divisions to a single section/battalion. Please re-enter.");
			verify.ExpectedValueIsTrue(
					uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains("(3230) Warning"));
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("Cannot assign multiple divisions to a single section/battalion. Please re-enter."));
			popup.acknowledge.ok();
		}

		public void verifySectionCount(int sectionCount) {
			verify.ExpectedIntergerValueIsEqualToActual(objectIdentification.manualIdentify.getDropDownOptionsCount(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionComboBox), sectionCount);
		}

		public void verifyGroupAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIGroupTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifySectionAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifySquadAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISquadTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifyTeamAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITeamTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifyDivisionAsMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void verifySectionFieldHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionComboBox
							.getAttribute("disabled")));
		}

		public void verifySquadHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISquadComboBox
							.getAttribute("disabled")));
		}

		public void verifyTeamHide() {
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITeamComboBox.getAttribute("disabled")));
		}

		public void verifyGroupHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIGroupComboBox
							.getAttribute("disabled")));
		}

		public void verifyDivisionHide() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionComboBox
							.getAttribute("disabled")));
		}

		public void selectTypeAsADD1105() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITypeComboBox, "--Add 1105 --");
		}

		public void selectTitleAsADD2016() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITitleRankComboBox, "--Add 2016 --");
		}

		public void selectDivisionAsADD2001() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIDivisionComboBox, "--Add 2001 --");
		}

		public void selectSectionAsADD2006() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISectionComboBox, "--Add 2006 --");
		}

		public void selectSquadAsADD3026() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISquadComboBox, "--Add 3026 --");
		}

		public void selectTeamAsADD3021() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITeamComboBox, "--Add 3021 --");
		}

		public void enterAtBadge() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIBadgeEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Badge"));
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITypeComboBox,
					BaseData.getPersonnelModuleValue("Type"));
		}

		public void selectAtTitleRank() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uITitleRankComboBox,
					BaseData.getPersonnelModuleValue("TitleRank"));
		}

		public void enterAtSupervisor() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorCodeEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Supervisor"));
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyEffectiveDateFieldInactive() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIAssignmentDateEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyEffectiveDateFieldMandatory() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIEffectiveDateLabel
					.getAttribute("class").contains("Mandatory"));
		}

		public void enterEffectiveTimeAsCurrentTime() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIEffectiveTimeEdit
					.sendKeys(Randomized.getCurrentTime("HH:MM"));
			Playback.controlReadyThreadWait();
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIEffectiveTimeEdit.sendKeys(Keys.TAB);
		}

		public void GetEffectiveTime(String effectiveTime) {
			effectiveTime = uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIEffectiveTime1Edit
					.getAttribute("alt").toString();
			;
			Playback.setTestContextAttribute("effectiveTime", effectiveTime);
			// Console.WriteLine(effectiveTime);
		}

		public void verifyPromotionSeniorityDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIPromotionSeniorityEdit.isDisplayed());
		}

		public void enterAtPromotionSeniority() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIPromotionSeniorityEdit
					.sendKeys(BaseData.getPersonnelModuleValue("PromotionSeniority"));
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIPromotionSeniorityEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtPromotionSeniority() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PromotionSeniority"),
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIPromotionSeniorityEdit
							.getAttribute("value"));
		}

		public void selectAtSquad() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISquadComboBox,
					BaseData.getPersonnelModuleValue("Squad"));
		}

		public void tabOutEffectiveDateTime() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIAssignmentDateEdit.sendKeys(Keys.TAB);
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIEffectiveTimeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtSupervisorwithInActive() { // Added by Abi
			verify.ExpectedPropertyValueIsEqual("##" + BaseData.getPersonnelModuleValue("Supervisor"),
					uIMapPersonnel.personnelSearch.uISupervisorPFDesEdit.getAttribute("value"));

		}

		public void enterAtSupervisor1() { // Added by Abi
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorCodeEdit
					.sendKeys(BaseData.getPersonnelModuleValue("SupervisorPF1"));
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtSupervisor1() { // Added by Abi
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Supervisor1"),
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorCodeDescription
							.getAttribute("value"));
		}

		public void clickSupervisorLookUpIcon() { // Added by Abi
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uISupervisorLookUpIcon.click();
		}

		public void selectAtJobGrade() {
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIJobGradeComboBox
					.sendKeys(BaseData.getSchedulingModuleValue("JobGrade"));
		}

		public void verifyJobGradeContainsInactiveValue() {
			String selectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIJobGradeComboBox);
			verify.ExpectedValueIsTrue(selectedItem.contains("#"));

		}

		public void verifyJobGradeContainsNoValue() {
			String selectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIJobGradeComboBox);
			verify.ExpectedValueIsTrue(selectedItem.contains("--"));

		}

		public void selectJobGradeWithInactiveJobCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIJobGradeComboBox,
					BaseData.getSchedulingModuleValue("InactiveJobCode"));
			uIMapPersonnel.personnelEntry.personnelEntryAssignmentTab.uIJobGradeComboBox.sendKeys(Keys.TAB);

		}

		public void verifyInactiveCodeSelectedAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1119) Warning: Inactive code selected");
		}

	}

	public class AssignmentHistoryScreen {
		public void verifyAtPFCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PFCode"),
					uIMapPersonnel.assignmentHistoryScreen.uIPFCodeEdit.getAttribute("value"));
		}

		public void clickChangedToColumnName() {
			objectIdentification.manualIdentify.selectGridHeaderColumnName(
					uIMapPersonnel.assignmentHistoryScreen.uIAssignmentHistoryTable, "Changed To");
		}

		public void verifyAscendingOrder(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Section"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.assignmentHistoryScreen.uIAssignmentHistoryTable, "Changed To", rowIndex));
		}

		public void verifyDescendingOrder(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("03/22/2018", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapPersonnel.assignmentHistoryScreen.uIAssignmentHistoryTable, "Changed To", rowIndex));
		}

		public void closeScreen() {
			uIMapPersonnel.assignmentHistoryScreen.driver.close();
		}

		public void verifyEffectiveDate() {
			// verify.ExpectedPropertyValueIsEqual(Randomized.GetCurrentDate("MM/dd/yy") + "
			// " + Randomized.GetCurrentTime("HH:MM"),
			// objectIdentification.manualIdentify.GetGridCellInnerText
			// (uIMapPersonnel.assignmentHistoryScreen.uIAssignmentHistoryTable, "Effective
			// Date", rowIndex));

			Playback.controlReadyThreadWait();
			List<String> officerValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapPersonnel.assignmentHistoryScreen.uIAssignmentHistoryTable, "Effective Date");
			verify.ExpectedValueIsTrue(officerValues
					.contains(Randomized.getCurrentDate("MM/dd/yy") + " " + Randomized.getCurrentTime("HH:MM")));
		}

		public void verifyAtPFNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PFNo"),
					uIMapPersonnel.assignmentHistoryScreen.uIPFCodeEdit.getAttribute("value"));
		}
	}

	public class PersonnelLockDetailsScreen {
		public void verifyMouseHoverText(int rowIndex) {
			WebElement getGridColumnValue = objectIdentification.manualIdentify.getGridCell(
					uIMapPersonnel.personnelLockDetailsScreen.uILockDetailsResultTable, "Entered Password", rowIndex);
			Actions mouseHover = new Actions(Playback.driver);
			mouseHover.moveToElement(getGridColumnValue).perform();
			Playback.controlReadyThreadWait();
			// PlayBack.TakeScreenshot(PersonnelScripts.PersonnelTestContext,
			// "VerifyPersonnelMouseHoverText");
			verify.ExpectedPropertyValueIsEqual("gfhgfhgf", getGridColumnValue.getAttribute("title"));

		}

	}

	public class PersonnelEntryWorkRecordTab {

		public void clickWorkHistoryTab() {
			uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.uIWorkHistoryTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickInjuryReportTab() {
			uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.uIInjuryReportTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAddNewButton() {
			uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.uIAddNewButton.click();
		}

		public void clickMedicalHistoryTab() {
			uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.uIMedicalHistoryTab.click();
			Playback.controlReadyThreadWait();
		}

		public PersonnelEntryWorkRecordTab() {
			if ((this.injuryReportTab == null)) {
				this.injuryReportTab = new InjuryReportTab();
			}

			if ((this.workHistoryTab == null)) {
				this.workHistoryTab = new WorkHistoryTab();
			}

			if ((this.medicalHistoryTab == null)) {
				this.medicalHistoryTab = new MedicalHistoryTab();
			}
		}

		public InjuryReportTab injuryReportTab;
		public WorkHistoryTab workHistoryTab;
		public MedicalHistoryTab medicalHistoryTab;

	}

	public class InjuryReportTab {

		public void clickAddNewButton() {
			uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.uIAddNewButton.click();
		}

		public void verifyAtInjuryTypeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("InjuryType"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.uIInjuryReportTable,
							"Injury Type", rowIndex).getText());

		}

		public void verifyAtNatureInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Nature"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.uIInjuryReportTable,
							"Nature", rowIndex).getText());

		}

		public void selectRowByAtNature() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.uIInjuryReportTable,
					BaseData.getPersonnelModuleValue("Nature"));
		}

		public void selectRowByIndex(int index) {
			objectIdentification.manualIdentify.selectGridTableRow(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.uIInjuryReportTable,
					index);
//			objectIdentification.manualIdentify. selectGridRowByCellInnerText(
//					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.uIInjuryReportTable,
//					BaseData.getPersonnelModuleValue("InjuryType"), index);
		}

		public void verifyRowCountAsZero() {
			int rowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.injuryReportTab.uIInjuryReportTable);
			verify.ExpectedIntergerValueIsEqualToActual(rowsCount, 0);
		}

	}

	public class WorkHistoryTab {
		public void clickAddNew() {
			uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.uIAddNewButton.click();
		}

		public void clickAtCategoryInGrid(int rowIndex) {
			// objectIdentification.manualIdentify.SelectGridRowByCellInnerText(uIMapPersonnel.personnelEntry.
			// PersonnelEntryWorkRecordTab.workHistoryTab.uIWorkHistoryTabTable,
			// BaseData.getPersonnelModuleValue("Category"));
			objectIdentification.manualIdentify.selectGridTableRow(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.uIWorkHistoryTabTable,
					rowIndex);
		}

		public void selectRowByIndex(int rowIndex) {
			objectIdentification.manualIdentify.selectGridTableRow(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.uIWorkHistoryTabTable,
					rowIndex);
		}

		public void verifyRowCountAsZero() {
			int rowsCount = objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.uIWorkHistoryTabTable);
			verify.ExpectedIntergerValueIsEqualToActual(rowsCount, 0);
		}

		public void verifyAddNewButtonIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.workHistoryTab.uIAddNewButton
							.isDisplayed()); // changed by Abi
		}

	}

	public class MedicalHistoryTab {
		public void clickAtMedicalCode() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryWorkRecordTab.medicalHistoryTab.uIMedicalHistoryTabTable,
					BaseData.getPersonnelModuleValue("MedicalCode"));
		}

	}

	public class PersonnelEntryPreferencesTab {
		public void selectLogOutAcknowledgeAsTrue() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uILogoutAcknowledgeRequirdComBoBox,
					"True");
		}

		public void selectShowLoginPFAsTrue() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uIShowPFImageComBoBox, "True");
		}

		public void selectHomeLinkAndWhiteBoardAsBoth() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uIHomeLinkAndWhiteBoardDisplayedComBoBox,
					"Both");
		}

		public void selectLogOutAcknowledgeAsFalse() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uILogoutAcknowledgeRequirdComBoBox,
					"False");
		}

		public void selectShowLoginPFAsFalse() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uIShowPFImageComBoBox, "False");
		}

		public void selectConfirmationMessageInScreenAsTrue() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uIGenerateConfirmationMessageComBoBox,
					"True");
		}

		public void setDefaultQuickActivityModeForPoliceRMS() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uIDefaultActivityModeComBoBox,
					"Police RMS");
		}

		public void selectConfirmationMessageInScreenAsFalse() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uIGenerateConfirmationMessageComBoBox,
					"False");
		}

		public void verifyDefaultJurisIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryPreferencesTab.uIDefaultJurisDropDown.isDisplayed());

		}
	}

	public class PersonnelEntrySecurityTab {
		public void selectRoleAssignment() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIRoleAssignmentComBoBox);
		}

		public void clickAddButton() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIAddButton.click();
		}

		public void enterAtUserName() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uILoginUserNameEdit
					.sendKeys(BaseData.getPersonnelModuleValue("UserName"));
		}

		public void enterPasswordAsSpace() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit.sendKeys(Keys.SPACE);
		}

		public void enterAtPasswordWithSpace() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit
					.sendKeys(Keys.SPACE + BaseData.getPersonnelModuleValue("Password") + Keys.SPACE);
			verify.ExpectedValueIsFalse(uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit
					.getAttribute("value").contains(" "), "Space Value Occurs in the Password Field");
		}

		public void enterReenterAtPasswordWithSpace() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIConfirmPasswordEdit
					.sendKeys(Keys.SPACE + BaseData.getPersonnelModuleValue("Password") + Keys.SPACE);
			verify.ExpectedValueIsFalse(uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIConfirmPasswordEdit
					.getAttribute("value").contains(" "), "Space Value Occurs in the Password Field");
		}

		public void verifyPasswordEmpty() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit
					.getAttribute("value") == "");
		}

		public void verifyPasswordNotallowdSpace() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Password"),
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit.getAttribute("value"));
		}

		public void verifyReenterPasswordNotAllowedSpace() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Password"),
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIConfirmPasswordEdit
							.getAttribute("value"));
		}

		public void selectRoleAsLocalAdmin() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIRoleAssignmentComBoBox, "Local Admin");
		}

		public void selectRoleAssignmentAsWarrantAdmin() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIRoleAssignmentComBoBox, "Warrant Admin");
		}

		public void verifyAtUserName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("UserName"),
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uILoginUserNameEdit.getAttribute("value"));
		}

		public void enterAtPassword() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Password"));

		}

		public void enterReenterAtPassword() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIConfirmPasswordEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Password"));

		}

		public void enterAtPassword2() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Password2"));

		}

		public void enterReenterAtPassword2() {
			uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIConfirmPasswordEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Password2"));

		}

		public void verifyPasswordFieldDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIEnterPasswordEdit.isEnabled());
		}

		public void selectAtRoleAssignment() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uIRoleAssignmentComBoBox,
					BaseData.getPersonnelModuleValue("RoleAssignment"));
		}

		public void verifyUserNameFieldDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntrySecurityTab.uILoginUserNameEdit.isDisplayed());

		}
	}

	public class PersonnelEntryTimeTab {
		public void clickExpandCheckBox() {
			uIMapPersonnel.personnelEntry.personnelEntryTimeTab.uIExpandAllCheckBox.click();
		}

		public void clickAddNewButton() {
			uIMapPersonnel.personnelEntry.personnelEntryTimeTab.uIAddNewButton.click();
		}

		public void verifyYearAsCurrentYear() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentYear(), objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapPersonnel.personnelEntry.personnelEntryTimeTab.uIForYearComBoBox));
		}

		public void verifyAccumYear() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.personnelEntry.personnelEntryTimeTab.uITimeTabHGridResultTable
					.getText().contains(Randomized.getCurrentYear()));
		}

		public void verifyAddButtonIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryTimeTab.uIAddNewButton.isDisplayed());

		}
	}

	public class PersonnelEntryTrainingTab {
		public void switchToSpecialSkillsTab() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.uISpecialSkillsTab.click();
		}

		public PersonnelEntryTrainingTab()

		{
			if ((this.mCertificationTab == null)) {
				this.mCertificationTab = new CertificationTab();
			}

			if ((this.mSpecialSkillsTab == null)) {
				this.mSpecialSkillsTab = new SpecialSkillsTab();
			}
		}

		public CertificationTab mCertificationTab;
		public SpecialSkillsTab mSpecialSkillsTab;

	}

	public class CertificationTab {

	}

	public class SpecialSkillsTab {
		public void selectAtSkills() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsComboBox
					.sendKeys(BaseData.getPersonnelModuleValue("Skills"));
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsComboBox
					.sendKeys(Keys.TAB);
		}

		public void enterEffectiveDateAsCurrentDate() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIEffectiveFromDateEdit
					.sendKeys(Randomized.getCurrentDate());
		}

		public void clickAddButton() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtSkills() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsTabTable,
					BaseData.getPersonnelModuleValue("Skills"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Skills"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsTabTable,
							row, "Skills").getText());
		}

		public void selectAtSkills1() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsComboBox
					.sendKeys(BaseData.getPersonnelModuleValue("Skills1"));
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsComboBox
					.sendKeys(Keys.TAB);
		}

		public void selectAtSkills2() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsComboBox
					.sendKeys(BaseData.getPersonnelModuleValue("Skills2"));
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsComboBox
					.sendKeys(Keys.TAB);
		}

		public void enterEffectiveDateAsPreviousDate() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIEffectiveFromDateEdit
					.sendKeys(Randomized.getPreviousDate(5, "MM/dd/yyyy"));
		}

		public void clickAtSkillsInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsTabTable,
					BaseData.getPersonnelModuleValue("Skills"));
		}

		public void clickInactiveCheckBox() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIInactiveCheckBox.click();
		}

		public void verifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIInactiveDateEdit
							.getAttribute("value"),
					Randomized.getCurrentDate());
		}

		public void clickUpdateButton() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyCurrentDateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsTabTable,
							"Inactive", rowIndex));
		}

		public void enterEffectiveDateAsFutureDate() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIEffectiveFromDateEdit
					.sendKeys(Randomized.getFutureDate(5));
		}

		public void DeleteAtSkills() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsTabTable,
					BaseData.getPersonnelModuleValue("Skills"));
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void verifyRemainingSkillsPresent() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					"tabPersonnel_tmpl4_usrPerTrainControls1_tabPerTrain_tmpl2_usrSpecialSkills1_grdSkills") == 2);
		}

		public void clickClearButton() {
			uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uIClearButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifySkillsFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryTrainingTab.specialSkillsTab.uISkillsComboBox
							.isDisplayed());

		}
	}

	public class PersonnelEntryInventoryTab {

		public void clickAddNew() {
			uIMapPersonnel.personnelEntry.personnelEntryInventoryTab.uIAddNewButton.click();

		}

		public void verifyAddNewButtonIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryInventoryTab.uIAddNewButton.isDisplayed());
		}

	}

	public class PersonnelEntryEmergencyDataTab {

		public void verifyOrderNoFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryEmergencyDataTab.uIOrderNoEdit.isDisplayed());

		}

	}

	public class PersonnelEntryAllowanceTab {
		public void selectAtAllowance() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAllowanceComboBox,
					BaseData.getPersonnelModuleValue("Allowance"));
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAllowanceComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectYearAsCurrentYear() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIYearComboBox,
					Randomized.getCurrentYear());
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIYearComboBox.sendKeys(Keys.TAB);
		}

		public void enterDateAsCurrentDate() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIDateEdit.click();
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void selectType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uITypeComboBox);
		}

		public void selectItem() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIItemComboBox);
		}

		public void enterAtAmount() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAmountEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Amount"));
		}

		public void enterAtAmount1() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAmountEdit
					.sendKeys(BaseData.getPersonnelModuleValue("Amount1"));
		}

		public void enterComment() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uICommentEdit
					.sendKeys("Automation Testing Purpose");
		}

		public void selectMake() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIMakeLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectVendor() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIVendorLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void clickAddButton() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAddButton.click();
		}

		public void saveInternalTab() {
			uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyAllowanceDateAsCurrentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAllowanceTabTable, "AllowDttm",
							rowIndex));
		}

		public void verifyAtAmountInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Amount"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAllowanceTabTable, "Amount",
							rowIndex));
		}

		public void DeleteAtAmount1Row() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAllowanceTabTable,
					BaseData.getPersonnelModuleValue("Amount1"));
			popup.confirm.yes();
		}

		public void verifyDeletedRowCountInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAllowanceTabTable) == 1);
		}

		public void verifyAddButtonIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.personnelEntry.personnelEntryAllowanceTab.uIAddButton.isDisplayed());

		}
	}

	public class PerformanceReview {

		public void enterAtPFCode() {
			uIMapPersonnel.performanceReview.uIPFCodeEdit.sendKeys(BaseData.getPersonnelModuleValue("PFCode"));
		}

		public void clickSearchButton() {
			uIMapPersonnel.performanceReview.uISearchButton.click();
		}

		public void selectRowAtPFCode() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.performanceReview.uIPerformanceReviewTable,
					BaseData.getPersonnelModuleValue("PFCode"));
		}

		public void clickAtPFCode() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.performanceReview.uIPerformanceReviewTable,
					BaseData.getPersonnelModuleValue("PFCode"));
		}

		public void verifyNextIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.performanceReview.uINextIcon.isDisplayed());
		}

		public void verifyAtPFCode() {
			WebElement temp = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapPersonnel.performanceReview.uIPerformanceReviewTable,
					BaseData.getPersonnelModuleValue("PFCode"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PFCode"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapPersonnel.performanceReview.uIPerformanceReviewTable, temp, "PF Code")
							.getText());

		}

		public void verifyAtPFName() {
			WebElement test = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapPersonnel.performanceReview.uIPerformanceReviewTable,
					BaseData.getPersonnelModuleValue("PFName"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PFName"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapPersonnel.performanceReview.uIPerformanceReviewTable, test, "PF Name")
							.getText());

		}

		public void clickAddNew() {
			uIMapPersonnel.performanceReview.uIAddNewButton.click();
		}

		public void clickBackButton() {
			uIMapPersonnel.performanceReview.uIBackButton.click();
		}

		public void clickRestButton() {
			uIMapPersonnel.performanceReview.uIResetButton.click();
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.performanceReview.uIDivisionComboBox, BaseData.getPersonnelModuleValue("Division"));
		}

		public void verifyTreeIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.performanceReview.uITreeIcon.isDisplayed());
		}

		public void verifyAssociatedSectionCount(int optionCount) {
			verify.ExpectedIntergerValueIsEqualToActual(optionCount, objectIdentification.manualIdentify
					.getDropDownOptionsCount(uIMapPersonnel.performanceReview.uISectionComboBox));
		}

		public void verifySectionCount(int optionCount) {
			verify.ExpectedIntergerValueIsEqualToActual(optionCount, objectIdentification.manualIdentify
					.getDropDownOptionsCount(uIMapPersonnel.performanceReview.uISectionComboBox));
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.performanceReview.uISectionComboBox,
					BaseData.getPersonnelModuleValue("Section"));
		}

		public void verifyAtAssociatedSectionCount() {
			verify.ExpectedIntergerValueIsEqualToActual(
					Integer.parseInt(BaseData.getPersonnelModuleValue("AssociatedSectionValue")),
					objectIdentification.manualIdentify
							.getDropDownOptionsCount(uIMapPersonnel.performanceReview.uISectionComboBox));
		}
	}

	public class PerformanceReviewEntry {

		public void clickApprovalTab() {
			uIMapPersonnel.performanceReviewEntry.uIApprovalTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAttachmentsTab() {
			uIMapPersonnel.performanceReviewEntry.uIAttachmentsTab.click();
		}

		public void enterNextReviewDueAs2DaysFutureFromCurrentDate() {
			uIMapPersonnel.performanceReviewEntry.uINextReviewDueInDateEdit.clear();
			uIMapPersonnel.performanceReviewEntry.uINextReviewDueInDateEdit.sendKeys(Randomized.getFutureDate(2));
		}

		public void save() {
			uIMapPersonnel.performanceReviewEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapPersonnel.performanceReviewEntry.uISaveButton.click();
		}

		public void closeTheScreen() {
			uIMapPersonnel.performanceReviewEntry.driver.close();
		}

		public void verifyAtPFCodeInForPF() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("PFCode"),
					uIMapPersonnel.performanceReviewEntry.uIForPFEdit.getAttribute("value"));
		}

		public void switchToSupervisorReportTab() {
			uIMapPersonnel.performanceReviewEntry.uISupervisorReportTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
		}

		public void verifyAckMessageEvaluationPeriod() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Evaluation Period From.");
		}

		public void verifyAckMessageEnterPurpose() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Purpose");
		}

		public void enterEvaluationDateFromAndTo() {
			uIMapPersonnel.performanceReviewEntry.uIEvaluationFromDateEdit.sendKeys(Keys.TAB);
			uIMapPersonnel.performanceReviewEntry.uIEvaluationFromTimeEdit.sendKeys(Keys.TAB);
			uIMapPersonnel.performanceReviewEntry.uIEvaluationToDateEdit.sendKeys(Keys.TAB);
			uIMapPersonnel.performanceReviewEntry.uIEvaluationToTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterPurpose() {
			uIMapPersonnel.performanceReviewEntry.uIPurposeEdit.sendKeys(Randomized.randomString(10));
		}

		public PerformanceReviewEntry() {
			if ((this.supervisorReportTab == null)) {
				this.supervisorReportTab = new SupervisorReportTab();
			}

			if ((this.approvalTab == null)) {
				this.approvalTab = new ApprovalTab();
			}

		}

		public SupervisorReportTab supervisorReportTab;
		public ApprovalTab approvalTab;

	}

	public class SupervisorReportTab {
		public void enterAtText() {
			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapPersonnel.performanceReviewEntry.supervisorReportTab.uITextEdit).click();
			actions.sendKeys(BaseData.getPersonnelModuleValue("Text")).build().perform();
			Playback.waitForControlReady();
		}

		public void enterComments() {
			uIMapPersonnel.performanceReviewEntry.supervisorReportTab.uITextEdit.sendKeys(Keys.ENTER);
			uIMapPersonnel.performanceReviewEntry.supervisorReportTab.uITextEdit.sendKeys(Randomized.randomString(20));
		}

		public void verifyAtText() {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Text"),
					uIMapPersonnel.performanceReviewEntry.supervisorReportTab.uITextEdit.getText());
		}

		public void clickInternalSave() {
			uIMapPersonnel.performanceReviewEntry.supervisorReportTab.uIInternalSave.click();
			popup.confirm.yes();
		}
	}

	public class ApprovalTab {
		public void enterRaterPF() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIRaterPFLookUPButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterReviewAssignedPF() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIReviewAssignedPFLookUPButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void verifyDivisionDisabled() {
			verify.ExpectedValueIsTrue(
					!uIMapPersonnel.performanceReviewEntry.approvalTab.uIDivisionComboBox.isEnabled());
		}

		public void verifySectionDisabled() {
			verify.ExpectedValueIsTrue(
					!uIMapPersonnel.performanceReviewEntry.approvalTab.uISectionComboBox.isEnabled());
		}

		public void verifySectionFieldEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapPersonnel.performanceReviewEntry.approvalTab.uISectionComboBox.isEnabled());
		}

		public void verifyTreeSymbloPresent() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.performanceReviewEntry.approvalTab.uITreeSymbolEdit.isDisplayed());
		}

		public void enterRaterDate() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIRaterDateEdit.sendKeys(Keys.TAB);
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIRaterTimeEdit.sendKeys(Keys.TAB);
		}

		public void selectSquad() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapPersonnel.performanceReviewEntry.approvalTab.uISquadCombobox);
		}

		public void enterReviewerPF() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIReviewerPFLookUPButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterNextReviewDate() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uINextReviewDueInDateEdit.sendKeys(Keys.TAB);
		}

		public void clickEnableSignCheckBox() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIEnableSignCheckBox.click();
		}

		public void clickRaterSignCheckBox() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIRaterSignCheckBox.click();
		}

		public void enterReviewerDate() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIRevierDateEdit.sendKeys(Keys.TAB);
		}

		public void clickDeclarationCheckBox() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIDeclareCheckBox.click();
		}

		public void clickAgreeCheckBox() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIAgreeSignCheckBox.click();
		}

		public void enterEmployeeDate() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIEmployeeDateEdit.sendKeys(Keys.TAB);
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.performanceReviewEntry.approvalTab.uIDivisionComboBox,
					BaseData.getPersonnelModuleValue("Division"));
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.performanceReviewEntry.approvalTab.uISectionComboBox,
					BaseData.getPersonnelModuleValue("Section"));
		}

		public void verifySectionCountValue() {
			verify.ExpectedValueIsTrue(String
					.valueOf(objectIdentification.manualIdentify.getDropDownOptionsCount(
							uIMapPersonnel.performanceReviewEntry.approvalTab.uISectionComboBox))
					.contains(BaseData.getPersonnelModuleValue("AllSectionValues")));
		}

		public void verifyAssociatedSectionCountValue() {
			verify.ExpectedValueIsTrue(String
					.valueOf(objectIdentification.manualIdentify.getDropDownOptionsCount(
							uIMapPersonnel.performanceReviewEntry.approvalTab.uISectionComboBox))
					.contains(BaseData.getPersonnelModuleValue("AssociatedSectionValue")));
		}

		public void enterAtReviewAssignedPF() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIReviewAssignedPFCodeEdit
					.sendKeys(BaseData.getPersonnelModuleValue("PFCode"));
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIReviewAssignedPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void clearReviewAssignedPF() {
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIReviewAssignedPFCodeEdit.clear();
			uIMapPersonnel.performanceReviewEntry.approvalTab.uIReviewAssignedPFCodeEdit.sendKeys(Keys.TAB);
		}
	}

	public class PersonnelBatchUpdate {
		public void enterAtLoginUserName() {
			uIMapPersonnel.personnelBatchUpdate.uILoginUserNameEdit
					.sendKeys(BaseData.getPersonnelModuleValue("LoginUserName"));
		}

		public void selectCheckBoxAtPFCodeGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable,
					BaseData.getPersonnelModuleValue("PFCode"));
		}

		public void clickSearchButton() {
			uIMapPersonnel.personnelBatchUpdate.uISearchButton.click();
		}

		public void clickBackButton() {
			uIMapPersonnel.personnelBatchUpdate.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickResetButton() {
			uIMapPersonnel.personnelBatchUpdate.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickProceedButton() {
			uIMapPersonnel.personnelBatchUpdate.uIProceedButton.click();
		}

		public void closeScreen() {
			uIMapPersonnel.personnelBatchUpdate.driver.close();
		}

		public void enterAtPFCode() {
			uIMapPersonnel.personnelBatchUpdate.uIPFCodeEdit.sendKeys(BaseData.getPersonnelModuleValue("PFCode"));
			uIMapPersonnel.personnelBatchUpdate.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtDivision() {
			WebElement div = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable,
					BaseData.getPersonnelModuleValue("PFCode"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Division"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable, div, "Division")
							.getText());
		}

		public void verifySectionFieldIsEmpty() {
			WebElement sec = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable,
					BaseData.getPersonnelModuleValue("PFCode"));
			verify.ExpectedPropertyValueIsEqual("",
					objectIdentification.manualIdentify
							.getGridCell(uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable, sec, "Sections")
							.getText());
		}

		public void verifyAtSection() {
			WebElement Asec = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable,
					BaseData.getPersonnelModuleValue("PFCode"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Section"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable, Asec, "Sections")
							.getText());
		}

		public void verifyAssignmentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					Randomized.getCurrentDate("MM/dd/yy") + " " + Randomized.getCurrentTime("HH:MM"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable, "Assignment Date", rowIndex));
		}

		public void clickAtPFCodeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.personnelBatchUpdate.uIBatchUpdateResultTable,
					BaseData.getPersonnelModuleValue("PFCode"));
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}
	}

	public class BatchUpdateEntry {
		public void enterAssignmentDate() {
			uIMapPersonnel.batchUpdateEntry.uIAssignmentDateEdit.click();
			uIMapPersonnel.batchUpdateEntry.uIAssignmentDateEdit.sendKeys(Keys.TAB);
		}

		public void closeScreen() {
			uIMapPersonnel.batchUpdateEntry.driver.close();
		}

		public void selectNextReviewDueInAs1Month() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapPersonnel.batchUpdateEntry.uINextReviewDueInComboBox, "1 Month");
			Playback.controlReadyThreadWait();
			uIMapPersonnel.batchUpdateEntry.uINextReviewDueInComboBox.sendKeys(Keys.TAB);
		}

		public void verifyNextReviewDueInAs1MonthFuture() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDateByMonth(1),
					uIMapPersonnel.batchUpdateEntry.uINextReviewDueInDateEdit.getAttribute("value"));
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.batchUpdateEntry.uIDivisionComboBox,
					BaseData.getPersonnelModuleValue("Division"));
		}

		public void clickSaveNClose() {
			uIMapPersonnel.batchUpdateEntry.uISaveAndCloseButton.click();
			// popup.confirm.yes();
		}

		public void enterEffectiveTimeAsCurrentTime() {
			uIMapPersonnel.batchUpdateEntry.uIEffectiveTimeEdit.sendKeys(Randomized.getCurrentTime("HH:MM"));
			Playback.controlReadyThreadWait();
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.batchUpdateEntry.uISectionComboBox,
					BaseData.getPersonnelModuleValue("Section"));
		}

		public void verifyEffectiveDateFieldMandatory() {
			verify.ExpectedValueIsTrue(
					uIMapPersonnel.batchUpdateEntry.uIEffectiveDateLabel.getAttribute("class").contains("Mandatory"));
		}

		public void saveScreen() {
			uIMapPersonnel.batchUpdateEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void GetEffectiveTime(String batchEffectiveTime) {
			batchEffectiveTime = uIMapPersonnel.batchUpdateEntry.uIEffectiveTimeEdit.getAttribute("title");
			// Console.WriteLine(batchEffectiveTime);
			Playback.setTestContextAttribute("batchEffectiveTime", batchEffectiveTime);
		}

		public void verifyEffectiveDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapPersonnel.batchUpdateEntry.uIAssignmentDateEdit.getAttribute("value"));
		}

		public void verifyEffectiveTime() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentTime("HH:MM"),
					uIMapPersonnel.batchUpdateEntry.uIEffectiveTimeEdit.getAttribute("title"));
		}

		public void verifyPromotionSeniorityDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.batchUpdateEntry.uIPromotionSeniorityEdit.isDisplayed());
		}

		public void enterAtPromotionSeniority() {
			uIMapPersonnel.batchUpdateEntry.uIPromotionSeniorityEdit
					.sendKeys(BaseData.getPersonnelModuleValue("PromotionSeniority"));
			uIMapPersonnel.batchUpdateEntry.uIPromotionSeniorityEdit.sendKeys(Keys.TAB);
		}
	}

	public class WorkHistorySearch {
		public void clickSearchButton() {
			uIMapPersonnel.workHistorySearch.uISearchButton.click();

		}

		public void verifyNextIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.workHistorySearch.uINextIcon.isDisplayed());
		}

	}

	public class InjuryRptSearch {
		public void clickSearchButton() {
			uIMapPersonnel.injuryRptSearch.uISearchButton.click();

		}

		public void verifyNextIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.injuryRptSearch.uINextIcon.isDisplayed());
		}

	}

	public class MedHistorySearch {
		public void clickSearchButton() {
			uIMapPersonnel.medHistorySearch.uISearchButton.click();

		}

		public void verifyNextIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.medHistorySearch.uINextIcon.isDisplayed());
		}

	}

	public class AllowanceCode {
		public void selectAtAllowanceCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.allowanceCode.uIAllowanceCodeComboBox,
					BaseData.getPersonnelModuleValue("AllowanceCode"));
		}

		public void selectAtYear() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapPersonnel.allowanceCode.uIYearComboBox,
					BaseData.getPersonnelModuleValue("Year"));
		}

		public void clickSearchButton() {
			uIMapPersonnel.allowanceCode.uISearchButton.click();
		}

		public void clickInactiveCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapPersonnel.allowanceCode.uIIncludeInActiveCheckBox.click();
		}

		public void verifyAtAllowanceCodeGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("AllowanceCode").substring(5),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.allowanceCode.uIAllowanceCodeResultTable, "Code", rowIndex));
		}

		public void verifyAtYearGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getPersonnelModuleValue("Year").substring(0, 4),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapPersonnel.allowanceCode.uIAllowanceCodeResultTable, "Year", rowIndex));
		}

		public void verifyRowViewedGraycolor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapPersonnel.allowanceCode.uIAllowanceCodeResultTable,
							BaseData.getPersonnelModuleValue("Year").substring(0, 4))
					.getAttribute("class").contains("CssRed"));
		}

		public void clickAtAllowanceCodeInGrid() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.allowanceCode.uIAllowanceCodeResultTable,
					BaseData.getPersonnelModuleValue("AllowanceCode").substring(5));
		}
	}

	public class AllowanceCodeEntry {
		public void selectAtYearInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.allowanceCodeEntry.uIAllowanceCodeEntryResultTable,
					BaseData.getPersonnelModuleValue("Year").substring(0, 4));
		}

		public void verifyInActiveDateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("01/12/2018", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapPersonnel.allowanceCodeEntry.uIAllowanceCodeEntryResultTable, "Inactive Date", rowIndex));
		}

		public void verifyInactiveCheckBoxCheckedGrid(int rowIndex) {
			WebElement InactiveIsChecked = objectIdentification.manualIdentify
					.getGridCell(uIMapPersonnel.allowanceCodeEntry.uIAllowanceCodeEntryResultTable, "Inactive",
							rowIndex)
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(InactiveIsChecked.getAttribute("alt").contains("Checked"));
		}

		public void verifyInactiveCheckBoxChecked() {
			verify.ExpectedValueIsTrue(uIMapPersonnel.allowanceCodeEntry.uIInActiveCheckBox.isSelected());
		}

		public void verifyInactiveDate() {
			verify.ExpectedPropertyValueIsEqual("01/12/2018",
					uIMapPersonnel.allowanceCodeEntry.uIInActiveDateTextEdit.getAttribute("value"));
		}

		public void clickUpdateButton() {
			uIMapPersonnel.allowanceCodeEntry.uIAddButton.click();
		}

		public void closeScreen() {
			uIMapPersonnel.allowanceCodeEntry.driver.close();
		}

		public void saveScreen() {
			uIMapPersonnel.allowanceCodeEntry.uISaveButton.click();
			popup.confirm.yes();
		}
	}

	public class WorkHistoryEntry {
		public void enterSubject() {
			uIMapPersonnel.workHistoryEntry.uISubjectEdit.sendKeys(Randomized.randomString(250));
			// PlayBack.TakeScreenshot(PersonnelScripts.PersonnelTestContext,
			// "PersonnelModule_135772_1");
		}

		public void clickDispositionTab() {
			uIMapPersonnel.workHistoryEntry.uIDispositionTab.click();
		}

		public void saveScreen() {
			uIMapPersonnel.workHistoryEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void closeScreen() {
			uIMapPersonnel.workHistoryEntry.driver.close();
		}

		public void verifyStatusAsOnHold() {
			verify.ExpectedPropertyValueIsEqual("On Hold",
					uIMapPersonnel.workHistoryEntry.uIApprovalStatusTextView.getText());
		}

		public void clickDeleteIcon() {
			uIMapPersonnel.workHistoryEntry.uIDeleteButton.click();
			Playback.controlReadyThreadWait();

		}

		public void verifyConfirmationDeleteMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4)     Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void verifyStatusAsApproved() {
			verify.ExpectedPropertyValueIsEqual("Approved",
					uIMapPersonnel.workHistoryEntry.uIApprovalStatusTextView.getText());
		}

		public void verifyDeleteIconIsDisabled() {
			String status = uIMapPersonnel.workHistoryEntry.uIDeleteButton.getAttribute("disabled");
			System.out.println(status);
			verify.ExpectedValueIsTrue(status.contains("false"));// Actually to be change as TRUE
		}

		public void verifyConfirmationDeleteMessageAsNo() { // commented by Abi
			Playback.controlReadyThreadWait();
			popup.confirm.noWithExpectedMessage("(4) Do you really want to delete?");

//			if (Playback.browserType.equals("Chrome")) {
//				popup.confirm.noWithExpectedMessage("(4)     Do you really want to delete?");
//			} else {
//				popup.switchToConfirm();
//				Playback.controlReadyThreadWait();
//				popup.confirm.noWithExpectedMessage("(4) Do you really want to delete?");
//			}
		}

		public WorkHistoryEntry() {

			if ((this.workHistoryEntryDispositionTab == null)) {

				this.workHistoryEntryDispositionTab = new WorkHistoryEntryDispositionTab();

			}
		}

		public WorkHistoryEntryDispositionTab workHistoryEntryDispositionTab;

	}

	public class WorkHistoryEntryDispositionTab {
		public void enterRemarks() {
			uIMapPersonnel.workHistoryEntry.workHistoryEntryDispositionTab.uIRemarksEdit
					.sendKeys(Randomized.randomString(250));
			// PlayBack.TakeScreenshot(PersonnelScripts.PersonnelTestContext,
			// "PersonnelModule_135772_2");
		}

	}

	public class SupervisorSearch {
		public void clickSupervisorInfoicon() {
			uIMapPersonnel.supervisorSearch.uISupervisorInfoButton.click();
		}

		public void clickSearch() {
			Playback.setFocus();
			uIMapPersonnel.supervisorSearch.uISearchButton.click();
		}

		public void selectRowAtPFCode() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPersonnel.supervisorSearch.uISupervisorResultTable,
					BaseData.getPersonnelModuleValue("PFCode"));
		}
	}

	public class InjuryReportEntry {

		public void tabOutDateOfInjury() {
			uIMapPersonnel.injuryReportEntry.uIDateOfInjuryEdit.sendKeys(Keys.TAB);
		}

		public void selectAtTypeOfInjury() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapPersonnel.injuryReportEntry.uITypeOfInjuryComboBox,
					BaseData.getPersonnelModuleValue("TypeOfInjury"));
		}

		public void saveNClose() {
			uIMapPersonnel.injuryReportEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void verifyStatusAsApproved() {
			verify.ExpectedPropertyValueIsEqual("Approved", uIMapPersonnel.injuryReportEntry.uIStatusLabel.getText());
		}

		public void verifyDeleteIconIsDisabled() {
			String status = uIMapPersonnel.injuryReportEntry.uIDeleteButton.getAttribute("disabled");
			verify.ExpectedValueIsTrue(status.contains("false"));// Actually to be change as TRUE
		}

		public void clickDeleteIcon() {
			uIMapPersonnel.injuryReportEntry.uIDeleteButton.click();
		}

		public void verifyConfirmationDeleteMessageAsNo() { // commented by Abi

			Playback.controlReadyThreadWait();
			popup.confirm.noWithExpectedMessage("(4)Do you really want to delete?");
//			if (Playback.browserType.equals("Chrome")) {
//				popup.confirm.noWithExpectedMessage("(4)     Do you really want to delete?");
//			} else {
//				popup.switchToConfirm();
//				Playback.controlReadyThreadWait();
//				popup.confirm.noWithExpectedMessage("(4) Do you really want to delete?");
//			}
		}

		public void verifyConfirmationDeleteMessageAsYes() {

			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else {
				// popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
		}

	}

	public class MedicalHistoryEntry {
		public void saveNClose() {
			uIMapPersonnel.medicalHistoryEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void save() {
			uIMapPersonnel.medicalHistoryEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickDeleteIcon() {
			uIMapPersonnel.medicalHistoryEntry.uIDeleteButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyConfirmationDeleteMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

	}

	public void reset() {
		uIMapPersonnel = null;
	}

}