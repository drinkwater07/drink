package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Accounting;
import application.AnimalControl;
import application.Geo;
import application.Home;
import application.Inventory;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Records;
import application.Settings;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;

public class AnimalControlScripts {
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Names names;
	public Geo geo;
	public AnimalControl animalControl;
	public Inventory inventory;
	public Settings settings;
	public Accounting accounting;
	public Home home;
	public Records records;
	
	@BeforeSuite(groups = {"2020DefectTestCase","AnimalControlFunctional","AnimalControlCaseEntryFunctional","2021DefectTestCases"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}
	
/*	@BeforeMethod
	public void beforeMethod(ITestContext testContext) {

		testContext.setAttribute("moduleName", "AnimalControl");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		names = new Names();
		geo = new Geo();
		animalControl = new AnimalControl();
		inventory = new Inventory();
		settings = new Settings();
		accounting = new Accounting();
		home = new Home();
	}*/
	
	  @BeforeMethod(groups = {"2020DefectTestCase","AnimalControlFunctional","AnimalControlCaseEntryFunctional","2021DefectTestCases"})
		public void BeforeTestMethodSchedule( ITestContext testContext) 
		{
			testContext.setAttribute("moduleName", "AnimalControl");
			Playback.testContext = testContext;
			Playback.start();
			login = new Login();
			loader = new Loader();
			objectIdentification = new ObjectIdentification();
			popup = new Popup();
			names = new Names();
			geo = new Geo();
			animalControl = new AnimalControl();
			inventory = new Inventory();
			settings = new Settings();
			accounting = new Accounting();
			home = new Home();
			records = new Records();
	 }
	
	@Test(groups = { "2020DefectTestCase" }) //Q4 sprint 4 Automated by Mahesh
	public void VerifySystemParameterCallNoInAnimalCaseEntryScreen_260153(ITestContext testcontext) 
	{
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "260153");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Case Search");
		animalControl.switchToAnimalCaseSearch();
		animalControl.animalCaseSearch.clickAddNewButton();
		
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.verifyCallNoShownAsNotMandatory();
		animalControl.animalCaseEntry.closeScreen();
		
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter2504AsTrue();
		
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Case Search");
		animalControl.switchToAnimalCaseSearch();
		animalControl.animalCaseSearch.clickAddNewButton();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.verifyCallNoShownAsMandatory();
		animalControl.animalCaseEntry.enterAtLocation();
		animalControl.animalCaseEntry.tabOutReportingDateAndTime();
		animalControl.animalCaseEntry.enterAtOfficer();
		animalControl.animalCaseEntry.selectComplaintTypeAsCrueltyToAnimals();
		animalControl.animalCaseEntry.clickSaveButton();
		
		animalControl.animalCaseEntry.verifyEnterCallNumberAcknowledge();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.enterAtCallNo();
		animalControl.animalCaseEntry.enterAtOfficer();
		animalControl.animalCaseEntry.clickSaveButton();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.clickResolutionsTab();
		
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamterScreen();
		settings.sysParameter.setSystemparameter2504AsFalse();
		animalControl.switchToAnimalCaseEntry();
	}
	
	@Test(groups = { "2020DefectTestCase" }) //Q4 sprint 4 Automated by Mahesh
	public void AnimalNameMerge_259720(ITestContext testcontext) 
	{
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "259720");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Name Merge");
		animalControl.switchToAnimalNameMergeScreen();
		animalControl.animalNameMerge.enterAtPrimaryNameID();
		animalControl.animalNameMerge.verifyAtPrimaryNameValidated();
		animalControl.animalNameMerge.enterAtMergeNameID();
		animalControl.animalNameMerge.verifyAtMergingNameValidated();
		animalControl.animalNameMerge.clickSearchButton();
		animalControl.animalNameMerge.selectRowCheckBoxByAnimalName();
		animalControl.animalNameMerge.clickMergeButton();
		
		animalControl.switchToAnimalNameMergeHelpWindow();
		animalControl.animalNameMergeHelpWindow.clickMergeButton();
		animalControl.animalNameMergeHelpWindow.verify6130AddressUpdateAsOtherAddressConfirmation();
		animalControl.animalNameMergeHelpWindow.veify6065MergeFieldReplaceWithPrimaryFieldConfirmation();
		animalControl.animalNameMergeHelpWindow.verifyAtNameMergedSuccessfullyAcknowledge();
		//issue in Ack
		animalControl.animalNameMergeHelpWindow.verifyAtNameMergedSuccessfullyAcknowledge();
			
		animalControl.switchToAnimalNameMergeScreen();
		animalControl.animalNameMerge.verifyNameMergedSuccessful();
		animalControl.animalNameMerge.enterAtMergeNameID();
		animalControl.animalNameMerge.verifySameNameCannotBeMergedAcknowledge();
		animalControl.animalNameMerge.verify6071MergedNameIDsAcknowledge();
		
