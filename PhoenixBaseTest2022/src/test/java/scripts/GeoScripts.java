package scripts;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Settings;
import reports.ExtentReport;
import resources.PropertiesFile;
//import resources.PropertiesFile;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;

public class GeoScripts {

	public Geo geo;
	public Login login;
	public Loader loader;
	public Settings settings;
	public String nodeUrl;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Names names;
	public Home home;

	// @BeforeTest

	// ITestContext testContext;

	@BeforeSuite(groups = { "2020DefectStreetSearch", "2020DefectAddressFlag",
			"2020DefectCommonNames", "2020DefectAttachments", "2021DefectTestCases", "2020DefectStreetEntry",
			"GeoFunctional1" , "GeoFunctional2" , "GeoFunctional3","2022DefectTestCasesGeo" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = { "2020DefectStreetSearch", "2020DefectAddressFlag",
			"2020DefectCommonNames", "2020DefectAttachments", "2021DefectTestCases", "2020DefectStreetEntry",
			"GeoFunctional1" , "GeoFunctional2" , "GeoFunctional3","2022DefectTestCasesGeo"})
	public void BeforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Geo");
		Playback.testContext = testContext;

		Playback.start();

		login = new Login();
		loader = new Loader();
		geo = new Geo();
		settings = new Settings();
		objectIdentification = new ObjectIdentification();
		names = new Names();
		home = new Home();
		popup = new Popup();
	}

	@Test(groups = { "GeoFunctional1" })
	public void CreateNewStreet_112850(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "112850");
		// Playback.testContext=testContext;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.ClickSaveButton();
		geo.streetEntry.VerifyAcknowlegdeSaveMessage();
		geo.switchToStreetEntry();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.VerifyAcknowledgeAddMessage();
		geo.switchToStreetEntry();
		geo.streetEntry.SelectAtPrefix();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.SelectAtSuffix();
		geo.streetEntry.enterAtZipCode();																//updated
		geo.streetEntry.clickAddButton();
		geo.streetEntry.VerifyStreetNameWithPrefixSuffixAndTypeInGrid(0);
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.VerifyStatusMessage();
		geo.streetEntry.closeStreetEntry();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtPrefix(0);				// changed index from 1 to 0 
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.VerifyAtStreetType(0);
		geo.streetSearch.VerifyAtSuffix(0);				// changed index from 1 to 0
		
	}

	@Test(groups = { "GeoFunctional1" })
	public void VerifyDuplicatestreet_112851(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "112851");
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.SelectAtPrefix();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.SelectAtSuffix();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.VerifyStreetNameWithPrefixSuffixAndTypeInGrid(0);
		geo.streetEntry.Save();
		geo.streetEntry.VerifyAcknowledgeRecordExistsMessage();
		geo.switchToStreetEntry();
		geo.streetEntry.VerifyRecordExisitStatusMessage();
		geo.streetEntry.closeStreetEntry();
	

	}

	@Test(groups = { "GeoFunctional1" })
	public void AddPremisestoExistingStreet_112852(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "112852");
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.VerifyAtStreetType(0);
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickSaveButton();
		geo.addressIntersection.VerifyAcknowlegdeSaveMessage();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAcknowledgeAddPremiseMessage();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNumber();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAcknowledgeEvenNumber();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.EnterAtEvenNumber();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAcknowledgeOddNumber();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.EnterAtOddEvenNumber();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyOddEvenPremiseAdded(0);
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.EnterAtOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyOddPremiseAdded(1);
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.EnterAtEvenNumber();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyEvenPremiseAdded();
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.EnterAtPremiseOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyPremiseAdded();
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.EnterAtEvenNumber();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAcknowledgeOverlapping();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickSaveButton();
		geo.addressIntersection.VerifyAcknowledgeUpdateMessage();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.SaveScreen();
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();
	

	}

	@Test(groups = { "GeoFunctional1" })
	public void VerifyStreetwithPremiseNo_112853(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "112853");
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.ClickAllTabs();

	}

	//Reworked by:- Abi, Date :- 11/03/2021 , Module:-Geo .
	@Test(groups = { "GeoFunctional1" })
	public void UpdateandDeleteExistingpremises_112854(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112854);
		// Playback.testContext=testContext;

		//int rowCount = 0;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickRow(0);
		geo.addressIntersection.UpdatePremiseDetailsPatrolZoneAndSubZone();
		geo.addressIntersection.ClickSaveNClose();
		geo.addressIntersection.VerifyAcknowledgeUpdateMessage();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyUpdatedPremiseDetailsPatrolZoneAndSubZoneIsNotNullInTheGrid(0);
		geo.addressIntersection.SaveScreen();																// updated
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();										// updated
		geo.addressIntersection.saveNCloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();																	// Added by Abi
		geo.addressIntersection.EnterAtOddNumber();																	//
		geo.addressIntersection.SelectAsOdd();																		//
		geo.addressIntersection.SelectPatrolZone();
		geo.addressIntersection.SelectSubZone();
		geo.addressIntersection.clickAddButton();															//Added by Abi
		geo.addressIntersection.VerifyUpdatedPremiseDetailsPatrolZoneAndSubZoneIsNotNullInTheGrid(1);		// Changed by Abi
		geo.addressIntersection.ClickDeleteRow(1, 1);
		geo.addressIntersection.VerifyConfirmationDeleteMessage();
		geo.switchToAddressIntersection();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();										// Added method By Abi
		geo.addressIntersection.closeAddressIntersectionScreen();
		geo.switchToStreetSearchScreen();																			//
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();	
		geo.addressIntersection.clickRefreshButton();														//updated
		geo.addressIntersection.VerifyRowDeletedInTheGrid(2);												//Changed by Abi
		geo.addressIntersection.SaveScreen();
		
	}
//Reworked by:-Abi , Date :- 11/03/2021 , Module:- Geo.
	@Test(groups = { "GeoFunctional1" })
	public void VerifyInactivePremises_112860(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112860);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickRefreshButton();
		geo.addressIntersection.ClickAtOddEvenRow();
		geo.addressIntersection.VerifyOddEvenViewed();      // Added by Abi
		geo.addressIntersection.clickInactiveCheckBox(); 
		geo.addressIntersection.VerifyCurrentDate();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();								//updated
		geo.addressIntersection.clickRefreshButton();
		geo.addressIntersection.VerifyInactiveRowGraycolor(0);
		geo.addressIntersection.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtOddEvenStreetName();		//Added method w/o prefix
		geo.addressSearch.verifyAcknowledgePremiseInactiveAddress();
		

	}

	//Reworked by:- Abi , Date :- 11/09/2021 , Module:- Geo .
	@Test(groups = { "GeoFunctional1" })
	public void VerifyActivePremises_112861(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112861);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();	
		geo.addressIntersection.clickRefreshButton();						//updated
		geo.addressIntersection.ClickAtOddEvenRow();	
		geo.addressIntersection.VerifyOddEvenViewed();
		//geo.addressIntersection.clickInactiveCheckBox();					// Commented as already the premise is inactive
		geo.addressIntersection.VerifyInactiveDateDisabled();				// Changed by Abi
		geo.addressIntersection.VerifyInactiveRowGraycolor(0);
//		geo.addressIntersection.clickAddButton();
//		geo.addressIntersection.SaveScreen();
//		geo.addressIntersection.clickRefreshButton();						// commented and inserted after few lines
//		geo.addressIntersection.SaveScreen();
//		geo.addressIntersection.ClickAtOddEvenRow();
//		geo.addressIntersection.VerifyOddEvenViewed();
		geo.addressIntersection.clickInactiveCheckBox();
		geo.addressIntersection.VerifyInactiveDateIsBlank();				// Added method by Abi
		geo.addressIntersection.clickAddButton();							// Added by Abi
		geo.addressIntersection.SaveScreen();				
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();      //updated
		geo.addressIntersection.clickRefreshButton();
		geo.addressIntersection.verifyActiveRowBlackColor(0);				// Added method by Abi
		geo.addressIntersection.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtOddEvenStreetNameWithPrefix();
		geo.addressSearch.VerifyAtOddEvenStreet();
		geo.addressSearch.ClickAllTabs();

	}

	//Reworked by:- Abi, Date :-11/03/2021 , Module:- Geo .
	@Test(groups = { "GeoFunctional1" })
	public void AddDeleteVerifyAddressFlag_112862(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112862);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Flag(P)");
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.EnterAtAddress();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyNoRecordFoundAcknowledgeMessage();
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.ClickAddNew();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.ClickSaveButton();
		//geo.AddressFlagEntry.VerifyEnterAtLeastOneRowAcknowledgeMessage();
		// geo.AddressFlagEntry.ClickAddButton();
		geo.addressFlagEntry.VerifyDisplayConditionAcknowledgeAddMessage();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.EnterAtAddress();
		geo.addressFlagEntry.VerifyOddValuesExist();
		geo.addressFlagEntry.EnterRemarks();
		geo.addressFlagEntry.EnterAtDisplayCondition();
		geo.addressFlagEntry.ClickSaveButton();
		geo.addressFlagEntry.VerifyActiveDateAcknowledgeAddMessage();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.EnterActiveDate();
//		 geo.addressFlagEntry.ClickAddButton();									// commented due to changes in screen
//		 geo.addressFlagEntry.VerifyActiveAsCurrentDate(0);
//		 geo.addressFlagEntry.VerifyAtDisplayCondition(0);
		geo.addressFlagEntry.EnterCommentInRichText();
		geo.addressFlagEntry.ClickSaveButton();
		geo.addressFlagEntry.verifyAdditionSuccessfulStatusMessage();			// updated
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.CloseScreen();
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.VerifyActiveDateAsCurrentDate(0);
		geo.addressFlag.VerifyAtDisplayCondition(0);
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.ClickToFlagTab();
		//geo.addressSearch.addressSearchFlagsTab.VerifyFlagDetailsViewed(0);	// commented due to changes in screen
		geo.addressSearch.addressSearchFlagsTab.VerifyActiveAsOfAsCurrentDate();
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickRefreshButton();                       	//updated
		geo.addressIntersection.DeleteAtOddRow();
		geo.addressIntersection.VerifyAcknowlegeReviewMessage();   // Changed by Abi
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();
	}
	
	//Reworked by:- Abi , Date :- 11/09/2021 , Module:- Geo.

	@Test(groups = { "GeoFunctional1" })
	public void DeleteAddressFlagAndPremise_112864(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112864);
		// Playback.testContext=testContext;

		//int rowCount = 0;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Flag(P)");
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.EnterAtOddEvenStreetName();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyAtDisplayCondition(0);
		geo.addressFlag.ClickAtAddress();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.VerifyAtAddress();							//updated
		// geo.AddressFlagEntry.VerifyActiveAsCurrentDate();
		// geo.AddressFlagEntry.VerifyAtDisplayCondition(0);
		// geo.AddressFlagEntry.DeleteFlag();
		// geo.AddressFlagEntry.VerifyConfirmationDeleteMessage();
		geo.addressFlagEntry.DeleteAddressFlag();						
//		geo.addressFlagEntry.VerifyDeletionSuccessfulMessage();			// commented by Abi due to functionality changes				
//		geo.addressFlagEntry.ClickSaveButton();												//
//		geo.switchToAddressFlagEntry();									
//		geo.addressFlagEntry.CloseScreen();								//	commented by Abi due to functionality changes
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.VerifyNoRecordFoundAcknowledgeMessage();
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickRefreshButton();					 //updated
		geo.addressIntersection.ClickDeleteRow(0, 1); 
		geo.addressIntersection.VerifyConfirmationDeleteMessage();
		geo.addressIntersection.SaveScreen();
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();	 //updated
		geo.addressIntersection.VerifyRowDeletedInTheGrid(1);

	}

	@Test(groups = { "GeoFunctional1" })
	public void CreateAndVerifyApartmentPopup_112874(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112874);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.VerifyAtStreetName();
		geo.apartment.ClickAddButton();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.ClickSaveButton();
		geo.apartmentEntry.VerifyAcknowlegdeSaveMessage();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.VerifyAcknowledgeAddMessage();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterAtPremise();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.VerifyPermiseUneditable();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.VerifyAcknowledgeApartmentvalue();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterAtApartmentFrom();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterAtApartmentTo();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.VerifyApartmentViewed(0);
		geo.apartmentEntry.SaveScreen();
		geo.apartmentEntry.verifyAdditionSuccessfulStatusMessage();			//updated
		geo.apartmentEntry.CloseScreen();
		geo.switchToApartment();
//		geo.apartment.CloseScreen();							//Added by Abi due to blue screen issue in automation DB
//		geo.switchToStreetSearchScreen();							//
//		geo.streetSearch.SelectManageApartment();
//		geo.switchToApartment();								//Added by Abi due to blue screen issue in automation DB
		geo.apartment.VerifyPremiseViewed(0); 
		geo.apartment.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToApartmentHelpWindow();
		geo.apartmentHelpWindow.VerifyLocation();
		geo.apartmentHelpWindow.VerifyApartmentRange();
		geo.apartmentHelpWindow.enterAtApartment();
		geo.apartmentHelpWindow.clickUseThisAptNo();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.VerifyAtAddresseAndApartment();
		geo.addressSearch.ClickAllTabs();
	}

	@Test(groups = { "GeoFunctional2" })
	public void SplitandVerifyapartment_112875(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112875);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.VerifyAtStreetName();
		geo.apartment.ClickAtPremise();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.clickRefreshButton();												//Added by Abi
		geo.apartmentEntry.VerifyApartmentViewed(0);
		geo.apartmentEntry.VerifyPremise();
		geo.apartmentEntry.ClickAtApartmentFrom();
		geo.apartmentEntry.EnterAtSplitTo();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.VerifyApartmentSplited(0);
		geo.apartmentEntry.SaveScreen();
		geo.apartmentEntry.verifyUpdateSuccessfulStatusMessage();								//updated
		geo.apartmentEntry.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToApartmentHelpWindow();
		geo.apartmentHelpWindow.EnterAtSplitApartment();
		geo.apartmentHelpWindow.clickUseThisAptNo();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.VerifyAtAddressWithSplitApartment();
		geo.addressSearch.ClickAllTabs();
	}
	
	@Test(groups = { "GeoFunctional2" })

	public void CreateCommonNameforApartmentAndVerify_112876(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112876);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.enterAtAddress();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAcknowledgeNoRecordFound();
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickAddNew();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.ClickSaveButton();
		geo.commonNamesEntry.VerifyAcknowlegdeMessageRequiredEntriesAreMissing();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifyAcknowledgeMessageEnterCommonName();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.enterAtAddress();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtCommonName();
		geo.commonNamesEntry.EnterAtSortOrder();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifyAtCommonNameExist(0);
		geo.commonNamesEntry.SaveScreen();
		geo.commonNamesEntry.verifyAdditionSuccessfulStatusMessage();									//updated
		geo.commonNamesEntry.CloseScreen();
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.VerifyAtAddress(0);
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtCommonName();
		geo.addressSearch.VerifyStreetNameWithApartment();
		geo.addressSearch.VerifyAtCommonName();
		geo.addressSearch.ClickAllTabs();

	}

	@Test(groups = { "GeoFunctional2" })
	public void DeleteApartmentVerifyCommonNameReview_112877(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112877);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.VerifyAtStreetName();
		geo.apartment.ClickAtPremise();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.DeleteAtApartment();
		geo.apartmentEntry.VerifyAcknowlegeReviewMessage();      // Changed by Abi
