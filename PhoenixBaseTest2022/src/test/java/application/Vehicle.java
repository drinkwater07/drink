package application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dataAccess.BaseData;
import resources.PropertiesFile;
import uIMaps.UIMapVehicle;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Vehicle {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapVehicle uIMapVehicle = new UIMapVehicle();
	public Popup popup = new Popup();
	Randomized randomized = new Randomized();

	public Vehicle() {
		if (vehicleBoatSearchHelpWindow == null)
			vehicleBoatSearchHelpWindow = new VehicleBoatSearchHelpWindow();

		if (vehicleBoatSearch == null)
			vehicleBoatSearch = new VehicleBoatSearch();

		if (fleetSearch == null)
			fleetSearch = new FleetSearch();

		if (fleetEntry == null)
			fleetEntry = new FleetEntry();

		if (vehicleBoatEntry == null)
			vehicleBoatEntry = new VehicleBoatEntry();

		if (equipmentService == null)
			equipmentService = new EquipmentService();

		if (fuelLogEntry == null)
			fuelLogEntry = new FuelLogEntry();

		if (mileageLogEntry == null)
			mileageLogEntry = new MileageLogEntry();

		if (vehicleMakeModel == null)
			vehicleMakeModel = new VehicleMakeModel();

		if (towRotation == null)
			towRotation = new TowRotation();

		if (towVendor == null)
			towVendor = new TowVendor();

		if (vehicleFlagDetailsScreen == null)
			vehicleFlagDetailsScreen = new VehicleFlagDetailsScreen();

	}

	public void reset() {
		uIMapVehicle = null;
	}

	public void switchToVehicleBoatSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Vehicle/Boat Search - 3231");
	}

	public void switchToVehicleBoatSearch() {
		// objectIdentification.windowHandle.switchToMainWindowScreenTab("Vehicle/Boat
		// Search");
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Property/frmPropVehSrch.aspx");
	}

	public void switchToFleetSearch() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Vehicle/frmVehicleSrch");
	}

	public void switchToFleetEntry() {

		objectIdentification.windowHandle.switchToWindow("Fleet Entry");
	}

	public void switchToVehicleBoatEntry() {

		objectIdentification.windowHandle.switchToWindow("Vehicle/Boat Entry");

	}

	public void switchToEquipmentService() {

		objectIdentification.windowHandle.switchToWindow("Equipment Service");

	}

	public void switchToFuelLogEntry() {

		objectIdentification.windowHandle.switchToWindow("Fuel Log Entry");

	}

	public void switchToMileageLogEntry() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmFuelLogSrch");
	}

	public void switchToVehicleMakeModel() {
		objectIdentification.windowHandle.switchToWindow("Vehicle Make Model");
	}

	public void switchToTowRotation() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Tow/frmTowRotation");
	}

	public void switchToTowVendor() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Tow/frmVendorSrch");
	}

	public void switchToVehicleFlagDetailsScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmVehicleFlagDtl.aspx");
	}

	public void switchToCRMFleet() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Fleet");
	}

	public VehicleBoatSearch vehicleBoatSearch;
	public FleetSearch fleetSearch;
	public VehicleBoatSearchHelpWindow vehicleBoatSearchHelpWindow;
	public FleetEntry fleetEntry;
	public VehicleBoatEntry vehicleBoatEntry;
	public EquipmentService equipmentService;
	public FuelLogEntry fuelLogEntry;
	public MileageLogEntry mileageLogEntry;
	public VehicleMakeModel vehicleMakeModel;
	public TowRotation towRotation;
	public TowVendor towVendor;
	public VehicleFlagDetailsScreen vehicleFlagDetailsScreen;