		animalControl.switchToAnimalNameMergeScreen();
		animalControl.animalNameMerge.enterAtMergeLastName();
		animalControl.animalNameMerge.enterAtMergeFirstName();
		animalControl.animalNameMerge.clickSearchButton();
		animalControl.animalNameMerge.verifyAtAnimalNameInMergeTable(0);
}
	
	@Test(groups = { "2021DefectTestCase" }) //Nov sprint 3 Automated by Mahesh
	public void VerifyCostFieldShowsFeesAmountInAnimalRegistrationEntryScreen_258288(ITestContext testcontext) 
	{
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		String regEntry;
		testcontext.setAttribute("testID", "258288");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter2504AsTrue();
		
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Registration Search");
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.clickAddNew();
		animalControl.switchToAnimalRegistrationEntry();
		
		animalControl.animalRegistrationEntry.enterAtAnimalNameID(0);
		animalControl.animalRegistrationEntry.verifyAtAnimalName();
		animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerName(0);
		animalControl.animalRegistrationEntry.selectAtLicType();
		animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
		animalControl.animalRegistrationEntry.enterExpireDateAsFutureDate();
		animalControl.animalRegistrationEntry.enterAtLicTagNo(0);
		animalControl.animalRegistrationEntry.save();
		animalControl.switchToAnimalRegistrationEntry();
		regEntry =	animalControl.animalRegistrationEntry.readRegEntryNo();
		animalControl.animalRegistrationEntry.verifyAtCostAndFeeTabInvoiceAmountAsSame();
		animalControl.animalRegistrationEntry.saveNClose();
		
		loader.navigateToScreen("Animal Registration Search");
		animalControl.animalRegistrationSearch.reloadAnimalRegistrationSearch();
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.enterAtRegEntry(regEntry);
		animalControl.animalRegistrationSearch.selectGridrowByAnimalName();
		animalControl.switchToAnimalRegistrationEntry();
		 regEntry =	animalControl.animalRegistrationEntry.readRegEntryNo();
		animalControl.animalRegistrationEntry.verifyAtCostAndFeeTabInvoiceAmountAsSame();
		animalControl.animalRegistrationEntry.saveNClose();
		animalControl.switchToAnimalRegistrationSearchScreen();
		
	}
	@Test(groups = { "2021DefectTestCase" }) //nov Sprint 3 Automated by Mahesha
	public void VerifyNewFunctionalityefaultItemCodeFieldInventoryEntryScreenSetDefaultcode_258292(ITestContext testContext)
	{
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258292");
		
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContext();
        loader.navigateToModule("Inventory & Fleet");
        loader.navigateToScreen("Inventory Search");
        inventory.SwitchToInventorySearch();
        inventory.inventorySearch.clickAddNew();
        inventory.SwitchToInventoryEntry();
        inventory.inventoryEntry.TabEntryDate();
        inventory.inventoryEntry.selectAtInventoryName();
        inventory.inventoryEntry.selectAtCategory();
        inventory.inventoryEntry.selectAtMake();
        inventory.inventoryEntry.clickMainTab();
        inventory.inventoryEntry.inventoryEntryMainTab.selectAtItemCode();
        inventory.inventoryEntry.save();
        inventory.SwitchToInventoryEntry();
        String invNo =inventory.inventoryEntry.readInventoryNo();
        inventory.inventoryEntry.close();      
        loader.navigateToModule("Animal Control");
        loader.navigateToScreen("Animal Cage Rental");
        animalControl.switchToAnimalCageRental();
        animalControl.animalCageRental.enterAtIssuingPF();
        animalControl.animalCageRental.enterAtNameID();
        animalControl.animalCageRental.enterAtInventoryNo(invNo);
	}
	
	
	@Test(groups = { "2021DefectTestCase" }) //Nov sprint 3 Automated by Mahesh
	public void VerifyTheAnimalRegistrationScreenValidationNotAllowsToDuplicateLicTag_258291(ITestContext testcontext) 
	{
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "258291");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Registration Search");
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.clickAddNew();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.enterAtAnimalNameID(0);
		animalControl.animalRegistrationEntry.verifyAtAnimalName();
		animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerName(0);
		animalControl.animalRegistrationEntry.selectAtLicType();
		animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
		animalControl.animalRegistrationEntry.enterExpireDateAsFutureDate();
		animalControl.animalRegistrationEntry.enterAtLicTagNo(0);
		animalControl.animalRegistrationEntry.saveNClose();
		
		
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.clickAddNew();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.enterAtAnimalNameID(1);
		animalControl.animalRegistrationEntry.verifyAtAnimalName();
		animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerName(1);
		animalControl.animalRegistrationEntry.selectAtLicType();
		animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
		animalControl.animalRegistrationEntry.enterExpireDateAsFutureDate();
		animalControl.animalRegistrationEntry.enterAtLicTagNo(0);
		animalControl.animalRegistrationEntry.clickSave();
		animalControl.animalRegistrationEntry.verifyLicTagAlreadyExistsAck();
		
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.enterAtLicTagNo(1);
		animalControl.animalRegistrationEntry.save();
		animalControl.switchToAnimalRegistrationEntry();
	}
	@Test(groups = { "2021DefectTestCase" }) //Nov sprint 3 Automated by Mahesh
	public void VerifyTheAnimalRegistrationEntryScreenValidationNotAllowsSaveUnlessOwnersNameFilled_258290(ITestContext testcontext) 
	{
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "258290");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Name Entry");
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.enterAtAnimalName();
		animalControl.animalNameEntry.enterAtAddress();
		animalControl.animalNameEntry.verifyAddressBubbleIconDisplayed();
		animalControl.animalNameEntry.saveScreen();
		animalControl.switchToAnimalNameEntry();
		String NameID = animalControl.animalNameEntry.readAnimalNameID();
		
		loader.navigateToScreen("Animal Registration Search");
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.clickAddNew();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.enterAtAnimalNameIDActiveData(NameID);
		animalControl.animalRegistrationEntry.verifyAtAnimalName();
		animalControl.animalRegistrationEntry.selectAtLicType();
		animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
		animalControl.animalRegistrationEntry.enterExpireDateAsFutureDate();
		animalControl.animalRegistrationEntry.enterAtLicTagNo(0);
		animalControl.animalRegistrationEntry.clickSave();
		animalControl.animalRegistrationEntry.verifyAtOwnerNameRequiredAck();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.clickAnimalNameInfoBubbleIcon();
		
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.clickOwnerDetailsTab();
		animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.enterAtOwnerNameID();
		animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.clickAdd();
		animalControl.animalNameEntry.saveScreen();
		
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.clickOwnerDetailsTab();
		animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyAtNameInGrid(0);
		animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyAtDateAsCurrentDateInGrid(0);
		animalControl.animalNameEntry.closeScreen();
		
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.tabAtAnimalNameIDField();
		animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerNameID();
		animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerName(0);
		animalControl.animalRegistrationEntry.save();
		animalControl.switchToAnimalRegistrationEntry();
		
	}

	@Test(groups = { "2021DefectTestCasec" }) //Nov sprint 3 Automated by Mahesh
	public void ToVerifyTabFunctionalityAndAddressValidationFromAnimalControl_258286(ITestContext testcontext) {
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "258286");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Lost/Found");
		animalControl.switchToAnimalLostOrFound();
		animalControl.animalLostOrFoundEntry.sendTabToAnimalNameFields();
		animalControl.animalLostOrFoundEntry.closeScreen();
		loader.navigateToScreen("Animal Name Search");
		animalControl.switchToAnimalNameSearchScreen();
		animalControl.animalNameSearch.enterAtAnimalNameID();
		animalControl.animalNameSearch.clickSearch();
		animalControl.animalNameSearch.clickGridRowByAnimalNameID();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.switchToAnimalNameEntryAddressesTab();
		animalControl.animalNameEntry.animalNameEntryAddressesTab.enterAtAddress();
		animalControl.animalNameEntry.animalNameEntryAddressesTab.selectAtAddressType();
		animalControl.animalNameEntry.animalNameEntryAddressesTab.clickAdd();
		animalControl.animalNameEntry.saveScreen();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.switchToAnimalNameEntryAddressesTab();
		animalControl.animalNameEntry.animalNameEntryAddressesTab.verifyAtAddres(0);
		animalControl.animalNameEntry.animalNameEntryAddressesTab.selectAtRowByAddress();
		animalControl.animalNameEntry.animalNameEntryAddressesTab.verifyAddressBubbleIconDisplayed();
		
	}
	
	@Test(groups = { "2021DefectTestCase" }) // Vijay
	public void verifyTheCitationNumbersGetsValidateInTheAnimalCaseEntryScreen_258284(ITestContext testcontext) {
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "258284");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Case Search");
		animalControl.switchToAnimalCaseSearch();
		animalControl.animalCaseSearch.enterAtLocation();
		animalControl.animalCaseSearch.enterAtACENo();
		animalControl.animalCaseSearch.clickSearchButton();
		animalControl.animalCaseSearch.selectRowByAtAceNo();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.clickResolutionsTab();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.selectAtAnimalName();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.taboutDateAndTime();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.enterWarningSummonsAsRandomText();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.clickAddButton();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyInvalidCitationNoPopup();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.clickResolutionsTab();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.enterAtWarningSummons();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.clickAddButton();
		animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyAtEntryPresentInGrid();
	}

	@Test(groups = { "2021DefectTestCase" }) // Vijay
	public void verifyIntakeCheckBoxControlUnderTheObservationsTabFromAnimalCaseEntryScreen_258289(
			ITestContext testcontext) {
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "258289");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Case Search");
		animalControl.switchToAnimalCaseSearch();
		animalControl.animalCaseSearch.clickAddNewButton();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.enterAtLocation();
		animalControl.animalCaseEntry.tabOutReportingDateAndTime();
		animalControl.animalCaseEntry.enterAtOfficer();
		animalControl.animalCaseEntry.selectComplaintTypeAsCrueltyToAnimals();
		animalControl.animalCaseEntry.clickSaveButton();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.clickMainTab();
		animalControl.animalCaseEntry.animalCaseEntryMainTab.selectAtMunicipality();
		animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtCFSReportedViolation();
		animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtInitialNatureOfComplaint();
		animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtNameID();
		animalControl.animalCaseEntry.animalCaseEntryMainTab.selectAtActivity();
		animalControl.animalCaseEntry.animalCaseEntryMainTab.clickAddButton();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.saveScreen();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.clickAnimalInfoTab();
		animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.enterAtAnimalNameID();
		animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.saveAnimalInfoTab();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.saveScreen();
		animalControl.animalCaseEntry.clickObservationsTab();
		animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectAtAnimalName();
		animalControl.animalCaseEntry.animalCaseEntryObservationsTab.taboutDateAndTime();
		animalControl.animalCaseEntry.animalCaseEntryObservationsTab.clickIntakeCheckBox();
		animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectCageDropdownAsAS001();
		animalControl.animalCaseEntry.animalCaseEntryObservationsTab.clickIntakeCheckBox();
		animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyCageDropdownIsDisabled();
		animalControl.animalCaseEntry.animalCaseEntryObservationsTab.clickAddButton();
		animalControl.switchToAnimalCaseEntry();
		animalControl.animalCaseEntry.saveNCloseScreen();
		animalControl.switchToAnimalCaseSearch();
	}
	
	
	@Test(groups = { "2021DefectTestCase" }) //Automated by Stalin
	public void systemparameter2501functionality(ITestContext testContext)
	{
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258659");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter2501AsFutureDate(2);
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Registration Search");
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.clickAddNew();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
		animalControl.animalRegistrationEntry.selectAtLicType();
		animalControl.animalRegistrationEntry.enterAtLicTagNo();
		animalControl.animalRegistrationEntry.verifyExpirationDateAsFuturetDate();
		animalControl.animalRegistrationEntry.enterAtAnimalNameID();
		animalControl.animalRegistrationEntry.save();
		
	}
	
	@Test(groups = { "2020DefectTestCase" })   //Automated by Stalin
	public void VerifytheNewlyIntegratedNotes(ITestContext testContext) {
	    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258304");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Registration Search");
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.enterAtLicTagNo();
		animalControl.animalRegistrationSearch.selectAtLicenseIssuingAgency();
		animalControl.animalRegistrationSearch.clickSearch();
		animalControl.animalRegistrationSearch.selectGridrowByRegNo();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.switchToNotesOrConditionsTab();
		animalControl.animalRegistrationEntry.animalRegistrationEntryNotesOrConditionsTab.enterAtNotes();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.save();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.closeScreen();
		animalControl.switchToAnimalRegistrationSearchScreen();
		animalControl.animalRegistrationSearch.selectGridrowByRegNo();
		animalControl.switchToAnimalRegistrationEntry();
		animalControl.animalRegistrationEntry.switchToNotesOrConditionsTab();
		animalControl.animalRegistrationEntry.animalRegistrationEntryNotesOrConditionsTab.verifyAtNotes();

	}
	
	




