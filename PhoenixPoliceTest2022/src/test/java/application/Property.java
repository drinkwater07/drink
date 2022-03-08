package application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import dataAccess.PoliceData;
import resources.PropertiesFile;
import scripts.PoliceSmokeTest82;
import uIMaps.UIMapNames;
import uIMaps.UIMapPopup;
import uIMaps.UIMapProperty;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Property {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapProperty uIMapProperty = new UIMapProperty();
	public UIMapNames uIMapNames = new UIMapNames();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public Names names = new Names();
	public Vehicle vehicle = new Vehicle();

	public PropertyEditEntry propertyEditEntry;
	public PropertyEntry propertyEntry;
	public PropertyUpdate propertyUpdate;
	public PropertyRoomRoles propertyRoomRoles;
	public AttachPropertyPopup attachPropertyPopup;
	public PropertyIndex propertyIndex;
	public Pawn pawn;
	public PawnEntry pawnEntry;
	public BicycleRegistration bicycleRegistration;
	public BicycleRegistrationEntry bicycleRegistrationEntry;
	public AuditSearch auditSearch;
	public AuditEditEntry auditEditEntry;
	public PawnHelpWindow pawnHelpWindow;
	public PropertySearch propertySearch;
	public PropertySearchHelpWindow propertySearchHelpWindow;
	public PropertyNCICCode propertyNCICCode;
	public PropertyNCICEntry propertyNCICEntry;
	public PullRequest pullRequest;
	public RequestEntry requestEntry;
	public PropertyUpdateHelpWindow propertyUpdateHelpWindow;
	public LocationSearch locationSearch;
	public StorageLocations storageLocations;
	public StorageLocationUpdate storageLocationUpdate;
	public Notify notify;

	public PropertyCodes propertyCodes;

	public PropertyCodesEntry propertyCodesEntry;
	public PropertyCodedLookup propertyCodedLookup;
	public Property() {
		if (propertyEditEntry == null)
			propertyEditEntry = new PropertyEditEntry();
		if (propertyEntry == null)
			propertyEntry = new PropertyEntry();
		if (propertyUpdate == null)
			propertyUpdate = new PropertyUpdate();
		if (propertyRoomRoles == null)
			propertyRoomRoles = new PropertyRoomRoles();
		if (attachPropertyPopup == null)
			attachPropertyPopup = new AttachPropertyPopup();
		if (propertyIndex == null)
			propertyIndex = new PropertyIndex();
		if (pawn == null)
			pawn = new Pawn();
		if (pawnEntry == null)
			pawnEntry = new PawnEntry();
		if (bicycleRegistration == null)
			bicycleRegistration = new BicycleRegistration();
		if (bicycleRegistrationEntry == null)
			bicycleRegistrationEntry = new BicycleRegistrationEntry();
		if (auditSearch == null)
			auditSearch = new AuditSearch();
		if (auditEditEntry == null)
			auditEditEntry = new AuditEditEntry();
		if (pawnHelpWindow == null)
			pawnHelpWindow = new PawnHelpWindow();
		if (propertySearch == null)
			propertySearch = new PropertySearch();
		if (propertySearchHelpWindow == null)
			propertySearchHelpWindow = new PropertySearchHelpWindow();
		if (propertyNCICCode == null)
			propertyNCICCode = new PropertyNCICCode();
		if (propertyNCICEntry == null)
			propertyNCICEntry = new PropertyNCICEntry();
		if (pullRequest == null)
			pullRequest = new PullRequest();
		if (requestEntry == null)
			requestEntry = new RequestEntry();
		if (propertyUpdateHelpWindow == null)
			propertyUpdateHelpWindow = new PropertyUpdateHelpWindow();
		if (locationSearch == null)
			locationSearch = new LocationSearch();
		if (storageLocations == null)
			storageLocations = new StorageLocations();
		if (storageLocationUpdate == null)
			storageLocationUpdate = new StorageLocationUpdate();
		if (notify == null)
			notify = new Notify();
		if (this.propertyCodes == null)
			this.propertyCodes = new PropertyCodes();
		if (this.propertyCodesEntry == null)
			this.propertyCodesEntry = new PropertyCodesEntry();
		if (this.propertyCodedLookup == null)
			this.propertyCodedLookup = new PropertyCodedLookup();
	}

	public void Reset() {
		uIMapProperty = null;
		uIMapPopup = null;
		uIMapNames = null;
	}

	public void switchToPropertyEditEntry() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPropEntrySrch");
		Playback.controlReadyThreadWait();

	}

	public void switchToPropertyEditEntryPopup() {

		objectIdentification.windowHandle.switchToWindow("Property Edit/Entry");
		Playback.controlReadyThreadWait();

	}

	public void switchToPropertyEntry() {

		objectIdentification.windowHandle.switchToWindow("Property Entry");
		Playback.controlReadyThreadWait();

	}

	public void switchToPropertyNCICCode() {

		objectIdentification.windowHandle.switchToWindow("Property NCIC Code");
		Playback.controlReadyThreadWait();

	}

	public void switchToPropertyNCICEntry() {

		objectIdentification.windowHandle.switchToWindow("frmPropNCIC.aspx");
		Playback.controlReadyThreadWait();

	}

	public void switchToPropertyEntryRecovered() {

		objectIdentification.windowHandle.switchToWindow("frmPropEntry.aspx?");
		Playback.controlReadyThreadWait();

	}
	public void switchToPropertyCodes() {

		objectIdentification.windowHandle.switchToWindow("Property Codes");

		Playback.controlReadyThreadWait();

	}

	public void switchToPropertyCodesEntry()

	{

		objectIdentification.windowHandle.switchToWindowUsingURL("/Police/Property/frmPropCodeEntry.aspx?");

	}
	public void switchToPropertyIndex() {

		objectIdentification.windowHandle.switchToWindow("Property Index");
		Playback.controlReadyThreadWait();

	}

	public void switchToPropertyUpdate() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPropBTUptSave");
		Playback.controlReadyThreadWait();
	}

	public void switchToNotifyScreen() {
		objectIdentification.windowHandle.switchToWindow("Notify");
	}

	public void switchToPropertyRoomRoles() {

		objectIdentification.windowHandle.switchToWindow("Property Room Roles");
		Playback.controlReadyThreadWait();
		Playback.pageLoadThreadWait();

	}

	public void switchToAttachPropertyReport() {

		objectIdentification.windowHandle.switchToWindowUsingFormName("frmMainRpt_Id");
		Playback.controlReadyThreadWait();

	}

	public void switchToPawn() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPawnSrch");
	}

	public void switchToPawnHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Pawn");
	}

	public void switchToPawnEntry() {
		objectIdentification.windowHandle.switchToWindow("Pawn Entry");
	}

	public void switchToBicycleRegistration() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmBicycleSrch");
	}

	public void switchToBicycleRegistrationEntry() {
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToWindow("Registration Entry");
	}

	public void switchToAuditSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPropAuditSrch");
	}

	public void switchToAuditEditEntry() {
		objectIdentification.windowHandle.switchToWindow("Audit Edit/Entry - 3255");
	}

	public void switchToPropertySearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPropertySrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToPropertySearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Property Search");
	}

	public void switchToPullRequest() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPullSrch");
		Playback.controlReadyThreadWait();
	}

	public void switchToRequestEntry() {
		objectIdentification.windowHandle.switchToWindow("Request Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToPropertyUpdateHelpWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPropBTUptSave");
		Playback.controlReadyThreadWait();
	}

	public void switchToLocationSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmPropLocationSrch.aspx");
		Playback.controlReadyThreadWait();
	}

	public void switchToStorageLocations() {
		objectIdentification.windowHandle.switchToWindow("Storage Location");
	}

	public void switchToStorageLocationUpdate() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmUpdateLocation.aspx");
	}

	public class PropertyEditEntry {

		public PropertyEditEntry() {
			if ((this.propertyEntryMainTab == null)) {
				this.propertyEntryMainTab = new PropertyEntryMainTab();
			}

			if ((this.recoveredTab == null)) {
				this.recoveredTab = new RecoveredTab();
			}

			if ((this.propertyEntryHistoryTab == null)) {
				this.propertyEntryHistoryTab = new PropertyEntryHistoryTab();
			}

		}

		public PropertyEntryMainTab propertyEntryMainTab = null;
		public RecoveredTab recoveredTab = null;
		public PropertyEntryHistoryTab propertyEntryHistoryTab = null;

		public void enterAtCaseNumberAndTab() {
			uIMapProperty.propertyEditEntry.uICaseYearEdit.click();
			uIMapProperty.propertyEditEntry.uICaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(3));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void ClickCaseInfoIcon() {

			uIMapProperty.propertyEditEntry.uICaseInfoButton.click();

		}

		public void clickAddNewPropertyReport() {

			uIMapProperty.propertyEditEntry.uIAddNewPropertyReportButton.click();

		}

		public void ClickAttachPropertyReport() {

			uIMapProperty.propertyEditEntry.uIAttachPropertyReportButton.click();
		}

		public void SelectRowFromGrid() {

			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable);
		}

		public void SelectRowByAtPropertyNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
		}

	public void SelectRowByAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("CaseNo"));
		}

		public void EnterAtCaseNumberDetails() {
			String CaseNumber = PoliceData.getPropertyModuleValue("CaseID").toString();
			uIMapProperty.propertyEditEntry.uICaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseID").substring(0, 2));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseID").substring(3));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();

		}

		public void ClickCheckBoxfromGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("Reason"));
		}

		public void SelectGridCheckboxByAtPropertyNo() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
		}

		public void VerifyPropertyYearNumber(String propertyYear, String propertyNumber) {

			WebElement propertyYr = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, propertyYear);
			verify.ExpectedValueIsTrue(propertyYr.getText().contains(propertyYear));

			WebElement propertyNo = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, propertyNumber);
			verify.ExpectedValueIsTrue(propertyYr.getText().contains(propertyNumber));

		}

		public void ClickRecoverdProperty() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Recovered");
		}

		public void VerifyPropertyIsNullInTheGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable) == 0);
		}

		public void closeTheScreen() {
			uIMapProperty.propertyEditEntry.driver.close();
		}

		public void VerifyAtReason(int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Reason"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Reason", rowIndex));
		}

		public void VerifyAtReasonByAtPropertyNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Reason"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, row, "Reason")
							.getText());
		}

		public void VerifyQuantityAs5ByAtPropertyNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
			verify.ExpectedPropertyValueIsEqual("5.000", objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, row, "Quantity").getText());
		}

		public void VerifyQuantityAs5(int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual("5.000", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Quantity", rowIndex));
		}

		public void VerifyStolenAppearsInGrayColor() {
			// verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PropertyNo"),
			// objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
			// PoliceData.getPropertyModuleValue("PropertyNo")).getText());
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Stolen")
					.getAttribute("class").contains("gridrowclrGray"));
		}

		public void VerifyRecoveredAndAppearsInGrayColor() {
			// verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RecoveredProperty"),
			// objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
			// PoliceData.getPropertyModuleValue("RecoveredProperty")).getText());
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Recovered")
					.getAttribute("class").contains("gridrowclrGray"));
		}

		public void VerifyReasonAsRecovered(int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual("Recovered", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Reason", rowIndex));
		}

		public void VerifyReasonAsDeleted(int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual("**Deleted**", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Reason", rowIndex));
		}

		public void VerifyConfirmSelectedRowMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(9065) Use selected row Case #?");
			} else
				popup.confirm.yesWithExpectedMessage("(9065) Use selected row Case #?");
		}

		public void VerifyRowFontViewedRedColor() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
									PoliceData.getPropertyModuleValue("Reason"))
							.getAttribute("class").contains("gridrowclr"));
			Playback.gridLoadThreadWait();
		}

		public void VerifyRowviewedRedColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "**Deleted**")
					.getAttribute("class").contains("gridrowbgclr"));
			Playback.gridLoadThreadWait();
		}

		public void VerifyStolenRowClosedCheckboxChecked() {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Stolen");
			WebElement closed = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, row, "Closed");
			verify.ExpectedValueIsTrue(closed.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));

		}

		public void VerifyRecoveredRowClosedCheckboxChecked() {
			WebElement row = objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Recovered");
			WebElement closed = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, row, "Closed");
			verify.ExpectedValueIsTrue(closed.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
		}

		public void ClickAtResaonInGrid() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("Reason"));
		}

		public void VerifyAtPropertyNo(int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Property#",
							rowIndex)
					.contains(PoliceData.getPropertyModuleValue("PropertyNo")));
		}

		public void VerifyPropertyNo(String propertyNo, int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Property#",
							rowIndex)
					.contains(propertyNo));
		}

		public void VerifyAtType(int rowIndex) {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Type"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Type", rowIndex));
		}

		public void VerifyQuantityAsDecimalValue(int rowIndex, String decimalvaue) {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(decimalvaue, objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Quantity", rowIndex));
		}

		public void GetTheReportedDateTime(String ReportedDate, String ReportedTime) // out
		{

			Playback.testContext.setAttribute("ReportedDate",
					uIMapProperty.propertyEditEntry.uIReportedDateEdit.getAttribute("value"));
			Playback.testContext.setAttribute("ReportedTime",
					uIMapProperty.propertyEditEntry.uIReportedTimeEdit.getAttribute("value"));
		}
		public void VerifyAtQuantity(int rowIndex) {
			Playback.pageLoadThreadWait();
			String gridCellInnerText = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Quantity", rowIndex);
			
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Quantity"),gridCellInnerText.substring(0,gridCellInnerText.lastIndexOf(".")));
		}

		public void SelectPropertyRowUsingPropertyNo(String propertyYear, String propertyNumber, int Seq) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					propertyYear + "-" + propertyNumber + "-" + Seq);
		}

		public void VerifyClosedCheckboxCheckedUsingReason() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("Reason"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, row, "Closed")
					.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));

		}

		public void ClickReset() {
			uIMapProperty.propertyEditEntry.uIResetButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void VerifyPropertyRowInGrayColorUsingReason() {
			// verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PropertyNo"),
			// objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
			// PoliceData.getPropertyModuleValue("PropertyNo")).getText());
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
							PoliceData.getPropertyModuleValue("Reason"))
					.getAttribute("class").contains("gridrowclrGray"));
		}

		public void VerifyAtStorageByAtReason() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("Reason"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Storage"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, row, "Storage")
							.getText());
		}

		public void ClickSelectProperty() {
			uIMapProperty.propertyEditEntry.uISelectPropertyButton.click();
			Playback.pageLoadThreadWait();
		}

		public void enterAtCaseNumber1AndTab() {
			uIMapProperty.propertyEditEntry.uICaseYearEdit.click();
			uIMapProperty.propertyEditEntry.uICaseYearEdit.clear();
			Playback.gridLoadThreadWait();
			uIMapProperty.propertyEditEntry.uICaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo1").substring(0, 2));
			Playback.gridLoadThreadWait();
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.clear();
			Playback.gridLoadThreadWait();
			uIMapProperty.propertyEditEntry.uICaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo1").substring(3));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();

			if (Playback.driver.getTitle() == "Acknowledge") {
				Playback.driver.findElement(By.id("cmdOk")).click();
			}

		}

		public String ReadPropertyNo() {

			WebElement propertyNo = objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("Disposition"), "Property#");
			String propertyNumber = propertyNo.getText();
			return propertyNumber;
		}

		public void selectRowByAtPropertyNo(String PropertyNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, PropertyNo);
		}

		public void selectRowByAtReason() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable,
					PoliceData.getPropertyModuleValue("Reason"));
		}

		public void enterAtCaseNumberAndTab(String CaseNo) {
			uIMapProperty.propertyEditEntry.uICaseYearEdit.click();
			uIMapProperty.propertyEditEntry.uICaseYearEdit.sendKeys(CaseNo.substring(0, 2));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.sendKeys(CaseNo.substring(3));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void verifyPropertyListedInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable) > 0);

		}

		public String GetTheReportedDate() {
			String getdate = uIMapProperty.propertyEditEntry.uIReportedDateEdit.getAttribute("value").toString();
			System.out.println(getdate + "-----date");
			return getdate;
		}

		public String GetTheReportedTime() {

			String gettime = uIMapProperty.propertyEditEntry.uIReportedTimeEdit.getAttribute("value").toString();
			System.out.println(gettime + "---Time");
			return gettime;
		}

		public void enterCaseNumberByActiveData(String caseNo) {
			uIMapProperty.propertyEditEntry.uICaseYearEdit.click();
			uIMapProperty.propertyEditEntry.uICaseYearEdit.sendKeys(caseNo.substring(0, 2));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.sendKeys(caseNo.substring(3));
			uIMapProperty.propertyEditEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void VerifyAtPropertyNo(String PropertyNo, int rowIndex) {
			Playback.pageLoadThreadWait();
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Property#", rowIndex);
			verify.ExpectedValueIsTrue(gridCell.getText().contains(PropertyNo));

		}
			public void verifyAtActivePropertyNoInGrid(String propertyNo, int rowIndex) 
		{
			String gridRowByCellInnerText =  objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Property#", rowIndex).getText();
//			  String gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, propertyNo).getText();
			  verify.ExpectedPropertyValueIsEqual(propertyNo, gridRowByCellInnerText);
			
		}
		public void verifyMultiplePropertyNoInGrid(List<String> allPropertyNo) {
			List<String> columnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Property#");

			for (String propertyNo : allPropertyNo) {
				verify.ExpectedValueIsTrue(columnValues.contains(propertyNo));
			}
		}
			public void verifyPropertyNoIsNotListed(String propertyNo) {
			List<String> columnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Property#");
			verify.ExpectedValueIsFalse(columnValues.contains(propertyNo));
		}

		public void selectRowByActivePropertyNoInGrid(String readPropertyNo)
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, readPropertyNo);
			
		}

		public void verifyAtStorageInGrid(int rowIndex) 
		{
//			String text = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, PoliceData.getPropertyModuleValue("Storage")).getText();
//			System.out.println(text);
			 String gridCellInnerText = objectIdentification.manualIdentify.getGridCellInnerText(uIMapProperty.propertyEditEntry.uIPropertyEditEntryTable, "Storage", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Storage"), gridCellInnerText);
//			verify.ExpectedValueIsTrue(text.contains(PoliceData.getPropertyModuleValue("Storage")));
		}
	}

	public class PropertyEntry {

		public PropertyEntryMainTab propertyEntryMainTab;
		public RecoveredTab recoveredTab;
		public PropertyEntryHistoryTab propertyEntryHistoryTab;

		public PropertyEntry() {
			if ((this.propertyEntryMainTab == null)) {
				this.propertyEntryMainTab = new PropertyEntryMainTab();
			}
			if ((this.recoveredTab == null)) {
				this.recoveredTab = new RecoveredTab();
			}
			if ((this.propertyEntryHistoryTab == null)) {
				this.propertyEntryHistoryTab = new PropertyEntryHistoryTab();
			}
		}

		public void ClickCaseInfoIcon() {

			uIMapProperty.propertyEntry.uICaseInformationButton.click();
			Playback.threadWait(3000);
		}
			public void clickPropertyInfoIcon() {
			uIMapProperty.propertyEntry.uIPropertyBblIcon.click();
			
		}

		public void clickSaveButton() {

			uIMapProperty.propertyEntry.uISaveButton.click();

		}

		public void SaveTheScreen() {

			uIMapProperty.propertyEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();

		}

		public void SaveNClose() {

			uIMapProperty.propertyEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void ClickSaveAndCloseButton() {

			uIMapProperty.propertyEntry.uISaveAndCloseButton.click();

		}

		public void ClickDeleteButton() {

			uIMapProperty.propertyEntry.uIDeleteButton.click();

		}

		public void clickMainTab() {

			uIMapProperty.propertyEntry.uIMainTab.click();
			Playback.pageLoadThreadWait();
		}

		public void clickRecoveredTab() {
			Playback.pageLoadThreadWait();
			uIMapProperty.propertyEntry.uIRecoveredTab.click();

		}

		public void ClickAttachmentTab() {

			uIMapProperty.propertyEntry.uIAttachmentTab.click();
		}

		public void clickReportDetailsButton() {

			uIMapProperty.propertyEntry.uIReportDetailsButton.click();
			Playback.waitForPageLoad();
		}

		public void ClickAddNewButton() {
			Playback.waitForControlReady();
			uIMapProperty.propertyEntry.uIAddNewButton.click();

		}
			public void verifyAddButtonIsDisabled() {
			uIMapProperty.propertyEntry.uIAddNewButton.getAttribute("disabled").contains("disabled");
			
		}

		public void ClickResetButton() {
			uIMapProperty.propertyEntry.uIResetButton.click();
			Playback.threadWait(5000);

		}

		public void ClickSubmitButton() {
			uIMapProperty.propertyEntry.uISubmitButton.click();
			Playback.controlReadyThreadWait();

		}

		public void GetThePropertyYearAndNumber(String propertyYear, String propertyNumber) {

			Playback.testContext.setAttribute("propertyYear",
					uIMapProperty.propertyEntry.uIPropertyYearEdit.getAttribute("value"));
			Playback.testContext.setAttribute("propertyNumber",
					uIMapProperty.propertyEntry.uIPropertyNumberEdit.getAttribute("value"));

		}

		public void verifyAtCaseNo() {

			String CaseYear = uIMapProperty.propertyEntry.uICaseYearEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(CaseYear.contains(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2)));

			String CaseNumber = uIMapProperty.propertyEntry.uICaseNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(CaseNumber.contains(PoliceData.getPropertyModuleValue("CaseNo").substring(3)));

		}

		public void enterAtCaseNo() {

			uIMapProperty.propertyEntry.uICaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2));
			uIMapProperty.propertyEntry.uICaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(3));
			uIMapProperty.propertyEntry.uICaseNumberEdit.sendKeys(Keys.TAB);

		}

		public void VerifyOfficerDetails() {

			String Officer = uIMapProperty.propertyEntry.uIOfficerCodeEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(Officer.contains(PoliceData.getPropertyModuleValue("LoggedOfficer")));
		}

		public void VerifyPropertyItemResequencedConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(9089) Property Item # may be resequenced. The bar code may need to be reprinted. Do you want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(9089) Property Item # may be resequenced. The bar code may need to be reprinted. Do you want to delete?");
			Playback.popupThreadWait();
		}

		public void VerifyConfirmSubmitMessage() {
	
				popup.confirm.yesWithExpectedMessage("(9062) The report cannot be updated after submission. Do you want to proceed?");
			Playback.pageLoadThreadWait();
		}
		public void closeTheScreen() {
			uIMapProperty.propertyEntry.driver.close();

		}

		public void VerifyGreenArrow() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.uISubmitButton.isDisplayed());
		}

		public void VerifyMenuBarIconsDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.uISaveButton.getAttribute("class").contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.uISaveAndCloseButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.uISubmitButton.getAttribute("class").contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.uIDeleteButton.getAttribute("class").contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.uIResetButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.uIPrintButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.uIReportDetailsButton.isEnabled());

		}

		public void TabReportedDateTime() {
			uIMapProperty.propertyEntry.uIReportedDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.uIReportedTimeEdit.sendKeys(Keys.TAB);
		}

		public void TabOfficer() {
			uIMapProperty.propertyEntry.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyReportedDateTime(String ReportedDate, String ReportedTime) {
			verify.ExpectedPropertyValueIsEqual(ReportedDate,
					uIMapProperty.propertyEntry.uIReportedDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(ReportedTime,
					uIMapProperty.propertyEntry.uIReportedTimeEdit.getAttribute("value"));
		}

		public void VerifyDrugTypeAcknowledgemessage() {
			popup.acknowledge.okWithExpectedMessage("(9152) Enter Drug Type");
		}

		public void Verify9124ValueRequiredAcknowledgemessage() {
			popup.acknowledge.okWithExpectedMessage("(9124) Value is required");
		}

	public void VerifyEnterMandatoryDataAcknowledgemessage() {
			popup.acknowledge.okWithExpectedMessage("(8) Mandatory data");
		}
		public void ClickHistoryTab() {
			Playback.pageLoadThreadWait();
			uIMapProperty.propertyEntry.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPropHist");

		}

		public void ClickCopyButton() {
			Playback.waitForControlReady();
			uIMapProperty.propertyEntry.uICopyButton.click();

		}

		public String readPropertyNo() {
			String Year = uIMapProperty.propertyEntry.uIPropertyYearEdit.getAttribute("value");
			String Num = uIMapProperty.propertyEntry.uIPropertyNumberEdit.getAttribute("value");
			String Sequence = uIMapProperty.propertyEntry.uIPropertySequence.getAttribute("value");
			String Sno = Sequence.substring(Sequence.lastIndexOf("/") + 1);
			String PropertyNo = Year + "-" + Num + "-" + Sno;
			return PropertyNo;

		}

		public void verifyReportDetailsIsDisplayed() {
			Playback.pageLoadThreadWait();
			uIMapProperty.propertyEntry.uIReportDetailsButton.isDisplayed();
		}

		public String readPropertyNo1() {
			String Year = uIMapProperty.propertyEntry.uIPropertyYearEdit.getAttribute("value");
			String Num = uIMapProperty.propertyEntry.uIPropertyNumberEdit.getAttribute("value");
			String Sequence = uIMapProperty.propertyEntry.uIPropertySequence.getAttribute("value");
			char Sno = Sequence.charAt(Sequence.length() - 3);
			String PropertyNo1 = Year + "-" + Num + "-" + Sno;

			return PropertyNo1;
		}

		public void verifyAcknowledgeNIBRSReportable() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(9122) This will not be a NIBRS reportable item");
		}

		public void verifySaveFunctionalityDisabled() {
			verify.ExpectedValueIsFalse(uIMapProperty.propertyEntry.uISaveAndCloseButton.isEnabled());

		}

		public void verifyAcknowledgeValue0() {
			popup.acknowledge.okWithExpectedMessage("(9176) Property Value must be Zero");
		}

		public void VerifyAdditionSuccessfulMessage() {
			String UpdateMessage = uIMapProperty.propertyEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}

		public String readPropertyNoWithoutSequence() {
			String Year = uIMapProperty.propertyEntry.uIPropertyYearEdit.getAttribute("value");
			String Num = uIMapProperty.propertyEntry.uIPropertyNumberEdit.getAttribute("value");
			String PropertyNo = Year + "-" + Num;
			return PropertyNo;

		}

		public void VerifyCurrentStatusAsSentToLab() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.uICurrentStatusLabel.getAttribute("title").contains("Sent To Lab"));
		}

		public void verifyReportDetailsButtonIsNotDisplayed() {
			List<WebElement> row = Playback.driver.findElements(By.xpath("//table[@id='Table3']//td/input"));

			for (WebElement element : row) {
				if (element.getAttribute("type").contains("submit")) {
					verify.ExpectedValueIsFalse(Playback.driver
							.findElement(By.xpath("//table[@id='Table3']//input[@type='submit']")).isDisplayed());
				} else {
					verify.ExpectedValueIsTrue(true);
				}
			}
		}

		public String readCaseNo() {
			String Caseyear = uIMapProperty.propertyEntry.uICaseYearEdit.getAttribute("value");
			String CaseNo = uIMapProperty.propertyEntry.uICaseNumberEdit.getAttribute("value");
			String Case = Caseyear + "-" + CaseNo;
			return Case;

		}

		public void verifyConfirmSubmitMessageAsNo() {
			popup.confirm.noWithExpectedMessage(
					"(9062)     The report cannot be updated after submission. Do you want to proceed?");
			Playback.pageLoadThreadWait();
		}

		public void verifyPropertyNoIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.uIPropertyBblIcon.isDisplayed());
		}

		public void VerifyAtCaseNoUsingJsonReadFile(String testCaseId) {
            String caseYear = PoliceData.readJson(testCaseId, "caseYear");
               String caseNo = PoliceData.readJson(testCaseId, "caseNo");
               String CaseNo = caseYear+"-"+caseNo;
               String CaseYear = uIMapProperty.propertyEntry.uICaseYearEdit.getAttribute("value");
               verify.ExpectedValueIsTrue(CaseYear.contains(caseYear));

               String CaseNumber = uIMapProperty.propertyEntry.uICaseNumberEdit.getAttribute("value");
               verify.ExpectedValueIsTrue(CaseNumber.contains(caseNo));
       }

