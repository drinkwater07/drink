package application;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.list.TreeList;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import dataAccess.BaseData;
import resources.PropertiesFile;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Popup {

	public UIMapPopup uIMapPopup = new UIMapPopup();
	public static ObjectIdentification objectIdentification = new ObjectIdentification();
	public static Popup popup = new Popup();
	public Confirm confirm;
	public Acknowledge acknowledge;
	public KPICodedLookup kPICodedLookup;
	public MultiFilesAttachWindow multiFilesAttachWindow;
	public static String TestResourceFolderPath = PropertiesFile.readPropertiesFile("TestResourceFolderPath");
	public TreeViewHelp treeViewHelp;

	public Popup() {
		// uIMapPopup = new UIMapPopup();

		if (confirm == null)
			confirm = new Confirm();

		if (acknowledge == null)
			acknowledge = new Acknowledge();

		if (kPICodedLookup == null)
			kPICodedLookup = new KPICodedLookup();

		if (multiFilesAttachWindow == null)
			multiFilesAttachWindow = new MultiFilesAttachWindow();

		if (treeViewHelp == null)
			treeViewHelp = new TreeViewHelp();
	}

	public void Reset() {

		uIMapPopup = null;
	}

	public void switchToMultiFilesAttachWindow() {

		objectIdentification.windowHandle.switchToWindowUsingURL("frmMultiFilesAttach");

	}

	public void switchToAcknowledge() {

		objectIdentification.windowHandle.switchToWindow("Acknowledge");

	}

	public void switchToConfirm() {

		objectIdentification.windowHandle.switchToWindow("Confirm");

	}

	public void switchToCodedSearch() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("Coded Search");
	}

	public void switchToTreeViewHelp() {
		objectIdentification.windowHandle.switchToWindow("TreeView Help");
	}

	public void switchToCodedSearchII() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmCodedSrch.aspx");
	}

	public class Confirm {

		/*
		 * public void yesWithExpectedMessage(String ackConfimMsg) {
		 * 
		 * String nickname = ackConfimMsg.substring(0, ackConfimMsg.indexOf(' '));
		 * String content = ackConfimMsg.substring(ackConfimMsg.indexOf(' ') + 1);
		 * System.out.println(nickname); System.out.println(content);
		 * Playback.pageLoadThreadWait(); if (Playback.browserType.contains("Chrome")) {
		 * Playback.driver.switchTo().alert(); Playback.pageLoadThreadWait();
		 * Assert.assertEquals(ackConfimMsg,
		 * Playback.driver.switchTo().alert().getText()); Playback.pageLoadThreadWait();
		 * Playback.driver.switchTo().alert().accept(); Playback.pageLoadThreadWait();
		 * 
		 * }
		 * 
		 * else { popup.switchToConfirm(); Assert.assertEquals(ackConfimMsg,
		 * uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText());
		 * uIMapPopup.confirmWindow.uIYesButton.click(); }
		 * Playback.pageLoadThreadWait();
		 * 
		 * }
		 */
		public void yesWithExpectedMessage(String ackConfimMsg) {
			String messagecode = ackConfimMsg.substring(0, ackConfimMsg.indexOf(' '));
			String content = ackConfimMsg.substring(ackConfimMsg.indexOf(' ') + 1);
			System.out.println(messagecode);
			System.out.println(content);
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.driver.switchTo().alert();
				Playback.pageLoadThreadWait();
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(messagecode));
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(content));
				Playback.pageLoadThreadWait();
				Playback.driver.switchTo().alert().accept();
				Playback.pageLoadThreadWait();

			} else {
				popup.switchToConfirm();
				Assert.assertEquals(ackConfimMsg, uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText());
				uIMapPopup.confirmWindow.uIYesButton.click();
			}
			Playback.pageLoadThreadWait();

		}

		public void yesWithContainsMessage(String ackConfimMsg) {
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.driver.switchTo().alert();
				Playback.pageLoadThreadWait();
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(ackConfimMsg));
				Playback.pageLoadThreadWait();
				Playback.driver.switchTo().alert().accept();
				Playback.pageLoadThreadWait();

			}

			else {
				popup.switchToConfirm();
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(ackConfimMsg));
				uIMapPopup.confirmWindow.uIYesButton.click();
			}
			Playback.pageLoadThreadWait();

		}

		public void verifyContainsMessageInPopup(String ackConfimMsg) {
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.driver.switchTo().alert();
				Playback.pageLoadThreadWait();
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(ackConfimMsg));
			}
		}

		public void acceptPopup() {
			Playback.pageLoadThreadWait();
			Playback.driver.switchTo().alert().accept();
		}

		public void dismissPopup() {
			Playback.pageLoadThreadWait();
			Playback.driver.switchTo().alert().dismiss();
		}

		public void yesWithExpectedMessageIfWidowExist(String ackConfimMsg) {
			if (objectIdentification.windowHandle.windowExist("Confirm")) {
				Playback.pageLoadThreadWait();
				if (Playback.browserType == "Chrome") {
					Playback.pageLoadThreadWait();
					Assert.assertEquals(ackConfimMsg, Playback.driver.switchTo().alert().getText());
					Playback.pageLoadThreadWait();
					Playback.driver.switchTo().alert().accept();
					Playback.pageLoadThreadWait();

				} else {
					popup.switchToConfirm();
					Assert.assertEquals(ackConfimMsg, uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText());
					uIMapPopup.confirmWindow.uIYesButton.click();
				}

			}

		}

		public void noWithExpectedMessage(String ackConfimMsg) { // changed by Abi to fix space issue
			Playback.pageLoadThreadWait();
			String messagecode = ackConfimMsg.substring(0, ackConfimMsg.indexOf(' '));
			String content = ackConfimMsg.substring(ackConfimMsg.indexOf(' ') + 1);
			System.out.println(messagecode);
			System.out.println(content);
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.pageLoadThreadWait();
				Playback.driver.switchTo().alert();
				// Assert.assertEquals(ackConfimMsg,
				// Playback.driver.switchTo().alert().getText());
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(messagecode));
				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(content));
				Playback.pageLoadThreadWait();
				Playback.driver.switchTo().alert().dismiss();

			} else {
				popup.switchToConfirm();
				Assert.assertEquals(ackConfimMsg, uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText());
				uIMapPopup.confirmWindow.uINoButton.click();
			}