@Test(groups = { "2020DefectTestCase" })  //Automated by Stalin
	public void VerifyHNameforcreatingAnimalName(ITestContext testContext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    testContext.setAttribute("testID", "258283");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Name Entry");
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.enterAtAnimalName();
		animalControl.animalNameEntry.enterAtAddress();
		animalControl.animalNameEntry.clickMainTab();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectAtSpecies();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterMicroChipID();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtPedigreeName();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtHeight();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectColor1();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtLicenseOrTagNo();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtRabiesTagNo();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectBreed1();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectAtSex();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtWeight();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectColor2();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectExpirationDate();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectRabiesShotExpirationDate();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectBreed2();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtDOB();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtLength();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectMarkings();
		animalControl.animalNameEntry.animalNameEntryMainTab.selectIssuingAgency();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAtVeterinarianNameID();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.saveScreen();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.clickMedicalTab();
		animalControl.animalNameEntry.animalNameEntryMedicalTab.enterCurrentDateInDateOFProcedure();
		animalControl.animalNameEntry.animalNameEntryMedicalTab.selectTypeOfProcedure();
		animalControl.animalNameEntry.animalNameEntryMedicalTab.selectReasonOfProcedure();
		animalControl.animalNameEntry.animalNameEntryMedicalTab.clickAdd();
		animalControl.switchToMedicalProcedure();
		animalControl.animalNameEntryMedicalProcedure.enterAtVeterinarianID();
		animalControl.animalNameEntryMedicalProcedure.saveAndClose();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.saveScreen();
		animalControl.animalNameEntry.clickMedicalTab();

	}

@Test(groups = { "2020DefectTestCase" })   //Automated by stalin
	public void customfieldsinAnimalName(ITestContext testContext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "258285");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Animal Control");
		loader.navigateToScreen("Animal Name Entry");
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.enterAtAnimalName();
		animalControl.animalNameEntry.clickMainTab();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterAID();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterPID();
		animalControl.animalNameEntry.animalNameEntryMainTab.enterSBCase();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.saveScreen();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.clickMainTab();
		animalControl.animalNameEntry.animalNameEntryMainTab.clickAIDCustomField();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.enterAtCustomName();
		settings.repositoryEntry.saveNClose();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.clickMainTab();
		animalControl.animalNameEntry.animalNameEntryMainTab.clickPIDCustomField();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.enterAtCustomName1();
		settings.repositoryEntry.saveNClose();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.clickMainTab();
		animalControl.animalNameEntry.animalNameEntryMainTab.clickSBCaseCustomField();
		settings.switchToRepositoryEntry();
		settings.repositoryEntry.enterAtCustomName2();
		settings.repositoryEntry.saveNClose();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.clickMainTab();
		animalControl.animalNameEntry.animalNameEntryMainTab.verifyAtAIDCustomField();
		animalControl.animalNameEntry.animalNameEntryMainTab.verifyAtPIDCustomField();
		animalControl.animalNameEntry.animalNameEntryMainTab.verifyAtSBCaseDCustomField();
		animalControl.switchToAnimalNameEntry();
		animalControl.animalNameEntry.saveNClose();
		loader.navigateToScreen("Animal Name Search");
		animalControl.switchToAnimalNameSearchScreen();
		animalControl.animalNameSearch.enterAtAID();
		animalControl.animalNameSearch.clickSearch();
		animalControl.animalNameSearch.verifyAtNameIDInGrid();
		animalControl.animalNameSearch.clickBackButton();
		animalControl.animalNameSearch.clickResetButton();
		animalControl.animalNameSearch.enterAtPID();
		animalControl.animalNameSearch.clickSearch();
		animalControl.animalNameSearch.verifyAtNameIDInGrid();
		animalControl.animalNameSearch.clickBackButton();
		animalControl.animalNameSearch.clickResetButton();
		animalControl.animalNameSearch.enterAtSBCase();
		animalControl.animalNameSearch.clickSearch();
		animalControl.animalNameSearch.verifyAtNameIDInGrid();
		animalControl.animalNameSearch.clickBackButton();
		animalControl.switchToAnimalNameSearchScreen();

	}





