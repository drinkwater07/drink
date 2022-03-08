package scripts;

import java.awt.AWTException;

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
import application.Personnel;
import application.Popup;
import application.Property;
import application.Records;
import application.Settings;
import application.Traffic;
import application.TrafficWI;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class TrafficWIScripts 
{
	public Records records;
	public Login login;
	public Loader loader;
	public Names names;
	public Popup popup;
	public Home home;
	public Settings settings;
	public ObjectIdentification objectIdentification;
	public Personnel personnel;
	public Vehicle vehicle;
	public Property property;
	public Traffic traffic;
	public TrafficWI trafficWI;
	public Geo geo;
	
	@BeforeSuite(groups={"2020DefectTestCases","2021DefectTestCases","TrafficWIFunctional","TrafficFunctional","CitationWI","CrashWI"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups={"2020DefectTestCases","2021DefectTestCases","TrafficWIFunctional","TrafficFunctional","CitationWI","CrashWI"})
 public void beforeTestMethod(ITestContext testContext) 
  {
	 
	  testContext.setAttribute("moduleName","TrafficWI" );
	  Playback.testContext=testContext;
	  Playback.start();
      login=new Login();
	  loader=new Loader();		
	  objectIdentification= new ObjectIdentification();	    
      popup = new Popup();
      settings= new Settings();
      geo= new Geo();
      traffic = new Traffic(); 
      trafficWI = new TrafficWI();
      personnel = new Personnel();
		vehicle = new Vehicle();
		property = new Property();
		records = new Records();
		names = new Names();
	  home = new Home();
  }
	
	

   
	
     @Test  (priority = 1,groups = { "TrafficWIFunctional"})
    public void ParkingEntry_170120(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","170120");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.clickAddNewButton();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.verifyStatusAsIssued();
        trafficWI.parkingEntry.verifyStatusInYellowColor();
        trafficWI.parkingEntry.entercurrentValidationDate();
        trafficWI.parkingEntry.enterCurrentValidationTime();
        trafficWI.parkingEntry.verifyCurrentDate();
        trafficWI.parkingEntry.enterIssueDate();
        trafficWI.parkingEntry.verifyIssueDate();
        trafficWI.parkingEntry.clickSaveButton();
        trafficWI.parkingEntry.verifyTicketRequiredAckMsg(); //updated 
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.enterAtTicketNo();
        trafficWI.parkingEntry.clickSaveButton();
        trafficWI.parkingEntry.parkingEntryMainTab.verifyOfficerRequiredAckMsg();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab();
        trafficWI.parkingEntry.parkingEntryMainTab.enterAtOfficer();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.clickSaveButton();
        trafficWI.parkingEntry.parkingEntryMainTab.verifyPlateOrHullRequiredAckMsg();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab(); 
        trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
        trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateState();
        vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.clickSaveButton();
        trafficWI.parkingEntry.parkingEntryMainTab.verifyChargeRequiredAckMsg();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab(); 
        trafficWI.parkingEntry.parkingEntryMainTab.enterAtViolation();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.clickSaveButton();
        trafficWI.parkingEntry.parkingEntryMainTab.verifyLocationRequiredAckMsg();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab(); 
        trafficWI.parkingEntry.parkingEntryMainTab.enterAtLocation();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.savetheScreen();
        trafficWI.switchToParkingEntry();
    }
    


   @Test  (priority = 2,groups = { "TrafficWIFunctional"})
    public void ParkingEntry_170121(ITestContext testContext)
    {
	   ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	   testContext.setAttribute("testID","170121");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.enterAtTicketNo();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.clickDefandant1Tab();
        trafficWI.parkingEntry.defendant1.enterAtDefendant1LastName();
        trafficWI.parkingEntry.defendant1.enterAtDefendant1FirstName();
        names.switchToNameSearchHelpWindow();
        names.nameSearchHelpWindow.SelectTrafficNameByDefendant1LastFirstName();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.savetheScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.clickDefandant1Tab();
        trafficWI.parkingEntry.defendant1.clickNameInfoIcon();
        names.switchToNameEntry();
        names.nameEntry.switchToActivityTab();
        names.nameEntry.activityTab.SelectAtActivity();
        names.nameEntry.activityTab.ClickActivityCheckBox();
        names.nameEntry.activityTab.VerifyActivityType();
        names.nameEntry.closeTheScreen(); 
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.clickDefandant2Tab();
        trafficWI.parkingEntry.defendant2.enterAtDefendant2LastName();
        trafficWI.parkingEntry.defendant2.enterAtDefendant2FirstName();
        names.switchToNameSearchHelpWindow();
        names.nameSearchHelpWindow.SelectTrafficNameByDefendant2LastFirstName();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.saveandClosetheScreen();
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.clickRefreshButton();
        trafficWI.parkingSearch.verifyAtDefedant2();
        objectIdentification.windowHandle.switchToMainWindow();
    }

 
    @Test (priority = 3,groups = { "TrafficWIFunctional"})
    public void ParkingEntry_170122(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","170122");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.enterAtTicketNo();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab();
        trafficWI.parkingEntry.parkingEntryMainTab.clickVehicleInfoIcon();
        vehicle.switchToVehicleBoatEntry();
        vehicle.vehicleBoatEntry.enterAtYear(); 
        vehicle.vehicleBoatEntry.enterAtMake();
        vehicle.vehicleBoatEntry.enterAtModel();
        vehicle.vehicleBoatEntry.enterAtStyle();
        vehicle.vehicleBoatEntry.saveScreen();
        vehicle.switchToVehicleBoatEntry();
        vehicle.vehicleBoatEntry.clickSelectButton(); 
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab();
        trafficWI.parkingEntry.parkingEntryMainTab.verifyAtYear();
        trafficWI.parkingEntry.parkingEntryMainTab.clickOnHoldCheckBox();
        trafficWI.parkingEntry.parkingEntryMainTab.verifyExpiresFieldEnable();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.clickSaveButton();
        trafficWI.parkingEntry.parkingEntryMainTab.verifyExpirationDateRequiredAckMsg();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab();
        trafficWI.parkingEntry.parkingEntryMainTab.enterExpires1DayFutureFromCurrentDate();
        trafficWI.switchToTicketHoldReason();
        trafficWI.ticketHoldReason.enterReason();
        trafficWI.ticketHoldReason.save();
        trafficWI.switchToParkingEntry();
         trafficWI.parkingEntry.savetheScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.verifyStatusAsOnHold();
        trafficWI.parkingEntry.switchToMainTab();
        trafficWI.parkingEntry.parkingEntryMainTab.clickOnHoldCheckBox();
        trafficWI.switchToTicketHoldReason();
        trafficWI.ticketHoldReason.close();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToHistoryTab();
        trafficWI.parkingEntry.parkingEntryHistoryTab.verifyTicketOnHoldReason();
        trafficWI.switchToParkingEntry();
    }

 
    @Test (priority = 4,groups = { "TrafficWIFunctional"})
    public void ParkingEntry_170123(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","170123");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.enterAtTicketNo();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToMainTab();
        trafficWI.parkingEntry.parkingEntryMainTab.clickUnCheckOnHoldCheckBox();
        trafficWI.parkingEntry.parkingEntryMainTab.enterExpires1DayFutureFromCurrentDate();
        trafficWI.switchToTicketHoldReason();
        trafficWI.ticketHoldReason.enterReason();
        trafficWI.ticketHoldReason.save();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.savetheScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.verifyStatusAsOnHold();
        trafficWI.parkingEntry.switchToHistoryTab();
        trafficWI.parkingEntry.parkingEntryHistoryTab.verifyTicketOnHoldReason();
        trafficWI.switchToParkingEntry();
    }

 
    @Test (priority = 5,groups = { "TrafficWIFunctional"})
    public void ParkingEntry_170124(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","170124");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.enterAtTicketNo();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToFineNoticesTab();
        trafficWI.parkingEntry.fineNoticesTab.verifyAtDefaultInitialFine();
        trafficWI.parkingEntry.fineNoticesTab.verifyAtDefaultFirstAdjustment();
        trafficWI.parkingEntry.fineNoticesTab.verifyAtDefaultSecondAdjustment();
        trafficWI.parkingEntry.fineNoticesTab.verifyAtDefaultThirdAdjustment();
        trafficWI.parkingEntry.fineNoticesTab.enterAtFirstAdjustmentValue();
        trafficWI.parkingEntry.fineNoticesTab.enterFirstNoticeAsCurrentDate();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.savetheScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToFineNoticesTab();
        trafficWI.parkingEntry.fineNoticesTab.verifyGreyedOutFirstAdjustmentField();
        trafficWI.parkingEntry.fineNoticesTab.verifyFirstTotalAmtDueValue();
        trafficWI.parkingEntry.fineNoticesTab.verifyFirstCurrentBalanceValue();
        trafficWI.parkingEntry.fineNoticesTab.enterAtSecondAdjustmentValue();
        trafficWI.parkingEntry.fineNoticesTab.enterSecondNoticeAsCurrentDate();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.savetheScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToFineNoticesTab();
        trafficWI.parkingEntry.fineNoticesTab.verifyGreyedOutSecondAdjustmentField();
        trafficWI.parkingEntry.fineNoticesTab.verifySecondTotalAmtDueValue();
        trafficWI.parkingEntry.fineNoticesTab.verifySecondCurrentBalanceValue();
        trafficWI.parkingEntry.fineNoticesTab.enterAtThirdAdjustmentValue();
        trafficWI.parkingEntry.fineNoticesTab.enterSuspensionNoticeAsCurrentDate();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.savetheScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToFineNoticesTab();
        trafficWI.parkingEntry.fineNoticesTab.verifyGreyedOutThirdAdjustmentField();
        trafficWI.parkingEntry.fineNoticesTab.verifyThirdTotalAmtDueValue();
        trafficWI.parkingEntry.fineNoticesTab.verifyThirdCurrentBalanceValue();
        trafficWI.switchToParkingEntry();
    }



    @Test (priority = 6,groups = { "TrafficWIFunctional"})
    public void ParkingEntry_170125(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","170125");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.enterAtTicketNo();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToFineNoticesTab();
        trafficWI.parkingEntry.fineNoticesTab.clickCitationIssuedCheckBox();
        trafficWI.parkingEntry.fineNoticesTab.enterAtCitationNo();
        trafficWI.parkingEntry.fineNoticesTab.clickCitationInfoIcon();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToAllTabs();
        trafficWI.citationEntry.closeCitationEntryScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.savetheScreen();
        trafficWI.parkingEntry.verifyStatusAsGreenColor();
        trafficWI.parkingEntry.verifyStatusAsCitation();
        trafficWI.parkingEntry.verifyIconsInMenyGreyedOutExceptPrintIcon();
        trafficWI.switchToParkingEntry();
    }

 
    @Test (priority = 7,groups = { "TrafficWIFunctional"}) //Fail
    public void ParkingEntry_170126(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","170126");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.enterAtTicketNo();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToPaymentsTab();
        trafficWI.parkingEntry.paymentsTab.clickAddotherPaymentsButton();
        trafficWI.switchToParkingOtherPayment();
        trafficWI.parkingOtherPayment.enterAtPayment();
        trafficWI.parkingOtherPayment.selectAtPaymentMethod();
        trafficWI.parkingOtherPayment.savetheScreen();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.verifyStatusAsGreenColor();
        trafficWI.parkingEntry.verifyStatusAsPaid();
        trafficWI.parkingEntry.verifyIconsInMenyGreyedOutExceptPrintIcon();
        trafficWI.parkingEntry.verifyDefendant1NameEmpty();
        trafficWI.parkingEntry.switchToFineNoticesTab();
        trafficWI.parkingEntry.fineNoticesTab.verifyCurrentBalanceValueAsZero();
        trafficWI.parkingEntry.fineNoticesTab.verifyCitationIssuedFieldGreyedOut();
        trafficWI.parkingEntry.fineNoticesTab.verifyTicketVoidedFieldGreyedOut();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToHistoryTab();
        trafficWI.parkingEntry.parkingEntryHistoryTab.verifyPaymentReceipt();
        trafficWI.switchToParkingEntry();

    }

  

    @Test (priority = 8,groups = { "TrafficWIFunctional"})
    public void ParkingEntry_170127(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","170127");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Parking Search");
        trafficWI.switchToParkingSearch();
        trafficWI.parkingSearch.enterAtTicketNo();
        trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToCommentsTab();
        trafficWI.parkingEntry.commentsTab.enterAtSubject();
        trafficWI.parkingEntry.commentsTab.clickEnterComments();
        popup.confirm.yes(); //Confirmation window not showing.
        trafficWI.switchToNamesComments();
        trafficWI.namesComments.EnterCommentsAsGroupOfString();
       trafficWI.namesComments.SaveNClose();
       trafficWI.switchToParkingEntry();
        trafficWI.parkingEntry.switchToCommentsTab();
        trafficWI.parkingEntry.commentsTab.verifyAtSubjectInGrid(0);
        trafficWI.switchToParkingEntry();
    }



    @Test (priority = 1,groups = { "CrashWI"})
    public void CreateCrashEntry_206128(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206128");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.clickAddNew();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.enterAtCaseNo();
        trafficWI.crashEntry.clickCaseInfo();
        records.switchToCaseUpdate();
        String readLocation = records.caseUpdate.readLocation(); 
        String readReportedDate = records.caseUpdate.readReportedDate();
        String readReportedTime = records.caseUpdate.readReportedTime();
        records.caseUpdate.closeTheScreen();  
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.verifyAtActiveReportedLocation(readLocation);
        trafficWI.crashEntry.verifyAtActiveDate(readReportedDate);
        trafficWI.crashEntry.verifyAtActiveTime(readReportedTime);
        trafficWI.crashEntry.enterDOTNo();
        trafficWI.crashEntry.enterAmendedNo();
        trafficWI.crashEntry.enterAccidentNo();
        trafficWI.crashEntry.enterAtOfficer();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToAllTab();
        trafficWI.crashEntry.switchToMainTab();
        trafficWI.crashEntry.crashEntryMainTab.clickTruckBusCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickTruckWith2Axles6TiresCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickMedicalTransportCheckBox();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.verifyTruckBusTabEnabled();
        trafficWI.crashEntry.switchToTruckBusTab();
        trafficWI.switchToCrashEntry();

    }



    @Test (priority = 2,groups = { "CrashWI"})
    public void CrashEntryMainTab_206129(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206129");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtCaseNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowByAtCrash();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToMainTab();
        trafficWI.crashEntry.crashEntryMainTab.enterTotalInjured();
        trafficWI.crashEntry.crashEntryMainTab.enterTotalKilled();
        trafficWI.crashEntry.crashEntryMainTab.enterAtTotalUnit();
        trafficWI.crashEntry.crashEntryMainTab.enterAtEMSNo();
        trafficWI.crashEntry.crashEntryMainTab.clickReportableCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickFireCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickHitAndRunCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickGovermentPropertyCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickTrailerTowedCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickPhotoTakenCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickTruckBusCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.verifyTruckRelatedCheckboxEnabled();
        trafficWI.crashEntry.crashEntryMainTab.clickTruckWith2Axles6TiresCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.verifyFatelMedicalTowedCheckboxEnabled();
        trafficWI.crashEntry.crashEntryMainTab.clickMedicalTransportCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickFatalInjuryCheckBox();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();

    }

    
    @Test (priority = 3,groups = { "CrashWI"})
    public void CrashEntryAccidentTab_206130(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206130");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtCaseNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.verifyAtCaseNo(0);
        trafficWI.crashSearch.verifyCrashTypeAsCInGrid(0);
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToWIAccidentTab();
        trafficWI.crashEntry.accidentTab.enterAtCounty();
        trafficWI.crashEntry.accidentTab.verifyMunicipalityCodeEnabled();
        trafficWI.crashEntry.accidentTab.enterAtMunicipality();
        trafficWI.crashEntry.accidentTab.enterOnHwyNo();
        trafficWI.crashEntry.accidentTab.enterAtOnStreet();
        trafficWI.crashEntry.accidentTab.selectOnHwyType();
        trafficWI.crashEntry.accidentTab.selectAccidentLocationComboBox();
        trafficWI.crashEntry.accidentTab.enterAtFromAlterStreetName();
        trafficWI.crashEntry.accidentTab.enterStructureNo();
        trafficWI.crashEntry.accidentTab.enterAgencySpace();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
    }


    @Test  (priority = 4,groups = { "CrashWI"})
    public void CrashEntryUnitDetailsScreen_206131(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206131");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToWIVehicleTab();
        trafficWI.crashEntry.crashEntryUnitTab.enterAtUnitNo();
        trafficWI.crashEntry.crashEntryUnitTab.clickAdd();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.verifyAtUnitNo();
        trafficWI.unitDetails.verifyAtTracsRefNo();
        trafficWI.unitDetails.clickDriverTab();
        trafficWI.unitDetails.unitDetailsDriverTab.enterAtTotalOccupants();
        trafficWI.unitDetails.unitDetailsDriverTab.selectDirectionOfTravel();
        trafficWI.unitDetails.unitDetailsDriverTab.selectSpeedLimit();
        trafficWI.unitDetails.unitDetailsDriverTab.selectOnDutyAccident();
        trafficWI.unitDetails.unitDetailsDriverTab.selectDriverAction();
        trafficWI.unitDetails.saveScreen();
       trafficWI.switchToUnitDetails();
       trafficWI.unitDetails.clickDriverTab();
        trafficWI.unitDetails.unitDetailsDriverTab.clickDriverFactor();
        trafficWI.switchToCrashEntryMoreScreen();
        trafficWI.crashEntryMoreScreen.selectDriverFactor();
        trafficWI.crashEntryMoreScreen.saveNCloseScreen();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.clickDriverTab();
        trafficWI.unitDetails.unitDetailsDriverTab.selectTrafficControl();
        trafficWI.unitDetails.unitDetailsDriverTab.clickHWYFactor();
        trafficWI.switchToCrashEntryMoreScreen();
        trafficWI.crashEntryMoreScreen.selectHWYFactor();
        trafficWI.crashEntryMoreScreen.saveNCloseScreen();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.clickDriverTab();
        trafficWI.unitDetails.unitDetailsDriverTab.enterAtNameID();
        trafficWI.unitDetails.unitDetailsDriverTab.selectAirBag();
        trafficWI.unitDetails.unitDetailsDriverTab.selectAlcoholTest();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.clickVehicleTab();
        trafficWI.unitDetails.unitDetailsVehicleTab.enterAtVehicle();
        trafficWI.unitDetails.unitDetailsVehicleTab.selectAtState();
        vehicle.switchToVehicleBoatEntry();
        vehicle.vehicleBoatEntry.clickSelectButton();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.clickVehicleTab();
        trafficWI.unitDetails.unitDetailsVehicleTab.selectVehicleDamage();
        trafficWI.unitDetails.unitDetailsVehicleTab.clickTowedDueToDamageCheckbox();
        trafficWI.unitDetails.unitDetailsVehicleTab.clickVehicleFactor();
        trafficWI.switchToCrashEntryMoreScreen();
        trafficWI.crashEntryMoreScreen.selectVehicleFactor();
        trafficWI.crashEntryMoreScreen.saveNCloseScreen();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.clickVehicleTab();
        trafficWI.unitDetails.unitDetailsVehicleTab.clickVehicleOwnerSameOperatorCheckbox();
        trafficWI.unitDetails.unitDetailsVehicleTab.verifyAtNameID();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.clickInsuranceSchoolTab();
        trafficWI.unitDetails.insuranceSchoolTab.selectInsuranceCompany();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.clickInsuranceSchoolTab();
        trafficWI.unitDetails.insuranceSchoolTab.clickPolicyHolderSameOwnerCheckbox();
        trafficWI.unitDetails.insuranceSchoolTab.verifyAtNameID();
        trafficWI.unitDetails.insuranceSchoolTab.clickBusTravellingFromRadioButton();
        trafficWI.unitDetails.insuranceSchoolTab.enterSchoolName();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.saveScreen();
        trafficWI.switchToUnitDetails();
        trafficWI.unitDetails.close();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToWIVehicleTab();
        trafficWI.crashEntry.crashEntryUnitTab.verifyTotalOccupantsInGridUsingUnitNo();
        trafficWI.crashEntry.crashEntryUnitTab.verifyAtUnitNoInGrid(0);
        trafficWI.crashEntry.crashEntryUnitTab.verifyVehicleInGridUsingUnitNo();
        trafficWI.crashEntry.crashEntryUnitTab.InternalSave();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
    }


   
    @Test (priority = 12,groups = { "CrashWI"})
    public void CrashEntryTrailerTab_206142(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206142");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.enterAtOfficerCode();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToTrailerTab();
        trafficWI.crashEntry.crashEntryTrailerTab.enterAtTrailerUnitNo();
        trafficWI.crashEntry.crashEntryTrailerTab.enterAtVehicle();
        trafficWI.crashEntry.crashEntryTrailerTab.selectAtState();
        vehicle.switchToVehicleBoatEntry();
        vehicle.vehicleBoatEntry.clickSelectButton();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToTrailerTab();
        trafficWI.crashEntry.crashEntryTrailerTab.clickAdd();
        trafficWI.crashEntry.crashEntryTrailerTab.verifyAtVehicleInGridUsingUnitNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.clickSaveButton();
        trafficWI.crashEntry.verify1051UpdateDataExistsInTrailerTab();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToTrailerTab();
        trafficWI.crashEntry.crashEntryTrailerTab.clickAtUnitNoInGrid();
        trafficWI.crashEntry.crashEntryTrailerTab.selectAtUnitType();
        trafficWI.crashEntry.crashEntryTrailerTab.clickAdd();
        trafficWI.crashEntry.crashEntryTrailerTab.verifyAtVehicleInGridUsingUnitNo();
        trafficWI.crashEntry.crashEntryTrailerTab.verifyAtUnitTypeInGridUsingUnitNo();
        trafficWI.crashEntry.crashEntryTrailerTab.InternalSave();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
    }


    
    
    @Test (priority = 5,groups = { "CrashWI"})
    public void CrashEntryOccupantsTab_206132(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206132");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtCaseNo();
        trafficWI.crashSearch.enterAtAccidentNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToOccupantTab();
        trafficWI.crashEntry.occupantsTab.selectAtUnitNo();
        trafficWI.crashEntry.occupantsTab.verifyAtTotalOccupants();
        trafficWI.crashEntry.occupantsTab.enterAtLastName();
        trafficWI.crashEntry.occupantsTab.enterAtFirstName();
        names.switchToNameSearchHelpWindow();
       //// NamesScripts.NamesTestContext = TrafficWITestContext;
        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToOccupantTab();
        trafficWI.crashEntry.occupantsTab.clickAddressSameOperatorCheckbox();
        trafficWI.crashEntry.occupantsTab.verifyAddressSameOwnerDisabled();
        trafficWI.crashEntry.occupantsTab.clickAddressSameOperatorCheckbox();
        trafficWI.crashEntry.occupantsTab.clickAddressSameOwnerCheckbox();
        trafficWI.crashEntry.occupantsTab.verifyAddressSameOperatorDisabled();
        trafficWI.crashEntry.occupantsTab.selectAtInjurySeverity();
        trafficWI.crashEntry.occupantsTab.selectSeatPosition();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToOccupantTab();
        trafficWI.crashEntry.occupantsTab.selectAirBag();
        trafficWI.crashEntry.occupantsTab.clickAddButton();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        trafficWI.crashEntry.occupantsTab.verifyAcknowledgeUpdateOccupantTab();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToOccupantTab();
        trafficWI.crashEntry.occupantsTab.InternalSave();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToOccupantTab();
        trafficWI.crashEntry.occupantsTab.selectAtUnitNo();
        trafficWI.crashEntry.occupantsTab.enterAtNameID();
        trafficWI.crashEntry.occupantsTab.selectInjurySeverity();
        trafficWI.crashEntry.occupantsTab.selectAirBag();
        trafficWI.crashEntry.occupantsTab.clickAddButton();
        trafficWI.crashEntry.occupantsTab.verifyAcknowledgeTotalOccupant();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToOccupantTab();
        trafficWI.crashEntry.occupantsTab.clickClearButton();
        trafficWI.crashEntry.occupantsTab.InternalSave();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
    }


    
    @Test (priority = 5,groups = { "CrashWI"})
    
    public void CrashEntryWitnessTab_206134(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206134");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtCaseNo();
        trafficWI.crashSearch.enterAtDOTNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToWitnessTab();
        trafficWI.crashEntry.witnessTab.enterAtLastNameFirstName();
        names.switchToNameSearchHelpWindow();
        ////NamesScripts.NamesTestContext = TrafficWITestContext;
        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToWitnessTab();
        trafficWI.crashEntry.witnessTab.clickAddbutton();
        trafficWI.crashEntry.witnessTab.verifyAtPhoneInGrid(0);
        trafficWI.crashEntry.witnessTab.verifyAtNameInGrid(0);
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();

    }


    
    
    @Test (priority = 13,groups = { "CrashWI"})
    public void CrashEntryConclusionTab_206143(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206143");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtCaseNo();
        trafficWI.crashSearch.enterAtDOTNo(); 
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToConclusionTab();
        trafficWI.crashEntry.conclusionTab.select1stHarmfulEvent();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToConclusionTab();
        trafficWI.crashEntry.conclusionTab.selectSpecialStudy();
        trafficWI.crashEntry.conclusionTab.selectCollisionManner();
        trafficWI.crashEntry.conclusionTab.selectAccessControl();
        trafficWI.crashEntry.conclusionTab.selectTrafficWay();
        trafficWI.crashEntry.conclusionTab.selectRoadSurfaceCondition();
        trafficWI.crashEntry.conclusionTab.selectWeather();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
    }


   
    @Test (priority = 14,groups = { "CrashWI"})
    public void CrashEntryPropertyOwnerTab_206144(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206144");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.enterAtAddress();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowByAtCrash();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToPropertyOwnerTab();
        trafficWI.crashEntry.propertyOwnerTab.enterAtNameID();
        trafficWI.crashEntry.propertyOwnerTab.selectAtPropertyType();
        trafficWI.crashEntry.propertyOwnerTab.enterAtDamageTagNo();
        trafficWI.crashEntry.propertyOwnerTab.clickAdd();
        trafficWI.crashEntry.propertyOwnerTab.verifyAtPropertyTypeInGrid(0);
        trafficWI.crashEntry.propertyOwnerTab.verifyAtTagNoInGrid(0);
        trafficWI.crashEntry.propertyOwnerTab.verifyStruckObjectDisabled();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToPropertyOwnerTab();
        trafficWI.crashEntry.propertyOwnerTab.clickAtNameInGrid();
        trafficWI.crashEntry.propertyOwnerTab.verifyStruckObjectEnabled();
        trafficWI.crashEntry.propertyOwnerTab.clickStruckObject();
        trafficWI.switchToStruckObjects();
        trafficWI.struckObjects.selectAtUnitNo();
        trafficWI.struckObjects.selectStruckObject();
        trafficWI.switchToStruckObjects();
        String readStruckObjectDescription = trafficWI.struckObjects.readStruckObjectDescription();
        trafficWI.struckObjects.clickAdd();
        trafficWI.struckObjects.verifyAtstruckObjectUsingUnitNoInGrid(readStruckObjectDescription);
        trafficWI.struckObjects.saveNCloseScreen();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToPropertyOwnerTab();
        trafficWI.crashEntry.propertyOwnerTab.verifyStruckObjectsUsingNameInGrid(readStruckObjectDescription);
        trafficWI.crashEntry.propertyOwnerTab.verifyAtNameInGrid(0);
        trafficWI.switchToCrashEntry();

    }



    @Test (priority = 7,groups = { "CrashWI"})
    public void CrashEntryTruckBusTab_206133(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206133");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToTruckBusTab();
        trafficWI.crashEntry.truckBusTab.enterAtUnitNo();
        trafficWI.crashEntry.truckBusTab.selectSource();
        trafficWI.crashEntry.truckBusTab.enterAtHazmatClass();
        String readHazmatClass = trafficWI.crashEntry.truckBusTab.readHazmatClassDescription();
        trafficWI.crashEntry.truckBusTab.enterAtHazmatUNNo();
        trafficWI.crashEntry.truckBusTab.clickHazMatPlacardDisplayedCheckBox();
        trafficWI.crashEntry.truckBusTab.clickHazardousCargoReleasedCheckBox();
        trafficWI.crashEntry.truckBusTab.enterUSDot();
        trafficWI.crashEntry.truckBusTab.enterAtICCMCNo(); 
        trafficWI.crashEntry.truckBusTab.enterAtCarrierName();
        trafficWI.crashEntry.truckBusTab.enterAtCarrierAddress();
        trafficWI.crashEntry.truckBusTab.enterAtLCNo();
        trafficWI.crashEntry.truckBusTab.enterGVWR();
        trafficWI.crashEntry.truckBusTab.selectVehicleConfiguration();
        trafficWI.crashEntry.truckBusTab.selectCargoBodyType();
        trafficWI.crashEntry.truckBusTab.clickAddButton();
        trafficWI.crashEntry.truckBusTab.verifyAtUnitNo(0);
        trafficWI.crashEntry.truckBusTab.verifyAtHazMatClassDescription(readHazmatClass);
        trafficWI.switchToCrashEntry(); 
        trafficWI.crashEntry.save();
        trafficWI.crashEntry.truckBusTab.verifyAcknowledgeUpdateTruckBusTab();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToTruckBusTab();
        trafficWI.crashEntry.truckBusTab.InternalSave();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToTruckBusTab();
        trafficWI.crashEntry.truckBusTab.verifyAtHazmatUNNoUsingUnitNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();
    }


 
    @Test (priority = 8,groups = { "CrashWI"})
    public void CrashEntryNarrativeTab_206135(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206135");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtCaseNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowAtCaseNo();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToNarrativeTab();
        trafficWI.crashEntry.crashEntryNarrativeTab.enterNarrativeComments();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        trafficWI.crashEntry.crashEntryNarrativeTab.verifyAcknowledgeUpdateNarrativeTab();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToNarrativeTab();
        trafficWI.crashEntry.crashEntryNarrativeTab.InternalSave();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCrashEntry();

    }



    @Test (priority = 9,groups = { "CrashWI"})
    public void CrashEntryCommentsTab_206136(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206136");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowByAtCrash();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToCommentsTab();
        trafficWI.crashEntry.crashEntryCommentsTab.verifyDateAsCurrentDate();
        trafficWI.crashEntry.crashEntryCommentsTab.enterAtSubject();
        trafficWI.crashEntry.crashEntryCommentsTab.clickEnterComments();
        trafficWI.switchToCrashComments();
        trafficWI.crashComments.enterRichText();
        trafficWI.crashComments.saveScreen();
        trafficWI.switchToCrashComments();
        trafficWI.crashComments.verifyAdditionSuccessful();
        trafficWI.crashComments.saveAndCloseScreen();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToCommentsTab();
        trafficWI.crashEntry.crashEntryCommentsTab.verifyAtPFCode(0);
        trafficWI.crashEntry.crashEntryCommentsTab.verifyAtSubject(0);
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
       popup.confirm.yes();
        trafficWI.switchToCrashEntry();
       
    }

  
    @Test (priority = 10,groups = { "CrashWI"})
    public void CrashEntryMapTab_206137(ITestContext testContext)
    {	
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206137");
      //  String getLatLongvalue = null;
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtCaseNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowByAtCrash();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.clickAddressInfoIcon();
        geo.switchToAddressSearchHelpWindow();
        geo.addressSearchHelp.SwitchToMapTab();
       // geo.addressSearchHelp.addressSearchHelpMapTab.GetLatLongvalue(Playback.getTestContextAttribute(getLatLongvalue));
        String readLatLong = geo.addressSearchHelp.addressSearchHelpMapTab.readLatLong();
        geo.switchToAddressSearchHelpWindow();
        geo.addressSearchHelp.CloseAddressSearchScreen(); 
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToMapTab();
        trafficWI.crashEntry.crashEntryMapTab.verifyAyCrashNoAppears();
        trafficWI.crashEntry.crashEntryMapTab.verifyAtActiveLatLong(readLatLong); 
       // trafficWI.crashEntry.crashEntryMapTab.clickResetButton(); // issue happened in PoliceMJAutomation DB
       // trafficWI.crashEntry.crashEntryMapTab.clickUpdateLatLongButton();
       // trafficWI.crashEntry.crashEntryMapTab.verifyGeoOverwriteConfirmMessage();
       // trafficWI.crashEntry.crashEntryMapTab.verifyUpdateLatLongConfirmMessage();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.save();
       popup.confirm.yes();
        trafficWI.switchToCrashEntry();

    }

   
    @Test (priority = 11,groups = { "CrashWI"})
    public void DeleteACrashReport_206138(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","206138");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.enterAtAddress();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.clickRowByAtCrash();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.clickDeleteIcon();
        trafficWI.crashEntry.verifyConfirmDelete();
       // trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.verifyAcknowledgeNoRecord();
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.clickReset();
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.selectApprovalStatusAsApproved();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.selectRow();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.verifyStatusAsApprovedAndColor();
        trafficWI.switchToCrashEntry();
    }


    @Test  (priority = 1,groups = { "CitationWI"})
    public void WITrafficCitationEntry_169544(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169544");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Entry");
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.selectAtCEType();
        trafficWI.citationEntry.enterDate();
        trafficWI.citationEntry.enterTime();
        trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
        trafficWI.citationEntry.verifyCitationNoDisabled();
        trafficWI.citationEntry.enterAtLastName();
        trafficWI.citationEntry.enterAtFirstName();
        names.switchToNameSearchHelpWindow();
        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickSaveButton();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.verifyOfficerRequiredAckMsg();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToOfficerTab();
        trafficWI.citationEntry.officerTab.tabOutOfficer();
       // trafficWI.citationEntry.officerTab.verifyOfficerAsPatrolOfficer();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickSaveButton();
        trafficWI.citationEntry.verifyAcknowledgeCharge();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToOffenseTab();
        trafficWI.citationEntry.offenseTab.enterAtCharge();
        trafficWI.citationEntry.offenseTab.enterAtStreetName();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToPlaintiffTab();
        trafficWI.citationEntry.plaintiffTab.selectPlaintiffTypeAsStateofWisconsin();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToAllTabs();
        trafficWI.switchToCitationEntry();
    }

    

    @Test  (priority = 2,groups = {"CitationWI"})
    public void WITrafficCitationEntryLicenseTab_169545(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169545");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCitationNo(0);
        trafficWI.citationSearch.verifyName(0);
        trafficWI.citationSearch.clickAtCitationNo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToLicenseTab();
        trafficWI.citationEntry.licenseTab.verifyAtDOB();
        trafficWI.citationEntry.licenseTab.verifyAtGender();
        trafficWI.citationEntry.licenseTab.verifyAtRace();
        trafficWI.citationEntry.licenseTab.verifyAtHeight();
        trafficWI.citationEntry.licenseTab.verifyAtWeight();
        trafficWI.citationEntry.licenseTab.verifyAtSSNo();
        trafficWI.citationEntry.licenseTab.verifyAtDrivierLicenseNo();
        trafficWI.switchToCitationEntry();
    }



    @Test (priority = 3,groups = {"CitationWI"})
    public void WITrafficCitationEntryVehicleTab_169546(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169546");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.citationSearch.SelectGrid();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToVehicleTab();
        trafficWI.citationEntry.citationEntryVehicleTab.enterAtVehicleNo();
        vehicle.switchToVehicleBoatSearchHelpWindow();
        vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToVehicleTab();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyVehicleInfoButton();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyAtLicensePlateType();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyAtIssueState();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyAtPlateExpirationYear();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyAtVehicleYear();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyAtVehicleMake();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyAtVehicleColor();
        trafficWI.citationEntry.citationEntryVehicleTab.verifyAtVinNo();
        trafficWI.switchToCitationEntry();
    }


 

    @Test (priority = 4,groups = {"CitationWI"})
    public void WITrafficCitationEntryOffenseTab_169547(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169547");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCitationNo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToOffenseTab();
         trafficWI.citationEntry.offenseTab.clearCharge();  //Action Updated 
        trafficWI.citationEntry.offenseTab.enterAtCharge();
//        traffic.switchToCitationArrest();
//        traffic.citationArrest.selectArmed();
//        traffic.citationArrest.saveCloseScren();
//        trafficWI.switchToCitationEntry();
//        trafficWI.citationEntry.switchToOffenseTab();
        trafficWI.citationEntry.offenseTab.clearStreetName();
        trafficWI.citationEntry.offenseTab.enterAtStreetName();
        trafficWI.citationEntry.offenseTab.selectAtHwyTypeAsCountyHighway();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.switchToCitationEntry();


    }

   
    
    @Test (priority = 5,groups = {"CitationWI"})
    public void WICitationEntry_169548(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169548");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
       trafficWI.citationSearch.selectAtCEType();        //UI Changed
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToPlaintiffTab();
        trafficWI.citationEntry.plaintiffTab.selectAtPlaintiffType();
        trafficWI.citationEntry.plaintiffTab.verifyCountyEnabled();
        trafficWI.citationEntry.plaintiffTab.enterAtCounty();
        trafficWI.citationEntry.plaintiffTab.verifyCityVillageTownEnabled();
        trafficWI.citationEntry.plaintiffTab.enterAtCityVillageTown();
        trafficWI.citationEntry.plaintiffTab.selectAtCourtType();
        trafficWI.citationEntry.plaintiffTab.selectWIPaymentMethod();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.switchToCitationEntry();
        //Traffic.citationEntry.plaintiffTab.verifyKPILable();     No need this verification for WI state
        //Traffic.citationEntry.plaintiffTab.selectCounty();
        //Traffic.citationEntry.plaintiffTab.verifyAtPliantiffType();
        //Traffic.citationEntry.plaintiffTab.verifyAtCityVillageTown();
        //Traffic.citationEntry.plaintiffTab.verifyAtCourtType();
        //Traffic.citationEntry.plaintiffTab.verifyAtCourt();
        //Traffic.citationEntry.plaintiffTab.verifyPaymentMethodTranProsOffGrayedOut();
    }


    @Test (priority = 6,groups = {"CitationWI"})
    public void WICitationEntry_169549(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169549");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToOfficerTab();
        trafficWI.citationEntry.officerTab.verifyAtOfficer();
        trafficWI.citationEntry.officerTab.selectHighWayCondition();
        trafficWI.citationEntry.officerTab.selectLightCondition();
        trafficWI.citationEntry.officerTab.selectWeatherCodition();
        trafficWI.citationEntry.officerTab.selectTrafficCondition();
        trafficWI.citationEntry.officerTab.selectNoOfLanes();
        trafficWI.citationEntry.officerTab.selectRoadCondition();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.switchToCitationEntry();
        //Traffic.citationEntry.officerTab.verifyAsOfficer();    // No need this for WI state
        //Traffic.citationEntry.officerTab.selectIssuingOfficer();
        //Traffic.citationEntry.officerTab.selectArea();
        //Traffic.citationEntry.officerTab.selectRoad();
        //Traffic.citationEntry.officerTab.selectTraffic();
        //Traffic.citationEntry.officerTab.selectVisibility();
        //Traffic.citationEntry.officerTab.selectNoOfLanes();
        //Traffic.citationEntry.officerTab.selectAccidentAsNo();
        //Traffic.citationEntry.officerTab.checkRadar();
        //Traffic.citationEntry.officerTab.selectEquipOperatorName();
        //Traffic.citationEntry.save();
        //Traffic.citationEntry.Yes();
        //Traffic.citationEntry.SwitchToOfficerTab();
        //Traffic.citationEntry.officerTab.verifyInfoExist();
    }

    
    
    @Test (priority = 7,groups = {"CitationWI"})
    public void WICitationEntry_169550(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169550");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCourtTab();
        trafficWI.citationEntry.courtTab.verifyGridAtOriginalCharge(0);
        trafficWI.citationEntry.courtTab.clickRowAtOriginalCharge();
        trafficWI.citationEntry.courtTab.verifyAtOriginalChrage();
        trafficWI.citationEntry.courtTab.enterCourtDateAsCurrentDate();
        trafficWI.citationEntry.courtTab.enterCourtDateAsCurrentTime();
        trafficWI.citationEntry.courtTab.enterAtDisposition();
        trafficWI.citationEntry.courtTab.enterFineAs200();
        trafficWI.citationEntry.courtTab.enterAtPenality();
        trafficWI.citationEntry.courtTab.selectMethod();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickSaveButton();
        trafficWI.citationEntry.courtTab.verifyAcknoledgeUpdateCourtTab();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCourtTab();
        trafficWI.citationEntry.courtTab.clickUpdateButton();
        trafficWI.citationEntry.courtTab.verifyAtDisposition(0);
        trafficWI.citationEntry.courtTab.verifyAtPenalty(0);
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.switchToCitationEntry();
    }


    
    
    @Test  (priority = 8,groups = {"CitationWI"})
    public void WICitationEntry_169551(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169551");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToPaymentTab();
        trafficWI.citationEntry.citationEntryPaymentsTab.enterDateAsCurrentDate();
        trafficWI.citationEntry.citationEntryPaymentsTab.enterPayment();
        trafficWI.citationEntry.citationEntryPaymentsTab.selectMethod();
        trafficWI.citationEntry.citationEntryPaymentsTab.enterReciptReference();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToPaymentTab();
        trafficWI.citationEntry.citationEntryPaymentsTab.verifyBalance();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCourtTab();
        trafficWI.citationEntry.courtTab.verifyBalance();
        trafficWI.switchToCitationEntry();
    }


    @Test (priority = 9,groups = {"CitationWI"})
    public void WITrafficCitationEntryNarrativeTab_169552(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169552");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToNarrativeTab();
        trafficWI.citationEntry.citationEntryNarrativeTab.enterGroupOfStrings();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickSaveButton();
        trafficWI.citationEntry.citationEntryNarrativeTab.verifyAcknowledgeUpdateNarrativeTab();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToNarrativeTab();
        trafficWI.citationEntry.citationEntryNarrativeTab.InternalSave();
        trafficWI.switchToCitationEntry();
    }



    @Test (priority =10,groups = {"CitationWI"})
    public void WITrafficCitationEntryWitnessTab_169553(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169553");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToWitnessTab();
        trafficWI.citationEntry.citationEntryWitnessTab.enterAtLastName();
        names.switchToNameSearchHelpWindow();
        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickSaveButton();
        trafficWI.citationEntry.citationEntryWitnessTab.verifyAcknowledgeUpdateWitnessTab();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToWitnessTab();
        trafficWI.citationEntry.citationEntryWitnessTab.clickAddButton();
        trafficWI.citationEntry.citationEntryWitnessTab.verifyNameAddedGrid();
        trafficWI.citationEntry.citationEntryWitnessTab.clickDeleteIconInGrid(0, 1);
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToWitnessTab();
        trafficWI.citationEntry.citationEntryWitnessTab.InternalSave();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToWitnessTab();
        trafficWI.citationEntry.citationEntryWitnessTab.verifyNameDeletedGrid();
        trafficWI.switchToCitationEntry();

    }


    @Test (priority =11,groups = {"CitationWI"})
    public void WITrafficCitationEntryCommentsTab_169554(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169554");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.verifyAtCENo(0);
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickCommentsTab();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToWitnessTab();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCommentsTab();
        trafficWI.citationEntry.citationEntryCommentsTab.verifyCurrentDate();
        trafficWI.citationEntry.citationEntryCommentsTab.enterSubject();
        trafficWI.citationEntry.citationEntryCommentsTab.clickEnterCommentsButton();
        trafficWI.switchToCitationEntry();
        trafficWI.switchToCitationComments();
        trafficWI.citationComments.enter100WordsRichText();
        trafficWI.citationComments.saveAndCloseScreen();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCommentsTab();
        trafficWI.citationEntry.citationEntryCommentsTab.clickDeleteIconInGrid(0, 1);
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.citationEntry.switchToCommentsTab();
        trafficWI.citationEntry.citationEntryCommentsTab.verifyDeletedCommentsNotFound();
        trafficWI.switchToCitationEntry();

    }

 
    @Test (priority = 12,groups = {"CitationWI"})
    
    public void VerifyCopyFunctionality_169555(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169555");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.clickClearButton();
        trafficWI.citationSearch.enterCENumberAtCENo();
        trafficWI.citationSearch.selectAtCEType();
        trafficWI.citationSearch.clickSearchButton();
        trafficWI.citationSearch.clickAtCENo();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.verifyAtCENo();
        trafficWI.citationEntry.clickCopyButton();
 //    trafficWI.citationEntry.verifyCENoFieldEmpty();   //App Not Supporting
        trafficWI.citationEntry.switchToOffenseTab();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickSaveButton();
        trafficWI.citationEntry.verify6515ChargeRequiredAckMsg();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToOffenseTab();
        trafficWI.citationEntry.offenseTab.enterAtCharge();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.citationEntry.verifyCENoFieldNotEmpty();
        trafficWI.switchToCitationEntry();

    }


    @Test (priority =13,groups = {"CitationWI"})
    public void WINonTrafficCitationEntry_169556(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169556");
        Browser.NavigateToLoginScreen();
        login.loginScreen.logonUsingTestContextOtherDB();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Entry");
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.selectAtCEType();
        trafficWI.citationEntry.enterDate();
        trafficWI.citationEntry.enterTime();
        trafficWI.citationEntry.verifyCurrentDate();
        trafficWI.citationEntry.enterAtLastName();
        trafficWI.citationEntry.enterAtFirstName();
        names.switchToNameSearchHelpWindow();
        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
       // trafficWI.citationEntry.selectName();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToViolationsTab();
        trafficWI.citationEntry.violationsTab.enterAtLocation();
        trafficWI.citationEntry.violationsTab.tabOutOfficer();
        trafficWI.citationEntry.violationsTab.enterAtCharge();
//        trafficWI.switchToCitationArrest();	
//        trafficWI.citationArrest.selectArmed();
//        trafficWI.citationArrest.saveCloseScren();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.clickSaveButton();
        trafficWI.citationEntry.violationsTab.verifyAcknowledgeViolationEntry();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToViolationsTab();
        trafficWI.citationEntry.violationsTab.clickAddButton();
        trafficWI.citationEntry.violationsTab.verifyViolationAddedGrid();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCourtTab();
        trafficWI.citationEntry.courtTab.verifyAtCharge(0);
        trafficWI.citationEntry.courtTab.clickRowAtCharge();
         trafficWI.citationEntry.courtTab.enterAtPenality();  //Action Updated
        trafficWI.citationEntry.courtTab.enterAtFine();
        trafficWI.citationEntry.courtTab.clickUpdateButton();
        trafficWI.citationEntry.courtTab.verifyAtPenalty(0);
        trafficWI.citationEntry.courtTab.verifyAtFineForfeiture(0);  //Action Updated
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        trafficWI.citationEntry.switchToNonTrafficAllTabs();
        trafficWI.switchToCitationEntry();

    }



    @Test 
    public void Police2017SprintTrafficModule_155963(ITestContext testContext)  //police MJ WI DB
    {
    	testContext.setAttribute("testID","155963");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.verifyAtCrash(0);
        trafficWI.crashSearch.verifyAtCaseNo(0);
        trafficWI.crashSearch.selectRowByAtCrash();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.verifyAtTracsRefNo();
        trafficWI.crashEntry.clickWitnessTab();
        trafficWI.crashEntry.witnessTab.verifyAtNameInGrid(0);
        trafficWI.crashEntry.witnessTab.enterAtNameID();
        trafficWI.crashEntry.clickSaveButton();
        trafficWI.crashEntry.verifyWIUpdateAcknowledgeMessageWitnessTab();
        trafficWI.crashEntry.clickWitnessTab();
        trafficWI.crashEntry.witnessTab.clickAddbutton();
        trafficWI.crashEntry.witnessTab.verifyAtName1InGrid(1);
        trafficWI.crashEntry.witnessTab.verifyAtPhoneInGrid(1);
        trafficWI.crashEntry.witnessTab.DeleteAtNameInGrid();
        trafficWI.crashEntry.save();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.clickWitnessTab();
        trafficWI.crashEntry.witnessTab.verifyDeletedRowCountInGrid(1);
        trafficWI.crashEntry.witnessTab.verifyAtName1InGrid(0);
    }

 
    @Test 
    public void Police2017SprintTrafficModule_158782(ITestContext testContext)
    {
    	testContext.setAttribute("testID","158782");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Deer Crash");
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.clickSave();
        trafficWI.deerCrash.verify1018RequiredEntriesAreMissingAckMsg();
        trafficWI.deerCrash.enterAtReportedLocation();
        trafficWI.deerCrash.enterAtDotNo();
        trafficWI.deerCrash.enterAtAccidentNo();
        trafficWI.deerCrash.enterAtOfficer();
        trafficWI.deerCrash.tabDateAndTime();
        trafficWI.deerCrash.clickSave();
        trafficWI.deerCrash.verify1018RequiredEntriesAreMissingAckMsg();
        trafficWI.deerCrash.clickAccidentTab();
        trafficWI.deerCrash.deerCrashAccidentTab.selectRandomFirstHarmfulEvent();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.deerCrashAccidentTab.selectAccidentLocation();
        trafficWI.deerCrash.deerCrashAccidentTab.selectRandomCounty();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.deerCrashAccidentTab.enterHwyNoAsNH();
        trafficWI.deerCrash.deerCrashAccidentTab.selectOnHwyType();
        trafficWI.deerCrash.deerCrashAccidentTab.selectFromHwyType();
        trafficWI.deerCrash.clickDriverTab();
        trafficWI.deerCrash.driverTab.selectDirectionofTravel();
        trafficWI.deerCrash.driverTab.selectSpeedLimit();
        trafficWI.deerCrash.driverTab.selectOnDutyAccident();
        trafficWI.deerCrash.driverTab.selectUnitStatus();
        trafficWI.deerCrash.driverTab.selectEjected();
        trafficWI.deerCrash.driverTab.selectUnitType();
        trafficWI.deerCrash.driverTab.enterAtLastName();
        trafficWI.deerCrash.driverTab.enterAtFirstName();
    //    NamesScripts.NamesTestContext = TrafficWITestContext;
        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.driverTab.selectOperatingDLClass();
        trafficWI.deerCrash.driverTab.selectOperatingDLEndrs();
        trafficWI.deerCrash.driverTab.selectInjurySeverity();
        trafficWI.deerCrash.driverTab.selectAirBag();
        trafficWI.deerCrash.driverTab.enterVehicle();
    ////    VehicleScripts.vehicleTestContext = TrafficWITestContext;
     vehicle.switchToVehicleBoatSearchHelpWindow();
   vehicle.vehicleBoatSearchHelpWindow.selectVehicle();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.driverTab.selectExtentofDamage();
        trafficWI.deerCrash.driverTab.selectVehicleDamage();
        trafficWI.deerCrash.saveScreen();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.verify1002AdditionalSuccessfulAckMsg();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.clickAllTabs();
        trafficWI.deerCrash.switchToNarrativeTab();
        trafficWI.deerCrash.deerCrashNarrativeTab.enterRichText();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.clickSave();
        trafficWI.deerCrash.verifyAcknoledgeUpdateNarrativeTab();
        trafficWI.deerCrash.switchToNarrativeTab();
        trafficWI.deerCrash.deerCrashNarrativeTab.saveInternalTab();
        trafficWI.switchToDeerCrash();
        trafficWI.deerCrash.saveScreen();
    }

 
    @Test 
    public void Police2017SprintTrafficModule_158783(ITestContext testContext)   //Police MJ 
    {
    	testContext.setAttribute("testID","158783");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
      //  login.loginScreen.clickCJISpolicyCheckBox();
     //   login.loginScreen.clickCJISpolicyOK();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Crash Search");
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.enterAtTracsRefNo();
        trafficWI.crashSearch.enterAtDOTNo();
        trafficWI.crashSearch.enterAtAccidentNo();
        trafficWI.crashSearch.selectCrashTypeAsDeerCrash();
        trafficWI.crashSearch.clickSearch();
        trafficWI.crashSearch.verifyAtCrash(0);
        trafficWI.crashSearch.verifyCrashTypeAsDInGrid(0);
        trafficWI.crashSearch.selectRowByAtCrash();
        trafficWI.switchToDeerCrashEntry();
        trafficWI.deerCrash.verifyAtTracsRefNo();
        trafficWI.deerCrash.clickDeleteIcon();
        trafficWI.deerCrash.verifyDeleteConfirmMrssage();
        trafficWI.switchToCrashSearch();
        trafficWI.crashSearch.verifyAcknowledgeNoRecord();


    }

 
    @Test
    public void Police2019TrafficModule_207326(ITestContext testContext)
    {
    	 String citationNo = null;
    	 
    	testContext.setAttribute("testID","207326");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Names");
        loader.navigateToScreen("Arrest Search");
      //  NamesScripts.NamesTestContext = TrafficWITestContext;
        names.switchToArrestSearch();
        names.arrestSearch.EnterAtCaseNo();
        names.arrestSearch.ClickClearDateButton();
        names.arrestSearch.EnterAtIncidentLocation();
        names.arrestSearch.ClickSearchButton();
        names.arrestSearch.VerifyAtNameInGrid(0);
        names.arrestSearch.VerifyAtCaseNoInGrid(0);
        names.arrestSearch.SelectAtArrestNoInGrid();
        names.switchToArrestEntry();
        names.arrestEntry.switchToChargeTab();
        names.arrestEntry.chargeTab.tabTheCaseNoEntries();
       // Names.ArrestEntry.chargeTab.verifyAtCaseNo();
        names.arrestEntry.chargeTab.tabTheArrestLocation();
        names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
        names.arrestEntry.chargeTab.ClickCitationAddbutton(); 
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.verifyAtCaseNo();
        trafficWI.citationEntry.verifyAtNameID();
        trafficWI.citationEntry.selectAtCEType();
        trafficWI.citationEntry.enterDate();
        trafficWI.citationEntry.enterTime();
        trafficWI.citationEntry.selectAtDefendantType();
        trafficWI.citationEntry.switchToOffenseTab();
        trafficWI.citationEntry.offenseTab.enterAtCharge();
        trafficWI.switchToCitationArrest();
        trafficWI.citationArrest.selectArmed();
        trafficWI.citationArrest.saveCloseScren();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToOffenseTab();
        trafficWI.citationEntry.offenseTab.enterAtStreetName();
        trafficWI.citationEntry.offenseTab.selectServedMethodAsMailed();
        trafficWI.citationEntry.offenseTab.selectAtHwyTypeAsCountyHighway();
        trafficWI.citationEntry.switchToOfficerTab();
        trafficWI.citationEntry.officerTab.tabOutOfficer();
        trafficWI.citationEntry.save();
        trafficWI.citationEntry.Yes();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.getCitationNo(citationNo);
        trafficWI.citationEntry.switchToWitnessTab();
        trafficWI.citationEntry.citationEntryWitnessTab.enterAtNameID();
        trafficWI.citationEntry.citationEntryWitnessTab.clickAddButton();
        trafficWI.citationEntry.citationEntryWitnessTab.verifyAtNameInGrid(0);
        trafficWI.citationEntry.citationEntryWitnessTab.InternalSave();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCommentsTab();
        trafficWI.citationEntry.citationEntryCommentsTab.enterSubject();
        trafficWI.citationEntry.citationEntryCommentsTab.clickEnterCommentsButton();
        trafficWI.switchToCitationComments();
        trafficWI.citationComments.enter100WordsRichText();
        trafficWI.citationComments.saveAndCloseScreen();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToCommentsTab();
        trafficWI.citationEntry.citationEntryCommentsTab.verifyCurrentDate();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.save();
        popup.confirm.yes();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.closeCitationEntryScreen();
        names.switchToArrestEntry();
        names.arrestEntry.switchToChargeTab();
        names.arrestEntry.chargeTab.VerifyCitationNo(Playback.getTestContextAttribute("citationNo"));
        names.arrestEntry.chargeTab.VerifyCitationNoInfoIconDisplayed(); 

    }


    @Test
    public void Police2019TrafficModule_207327(ITestContext testContext)
    {
    	testContext.setAttribute("testID","207327");
        String TracsRefNo = null;
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Records");
        loader.navigateToScreen("Case Search");
    ////    RecordsScripts.RecordsTestContext = TrafficWITestContext;
        records.switchToCaseSearch();
        records.caseSearch.enterAtCaseNo();
        records.switchToCaseUpdate();
        records.caseUpdate.ClickCrashIcon();  
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.verifyAtCaseNo();
        trafficWI.crashEntry.verifyAtReportedLocation();
        trafficWI.crashEntry.enterDOTNo();
        trafficWI.crashEntry.enterAccidentNo();
        trafficWI.crashEntry.enterAtOfficer();
        trafficWI.crashEntry.switchToMainTab();
        trafficWI.crashEntry.crashEntryMainTab.enterAtEMSNo();
        trafficWI.crashEntry.crashEntryMainTab.enterTotalKilled();
        trafficWI.crashEntry.crashEntryMainTab.enterTotalInjured();
        trafficWI.crashEntry.crashEntryMainTab.clickFireCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickTruckBusCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickTruckWith2Axles6TiresCheckBox();
        trafficWI.crashEntry.crashEntryMainTab.clickMedicalTransportCheckBox();
        trafficWI.crashEntry.saveScreen();
        trafficWI.switchToCrashEntry();
        trafficWI.crashEntry.switchToAllTab();
        trafficWI.crashEntry.getTracsRefNumber(Playback.getTestContextAttribute("TracsRefNo"));
        trafficWI.crashEntry.close();
        records.switchToCaseUpdate();
       // Records.caseUpdate.clickResetButton();
       // Records.SwitchToCaseUpdate();
        records.caseUpdate.VerifyCrashIconColorChange();
        records.caseUpdate.ClickCrashIcon();
        trafficWI.switchToCrashSearchHelpWindow();
       // RecordsScripts.RecordsTestContext = TrafficWITestContext;   
        trafficWI.crashSearchHelpWindow.verifyAtCaseNo(0);
        trafficWI.crashSearchHelpWindow.verifyCrashNoUsingCaseNo(TracsRefNo);

    }

  
    @Test 
    public void Police2019TrafficModule_207328(ITestContext testContext)
    {
    	testContext.setAttribute("testID","207328");
        String CENo = null;

        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Records");
        loader.navigateToScreen("Case Search");
      //  RecordsScripts.RecordsTestContext = TrafficWITestContext;
        records.switchToCaseSearch();
        records.caseSearch.enterAtCaseNo();
        records.switchToCaseUpdate();  
        records.caseUpdate.ClickCitationIcon();   
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.verifyAtCaseNo();
        trafficWI.citationEntry.verifyAtCallNo();
        trafficWI.citationEntry.selectAtCEType();
        trafficWI.citationEntry.enterDate();
        trafficWI.citationEntry.enterTime();
        trafficWI.citationEntry.enterAtNameID();
        trafficWI.citationEntry.switchToViolationsTab();
        trafficWI.citationEntry.violationsTab.enterAtLocation();
        trafficWI.citationEntry.violationsTab.tabOutOfficer();
        trafficWI.citationEntry.violationsTab.enterAtCharge();
        trafficWI.switchToCitationArrest();
        trafficWI.citationArrest.selectArmed();
        trafficWI.citationArrest.saveCloseScren();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToViolationsTab();
        trafficWI.citationEntry.violationsTab.verifyAtNIBRSWI();
        trafficWI.citationEntry.violationsTab.clickAddButton();
        trafficWI.citationEntry.violationsTab.verifyViolationAddedGrid();
        trafficWI.citationEntry.save();
        trafficWI.citationEntry.Yes();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.getCitationNo(Playback.getTestContextAttribute("citationNo"));
        trafficWI.citationEntry.getCENo(Playback.getTestContextAttribute("CENo"));
        trafficWI.citationEntry.closeCitationEntryScreen();
        records.switchToCaseUpdate();
        records.caseUpdate.clickResetButton();
        records.switchToCaseUpdate();
        records.caseUpdate.VerifyCitationIconColorChange();
        records.caseUpdate.ClickCitationIcon();  
        trafficWI.switchToCitationSearchHelpWindow();
        trafficWI.citationSearchHelpWindow.verifyAtCallNo(0);
      //  trafficWI.citationSearchHelpWindow.verifyCitationNoUsingCallNo(citationNo);  //issue reported
        trafficWI.citationSearchHelpWindow.verifyCENoUsingCallNo(CENo);

    }


    @Test 
    public void Police2019TrafficModule_214888(ITestContext testContext)
    {
    	testContext.setAttribute("testID","214888");
        String callYear = null;
        String callNo = null;
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Settings");
        loader.navigateToScreen("System Parameter");
        settings.switchToSystemParamter();
        settings.sysParameter.setSystemParameter2001AsNIBRS();
        settings.switchToSystemParamter();
        settings.sysParameter.setSystemparameter779AsFalse();
        objectIdentification.windowHandle.switchToMainWindow(); 
        loader.navigateToModule("Records");
        loader.navigateToScreen("Walk-In Entry");
       /// RecordsScripts.RecordsTestContext = TrafficWITestContext;
        records.switchToWalkInEntry();
        records.walkInEntry.enterAtCADCFS();
        records.walkInEntry.tabTheReportedDate();
        records.walkInEntry.enterAtLocation();
        records.walkInEntry.clickLocationVerifyCheckbox();
        records.walkInEntry.tabTheReceivedSource();
        records.walkInEntry.enterAtCADDispositon();
        records.walkInEntry.enterAtUnit();
        records.walkInEntry.save();
        records.switchToCaseUpdate();
        records.caseUpdate.GetCallNo(Playback.getTestContextAttribute(callYear), Playback.getTestContextAttribute("callNo"));
        records.caseUpdate.switchToAllTabs();            
        records.caseUpdate.saveScreen();
        records.switchToCaseUpdate();  
        objectIdentification.windowHandle.switchToMainWindow();
        loader.navigateToModule("Traffic");
        loader.navigateToScreen("Citation Search");
        trafficWI.switchToCitationSearch();
        trafficWI.citationSearch.clickAddNewButton();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.enterCallNo(callYear, callNo);
        trafficWI.citationEntry.selectAtCEType();
        trafficWI.citationEntry.enterAtNameID();
        trafficWI.citationEntry.switchToViolationsTab();
        trafficWI.citationEntry.violationsTab.enterAtLocation();
        trafficWI.citationEntry.violationsTab.tabOutOfficer();
        trafficWI.citationEntry.violationsTab.enterAtCharge();
        trafficWI.switchToCitationArrest();
        trafficWI.citationArrest.selectArmed();
        trafficWI.citationArrest.saveCloseScren();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.switchToViolationsTab();
        trafficWI.citationEntry.violationsTab.verifyAtNIBRSWI();
        trafficWI.citationEntry.violationsTab.clickAddButton();
        trafficWI.citationEntry.violationsTab.verifyAtChargeInTheGrid(0);
        trafficWI.citationEntry.save();
        trafficWI.citationEntry.Yes();
        trafficWI.switchToCitationEntry();
        trafficWI.citationEntry.closeCitationEntryScreen();
        records.switchToCaseUpdate();
        records.caseUpdate.saveScreen();
        records.switchToCaseUpdate();
        records.caseUpdate.VerifyNIBRSCheckTabAppearsRedColor();
        records.caseUpdate.switchToNIBRSCheckTab();
        records.caseUpdate.nIBRSCheckTab.VerifyCFSEntryTypeBError(0);   

    }
    
    
    @Test(groups={"2020DefectTestCases"})
    public void PoliceDefect2020_246249(ITestContext testContext)
    {
  	  
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
  	  	testContext.setAttribute("testID","246249");
  	  	Browser.NavigateToLoginScreen();
  	  	login.loginScreen.Logon();
  		loader.navigateToModule("Records");
  		loader.navigateToScreen("Case Search");
  		records.switchToCaseSearch();
  		records.caseSearch.enterAtCaseNo();
  		records.switchToCaseUpdate();
  		records.caseUpdate.clickCaseDataTab();
  		records.caseUpdate.caseUpdateCaseDataTab.enterAtCharge();
  		records.caseUpdate.caseUpdateCaseDataTab.clickCFSAddButton();
  		records.switchToFTC();
  		records.fTC.selectAttemptedCompletedAsCompleted();
  		records.fTC.selectAtNIBRS();
  		records.fTC.selectAtCrimeAgainst();
  		records.fTC.selectAtPropertyLoss();
  		records.fTC.selectAtLocationType();
  		records.fTC.selectAtSuspectedOfUsing();
  		records.fTC.SelectWeaponsUsedAsOther();
  		records.fTC.saveNClose();
  		records.switchToCaseUpdate();
  		records.caseUpdate.clickCaseDataTab();
  		records.caseUpdate.caseUpdateCaseDataTab.tabOccurredAtDateTime();
  		records.caseUpdate.caseUpdateCaseDataTab.selectPoliceForceUsedAsNone();
  		records.caseUpdate.caseUpdateCaseDataTab.SelectDomesticViolenceAsYes();
  		records.caseUpdate.caseUpdateCaseDataTab.saveInternalTab();
  		records.switchToCaseUpdate();
  		records.caseUpdate.SaveNClose();
  		
  		loader.navigateToModule("Names");
          loader.navigateToScreen("Arrest Entry");

          names.switchToArrestEntry();
          names.arrestEntry.enterAtNameID();
          names.arrestEntry.switchToArrestTab();
          names.arrestEntry.arrestTab.enterAtCaseNo();
          names.arrestEntry.arrestTab.selectAtHow();
          names.arrestEntry.arrestTab.selectArmed();
           
          names.arrestEntry.arrestTab.tabTheBookingDateAndTime();

          names.arrestEntry.switchToChargeTab();
          names.arrestEntry.chargeTab.tabTheCaseNoEntries();
          names.arrestEntry.chargeTab.tabTheArrestLocation();
          names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
          names.arrestEntry.chargeTab.enterAtCharge();
          names.arrestEntry.chargeTab.selectAtStatus();
          names.arrestEntry.chargeTab.ClickCitationAddbutton();
          trafficWI.switchToCitationArrest();
          trafficWI.citationArrest.selectArmed();
          trafficWI.citationArrest.saveCloseScren();
          trafficWI.switchToCitationEntry();
          trafficWI.citationEntry.selectAtCEType();
          trafficWI.citationEntry.verifyAtCaseNo();
          trafficWI.citationEntry.violationsTab.clickAddButton();
          trafficWI.citationEntry.save();
          names.switchToArrestEntry();
          names.arrestEntry.switchToChargeTab();
          names.arrestEntry.chargeTab.clickTheAddButton();
          names.arrestEntry.saveScreen();
          names.switchToArrestEntry();
            
    }
    
    
    @Test(groups={"2020DefectTestCases"})
    public void PoliceDefect2020_246250(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
  	 	testContext.setAttribute("testID","246250");
  	  	Browser.NavigateToLoginScreen();
  	  	login.loginScreen.Logon();
  	  	loader.navigateToModule("Records");
  		loader.navigateToScreen("Case Search");
  		records.switchToCaseSearch();
  		records.caseSearch.enterAtCaseNo();
  		records.switchToCaseUpdate();
  		records.caseUpdate.clickCaseDataTab();
  		records.caseUpdate.caseUpdateCaseDataTab.enterAtCharge();
  		records.caseUpdate.caseUpdateCaseDataTab.clickCFSAddButton();
  		records.switchToFTC();
  		records.fTC.selectAttemptedCompletedAsCompleted();
  		records.fTC.selectAtNIBRS();
  		records.fTC.selectAtCrimeAgainst();
  		records.fTC.selectAtPropertyLoss();
  		records.fTC.selectAtLocationType();
  		records.fTC.selectAtSuspectedOfUsing();
  		records.fTC.SelectWeaponsUsedAsOther();
  		records.fTC.saveNClose();
  		records.switchToCaseUpdate();
  		records.caseUpdate.clickCaseDataTab();
  		records.caseUpdate.caseUpdateCaseDataTab.tabOccurredAtDateTime();
  		records.caseUpdate.caseUpdateCaseDataTab.selectPoliceForceUsedAsNone();
  		records.caseUpdate.caseUpdateCaseDataTab.SelectDomesticViolenceAsYes();
  		records.caseUpdate.caseUpdateCaseDataTab.saveInternalTab();
  		records.switchToCaseUpdate();
  		records.caseUpdate.SaveNClose();
  		
  		loader.navigateToModule("Traffic");
          loader.navigateToScreen("Citation Entry");
          trafficWI.switchToCitationEntry(); 
          trafficWI.citationEntry.enterAtCaseNo(); 
          trafficWI.citationEntry.verifyCitationNoDisabled();
          trafficWI.citationEntry.selectAtCEType();
         trafficWI.citationEntry.enterAtNameID();
         trafficWI.citationEntry.violationsTab.enterAtCharge();
         trafficWI.switchToCitationArrest();
         trafficWI.citationArrest.selectArmed();
         trafficWI.citationArrest.saveCloseScren();
        
          trafficWI.switchToCitationEntry();
          trafficWI.citationEntry.violationsTab.verifyAtNIBRSWI();
          trafficWI.citationEntry.violationsTab.clickAddButton();
          trafficWI.citationEntry.violationsTab.enterAtCharge1();
          trafficWI.switchToCitationArrest();
          trafficWI.citationArrest.selectArmed();
          trafficWI.citationArrest.saveCloseScren();
         
          trafficWI.switchToCitationEntry();
          trafficWI.citationEntry.violationsTab.verifyNIBRS1();
          trafficWI.citationEntry.violationsTab.clickAddButton();
          trafficWI.citationEntry.save();
          trafficWI.switchToCitationEntry();
    }
  	 
	  @Test(groups={"2020DefectTestCases"}) // Vijay
	public void VerifyThePlateFieldFromTheSearchWindow_250118(ITestContext testContext) {
		testContext.setAttribute("testID", "250118");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Parking Entry");
		traffic.switchToParkingEntry();
		traffic.parkingEntry.entercurrentValidationDate();
		traffic.parkingEntry.enterCurrentValidationTime();
		traffic.parkingEntry.enterAtTicketNo();
		traffic.parkingEntry.parkingEntryMainTab.enterAtOfficer();
		traffic.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
		traffic.parkingEntry.parkingEntryMainTab.TabOutStateEdit();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.parkingEntryMainTab.enterAtViolation();
		popup.acknowledge.ok();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.parkingEntryMainTab.enterAtLocation();
		traffic.parkingEntry.switchToFineNoticesTab();
		traffic.parkingEntry.fineNoticesTab.enterInitialAmount();
		traffic.parkingEntry.savetheScreen();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.closeParkingEntryScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Parking Search");
		traffic.switchToParkingSearch();
		traffic.parkingSearch.enterAtOfficer();
		traffic.parkingSearch.enterAtTicketNo();
		traffic.parkingSearch.clickSearchButton();
		traffic.parkingSearch.selectRowByAtTicketNo();
		traffic.switchToParkingEntry();
		traffic.parkingEntry.parkingEntryMainTab.EnterAtPlate1();
		traffic.parkingEntry.parkingEntryMainTab.TabOutStateEdit();
		vehicle.switchToVehicleBoatSearchHelpWindow();
		vehicle.vehicleBoatSearchHelpWindow.selectCheckBoxByPlate();
		vehicle.vehicleBoatSearchHelpWindow.ClickRefreshButton();
		vehicle.vehicleBoatSearchHelpWindow.ClickBackButton();
		vehicle.vehicleBoatSearchHelpWindow.ClickResetButton();
	}
   

    
    @Test(groups={"2020DefectTestCases"})  //Automated by Stalin
	public void CalllinkfieldinCrashentry_257681(ITestContext testContext) {
    	
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257681");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Crash Entry");
		trafficWI.switchToCrashEntryScreen();
		trafficWI.crashEntry.enterAtCaseNo();
		trafficWI.crashEntry.verifyAtCallNo();
		trafficWI.crashEntry.verifyAtReportedLocation();
		trafficWI.crashEntry.enterAtOfficer();
		trafficWI.crashEntry.saveScreen();
		trafficWI.crashEntry.verify1002AdditionSuccessfulAcwkMsg();
		trafficWI.switchToCrashEntryScreen();
		trafficWI.crashEntry.clickCallNoInfoIcon();
		records.switchToCallEntry();
		records.callEntry.verifyAtCallNo();
		records.callEntry.closeScreen();
		traffic.switchToCrashEntryScreen();
		// 2nd Scenario
		loader.navigateToScreen("Deer Crash");
		trafficWI.switchToDeerCrash();
		trafficWI.deerCrash.enterAtCaseNo();
		trafficWI.deerCrash.verifyAtCallNo();
		trafficWI.deerCrash.verifyAtReportedLocation();
		trafficWI.deerCrash.enterAtOfficer();
		trafficWI.deerCrash.clickDriverTab();
		trafficWI.deerCrash.driverTab.enterAtNameID();
		trafficWI.deerCrash.saveScreen();
		trafficWI.deerCrash.verify1002AdditionSuccessfulAcwkMsg();
		trafficWI.switchToDeerCrash();
		trafficWI.deerCrash.clickCallNoInfoIcon();
		records.switchToCallEntry();
		records.callEntry.verifyAtCallNo();

	}


	@Test(groups={"2020DefectTestCases"}) //Automated by Stalin
	public void PaymentTab_258299(ITestContext testContext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "258299");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		trafficWI.switchToCitationSearch();
		trafficWI.citationSearch.clickClearButton();
		trafficWI.citationSearch.enterAtLastName();
		trafficWI.citationSearch.enterAtFirstName();
		trafficWI.citationSearch.enterCENumberAtCENo();
		trafficWI.citationSearch.clickSearchButton();
		trafficWI.citationSearch.selectAtCENoInGrid();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToPaymentTab();
		trafficWI.citationEntry.citationEntryPaymentsTab.enterDateAsCurrentDate();
		trafficWI.citationEntry.citationEntryPaymentsTab.enterAtPayment();
		trafficWI.citationEntry.citationEntryPaymentsTab.selectAtMethod();
		trafficWI.switchToPaymentMethodScreen();
		trafficWI.paymentMethodScreen.selectAtType();
		trafficWI.paymentMethodScreen.enterAtCreditCardNo();
		trafficWI.paymentMethodScreen.enterAtHolderName();
		trafficWI.paymentMethodScreen.selectAtExpiration();
		trafficWI.paymentMethodScreen.enterAtBank();
		trafficWI.paymentMethodScreen.saveNClose();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.save();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToPaymentTab();
		trafficWI.citationEntry.citationEntryPaymentsTab.verifyAtMethodInTable();

	}
   
	
	@Test(groups={"2020DefectTestCases"})  // Vijay
	public void callRelatedNamesNotDisplayingInNameSearchHelpWindowFromNameControl_256436(ITestContext testcontext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "256436");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Entry");
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.enterAtCallNo();
		trafficWI.citationEntry.selectCETypeAsTrafficViolation();
		trafficWI.citationEntry.enterAtLastName();
		trafficWI.citationEntry.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToOffenseTab();
		trafficWI.citationEntry.offenseTab.enterAtCharge();
		trafficWI.switchToCitationArrest();
		trafficWI.citationArrest.selectAgencyActionAsHandledWithintheDepartment();
		trafficWI.citationArrest.selectArmed();
		trafficWI.citationArrest.saveCloseScren();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToOffenseTab();
		trafficWI.citationEntry.offenseTab.enterAtStreet();
		trafficWI.citationEntry.switchToOfficerTab();
		trafficWI.citationEntry.officerTab.enterAtPFCode();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
		trafficWI.citationEntry.saveandCloseTheScreen();
		objectIdentification.windowHandle.switchToMainWindow();
		loader.navigateToScreen("Citation Entry");
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.enterAtCallNo();
		trafficWI.citationEntry.selectCETypeAsTrafficViolation();
		trafficWI.citationEntry.enterAtLastName1();
		trafficWI.citationEntry.enterAtFirstName1();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastName1AndFirstName1();
		names.nameSearchHelpWindow.VerifyJuvinalNameConfirmMessage();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToOffenseTab();
		trafficWI.citationEntry.offenseTab.enterAtCharge();
		trafficWI.switchToCitationArrest();
		trafficWI.citationArrest.selectArmed();
		trafficWI.citationArrest.saveCloseScren();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToOffenseTab();
		trafficWI.citationEntry.offenseTab.enterAtStreet();
		trafficWI.citationEntry.switchToOfficerTab();
		trafficWI.citationEntry.officerTab.enterAtPFCode();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
		trafficWI.citationEntry.saveandCloseTheScreen();
	}
	
	
	  @Test(groups={"2020DefectTestCases"})  //Q4 Sprint 5 Automated by Mahesha 
  	  public void VerifyNIBRSValueBindAttheFirstTimeForTheChargeAdded_261089(ITestContext testContext)
  	  {
		  
		  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
  		  testContext.setAttribute("testID", "261089");
  	      Browser.NavigateToLoginScreen();
  	      login.loginScreen.Logon();
  	      loader.navigateToModule("Traffic");
  	      loader.navigateToScreen("Citation Entry");
	      traffic.switchToCitationEntry();
	      trafficWI.citationEntry.selectAtCEType();
	      trafficWI.citationEntry.tabAtDateAndTime();
	      trafficWI.citationEntry.verifyNameFieldMandotory();
	      trafficWI.citationEntry.enterAtNameID();
	      trafficWI.citationEntry.switchToViolationsTab();
	      trafficWI.citationEntry.violationsTab.enterAtLocation();
	      trafficWI.citationEntry.violationsTab.verifyLocationInfoIconDisplayed();
	      trafficWI.citationEntry.violationsTab.tabOutOfficer();
	      trafficWI.citationEntry.violationsTab.verifyAtPFInOfficeField();
	      trafficWI.citationEntry.violationsTab.enterAtCharge();
	      trafficWI.citationEntry.violationsTab.verifyAtChargeDescription();
	      trafficWI.citationEntry.violationsTab.verifyAtNIBRSWI();
	      trafficWI.citationEntry.violationsTab.clickAddButton();
	      trafficWI.citationEntry.violationsTab.verifyViolationAddedGrid();
	      trafficWI.citationEntry.violationsTab.verifyAtChargeInTheGrid(0);
	      trafficWI.citationEntry.violationsTab.clickRowInGrid(0);
	      trafficWI.citationEntry.violationsTab.verifyAtNIBRSWI();
	      trafficWI.citationEntry.violationsTab.verifyAtChargeDescription();
	      trafficWI.citationEntry.violationsTab.clickAddButton();
	      trafficWI.citationEntry.save();
	      trafficWI.switchToCitationEntry();
	      trafficWI.citationEntry.VerifyAdditionSuccessfulMessage();
  	  }

	  @Test(groups={"2020DefectTestCases"})  //Automated by Stalin 
		public void Tabkeyfunctioanlityworking(ITestContext testContext) throws AWTException{
		  
		  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "260393");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Citation Search");
			trafficWI.switchToCitationSearch();
			trafficWI.citationSearch.clickClearButton();
			trafficWI.citationSearch.enterAtLastName(); // updated
			trafficWI.citationSearch.enterAtFirstName(); // updated
			trafficWI.citationSearch.pressShiftNTabFunction();
			trafficWI.citationSearch.verifyAtFirstName();
			trafficWI.citationSearch.enterAtNIBRS();
			trafficWI.citationSearch.clickSearchButton();
			trafficWI.citationSearch.verifyAtName();

		}
	  
	  
	  @Test(groups={"2021DefectTestCases"})  //Automated byMahesh
		public void ToVerifyNewAddedfieldSuchasMiddleNameandDOBInCitationSearchScreen_272361(ITestContext testContext)  {
		  
		  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "272361");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Citation Search");
			trafficWI.switchToCitationSearch();
			trafficWI.citationSearch.clickClearButton();
			trafficWI.citationSearch.enterAtMiddleName();
			trafficWI.citationSearch.clickSearchButton();
			trafficWI.citationSearch.selectAtCENoInGrid();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.verifyAtMiddleName();
			trafficWI.citationEntry.closeCitationEntryScreen();
			
			trafficWI.switchToCitationSearch();
			trafficWI.citationSearch.clickBackButton();
			trafficWI.citationSearch.clearMiddleName();
			trafficWI.citationSearch.enterATDOB();
			trafficWI.citationSearch.clickSearchButton();
			trafficWI.citationSearch.selectAtCENoInGrid();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.clickNameInfoButton();
			
			names.switchToNameEntry();
			names.nameEntry.switchToMainTab();
			names.nameEntry.nameEntryMainTab.VerifyAtDOB();
			
	  }

	  
	  @Test(groups={"2021DefectTestCases"}) //2021 Automated by Mahesha
	    public void ParkingBalanceisNolongerCumulative_272376(ITestContext testContext)
	    {
		  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    	testContext.setAttribute("testID","272376");
	        Browser.NavigateToLoginScreen();
	        login.loginScreen.Logon();
	        loader.navigateToModule("Traffic");
	        loader.navigateToScreen("Parking Entry");

	        trafficWI.switchToParkingEntry();
	        trafficWI.parkingEntry.verifyStatusAsIssued();
	        trafficWI.parkingEntry.verifyStatusInYellowColor();
	        trafficWI.parkingEntry.entercurrentValidationDate();
	        trafficWI.parkingEntry.enterCurrentValidationTime();
	        trafficWI.parkingEntry.verifyCurrentDate();
	        trafficWI.parkingEntry.enterIssueDate();
	        trafficWI.parkingEntry.verifyIssueDate();
	        trafficWI.parkingEntry.enterAtCallNo();
	        trafficWI.parkingEntry.enterAtTicketNo();
	        trafficWI.parkingEntry.clickDefandant1Tab();
	        trafficWI.parkingEntry.defendant1.enterAtNameID();
	        trafficWI.parkingEntry.switchToMainTab();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtOfficer();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateState();
	        vehicle.switchToVehicleBoatEntry();
	        vehicle.vehicleBoatEntry.clickSelectButton();
	        trafficWI.switchToParkingEntry();
	        trafficWI.parkingEntry.switchToMainTab();
	        trafficWI.parkingEntry.parkingEntryMainTab.verifyAtLocation();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtViolation();
	        trafficWI.parkingEntry.verifyCitationAmountNotSpecifiedAcknowledgeMessage(); 
	        trafficWI.switchToParkingEntry();
	         trafficWI.parkingEntry.switchToFineNoticesTab();
	         trafficWI.parkingEntry.fineNoticesTab.enterAtInitialAmount();
	        trafficWI.parkingEntry.saveandClosetheScreen();
	        
	        loader.navigateToScreen("Parking Entry");

	        trafficWI.switchToParkingEntry();
	        trafficWI.parkingEntry.verifyStatusAsIssued();
	        
	        trafficWI.parkingEntry.entercurrentValidationDate();
	        trafficWI.parkingEntry.enterCurrentValidationTime();
	        trafficWI.parkingEntry.verifyCurrentDate();
	        trafficWI.parkingEntry.enterIssueDate();
	        
	        trafficWI.parkingEntry.enterAtCallNo();
	        trafficWI.parkingEntry.enterAtTicketNo1();
	        trafficWI.parkingEntry.clickDefandant1Tab();
	        trafficWI.parkingEntry.defendant1.enterAtNameID();
	        trafficWI.parkingEntry.switchToMainTab();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtOfficer();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateState();
	        vehicle.switchToVehicleBoatEntry();
	        vehicle.vehicleBoatEntry.clickSelectButton();
	        trafficWI.switchToParkingEntry();
	        trafficWI.parkingEntry.switchToMainTab();
	        trafficWI.parkingEntry.parkingEntryMainTab.verifyAtLocation();
	        trafficWI.parkingEntry.parkingEntryMainTab.enterAtViolation();
	        trafficWI.parkingEntry.verifyCitationAmountNotSpecifiedAcknowledgeMessage(); 
	        trafficWI.switchToParkingEntry();
	         trafficWI.parkingEntry.switchToFineNoticesTab();
	         trafficWI.parkingEntry.fineNoticesTab.enterAtInitialAmount1();
	        trafficWI.parkingEntry.saveandClosetheScreen();
	        
	        
	        loader.navigateToScreen("Parking Search");
	        trafficWI.switchToParkingSearch();
	        trafficWI.parkingSearch.enterAtNameID();
	        trafficWI.parkingSearch.clickSearchButton();
	       
	        trafficWI.parkingSearch.verifyAtStatus(0);
	        trafficWI.parkingSearch.verifyAtStatus(1);
	        trafficWI.parkingSearch.verifyAtBalance(0);
	        trafficWI.parkingSearch.verifyAtBalance(1);
	        
	    }
	  
	  @Test(groups={"2021DefectTestCases"})  //Automated by Stalin 2021 Q1 Sprint4
		public void VerifyCrashRecordsShownCaseinCrashSearch_265273(ITestContext testContext) {
		  
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "265273");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Settings");
			loader.navigateToScreen("System Parameter");
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemParameter836AsTrue();
			settings.switchToSystemParamter();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Crash Entry");
			trafficWI.switchToCrashEntryScreen();
			trafficWI.crashEntry.enterAtCaseNo();
			trafficWI.crashEntry.clickOfficerLookUpIcon();
			popup.switchToCodedSearch();
			popup.kPICodedLookup.enterAtCode();
			popup.kPICodedLookup.clickSearchIcon();
			popup.kPICodedLookup.selectAtPFCode();
			trafficWI.switchToCrashEntryScreen();
			trafficWI.crashEntry.saveScreen();
			trafficWI.crashEntry.verify1002AdditionSuccessfulAcwkMsg();
			trafficWI.switchToCrashEntryScreen();
			trafficWI.crashEntry.switchToMainTab();
			trafficWI.crashEntry.crashEntryMainTab.enterAtTotalUnit();
			trafficWI.switchToCrashEntryScreen();
			trafficWI.crashEntry.saveScreen();
			trafficWI.crashEntry.verify1003UpdateSuccessfulAcknowledgeMessage();
			trafficWI.switchToCrashEntryScreen();
			trafficWI.crashEntry.clickCaseInfo();
			records.switchToCaseUpdate();
			records.caseUpdate.clickReportingTab();
			records.caseUpdate.reportingTab.selectRowByAtType();
			records.switchToReportStatus();
			records.reportStatus.clickCrashButton();
			trafficWI.switchToCrashSearchHelpWindow();
			trafficWI.crashSearchHelpWindow.verifyAtCaseNo(0);
			trafficWI.crashSearchHelpWindow.closeTheScreen();
			records.switchToReportStatus();
			records.reportStatus.close();
			records.switchToCaseUpdate();
			records.caseUpdate.closeTheScreen();
			loader.navigateToModule("Settings");
			loader.navigateToScreen("System Parameter");
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter836AsFalse();
			settings.switchToSystemParamter();
		}
