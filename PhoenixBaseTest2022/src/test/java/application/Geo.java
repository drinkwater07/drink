package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.google.common.base.Verify;

import dataAccess.BaseData;
import resources.PropertiesFile;
import uIMaps.UIMapGeo;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Geo {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapGeo uIMapGeo = new UIMapGeo();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();

	public StreetEntry streetEntry;
	
	public StreetSearch streetSearch;
	public CommonNameHelp commonNameHelp;
	public CommonNames commonNames;
	public CommonNamesEntry commonNamesEntry;
	public StreetUpdate streetUpdate;
	public AddressIntersection addressIntersection;
	public AddressIntersection2040 addressIntersection2040;
	public Apartment apartment;
	public ApartmentEntry apartmentEntry;
	public ApartmentHelpWindow apartmentHelpWindow;
	public AddressSearch addressSearch;
	public FastGeo fastGeo;
	public AddressFlag addressFlag;
	public AddressFlagEntry addressFlagEntry;
	public BatchUpdate batchUpdate;
	public HazMatFlags hazMatFlags;
	public HazMatFlagEntry hazMatFlagEntry;
	public HydrantSearch hydrantSearch;
	public HydrantEntry hydrantEntry;
	public WeatherScreen weatherScreen;
	public ContactEntryScreen contactEntryScreen;
	public ContactSearch contactSearch;
	public GeoContactNewEntry geoContactNewEntry;
	public HydrantTest hydrantTest;
	public MapLayerEntry mapLayerEntry;
	public AddressSearchHelp addressSearchHelp;
	public RealAddressHelpWindow realAddressHelpWindow;
	public UpdateGeoCode updateGeoCode;
	public MapLayerSearch mapLayerSearch;
	public AVLReplay aVLReplay;
	public AddressIntersection2040UpdateLatLongWindow addressIntersection2040UpdateLatLongWindow;
	public ZipCode zipCode;
	public PremiseHelpWindow premiseHelpWindow;
	public AddressIntersectionHelpWindow addressIntersectionHelpWindow;
	public ZipCodeEntry zipCodeEntry;

	public Geo() {

		if (streetEntry == null)
			streetEntry = new StreetEntry();

		if (streetSearch == null)
			streetSearch = new StreetSearch();

		if (commonNameHelp == null)
			commonNameHelp = new CommonNameHelp();

		if (commonNames == null)
			commonNames = new CommonNames();

		if (commonNamesEntry == null)
			commonNamesEntry = new CommonNamesEntry();

		if (addressSearchHelp == null)
			addressSearchHelp = new AddressSearchHelp();

		if (streetUpdate == null)
			streetUpdate = new StreetUpdate();

		if (addressIntersection == null)
			addressIntersection = new AddressIntersection();

		if (addressIntersection2040 == null)
			addressIntersection2040 = new AddressIntersection2040();

		if (apartment == null)
			apartment = new Apartment();

		if (apartmentEntry == null)
			apartmentEntry = new ApartmentEntry();

		if (apartmentHelpWindow == null)
			apartmentHelpWindow = new ApartmentHelpWindow();

		if (addressSearch == null)
			addressSearch = new AddressSearch();

		if (fastGeo == null)
			fastGeo = new FastGeo();

		if (addressFlag == null)
			addressFlag = new AddressFlag();

		if (addressFlagEntry == null)
			addressFlagEntry = new AddressFlagEntry();

		if (batchUpdate == null)
			batchUpdate = new BatchUpdate();

		if (hazMatFlags == null)
			hazMatFlags = new HazMatFlags();

		if (hazMatFlagEntry == null)
			hazMatFlagEntry = new HazMatFlagEntry();

		if (hydrantSearch == null)
			hydrantSearch = new HydrantSearch();

		if (hydrantEntry == null)
			hydrantEntry = new HydrantEntry();

		if (weatherScreen == null)
			weatherScreen = new WeatherScreen();

		if (contactEntryScreen == null)
			contactEntryScreen = new ContactEntryScreen();

		if (contactSearch == null)
			contactSearch = new ContactSearch();

		if (geoContactNewEntry == null)
			geoContactNewEntry = new GeoContactNewEntry();

		if (hydrantTest == null)
			hydrantTest = new HydrantTest();

		if (mapLayerEntry == null)
			mapLayerEntry = new MapLayerEntry();

		if (mapLayerSearch == null)
			mapLayerSearch = new MapLayerSearch();

		if (realAddressHelpWindow == null)
			realAddressHelpWindow = new RealAddressHelpWindow();

		if (updateGeoCode == null)
			updateGeoCode = new UpdateGeoCode();

		if (aVLReplay == null)
			aVLReplay = new AVLReplay();

		if (addressIntersection2040UpdateLatLongWindow == null)
			addressIntersection2040UpdateLatLongWindow = new AddressIntersection2040UpdateLatLongWindow();

		if (zipCode == null)
			zipCode = new ZipCode();

		if (premiseHelpWindow == null)
			premiseHelpWindow = new PremiseHelpWindow();

		if (addressIntersectionHelpWindow == null)
			addressIntersectionHelpWindow = new AddressIntersectionHelpWindow();
		if (this.zipCodeEntry == null)
			this.zipCodeEntry = new ZipCodeEntry();

	}

	public void Reset() {

		uIMapGeo = null;
		uIMapPopup = null;
	}

	public void switchToStreetSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmStreetSrch");
	}

	public void switchToStreetEntry() {
		objectIdentification.windowHandle.switchToWindow("Street Entry");
	}

	public void switchToAddressSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmAddrDetails.aspx");
	}

	public void switchToAddressSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Address Search - 2094");
	}

	public void switchToGeoOnFly() {
		objectIdentification.windowHandle.switchToWindow("Street Entry");
	}

	public void switchToApartmentEntry() {
		objectIdentification.windowHandle.switchToWindow("Apartment Entry");
	}

	public void switchToApartmentHelpWindow() {
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.nonTitleWidnowExist("frmRealAddress");
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
	}

	public void switchToApartment() {
		objectIdentification.windowHandle.switchToWindow("Apartment");
	}

	public void switchToAddressFlagEntry() {
		objectIdentification.windowHandle.switchToWindow("Address Flag Entry");
	}

	public void switchToAddressFlagPSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmAddrFlagSrch");
	}

	public void switchToAddressIntersection() {
		objectIdentification.windowHandle.switchToWindow("Address/Intersection");
		Playback.popupThreadWait();
	}

	public void switchToCommonNamesScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmCMNSrch.aspx");
		Playback.popupThreadWait();
	}

	public void switchToCommonNameHelp() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmAddrCommonName.aspx");
		Playback.popupThreadWait();
	}

	public void switchToCommonNamesEntry() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("Common Names Entry");
	}

	public void switchToStreetUpdate() {
		objectIdentification.windowHandle.switchToWindow("Street Update");
	}

	public void switchToBatchUpdate() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmBatchUpdate");
		Playback.popupThreadWait();
	}

	public void switchToAddressIntersection2040() {
		objectIdentification.windowHandle.switchToWindow("Address/Intersection - 2040");
		Playback.popupThreadWait();
	}

	public void switchToHazMatFlags() {

		objectIdentification.windowHandle.switchToMainWindowScreenTab("Geo/frmHazMatFlagSrch"); // uncommented by Abi as
																								// changes in src
		// objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmHazMatFlagSrch");

		Playback.popupThreadWait();
	}

	public void switchToHazMatFlagEntry() {
		objectIdentification.windowHandle.switchToWindow("HazMat Flag Entry");
		Playback.popupThreadWait();
	}

	public void switchToHydrantSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmHydrantSrch");
		Playback.popupThreadWait();
	}

	public void switchToHydrantEntry() {
		objectIdentification.windowHandle.switchToWindow("Hydrant Entry");
		Playback.popupThreadWait();
	}

	public void switchToGoogleMap() {
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("Google Maps");
		Playback.popupThreadWait();
	}

	
	public void switchToWeatherScreen() {
		Playback.popupThreadWait();
		Playback.popupThreadWait();
		objectIdentification.windowHandle.nonTitleWidnowExist("frmIntMgmtBlank");

	}

	public void switchToContactEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmContactDetail");
		Playback.popupThreadWait();
	}

	public void switchToContactSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmContactSrch");
		Playback.popupThreadWait();
	}

	public void switchToGeoContactNewEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmContactNew");
		Playback.popupThreadWait();
	}

	public void switchToHydrantTest() {
		objectIdentification.windowHandle.switchToWindow("Hydrant Test");
		Playback.popupThreadWait();
	}

	public void switchToContactDetailEntry() {
		objectIdentification.windowHandle.switchToWindow("Contact Group Detail Entry - 2074");
	}

	public void switchToMapLayerEntry() {
		objectIdentification.windowHandle.switchToWindow("Map Layer Entry");
		Playback.controlReadyThreadWait();
	}

	public void switchToRealAddressWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("RealAddress.aspx");
	}

	public void switchToUpdateGeoCode() {
		// objectIdentification.windowHandle.switchToMainWindowScreenTab("Geo/frmUpdateGeoCode");
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmUpdateFixLatLong");
		Playback.popupThreadWait();
	}

	public void switchToMapLayerSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("GEO/frmMapPointLayers");
		Playback.controlReadyThreadWait();
	}

	public void switchToApartmentSearchHelpWindow() {
		Playback.controlReadyThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingURL("frmAptSearch.aspx");
	}

	public void switchToAVLReplay() {
		objectIdentification.windowHandle.switchToWindow("AVL Replay");
		Playback.pageLoadThreadWait();
	}

	public void switchToAddressIntersection2040UpdateLatLongWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmUpdateLatLong");
		Playback.controlReadyThreadWait();

	}

	public void switchToZipCode() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmZipSrch.aspx");
	}

	public void switchToPremiseHelpWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPremise.aspx");
	}

	public void switchToApartmentHelpWindow1() {
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindowUsingURL("frmAptSearch.aspx");
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
	}

	public class StreetSearch {

		public void EnterStreetName() {

			uIMapGeo.streetSearch.uIStreetNameEdit.clear();
			uIMapGeo.streetSearch.uIStreetNameEdit.sendKeys("T");
		}

		public void enterAtStreetName() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			uIMapGeo.streetSearch.uIStreetNameEdit.clear();
			uIMapGeo.streetSearch.uIStreetNameEdit.sendKeys(streetName);
		}

		public void EnterAtInterStreetName() {
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			uIMapGeo.streetSearch.uIStreetNameEdit.clear();
			uIMapGeo.streetSearch.uIStreetNameEdit.sendKeys(interStreetName);
		}

		public void EnterAtPrefix() {
			String prefix = BaseData.getGeoModuleValue("Prefix");
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetSearch.uIPrefixComboBox, prefix);
		}

		public void EnterAtSuffix() {
			String suffix = BaseData.getGeoModuleValue("Suffix");
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetSearch.uISuffixComboBox, suffix);
		}

		public void enterAtStreetType() {
			String streetType = BaseData.getGeoModuleValue("StreetType");
			uIMapGeo.streetSearch.uIStreetTypeEdit.sendKeys(streetType);
		}

		public void SelectAtStreetType() {
			uIMapGeo.streetSearch.uIStreetTypeLookupButton.click();
			popup.kPICodedLookup.kPIHelpSelect(BaseData.getGeoModuleValue("StreetType"));
		}

		public void EnterAtInterStreetType() {
			String interStreetType = BaseData.getGeoModuleValue("InterStreetType");
			uIMapGeo.streetSearch.uIStreetTypeEdit.sendKeys(interStreetType);
		}

		public void clickSearchButton() {
			uIMapGeo.streetSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void clickAddNew() {
			uIMapGeo.streetSearch.uIAddNewPane.click();
		}

		public void clickAtStreetName() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, streetName);
		}

		public void ClickClearFields() {
			uIMapGeo.streetSearch.uIStreetNameEdit.clear();
			uIMapGeo.streetSearch.uIStreetTypeEdit.clear();
		}

		public void ClickIntersectionCheckBox() {
			uIMapGeo.streetSearch.uIIntersectionCheckBox.click();
		}

		public void ClickSelectAllCheckBox() {
			uIMapGeo.streetSearch.uISelectAllCheckBox.click();
		}

		public void ClickInactiveCheckboxCheckBox() {
			uIMapGeo.streetSearch.uIIncludeInactiveCheckBox.click();
		}

		public void ClickShowAltStreetNameCheckBox() {
			uIMapGeo.streetSearch.uIShowAlternateCheckBox.click();
		}

		public void ClickBatchUpdateLink() {
			uIMapGeo.streetSearch.uIBatchUpdateButton.click();
		}

		public void SelectRandomRowFromGrid() {
			Playback.threadWait(5000);
			objectIdentification.randomIdentify.selectRandomGridRow("grdStreet");

		}
		public void SelectAtStreetNameFromGrid() {
			Playback.threadWait(5000);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, BaseData.getGeoModuleValue("StreetName"));

		}

		public void VerifyAtStreetName() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			Playback.controlReadyThreadWait();
			Assert.assertEquals(BaseData.getGeoModuleValue("StreetName"), objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.streetSearch.uIStreetSearchResultGrID, streetName).getText());
		}

		public void VerifyAtIntersectionStreetName() {
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			Playback.controlReadyThreadWait();
			Assert.assertEquals(interStreetName, objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.streetSearch.uIStreetSearchResultGrID, interStreetName).getText());
		}

		public void VerifyAtInterStreetName(int rowIndex) {
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Intersection Street Name",
							rowIndex)
					.contains(interStreetName));
		}

		public void VerifyAtStreetType(int rowIndex) {
			String streetType = BaseData.getGeoModuleValue("StreetType");
			Assert.assertEquals(streetType, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Street Type", rowIndex));
		}

		public void SelectManageApartment() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			objectIdentification.manualIdentify.selectContextMenuItemInTheGridRow(
					uIMapGeo.streetSearch.uIStreetSearchResultGrID, streetName, "Manage Apartment");
		}

		public void VerifyAtPrefix(int rowIndex) {
			String prefix = BaseData.getGeoModuleValue("Prefix");
			Assert.assertEquals(prefix, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Prefix", rowIndex));
		}

		public void VerifyAtSuffix(int rowIndex) {
			Playback.controlReadyThreadWait();
			String suffix = BaseData.getGeoModuleValue("Suffix");
			Assert.assertEquals(suffix, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Suffix", rowIndex));
		}

		public void SelectManageStreet() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			objectIdentification.manualIdentify.selectContextMenuItemInTheGridRow(
					uIMapGeo.streetSearch.uIStreetSearchResultGrID, streetName, "Manage Street");
		}

		public void SelectManageIntersection() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectContextMenuItemInTheGridRow(
					uIMapGeo.streetSearch.uIStreetSearchResultGrID, streetName, "Manage Intersection");
		}

		public void VerifyAtStreetNameAndIntersection(int rowIndex) {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetType = BaseData.getGeoModuleValue("StreetType");
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			String interStreetType = BaseData.getGeoModuleValue("InterStreetType");
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Street Name", rowIndex)
					.contains(streetName + " " + streetType));
			Assert.assertTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID,
									"Intersection Street Name", rowIndex)
							.contains(interStreetName + " " + interStreetType));
		}

		public void VerifySelectAllCheckBoxUnchecked() {
			Assert.assertTrue(Boolean.parseBoolean(uIMapGeo.streetSearch.uISelectAllCheckBox.getAttribute("disabled")));
		}

		public void VerifyBatchUpdateEnabled() {
			Assert.assertTrue(uIMapGeo.streetSearch.uIBatchUpdateButton.isEnabled());
		}

		public void EnterAtPopupZipcode() {
			String zipCode = BaseData.getGeoModuleValue("ZipCode");
			uIMapGeo.streetSearch.uIPopupZipCodeEdit.sendKeys(zipCode);
			uIMapGeo.streetSearch.uIPopupZipCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtZipCode() {
			uIMapGeo.streetSearch.uIZipCodeLookupButton.click();
			popup.kPICodedLookup.kPIHelpSelect(BaseData.getGeoModuleValue("ZipCode"));
		}

		public void ClickPopupUpdateButton() {
			uIMapGeo.streetSearch.uIPopupUpdateButton.click();
		}

		public void VerifyAtZipcodeUpdateAllRecords() {
			String zipCode = BaseData.getGeoModuleValue("ZipCode");
			Playback.controlReadyThreadWait();
			List<String> CSZ = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "CSZ");
			for (String CSZValues : CSZ)
				Assert.assertTrue(CSZValues.contains(zipCode));
		}

		public void VerifyOddNumberWithDot(int rowIndex) {
			String odd = BaseData.getGeoModuleValue("Odd");
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Premise Odd", rowIndex)
					.contains(odd + "."));
		}

		public void VerifyAtCSZ(int rowIndex) {
			String csz = BaseData.getGeoModuleValue("CSZ");
			Assert.assertEquals(csz, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "CSZ", rowIndex));
		}

		public void EnterAtStreetName1() {
			String streetName = BaseData.getGeoModuleValue("StreetName1");
			uIMapGeo.streetSearch.uIStreetNameEdit.clear();
			uIMapGeo.streetSearch.uIStreetNameEdit.sendKeys(streetName);
		}

		public void VerifyAtStreetName1() {
			String streetName = BaseData.getGeoModuleValue("StreetName1");
			Playback.controlReadyThreadWait();
			Assert.assertEquals(BaseData.getGeoModuleValue("StreetName1"), objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.streetSearch.uIStreetSearchResultGrID, streetName).getText());
		}

		public void ClickAtStreetName1() {
			String streetName = BaseData.getGeoModuleValue("StreetName1");
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, streetName);
		}

		public void selectJurisAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetSearch.uIJurisComboBox, 0);
			uIMapGeo.streetSearch.uIJurisComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetSearch.uIJurisComboBox,
					BaseData.getGeoModuleValue("Juris"));
			uIMapGeo.streetSearch.uIJurisComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectAtJuris1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIJurisComboBox,
					BaseData.getGeoModuleValue("Juris1"));
			uIMapGeo.streetEntry.uIJurisComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyNoRecordsFoundAck() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");

		}

		public void reloadStreetSearch() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.reloadScreen("Street Search");
			Playback.pageLoadThreadWait();
		}

		public void selectgridCheckBoxByInterSteetName() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapGeo.streetSearch.uIStreetSearchResultGrID, BaseData.getGeoModuleValue("InterStreetName"));
		}

		public void selectRowByAtStreetName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.streetSearch.uIStreetSearchResultGrID, BaseData.getGeoModuleValue("StreetName"));
			Playback.controlReadyThreadWait();
		}

		public void clickManageIntersectionUsingStreetName() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapGeo.streetSearch.uIStreetSearchResultGrID, BaseData.getGeoModuleValue("StreetName"));
			Playback.controlReadyThreadWait();
			uIMapGeo.streetSearch.uIManageIntersectionButton.click();
			Playback.pageLoadThreadWait();
		}

		public void selectRowByAtCSZ() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.streetSearch.uIStreetSearchResultGrID, BaseData.getGeoModuleValue("CSZ"));
		}

		public void verifyAtPremiseOdd(int rowIndex) {																	// Added by Abi
			String odd = BaseData.getGeoModuleValue("Premise");
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Premise Odd", rowIndex)
					.contains(odd));
		}

		public void verifyAtPremiseEven(int rowIndex) {																	// Added by Abi
			String even = BaseData.getGeoModuleValue("Premises");
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetSearch.uIStreetSearchResultGrID, "Premise Even", rowIndex)
					.contains(even));
		}
	}

	public class StreetEntry {

		public void SelectPrefix() {
			uIMapGeo.streetEntry.uIPrefixComboBox.sendKeys("S");
		}

		public void SelectAtPrefix() {
			String prefix = BaseData.getGeoModuleValue("Prefix");
			System.out.println(prefix);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIPrefixComboBox, prefix);
		}

		public void SelectAtInterPrefix() {
			String interPrefix = BaseData.getGeoModuleValue("InterPrefix");
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIPrefixComboBox,
					interPrefix);
			// objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIPrefixComboBox,
			// BaseData.getGeoModuleValue("InterPrefix"));
		}

		public void enterAtStreetName() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			uIMapGeo.streetEntry.uIStreetNameEdit.sendKeys(streetName);
		}

		public void EnterAtInterStreetName() {
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			uIMapGeo.streetEntry.uIStreetNameEdit.sendKeys(interStreetName);
		}

		public void enterAtStreetType() {
			String streetType = BaseData.getGeoModuleValue("StreetType");
			uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys(streetType);
			uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtInterStreetType() {
			String interStreetType = BaseData.getGeoModuleValue("InterStreetType");
			uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys(interStreetType);
		}

		public void SelectAtInterSuffix() {
			String interSuffix = BaseData.getGeoModuleValue("InterSuffix");
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uISuffixComboBox,
					interSuffix);
		}

		public void EnterStreetType() {
			uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys("St");
		}

		public void EnterSpecialCharacter() {
			uIMapGeo.streetEntry.uIStreetNameEdit.sendKeys(Randomized.randomAlphanumericSpecialCharsString(5));
		}

//	public void VerifySpecialCharactersNotAllowed() {
//			verify.ExpectedValueIsTrue(uIMapGeo.streetEntry.uIStreetNameEdit.getAttribute("value") == null);
//		}