//Automated by Stalin
@Test(groups = { "2020DefectTestCase" }) // need to add data set
public void NameActivityofofficerfromAnimalcontrol(ITestContext testContext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "258287");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectAtCaseNoInGrid();
	animalControl.switchToAnimalCaseEntry();
	String readACENo = animalControl.animalCaseEntry.readACENo();
	animalControl.animalCaseEntry.clickBiteReportTab();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.clickAtVictimsNameInGrid();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.clickVictimsNameInfoIcon();
	names.switchToNameEntry();
	names.nameEntry.switchToActivityTab();
	names.nameEntry.activityTab.VerifyAtActivityType();
	names.nameEntry.activityTab.verifyAtOfficerInGrid();
	names.nameEntry.activityTab.verifyAtActiveActivityNumber(readACENo);

}

@Test(groups = { "2020DefectTestCase" }) // Vijay
public void verifyTheLicTagTypeLoadsTheItemCodeUnderInvoiceTypeAnimalLicensing_258305(ITestContext testcontext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "258305");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Accounting");
	loader.navigateToScreen("Invoice Type");
	accounting.SwitchToInvoiceTypeScreen();
	accounting.invoiceType.SelectRowByAtInvoiceType();
	accounting.SwitchToInvoiceTypeEntry();
	accounting.invoiceTypeEntry.ClickAddNewItemCodeButton();
	accounting.SwitchToItemCodeEntry();
	accounting.itemCodeEntry.EnterAtItemCode();
	accounting.itemCodeEntry.EnterAtDescription();
	accounting.itemCodeEntry.EnterAtAmount();
	accounting.itemCodeEntry.SaveNClose();
	accounting.SwitchToItemCodeEntry();
	accounting.itemCodeEntry.Close();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Registration Search");
	animalControl.switchToAnimalRegistrationSearchScreen();
	animalControl.animalRegistrationSearch.clickAddNew();
	animalControl.switchToAnimalRegistrationEntry();
	animalControl.animalRegistrationEntry.selectAtLicType();
	animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
	animalControl.animalRegistrationEntry.enterExpireDateAsFutureDate();
	animalControl.animalRegistrationEntry.enterAtLicTagNo();
	animalControl.animalRegistrationEntry.enterAtAnimalNameID();
	animalControl.animalRegistrationEntry.saveNClose();
	loader.navigateToScreen("Animal Registration Search");
	animalControl.switchToAnimalRegistrationSearchScreen();
	animalControl.animalRegistrationSearch.verifyLicTagDisplayedInGrid();

}


@Test(groups = { "2020DefectTestCase" }) // Vijay
public void verifyIntakeDischargedBothCheckboxForAnAnimalCaseInAnimalControlModule_258306(
		ITestContext testcontext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "258306");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	//Scenario 1
	animalControl.animalCaseSearch.clickIntakeCheckBoxAndVerifyOtherCheckboxesUnChecked();
	animalControl.animalCaseSearch.clickDischargedCheckBoxAndVerifyOtherCheckboxesUnChecked();
	animalControl.animalCaseSearch.clickBothCheckBoxAndVerifyOtherCheckboxesUnChecked();
	//Scenario 2
	animalControl.animalCaseSearch.clickIntakeCheckBoxAndVerifyOtherCheckboxesUnChecked();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickObservationsTab();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectFirstAnimalNameInDropdown();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectAtRowInGrid();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyIntakeCheckBoxChecked();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyCageDropdownIsDisabled();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyAnimalNameInfoIconDisplayed();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.closeScreen();
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.clickBackButton();
	animalControl.animalCaseSearch.clickIntakeCheckBoxAndVerifyOtherCheckboxesUnChecked();
	animalControl.animalCaseSearch.clickDischargedCheckBoxAndVerifyOtherCheckboxesUnChecked();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo1();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickObservationsTab();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectAtRow1InGrid();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyIntakeCheckBoxChecked();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyCageDropdownIsDisabled();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyAnimalNameInfoIconDisplayed();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickResolutionsTab();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.selectAtRow1InGrid();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyDischargedCheckBoxChecked();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyAnimalNameInfoIconDisplayed();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.closeScreen();
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.clickBackButton();
	animalControl.animalCaseSearch.clickBothCheckBoxAndVerifyOtherCheckboxesUnChecked();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.verifyBothIntakeAndDischargedEntryIsPresent(); 

}

@Test(groups = { "2020DefectTestCase" })    //Automated by Stalin
public void validationfromAnimalcontrolmodule(ITestContext testContext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "259713");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Name Entry");
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.enterAtAnimalName();
	animalControl.animalNameEntry.clickMainTab();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectAtSpecies();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterMicroChipID();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectBreed1();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectBreed2();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtPedigreeName();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectAtSex();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtDOB();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtHeight();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtWeight();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtLength();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectColor1();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectColor2();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectMarkings();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectIssuingAgency();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectMfg();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.saveScreen();
	animalControl.switchToAnimalNameEntry();
	String animalNameID = animalControl.animalNameEntry.readAnimalNameID();
	animalControl.animalNameEntry.clickPrintIcon();
	home.switchToSelectReport();
	home.selectReport.minimizeTheScreen();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.saveNClose();
	loader.navigateToScreen("Animal Lost/Found");
	animalControl.switchToAnimalLostOrFoundEntry();
	animalControl.animalLostOrFoundEntry.enterAnimalNameIDByActiveData(animalNameID);
	animalControl.animalLostOrFoundEntry.tabReportedDateAndTime();
	animalControl.animalLostOrFoundEntry.clickLostCheckBox();
	animalControl.animalLostOrFoundEntry.tabOutLostOrFoundDateAndTime();
	animalControl.animalLostOrFoundEntry.enterAtAnimalLostOrFoundLocation();
	animalControl.animalLostOrFoundEntry.clickAnimalShelterRadioButtonAsYes();
	animalControl.animalLostOrFoundEntry.enterAtReportingPersonsNameID();
	animalControl.animalLostOrFoundEntry.clickReportingPersonsInfoRadioButtonAsYes();
	animalControl.animalLostOrFoundEntry.clickAnimalCollarOrHalterCheckBox();
	animalControl.animalLostOrFoundEntry.saveScreen();
	animalControl.switchToAnimalLostOrFoundEntry();
	animalControl.animalLostOrFoundEntry.clickPrintIcon();
	home.switchToSelectReport();
	home.selectReport.minimizeTheScreen();

}

