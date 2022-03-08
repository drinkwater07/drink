package scripts;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Settings;
import application.Tow;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;


public class TowScripts {
  
	public Tow tow;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Settings settings;
	public Vehicle vehicle;
	public Names names;
	public Home home;
	@BeforeSuite(groups = {"TowEntryAndRefuse","TowVendor","2022DefectTestCasesKIRAN"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
		 
	}
  @BeforeMethod(groups = {"TowEntryAndRefuse","TowVendor","2022DefectTestCasesKIRAN"})
  public void beforeTestMethod(ITestContext testContext) 
  {
	  testContext.setAttribute("moduleName","Tow");
	  Playback.testContext=testContext;
	  
	  Playback.start();
      login=new Login();
	  loader=new Loader();		
	  objectIdentification= new ObjectIdentification();	    
      popup = new Popup();
      tow= new Tow();
      settings = new Settings();
      vehicle = new Vehicle();
      names = new Names();
      home = new Home();
	  
  }

//Tow Vendor and Tow Rotation

  

@Test (priority =1 ,groups = {"TowVendor"}) 
 public void TowVendor_115078(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115078");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.clickAddNewButton();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickSaveButton();
     tow.towVendorEntry.verify7096EnterVendorCodeAckMsg();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.enterVendorCodeAs100();
     tow.towVendorEntry.clickSaveButton();
     tow.towVendorEntry.verify7097EnterVendorNameAckMsg();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.enterAtVendorLastName();
     names.switchToNameSearchHelpWindow();
     names.nameSearchHelpWindow.SelectNameByLastName();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.enterOfficeContactAs3DigitNUmber();
     tow.towVendorEntry.clickSaveButton();
     tow.towVendorEntry.verify5037InvalidPhoneNumber();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clearOfficeContact();
     tow.towVendorEntry.enterOfficeContact(); 
     tow.towVendorEntry.enterContractDateAsCurrentDate();
     tow.towVendorEntry.enterContractExpiresAs30DayFutureFromContractDate();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.verify1002AdditionSuccessfulFooterMessage();
     tow.towVendorEntry.clickInactiveDateTimeCheckbox();
     tow.towVendorEntry.verifyCurrentDateAutoPopulatesInInactiveCheckbox();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.verify1003UpdateSuccessfulFooterMessage();
     tow.switchToTowVendorEntry();

 }

 @Test (priority = 7,groups = {"TowVendor"})
 public void TowVendor_115110(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115110");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.verify1011NoRecordFoundAckMsg();
     tow.switchToTowVendor();
     tow.towVendor.clickIncludeInactiveCheckbox();
     tow.towVendor.clickSearchButton();
     tow.towVendor.verifyAtVendorCodeInGrid();
     tow.towVendor.verifyAtVendorNameInGrid();
     tow.towVendor.verifyAtAddressInGrid();       
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickInactiveDateTimeCheckbox();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();

 }

 @Test (priority = 2 ,groups = {"TowVendor"})
 public void TowVendor_115079(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115079");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.verifyAtLastName(); 
     tow.towVendorEntry.clickEquipmentTab();
     tow.towVendorEntry.equipment.enterTowEquipmentQuantityAs1();
     tow.towVendorEntry.equipment.enterCodeAs01();
     tow.towVendorEntry.equipment.clickAddButton();
     tow.towVendorEntry.equipment.enterTowEquipmentQuantityAs1();
     tow.towVendorEntry.equipment.enterCodeAs01();
     tow.towVendorEntry.equipment.clickAddButton();
     tow.towVendorEntry.equipment.verify1019DuplicationDataFoundAckMsg();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickEquipmentTab();
     tow.towVendorEntry.equipment.clickClearButton();
     tow.towVendorEntry.equipment.enterTowEquipmentQuantityAs2();
     tow.towVendorEntry.equipment.enterCodeAs02();
     tow.towVendorEntry.equipment.clickInactiveCheckbox();
     tow.towVendorEntry.equipment.clickAddButton();
     tow.towVendorEntry.equipment.verifyInactiveDateAsCurrentDateInGridByEquipmentCode(); //Updated
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();

 }

 @Test (priority = 3 ,groups = {"TowVendor"})
 public void TowVendor_115080(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115080");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickPhoneNumberTab();
     tow.towVendorEntry.phoneNumber.selectPhoneAsHome();
     tow.towVendorEntry.phoneNumber.enterThreeDigit();
     tow.towVendorEntry.phoneNumber.clickAdddButton();
     tow.towVendorEntry.phoneNumber.verify5037InvalidPhoneNumberAckMessage();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickPhoneNumberTab();
     tow.towVendorEntry.phoneNumber.clearPhoneNumber();
     tow.towVendorEntry.phoneNumber.enterAtPhoneNumber();
     Playback.controlReadyThreadWait();
     tow.towVendorEntry.phoneNumber.clickAdddButton();
     tow.towVendorEntry.phoneNumber.selectPhoneAsHome();
     tow.towVendorEntry.phoneNumber.enterAtPhoneNumber();
     Playback.controlReadyThreadWait();
     tow.towVendorEntry.phoneNumber.clickAdddButton();
     tow.towVendorEntry.phoneNumber.verify5015ContactInfoAlreadyExistAckMsg();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickSaveButton();
     tow.towVendorEntry.verify1051PhoneNumberAckMessage();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickPhoneNumberTab();
     tow.towVendorEntry.phoneNumber.clickClearButton();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();

 }

 @Test (priority = 4 ,groups = {"TowVendor"})
 public void TowVendor_115081(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115081");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAreaAssignmentTab();
     tow.towVendorEntry.areaAssignment.selectAreaAsPatrolArea1();
     tow.towVendorEntry.areaAssignment.clickAddButton();
     tow.towVendorEntry.areaAssignment.selectAreaAsPatrolArea1();
     tow.towVendorEntry.areaAssignment.clickAddButton();
     tow.towVendorEntry.areaAssignment.verify1019DuplicationDataFoundAckMsg();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickSaveButton();
     tow.towVendorEntry.verify1051AreaAsignmentAckMessage();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAreaAssignmentTab();
     tow.towVendorEntry.areaAssignment.clickClearButton();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();
 }

 @Test (priority = 5,groups = {"TowVendor"})
 public void TowVendor_115082(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115082");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     tow.towVendorEntry.authDrivers.enterAtDriverLastName();
     tow.towVendorEntry.authDrivers.enterAtDriverFirstName();
     names.switchToNameSearchHelpWindow();
     names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     //tow.towVendor.enterAtVendorCode();
     tow.towVendorEntry.authDrivers.enterEmployedAsCurrrentDate();
     tow.towVendorEntry.authDrivers.clickAddButton();
     tow.towVendorEntry.authDrivers.enterAtDriverLastName();
     tow.towVendorEntry.authDrivers.enterAtDriverFirstName();
     names.switchToNameSearchHelpWindow();
     names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     tow.towVendorEntry.authDrivers.enterEmployedAsCurrrentDate();
     tow.towVendorEntry.authDrivers.clickAddButton();
     tow.towVendorEntry.authDrivers.verify1019DuplicationDataFoundAckMsg();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickSaveButton();
     tow.towVendorEntry.verify1051AuthDriversAckMessage();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     tow.towVendorEntry.authDrivers.clickClearButton();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();

 }

 @Test (priority = 8,groups = {"TowVendor"})
 public void TowVendor_115141(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115141");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     tow.towVendorEntry.authDrivers.enterAtDriverLastName();
     tow.towVendorEntry.authDrivers.enterAtDriverFirstName();
     names.switchToNameSearchHelpWindow();
     names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     tow.towVendorEntry.authDrivers.enterEmployeedDateAs40DaysPreviousFromCurrentDate();
     tow.towVendorEntry.authDrivers.enterEmployeedDateAs2DaysPreviousFromCurrentDate();
     tow.towVendorEntry.authDrivers.clickAddButton();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     tow.towVendorEntry.authDrivers.clickShowAllCheckbox();
     tow.towVendorEntry.authDrivers.verifyAtTerminatedEmployeeInGrid();
    tow.towVendorEntry.authDrivers.clickDeleteIconInGrid();              //UI Updated
     tow.towVendorEntry.authDrivers.verifyConfirmDeleteMessage();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clickAuthDriversTab();
     tow.towVendorEntry.authDrivers.clickShowAllCheckbox();
          tow.towVendorEntry.authDrivers.verifyAtDeletedEmployeeNotFoundInGrid();
     tow.switchToTowVendorEntry();
 }

 @Test (priority = 6,groups = {"TowVendor"})
 public void TowVendor_115084(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115084");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
//     tow.towVendorEntry.clearContractDateAndTime();
//     tow.towVendorEntry.clearContractExpiresDateAndTime();
     tow.towVendorEntry.enterContractDateAs30DayPreviousFromCurrentdate();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();
    tow.towVendorEntry.getContractDate();
     tow.towVendorEntry.enterExpiresDteAsNextDayofContractDate();
     tow.towVendorEntry.save(); 
     loader.navigateToScreen("Tow Rotation");
     tow.switchToTowRotation();
     tow.towRotation.verifyAtVendorNotFoundInVendorDropdown();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.clearContractExpiresDateAndTime(); //UI Updated 
     tow.towVendorEntry.clickInactiveDateTimeCheckbox();
     tow.towVendorEntry.save();
     tow.switchToTowRotation();
     tow.towRotation.clickRefreshButton();
     tow.towRotation.verifyAtVendorNotFoundInVendorDropdown();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.unCheckInactiveCheckbox();
     tow.towVendorEntry.save();
     tow.switchToTowVendorEntry();

 }

 @Test (priority = 9,groups = {"TowVendor"})
 public void TowVendor_115331(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115331");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Rotation");
     tow.switchToTowRotation();
     tow.towRotation.selectAtVendor();
     tow.towRotation.selectAtPosition();
     tow.towRotation.clickAddButton();
     tow.towRotation.verifyAtPositionInGrid();
     tow.towRotation.save();
     tow.towRotation.verify1003UpdateSuccessfulAckMessage(); //updated 
     tow.switchToTowRotation();
     loader.navigateToScreen("Tow Vendor");
     tow.switchToTowVendor();
     tow.towVendor.enterAtVendorCode();
     tow.towVendor.clickSearchButton();
     tow.towVendor.clickRowByAtVendorCode();
     tow.switchToTowVendorEntry();
     tow.towVendorEntry.verifyAtPositionInRotationPositionFieldGreyOut();
     tow.switchToTowVendorEntry();
 }

 

// Tow and Tow Refuse

