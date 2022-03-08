package application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import dataAccess.BaseData;
import uIMaps.UIMapInventory;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Inventory {
	public UIMapInventory mUIMapInventory;
	public UIMapPopup mUIMapPopup;

	ObjectIdentification objectIdentification = new ObjectIdentification();
	Randomized randomized = new Randomized();
	UIMapInventory uIMapInventory = new UIMapInventory();
	Popup popup = new Popup();
	public Names names = new Names();
	UIMapPopup uIMapPopup = new UIMapPopup();

	public InventorySearch inventorySearch = null;
	public InventoryEntry inventoryEntry = null;
	public BatchAssignReturn batchAssignReturn = null;
	public StorageLocation storageLocation = null;
	public StorageLocationEntry storageLocationEntry = null;
	public EquipmentService equipmentService = null;
	public ItemEntrySearch itemEntrySearch = null;

	public Inventory() {
		if (inventorySearch == null)
			inventorySearch = new InventorySearch();
		if (inventoryEntry == null)
			inventoryEntry = new InventoryEntry();
		if (batchAssignReturn == null)
			batchAssignReturn = new BatchAssignReturn();
		if (storageLocation == null)
			storageLocation = new StorageLocation();
		if (storageLocationEntry == null)
			storageLocationEntry = new StorageLocationEntry();

		if (equipmentService == null)
			equipmentService = new EquipmentService();

		if (itemEntrySearch == null)
			itemEntrySearch = new ItemEntrySearch();
	}

	public void SwitchToInventorySearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Inventory/frmItemEntrySrch");
	}

	public void SwitchToInventorySearchEntryWindow() {
		objectIdentification.windowHandle.switchToWindow("Inventory Search");

	}

	public void SwitchToCRMInventorySearchEntryWindow() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmItemEntrySrch");

	}

	public void SwitchToInventoryEntry() {
		objectIdentification.windowHandle.switchToWindow("Inventory Entry");
	}

	public void SwitchToPrintScreen() {
		objectIdentification.windowHandle.switchToWindow("Print");
	}

	public void SwitchToBatchAssignReturn() {
		objectIdentification.windowHandle.switchToWindow("Batch Assign/Return");

	}

	public void SwitchToBatchAssignReturnScreenTab() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Batch Assign/Return");

	}

	public void SwitchToStorageLocation() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Inventory/frmStorageLocationSrch");
		Playback.pageLoadThreadWait();

	}

	public void SwitchToStorageLocationEntry() {
		objectIdentification.windowHandle.switchToWindow("Storage Location Entry");
	}

	public void SwitchToCheckOutInEntry() {
		objectIdentification.windowHandle.switchToWindow("Check Out/In Entry");
	}

	public void SwitchToInventorySearchII() {
		objectIdentification.windowHandle.switchToFrame("Inventory/frmItemEntrySrch");
	}

	public void switchToEquipmentServiceWindow() {
		objectIdentification.windowHandle.switchToWindow("Equipment Service");
	}

	public void switchToItemEntrySearch() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmItemEntrySrch_Id");
	}

	public class InventorySearch {
		public void enterAtInventoryNo() {

			uIMapInventory.inventorySearch.uIInventoryYearEdit
					.sendKeys(BaseData.getInventoryModuleValue("InventoryNo").substring(0, 2));
			uIMapInventory.inventorySearch.uIInventoryNumberEdit
					.sendKeys(BaseData.getInventoryModuleValue("InventoryNo").substring(3));
			uIMapInventory.inventorySearch.uIInventoryNumberEdit.sendKeys(Keys.TAB);

		}

		public void enterNumberControlInventoryNo() {
			uIMapInventory.inventorySearch.uIInventoryNumberEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumber(3)));
			uIMapInventory.inventorySearch.uIInventoryNumberEdit.sendKeys(Keys.ENTER);
		}

		public void clickSearchButton() {
			uIMapInventory.inventorySearch.uISearchButton.click();
		}

		public void clickResetButton() {
			uIMapInventory.inventorySearch.uIResetButton.click();
		}

		public void clickExpendableItemOnlyCheckbox() {
			uIMapInventory.inventorySearch.uIExpendableOnlyCheckbox.click();

		}

		public void selectAtCategory() {
			uIMapInventory.inventorySearch.uICategoryComboBox.sendKeys(BaseData.getInventoryModuleValue("Category"));
			uIMapInventory.inventorySearch.uICategoryComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtType() {
			uIMapInventory.inventorySearch.uITypeComboBox.sendKeys(BaseData.getInventoryModuleValue("Type"));
		}

		public void selectAtInventoryLocation() {
			new Select(uIMapInventory.inventorySearch.uIInventoryLocationComboBox)
					.selectByValue(BaseData.getInventoryModuleValue("InventoryLocation"));
		}

		public void enterAtMake() {
			uIMapInventory.inventorySearch.uIMakeEdit.sendKeys(BaseData.getInventoryModuleValue("Make"));
			uIMapInventory.inventorySearch.uIMakeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtModel() {
			uIMapInventory.inventorySearch.uIModelEdit.sendKeys(BaseData.getInventoryModuleValue("Model"));
		}

		public void enterAtDescription() {
			uIMapInventory.inventorySearch.uIDescriptionEdit.sendKeys(BaseData.getInventoryModuleValue("Description"));
		}

		public void enterAtScanBarCode() {
			uIMapInventory.inventorySearch.uIScanBarCodeEdit.sendKeys(BaseData.getInventoryModuleValue("ScanBarcode"));
			uIMapInventory.inventorySearch.uIScanBarCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtSerialNo() {
			uIMapInventory.inventorySearch.uISerialNoEdit.sendKeys(BaseData.getInventoryModuleValue("Serial"));
			uIMapInventory.inventorySearch.uISerialNoEdit.sendKeys(Keys.TAB);
		}

		public void selectAtCheckoutType() {
			uIMapInventory.inventorySearch.uICheckOutTypeComboBox
					.sendKeys(BaseData.getInventoryModuleValue("CheckoutType"));
			uIMapInventory.inventorySearch.uICheckOutTypeComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtVendor() {
			uIMapInventory.inventorySearch.uIVendorCodeEdit.sendKeys(BaseData.getInventoryModuleValue("Vendor"));
			uIMapInventory.inventorySearch.uIVendorCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickAddNew() {
			uIMapInventory.inventorySearch.uIAddNewButton.click();
		}

		public void clickBackButton() {
			uIMapInventory.inventorySearch.uIBackButton.click();
		}

		public void selectAtDateType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapInventory.inventorySearch.uIDateTypeComboBox,
					BaseData.getInventoryModuleValue("DateType"));
			uIMapInventory.inventorySearch.uIDateTypeComboBox.sendKeys(Keys.TAB);
		}

		public void enterFromToAsCurrentDate() {
			uIMapInventory.inventorySearch.uIFromDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapInventory.inventorySearch.uIToDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void enterAtDeptTrackingNo() {
			uIMapInventory.inventorySearch.uIDeptTrackingNoEdit
					.sendKeys(BaseData.getInventoryModuleValue("DeptTracking"));
		}

		public void clickAssertOnlyCheckBox() {
			uIMapInventory.inventorySearch.uIAssertOnlyCheckBox.click();
		}

		public void clickEquipmentLogOnlyCheckBox() {
			uIMapInventory.inventorySearch.uIEquipmentLogOnlyCheckBox.click();
		}

		public void selectRowByAtInventoryNo() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
		}

		public void selectRowByAtType() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("Type"));
		}

		public void selectRowByAtDescription() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("Description"));
		}

		public void RightclickRowByAtInventoryNoAndclickEquipmentServiceLink() {
			objectIdentification.manualIdentify.selectContextMenuItemInTheGridRow(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"),
					"Equipment Service");
		}

		public void selectRowByAtSerialNo() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("Serial"));
		}

		public void selectRowByAtQuantity() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("Qty")).click();
		}

		public void selectRowByAtDeptTracking() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("DeptTracking"));
		}

		public void clickRowByAtModel() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("Model"));
		}

		public void verifyAtInventoryNo() {
			WebElement uIInventoryRow = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			Assert.assertTrue(uIInventoryRow.getText().contains(BaseData.getInventoryModuleValue("InventoryNo")));
		}

		public void verifyQuantityZeroAppearInRedByAtInventoryNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			WebElement quantity = objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Qty");
			Assert.assertEquals("0", quantity.getText());
			Assert.assertEquals("gridrowclrR", quantity.getAttribute("class"));
		}

		public void verifyQuantityOneAppearInGridByAtInventoryNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			String text = objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Qty").getText();
			System.out.println(text);
			Assert.assertEquals("1", text);
		}

		public void verifyAtItemTypeByAtInventoryNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			Assert.assertEquals(BaseData.getInventoryModuleValue("Type"), objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Item Type").getText());
		}

		public void verifyWarranteeReplacedAsCurrentDateByAtInventory() {
			String str = Randomized.getCurrentDate().substring(6, 2);
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			Assert.assertEquals(Randomized.getCurrentDate().replace(str, ""), objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Warrantee/Replace").getText());
		}

		public void verifyAtInventoryLocationByAtInventoryNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			Assert.assertEquals(BaseData.getInventoryModuleValue("InventoryLocation"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Location").getText());
		}

		public void verifyAtPFNameInAssignedColumnByAtInventoryNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			Assert.assertEquals(BaseData.getInventoryModuleValue("PFName"), objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Assigned").getText());
		}

		public void verifyPurchaseDateAsCurrentDateByAtInventoryNo() {
			String str = Randomized.getCurrentDate().substring(6, 2);
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			Assert.assertEquals(Randomized.getCurrentDate().replace(str, ""), objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Purchased").getText());
		}

		public void verifyWarranteeReplacedAs30DayFutureFromCurrentDateAppearInYellowByAtInventoryNo() {
			String str = Randomized.getFutureDate(30, "MM/dd/yyyy").substring(6, 2);
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			WebElement warrantDate = objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Warrantee/Replace");
			Assert.assertEquals(Randomized.getFutureDate(30, "MM/dd/yyyy").replace(str, ""), warrantDate.getText());
			Assert.assertEquals("gridrowclrY", warrantDate.getAttribute("class"));
		}

		public void verifyWarranteeReplacedCurrentDateAppearInRedByAtInventoryNo() {
			String str = Randomized.getCurrentDate().substring(6, 2);
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			WebElement warrantDate = objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Warrantee/Replace");
			Assert.assertEquals(Randomized.getCurrentDate().replace(str, ""), warrantDate.getText());
			Assert.assertEquals("gridrowclrR", warrantDate.getAttribute("class"));
		}

		public void verifyAtDeptTrackingByAtInventoryNo() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
			Assert.assertEquals(BaseData.getInventoryModuleValue("DeptTracking"), objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable, row, "Tracking#").getText());
		}

		public void selectCheckboxInGrid() {
			objectIdentification.randomIdentify
					.selectRandomGridRowCheckbox(uIMapInventory.inventorySearch.uIInventoryTable);
		}

		public void clickAssignButton() {
			uIMapInventory.inventorySearch.uIAssignButton.click();
		}

		public void clickShowDueCheckbox() {
			uIMapInventory.inventorySearch.uIShowDueCheckbox.click();
		}

		public void enterServiceDueAsCurrentDate() {
			uIMapInventory.inventorySearch.uIServiceDueByEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void clickSelectCheckbox() {

			boolean checkbox = Boolean
					.parseBoolean(uIMapInventory.inventorySearch.uISelectCheckbox.getAttribute("checked"));

			if (checkbox == true) {
				WebElement check = (uIMapInventory.inventorySearch.uISelectCheckbox);
			}

			else
				uIMapInventory.inventorySearch.uISelectCheckbox.click();

		}

		public void verifyPerformBatchServiceLinkEnables() {
			Assert.assertTrue(uIMapInventory.inventorySearch.uIPerformBatchServiceButton.isEnabled());
		}

		public void clickSelectCheckboxByAtInventoryNo() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapInventory.inventorySearch.uIInventoryTable, BaseData.getInventoryModuleValue("InventoryNo"));
		}

		public void clickPerformBatchServiceButton() {
			uIMapInventory.inventorySearch.uIPerformBatchServiceButton.click();
		}

		public String readQuantityValueByAtInventoryNo() {

			String qty = objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable,
							BaseData.getInventoryModuleValue("InventoryNo"), "Qty")
					.getText();

			return qty;

		}

		public void verifyNoRecordAcknowledgeMessage() {
			if (Playback.browserType == "Chrome") {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void verifyAtAssigedUsingInventoryNo() {
			Playback.controlReadyThreadWait();
			Assert.assertEquals(BaseData.getInventoryModuleValue("Assigned"),
					objectIdentification.manualIdentify.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable,
							BaseData.getInventoryModuleValue("InventoryNo"), "Assigned").getText());
		}

		public void enterAtPFNo() {
			uIMapInventory.inventorySearch.uIPFNoCodeEdit.sendKeys(BaseData.getInventoryModuleValue("PFNo"));
			uIMapInventory.inventorySearch.uIPFNoCodeEdit.sendKeys(Keys.TAB);
		}

		public void selectAtFleetID() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapInventory.inventorySearch.uIFleetIDComboBox,
					BaseData.getInventoryModuleValue("FleetID"));
			uIMapInventory.inventorySearch.uIFleetIDComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtLocation() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapInventory.inventorySearch.uILocationComboBox,
					BaseData.getInventoryModuleValue("Location"));
			uIMapInventory.inventorySearch.uILocationComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtPurchaseDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("MM/dd/yy"),
					objectIdentification.manualIdentify.getGridCell(uIMapInventory.inventorySearch.uIInventoryTable,
							BaseData.getInventoryModuleValue("Purchased")).getText());

		}

		public void clickSelectCheckboxByAtInventoryNo(int rowNo) {
			if (rowNo == 0) {
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapInventory.inventorySearch.uIInventoryTable,
						BaseData.getInventoryModuleValue("InventoryNo"));
			} else {
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapInventory.inventorySearch.uIInventoryTable,
						BaseData.getInventoryModuleValue("InventoryNo" + rowNo + ""));
			}
		}

		public void VerifyPerformBatchServiceLinkEnables() {
			Assert.assertTrue(uIMapInventory.inventorySearch.uIPerformBatchServiceButton.isEnabled());
		}

		public void selectAtInventoryName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.uIInventoryNameComboBox,
					BaseData.getInventoryModuleValue("InventoryName"));
		}

		public void verifyAvailableQuantityIsZeroAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(11025) Available Quantity is 0");
		}
	}

	public class InventoryEntry {

		public InventoryEntryMainTab inventoryEntryMainTab = null;
		public AssignedIssuedHistoryTab assignedIssuedHistoryTab = null;
		public PurchaseHistoryTab purchaseHistoryTab = null;
		public ServiceHistoryTab serviceHistoryTab = null;
		public InventoryEntryNotesTab inventoryEntryNotesTab = null;
		public InventoryEntryDispositionTab inventoryEntryDispositionTab = null;
		public InventoryEntryActivityLogTab inventoryEntryActivityLogTab = null;

		public InventoryEntry() {
			if (inventoryEntryMainTab == null)
				inventoryEntryMainTab = new InventoryEntryMainTab();
			if (assignedIssuedHistoryTab == null)
				assignedIssuedHistoryTab = new AssignedIssuedHistoryTab();
			if (purchaseHistoryTab == null)
				purchaseHistoryTab = new PurchaseHistoryTab();
			if (serviceHistoryTab == null)
				serviceHistoryTab = new ServiceHistoryTab();
			if (inventoryEntryNotesTab == null)
				inventoryEntryNotesTab = new InventoryEntryNotesTab();
			if (inventoryEntryDispositionTab == null)
				inventoryEntryDispositionTab = new InventoryEntryDispositionTab();
			if (inventoryEntryActivityLogTab == null)
				inventoryEntryActivityLogTab = new InventoryEntryActivityLogTab();
		}

		public void enterEntryDate() {
			uIMapInventory.inventoryEntry.uIEntryDateEdit.sendKeys(Keys.TAB);
		}

		public void selectAtInventoryName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.uIInventoryNameComboBox,
					BaseData.getInventoryModuleValue("InventoryName"));
		}

		public void selectAtInvName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.uIInventoryNameComboBox, BaseData.getInventoryModuleValue("InvName"));
		}

		public void selectAtCategory() {
			uIMapInventory.inventoryEntry.uICategoryComboBox.sendKeys(BaseData.getInventoryModuleValue("Category"));
			uIMapInventory.inventoryEntry.uICategoryComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtType() {
			uIMapInventory.inventoryEntry.uITypeComboBox.sendKeys(BaseData.getInventoryModuleValue("Type"));
		}

		public void selectAtMake() {
			uIMapInventory.inventoryEntry.uIMakeComboBox.sendKeys(BaseData.getInventoryModuleValue("Make"));
		}

		public void enterAtModel() {
			uIMapInventory.inventoryEntry.uIModelEdit.sendKeys(BaseData.getInventoryModuleValue("Model"));
		}

		public void enterAtDescription() {
			uIMapInventory.inventoryEntry.uIDescriptionEdit.sendKeys(BaseData.getInventoryModuleValue("Description"));
		}

		public void clickMainTab() {
			uIMapInventory.inventoryEntry.uIMainTab.click();
		}

		public void clickPurchaseHistoryTab() {
			uIMapInventory.inventoryEntry.uIPurchaseHistoryTab.click();
		}

		public void clickAssignedIssuedHistoryTab() {
			uIMapInventory.inventoryEntry.uIAssignedIssuedHistoryTab.click();
		}

		public void clickServiceHistoryTab() {
			uIMapInventory.inventoryEntry.uIServiceHistoryTab.click();
		}

		public void clickNotesTab() {
			uIMapInventory.inventoryEntry.uINotesTab.click();
		}

		public void clickAttachmentTab() {
			uIMapInventory.inventoryEntry.uIAttachmentsTab.click();
		}

		public void switchToNotesTab() {
			uIMapInventory.inventoryEntry.uINotesTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmInvNotes");
		}

		public void clickDispositionTab() {
			uIMapInventory.inventoryEntry.uIDispositionTab.click();
		}

		public void verifyDispositionTabEnabled() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIDispositionTab.isEnabled());
		}

		public void save() {
			uIMapInventory.inventoryEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void saveNClose() {
			uIMapInventory.inventoryEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void verifyCopyButtonDisabled() {
			Assert.assertTrue(
					Boolean.parseBoolean(uIMapInventory.inventoryEntry.uICopyButton.getAttribute("disabled")));
		}

		public void clickCopyButton() {
			uIMapInventory.inventoryEntry.uICopyButton.click();
		}

		public void clickSaveButton() {
			uIMapInventory.inventoryEntry.uISaveButton.click();
		}

		public void clickReset() {
			uIMapInventory.inventoryEntry.uIResetButton.click();
			uIMapInventory.inventoryEntry.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void TabEntryDate() {
			uIMapInventory.inventoryEntry.uIEntryDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyCurrentDateAutoPopulatesInEntryDate() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.uIEntryDateEdit.getAttribute("value"));
		}

		public void verifyExpendableItemAppears() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIExpendableItemButton.isDisplayed());
		}

		public void clickBarCodeButton() {
			uIMapInventory.inventoryEntry.uIBarcodeButton.click();
		}

		public void verifyBarCodeImage() {
			String image = uIMapInventory.inventoryEntry.uIBarcodeButton.getAttribute("src");
			verify.ExpectedValueIsTrue(image.contains("Barcode.png"));
		}

		public void verifyStatusAsQtyReceived() {

			int temp = 20;
			String value = BaseData.getInventoryModuleValue("QtyReceived");
			int parseInt = Integer.parseInt(value);
			int qty = parseInt + temp;
			String QtyReceived = String.valueOf(qty);
			Assert.assertEquals(("Available Quantity: " + QtyReceived),
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
		}

		public void verifyStatusAsGreenAndAvailableQuantity9() {
			Assert.assertEquals("Available Quantity: 9",
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
			Assert.assertTrue(
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsGreenAndAvailableQuantity10() {
			Assert.assertEquals("Available Quantity: 10",
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
			Assert.assertTrue(
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsRedAndAvailableQuantity8ReorderNow() {
			Assert.assertEquals("Available Quantity: 8. Reorder Now",
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
			Assert.assertTrue(
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getAttribute("style").contains("red"));
		}

		public void verifyStatusAsRedAndAvailableQuantity9ReorderNow() {
			Assert.assertEquals("Available Quantity: 9. Reorder Now",
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
			Assert.assertTrue(
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getAttribute("style").contains("red"));
		}

		public void verify11028InvalidReturnAckMessage() {
			popup.acknowledge.okWithExpectedMessage("(11028) Invalid Return"); // "(11028) Invalid Return"
		}

		public void verify11027AbleToReturnOnly2AckMessage() {
			popup.acknowledge.okWithExpectedMessage("(11027) Able to Return Only 2");// "(11027) Able to Return Only 2"

		}

		public void verify11039ConfirmMessage() {
			Playback.controlReadyThreadWait();
			popup.confirm.yesWithExpectedMessage(
					"(11039) Entered Quantity is less than the current stock quantity value. Are you sure you want to decrease the stock?");
		}

		public void verify3032EnterQtyAckMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Qty");// "(3032) Enter Qty"

		}

		public void verify3032EnterDivisionAckMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Division");
		}

		public void verify3032EnterStationAckMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Station");
		}

		public void cancelPrintWindow() {
//			Set<String> windowHandles = Playback.driver.getWindowHandles();
//			for (String windowHandle : windowHandles) {
//				if(!Playback.driver.switchTo().window(windowHandle).getTitle().contains("Public Safe")||Playback.driver.switchTo().window(windowHandle).getTitle().contains("Inventory"))
//					Playback.driver.switchTo().window(windowHandle);
//			}
//				

			Robot r;
			try {
				r = new Robot();
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				r.delay(3000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				e.printStackTrace();
			}

		}

		public void close() {
			uIMapInventory.inventoryEntry.driver.close();
		}

		public void verifyConfirmCopyMessage() {
			Playback.controlReadyThreadWait();
			popup.confirm
					.yesWithExpectedMessage("(11036) Would you like to copy the purchase history information?");
		}

		public void verifyCurrentDate() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.uIEntryDateEdit.getAttribute("value"));
		}

		public void verifyCopyScreenTabs() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIPurchaseHistoryTab.isDisplayed());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIMainTab.isDisplayed());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uINotesTab.isDisplayed());
			Assert.assertFalse(uIMapInventory.inventoryEntry.uIAssignedIssuedHistoryTab.isDisplayed());
			// Verify.ExpectedValueIsFalse(PnxBaseTest.UIMapInventory.uIMapInventory.inventoryEntry.uIServiceHistoryTAB.Displayed);
			// //due to 2018 R2 sTABle enhancement
			Assert.assertFalse(uIMapInventory.inventoryEntry.uIDispositionTab.isDisplayed());
			Assert.assertFalse(uIMapInventory.inventoryEntry.uIAttachmentsTab.isDisplayed());
		}

		public void verifyAllTabEnabled() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIPurchaseHistoryTab.isEnabled());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIAssignedIssuedHistoryTab.isEnabled());
			// Assert.assertTrue(PnxBaseTest.UIMapInventory.uIMapInventory.inventoryEntry.uIServiceHistoryTAB.Enabled);
			// //due to 2018 R2 sTABle enhancement
			Assert.assertTrue(uIMapInventory.inventoryEntry.uINotesTab.isEnabled());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIDispositionTab.isEnabled());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIAttachmentsTab.isEnabled());
		}

		public void verifyInventoryNoAutoPopulate() {
			Assert.assertEquals(Randomized.getCurrentDate("yy"),
					uIMapInventory.inventoryEntry.uIInventoryYearEdit.getAttribute("value"));
			Assert.assertTrue(
					uIMapInventory.inventoryEntry.uIInventoryNumberEdit.getAttribute("value").contains("000"));
		}

		public void verifyAcknowledgePurchaseHistory() {
			Playback.popupThreadWait();
			popup.acknowledge.okWithExpectedMessage(
					"(11029) Please save the Purchase History prior to Assigning/Issuing Inventory"); // "(11029) Please
		}

		public void verifyStatusAsAvaliable() {

			Assert.assertEquals("Available", uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
			Assert.assertTrue(
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getAttribute("style").contains("green"));
		}

		public void verifyStatusAsPersonnelAssignedTo() {
			Assert.assertEquals(("Assigned To: " + BaseData.getInventoryModuleValue("IssuedTo")),
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
		}

		public void verifyStatusAsDivisionAssignedTo() {
			Assert.assertEquals(("Assigned To: " + BaseData.getInventoryModuleValue("Division")),
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
		}

		public void verifyStatusAsFleetAssignedTo() {
			Assert.assertEquals(
					("Assigned To: " + BaseData.getInventoryModuleValue("Fleet") + "; "
							+ BaseData.getInventoryModuleValue("Location")),
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
		}

		public void verifyStatusAsStationAssignedTo() {
			Assert.assertEquals(("Assigned To: " + BaseData.getInventoryModuleValue("Station")),
					uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
		}

		public void verifyEntryDateFieldBlank() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIEntryDateEdit.getAttribute("value").equals(null));
		}

		public void verifyAssertItemLableAppears() {
			Assert.assertEquals("Asset Item",
					uIMapInventory.inventoryEntry.uICategoryTextDisplayButton.getAttribute("value"));

		}

		public void verifyAllTabsEnabledAndDispositionTabDisabled() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIMainTab.isEnabled());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIPurchaseHistoryTab.isEnabled());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIAssignedIssuedHistoryTab.isEnabled());
			// Assert.assertTrue(PnxBaseTest.UIMapInventory.uIMapInventory.inventoryEntry.uIServiceHistoryTAB.Enabled);
			// due to 2018 R2 sTABle enhancement
			Assert.assertTrue(uIMapInventory.inventoryEntry.uINotesTab.isEnabled());
			Assert.assertTrue(uIMapInventory.inventoryEntry.uIAttachmentsTab.isEnabled());
			Assert.assertTrue(!uIMapInventory.inventoryEntry.uIDispositionTab.isEnabled());
		}

		public void verifyAtStatusInMenuBar() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText(),
					BaseData.getInventoryModuleValue("Status"));
		}

		public void verifyStatusAsGreenAndAvailable() {
			Assert.assertEquals("Available", uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getText());
//          Assert.assertTrue(uIMapInventory.inventoryEntry.uIStatusMenuBarTextView.getAttribute("style").contains("Green"));
		}

		public String readInventoryNo() {
			String year = uIMapInventory.inventoryEntry.uIInventoryYearEdit.getAttribute("value");
			String No = uIMapInventory.inventoryEntry.uIInventoryNumberEdit.getAttribute("value");
			String invNo = year + "-" + No;

			return invNo;
		}

		public void clickActivityLogTab() {
			uIMapInventory.inventoryEntry.uIActivityLogTab.click();
		}

		public void enterUnitCostAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Unit Cost");

		}

	}

	public class InventoryEntryMainTab {

		public void EnterNextDueAs1DayFutureDateFromCurrentDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.clear();
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit
					.sendKeys(Randomized.getFutureDate(1, "MM/dd/yyyy"));
		}

		public void EnterNextDueAsCurrentDate() {
			Playback.controlReadyThreadWait();
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.click();
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.clear();
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void EnterReplaceByAsCurrentDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIReplaceByDateEdit
					.sendKeys(Randomized.getCurrentDate());
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIReplaceByDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCurrentDateAutopopulatesInReplaceBy() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIReplaceByDateEdit.getAttribute("value"));
		}

		public void EnterWarrantyExpirationAsCurrentDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIWarrantyExpirationDateEdit
					.sendKeys(Randomized.getCurrentDate());
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIWarrantyExpirationDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterWarrantyExpirationAs30DayFutureFromCurrentDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIWarrantyExpirationDateEdit.clear();
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIWarrantyExpirationDateEdit
					.sendKeys(Randomized.getFutureDate(30, "MM/dd/yyyy"));
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIWarrantyExpirationDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyWarrantyExpirationAs30DayFutureFromCurrentDate() {
			Assert.assertEquals(Randomized.getFutureDate(30, "MM/dd/yyyy"),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIWarrantyExpirationDateEdit
							.getAttribute("value"));
		}

		public void VerifyCurrentDateAutopopulatesInWarrantyExpiration() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIWarrantyExpirationDateEdit
							.getAttribute("value"));
		}

		public void SelectAtLadderType() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILadderTypeComboBox
					.sendKeys(BaseData.getInventoryModuleValue("LadderType"));
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILadderTypeComboBox.sendKeys(Keys.TAB);
		}

		public void EnterLadderLength() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILadderLengthEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumber(3)));
		}

		public void SelectSelectServiceAsMonth() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox, "Monthly");
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox.sendKeys(Keys.TAB);
		}

		public void SelectColor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIColor1ComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIColor2ComboBox);
		}

		public void EnterAtSerialNo() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uISerialNoEdit
					.sendKeys(BaseData.getInventoryModuleValue("Serial"));
		}

		public void EnterAtCustom1() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICustom1Edit
					.sendKeys(BaseData.getInventoryModuleValue("Custom1"));
		}

		public void SelectAtCheckoutType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICheckOutTypeComboBox,
					BaseData.getInventoryModuleValue("CheckoutType"));
		}

		public void SelectCheckoutType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICheckOutTypeComboBox);
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICheckOutTypeComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtCheckoutNo() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICheckOutNoEdit
					.sendKeys(BaseData.getInventoryModuleValue("Checkout"));
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICheckOutNoEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtDeptTracking() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIDeptTrackingNoEdit
					.sendKeys(BaseData.getInventoryModuleValue("DeptTracking"));
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIDeptTrackingNoEdit.sendKeys(Keys.TAB);
		}

		public void clickLogEquipmentCheckBox() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILogEquipmentCheckBox.click();
		}

		public void EnterLastDateAsCurrentDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILastServiceDateEdit
					.sendKeys(Randomized.getCurrentDate());
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILastServiceDateEdit.sendKeys(Keys.TAB);
		}

		public void SelectSelectServiceAsQuarterly() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox, "Quarterly");
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox.sendKeys(Keys.TAB);
		}

		public void SelectSelectServiceAsSemiAnnual() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox, "Semi Annual");
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox.sendKeys(Keys.TAB);
		}

		public void SelectSelectServiceAsAnnual() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox, "Annual");
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIServiceCycleComboBox.sendKeys(Keys.TAB);
		}

		public void SelectBaseMonthAsCurrentMonth() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIBaseMonthComboBox,
					Randomized.getCurrentMonthFullName());
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIBaseMonthComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyNextDueDateAsMonthLater() {
			String getFutureDate = Randomized.getFutureDateByMonth(1, "MM/dd/yyyy");
			String removeStr = getFutureDate.substring(2, 3);
			String getModifiedDate = getFutureDate.replace(removeStr, "/");
			Assert.assertEquals(getModifiedDate,
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.getAttribute("value"));
		}

		public void VerifyNextDueAsNextYearCurrentMonthFirstDay() {

			Assert.assertEquals(
					Randomized.getCurrentMonth() + "/" + "01" + "/" + Randomized.getFutureYearByNoOfYears(1, "yyyy"),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.getAttribute("value"));
		}

		public void VerifyNextDueDateAsQuarterlyLater() {
			Assert.assertEquals(Randomized.getFutureDateByMonth(3, "MM/dd/yyyy"),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.getAttribute("value"));
		}

		public void VerifyNextDueDateAsSemiannualLater() {
			Assert.assertEquals(Randomized.getFutureDateByMonth(6, "MM/dd/yyyy"),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.getAttribute("value"));
		}

		public void VerifyNextDueDateAsMonthLaterwithFirstDate() {
			Assert.assertEquals(Randomized.getFutureDateByMonth(1, "MM/01/yyyy"),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.getAttribute("value"));
		}

		public void VerifyNextDueDateAsQuarterlyLaterwithFirstDate() {
			Assert.assertEquals(Randomized.getFutureDateByMonth(3, "MM/01/yyyy"),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.getAttribute("value"));
		}

		public void VerifyNextDueDateAsSemiannualLaterwithFirstDate() {
			Assert.assertEquals(Randomized.getFutureDateByMonth(6, "MM/01/yyyy"),
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.getAttribute("value"));
		}

		public void VerifyAcknowledgeDeptTrackingMessage() {
			popup.acknowledge.okWithExpectedMessage("(1046) Record already exists Please check the DeptTracking No");
		}

		public void VerifyAcknowledgeCheckOutMessage() {
			popup.acknowledge.okWithExpectedMessage("(1046) Record already exists Please check the CheckOut No");
		}

		public void VerifySerialNoEmpty() {
			Assert.assertTrue(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uISerialNoEdit.getAttribute("value") == "");
		}

		public void EnterAtComment() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICommentsEdit
					.sendKeys(BaseData.getInventoryModuleValue("Comment"));
		}

		public void SelectAtCheckOutType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICheckOutTypeComboBox,
					BaseData.getInventoryModuleValue("CheckoutType"));
		}

		public void EnterCheckout() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uICheckOutEdit
					.sendKeys(Integer.toString(Randomized.getRandomNumber()));
		}

		public void EnterAtExistingDeptTracking() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIDeptTrackingEdit
					.sendKeys(BaseData.getInventoryModuleValue("ExistingDeptTracking"));
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIDeptTrackingEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtNewDeptTracking() {
			Playback.controlReadyThreadWait();
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIDeptTrackingEdit
					.sendKeys(BaseData.getInventoryModuleValue("NewDeptTracking"));
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIDeptTrackingEdit.sendKeys(Keys.TAB);
		}

		public void Verify1046AcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1046) Record already exists Please check the DeptTracking No");
		}

		public void clearReorderQuantity() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIReorderQuantityEdit.clear();
		}

		public void EnterAtReorderQuantity() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIReorderQuantityEdit
					.sendKeys(BaseData.getInventoryModuleValue("ReorderQty"));
		}

		public void clearLastServiceDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILastServiceDateEdit.clear();
		}

		public void clearNextDueDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uINextDueDateEdit.clear();
		}

		public void EnterLastServiceDateAsLastMonthCurrentDate() {
			uIMapInventory.inventoryEntry.inventoryEntryMainTab.uILastServiceDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(1, "MM/dd/yyyy"));
		}

		public void selectAtItemCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.inventoryEntryMainTab.uIItemCodeComboBox,
					BaseData.getInventoryModuleValue("ItemCode"));

		}
	}

	public class AssignedIssuedHistoryTab {

		public void SelectAtAction() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIActionComboBox
					.sendKeys(BaseData.getInventoryModuleValue("Action"));
		}

		public void SelectActionAsAssigned() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIActionComboBox, "Assigned");
		}

		public void SelectActionAsReturened() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIActionComboBox, "Returned");
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIActionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterProcessedDateTime() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIProcessedDateEdit.sendKeys(Keys.TAB);
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIProcessedTimeEdit.sendKeys(Keys.TAB);
		}

		public void TabOutBy() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIByPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtPFCode() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIPFCodeEdit
					.sendKeys(BaseData.getInventoryModuleValue("PFCode"));
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void clickFleetCheckBox() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIFleetRadioButton.click();
		}

		public void clickDivisionCheckBox() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIDivisionRadioButton.click();
		}

		public void clickStationCheckBox() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIStationRadioButton.click();
		}

		public void EnterAtFleetNo() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIFleetNoCodeEdit
					.sendKeys(BaseData.getInventoryModuleValue("Fleet"));
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIFleetNoCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIFleetLocationComboBox,
					BaseData.getInventoryModuleValue("Location"));
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIFleetLocationComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIDivisionComboBox,
					BaseData.getInventoryModuleValue("Division"));
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIDivisionComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtStation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIStationComboBox,
					BaseData.getInventoryModuleValue("Station"));
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIStationComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtStation1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIStationComboBox,
					BaseData.getInventoryModuleValue("Station1"));
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIStationComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyAsByPF() {
			Assert.assertEquals(BaseData.getInventoryModuleValue("UserName"),
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIByPFCodeEdit.getAttribute("value"));
		}

		public void VerifyCurrentDate() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIProcessedDateEdit.getAttribute("value"));
		}

		public void VerifyFleetDivisionStationDisabled() {
			Assert.assertTrue(
					Boolean.parseBoolean(uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIFleetRadioButton
							.getAttribute("disabled")));
			Assert.assertTrue(
					Boolean.parseBoolean(uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIDivisionRadioButton
							.getAttribute("disabled")));
			Assert.assertTrue(
					Boolean.parseBoolean(uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIStationRadioButton
							.getAttribute("disabled")));
		}

		public void VerifyAcknowledgeStationMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Station");
		}

		public void VerifyAcknowledgePFMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter PF No");
		}

		public void TabOutProcessedDateTime() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIProcessedDateEdit.sendKeys(Keys.TAB);
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIProcessedTimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtQuantity() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIQuantityEdit
					.sendKeys(BaseData.getInventoryModuleValue("Quantity"));
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIQuantityEdit.sendKeys(Keys.TAB);
		}

		public void clearQuantity() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIQuantityEdit.clear();
		}

		public void EnterQuantityAs3() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIQuantityEdit.sendKeys("3");
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIQuantityEdit.sendKeys(Keys.TAB);
		}

		public void clickPersonnelRadioButton() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIPersonnelRadioButton.click();
		}

		public void clickFleetRadioButton() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIFleetRadioButton.click();
		}

		public void clickDivisionRadioButton() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIDivisionRadioButton.click();
		}

		public void clickStationRadioButton() {
			uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIStationRadioButton.click();
		}

		public void VerifyLoggedPFAutopopulates() {
			Assert.assertEquals(BaseData.getInventoryModuleValue("UserName"),
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIByPFCodeEdit.getAttribute("value"));
		}

		public void VerifyCurrentDateAutopopulatesInProcessedDateField() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.assignedIssuedHistoryTab.uIProcessedDateEdit.getAttribute("value"));
		}

	}

	public class PurchaseHistoryTab {

		public void EnterPurchaseDate() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPurchaseDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterByPF() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIByPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtInventoryLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIInventoryLocationComboBox,
					BaseData.getInventoryModuleValue("InventoryLocation"));
		}

		public void SelectInventoryLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIInventoryLocationComboBox, 1);
		}

		public void EnterAtVendorName() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIVenderNameCodeEdit
					.sendKeys(BaseData.getInventoryModuleValue("VendorName"));
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIVenderNameCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtHowAccquired() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIHowAcquiredComboBox,
					BaseData.getInventoryModuleValue("HowAcquired"));
		}

		public void EnterAtUnitCost() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIUnitCostEdit
					.sendKeys(BaseData.getInventoryModuleValue("UnitCost"));
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIUnitCostEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clearScanBarCode() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIScanBarCodeRFIDEdit.click();
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIScanBarCodeRFIDEdit.clear();
		}

		public void clickBatchScanItemButton() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIBatchScanItemButton.click();
			Playback.popupThreadWait();
		}

		public void EnterAtScanBarCode() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIScanBarCodeRFIDEdit.clear();
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIScanBarCodeRFIDEdit
					.sendKeys(BaseData.getInventoryModuleValue("ScanBarcode"));
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIScanBarCodeRFIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterScanBarCodeAs1000() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit.sendKeys("1000");
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterScanBarCodeAs1001() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit.sendKeys("1001");
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit.sendKeys(Keys.TAB);
		}

		public void clickUpdateButton() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIUpdateButton.click();
		}

		public void VerifyBatchScanButtonGreen() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.purchaseHistoryTab.uIBatchScanItemButton
					.getAttribute("style").contains("green"));
		}

		public void VerifyTotalCostByMultiplyQtyAndUnitCost() {
			int TotalUnit = Integer.parseInt(BaseData.getInventoryModuleValue("QtyReceived"))
					* Integer.parseInt(BaseData.getInventoryModuleValue("UnitCost"));
			Assert.assertEquals("$" + Integer.toString(TotalUnit) + ".00",
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uITotalCostEdit.getAttribute("value"));
		}

		public void VerifyAtTotalCost() {
			String str = uIMapInventory.inventoryEntry.purchaseHistoryTab.uITotalCostEdit.getAttribute("value")
					.substring(0, 1);
			Assert.assertTrue(uIMapInventory.inventoryEntry.purchaseHistoryTab.uITotalCostEdit.getAttribute("value")
					.replace(str, "").contains(BaseData.getInventoryModuleValue("UnitCost")));
		}

		public void VerifyAcknowledgeDuplicateMessage() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void VerifyAcknowledgeCostMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Unit Cost");
		}

		public void VerifyConfirmDuplicateScanBarcodeMessage() {

			popup.confirm.yesWithContainsMessage("(6040)       Barcode  Exist in ");
			/*
			 * Playback.controlReadyThreadWait(); String ackMessage =
			 * Playback.driver.switchTo().alert().getText();
			 * Assert.assertTrue(ackMessage.contains("(6040)       Barcode  Exist in"));//
			 * "(6040) Barcode Exist in"
			 * Assert.assertTrue(ackMessage.contains("Do you still want to add"));
			 * Playback.driver.switchTo().alert().accept();
			 * Playback.controlReadyThreadWait();
			 */
		}

		public void SelectRandomRowInGrid() {
			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPurchaseHistoryTable);
		}

		public void TabOutPurchaseDate() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPurchaseDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCurrentDateAutoPopulatesInPurchaseDate() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPurchaseDateEdit.getAttribute("value"));
		}

		public void VerifyDefaultLoggedPfAutoPopulatesInByField() {
			Assert.assertEquals(BaseData.getInventoryModuleValue("UserName"),
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIByPFCodeEdit.getAttribute("value"));
		}

		public void TabOutByPF() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIByPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtQtyReceived() {
			Playback.controlReadyThreadWait();
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIQtyReceivedEdit
					.sendKeys(BaseData.getInventoryModuleValue("QtyReceived"));
		}

		public void EnterAtPopUpScanBarCode() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit
					.sendKeys(BaseData.getInventoryModuleValue("ScanBarcode"));
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPopUpScanBarCode2() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit
					.sendKeys(BaseData.getInventoryModuleValue("ScanBarcode2"));
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPanelScanBarCodeRFIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterExpirationDateAsOneDayFutureFromCurrentDate() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIExpirationDateEdit
					.sendKeys(Randomized.getFutureDate(1, "MM/dd/yyyy"));
		}

		public void EnterExpirationDateAsCurrentDate() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIExpirationDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void VerifyExpirationDateAsCurrentDate() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIExpirationDateEdit.getAttribute("value"));
		}

		public void VerifyExpirationDateAsOneDayFutureFromCurrentDate() {
			Assert.assertEquals(Randomized.getFutureDate(1, "MM/dd/yyyy"),
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIExpirationDateEdit.getAttribute("value"));
		}

		public void clickAddButton() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIAddButton.click();
		}

		public void Verify3032EnterQtyReceivedAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Qty Received");// "(3032) Enter Qty Received"
		}

		public void VerifyTotalQuantityAtQtyReceived() {
			int temp = 20;
			String value = BaseData.getInventoryModuleValue("QtyReceived");
			int parseInt = Integer.parseInt(value);
			int qty = parseInt + temp;
			String QtyReceived = String.valueOf(qty);
			Assert.assertEquals(QtyReceived,
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uITotalQuantityEdit.getAttribute("value"));
		}

		public void clickRowByAtVendorName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIPurchaseHistoryTable,
					BaseData.getInventoryModuleValue("VendorName"));
		}

		public void VerifyQuantityReceivedFieldAsDisabledAndValueAs1() {
			Assert.assertTrue(Boolean.parseBoolean(
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIQtyReceivedEdit.getAttribute("disabled")));
			Assert.assertEquals("1",
					uIMapInventory.inventoryEntry.purchaseHistoryTab.uIQtyReceivedEdit.getAttribute("value"));
		}

		public void ClearExpirationDate() {
			uIMapInventory.inventoryEntry.purchaseHistoryTab.uIExpirationDateEdit.clear();
		}

	}

	public class ServiceHistoryTab {

		public void clickAddServiceHistoryButton() {
			uIMapInventory.inventoryEntry.serviceHistoryTab.uIAddServiceHistoryButton.click();
			Playback.popupThreadWait();
		}

		public void EnterDate() {
			uIMapInventory.inventoryEntry.serviceHistoryTab.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCurrentDate() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapInventory.inventoryEntry.serviceHistoryTab.uIDateEdit.getAttribute("value"));
		}

		public void EnterAtServicedTestedBy() {
			uIMapInventory.inventoryEntry.serviceHistoryTab.uIServicedTestedByPFCodeEdit
					.sendKeys(BaseData.getInventoryModuleValue("ServicedTestedBy"));
			uIMapInventory.inventoryEntry.serviceHistoryTab.uIServicedTestedByPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapInventory.inventoryEntry.serviceHistoryTab.uIConditionComboBox);
		}

		public void EnterNotes() {
			uIMapInventory.inventoryEntry.serviceHistoryTab.uINotesEdit.sendKeys("To Test for Automation");
		}

		public void clickAddButton() {
			uIMapInventory.inventoryEntry.serviceHistoryTab.uIAddButton.click();
		}

		public void VerifyServiceAdded(int rowIndex) {
			Assert.assertEquals(Randomized.getCurrentDate(), objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapInventory.inventoryEntry.serviceHistoryTab.uIServiceHistoryResultTable, "Date", rowIndex));
			Assert.assertTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapInventory.inventoryEntry.serviceHistoryTab.uIServiceHistoryResultTable) == 1);
		}

		public void VerifyServiceHistoryNoData() {
			Assert.assertTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapInventory.inventoryEntry.serviceHistoryTab.uIServiceHistoryResultTable) == 0);
		}

	}

	public class InventoryEntryNotesTab {

		public void EnterUpdatedDateTime() {
			uIMapInventory.inventoryEntry.inventoryEntryNotesTab.uIUpdateDateEdit.click();
			uIMapInventory.inventoryEntry.inventoryEntryNotesTab.uIProcessedTimeEdit.click();
		}

		public void clickSaveButton() {
			uIMapInventory.inventoryEntry.inventoryEntryNotesTab.uISaveButton.click();
		}

		public void save() {
			uIMapInventory.inventoryEntry.inventoryEntryNotesTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void EnterComments() {
			uIMapInventory.inventoryEntry.inventoryEntryNotesTab.uICommentsEdit.sendKeys("Automation Notes added");
		}

		public void VerifyAcknowledgeRequiredMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");// "(1018) Required Entries
																							// are Missing"
		}

		public void VerifyNotesAdded() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.inventoryEntryNotesTab.uINotesGridCommentsText.getText()
					.contains("Automation Notes added"));
			System.out.println(Randomized.getCurrentDate("MM/dd/yy"));
			Assert.assertTrue(uIMapInventory.inventoryEntry.inventoryEntryNotesTab.uINotesGridDateText.getText()
					.contains(Randomized.getCurrentDate("MM/dd/yy")));
		}
	}

	public class InventoryEntryDispositionTab {

		public void VerifyAuthorizedByFieldEmpty() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.inventoryEntryDispositionTab.uIAuthorizedByCodeEdit
					.getAttribute("value").contains(""));
		}

		public void VerifyDispositionDateFieldEmpty() {
			Assert.assertTrue(uIMapInventory.inventoryEntry.inventoryEntryDispositionTab.uIDispositionDateEdit
					.getAttribute("value") == "");
		}
	}

	public class InventoryEntryActivityLogTab {
		public void verifyAtActivityTypeInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String ActivityType = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapInventory.inventoryEntry.inventoryEntryActivityLogTab.uIActivityResultTable, "Activity Type",
					rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getInventoryModuleValue("ActivityType"), ActivityType);
		}

		public void verifyAtDateInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String Date = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapInventory.inventoryEntry.inventoryEntryActivityLogTab.uIActivityResultTable, "Date Time",
					rowIndex);
			verify.ExpectedValueIsTrue(Date.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtSubjectInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String InventorySub = objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapInventory.inventoryEntry.inventoryEntryActivityLogTab.uIActivityResultTable, "Subject",
					rowIndex);
			verify.ExpectedValueIsTrue(InventorySub.contains(BaseData.getInventoryModuleValue("InventoryNo")));
		}

		public void selectRowByActivityType() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapInventory.inventoryEntry.inventoryEntryActivityLogTab.uIActivityResultTable,
					BaseData.getInventoryModuleValue("ActivityType"));
		}
	}

	public class BatchAssignReturn {
		public WebDriver driver;

		public void clickSaveButton() {
			uIMapInventory.batchAssignReturn.uISaveButton.click();
		}

		public void SelectAtFleetLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.batchAssignReturn.uILocationComboBox,
					BaseData.getInventoryModuleValue("FleetLocation"));
		}

		public void SelectAtLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.batchAssignReturn.uILocationComboBox, BaseData.getInventoryModuleValue("Location"));
		}

		public void Verify3032EnterLocationAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Location");

		}

		public void Save() {
			uIMapInventory.batchAssignReturn.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void VerifyAtInventoryNoItemsSelectedInGrid() {
			Assert.assertEquals(BaseData.getInventoryModuleValue("InventoryNo"),
					objectIdentification.manualIdentify.getGridCell(uIMapInventory.batchAssignReturn.uIBatchAssignTable,
							BaseData.getInventoryModuleValue("InventoryNo")).getText());
		}

		public void DoubleclickQuantityCellByAtInventoryNo() {

			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.batchAssignReturn.uIBatchAssignTable,
					BaseData.getInventoryModuleValue("InventoryNo"));
			WebElement quantityCell = objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.batchAssignReturn.uIBatchAssignTable, row, "Qty");
			Actions action = new Actions(Playback.driver);
			action.doubleClick(quantityCell);

		}

		public void EnterQuantityInGridByAtInventoryNo(String quantity) {

			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapInventory.batchAssignReturn.uIBatchAssignTable,
					BaseData.getInventoryModuleValue("InventoryNo"));
			WebElement quantityCell = objectIdentification.manualIdentify
					.getGridCell(uIMapInventory.batchAssignReturn.uIBatchAssignTable, row, "Qty");
			Actions action = new Actions(Playback.driver);
			action.sendKeys(quantityCell, quantity);

		}

	}

	public class StorageLocation {

		public void clickAddNewButton() {
			uIMapInventory.storageLocation.uIAddNewButton.click();
		}

		public void EnterAtDescription() {
			uIMapInventory.storageLocation.uIDescriptionEdit.sendKeys(BaseData.getInventoryModuleValue("Description"));
		}

		public void clickSearchButton() {
			uIMapInventory.storageLocation.uISearchButton.click();
		}

		public void VerifyAtDescriptionInGrid() {
			Playback.pageLoadThreadWait();
			Assert.assertEquals(BaseData.getInventoryModuleValue("Description"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapInventory.storageLocation.uIStorageLocationTable,
									BaseData.getInventoryModuleValue("Description"))
							.getText());
		}

	}

	public class StorageLocationEntry {

		public void EnterAtDescription() {
			uIMapInventory.storageLocationEntry.uIDescriptionEdit
					.sendKeys(BaseData.getInventoryModuleValue("Description"));
		}

		public void SelectAtLocationUseFor() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapInventory.storageLocationEntry.uILocationUseForComboBox,
					BaseData.getInventoryModuleValue("LocationUseFor"));
		}

		public void clickLockerCheckbox() {
			uIMapInventory.storageLocationEntry.uILockerCheckbox.click();
		}

		public void Save() {
			uIMapInventory.storageLocationEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapInventory.storageLocationEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void CloseTheScreen() {
			objectIdentification.windowHandle.closeTheScreen();
		}

	}

	public class CheckOutInEntry {

		public void CloseScreen() {
			uIMapInventory.checkOutInEntry.driver.close();
		}

		public void EnterAtNameIDDetails() {
			uIMapInventory.checkOutInEntry.uINameTypeEdit
					.sendKeys(BaseData.getInventoryModuleValue("NameID").substring(0, 1));
			uIMapInventory.checkOutInEntry.uINameIDEdit
					.sendKeys(BaseData.getInventoryModuleValue("NameID").substring(2));
		}

		public void EnterAtLastName() {
			uIMapInventory.checkOutInEntry.uILastNameEdit.sendKeys(BaseData.getInventoryModuleValue("LastName"));
			uIMapInventory.checkOutInEntry.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtFirstName() {
			uIMapInventory.checkOutInEntry.uIFirstNameEdit.sendKeys(BaseData.getInventoryModuleValue("FirstName"));
			uIMapInventory.checkOutInEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtName() {
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void VerifyAtCellNumber() {
			Assert.assertEquals(BaseData.getInventoryModuleValue("Cell"),
					uIMapInventory.checkOutInEntry.uIPhoneCellEdit.getAttribute("value"));
		}

		public void VerifyAtHomeNumber() {
			Assert.assertEquals(BaseData.getInventoryModuleValue("Home"),
					uIMapInventory.checkOutInEntry.uIPhoneHomeEdit.getAttribute("value"));
		}

	}

	public class EquipmentService {
		public void verifyServiceDueByAsCurrentDate() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapInventory.equipmentService.uIServiceDueDateBy.getAttribute("value"));
		}

		public void tabAtServicedBy() {
			uIMapInventory.equipmentService.uIServicedOrTestedBy.sendKeys(Keys.TAB);
		}

		public void entratAtServicedBy() {
			uIMapInventory.equipmentService.uIServicedOrTestedBy
					.sendKeys(BaseData.getInventoryModuleValue("ServicedBy"));
			uIMapInventory.equipmentService.uIServicedOrTestedBy.sendKeys(Keys.TAB);
		}

		public void tabAtServiceDate() {
			uIMapInventory.equipmentService.uITestedDate.sendKeys(Keys.TAB);
		}

		public void enterAtVendor() {
			uIMapInventory.equipmentService.uIVendorCode.sendKeys(BaseData.getInventoryModuleValue("VendorCode"));
			uIMapInventory.equipmentService.uIVendorCode.sendKeys(Keys.TAB);
		}

		public void verifyAtVendorDescription() {
			uIMapInventory.equipmentService.uIVendorDescription
					.sendKeys(BaseData.getInventoryModuleValue("VendorDescription"));
			uIMapInventory.equipmentService.uIVendorDescription.sendKeys(Keys.TAB);
		}

		public void enterAtCost() {
			uIMapInventory.equipmentService.uIVendorCost.sendKeys(BaseData.getInventoryModuleValue("Cost"));
			uIMapInventory.equipmentService.uIVendorCost.sendKeys(Keys.TAB);
		}

		public void selectAtSevicedCheckBoxByItemType() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapInventory.equipmentService.uIUnAssignInventoryToStorageTable,
					BaseData.getInventoryModuleValue("ItemType"));
		}

		public void save() {
			uIMapInventory.equipmentService.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSave() {
			uIMapInventory.equipmentService.uISaveButton.click();

		}

		public void clickSaveNClose() {
			uIMapInventory.equipmentService.uISaveAndCloseButton.click();

		}

		public void saveNClose() {
			uIMapInventory.equipmentService.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void closeScreen() {
			uIMapInventory.equipmentService.driver.close();

		}

		public void enterAtNotes() {
			Playback.controlReadyThreadWait();
			uIMapInventory.equipmentService.uITextNotes.sendKeys(BaseData.getInventoryModuleValue("Notes"));
		}

		public int grtRowsCount() {
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapInventory.equipmentService.uIUnAssignInventoryToStorageTable);
			return count;
		}

		public void verifyRowNotAvailableAfterSave(int count) {
			int afterSave = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapInventory.equipmentService.uIUnAssignInventoryToStorageTable);
			verify.ExpectedValueIsTrue(count > afterSave);
		}

	}

	public class ItemEntrySearch {

		public void clickSearchButton() {
			uIMapInventory.itemEntrySearch.uISearchButton.click();
		}

		public void selectRowByAtInventoryNo() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapInventory.itemEntrySearch.uIItemEntrySearchResultTable,
					BaseData.getInventoryModuleValue("InventoryNo"));
			Playback.controlReadyThreadWait();
			uIMapInventory.itemEntrySearch.uIAssignButton.click();
		}

	}

}