//		geo.switchToApartmentEntry();
//		//geo.switchToCommonNamesEntry();
//		geo.apartmentEntry.CloseScreen();
//		geo.switchToApartment();
//		geo.apartment.CloseScreen();
	}

	//Reworked by:- Abi  , Date :- 11/10/2021 , Module:- Geo .
	@Test (groups = { "GeoFunctional2" })
	public void DeleteCommonNameandDeleteApartment_112878(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112878);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.EnterAtCommonName();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.VerifyAtAddress(0);
		//geo.commonNames.ClickAtCommonName(0);
		geo.commonNames.clickAtCommonName();						// Added by Abi
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.clickRefreshButton();					//updated
		geo.commonNamesEntry.VerifyAtCommonNameExist(0);
		//geo.commonNamesEntry.DeleteAtCommonNameRow(0);
		geo.commonNamesEntry.DeleteAtCommonNameRow();				// Added by Abi
		geo.commonNamesEntry.VerifyConfirmationDeleteMessage();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.SaveScreen();
		geo.commonNamesEntry.verifyUpdateSuccessfulStatusMessage();  //updated
		geo.commonNamesEntry.VerifyRowsNotExits();					// delete issue report to module owner CRM# 57899
		geo.commonNamesEntry.CloseScreen();
		geo.switchToCommonNamesScreen();
		geo.commonNames.VerifyAcknowledgeNoRecordFound(); 			// validation error message shows. CRM# created
		//geo.switchToCommonNamesEntry();							// Commented by Abi
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.VerifyAtStreetName();
		geo.apartment.VerifyPremiseViewed(0);						//Added by Abi
		geo.apartment.ClickAtPremise();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.clickRefreshButton();                    //updated
		geo.apartmentEntry.DeleteAtApartment();
		geo.apartmentEntry.VerifyConfirmationDeleteMessage();
		geo.switchToCommonNamesEntry();
		geo.apartmentEntry.SaveScreen();
		geo.apartmentEntry.verifyUpdateSuccessfulStatusMessage();

	}

	@Test(groups = { "GeoFunctional2" })
	public void AddIntersectionStreetandVerify_112879(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112879);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
//		geo.streetSearch.clickAddNew();															 // commented as dataset has been added for these steps
//		geo.switchToStreetEntry();
//		geo.streetEntry.SelectAtInterPrefix();
//		geo.streetEntry.EnterAtInterStreetName();
//		geo.streetEntry.EnterAtInterStreetType();
//		geo.streetEntry.SelectAtInterSuffix();
//		geo.streetEntry.enterAtZipCode();
//		geo.streetEntry.clickAddButton();
//		geo.streetEntry.VerifyInterSectionStreetNameWithPrefixSuffixAndTypeInGird(0);
//		geo.streetEntry.Save();
//		geo.streetEntry.VerifyAdditionSuccessfulStatusMessage();                         			//updated
//		geo.streetEntry.closeStreetEntry();
//		geo.switchToStreetSearchScreen();
		geo.streetSearch.EnterAtInterStreetName();
		geo.streetSearch.EnterAtInterStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtIntersectionStreetName();
		geo.streetSearch.ClickClearFields();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.VerifyAtStreetName();
		geo.addressIntersection.EnterInvalidPremiseNumber();
		geo.addressIntersection.VerifyAcknowledgeValidPremise();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtInterStreetWithType();
		geo.addressIntersection.EnterAtPremiseNumber();
		geo.addressIntersection.EnterAllFields();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAtInterStreetViewed(0);
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.verifyAdditionSuccessfulStatusMessage(); 								//updated
		geo.addressIntersection.CloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.ClickIntersectionCheckBox();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetNameAndIntersection(0);
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtStreetNameAndTypeWithIntersectionSlashCharacter();
		geo.addressSearch.VerifyAtIntersectionAddressByStreetName();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.EnterAtInterIntersectionStreetNameAndTypeWithSlashCharacter();
		geo.addressSearch.VerifyAtIntersectionAddressByIntersectionStreetName();

	}

	@Test(groups = { "GeoFunctional2" })
	public void CreateCommonNameforIntersectionAndVerify_112880(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112880);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickAddNew();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtStreetNameWithIntersectionSlash();
		geo.commonNamesEntry.VerifyAtStreetAndInterSectionStreet();
		geo.commonNamesEntry.EnterAtCommonName();
		geo.commonNamesEntry.EnterAtSortOrder();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifyAtCommonNameExist(0);
		geo.commonNamesEntry.SaveScreen();
		geo.commonNamesEntry.verifyAdditionSuccessfulStatusMessage();								//updated
		geo.commonNamesEntry.CloseScreen();
		geo.switchToCommonNamesScreen();
		geo.commonNames.EnterAtStreetNameWithInter();
		geo.commonNames.VerifyAtStreetNameAndInterSectionStreetName();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.VerifyAtAddress(0);
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtCommonName();
		geo.addressSearch.VerifyAtStreetNameAndIntersectionStreetName();
		geo.addressSearch.VerifyAtCommonName();

	}

	@Test(groups = { "GeoFunctional2" })
	public void DeleteIntersectionVerifyCommonNameReview_112881(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112881);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.ClickIntersectionCheckBox();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.VerifyAtIntersectionStreetName();
		geo.streetSearch.ClickIntersectionCheckBox();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickRefreshButton();  								//updated
		geo.addressIntersection.VerifyAtStreetNameAndIntersectionStreetName(0);
		geo.addressIntersection.DeleteAtIntersectionStreetRow();
		geo.addressIntersection.VerifyAcknowlegeReviewMessageCommon();             // Changed by Abi
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();
	}

	@Test(groups = { "GeoFunctional2" })
	public void DeleteCommonNameandDeleteintersection_112882(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112882);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.EnterAtCommonName();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.VerifyAtAddress(0);
		geo.commonNames.clickAtCommonName();                 		 						// Changed method w/o index by Abi
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.clickRefreshButton(); 											//updated
		geo.commonNamesEntry.VerifyAtCommonNameExist(0);
		geo.commonNamesEntry.DeleteAtCommonNameRow();										// Changed method w/o index
		geo.commonNamesEntry.VerifyConfirmationDeleteMessage();
		geo.switchToCommonNamesEntry();														// Changed by Abi
		geo.commonNamesEntry.SaveScreen();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.verifyUpdateSuccessfulStatusMessage(); 						 //updated
		geo.commonNamesEntry.VerifyRowsNotExits();                  						 // delete issue reported to module owner
		geo.commonNamesEntry.CloseScreen();
		geo.switchToCommonNamesScreen();
		geo.commonNames.VerifyAcknowledgeNoRecordFound();            						// validation error message shows. CRM# created
		
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickRefreshButton(); 				 						//updated
		geo.addressIntersection.VerifyAtStreetNameAndIntersectionStreetName(0);
		geo.addressIntersection.DeleteAtIntersectionStreetRow();
		geo.addressIntersection.VerifyConfirmationDeleteMessage();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage(); 						//updated
		geo.addressIntersection.VerifyIntersectionRowsNotExist();
		
	}

	@Test(groups = { "GeoFunctional2" })
	public void AddandVerifyAltStreet_112884(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112884);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.VerifyAtStreetType(0);
		geo.streetSearch.SelectManageStreet();
		geo.switchToStreetUpdate();
		geo.streetUpdate.clickRefreshButton();
		geo.streetUpdate.VerifyMainStreetName();
		geo.streetUpdate.VerifyMainStreetType();
		geo.streetUpdate.ClickAddButton();
		geo.streetUpdate.VerifyAcknowledgeAddMessage();
		geo.switchToStreetUpdate();
		geo.streetUpdate.EnterAtAltStreet();
		geo.streetUpdate.EnterAtAltStreetType();
		geo.streetUpdate.ClickAddButton();
		geo.streetUpdate.VerifyAlterStreetNameAddedInTheGird(0);
		geo.streetUpdate.SaveScreen();
		geo.switchToStreetUpdate();
		geo.streetUpdate.verifyAdditionSuccessfulStatusMessage();                          //updated
		geo.streetUpdate.CloseStreetUpdateScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyAtAddress();
		geo.addressSearch.VerifyAtAltStreetName();
	}

	@Test(groups = { "GeoFunctional2" })
	public void ReplaceMainstreetandVerifyAlternativeStreet_112885(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112885);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageStreet();
		geo.switchToStreetUpdate();
		geo.streetUpdate.clickRefreshButton();
		geo.streetUpdate.VerifyMainStreetName();
		geo.streetUpdate.VerifyMainStreetType();
		geo.streetUpdate.VerifyAlterStreetNameAddedInTheGird(0);
		geo.streetUpdate.ClickAtAltStreetName();
		geo.streetUpdate.VerifyAtAltStreetName();
		geo.streetUpdate.VerifyAtAltStreetType();
		geo.streetUpdate.ClickReplaceCheckBox();
		geo.streetUpdate.ClickAddButton();
		geo.streetUpdate.VerifyReplaceCheckBoxChecked(0);
		geo.streetUpdate.SaveScreen();
		geo.switchToStreetUpdate();
		geo.streetUpdate.verifyUpdateSuccessfulStatusMessage(); 
		geo.streetUpdate.CloseStreetUpdateScreen();

		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtPremiseWithAlterStreetName();
		geo.addressSearch.VerifyAtAddress();
		geo.addressSearch.VerifyAtAltStreetName();

	}
	
	//Reworked by:-Abi  , Date :- 11/12/2021, Module:- Geo.

	@Test (groups = { "GeoFunctional3" })
	public void PerformBatchUpdateandVerify_112886(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112886);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Batch Update(P)");
		geo.switchToBatchUpdate();
		geo.batchUpdate.EnterAtStreetName();
		geo.batchUpdate.EnterAtStreetType();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.ClickSelectAllCheckBox();
		geo.batchUpdate.ClickUpdateButton();
		geo.batchUpdate.batchUpdatePopup.SelectAtPremiseType();      
		geo.batchUpdate.batchUpdatePopup.EnterAtZipCode();
		geo.batchUpdate.batchUpdatePopup.EnterAtSubZone();
		geo.batchUpdate.batchUpdatePopup.EnterAtCivilDistrict();
		geo.batchUpdate.batchUpdatePopup.EnterAtPatrolZone();
		geo.batchUpdate.batchUpdatePopup.EnterAtNPACard();
		geo.batchUpdate.batchUpdatePopup.EnterAtTrack();
		geo.batchUpdate.batchUpdatePopup.ClickAddCheckbox();							 
		geo.batchUpdate.batchUpdatePopup.EnterAtCensus();			 				
		geo.batchUpdate.batchUpdatePopup.EnterAtCustom1();			 
		geo.batchUpdate.batchUpdatePopup.UpdateScreen();
		geo.batchUpdate.VerifyUpdateSuccessfulAcknowledgeMessage();						//updated
		geo.switchToBatchUpdate();
		geo.batchUpdate.clickRefreshButton();                             
		geo.batchUpdate.VerifyAtStreetName(0);
		geo.batchUpdate.VerifyAtZipcode(0);
		geo.batchUpdate.VerifyAtTrackNo(0);
		geo.batchUpdate.VerifyAtSubZone(0);
		geo.batchUpdate.VerifyAtPatrolZone(0);
		geo.batchUpdate.VerifyAtNPACard(0);
		geo.batchUpdate.VerifyAtCustom(0);
		geo.batchUpdate.VerifyAtCivilDistrict(0);
		geo.batchUpdate.VerifyAtCensus(0);

	}

	@Test (groups = { "GeoFunctional3" })
	public void VerifyBatchUpdatevalues_112888(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112888);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Batch Update(P)");
		geo.switchToBatchUpdate();
		geo.batchUpdate.EnterAtStreetName();
		geo.batchUpdate.EnterAtStreetType();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.VerifyAtStreetName(0);
		geo.batchUpdate.VerifyAtZipcode(0);
		geo.batchUpdate.VerifyAtTrackNo(0);
		geo.batchUpdate.VerifyAtSubZone(0);
		geo.batchUpdate.VerifyAtPatrolZone(0);
		geo.batchUpdate.VerifyAtNPACard(0);
		geo.batchUpdate.VerifyAtCustom(0);
		geo.batchUpdate.VerifyAtCivilDistrict(0);
		geo.batchUpdate.VerifyAtCensus(0);
		geo.batchUpdate.SelectAtPremiseNo();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickRefreshButton();  								//updated
		geo.addressIntersection.VerifyAtStreetName();
		geo.addressIntersection.VerifyAtPatrolZoneGrid(0);
		geo.addressIntersection.VerifyAtSubZoneGrid(0);
		geo.addressIntersection.VerifyAtCensusGrid(0);
		geo.addressIntersection.verifyAtZipCodeGrid(0);
		geo.addressIntersection.clickAtPremiseNo();
		geo.addressIntersection.VerifyBatchUpdateDetailsAtZipCodeCensusNPACard();
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.DoubleClickAtPremise();
		geo.switchToAddressIntersection2040();
		geo.addressIntersection2040.clickRefreshButton();							//updated
		geo.addressIntersection2040.VerifyAtStreetNameAndStreetType();
		geo.addressIntersection2040.VerifyAtPremise();
		geo.addressIntersection2040.switchToMainTab();
		geo.addressIntersection2040.addressIntersectionMainTab.VerifyAtCensus();
		geo.addressIntersection2040.addressIntersectionMainTab.VerifyAtPremiseType();
		geo.addressIntersection2040.switchToPoliceTab();
		geo.addressIntersection2040.policeTab.ClickAtCivilDistrictInGrid();
		geo.addressIntersection2040.policeTab.VerifyAtCivilDistrict();
		geo.addressIntersection2040.policeTab.VerifyAtCustom1();
		geo.addressIntersection2040.policeTab.VerifyAtNPACard();
		geo.addressIntersection2040.policeTab.VerifyAtPatrolZone();
		geo.addressIntersection2040.policeTab.VerifyAtSubZone();
		geo.addressIntersection2040.policeTab.VerifyAtTrackNo(0);
		geo.switchToAddressIntersection2040();
		geo.addressIntersection2040.Save();
		geo.switchToAddressIntersection2040();
		geo.addressIntersection2040.verifyUpdateSuccessfulStatusMessage();           //updated
		geo.addressIntersection2040.CloseScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickClearButton();
		geo.addressIntersection.SaveScreen();
		geo.addressIntersection.verifyUpdateSuccessfulStatusMessage(); 				//updated
		geo.switchToAddressIntersection();

	}

	@Test (groups = { "GeoFunctional3" })
	public void VerifyCommonNamesortfunctionality_112931(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112931);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickAddNew();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtStreetDetails();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtCommonName();
		geo.commonNamesEntry.EnterAtSortOrder();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifyAtCommonNameExist(0);
		geo.commonNamesEntry.EnterAtCommonName1();
		geo.commonNamesEntry.EnterAtSortOrder1();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifyAtCommonName1AndSortOrderExist(1);
		geo.commonNamesEntry.SaveScreen();
		geo.commonNamesEntry.verifyAdditionSuccessfulStatusMessage(); 			//updated
		geo.commonNamesEntry.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtCommonName1();
		geo.addressSearch.VerifyAtAddress();
		geo.addressSearch.VerifyAtCommonName();
	}

	@Test (groups = { "GeoFunctional3" })
	public void ChangeSortorderandVerifyCommonName_112934(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112934);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.EnterAtCommonName();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.VerifyAtAddress(0);
		geo.commonNames.clickAtCommonName();  										// Changed method w/o index
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.ClickAtCommonName();
		geo.commonNamesEntry.UpdateSortOrderAs2();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifySortOrderAs2(0);
		geo.commonNamesEntry.ClickSaveButton();
		geo.commonNamesEntry.VerifyAcknowlegdeSortOrderMessage();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.ClickAtCommonName1();
		geo.commonNamesEntry.UpdateSortOrderAs0();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifySortOrderAs0(1);
		geo.commonNamesEntry.SaveScreen();
		geo.commonNamesEntry.verifyUpdateSuccessfulStatusMessage(); 			   //updated
		geo.commonNamesEntry.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtCommonName();
		geo.addressSearch.VerifyAtAddress();
		geo.addressSearch.VerifyAtCommonName1();
	}

	@Test (groups = { "GeoFunctional3" })
	public void Verifysystemparameters_112935(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112935);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		// // SettingsScripts.SettingsTestContext = GeoTestContext;
		settings.sysParameter.enterParameterIDAs508();
		settings.switchToSystemParamter();
		settings.sysParameter.enterParameterIDAs509();
		//objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtCommonName();
		geo.addressSearch.VerifyAtParaIDButtonExist();
		geo.addressSearch.ClickAtParaIDNameButton();
		geo.switchToGoogleMap();
		geo.addressSearch.CloseScreen();

	}

	@Test (groups = { "GeoFunctional3" })
	public void VerifyWeatherIcon_112976(ITestContext testContext ) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112976);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyAtAddress();
		geo.addressSearch.ClickWeatherButton();
		geo.switchToWeatherScreen();
		geo.weatherScreen.VerifyAsWeatherScreenDisplayed();
		geo.weatherScreen.CloseScreen();

	}

	@Test (groups = { "GeoFunctional3" })
	public void HazmatFlagSearch_112975(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112975);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("HazMat Flags");
		geo.switchToHazMatFlags();
		geo.hazMatFlags.EnterAtLocation();
		geo.hazMatFlags.ClickSearchButton();
		geo.hazMatFlags.VerifyAtLocation(0);
		geo.hazMatFlags.VerifyAtChemicalName(0);
		geo.hazMatFlags.ClickAtLocation();
		geo.switchToHazMatFlagEntry();
		geo.hazMatFlagEntry.clickRefreshButton();												//updated
		geo.hazMatFlagEntry.VerifyLocation();
		geo.hazMatFlagEntry.ClickAllTabs();
		geo.hazMatFlagEntry.switchToChemicalTab();
		geo.hazMatFlagEntry.chemicalsTab.ClickChemicalID(0);
		geo.hazMatFlagEntry.chemicalsTab.VerifyChemicalName();
		geo.switchToHazMatFlagEntry();
		geo.hazMatFlagEntry.Save();
		geo.hazMatFlagEntry.verifyUpdateSuccessfulMessageInFooter();							//updated
		geo.hazMatFlagEntry.CloseScreen();
		geo.switchToHazMatFlags();
		geo.hazMatFlags.EnterAtChemicalName();
		geo.hazMatFlags.ClickSearchButton();
		geo.hazMatFlags.VerifyAtLocation(0);
		geo.hazMatFlags.VerifyAtChemicalName(0);
		geo.hazMatFlags.ClickAtLocation();
		geo.switchToHazMatFlagEntry();
		geo.hazMatFlagEntry.VerifyLocation();
		geo.hazMatFlagEntry.CloseScreen();
	}

	@Test (groups = { "GeoFunctional3" })
	public void HydrantSearch_112947(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 112947);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Hydrant Search");
		geo.switchToHydrantSearch();
		geo.hydrantSearch.EnterAtHydrantID();
		geo.hydrantSearch.clickSearch();
		geo.hydrantSearch.VerifyAtHydrantID(0);
		geo.hydrantSearch.VerifyAtAddress(0);
		geo.hydrantSearch.ClickAtHydrantID();
		geo.switchToHydrantEntry();
		geo.hydrantEntry.clickRefreshButton();												//updated
		geo.hydrantEntry.VerifyAtHydrantId();
		geo.hydrantEntry.VerifyAtAddress();
		geo.hydrantEntry.VerifyDryHydrantChecked(); // Make changes in a method by Abi
		geo.hydrantEntry.VerifyAtWaterGrid();
		geo.hydrantEntry.VerifyAsModel();
		geo.hydrantEntry.ClickAllTabs();
		geo.switchToHydrantEntry();
		geo.hydrantEntry.saveScreen();
		geo.hydrantEntry.verifyUpdateSuccessfulMessage();									//updated

	}

	//Reworked by:-Abi , Date :-11/26/2021 , Module:-Geo .
	@Test(groups = { "2020DefectAddressFlag" })

	public void Police2017Sprint2GeoModule_150286(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 150286);
		// Playback.testContext=testContext;

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter512AsGoogleMap();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyMapTabColorRed();
		geo.addressSearch.clickMapTab();									//make changes in method
		geo.addressSearch.addressSearchMapTab.switchToGoogleMapTab(); 		//make changes in method
		geo.addressSearch.addressSearchMapTab.ClickResetButton();
		geo.addressSearch.addressSearchMapTab.DragandDropMapLocationIcon();
		geo.addressSearch.addressSearchMapTab.ClickUpdateButton();
		geo.addressSearch.addressSearchMapTab.VerifyUpdateTableConfirmMessage();
		geo.addressSearch.addressSearchMapTab.VerifyUpdateConfirmMessage();
		Playback.threadWait(20000);
		geo.switchToAddressSearchScreen();
		geo.addressSearch.clickMapTab();
		geo.addressSearch.VerifyMapTabColorBlack();								 //Added by Abi
		geo.addressSearch.addressSearchMapTab.switchToGoogleMapTab();
		geo.addressSearch.addressSearchMapTab.VerifyUpdateAcknowledgeMessage();  // issue in DB, run after DB sync
		geo.switchToAddressSearchScreen();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter512AsHEREMap();
	}

	@Test(groups = { "2020DefectStreetSearch" }) // Mithun
	public void Police2020GeoModule_247900(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 247900);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.VerifyStatusMessage();
		geo.streetEntry.closeStreetEntry();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNoinFromAndTo();
		geo.addressIntersection.EnterAtEvenNoinFromAndTo();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.DeleteAtOddRow();
		geo.addressIntersection.VerifyConfirmationDeleteMessage();
		geo.switchToAddressIntersection();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.VerifyRowDeletedInTheGrid(1);
		geo.addressIntersection.CloseScreen();
		geo.switchToStreetSearchScreen();

	}

	@Test(groups = { "2020DefectStreetSearch" }) // Mithun
	public void Police2020GeoModule_247901(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "247901");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.VerifyAtStreetName();
		geo.apartment.ClickAddButton();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterPremise();
		geo.apartmentEntry.VerifyNotValidPremiseMessage();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterAtPremise();
		geo.apartmentEntry.VerifyPermiseUneditable();
		geo.apartmentEntry.EnterApartmentFromAs2();