//Vehicle Boat Search Help Window Action Classes
	public class VehicleBoatSearchHelpWindow {

		public void selectBoat() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.randomIdentify
						.selectRandomGridRowCheckbox(uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable);
				uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectBoatButton.click();
				Playback.threadWait(2000);
				Playback.pageLoadThreadWait();
			} else {
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.randomIdentify
						.selectRandomGridRow(uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable);
				Playback.threadWait(2000);
				Playback.pageLoadThreadWait();
			}
		}
		
		public void RightClickInStatePlate(String BoatNo) {
			WebElement ClickBoatNo = Playback.driver.findElement(By.xpath("//div[@id='grdVehBoatSrch']//tbody//td[text()='"+BoatNo+"']"));
			//ClickBoatNo.click();
			
			Actions actionDriver = new Actions(Playback.driver); 
			actionDriver.contextClick(ClickBoatNo).perform();
		 WebElement Option = Playback.driver.findElement(By.xpath("//div[@id='UltraWebMenu1']"));
		 Option.click();
			
		}

		public void selectVehicle() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				Playback.pageLoadThreadWait();
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.randomIdentify
						.selectRandomGridRowCheckbox(uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable);
				uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
				Playback.threadWait();
				Playback.pageLoadThreadWait();
			} else {
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.randomIdentify
						.selectRandomGridRow(uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable);
				Playback.threadWait(2000);
				Playback.pageLoadThreadWait();
			}
		}

		public void selectVehicleAtPlateCheck() {
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("PlateCheckVehicle"));
				uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("PlateCheckVehicle"));
			}
		}

		public void selectVehicleAtFI() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("FIVehicle"));
				uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("FIVehicle"));
			}

		}

		public void selectVehicleAtVinNo() {
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("VINNo"));
				uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("VINNo"));
			}
		}

		public void selectAtVehicleUsingVehicleNo() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("VehicleNo"));
				Playback.controlReadyThreadWait();
				uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
				Playback.threadWait();
				Playback.pageLoadThreadWait();
			} else {
				Playback.pageLoadThreadWait();
				switchToVehicleBoatSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
						BaseData.getVehicleModuleValue("VehicleNo"));
				Playback.controlReadyThreadWait();
			}
		}

		public void selectCheckBoxByPlate() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable, BaseData.getVehicleModuleValue("Plate"));

		}

		public void ClickRefreshButton() {
			Playback.controlReadyThreadWait();
			uIMapVehicle.vehicleBoatSearchHelpWindow.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickBackButton() {
			uIMapVehicle.vehicleBoatSearchHelpWindow.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickResetButton() {
			uIMapVehicle.vehicleBoatSearchHelpWindow.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void selectRowByAtMake() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearchHelpWindow.uIVehicleBoatSearchGrIDTable,
					BaseData.getVehicleModuleValue("Make"));

		}
	}

	// Vehicle Boat Entry Action Scripts

	public class VehicleBoatEntry {
		// Fields
		public VehicleBoatEntryMainTab vehicleBoatEntryMainTab;
		public VehicleBoatEntryFlagTab vehicleBoatEntryFlagTab;
		public VehicleBoatEntryAttachmentsTab vehicleBoatEntryAttachmentsTab;

		public VehicleBoatEntry() {
			// Properties

			if ((this.vehicleBoatEntryMainTab == null)) {
				this.vehicleBoatEntryMainTab = new VehicleBoatEntryMainTab();
			}

			if ((this.vehicleBoatEntryFlagTab == null)) {
				this.vehicleBoatEntryFlagTab = new VehicleBoatEntryFlagTab();
			}
			if ((this.vehicleBoatEntryAttachmentsTab == null)) {
				this.vehicleBoatEntryAttachmentsTab = new VehicleBoatEntryAttachmentsTab();
			}

		}

		public void switchToAttachmentsTab() {

			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");

		}

		public void enterAtYear() {
			uIMapVehicle.vehicleBoatEntry.uIYearEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIYearEdit.click();
			uIMapVehicle.vehicleBoatEntry.uIYearEdit.sendKeys(BaseData.getVehicleModuleValue("Year"));
		}

		public void enterYearAsCurrentYear() {
			uIMapVehicle.vehicleBoatEntry.uIYearEdit.sendKeys(Randomized.getCurrentYear());
		}

		public void enterAtVinNo() {
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.click();
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.sendKeys(BaseData.getVehicleModuleValue("VinNo"));
		}

		public void enterAtVinNo1() {
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.click();
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.sendKeys(BaseData.getVehicleModuleValue("VinNo1"));
		}

		public void enterAtMake() {
			uIMapVehicle.vehicleBoatEntry.uIMakeEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIMakeEdit.click();
			uIMapVehicle.vehicleBoatEntry.uIMakeEdit.sendKeys(BaseData.getVehicleModuleValue("Make"));
		}

		public void enterAtModel() {
			uIMapVehicle.vehicleBoatEntry.uIModelEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIModelEdit.click();
			uIMapVehicle.vehicleBoatEntry.uIModelEdit.sendKeys(BaseData.getVehicleModuleValue("Model"));
		}

		public void selectMake() {
			uIMapVehicle.vehicleBoatEntry.uIMakeLookupButton.click();
			Playback.pageLoadThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectModel() {
			uIMapVehicle.vehicleBoatEntry.uIModelLookupButton.click();
			Playback.pageLoadThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectStyle() {
			uIMapVehicle.vehicleBoatEntry.uIStyleLookupButton.click();
			Playback.pageLoadThreadWait();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void selectInsuranceCompany() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.vehicleBoatEntry.uIInsuranceCompanyComboBox);
		}

		public void enterInsurancePoliceNumber() {
			uIMapVehicle.vehicleBoatEntry.uIInsurancePolicyNumberEdit
					.sendKeys(String.valueOf(Randomized.getRandomNumber(6)));
		}

		public void enterAtStyle() {
			uIMapVehicle.vehicleBoatEntry.uIStyleEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIStyleEdit.click();
			uIMapVehicle.vehicleBoatEntry.uIStyleEdit.sendKeys(BaseData.getVehicleModuleValue("Style"));
		}

		public void selectVehicleAtPlateCheck() {
			Playback.pageLoadThreadWait();
			switchToVehicleBoatSearchHelpWindow();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
					BaseData.getVehicleModuleValue("PlateCheckVehicle"));
			uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
			Playback.threadWait();
			Playback.waitForPageLoad();
		}

		public void clickSelectButton() {
			uIMapVehicle.vehicleBoatEntry.uISelectButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void clickSaveButton() {
			uIMapVehicle.vehicleBoatEntry.uISaveButton.click();
		}

		public void selectVehicleAtFI() {
			Playback.pageLoadThreadWait();
			switchToVehicleBoatSearchHelpWindow();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable,
					BaseData.getVehicleModuleValue("FIVehicle"));
			uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
			Playback.threadWait();
			Playback.waitForPageLoad();
		}

		// Its used in Citation Vehicle Tab
		public void selectVehicleAtVinNo() {
			Playback.pageLoadThreadWait();
			switchToVehicleBoatSearchHelpWindow();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapVehicle.vehicleBoatSearchHelpWindow.uIResultTable, BaseData.getVehicleModuleValue("VIN"));
			uIMapVehicle.vehicleBoatSearchHelpWindow.uISelectVehicleButton.click();
			Playback.threadWait();
		}

		public void saveScreen() {
			uIMapVehicle.vehicleBoatEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void clickMainTab() {
			uIMapVehicle.vehicleBoatEntry.uIMainTab.click();
		}

		public void clickFlagsTab() {
			uIMapVehicle.vehicleBoatEntry.uIFlagsTab.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAttachmentsTab() {
			uIMapVehicle.vehicleBoatEntry.uIAttachmentsTab.click();
			Playback.controlReadyThreadWait();
		}

		public void closeScreen() {
			uIMapVehicle.vehicleBoatEntry.driver.close();
		}

		public void enterAtBoatHullNo() {
			uIMapVehicle.vehicleBoatEntry.uIBoatHullEdit.sendKeys(BaseData.getVehicleModuleValue("BoatHullNo"));
		}

		public void verifyRegistrationNumberAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6040) Registration # or Hull # is required");
		}
		
		public void verifyUpdateSuccessfulMessage() {
			verify.ExpectedPropertyValueIsEqual(uIMapVehicle.vehicleBoatEntry.uIBottomLeftSideStatusBar.getText(),"1003 - Update Successful" );
		}

		public void verifyVinNoDuplicationAlertMessage() {
			popup.acknowledge.okWithExpectedMessage("(9126) VIN# already exists");
		}

		public void verify9154EnterPlateNoOrVINNoAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(9154) Enter Plate # or VIN #");
		}

		public void enterAtPropulsion() {
			uIMapVehicle.vehicleBoatEntry.uIPropulsionEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIPropulsionEdit.sendKeys(BaseData.getVehicleModuleValue("Propulsion"));
		}

		public void enterAtMaterial() {
			uIMapVehicle.vehicleBoatEntry.uIMaterialEdit.clear();
			uIMapVehicle.vehicleBoatEntry.uIMaterialEdit.sendKeys(BaseData.getVehicleModuleValue("Material"));
		}

		public void selectVOD() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapVehicle.vehicleBoatEntry.uIVODComboBox);
		}

		public void enterLength() {
			uIMapVehicle.vehicleBoatEntry.uILengthEdit.sendKeys(String.valueOf(Randomized.getRandomNumber(3)));
		}

		public void enterDescription() {
			uIMapVehicle.vehicleBoatEntry.uIDescriptionEdit.sendKeys(Randomized.randomString(100));
		}

		public void saveAndCloseScreen() {
			uIMapVehicle.vehicleBoatEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void selectAtInsuranceCompanyByValue() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.uIInsuranceCompanyComboBox,
					BaseData.getVehicleModuleValue("InsuranceCompany"));
		}

		public String readVINNo() {
			String vinNo = uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.getAttribute("value");
			return vinNo;
		}

		public String readVehicleNo() {
			String vehicleNo = uIMapVehicle.vehicleBoatEntry.uIBoatEdit.getAttribute("value");
			return vehicleNo;
		}

		public void enterVINNoAsMoreThan17Characters() {
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.sendKeys(Randomized.randomAlphanumeric(20));
			uIMapVehicle.vehicleBoatEntry.uIVinNumberEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyVinNoExceedingLimitOf17Characters() {
			popup.switchToAcknowledge();
			popup.acknowledge.okWithExpectedMessage(
					"(6040) The VIN number entered is not a valid VIN.VIN numbers are currently limited to a maximum of 17 characters.");
		}

		public void verifyAtPalte() {
			verify.ExpectedValueIsTrue(uIMapVehicle.vehicleBoatEntry.uIPlateNumberEdit.getAttribute("value").contains(BaseData.getVehicleModuleValue("PlateNumber")));
		
			
		}

		public String readMakeDescription()
		{
			String attribute = uIMapVehicle.vehicleBoatEntry.uIMakeDescription.getAttribute("value");
			return attribute;
		}

		public String readModelDescription() 
		{
			String attribute = uIMapVehicle.vehicleBoatEntry.uIModelDescription.getAttribute("value");
			return attribute;
		}

		public String readInsuranceCompany() 
		{
			String dropDownSelectedItem = objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapVehicle.vehicleBoatEntry.uIInsuranceCompanyComboBox);
			return dropDownSelectedItem;
		}

		public String readMake()
		{
			String attribute = uIMapVehicle.vehicleBoatEntry.uIMakeEdit.getAttribute("value");
			return attribute;
		}

	}

	public class VehicleBoatEntryMainTab {

		public void doubleClickAtAssocNoUsingCallNo() {
			Actions doubleClick = new Actions(Playback.driver);
			doubleClick.doubleClick(objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
					BaseData.getVehicleModuleValue("CallNo")));
			doubleClick = null;
			Playback.gridLoadThreadWait();
		}

		public void verifyAtPlateAndStateInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("PlateST"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
									BaseData.getVehicleModuleValue("PlateST"))
							.getText());

		}

		public void verifyAssociationAsIncident(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
							"Association", rowIndex)
					.contains("Incident"));
		}

		public void verifyAssociationAsPermit(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
							"Association", rowIndex)
					.contains("Permit"));
		}

		public void verifyAssocNoinGrid(String permitNo, int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
							"Assoc#", rowIndex)
					.contains(permitNo));
		}

		public void verifyAssociationAsModified(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
							"Association", rowIndex)
					.contains("Modified"), "Verify Modified shows in Grid");
		}

		public void verifyAtAssocCallNo(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
							"Assoc#", rowIndex)
					.contains(BaseData.getVehicleModuleValue("CallNo")));
		}

		public void verifyAtRegistrationAndState() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("PlateST"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
									BaseData.getVehicleModuleValue("PlateST"))
							.getText());
		}

		public void enterAtRegistrationNo() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIRegistrationNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("RegistrationNo"));
		}

		public void selectStateAsWI() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIStateComboBox, "WI - Wisconsin");
		}

		public void selectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIStateComboBox,
					BaseData.getVehicleModuleValue("State"));
		}

		public void enterPlateExpireMonthAndYear() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateExpMonthEdit.sendKeys("10");
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateExpYearEdit.sendKeys("2022");
		}

		public void selectStatusAsActive() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIStatusComboBox, "Active");
		}

		public void selectColors() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIColor1ComboBox);
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIColor2ComboBox);
		}

		public void selectAtColor1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIColor1ComboBox,
					BaseData.getVehicleModuleValue("Color1"));
		}

		public void enterAtName() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uILastNameEdit
					.sendKeys(BaseData.getVehicleModuleValue("LastName"));
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIFirstNameEdit
					.sendKeys(BaseData.getVehicleModuleValue("FirstName"));
		}

		public void enterNameID() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uINameTypeEdit.sendKeys("A");
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uINameTypeIDEdit.sendKeys("40");
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uINameTypeIDEdit.sendKeys(Keys.TAB);
		}

		public void enterName() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uILastNameEdit.sendKeys("a");
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIFirstNameEdit.sendKeys(Keys.TAB);

		}

		public void selectAtName() {
			// Names.NameSearchHelpWindow.SelectNameByLastNameAndFirstName();
		}

		public void clickAddButton() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void selectPlateType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateTypeComboBox);
		}

		public void enterAtPlateNumber() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("PlateNumber"));
		}

		public void selectAtNameActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uINameActivityComboBox,
					BaseData.getVehicleModuleValue("NameActivity"));

		}

		public void selectNameActivity() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uINameActivityComboBox);

		}

		public void clickNameInfoIcon() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uINameInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void clickAtNameinGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
					BaseData.getVehicleModuleValue("Name"));
			Playback.controlReadyThreadWait();
		}

		public void verifyPlateNoIsNull() {
			verify.ExpectedPropertyValueIsEqual("",
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateNumberEdit.getAttribute("value"));
		}

		public void verifyAssociationAsTransfer(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIMainTabResultTable,
							"Association", rowIndex)
					.contains("Transfer"), "Verify Transfer shows in Grid");
		}

		public void selectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIStatusComboBox,
					BaseData.getVehicleModuleValue("Status"));
		}

		public void verifyPlateAndStateIsDisplayed() {
			verify.ExpectedValueIsTrue(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateNumberEdit.isDisplayed());
		}

		public void verifyAtPlateAndState1() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateNumberEdit.click();
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("PlateNo"),
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateNumberEdit.getAttribute("value"));

		}

		public void verifyAtName() {
			String lastName = uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uILastNameEdit
					.getAttribute("value");
			String firstName = uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIFirstNameEdit
					.getAttribute("value");
			verify.ExpectedValueIsTrue(lastName.contains(BaseData.getVehicleModuleValue("LastName")));
			verify.ExpectedValueIsTrue(firstName.contains(BaseData.getVehicleModuleValue("FirstName")));
		}

		public void selectAtColor2() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIColor2ComboBox,
					BaseData.getVehicleModuleValue("Color2"));
		}

		public void verifyAtNameActivity() {

			String nameAct = objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uINameActivityComboBox);
			verify.ExpectedPropertyValueIsEqual(nameAct, BaseData.getVehicleModuleValue("NameActivity"));
		}

		public void selectAtPlateType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateTypeComboBox,
					BaseData.getVehicleModuleValue("PlateType"));

		}

		public void verifyAtPlateTypeDropdown() {
			String dropDwonSelectedItem = objectIdentification.manualIdentify
					.getDropDwonSelectedItem(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateTypeComboBox);
			verify.ExpectedValueIsTrue(dropDwonSelectedItem.contains(BaseData.getVehicleModuleValue("PlateType")));
		}

		public void selectAtPlateType1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.uIPlateTypeComboBox,
					BaseData.getVehicleModuleValue("PlateType1"));

		}
	}

	public class VehicleBoatEntryFlagTab {

		public void enterDateEntered() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnterDateEdit.click();
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnterDateEdit.sendKeys(Keys.TAB);
		}

		public void enterEnteredBy() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnteredByEdit.sendKeys("Auto");
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnteredByEdit.sendKeys(Keys.TAB);
		}

		public void enterPreviousDateEntered() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnterDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(1));
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnterDateEdit.sendKeys(Keys.TAB);
		}

		public void enterFutureDateEntered() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnterDateEdit
					.sendKeys(Randomized.getFutureDateByMonth(1));
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIEnterDateEdit.sendKeys(Keys.TAB);
		}

		public void selectAtFlag() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIFlagComboBox,
					BaseData.getVehicleModuleValue("Flags"));
		}

		public void selectAtFlag1() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIFlagComboBox,
					BaseData.getVehicleModuleValue("Flags1"));
		}

		public void selectFlag() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIFlagComboBox);
		}

		public void enterComments() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uICommentsEdit.sendKeys("Automation Team Work");
		}

		public void clickAddButton() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIAddButton.click();
		}

		public void clickClearButton() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIClerButton.click();
		}

		public void verifyDateAsCurrentDateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIFlagTabResultTable, "Date",
							rowIndex));
		}

		public void clickCommentIconInGrid(int rowIndex) {
			WebElement comment = objectIdentification.manualIdentify.getGridCell(
					uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIFlagTabResultTable, "Comments", rowIndex);
			comment.click();
		}

		public void verifyAtFlagInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Flags"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIFlagTabResultTable, "Flags",
							rowIndex));
		}

		public void verifyAtFlag1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Flags1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIFlagTabResultTable, "Flags",
							rowIndex));
		}

		public void verifyFutureDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1036) Future Date not allowed");
		}

		public void verifyDuplicationAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void enterPreviousDateAsExpiryDate() {
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIExpiredDateEdit
					.sendKeys(Randomized.getPreviousDate(1, "MM/dd/yyyy"));
			uIMapVehicle.vehicleBoatEntry.vehicleBoatEntryFlagTab.uIExpiredDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyEffectiveDateTimeMandatory() {
			popup.acknowledge.okWithExpectedMessage("(6040) Effective Date/Time is Mandatory");
		}

	}

	public class VehicleBoatEntryAttachmentsTab {
		public void clickRefershButton() {
			Playback.driver.findElement(By.id("cmdRefresh")).click();
		}

	}

	public class VehicleBoatSearch {

		public VehicleTab vehicleTab;
		public BoatTab boatTab;

		public VehicleBoatSearch() {
			if ((this.vehicleTab == null)) {
				this.vehicleTab = new VehicleTab();
			}

			if ((this.boatTab == null)) {
				this.boatTab = new BoatTab();
			}

		}

		public void clickSearch() {
			uIMapVehicle.vehicleBoatSearch.uISearchButton.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void clickRefresh() {
			uIMapVehicle.vehicleBoatSearch.uIRefreshButton.click();
		}

		public void clickBack() {
			uIMapVehicle.vehicleBoatSearch.uIBackButton.click();
		}

		public void clickAddVehicle() {
			uIMapVehicle.vehicleBoatSearch.uIAddVehicleButton.click();
		}

		public void clickAddBoat() {
			uIMapVehicle.vehicleBoatSearch.uIAddBoatButton.click();
		}

		public void clickVehicleTab() {
			uIMapVehicle.vehicleBoatSearch.uIVehicleTab.click();
		}

		public void clickBoatTab() {
			uIMapVehicle.vehicleBoatSearch.uIBoatTab.click();
		}

		public void verifyAtVehicleNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("VehicleNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Vehicle#", rowIndex));
		}

		public void clickRowAtVehicleNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VehicleNo"));
		}

		public void enterAtPlate() {
			uIMapVehicle.vehicleBoatSearch.uIPlateEdit.sendKeys(BaseData.getVehicleModuleValue("Plate"));
		}

		public void getPlateID() {

			Playback.testContext.setAttribute("plateID",
					uIMapVehicle.vehicleBoatSearch.uIPlateEdit.getAttribute("value"));
		}

		public void enterPlate(String platID) {
			uIMapVehicle.vehicleBoatSearch.uIPlateEdit.clear();
			Playback.threadWait();
			uIMapVehicle.vehicleBoatSearch.uIPlateEdit.sendKeys(platID);
		}

		public void selectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.vehicleBoatSearch.uIStateComboBox,
					BaseData.getVehicleModuleValue("State"));
		}

		public void clickRowAtPlateNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("PlateNo"));
		}

		public void verifyFlagIconInSearchscreen(int rowIndex) {
			WebElement SystemCheckBox = objectIdentification.manualIdentify
					.getGridCell(uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Flags", rowIndex)
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(SystemCheckBox.getAttribute("title").contains("Flags"));
		}

		public void clickFlagIconInSearchScreen(int rowIndex) {
			WebElement Flag = objectIdentification.manualIdentify
					.getGridCell(uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Flags", rowIndex);
			Flag.findElement(By.tagName("img")).click();
		}

		public void enterAtBoatHullNo() {
			uIMapVehicle.vehicleBoatSearch.boatTab.uIBoatHullNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("BoatHullNo"));
		}

		public void enterAtYear() {
			uIMapVehicle.vehicleBoatSearch.boatTab.uIBoatYearFromEdit.sendKeys(BaseData.getVehicleModuleValue("Year"));
		}

		public void verifyAtBoatHullNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("BoatHullNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Boat Hull#", rowIndex));
		}

		public void verifyAtYear(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Year"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Year", rowIndex));
		}

		public void clickRowAtBoatHullNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("BoatHullNo"));
		}

		public void selectAtVehicleNo() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VehicleNo"));
		}

		public void selectAtVehicleBoat() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VehicleNo"));
		}

		public void clickSelectIncidentVehicle() {
			uIMapVehicle.vehicleBoatSearch.uISelectIncidentVehicle.click();
		}

		public void clickRowAtVinNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VinNo"));
			Playback.pageLoadThreadWait();
		}

		public void clickRowAtVinNo1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VinNo1"));
		}

		public void verifyNoRecordFoundAcknowledgeMessage() {

			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else

				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void verifyUsingAtVinNoRowRed() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
									BaseData.getVehicleModuleValue("VinNo"))
							.getAttribute("class").contains("gridrowclr_Red"));
			Playback.gridLoadThreadWait();
		}

		public void verifyUsingVinNo1RowBlackColor() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
									BaseData.getVehicleModuleValue("VinNo1"))
							.getCssValue("color").contains("0, 0, 0, 1"));
		}

		public void verifyAtPlateStateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("State-Plate"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Plate-State", rowIndex));
		}

		public void verifyAtPlate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("State-Plate"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Make", rowIndex));
		}

		public void enterAtVehicle1() {
			uIMapVehicle.vehicleBoatSearch.uIVehicleNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("VechicleNo").substring(2));
		}

		public void verifyIncidentActivityFieldDisplayed() {
			verify.ExpectedValueIsTrue(uIMapVehicle.vehicleBoatSearch.uIIncidentActivityInput.isDisplayed());
		}

		public void selectAtIncidentActivity() {
			uIMapVehicle.vehicleBoatSearch.uIIncidentActivityInput.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValue(
					uIMapVehicle.vehicleBoatSearch.uIIncidentActivityDropdown,
					BaseData.getVehicleModuleValue("IncidentActivity"));
		}

		public void verifyRecordsListedInGrid() {
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable);
			verify.ExpectedValueIsTrue(count > 0);
		}

		public void enterAtBoatNo() {
			uIMapVehicle.vehicleBoatSearch.uIBoatNoEdit.sendKeys(BaseData.getVehicleModuleValue("BoatNo"));

		}
		
		

		public void selectRowByAtBoatNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("BoatNo"));

		}

		public void selectRowByAtBoatNo1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("BoatNo1"));

		}

		public void verifyAtTypeUsingBoatNoInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("BoatNo"), "Type");
			verify.ExpectedValueIsTrue(gridCell.getText().contains(BaseData.getVehicleModuleValue("Type")));
		}

		public void clickReset() {
			uIMapVehicle.vehicleBoatSearch.uIResetButton.click();

		}

		public void verifyAtVehicleNoDisplaysVehicleRecords() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify.getGridTableColumnValues(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Vehicle#");

			for (String value : gridTableColumnValues) {
				verify.ExpectedValueIsTrue(value.contains("V-"));
			}
		}

		public void verifyAtType1UsingVehicleNoInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VehicleNo"), "Type");
			verify.ExpectedValueIsTrue(gridCell.getText().contains(BaseData.getVehicleModuleValue("Type1")));
		}

		public void verifyAtType1UsingVehicleNo1InGrid() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VehicleNo1"), "Type");
			verify.ExpectedValueIsTrue(gridCell.getText().contains(BaseData.getVehicleModuleValue("Type1")));
		}

		public void verifyAtBoatNoDisplaysBoatRecords() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable, "Boat#");

			for (String value : gridTableColumnValues) {
				verify.ExpectedValueIsTrue(value.contains("B-"));
			}
		}

		public void clickRowAtVehicleNo1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.vehicleBoatSearch.uIVehicleBoatSearchResultTable,
					BaseData.getVehicleModuleValue("VehicleNo1"));
		}

	}

	public class VehicleTab {
		public void enterAtVehicleNo() {
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIVehicleNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("VehicleNo"));
		}

		public void enterAtPlateNo() {
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIPlateNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("PlateNo").substring(0, 2));
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIStateComboBox
					.sendKeys(BaseData.getVehicleModuleValue("PlateNo").substring(3));
		}

		public void enterAtVinNumber() {

			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIVinEdit.sendKeys(BaseData.getVehicleModuleValue("VinNo"));

		}

		public void clickShowAllCheckBox() {

			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIShowAllCheckBox.click();

		}

		public void enterAtPlate() {
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIPlateNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("Plate"));
		}

		public void selectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.vehicleBoatSearch.vehicleTab.uIStateComboBox, BaseData.getVehicleModuleValue("State"));
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIStateComboBox.sendKeys(Keys.TAB);
		}

		// added for 280007
		public void enterAtCallNo() {
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uICallYearEdit
					.sendKeys(BaseData.getVehicleModuleValue("CallNo").substring(0, 2));
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uICallNumberEdit.clear();
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uICallNumberEdit
					.sendKeys(BaseData.getVehicleModuleValue("CallNo").substring(3));
			uIMapVehicle.vehicleBoatSearch.vehicleTab.uICallNumberEdit.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();
		}

		// added for 280007
		public void enterATWTVNumber() {

			uIMapVehicle.vehicleBoatSearch.vehicleTab.uIWTVNumberEdit.sendKeys(BaseData.getVehicleModuleValue("WTVNo"));

		}
	}

	public class BoatTab {

	}

