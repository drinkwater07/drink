package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataAccess.PoliceData;
import uIMaps.UIMapCM;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class CM {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	UIMapCM uIMapCM = new UIMapCM();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public CMSearch cMSearch;
	public CaseFolder caseFolder;
	public MOSearch mOSearch;
	public CaseReview caseReview;
	public CaseEfforts caseEfforts;

	public CM() {

		if (cMSearch == null)
			cMSearch = new CMSearch();

		if (caseFolder == null)
			caseFolder = new CaseFolder();

		if (mOSearch == null)
			mOSearch = new MOSearch();

		if (caseReview == null)
			caseReview = new CaseReview();

		if (caseReview == null)
			caseReview = new CaseReview();

		if (caseEfforts == null)
			caseEfforts = new CaseEfforts();

	}

	public void switchToCMSearch() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmCaseSrchNew");
	}

	public void switchToCaseFolder() {
		objectIdentification.windowHandle.switchToWindow("Case Folder");

	}

	public void switchToCaseReview() {
		objectIdentification.windowHandle.switchToWindow("Case Review");

	}

	public void switchToCaseEfforts() {
		objectIdentification.windowHandle.switchToWindow("Case Efforts");

	}

	public void switchToMOSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmMOSrch");
	}

	public void switchToCaseFolderScreenTab() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Case Folder");
	}

	public void switchToTaskUpadte() {
		objectIdentification.windowHandle.switchToWindow("Task Update");
	}

	public class CMSearch {

		public CMSearchAdvancedTab cMSearchAdvancedTab;

		public CMSearch() {
			if (cMSearchAdvancedTab == null)
				cMSearchAdvancedTab = new CMSearchAdvancedTab();

		}

		public void clickAddNew() {
			uIMapCM.cMSearch.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickSearch() {
			uIMapCM.cMSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickBack() {
			uIMapCM.cMSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickReset() {
			uIMapCM.cMSearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtCaseNumber() {
			uIMapCM.cMSearch.uICaseYearEdit.sendKeys(PoliceData.getCMModuleValue("CaseNo").substring(0, 2));
			uIMapCM.cMSearch.uICaseNumberEdit.sendKeys(PoliceData.getCMModuleValue("CaseNo").substring(3));
			uIMapCM.cMSearch.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtInvestNo() {
			uIMapCM.cMSearch.uIInvestYearEdit.sendKeys(PoliceData.getCMModuleValue("InvestNo").substring(0, 2));
			uIMapCM.cMSearch.uIInvestNumberEdit.sendKeys(PoliceData.getCMModuleValue("InvestNo").substring(3));
			uIMapCM.cMSearch.uIInvestNumberEdit.sendKeys(Keys.TAB);
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.cMSearch.uIDivisionComboBox,
					PoliceData.getCMModuleValue("Division"));
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.cMSearch.uISectionComboBox,
					PoliceData.getCMModuleValue("Section"));
		}

		public void clickRowAtCaseNumber1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCM.cMSearch.uICMSearchTable,
					PoliceData.getCMModuleValue("CaseNumber"));
		}

		public void clickRowAtInvestNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCM.cMSearch.uICMSearchTable,
					PoliceData.getCMModuleValue("InvestNo"));
		}

		public void clickAdvancedTab() {
			uIMapCM.cMSearch.uIAdvancedTab.click();
		}

		public void verifyRowAtInvestNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("InvestNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapCM.cMSearch.uICMSearchTable,
							"Invest#", rowIndex));
		}

		public void verifyAtCaseNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapCM.cMSearch.uICMSearchTable,
							PoliceData.getCMModuleValue("CaseNo"), "Case#").getText());
		}

		public void verifyAtStatusByAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCell(uIMapCM.cMSearch.uICMSearchTable,
							PoliceData.getCMModuleValue("CaseNo"), "Status").getText());
		}

		public void selectStatusAsClosed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.cMSearch.uIStatusComboBox, "Closed");
			uIMapCM.cMSearch.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAllCasesInGridHasClosedStatus() {
			List<String> cellValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapCM.cMSearch.uICMSearchTable, "Status");
			for (String strStatus : cellValues)
				Assert.assertEquals(strStatus, "Closed");
		}

		public void selectAnyRecord() {
			objectIdentification.randomIdentify.selectRandomGridRow();
		}

		public void clickRandomRow() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapCM.cMSearch.uICMSearchTable);
		}

		public void clickDateRangeClearButton() {
			uIMapCM.cMSearch.uIDateRangeClearButton.click();
		}

		public void enterAtInvestigator() {
			uIMapCM.cMSearch.uIInvestigatorCodeEdit.sendKeys(PoliceData.getCMModuleValue("Investigator"));
			uIMapCM.cMSearch.uIInvestigatorCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtSupervisor() {
			uIMapCM.cMSearch.uISupervisorCodeEdit.sendKeys(PoliceData.getCMModuleValue("Supervisor"));
			uIMapCM.cMSearch.uISupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.cMSearch.uIStatusComboBox,
					PoliceData.getCMModuleValue("Status"));
			uIMapCM.cMSearch.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void enterFromDateTime() {
			uIMapCM.cMSearch.uIDateRangeFromEdit.sendKeys("05052017");
			uIMapCM.cMSearch.uIFromTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void enterToDateTime() {
			uIMapCM.cMSearch.uIDateRangeToEdit.sendKeys(Randomized.getCurrentDate());
			uIMapCM.cMSearch.uIToTimeEdit.sendKeys(Randomized.getCurrentTime());
		}

		public void getRowCount(String rowCount) {
			rowCount = Integer.toString(
					objectIdentification.manualIdentify.getGridTableRowsCount(uIMapCM.cMSearch.uICMSearchTable));
			System.out.println(rowCount);
		}

		public void clickPrintIcon() {
			uIMapCM.cMSearch.uIPrintIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtCaseNo(String CaseNo) {
			verify.ExpectedPropertyValueIsEqual(CaseNo, objectIdentification.manualIdentify
					.getGridCell(uIMapCM.cMSearch.uICMSearchTable, CaseNo, "Case#").getText());
		}

		public void clickAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCM.cMSearch.uICMSearchTable,
					PoliceData.getCMModuleValue("CaseNo"));
		}

		public void selectRowByAtInvestNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapCM.cMSearch.uICMSearchTable,
					PoliceData.getCMModuleValue("InvestNo"));
		}

		public String getRowCount() {

			int integerrowcount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapCM.cMSearch.uICMSearchTable);
			String count = Integer.toString(integerrowcount);
			System.out.println(count);
			return count;

		}
	}

	public class CMSearchAdvancedTab {
		public void selectAtEffectCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.cMSearch.cMSearchAdvancedTab.uIEffortsCategoryComboBox,
					PoliceData.getCMModuleValue("EffortsCategory"));
		}

		public void selectAtActivityCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.cMSearch.cMSearchAdvancedTab.uIActivityComboBox,
					PoliceData.getCMModuleValue("ActivityCode"));
		}

		public void enterHistoryAsProphoenixAutomation() {
			uIMapCM.cMSearch.cMSearchAdvancedTab.uIHistoryTextEdit.sendKeys("Prophoenix, Automation");
		}

		public void enterAtHours() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.cMSearch.cMSearchAdvancedTab.uITotalEffortHoursEdit, PoliceData.getCMModuleValue("Hour"));
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.cMSearch.cMSearchAdvancedTab.uITypeComboBox, PoliceData.getCMModuleValue("Type"));
		}

		public void selectAtDetail() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.cMSearch.cMSearchAdvancedTab.uIDetailComboBox, PoliceData.getCMModuleValue("Detail"));
		}

	}

	public class CaseFolder {

		public CaseFolderAssignmentTab caseFolderAssignmentTab;
		public CaseFolderTasksTab caseFolderTasksTab;
		public CaseFolderHistoryTab caseFolderHistoryTab;
		public CaseFolderCustomTab caseFolderCustomTab;
		public CaseFolderInvestigatorsTab caseFolderInvestigatorsTab;
		public ReviewTab reviewTab;
		public CaseFolderEffortsTab caseFolderEffortsTab;
		public CaseFolderMOTab caseFolderMOTab;
		public CaseFolderUCRTab caseFolderUCRTab;
		public CaseFolderReportingTab caseFolderReportingTab;
		public AttachmentsTab attachmentsTab;

		public CaseFolder() {
			if (caseFolderAssignmentTab == null)
				caseFolderAssignmentTab = new CaseFolderAssignmentTab();

			if (caseFolderTasksTab == null)
				caseFolderTasksTab = new CaseFolderTasksTab();

			if (caseFolderHistoryTab == null)
				caseFolderHistoryTab = new CaseFolderHistoryTab();

			if (caseFolderCustomTab == null)
				caseFolderCustomTab = new CaseFolderCustomTab();

			if (caseFolderInvestigatorsTab == null)
				caseFolderInvestigatorsTab = new CaseFolderInvestigatorsTab();

			if (reviewTab == null)
				reviewTab = new ReviewTab();

			if (caseFolderEffortsTab == null)
				caseFolderEffortsTab = new CaseFolderEffortsTab();

			if (caseFolderMOTab == null)
				caseFolderMOTab = new CaseFolderMOTab();

			if (caseFolderUCRTab == null)
				caseFolderUCRTab = new CaseFolderUCRTab();

			if (caseFolderReportingTab == null)
				caseFolderReportingTab = new CaseFolderReportingTab();

			if (attachmentsTab == null)
				attachmentsTab = objectIdentification.new AttachmentsTab();

		}

		public void enterCaseAtCaseNo() {

			uIMapCM.caseFolder.uICaseYearEdit.sendKeys(PoliceData.getCMModuleValue("CaseNo").substring(0, 2));
			uIMapCM.caseFolder.uICaseNumberEdit.sendKeys(PoliceData.getCMModuleValue("CaseNo").substring(3));
			uIMapCM.caseFolder.uICaseNumberEdit.sendKeys(Keys.TAB);

		}

		public void verifyTaskTabAppearsGreenColor() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.uITasksTab.getAttribute("class").contains("Greencolor"));
		}

		public void verifyUCRTabAppearsGreenColor() {

			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.uIUCRTab.getAttribute("class").contains("Greencolor"));
		}

		public void verifyStatusAsOpen() {
			verify.ExpectedPropertyValueIsEqual("Open", uIMapCM.caseFolder.uIStatusTextView.getText());
		}

		public void verifyDispositionStatusAsOpenPending() {
			verify.ExpectedPropertyValueIsEqual("Open/Pending (CM)",
					uIMapCM.caseFolder.uIDispositionStatusTextView.getText());
		}

		public void clickReopenButton() {
			uIMapCM.caseFolder.uIReopenButton.click();
		}

		public void clickSaveButton() {
			uIMapCM.caseFolder.uISaveButton.click();
		}

		public void verify8036CaseNumberIsMandatoryAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8036) Case Number is mandatory");

		}

		public void save() {
			uIMapCM.caseFolder.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNclose() {
			uIMapCM.caseFolder.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void close() {
			objectIdentification.windowHandle.switchToWindow("Case Folder");
			Playback.controlReadyThreadWait();
			Playback.driver.close();

		}

		public void clickAssignmentTab() {
			uIMapCM.caseFolder.uIAssignmentTab.click();
		}

		public void clickInvestigatorsTab() {
			uIMapCM.caseFolder.uIInvestigatorsTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickReviewTab() {
			uIMapCM.caseFolder.uIReviewTab.click();
		}

		public void clickEffortsTab() {
			uIMapCM.caseFolder.uIEffortsTab.click();
		}

		public void clickTasksTab() {
			uIMapCM.caseFolder.uITasksTab.click();
		}

		public void clickReportingTab() {
			uIMapCM.caseFolder.uIReportingTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCBEReports");
			Playback.pageLoadThreadWait();
		}

		public void clickMOTab() {
			uIMapCM.caseFolder.uIMOTab.click();
		}

		public void clickUCRTab() {
			uIMapCM.caseFolder.uIUCRTab.click();
		}

		public void clickAttachmentTab() {
			uIMapCM.caseFolder.uIAttachmentTab.click();
		}

		public void clickHistoryTab() {
			uIMapCM.caseFolder.uIHistoryTab.click();
		}

		public void clickCustomTab() {
			uIMapCM.caseFolder.uICustomTab.click();
		}

		public void clickQAFormsTab() {
			uIMapCM.caseFolder.uIQAFormsTab.click();
		}

		public void verify3DoYouWantToSaveConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
			} else

			{
				popup.confirm.yesWithExpectedMessage("(3)     Do You Want To Save All Of The Entered Details?");
			}

		}

		public void switchToUCRTab() {
			uIMapCM.caseFolder.uIUCRTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCMClose");
		}

		public void switchToMOTab() {
			uIMapCM.caseFolder.uIMOTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCBEACDMO");
		}

		public void switchToTaskTab() {
			uIMapCM.caseFolder.uITasksTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCMTask");
		}

		public void switchToHistoryTab() {
			uIMapCM.caseFolder.uIHistoryTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCaseHistory");
		}

		public void switchToQAFormsTab() {
			uIMapCM.caseFolder.uIQAFormsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmQuestionnaire");
		}

		public void switchToReviewTab() {
			uIMapCM.caseFolder.uIReviewTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCaseReview");
		}

		public void switchToEffortsTab() {
			uIMapCM.caseFolder.uIEffortsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCaseEfforts");
		}

		public void switchToCustomTab() {
			uIMapCM.caseFolder.uICustomTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCustomTabNew");
		}

		public void verifyCaseStatusColorAsRed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.uICaseStatusTextView.getAttribute("style").contains("red"));
		}

		public void switchToCustomSettings() {
			objectIdentification.windowHandle.switchToWindow("Custom Fields");
		}

		public void verifyAllTabsAreOpeningWithoutIssue() {
			Playback.pageLoadThreadWait();
			uIMapCM.caseFolder.uIAssignmentTab.click();
			Playback.pageLoadThreadWait();
			uIMapCM.caseFolder.uIInvestigatorsTab.click();
			uIMapCM.caseFolder.uIReviewTab.click();
			uIMapCM.caseFolder.uIEffortsTab.click();
			uIMapCM.caseFolder.uITasksTab.click();
			uIMapCM.caseFolder.uIReportingTab.click();
			uIMapCM.caseFolder.uIMOTab.click();
			uIMapCM.caseFolder.uIAttachmentTab.click();
			Playback.pageLoadThreadWait();
			uIMapCM.caseFolder.uIHistoryTab.click();
			// uIMapCM.caseFolder.uICustomTab.click();
			// uIMapCM.caseFolder.uIQAFormsTab.click();

			Playback.controlReadyThreadWait();
		}

		public void clickAllTabs() {
			Playback.pageLoadThreadWait();
			uIMapCM.caseFolder.uIAssignmentTab.click();
			Playback.pageLoadThreadWait();
			uIMapCM.caseFolder.uIInvestigatorsTab.click();
			uIMapCM.caseFolder.uIReviewTab.click();
			uIMapCM.caseFolder.uIEffortsTab.click();
			uIMapCM.caseFolder.uITasksTab.click();
			uIMapCM.caseFolder.uIReportingTab.click();
			uIMapCM.caseFolder.uIMOTab.click();
			uIMapCM.caseFolder.uIAttachmentTab.click();
			Playback.pageLoadThreadWait();
			uIMapCM.caseFolder.uIHistoryTab.click();

		}

		public void enterAtCaseNo() {
			uIMapCM.caseFolder.uICaseYearEdit.sendKeys(PoliceData.getCMModuleValue("CaseNo").substring(0, 2));
			uIMapCM.caseFolder.uICaseNumberEdit.sendKeys(PoliceData.getCMModuleValue("CaseNo").substring(3));
			uIMapCM.caseFolder.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtLocation() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Location"),
					uIMapCM.caseFolder.uILocationEdit.getAttribute("value"));
		}

		public void verifyAtCity() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("City"),
					uIMapCM.caseFolder.uICSZCityEdit.getAttribute("value"));
		}

		public void verifyAtState() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("State"),
					uIMapCM.caseFolder.uICSZStateComboBox.getAttribute("value"));
		}

		public void verifyAtZipCode() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("ZipCode"),
					uIMapCM.caseFolder.uICSZZipEdit.getAttribute("value"));
		}

		public void clickResetButton() {
			uIMapCM.caseFolder.uIResetButton.click();
		}

		public void verifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("CaseNo").substring(0, 2),
					uIMapCM.caseFolder.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("CaseNo").substring(3),
					uIMapCM.caseFolder.uICaseNumberEdit.getAttribute("value"));
		}

		public void clickCalenderIcon() {
			uIMapCM.caseFolder.uICalenderIcon.click();
		}

		public void clickCustomSettingIconAndManageCustomFields() {
			uIMapCM.caseFolder.uICustomSettingIcon.click();
			uIMapCM.caseFolder.uIManageCustomField.click();
		}

		public void switchToInvestigatorsTab() {
			uIMapCM.caseFolder.uIInvestigatorsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmInvestigators");
		}

		public void verifyInvestigatorsTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.uIInvestigatorsTab.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.uIInvestigatorsTab.isEnabled());

		}

		public void verifyAtInvestNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("InvestNo").substring(0, 2),
					uIMapCM.caseFolder.uIInvenstYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("InvestNo").substring(3),
					uIMapCM.caseFolder.uIInvestNumberEdit.getAttribute("value"));
		}
			public void verifyAtjuris() {
		
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.uIJurisComboBox.getText().contains(PoliceData.getCMModuleValue("Juris")));
		}

		public void switchToReportingTab() {
			uIMapCM.caseFolder.uIReportingTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCBEReports");
		}

		public void verifyStatusAsClosed() {
			verify.ExpectedPropertyValueIsEqual("Closed", uIMapCM.caseFolder.uIStatusTextView.getText());
		}

		public void switchToAttachmentsTab() {
			uIMapCM.caseFolder.uIAttachmentTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void clickCaseInfoButton() {
			uIMapCM.caseFolder.uICaseInfoIcon.click();
		}

		public String readInvestNo() {
			String Investyear = uIMapCM.caseFolder.uIInvenstYearEdit.getAttribute("value");
			String InvestNo = uIMapCM.caseFolder.uIInvestNumberEdit.getAttribute("value");
			String Invest = Investyear + "-" + InvestNo;
			System.out.println("Invest No"+Invest);
			return Invest;

		}

		public void verifyDateAssignedCannotBeFutureDate() {
			popup.acknowledge.okWithExpectedMessage("(8033) Date Assigned cannot be a future date");
		}

		public void verifyAtActiveCaseNo(String CaseNo) 
		{
			String CaseYear = uIMapCM.caseFolder.uICaseYearEdit.getAttribute("value");
			String caseNo = uIMapCM.caseFolder.uICaseNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(CaseNo.substring(0,2).contains(CaseYear));
			verify.ExpectedValueIsTrue(CaseNo.substring(3).contains(caseNo));
			
		}
			public void verifyAtStatus() {
			verify.ExpectedPropertyValueIsEqual(uIMapCM.caseFolder.uIStatusTextView.getText(),PoliceData.getCMModuleValue("Status") );
			
		}
		public void verifyAtStatus1() {
			verify.ExpectedPropertyValueIsEqual(uIMapCM.caseFolder.uIStatusTextView.getText(),PoliceData.getCMModuleValue("Status1") );
			
		}

		public void verifyTabTextColor() {
			String cssValue = uIMapCM.caseFolder.uIReviewText.getCssValue("color");
			System.out.println(cssValue);
		Playback.threadWait();
			verify.ExpectedPropertyValueIsEqual(cssValue, PoliceData.getCMModuleValue("ReviewColor"));
			
		}
			public void verifyInvestNo(String investNo) { 										// Added by Abi
			System.out.println(investNo);
			String Investyear = uIMapCM.caseFolder.uIInvenstYearEdit.getAttribute("value");
			String InvestNo = uIMapCM.caseFolder.uIInvestNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(investNo.contains(Investyear));
			verify.ExpectedValueIsTrue(investNo.contains(InvestNo));
		}

		public void verifyAssignedDate() {													// Added by Abi
			System.out.println(uIMapCM.caseFolder.uIAssignedDateText.getText());
			System.out.println("Current Date"+Randomized.getCurrentDate("MM/dd/yy"));
			verify.ExpectedValueIsTrue(
					uIMapCM.caseFolder.uIAssignedDateText.getText().contains(Randomized.getCurrentDate("MM/dd/yy")));
		}
	}

	public class CaseFolderAssignmentTab {

		public void selectSectionAsPatrol() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISectionComboBox.sendKeys("Patrol");
		}

		public void tabOutSupervisor() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyLoggedSupervisor() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("UserName"),
					uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit.getAttribute("value"));
		}

		public void verify8022DivisionIsMandatoryAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8022) Division is mandatory");

		}

		public void verify8004SupervisorIsNotAssignedAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8004) Supervisor is not assigned");

		}

		public void verifyAtSupervisorPFCode() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("PFCode"),
					uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit.getAttribute("value"));
		}

		public void tabOutDateAssignedTime() {

			uIMapCM.caseFolder.caseFolderAssignmentTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapCM.caseFolder.caseFolderAssignmentTab.uITimeEdit.sendKeys(Keys.TAB);

		}

		public void enterAtPrimeInvestigator() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit.clear();
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit
					.sendKeys(PoliceData.getCMModuleValue("PrimeInvestigator"));
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit.sendKeys(Keys.TAB);

		}

		public void clearAndTabPrimeInvestigator() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit.clear();
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit.sendKeys(Keys.TAB);

		}

		public void enterPrimeInvestigator() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorSearchButton.click();
			Playback.controlReadyThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterPrimeInvestigatorAtPFCode() {

			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit
					.sendKeys(PoliceData.getCMModuleValue("PFCode"));
		}

		public void tabOutNextReviewDate() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReviewDateEdit.sendKeys(Keys.TAB);

		}

		public void verifyNextReviewDateAs7DayFutureFromCurrentDate() {
			String NextReview = uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReviewDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(7), NextReview);

		}

		public void verifyNextReviewDateAs5DayFutureFromCurrentDate() {
			String NextReview = uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReviewDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(5), NextReview);

		}

		public void verifyNextReviewDateAs14DayFutureFromCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(14),
					uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReviewDateEdit.getAttribute("value"));

		}

		public void tabOutNextReportDate() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReportDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyNextReportDateAs7DayFutureFromCurrentDate() {
			String NextReport = uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReportDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(7), NextReport);
		}

		public void verifyNextReportDateAs10DayFutureFromCurrentDate() {
			String NextReport = uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReportDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(10), NextReport);
		}

		public void verifyNextReportDateAs14DayFutureFromCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(14),
					uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReportDateEdit.getAttribute("value"));
		}

		public void enterComments() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uICommentsEdit.sendKeys(Randomized.randomString(9));

		}

		public void selectTemplate() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCM.caseFolder.caseFolderAssignmentTab.uITemplateComboBox);
		}

		public void clickLoadButton() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uILoadButton.click();
		}

		public void verifyAtDivision() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Division"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapCM.caseFolder.caseFolderAssignmentTab.uIDivisionComboBox));
		}

		public void verifyAtSection() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Section"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapCM.caseFolder.caseFolderAssignmentTab.uISectionComboBox));
		}

		public void verifyNextReviewDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(8011) Next Review Date Is Mandatory");
		}

		public void enterAtSupervisor() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit.clear();
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit
					.sendKeys(PoliceData.getCMModuleValue("Supervisor"));
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterSolvabilityFactor() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISolvabilityFactorEdit
					.sendKeys(Randomized.randomNumberString(3));
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.caseFolder.caseFolderAssignmentTab.uIDivisionComboBox,
					PoliceData.getCMModuleValue("Division"));
		}

		public void selectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.caseFolder.caseFolderAssignmentTab.uISectionComboBox,
					PoliceData.getCMModuleValue("Section"));
		}

		public void selectDivision() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCM.caseFolder.caseFolderAssignmentTab.uIDivisionComboBox);
		}

		public void selectSection() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCM.caseFolder.caseFolderAssignmentTab.uISectionComboBox);
		}

		public void selectAtDivision1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.caseFolder.caseFolderAssignmentTab.uIDivisionComboBox,
					PoliceData.getCMModuleValue("Division1"));
		}

		public void selectAtSection1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.caseFolder.caseFolderAssignmentTab.uISectionComboBox,
					PoliceData.getCMModuleValue("Section1"));
		}

		public void enterAtSupervisor1() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit
					.sendKeys(PoliceData.getCMModuleValue("Supervisor1"));
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPrimeInvestigator1() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit
					.sendKeys(PoliceData.getCMModuleValue("PrimeInvestigator1"));
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit.sendKeys(Keys.TAB);

		}

		public void tabOutPrimeInvestigator() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickPrimeInvestigatorSearchButton() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorSearchButton.click();
			;
		}

		public void clickSupervisorSearchButton() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorSearchImageButton.click();
		}

		public void verifyAtPrimeInvestigatorName() {
			String primeInvestigator = uIMapCM.caseFolder.caseFolderAssignmentTab.uIPrimeInvestigatorDesEdit
					.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("PrimeInvestigatorName"),
					primeInvestigator);
		}

		public void verifyAtSupervisorName() {
			String supervisor = uIMapCM.caseFolder.caseFolderAssignmentTab.uISupervisorDesEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("SupervisorName"), supervisor);
		}

		public void selectTemplateAsAutomation() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapCM.caseFolder.caseFolderAssignmentTab.uITemplateComboBox, 1);
		}

		public void verify8023SectionIsMandatoryAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8023) Section is mandatory");

		}

		public void enterDateAssignedAsFutureDate(int noOfDays) {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIDateEdit.sendKeys(Randomized.getFutureDate(noOfDays));
			uIMapCM.caseFolder.caseFolderAssignmentTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void verifyNextReportDateAsPerSystemParameter902(int noOfDaysInSysPar, int noOfDays) {
			String actualDate = uIMapCM.caseFolder.caseFolderAssignmentTab.uINextReportDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(noOfDays + noOfDaysInSysPar), actualDate);
		}

		public void clearDateAssigned() {
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIDateEdit.click();
			uIMapCM.caseFolder.caseFolderAssignmentTab.uIDateEdit.clear();
		}
			public void verifyAtCaseStatus() {																				 // Added by Abi
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("CaseStatus"),
					uIMapCM.caseFolder.caseFolderAssignmentTab.uICaseStatusTextView.getAttribute("value"));
		}
	}

	public class CaseFolderTasksTab {
		public void clickAddNewTaskButton() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIAddNewTaskButton.click();
		}

		public void taboutAssignedSupervisor() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedSupervisorCodeEdit.click();
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedSupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtAssignedSupervisor() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedSupervisorCodeEdit
					.sendKeys(PoliceData.getCMModuleValue("AssignedSupervisor"));
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedSupervisorCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtAssignPFNo() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedToPFEdit
					.sendKeys(PoliceData.getCMModuleValue("AssignToPFNo"));
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedToPFEdit.sendKeys(Keys.TAB);
		}

		public void selectAtTaskCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.caseFolder.caseFolderTasksTab.uITaskCodeComboBox, PoliceData.getCMModuleValue("TaskCode"));
		}

		public void selectAtTaskCodeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCM.caseFolder.caseFolderTasksTab.uITasksTabTable, PoliceData.getCMModuleValue("TaskCode"));
		}

		public void enterTaskAsEvidenceDocument() {
			uIMapCM.caseFolder.caseFolderTasksTab.uITaskDetailsEdit.sendKeys("Evidence Document");
		}

		public void enterTaskDetails() {
			uIMapCM.caseFolder.caseFolderTasksTab.uITaskDetailsEdit.sendKeys(Randomized.randomString(15));
		}

		public void verifyAtTaskCodeRowAppearRedColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapCM.caseFolder.caseFolderTasksTab.uITasksTabTable, rowIndex)
					.getAttribute("class").contains("gridrowclr_Red"), "Verify Name appear as Gray color");
		}

		public void verifyLoggedPFCode() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("PFCode"),
					uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedSupervisorCodeEdit.getAttribute("value"));
		}

		public void tabOutAssignedDateTime() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedDateEdit.sendKeys(Keys.TAB);
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedTimeEdit.sendKeys(Keys.TAB);
		}

		public void tabOutDueByDateTime() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIDueByDateEdit.sendKeys(Keys.TAB);
			uIMapCM.caseFolder.caseFolderTasksTab.uIDueByTimeEdit.sendKeys(Keys.TAB);
		}

		public void enterCompletedDateAsFutureDate() {
			uIMapCM.caseFolder.caseFolderTasksTab.uICompletedFinishDateEdit.sendKeys(Randomized.getFutureDate(2));

		}

		public void enterCompletedDateAsCurrentDate() {
			uIMapCM.caseFolder.caseFolderTasksTab.uICompletedDateEdit.sendKeys(Randomized.getCurrentDate());

		}

		public void clickAddbutton() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIAddButton.click();

		}

		public void clickSavebutton() {
			uIMapCM.caseFolder.caseFolderTasksTab.uISaveButton.click();

		}

		public void clickSaveAndClosebutton() {
			uIMapCM.caseFolder.caseFolderTasksTab.uISaveAndCloseButton.click();

		}

		public void verifyAtTaskCodeDescription(int rowIndex) {

			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("TaskCode"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCM.caseFolder.caseFolderTasksTab.uITasksTabTable, "Description", rowIndex)
							.getText());
		}

		public void verifyInvestigatorAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(8053) Investigator not assigned to this case. Do you want to continue?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(8053) Investigator not assigned to this case. Do you want to continue?");
		}

		public void verify1037FutureDateAndTimeNotAllowedAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(1037) Future Date and Time not allowed");
		}

		public void selectTaskCode() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCM.caseFolder.caseFolderTasksTab.uITaskCodeComboBox);
		}

		public void enterTaskDetailsAS3000words() {
			uIMapCM.caseFolder.caseFolderTasksTab.uITaskDetailsEdit.sendKeys(Randomized.randomString(1500));
			uIMapCM.caseFolder.caseFolderTasksTab.uITaskDetailsEdit.sendKeys(Randomized.randomString(1500));
		}