//
//		public void VerifySpecialCharacterNotAllowedInStreetName() {
//			verify.ExpectedValueIsTrue(uIMapGeo.streetEntry.uIStreetNameEdit.getAttribute("value")
//					.contains(Randomized.randomAlphanumericSpecialCharsString(10)));
//		}

		public void VerifySpecialCharactersNotAllowed() {
			verify.ExpectedValueIsTrue(
					uIMapGeo.streetEntry.uIStreetNameEdit.getAttribute("value").matches("^[a-zA-z0-9]*$"));
		}

		public void VerifySpecialCharacterNotAllowedInStreetName() {
			verify.ExpectedValueIsTrue(uIMapGeo.streetEntry.uIStreetNameEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("StreetName")));
		}

		public void SelectAtSuffix() {
			String suffix = BaseData.getGeoModuleValue("Suffix");
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uISuffixComboBox, suffix);
		}

		public void clickAddButton() {
			uIMapGeo.streetEntry.uIAddButton.click();
		}

		public void ClickSaveButton() {
			uIMapGeo.streetEntry.uISaveButton.click();
		}
		public void ClickResetButton() {
			uIMapGeo.streetEntry.uIReset.click();
		}

		public void VerifyStreetPrefix() {
			Playback.controlReadyThreadWait();
			String prefix = "N";

			Assert.assertEquals(prefix, "N", "Check the prefix value in screen");

		}

		public void VerifyAcknowlegdeSaveMessage() {
			popup.acknowledge.okWithExpectedMessage("(7) No data present");
			// uIMappopup.acknowledge.Ok();
		}

		public void VerifyAcknowledgeAddMessage() {
			popup.acknowledge.okWithExpectedMessage("(5002) Required Street Name Entry");
		}

		public void VerifyStreetNameWithPrefixSuffixAndTypeInGrid(int rowIndex) {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String suffix = BaseData.getGeoModuleValue("Suffix");
			String prefix = BaseData.getGeoModuleValue("Prefix");
			String streetType = BaseData.getGeoModuleValue("StreetType");
			Assert.assertEquals(streetName, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Street Name", rowIndex));
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Street Type", rowIndex)
					.contains(streetType));
			Assert.assertEquals(prefix, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Prefix", rowIndex));
			Assert.assertEquals(suffix, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Suffix", rowIndex));
		}

		public void VerifyInterSectionStreetNameWithPrefixSuffixAndTypeInGird(int rowIndex) {
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			String interPrefix = BaseData.getGeoModuleValue("InterPrefix");
			String interSuffix = BaseData.getGeoModuleValue("InterSuffix");
			Assert.assertEquals(interStreetName, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Street Name", rowIndex));
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Street Type", rowIndex)
					.contains(BaseData.getGeoModuleValue("InterStreetType")));
			Assert.assertEquals(interPrefix, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Prefix", rowIndex));
			Assert.assertEquals(interSuffix, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Suffix", rowIndex));
		}

		public void VerifyStatusMessage() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful", uIMapGeo.streetEntry.uIBottomLeftSideStatusBar.getText()); 
			//Assert.assertEquals("1002 - Addition Successful", uIMapGeo.streetEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void Save() {
			uIMapGeo.streetEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();

		}

		public void DeleteRowFromGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.streetEntry.uIStreetEntryResultGrid, BaseData.getGeoModuleValue("StreetName"));
		}

		public void closeStreetEntry() {
			uIMapGeo.streetEntry.driver.close();
		}

		public void VerifyConfirmSaveMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
			} else {
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
			}
		}

		public void VerifyRecordExisitStatusMessage() {
			Assert.assertEquals("1046 - Record already exists",
					uIMapGeo.streetEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void VerifyAcknowledgeRecordExistsMessage() {
			popup.acknowledge.okWithExpectedMessage("1046 - Record already exists");
		}

		public void enterAtZipCode() {
			String zipCode = BaseData.getGeoModuleValue("ZipCode");
			uIMapGeo.streetEntry.uIZipcodeEdit.sendKeys(zipCode);
			uIMapGeo.streetEntry.uIZipcodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectSuffixAsN() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uISuffixComboBox, "N");
		}

		public void SelectSuffixAsE() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uISuffixComboBox, "E");
		}

		public void VerifyAdditionSuccessfulStatusMessage() {
			Assert.assertEquals("1002 - Addition Successful", uIMapGeo.streetEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void EnterAtStreetName1() {
			String streetName = BaseData.getGeoModuleValue("StreetName1");
			uIMapGeo.streetEntry.uIStreetNameEdit.sendKeys(streetName);
		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIJurisComboBox,
					BaseData.getGeoModuleValue("Juris"));
			uIMapGeo.streetEntry.uIJurisComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyAtStreetNameInGrid(int rowIndex) {
			String streetName = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetEntry.uIStreetEntryResultGrid, "Street Name", rowIndex);
			verify.ExpectedValueIsTrue(streetName.contains(BaseData.getGeoModuleValue("StreetName")));
			Playback.controlReadyThreadWait();
		}

		public void selectAtJuris1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIJurisComboBox,
					BaseData.getGeoModuleValue("Juris1"));
			uIMapGeo.streetEntry.uIJurisComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectJurisAsBC() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIJurisComboBox,
					"BC - Brown County Sheriff");

		}

		public void enterAtStreetName(int num) {
			if (num == 0) {
				String streetName = BaseData.getGeoModuleValue("StreetName");
				uIMapGeo.streetEntry.uIStreetNameEdit.sendKeys(streetName);
			} else {
				String streetName = BaseData.getGeoModuleValue("StreetName" + num + "");
				uIMapGeo.streetEntry.uIStreetNameEdit.sendKeys(streetName);
			}
		}

		public void enterAtStreetType(int num) {
			if (num == 0) {
				String streetType = BaseData.getGeoModuleValue("StreetType");
				uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys(streetType);
				uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys(Keys.TAB);
			} else {
				String streetType = BaseData.getGeoModuleValue("StreetType" + num + "");
				uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys(streetType);
				uIMapGeo.streetEntry.uIStreetTypeEdit.sendKeys(Keys.TAB);
			}
		}

		public void verifyAtZipCodeDescription() {
			String attribute = uIMapGeo.streetEntry.uIZipCodeDescription.getAttribute("title");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getGeoModuleValue("ZipCodeDescription")));

		}

		public void saveNClose() {
			uIMapGeo.streetEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void selectAtPrefix() {
			String prefix = BaseData.getGeoModuleValue("Prefix");
			System.out.println(prefix);
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.streetEntry.uIPrefixComboBox, prefix);
		}

		public void selectPrefixAsNE() {
			uIMapGeo.streetEntry.uIPrefixComboBox.sendKeys("NE");
		}

		public void clearStreetName() {
			uIMapGeo.streetEntry.uIStreetNameEdit.clear();
		}

	}

	public class CommonNameHelp {

		public void SelectCommonName() {
			Playback.waitForPageLoad();
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapGeo.commonNameHelp.uICommonNameTable);

		}

		public void SelectCommonNameExceptNonValidAddress() {

			List<WebElement> tableRows = uIMapGeo.commonNameHelp.uICommonNameTable
					.findElements(By.xpath("//table/tbody[@class='ig_BlueThemeItem igg_BlueThemeItem']/tr"));

			WebElement randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
			List<WebElement> rowCells = randomRow.findElements(By.tagName("td"));

			WebElement interSectStreet = rowCells.get(3);
			String interSectText = interSectStreet.getText();
			;

			// which is used to find the slash in the real address cell text until it should
			// not exists.
			while (interSectText.contains("/")) {
				randomRow = tableRows.get(Randomized.getRandomNumber(tableRows.size()));
				rowCells = randomRow.findElements(By.tagName("td"));
				interSectStreet = rowCells.get(3);
				interSectText = interSectStreet.getText();
			}

			randomRow.click();
			Playback.gridLoadThreadWait();

		}

		public void VerifyAtCommonName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CommonName"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.commonNameHelp.uICommonNameTable,
							"Common Name", 1));
		}

		public void VerifyAtStreetInterStreet() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.commonNameHelp.uICommonNameTable, "Real Address", 1)
					.contains(BaseData.getGeoModuleValue("StreetName") + " " + BaseData.getGeoModuleValue("StreetType")
							+ "/" + BaseData.getGeoModuleValue("InterStreetName") + " "
							+ BaseData.getGeoModuleValue("InterStreetType")));
		}

		public void VerifyAtPincodeInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.commonNameHelp.uICommonNameTable, "Real Address", 1)
					.contains(BaseData.getGeoModuleValue("ZipCode")));
		}

		public void VerifyCSZ(String CSZ) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.commonNameHelp.uICommonNameTable, "Real Address", 2).contains(CSZ));
		}

		public void CloseCommonHelpWindow() {
			uIMapGeo.commonNameHelp.driver.close();
		}

		public void verifyAlphaRadioButtonSelected() {

			verify.ExpectedValueIsTrue(uIMapGeo.commonNameHelp.uIAlphaRadioButton.isSelected());
		}

		public void clickAtSoundEXRadiobutton() {
			uIMapGeo.commonNameHelp.uISoundEXRadioButton.click();

		}

		public void clickAtContainsRadioButton() {
			uIMapGeo.commonNameHelp.uIContainsRadioButton.click();

		}

		public void verifyGridListOutResults() {
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.commonNameHelp.uICommonNameTable);
			if (count > 0) {
				verify.ExpectedValueIsTrue(true);
			}
		}

		public void VerifyAcknowledgeNoRecordFound() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void clickAddCommonNameToGeo() {
			Playback.controlReadyThreadWait();
			uIMapGeo.commonNameHelp.uIAddCommonNameToGeoButton.click();
		}
	}

	public class CommonNames {

		public void enterAtAddress() {
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtStreetNameWithInter() {
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(
					BaseData.getGeoModuleValue("StreetName") + " " + BaseData.getGeoModuleValue("StreetType") + "/");
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void ClickSearch() {
			uIMapGeo.commonNames.uISearchButton.click();
		}

		public void ClickPrintIcon() {
			uIMapGeo.commonNames.uIPrintImageButton.click();
		}

		public void VerifyAtCommonNameFire(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("OccupancyName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNames.uICommonNameSearchTable, "Common Name", rowIndex));
		}

		public void ClickAddNew() {
			uIMapGeo.commonNames.uIAddNew.click();
		}

		public void EnterAtCommonName() {
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("CommonName"));
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void ClickAtCommonName(int rowIndex) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.commonNames.uICommonNameSearchTable, BaseData.getGeoModuleValue("CommonName"), rowIndex);
		}

		public void clickAtCommonName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.commonNames.uICommonNameSearchTable, BaseData.getGeoModuleValue("CommonName"));
		}

		public void VerifyAcknowledgeNoRecordFound() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void VerifyAtCommonName(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CommonName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNames.uICommonNameSearchTable, "Common Name", rowIndex));
		}

		public void VerifyAtAddress(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.commonNames.uICommonNameSearchTable, "Address", rowIndex)
					.contains(BaseData.getGeoModuleValue("Address")));

		}

		public void VerifyAtStreetNameAndInterSectionStreetName() {
			verify.ExpectedValueIsTrue(uIMapGeo.commonNames.uIAddressEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("StreetName")));
			verify.ExpectedValueIsTrue(uIMapGeo.commonNames.uIAddressEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("InterStreetName")));
		}

		public void VerifyInactiveCommonNameRowColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.commonNames.uICommonNameSearchTable, rowIndex).getAttribute("class")
					.contains("Grey"));
		}

		public void VerifyCommonNameRowColor(int rowIndex) {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.commonNames.uICommonNameSearchTable, rowIndex).getAttribute("class")
					.contains("Grey"));
		}

		public void enterAtCommonNameUsingSubstring() {
			uIMapGeo.commonNames.uIAddressEdit.clear();
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("CommonName").substring(0, 6));
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);

		}

		public void enterAtCommonName1() {
			uIMapGeo.commonNames.uIAddressEdit.clear();
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("CommonName1"));
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);

		}

		public void enterAtCommonName2() {
			uIMapGeo.commonNames.uIAddressEdit.clear();

			uIMapGeo.commonNames.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("CommonName2"));
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);

		}

		public void clearZipCode() {
			uIMapGeo.commonNames.uIZipCodeEdit.clear();
		}

		public void verifyAtCommonName2(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CommonName2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNames.uICommonNameSearchTable, "Common Name", rowIndex));
		}

		public void enterAtZipCode() {
			uIMapGeo.commonNames.uIZipCodeEdit.clear();
			uIMapGeo.commonNames.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
			uIMapGeo.commonNames.uIZipCodeEdit.sendKeys(Keys.TAB);

		}

		public void enterAtCommonName3() {
			uIMapGeo.commonNames.uIAddressEdit.clear();
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("CommonName3"));
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();

		}

		public void verifyAtCommonName3(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CommonName3"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNames.uICommonNameSearchTable, "Common Name", rowIndex));
		}

		public void verifyAddressBubbleInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapGeo.commonNames.uIAddressInfoIcon.isDisplayed());
		}

		public void checkTheSoundAlikeCheckBox() {
			uIMapGeo.commonNames.uISoundAlike.click();
		}

		public void selectRowInGrid(int rowIndex) {
			objectIdentification.manualIdentify.selectGridTableRow(uIMapGeo.commonNames.uICommonNameSearchTable,
					rowIndex);
		}

		public void enterAtStreetName() {
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("StreetName"));
			uIMapGeo.commonNames.uIAddressEdit.sendKeys(Keys.TAB);
		}
	}

	public class CommonNamesEntry {
		public void ClickSaveButton() {
			uIMapGeo.commonNamesEntry.uISaveButton.click();
		}
		
		public void ClickReplaceCheckBox() {
			uIMapGeo.commonNamesEntry.uIReplaceCheckBox.click();
		}

		public void ClickAddButton() {
			uIMapGeo.commonNamesEntry.uIAddButton.click();
			Playback.gridLoadThreadWait();
		}

		public void enterAtAddressWithPrimise() {
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Premise") + " "
					+ BaseData.getGeoModuleValue("StreetName") + "," + BaseData.getGeoModuleValue("Apartment"));
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void enterAtAddress() {
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtStreetDetails() {
			Playback.controlReadyThreadWait();
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Premise") + " "
					+ BaseData.getGeoModuleValue("StreetName") + " " + BaseData.getGeoModuleValue("StreetType"));
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCommonName() {
			Playback.controlReadyThreadWait();
			uIMapGeo.commonNamesEntry.uICommonNameEdit.sendKeys(BaseData.getGeoModuleValue("CommonName"));
			uIMapGeo.commonNamesEntry.uICommonNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtSortOrder() {
			uIMapGeo.commonNamesEntry.uISortOrderEdit.sendKeys(BaseData.getGeoModuleValue("SortOrder"));
		}

		public void EnterAtSortOrderManual() {
			uIMapGeo.commonNamesEntry.uISortOrderEdit.sendKeys("2");
		}

		public void EnterAtCommonName1() {
			uIMapGeo.commonNamesEntry.uICommonNameEdit.sendKeys(BaseData.getGeoModuleValue("CommonName1"));
		}

		public void EnterAtSortOrder1() {
			uIMapGeo.commonNamesEntry.uISortOrderEdit.sendKeys(BaseData.getGeoModuleValue("SortOrder1"));
		}

		public void CloseScreen() {
			uIMapGeo.commonNamesEntry.driver.close();
			Playback.pageLoadThreadWait();
		}

		public void EnterAtStreetNameWithIntersectionSlash() {
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(
					BaseData.getGeoModuleValue("StreetName") + " " + BaseData.getGeoModuleValue("StreetType") + "/");
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void SaveScreen() {
			uIMapGeo.commonNamesEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void ClearInactiveDate() {
			uIMapGeo.commonNamesEntry.uIInactiveDateEdit.click();
			uIMapGeo.commonNamesEntry.uIInactiveDateEdit.clear();
		}

		public void ClickAtCommonName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, BaseData.getGeoModuleValue("CommonName"));
		}

		public void ClickAtCommonName1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, BaseData.getGeoModuleValue("CommonName1"));
		}

		public void UpdateSortOrderAs2() {
			uIMapGeo.commonNamesEntry.uISortOrderEdit.clear();
			uIMapGeo.commonNamesEntry.uISortOrderEdit.sendKeys("2");
		}

		public void EnterSortOrder() {
			uIMapGeo.commonNamesEntry.uISortOrderEdit.sendKeys(Randomized.randomNumberString(1));
		}

		public void UpdateSortOrderAs0() {
			uIMapGeo.commonNamesEntry.uISortOrderEdit.clear();
			uIMapGeo.commonNamesEntry.uISortOrderEdit.sendKeys("0");
		}

		public void VerifyAcknowlegdeSortOrderMessage() {
			popup.acknowledge.okWithExpectedMessage(
					"(5055) Set the sort order to 0 for any one common name to set that as the primary common name");
		}

		public void VerifyAcknowlegdeMessageRequiredEntriesAreMissing() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void VerifyAcknowledgeMessageEnterCommonName() {
			popup.acknowledge.okWithExpectedMessage("(5011) Enter Common Name");
		}

		public void VerifyAtCommonNameExist(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CommonName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, "Common Name", rowIndex));
		}

		public void VerifyAtCommonName1AndSortOrderExist(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CommonName1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, "Common Name", rowIndex));
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("SortOrder1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, "SO", rowIndex));
		}

		public void DeleteAtCommonNameRow(int rowIndex) {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, BaseData.getGeoModuleValue("CommonName"),
					rowIndex);
		}

		public void DeleteAtCommonNameRow() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, BaseData.getGeoModuleValue("CommonName"));
		}

		public void VerifyConfirmationDeleteMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void VerifyRowsNotExits() {
			Playback.gridLoadThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable) == 0);
		}

		public void VerifyAtStreetAndInterSectionStreet() {
			verify.ExpectedValueIsTrue(uIMapGeo.commonNamesEntry.uIAddressEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("StreetName")));
			verify.ExpectedValueIsTrue(uIMapGeo.commonNamesEntry.uIAddressEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("InterStreetName")));
		}

		public void VerifySortOrderAs2(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("2", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, "SO", rowIndex));
		}

		public void VerifySortOrderAs0(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("0", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, "SO", rowIndex));
		}

		public void VerifyInactiveCommonNameRowColor(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, rowIndex)
					.getAttribute("class").contains("Grey"));
		}

		public void VerifyAtInactiveDateInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("InactiveDate"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, "Inactive Date", rowIndex));
		}
		
		public void VerifyAtCommonNameInGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("CommonName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.commonNamesEntry.uICommonNameEntryResultTable, "Common Name", rowIndex));
		}

		public void VerifyAtInactiveDate() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("InactiveDate"),
					uIMapGeo.commonNamesEntry.uIInactiveDateEdit.getAttribute("value"));
		}

		public void SaveAndClose() {
			uIMapGeo.commonNamesEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void enterAtCommonName4() {
			uIMapGeo.commonNamesEntry.uICommonNameEdit.sendKeys(BaseData.getGeoModuleValue("CommonName4"));
			uIMapGeo.commonNamesEntry.uICommonNameEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void enterAtCommonName3() {
			uIMapGeo.commonNamesEntry.uICommonNameEdit.sendKeys(BaseData.getGeoModuleValue("CommonName3"));
			uIMapGeo.commonNamesEntry.uICommonNameEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();

		}

		public void enterAtAddress1() {
			uIMapGeo.commonNamesEntry.uIAddressEdit.clear();
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address1"));
			uIMapGeo.commonNamesEntry.uIAddressEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void clearCommonName() {
			uIMapGeo.commonNamesEntry.uICommonNameEdit.clear();
		}

		public void verifyAdditionSuccessfulStatusMessage() {																					// Added by Abi
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful", uIMapGeo.apartmentEntry.uIBottomLeftSideStatusBar.getText()); 
		}

		public void clickRefreshButton() {																										// Added by Abi
			uIMapGeo.commonNamesEntry.uIRefreshButton.click();
		}

		public void verifyUpdateSuccessfulStatusMessage() {																						// Added by Abi
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", uIMapGeo.apartmentEntry.uIBottomLeftSideStatusBar.getText()); 
		}

	}

	public class AddressSearchHelp {
		public AddressSearchHelpMapTab addressSearchHelpMapTab;
		public AddressSearchHelpDetailsTab addressSearchHelpDetailsTab;
		public AddressSearchHelpContactTab addressSearchHelpContactTab;
		public AddressSearchHelpFlagsTab addressSearchHelpFlagsTab;
		public AddressSearchHelpCommonNameTab addressSearchHelpCommonNameTab;

		public AddressSearchHelp() {
			if (this.addressSearchHelpMapTab == null)
				this.addressSearchHelpMapTab = new AddressSearchHelpMapTab();

			if (this.addressSearchHelpDetailsTab == null)
				this.addressSearchHelpDetailsTab = new AddressSearchHelpDetailsTab();

			if (this.addressSearchHelpContactTab == null)
				this.addressSearchHelpContactTab = new AddressSearchHelpContactTab();

			if (this.addressSearchHelpFlagsTab == null)
				this.addressSearchHelpFlagsTab = new AddressSearchHelpFlagsTab();

			if (this.addressSearchHelpCommonNameTab == null)
				this.addressSearchHelpCommonNameTab = new AddressSearchHelpCommonNameTab();
		}

		public void VerifyAddressInfoIconColor() {
			verify.ExpectedValueIsTrue(
					uIMapGeo.addressSearchHelp.uIAddressDetailsInfoButton.getAttribute("src").contains("Red"));
		}

		public void CloseAddressSearchScreen() {
			uIMapGeo.addressSearchHelp.driver.close();
		}

		public void SwitchToMapTab() {
			uIMapGeo.addressSearchHelp.uIMapTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("GHydrantMap");
		}

		public void SwitchToDetailsTab() {
			uIMapGeo.addressSearchHelp.uIDetailsTab.click();
			Playback.gridLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmDetails");
		}

		public void switchToContactsTab() {
			uIMapGeo.addressSearchHelp.uIContactsTab.click();
			Playback.popupThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmContactNew");
		}

		public void switchToFlagsTab() {
			uIMapGeo.addressSearchHelp.uIFlagsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmAddrInfoFlags.aspx");

		}

		public void switchToCommonNameTab() {
			uIMapGeo.addressSearchHelp.uICommonNameTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmCommonNameSrch.aspx");

		}

	}

	public class AddressSearchHelpMapTab {
		public void GetLatLongvalue(String getLatLongvalue) // out
		{
			Playback.testContext.setAttribute("getLatLongvalue",
					uIMapGeo.addressSearchHelp.addressSearchHelpMapTab.uILatLongValueTextView.getText());
		}

		public void VerifyAtLatitudeLongitude() {
			// String drdf = BaseData.getGeoModuleValue("Latitude") + " / " +
			// BaseData.getGeoModuleValue("Longitude").Remove(6, 12);
			// verify.ExpectedValueIsTrue(uIMapGeo.addressSearchHelp.addressSearchHelpMapTab.uILatLongValueTextView.getText().contains(
			// BaseData.getGeoModuleValue("Latitude") + " / " +
			// BaseData.getGeoModuleValue("Longitude").Remove(6,12)));
		}

		public void ClickUpdateLatLangButton() {
			uIMapGeo.addressSearchHelp.addressSearchHelpMapTab.uIUpdateLatLongButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyLatLongUpdateConfirmMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm
						.yesWithExpectedMessage("(5122) Do you want to update Lat/Long into all transaction tables?");
			} else
				popup.confirm
						.yesWithExpectedMessage("(5122) Do you want to update Lat/Long into all transaction tables?");
		}

		public void VerifyUpdateLatLongValueConfirmMessage() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			if (Playback.browserType.contains("Chrome")) {
				String warningMessage = Playback.driver.switchTo().alert().getText();
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(5102) Are you sure you want to update the Latitude and Longitude"));
				popup.confirm.yes();
			} else {
				String ConfirmMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(
						ConfirmMessage.contains("(5102) Are you sure you want to update the Latitude and Longitude"));
				popup.confirm.yes();
			}
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickReset() {
			uIMapGeo.addressSearchHelp.addressSearchHelpMapTab.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyLatlongUpdatedSuccessfullyAcknowledge() {
			Playback.threadWait(3000);
			popup.acknowledge.okWithExpectedMessage(
					"(5123) Lat/Long has been successfully updated into all transaction tables.");
		}

		public void VerifyAtLatitudeLongitudeNJ() {
			// String drdf = BaseData.getGeoModuleValue("Latitude").Remove(15, 2) + " / " +
			// BaseData.getGeoModuleValue("Longitude").Remove(6, 12);
			// verify.ExpectedValueIsTrue(uIMapGeo.addressSearchHelp.addressSearchHelpMapTab.uILatLongValueTextView.getText().contains(
			// BaseData.getGeoModuleValue("Latitude").Remove(15,2) + " / " +
			// BaseData.getGeoModuleValue("Longitude").Remove(6, 12)));
		}

		public String readLatLong() {
			String attribute = uIMapGeo.addressSearchHelp.addressSearchHelpMapTab.uILatLongValueTextView.getText();
			return attribute;
		}
	}

	public class AddressSearchHelpDetailsTab {
		public void SaveTab() {
			uIMapGeo.addressSearchHelp.addressSearchHelpDetailsTab.uISaveButton.click();
			// popup.Confirm.yes(); //No confirm window
		}

		public void EnterAtLatitude() {
			uIMapGeo.addressSearchHelp.addressSearchHelpDetailsTab.uILatitudeEdit.clear();
			uIMapGeo.addressSearchHelp.addressSearchHelpDetailsTab.uILatitudeEdit
					.sendKeys(BaseData.getGeoModuleValue("Latitude"));
		}

		public void EnterAtLongitude() {
			uIMapGeo.addressSearchHelp.addressSearchHelpDetailsTab.uILongitudeEdit.clear();
			uIMapGeo.addressSearchHelp.addressSearchHelpDetailsTab.uILongitudeEdit
					.sendKeys(BaseData.getGeoModuleValue("Longitude"));
		}
	}

	public class AddressSearchHelpContactTab {

		public void clickAddNewButton() {
			uIMapGeo.addressSearchHelp.addressSearchHelpContactTab.uIAddNewButton.click();
		}

		public void verifyAddNewButtonIsDisabled() {
			String attribute = uIMapGeo.addressSearchHelp.addressSearchHelpContactTab.uIAddNewButton
					.getAttribute("disabled");
			verify.ExpectedValueIsTrue(attribute.contains("true"));

		}

	}

	public class AddressSearchHelpFlagsTab {

		public void verifyAddFlagsButtonIsDisabled() {
			String attribute = uIMapGeo.addressSearchHelp.addressSearchHelpFlagsTab.uIAddFlagsButton
					.getAttribute("disabled");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("true"));

		}

	}

	public class AddressSearchHelpCommonNameTab {

		public void verifyAddCommonNamesButtonIsDisabled() {
			String attribute = uIMapGeo.addressSearchHelp.addressSearchHelpCommonNameTab.uIAddCommonNameButton
					.getAttribute("disabled");
			verify.ExpectedValueIsTrue(attribute.contains("true"));

		}
	}

	public class AddressSearch {
		public AddressSearchMapTab addressSearchMapTab = null;
		public AddressSearchFlagsTab addressSearchFlagsTab = null;
		public AddressSearchContactTab addressSearchContactTab = null;
		public AddressSearchActivitiesTab addressSearchActivitiesTab = null;
		public MergeAddressPopup mergeAddressPopup = null;
		public AddressSearchNamesTab addressSearchNamesTab = null;
		public AddressSearchCommonNameTab addressSearchCommonNameTab = null;
		public AddressSearchDetailsTab addressSearchDetailsTab = null;
		public AttachmentsTab attachmentsTab = null;

		public AddressSearchHazMatTab addressSearchHazMatTab = null;

		public AddressSearch() {
			if (this.addressSearchMapTab == null)
				// objectIdentification.windowHandle.switchToFrame("Home/GHydrantMapHERE.aspx");
				this.addressSearchMapTab = new AddressSearchMapTab();

			if (this.addressSearchFlagsTab == null)
				this.addressSearchFlagsTab = new AddressSearchFlagsTab();

			if (this.addressSearchContactTab == null)
				this.addressSearchContactTab = new AddressSearchContactTab();

			if (this.addressSearchActivitiesTab == null)
				this.addressSearchActivitiesTab = new AddressSearchActivitiesTab();

			if (this.mergeAddressPopup == null)
				this.mergeAddressPopup = new MergeAddressPopup();

			if (this.addressSearchNamesTab == null)
				this.addressSearchNamesTab = new AddressSearchNamesTab();

			if (this.addressSearchCommonNameTab == null)
				this.addressSearchCommonNameTab = new AddressSearchCommonNameTab();

			if (this.addressSearchDetailsTab == null)
				this.addressSearchDetailsTab = new AddressSearchDetailsTab();

			if ((this.attachmentsTab == null))
				this.attachmentsTab = objectIdentification.new AttachmentsTab();

			if ((this.addressSearchHazMatTab == null))
				this.addressSearchHazMatTab = new AddressSearchHazMatTab();

		}

		public void switchToNamesTab() {
			uIMapGeo.addressSearch.uINamesTab.click();
			Playback.popupThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameRelAddr");
			Playback.controlReadyThreadWait();
		}

		public void switchToContactsTab() {
			uIMapGeo.addressSearch.uIContactsTab.click();
			Playback.popupThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmContactNew");
		}

		public void ClickToHereMapTab() {
			Playback.pageLoadThreadWait();
			uIMapGeo.addressSearch.uIMapTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("Home/GHydrantMapHERE.aspx");
			// objectIdentification.windowHandle.switchToFrame("Home/GHydrantMapESRI.aspx");
			// objectIdentification.windowHandle.switchToFrame("Address Search",
			// "Home/GHydrantMap.aspx");

		}

		public void ClickToMapTab() { // Created By Abi
			Playback.pageLoadThreadWait();
			uIMapGeo.addressSearch.uIMapTab.click();
			Playback.pageLoadThreadWait();
			// objectIdentification.windowHandle.switchToFrame("Home/GHydrantMap.aspx");
			// //commented by Abi
			// objectIdentification.windowHandle.switchToFrame("Home/GHydrantMapESRI.aspx");
			// objectIdentification.windowHandle.switchToFrame("Address Search",
			// "Home/GHydrantMap.aspx");
			// Playback.pageLoadThreadWait();
		}

		public void clickMapTabForESRIMap() {
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			uIMapGeo.addressSearch.uIMapTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("Home/GHydrantMapESRI.aspx");
		}

		public void ResetAddress() {
			uIMapGeo.addressSearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPhoneNumber() {
			String phoneNumber = BaseData.getGeoModuleValue("PhoneNumber");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(phoneNumber);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.popupThreadWait();
		}

		public void EnterAtAltPhoneNumber() {
			String altPhoneNumber = BaseData.getGeoModuleValue("AltPhoneNumber");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(altPhoneNumber);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
		}

		public void enterAtAddress()//
		{
			String address = BaseData.getGeoModuleValue("Address");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(address);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void EnterAddress(String address) {
			uIMapGeo.addressSearch.uIAddressLocationEdit.click();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(address);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void EnterAddress() {

			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Randomized.randomAlphanumeric(10));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtCommonName() {
			String commonName = BaseData.getGeoModuleValue("CommonName");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(commonName);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterCommonName() {
			String commonName = BaseData.getGeoModuleValue("CommonName");
			uIMapGeo.addressSearch.uIAddressLocationEdit.click();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(commonName);
			// uIMapGeo.uIMapGeo.addressSearch.uIAddressLocationEdit.SendKeys("s");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtCommonName1() {
			String commonName1 = BaseData.getGeoModuleValue("CommonName1");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(commonName1);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void ClickClearButton() {
			uIMapGeo.addressSearch.uIResetButton.click();
		}

		public void EnterAtPremiseWithAlterStreetName() {
			String premise = BaseData.getGeoModuleValue("Premise");
			String alterStreetName = BaseData.getGeoModuleValue("AlterStreetName");
			String alterStreetType = BaseData.getGeoModuleValue("AlterStreetType");
			uIMapGeo.addressSearch.uIAddressLocationEdit
					.sendKeys(premise + " " + alterStreetName + " " + alterStreetType);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtStreetNameAndTypeWithIntersectionSlashCharacter() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetType = BaseData.getGeoModuleValue("StreetType");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(streetName + " " + streetType + "/");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtInterIntersectionStreetNameAndTypeWithSlashCharacter() {
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			String interStreetType = BaseData.getGeoModuleValue("InterStreetType");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(interStreetName + " " + interStreetType + "/");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtOddEvenStreetNameWithPrefix() {
			String oddEven = BaseData.getGeoModuleValue("OddEven").substring(0, 1);
			String prefix = BaseData.getGeoModuleValue("Prefix");
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetType = BaseData.getGeoModuleValue("StreetType");
			uIMapGeo.addressSearch.uIAddressLocationEdit
					.sendKeys(oddEven + " " + prefix + " " + streetName + " " + streetType);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtOddEvenStreetName() {
			String oddEven = BaseData.getGeoModuleValue("OddEven").substring(0, 1);
			// String prefix = BaseData.getGeoModuleValue("Prefix");
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetType = BaseData.getGeoModuleValue("StreetType");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(oddEven + " " + streetName + " " + streetType);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtStreetNameandInterStreetName() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetType = BaseData.getGeoModuleValue("StreetType");
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			String interStreetType = BaseData.getGeoModuleValue("InterStreetType");
			uIMapGeo.addressSearch.uIAddressLocationEdit.click();
			uIMapGeo.addressSearch.uIAddressLocationEdit
					.sendKeys(streetName + " " + streetType + "/" + interStreetName + " " + interStreetType);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void ClickWeatherButton() {
			uIMapGeo.addressSearch.uIWeatherButton.click();
			Playback.popupThreadWait();

		}

		public void ClickAllTabs() {
			Playback.pageLoadThreadWait();
			uIMapGeo.addressSearch.uIFlagsTab.click();
			uIMapGeo.addressSearch.uICommonNameTab.click();
			uIMapGeo.addressSearch.uIAttachmentsTab.click();
			// uIMapGeo.uIMapGeo.addressSearch.uIContactsTab.Click();
			uIMapGeo.addressSearch.uIMapTab.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void clickMapTab() {
			uIMapGeo.addressSearch.uIMapTab.click();
		}

		public void ClickActivitiesTab() {
			uIMapGeo.addressSearch.uIActivitiesTab.click();
		}

		public void ClickCommonNameTab() {
			uIMapGeo.addressSearch.uICommonNameTab.click();
		}

		public void SwitchToActivitiesTab() {
			uIMapGeo.addressSearch.uIActivitiesTab.click();
			objectIdentification.windowHandle.switchToFrame("frmActivityLogInquiry");
			Playback.controlReadyThreadWait();
		}

		public void ClickToFlagTab() {
			uIMapGeo.addressSearch.uIFlagsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmAddrInfoFlags.aspx");
			// objectIdentification.windowHandle.switchToFrame(uIMapGeo.addressSearch.addressSearchFlagsTab.uIMapGeo.addressSearch.addressSearchFlagsTab.uIAddressSearchFlagsTabIframe);
			Playback.controlReadyThreadWait();
		}

		public void ClickAtParaIDNameButton() {
			uIMapGeo.addressSearch.uIParaIDNameButton.click();
		}

		public void VerifyConfirmGeoFly() { // commented by Abi

			Playback.controlReadyThreadWait();
			popup.confirm.yesWithExpectedMessage(
					"(5100) The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
//			if (Playback.browserType.contains("Chrome")) {
//				popup.confirm.yesWithExpectedMessage(
//						"(5100) The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
//			} else
//				popup.confirm.yesWithExpectedMessage(
//						"(5100) The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
		}

		public void VerifyAtParaIDButtonExist() {
			String name = BaseData.getGeoModuleValue("Name");
			Assert.assertEquals(name, uIMapGeo.addressSearch.uIParaIDNameButton.getAttribute("value"));
		}

		public void VerifyAcknowledgeInactiveAddress() {
			popup.acknowledge.okWithExpectedMessage("(5097) This address is inactive");
		}

		public void verifyAcknowledgePremiseInactiveAddress() {
			popup.acknowledge.okWithExpectedMessage("(5095) Premise is inactive");
		}

		public void VerifyAtOddEvenStreet() {
			String oddEven = BaseData.getGeoModuleValue("OddEven").substring(0, 1);
			String prefix = BaseData.getGeoModuleValue("Prefix");
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetType = BaseData.getGeoModuleValue("StreetType");
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value")
					.contains(oddEven + " " + prefix + " " + streetName + " " + streetType));
		}

		public void VerifyAtAddresseAndApartment() {
			String address = BaseData.getGeoModuleValue("Address");
			String apartmentFrom = BaseData.getGeoModuleValue("ApartmentFrom");
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(address));
			Assert.assertTrue(
					uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(apartmentFrom));
		}

		public void VerifyAtAddressWithSplitApartment() {
			String address = BaseData.getGeoModuleValue("Address");
			String splitTo = BaseData.getGeoModuleValue("SplitTo");
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(address));
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(splitTo));
		}

		public void VerifyAtCommonName() {
			String commonName = BaseData.getGeoModuleValue("CommonName");
			Playback.popupThreadWait();
			Assert.assertTrue(uIMapGeo.addressSearch.uICommonNameTextView.getText().contains(commonName));
		}

		public void VerifyAtCommonName1() {
			String commonName1 = BaseData.getGeoModuleValue("CommonName1");
			Playback.popupThreadWait();
			Assert.assertTrue(uIMapGeo.addressSearch.uICommonNameTextView.getText().contains(commonName1));
		}

		public void VerifyAtAltStreetName() {
			String alterStreetName = BaseData.getGeoModuleValue("AlterStreetName");
			Playback.popupThreadWait();
			Assert.assertTrue(uIMapGeo.addressSearch.uIAltStreetTextView.getText().contains(alterStreetName));
		}

		public void VerifyStreetNameWithApartment() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String apartment = BaseData.getGeoModuleValue("Apartment");
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(streetName));
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(apartment));
		}

		public void VerifyAtIntersectionAddressByStreetName() {
			String intersectionAddressByStreetName = BaseData.getGeoModuleValue("IntersectionAddressByStreetName");
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value")
					.contains(intersectionAddressByStreetName));
		}

		public void VerifyAtIntersectionAddressByIntersectionStreetName() {
			String intersectionAddressByIntersectionStreetName = BaseData
					.getGeoModuleValue("IntersectionAddressByIntersectionStreetName");
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value")
					.contains(intersectionAddressByIntersectionStreetName));
		}

		public void VerifyAtStreetNameAndIntersectionStreetName() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String interStreetName = BaseData.getGeoModuleValue("InterStreetName");
			Playback.popupThreadWait();
			Playback.popupThreadWait();
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(streetName));
			Assert.assertTrue(
					uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(interStreetName));
		}

		public void VerifyAtAddress() {
			String address = BaseData.getGeoModuleValue("Address");
			Playback.controlReadyThreadWait();
			System.out.println(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value"));
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(address));
		}

		public void verifyAtAddressBubble() {
			Playback.controlReadyThreadWait();
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressBubble.isDisplayed());
		}

		public void VerifyAtCSZ() {
			String csz = BaseData.getGeoModuleValue("CSZ");
			Assert.assertEquals(csz, uIMapGeo.addressSearch.uICSZTextView.getText());
		}

		public void VerifyCSZ(String City, String State, String ZipCode) {
			// String ko = City.substring(0, 7);
			Assert.assertEquals(City.substring(0, 7), uIMapGeo.addressSearch.uICSZTextView.getAttribute("value"));
			Assert.assertEquals(State.substring(8, 10), uIMapGeo.addressSearch.uICSZTextView.getAttribute("value"));
			Assert.assertEquals(ZipCode.substring(11), uIMapGeo.addressSearch.uICSZTextView.getAttribute("value"));
		}

		public void clickMergeAddressButton() {
			uIMapGeo.addressSearch.uIMergeAddressButton.click();
			Playback.pageLoadThreadWait();
		}

		public void CloseScreen() {
			uIMapGeo.addressSearch.driver.close();
		}

		public void VerifyMapTabColorRed() {
			Playback.pageLoadThreadWait();
			Assert.assertTrue(uIMapGeo.addressSearch.uIMapTab.getAttribute("class").contains("clrRed"));
		}

		public void ClickAddressButton() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIaddressButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtAlarmNo() {
			String alarmNo = BaseData.getGeoModuleValue("AlarmNo");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(alarmNo);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void EnterAtAddressWithApartmentFrom1() {
			String address = BaseData.getGeoModuleValue("Address");
			String apartmentFrom1 = BaseData.getGeoModuleValue("ApartmentFrom1");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(address + "," + apartmentFrom1);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void EnterAtAddressWithApartmentFrom() { // Added by Abi
			String address = BaseData.getGeoModuleValue("Address");
			String apartmentFrom1 = BaseData.getGeoModuleValue("ApartmentFrom");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(address + "," + apartmentFrom1);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void EnterAtAddressWithInvalidApartmentFrom() {
			String address = BaseData.getGeoModuleValue("Address");
			String apartmentFrom = BaseData.getGeoModuleValue("InvalidApartmentFrom"); // changed by Abi
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(address + "," + apartmentFrom);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void VerifyNoConfirmGeoFly() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.noWithExpectedMessage(
						"(5100) The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
			} else
				popup.confirm.noWithExpectedMessage(
						"(5100) The entered address is not found in the RMS Geo database. Click Yes to add this as a new address, or click No to correct the entered address.");
		}

		public void EnterAtStreetNameWithSlashCharacter() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(streetName + "/");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtStreetName1WithSlashCharacter() {
			String streetName1 = BaseData.getGeoModuleValue("StreetName1");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(streetName1 + "/");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void SwitchToCommonNameTab() {
			uIMapGeo.addressSearch.uICommonNameTab.click();
			objectIdentification.windowHandle.switchToFrame("frmCommonNameSrch");
			Playback.controlReadyThreadWait();
		}

		public void EnterAtStreetNameAndStreetName1WithSlashCharacter() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetName1 = BaseData.getGeoModuleValue("StreetName1");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(streetName + "/" + streetName1);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void EnterAtStreetName1AndStreetNameWithSlashCharacter() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			String streetName1 = BaseData.getGeoModuleValue("StreetName1");
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(streetName1 + "/" + streetName);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void VerifyAtAddress1() {
			String address1 = BaseData.getGeoModuleValue("Address1");
			Playback.controlReadyThreadWait();
			Assert.assertTrue(uIMapGeo.addressSearch.uIAddressLocationEdit.getAttribute("value").contains(address1));
		}

		public void verifyFlagTabTextAsBold() {

			String fontColor = uIMapGeo.addressSearch.uIFlagsTab.getCssValue("font-weight");
			verify.ExpectedValueIsTrue(fontColor.contains("700"));
		}

		public void reloadAddressSearch() {
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("Address Search", "Reload Tab");
		}

		public void verifyFlagTabTextAsNormal() {
			String fontColor = uIMapGeo.addressSearch.uIFlagsTab.getCssValue("font-weight");
			verify.ExpectedValueIsTrue(fontColor.contains("400"));
		}

		public void ClickToDetailsTab() {
			Playback.pageLoadThreadWait();
			uIMapGeo.addressSearch.uIDetailsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("GEO/frmDetails.aspx");

		}

		public void verifyFlagsTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIFlagsTab.isDisplayed());

		}

		public void verifyCommonNameTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uICommonNameTab.isDisplayed());
		}

		public void verifyAttachmentsTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIAttachmentsTab.isDisplayed());
		}

		public void verifyContactsTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIContactsTab.isDisplayed());
		}

		public void verifyDetailsTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIDetailsTab.isDisplayed());
		}

		public void verifyNotificationTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uINotificationTab.isDisplayed());
		}

		public void verifyMapTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIMapTab.isDisplayed());
		}

		public void verifyActivitiesTabIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIActivitiesTab.isDisplayed());
		}

		public void enterAtAddress1() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("Address1"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtAddress2() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("Address2"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtAddress3() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("Address3"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtIntersectionAddress() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("IntersectionAddress"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtIntStreet() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("IntStreet"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtAddress4() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("Address4"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtAddress5() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("Address5"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtAddress6() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("Address6"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void verifyAtAddressBubbleDisplayed() {
			String bbl = uIMapGeo.addressSearch.uIAddressBubble.getAttribute("src");
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(bbl.contains("debug") || bbl.contains("Red") || bbl.contains("Yellow"));
		}

		public void VerifyAcknowledgeInactiveIntersection() {
			popup.acknowledge.okWithExpectedMessage("(5096) Intersection is inactive");
		}

		public void clickPrintButton() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIPrintIconButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();

		}

		public void verifyAddressButtonInActive() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(uIMapGeo.addressSearch.uIaddressButton.isEnabled());
			Playback.controlReadyThreadWait();
		}

		public void verifyAddressButtonIsDisabled() {
			String attribute = uIMapGeo.addressSearch.uIaddressButton.getAttribute("disabled");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("true"));

		}

		public void clearAddress() {
			uIMapGeo.addressSearch.uIAddressLocationEdit.clear();
		}

		public void enterAtAddressWithInvalidPremise() {

			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("InvalidAddress"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();

		}

		public void enterAtAddress1WithOutApartmentNo() {
			uIMapGeo.addressSearch.uIAddressLocationEdit.clear();
			String address1 = BaseData.getGeoModuleValue("Address1WithOutApartmentNo");
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(address1);
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
		}

		public void switchToAttachmentTab() {
			uIMapGeo.addressSearch.uIAttachmentsTab.click();
			Playback.threadWait(3000);
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
			Playback.waitForPageLoad();
		}

		public void VerifyAtAddressBubbleNotDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIAddressBubble.getAttribute("src").contains("remove"));
		}

		public void enterAtIntersectionStreet() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(BaseData.getGeoModuleValue("IntersectionStreet"));
			uIMapGeo.addressSearch.uIAddressLocationEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void switchToHazMatTab() { // added by Abi
			uIMapGeo.addressSearch.uIHazMatTab.click();
		}

		public class AddressSearchHazMatTab { // added by Abi

			public void verifyAtAddress() {
				String address = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapGeo.addressSearch.addressSearchHazMatTab.uIHazMatTable, "Location", 0);
				verify.ExpectedPropertyValueIsEqual(address, BaseData.getGeoModuleValue("Address"));
			}

		}

		public class AddressSearchMapTab {

			public void GetLatLongvalue(String getLatLongvalue) {
				getLatLongvalue = uIMapGeo.addressSearch.addressSearchMapTab.uILatLongValueTextView.getText();
				Playback.setTestContextAttribute("getLatLongvalue", getLatLongvalue);
			}

			public void ClickUpdateButton() {
				uIMapGeo.addressSearch.addressSearchMapTab.uILatLongButton.click();
			}

			public void VerifyUpdateConfirmMessage() {

				if (Playback.browserType.contains("Chrome")) {
					Playback.controlReadyThreadWait();
					popup.confirm.yesWithExpectedMessage(
							"(5102) Are you sure you want to update the Latitude and Longitude");
				}
//			else {
//				String htmlErrorInfo = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();
//				Assert.assertTrue(
//						htmlErrorInfo.contains("(5102) Are you sure you want to update the Latitude and Longitude"));
//				popup.confirm.yes();
//				Playback.controlReadyThreadWait();
//			}
			}

			public void DragandDropMapLocationIcon() {
				Actions Action = new Actions(Playback.driver);
				Action.dragAndDropBy(uIMapGeo.addressSearch.addressSearchMapTab.uIMapLocationIconButton, 825, 50)
						.click().perform();
				Action = null;
				Playback.popupThreadWait();
			}

			public void VerifyUpdateTableConfirmMessage() {
				Playback.controlReadyThreadWait();
				popup.confirm
						.yesWithExpectedMessage("(5122) Do you want to update Lat/Long into all transaction tables?");
//			if (Playback.browserType.equals("Chrome")) {
//				popup.confirm.yes();
//				Playback.controlReadyThreadWait();
//			} else {
//				String htmlErrorInfo = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();
//				Assert.assertTrue(
//						htmlErrorInfo.contains("(5122) Do you want to update Lat/Long into all transaction tables?"));
//				popup.confirm.yes();
//				Playback.controlReadyThreadWait();
//			}
			}

			public void VerifyUpdateAcknowledgeMessage() {
				Playback.controlReadyThreadWait();
				Playback.controlReadyThreadWait();
				popup.acknowledge.okWithExpectedMessage(
						"(5123) Lat/Long has been successfully updated into all transaction tables.");

			}

			public void SelectOverLay() {
				uIMapGeo.addressSearch.addressSearchMapTab.uISelectOverlayInputComboBox.click();
				objectIdentification.randomIdentify.selectRadControlDropDownValueSelect(
						uIMapGeo.addressSearch.addressSearchMapTab.uISelectOverlayComboBox);
				objectIdentification.randomIdentify.selectRadControlDropDownValueSelect(
						uIMapGeo.addressSearch.addressSearchMapTab.uISelectOverlayComboBox);
				uIMapGeo.addressSearch.addressSearchMapTab.uISelectOverlayInputComboBox.sendKeys(Keys.TAB);
			}

			public void ClickResetButton() {
				uIMapGeo.addressSearch.addressSearchMapTab.uIResetButton.click();
				Playback.controlReadyThreadWait();
			}

			public void EnterAtLocation() {
				String location = BaseData.getGeoModuleValue("Location");
				uIMapGeo.addressSearch.addressSearchMapTab.uILocationSearchEdit.sendKeys(location);
				uIMapGeo.addressSearch.addressSearchMapTab.uILocationSearchEdit.sendKeys(Keys.TAB);
			}

			public void switchToGoogleMapTab() { // Created By Abi
				Playback.pageLoadThreadWait();
				objectIdentification.windowHandle
						.switchToFrame(uIMapGeo.addressSearch.addressSearchMapTab.uIAddressSearchGoogleMapTabIframe);
				Playback.popupThreadWait();
			}

			public void switchToHereMapTab() {
				Playback.pageLoadThreadWait();
				objectIdentification.windowHandle
						.switchToFrame(uIMapGeo.addressSearch.addressSearchMapTab.uIAddressSearchHereMapTabIframe);
				Playback.popupThreadWait();
			}

			public void switchToFlagTab() {
				objectIdentification.windowHandle.switchToFrame("GEO/frmAddrInfoFlags.aspx");
				// objectIdentification.windowHandle.switchToFrame(uIMapGeo.addressSearch.addressSearchFlagsTab.uIAddressSearchFlagsTabIframe);
				Playback.controlReadyThreadWait();
			}

			public void verifyLatLongValue(String LatituteLongitute) {

				String latlongvalue = uIMapGeo.addressSearch.addressSearchMapTab.uILatLongValueTextView.getText();
				/*
				 * System.out.println(latlongvalue); String lat = latlongvalue.substring(0, 10);
				 * System.out.println(lat); String slash = latlongvalue.substring(16, 2);
				 * System.out.println(slash); String longi = latlongvalue.substring(18, 11);
				 * System.out.println(longi); String LatituteLongitutevalue = lat+slash+longi;
				 * System.out.println(LatituteLongitutevalue);
				 */
				verify.ExpectedPropertyValueIsEqual(LatituteLongitute, latlongvalue);
			}

			public void veriyAtLatitudeAndLongitude() {
				String attribute = uIMapGeo.addressSearch.addressSearchMapTab.uILatLongTextView.getText();
				System.out.println(attribute);
				verify.ExpectedValueIsTrue(attribute.contains(BaseData.getGeoModuleValue("LatAndLong")));
			}

			public String getLatAndLong() {
				String LatLong = uIMapGeo.addressSearch.addressSearchMapTab.uILatLongTextView.getText();
				return LatLong;
			}
		}

		public class AddressSearchFlagsTab {

			public void VerifyFlagDetailsViewed(int rowIndex) {
				String displayCondition = BaseData.getGeoModuleValue("DisplayCondition");
				Assert.assertEquals(displayCondition,
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapGeo.addressSearch.addressSearchFlagsTab.uIGridsResultTable, "Display Condition ",
								rowIndex));
				Assert.assertEquals(Randomized.getCurrentDate("MM/dd/yy"),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapGeo.addressSearch.addressSearchFlagsTab.uIGridsResultTable, "Active As of Date",
								rowIndex));
			}

			public void VerifyActiveAsOfAsCurrentDate() {
				Assert.assertEquals(Randomized.getCurrentDate(),
						uIMapGeo.addressSearch.addressSearchFlagsTab.uIActiveAsOfInGridTable.getText());
			}

			public void ClickAddFlag() {
				uIMapGeo.addressSearch.addressSearchFlagsTab.uIAddFlagsButton.click();
			}

			public void verifyAtFlagGridActiveAsDate() {
				verify.ExpectedPropertyValueIsEqual(
						uIMapGeo.addressSearch.addressSearchFlagsTab.uIActiveAsOfInGridTable.getText(),
						BaseData.getGeoModuleValue("ActiveAsDate"));
			}

			public void verifyAtFlagGridRemarks() {
				verify.ExpectedPropertyValueIsEqual(
						uIMapGeo.addressSearch.addressSearchFlagsTab.uIRemarksGridTable.getText(),
						BaseData.getGeoModuleValue("Remarks"));

			}

			public void verifyAddressFlagGridTextBoldAndBlack() {
				// font weight 700 = Bold
				// font weight 400 = Normal text
				// font color rgba( 0, 0, 0, 1) = Black
				String fontStyle = uIMapGeo.addressSearch.addressSearchFlagsTab.uIActiveAsOfInGridTable
						.getCssValue("font-weight");
				String fontColor = uIMapGeo.addressSearch.addressSearchFlagsTab.uIActiveAsOfInGridTable
						.getCssValue("color");
				// System.out.println(fontColor);
				// System.out.println(fontStyle);
				verify.ExpectedValueIsTrue(fontStyle.contains("700"));
				verify.ExpectedValueIsTrue(fontColor.contains("rgba(0, 0, 0, 1)"));
			}

			public void selectGridRowByActiveAsDate() {
				uIMapGeo.addressSearch.addressSearchFlagsTab.uIActiveAsOfInGridTable.click();
			}

			public void clickShowInactiveCheckBox() {
				uIMapGeo.addressSearch.addressSearchFlagsTab.uIShowInActiveCheckbox.click();

			}

			public void verifyAtFlagGridInactiveDate() {
				verify.ExpectedPropertyValueIsEqual(
						uIMapGeo.addressSearch.addressSearchFlagsTab.uIInActiveOfGridTable.getText(),
						BaseData.getGeoModuleValue("InactiveDate"));
			}

			public void ClickDeleteGridRow() {
				uIMapGeo.addressSearch.addressSearchFlagsTab.uIDeleteGridRow.click();
				popup.confirm.yesWithExpectedMessage("(4) Do you want to delete?");

			}

			public void verifyAddressFlagGridTextBoldAndGray() {
				// font weight 700 = Bold
				// font weight 400 = Normal text
				// font color rgba(128, 128, 128, 1) = Gray

				String fontStyle = uIMapGeo.addressSearch.addressSearchFlagsTab.uIActiveAsOfInGridTable
						.getCssValue("font-weight");
				String fontColor = uIMapGeo.addressSearch.addressSearchFlagsTab.uIActiveAsOfInGridTable
						.getCssValue("color");
				// System.out.println(fontColor);
				// System.out.println(fontStyle);
				verify.ExpectedValueIsTrue(fontStyle.contains("700"));
				verify.ExpectedValueIsTrue(fontColor.contains("rgba(128, 128, 128, 1)"));
			}

			public void verifyAddFlagInactive() {

				Playback.controlReadyThreadWait();
				verify.ExpectedValueIsFalse(uIMapGeo.addressSearch.addressSearchFlagsTab.uIAddFlagsButton.isEnabled());
				Playback.controlReadyThreadWait();
			}

		}

		public class AddressSearchContactTab {

			public void ClickAddNewButton() {
				uIMapGeo.addressSearch.addressSearchContactTab.uIAddNewButton.click();
			}

			public void VerifyAtNameInTheGrid(int rowIndex) {
				String name = BaseData.getGeoModuleValue("Name");
				Assert.assertEquals(name, objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable, "Name", rowIndex));
			}

			public void VerifyAtContactNotExist() {
				String name = BaseData.getGeoModuleValue("Name");
				Assert.assertFalse(uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable.getText()
						.contains(name));

			}

			public void VerfiAtPhoneNo(int rowIndex) {
				String phoneNumber = BaseData.getGeoModuleValue("PhoneNumber");
				Assert.assertEquals(phoneNumber, objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable, "Phone#", rowIndex));

			}

			public void VerifyAtAltPhoneNo(int rowIndex) {
				String altPhoneNumber = BaseData.getGeoModuleValue("AltPhoneNumber");
				Assert.assertEquals(altPhoneNumber,
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable, "Alt Phone#",
								rowIndex));

			}

			public void ClickAtName(int rowIndex) {

				objectIdentification.manualIdentify
						.getGridCell(uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable, "Name",
								rowIndex)
						.click();

			}

			public void SelectPhoneType1AsHome() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneType1ComboBox, "H - Home");
			}

			public void SelectPhoneType2AsHome() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneType2ComboBox, "H - Home");
				uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneType2ComboBox.sendKeys(Keys.TAB);
			}

			public void EnterPhoneNo1AtPhone() {
				String phone = BaseData.getGeoModuleValue("Phone");
				uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneNumber1Edit.click();
				uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneNumber1Edit.sendKeys(phone);
			}

			public void EnterPhoneNo2AtPhone() {
				String phone = BaseData.getGeoModuleValue("Phone");
				uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneNumber2Edit.click();
				uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneNumber2Edit.sendKeys(phone);
			}

			public void ClickSave() {
				uIMapGeo.addressSearch.addressSearchContactTab.uISaveButton.click();
			}

			public void SaveInternalTab() {
				uIMapGeo.addressSearch.addressSearchContactTab.uISaveButton.click();
				popup.confirm.yes();
			}

			public void ClickReset() {
				uIMapGeo.addressSearch.addressSearchContactTab.uIRefreshButton.click();
			}

			public void DeleteOrder1Phone() {
				uIMapGeo.addressSearch.addressSearchContactTab.uIDeleteicon1Button.click();
				popup.confirm.yes();
			}

			public void VerifyOrderNoAs1() {
				Assert.assertEquals("1",
						uIMapGeo.addressSearch.addressSearchContactTab.uIOrder1Edit.getAttribute("value"));
			}

			public void VerfiyNameRelationAsAlarmContact(int rowIndex) {

				Assert.assertEquals("Alarm Contact",
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable,
								"Name Relation", rowIndex));

			}

			public void VerifyAtAddressInTheGrid(int rowIndex) {

				Assert.assertEquals(BaseData.getGeoModuleValue("Address"),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable, "Address",
								rowIndex));
			}

			public void selectAtPhoneType1() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneType1ComboBox,
						BaseData.getGeoModuleValue("PhoneType1"));
			}

			public void clickInactivePhone1() {
				uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneInactive1.click();
			}

			public void ClickInactivePhone2() {
				uIMapGeo.addressSearch.addressSearchContactTab.uIPhoneInactive2.click();
			}

			public void VerifyAtNotesInTheGrid(int rowIndex) {
				Playback.controlReadyThreadWait();
				String note = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapGeo.addressSearch.addressSearchContactTab.uIContactsTabResultTable, "Notes", rowIndex);
				verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Notes"), note);

			}

			public void verifyAddNewButtonDisabled() {

				Playback.controlReadyThreadWait();
				verify.ExpectedValueIsFalse(uIMapGeo.addressSearch.addressSearchContactTab.uIAddNewButton.isEnabled());
				Playback.controlReadyThreadWait();

			}
		}

		public class AddressSearchActivitiesTab {
			public void VerifyAtActivityType() {
				// String activityType= BaseData.getGeoModuleValue( "ActivityType");
				// Assert.assertEquals(activityType,
				// objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchActivitiesTab.uIActivitiesTable,
				// activityType, "Activity Type"));
			}

			public void VerifyAtSubject() {
				// Assert.assertEquals(BaseData.getGeoModuleValue("Subject"),
				// objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchActivitiesTab.uIActivitiesTable,
				// BaseData.getGeoModuleValue("Subject"), "Subject").Text);
			}

			public void VerifyAtStatus() {
				// Assert.assertEquals(BaseData.getGeoModuleValue("Status"),
				// objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchActivitiesTab.uIActivitiesTable,
				// BaseData.getGeoModuleValue("Status"), "Status").);
			}

			public void VerifyAtBy() {
				// Assert.assertEquals(BaseData.getGeoModuleValue("By"),
				// objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchActivitiesTab.uIActivitiesTable,
				// BaseData.getGeoModuleValue("By"), "By").get);
			}

			public void VerifyDateAsCurrentDateByAtActivityType() {

				// Assert.assertTrue(objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchActivitiesTab.uIActivitiesTable,
				// BaseData.getGeoModuleValue("ActivityType"), "Date
				// Time").Text.Contains(Randomized.getCurrentDate().Remove(6,2)),"Verify Current
				// date");
			}

			public void SelectRowByAtActivityType() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapGeo.addressSearch.addressSearchActivitiesTab.uIActivitiesTable,
						BaseData.getGeoModuleValue("ActivityType"));
			}

		}

		public class MergeAddressPopup {
			public void EnterAtMergeToAddress() {
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.click();
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.clear();
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.clear();
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit
						.sendKeys(BaseData.getGeoModuleValue("MergeToAddress"));
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.sendKeys(Keys.TAB);
			}

			public void clickGetCountButton() {

				uIMapGeo.addressSearch.mergeAddressPopup.uIGetCountButton.click();
				uIMapGeo.addressSearch.mergeAddressPopup.uIGetCountButton.click();
				Playback.pageLoadThreadWait();
				Playback.controlReadyThreadWait();
			}

			public void VerifyAtRecordCount() {
				Playback.pageLoadThreadWait();
				// System.out.println(uIMapGeo.addressSearch.mergeAddressPopup.uIRecordCountTextView.getText());
				Assert.assertTrue(uIMapGeo.addressSearch.mergeAddressPopup.uIRecordCountTextView.getText()
						.contains(BaseData.getGeoModuleValue("RecordCount")));
			}


			public void ClickMergeButton() {
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeButton.click();

			}

			public void VerifyConfirmMessageThisProcessWillTakeSignificationAmoutOfTime() {
				if (Playback.browserType.equals("Chrome")) {
					popup.confirm.yesWithExpectedMessage(
							"(5106) This process will take a significant amount of time. Are you sure you want to continue?");
				} else
					popup.confirm.yesWithExpectedMessage(
							"(5106) This process will take a significant amount of time. Are you sure you want to continue?");
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
				Playback.popupThreadWait();
			}

			public void VerifyMergeSuccessfulAcknowledge() {

				popup.acknowledge.okWithExpectedMessage("(5119) Merge Successful");

			}

			public void VerifyAddressInactiveAcknowledge() {

				popup.acknowledge.okWithExpectedMessage("(5097) This address is inactive");

			}

			public void EnterAtMainAddress() {
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit
						.sendKeys(BaseData.getGeoModuleValue("Address"));
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.sendKeys(Keys.TAB);
			}

			public void VerifyConfirmMessageSameAddress() {

				popup.acknowledge.okWithExpectedMessage("(6040) Same Address Cannot be merged");
				Playback.popupThreadWait();

			}

			public void EnterAtMergeToAddress1() {
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.click();
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.clear();
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.clear();
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit
						.sendKeys(BaseData.getGeoModuleValue("MergeToAddress1"));
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.sendKeys(Keys.TAB);
			}

			public void verifyMergeAddressInfoButton() {
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeAddressInfoIcon.isDisplayed();
			}

			public void verifyAtCSZ() {
				String string = uIMapGeo.addressSearch.mergeAddressPopup.uICSZValue.getText();
				verify.ExpectedValueIsTrue(string.contains(BaseData.getGeoModuleValue("CSZ")));
			}

			public void EnterAtMergeToAddress(int slno) {
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.click();
				uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.clear();
				if (slno == 0) {
					uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit
							.sendKeys(BaseData.getGeoModuleValue("MergeToAddress"));
					uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.sendKeys(Keys.TAB);
				} else {
					uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit
							.sendKeys(BaseData.getGeoModuleValue("MergeToAddress" + slno + ""));
					uIMapGeo.addressSearch.mergeAddressPopup.uIMergeToAddressEdit.sendKeys(Keys.TAB);
				} 
			}

			public void verifyMergeFromAddressWillNotInactivatedAcknowledge() {
				// TODO Auto-generated method stub
				popup.acknowledge.okWithExpectedMessage(
						"(5121) The 'Merge From' address will not be inactivated during the merge since it has apartments.");
				Playback.popupThreadWait();

			}
		}

		public class AddressSearchNamesTab {
			public void VerifyAtNameID() {

				Assert.assertEquals(BaseData.getGeoModuleValue("NameID"),
						objectIdentification.manualIdentify
								.getGridCell(uIMapGeo.addressSearch.addressSearchNamesTab.uINamesTable,
										BaseData.getGeoModuleValue("NameID"))
								.getText());
			}

			public void VerifyNameID(String nameID) {

				// WebElement uINameIDCell =
				// ObjectIdentification.objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchNamesTab.uINamesTable,
				// nameID, "ID");
				// Assert.assertTrue(uINameIDCell.getText().contains(nameID));
			}

			public void VerifyFlagIconAtNameIDRow() {

				// WebElement GridCell =
				// ObjectIdentification.objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchNamesTab.uINamesTable,
				// BaseData.getGeoModuleValue("NameID"), "F");

				// Assert.assertTrue(GridCell.getAttribute("class").contains("ChangeImage"),"Flag
				// icon not exist");
			}

			public void VerifyFlagIconByNameID(String nameId) {

				// WebElement GridCell =
				// ObjectIdentification.objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressSearch.addressSearchNamesTab.uINamesTable,
				// nameId, "F");

				// Assert.assertEquals("ChangeImage", GridCell.getAttribute("class"));
			}

			public void ClickAtNameInTheGrid() {
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapGeo.addressSearch.addressSearchNamesTab.uINamesTable, BaseData.getGeoModuleValue("Name"));
			}

			public void verifyAtNameInGrid() {
				Assert.assertEquals(BaseData.getGeoModuleValue("Name"),
						objectIdentification.manualIdentify
								.getGridCell(uIMapGeo.addressSearch.addressSearchNamesTab.uINamesTable,
										BaseData.getGeoModuleValue("Name"))
								.getText());
			}

		}

		public class AddressSearchCommonNameTab {

			// AddressSearchCommonNameTab addressSearchCommonNameTab = new
			// AddressSearchCommonNameTab();

			public void VerifyAtCommonName() {

				Assert.assertEquals(BaseData.getGeoModuleValue("CommonName"),
						objectIdentification.manualIdentify
								.getGridCell(uIMapGeo.addressSearch.addressSearchCommonNameTab.uICommonNameTable,
										BaseData.getGeoModuleValue("CommonName"))
								.getText());
			}

			public void VerifyAtCommonName(int rowIndex) {

				String Cname = objectIdentification.manualIdentify.getGridCellInnerText(
						uIMapGeo.addressSearch.addressSearchCommonNameTab.uICommonNameTable, "Common Name", rowIndex);
				verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CommonName"), Cname);
			}

			public void verifyAddCommonNameDisabled() {
				Playback.controlReadyThreadWait();
				verify.ExpectedValueIsFalse(
						uIMapGeo.addressSearch.addressSearchCommonNameTab.uIAddCommonNameButton.isEnabled());
				Playback.controlReadyThreadWait();
			}
		}

		public class AddressSearchDetailsTab {
			public void SaveTab() {
				uIMapGeo.addressSearch.addressSearchDetailsTab.uISaveButton.click();
				popup.confirm.yes();
			}


			public void VerifyLatitude(String LatituteLongitute) {
				verify.ExpectedPropertyValueIsEqual(LatituteLongitute.substring(0, 10),
						uIMapGeo.addressSearch.addressSearchDetailsTab.uILatitudeEdit.getAttribute("value").substring(0,
								10));
			}

			public void VerifyLongitude(String LatituteLongitute) {
				verify.ExpectedPropertyValueIsEqual(LatituteLongitute.substring(14, 10),
						uIMapGeo.addressSearch.addressSearchDetailsTab.uILongitudeEdit.getAttribute("value")
								.substring(0, 10));
			}

			public void verifyActiveLatitude(String LatLong) {
				String attribute = uIMapGeo.addressSearch.addressSearchDetailsTab.uILatitudeEdit.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(LatLong, attribute); // changed by Abi
				// verify.ExpectedValueIsTrue(attribute.contains(LatLong));
			}

			public void verifyActiveLongitude(String LatLong) {
				String attribute = uIMapGeo.addressSearch.addressSearchDetailsTab.uILatitudeEdit.getAttribute("value");
				verify.ExpectedPropertyValueIsEqual(LatLong, attribute); // changed by Abi
				// verify.ExpectedValueIsTrue(attribute.contains(LatLong));
			}

		}

		public void VerifyMapTabColorBlack() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.addressSearch.uIMapTab.getAttribute("class").contains("clrBlack"));
			// Assert.assertTrue(uIMapGeo.addressSearch.uIMapTab.getAttribute("class").contains("clrBlack"));
		}
	}

	public class AddressIntersection {

		public void VerifyAcknowlegdeSaveMessage() {
			popup.acknowledge.okWithExpectedMessage("(7) No data present");
		}

		public void VerifyAcknowledgeAddMessage() {
			popup.acknowledge.okWithExpectedMessage("(5002) Required Street Name entry");
		}

		public void EnterAtInterStreetWithType() {
			uIMapGeo.addressIntersection.uIPremiseEdit.clear();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit
					.sendKeys(BaseData.getGeoModuleValue("InterStreetName") + " "
							+ BaseData.getGeoModuleValue("InterStreetType"));
			Playback.popupThreadWait();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterOddNumber() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys("11");
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
		}

		public void EnterEvenNumber() {
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys("22");
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterGeoCordsX() {
			uIMapGeo.addressIntersection.uIGeoCordsXEdit.sendKeys(Randomized.enterRandomNumbers(2));
		}

		public void EnterGeoCordsY() {
			uIMapGeo.addressIntersection.uIGeoCordsYEdit.sendKeys(Randomized.enterRandomNumbers(2));
		}

		public void ClearOddNumber() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.clear();
		}

		public void EnterAtOddNumber() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(BaseData.getGeoModuleValue("Odd"));
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtOddNumberWithDot() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(BaseData.getGeoModuleValue("Odd") + ".");
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtOddEvenNumber() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit
					.sendKeys(BaseData.getGeoModuleValue("OddEven").substring(0, 1));
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit
					.sendKeys(BaseData.getGeoModuleValue("OddEven").substring(1));
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtEvenNumber() {
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys(BaseData.getGeoModuleValue("Even"));
		}

		public void EnterAtPremiseOddNumber() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(BaseData.getGeoModuleValue("Premise"));
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtPremiseNumber() {
			uIMapGeo.addressIntersection.uIPremiseEdit.clear();
			uIMapGeo.addressIntersection.uIPremiseEdit.sendKeys(BaseData.getGeoModuleValue("Premise"));
			uIMapGeo.addressIntersection.uIPremiseEdit.sendKeys(Keys.TAB);
		}

		public void EnterAllFields() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIPatrolZoneComboBox);
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uISubZoneComboBox);
			uIMapGeo.addressIntersection.uICensusTractEdit.sendKeys("15000");
		}

		public void EnterInvalidPremiseNumber() {
			uIMapGeo.addressIntersection.uIPremiseEdit.sendKeys(Randomized.randomNumberString(2));
			uIMapGeo.addressIntersection.uIPremiseEdit.sendKeys(Keys.TAB);
		}

		public void selectAsBoth() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIPremiseComboBox,
					"Both");
		}

		public void SelectAsOdd() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIPremiseComboBox,
					"Odd");
		}

		public void selectAsEven() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIPremiseComboBox,
					"Even");
		}

		public void clickAddButton() {
			uIMapGeo.addressIntersection.uIAddButton.click();
			Playback.popupThreadWait();
		}

		public void ClickSaveButton() {
			uIMapGeo.addressIntersection.uISaveButton.click();
		}

		public void clickInactiveCheckBox() {
			uIMapGeo.addressIntersection.uIInactiveCheckBox.click();
		}

		public void ClickRow(int RowIndex) {
			objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, RowIndex).click();
		}

		public void ClickAtOddEvenRow() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("OddEven").substring(0, 1));
		}

		public void ClickAtOddRowInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, BaseData.getGeoModuleValue("Odd"));
		}

		public void ClickDeleteRow(int rowIndex, int columnIndex, int rowLength) // out
		{
			Playback.setTestContextAttribute("rowLength", String.valueOf(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid)));
			objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, rowIndex, columnIndex)
					.click();

		}

		public void UpdatePremiseDetailsPatrolZoneAndSubZone() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIPatrolZoneComboBox);
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uISubZoneComboBox);
		}

		public void SaveScreen() {
			uIMapGeo.addressIntersection.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveNClose() {
			uIMapGeo.addressIntersection.uISaveAndCloseButton.click();
		}

		public void saveNCloseScreen() {
			uIMapGeo.addressIntersection.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapGeo.addressIntersection.driver.close();
		}

		public void ClickClearButton() {
			uIMapGeo.addressIntersection.uIClearButton.click();
		}

		public void SelectSubZone() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uISubZoneComboBox);
		}

		public void SelectPatrolZone() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIPatrolZoneComboBox);
		}

		public void SelectNPACard() {
			uIMapGeo.addressIntersection.uINPACardLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void enterAtZipCode() {
			uIMapGeo.addressIntersection.uIZipCodeEdit.clear();
			uIMapGeo.addressIntersection.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
			uIMapGeo.addressIntersection.uIZipCodeEdit.sendKeys(Keys.TAB);
		}
		
		public void enterAtCensusTract() {
			uIMapGeo.addressIntersection.uICensusTractEdit.clear();
			uIMapGeo.addressIntersection.uICensusTractEdit.sendKeys(BaseData.getGeoModuleValue("CensusTract"));
			uIMapGeo.addressIntersection.uICensusTractEdit.sendKeys(Keys.TAB);
		}

		public void SelectVotingDistrict() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapGeo.addressIntersection.uIVotingDistrictComboBox);
		}

		public void clickAtPremiseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("Premise") + "-" + BaseData.getGeoModuleValue("Premise"));
			Playback.popupThreadWait();
		}

		public void VerifyOddEvenViewed() {
			Assert.assertEquals(BaseData.getGeoModuleValue("OddEven").substring(0, 1),
					uIMapGeo.addressIntersection.uIPremiseOddFromEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getGeoModuleValue("OddEven").substring(1),
					uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.getAttribute("value"));

		}

		public void VerifyInactiveDateDisabled() {
			Playback.gridLoadThreadWait();
//			Assert.assertTrue(uIMapGeo.addressIntersection.uIInactiveDateTextView.getAttribute("readonly")	//changed by Abi
//					.contains("readonly"));
			verify.ExpectedPropertyValueIsEqual(
					uIMapGeo.addressIntersection.uIInactiveDateTextView.getAttribute("readonly"), "true");
		}

		public void VerifyCurrentDate() {
			Playback.gridLoadThreadWait();
			String a = uIMapGeo.addressIntersection.uIInactiveDateTextView.getAttribute("value");
			System.out.println(a);
//			String a1=uIMapGeo.addressIntersection.uIInactiveDateTextView.getAttribute("name");
//			System.out.println(a1);
//			String a2=uIMapGeo.addressIntersection.uIInactiveDateTextView.getAttribute("id");
//			System.out.println(a2);
			String a3 = uIMapGeo.addressIntersection.uIInactiveDateTextView.getText();
			System.out.println(a3);
			Assert.assertTrue(uIMapGeo.addressIntersection.uIInactiveDateTextView.getAttribute("value")
					.contains(Randomized.getCurrentDate()));
		}

		public void VerifyInactiveRowGraycolor(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, rowIndex)
					.getAttribute("class").contains("Gray"));
		}

		public void VerifyOddEvenPremiseAdded(int rowIndex) {
			Assert.assertTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
									"Premise Odd", rowIndex)
							.contains(BaseData.getGeoModuleValue("OddEven").substring(0, 1)));
			Assert.assertTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
									"Premise Even", rowIndex)
							.contains(BaseData.getGeoModuleValue("Even").substring(1)));
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Zip Code",
							rowIndex)
					.contains(BaseData.getGeoModuleValue("ZipCode")));
		}

		public void VerifyOddPremiseAdded(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Odd",
							rowIndex)
					.contains(BaseData.getGeoModuleValue("Odd")));
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Zip Code",
							rowIndex)
					.contains(BaseData.getGeoModuleValue("ZipCode")));
		}

		public void VerifyEvenPremiseAdded() {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Even",
							2)
					.contains(BaseData.getGeoModuleValue("Even")));
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Zip Code", 2)
					.contains(BaseData.getGeoModuleValue("ZipCode")));
		}

		public void VerifyPremiseAdded() {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Odd",
							3)
					.contains(BaseData.getGeoModuleValue("Premise")));
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Zip Code", 3)
					.contains(BaseData.getGeoModuleValue("ZipCode")));
		}

		public void VerifyUpdatedPremiseDetailsPatrolZoneAndSubZoneIsNotNullInTheGrid(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Patrol Zone", rowIndex) != null);
			Assert.assertTrue(objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Sub Zone", rowIndex) != null);
		}

		public void VerifyAtPremisesInTheGrid(int rowIndex) {
			Assert.assertTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
									"Premise Odd", rowIndex)
							.contains(BaseData.getGeoModuleValue("PremiseOdd").substring(0, 1)));
			Assert.assertTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
									"Premise Even", rowIndex)
							.contains(BaseData.getGeoModuleValue("PremiseEven").substring(1)));
		}

		public void VerifyRowDeletedInTheGrid(int rowCount) {
			Assert.assertTrue(objectIdentification.manualIdentify.getGridTableRowsCount(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid) == rowCount - 1);
		}

		public void VerifyOddEvenRowDeleted() {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid) == 2);
		}

		public void VerifyAcknowledgeAddPremiseMessage() {
			popup.acknowledge.okWithExpectedMessage("(5084) Enter a valid premise range");
		}

		public void VerifyAcknowledgeEvenNumber() {
			popup.acknowledge.okWithExpectedMessage("(5022) Even Number entry is required");
		}

		public void VerifyAcknowledgeOddNumber() {
			popup.acknowledge.okWithExpectedMessage("(5023) Odd Number entry is required");
		}

		public void VerifyAcknowledgeOverlapping() {
			popup.acknowledge.okWithExpectedMessage("(5007) Range overlapping - Enter a new range");
		}

		public void VerifyAcknowledgeValidPremise() {
			popup.acknowledge.okWithExpectedMessage("(5001) Not a Valid Premise");
		}

		public void VerifyAcknowledgeUpdateMessage() {
			Playback.popupThreadWait();
			popup.acknowledge.okWithExpectedMessage("(1056) Updated data exists in the fields. You must save or reset");
		}

		public void VerifyConfirmationDeleteMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void DoubleClickAtPremise() {
			Actions doubleClick = new Actions(Playback.driver);
			doubleClick
					.doubleClick(objectIdentification.manualIdentify.getGridRowByCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
							BaseData.getGeoModuleValue("Premise") + "-" + BaseData.getGeoModuleValue("Premise")))
					.perform();
			doubleClick = null;
			Playback.gridLoadThreadWait();
		}

		public void DoubleClickOnTheRowAtPremiseOdd() {
			Playback.actionDriver.doubleClick(objectIdentification.manualIdentify.getGridCell(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("PremiseOdd"))).perform();
			Playback.gridLoadThreadWait();
		}

		public void VerifyIntersectionRowsNotExist() {
			Playback.gridLoadThreadWait();
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid) == 0);
		}

		public void DeleteAtOddRow() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("PremiseOdd"));
		}

		public void DeleteAtIntersectionStreetRow() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("InterStreetName"));
		}

		public void VerifyAcknowlegeReviewMessage() {
			Playback.controlReadyThreadWait();
			// Assert.assertTrue(reviewMessage.contains("Review Address Flag"));
			popup.acknowledge.okWithExpectedMessage("Review Address Flag");
		}

		public void VerifyAcknowlegeReviewMessageCommon() {
//			Playback.controlReadyThreadWait();
//			String reviewMessage = uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText();
//			Assert.assertTrue(reviewMessage.contains("The selected premise range has been referenced"));
			popup.acknowledge.okWithExpectedMessage("Review Common Name");
		}

		public void VerifyAtStreetName() {
			Assert.assertTrue(uIMapGeo.addressIntersection.uIStreetNameEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("StreetName")));
		}

		public void VerifyAtInterStreetViewed(int rowIndex) {
			Assert.assertTrue(
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
									"Int Street Name", rowIndex)
							.contains(BaseData.getGeoModuleValue("InterStreetName")));
		}

		public void VerifyAtStreetNameAndIntersectionStreetName(int rowIndex) {
			VerifyAtStreetName();
			VerifyAtInterStreetViewed(rowIndex);
		}

		public void VerifyAtPatrolZoneGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("PatrolZone"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Patrol Zone", rowIndex));
		}

		public void VerifyAtSubZoneGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("SubZone"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Sub Zone", rowIndex));
		}

		public void VerifyAtCensusGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("Census"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Census Tract", rowIndex));
		}

		public void verifyAtZipCodeGrid(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Zip Code",
							rowIndex)
					.contains(BaseData.getGeoModuleValue("ZipCode")));
		}

		public void VerifyBatchUpdateDetailsAtZipCodeCensusNPACard() {
			Assert.assertEquals(BaseData.getGeoModuleValue("ZipCode"),
					uIMapGeo.addressIntersection.uIZipCodeEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getGeoModuleValue("Census"),
					uIMapGeo.addressIntersection.uICensusTractEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getGeoModuleValue("NPACard"),
					uIMapGeo.addressIntersection.uINPACardEdit.getAttribute("value"));
		}

		public void ClickAtInterStreetNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("IntStreetName"));
		}

		public void VerifyAtInterStreetName() {
			Playback.controlReadyThreadWait();
			Assert.assertTrue(uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("InterStreetName")));
		}

		public void VerifyAtInterStreetNameColorAsBlack() {
			Assert.assertTrue(uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.getCssValue("color")
					.contains("0, 0, 0, 1"));
		}

		public void VerifyAtNPACard() {
			Assert.assertEquals(BaseData.getGeoModuleValue("NPACard"),
					uIMapGeo.addressIntersection.uINPACardEdit.getAttribute("value"));
		}

		public void VerifyAtSubZoneDescription() {
			Assert.assertEquals(BaseData.getGeoModuleValue("SubZoneDescription"), objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapGeo.addressIntersection.uISubZoneComboBox));
		}

		public void VerifyAtPatrolZoneDescription() {
			Assert.assertEquals(BaseData.getGeoModuleValue("PatrolZoneDescription"), objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapGeo.addressIntersection.uIPatrolZoneComboBox));
		}

		public void VerifyAtPremiseOddInGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseOdd"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Odd", rowIndex));
		}

		public void VerifyAtPremiseEvenInGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseEven"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Even", rowIndex));
		}

		public void ClickAtPremiseOddRowInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("PremiseOdd"));
		}

		public void ClickAtPremiseEvenRowInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("PremiseEven"));
		}

		public void EnterAtOddTo() {
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.click();
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.clear();
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.sendKeys(BaseData.getGeoModuleValue("OddTo"));
		}

		public void enterAtEvenTo() {
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.click();
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.clear();
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.sendKeys(BaseData.getGeoModuleValue("EvenTo"));
		}

		public void VerifyAtPremiseOddSplited(int rowIndex, int rowIndex1) // changed by Abi
		{
			Playback.controlReadyThreadWait();
			// Assert.assertEquals(BaseData.getGeoModuleValue("PremiseOdd").remove(4,
			// 5)+"-"+BaseData.getGeoModuleValue("OddTo"),
			// objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
			// "Premise Odd", rowIndex));
			// Assert.assertTrue(objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.addressIntersection.
			// uIAddressIntersectionResultGrid, "Premise Odd",
			// rowIndex1).contains(BaseData.getGeoModuleValue("PremiseOdd").remove(0, 4)));
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseOddSplit1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Odd", rowIndex));
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseOddSplit2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Odd", rowIndex1));
		}

		public void VerifyAtPremiseEvenSplited(int rowIndex, int rowIndex1)////
		{
			Playback.controlReadyThreadWait();
			// Assert.assertEquals(BaseData.getGeoModuleValue("PremiseEven").Remove(4, 5) +
			// "-" + BaseData.getGeoModuleValue("EvenTo"),
			// objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
			// "Premise Even", rowIndex));
			// Assert.assertTrue(objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.addressIntersection.
			// uIAddressIntersectionResultGrid, "Premise Even",
			// rowIndex1).contains(BaseData.getGeoModuleValue("PremiseEven").Remove(0, 4)));
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseEvenSplit1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Even", rowIndex));
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseEvenSplit2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Premise Even", rowIndex1));
		}

		public void GetEvenNo(String evenNo) // out
		{
			evenNo = uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.getAttribute("value");
			Playback.setTestContextAttribute("evenNo", evenNo);
		}

		public void GetStreetName(String streetName) // out
		{
			streetName = uIMapGeo.addressIntersection.uIStreetNameEdit.getAttribute("value");
			Playback.setTestContextAttribute("streetName", streetName);
		}

		public void EnterAtEvenNoinFromAndTo() {
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.click();
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit
					.sendKeys(BaseData.getGeoModuleValue("EvenNo").substring(0, 1));
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.click();
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.clear();
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit
					.sendKeys(BaseData.getGeoModuleValue("EvenNo").substring(2));
		}

		public void EnterAtOddNoinFromAndTo() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.click();
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit
					.sendKeys(BaseData.getGeoModuleValue("OddNo").substring(0, 1));
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.click();
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.clear();
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.sendKeys(BaseData.getGeoModuleValue("OddNo").substring(2));
		}

		public void enterAtPremiseEven() {
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys(BaseData.getGeoModuleValue("PremiseEven"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtEvenOddInGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("EvenOdd"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, "Even Odd", rowIndex));
		}

		public void selectPatrolZoneAsPatrolZone() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIPatrolZoneComboBox,
					"Patrol Zone");
		}

		public void selectSubZoneAsSubZone() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uISubZoneComboBox,
					"Sub Zone");
		}

		public void enterAtNPACard() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressIntersection.uINPACardEdit.sendKeys(BaseData.getGeoModuleValue("NPACard"));
			uIMapGeo.addressIntersection.uINPACardEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFromAndToOddNumber() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit
					.sendKeys(BaseData.getGeoModuleValue("Odd").substring(0, 3));
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.sendKeys(BaseData.getGeoModuleValue("Odd").substring(4));
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.sendKeys(Keys.TAB);
		}

		public void verifyAdditionSuccessfulStatusMessage() {
			Assert.assertEquals("1002 - Addition Successful",
					uIMapGeo.addressIntersection.uIBottomLeftSideStatusBar.getText());
		}

		public void enterAtPremiseOddFromAndTo() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(BaseData.getGeoModuleValue("PremiseOddFrom"));
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.sendKeys(BaseData.getGeoModuleValue("PremiseOddTo"));
			uIMapGeo.addressIntersection.uIPremiseOddToEdit.sendKeys(Keys.TAB);
		}

		public void enterAtPremiseEvenFromAndTo() {
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys(BaseData.getGeoModuleValue("PremiseEvenFrom"));
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys(Keys.TAB);
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.sendKeys(BaseData.getGeoModuleValue("PremiseEvenTo"));
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.sendKeys(Keys.TAB);
		}

		public void deleteRowByUsingEvenOddInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("EvenOdd"));
			WebElement row = objectIdentification.manualIdentify.getGridCell(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, gridRowByCellInnerText, "X");
			row.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void enterAtInterStreet() {
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit
					.sendKeys(BaseData.getGeoModuleValue("InterStreetName"));
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectDistrictDropdownAsD1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uIDistrictComboBox,
					"District 1");
		}

		public void SelectSubDistrictDropdownAsS1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressIntersection.uISubDistrictComboBox,
					"Sub District 1");
		}

		public void enterAtEvenFrom() {
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.click();
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.clear();
			uIMapGeo.addressIntersection.uIPremiseEvenToEdit.sendKeys(BaseData.getGeoModuleValue("EvenFrom"));
		}

		public void enterAtInterStreet1() {
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.clear();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit
					.sendKeys(BaseData.getGeoModuleValue("InterStreetName1"));
			Playback.popupThreadWait();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtInterStreet2() {
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.clear();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit
					.sendKeys(BaseData.getGeoModuleValue("InterStreetName2"));
			Playback.popupThreadWait();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtInterStreet3() {
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.clear();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit
					.sendKeys(BaseData.getGeoModuleValue("InterStreetName3"));
			Playback.popupThreadWait();
			uIMapGeo.addressIntersection.uIIntersectionStreetNameEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtIntStreetNameInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("InterStreetName"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getGeoModuleValue("InterStreetName")));

		}

		public void clearZipCode() {
			uIMapGeo.addressIntersection.uIZipCodeEdit.clear();

		}

		public void ClickDeleteRow(int rowIndex, int columnIndex) // out
		{
			// Playback.setTestContextAttribute("rowLength",
			// String.valueOf(objectIdentification.manualIdentify
			// .getGridTableRowsCount(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid)));
			objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, rowIndex, columnIndex)
					.click();
		}

		public void EnterAtOddNumberWithLetters() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(BaseData.getGeoModuleValue("OddNoWithLetters")); // changed
																														// by
																														// Abi
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
		}

		public void verifyPremiseEvenInactive() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.isEnabled());
			Playback.controlReadyThreadWait();
		}

		public void verifyOddEvenPremiseComboBoxAsBoth() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsFalse(uIMapGeo.addressIntersection.uIPremiseComboBox.isEnabled());
			Playback.controlReadyThreadWait();
			String dropDownSelectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapGeo.addressIntersection.uIPremiseComboBox);
			// System.out.println(dropDownSelectedItem);
			// verify.ExpectedValueIsTrue(uIMapGeo.addressIntersection.uIPremiseComboBox.getAttribute("value").contains("Both"));
			Assert.assertTrue(dropDownSelectedItem.contains("Both"));
		}

		public void clickRefreshButton() {
			uIMapGeo.addressIntersection.uIRefreshButton.click();
		}

		public void enterAtEvenOddNumber() {
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit
					.sendKeys(BaseData.getGeoModuleValue("EvenOddPremise").substring(0, 1));
			uIMapGeo.addressIntersection.uIPremiseOddFromEdit.sendKeys(Keys.TAB);
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit
					.sendKeys(BaseData.getGeoModuleValue("EvenOddPremise").substring(1));
			uIMapGeo.addressIntersection.uIPremiseEvenFromEdit.sendKeys(Keys.TAB);
		}

		public void closeAddressIntersectionScreen() {
			Playback.driver.close();
		}

		public void clickZipCodeLookupButton() {
			uIMapGeo.addressIntersection.uIZipCodeLookupButton.click();
			popup.switchToCodedSearch();
			popup.uIMapPopup.kPIHelpWindow.uICodeValueEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
			popup.uIMapPopup.kPIHelpWindow.uISearchIconButton.click();
			popup.kPICodedLookup.selectAtZipCodeInGrid();
		}

		public void verifyActiveRowBlackColor(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid, rowIndex)
					.getCssValue("color").contains("0, 0, 0, 1"));

		}

		public void VerifyInactiveDateIsBlank() {
			System.out.println(uIMapGeo.addressIntersection.uIInactiveDateTextView.getText());
			verify.ExpectedValueIsTrue(uIMapGeo.addressIntersection.uIInactiveDateTextView.getText().contains(""));
		}

		public void verifyUpdateSuccessfulStatusMessage() {
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", uIMapGeo.addressFlagEntry.uIBottomLeftSideStatusBar.getText()); 
		}

		public void enterAtZipCode1() {
			uIMapGeo.addressIntersection.uIZipCodeEdit.clear();
			uIMapGeo.addressIntersection.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode1"));
			uIMapGeo.addressIntersection.uIZipCodeEdit.sendKeys(Keys.TAB);
		}
	}

	public class ApartmentEntry {

		public void EnterAtPremise() {
			uIMapGeo.apartmentEntry.uIPremiseEdit.click();
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIPremiseEdit.sendKeys(BaseData.getGeoModuleValue("Premise"));
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIPremiseEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtApartmentFrom() {
			{
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.click();
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys(Keys.BACK_SPACE);
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys(Keys.DELETE);
				Playback.controlReadyThreadWait();
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.click();
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys(BaseData.getGeoModuleValue("ApartmentFrom"));
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}
		}

		public void EnterAtApartmentTo() {
			Playback.controlReadyThreadWait();
			Playback.threadWait(3000);
			uIMapGeo.apartmentEntry.uIApartmentToEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.CONTROL ,"a");
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.BACK_SPACE);
			Playback.controlReadyThreadWait();
//			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.BACK_SPACE);
//			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.DELETE);
//			uIMapGeo.apartmentEntry.uIApartmentToEdit.click();
////			uIMapGeo.apartmentEntry.uIApartmentToEdit.clear();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(BaseData.getGeoModuleValue("ApartmentTo"));
		}

		public void ClickAddButton() {
			uIMapGeo.apartmentEntry.uIAddButton.click();
		}

		public void EnterAtSplitTo() {
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.BACK_SPACE);
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.DELETE);
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(BaseData.getGeoModuleValue("SplitTo"));

		}

		public void ClickAtApartmentFrom() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, BaseData.getGeoModuleValue("ApartmentFrom"));
		}

		public void ClickSaveButton() {
			uIMapGeo.apartmentEntry.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapGeo.apartmentEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void CloseScreen() {
			uIMapGeo.apartmentEntry.driver.close();
			Playback.pageLoadThreadWait();
		}

		public void DeleteAtApartment() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, BaseData.getGeoModuleValue("ApartmentFrom"));
		}

		public void DeleteAtApartmentTo() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, BaseData.getGeoModuleValue("ApartmentTo"));
		}

		public void VerifyApartmentViewed(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("ApartmentFrom"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, "Apartment From", rowIndex));
			Assert.assertEquals(BaseData.getGeoModuleValue("ApartmentTo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, "Apartment To", rowIndex));
		}

		public void VerifyPermiseUneditable() {
			Playback.pageLoadThreadWait();
			Assert.assertTrue(uIMapGeo.apartmentEntry.uIPremiseEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyAcknowlegdeSaveMessage() {
			popup.acknowledge.okWithExpectedMessage("(5006) No value for premise");
		}

		public void VerifyAcknowledgeAddMessage() {
			popup.acknowledge.okWithExpectedMessage("(5006) No value for premise");
		}

		public void VerifyAcknowledgeApartmentvalue() {
			popup.acknowledge.okWithExpectedMessage("(5017) Apartment From value is blank");
		}

		public void VerifyPremise() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Premise"),
					uIMapGeo.apartmentEntry.uIPremiseEdit.getAttribute("value"));
		}

		public void VerifyApartmentSplited(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("ApartmentFrom"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, "Apartment From", rowIndex));
			Assert.assertEquals(BaseData.getGeoModuleValue("SplitTo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, "Apartment To", rowIndex));

		}

		public void VerifyAcknowlegeReviewMessage() {
			// string reviewMessage =
			// PnxBaseTest.UIMappopup.AcknowledgeWindow.uIErrorInfoTextEdit.Text; // new
			// message shows
			// Assert.assertTrue(reviewMessage.Contains("Review Common Name"));
			popup.acknowledge.okWithExpectedMessage("Review Name Address");
		}

		public void VerifyConfirmationDeleteMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void VerifyRowDeleted() {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid) == 1);
		}

		public void VerifyApartmentNotExist() {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid) == 0);
		}

		public void ClickAtApartmentFrom1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, BaseData.getGeoModuleValue("ApartmentFrom1"));
		}

		public void ClickInactiveCheckbox() {
			uIMapGeo.apartmentEntry.uIInactiveCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyCurrentDateShows() {
			// String rdvd = Randomized.getCurrentDate();
			Assert.assertTrue(uIMapGeo.apartmentEntry.uIInactiveDateEdit.getAttribute("value")
					.contains(Randomized.getCurrentDate()));
			Playback.controlReadyThreadWait();
		}

		public void VerifyInactiveDateInGridUsingApartmentFrom() {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid,
							BaseData.getGeoModuleValue("ApartmentFrom1"), "InActive Date")
					.getText().contains(Randomized.getCurrentDate()));
		}

		public void EnterPremise(String premiseNo) {
			uIMapGeo.apartmentEntry.uIPremiseEdit.click();
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIPremiseEdit.sendKeys(premiseNo);
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIPremiseEdit.sendKeys(Keys.TAB);
		}
		
		public void VerifyAtApartmentFromInGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("ApartmentFrom"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, "Apartment From", rowIndex));
		}

		public void EnterApartmentFrom() {
			{
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.click();
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys("1");
				uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys(Keys.TAB);
				Playback.controlReadyThreadWait();
			}
		}

		public void EnterApartmentTo() {
			Playback.controlReadyThreadWait();
			Playback.threadWait(3000);
			uIMapGeo.apartmentEntry.uIApartmentToEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.BACK_SPACE);
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.DELETE);
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys("9");
		}

		public void EnterPremise() {
			uIMapGeo.apartmentEntry.uIPremiseEdit.click();
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIPremiseEdit.sendKeys(Randomized.randomNumberString(2));
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIPremiseEdit.sendKeys(Keys.TAB);
		}

		public void VerifyNotValidPremiseMessage() {
			Playback.threadWait(2000);
			String AdditionMessage = uIMapGeo.apartmentEntry.uIBottomLeftSideStatusBar.getText();
			Assert.assertTrue(AdditionMessage.contains("5001 - Not a Valid Premise"));

		}

		public void VerifyInvalidInputAcknowlegdeMessage() {
			popup.acknowledge.okWithExpectedMessage("(5019) Invalid input");
		}

		public void DoubleClickAtApartmentFrom() {
			Actions doubleClick = new Actions(Playback.driver);
			doubleClick.doubleClick(objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapGeo.addressIntersection.uIAddressIntersectionResultGrid,
					BaseData.getGeoModuleValue("ApartmentFrom"))).perform();
			doubleClick = null;
			Playback.gridLoadThreadWait();
		}

		public void verifyApartmentFromAndToFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapGeo.apartmentEntry.uIApartmentFromEdit.isEnabled());
			verify.ExpectedValueIsTrue(uIMapGeo.apartmentEntry.uIApartmentToEdit.isEnabled());
		}

		public void EnterApartmentFromAs2() {
			Playback.controlReadyThreadWait();
			Playback.threadWait(3000);
			uIMapGeo.apartmentEntry.uIApartmentFromEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys(Keys.BACK_SPACE);
			uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys(Keys.DELETE);
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIApartmentFromEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentFromEdit.sendKeys("2");
		}

		public void EnterApartmentToAsA() {
			Playback.controlReadyThreadWait();
			Playback.threadWait(3000);
			uIMapGeo.apartmentEntry.uIApartmentToEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.BACK_SPACE);
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.DELETE);
			Playback.controlReadyThreadWait();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.click();
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys("A");
			uIMapGeo.apartmentEntry.uIApartmentToEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void verifyAt5001NotAValidPremiseStatusMsg() {

			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(uIMapGeo.apartmentEntry.uIBottomLeftSideStatusBar.getText(),
					"5001 - Not a Valid Premise");
		}

		public void SaveNClose() {
			uIMapGeo.apartmentEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void verifyInactiveCheckBoxIsSelected(int rowIndex) {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.apartmentEntry.uIApartmentEntryResultGrid, "Inactive", rowIndex);
			verify.ExpectedValueIsTrue(
					gridCell.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
		}

		public void verifyAdditionSuccessfulStatusMessage() {								// Added by Abi
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful", uIMapGeo.apartmentEntry.uIBottomLeftSideStatusBar.getText()); 			
		}

		public void clickRefreshButton() {													// Added by Abi
			uIMapGeo.apartmentEntry.uIRefreshButton.click();
		}

		public void verifyUpdateSuccessfulStatusMessage() {									//Added by Abi
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", uIMapGeo.addressFlagEntry.uIBottomLeftSideStatusBar.getText()); 
		}
	}

	public class Apartment {
		public void ClickAddButton() {
			uIMapGeo.apartment.uIAddNew.click();
		}

		public void ClickAtPremise() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapGeo.apartment.uIApartmentResultGrid,
					BaseData.getGeoModuleValue("Premise"));
		}

		public void CloseScreen() {
			uIMapGeo.apartment.driver.close();
		}

		public void VerifyPremiseViewed(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("Premise"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.apartment.uIApartmentResultGrid, "Premise", rowIndex));
		}

		public void VerifyAtStreetName() {
			Assert.assertTrue(uIMapGeo.apartment.uIStreetNameEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("StreetName")));
		}

	}

	public class ApartmentHelpWindow {
		public void VerifyLocation() {
//			Assert.assertTrue(uIMapGeo.apartmentHelpWindow.uILocationTextView.getAttribute("value")
//					.contains(BaseData.getGeoModuleValue("Premise")));
			Assert.assertTrue(uIMapGeo.apartmentHelpWindow.uILocationTextView.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("StreetName")));
		}

		public void enterAtApartment() {
			uIMapGeo.apartmentHelpWindow.uIApartmentEdit.sendKeys(BaseData.getGeoModuleValue("Apartment"));
		}

		public void EnterAtSplitApartment() {
			uIMapGeo.apartmentHelpWindow.uIApartmentEdit.click();
			uIMapGeo.apartmentHelpWindow.uIApartmentEdit.sendKeys(BaseData.getGeoModuleValue("SplitTo"));
		}

		public void clickUseThisAptNo() {
			uIMapGeo.apartmentHelpWindow.uIUseThisAptNoButton.click();
		}

		public void VerifyApartmentRange() {
			Assert.assertTrue(uIMapGeo.apartmentHelpWindow.uIAppartmentRaneInfoEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("ApartmentFrom")));
			Assert.assertTrue(uIMapGeo.apartmentHelpWindow.uIAppartmentRaneInfoEdit.getAttribute("value")
					.contains(BaseData.getGeoModuleValue("ApartmentTo")));
		}

		public void VerifyInvalidInputAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(5019) Invalid input");
		}

		public void clickUseBaseAddressButton() {
			uIMapGeo.apartmentHelpWindow.uIUseBaseAddressButton.click();
			Playback.controlReadyThreadWait();
		}

		public void closeWindow() {
			uIMapGeo.apartmentHelpWindow.driver.close();

		}

		public void verifyApartmentRangeNotEmpty() {
			String apartment = uIMapGeo.apartmentHelpWindow.uIAppartmentRaneInfoEdit.getAttribute("value");

			verify.ExpectedPropertyValueIsNotEqual(apartment, "");
		}

	}

	public class BatchUpdate {

		public BatchUpdatePopUp batchUpdatePopup;

		public BatchUpdate() {

			if (batchUpdatePopup == null)
				batchUpdatePopup = new BatchUpdatePopUp();
		}

		public void EnterAtStreetName() {
			uIMapGeo.batchUpdate.uIStreetNameEdit.sendKeys(BaseData.getGeoModuleValue("StreetName"));
		}

		public void EnterAtStreetType() {
			uIMapGeo.batchUpdate.uIStreetTypeEdit.sendKeys(BaseData.getGeoModuleValue("StreetType"));
		}

		public void ClickSearchButton() {
			uIMapGeo.batchUpdate.uISearchButton.click();
		}

		public void ClickSelectAllCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapGeo.batchUpdate.uISelectAllCheckBox.click();
		}

		public void SelectCheckboxsInGrid() {
			Playback.controlReadyThreadWait();
			objectIdentification.randomIdentify
					.selectRandomGridRowsCheckboxes(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid);
		}

		public void EnterAtZipCode() {
			uIMapGeo.batchUpdate.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
			uIMapGeo.batchUpdate.uIZipCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtSubZone() {
			uIMapGeo.batchUpdate.uISubZoneEdit.sendKeys(BaseData.getGeoModuleValue("SubZone"));
			uIMapGeo.batchUpdate.uISubZoneEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCivilDistrict() {
			uIMapGeo.batchUpdate.uICivilDistrictEdit.sendKeys(BaseData.getGeoModuleValue("CivilDistrict"));
			uIMapGeo.batchUpdate.uICivilDistrictEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCustom1() {
			uIMapGeo.batchUpdate.uICustom1Edit.sendKeys(BaseData.getGeoModuleValue("Custom1"));
		}

		public void SelectAtPremiseType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.batchUpdate.uIPremiseTypeComboBox,
					BaseData.getGeoModuleValue("PremiseType"));
		}

		public void EnterAtPatrolZone() {
			uIMapGeo.batchUpdate.uIPatrolZoneEdit.sendKeys(BaseData.getGeoModuleValue("PatrolZone"));
			uIMapGeo.batchUpdate.uIPatrolZoneEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtNPACard() {
			uIMapGeo.batchUpdate.uINPACardEdit.sendKeys(BaseData.getGeoModuleValue("NPACard"));
			uIMapGeo.batchUpdate.uINPACardEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtTrack() {
			uIMapGeo.batchUpdate.uITrackNoEdit.sendKeys(BaseData.getGeoModuleValue("Track"));
			uIMapGeo.batchUpdate.uITrackNoEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCensus() {
			uIMapGeo.batchUpdate.uICensusTractEdit.sendKeys(BaseData.getGeoModuleValue("Census"));
		}

		public void ClickUpdateButton() {
			uIMapGeo.batchUpdate.uIUpdateButton.click();
		}

		public void UpdateScreen() {
			uIMapGeo.batchUpdate.uIUpdateButton.click();
			popup.acknowledge.ok();
		}

		public void SelectAtPremiseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.batchUpdate.uIBatchUpdateResultGrid,
					BaseData.getGeoModuleValue("Premise") + "-" + BaseData.getGeoModuleValue("Premise"));
		}

		public void VerifyAtStreetName(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "Street Name", rowIndex)
					.contains(BaseData.getGeoModuleValue("StreetName")));
		}

		public void VerifyAtZipcode(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("ZipCode"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "Zip", rowIndex));
		}

		public void VerifyAtPatrolZone(int rowIndex) {
			Playback.pageLoadThreadWait();
			Assert.assertEquals(BaseData.getGeoModuleValue("PatrolZone"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "PA", rowIndex));
		}

		public void VerifyAtSubZone(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("SubZone"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "Sub", rowIndex));
		}

		public void VerifyAtNPACard(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("NPACard"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "NPA", rowIndex));
		}

		public void VerifyAtCivilDistrict(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("CivilDistrict"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "CD", rowIndex));
		}

		public void VerifyAtTrackNo(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("Track"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "Track#", rowIndex));
		}

		public void VerifyAtCustom(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("Custom1"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "Custom1", rowIndex));
		}

		public void VerifyAtCensus(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("Census"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "Census", rowIndex));
		}

		public void ClickIntersectionCheckBox() {
			uIMapGeo.batchUpdate.uIIntersectionCheckBox.click();
		}

		public void VerifyStreetNameCheckBoxCheckedInGrid(int rowIndex) {
			WebElement primeIsChecked = objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "U", rowIndex)
					.findElement(By.tagName("img"));
			Assert.assertTrue(primeIsChecked.getAttribute("alt").contains("Checked"));
		}

		public void VerifyUpdateSuccessfulAcknowledgeMessage() {													// updated
			popup.acknowledge.okWithExpectedMessage("1003 - Update Successful");	
//			if (Playback.browserType.equals("Chrome")) {
//				popup.acknowledge.okWithExpectedMessage("1003 - Update successful");
//			}
//			popup.acknowledge.okWithExpectedMessage(" 1003 - Update successful");
		}

		public void ClickAtIntersectionStreetNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, BaseData.getGeoModuleValue("InterStreetName"));
		}

		public void RightClickAndSelectAddressMenu() {
			objectIdentification.manualIdentify.selectContextMenuItemInTheGridRow(
					uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, BaseData.getGeoModuleValue("InterStreetName"),
					"Address");
		}

		public void ClickAddCheckbox() {
			uIMapGeo.batchUpdate.uIAddCheckBox.click();
		}

		public void clickAtStreetNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, BaseData.getGeoModuleValue("StreetName"));
		}

		public void VerifyAtPatrolZone1(int rowIndex) {
			Playback.pageLoadThreadWait();
			Assert.assertEquals(BaseData.getGeoModuleValue("PatrolZone1"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, "PA", rowIndex));
		}

		public void ClickAtStreetName1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, BaseData.getGeoModuleValue("StreetName1"));
		}

		public void clickBlankRACheckbox() {
			uIMapGeo.batchUpdate.uIBlankRACheckBox.click();
		}

		public void verifyAllRecordsSelected() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.batchUpdate.uIBatchUpdateResultGrid);
			verify.ExpectedPropertyValueIsEqual(uIMapGeo.batchUpdate.uITotalRecordsSelected.getText(),
					"Total Records Selected :" + rowsCount);
		}

		public void clickRefreshButton() {
			uIMapGeo.batchUpdate.uIRefreshButton.click();
		}

		public void SelectCheckboxsByStreetNameInGrid() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapGeo.batchUpdate.uIBatchUpdateResultGrid, BaseData.getGeoModuleValue("StreetName1"));
		}

		public class BatchUpdatePopUp {
			public void SelectAtPremiseType() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapGeo.batchUpdate.batchUpdatePopup.uIPremiseTypeComboBoxInPopup,
						BaseData.getGeoModuleValue("PremiseType"));
			}

			public void enterAtDistrictField() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uIPatrolZoneEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("District"));
				Playback.gridLoadThreadWait();
				uIMapGeo.batchUpdate.batchUpdatePopup.uIPatrolZoneEditInPopup.sendKeys(Keys.TAB);
			}

			public void enterAtSubDistrictField() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uISubDistrictEdit
						.sendKeys(BaseData.getGeoModuleValue("SubDistrict"));
				Playback.gridLoadThreadWait();
				uIMapGeo.batchUpdate.batchUpdatePopup.uISubDistrictEdit.sendKeys(Keys.TAB);
			}

			public void ClickUpdateButtonInPopup() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uIUpdateButtonInPopup.click();
			}

			public void updateScreenInBatchUpdate() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uIUpdateButtonInPopup.click();
			}

			public void EnterAtZipCode() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uIZipCodeEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
				uIMapGeo.batchUpdate.batchUpdatePopup.uIZipCodeEditInPopup.sendKeys(Keys.TAB);
			}

			public void EnterAtSubZone() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uISubZoneEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("SubZone"));
				uIMapGeo.batchUpdate.batchUpdatePopup.uISubZoneEditInPopup.sendKeys(Keys.TAB);
			}

			public void EnterAtCivilDistrict() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uICivilDistrictEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("CivilDistrict"));
				uIMapGeo.batchUpdate.batchUpdatePopup.uICivilDistrictEditInPopup.sendKeys(Keys.TAB);
			}

			public void EnterAtPatrolZone() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uIPatrolZoneEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("PatrolZone"));
				uIMapGeo.batchUpdate.batchUpdatePopup.uIPatrolZoneEditInPopup.sendKeys(Keys.TAB);
			}

			public void EnterAtNPACard() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uINPACardEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("NPACard"));
				uIMapGeo.batchUpdate.batchUpdatePopup.uINPACardEditInPopup.sendKeys(Keys.TAB);
			}

			public void EnterAtTrack() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uITrackNoEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("Track"));
				uIMapGeo.batchUpdate.batchUpdatePopup.uITrackNoEditInPopup.sendKeys(Keys.TAB);
			}

			public void ClickAddCheckbox() { // Moved from BatchUpdate
				uIMapGeo.batchUpdate.batchUpdatePopup.uIAddCheckBoxInPopup.click(); // Make changes based on
																					// batchupdatepopup

			}

			public void EnterAtCensus() { // Moved from BatchUpdate
				uIMapGeo.batchUpdate.batchUpdatePopup.uICensusTractEditInPopup
						.sendKeys(BaseData.getGeoModuleValue("Census")); // Make changes based on batchupdatepopup
			}


			public void EnterAtCustom1() { // Moved from BatchUpdate
				uIMapGeo.batchUpdate.batchUpdatePopup.uICustom1EditInPopup
						.sendKeys(BaseData.getGeoModuleValue("Custom1")); // Make changes based on batchupdatepopup
			}

			public void UpdateScreen() {
				uIMapGeo.batchUpdate.batchUpdatePopup.uIUpdateButtonInPopup.click();
				popup.acknowledge.ok();
			}
		}
	}

	public class AddressFlag {

		public void EnterAtAddress() {

			uIMapGeo.addressFlag.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
			uIMapGeo.addressFlag.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtOddEvenStreetName() {

			uIMapGeo.addressFlag.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("OddEven").substring(0, 1) + " "
					+ BaseData.getGeoModuleValue("StreetName"));
		}

		public void ClickAtAddress() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressFlag.uIAddressFlagResultGrid, BaseData.getGeoModuleValue("Address"));
		}

		public void ClickSearchButton() {
			uIMapGeo.addressFlag.uISearchButton.click();
		}

		public void ClickAddNew() {
			uIMapGeo.addressFlag.uIAddNew.click();
		}

		public void VerifyNoRecordFoundAcknowledgeMessage() {

			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");

		}

		public void VerifyActiveDateAsCurrentDate(int rowIndex) {
			Assert.assertEquals(Randomized.getCurrentDate("MM/dd/yy"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressFlag.uIAddressFlagResultGrid, "Active", rowIndex));
		}

		public void VerifyAtDisplayCondition(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("DisplayCondition"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressFlag.uIAddressFlagResultGrid, "Display Condition", rowIndex));
		}

		public void VerifyAtAddressInTheGrid() {

			Assert.assertEquals(BaseData.getGeoModuleValue("Address"), objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.addressFlag.uIAddressFlagResultGrid, BaseData.getGeoModuleValue("Address"))
					.getText());
		}

		public void ShowUpdatesOlderThanDaysAs1() {
			uIMapGeo.addressFlag.uIShowUpdatesOlderThanDaysEdit.sendKeys("1");
		}

		public void VerifyLastupdatedDateAsCurrentDate(int rowIndex) {

			Assert.assertEquals(Randomized.getCurrentDate("MM/dd/yy"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressFlag.uIAddressFlagResultGrid, "Last Updated", rowIndex));
		}

		public void VerifyAtAddress1InTheGrid(int rowIndex) {

			Assert.assertEquals(BaseData.getGeoModuleValue("Address1"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressFlag.uIAddressFlagResultGrid, "Address", rowIndex));
		}

		public void EnterAtAddress1() {
			uIMapGeo.addressFlag.uIAddressEdit.clear();
			uIMapGeo.addressFlag.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address1"));
			uIMapGeo.addressFlag.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void ClickAtAddress1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressFlag.uIAddressFlagResultGrid, BaseData.getGeoModuleValue("Address1"));
		}

		public void VerifyAtAddressRowAppearGreyColor(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.addressFlag.uIAddressFlagResultGrid, rowIndex).getAttribute("class")
					.contains("Grey"), "Verify Address appear as Grey color");
		}

		public void VerifyAtAddressRowAppearBlackColor(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRow(uIMapGeo.addressFlag.uIAddressFlagResultGrid, rowIndex).getCssValue("color")
					.contains("0, 0, 0, 1"));

		}

		public void VerifyInactiveColumnEmpty(int rowIndex) {
			Assert.assertEquals("", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.addressFlag.uIAddressFlagResultGrid, "Inactive", rowIndex));
		}

		public void VerifyAtInactiveDateInGrid() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Inactive"),
					objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressFlag.uIAddressFlagResultGrid,
							BaseData.getGeoModuleValue("Inactive"), "Inactive").getText());
		}

		public void enterAtRemarks() {
			// TODO Auto-generated method stub
			uIMapGeo.addressFlag.uIRemarksEdit.sendKeys(BaseData.getGeoModuleValue("Remarks"));
			uIMapGeo.addressFlag.uIRemarksEdit.sendKeys(Keys.TAB);
		}

		public void selectAtDisplayConditions() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.addressFlag.uIDisplayConditionComboBox,
					BaseData.getGeoModuleValue("DisplayCondition"));

		}

		public void reloadAddressFlagPScreen() {
			objectIdentification.manualIdentify.reloadScreen("Address Flag(P)");

		}

		public void enterAtActiveAsDate() {
			uIMapGeo.addressFlag.uIActiveAsDate.sendKeys(BaseData.getGeoModuleValue("ActiveAsDate"));

		}

		public void enterAtActiveAsDateAsCurrentDate() {
			uIMapGeo.addressFlag.uIActiveAsDate.sendKeys(Randomized.getCurrentDate());

		}

		public void enterAtInactiveAfter() {
			uIMapGeo.addressFlag.uIInactiveAfter.sendKeys(BaseData.getGeoModuleValue("InActiveAfter"));

		}

		public void VerifyAddressInfoButtonRedColor() {
			Playback.controlReadyThreadWait();
			String Color = uIMapGeo.addressFlag.uIAddressInfoIconButton.getAttribute("src");

			verify.ExpectedValueIsTrue(Color.contains("Red"));
		}

		public void VerifyAddressInfoButtonYellowColor() {
			String Color = uIMapGeo.addressFlag.uIAddressInfoIconButton.getAttribute("src");
			verify.ExpectedValueIsTrue(Color.contains("Yellow"));
		}

		public void VerifyAddressInfoButtonBlueColor() {
			String Color = uIMapGeo.addressFlag.uIAddressInfoIconButton.getAttribute("src");
			verify.ExpectedValueIsTrue(Color.contains("debug.gif"));
		}

	}

	public class AddressFlagEntry {

		public void ClickAddButton() {
			uIMapGeo.addressFlagEntry.uIAddButton.click();
		}

		public void ClickSaveButton() {
			uIMapGeo.addressFlagEntry.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapGeo.addressFlagEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveAndCloseButton() {
			uIMapGeo.addressFlagEntry.uISaveCloseButton.click();
			// popup.confirm.yes();
		}

		public void EnterAtAddress() {

			uIMapGeo.addressFlagEntry.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
			uIMapGeo.addressFlagEntry.uIAddressEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			uIMapGeo.addressFlagEntry.uIOddFromEdit.click();

		}

		public void VerifyAtAddress() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Address"),
					uIMapGeo.addressFlagEntry.uIAddressEdit.getAttribute("value"));
		}

		public void EnterInactiveAfterDateAsCurrentDate() {
			uIMapGeo.addressFlagEntry.uIInActiveDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void ClearInactiveDate() {
			uIMapGeo.addressFlagEntry.uIInActiveDateEdit.clear();
		}

		public void VerifyAtInactiveAfterInGrid() {
			Assert.assertEquals(BaseData.getGeoModuleValue("InactiveAfter"),
					objectIdentification.manualIdentify.getGridCell(uIMapGeo.addressFlagEntry.uIAddressFlagResultGrid,
							BaseData.getGeoModuleValue("InactiveAfter"), "Inactive After").getText());

		}

		public void VerifyInactiveAfterColumnAppearsAsEmpty(int rowIndex) {
			Assert.assertEquals("",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressFlagEntry.uIAddressFlagResultGrid, "Inactive After", rowIndex),
					"Verify Inactive After column does not have any value");
		}

		public void CloseScreen() {
			uIMapGeo.addressFlagEntry.driver.close();
		}

		public void EnterRemarks() {
			uIMapGeo.addressFlagEntry.uIRemarkEdit.sendKeys("Automation Address Flag Review");
		}

		public void enterAtRemarks() {
			uIMapGeo.addressFlagEntry.uIRemarkBody.sendKeys(BaseData.getGeoModuleValue("Remarks"));
		}

		public void SelectAtDisplayCondition() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapGeo.addressFlagEntry.uIDisplayConditionComboBox,
					BaseData.getGeoModuleValue("DisplayCondition"));
		}

		public void SelectText() {
			uIMapGeo.addressFlagEntry.uITextLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void EnterAtDisplayCondition() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapGeo.addressFlagEntry.uIDisplayConditionComboBox,
					BaseData.getGeoModuleValue("DisplayCondition"));
		}

		public void EnterActiveDate() {
			uIMapGeo.addressFlagEntry.uIActiveAsDateEdit.sendKeys(Keys.TAB);
		}

		public void DeleteFlag() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.addressFlagEntry.uIAddressFlagResultGrid, BaseData.getGeoModuleValue("DisplayCondition"));
		}

		public void EnterSortOrderAs1() {
			uIMapGeo.addressFlagEntry.uISortOrderEdit.sendKeys("1");
		}

		public void VerifyCurrentDateAutoPopulates() {
			Assert.assertEquals(Randomized.getCurrentDate(),
					uIMapGeo.addressFlagEntry.uIActiveAsDateEdit.getAttribute("value"));
		}

		public void VerifyEnterAtLeastOneRowAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(8515) Enter at least one row");
		}

		public void VerifyDisplayConditionAcknowledgeAddMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - Display Condition");
		}

		public void VerifyOddValuesExist() {
			Assert.assertTrue(uIMapGeo.addressFlagEntry.uIOddFromEdit.getAttribute("value") != "");
			Assert.assertTrue(uIMapGeo.addressFlagEntry.uIOddToEdit.getAttribute("value") != "");
		}

		public void VerifyActiveAsCurrentDate(int rowIndex) {
			Assert.assertEquals(Randomized.getCurrentDate(), objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapGeo.addressFlagEntry.uIAddressFlagResultGrid, "Active As of Date", rowIndex));
		}

		public void VerifyAtDisplayCondition(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("DisplayCondition"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressFlagEntry.uIAddressFlagResultGrid, "Display Condition ", rowIndex));
		}

		public void VerifyConfirmationDeleteMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void VerifyDeletedFlagNotFound() {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.addressFlagEntry.uIAddressFlagResultGrid) == 0);
		}

		public void SelectAtDisplayConditionInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressFlagEntry.uIAddressFlagResultGrid, BaseData.getGeoModuleValue("DisplayCondition"));
		}

		public void VerifyAtOddInField() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Odd"),
					uIMapGeo.addressFlagEntry.uIOddFromEdit.getAttribute("value"));
		}

		public void VerifyAtEvenInField() {
			Playback.controlReadyThreadWait();
			Assert.assertEquals(BaseData.getGeoModuleValue("Even"),
					uIMapGeo.addressFlagEntry.uIEvenFromEdit.getAttribute("value"));
		}

		public void VerifyActiveDateAcknowledgeAddMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing - Active Date");
		}

		public void EnterCommentInRichText() {
			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapGeo.addressFlagEntry.uICommentsRichTextEdit).click();
			actions.sendKeys(Randomized.randomString(50)).build().perform();
			Playback.controlReadyThreadWait();
		}

		public void DeleteAddressFlag() {
			uIMapGeo.addressFlagEntry.uIDeleteButton.click();
			popup.confirm.yes();
			// popup.popup.confirm.yes(); // confirmation window not showing
		}

		public void VerifyDeletionSuccessfulMessage() {
			Playback.threadWait(2000);
			String AdditionMessage = uIMapGeo.addressFlagEntry.uIBottomLeftSideStatusBar.getText();
			Assert.assertTrue(AdditionMessage.contains("1004 - Deletion Successful"));

		}

		public void enterActiveDateAsPreviousDate() {
			uIMapGeo.addressFlagEntry.uIActiveAsDateEdit.sendKeys(BaseData.getGeoModuleValue("ActiveAsDate"));
		}

		public void selectIsCriticalCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapGeo.addressFlagEntry.uIIsCriticalCheckBox.click();
		}

		public void selectSharedCheckBox() {
			uIMapGeo.addressFlagEntry.uISharedCheckBox.click();
		}

		public void enterInactiveAfterDateAsPreviousDate() {
			uIMapGeo.addressFlagEntry.uIInActiveDateEdit.sendKeys(BaseData.getGeoModuleValue("InactiveDate"));
		}

		public void clickTextMgmtIcon() {
			uIMapGeo.addressFlagEntry.uITextEditButton.click();
		}

		public void EnterActiveDateAsCurrentDate() {
			uIMapGeo.addressFlagEntry.uIActiveAsDateEdit.sendKeys(Keys.TAB);
		}

		public void ClickPrintButton() {
			uIMapGeo.addressFlagEntry.uPrintButton.click();
		}

		public void verifyNoRecordsFoundAcknowledgeMessage() {

			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");

		}

		public void switchToNarrativeTextFrame() {
//	rteKPITxt_contentIframe

			objectIdentification.windowHandle.switchToFrame(uIMapGeo.addressFlagEntry.uICommentsRichTextEdit);

		}

		public void verifyUpdateSuccessfulStatusMessage() {																					//Added by Abi
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", uIMapGeo.addressFlagEntry.uIBottomLeftSideStatusBar.getText()); 
		}

		public void verifyAdditionSuccessfulStatusMessage() {																				//Added by Abi
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful", uIMapGeo.addressFlagEntry.uIBottomLeftSideStatusBar.getText()); 
					
		}

	}

	public class FastGeo {

		public void VerifyPremiseNo() {
			Assert.assertEquals(uIMapGeo.fastGeo.uIPremiseNoEdit.getAttribute("value"),
					BaseData.getGeoModuleValue("Premise"));
		}

		public void VerifyPrefix() {
			Assert.assertEquals(uIMapGeo.fastGeo.uIPrefixComboBox.getAttribute("value"),
					BaseData.getGeoModuleValue("Prefix"));
		}

		public void VerifyAtStreetName() {
			Assert.assertEquals(uIMapGeo.fastGeo.uIStreetNameEdit.getAttribute("value"),
					BaseData.getGeoModuleValue("StreetName"));
		}

		public void VerifyStreetType() {
			Assert.assertEquals(uIMapGeo.fastGeo.uIStreetTypeEdit.getAttribute("value"),
					BaseData.getGeoModuleValue("StreetType"));
		}

		public void VerifyAtStreetDetails() {
			Assert.assertEquals(uIMapGeo.fastGeo.uIStreetNameEdit.getAttribute("value"),
					BaseData.getGeoModuleValue("StreetName") + " " + BaseData.getGeoModuleValue("StreetType"));
		}

		public void VerifyAtInterStreetDetails() {
			Assert.assertEquals(uIMapGeo.fastGeo.uIIntersectionStreetNameEdit.getAttribute("value"),
					BaseData.getGeoModuleValue("InterStreetName") + " "
							+ BaseData.getGeoModuleValue("InterStreetType"));
		}

		public void enterAtZipCode() {
			uIMapGeo.fastGeo.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
			uIMapGeo.fastGeo.uIZipCodeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtStreet() {
			uIMapGeo.fastGeo.uIStreetNameEdit.clear();
			uIMapGeo.fastGeo.uIStreetNameEdit.sendKeys(
					BaseData.getGeoModuleValue("StreetName") + " " + BaseData.getGeoModuleValue("StreetType"));
		}

		public void EnterAtPremise() {
			uIMapGeo.fastGeo.uIPremiseNoEdit.clear();
			uIMapGeo.fastGeo.uIPremiseNoEdit.sendKeys(BaseData.getGeoModuleValue("Premise"));
		}

		public void enterAtCommonName() {
			uIMapGeo.fastGeo.uICommonNameEdit.sendKeys(BaseData.getGeoModuleValue("CommonName"));
		}

		public void GetCSZ(String CSZ) // out
		{
			CSZ = uIMapGeo.fastGeo.uIZipCodeDescriptionEdit.getText();
		}

		public void VerifyGPSButton() {
			uIMapGeo.fastGeo.uIVerifyAndGetGPSButton.click();
		}

		public void clickSaveAndUseAddress() {
			uIMapGeo.fastGeo.uISaveAndUseThisAddressButton.click();
			Playback.controlReadyThreadWait();
		}

		public void GetLatituteValue(String Latitute, String Longitute) // out
		{
			Latitute = uIMapGeo.fastGeo.uILatitudeEdit.getAttribute("value");
			Longitute = uIMapGeo.fastGeo.uILongituteEdit.getAttribute("value");

			Playback.setTestContextAttribute("Latitute", Latitute);
			Playback.setTestContextAttribute("Longitute", Longitute);
		}

		public void VerifyInactiveAddressConfirmMessage() {
			popup.confirm.noWithExpectedMessage("(5094) This street is inactive . Do you want to active and continue?");
		}

		public void VerifyAddressAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1002 - Addition Successful");
			}
			popup.acknowledge.okWithExpectedMessage(" 1002 - Addition Successful");
		}

		public void CloseScreen() {
			uIMapGeo.fastGeo.driver.close();
		}

		public void VerifyAtIntStreetName() {
			Assert.assertEquals(uIMapGeo.fastGeo.uIIntersectionStreetNameEdit.getAttribute("value"),
					BaseData.getGeoModuleValue("IntStreet2"));
		}

		public void ClickRefreshMapButton() {
			uIMapGeo.fastGeo.uIRefreshMapButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAddressConfirmMessage() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			popup.confirm
					.yesWithExpectedMessage("(5108) Do you want to add this Address in the Selected Municipality?");

			// popup.confirm.yesWithExpectedMessage("(5108) Do you want to add this Address
			// in the Selected Municipality?");

//			if (Playback.browserType.equals("Chrome")) {
//				String warningMessage = Playback.driver.switchTo().alert().getText();
//				Assert.assertTrue(warningMessage
//						.contains("(5108) Do you want to add this Address in the Selected Municipality?"));
//				popup.confirm.yes();
//			} else {
//				String ConfirmMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
//				Assert.assertTrue(ConfirmMessage
//						.contains("(5108) Do you want to add this Address in the Selected Municipality?"));
//				popup.confirm.yes();
//			}
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void GetLatLongValue(String LatituteLongitute) // out
		{
			LatituteLongitute = uIMapGeo.fastGeo.uILatLongValueTextEdit.getText();
			Playback.setTestContextAttribute("LatituteLongitute", LatituteLongitute);
		}

		public void enterAtPremiseNo() {
			uIMapGeo.fastGeo.uIPremiseNoEdit.sendKeys(BaseData.getGeoModuleValue("PremiseNo"));
			uIMapGeo.fastGeo.uIPremiseNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtStreetName() {
			String streetName = BaseData.getGeoModuleValue("StreetName");
			uIMapGeo.fastGeo.uIStreetNameEdit.sendKeys(streetName);
		}

		public void clickTrackingLooUpIcon() {
			uIMapGeo.fastGeo.uITrackingLookUpIcon.click();
			Playback.pageLoadThreadWait();
		}

		public void selectAtPremiseType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.fastGeo.uIPremiseTypeComboBox,
					BaseData.getGeoModuleValue("PremiseType"));
			Playback.controlReadyThreadWait();
		}

		public void clickPatrolZoneLooUpIcon() {
			uIMapGeo.fastGeo.uIPatrolZoneLookUpIcon.click();
			Playback.pageLoadThreadWait();

		}

		public void clickNPACardLooUpIcon() {
			uIMapGeo.fastGeo.uINPACardLookUpIcon.click();
			Playback.pageLoadThreadWait();

		}

		public void clickCivilDistrictLooUpIcon() {
			uIMapGeo.fastGeo.uICivilDistrictLookUpIcon.click();
			Playback.pageLoadThreadWait();

		}

		public void selectAtVotingDistrict() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.fastGeo.uIVotingDistrictComboBox,
					BaseData.getGeoModuleValue("VotingDistrict"));
			Playback.controlReadyThreadWait();
		}

		public void enterTrackingAsTB() {
			uIMapGeo.fastGeo.uITrackingEdit.clear();
			uIMapGeo.fastGeo.uITrackingEdit.sendKeys("TB");
			uIMapGeo.fastGeo.uITrackingEdit.sendKeys(Keys.TAB);
			Playback.popupThreadWait();

		}

		public void selectPremiseType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.fastGeo.uIPremiseTypeComboBox, 2);
			Playback.gridLoadThreadWait();

		}

		public void enterPatrolZoneAsPA() {
			uIMapGeo.fastGeo.uIPatrolZoneEdit.clear();
			uIMapGeo.fastGeo.uIPatrolZoneEdit.sendKeys("PA");
			uIMapGeo.fastGeo.uIPatrolZoneEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void enterSubZoneAsSA() {
			uIMapGeo.fastGeo.uISubZoneEdit.clear();
			uIMapGeo.fastGeo.uISubZoneEdit.sendKeys("SA");
			uIMapGeo.fastGeo.uISubZoneEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void enterAtNPACard() {
			uIMapGeo.fastGeo.uINPACardEdit.clear();
			uIMapGeo.fastGeo.uINPACardEdit.sendKeys(BaseData.getGeoModuleValue("NPACard"));
			uIMapGeo.fastGeo.uINPACardEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void enterAtCivilDistrict() {
			uIMapGeo.fastGeo.uICivilDistrictEdit.clear();
			uIMapGeo.fastGeo.uICivilDistrictEdit.sendKeys(BaseData.getGeoModuleValue("CivilDistrict"));
			uIMapGeo.fastGeo.uICivilDistrictEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void selectVotingDistrictAsVD() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.fastGeo.uIVotingDistrictComboBox,
					"VD - District");
			Playback.gridLoadThreadWait();

		}

	}

	public class StreetUpdate {
		public void EnterAtAltStreet() {
			uIMapGeo.streetUpdate.uIAltStreetNameEdit.sendKeys(BaseData.getGeoModuleValue("AlterStreetName"));
		}

		public void EnterAtAltStreetType() {
			uIMapGeo.streetUpdate.uIAltStreetTypeEdit.sendKeys(BaseData.getGeoModuleValue("AlterStreetType"));
			uIMapGeo.streetUpdate.uIAltStreetTypeEdit.sendKeys(Keys.TAB);
		}

		public void ClickMainStreetInactive() {
			uIMapGeo.streetUpdate.uIMainInactiveCheckBox.click();
		}

		public void ClickAltStreetInactive() {
			uIMapGeo.streetUpdate.uIAltInactiveCheckBox.click();
		}

		public void ClickAddButton() {
			uIMapGeo.streetUpdate.uIAddButton.click();
		}

		public void ClickReplaceCheckBox() {
			uIMapGeo.streetUpdate.uIReplaceCheckBox.click();
		}

		public void ClickSaveButton() {
			uIMapGeo.streetUpdate.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapGeo.streetUpdate.uISaveButton.click();
			popup.confirm.yes();
		}

		public void CloseStreetUpdateScreen() {
			uIMapGeo.streetUpdate.driver.close();
		}

		public void SaveNCloseScreen() {
			uIMapGeo.streetUpdate.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void VerifyMainStreetName() {
			Assert.assertEquals(BaseData.getGeoModuleValue("StreetName"),
					uIMapGeo.streetUpdate.uIMainStreetNameEdit.getAttribute("value"));
		}

		public void VerifyMainStreetType() {
			Assert.assertEquals(BaseData.getGeoModuleValue("StreetType"),
					uIMapGeo.streetUpdate.uIMainStreetTypeEdit.getAttribute("value"));
		}

		public void VerifyAlterStreetNameAddedInTheGird(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("AlterStreetName"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetUpdate.uIStreetUpdateResultGrid, "Street", rowIndex));

		}

		public void VerifyAcknowledgeAddMessage() {
			popup.acknowledge.okWithExpectedMessage("(5002) Required Street Name Entry");
		}

		public void ClickAtAltStreetName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.streetUpdate.uIStreetUpdateResultGrid, BaseData.getGeoModuleValue("AlterStreetName"));
		}

		public void VerifyAtAltStreetName() {
			Assert.assertEquals(BaseData.getGeoModuleValue("AlterStreetName"),
					uIMapGeo.streetUpdate.uIAltStreetNameEdit.getAttribute("value"));
		}

		public void VerifyAtAltStreetType() {
			Assert.assertEquals(BaseData.getGeoModuleValue("AlterStreetType"),
					uIMapGeo.streetUpdate.uIAltStreetTypeEdit.getAttribute("value"));
		}

		public void VerifyReplaceCheckBoxChecked(int rowIndex) {
			Playback.popupThreadWait();
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.streetUpdate.uIStreetUpdateResultGrid, "Replace", rowIndex)
					.findElement(By.tagName("img")).getAttribute("title").contains("Checked"));
		}

		public void VerifyAlterStreetTypeAddedInTheGird(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.streetUpdate.uIStreetUpdateResultGrid, "Street Type", rowIndex)
					.contains(BaseData.getGeoModuleValue("AlterStreetType")));
		}

		public void VerifyReplaceCheckBoxUnchecked(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.streetUpdate.uIStreetUpdateResultGrid, "Replace", rowIndex)
					.findElement(By.tagName("img")).getAttribute("title").contains("Unchecked"));
		}

		public void verifyPremiseFieldsAreUnEditable() {

			verify.ExpectedValueIsFalse(uIMapGeo.streetUpdate.uIPremieOddEdit.isEnabled());
			verify.ExpectedValueIsFalse(uIMapGeo.streetUpdate.uIPremieEvenEdit.isEnabled());
		}

		public void clickRefreshButton() {																							        // Added by Abi
			uIMapGeo.streetUpdate.uIRefreshButton.click();
		}

		public void verifyAdditionSuccessfulStatusMessage() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful", uIMapGeo.streetUpdate.uIBottomLeftSideStatusBar.getText());  // Added by Abi
		}

		public void verifyUpdateSuccessfulStatusMessage() {
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", uIMapGeo.streetUpdate.uIBottomLeftSideStatusBar.getText()); 	// Added by Abi	
			
		}
		
		
	}

	public class AddressIntersection2040 {
		public AddressIntersectionMainTab addressIntersectionMainTab = null;
		public PoliceTab policeTab = null;
		public FireTab fireTab = null;

		public AddressIntersection2040() {
			if ((this.addressIntersectionMainTab == null)) {
				this.addressIntersectionMainTab = new AddressIntersectionMainTab();
			}
			if ((this.policeTab == null)) {
				this.policeTab = new PoliceTab();
			}
			if ((this.fireTab == null)) {
				this.fireTab = new FireTab();
			}
		}

		public void switchToMainTab() {
			uIMapGeo.addressIntersection2040.uIMainTab.click();
			Playback.pageLoadThreadWait();
		}

		public void switchToPoliceTab() {
			uIMapGeo.addressIntersection2040.uIPoliceTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmGcRangeMJ");
		}

		public void switchToFireTab() {

			uIMapGeo.addressIntersection2040.uIFireTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmGcRangeMJFire");
		}

		public void VerifyAtStreetNameAndStreetType() {
			Assert.assertTrue(uIMapGeo.addressIntersection2040.uIStreetNameEdit.getAttribute("value").contains(
					BaseData.getGeoModuleValue("StreetName") + " " + BaseData.getGeoModuleValue("StreetType")));
		}

		public void VerifyAtPremise() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Premise"),
					uIMapGeo.addressIntersection2040.uIPremiseOddFromEdit.getAttribute("value"));
		}

		public void VerifyAtPremiseOdd() {

			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseOdd").substring(0, 1),
					uIMapGeo.addressIntersection2040.uIPremiseOddFromEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseOdd").substring(2),
					uIMapGeo.addressIntersection2040.uIPremiseOddToEdit.getAttribute("value"));
		}

		public void VerifyAtPremiseEven() {
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseEven").substring(0, 1),
					uIMapGeo.addressIntersection2040.uIPremiseEvenFromEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseEven").substring(2),
					uIMapGeo.addressIntersection2040.uIPremiseEvenToEdit.getAttribute("value"));
		}

		public void SaveNClose() {
			uIMapGeo.addressIntersection2040.uISaveAndCloseButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapGeo.addressIntersection2040.driver.close();
		}

		public void Save() {
			uIMapGeo.addressIntersection2040.uISaveButton.click();
			popup.confirm.yes();
		}
		public void clickRefreshButton()											// Added by Abi
		{
			uIMapGeo.addressIntersection2040.uIRefreshButton.click();
		}

		public void verifyUpdateSuccessfulStatusMessage() {
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", uIMapGeo.streetUpdate.uIBottomLeftSideStatusBar.getText()); 	// Added by Abi	
		}

	}

	public class AddressIntersectionMainTab {
		public void VerifyAtPremiseType() {
			Assert.assertEquals(BaseData.getGeoModuleValue("PremiseType"),
					objectIdentification.manualIdentify.getDropDownSelectedItem(
							uIMapGeo.addressIntersection2040.addressIntersectionMainTab.uIPremiseTypeComboBox));
		}

		public void VerifyAtCensus() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Census"),
					uIMapGeo.addressIntersection2040.addressIntersectionMainTab.uICensusEdit.getAttribute("value"));
		}

		public void clickMapButton() {
			uIMapGeo.addressIntersection2040.addressIntersectionMainTab.uIMapButton.click();
		}

		public void clickGetButton() {
			uIMapGeo.addressIntersection2040.addressIntersectionMainTab.uIGetButton.click();
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(5099) Do you want update each premise Lat/Long manually?");
			} else {
				popup.switchToConfirm();
				Playback.gridLoadThreadWait();
				popup.confirm.yesWithExpectedMessage("(5099) Do you want update each premise Lat/Long manually?");
			}

		}

		public void verifyCensusTrackFieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapGeo.addressIntersection2040.addressIntersectionMainTab.uICensusEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void verifyAtCensusTract() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CensusTract"),
					uIMapGeo.addressIntersection2040.addressIntersectionMainTab.uICensusEdit.getAttribute("value"));

		}

	}

	public class PoliceTab {

		public void EnterAtTrackingNo() {
			uIMapGeo.addressIntersection2040.policeTab.uITrackingNoCodedEdit
					.sendKeys(BaseData.getGeoModuleValue("Track"));
			uIMapGeo.addressIntersection2040.policeTab.uITrackingNoCodedEdit.sendKeys(Keys.TAB);
		}

		public void ClickTrackingNoADDButton() {

			uIMapGeo.addressIntersection2040.policeTab.uITrackingNoAddButton.click();
		}

		public void EnterAtBorderPZ() {
			uIMapGeo.addressIntersection2040.policeTab.uIBorderPZCodedEdit
					.sendKeys(BaseData.getGeoModuleValue("BorderPZ"));
			uIMapGeo.addressIntersection2040.policeTab.uIBorderPZCodedEdit.sendKeys(Keys.TAB);
		}

		public void ClickBorderPZADDButton() {

			uIMapGeo.addressIntersection2040.policeTab.uIBorderPZAddButton.click();
		}

		public void Save() {
			uIMapGeo.addressIntersection2040.policeTab.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void VerifyAtPatrolZone() {
			Assert.assertEquals(BaseData.getGeoModuleValue("PatrolZone"),
					uIMapGeo.addressIntersection2040.policeTab.uIPatrolZoneEdit.getAttribute("value"));
		}

		public void VerifyAtCivilDistrict() {
			Assert.assertEquals(BaseData.getGeoModuleValue("CivilDistrict"),
					uIMapGeo.addressIntersection2040.policeTab.uICivilDistrictEdit.getAttribute("value"));
		}

		public void VerifyAtSubZone() {
			Assert.assertEquals(BaseData.getGeoModuleValue("SubZone"),
					uIMapGeo.addressIntersection2040.policeTab.uISubZoneEdit.getAttribute("value"));
		}

		public void VerifyAtNPACard() {
			Assert.assertEquals(BaseData.getGeoModuleValue("NPACard"),
					uIMapGeo.addressIntersection2040.policeTab.uINPACardEdit.getAttribute("value"));
		}

		public void VerifyAtCustom1() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Custom1"),
					uIMapGeo.addressIntersection2040.policeTab.uICustom1Edit.getAttribute("value"));
		}

		public void VerifyAtTrackNo(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("Track"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection2040.policeTab.uITrackingDetailsResultGrid, "Track#",
							rowIndex));
		}

		public void VerifyAtBroderPZ(int rowIndex) {

			Assert.assertEquals(BaseData.getGeoModuleValue("BorderPZ"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection2040.policeTab.uIBorderPZTable, "Border PZ", rowIndex));

		}

		public void DeleteTrackingNoInTheGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.policeTab.uITrackingDetailsResultGrid,
					BaseData.getGeoModuleValue("Track"));
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
			uIMapGeo.addressIntersection2040.policeTab.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void DeleteBorderPZInTheGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.policeTab.uIBorderPZTable, BaseData.getGeoModuleValue("BorderPZ"));
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
			uIMapGeo.addressIntersection2040.policeTab.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void ClickAtPatrolSubInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.policeTab.uIMultiJurisGridTable,
					BaseData.getGeoModuleValue("PatrolZone") + ", " + BaseData.getGeoModuleValue("SubZone"));
		}

		public void ClickAtNPACardInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.policeTab.uIMultiJurisGridTable,
					BaseData.getGeoModuleValue("NPA Card"));
		}

		public void ClickAtCivilDistrictInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.policeTab.uIMultiJurisGridTable,
					BaseData.getGeoModuleValue("CivilDistrict"));
		}

		public void EnterAtTowZone() {
			uIMapGeo.addressIntersection2040.policeTab.uITowAreaCodedEdit
					.sendKeys(BaseData.getGeoModuleValue("BorderPZ"));
			uIMapGeo.addressIntersection2040.policeTab.uITowAreaCodedEdit.sendKeys(Keys.TAB);
		}

	}

	public class FireTab {

		public void VerifyAtMutualAidInTheGrid(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("MutualAid"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection2040.fireTab.uIMutualAidTable, "Mutual Aid", rowIndex));
		}

		public void VerifyAtTrackingNoInTheGird(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("FireTrack"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection2040.fireTab.uITrackingNoTable, "Track#", rowIndex));
		}

		public void EnterAtMutualAid() {
			uIMapGeo.addressIntersection2040.fireTab.uIMutualAidCodedEdit
					.sendKeys(BaseData.getGeoModuleValue("MutualAid"));
			uIMapGeo.addressIntersection2040.fireTab.uIMutualAidCodedEdit.sendKeys(Keys.TAB);
		}

		public void ClickMutualAidAddButton() {
			uIMapGeo.addressIntersection2040.fireTab.uIMutualAidAddButton.click();
		}

		public void EnterAtTrackingNo() {
			uIMapGeo.addressIntersection2040.fireTab.uITrackingNoCodedEdit
					.sendKeys(BaseData.getGeoModuleValue("FireTrack"));
			uIMapGeo.addressIntersection2040.fireTab.uITrackingNoCodedEdit.sendKeys(Keys.TAB);
		}

		public void ClickTrackingNoADDButton() {
			uIMapGeo.addressIntersection2040.policeTab.uITrackingNoAddButton.click();
		}

		public void Save() {
			uIMapGeo.addressIntersection2040.policeTab.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void DeleteMutualAidInTheGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.fireTab.uIMutualAidTable, BaseData.getGeoModuleValue("MutualAid"));
			if (Playback.browserType.contains("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
			uIMapGeo.addressIntersection2040.fireTab.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void DeleteFireTrackInTheGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.fireTab.uITrackingNoTable,
					BaseData.getGeoModuleValue("MutualAid"));
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
			uIMapGeo.addressIntersection2040.fireTab.uISaveButton.click();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
		}

		public void EnterAtRANo() {
			uIMapGeo.addressIntersection2040.fireTab.uIRANoCodedEdit.sendKeys(BaseData.getGeoModuleValue("RANo"));
			uIMapGeo.addressIntersection2040.fireTab.uIRANoCodedEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtRANo1() {
			uIMapGeo.addressIntersection2040.fireTab.uIRANoCodedEdit.clear();
			uIMapGeo.addressIntersection2040.fireTab.uIRANoCodedEdit.sendKeys(BaseData.getGeoModuleValue("RANo1"));
			uIMapGeo.addressIntersection2040.fireTab.uIRANoCodedEdit.sendKeys(Keys.TAB);
		}

		public void ClickMultijurisAddButton() {
			uIMapGeo.addressIntersection2040.fireTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void GetRADescription(String uIRADescription) // out
		{
			uIRADescription = uIMapGeo.addressIntersection2040.fireTab.uIRANoDescriptionEdit.getAttribute("value");
		}

		public void VerifyRunCardAsRADescription(String uIRADescription, int rowCount) {
			Assert.assertEquals(uIRADescription, objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapGeo.addressIntersection2040.fireTab.uIMultiJurisGridTable, "Run Card", rowCount));
		}

		public void ClickRunCardUsingRADescriptionInGrid(String uIRADescription) {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.addressIntersection2040.fireTab.uIMultiJurisGridTable, uIRADescription);
			Playback.controlReadyThreadWait();
		}

		public void ClickTableRowInGrid(int rowCount) {
			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapGeo.addressIntersection2040.fireTab.uIMultiJurisGridTable, rowCount);
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtPropertyUse() {
			Assert.assertEquals(BaseData.getGeoModuleValue("PropertyUse"),
					uIMapGeo.addressIntersection2040.fireTab.uIPropertyUseEdit.getAttribute("value"));
		}

		public void VerifyAtPropertyUseInTheGird(int rowIndex) {

			Assert.assertEquals(BaseData.getGeoModuleValue("PropertyUse"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.addressIntersection2040.fireTab.uIMultiJurisGridTable, "Property Use", rowIndex));
		}

	}

	public class HazMatFlags {

		public void EnterAtLocation() {
			uIMapGeo.hazMatFlags.uILocationEdit.sendKeys(BaseData.getGeoModuleValue("Location"));
			uIMapGeo.hazMatFlags.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtChemicalName() {
			uIMapGeo.hazMatFlags.uILocationEdit.clear();
			uIMapGeo.hazMatFlags.uIChemicalNameEdit.sendKeys(BaseData.getGeoModuleValue("Chemical"));
			uIMapGeo.hazMatFlags.uIChemicalNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtSystemIDNo() {
			uIMapGeo.hazMatFlags.uISystemIDNoEdit.sendKeys(BaseData.getGeoModuleValue("SystemIDNo"));
			uIMapGeo.hazMatFlags.uISystemIDNoEdit.sendKeys(Keys.TAB);
		}

		public void ClickSearchButton() {
			uIMapGeo.hazMatFlags.uISearchButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAtLocation() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.hazMatFlags.uIHazMatFlagResultGrid, BaseData.getGeoModuleValue("Location"));
		}

		public void VerifyAtLocation(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("Location"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.hazMatFlags.uIHazMatFlagResultGrid, "Location", rowIndex));
		}

		public void VerifyAtChemicalName(int rowIndex) {
			Assert.assertTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.hazMatFlags.uIHazMatFlagResultGrid, "DOT ID/Chemical#", rowIndex)
					.contains(BaseData.getGeoModuleValue("Chemical")));
		}

		public void VerifyAtDOTIDChemicalNo(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("DOTIDChemicalNo"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.hazMatFlags.uIHazMatFlagResultGrid, "DOT ID/Chemical#", rowIndex));
		}

		public void VerifyAtGeneralLocation(int rowIndex) {
			Assert.assertEquals(BaseData.getGeoModuleValue("GeneralLocation"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.hazMatFlags.uIHazMatFlagResultGrid, "General Location", rowIndex));
		}

		public void ClickAddNewButton() {
			uIMapGeo.hazMatFlags.uIAddNewButton.click();
		}

		public void ClickInactiveCheckBox() {
			uIMapGeo.hazMatFlags.uIInactiveCheckBox.click();
		}

	}

	public class HazMatFlagEntry {
		public ChemicalsTab chemicalsTab = null;
		public LocationRemarksTab locationRemarksTab = null;

		public HazMatFlagEntry() {
			if (this.chemicalsTab == null)
				this.chemicalsTab = new ChemicalsTab();
			if (this.locationRemarksTab == null)
				this.locationRemarksTab = new LocationRemarksTab();
		}

		public void ClickAllTabs() {
			uIMapGeo.hazMatFlagEntry.uIChemicalsTab.click();
			Playback.pageLoadThreadWait();
			uIMapGeo.hazMatFlagEntry.uILocationRemarkTab.click();
			Playback.pageLoadThreadWait();
		}

		public void VerifyLocation() {
			Assert.assertEquals(BaseData.getGeoModuleValue("Location"),
					uIMapGeo.hazMatFlagEntry.uILocationEdit.getAttribute("value"));
		}

		public void switchToChemicalTab() {
			uIMapGeo.hazMatFlagEntry.uIChemicalsTab.click();
			Playback.pageLoadThreadWait();
		}

		public void CloseScreen() {
			uIMapGeo.hazMatFlagEntry.driver.close();
		}

		public void EnterAtLocation() {
			uIMapGeo.hazMatFlagEntry.uILocationEdit.sendKeys(BaseData.getGeoModuleValue("Location"));
			uIMapGeo.hazMatFlagEntry.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void SaveCloseScreen() {
			uIMapGeo.hazMatFlagEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void Save() {
			uIMapGeo.hazMatFlagEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveButton() {
			uIMapGeo.hazMatFlagEntry.uISaveButton.click();
		}

		public void verify1018RequiredEntriesAreMissing() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void verifyAdditionSuccessfulMessageInFooter() {
			String text = uIMapGeo.hazMatFlagEntry.uIFooterStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1002 - Addition successful  ");
		}

		public void switchToLocationRemarks() {
			uIMapGeo.hazMatFlagEntry.uILocationRemarkTab.click();
			Playback.pageLoadThreadWait();
		}

		public class ChemicalsTab {
			public void ClickChemicalID(int rowIndex) {
				objectIdentification.manualIdentify
						.selectGridTableRow(uIMapGeo.hazMatFlagEntry.chemicalsTab.uIChemicalsTabResultGrid, rowIndex);
			}

			public void EnterAtChemicalName() {
				uIMapGeo.hazMatFlagEntry.chemicalsTab.uIChemicalNameEdit
						.sendKeys(BaseData.getGeoModuleValue("ChemicalName"));

			}

			public void VerifyChemicalName() {
				verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Chemical"),
						uIMapGeo.hazMatFlagEntry.chemicalsTab.uIChemicalNameEdit.getAttribute("value"));

			}

			public void ClickUpdateButton() {
				uIMapGeo.hazMatFlagEntry.chemicalsTab.uIAddButton.click();
			}

			public void ClickAddButton() {
				uIMapGeo.hazMatFlagEntry.chemicalsTab.uIAddButton.click();
			}

			public void SelectAtGeneralLocation() {
				objectIdentification.manualIdentify.selectDropDownOption(
						uIMapGeo.hazMatFlagEntry.chemicalsTab.uIGeneralLocationComboBox,
						BaseData.getGeoModuleValue("GeneralLocation"));

			}

			public void VerifyAtInactiveDate() {
				verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("InactiveDate"),
						uIMapGeo.hazMatFlagEntry.chemicalsTab.uIInactiveDateEdit.getText());
			}

			public void VerifyAtChemicalID(int rowIndex) {
				verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("ID"),
						objectIdentification.manualIdentify.getGridCellInnerText(
								uIMapGeo.hazMatFlagEntry.chemicalsTab.uIChemicalsTabResultGrid, "ID", rowIndex));
			}


			public void VerifyInactiveCommonNameRowColor(int rowIndex) {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapGeo.hazMatFlagEntry.chemicalsTab.uIChemicalsTabResultGrid, rowIndex)
						.getAttribute("class").contains("Grey"));
			}

			public void enterAtContainerType() {
				uIMapGeo.hazMatFlagEntry.chemicalsTab.uIContainerTypeEdit
						.sendKeys(BaseData.getGeoModuleValue("ContainerType"));
				uIMapGeo.hazMatFlagEntry.chemicalsTab.uIContainerTypeEdit.sendKeys(Keys.TAB);
			}
		}

		public class LocationRemarksTab {

			public void enterRichTextEditAsTestAutomation() {

				uIMapGeo.hazMatFlagEntry.locationRemarksTab.uIRichTextFrame.sendKeys("Test Automation");
			}

			public String readRichText() {

				objectIdentification.windowHandle
						.switchToFrame(uIMapGeo.hazMatFlagEntry.locationRemarksTab.uIRichTextFrame);
				String text = uIMapGeo.hazMatFlagEntry.locationRemarksTab.uIRichTextBody.getText();
				return text;
			}

			public void verifyRichText(String text) {
				verify.ExpectedPropertyValueIsEqual(text, "Test Automation");

			}

		}

		public void clickRefreshButton() {																// Added by Abi
			uIMapGeo.hazMatFlagEntry.uIResetButton.click();
		}
		public void verifyUpdateSuccessfulMessageInFooter() {											// Added by Abi
			String text = uIMapGeo.hazMatFlagEntry.uIFooterStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1003 - Update successful  ");
		}

	}

	public class HydrantSearch {
		public void EnterAtHydrantID() {
			uIMapGeo.hydrantSearch.uIHydantIDEdit.sendKeys(BaseData.getGeoModuleValue("HydrantID"));
		}

		public void ClickDryHydrant() {
			uIMapGeo.hydrantSearch.uIHydantIDEdit.clear();
			uIMapGeo.hydrantSearch.uIDryHydrantCheckBox.click();
		}

		public void EnterAtWaterGridNo() {
			uIMapGeo.hydrantSearch.uIDryHydrantCheckBox.click();
			uIMapGeo.hydrantSearch.uIWaterGridNoEdit.sendKeys(BaseData.getGeoModuleValue("WaterGrid"));
		}

		public void SelectAtHydrantClass() {
			uIMapGeo.hydrantSearch.uIWaterGridNoEdit.clear();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.hydrantSearch.uIHydrantClassComboBox,
					BaseData.getGeoModuleValue("HydrantClass"));
		}

		public void SelectAsModel() {
			// ObjectIdentification.ManualIdentify.selectDropDownOption(uIMapGeo.HydrantSearch.uIHydrantClassComboBox,
			// "Centurion");
			uIMapGeo.hydrantSearch.uIHydrantClassComboBox.sendKeys("Centurion");
		}

		public void clickSearch() {
			uIMapGeo.hydrantSearch.uISearch.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickAtHydrantID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapGeo.hydrantSearch.uIHydrantResultGrid,
					BaseData.getGeoModuleValue("HydrantID"));
		}

		public void VerifyAtHydrantID(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("HydrantID"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.hydrantSearch.uIHydrantResultGrid,
							"Hydrant ID", rowIndex));
		}

		public void VerifyAvailableChecked(int rowIndex) {
			WebElement AvailableChecked = objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.hydrantSearch.uIHydrantResultGrid, "Available", rowIndex)
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(AvailableChecked.getAttribute("alt").contains("Checked"));
		}

		public void VerifyDryChecked(int rowIndex) {
			WebElement DryChecked = objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.hydrantSearch.uIHydrantResultGrid, "Dry", rowIndex)
					.findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(DryChecked.getAttribute("alt").contains("Checked"));
		}

		public void VerifyAtAddress(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Address"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.hydrantSearch.uIHydrantResultGrid,
							"Address", rowIndex));
		}

		public void VerifyAtHydrantClass(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("HydrantClass"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapGeo.hydrantSearch.uIHydrantResultGrid,
							"Class", rowIndex));
		}

		public void ClickAddNew() {
			uIMapGeo.hydrantSearch.uIAddNew.click();
			Playback.gridLoadThreadWait();
		}

		public void SelectLocationAsAddress() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.hydrantSearch.uILocationCombobox,
					"Address");
		}

		public void EnterAtStreet() {
			uIMapGeo.hydrantSearch.uIStreetEdit.sendKeys(BaseData.getGeoModuleValue("Street"));
		}

		public void selectRowByAtAddres() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapGeo.hydrantSearch.uIHydrantResultGrid,
					BaseData.getGeoModuleValue("Address"));
		}

		public void verifyShowMapDisplay() {
			verify.ExpectedValueIsTrue(uIMapGeo.hydrantSearch.uISearch.isDisplayed());
		}

		public void verifyAddNewDisplay() {
			verify.ExpectedValueIsTrue(uIMapGeo.hydrantSearch.uIAddNew.isDisplayed());
		}

		public void verifyPrintIconDisplay() {
			verify.ExpectedValueIsTrue(uIMapGeo.hydrantSearch.uIPrintIcon.isDisplayed());
		}

		public void verifyExcelIconDisplay() {
			verify.ExpectedValueIsTrue(uIMapGeo.hydrantSearch.uIExcelIcon.isDisplayed());
		}
	}

	public class HydrantEntry {
		public SpecificationTab specificationTab = null;

		public HydrantEntry() {
			if (this.specificationTab == null)
				this.specificationTab = new SpecificationTab();
		}

		public void VerifyAtHydrantId() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("HydrantID"),
					uIMapGeo.hydrantEntry.uIHydantIDEdit.getAttribute("value"));
		}

		public void VerifyAtWaterGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("WaterGrid"),
					uIMapGeo.hydrantEntry.uIWaterGridNoEdit.getAttribute("value"));
		}

		public void VerifyDryHydrantChecked() {
			System.out.println(uIMapGeo.hydrantEntry.uIDryHydrantCheckBox.getAttribute("checked"));
			verify.ExpectedValueIsTrue(
					uIMapGeo.hydrantEntry.uIDryHydrantCheckBox.getAttribute("checked").contains("true"));

		}

		public void VerifyAsModel() {
			verify.ExpectedPropertyValueIsEqual("Centurion",
					objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapGeo.hydrantEntry.uIModelComboBox));
		}

		public void VerifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Address"),
					uIMapGeo.hydrantEntry.uILocationEdit.getAttribute("value"));
		}

		public void ClickAllTabs() {
			uIMapGeo.hydrantEntry.uISpecificationTab.click();
			Playback.gridLoadThreadWait();
			uIMapGeo.hydrantEntry.uIActivityTab.click();
			Playback.gridLoadThreadWait();
			uIMapGeo.hydrantEntry.uIRemarksTab.click();
			Playback.gridLoadThreadWait();
			uIMapGeo.hydrantEntry.uIMapTab.click();
			Playback.gridLoadThreadWait();
			uIMapGeo.hydrantEntry.uIAttachmentTab.click();
			Playback.gridLoadThreadWait();
		}

		public void CloseScreen() {
			uIMapGeo.hydrantEntry.driver.close();
		}

		public void EnterAtNearestAddress() {
			uIMapGeo.hydrantEntry.uINearestAddressEdit.sendKeys(BaseData.getGeoModuleValue("NearestAddress"));
			uIMapGeo.hydrantEntry.uINearestAddressEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtHydrantID() {
			uIMapGeo.hydrantEntry.uIHydantIDEdit.sendKeys(BaseData.getGeoModuleValue("HydrantID"));
		}

		public void ClickSave() {
			uIMapGeo.hydrantEntry.uISaveButton.click();
		}

		public void saveScreen() {
			uIMapGeo.hydrantEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void EnterInstalledDateAsCurrentDate() {
			uIMapGeo.hydrantEntry.uIInstallDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void clickPrintButton() {
			uIMapGeo.hydrantEntry.uIPrintButton.click();
		}

		public void verifyNoAcknowledgementPopupArises() {
			Set<String> windowHandles = Playback.driver.getWindowHandles();
			for (String handle : windowHandles) {
				if (Playback.driver.switchTo().window(handle).getTitle().contains("Acknowledge")) {
					verify.ExpectedValueIsTrue(false);
				} else {
					verify.ExpectedValueIsFalse(false);
				}

			}

		}

		public List<WebElement> getVisibleTabNames() {
			List<WebElement> visibleTabs = new ArrayList<>();
			List<WebElement> allTabs = Playback.driver
					.findElements(By.xpath("//span[contains(@class,'igtab_RedThemeTHText')]"));
			for (WebElement tab : allTabs) {
				if (tab.isDisplayed()) {
					// String tabName = tab.getText();
					// if (tabName.matches("[a-zA-Z]+")) {
					visibleTabs.add(tab);

				}
			}
			return visibleTabs;

		}

		public void verifyVisibleTabsAloneDisplayed(List<WebElement> allTabs) {
			for (WebElement tab : allTabs) {
				verify.ExpectedValueIsTrue(tab.isDisplayed());
			}

		}

		public void verifyAllTabsDisplayed(List<WebElement> allTabs) {
			for (WebElement tab : allTabs) {
				verify.ExpectedValueIsTrue(tab.isDisplayed());

			}

		}

		public void clickRefreshButton() {										// Added by Abi
			uIMapGeo.hydrantEntry.uIResetButton.click();
		}

		public void verifyUpdateSuccessfulMessage() {							// Added by Abi
			String text = uIMapGeo.hydrantEntry. uIFooterStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, " 1003 - Update successful  ");
		}
	}

	public class SpecificationTab {

		public void TabOutCoefficient() {
			uIMapGeo.hydrantEntry.specificationTab.uICoefficientEdit.sendKeys(Keys.TAB);
		}

		public void Verify09ValueInCoeffficient() {
			verify.ExpectedPropertyValueIsEqual("0.9",
					uIMapGeo.hydrantEntry.specificationTab.uICoefficientEdit.getAttribute("value"));
		}

		public void Verify08ValueInCoeffficient() {
			verify.ExpectedPropertyValueIsEqual("0.8",
					uIMapGeo.hydrantEntry.specificationTab.uICoefficientEdit.getAttribute("value"));
		}

		public void Verify07ValueInCoeffficient() {
			verify.ExpectedPropertyValueIsEqual("0.7",
					uIMapGeo.hydrantEntry.specificationTab.uICoefficientEdit.getAttribute("value"));
		}

		public void SelectOrificeTypeAsRadiused() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapGeo.hydrantEntry.specificationTab.uIOrificeTypeComboBox, "Radiused");
			uIMapGeo.hydrantEntry.specificationTab.uIOrificeTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectOrificeTypeAsSquared() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapGeo.hydrantEntry.specificationTab.uIOrificeTypeComboBox, "Squared");
			uIMapGeo.hydrantEntry.specificationTab.uIOrificeTypeComboBox.sendKeys(Keys.TAB);
		}

		public void SelectOrificeTypeAsProtruding() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapGeo.hydrantEntry.specificationTab.uIOrificeTypeComboBox, "Protruding");
			uIMapGeo.hydrantEntry.specificationTab.uIOrificeTypeComboBox.sendKeys(Keys.TAB);
		}

		public void EnterSizeOutletDiameterAtD1() {
			uIMapGeo.hydrantEntry.specificationTab.uISizeOutletDiameterD1Edit
					.sendKeys(BaseData.getGeoModuleValue("D1"));
		}

		public void EnterSizeOutletDiameterAtD2() {
			uIMapGeo.hydrantEntry.specificationTab.uISizeOutletDiameterD2Edit
					.sendKeys(BaseData.getGeoModuleValue("D2"));
		}

		public void EnterSizeOutletDiameterAtD3() {
			uIMapGeo.hydrantEntry.specificationTab.uISizeOutletDiameterD3Edit
					.sendKeys(BaseData.getGeoModuleValue("D3"));
		}

		public void EnterAtStaticPressure() {
			uIMapGeo.hydrantEntry.specificationTab.uIStaticPressureEdit
					.sendKeys(BaseData.getGeoModuleValue("StaticPressure"));
		}

		public void EnterAtResidualPressure() {
			uIMapGeo.hydrantEntry.specificationTab.uIResidualPressureEdit
					.sendKeys(BaseData.getGeoModuleValue("ResidualPressure"));
		}

		public void EnterAtPitotPressure() {
			uIMapGeo.hydrantEntry.specificationTab.uIPitotPressureEdit
					.sendKeys(BaseData.getGeoModuleValue("PitotPressure"));
			uIMapGeo.hydrantEntry.specificationTab.uIPitotPressureEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtCalculatedFlow() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("CalculatedFlow"),
					uIMapGeo.hydrantEntry.specificationTab.uICalculatedFlowEdit.getAttribute("value"));
		}

		public void VerifyAtAvailableFlow() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("AvailableFlow"),
					uIMapGeo.hydrantEntry.specificationTab.uIAvailableFlowEdit.getAttribute("value"));
		}

	}

	public class WeatherScreen {
		public void VerifyAsWeatherScreenDisplayed() {
			verify.ExpectedPropertyValueIsEqual("Current Weather Conditions",
					uIMapGeo.weatherScreen.uITitleTextView.getText());
		}

		public void CloseScreen() {
			uIMapGeo.weatherScreen.driver.close();
		}

		public void verifyTemperature() {
			String temp = uIMapGeo.weatherScreen.uITempTextView.getText();
			verify.ExpectedValueIsTrue(temp.contains("C"));
		}

	}

	public class ContactEntryScreen {
		public void SelectNameRelation() {
			Playback.controlReadyThreadWait();
			uIMapGeo.contactEntryScreen.uIRelationInputComboBox.click();
			objectIdentification.randomIdentify
					.selectRadControlDropDownCheckBoxes(uIMapGeo.contactEntryScreen.uIRelationComboBox);
		}

		public void SelectNameRelationAsBuildingOwner() {
			Playback.controlReadyThreadWait();
			uIMapGeo.contactEntryScreen.uIRelationInputComboBox.click();
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectRadControlDropDownCheckBoxes(
					uIMapGeo.contactEntryScreen.uIRelationComboBox, "Building Owner");
			uIMapGeo.contactEntryScreen.uIRelationInputComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtNameRelation() {
			Playback.controlReadyThreadWait();
			uIMapGeo.contactEntryScreen.uIRelationInputComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapGeo.contactEntryScreen.uIRelationComboBox, BaseData.getGeoModuleValue("NameRelation"));
			uIMapGeo.contactEntryScreen.uINameRelationDropDownArrow.click();
		}

		public void ClickDeleteButton() {
			uIMapGeo.contactEntryScreen.uIDeleteButton.click();
		}

		public void ClickBusinessRadioButton() {

			uIMapGeo.contactEntryScreen.uINameTypeBusinessRadioButton.click();
		}

		public void ClickSaveButton() {
			uIMapGeo.contactEntryScreen.uISaveButton.click();
		}

		public void EnterAndSelectAtATypeName() {
			uIMapGeo.contactEntryScreen.uILastNameEdit.sendKeys(BaseData.getGeoModuleValue("LastName"));
			uIMapGeo.contactEntryScreen.uIFirstNameEdit.sendKeys(BaseData.getGeoModuleValue("FirstName"));
			uIMapGeo.contactEntryScreen.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.waitForPageLoad();
		}

		public void SelectPhoneType1() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIPhoneType1ComboBox);
		}

		public void SelectPhoneType2() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIPhoneType2ComboBox);
		}

		public void SelectPhoneType1AsHome() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIPhoneType1ComboBox,
					"H - Home");
		}

		public void SelectPhoneType2AsWork() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIPhoneType2ComboBox,
					"W - Work");
		}

		public void SelectPhoneType3AsCell() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIPhoneType3ComboBox,
					"C - Cell");
		}

		public void EnterAtPhoneNumber1() {
			uIMapGeo.contactEntryScreen.uIPhoneNumber1Edit.click();
			uIMapGeo.contactEntryScreen.uIPhoneNumber1Edit.sendKeys(BaseData.getGeoModuleValue("PhoneNumber"));
		}

		public void EnterPhoneNumber1() {
			uIMapGeo.contactEntryScreen.uIPhoneNumber1Edit.click();
			uIMapGeo.contactEntryScreen.uIPhoneNumber1Edit.sendKeys(Randomized.getRandomPhoneNumbers());
		}

		public void EnterPhoneNumber2() {
			uIMapGeo.contactEntryScreen.uIPhoneNumber2Edit.click();
			uIMapGeo.contactEntryScreen.uIPhoneNumber2Edit.sendKeys(Randomized.getRandomPhoneNumbers());
		}

		public void EnterAtPhoneNumber2() {
			uIMapGeo.contactEntryScreen.uIPhoneNumber2Edit.click();
			uIMapGeo.contactEntryScreen.uIPhoneNumber2Edit.sendKeys(BaseData.getGeoModuleValue("PhoneNumber1"));
		}

		public void EnterAtPhoneNumber3() {
			uIMapGeo.contactEntryScreen.uIPhoneNumber3Edit.click();
			uIMapGeo.contactEntryScreen.uIPhoneNumber3Edit.sendKeys(BaseData.getGeoModuleValue("PhoneNumber1"));
		}

		public void EnterAtDuplicatePhoneNumber() {
			uIMapGeo.contactEntryScreen.uIPhoneNumber3Edit.click();
			uIMapGeo.contactEntryScreen.uIPhoneNumber3Edit.sendKeys(BaseData.getGeoModuleValue("PhoneNumber1"));
		}

		public void SaveScreen() {
			Playback.popupThreadWait();
			uIMapGeo.contactEntryScreen.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapGeo.contactEntryScreen.driver.close();
		}

		public void VerifyNameAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(7045) Name not entered or not a valid name");
		}

		public void ClickAddMorePhoneNoButton() {
			uIMapGeo.contactEntryScreen.uIAddMorePhoneNumberButton.click();
		}

		public void VerifyAtContactGroup() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("ContactGroup"),
					uIMapGeo.contactEntryScreen.uIContactGroupEdit.getText());
		}

		public void enterAtLastName() {
			uIMapGeo.contactEntryScreen.uILastNameEdit.sendKeys(BaseData.getGeoModuleValue("LastName"));
			uIMapGeo.contactEntryScreen.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtFirstName() {
			uIMapGeo.contactEntryScreen.uIFirstNameEdit.sendKeys(BaseData.getGeoModuleValue("FirstName"));
			uIMapGeo.contactEntryScreen.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtAddress() {
			uIMapGeo.contactEntryScreen.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
		}

		public void ClickPrimaryContactCheckbox() {
			uIMapGeo.contactEntryScreen.uIPrimaryContactCheckBox.click();
		}

		public void VerifyAddressAlreadyHasAPrimaryContactAckMessage() {
			popup.confirm.yesWithExpectedMessage(
					"Primary Contact already exists for this Contact Group, Do you want to replace this as Primary Contact ?");
		}

		public void VerifyAdditionSuccessfulMessage() {
			Playback.wait(2000);
			String AdditionMessage = uIMapGeo.contactEntryScreen.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));

		}

		public void SaveCloseScreen() {
			Playback.pageLoadThreadWait();
			uIMapGeo.contactEntryScreen.uISaveCloseButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void SelectAtPhoneType1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIPhoneType1ComboBox,
					BaseData.getGeoModuleValue("PhoneType1"));
		}

		public void SelectAtPhoneType2() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIPhoneType2ComboBox,
					BaseData.getGeoModuleValue("PhoneType2"));
		}

		public void EnterAtEmail() {
			uIMapGeo.contactEntryScreen.uIEmailEdit.sendKeys(BaseData.getGeoModuleValue("Email1"));
		}

		public void VerifyAtPhoneType1() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("PhoneType1"),
					uIMapGeo.contactEntryScreen.uIPhoneType1ComboBox.getAttribute("value"));
		}

		public void VerifyAtPhoneType2() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("PhoneType2"),
					uIMapGeo.contactEntryScreen.uIPhoneType2ComboBox.getAttribute("value"));
		}

		public void VerifyAtPhoneNumber1() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("PhoneNumber"),
					uIMapGeo.contactEntryScreen.uIPhoneNumber1Edit.getAttribute("value"));
		}

		public void VerifyAtPhoneNumber2() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("PhoneNumber1"),
					uIMapGeo.contactEntryScreen.uIPhoneNumber2Edit.getAttribute("value"));
		}

		public void ClickNotSharedCheckBox() {
			uIMapGeo.contactEntryScreen.uINotSharedCheckBox.click();
		}

		public void TabOutLastName() {
			uIMapGeo.contactEntryScreen.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void TabOutFirstName() {
			uIMapGeo.contactEntryScreen.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterNotes() {
			uIMapGeo.contactEntryScreen.uINotesEdit.sendKeys(
					"Settings – Terminal – uncheck cad checkbox and search blue screen error, Name Victim screen Charge/offense details are not showing");
		}

		public void ClickInActiveDateCheckBox() {
			uIMapGeo.contactEntryScreen.uIInActiveDateEdit.click();
		}

		public void verifyNameTypeCheckboxDefaultSelectedForPerson() {
			verify.ExpectedValueIsTrue(uIMapGeo.contactEntryScreen.uINameTypePersonRadioButton.isSelected());
		}

		public void verifyLastNameAsEditable() {
			verify.ExpectedValueIsTrue(uIMapGeo.contactEntryScreen.uILastNameEdit.isEnabled());

		}

		public void verifyFirstNameAsUnEditable() {
			verify.ExpectedValueIsFalse(uIMapGeo.contactEntryScreen.uIFirstNameEdit.isEnabled());

		}

		public void EnterAtLastName1() {
			uIMapGeo.contactEntryScreen.uILastNameEdit.sendKeys(BaseData.getGeoModuleValue("LastName1"));
			uIMapGeo.contactEntryScreen.uILastNameEdit.sendKeys(Keys.TAB);

		}

		public void clickNameTypeAsPerson() {
			uIMapGeo.contactEntryScreen.uINameTypePersonRadioButton.click();
		}

		public void enterContactOrder() {
			uIMapGeo.contactEntryScreen.uIContactOrderEdit.sendKeys("123");
		}

		public void enterAtNotes() {
			uIMapGeo.contactEntryScreen.uINotesEdit.sendKeys(BaseData.getGeoModuleValue("Notes"));
		}

		public void clickPersonRadioButton() {

			uIMapGeo.contactEntryScreen.uINameTypePersonRadioButton.click();
		}

		public void verifyAtCSZ() {
			String attribute = uIMapGeo.contactEntryScreen.uICSZEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getGeoModuleValue("CSZ")));
		}

		public void enterAtEmail() {
			uIMapGeo.contactEntryScreen.uIEmailEdit.sendKeys(BaseData.getGeoModuleValue("Email"));
		}

		public void selectAtContactGroup() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.contactEntryScreen.uIContactGroupComboBox,
					BaseData.getGeoModuleValue("ContactGroup"));

		}

		public void clearAddress() { // added by Abi
			uIMapGeo.contactEntryScreen.uIAddressEdit.click();
			uIMapGeo.contactEntryScreen.uIAddressEdit.clear();
		}

		public void verifyAtEmail() {
			String attribute = uIMapGeo.contactEntryScreen.uIEmailEdit.getAttribute("value");
			// verify.ExpectedValueIsTrue(attribute.contains(FireData.getInspectionModuleValue("Email")));
		}

		public void verifyNameRelationHavingMultipleValues() { // method added by Abi
			String relationNames = uIMapGeo.contactEntryScreen.uIRelationInputComboBox.getAttribute("value");
			verify.ExpectedValueIsTrue(relationNames.contains(BaseData.getGeoModuleValue("NameRelation")));
			verify.ExpectedValueIsTrue(relationNames.contains(BaseData.getGeoModuleValue("NameRelation1")));
		}

		public void SelectAtNameRelation1() { // method added by Abi
			Playback.controlReadyThreadWait();
			uIMapGeo.contactEntryScreen.uIRelationInputComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapGeo.contactEntryScreen.uIRelationComboBox, BaseData.getGeoModuleValue("NameRelation1"));
			uIMapGeo.contactEntryScreen.uINameRelationDropDownArrow.click();

		}
	}

	public class ContactSearch {
		public void ClickAddNew() {
			uIMapGeo.contactSearch.uIAddNewLink.click();
		}

		public void ClickSearchButton() {
			uIMapGeo.contactSearch.uISearchButton.click();
		}

		public void enterAtAddress() {
			uIMapGeo.contactSearch.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));

		}

		public void verifyAtPhoneNoAsActive() {

			WebElement phno = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapGeo.contactSearch.uIContactSearchResultGrid, BaseData.getGeoModuleValue("PhoneNo"));

			verify.ExpectedValueIsTrue(phno.getText().contains(BaseData.getGeoModuleValue("PhoneNo")));

			String clr = phno.getCssValue("color");
			// System.out.println(clr);
			verify.ExpectedValueIsTrue(clr.contains("rgba(0, 0, 0, 1)"));

		}

		public void verifyAtPhoneNoAsInactive() {

			WebElement phno = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapGeo.contactSearch.uIContactSearchResultGrid, BaseData.getGeoModuleValue("PhoneNo"));

			verify.ExpectedValueIsTrue(phno.getText().contains(BaseData.getGeoModuleValue("PhoneNo")));

			String clr = phno.getCssValue("color");
			// System.out.println(clr); Gray clr
			verify.ExpectedValueIsTrue(clr.contains("rgba(128, 128, 128, 1)"));
		}

		public void verifyGridRowLastName(int rowIndex) {

			WebElement name = objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.contactSearch.uIContactSearchResultGrid, "Name", rowIndex);
			verify.ExpectedValueIsTrue(name.getText().contains(BaseData.getGeoModuleValue("LastName")));

		}

		public void verifyGridRowLastName1(int rowIndex) {

			WebElement name = objectIdentification.manualIdentify
					.getGridCell(uIMapGeo.contactSearch.uIContactSearchResultGrid, "Name", rowIndex);
			verify.ExpectedValueIsTrue(name.getText().contains(BaseData.getGeoModuleValue("LastName1")));
		}

		public void reloadContactSearch() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.reloadScreen("Contact Search");
			Playback.pageLoadThreadWait();
		}

	}

	public class GeoContactNewEntry {
		public void ClickSaveButton() {
			uIMapGeo.geoContactNewEntry.uISaveButton.click();
		}

		public void ClickRefreshButton() {
			uIMapGeo.geoContactNewEntry.uIRefreshButton.click();
		}

		public void EnterAtAddress() {
			uIMapGeo.geoContactNewEntry.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
			uIMapGeo.geoContactNewEntry.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddNewButton() {
			uIMapGeo.geoContactNewEntry.uIAddNewButton.click();
		}

		public void VerifyAcknowledgeMessageInvalidAddress() {
			popup.acknowledge.okWithExpectedMessage("(5027) Invalid address for contact");
		}

		public void VerifySearchAddNewDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapGeo.geoContactNewEntry.uISearchButton.getAttribute("disabled")));
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapGeo.geoContactNewEntry.uIAddNewButton.getAttribute("disabled")));
		}

		public void VerifyAtName(int rowIndex) {

			String name = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.geoContactNewEntry.uIContactsTabResultTable, "Name", rowIndex);

			verify.ExpectedPropertyValueIsEqual(name, BaseData.getGeoModuleValue("Name")); // changed and commment by
																							// Abi

			/*
			 * verify.ExpectedPropertyValueIsEqual( BaseData.getGeoModuleValue("LastName") +
			 * ", " + BaseData.getGeoModuleValue("FirstName"),
			 * objectIdentification.manualIdentify.getGridCellInnerText(
			 * uIMapGeo.geoContactNewEntry.uIContactsTabResultTable, "Name", rowIndex));
			 */
		}

		public void VerifyAtPhoneNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("PhoneNumber"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.geoContactNewEntry.uIContactsTabResultTable, "Phone#",
									rowIndex)
							.replace("(", "").replace(")", "").replace(" ", "").replace("-", ""));
		}

		public void VerifyDateAsCurrentDate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.geoContactNewEntry.uIContactsTabResultTable, "Entered Date",
							rowIndex)
					.contains(Randomized.getCurrentDate("MM/dd/yy")));
		}

		public void VerifyDuplicateNameNotAdded() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapGeo.geoContactNewEntry.uIContactsTabResultTable) == 1);
		}

		public void VerifyAtLastName1(int rowIndex) {

			String name = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.geoContactNewEntry.uIContactsTabResultTable, "Name", rowIndex);
			verify.ExpectedValueIsTrue(name.contains(BaseData.getGeoModuleValue("LastName1")));
		}

		public void verifyAtPhoneNumber1() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("PhoneNo"),
					uIMapGeo.contactEntryScreen.uIPhoneNumber1Edit.getAttribute("value"));
		}

		public void closeWindow() {
			uIMapGeo.geoContactNewEntry.driver.close();
		}

	}

	public class HydrantTest {
		public void SelectAtActivityType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.hydrantTest.uIActivityTypeComboBox,
					BaseData.getGeoModuleValue("ActivityType"));
		}

		public void EnterActivityToTimeAsFutureTime(int hours) {
			uIMapGeo.hydrantTest.uIActivityToTimeEdit.click();
			Playback.controlReadyThreadWait();
			uIMapGeo.hydrantTest.uIActivityToTimeEdit.sendKeys(Randomized.getFutureTimeByHours(hours, "HH"));
		}

		public void EnterAtPFCode() {
			uIMapGeo.hydrantTest.uIPFEdit.sendKeys(BaseData.getGeoModuleValue("PFCode"));
			uIMapGeo.hydrantTest.uIPFEdit.sendKeys(Keys.TAB);
		}

		public void ClickReferToFPBCheckBox() {
			uIMapGeo.hydrantTest.uIReferToFPBCheckBox.click();
		}

		public void SaveScreen() {
			uIMapGeo.hydrantTest.uISaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAdditionSuccessStatusMessage() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition successful",
					uIMapGeo.hydrantTest.uIBottomLeftSideStatusBar.getText());
		}

		public void CloseScreen() {
			uIMapGeo.hydrantTest.driver.close();
		}

		public void TabActivityDateAndTime() {
			uIMapGeo.hydrantTest.uIActivityDateEdit.sendKeys(Keys.TAB);
			uIMapGeo.hydrantTest.uIActivityFromTimeEdit.sendKeys(Keys.TAB);
	
		}

	}

	public class MapLayerEntry {
		public void VerifyLayerTypeAsPolygon() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual("Polygon", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapGeo.mapLayerEntry.uILayerTypeComboBox));
		}

		public void VerifyLayerNameAsGang() {
			verify.ExpectedPropertyValueIsEqual("Gang", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapGeo.mapLayerEntry.uILayerNameComboBox));
		}

		public void VerifyAtFutureName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("FutureName"),
					uIMapGeo.mapLayerEntry.uIFeatureNameEdit.getAttribute("value"));
		}

		public void CloseScreen() {
			uIMapGeo.mapLayerEntry.driver.close();
		}

		public void selectAtLayerType() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerEntry.uILayerTypeComboBox,
					BaseData.getGeoModuleValue("LayerType"));

		}

		public void selectAtLayerName(int slNo) {
			if (slNo == 0) {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerEntry.uILayerNameComboBox,
						BaseData.getGeoModuleValue("LayerName"));
			} else {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerEntry.uILayerNameComboBox,
						BaseData.getGeoModuleValue("LayerName" + slNo + ""));
			}
		}

		public void enterAtFeatureName() {
			Playback.controlReadyThreadWait();
			uIMapGeo.mapLayerEntry.uIFeatureNameEdit.clear();
			uIMapGeo.mapLayerEntry.uIFeatureNameEdit.sendKeys(BaseData.getGeoModuleValue("FeatureName"));
		}

		public void enterAtAddress() {
			uIMapGeo.mapLayerEntry.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
			uIMapGeo.mapLayerEntry.uIAddressEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();

		}

		public void selectIsFireCheckBox() {
			if (!uIMapGeo.mapLayerEntry.uIIsFireChkBox.isSelected()) {
				Playback.controlReadyThreadWait();
				uIMapGeo.mapLayerEntry.uIIsFireChkBox.click();
			}
		}

		public void selectInavtiveCheckBox() {
			if (!uIMapGeo.mapLayerEntry.uIInactiveChkBox.isSelected()) {
				Playback.controlReadyThreadWait();
				uIMapGeo.mapLayerEntry.uIInactiveChkBox.click();
			}
		}

		public void verifyInactiveDateAsCurrentDate() {
			Playback.controlReadyThreadWait();
			String date = uIMapGeo.mapLayerEntry.uIInactiveDate.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), date);
		}

		public void SaveScreen() {
			uIMapGeo.mapLayerEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveScreen() {
			uIMapGeo.mapLayerEntry.uISaveButton.click();

		}

		public void SaveNCloseScreen() {
			uIMapGeo.mapLayerEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void clickSaveNCloseScreen() {
			uIMapGeo.mapLayerEntry.uISaveCloseButton.click();

		}

		public void verifyIsFireCheckBoxSelectedAndDisabled() {

			verify.ExpectedValueIsTrue(uIMapGeo.mapLayerEntry.uIIsFireChkBox.isSelected());
			verify.ExpectedValueIsFalse(uIMapGeo.mapLayerEntry.uIIsFireChkBox.isEnabled());

		}

		public void clickRefershButton() {
			uIMapGeo.mapLayerEntry.uIResetButton.click();
			Playback.controlReadyThreadWait();

		}

		public void verifyAttachmentTabEnabled() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapGeo.mapLayerEntry.uIAttachmentTab.isDisplayed());
			uIMapGeo.mapLayerEntry.uIAttachmentTab.click();
		}

		public void switchToRemarksTab() {
			Playback.controlReadyThreadWait();
			uIMapGeo.mapLayerEntry.uIRemarksTab.click();
			objectIdentification.windowHandle.switchToFrame(uIMapGeo.mapLayerEntry.uIRemarksTxtFieldFrame);
			Playback.controlReadyThreadWait();
		}

		public void enterAtRemarks() {
			uIMapGeo.mapLayerEntry.uIRemarksTxtBody.sendKeys(BaseData.getGeoModuleValue("Remarks"));
			Playback.controlReadyThreadWait();
		}

		public void verifyAtRemarksEntered() {
			String remarks = uIMapGeo.mapLayerEntry.uIRemarksTxtBody.getText();
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Remarks"), remarks);
		}

		public void selectAtLayerName() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerEntry.uILayerNameComboBox,
					BaseData.getGeoModuleValue("LayerName"));
			uIMapGeo.mapLayerEntry.uILayerNameComboBox.sendKeys(Keys.TAB);
		}

		public void selectLayerTypeAsPolygon() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerEntry.uILayerTypeComboBox,
					"Polygon");
			uIMapGeo.mapLayerEntry.uILayerTypeComboBox.sendKeys(Keys.TAB);
		}

		public void verifyIsFireCheckBoxisDisplayed() {
			verify.ExpectedValueIsTrue(uIMapGeo.mapLayerEntry.uIIsFireChkBox.isDisplayed());

		}

		public void verifyIsGeoFenceCheckBoxIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapGeo.mapLayerEntry.uIIsGeoFenceChkBox.isDisplayed());

		}

		public void verifyIsFireCheckBoxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapGeo.mapLayerEntry.uIIsFireChkBox.isEnabled());
		}

		public void verifyIsGeoFenceCheckBoxIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapGeo.mapLayerEntry.uIIsGeoFenceChkBox.isEnabled());
		}
	}

	public class RealAddressHelpWindow {

		public void verifyAtRealAddress() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapGeo.realAddressHelpWindow.uIRealAddressTable, "Real Address");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getGeoModuleValue("RealAddress")));
		}

		public void verifyAtRealAddress1() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapGeo.realAddressHelpWindow.uIRealAddressTable, "Street Name"); // Changed
																													// "Real
																													// Address"
																													// to
																													// Street
																													// Name
																													// by
																													// Abi
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getGeoModuleValue("RealAddress1")));
		}

		public void verifyAtRealAddress(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("StreetName1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.realAddressHelpWindow.uIRealAddressTable, "Street Name", rowIndex));

		}

		public void verifyAtRealAddress1(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("RealAddress1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapGeo.realAddressHelpWindow.uIRealAddressTable, "Real Address", rowIndex));

		}

		public void close() {
			uIMapGeo.realAddressHelpWindow.driver.close();
		}

		public void selectAtRealAddress(int rowIndex) {
			Playback.controlReadyThreadWait();
//		    		objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapGeo.realAddressHelpWindow.uIRealAddressTable, BaseData.getGeoModuleValue("RealAddress"), rowIndex);
			objectIdentification.manualIdentify.selectGridTableRow(uIMapGeo.realAddressHelpWindow.uIRealAddressTable,
					rowIndex);

		}

		public void selectAtRealAddress1(int rowIndex) {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapGeo.realAddressHelpWindow.uIRealAddressTable, BaseData.getGeoModuleValue("RealAddress1"),
					rowIndex);
		}

		public void verifyAcknowledgeAtPremiseNoIsInactive() {
//			        	  popup.acknowledge.okWithExpectedMessage("(5095) Premise No"+BaseData.getGeoModuleValue("PremiseNo") +"is Inactive");
			popup.acknowledge.okWithExpectedMessage(
					"(5095) Premise No " + BaseData.getGeoModuleValue("PremiseNo") + " is Inactive");
		}

		public void verifyAtStreetName() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapGeo.realAddressHelpWindow.uIRealAddressTable, "Street Name");
			for (String values : gridTableColumnValues)
				verify.ExpectedValueIsTrue(values.contains(BaseData.getGeoModuleValue("StreetName")));

		}

		public void selectAtZipcode() { 																										// Added by Abi
			Playback.controlReadyThreadWait();
			String cellInnerText=BaseData.getGeoModuleValue("ZipCode");
			Playback.driver.findElement(By.xpath("(//div[@id='grdRealAddress']//table/tbody/tr/td[contains(text(), '" + cellInnerText + "')])[2]")).click();
			Playback.controlReadyThreadWait();
		}

	}

	public class UpdateGeoCode {
		public void enterAtAddress() {
			uIMapGeo.updateGeoCode.uIAddressEdit.sendKeys(BaseData.getGeoModuleValue("Address"));
		}

		public void verifyAtAddress(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Address"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapGeo.updateGeoCode.uIUpdateGeoCodeTable, "Address", rowIndex));
		}
	}

	public class MapLayerSearch {
		public void clickAddnewButton() {
			uIMapGeo.mapLayerSearch.uIAddNewButton.click();
		}

		public void selectAtLayerType() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerSearch.uILayerTypeComboBox,
					BaseData.getGeoModuleValue("LayerType"));

		}

		public void selectAtLayerName(int slNo) {
			if (slNo == 0) {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerSearch.uILayerNameComboBox,
						BaseData.getGeoModuleValue("LayerName"));
			} else {
				objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.mapLayerSearch.uILayerNameComboBox,
						BaseData.getGeoModuleValue("LayerName" + slNo + ""));
			}
		}

		public void selectIncludeFireCheckBox() {
			if (!uIMapGeo.mapLayerSearch.uIIncludeFireChkBox.isSelected()) {
				uIMapGeo.mapLayerSearch.uIIncludeFireChkBox.click();
			}

		}

		public void clickSearchButton() {
			Playback.controlReadyThreadWait();
			uIMapGeo.mapLayerSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtNameInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			String name = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.mapLayerSearch.uIMapLayerTable, "Name", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("Name"), name);
		}

		public void selectGridRowByLayerName(int slNo) {
			if (slNo == 0) {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapGeo.mapLayerSearch.uIMapLayerTable, BaseData.getGeoModuleValue("LayerName"));
			} else {
				Playback.controlReadyThreadWait();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapGeo.mapLayerSearch.uIMapLayerTable, BaseData.getGeoModuleValue("LayerName" + slNo + ""));
			}
		}

		public void verifyNoRecordsFoundAck() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			Playback.controlReadyThreadWait();

		}

		public void clickIncludeInactiveCheckBox() {
			uIMapGeo.mapLayerSearch.uIIncludeInactiveCheckBox.click();
		}

	}

	public class AVLReplay {

		public void enterAtFromDateAndTime() {
			uIMapGeo.aVLReplay.uIFromDate.sendKeys(Randomized.getCurrentDate());
			uIMapGeo.aVLReplay.uIFromDate.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			uIMapGeo.aVLReplay.uIFromTime.sendKeys(Randomized.getCurrentTime("HH:mm"));
			uIMapGeo.aVLReplay.uIFromTime.sendKeys(Keys.TAB);
		}

		public void enterAtToDateAndTime() {
			uIMapGeo.aVLReplay.uIToDate.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			uIMapGeo.aVLReplay.uIToTime.sendKeys(Randomized.getFutureTimeByHours(4, "HH:mm"));
			uIMapGeo.aVLReplay.uIToTime.sendKeys(Keys.TAB);
		}

		public void enterAtFromDateAndTimeII() {
			uIMapGeo.aVLReplay.uIFromDate.clear();
			uIMapGeo.aVLReplay.uIFromDate.sendKeys(Randomized.getCurrentDate());
			uIMapGeo.aVLReplay.uIFromDate.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			uIMapGeo.aVLReplay.uIFromTime.sendKeys(Randomized.getCurrentTime("HH:mm"));
			uIMapGeo.aVLReplay.uIFromTime.sendKeys(Keys.TAB);
		}

		public void enterAtToDateAndTimeII() {
			uIMapGeo.aVLReplay.uIToDate.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			uIMapGeo.aVLReplay.uIToTime.sendKeys(Randomized.getFutureTimeByHours(9, "HH:mm"));
			uIMapGeo.aVLReplay.uIToTime.sendKeys(Keys.TAB);
		}

		public void clickShowUnits() {
			uIMapGeo.aVLReplay.uIShowUnitsButton.click();
		}

		public void verifyNoRecordsFoundSelectedTimeDuationAckwMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(6071) No Record found between selected time duration.");
		}

		public void verifyFromdatelessthanTodateAckwMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(6071) From date should be less than To date.");
		}

		public void clickPolygonButtonInDrawAreas() {
			uIMapGeo.aVLReplay.uIPolygonButton.click();
		}

		public void dragAndPointInMapPanel() {
			Playback.actionDriver.moveToElement(uIMapGeo.aVLReplay.uIMapPanel, 0, 0).click().perform();
			Playback.controlReadyThreadWait();
			Playback.actionDriver.moveToElement(uIMapGeo.aVLReplay.uIMapPanel, 100, 0).click().perform();
			Playback.controlReadyThreadWait();
			Playback.actionDriver.moveToElement(uIMapGeo.aVLReplay.uIMapPanel, 0, 100).click().perform();
			Playback.controlReadyThreadWait();
			Playback.actionDriver.moveToElement(uIMapGeo.aVLReplay.uIMapPanel, -100, 0).click().perform();
			Playback.controlReadyThreadWait();
			Playback.actionDriver.moveToElement(uIMapGeo.aVLReplay.uIMapPanel, 0, -100).click().perform();
			Playback.controlReadyThreadWait();
			Playback.actionDriver.moveToElement(uIMapGeo.aVLReplay.uIMapPanel, 0, 0).doubleClick().perform();

		}

		public void clickResetButton() {
			uIMapGeo.aVLReplay.uIResetButton.click();

		}

		public void verifyShowUnitsOnMapIsDisabled() {
			verify.ExpectedValueIsTrue(!uIMapGeo.aVLReplay.uIShowUnitsButton.isEnabled());

		}

	}

	public class AddressIntersection2040UpdateLatLongWindow {

		public void clickMapButton() {
			uIMapGeo.addressIntersection2040UpdateLatLongWindow.uIMapButton.click();
		}

		public void clickGetButton() {
			uIMapGeo.addressIntersection2040UpdateLatLongWindow.uIGetButton.click();
		}

		public void clickAddCalculateButton() {
			uIMapGeo.addressIntersection2040UpdateLatLongWindow.uIAddCalculateButton.click();
		}
	}

	public class ZipCode {

		public void enterAtCity() {
			uIMapGeo.zipCode.uICityCodeEdit.sendKeys(BaseData.getGeoModuleValue("City"));
			uIMapGeo.zipCode.uICityCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtZipCode() {
			uIMapGeo.zipCode.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
			uIMapGeo.zipCode.uIZipCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtZipCode1() {
			uIMapGeo.zipCode.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode1"));
			uIMapGeo.zipCode.uIZipCodeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtZipCode2() {
			uIMapGeo.zipCode.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode2"));
			uIMapGeo.zipCode.uIZipCodeEdit.sendKeys(Keys.TAB);
		}

		public void clearZipCode() {
			uIMapGeo.zipCode.uIZipCodeEdit.clear();
		}

		public void selectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.zipCode.uIStateDropDown,
					BaseData.getGeoModuleValue("State"));
			uIMapGeo.zipCode.uIStateDropDown.sendKeys(Keys.TAB);
		}

		public void clickSearchButton() {
			uIMapGeo.zipCode.uISearchButton.click();
		}

		public void verifyAtZipCodeInGrid1() {
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapGeo.zipCode.uIZipcodeResultTable, "Zip");
			for (String values : gridTableColumnValues) {
				if (values.contains(BaseData.getGeoModuleValue("ZipCode1"))) {
					verify.ExpectedValueIsTrue(values.contains(BaseData.getGeoModuleValue("ZipCode1")));
				}
			}
		}

		public void verifyAtZipcodeInGrid(int rowIndex) {

			String gridCellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.zipCode.uIZipcodeResultTable, "Zip", rowIndex);
			verify.ExpectedValueIsTrue(gridCellInnerText.contains(BaseData.getGeoModuleValue("ZipCode")));

//        	verify.ExpectedPropertyValueIsEqual(BaseData.getGeoModuleValue("ZipCode"), gridCellInnerText);
		}

		public void clickAddNewButton() {
			uIMapGeo.zipCode.uIAddNewButton.click();

		}

	}

	public class PremiseHelpWindow {

		public void clickShowDetailButton() {
			uIMapGeo.premiseHelpWindow.uIShowDetailButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyPremiseNoInGrid() {
			String premiseNo = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapGeo.premiseHelpWindow.uIPremiseTable, "Premise Odd", 0);

			verify.ExpectedPropertyValueIsEqual(premiseNo, BaseData.getGeoModuleValue("Premise"));
		}

		public void closeScreen() {
			uIMapGeo.premiseHelpWindow.driver.close();
		}

		public void enterValidPremise() {
			Playback.controlReadyThreadWait();
			uIMapGeo.premiseHelpWindow.uIValidPremiseEdit.clear();
			String valid = uIMapGeo.premiseHelpWindow.uINextMaximPremise.getText();
			uIMapGeo.premiseHelpWindow.uIValidPremiseEdit.sendKeys(valid);
		}

		public void clickUseThisPremise() {
			Playback.controlReadyThreadWait();
			uIMapGeo.premiseHelpWindow.uIUseThisPremiseButton.click();
		}

	}

	public class AddressIntersectionHelpWindow {
		public void clickCancelAndReEnterButton() {
			uIMapGeo.addressIntersectionHelpWindow.uICancelReEnterButton.click();
		}

		public void clickAddIntersection() {
			uIMapGeo.addressIntersectionHelpWindow.uIAddIntersectionButton.click();
		}

		public void selectGridRow(int rowIndex) {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapGeo.addressIntersectionHelpWindow.uIIntersectionTable, rowIndex);
		}
	}

	public void switchToAddressIntersectionHelpWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("GEO/frmAddrIntersection.aspx");
		Playback.controlReadyThreadWait();
	}

	public class ZipCodeEntry {

		public void enterAtZipCodeEdit() {
			uIMapGeo.zipCodeEntry.uIZipCodeEdit.sendKeys(BaseData.getGeoModuleValue("ZipCode"));
		}

		public void selectAtStateComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapGeo.zipCodeEntry.uIStateComboBox,
					BaseData.getGeoModuleValue("State"));
			uIMapGeo.zipCodeEntry.uIStateComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtCityEdit() {
			uIMapGeo.zipCodeEntry.uICityEdit.sendKeys(BaseData.getGeoModuleValue("City"));
		}

		public void clickSaveButton() {
			uIMapGeo.zipCodeEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void clickSaveNCloseButton() {
			uIMapGeo.zipCodeEntry.uISaveAndCloseButton.click();
		}

		public void clickPrintButton() {
			uIMapGeo.zipCodeEntry.uIPrintButton.click();
		}

		public void clickRefreshButton() {
			uIMapGeo.zipCodeEntry.uIRefreshButton.click();
		}
	}

}