//		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterApartmentToAsA();
		geo.apartmentEntry.VerifyInvalidInputAcknowlegdeMessage();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.EnterAtApartmentFrom();
		geo.apartmentEntry.EnterAtApartmentTo();
		geo.apartmentEntry.ClickInactiveCheckbox();
		geo.apartmentEntry.VerifyCurrentDateShows();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.VerifyApartmentViewed(1);
		geo.apartmentEntry.verifyInactiveCheckBoxIsSelected(1); // Added by Abi
		geo.apartmentEntry.ClickAtApartmentFrom(); // Added by Abi
		// geo.apartmentEntry.DoubleClickAtApartmentFrom(); // method commented
		geo.apartmentEntry.verifyApartmentFromAndToFieldEnabled();
		geo.apartmentEntry.ClickInactiveCheckbox(); // Added by Abi
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.SaveScreen();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.CloseScreen();
		geo.switchToApartment();
		geo.apartment.VerifyPremiseViewed(0);
		geo.apartment.CloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.EnterAtAddressWithInvalidApartmentFrom();
		geo.switchToApartmentHelpWindow();
		geo.apartmentHelpWindow.VerifyLocation();
		geo.apartmentHelpWindow.clickUseBaseAddressButton();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyAtAddressBubbleDisplayed(); // Added by Abi
		geo.addressSearch.ResetAddress(); // Added by Abi
		geo.addressSearch.EnterAtAddressWithApartmentFrom(); // Added by Abi
		geo.addressSearch.verifyAtAddressBubble(); // Added by Abi
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectStreetEntry" }) // Mithun
	public void Police2020GeoModule_247882(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "247882");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.VerifyStatusMessage();
		geo.switchToStreetEntry();
		geo.streetEntry.EnterAtStreetName1();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.VerifyStatusMessage();
		geo.streetEntry.closeStreetEntry();

		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();

		geo.switchToStreetSearchScreen();
		geo.streetSearch.EnterAtStreetName1();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName1();
		geo.streetSearch.ClickAtStreetName1();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyAtAddressBubble();
		geo.addressSearch.VerifyAtAddress();
	}

/*	@Test (groups = { " 2020DefectAddressFlag" })													// Moved to Fire project
	public void Police2020GeoModule_248201(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 248201);

		Browser.NavigateToLoginScreenForFire(); // Changed by Abi
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("HazMat Flags");
		geo.switchToHazMatFlags();
		geo.hazMatFlags.ClickInactiveCheckBox();
		geo.hazMatFlags.EnterAtSystemIDNo();
		geo.hazMatFlags.ClickSearchButton();
		geo.hazMatFlags.VerifyAtLocation(0);
		geo.hazMatFlags.ClickAtLocation();
		geo.switchToHazMatFlagEntry();
		geo.hazMatFlagEntry.switchToChemicalTab();
		geo.hazMatFlagEntry.chemicalsTab.ClickChemicalID(0);
		geo.hazMatFlagEntry.chemicalsTab.VerifyChemicalName();
		geo.hazMatFlagEntry.chemicalsTab.VerifyAtInactiveDate();
		geo.hazMatFlagEntry.chemicalsTab.ClickAddButton();
		geo.hazMatFlagEntry.chemicalsTab.VerifyAtChemicalID(0);
		geo.hazMatFlagEntry.chemicalsTab.VerifyInactiveCommonNameRowColor(0);

	}*/

/*	@Test (groups = { "FireDefectTestcase" })// Raga Ranjani

	public void FireDefect2020GeoModule_251441(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 251441);
		Browser.NavigateToLoginScreenForFire(); // Changed by Abi
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Hydrant Search");
		geo.switchToHydrantSearch();
		geo.hydrantSearch.clickSearch();
		geo.hydrantSearch.SelectLocationAsAddress();
		geo.hydrantSearch.EnterAtStreet();
		geo.hydrantSearch.clickSearch();
		geo.hydrantSearch.VerifyAtAddress(0);
	}*/

/*	@Test(groups = { "FireDefectTestcase" }) // Raga Ranjani

	public void Fire2020DefectGeoModule_253383(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 253383);
		Browser.NavigateToLoginScreenForFire(); // Changed by Abi
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Hydrant Search");
		geo.switchToHydrantSearch();
		geo.hydrantSearch.verifyShowMapDisplay();
		geo.hydrantSearch.verifyAddNewDisplay();
		geo.hydrantSearch.verifyPrintIconDisplay();
		geo.hydrantSearch.verifyExcelIconDisplay();
		geo.hydrantSearch.clickSearch();
		geo.hydrantSearch.selectRowByAtAddres();
		geo.switchToHydrantEntry();
		geo.hydrantEntry.saveScreen();
	}*/


/*	@Test(groups = { "FireDefectTestcase" }) // july Sprint 1 Automated By mahesha
	public void FireDefect2020VerifytheFunctionalityofAddresssearchScreenFlagTab_249123(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "249123");
		Browser.NavigateToLoginScreenForFire(); // Changed by Abi
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Flags");
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.ClickAddNew();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.EnterAtAddress();
		geo.addressFlagEntry.SelectAtDisplayCondition();
		geo.addressFlagEntry.enterActiveDateAsPreviousDate();
		geo.addressFlagEntry.SelectText();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.EnterRemarks();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.selectIsCriticalCheckBox();
		geo.addressFlagEntry.selectSharedCheckBox();
		geo.addressFlagEntry.ClickSaveAndCloseButton();
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.VerifyAtAddressInTheGrid();
		geo.addressFlag.ClickAtAddress();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.CloseScreen();

		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyFlagTabTextAsBold();
		geo.addressSearch.ClickToFlagTab();
		geo.addressSearch.addressSearchFlagsTab.verifyAtFlagGridActiveAsDate();
		geo.addressSearch.addressSearchFlagsTab.verifyAtFlagGridRemarks();
		geo.addressSearch.addressSearchFlagsTab.verifyAddressFlagGridTextBoldAndBlack();
		geo.addressSearch.addressSearchFlagsTab.selectGridRowByActiveAsDate();

		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.enterInactiveAfterDateAsPreviousDate();
		geo.addressFlagEntry.ClickSaveAndCloseButton();

		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.reloadAddressSearch();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyFlagTabTextAsBold();
		geo.addressSearch.ClickToFlagTab();
		geo.addressSearch.addressSearchFlagsTab.clickShowInactiveCheckBox();
		geo.addressSearch.addressSearchFlagsTab.verifyAtFlagGridInactiveDate();
		geo.addressSearch.addressSearchFlagsTab.verifyAddressFlagGridTextBoldAndGray();

		geo.addressSearch.addressSearchFlagsTab.ClickDeleteGridRow();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.reloadAddressSearch();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyFlagTabTextAsNormal();

	}*/

	@Test(groups = { "2020DefectCommonNames" })

	public void Police2020GeoModule_257114(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257114");
		// Playback.testContext=testContext;
//		String LatituteLongitute = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter512AsESRI();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyConfirmGeoFly();
		geo.switchToGeoOnFly();
		geo.fastGeo.enterAtZipCode();
//		geo.fastGeo.GetLatLongValue(LatituteLongitute);
		geo.fastGeo.clickSaveAndUseAddress();
		// geo.fastGeo.VerifyAddressAcknowledgeMessage();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.VerifyAtAddress();
		geo.addressSearch.clickMapTabForESRIMap();
//		geo.addressSearch.addressSearchMapTab.verifyLatLongValue(Playback.getTestContextAttribute(LatituteLongitute));
		String latAndLong = geo.addressSearch.addressSearchMapTab.getLatAndLong();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickToDetailsTab();
		geo.addressSearch.addressSearchDetailsTab.verifyActiveLatitude(latAndLong);
		geo.addressSearch.addressSearchDetailsTab.verifyActiveLongitude(latAndLong);

	}

	@Test(groups = { "2020DefectStreetEntry" }) // Automated by Stalin
	public void AddressValidation_255126(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255126");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.selectAtJuris();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.verifyAtStreetNameInGrid(0);
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.closeStreetEntry();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.selectAtJuris1();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.verifyAtStreetNameInGrid(0);
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.closeStreetEntry();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.selectJurisAsNull();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetType(0);
		geo.streetSearch.VerifyAtStreetType(1);
		geo.streetSearch.selectAtJuris();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtPremiseEven();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.verifyAtEvenOddInGrid(0);
		geo.addressIntersection.SaveScreen();							// Added by Abi
		geo.addressIntersection.closeAddressIntersectionScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.selectAtJuris1();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtPremiseEven();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickInactiveCheckBox();
		geo.addressIntersection.VerifyInactiveDateDisabled();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.verifyAtEvenOddInGrid(0);
		geo.addressIntersection.SaveScreen();
		geo.addressIntersection.closeAddressIntersectionScreen();
		geo.switchToStreetSearchScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.verifyAtRealAddress(0);
		geo.realAddressHelpWindow.verifyAtRealAddress(1);
		geo.realAddressHelpWindow.selectAtRealAddress(1);
		geo.realAddressHelpWindow.verifyAcknowledgeAtPremiseNoIsInactive();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.selectAtRealAddress(0);
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyFlagsTabIsDisplayed();
		geo.addressSearch.verifyCommonNameTabIsDisplayed();
		geo.addressSearch.verifyAttachmentsTabIsDisplayed();
		geo.addressSearch.verifyContactsTabIsDisplayed();
		geo.addressSearch.verifyDetailsTabIsDisplayed();
		geo.addressSearch.verifyNotificationTabIsDisplayed();
		geo.addressSearch.verifyMapTabIsDisplayed();
		geo.addressSearch.verifyActivitiesTabIsDisplayed();
		geo.addressSearch.ResetAddress();
		geo.addressSearch.enterAtAddress1();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.verifyAtRealAddress(0);
		geo.realAddressHelpWindow.verifyAtRealAddress(1);
		geo.realAddressHelpWindow.close();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ResetAddress();
		geo.addressSearch.enterAtAddress2();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.verifyAtRealAddress1();            // Make changes in the method by Abi
		objectIdentification.windowHandle.switchToMainWindow();

	}