public void verifyAtPropertySequence() {
	
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyEntry.uIPropertySequence.getAttribute("value"), 
					PoliceData.getPropertyModuleValue("Sequence"));
			
			
		}
		public void verifyAtPropertyNo() {
			String proYear = uIMapProperty.propertyEntry.uIPropertyYearEdit.getAttribute("value");
			String proNo = uIMapProperty.propertyEntry.uIPropertyNumberEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(
					proYear.contains(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2)));
			verify.ExpectedValueIsTrue(proNo.contains(PoliceData.getPropertyModuleValue("PropertyNo").substring(3, 9)));
		}

		public void verifyCaseInfoIconIsDisplayed()
		{
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.uICaseInformationButton.isDisplayed());
			
		}
		public void VerifyUpdateSuccessfulMessage() {
			String UpdateMessage = uIMapProperty.propertyEntry.uILeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1003 - Update Successful"));
			Playback.wait(2000);
		}
	}

	public class PropertyEntryMainTab {

		public void SelectAtChargeOrOffense() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox,
					PoliceData.getPropertyModuleValue("ChargeOrOffense"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox.sendKeys(Keys.TAB);

		}

		public void SelectAtPropertyCFS() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uICFSCodeComboBox,
					PoliceData.getPropertyModuleValue("CFSCode"));

		}

		public void SelectReasonAsEvidence() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.sendKeys("Evidence");

		}

		public void SelectReasonAsSeized() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.sendKeys("Seized/Confiscated");

		}

		public void SelectPropertyAsBicycles() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Bicycles");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);

		}

		public void selectPropertyAsFirearms() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Firearms");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);

		}

		public void VerifyPropertyTypeAsGun() {

			String PropertyType = uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeEdit
					.getAttribute("value");
			Assert.assertEquals("Gun", PropertyType);

		}

		public void VerifyPropertyTypeAsArticle() {

			String PropertyType = uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeEdit
					.getAttribute("value");
			Assert.assertEquals("Article", PropertyType);

		}

		public void VerifyPropertyTypeAsVehicle() {

			String PropertyType = uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeEdit
					.getAttribute("value");
			Assert.assertEquals(PropertyType, "Vehicle");

		}

		public void selectPropertyAsAutomobiles() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Automobiles");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);

		}

		public void selectPropertyAsMoney() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Money");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);

		}

		public void SelectPropertyAsWaterCraft() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Watercraft");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);

		}

		public void SelectPropertyAsDrugsNarcotics() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Drugs/Narcotics");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtReason() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Reason"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.sendKeys(Keys.TAB);
		}

		public void selectReasonAsStolen() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.sendKeys("Stolen");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.sendKeys(Keys.TAB);
		}

		// public void SelectAtChargeOrOffense()
		// {
		// uIMapProperty.propertyEntry.propertyEntryMainTab.uIChargeOrOffenseComboBox.sendKeys(PoliceData.getPropertyModuleValue("ChargeOrOffense"));
		// uIMapProperty.propertyEntry.propertyEntryMainTab.uIChargeOrOffenseComboBox.sendKeys(Keys.TAB);
		// }

		public void selectAtProperty() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Property"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);
		}

		public void enterDescription() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit
					.sendKeys(Randomized.manualPlusRandomString("found property in the incident place ", 7));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterDecriptionAs10Shirts() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit.sendKeys("10 Shirts");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit.sendKeys(Keys.TAB);

		}

		public void ClickRelatedPropertyInfoIcon() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyInfoIconButton.click();
		}

		public void EnterSerial() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumber(3)));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialEdit.sendKeys(Keys.TAB);

		}

		public void enterAtSerial() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialEdit
					.sendKeys(PoliceData.getPropertyModuleValue("SerialNo"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtSerialClothing() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialClothingEdit
					.sendKeys(PoliceData.getPropertyModuleValue("SerialNo"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialClothingEdit.sendKeys(Keys.TAB);
		}

		public void selectGunTypeAndTab() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.propertyEntryMainTab.uIGunTypeComboBox);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIGunTypeComboBox.sendKeys(Keys.TAB);

		}

		public void SelectOwnerName() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIOwnerSearchButton.click();
			names.switchToNameSearchHelpWindow();	
			names.nameSearchHelpWindow.SelectIncidentName();

		}

		public void selectGunMake() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIGunMakeSearchButton.click();
			Playback.threadWait(3000);
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();

		}

		public void EnterCaliber() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICaliberEdit.click();
			int i = Randomized.getRandomNumber(2);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICaliberEdit.sendKeys(String.valueOf(i));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICaliberEdit.sendKeys(Keys.TAB);
		}

		public void EnterQuantity() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumber(1)));
		}

		public void enterQuantityAs10() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.sendKeys("10");
		}

		public void EnterQuantityAsDecimalValue() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit
					.sendKeys(Double.toString(Randomized.getRandomDecimalNumber()));
		}

		public void enterValue() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.sendKeys(Randomized.randomNumberString(3));
		}

		public void getQuantity(String Quantity) {
			Quantity = uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.getAttribute("value");
			Playback.setTestContextAttribute("Quantity", Quantity);

		}

		public void EnterValueAs100() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.sendKeys("100");
		}

		public void VerifyValueAs000() {
			verify.ExpectedPropertyValueIsEqual("$0.00",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.getAttribute("value"));
		}

		public void VerifyValueAs100() {
			verify.ExpectedPropertyValueIsEqual("$100.00",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.getAttribute("value"));
		}

		public void SelectNameByLastName() {

			// uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			names.nameSearchHelpWindow.SelectName();
			// uIMapProperty.propertyEntry.driver.SwitchTo().DefaultContent();

		}

		public void SelectPlateNumber() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIVehiclePlateNoEdit.sendKeys("35");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIVehiclePlateStateComboBox.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();
			Playback.waitForPageLoad();
			vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
		}

		public void ClickClearName() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIClearNameImageButton.click();
			Playback.wait(10);
		}

		public void ClearQuantity() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.clear();
		}

		public void EnterQuantityAsOne() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.sendKeys("1");

		}

		public void VerifyQuantityAs1() {
			verify.ExpectedPropertyValueIsEqual("1",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.getAttribute("Value"));
		}

		public void EnterRegistration() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRegistrationNumEdit.sendKeys("1");

		}

		public void SelectRandomRegistrationNumber() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRegistrationNumEdit.sendKeys("101");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIVehiclePlateStateComboBox.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();
			vehicle.vehicleBoatSearchHelpWindow.selectBoat();
		}

		public void SelectDrugTypeAsHeroin() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugTypeComboBox, "Heroin");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterDrugQuantity() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityEdit
					.sendKeys(String.valueOf(Randomized.randomNumberString(2)));

		}

		public void SelectMeasurement() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementComboBox);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementComboBox.sendKeys(Keys.TAB);

		}

		public void enterAtOwnerName() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.waitForControlReady();
			names.nameSearchHelpWindow.SelectName();
			Playback.waitForControlReady();
		}

		public void EnterAtLastName() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
			Playback.controlReadyThreadWait();
		}

		public void EnterAtFirstName() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void TabOutFirstName() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void enterOwnerName() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uILastNameEdit.sendKeys("a");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();
			names.nameSearchHelpWindow.SelectName();

		}

		public void ClickNameInfoButton() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uINameInfoImageButton.click();

		}

		public void VerfiyOwnerLastNameInNameEntryScreen() {
			String lastName = uIMapProperty.propertyEntry.propertyEntryMainTab.uILastNameEdit.getAttribute("value");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uINameInfoImageButton.click();
			names.switchToNameEntry();
			// Names.NameEntry.VerifyLastName(lastName);
			names.nameEntry.closeTheScreen();
		}

		public void EnterAtRelatedPropertyDetails() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNoYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RelatedPropertyNo").substring(0, 2));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RelatedPropertyNo").substring(3, 9));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyItemNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RelatedPropertyNo").substring(10));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyItemNoEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAcknowledgeReason() {
			popup.acknowledge.okWithExpectedMessage("(9018) Reason is Required");
		}

		public void VerifyAcknowledgeProperty() {
			popup.acknowledge.okWithExpectedMessage("(9050) Enter the Property");
		}

		public void VerifyAcknowledgeValue() {
			popup.acknowledge.okWithExpectedMessage("(9124) Value is required");
		}

		public void VerifyAcknowledgeDescription() {
			popup.acknowledge.okWithExpectedMessage("(9051) Enter the Description");
		}

		public void VerifyAcknowledgePlateNumber() {
			if (Playback.browserType != "Chrome")
				popup.acknowledge.okWithExpectedMessage("(9006) Plate # or Hull # is required");
			else
				popup.acknowledge.okWithExpectedMessage("(9006) Plate No or Hull No is required");
		}

		public void VerifyAcknowledgeOwnerName() {
			popup.acknowledge.okWithExpectedMessage("(9161) Enter Owner Name");
		}

		public void VerifyAcknowledgeSecurityType() {
			popup.acknowledge.okWithExpectedMessage("(9008) Security Type is Required");
		}

		public void VerifyConfirmMessagePropertyIsAvailableInThePawnRecord() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(9164) This property is available in the pawn record. Do you want to check this?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(9164) This property is available in the pawn record. Do you want to check this?");
		}

		public void SelectGetProperty() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Property"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);
		}

		public void SelectPropertyAsGunsORFirearms() {

			if (uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.getText().contains("Guns"))

				uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Guns");
			else
				uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Firearms");

		}

		public void VerifyAcknowledgeGunType() {
			popup.acknowledge.okWithExpectedMessage("(9007) Gun Type is Required");
		}

		public void SelectSecurityType() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.propertyEntryMainTab.uISecurityTypeComboBox);
		}

		public void VerifyAcknowledgeDrugsType() {
			popup.acknowledge.okWithExpectedMessage("(9152) Enter Drug Type");
		}
		public void VerifyAcknowledgeRequiredEntriesMissing() {
			popup.acknowledge.okWithExpectedContainMessage("Required Entries are Missing");
		}
		public void VerifyAcknowledgeEnterMandatoryData() {
			popup.acknowledge.okWithExpectedContainMessage("Enter mandatory data");
		}

		public void VerifyAcknowledgeDrugMeasurement() {
			popup.acknowledge.okWithExpectedMessage("(9110) Select Drug measurement");
		}

		public void GetRelatedPropertyNo(String PropertyYear, String PropertyNo) {
			Playback.testContext.setAttribute("PropertyYear",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNoYearEdit.getAttribute("value"));
			Playback.testContext.setAttribute("PropertyNo",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNumberEdit.getAttribute("value"));
		}

		public void SelectDrugMeasurement() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementComboBox);
		}

		public void VerifyPropertyTypeArticle() {
			Assert.assertEquals("Article",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeTextView.getAttribute("value"));
		}

		public void VerifyPropertyTypeVehicle() {
			Assert.assertEquals("Vehicle",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeTextView.getAttribute("value"));
		}

		public void VerifyPropertyTypeGun() {
			Assert.assertEquals("Gun",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeTextView.getAttribute("value"));
		}

		public void VerifyPropertyTypeBoat() {
			Assert.assertEquals("Boat",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeTextView.getAttribute("value"));
		}

		public void VerifyPropertyTypeSecurity() {
			Assert.assertEquals("Security",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeTextView.getAttribute("value"));
		}

		public void SelectPCAsACCESS() {
			// uIMapProperty.propertyEntry.propertyEntryMainTab.uIPCLookup.click();
			// Popup.kPICodedLookup.RandomKPIHelpSelect();
			Playback.waitForControlReady();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPCLookup.sendKeys("ACCESS");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPCLookup.sendKeys(Keys.TAB);
		}

		public void VerifyAcknowledgeRelatedPropertyNumber() {
			if (Playback.browserType != "Chrome")
				popup.acknowledge.okWithExpectedMessage("(9136) Related Property # is required");
			else
				popup.acknowledge.okWithExpectedMessage("(9136) Related Property No is required");

		}

		public void VerifyReasonAsRecovered() {
			verify.ExpectedPropertyValueIsEqual("Recovered", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox));
		}

		public void VerifyDescriptionAs10Shirts() {

			verify.ExpectedPropertyValueIsEqual("10 Shirts",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit.getAttribute("value"));
		}

		public void VerifyDescriptionAsMyBicycleWasStolen() {

			verify.ExpectedPropertyValueIsEqual("My Bicycle was stolen",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit.getText());
		}

		public void VerifyAtSerialClothing() {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("SerialNo"),
					uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialClothingEdit.getAttribute("value"));
		}

		public void VerifyPCfieldAsACCESS() {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual("ACCESS",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIPCLookup.getAttribute("value"));
		}

		public void EnterAtAddress() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIAddressEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Address"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIAddressVerifyCheckbox.sendKeys(Keys.TAB);
		}

		public void EnterAtIntersection() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIAddressEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Intersection"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIAddressEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIAddressVerifyCheckbox.sendKeys(Keys.TAB);

		}

		public void VerifyInvalidAddressAcknowledge() {
			Playback.gridLoadThreadWait();
			popup.switchToAcknowledge();
			popup.acknowledge.okWithExpectedMessage("(5024) Invalid address");
		}

		public void VerifyAtPropertyItem() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Property"),
					objectIdentification.manualIdentify.getDropDownSelectedItem(
							uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox));
		}

		public void enterAtValue() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Value"));
		}

		public void EnterDecriptionAs1000KGDrugs() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit
					.sendKeys("1000 kilo grams drug was stolen");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDescriptionEdit.sendKeys(Keys.TAB);

		}

		public void EnterQuantityAs1000() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.sendKeys("1000");
		}

		public void enterValueAs28500() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.sendKeys("28500");
      uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.sendKeys(Keys.TAB);
		}

		public void VerifyDrugQuantityMeasurementFieldsMandatory() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityLable
					.getAttribute("style").contains("color: rgb(153, 0, 0)"));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementLabel
					.getAttribute("style").contains("color: rgb(153, 0, 0)"));
		}

		public void EnterAtDrugQuantity() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityEdit.clear();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityEdit
					.sendKeys(PoliceData.getPropertyModuleValue("DrugQuantity"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAcknowledgePropertyValueZero() {
			popup.acknowledge.okWithExpectedMessage("(9176) Property Value must be Zero");
		}

		public void EnterValueAs0() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.sendKeys("0");
			Playback.controlReadyThreadWait();
		}

		public void EnterDrugQuantityAs545() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityEdit.sendKeys("545");

		}

		public void SelectAtDrugType() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugTypeComboBox,
					PoliceData.getPropertyModuleValue("DrugType"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectAtCFSCode() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICFSCodeComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("CFSCode"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICFSCodeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtCFSCode1() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICFSCodeComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("CFSCode1"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICFSCodeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtReason1() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Reason1"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtPlateNumber() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIVehiclePlateNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PlateNo"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIVehiclePlateNoEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIVehiclePlateStateComboBox.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();

		}

		public void SelectAtCFSCode2() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICFSCodeComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("CFSCode2"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICFSCodeComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtQuantity() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.clear();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Quantity"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIQuantityEdit.sendKeys(Keys.TAB);
		}

		public void SelectChargeOrOffense() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.propertyEntryMainTab.uIChargeOrOffenseComboBox);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIChargeOrOffenseComboBox.sendKeys(Keys.TAB);
		}

		public void GetValue(String value) {
			Playback.testContext.setAttribute("value", uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit
					.getAttribute("value").replace("$", ""));
		}

		public void SelectAtNIBRS() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox,
					PoliceData.getPropertyModuleValue("NIBRS"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox.sendKeys(Keys.TAB);

		}

		public void ClickPlateOnlyCheckbox() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPlateOnlyCheckbox.click();
		}

		public void VerifyPropertyAsVehiclePartsAccessories() {
			verify.ExpectedPropertyValueIsEqual("Vehicle Parts/Accessories", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox));
		}

		public void VerifyAtSerialNo() {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("SerialNo"),
					uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialClothingEdit.getAttribute("value"));
		}

		public void VerifyAtModelNo() {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("ModelNo"),
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIModelNoEdit.getAttribute("value"));
		}

		public void SelectAtMeasurement() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementComboBox,
					PoliceData.getPropertyModuleValue("Measurement"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementComboBox.sendKeys(Keys.TAB);
		}

		public void clickOwnerUnknownCheckbox() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIOwnerUnknownCheckbox.click();
		}

		public void EnterAtDrugQuantity1() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugQuantityEdit
					.sendKeys(PoliceData.getPropertyModuleValue("DrugQuantity1"));

		}

		public void SelectAtMeasurement1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementComboBox,
					PoliceData.getPropertyModuleValue("Measurement1"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIMeasurementComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtDrugType2() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugTypeComboBox,
					PoliceData.getPropertyModuleValue("DrugType2"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIDrugTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyValueAs28500() {
			verify.ExpectedPropertyValueIsEqual("$28,500.00",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.getAttribute("value"));
		}

		public void EnterValueAs12345607() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.sendKeys("123456.07");

		}

		public void SelectPropertyAsAircraft() {

			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys("Aircraft");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);

		}

		public void SelectNIBRS() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtCaliber() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICaliberEdit.click();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICaliberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Caliber"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uICaliberEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtOwnerLastName() {
			Playback.controlReadyThreadWait();
			String lastName = uIMapProperty.propertyEntry.propertyEntryMainTab.uILastNameEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("LastName"), lastName);
		}

		public void verifyAtOwnerFirstName() {
			Playback.controlReadyThreadWait();
			String firstName = uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("FirstName"), firstName);
		}

		public void verifyAtOwnerMiddleName() {
			Playback.controlReadyThreadWait();
			String middleName = uIMapProperty.propertyEntry.propertyEntryMainTab.uIMiddleNameEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("MiddleName"), middleName);
		}

		public void clickRecoverForOtherAgencyCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRecoverOtherAgencyCheckBox.click();
		}

		public void verifyAcknowledgeNIBRSReportable() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(9122) This will not be a NIBRS reportable item");
		}

		public void verifyReasonAndPropertyDisabledToEdit() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.isEnabled());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.isEnabled());
		}

		public void verifyReasonIsDisabled() {
			String attribute = uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox
					.getAttribute("disabled");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
		}

		public void enterAtLastName1() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName1"));
			Playback.controlReadyThreadWait();
		}

		public void enterAtFirstName1() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName1"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtProperty1() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Property1"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtNIBRS1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox,
					PoliceData.getPropertyModuleValue("NIBRS1"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uINibrsComboBox.sendKeys(Keys.TAB);
		}

		public void verifySerialLabelAsMandatory() {
			String style = uIMapProperty.propertyEntry.propertyEntryMainTab.uIMandatorySerialLabel
					.getAttribute("style");
			verify.ExpectedValueIsTrue(style.contains("rgb(153, 0, 0)"));
		}

		public void verifySerialLabelAsNonMandatory() {
			String style = uIMapProperty.propertyEntry.propertyEntryMainTab.uISerialLabel.getAttribute("style");
			System.out.println(style);
			verify.ExpectedValueIsFalse(style.contains("rgb(153, 0, 0)"));
		}

		public void selectGunTypeAsMachineGun() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIGunTypeComboBox, "Machine Gun");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIGunTypeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtValue() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Value"),
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.getAttribute("value"));
		}

		public void verifyAt$Value() {
			verify.ExpectedPropertyValueIsEqual("$" + PoliceData.getPropertyModuleValue("Value"),
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.getAttribute("value"));
		}

		public void SelectAtPCCode() {
			// uIMapProperty.propertyEntry.propertyEntryMainTab.uIPCLookup.click();
			// Popup.kPICodedLookup.RandomKPIHelpSelect();
			Playback.waitForControlReady();
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPCLookup
					.sendKeys(PoliceData.getPropertyModuleValue("PCCODE"));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIPCLookup.sendKeys(Keys.TAB);
		}

		public String readValue() {
			return uIMapProperty.propertyEntry.propertyEntryMainTab.uIValueEdit.getAttribute("value").toString();
		}

		public void enterRelatedPropertyNo(String PropertyNo) {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNoYearEdit
					.sendKeys(PropertyNo.substring(0, 2));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNumberEdit
					.sendKeys(PropertyNo.substring(3, 9));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyItemNoEdit
					.sendKeys(PropertyNo.substring(10));
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyItemNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyReasonAndPropertyDefaultSelected() {
			int idx=	objectIdentification.manualIdentify.getDropDownSelectedItemIdex(uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox);
				verify.ExpectedValueIsTrue(idx>0);
			
			int idx1=	objectIdentification.manualIdentify.getDropDownSelectedItemIdex(uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox);
					verify.ExpectedValueIsTrue(idx1>0);
			
			}

		public void VerifyPropertyTypeDrugs() {
			verify.ExpectedPropertyValueIsEqual("Drugs",
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyTypeTextView.getAttribute("value"));
		}

		public void verifyAtReason() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Reason"), objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox));
		}
		
		public void verifyAtProperty() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Property"), objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapProperty.propertyEntry.propertyEntryMainTab.uIPropertyComboBox));
		}

		public void selectReasonAsRecovered() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox, "Recovered");
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIReasonComboBox.sendKeys(Keys.TAB);
		}

		public String readRelatedPropertyNo() {
			String relatedYr = uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNoYearEdit
					.getAttribute("value");
			String relatedNumber = uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNumberEdit
					.getAttribute("value");
			String relatedItemNo = uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyItemNoEdit
					.getAttribute("value");
			String relatedPropertyNo = relatedYr + "-" + relatedNumber + "-" + relatedItemNo;

			return relatedPropertyNo;
		}

		public void taboutRelatedPropertyNoField() {
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNoYearEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyNumberEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.propertyEntryMainTab.uIRelatedPropertyItemNoEdit.sendKeys(Keys.TAB);
		}
	}

	public class RecoveredTab {

		public void tabDateAndTime() {

			uIMapProperty.propertyEntry.recoveredTab.uIDateEdit.sendKeys(Keys.TAB);
			Playback.waitForControlReady();
			uIMapProperty.propertyEntry.recoveredTab.uITimeEdit.sendKeys(Keys.TAB);

		}

		public void tabOutQuantity() {
			uIMapProperty.propertyEntry.recoveredTab.uIQuantityEdit.sendKeys(Keys.TAB);

		}

		public void enterQuantityAs5() {
			uIMapProperty.propertyEntry.recoveredTab.uIQuantityEdit.sendKeys("5");

		}

		public void VerifyQuantityAs5() {
			verify.ExpectedPropertyValueIsEqual("5",
					uIMapProperty.propertyEntry.recoveredTab.uIQuantityEdit.getAttribute("value"));
		}

		public void tabOutValue() {
			uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.sendKeys(Keys.TAB);

		}

		public void VerifyQuantity(String Quantity) {

			Assert.assertEquals(Quantity,
					uIMapProperty.propertyEntry.recoveredTab.uIQuantityEdit.getAttribute("value"));

		}

		public void EnterValueAs50() {
			uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.sendKeys("50");

		}

		public void VerifyValueAs50() {
			verify.ExpectedPropertyValueIsEqual("50.00",
					uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.getAttribute("value"));
		}

		public void SelectAtHold() {
			uIMapProperty.propertyEntry.recoveredTab.uIHoldComboBox.sendKeys(PoliceData.getPropertyModuleValue("Hold"));
		}

		public void selectDisposition() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox);
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
		}

		public void selectDispositionAsSentToPropertyRoom() {

			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys("Sent To Property Room");
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void selectDispositionAsReturnedToOwner() {

			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys("Returned To Owner");
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void selectAtDisposition() {
			Playback.controlReadyThreadWait();
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox,
			// PoliceData.getPropertyModuleValue("Disposition"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Disposition"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void SelectInitialStorageLocation() {
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationLookupButton.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
			Playback.controlReadyThreadWait();
		}

		public void ClickBarCode() {

			uIMapProperty.propertyEntry.recoveredTab.uIBarcodeImageButton.click();

		}

		public void VerifyAcknowledgeDisposition() {
			popup.acknowledge.okWithExpectedMessage("(9092) Select a disposition for the recovered property");
		}

		public void VerifyAcknowledgeStorageLocation() {
			popup.acknowledge.okWithExpectedMessage("(9147) Enter Storage Location");
		}

		public void VerifyAcknowledgeQuantity() {
			popup.acknowledge.okWithExpectedMessage("(9102) Quantity is Required");
		}

		public void CloseThePrintScreen() {

			if (Playback.browserType.contains("Chrome")) {

				// click print button
				WebElement uIPrintButton = Playback.driver.findElement(By.cssSelector("button.cancel-popup-button"));
				uIPrintButton.click();
			}
			// else
			// WindowsControl.PrintWindow.CancelPrint();
		}

		public void CloseTheBarcodeScreen() {

			objectIdentification.windowHandle.switchToWindow("frmPropEntry");
			uIMapProperty.propertyEntry.driver.close();

		}

		public void EnterAtLastNameInPossOf() {
			uIMapProperty.propertyEntry.recoveredTab.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
		}

		public void EnterAtFirstNameInPossOf() {
			uIMapProperty.propertyEntry.recoveredTab.uIFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertyEntry.recoveredTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtInPossLastName() {
			uIMapProperty.propertyEntry.recoveredTab.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("InPossLastName"));
		}

		public void EnterAtInPossFirstName() {
			uIMapProperty.propertyEntry.recoveredTab.uIFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("InPossFirstName"));
		}

		public void VerifyAtLastName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("LastName"),
					uIMapProperty.propertyEntry.recoveredTab.uILastNameEdit.getAttribute("value"));
		}

		public void VerifyAtFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("FirstName"),
					uIMapProperty.propertyEntry.recoveredTab.uIFirstNameEdit.getAttribute("value"));
		}

		public void ClickOwnerCheckbox() {
			uIMapProperty.propertyEntry.recoveredTab.uIOwnerCheckbox.click();
		}

		public void VerifyAtReleasedLastName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("LastName"),
					uIMapProperty.propertyEntry.recoveredTab.uIReleasedToLastNameEdit.getAttribute("value"));
		}

		public void VerifyAtReleasedFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("FirstName"),
					uIMapProperty.propertyEntry.recoveredTab.uIReleasedToFirstNameEdit.getAttribute("value"));
		}

		public void EnterAtAddress() {
			uIMapProperty.propertyEntry.recoveredTab.uIAddressEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Address"));
			uIMapProperty.propertyEntry.recoveredTab.uIAddressVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void EnterAtIntersection() {
			uIMapProperty.propertyEntry.recoveredTab.uIAddressEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Intersection"));
			uIMapProperty.propertyEntry.recoveredTab.uIAddressEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.recoveredTab.uIAddressVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void VerifyInvalidAddressAcknowledge() {
			popup.switchToAcknowledge();
			popup.acknowledge.okWithExpectedMessage("(5024) Invalid address");
		}

		public void EnterQuantityAsDecimalValue() {
			uIMapProperty.propertyEntry.recoveredTab.uIQuantityEdit.sendKeys("559.25");

		}

		public void EnterValueAs15000() {
			uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.sendKeys("15000");

		}

		public void EnterValueAs100() {
			uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.click();
			uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.sendKeys("100");
			// uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.sendKeys(Keys.TAB);

		}

		public void EnterAtDrugPanelQuantity() {
			uIMapProperty.propertyEntry.recoveredTab.uIDrugPanelQuantityEdit.click();
			uIMapProperty.propertyEntry.recoveredTab.uIDrugPanelQuantityEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Quantity"));
		}

		public void EnterQuantityAs400() {
			uIMapProperty.propertyEntry.recoveredTab.uIDrugPanelQuantityEdit.click();
			uIMapProperty.propertyEntry.recoveredTab.uIDrugPanelQuantityEdit.sendKeys("400.54");

		}

		public void TabOutDrugQuantity() {
			uIMapProperty.propertyEntry.recoveredTab.uIDrugPanelQuantityEdit.sendKeys(Keys.TAB);

		}

		public void VerifyEvidenceLockerUseConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
		}

		public void VerifyEvidenceLockerUseConfirmContainMessage() {
			popup.confirm.yesWithContainsMessage(
					"Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
		}

		public void EnterRemarks() {
			uIMapProperty.propertyEntry.recoveredTab.uIRemarksEdit.sendKeys(Randomized.randomString(25));
		}

		public void VerifyAtDisposition() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Disposition"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox));
		}

		public void verifyBarCodeAvaliable() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIBarcodeImageButton.getAttribute("src")
					.contains("frmHandle"));
		}

		public void EnterDateAndTimeAs07022019() {
			uIMapProperty.propertyEntry.recoveredTab.uIDateEdit.sendKeys("07/02/2019");
			Playback.waitForControlReady();
			uIMapProperty.propertyEntry.recoveredTab.uITimeEdit.sendKeys(Keys.TAB);

		}

		public void EnterAtSendToLastName() {
			uIMapProperty.propertyEntry.recoveredTab.uISendToLastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("SentToLastName"));
		}

		public void EnterAtSendToFirstName() {
			uIMapProperty.propertyEntry.recoveredTab.uISendToFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("SentToFirstName"));
			uIMapProperty.propertyEntry.recoveredTab.uISendToFirstNameEdit.sendKeys(Keys.TAB);
		}

	public void EnterAtReleaseToLastName() {
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToLastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
		}

		public void EnterAtReleaseToFirstName() {
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void VerifyPRItemNoEmpty() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.recoveredTab.uIPRItemNoEdit.getAttribute("value") == null);
		}

		public void SelectNameByAtInPossName() {
			uIMapProperty.propertyEntry.recoveredTab.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Name").substring(0, 6));
			uIMapProperty.propertyEntry.recoveredTab.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.recoveredTab.uIFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Name").substring(7, 9));
			uIMapProperty.propertyEntry.recoveredTab.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();
			names.nameSearchHelpWindow.SelectName();

		}

		public void VerifyAtAddressCheckboxUncheck() {
			verify.ExpectedValueIsFalse(uIMapProperty.propertyEntry.recoveredTab.uIAddressVerifyCheckBox.isSelected());
		}

		public void VerifyAtAddressCheckboxChecked() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIAddressVerifyCheckBox.isSelected());
		}

		public void ClickAddressChechBoxandCancle() {

			uIMapProperty.propertyEntry.recoveredTab.uIAddressVerifyCheckBox.click();
			// popup.confirm.yesWithExpectedMessage("(5100) The entered address is not found
			// in the RMS Geo database. Click Yes to add this as a new address, or click No
			// to correct the entered address.");
			popup.confirm.noWithExpectedMessage(
					"(5100)     The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
		}

		public void ClickAddressChechBoxandAccept() {

			uIMapProperty.propertyEntry.recoveredTab.uIAddressVerifyCheckBox.click();
			popup.confirm.yesWithExpectedMessage(
					"(5100)     The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
			// popup.confirm.noWithExpectedMessage("(5100) The entered address is not found
			// in the RMS Geo database. Click Yes to add this as a new address, or click No
			// to correct the entered address.");
		}

		public void verifyAddressIbubblePresent() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIAddressIbubble.isDisplayed());
		}

		public void VerifyAtAddress() {
			String Actual = uIMapProperty.propertyEntry.recoveredTab.uIAddressEdit.getAttribute("value");
			String Expected = PoliceData.getRecordsModuleValue("Address");
			verify.ExpectedValueIsTrue(Actual.contains(Expected));

		}

		public void SelectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox,
					PoliceData.getPropertyModuleValue("Status"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
		}

		public void ClickStatusDropDown() {

			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.click();
			Playback.controlReadyThreadWait();
		}

		public void StatusDropDownIsDisplayed() {
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.isDisplayed();
		}

		public void enterAtInitialStorageLocation() {
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("StorageLocation"));
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}
		public void VerifyEvidenceLockerUseNoConfirmMessage() {

			popup.acknowledge.okWithExpectedMessage(
					"(9179) Evidence Locker is in use with another case’s property items. Access is restricted. Please select a different location that is not 'In Use'.");

		}

		public void SelectContainerAsBottle() {
			uIMapProperty.propertyEntry.recoveredTab.uIContainer.sendKeys("Bottle");
			uIMapProperty.propertyEntry.recoveredTab.uIContainer.sendKeys(Keys.TAB);
		}

		public void SelectPackageAsBottle() {
			uIMapProperty.propertyEntry.recoveredTab.uIPackage.sendKeys("Bottle");
			uIMapProperty.propertyEntry.recoveredTab.uIPackage.sendKeys(Keys.TAB);
		}

		public void SelectAtInitialStorageUsingDescription() {
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationLookupButton.click();
			Playback.controlReadyThreadWait();
			popup.switchToCodedSearch();
			propertyCodedLookup.enterAtDescription();
			propertyCodedLookup.clickSearchIcon();
			propertyCodedLookup.clickAtDescription();

		}
		public void SelectAtInitialStorageUsingCodeValue() {
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationLookupButton.click();
			Playback.controlReadyThreadWait();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.enterAtCode();
			popup.kPICodedLookup.clickSearchIcon();
			popup.kPICodedLookup.selectAtCodeValueInGrid();
		}

		public void EnterAtRemark() {
			uIMapProperty.propertyEntry.recoveredTab.uIRemarksEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Remarks"));
			uIMapProperty.propertyEntry.recoveredTab.uIRemarksEdit.sendKeys(Keys.TAB);
		}

		public void SelectDispositionAsSentToLab() {

			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox
					.sendKeys("Sent To Lab (Outside of the Property Room)");
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void selectAtInitialStorageLocation() {
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("StorageLocation"));
			// popup.switchToCodedSearch();
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit.sendKeys(Keys.TAB);
			popup.switchToCodedSearch();
			popup.kPICodedLookup.kPIHelpSelect(PoliceData.getPropertyModuleValue("StorageLocation"));
			Playback.controlReadyThreadWait();
		}

		public void clickInitialStorageLookUpIcon() {
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationLookupButton.click();
			Playback.controlReadyThreadWait();

		}

		public void verifyInitialStrorageLocation() {
			String Actual = uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationTextView
					.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("StorageLocation"), Actual);
		}

		public String readPropertyGeneratedDateAndTime() {
			String Date = uIMapProperty.propertyEntry.recoveredTab.uIDateEdit.getAttribute("value");
			String year = Date.substring(8, Date.length());
			String Time = uIMapProperty.propertyEntry.recoveredTab.uITimeEdit.getAttribute("value");
			// 08/05/20 18:
			String dateTime = Date.substring(0, 6) + year + " " + Time.substring(0, 3);
			return dateTime;
		}

		public void enterAtPFCode() {
			uIMapProperty.propertyEntry.recoveredTab.uIPFCodeEdit.sendKeys(PoliceData.getPropertyModuleValue("PFCode"));
			uIMapProperty.propertyEntry.recoveredTab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyContainerSeqNoAs1() {
			verify.ExpectedPropertyValueIsEqual("1", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapProperty.propertyEntry.recoveredTab.uIContainerSeqNo));
		}

		public void verifyRemarksFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIRemarksEdit.isDisplayed());
		}

		public void verifyInitialStorageFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationLookupButton.isDisplayed());
		}

		public void verifyContainerDropdownIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIContainer.isDisplayed());
		}

		public void verifyPackageDropdownIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIPackage.isDisplayed());
		}

		public void verifyOwnerWithCheclboxIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIOwnerCheckbox.isDisplayed());
		}

		public void verifyReleasedToNameIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIReleasedToLastNameEdit.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyEntry.recoveredTab.uIReleasedToFirstNameEdit.isDisplayed());
		}

		public void verifyReleasedToAddressAndCSZIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIAddressEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uICSZ.isDisplayed());
		}

		public void verifyORIFieldIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIORIDropdown.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIORICodeValue.isDisplayed());
		}

		public void selectAtDisposition1() {
			Playback.controlReadyThreadWait();
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox,
			// PoliceData.getPropertyModuleValue("Disposition"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Disposition1"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void selectAtDisposition2() {
			Playback.controlReadyThreadWait();
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox,
			// PoliceData.getPropertyModuleValue("Disposition"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Disposition2"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void selectAtDisposition3() {
			Playback.controlReadyThreadWait();
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox,
			// PoliceData.getPropertyModuleValue("Disposition"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Disposition3"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void selectAtDisposition4() {
			Playback.controlReadyThreadWait();
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox,
			// PoliceData.getPropertyModuleValue("Disposition"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Disposition4"));
			uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void enterAtRecoveredLocation() {
			uIMapProperty.propertyEntry.recoveredTab.uIRecoveredLocationEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RecoveredLocation"));
			uIMapProperty.propertyEntry.recoveredTab.uIRecoveredLocationEdit.sendKeys(Keys.TAB);

		}

		public void VerifyBarCodeAvaliable() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIBarcodeImageButton.getAttribute("src")
					.contains("frmHandle"));
		}

		public void selectAtPF() {
			Playback.waitForControlReady();
			uIMapProperty.propertyEntry.recoveredTab.uIPFLookupbutton.click();
			Playback.waitForControlReady();
			popup.kPICodedLookup.kPIHelpSelect(PoliceData.getPropertyModuleValue("PFCode"));

		}

		public void verifyAtPF() {
			String attribute = uIMapProperty.propertyEntry.recoveredTab.uIPFCodeEdit.getAttribute("value");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getPropertyModuleValue("PFCode")));
		}

		public void selectAtContainer() {
			uIMapProperty.propertyEntry.recoveredTab.uIContainer
					.sendKeys(PoliceData.getPropertyModuleValue("Container"));
		}

		public void verifyAtPackSeqNo() {
			//
			String dropDownSelectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapProperty.propertyEntry.recoveredTab.uIPackSeqNoDropDown);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(PoliceData.getPropertyModuleValue("PackSeqNo")));

		}

		public void enterAtReleaseName1() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToLastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName1"));
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToLastNameEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName1"));
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToFirstNameEdit.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();

		}

		public void verifyAtQuantity() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Quantity"),
					uIMapProperty.propertyEntry.recoveredTab.uIQuantityEdit.getAttribute("value"));
		}

		public void verifyAtValue() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Value"),
					uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.getAttribute("value"));
		}

		public void verifyInitialStrorageLocationIsMandatory() {
			String red = "rgba(153, 0, 0, 1)";
			String color = uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationLable.getCssValue("color");
			System.out.println(color);
			verify.ExpectedPropertyValueIsEqual(red, color);
		}

		public void selectAtPackage() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyEntry.recoveredTab.uIContainerPackageDropdown,
					PoliceData.getPropertyModuleValue("Package"));
			uIMapProperty.propertyEntry.recoveredTab.uIContainerPackageDropdown.sendKeys(Keys.TAB);
		}

		public void selectContainerAsPlasticBag() {
			uIMapProperty.propertyEntry.recoveredTab.uIContainer.sendKeys("Plastic Bag");
			uIMapProperty.propertyEntry.recoveredTab.uIContainer.sendKeys(Keys.TAB);
		}

		public void selectPackageAsSealedPlasticBag() {
			uIMapProperty.propertyEntry.recoveredTab.uIPackage.sendKeys("Sealed Plastic Bag");
			uIMapProperty.propertyEntry.recoveredTab.uIPackage.sendKeys(Keys.TAB);
		}

		public void SelectInitialStorageLocationAsL0000000012() {
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit.click();
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit.clear();
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit.sendKeys("L0000000012");
			uIMapProperty.propertyEntry.recoveredTab.uIInitialStorageLocationCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyStatusAsVisible() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox.isDisplayed());

		}

		public void verifyBarCodeIsDisplayed() {
			uIMapProperty.propertyEntry.recoveredTab.uIBarcodeImageButton.isDisplayed();
		}

		public void verifyContainerPackageIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIContainerPackageIcon.isDisplayed());

		}

		public void selectContainerSeqNoAsNew() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapProperty.propertyEntry.recoveredTab.uIContainerSeqNo, "-New-");

		}

		public void verifyContainerSeqNoAs2() {

			verify.ExpectedPropertyValueIsEqual("2", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapProperty.propertyEntry.recoveredTab.uIContainerSeqNo));

		}

		public void enterAtScanBarcodeRFID() {
			uIMapProperty.propertyEntry.recoveredTab.uIScanBarcodeRFIDedit
					.sendKeys(PoliceData.getPropertyModuleValue("RFIDValue"));
			uIMapProperty.propertyEntry.recoveredTab.uIScanBarcodeRFIDedit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickBatchScanItemsButton() {
			uIMapProperty.propertyEntry.recoveredTab.uIBatchScanItems.click();
			Playback.controlReadyThreadWait();
		}

		public void enterAtScanBarcodeRFIDPopup() {
			uIMapProperty.propertyEntry.recoveredTab.uIScanBarcodeRFIDPopupedit
					.sendKeys(PoliceData.getPropertyModuleValue("RFIDValue"));
			Playback.controlReadyThreadWait();
		}

		public void enterScanBarcodeRFIDPopup() {
			uIMapProperty.propertyEntry.recoveredTab.uIScanBarcodeRFIDPopupedit
					.sendKeys(Randomized.randomNumberString(3));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtScanBarcodeValueInPopupGrid(int rowIndex) {
			String value = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertyEntry.recoveredTab.uIScanBarcodeRFIDPopupGrid, "Item", rowIndex);

			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RFIDValue"), value);
		}

		public void clickUpdateButtonRFIDpopup() {
			uIMapProperty.propertyEntry.recoveredTab.uIRFIDpopupUpdateButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickCancleButtonRFIDpopup() {
			uIMapProperty.propertyEntry.recoveredTab.uIRFIDpopupCancleButton.click();
		}

		public void verifyBatchScanItemChangedToGreenColor() {

			String clr = uIMapProperty.propertyEntry.recoveredTab.uIBatchScanItems.getCssValue("color");
			verify.ExpectedValueIsTrue(clr.contains("rgba(0, 128, 0, 1)"));
		}

		public void verifyAtInitialStorageLocationDescription() {
			Playback.controlReadyThreadWait();
			String attribute = uIMapProperty.propertyEntry.recoveredTab.uIInitStorageLocationDescription
					.getAttribute("value");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(
					attribute.contains(PoliceData.getPropertyModuleValue("InitialStorageLocationDescription")));
		}

		public void verifyAt$Value() {
			verify.ExpectedPropertyValueIsEqual("$" + PoliceData.getPropertyModuleValue("Value"),
					uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.getAttribute("value"));
		}
    	public void verifyAtRecoveredValue()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.getAttribute("value"),PoliceData.getPropertyModuleValue("RecoveredValue"));
		}

		public void verifyAtDispositionNotPresent() {
			List<String> dropDownValues = objectIdentification.manualIdentify
					.getDropDownValues(uIMapProperty.propertyEntry.recoveredTab.uIDispositionComboBox);
			for (String value : dropDownValues) {
				if (value.contains("# " + PoliceData.getPropertyModuleValue("Disposition")))
					verify.ExpectedPropertyValueIsEqual("# " + PoliceData.getPropertyModuleValue("Disposition"), value);
			}
		}

		public void enterReleaseName() {

			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToLastNameEdit.sendKeys("Mike");
			uIMapProperty.propertyEntry.recoveredTab.uIReleasedToFirstNameEdit.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();

		}

		public void verifyCurrentStorageLocationEmpty() {
			String Actual = uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIcurrentStorageLocation.getText();
			verify.ExpectedValueIsTrue(Actual.isEmpty());
			Playback.controlReadyThreadWait();
		}
		public void verifyStatusAsDisabled() {
			Playback.pageLoadThreadWait();

			String status = uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIStatusDropdown
					.getAttribute("disabled");
			verify.ExpectedValueIsTrue(status.contains("true"));
		}

		public void verifyBarcodeIsVisible() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIBarCode.isDisplayed());
		}

		public void verifyAtInitialStrorageLocationDescription() {
			String Actual = uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIInitStorageLocationDescription
					.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Actual,
					PoliceData.getRecordsModuleValue("InitialStorageLocationDescription"));
			Playback.controlReadyThreadWait();
		}

		public void verifyQuantityAsDrugQuantity() {
			
		verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyEntry.recoveredTab.uIQuantityEdit.getAttribute("value"), PoliceData.getPropertyModuleValue("DrugQuantity"));	
		}

		public void VerifyValueAs0() {
			verify.ExpectedPropertyValueIsEqual("00.00",
					uIMapProperty.propertyEntry.recoveredTab.uIValueEdit.getAttribute("value"));
		}

		public void clickResetDateTime() {

			uIMapProperty.propertyEntry.recoveredTab.uIResetDateTime.click();

		}