 @Test (priority = 1,groups = {"TowEntryAndRefuse"})
 public void Tow_115087(ITestContext testContext)
 {
	
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115087");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickAddNewButton();
     tow.switchToTowEntry();
     tow.towEntry.clickSaveButton();
     tow.towEntry.verify7039EnterCallAckMsg(); //updated
     tow.switchToTowEntry();
     tow.towEntry.enterAtCallNo();
     tow.towEntry.enterAtPlateNumber();
     tow.towEntry.selectAtPlateState();
     vehicle.switchToVehicleBoatEntry();
     vehicle.vehicleBoatEntry.clickSelectButton();
     tow.switchToTowEntry();
     tow.towEntry.verifyAtYear();
     tow.towEntry.verifyAtMake();
     tow.towEntry.verifyAtModel();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.selectAtEquipmentUsed();
     tow.towEntry.towTab.tabTowRequestDate();
     tow.towEntry.towTab.verifyCurrentDateAutoPopulatesInTowRequestedDate();
     tow.towEntry.towTab.selectAtWrecker();
     tow.switchToTowEntry();
     tow.towEntry.save();
     tow.switchToTowEntry();

 }

 @Test(priority = 2,groups = {"TowEntryAndRefuse"})
 public void Tow_115090(ITestContext testContext)
 {
	 
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115090");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickAddNewButton();
     tow.switchToTowEntry();
     tow.towEntry.enterAtCallNo();
     tow.towEntry.enterAtPlateNumber();
     tow.towEntry.selectAtPlateState();
     vehicle.switchToVehicleBoatEntry();
     vehicle.vehicleBoatEntry.clickSelectButton();          
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.selectAtEquipmentUsed();
     tow.towEntry.towTab.tabTowRequestDate();
     tow.towEntry.towTab.selectAtWrecker();
     tow.towEntry.towTab.selectTowType();
     tow.towEntry.towTab.selectTowReasonAsAbandoned();
     tow.towEntry.towTab.clickRefuseButton();
     tow.switchToTowRefusePopupScreen();
     tow.towRefusePopUpScreen.enterAtReason();
      tow.towRefusePopUpScreen.saveNCloseScreen();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.verifyAtNextWrecker();
     tow.towEntry.towTab.verifyAtAddress();  
     tow.towEntry.towTab.clearTowedFrom();
     tow.towEntry.towTab.enterAtTowedFrom();
    // tow.towEntry.towTab.clickTowedToCheckbox();
     tow.towEntry.towTab.tabTowCompletedDate();
     tow.towEntry.towTab.verifyCurrentDateAutoPopulatesInTowCompletedDate();
     tow.towEntry.towTab.enterAtOfficer();
     tow.towEntry.towTab.tabNotifiedDateTime();  //UI Updated 
     tow.towEntry.towTab.verifyCurrentDateAutoPopulatesInNotifiedDate();
     tow.towEntry.towTab.selectAtMethod();
     tow.switchToTowEntry();
     tow.towEntry.save();

 }