//	@Test(groups = { "2020DefectStreetSearch"}) // Raga Ranjani
//
//	public void Police2020DefectGeoModule_255120(ITestContext testContext) {
//
//		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
//		testContext.setAttribute("testID", "255120");
//
//		Browser.NavigateToLoginScreen();
//		login.loginScreen.Logon();
//		loader.navigateToModule("Geo");
//		loader.navigateToScreen("Street Search");
//		geo.switchToStreetSearchScreen();
//		geo.streetSearch.EnterAtPrefix();
//		geo.streetSearch.enterAtStreetName();
//		geo.streetSearch.EnterAtPopupZipcode();
//		geo.streetSearch.clickSearchButton();
//		geo.streetSearch.VerifyAtStreetName();
//		geo.streetSearch.SelectAtStreetType();
//		geo.streetSearch.SelectAtZipCode();
////		geo.streetSearch.EnterAtPrefix();
//		geo.streetSearch.clickSearchButton();
//		geo.streetSearch.ClickShowAltStreetNameCheckBox();
//		geo.streetSearch.ClickIntersectionCheckBox();
//		geo.streetSearch.ClickInactiveCheckboxCheckBox();
//		geo.streetSearch.clickSearchButton();
//		geo.streetSearch.SelectManageStreet();
//		geo.switchToApartment();
//		geo.switchToStreetSearchScreen();
//		geo.streetSearch.SelectManageIntersection();
//		geo.switchToAddressIntersection();
//		objectIdentification.windowHandle.switchToMainWindow();
//
//	}

	@Test(groups = { "2020DefectStreetSearch" }) // Raga Ranjani
	public void Police2020DefectGeoModule_255120(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255120");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.EnterAtPrefix();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtPrefix(0);
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.EnterAtPopupZipcode();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectAtStreetType();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.ClickShowAltStreetNameCheckBox();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.ClickInactiveCheckboxCheckBox();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.SelectManageStreet();
		geo.switchToApartment();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();

	}

//	@Test(groups = { "2020DefectStreetEntry"})
//
//	public void Police2020DefectGeoModule_255121(ITestContext testContext) {
//		
//		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
//		testContext.setAttribute("testID", "255121");
//
//		Browser.NavigateToLoginScreen();
//		login.loginScreen.Logon();
//		loader.navigateToModule("Geo");
//		loader.navigateToScreen("Street Search");
//		geo.switchToStreetSearchScreen();
//		geo.streetSearch.clickAddNew();
//		geo.switchToStreetEntry();
//		geo.streetEntry.EnterSpecialCharacter();
//		geo.streetEntry.VerifySpecialCharactersNotAllowed();
//		geo.streetEntry.clearStreetName();
//		geo.streetEntry.enterAtStreetName();
//		geo.streetEntry.VerifySpecialCharacterNotAllowedInStreetName();
//		geo.streetEntry.SelectAtPrefix();
//		geo.streetEntry.enterAtStreetType();
//		geo.streetEntry.enterAtZipCode();
//		geo.streetEntry.clickAddButton();
//		geo.streetEntry.DeleteRowFromGrid();
//		popup.confirm.no();
//		geo.switchToStreetEntry();
//		geo.streetEntry.Save();
//		objectIdentification.windowHandle.switchToMainWindow();
//
//	}

	//Reworked by:-Abi , Date :-11/15/2021 , Module:-Geo .
	@Test(groups = { "2020DefectStreetEntry" })
	public void Police2020DefectGeoModule_255121(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255121");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.EnterSpecialCharacter();
		geo.streetEntry.VerifySpecialCharactersNotAllowed();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.EnterSpecialCharacter();
		geo.streetEntry.VerifySpecialCharacterNotAllowedInStreetName();
		geo.streetEntry.SelectAtPrefix();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.DeleteRowFromGrid();
		//popup.confirm.no();
		popup.confirm.acceptPopup();         // Line included by Abi
		geo.switchToStreetEntry();
		geo.streetEntry.Save();
	}

//	@Test(groups = { "2020DefectStreetSearch"}) // Raga Ranjani
//
//	public void Police2020DefectGeoModule_255122(ITestContext testContext) {
//		
//		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
//		testContext.setAttribute("testID", "255122");
//
//		Browser.NavigateToLoginScreen();
//		login.loginScreen.Logon();
//		loader.navigateToModule("Geo");
//		loader.navigateToScreen("Street Search");
//		geo.switchToStreetSearchScreen();
//		geo.streetSearch.enterAtStreetName();
//		geo.streetSearch.clickSearchButton();
//		geo.streetSearch.SelectManageIntersection();
//		geo.switchToAddressIntersection();
//		geo.addressIntersection.EnterOddNumber();
//		geo.addressIntersection.EnterEvenNumber();
//		geo.addressIntersection.selectAsBoth();
//		geo.addressIntersection.SelectPatrolZone();
//		geo.addressIntersection.SelectNPACard();
//		geo.addressIntersection.SelectSubZone();
//		geo.addressIntersection.EnterGeoCordsX();
//		geo.addressIntersection.EnterGeoCordsY();
//		geo.addressIntersection.SelectVotingDistrict();
//		geo.addressIntersection.clickAddButton();
//		geo.addressIntersection.ClickDeleteRow(0, 0, 1);
//		geo.addressIntersection.VerifyConfirmationDeleteMessage();
//		objectIdentification.windowHandle.switchToMainWindow();
//
//	}

	// Reworked by:- Abinaya , Date :- 10/22/2021 , Module:- Geo.

	@Test(groups = { "2020DefectStreetSearch" }) // Raga Ranjani
	public void Police2020DefectGeoModule_255122(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255122");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNumberWithLetters(); // Added by Abi
		geo.addressIntersection.verifyPremiseEvenInactive(); //
		geo.addressIntersection.verifyOddEvenPremiseComboBoxAsBoth();
		geo.addressIntersection.clickRefreshButton(); // Added by Abi
		geo.addressIntersection.EnterAtOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.verifyAtEvenOddInGrid(1);
		geo.addressIntersection.clickRefreshButton();
		geo.addressIntersection.enterAtEvenOddNumber(); // Added by Abi
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAcknowledgeOddNumber(); //
		geo.switchToAddressIntersection();
		geo.addressIntersection.closeAddressIntersectionScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickManageIntersectionUsingStreetName();
		geo.switchToAddressIntersection();
//		geo.addressIntersection.bindValuesinZipCodeEdit();
//		geo.addressIntersection.verifyZipCodeBasedOnJuris();
		geo.addressIntersection.enterAtZipCode();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.clickAddNewButton();
		popup.kPICodedLookup.switchToZipCodeEntry();
		geo.zipCodeEntry.enterAtZipCodeEdit();
		geo.zipCodeEntry.selectAtStateComboBox();
		geo.zipCodeEntry.enterAtCityEdit();
		geo.zipCodeEntry.clickSaveButton();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickZipCodeLookupButton();
		geo.switchToAddressIntersection();
		geo.addressIntersection.closeAddressIntersectionScreen();
		geo.switchToStreetSearchScreen(); // Added by Abi
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterOddNumber();
		geo.addressIntersection.EnterEvenNumber();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.SelectPatrolZone();
		geo.addressIntersection.enterAtNPACard();
		geo.addressIntersection.SelectSubZone();
		geo.addressIntersection.EnterGeoCordsX();
		geo.addressIntersection.EnterGeoCordsY();
		geo.addressIntersection.SelectVotingDistrict();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.ClickDeleteRow(1, 1);
		geo.addressIntersection.VerifyConfirmationDeleteMessage();
		geo.switchToAddressIntersection();
	}

	@Test(groups = { "2020DefectAddressFlag" }) // Automated by Stalin
	public void GeoBatchUpdatePolice_255723(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255723");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Batch Update(P)");
		geo.switchToBatchUpdate();
		geo.batchUpdate.EnterAtStreetName();
		geo.batchUpdate.EnterAtZipCode();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.VerifyAtStreetName(0);
		geo.batchUpdate.clickAtStreetNameInGrid();
		geo.switchToAddressIntersection();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.EnterAtEvenNumber();
		geo.addressIntersection.selectPatrolZoneAsPatrolZone();
		geo.addressIntersection.selectSubZoneAsSubZone();
		geo.addressIntersection.enterAtNPACard();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();
		geo.switchToBatchUpdate();
		geo.batchUpdate.VerifyAtPatrolZone1(0);
		geo.batchUpdate.VerifyAtSubZone(0);
		geo.batchUpdate.VerifyAtNPACard(0);
		geo.batchUpdate.ClickIntersectionCheckBox();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.ClickSelectAllCheckBox();
		geo.batchUpdate.ClickUpdateButton();
		geo.batchUpdate.batchUpdatePopup.SelectAtPremiseType();    // Changed by Abi
		geo.batchUpdate.batchUpdatePopup.EnterAtZipCode();
		geo.batchUpdate.batchUpdatePopup.EnterAtPatrolZone();
		geo.batchUpdate.batchUpdatePopup.EnterAtSubZone();
		geo.batchUpdate.batchUpdatePopup.EnterAtNPACard();
		geo.batchUpdate.batchUpdatePopup.EnterAtTrack();
		geo.batchUpdate.batchUpdatePopup.ClickAddCheckbox();		// Changed by Abi
		geo.batchUpdate.batchUpdatePopup.updateScreenInBatchUpdate();
		geo.switchToBatchUpdate();
		geo.batchUpdate.VerifyAtPatrolZone(0);
		geo.batchUpdate.VerifyAtSubZone(0);
		geo.batchUpdate.VerifyAtNPACard(0);
		objectIdentification.windowHandle.switchToMainWindow();

	}

//	@Test(groups = { "2020DefectCommonNames"}) // Raga Ranjani									// moved to fire project
//
//	public void Fire2020DefectGeoModule_257970(ITestContext testContext) {
//		
//		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
//		testContext.setAttribute("testID", 257970);
//		Browser.NavigateToLoginScreen();
//		login.loginScreen.Logon();
//		loader.navigateToModule("Geo");
//		loader.navigateToScreen("HazMat Flags");
//		geo.switchToHazMatFlags();
//		geo.hazMatFlags.ClickAddNewButton();
//		geo.switchToHazMatFlagEntry();
//		geo.hazMatFlagEntry.EnterAtLocation();
//		geo.hazMatFlagEntry.switchToChemicalTab();
//		geo.hazMatFlagEntry.chemicalsTab.EnterAtChemicalName();
//		geo.hazMatFlagEntry.chemicalsTab.SelectAtGeneralLocation();
//		geo.hazMatFlagEntry.chemicalsTab.enterAtContainerType();
//		geo.hazMatFlagEntry.chemicalsTab.ClickAddButton();
//		geo.hazMatFlagEntry.Save();
//		loader.navigateToScreen("Update GeoCode");
//		geo.switchToUpdateGeoCode();
//		geo.updateGeoCode.enterAtAddress();
//		geo.updateGeoCode.verifyAtAddress(0);
//	}