//Testcase ID – 272364
@Test(groups={"2021DefectTestCases"})  //Automated by Stalin Q2 S3 run in 45
	public void ToverifycommentstabfromCitationEntry_272364(ITestContext testContext)
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272364");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Search");
		trafficWI.switchToCitationSearch();
		trafficWI.citationSearch.clickClearButton();
		trafficWI.citationSearch.enterAtCallNo();;
		trafficWI.citationSearch.clickSearchButton();
		trafficWI.citationSearch.clickAtCitationNo();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToCommentsTab();
		trafficWI.citationEntry.citationEntryCommentsTab.enterAtSubject();
		trafficWI.citationEntry.citationEntryCommentsTab.clickEnterCommentsButton();
		trafficWI.switchToCitationComments();
		trafficWI.citationComments.enter100WordsRichText();
		trafficWI.citationComments.saveAndCloseScreen();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToCommentsTab();
		trafficWI.citationEntry.citationEntryCommentsTab.verifyAtSubjectInGrid();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToWitnessTab();
		trafficWI.switchToCitationEntry();
		Playback.pageLoadThreadWait();
		trafficWI.citationEntry.switchToCommentsTab();
		trafficWI.citationEntry.citationEntryCommentsTab.verifyAtSubjectInGrid();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.closeCitationEntryScreen();
		trafficWI.switchToCitationSearch();
		trafficWI.citationSearch.clickAtCitationNo();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToCommentsTab();
		trafficWI.citationEntry.citationEntryCommentsTab.verifyAtSubjectInGrid();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.verifyCommentsTabAsBlueColor();
		
	}