//			Playback.pageLoadThreadWait();
//
//			if (Playback.browserType.contains("Chrome")) {
//				Playback.pageLoadThreadWait();
//
//				Assert.assertEquals(ackConfimMsg, Playback.driver.switchTo().alert().getText());
//
//				Playback.driver.switchTo().alert().dismiss();
//
//			} else {
//				popup.switchToConfirm();
//				Assert.assertEquals(ackConfimMsg, uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText());
//				uIMapPopup.confirmWindow.uINoButton.click();
//			}

		}

		public void noWithContainsMessage(String ackConfimMsg) {

			Playback.pageLoadThreadWait();

			if (Playback.browserType.contains("Chrome")) {
				Playback.pageLoadThreadWait();

				Assert.assertTrue(Playback.driver.switchTo().alert().getText().contains(ackConfimMsg));

				Playback.driver.switchTo().alert().dismiss();

			} else {
				popup.switchToConfirm();
				Assert.assertEquals(ackConfimMsg, uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText());
				uIMapPopup.confirmWindow.uINoButton.click();
			}

		}

		public void noWithExpectedMessageIfWindowExist(String ackConfimMsg) {
			if (objectIdentification.windowHandle.windowExist("Confirm")) {
				Playback.pageLoadThreadWait();

				if (Playback.browserType.contains("Chrome")) {
					Playback.pageLoadThreadWait();

					Assert.assertEquals(ackConfimMsg, Playback.driver.switchTo().alert().getText());

					Playback.driver.switchTo().alert().dismiss();

				} else {
					Assert.assertEquals(ackConfimMsg, uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText());
					uIMapPopup.confirmWindow.uINoButton.click();
				}

			}

		}

		public void yes() {

			Playback.pageLoadThreadWait();

			if (Playback.browserType.contains("Chrome")) {
				Playback.pageLoadThreadWait();

				Playback.driver.switchTo().alert().accept();

				Playback.pageLoadThreadWait();
			} else {
				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				uIMapPopup.confirmWindow.uIYesButton.click();
			}

			Playback.pageLoadThreadWait();

		}

		public void yesIfWindowExist() {
			if (objectIdentification.windowHandle.windowExist("Confirm")) {
				Playback.pageLoadThreadWait();

				if (Playback.browserType.contains("Chrome")) {
					Playback.pageLoadThreadWait();

					Playback.driver.switchTo().alert().accept();
					Playback.pageLoadThreadWait();
				} else
					uIMapPopup.confirmWindow.uIYesButton.click();

			}

		}

		public void no() {
			if (objectIdentification.windowHandle.windowExist("Confirm")) {
				Playback.pageLoadThreadWait();

				if (Playback.browserType.contains("Chrome")) {
					Playback.pageLoadThreadWait();

					Playback.driver.switchTo().alert().dismiss();
					Playback.pageLoadThreadWait();
				} else
					uIMapPopup.confirmWindow.uINoButton.click();

			}
		}

		public void noIfWindowExist() {
			if (objectIdentification.windowHandle.windowExist("Confirm")) {
				Playback.pageLoadThreadWait();

				if (Playback.browserType.contains("Chrome")) {
					Playback.pageLoadThreadWait();

					Playback.driver.switchTo().alert().dismiss();
				} else
					uIMapPopup.confirmWindow.uINoButton.click();

			}
		}

	}

	public class Acknowledge {

		/*
		 * public void okWithExpectedMessage(String ackMessage) {
		 * 
		 * String nickname = ackMessage.substring(0, ackMessage.indexOf(' ')); String
		 * content = ackMessage.substring(ackMessage.indexOf(' ') + 1);
		 * System.out.println(nickname); System.out.println(content);
		 * 
		 * Playback.pageLoadThreadWait();
		 * objectIdentification.windowHandle.switchToWindow("Acknowledge");
		 * Playback.pageLoadThreadWait(); if (Playback.browserType.contains("Chrome")) {
		 * Playback.pageLoadThreadWait(); ackMessage = ackMessage.replace("#", "No");
		 * 
		 * Assert.assertEquals(ackMessage,
		 * uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText());
		 * uIMapPopup.acknowledgeWindow.uIOkButton.click();
		 * Playback.pageLoadThreadWait(); } else { Playback.pageLoadThreadWait();
		 * Assert.assertEquals(ackMessage,
		 * uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText());
		 * uIMapPopup.acknowledgeWindow.uIOkButton.click();
		 * Playback.pageLoadThreadWait(); }
		 * 
		 * }
		 */

		public void okWithExpectedMessage(String ackMessage) {

			String messagecode = ackMessage.substring(0, ackMessage.indexOf(' '));
			String content = ackMessage.substring(ackMessage.indexOf(' ') + 1);
			System.out.println(messagecode);
			System.out.println(content);

			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindow("Acknowledge");
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.pageLoadThreadWait();
				ackMessage = ackMessage.replace("#", "No");

				Assert.assertTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(messagecode));
				Assert.assertTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(content));
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
				Assert.assertEquals(ackMessage, uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText());
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();
			}

		}

		public void okWithExpectedMessageForDualWindows(String ackMessage) {

			String messagecode = ackMessage.substring(0, ackMessage.indexOf(' '));
			String content = ackMessage.substring(ackMessage.indexOf(' ') + 1);
			System.out.println(messagecode);
			System.out.println(content);

			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindow("Acknowledge");
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.pageLoadThreadWait();
				ackMessage = ackMessage.replace("#", "No");

				Assert.assertTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(messagecode));
				Assert.assertTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(content));
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();

				if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
					objectIdentification.windowHandle.switchToWindow("Acknowledge");
					Playback.pageLoadThreadWait();
					ackMessage = ackMessage.replace("#", "No");

					Assert.assertFalse(
							uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(messagecode));
					// Assert.assertFalse(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(content));
					// uIMapPopup.acknowledgeWindow.uIOkButton.click();
					// Playback.pageLoadThreadWait();
				} else {
					objectIdentification.windowHandle.switchToMainWindow();
				}
			}

		}

		public void okWithExpectedMessageIfWindowExist(String ackMessage) {
			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {

				Playback.pageLoadThreadWait();
				if (Playback.browserType.contains("Chrome")) {
					Playback.pageLoadThreadWait();
					ackMessage = ackMessage.replace("#", "No");
					Assert.assertEquals(ackMessage, uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText());
					uIMapPopup.acknowledgeWindow.uIOkButton.click();
					Playback.pageLoadThreadWait();
				} else {
					Playback.pageLoadThreadWait();
					Assert.assertEquals(ackMessage, uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText());
					uIMapPopup.acknowledgeWindow.uIOkButton.click();
					Playback.pageLoadThreadWait();
				}
			}
		}

		public void okWithExpectedContainMessage(String ackMessage) {
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindow("Acknowledge");
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.pageLoadThreadWait();
				ackMessage = ackMessage.replace("#", "No");

				Assert.assertTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(ackMessage));
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
				Assert.assertTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().contains(ackMessage));
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();
			}
		}

		public void okWithExpectedIngnoreCase(String ackMessage) {
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindow("Acknowledge");
			Playback.pageLoadThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				Playback.pageLoadThreadWait();
				ackMessage = ackMessage.replace("#", "No");

				Assert.assertTrue(
						uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().equalsIgnoreCase(ackMessage));
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
				Assert.assertTrue(
						uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText().equalsIgnoreCase(ackMessage));
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();
			}
		}

		public void ok() {
			// Popup.SwitchToAcknowledge();
			// Popup.SwitchToAcknowledge();
			objectIdentification.windowHandle.switchToWindow("Acknowledge");
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			uIMapPopup.acknowledgeWindow.uIOkButton.click();
			Playback.pageLoadThreadWait();

		}

		public void okIfWindowExist() {
			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
				Playback.pageLoadThreadWait();
				uIMapPopup.acknowledgeWindow.uIOkButton.click();
				Playback.pageLoadThreadWait();
			}

		}

		public void okIfWindowExistAsWarning() {
			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
				Playback.pageLoadThreadWait();
				if (uIMapPopup.acknowledgeWindow.uILogo.getAttribute("src").contains("err_48_2"))
					uIMapPopup.acknowledgeWindow.uIOkButton.click();

			}
		}

		public void okIfWindowExistAsError() {
			if (objectIdentification.windowHandle.windowExist("Acknowledge")) {
				Playback.pageLoadThreadWait();
				if (uIMapPopup.acknowledgeWindow.uILogo.getAttribute("src").contains("err_48_4"))
					uIMapPopup.acknowledgeWindow.uIOkButton.click();

			}

		}

		public void remarksAcknowledgeOk() {
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindow("Remarks");
			Playback.driver.findElement(By.id("cmdOk")).click();

		}

		public void sysParameterAcknowledgeOk() {
			Playback.pageLoadThreadWait();
			popup.switchToAcknowledge();
			if (Playback.driver.getTitle().equals("Acknowledge")) {
				Playback.driver.findElement(By.id("cmdOk")).click();
			} else
				Playback.pageLoadThreadWait();
		}

		public void notesAcknowledgeOk() {
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindowUsingURL("Notes");
			Playback.driver.findElement(By.id("cmdOk")).click();

		}

		public void verifyNotesComments() {
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToWindowUsingURL("Notes");
			WebElement notesComment = Playback.driver.findElement(By.xpath("//div[@id = 'htmlNotesInfo']//b"));
			Assert.assertTrue(notesComment.getText().contains("AUTO"));
		}

		public void verifyInactiveCodeSelectedAwckMsg() {
			Playback.pageLoadThreadWait();
			popup.acknowledge.okWithExpectedMessage("(1119) Warning – Inactive code selected");
		}

		public void verifyUpdateWillHappenWhenInspectionRecordIsSavedAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge
						.okWithExpectedMessage("(17553) Update will happen when the Inspection record is saved");
			}

			else {
				popup.switchToAcknowledge();
				Playback.controlReadyThreadWait();
				popup.acknowledge
						.okWithExpectedMessage("(17553) Update will happen when the Inspection record is saved");
			}
		}

	}

	public class KPICodedLookup {

		public void randomKPIHelpSelect() {
			popup.switchToCodedSearch();
			Playback.popupThreadWait();
			Playback.popupThreadWait();
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable);
			Playback.popupThreadWait();
			Playback.popupThreadWait();
		}

		public void kPIHelpSelect(String srchValue) {
			popup.switchToCodedSearch();
			Playback.popupThreadWait();
			Playback.popupThreadWait();
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, srchValue);
			Playback.popupThreadWait();
			Playback.popupThreadWait();
		}

		public void enterAtDistrict() {
			String inactiveDistrict = BaseData.getGeoModuleValue("InactiveDistrict");
			uIMapPopup.kPIHelpWindow.uICodeValueEdit.sendKeys(inactiveDistrict);
		}

		public void clickIncludeInactiveCheckBox() {
			uIMapPopup.kPIHelpWindow.uIIncludeInactiveCheckBox.click();
		}

		public void clickSearchIcon() {
			uIMapPopup.kPIHelpWindow.uISearchIconButton.click();
		}

		public void clickClearIcon() {
			uIMapPopup.kPIHelpWindow.uIClearIconButton.click();
		}

		public void verifyAtDisrictInGridrow(int rowCount) {
			String inactiveDistrict = BaseData.getGeoModuleValue("InactiveDistrict");
			Assert.assertEquals(inactiveDistrict, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "Value", rowCount));
		}

		public void verifyInactiveDistrictRowColor(int rowCount) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, rowCount).getAttribute("class")
					.contains("Grey"));
		}

		public void closeScreen() {
			uIMapPopup.kPIHelpWindow.driver.close();
		}

		public void selectContextRowAndClickChangeButton() {
			List<WebElement> elements = ((SearchContext) uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable)
					.findElements(By.xpath(".//table/tbody[contains(@class,'Item')]/tr"));
			WebElement uIElement = elements.get(Randomized.getRandomNumber(elements.size()));
			objectIdentification.manualIdentify.scrollIntoView(uIElement);
			new Actions(Playback.driver).contextClick(uIElement).perform();
			((SearchContext) uIElement).findElement(By.xpath("//div[@id='UltraWebMenu1']//li[@title = 'Change']"))
					.click();
		}

		public void clickAtDescription() {
			String description = BaseData.getGeoModuleValue("Description");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, description);
			Playback.controlReadyThreadWait();
		}

		public void enterAtCode() {
			String code = BaseData.getGeoModuleValue("Code");
			uIMapPopup.kPIHelpWindow.uICodeValueEdit.sendKeys(code);
		}

		public void enterCode(String value) {

			uIMapPopup.kPIHelpWindow.uICodeValueEdit.sendKeys(value);
		}

		public void verifyNIBRSInCodedScreen(int rowIndex) {
			popup.switchToCodedSearch();
			Playback.controlReadyThreadWait();

			String actual = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "Nibrs", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("NIBRSCode").toUpperCase(), actual);

		}

		public void enterAtDescription() {

			uIMapPopup.kPIHelpWindow.uIDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("Description"));
			Playback.controlReadyThreadWait();

		}

		public void verifyJurisAsPX() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "Juris", 0);
			String text = gridCell.getText();
			verify.ExpectedPropertyValueIsEqual(text, "PX");
		}

		public void verifyJurisAsBC() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "Juris", 1);
			String text = gridCell.getText();
			verify.ExpectedPropertyValueIsEqual(text, "BC");
		}

		public void selectJurisAsBC() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "BC");
			Playback.controlReadyThreadWait();
		}

		public void verifyPFInCodedSearch(int rowCount) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getSettingsModuleValue("PFCode"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "PFCode", rowCount));

		}

		public void enterAtCharge() {
			String charge = BaseData.getGeoModuleValue("Charge");
			uIMapPopup.kPIHelpWindow.uICodeValueEdit.sendKeys(charge);
		}

		public void clickAtChargeInGrid() {
			String charge = BaseData.getGeoModuleValue("Charge");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, charge);
			Playback.controlReadyThreadWait();
		}

		public void selectCodeValueInGrid() {
			String code = BaseData.getGeoModuleValue("Code");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, code);
			Playback.controlReadyThreadWait();

		}

		public void enterAtDescription1() {
			uIMapPopup.kPIHelpWindow.uIDescriptionEdit.sendKeys(BaseData.getSettingsModuleValue("Description1"));
			Playback.controlReadyThreadWait();

		}

		public void clickAtCharge1InGrid() {
			String charge = BaseData.getGeoModuleValue("Charge1");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, charge);
			Playback.controlReadyThreadWait();
		}

		public void selectAtZipCodeInGrid() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getGeoModuleValue("ZipCode"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtDescription() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, "Description");
			for (String value : gridTableColumnValues)
				if (value.contains(BaseData.getHomeModuleValue("Description"))) {
					verify.ExpectedValueIsTrue(value.contains(BaseData.getHomeModuleValue("Description")));
				}
		}

		public void selectAtPFCode() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getHomeModuleValue("PFCode"));
		}

		public void selectAtCharge() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getHomeModuleValue("Charge"));
		}

		public void selectAtDispositionInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getHomeModuleValue("Disposition"));
			Playback.controlReadyThreadWait();
		}

		public void selectAtDispositionInGrid1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getHomeModuleValue("Disposition1"));
			Playback.controlReadyThreadWait();
		}

		public void selectAtCodeValueInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getHomeModuleValue("CodeValue"));
			Playback.pageLoadThreadWait();

		}

		public void selectAtDescription1() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getGeoModuleValue("Description1"));
			Playback.pageLoadThreadWait();

		}

		public void clickAtEventNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, BaseData.getGeoModuleValue("EventNo"));
			Playback.controlReadyThreadWait();
		}

		public void verifyEvidenceLockerAcknowledgeMessage() {
			popup.confirm.yesWithContainsMessage("Evidence Locker is in use with case");
		}

		public void enterAtCode1() {
			String code = BaseData.getGeoModuleValue("Code1");
			uIMapPopup.kPIHelpWindow.uICodeValueEdit.sendKeys(code);

		}

		public void clickAtDescription1() {
			String description = BaseData.getGeoModuleValue("Description1");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, description);
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
					.getGridTableRowsCount(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable);
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
					.getGridTableRowsCount(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable);
			for (int i = 0; i < rowsCount; i++) {

				allRowText = Arrays.asList(allRow.get(i).getText());
				for (String rowText : allRowText) {
					if (rowText.contains(BaseData.getTestContextData("TransportTo"))) {
						verify.ExpectedValueIsTrue(rowText.contains(BaseData.getTestContextData("TransportTo")));
					}
				}
			}
		}

		public void clickAddNewButton() {
			uIMapPopup.kPIHelpWindow.uIAddNewButton.click();
		}

		public void switchToZipCodeEntry() {
			objectIdentification.windowHandle.switchToWindowUsingURL("frmZip.aspx");
		}

		public List<String> getColumnValues(String columnName) {
			List<String> values = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapPopup.kPIHelpWindow.uIKPIHelpWindowTable, columnName);

			return values;
		}

		public void verifyColumnValuesAreSorted(List<String> values) {
			List<String> sortedValue = new ArrayList<>(values);
			Collections.sort(sortedValue);
			verify.ExpectedValueIsTrue(sortedValue.equals(values));

		}
	}

	public class MultiFilesAttachWindow {

		public void SelectTextFile() {
			// Playback.pageLoadThreadWait();
			// objectIdentification.actionBuilder.Click(uIMapPopup.multiFilesAttachWindow.uIBrowseButton);
			Playback.pageLoadThreadWait();
			Actions action = new Actions(Playback.driver);
			action.click(uIMapPopup.multiFilesAttachWindow.uIBrowseButton).build().perform();
			Playback.pageLoadThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "TextDoc1.txt");
			// WindowsControl.FileBrowserWindow.ClickOpen();
			StringSelection stringSelection = new StringSelection(TestResourceFolderPath + "\\TextDoc1.txt");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			} catch (Exception exp) {
				exp.printStackTrace();

			}

		}

		public void SelectImgFile() {
			// Playback.pageLoadThreadWait();
			// objectIdentification.actionBuilder.Click(uIMapPopup.multiFilesAttachWindow.uIBrowseButton);
			Playback.pageLoadThreadWait();
			Actions action = new Actions(Playback.driver);
			action.click(uIMapPopup.multiFilesAttachWindow.uIBrowseButton).build().perform();
			Playback.pageLoadThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "TextDoc1.txt");
			// WindowsControl.FileBrowserWindow.ClickOpen();
			StringSelection stringSelection = new StringSelection(TestResourceFolderPath + "\\img1.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			} catch (Exception exp) {
				exp.printStackTrace();

			}

		}

		public void ClickUpload() {
			uIMapPopup.multiFilesAttachWindow.uIUploadButton.click();
			Playback.pageLoadThreadWait();
		}

		public void Close() {
			uIMapPopup.multiFilesAttachWindow.uICloseButton.click();
			Playback.threadWait(3000);
		}

		public void Refresh() {
			uIMapPopup.multiFilesAttachWindow.uIRefreshButton.click();
		}

	}

	public class TreeViewHelp {
		public void clickSelect() {
			uIMapPopup.treeViewHelp.uISelectButton.click();
		}

		public void selectOptionByAtActivityType() {
			uIMapPopup.treeViewHelp.uITreeViewHelpTreeTable
					.findElement(By.xpath(
							".//li//span[contains(text(),'" + BaseData.getSettingsModuleValue("ActivityType") + "')]"))
					.click();

		}

		public void enterAtSearch() {
			uIMapPopup.treeViewHelp.uISearchForEdit.sendKeys(BaseData.getSettingsModuleValue("ActivityType"));
		}

		public void treeViewLoopValueSelectBasedOnContent(String mainContent, String subContent) {
			WebElement table = uIMapPopup.treeViewHelp.uITreeViewHelpTreeTable;
			WebElement ele = table.findElement(By.xpath("//ul//li//div//span[text()='" + mainContent + "']"));
			WebElement tree = ele.findElement(By.xpath("//ancestor::li/div/span[@class='rtPlus']"));
			tree.click();
			Playback.threadWait(500);
			WebElement subEle = table.findElement(By.xpath("//ul//li//div//span[text()='" + subContent + "']"));
			Playback.actionDriver.doubleClick(subEle).build().perform();
		}

		public void treeViewLoopValueSelectBasedOnContentUsingSelect(String mainContent, String subContent) {
			WebElement table = uIMapPopup.treeViewHelp.uITreeViewHelpTreeTable;
			WebElement ele = table.findElement(By.xpath("//ul//li//div//span[text()='" + mainContent + "']"));
			WebElement tree = ele.findElement(By.xpath("//ancestor::li/div/span[@class='rtPlus']"));
			tree.click();
			Playback.threadWait(500);
	
			WebElement subEle = table.findElement(By.xpath("//ul//li//div//span[text()='" + subContent + "']"));
			subEle.click();
			Playback.driver.findElement(By.id("cmdSearch")).click();
		}

		public void selectCodeBookTableContents(String CodeValue, String mainContent, String subContent) {
			WebElement table = uIMapPopup.treeViewHelp.uITreeViewHelpTreeTable;
			WebElement codeText = table.findElement(By.xpath("//ul//li//div//span[text()='" + subContent + "']"));
			if (codeText.isDisplayed()) {
				codeText.click();
			} else {

				List<WebElement> trees = codeText.findElements(By.xpath("//ancestor::li/div/span[@class='rtPlus']"));
				boolean res = true;
				while (res) {
					codeText = table.findElement(By.xpath("//ul//li//div//span[text()='" + subContent + "']"));
				}

			}
		}


	}

}