@Test(groups = { "2020DefectTestCase" }) //Automated by Stalin
public void Phone1andPhone2(ITestContext testContext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "260392");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.clickAddNewButton();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.enterAtLocation(); // Updated
	animalControl.animalCaseEntry.verifyLocationInfoIconIsDisplayed();
	animalControl.animalCaseEntry.tabReportedDateAndTime();
	animalControl.animalCaseEntry.enterAtOfficer();
	animalControl.animalCaseEntry.verifyOfficerInfoIconIsDisplayed();
	animalControl.animalCaseEntry.selectAtComplaintType();
	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.verifyAtLocation();
	animalControl.animalCaseEntry.clickMainTab();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtNameID();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.verifyEnterActivityAcknowledgeMessage();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickMainTab();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.selectMunicipality();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtCFSReportedViolation();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtInitialNatureOfComplaint();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.selectAtActivity();
	String readPhone1 = animalControl.animalCaseEntry.animalCaseEntryMainTab.readPhone1();
	String readPhone2 = animalControl.animalCaseEntry.animalCaseEntryMainTab.readPhone2();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.clickAddButton();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickMainTab();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.clickRowByAtActivityInGrid();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.clickNameInfoButton();
	names.switchToNameEntry();
	names.nameEntry.verifyActivePhoneNumber1(readPhone1);
	names.nameEntry.verifyActivePhoneNumber2(readPhone2);
	names.nameEntry.closeTheScreen();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickReset();
	animalControl.animalCaseEntry.clickMainTab();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.clickRowByAtActivityInGrid();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.verifyActivePhoneNumber1(readPhone1);
	animalControl.animalCaseEntry.animalCaseEntryMainTab.verifyActivePhoneNumber2(readPhone2);
	animalControl.switchToAnimalCaseEntry();

}

@Test(groups = { "2020DefectTestCase" }) // Vijay
public void verifyAnimalLostFoundAnimalLocatedCheckBoxLogic_259716(ITestContext testcontext) {
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "259716");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Lost/Found");
	animalControl.switchToAnimalLostOrFound();
	animalControl.animalLostOrFoundEntry.tabReportedDateAndTime();
	animalControl.animalLostOrFoundEntry.clickLostCheckBox();
	animalControl.animalLostOrFoundEntry.verifyFoundCheckBoxIsDisabled();
	animalControl.animalLostOrFoundEntry.verifyAnimalLocatedCheckBoxIsEnabled();
	animalControl.animalLostOrFoundEntry.clickLostCheckBox();
	animalControl.animalLostOrFoundEntry.clickFoundCheckBox();
	animalControl.animalLostOrFoundEntry.verifyLostCheckBoxIsDisabled();
	animalControl.animalLostOrFoundEntry.verifyAnimalLocatedCheckBoxIsDisabled();
	animalControl.animalLostOrFoundEntry.clickFoundCheckBox();
	animalControl.animalLostOrFoundEntry.clickLostCheckBox();
	animalControl.animalLostOrFoundEntry.clickAnimalLocatedCheckBox();
	animalControl.animalLostOrFoundEntry.tabOutLostOrFoundDateAndTime();
	animalControl.animalLostOrFoundEntry.enterAtAnimalLostOrFoundLocation();
	animalControl.animalLostOrFoundEntry.verifyAddressLostFoundBubbleIcon();
	animalControl.animalLostOrFoundEntry.clickAnimalShelterRadioButtonAsYes();
	animalControl.animalLostOrFoundEntry.enterAtReportingPersonsNameID();
	animalControl.animalLostOrFoundEntry.verifyReportingPersonBubbleIconDisplayed();
	animalControl.animalLostOrFoundEntry.clickMayWeShareReportingPersonInformationAsYes();
	animalControl.animalLostOrFoundEntry.enterAtAnimalNameID();
	animalControl.animalLostOrFoundEntry.verifyAnimalNameBubbleIconDisplayed();
	animalControl.animalLostOrFoundEntry.saveScreen();// Changed
	animalControl.switchToAnimalLostOrFound();
	animalControl.animalLostOrFoundEntry.verifyPrintIconEnabled();
	animalControl.animalLostOrFoundEntry.verifySaveIconDisabled();
	animalControl.animalLostOrFoundEntry.verifySaveNCloseIconDisabled();
	animalControl.animalLostOrFoundEntry.verifyRefreshIconDisabled();
	animalControl.animalLostOrFoundEntry.verifyLostCheckBoxCheckedAndDisabled();
	animalControl.animalLostOrFoundEntry.verifyAnimalLocatedCheckBoxCheckedAndDisabled();

}

@Test(groups = { "AnimalControlCaseEntryFunctional" }) //2021 Q2s4 Automated by Mahesh
public void CreateNewCaseEntry_274398(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274398");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.clickAddNewButton();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.verifyCallNoShownAsNotMandatory();
	animalControl.animalCaseEntry.checkInvestigationAuthorizedCheckBox();
	animalControl.animalCaseEntry.verifyCallNoShownAsMandatory();
	
	animalControl.animalCaseEntry.enterAtCaseNo();
	animalControl.animalCaseEntry.verifyAtLocation();
	
	animalControl.animalCaseEntry.clickCaseInfoIcon();
	records.switchToCaseUpdate();
	String caseReportedDate1 = null;
	String caseReportedTime1 = null;
	records.caseUpdate.GetDateTime(caseReportedDate1, caseReportedTime1);
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.VerifyCaseReportedOnDateAndTime(Playback.getTestContextAttribute("caseReportedDate1"), Playback.getTestContextAttribute("caseReportedTime1"));
	animalControl.animalCaseEntry.enterAtOfficer();
	animalControl.animalCaseEntry.selectAtComplaintType();
	animalControl.animalCaseEntry.clickSaveButton();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.VerifyACENoGenerated();
}
@Test(groups = { "AnimalControlCaseEntryFunctional" }) //2021 Q2s4 Automated by Mahesh
public void CaseEntryMainTabFunctionality_274399(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274399");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.enterAtCaseNo();
	animalControl.animalCaseSearch.enterAtLocation();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.VerifyAtACENo();
	animalControl.animalCaseEntry.clickMainTab();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.verifyEnterNameAcknowledgeMessage();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickMainTab();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.selectAtMunicipality();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtCFSReportedViolation();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtInitialNatureOfComplaint();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.enterAtNameID();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.selectAtActivity();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryMainTab.verifyAtActivityInGrid(0);

	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
}
@Test(groups = { "AnimalControlCaseEntryFunctional" }) //2021 Q2s4 Automated by Mahesh
public void CaseEntryAnimalInfoAndObservationstabFunctionality_274400(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274400");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.enterAtOfficer();
	animalControl.animalCaseSearch.enterAtCFS();
	animalControl.animalCaseSearch.enterAtLocation();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.VerifyAtACENo();
	animalControl.animalCaseEntry.clickAnimalInfoTab();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyEnterAnimalNameAcknowledge();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickAnimalInfoTab();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.enterAtAnimalNameID();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyAtSex();
	//animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyAtBreed1();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyAtBreed2();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyAtDOB();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyAtMicroChipID();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyAtAnimalNameInGrid(0);
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyAtAnimalNameIDInGrid(0);
 
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickSaveButton();
	animalControl.animalCaseEntry.VerifyUpdatedDataExistsinTheAnimalInfoTabAcknowledge();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickAnimalInfoTab();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.saveAnimalInfoTab();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickObservationsTab();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.verifyRequiredEntriesMissingAcknowledge();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickObservationsTab();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectAtAnimalName();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.taboutDateAndTime();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.clickIntakeCheckBox();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.VerifycageDropdownAsMandatory();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectCageDropdownAsAS001();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectAnimalHeldAt();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectMethodOfCapture();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.selectMethodOfIntake();
	animalControl.animalCaseEntry.animalCaseEntryObservationsTab.clickAddButton();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
}


