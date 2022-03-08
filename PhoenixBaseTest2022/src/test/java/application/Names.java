package application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.itextpdf.text.log.SysoLogger;

import dataAccess.BaseData;
import resources.PropertiesFile;
import uIMaps.UIMapNames;
import uIMaps.UIMapNames.DictionaryEntry;
import uIMaps.UIMapNames.DictionarytSearch;
import uIMaps.UIMapPopup;
import utilities.ObjectIdentification;
import utilities.ObjectIdentification.AttachmentsTab;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class Names {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapNames uIMapNames = new UIMapNames();
	public Popup popup = new Popup();
	public UIMapPopup uIMapPopup = new UIMapPopup();
	public static Names names = new Names();
	public Geo geo = new Geo();

	public static String TestResourceFolderPath = PropertiesFile.readPropertiesFile("TestResourceFolderPath");
	public static String Url = PropertiesFile.readPropertiesFile("url");

	public ArrestEntry arrestEntry;
	public NameEntry nameEntry;
	public NameSearch nameSearch;
	public ArrestSearch arrestSearch;
	public NameSearchHelpWindow nameSearchHelpWindow;
	public NameMerge nameMerge;
	public ExpungementSearch expungementSearch;
	public Expungement expungement;
	public FISearch fISearch;
	public FIEntry fIEntry;
	public GunPermitEntry gunPermitEntry;
	public GunPermitSearch gunPermitSearch;
	public DictionarytSearch dictionarytSearch;
	public DictionaryEntry dictionaryEntry;
	public SuspectEntry suspectEntry;

	public SuspectSearch suspectSearch;
	public NameMining nameMining;
	public NameSearchPopupScreen nameSearchPopupScreen;
	public NamesComments namesComments;
	public SocialMediaSites socialMediaSites;
	public SocialMediaSitesEntry socialMediaSitesEntry;
	public SocialMediaSearch socialMediaSearch;
	public CellStatus cellStatus;
	public CellStatusArrestEntry cellStatusArrestEntry;
	public AdditionalNumberScreen additionalNumberScreen;
	public NameMapScreen nameMapScreen;
	public PhotoLineupEntry photoLineupEntry;
	public BuildPhotoLineup buildPhotoLineup;
	public LineupSearch lineupSearch;
	public ContactEntry contactEntry;
	public GangSearch gangSearch;
	public GangMasterEntry gangMasterEntry;
	public GangDetailEntry gangDetailEntry;
	public ArrestSearchHelpWindow arrestSearchHelpWindow;
	public QuickName quickName;
	public IncidentNames incidentNames;
	public SocialMediaTabs socialMediaTabs;
	public ArrestEntryForCharge arrestEntryForCharge;
	public ArrestExpungement arrestExpungement;
	public ExpungementSearchLegacyWindow expungementSearchLegacyWindow;
	public PhotoLineupReportWindow photoLineupReportWindow;
	public OffenderSearch offenderSearch;
	public OffenderEntry offenderEntry;

	public Names() {
		if (arrestEntry == null)
			arrestEntry = new ArrestEntry();
		if (nameEntry == null)
			nameEntry = new NameEntry();
		if (nameSearch == null)
			nameSearch = new NameSearch();
		if (arrestSearch == null)
			arrestSearch = new ArrestSearch();
		if (nameSearchHelpWindow == null)
			nameSearchHelpWindow = new NameSearchHelpWindow();
		if (nameMerge == null)
			nameMerge = new NameMerge();
		if (fISearch == null)
			fISearch = new FISearch();
		if (expungement == null)
			expungement = new Expungement();
		if (fIEntry == null)
			fIEntry = new FIEntry();
		if (gunPermitEntry == null)
			gunPermitEntry = new GunPermitEntry();
		if (gunPermitSearch == null)
			gunPermitSearch = new GunPermitSearch();
		if (suspectEntry == null)
			suspectEntry = new SuspectEntry();
		if (suspectSearch == null)
			suspectSearch = new SuspectSearch();
		if (nameMining == null)
			nameMining = new NameMining();
		if (nameSearchPopupScreen == null)
			nameSearchPopupScreen = new NameSearchPopupScreen();
		if (namesComments == null)
			namesComments = new NamesComments();
		if (socialMediaSites == null)
			socialMediaSites = new SocialMediaSites();
		if (socialMediaSitesEntry == null)
			socialMediaSitesEntry = new SocialMediaSitesEntry();
		if (socialMediaSearch == null)
			socialMediaSearch = new SocialMediaSearch();
		if (cellStatus == null)
			cellStatus = new CellStatus();
		if (cellStatusArrestEntry == null)
			cellStatusArrestEntry = new CellStatusArrestEntry();
		if (additionalNumberScreen == null)
			additionalNumberScreen = new AdditionalNumberScreen();
		if (nameMapScreen == null)
			nameMapScreen = new NameMapScreen();
		if (photoLineupEntry == null)
			photoLineupEntry = new PhotoLineupEntry();
		if (buildPhotoLineup == null)
			buildPhotoLineup = new BuildPhotoLineup();
		if (lineupSearch == null)
			lineupSearch = new LineupSearch();
		if (contactEntry == null)
			contactEntry = new ContactEntry();
		if (gangSearch == null)
			gangSearch = new GangSearch();
		if (gangMasterEntry == null)
			gangMasterEntry = new GangMasterEntry();
		if (gangDetailEntry == null)
			gangDetailEntry = new GangDetailEntry();
		if (arrestSearchHelpWindow == null)
			arrestSearchHelpWindow = new ArrestSearchHelpWindow();
		if (quickName == null)
			quickName = new QuickName();
		if (incidentNames == null)
			incidentNames = new IncidentNames();
		if (socialMediaTabs == null)
			socialMediaTabs = new SocialMediaTabs();
		if (arrestEntryForCharge == null)
			arrestEntryForCharge = new ArrestEntryForCharge();
		if (expungementSearch == null)
			expungementSearch = new ExpungementSearch();
		if (arrestExpungement == null)
			arrestExpungement = new ArrestExpungement();
		if (expungementSearchLegacyWindow == null)
			expungementSearchLegacyWindow = new ExpungementSearchLegacyWindow();

		if (photoLineupReportWindow == null)
			photoLineupReportWindow = new PhotoLineupReportWindow();
		if (offenderSearch == null)
			offenderSearch = new OffenderSearch();
		if (offenderEntry == null)
			offenderEntry = new OffenderEntry();
	}

	public void Reset() {

		uIMapNames = null;
		uIMapPopup = null;
	}

	public void switchToArrestSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Booking/frmBookingSrch");
	}

	public void switchToNameSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmNameSrch");
	}

	public void switchToArrestEntry() {
		objectIdentification.windowHandle.switchToWindow("Arrest Entry");
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
	}

	public void switchToNameEntry() {
		objectIdentification.windowHandle.switchToWindow("Name Entry");
		Playback.pageLoadThreadWait();
	}

	public void switchToNameSearchHelpWindow() {
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		objectIdentification.windowHandle.switchToWindow("Name Search");
		Playback.pageLoadThreadWait();
	}

	public void switchToNameSearchPopupScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmVerifyName_Id");
	}

	public void switchToNamesCommentsScreen() {
		objectIdentification.windowHandle.switchToWindow("Names Comments - 2212");
	}

	public void switchToNamesMiningScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("- NameMining", "NameMine_Id");
		Playback.pageLoadThreadWait();
	}

	public void switchToGunPermitEntry() {
		objectIdentification.windowHandle.switchToWindow("Gun Permit entry - 2262");
	}

	public void switchToGunPermitSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmGunpermitsSrch");
	}

	public void switchToBookingCommentsScreen() {
		objectIdentification.windowHandle.switchToWindow("Booking Comments");
	}

	public void switchToSocialMediaSitesScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmUCMediaSiteSearch");
	}

	public void switchToSocialMediaSitesEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("Social Media Sites Entry");
	}

	public void switchToSocialMediaSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmSocialMediaSearch");
	}

	public void switchToGooglePlusLoginScreen() {
		objectIdentification.windowHandle.switchToWindow("Sign in - Google Accounts");
	}

	public void CloseGooglePlusLoginScreen() {
		objectIdentification.windowHandle.closeTheScreen();
	}

	public void switchToCellStatus() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmJailCellStatus");
	}

	public void switchToCellStatusArrestEntryScreen() {

		objectIdentification.windowHandle.switchToWindow("Arrest Entry");
	}

	public void switchToAdditionalNumberScreen() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmNameNumber");
	}

	public void switchToFISearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmNameFISrch");
	}

	public void switchToFIEntryScreen() {
		objectIdentification.windowHandle.switchToWindow("FI Entry");
	}

	public void switchToExpungement() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmExpungement");
		Playback.controlReadyThreadWait();
		names.expungement.VerifyExpungementConfirmWindowMessage();
		Playback.controlReadyThreadWait();
	}

	public void switchToArrestExpungementScreen() {
		objectIdentification.windowHandle.switchToFrame("frmArrestExpungement");
	}

	public void BackToExpungement() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmExpungement");
	}

	public void switchToNameMapScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmNameMap");
	}

	public void switchToPhotoLineupScreen() {
		objectIdentification.windowHandle.switchToWindow("Photo Lineup");
	}

	public void switchToBuildPhotoLineupScreen() {
		objectIdentification.windowHandle.switchToWindow("Build Photo Lineup");
	}

	public void switchToLineupSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmPhotoLineupSrch");
	}

	public void switchToNameMerge() {

		objectIdentification.windowHandle.switchToWindow("Name Merge");
		Playback.pageLoadThreadWait();
	}

	public void switchToNameMergeDetails() {

		objectIdentification.windowHandle.switchToWindowUsingURL("frmMergeDetails");
		Playback.pageLoadThreadWait();
	}

	public void switchToGangSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("Names/frmNameGangSearch");
	}

	public void switchToGangMasterEntry() {
		objectIdentification.windowHandle.switchToWindow("Gang Master Entry");
		Playback.pageLoadThreadWait();
	}

	public void switchToGangDetail() {
		objectIdentification.windowHandle.switchToWindow("Gang Detail");
		Playback.pageLoadThreadWait();
	}

	public void switchToContactEntry() {
		objectIdentification.windowHandle.switchToWindow("Contact Entry");
	}

	public void switchToArrestSearchHelpWindow() {
		objectIdentification.windowHandle.switchToWindow("Arrest Search");
	}

	public void switchToSuspectEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmNameSuspect");
	}

	public void switchToSuspectSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmSuspectSrch");
	}

	public void switchToQuickName() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmQuickName");
		Playback.controlReadyThreadWait();
	}

	public void switchToIncidentNames() {
		objectIdentification.windowHandle.switchToWindow("Incident Names");
	}

	public void switchToExpungementScreen() {
		objectIdentification.windowHandle.switchToWindow("Expungement");
		Playback.controlReadyThreadWait();
		names.expungement.VerifyExpungementConfirmWindowMessage();
		Playback.controlReadyThreadWait();
	}

	public void switchToArrestEntryChargeWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmChargeModifier.aspx");
		Playback.pageLoadThreadWait();
	}

	public void switchToExpungementSearchHelpScreen() {
		objectIdentification.windowHandle.switchToWindow("Expungement Search");
	}

	public void switchToReInstateWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmReInstateArrestExpungement");
	}

	public void switchToExpungementSearchLegacyWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmExpungementSrch");
	}

	public void switchToArrestExpungement() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmArrestExpungement");
	}

	public void switchToPhotoLineupReportWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmPnxSQLRpt.aspx");
	}

	public void switchToExpungementSearchScreen() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmExpungementsSrch");
	}

	public void switchToExpungementEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmExpungementEntry");
		Playback.controlReadyThreadWait();
	}

	public class NameSearch {

		public NameSearchAdvancedTab nameSearchAdvancedTab = null;
		public NameSearchMOTab nameSearchMOTab = null;
		public NameSearchQAFormTab nameSearchQAFormTab = null;

		public NameSearch() {
			if (this.nameSearchAdvancedTab == null)
				this.nameSearchAdvancedTab = new NameSearchAdvancedTab();

			if (this.nameSearchMOTab == null)
				this.nameSearchMOTab = new NameSearchMOTab();

			if (this.nameSearchQAFormTab == null)
				this.nameSearchQAFormTab = new NameSearchQAFormTab();

		}

		public void SelectAtNameType() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys(BaseData.getNamesModuleValue("NameType"));

		}

		public void EnterAtLastName() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName").toString());
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtFirstName() {
			uIMapNames.nameSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName").toString());
			uIMapNames.nameSearch.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddNewButton() {
			uIMapNames.nameSearch.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickSearchButton() {
			uIMapNames.nameSearch.uISearchButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickBackButton() {
			uIMapNames.nameSearch.uIBackButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickRefreshButton() {
			uIMapNames.nameSearch.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickResetButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameSearch.uIResetButton.click();
		}

		public void ClickPrintIcon() {
			uIMapNames.nameSearch.uIPrintIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectNameByID() {
			Playback.wait(3000);
			Playback.wait(3000);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("NameID").toString());
			Playback.controlReadyThreadWait();

		}

		public void MouserHoverNameIDInGrid(int rowIndex) {
			Actions mousehover = new Actions(Playback.driver);
			mousehover.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, "ID", rowIndex)).perform();
			Playback.controlReadyThreadWait();
			String Smoketest = uIMapNames.nameSearch.uINameActivityMouseover.getText();
			verify.ExpectedValueIsTrue(uIMapNames.nameSearch.uINameActivityMouseover.getText().contains("Warrant"));
			verify.ExpectedValueIsTrue(uIMapNames.nameSearch.uINameActivityMouseover.getText().contains("Gun Permit"));
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			mousehover = null;
			Playback.controlReadyThreadWait();
			Playback.gridLoadThreadWait();
		}

		public void VerifyFlagIconInSearchscreen(int rowIndex) {
			String Flag = objectIdentification.manualIdentify.getGridCell("grdNames", "F", rowIndex)
					.getAttribute("class");
			verify.ExpectedValueIsTrue(Flag.contains("flag"));
		}

		public void VerifyWarrantIconInSearchscreen(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridCell(uIMapNames.nameSearch.uIResultTable, "W", rowIndex)
							.getAttribute("class").contains("IsWarrant"));
		}

		public void SelectNameTypeAsA() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys("A");
		}

		public void SelectNameTypeAsB() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys("B");
		}

		public void enterAtNameID() {
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtBNameID() {
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("BNameID").substring(0, 1));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("BNameID").substring(2));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterLastName() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName").toString());
		}

		public void EnterFirstName() {
			uIMapNames.nameSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName").toString());
		}

		public void EnterAtWarrantLastName() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantLastName"));
		}

		public void EnterAtWarrantFirstName() {
			uIMapNames.nameSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantFirstName"));
		}

		public void VerifyFlagIconNotinSearchscreen(int rowIndex) {
			String Flag = objectIdentification.manualIdentify.getGridCell("grdNames", "F", rowIndex)
					.getAttribute("class");
			verify.ExpectedValueIsFalse(Flag.contains("flag"));
		}

		public void VerifyWarrantLastNameWarrantFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.nameSearch.uIResultTable,
							"Name", rowIndex),
					BaseData.getNamesModuleValue("WarrantLastName") + ", "
							+ BaseData.getNamesModuleValue("WarrantFirstName"));
		}

		public void ClickRowAtWarrantLastNameWarrantFirstName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("WarrantLastName") + ", "
							+ BaseData.getNamesModuleValue("WarrantFirstName"));
		}

		public void VerifyAtNameUsingLastNameFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.nameSearch.uIResultTable,
							"Name", rowIndex),
					BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"));
		}

		public void VerifyAtBTypeName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapNames.nameSearch.uIResultTable, "Name", rowIndex), BaseData.getNamesModuleValue("LastName"));
		}

		public void ClickAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"));
		}

		public void ClickAtNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("NameID"));
		}

		public void ClickAtBNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("BNameID"));
		}

		public void ClickAtBTypeName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("LastName"));
		}

		public void VerifyConfirmDeceasedMessage() {

			popup.confirm.yesWithExpectedMessage("(6129) This person is deceased");
		}

		public void VerifyConfirmDefunctMessage() {

			popup.confirm.yesWithExpectedMessage("(6131) This name is defunct");

		}

		public void VerifyDeceasedNameRowColor(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex)
							.getAttribute("class").contains("graycolor"));
		}

		public void VerifyNoRecordFoundAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void ClickAdvancedTab() {
			uIMapNames.nameSearch.uIAdvancedTab.click();
			Playback.waitForControlReady();
		}

		public void ClickQaFormTab() {
			uIMapNames.nameSearch.uIQAFormTab.click();
			Playback.waitForControlReady();
		}

		public void ClickSelectAllCheckbox() {
			uIMapNames.nameSearch.uISelectAllCheckBox.click();
			Playback.gridLoadThreadWait();
		}

		public void VerifyNameSelectCount0() {
			verify.ExpectedPropertyValueIsEqual("0",
					uIMapNames.nameSearch.uINameItemCountTextView.getAttribute("value"));
		}

		public void Select3RandomNameCheckboxInGrid() {
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapNames.nameSearch.uIResultTable);
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapNames.nameSearch.uIResultTable);
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(uIMapNames.nameSearch.uIResultTable);
		}

		public void VerifyNameSelectCount3() {
			verify.ExpectedPropertyValueIsEqual("3",
					uIMapNames.nameSearch.uINameItemCountTextView.getAttribute("value"));
		}

		public void ClickClearIcon() {
			uIMapNames.nameSearch.uINameItemCountClearIcon.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickNext() {
			uIMapNames.nameSearch.uINextLink.click();
		}

		public void SelectPatrolAsPatrolZone() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameSearch.uIPatrolAreaComboBox,
					"Patrol Zone");
		}

		public void ClickShowMapButton() {
			uIMapNames.nameSearch.uIShowMapButton.click();
		}

		public void SelectNameTypeAsJ() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys("J");
		}

		public void SelectNameTypeAsO() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys("Other");
		}

		public void EnterAtJLastName() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("JLastName").toString());
		}

		public void EnterAtAliasLastName() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("AliasLastName").toString());
		}

		public void VerifyJNameRowGreenColor(int rowIndex) {

			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex)
							.getAttribute("class").contains("junvenileColor"));
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex)
							.getCssValue("color").contains("0, 128, 0, 1"));
		}

		public void VerifyAliasNameRowRedColor(int rowIndex) {
			if (Url.contains("http://192.168.14.45")) {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getAttribute("class")
						.contains("aliascolor"));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getCssValue("color")
						.contains("255, 0, 0, 1"));
			} else {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getAttribute("class")
						.contains("redcolor"));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getCssValue("color")
						.contains("255, 0, 0, 1"));
			}
		}

		public void VerifyAliasNameRedColor4Row() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, 3)
							.getAttribute("class").contains("redcolor"));
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, 3)
							.getCssValue("color").contains("255, 0, 0, 1"));
		}

		public void VerifyJNameRowBlueColor(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex)
							.getAttribute("class").contains("junvenileColor"));
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex)
							.getCssValue("color").contains("0, 0, 255, 1"));
		}

		public void VerifyANameRowBlackColor(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex)
							.getCssValue("color").contains("0, 0, 0, 1"));
		}

		public void VerifyONameRowBlackColor3rdrow(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex)
							.getCssValue("color").contains("0, 0, 0, 1"));
		}

		public void VerifyAtNameID(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.nameSearch.uIResultTable, "ID",
							rowIndex));
		}

		public void VerifyAtNameIDinFirstRow(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.nameSearch.uIResultTable, "ID",
							rowIndex));
		}

		public void SelectFlagRadControl() {
			uIMapNames.nameSearch.uIFlagComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapNames.nameSearch.uIFlagRadControlComboBox, BaseData.getNamesModuleValue("Flag"));
		}

		public void ClickPrimaryNameOnlyCheckBox() {
			uIMapNames.nameSearch.uIPrimaryNameOnlyCheckBox.click();
		}

		public void VerifyPrimaryNameOnlyShowsInGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.nameSearch.uIResultTable) == 1);
		}

		public void VerifyColumnNameAddressSSNShows() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("Address"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("SS#"));
		}

		public void VerifyColumnNameDOBRaceAgeHGT() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("HGT"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("WGT"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("Age"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("R"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("Hair"));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("Eye"));
		}

		public void ClickSwitchView() {
			uIMapNames.nameSearch.uISwitchViewButton.click();
		}

		public void VerifySwitchViewLabelAppears() {
			verify.ExpectedPropertyValueIsEqual("Switch View", uIMapNames.nameSearch.uISwitchViewButton.getText());
		}

		public void EnterAtDOB() {
			uIMapNames.nameSearch.uIDOBEdit.click();
			uIMapNames.nameSearch.uIDOBEdit.sendKeys(BaseData.getNamesModuleValue("DOB").toString());
		}

		public void VerifyAtDOB() {
			List<String> dob = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "DOB");
			for (String value : dob)
				verify.ExpectedPropertyValueIsEqual(value, BaseData.getNamesModuleValue("DOB"));

		}

		public void EnterAtInPossLastName() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("InPossLastName").toString());
		}

		public void EnterAtInPossFirstName() {
			uIMapNames.nameSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("InPossFirstName").toString());
		}

		public void VerifyAtInPossName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.nameSearch.uIResultTable,
							"Name", rowIndex),
					BaseData.getNamesModuleValue("InPossLastName") + ", "
							+ BaseData.getNamesModuleValue("InPossFirstName"));
		}

		public void ClickPrev() {
			uIMapNames.nameSearch.uIPrevLink.click();
		}

		public void VerifyFirst3CheckboxesChecked() {
			WebElement Name1RowIsChecked = objectIdentification.manualIdentify
					.getGridTableRow(uIMapNames.nameSearch.uIResultTable, 0).findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(Name1RowIsChecked.getAttribute("alt").contains("Checked"));
			WebElement Name2RowIsChecked = objectIdentification.manualIdentify
					.getGridTableRow(uIMapNames.nameSearch.uIResultTable, 1).findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(Name2RowIsChecked.getAttribute("alt").contains("Checked"));
			WebElement Name3RowIsChecked = objectIdentification.manualIdentify
					.getGridTableRow(uIMapNames.nameSearch.uIResultTable, 2).findElement(By.tagName("img"));
			verify.ExpectedValueIsTrue(Name3RowIsChecked.getAttribute("alt").contains("Checked"));
		}

		public void VerifyAtName1RowColorAsAlias() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
									BaseData.getNamesModuleValue("Name1"))
							.getAttribute("class").contains("aliascolor"));
		}

		public void VerifyAtNameRowColorAsJunvenile() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
									BaseData.getNamesModuleValue("Name"))
							.getAttribute("class").contains("junvenileColor"));
		}

		public void VerifyAliasNameRowColor(int rowIndex) {
			if (Url.contains("http://192.168.14.45")) {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getAttribute("class")
						.contains("aliascolor"));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getCssValue("color")
						.contains("255, 165, 0, 1"));
			} else {
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getAttribute("class")
						.contains("aliascolor"));
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getGridTableRow(uIMapNames.nameSearch.uIResultTable, rowIndex).getCssValue("color")
						.contains("255, 165, 0, 1"));
			}
		}

		public void SelectAddressAsAddress() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameSearch.uIAddressComboBox,
					"Address");
			uIMapNames.nameSearch.uIAddressComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtPremiseNo() {
			uIMapNames.nameSearch.uIPremiseEdit.sendKeys(BaseData.getNamesModuleValue("PremiseNo"));
		}

		public void EnterAtStreet() {
			uIMapNames.nameSearch.uIStreetEdit.sendKeys(BaseData.getNamesModuleValue("Street"));
		}

		public void VerifyAtName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapNames.nameSearch.uIResultTable, "Name", rowIndex), BaseData.getNamesModuleValue("Name"));
		}

		public void VerifyWarrantIconColorIsOrangeInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridCell(uIMapNames.nameSearch.uIResultTable, "W", rowIndex)
							.getAttribute("class").contains("IsWarrantExp"));
		}

		public void VerifyWarrantIconColorIsGreenInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify.getGridCell(uIMapNames.nameSearch.uIResultTable, "W", rowIndex)
							.getAttribute("class").contains("IsWarrant"));
		}

		public void ClickWarrantIconInGridUsingNameID() {
			WebElement warrantIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, BaseData.getNamesModuleValue("NameID"), "W");
			warrantIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickWarrantIconInGridUsingName() {
			WebElement warrantIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, BaseData.getNamesModuleValue("Name"), "W");
			warrantIcon.click();
		}

		public void ClickWarrantIconInGridUsingName1() {
			WebElement warrantIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, BaseData.getNamesModuleValue("Name1"), "W");
			warrantIcon.click();
		}

		public void VerifyCivilIconInSearchscreen(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, "CVL", rowIndex).getAttribute("class")
					.contains("CivilName"));
		}

		public void ClickCivilIconInGridUsingNameID() {
			WebElement civilIcon = objectIdentification.manualIdentify.getGridCell(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("NameID"), "CVL");
			civilIcon.click();
		}

		public void enterAtAddress() {
			uIMapNames.nameSearch.uIAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address"));
			uIMapNames.nameSearch.uIAddressVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void EnterAtTelephone() {
			uIMapNames.nameSearch.uITelephoneEdit.click();
			uIMapNames.nameSearch.uITelephoneEdit.sendKeys(BaseData.getNamesModuleValue("Telephone"));
		}

		public void SelectNameTypeAsAdult() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys("Adult");
		}

		public void EnterAtCity() {
			uIMapNames.nameSearch.uICityEdit.click();
			uIMapNames.nameSearch.uICityEdit.sendKeys(BaseData.getNamesModuleValue("City"));
		}

		public void EnterNameTypeAndNameID(String nameType, String nameID) {
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(nameType);
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(nameID);
		}

		public void enterNameID(String name) {
			String nametype = name.substring(0, 1);
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(nametype);
			Playback.controlReadyThreadWait();
			String id = name.substring(2);
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(id);
			Playback.controlReadyThreadWait();
		}

		public void verifyNameID(String nameID) {
			WebElement id = objectIdentification.manualIdentify.getGridCell(uIMapNames.nameSearch.uIResultTable, "ID",
					0);
			String text = id.getText();
			verify.ExpectedPropertyValueIsEqual(text, nameID);
		}

		public void reloadNameSearch() {
			objectIdentification.manualIdentify.reloadScreen("Name Search");
		}

		public void enterAtMiddleName() {
			uIMapNames.nameSearch.uIMiddleNameEdit.sendKeys(BaseData.getNamesModuleValue("MiddleName"));
			uIMapNames.nameSearch.uIMiddleNameEdit.sendKeys(Keys.TAB);

		}

		public void verifyAtNameInGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "Name");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Name")));
		}

		public void SelectAtNameType1() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys(BaseData.getNamesModuleValue("NameType1"));

		}

		public void enterAtLastName1() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName1").toString());
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtName1InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "Name");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Name1")));
		}

		public void verifyAtName2InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "Name");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Name2")));
		}

		public void verifyAtName3InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "Name");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Name3")));
		}

		public void verifyAtName4InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "Name");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Name4")));
		}

		public void verifyAtNameID1InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "ID");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("NameID1")));
		}

		public void verifyAtNameID2InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "ID");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("NameID2")));
		}

		public void verifyAtNameID3InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "ID");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("NameID3")));
		}

		public void verifyAtNameID4InGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameSearch.uIResultTable, "ID");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("NameID4")));
		}

		public void SelectAtNameType2() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys(BaseData.getNamesModuleValue("NameType2"));

		}

		public void SelectAtNameType3() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys(BaseData.getNamesModuleValue("NameType3"));

		}

		public void SelectAtNameType4() {
			uIMapNames.nameSearch.uINameTypeComboBox.sendKeys(BaseData.getNamesModuleValue("NameType4"));

		}

		public void clickSoundAlikeCheckBox() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameSearch.uISoundLikeCheckBox.click();
		}

		public void verifySoundAlikeFeatureAckwMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage(
					"(6016) Last Name and First Name fields entries are missing. The Sound Alike feature is not allowed.");
		}

		public void EnterAtNameID2() {
			uIMapNames.nameSearch.uINameTypeEdit.clear();
			uIMapNames.nameSearch.uINameIDEdit.clear();
			Playback.popupThreadWait();
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID2").substring(0, 1));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID2").substring(2));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void selectRowByAtOtypeNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("OtypeNameID"));
		}

		public void selectRowByAtAtypeNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("AtypeNameID"));
		}

		public void selectRowByAtBtypeNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("BtypeNameID"));
		}

		public void selectRowByAtJtypeNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("JtypeNameID"));
		}

		public void enterAtNameID1() {
			uIMapNames.nameSearch.uINameTypeEdit.clear();
			uIMapNames.nameSearch.uINameIDEdit.clear();
			Playback.popupThreadWait();
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID1").substring(0, 1));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID1").substring(2));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void clickMoTab() {
			uIMapNames.nameSearch.uIMOTab.click();
			Playback.controlReadyThreadWait();

		}

		public void verifyAtNameType() {
			String actual = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.nameSearch.uINameTypeComboBox);
			String expected = BaseData.getNamesModuleValue("NameType");
			verify.ExpectedPropertyValueIsEqual(expected, actual);

		}

		public void enterRandomDateAtDOB() {
			uIMapNames.nameSearch.uIDOBEdit.sendKeys(Randomized.getPreviousMonth(30));
		}

		public ArrayList<String> mouserHoverAtNameAndVerifyActivities() {

			Playback.actionDriver.moveToElement(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, BaseData.getNamesModuleValue("Name"))).build()
					.perform();
			Playback.threadWait(4000);
			ArrayList<String> StringValue = new ArrayList<>();
			List<WebElement> cells = uIMapNames.nameSearch.uINameActivityMouseover
					.findElements(By.xpath(".//tbody//tr//td"));
			for (WebElement ele : cells) {
				StringValue.add(ele.getText());
			}

			ArrayList<String> StringVerify = new ArrayList<>();
			StringVerify.add(BaseData.getNamesModuleValue("Date"));
			StringVerify.add(BaseData.getNamesModuleValue("Activity"));
			StringVerify.add(BaseData.getNamesModuleValue("Date"));
			StringVerify.add(BaseData.getNamesModuleValue("Activity1"));
			StringVerify.add(BaseData.getNamesModuleValue("Date"));
			StringVerify.add(BaseData.getNamesModuleValue("Activity2"));

			verify.ExpectedValueIsTrue(StringValue.equals(StringVerify));

			System.out.println(StringValue + "-----------------------" + StringVerify);

			return StringValue;

		}

		public void selectNameByLastNameAndFirstName() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"));
			Playback.controlReadyThreadWait();
			Playback.waitForPageLoad();
		}

		public void clickAddressIBubbleIcon() {
			uIMapNames.nameSearch.uIAddressInfoIcon.click();

		}

		public void ClickWarrantIconInGridUsingNameIDs(int rowIndex) {
			WebElement warrantIcon = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameSearch.uIResultTable, BaseData.getNamesModuleValue("NameID" + rowIndex + ""), "W");
			warrantIcon.click();
		}

		public void VerifyWarrantIconNotDisplayed(int rowIndex) {
			String noImg = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, "W", rowIndex).getCssValue("background-image");
			verify.ExpectedValueIsTrue(noImg.contains("remove.gif"));
		}

		public void enterAtFirstName1() {
			uIMapNames.nameSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName1").toString());
		}

		public void clickAtName1()

		{
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("LastName1") + ", " + BaseData.getNamesModuleValue("FirstName1"));
		}

		public void enterAtLastName2() {
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName2"));
			uIMapNames.nameSearch.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterActiveNameID(String nameID) {
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(nameID.substring(0, 1));
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(Keys.TAB);
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(nameID.substring(2));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNameID2() {
			uIMapNames.nameSearch.uINameTypeEdit.clear();
			uIMapNames.nameSearch.uINameIDEdit.clear();
			Playback.popupThreadWait();
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID2").substring(0, 1));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID2").substring(2));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void enterAtNameID3() {
			uIMapNames.nameSearch.uINameTypeEdit.clear();
			uIMapNames.nameSearch.uINameIDEdit.clear();
			Playback.popupThreadWait();
			uIMapNames.nameSearch.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID3").substring(0, 1));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID3").substring(2));
			uIMapNames.nameSearch.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void clickAtNameID1() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("NameID1"));
		}

		public void clickAtNameID2() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearch.uIResultTable,
					BaseData.getNamesModuleValue("NameID2"));
		}

		public void verifyAtFirstNameIsNull() {
			String attribute = uIMapNames.nameSearch.uIFirstNameEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(!attribute.contains(BaseData.getNamesModuleValue("FirstName")));
			// verify.ExpectedValueIsTrue(BaseData.getNamesModuleValue("FirstName").contains(TestResourceFolderPath));

		}

		public void verifyAtDOBIsNull() {
			String attribute = uIMapNames.nameSearch.uIDOBEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(!attribute.contains(BaseData.getNamesModuleValue("DOB")));
		}

		public void verifyAtAddressIsNull() {
			String attribute = uIMapNames.nameSearch.uIAddressEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(!attribute.contains(BaseData.getNamesModuleValue("Address")));
		}

		public void verifyAtNameTypeIsNull() {
			String attribute = uIMapNames.nameSearch.uINameTypeComboBox.getAttribute("value");
			verify.ExpectedValueIsTrue(!attribute.contains(BaseData.getNamesModuleValue("NameType")));

		}

		public void selectRowByAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.arrestSearch.uIResultTable,
					BaseData.getNamesModuleValue("CaseNo"));

		}

		// Added by Mohan for TC278225
		public void VerifyAtNameUsingLastName(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameSearch.uIResultTable, "Name", rowIndex)
					.contains(BaseData.getNamesModuleValue("LastName")));
		}

		// added by Mohan for Testcase #278225
		public void VerifyColumnNameAddress(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText().contains("Address"),
					BaseData.getNamesModuleValue("Address"));
		}

		public void verifyatleastOneCriteriaToStartTheSearch() {
			popup.acknowledge.okWithExpectedMessage("(6015)Enter at least one criteria/keyword to start the search");

		}

		public void verifyBackButtonIsEnabled() {
			uIMapNames.nameSearch.uIBackButton.isEnabled();

		}

		public void verifySwitchViewButtonIsEnabled() {
			uIMapNames.nameSearch.uISwitchViewButton.isEnabled();
		}

		public void verifySelectedCheckBoxISEnabled() {
			uIMapNames.nameSearch.uISelectAllCheckBox.isDisplayed();

		}

		public void verifySearchButtonIsEnabled() {
			uIMapNames.nameSearch.uISearchButton.isEnabled();

		}

		public void clickBasicTab() {
			uIMapNames.nameSearch.uIBasicTab.click();
		}

		public void verifyNameTypeAsNull() {
			String dropDwonSelectedItem = objectIdentification.manualIdentify
					.getDropDwonSelectedItem(uIMapNames.nameSearch.uINameTypeComboBox);

			verify.ExpectedPropertyValueIsEqual(dropDwonSelectedItem, "--");
		}

		public void verifyHeaderRowBeforeSwitchview() {
			String GridHeaderRow = objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText();
			verify.ExpectedValueIsTrue(GridHeaderRow.contains(""));
		}

		public void verifyHeaderRowAfterSwitchview() {
			String GridHeaderRow = objectIdentification.manualIdentify
					.getGridHeaderTableRow(uIMapNames.nameSearch.uIResultTable).getText();
			verify.ExpectedValueIsTrue(GridHeaderRow.contains(""));
		}

		public void clickCheckBoxRowByID(String ID) {
			Playback.driver
					.findElement(By.xpath("//td[text()='" + ID + "']//..//img[contains(@src,'ig_checkbox_off.gif')]"))
					.click();

		}

		public void ClickNameMiningIcon() {
			uIMapNames.nameSearch.uINameMineIcon.click();
		}

		public void ClickPhotoBookIcon() {
			uIMapNames.nameSearch.uIPhotoBooIcon.click();
		}

		public void verifyLastActivityDateUsingLastName(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameSearch.uIResultTable, "Last Activity", rowIndex)
					.contains(Randomized.getCurrentDate()));
		}

	}

	public class NameSearchAdvancedTab {
		public void EnterLegacyRef1Number() {
			uIMapNames.nameSearch.nameSearchAdvancedTab.uILegacyRefNo1Edit.sendKeys(Randomized.randomString(3));
		}

		public void EnterLegacyRef2Number() {
			uIMapNames.nameSearch.nameSearchAdvancedTab.uILegacyRefNo2Edit.sendKeys(Keys.TAB);
		}

		public void EnterFutureDateFromField() {
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredFromDateEdit.sendKeys(Randomized.getFutureDate(1));
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredFromDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterFutureDateToField() {
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredToDateEdit.sendKeys(Randomized.getFutureDate(1));
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredToDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterPreviousDateFromField() {
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredFromDateEdit
					.sendKeys(Randomized.getPreviousDate(1, "MM/dd/yyyy"));
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredFromDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterCurrentDateToField() {
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredToDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapNames.nameSearch.nameSearchAdvancedTab.uINameEnteredToDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyFutureDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1036) Future Date not allowed");
		}

		public void SelectAtEthnicity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameSearch.nameSearchAdvancedTab.uIEthnicityComboBox,
					BaseData.getNamesModuleValue("Ethnicity"));
			uIMapNames.nameSearch.nameSearchAdvancedTab.uIEthnicityComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtPlateNo() {
			uIMapNames.nameSearch.nameSearchAdvancedTab.uIPlateNoEdit.sendKeys(BaseData.getNamesModuleValue("PlateNo"));
		}

		public void selectAtPlateState() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameSearch.nameSearchAdvancedTab.uIPlateStateComboBox,
					BaseData.getNamesModuleValue("PlateState"));
			uIMapNames.nameSearch.nameSearchAdvancedTab.uIEthnicityComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtSSNo() {
			Playback.gridLoadThreadWait();
			uIMapNames.nameSearch.nameSearchAdvancedTab.uISSNoEdit.click();
			uIMapNames.nameSearch.nameSearchAdvancedTab.uISSNoEdit.sendKeys(BaseData.getNamesModuleValue("SSNo"));
			uIMapNames.nameSearch.nameSearchAdvancedTab.uISSNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtSSno() {
			String SSNO = uIMapNames.nameSearch.nameSearchAdvancedTab.uISSNoEdit.getText();
			verify.ExpectedPropertyValueIsEqual(SSNO, BaseData.getNamesModuleValue("SSNo"));
		}

	}

	public class NameSearchMOTab {
		public void selectAtDetails() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameSearch.nameSearchMOTab.uIDetailsComboBox, BaseData.getNamesModuleValue("Details"));
		}

		public void selectAtCategory() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameSearch.nameSearchMOTab.uICategoryComboBox, BaseData.getNamesModuleValue("Category"));
		}

		public void selectAtType() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameSearch.nameSearchMOTab.uITypeComboBox, BaseData.getNamesModuleValue("Type"));
		}
	}

	public class NameSearchQAFormTab {

		public void selectAtSelectForm() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameSearch.nameSearchQAFormTab.uISelectFormComboBox,
					BaseData.getNamesModuleValue("Form"));
		}

		public void clickSearchButton() {
			uIMapNames.nameSearch.nameSearchQAFormTab.uISearchButton.click();

		}

		public void ClickFormInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxesByIndex(uIMapNames.nameSearch.uIResultTable, 0);
		}

		public void clickIncludeOnlyFormsCheckBox() {
			uIMapNames.nameSearch.nameSearchQAFormTab.uIIncludeOnlyFormsCheckBox.click();

		}

		public void enterAtSearchWords() {
			uIMapNames.nameSearch.nameSearchQAFormTab.uISearchWords
					.sendKeys(BaseData.getNamesModuleValue("SearchWords"));

		}

		public void enterAtFromDate() {
			uIMapNames.nameSearch.nameSearchQAFormTab.uIFromDate.sendKeys(BaseData.getNamesModuleValue("FromDate"));

		}

		public void enterAtToDate() {
			uIMapNames.nameSearch.nameSearchQAFormTab.uIToDate.sendKeys(BaseData.getNamesModuleValue("FromDate"));

		}

		public void clickResetButton() {
			uIMapNames.nameSearch.nameSearchQAFormTab.uIResetButton.click();

		}

	}

	public class NameSearchHelpWindow {

		public void selectNameByLastNameAndFirstName() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"));
				Playback.controlReadyThreadWait();
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
			} else {
				names.switchToNameSearchHelpWindow();
				objectIdentification.randomIdentify.selectRandomGridRow(uIMapNames.nameSearchHelpWindow.uIResultTable);
				Playback.controlReadyThreadWait();
				Playback.threadWait();

			}
		}

		public void SelectNameByLastName() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						BaseData.getNamesModuleValue("LastName").toString());
				Playback.controlReadyThreadWait();
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
			} else {
				names.switchToNameSearchHelpWindow();
				objectIdentification.randomIdentify.selectRandomGridRow(uIMapNames.nameSearchHelpWindow.uIResultTable);
				Playback.controlReadyThreadWait();
				Playback.threadWait();

			}
		}

		public void VerifyAtNameIDUsingAtName(int rowIndex) {
			// objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
			// BaseData.getNamesModuleValue("LastName") + ", " +
			// BaseData.getNamesModuleValue("FirstName"));
			Playback.gridLoadThreadWait();
			String dgfdfd = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable, "ID", rowIndex).getText();

			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable, "ID", rowIndex).getText()
					.contains(BaseData.getNamesModuleValue("NameID")));

		}

		public void VerifyAtDOBUsingAtNameID() {
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("DOB"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
									BaseData.getNamesModuleValue("NameID"), "DOB")
							.getText());
		}

		public void SelectNameByNameID() {
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("NameID"));
				Playback.controlReadyThreadWait();
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
			}

			else {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("NameID"));
				Playback.controlReadyThreadWait();
			}
		}

		public void SelectName() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				objectIdentification.randomIdentify
						.selectRandomGridRowCheckbox(uIMapNames.nameSearchHelpWindow.uIResultTable);
				Playback.controlReadyThreadWait();
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
			} else {
				names.switchToNameSearchHelpWindow();
				objectIdentification.randomIdentify.selectRandomGridRow(uIMapNames.nameSearchHelpWindow.uIResultTable);
				Playback.controlReadyThreadWait();
				Playback.threadWait();
				objectIdentification.windowHandle.switchToMainWindow();

			}
		}

		public void SelectRowAtName1() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("Name1"));
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
			} else {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("Name1"));
				Playback.threadWait();

			}

		}

		public void SelectTrafficNameByDefendant1LastFirstName() {

			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						BaseData.getNamesModuleValue("Defendant1LastName") + ", "
								+ BaseData.getNamesModuleValue("Defendant1FirstName"));
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
			} else {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						BaseData.getNamesModuleValue("Defendant1LastName") + ", "
								+ BaseData.getNamesModuleValue("Defendant1FirstName"));
				Playback.threadWait();
				Playback.waitForPageLoad();

			}

		}


		public void SelectIncidentName() {
			
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();

				objectIdentification.randomIdentify.selectRandomGridRow(
						uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable);
				uIMapNames.nameSearchHelpWindow.uISelectIncidentNameButton.click();
				Playback.threadWait();
				Playback.waitForPageLoad();
			} else {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.randomIdentify.selectRandomGridRow(
						uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable);
				Playback.threadWait();

			}

		}

		public void SelectAtIncidentJName() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
					BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.nameSearchHelpWindow.uISelectIncidentNameButton.click();
			Playback.threadWait();
		}

		public void SelectIncidentNameAtName() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable, BaseData.getNamesModuleValue("Name"));
			uIMapNames.nameSearchHelpWindow.uISelectIncidentNameButton.click();
			Playback.threadWait();
		}

		public void SelectIncidentNameAtName1() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable, BaseData.getNamesModuleValue("Name1"));
			uIMapNames.nameSearchHelpWindow.uISelectIncidentNameButton.click();
			Playback.threadWait();
		}

		public void VerifyAtDOBByAtNameID() {
			WebElement dob = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.nameSearch.uIResultTable, BaseData.getNamesModuleValue("NameID"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("DOB"), objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearch.uIResultTable, dob, "DOB").getText());
		}

		public void VerifyAtNameID() {
			// objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
			// BaseData.getNamesModuleValue("LastName") + ", " +
			// BaseData.getNamesModuleValue("FirstName"));
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
									BaseData.getNamesModuleValue("NameID"))
							.getText());
		}

		public void VerifyAtLastName(int rowIndex) {
			Playback.gridLoadThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameSearchHelpWindow.uIResultTable, "Name", rowIndex).getText()
					.contains(BaseData.getNamesModuleValue("LastName")));
		}

		public void ClickBack() {
			uIMapNames.nameSearchHelpWindow.uIBackButton.click();
		}

		public void ClickReset() {
			uIMapNames.nameSearchHelpWindow.uIResetButton.click();
		}

		public void EnterAtLastName() {
			uIMapNames.nameSearchHelpWindow.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void ClickSearch() {
			uIMapNames.nameSearchHelpWindow.uISearchButton.click();
		}

		public void SelectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameSearchHelpWindow.uIJurisComboBox,
					BaseData.getNamesModuleValue("Juris"));
		}

		public void CloseScreen() {
			uIMapNames.nameSearchHelpWindow.driver.close();
		}

		public void VerifyAtName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
									BaseData.getNamesModuleValue("Name"), "Name")
							.getText());
		}

		public void VerifyAtNameInIncidentActivityGridUsingByActivity() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameSearchHelpWindow.uIIncidentActivityResultTable,
									BaseData.getNamesModuleValue("Activity"), "Name")
							.getText());
		}

		public void VerifyAtActivityInIncidentActivityGridUsingByName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Activity"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameSearchHelpWindow.uIIncidentActivityResultTable,
									BaseData.getNamesModuleValue("Name"), "Activity")
							.getText());
		}

		public void VerifySwitchViewLabelAppears() {
			verify.ExpectedPropertyValueIsEqual("Switch View",
					uIMapNames.nameSearchHelpWindow.uISwitchViewButton.getText());
		}

		public void ClickCopyButton() {
			uIMapNames.nameSearchHelpWindow.uICopyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectAtActivityInIncidentActivityGrid() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentActivityResultTable,
					BaseData.getNamesModuleValue("Activity"));
			uIMapNames.nameSearchHelpWindow.uICopyButton.click();
			Playback.threadWait();
		}

		public void SelectAtArrestNameInIncidentActivityGrid() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentActivityResultTable,
					BaseData.getNamesModuleValue("ArrestLastName") + ", "
							+ BaseData.getNamesModuleValue("ArrestFirstName"));
			uIMapNames.nameSearchHelpWindow.uICopyButton.click();
			Playback.threadWait();
		}

		public void ClickIncidentNameActivity1RowCheckBox() {
			uIMapNames.nameSearchHelpWindow.uIIncidentNameActivity1CheckBox.click();
			uIMapNames.nameSearchHelpWindow.uICopyButton.click();
			Playback.threadWait();
		}

		public void ClickIncidentNameActivity0RowCheckBox() {
			uIMapNames.nameSearchHelpWindow.uIIncidentNameActivity0CheckBox.click();
			uIMapNames.nameSearchHelpWindow.uICopyButton.click();
			Playback.threadWait();
		}

		public void SelectAtVictimNameInIncidentActivityGrid() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentActivityResultTable,
					BaseData.getNamesModuleValue("VictimLastName") + ", "
							+ BaseData.getNamesModuleValue("VictimFirstName"));
			uIMapNames.nameSearchHelpWindow.uICopyButton.click();
			Playback.threadWait();
		}

		public void ClickAtDOBInIncidentNames() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable,
					BaseData.getNamesModuleValue("DOB").toString());
			Playback.threadWait();
		}

		public void ClickAddNew() {
			uIMapNames.nameSearchHelpWindow.uIAddNewButton.click();
			Playback.threadWait();
		}

		public void VerifyJuvinalNameConfirmMessage() {

			popup.confirm.yesWithExpectedMessage(
					"(6125) You have selected a Juvenile Name record. This individual is no longer a Juvenile. Select YES to use this Juvenile Name record, or select NO to choose the Adult Name record or to create a 'New' Adult Name record for this individual.");
		}

		public void SelectAtNameRow() { // make changes by Abi
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("Name"));
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
				Playback.threadWait();
			} else {
				names.switchToNameSearchHelpWindow();
				Playback.gridLoadThreadWait();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("Name"));
			}
		}

		public void SelectNameByNameID1() {
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("NameID1"));
				Playback.controlReadyThreadWait();
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
			}

			else {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable,
						BaseData.getNamesModuleValue("HelpWindowNameID"));
				Playback.controlReadyThreadWait();
			}
		}

		public void selectNameUsingNameID(String nameID) {
			objectIdentification.manualIdentify
					.selectGridRowCheckBoxByCellInnerText(uIMapNames.nameSearchHelpWindow.uIResultTable, nameID);
			Playback.threadWait();
			uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
			Playback.threadWait();
			popup.confirm.yes();

		}

		public void selectAtJuris() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameSearchHelpWindow.uIJurisComboBox,
					BaseData.getNamesModuleValue("Juris"));
			Playback.pageLoadThreadWait();
		}

		public void verifyDoYouWantToCopyNameFromOtherJurisPopup() {
			popup.confirm.yesWithExpectedMessage(
					"(6030) The selected name belongs to another Juris. Do you wish to copy the name?");
		}

		public void selectNameByLastName1AndFirstName1() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIResultTable,
					BaseData.getNamesModuleValue("LastName1") + ", " + BaseData.getNamesModuleValue("FirstName1"));
			Playback.controlReadyThreadWait();
			uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
			Playback.threadWait();
			Playback.waitForPageLoad();
		}

		public void verifyNameByLastNameAndFirstName() {
			String name = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable, "ID", 0);
			// If we give ID then Name will appear for verify method,Product Issue.
			verify.ExpectedPropertyValueIsEqual(name,
					BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"));
		}

		public void verifyPopupNamesBelongsToAnotherJuris() {
			popup.confirm.yesWithExpectedMessage(
					"(6030) The selected name belongs to another Juris. Do you wish to copy the name?");
		}

		public void SelectNameByLastName1() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIResultTable,
					BaseData.getNamesModuleValue("LastName1").toString());
			uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
			Playback.threadWait();
			Playback.waitForPageLoad();
		}

		public void SelectTrafficNameByDefendant2LastFirstName() {
			names.switchToNameSearchHelpWindow();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("Defendant2LastName")
							+ ", " + BaseData.getNamesModuleValue("Defendant2FirstName"));
			uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
			Playback.threadWait();
			Playback.waitForPageLoad();

		}

		public void selectAtNameInGrid() {
			
			String url = PropertiesFile.readPropertiesFile("url");
			if (url.contains("14.87") || url.contains("14.82")) {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("Name"));
				Playback.controlReadyThreadWait();
				uIMapNames.nameSearchHelpWindow.uISelectNameButton.click();
			}
			else {
				names.switchToNameSearchHelpWindow();
				objectIdentification.manualIdentify.selectGridRowByCellInnerText(
						uIMapNames.nameSearchHelpWindow.uIResultTable, BaseData.getNamesModuleValue("Name"));
				Playback.controlReadyThreadWait();
			}
			

		}

		public void verifyTheGridIsEmpty() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount((uIMapNames.nameSearchHelpWindow.uIIncidentNameResultTable)) == 0);

		}

	}

	public class NameSearchPopupScreen {

		public void ClickSelectName() {

			uIMapNames.nameSearchPopupScreen.uISelectNameButton.click();
		}

		public void SelectNameByDefendant2LastFirstName() {
			names.switchToNameSearchPopupScreen();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameSearchPopupScreen.uINameTable, BaseData.getNamesModuleValue("Name"));
			uIMapNames.nameSearchPopupScreen.uISelectNameButton.click();
			Playback.threadWait();
			Playback.waitForPageLoad();

		}

		public void VerifyAtName1RowColorAsAlias() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapNames.nameSearchPopupScreen.uINameTable,
									BaseData.getNamesModuleValue("Name1"))
							.getAttribute("class").contains("aliascolor"));
		}

		public void VerifyAtNameIDRowColorAsJunvenile() {
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridRowByCellInnerText(uIMapNames.nameSearchPopupScreen.uINameTable,
									BaseData.getNamesModuleValue("NameID"))
							.getAttribute("class").contains("junvenileColor"));
		}

		public void CloseScreen() {
			uIMapNames.nameSearchPopupScreen.driver.close();
		}

		public void Verifycopynameconfirmpopup() {
			popup.confirm.yesWithExpectedMessage(
					"(6030) The selected name belongs to another Juris. Do you wish to copy the name?");
		}

	}

	public class NameEntry {

		public NameEntryMainTab nameEntryMainTab = null;
		public NameEntryFlagTab nameEntryFlagTab = null;
		public EmpSchoolTab empSchoolTab = null;
		public FamilyTab familyTab = null;
		public PhysicalTab physicalTab = null;
		public ActivityTab activityTab = null;
		public GangTab gangTab = null;
		public InfoTab infoTab = null;
		public AssociateTab associateTab = null;
		public VisitorsTab visitorsTab = null;
		public AttachmentsTab attachmentsTab = null;
		public NameEntryMapTab nameEntryMapTab = null;
		public PhoneTab phoneTab = null;
		public AliasTab aliasTab = null;
		public NameEntryAddressesTab nameEntryAddressesTab = null;
		public BusinessTab businessTab = null;
		public NamesComments namesComments;
		public NameEntryCommentsTab nameEntryCommentsTab = null;
		public NameEntryContactsTab nameEntryContactsTab = null;
		public SocialMediaTab socialMediaTab = null;
		public DNATab dNATab = null;
		public NameEntryHistoryTab nameEntryHistoryTab = null;
		public NameEntryVehicleTab nameEntryVehicleTab = null;
		public NameEntryMJTab nameEntryMJTab = null;

		public NameEntry() {

			if ((this.nameEntryMainTab == null))
				this.nameEntryMainTab = new NameEntryMainTab();

			if ((this.nameEntryFlagTab == null)) {
				this.nameEntryFlagTab = new NameEntryFlagTab();
			}

			if ((this.empSchoolTab == null)) {
				this.empSchoolTab = new EmpSchoolTab();
			}

			if ((this.familyTab == null)) {
				this.familyTab = new FamilyTab();
			}

			if ((this.gangTab == null)) {
				this.gangTab = new GangTab();
			}

			if ((this.physicalTab == null)) {
				this.physicalTab = new PhysicalTab();
			}

			if ((this.activityTab == null)) {
				this.activityTab = new ActivityTab();
			}

			if ((this.infoTab == null)) {
				this.infoTab = new InfoTab();
			}

			if ((this.associateTab == null)) {
				this.associateTab = new AssociateTab();
			}

			if ((this.visitorsTab == null)) {
				this.visitorsTab = new VisitorsTab();
			}

			if ((this.phoneTab == null)) {
				this.phoneTab = new PhoneTab();
			}

			if ((this.aliasTab == null)) {
				this.aliasTab = new AliasTab();
			}

			if ((this.businessTab == null)) {
				this.businessTab = new BusinessTab();
			}

			if ((this.attachmentsTab == null)) {
				this.attachmentsTab = objectIdentification.new AttachmentsTab();
			}

			if ((this.nameEntryAddressesTab == null)) {
				this.nameEntryAddressesTab = new NameEntryAddressesTab();
			}

			if ((this.nameEntryMapTab == null)) {
				this.nameEntryMapTab = new NameEntryMapTab();
			}

			if ((this.nameEntryCommentsTab == null)) {
				this.nameEntryCommentsTab = new NameEntryCommentsTab();
			}

			if ((this.namesComments == null)) {
				this.namesComments = new NamesComments();
			}

			if ((this.nameEntryContactsTab == null)) {
				this.nameEntryContactsTab = new NameEntryContactsTab();
			}

			if ((this.socialMediaTab == null)) {
				this.socialMediaTab = new SocialMediaTab();
			}

			if ((this.dNATab == null)) {
				this.dNATab = new DNATab();
			}

			if ((this.nameEntryHistoryTab == null)) {
				this.nameEntryHistoryTab = new NameEntryHistoryTab();
			}

			if ((this.nameEntryVehicleTab == null)) {
				this.nameEntryVehicleTab = new NameEntryVehicleTab();
			}

			if ((this.nameEntryMJTab == null)) {
				this.nameEntryMJTab = new NameEntryMJTab();
			}
		}

		public void closeTheScreen() {

			uIMapNames.nameEntry.driver.close();
		}

		public void switchToActivityTab() {
			Playback.waitForControlReady();
			uIMapNames.nameEntry.uIActivityTab.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("Names/frmActivity");
			Playback.waitForControlReady();
		}

		public void switchToMainTab() {
			uIMapNames.nameEntry.uIMainTab.click();
		}

		public void switchToNameEntryFlagTab() {
			uIMapNames.nameEntry.uINameFlagTab.click();

		}

		public void switchToPhysicalTab() {
			uIMapNames.nameEntry.uIPhysicalTab.click();

		}

		public void switchToEmpSchoolTab() {
			uIMapNames.nameEntry.uIEmpSchoolTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("Names/frmNameContact.aspx?");
		}

		public void switchToFamilyTab() {
			uIMapNames.nameEntry.uIFamilyTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("Names/frmNameContact.aspx?");
		}

		public void switchToGangTab() {
			uIMapNames.nameEntry.uIGangTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameGang");
		}

		public void switchToInfoTab() {
			uIMapNames.nameEntry.uIInfoTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmInformation");
		}

		public void switchToAliasTab() {
			uIMapNames.nameEntry.uIAliasTab.click();
		}

		public void switchToNameEntryMapTab() {
			uIMapNames.nameEntry.uIMapTab.click();
			Playback.threadWait(5000);
			objectIdentification.windowHandle.switchToFrame("GHydrantMapHERE");

		}

		public void switchToNameEntryMapTabESRI() {
			uIMapNames.nameEntry.uIMapTab.click();
			Playback.threadWait(5000);
			objectIdentification.windowHandle.switchToFrame("GHydrantMapESRI");

		}

		public void switchToBusinessTab() {
			uIMapNames.nameEntry.uIBusinessTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmEmployerSchool.aspx?");

		}

		public void switchToPhonesTab() {
			uIMapNames.nameEntry.uIPhonesTab.click();
			Playback.pageLoadThreadWait();

		}

		public void switchToAssociatesTab() {
			uIMapNames.nameEntry.uIAssociatesTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameAssociates");

		}

		public void switchToAddressesTab() {
			uIMapNames.nameEntry.uIAddressTab.click();
			Playback.pageLoadThreadWait();

		}

		public void switchToCommentsTab() {
			uIMapNames.nameEntry.uICommentsTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments.aspx?");

		}

		public void switchToAttachmentsTab() {

			uIMapNames.nameEntry.uIAttachmentsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");

		}

		public void switchToContactsTab() {
			uIMapNames.nameEntry.uIContactsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmContactNew");
		}

		public void switchToVisitorsTab() {
			uIMapNames.nameEntry.uIVisitorsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmVisitors");
		}

		public void switchToSocialMediaTab() {
			uIMapNames.nameEntry.uISocialMediaTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameSocialMedia");
		}

		public void switchToHistoryTab() {
			Playback.pageLoadThreadWait();
			// objectIdentification.manualIdentify.HighlighElement(uIMapNames.nameEntry.uIHistoryTab);
			uIMapNames.nameEntry.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmKPIHistory");
		}

		public void switchToAllTab() {
			uIMapNames.nameEntry.uIMainTab.click();
			uIMapNames.nameEntry.uINameFlagTab.click();
			uIMapNames.nameEntry.uIPhysicalTab.click();
			uIMapNames.nameEntry.uIAliasTab.click();
			uIMapNames.nameEntry.uIAddressTab.click();
			uIMapNames.nameEntry.uIPhonesTab.click();
			uIMapNames.nameEntry.uIEmpSchoolTab.click();
			uIMapNames.nameEntry.uIFamilyTab.click();
			uIMapNames.nameEntry.uIInfoTab.click();
			uIMapNames.nameEntry.uIGangTab.click();
			uIMapNames.nameEntry.uIActivityTab.click();
			uIMapNames.nameEntry.uICommentsTab.click();
			uIMapNames.nameEntry.uIAttachmentsTab.click();
			uIMapNames.nameEntry.uIAssociatesTab.click();
			uIMapNames.nameEntry.uIMapTab.click();
		}

		public void switchToDNATab() {
			uIMapNames.nameEntry.uIDNATab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameDNA");
		}

		public void Save() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void ClickSaveButton() {
			uIMapNames.nameEntry.uISaveButton.click();
		}

		public void SaveWithConfirmMessage() {
			uIMapNames.nameEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void SaveNCloseScreen() {
			uIMapNames.nameEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void ClearLastName() {
			uIMapNames.nameEntry.uILastNameEdit.clear();
		}

		public void ClearFirstName() {
			uIMapNames.nameEntry.uIFirstNameEdit.clear();
		}

		public void EnterAtLastName() {
			uIMapNames.nameEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.nameEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.nameEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtWarrantLastName() {
			uIMapNames.nameEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantLastName"));
		}

		public void EnterAtWarrantFirstName() {
			uIMapNames.nameEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantFirstName"));
		}

		public void SelectAddress() // add command step in scripts
		{
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys("s");
			uIMapNames.nameEntry.uIChkVerifyCheckBox.sendKeys(Keys.TAB);
			// geo.commonNameHelp.SelectCommonNameExceptNonValidAddress();

		}

		public void EnterLastName() {

			uIMapNames.nameEntry.uILastNameEdit.sendKeys(Randomized.manualPlusRandomString("Jacob", 3));
			uIMapNames.nameEntry.uILastNameEdit.sendKeys(Keys.TAB);

		}

		public void VerifyAtLastName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("LastName"),
					uIMapNames.nameEntry.uILastNameEdit.getAttribute("value"));

		}

		public void VerifyLastName(String lastName) {
			verify.ExpectedPropertyValueIsEqual(lastName, uIMapNames.nameEntry.uILastNameEdit.getAttribute("value"));

		}

		public void EnterFirstName() {

			uIMapNames.nameEntry.uIFirstNameEdit.sendKeys(Randomized.manualPlusRandomString("Vinton", 3));

		}

		public void VerifyAddressInfoButtonRedColorCode() {
			String Color = uIMapNames.nameEntry.uIAddressInfoIconButton.getCssValue("src");
			verify.ExpectedValueIsTrue(Color.contains("Red"));
		}

		public void VerifyAddressInfoButtonYellowColorCode() {
			String Color = uIMapNames.nameEntry.uIAddressInfoIconButton.getAttribute("src");
			verify.ExpectedValueIsTrue(Color.contains("Yellow"));
		}

		public void VerifyAddressInfoButtonBlueColorCode() {
			String Color = uIMapNames.nameEntry.uIAddressInfoIconButton.getAttribute("src");
			verify.ExpectedValueIsTrue(Color.contains("debug.gif"));
		}

		public void VerifyWarrantIconButton() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.uIWarrantIconButton.getAttribute("src").contains("warrant"));
		}

		public void ClickAddressVerifyCheckBox() {
			uIMapNames.nameEntry.uIChkVerifyCheckBox.click();
			uIMapNames.nameEntry.uIChkVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void ClickAddressInfoButton() {
			uIMapNames.nameEntry.uIAddressInfoIconButton.click();
		}

		public void ClickNameMineIcon() {
			uIMapNames.nameEntry.uINameMineButton.click();
		}

		public void ClickMapIcon() {
			uIMapNames.nameEntry.uIMapIconButton.click();
		}

		public void ClickPrintIcon() {
			uIMapNames.nameEntry.uIPrintButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickCustomIcon() {
			uIMapNames.nameEntry.uICustomIconButton.click();
		}

		public void ClickALCIcon() {
			uIMapNames.nameEntry.uIALCButton.click();
		}

		public void ClickManageCustomFieldsMenu() {
			uIMapNames.nameEntry.uIManageCustomFieldsMenuLink.click();
		}

		public void ClickManageQAformMenu() {
			uIMapNames.nameEntry.uIManageQAFormMenuLink.click();
		}

		public void VerifyDeceasedEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIDeceasedDateEdit.isEnabled());
		}

		public void VerifyDefunctEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIDefunctDateEdit.isEnabled());
		}

		public void EnterDeceasedAsCurrentDate() {
			uIMapNames.nameEntry.uIDeceasedDateEdit.clear();
			uIMapNames.nameEntry.uIDeceasedDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void EnterDeceasedAsFeatureDate() {
			uIMapNames.nameEntry.uIDeceasedDateEdit.sendKeys(Randomized.getFutureDate(1));
			uIMapNames.nameEntry.uIDeceasedDateEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAcknowledgeDeceasedDate() {
			popup.acknowledge.okWithExpectedMessage("(6011) The Deceased Date cannot be a future date");
		}

		public void VerifyCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapNames.nameEntry.uIDeceasedDateEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapNames.nameEntry.uIDeceasedDateEdit.getAttribute("value"));
		}

		public void VerifyAtNameTypeAndID() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(0, 1),
					uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value"));

			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(2),
					uIMapNames.nameEntry.uINameIDEdit.getAttribute("value"));

		}

		public void EnterNameIDAsB() {
			uIMapNames.nameEntry.uINameTypeEdit.clear();
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys("B");
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys(Keys.TAB);
		}

		public void EnterNameIDAsA() {
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys("A");
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys(Keys.TAB);
		}

		public void selectSetNameAsA() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameEntry.uISetThisNameAsComboBox, "A");
		}

		public void GetNameID(String nameID) {
			Playback.testContext.setAttribute("nameID", uIMapNames.nameEntry.uINameIDEdit.getAttribute("value"));
		}

		public void GetAddress(String address) {
			Playback.testContext.setAttribute("address", uIMapNames.nameEntry.uIMainAddressEdit.getAttribute("value"));
		}

		public void EnterAtAddress() {
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address"));
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(Keys.TAB);
			uIMapNames.nameEntry.uIChkVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void VerifyInactiveAddressAcknowledge() {

			popup.acknowledge.okWithExpectedMessage("(5097) This address is inactive");

		}

		public void VerifyAcknowledgePremiseInactiveAddress() {
			popup.acknowledge.okWithExpectedMessage("(5095) Premise is inactive");
		}

		public void Verify6031ConfirmMessage() {

			Playback.pageLoadThreadWait();
			popup.confirm.yesWithExpectedMessage("(6031) Do you want to add business details?");

		}

		public void Verify6031ConfirmMessageByClickNo() {
			Playback.pageLoadThreadWait();
			popup.confirm.noWithExpectedMessage("(6031) Do you want to add business details?");
			Playback.pageLoadThreadWait();
		}

		public void VerifySocialMediaTabDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uISocialMediaTab.isDisplayed());
		}

		public void VerifyHistoryTabDisplayed() {
			Playback.pageLoadThreadWait();
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIHistoryTab.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIHistoryTab.isEnabled());
		}

		public void VerifyHistoryTabNotDisplayed() {
			verify.ExpectedValueIsFalse(uIMapNames.nameEntry.uIHistoryTab.isDisplayed());
		}

		public void ClickPhotoLineIcon() {
			uIMapNames.nameEntry.uIPhotoLineButton.click();
		}

		public void VerifyStateAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - State No");
			} else
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - State#");
		}

		public void VerifySaveConfirmMessage() {

			popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");

		}

		public void VerifyAdditionSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));
		}

		public void ClickNameImage() {
			uIMapNames.nameEntry.uINameImageFrontView.click();
		}

		public void SelectPhoneTypeAsHome() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameEntry.uIPhoneType1ComboBox,
					"H - Home");
		}

		public void EnterAtPhoneNo() {
			uIMapNames.nameEntry.uIPhoneNumber1Edit.click();
			uIMapNames.nameEntry.uIPhoneNumber1Edit.sendKeys(BaseData.getNamesModuleValue("PhoneNumber"));
		}

		public void VerifyAtPhoneNumber() {
			String Phone = uIMapNames.nameEntry.uIPhoneNumber1Edit.getAttribute("value").replace("(", "");
			String Phone1 = Phone.replace(")", "");
			String Phone2 = Phone1.replace(" ", "");
			String PhoneNo = Phone2.replace("-", "");
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("PhoneNumber"), PhoneNo);
			;
		}

		public void SelectPhoneType1AsWork() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameEntry.uIPhoneType2ComboBox,
					"W - Work");
		}

		public void EnterAtPhoneNo1() {
			uIMapNames.nameEntry.uIPhoneNumber2Edit.click();
			uIMapNames.nameEntry.uIPhoneNumber2Edit.sendKeys(BaseData.getNamesModuleValue("PhoneNumber1"));
		}

		public void VerifyFlagTabFontColorAsRed() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uINameFlagTab.getAttribute("class").contains("redcolor"));
		}

		public void VerifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Address"),
					uIMapNames.nameEntry.uIMainAddressEdit.getAttribute("value"));
		}

		public void VerifyAtAddress2() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Address2"),
					uIMapNames.nameEntry.uIMainAddressEdit.getAttribute("value"));
		}

		public void VerifyAtAddress1() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIMainAddressEdit.getAttribute("value")
					.contains(BaseData.getNamesModuleValue("Address1")));
		}

		public void SelectAtNameAS() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameEntry.uISetThisNameAsComboBox,
					BaseData.getNamesModuleValue("NameAs"));
		}

		public void VerifyPrimaryNameIDAtNameAs() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameAs"),
					uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value"));
		}

		public void GetNameTypeAndID(String nameType, String nameID) // out
		{
			nameType = uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value");
			Playback.setTestContextAttribute("nameType", nameType);
			nameID = uIMapNames.nameEntry.uINameIDEdit.getAttribute("value");
			Playback.setTestContextAttribute("nameID", nameID);
		}

		public void switchToVehicleTab() {
			objectIdentification.manualIdentify.scrollHorizontally();
			uIMapNames.nameEntry.uIVehicleTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmVehicleActivity");
			Playback.pageLoadThreadWait();
		}

		public void ClickResetIcon() {
			uIMapNames.nameEntry.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtLastName1() {
			uIMapNames.nameEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName1"));
		}

		public void EnterAtFirstName1() {
			uIMapNames.nameEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName1"));
			uIMapNames.nameEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void TabMiddleName() {
			uIMapNames.nameEntry.uIMiddleNameEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtPhone() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Phone"),
					uIMapNames.nameEntry.uIPhoneNumber1Edit.getAttribute("value"));
		}

		public void VerifyAgeGreaterAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(6136) From Age cannot not be greater than To Age");
		}

		public void VerifyUpdateSuccessfulStatusMessage() {
			
			verify.ExpectedPropertyValueIsEqual(
					uIMapNames.nameEntry.uIBottomLeftSideStatusBar.getText(), "1003 - Update Successful");
		}

		public void VerifyAddressContentColorAsRed() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIMainAddressEdit.getAttribute("Style").contains("red"));
		}

		public void EnterAtAddress1() {
			uIMapNames.nameEntry.uIMainAddressEdit.clear();
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address1"));
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAddressIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIAddressInfoIconButton.isDisplayed());
		}

		public void VerifyAddressModifyConfirmMessage() {

			popup.confirm.yesWithExpectedMessage(
					"(6038) The address is modified. Do you want to retain the previous address? 302 Fellowship Rd?");
			Playback.controlReadyThreadWait();
		}

		public void ClickVisitorIcon() {
			uIMapNames.nameEntry.uIVisitorButton.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterNameIDAsO() {
			uIMapNames.nameEntry.uINameTypeEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys("O");
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys(Keys.TAB);
		}

		public void clearAddess() {
			uIMapNames.nameEntry.uIMainAddressEdit.clear();
			Playback.controlReadyThreadWait();
		}

		public void ClickAddressPopupCancelbutton() {
			uIMapNames.nameEntry.uIAddressPopupCancelButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtPhoneNumber1() {
			String Phone = uIMapNames.nameEntry.uIPhoneNumber2Edit.getAttribute("value").replace("(", "");
			String Phone1 = Phone.replace(")", "");
			String Phone2 = Phone1.replace(" ", "");
			String PhoneNo1 = Phone2.replace("-", "");
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("PhoneNumber1"), PhoneNo1);

		}

		public void ClickExpungementIcon() {
			uIMapNames.nameEntry.uIExpungementButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtNameType() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameType"),
					uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value"));

		}

		public void ClickNameMergeIcon() {
			uIMapNames.nameEntry.uINameMergeButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickCreateAdultNameButton() {
			uIMapNames.nameEntry.uICreateAdultNameButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickViewAdultNameButton() {
			uIMapNames.nameEntry.uIViewAdultNameButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickViewJuvenileNameButton() {
			uIMapNames.nameEntry.uIViewJuvenileNameButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickDeleteNameLinkButton() {
			uIMapNames.nameEntry.uIDeleteNameLinkButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyViewJuvenileNameButtonViewed() {
			verify.ExpectedPropertyValueIsEqual("View Juvenile Record",
					uIMapNames.nameEntry.uIViewJuvenileNameButton.getAttribute("value"));
		}

		public void verifyViewAdultNameButtonViewed() {
			verify.ExpectedPropertyValueIsEqual("View Adult Record",
					uIMapNames.nameEntry.uIViewAdultNameButton.getAttribute("value"));
		}

		public void verifyDeleteNameLinkIconViewed() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIDeleteNameLinkButton.isDisplayed());
		}

		public void verifyRemoveNameLinkConfirmationMessage() {

			popup.confirm.yesWithExpectedMessage("(6155) Do you want to remove the link?");
			Playback.controlReadyThreadWait();
		}

		public void verifyAdultRecordExistsLinkConfirmationMessage() {

			popup.confirm.yesWithContainsMessage("Would you like to link to the Adult record?");
		}

		public void enterAtMiddleName() {
			uIMapNames.nameEntry.uIMiddleNameEdit.sendKeys(BaseData.getNamesModuleValue("MiddleName"));
			uIMapNames.nameEntry.uIMiddleNameEdit.sendKeys(Keys.TAB);
		}

		public String getNameID() {
			String IDtype = uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value");
			String IDNumber = uIMapNames.nameEntry.uINameIDEdit.getAttribute("value");
			String nameID = IDtype + "-" + IDNumber;
			return nameID;
		}

		public void clickEmailNotifyIcon() {

			uIMapNames.nameEntry.uIEmailNotifyButton.click();
		}

		public void selectAtSuffix() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameEntry.uISuffixDropDown,
					BaseData.getNamesModuleValue("Suffix"));

		}

		public void verifyNameTypeAutoBindedAsA() {
			Playback.controlReadyThreadWait();
			String Nametype = uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual("A", Nametype);
		}

		public void verifyNameTypeAutoBindedAsJ() {
			String Nametype = uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual("J", Nametype);
		}

		public void VerifyNameCreatedDateAndOfficer() {
			String CurrentDate = Randomized.getCurrentDate();
			String dateFormat = CurrentDate.substring(0, 6) + CurrentDate.substring(8, 10);
			Playback.controlReadyThreadWait();
			String createdTxt = uIMapNames.nameEntry.uINameCreatedDetails.getText();
			verify.ExpectedValueIsTrue(createdTxt.contains(BaseData.getNamesModuleValue("Officer")));
			verify.ExpectedValueIsTrue(createdTxt.contains(dateFormat));
			verify.ExpectedValueIsTrue(createdTxt.contains(BaseData.getNamesModuleValue("PF")));
		}

		public void verifyFirstNameAndMiddleNameDisabled() {
			verify.ExpectedValueIsFalse(uIMapNames.nameEntry.uIFirstNameEdit.isEnabled());
			verify.ExpectedValueIsFalse(uIMapNames.nameEntry.uIMiddleNameEdit.isEnabled());
		}

		public void enterAtLastName2() {
			uIMapNames.nameEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName2"));

		}

		public void verifyDeleteNameIconIsEnbled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIDeleteNameIcon.isEnabled());
		}

		public void enterAtFirstName2() {
			uIMapNames.nameEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName2"));
			uIMapNames.nameEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void verifyDeleteNameIconIsDisabled() {
			verify.ExpectedPropertyValueIsEqual(uIMapNames.nameEntry.uIDeleteNameIcon.getAttribute("disabled"), "true");
		}

		public void verifyNameEntryAttachmentTabBlueColor() {

			// Blue color code
			String Blue = "0, 0, 255";

			String color1 = uIMapNames.nameEntry.uIAttachmentsTab.getCssValue("color");

			verify.ExpectedValueIsTrue(color1.contains(Blue));
		}

public void verifyNameEntryAssociatesTabBlueColor() {

			// Blue color code
			String Blue = "0, 0, 255";

			String color1 = uIMapNames.nameEntry.uIAssociatesTab.getCssValue("color");

			verify.ExpectedValueIsTrue(color1.contains(Blue));
		}
		
		public void verifyNameEntryFamilyTabBlueColor() {

			// Blue color code
			String Blue = "0, 0, 255";

			String color1 = uIMapNames.nameEntry.uIFamilyTab.getCssValue("color");

			verify.ExpectedValueIsTrue(color1.contains(Blue));
		}
		public void enterAtAddressStreetNameWithPremiseNo() {
			String premise = BaseData.getGeoModuleValue("PremiseNo");
			String streetName = BaseData.getGeoModuleValue("StreetName");
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(premise + " " + streetName);
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(Keys.TAB);
		}

		public void verifyProfileImageDisplayed() {

			String src = uIMapNames.nameEntry.uINameImageFrontView.getAttribute("src");

			verify.ExpectedValueIsTrue(src.contains("ImgID=100"));
		}

		public void verifyImageNotAvailable() {

			String src = uIMapNames.nameEntry.uINameImageFrontView.getAttribute("src");

			verify.ExpectedValueIsTrue(src.contains("ImgID=-92"));
		}

		public void enterNameIDAsJ() {
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys("J");
			uIMapNames.nameEntry.uINameTypeEdit.sendKeys(Keys.TAB);
		}

		public void enterAtAddress2() {
			uIMapNames.nameEntry.uIMainAddressEdit.clear();
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address2"));
			uIMapNames.nameEntry.uIMainAddressEdit.sendKeys(Keys.TAB);
		}

		public void verifyActivePhoneNumber1(String phone1) {
			String attribute = uIMapNames.nameEntry.uIPhoneNumber1Edit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(phone1));
		}

		public void verifyActivePhoneNumber2(String phone2) {
			String attribute = uIMapNames.nameEntry.uIPhoneNumber2Edit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(phone2));
		}

		public void clickWarrantIcon() {
			uIMapNames.nameEntry.uIWarrantIconButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clearAddress() {
			uIMapNames.nameEntry.uIMainAddressEdit.clear();
			Playback.controlReadyThreadWait();
		}

		public void clickOkButtonInAddressModifiedPopup() {
			uIMapNames.nameEntry.uIAddressPopupOkButton.click();
			Playback.gridLoadThreadWait();
		}

		public String readNameID() {

			String attribute = uIMapNames.nameEntry.uINameTypeEdit.getAttribute("value");
			String attribute2 = uIMapNames.nameEntry.uINameIDEdit.getAttribute("value");
			String nameID = attribute + "" + attribute2;
			return nameID;

		}

		public void verifyInvalidAgeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6021) Invalid Age");
		}

		public void selectAtJuris() {
			Playback.waitForControlReady();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameEntry.uIJurisCombobox,
					BaseData.getNamesModuleValue("Juris"));
			Playback.waitForControlReady();
			Playback.waitForControlReady();
		}

		public void switchToMJTab() {
			uIMapNames.nameEntry.uIMJTab.click();
			Playback.pageLoadThreadWait();
			// Names/frmNameMJAssocLink.aspx?
			objectIdentification.windowHandle.switchToFrame("Names/frmNameMJAssocLink.aspx?");
		}

		public void tabOutNameID() {
			uIMapNames.nameEntry.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public String getWindowHandle() {
			Playback.controlReadyThreadWait();
			String nameentryOld = Playback.driver.getWindowHandle();

			return nameentryOld;

		}

		public void verifyChangeAddressPopupWindow() {

			String text = Playback.driver.findElement(By.id("KpilblMsg")).getText();
			verify.ExpectedValueIsTrue(
					text.contains("The address is modified. Do you want to retain the previous address?"));
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify
					.selectDropDownOption(Playback.driver.findElement(By.id("cddAddressType_DropDown")), "Old");
			Playback.controlReadyThreadWait();
			Playback.driver.findElement(By.id("cmdOk")).click();

		}

		public void clickOkOnAdultLinkPopup() {

			Robot robo = null;
			try {
				robo = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			robo.delay(3000);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);

			// TODO Auto-generated method stub

		}

		public void verifyNameEntryAliasTabBlackColor() {
			// Blue color code
			String Black = "rgba(0, 0, 0, 1)";
			String color1 = uIMapNames.nameEntry.uIAliasTab.getCssValue("color");
			System.out.println(color1);
			verify.ExpectedValueIsTrue(color1.contains(Black));
		}

	public void verifyNameEntryFamilyTabBlackColor() {
			// Blue color code
			String Black = "0, 0, 0";
			String color1 = uIMapNames.nameEntry.uIFamilyTab.getCssValue("color");
			System.out.println(color1);
			verify.ExpectedValueIsTrue(color1.contains(Black));
		}
		
		public void verifyNameEntryAssociatesTabBlackColor() {
			// Blue color code
			String Black = "0, 0, 0";
			String color1 = uIMapNames.nameEntry.uIAssociatesTab.getCssValue("color");
			System.out.println(color1);
			verify.ExpectedValueIsTrue(color1.contains(Black));
		}
		public void verify6055DuplcationOFBTypeName() {
			popup.acknowledge.okWithExpectedMessage("(6055)Duplication of B type name not allowed");

		}

		public void verify6134A_B_TypeNameRecordAlreadyExistsForThisName() {
			popup.confirm.yesWithExpectedMessage(
					"(6134)A  B  - type Name record already exists for this name. Do you still wish to create a duplicate record?");
			popup.confirm.yesWithExpectedMessage("(3)Do You Want To Save All Of The Entered Details?");
		}

		public void verifyAddressesTabColourAsBlue() {
			String Blue = "rgba(0, 0, 255, 1)";

			verify.ExpectedPropertyValueIsEqual(uIMapNames.nameEntry.uIAddressTab.getCssValue("color"), Blue);
		}
		public void verifyAddressesTabColourAsBlack() {
			String Black = "rgba(0, 0, 0, 1)";
			verify.ExpectedPropertyValueIsEqual(uIMapNames.nameEntry.uIAddressTab.getCssValue("color"), Black);
		}
		
		public void verifyNameEntryPhysicalTabBlueColor() {

			// Blue color code
			String Blue = "0, 0, 255";

			String color1 = uIMapNames.nameEntry.uIPhysicalTab.getCssValue("color");

			verify.ExpectedValueIsTrue(color1.contains(Blue));
		}

		public void VerifyTabAdditionSuccessfulStatus() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.uIBottomLeftSideStatus.getText().contains("1002 - Addition Successful"));
		}
		public void verifySocialMediaTabChangeAsBlue() {
			
			String cssValue = uIMapNames.nameEntry.uISocialMediaTab.getCssValue("color");
			verify.ExpectedPropertyValueIsEqual(cssValue, "rgba(0, 0, 255, 1)");	
			}

	}

	public class ActivityTab {
		public void SelectAtActivity() {
			Select el = new Select(uIMapNames.nameEntry.activityTab.uIActivityComboBox);
			el.selectByVisibleText(BaseData.getNamesModuleValue("Activity").toString());
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void SelectAtActivity1() {
			Select el = new Select(uIMapNames.nameEntry.activityTab.uIActivityComboBox);
			el.selectByVisibleText(BaseData.getNamesModuleValue("Activity1").toString());
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void VerifyActivityType() {
			Playback.wait(5000);
			Playback.pageLoadThreadWait();
			WebElement UICell = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable,
					BaseData.getNamesModuleValue("Activity").toString());
			Playback.waitForControlReady();
			Assert.assertEquals(UICell.getText(), BaseData.getNamesModuleValue("Activity").toString());
		}

		public void VerifyLocation() {
			WebElement UICell = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable,
					BaseData.getNamesModuleValue("Location").toString());
			Assert.assertEquals(UICell.getText(), BaseData.getNamesModuleValue("Location").toString());
		}

		public void ClickActivityCheckBox() {
			uIMapNames.nameEntry.activityTab.uIActivityRadioCheckBox.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickCollapseAllCheckBox() {
			uIMapNames.nameEntry.activityTab.uICollapseAllCheckbox.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickCollapseIconInGrid() {
			uIMapNames.nameEntry.activityTab.uICollapseRowGridButton.click();
			Playback.gridLoadThreadWait();
		}

		public void VerifyExpandMode() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.activityTab.uIExpandRowGridButton.isDisplayed());
		}

		public void VerifyCollapseMode() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.activityTab.uICollapseRowGridButton.isDisplayed());
		}

		public void VerifyAtActivityNumber() {
			Playback.gridLoadThreadWait();
			WebElement activityNo = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable,
					BaseData.getNamesModuleValue("ActivityNo").toString());
			verify.ExpectedPropertyValueIsEqual(activityNo.getText(),
					BaseData.getNamesModuleValue("ActivityNo").toString());
		}

		public void VerifyAtActivityType() {
			Playback.waitForControlReady();
			WebElement activityType = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable,
					BaseData.getNamesModuleValue("ActivityType").toString());
			verify.ExpectedPropertyValueIsEqual(activityType.getText(),
					BaseData.getNamesModuleValue("ActivityType").toString());
		}

		public void ClickCrashActivityRow(int rowIndex) {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridTableRow(uIMapNames.nameEntry.activityTab.uIActivityTable,
					rowIndex);
		}

		public void VerifyPropertyRowRemoved() {
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.nameEntry.activityTab.uIActivityTable) == 1);
		}

		public void ClickAtActivityNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameEntry.activityTab.uIActivityTable, BaseData.getNamesModuleValue("ActivityNo"));
		}

		public void VerifyActivityNumber(String activityYear, String activityNo) {
			Playback.gridLoadThreadWait();
			WebElement activityNumber = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable, (activityYear + "-" + activityNo).toString());
			verify.ExpectedPropertyValueIsEqual(activityNumber.getText(), (activityYear + "-" + activityNo).toString());
		}

		public void ClickAtActivityType() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameEntry.activityTab.uIActivityTable, BaseData.getNamesModuleValue("ActivityType"));
		}

		public void ClickExpungementActivityButton() {
			uIMapNames.nameEntry.activityTab.uIExpungementActivityButton.click();
			Playback.gridLoadThreadWait();
		}

		public void verifyAtOfficer() {
			Playback.waitForControlReady();
			WebElement officer = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable,
					BaseData.getNamesModuleValue("Officer").toString());
			verify.ExpectedPropertyValueIsEqual(officer.getText(), BaseData.getNamesModuleValue("Officer").toString());
		}

		public void verifyEvidenceButtonIsDisplayed() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.activityTab.uIEvidenceButton.isDisplayed());
		}

		public void verifyAtLocation() {
			Playback.pageLoadThreadWait();
			WebElement UICell = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable,
					BaseData.getNamesModuleValue("Location").toString());
			Playback.waitForControlReady();
			Assert.assertEquals(UICell.getText(), BaseData.getNamesModuleValue("Location").toString());

		}

		public void clickEvidenceButton() {
			uIMapNames.nameEntry.activityTab.uIEvidenceButton.click();
		}

		public void verifyActivityAndDateInGrid(ArrayList<String> cellValues) {
			Playback.gridLoadThreadWait();
			int count = 0;
			for (int i = 0; i < cellValues.size(); i++) {
				if (cellValues.get(i).contains("/")) {
					String txtEle = objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameEntry.activityTab.uIActivityResultTable,
									BaseData.getNamesModuleValue("Date").substring(0, 8))
							.getText();
					verify.ExpectedValueIsTrue(txtEle.contains(cellValues.get(i).substring(0, 8)));
					System.out.println(txtEle);

				} else if (cellValues.get(i).matches(".*[a-z].*")) {
					if (i == 1) {
						String Activity = objectIdentification.manualIdentify
								.getGridCell(uIMapNames.nameEntry.activityTab.uIActivityResultTable,
										BaseData.getNamesModuleValue("Activity"))
								.getText();
						verify.ExpectedValueIsTrue(Activity.contains(cellValues.get(i)));
						System.out.println(Activity);
					} else if (i == 3 || i == 5) {
						String Activity = objectIdentification.manualIdentify
								.getGridCell(uIMapNames.nameEntry.activityTab.uIActivityResultTable,
										BaseData.getNamesModuleValue("Activity" + (i - 2 - count) + ""))
								.getText();
						System.out.println(Activity);
						verify.ExpectedValueIsTrue(Activity.contains(cellValues.get(i)));
						count++;
					}
					System.out.println("Verified");
				}
			}
		}

		public void verifyAtOfficerInGrid() {

			WebElement Officer = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable, BaseData.getNamesModuleValue("Officer"));
			System.out.println(Officer.getText());
			verify.ExpectedPropertyValueIsEqual(Officer.getText(), BaseData.getNamesModuleValue("Officer"));
		}

		public void verifyAtCharge(int rowIndex) {

			WebElement ele = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.activityTab.uIActivityTable, BaseData.getNamesModuleValue("CFS"));
			verify.ExpectedPropertyValueIsEqual(ele.getText(), BaseData.getNamesModuleValue("Charge"));
		}

		public void verifyAtCharge1(int rowIndex) {

			WebElement ele = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.nameEntry.activityTab.uIActivityTable, BaseData.getNamesModuleValue("CFS1"));
			verify.ExpectedPropertyValueIsEqual(ele.getText(), BaseData.getNamesModuleValue("Charge1"));
		}

		public void verifyAtActiveActivityNumber(String Activity) {
			Playback.gridLoadThreadWait();

			WebElement values = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.activityTab.uIActivityTable, Activity);
			System.out.println(values.getText());
			verify.ExpectedPropertyValueIsEqual(values.getText(), Activity);
		}
	}

	public class NameEntryMainTab {

		public void EnterAdultDOB() {
			String getRandomDate = String.valueOf(Randomized.getRandomBetweenTwoNum(1, 26));
			if (getRandomDate.length() == 1)
				getRandomDate = "0" + getRandomDate.toString();
			String getRandomMonth = String.valueOf(Randomized.getRandomBetweenTwoNum(1, 12));
			if (getRandomMonth.length() == 1)
				getRandomMonth = "0" + getRandomMonth.toString();
			String getPreviousYear = Randomized.getPreviousYear(Randomized.getRandomBetweenTwoNum(19, 60) + 1);

			String randomAdultDOB = getRandomMonth + getRandomDate + getPreviousYear;

			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(randomAdultDOB);
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtOutRangeDOB() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(BaseData.getNamesModuleValue("DOB").toString());
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(Keys.TAB);
		}

		public void EnterFutureDOB() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(Randomized.getFutureDate(5).toString());
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(Keys.TAB);

		}

		public void EnterAdultAge() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit
					.sendKeys(String.valueOf(Randomized.getRandomBetweenTwoNum(18, 60)));

		}

		public void ClickClearDOBButton() {
			uIMapNames.nameEntry.nameEntryMainTab.uIClearDOBButton.click();
		}

		public void SelectSex() {
			uIMapNames.nameEntry.nameEntryMainTab.uISexComboBox.click();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uISexComboBox);
		}

		public void SelectAtSex() {
			uIMapNames.nameEntry.nameEntryMainTab.uISexComboBox.click();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryMainTab.uISexComboBox, BaseData.getNamesModuleValue("Sex"));
		}

		public void ClearSex() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uISexComboBox, "--");

		}

		public void ClearRace() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIRaceComboBox, "--");

		}

		public void ClearEthinic() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIEthnicityComboBox, "--");

		}

		public void SelectRace() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIRaceComboBox);

		}

		public void SelectEthnic() {

			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIEthnicityComboBox);

		}

		public void SelectAtRace() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryMainTab.uIRaceComboBox, BaseData.getNamesModuleValue("Race"));

		}

		public void SelectAtEthnic() {

			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryMainTab.uIEthnicityComboBox, BaseData.getNamesModuleValue("Ethnic"));

		}

		public void EnterInvalidSSNumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.clear();
			Playback.threadWait();
			uIMapNames.nameEntry.nameEntryMainTab.uIDrivingLicenseNoEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.sendKeys(Randomized.randomNumberString(3));

		}

		public void EnterSSNumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.clear();
			String SSNo = Randomized.randomNumberString(9);
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.sendKeys(SSNo);
		}

		public void EnterDrivingLicenseNo() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDrivingLicenseNoEdit.clear();
			String DLNo = Randomized.randomAlphanumeric(9);
			uIMapNames.nameEntry.nameEntryMainTab.uIDrivingLicenseNoEdit.sendKeys(DLNo);
		}

		public void SelectDrivingLicenseStateasNJ() {
			uIMapNames.nameEntry.nameEntryMainTab.uIStateComboBox.sendKeys("NJ - New Jersey");
		}

		public void SelectLicenseType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uILicenseTypeComboBox);
		}

		public void SelectMaritalStatusAsMarried() {
			uIMapNames.nameEntry.nameEntryMainTab.uIMaritalStatusComboBox.sendKeys("Married");
		}

		public void EnterBirthCity() {
			uIMapNames.nameEntry.nameEntryMainTab.uIBirthCityEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIBirthCityEdit.sendKeys("New Jersey");
		}

		public void SelectBirthStateAsNJ() {
			uIMapNames.nameEntry.nameEntryMainTab.uIBirthStateComboBox.sendKeys("NJ - New Jersey");
		}

		public void EnterDrivingLicenseExpireDate() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDrivingLicenseExpireDateEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIDrivingLicenseExpireDateEdit.sendKeys("07072050");
		}

		public void SelectBirthCountry() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIBirthCountryComboBox);
		}

		public void EnterStateNumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.clear();
			String StateNo = Randomized.manualPlusRandomString("SBI", 5);
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.sendKeys(StateNo);
		}

		public void EnterFBINumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uIFBINoEdit.clear();
			String FBINo = Randomized.manualPlusRandomString("FBI", 5);
			uIMapNames.nameEntry.nameEntryMainTab.uIFBINoEdit.sendKeys(FBINo);
		}

		public void EnterSameStateFBINumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uIFBINoEdit.clear();
			String StateFBINo = Randomized.manualPlusRandomString("SBIFBI", 3);
			uIMapNames.nameEntry.nameEntryMainTab.uIFBINoEdit.sendKeys(StateFBINo);
		}

		public void EnterAtStateFBINumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit
					.sendKeys(BaseData.getNamesModuleValue("State").toString());
			Playback.threadWait();
			uIMapNames.nameEntry.nameEntryMainTab.uIFBINoEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIFBINoEdit.sendKeys(BaseData.getNamesModuleValue("FBI").toString());

		}

		public void SelectResident() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIResidentComboBox);
		}

		public void clearResident() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIResidentComboBox, "--");
		}

		public void SelectAtResident() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryMainTab.uIResidentComboBox, BaseData.getNamesModuleValue("Resident"));
		}

		public void EnterBirthCountry() {
			uIMapNames.nameEntry.nameEntryMainTab.uIBirthCountryEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIBirthCountryEdit.sendKeys("US");
			uIMapNames.nameEntry.nameEntryMainTab.uIBirthCountryEdit.sendKeys(Keys.TAB);
		}

		public void EnterCitizenship() {
			uIMapNames.nameEntry.nameEntryMainTab.uICitizenshipEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uICitizenshipEdit.sendKeys("US");
			uIMapNames.nameEntry.nameEntryMainTab.uICitizenshipEdit.sendKeys(Keys.TAB);
		}

		public void EnterPassportNumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uIPassportNoEdit.clear();
			String PassportNo = Randomized.manualPlusRandomString("PASS", 4);
			uIMapNames.nameEntry.nameEntryMainTab.uIPassportNoEdit.sendKeys(PassportNo);
		}

		public void EnterImmigrationNumber() {
			uIMapNames.nameEntry.nameEntryMainTab.uIImmigrationEdit.clear();
			String ImmigrationNo = Randomized.randomAlphanumeric(7);
			uIMapNames.nameEntry.nameEntryMainTab.uIImmigrationEdit.sendKeys(ImmigrationNo);
		}

		public void EnterFingerPrint() {
			uIMapNames.nameEntry.nameEntryMainTab.uIFingerPrintEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIFingerPrintEdit.sendKeys("Right Thumb");
		}

		public void EnterEmail() {
			uIMapNames.nameEntry.nameEntryMainTab.uIEmailEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIEmailEdit.sendKeys("test@prophoenix.com");
		}

		public void EnterInvalidEmail() {
			uIMapNames.nameEntry.nameEntryMainTab.uIEmailEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIEmailEdit.sendKeys("prophoenix.com");
		}

		public void SelectRandomDNA() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryMainTab.uIDNATypeComboBox);
		}

		public void ClickAdditionalNumberButton() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAddNumberButton.click();
		}

		public void ClickLicenseTypeText() {
			uIMapNames.nameEntry.nameEntryMainTab.uILicenseTypeTextView.click();
		}

		public void ClickStateTypeText() {
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoTextView.click();
		}

		public void VerifAcknowledgeInvalidSSNumber() {
			popup.acknowledge.okWithExpectedMessage("(1060)Invalid SS No");
		}

		public void VerifyAcknowledgeSameFBIandSBINumber() {

			popup.confirm.verifyContainsMessageInPopup("(6086)");
			popup.confirm.verifyContainsMessageInPopup("SBI# and FBI# are same");
			popup.confirm.noWithContainsMessage("Do you want to Proceed ?");
		}

		public void VerifyAcknowledgeOutRangeDOB() {
			popup.switchToAcknowledge();
			verify.ExpectedValueIsTrue(uIMapPopup.acknowledgeWindow.uIErrorInfoTextEdit.getText()
					.contains("The date is formatted incorrectly or is out of range"));
			uIMapPopup.acknowledgeWindow.uIOkButton.click();
		}

		public void VerifyAcknowledgeValidDOB() {
			popup.acknowledge.okWithExpectedMessage("(6008) Not a Valid Date of Birth");
		}

		public void VerifyAcknowledgeValidEmail() {
			popup.acknowledge.okWithExpectedMessage("(1014) Not a valid Email Address");
		}

		public void VerifyAge() {
			String ageField = uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.getAttribute("value");
			verify.ExpectedValueIsTrue(ageField.contains("32"));
		}

		public void VerifyLicenseTypeFieldHide() {
			verify.ExpectedValueIsTrue(Boolean.parseBoolean(
					uIMapNames.nameEntry.nameEntryMainTab.uILicenseTypeComboBox.getAttribute("disabled")));
		}

		public void VerifyLicenseTypeMandatory() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryMainTab.uILicenseTypeTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void VerifyStateTypeFieldHide() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void VerifyStateTypeMandatory() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryMainTab.uIStateNoTextView
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

		public void EnterStateAsSpace() {
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.sendKeys(Keys.SPACE);
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.sendKeys(Keys.SPACE);
		}

		public void EnterAtState() {
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.clear();
			uIMapNames.nameEntry.nameEntryMainTab.uIStateNoEdit.sendKeys(BaseData.getNamesModuleValue("State"));
		}

		public void VerifyAtRace() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Race"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.nameEntry.nameEntryMainTab.uIRaceComboBox));
		}

		public void VerifyAtEthnic() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Ethnic"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.nameEntry.nameEntryMainTab.uIEthnicityComboBox));
		}

		public void VerifyAtBirthDate() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("BirthDate"),
					uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.getAttribute("value"));
		}

		public void VerifyAtSex() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Sex"), objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.nameEntry.nameEntryMainTab.uISexComboBox));
		}

		public void EnterAtBirthDate() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(BaseData.getNamesModuleValue("BirthDate"));
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(Keys.TAB);
		}

		public void ClickAgeResetIcon() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeResetIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAgeFromToFieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.getAttribute("class")
					.contains("textboxInactive"));
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.getAttribute("class")
					.contains("textboxInactive"));
		}

		public void EnterAgeFromAs25() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys("25");
		}

		public void EnterAgeToAs15() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys("15");
		}

		public void EnterAgeToAs35() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys("35");
		}

		public void VerifyAtJacketNo() {
			String jacket = uIMapNames.nameEntry.nameEntryMainTab.uIJacketTextView.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Jacket"), jacket);
		}

		public void VerifyAtSSNo() {
			String ssNo = uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.getAttribute("title");
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("SSno"), ssNo);
		}

		public void VerifySSNoDuplicateConfirmationMessage() {
			if (Playback.browserType.equals("Chrome")) {
				Assert.assertTrue(
						Playback.driver.switchTo().alert().getText().contains("Do you want to Duplicate SS# ?"));

			} else {
				String ErrorMsg = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(ErrorMsg.contains("Do you want to Duplicate SS#"));
			}

		}

		public void enterBirthDateAsCurrentDate() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(Randomized.getCurrentDate());
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void verifyConfirmJuvenileNameWarningMessageInChrome() // review with vijay
		{
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				String warningMessage = Playback.driver.switchTo().alert().getText();
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"Based on this DOB the ID# may be J. If this is an arrest entry for a 17 year old offender, select no to create adult record. For any other reason, select YES to create this as a juvenile record."));
				popup.confirm.yes();
			}

			else {
				Playback.pageLoadThreadWait();
			}

		}

		public void verifyConfirmatiomToCreateJuvenileRecord() {
			if (Playback.browserType == "Chrome") {
				String text = Playback.driver.switchTo().alert().getText();
				verify.ExpectedValueIsTrue(text.contains("select YES to create this as a juvenile record"));
				popup.confirm.yes();
			} else {
				popup.confirm.yes();
			}
		}

		public void verifyAsAdultAge() {
			String ageField = uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.getAttribute("value");
			verify.ExpectedValueIsTrue(Integer.parseInt(ageField) >= 18);
		}

		public void enterAtSSNo() {
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.click();
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.sendKeys(BaseData.getNamesModuleValue("SSNo"));
			uIMapNames.nameEntry.nameEntryMainTab.uISSNoEdit.sendKeys(Keys.TAB);
		}

		public void clickBirthDate() {
			uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.click();
		}

		public void enterAtAgeFrom() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(BaseData.getNamesModuleValue("AgeFrom"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(Keys.TAB);
		}

		public void enterAtAgeTo() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(BaseData.getNamesModuleValue("AgeTo"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(Keys.TAB);
		}

		public void enterAtAgeFrom1() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(BaseData.getNamesModuleValue("AgeFrom1"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(Keys.TAB);
		}

		public void enterAtAgeTo1() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(BaseData.getNamesModuleValue("AgeTo1"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(Keys.TAB);
		}

		public void enterAtAgeFrom2() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(BaseData.getNamesModuleValue("AgeFrom2"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(Keys.TAB);
		}

		public void enterAtAgeFrom3() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.click();
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(BaseData.getNamesModuleValue("AgeFrom3"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeTextView.sendKeys(Keys.TAB);
		}

		public void enterAtAgeTo2() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(BaseData.getNamesModuleValue("AgeTo2"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(Keys.TAB);
		}

		public void enterAtAgeTo3() {
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(BaseData.getNamesModuleValue("AgeTo3"));
			uIMapNames.nameEntry.nameEntryMainTab.uIAgeToTextView.sendKeys(Keys.TAB);
		}

		public void verifySaveConfirmMessage() {

			popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");

		}

		public void verifyAgeCannottBeZeroAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6135) Age cannot be zero");
		}

		public void verifyAtRace1() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Race1"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.nameEntry.nameEntryMainTab.uIRaceComboBox));
		}

		public void verifyAtEthnic1() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Ethnic1"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.nameEntry.nameEntryMainTab.uIEthnicityComboBox));
		}

		public void VerifyAtDOB() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("DOB"),
					uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.getAttribute("value"));
		}

		public String getBirthDate() {
			String attribute = uIMapNames.nameEntry.nameEntryMainTab.uIDOBEdit.getAttribute("value");
			return attribute;
		}
	}

	public class PhysicalTab {

		public void EnterHeight() {
			uIMapNames.nameEntry.physicalTab.uIHeightEdit
					.sendKeys(String.valueOf(Randomized.getRandomBetweenTwoNum(400, 800)));

		}

		public void EnterWeight_lbs() {
			uIMapNames.nameEntry.physicalTab.uIWeight_lbsEdit
					.sendKeys(String.valueOf(Randomized.getRandomBetweenTwoNum(400, 800)));
		}

		public void SelectEyeColor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIEyeColorComboBox);
		}

		public void SelectHairColor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIHairColorComboBox);

		}

		public void SelectHairLength() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIHairLengthComboBox);
		}

		public void SelectHairStyle() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIHairStyleComboBox);
		}

		public void SelectFacialHair() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIFacialHairCombobox);
		}

		public void SelectTeeth() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIteethComboBox);
		}

		public void SelectBuild() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIBuildComboBox);
		}

		public void SelectCondition() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIConditionComboBox);
		}

		public void ClickScarsMarksLookupButton() {
			uIMapNames.nameEntry.physicalTab.uIMarksLookupButton.click();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void EnterScarsMarksAsARTARM() {
			uIMapNames.nameEntry.physicalTab.uIMarksEdit.sendKeys("ART ARM");
			uIMapNames.nameEntry.physicalTab.uIMarksEdit.sendKeys(Keys.TAB);
		}

		public void EnterDescription() {
			uIMapNames.nameEntry.physicalTab.uIDescriptionEdit.sendKeys("Mark on RightHand");
		}

		public void AddMarks() {
			uIMapNames.nameEntry.physicalTab.uIPhysicalAddButton.click();
		}

		public void EnterChin() {
			uIMapNames.nameEntry.physicalTab.uIChinEdit.sendKeys("345");
		}

		public void SelectComplexion() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIComplexionComboBox);
		}

		public void SelectHandicapped() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIHandicappedComboBox);
		}

		public void SelectHand() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.nameEntry.physicalTab.uIHandComboBox);
		}

		public void EnterPhysicalDescription() {
			uIMapNames.nameEntry.physicalTab.uIPhysicalDescriptionEdit.sendKeys("Mark on RightHand");
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.physicalTab.uIPhysicalAddButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.nameEntry.physicalTab.uIPhysicalClearButton.click();
		}

		public void VerifyAcknowledgeDuplicationData() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void VerifyValueAddedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount("tabNames_tmpl2_usrPhysical1_grdMarks") != 0);
		}

		public void EnterAtSMT() {
			uIMapNames.nameEntry.physicalTab.uIMarksEdit.sendKeys(BaseData.getNamesModuleValue("SMT"));
		}

		public void EnterAtSMT1() {
			uIMapNames.nameEntry.physicalTab.uIMarksEdit.sendKeys(BaseData.getNamesModuleValue("SMT1"));
		}

		public void EnterAtDescription() {
			uIMapNames.nameEntry.physicalTab.uIDescriptionEdit.sendKeys(BaseData.getNamesModuleValue("Description"));
		}

		public void EnterAtDescription1() {
			uIMapNames.nameEntry.physicalTab.uIDescriptionEdit.sendKeys(BaseData.getNamesModuleValue("Description1"));
		}

		public void VerifyAtSMTInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("SMT"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.physicalTab.uIResultPhycialTabGrid, "SMT", rowIndex));
		}

		public void VerifyAtSMT1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("SMT1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameEntry.physicalTab.uIResultPhycialTabGrid, "SMT", rowIndex));
		}

		public void VerifyAtHeight() {
			String height = uIMapNames.nameEntry.physicalTab.uIHeightEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Height"), height);
		}

		public void VerifyAtWeight() {
			String weight = uIMapNames.nameEntry.physicalTab.uIWeight_lbsEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Weight"), weight);
		}

		public void selectAtEyeColor() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.physicalTab.uIEyeColorComboBox, BaseData.getNamesModuleValue("EyeColor"));
		}

		public void clickGlassesCheckBox() {
			uIMapNames.nameEntry.physicalTab.uIGlassesCheckbox.click();
		}

		public void clickAtSMTInGrid() {
			WebElement gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.physicalTab.uISMTTable, BaseData.getNamesModuleValue("SMT"));
			gridCell.click();
		}

		public void verifyLastEntryAsCurrentDate() {
			
			String currentDate = uIMapNames.nameEntry.physicalTab.uILastEntryDate.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), currentDate);

		}

	}

	public class NameEntryFlagTab {

		public void ClickAddNewButton() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIAddNewButton.click();
		}

		public void SelectFlagAsArmedDangerous() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIFlagComboBox.sendKeys("Armed Dangerous");
		}

		public void SelectFlag() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryFlagTab.uIFlagComboBox);
		}

		public void CheckCriticalCheckBox() {
			uIMapNames.nameEntry.nameEntryFlagTab.uICriticalCheckBox.click();
		}

		public void EnteredBy() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIEnteredByEdit.click();
			uIMapNames.nameEntry.nameEntryFlagTab.uIEnteredByEdit.sendKeys(Keys.TAB);
		}

		public void TabEnteredDate() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIEnteredDateEdit.click();
			uIMapNames.nameEntry.nameEntryFlagTab.uIEnteredDateEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.nameEntryFlagTab.uIAddButton.click();
			Playback.threadWait();
		}

		public void ClickCancelButton() {
			uIMapNames.nameEntry.nameEntryFlagTab.uICancelButton.click();
		}

		public void EnterActiveDate() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIActiveDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapNames.nameEntry.nameEntryFlagTab.uIActiveDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterExpiredDate() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIExpiredDateEdit.clear();
			uIMapNames.nameEntry.nameEntryFlagTab.uIExpiredDateEdit.click();
			uIMapNames.nameEntry.nameEntryFlagTab.uIExpiredDateEdit.sendKeys(Randomized.getFutureDate(2));
		}

		public void EnterAuthorizedBy() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIAuthorizedByEdit.sendKeys("Police Admin");
		}

		public void EnterComment() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIDescriptionEdit.sendKeys("Armed Dangerous Person");
		}

		public void ClickCommentIconInGrid(int rowIndex) {
			WebElement comment = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryFlagTab.uIFlagGridTable, "Comment", rowIndex);
			comment.click();
		}

		public void ClickDeleteIconInGrid() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIDeleteIconGridButton.click();
		}

		public void VerifyCurrentDate() {
			String currentDate = uIMapNames.nameEntry.nameEntryFlagTab.uIEnteredDateEdit.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), currentDate);

		}

		public void VerifyFlagRedColorCode() {
			String RedColor = uIMapNames.nameEntry.uINameFlagTab.getAttribute("class");
			verify.ExpectedValueIsTrue(RedColor.contains("redcolor"));

		}

		public void VerifyAtFlag() {

			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Flag"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameEntry.nameEntryFlagTab.uIFlagGridTable, "Armed Dangerous",
									"Flags")
							.getText());

		}

		public void VerifyBlackColorCode() {
			String uIBlackColor = uIMapNames.nameEntry.uINameFlagTab.getAttribute("class");
			verify.ExpectedValueIsTrue(uIBlackColor.contains("blackcolor"));
		}

		public void VerifyAcknowledgeDuplicationData() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void SelectAtFlagsAtGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameEntry.nameEntryFlagTab.uIFlagGridTable, BaseData.getNamesModuleValue("Flags"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtEnteredDateUsingFlags() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameEntry.nameEntryFlagTab.uIFlagGridTable,
									BaseData.getNamesModuleValue("Flags"), "Entered Date")
							.getText());
		}

		public void VerifyAtExpiryDateUsingFlags() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(2, "M/d/yyyy"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameEntry.nameEntryFlagTab.uIFlagGridTable,
									BaseData.getNamesModuleValue("Flags"), "Expiration Date")
							.getText());
		}

		public void selectAtFlags() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryFlagTab.uIFlagComboBox, BaseData.getNamesModuleValue("Flags"));

		}

		public void enterAtEnteredBy() {
			uIMapNames.nameEntry.nameEntryFlagTab.uIEnteredByEdit.sendKeys(BaseData.getNamesModuleValue("EnteredBy"));
			uIMapNames.nameEntry.nameEntryFlagTab.uIEnteredByEdit.sendKeys(Keys.TAB);
		}

		public void selectAtLinkedPhoneNumber() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryFlagTab.uILinkedPhoneNoDropdown,
					BaseData.getNamesModuleValue("LinkedPhoneNo"));

		}

		public void verifyAtFlags() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.nameEntry.nameEntryFlagTab.uIFlagGridTable, BaseData.getNamesModuleValue("Flags"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getNamesModuleValue("Flags")));
		}

		public void verifyCriticalCheckBoxIsChecked() {
			uIMapNames.nameEntry.nameEntryFlagTab.uICriticalCheckBox.isSelected();
		}

	}

	public class EmpSchoolTab {
		public void EnterAtLastName() {
			uIMapNames.nameEntry.empSchoolTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("EmpLastName"));
			uIMapNames.nameEntry.empSchoolTab.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectNameByName() {
			names.nameSearchHelpWindow.selectAtNameInGrid();
		}

		public void ClickBNameInfoIcon() {
			uIMapNames.nameEntry.empSchoolTab.uIBNameInfoIconButton.click();
		}

		public void SelectOccupation() {
			uIMapNames.nameEntry.empSchoolTab.uIOccupationLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void ClickUnemploymentCheckBox() {
			uIMapNames.nameEntry.empSchoolTab.uIUnEmployedCheckBox.click();
		}

		public void SelectType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.nameEntry.empSchoolTab.uITypeComboBox);
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.empSchoolTab.uIAddNameButton.click();
		}

		public void SwitchAllTabs() {
			uIMapNames.nameEntry.uINameFlagTab.click();
			uIMapNames.nameEntry.uIAliasTab.click();
			uIMapNames.nameEntry.uIAddressTab.click();
			uIMapNames.nameEntry.uIPhonesTab.click();
			uIMapNames.nameEntry.uIBusinessTab.click();
			uIMapNames.nameEntry.uIActivityTab.click();
			uIMapNames.nameEntry.uIAttachmentsTab.click();
			uIMapNames.nameEntry.uIContactsTab.click();
			uIMapNames.nameEntry.uICommentsTab.click();
			uIMapNames.nameEntry.uIMapTab.click();
		}

		public void CloseBNameEntryWindow() {
			uIMapNames.nameEntry.driver.close();
		}

		public void EnterComments() {
			uIMapNames.nameEntry.empSchoolTab.uICommentsEdit.sendKeys("Automation Test Purpose");
		}

		public void SaveEmpSchoolTab() {
			uIMapNames.nameEntry.empSchoolTab.uIEmpSchoolSaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAcknowledgeUpdateEmpSchoolTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Emp/School Tab. You must save or reset.");
		}

		public void VerifyAcknowledgeMandatoryData() {
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void VerifyAcknowledgeDuplicationData() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void VerifyCurrentDate(int rowIndex) {
			WebElement currentDate = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.empSchoolTab.uIEmpSchoolGridTable, "Date", rowIndex);
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), currentDate.getText());
		}

		public void VerifyTypeAsAlternate(int rowIndex) {
			WebElement type = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.empSchoolTab.uIEmpSchoolGridTable, "Type", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Alternate", type.getText());
		}

		public void verifyAtBusinessName(int rowIndex) {

			if (rowIndex == 0) {
				String expected = BaseData.getNamesModuleValue("BusinessName");
				List<WebElement> type = objectIdentification.manualIdentify
						.getGridRowCells(uIMapNames.nameEntry.empSchoolTab.uIEmpSchoolGridTable, rowIndex);
				for (WebElement ele : type) {
					if (ele.getText().contains(expected)) {
						verify.ExpectedPropertyValueIsEqual(expected, ele.getText());
						System.out.println(ele.getText());
					}
				}
			} else {
				String expected = BaseData.getNamesModuleValue("BusinessName" + rowIndex + "");
				List<WebElement> type = objectIdentification.manualIdentify
						.getGridRowCells(uIMapNames.nameEntry.empSchoolTab.uIEmpSchoolGridTable, rowIndex - 1);
				for (WebElement ele : type) {
					if (ele.getText().contains(expected)) {
						verify.ExpectedPropertyValueIsEqual(expected, ele.getText());
						System.out.println(ele.getText());
					}
				}
			}
		}

		public void deleteGridRowByName() {
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapNames.nameEntry.empSchoolTab.uIEmpSchoolGridTable,
					BaseData.getNamesModuleValue("BusinessName"));

		}

		public void VerifyConfirmDeleteMessage() {
			if (Playback.browserType.equals("Chrome")) {
				Playback.driver.switchTo().alert().accept();
			} else {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
		}

		public void enterAtBNameID() {

			uIMapNames.nameEntry.empSchoolTab.uIBNameIDEdit.sendKeys(BaseData.getNamesModuleValue("BusinessNameID"));
		}

	}

	public class FamilyTab {
		public void EnterAtLastName() {
			uIMapNames.nameEntry.familyTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.nameEntry.familyTab.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.nameEntry.familyTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtBrotherLastName() {
			uIMapNames.nameEntry.familyTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("BrotherLastName"));
		}

		public void EnterAtBrotherFirstName() {
			uIMapNames.nameEntry.familyTab.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("BrotherFirstName"));
			uIMapNames.nameEntry.familyTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectRelationshipAsBrother() {
			uIMapNames.nameEntry.familyTab.uIRelationshipComboBox.sendKeys("Brother");
		}

		public void SelectReciprocalRelationshipAsBrother() {
			uIMapNames.nameEntry.familyTab.uIReciprocalRelationshipComboBox.sendKeys("Brother");
		}

		public void SelectRelationship() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.familyTab.uIRelationshipComboBox);
		}

		public void SelectReciprocalRelationship() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.familyTab.uIReciprocalRelationshipComboBox);
		}

		public void EnterComments() {
			uIMapNames.nameEntry.familyTab.uICommentsEdit.sendKeys("Automation Purpose");
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.familyTab.uIAddNameButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.nameEntry.familyTab.uIFamilyClearButton.click();
		}

		public void Reset() {
			uIMapNames.nameEntry.familyTab.uIFamilyResetButton.click();
		}

		public void Save() {
			uIMapNames.nameEntry.familyTab.uIFamilySaveButton.click();
		}

		public void VerifySelectName() {
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void SelectNameByName() {
			names.nameSearchHelpWindow.selectAtNameInGrid();
		}

		public void VerifyAcknowledgeMainName() {
			popup.acknowledge.okWithExpectedMessage("(7046) Main name cannot be added as a linked name");
		}

		public void VerifyAcknowledgeMandatoryData() {
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void VerifyAcknowledgeUpdateFamilyTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Family Tab. You must save or reset.");
		}

	public void VerifyAdditionSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));
		}
		
		public void VerifyAcknowledgeDuplicationData() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}
	}

	public class GangTab {

		public void SelectAtGang() {
			uIMapNames.nameEntry.gangTab.uIGangComboBox.sendKeys(BaseData.getNamesModuleValue("Gang"));
		}

		public void ClickAddGangButton() {
			uIMapNames.nameEntry.gangTab.uIAddGangButton.click();
		}

		public void SelectGangAsBlood() {
			uIMapNames.nameEntry.gangTab.uIGangComboBox.sendKeys("Bloods");
		}

		public void DeleteGangMembership() {
			uIMapNames.nameEntry.gangTab.uIDeleteIconGridButton.click();
		}

		public void EnterGangSet() {
			uIMapNames.nameEntry.gangTab.uIGangSetEdit.sendKeys("25");
		}

		public void ClickSelfAdmission() {
			uIMapNames.nameEntry.gangTab.uISelfAdmissionCheckBox.click();
		}

		public void ClickGangTattoos() {
			uIMapNames.nameEntry.gangTab.uIGangTatooCheckBox.click();
		}

		public void Save() {
			uIMapNames.nameEntry.gangTab.uIGangSaveButton.click();
		}

		public void VerifyAcknowledgeUpdateGangTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Gang Tab. You must save or reset.");
		}

		public void VerifyConfirmDeleteMessage() {
			if (Playback.browserType.equals("Chrome")) {
				Playback.driver.switchTo().alert().accept();
			} else {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			}
		}

		public void VerifyAtGangAddedInGrid(int rowIndex) {

			String GangMember = objectIdentification.manualIdentify.getGridCellInnerText("grdGang", "Gang Membership",
					rowIndex);
			verify.ExpectedValueIsTrue(GangMember.contains(BaseData.getNamesModuleValue("Gang")));

		}

		public void VerifyAdditionSccessful() {
			String AdditionMessage = uIMapNames.nameEntry.gangTab.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);

		}

		public void VerifyDeletedGangNotFound() {
			String DeleteAddress = String.valueOf(objectIdentification.manualIdentify.getGridTableRowsCount("grdGang"));
			verify.ExpectedValueIsTrue(DeleteAddress.contains("1"));

		}

		public void VerifyAtGangNameUsingAffiliatedDate() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("GangName"),
					objectIdentification.manualIdentify.getGridCell(uIMapNames.nameEntry.gangTab.uIGangTabResultTable,
							Randomized.getCurrentDate("M/d/yyyy"), "Gang Name").getText());
		}

		public void VerifyRankAsCUsingGangName() {
			verify.ExpectedPropertyValueIsEqual("C",
					objectIdentification.manualIdentify.getGridCell(uIMapNames.nameEntry.gangTab.uIGangTabResultTable,
							BaseData.getNamesModuleValue("GangName"), "Rank").getText());
		}

		public void VerifyStatusAsNUsingGangName() {
			verify.ExpectedPropertyValueIsEqual("N",
					objectIdentification.manualIdentify.getGridCell(uIMapNames.nameEntry.gangTab.uIGangTabResultTable,
							BaseData.getNamesModuleValue("GangName"), "Status").getText());
		}

		public void VerifyAtLocationOfActivityUsingGangName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("LocationOfActivity"),
					objectIdentification.manualIdentify.getGridCell(uIMapNames.nameEntry.gangTab.uIGangTabResultTable,
							BaseData.getNamesModuleValue("GangName"), "Location Of Activity").getText());
		}
	}

	public class InfoTab {

		public void EnterDrivingLicenseNumber() {
			String DLNo = Randomized.randomAlphanumeric(7);
			uIMapNames.nameEntry.infoTab.uIDLNumberEdit.sendKeys(DLNo);
		}

		public void ClearDLNumber() {

			uIMapNames.nameEntry.infoTab.uIClearDLButton.click();

		}
		public void ClearSSNumber() {

			uIMapNames.nameEntry.infoTab.uIClearSSNoButton.click();

		}

		public void ClickDLAddButton() {
			uIMapNames.nameEntry.infoTab.uIAddDLButton.click();
		}

		public void EnterActualDLNo() {
			String ActualDL = uIMapNames.nameEntry.infoTab.uIActualDLNumberTextView.getAttribute("value").substring(0,
					4);
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.infoTab.uIDLNumberEdit.sendKeys(ActualDL);
		}

		public void EnterSSNumber() {
			uIMapNames.nameEntry.infoTab.uISSNumberEdit.clear();
			String SSNo = Randomized.randomNumberString(9);
			uIMapNames.nameEntry.infoTab.uISSNumberEdit.sendKeys(SSNo);
		}

		public void EnterAtSSNumber() {
			uIMapNames.nameEntry.infoTab.uISSNumberEdit.click();
			uIMapNames.nameEntry.infoTab.uISSNumberEdit.sendKeys(BaseData.getNamesModuleValue("ssnumber"));
		}

		public void ClickAddSSnumber() {
			uIMapNames.nameEntry.infoTab.uIAddSSNoButton.click();
		}

		public void ClickClearSSNumber() {
			uIMapNames.nameEntry.infoTab.uIClearSSNoButton.click();
		}

		public void EnterActualSSNumber() {
			Playback.controlReadyThreadWait();
			String SSnumber = uIMapNames.nameEntry.infoTab.uIActualSSNumberTextView.getAttribute("value").replace("-",
					"");
			uIMapNames.nameEntry.infoTab.uISSNumberEdit.click();
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.infoTab.uISSNumberEdit.sendKeys(SSnumber);

		}

		public void EnterRandomAdultDOB() {
			String getRandomDate = String.valueOf(Randomized.getRandomBetweenTwoNum(1, 26));
			if (getRandomDate.length() == 1)
				getRandomDate = "0" + getRandomDate.toString();
			String getRandomMonth = String.valueOf(Randomized.getRandomBetweenTwoNum(1, 12));
			if (getRandomMonth.length() == 1)
				getRandomMonth = "0" + getRandomMonth.toString();
			String getPreviousYear = Randomized.getPreviousYear(Randomized.getRandomBetweenTwoNum(19, 60));

			String randomAdultDOB = getRandomMonth + getRandomDate + getPreviousYear;

			uIMapNames.nameEntry.infoTab.uIDateofBirtEdit.click();
			uIMapNames.nameEntry.infoTab.uIDateofBirtEdit.sendKeys(randomAdultDOB);
		}

		public void ClickAddDOBButton() {
			uIMapNames.nameEntry.infoTab.uIAddDOBButton.click();
		}

		public void EnterActualDOB() {
			String DOB = uIMapNames.nameEntry.infoTab.uIActualDateofBirtTextView.getAttribute("value").replace("/", "");
			uIMapNames.nameEntry.infoTab.uIDateofBirtEdit.sendKeys(DOB);
		}

		public void ClickClearDOBButton() {
			uIMapNames.nameEntry.infoTab.uIClearDOBButton.click();
		}

		public void SaveInternalTab() {
			uIMapNames.nameEntry.infoTab.uIInfoSaveButton.click();
		}

		public void VerifyAcknowledgeDuplicationData() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void VerifyConfirmSSNumber() {
//			if (Playback.browserType.contains("Chrome")) {
//				Playback.controlReadyThreadWait();
//				popup.confirm.no();
//			} else {
			//	verify.ExpectedValueIsTrue(uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText()
			//			.contains("already exists in, A-0000000103. Do you want to proceed?"));
				popup.confirm.noWithExpectedMessage("(6121)SS#   654879312 already exists in, A-0000000103.   Do you want to proceed? ");
				Playback.controlReadyThreadWait();
				popup.acknowledge.okIfWindowExist();  
			}
		
		public void VerifyAcknowledgeUpdateInfoTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051)Updated data exists in the Info Tab. You must save or reset.");
		}

	}

	public class AssociateTab {
		public void EnterAtLastName() {
			uIMapNames.nameEntry.associateTab.uIAssociateLastNameEdit
					.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.nameEntry.associateTab.uIAssociateFirstNameEdit
					.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.nameEntry.associateTab.uIAssociateFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtAssociateLastName() {
			uIMapNames.nameEntry.associateTab.uIAssociateLastNameEdit
					.sendKeys(BaseData.getNamesModuleValue("AssociateLastName"));
		}

		public void EnterAtAssociatesFirstName() {
			uIMapNames.nameEntry.associateTab.uIAssociateFirstNameEdit
					.sendKeys(BaseData.getNamesModuleValue("AssociateFirstName"));
			uIMapNames.nameEntry.associateTab.uIAssociateFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectName() {
			names.nameSearchHelpWindow.SelectNameByNameID();
		}

		public void SelectAssociateName() {
			Playback.pageLoadThreadWait();
			names.nameSearchHelpWindow.SelectName();
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.associateTab.uIAddNameButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.nameEntry.associateTab.uIClearNameButton.click();
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.associateTab.uIClearNameButton.click();
		}
		public void ClickSaveButton() {
			uIMapNames.nameEntry.associateTab.uIAssociateSaveButton.click();
		}
		public void EnterAtCaseNo() {
			uIMapNames.nameEntry.associateTab.uICaseYearEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(0, 2));
			uIMapNames.nameEntry.associateTab.uICaseNumberEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(3));
			uIMapNames.nameEntry.associateTab.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void ClickCaseInfoButton() {
			uIMapNames.nameEntry.associateTab.uICaseInfoButton.click();
		}

		public void GetReportedOn(String reportedOnDate, String reportedOnTime) {
			String reportedOnDateAndTime = uIMapNames.nameEntry.associateTab.uIReportedOnTextView.getAttribute("value");
			Playback.setTestContextAttribute("reportedOnDate", reportedOnDateAndTime.substring(0, 10));
			// Playback.setTestContextAttribute(reportedOnDate, reportedOnDate);
			Playback.setTestContextAttribute("reportedOnTime", reportedOnDateAndTime.substring(11));
		}

		public void GetReportedOn(String reportedOnDateAndTime) {
			reportedOnDateAndTime = uIMapNames.nameEntry.associateTab.uIReportedOnTextView.getText();
			Playback.setTestContextAttribute("reportedOnDateAndTime", reportedOnDateAndTime);
		}

		public void VerifyAcknowledgeMainName() {
			popup.acknowledge.okWithExpectedMessage("(7046) Main name cannot be added as a linked name");
		}

		public void EnterDate() {
			uIMapNames.nameEntry.associateTab.uIDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterComments() {
			uIMapNames.nameEntry.associateTab.uICommentsEdit.sendKeys("Test for Automation purpose");
		}

		public void VerifyAcknowledgeUpdateAssociateTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Associates Tab. You must save or reset.");
		}

	public void VerifyUpdateSuccessfulStatusMessage() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapNames.nameEntry.uIBottomLeftSideStatusBar.getText(),"1003 - Update Successful");
		}

	}

	public class VisitorsTab {
		public void EnterAtLastName() {
			uIMapNames.nameEntry.visitorsTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.nameEntry.visitorsTab.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.nameEntry.visitorsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtVisitorLastName() {
			uIMapNames.nameEntry.visitorsTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("VisitorLastName"));
		}

		public void EnterAtVisitorFirstName() {
			uIMapNames.nameEntry.visitorsTab.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("VisitorFirstName"));
			uIMapNames.nameEntry.visitorsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectRelationship() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.visitorsTab.uIRelationshipComboBox);
		}

		public void EnterComment() {
			uIMapNames.nameEntry.visitorsTab.uICommentsEdit.sendKeys("Automation Purpose");
		}

		public void VerifySelectName() {
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void selectNameByName() {
			names.nameSearchHelpWindow.selectAtNameInGrid();
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.visitorsTab.uIAddVisitorsButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.nameEntry.visitorsTab.uIClearVisitorsButton.click();
		}

		public void VerifyAllfieldsCleared() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.visitorsTab.uILastNameEdit.getText() == "");
			if (Playback.browserType.contains("Chrome"))
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getDropDownSelectedItem(uIMapNames.nameEntry.visitorsTab.uIRelationshipComboBox) == "  --  ");
			else
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
						.getDropDownSelectedItem(uIMapNames.nameEntry.visitorsTab.uIRelationshipComboBox) == "--");
		}

		public void Reset() {
			uIMapNames.nameEntry.visitorsTab.uIVisitorsResetButton.click();
		}

		public void Save() {
			uIMapNames.nameEntry.visitorsTab.uIVisitorsSaveButton.click();
		}

		public void VerifyAcknowledgeMainName() {
			popup.acknowledge.okWithExpectedMessage("(6139) Main name cannot be added as Visitor Name");
		}

		public void VerifyAcknowledgeUpdateVisitorTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Visitors Tab. You must save or reset.");
		}

		public void VerifyUpdateSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.uIBottomLeftSideStatusBar.getText().contains("1003 - Update Successful"));
		}

	}

	public class NameEntryAddressesTab {
		public void EnterAddressAsMainAddress() {
			String MainAddress = uIMapNames.nameEntry.uIMainAddressEdit.getAttribute("value");
			uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressEdit.sendKeys(MainAddress);

		}

		public void EnterAtAddress() {

			uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address"));
		}

		public void TabAddressCheckBox() {
			uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressCheckBox.sendKeys(Keys.TAB);
		}

		public void EnterCountryAsUS() {
			uIMapNames.nameEntry.nameEntryAddressesTab.uICountryCodeEdit.sendKeys("US");
			uIMapNames.nameEntry.nameEntryAddressesTab.uICountryCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryAddressesTab.uITypeComboBox);
		}

		public void EnterCurrentDate() {
			uIMapNames.nameEntry.nameEntryAddressesTab.uIDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void ClickAddbutton() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.nameEntryAddressesTab.uIAddButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.nameEntry.nameEntryAddressesTab.uIClearButton.click();
		}

		public void ClickDeleteIcon() {
			uIMapNames.nameEntry.nameEntryAddressesTab.uIDeleteIconGridButton.click();
		}

		public void VerifyAcknowledgeMainAddress() {
			popup.acknowledge.okWithExpectedMessage("(6009) The Main address cannot be added as an Additional address");
		}

		public void VerifyAcknowledgeUpdateAddressesTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Addresses Tab. You must save or reset.");
		}

		public void VerifyAllfieldsCleared() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressEdit.getText().equals(""));

			String selectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.nameEntry.nameEntryAddressesTab.uITypeComboBox);

			System.out.println(selectedItem);
			verify.ExpectedPropertyValueIsEqual("--", selectedItem);

		}

		/*
		 * public void VerifyDeletedAddressNotFound() {
		 * Playback.controlReadyThreadWait();
		 * verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
		 * .getGridTableRowsCount("tabNames_tmpl4_usrAddresses1_grdAddress") == 0); }
		 */

		public void VerifyDeletedAddressNotFound() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.checkElementAvailableOrNot(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable));
		}

		public void VerifyAtAddress(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable, "Address", rowIndex)
					.getText().contains(BaseData.getNamesModuleValue("Address")));
		}

		public void VerifyAtAddresses(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable, "Address", rowIndex)
					.getText().contains(BaseData.getNamesModuleValue("Addresses")));
		}

		public void ClickAtAddressInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable,
					BaseData.getNamesModuleValue("Address"));
		}

		public void VerifyTypeAsOld() {
			verify.ExpectedPropertyValueIsEqual("Old", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.nameEntry.nameEntryAddressesTab.uITypeComboBox));
		}

		public void VerifyAddressContentColorAsRed() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressEdit.getAttribute("Style").contains("red"));
		}

		public void VerifyAtCSZ(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable, "CSZ", rowIndex)
					.getText().contains(BaseData.getNamesModuleValue("CSZ")));
		}

		public void VerifyAtCountry(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable, "Country", rowIndex)
					.getText().contains(BaseData.getNamesModuleValue("Country")));
		}

		public void VerifyAtAddress1(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable, "Address", rowIndex)
					.getText().contains(BaseData.getNamesModuleValue("Address1")));
		}

		public void verifyAtOldAddress(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressResultTable, "Address", rowIndex)
					.getText().contains(BaseData.getNamesModuleValue("OldAddress")));
		}

		public void EnterAtAddress1() {
			uIMapNames.nameEntry.nameEntryAddressesTab.uIAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address1"));

		}

		public void verifyEnableMailDeliveryCheckBoxDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryAddressesTab.uIMailDeliveryCheckBox.isDisplayed());

		}

		public void clickMailDeliveryCheckBox() {
			uIMapNames.nameEntry.nameEntryAddressesTab.uIMailDeliveryCheckBox.click();
		}

		public void SelectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryAddressesTab.uITypeComboBox, BaseData.getNamesModuleValue("Type"));

		}
	}

	public class NameEntryMapTab {
		public void VerifyLatLongAsCustomValue() {
			String LatLongValue = uIMapNames.nameEntry.nameEntryMapTab.uILatLongValueTextView.getText();
			String lat = "40.0075999";
			String Long = "-74.8957";
			System.out.println(LatLongValue);
			verify.ExpectedValueIsTrue((LatLongValue).contains(lat));
			verify.ExpectedValueIsTrue((LatLongValue).contains(Long));

		}
		public void VerifyUpdateLatLongButtonDisabled() {	
			verify.ExpectedValueIsFalse(uIMapNames.nameEntry.nameEntryMapTab.uIUpdateLatLongButton.isEnabled());
		}
		public void VerifyDiplayingMapIdForNameID() {	
			System.out.println(uIMapNames.nameEntry.nameEntryMapTab.uIDiplayingMapIdForNameID.getText());
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryMapTab.uIDiplayingMapIdForNameID.getText().equals(BaseData.getNamesModuleValue("NameID")));
		}
	}

	public class PhoneTab {
		public void EnterOrderNo() {
			uIMapNames.nameEntry.phoneTab.uIOrderNoEdit.sendKeys("0");
		}

		public void SelectPhoneType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.nameEntry.phoneTab.uIPhoneTypeComboBox);
		}

		public void EnterAtPhoneNumber() {
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.click();
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.clear();
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.click();
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.sendKeys(BaseData.getNamesModuleValue("Phone"));
		}

		public void EnterWrongPhoneNumber() {
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.click();
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.clear();
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.click();
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit
					.sendKeys(BaseData.getNamesModuleValue("Phone").substring(1, 6));
			Playback.controlReadyThreadWait();
			uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.phoneTab.uIAddButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.nameEntry.phoneTab.uIClearButton.click();
		}

		public void VerifyAcknowledgeUpdatePhoneTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Phones Tab. You must save or reset.");
		}

		public void VerifyInvalidAcknowledgePhoneTab() {
			popup.acknowledge.okWithExpectedMessage("(5037) Invalid phone number");
		}

		public void VerifyExistingPhone(int rowIndex) {

			WebElement uIPhoneCell = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "Phone#", rowIndex);
			verify.ExpectedValueIsTrue(uIPhoneCell.getText().contains(BaseData.getNamesModuleValue("ExistingPhone")));

		}

		public void VerifyAddedPhoneNumber(int rowIndex) {
			WebElement PhoneNumber = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "Phone#", rowIndex);
			verify.ExpectedValueIsTrue(PhoneNumber.getText().contains(BaseData.getNamesModuleValue("DeletePhone")));
		}

		public void DeleteAdddedPhoneNumber() {

			Playback.driver
					.findElement(By.xpath("//td[contains(text(),'(012) 345-6789')]/../td[@class='Delete_Icon_Style']"))
					.click();

		}

		public void VerifyDeletedPhoneNotFound() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount("tabNames_tmpl5_usrusrPhone1_grdPhones") == 1);
		}

		public void VerifyAtPhoneNoInGrid(int rowIndex) {
			String uIPhoneCell = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "Phone#", rowIndex);
			// String uIPhoneHome = uIPhoneCell.Remove(0, 1).Remove(3, 1).Remove(3,
			// 1).Remove(6, 1);
			String uIPhoneHome1 = Randomized.removeCharAt(uIPhoneCell, 0);
			String uIPhoneHome2 = Randomized.removeStringByIndexCount(uIPhoneHome1, 3, 1);
			String uIPhoneHome3 = Randomized.removeStringByIndexCount(uIPhoneHome2, 3, 1);
			String uIPhoneHome = Randomized.removeStringByIndexCount(uIPhoneHome3, 6, 1);
			verify.ExpectedValueIsTrue(uIPhoneHome.contains(BaseData.getNamesModuleValue("PhoneNumber")));
		}

		public void VerifyPhoneTypeAsHome(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Home", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "PhoneType", rowIndex));
		}

		public void VerifyPhoneTypeAsWork(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Work", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "PhoneType", rowIndex));
		}

		public void ClickPhoneTypeAsHomeInGrid() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "Home");
		}

		public void VerifyAtPhoneNo1InGrid(int rowIndex) {
			String uIPhoneCell = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "Phone#", rowIndex);
			String uIPhoneHome1 = Randomized.removeCharAt(uIPhoneCell, 0);
			String uIPhoneHome2 = Randomized.removeStringByIndexCount(uIPhoneHome1, 3, 1);
			String uIPhoneHome3 = Randomized.removeStringByIndexCount(uIPhoneHome2, 3, 1);
			String uIPhoneHome = Randomized.removeStringByIndexCount(uIPhoneHome3, 6, 1);
			verify.ExpectedValueIsTrue(uIPhoneHome.contains(BaseData.getNamesModuleValue("PhoneNumber1")));
		}

		public void verifyEnterMandatoryDataAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void verifyFlagIconIsNotDisplayedInGrid(int rowIndex) {
			String gridCell = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "F", rowIndex).getAttribute("class");
			verify.ExpectedValueIsTrue(!gridCell.contains("flagPhone"));
		}

		public void verifyFlagIconIsDisplayedInGrid(int rowIndex) {
			String Flag = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "F", rowIndex).getAttribute("class");
			verify.ExpectedValueIsTrue(Flag.contains("flag"));

		}

		public void clickFlagIconInGrid(int rowIndex) {
			WebElement flagIcon = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, "F", rowIndex);
			flagIcon.click();

		}

		public void verifyUpdateButtonIsDisplayed() {
			String attribute = uIMapNames.nameEntry.phoneTab.uIAddButton.getAttribute("title");
			verify.ExpectedValueIsTrue(attribute.contains("Update The Data In The Grid"));
		}

			public String getPhoneNoByPhoneTypeInGrid()
			{
				String gridCell = objectIdentification.manualIdentify.getGridCell(uIMapNames.nameEntry.phoneTab.uIPhoneResultTable, BaseData.getNamesModuleValue("PhoneType"), "Phone#").getText();
				return gridCell;
			}
			public void VerifyfieldsCleared() {
				verify.ExpectedValueIsTrue(uIMapNames.nameEntry.phoneTab.uIPhoneNumberEdit.getText().equals(""));

				String selectedItem = objectIdentification.manualIdentify
						.getDropDownSelectedItem(uIMapNames.nameEntry.phoneTab.uIPhoneTypeComboBox);

				System.out.println(selectedItem);
				verify.ExpectedPropertyValueIsEqual("--", selectedItem);

			}

	}

	public class AliasTab {
		public void EnterAtLastName() {
			uIMapNames.nameEntry.alaisTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName").toString());
		}

		public void EnterAtLastNameasFirstName() {
			uIMapNames.nameEntry.alaisTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName").toString());
		}

		public void EnterAtFirstName() {
			uIMapNames.nameEntry.alaisTab.uIFirstNameEdit
					.sendKeys(BaseData.getNamesModuleValue("FirstName").toString());
		}

		public void EnterAtFirstNameasLastName() {
			uIMapNames.nameEntry.alaisTab.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName").toString());

		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.alaisTab.uIAliasAddButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.nameEntry.alaisTab.uIAliasClearButton.click();
		}

		public void VerifyAcknowledgeMainNameCannotBeAdd() {
			popup.acknowledge.okWithExpectedMessage("(6010) The Main name cannot be added as an Alias Name");
		}

		public void VerifyAcknowledgeUpdateAliasTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Alias Tab. You must save or reset.");
		}

		public void VerifyValueGetCleared() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.alaisTab.uILastNameEdit.getText().isEmpty());
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.alaisTab.uIFirstNameEdit.getText().isEmpty());
		}

		public void VerifyAliasNameDeleted() {
			
		List eles =	uIMapNames.nameEntry.alaisTab.uIAliasResultTable.findElements(By.tagName("tr"));
		verify.ExpectedIntergerValueIsEqualToActual(5, eles.size());
		}

		public void VerifyAliasNameAddedToGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount("tabNames_tmpl3_usrAlias1_grdAlias") == 1);
		}

		public void ClickDeleteIcon() {
			uIMapNames.nameEntry.alaisTab.uIDeleteIconGridButton.click();
		}

		public void VerifyAtLastNameFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					BaseData.getNamesModuleValue("LastName") + "," + BaseData.getNamesModuleValue("FirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameEntry.alaisTab.uIAliasResultTable, "Aliases/Nicknames", rowIndex));
		}

		public void VerifyAtName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameEntry.alaisTab.uIAliasResultTable, "Aliases/Nicknames", rowIndex));
		}

		public void VerifyAtAliasesName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("AliasesName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameEntry.alaisTab.uIAliasResultTable, "Aliases/Nicknames", rowIndex));
		}

		public void VerifyAtAliasesName1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("AliasesName1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameEntry.alaisTab.uIAliasResultTable, "Aliases/Nicknames", rowIndex));
		}

		public void VerifyAtAliasesName2(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("AliasesName2"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameEntry.alaisTab.uIAliasResultTable, "Aliases/Nicknames", rowIndex));
		}

		public void VerifySuffixEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.alaisTab.uISuffix.isEnabled());
		}
	}

	public class BusinessTab {
		public void SelectBusinessType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.businessTab.uIBusinessTypeComboBox);
		}

		public void EnterBusinessID() {
			String businessID = Randomized.randomNumberString(3);
			uIMapNames.nameEntry.businessTab.uIBusinessIDEdit.clear();
			uIMapNames.nameEntry.businessTab.uIBusinessIDEdit.sendKeys(businessID);
		}

		public void EnterAsInvalidEmail() {
			uIMapNames.nameEntry.businessTab.uIEmailEdit.clear();
			uIMapNames.nameEntry.businessTab.uIEmailEdit.sendKeys("EmailTest.com");
		}

		public void Save() {
			uIMapNames.nameEntry.businessTab.uIBusinessTabSaveButton.click();
		}

		public void SaveWithConfirm() {
			uIMapNames.nameEntry.businessTab.uIBusinessTabSaveButton.click();
			popup.confirm.yes();
		}

		public void EnterValidEmailId() {
			uIMapNames.nameEntry.businessTab.uIEmailEdit.clear();
			uIMapNames.nameEntry.businessTab.uIEmailEdit.sendKeys("Test@prophoenix.com");
		}

		public void SelectLicenseType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.businessTab.uILicenseTypeComboBox);
		}

		public void EnterLicenseNo() {
			String licenseNo = Randomized.randomAlphanumeric(7);
			uIMapNames.nameEntry.businessTab.uILicenseNumberEdit.sendKeys(licenseNo);
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.businessTab.uIAddButton.click();
		}

		public void EnterAtContactPersonLastName() {
			uIMapNames.nameEntry.businessTab.uIContactPersonLastNameEdit
					.sendKeys(BaseData.getNamesModuleValue("BusinessContactLastName"));
		}

		public void EnterAtContactPersonFirstName() {
			uIMapNames.nameEntry.businessTab.uIContactPersonFirstNameEdit
					.sendKeys(BaseData.getNamesModuleValue("BusinessContactFirstName"));
			uIMapNames.nameEntry.businessTab.uIContactPersonFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void VerifyAcknowledgeEmail() {
			popup.acknowledge.okWithExpectedMessage("(1014) Not a valid Email Address");
		}

		public void VerifyAcknowledgeUpdateBusinessTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Business Tab. You must save or reset.");
		}

		public void VerifyAdditionSccessful() {
			String AdditionMessage = uIMapNames.nameEntry.businessTab.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
		}

		public void VerifyUpdateSuccessfulStatusMessage() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.uIBottomLeftSideStatusBar.getText().contains("1003 - Update Successful"));
		}

		public void EnterAtBusinessID() {
			uIMapNames.nameEntry.businessTab.uIBusinessIDEdit.sendKeys(BaseData.getNamesModuleValue("BusinessID"));
		}

		public void SelectAtState() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameEntry.businessTab.uIStateComboBox,
					BaseData.getNamesModuleValue("State"));
		}

		public void ClickInventoryVendorCheckbox() {
			uIMapNames.nameEntry.businessTab.uIInventoryVentorCheckBox.click();
		}

		public void VerifyAcknowledgeNoDataPresent() {
			popup.acknowledge.okWithExpectedMessage("(7) No data present");
		}

		public void VerifyAtLicenseNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("LicenseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameEntry.businessTab.uILicenseResultTable, "License#", rowIndex));
		}

		public void VerifyAtBusinessID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("BusinessID"),
					uIMapNames.nameEntry.businessTab.uIBusinessIDEdit.getAttribute("value"));
		}

		public void VerifyAcknowledgeValidData() {
			if (Playback.browserType.contains("Chrome"))
				popup.acknowledge.okWithExpectedMessage("Enter valid License No");
			else
				popup.acknowledge.okWithExpectedMessage("Enter valid License#");
		}

		public void verifyHelpDeskVendoxCheckBoxIsSelected() {
			uIMapNames.nameEntry.businessTab.uIHelpDeskVendorCheckBox.isSelected();
		}

	}

	public class NameEntryCommentsTab {
		public void EnterComments() {
			uIMapNames.nameEntry.nameEntryCommentsTab.uISubjectEdit.sendKeys("Automation");
		}

		public void ClickEnterCommentsButton() {
			uIMapNames.nameEntry.nameEntryCommentsTab.uIEnterCommentsButton.click();
		}

		public void VerifyCurrentDate() {
			String commentsDate = uIMapNames.nameEntry.nameEntryCommentsTab.uIDateTextView.getAttribute("value");
			verify.ExpectedPropertyValueIsEqual(commentsDate, Randomized.getCurrentDate());
		}

		public void VerifyMColumn(int rowIndex) {
			WebElement uICommentCell = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.nameEntry.nameEntryCommentsTab.uICommentsResultTable, "M", rowIndex);
			verify.ExpectedValueIsTrue(uICommentCell.getText().contains("*"));
		}

		public void DeleteComments() {
			uIMapNames.nameEntry.nameEntryCommentsTab.uIDeleteIconGridButton.click();

		}

		public void VerifyDeletedCommentsNotFound() {
			// Playback.controlReadyThreadWait();
			// verify.ExpectedValueIsTrue(==0);
			boolean res = objectIdentification.manualIdentify.controlExist(
					Playback.driver.findElement(By.xpath("(//div[@id='grdComments']//tbody//tr)[5]"))); ////div[@id='grdComments']//tbody//tr//tr//tr//td
			verify.ExpectedValueIsFalse(res);
		}

		public void VerifyRowAvailableInGrid() {
			// Playback.controlReadyThreadWait();
			// verify.ExpectedValueIsTrue(==0);
			List<WebElement> ele = Playback.driver
					.findElements(By.xpath("//div[@id='grdComments']//tbody//tr//tr//tr//td"));
			int count = ele.size();
			System.out.println(count);
			verify.ExpectedValueIsTrue(count > 0);

		}

		public void clickDeleteColumnHead() {
			// TODO Auto-generated method stub
			uIMapNames.nameEntry.nameEntryCommentsTab.uIDeleteHeaderIcon.click();
		}

	}

	public class NamesComments {
		public void EnterRichtext() {

			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapNames.namesComments.uICommentsRichTextEdit).click();
			actions.sendKeys(Randomized.randomString(500)).build().perform();
			Playback.waitForControlReady();

		}

		public void Enter100WordsRichText() {

			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapNames.namesComments.uICommentsRichTextEdit).click();
			actions.sendKeys(
					"The Phoenix software’s advanced architecture and design help us in achieving the industry paradigm shift we seek to provide outstanding service to our clients and maintain 100% client satisfaction.  Additionally, our pricing philosophy includes both Perpetual Licensing and Software as a Service (SaaS) options as part of our efforts to offer a higher return on investment.")
					.build().perform();
			Playback.waitForControlReady();

		}

		public void ClickResetButton() {
			uIMapNames.namesComments.uIResetButton.click();
		}

		public void SaveAndCloseScreen() {
			uIMapNames.namesComments.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void Save() {
			uIMapNames.namesComments.uISaveButton.click();
		}

		public void VerifyAdditionSccessful() {
			String AdditionMessage = uIMapNames.namesComments.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}

		public void VerifyCommentStringDisappeard() {
			uIMapNames.namesComments.uICommentsRichTextEdit.click();
			objectIdentification.windowHandle.switchToFrame("javascript");
			String textareaElement = Playback.driver.findElement(By.xpath("//body")).getText();
			verify.ExpectedValueIsTrue(textareaElement.contains(""));

		}

	}

	public class NameEntryContactsTab {

		public void EnterAtContactsLastName() {
			uIMapNames.nameEntry.nameEntryContactsTab.uILastNameEdit
					.sendKeys(BaseData.getNamesModuleValue("ContactlastName"));
		}

		public void EnterAtContactsFirstName() {
			uIMapNames.nameEntry.nameEntryContactsTab.uIFirstNameEdit
					.sendKeys(BaseData.getNamesModuleValue("ContactFirstName"));
			uIMapNames.nameEntry.nameEntryContactsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void SelectActivity() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.nameEntryContactsTab.uIActivityComboBox);
		}

		public void EnterComments() {
			uIMapNames.nameEntry.nameEntryContactsTab.uICommentsEdit.sendKeys("Test for Automation Purpose");
		}

		public void ClickAddbutton() {
			uIMapNames.nameEntry.nameEntryContactsTab.uIAddContactsButton.click();
		}

		public void ClickSave() {
			uIMapNames.nameEntry.nameEntryContactsTab.uIContactsSaveButton.click();
		}

		public void VerifyAcknowledgeUpdateContactsTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Contacts Tab. You must save or reset.");
		}

		public void VerifyAcknowledgeMandatoryFieldsInContactsTab() {
			popup.acknowledge.okWithExpectedMessage("(7) No data present");
		}

		public void VerifyContactTabDisabled() {
			String ContactTabDis = uIMapNames.nameEntry.uIContactsTab.getAttribute("class");
			verify.ExpectedValueIsTrue(ContactTabDis.contains("Dis"));
		}

		public void VerifyAttachmentTabDisabled() {
			String AttachmentsTabDis = uIMapNames.nameEntry.uIAttachmentsTab.getAttribute("class");
			verify.ExpectedValueIsTrue(AttachmentsTabDis.contains("Dis"));
		}

		public void VerifyContactTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIContactsTab.isEnabled());
		}

		public void VerifyAttachmentTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.uIAttachmentsTab.isEnabled());
		}

		public void VerifyUpdateSccessful() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.nameEntryContactsTab.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update Successful"));
			Playback.wait(2000);
		}

		public void EnterAtLastName() {
			uIMapNames.nameEntry.nameEntryContactsTab.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.nameEntry.nameEntryContactsTab.uIFirstNameEdit
					.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.nameEntry.nameEntryContactsTab.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddNew() {
			uIMapNames.nameEntry.nameEntryContactsTab.uIAddNewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SaveContactTab() {
			uIMapNames.nameEntry.nameEntryContactsTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtNameUsingByNameRelation() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameEntry.nameEntryContactsTab.uIContactsTabTable,
									BaseData.getNamesModuleValue("NameRelation"), "Name")
							.getText());
		}

		public void ClickIncludeInactiveCheckbox() {
			uIMapNames.nameEntry.nameEntryContactsTab.uIIncludeInactiveCheckBox.click();
		}
	}

	public class SocialMediaTab {
		public void switchToCriteriaTab() {
			uIMapNames.nameEntry.socialMediaTab.uICriteriaTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmSocialMediaMain");
		}

		public void switchToHistoryTab() {
			uIMapNames.nameEntry.socialMediaTab.uIHistoryTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmSocialMediaHistory");
		}

		public void switchToSitesTab() {
			uIMapNames.nameEntry.socialMediaTab.uISitesTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmSocialMediaSites");
		}

		public void ClickAllTabs() {
			uIMapNames.nameEntry.socialMediaTab.uIHistoryTab.click();
			uIMapNames.nameEntry.socialMediaTab.uISitesTab.click();
			uIMapNames.nameEntry.socialMediaTab.uIAttachmentsTab.click();

		}

		public void VerifyCriteriaTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.socialMediaTab.uICriteriaTab.isEnabled());
			// verify.ExpectedValueIsTrue(uIMapNames.nameEntry.socialMediaTab.uICriteriaTab.GetAttribute("class").Contains("Sel"));
		}

		public void VerifySiteNHistoryTabDisabled() {
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.socialMediaTab.uIHistoryTab.getAttribute("class").contains("Dis"));
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.socialMediaTab.uISitesTab.getAttribute("class").contains("Dis"));
			verify.ExpectedValueIsTrue(
					uIMapNames.nameEntry.socialMediaTab.uIAttachmentsTab.getAttribute("class").contains("Dis"));
		}

		public void VerifySiteNHistoryTabEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.socialMediaTab.uIHistoryTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.socialMediaTab.uISitesTab.isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.nameEntry.socialMediaTab.uIAttachmentsTab.isEnabled());
		}

	}

	public class SocialMediaTabs {
		public CriteriaTab criteriaTab = null;
		public SitesTab sitesTab = null;
		public SocialMediaHistoryTab socialMediaHistoryTab = null;

		public SocialMediaTabs() {
			if ((this.criteriaTab == null)) {
				this.criteriaTab = new CriteriaTab();
			}

			if ((this.sitesTab == null)) {
				this.sitesTab = new SitesTab();
			}

			if ((this.socialMediaHistoryTab == null)) {
				this.socialMediaHistoryTab = new SocialMediaHistoryTab();
			}
		}

		public void ClickAllTabs() {
			uIMapNames.socialMediaTabs.uIHistoryTab.click();
			uIMapNames.socialMediaTabs.uISitesTab.click();
			uIMapNames.socialMediaTabs.uIAttachmentsTab.click();

		}

	}

	public class CriteriaTab {
		public void ClickSaveButton() {
			uIMapNames.socialMediaTabs.criteriaTab.uICriteriaSaveButton.click();
		}

		public void SaveCriteriaTab() {
			uIMapNames.socialMediaTabs.criteriaTab.uICriteriaSaveButton.click();
			// popup.confirm.yes();
		}

		public void ClickFirst2CheckBoxIdentification() {
			uIMapNames.socialMediaTabs.criteriaTab.uIPhotoMatchingBookingCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uIDOBMatchNameCheckBox.click();
		}

		public void ClickAllCheckBoxIdentificarion() {
			uIMapNames.socialMediaTabs.criteriaTab.uIPhotoMatchingBookingCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uIDOBMatchNameCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uINamePostedURLCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uIPhoneNumberLinkedPriorArrestCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uIEmailLinkedPriorArrestCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uITattoosMatchBookingCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uISpecifyOwnValueCheckBox.click();
		}

		public void ClickAllCheckBoxJustification() {
			uIMapNames.socialMediaTabs.criteriaTab.uIKnownGangmemberCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uINameIndicateschkGangAffiliationCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uIAssociatesMultipleGangmemberCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uICriminalPredicateCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uISuspectCriminalInvestigationCheckBox.click();
		}

		public void EnterCaseNo() {
			uIMapNames.socialMediaTabs.criteriaTab.uICaseYearEdit.sendKeys("21");
			uIMapNames.socialMediaTabs.criteriaTab.uICaseYearEdit.sendKeys(Keys.TAB);
			uIMapNames.socialMediaTabs.criteriaTab.uICaseNumberEdit.sendKeys("49");
			uIMapNames.socialMediaTabs.criteriaTab.uICaseNumberEdit.sendKeys(Keys.TAB);
			
			
		}

		public void ClickAddMoreButton() {
			uIMapNames.socialMediaTabs.criteriaTab.uIAddMoreButton.click();
		}

		public void EnterCaseNo2() {
			uIMapNames.socialMediaTabs.criteriaTab.uICaseYear2Edit.sendKeys("21");
			uIMapNames.socialMediaTabs.criteriaTab.uICaseYear2Edit.sendKeys(Keys.TAB);
			uIMapNames.socialMediaTabs.criteriaTab.uICaseNumber2Edit.sendKeys("3");
			uIMapNames.socialMediaTabs.criteriaTab.uICaseNumber2Edit.sendKeys(Keys.TAB);
		}

		public void EnterPhoneNo() {
			uIMapNames.socialMediaTabs.criteriaTab.uIPhoneNumberEdit.click();
			uIMapNames.socialMediaTabs.criteriaTab.uIPhoneNumberEdit.sendKeys(Randomized.randomNumberString(10));
		}

		public void ClickDeleteCaseNo() {
			uIMapNames.socialMediaTabs.criteriaTab.uIDeleteIconButton.click();
		}

		public void EnterWrongEMail() {
			uIMapNames.socialMediaTabs.criteriaTab.uIEmailEdit.sendKeys("rajas@proph");
		}

		public void EntervalidEMail() {
			uIMapNames.socialMediaTabs.criteriaTab.uIEmailEdit.clear();
			uIMapNames.socialMediaTabs.criteriaTab.uIEmailEdit.sendKeys("rajas@prophoenix.com");
		}

		public void EnterSpecifyOwnValue() {
			uIMapNames.socialMediaTabs.criteriaTab.uISpecifyValueEdit.sendKeys(Randomized.randomAlphanumeric(6));
		}

		public void ClickGenerateNoCheckbox() {
			uIMapNames.socialMediaTabs.criteriaTab.uIGenerateNoCheckBox.click();
		}

		public String GetConfidentialSourceId() {
			
			String SourceIDYear=
					uIMapNames.socialMediaTabs.criteriaTab.uIConfidentialSourceIDYearEdit.getAttribute("value");
		
			 String SourceIDNumber=
					uIMapNames.socialMediaTabs.criteriaTab.uIConfidentialSourceIDNumberEdit.getAttribute("value");
			
			
			
			String SourceId = SourceIDYear+"-"+SourceIDNumber;
			System.out.println(SourceId);
			return SourceId;
		
		}

		public void EnterInformationVerifiedOnCurrentDate() {
			uIMapNames.socialMediaTabs.criteriaTab.uIInformationVerifiedOnDateEdit
					.sendKeys(Randomized.getCurrentDate());
			uIMapNames.socialMediaTabs.criteriaTab.uIInformationVerifiedOnDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtInformationverifiedPFCode() {
			uIMapNames.socialMediaTabs.criteriaTab.uIInformationVerifiedByPFEdit
					.sendKeys(BaseData.getNamesModuleValue("PFCode"));
			uIMapNames.socialMediaTabs.criteriaTab.uIInformationVerifiedByPFEdit.sendKeys(Keys.TAB);
		}

		public String GetNextReminderDate( ) {
			
					String ReminderDate = uIMapNames.socialMediaTabs.criteriaTab.uINextReminderDateEdit.getAttribute("value");
			return ReminderDate;
		}

		public void VerifyNextReminderDate() {
			System.out.println(Randomized.getPreviousMonth(3) + "/" + Randomized.getFutureDayNumber1(2) + "/"
							+ Randomized.getFutureYearByNoOfYears(4));
			verify.ExpectedPropertyValueIsEqual(
					Randomized.getPreviousMonth(3) + "/" + Randomized.getFutureDayNumber1(2) + "/"
							+ Randomized.getFutureYearByNoOfYears(4),
					uIMapNames.socialMediaTabs.criteriaTab.uINextReminderDateEdit.getAttribute("value"));
		}

		public void OKWithWebPageAlertWindowMessage() {
			Playback.popupThreadWait();
			verify.ExpectedPropertyValueIsEqual("select items below", Playback.driver.switchTo().alert().getText());
			Playback.popupThreadWait();
			Playback.driver.switchTo().alert().accept();
		}

		public void OKWithWebPageAlertWindowMessage3Items() {
			Playback.popupThreadWait();
			verify.ExpectedPropertyValueIsEqual("select atleast 3 items below",
					Playback.driver.switchTo().alert().getText());
			Playback.popupThreadWait();
			Playback.driver.switchTo().alert().accept();
		}

		public void VerifyAcknowledgeCaseNoMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter Case No / Other No");
		}

		public void VerifyAcknowledgePhoneNoMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter the Phone no");
		}

		public void VerifyAcknowledgeEmailMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter the Email");
		}

		public void VerifyAcknowledgeSpecifyMessage() {
			Playback.popupThreadWait();
			popup.acknowledge.okWithExpectedMessage("(3032) Enter the Specify");
		}

		public void VerifyAcknowledgeValidEmailMessage() {
			popup.acknowledge.okWithExpectedMessage("(1014) Not a valid Email Address");
		}

		public void VerifyConfirmationDeleteMessage() {

			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

//		public void ClickAtCheckBoxInJustification() {																				//Added by Abi
//			
//		}

		public void ClickSuspectedCriminalActivityInJustification() { // Added by Abi
			uIMapNames.socialMediaTabs.criteriaTab.uISuspectCriminalActivityCheckBox.click();
		}

		public void verifyANDIsDisplayed() { // Added by Abi
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.criteriaTab.uIANDText.getText().contains("AND"));
		}

		public void verifySuspectedCriminalActivityIsDisplayed() { // Added by Abi
			verify.ExpectedPropertyValueIsEqual("Suspected Criminal Activity",
					uIMapNames.socialMediaTabs.criteriaTab.uISuspectCriminalActivityCheckBox.getText());
		}

		public void ClickFirst3CheckBoxIdentification() { // Added by Abi
			uIMapNames.socialMediaTabs.criteriaTab.uIPhotoMatchingBookingCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uIDOBMatchNameCheckBox.click();
			uIMapNames.socialMediaTabs.criteriaTab.uINamePostedURLCheckBox.click();
		}

		public void verifyTheCreatedText() { // Added by Abi
			WebElement text = uIMapNames.socialMediaTabs.criteriaTab.uICreatedText;
			verify.ExpectedValueIsTrue(text.getText().contains("(0 days old)"));
			verify.ExpectedValueIsTrue(text.getText().contains(Randomized.getCurrentDate()));
		}

		public String getConfidentialSourceID1() {
			
					String SourceYear = uIMapNames.socialMediaTabs.criteriaTab.uIConfidentialSourceIDYearEdit.getAttribute("value");
		
					String SourceNumber =  uIMapNames.socialMediaTabs.criteriaTab.uIConfidentialSourceIDNumberEdit.getAttribute("value");
					
					String SourceID = SourceNumber + SourceYear;
					
					return SourceID;
			
		}
		public void VerifyConfidentialSourceID(String SourceID) {
			String SourceYear = uIMapNames.socialMediaTabs.criteriaTab.uIConfidentialSourceIDYearEdit.getAttribute("value");
			
			String SourceNumber =  uIMapNames.socialMediaTabs.criteriaTab.uIConfidentialSourceIDNumberEdit.getAttribute("value");
			
			String ConfidentialSourceID = SourceNumber + SourceYear;
			
			
verify.ExpectedPropertyValueIsEqual(SourceID, ConfidentialSourceID);
			
		}
		

		public String getVerfiedOnDate() {
			String VerifiedOnDate = uIMapNames.socialMediaTabs.criteriaTab.uIInformationVerifiedOnDateEdit.getAttribute("value");
			
			System.out.println(VerifiedOnDate);
			return VerifiedOnDate;
			
		}
		

	}

	public class SitesTab {
		public void SelectAtUCAccountName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.socialMediaTabs.sitesTab.uIUCAccountNameComboBox,
					BaseData.getNamesModuleValue("UCAccountName"));
			uIMapNames.socialMediaTabs.sitesTab.uIUCAccountNameComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtFriendStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.socialMediaTabs.sitesTab.uIFriendStatusComboBox,
					BaseData.getNamesModuleValue("FriendStatus"));
		}

		public void EnterNotes() {
			uIMapNames.socialMediaTabs.sitesTab.uINotesEdit
					.sendKeys("Automation Notes Verification");
		}

		public void ClickLaunchBrowserButton() {
			uIMapNames.socialMediaTabs.sitesTab.uILaunchBrowserButton.click();
		}

		public void ClickGplusSocialMediaIcon() {
			uIMapNames.socialMediaTabs.sitesTab.uIMediaTypeIconGplusImageView.click();
		}

		public void EnterUserName() {
			uIMapNames.socialMediaTabs.sitesTab.uIUCUserNameEdit.sendKeys("Automation Test");
		}

		public void ClickAddButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.socialMediaTabs.sitesTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickClearButton() {
			uIMapNames.socialMediaTabs.sitesTab.uIClearButton.click();
		}

		public void ClickSaveButton() {
			uIMapNames.socialMediaTabs.sitesTab.uISaveButton.click();
		}

		public void SaveSitesTab() {
			Playback.controlReadyThreadWait();
			uIMapNames.socialMediaTabs.sitesTab.uISaveButton.click();
			Playback.pageLoadThreadWait();
			popup.confirm.yes();
		}

		public void DeleteByUserName() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable,
					BaseData.getNamesModuleValue("UCUserName"));
			popup.confirm.yes();
		}

		public void VerifyAtURL() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("URL"),
					uIMapNames.socialMediaTabs.sitesTab.uIEnterURLEdit.getAttribute("value"));
		}

		public void VerifyAtUCUserName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("UCUserName"),
					uIMapNames.socialMediaTabs.sitesTab.uIUCUserNameEdit.getAttribute("value"));
		}

		public void VerifyAtSiteID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("SiteID"),
					uIMapNames.socialMediaTabs.sitesTab.uISiteIDNoEdit.getAttribute("value"));
		}

		public void VerifyAtMediaTypeStatus() {
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.sitesTab.uISelectedsocialMediaDescriptionTextView
					.getText().contains(BaseData.getNamesModuleValue("MediaType")));
		}

		public void VerifyAcknowledgeUpdateMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Sites Tab. You must save or reset.");
		}

		public void VerifyMediaTypeAddedGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MediaType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable, "UC Account Name",
							rowIndex));
		}

		public void VerifyUserNameAddedGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Automation Test",
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable, "Target User Name",
							rowIndex));
		}

		public void VerifySiteIDAddedGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("SiteID"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable, "Site ID#", rowIndex));
		}

		public void VerifyFriendStatusAddedGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("FriendStatus"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable, "Friend Status",
							rowIndex));
		}

		public void VerifyUCAccountNameAddedGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("UCAccountName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable, "UC Account Name",
							rowIndex));
		}

		public void VerifyMediaTypeDeletedGrid() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable) == 0);
		}

		public void VerifyAcknowledgeMediaTypeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter the Media Type");
		}

		public void VerifyAcknowledgeUserNameMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter the User Name");
		}

		public void enterAtURL() {
			uIMapNames.socialMediaTabs.sitesTab.uIEnterURLEdit.sendKeys(BaseData.getNamesModuleValue("URL"));
			
		}

		public void ClickAtUserName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable, 
					BaseData.getNamesModuleValue("UCUserName"));
			
		}

		public void verifyNotesAddedInGrid(int rowIndex) {
			 String Notes = objectIdentification.manualIdentify.getGridCell(uIMapNames.socialMediaTabs.sitesTab.uISocialMediaTabResultTable, "Notes", rowIndex).getText();
			verify.ExpectedPropertyValueIsEqual(Notes, "Automation Notes Verification");
			
		}

		public void clickUpdateButton() {
			uIMapNames.socialMediaTabs.sitesTab.uIUpdateButton.click();
			
		}

		public void enterSitesId() {
			uIMapNames.socialMediaTabs.sitesTab.uISiteIDNoEdit.sendKeys(BaseData.getNamesModuleValue("SiteID"));
			
		}

		public void verifySitesTabUpdateSuccessfulBottomMessage() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapNames.socialMediaTabs.sitesTab.SitesTabBottomStatusBar.getText(), "1003 - Update Successful");
		
			
		}
		public void verifySitesTabAdditionsuccessfulBottomMessage() {
			verify.ExpectedPropertyValueIsEqual(
					uIMapNames.socialMediaTabs.sitesTab.SitesTabBottomStatusBar.getText(),"1002 - Addition Successful");
		}

		public void verifyGoolePlusScreenLoaded() {
			uIMapNames.socialMediaTabs.sitesTab.uIGooglePlusLoginButton.isDisplayed();
			
		}

	}

	public class SocialMediaHistoryTab {
		public void EnterUpdatedDateandTime() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIUpdatedDateEdit.sendKeys(Keys.TAB);
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIUpdatedTimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterUpdatedByPF() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIUpdatedByPFEdit
					.sendKeys(BaseData.getNamesModuleValue("UserName"));
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIUpdatedByPFEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtNotes() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uINotesEdit
					.sendKeys(BaseData.getNamesModuleValue("Notes"));
		}

		public void ClickReset28CFRVerificationDateCheckBox() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIReset28CFRVerificationDate.click();
		}

		public void EnterAtUpdatedNotes() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIEditNotesEdit.click();
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIEditNotesEdit.clear();
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIEditNotesEdit
					.sendKeys(BaseData.getNamesModuleValue("Notes1"));
		}

		public void ClickSaveButton() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uISaveButton.click();
		}

		public void SaveUpdatePopupscreen() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uISaveUpdateButton.click();
		}

		public void ClickEditIcon() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIEditButtonHistoryGridTable.click();
		}

		public void DeleteUpdatedNotes() {
			uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIDeleteButtonHistoryGridTable.click();
			popup.confirm.yes();
		}

		public void VerifyAtNotesAdded() {
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains(BaseData.getNamesModuleValue("Notes")));
		}

		public void VerifyAtUpdatedNotesAdded() {

			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains(BaseData.getNamesModuleValue("Notes1")));
		}

		public void VerifyAtUpdatedNotesRemoved() {
			verify.ExpectedValueIsFalse(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains(BaseData.getNamesModuleValue("Notes1")));
		}

		public void VerifyEditAndDeleteIconViewed() {
			verify.ExpectedValueIsTrue(
					uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIEditButtonHistoryGridTable.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIDeleteButtonHistoryGridTable.isDisplayed());
		}

		public void VerifySiteDetailsInGrid() {

			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains(BaseData.getNamesModuleValue("URL").toString()));
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains(BaseData.getNamesModuleValue("MediaType").toString()));
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains(BaseData.getNamesModuleValue("FriendStatus").toString()));

		}

		public void VerifyAs28CFRVerification() {
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains("28 CFR Verification"));
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaTabs.socialMediaHistoryTab.uIHistoryTabResultTable
					.getText().contains(BaseData.getNamesModuleValue("UserName")));
		}

	}

	public class DNATab {
		public void ClickInternalSaveButton() {
			uIMapNames.nameEntry.dNATab.uIInternalSaveButton.click();
		}

		public void InternalSave() {
			uIMapNames.nameEntry.dNATab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void ClickAddButton() {
			uIMapNames.nameEntry.dNATab.uIAddButton.click();
		}

		public void EnterAtCaseNo() {
			uIMapNames.nameEntry.dNATab.uICaseNumberEdit.sendKeys(BaseData.getNamesModuleValue("CaseNo"));
		}

		public void ClickSampleCollectedYes() {
			uIMapNames.nameEntry.dNATab.uISampleCollectedYesRadioButton.click();
		}

		public void SelectReason() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.nameEntry.dNATab.uIReasonCollectedComBoBox);
		}

		public void EnterAtCollectedByPFCode() {
			uIMapNames.nameEntry.dNATab.uICollectedByPFNumberEdit.sendKeys(BaseData.getNamesModuleValue("PFCode"));
			uIMapNames.nameEntry.dNATab.uICollectedByPFNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterCollectionDateAndTime() {
			uIMapNames.nameEntry.dNATab.uICollectionDateEdit.sendKeys(Keys.TAB);
			uIMapNames.nameEntry.dNATab.uICollectionTimeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyCaseNoAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(30033) Enter Case No");
			} else
				popup.acknowledge.okWithExpectedMessage("(30033) Enter Case#");
		}

		public void VerifyNoDataPresentAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(7) No data present");
		}

		public void VerifySampleCollectedAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30040) Choose Sample Collected");
		}

		public void VerifyReasonAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30040) Choose Reason Collected");
		}

		public void VerifyCollectedByAcknowledgeMessage() {
			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(30033) Enter Collected By PF No");
			} else
				popup.acknowledge.okWithExpectedMessage("(30033) Enter Collected By PF#");
		}

		public void VerifyCollectionDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Collection Date");
		}

		public void VerifyInternalDNAUpdateAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(30111) Updated data exists in the Tab. You must Add/Update or Clear.");
		}

		public void VerifyDNATabUpdateAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the DNA Tab. You must save or reset.");
		}

		public void VerifyAtCaseNumberInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("CaseNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.nameEntry.dNATab.uIDNAResultGrid, "Case#", rowIndex));
		}

		public void VerifyCollectionDateAsCurrentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.dNATab.uIDNAResultGrid, "Collection Date", rowIndex));
		}

		public void VerifyBottomStatusMessage() {
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful",
					uIMapNames.nameEntry.dNATab.uIBottomLeftSideStatusBar.getText());
		}
	}

	public class NameEntryHistoryTab {
		public void ClickDateViewRadioButton() {
			uIMapNames.nameEntry.nameEntryHistoryTab.uIDateViewRadioButton.click();
		}

		public void ClickExpandIcon() {
			uIMapNames.nameEntry.nameEntryHistoryTab.uIExpandRowButton.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickExpandIcon1Row() {
			uIMapNames.nameEntry.nameEntryHistoryTab.uIExpandRow1Button.click();
			Playback.gridLoadThreadWait();
		}

		public void VerifyDateAsCurrentDate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.nameEntryHistoryTab.uIHistoryPhoneResultGrid, "Date",
							rowIndex)
					.contains(Randomized.getCurrentDate()));
		}

		public void VerifyKeyValueAsAddedPhone(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.nameEntryHistoryTab.uIHistoryPhoneResultGrid,
							"Key Value", rowIndex)
					.contains("Added Header Phone Number"));
		}

		public void VerifyKeyValueAsAddedTabPhone(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.nameEntry.nameEntryHistoryTab.uIHistoryPhoneResultGrid,
							"Key Value", rowIndex)
					.contains("Tab Phone Number"));
		}
	}

	public class NameEntryVehicleTab {
		public void SelectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.nameEntry.nameEntryVehicleTab.uIActivityComboBox,
					BaseData.getNamesModuleValue("Activity"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtActivityInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Activity"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.nameEntry.nameEntryVehicleTab.uIVehicleTabResultTable, "Activity",
									rowIndex)
							.getText());
		}
	}

	public class NameEntryMJTab {
		public void verifyAtFromNameInGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameEntry.nameEntryMJTab.uIMJTable, "From Name");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Name")));
		}

		public void verifyAtActionInGrid() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.nameEntry.nameEntryMJTab.uIMJTable, "Action");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Action")));
		}
	}

	public class NameMining {
		public void ClickPrintButton() {
			uIMapNames.nameMining.uIPrintButton.click();
		}

		public void ClickFitButton() {
			uIMapNames.nameMining.uIFitButton.click();
		}

		public void ClickZoominButton() {
			uIMapNames.nameMining.uIZoomInButton.click();
		}

		public void ClickZoomOutButton() {
			uIMapNames.nameMining.uIZoomOutButton.click();
		}

		public void ClickFullZoomButton() {
			uIMapNames.nameMining.uIFullZoomButton.click();
		}

		public void CloseNameMiningScreen() {
			uIMapNames.nameMining.driver.close();
		}

		public void VerifyNameMiningButtonsEnabled() {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(uIMapNames.nameMining.uIFitButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.nameMining.uIFullZoomButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.nameMining.uIZoomInButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.nameMining.uIZoomOutButton.isEnabled());
		}
	}

	public class ArrestEntry {

		public void Save() {
			Playback.pageLoadThreadWait();
			uIMapNames.arrestEntry.uISaveButton.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();

		}

		public void SaveNCloseScreen() {
			Playback.pageLoadThreadWait();
			uIMapNames.arrestEntry.uISaveCloseButton.click();
			popup.confirm.yes();

		}

		public void saveScreen() {
			Playback.pageLoadThreadWait();
			uIMapNames.arrestEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void Reset() {

			uIMapNames.arrestEntry.uIResetButton.click();

		}

		public void closeTheScreen() {

			uIMapNames.arrestEntry.driver.close();

		}

		public void switchToArrestTab() {
			uIMapNames.arrestEntry.uIArrestTab.click();
			Playback.controlReadyThreadWait();

		}

		public void switchToChargeTab() {
			names.switchToArrestEntry();
			Playback.wait(3000);
			WebElement coll = Playback.driver.findElement(By.id("tabBooking"));
			List<WebElement> tabs = coll.findElements(By.xpath("//span[contains(text(),'Charge')]"));
			for (WebElement item : tabs) {
				if (item.isDisplayed()) {
					item.click();
					break;
				}
			}
		}

		public void switchToQAFormsTab() {
			uIMapNames.arrestEntry.uIQAFormsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmQuestionnaire.aspx");
		}

		public void switchToCommentsTab() {
			uIMapNames.arrestEntry.uICommentsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void switchToStatementTab() {

			uIMapNames.arrestEntry.uIStatementTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTextMgrEx");
		}

		public void switchToChargingConfTab() {

			uIMapNames.arrestEntry.uIChargingConfTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmDAChargeConf");
		}

		public void switchToDispositionTab() {
			uIMapNames.arrestEntry.uIDispositionTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmDisposition");
		}

		public void switchToPersonalDataTab() {
			uIMapNames.arrestEntry.uIPersonalDataTab.click();

		}

		public void switchToCellTab() {
			uIMapNames.arrestEntry.uICellTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmJailCell");
		}

		public void enterAtNameID() {

			uIMapNames.arrestEntry.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void EnterNameID(String nameID) {
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(nameID);
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void SelectNameAtLastName() {

			uIMapNames.arrestEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void SelectNameID() {
			uIMapNames.arrestEntry.uINameTypeEdit.sendKeys("A");
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Randomized.randomNumberString(6));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterLastNameAtWarrantLastName() {
			uIMapNames.arrestEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantLastName"));
		}

		public void EnterFirstNameAtWarrantFirstName() {
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantFirstName"));
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void ClickNameInfoButton() {
			Playback.threadWait(5000);
			objectIdentification.actionBuilder.Click(uIMapNames.arrestEntry.uINameInfoButton);
			uIMapNames.arrestEntry.uINameInfoButton.click();

		}

		public void VerifyAtNameID() {
			Assert.assertEquals(BaseData.getNamesModuleValue("NameID").substring(0, 1).toString(),
					uIMapNames.arrestEntry.uINameTypeEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getNamesModuleValue("NameID").substring(2).toString(),
					uIMapNames.arrestEntry.uINameIDEdit.getAttribute("value"));

		}

		public void VerifyAtLastName() {
			Assert.assertEquals(BaseData.getNamesModuleValue("LastName").toString(),
					uIMapNames.arrestEntry.uILastNameEdit.getAttribute("value"));
		}

		public void VerifyAtFirstName() {
			Assert.assertEquals(BaseData.getNamesModuleValue("FirstName").toString(),
					uIMapNames.arrestEntry.uIFirstNameEdit.getAttribute("value"));

		}

		public void verifyBookingNameRequiredMessage() {

			popup.acknowledge.okWithExpectedMessage("(6501) Booking Name is Required");
		}

		public void VerifyInvalidNameIDMessage() {
			popup.acknowledge.okWithExpectedMessage("(6020) Invalid Name ID");

		}

		public void verifyInvalidCaseNoOrReqiredMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(6502) Invalid Case No or Case No is Required");
			} else
				popup.acknowledge.okWithExpectedMessage("(6502) Invalid Case# or Case# is Required");
			Playback.controlReadyThreadWait();
		}

		public void VerifyWarrantIconButton() {
			verify.ExpectedValueIsTrue(
					uIMapNames.arrestEntry.uIWarrantIconButton.getAttribute("src").contains("warrant"));
		}

		public void VerifyArrestDateAndTimeRequiredMessage() {
			popup.acknowledge.okWithExpectedMessage("(6503) Arrest Date and Time is Required");
		}

		public void ClickArrestEntryImageView() {
			uIMapNames.arrestEntry.uIArrestEntryImageView.click();
		}

		public void ClickALCIcon() {
			uIMapNames.arrestEntry.uIALCButton.click();
		}

		public void VerifyBottomStatus() {
			verify.ExpectedPropertyValueIsEqual("1002 - Addition Successful",
					uIMapNames.arrestEntry.uIBottomLeftSideStatusBar.getText());
		}

		public void verifyBioMetricIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIBioMetricIcon.isDisplayed());
		}

		public void verifyEACCSubmissionIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIEACCSubmissionIcon.isDisplayed());
		}

		public void verifyMugsearchIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIMugSearchIcon.isDisplayed());
		}

		public void verifyPictureInterfaceIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIPictureInterfaceIcon.isDisplayed());
		}

		public void verifySendDataToPreBookingQueueIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uISendDataToPreBookingQueueIcon.isDisplayed());
		}

		public void verifyExpungementIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIExpungementIcon.isDisplayed());
		}

		public void clickExpungementIcon() {
			uIMapNames.arrestEntry.uIExpungementIcon.click();
		}

		public void VerifyAtArrestNo() {
			Assert.assertEquals(BaseData.getNamesModuleValue("ArrestNo").substring(0, 2).toString(),
					uIMapNames.arrestEntry.uIArrestYearEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getNamesModuleValue("ArrestNo").substring(3).toString(),
					uIMapNames.arrestEntry.uIArrestNumberEdit.getAttribute("value"));

		}

		public void GetArrestNo(String arrestYear, String arrestNo) {
			Playback.testContext.setAttribute("arrestYear",
					uIMapNames.arrestEntry.uIArrestYearEdit.getAttribute("value"));
			Playback.testContext.setAttribute("arrestNo",
					uIMapNames.arrestEntry.uIArrestNumberEdit.getAttribute("value"));
		}

		public void VerifyOffenderIDAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - Offender ID");
			} else
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - Offender ID");
		}

		public void VerifyUpdateStatementAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage(
						"(1051) Updated data exists in the  Statement  Tab. You must save or reset.");
			} else
				popup.acknowledge.okWithExpectedMessage(
						"(1051) Updated data exists in the Statement Tab. You must save or reset.");

		}

		public void EnterAtLastName() {
			uIMapNames.arrestEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void TabFirstName() {
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void VerifyPopupAtCharge(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Charge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.arrestEntry.uIPopupCopyChargeGridTable, "Charge", rowIndex));
		}

		public void ClickPopupAtChargeInGrid() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.arrestEntry.uIPopupCopyChargeGridTable, BaseData.getNamesModuleValue("Charge"));
		}

		public void ClickPopupCopyButton() {
			uIMapNames.arrestEntry.uIPopupChargeCopyButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickPopupGridCheckboxUsingAtCharge() {
			Playback.controlReadyThreadWait();
			Playback.gridLoadThreadWait();
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.arrestEntry.uIPopupCopyChargeGridTable, BaseData.getNamesModuleValue("Charge"));
		}

		public void ClickPopupCloseButton() {
			uIMapNames.arrestEntry.uIPopupCaseCloseButton.click();
		}

		public void EnterAtFirstName() {
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void ClickAllTabs() {
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.uIArrestTab.click();
			uIMapNames.arrestEntry.uIChargeTab.click();
			uIMapNames.arrestEntry.uIReleaseTab.click();
			uIMapNames.arrestEntry.uIPersonalDataTab.click();
			uIMapNames.arrestEntry.uIDispositionTab.click();
			uIMapNames.arrestEntry.uIMedicalTab.click();
			uIMapNames.arrestEntry.uICommentsTab.click();
			uIMapNames.arrestEntry.uIStatementTab.click();
			uIMapNames.arrestEntry.uIChargingConfTab.click();
			uIMapNames.arrestEntry.uICellTab.click();
			uIMapNames.arrestEntry.uIMapTab.click();
		}

		public void VerifyCasePopupAtName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.arrestEntry.uIPopupCaseGridTable, "Name", rowIndex));
		}

		public void VerifyCasePopupAtName1(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name1"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.arrestEntry.uIPopupCaseGridTable, "Name", rowIndex));
		}

		public void ClickAtName1InPopupGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.arrestEntry.uIPopupCaseGridTable, BaseData.getNamesModuleValue("Name1"));
		}

		public void VerifyNameTypeAndID(String nameType, String nameID) {
			verify.ExpectedPropertyValueIsEqual(nameType, uIMapNames.arrestEntry.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(nameID, uIMapNames.arrestEntry.uINameIDEdit.getAttribute("value"));
		}

		public void VerifyAtLastNameAndFirstNameJunvenileColor() {
			verify.ExpectedValueIsTrue(
					uIMapNames.arrestEntry.uILastNameEdit.getAttribute("style").contains("color: red"));
			verify.ExpectedValueIsTrue(
					uIMapNames.arrestEntry.uIFirstNameEdit.getAttribute("style").contains("color: red"));
		}

		public void VerifyOTypeNameAcknownledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6079) The selected name Type cannot be added");
		}

		public void ClearNameIDFields() {
			uIMapNames.arrestEntry.uINameTypeEdit.clear();
			uIMapNames.arrestEntry.uINameIDEdit.clear();
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void switchToAttachmentTab() {

			uIMapNames.arrestEntry.uIAttachmentsTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void switchToAttachmentTabWithData() {

			uIMapNames.arrestEntry.uIAttachmentsWithDataTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void ClickPopupGridCheckboxUsingAtCharge1() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.arrestEntry.uIPopupCopyChargeGridTable, BaseData.getNamesModuleValue("Charge1"));
		}

		public void switchToApprovalTab() {
			uIMapNames.arrestEntry.uIApprovalTab.click();
			Playback.waitForPageLoad();
			objectIdentification.windowHandle.switchToFrame("frmPnxGlobalApproval");
		}

		public void VerifyStatusAsSubmitted() {
			verify.ExpectedPropertyValueIsEqual("Submitted", uIMapNames.arrestEntry.uIArrestStatusText.getText());
		}

		public void EnterAtHNameID() {

			uIMapNames.arrestEntry.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("HNameID").substring(0, 1));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("HNameID").substring(2));

			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void VerifyInvalidNameAcknowledgemessage() {
			popup.acknowledge.okWithExpectedMessage("(6020) Invalid Name ID");
		}

		public void EnterAtNameID1() {

			uIMapNames.arrestEntry.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID1").substring(0, 1));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID1").substring(2));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void VerifyStatusAsApproved() {
			verify.ExpectedPropertyValueIsEqual("Approved", uIMapNames.arrestEntry.uIArrestStatusText.getText());
		}

		public void selectallChrageCheckPopup() {
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
			WebElement element = objectIdentification.manualIdentify
					.getGridHeaderTableCheckBox(uIMapNames.arrestEntry.uIPopupCopyChargeGridTable);
			element.click();
		}

		public void verifyStatusInPopupGrid(int rowIndex) {
			String actual = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.arrestEntry.uIPopupCopyChargeGridTable, "Status", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Status"), actual);
		}

		public void switchToEmpSchoolTab() {
			uIMapNames.arrestEntry.uIEmpSchoolTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("Booking/frmBookingContact.aspx?");
			Playback.controlReadyThreadWait();

		}

		public void clickReleaseTab() {
			uIMapNames.arrestEntry.uIReleaseTab.click();
		}

		public void VerifyMinimumOneChargeIsRequiredAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6514) Minimum One Charge is Required");
		}

		public void verifySchoolAttendenceInformationAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge
						.okWithExpectedMessage("(6122) School attendance information is required in the Release tab");
			}

			else {
				popup.switchToAcknowledge();
				Playback.gridLoadThreadWait();
				popup.acknowledge
						.okWithExpectedMessage("(6122) School attendance information is required in the Release tab");
			}
		}

		public void verifyMedicalTabIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIMedicalTab.isDisplayed());
		}

		public void verifyAssociatesTabIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIAssociatesTab.isDisplayed());
		}

		public void verifyCommentsTabIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uICommentsTab.isDisplayed());
		}

		public void verifyStatementTabIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIStatementTab.isDisplayed());
		}

		public void verifyAttachmentsTabIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIAttachmentsTab.isDisplayed());
		}

		public void verifyMapTabIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIMapTab.isDisplayed());
		}

		public void verifyApprovalTabIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.uIApprovalTab.isDisplayed());
		}

		public void enterAtJNameID() {

			uIMapNames.arrestEntry.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("JNameID").substring(0, 1));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("JNameID").substring(2));
			uIMapNames.arrestEntry.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void clickPopupChargeCancelButton() {
			uIMapNames.arrestEntry.uIPopupChargeCancelButton.click();
		}

		public void enterAtLastName1() {
			uIMapNames.arrestEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName1"));
		}

		public void enterAtFirstName1() {
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName1"));
			uIMapNames.arrestEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public String readArrestNo() {
			String arrestYr = uIMapNames.arrestEntry.uIArrestYearEdit.getAttribute("value");
			String arrestNumber = uIMapNames.arrestEntry.uIArrestNumberEdit.getAttribute("value");
			String arrestNo = arrestYr + "-" + arrestNumber;
			return arrestNo;
		}

		public void clickPrintIcon() {
			uIMapNames.arrestEntry.uIPrintButton.click();
		}

		public void closeCallActivitiesPopupIfExist() {
			try {
				uIMapNames.arrestEntry.uIPopupCaseCloseButton.click();
			} catch (Exception e) {
				switchToArrestEntry();
			}
		}
		public void verifyUpdateSucessfulStatusMsg() {
			Playback.gridLoadThreadWait();

			String text = uIMapNames.arrestEntry.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1003 - Update Successful");

			// switchToReportStatusTextMgmtScreen();

		}
		public void verifyAdditionSucessfulStatusMsg() {
			Playback.gridLoadThreadWait();
			String text = uIMapNames.arrestEntry.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual(text, "1002 - Addition Successful");

		}
		public ArrestEntry() {

			if ((this.arrestTab == null)) {
				this.arrestTab = new ArrestTab();
			}

			if ((this.medicalTab == null)) {
				this.medicalTab = new MedicalTab();
			}

			if ((this.chargeTab == null)) {
				this.chargeTab = new ChargeTab();
			}

			if ((this.dispositionTab == null)) {
				this.dispositionTab = new DispositionTab();
			}

			if ((this.releaseTab == null)) {
				this.releaseTab = new ReleaseTab();
			}

			if ((this.personalDataTab == null)) {
				this.personalDataTab = new PersonalDataTab();
			}

			if ((this.associatesTab == null)) {
				this.associatesTab = new AssociatesTab();
			}

			if ((this.arrestEntryCommentsTab == null)) {
				this.arrestEntryCommentsTab = new ArrestEntryCommentsTab();
			}

			if ((this.statementTab == null)) {
				this.statementTab = new StatementTab();
			}

			if ((this.chargingConfTab == null)) {
				this.chargingConfTab = new ChargingConfTab();
			}

			if ((this.attachmentsTab == null)) {
				this.attachmentsTab = objectIdentification.new AttachmentsTab();
			}

			if ((this.arrestEntryMapTab == null)) {
				this.arrestEntryMapTab = new ArrestEntryMapTab();
			}

			if ((this.healthTab == null)) {
				this.healthTab = new HealthTab();
			}

			if ((this.arrestEntryQAFormsTab == null)) {
				this.arrestEntryQAFormsTab = new ArrestEntryQAFormsTab();
			}

			if ((this.arrestEntryCellTab == null)) {
				this.arrestEntryCellTab = new ArrestEntryCellTab();
			}
			if ((this.arrestEntryApprovalTab == null)) {
				this.arrestEntryApprovalTab = new ArrestEntryApprovalTab();
			}

			if ((this.arrestEntryEmpSchoolTab == null)) {
				this.arrestEntryEmpSchoolTab = new ArrestEntryEmpSchoolTab();
			}
		}

		public ArrestTab arrestTab = null;
		public MedicalTab medicalTab = null;
		public ChargeTab chargeTab = null;
		public DispositionTab dispositionTab = null;
		public ReleaseTab releaseTab = null;
		public PersonalDataTab personalDataTab = null;
		public AssociatesTab associatesTab = null;
		public ArrestEntryCommentsTab arrestEntryCommentsTab = null;
		public StatementTab statementTab = null;
		public ChargingConfTab chargingConfTab = null;
		public AttachmentsTab attachmentsTab = null;
		public ArrestEntryMapTab arrestEntryMapTab = null;
		public HealthTab healthTab = null;
		public ArrestEntryQAFormsTab arrestEntryQAFormsTab = null;
		public ArrestEntryCellTab arrestEntryCellTab = null;
		public ArrestEntryApprovalTab arrestEntryApprovalTab = null;
		public ArrestEntryEmpSchoolTab arrestEntryEmpSchoolTab = null;
	

	}

	public class ArrestTab {

		public void EnterAtCaseNo1() {
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo1").substring(0, 2));
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo1").substring(3));
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void enterAtCaseNo() {
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(0, 2));
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(3));
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void clickCaseInfoButton() {
			uIMapNames.arrestEntry.arrestTab.uICaseInfoIcon.click();
		}

		public void tabTheArrestDateAndTime() {
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.click();
			uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.arrestTab.uIArrestTimeEdit.sendKeys(Keys.TAB);
		}

		public void ClearArrestDate() {
			uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.clear();
		}

		public void ClearArrestTime() {
			uIMapNames.arrestEntry.arrestTab.uIArrestTimeEdit.clear();
		}

		public void EnterArrestDateAsCurrentDate() {
			uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.arrestTab.uIArrestTimeEdit.sendKeys(Keys.TAB);
		}

		// public void EnterArrestTimeAs2MinsLaterFromCurrentTime()
		// {
		// uIMapNames.arrestEntry.arrestTab.uIArrestTimeEdit.sendKeys(Randomized.GetFutureTimeByMinutes(2));
		// }

		public void selectAtHow() {
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.arrestTab.uIHowComboBox.sendKeys(BaseData.getNamesModuleValue("How"));
		}

		public void SelectAtArmed() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.arrestTab.uIArmedComboBox,
					BaseData.getNamesModuleValue("Armed"));
		}

		public void SelectAtJuvenileStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.arrestTab.uIJuvenileStatusComboBox,
					BaseData.getNamesModuleValue("JuvenileStatus"));
		}

		public void SelectAtArmed1() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.arrestTab.uIArmed1ComboBox,
					BaseData.getNamesModuleValue("Armed1"));
		}

		public void selectArmed() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.arrestEntry.arrestTab.uIArmedComboBox);
		}

		public void SelectSupervisor() {
			uIMapNames.arrestEntry.arrestTab.uISupervisorlupButton.click();
			Playback.wait(3000);
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void tabTheBookingDateAndTime() {
			uIMapNames.arrestEntry.arrestTab.uIBookingDateEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.arrestTab.uIBookingTimeEdit.sendKeys(Keys.TAB);

		}

		public void EnterBookingDateAndTime() {
			uIMapNames.arrestEntry.arrestTab.uIBookingDateEdit.sendKeys(Keys.TAB);
			// uIMapNames.arrestEntry.arrestTab.uIBookingTimeEdit.sendKeys(Randomized.GetFutureTimeByMinutes(3));

		}

		public void VerifyFutureYearNotAllowed() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(1035) Future Year not allowed");
			popup.acknowledge.ok();

		}

		public void VerifyCaseNumberDoesNotExit() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(1040) Number Does Not Exist");
		}

		public void VerifyAtCaseNo() {
			Assert.assertEquals(BaseData.getNamesModuleValue("CaseNo").substring(0, 2),
					uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.getAttribute("value"));
			Assert.assertEquals(BaseData.getNamesModuleValue("CaseNo").substring(3),
					uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.getAttribute("value"));
		}

		public void VerifyIncidentLocation() {
			Assert.assertEquals(BaseData.getNamesModuleValue("IncidentLocation").toString(),
					uIMapNames.arrestEntry.arrestTab.uIIncidentLocationEdit.getAttribute("value"));

		}

		public void VerifyAtOfficer1() {

			uIMapNames.arrestEntry.arrestTab.uIOfficer1Edit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.arrestTab.uIOfficer1Edit.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Officer1"),
					uIMapNames.arrestEntry.arrestTab.uIOfficer1Edit.getAttribute("value"));
		}

		public void VerifyHowIsRequiredAcknowledgemessage() {
			popup.acknowledge.okWithExpectedMessage("(6506) How Arrested is Required");
		}

		public void VerifyArmedIsRequired() {
			popup.acknowledge.okWithExpectedMessage("(6524) Armed is required");
		}

		public void ClearCase() {
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.clear();
		}

		public void EnterCaseNumber() {
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(String.valueOf(Randomized.getRandomNumbers(6)));
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(Keys.TAB);
			Playback.threadWait();
		}

		public void EnterFutureCaseYear() {
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit
					.sendKeys(Randomized.getFutureYearByNoOfYears(2).substring(2));
		}

		public void EnterCurrentCaseYear() {
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.click();
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.sendKeys(Keys.TAB);
		}

		public void TabFromCaseNumber() {
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(Keys.TAB);

		}

		public void selectHow() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.arrestEntry.arrestTab.uIHowComboBox);
		}

		public void ClickOffenderIDText() {
			uIMapNames.arrestEntry.arrestTab.uIOffenderIDText.click();
		}

		public void VerifyOffenderIDMandatory() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.arrestTab.uIOffenderIDText.getAttribute("kpifieldusage")
					.contains("Mandatory"));
		}

		public void EnterAtOffenderID() {
			uIMapNames.arrestEntry.arrestTab.uIOffenderIDEdit.sendKeys(BaseData.getNamesModuleValue("Offender"));
		}

		public void EnterOffenderID() {
			uIMapNames.arrestEntry.arrestTab.uIOffenderIDEdit.sendKeys(Randomized.randomNumberString(3));
		}

		public void EnterOffenderIDAsSpace() {
			uIMapNames.arrestEntry.arrestTab.uIOffenderIDEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uIOffenderIDEdit.sendKeys(Keys.SPACE);
			uIMapNames.arrestEntry.arrestTab.uIOffenderIDEdit.sendKeys(Keys.SPACE);
		}

		public void enterAtOfficer1() {
			uIMapNames.arrestEntry.arrestTab.uIOfficer1Edit.sendKeys(BaseData.getNamesModuleValue("Officer1"));
			uIMapNames.arrestEntry.arrestTab.uIOfficer1Edit.sendKeys(Keys.TAB);
		}

		public void selectOfficer1ID() {
			uIMapNames.arrestEntry.arrestTab.uIOfficer1lupSrchButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void VerifyArrestDateAndTimeAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("(6503) Arrest Date and Time is Required");
		}

		public void SelectHowAsAttemptedArrest() {
			uIMapNames.arrestEntry.arrestTab.uIHowComboBox.sendKeys("Attempted to Arrest");
			uIMapNames.arrestEntry.arrestTab.uIHowComboBox.sendKeys(Keys.TAB);
		}

		public void EnterCaseNo(String CaseYear, String CaseNumber) {
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.sendKeys(CaseYear);
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(CaseNumber);
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void SelectCase() {
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.arrestTab.uICaselupSearchButton.click();
			Playback.threadWait();
			Playback.controlReadyThreadWait();

		}

		public void enterAtIncidentLocation() {
			uIMapNames.arrestEntry.arrestTab.uIIncidentLocationEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uIIncidentLocationEdit
					.sendKeys(BaseData.getNamesModuleValue("IncidentLocation"));
			uIMapNames.arrestEntry.arrestTab.uIIncidentLocationEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestSearch.uIIncidentLocationVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void tabOutOfficer1() {
			uIMapNames.arrestEntry.arrestTab.uIOfficer1Edit.sendKeys(Keys.TAB);
		}

		public void enterBookingDate24HoursGreaterThanArrestDate() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.scrollIntoView(uIMapNames.arrestEntry.arrestTab.uIBookingDateEdit);
			uIMapNames.arrestEntry.arrestTab.uIBookingDateEdit.clear();
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.arrestTab.uIBookingDateEdit.sendKeys(BaseData.getNamesModuleValue("BookingDate"));

		}

		public void enterCaseNoByActiveData(String Case) {
			uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.sendKeys(Case.substring(0, 2));
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(Case.substring(3));
			uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void selectHowAsOnViewArrest() {
			uIMapNames.arrestEntry.arrestTab.uIHowComboBox.sendKeys("On-View Arrest");
			uIMapNames.arrestEntry.arrestTab.uIHowComboBox.sendKeys(Keys.TAB);
		}

		public void verifyEnterMandatoryDataAcwkMsg() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - Arrest Entry Date");

			} else {
				popup.switchToAcknowledge();
				Playback.gridLoadThreadWait();
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - Arrest Entry Date");
			}
		}

		public void verifyArrestEntryDateAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - Arrest Entry Date");

			} else {
				popup.switchToAcknowledge();
				Playback.gridLoadThreadWait();
				popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data - Arrest Entry Date");
			}
		}

		public void tabHowComboBox() {
			uIMapNames.arrestEntry.arrestTab.uIHowComboBox.sendKeys(Keys.TAB);
		}

		public void verifyAtCaseNo(String CaseNo) {
			Assert.assertEquals(CaseNo.substring(0, 2),
					uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.getAttribute("value"));
			Assert.assertEquals(CaseNo.substring(3),
					uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.getAttribute("value"));
		}

		public void verifyCaseNoAsReadOnlyMode() {
			String attribute = uIMapNames.arrestEntry.arrestTab.uICaseYearEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute.contains("true"));
			String attribute2 = uIMapNames.arrestEntry.arrestTab.uICaseNoEdit.getAttribute("readonly");
			verify.ExpectedValueIsTrue(attribute2.contains("true"));

		}

		public void verifyArrestDateAsCurrentDate() {
			String attribute = uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(Randomized.getCurrentDate()));
		}

		public void verifyAtArrestDate() {
			String attribute = uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.getAttribute("value");
			verify.ExpectedValueIsTrue(attribute.contains(BaseData.getNamesModuleValue("ArrestDate")));
		}

		public void enterarrestDateAs1DayBeforeFromCurrentDate() {
			System.out.println(Randomized.getPreviousDate(1, "MM/dd/yyyy"));
			uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.clear();
			uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.sendKeys(Randomized.getPreviousDate(1, "MM/dd/yyyy"));
			uIMapNames.arrestEntry.arrestTab.uIArrestDateEdit.sendKeys(Keys.TAB);
		}
	}

	public class MedicalTab {

	}

	public class ChargeTab {

		public void tabTheCaseNoEntries() {
			uIMapNames.arrestEntry.chargeTab.uICaseYearEdit.click();
			uIMapNames.arrestEntry.chargeTab.uICaseYearEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.chargeTab.uICaseNoEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void tabTheArrestLocation() {
			uIMapNames.arrestEntry.chargeTab.uIArrestLocationEdit.sendKeys(Keys.TAB);
		}

		public void TabTheOffenseDateAndTime() {
			uIMapNames.arrestEntry.chargeTab.uIOffenseDate.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.chargeTab.uIOffenseTime.sendKeys(Keys.TAB);
		}

		public void TabTheCount() {
			uIMapNames.arrestEntry.chargeTab.uICountEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCaseNo2() {
			uIMapNames.arrestEntry.chargeTab.uICaseYearEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo2").substring(0, 2));
			uIMapNames.arrestEntry.chargeTab.uICaseNoEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo2").substring(3));
			uIMapNames.arrestEntry.chargeTab.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtCaseNo() {
			uIMapNames.arrestEntry.chargeTab.uICaseYearEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(0, 2));
			uIMapNames.arrestEntry.chargeTab.uICaseNoEdit.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(3));
			uIMapNames.arrestEntry.chargeTab.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void selectAtAgencyAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.chargeTab.uIAgencyActionCombobox,
					BaseData.getNamesModuleValue("AgencyAction"));
		}

		public void selectCourtType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.chargeTab.uICourtTypeComboBox);
		}

		public void clickTheAddButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.arrestEntry.chargeTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyHighestChargeByAtCaseNo2(int rowIndex) {
			WebElement UICell = objectIdentification.manualIdentify.getGridCell(
					"tabBooking_tmpl2_ctrlUsrCharge_grdCharge", rowIndex,
					BaseData.getNamesModuleValue("CaseNo2").toString());
			Assert.assertEquals(UICell.getText(), BaseData.getNamesModuleValue("CaseNo2").toString());
		}

		public void SelectStateOrd() {

			uIMapNames.arrestEntry.chargeTab.uIStateOrdNolupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void VerifyChargeCountIsRequired() {
			popup.acknowledge.okWithExpectedMessage("(6516) Charge Count is Required");
		}

		// used for NJ Db only
		public void enterAtCharge1() {
			uIMapNames.arrestEntry.chargeTab.uIChargeEdit.sendKeys(BaseData.getNamesModuleValue("Charge1"));
			uIMapNames.arrestEntry.chargeTab.uIChargeEdit.sendKeys(Keys.TAB);
		}

		// used for NJ Db only
		public void EnterAtCharge2() {
			uIMapNames.arrestEntry.chargeTab.uIChargeEdit.sendKeys(BaseData.getNamesModuleValue("Charge2"));
			uIMapNames.arrestEntry.chargeTab.uIChargeEdit.sendKeys(Keys.TAB);
		}

		// used for NJ Db only
		public void selectStatusAsArrestedAdult() {
			new Select(uIMapNames.arrestEntry.chargeTab.uIStatusComboBox).selectByVisibleText("Arrested Adult");
		}

		// used for NJ Db only
		public void SelectStatusAsNoProcess() {
			uIMapNames.arrestEntry.chargeTab.uIStatusComboBox.sendKeys("No Process");
		}

		public void enterAtCharge() {
			uIMapNames.arrestEntry.chargeTab.uIChargeEdit.sendKeys(BaseData.getNamesModuleValue("Charge"));
			uIMapNames.arrestEntry.chargeTab.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void VerifyDNAACknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6543) This Charge may require DNA sample collection.");
		}

		public void verifyAtCaseNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("CaseNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Case#", rowIndex));
		}

		public void VerifyAtStatusInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Status"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Status", rowIndex));
		}

		public void VerifyAtChargeWithStarInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Charge", rowIndex)
					.contains(BaseData.getNamesModuleValue("Charge")));
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Charge", rowIndex)
					.contains("*"));
		}

		public void ClickAtCaseNoInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("CaseNo"));
		}

		public void VerifyAtChargeWithoutStar() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Charge"),
					uIMapNames.arrestEntry.chargeTab.uIChargeEdit.getAttribute("value"));
		}

		public void VerifyCaseInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.chargeTab.uICaseNoInfoIcon.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.chargeTab.uICaseNoInfoIcon.isEnabled());
		}

		public void VerifyAtCaseNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("CaseNo").substring(0, 2),
					uIMapNames.arrestEntry.chargeTab.uICaseYearEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("CaseNo").substring(3),
					uIMapNames.arrestEntry.chargeTab.uICaseNoEdit.getAttribute("value"));
		}

		public void selectAtStatus() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.chargeTab.uIStatusComboBox,
					BaseData.getNamesModuleValue("Status"));
			uIMapNames.arrestEntry.chargeTab.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyAtChargeInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Charge"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Charge", rowIndex));
		}

		public void VerifyNIBRSOffenseComboBoxDisabled() {
			verify.ExpectedValueIsTrue(!uIMapNames.arrestEntry.chargeTab.uINIBRSOffenseComboBox.isEnabled());
		}

		public void VerifyNIBRSOffenseComboBoxEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.chargeTab.uINIBRSOffenseComboBox.isDisplayed());

		}

		public void VerifyDNACollectedCheckboxisdisplayed() {
			verify.ExpectedValueIsTrue(!uIMapNames.arrestEntry.chargeTab.uIDNACollectedCheckBox.isEnabled());
		}

		public void VerifyNIBRSOffenseAsSelectValue() {
			verify.ExpectedPropertyValueIsEqual("--Select--", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.arrestEntry.chargeTab.uINIBRSOffenseComboBox));
		}

		public void Verify6529WarningNIBRSOffenseNotEnteredForChargeAckMsg() {
			if (Playback.browserType.equals("Chrome"))
				popup.acknowledge.okWithExpectedMessage("(6529) **WARNING** NIBRS Offense not entered for charge.");
			else
				popup.acknowledge.okWithExpectedMessage(
						"(6529) **WARNING**" + System.lineSeparator() + "NIBRS Offense not entered for charge.");
		}

		public void VerifyAtNIBRSOffense() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NIBRSOffense"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.arrestEntry.chargeTab.uINIBRSOffenseComboBox));
		}

		public void ClickAtChargeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge"));
		}

		public void ClickAtCharge1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge1"));
		}

		public void EnterCountAs1() {
			uIMapNames.arrestEntry.chargeTab.uICountEdit.clear();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.click();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.sendKeys("1");
		}

		public void EnterCountAs2() {	
			uIMapNames.arrestEntry.chargeTab.uICountEdit.click();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.clear();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.sendKeys("2");
		}

		public void EnterCountAs3() {
			uIMapNames.arrestEntry.chargeTab.uICountEdit.clear();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.click();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.sendKeys("3");
		}

		public void ClickCitationAddbutton() {
			uIMapNames.arrestEntry.chargeTab.uICitationAddButton.click();
			Playback.pageLoadThreadWait();
		}

		public void VerifyCitationNo(String citationNo) {
			verify.ExpectedPropertyValueIsEqual(citationNo,
					uIMapNames.arrestEntry.chargeTab.uICitationNoEdit.getAttribute("value"));
		}

		public void VerifyCitationNoInfoIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.chargeTab.uICitationNoInfoIcon.isDisplayed());
		}

		public void DoubleClickAtChargeInGrid() {
			objectIdentification.manualIdentify.doubleClickGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge"));

		}

		public void SelectNIBRS() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.chargeTab.uINIBRSOffenseComboBox);
			Playback.controlReadyThreadWait();
		}

		public void SelectAtNIBRS() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.chargeTab.uINIBRSOffenseComboBox,
					BaseData.getNamesModuleValue("NIBRSOffense"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtChargeNIBRSOffenseCheckboxCheckedInGrid() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge"));
			WebElement NIBRSOffense = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, row, BaseData.getNamesModuleValue("CaseNo"));
			verify.ExpectedValueIsTrue(NIBRSOffense.findElement(By.tagName("img")).getAttribute("title")
					.contains("Highest Charge Selected"));
		}

		public void VerifyAtChargeNIBRSOffenseCheckboxUnCheckedInGrid() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge"));
			WebElement NIBRSOffense = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, row, BaseData.getNamesModuleValue("CaseNo"));
			verify.ExpectedValueIsTrue(NIBRSOffense.findElement(By.tagName("img")).getAttribute("title")
					.contains("Choose Highest Charge"));
		}

		public void VerifyAtCharge1NIBRSOffenseCheckboxUnCheckedInGrid() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge1"));
			WebElement NIBRSOffense = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, row, BaseData.getNamesModuleValue("CaseNo"));
			verify.ExpectedValueIsTrue(NIBRSOffense.findElement(By.tagName("img")).getAttribute("title")
					.contains("Choose Highest Charge"));
		}
		public void VerifyAtCharge1NIBRSOffenseCheckboxCheckedInGrid() {
			WebElement row = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge1"));
			WebElement NIBRSOffense = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, row, BaseData.getNamesModuleValue("CaseNo"));
			verify.ExpectedValueIsTrue(NIBRSOffense.findElement(By.tagName("img")).getAttribute("title")
					.contains("Highest Charge Selected"));
		}

		public void VerifyChargeNIBRSCheckboxCheckedInGrid(int rowIndex) {
			WebElement rowcell = objectIdentification.manualIdentify
				.getGridCell(uIMapNames.arrestEntry.chargeTab.uIChargeTableId,"NIBRS Rpt", rowIndex);
			WebElement rowimg = rowcell.findElement(By.tagName("img"));
			verify.ExpectedPropertyValueIsEqual(rowimg.getAttribute("title")
					,"Highest Charge Selected");
		}
		
	
		public void VerifyChargeNIBRSCheckboxUnCheckedInGrid(int rowIndex) {
			WebElement rowcell = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.arrestEntry.chargeTab.uIChargeTableId,"NIBRS Rpt", rowIndex);
			WebElement rowimg = rowcell.findElement(By.tagName("img"));
			verify.ExpectedPropertyValueIsEqual(rowimg.getAttribute("title")
					,"Choose Highest Charge");
		}

		public void deleteAtChargeRowInGrid() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerTextExactRow(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge1"));
		}

		public void VerifyDeleteConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			Playback.pageLoadThreadWait();
		}

		public void VerifyingStatusIsEmpty(int i) {
			String cellInnerText = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Status", i);
			verify.ExpectedPropertyValueIsEqual(cellInnerText, "");
		}

		public void verifyCaseNoByActiveData(String Case) {

			verify.ExpectedPropertyValueIsEqual(Case.substring(0, 2),
					uIMapNames.arrestEntry.chargeTab.uICaseYearEdit.getAttribute("value"));
			Playback.pageLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(Case.substring(3),
					uIMapNames.arrestEntry.chargeTab.uICaseNoEdit.getAttribute("value"));
			Playback.controlReadyThreadWait();
		}

		public void verifyActiveCaseNoInGrid(String Case, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Case, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Case#", rowIndex));

		}

		public void SelectStatusAsArrestJuvenile() {
			new Select(uIMapNames.arrestEntry.chargeTab.uIStatusComboBox).selectByVisibleText("Arrest Juvenile");
		}

		public void deleteRowByUsingCaseNoInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("CaseNo"));
			WebElement row = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.arrestEntry.chargeTab.uIChargeTableId, gridRowByCellInnerText, "X");
			row.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void verifyModifierCheckBoxIsDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.chargeTab.uIModifierCheckbox.isDisplayed());
		}

		public void DeleteRowByChargeInGridByIndex(int index) {
			if (index == 0) {
				objectIdentification.manualIdentify.deleteGridRowByCellInnerTextExactRow(
						uIMapNames.arrestEntry.chargeTab.uIChargeTableId, BaseData.getNamesModuleValue("Charge"));
				popup.confirm.yes();
			} else {
				objectIdentification.manualIdentify.deleteGridRowByCellInnerTextExactRow(
						uIMapNames.arrestEntry.chargeTab.uIChargeTableId,
						BaseData.getNamesModuleValue("Charge" + index));
				popup.confirm.yes();
			}

		}

		public void verifyJuvenileStatusIsEnabled() {

			verify.ExpectedValueIsTrue(uIMapNames.arrestEntry.chargeTab.uIJuvenileStatusDropdown.isEnabled());
		}

		public void selectAtJuvenileStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.chargeTab.uIJuvenileStatusDropdown,
					BaseData.getNamesModuleValue("JuvenileStatus"));
		}

		public void enterCountAs2() {
			uIMapNames.arrestEntry.chargeTab.uICountEdit.click();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.clear();
			uIMapNames.arrestEntry.chargeTab.uICountEdit.sendKeys("2");
		}

		public void verifyDeleteConfirmMessageAsNo() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.noWithExpectedMessage("(4) Do you really want to delete?");
			} else {
				popup.switchToConfirm();
				Playback.controlReadyThreadWait();
				popup.confirm.noWithExpectedMessage("(4) Do you really want to delete?");
				Playback.pageLoadThreadWait();
			}
		}

		public void verifyAtChargeDeletedInGrid() {
			int rowsCount = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.arrestEntry.chargeTab.uIChargeTableId);
			String chargeNo = "";
			for (int i = 0; i < rowsCount; i++) {
				chargeNo = objectIdentification.manualIdentify
						.getGridCellInnerText(uIMapNames.arrestEntry.chargeTab.uIChargeTableId, "Charge", i);
			}
			verify.ExpectedPropertyValueIsEqual(chargeNo, BaseData.getNamesModuleValue("Charge"));

		}

		public void verifyAtCaseNo(String CaseNo) {
			verify.ExpectedPropertyValueIsEqual(CaseNo.substring(0, 2),
					uIMapNames.arrestEntry.chargeTab.uICaseYearEdit.getAttribute("Value"));
			verify.ExpectedPropertyValueIsEqual(CaseNo.substring(3),
					uIMapNames.arrestEntry.chargeTab.uICaseNoEdit.getAttribute("Value"));
		}

		public void selectStatusAsArrestedJuvenile() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.chargeTab.uIStatusComboBox,
					"Arrested Juvenile");
		}

		public void verifyAtStatus() {
			String dropDownSelectedItem = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.arrestEntry.chargeTab.uIStatusComboBox);
			verify.ExpectedValueIsTrue(dropDownSelectedItem.contains(BaseData.getNamesModuleValue("Status")));
		}

		public void enterAtCitationNo() {
			uIMapNames.arrestEntry.chargeTab.uICitationNoEdit.sendKeys(BaseData.getNamesModuleValue("CitationNo"));
			uIMapNames.arrestEntry.chargeTab.uICitationNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyAtChargeAreDifferentPopupMessageAndClickCancel() {

			String charge = BaseData.getNamesModuleValue("Charge1");
			String updateCharge = "\"" + charge + "\"";
			popup.confirm.noWithExpectedMessage("The selected Arrest charge and the Citation charge, " + updateCharge
					+ " are different.  Please correct.");

		}

		public void verifyAtChargeAreDifferentPopupMessageAndClickOk() {
			String charge = BaseData.getNamesModuleValue("Charge1");
			String updateCharge = "\"" + charge + "\"";
			popup.confirm.yesWithExpectedMessage("The selected Arrest charge and the Citation charge, " + updateCharge
					+ " are different.  Please correct.");
		}

		public void selectCharge1fromCodedSearch() {
			popup.switchToCodedSearch();
			popup.kPICodedLookup.clickAtCharge1InGrid();	
		}
	}

	public class DispositionTab {
		public void VerifyHighestChargeInDispositionTab(int rowIndex) {
			WebElement UICell = objectIdentification.manualIdentify.getGridCell("grdDisp", rowIndex,
					BaseData.getNamesModuleValue("CaseNo2").toString());
			Assert.assertEquals(UICell.getText(), BaseData.getNamesModuleValue("CaseNo2").toString());
		}

	}

	public class ReleaseTab {
		public void selectAtSchool() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.releaseTab.uISchoolComboBox,
					BaseData.getNamesModuleValue("School"));
			uIMapNames.arrestEntry.releaseTab.uISchoolComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtGrade() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.releaseTab.uIGradeComboBox,
					BaseData.getNamesModuleValue("Grade"));
			uIMapNames.arrestEntry.releaseTab.uIGradeComboBox.sendKeys(Keys.TAB);
		}

		public void selectSchoolAsCollegeDegree() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.releaseTab.uISchoolComboBox,
					"C - College degree");
		}

		public void selectGradeAsA7thGrade() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestEntry.releaseTab.uIGradeComboBox,
					"A - 7th Grade");
		}

	}

	public class PersonalDataTab {

		public void VerifyHeight() {
			Assert.assertEquals(BaseData.getNamesModuleValue("Height").toString(),
					uIMapNames.arrestEntry.personalDataTab.uIHeight.getAttribute("value"));

		}

		public void VerifyWeightlbs() {
			Assert.assertEquals(BaseData.getNamesModuleValue("Weight_lbs").toString(),
					uIMapNames.arrestEntry.personalDataTab.uIWeightlbs.getAttribute("value"));

		}

		public void VerifyEyeColor() {
			Select el = new Select(uIMapNames.arrestEntry.personalDataTab.uIEyecolor);
			Assert.assertEquals(BaseData.getNamesModuleValue("Eyecolor").toString(),
					el.getFirstSelectedOption().getText());
		}

		public void VerifyHairColor() {
			Select el = new Select(uIMapNames.arrestEntry.personalDataTab.uIHaircolor);
			Assert.assertEquals(BaseData.getNamesModuleValue("HairColor").toString(),
					el.getFirstSelectedOption().getText());
		}

		public void HairLenght() {
			Select el = new Select(uIMapNames.arrestEntry.personalDataTab.uIHairLength);
			Assert.assertEquals(BaseData.getNamesModuleValue("HairLength").toString(),
					el.getFirstSelectedOption().getText());

		}

		public void VerifySMTInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("SMT"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.arrestEntry.personalDataTab.uISMTResultTable, "SMT", rowIndex));
		}

		public void VerifySMT1InGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("SMT1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.arrestEntry.personalDataTab.uISMTResultTable, "SMT", rowIndex));
		}

		public void EnterAliasLastName() {
			uIMapNames.arrestEntry.personalDataTab.uIAliasLastNameEdit.sendKeys("Citi");
		}

		public void EnterAliasFirstName() {
			uIMapNames.arrestEntry.personalDataTab.uIAliasFirstNameEdit.sendKeys("Zen");
		}

		public void EnterHeight() {
			uIMapNames.arrestEntry.personalDataTab.uIHeight.sendKeys(Randomized.randomNumberString(3));
		}

		public void Enterweight() {
			uIMapNames.arrestEntry.personalDataTab.uIWeightlbs.sendKeys(Randomized.randomNumberString(3));
		}

		public void SelectEyeColor() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.arrestEntry.personalDataTab.uIEyecolor);
		}

		public void SelectHaircolor() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.personalDataTab.uIHaircolor);
		}

		public void SelectHairStyle() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.personalDataTab.uIHairStyleComboBox);
		}

		public void SelectBehavior() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.personalDataTab.uIBehaviorComboBox);
		}

		public void EnterPhysicalDescription() {
			uIMapNames.arrestEntry.personalDataTab.uIPhysicalDescEdit.sendKeys(Randomized.randomString(50));
		}

		public void EnterAppearanceDescription() {
			uIMapNames.arrestEntry.personalDataTab.uIAppearanceEdit.sendKeys(Randomized.randomString(50));
		}

		public void EnterAtSMT() {
			uIMapNames.arrestEntry.personalDataTab.uISMTCodeEdit.sendKeys(BaseData.getNamesModuleValue("SMT"));
			uIMapNames.arrestEntry.personalDataTab.uISMTCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtSMT1() {
			uIMapNames.arrestEntry.personalDataTab.uISMTCodeEdit.sendKeys(BaseData.getNamesModuleValue("SMT1"));
			uIMapNames.arrestEntry.personalDataTab.uISMTCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterDescription() {
			uIMapNames.arrestEntry.personalDataTab.uISMTDescriptionEdit.sendKeys(Randomized.randomString(10));
		}

		public void ClickAddButton() {
			uIMapNames.arrestEntry.personalDataTab.uIAddButton.click();
		}
	}

	public class AssociatesTab {

	}

	public class ArrestEntryCommentsTab {
		public BookingComments bookingComments = null;

		public ArrestEntryCommentsTab() {

			if ((this.bookingComments == null)) {
				this.bookingComments = new BookingComments();
			}
		}

		public void EnterSubject() {

			uIMapNames.arrestEntry.arrestEntryCommentsTab.uISubjectEdit
					.sendKeys(Randomized.manualPlusRandomString("Adult Arrest", 4));

		}

		public void ClickTheEnterCommentsButton() {

			uIMapNames.arrestEntry.arrestEntryCommentsTab.uIEnterCommentsButton.click();

		}

	}

	public class StatementTab {

		public void EnterRandomStatement() {
			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapNames.arrestEntry.statementTab.uICommentsEdit).click();
			actions.sendKeys(Randomized.randomString(50)).build().perform();
			Playback.controlReadyThreadWait();

		}

		public void EnterStatement() {
			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapNames.arrestEntry.statementTab.uICommentsEdit).click();
			actions.sendKeys("Test Automation Work Contuined...").build().perform();
			Playback.controlReadyThreadWait();

		}

		public void SelectTemplate() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.statementTab.uITemplateNameComboBox);
		}

		public void ClickLoadButton() {
			uIMapNames.arrestEntry.statementTab.uILoadButton.click();
		}

		public void ClickAddNewButton() {
			uIMapNames.arrestEntry.statementTab.uIAddNewButton.click();
		}

		public void ClickSaveTab() {
			uIMapNames.arrestEntry.statementTab.uISaveButton.click();
		}

		public void SaveInternalTab() {
			uIMapNames.arrestEntry.statementTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SelectAtTemplate() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.statementTab.uITemplateNameComboBox,
					BaseData.getNamesModuleValue("TextName"));
			;
		}

		public void VerifyTextAdded() {
			String richwText = uIMapNames.arrestEntry.statementTab.uIWrapperCommentsEdit.getText();
			WebElement richText = uIMapNames.arrestEntry.statementTab.uICommentsEdit
					.findElement(By.xpath("//html/body[contains(text(), 'background-color')]"));

			verify.ExpectedValueIsTrue(richText.getText()
					.contains("Need to verify whether added text in Text Mgmt screen loads in Statement tab"));
		}
	}

	public class ChargingConfTab {

		public void SelectTheFirstChargeInTheTable(int rowIndex) {

			objectIdentification.manualIdentify
					.selectGridTableRow(uIMapNames.arrestEntry.chargingConfTab.uIChargingConfTable, rowIndex);
		}

		public void EntertNewCharge() {

			uIMapNames.arrestEntry.chargingConfTab.uINewChargeCodeEdit
					.sendKeys(BaseData.getNamesModuleValue("NewCharge"));

		}

		public void TabTheCaseOfficer() {

			uIMapNames.arrestEntry.chargingConfTab.uICaseOfficerCodeEdit.sendKeys(Keys.TAB);

		}

		public void EnterRandomReviewingDAsName() {
			uIMapNames.arrestEntry.chargingConfTab.uIReviewingDAsNameTypeEdit.sendKeys("A");
			uIMapNames.arrestEntry.chargingConfTab.uIReviewingDAsLastNameEdit.sendKeys("a");
			uIMapNames.arrestEntry.chargingConfTab.uIReviewingDAsLastNameEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.chargingConfTab.uIReviewingDAsFirstNameEdit.sendKeys(Keys.TAB);
			names.nameSearchHelpWindow.SelectName();

		}

		public void ClickTheUpdateButton() {
			uIMapNames.arrestEntry.chargingConfTab.uIUpdateButton.click();

		}

		public void VerifyHighestChargeInChargeCongigTab(int rowIndex) {
			WebElement UICell = objectIdentification.manualIdentify.getGridCell("grdDAConf", rowIndex,
					BaseData.getNamesModuleValue("CaseNo2").toString());
			Assert.assertEquals(UICell.getText(), BaseData.getNamesModuleValue("CaseNo2").toString());

		}

		public void VerifyNewChargeAtNewCharge(int rowIndex) {

			WebElement UICell = objectIdentification.manualIdentify.getGridCell("grdDAConf", rowIndex,
					BaseData.getNamesModuleValue("NewCharge").toString());
			Assert.assertEquals(UICell.getText(), BaseData.getNamesModuleValue("NewCharge").toString());

		}

		public void Save() {
			uIMapNames.arrestEntry.chargingConfTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

	}

	public class ArrestEntryMapTab {

	}

	public class HealthTab {

	}

	public class ArrestEntryQAFormsTab {

		public void selectAtForm() {
			// uIMapNames.arrestEntry.arrestEntryQAFormsTab.uISelectFormDropDown.click();
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.arrestEntryQAFormsTab.uISelectFormDropDown,
					BaseData.getNamesModuleValue("SelectForm"));
		}

		public void clickPrintIconInGrid() {

			Playback.driver.findElement(By.xpath("//input[@id='grdQAForms_it6_0_cmdGrdQAFormsPrint']")).click();

		}

		public int readGridRowCount() {
			int count = objectIdentification.manualIdentify.getGridTableRowsCount(uIMapNames.arrestEntry.arrestEntryQAFormsTab.uIGridTable);
			System.out.println(count);
			return count;
		}

		public void deleteFirstRowInGrid() {
			WebElement cellText = Playback.driver.findElement(By.xpath
					(".//table/tbody/tr/td[@class='Delete_Icon_Style']"));
			cellText.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
		}

		public void verifyGridRowCountAs1()
		{
			int expectedRowCount = objectIdentification.manualIdentify.getGridTableRowsCount(uIMapNames.arrestEntry.arrestEntryQAFormsTab.uIGridTable);
			System.out.println(expectedRowCount);
			verify.ExpectedIntergerValueIsEqualToActual(1, expectedRowCount);
		}
		public void verifyGridRowCountAs0() {
			
			WebElement ele =uIMapNames.arrestEntry.arrestEntryQAFormsTab.uIGridTable.findElement(By.xpath("//table//tbody[contains(@class,'igg_BlueThemeItem')]"));
		System.out.println(objectIdentification.manualIdentify.controlExist(ele))	;
			verify.ExpectedValueIsFalse(objectIdentification.manualIdentify.controlExist(ele));
		
		}
	}

	public class BookingComments {

		public void EnterComments() {

			Playback.waitForControlReady();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapNames.arrestEntry.bookingComments.uICommentsEdit).click();
			actions.sendKeys(Randomized.randomString(500)).build().perform();
			Playback.waitForControlReady();

		}

		public void Save() {

			uIMapNames.arrestEntry.bookingComments.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {

			uIMapNames.arrestEntry.bookingComments.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void CloseTheScreen() {
			uIMapNames.arrestEntry.bookingComments.driver.close();

		}

	}

	public class ArrestEntryCellTab {

		public void SelectCustodyReason() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICustodyReasonComboBox);
		}

		public void ClickSaveButton() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uISaveButton.click();
		}

		public void SaveInternalTab() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void EnterCustodyAlert() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uICustodyAlertEdit.sendKeys(Randomized.randomAlphanumeric(10));
		}

		public void SelectRiskLevel() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.arrestEntryCellTab.uIRiskLevelComboBox);
		}

		public void EnterAtAssignCellNo() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignCellEdit
					.sendKeys(BaseData.getNamesModuleValue("AssignCellNo"));
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignCellEdit.sendKeys(Keys.TAB);
		}

		public void EnterAssignBy() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignByPFEdit.click();
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignByPFEdit.sendKeys(Keys.TAB);
		}

		public void EnterAssignDateandTime() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignedDateEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignedTimeEdit.sendKeys(Keys.TAB);
		}

		public void clickAssignCellInfoIcon() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignCellInfoButton.click();
		}

		public void selectAtCustodyReason() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.arrestEntryCellTab.uICustodyReasonComboBox,
					BaseData.getNamesModuleValue("CustodyReason"));
			uIMapNames.arrestEntry.arrestEntryCellTab.uICustodyReasonComboBox.sendKeys(Keys.TAB);
		}

		public void enterAtAssignedBy() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignByPFEdit
					.sendKeys(BaseData.getNamesModuleValue("AssignedBy"));
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAssignByPFEdit.sendKeys(Keys.TAB);
		}

		public void clickRemoveCheckBox() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIRemoveCheckBox.click();
			Playback.pageLoadThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void enterAtRemovedBy() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIRemovedByPFEdit
					.sendKeys(BaseData.getNamesModuleValue("RemovedBy"));
			uIMapNames.arrestEntry.arrestEntryCellTab.uIRemovedByPFEdit.sendKeys(Keys.TAB);
		}

		public void tabOutRemovedDateAndTime() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIRemovedDateEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.arrestEntryCellTab.uIRemovedTimeEdit.sendKeys(Keys.TAB);

		}

		public void clickCellHistoryButton() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uICellHistoryButton.click();
			Playback.waitForPageLoad();
		}

		public void clickFormsLink() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAutoQAFormLinkButton.click();
		}

		public void verifyFormsLinkAsGreenColor() {
			String attribute = uIMapNames.arrestEntry.arrestEntryCellTab.uIAutoQAFormLinkButton.getAttribute("style");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("green"));
		}

		public void clickAddActivityButton() {
			uIMapNames.arrestEntry.arrestEntryCellTab.uIAddActivityButton.click();
		}

	}

	public class ArrestEntryApprovalTab {
		public void SaveInternalTab() {
			uIMapNames.arrestEntry.arrestEntryApprovalTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SelectAtNewAction() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.arrestEntryApprovalTab.uINewActionComboBox,
					BaseData.getNamesModuleValue("NewAction"));
			uIMapNames.arrestEntry.arrestEntryApprovalTab.uINewActionComboBox.sendKeys(Keys.TAB);
		}

		public void TabDateTime() {
			uIMapNames.arrestEntry.arrestEntryApprovalTab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestEntry.arrestEntryApprovalTab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtDivision() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.arrestEntryApprovalTab.uIDivisionComboBox,
					BaseData.getNamesModuleValue("Division"));
			uIMapNames.arrestEntry.arrestEntryApprovalTab.uIDivisionComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtSection() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.arrestEntryApprovalTab.uISectionComboBox,
					BaseData.getNamesModuleValue("Section"));
			uIMapNames.arrestEntry.arrestEntryApprovalTab.uISectionComboBox.sendKeys(Keys.TAB);
		}

		public void selectActionAsSendForApproval() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.arrestEntry.arrestEntryApprovalTab.uINewActionComboBox, "Send for Approval");
		}

		public void selectActionAsApprove() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.arrestEntryApprovalTab.uINewActionComboBox, "Approve");
		}

		public void selectActionAsLock() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.arrestEntryApprovalTab.uINewActionComboBox, "Lock");
		}
	}

	public class ArrestEntryEmpSchoolTab {
		public void EnterAtLastName() {
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uILastNameEdit
					.sendKeys(BaseData.getNamesModuleValue("EmpLastName"));
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uILastNameEdit.sendKeys(Keys.TAB);
		}

		public void ClickBNameInfoIcon() {
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIBNameInfoIconButton.click();
		}

		public void SelectOccupation() {
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIOccupationLookupButton.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void ClickUnemploymentCheckBox() {
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIUnEmployedCheckBox.click();
		}

		public void SelectType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uITypeComboBox);
		}

		public void ClickAddButton() {
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIAddNameButton.click();
		}

		public void EnterComments() {
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uICommentsEdit.sendKeys("Automation Test Purpose");
		}

		public void SaveEmpSchoolTab() {
			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIEmpSchoolSaveButton.click();
			popup.confirm
					.yesWithExpectedMessage("(6565) Do you want to update these details in the Master Name record?");
			popup.confirm.yes();
		}

		public void VerifyAcknowledgeUpdateEmpSchoolTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Emp/School Tab. You must save or reset.");
		}

		public void VerifyAcknowledgeMandatoryData() {
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void VerifyAcknowledgeDuplicationData() {
			popup.acknowledge.okWithExpectedMessage("(1019) Duplication Of Data Found");
		}

		public void VerifyCurrentDate(int rowIndex) {
			WebElement currentDate = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIEmpSchoolGridTable, "Date", rowIndex);
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), currentDate.getText());
		}

		public void VerifyTypeAsAlternate(int rowIndex) {
			WebElement type = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIEmpSchoolGridTable, "Type", rowIndex);
			verify.ExpectedPropertyValueIsEqual("Alternate", type.getText());
		}

		public void verifyAtBusinessName(int rowIndex) {

			if (rowIndex == 0) {
				String expected = BaseData.getNamesModuleValue("BusinessName");
				List<WebElement> type = objectIdentification.manualIdentify
						.getGridRowCells(uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIEmpSchoolGridTable, rowIndex);
				for (WebElement ele : type) {
					if (ele.getText().contains(expected)) {
						verify.ExpectedPropertyValueIsEqual(expected, ele.getText());
						System.out.println(ele.getText());
					}
				}
			} else {
				String expected = BaseData.getNamesModuleValue("BusinessName" + rowIndex + "");
				List<WebElement> type = objectIdentification.manualIdentify.getGridRowCells(
						uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIEmpSchoolGridTable, rowIndex - 1);
				for (WebElement ele : type) {
					if (ele.getText().contains(expected)) {
						verify.ExpectedPropertyValueIsEqual(expected, ele.getText());
						System.out.println(ele.getText());
					}
				}
			}
		}

		public void enterAtBNameID() {

			uIMapNames.arrestEntry.arrestEntryEmpSchoolTab.uIBNameIDEdit
					.sendKeys(BaseData.getNamesModuleValue("BusinessNameID"));
		}

	}

	public class ArrestSearch {

		public void EnterAtCaseNo() {
			uIMapNames.arrestSearch.uICaseYearEdit.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(0, 2));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(3));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtCharge() {
			uIMapNames.arrestSearch.uIChargeEdit.sendKeys(BaseData.getNamesModuleValue("Charge"));
			uIMapNames.arrestSearch.uIChargeEdit.sendKeys(Keys.TAB);
		}

		public void SelectNameTypeAsA() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestSearch.uINameTypeComboBox, "A");
		}

		public void EnterAtLastName() {
			uIMapNames.arrestSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.arrestSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.arrestSearch.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void ClickSearchButton() {
			uIMapNames.arrestSearch.uISearchButton.click();
		}

		public void ClickBackButton() {
			uIMapNames.arrestSearch.uIBackButton.click();
		}

		public void ClickResetButton() {
			uIMapNames.arrestSearch.uIResetButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectArrestByAtCaseNo() {
			Playback.wait(3000);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText("grdBooking",
					BaseData.getNamesModuleValue("CaseNo").toString());
		}

		public void SelectRowByAtArrestNo() {

			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.arrestSearch.uIResultTable,
					BaseData.getNamesModuleValue("ArrestNo").toString());

		}

		public void ClickClearDateButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.arrestSearch.uIDateClearButton.click();
		}

		public void enterAtQAFormData() {
			uIMapNames.arrestSearch.uIQAFormDataEdit.sendKeys(BaseData.getNamesModuleValue("QAFormData"));

		}

		public void clickAddnewButton() {
			uIMapNames.arrestSearch.uIAddNewButton.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickExcelIcon() {
			uIMapNames.arrestSearch.uIExcelImageButton.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void ClearFromDate() {
			uIMapNames.arrestSearch.uIDateFromEdit.click();
			uIMapNames.arrestSearch.uIDateFromEdit.clear();
		}

		public void VerifyAtLastNameFirstName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(
					BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.arrestSearch.uIResultTable,
							"Name", rowIndex));
		}

		public void VerifyRowCount() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.arrestSearch.uIResultTable) == 1);
		}

		public void EnterAtArrestNo() {
			System.out.println(BaseData.getNamesModuleValue("ArrestNo").substring(0, 2));
			System.out.println(BaseData.getNamesModuleValue("ArrestNo").substring(3)); 
			uIMapNames.arrestSearch.uIArrestFromYear.sendKeys(BaseData.getNamesModuleValue("ArrestNo").substring(0, 2));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(BaseData.getNamesModuleValue("ArrestNo").substring(3));
			uIMapNames.arrestSearch.uIArrestToYear.sendKeys(BaseData.getNamesModuleValue("ArrestNo").substring(0, 2));
			uIMapNames.arrestSearch.uIArrestToNumber.sendKeys(BaseData.getNamesModuleValue("ArrestNo").substring(3));
			
		}

		public void EnterArrestNo(String arrestYear, String arrestNo) {
			uIMapNames.arrestSearch.uIArrestFromYear.sendKeys(BaseData.getNamesModuleValue("arrestYear"));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(BaseData.getNamesModuleValue("arrestNo"));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestSearch.uIArrestToYear.sendKeys(BaseData.getNamesModuleValue("arrestYear").substring(0, 2));
			uIMapNames.arrestSearch.uIArrestToNumber.sendKeys(BaseData.getNamesModuleValue("arrestNo").substring(3));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtArrestNoInGrid() {
			Playback.wait(3000);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.arrestSearch.uIResultTable,
					BaseData.getNamesModuleValue("ArrestNo"));
		}

		public void SelectArrestInRow(String arrestYear, String arrestNo) {
			Playback.wait(3000);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.arrestSearch.uIResultTable,
					arrestYear + "-" + arrestNo);
		}

		public void ClickPrintIcon() {
			uIMapNames.arrestSearch.uIPrintIconButton.click();
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
		}

		public void VerifyNoRecordFoundAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
			} else
				popup.acknowledge.okWithExpectedMessage(" 1011 - No Record Found");
		}

		public void EnterAtLocation() {
			uIMapNames.arrestSearch.uIArrestLocationEdit.sendKeys(BaseData.getNamesModuleValue("Location"));
			uIMapNames.arrestSearch.uIArrestLocationEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestSearch.uIArrestLocationVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void SelectRandomRowInGrid() {
			objectIdentification.randomIdentify.selectRandomGridRow(uIMapNames.arrestSearch.uIResultTable);
		}

		public void EnterAtIncidentLocation() {
			uIMapNames.arrestSearch.uIIncidentLocationEdit.sendKeys(BaseData.getNamesModuleValue("IncidentLocation"));
			uIMapNames.arrestSearch.uIIncidentLocationEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestSearch.uIIncidentLocationVerifyCheckBox.sendKeys(Keys.TAB);
		}

		public void VerifyAtNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.arrestSearch.uIResultTable,
							"Name", rowIndex));
		}

		public void VerifyAtCaseNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(uIMapNames.arrestSearch.uIResultTable,
							"Case#", rowIndex));
		}

		public void VerifyStatusOnHoldUsingCaseNo() {
			WebElement cell = objectIdentification.manualIdentify.getGridCell(uIMapNames.arrestSearch.uIResultTable,
					BaseData.getNamesModuleValue("CaseNo"), "Status");
			verify.ExpectedPropertyValueIsEqual("On Hold", cell.getText());
		}

		public void selectAtHow() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.arrestSearch.uIHowComboBox,
					BaseData.getNamesModuleValue("How"));
		}

		public void selectRowByAtNameID() {
			Playback.wait(3000);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.arrestSearch.uIResultTable,
					BaseData.getNamesModuleValue("NameID"));
			Playback.pageLoadThreadWait();
		}

		public void VerifyNumberDoesNotExit() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(1040) Number Does Not Exist");
			} else {
				popup.switchToAcknowledge();
				Playback.pageLoadThreadWait();
				popup.acknowledge.okWithExpectedMessage("(1040) Number Does Not Exist");

			}
		}

		public void enterAtArrestNo1() {
			uIMapNames.arrestSearch.uIArrestFromYear.clear();
			uIMapNames.arrestSearch.uIArrestFromNumber.clear();
			uIMapNames.arrestSearch.uIArrestFromYear
					.sendKeys(BaseData.getNamesModuleValue("ArrestNo1").substring(0, 2));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(BaseData.getNamesModuleValue("ArrestNo1").substring(3));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestSearch.uIArrestToYear.sendKeys(BaseData.getNamesModuleValue("ArrestNo1").substring(0, 2));
			uIMapNames.arrestSearch.uIArrestToNumber.sendKeys(BaseData.getNamesModuleValue("ArrestNo1").substring(3));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void enterAtArrestNo1InFrom() {
			uIMapNames.arrestSearch.uIArrestFromYear.clear();
			uIMapNames.arrestSearch.uIArrestFromNumber.clear();
			uIMapNames.arrestSearch.uIArrestFromYear
					.sendKeys(BaseData.getNamesModuleValue("ArrestNo1").substring(0, 2));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(BaseData.getNamesModuleValue("ArrestNo1").substring(4));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(Keys.TAB);
		}

		public void selectAtArrestNo1InGrid() {
			Playback.wait(3000);
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.arrestSearch.uIResultTable,
					BaseData.getNamesModuleValue("ArrestNo1"));
		}

		public void enterAtArrestNoInFrom() {
			uIMapNames.arrestSearch.uIArrestFromYear.sendKeys(BaseData.getNamesModuleValue("ArrestNo").substring(0, 2));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(BaseData.getNamesModuleValue("ArrestNo").substring(3));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(Keys.TAB);
		}

		public void reloadArrestSearch() {
			objectIdentification.manualIdentify.reloadScreen("Arrest Search");
		}

		public void EnterArrestNo(String arrestNo) {
			uIMapNames.arrestSearch.uIArrestFromYear.sendKeys(arrestNo.substring(0, 2));
			uIMapNames.arrestSearch.uIArrestFromNumber.sendKeys(arrestNo.substring(3));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(Keys.TAB);
			uIMapNames.arrestSearch.uIArrestToYear.sendKeys(arrestNo.substring(0, 2));
			uIMapNames.arrestSearch.uIArrestToNumber.sendKeys(arrestNo.substring(3));
			uIMapNames.arrestSearch.uICaseNoEdit.sendKeys(Keys.TAB);
		}

		public void verifyEnterAtLeastOneCriteriaAcknowledgeMessage() {
			popup.switchToAcknowledge();
			popup.acknowledge.okWithExpectedMessage("(6015) Enter at least one criteria/keyword to start the search");
		}

		public void enterAtToDateAsCurrentDate() {
			uIMapNames.arrestSearch.uIToDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapNames.arrestSearch.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void verifyNextButtonIsDisplayedAsNextInGrid() {
			String text = uIMapNames.arrestSearch.uINextButton.getText();
			verify.ExpectedValueIsTrue(text.contains("NEXT"));
		}

		public void clickNextButton() {
			uIMapNames.arrestSearch.uINextButton.click();
		}

		public void verifyPrevButtonIsDisplayedAsPrevInGrid() {
			String text = uIMapNames.arrestSearch.uIPREVButton.getText();
			verify.ExpectedValueIsTrue(text.contains("PREV"));
		}

		public void selectRowByAtCaseNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.arrestSearch.uIResultTable,
					BaseData.getNamesModuleValue("CaseNo"));

		}
	}

	public class GunPermitSearch {
		public void ClickCustomText() {
			uIMapNames.gunPermitSearch.uICustomText.click();
		}

		public void ClickAddNewButton() {
			uIMapNames.gunPermitSearch.uIAddNewButton.click();
		}

		public void ClickSearchButton() {
			uIMapNames.gunPermitSearch.uISearchButton.click();
			Playback.gridLoadThreadWait();
		}

		public void ClickAtGunPermitNumber() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.gunPermitSearch.uIGunPermitResultGrid, BaseData.getNamesModuleValue("GunPermit"));
		}

		public void VerifyCustomFieldEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.gunPermitSearch.uICustomEdit.isEnabled());
		}

		public void VerifyCustomFieldHide() {
			verify.ExpectedValueIsTrue(
					uIMapNames.gunPermitSearch.uICustomEdit.getAttribute("class").contains("textboxInactive"));
		}

		public void EnterAtSerialNo() {
			uIMapNames.gunPermitSearch.uISerialNoEdit.sendKeys(BaseData.getNamesModuleValue("Serial"));
		}

		public void SelectAtGunType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitSearch.uIGunTypeComboBox,
					BaseData.getNamesModuleValue("GunType"));
		}

		public void EnterAtGunMake() {
			uIMapNames.gunPermitSearch.uIGunMakeCodeEdit.sendKeys(BaseData.getNamesModuleValue("GunMake"));
			uIMapNames.gunPermitSearch.uIGunMakeCodeEdit.sendKeys(Keys.TAB);
		}

		public void SelectPermitTypeAsGun() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitSearch.uIPermitTypeComboBox,
					"GUN");
		}

		public void SelectPermitStatusAsApproved() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitSearch.uIPermitStatusComboBox,
					"Approved");
		}

		public void ClickBack() {
			uIMapNames.gunPermitSearch.uIBackButton.click();
		}

		public void ClickReset() {
			uIMapNames.gunPermitSearch.uIResetButton.click();
		}

		public void VerifyPermitTypeAsGun(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("GUN", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Permit Type", rowIndex));
		}

		public void VerifyPermitStatusAsApproved(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("Approved", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Permit Status", rowIndex));
		}

		public void VerifyAtGunType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("GunType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Gun Type", rowIndex));
		}

		public void VerifyAtSerialNo(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Serial"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Serial#", rowIndex));
		}

		public void ClickAtSerialNoInGridRow() {
			objectIdentification.manualIdentify
					.selectGridRowByCellInnerText(uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Approved");// BaseData.getNamesModuleValue("Serial")
		}

		public void selectAtPermitType() {
			Playback.controlReadyThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitSearch.uIPermitTypeComboBox,
					BaseData.getNamesModuleValue("PermitType"));
		}

		public void verifyAtGunPermit() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Gun Permit#");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("GunPermit")));
		}

		public void verifyAtOwner() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Owner");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("Owner")));
		}

		public void verifyAtGunMake() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Gun Make");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("GunMake")));
		}

		public void verifyAtApplicationDate() {
			Playback.controlReadyThreadWait();
			List<String> gridTableColumnValues = objectIdentification.manualIdentify
					.getGridTableColumnValues(uIMapNames.gunPermitSearch.uIGunPermitResultGrid, "Application Date");
			verify.ExpectedValueIsTrue(gridTableColumnValues.contains(BaseData.getNamesModuleValue("ApplicationDate")));
		}
	}

	public class GunPermitEntry {
		public GunPermitEntry() {

			if ((this.gunPermitEntryMainTab == null)) {
				this.gunPermitEntryMainTab = new GunPermitEntryMainTab();
			}

			if ((this.gunPermitEntryRegistrationTab == null)) {
				this.gunPermitEntryRegistrationTab = new GunPermitEntryRegistrationTab();
			}

			if ((this.gunPermitEntryHistoryTab == null)) {
				this.gunPermitEntryHistoryTab = new GunPermitEntryHistoryTab();
			}

			if ((this.gunPermitEntryNarrativeTab == null)) {
				this.gunPermitEntryNarrativeTab = new GunPermitEntryNarrativeTab();
			}
			if ((this.gunPermitEntryMD2016Tab == null)) {
				this.gunPermitEntryMD2016Tab = new GunPermitEntryMD2016Tab();
			}
		}

		public GunPermitEntryMainTab gunPermitEntryMainTab = null;
		public GunPermitEntryRegistrationTab gunPermitEntryRegistrationTab = null;
		public GunPermitEntryHistoryTab gunPermitEntryHistoryTab = null;
		public GunPermitEntryNarrativeTab gunPermitEntryNarrativeTab = null;
		public GunPermitEntryMD2016Tab gunPermitEntryMD2016Tab = null;

		public void EnterNameType() {
			uIMapNames.gunPermitEntry.uINameTypeEdit.sendKeys("A");
		}

		public void EnterNameID() {
			uIMapNames.gunPermitEntry.uINameIDEdit.sendKeys("99");
			uIMapNames.gunPermitEntry.uINameIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterLastNameAtWarrantLastName() {
			uIMapNames.gunPermitEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantLastName"));
		}

		public void EnterFirstNameAtWarrantFirstName() {
			uIMapNames.gunPermitEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("WarrantFirstName"));
			uIMapNames.gunPermitEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtLastName() {
			uIMapNames.gunPermitEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.gunPermitEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.gunPermitEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectName() {
			names.nameSearchHelpWindow.SelectName();
		}

		public void SelectAtName() {
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void SelectPermitType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.gunPermitEntry.uIPermitTypeComboBox);
		}

		public void SelectPermitStatus() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.gunPermitEntry.uIPermitStatusComboBox);
		}

		public void SelectPermitTypeAsGun() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitEntry.uIPermitTypeComboBox,
					"GUN");
		}

		public void SelectPermitStatusAsApproved() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitEntry.uIPermitStatusComboBox,
					"Approved");
		}

		public void EnterReason() {
			uIMapNames.gunPermitEntry.uIReasonEdit.sendKeys("For Self Production");
		}

		public void ClickSaveButton() {
			uIMapNames.gunPermitEntry.uISaveButton.click();
		}

		public void SaveCloseButton() {
			uIMapNames.gunPermitEntry.uISaveCloseButton.click();

		}

		public void ImageView() {
			uIMapNames.gunPermitEntry.uINameImageFrontViewButton.click();
		}

		public void SwitchMainTab() {
			uIMapNames.gunPermitEntry.uIMainTab.click();
		}

		public void SwitchNarrativeTab() {
			uIMapNames.gunPermitEntry.uINarrativeTab.click();
			objectIdentification.windowHandle.switchToFrame("frmNameComments");
		}

		public void SwitchAttachmentTab() {
			uIMapNames.gunPermitEntry.uIAttachmentTab.click();
		}

		public void SwitchRegistrationTab() {
			uIMapNames.gunPermitEntry.uIRegistrationTab.click();
		}

		public void SwitchHistoryTab() {
			uIMapNames.gunPermitEntry.uIHistoryTab.click();
		}

		public void CloseGunPermitEntryScreen() {
			uIMapNames.gunPermitEntry.driver.close();
		}

		public void VerifyWarrantIconButton() {
			verify.ExpectedValueIsTrue(
					uIMapNames.gunPermitEntry.uIWarrantIconButton.getAttribute("src").contains("warrant"));
		}

		public void VerifyRequiredAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1018) Required Entries are Missing");
		}

		public void SaveScreen() {
			uIMapNames.gunPermitEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void ClickReset() {
			uIMapNames.gunPermitEntry.uIResetButton.click();
		}

		public void enterAtNameID() {
			Playback.controlReadyThreadWait();
			uIMapNames.gunPermitEntry.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.gunPermitEntry.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));

		}

		public void selectAtPermitType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitEntry.uIPermitTypeComboBox,
					BaseData.getGeoModuleValue("PermitType"));
		}

		public void selectAtPermitStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.gunPermitEntry.uIPermitStatusComboBox,
					BaseData.getGeoModuleValue("PermitStatus"));
		}

		public void switchToRID256Tab() {
			uIMapNames.gunPermitEntry.uIRID256Tab.click();
			objectIdentification.windowHandle.switchToFrame("frmQnDataEnty.aspx?");
		}

		public void switchToQAFormTab() {
			uIMapNames.gunPermitEntry.uIQAFormTab.click();
			objectIdentification.windowHandle.switchToFrame("frmQnDataEnty.aspx?");
		}

	}

	public class GunPermitEntryMainTab {
		public void EnterOfficerPFID() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabOfficerIDEdit.sendKeys("Auto");
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabOfficerIDEdit.sendKeys(Keys.TAB);
		}

		public void EnterApplicationDate() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabApplicationDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(2));
		}

		public void EnterIssueDate() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabIssuedDateEdit
					.sendKeys(Randomized.getPreviousDate(5, "MM/dd/yyyy"));
		}

		public void EnterReappliedDate() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabReappliedDateEdit
					.sendKeys(Randomized.getPreviousDateByMonth(1));
		}

		public void EnterPurchaseDate() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabPurchaseDateEdit
					.sendKeys(Randomized.getCurrentDate());
		}

		public void EnterExpirationDate() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabExpiryDateEdit
					.sendKeys(Randomized.getFutureDateByMonth(12));
		}

		public void EnterCCHCheckDate() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabLastCCHCheckDateEdit
					.sendKeys(Randomized.getPreviousDate(10, "MM/dd/yyyy"));
		}

		public void EnterCustom() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabCustomEdit.sendKeys(Randomized.randomString(15));
		}

		public void ClickCustomText() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabCustomText.click();
		}

		public void VerifyCustomFieldHide() {
			verify.ExpectedValueIsTrue(uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabCustomEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void VerifyCustomMandatory() {
			verify.ExpectedValueIsTrue(uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIMainTabCustomText
					.getAttribute("kpifieldusage").contains("Mandatory"));
		}

	}

	public class GunPermitEntryRegistrationTab {
		public void EnterSerialNo() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabSerialNoEdit.sendKeys("xy15842458z");
		}

		public void EnterAtSerialNo() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabSerialNoEdit
					.sendKeys(BaseData.getNamesModuleValue("Serial"));
		}

		public void SelectAtGunType() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabGunTypeComboBox
					.sendKeys(BaseData.getNamesModuleValue("GunType"));
		}

		public void EnterAtGunMake() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabGunMakeEdit
					.sendKeys(BaseData.getNamesModuleValue("GunMake"));
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabGunMakeEdit.sendKeys(Keys.TAB);

		}

		public void SelectGunType() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabGunTypeComboBox.sendKeys("Pistol");
		}

		public void GunMakeLookupRandomSelection() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabGunMakeLookup.click();
			popup.kPICodedLookup.randomKPIHelpSelect();
		}

		public void EnterCaliber() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabCaliberEdit.sendKeys("Single");
		}

		public void EnterSoldDate() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIRegistrationTabSoldDateEdit
					.sendKeys(Randomized.getCurrentDate());
		}

	}

	public class GunPermitEntryHistoryTab {
		public void VerifyCurrentDate(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate("M/d/yyyy"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIHistoryTabResultTable, "Date Time",
							rowIndex));
		}

		public void VerifyPFID(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("AUTO", objectIdentification.manualIdentify.getGridCellInnerText(
					uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIHistoryTabResultTable, "PFID", rowIndex));
		}

		public void VerifyAtSerialNo(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIHistoryTabResultTable,
							"History", rowIndex)
					.contains(BaseData.getNamesModuleValue("Serial")));
		}

		public void VerifyAtGunType(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIHistoryTabResultTable,
							"History", rowIndex)
					.contains(BaseData.getNamesModuleValue("GunType")));
		}

		public void ClickCommentIcon(int rowIndex) {
			WebElement comment = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uIHistoryTabResultTable, "C", rowIndex);
			comment.click();
		}
	}

	public class GunPermitEntryNarrativeTab {
		public void EnterSubject() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uINarrativeTabSubjectEdit.sendKeys("AutomationTeam");
		}

		public void ClickEnterCommentsButton() {
			uIMapNames.gunPermitEntry.gunPermitEntryScreenTab.uINarrativeTabEnterCommentsButton.click();
			popup.confirm.yes();
		}

	}

	public class GunPermitEntryMD2016Tab {
		public void enterAtPFNo() {
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uIPFCodeEdit
					.sendKeys(BaseData.getNamesModuleValue("PFCode"));
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void taboutDateandTime() {
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uIDateEdit.sendKeys(Keys.TAB);
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void clickYes() {
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uIYesRadioButton.click();
		}

		public void clickTrue() {
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uITrueRadioButton.click();
		}

		public void clickSave() {
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uISaveButton.click();
		}

		public void clickLockButton() {
			uIMapNames.gunPermitEntry.gunPermitEntryRID256Tab.uILockButton.click();
		}

		public void VerifyLockPopupMessage() {
			popup.confirm.yesWithExpectedMessage(
					"(3506) This will lock the form and no further updates will be allowed. Are you sure you want to continue?");
		}

	}

	public class ContactEntry {
		public void SelectNameRelationAsBuildingOwner() {
			uIMapNames.contactEntry.uINameRelationCombobox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapNames.contactEntry.uINameRelationCombobox, "Building Owner");
			uIMapNames.contactEntry.uINameRelationArrow.click();
		}

		public void SelectNameRelationAsCheckAll() {
			uIMapNames.contactEntry.uINameRelationCombobox.click();
			objectIdentification.manualIdentify
					.selectRadControlDropDownValueSelect(uIMapNames.contactEntry.uINameRelationCombobox, "Check All");
			uIMapNames.contactEntry.uINameRelationArrow.click();
		}

		public void ClickSaveNClose() {

			uIMapNames.contactEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void SelectContactName() {
			uIMapNames.contactEntry.uILastNameEdit.click();
			uIMapNames.contactEntry.uIFirstNameEdit.sendKeys("B");
			// uIMapNames.contactEntry.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapNames.contactEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
			names.nameSearchHelpWindow.SelectName();
		}

		public void EnterAtLastName() {
			uIMapNames.contactEntry.uILastNameEdit.click();
			uIMapNames.contactEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
			uIMapNames.contactEntry.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapNames.contactEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
			names.nameSearchHelpWindow.SelectRowAtName1();
		}

		public void SelectPhoneTypeAsHome() {
			uIMapNames.contactEntry.uIPhoneTypeComboBox.click();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.contactEntry.uIPhoneTypeComboBox,
					"Home");
			uIMapNames.contactEntry.uIPhoneTypeComboBox.sendKeys(Keys.TAB);
		}

		public void EnterPhoneNumber() {
			uIMapNames.contactEntry.uIPhoneNumberEdit.clear();
			uIMapNames.contactEntry.uIPhoneNumberEdit.sendKeys(Randomized.randomNumberString(10));
		}

		public void ClickInactiveCheckbox() {
			uIMapNames.contactEntry.uIInactiveCheckbox.click();
		}

		public void VerifyInactiveDatEAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapNames.contactEntry.uIInactiveDateEdit.getAttribute("value"));
		}

	}

	public class AdditionalNumberScreen {
		public void SelectType() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.additionalNumberScreen.uITypeComboBox);
		}

		public void SelectAtType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.additionalNumberScreen.uITypeComboBox,
					BaseData.getNamesModuleValue("Type"));
		}

		public void EnterAtNumber() {
			uIMapNames.additionalNumberScreen.uINumberEdit.sendKeys(BaseData.getNamesModuleValue("Number"));
		}

		public void EnterAtComment() {
			uIMapNames.additionalNumberScreen.uICommentEdit.clear();
			uIMapNames.additionalNumberScreen.uICommentEdit.sendKeys(BaseData.getNamesModuleValue("Comments"));
		}

		public void ClickAddButton() {
			uIMapNames.additionalNumberScreen.uIAddButton.click();
		}

		public void ClickClearButton() {
			uIMapNames.additionalNumberScreen.uIClearButton.click();
		}

		public void ClickAtTypeInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.additionalNumberScreen.uIAdditionalNumberResultGrid,
					BaseData.getNamesModuleValue("Type"));
		}

		public void SaveScreen() {
			uIMapNames.additionalNumberScreen.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveScreen() {
			uIMapNames.additionalNumberScreen.uISaveButton.click();
		}

		public void VerifyAtType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Type"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.additionalNumberScreen.uIAdditionalNumberResultGrid, "Type", rowIndex));
		}

		public void VerifyAtComments(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Comments"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.additionalNumberScreen.uIAdditionalNumberResultGrid, "Comment", rowIndex));
		}

		public void VerifyAtNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Number"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.additionalNumberScreen.uIAdditionalNumberResultGrid, "Number", rowIndex));
		}

		public void VerifyTypeAndNumber() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Type"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.additionalNumberScreen.uITypeComboBox));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Number"),
					uIMapNames.additionalNumberScreen.uINumberEdit.getAttribute("value"));
		}
	}

	public class SocialMediaSites {
		public void ClickAddNew() {
			uIMapNames.socialMediaSites.uIAddNewButton.click();
		}

		public void ClickSearchButton() {
			uIMapNames.socialMediaSites.uISearchButton.click();
		}

		public void SelectAtSelectMediaType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.socialMediaSites.uISocialMediaTypeComboBox,
					BaseData.getNamesModuleValue("SelectMediaType"));
		}

		public void SelectAtCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.socialMediaSites.uIUCCategoryComboBox,
					BaseData.getNamesModuleValue("UCCategory"));
		}

		public void EnterAtUCName() {
			uIMapNames.socialMediaSites.uIUCNameEdit.clear();
			uIMapNames.socialMediaSites.uIUCNameEdit.sendKeys(BaseData.getNamesModuleValue("UCName"));
		}

		public void ClickAtUCNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.socialMediaSites.uISocialMediaSitesResultTable, BaseData.getNamesModuleValue("UCName"));
		}

		public void VerifyAtUCName(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("UCAccountName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaSites.uISocialMediaSitesResultTable, "UC Name", rowIndex));
		}

		public void VerifyAtUCCategory(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("UCCategory"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaSites.uISocialMediaSitesResultTable, "UC Category", rowIndex));
		}

		public void VerifyAtMediaType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MediaType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaSites.uISocialMediaSitesResultTable, "Media Type", rowIndex));
		}

		public void clickMediaTypeAtRow() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.socialMediaSites.uISocialMediaSitesResultTable,
					BaseData.getNamesModuleValue("SelectMediaType"));
			
		}
		public void clickInActiveCheckBox() {
			uIMapNames.socialMediaSites.uIInActiveCheckBox.click();
		}

		public void verifyMediaTypeISGreyOut() {
			WebElement gridCell = objectIdentification.manualIdentify.getGridCell(uIMapNames.socialMediaSites.uISocialMediaSitesResultTable, BaseData.getNamesModuleValue("SelectMediaType"));
			gridCell.getCssValue("color");
			System.out.println(gridCell.getCssValue("color"));
		}
		

		
	}

	public class SocialMediaSitesEntry {
		public void ClickSocialMediaButton() {
			uIMapNames.socialMediaSitesEntry.uISetupSocialMediaButton.click();
		}

		public void ClickReset() {
			uIMapNames.socialMediaSitesEntry.uIResetButton.click();
		}

		public void ClickGplusImageIcon() {
			uIMapNames.socialMediaSitesEntry.uIMediaTypeIconGplusImageView.click();
		}

		public void ClickTwitterImageIcon() {
			uIMapNames.socialMediaSitesEntry.uIMediaTypeIconTwitterImageView.click();
		}

		public void SelectAtUCCategory() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.socialMediaSitesEntry.uIUCCategoryComboBox, BaseData.getNamesModuleValue("UCCategory"));
		}

		public void EnterAtUCAccountName() {
			uIMapNames.socialMediaSitesEntry.uIUCAccountNameEdit
					.sendKeys(BaseData.getNamesModuleValue("UCAccountName"));
		}

		public void ClickSaveButton() {
			uIMapNames.socialMediaSitesEntry.uISaveButton.click();
		}

		public void EnterAtUCUserName() {
			uIMapNames.socialMediaSitesEntry.uIUCUserNameEdit.sendKeys(BaseData.getNamesModuleValue("UCUserName"));
		}

		public void EnterUCAccountPassword() {
			uIMapNames.socialMediaSitesEntry.uIUCAccountPasswordEdit
					.sendKeys(Randomized.randomAlphanumericSpecialCharsPasswordString(6));
		}

		public void EnterAtSiteID() {
			uIMapNames.socialMediaSitesEntry.uISiteIDNoEdit.sendKeys(BaseData.getNamesModuleValue("SiteID"));
		}

		public void EnterNotes() {
			uIMapNames.socialMediaSitesEntry.uINotesEdit.sendKeys(Randomized.randomString(50));
		}

		public void ClickLaunchBrowserButton() {
			uIMapNames.socialMediaSitesEntry.uILaunchBrowserButton.click();
		}

		public void SaveScreen() {
			uIMapNames.socialMediaSitesEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNCloseScreen() {
			uIMapNames.socialMediaSitesEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapNames.socialMediaSitesEntry.driver.close();
		}

		public void ClickAtNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.socialMediaSitesEntry.uISocialMediaSitesEntryResultTable,
					BaseData.getNamesModuleValue("NameID"));
		}

		public void VerifyAtDescriptionStatus() {
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaSitesEntry.uISelectedsocialMediaDescriptionTextView
					.getText().contains(BaseData.getNamesModuleValue("Description")));
		}

		public void VerifyAtMediaTypeStatus() {
			verify.ExpectedValueIsTrue(uIMapNames.socialMediaSitesEntry.uISelectedsocialMediaDescriptionTextView
					.getText().contains(BaseData.getNamesModuleValue("MediaType")));
		}

		public void VerifyAtURL() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("URL"),
					uIMapNames.socialMediaSitesEntry.uIURLEdit.getAttribute("value"));
		}

		public void VerifyAcknowledgeCategoryMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter the Category");
		}

		public void VerifyAcknowledgeUCNameMessage() {
			popup.acknowledge.okWithExpectedMessage("(3032) Enter the UC Name");
		}

		public void VerifyAtNameID(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaSitesEntry.uISocialMediaSitesEntryResultTable, "Name-ID", rowIndex));
		}

		public void VerifyAtFriendStatus(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Friend"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.socialMediaSitesEntry.uISocialMediaSitesEntryResultTable, "Friend Status",
							rowIndex));
		}

		public void clickInactiveCheckBox() {
			uIMapNames.socialMediaSites.uIInActiveCheckBox.click();
			
		}

		public void verifyAtUCCategory() {
			
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify.getDropDwonSelectedItem(uIMapNames.socialMediaSitesEntry.uIUCCategoryComboBox), 
					 BaseData.getNamesModuleValue("UCCategory"));
			
		}

		public void verifyUpdateSuccessFullBottomMessage() {
			
			verify.ExpectedPropertyValueIsEqual(uIMapNames.socialMediaSitesEntry.uIBottomMessage.getText(), "1003 - Update Successful");
			
			
		}

		public void verifyAdditionalSucessFullMessage() {
			verify.ExpectedPropertyValueIsEqual(uIMapNames.socialMediaSitesEntry.uIBottomMessage.getText(), "1002 - Addition Successful");
			
		}
	}

	public class SocialMediaSearch {
		public void EnterAtInformationVerifiedPFCode() {
			uIMapNames.socialMediaSearch.uIInformationVerifiedbyPFEdit.sendKeys(BaseData.getNamesModuleValue("PFCode"));
			uIMapNames.socialMediaSearch.uIInformationVerifiedbyPFEdit.sendKeys(Keys.TAB);
		}

		public void  EnterConfidentialSourceID(String SourceID) {
			uIMapNames.socialMediaSearch.uIConfidentialSourceIDYearEdit.sendKeys(SourceID.substring(0, 2));
			uIMapNames.socialMediaSearch.uIConfidentialSourceIDNumberEdit.sendKeys(SourceID.substring(3));
			uIMapNames.socialMediaSearch.uIConfidentialSourceIDNumberEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtUCAccountName() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.socialMediaSearch.uIUCAccountNameComboBox,
					BaseData.getNamesModuleValue("UCAccountName"));
		}

		public void EnterAtSiteID() {
			uIMapNames.socialMediaSearch.uISiteIDEdit.sendKeys(BaseData.getNamesModuleValue("SiteID"));
		}

		public void ClickSearchButton() {
			uIMapNames.socialMediaSearch.uISearchButton.click();
		}

		public void ClickResetButton() {
			uIMapNames.socialMediaSearch.uIResetButton.click();
			Playback.pageLoadThreadWait();
		}

		public void EnterInformationVerifiedBetweenAsCurrentDate() {
			uIMapNames.socialMediaSearch.uIInformationVerifiedFromDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapNames.socialMediaSearch.uIInformationVerifiedToDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void ClickBatchUpdateButton() {
			uIMapNames.socialMediaSearch.uIBatchUpdateButton.click();
		}

		public void ClickCheckBoxUsingID(String SourceID) {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, SourceID);
		}

		public void EnterAtUpdateVerifiedPFCode() {
			uIMapNames.socialMediaSearch.uIUpdateVerifiedPFEdit.sendKeys(BaseData.getNamesModuleValue("PFCode"));
			uIMapNames.socialMediaSearch.uIUpdateVerifiedPFEdit.sendKeys(Keys.TAB);
		}

		public void EnterAsUpdateNextReminderDate() {
			uIMapNames.socialMediaSearch.uIUpdateNextRemiderByDateEdit.clear();
			uIMapNames.socialMediaSearch.uIUpdateNextRemiderByDateEdit.sendKeys(Randomized.getFutureDate(1));
			uIMapNames.socialMediaSearch.uIUpdateNextRemiderByDateEdit.sendKeys(Keys.TAB);
		}

		public void ClickUpdateButton() {
			uIMapNames.socialMediaSearch.uIUpdateButton.click();
		}

		public void VerifyAsID(String SourceID, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(SourceID, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, "ID", rowIndex));
		}

		public void VerifyVerifiedOnAsCurrentDate(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, "Verified On",
							rowIndex)
					.contains(Randomized.getCurrentDate("M/d/yyyy")));
		}

		public void VerifyAsNextReminderDate(String NextReminderDate, int rowIndex) {
			
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable,
									"Next Reminder", rowIndex), Randomized.convertOneFormatToAnother(NextReminderDate));
			System.out.println(NextReminderDate);
			
		}

		public void VerifyNewNextReminderDate(int rowIndex) {
			/*verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, "Next Reminder",
							rowIndex)
					.contains((Randomized.getPreviousMonth(6).trim() + Randomized.getFutureDayNumber(2).trim()
							+ Randomized.getFutureYearByNoOfDays(10))));*/
			
			
			String NewNextReminderDate = objectIdentification.manualIdentify
			.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, "Next Reminder",
					rowIndex);
			
	//String date =	Randomized.convertOneFormatToAnother(Randomized.getFutureDate(1),"M/d/yyyy");
	
	//System.out.println(date);
		
		}
		public void selectJurisAsNull() {																							//Added by Abi
			 objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.socialMediaSearch.uIJurisCombobox, "N" ); 
		}

		public void clickAtCheckboxesByName(int i) {																				//Added by Abi
			
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, BaseData.getNamesModuleValue("Name") );
			
			if(i==1)
				objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
						uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, BaseData.getNamesModuleValue("Name"+i) );
					
		}
    
		public void VerifyVerifiedOnDate(String VerifiedOnDate , int RowIndex) {
			
			String GetVerifiedOnDate = objectIdentification.manualIdentify.getGridCell(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable, "Verified On", RowIndex).getText();
			
			verify.ExpectedPropertyValueIsEqual(GetVerifiedOnDate, Randomized.convertOneFormatToAnother(VerifiedOnDate));
			
		}

		public void verifyAtVerifiedPFNo() {																						//Added by Abi
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable,
							"VerifiedPF#",1), BaseData.getNamesModuleValue("PFCode"));			
		}

		public void selectAtJuris() {																								//Added by Abi
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.socialMediaSearch.uIJurisCombobox, BaseData.getNamesModuleValue("PFCode"));
		}

		public void verifyAtName() {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable,
							"Name",1), BaseData.getNamesModuleValue("Name"));		
		}

		public void verifyNextReminder() {
			verify.ExpectedPropertyValueIsEqual(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.socialMediaSearch.uISocialMediaSearchResultTable,
							"Next Reminder",1), BaseData.getNamesModuleValue("NextReminder"));
		}
	}

	public class CellStatus {

		public void SelectAtFacility() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.cellStatus.uIFacilityComboBox,
					BaseData.getNamesModuleValue("Facility"));
		}

		public void SelectAtInmateType() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.cellStatus.uIInmateTypeComboBox,
					BaseData.getNamesModuleValue("InmateType"));
		}

		public void SelectAtCellNo() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.cellStatus.uICellNoComboBox,
					BaseData.getNamesModuleValue("CellNo"));
			Playback.gridLoadThreadWait();
		}

		public void SelectAssignCellAtCellNo() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.cellStatus.uICellNoComboBox,
					BaseData.getNamesModuleValue("AssignCellNo"));
			Playback.gridLoadThreadWait();
		}

		public void ClickAssignCellButton() {
			uIMapNames.cellStatus.uIAssignCellButton.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickCellCheckButton() {
			uIMapNames.cellStatus.uICellCheckButton.click();
		}

		public void ClickCellUpdateButton() {
			uIMapNames.cellStatus.uICellUpdateButton.click();
		}

		public void ClickShowOnlyOccupiedCheckBox() {
			uIMapNames.cellStatus.uIShowOnlyOccupaiedCheckBox.click();
		}

		public void SelectAllCheckBox() {
			uIMapNames.cellStatus.uISelectAllCheckBox.click();
		}

		public void SelectRowAtCellNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.cellStatus.uICellStatusResultTable, BaseData.getNamesModuleValue("CellNo"));
		}

		public void ClickCategoryCellCheckButton() {
			uIMapNames.cellStatus.uIPopupCategoryCellCheckButton.click();
		}

		public void ClickActivityOkayAwakeButton() {
			uIMapNames.cellStatus.uIPopupActivityOkayAwakeButton.click();
		}

		public void EnterAtPopupNotes() {
			uIMapNames.cellStatus.uIPopupNotesEdit.sendKeys(BaseData.getNamesModuleValue("Notes"));
		}

		public void PopupSave() {
			uIMapNames.cellStatus.uIPopupSaveButton.click();
		}

		public void PopupClose() {
			uIMapNames.cellStatus.uIPopupCloseButton.click();
		}

		public void ReloadCellStatusTab() {
			objectIdentification.manualIdentify.selectRightClickTabMenuByTabText("Cell Status", "Reload Tab");
		}

		public void OKWithWebPageAlertWindowReloadScreenMessage() {
			Playback.popupThreadWait();
			Assert.assertTrue(Playback.driver.switchTo().alert().getText()
					.contains("Are you sure, you want to Reload the Screen?"));
			Playback.popupThreadWait();
			Playback.driver.switchTo().alert().accept();
		}

		public void VerifyAtNotes(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Notes"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.cellStatus.uICellStatusResultTable, "Notes", rowIndex));
		}

		public void VerifyAtDetaineeID(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("DetaineeID"),
					objectIdentification.manualIdentify.getGridCell(uIMapNames.cellStatus.uICellStatusResultTable,
							BaseData.getNamesModuleValue("DetaineeID"), "Detainee ID").getText());
		}

		public void ClickAtDetaineeID() {
			objectIdentification.manualIdentify.getGridCell(uIMapNames.cellStatus.uICellStatusResultTable,
					BaseData.getNamesModuleValue("DetaineeID"), "Detainee ID").click();
		}

		public void VerifyLastCheckAsBlank(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.cellStatus.uICellStatusResultTable, "Last Check", rowIndex)
					.contains(""));
		}

		public void VerifyNextCheckInMinsAtTempLocation(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("TemporaryLocation"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.cellStatus.uICellStatusResultTable, "Next Check in Mins", rowIndex));
		}

		public void ClickRefreshButton() {
			uIMapNames.cellStatus.uIRefreshButton.click();
			Playback.controlReadyThreadWait();
		}
		public void verifyAtDetaineeIDInGrid() {
			String DetaineeID = objectIdentification.manualIdentify.getGridCell(uIMapNames.cellStatus.uICellStatusResultTable,
					BaseData.getNamesModuleValue("DetaineeID"), "Detainee ID").getText();
			System.out.println(DetaineeID);
			verify.ExpectedPropertyValueIsEqual(DetaineeID, BaseData.getNamesModuleValue("DetaineeID"));
			
		}

		public void verifyAtName() {
			String CellName = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapNames.cellStatus.uICellStatusResultTable, BaseData.getNamesModuleValue("Name")).getText();

			verify.ExpectedValueIsTrue(CellName.contains(BaseData.getNamesModuleValue("Name")));
			
		}
	}

	public class CellStatusArrestEntry {
		public void EnterAtNameIDDetails() {
			uIMapNames.cellStatusArrestEntry.uINameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.cellStatusArrestEntry.uINameTypeIDEdit
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			uIMapNames.cellStatusArrestEntry.uINameTypeIDEdit.sendKeys(Keys.TAB);
			Playback.gridLoadThreadWait();
		}

		public void ClickReset() {
			uIMapNames.cellStatusArrestEntry.uIResetButton.click();
		}

		public void switchToCellTab() {
			uIMapNames.cellStatusArrestEntry.uICellTab.click();
			Playback.popupThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmJailCell");
		}

		public void VerfiyLastNameInNameEntryScreen() {
			String lastName = uIMapNames.cellStatusArrestEntry.uILastNameEdit.getAttribute("value");
			uIMapNames.cellStatusArrestEntry.uINameInfoButton.click();
			names.switchToNameEntry();
			names.nameEntry.VerifyLastName(lastName);
			names.nameEntry.closeTheScreen();
		}

		public void CloseScreen() {
			uIMapNames.cellStatusArrestEntry.driver.close(); 
		}

		public CellStatusArrestEntry() {
			if ((this.cellStatusArrestEntryCellTab == null)) {
				this.cellStatusArrestEntryCellTab = new CellStatusArrestEntryCellTab();
			}
		}

		public CellStatusArrestEntryCellTab cellStatusArrestEntryCellTab = null;

		public void verifyUpdateSucessFullMessage() {
			
			
		}

	}

	public class CellStatusArrestEntryCellTab {
		public void SelectAtCustodyReason() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICustodyReasonComboBox,
					BaseData.getNamesModuleValue("CustodyReason"));
		}

		public void ClickSaveButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uISaveButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.driver.close();
		}

		public void EnterCustodyAlert() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICustodyAlertEdit
					.sendKeys(Randomized.randomAlphanumeric(10));
		}

		public void SelectAtRiskLevel() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRiskLevelComboBox,
					BaseData.getNamesModuleValue("RiskLevel"));
		}

		public void EnterAssignCellAsC1() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys("C1");
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys(Keys.TAB);
		}

		public void EnterAssignCellAsAB1() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys("AB1");
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys(Keys.TAB);
		}

		public void EnterAssignCellAsC2() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.clear();
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys("C2");
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtAssignCellNo() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit
					.sendKeys(BaseData.getNamesModuleValue("AssignCellNo"));
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys(Keys.TAB);
		}

		public void EnterAssignBy() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignByPFEdit.click();
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignByPFEdit.sendKeys(Keys.TAB);
		}

		public void EnterAssignDateandTime() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignedDateEdit.sendKeys(Keys.TAB);
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignedTimeEdit.sendKeys(Keys.TAB);
		}

		public void ClickCellHistoryButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICellHistoryButton.click();
		}

		public void ClickAddActivityButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAddActivityButton.click();
		}

		public void ClickDetentionRecordButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIDetentionRecordButton.click();
		}

		public void ClickAssignCellInfoButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellInfoButton.click();
		}

		public void ClickCellCheckButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICellCheckButton.click();
		}

		public void ClickPopupCategoryDetaineeMealButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupCategoryDetaineeMealsButton.click();
			Playback.popupThreadWait();
		}

		public void ClickPopupActivityMealCompletedButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupActivityMealCompletedButton.click();
		}

		public void EnterAtPopupNotes() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupNotesEdit
					.sendKeys(BaseData.getNamesModuleValue("Notes"));
		}

		public void ClickPopupSave() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupSaveButton.click();
		}

		public void ClickViewTodaysLog() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupViewTodaysLogButton.click();
		}

		public void ClickPopupCloseButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupCloseButton.click();
		}

		public void SelectAtTemproaryLocation() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uITemporaryLocationComboBox,
					BaseData.getNamesModuleValue("TemporaryLocation"));
		}

		public void EnterMovedDateAndTime() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIMovedDateEdit.sendKeys(Keys.TAB);
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIMovedTimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtTempRemarks() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uITempRemarksEdit
					.sendKeys(BaseData.getNamesModuleValue("Remarks"));
		}

		public void ClickBackToCell() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIBacktoCellButton.click();
		}

		public void ClickQAFormButton() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIQAFormButton.click();
		}

		public void ClickAutoQAFormLink() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAutoQAFormLink.click();
		}

		public void ClickRemoveCheckBox() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRemoveCheckBox.click();
		}

		public void EnterRemovedByPF() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRemovedByPFEdit.click();
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRemovedByPFEdit.sendKeys(Keys.TAB);
		}

		public void EnterRemovedDateAndTime() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRemovedDateEdit.sendKeys(Keys.TAB);
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRemovedTimeEdit.sendKeys(Keys.TAB);
		}

		public void EnteAtNotes() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uINotesEdit
					.sendKeys(BaseData.getNamesModuleValue("Notes"));
		}

		public void VerifyRemovedDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRemovedDateEdit
							.getAttribute("value"));
		}

		public void VerifyAutoQAFormLinkLinkColor() {
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAutoQAFormLinkButton
							.getAttribute("style").contains("green"));
		}

		public void VerifyBackToCellButtonEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIBacktoCellButton.isEnabled());
		}

		public void VerifyBackToCellButtonDisabled() {
			verify.ExpectedValueIsTrue(uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIBacktoCellButton
					.getAttribute("disabled") == "true");
		}

		public void VerifyPopupSaveButtonDisabled() {
			verify.ExpectedValueIsTrue(uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupSaveButton
					.getAttribute("disabled").contains("true"));
		}

		public void VerifyPopupNewButtonEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupNewButton.isEnabled());
		}

		public void VerifyPopupDetaineeMealsColorGreen() {
			// verify.ExpectedValueIsTrue(uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupCategoryDetaineeMealsButton.GetAttribute("style").Contains("green"));
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIPopupActivityProvidedaMealButton
							.getAttribute("style").contains("green"));
		}

		public void VerifyMovedDateAsCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIMovedDateEdit
							.getAttribute("value"));
		}

		public void VerifyAcknowledgeCustodyMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Custody Reason");
		}

		public void VerifyAcknowledgeRisklevelMessage() {
			popup.acknowledge.okWithExpectedMessage("(30033) Enter Risk Level");
		}

		public void VerifyAcknowledgeInactiveCellMessage() {
			popup.acknowledge.okWithExpectedMessage("(6040) InActive Cell Selected");
		}

		public void VerifyConfirmationCellOccupiedMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm
						.noWithExpectedMessage("(6549) Cell is already occupied. Are you sure you want to continue?");
			} else
				popup.confirm
						.noWithExpectedMessage("(6549) Cell is already occupied. Are you sure you want to continue?");
		}

		public void VerifyAdditionsucessfulsMessage() {
			
			verify.ExpectedPropertyValueIsEqual(uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIBottomLeftSideStatusBar.getText(), 
					"1002 - Addition Successful");
		}

		public void VerifyAttachmentCellCheckButtonEnabled() {
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICellCheckButton.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAttachmentButton.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAddActivityButton.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIDetentionRecordButton.isDisplayed());
			verify.ExpectedValueIsTrue(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICellHistoryButton.isDisplayed());
			
		}

		public void VerifyTemporaryFieldsBlank() {
			if (Playback.browserType.equals("Chrome"))
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
						uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uITemporaryLocationComboBox) == "  --  ");
			else
				verify.ExpectedValueIsTrue(objectIdentification.manualIdentify.getDropDownSelectedItem(
						uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uITemporaryLocationComboBox) == "--");
			verify.ExpectedValueIsTrue(uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIMovedDateEdit
					.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIMovedTimeEdit
					.getAttribute("value").contains(""));
			verify.ExpectedValueIsTrue(uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uITempRemarksEdit
					.getAttribute("value").contains(""));
		}

		public void VerifyCustodyFieldsDisabled() {
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICustodyReasonComboBox.isEnabled());
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uICustodyAlertEdit.isEnabled());
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRiskLevelComboBox.isEnabled());
		}

		public void VerifyCellAssignFieldsDisabled() {
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.isEnabled());
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignByPFEdit.isEnabled());
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignedDateEdit.isEnabled());
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIRemarksEdit.isEnabled());
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uITemporaryLocationComboBox
							.isEnabled());
			verify.ExpectedValueIsFalse(
					uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uITempRemarksEdit.isEnabled());
		}

		public void EnterAssignCellAsC8() {
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys("C8");
			uIMapNames.cellStatusArrestEntry.cellStatusArrestEntryCellTab.uIAssignCellEdit.sendKeys(Keys.TAB);
		}
	}

	public class FISearch {
		public void ClickSearchButton() {
			uIMapNames.fISearch.uISearchButton.click();
		}

		public void SelectAtFIActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.fISearch.uIFIActivityComboBox,
					BaseData.getNamesModuleValue("FIActivity"));
		}

		public void SelectAtDisposition() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.fISearch.uIDispositionComboBox,
					BaseData.getNamesModuleValue("Disposition"));
		}

		public void EnterAtLastName() {
			uIMapNames.fISearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.fISearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
		}

		public void VerifyAtFIActivity() {
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("FIActivity"),
					objectIdentification.manualIdentify.getGridCell(uIMapNames.fISearch.uIFIResultTable,
							BaseData.getNamesModuleValue("FIActivity")).getText());
		}

		public void VerifyAtDispostion() {
			Playback.gridLoadThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Disposition"),
					objectIdentification.manualIdentify.getGridCell(uIMapNames.fISearch.uIFIResultTable,
							BaseData.getNamesModuleValue("Disposition")).getText());
		}

		public void ClickFINumberInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.fISearch.uIFIResultTable,
					BaseData.getNamesModuleValue("FINo"));
		}

		public void ClickAddNew() {
			uIMapNames.fISearch.uIAddNewButton.click();
		}
	}

	public class FIEntry {
		public void ClickSaveButton() {
			uIMapNames.fIEntry.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapNames.fIEntry.uISaveButton.click();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void CloseScreen() {
			uIMapNames.fIEntry.driver.close();
		}

		public void switchToNamesTab() {
			uIMapNames.fIEntry.uINamesTab.click();
			Playback.gridLoadThreadWait();
		}

		public void switchToNarrativeTab() {
			uIMapNames.fIEntry.uINarrativeTab.click();
			Playback.gridLoadThreadWait();
		}

		public void EnterAtLocation() {
			uIMapNames.fIEntry.uILocationEdit.sendKeys(BaseData.getNamesModuleValue("Location"));
			uIMapNames.fIEntry.uILocationEdit.sendKeys(Keys.TAB);
		}

		public void TabDateTime() {
			uIMapNames.fIEntry.uIDateEdit.sendKeys(Keys.TAB);
			uIMapNames.fIEntry.uITimeEdit.sendKeys(Keys.TAB);
		}

		public void TabOfficer() {
			uIMapNames.fIEntry.uIOfficerEdit.click();
			uIMapNames.fIEntry.uIOfficerEdit.sendKeys(Keys.TAB);
		}

		public void SelectFIActivity() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.fIEntry.uIFIActivityComboBox);
		}

		public void SelectDisposition() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.fIEntry.uIDispositionComboBox);
		}

		public void ClickAllTabs() {
			uIMapNames.fIEntry.uINamesTab.click();
			uIMapNames.fIEntry.uIVehiclesTab.click();
			uIMapNames.fIEntry.uINarrativeTab.click();
			uIMapNames.fIEntry.uIMapTab.click();
			uIMapNames.fIEntry.uIAttachmentsTab.click();
		}

		public FIEntry() {
			if ((this.fIEntryNamesTab == null)) {
				this.fIEntryNamesTab = new FIEntryNamesTab();
			}

			if ((this.fIEntryNarrativeTab == null)) {
				this.fIEntryNarrativeTab = new FIEntryNarrativeTab();
			}
		}

		public FIEntryNamesTab fIEntryNamesTab = null;
		public FIEntryNarrativeTab fIEntryNarrativeTab = null;

	}

	public class FIEntryNamesTab {
		public void EnterAtNameID() {
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabNameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabNameIDEdit
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabNameIDEdit.sendKeys(Keys.TAB);
		}

		public void VerifyJuvinalNameConfirmMessage() {
			popup.confirm.noWithExpectedMessage(
					"(6125) You have selected a Juvenile Name record. This individual is no longer a Juvenile. Select YES to use this Juvenile Name record, or select NO to choose the Adult Name record or to create a 'New' Adult Name record for this individual.");
		}

		public void VerifyNameIDDetailsRemoved() {
			verify.ExpectedPropertyValueIsEqual("",
					uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabNameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual("",
					uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabNameIDEdit.getAttribute("value"));
		}

		public void VerifyAddressFieldRemoved() {
			verify.ExpectedPropertyValueIsEqual("",
					uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabAddressEdit.getAttribute("value"));
		}

		public void ClickAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.fIEntry.fIEntryNamesTab.uINameTabResultTable, BaseData.getNamesModuleValue("Name"));
		}

		public void ClickAtName1InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.fIEntry.fIEntryNamesTab.uINameTabResultTable, BaseData.getNamesModuleValue("Name1"));
		}

		public void ClickAtName2InGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.fIEntry.fIEntryNamesTab.uINameTabResultTable, BaseData.getNamesModuleValue("Name2"));
		}

		public void ClickNameInfoIcon() {
			uIMapNames.fIEntry.fIEntryNamesTab.uIFINameInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickClearButton() {
			uIMapNames.fIEntry.fIEntryNamesTab.uIClearButton.click();
		}

		public void ClickAddButton() {
			uIMapNames.fIEntry.fIEntryNamesTab.uIAddButton.click();
		}

		public void EnterAtLastName() {
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabLastNameEdit
					.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void EnterAtFirstName() {
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabFirstNameEdit
					.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectAtName() {
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		}

		public void ClickSave() {
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabSaveButton.click();
		}

		public void EnterAtVehicle() {
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabVehicleEdit
					.sendKeys(BaseData.getNamesModuleValue("Vehicle").substring(0, 4));
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabStateComboBox
					.sendKeys(BaseData.getNamesModuleValue("Vehicle").substring(5));
			uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabStateComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(0, 1),
					uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabNameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(2),
					uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabNameIDEdit.getAttribute("value"));
		}

		public void VerifyAtVehicle() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Vehicle").substring(0, 4),
					uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabVehicleEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Vehicle").substring(5),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.fIEntry.fIEntryNamesTab.uINamesTabStateComboBox));
		}
	}

	public class FIEntryNarrativeTab {
		public void SaveAndVerifyInternalTab() {
			uIMapNames.fIEntry.fIEntryNarrativeTab.uIInternalSaveButton.click();
			// popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The
			// Entered Details?");
		}

		public void EnterRichTextComments() {

			Playback.controlReadyThreadWait();
			Actions actions = new Actions(Playback.driver);
			actions.moveToElement(uIMapNames.fIEntry.fIEntryNarrativeTab.uINarrativeRichTextEdit).click();
			actions.sendKeys(Randomized.randomString(50)).build().perform();
			Playback.controlReadyThreadWait();

		}

		public void VerifyNarrativeTabAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Narrative Tab. You must save or reset.");
		}

		public void VerifyConfirmSaveMessage() {
			popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
		}
	}

	public class Expungement {

		public void ClickOkModalAcknowledgeOkButton() {

			Playback.driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

		}

		public void EnterAtNameID() {
			uIMapNames.expungement.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.expungement.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			Playback.pageLoadThreadWait();
			uIMapNames.expungement.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
			uIMapNames.expungement.uINameTypeEdit.click();
			uIMapNames.expungement.uINameTypeEdit.clear();
			uIMapNames.expungement.uINameIDEdit.click();
			uIMapNames.expungement.uINameIDEdit.clear();
			Playback.pageLoadThreadWait();
			uIMapNames.expungement.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.expungement.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			Playback.pageLoadThreadWait();
			uIMapNames.expungement.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.pageLoadThreadWait();
		}

		public void VerifyExpungementConfirmWindowMessage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				// Playback.driver.switchTo().alert();
				String ConfirmMessage = uIMapNames.expungement.uIConfirmMessageTextView.getText();
				verify.ExpectedValueIsTrue(ConfirmMessage.contains("(6039)"));
				verify.ExpectedValueIsTrue(ConfirmMessage.contains(
						"A printout must be made of all deleted data before deletion to facilitate future request for data."));
				verify.ExpectedValueIsTrue(ConfirmMessage
						.contains("Expunged data can be viewed through the Expungement/Deletion Inquiry screen."));
				uIMapNames.expungement.uIOKButton.click();
			} else {
				String ConfirmMessage = uIMapNames.expungement.uIConfirmMessageTextView.getText();
				verify.ExpectedValueIsTrue(ConfirmMessage.contains("(6039)"));
				verify.ExpectedValueIsTrue(ConfirmMessage.contains(
						"A printout must be made of all deleted data before deletion to facilitate future request for data."));
				verify.ExpectedValueIsTrue(ConfirmMessage
						.contains("Expunged data can be viewed through the Expungement/Deletion Inquiry screen."));
				uIMapNames.expungement.uIOKButton.click();
			}
		}

		public void VerifyAtLastNameFirstName() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(
					BaseData.getNamesModuleValue("LastName") + ", " + BaseData.getNamesModuleValue("FirstName"),
					uIMapNames.expungement.uINameEdit.getAttribute("value"));
		}

		public void VerifyAtAddress() {
			verify.ExpectedValueIsTrue(uIMapNames.expungement.uIAddressEdit.getAttribute("value")
					.contains(BaseData.getNamesModuleValue("Address")));
		}

		public void SelectTypeAsDeletion() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.expungement.uITypeComboBox, "Deletion");
		}

		public void SelectTypeAsExpungement() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.expungement.uITypeComboBox,
					"Expungement");
		}

		public void EnterReason() {
			uIMapNames.expungement.uIReasonEdit.sendKeys("Automation Test");
			uIMapNames.expungement.uIReasonEdit.sendKeys(Keys.TAB);
		}

		public void ClickShowAllActivityCheckBox() {
			uIMapNames.expungement.uIShowAllActivityCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void DoubleClickAtCrashType() {
			Actions builder = new Actions(Playback.driver);
			builder.doubleClick(objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ActivityType")))
					.perform();
			builder = null;
			Playback.gridLoadThreadWait();
		}

		public void DoubleClickAtPropertyType() {
			Actions builder = new Actions(Playback.driver);
			builder.doubleClick(objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ActivityType")))
					.perform();
			builder = null;
			Playback.gridLoadThreadWait();
		}

		public void DoubleClickAtPropertyType1() {
			Actions builder = new Actions(Playback.driver);
			builder.doubleClick(objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ActivityType1")))
					.perform();
			builder = null;
			Playback.gridLoadThreadWait();
		}

		public void DeleteAtProperty() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ActivityType"));
		}

		public void VerifyAtCrashActivityType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.expungement.uIActivityResultGrid, "Activity Type", rowIndex));
		}

		public void VerifyAtCrashActivityNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.expungement.uIActivityResultGrid, "Activity#", rowIndex));
		}

		public void VerifyAtPropertyActivityType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.expungement.uIActivityResultGrid, "Activity Type", rowIndex));
		}

		public void VerifyAtPropertyActivityNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.expungement.uIActivityResultGrid, "Activity#", rowIndex));
		}

		public void VerifyExpungementAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6061) Select type to proceed further");
		}

		public void VerifyDeletedPropertyNotFound() {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.expungement.uIActivityResultGrid) == 0);
		}

		public void VerifyAtCaseActivityType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityType"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.expungement.uIActivityResultGrid, "Activity Type", rowIndex));
		}

		public void VerifyAtCallActivityType(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityType1"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.expungement.uIActivityResultGrid, "Activity Type", rowIndex));
		}

		public void VerifyAtCaseActivityNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.expungement.uIActivityResultGrid, "Activity#", rowIndex));
		}

		public void VerifyAtCallActivityNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityNo1"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.expungement.uIActivityResultGrid, "Activity#", rowIndex));
		}

		public void VerifyReasonAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6062) Type reason for Expungement");
		}

		public void DeleteDefendant1AtParkingNo() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ParkingNo"));
		}

		public void DeleteAtSelectedParkingDefendant1() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("Parking"));
		}

		public void VerifyAtName() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					uIMapNames.expungement.uINameEdit.getAttribute("value"));
		}

		public void VerifyTypeAsDeletion() {
			verify.ExpectedPropertyValueIsEqual("Deletion",
					objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapNames.expungement.uITypeComboBox));
		}

		public void VerifyTypeFieldAsDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapNames.expungement.uITypeComboBox.getAttribute("disabled")),
					"Verify Field Disabled");
		}

		public void ClickDeleteNameButton() {
			uIMapNames.expungement.uIDeleteNameButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyDeleteNameConfirmWindowMessage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithContainsMessage("(6041) Do you want to delete");
			} else {
				popup.switchToConfirm();
				String ConfirmMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(ConfirmMessage.contains("(6041) Do you want to delete"));
				popup.confirm.yes();
			}
		}

		public void VerifyDeletedNameAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("6072 - Name Deletion Completed");
			} else
				popup.acknowledge.okWithExpectedMessage(" 6072 - Name Deletion Completed");
		}

		public void DeleteAtArrestBookingRow() {
			objectIdentification.manualIdentify.deleteHGridRowByCellInnerTextArrestTable(
					uIMapNames.expungement.uIArrestResultGrid, BaseData.getNamesModuleValue("ArrestBooking"));
		}

		public void ClickArrestBookingNoConfirmation() {
			Playback.controlReadyThreadWait();
			popup.confirm.no();
		}

		public void VerifyCaseReportdLockApprovedMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage(
						"(6127) The selected name is involved in the following Case report(s), which have already been approved/locked.Do you with to continue?");
			} else
				popup.acknowledge.okWithExpectedMessage(
						" (6127) The selected name is involved in the following Case report(s), which have already been approved/locked.Do you with to continue?");
		}

		public void DeleteAtArrestBooking1Row() {
			objectIdentification.manualIdentify.deleteHGridRowByCellInnerTextExpungement(
					uIMapNames.expungement.uIArrestResultGrid, BaseData.getNamesModuleValue("ArrestBooking1"));
		}

		public void VerifyDeletedBookingConfirmeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
			Playback.pageLoadThreadWait();
		}

		public void VerifyDeleteExpungementConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(6133) Do you really want to expunge?");
			} else
				popup.confirm.yesWithExpectedMessage("(6133) Do you really want to expunge?");
			Playback.pageLoadThreadWait();
		}

		public void VerifyExpungeCompletedAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("6042 - Expungement Completed");
			} else
				popup.acknowledge.okWithExpectedMessage("6042 - Expungement Completed");
		}

		public void VerifyExpungeCompletedAcknowledgeMessage1() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(6042) Expungement Completed");
			} else
				popup.acknowledge.okWithExpectedMessage("(6042) Expungement Completed");
		}

		public void VerifyNoActivitiesAcknowledgeMessage() {
			Playback.gridLoadThreadWait();
			Playback.gridLoadThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("6059 - No Activities found for the Selected Booking");
			} else
				popup.acknowledge.okWithExpectedMessage(" 6059 - No Activities found for the Selected Booking");
		}

		public void VerifyDeletionDeniedAcknowledgeMessage() {
			Playback.gridLoadThreadWait();
			Playback.gridLoadThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(6068) Deletion denied: Name is referred in Expunged Booking");
			} else
				popup.acknowledge.okWithExpectedMessage("(6068) Deletion denied: Name is referred in Expunged Booking");
		}

		public void selectAtType() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.expungement.uITypeComboBox,
					BaseData.getNamesModuleValue("Type"));
		}

		public void deleteAtActivityRow() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.deleteHGridRowByCellInnerTextExpungement(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("Activity"));
		}

		public void verifyInvalidUserNamePassAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1049 - Invalid User Name Password");
		}

		public void verifyDeletionSuccessfullyAckMsg() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("1004 - Deletion Successful");
		}

		public void deleteAtSelectedCallActivity() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("Activity1"));
		}

		public void verifyAtCitationActivityNumber(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("ActivityNo"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.expungement.uIActivityResultGrid, "Activity#", rowIndex));
		}

		public void doubleClickAtCitationActivity() {
			Actions builder = new Actions(Playback.driver);
			builder.doubleClick(objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ActivityType")))
					.perform();
			builder = null;
			Playback.gridLoadThreadWait();
		}

		public void clickExpungementTypeAsOneOrMoreChanges() {
			uIMapNames.expungement.uIOneOrMoreChangesRadioButton.click();
		}

		public void clickExpungeButon() {
			uIMapNames.expungement.uIExpungeButton.click();
		}

		public void clickYesInExpungementConfirmPopup() {
			uIMapNames.expungement.uIYesButtonInPopup.click();

		}

		public void verifyPopupMessageWithLabelTextAndClickClose() {
			String label = uIMapNames.expungement.uITextLabel.getText();
			if (label.startsWith("E")) {
				verify.ExpectedPropertyValueIsEqual(label, "EXPUNGEMENT IS SUCCESSFUL");

			}

			else {
				verify.ExpectedPropertyValueIsEqual(label, "REINSTATE IS SUCCESSFUL");
			}
			uIMapNames.expungement.uIClosePopupButton.click();
			Playback.pageLoadThreadWait();

		}

		public void VerifyAcknowledgePopup() {

			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessageIfWindowExist("1011 - No Record Found");
			}

			else {
				popup.switchToAcknowledge();
				Playback.popupThreadWait();
				popup.acknowledge.okWithExpectedMessageIfWindowExist(" 1011 - No Record Found");
			}

		}

		public void verifyArrestBubbleIconNotDisplayed() {
			verify.ExpectedValueIsFalse(uIMapNames.expungement.uIArrestBubbleIcon.isDisplayed());
		}

		public void verifyArrestBubbleIconDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.expungement.uIArrestBubbleIcon.isDisplayed());
		}

		public void clickReinstateTheExpungementButton() {
			uIMapNames.expungement.uIReInstateButton.click();
		}

		public void verifyExpungedByWithName() {
			String ExpungedBy = uIMapNames.expungement.uIlblExpungedby.getText();
			String OfficerName = uIMapNames.expungement.uIlblExpByOfficerName.getText();
			// String DateTime = uIMapNames.expungement.uIExpByDateTime.getText();
			verify.ExpectedPropertyValueIsEqual(ExpungedBy + OfficerName,
					"Expunged by :" + BaseData.getNamesModuleValue("OfficerName"));
		}

		public void verifyReInstatedByWithName() {
			String ReInstatedBy = uIMapNames.expungement.uIlblReinstatedBy.getText();
			String OfficerName = uIMapNames.expungement.uIlblReinstatByOfficerName.getText();

			verify.ExpectedPropertyValueIsEqual(ReInstatedBy + OfficerName,
					"Reinstated by :" + BaseData.getNamesModuleValue("OfficerName"));
		}

		public void closeTheScreen() {
			uIMapNames.expungement.driver.close();
		}

		public void clickArrestInfoBubbleIcon() {
			uIMapNames.expungement.uIArrestBubbleIcon.click();
		}

		public void verifyNoOfBookingsAs1() {
			verify.ExpectedPropertyValueIsEqual(uIMapNames.expungement.uIBookingCountEdit.getAttribute("value"), "1");
		}

		public void verifyNoOfBookingsAs0() {
			verify.ExpectedPropertyValueIsEqual(uIMapNames.expungement.uIBookingCountEdit.getAttribute("value"), "0");
		}

		public void verifyExpungementTypeIsSelectedAsEntireArrest() {
			verify.ExpectedValueIsTrue(uIMapNames.expungement.uIEntireArrestRadioButton.isSelected());
		}

		public void clickDeleteInFindReplaceTableByName() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerTextExactRow(
					uIMapNames.expungement.uIFindReplaceTable, BaseData.getNamesModuleValue("Name"));
		}

		public void clickDeleteInFindReplaceTableByName1() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerTextFire(
					uIMapNames.expungement.uIFindReplaceTable, BaseData.getNamesModuleValue("Name1"));
		}

		public void deleteAtActivityRow1() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerTextFire(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ActivityType1"));
		}

		public void enterAtReason() {
			uIMapNames.expungement.uIReasonEdit.sendKeys(BaseData.getNamesModuleValue("Reason"));
			uIMapNames.expungement.uIReasonEdit.sendKeys(Keys.TAB);
		}

		public void deleteAtActivityNoInGrid() {
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("ActivityNo"));
		}

		public void verifyDeleteSuccessfulAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("1004 - Deletion Successful");
			} else {
				popup.acknowledge.okWithExpectedMessage("1004 - Deletion Successful");
			}

		}

		public void clickAtArrestBookingRow() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.expungement.uIArrestResultGrid,
					BaseData.getNamesModuleValue("ArrestBooking"));
		}

		public void deleteAtSelectedActivityRow() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.deleteSelectedGridRowByCellInnerText(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("Activity"));
		}

		public void deleteAtActivityRow1InGrid() {
			Playback.pageLoadThreadWait();
			objectIdentification.manualIdentify.deleteHGridRowByCellInnerTextExpungement(
					uIMapNames.expungement.uIActivityResultGrid, BaseData.getNamesModuleValue("Activity1"));
		}

		public void VerifyDeletionConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(6041) Do you want to delete?");
			} else
				popup.confirm.yesWithExpectedMessage("(6133) Do you really want to expunge?");
			Playback.pageLoadThreadWait();
		}

	}

	public class NameMapScreen {
		public void ClickResetButton() {
			uIMapNames.nameMapScreen.uIResetButton.click();
		}

		public void VerifyCurrentIncidentPeriodAs24hours() {
			verify.ExpectedPropertyValueIsEqual("Last 24 Hours", objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.nameMapScreen.uIOverLayCurrentPeriodComboBox));
		}

		public void SelectCurrentIncidentPeriodAsUserEntry() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapNames.nameMapScreen.uIOverLayCurrentPeriodComboBox, "User Entry");
			uIMapNames.nameMapScreen.uIOverLayCurrentPeriodComboBox.sendKeys(Keys.TAB);
		}

		public void EnterFromDateAsCurrentDate() {
			uIMapNames.nameMapScreen.uIFromDateEdit.click();
			uIMapNames.nameMapScreen.uIFromDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void EnterFromDateAs120Previous() {
			uIMapNames.nameMapScreen.uIFromDateEdit.click();
			Playback.controlReadyThreadWait();
			uIMapNames.nameMapScreen.uIFromDateEdit.clear();
			uIMapNames.nameMapScreen.uIFromDateEdit.sendKeys(Randomized.getPreviousDate(130, "MM/dd/yyyy"));
			uIMapNames.nameMapScreen.uIFromDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterToDateAsPreviousDate() {
			uIMapNames.nameMapScreen.uIToDateEdit.sendKeys(Randomized.getPreviousDate(2, "MM/dd/yyyy"));
			uIMapNames.nameMapScreen.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterToDateAsCurrentDate() {
			// uIMapNames.nameMapScreen.uIToDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapNames.nameMapScreen.uIToDateEdit.sendKeys(Keys.TAB);
		}

		public void ClearFromToDate() {
			uIMapNames.nameMapScreen.uIFromDateEdit.clear();
			uIMapNames.nameMapScreen.uIToDateEdit.clear();
			Playback.controlReadyThreadWait();
		}

		public void VerifyPreviousDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(2559) The 'To' date cannot be prior to the 'From' date .");
		}

		public void Verify120PreviousDateAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6156) The date range must be less than 120 days.");
		}

		public void CloseScreen() {
			uIMapNames.nameMapScreen.driver.close();
		}

		public void VerifyFromAndToDateRemoved() {
			verify.ExpectedValueIsTrue(uIMapNames.nameMapScreen.uIFromDateEdit.getAttribute("value") == "");
			verify.ExpectedValueIsTrue(uIMapNames.nameMapScreen.uIToDateEdit.getAttribute("value") == "");
		}
	}

	public class PhotoLineupEntry {
		public void ClickSearchButton() {
			uIMapNames.photoLineupEntry.uISearchButton.click();
		}

		public void VerifyBuildLineupButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.photoLineupEntry.uIBuildLineupButton.isEnabled());
		}

		public void ClickBuildLineupButton() {
			uIMapNames.photoLineupEntry.uIBuildLineupButton.click();
		}

		public void VerifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(0, 1),
					uIMapNames.photoLineupEntry.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(2),
					uIMapNames.photoLineupEntry.uINameTypeIDEdit.getAttribute("value"));
		}

		public void VerifyViewPhotoLineupButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.photoLineupEntry.uIViewPhotoLineupButton.isEnabled());
		}

		public void EnterAtCaseNo() {
			uIMapNames.photoLineupEntry.uICaseNoYearEdit
					.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(0, 2));
			uIMapNames.photoLineupEntry.uICaseNumberEdit.sendKeys(BaseData.getNamesModuleValue("CaseNo").substring(3));
			uIMapNames.photoLineupEntry.uICaseNumberEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtOfficer() {
			uIMapNames.photoLineupEntry.uIOfficerCodeEdit.sendKeys(BaseData.getNamesModuleValue("Officer"));
			uIMapNames.photoLineupEntry.uIOfficerCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtVictimWitnessNameID() {
			uIMapNames.photoLineupEntry.uIVictimWitnessNameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.photoLineupEntry.uIVictimWitnesNameTypeID
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			uIMapNames.photoLineupEntry.uIVictimWitnesNameTypeID.sendKeys(Keys.TAB);
		}

		public void EnterTabOfficerDateTime() {
			uIMapNames.photoLineupEntry.uIOfficerDateEdit.sendKeys(Keys.TAB);
			uIMapNames.photoLineupEntry.uIOfficerTimeEdit.sendKeys(Keys.TAB);
		}

		public void SelectPhotoSelected() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.photoLineupEntry.uIPhotoSelectComboBox);
		}

		public void EnterNotes() {
			uIMapNames.photoLineupEntry.uINotesEdit.sendKeys(Randomized.randomString(10));
		}

		public void ClickAdd() {
			uIMapNames.photoLineupEntry.uIAddButton.click();
		}

		public void VerifyAtCaseNoInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("CaseNo"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.photoLineupEntry.uIPhotoLineupCaseDetailsResultTable, "Case#", rowIndex));
		}

		public void VerifyCurrentDateInGrid(int rowIndex) {
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.photoLineupEntry.uIPhotoLineupCaseDetailsResultTable, "Date/Time",
							rowIndex)
					.contains(Randomized.getCurrentDate()));
		}

		public void SaveScreen() {
			uIMapNames.photoLineupEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void CloseScreen() {
			uIMapNames.photoLineupEntry.driver.close();
		}

		public void GetLineupNo(String lineupYear, String lineupNo) {
			Playback.testContext.setAttribute("lineupYear",
					uIMapNames.photoLineupEntry.uILineupYearEdit.getAttribute("value"));
			Playback.testContext.setAttribute("lineupNo",
					uIMapNames.photoLineupEntry.uILineupNumberEdit.getAttribute("value"));

		}

		public void SelectAtSex() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.photoLineupEntry.uISexComboBox,
					BaseData.getNamesModuleValue("Sex"));
			uIMapNames.photoLineupEntry.uISexComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtRace() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.photoLineupEntry.uIRaceComboBox,
					BaseData.getNamesModuleValue("Race"));
			uIMapNames.photoLineupEntry.uISexComboBox.sendKeys(Keys.TAB);
		}

		public void ClearAge() {
			uIMapNames.photoLineupEntry.uIAgeEdit.clear();
			uIMapNames.photoLineupEntry.uIAgeEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterAtVictimLastName() {
			uIMapNames.photoLineupEntry.uIVictimLastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
			uIMapNames.photoLineupEntry.uIVictimLastNameEdit.sendKeys(Keys.TAB);
		}

		public void enterAtVictimFirstName() {
			uIMapNames.photoLineupEntry.uIVictimFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
			uIMapNames.photoLineupEntry.uIVictimFirstNameEdit.sendKeys(Keys.TAB);

		}

		public void deleteRowByUsingNameInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.photoLineupEntry.uIPhotoLineupCaseDetailsResultTable,
					BaseData.getNamesModuleValue("Name"));
			WebElement row = objectIdentification.manualIdentify.getGridCell(
					uIMapNames.photoLineupEntry.uIPhotoLineupCaseDetailsResultTable, gridRowByCellInnerText, "X");
			row.click();
			Playback.controlReadyThreadWait();
			popup.confirm.yes();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtLineupNo() {

			String LineupYear = uIMapNames.photoLineupEntry.uILineupYearEdit.getAttribute("value");
			String LineupNo = uIMapNames.photoLineupEntry.uILineupNumberEdit.getAttribute("value");
			String Lineup = LineupYear + "-" + LineupNo;
			verify.ExpectedPropertyValueIsEqual(Lineup, BaseData.getNamesModuleValue("LineupNo"));
		}

		public void clickRefresh() {
			objectIdentification.manualIdentify.resetTheScreen();
		}
	}

	public class BuildPhotoLineup {
		public void VerifySaveandViewButtonDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapNames.buildPhotoLineup.uISaveandViewButton.getAttribute("disabled")));
		}

		public void EnterAtOfficer() {
			uIMapNames.buildPhotoLineup.uIOfficerCodeEdit.sendKeys(BaseData.getNamesModuleValue("Officer"));
		}

		public void EnterDateAsCurrentDate() {
			uIMapNames.buildPhotoLineup.uIDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void ClickAutoRandomImagesButton() {
			uIMapNames.buildPhotoLineup.uIAutoRandomSelectButton.click();
		}

		public void ClickSaveAndViewPDFButton() {
			uIMapNames.buildPhotoLineup.uISaveandViewButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyCompleteLineUpAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yes();
			} else {
				popup.switchToConfirm();
				String htmlErrorInfo = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(htmlErrorInfo.contains("(6109)"));
				verify.ExpectedValueIsTrue(htmlErrorInfo
						.contains("This will complete the Lineup and no further editing will be allowed."));
				verify.ExpectedValueIsTrue(htmlErrorInfo.contains("Do you want to proceed?"));
				popup.confirm.yes();
			}
		}

		public void VerifyAllFieldsFiledImages() {
			// IWebElement Position1 =
			// uIMapNames.buildPhotoLineup.uIImagePosition1.FindElement(By.XPath("//ul/li[@id='listimg_1']"));
			verify.ExpectedValueIsTrue(uIMapNames.buildPhotoLineup.uIImagePosition1
					.findElement(By.xpath("//ul/li[@id='listimg_1']")).isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.buildPhotoLineup.uIImagePosition1
					.findElement(By.xpath("//ul/li[@id='listimg_1']")).isDisplayed());
			verify.ExpectedValueIsTrue(uIMapNames.buildPhotoLineup.uIImagePosition1
					.findElement(By.xpath("//ul/li[@id='listimg_2']")).isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.buildPhotoLineup.uIImagePosition1
					.findElement(By.xpath("//ul/li[@id='listimg_3']")).isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.buildPhotoLineup.uIImagePosition1
					.findElement(By.xpath("//ul/li[@id='listimg_4']")).isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.buildPhotoLineup.uIImagePosition1
					.findElement(By.xpath("//ul/li[@id='listimg_5']")).isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.buildPhotoLineup.uIImagePosition1
					.findElement(By.xpath("//ul/li[@id='listimg_6']")).isEnabled());
		}

		public void CloseScreen() {
			uIMapNames.buildPhotoLineup.driver.close();
		}

		public void ClickPreviewLineUpButton() {
			uIMapNames.buildPhotoLineup.uIPreviewLineUpButton.click();
			Playback.controlReadyThreadWait();
		}
	}

	public class LineupSearch {
		public void EnterLinupNo(String lineupYear, String lineupNo) {
			uIMapNames.lineupSearch.uILineupYearEdit.sendKeys(lineupYear);
			uIMapNames.lineupSearch.uILineupNumberEdit.sendKeys(lineupNo);
			uIMapNames.lineupSearch.uILineupNumberEdit.sendKeys(Keys.TAB);
		}

		public void ClickSearch() {
			uIMapNames.lineupSearch.uISearchButton.click();
		}

		public void VerifyCurrentDateinRow(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.lineupSearch.uILineupSearchResultTable, "Lineup#", rowIndex));
		}

		public void VerifyLineUpNoinRow(String lineupYear, String lineupNo, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(lineupYear + "-" + lineupNo, objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.lineupSearch.uILineupSearchResultTable, "Date", rowIndex));
		}

		public void EnterAtLinupNo() {
			uIMapNames.lineupSearch.uILineupYearEdit.sendKeys(BaseData.getNamesModuleValue("LineupNo").substring(0, 2));
			uIMapNames.lineupSearch.uILineupNumberEdit.sendKeys(BaseData.getNamesModuleValue("LineupNo").substring(3));
			uIMapNames.lineupSearch.uILineupNumberEdit.sendKeys(Keys.TAB);
		}

		public void VerifyAtLineUpNoinRow(int index) {
			verify.ExpectedPropertyValueIsEqual(
					BaseData.getNamesModuleValue("LineupNo").substring(0, 2) + "-"
							+ BaseData.getNamesModuleValue("LineupNo").substring(3),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.lineupSearch.uILineupSearchResultTable, "Lineup#", index));
		}

		public void selectRowByAtLineUpNo() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.lineupSearch.uILineupSearchResultTable, BaseData.getNamesModuleValue("LineupNo"));
			Playback.controlReadyThreadWait();
		}

	}

	public class NameMerge {
		public NameMerge() {

			if ((this.nameMergeScreenDetailsPopup == null)) {
				this.nameMergeScreenDetailsPopup = new NameMergeScreenDetailsPopup();
			}
		}

		public NameMergeScreenDetailsPopup nameMergeScreenDetailsPopup = null;

		public void SelectJurisAsBL() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.nameMerge.uIJurisComboBox,
					"BL - Big lake Police Department");
		}

		public void EnterAtPrimaryNameID() {
			uIMapNames.nameMerge.uINameTypeEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("NameID").substring(2));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPrimaryONameID() {
			uIMapNames.nameMerge.uINameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("PrimaryONameID").substring(0, 1));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("PrimaryONameID").substring(2));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPrimaryANameID() {
			uIMapNames.nameMerge.uINameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("PrimaryANameID").substring(0, 1));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("PrimaryANameID").substring(2));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPrimaryJNameID() {
			uIMapNames.nameMerge.uINameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("PrimaryJNameID").substring(0, 1));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("PrimaryJNameID").substring(2));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void EnterAtPrimaryBNameID() {
			uIMapNames.nameMerge.uINameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("PrimaryBNameID").substring(0, 1));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(BaseData.getNamesModuleValue("PrimaryBNameID").substring(2));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void ClickSearchButton() {
			uIMapNames.nameMerge.uISearchButton.click();
		}

		public void ClickResetButton() {
			uIMapNames.nameMerge.uIResetButton.click();
		}

		public void EnterAtMergeNameID() {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeNameID").substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(BaseData.getNamesModuleValue("MergeNameID").substring(2));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void SelectAtMergeNameIDRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.uINameMergeLstResultTable, BaseData.getNamesModuleValue("MergeNameID"));
		}

		public void ClickSelectAllCheckBox() {
			uIMapNames.nameMerge.uISelectAllCheckbox.click();
		}

		public void ClickMergeButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameMerge.uIMergeButton.click();
		}

		public void ClickBatchMergeButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameMerge.uIBatchMergeButton.click();
		}

		public void VerifyNameMergeButtonDisabled() {
			verify.ExpectedValueIsTrue(
					Boolean.parseBoolean(uIMapNames.nameMerge.uIMergeButton.getAttribute("disabled")));
		}

		public void VerifyNameMergeButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIMergeButton.isEnabled());
		}

		public void VerifySelectedJurisAsBL() {
			verify.ExpectedPropertyValueIsEqual("BL - Big lake Police Department",
					objectIdentification.manualIdentify.getDropDownSelectedItem(uIMapNames.nameMerge.uIJurisComboBox));
		}

		public void VerifyAtPrimaryNameID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(0, 1),
					uIMapNames.nameMerge.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(2),
					uIMapNames.nameMerge.uINameIDEdit.getAttribute("value"));
		}

		public void VerifyAtPrimaryLastName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("LastName"),
					uIMapNames.nameMerge.uILastNameEdit.getAttribute("value"));
		}

		public void VerifyAtPrimaryFirstName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("FirstName"),
					uIMapNames.nameMerge.uIFirstNameEdit.getAttribute("value"));
		}

		public void ClickPrimaryNameInfoIcon() {
			uIMapNames.nameMerge.uIPrimaryNameInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtMergeNameID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeNameID").substring(0, 1),
					uIMapNames.nameMerge.uINameMergeUNTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeNameID").substring(2),
					uIMapNames.nameMerge.uINameMergeUNIDEdit.getAttribute("value"));
		}

		public void ClickMergeListTab() {
			uIMapNames.nameMerge.uIMergeListTab.click();
		}

		public void EnterAtMergeANameID() {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeANameID").substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNIDEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeANameID").substring(2));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtMergeBNameID() {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeBNameID").substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNIDEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeBNameID").substring(2));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtMergeJNameID() {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeJNameID").substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNIDEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeJNameID").substring(2));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyOTypeNameAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6054) O Type names can only be merged with other O Type names");
			Playback.controlReadyThreadWait();
		}

		public void EnterAtMergeONameID() {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeONameID").substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNIDEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeONameID").substring(2));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtMergeONameIDInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeONameID"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.nameMerge.uINameMergeLstResultTable, "ID", rowIndex));
		}

		public void VerifyAtMergeANameIDInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeANameID"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.nameMerge.uINameMergeLstResultTable, "ID", rowIndex));
		}

		public void VerifyAtMergeJNameIDInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeJNameID"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.nameMerge.uINameMergeLstResultTable, "ID", rowIndex));
		}

		public void VerifyAtMergeBNameIDInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeBNameID"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.nameMerge.uINameMergeLstResultTable, "ID", rowIndex));
		}

		public void SelectMergeONameIDCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.uINameMergeLstResultTable, BaseData.getNamesModuleValue("MergeONameID"));
		}

		public void SelectMergeANameIDCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.uINameMergeLstResultTable, BaseData.getNamesModuleValue("MergeANameID"));
		}

		public void SelectMergeJNameIDCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.uINameMergeLstResultTable, BaseData.getNamesModuleValue("MergeJNameID"));
		}

		public void SelectMergeBNameIDCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.uINameMergeLstResultTable, BaseData.getNamesModuleValue("MergeBNameID"));
		}

		public void EnterAtLastName() {
			uIMapNames.nameMerge.uINameMergeLastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void VerifyConfirmAdultBusinessNameWarningMessage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				String warningMessage = Playback.driver.switchTo().alert().getText();
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"Merging Business name into  Adult  name will cause loss of all data in the Business Tab."));
				verify.ExpectedValueIsTrue(warningMessage.contains("Do you want to proceed?"));
				popup.confirm.yes();
			} else {

				String warningMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(warningMessage.contains("(6097) **WARNING**"));
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"Merging Business name into Adult name will cause loss of all data in the Business Tab."));
				verify.ExpectedValueIsTrue(warningMessage.contains("Do you want to proceed?"));
				popup.confirm.yes();
			}
		}

		public void VerifyConfirmJuvenileBusinessNameWarningMessage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				String warningMessage = Playback.driver.switchTo().alert().getText();
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"Merging Business name into  Juvenile  name will cause loss of all data in the Business Tab."));
				verify.ExpectedValueIsTrue(warningMessage.contains("Do you want to proceed?"));
				popup.confirm.yes();
			} else {

				String warningMessage = uIMapPopup.confirmWindow.uIErrorInfoTextEdit.getText();
				verify.ExpectedValueIsTrue(warningMessage.contains("(6097) **WARNING**"));
				verify.ExpectedValueIsTrue(warningMessage.contains(
						"Merging Business name into Juvenile name will cause loss of all data in the Business Tab."));
				verify.ExpectedValueIsTrue(warningMessage.contains("Do you want to proceed?"));
				popup.confirm.yes();
			}
		}

		public void VerifyInvalidJTypeNameAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(8520) Invalid name type - J Name Not allowed to Merge with A Name");
			Playback.controlReadyThreadWait();
		}

		public void EnterAtMergeJNameType() {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeJNameID").substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtMergeANameType() {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("MergeANameID").substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void VerifyInvalidATypeNameAcknowledgeMessage() {
			popup.acknowledge
					.okWithExpectedMessage("(8520) Invalid name type - A Name Not allowed to Merge with J Name");
			Playback.controlReadyThreadWait();
		}

		public void VerifyConfirmBusinessNameJuvenileMessage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				String warningMessage = Playback.driver.switchTo().alert().getText();
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(6096) Proceed with merging  Juvenile  name into  Business  name?"));
				popup.confirm.yes();
			} else {

				popup.confirm.yesWithExpectedMessage("(6096) Proceed with merging Juvenile name into Business name?");
			}
		}

		public void VerifyConfirmBusinessNameAdultMessage() {
			Playback.controlReadyThreadWait();
			if (Playback.browserType.equals("Chrome")) {
				String warningMessage = Playback.driver.switchTo().alert().getText();
				verify.ExpectedValueIsTrue(
						warningMessage.contains("(6096) Proceed with merging  Adult  name into  Business  name?"));
				popup.confirm.yes();
			} else {

				popup.confirm.yesWithExpectedMessage("(6096) Proceed with merging Adult name into Business name?");
			}
		}

		public void VerifyMergeCompletedAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("6053 - Names merged successfully");
			Playback.controlReadyThreadWait();
		}

		public void CloseScreen() {
			uIMapNames.nameMerge.driver.close();
		}

		public void VerifyPrimaryNameID(String nameType, String nameID) {
			verify.ExpectedPropertyValueIsEqual(nameType, uIMapNames.nameMerge.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(nameID, uIMapNames.nameMerge.uINameIDEdit.getAttribute("value"));
		}

		public void EnterAtLastName1() {
			uIMapNames.nameMerge.uINameMergeLastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName1"));
		}

		public void EnterAtFirstName1() {
			uIMapNames.nameMerge.uINameMergeFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName1"));
		}

		public void clickMergeHistory() {
			uIMapNames.nameMerge.uIMergeHistoryButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtMergeNameIDInUnMergeGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeNameID"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameMerge.uIUnMergeDetailsResultTable, "Merged From ID", rowIndex));
		}

		public void clickUnMergeCancel() {
			uIMapNames.nameMerge.uIUnMergeCancelButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyAtNameInUnMergeGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergeNameID"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.nameMerge.uIUnMergeDetailsResultTable, "Name", rowIndex));
		}

		public void verifyAtMergedPFInUnMergeGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("MergedPF"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.nameMerge.uIUnMergeDetailsResultTable, "Merged PF", rowIndex));
		}

		public void clickAtMergedIDRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.uIUnMergeDetailsResultTable, BaseData.getNamesModuleValue("MergeNameID"));
		}

		public void verifyUnMergeButtonenabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIUnMergeButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIUnMergeButton.isEnabled());
		}

		public void verifyUnMergeCancelButtonenabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIUnMergeCancelButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIUnMergeCancelButton.isEnabled());
		}

		public void verifyMergeHistoryButtonenabled() {
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIMergeHistoryButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIMergeHistoryButton.isEnabled());
		}

		public void clickUnMergebutton() {
			uIMapNames.nameMerge.uIUnMergeButton.click();
			Playback.controlReadyThreadWait();
		}

		public void verifyUnNameMergeConfirmMessage() {
			popup.confirm.yesWithContainsMessage("(6040) Are you sure you want to continue?");
		}

		public void verifyUnmergedCompletedAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("6163 - Name unmerged successfully");
			Playback.controlReadyThreadWait();
		}

		public void verifyNameunmergedSuccessfulMessage() {
			verify.ExpectedValueIsTrue(uIMapNames.nameMerge.uIBottomLeftSideStatusBar.getText()
					.contains("6163 - Name unmerged successfully"));
		}

		public void enterActiveNameID(String nameID) {
			uIMapNames.nameMerge.uINameTypeEdit.sendKeys(nameID.substring(0, 1));
			uIMapNames.nameMerge.uINameTypeEdit.sendKeys(Keys.TAB);
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(nameID.substring(2));
			uIMapNames.nameMerge.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void enterActiveNameIDInMergeListTab(String nameID) {
			uIMapNames.nameMerge.uINameMergeUNTypeEdit.sendKeys(nameID.substring(0, 1));
			uIMapNames.nameMerge.uINameMergeUNTypeEdit.sendKeys(Keys.TAB);
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(nameID.substring(2));
			uIMapNames.nameMerge.uINameMergeUNIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}
	}

	public class NameMergeScreenDetailsPopup {
		public void ClickNameDetailsMergeButton() {
			Playback.controlReadyThreadWait();
			uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uIMergeButton.click();
		}

		public void VerifyAliasNameConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm
						.yesWithExpectedMessage("(6082) Update the merged Name as an Alias and the Address as Other?");
			} else
				popup.confirm
						.yesWithExpectedMessage("(6082) Update the merged Name as an Alias and the Address as Other?");
			Playback.controlReadyThreadWait();
		}

		public void VerifyMergeFieldsConfirmMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage(
						"(6065) Selected Merge fields will replace Primary fields. Do you want to proceed? ");
			} else
				popup.confirm.yesWithExpectedMessage(
						"(6065) Selected Merge fields will replace Primary fields. Do you want to proceed?");
			Playback.controlReadyThreadWait();
		}

		public void VerifyMergeCompletedAcknowledgeMessage() {
			Playback.controlReadyThreadWait();
			popup.acknowledge.okWithExpectedMessage("(6053) Names merged successfully");
			Playback.controlReadyThreadWait();
		}

		public void ClickRaceRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "Race");
		}

		public void ClickEthnicRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "Ethnic");
		}

		public void ClickDOBRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "DOB");
		}

		public void ClickSexRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "Sex");
		}

		public void ClickAddressRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "Address");
		}

		public void ClickPhoneCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "Phone#");
		}

		public void ClickBusinessIDCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "BusinessId");
		}

		public void ClickBusinessTypeCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "BusinessType");
		}

		public void clickJacketNoRowCheckbox() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapNames.nameMerge.nameMergeScreenDetailsPopup.uINameMergeDetailsResultTable, "Jacket#");
		}

	}

	public class GangSearch {
		public void ClickAddNew() {
			Playback.controlReadyThreadWait();
			uIMapNames.gangSearch.uIAddNewButton.click();
		}

		public void ClickSearch() {
			uIMapNames.gangSearch.uISearchButton.click();
		}

		public void EnterAtGangName() {
			Playback.controlReadyThreadWait();
			uIMapNames.gangSearch.uIGangNameEdit.sendKeys(BaseData.getNamesModuleValue("GangName"));
		}

		public void SelectRowByAtGangName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.gangSearch.uIGangSearchGridTable, BaseData.getNamesModuleValue("GangName"));
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtGangName(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("GangName"),
					objectIdentification.manualIdentify
							.getGridCellInnerText(uIMapNames.gangSearch.uIGangSearchGridTable, "Gang Name", rowIndex));
		}

		public void VerifyKnownMembersAs0(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual("0", objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.gangSearch.uIGangSearchGridTable, "Known Members", rowIndex));
		}

		public void verifyAtKnownMember(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("KnownMember"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.gangSearch.uIGangSearchGridTable, "Known Members", rowIndex));
			
		}
	}

	public class GangMasterEntry {
		public void EnterAtGangName() {
			uIMapNames.gangMasterEntry.uIGangNameEdit.sendKeys(BaseData.getNamesModuleValue("GangName"));
		}

		public void ClickSave() {
			uIMapNames.gangMasterEntry.uISaveButton.click();
		}

		public void SaveScreen() {
			uIMapNames.gangMasterEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void EnterDateEstablishedAsCurrentDate() {
			uIMapNames.gangMasterEntry.uIDateEstablishedEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void EnterEstimatedMembers() {
			uIMapNames.gangMasterEntry.uIEstimatedMembersEdit.sendKeys(String.valueOf(BaseData.getNamesModuleValue("EstimatedMembers")));
		}

		public void EnterAtAddress1() {
			uIMapNames.gangMasterEntry.uIAddress1Edit.sendKeys(BaseData.getNamesModuleValue("Address1"));
			uIMapNames.gangMasterEntry.uIAddress1Edit.sendKeys(Keys.TAB);
		}

		public void ClickIdentificationTab() {
			uIMapNames.gangMasterEntry.uIIdentificationTab.click();
		}

		public void ClickMembersTab() {
			uIMapNames.gangMasterEntry.uIMembersTab.click();
		}

		public void ClickMapTab() {
			uIMapNames.gangMasterEntry.uIMapTab.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickVehicleTab() {
			uIMapNames.gangMasterEntry.uIVehicleTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmGangVehicle.aspx");
		}

		public void ClickNotesTab() {
			uIMapNames.gangMasterEntry.uINotesTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameGangNotes.aspx");
		}

		public void Verify8EnterMandatoryDataAckMsg() {
			Playback.pageLoadThreadWait();
			popup.acknowledge.okWithExpectedMessage("(8) Enter mandatory data");
		}

		public void VerifyAdditionSccessful() {
			String AdditionMessage = uIMapNames.gangMasterEntry.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(AdditionMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);

		}

		public void VerifyUpdateSuccessfulMessage() {
			verify.ExpectedValueIsTrue(uIMapNames.gangMasterEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update Successful"));
		}

		public void switchToMembersImageFrame() {
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmAllImages.aspx");
		}

		public void VerifyAcknowledgeUpdateVehicleTab() {
			popup.acknowledge
					.okWithExpectedMessage("(1051) Updated data exists in the Vehicle Tab. You must save or reset.");
		}

		public void ClickActivityTab() {
			uIMapNames.gangMasterEntry.uIActivityTab.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameGangActivity.aspx");
		}
		public void verifyAtGangName() {
			
			verify.ExpectedPropertyValueIsEqual(uIMapNames.gangMasterEntry.uIGangNameEdit.getAttribute("value"), 
					BaseData.getNamesModuleValue("GangName"));
		}
		public void verifyAtEstablishedDateAsCurrentDate() {
		
			verify.ExpectedPropertyValueIsEqual(uIMapNames.gangMasterEntry.uIDateEstablishedEdit.getAttribute("value"), 
					Randomized.getCurrentDate());
		}
		public void verifyAtEstimatedMembers(){
			verify.ExpectedPropertyValueIsEqual(uIMapNames.gangMasterEntry.uIEstimatedMembersEdit.getAttribute("value"), 
					BaseData.getNamesModuleValue("EstimatedMembers"));
		}
		public void verifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(uIMapNames.gangMasterEntry.uIAddress1Edit.getAttribute("value"), 
					BaseData.getNamesModuleValue("Address1"));
		}
		

		public GangMasterEntry() {
			if ((this.identificationTab == null)) {
				this.identificationTab = new IdentificationTab();
			}

			if ((this.membersTab == null)) {
				this.membersTab = new MembersTab();
			}

			if ((this.gangMapTab == null)) {
				this.gangMapTab = new GangMapTab();
			}

			if ((this.gangVehicleTab == null)) {
				this.gangVehicleTab = new GangVehicleTab();
			}

			if ((this.gangActivityTab == null)) {
				this.gangActivityTab = new GangActivityTab();
			}

			if ((this.gangNotesTab == null)) {
				this.gangNotesTab = new GangNotesTab();
			}
		}

		public IdentificationTab identificationTab = null;
		public MembersTab membersTab = null;
		public GangMapTab gangMapTab = null;
		public GangVehicleTab gangVehicleTab = null;
		public GangActivityTab gangActivityTab = null;
		public GangNotesTab gangNotesTab = null;

	}

	public class IdentificationTab {
		public void SelectAtIdentificationType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTypeComboBox,
					BaseData.getNamesModuleValue("IdentificationType"));
			uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTypeComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyTypeCodeLabelAtIdentificationType() {
			Playback.controlReadyThreadWait();
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("IdentificationType"),
					uIMapNames.gangMasterEntry.identificationTab.uITypeCodeTextView.getText());
		}

		public void SelectAtTypeCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangMasterEntry.identificationTab.uITypeCodeComboBox,
					BaseData.getNamesModuleValue("TypeCode"));
		}

		public void EnterDescription() {
			uIMapNames.gangMasterEntry.identificationTab.uIDescriptionEdit.sendKeys(Randomized.randomString(25));
		}

		public void ClickAddButton() {
			uIMapNames.gangMasterEntry.identificationTab.uIAddButton.click();
		}

		public void VerifyAtIdentificationInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Identification"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTable,
									BaseData.getNamesModuleValue("Identification"))
							.getText());
		}

		public void VerifyAtIdentificationTypeInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("IdentificationType"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTable,
									BaseData.getNamesModuleValue("IdentificationType"))
							.getText());
		}

		public void SelectIdentificationType() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTypeComboBox);
			uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTypeComboBox.sendKeys(Keys.TAB);
		}

		public String GetIdentificationType() {
			 String uIIdentification = objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTypeComboBox);
			Playback.setTestContextAttribute("uIIdentification", uIIdentification);
			return uIIdentification;

		}

		public void VerifyIdentificationLableTextView(String uIIdentification) {
			Playback.controlReadyThreadWait();
			if (uIIdentification.equals("Clothing")) {
				verify.ExpectedValueIsTrue(uIMapNames.gangMasterEntry.identificationTab.uIClothingTypeLabelTextView
						.getText().contains(uIIdentification), "Verify clothing frame shows");
			} else {
				verify.ExpectedPropertyValueIsEqual(uIIdentification,
						uIMapNames.gangMasterEntry.identificationTab.uIIdentificationLabelTextView.getText());
			}
		}

		public void SelectTypeCode() {
			Playback.controlReadyThreadWait();
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.gangMasterEntry.identificationTab.uITypeCodeComboBox);
			uIMapNames.gangMasterEntry.identificationTab.uITypeCodeComboBox.sendKeys(Keys.TAB);

		}

		public void VerifyIdentificationTypeInGrid(String uIIdentification, int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(uIIdentification,
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.gangMasterEntry.identificationTab.uIIdentificationTable, "Identification Type",
							rowIndex));
		}

		public void VerifyAddImageGridDisplayed() {
			verify.ExpectedValueIsTrue(uIMapNames.gangMasterEntry.identificationTab.uIAddNewButton.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapNames.gangMasterEntry.identificationTab.uIUpdateButton.isDisplayed());
			
			
		}

		public void SelectAtSymbols() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangMasterEntry.identificationTab.uISymbolsComboBox,
					BaseData.getNamesModuleValue("Symbols"));
			uIMapNames.gangMasterEntry.identificationTab.uISymbolsComboBox.sendKeys(Keys.TAB);
		}
	}

	public class MembersTab {

		public void VerifyAffiliateNameToGangButtonDisabled() {
			verify.ExpectedValueIsTrue(!uIMapNames.gangMasterEntry.membersTab.uIAffiliateNameToGangButton.isEnabled(),
					"Affiliated Name to Gang Button should be disabled");
		}

		public void VerifyAffiliateNameToGangButtonEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.gangMasterEntry.membersTab.uIAffiliateNameToGangButton.isEnabled(),
					"Affiliated Name to Gang Button should be enabled");
		}

		public void EnterAtNameID() {

			uIMapNames.gangMasterEntry.membersTab.uINameTypeEdit
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(0, 1));
			uIMapNames.gangMasterEntry.membersTab.uINameIDEdit
					.sendKeys(BaseData.getNamesModuleValue("NameID").substring(3));
			uIMapNames.gangMasterEntry.membersTab.uINameIDEdit.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void ClickAffiliateNameToGangButton() {
			uIMapNames.gangMasterEntry.membersTab.uIAffiliateNameToGangButton.click();
		}

		public void VerifyAtNameIDInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.gangMasterEntry.membersTab.uIMembersTable,
									BaseData.getNamesModuleValue("NameID"), "Name ID")
							.getText());
		}

		public void VerifyAtNameInGrid() {
			/*verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.gangMasterEntry.membersTab.uIMembersTable,
									BaseData.getNamesModuleValue("Name"), "Name")
							.getText());*/
			
			String gridCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(uIMapNames.gangMasterEntry.membersTab.uIMembersTable,
					BaseData.getNamesModuleValue("Name")).getText();
		         
			
	         verify.ExpectedValueIsTrue(gridCellInnerText.contains(BaseData.getNamesModuleValue("Name")));
					
			
			
		}

		public void VerifyAffliatedDateAsCurrentDateInGird(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(Randomized.getCurrentDate(),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapNames.gangMasterEntry.membersTab.uIMembersTable, "Affiliated Date", rowIndex));
		}

		public void ClickNameMining1ImageIcon() {
			uIMapNames.gangMasterEntry.membersTab.uINameMiningImageIcon1.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickAtNameInGrid() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.gangMasterEntry.membersTab.uIMembersTable, BaseData.getNamesModuleValue("Name"));
			Playback.controlReadyThreadWait();
		}
	}

	public class GangMapTab {
		public void ClickMapLayerButton() {
			uIMapNames.gangMasterEntry.gangMapTab.uIMapLayerButtonButton.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectOverlay() {
			Playback.controlReadyThreadWait();
			uIMapNames.gangMasterEntry.gangMapTab.uISelectOverlayRadControlComboBox.click();
			objectIdentification.randomIdentify
					.selectRadControlDropDownCheckBoxes(uIMapNames.gangMasterEntry.gangMapTab.uISelectOverlayComboBox);
			uIMapNames.gangMasterEntry.gangMapTab.uISelectOverlayRadControlComboBox.sendKeys(Keys.TAB);
		}

		public void selectAtOverlay() {
			Playback.controlReadyThreadWait();
			uIMapNames.gangMasterEntry.gangMapTab.uISelectOverlayRadControlComboBox.click();
			objectIdentification.manualIdentify.selectRadControlDropDownValueSelect(
					uIMapNames.gangMasterEntry.gangMapTab.uISelectOverlayComboBox,
					BaseData.getNamesModuleValue("Overlay"));
			uIMapNames.gangMasterEntry.gangMapTab.uISelectOverlayRadControlComboBox.sendKeys(Keys.TAB);
		}
	}

	public class GangVehicleTab {
		public void EnterAtVehicle() {
			uIMapNames.gangMasterEntry.gangVehicleTab.uIVehicleEdit
					.sendKeys(BaseData.getNamesModuleValue("Vehicle").substring(0, 6));
			uIMapNames.gangMasterEntry.gangVehicleTab.uIVehicleStateComboBox
					.sendKeys(BaseData.getNamesModuleValue("Vehicle").substring(7));
			uIMapNames.gangMasterEntry.gangVehicleTab.uIVehicleStateComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangMasterEntry.gangVehicleTab.uIActivityComboBox,
					BaseData.getNamesModuleValue("Activity"));
			uIMapNames.gangMasterEntry.gangVehicleTab.uIActivityComboBox.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapNames.gangMasterEntry.gangVehicleTab.uIAddButton.click();
		}

		public void EnterAtVehicle1() {
			uIMapNames.gangMasterEntry.gangVehicleTab.uIVehicleEdit
					.sendKeys(BaseData.getNamesModuleValue("Vehicle1").substring(0, 6));
			uIMapNames.gangMasterEntry.gangVehicleTab.uIVehicleStateComboBox
					.sendKeys(BaseData.getNamesModuleValue("Vehicle1").substring(7));
			uIMapNames.gangMasterEntry.gangVehicleTab.uIVehicleStateComboBox.sendKeys(Keys.TAB);
		}

		public void SaveInternalTab() {
			uIMapNames.gangMasterEntry.gangVehicleTab.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtVehicleUsingActivity() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Vehicle"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.gangMasterEntry.gangVehicleTab.uIVehicleTabTable,
									BaseData.getNamesModuleValue("Activity"), "Plate")
							.getText());
		}
	}

	public class GangActivityTab {
		public void SelectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangMasterEntry.gangActivityTab.uIActivityComboBox,
					BaseData.getNamesModuleValue("Activity"));
			// uIMapNames.gangMasterEntry.gangActivityTab.uIActivityComboBox.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void ClickCollapseAllCheckBox() {
			uIMapNames.gangMasterEntry.gangActivityTab.uICollapseAllCheckBox.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickActivityRadioButton() {
			uIMapNames.gangMasterEntry.gangActivityTab.uIActivityButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtPersonNameInGrid(int rowIndex) {
			Playback.controlReadyThreadWait();
			verify.ExpectedValueIsTrue(
					objectIdentification.manualIdentify
							.getGridTableRow(uIMapNames.gangMasterEntry.gangActivityTab.uIActivityTabTable, rowIndex)
							.getText().contains(BaseData.getNamesModuleValue("PersonName")),
					"Verify Person Name shows in Grid");
		}
	}

	public class GangNotesTab {
		public void TabUpdateDateTime() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIUpdateDateEdit.sendKeys(Keys.TAB);
			uIMapNames.gangMasterEntry.gangNotesTab.uIUpdateTimeEdit.sendKeys(Keys.TAB);
		}

		public void EnterAtUpdatedBy() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIUpdatedByCodeEdit
					.sendKeys(BaseData.getNamesModuleValue("UpdatedBy"));
			uIMapNames.gangMasterEntry.gangNotesTab.uIUpdatedByCodeEdit.sendKeys(Keys.TAB);
		}

		public void EnterNotesAsAutomation() {
			uIMapNames.gangMasterEntry.gangNotesTab.uINotesEdit.sendKeys("Automation");
		}

		public void ClickAddButton() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIAddButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickEditIcon() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIEditIcon.click();
			Playback.controlReadyThreadWait();
		}

		public void EnterPopupNotesAsAutomationWorks() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIPopupNotesEdit.sendKeys("Automation Works");
		}

		public void ClickPopupSaveButton() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIPopupSaveButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyNotesUpdated() {
		
			verify.ExpectedValueIsTrue(uIMapNames.gangMasterEntry.gangNotesTab.uINotesGridCommentsText.getText()
					.contains("Automation Works"));
		}

		public void ClickDeleteIcon() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIDeleteIcon.click();
			popup.confirm.yes();
		}

		public void ClickShowAllCheckBox() {
			uIMapNames.gangMasterEntry.gangNotesTab.uIShowAllCheckBox.click();
		}
	
		public void verifyAtGridIsEmpty() {
			objectIdentification.manualIdentify.checkElementAvailableOrNot(uIMapNames.gangMasterEntry.gangNotesTab.uINotesGridCommentsText);
		}

	}

	public class GangDetailEntry {

		public void ClickIdentificationTab() {
			uIMapNames.gangDetailEntry.uIIdentificationTab.click();
		}

		public void ClickMainTab() {
			uIMapNames.gangDetailEntry.uIMainTab.click();
		}

		public void ClickNotesTab() {
			uIMapNames.gangDetailEntry.uINotesTab.click();

		}

		public void switchToNotesTab() {
			uIMapNames.gangDetailEntry.uINotesTab.click();
			Playback.pageLoadThreadWait();
			objectIdentification.windowHandle.switchToFrame("frmNameGangNotes");
		}

		public void Save() {
			uIMapNames.gangDetailEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveNClose() {
			uIMapNames.gangDetailEntry.uISaveNCloseButton.click();
			popup.confirm.yes();
		}

		public void VerifyAtGangName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("GangName"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.gangDetailEntry.uIGangNameComboBox));
		}

		public void VerifyAtNameID() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(0, 1),
					uIMapNames.gangDetailEntry.uINameTypeEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("NameID").substring(2),
					uIMapNames.gangDetailEntry.uINameTypeIDEdit.getAttribute("value"));

		}

		public void VerifyAdditionSucessfulMessageMessage() {
			verify.ExpectedValueIsTrue(uIMapNames.gangDetailEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1002 - Addition Successful"));
		}
		public void VerifyIpdateSucessfulMessageMessage() {
			verify.ExpectedValueIsTrue(uIMapNames.gangDetailEntry.uIBottomLeftSideStatusBar.getText()
					.contains("1003 - Update Successful"));
		}
		
		

		public void CloseScreen() {
			uIMapNames.gangDetailEntry.driver.close();
		}

		public void ClickNameInfoIcon() {
			uIMapNames.gangDetailEntry.uINameInfoIcon.click();
			Playback.controlReadyThreadWait();
		}

		public GangDetailEntry() {
			if ((this.gangDetailMainTab == null)) {
				this.gangDetailMainTab = new GangDetailMainTab();
			}

			if ((this.gangDetailIdentificationTab == null)) {
				this.gangDetailIdentificationTab = new GangDetailIdentificationTab();
			}

			if ((this.gangDetailNotesTab == null)) {
				this.gangDetailNotesTab = new GangDetailNotesTab();
			}

		}

		public GangDetailMainTab gangDetailMainTab = null;
		public GangDetailIdentificationTab gangDetailIdentificationTab = null;
		public GangDetailNotesTab gangDetailNotesTab = null;

	}

	public class GangDetailMainTab {

		public void EnterAffiliationDateAsCurrentDate() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uIAffiliationDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void SelectStatus() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapNames.gangDetailEntry.gangDetailMainTab.uIStatusComboBox);
		}

		public void EnterCurrentStatusDateAsCurrentDate() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uICurrentStatusDateEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void SelectAtRank() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangDetailEntry.gangDetailMainTab.uIRankComboBox, BaseData.getNamesModuleValue("Rank"));
			uIMapNames.gangDetailEntry.gangDetailMainTab.uIRankComboBox.sendKeys(Keys.TAB);
		}

		public void ClickJudicalFindingCheckbox() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uIJudicialFindingcheckbox.click();
		}

		public void ClickSelfAdmissionCheckbox() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uISelfAdmissionCheckbox.click();
		}

		public void ClickGangTattoosCheckbox() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uIGangTattoosCheckbox.click();
		}

		public void ClickPossessionOfGangMaterialCheckbox() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uIPossessionOfGangMaterialCheckbox.click();
		}

		public void EnterComments() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uICommentsEdit.sendKeys(Randomized.randomString(15));
		}

		public void SelectAtStatus() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangDetailEntry.gangDetailMainTab.uIStatusComboBox,
					BaseData.getNamesModuleValue("Status"));
			uIMapNames.gangDetailEntry.gangDetailMainTab.uIStatusComboBox.sendKeys(Keys.TAB);
		}

		public void EnterAtLocationOfActivity() {
			uIMapNames.gangDetailEntry.gangDetailMainTab.uILocationOfActivityEdit
					.sendKeys(BaseData.getNamesModuleValue("LocationOfActivity"));
		}

	}

	public class GangDetailIdentificationTab {

		public void SelectAtIdentificationType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIIdentificationTypeComboBox,
					BaseData.getNamesModuleValue("IdentificationType"));
			uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIIdentificationTypeComboBox.sendKeys(Keys.TAB);
		}

		public void VerifyTypeCodeLabelAtIdentificationType() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("IdentificationType"),
					uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uITypeCodeTextView.getText());
		}

		public void SelectAtTypeCode() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uITypeCodeComboBox,
					BaseData.getNamesModuleValue("TypeCode"));
		}

		public void EnterDescription() {
			uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIDescriptionEdit
					.sendKeys(Randomized.randomString(15));
		}

		public void ClickAddButton() {
			uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIAddButton.click();
		}

		public void VerifyAtIdentificationInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Identification"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIIdentificationTable,
									BaseData.getNamesModuleValue("Identification"))
							.getText());
		}

		public void VerifyAtIdentificationTypeInGrid() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("IdentificationType"),
					objectIdentification.manualIdentify
							.getGridCell(uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIIdentificationTable,
									BaseData.getNamesModuleValue("IdentificationType"))
							.getText());
		}

		public void SelectAtGraffiti() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIGraffitiComboBox,
					BaseData.getNamesModuleValue("Graffiti"));
		}

		public String GetIdentificationType() {
			
			String uIIdentification =  objectIdentification.manualIdentify.getDropDownSelectedItem(
					uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIIdentificationTypeComboBox);
			
			return uIIdentification; 
			
			
		}

		public void VerifyTextcodeLableTextView(String uIIdentification) {
			Playback.controlReadyThreadWait();
			if (uIIdentification == "Clothing") {
				verify.ExpectedValueIsTrue(
						uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIClothingTypeLabelTextView.getText()
								.contains(uIIdentification),
						"Verify clothing frame shows");
			} else {
				verify.ExpectedPropertyValueIsEqual(uIIdentification,
						uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uITypeCodeTextView.getText());
			}
		}

		public void SelectIdentificationType() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIIdentificationTypeComboBox);
			uIMapNames.gangDetailEntry.gangDetailIdentificationTab.uIIdentificationTypeComboBox.sendKeys(Keys.TAB);
		}

	}

	public class GangDetailNotesTab {

		public void TabOutUpdatedDate() {
			uIMapNames.gangDetailEntry.gangDetailNotesTab.uIUpdateDateEdit.sendKeys(Keys.TAB);
		}

		public void EnterNotes() {
			uIMapNames.gangDetailEntry.gangDetailNotesTab.uINotesEdit.sendKeys(Randomized.randomString(15));
		}

		public void ClickAddButton() {
			uIMapNames.gangDetailEntry.gangDetailNotesTab.uIAddButton.click();
		}

	}

	public class ArrestSearchHelpWindow {
		public void ClickAddNew() {
			uIMapNames.arrestSearchHelpWindow.uIAddNewButton.click();
		}

		public void verifyNameByLastNameAndFirstName() {
			WebElement name = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.arrestSearchHelpWindow.uIResultTable, BaseData.getTestContextData("LastName"));
			verify.ExpectedPropertyValueIsEqual(name.getText(),
					BaseData.getTestContextData("LastName") + ", " + BaseData.getTestContextData("FirstName"));
		}

		public void closeTheScreen() {
			uIMapNames.arrestSearchHelpWindow.driver.close();
		}

		public void clickOnGridRow(int i) {
		objectIdentification.manualIdentify.selectGridRowByIndex(uIMapNames.arrestSearchHelpWindow.uIResultTable, i); 	
			
		}

	}

	public class SuspectEntry {

		public void EnterSuspectName() {
			Playback.controlReadyThreadWait();
			uIMapNames.suspectEntry.uILastNameEdit.click();
			uIMapNames.suspectEntry.uILastNameEdit.sendKeys(Randomized.manualPlusRandomString("Sebastian", 3));
			uIMapNames.suspectEntry.uIFirstNameEdit.sendKeys(Randomized.manualPlusRandomString("Thomas", 2));
			uIMapNames.suspectEntry.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void SelectRace() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIRaceComboBox);
		}

		public void SelectSex() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectEntry.uISexComboBox);
		}

		public void EnterHeight() {
			uIMapNames.suspectEntry.uIHeightEdit.sendKeys("170");
			uIMapNames.suspectEntry.uIHeight2Edit.sendKeys("180");
		}
		public void EnterAtHeight() {
			uIMapNames.suspectEntry.uIHeightEdit.sendKeys(BaseData.getNamesModuleValue("Height"));
			uIMapNames.suspectEntry.uIHeight2Edit.sendKeys(BaseData.getNamesModuleValue("Height2"));
		}

		public void SelectEyes() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIEyesComboBox);
		}

		public void SelectHair() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIHairColorComboBox);
		}

		public void ClickSave() {
			uIMapNames.suspectEntry.uISaveButton.click();
		}

		public void Save() {
			uIMapNames.suspectEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void SaveAndClose() {
			uIMapNames.suspectEntry.uISaveCloseButton.click();
			popup.confirm.yes();
		}

		public void EnterWeight() {
			uIMapNames.suspectEntry.uIWeightEdit.sendKeys("65");
			uIMapNames.suspectEntry.uIWeight2Edit.sendKeys("80");
		}
		public void EnterAtWeight() {
			uIMapNames.suspectEntry.uIWeightEdit.sendKeys(BaseData.getNamesModuleValue("Weight"));
			uIMapNames.suspectEntry.uIWeight2Edit.sendKeys(BaseData.getNamesModuleValue("Weight2"));
		}

		public void EnterAge() {
			uIMapNames.suspectEntry.uIAgeEdit.sendKeys("30");
			uIMapNames.suspectEntry.uIAge2Edit.sendKeys("35");
		}

		public void SelectItem() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIItemComboBox);
		}

		public void SelectColor() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIColorComboBox);
		}

		public void EnterDescription() {
			uIMapNames.suspectEntry.uIDescriptionEdit.sendKeys(Randomized.randomString(15));
		}

		public void ClickAddIcon() {
			uIMapNames.suspectEntry.uIAddButton.click();
		}

		public void EnterComments() {
			uIMapNames.suspectEntry.uICommentsEdit.sendKeys(Randomized.randomString(100));
		}

		public void EnterAtLastNameFirstName() {
			uIMapNames.suspectEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
			uIMapNames.suspectEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));

		}

		public void EnterAtLastName1FirstName1() {
			uIMapNames.suspectEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName1"));
			uIMapNames.suspectEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName1"));
		}

		public void EnterAtLastName2FirstName2() {
			uIMapNames.suspectEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName2"));
			uIMapNames.suspectEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName2"));
		}

		public void EnterAtLastName3FirstName3() {
			uIMapNames.suspectEntry.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName3"));
			uIMapNames.suspectEntry.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName3"));
		}

		public void EnterRandomAge() {
			uIMapNames.suspectEntry.uIAgeEdit.sendKeys("18");
			uIMapNames.suspectEntry.uIAge2Edit.sendKeys("50");
		}

		public void Close() {
			uIMapNames.suspectEntry.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void enterAtAddress() {
			uIMapNames.suspectEntry.uIAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address"));
		}

		public void verifyAgeFieldIsNotFilled() {
			uIMapNames.suspectEntry.uIAgeEdit.clear();
			String value = uIMapNames.suspectEntry.uIAgeEdit.getAttribute("value");
			uIMapNames.suspectEntry.uIAge2Edit.clear();
			String value2 = uIMapNames.suspectEntry.uIAge2Edit.getAttribute("value");
			verify.ExpectedValueIsTrue(value.isEmpty());
			verify.ExpectedValueIsTrue(value2.isEmpty());
		}

		public void verifySaveSaveAndCloseButtonsEnabled() {
			verify.ExpectedValueIsTrue(uIMapNames.suspectEntry.uISaveButton.isEnabled());
			verify.ExpectedValueIsTrue(uIMapNames.suspectEntry.uISaveCloseButton.isEnabled());

		}

		public void verifyAtSuspectName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("LastName1"),
					uIMapNames.suspectEntry.uILastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("FirstName1"),
					uIMapNames.suspectEntry.uIFirstNameEdit.getAttribute("value"));
		}
		public void VerifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Address"),
					uIMapNames.suspectEntry.uIAddressEdit.getAttribute("value"));
		}
		public void VerifyAtHeightandWeight() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Height"),
					uIMapNames.suspectEntry.uIHeightEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Height2"),
					uIMapNames.suspectEntry.uIHeight2Edit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Weight"),
					uIMapNames.suspectEntry.uIWeightEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Weight2"),
					uIMapNames.suspectEntry.uIWeight2Edit.getAttribute("value"));
		}
		public void clickCallNoInfoIcon() {
			uIMapNames.suspectEntry.uICallNoInfoIcon.click();
		}
		public void clickCaseNoInfoIcon() {
			uIMapNames.suspectEntry.uICaseNoInfoIcon.click();
		}

		public void verifyUpdateSuccessfulStatusMessage() {
			String text = uIMapNames.suspectEntry.uIStatusBar.getText();
			verify.ExpectedPropertyValueIsEqual("1003 - Update Successful", text);
    }

		public void EnterLastNameFirstName() {

			uIMapNames.suspectEntry.uILastNameEdit.sendKeys(Randomized.randomNameGenerate());
			uIMapNames.suspectEntry.uIFirstNameEdit.sendKeys(Randomized.randomNameGenerate());
		}

		public void verifyAdditionSuccesfulStatusMsg() {
			verify.ExpectedValueIsTrue(
					uIMapNames.suspectEntry.uIBottomLeftSideStatusBar.getText().contains("1002 - Addition Successful"));

		}

		public void selectAtRace() 
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIRaceComboBox, BaseData.getNamesModuleValue("Race"));		
		}

		public void selectAtSex()
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.suspectEntry.uISexComboBox, BaseData.getNamesModuleValue("Sex"));	
			
		}

		public void selectAtEyes() 
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIEyesComboBox, BaseData.getNamesModuleValue("Eyes"));	
		}

		public void enterAtHeight() 
		{
			uIMapNames.suspectEntry.uIHeightEdit.sendKeys(BaseData.getNamesModuleValue("Height"));
			uIMapNames.suspectEntry.uIHeightEdit.sendKeys(Keys.TAB);
		}
		public void enterAtHeight2() 
		{
			uIMapNames.suspectEntry.uIHeight2Edit.sendKeys(BaseData.getNamesModuleValue("Height2"));
			uIMapNames.suspectEntry.uIHeight2Edit.sendKeys(Keys.TAB);
		}
		public void enterAtWeight() 
		{
			uIMapNames.suspectEntry.uIWeightEdit.sendKeys(BaseData.getNamesModuleValue("Weight"));
			uIMapNames.suspectEntry.uIWeightEdit.sendKeys(Keys.TAB);
		}

		public void enterAtWeight2() 
		{
			uIMapNames.suspectEntry.uIWeight2Edit.sendKeys(BaseData.getNamesModuleValue("Weight2"));
			uIMapNames.suspectEntry.uIWeight2Edit.sendKeys(Keys.TAB);
		}
		
		public void selectAtHair()
		{
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.suspectEntry.uIHairColorComboBox, BaseData.getNamesModuleValue("Hair"));	
		}

		public void enterAtAge() 
		{
			uIMapNames.suspectEntry.uIAgeEdit.sendKeys(BaseData.getNamesModuleValue("Age"));
			uIMapNames.suspectEntry.uIAgeEdit.sendKeys(Keys.TAB);
		}
		
		public void enterAtAge2() 
		{
			uIMapNames.suspectEntry.uIAge2Edit.sendKeys(BaseData.getNamesModuleValue("Age2"));
			uIMapNames.suspectEntry.uIAge2Edit.sendKeys(Keys.TAB);
		}

		public void verifyAdditionSuccessfulMessage() {
			String UpdateMessage = uIMapNames.suspectEntry.uIBottomLeftSideStatusBar.getText();
			verify.ExpectedValueIsTrue(UpdateMessage.contains("1002 - Addition Successful"));
			Playback.wait(2000);
		}
	}

	public class SuspectSearch {

		public void SelectRace() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectSearch.uIRaceComboBox);
		}

		public void SelectSex() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectSearch.uISexComboBox);
		}

		public void EnterHeight() {
			uIMapNames.suspectSearch.uIHeightEdit.sendKeys("160");
			uIMapNames.suspectSearch.uIHeight2Edit.sendKeys("169");
		}

		public void SelectEyes() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectSearch.uIEyesComboBox);
		}

		public void SelectHair() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapNames.suspectSearch.uIHairColorComboBox);
		}

		public void EnterWeight() {
			uIMapNames.suspectSearch.uIWeightEdit.sendKeys("90");
			uIMapNames.suspectSearch.uIWeight2Edit.sendKeys("95");
		}

		public void EnterAtAge() {
			uIMapNames.suspectSearch.uIAgeEdit.sendKeys(BaseData.getNamesModuleValue("AgeFrom"));
			uIMapNames.suspectSearch.uIAge2Edit.sendKeys(BaseData.getNamesModuleValue("AgeTo"));
		}

		public void EnterAtLastNameFirstName() {
			uIMapNames.suspectSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
			uIMapNames.suspectSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));

		}

		public void EnterAtLastName1FirstName1() {
			uIMapNames.suspectSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName1"));
			uIMapNames.suspectSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName1"));
		}

		public void EnterAtLastName2FirstName2() {
			uIMapNames.suspectSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName2"));
			uIMapNames.suspectSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName2"));
		}

		public void EnterAtLastName3FirstName3() {
			uIMapNames.suspectSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName3"));
			uIMapNames.suspectSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName3"));
		}

		public void EnterRandomAge() {
			uIMapNames.suspectSearch.uIAgeEdit.sendKeys("18");
			uIMapNames.suspectSearch.uIAge2Edit.sendKeys("50");
		}

		public void Close() {
			uIMapNames.suspectSearch.driver.close();
			Playback.controlReadyThreadWait();
		}

		public void verifyAgeFieldIsNotFilled() {
			uIMapNames.suspectSearch.uIAgeEdit.clear();
			String value = uIMapNames.suspectSearch.uIAgeEdit.getAttribute("value");
			uIMapNames.suspectSearch.uIAge2Edit.clear();
			String value2 = uIMapNames.suspectSearch.uIAge2Edit.getAttribute("value");
			verify.ExpectedValueIsTrue(value.isEmpty());
			verify.ExpectedValueIsTrue(value2.isEmpty());
		}

		public void verifyAtSuspectName() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("LastName1"),
					uIMapNames.suspectSearch.uILastNameEdit.getAttribute("value"));
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("FirstName1"),
					uIMapNames.suspectSearch.uIFirstNameEdit.getAttribute("value"));
		}

		public void clickSearch() {
			uIMapNames.suspectSearch.uISearchButton.click();
		}

		public void verifyRecordsListed() {
			int count = objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.suspectSearch.uISuspectTable);
			verify.ExpectedValueIsTrue(count > 0);
		}

		public void verifyAtNameInGrid() {
			String value = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.suspectSearch.uISuspectTable, "Name", 0);
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Name"), value);
		}

		public void verifyAtAgeInGrid() {
			String value = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.suspectSearch.uISuspectTable, "Age", 0);
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Age"), value);
		}

		public void verifyAtWeightInGrid() {
			String value = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.suspectSearch.uISuspectTable, "Wt", 0);
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Weight"), value);
		}

		public void verifyAtHeightInGrid() {
			String value = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.suspectSearch.uISuspectTable, "Ht", 0);
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Height"), value);
		}

		public void clickBackButton() {
			uIMapNames.suspectSearch.uIBackButton.click();

		}

		public void clickResetButton() {
			uIMapNames.suspectSearch.uIResetButton.click();

		}

		public void verifyNoRecordsFoundAcknowledge() {
			popup.acknowledge.okWithExpectedMessage("1011 - No Record Found");
		}
	}

	public class IncidentNames {

		public void EnterAtLastName() {
			uIMapNames.incidentNames.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
			uIMapNames.incidentNames.uILastNameEdit.sendKeys(Keys.TAB);
			uIMapNames.incidentNames.uIFirstNameEdit.sendKeys(Keys.TAB);
		}

		public void ClickNameSearchButton() {
			uIMapNames.incidentNames.uINameSearchButton.click();

		}

		public void ClickAddressCheckbox() {
			uIMapNames.incidentNames.uIAddressCheckbox.click();
		}

		public void ClickSameAsIncidentAddressCheckbox() {
			uIMapNames.incidentNames.uISameAsIncidentAddressCheckbox.click();
		}

		public void VerifyAtAddress() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Address"),
					uIMapNames.incidentNames.uIAddressEdit.getAttribute("value"));
		}

		public void VerifyAtPhoneNo1() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("PhoneNo1"),
					uIMapNames.incidentNames.uIPhoneNo1Edit.getAttribute("value"));
		}

		public void VerifyAtPhoneNo2() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("PhoneNo2"),
					uIMapNames.incidentNames.uIPhoneNo2Edit.getAttribute("value"));
		}

		public void VerifyAtBirthDate() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("BirthDate"),
					uIMapNames.incidentNames.uIBirthDateEdit.getAttribute("value"));
		}

		public void VerifyAtAge() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Age"),
					uIMapNames.incidentNames.uIAgeEdit.getAttribute("value"));
		}

		public void VerifyAtSex() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Sex"), objectIdentification.manualIdentify
					.getDropDownSelectedItem(uIMapNames.incidentNames.uISexComboBox));
		}

		public void VerifyAtRace() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Race"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.incidentNames.uIRaceComboBox));
		}

		public void VerifyAtEthnic() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getNamesModuleValue("Ethnic"),
					objectIdentification.manualIdentify
							.getDropDownSelectedItem(uIMapNames.incidentNames.uIEthnicComboBox));
		}

		public void SelectAtActivity() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.incidentNames.uIActivityComboBox,
					BaseData.getNamesModuleValue("Activity"));
		}

		public void ClearAddress() {
			uIMapNames.incidentNames.uIAddressEdit.clear();
		}

		public void EnterAtAddress1() {
			uIMapNames.incidentNames.uIAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address1"));
			uIMapNames.incidentNames.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void Verify6038AddressModifiedAndRetainPreviousAddressConfirmMessage() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm.yesWithExpectedMessage(
						"(6038) The address is modified. Do you want to retain the previous address? 600 River Ave? ");
			else
				popup.confirm.yesWithExpectedMessage(
						"(6038) The address is modified. Do you want to retain the previous address? 600 River Ave?");
		}

		public void Verify6040AssociateNameWithNFIRSReportConfirmMessage() {

		}

		public void EnterAtAddress() {
			if (Playback.browserType.equals("Chrome"))
				popup.confirm
						.yesWithExpectedMessage("(6040)   Do You want to Associate this Name with NFIRS Report?  ");
			else
				popup.confirm.yesWithExpectedMessage("(6040) Do You want to Associate this Name with NFIRS Report?");
		}

		public void ClickAddButton() {
			uIMapNames.incidentNames.uIAddButton.click();
		}

	}

	public class QuickName {
		public void EnterAtAddress() {
			uIMapNames.quickName.uIAddressEdit.sendKeys(BaseData.getNamesModuleValue("Address"));
			uIMapNames.quickName.uIAddressEdit.sendKeys(Keys.TAB);
		}

		public void ClickSaveButton() {
			uIMapNames.quickName.uISaveButton.click();
		}
	}

	public class ArrestEntryForCharge {
		public void EnterAtmodifyCharge() {
			Playback.implictwait();

			uIMapNames.arrestEntryForCharge.uIChargeModifier.sendKeys(BaseData.getNamesModuleValue("Charge1"));
			uIMapNames.arrestEntryForCharge.uIChargeModifier.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToWindow("Coded Search");
			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapNames.arrestEntryForCharge.uIChargeCodedSearchTable);
			Playback.pageLoadThreadWait();
		}

		public void clickAddButton() {
			Playback.implictwait();
			uIMapNames.arrestEntryForCharge.uIAddButton.click();
		}

		public void selectModifyChargefromList() {
			Playback.implictwait();
			uIMapNames.arrestEntryForCharge.uIChargeModifierLup.click();
			Playback.controlReadyThreadWait();
			objectIdentification.windowHandle.switchToWindow("Coded Search");
			objectIdentification.randomIdentify
					.selectRandomGridRow(uIMapNames.arrestEntryForCharge.uIChargeCodedSearchTable);
			Playback.pageLoadThreadWait();
		}

		public void ClickSaveNClose() {
			Playback.implictwait();
			uIMapNames.arrestEntryForCharge.uISaveNClose.click();
		}

	}

	public class ExpungementSearch {
		public void verifyAtNameTypeID() {
			String name = objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapNames.expungementSearch.uIExpungementResultGrid, "NameID", 0);
			verify.ExpectedPropertyValueIsEqual(name, BaseData.getNamesModuleValue("NameID"));
		}

		public void clickSearchButton() {
			uIMapNames.expungementSearch.uISearchButton.click();
		}

		public void selectJuriAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.expungementSearch.uIJurisDropdown, 0);
			Playback.pageLoadThreadWait();
		}

		public void clickBackButton() {
			uIMapNames.expungementSearch.uIBackButton.click();
		}

		public void verifyReinstatedColumnAsNo() {
			String value = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.expungementSearch.uIExpungementResultGrid, "Reinstated", 0).getText();
			verify.ExpectedPropertyValueIsEqual(value, "No");
		}

		public void verifyReinstatedColumnAsYes() {
			String value = objectIdentification.manualIdentify
					.getGridCell(uIMapNames.expungementSearch.uIExpungementResultGrid, "Reinstated", 0).getText();
			verify.ExpectedPropertyValueIsEqual(value, "Yes");
		}

		public void selectRowByNameID() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(
					uIMapNames.expungementSearch.uIExpungementResultGrid, BaseData.getNamesModuleValue("NameID"));

		}

		public void clickExpungementLegacyButton() {
			uIMapNames.expungementSearch.uILegacyExpungementButton.click();
		}
	}

	public class ArrestExpungement {
		public void clickOneOrMoreCharge() {
			uIMapNames.arrestExpungement.uIOneOrMoreCharge.click();
		}

		public void enterReason() {
			uIMapNames.arrestExpungement.uIReasonEdit.sendKeys(Randomized.randomString(15));
		}

		public void clickExpungeButton() {
			uIMapNames.arrestExpungement.uIExpungeButton.click();
		}

		public void clickYesExpungeButton() {
			uIMapNames.arrestExpungement.uIYesExpungeButton.click();
		}

		public void clickCloseButton() {
			uIMapNames.arrestExpungement.driver.close();
		}

		public void VerifyAcknowledgePopup() {

			if (Playback.browserType.contains("Chrome")) {
				popup.acknowledge.okWithExpectedMessageIfWindowExist("1011 - No Record Found");
			}

			else {
				popup.switchToAcknowledge();
				Playback.popupThreadWait();
				popup.acknowledge.okWithExpectedMessageIfWindowExist(" 1011 - No Record Found");
			}
		}

		public void verifyExpungementTypeIsSelectedAsEntireArrest() {
			verify.ExpectedValueIsTrue(uIMapNames.expungement.uIEntireArrestRadioButton.isSelected());
		}

		public void clickDeleteInFindReplaceTableByName1() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerTextExactRow(
					uIMapNames.expungement.uIFindReplaceTable, BaseData.getNamesModuleValue("Name1"));
		}

		public void clickDeleteInFindReplaceTableByName() {
			objectIdentification.manualIdentify.deleteGridRowByCellInnerTextExactRow(
					uIMapNames.expungement.uIFindReplaceTable, BaseData.getNamesModuleValue("Name"));
		}

		public void VerifyDeletedBookingConfirmeMessage() {
			popup.confirm.yesWithExpectedMessage("(4) Do you really want to delete?");
		}

		public void verifyPopupMessageWithLabelTextAndClickClose() {
			String label = uIMapNames.expungement.uITextLabel.getText();
			if (label.startsWith("E")) {
				verify.ExpectedPropertyValueIsEqual(label, "EXPUNGEMENT IS SUCCESSFUL");

			}

			else {
				verify.ExpectedPropertyValueIsEqual(label, "REINSTATE IS SUCCESSFUL");
			}
			uIMapNames.expungement.uIClosePopupButton.click();
			Playback.pageLoadThreadWait();

		}

		public void verifyAtCaseNoInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.arrestExpungement.uIChargeTable, BaseData.getNamesModuleValue("CaseNo"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getNamesModuleValue("CaseNo")));
		}

		public void verifyAtChargeInGrid() {
			WebElement gridRowByCellInnerText = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapNames.arrestExpungement.uIChargeTable, BaseData.getNamesModuleValue("Charge"));
			verify.ExpectedValueIsTrue(
					gridRowByCellInnerText.getText().contains(BaseData.getNamesModuleValue("Charge")));

		}
	}

	public class ExpungementSearchLegacyWindow {
		public void selectJuriAsNull() {
			objectIdentification.manualIdentify.selectDropDownOption(uIMapNames.expungementSearchLegacyWindow.uIJuris,
					0);
			Playback.pageLoadThreadWait();
		}

		public void ClickSearchButton() {
			uIMapNames.expungementSearchLegacyWindow.uISearchButton.click();
			Playback.controlReadyThreadWait();
			Playback.controlReadyThreadWait();
		}

		public void verifyExpungedEntryPresentInGrid() {
			verify.ExpectedIntergerValueIsNotEqualToActual(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapNames.expungementSearchLegacyWindow.uIExpungementSearchResultGrid), 0);
		}
	}

	public class PhotoLineupReportWindow {

		public void closeScreen() {
			Playback.pageLoadThreadWait();
			uIMapNames.photoLineupReportWindow.driver.close();

		}

	}

	public class OffenderSearch {

		public void enterAtLastName() {
			uIMapNames.offenderSearch.uILastNameEdit.sendKeys(BaseData.getNamesModuleValue("LastName"));
		}

		public void enterAtFirstName() {
			uIMapNames.offenderSearch.uIFirstNameEdit.sendKeys(BaseData.getNamesModuleValue("FirstName"));
		}

		public void clickSearch() {
			uIMapNames.offenderSearch.uISearchButton.click();
		}

		public void selectRowByAtName() {
			objectIdentification.manualIdentify.selectGridRowByCellInnerText(uIMapNames.offenderSearch.uIOffenderTable,
					BaseData.getNamesModuleValue("Name"));
		}

		public void clickOnProbationAgentLabel() {
			uIMapNames.offenderSearch.uIProbationAgentLabel.click();
		}

		public void verifyProbationAgentAllFieldsDisabled() {
			String status = uIMapNames.offenderSearch.uIProbationAgentIDType.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status, "true");
			String status1 = uIMapNames.offenderSearch.uIProbationAgentIDNo.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status1, "true");
			String status2 = uIMapNames.offenderSearch.uIProbationAgentLastName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status2, "true");
			String status3 = uIMapNames.offenderSearch.uIProbationAgentFirstName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status3, "true");
		}

		public void verifyProbationAgentAllFieldsShowed() {
			String status = uIMapNames.offenderSearch.uIProbationAgentIDType.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status, "true");
			String status1 = uIMapNames.offenderSearch.uIProbationAgentIDNo.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status1, "true");
			String status2 = uIMapNames.offenderSearch.uIProbationAgentLastName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status2, "true");
			String status3 = uIMapNames.offenderSearch.uIProbationAgentFirstName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status3, "true");
		}

		public void clickAddNewButton() {
			uIMapNames.offenderSearch.uIAddNewButton.click();

		}
	}

	public class OffenderEntry {
		public QaForms qaForms = new QaForms();

		public void switchToQAFormsTab() {
			uIMapNames.offenderEntry.uIQAFormsTab.click();
			objectIdentification.windowHandle.switchToFrame("frmQuestionnaire.aspx");
		}

		public void clickOnProbationAgentLabel() {
			uIMapNames.offenderEntry.uIProbationAgentLabel.click();
		}

		public void verifyProbationAgentAllFieldsDisabled() {
			String status = uIMapNames.offenderEntry.uIProbationAgentIDType.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status, "true");
			String status1 = uIMapNames.offenderEntry.uIProbationAgentIDNo.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status1, "true");
			String status2 = uIMapNames.offenderEntry.uIProbationAgentLastName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status2, "true");
			String status3 = uIMapNames.offenderEntry.uIProbationAgentFirstName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsEqual(status3, "true");
		}

		public void verifyProbationAgentAllFieldsShowed() {
			String status = uIMapNames.offenderEntry.uIProbationAgentIDType.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status, "true");
			String status1 = uIMapNames.offenderEntry.uIProbationAgentIDNo.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status1, "true");
			String status2 = uIMapNames.offenderEntry.uIProbationAgentLastName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status2, "true");
			String status3 = uIMapNames.offenderEntry.uIProbationAgentFirstName.getAttribute("disabled");
			verify.ExpectedPropertyValueIsNotEqual(status3, "true");
		}

		public void verifyProbationAgentAllFieldsAsMandatory() {
			String status = uIMapNames.offenderEntry.uIProbationAgentLabel.getAttribute("kpifieldusage");
			verify.ExpectedPropertyValueIsEqual(status, "Mandatory");
		}

		public class QaForms {

			public void selectSelectFormComboBox() {
				objectIdentification.manualIdentify
						.selectDropDownOption(uIMapNames.offenderEntry.qAForms.uISelectFormComboBox, 3);
			}
		}
	}

	public void switchToAdultNameEntryScreen(String oldHandle, String mainHanle) {
		Playback.threadWait(5000);
		Set<String> windowslist = Playback.driver.getWindowHandles();

		for (String window : windowslist) {

			if (!window.contains(oldHandle) && !window.contains(mainHanle)) {
				Playback.driver.switchTo().window(window);
				Playback.gridLoadThreadWait();
			}
		}

	}

	public void switchToOffenderSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmOffenderSearch.aspx?");
	}

	public void switchToOffenderEntry() {
		objectIdentification.windowHandle.switchToWindow("Offender Entry");
	}
}