public void verifyRecoveredDateTimeAsCurrentDate() {
			
			String fromDate = uIMapProperty.propertyEntry.recoveredTab.uIDateEdit.getAttribute("value");
					
			String actual = Randomized.getCurrentDate();
			System.out.println(actual);
			
			
			verify.ExpectedPropertyValueIsEqual(fromDate, actual);
			
		}

		public void verifyAtRFIDAsNull() {
	String NullRFID = uIMapProperty.propertyEntry.recoveredTab.uIScanBarcodeRFIDedit.getAttribute("value");
	verify.ExpectedPropertyValueIsEqual(NullRFID,PoliceData.getPropertyModuleValue("NullRFID"));
	
	
		}
		public void verifyAtDateAsCurrentDate() {
			
			String currentDate = Randomized.getCurrentDate();
			verify.ExpectedPropertyValueIsEqual(currentDate,
					uIMapProperty.propertyEntry.recoveredTab.uIDateEdit.getAttribute("value"));
		}
		
		public void verifyNameByAtInPossName() {
			
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uILastNameEdit.getAttribute("value").contains(PoliceData.getPropertyModuleValue("LastName")));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.recoveredTab.uIFirstNameEdit.getAttribute("value").contains(PoliceData.getPropertyModuleValue("FirstName")));

		}
		public void verifyActiveStorageLocationDescription(String storageLocation) {
			String attribute = uIMapProperty.propertyEntry.recoveredTab.uIInitStorageLocationDescription
					.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(storageLocation));
		}
	}

	public class PropertyEntryHistoryTab {
		public void VerifyTransDateAsCurrentDate() {
			// verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyEntry.PropertyEntryHistoryTab.
			// uIHistoryListResultTable, "Tran Date",
			// 0).getText().contains(Randomized.GetCurrentDate()));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryHistoryTab.uIHistoryListResultTable
					.getText().contains(Randomized.getCurrentDate("MM/dd/yy")));
		}

		public void VerifyAtPFCode() {
			// verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyEntry.PropertyEntryHistoryTab.
			// uIHistoryListResultTable, "PF Code",
			// 0).getText().contains(PoliceData.getPropertyModuleValue("PFCode")));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryHistoryTab.uIHistoryListResultTable
					.getText().contains(PoliceData.getPropertyModuleValue("PFCode")));
		}

		public void VerifyHistroyAsSentToLab() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryHistoryTab.uIHistoryListResultTable
					.getText().contains("Sent To Lab"));
		}

		public void VerifyHistroyAsMovedPropertyRoom() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryHistoryTab.uIHistoryListResultTable
					.getText().contains("Moved Into the Property Room"));
		}

		public void VerifyHistroyAsExceptionalRemoval()

		{
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryHistoryTab.uIHistoryListResultTable
					.getText().contains("EXR-Exceptional Removal (Closed)"));
		}

		public void verifyHistroyAsReceivedfromLab() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryHistoryTab.uIHistoryListResultTable
					.getText().contains("Received from Lab"));
		}

		public void verifyHistroyAsSentToPropertyRoom() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyEntry.propertyEntryHistoryTab.uIHistoryListResultTable
					.getText().contains("Sent To Property Room"));
		}

		public void verifyStatusChangesInHistory() {

			WebElement status = uIMapProperty.propertyIndex.propertyIndexHistoryTab.uIHistoryChangeStatus;
			List<WebElement> cells = status.findElements(By.xpath("//tbody//tr//td//table//tbody//tr//td"));

			for (WebElement cell : cells) {
				String actual = cell.getText().trim();
				if (actual.contains("ChangedStatus")) {
					verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("ChangedStatus"), actual);
					break;
				}
			}

		}

	}

	public class PropertyNCICCode {
		public void ClickAddNew() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyNCICCode.uIAddNewLink.click();
		}

		public void ClickSearch() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyNCICCode.uISearchButton.click();
		}

		public void VerifyAddedRecordInGridByAtPropertyCode() {
			WebElement PropertyCode = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyNCICCode.uIPropertyNCICResultGrid,
					PoliceData.getPropertyModuleValue("PropertyCode"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PropertyCode"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapProperty.propertyNCICCode.uIPropertyNCICResultGrid, PropertyCode,
									"Property Code")
							.getText());
		}

		public void ClickRandomRow() {
			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapProperty.propertyNCICCode.uIPropertyNCICResultGrid);
		}
	}

	public class PropertyNCICEntry {
		public void SelectAtPropertyCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyNCICEntry.uIPropertyCategoryComboBox,
					PoliceData.getPropertyModuleValue("PropertyCategory"));
		}

		public void SelectPropertyCategoryAsJewelry() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapProperty.propertyNCICEntry.uIPropertyCategoryComboBox, "Jewelry");
		}

		public void EnterAtPropertyCode() {

			uIMapProperty.propertyNCICEntry.uIPropertyCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyCode"));
			uIMapProperty.propertyNCICEntry.uIPropertyCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtDescription() {

			uIMapProperty.propertyNCICEntry.uIDescriptionEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Description"));
			uIMapProperty.propertyNCICEntry.uIDescriptionEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtUCRLineNo() {

			uIMapProperty.propertyNCICEntry.uIUCRLineNoEdit.sendKeys(PoliceData.getPropertyModuleValue("UCRLineNo"));
			uIMapProperty.propertyNCICEntry.uIUCRLineNoEdit.sendKeys(Keys.TAB);
		}

		public void SelectNIBRSAsAircraft() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyNCICEntry.uINIBRSComboBox,
					"Aircraft");
		}

		public void ClickSaveButton() {
			uIMapProperty.propertyNCICEntry.uISaveButton.click();
			popup.confirm.yes();
		}

	}

	public class PropertyRoomRoles {
		public PropertyRoomRoles() {
			if (this.propertyTab == null) {
				this.propertyTab = new PropertyTab();
			}

			if (this.storageTab == null) {
				this.storageTab = new StorageTab();
			}

			if (this.dispositionTab == null) {
				this.dispositionTab = new DispositionTab();
			}

			if (this.chainTab == null) {
				this.chainTab = new ChainTab();
			}
			if (this.attachmentsTab == null) {
				this.attachmentsTab = objectIdentification.new AttachmentsTab();
			}

			if (this.historyTab == null) {
				this.historyTab = new HistoryTab();
			}
			if (this.propertyRoomRolesRecoveredTab == null) {
				this.propertyRoomRolesRecoveredTab = new PropertyRoomRolesRecoveredTab();
			}
		}

		public PropertyTab propertyTab;
		public StorageTab storageTab;
		public DispositionTab dispositionTab;
		public ChainTab chainTab;
		public AttachmentsTab attachmentsTab;
		public HistoryTab historyTab;
		public PropertyRoomRolesRecoveredTab propertyRoomRolesRecoveredTab;

		public void VerifyPropertyStatusAsSentToLab() {

			verify.ExpectedPropertyValueIsEqual("Sent To Lab", uIMapProperty.propertyRoomRoles.uIStatusLable.getText(),
					"");

		}

		public void VerifyPropertyStatusAsReleased() {

			verify.ExpectedPropertyValueIsEqual("Released (Closed)",
					uIMapProperty.propertyRoomRoles.uIStatusLable.getText(), "");

		}

		public void SwitchToPropertyTab() {
			uIMapProperty.propertyRoomRoles.uIPropertyTabSpan.click();
		}

		public void SwitchToStorageTab() {
			uIMapProperty.propertyRoomRoles.uIStorageTabSpan.click();
			Playback.controlReadyThreadWait();
		}

		public void SwitchToDispositionTab() {
			uIMapProperty.propertyRoomRoles.uIDispositionTabSpan.click();
			Playback.waitForControlReady();
		}

		public void SwitchToChainTab() {
			uIMapProperty.propertyRoomRoles.uIChainTabSpan.click();
			Playback.pageLoadThreadWait();
		}

		public void SwitchToAttachmentsTab() {
			uIMapProperty.propertyRoomRoles.uIAttachmentsTabSpan.click();
			Playback.waitForControlReady();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void SwitchHistoryTab() {
			uIMapProperty.propertyRoomRoles.uIHistoryTabSpan.click();
			Playback.waitForControlReady();
			objectIdentification.windowHandle.switchToFrame("frmPropHist");
		}

		public void SaveTheScreen() {
			objectIdentification.manualIdentify.saveTheScreen();
			popup.confirm.yes();
		}

		public void SwitchToAllTabs() {
			uIMapProperty.propertyRoomRoles.uIPropertyTabSpan.click();
			uIMapProperty.propertyRoomRoles.uIStorageTabSpan.click();
			uIMapProperty.propertyRoomRoles.uIDispositionTabSpan.click();
			uIMapProperty.propertyRoomRoles.uIChainTabSpan.click();
			uIMapProperty.propertyRoomRoles.uIAttachmentsTabSpan.click();
			uIMapProperty.propertyRoomRoles.uIHistoryTabSpan.click();
		}

		public void CloseScreen() {
			uIMapProperty.propertyRoomRoles.driver.close();
		}

		public void VerifyAtStatus() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					uIMapProperty.propertyRoomRoles.uIStatusLable.getText());
		}

		public void VerifyAtStatus1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status1"),
					uIMapProperty.propertyRoomRoles.uIStatusLable.getText());
		}

		public void ClickPropertyInfoIcon() {
			uIMapProperty.propertyRoomRoles.uIPropertyNoInfoIcon.click();
			Playback.waitForControlReady();
		}

		public void verifySaveButtonsDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyRoomRoles.uISaveButton.getAttribute("class").contains("DisabledImgMnuItem"));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.uISaveAndCloseButton.getAttribute("class")
					.contains("DisabledImgMnuItem"));
		}

		public void saveAndClose() {
			objectIdentification.manualIdentify.saveAndCloseTheScreen();
			popup.confirm.yes();
		}

		public void switchToRecoverdTab() {
			uIMapProperty.propertyRoomRoles.uIRecoverdTab.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyPropertyStatusAsMovedIntothePropertyRoom() {
			String status = uIMapProperty.propertyRoomRoles.uIStatusLable.getText();
			verify.ExpectedPropertyValueIsEqual(status, "Moved Into the Property Room");
		}

		public void VerifyAtStatus(String Status)
		{
			verify.ExpectedPropertyValueIsEqual(Status, uIMapProperty.propertyRoomRoles.uIStatusLable.getText());
		}

		public void verifyUpdateSuccessfulBottomMessage() 
		{
			
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful",
					uIMapProperty.propertyRoomRoles.uIBottomLeftSideStatusBar.getText());

			
		}
	}

	public class PropertyTab {
		public void VerifyPCfieldAsACCESS() {
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual("ACCESS",
					uIMapProperty.propertyRoomRoles.propertyTab.uIPCLookup.getText());
		}

		public void EnterAtSerial() {
			uIMapProperty.propertyRoomRoles.propertyTab.uISerialNoEdit.click();
			uIMapProperty.propertyRoomRoles.propertyTab.uISerialNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("SerialNo"));
			uIMapProperty.propertyRoomRoles.propertyTab.uISerialNoEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtModel() {
			uIMapProperty.propertyRoomRoles.propertyTab.uIModelEdit.click();
			uIMapProperty.propertyRoomRoles.propertyTab.uIModelEdit
					.sendKeys(PoliceData.getPropertyModuleValue("ModelNo"));
			uIMapProperty.propertyRoomRoles.propertyTab.uIModelEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtSerialNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("SerialNo"),
					uIMapProperty.propertyRoomRoles.propertyTab.uISerialNoEdit.getAttribute("value"));
		}

		public void VerifyAtModelNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("ModelNo"),
					uIMapProperty.propertyRoomRoles.propertyTab.uIModelEdit.getAttribute("value"));
		}

		public void selectAtProperty() {
			uIMapProperty.propertyRoomRoles.propertyTab.uIPropertyComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Property"));
			uIMapProperty.propertyRoomRoles.propertyTab.uIPropertyComboBox.sendKeys(Keys.TAB);
		}
	}

	public class StorageTab {
		public void TabDataAndTime() {
			uIMapProperty.propertyRoomRoles.storageTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyRoomRoles.storageTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void TabOfficer() {
			uIMapProperty.propertyRoomRoles.storageTab.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox,
					PoliceData.getPropertyModuleValue("Action"));
			uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectAtAction1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox,
					PoliceData.getPropertyModuleValue("Action1"));
			uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectStorageLocationLookup() {
			uIMapProperty.propertyRoomRoles.storageTab.uIStorageLocationLookupIcon.click();
			Playback.controlReadyThreadWait();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
			Playback.controlReadyThreadWait();
		}

		public void VerifyEvidenceLockerUseConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
		}

		public void EnterAtCrimeLabNo() {
			uIMapProperty.propertyRoomRoles.storageTab.uICrimeLabEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CrimeLabNo"));

		}

		public void ClickActionDropDown() {
			uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox.click();
			Playback.controlReadyThreadWait();
		}

		public void ActionDropDownIsDisplayed() {
			uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox.isDisplayed();
			Playback.controlReadyThreadWait();
		}

		public void enterAtFollowUpDate() {
			uIMapProperty.propertyRoomRoles.storageTab.uIFollowupDateEdit.sendKeys(Randomized.getCurrentDate());

		}

		public void enterAtNotes() {
			uIMapProperty.propertyRoomRoles.storageTab.uINotesEdit.sendKeys(PoliceData.getPropertyModuleValue("Notes"));

		}

		public void verifyAtFollowUpDate() {
			String actual = uIMapProperty.propertyRoomRoles.storageTab.uIFollowupDateEdit.getText();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("FollowUp"), actual);

		}

		public void verifyAtNotes() {

			String actual = uIMapProperty.propertyRoomRoles.storageTab.uIFollowupNoteEdit.getText();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Notes"), actual);
		}

		public void verifyStorageLocationLookUpIconDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyRoomRoles.storageTab.uIStorageLocationLookupIcon.isDisplayed());
		}

		public String readLastAction() {
			String LastAction = uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox.getAttribute("value");
			System.out.println(LastAction);
			return LastAction;
		}

		public void verifyDateAndTimeFieldDisabled() {
			verify.ExpectedValueIsFalse(uIMapProperty.propertyRoomRoles.storageTab.uIDateEdit.isEnabled());
			verify.ExpectedValueIsFalse(uIMapProperty.propertyRoomRoles.storageTab.uITimeEdit.isEnabled());
		}

		public void verifyOfficerFieldDisabled() {
			verify.ExpectedValueIsFalse(uIMapProperty.propertyRoomRoles.storageTab.uIOfficerCodeEdit.isEnabled());
		}

		public void verifyActionFieldDisabled() {
			verify.ExpectedValueIsFalse(uIMapProperty.propertyRoomRoles.storageTab.uIActionCombobox.isEnabled());
		}

		public void verifyNotesFieldDisabled() {
			verify.ExpectedValueIsTrue(Boolean
					.parseBoolean(uIMapProperty.propertyRoomRoles.storageTab.uINotesEdit.getAttribute("readonly")));
		}

	public void SelectActionAsTOFTransferOutToAnOfficer() {
			// if (Url.contains("http://192.168.14.45"))
			// {
			uIMapProperty.propertyRoomRoles.storageTab.uIActionRadComboBox.click();
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyRoomRoles.storageTab.uIActionRadDropComboBox,
					"TOF-Transfer Out To An Officer");
			Playback.threadWait(2000);
			Playback.threadWait(2000);

}

		public void enterAtStorageLocation() {
			Playback.waitForControlReady();
			uIMapProperty.propertyRoomRoles.storageTab.uIStorageLocationCodeEdit.clear();
			uIMapProperty.propertyRoomRoles.storageTab.uIStorageLocationCodeEdit
			.sendKeys(PoliceData.getPropertyModuleValue("StorageLocation"));
			uIMapProperty.propertyRoomRoles.storageTab.uIStorageLocationCodeEdit.sendKeys(Keys.TAB);



			}
		public void clickActionArrow() {
			uIMapProperty.propertyRoomRoles.storageTab.uIActionArrow.click();
		}

		public void selectAtActionRadDropdown() 
		{
			uIMapProperty.propertyRoomRoles.storageTab.uIActionArrow.click();
			objectIdentification.manualIdentify.selectPropertyAction(uIMapProperty.propertyRoomRoles.storageTab.uIActionRadDropdown93, PoliceData.getPropertyModuleValue("Action"));
		}
	}

	public class DispositionTab {
		public WebDriver driver;

		public DispositionTab() {

			driver = uIMapProperty.propertyRoomRoles.driver;

		}

		public void TabTheDateAndTime() {

			uIMapProperty.propertyRoomRoles.dispositionTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyRoomRoles.dispositionTab.uITimeEdit.sendKeys(Keys.TAB);

		}

		public void TabTheOfficer() {

			uIMapProperty.propertyRoomRoles.dispositionTab.uIOfficerCodeEdit.sendKeys(Keys.TAB);

		}

		public void SelectDispositionAsReleased() {

			uIMapProperty.propertyRoomRoles.dispositionTab.uIDispositionDropDown.sendKeys("Released");
			uIMapProperty.propertyRoomRoles.dispositionTab.uIDispositionDropDown.sendKeys(Keys.TAB);
		}

		public void SelectReleasedTo() {
			Playback.waitForControlReady();
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToLastNameEdit.sendKeys("A");
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToLupSerchButton.click();
			names.nameSearchHelpWindow.SelectName();

		}

		public void SaveAndCloseTheScreen() {

			objectIdentification.manualIdentify.saveAndCloseTheScreen();
			popup.confirm.yes();
		}

		public void SelectAtDisposition() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyRoomRoles.dispositionTab.uIDispositionDropDown,
					PoliceData.getPropertyModuleValue("Disposition"));
			uIMapProperty.propertyRoomRoles.dispositionTab.uIDispositionDropDown.sendKeys(Keys.TAB);
		}

		public void SelectAtName() {
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToLastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			names.nameSearchHelpWindow.SelectName();

		}

		public void EnterAtNotes() {
			uIMapProperty.propertyRoomRoles.dispositionTab.uINotes.sendKeys("NoteTest");
			uIMapProperty.propertyRoomRoles.dispositionTab.uINotes.sendKeys(Keys.TAB);
		}

		public void EnterAtLastNameandFirstName() {
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToLastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToLastNameEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertyRoomRoles.dispositionTab.uIReleasedToFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void verifyAtLastActionDateAndTime(String LastAction) {
			String Date = uIMapProperty.propertyRoomRoles.dispositionTab.uIDateEdit.getText();
			String Time = uIMapProperty.propertyRoomRoles.dispositionTab.uIDateEdit.getText();
			verify.ExpectedValueIsTrue(LastAction.contains(Date));
			verify.ExpectedValueIsTrue(LastAction.contains(Time.substring(0, 3)));
			System.out.println(LastAction);

		}

		public void verifyAtDisposition() {
//             WebElement actual=uIMapProperty.propertyRoomRoles.dispositionTab.uIDispositionDropDown.getAttribute("selected");
//             System.out.println(actual);
//             verify.ExpectedValueIsTrue( actual.contains(PoliceData.getPropertyModuleValue("Disposition")));

			WebElement actual = uIMapProperty.propertyRoomRoles.dispositionTab.uIDispositionDropDown;
			Select select = new Select(actual);
			WebElement option = select.getFirstSelectedOption();
			String SelectedText = option.getText();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Disposition"), SelectedText);
		}
	}

	public class ChainTab {

		public WebDriver driver;

		public ChainTab() {

			this.driver = uIMapProperty.propertyRoomRoles.chainTab.driver;

		}

		public void VerifyPropertyStatusInTheGridAsSentToLab() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapProperty.propertyRoomRoles.chainTab.uIChainTabUsrCustodyTable);
		}
		public void verifyPropertyStatusInTheGridByActiveData(String action) {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyRoomRoles.chainTab.uIChainTabUsrCustodyTable, "Action", 0);
			verify.ExpectedPropertyValueIsEqual(gridCell.getText(), action);
		}

		public void VerifyActionAsMovedIntoPropertyRoomInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual("Moved Into the Property Room",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyRoomRoles.chainTab.uIChainTabUsrCustodyTable, "Action", rowIndex));
		}

		public void ClickUpdateButton() {
			uIMapProperty.propertyRoomRoles.chainTab.uIUpdateButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtRelinquishedBy() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RelinquishedBy"),
					uIMapProperty.propertyRoomRoles.chainTab.uIRelinquishedByCodeEdit.getAttribute("value"));
		}

		public void VerifyReceivedByPFCodeEditable() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.chainTab.uIReceivedByCodeEdit
					.getAttribute("class").contains("textbox"));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.chainTab.uIReceivedByCodeEdit.isEnabled());
		}

		public void SelectReceivedBy() {
			uIMapProperty.propertyRoomRoles.chainTab.uIReceivedByLookupButton.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();

		}

		public void EnterAtReceivedBy() {
			uIMapProperty.propertyRoomRoles.chainTab.uIReceivedByCodeEdit.clear();
			uIMapProperty.propertyRoomRoles.chainTab.uIReceivedByCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("ReceivedBy"));
			uIMapProperty.propertyRoomRoles.chainTab.uIReceivedByCodeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyActionAsSentToLabInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual("Sent To Lab", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertyRoomRoles.chainTab.uIChainTabUsrCustodyTable, "Action", rowIndex));
		}

		public void VerifyOfficerIdenticalConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(9071) Relinquished By and Received By officers are identical. Do you want to proceed?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(9071) Relinquished By and Received By officers are identical. Do you want to proceed?");
		}

		public void SelectRelinquishedCheckbox() {
			uIMapProperty.propertyRoomRoles.chainTab.uIRelinquishedSign.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectReceivedCheckbox() {
			uIMapProperty.propertyRoomRoles.chainTab.uIReceivedSign.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyRelinquishedBySignImageIsDisplayed() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyRoomRoles.chainTab.uIRelinqSignImage.isDisplayed();
		}

		public void clickUpdateButtonWithConfrim() {
			uIMapProperty.propertyRoomRoles.chainTab.uIUpdateButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void selectRelinquishedSignatureCheckbox() {
			uIMapProperty.propertyRoomRoles.chainTab.uIRelinquishedSign.click();
			Playback.controlReadyThreadWait();
		}

		public void selectReceivedBySignatureCheckbox() {
			Playback.pageLoadThreadWait();
			uIMapProperty.propertyRoomRoles.chainTab.uIReceivedSign.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyReceivedBySignImageIsDisplayed() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyRoomRoles.chainTab.uIRecvdBySignImage.isDisplayed();
		}

		public void verifyAtRecievedBy() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RecievedBy"),
					uIMapProperty.propertyRoomRoles.chainTab.uIReceivedByCodeEdit.getAttribute("value"));
		}

		public void selectAtActionInGrid()
		{
		objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapProperty.propertyRoomRoles.chainTab.uIChainTabUsrCustodyTable, PoliceData.getPropertyModuleValue("Action"));

		}