@Test(groups = { "AnimalControlCaseEntryFunctional" }) //2021 Q2s4 Automated by Mahesh
public void CaseEntryResolutionTabFunctionality_274401(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274401");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.enterAtOfficer();
	animalControl.animalCaseSearch.enterAtCFS();
	animalControl.animalCaseSearch.selectAtCage();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.VerifyAtACENo();
	animalControl.animalCaseEntry.clickResolutionsTab();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyRequiredEntriesMissingAcknowledge();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickResolutionsTab();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.selectAtAnimalName();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.taboutDateAndTime();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.clickComplianceCheckBox();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyFollowUpDatesDisabled();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.clickFollowupCallRequiredCheckBox();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyFollowUpDatesEnabled();
	
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.enterFollowUpDate1AsPrevious();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.enterFollowUpDate2AsFuture();
	
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.selectResolutions();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyAnimalDischargedConfirmationAsYes();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickResolutionsTab();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyDischargedCheckBoxChecked();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.selectHealthStatusOut();
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.enterResolutionDayACurrentDate();
	
	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.clickAddButton();
	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickResolutionsTab();

	animalControl.animalCaseEntry.animalCaseEntryResolutionsTab.verifyAtAnimalNameInGrid(0);
}


@Test(groups = { "AnimalControlCaseEntryFunctional" }) //2021 Q2s4 Automated by Mahesh
public void CaseEntryBiteReportTabFunctionality_274402(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274402");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.enterAtOfficer();
	animalControl.animalCaseSearch.enterAtCFS();
	//animalControl.animalCaseSearch.selectAtResolutions();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.VerifyAtACENo();
	animalControl.animalCaseEntry.clickBiteReportTab();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.verifyEnterVictimsNameAcknowledge();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickBiteReportTab();
	
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.enterAtVictimNameID();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.selectAtLocationOfWounds();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.selectAtAnimalsName();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.selectAttack();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.selectAnimalHeldAt();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.clickAddButton();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickSaveButton();
	animalControl.animalCaseEntry.VerifyUpdatedDataExistsinTheBiteReportTabAcknowledge();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickBiteReportTab();
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.verifyAtVictimsName(0);
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.verifyAtAnimalNameIDinGrid(0);
	animalControl.animalCaseEntry.animalCaseEntryBiteReportTab.saveInternal();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
}

@Test(groups = { "AnimalControlCaseEntryFunctional" }) //2021 Q2s4 Automated by Mahesh
public void CaseEntryNarrativeReportTabFunctionality_274403(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274403");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.enterAtOfficer();
	animalControl.animalCaseSearch.enterAtCFS();
	//animalControl.animalCaseSearch.selectAtResolutions();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo();
	animalControl.switchToAnimalCaseEntry();
	
	animalControl.animalCaseEntry.clickNarrativeTab();
	animalControl.animalCaseEntry.narrativeTab.selectAtTempelate();
	animalControl.animalCaseEntry.narrativeTab.clickLoadButton();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickSaveButton();
	animalControl.animalCaseEntry.VerifyUpdatedDataExistsinTheNarrativeTabAcknowledge();
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickNarrativeTab();
	animalControl.animalCaseEntry.narrativeTab.internalSave();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.saveScreen();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickCaseInfoIcon();

	records.switchToCaseUpdate();
	records.caseUpdate.clickReportingTab();
	String Report  =records.caseUpdate.reportingTab.readReportType(0);
	String Report1  =records.caseUpdate.reportingTab.readReportType(1);
	
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickReportingTab();
	animalControl.animalCaseEntry.reportingTab.verifyReportTypeInGrid(Report, 0);
	animalControl.animalCaseEntry.reportingTab.verifyReportTypeInGrid(Report1, 1);
}

@Test(groups = { "AnimalControlFunctional" }) //2021 Q2s4 Automated by Mahesh
public void CreateNewAnimalNameEntry_274472(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274472");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Name Search");
	animalControl.switchToAnimalNameSearchScreen();
	animalControl.animalNameSearch.clickAddNew();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.enterAtAnimalName();
	animalControl.animalNameEntry.enterAtAddress();
	animalControl.animalNameEntry.verifyAddressBubbleIconDisplayed();
	
	animalControl.animalNameEntry.clickMainTab();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectAtSpecies();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterPID();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAID();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterSBCase();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterMicroChipID();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectBreed1();
	animalControl.animalNameEntry.animalNameEntryMainTab.selectBreed2();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtPedigreeName();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtDOB();
	animalControl.animalNameEntry.animalNameEntryMainTab.enterAtVeterinarianNameID();
	
	animalControl.animalNameEntry.saveScreen();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.VerifyAdditionSuccessfulMessage();
	
}
@Test(groups = { "AnimalControlFunctional" }) //2021 Q2s4 Automated by Mahesh
public void AnimalNameEntryOwnerAndMedicalTab_274473(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274473");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Name Search");
	animalControl.switchToAnimalNameSearchScreen();
	animalControl.animalNameSearch.enterAtAnimalNameID();
	animalControl.animalNameSearch.selectAtSpecies();
	animalControl.animalNameSearch.clickSearch();
	animalControl.animalNameSearch.clickGridRowByAnimalName();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.verifyAddressBubbleIconDisplayed();
	animalControl.animalNameEntry.clickOwnerDetailsTab();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.clickAdd();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyRequiredEntriesMissingAcknowledge();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickOwnerDetailsTab();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.enterAtOwnerNameID();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.enterAtACENo();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.clickAdd();
	animalControl.animalNameEntry.saveScreen();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.VerifyUpdateSuccessfulMessage();
	animalControl.animalNameEntry.clickOwnerDetailsTab();
	//animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyAtDateAsCurrentDateInGrid(0);
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyAtNameInGrid(0);
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyAtACENoInGrid(0);
	
	animalControl.animalNameEntry.clickMedicalTab();
	animalControl.animalNameEntry.animalNameEntryMedicalTab.clickAdd();
	animalControl.animalNameEntry.animalNameEntryMedicalTab.verifyEnterDateOfProcedureAcknowlege();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickMedicalTab();
	animalControl.animalNameEntry.animalNameEntryMedicalTab.tabDateOFProcedure();
	animalControl.animalNameEntry.animalNameEntryMedicalTab.selectAtTypeOfProcedure();
	animalControl.animalNameEntry.animalNameEntryMedicalTab.selectAtReasonOfProcedure();
	animalControl.animalNameEntry.animalNameEntryMedicalTab.clickAdd();
	
	animalControl.switchToAnimalNameEntryOfMedical();
	animalControl.animalNameEntryMedicalProcedure.enterTotalCost();
	animalControl.animalNameEntryMedicalProcedure.enterAtVeterinarianID();
	animalControl.animalNameEntryMedicalProcedure.selctVacType();
	animalControl.animalNameEntryMedicalProcedure.selectBrand();
	animalControl.animalNameEntryMedicalProcedure.enterProcedurePerformed();
	animalControl.animalNameEntryMedicalProcedure.saveAndClose();
	
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.saveScreen();
	animalControl.animalNameEntry.VerifyUpdateSuccessfulMessage();
	animalControl.animalNameEntry.clickMedicalTab();
	animalControl.animalNameEntry.animalNameEntryMedicalTab.verifyAtTypeOfProcedureInGrid(0);
	animalControl.animalNameEntry.animalNameEntryMedicalTab.verifyAtReasonOfProcedureInGrid(0);
	animalControl.animalNameEntry.animalNameEntryMedicalTab.verifyAtNameInGrid(0);
}