	@Test (priority = 3,groups = {"TowEntryAndRefuse"})
	public void Tow_115091(ITestContext testContext) {
		
		 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "115091");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.enterAtCallNo();
		tow.towScreen.clickSearchButton();
		tow.towScreen.clickRowByAtCallNo();
		tow.switchToTowEntry();
		tow.towEntry.clickOwnerTab();
		tow.towEntry.owner.verifyNotified1GreyOut();
		tow.towEntry.owner.clickClearIcon();
		tow.towEntry.owner.enterAtOwnerLastName();
		tow.towEntry.owner.enterAtOwnerFirstName();
		names.switchToNameSearchHelpWindow();
		names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();

	}

	@Test (priority = 4,groups = {"TowEntryAndRefuse"})
	public void Tow_115092(ITestContext testContext) {
		 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "115092");
		Browser.NavigateToLoginScreen();
		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.enterAtCallNo();
		tow.towScreen.clickSearchButton();
		tow.towScreen.clickRowByAtCallNo();
		tow.switchToTowEntry();
		tow.towEntry.clickOwnerTab();
		String readOwnerLastName = tow.towEntry.owner.readOwnerLastName();
		String readOwnerFirstName = tow.towEntry.owner.readOwnerFirstName();
		String readDOB = tow.towEntry.owner.readDOB();
		String readAddress = tow.towEntry.owner.readAddress();
		tow.towEntry.clickDriverTab();
		tow.towEntry.mDriver.clickOwnerCheckbox();
		tow.towEntry.mDriver.verifyActiveOwnerLastName(readOwnerLastName);
		tow.towEntry.mDriver.verifyActiveOwnerFirstName(readOwnerFirstName);
		tow.towEntry.mDriver.verifyActiveDOB(readDOB);
		tow.towEntry.mDriver.verifyActiveAddress(readAddress);
		tow.towEntry.mDriver.enterComments();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.verify1003UpdateSuccessfulFooterMessage();
		tow.towEntry.clickDriverTab();
		tow.towEntry.mDriver.uncheckOwnerCheckbox();
		tow.towEntry.mDriver.verifyDriverLastNameEmpty();
		tow.towEntry.mDriver.verifyDriverFirstNameEmpty();
		tow.towEntry.mDriver.verifyDOBEmpty();
		tow.towEntry.mDriver.verifyAddressEmpty();
		tow.switchToTowEntry();
	}

 @Test (priority = 5,groups = {"TowEntryAndRefuse"})
 public void Tow_115093(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115093");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.enterAtCallNo();
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.switchToDamageMissingTab();
     tow.towEntry.damageMissing.enterText();
     tow.switchToTowEntry();
     tow.towEntry.clickSaveButton();
     tow.towEntry.verify1051AckMsgInDamageMissingTab();
     tow.switchToTowEntry();
     tow.towEntry.switchToDamageMissingTab();
     tow.towEntry.damageMissing.saveInternalScreen();
     tow.switchToTowEntry();
     tow.towEntry.switchToDamageMissingTab();
     tow.towEntry.damageMissing.getText();
     tow.switchToTowEntry();
     tow.towEntry.switchToDamageMissingTab();
     tow.towEntry.damageMissing.verify1002AdditionSuccessfulFooterMessage();  //UI updated     
     tow.towEntry.damageMissing.resetInternalScreen();
     tow.towEntry.damageMissing.enterAndGetLessText();
     tow.towEntry.damageMissing.resetInternalScreen();
     tow.towEntry.damageMissing.verifyLastEnteredStringDisappear(Playback.getTestContextAttribute("Character"));
     tow.switchToTowEntry();
     tow.towEntry.switchToDamageMissingTab();
     tow.towEntry.damageMissing.verifyFirstEnteredStringAppear(Playback.getTestContextAttribute("Text"));
     tow.switchToTowEntry();
 }

 @Test (priority = 6,groups = {"TowEntryAndRefuse"})
 public void Tow_115095(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115095");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.enterAtCallNo();       
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.switchToPropertyInventoryTab();
     tow.towEntry.propertyInventory.enterText();
     tow.switchToTowEntry();
     tow.towEntry.clickSaveButton();
     tow.towEntry.verify1051AckMsgInPropertyInventoryTab();
     tow.switchToTowEntry();
     tow.towEntry.switchToPropertyInventoryTab();
     tow.towEntry.propertyInventory.saveInternalScreen();
     tow.switchToTowEntry();
     tow.towEntry.switchToPropertyInventoryTab();    
     tow.towEntry.propertyInventory.getText();
     tow.switchToTowEntry();
     tow.towEntry.switchToPropertyInventoryTab();
     tow.towEntry.propertyInventory.saveInternalScreen();
     tow.switchToTowEntry();
     tow.towEntry.switchToPropertyInventoryTab();
     tow.towEntry.propertyInventory.verify1003UpdateSuccessfulFooterMessage();
     tow.towEntry.propertyInventory.resetInternalScreen();
     tow.towEntry.propertyInventory.enterAndGetLessText();
     tow.towEntry.propertyInventory.resetInternalScreen();
     tow.towEntry.propertyInventory.verifyLastEnteredStringDisappear(Playback.getTestContextAttribute("Character"));
     tow.switchToTowEntry();
     tow.towEntry.switchToPropertyInventoryTab();
     tow.towEntry.propertyInventory.verifyFirstEnteredStringAppear(Playback.getTestContextAttribute("Text"));
     tow.switchToTowEntry();

 }


 @Test (priority = 7,groups = {"TowEntryAndRefuse"})
 public void Tow_115096(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115096");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.enterAtCallNo();         
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.clickForfeitureTab();
     tow.towEntry.forfeiture.enterCrime();
     tow.towEntry.forfeiture.enterEstimatedValue();
     tow.towEntry.forfeiture.enterLienOfAmount();
     tow.towEntry.forfeiture.clickClearIcon();
     tow.towEntry.forfeiture.selectLienHolder();
     names.switchToNameSearchHelpWindow();
     names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
     tow.switchToTowEntry();
//     tow.towEntry.forfeiture.selectEquipments();
     tow.towEntry.save();
     tow.switchToTowEntry();
 }

 @Test (priority = 8,groups = {"TowEntryAndRefuse"})
 public void Tow_115097(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115097");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.enterAtCallNo();
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.clickReleaseTab();
     tow.towEntry.release.clickHoldCheckbox();
     tow.towEntry.release.selectReason();
     tow.switchToTowEntry();
     tow.towEntry.save();
     tow.switchToTowEntry();
//     tow.towEntry.verifyRedColorHoldLabel();
     tow.towEntry.closeTheScreen();
     tow.switchToTowScreen();
     tow.towScreen.clickBackButton();
     tow.towScreen.clickNotReleasedOnlyCheckbox();
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.clickReleaseTab();
     tow.towEntry.release.uncheckHoldCheckbox();
     tow.towEntry.release.enterProofOf();
       tow.towEntry.release.enterAtReleaseToNameID();
//     tow.towEntry.release.selectReleaseTo();
//     tow.towEntry.release.tabFirstName();
     	tow.towEntry.release.tabReleaseDateTime(); //updated
//     tow.towEntry.release.verifyCurrentDateAutoPopulatesInRequestedDate();
  //   tow.towEntry.release.selectReleasedBy();
//     tow.switchToTowEntry();
//     tow.towEntry.clickReleaseTab();
     tow.towEntry.release.enterComments(); 
     tow.towEntry.save();
     tow.switchToTowEntry();
     tow.towEntry.verify1003UpdateSuccessfulFooterMessage();
     tow.towEntry.verifyHoldLabelDisappears();
     tow.switchToTowEntry();
 }

 @Test (priority = 9,groups = {"TowEntryAndRefuse"})
 public void Tow_115098(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115098");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.enterAtCallNo();
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.clickDispositionTab();
     tow.towEntry.towDispositionTab.selectAuthorizedBy();
     tow.switchToTowEntry();
     tow.towEntry.clickDispositionTab();
     tow.towEntry.towDispositionTab.tabOutDate();
//     tow.towEntry.towDispositionTab.selectMethod();
     tow.towEntry.towDispositionTab.enterCustom1();
     tow.towEntry.save();
     tow.switchToTowEntry();
     tow.towEntry.switchToTowNotesTab();
     tow.towEntry.towNotesTab.enterNotes();
     tow.towEntry.towNotesTab.clickResetButton();
     tow.towEntry.towNotesTab.verifyEnteredNotesDisappears();
     tow.towEntry.towNotesTab.enterNotes();
     tow.towEntry.towNotesTab.getNotes();
     tow.towEntry.towNotesTab.clickSaveButton();
     tow.switchToTowEntry();
     tow.towEntry.switchToTowNotesTab();
     tow.towEntry.towNotesTab.verifyEntereNotesInGrid(Playback.getTestContextAttribute("Notes"));

 }


 @Test (priority = 10,groups = {"TowEntryAndRefuse"})
 public void Tow_115100(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115100");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();;
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Refuse");
     tow.switchToTowRefuseScreen();
     tow.towRefuse.enterAtCallNo();
     tow.towRefuse.selectAtVendor();
     tow.towRefuse.clickSearchButton();
     tow.towRefuse.verifyAtCallNo();
     tow.towRefuse.verifyAtRefuseDate(); 
     tow.towRefuse.verifyAtVendor();
     tow.towRefuse.clickRowByAtCallNo();
     tow.switchToTowEntry();

 }

 @Test (priority = 11,groups = {"TowEntryAndRefuse"})
 public void Tow_115101(ITestContext testContext)
 {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "115101");
     Browser.NavigateToLoginScreen();
     login.loginScreen.logonUsingTestContext();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickAddNewButton();
     tow.switchToTowEntry();
     tow.towEntry.clickSaveButton();
     tow.towEntry.verify7039EnterCallAckMsg();
     tow.switchToTowEntry();
     tow.towEntry.enterAtCallNo();
     tow.towEntry.clickNoPlateCheckbox();
     tow.towEntry.verify7252ConfirmMessage();
     tow.switchToTowEntry();
     tow.towEntry.verifyPlateVinGreyOut();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.selectEquipment();
     tow.towEntry.towTab.tabTowRequestDate();
     tow.towEntry.towTab.selectWrecker();
     tow.towEntry.saveNClose();
     tow.switchToTowScreen();
     tow.towScreen.clickBackButton();
     tow.towScreen.clickNoPlateCheckbox();
     tow.towScreen.enterTowRequestedFromAsCurrentDate();
     tow.towScreen.enterTowRequestedToAsCurrentDate();
     tow.towScreen.clickSearchButton();
     tow.towScreen.verifyAtCallNoTowRequestedDateAsCurrentDate();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
 }


 @Test(groups = { "TowEntry" })
 public void Police2017Sprint2Vehicle_148428()
 {

     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Refuse");
     tow.switchToTowRefuseScreen();
     tow.towRefuse.enterAtCallNo();
     tow.towRefuse.clickSearchButton();
     tow.towRefuse.verifyAtCallNo();
     tow.towRefuse.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.verifyAtWrecker();
     tow.towEntry.towTab.clickRefuseButton();
     tow.switchToTowEntryPopupScreen();
     tow.towEntry.enterReason();
     tow.towEntry.saveNClose();
     tow.switchToTowEntry();
     tow.towEntry.towTab.verifyWreckerChanged();
     tow.towEntry.switchToTowNotesTab();
     tow.towEntry.towNotesTab.enterNotes();
     tow.towEntry.towNotesTab.clickResetButton();
     tow.towEntry.towNotesTab.verifyEnteredNotesDisappears();
     tow.towEntry.towNotesTab.enterNotes();
     tow.towEntry.towNotesTab.getNotes();
     tow.towEntry.towNotesTab.clickSaveButton();
     tow.towEntry.towNotesTab.verifyEntereNotesInGrid(Playback.getTestContextAttribute("Notes"));

 }

 @Test(groups = { "TowEntry" })
 public void Police2017Sprint2Vehicle_149570()
 {

     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickAddNewButton();
     tow.switchToTowEntry();
     tow.towEntry.enterAtCallNo();
     tow.towEntry.enterAtPlateNumber();
     tow.towEntry.selectAtPlateState();
     //Vehicle.switchToVehicleBoatEntry();
     //Vehicle.VehicleBoatEntry.clickSelectButton();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.selectAtEquipmentUsed();
     tow.towEntry.towTab.tabTowRequestDate();
     tow.towEntry.towTab.selectAtWrecker();
     tow.towEntry.save();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.verifyAtAddress();
     tow.towEntry.towTab.verifyTerminatedDriverNotShowing();
     tow.towEntry.closeTheScreen();
     tow.switchToTowScreen();
     tow.towScreen.enterAtPlateNo();
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.verifyTerminatedDriverShowing();

 }
 
 @Test(groups = { "TowEntry" })
 public void Police2017Sprint2Vehicle_147339()
 {

     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow Rotation");
     //vehicle.switchToTowRotation();
     //VehicleScripts.VehicleTestContext = TowTestContext;
     //Vehicle.TowRotation.selectAtPatrolArea();
    // Vehicle.TowRotation.selectAtVendor();
     //Vehicle.TowRotation.clickPrint();
     //Home.switchToSelectReport();
     //Home.selectReport.clickVEHTowRotationInGrid();
     //HomeScripts.HomeTestContext = TowTestContext;
     //Home.selectReport.TakeScreenshot();
 }