//Testcase ID – 272371
@Test(groups={"2021DefectTestCases"})  //Automated by Stalin Q2 S3 run in 45
	public void ResetthescreenwithouterrorafteraddingonnarrativeTab_272371(ITestContext testContext)
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "272371");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Entry");
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.selectAtCEType();
		trafficWI.citationEntry.tabAtDateAndTime();
		trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
		trafficWI.citationEntry.enterAtNameID();
		trafficWI.citationEntry.switchToOffenseTab();
		trafficWI.citationEntry.offenseTab.enterAtCharge();
		trafficWI.switchToCitationArrest(); 
		trafficWI.citationArrest.enterDateAsCurrentDate();
		trafficWI.citationArrest.selectTypeOfArrestAsOnViewArrest();
		trafficWI.citationArrest.selectArmed();
		trafficWI.citationArrest.saveCloseScren();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToOffenseTab();
		trafficWI.citationEntry.offenseTab.enterAtStreetName();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToOfficerTab();
		trafficWI.citationEntry.officerTab.tabOutOfficer();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.save();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToNarrativeTab();
		trafficWI.citationEntry.citationEntryNarrativeTab.clickAddNew();
		home.switchToTextMgmtScreen();
		home.textMgmt.EnterAtTextName();
		home.textMgmt.SaveAndCloseScreen();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToNarrativeTab();
		trafficWI.citationEntry.citationEntryNarrativeTab.InternalSave();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.clickResetButton();
		trafficWI.citationEntry.verifyNarrativeTabNotAvailable();
		trafficWI.switchToCitationEntry();
	}


	  @Test(groups={"2021DefectTestCases"})  //2021 defect Mahesha
      public void SecondParkingPermitShoulNotUpdatedInVehicleEntryactivity_272377(ITestContext testContext)
      {
		  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "272377");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Parking Permits");

			traffic.switchToParkingPermit();
			traffic.parkingPermits.enterAtPlateNo();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.clickSelectButton();
			traffic.switchToParkingPermit();

			traffic.parkingPermits.enterAtLastName();
			traffic.parkingPermits.enterAtFirstName();
			traffic.parkingPermits.selectNameFromHelpWindow();
			traffic.switchToParkingPermit();
			traffic.parkingPermits.selectActionAsPermit();
			traffic.parkingPermits.selectAtPermitType();
			traffic.parkingPermits.tabOutActionDate();
			traffic.parkingPermits.verifyPermitLocationMandatory();
			traffic.parkingPermits.enterAtPermitLocation();
			traffic.parkingPermits.selectReason();
			traffic.parkingPermits.tabOutValidExtendDate();
			traffic.parkingPermits.enterToDateAsNextDayFromcurrentDate();
			traffic.parkingPermits.verfiyExpireDateAsFuturDateNoOfdays(2);
			traffic.parkingPermits.clickAddButton();
			traffic.parkingPermits.save();
			traffic.switchToParkingPermit();
			String permitNo = traffic.parkingPermits.readPermitNoFromGrid(0);

			traffic.parkingPermits.clickPlateInfoIcon();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.clickMainTab();
			vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAssociationAsPermit(0);
			vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAssocNoinGrid(permitNo, 0);
			vehicle.vehicleBoatEntry.closeScreen();

			traffic.switchToParkingPermit();
			traffic.parkingPermits.clickNameClearOperatorIcon();
			traffic.parkingPermits.enterAtLastName1();
			traffic.parkingPermits.enterAtFirstName1();
			traffic.parkingPermits.selectNameFromHelpWindow();
			traffic.switchToParkingPermit();
			traffic.parkingPermits.selectActionAsPermit();
			traffic.parkingPermits.SelectPermitType();
			traffic.parkingPermits.tabOutActionDate();
			traffic.parkingPermits.verifyPermitLocationMandatory();
			traffic.parkingPermits.enterAtPermitLocation1();
			traffic.parkingPermits.selectReason();
			traffic.parkingPermits.tabOutValidExtendDate();
			traffic.parkingPermits.enterToDateAsNextDayFromcurrentDate();
			traffic.parkingPermits.verfiyExpireDateAsFuturDateNoOfdays(2);
			traffic.parkingPermits.clickAddButton();
			traffic.parkingPermits.save();
			traffic.switchToParkingPermit();

			traffic.parkingPermits.clickPlateInfoIcon();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.clickMainTab();
			vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAssociationAsPermit(0);
			vehicle.vehicleBoatEntry.vehicleBoatEntryMainTab.verifyAssocNoinGrid(permitNo, 0);
  
      }
	  
	  @Test(groups={"2021DefectTestCases"})  //Automated by Stalin Q2 S6
		public void Verifynewrolepermission3886forPaymentstab_275945(ITestContext testContext)
		{
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "275945");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContextOtherDB();
			loader.navigateToModule("Settings");
			loader.navigateToScreen("Roles");
			settings.switchToRolesScreen();
			settings.roles.clickSearch();
			settings.roles.selectRowAtRoleName();
			settings.switchToRolesEntry();
			settings.rolesEntry.enterAtScreenID();
			settings.rolesEntry.clickSearchButton(); 
			settings.rolesEntry.clickTrafficEditPermissionButton();
			settings.rolesEntry.switchToRolesEntryScreenPermissionWindow();
			settings.rolesEntry.rolesEntryPermissionWindow.clickSelectAllCheckBox();
			settings.rolesEntry.rolesEntryPermissionWindow.clickSave();
			settings.rolesEntry.switchToRolesEntryScreenPermissionWindow();
			settings.rolesEntry.rolesEntryPermissionWindow.closeScreen();
			settings.switchToRolesEntry();
			settings.rolesEntry.close();
			settings.switchToRolesScreen();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Parking Entry");
			trafficWI.switchToParkingEntry();
			trafficWI.parkingEntry.tabOutViolationDateAndTime();
			trafficWI.parkingEntry.enterRandomTicketNo();
			trafficWI.parkingEntry.switchToMainTab();
			trafficWI.parkingEntry.parkingEntryMainTab.enterAtOfficer();
			trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateNumber();
			trafficWI.parkingEntry.parkingEntryMainTab.enterAtPlateState();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.clickSelectButton();
			trafficWI.switchToParkingEntry();
			trafficWI.parkingEntry.switchToMainTab();
			trafficWI.parkingEntry.parkingEntryMainTab.enterAtViolation();
			popup.acknowledge.ok();
			trafficWI.switchToParkingEntry();
			trafficWI.parkingEntry.switchToMainTab();
			trafficWI.parkingEntry.parkingEntryMainTab.enterAtLocation();
			trafficWI.switchToParkingEntry();
			trafficWI.parkingEntry.switchToFineNoticesTab();
			trafficWI.parkingEntry.fineNoticesTab.enterAtInitialAmount();
			trafficWI.switchToParkingEntry();
			trafficWI.parkingEntry.savetheScreen();
			trafficWI.switchToParkingEntry();
			trafficWI.parkingEntry.switchToPaymentsTab();
			trafficWI.parkingEntry.paymentsTab.clickAddotherPaymentsButton();
			trafficWI.switchToParkingOtherPayment();
			trafficWI.parkingOtherPayment.tabDate();
			trafficWI.parkingOtherPayment.enterAtPayment();
			trafficWI.parkingOtherPayment.selectAtPaymentMethod();
			trafficWI.parkingOtherPayment.saveandClosetheScreen();
			trafficWI.switchToParkingEntry();