/*	@Test(groups = { "2020DefectCommonNames" }) // Raga Ranjani

	public void Fire2020DefectGeoModule_257970(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 257970);

		Browser.NavigateToLoginScreenForFire();
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("HazMat Flags");
		geo.switchToHazMatFlags();
		geo.hazMatFlags.ClickAddNewButton();
		geo.switchToHazMatFlagEntry();
		geo.hazMatFlagEntry.EnterAtLocation();
		geo.hazMatFlagEntry.switchToChemicalTab();
		geo.hazMatFlagEntry.chemicalsTab.EnterAtChemicalName();
		geo.hazMatFlagEntry.chemicalsTab.SelectAtGeneralLocation();
		geo.hazMatFlagEntry.chemicalsTab.enterAtContainerType();
		geo.hazMatFlagEntry.chemicalsTab.ClickAddButton();
		geo.hazMatFlagEntry.Save();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.switchToHazMatTab(); // added by Abi
		geo.addressSearch.addressSearchHazMatTab.verifyAtAddress(); // added by Abi
//		loader.navigateToScreen("Update GeoCode");
//		geo.switchToUpdateGeoCode();
//		geo.updateGeoCode.enterAtAddress();
//		geo.updateGeoCode.verifyAtAddress(0);	
	}*/

	@Test(groups = { "2020DefectStreetSearch" }) // Sep Sprint 6 Automated By mahesha
	public void ApartmentAddressIntersectionScreenFunctionality_255123(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255123");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.ClickAddButton();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterPremise();
		geo.apartmentEntry.verifyAt5001NotAValidPremiseStatusMsg();
		geo.apartmentEntry.EnterAtPremise();
		geo.apartmentEntry.VerifyPermiseUneditable();
		geo.apartmentEntry.EnterAtApartmentFrom();
		geo.apartmentEntry.EnterAtApartmentTo();
		geo.apartmentEntry.ClickInactiveCheckbox();
		geo.apartmentEntry.VerifyCurrentDateShows();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.SaveScreen();
		geo.switchToApartmentEntry();
//		geo.apartmentEntry.VerifyApartmentViewed(0);
		geo.apartmentEntry.CloseScreen();
		geo.switchToApartment();
		geo.apartment.CloseScreen();

		// 2nd
//		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtInterStreet();
		geo.addressIntersection.clearZipCode();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();
//		geo.switchToStreetSearchScreen();
//		geo.streetSearch.SelectManageIntersection();
//		geo.addressIntersection.VerifyAtInterStreetViewed(0);
//		geo.addressIntersection.CloseScreen();

		// 3rd
//		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.SelectManageStreet();
		geo.switchToStreetUpdate();
		geo.streetUpdate.EnterAtAltStreet();
		geo.streetUpdate.EnterAtAltStreetType();
		geo.streetUpdate.ClickMainStreetInactive();
		geo.streetUpdate.ClickReplaceCheckBox();
		geo.streetUpdate.verifyPremiseFieldsAreUnEditable();
		geo.streetUpdate.ClickAddButton();
		geo.streetUpdate.SaveScreen();
		geo.switchToStreetUpdate();
		geo.streetUpdate.CloseStreetUpdateScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.SelectManageStreet();
		geo.switchToStreetUpdate();
		geo.streetUpdate.VerifyAlterStreetNameAddedInTheGird(0);
		geo.streetUpdate.CloseStreetUpdateScreen();

//		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.verifyNoRecordsFoundAck();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectCommonNames" }) // Sep Sprint 6 Automated By mahesha
	public void AddressSearchContactTabFunctionality_255124(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "255124");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.switchToContactsTab();
		geo.addressSearch.addressSearchContactTab.selectAtPhoneType1();
		geo.addressSearch.addressSearchContactTab.EnterPhoneNo1AtPhone();
		geo.addressSearch.addressSearchContactTab.SaveInternalTab();
		loader.navigateToScreen("Contact Search");
		geo.switchToContactSearch();
		geo.contactSearch.enterAtAddress();
		geo.contactSearch.ClickSearchButton();
		geo.switchToContactSearch(); // added
		geo.contactSearch.verifyAtPhoneNoAsActive();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.switchToContactsTab();
		geo.addressSearch.addressSearchContactTab.clickInactivePhone1();
		geo.addressSearch.addressSearchContactTab.SaveInternalTab();
		loader.navigateToScreen("Contact Search");
		geo.contactSearch.reloadContactSearch();
		loader.navigateToScreen("Contact Search");
		geo.switchToContactSearch();
		geo.contactSearch.enterAtAddress();
		geo.switchToContactSearch();
		geo.contactSearch.ClickSearchButton();
		loader.navigateToScreen("Contact Search");
		geo.switchToContactSearch();
		geo.contactSearch.verifyAtPhoneNoAsInactive();

	}

	@Test(groups = { "2020DefectCommonNames" }) // Sep Sprint 6 Automated By mahesha
	public void ContactEntryFunctionality_255125(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "255125");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Contact Search");
		geo.switchToContactSearch();
		geo.contactSearch.ClickAddNew();
		geo.switchToGeoContactNewEntry();
		geo.geoContactNewEntry.VerifySearchAddNewDisabled();
		geo.geoContactNewEntry.EnterAtAddress();
		geo.geoContactNewEntry.ClickAddNewButton();
		geo.switchToContactEntry();
		geo.contactEntryScreen.SelectAtNameRelation();
		geo.contactEntryScreen.SelectAtNameRelation1();
		geo.contactEntryScreen.verifyNameRelationHavingMultipleValues();
		geo.contactEntryScreen.verifyNameTypeCheckboxDefaultSelectedForPerson();
		geo.contactEntryScreen.ClickBusinessRadioButton();
		geo.contactEntryScreen.verifyLastNameAsEditable();
		geo.contactEntryScreen.verifyFirstNameAsUnEditable();
		geo.contactEntryScreen.EnterAtLastName1(); // updated
		names.switchToNameSearchHelpWindow(); // added
		names.nameSearchHelpWindow.CloseScreen(); // added
		geo.switchToContactEntry();
		geo.contactEntryScreen.EnterAtAddress();
		geo.contactEntryScreen.SelectAtPhoneType1();
		geo.contactEntryScreen.EnterAtPhoneNumber1();
		geo.contactEntryScreen.SaveCloseScreen();
		geo.switchToGeoContactNewEntry();
		geo.geoContactNewEntry.ClickRefreshButton();
		geo.geoContactNewEntry.VerifyAtLastName1(0);
		geo.geoContactNewEntry.ClickAddNewButton();
		geo.switchToContactEntry();
		geo.contactEntryScreen.SelectAtNameRelation();
		geo.contactEntryScreen.SelectAtNameRelation1();
		geo.contactEntryScreen.verifyNameRelationHavingMultipleValues();
		geo.contactEntryScreen.verifyNameTypeCheckboxDefaultSelectedForPerson();
		geo.contactEntryScreen.enterAtLastName();
		geo.contactEntryScreen.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.SelectAtNameRow();
		names.nameSearchHelpWindow.verifyDoYouWantToCopyNameFromOtherJurisPopup();
		geo.switchToContactEntry();
		geo.contactEntryScreen.clearAddress();
		geo.contactEntryScreen.EnterAtAddress();
		geo.switchToContactEntry();
		geo.contactEntryScreen.SelectAtPhoneType2();
		geo.contactEntryScreen.EnterAtPhoneNumber2();
		geo.contactEntryScreen.SaveCloseScreen();
		geo.switchToGeoContactNewEntry();
		geo.geoContactNewEntry.ClickRefreshButton();
		geo.geoContactNewEntry.VerifyAtLastName1(0);
		geo.geoContactNewEntry.VerifyAtName(1);
		geo.geoContactNewEntry.closeWindow();
		loader.navigateToScreen("Contact Search");
		geo.switchToContactSearch();
		geo.contactSearch.enterAtAddress();
		geo.contactSearch.ClickSearchButton();
		loader.navigateToScreen("Contact Search");
		geo.switchToContactSearch();
		geo.contactSearch.verifyGridRowLastName1(0);
		geo.contactSearch.verifyGridRowLastName(1);

	}

/*	@Test(groups = { "FireDefectTestcase" }) 
	public void FireDefect2020AddressSearchContactsTab_244249(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "244249");
		Browser.NavigateToLoginScreenForFire(); // Changed by Abi
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();

		geo.addressSearch.enterAtAddress();
		geo.addressSearch.switchToContactsTab();

		geo.addressSearch.addressSearchContactTab.selectAtPhoneType1();
		geo.addressSearch.addressSearchContactTab.EnterPhoneNo1AtPhone();
		geo.addressSearch.addressSearchContactTab.SaveInternalTab();
		geo.addressSearch.reloadAddressSearch();

		loader.navigateToScreen("Contact Search");
		geo.switchToContactSearch();
		geo.contactSearch.enterAtAddress();
		geo.contactSearch.ClickSearchButton();
		geo.switchToGeoContactNewEntry();
		geo.geoContactNewEntry.verifyAtPhoneNumber1();

		geo.geoContactNewEntry.closeWindow();

		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.switchToContactsTab();
		geo.addressSearch.addressSearchContactTab.clickInactivePhone1();
		geo.addressSearch.addressSearchContactTab.SaveInternalTab();

		loader.navigateToScreen("Contact Search");
		geo.contactSearch.reloadContactSearch();
		geo.switchToContactSearch();
		geo.contactSearch.enterAtAddress();
		geo.contactSearch.ClickSearchButton();

		geo.switchToGeoContactNewEntry();
		geo.geoContactNewEntry.ClickAddNewButton();
		geo.switchToContactEntry();
		geo.contactEntryScreen.SelectAtNameRelation();
		geo.contactEntryScreen.enterAtLastName();
		geo.contactEntryScreen.enterAtFirstName();
		geo.contactEntryScreen.SelectAtPhoneType1();
		geo.contactEntryScreen.EnterAtPhoneNumber1();
		geo.contactEntryScreen.ClickSaveButton();
		geo.switchToContactEntry();

	}*/