@Test(groups = { "AnimalControlFunctional" }) //2021 Q2s4 Automated by Mahesh
public void VerifyAddressAndCommentsTabfunctionality_274474(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "274474");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Name Search");
	animalControl.switchToAnimalNameSearchScreen();
	animalControl.animalNameSearch.enterAtAnimalNameID();
	animalControl.animalNameSearch.selectAtTypeOfProcedure();
	animalControl.animalNameSearch.clickSearch();
	animalControl.animalNameSearch.clickGridRowByAnimalName();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.verifyAddressBubbleIconDisplayed();
	animalControl.animalNameEntry.clickAddressesTab();
	animalControl.animalNameEntry.animalNameEntryAddressesTab.enterAtAddress();
	animalControl.animalNameEntry.animalNameEntryAddressesTab.selectAtAddressType();
	animalControl.animalNameEntry.animalNameEntryAddressesTab.clickAdd();
	animalControl.animalNameEntry.saveScreen();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickAddressesTab();
	animalControl.animalNameEntry.animalNameEntryAddressesTab.verifyAtAddres(0);
	
	animalControl.animalNameEntry.switchToCommentsTab();
	animalControl.animalNameEntry.animalNameEntryCommentsTab.EnterComments();
	animalControl.animalNameEntry.animalNameEntryCommentsTab.ClickEnterCommentsButton();
	popup.confirm.yes();
	names.switchToNamesCommentsScreen();
	names.namesComments.Enter100WordsRichText();
	names.switchToNamesCommentsScreen();
	names.namesComments.SaveAndCloseScreen();
	
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.switchToCommentsTab();
	animalControl.animalNameEntry.animalNameEntryCommentsTab.VerifyAtSubjectInGrid(0);
	
}

@Test(groups = { "AnimalControlFunctional" }) //Mithun
public void CreateNewAnimalRegistrationEntry_274499(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
     testcontext.setAttribute("testID", "274499");
     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Animal Control");
     loader.navigateToScreen("Animal Registration Search");
animalControl.switchToAnimalRegistrationSearchScreen();
animalControl.animalRegistrationSearch.clickAddNew();
animalControl.switchToAnimalRegistrationEntry();
animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
animalControl.animalRegistrationEntry.selectAtLicType();
animalControl.animalRegistrationEntry.selectIssuingAgency();
animalControl.animalRegistrationEntry.clickSave();
animalControl.animalRegistrationEntry.verifyEnterLicTagAck();
animalControl.switchToAnimalRegistrationEntry();
animalControl.animalRegistrationEntry.enterAtLicTagNo();
animalControl.animalRegistrationEntry.enterExpireDateAsFutureDate();
animalControl.animalRegistrationEntry.enterAtAnimalNameID();
animalControl.animalRegistrationEntry.clickApplicantsTab();
animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerNameID();
animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtVetnerianNameID();
animalControl.animalRegistrationEntry.save();
animalControl.animalRegistrationEntry.closeScreen();
animalControl.switchToAnimalRegistrationSearchScreen();
animalControl.animalRegistrationSearch.clickBack();
animalControl.animalRegistrationSearch.clickReset();
animalControl.animalRegistrationSearch.enterAtLicTagNo();
animalControl.animalRegistrationSearch.clickSearch();
animalControl.animalRegistrationSearch.selectGridrowByLicTagType();
animalControl.switchToAnimalRegistrationEntry();
animalControl.animalRegistrationEntry.switchToNotesOrConditionsTab();
animalControl.animalRegistrationEntry.animalRegistrationEntryNotesOrConditionsTab.enterNotes();
animalControl.switchToAnimalRegistrationEntry();
animalControl.animalRegistrationEntry.save();     
objectIdentification.windowHandle.switchToMainWindow();
}

@Test(groups = { "AnimalControlFunctional" }) //Mithun
public void VerifyAnimalRegistrationSearchfunctionality_274500(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
     testcontext.setAttribute("testID", "274500");
     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Animal Control");
     loader.navigateToScreen("Animal Registration Search");
animalControl.switchToAnimalRegistrationSearchScreen();
animalControl.animalRegistrationSearch.enterAtRegEntry();
animalControl.animalRegistrationSearch.selectAtLicType();
animalControl.animalRegistrationSearch.enterAtLicTagNo();
animalControl.animalRegistrationSearch.clickSearch();
animalControl.animalRegistrationSearch.selectGridrowByLicTagType();
animalControl.switchToAnimalRegistrationEntry();
animalControl.animalRegistrationEntry.closeScreen();
animalControl.switchToAnimalRegistrationSearchScreen();
animalControl.animalRegistrationSearch.clickBack();
animalControl.animalRegistrationSearch.clickReset();
animalControl.animalRegistrationSearch.enterAtAnimalFirstName();
animalControl.animalRegistrationSearch.enterAtAnimalLastName();
animalControl.animalRegistrationSearch.selectAtSpecies();
animalControl.animalRegistrationSearch.clickSearch();
animalControl.animalRegistrationSearch.selectGridrowByAnimalName();
animalControl.switchToAnimalRegistrationEntry();
animalControl.animalRegistrationEntry.verifyAtRegEntryNo();
animalControl.animalRegistrationEntry.closeScreen();
animalControl.switchToAnimalRegistrationSearchScreen();
animalControl.animalRegistrationSearch.clickBack();
animalControl.animalRegistrationSearch.clickReset();

     
}