//Fleet Search Action Classes
	public class FleetSearch {

		public void selectAtFleetId() {
			uIMapVehicle.fleetSearch.uIFleetCodeEdit.sendKeys(BaseData.getVehicleModuleValue("FleetID"));
		}

		public void enterAtTag() {
			uIMapVehicle.fleetSearch.uITagEdit.sendKeys(BaseData.getVehicleModuleValue("Tag"));
		}

		public void enterAtMake() {
			uIMapVehicle.fleetSearch.uIMakeEdit.sendKeys(BaseData.getVehicleModuleValue("Make"));
			uIMapVehicle.fleetSearch.uIMakeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtYear() {
			uIMapVehicle.fleetSearch.uIYearEdit.sendKeys(BaseData.getVehicleModuleValue("Year"));
		}

		public void enterAtModel() {
			uIMapVehicle.fleetSearch.uILupModelEdit.sendKeys(BaseData.getVehicleModuleValue("Model"));
		}

		public void enterAtVin() {
			uIMapVehicle.fleetSearch.uIVinEdit.sendKeys(BaseData.getVehicleModuleValue("VIN"));
		}

		public void enterAtPO() {
			uIMapVehicle.fleetSearch.uIPOEdit.sendKeys(BaseData.getVehicleModuleValue("PO"));
		}

		public void enterAtVendorName() {
			uIMapVehicle.fleetSearch.uIVendorComboBox.sendKeys("VendorName");
		}

		public void enterAtVendorRef() {
			uIMapVehicle.fleetSearch.uIVendorReference.sendKeys(BaseData.getVehicleModuleValue("VendorRef"));
		}

		public void clickSearchButton() {
			uIMapVehicle.fleetSearch.uISearchButton.click();
		}

		public void clickAddNewButton() {
			uIMapVehicle.fleetSearch.uIAddNewButton.click();
		}

		public void clickMarkedCheckbox() {
			uIMapVehicle.fleetSearch.uIMarkedCheckbox.click();
		}

		public void selectRowByAtFleetId() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapVehicle.fleetSearch.uIResultTable,
					BaseData.getVehicleModuleValue("FleetID"));
		}

		public void selectRowByAtVendorRef() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapVehicle.fleetSearch.uIResultTable,
					BaseData.getVehicleModuleValue("VendorRef"));
		}

		public void verifyAtFleetId() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("FleetID"),
					objectIdentification.manualIdentify.getGridCell(uIMapVehicle.fleetSearch.uIResultTable,
							BaseData.getVehicleModuleValue("FleetID")).getText());
		}

		public void verifyAtDescriptionByFleetID() {
			WebElement fleet = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapVehicle.fleetSearch.uIResultTable, BaseData.getVehicleModuleValue("FleetID"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Description"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetSearch.uIResultTable, fleet, "Description").getText());

		}

		public void verifyAtMakeDescriptionByFleetID() {
			WebElement fleet = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapVehicle.fleetSearch.uIResultTable, BaseData.getVehicleModuleValue("FleetID"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("MakeDescription"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetSearch.uIResultTable, fleet, "Make").getText());

		}

		public void verifyAtModelByFleetID() {
			WebElement fleet = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapVehicle.fleetSearch.uIResultTable, BaseData.getVehicleModuleValue("FleetID"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Model"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetSearch.uIResultTable, fleet, "Model").getText());

		}

		public void verifyAtYearByFleetID() {
			WebElement fleet = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapVehicle.fleetSearch.uIResultTable, BaseData.getVehicleModuleValue("FleetID"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Year"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetSearch.uIResultTable, fleet, "Year").getText());

		}

		public void verifyAtVinByFleetID() {
			WebElement fleet = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapVehicle.fleetSearch.uIResultTable, BaseData.getVehicleModuleValue("FleetID"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Vin"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetSearch.uIResultTable, fleet, "VIN#").getText());

		}

		public void enterAtFleetId() {
			uIMapVehicle.fleetSearch.uIFleetCodeEdit.sendKeys(BaseData.getVehicleModuleValue("FleetID"));
			uIMapVehicle.fleetSearch.uIFleetCodeEdit.sendKeys(Keys.TAB);
		}

	}

	// region Fleet Entry Action Classes
	public class FleetEntry {

		// Fields

		public FleetEntryMainTab fleetEntryMainTab;
		public MaintenanceScheduleTab maintenanceScheduleTab;
		public EquipmentSuppliesTab equipmentSuppliesTab;
		public AssignmentsTab assignmentsTab;
		public FleetEntryNotesTab fleetEntryNotesTab;
		public ActivityLogTab activityLogTab;

		public FleetEntry() {
			// Properties

			if ((this.fleetEntryMainTab == null)) {
				this.fleetEntryMainTab = new FleetEntryMainTab();
			}

			if ((this.maintenanceScheduleTab == null)) {
				this.maintenanceScheduleTab = new MaintenanceScheduleTab();
			}

			if ((this.equipmentSuppliesTab == null)) {
				this.equipmentSuppliesTab = new EquipmentSuppliesTab();
			}

			if ((this.assignmentsTab == null)) {
				this.assignmentsTab = new AssignmentsTab();
			}

			if ((this.fleetEntryNotesTab == null)) {
				this.fleetEntryNotesTab = new FleetEntryNotesTab();
			}

			if ((this.activityLogTab == null)) {
				this.activityLogTab = new ActivityLogTab();
			}

		}

		public void clickMainTab() {
			uIMapVehicle.fleetEntry.uIMainTab.click();
		}

		public void clickEquipmentSuppliesTab() {
			uIMapVehicle.fleetEntry.uIEquipmentSuppliesTab.click();
		}

		public void clickActivityLogTab() {
			uIMapVehicle.fleetEntry.uIActivityLogTab.click();
		}

		public void clickAssignmentTab() {
			uIMapVehicle.fleetEntry.uIAssignmentsTab.click();
		}

		public void switchToNotesTab() {
			uIMapVehicle.fleetEntry.uINotesTab.click();
			objectIdentification.windowHandle.switchToFrame("frmFleetNotes");
		}

		public void clickNotesTab() {
			uIMapVehicle.fleetEntry.uINotesTab.click();
		}

		public void clickAttachmentsTab() {
			uIMapVehicle.fleetEntry.uIAttachmentsTab.click();
		}

		public void clickTriggersTab() {
			uIMapVehicle.fleetEntry.uITriggersTab.click();
		}

		public void clickMaintainenceScheduleTab() {
			uIMapVehicle.fleetEntry.uIMaintenanceScheduleTab.click();
		}

		public void enterAtFleetID() {
			uIMapVehicle.fleetEntry.uIFleetIDEdit.sendKeys(BaseData.getVehicleModuleValue("FleetID"));
		}

		public void enterAtDescription() {
			uIMapVehicle.fleetEntry.uIDescribtionEdit.sendKeys(BaseData.getVehicleModuleValue("Description"));

		}

		public void enterDescription() {
			uIMapVehicle.fleetEntry.uIDescribtionEdit.sendKeys(Randomized.randomString(15));

		}

		public void enterAtMake() {
			uIMapVehicle.fleetEntry.uIMakeEdit.sendKeys(BaseData.getVehicleModuleValue("Make"));
			uIMapVehicle.fleetEntry.uIMakeEdit.sendKeys(Keys.TAB);
		}

		public void verify1051UpdatedDataExistsInMainTabAckMsg() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Main Tab. You must save or reset.");
		}

		public void enterAtModel() {
			uIMapVehicle.fleetEntry.uIModelEdit.sendKeys(BaseData.getVehicleModuleValue("Model"));
		}

		public void enterAtYear() {
			uIMapVehicle.fleetEntry.uIYearEdit.sendKeys(BaseData.getVehicleModuleValue("Year"));
		}

		public void enterAtVin() {
			uIMapVehicle.fleetEntry.uIVinNumberEdit.sendKeys(BaseData.getVehicleModuleValue("VinNo"));
		}

		public void selectAtColor() {
			uIMapVehicle.fleetEntry.uIColor1ComboBox.click();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.fleetEntry.uIColor1ComboBox,
					BaseData.getVehicleModuleValue("Color"));
		}

		public void clickSaveButton() {
			uIMapVehicle.fleetEntry.uISaveButton.click();

		}

		public void selectInactiveCheckBox() {
			if (!uIMapVehicle.fleetEntry.uIInactiveCheckBox.isSelected()) {
				uIMapVehicle.fleetEntry.uIInactiveCheckBox.click();
			}
			Playback.controlReadyThreadWait();
		}

		public void verifyInactiveDateAsCurrentDate() {
			Playback.controlReadyThreadWait();
			String datetime = uIMapVehicle.fleetEntry.uIInactiveDateTime.getAttribute("value");
			verify.ExpectedValueIsTrue(datetime.contains(Randomized.getCurrentDate().substring(0, 8)));
		}

		public void verifySaveFunctionalitiesDisabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(uIMapVehicle.fleetEntry.uISaveCloseButton.isEnabled());
			verify.ExpectedValueIsFalse(uIMapVehicle.fleetEntry.uISaveButton.isEnabled());
		}

		public void verifySaveFunctionalitiesEnabled() {
			verify.ExpectedValueIsTrue(uIMapVehicle.fleetEntry.uISaveCloseButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapVehicle.fleetEntry.uISaveButton.isEnabled());
		}

		public void clickInactiveCheckbox() {
			uIMapVehicle.fleetEntry.uIInactiveCheckBox.click();
		}

		public void clickIsFireCheckbox() {
			uIMapVehicle.fleetEntry.uIIsFireCheckBox.click();
		}

		public void save() {
			uIMapVehicle.fleetEntry.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void saveNClose() {
			uIMapVehicle.fleetEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void close() {
			uIMapVehicle.fleetEntry.driver.close();
		}

		public void verify3032EnterByAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter By");
		}

		public void verify3032EnterPFAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter PF");
		}

		public void verify3032EnterActionAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Action");
		}

		public void verify3032EnterStationAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Station");
		}

		public void verify1018RequiredEntriesAreMissingAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void clickMakeSearchIcon() {
			uIMapVehicle.fleetEntry.uIMakeLookupButton.click();

		}
		
		public void clickPictureImage() {
			uIMapVehicle.fleetEntry.uIPictureImage.click();
		}

	}

	public class FleetEntryMainTab {

		public void enterAtComments() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uICommentsEdit
					.sendKeys(BaseData.getVehicleModuleValue("Comments"));

		}

		public void selectLockableCheckBox() {
			if (!uIMapVehicle.fleetEntry.fleetEntryMainTab.uILockableCheckBox.isSelected())

			{
				uIMapVehicle.fleetEntry.fleetEntryMainTab.uILockableCheckBox.click();
			}
		}

		public void enterAtStorageLocation() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIStorageLocationEdit
					.sendKeys(BaseData.getVehicleModuleValue("StorageLocation"));
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIStorageLocationEdit.sendKeys(Keys.TAB);

		}

		public void selectAtStorageLocation() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIStorageLocationComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapVehicle.fleetEntry.fleetEntryMainTab.uIStorageLocationComboBox,
					BaseData.getVehicleModuleValue("StorageLocation"));
		}

		public void clickAddButton() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIAddButton.click();
		}

		public void clickLockableCheckbox() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uILockableCheckbox.click();
		}

		public void enterAtTag() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uITagNumberEdit.sendKeys(BaseData.getVehicleModuleValue("Tag"));
		}

		public void selectAtUsageType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.fleetEntry.fleetEntryMainTab.uIUsageTypeComboBox,
					BaseData.getVehicleModuleValue("UsageType"));

		}

		public void selectUsageType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.fleetEntry.fleetEntryMainTab.uIUsageTypeComboBox);
		}

		public void clickMarkedCheckbox() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIMarkedCheckBox.click();
		}

		public void enterAtTagNo() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uITagNumberEdit.sendKeys(BaseData.getVehicleModuleValue("TagNo"));
		}

		public void clickTrackHourCheckbox() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uITrackHourCheckbox.click();
		}

		public void selectAtFuelTye() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.fleetEntry.fleetEntryMainTab.uIFuelTypeComboBox,
					BaseData.getVehicleModuleValue("FuelType"));
		}

		public void enterAtVendorName() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIVendorNameEdit
					.sendKeys(BaseData.getVehicleModuleValue("VendorName"));
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIVendorNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtVendorRef() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIVendorReferenceEdit
					.sendKeys(BaseData.getVehicleModuleValue("VendorRef"));
		}

		public void enterAtPO() {
			uIMapVehicle.fleetEntry.fleetEntryMainTab.uIPOEdit.sendKeys(BaseData.getVehicleModuleValue("PO"));
		}

	}

	public class MaintenanceScheduleTab {

		public void selectServiceType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIServiceTypeComboBox);

		}

		public void selectAtServiceType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIServiceTypeComboBox,
					BaseData.getVehicleModuleValue("ServiceType"));
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIServiceTypeComboBox.sendKeys(Keys.TAB);

		}

		public void selectPeriodAs1Month() {

			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIPeriodComboBox.sendKeys("1 Month");
		}

		public void selectPeriodAs3Month() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIPeriodComboBox.sendKeys("3 Month");
		}

		public void selectPeriodAs4Month() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIPeriodComboBox.sendKeys("4 Month");
		}

		public void selectPeriodAsYear() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIPeriodComboBox.sendKeys("1 Year");
		}

		public void enterAtMiles() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIMilesEdit
					.sendKeys(BaseData.getVehicleModuleValue("Miles"));
		}

		public void enterAtHours() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIHoursEdit
					.sendKeys(BaseData.getVehicleModuleValue("Hours"));
		}

		public void clickAddButton() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIAddButton.click();
		}

		public void verifyNextDueDateAsCurrentDateOfFutureMonths(int FutureMonth) {
			WebElement NextDue = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIMaintainenceScheduleTable,
					BaseData.getVehicleModuleValue("ServiceType"));
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDateByMonth(FutureMonth),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIMaintainenceScheduleTable,
									NextDue, "Next Due")
							.getText());

		}

		public void selectRowByAtServiceType() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIMaintainenceScheduleTable,
					BaseData.getVehicleModuleValue("ServiceType"));
		}

		public void clickViewMileageLogButton() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIViewMillageLogButton.click();
		}

		public void enterDateAsCurrentDate() {
			uIMapVehicle.fleetEntry.maintenanceScheduleTab.uIDateEdit.sendKeys(Randomized.getCurrentDate());

		}
	}

	public class EquipmentSuppliesTab {

		public void clickAddNewEquipmentOrSupplyItemButton() {
			uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIAddNewEquipmentOrSupplyItemButton.click();
		}

		public void clickPerformEquipmentServiceButton() {
			uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIPerformEquipmentServicesButton.click();
		}

		public void verifyAtFleeetLocationInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("FleetLocation"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIEquipmentSuppliesTable,
									BaseData.getVehicleModuleValue("FleetLocation"))
							.getText());

		}

		public void clickExpandCheckbox() {
			Playback.waitForControlReady();
			uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIExpandCheckbox.click();
		}

		public void verifyAssertItemByItemDescriptionInGrid() {
			Playback.waitForPageLoad();
			WebElement webElem = objectIdentification.manualIdentify.getGridCell(
					uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIEquipmentSuppliesInnerGridTable,
					BaseData.getVehicleModuleValue("ItemDescription"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("ItemDescription"), webElem.getText());

		}

		public void verifyExpendableItemByAtLocationInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Location"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIEquipmentSuppliesTable,
									BaseData.getVehicleModuleValue("Location"))
							.getText());

		}

		public void verifyAtModelInGrid() {
			Playback.pageLoadThreadWait();
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIEquipmentSuppliesInnerGridTable,
					BaseData.getVehicleModuleValue("Model"));
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Model"), gridCell.getText());
		}

		public void verifyAtDateAcqAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("MM/dd/yy"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.fleetEntry.equipmentSuppliesTab.uIEquipmentSuppliesInnerGridTable,
									BaseData.getInventoryModuleValue("DateAcq"))
							.getText());

		}

	}

	public class AssignmentsTab {

		public void verifyAtActionFromTable(int rowIndex) {

			String action = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.fleetEntry.assignmentsTab.uIAssignmentTable, "Action", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Action"), action);
		}

		public void deleteGridRowByAction() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapVehicle.fleetEntry.assignmentsTab.uIAssignmentTable, BaseData.getVehicleModuleValue("Action"));
			popup.confirm.yes();
		}

		public void selectActionAsAssigned() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIActionComboBox.sendKeys("Assigned");
			uIMapVehicle.fleetEntry.assignmentsTab.uIActionComboBox.sendKeys(Keys.TAB);
		}

		public void selectActionAsDisposition() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIActionComboBox.sendKeys("Disposition");
			uIMapVehicle.fleetEntry.assignmentsTab.uIActionComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.fleetEntry.assignmentsTab.uIActionComboBox, BaseData.getVehicleModuleValue("Action"));

		}

		public void selectActionAsReturned() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIActionComboBox.sendKeys("Returned");
		}

		public void tabOutAssignedDate() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIAssignedDateEdit.click();
			uIMapVehicle.fleetEntry.assignmentsTab.uIAssignedDateEdit.sendKeys(Keys.TAB);
			uIMapVehicle.fleetEntry.assignmentsTab.uIAssignedTimeEdit.click();
			Playback.controlReadyThreadWait();

		}

		public void tabOutBy() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIByCodeEdit.sendKeys(Keys.TAB);
		}

		public void verifyCurrentDateAutoPopulatesInAssignedDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapVehicle.fleetEntry.assignmentsTab.uIAssignedDateEdit.getAttribute("value"));
		}

		public void verifyDefaultLoggedPfAutoPopulatesInByField() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getInventoryModuleValue("PFCode"),
					uIMapVehicle.fleetEntry.assignmentsTab.uIByCodeEdit.getAttribute("value"));
		}

		public void clickDivisionRadioButton() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIDivisionRadioButton.click();
		}

		public void clickStationRadioButton() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIStationRadioButton.click();
		}

		public void selectSection() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapVehicle.fleetEntry.assignmentsTab.uISectionComboBox);
		}

		public void selectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.fleetEntry.assignmentsTab.uIDivisionComboBox,
					BaseData.getVehicleModuleValue("Division"));
		}

		public void selectAtStation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapVehicle.fleetEntry.assignmentsTab.uIStationComboBox,
					BaseData.getVehicleModuleValue("Station"));
		}

		public void enterAtPFCode() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIPfEdit.sendKeys(BaseData.getVehicleModuleValue("PFCode"));
			uIMapVehicle.fleetEntry.assignmentsTab.uIPfEdit.sendKeys(Keys.TAB);
		}

		public void verifyDivisionStationRadioButtonDisabled() {

			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapVehicle.fleetEntry.assignmentsTab.uIDivisionRadioButton.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapVehicle.fleetEntry.assignmentsTab.uIStationRadioButton.getAttribute("disabled")));
		}

		public void ClickDeleteIconInGrid() {
			uIMapVehicle.fleetEntry.assignmentsTab.uIDeleteIconGridButton.click();
		}

		public void verifyActionFieldEnable() {
			verify.ExpectedValueIsTrue(uIMapVehicle.fleetEntry.assignmentsTab.uIActionComboBox.isEnabled());
		}

		public void verifyAssignedDateFieldEnable() {
			verify.ExpectedValueIsTrue(uIMapVehicle.fleetEntry.assignmentsTab.uIAssignedDateEdit.isEnabled());
		}

		public void verifyByFieldEnable() {
			verify.ExpectedValueIsTrue(uIMapVehicle.fleetEntry.assignmentsTab.uIByCodeEdit.isEnabled());
		}

		public void verifyPFFieldEnable() {
			verify.ExpectedValueIsTrue(uIMapVehicle.fleetEntry.assignmentsTab.uIPfEdit.isEnabled());
		}

		public void tabOutAssignedTime() throws AWTException {
			Robot robot = new Robot();
			uIMapVehicle.fleetEntry.assignmentsTab.uIAssignedTimeEdit.click();
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_SHIFT);

		}
	}

	public class FleetEntryNotesTab {

		public void tabOutUpdatedDateTime() {
			uIMapVehicle.fleetEntry.fleetEntryNotesTab.uIUpdateDateEdit.sendKeys(Keys.TAB);
			uIMapVehicle.fleetEntry.fleetEntryNotesTab.uIUpdateTimeEdit.sendKeys(Keys.TAB);

		}

		public void verifyCurrentDateAutopopulatesInUpdatedDateField() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapVehicle.fleetEntry.fleetEntryNotesTab.uIUpdateDateEdit.getAttribute("value"));
		}

		public void save() {
			uIMapVehicle.fleetEntry.fleetEntryNotesTab.uISaveButton.click();
		}

		public void enterComments(String comments) {
			uIMapVehicle.fleetEntry.fleetEntryNotesTab.uICommentsTextView.sendKeys("Automation Entering the BaseData");
			comments = uIMapVehicle.fleetEntry.fleetEntryNotesTab.uICommentsTextView.getAttribute("value");
			Playback.setTestContextAttribute("comments", comments);
		}

		public void verifyAddedInGrid(String comments) {
			String text = uIMapVehicle.fleetEntry.fleetEntryNotesTab.uINotesTable.getText();
			verify.ExpectedPropertyValueIsEqual(comments, text);
		}

	}

	public class ActivityLogTab {
		public void clickAddNewActivity() {
			uIMapVehicle.fleetEntry.activityLogTab.uIAddNewActivityButton.click();
		}
	}

	// Equipment Service Action Classes
	public class EquipmentService {

		public void tabOutServicedTestedBy() {
			uIMapVehicle.equipmentService.uISelectedTestedByEdit.sendKeys(Keys.TAB);
		}

		public void verifyLoggedPFAppear() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("UserName"),
					uIMapVehicle.equipmentService.uISelectedTestedByEdit.getAttribute("value"));
		}

		public void tabOutDate() {
			uIMapVehicle.equipmentService.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyCurrentDateAutopopulates() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapVehicle.equipmentService.uIDateEdit.getAttribute("value"));
		}

		public void enterNotes() {
			uIMapVehicle.equipmentService.uINotesTextView.sendKeys(Randomized.randomAlphanumericSpecialCharsString(10));
		}

		public void clickSelectAllCheckbox() {
			uIMapVehicle.equipmentService.uISelectAllCheckbox.click();
		}

		public void save() {
			uIMapVehicle.equipmentService.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapVehicle.equipmentService.uISaveButton.click();
			Playback.pageLoadThreadWait();

		}

		public void saveNClose() {
			uIMapVehicle.equipmentService.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void verifyGridDisappeared() {

			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.controlExist(uIMapVehicle.equipmentService.uIEquipmentServiceScreenInvenSearchTable));

		}

		public void verify3032EnterTestedByAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Tested By");
		}

		public void verify3032EnterDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Date");
		}

		public void verifyAssertItemAppearInGridByAtLadderType() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("LadderType"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.equipmentService.uIEquipmentServiceScreenInvenSearchTable,
									BaseData.getVehicleModuleValue("LadderType"))
							.getText());
		}

		public void verifyAssertItemDisAppearInGridByAtLadderType() {
			verify.ExpectedValueIsFalse(uIMapVehicle.equipmentService.uIEquipmentServiceScreenInvenSearchTable.getText()
					.contains(BaseData.getVehicleModuleValue("LadderType")));

		}

		public void clickServicedCheckboxByLadderType() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapVehicle.equipmentService.uIEquipmentServiceScreenInvenSearchTable,
					BaseData.getVehicleModuleValue("LadderType"));
		}

		public void uncheckExpandCollapseCheckbox() {
			Playback.waitForPageLoad();
			uIMapVehicle.equipmentService.uIExpandAllCheckbox.click();
			;

		}

		public void clickExpandCollapseCheckbox() {
			Playback.waitForPageLoad();
			uIMapVehicle.equipmentService.uIExpandAllCheckbox.click();
		}

		public void verifyNoRecordsFoundAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6017) No Records Found");
		}

		public void verifyAssertItemDisAppearInGrid() {
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapVehicle.equipmentService.uIEquipmentServiceScreenInvenSearchTable);
			verify.ExpectedIntergerValueIsEqualToActual(0, count);

		}

	}

	// region Fuel Log Entry Action Classes
	public class FuelLogEntry {

		public void verifyAtFleetId() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("FleetID"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapVehicle.fuelLogEntry.uIFleetIDComboBox));

		}

		public void clickUpdateMileageButton() {
			uIMapVehicle.fuelLogEntry.uIUpdateMileageButton.click();
		}

		public void tabOutPopupDate() {
			uIMapVehicle.fuelLogEntry.uIPopupDateEdit.sendKeys(Keys.TAB);

		}

		public void enterPopupCurrentMileageAs10() {
			uIMapVehicle.fuelLogEntry.uIPopupCurrentMileageEdit.sendKeys("10.0");
		}

		public void enterPopupCurrentMileageAs20() {
			uIMapVehicle.fuelLogEntry.uIPopupCurrentMileageEdit.sendKeys("20.0");
		}

		public void enterPopupCurrentMileageAs9() {
			uIMapVehicle.fuelLogEntry.uIPopupCurrentMileageEdit.sendKeys("9");
			uIMapVehicle.fuelLogEntry.uIPopupCurrentMileageEdit.sendKeys(Keys.TAB);
		}

		public void enterPopupCurrentMileageAs50() {
			uIMapVehicle.fuelLogEntry.uIPopupCurrentMileageEdit.sendKeys("50");
		}

		public void savePopup() {
			uIMapVehicle.fuelLogEntry.uIPopupSaveButton.click();
		}

		public void verify1002AdditionalSuccessfulAckMsg() {
			popup.acknowledge.okWithExpectedMessage(" 1002 - Addition Successful");
		}

		public void verify3032GreaterThanLstMileageAckMsg() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter greater than last mileage");
		}

		public void verifyMileageAppearAs10() {
			verify.ExpectedPropertyValueIsEqual("10.0", uIMapVehicle.fuelLogEntry.uIMileageText.getText());
		}

		public void saveNClose() {
			uIMapVehicle.fuelLogEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void enterQuantityAs10() {
			uIMapVehicle.fuelLogEntry.uIPopupQuantityEdit.sendKeys("10");

		}

		public void enterOilAs10() {
			uIMapVehicle.fuelLogEntry.uIOilEdit.sendKeys("10");

		}

		public void enterHours(String hours) {
			uIMapVehicle.fuelLogEntry.uIHoursEdit.sendKeys(hours);

		}

	}

	// region Mileage Log Entry
	public class MileageLogEntry {

		public void selectAtFleedId() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.mileageLogEntry.uIFleetIDComboBox,
					BaseData.getVehicleModuleValue("FleetId"));
		}

		public void clickSearchButton() {
			uIMapVehicle.mileageLogEntry.uISearchButton.click();
		}

		public void clickDeleteCell() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapVehicle.mileageLogEntry.uIMileageLogEntryTable, BaseData.getVehicleModuleValue("FleetId"));
		}

		public void verifyDoYouWantToDeleteAcknowledgeMessage() {
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete");
		}

		// For chrome
		public void verifingDoYouWantToDeleteAcknowledgeMessage() {
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete");
		}

		public void save() {
			uIMapVehicle.mileageLogEntry.uISaveButton.click();

		}

		public void verifyNoRecordExists() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapVehicle.mileageLogEntry.uIMileageLogEntryTable) == 0);
		}

		public void clickDeleteCellByFleetId() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapVehicle.mileageLogEntry.uIMileageLogEntryTable, BaseData.getVehicleModuleValue("FleetId"));
			//
		}

		public void verifyNoRecordFoundAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}

	}

	// Vehicle Make Model Action Classes
	public class VehicleMakeModel {

		public void enterAtMake() {
			uIMapVehicle.vehicleMakeModel.uIMakeEdit.sendKeys(BaseData.getVehicleModuleValue("Make"));
			uIMapVehicle.vehicleMakeModel.uIMakeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtModelCode() {
			Playback.threadWait();
			uIMapVehicle.vehicleMakeModel.uIModelCodeEdit.sendKeys(BaseData.getVehicleModuleValue("Model"));
		}

		public void enterAtModelDescription() {
			uIMapVehicle.vehicleMakeModel.uIModelDescriptionEdit
					.sendKeys(BaseData.getVehicleModuleValue("ModelDescription"));
		}

		public void clickAddButton() {
			uIMapVehicle.vehicleMakeModel.uIAddButton.click();

		}

		public void save() {
			uIMapVehicle.vehicleMakeModel.uISaveButton.click();
			popup.confirm.yes();
		}

		public void verifyModelAppearInGridByModel() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("Model"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapVehicle.vehicleMakeModel.uIVehicleMakeModelTable,
									BaseData.getVehicleModuleValue("Model"))
							.getText());
		}

	}

	public class TowRotation {
		public void selectAtPatrolArea() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIPatrolAreaComboBox,
					BaseData.getVehicleModuleValue("PatrolArea"));
			uIMapVehicle.towRotation.uIPatrolAreaComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtVendor1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIVendorComboBox,
					BaseData.getVehicleModuleValue("Vendor1"));
			uIMapVehicle.towRotation.uIVendorComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtPosition1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIPositionComboBox,
					BaseData.getVehicleModuleValue("Position1"));
			uIMapVehicle.towRotation.uIPositionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtVendor() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIVendorComboBox,
					BaseData.getVehicleModuleValue("Vendor"));
			uIMapVehicle.towRotation.uIVendorComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtPosition() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIPositionComboBox,
					BaseData.getVehicleModuleValue("Position"));
			uIMapVehicle.towRotation.uIPositionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectPosition() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIPositionComboBox);
			uIMapVehicle.towRotation.uIPositionComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtEquipmentType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIEquipmentTypeComboBox,
					BaseData.getVehicleModuleValue("Equipment"));
			Playback.controlReadyThreadWait();
		}

		public void selectAtEquipmentType2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapVehicle.towRotation.uIEquipmentTypeComboBox,
					BaseData.getVehicleModuleValue("Equipment"));
		}

		public void clickAddButton() {
			uIMapVehicle.towRotation.uIAddButton.click();
		}

		public void clickSave() {
			uIMapVehicle.towRotation.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapVehicle.towRotation.uISaveButton.click();
			popup.confirm.yes();
			popup.acknowledge.ok();
		}

		public void clickAtPatrolAreaInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapVehicle.towRotation.uITowRotationTable, BaseData.getVehicleModuleValue("PatrolArea"));
		}
		
		public void DeleteAtVendorNameInGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapVehicle.towRotation.uITowRotationTable, BaseData.getVehicleModuleValue("VendorName"));
			popup.acknowledge.ok();
		}

		public void verifyAtPatrolArea(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.towRotation.uITowRotationTable, "Area", rowIndex)
					.contains(BaseData.getVehicleModuleValue("PatrolArea")));
		}

		public void verifyAtVendor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapVehicle.towRotation.uITowRotationTable, "Vendor Name", rowIndex)
					.contains(BaseData.getVehicleModuleValue("Vendor").substring(6)));
		}

		public void verifyAtVendorNameInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("VendorName"),
					objectIdentification.manualIdentify.getGridCell(uIMapVehicle.towRotation.uITowRotationTable,
							BaseData.getVehicleModuleValue("VendorName")).getText());
		}

		public void verifyAtVendorName1InGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getVehicleModuleValue("VendorName1"),
					objectIdentification.manualIdentify.getGridCell(uIMapVehicle.towRotation.uITowRotationTable,
							BaseData.getVehicleModuleValue("VendorName1")).getText());
		}

		public void verifyDuplicateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void verifyNoDuplicationInVendorDropdown() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getDropDownOptionsCount(uIMapVehicle.towRotation.uIVendorComboBox) == 3);
		}

		public void clickPrint() {
			uIMapVehicle.towRotation.uIPrintButton.click();
		}

	}

	public class TowVendor {

		public void enterAtVendorcode() {

			uIMapVehicle.towVendor.uIVendorCodeEdit.sendKeys(BaseData.getVehicleModuleValue("VendorCode"));

		}

		public void clickSearch() {

			uIMapVehicle.towVendor.uISearchButton.click();

		}

		public void verifyAddressContainsJurisAndCSZInTheAddressColumn() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(
					uIMapVehicle.towVendor.uITowVendorResultTable, BaseData.getVehicleModuleValue("VendorCode"),
					"Address");
			String address = gridCell.getText();
			String[] addressDetails = address.split(";");
			String regExp = "^[A-Z]{2},\\s[\\w\\s]+,\\s[A-Z]{2},\\s[0-9]{5}$";
			verify.ExpectedValueIsTrue(Pattern.matches(addressDetails[1], regExp), "Address Fromat Wrong");

		}

	}

	public class VehicleFlagDetailsScreen {
		public void verifyCurrentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapVehicle.vehicleFlagDetailsScreen.uIVehicleFlagDetailTable, "Date", rowIndex));
		}

		public void verifyFlagIconInFlagDetailScreen(int rowIndex) {
			String SystemCheckBox = objectIdentification.manualIdentify
					.getGridCell(uIMapVehicle.vehicleFlagDetailsScreen.uIVehicleFlagDetailTable, "Comments", rowIndex)
					.getAttribute("class");
			verify.ExpectedValueIsTrue(SystemCheckBox.contains("gridrowclr_Flag"));
		}

		public void closeScreen() {
			Playback.driver.close();
		}

	}

}