public void SelectAtReceivedByInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapProperty.propertyRoomRoles.chainTab.uIChainTabUsrCustodyTable, PoliceData.getPropertyModuleValue("ReceivedBy"));
			}

		public void verifyRelinquishedBySignatureImageIsDisplayed()
		{
		String attribute = uIMapProperty.propertyRoomRoles.chainTab.uIRelinqSignImage.getAttribute("src");
		verify.ExpectedValueIsTrue(!attribute.contains("NoSignature.jpg"));
		}

		public void verifyReceivedBySignatureImageIsDisplayed()
		{
		String attribute = uIMapProperty.propertyRoomRoles.chainTab.uIRecvdBySignImage.getAttribute("src");
		verify.ExpectedValueIsTrue(!attribute.contains("NoSignature.jpg"));
		}
			public void clickPropertyInGridByPF() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapProperty.propertyRoomRoles.chainTab.uIChainTabUsrCustodyTable,
					PoliceData.getPropertyModuleValue("PF"));
		}
	}

	public class HistoryTab {
		public void VerifySentToLapHistory() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText().contains("Sent To Lab"),
					"");
		}
		public void VerifyAtStatusInFirstElementHistory(String status, int rowIndex) {

			WebElement firstElement = Playback.driver.findElement(
					By.xpath("(//table[@id='listStack']//tr//table[@id='Table2']/tbody)[" + rowIndex + 1 + "]"));
			verify.ExpectedValueIsTrue(firstElement.getText().contains(status));
		}

		public void VerifyReleasedHistory() {

			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText().contains("Released"), "");
		}

		public void VerifyTransDateAsCurrentDate() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains(Randomized.getCurrentDate("MM/dd/yy")));
		}

		public void VerifyAtPFCode() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains(PoliceData.getPropertyModuleValue("PFCode")));
		}

		public void VerifyHistroyAsSentToLab() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText().contains("Sent To Lab"));
		}

		public void VerifyHistroyAsMovedPropertyRoom() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains("Moved Into the Property Room"));
		}

		public void VerifyAtSerialNo() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains(PoliceData.getPropertyModuleValue("SerialNo")));
		}

		public void VerifyAtModelNo() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains(PoliceData.getPropertyModuleValue("ModelNo")));
		}

		public void verifyHistroyAsReceivedfromLab() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains("Received from Lab"));
		}

		public void verifyHistroyAsSentToPropertyRoom() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains("Sent To Property Room"));
		}

		public void verifyHistroyAsDestroyedClosed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains("Sent To Property Room"));
		}

		public void verifyAtHistroy() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable.getText()
					.contains(PoliceData.getPropertyModuleValue("History")));
		}

		public void verifyAtRecentHistroy() {
			String recent = uIMapProperty.propertyRoomRoles.historyTab.uIHistoryListTable
					.findElement(By.xpath("((//table[@id='Table2'])[1]//td//td)[1]")).getText();
			verify.ExpectedPropertyValueIsEqual(recent, PoliceData.getPropertyModuleValue("RecentHistory"));
		}
	}

	public class PropertyRoomRolesRecoveredTab {
		public void verifyInitialStrorageLocationIsDisable() {
			verify.ExpectedValueIsFalse(
					!uIMapProperty.propertyRoomRoles.propertyRoomRolesRecoveredTab.uIInitialStorageLocationRead
							.isEnabled());

		}

		public void verifyDispositionFieldDisabled() {
			verify.ExpectedValueIsFalse(
					uIMapProperty.propertyRoomRoles.propertyRoomRolesRecoveredTab.uIDispositionComboBox.isEnabled());
		}
	}

	public class PropertyUpdate {

		public void EnterAtCaseNo() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uICaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2));
			uIMapProperty.propertyUpdate.uICaseNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(3));
			uIMapProperty.propertyUpdate.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPropertyNo() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uIPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
			uIMapProperty.propertyUpdate.uIPropertyNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(3, 9));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
		}

		public void EnterAtCase() {

			uIMapProperty.propertyUpdate.uICaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2));
			uIMapProperty.propertyUpdate.uICaseNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(3));
			uIMapProperty.propertyUpdate.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCaseInfoButton() {

			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.uICaseInfoButton.isDisplayed(),
					"Case Info Button Not Displayed");

		}

		public void clickExpandButton() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uIExpandButton.click();

		}

		public void clickSearchButton() {
			uIMapProperty.propertyUpdate.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectTheSelectAllCheckBox() {
			if (!uIMapProperty.propertyUpdate.uISelectAllCheckBox.isSelected())
				uIMapProperty.propertyUpdate.uISelectAllCheckBox.click();

		}

		public void SelectTheLockerAllCheckBox() {
			if (!uIMapProperty.propertyUpdate.uIchkLockerAllCheckBox.isSelected())
				uIMapProperty.propertyUpdate.uIchkLockerAllCheckBox.click();

		}

		public void VerifyPropertyItemAppearsInTheGrid() {
			Playback.controlReadyThreadWait();
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapProperty.propertyUpdate.uIPropertyUpdateTable);

			WebElement uIRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("CaseNo"));

			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
									PoliceData.getPropertyModuleValue("CaseNo").toString())
							.isDisplayed(),
					"Row Not displayed in the Grid");

		}

		public void VerifyAtPropertyNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PropertyNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Property#", rowIndex));
		}

		public void VerifyAtStorage(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Storage"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Storage", rowIndex));
		}

		public void SelectTheUpdateCheckboxInTheGrid() {

			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("CaseNo"));

		}

		public void selectUpdateCheckboxByAtPropertyNo() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
		}

		public void ClickTheProceedWithSelectionButton() {
			uIMapProperty.propertyUpdate.uIProceedWithSelectionButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickUpdateButton() {
			uIMapProperty.propertyUpdate.uIUpdateButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyPropertyStatusInTheGridAsMovedIntoThePropertyRoom(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Moved Into the Property Room", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex));
		}

		public void VerifyPropertyStatusInTheGridAsL100010100000002(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("L100010100000002", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Storage", rowIndex));
		}

		public void VerifyAtStorage1InGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Storage1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Storage", rowIndex));
		}

		public void VerifyPropertyStatusInTheGridAsSentToLab(int rowIndex) {
			// String frt =
			// objectIdentification.manualIdentify.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
			// "Status", rowIndex);
			// System.out.println(frt);
			// verify.ExpectedPropertyValueIsEqual("Sent To Lab",
			// uIMapProperty.propertyUpdate.uIStatusColumnRowValue.getText());
			verify.ExpectedPropertyValueIsEqual("Sent To Lab", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex));
		}

		public void VerifyPRIconColorAsGreenUsingStorage() {
			WebElement uIPRCell = objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("Storage"),
					"PR");
			verify.ExpectedValueIsTrue(uIPRCell.getCssValue("background-image").contains("open_items_icon"));
		}

		public void ClickOnThePRIcon(int rowIndex) {
			WebElement uIPRCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "PR", rowIndex);
			uIPRCell.click();
		}

		public void ClickUpdateCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("CaseNo"));

		}
	public void ClickUpdateCheckboxUsingPropertyNo() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("PropertyNo"));

		}
		public void ClickEvidenceCheckbox() {
			uIMapProperty.propertyUpdate.uIEvidenceLockerCheckbox.click();
		}

		public void clickStatutoryLimitationReachedCheckBoxIfNotSelected() {
			if (!uIMapProperty.propertyUpdate.uIStatutoryLimitationReachedCheckBox.isSelected())
				uIMapProperty.propertyUpdate.uIStatutoryLimitationReachedCheckBox.click();
		}

		public void uncheckStatutoryLimitationReachedCheckBox() {
			if (uIMapProperty.propertyUpdate.uIStatutoryLimitationReachedCheckBox.isSelected())
				uIMapProperty.propertyUpdate.uIStatutoryLimitationReachedCheckBox.click();
		}

		public void ClickIncludeClosedItemsCheckbox() {
			uIMapProperty.propertyUpdate.uIIncludeClosedItemsCheckbox.click();
		}

		public void ClickNextButton() {
			uIMapProperty.propertyUpdate.uINextButton.click();
		}

		public void VerifyAtProperty() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PropertyNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("PropertyNo")).getText());
		}

		public void VerifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("CaseNo")).getText());
		}

		public void ClickSelectAllCheckbox() {
			uIMapProperty.propertyUpdate.uISelectAllCheckBox.click();
		}

		public void VerifyAtPropertyStatusInTheGrid() {
			verify.ExpectedPropertyValueIsEqual("Moved Into the Property Room",
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("PropertyNo"), "Status").getText(),
					"Property Status Message not matched");
		}

		public void verifyAtStatusUsingPropertyNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("PropertyNo"), "Status").getText());
		}

		public void ClickPRIconUsingCaseNo() {
			WebElement uIPRCell = objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("CaseNo"),
					"PR");
			uIPRCell.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyNoRecordAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else {
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
			}
		}

		public void VerifyScreenExpanded() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.uICaseYearEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.uICaseNoEdit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.uIOfficerCodeEdit.isDisplayed());
		}

		public void VerifyStatusColumnAsSentToPropertyRoom() {
			Playback.controlReadyThreadWait();
			List<String> statusValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status");
			verify.ExpectedValueIsTrue(statusValues.contains("Sent To Property Room"));
		}

		public void VerifyStatusAsMovedIntoThePropertyRoomUsingPropertyNo() {
			verify.ExpectedPropertyValueIsEqual("Moved Into the Property Room",
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("PropertyNo"), "Status").getText());
		}

		public void ClickPRIconUsingPropertyNo() {
			WebElement uIPRCell = objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("PropertyNo"),
					"PR");
			uIPRCell.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtProperty() {
			uIMapProperty.propertyUpdate.uIPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
		uIMapProperty.propertyUpdate.uIPropertyNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(5, 9));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
		}

		public void ClickAtPropertyNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
			Playback.controlReadyThreadWait();
		}

		public void EnterRequestNo(String requestNo) {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uIRequestYearEdit.sendKeys(requestNo.substring(0, 2));
			uIMapProperty.propertyUpdate.uIRequestNoEdit.sendKeys(requestNo.substring(3));
			uIMapProperty.propertyUpdate.uIRequestNoEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtStatusUsingPropertyNo1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("PropertyNo1"), "Status").getText());
		}

		public void VerifyAtStatusUsingCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("CaseNo"), "Status").getText());
		}

		public void VerifyPullRequestScreenUpdateAcknowledgeMessage() {
			popup.switchToAcknowledge();
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(
					"(9185) Go to the Pull Request screen to update actions for the property available in Pull Request No"));
			popup.acknowledge.ok();
		}

		public void VerifyPropertyStatusInTheGridAsReceivedfromCourt(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Received from Court",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex),
					"Property Status Message not matched");
		}

		public void EnterAtCrimeLabNo() {
			uIMapProperty.propertyUpdate.uICrimeLabNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CrimeLabNo").toString());
		}

		public void verifyAtStatus1UsingPropertyNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status1"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("PropertyNo"), "Status").getText());
		}

		public void enterAtPropertyNoAndCount() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uIPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
			uIMapProperty.propertyUpdate.uIPropertyNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(3, 9));
			uIMapProperty.propertyUpdate.uIPropertyNoEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit.sendKeys(Keys.TAB);
		}

		public void VerifyPRIconViewInGridUsingPropertyNo() {

			WebElement uIPRCell = objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getRecordsModuleValue("PropertyNo"),
					"PR");
			verify.ExpectedValueIsTrue(uIPRCell.getAttribute("title").contains("Property Room"));
		}

		public void verifyUpdateButtonAsEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.uIUpdateButton.isEnabled());
		}

		public void EnterPropertyByActiveData(String PropertyNo) {
			uIMapProperty.propertyUpdate.uIPropertyYearEdit.sendKeys(PropertyNo.substring(0, 2));
			uIMapProperty.propertyUpdate.uIPropertyNoEdit.sendKeys(PropertyNo.substring(4, 9));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit.sendKeys(PropertyNo.substring(10));
		}

		public void SelectUpdateCheckboxByActivePropertyNo(String PropertyNo) {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PropertyNo);
		}

		public void clickMoreFiltersButton() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uIExpandButton.click();

		}

		public void clickUpdateCheckboxByCaseNo() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PoliceData.getPropertyModuleValue("CaseNo"));

		}

		public void verifyPropertyStatusInTheGridAsReceivedfromLab(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Received from Lab",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex),
					"Property Status Message not matched");
		}

		public void clickUpdateCheckboxByActivePropertyNo(String Property) {

			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify
					.selectGridRowCheckBoxByCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, Property);

		}

		public void verifyAtStatus2UsingPropertyNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status2"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
							PoliceData.getPropertyModuleValue("PropertyNo"), "Status").getText());
		}

		public void verifyAtStatusInGrid() {
			Playback.controlReadyThreadWait();
			List<String> statusValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status");
			verify.ExpectedValueIsTrue(statusValues.contains(PoliceData.getPropertyModuleValue("Status")));
		}

		public void verifyAtStatus1InGrid() {
			Playback.controlReadyThreadWait();
			List<String> statusValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status");
			verify.ExpectedValueIsTrue(statusValues.contains(PoliceData.getPropertyModuleValue("Status1")));
		}

		public void verifyOfficerIsEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.uIOfficerCodeEdit.isEnabled());
		}

		public void verifyStorageColumnValuesIsNotNull() {

			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Storage") != null);
		}

		public void enterAtPropertyNo1() {
			// Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uIPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo1").substring(0, 2));
			uIMapProperty.propertyUpdate.uIPropertyNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo1").substring(4, 9));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo1").substring(10));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPropertyByActiveData(String PropertyNo) {
			uIMapProperty.propertyUpdate.uIPropertyYearEdit.sendKeys(PropertyNo.substring(0, 2));
			uIMapProperty.propertyUpdate.uIPropertyNoEdit.sendKeys(PropertyNo.substring(4, 9));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit.sendKeys(PropertyNo.substring(10));
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit.sendKeys(Keys.TAB);
		}

		public void clickUpdateCheckboxByPropertyNo() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));

		}

		public PropertyUpdate() {
			if (this.propertyUpdatePopup == null) {
				this.propertyUpdatePopup = new PropertyUpdatePopup();
			}
		}

		public PropertyUpdatePopup propertyUpdatePopup;

		public void verifyStatusColumnAsSignedOutForCourt() {
			Playback.controlReadyThreadWait();
			List<String> statusValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status");
			verify.ExpectedValueIsTrue(statusValues.contains("Signed Out For Court"));
		}

		public void mouseHoverAtRemarksColumnToVerify(int rowIndex) {
			Actions mousehover = new Actions(Playback.driver);
			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Remarks", rowIndex));
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Remarks", rowIndex);
			Playback.controlReadyThreadWait();
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(gridCell.getAttribute("title"),
					PoliceData.getPropertyModuleValue("RemarksToolTip"));

		}

		public void enterAtStorageLocation() {
			uIMapProperty.propertyUpdate.uIStorageLocationEdit.click();
			uIMapProperty.propertyUpdate.uIStorageLocationEdit.clear();
			uIMapProperty.propertyUpdate.uIStorageLocationEdit
					.sendKeys(PoliceData.getPropertyModuleValue("StorageLocation"));
			uIMapProperty.propertyUpdate.uIStorageLocationEdit.sendKeys(Keys.TAB);
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtStorageLocation1() {
			uIMapProperty.propertyUpdate.uIStorageLocationEdit.click();
			uIMapProperty.propertyUpdate.uIStorageLocationEdit.clear();
			uIMapProperty.propertyUpdate.uIStorageLocationEdit
					.sendKeys(PoliceData.getPropertyModuleValue("StorageLocation1"));
			uIMapProperty.propertyUpdate.uIStorageLocationEdit.sendKeys(Keys.TAB);
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void clearPropertyNo() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.uIPropertyYearEdit.clear();
			uIMapProperty.propertyUpdate.uIPropertyNoEdit.clear();
			uIMapProperty.propertyUpdate.uIPropertyItemNoEdit.clear();
		}

		public void verifyStorageLookUpIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.uIStorageLocationLookUpIcon.isDisplayed());
		}

		public void clickUpdateCheckboxByActivePropertyNo(String propertyNo, int slno) {
			if (slno == 0) {
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable, propertyNo);
			} else {
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable, propertyNo + "-" + slno + "");
			}
		}

		public void clickStorageColumnHeader() {
			Playback.driver.findElement(By.xpath("//th[text()='Storage']")).click();
			Playback.gridLoadThreadWait();
		}

		public void verifySortedOrderIsAscending() {

			String sortedOrder = Playback.driver.findElement(By.xpath("//th[text()='Storage']//img"))
					.getAttribute("title");
			verify.ExpectedValueIsTrue(sortedOrder.contains("Ascending"));

		}

		public void verifyCheckboxCheckedByAtPropertyNo(int slno) {
			if (slno == 0) {
				WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
						PoliceData.getPropertyModuleValue("PropertyNo"));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, row, "Update")
						.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
			} else {
				WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
						PoliceData.getPropertyModuleValue("PropertyNo" + slno + ""));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, row, "Update")
						.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
			}

		}

		public void verifyCheckboxUnCheckedByAtPropertyNo(int slno) {
			if (slno == 0) {
				WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
						PoliceData.getPropertyModuleValue("PropertyNo"));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, row, "Update")
						.findElement(By.tagName("img")).getAttribute("title").contains("Unchecked"));
			} else {
				WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
						PoliceData.getPropertyModuleValue("PropertyNo" + slno + ""));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, row, "Update")
						.findElement(By.tagName("img")).getAttribute("title").contains("Unchecked"));
			}

		}

		public void verifyStatusColumnByActivePropertyNo(String PropertyNoWithoutSequence, int slno) {
			WebElement rowText;
			rowText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable, PropertyNoWithoutSequence + "-" + slno + "");
			List<WebElement> cells = rowText.findElements(By.xpath(".//td"));
			for (WebElement cell : cells) {
				if (cell.getText().startsWith(PoliceData.getPropertyModuleValue("Status"))) {
					System.out.println(cell.getText());
					verify.ExpectedPropertyValueIsEqual(cell.getText(), PoliceData.getPropertyModuleValue("NewStatus"));
				} else if (cell.getText().startsWith(PoliceData.getPropertyModuleValue("Status1"))) {
					System.out.println(cell.getText());
					verify.ExpectedPropertyValueIsEqual(cell.getText(), PoliceData.getPropertyModuleValue("OldStatus"));
				}

			}

		}

		public void VerifyPropertyStatusInTheGridAsSentToPropertyRoom(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Sent To Property Room", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex));
		}

		public void clickUpdateCheckboxByAtPropertyNo(int slno) {
			if (slno == 0) {
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
						PoliceData.getPropertyModuleValue("PropertyNo"));
			} else {
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
						PoliceData.getPropertyModuleValue("PropertyNo") + slno + "");
			}
		}

		public void verifyUpdateButtonIsNotDisplayed() {
			verify.ExpectedValueIsFalse(uIMapProperty.propertyUpdate.uIUpdateButton.isDisplayed());
		}

		public void verifyTheUpdateCheckboxCheckedInTheGrid() {
			WebElement status = objectIdentification.manualIdentify
					.getGridRowCheckBoxByIndex(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, 0);
			verify.ExpectedValueIsTrue(status.getAttribute("title").contains("Checked"));
		}

		public void verifyPropertyNoByActiveData(String propertyNo, int row) {
			verify.ExpectedPropertyValueIsEqual(propertyNo, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Property#", row));
		}

		public void verifyPrintBarCodeButtonDisable() {
			verify.ExpectedValueIsFalse( uIMapProperty.propertyUpdate.uIPrintBarcodeForSelectedItemsButton.isEnabled());
		}
		public void verifyPrintBarCodeButtonEnabled() {
			verify.ExpectedValueIsTrue( uIMapProperty.propertyUpdate.uIPrintBarcodeForSelectedItemsButton.isEnabled());
		}

		public void clickAllUpdateCheckboxes() {
		int rows =	objectIdentification.manualIdentify.getGridTableRowsCount( uIMapProperty.propertyUpdate.uIPropertyUpdateTable);
			for(int i=0;i<rows;i++)
			{
				clickUpdateCheckBoxByIndexInGrid(i);
			}
		}

		public void clickUpdateCheckBoxByIndexInGrid(int index) {
			WebElement Checkboxcell = Playback.driver
					.findElement(By.xpath("//div[@id='grdPRBatchUpdt']/table/tbody/tr/td"));
			List<WebElement> allcheckbox = Checkboxcell.findElements(By.tagName("img"));
			WebElement checkbox = allcheckbox.get(index);
			checkbox.click();

			// WebElement checkbox = objectIdentification.manualIdentify
			// .getGridRowCheckBoxByIndex(uIMapProperty.propertyUpdateHelpWindow.uIPropertyUpdateTable,
			// index);
			// checkbox.click();

		}

		public void clickPrintBarcodeForSelectedButton() {
			 uIMapProperty.propertyUpdate.uIPrintBarcodeForSelectedItemsButton.click();
		}

		public void ClickAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyUpdate.uIPropertyUpdateTable,
					PoliceData.getPropertyModuleValue("CaseNo"));
			Playback.controlReadyThreadWait();
		}

		public String readPropertyUpdateStatusinGrid(int rowIndex)
		{
		String Status = objectIdentification.manualIdentify.getGridCellInnerText(
		uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex).toString();
		System.out.println(Status);
		return Status;
		}

		public void clickPRColumnByIndex(int rowIndex)
		{
		//objectIdentification.manualIdentify.getGridColumnIndex(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "PR");
		objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "PR", rowIndex).click();
		}
		
			public void verify9011TranscationDateIsrequired() {
			popup.acknowledge.okWithExpectedMessage("(9011) Transaction Date is required");
		}

		public void clickPrintButton() {
			uIMapProperty.propertyUpdate.uIPrintButton.click();
			
		}
			public void veriyStatusColumnValuesAsDimGrayColor(int rowIndex) {
			// Dim Gray rgba(105, 105, 105, 1)
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex);
			String cssValue = gridCell.getCssValue("color");
			System.out.println(cssValue);
			verify.ExpectedValueIsTrue(cssValue.contains("rgba(105, 105, 105, 1)"));
		}

		public String readStorageLocationInGrid(int rowIndex) {
			String Status = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Storage", rowIndex)
					.toString();
			System.out.println(Status);
			return Status;
		}
		public String readStatusInGridByIndex(int rowIndex) {
			String status = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyUpdate.uIPropertyUpdateTable, "Status", rowIndex);
			return status;
		}

	}

	public class PropertyUpdatePopup {
		public WebDriver driver;
		// public static String Url = ConfigurationManager.AppSettings["Url"];
		public String Url = PropertiesFile.readPropertiesFile("url");

		public void tabTheDateAndTime() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uITimeEdit.sendKeys(Keys.TAB);

		}

		public void SelectAtAction() {
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyUpdate.propertyUpdatePopup
			// .uIActionComboBox, PoliceData.getPropertyModuleValue("Action"));
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys(Keys.TAB);

			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
					PoliceData.getPropertyModuleValue("Action"));
			Playback.threadWait(2000);
			Playback.threadWait(2000);
		}

		public void SelectAtAction1() {
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertyUpdate.propertyUpdatePopup
			// .uIActionComboBox, PoliceData.getPropertyModuleValue("Action"));
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys(Keys.TAB);

			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
					PoliceData.getPropertyModuleValue("Action1"));
			Playback.threadWait(2000);
			Playback.threadWait(2000);
		}

		public void SelectActionAsPROMovedIntothePropertyRoom() {
			// if (Url.contains("http://192.168.14.45"))
			// {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			// objectIdentification.manualIdentify.SelectRadControlDropDownValueSelect(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
					"PRO-Moved Into the Property Room");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadExpandComboBox.click();
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadExpandComboBox.sendKeys(Keys.TAB);
			Playback.threadWait(2000);
			Playback.threadWait(2000);
			// }
			// else
			// {
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys("PRO-Moved
			// Into the Property Room");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys(Keys.TAB);
			// Playback.controlReadyThreadWait();
			// Playback.threadWait(2000);
			// }

		}

		public void selectActionAsSTLSentToLab() {

			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys("");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys(Keys.TAB);
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			// objectIdentification.manualIdentify.SelectRadControlDropDownValueSelect(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox, "STL-Sent To Lab");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadExpandComboBox.click();
			Playback.threadWait(2000);
		}

		public void SelectReceivedBy() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByLupSrchButton.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();

		}

		public void EnterAtReceivedBy() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit
					.sendKeys((PoliceData.getPropertyModuleValue("ReceivedBy")));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.sendKeys(Keys.TAB);
		}

		public void VerifyStorageLocationAsMandateFiled() {

			verify.ExpectedPropertyValueIsEqual("req",
					Playback.driver.findElement(By.id("idStorage")).getAttribute("class"),
					"Storage Location Not shown as Mandate");
			Playback.waitForControlReady();
		}

		public void SelectStorageLocation() {
			Playback.waitForControlReady();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.click();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationLookupButton.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();

		}

		public void SelectStorageLocationAsL0000000004() {
			Playback.waitForControlReady();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.click();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.sendKeys("L0000000004");
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.sendKeys(Keys.TAB);
			popup.confirm.yes();
		}

		public void SelectStorageLocationAsL0000000001() {
			Playback.waitForControlReady();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.click();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.sendKeys("L0000000001");
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.sendKeys(Keys.TAB);
			popup.confirm.yes();
		}

		public void clickUpdateButtonWithConfrim() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIUpdateButton.click();
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void VerifyStorageLocationAsMandateAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(9147) Enter Storage Location");
		}

		public void ClickUpdateButton() {
			objectIdentification.manualIdentify
					.setFocusElement(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIUpdateButton);
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIUpdateButton.click();

		}

		public void EnterFollowDateAs5thDayFromCurrentDate() {

			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIFollowUpDate.sendKeys(Randomized.getFutureDate(5));

		}

		public void SelectAtStorageLocation1() {
			Playback.waitForControlReady();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationLookupButton.click();
			Playback.waitForControlReady();
			popup.kPICodedLookup.kPIHelpSelect(PoliceData.getPropertyModuleValue("Storage1"));

		}

		public void VerifyEvidenceLockerUseConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
		}

		public void VerifyAtRelinquisheBy() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RelinquishedBy"),
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedByCodeEdit.getAttribute("value"));
		}

		public void VerifyAtEMPPFNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PFNo"),
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIEmpNoEdit.getAttribute("value"));
		}

		public void EnterAtPFNo() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIPFNoCodeEdit.clear();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIPFNoCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PFNo"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIPFNoCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectActionAsSignedOutForCourt() {
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys("STC-Signed
			// Out For Court");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys(Keys.TAB);
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			// objectIdentification.manualIdentify.SelectRadControlDropDownValueSelect(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
					"STC-Signed Out For Court");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadExpandComboBox.click();
			Playback.threadWait(2000);
		}

		public void SelectActionAsReceivedFromCourt() {
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys("RFC-Received
			// from Court");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionComboBox.sendKeys(Keys.TAB);
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			// objectIdentification.manualIdentify.SelectRadControlDropDownValueSelect(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
					"RFC-Received from Court");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadExpandComboBox.click();
			Playback.threadWait(2000);
			Playback.threadWait(2000);
		}

		public void VerifyEvidenceLockerUseNoConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.noWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
			} else
				popup.confirm.noWithExpectedMessage(
						"(9179) Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
		}

		public void VerifyLastStorageLocationConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(9094) Enter the last storage location");
			} else
				popup.confirm.yesWithExpectedMessage("(9094) Enter the last storage location");
		}

		public void VerifyRelinquishedReceivedByOfficersIdenticalConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(9071) Relinquished By and Received By officers are identical. Do you want to proceed?");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(9071) Relinquished By and Received By officers are identical. Do you want to proceed?");
		}

	
	public void selectActionAsReceivedFromLab() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			// objectIdentification.manualIdentify.SelectRadControlDropDownValueSelect(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox, "RFL-Received from Lab");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadExpandComboBox.click();
			Playback.threadWait(2000);
			Playback.threadWait(2000);

		}
		
	public void SelectActionAsSentToPropertyRoom() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			// objectIdentification.manualIdentify.SelectRadControlDropDownValueSelect(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
					"STP-Sent To Property Room");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadExpandComboBox.click();
			Playback.threadWait(2000);
			Playback.threadWait(2000);
		}

		public void EnterAtRelinquisheBy() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedByCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RelinquishedBy"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedByCodeEdit.sendKeys(Keys.TAB);
		}

		
	public void SelectAtExceptionalRemoval() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadComboBox.click();
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox,
					"EXR-Exceptional Removal (Closed)");
			// uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionRadDropComboBox.click();

			Playback.threadWait(2000);
		}
		public void enterRemark() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRemarksEdit.clear();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRemarksEdit.sendKeys(Randomized.randomString(15));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRemarksEdit.sendKeys(Keys.TAB);
		}

		
    	public void SelectAtStorageLocation() {
			Playback.waitForControlReady();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationLookupButton.click();
			Playback.waitForControlReady();
			popup.switchToCodedSearchII();
			propertyCodedLookup.enterCode(PoliceData.getPropertyModuleValue("StorageLocation"));
			propertyCodedLookup.clickSearchIcon();
			propertyCodedLookup.kPIHelpSelect(PoliceData.getPropertyModuleValue("StorageLocation"));

		}

		public void SelectStorageLocationAsL0000000012() {
			Playback.waitForControlReady();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.click();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.sendKeys("L0000000012");
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.sendKeys(Keys.TAB);
			// popup.confirm.yes();
		}

		public void ClickActionDropdown() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionDropdown.click();
		}

		public void ActionDropDownShownAsTreeView() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIActionTreeView.isDisplayed();
		}

		public void enterAtStorageLocation() {
			Playback.waitForControlReady();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.click();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.clear();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("StorageLocation"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationCodeEdit.sendKeys(Keys.TAB);

		}

		public void verifyAtReceivedBy() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("ReceivedBy"),
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.getAttribute("title"));
		}

		public void clickOwnerCheckbox() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIOwnerCheckbox.click();
		}

		public void enterAtLastName() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void verifyRelinquishedByIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedByLabel.isDisplayed());
		}

		public void verifyReceivededByIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByLabel.isDisplayed());
		}

		public void enterAtReceivedByLastName() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByLastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByLastNameEdit.sendKeys(Keys.TAB);

		}

		public void enterAtReceivedByFirstName() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByFirstNameEdit.sendKeys(Keys.TAB);
			names.switchToNameSearchHelpWindow();
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void enterAtReceivedByPFNo() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.clear();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PFNo"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.sendKeys(Keys.TAB);
		}

		public void clickCancelButton() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uICancelButton.click();
		}

		public void verifyAtReceivedByPF() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PFNo"),
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.getAttribute("value"));
		}

		public void SelectRelinquishedCheckbox() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedSignCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyRelinquishedBySignImageIsDisplayed() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinqSignImage.isDisplayed();
		}

		public void verifyStatusRequiredAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(9022) Status is required");
		}

		public void verifyPropertyUpdateAcknowledge(String PropertyNo) {
			popup.acknowledge.okWithExpectedMessage(
					"(10017) Invalid Action selected. Property must be received before other action selected"
							+ PropertyNo + ";");
		}

		public void selectReceivedCheckbox() {
			Playback.pageLoadThreadWait();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedSignCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyReceivedBySignImageIsDisplayed() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRecvdBySignImage.isDisplayed();
		}

		public void verifyAtTransPFNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PFNo"),
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIPFNoCodeEdit.getAttribute("value"));
		}

		public void verifyAtReceivedByLastName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("LastName"),
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedByLastNameEdit
							.getAttribute("title"));
		}

		public void verifyAtReceivedByFirstName() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("FirstName"),
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByFirstNameEdit.getAttribute("title"));
		}

		public void enterAtRemarks() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRemarksEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Remarks"));
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRemarksEdit.sendKeys(Keys.TAB);
		}

		public void verifyRelinquishedByAndReceivedByIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReLinquishedByText.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByText.isDisplayed());
		}

		public void verifyRelinquishedByPFNo() {
			String PfID = uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReLinquishedByPFNo.getAttribute("title");
			verify.ExpectedPropertyValueIsEqual(PfID, PoliceData.getPropertyModuleValue("UserName"));
		}

		public void enterReceivedByPFNoAsCadTest() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByPFNo.sendKeys("CadTest");
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByPFNo.sendKeys(Keys.TAB);
		}

		public void verifyStorageLocationLookUpIconDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationLookupButton.isDisplayed());
		}

		public void clearReceivedBy() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.click();
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.clear();
		}

		public void verifyActionComboboxShowsReceivedFromCourt() {
			WebElement item = Playback.driver.findElement(By.xpath("(//div[@id=\"Radstatusdd\"]//span)[1]//span[1]"));
			String selectedItem = item.getText();
			verify.ExpectedPropertyValueIsEqual(selectedItem, PoliceData.getPropertyModuleValue("Action"));

		}

		public void clickStorageLocationLookUpIcon() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIStorageLocationLookupButton.click();
		}

		public void verifyRelinquishedByPFIsEnabled() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedByCodeEdit.isEnabled();
		}

		public void verifyReceivedByPFIsEnabled() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedByCodetEdit.isEnabled();
		}

		public void clickSignatureImageInRelinquishedBy() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinquishedBySignImage.click();
		}

		public void clickSignatureImageInReceivedBy() {
			uIMapProperty.propertyUpdate.propertyUpdatePopup.uIReceivedBySignImage.click();

		}

		public void clickRelinqByClickHereToSignButton()
		{
		uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinqSignImageButton.click();

		}
		public void clickRcvdByClickHereToSignButton()
		{
		uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRecvdBySignImageButton.click();

		}



		public void verifyRelinquishedBySignatureImageIsDisplayed()
		{
		String attribute = uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRelinqSignImageButton.getAttribute("src");
		verify.ExpectedValueIsTrue(!attribute.contains("NoSignature.jpg"));
		}



		public void verifyReceivedBySignatureImageIsDisplayed()
		{
		String attribute = uIMapProperty.propertyUpdate.propertyUpdatePopup.uIRecvdBySignImageButton.getAttribute("src");
		verify.ExpectedValueIsTrue(!attribute.contains("NoSignature.jpg"));
		}

		public void verifyAtEMPPFDescription() {
			String attribute = uIMapProperty.propertyUpdate.propertyUpdatePopup.uIEmpNoDescEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getPropertyModuleValue("PFNoDescription")));
		}
	}

	public class PropertyUpdateHelpWindow {
		public void EnterRequestNo(String requestNo) {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdateHelpWindow.uIRequestYearEdit.sendKeys(requestNo.substring(0, 2));
			uIMapProperty.propertyUpdateHelpWindow.uIRequestNoEdit.sendKeys(requestNo.substring(3));
			uIMapProperty.propertyUpdateHelpWindow.uIRequestNoEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtStatusUsingPropertyNo1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapProperty.propertyUpdateHelpWindow.uIPropertyUpdateTable,
									PoliceData.getPropertyModuleValue("PropertyNo1"), "Status")
							.getText());
		}

		public void VerifyAtStatusUsingPropertyNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapProperty.propertyUpdateHelpWindow.uIPropertyUpdateTable,
									PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 9), "Status")
							.getText());
		}

		public void VerifyAtStatusUsingCaseNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapProperty.propertyUpdateHelpWindow.uIPropertyUpdateTable,
									PoliceData.getPropertyModuleValue("CaseNo"), "Status")
							.getText());
		}

		public void VerifyPullRequestScreenUpdateAcknowledgeMessage() {
			popup.switchToAcknowledge();
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(
					"(9185) Go to the Pull Request screen to update actions for the property available in Pull Request No"));
			popup.acknowledge.ok();
		}

		public void TabTheDateAndTime() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uITimeEdit.sendKeys(Keys.TAB);

		}