@Test(groups = { "AnimalControlFunctional" }) //Mithun
public void VerifyAnimalNameMergefunctionality_274501(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
     String regEntry;
     testcontext.setAttribute("testID", "274501");
     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Animal Control");
     loader.navigateToScreen("Animal Name Merge");
animalControl.switchToAnimalNameMergeScreen();
animalControl.animalNameMerge.enterAtPrimaryNameID();
animalControl.animalNameMerge.clickResetButton();
animalControl.animalNameMerge.enterAtMergeNameID();
animalControl.animalNameMerge.clickSearchButton();
animalControl.animalNameMerge.selectcheckbox();
animalControl.animalNameMerge.verifyMergeButtonEnabled();
animalControl.animalNameMerge.clickMergeButton();
animalControl.switchToAnimalNameMergeHelpWindow();
animalControl.animalNameMergeHelpWindow.clickMergeButton();
animalControl.animalNameMergeHelpWindow.verify6130AddressUpdateAsOtherAddressConfirmation();
animalControl.animalNameMergeHelpWindow.veify6065MergeFieldReplaceWithPrimaryFieldConfirmation();
animalControl.animalNameMerge.verifyNameMergedSuccessfullyAcknowledge();
objectIdentification.windowHandle.switchToMainWindow();     
     
}
@Test(groups = { "2021DefectTestCases" }) //2021 defect automated by Mahesha
public void ToverifyownernamedetailsfromAnimalRegistrationEntry_275940(ITestContext testcontext) 
{
    ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
     testcontext.setAttribute("testID", "275940");
     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Animal Control");
     loader.navigateToScreen("Animal Registration Search");
     animalControl.switchToAnimalRegistrationSearchScreen();
     animalControl.animalRegistrationSearch.clickAddNew();
     animalControl.switchToAnimalRegistrationEntry();
     animalControl.animalRegistrationEntry.enterAtAnimalNameID(0);
		animalControl.animalRegistrationEntry.verifyAtAnimalName();
		animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyOwnerNameIDAsEmpty();
		animalControl.animalRegistrationEntry.selectAtLicType();
		animalControl.animalRegistrationEntry.tabAtIssueDateandTime();
		animalControl.animalRegistrationEntry.enterExpireDateAsFutureDate();
		animalControl.animalRegistrationEntry.enterAtLicTagNo(0);
		animalControl.animalRegistrationEntry.clickSave();
		animalControl.animalRegistrationEntry.verifyAtOwnerNameRequiredAck();
		 animalControl.switchToAnimalRegistrationEntry();
		 animalControl.animalRegistrationEntry.clickAnimalNameInfoBubbleIcon();
		 
		 animalControl.switchToAnimalNameEntry();
		 animalControl.animalNameEntry.clickOwnerDetailsTab();
		 animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.enterAtOwnerNameID();
		 animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.clickAdd();
		 animalControl.animalNameEntry.saveNClose();
		 animalControl.switchToAnimalRegistrationEntry();
	     animalControl.animalRegistrationEntry.tabAtAnimalNameIDField();
	     animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerNameID();
	     animalControl.animalRegistrationEntry.animalRegistrationEntryApplicantTab.verifyAtOwnerName(0);
}

@Test(groups = { "2021DefectTestCases" }) //Raga Ranjani

public void Fire2020DefectVerifyLicTagTypeDropdown_260514(ITestContext testContext)
{
   testContext.setAttribute("testID", "260514");
   
    Browser.NavigateToLoginScreen();
    login.loginScreen.Logon();
    loader.navigateToModule("Accounting");
    loader.navigateToScreen("Invoice Type");
    accounting.SwitchToInvoiceTypeScreen();
//    accounting.invoiceType.SelectRowByAtInvoiceType();
    accounting.SwitchToInvoiceTypeEntry();
    accounting.invoiceTypeEntry.ClickAddNewItemCodeButton();
    accounting.SwitchToItemCodeEntry();
    accounting.itemCodeEntry.EnterAtItemCode();
    accounting.itemCodeEntry.EnterAtDescription();
    accounting.itemCodeEntry.EnterAtAmount();
    accounting.itemCodeEntry.SaveNClose();
    animalControl.switchToAnimalRegistrationSearchScreen();
//    animalControl.animalRegistrationSearch.verifyAtLicTagType();
    animalControl.animalRegistrationSearch.clickAddNew();
    animalControl.switchToAnimalRegistrationEntry();
//    animalControl.animalRegistrationEntry.verifyAtLicTagType();
    	   
}

//Automated by:- Dinesh , Date :- 10/12/2021 , Quarter:-4 , Sprint:-5 , Module:- Animal Control .

@Test(groups = { "2022DefectTestcaseAnimalControl" })
public void ToVerifyNameActivityfromAnimalRegistrationDuplicationOfNameData_282071(ITestContext testcontext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testcontext.setAttribute("testID", "282071");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Animal Control");
	loader.navigateToScreen("Animal Case Search");
	animalControl.switchToAnimalCaseSearch();
	animalControl.animalCaseSearch.clickSearchButton();
	animalControl.animalCaseSearch.selectRowByAtAceNo();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickAnimalInfoTab();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.enterAtAnimalNameID();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.enterAtAnimalNameID();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.clickAddButton();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyDuplicationOfDataFoundAcknowledge();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickAnimalInfoTab();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.clickClearButton();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.saveAnimalInfoTab();
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.clickAnimalInfoTab();
	animalControl.animalCaseEntry.animalCaseEntryAnimalInfoTab.verifyUpdateSuccessfulMessage(); // attention required.
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.closeScreen();
	loader.navigateToScreen("Animal Name Search");
	animalControl.switchToAnimalNameSearchScreen();
	animalControl.animalNameSearch.clickSearch();
	animalControl.animalNameSearch.clickGridRowByAnimalNameID();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickOwnerDetailsTab();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.enterAtOwnerNameID();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.clickAdd();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyAtNameInGrid(); // error detected by dinesh
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.enterAtOwnerNameID();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.clickAdd();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyDuplicationOfDataFoundAcknowledge();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickOwnerDetailsTab();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.clickClearButton();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.saveScreen();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickOwnerDetailsTab();
	animalControl.animalNameEntry.animalNameEntryOwnerDetailsTab.verifyUpdateSuccessfulMessage();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.closeScreen();
	animalControl.switchToAnimalNameSearchScreen();
	loader.navigateToScreen("Animal Name Merge");
	animalControl.switchToAnimalNameMergeScreen();
	animalControl.animalNameMerge.enterAtPrimaryNameID();
	animalControl.animalNameMerge.enterAtMergeNameID();
	animalControl.animalNameMerge.clickSearchButton();
	animalControl.animalNameMerge.verifyAtAnimalIDInMergeTable(0); // JSON DATA MergeAnimalID
	animalControl.switchToAnimalNameMergeScreen();
	animalControl.animalNameMerge.selectcheckbox();
	animalControl.animalNameMerge.verifyMergeButtonEnabled();
	loader.navigateToScreen("Animal Registration Search");
	animalControl.switchToAnimalRegistrationSearchScreen();
	animalControl.animalRegistrationSearch.clickSearch();
	animalControl.animalRegistrationSearch.selectGridrowByRegNo();
	animalControl.switchToAnimalRegistrationEntry();
	animalControl.animalRegistrationEntry.clickAnimalNameInfoBubbleIcon();
	animalControl.switchToAnimalNameEntry();
	animalControl.animalNameEntry.clickActivityTab();
	animalControl.animalNameEntry.animalNameEntryActivityTab.selectGridRowByActivityType(); // Activity Type : Animal Incident
	animalControl.switchToAnimalCaseEntry();
	animalControl.animalCaseEntry.closeScreen();
	animalControl.switchToAnimalNameEntry();
	objectIdentification.windowHandle.switchToMainWindow();
	

}


@AfterMethod(groups = {"2020DefectTestCase","AnimalControlFunctional","AnimalControlCaseEntryFunctional","2021DefectTestCases"})
public void afterMethodRecords(ITestResult testResult) 
{
	 try {
			ExtentReport.getResult(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 ExtentReport.GenerateHTML();
			Playback.stop();

			login.Reset();
			loader.Reset();
			animalControl.Reset();
}



@AfterSuite(groups = {"2020DefectTestCase","AnimalControlFunctional","AnimalControlCaseEntryFunctional","2021DefectTestCases"})
public void afterRunSuite()
{
	ExtentReport.GenerateHTML();
	
}

	/*
	 * @AfterMethod public void afterMethodRecords() { Playback.stop();
	 * 
	 * login.Reset(); loader.Reset(); animalControl.Reset(); }
	 */

}