@Test   //Automated by Stalin
 public void TowReasonconfiguration(ITestContext testContext)
 {
	 testContext.setAttribute("testID", "256100");
	 Browser.NavigateToLoginScreen();
	 login.loginScreen.Logon();
	 loader.navigateToModule("Settings");
         loader.navigateToScreen("System Parameter");
         settings.switchToSystemParamter();
         settings.sysParameter.setSystemparameter427AsAbandoned();
         settings.switchToSystemParamter();
         objectIdentification.windowHandle.switchToMainWindow();
	 loader.navigateToModule("Vehicle");
	 loader.navigateToScreen("Tow");
	 tow.switchToTowScreen();
	 tow.towScreen.clickAddNewButton();
	 tow.switchToTowEntry();
	 tow.towEntry.enterAtCallNo();
	 tow.towEntry.verifyCallIBubbleIsDisplayed();
	 tow.towEntry.enterAtPlateNumber();
	 tow.towEntry.selectAtPlateState();
	 vehicle.switchToVehicleBoatEntry();
	 vehicle.vehicleBoatEntry.clickSelectButton();
	 tow.switchToTowEntry();
	 tow.towEntry.clickTowTab();
	 tow.towEntry.towTab.selectAtEquipmentUsed();
	 tow.towEntry.towTab.tabTowRequestDate();
	 tow.towEntry.towTab.selectAtWrecker();
	 tow.towEntry.towTab.selectAtTowReason();
	 tow.towEntry.save();
	 tow.switchToTowEntry();
	 tow.towEntry.clickReleaseTab();
	 tow.towEntry.release.verifyAtReleaseToLastName();
 
 }
  
 
 @Test //Sprint 6 Mahesha 
 public void PoliceDefect2020_254466(ITestContext testContext)
 {
	 testContext.setAttribute("testID", "254466");
     Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickHoldReasonCheckbox();
     tow.towScreen.verifyHoldReaonCheckBoxIsSelected();
     tow.towScreen.selectAtHoldReasonDropDown();
     tow.towScreen.clickSearchButton();
     tow.towScreen.verifyAtHoldReasonInGrid(0);
     tow.towScreen.selectRowByAtTowNo();
     tow.switchToTowEntry();
     tow.towEntry.clickReleaseTab();
     tow.towEntry.release.verifyHoldCheckBoxSelected();
     tow.towEntry.release.verifyAtHoldReason();
     tow.towEntry.release.uncheckHoldCheckbox();
     tow.towEntry.release.verifyHoldReasonDropdownDisabled();
     tow.towEntry.release.clickHoldCheckbox();
     tow.towEntry.release.selectReason();
     tow.towEntry.save();
     tow.switchToTowEntry();
     
 }
 @Test //Automated by Stalin Q2 S3
 public void RefusedVendordetailsshowninTowRefuseSearchResult_272369(ITestContext testContext)
 {
	 testContext.setAttribute("testID", "272369");
	 Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickSearchButton();
     tow.towScreen.clickRowByAtCallNo();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.clickRefuseButton();
     tow.switchToTowRefusePopupScreen();
     tow.towRefusePopUpScreen.enterAtReason();
     tow.towRefusePopUpScreen.saveNCloseScreen();
     tow.switchToTowEntry();
     tow.towEntry.save();
     tow.switchToTowEntry();
     tow.towEntry.verify1003UpdateSuccessfulFooterMessage();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.verifyRefuseInfoIconIsDisplayed();
     tow.switchToTowEntry();
     tow.towEntry.closeTheScreen();
     loader.navigateToScreen("Tow Refuse");
     tow.switchToTowRefuseScreen();
     tow.towRefuse.clickSearchButton();
     tow.towRefuse.verifyAtCallNo();
     tow.towRefuse.verifyAtVendor();
     tow.switchToTowRefuseScreen();
 }

 @Test 
 public void VerifyyearandVINNoinTowEntryscreenfromVehicleModule_272370(ITestContext testContext)
 {
	 testContext.setAttribute("testID", "272370");
	 Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickAddNewButton();
     tow.switchToTowEntry();
     tow.towEntry.clickNoPlateCheckbox();
     tow.towEntry.verify7252ConfirmMessage();
     tow.switchToTowEntry();
     tow.towEntry.verifyYearIsEnabled();
     tow.towEntry.verifyMakeIsEnabled();
     tow.towEntry.verifyModelIsEnabled();
     tow.towEntry.verifyColorsIsEnabled();
     tow.towEntry.verifyVINIsEnabled();
     tow.towEntry.verifyStyleIsEnabled();
     tow.towEntry.enterAtYear();
     tow.towEntry.enterAtVINNo();
     tow.switchToTowEntry();
 }
 
 @Test  //Automated by Stalin Q3 S1 
 public void TocheckwhetherCancelledTowrecordsdisplayinggrayed_275951(ITestContext testContext)
 {
	 testContext.setAttribute("testID", "275951");
	 Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickSearchButton();
     tow.towScreen.selectRowByAtTowNo();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.selectAtTowReason();
     tow.towEntry.verify7251ConfirmMessage(); 
     tow.switchToTowEntry();
     tow.towEntry.saveNClose();
     tow.switchToTowScreen();
     tow.towScreen.clickBackButton();
     tow.towScreen.selectTowReasonAsCancel();
     tow.towScreen.clickSearchButton();
     tow.towScreen.verifyAtTowNoInGrid();
     tow.towScreen.verifyAtRowViewedAsGrayColor();
     tow.towScreen.clickBackButton();
     tow.switchToTowScreen();

	 
 }
 
 @Test  //Automated by Stalin Q2 S6
 public void ToverifywhetherTowSignaturelogicforReleasedTo_275269(ITestContext testContext)
 {
	 testContext.setAttribute("testID", "275269");
	 Browser.NavigateToLoginScreen();
     login.loginScreen.Logon();
     loader.navigateToModule("Vehicle");
     loader.navigateToScreen("Tow");
     tow.switchToTowScreen();
     tow.towScreen.clickAddNewButton();
     tow.switchToTowEntry();
     tow.towEntry.enterAtCallNo();
     tow.towEntry.enterAtPlateNumber();
     tow.towEntry.selectAtPlateState();
     vehicle.switchToVehicleBoatEntry();
     vehicle.vehicleBoatEntry.clickSelectButton();
     tow.switchToTowEntry();
     tow.towEntry.clickTowTab();
     tow.towEntry.towTab.selectEquipment();
     tow.towEntry.towTab.tabTowRequestDate();
     tow.towEntry.towTab.selectWrecker();
     tow.switchToTowEntry();
     tow.towEntry.save();
     tow.switchToTowEntry();
     tow.towEntry.clickReleaseTab();
     tow.towEntry.release.enterAtReleaseToNameID();
     tow.towEntry.release.enterAtReleasedBy();
     tow.towEntry.release.clickReleasedBySignatureButton();
     home.switchToSignatureScreen();
     home.signatureScreen.clickTypeButton();
     home.signatureScreen.enterAtSignTextArea("Automation");
     home.signatureScreen.clickApplyButton();
     tow.switchToTowEntry();
     tow.towEntry.save();
    // tow.towEntry.clickReleaseTab();
     
 }

 public void VerifyReleaseToNamefieldfunctionalitywithsystemparameter427_282074(ITestContext testContext) 
	{
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "282074");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter427AsAccident();
		settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		String wreckerDropDownValue = tow.towEntry.towTab.getWreckerDropDownValue();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastNameWithActiveWrecker(wreckerDropDownValue);
		tow.towEntry.release.verifyReleaseToLastNameIsDisabled();
		//9th line testcase doubt 
		tow.switchToTowEntry();
		String readTowNo = tow.towEntry.readTowNo();
		tow.towEntry.closeTheScreen();
		//2nd Scenario
		tow.switchToTowScreen();
		tow.towScreen.verifyAtActiveTowNoRowViewedAsGrayColor(readTowNo);
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber1(); 
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab(); 
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime(); 
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason1();
		tow.switchToTowEntry();
		tow.towEntry.save(); 
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyReleaseToLastNameIsEmpty();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastName();
		tow.switchToTowEntry();
		String readTowNo1 = tow.towEntry.readTowNo();
		tow.towEntry.closeTheScreen();
		//3rd scenario
		tow.switchToTowScreen();
		tow.towScreen.verifyAtActiveTowNoRowViewedAsGrayColor(readTowNo1);
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo(); 
		tow.towEntry.enterAtPlateNumber2();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab();
		tow.towEntry.towTab.selectEquipment(); 
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime();
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastName();
		//23rd line of testcase not able to perform on App
		tow.switchToTowEntry();
		tow.towEntry.closeTheScreen();
		//4th scenario
		tow.switchToTowScreen();
		tow.towScreen.clickAddNewButton();
		tow.switchToTowEntry();
		tow.towEntry.enterAtCallNo();
		tow.towEntry.enterAtPlateNumber3();
		tow.towEntry.selectAtPlateState();
		vehicle.switchToVehicleBoatEntry();
		vehicle.vehicleBoatEntry.clickSelectButton();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyReleaseToLastNameIsEmpty();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.switchToTowEntry();
		tow.towEntry.clickTowTab(); 
		tow.towEntry.towTab.selectEquipment();
		tow.towEntry.towTab.tabTowRequestDate();
		tow.towEntry.towTab.tabTowRequestDateTime(); 
		tow.towEntry.towTab.selectAtWrecker();
		tow.towEntry.towTab.selectAtTowReason1();
		tow.switchToTowEntry();
		tow.towEntry.save(); 
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.verifyAtReleaseToLastName();
		tow.switchToTowEntry();
		
	}
 
 	// Automated by Stalin // Date : 10/12/2021 //Quarter:3 // Sprint:4 //Module:Vehicle 
 	//Application is not Supporting 
	@Test
	public void TocheckwhetherSignatureisupdating_280018(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "280018");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Settings");
        loader.navigateToScreen("System Parameter");
        settings.switchToSystemParamter();
        settings.sysParameter.setSystemparameter290AsTrue();
        settings.switchToSystemParamter();
		loader.navigateToModule("Vehicle");
		loader.navigateToScreen("Tow");
		tow.switchToTowScreen();
		tow.towScreen.clickSearchButton();
		tow.towScreen.clickRowByAtCallNo();
		tow.switchToTowEntry();
		tow.towEntry.clickReleaseTab();
		tow.towEntry.release.enterAtReleaseToNameID();
		tow.towEntry.release.enterAtReleasedBy();
		tow.towEntry.release.clickReleasedBySignatureCheckBox();
		home.switchToSignatureScreen(); 
		home.signatureScreen.Close();
		tow.switchToTowEntry();
		tow.towEntry.clickDispositionTab();
		tow.towEntry.towDispositionTab.enterAtAuthorizedBy();
		tow.towEntry.towDispositionTab.clickAuthorizedBysignatureCheckBox();
		home.switchToSignatureScreen();
		home.signatureScreen.Close();
		tow.switchToTowEntry();
		tow.towEntry.save();
		tow.switchToTowEntry();
		
	}
	
	// Automated by Stalin // Date : 10/12/2021 //Quarter:3 // Sprint:4 //Module:Vehicle 
 
		@Test
		public void TocheckwhetherTowEntryScreenchangeworkingproperly_280013(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "280013");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Vehicle");
			loader.navigateToScreen("Tow");
			tow.switchToTowScreen();
			tow.towScreen.clickAddNewButton();
			tow.switchToTowEntry();
			tow.towEntry.enterAtCallNo();
			tow.towEntry.clickNoPlateCheckbox();
			tow.towEntry.verify7252ConfirmMessage();
			tow.switchToTowEntry();
			tow.towEntry.clickTowTab();
			tow.towEntry.towTab.selectAtEquipmentUsed();
			tow.towEntry.towTab.tabTowRequestDate();
			tow.towEntry.towTab.tabTowRequestDateTime();
			tow.towEntry.towTab.selectAtWrecker();
			tow.switchToTowEntry();
			tow.towEntry.save();
			tow.switchToTowEntry();
			tow.towEntry.verifyCreateCallCheckBoxIsNotDisplayed();
			tow.towEntry.clickTowTab();
			tow.towEntry.towTab.verifyAtTowFrom();
			tow.towEntry.towTab.verifyAtTowedFromCSZ();
			tow.towEntry.towTab.verifyAtTowedTo();
			tow.towEntry.towTab.verifyAtTowedToCSZ();
			tow.towEntry.towTab.tabOutCancelDateNTime();
			tow.towEntry.towTab.verifyCancelDateNTimeisEmpty();
			tow.switchToTowEntry();
			tow.towEntry.clickPrintIcon();
			home.switchToSelectReport();
			home.selectReport.CloseTheScreen();
			tow.switchToTowEntry();
			tow.towEntry.clickTowTab();
			tow.towEntry.towTab.verifyAtTowFrom();
			tow.switchToTowEntry();

			
		}
	
 //Automated by KIRAN :-     Date :-10/25/2021  Quarter:-4  Sprint:-2  Module:-Vehicle 
		@Test(groups = { "2022DefectTestCasesKIRAN" })

		public void VerifyinTowEntrywhilesearchinVehicleownernameshoulddisplaytheIncidentNames_284329(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "278226");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Vehicle");
			loader.navigateToScreen("Tow");
			tow.switchToTowScreen();
			tow.towScreen.clickAddNewButton();
			tow.switchToTowEntry();
			tow.towEntry.enterAtCallNo();
			tow.towEntry.enterAtPlateNumber();
			tow.towEntry.selectAtPlateState();
			vehicle.switchToVehicleBoatEntry();
			vehicle.vehicleBoatEntry.clickSelectButton();
			tow.switchToTowEntry();
			tow.towEntry.clickTowTab();
			tow.towEntry.towTab.selectAtEquipmentUsed();
			tow.towEntry.towTab.verifyAtWrecker();
			tow.towEntry.towTab.verifyAtAddress();
			tow.towEntry.towTab.verifyCurrentDateAutoPopulatesInTowRequestedDate();
			tow.towEntry.save();
			
			tow.towEntry.clickOwnerTab();
			tow.towEntry.owner.clickNameSearchIcon();//
			names.switchToNameSearchHelpWindow();
			names.nameSearchHelpWindow.verifyTheGridIsEmpty();//
			names.nameSearchHelpWindow.CloseScreen();
			tow.switchToTowEntry();
	
			
		}
		
 
  @AfterMethod(groups = {"TowEntryAndRefuse","TowVendor","2022DefectTestCasesKIRAN"})
  public void afterTestMethod(ITestResult testResult)
  {
	  objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
	  
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
		tow.Reset();
        
  }
  
  @AfterSuite (groups = {"TowEntryAndRefuse","TowVendor","2022DefectTestCasesKIRAN"})
  public void afterRunSuite()
  {
	  ExtentReport.GenerateHTML();
  	 System.gc();
  	}

}