//		public void SelectAtAction() {
//			objectIdentification.manualIdentify.selectDropDownOption(
//					uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIActionComboBox,
//					PoliceData.getPropertyModuleValue("Action"));
//			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIActionComboBox.sendKeys(Keys.TAB);
//		}
		public void SelectAtAction() {
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIActionRadExpandComboBox.click();
			objectIdentification.manualIdentify.selectPropertyAction(
					uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIActionRadDropComboBox,
					PoliceData.getPropertyModuleValue("Action"));
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIActionRadDropComboBox.sendKeys(Keys.TAB);
		}


		public void ClickSelectAllCheckbox() {
			uIMapProperty.propertyUpdateHelpWindow.uISelectAllCheckBox.click();
		}

		public void ClickTheProceedWithSelectionButton() {
			uIMapProperty.propertyUpdateHelpWindow.uIProceedWithSelectionButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtPFNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PFNo"),
					uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIPFNoCodeEdit
							.getAttribute("value"));
		}

		public void EnterAtPFNo() {
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIPFNoCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PFNo"));
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIPFNoCodeEdit.sendKeys(Keys.TAB);
		}

		public void ClickUpdateButtonWithConfrim() {
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIUpdateButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void VerifyStorageLocationAsMandateAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(9147) Enter Storage Location");
		}

		public void ClickUpdateButton() {
			objectIdentification.manualIdentify.setFocusElement(
					uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIUpdateButton);
			uIMapProperty.propertyUpdateHelpWindow.propertyUpdateHelpWindowPopup.uIUpdateButton.click();

		}

		public void Close() {
			uIMapProperty.propertyUpdateHelpWindow.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void clickUpdateCheckBoxByIndexInGrid(int index) {
			WebElement Checkboxcell = Playback.driver
					.findElement(By.xpath("//div[@id='grdPRBatchUpdt']/table/tbody/tr/td"));
			List<WebElement> allcheckbox = Checkboxcell.findElements(By.tagName("img"));
			WebElement checkbox = allcheckbox.get(index);
			checkbox.click();

			// WebElement checkbox = objectIdentification.manualIdentify
			// .getGridRowCheckBoxByIndex(uIMapProperty.propertyUpdateHelpWindow.uIPropertyUpdateTable,
			// index);
			// checkbox.click();

		}

		public void clickUpdateButton() {
			objectIdentification.manualIdentify
					.setFocusElement(uIMapProperty.propertyUpdateHelpWindow.uIProceedWithSelectionButton);
			uIMapProperty.propertyUpdateHelpWindow.uIProceedWithSelectionButton.click();

		}

		public void EnterRemarks() {
			uIMapProperty.propertyUpdateHelpWindow.uIRemarkEdit.sendKeys(Randomized.randomAlphanumericSpecialCharsPasswordString(5));
		}
	}

	public class AttachPropertyPopup {

		public void ClickCheckboxOnGrid() {

			objectIdentification.randomIdentify
					.selectRandomGridRowCheckbox(uIMapProperty.attachPropertyPopup.uIResultTable);

		}

		public void ClickAttachPropertyReportButton() {
			uIMapProperty.attachPropertyPopup.uIAttachPropertyReportButton.click();

		}

		public void SelectCheckBoxUsingAtPropertyNo() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.attachPropertyPopup.uIResultTable, PoliceData.getPropertyModuleValue("PropertyNo"));
		}

		public void verifyRowviewedRedColor() {

			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.attachPropertyPopup.uIResultTable, "**Deleted**")
					.getAttribute("class").contains("gridrowbgclr"));
			Playback.gridLoadThreadWait();
		}
	}

	public class PropertyIndex {
		public RecoveredTab recoveredTab;
		public PropertyEntryHistoryTab propertyIndexHistoryTab;
		public PropertyEntryMainTab propertyIndexMainTab;
    	public PropertyIndexRecoveredTab propertyIndexRecoveredTab;
		public PropertyIndex() {
			
			if (this.propertyIndexRecoveredTab == null) {
				this.propertyIndexRecoveredTab = new PropertyIndexRecoveredTab();
			}
      			if ((this.propertyIndexMainTab == null)) {
				this.propertyIndexMainTab = new PropertyEntryMainTab();
			}
			if ((this.recoveredTab == null)) {
				this.recoveredTab = new RecoveredTab();
			}
			if ((this.propertyIndexHistoryTab == null)) {
				this.propertyIndexHistoryTab = new PropertyEntryHistoryTab();
			}
		}
		public void closeTheScreen() {

			uIMapProperty.propertyIndex.driver.close();
		}

		public void VerifyPropertyNo(String PropertyYear, String PropertyNo) {
			verify.ExpectedPropertyValueIsEqual(PropertyYear,
					uIMapProperty.propertyIndex.uIPropertyYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PropertyNo,
					uIMapProperty.propertyIndex.uIPropertyNumberEdit.getAttribute("value"));
		}

		public void ClickDelete() {
			uIMapProperty.propertyIndex.uIDeleteButton.click();
		}

		public void VerifyAtPropertyNo() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("ActivityNo").substring(0, 2),
					uIMapProperty.propertyIndex.uIPropertyYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("ActivityNo").substring(3, 6),
					uIMapProperty.propertyIndex.uIPropertyNumberEdit.getAttribute("value"));

		}
		public void verifyAtPropertyNo(String PropertyNo) {
			verify.ExpectedPropertyValueIsEqual(PropertyNo.substring(0, 2),
					uIMapProperty.propertyIndex.uIPropertyYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(PropertyNo.substring(3, 9),
					uIMapProperty.propertyIndex.uIPropertyNumberEdit.getAttribute("value"));

		}

		public void VerifyConfirmDeleteMessage() {
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				popup.switchToConfirm();
				popup.confirm.yesWithExpectedMessage(
						"(9123) This is an APPROVED property item; this item will still appear in APPROVED reports. The associated SEQUENCE# and ITEM# will not be Reused in this property report.<BR>  <font Color=Red> Do you want to delete? </font>");
			} else {
				popup.switchToConfirm();
				String warningMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"(9123) This is an APPROVED property item; this item will still appear in APPROVED reports. The associated SEQUENCE# and ITEM# will not be Reused in this property report."));
				verify.ExpectedValueIsTrue(warningMessage.contains("Do you want to delete?"));
				popup.confirm.yes();

			}
			Playback.pageLoadThreadWait();
		}

		public void VerifySentToPropertyRoomInMenuBar() {
			verify.ExpectedPropertyValueIsEqual("Sent To Property Room",
					uIMapProperty.propertyIndex.uIMenubar.getText(), "");
		}

		public void ClickOnRecoveredTab() {
			uIMapProperty.propertyIndex.uIRecoveredTab.click();

		}

		public void ClickPropertyBblIcon() {
			uIMapProperty.propertyIndex.uIPropertyBblIcon.click();
		}

		public void clickReportDetailsButton() {

			uIMapProperty.propertyIndex.uIReportDetailsButton.click();
			Playback.waitForPageLoad();
		}

		public void switchToHistoryTab() {
			uIMapProperty.propertyIndex.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmPropHist");
		}

		public void VerifyAtCurrentStatus() {
			String actual = uIMapProperty.propertyIndex.uIStatusTextView.getText();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"), actual);

		}

		public void clickOnMainTab() {
			uIMapProperty.propertyIndex.uIMainTab.click();

		}

		public void saveTheScreen() {

			uIMapProperty.propertyIndex.uISaveButton.click();
			popup.confirm.yes();
		}

		public void saveNCloseTheScreen() {

			uIMapProperty.propertyIndex.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void verifyAtCaseNo(String CaseNo) {
			verify.ExpectedPropertyValueIsEqual(CaseNo.substring(0, 2),
					uIMapProperty.propertyIndex.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(CaseNo.substring(3),
					uIMapProperty.propertyIndex.uICaseNumberEdit.getAttribute("value"));

		}
		public void verifyAddButtonIsDisable() {
			uIMapProperty.propertyIndex.uIAddNewButton.getAttribute("disabled").contains("disabled");
			
		}

		public void verifyNotifyEnabled() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.uINotifyButton.isEnabled());

		}

		public void clickNotifyButton() {
			uIMapProperty.propertyIndex.uINotifyButton.click();

		}

		public void verifyReportDetailsButtonIsNotDisplayed() {
			List<WebElement> row = Playback.driver.findElements(By.xpath("//table[@id='Table3']//td/input"));

			for (WebElement element : row) {
				if (element.getAttribute("type").contains("submit")) {
					verify.ExpectedValueIsFalse(Playback.driver
							.findElement(By.xpath("//table[@id='Table3']//input[@type='submit']")).isDisplayed());
				} else {
					verify.ExpectedValueIsTrue(true);
				}
			}
		}
	}