public void enterAssignedDateAspreviousDateAndTabTime() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedDateEdit.sendKeys(Randomized.getPreviousDate(1, "MM/dd/yyyy"));
			uIMapCM.caseFolder.caseFolderTasksTab.uIAssignedTimeEdit.sendKeys(Keys.TAB);	
		}
		public void enterDueDateAspreviousDateAndTabTime() {
			uIMapCM.caseFolder.caseFolderTasksTab.uIDueByDateEdit.sendKeys(Randomized.getPreviousDate(1, "MM/dd/yyyy"));
			uIMapCM.caseFolder.caseFolderTasksTab.uIDueByTimeEdit.sendKeys(Keys.TAB);	
		}

		public void clickSave() {
			uIMapCM.caseFolder.caseFolderTasksTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyDateAsPrevioudDateInFirstRow(int rowIndex) {
			String DueDate = objectIdentification.manualIdentify.getGridCellInnerText(uIMapCM.caseFolder.caseFolderTasksTab.uITasksTabTable, "Due Date",rowIndex);
			verify.ExpectedValueIsTrue(Randomized.getPreviousDate(1,"MM/dd/yyyy").contains(DueDate));
			
		}
		public void verifyDateAsTodayDate(int rowIndex) {
			String DueDate = objectIdentification.manualIdentify.getGridCellInnerText(uIMapCM.caseFolder.caseFolderTasksTab.uITasksTabTable, "Due Date",rowIndex);
			verify.ExpectedValueIsTrue(Randomized.getCurrentDate().contains(DueDate));
			
			
		}
	}

	public class CaseFolderHistoryTab {
		public void clickTaskRadioButton() {
			uIMapCM.caseFolder.caseFolderHistoryTab.uITasksRadioButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickInvestigatorRadioButton() {
			uIMapCM.caseFolder.caseFolderHistoryTab.uIInvestigatorRadioButton.click();
		}

		public void clickEffortsRadioButton() {
			uIMapCM.caseFolder.caseFolderHistoryTab.uIEffortsRadioButton.click();
		}

		public void verify24HrsTime() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIHistory1DateTextView.getText()
					.contains(Randomized.getCurrentTime("HH")));
		}

		public void verifyDateAsCurrentDate() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIHistory1DateTextView.getText()
					.contains(Randomized.getCurrentDate()));
		}

		public void enterAtPFCode() {
			uIMapCM.caseFolder.caseFolderHistoryTab.uIPFEdit.sendKeys(PoliceData.getCMModuleValue("PFCode"));
			uIMapCM.caseFolder.caseFolderHistoryTab.uIPFEdit.sendKeys(Keys.TAB);
		}

		public void clickLoadButton() {
			uIMapCM.caseFolder.caseFolderHistoryTab.uILoadButton.click();
		}

		public void verifyAtEnteredBy() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIEnteredByPF1TextView.getText()
					.contains(PoliceData.getCMModuleValue("PFName")));
		}

		public void verifyAtInvestigatorName() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIEffortsTable.getText()
					.contains(PoliceData.getCMModuleValue("InvestigatorName")));
		}

		public void verifyAtActivityCode() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIEffortsTable.getText()
					.contains(PoliceData.getCMModuleValue("ActivityCode")));
		}

		public void verifyAtInvestigator2() {

			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIInvestigatorName2TextView.getText()
					.contains(PoliceData.getCMModuleValue("Investigators2")));
		}

		public void verifyAtInvestigator1() {

			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIInvestigatorName1TextView.getText()
					.contains("Prophoenix, Automation"));
		}

		public void verifyAtInvestigator() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uIInvestigatorNameTextView.getText()
					.contains(PoliceData.getCMModuleValue("Investigators")));
		}

		public void verifyAtAssignedSupervisorName() {

			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uITasksTable.getText()
					.contains(PoliceData.getCMModuleValue("AssignedSupervisorName")));
		}

		public void verifyAtTaskCode() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uITasksTable.getText()
					.contains(PoliceData.getCMModuleValue("TaskCode")));
		}

		public void verifyAtAssignToPFName() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderHistoryTab.uITasksTable.getText()
					.contains(PoliceData.getCMModuleValue("AssignToPFName")));
		}

		public void clickShowAllRadioButton() {
			uIMapCM.caseFolder.caseFolderHistoryTab.uIShowAllRadioButton.click();
		}

		public void verifyContentInRemarksArea(String status) {
			List<WebElement> elements = Playback.driver.findElements(By.xpath("//table[@id = 'grdHistory1']//td"));
			for (WebElement element : elements) {
				if (element.getText().startsWith("Status Changed to")) {
					System.out.println(element.getText());
					boolean content = element.getText().contains("Status Changed to : " + status);
					verify.ExpectedValueIsTrue(content);
				}
			}

		}

		public void clickCaseStatusRadioButton() {
			uIMapCM.caseFolder.caseFolderHistoryTab.uICaseStudiesRadioButton.click();
		}
	}

	public class CaseFolderCustomTab {
		public void FillCustomFields() {
			uIMapCM.caseFolder.caseFolderCustomTab.uICustomFieldsEdit.sendKeys(Randomized.randomString(10));
		}

		public void clickInternalSave() {
			uIMapCM.caseFolder.caseFolderCustomTab.uICustomTabSaveButton.click();
			popup.acknowledge.ok();
		}
	}

	public class CaseFolderInvestigatorsTab {

		public void enterAtOfficer() {
			uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIOfficersCodeEdit
					.sendKeys(PoliceData.getCMModuleValue("Officer"));
			uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIOfficersCodeEdit.sendKeys(Keys.TAB);
		}

		public void tabOutDate() {
			uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void selectAction() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIActionComboBox);
		}

		public void clickAddButton() {
			uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIAddButton.click();
		}

		public void verifyAtInvestigator() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Investigators"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,
									PoliceData.getCMModuleValue("Investigators"), "Investigators")
							.getText());
		}

		public void verifyAtInvestigator1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Investigators1"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,
									PoliceData.getCMModuleValue("Investigators1"), "Investigators")
							.getText());
		}

		public void verifyAtInvestigator2() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Investigators2"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,
									PoliceData.getCMModuleValue("Investigators2"), "Investigators")
							.getText());
		}

		public void verifyPrimaryCheckBoxCheckedByAtInvestigatorsInGrid() {
			// WebElement PrimeIsChecked =
			// objectIdentification.manualIdentify.getGridCell(uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,PoliceData.getCMModuleValue("Investigators"),
			// "Prime").findElement(By.tagName("img"));
			WebElement PrimeIsChecked = Playback.driver
					.findElement(By.xpath("//body[@class='masterfrm']//tr//tr//tr//tr//tr[1]//td[15]//img[1]"));
			verify.ExpectedValueIsTrue(PrimeIsChecked.getAttribute("alt").contains("Checked"));
		}

		public void DeleteAtInvestigator() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,
					PoliceData.getCMModuleValue("Investigators"));
			Playback.controlReadyThreadWait();
		}

		public void DeleteAtInvestigator1() {

			Playback.driver.findElement(By.xpath(
					"//div[@id='grdOfficers']//table/tbody/tr[contains(@class,'ig_BlueThemeAlt igg_BlueThemeAlt')]//td[contains(@class,'Delete_Icon_Style')]"))
					.click();

			Playback.controlReadyThreadWait();
			/*
			 * objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
			 * uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,
			 * PoliceData.getCMModuleValue("Investigators1"));
			 * Playback.controlReadyThreadWait();
			 */
		}

		public void verifyPrimeInvestigatorAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(8068) A Prime Investigator must be assigned before deleting this record");
		}

		public void verifyDeleteConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				// (4) Do you really want to delete?
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}

			else {
				popup.confirm.yesWithExpectedMessage("(4)     Do you really want to delete?");
			}
		}

		public void saveInternal() {
			objectIdentification.windowHandle.switchToFrame("Case Folder", "frmInvestigators");
			Playback.controlReadyThreadWait();
			uIMapCM.caseFolder.caseFolderInvestigatorsTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveInternalByNavigate(String Window, String Frame) {

			objectIdentification.windowHandle.switchToFrame(Window, Frame);
			Playback.controlReadyThreadWait();
			uIMapCM.caseFolder.caseFolderInvestigatorsTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyInvestigatorTableRowCount(int rowCount) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable) == rowCount);
		}

		public void verifySupervisorInvestigatorAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage(
					"(8083) A Supervisor cannot be deleted. Assign a new Supervisor in the Assignment tab before deleting this Investigator.");
		}

		public void verify1051UpdateDataExistsInInvestigatorTabAckMsg() {
			popup.acknowledge.okWithExpectedMessage(
					"(1051) Updated data exists in the Investigator(s) Tab. You must save or reset.");
		}

		public void verifyAtInvertigator2NotAppearsInGrid() {
			verify.ExpectedValueIsFalse(
					objectIdentification.manualIdentify.controlExist(objectIdentification.manualIdentify.
							getGridCell(uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable , PoliceData.getCMModuleValue("Investigators2"))));

		}

		public void DeleteAtInvestigator2() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,
					PoliceData.getCMModuleValue("Investigators2"));
			Playback.controlReadyThreadWait();
		}

		public void clickOnPrimeCheckBoxByOfficerDescription() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapCM.caseFolder.caseFolderInvestigatorsTab.uIInvestigatorsTabTable,
					PoliceData.getCMModuleValue("OfficerDescription"));
		}
	}

	public class ReviewTab {

		public void clickAddNewReviewButton() {
			uIMapCM.caseFolder.reviewTab.uIAddNewReviewButton.click();
		}

		public void verifyAtCaseStatus() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.reviewTab.uICaseStatusTextView.getText()
					.contains(PoliceData.getCMModuleValue("CaseStatus")));
		}

		public void verifyNextReviewDateAs5DayFutureFromCurrentDate() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.reviewTab.uINextReviewDateTextView.getText()
					.contains(Randomized.getFutureDate(5)));

		}

		public void verifyNextReportDateAs10DayFutureFromCurrentDate() {

			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.reviewTab.uINextReportDateTextView.getText()
					.contains(Randomized.getFutureDate(10)));

		}

		public void clickEditIcon() {
			uIMapCM.caseFolder.reviewTab.uIEditIcon.click();
		}

		public void verifyAtCaseStatusContentInRemarks() {
			String content = uIMapCM.caseFolder.reviewTab.uICaseStatusTextView.getText();
			verify.ExpectedValueIsTrue(content.contains(PoliceData.getCMModuleValue("CaseStatus")));
		}

		public void verifyAtCaseStatus1ContentInRemarks() {
			String content = uIMapCM.caseFolder.reviewTab.uICaseStatusTextView.getText();
			verify.ExpectedValueIsTrue(content.contains(PoliceData.getCMModuleValue("CaseStatus1")));
		}
	}

	public class CaseFolderEffortsTab {

		public void clickAddNewEffortsTab() {
			uIMapCM.caseFolder.caseFolderEffortsTab.uIAddNewEffortsButton.click();
		}

		public void verifyAtInvestigatorName() {

			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderEffortsTab.uIInvestogatorNameTextView.getText()
					.contains(PoliceData.getCMModuleValue("InvestigatorName")));

		}

		public void verifyAtActivityCode() {
			verify.ExpectedValueIsTrue(uIMapCM.caseFolder.caseFolderEffortsTab.uIActivityCodeTextView.getText()
					.contains(PoliceData.getCMModuleValue("ActivityCode")));

		}

		public void clickEditIcon() {
			uIMapCM.caseFolder.caseFolderEffortsTab.uIEditInfoIcon.click();
		}

		public void verifyCumulativeTimeHours(String hours) {

			verify.ExpectedValueIsTrue(
					uIMapCM.caseFolder.caseFolderEffortsTab.uICumulativeHoursTextView.getText().contains(hours));

		}

	}

	public class CaseFolderMOTab {

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.caseFolder.caseFolderMOTab.uITypeComboBox,
					PoliceData.getCMModuleValue("Type"));
			uIMapCM.caseFolder.caseFolderMOTab.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtCategory() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.caseFolder.caseFolderMOTab.uICategoryComboBox, PoliceData.getCMModuleValue("Category"));

			uIMapCM.caseFolder.caseFolderMOTab.uICategoryComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtDetail() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapCM.caseFolder.caseFolderMOTab.uIDetailComboBox, PoliceData.getCMModuleValue("Detail"));
		}

		public void enterComment() {
			uIMapCM.caseFolder.caseFolderMOTab.uICommentEdit.sendKeys(Randomized.randomString(15));
		}

		public void clickAddButton() {
			uIMapCM.caseFolder.caseFolderMOTab.uIAddButton.click();
		}

		public void verifyAtTypeCategoryDetailInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("TypeCategoryDetail"),
					objectIdentification.manualIdentify.getGridCell(uIMapCM.caseFolder.caseFolderMOTab.uIMOTable,
							PoliceData.getCMModuleValue("TypeCategoryDetail")).getText());
		}

		public void verifyAtTypeInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Type"), objectIdentification.manualIdentify
					.getGridCell(uIMapCM.caseFolder.caseFolderMOTab.uIMOTable, PoliceData.getCMModuleValue("Type"))
					.getText());
		}

		public void verifyAtCategoryInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Category"),
					objectIdentification.manualIdentify.getGridCell(uIMapCM.caseFolder.caseFolderMOTab.uIMOTable,
							PoliceData.getCMModuleValue("Category")).getText());
		}

		public void verify1051UpdateDataExistMoTabAckMsg() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the MO Tab. You must save or reset.");

		}

		public void save() {
			uIMapCM.caseFolder.caseFolderMOTab.uISaveButton.click();
			popup.confirm.yes();
		}

	}

	public class CaseFolderUCRTab {

		public void selectUCRDisposition() {
			uIMapCM.caseFolder.caseFolderUCRTab.uIUCRDispositionSearchButton.click();

		}

		public void selectDispositionFromCodedSearch() {

			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void tabOutDate() {
			uIMapCM.caseFolder.caseFolderUCRTab.uIDateEdit.sendKeys(Keys.TAB);

		}

		public void clickSaveButton() {
			uIMapCM.caseFolder.caseFolderUCRTab.uISaveButton.click();

		}

		public void verify8005CaseRemarksAreRequiredAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8005) Case remarks are required");
		}

		public void verify8010DispositionFieldIsMandatoryAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8010) Disposition field is mandatory");
		}

		public void selectTemplate() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapCM.caseFolder.caseFolderUCRTab.uITTemplateComboBox);
		}

		public void clickLoadButton() {
			uIMapCM.caseFolder.caseFolderUCRTab.uILoadButton.click();
		}

		public void verify1051UpdatedDataExistsInTheUCRTabAckMsg() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the UCR Tab. You must save or reset.");
		}

		public void save() {
			uIMapCM.caseFolder.caseFolderUCRTab.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

	}

	public class CaseFolderReportingTab {
		public void clickAddReportButton() {
			uIMapCM.caseFolder.caseFolderReportingTab.uIAddReportButton.click();
			Playback.controlReadyThreadWait();
		}

		public void saveInternalTab() {
			uIMapCM.caseFolder.caseFolderReportingTab.uISaveButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void clickRefreshButton() {
			uIMapCM.caseFolder.caseFolderReportingTab.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void selectAtReportByType() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapCM.caseFolder.caseFolderReportingTab.uIReportingTable,
					PoliceData.getRecordsModuleValue("Type"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtTypeInGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Type"), objectIdentification.manualIdentify
					.getGridCell(uIMapCM.caseFolder.caseFolderMOTab.uIMOTable, PoliceData.getCMModuleValue("Type"))
					.getText());
		}
	}

	public class MOSearch {
		public void clickSearchButton() {
			uIMapCM.mOSearch.uISearchButton.click();
		}

		public void reloadMOSearchTab() {
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("MO Search", "Reload Tab");
		}

		public void oKWithWebPageAlertWindowReloadScreenMessage() {
			Playback.popupThreadWait();
			Assert.assertTrue(Playback.driver.switchTo().alert().getText()
					.contains("Are you sure, you want to Reload the Screen?"));
			Playback.popupThreadWait();
			Playback.driver.switchTo().alert().accept();
		}

		public void verifyAcknowledgeSelectType() {
			popup.acknowledge.okWithExpectedMessage("(8082) Select Type");
		}

		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.mOSearch.uITypeComboBox,
					PoliceData.getCMModuleValue("Type"));
			uIMapCM.mOSearch.uITypeComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.mOSearch.uICategoryComboBox,
					PoliceData.getCMModuleValue("Category"));
			uIMapCM.mOSearch.uICategoryComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtDetail() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.mOSearch.uIDetailComboBox,
					PoliceData.getCMModuleValue("Detail"));
			uIMapCM.mOSearch.uIDetailComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Type"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapCM.mOSearch.uIMOSearchTable, "Type", rowIndex));
		}

		public void verifyAtCategory(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("Category"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapCM.mOSearch.uIMOSearchTable,
							"Category", rowIndex));
		}
	}

	public class CaseReview {

		public void clickSaveButton() {
			uIMapCM.caseReview.uISaveButton.click();

		}

		public void verify8038StatusUpdateIsmandatoryAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8038) Status Update is mandatory");
		}

		public void selectAtCaseStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.caseReview.uICaseStatusComboBox,
					PoliceData.getCMModuleValue("CaseStatus"));
		}

		public void selectAtCaseStatus1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.caseReview.uICaseStatusComboBox,
					PoliceData.getCMModuleValue("CaseStatus1"));
		}

		public void verifyAtCaseStatus() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getCMModuleValue("CaseStatus"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapCM.caseReview.uICaseStatusComboBox));
		}

		public void tabOutDate() {
			uIMapCM.caseReview.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyNextReviewDateAs5DayFutureFromCurrentDate() {
			String nextReview = uIMapCM.caseReview.uINextReviewDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(5), nextReview);

		}

		public void verifyNextReportDateAs10DayFutureFromCurrentDate() {
			String nextReport = uIMapCM.caseReview.uINextReportDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(10), nextReport);

		}

		public void selectTemplate() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapCM.caseReview.uITemplateComboBox);
		}

		public void clickLoadButton() {
			uIMapCM.caseReview.uILoadButton.click();
		}

		public void save() {
			uIMapCM.caseReview.uISaveButton.click();
			popup.confirm.yes();

		}

		public void close() {
			Playback.driver.close();
		}

		public void selectCaseStatusAsClosed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.caseReview.uICaseStatusComboBox,
					"Closed - No Further Leads (CM)");
		}

		public void tabOutDateAndTime() {
			uIMapCM.caseReview.uIDateEdit.sendKeys(Keys.TAB);
			uIMapCM.caseReview.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void selectTemplateAsAutomation() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.caseReview.uITemplateComboBox,
					"Automation");
		}

		public void verifyAtCaseStatus1ContentInRemarks() {
			String content = uIMapCM.caseFolder.reviewTab.uICaseStatusTextView.getText();
			verify.ExpectedValueIsTrue(content.contains(PoliceData.getCMModuleValue("CaseStatus1")));
		}

		public void verifyReviewDateIsMandatoryAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(8008) Review Date is mandatory");
		}