/*	@Test (groups = { "FireDefectTestcase" }) // Raga Ranjani

	public void Fire2020DefectGeoModule_259474(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", 259474);
		Browser.NavigateToLoginScreenForFire(); // Changed by Abi
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("HazMat Flags");
		geo.switchToHazMatFlags();
		geo.hazMatFlags.ClickAddNewButton();
		geo.switchToHazMatFlagEntry();
		geo.hazMatFlagEntry.clickSaveButton();
		geo.hazMatFlagEntry.verify1018RequiredEntriesAreMissing();
		geo.switchToHazMatFlagEntry();
		geo.hazMatFlagEntry.EnterAtLocation();
		geo.hazMatFlagEntry.switchToChemicalTab();
		geo.hazMatFlagEntry.chemicalsTab.EnterAtChemicalName();
		geo.hazMatFlagEntry.chemicalsTab.ClickAddButton();
		geo.hazMatFlagEntry.Save();

	}*/

	@Test(groups = { "2020DefectCommonNames" }) // Oct Sprint 2 Automated By mahesha
	public void AddressValidation_256804(ITestContext testContext) {
		// address help window
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256804");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToCommonNameHelp();
		geo.commonNameHelp.verifyAlphaRadioButtonSelected();
		geo.commonNameHelp.verifyGridListOutResults();
		geo.commonNameHelp.clickAtContainsRadioButton();
		geo.commonNameHelp.verifyGridListOutResults();
		geo.commonNameHelp.clickAtSoundEXRadiobutton();
		geo.commonNameHelp.VerifyAcknowledgeNoRecordFound();
		geo.switchToCommonNameHelp();
		geo.commonNameHelp.clickAtContainsRadioButton();
		geo.commonNameHelp.verifyGridListOutResults();
		geo.commonNameHelp.CloseCommonHelpWindow();

		// valid address
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress1();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress2();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress3();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		// intersection
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtIntersectionAddress();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		// intersection street alone

		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtIntStreet();
		geo.addressSearch.VerifyAtAddressBubbleNotDisplayed();

		// inactive intersection and search
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.EnterAtInterStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.selectgridCheckBoxByInterSteetName();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickAtInterStreetNameInGrid();
		geo.addressIntersection.clickInactiveCheckBox();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();

		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtIntersectionStreet();
		geo.addressSearch.VerifyAcknowledgeInactiveIntersection();

		// common name
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.EnterAtCommonName();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		// phone no
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.EnterAtPhoneNumber();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		// Verify apartment needed
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsVerifyApartment();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress4();
		geo.switchToApartmentHelpWindow();
		geo.apartmentHelpWindow.closeWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.VerifyAtAddressBubbleNotDisplayed();

		// Verify apartment not needed
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsNoVerification();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress5();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		// Verify apartment needed
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsValidApartment();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress6();
		geo.switchToApartmentHelpWindow();
		geo.apartmentHelpWindow.closeWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.VerifyAtAddressBubbleNotDisplayed();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsVerifyApartment();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress1();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

		// address button
		geo.addressSearch.ClickAddressButton();
		geo.switchToAddressIntersection2040();
		geo.addressIntersection2040.CloseScreen();

		// print button
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.clickPrintButton();
		home.switchToSelectReport();
		home.selectReport.clickAddressDetailReportInGrid();

		// Weather button
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickWeatherButton();
		geo.switchToWeatherScreen();
		geo.weatherScreen.verifyTemperature();
		geo.weatherScreen.CloseScreen();

		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.EnterAtAlarmNo();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();

	}

	@Test(groups = { "2020DefectStreetEntry" }) // Oct Sprint 2 Automated By mahesha
	public void VerifyRelatedAddressNamesMustPresentGeoAndNameScreen_257125(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257125");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.selectJurisAsBC();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		Playback.driver.close();
//		geo.switchToStreetEntry();
//		geo.streetEntry.VerifyAdditionSuccessfulStatusMessage(); //updated
//		geo.streetEntry.closeStreetEntry();

		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.selectAtJuris();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();

		geo.addressIntersection.enterAtFromAndToOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		Playback.driver.close();
//		geo.switchToAddressIntersection();
//		geo.addressIntersection.verifyAdditionSuccessfulStatusMessage();
//		geo.addressIntersection.CloseScreen();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.enterAtMiddleName();
		names.nameEntry.enterAtAddressStreetNameWithPremiseNo();
		names.nameEntry.VerifyAddressIconDisplayed();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.nameEntry.nameEntryMainTab.verifyAsAdultAge();
		names.switchToNameEntry();
		names.nameEntry.verifyNameTypeAutoBindedAsA();
		names.nameEntry.SaveNCloseScreen();

		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAddressAsAddress();
		names.nameSearch.EnterAtPremiseNo();
		names.nameSearch.EnterAtStreet();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtName(0);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	//Reworked by:-Abi , Date :-11/15/2021 , Module:- Geo .
	@Test(groups = { "2020DefectStreetEntry" }) // Oct Sprint 2 Automated By mahesha
	public void AddedNotesColumnInContactTab_257127(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257127");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.saveNClose();

		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtEvenNumber();
		geo.addressIntersection.enterAtEvenTo();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();

		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.switchToContactsTab();
		geo.addressSearch.addressSearchContactTab.ClickAddNewButton();
		geo.switchToContactEntry();
		geo.contactEntryScreen.SelectAtNameRelation();
		geo.contactEntryScreen.verifyNameTypeCheckboxDefaultSelectedForPerson();
		geo.contactEntryScreen.enterAtLastName();
		geo.contactEntryScreen.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();          //Changes in a method by Abi
		geo.switchToContactEntry();
		geo.contactEntryScreen.SelectPhoneType1AsHome();
		geo.contactEntryScreen.EnterAtPhoneNumber1();
		geo.contactEntryScreen.enterAtNotes();
		geo.contactEntryScreen.SaveCloseScreen();

		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.switchToContactsTab();
		geo.addressSearch.addressSearchContactTab.ClickReset();
		geo.addressSearch.addressSearchContactTab.VerifyAtNameInTheGrid(0);
		geo.addressSearch.addressSearchContactTab.VerifyAtNotesInTheGrid(0);
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectStreetEntry" }) // Oct Sprint 2 Automated By mahesha
	public void AbleToValidateTheRealAddressAndCommonNameUsingDot_257128(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257128");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.SelectAtPrefix();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.VerifyAdditionSuccessfulStatusMessage();
		geo.streetEntry.closeStreetEntry();

		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtEvenNumber();
		geo.addressIntersection.enterAtEvenTo();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.verifyAdditionSuccessfulStatusMessage();
		geo.addressIntersection.CloseScreen();

		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickAddNew();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtStreetDetails();
		geo.commonNamesEntry.EnterAtCommonName();
		geo.commonNamesEntry.EnterAtSortOrder();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.SaveAndClose();

		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyAtCommonName();
		geo.addressSearch.SwitchToCommonNameTab();
		geo.addressSearch.addressSearchCommonNameTab.VerifyAtCommonName(0);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectCommonNames" }) // Automated by Stalin
	public void GeoonFly_257122(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257122");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToCommonNameHelp();
		geo.commonNameHelp.clickAddCommonNameToGeo();
		geo.switchToStreetEntry();
		geo.fastGeo.enterAtPremiseNo();
		geo.fastGeo.enterAtStreetName();
		geo.fastGeo.enterAtZipCode();
		geo.fastGeo.clickSaveAndUseAddress();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectCommonNames" }) // Automated by stalin
	public void CommonNameAndOthers_257123(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257123");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyConfirmGeoFly();
		geo.switchToGeoOnFly();
		geo.fastGeo.enterAtZipCode();
		geo.fastGeo.enterAtCommonName();
		geo.fastGeo.clickTrackingLooUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.randomKPIHelpSelect();
		geo.switchToGeoOnFly();
		geo.fastGeo.selectAtPremiseType();
		geo.fastGeo.clickPatrolZoneLooUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.randomKPIHelpSelect();
		geo.switchToGeoOnFly();
		geo.fastGeo.clickNPACardLooUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.randomKPIHelpSelect();
		geo.switchToGeoOnFly();
		geo.fastGeo.clickCivilDistrictLooUpIcon();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.randomKPIHelpSelect();
		geo.switchToGeoOnFly();
		geo.fastGeo.selectAtVotingDistrict();
		geo.fastGeo.clickSaveAndUseAddress();
		geo.fastGeo.VerifyAddressConfirmMessage();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectCommonNames" }) // Automated by Stalin
	public void Baseaddressadnpartment_257949(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257949");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter512AsESRI();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyAtAddressBubble();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress1();
		geo.switchToApartmentSearchHelpWindow();
		geo.apartmentHelpWindow.clickUseBaseAddressButton();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyAtAddressBubble();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress1();
		geo.switchToApartmentSearchHelpWindow();
		geo.apartmentHelpWindow.enterAtApartment();
		geo.apartmentHelpWindow.clickUseThisAptNo();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyAtAddressBubble();
		geo.addressSearch.clickMapTabForESRIMap();
		geo.addressSearch.addressSearchMapTab.veriyAtLatitudeAndLongitude();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter512AsHEREMap();
		settings.switchToSystemParamter();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectStreetSearch" }) // Automated by Stalin
	public void AbletoAdddeletePremise_257948(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257948");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType(); // updated
		popup.switchToCodedSearch();
		popup.kPICodedLookup.clickAtDescription();
		geo.switchToStreetEntry();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.verifyAtStreetNameInGrid(0);
		geo.streetEntry.Save();
		geo.switchToStreetEntry();
		geo.streetEntry.closeStreetEntry();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtPremiseOddFromAndTo();
		geo.addressIntersection.enterAtPremiseEvenFromAndTo();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.verifyAtZipCodeGrid(0);
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.deleteRowByUsingEvenOddInGrid();
		geo.switchToAddressIntersection();
		geo.addressIntersection.saveNCloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectStreetEntry" }) // Automated by Stalin
	public void creatingAddressInStreetSearch_257950(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257950");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.clickAtDescription();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.verifyAtStreetNameInGrid(0);
		geo.streetEntry.Save();
		geo.streetEntry.closeStreetEntry();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
//		geo.streetSearch.selectRowByAtCSZ(); 
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtPremiseOddFromAndTo();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.verifyAtZipCodeGrid(0);
		geo.addressIntersection.enterAtPremiseEvenFromAndTo();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.verifyAtZipCodeGrid(1);
		geo.addressIntersection.deleteRowByUsingEvenOddInGrid();
		geo.switchToAddressIntersection();
		geo.addressIntersection.saveNCloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtInterStreet();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

//	@Test(groups = { "2020DefectCommonNames"}) // Automated by Stalin
//	public void AVLReplayAllowmultipleunitsplayback(ITestContext testContext) {
//
//		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
//		testContext.setAttribute("testID", "258294");
//		Browser.NavigateToLoginScreen();
//		login.loginScreen.Logon();
//		loader.navigateToModule("Setting");
//		loader.navigateToScreen("System Parameter");
//		settings.switchToSystemParamter();
//		settings.sysParameter.setSystemparameter558As8();
//		settings.switchToSystemParamter();
//		settings.sysParameter.setSystemparameter512AsESRI();
//		settings.switchToSystemParamter();
//		loader.navigateToModule("Geo");
//		loader.navigateToScreen("AVL Replay");
//		geo.switchToAVLReplay();
//		geo.aVLReplay.enterAtFromDateAndTime();
//		geo.aVLReplay.enterAtToDateAndTime();
//		geo.aVLReplay.clickShowUnits();
//		geo.aVLReplay.verifyNoRecordsFoundSelectedTimeDuationAckwMsg();
//		geo.switchToAVLReplay();
//		geo.aVLReplay.clickPolygonButtonInDrawAreas();
//		geo.aVLReplay.dragAndPointInMapPanel();
//		geo.aVLReplay.verifyNoRecordsFoundSelectedTimeDuationAckwMsg();
//		geo.switchToAVLReplay();
//		geo.aVLReplay.enterAtFromDateAndTimeII();
//		geo.aVLReplay.enterAtToDateAndTimeII();
//		geo.aVLReplay.clickShowUnits();
//		geo.aVLReplay.verifyFromdatelessthanTodateAckwMsg();
//		geo.switchToAVLReplay();
//
//	}

 //Reworked by:- Abi , Date :- 11/02/2021, Module:- Geo .  												 // only run in 14.82
	@Test(groups = { "2020DefectCommonNames" }) // Automated by Stalin
	public void AVLReplayAllowmultipleunitsplayback(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258294");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter558As8();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter512AsESRI();
		Playback.driver.navigate().refresh();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("AVL Replay");
		geo.switchToAVLReplay();
		geo.aVLReplay.enterAtFromDateAndTime();
		geo.aVLReplay.enterAtToDateAndTime();
		geo.aVLReplay.clickShowUnits();
		geo.aVLReplay.verifyNoRecordsFoundSelectedTimeDuationAckwMsg();
		geo.switchToAVLReplay();
		geo.aVLReplay.clickPolygonButtonInDrawAreas();
		geo.aVLReplay.dragAndPointInMapPanel();
		geo.aVLReplay.verifyNoRecordsFoundSelectedTimeDuationAckwMsg();
		geo.switchToAVLReplay();
		geo.aVLReplay.clickResetButton(); //updated 
		geo.aVLReplay.enterAtFromDateAndTimeII();
		geo.aVLReplay.enterAtToDateAndTimeII();
//		geo.aVLReplay.verifyShowUnitsOnMapIsDisabled();           											 to be added for 14.87             
		geo.aVLReplay.clickShowUnits();
		geo.aVLReplay.verifyFromdatelessthanTodateAckwMsg();
		geo.switchToAVLReplay();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter512AsHEREMap();
	}
	

	@Test(groups = { "2020DefectCommonNames" }) // Vijay
	public void AbleToCreateGeoOnFlyCommonNameAndOthers_256806(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "256806");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyConfirmGeoFly();
		geo.switchToStreetEntry();
		geo.fastGeo.enterAtZipCode();
		geo.fastGeo.enterAtCommonName();
		geo.fastGeo.enterTrackingAsTB();
		geo.fastGeo.selectPremiseType();
		geo.fastGeo.enterPatrolZoneAsPA();
		geo.fastGeo.enterSubZoneAsSA();
		geo.fastGeo.enterAtNPACard();
		geo.fastGeo.enterAtCivilDistrict();
		geo.fastGeo.selectVotingDistrictAsVD();
		geo.fastGeo.clickSaveAndUseAddress();
		objectIdentification.windowHandle.switchToMainWindow();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.VerifyAtAddress();
	}
	
	
//Reworked by:-Abi  , Date :- 29/10/2021  , Module:- Geo.
	@Test(groups = { "2020DefectStreetSearch" }) // Vijay
	public void LatLongUsingStreetEntry_257115(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "257115");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNoinFromAndTo();
		geo.addressIntersection.EnterAtEvenNoinFromAndTo();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();								// Added by Abi
		geo.addressIntersection.verifyAdditionSuccessfulStatusMessage();	// Added by Abi
		geo.addressIntersection.saveNCloseScreen();	
		
//		if (Thread.currentThread().getStackTrace()[1].getMethodName().contains("257115")
//				&& (PropertiesFile.readPropertiesFile("url").contains("14.87"))) {
//			geo.addressIntersection.closeAddressIntersectionScreen(); // Add this line due to blue screen issue in 14.87 
//		}

		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.DoubleClickOnTheRowAtPremiseOdd();
		geo.switchToAddressIntersection2040();
		geo.addressIntersection2040.switchToMainTab();
		geo.addressIntersection2040.addressIntersectionMainTab.clickMapButton();
		home.switchToGlobalMapScreen();
		home.globalMapScreen.Close();
		geo.switchToAddressIntersection2040();
		geo.addressIntersection2040.switchToMainTab();
		geo.addressIntersection2040.addressIntersectionMainTab.clickGetButton();
		geo.switchToAddressIntersection2040UpdateLatLongWindow();
		geo.addressIntersection2040UpdateLatLongWindow.clickMapButton();
		home.switchToGlobalMapScreen();
		home.globalMapScreen.Close();
		geo.switchToAddressIntersection2040UpdateLatLongWindow();
		geo.addressIntersection2040UpdateLatLongWindow.clickGetButton();
		geo.addressIntersection2040UpdateLatLongWindow.clickAddCalculateButton();
		geo.addressIntersection2040UpdateLatLongWindow.clickGetButton();
		geo.addressIntersection2040UpdateLatLongWindow.clickMapButton();
		home.switchToGlobalMapScreen();
		home.globalMapScreen.Close();
		geo.switchToAddressIntersection2040UpdateLatLongWindow();
		objectIdentification.windowHandle.switchToMainWindow();
	}

/*	@Test(groups = { "2020DefectAddressFlag" }) // Vijay // Fire Testcase							// moved to fire project
	public void verifyBatchUpdateFireSearchFunctionality_257117(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "257117");
		Browser.NavigateToLoginScreenForFire(); // Changed by Abi
		login.loginScreen.LogonForFire();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Batch Update");
		geo.switchToBatchUpdate();
		geo.batchUpdate.EnterAtStreetName();
		geo.batchUpdate.EnterAtZipCode();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.VerifyAtStreetName(0);
		geo.batchUpdate.clickBlankRACheckbox();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.VerifyAtStreetName(0);
		geo.batchUpdate.ClickIntersectionCheckBox();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.VerifyAtStreetName(0);
		geo.batchUpdate.ClickSelectAllCheckBox();
		geo.batchUpdate.verifyAllRecordsSelected();
		geo.batchUpdate.ClickSelectAllCheckBox();
		geo.batchUpdate.clickRefreshButton();
		geo.batchUpdate.clickBlankRACheckbox();
		geo.batchUpdate.ClickIntersectionCheckBox();
		geo.batchUpdate.EnterAtStreetName();
		geo.batchUpdate.EnterAtZipCode();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.ClickAtStreetName1InGrid();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickAtPremiseOddRowInGrid();
		geo.addressIntersection.SelectDistrictDropdownAsD1();
		geo.addressIntersection.SelectSubDistrictDropdownAsS1();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();
		geo.switchToBatchUpdate();
		geo.batchUpdate.clickRefreshButton();
		geo.batchUpdate.EnterAtStreetName();
		geo.batchUpdate.EnterAtZipCode();
		geo.batchUpdate.ClickSearchButton();
		geo.batchUpdate.SelectCheckboxsByStreetNameInGrid();
		geo.batchUpdate.ClickUpdateButton();
		geo.batchUpdate.batchUpdatePopup.enterAtDistrictField();
		geo.batchUpdate.batchUpdatePopup.enterAtSubDistrictField();
		geo.batchUpdate.batchUpdatePopup.ClickUpdateButtonInPopup();
		geo.batchUpdate.VerifyUpdateSuccessfulAcknowledgeMessage();

	}*/

	@Test(groups = { "2020DefectStreetSearch" }) // Mithun
	public void CreateNewStreet_247877(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "247877");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.ClickAtPremiseOddRowInGrid();
		geo.addressIntersection.clickInactiveCheckBox();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyAcknowledgePremiseInactiveAddress();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtAddress();
		names.nameSearch.clickAddressIBubbleIcon();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearch.verifyAddressButtonInActive();
		geo.addressSearchHelp.switchToFlagsTab();
		geo.addressSearch.addressSearchFlagsTab.verifyAddFlagInactive();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.switchToCommonNameTab();
		geo.addressSearch.addressSearchCommonNameTab.verifyAddCommonNameDisabled();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.switchToContactsTab();
		geo.addressSearch.addressSearchContactTab.verifyAddNewButtonDisabled();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.CloseAddressSearchScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.VerifyAcknowledgePremiseInactiveAddress();
		names.switchToNameEntry();
		names.nameEntry.EnterAtAddress1();
		names.nameEntry.VerifyAcknowledgePremiseInactiveAddress();
		names.switchToNameEntry();
		names.nameEntry.enterAtAddress2();
		names.nameEntry.VerifyAddressIconDisplayed();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectStreetEntry" }) // Mithun
	public void CreateNewStreet_247879(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "247879");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		geo.switchToStreetEntry(); //
		geo.streetEntry.closeStreetEntry(); //
		objectIdentification.windowHandle.switchToMainWindow();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtEvenFrom();
		geo.addressIntersection.enterAtEvenTo();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection(); //
		geo.addressIntersection.CloseScreen(); //
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.nameEntry.nameEntryMainTab.SelectAtSex();
		names.nameEntry.nameEntryMainTab.SelectLicenseType();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.SelectAtResident();
		names.nameEntry.SaveNCloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAddressAsAddress();
		names.nameSearch.EnterAtPremiseNo();
		names.nameSearch.EnterAtStreet();
		names.nameSearch.clickSearchButton();
		names.nameSearch.VerifyAtNameUsingLastNameFirstName(0);
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectStreetEntry" }) // Mithun
	public void CreateNewStreet_247880(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "247880");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.saveNClose();
		objectIdentification.windowHandle.switchToMainWindow();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtPremiseOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterNameIDAsA();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.nameEntry.nameEntryMainTab.SelectAtSex();
		names.nameEntry.nameEntryMainTab.SelectLicenseType();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.SelectAtResident();
		names.nameEntry.SaveNCloseScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterNameIDAsO();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.nameEntry.nameEntryMainTab.SelectAtSex();
		names.nameEntry.nameEntryMainTab.SelectLicenseType();
		names.nameEntry.nameEntryMainTab.SelectAtRace();
		names.nameEntry.nameEntryMainTab.SelectAtEthnic();
		names.nameEntry.nameEntryMainTab.SelectAtResident();
		names.nameEntry.SaveNCloseScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.switchToNamesTab();
		geo.addressSearch.addressSearchNamesTab.verifyAtNameInGrid();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtAddress();
		names.nameSearch.clickSearchButton();
		names.nameSearch.verifyAtNameInGrid();
		names.nameSearch.verifyAtName1InGrid();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectStreetSearch" }) // Mithun
	public void CreateNewStreet_247881(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "247881");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.selectPrefixAsNE();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
//        geo.streetEntry.Save();
		geo.streetEntry.saveNClose();
		objectIdentification.windowHandle.switchToMainWindow();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtEvenFrom();
		geo.addressIntersection.enterAtEvenTo();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.ClickSelectAllCheckBox();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtInterStreet();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.enterAtInterStreet1();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.enterAtInterStreet2();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.enterAtInterStreet3();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.ClickAllTabs();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectStreetSearch" })
	// Mithun
	public void CreateNewStreet_250095(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250095");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.EnterStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
//        geo.streetEntry.Save();
		geo.streetEntry.saveNClose();
		objectIdentification.windowHandle.switchToMainWindow();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNumber();
		geo.addressIntersection.SelectAsOdd();
//        geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
//        geo.addressIntersection.SaveScreen();
		geo.addressIntersection.saveNCloseScreen();

		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.ClickSelectAllCheckBox();
		geo.streetSearch.SelectManageIntersection();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtInterStreet();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.enterAtInterStreet1(); // updated
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.enterAtInterStreet2(); // updated
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.enterAtInterStreet3(); // updated
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.VerifyAtIntersectionAddressByStreetName();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectStreetSearch" }) // Automated by Stalin
	public void ValidatingInactivePremise_258308(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258308");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.clickAtPremiseNo();
		geo.addressIntersection.clickInactiveCheckBox();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyAcknowledgePremiseInactiveAddress();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyAddressButtonIsDisabled();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtAddress();
		names.nameSearch.clickAddressIBubbleIcon();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.switchToFlagsTab();
		geo.addressSearchHelp.addressSearchHelpFlagsTab.verifyAddFlagsButtonIsDisabled();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.switchToCommonNameTab();
		geo.addressSearchHelp.addressSearchHelpCommonNameTab.verifyAddCommonNamesButtonIsDisabled();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.switchToContactsTab();
		geo.addressSearchHelp.addressSearchHelpContactTab.verifyAddNewButtonIsDisabled();
		geo.switchToAddressSearchHelpWindow();
		geo.addressSearchHelp.CloseAddressSearchScreen();
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtAddress1();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.selectAtRealAddress(0);
		geo.realAddressHelpWindow.verifyAcknowledgeAtPremiseNoIsInactive();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.selectAtRealAddress(1);
		names.switchToNameEntry();
		names.nameEntry.clearAddess();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.VerifyAcknowledgePremiseInactiveAddress();
		names.switchToNameEntry();

	}

	@Test(groups = { "2020DefectCommonNames" }) // Stalin
	public void ZipCodeEntryfunctionality(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260149");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("ZIP Code");
		geo.switchToZipCode();
		geo.zipCode.clickAddNewButton();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtZipCode();
		settings.sharedCodes.selectAtState();
		settings.sharedCodes.enterAtCity();
		settings.sharedCodes.selectLocationType();
		settings.sharedCodes.enterAtLocationName();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.closeScreen();
		geo.switchToZipCode();
		geo.zipCode.enterAtZipCode();
		geo.zipCode.clickSearchButton();
		geo.zipCode.verifyAtZipcodeInGrid(0);
		geo.zipCode.clearZipCode();
		geo.zipCode.enterAtZipCode1();
		geo.zipCode.clickSearchButton();
		geo.zipCode.verifyAtZipCodeInGrid1();
		geo.zipCode.clearZipCode();
		geo.zipCode.clickAddNewButton();
		settings.switchToSharedCodes();
		settings.sharedCodes.enterAtZipCode2();
		settings.sharedCodes.selectAtState();
		settings.sharedCodes.enterAtCity();
		settings.sharedCodes.selectLocationType();
		settings.sharedCodes.enterAtLocationName();
		settings.sharedCodes.clickInactiveCheckBox();
		settings.sharedCodes.saveScreen();
		settings.switchToSharedCodes();
		settings.sharedCodes.closeScreen();
		geo.switchToZipCode();
		geo.zipCode.clickAddNewButton();
		settings.switchToSharedCodes();
		geo.zipCode.enterAtZipCode1();
		settings.sharedCodes.selectAtState();
		settings.sharedCodes.enterAtCity();
		settings.sharedCodes.selectLocationType();
		settings.sharedCodes.enterAtLocationName();
		settings.sharedCodes.clickSave();
		settings.sharedCodes.verifyInvalidZipCodeAckwMsg();
		settings.switchToSharedCodes();

	}

	

	@Test(groups = { "2020DefectCommonNames" }) // Q4 Sprint 5 Automated by Mahesha
	public void MapLayerFunctionalities_260806(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "260806");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("Coded");
		settings.switchToCodedScreen();
		settings.coded.enterAtCodeID();
		settings.coded.clickSearchButton();
		settings.coded.verifyAtDescriptionInGrid(0);
		settings.coded.clickRowByAtCodeID();
		settings.switchToSharedCodes();
		settings.sharedCodes.clickAddNewButton();
		settings.sharedCodes.enterAtCodeValue();
		settings.sharedCodes.enterAtLayerDescription();
		settings.sharedCodes.selectAtLayerIcon();
		settings.sharedCodes.clickCodeAddButton();
		settings.sharedCodes.enterAtCodeValueSearch();
		settings.sharedCodes.clickSearchButton();
		settings.sharedCodes.verifyAtCodeValueinGrid(0);
		settings.sharedCodes.closeScreen();

		loader.navigateToModule("Geo");
		loader.navigateToScreen("Map Layer Search");
		geo.switchToMapLayerSearch();
		geo.mapLayerSearch.clickAddnewButton();
		geo.switchToMapLayerEntry();
		geo.mapLayerEntry.selectAtLayerType();
		geo.mapLayerEntry.selectAtLayerName(0);
		geo.mapLayerEntry.enterAtFeatureName();
		geo.mapLayerEntry.enterAtAddress();
		geo.mapLayerEntry.SaveNCloseScreen();

		loader.navigateToScreen("Map Layer Search");
		geo.switchToMapLayerSearch();
		geo.mapLayerSearch.selectAtLayerName(0);
		geo.mapLayerSearch.clickSearchButton();
		geo.mapLayerSearch.verifyAtNameInGrid(0);
		geo.mapLayerSearch.selectGridRowByLayerName(0);
		geo.switchToMapLayerEntry();
		geo.mapLayerEntry.selectInavtiveCheckBox();
		geo.mapLayerEntry.verifyInactiveDateAsCurrentDate();
		geo.mapLayerEntry.SaveNCloseScreen();
		geo.mapLayerSearch.verifyNoRecordsFoundAck();
		loader.navigateToScreen("Map Layer Search");
		loader.ReLoadScreen("Map Layer Search");
		loader.navigateToScreen("Map Layer Search");
		geo.switchToMapLayerSearch();
		geo.mapLayerSearch.selectAtLayerName(0);
		geo.mapLayerSearch.clickSearchButton();
		geo.mapLayerSearch.verifyNoRecordsFoundAck();
		loader.navigateToScreen("Map Layer Search");
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectStreetSearch" }) // Vijay
	public void verifyAddressSearchPremisesNotShowingInShowDetailsScreen_257951(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "257951");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.ClickAtStreetName1();
		geo.switchToAddressIntersection();
		geo.addressIntersection.CloseScreen();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddressWithInvalidPremise();
		geo.switchToPremiseHelpWindow();
		geo.premiseHelpWindow.clickShowDetailButton();
		geo.premiseHelpWindow.verifyPremiseNoInGrid();
		geo.premiseHelpWindow.closeScreen();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress1WithOutApartmentNo();
		geo.switchToApartmentHelpWindow1();
		geo.apartmentHelpWindow.verifyApartmentRangeNotEmpty();
		geo.apartmentHelpWindow.closeWindow();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress1();
		geo.addressSearch.verifyAtAddressBubble();
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectCommonNames" }) // Vijay
	public void VerifyTheCommonNameSearchScreenFunctionality_250423(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "250423");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.enterAtAddress();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.EnterAtCommonName();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.enterAtCommonNameUsingSubstring();
		geo.commonNames.verifyAddressBubbleInfoIconDisplayed();
		geo.commonNames.checkTheSoundAlikeCheckBox();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.enterAtZipCode();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.enterAtAddress();
		geo.commonNames.enterAtZipCode();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.enterAtCommonName1();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		geo.commonNames.enterAtCommonName2();
		geo.commonNames.clearZipCode();
		geo.commonNames.ClickSearch();
		geo.commonNames.verifyAtCommonName2(0);
		geo.commonNames.ClickAddNew();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.enterAtAddress1();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.enterAtCommonName3();
		geo.commonNamesEntry.EnterSortOrder();
		geo.commonNamesEntry.ClickAddButton();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.enterAtCommonName4();
		geo.commonNamesEntry.EnterSortOrder();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.SaveAndClose();
		geo.switchToCommonNamesScreen();
		geo.commonNames.enterAtCommonName3();
		geo.switchToApartmentSearchHelpWindow();
		geo.apartmentHelpWindow.closeWindow();
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickSearch();
		geo.commonNames.verifyAtCommonName3(0);
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2020DefectAddressFlag" }) // Q4 Sprint 5 Automated by Mahesha
	public void VerifyAddressShouldMergedWithApartmentAndIntersectionAlongWithBaseAddressUsingAddressSearchScreen_261098(
			ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261098");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();

		// Base address merge
		geo.addressSearch.enterAtAddress();
		geo.switchToApartmentSearchHelpWindow();
		geo.apartmentHelpWindow.clickUseBaseAddressButton();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.clickMergeAddressButton();
		geo.addressSearch.mergeAddressPopup.EnterAtMergeToAddress(0);
		geo.addressSearch.mergeAddressPopup.ClickMergeButton();
		geo.addressSearch.mergeAddressPopup.VerifyConfirmMessageThisProcessWillTakeSignificationAmoutOfTime();
		geo.addressSearch.mergeAddressPopup.VerifyMergeSuccessfulAcknowledge();
		geo.addressSearch.mergeAddressPopup.verifyMergeFromAddressWillNotInactivatedAcknowledge();

		// Address with apartment merge with Another
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress1();
		geo.addressSearch.clickMergeAddressButton();
		geo.addressSearch.mergeAddressPopup.EnterAtMergeToAddress(1);
		geo.addressSearch.mergeAddressPopup.ClickMergeButton();
		geo.addressSearch.mergeAddressPopup.VerifyConfirmMessageThisProcessWillTakeSignificationAmoutOfTime();
		geo.addressSearch.mergeAddressPopup.VerifyMergeSuccessfulAcknowledge();

		// Address with apartment merge with Another Apartment of same address
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress2();
		geo.addressSearch.clickMergeAddressButton();
		geo.addressSearch.mergeAddressPopup.EnterAtMergeToAddress(2);
		geo.addressSearch.mergeAddressPopup.ClickMergeButton();
		geo.addressSearch.mergeAddressPopup.VerifyConfirmMessageThisProcessWillTakeSignificationAmoutOfTime();
		geo.addressSearch.mergeAddressPopup.VerifyMergeSuccessfulAcknowledge();

		// Intersection with Intersection
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ClickClearButton();
		geo.addressSearch.enterAtAddress3();
		geo.switchToAddressIntersectionHelpWindow();
		geo.addressIntersectionHelpWindow.selectGridRow(1);
		geo.switchToAddressSearchScreen();
		geo.addressSearch.clickMergeAddressButton();
		geo.addressSearch.mergeAddressPopup.EnterAtMergeToAddress(3);
		geo.addressSearch.mergeAddressPopup.ClickMergeButton();
		geo.addressSearch.mergeAddressPopup.VerifyConfirmMessageThisProcessWillTakeSignificationAmoutOfTime();
		geo.addressSearch.mergeAddressPopup.VerifyMergeSuccessfulAcknowledge();
		geo.switchToAddressSearchScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	

	

	@Test(groups = { "2020DefectAddressFlag" }) // Mithun Q4 Sprint 2 //Mahesha
	public void AddressFlagScreen_257118(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257118");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Flag(P)");
		// Search scenario
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.EnterAtAddress();
		geo.addressFlag.VerifyAddressInfoButtonYellowColor();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyAtAddressInTheGrid();
		geo.addressFlag.reloadAddressFlagPScreen();

		geo.switchToAddressFlagPSearch();
		geo.addressFlag.enterAtRemarks();
		geo.addressFlag.selectAtDisplayConditions();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyAtAddressInTheGrid();
		geo.addressFlag.reloadAddressFlagPScreen();

		geo.switchToAddressFlagPSearch();
		geo.addressFlag.enterAtActiveAsDate();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyAtAddressInTheGrid();
		geo.addressFlag.reloadAddressFlagPScreen();

		geo.switchToAddressFlagPSearch();
		geo.addressFlag.enterAtInactiveAfter();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyAtAddressInTheGrid();
		geo.addressFlag.VerifyAtAddressRowAppearGreyColor(0);
		geo.addressFlag.ClickAtAddress();

		// Print
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.ClickPrintButton();
		home.switchToSelectReport();
		home.selectReport.CloseTheScreen();

		// Deleting in active Record
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.DeleteAddressFlag();
		geo.addressFlagEntry.verifyNoRecordsFoundAcknowledgeMessage();

		// Creating new
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.ClickAddNew();

		geo.switchToAddressFlagEntry();
		geo.addressFlag.EnterAtAddress();
		geo.addressFlagEntry.SelectAtDisplayCondition();
		geo.addressFlagEntry.EnterActiveDateAsCurrentDate();
		geo.addressFlagEntry.selectIsCriticalCheckBox();
		geo.addressFlagEntry.SelectText();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.switchToNarrativeTextFrame();
		geo.addressFlagEntry.enterAtRemarks();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.ClickSaveAndCloseButton();

		geo.switchToAddressFlagPSearch();
		geo.addressFlag.reloadAddressFlagPScreen();
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.EnterAtAddress();
		geo.addressFlag.VerifyAddressInfoButtonRedColor();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyAtAddressInTheGrid();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectStreetEntry" }) // Automated by Stalin
	public void creatingaddresswithApartmentandIntersections_261407(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261407");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.verifyAtZipCodeDescription();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.saveNClose();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.selectRowByAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtPremiseOddNumber();
		geo.addressIntersection.EnterAtEvenNumber(); // updated
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.clickAddButton();
//		geo.addressIntersection.SaveScreen();
//		geo.switchToAddressIntersection();
//		geo.addressIntersection.verifyAtEvenOddInGrid(0);
//		geo.addressIntersection.CloseScreen();
		geo.addressIntersection.saveNCloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.ClickAddButton();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterAtPremise();
		geo.apartmentEntry.EnterAtApartmentFrom();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.SaveNClose();
		geo.switchToApartment();
		geo.apartment.CloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.clickManageIntersectionUsingStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtInterStreet();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToAddressIntersection();
		geo.addressIntersection.verifyAtIntStreetNameInGrid();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectAddressFlag" }) // Mithun // run only in 87
	public void PoliceDefectTestcase_259725(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "259725");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Flag(P)");
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.ClickAddNew();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.EnterAtAddress();
		geo.addressFlagEntry.SelectAtDisplayCondition();
		geo.addressFlagEntry.enterActiveDateAsPreviousDate();
		geo.addressFlagEntry.clickTextMgmtIcon();
		settings.switchToTextEntry();
		settings.textEntry.clickSubjectTab();                    // available only in 14.87
		settings.textEntry.textSubjectTab.enterAtTextName();
		settings.switchToTextEntry();
		settings.textEntry.saveScreen();
		settings.switchToTextEntry();
		settings.textEntry.close();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.ClickSaveButton();

		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Flag(P)");
		geo.switchToAddressFlagPSearch();
		geo.addressFlag.EnterAtAddress();
		geo.addressFlag.ClickSearchButton();
		geo.addressFlag.VerifyAtAddressInTheGrid();
		geo.addressFlag.ClickAtAddress();
		geo.switchToAddressFlagEntry();
		geo.addressFlagEntry.CloseScreen();
		objectIdentification.windowHandle.switchToMainWindow();

	}

	@Test(groups = { "2020DefectCommonNames" })

	// Automated by Mithun

	public void PoliceDefectTestcase_256802(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256802");

		String url = PropertiesFile.readPropertiesFile("urlFire");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.SelectRandomRowFromGrid();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtOddNumber();
		geo.addressIntersection.EnterAtOddTo();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.saveNCloseScreen();

		objectIdentification.windowHandle.switchToMainWindow();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.ClickAddButton();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterAtPremise();
		geo.apartmentEntry.EnterAtApartmentFrom();
		geo.apartmentEntry.EnterAtApartmentTo();
		geo.apartmentEntry.ClickAddButton(); // added
		geo.apartmentEntry.SaveNClose(); // added
		geo.switchToApartment(); // added
		geo.apartment.CloseScreen(); // added

		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickAddNew();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtStreetDetails();
		geo.switchToApartmentSearchHelpWindow();
		geo.apartmentHelpWindow.clickUseBaseAddressButton();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtCommonName();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.SaveAndClose();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.logout();

		Browser.NavigateToUrl(url);
		login.loginScreen.logonUsingTestContextOtherDB();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.enterAtStreetName();
		geo.switchToCommonNameHelp();
		geo.commonNameHelp.SelectCommonName();
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickSearch();
		geo.commonNames.VerifyAtCommonName(0);
		objectIdentification.windowHandle.switchToMainWindow();
	}

	@Test(groups = { "2021DefectTestCases" }) // 2021 Automated by Mahesha
	public void VerifyTheAddressmergewithdifferentCSZ_275941(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275941");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();

		geo.addressSearch.clickMergeAddressButton();
		geo.addressSearch.mergeAddressPopup.clickGetCountButton();
		geo.addressSearch.mergeAddressPopup.VerifyAtRecordCount();
		geo.addressSearch.mergeAddressPopup.EnterAtMergeToAddress(0);
		geo.addressSearch.mergeAddressPopup.ClickMergeButton();
		geo.addressSearch.mergeAddressPopup.VerifyConfirmMessageThisProcessWillTakeSignificationAmoutOfTime();
		geo.addressSearch.mergeAddressPopup.VerifyMergeSuccessfulAcknowledge();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ResetAddress();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.mergeAddressPopup.VerifyAddressInactiveAcknowledge();

		geo.switchToAddressSearchScreen();
		geo.addressSearch.ResetAddress();
		geo.addressSearch.enterAtAddress1();
		geo.addressSearch.verifyAtAddressBubble();

	}

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S6
	public void Geolookup_275255(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275255");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsVerifyApartment();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter541AsTrue();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToApartmentSearchHelpWindow();
		geo.apartmentHelpWindow.enterAtApartment();
		geo.apartmentHelpWindow.clickUseBaseAddressButton();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyAtAddressBubble();
		geo.switchToAddressSearchScreen();

	}
//TestCase ID – 275256

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S6
	public void Geolookup_275256(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275256");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsVerifyApartment();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter541AsFalse();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.verifyAtStreetName();
		geo.realAddressHelpWindow.close();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.clearAddress();
		geo.addressSearch.enterAtAddress1();
		geo.switchToApartmentSearchHelpWindow();
		geo.apartmentHelpWindow.closeWindow();
		geo.switchToAddressSearchScreen();

	}
//TestCase ID – 275257

	@Test(groups = { "2021DefectTestCases" }) // Automated by Stalin Q2 S6
	public void PoliceDefect_275257(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "275257");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Setting");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsVerifyApartment();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter541AsFalse();
		settings.switchToSystemParamter();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToCommonNameHelp();
		geo.commonNameHelp.SelectCommonName();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyAtAddressBubbleDisplayed();
		geo.switchToAddressSearchScreen();

	}
	
	//Reworked by:-Abi , Date :-11/15/2021 , Module:-Geo .
	@Test (groups = { "GeoFunctional3" })
	public void SplitPremiseAndVerify_159694(ITestContext testContext){
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", 159694);
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Geo");
	loader.navigateToScreen("Street Search");
	geo.switchToStreetSearchScreen();
	geo.streetSearch.enterAtStreetName();
	geo.streetSearch.enterAtStreetType();
	geo.streetSearch.clickSearchButton();
	geo.streetSearch.VerifyAtStreetName();
	geo.streetSearch.clickAtStreetName();
	geo.switchToAddressIntersection();
	geo.addressIntersection.clickRefreshButton(); 											//updated
	geo.addressIntersection.VerifyAtPremiseOddInGrid(1);
	geo.addressIntersection.VerifyAtPremiseEvenInGrid(2);
	geo.addressIntersection.EnterAtOddNumber();
	geo.addressIntersection.SelectAsOdd();
	geo.addressIntersection.clickAddButton();
	geo.addressIntersection.VerifyAcknowledgeOverlapping();
	geo.switchToAddressIntersection();
	geo.addressIntersection.ClickAtPremiseOddRowInGrid();
	geo.addressIntersection.EnterAtOddTo();
	geo.addressIntersection.clickAddButton();
	geo.addressIntersection.VerifyAtPremiseOddSplited(1, 3); // Changes in method by Abi
	geo.addressIntersection.SaveScreen();
	geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();
	geo.addressIntersection.VerifyAtPremiseOddSplited(1, 2); // Changes in method by Abi
	geo.switchToAddressIntersection();
	geo.addressIntersection.ClickAtPremiseEvenRowInGrid();
	geo.addressIntersection.enterAtEvenTo();
	geo.addressIntersection.clickAddButton();
	geo.addressIntersection.VerifyAtPremiseEvenSplited(3, 4); // Changes in method by Abi
	geo.addressIntersection.SaveScreen();
	geo.addressIntersection.verifyUpdateSuccessfulStatusMessage();
	geo.addressIntersection.VerifyAtPremiseEvenSplited(3, 4); // Changes in method by Abi
	geo.switchToAddressIntersection();
	geo.addressIntersection.CloseScreen();

	}
	
	
	@Test (groups = { "GeoFunctional3" })
	public void CreateIntersectionOnGeoflyAndVerifyAddress_207329(ITestContext testContext){
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", 207329);
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Geo");
	loader.navigateToScreen("Address Search");
	geo.switchToAddressSearchScreen();
	geo.addressSearch.enterAtAddress();
	geo.addressSearch.VerifyConfirmGeoFly();
	geo.switchToGeoOnFly();
	geo.fastGeo.VerifyAtStreetName();
	geo.fastGeo.VerifyAtIntStreetName();
	geo.fastGeo.enterAtZipCode();
	geo.fastGeo.ClickRefreshMapButton();
	geo.fastGeo.enterAtCommonName();
	geo.fastGeo.clickSaveAndUseAddress();
	geo.fastGeo.VerifyAddressConfirmMessage();   // This popup is not arising for gn address
	geo.switchToAddressSearchScreen();   
	geo.addressSearch.VerifyAtAddress();
	geo.addressSearch.VerifyAtCommonName();
	geo.addressSearch.ClickAllTabs();
	objectIdentification.windowHandle.switchToMainWindow();
	loader.navigateToScreen("Common Names");
	geo.switchToCommonNamesScreen();
	geo.commonNames.EnterAtCommonName();
	geo.commonNames.ClickSearch();
	geo.commonNames.VerifyAtCommonName(0);
	geo.commonNames.VerifyAtAddress(0);
	objectIdentification.windowHandle.switchToMainWindow();
	loader.navigateToScreen("Street Search");
	geo.switchToStreetSearchScreen();
	geo.streetSearch.enterAtStreetName();
	geo.streetSearch.ClickIntersectionCheckBox();
	geo.streetSearch.clickSearchButton();
	geo.streetSearch.VerifyAtStreetName();
	geo.streetSearch.VerifyAtInterStreetName(0);
	geo.streetSearch.VerifyAtCSZ(0);
	geo.streetSearch.EnterAtInterStreetName();
	geo.streetSearch.clickSearchButton();
	geo.streetSearch.VerifyAtStreetName();
	geo.streetSearch.VerifyAtIntersectionStreetName();      // //issue happened in chrome
	//geo.streetSearch.VerifyAtCSZ(0);
	}

	
	@Test (groups = { "GeoFunctional3" })
	public void VerifyIntersectionStreet_207330(ITestContext testContext){
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", 207330);
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Geo");
	loader.navigateToScreen("Address Search");
	geo.switchToAddressSearchScreen();
	geo.addressSearch.EnterAtCommonName();
	geo.addressSearch.VerifyAtAddress();
	geo.addressSearch.VerifyAtCommonName();
	geo.addressSearch.VerifyAtCSZ();
	geo.addressSearch.ClickAllTabs();
	geo.switchToAddressSearchScreen();
	geo.addressSearch.ResetAddress();
	geo.addressSearch.EnterAtStreetNameWithSlashCharacter();
	geo.addressSearch.VerifyAtAddress();
	geo.addressSearch.VerifyAtCommonName();
	geo.addressSearch.ClickAllTabs();
	geo.switchToAddressSearchScreen();
	geo.addressSearch.ResetAddress();
	geo.addressSearch.EnterAtStreetName1WithSlashCharacter();
	geo.addressSearch.VerifyAtAddress1();
	geo.addressSearch.VerifyAtCommonName();
	geo.addressSearch.VerifyAtCSZ();
	geo.addressSearch.ResetAddress();
	geo.addressSearch.enterAtAddress();
	geo.addressSearch.VerifyAtAddress();
	geo.addressSearch.VerifyAtCommonName();
	geo.addressSearch.SwitchToCommonNameTab();
	geo.addressSearch.addressSearchCommonNameTab.VerifyAtCommonName();
	geo.switchToAddressSearchScreen();
	geo.addressSearch.ResetAddress();
	geo.addressSearch.EnterAtStreetNameAndStreetName1WithSlashCharacter();
	geo.addressSearch.VerifyAtAddress();
	geo.addressSearch.VerifyAtCommonName();
	geo.addressSearch.VerifyAtCSZ();
	geo.addressSearch.ClickAllTabs();
	geo.switchToAddressSearchScreen();
	geo.addressSearch.ResetAddress();
	geo.addressSearch.EnterAtStreetName1AndStreetNameWithSlashCharacter();
	geo.addressSearch.VerifyAtAddress1();
	geo.addressSearch.VerifyAtCommonName();
	geo.addressSearch.VerifyAtCSZ();
	geo.addressSearch.SwitchToCommonNameTab();
	geo.addressSearch.addressSearchCommonNameTab.VerifyAtCommonName();
	geo.switchToAddressSearchScreen();
	geo.addressSearch.ClickAllTabs();
	}

	
	//Automated by:- Dinesh , Date :- 14/12/2021 , Quarter:-4 , Sprint:-5 , Module:-Geo .

	@Test(groups = { "2022DefectTestcaseGeo" })
	public void VerifyCommonNameValidation_271623(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "271623");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter504AsVerifyApartment();
		settings.sysParameter.setSystemparameter541AsTrue();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.selectAtJuris();
		geo.streetEntry.selectAtPrefix();
		geo.streetEntry.enterAtStreetName(); 
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.verifyAtStreetNameInGrid(0);
		geo.switchToStreetEntry();
		geo.streetEntry.saveNClose();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.selectAtJuris();
		geo.streetSearch.EnterAtPrefix();
		geo.streetSearch.enterAtStreetName(); 
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.EnterAtPopupZipcode();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.SelectAtStreetNameFromGrid();
		geo.switchToAddressIntersection();
		geo.addressIntersection.enterAtPremiseEven();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAtPremiseEvenInGrid(0);
		geo.addressIntersection.saveNCloseScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.selectAtJuris();
		geo.streetSearch.EnterAtPrefix();
		geo.streetSearch.enterAtStreetName(); 
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.selectgridCheckBoxByInterSteetName();
		geo.streetSearch.SelectManageApartment();
		geo.switchToApartment();
		geo.apartment.ClickAddButton();
		geo.switchToApartmentEntry();
		geo.apartmentEntry.EnterAtPremise();
		geo.apartmentEntry.EnterAtApartmentFrom();
		geo.apartmentEntry.EnterAtApartmentTo();
		geo.apartmentEntry.ClickAddButton();
		geo.apartmentEntry.VerifyAtApartmentFromInGrid(0);
		geo.apartmentEntry.SaveNClose();
		loader.navigateToScreen("Common Names");
		geo.switchToCommonNamesScreen();
		geo.commonNames.ClickAddNew();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.enterAtAddress();
		geo.switchToApartmentHelpWindow();
		geo.apartmentHelpWindow.clickUseBaseAddressButton();
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtCommonName();
		geo.commonNamesEntry.EnterAtSortOrder();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifyAtCommonNameInGrid(0);
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.EnterAtCommonName1();
		geo.commonNamesEntry.EnterAtSortOrder1();
		geo.commonNamesEntry.ClickReplaceCheckBox();
		geo.commonNamesEntry.ClickAddButton();
		geo.commonNamesEntry.VerifyAtCommonNameInGrid(0);
		geo.switchToCommonNamesEntry();
		geo.commonNamesEntry.SaveAndClose();
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToApartmentHelpWindow();
		geo.apartmentHelpWindow.clickUseBaseAddressButton();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.ResetAddress();
		geo.addressSearch.enterAtAddress1();
		geo.switchToCommonNameHelp();
		geo.commonNameHelp.SelectCommonName();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.verifyDetailsTabIsDisplayed();
		objectIdentification.windowHandle.switchToMainWindow();
	}
	
	//Automated by:-Dinesh , Date :-16-12-2021 , Quarter:-4 , Sprint:-6 , Module:-Geo .

	@Test(groups = { "" })
	public void FlagIconShouldDisplayWhileValidatingTheAddress_282063(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "282063");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.VerifySpecialCharactersNotAllowed();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.verifyAtStreetNameInGrid(0);
		geo.streetEntry.DeleteRowFromGrid();
		geo.switchToStreetEntry();
		geo.streetEntry.ClickResetButton();
		geo.streetEntry.enterAtStreetName();
		geo.streetEntry.enterAtStreetType();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.verifyAtStreetNameInGrid(0);
		geo.switchToStreetEntry();
		geo.streetEntry.saveNClose();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.enterAtStreetType();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.SelectAtStreetNameFromGrid();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtPremiseOddNumber();
		geo.addressIntersection.enterAtPremiseEven();
		geo.addressIntersection.selectAsBoth();
		geo.addressIntersection.SelectPatrolZone();
		geo.addressIntersection.SelectSubZone();
		geo.addressIntersection.enterAtNPACard();
		geo.addressIntersection.EnterGeoCordsX();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.enterAtCensusTract();
		geo.addressIntersection.SelectVotingDistrict();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.VerifyAtPremiseOddInGrid(0);
		
	}

	
	//Automated by:-Abinaya , Date :-12/10/2021 , Quarter:-4 , Sprint:-5 , Module:-Geo .

	@Test(groups = { "2022DefectTestCasesGeo" })
	public void RealAddressLookup_278223(ITestContext testcontext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "278223");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Street Search");
		geo.switchToStreetSearchScreen();
		geo.streetSearch.enterAtStreetName();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.verifyAtPremiseEven(0);
		geo.streetSearch.clickAddNew();
		geo.switchToStreetEntry();
		geo.streetEntry.enterAtStreetName();
		//geo.streetEntry.enterAtStreetType();
		//geo.streetEntry.enterAtZipCode();
		geo.streetEntry.clickAddButton();
		geo.streetEntry.Save();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.VerifyAtStreetType(0);
		geo.streetSearch.selectRowByAtStreetName();
		geo.switchToAddressIntersection();
		geo.addressIntersection.EnterAtPremiseOddNumber();
		geo.addressIntersection.SelectAsOdd();
		geo.addressIntersection.enterAtZipCode();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.verifyAtZipCodeGrid(0);
		geo.addressIntersection.enterAtPremiseEven();
		geo.addressIntersection.selectAsEven();
		geo.addressIntersection.enterAtZipCode1();
		geo.addressIntersection.clickAddButton();
		geo.addressIntersection.SaveScreen();
		geo.switchToStreetSearchScreen();
		geo.streetSearch.clickSearchButton();
		geo.streetSearch.VerifyAtStreetName();
		geo.streetSearch.verifyAtPremiseOdd(0);
		loader.navigateToScreen("Address Search");		
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.switchToRealAddressWindow();
		geo.realAddressHelpWindow.verifyAtStreetName();
		geo.realAddressHelpWindow.selectAtZipcode();
		geo.switchToPremiseHelpWindow();
		geo.premiseHelpWindow.enterValidPremise();
		geo.premiseHelpWindow.clickUseThisPremise();
		geo.switchToAddressSearchScreen();
		geo.addressSearch.VerifyAtCSZ();
		
	}
	
	  @AfterMethod(groups = { "2020DefectStreetSearch", "2020DefectAddressFlag",
	"2020DefectCommonNames", "2020DefectAttachments",
	  "2021DefectTestCases", "2020DefectStreetEntry", "GeoFunctional1" , "GeoFunctional2" , "GeoFunctional3","2022DefectTestCasesGeo" })
	 
	public void afterMethodRecords(ITestResult testResult) {
		/*
		 * try { Playback.takeScreenShotOnFailure(testResult); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		try {
			ExtentReport.getResult(testResult);
		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		Playback.stop();
		ExtentReport.GenerateHTML();
		login.Reset();
		loader.Reset();
		names.Reset();
		geo.Reset();

	}

	@AfterSuite(groups = { "2020DefectStreetSearch", "2020DefectAddressFlag", 
			"2020DefectCommonNames", "2020DefectAttachments", "2021DefectTestCases", "2020DefectStreetEntry",
			"GeoFunctional1" , "GeoFunctional2" , "GeoFunctional3","2022DefectTestCasesGeo" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}

}