public class PropertyIndexMainTab {
		public void selectAtReason() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertyIndex.propertyIndexMainTab.uIReasonComboBox,
					PoliceData.getPropertyModuleValue("Reason"));
		}

	}

	public class PropertyIndexRecoveredTab {
		public void verifyInitialStrorageLocation() {
			String Actual = uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIInitStorageLocationValue
					.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Actual, PoliceData.getRecordsModuleValue("StorageLocation"));
			Playback.controlReadyThreadWait();
		}

		public void verifyCurrentStorageLocationEmpty() {
			String Actual = uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIcurrentStorageLocation.getText();
			verify.ExpectedValueIsTrue(Actual.isEmpty());
			Playback.controlReadyThreadWait();
		}

		public void verifyStatusAsVisible() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIStatusDropdown.isDisplayed());
		}

		public void verifyStatusAsDisabled() {
			Playback.pageLoadThreadWait();

			String status = uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIStatusDropdown
					.getAttribute("disabled");
			verify.ExpectedValueIsTrue(status.contains("true"));
		}

		public void verifyBarcodeIsVisible() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIBarCode.isDisplayed());
		}

		public void verifyAtInitialStrorageLocationDescription() {
			String Actual = uIMapProperty.propertyIndex.propertyIndexRecoveredTab.uIInitStorageLocationDescription
					.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Actual,
					PoliceData.getRecordsModuleValue("InitialStorageLocationDescription"));
			Playback.controlReadyThreadWait();
		}
	}

	public class PropertyIndexHistoryTab {
		public void VerifyAtPFCode() {
			// verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getGridCell(uIMapProperty.propertyEntry.PropertyEntryHistoryTab.
			// uIHistoryListResultTable, "PF Code",
			// 0).getText().contains(PoliceData.getPropertyModuleValue("PFCode")));
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.propertyIndexHistoryTab.uIHistoryListResultTable
					.getText().contains(PoliceData.getPropertyModuleValue("PFCode")));
		}

		public void VerifyHistroyAsSentToLab() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.propertyIndexHistoryTab.uIHistoryListResultTable
					.getText().contains("Sent To Lab"));
		}

		public void VerifyHistroyAsMovedPropertyRoom() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.propertyIndexHistoryTab.uIHistoryListResultTable
					.getText().contains("Moved Into the Property Room"));
		}

		public void verifyHistroyAsReceivedfromLab() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.propertyIndexHistoryTab.uIHistoryListResultTable
					.getText().contains("Received from Lab"));
		}

		public void verifyHistroyAsSentToPropertyRoom() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertyIndex.propertyIndexHistoryTab.uIHistoryListResultTable
					.getText().contains("Sent To Property Room"));
		}

		public void verifyStatusChangesInHistory() {

			WebElement status = uIMapProperty.propertyIndex.propertyIndexHistoryTab.uIHistoryChangeStatus;
			List<WebElement> cells = status.findElements(By.xpath("//tbody//tr//td//table//tbody//tr//td"));

			for (WebElement cell : cells) {
				String actual = cell.getText().trim();
				if (actual.contains("ChangedStatus")) {
					verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("ChangedStatus"), actual);
					break;
				}
			}

		}
	}

	public class PropertySearch {

		public void EnterAtPropertyFromAndToFields() {
			uIMapProperty.propertySearch.uIFromPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(3));
			uIMapProperty.propertySearch.uIToPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
			uIMapProperty.propertySearch.uIToPropertyNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(3));
		}

		public void EnterFromCaseDetails() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertySearch.uIFromCaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2));
			uIMapProperty.propertySearch.uIFromCaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(3));
			uIMapProperty.propertySearch.uIFromCaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterToCaseDetails() {
			uIMapProperty.propertySearch.uIToCaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2));
			uIMapProperty.propertySearch.uIToCaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(3));
			uIMapProperty.propertySearch.uIToCaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterNumberControlCaseNo() {
			uIMapProperty.propertySearch.uIFromCaseNumberEdit.sendKeys(String.valueOf(Randomized.getRandomNumber()));
			uIMapProperty.propertySearch.uIFromCaseNumberEdit.sendKeys(Keys.ENTER);
		}

		public void EnterNumberControlPropertyNo() {
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumber()));
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit.sendKeys(Keys.ENTER);
		}

		public void ClickIncludeClosed() {
			uIMapProperty.propertySearch.uIIncludeClosedItemsCheckBox.click();
		}

		public void clickSearch() {
			uIMapProperty.propertySearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAddNewPropertyButton() {
			uIMapProperty.propertySearch.uIAddNewPropertyButton.click();
		}

		public void clickReset() {
			uIMapProperty.propertySearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickBack() {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertySearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickRowAtReason() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertySearch.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("Reason"));
		}

		public void VerifyRowViewedGrayColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.propertySearch.uIPropertySearchResultTable,
							PoliceData.getPropertyModuleValue("Reason"))
					.getAttribute("class").contains("gridrowclrGray"));
		}

		public void VerifyNoRecordAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void Verify9065UseSelectedRowCaseMessage() {

			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(9065) Use selected row Case #?");
			} else
				popup.confirm.yesWithExpectedMessage("(9065) Use selected row Case #?");
		}

		public void VerifyAtProperty(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PropertyNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.propertySearch.uIPropertySearchResultTable, "Property#", rowIndex));
		}

		public void VerifyAtProperty(int rowIndex, String propertyNo) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(propertyNo, objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertySearch.uIPropertySearchResultTable, "Property#", rowIndex));
		}

		public void verifyAtCase(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCell(
							uIMapProperty.propertySearch.uIPropertySearchResultTable, "Case#", rowIndex).getText());
		}

		public void SelectRowCheckboxByAtCase() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertySearch.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("CaseNo"));
		}

		public void VerifyReasonAsRecovered(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Recovered", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapProperty.propertySearch.uIPropertySearchResultTable, "Reason", rowIndex));
		}

		public void ClickAtPropertyNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertySearch.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
			Playback.controlReadyThreadWait();
		}

		public void ClickAtPropertyNoInGrid(String propertyNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertySearch.uIPropertySearchResultTable, propertyNo);
			Playback.controlReadyThreadWait();
		}

		public void ClickAdvancedTab() {
			uIMapProperty.propertySearch.uIAdvancedTab.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtTypeColumnValue() {
			Playback.controlReadyThreadWait();
			List<String> typeValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertySearch.uIPropertySearchResultTable, "Type");
			verify.ExpectedValueIsTrue(typeValues.contains(PoliceData.getPropertyModuleValue("Type")));
		}

		public void SelectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertySearch.uIStatusComboBox,
					PoliceData.getPropertyModuleValue("Status"));
			uIMapProperty.propertySearch.uIStatusComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectAtStatus1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertySearch.uIStatusComboBox,
					PoliceData.getPropertyModuleValue("Status1"));
			uIMapProperty.propertySearch.uIStatusComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtStatus() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapProperty.propertySearch.uIStatusComboBox));
		}

		public void VerifyAtStatus1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status1"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapProperty.propertySearch.uIStatusComboBox));
		}

		public void EnterPropertyFromAndToFields(String propertyYear, String propertyNo) {
			uIMapProperty.propertySearch.uIFromPropertyYearEdit.sendKeys(propertyYear);
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit.sendKeys(propertyNo);
			uIMapProperty.propertySearch.uIToPropertyYearEdit.sendKeys(propertyYear);
			uIMapProperty.propertySearch.uIToPropertyNumberEdit.sendKeys(propertyNo);
		}

		public void EnterPropertyNoFromAndTo(String propertyNo) {
			uIMapProperty.propertySearch.uIFromPropertyYearEdit.sendKeys(propertyNo.substring(0, 2));
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit.sendKeys(propertyNo.substring(3, 9));
			uIMapProperty.propertySearch.uIToPropertyYearEdit.sendKeys(propertyNo.substring(0, 2));
			uIMapProperty.propertySearch.uIToPropertyNumberEdit.sendKeys(propertyNo.substring(3, 9));
		}

		public void VerifyAtQuantity(int rowIndex) {
				
			List<String>cells = objectIdentification.manualIdentify.getGridRowCellsValues(uIMapProperty.propertySearch.uIPropertySearchResultTable,0);
			int idx = getProprtySearchTableColumnindex("Quantity");
			String caseNo =cells.get(idx);
			verify.ExpectedPropertyValueIsEqual(caseNo.substring(0,caseNo.lastIndexOf(".")), PoliceData.getPropertyModuleValue("Quantity"));
//			String gridCellInnerText = objectIdentification.manualIdentify.getGridCellInnerText(
//					uIMapProperty.propertySearch.uIPropertySearchResultTable, "Quantity", rowIndex);
//			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Quantity"),gridCellInnerText.substring(0,gridCellInnerText.lastIndexOf(".")));
		}

		public void ClickPRIconUsingCaseNo() {
			WebElement uIPRCell = objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.propertySearch.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("CaseNo"), "PR");
			uIPRCell.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickPRIconUsingPropertyNo() {
			WebElement uIPRCell = objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.propertySearch.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("PropertyNo"), "PR");
			uIPRCell.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertySearch.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("CaseNo"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAt13AccessRestrictedByOfficerAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage(
					"(13) Access Restricted by" + " " + PoliceData.getRecordsModuleValue("Officer"));
		}

		public void Verify39AccessdeniedScreenIDAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(39) Access denied for Screen ID 3223");
		}

		public void enterAtLastName() {
			uIMapProperty.propertySearch.uILastNameEdit.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
			uIMapProperty.propertySearch.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNameID() {
			uIMapProperty.propertySearch.uINameTypeEdit.click();
			uIMapProperty.propertySearch.uINameTypeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("NameID").substring(0, 1));
			uIMapProperty.propertySearch.uINameTypeIDEdit
					.sendKeys(PoliceData.getPropertyModuleValue("NameID").substring(2));
			uIMapProperty.propertySearch.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapProperty.propertySearch.uIFirstNameEdit.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertySearch.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtMiddleName() {
			uIMapProperty.propertySearch.uIMiddleNameEdit.sendKeys(PoliceData.getPropertyModuleValue("MiddleName"));
			uIMapProperty.propertySearch.uIMiddleNameEdit.sendKeys(Keys.TAB);
		}

		public void selectAtDisposition() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertySearch.uIDispositionComboBox,
					PoliceData.getPropertyModuleValue("Disposition"));

		}

		public void clickPRIcon(int rowCount) {
			WebElement uIPRCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertySearch.uIPropertySearchResultTable, "PR", rowCount);
			uIPRCell.click();
			Playback.controlReadyThreadWait();
		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.propertySearch.uIJurisComboBox,
					PoliceData.getPropertyModuleValue("Juris"));
			uIMapProperty.propertySearch.uIJurisComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clickAtCaseNoInGrid(String CaseNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertySearch.uIPropertySearchResultTable, CaseNo);
			Playback.controlReadyThreadWait();
		}

		public void enterFromAndToCaseDetails(String CaseNo) {
			Playback.controlReadyThreadWait();
			uIMapProperty.propertySearch.uIFromCaseYearEdit.sendKeys(CaseNo.substring(0, 2));
			uIMapProperty.propertySearch.uIFromCaseNumberEdit.sendKeys(CaseNo.substring(3));
			uIMapProperty.propertySearch.uIFromCaseNumberEdit.sendKeys(Keys.TAB);

			uIMapProperty.propertySearch.uIToCaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 2));
			uIMapProperty.propertySearch.uIToCaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(3));
			uIMapProperty.propertySearch.uIToCaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickRowAtReason1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertySearch.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("Reason"));
		}

		public PropertySearch() {
			if (this.propertySearchAdvancedTab == null) {
				this.propertySearchAdvancedTab = new PropertySearchAdvancedTab();
			}
		}

		public PropertySearchAdvancedTab propertySearchAdvancedTab;

		public void enterPropertyNobyActiveData(String propertyNo) {
			uIMapProperty.propertySearch.uIFromPropertyYearEdit.sendKeys(propertyNo.substring(0, 3));
			uIMapProperty.propertySearch.uIFromPropertyYearEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit.sendKeys(propertyNo.substring(4, 9));
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertySearch.uIToPropertyYearEdit.sendKeys(propertyNo.substring(0, 3));
			uIMapProperty.propertySearch.uIToPropertyYearEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertySearch.uIToPropertyNumberEdit.sendKeys(propertyNo.substring(4, 9));
			uIMapProperty.propertySearch.uIToPropertyNumberEdit.sendKeys(Keys.TAB);
		}

		public void SelectRowByActivePropertyNo(String propertyNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertySearch.uIPropertySearchResultTable, propertyNo);
		}

		public void selectDateSearchByAsReportedDate() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapProperty.propertySearch.uIDateSearchByComboBox, "Reported Date");
		}

		public void enterAtFromAndToDate() {
			uIMapProperty.propertySearch.uIFromDateEdit.sendKeys(PoliceData.getPropertyModuleValue("FromDate"));
			uIMapProperty.propertySearch.uIFromDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertySearch.uIToDateEdit.sendKeys(PoliceData.getPropertyModuleValue("ToDate"));
			uIMapProperty.propertySearch.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyRowCountNotEqualToZeroInGrid() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapProperty.propertySearch.uIPropertySearchResultTable);
			verify.ExpectedIntergerValueIsNotEqualToActual(rowsCount, 0);
		}

		public void enterAtFromAndToCaseNo() {
			uIMapProperty.propertySearch.uIFromCaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 3));
			uIMapProperty.propertySearch.uIFromCaseYearEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertySearch.uIFromCaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(4));
			uIMapProperty.propertySearch.uIFromCaseNumberEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertySearch.uIToCaseYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(0, 3));
			uIMapProperty.propertySearch.uIToCaseYearEdit.sendKeys(Keys.TAB);
			uIMapProperty.propertySearch.uIToCaseNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("CaseNo").substring(4));
			uIMapProperty.propertySearch.uIToCaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void enterAtOfficerID() {
			uIMapProperty.propertySearch.uIOfficerID.sendKeys(PoliceData.getPropertyModuleValue("OfficerID"));
			uIMapProperty.propertySearch.uIOfficerID.sendKeys(Keys.TAB);

		}

		public void enterAtStorageLocation() {
			uIMapProperty.propertySearch.uIStorageLocationEdit.click();
			uIMapProperty.propertySearch.uIStorageLocationEdit.clear();
			uIMapProperty.propertySearch.uIStorageLocationEdit
					.sendKeys(PoliceData.getPropertyModuleValue("StorageLocation"));
			uIMapProperty.propertySearch.uIStorageLocationEdit.sendKeys(Keys.TAB);
		}

		public void verifyEvidenceLockerInUseConfirmMessage() {
			popup.confirm.yesWithExpectedMessage(
					"(9179)     Evidence Locker is in use with another case’s property items. Are you sure you want to continue to use the locker?");
		}

		public void selectRowByIndex(int rowIndex) {
			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapProperty.propertySearch.uIPropertySearchResultTable, rowIndex);

		}

		public void enterAtPropertyFromAndToFields(String PropertyNo) {
			uIMapProperty.propertySearch.uIFromPropertyYearEdit.sendKeys(PropertyNo.substring(0, 2));
			uIMapProperty.propertySearch.uIFromPropertyNumberEdit.sendKeys(PropertyNo.substring(3));
			uIMapProperty.propertySearch.uIToPropertyYearEdit.sendKeys(PropertyNo.substring(0, 2));
			uIMapProperty.propertySearch.uIToPropertyNumberEdit.sendKeys(PropertyNo.substring(3));
		}

		public void verifyAtProperty(int i, String propertyNo) {
			// TODO Auto-generated method stub

		}

		public void clickRandomPropertyInGrid() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapProperty.propertySearch.uIPropertySearchResultTable);
					
			Playback.controlReadyThreadWait();
			
			
				}

		public void clickStorageLocationSearchButton()
		{
		uIMapProperty.propertySearch.uIStorageLocationSearchButton.click();


		}
			public void enterAtPropertyFrom() {
			uIMapProperty.propertySearch.uIFromPropertyYearEdit
			.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
	uIMapProperty.propertySearch.uIFromPropertyNumberEdit
			.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(3));
			
			
		}
		public int getProprtySearchTableColumnindex(String clmnNamme)
		{
			WebElement table = uIMapProperty.propertySearch.uIPropertySearchResultTable;
			WebElement TableText =table.findElement(By.xpath("//th//span[text()='"+clmnNamme+"']"));
			WebElement column= TableText.findElement(By.xpath(".."));
			int idx = Integer.parseInt(column.getAttribute("idx"));
			return idx;
		}
		public void verifyAtCaseNoInGrid() 
		{
			List<String>cells = objectIdentification.manualIdentify.getGridRowCellsValues(uIMapProperty.propertySearch.uIPropertySearchResultTable,0);
			int idx = getProprtySearchTableColumnindex("Case#");
			String caseNo =cells.get(idx);
			verify.ExpectedPropertyValueIsEqual(caseNo, PoliceData.getPropertyModuleValue("CaseNo"));
		}
	}

	public class PropertySearchAdvancedTab {
		public void ClickTraceCheckbox() {
			uIMapProperty.propertySearch.propertySearchAdvancedTab.uITraceCheckBox.click();
		}

		public void EnterAtGunMake() {
			uIMapProperty.propertySearch.propertySearchAdvancedTab.uIGunMakeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("GunMake"));
			uIMapProperty.propertySearch.propertySearchAdvancedTab.uIGunMakeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtGunModel() {
			uIMapProperty.propertySearch.propertySearchAdvancedTab.uIGunModelEdit
					.sendKeys(PoliceData.getPropertyModuleValue("GunModel"));
			uIMapProperty.propertySearch.propertySearchAdvancedTab.uIGunModelEdit.sendKeys(Keys.TAB);
		}
	}

	public class PropertySearchHelpWindow {
		public void ClickRow() {
			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapProperty.propertySearchHelpWindow.uIPropertySearchResultTable);
			Playback.pageLoadThreadWait();
		}

		public void ClickAtProprtyNoRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertySearchHelpWindow.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("PropertyNo"));
		}

		public void ClickAtProprtyNo1RowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapProperty.propertySearchHelpWindow.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("PropertyNo1"));
		}

		public void ClickSelectProperty() {
			uIMapProperty.propertySearchHelpWindow.uISelectPropertyButton.click();
			Playback.pageLoadThreadWait();
		}

		public void clickSearchButton() {
			uIMapProperty.propertySearchHelpWindow.uISearchButton.click();
		}

		public void verifyRecordAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

		public void selectAtPropertyType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.propertySearchHelpWindow.uIPropertyTypeComboBox,
					PoliceData.getPropertyModuleValue("PropertyType"));
			uIMapProperty.propertySearchHelpWindow.uIPropertyTypeComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtNameID() {
			uIMapProperty.propertySearchHelpWindow.uINameTypeEdit.click();
			uIMapProperty.propertySearchHelpWindow.uINameTypeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("NameID").substring(0, 1));
			uIMapProperty.propertySearchHelpWindow.uINameTypeIDEdit
					.sendKeys(PoliceData.getPropertyModuleValue("NameID").substring(2));
			uIMapProperty.propertySearchHelpWindow.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNameID1() {
			uIMapProperty.propertySearchHelpWindow.uINameTypeEdit.click();
			uIMapProperty.propertySearchHelpWindow.uINameTypeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("NameID1").substring(0, 1));
			uIMapProperty.propertySearchHelpWindow.uINameTypeIDEdit
					.sendKeys(PoliceData.getPropertyModuleValue("NameID1").substring(2));
			uIMapProperty.propertySearchHelpWindow.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtLastName() {
			uIMapProperty.propertySearchHelpWindow.uILastNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
			uIMapProperty.propertySearchHelpWindow.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapProperty.propertySearchHelpWindow.uIFirstNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FirstName"));
			uIMapProperty.propertySearchHelpWindow.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtMiddleName() {
			uIMapProperty.propertySearchHelpWindow.uIMiddleNameEdit
					.sendKeys(PoliceData.getPropertyModuleValue("MiddleName"));
			uIMapProperty.propertySearchHelpWindow.uIMiddleNameEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtTypeColumnValue() {
			Playback.controlReadyThreadWait();
			List<String> typeValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapProperty.propertySearchHelpWindow.uIPropertySearchResultTable, "Type");
			verify.ExpectedValueIsTrue(typeValues.contains(PoliceData.getPropertyModuleValue("Type")));
		}

		public void verifyBackButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapProperty.propertySearchHelpWindow.uIBackButton.isEnabled());

		}

		public void verifyBackButtonNotEnabled() {
			verify.ExpectedValueIsFalse(uIMapProperty.propertySearchHelpWindow.uIBackButton.isEnabled());

		}

		public void clickBackButton() {
			Playback.waitForControlReady();
			uIMapProperty.propertySearchHelpWindow.uIBackButton.click();
			Playback.waitForControlReady();

		}

		public void clickRefreshButton() {
			Playback.waitForControlReady();
			uIMapProperty.propertySearchHelpWindow.uIRefreshButton.click();

		}

		public void clickRowByCaseNo() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertySearchHelpWindow.uIPropertySearchResultTable,
					PoliceData.getPropertyModuleValue("CaseNo"));
			Playback.pageLoadThreadWait();
		}

		public void verifyNoResultsFountAckMsg() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");

		}

		public void selectMultiplePropertyItemsInGrid(int noOfProperties) {
			for (int i = 1; i <= noOfProperties; i++) {
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapProperty.propertySearchHelpWindow.uIPropertySearchResultTable,
						PoliceData.getPropertyModuleValue("PropertyNo") + "-" + i);
				Playback.controlReadyThreadWait();
			}

		}
	}

	public class BicycleRegistration {
		public void ClickAddNew() {
			uIMapProperty.bicycleRegistration.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickSearchButton() {
			uIMapProperty.bicycleRegistration.uISearchButton.click();
		}

		public void ClickResetButton() {
			uIMapProperty.bicycleRegistration.uIResetButton.click();
		}

		public void EnterNumberControlRegistrationNo() {
			// uIMapProperty.bicycleRegistration.uIRegistrationNumberEdit.sendKeys(Randomized.GetRandomNumber().ToString());
			uIMapProperty.bicycleRegistration.uIRegistrationNumberEdit.sendKeys("1");
			uIMapProperty.bicycleRegistration.uIRegistrationNumberEdit.sendKeys(Keys.ENTER);
		}

		public void VerifyNoRecordAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void EnterAtRegistrationNo() {
			uIMapProperty.bicycleRegistration.uIRegistrationNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RegistrationNo"));
		}

		public void EnterAtRegistrationNousingYear() {
			uIMapProperty.bicycleRegistration.uIRegistrationYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RegistrationNo").substring(0, 2));
			uIMapProperty.bicycleRegistration.uIRegistrationNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("RegistrationNo").substring(3));
			uIMapProperty.bicycleRegistration.uIRegistrationNumberEdit.sendKeys(Keys.TAB);
		}

		public void clickAtRegistrationNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.bicycleRegistration.uIBicycleRegistrationTable,
					PoliceData.getPropertyModuleValue("RegistrationNo"));
			Playback.controlReadyThreadWait();
		}

		public void ClickIncludeInactive() {
			uIMapProperty.bicycleRegistration.uIIncludeInactiveCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtRegistrationNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RegistrationNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.bicycleRegistration.uIBicycleRegistrationTable, "Registration#", rowIndex));
		}

		public void VerifyRowViewedGrayColor() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapProperty.bicycleRegistration.uIBicycleRegistrationTable,
							PoliceData.getPropertyModuleValue("RegistrationNo"))
					.getAttribute("class").contains("Gray"));
		}
	}

	public class BicycleRegistrationEntry {
		public void EnterRegistrationDate() {
			uIMapProperty.bicycleRegistrationEntry.uIRegistrationDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterAdultName() {
			uIMapProperty.bicycleRegistrationEntry.uINameTypeEdit.sendKeys("A");
			uIMapProperty.bicycleRegistrationEntry.uILastNameEdit.sendKeys("Raja");
			uIMapProperty.bicycleRegistrationEntry.uIFirstNameEdit.sendKeys("Sadaraj");
			uIMapProperty.bicycleRegistrationEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
			names.nameSearchHelpWindow.SelectName();
		}

		public void EnterAtMake() {
			uIMapProperty.bicycleRegistrationEntry.uIMakeEdit.sendKeys(PoliceData.getPropertyModuleValue("Make"));
		}

		public void EnterAtFrameSerialNo() {
			uIMapProperty.bicycleRegistrationEntry.uIFrameSerialNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("FrameSerialNo"));
		}

		public void SelectAtColor() {
			uIMapProperty.bicycleRegistrationEntry.uIColor1ComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Color"));
			uIMapProperty.bicycleRegistrationEntry.uIColor2ComboBox
					.sendKeys(PoliceData.getPropertyModuleValue("Color"));
		}

		public void EnterValue() {
			uIMapProperty.bicycleRegistrationEntry.uIValueEdit.sendKeys("150");
		}

		public void EnterCustom() {
			uIMapProperty.bicycleRegistrationEntry.uICustom1Edit
					.sendKeys(Randomized.manualPlusRandomString("Automation", 5));
		}

		public void Save() {
			uIMapProperty.bicycleRegistrationEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAdditionSccessful() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapProperty.bicycleRegistrationEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void ClickInactive() {
			uIMapProperty.bicycleRegistrationEntry.uIInactiveCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyInactiveDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapProperty.bicycleRegistrationEntry.uIInactiveDateEdit.getText());
		}

		public void closeScreen() {
			uIMapProperty.bicycleRegistrationEntry.driver.close();
		}
	}

	public class Pawn {
		public void clickAddNew() {
			uIMapProperty.pawn.uIAddNewButton.click();
		}

		public void clickSearchButton() {
			uIMapProperty.pawn.uISearchButton.click();
		}

		public void selectRowByPawnType() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapProperty.pawn.uIPawnResultTable,
					PoliceData.getPropertyModuleValue("PawnType"));
		}

		public void enterAtLastName() {
			uIMapProperty.pawn.uISellerNameEdit.sendKeys(PoliceData.getPropertyModuleValue("LastName"));
		}

	}

	public class PawnEntry {
		public void selectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.pawnEntry.uITypeComboBox,
					PoliceData.getPropertyModuleValue("Type"));
		}

		public void EnterAtPawnTagNo() {
			uIMapProperty.pawnEntry.uIPawnTagNoEdit.sendKeys(PoliceData.getPropertyModuleValue("PawnTagNo"));
		}

		public void enterAtEnteredBy() {
			uIMapProperty.pawnEntry.uIEnteredByPFEdit.sendKeys(PoliceData.getPropertyModuleValue("PFCode"));
			uIMapProperty.pawnEntry.uIEnteredByPFEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtDisposition() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.pawnEntry.uIDispostionComboBox,
					PoliceData.getPropertyModuleValue("Disposition"));

		}

		public void switchToMainTab() {
			uIMapProperty.pawnEntry.uIPawnEntryMainTab.click();
		}

		public void switchToDealerTab() {
			uIMapProperty.pawnEntry.uIDealerTab.click();
		}

		public void save() {
			uIMapProperty.pawnEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClosePawnEntry() {
			uIMapProperty.pawnEntry.driver.close();
		}

		public void tabOutDateAndTime() {
			uIMapProperty.pawnEntry.uIDateEdit.click();
			uIMapProperty.pawnEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.pawnEntry.uITimeEdit.click();
			uIMapProperty.pawnEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void verifyUpdateSuccessfulMessage() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.pawnEntry.uIBottomLeftSideStatusBar.getText().contains("1003 - Update Successful"));
			Playback.threadWait(5000);
		}

		public void verifyAdditionSuccessfulMessage() {
			verify.ExpectedValueIsTrue(
					uIMapProperty.pawnEntry.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));
			Playback.threadWait(5000);
		}

		public void verifyDateAndTimeIsEnabled() {
			Playback.pageLoadThreadWait();
			uIMapProperty.pawnEntry.uIDateEdit.isEnabled();
			uIMapProperty.pawnEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.pawnEntry.uITimeEdit.isEnabled();

		}

		public void enterAtDateAndTime() {
			Playback.controlReadyThreadWait();
			uIMapProperty.pawnEntry.uIDateEdit.click();
			uIMapProperty.pawnEntry.uIDateEdit.clear();
			uIMapProperty.pawnEntry.uIDateEdit.sendKeys(PoliceData.getPropertyModuleValue("Date"));
			uIMapProperty.pawnEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.pawnEntry.uITimeEdit.click();
			uIMapProperty.pawnEntry.uITimeEdit.clear();
			uIMapProperty.pawnEntry.uITimeEdit.sendKeys(Keys.TAB);

		}

		public PawnEntry() {
			if (this.pawnEntryMainTab == null) {
				this.pawnEntryMainTab = new PawnEntryMainTab();
			}

			if (this.dealerTab == null) {
				this.dealerTab = new DealerTab();
			}
		}

		public PawnEntryMainTab pawnEntryMainTab;
		public DealerTab dealerTab;

	}

	public class PawnEntryMainTab {
		public void selectAtPropertyType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.pawnEntry.pawnEntryMainTab.uIPropertyTypeComboBox,
					PoliceData.getPropertyModuleValue("PropertyType"));
		}

		public void enterDescription() {
			uIMapProperty.pawnEntry.pawnEntryMainTab.uIDescriptionEdit.sendKeys("Test Automation Team");
		}

		public void EnterAtSerialNo() {
			uIMapProperty.pawnEntry.pawnEntryMainTab.uISerialNoEdit
					.sendKeys(PoliceData.getPropertyModuleValue("SerialNo"));
		}

		public void EnterColor() {
			uIMapProperty.pawnEntry.pawnEntryMainTab.uIColorEdit.sendKeys("Blue");
		}

		public void SelectMake() {
			uIMapProperty.pawnEntry.pawnEntryMainTab.uIMakeLookupButton.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void VerifySerial() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("SerialNo"),
					uIMapProperty.pawnEntry.pawnEntryMainTab.uISerialNoEdit.getAttribute("value"));
		}

		public void enterAtDescription() {
			uIMapProperty.pawnEntry.pawnEntryMainTab.uIDescriptionEdit
					.sendKeys(PoliceData.getPropertyModuleValue("Description"));
		}
	}

	public class DealerTab {
		public void SelectDealerID() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapProperty.pawnEntry.dealerTab.uIDealerIDNoComboBox);
		}

		public void verifyDealerLastName() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapProperty.pawnEntry.dealerTab.uIDealerLastNameEdit.getAttribute("value"),
					PoliceData.getPropertyModuleValue("LastName"));
		}

		public void selectAtDealerID() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapProperty.pawnEntry.dealerTab.uIDealerIDNoComboBox,
					PoliceData.getPropertyModuleValue("DealerID"));

		}
	}

	public class PawnHelpWindow {
		public void ClickSearchButton() {
			uIMapProperty.pawn.uISearchButton.click();
		}

		public void VerifySerial(int rowIndex) {
			// verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.GetGridTableRow(uIMapProperty.pawnHelpWindow.uIPawnResultTable,
			// 1).Text.Contains(PoliceData.getPropertyModuleValue("Serial")));
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("SerialNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.pawnHelpWindow.uIPawnResultTable, "SerialNo", rowIndex));
		}

		public void ClosePawnHelpWindow() {
			uIMapProperty.pawnHelpWindow.driver.close();
		}
	}

	public class AuditSearch {
		public void ClickAddNew() {
			uIMapProperty.auditSearch.uIAddNewButton.click();
		}

		public void ClickSearchButton() {
			uIMapProperty.auditSearch.uISearchButton.click();
		}

		public void VerifyAddNewDisabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					uIMapProperty.auditSearch.uIAddNewView.getAttribute("class").contains("Disabled"));
		}

		public void VerifyAddNewEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapProperty.auditSearch.uIAddNewView.isEnabled());
		}

		public void DeleteAuditRowUsingAuditNo() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapProperty.auditSearch.uIAuditSearchResultgrid, PoliceData.getPropertyModuleValue("AuditNo"));
		}

		public void VerifyDoYouReallyWantToDeleteAckMsg() {
			if (Playback.browserType.contains("Chrome"))
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

	}

	public class AuditEditEntry {
		public void SelectAtAuditType() {
			uIMapProperty.auditEditEntry.uIAuditTypeComboBox.sendKeys(PoliceData.getPropertyModuleValue("AuditType"));
		}

		public void EnterAuditDateTime() {
			uIMapProperty.auditEditEntry.uIAuditDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.auditEditEntry.uIAuditTimeEdit.click();
			uIMapProperty.auditEditEntry.uIAuditTimeEdit.sendKeys(Keys.TAB);
		}

		public void ClickCreateAuditButton() {
			uIMapProperty.auditEditEntry.uICreateAuditButton.click();
			Playback.pageLoadThreadWait();
		}

		public void SelectAtLocationTab() {
			uIMapProperty.auditEditEntry.uILocationEdit.sendKeys(PoliceData.getPropertyModuleValue("Location"));
			uIMapProperty.auditEditEntry.uILocationEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}
		public void SelectAtAuditLocationLookUp() {
			uIMapProperty.auditEditEntry.uIAuditLocationEdit.sendKeys(PoliceData.getPropertyModuleValue("Location"));
			uIMapProperty.auditEditEntry.uIAuditLocationEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void SelectAtProperty() {
			uIMapProperty.auditEditEntry.uIPropertyTypeComboBox.sendKeys(PoliceData.getPropertyModuleValue("Property"));
		}

		public void GetAuditBalanace(String uIAuditBalance) {
			Playback.testContext.setAttribute("uIAuditBalance",
					uIMapProperty.auditEditEntry.uIAuditBalanceTextView.getAttribute("value"));
		}

		public void ClickTransmitButton() {
			uIMapProperty.auditEditEntry.uITransmitButton.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickStatusAsNotAudit() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.auditEditEntry.uIAuditEntryResultgrid, "Not Audited");
		}

		public void SelectRowAtStatus() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.auditEditEntry.uIAuditEntryResultgrid, PoliceData.getPropertyModuleValue("Status"));
		}

		public void ClickLocationCompletedCheckBox() {
			uIMapProperty.auditEditEntry.uILocationCompletedCheckBox.click();
		}

		public void EnterAtAcceptedBy() {
			uIMapProperty.auditEditEntry.uIAcceptedByEdit.sendKeys(PoliceData.getPropertyModuleValue("AcceptedBy"));
			uIMapProperty.auditEditEntry.uIAcceptedByEdit.sendKeys(Keys.TAB);
		}

		public void EnterAcceptedDateTime() {
			uIMapProperty.auditEditEntry.uIAcceptedDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.auditEditEntry.uIAcceptedTimeEdit.click();
			uIMapProperty.auditEditEntry.uIAcceptedTimeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SaveAndClose() {
			uIMapProperty.auditEditEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void VerifyAuditCurrentDateTime() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapProperty.auditEditEntry.uIAuditDateEdit.getAttribute("value"));

		}

		public void VerifyAcceptedCurrentDateTime() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapProperty.auditEditEntry.uIAcceptedDateEdit.getAttribute("value"));
			// verify.ExpectedValueIsTrue(uIMapProperty.auditEditEntry.uIAcceptedTimeEdit.GetAttribute("value").Contains(Randomized.GetCurrentTimeHHMM()));
		}

		public void VerifyStatusAsAuditedInTheGrid() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapProperty.auditEditEntry.uIAuditEntryResultgrid, "Audited").getText());
		}

		public void VerifyAuditBalance(String AuditBalance) {
			int auditBalance = Integer.parseInt(AuditBalance);
			int uIAuditBalance = auditBalance - 1;
			verify.ExpectedPropertyValueIsEqual(
					uIMapProperty.auditEditEntry.uIAuditBalanceTextView.getAttribute("value"),
					String.valueOf(uIAuditBalance));
		}

		public void VerifyAcknowledgePropertyIsAlreadyAudited() {
			popup.acknowledge.okWithExpectedMessage("(9112) Property is already audited");
		}

		public void verifyAuditNameLabelAsMandatory() {

			String style = uIMapProperty.auditEditEntry.uIAuditNameLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(style.contains("rgb(153, 0, 0)"));
		}

		public void verifyAuditTypeLabelAsMandatory() {

			String style = uIMapProperty.auditEditEntry.uIAuditTypeLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(style.contains("rgb(153, 0, 0)"));

		}

		public void verifyAuditByLabelAsMandatory() {

			String style = uIMapProperty.auditEditEntry.uIAuditByLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(style.contains("rgb(153, 0, 0)"));

		}

		public void verifyAuditDateTimeLabelAsMandatory() {

			String style = uIMapProperty.auditEditEntry.uIAuditDateTimeLabel.getAttribute("style");
			verify.ExpectedValueIsTrue(style.contains("rgb(153, 0, 0)"));

		}

		public void verifyCreateAuditButtonIsDisplayedAndEnabled() {

			verify.ExpectedValueIsTrue(uIMapProperty.auditEditEntry.uICreateAuditButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapProperty.auditEditEntry.uICreateAuditButton.isEnabled());
		}

		public void tabOutAuditByLookUp() {
			uIMapProperty.auditEditEntry.uIAuditedByEdit.sendKeys(Keys.TAB);

		}

		public void enterAtAuditName() {
			uIMapProperty.auditEditEntry.uIAuditNameEdit.sendKeys(PoliceData.getPropertyModuleValue("AuditName"));
			uIMapProperty.auditEditEntry.uIAuditNameEdit.sendKeys(Keys.TAB);
		}

		public void switchToAuditTab() {
			uIMapProperty.auditEditEntry.uIAuditTab.click();
			objectIdentification.windowHandle.switchToFrame("frmPropAuditResult.aspx");
		}
	}

	public class PullRequest {
		public void VerifyRequestedByFieldDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapProperty.pullRequest.uIRequestedByEdit.getAttribute("readonly")));
		}

		public void ClickAddNew() {
			uIMapProperty.pullRequest.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickSearchButton() {
			uIMapProperty.pullRequest.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectAtReason() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.pullRequest.uIReasonComboBox,
					PoliceData.getPropertyModuleValue("Reason"));
			uIMapProperty.pullRequest.uIReasonComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyAtRequestNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RequestNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapProperty.pullRequest.uIPullRequestResultgrid, "Request#", rowIndex));
		}

		public void ClickAtRequestNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.pullRequest.uIPullRequestResultgrid, PoliceData.getPropertyModuleValue("RequestNo"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyRequestNoInGrid(String requestNo, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(requestNo, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.pullRequest.uIPullRequestResultgrid, "Request#", rowIndex));
		}

		public void VerifyStatusAsOpenInGrid() {
			verify.ExpectedPropertyValueIsEqual("OPEN", objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.pullRequest.uIPullRequestResultgrid, "OPEN").getText());
		}

		public void VerifyRequiredDateAsCurrentDateInGrid() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("MM/dd/yy"),
					objectIdentification.manualIdentify.getGridCell(uIMapProperty.pullRequest.uIPullRequestResultgrid,
							Randomized.getCurrentDate("MM/dd/yy")).getText());
		}

		public void VerifyRequestedByEnabled() {
			verify.ExpectedValueIsTrue(uIMapProperty.pullRequest.uIRequestedByEdit.isEnabled());
			verify.ExpectedValueIsTrue(uIMapProperty.pullRequest.uIRequestedByEdit.isDisplayed());
		}

		public void ClickRequiredDateASCurrentDateInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.pullRequest.uIPullRequestResultgrid, Randomized.getCurrentDate("MM/dd/yy"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyStatusAsReadyInGrid() {
			verify.ExpectedPropertyValueIsEqual("READY", objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.pullRequest.uIPullRequestResultgrid, "READY").getText());
		}

		public void ClickRequestNoInGrid(String requestNo) {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.pullRequest.uIPullRequestResultgrid, requestNo);
			Playback.controlReadyThreadWait();
		}

		public void VerifyStatusAsClosedInGrid() {
			verify.ExpectedPropertyValueIsEqual("CLOSED", objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.pullRequest.uIPullRequestResultgrid, "CLOSED").getText());
		}
		public void verifyAtRequestedBy() 
		{
			String attribute = uIMapProperty.pullRequest.uIRequestedByEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(PoliceData.getPropertyModuleValue("RequestedBy")));
		}

		public void verifyStatusAsOnHoldInGrid() 
		{
			String text = objectIdentification.manualIdentify.getGridCell(uIMapProperty.pullRequest.uIPullRequestResultgrid, "OnHold").getText();
			verify.ExpectedValueIsTrue(text.contains("OnHold"));
		}

	
		
		public void selectRowByStatusAsOnHold()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapProperty.pullRequest.uIPullRequestResultgrid, "OnHold");
		}
		public void enterAtRequestedBy() {
			uIMapProperty.pullRequest.uIRequestedByEdit.sendKeys(PoliceData.getPropertyModuleValue("RequestedBy"));
			uIMapProperty.pullRequest.uIRequestedByEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}
		
		public void ClickAtStatusInGrid(int i) {
			objectIdentification.manualIdentify.getGridCell(
					uIMapProperty.pullRequest.uIPullRequestResultgrid,"Status",i).click();
			Playback.controlReadyThreadWait();
		}
	}

	public class RequestEntry {

		public RoutingTab routingTab;
		public ItemsTab itemsTab;
		public RequestEntry(){
			if (this.itemsTab == null) {
				this.itemsTab = new ItemsTab();
			}
			if (this.routingTab == null) {
				this.routingTab = new RoutingTab();
			}
		}
		
		public String  getRequestNo() 
		{
			String requestYear = uIMapProperty.requestEntry.uIRequestYearEdit.getAttribute("value");
			String RequestNumber = uIMapProperty.requestEntry.uIRequestNumberEdit.getAttribute("value");
			String requestNo = requestYear + "-" + RequestNumber;
			return requestNo;
			}
			public void GetRequestNo(String requestNo) {
			String requestYear = uIMapProperty.requestEntry.uIRequestYearEdit.getAttribute("value");
			String RequestNumber = uIMapProperty.requestEntry.uIRequestNumberEdit.getAttribute("value");
			requestNo = requestYear + "-" + RequestNumber;
			Playback.testContext.setAttribute("RequestNo", requestNo);
		}

		public String readRequestNo() {
			String requestYear = uIMapProperty.requestEntry.uIRequestYearEdit.getAttribute("value");
			String RequestNumber = uIMapProperty.requestEntry.uIRequestNumberEdit.getAttribute("value");
			String requestNo = requestYear + "-" + RequestNumber;
			
			return requestNo;
		}

		public void TabRequestedBy() {
			uIMapProperty.requestEntry.uIRequestedByEdit.sendKeys(Keys.TAB);
		}

		public void VerifyDateRequestedAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapProperty.requestEntry.uIDateRequestedEdit.getAttribute("value"));
		}

		public void TabDateRequiredandTime() {
			uIMapProperty.requestEntry.uIDateRequiredEdit.sendKeys(Keys.TAB);
			uIMapProperty.requestEntry.uIDateRequiredTimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtReason() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.requestEntry.uIReasonComboBox,
					PoliceData.getPropertyModuleValue("Reason"));
			uIMapProperty.requestEntry.uIReasonComboBox.sendKeys(Keys.TAB);
		}

		public void ClickPropertyLookupIcon() {
			uIMapProperty.requestEntry.uIPropertyLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAdd() {
			uIMapProperty.requestEntry.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAtPropertyNoInGrid() {
			Playback.pageLoadThreadWait();
			WebElement Property = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.requestEntry.uIRequestEntryResultgrid,
					PoliceData.getPropertyModuleValue("PropertyNo"));
			Property.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickAtPropertyNo1InGrid() {
			Playback.pageLoadThreadWait();
			WebElement Property1 = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapProperty.requestEntry.uIRequestEntryResultgrid,
					PoliceData.getPropertyModuleValue("PropertyNo1"));
			Property1.click();
			Playback.pageLoadThreadWait();
		}

		public void TabAcceptedBy() {
			uIMapProperty.requestEntry.uIAcceptedByEdit.sendKeys(Keys.TAB);
		}

		public void TabAcceptedDateTime() {
			uIMapProperty.requestEntry.uIAcceptedDateEdit.sendKeys(Keys.TAB);
			uIMapProperty.requestEntry.uIAcceptedTimeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtRequestedBy() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("RequestedBy"),
					uIMapProperty.requestEntry.uIRequestedByEdit.getAttribute("value"));
		}

		public void VerifyStatusAsOpen() {
			verify.ExpectedPropertyValueIsEqual("OPEN", uIMapProperty.requestEntry.uIStatusTextView.getText());
		}

		public void VerifyStatusAsReady() {
			verify.ExpectedPropertyValueIsEqual("READY", uIMapProperty.requestEntry.uIStatusTextView.getText());
		}

		public void Save() {
			uIMapProperty.requestEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void SaveAndClose() {
			uIMapProperty.requestEntry.uISaveAndCloseButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapProperty.requestEntry.driver.close();
		}

		public void VerifyAtPropertyNoInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.requestEntry.uIRequestEntryResultgrid, "Property#", rowIndex)
					.contains(PoliceData.getPropertyModuleValue("PropertyNo")));

		}
					
		public void verifyAdditionSccessful() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapProperty.requestEntry.uIBottomLeftSideStatusBar.getText());
		}
		
		public void VerifyAtStatus() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status"), uIMapProperty.requestEntry.uIStatusTextView.getText());
		}
		
		public void VerifyAtStatus1() {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("Status1"), uIMapProperty.requestEntry.uIStatusTextView.getText());
		}
		

		public void verifyRoutingTabDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.requestEntry.uIRoutingTab.isDisplayed());
		}
		
		public void switchToRoutingTab() {
			uIMapProperty.requestEntry.uIRoutingTab.click();
			objectIdentification.windowHandle.switchToFrame("Property/frmPullRouting.aspx?");
		}
		
		public void switchToItemTab() {
			uIMapProperty.requestEntry.uIItemsTab.click();
		}

		public void clickRefreshButton() {
			uIMapProperty.requestEntry.uIResetButton.click();
		}
		public void VerifyAtPropertyNo1InGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.requestEntry.uIRequestEntryResultgrid, "Property#", rowIndex)
					.contains(PoliceData.getPropertyModuleValue("PropertyNo1")));
		}

		public void VerifyStatusAsClosed() {
			verify.ExpectedPropertyValueIsEqual("CLOSED", uIMapProperty.requestEntry.uIStatusTextView.getText());
		}

		public void verifyStatusAsOnHoldInMenuBar() 
		{
			String text = uIMapProperty.requestEntry.uIStatusTextView.getText();
			verify.ExpectedValueIsTrue(text.contains("OnHold"));
		}

		public void EnterAtPropertyNo() {
			uIMapProperty.requestEntry.uIPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
			uIMapProperty.requestEntry.uIPropertyNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(3, 6));
			uIMapProperty.requestEntry.uIPropertyNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
		}
		public void VerifyAtDuplicationAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void EnterAtPropertyYearUsingPropertyNo() {
			uIMapProperty.requestEntry.uIPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
		}

		public void EnterAtSequenceNoUsingPropertyNo() {
			uIMapProperty.requestEntry.uIPropertyNumberEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
		}


	}
	public class ItemsTab{
			
			public void ClickPropertyLookupIcon() {
				uIMapProperty.requestEntry.itemsTab.uIPropertyLookupButton.click();
				Playback.controlReadyThreadWait();
			}

			public void ClickAdd() {
				uIMapProperty.requestEntry.itemsTab.uIAddButton.click();
				Playback.controlReadyThreadWait();
			}

			public void ClickAtPropertyNoInGrid() {
				Playback.pageLoadThreadWait();
				WebElement Property = objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapProperty.requestEntry.itemsTab.uIRequestEntryResultgrid,
						PoliceData.getPropertyModuleValue("PropertyNo"));
				Property.click();
				Playback.pageLoadThreadWait();
			}

			public void ClickAtPropertyNo1InGrid() {
				Playback.pageLoadThreadWait();
				WebElement Property1 = objectIdentification.manualIdentify.getGridRowByCellInnerText(
						uIMapProperty.requestEntry.itemsTab.uIRequestEntryResultgrid,
						PoliceData.getPropertyModuleValue("PropertyNo1"));
				Property1.click();
				Playback.pageLoadThreadWait();
			}

		public void EnterAtPropertyNo() {
				System.out.println(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
				System.out.println(PoliceData.getPropertyModuleValue("PropertyNo").substring(3, 9));
				System.out.println(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
				uIMapProperty.requestEntry.itemsTab.uIPropertyYearEdit
						.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
				uIMapProperty.requestEntry.itemsTab.uIPropertyNumberEdit
						.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(3, 9));
				uIMapProperty.requestEntry.itemsTab.uIPropertyItemNumberEdit
						.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
				uIMapProperty.requestEntry.itemsTab.uIPropertyItemNumberEdit.sendKeys(Keys.TAB);
			}

		public void VerifyAtPropertyDescription() {
			verify.ExpectedValueIsTrue(uIMapProperty.requestEntry.uIPropertyDescriptionEdit.getText()
					.contains(PoliceData.getPropertyModuleValue("PropertyNo1")));
		}

		public void EnterAtPropertyYearUsingPropertyNo() {
			uIMapProperty.requestEntry.itemsTab.uIPropertyYearEdit
					.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(0, 2));
		}

		public void EnterAtSequenceNoUsingPropertyNo() {
				uIMapProperty.requestEntry.itemsTab.uIPropertyNumberEdit
						.sendKeys(PoliceData.getPropertyModuleValue("PropertyNo").substring(10));
			}

			public void VerifyAtPropertyNoInGrid(int rowIndex) {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridCellInnerText(uIMapProperty.requestEntry.itemsTab.uIRequestEntryResultgrid, "Property#", rowIndex)
						.contains(PoliceData.getPropertyModuleValue("PropertyNo")));
			}
		public void VerifyAtDuplicationAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void clickRefreshButton() {
			uIMapProperty.requestEntry.uIResetButton.click();
		}
		public void VerifyAtPropertyNo1InGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.requestEntry.itemsTab.uIRequestEntryResultgrid, "Property#", rowIndex)
					.contains(PoliceData.getPropertyModuleValue("PropertyNo1")));
		}
			
			public void clickCheckboxInGridUsingIndex(int i) {
				
				objectIdentification.manualIdentify.selectGridRowCheckBoxByIndex(uIMapProperty.requestEntry.itemsTab.uIItemsTable,1);
				
			}
			
			public void clickProceedToPropertyUpdateButton() {
				uIMapProperty.requestEntry.itemsTab.uIProceedToPropertyUpdateButton.click();
			}
			
			public void verifyClosedCheckboxCheckedInGridUsingPropertyNo() {
				objectIdentification.manualIdentify.getGridCell(uIMapProperty.requestEntry.itemsTab.uIItemsTable, "Closed",0).isSelected();
			}

		public void verifyAtPropertyDescription() {
			verify.ExpectedValueIsTrue(uIMapProperty.requestEntry.uIPropertyDescriptionEdit.getText()
					.contains(PoliceData.getPropertyModuleValue("PropertyNo1")));
		}

		public void verifyAdditionSccessful() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapProperty.requestEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void clickPropertyLookUpIconFor93() 
		{
			uIMapProperty.requestEntry.uIPropertyLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyStatusAsOnHoldInMenuBar() 
		{
			String text = uIMapProperty.requestEntry.uIStatusTextView.getText();
			verify.ExpectedValueIsTrue(text.contains("OnHold"));
		}
		
		public void VerifyAtPropertyNo1InGridFor93(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.requestEntry.uIRequestEntryResultgrid, "Property#", rowIndex)
					.contains(PoliceData.getPropertyModuleValue("PropertyNo1")));
		}
		
		public void VerifyAtPropertyNoInGridFor93(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.requestEntry.uIRequestEntryResultgrid, "Property#", rowIndex)
					.contains(PoliceData.getPropertyModuleValue("PropertyNo")));
		}
	}