public void verifyAtStatusLabel() {
			String Label = uIMapCM.caseReview.uIStatusLabel.getText();
			verify.ExpectedValueIsTrue(Label.contains(PoliceData.getCMModuleValue("StatusLabel")));
			
		}
		public void verifyAtStatusLabel1() {
			String Label = uIMapCM.caseReview.uIStatusLabel.getText();
			verify.ExpectedValueIsTrue(Label.contains(PoliceData.getCMModuleValue("StatusLabel1")));
			
		}
	}

	public class CaseEfforts {

		public void clickSaveButton() {
			uIMapCM.caseEfforts.uISaveButton.click();
		}

		public void verify8002RequiredEntriesAreMissingAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(8002) Required entries are missing");
		}

		public void tabOutInvestigator() {
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.sendKeys(Keys.TAB);
		}

		public void clearInvestigator() {
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.clear();

		}
		public void clearOldInvestigator() {
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.sendKeys(Keys.CONTROL ,"a");
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.sendKeys(Keys.BACK_SPACE);
		}

		public void closeCaseEffort() {
			objectIdentification.windowHandle.switchToWindow("Case Efforts");
			objectIdentification.windowHandle.closeTheScreen();
		}

		public void enterAtInvestigator1() {
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.clear();
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.click();
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.sendKeys(PoliceData.getCMModuleValue("Investigator1"));
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.sendKeys(Keys.TAB);
		}

		public void verify8053InvestigatorNotAssignedToCaseConfirmMsg() {
			if (Playback.browserType.contains("Chrome"))
				popup.confirm.yesWithExpectedMessage(
						"(8053) Investigator not assigned to this case. Do you want to continue?");
			else
				popup.confirm.yesWithExpectedMessage(
						"(8053) Investigator not assigned to this case. Do you want to continue?");
		}

		public void selectAtCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.caseEfforts.uICategoryComboBox,
					PoliceData.getCMModuleValue("Category"));
			uIMapCM.caseEfforts.uICategoryComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtActivityCode() {
			// uIMapCM.caseEfforts.uIActivityCodeComboBox.click();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapCM.caseEfforts.uIActivityCodeComboBox,
					PoliceData.getCMModuleValue("ActivityCode"));
			uIMapCM.caseEfforts.uIActivityCodeComboBox.sendKeys(Keys.TAB);
		}

		public void tabOutStartedDate() {
			uIMapCM.caseEfforts.uIDateStartedEdit.sendKeys(Keys.TAB);
		}

		public void enterFinishedDateAs2DaysFutureFromCurrentDate() {
			uIMapCM.caseEfforts.uIDateFinishedEdit.click();
			uIMapCM.caseEfforts.uIDateFinishedEdit.sendKeys(Randomized.getFutureDate(2));
		}

		public void selectTemplate() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapCM.caseEfforts.uITemplateComboBox);
		}

		public void clickLoadButton() {
			uIMapCM.caseEfforts.uILoadButton.click();
		}

		public void save() {
			uIMapCM.caseEfforts.uISaveButton.click();
			popup.confirm.yes();
		}

		public void getCumulativeTimeHours(String hours) {
			hours = uIMapCM.caseEfforts.uICumulativeTimeHoursEdit.getAttribute("value");
		}

		public void getCumulativeTimeMinutes(String minutes) {
			minutes = uIMapCM.caseEfforts.uICumulativeTimeMinutesEdit.getAttribute("value");
		}

		public void enterAtInvestigator() {
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.sendKeys(PoliceData.getCMModuleValue("Investigator"));
			uIMapCM.caseEfforts.uIInvestigatorCodeEdit.sendKeys(Keys.TAB);
		}

	}

}