//			trafficWI.parkingEntry.savetheScreen();
//			trafficWI.switchToParkingEntry();
			trafficWI.parkingEntry.switchToPaymentsTab();
			trafficWI.parkingEntry.paymentsTab.verifyTypeAsCashInGrid(0);
			trafficWI.switchToParkingEntry();
		
		}

	  @Test // Vijay // Q3 Sprint 2
			public void ToCheckWhetherUserIsAbleToResetTheScreenWithoutAnyErrorAfterAddingDataOnNarrativeTabCitationEntryScreen_278633(
					ITestContext testcontext) {
				testcontext.setAttribute("testID", "278633");
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Traffic");
				loader.navigateToScreen("Citation Entry");
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.enterAtCaseNo();
				trafficWI.citationEntry.selectCETypeAsTrafficViolation();
				trafficWI.citationEntry.selectAtDefendantType();
				trafficWI.citationEntry.enterAtNameID();
				trafficWI.citationEntry.switchToOffenseTab();
				trafficWI.citationEntry.offenseTab.clickChargeLookUpIcon();
				popup.switchToCodedSearch();
				popup.kPICodedLookup.enterAtCharge();
				popup.kPICodedLookup.clickSearchIcon();
				popup.kPICodedLookup.clickAtChargeInGrid();
				trafficWI.switchToCitationArrest();
				trafficWI.citationArrest.enterArrestDateAsCurrentDate();
				trafficWI.citationArrest.selectAtTypeOfArrestComboBox();
				trafficWI.citationArrest.selectArmed();
				trafficWI.citationArrest.saveCloseScren();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToOffenseTab();
				trafficWI.citationEntry.offenseTab.enterAtStreetName();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToOfficerTab();
				trafficWI.citationEntry.officerTab.tabOutOfficer();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.save();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.clickAddNewButton();
				home.switchToTextMgmtScreen();
				home.textMgmt.EnterAtTextName();
				home.textMgmt.EnterSummaryRichTextInIRReport();
				home.switchToTextMgmtScreen();
				home.textMgmt.SaveAndCloseScreen();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyAtTemplateComboBoxAsExistingValue();
				trafficWI.citationEntry.citationEntryNarrativeTab.clickLoadButton();
				trafficWI.citationEntry.citationEntryNarrativeTab.selectAtTemplate();
				trafficWI.citationEntry.citationEntryNarrativeTab.clickLoadButton();
				String richText = trafficWI.citationEntry.citationEntryNarrativeTab.getRichText();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.InternalSave();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.clickResetButton();
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.selectAtTemplate1();
				trafficWI.citationEntry.citationEntryNarrativeTab.clickLoadButton();
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextFromTemplate1();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.InternalSave();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextFromTemplate1();
				trafficWI.switchToCitationEntry();
				trafficWI.citationEntry.switchToNarrativeTab();
				trafficWI.citationEntry.citationEntryNarrativeTab.clickResetButton();
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextIsDisplayed(richText);
				trafficWI.citationEntry.citationEntryNarrativeTab.verifyRichTextFromTemplate1();
			}
	
	  
	  @Test //Automated by Stalin Q3 S1
		public void Submittingandapprovingcrashrecordwithdifferentcredential_276770(ITestContext testContext)
		{
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "276770");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContext();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Crash Entry");
			trafficWI.switchToCrashEntryScreen();
			trafficWI.citationEntry.enterAtCallNo();
			trafficWI.citationEntry.enterAtOfficer();
			trafficWI.citationEntry.save();
			trafficWI.citationEntry.verifyAdditionalSuccessfulAcknowledgeMessage();
			trafficWI.switchToCrashEntryScreen();
			trafficWI.citationEntry.switchToApprovalTab();
			trafficWI.citationEntry.citationEntryApprovalTab.selectActionAsSendForApproval();
			trafficWI.citationEntry.citationEntryApprovalTab.tabThroughDateTime();
			trafficWI.citationEntry.citationEntryApprovalTab.save();
			trafficWI.switchToCrashEntryScreen();
			trafficWI.citationEntry.verifyAsSubmittedInMenuBar();
			trafficWI.switchToCrashEntryScreen();

		}
	  
	  // Automated by Stalin // Date :10/12/2021 //Quarter:3 // Sprint: 5 //Module:Traffic
		@Test
		public void ToverifyOffensemappinginOffensetabandCountyfieldbinding_282068(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "282068");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Citation Entry");
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.enterAtCallNo();
			trafficWI.citationEntry.tabAtDateAndTime();
			trafficWI.citationEntry.selectCETypeAsTrafficViolation();
			trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
			trafficWI.citationEntry.enterAtNameID();
			trafficWI.citationEntry.switchToOffenseTab();
			trafficWI.citationEntry.offenseTab.enterAtCharge();
			trafficWI.switchToCitationArrest();
			trafficWI.citationArrest.selectArmed();
			trafficWI.citationArrest.saveCloseScren();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToOffenseTab();
			trafficWI.citationEntry.offenseTab.enterAtStreet();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToOfficerTab();
			trafficWI.citationEntry.officerTab.tabOutOfficer();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.save();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.VerifyAdditionSuccessfulMessage();
			trafficWI.citationEntry.switchToOffenseTab();
			trafficWI.citationEntry.offenseTab.verifyAtCharge();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToCourtTab();
			trafficWI.citationEntry.courtTab.verifyCourtDateLabelIsDisplayed();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.closeCitationEntryScreen();
			loader.navigateToScreen("Citation Entry");
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.enterAtCallNo();
			trafficWI.citationEntry.tabAtDateAndTime();
			trafficWI.citationEntry.selectCETypeAsTrafficViolation();
			trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
			trafficWI.citationEntry.enterAtNameID();
			trafficWI.citationEntry.verifyAtCounty();
			trafficWI.switchToCitationEntry();

			
			
		}

		// Automated by Stalin // Date :12/27/2021 //Quarter:04 // Sprint:06 //Module:Traffic
		@Test
		public void VerifytheagencyactionfieldmandatoryfunctionalityCitationArrest_289955(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "289955");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Traffic");
		loader.navigateToScreen("Citation Entry");
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.enterAtCallNo(); //UI Updated
		trafficWI.citationEntry.tabAtDateAndTime();
		trafficWI.citationEntry.selectCETypeAsNonTrafficViolation();
		trafficWI.citationEntry.enterAtLastName();
		trafficWI.citationEntry.enterAtFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToViolationsTab();
		trafficWI.citationEntry.violationsTab.enterAtCharge();
		trafficWI.switchToCitationArrest();
		trafficWI.citationArrest.selectAgencyActionAsHandledWithintheDepartment();
		trafficWI.citationArrest.selectArmedAsUnarmed();
		trafficWI.citationArrest.saveCloseScren();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToViolationsTab();
		trafficWI.citationEntry.violationsTab.clickAddButton();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.save();
		trafficWI.switchToCitationEntry();
		trafficWI.citationEntry.switchToViolationsTab();
		trafficWI.citationEntry.violationsTab.clickRowInGrid(0);
		trafficWI.citationEntry.violationsTab.clickNIBRSButton();
		trafficWI.switchToCitationArrest();
		trafficWI.citationArrest.verifyAtAgencyAction();
		trafficWI.citationArrest.verifyArmedAsUnarmed();
		trafficWI.citationArrest.saveCloseScren();
		trafficWI.switchToCitationEntry();


		}
	  @AfterMethod(groups={"2020DefectTestCases","2021DefectTestCases","TrafficWIFunctional","TrafficFunctional","CitationWI","CrashWI"})
	  public void afterMethodRecords(ITestResult testResult) 
	  {
		 /* try
				Playback.takeScreenShotOnFailure(testResult);
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		  try {
			ExtentReport.getResult(testResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Playback.stop();
			 ExtentReport.GenerateHTML();
			login.Reset();
			loader.Reset();
			trafficWI.Reset();
		}
	  @AfterSuite(groups={"2020DefectTestCases","2021DefectTestCases","TrafficWIFunctional","TrafficFunctional","CitationWI","CrashWI"})
	  public void afterRunSuite()
	  {
		  ExtentReport.GenerateHTML();
	  	 System.gc();
	  	}



}