public class RoutingTab{

			public void selectAtNewAction()
			{
				objectIdentification.manualIdentify.selectDropDownOption(uIMapProperty.requestEntry.routingTab.uINweActionCombobox, (PoliceData.getPropertyModuleValue("NewAction")));
			}
			
			public void tabDateAndTime()
			{
				uIMapProperty.requestEntry.routingTab.uIRequiredDateEdit.sendKeys(Keys.TAB);
				uIMapProperty.requestEntry.routingTab.uIRequiredTimeEdit.sendKeys(Keys.TAB);
			}
			
			public void save()
			{
				uIMapProperty.requestEntry.routingTab.uISaveButton.click();
				popup.confirm.yes();
			}
			
			public void clickReset()
			{
				uIMapProperty.requestEntry.routingTab.uIResetButton.click();
			}
			
			public void enterAtNotes()
			{
				uIMapProperty.requestEntry.routingTab.uINotesEdit.sendKeys((PoliceData.getPropertyModuleValue("Notes")));
			}
			
			private void verifyAtJsonValueInGrid(String JsonKey) {
				
				String cellValues = null;
				List<WebElement> rowCells = uIMapProperty.requestEntry.routingTab.uIRoutingTable.findElements(By.xpath("//td[contains(@align,'left')]"));
				for (WebElement cell : rowCells) {
					if(cell.getText().contains(PoliceData.getPropertyModuleValue(JsonKey)))
						cellValues=cell.getText();
				}	
				System.out.println(cellValues);
				verify.ExpectedValueIsTrue(cellValues
						.contains(PoliceData.getPropertyModuleValue(JsonKey)));
			}
			
			public void verifyAtStatus()
			{
				verifyAtJsonValueInGrid((PoliceData.getPropertyModuleValue("Status")));
			}
			
			public void verifyAtStatus1()
			{
				verifyAtJsonValueInGrid((PoliceData.getPropertyModuleValue("Status1")));
			}
			
			public void verifyAtRequestedBy()
			{
				verifyAtJsonValueInGrid((PoliceData.getPropertyModuleValue("RequestedBy")));
			}
			
			public void verifyAtRequestedBy1()
			{
				verifyAtJsonValueInGrid((PoliceData.getPropertyModuleValue("RequestedBy1")));
			}
			
			public void verifyRejectedCountAs1()
			{
				verify.ExpectedPropertyValueIsEqual(uIMapProperty.requestEntry.routingTab.uIRejectedCount.getText(),"1");
			}
			
			public void verifySaveIconDisabled()
			{
				verify.ExpectedPropertyValueIsEqual(uIMapProperty.requestEntry.routingTab.uISaveButton.getAttribute("disabled"), "disabled");
			}
			
			public void verifyResetIconDisabled()
			{
				verify.ExpectedPropertyValueIsEqual(uIMapProperty.requestEntry.routingTab.uIResetButton.getAttribute("disabled"), "disabled");
			}
			
			
		}
	public class LocationSearch {
		public void ClickAddNew() {
			uIMapProperty.locationSearch.uIAddNew.click();
		}

		public void verifyBarCodeNamesFromReport(String data, ArrayList<String> locationDescription) {

			for (int i = 0; i < locationDescription.size(); i++) {
				data.contains(locationDescription.get(i));
			}
		}

		public void savePDFtoLocation(String testID) {
			objectIdentification.readPDF.SaveAsPDFfileToLocation(testID);

		}

		public String readDataFromPDF() {
			String data = objectIdentification.readPDF.ReadPDF("255546.pdf");
			return data;
		}

		public void clickBarcodeBatchPrint() {
			uIMapProperty.locationSearch.uIBarcodeBatchPrintButton.click();
		}

		public void switchToUnTitleDocumentWindow() {
			Playback.threadWait(2000);
			objectIdentification.windowHandle.switchToWindow("Untitled Document");

		}

		public void clickSearchButton() {
			Playback.controlReadyThreadWait();
			uIMapProperty.locationSearch.uISearchButton.click();
		}

		public ArrayList<String> selectFirstFewGridRowCheckBoxReadLocationDescription(int count) {
			ArrayList<String> Location = new ArrayList<>();

			for (int i = 1; i <= count; i++) {
				Playback.threadWait(600);
				objectIdentification.manualIdentify
						.selectGridRowCheckBoxByIndex(uIMapProperty.locationSearch.uILocationTable, i);

				Location.add(objectIdentification.manualIdentify.getGridCellInnerTextByText(
						uIMapProperty.locationSearch.uILocationTable, "Location Description", i - 1));

			}
			return Location;

		}

		public void savePDFfileFromUnTitleDocumentWindow() {

			// Playback.driver.findElement(By.xpath("//cr-button[contains(text(),'Save')]")).click();
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();

			}
			Playback.threadWait();
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Playback.threadWait();

		}

		public void EnterAtLocation() {
			uIMapProperty.locationSearch.uICodeEdit.clear();
			uIMapProperty.locationSearch.uICodeEdit.sendKeys(PoliceData.getPropertyModuleValue("Location"));
		}

		public void EnterAtLocation1() {
			uIMapProperty.locationSearch.uICodeEdit.clear();
			uIMapProperty.locationSearch.uICodeEdit.sendKeys(PoliceData.getPropertyModuleValue("Location1"));

		}

		public void EnterAtLocation2() {
			uIMapProperty.locationSearch.uICodeEdit.clear();
			uIMapProperty.locationSearch.uICodeEdit.sendKeys(PoliceData.getPropertyModuleValue("Location2"));
		}

	}

	public class StorageLocations {
		public void EnterAtDescription() {
			uIMapProperty.storageLocations.uIDescription.sendKeys(PoliceData.getPropertyModuleValue("Description"));
			uIMapProperty.storageLocations.uIDescription.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void ClickEvidenceLockerCheckBox() {
			uIMapProperty.storageLocations.uIEvidenceLockerCheckBox.click();
		}

		public void ClickSharedCheckBox() {
			uIMapProperty.storageLocations.uISharedCheckBox.click();
		}

		public void VerifySharedCheckBoxIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapProperty.storageLocations.uISharedCheckBox.isDisplayed());
		}

		public void VerifySharedCheckBoxIsSelected() {
			verify.ExpectedValueIsTrue(uIMapProperty.storageLocations.uISharedCheckBox.isSelected());
		}

		public void SaveTheScreen() {
			uIMapProperty.storageLocations.uISave.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void CloseTheScreen() {
			Playback.controlReadyThreadWait();
			uIMapProperty.storageLocations.driver.close();
		}

	}

	public class Notify {

		public void clickAddButton() {
			uIMapProperty.notify.uIAddButton.click();
		}

		public void clickAddMultiplePFButton() {
			uIMapProperty.notify.uIAddMultiplePFButton.click();
		}

		public void clickCancelButton() {
			uIMapProperty.notify.uICancelButton.click();
		}

		public void clickSendButton() {
			uIMapProperty.notify.uISendButton.click();
		}

		public void clickClearButton() {
			uIMapProperty.notify.uIClearButton.click();
		}

		public void clickPFLookupButton() {
			uIMapProperty.notify.uIPFLookupButton.click();
		}

		public void enterAtNotes() {
			uIMapProperty.notify.uINotesEdit.sendKeys(PoliceData.getPropertyModuleValue("Notes"));
		}

		public void enterAtPFCode() {
			uIMapProperty.notify.uIPFEdit.sendKeys(PoliceData.getPropertyModuleValue("PFCode"));
		}

		public void enterAtSubject() {
			uIMapProperty.notify.uISubjectEdit.sendKeys(PoliceData.getPropertyModuleValue("Subject"));
		}

		public void enterAtFollowUpDate() {
			uIMapProperty.notify.uIFollowUpDateEdit.sendKeys(PoliceData.getPropertyModuleValue("Date"));
		}

		public void enterAtTo() {
			uIMapProperty.notify.uIToEdit.sendKeys(PoliceData.getPropertyModuleValue("To"));
		}

		public void enterDate() {
			uIMapProperty.notify.uIFollowUpDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void verifyAtCaseNoAndPropertyNoInSubject(String PropertyNo) {
			String Subject = uIMapProperty.notify.uISubjectEdit.getText();
			verify.ExpectedValueIsTrue(Subject.contains(PoliceData.getPropertyModuleValue("CaseNo")));
			verify.ExpectedValueIsTrue(Subject.contains(PropertyNo));
		}

	}

	public class StorageLocationUpdate {

		public void enterAtScanBarCode() {
			uIMapProperty.storageLocationUpdate.uIScanBarCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("ScanBarCode"));
			uIMapProperty.storageLocationUpdate.uIScanBarCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtScanBarCode1() {
			uIMapProperty.storageLocationUpdate.uIScanBarCodeEdit
					.sendKeys(PoliceData.getPropertyModuleValue("ScanBarCode1"));
			uIMapProperty.storageLocationUpdate.uIScanBarCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtDescription() {
			String Description = uIMapProperty.storageLocationUpdate.uIDescriptionEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(Description.contains(PoliceData.getPropertyModuleValue("Description")));
		}

		public void clickResetButton() {
			uIMapProperty.storageLocationUpdate.uIResetButton.click();
		}

		public void verifyAtDescription1() {
			String Description1 = uIMapProperty.storageLocationUpdate.uIDescriptionEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(Description1.contains(PoliceData.getPropertyModuleValue("Description1")));
		}
	}

	public class PropertyCodes {

		public void save() {
			uIMapProperty.propertyCodes.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton()
		{
			uIMapProperty.propertyCodes.uISaveButton.click();
		}

		public void saveAndClose()
		{
			uIMapProperty.propertyCodes.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void clickSaveAndCloseButton()
		{
			uIMapProperty.propertyCodes.uISaveAndCloseButton.click();
		}

		public void clickPropertyEntryCodesRadioButton()
		{
			uIMapProperty.propertyCodes.uIPropertyEntryCodesRadioButton.click();
		}

		public void verifyAtDescriptionInGrid()
		{
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodes.uIPropertyCodesTable, "Description", 0);
			verify.ExpectedValueIsTrue(gridCellInnerText.contains(PoliceData.getPropertyModuleValue("Description")));
		}
		public void clickAtAtDescriptionInGrid()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodes.uIPropertyCodesTable, PoliceData.getPropertyModuleValue("Description"));
		}

		public void clickAtAtDescription1InGrid()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodes.uIPropertyCodesTable,
					PoliceData.getPropertyModuleValue("Description1"));
		}

		public void clickAtAtDescription2InGrid()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodes.uIPropertyCodesTable,
					PoliceData.getPropertyModuleValue("Description2"));
		}

		public void clickAtAtDescription3InGrid()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodes.uIPropertyCodesTable,
					PoliceData.getPropertyModuleValue("Description3"));
		}

		public void clickAtAtDescription4InGrid()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodes.uIPropertyCodesTable,
					PoliceData.getPropertyModuleValue("Description4"));
		}

		public void clickAtAtDescription5InGrid()
		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodes.uIPropertyCodesTable,
					PoliceData.getPropertyModuleValue("Description5"));
		}

		public void verifyPropertyEntryCodesLable()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodes.uIPropertyEntryCodesLabel.getText(),
					"Property Entry Codes");
		}

		public void verifyPropertyRoomActionLable()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodes.uIPropertyRoomActionLabel.getText(),
					"Property Entry Codes");
		}

		public void verifyDispositionLable()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodes.uIDispositionLabel.getText(),
					"Disposition");
		}

		public void verifyOfficerStatusLable()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodes.uIOfficerStatusLabel.getText(),
					"Officer Status");
		}

		public void verifySealStatusLable()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodes.uISealStatusLabel.getText(), "Seal Status");
		}

		public void verifyHoldStatusLable()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodes.uIHoldStatusLabel.getText(), "Hold Status");
		}

		public void verifyAtDescription1InGrid()
		{
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodes.uIPropertyCodesTable, "Description", 0);

			verify.ExpectedValueIsTrue(gridCellInnerText.contains(PoliceData.getPropertyModuleValue("Description1")));
		}

		public void verifyAtDescription2InGrid()
		{
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodes.uIPropertyCodesTable, "Description", 0);
			verify.ExpectedValueIsTrue(gridCellInnerText.contains(PoliceData.getPropertyModuleValue("Description2")));
		}

		public void verifyAtDescription3InGrid()
		{
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodes.uIPropertyCodesTable, "Description", 0);
			verify.ExpectedValueIsTrue(gridCellInnerText.contains(PoliceData.getPropertyModuleValue("Description3")));
		}

		public void verifyAtDescription4InGrid()
		{
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodes.uIPropertyCodesTable, "Description", 0);
			verify.ExpectedValueIsTrue(gridCellInnerText.contains(PoliceData.getPropertyModuleValue("Description4")));
		}

		public void verifyAtDescription5InGrid()
		{
			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodes.uIPropertyCodesTable, "Description", 0);
			verify.ExpectedValueIsTrue(gridCellInnerText.contains(PoliceData.getPropertyModuleValue("Description5")));
		}

		public void clickDispositionRadioButton()
		{
			uIMapProperty.propertyCodes.uIDispositionRadioButton.click();
		}

		public void clickOfficerStatusRadioButton()
		{
			uIMapProperty.propertyCodes.uIOfficerStatusRadioButton.click();
		}

		public void clickHoldStatusRadioButton()
		{
			uIMapProperty.propertyCodes.uIHoldStatusRadioButton.click();
		}

		public void clickSealStatusRadioButton()
		{
			uIMapProperty.propertyCodes.uISealStatusRadioButton.click();
		}

		public void clickPropertyRoomActionRadioButton()
		{
			uIMapProperty.propertyCodes.uIPropertyRoomActionRadioButton.click();
		}

		public void clickIncludeInactiveCheckBox()
		{
			uIMapProperty.propertyCodes.uIIncludeInactiveCheckbox.click();
		}
		public void clickPrintBarcodeButton()
		{
			uIMapProperty.propertyCodes.uIPrintBarcodeButton.click();
		}

		public void clickAddNewButton()
		{
			uIMapProperty.propertyCodes.uIAddNewButton.click();
		}

		public void clickSelectAllCheckbox()
		{
			uIMapProperty.propertyCodes.uICheckAllCheckbox.click();
		}
	}

	public class PropertyCodesEntry
	{
		public void save()
		{
			uIMapProperty.propertyCodesEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton()
		{
			uIMapProperty.propertyCodesEntry.uISaveButton.click();
		}

		public void saveAndClose()
		{
			uIMapProperty.propertyCodesEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void clickSaveAndCloseButton()
		{
			uIMapProperty.propertyCodesEntry.uISaveAndCloseButton.click();
		}

		public void verifyAtDescription()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodesEntry.uIDescriptionEdit.getText(),
					"Description");
		}

		public void verifyAtDescription1()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodesEntry.uIDescriptionEdit.getText(),
					"Description1");
		}

		public void verifyAtDescription2()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodesEntry.uIDescriptionEdit.getText(),
					"Description2");
		}

		public void verifyAtDescription3()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodesEntry.uIDescriptionEdit.getText(),
					"Description3");
		}

		public void verifyAtDescription4()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodesEntry.uIDescriptionEdit.getText(),
				"Description4");
		}

		public void verifyAtDescription5()
		{
			verify.ExpectedPropertyValueIsEqual(uIMapProperty.propertyCodesEntry.uIDescriptionEdit.getText(),
					"Description5");
		}

	}
public class PropertyCodedLookup {
		

		public void randomKPIHelpSelect() {
			popup.switchToCodedSearch();
			Playback.popupThreadWait();
			Playback.popupThreadWait();
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable);
			Playback.popupThreadWait();
			Playback.popupThreadWait();
		}

		public void kPIHelpSelect(String srchValue) {
			popup.switchToCodedSearch();
			Playback.popupThreadWait();
			Playback.popupThreadWait();
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, srchValue);
			Playback.popupThreadWait();
			Playback.popupThreadWait();
		}

		public void enterAtDistrict() {
			String inactiveDistrict = PoliceData.getPropertyModuleValue("InactiveDistrict");
			uIMapProperty.propertyCodedLookup.uICodeValueEdit.sendKeys(inactiveDistrict);
		}

		public void clickIncludeInactiveCheckBox() {
			uIMapProperty.propertyCodedLookup.uIIncludeInactiveCheckBox.click();
		}

		public void clickSearchIcon() {
			String setupUrl = PropertiesFile.readPropertiesFile("url");
			if (setupUrl.contains("14.87") || setupUrl.contains("14.82")) {
				uIMapProperty.propertyCodedLookup.uISearchIconButtonFor87.click();
			} else {
				uIMapProperty.propertyCodedLookup.uISearchIconButton.click();
			}

		}

		public void clickClearIcon() {
			uIMapProperty.propertyCodedLookup.uIClearIconButton.click();
		}

		public void verifyAtDisrictInGridrow(int rowCount) {
			String inactiveDistrict = PoliceData.getPropertyModuleValue("InactiveDistrict");
			Assert.assertEquals(inactiveDistrict, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, "Value", rowCount));
		}

		public void verifyInactiveDistrictRowColor(int rowCount) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, rowCount).getAttribute("class")
					.contains("Grey"));
		}

		public void closeScreen() {
			uIMapProperty.propertyCodedLookup.driver.close();
		}

		public void selectContextRowAndClickChangeButton() {
			List<WebElement> elements = ((SearchContext) uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable)
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement uIElement = elements.get(Randomized.getRandomNumber(elements.size()));
			objectIdentification.manualIdentify.scrollIntoView(uIElement);
			new Actions(Playback.driver).contextClick(uIElement).perform();
			((SearchContext) uIElement).findElement(By.xpath("//div[@id='UltraWebMenu1']//li[@title = 'Change']"))
					.click();
		}

		public void clickAtDescription() {
			String description = PoliceData.getPropertyModuleValue("Description");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, description);
			Playback.controlReadyThreadWait();
		}
		public void enterAtCode() {
			String setupUrl = PropertiesFile.readPropertiesFile("url");
			if (setupUrl.contains("14.87") || setupUrl.contains("14.82")) {
				uIMapProperty.propertyCodedLookup.uICodeValueEditFor87
						.sendKeys(PoliceData.getPropertyModuleValue("Code"));
			} else {
				uIMapProperty.propertyCodedLookup.uICodeValueEdit.sendKeys(PoliceData.getPropertyModuleValue("Code"));
			}

		}

		public void enterCode(String value) {

			uIMapProperty.propertyCodedLookup.uICodeValueEdit.sendKeys(value);
		}

		public void verifyNIBRSInCodedScreen(int rowIndex) {
			popup.switchToCodedSearch();
			Playback.controlReadyThreadWait();

			String actual = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, "Nibrs", rowIndex);
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("NIBRSCode").toUpperCase(), actual);

		}
		public void enterAtDescription() {
			String setupUrl = PropertiesFile.readPropertiesFile("url");
			if (setupUrl.contains("14.87") || setupUrl.contains("14.82")) {
				uIMapProperty.propertyCodedLookup.uIDescriptionEditFor87
						.sendKeys(PoliceData.getPropertyModuleValue("Description"));
				Playback.controlReadyThreadWait();
			} else {
				uIMapProperty.propertyCodedLookup.uIDescriptionEdit
						.sendKeys(PoliceData.getPropertyModuleValue("Description"));
			}
		}

		public void verifyJurisAsPX() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, "Juris", 0);
			String text = gridCell.getText();
			verify.ExpectedPropertyValueIsEqual(text, "PX");
		}

		public void verifyJurisAsBC() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, "Juris", 1);
			String text = gridCell.getText();
			verify.ExpectedPropertyValueIsEqual(text, "BC");
		}

		public void selectJurisAsBC() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, "BC");
			Playback.controlReadyThreadWait();
		}

		public void verifyPFInCodedSearch(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(PoliceData.getPropertyModuleValue("PFCode"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, "PFCode", rowCount));

		}

		public void enterAtCharge() {
			String charge = PoliceData.getPropertyModuleValue("Charge");
			uIMapProperty.propertyCodedLookup.uICodeValueEdit.sendKeys(charge);
		}

		public void clickAtChargeInGrid() {
			String charge = PoliceData.getPropertyModuleValue("Charge");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, charge);
			Playback.controlReadyThreadWait();
		}

		public void selectCodeValueInGrid() {
			String code = PoliceData.getPropertyModuleValue("Code");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, code);
			Playback.controlReadyThreadWait();

		}

		public void enterAtDescription1() {
			uIMapProperty.propertyCodedLookup.uIDescriptionEdit.sendKeys(PoliceData.getPropertyModuleValue("Description1"));
			Playback.controlReadyThreadWait();

		}

		public void clickAtCharge1InGrid() {
			String charge = PoliceData.getPropertyModuleValue("Charge1");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, charge);
			Playback.controlReadyThreadWait();
		}

		public void selectAtZipCodeInGrid() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("ZipCode"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtDescription() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, "Description");
			for (String value : gridTableColumnValues)
				if (value.contains(PoliceData.getPropertyModuleValue("Description"))) {
					verify.ExpectedValueIsTrue(value.contains(PoliceData.getPropertyModuleValue("Description")));
				}
		}

		public void selectAtPFCode() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("PFCode"));
		}

		public void selectAtCharge() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("Charge"));
		}

		public void selectAtDispositionInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("Disposition"));
			Playback.controlReadyThreadWait();
		}

		public void selectAtDispositionInGrid1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("Disposition1"));
			Playback.controlReadyThreadWait();
		}

		public void selectAtCodeValueInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("CodeValue"));
			Playback.pageLoadThreadWait();

		}

		public void selectAtDescription1() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("Description1"));
			Playback.pageLoadThreadWait();

		}

		public void clickAtEventNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, PoliceData.getPropertyModuleValue("EventNo"));
			Playback.controlReadyThreadWait();
		}

		public void verifyEvidenceLockerAcknowledgeMessage() {
			popup.confirm.yesWithContainsMessage("Evidence Locker is in use with case");
		}

		public void enterAtCode1() {
			String code = PoliceData.getPropertyModuleValue("Code1");
			uIMapProperty.propertyCodedLookup.uICodeValueEdit.sendKeys(code);

		}

		public void clickAtDescription1() {
			String description = PoliceData.getPropertyModuleValue("Description1");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, description);
			Playback.controlReadyThreadWait();
		}

		public void verifyEvidenceSharedAcknowledgeMessage() {
			popup.confirm.yesWithContainsMessage("Evidence Locker is in use with another case’s property items");
		}

		public void verifyNoDuplicationFound() {

			List<WebElement> allRow = Playback.driver
					.findElements(By.xpath("//div[@id='grdSrch']//td[text()='7373  ']/../../tr"));
			ArrayList<String> allRowText = new ArrayList<String>();
			Set<String> hSet = new TreeSet<String>();
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable);
			for (WebElement currentRowtext : allRow) {
				String text = currentRowtext.getText();
				allRowText.add(text);

			}

			hSet.addAll(allRowText);
			verify.ExpectedValueIsTrue(allRowText.size() == hSet.size());
			Collection<String> intersection = CollectionUtils.intersection(allRowText, hSet);
			int checkedSize = intersection.size();
			verify.ExpectedIntergerValueIsEqualToActual(rowsCount, checkedSize);

		}

		public void verifyAddedCodeValueExsistsInGrid() {
			List<WebElement> allRow = Playback.driver
					.findElements(By.xpath("//div[@id='grdSrch']//td[text()='7373  ']/../../tr"));
			List<String> allRowText = null;
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable);
			for (int i = 0; i < rowsCount; i++) {

				allRowText = Arrays.asList(allRow.get(i).getText());
				for (String rowText : allRowText) {
					if (rowText.contains(PoliceData.getTestContextData("TransportTo"))) {
						verify.ExpectedValueIsTrue(rowText.contains(PoliceData.getTestContextData("TransportTo")));
					}
				}
			}
		}

		public void clickAddNewButton() {
			uIMapProperty.propertyCodedLookup.uIAddNewButton.click();
		}

		public void switchToZipCodeEntry() {
			objectIdentification.windowHandle.switchToWindowUsingURL("frmZip.aspx");
		}

		public List<String> getColumnValues(String columnName) {
			List<String> values = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapProperty.propertyCodedLookup.uIKPIHelpWindowTable, columnName);

			return values;
		}

		public void verifyColumnValuesAreSorted(List<String> values) {
			List<String> sortedValue = new ArrayList<>(values);
			Collections.sort(sortedValue);
			verify.ExpectedValueIsTrue(sortedValue.equals(values));

		}
	}
}
