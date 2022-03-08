package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Civil;
import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Settings;
import application.Traffic;
import reports.ExtentReport;
import uIMaps.UIMapTraffic;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;




public class CivilScripts 
{
	
	public Civil civil;
	public Geo geo;
	public Traffic traffic;
	public Settings settings;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popUp;
	public UIMapTraffic uIMapTraffic;
	public Names names;
	public Home home;
	
	@BeforeSuite(groups = {"2020DefectTestCase","DistrictCode","PaperEntry","CivilForms"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	

  @BeforeMethod(groups = {"2020DefectTestCase","DistrictCode","PaperEntry","CivilForms"})
	public void BeforeTestMethodSchedule( ITestContext testContext) 
	{
	  testContext.setAttribute("moduleName","Civil");
	  Playback.testContext=testContext;
	  Playback.start();
      login= new Login();
	  loader=new Loader();		
	  objectIdentification= new ObjectIdentification();	    
      popUp = new Popup();
      settings= new Settings();
      geo= new Geo();
      civil = new Civil();
      traffic = new Traffic();
      uIMapTraffic = new UIMapTraffic();
      names = new Names();
      home = new Home();
 }
  
  @Test(groups = {"2020DefectTestCase"})
  public void VerifyLocationAutoFetchInerviceTab_243233(ITestContext testContext)
  {
	  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	  testContext.setAttribute("testID","243233");
      Browser.NavigateToLoginScreen();
      login.loginScreen.Logon();
      loader.navigateToModule("Civil");
      loader.navigateToScreen("Civil Search");
      civil.switchToCivilSearch();
      civil.civilSearch.enterAtCivilProcessNo();
      civil.civilSearch.clickSearchButton();
      civil.civilSearch.selectAtCivilIDInGrid();
      civil.switchToCivilForm();
      civil.civilForm.clickServiceTab();
      civil.civilForm.civilServiceTab.tabDateandTime();
      civil.civilForm.civilServiceTab.selectAction();
      civil.civilForm.civilServiceTab.selectReason();
      civil.civilForm.civilServiceTab.selectAtName();
      civil.civilForm.civilServiceTab.VerifyLocationSelected();
      civil.civilForm.civilServiceTab.clickAddButton();
      civil.switchToCivilForm();
      civil.civilForm.saveScreen();
           
      
  }
      
 
		
  //Pass
 @Test(groups = { "DistrictCode" })
 	 public void CivilDistrictEntry_169137(ITestContext testContext)
    {
	 ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
  		testContext.setAttribute("testID","169137");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("District");
        civil.switchToDistrict();
        civil.district.clickAddNew();
        civil.switchToDistrictCode();
        civil.districtCode.clickAddButton();
        civil.districtCode.verifyAcknowledgeMessage();
        civil.switchToDistrictCode();
        civil.districtCode.enterAtDistrict();
        civil.districtCode.enterAtCity();
        civil.districtCode.enterAtMiles();
        civil.districtCode.enterAtPostLocation();
        civil.districtCode.clickAddButton();
        civil.districtCode.verifyAtPostLocation(0);
        civil.districtCode.save();
        civil.switchToDistrictCode();
        civil.districtCode.close();
        civil.switchToDistrict();
        civil.district.enterAtDistrict();
        civil.district.enterAtCity();
        civil.district.clickSearchButton();
        civil.district.verifyAtDistrict(0);
        civil.district.verifyAtCity(0);
        civil.district.verifyAtMileage(0);
        civil.district.clickAtDistrictinRow();
        civil.switchToDistrictCode();
        civil.districtCode.verifyAtPostLocation(0);
        civil.districtCode.deleteAtPostLocation();
        civil.switchToDistrictCode();
        civil.districtCode.save();
        civil.switchToDistrictCode();
        civil.districtCode.verifyPostLocationDeleted(0);

    }

  	//pass
    @Test(groups = { "DistrictCode" }) 
     public void CivilDistrictEntry_169138(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169138");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("District");
        civil.switchToDistrict();
        civil.district.enterAtDistrict();
        civil.district.enterAtCity();
        civil.district.clickSearchButton();
        civil.district.verifyAtDistrict(0);
        civil.district.clickAtDistrictinRow();
        civil.switchToDistrictCode();
        civil.districtCode.verifyAtPostLocation(0);
        civil.districtCode.clickAtPostLocationInGrid();
        civil.districtCode.clickInactiveCheckBox();
        civil.districtCode.verifyInactiveDateAsCurrentDate();
        civil.districtCode.clickAddButton();
        civil.districtCode.save();
        civil.switchToDistrictCode();
        civil.districtCode.close();
        civil.switchToDistrict();
       // civil.district.enterAtDistrict();  //No need already existing PoliceData appears in fields
        //civil.district.clickSearchButton(); //No need already existing PoliceData appears in fields
        civil.district.verifyNoRecordAcknowledgeMessge();
        civil.switchToDistrict();
        civil.district.clickInactiveCheckBox();
        civil.district.clickSearchButton();
        civil.district.verifyAtDistrict(0);
        civil.district.verifyAtCity(0);
        civil.district.verifyInactiveRowColor(0);
        civil.district.deleteAtDistrictSelectedRow();
        civil.district.verifyConfirmDeleteMessage();
        civil.switchToDistrict();
        civil.district.verifyNoRecordAcknowledgeMessge();
        civil.switchToDistrict();
    }

    //pass
    @Test(groups = { "DistrictCode" }) 
     public void CivilDistrictEntry_173642(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173642");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("District");
        civil.switchToDistrict();
        civil.district.enterAtDistrict();
        civil.district.clickSearchButton();
        civil.district.verifyAtCity(0);
        civil.district.clickAtDistrictinRow();
        civil.switchToDistrictCode();
        civil.districtCode.verifyAtPostLocation(0);
        civil.districtCode.enterAtPostLocation1();
        civil.districtCode.clickAddButton();
        civil.districtCode.verifyAtPostLocation1(1);
        civil.districtCode.enterAtPostLocation2();
        civil.districtCode.clickAddButton();
        civil.districtCode.verifyAtPostLocation2(2);
        civil.districtCode.save();
        civil.switchToDistrictCode();
        civil.districtCode.deleteAtPostLocation();
        civil.switchToDistrictCode();
        civil.districtCode.save();
        civil.switchToDistrictCode();
        civil.districtCode.verifyPostLocationDeleted(2);
    }


    @Test(groups = {"PaperEntry"} ) 
     public void CivilPaperTypeEntry_169133(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169133");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Paper Type");
        civil.switchToPaperType();
        civil.paperType.clickAddNew();
        civil.switchToPaperTypeEntry();
        civil.paperTypesEntry.enterAtCode();
        civil.paperTypesEntry.enterAtDescription();
        civil.paperTypesEntry.enterDaysToServeAs10();
        civil.paperTypesEntry.clickExecutionCheckBox();
        civil.paperTypesEntry.selectAtFeeType();
        civil.paperTypesEntry.enterAtPaperFee();
        civil.paperTypesEntry.clickAddButton();
        civil.paperTypesEntry.verifyAtFeeInGrid(0);
        civil.paperTypesEntry.verifyAtFeeTypeInGrid(0);
        civil.paperTypesEntry.clickSave();
        civil.paperTypesEntry.verifyFeeRequiredAcknowledgeMessage();
        civil.switchToPaperTypeEntry();
        civil.paperTypesEntry.selectAtFeeType1();
        civil.paperTypesEntry.enterAtPaperFee1();
        civil.paperTypesEntry.clickAddButton();
        civil.paperTypesEntry.verifyAtFee1InGrid(1);
        civil.paperTypesEntry.verifyAtFeeType1InGrid(1);
        civil.paperTypesEntry.saveScreen();
        civil.switchToPaperTypeEntry();
        civil.paperTypesEntry.closeScreen();
        civil.switchToPaperType();
        civil.paperType.enterAtPaperCode();
        civil.paperType.enterAtPaperType();
        civil.paperType.clickSearch();
        civil.paperType.verifyAtPaperFee(0);
        civil.paperType.verifyAtPaperCode(0);
        civil.paperType.verifyAtPaperType(0);
        civil.paperType.verifyAtServiceFee(0);
        civil.paperType.verifyExecutionCheckBoxCheckedInGrid(0);

    }

    @Test(groups = {"PaperEntry"} ) 
     public void CivilPaperTypeEntry_169134(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169134");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Paper Type");
        civil.switchToPaperType();
        civil.paperType.enterAtPaperCode();
        civil.paperType.enterAtPaperType();
        civil.paperType.clickSearch();
        civil.paperType.clickAtPaperCodeInGrid();
        civil.switchToPaperTypeEntry();
        civil.paperTypesEntry.clickExecutionCheckBox();
        civil.paperTypesEntry.verifyTROCheckBoxDisabled();
        civil.paperTypesEntry.verifyOtherCheckBoxDisabled();
        civil.paperTypesEntry.clickExecutionCheckBox();
        civil.paperTypesEntry.verifyTROCheckBoxEnabled();
        civil.paperTypesEntry.verifyOtherCheckBoxEnabled();
        civil.paperTypesEntry.clickTROCheckBox();
        civil.paperTypesEntry.verifyPropertyCheckBoxDisabled();
        civil.paperTypesEntry.verifyExecutionCheckboxDisabled();
        civil.paperTypesEntry.verifyOtherCheckBoxDisabled();
        civil.paperTypesEntry.verifySeziedPropertyCheckBoxEnabled();
        civil.paperTypesEntry.clickTROCheckBox();
        civil.paperTypesEntry.clickOtherCheckBox();
        civil.paperTypesEntry.verifyPropertyCheckBoxDisabled();
        civil.paperTypesEntry.verifyExecutionCheckboxDisabled();
        civil.paperTypesEntry.verifyTROCheckBoxDisabled();
        civil.paperTypesEntry.verifySeziedPropertyCheckBoxEnabled();
        civil.paperTypesEntry.clickPaperInactiveCheckBox();
        civil.paperTypesEntry.saveScreen();
        civil.switchToPaperTypeEntry();
        civil.paperTypesEntry.closeScreen();
        civil.switchToPaperType();
        civil.paperType.verifyNoRecordAcknowledgeMessge();
        civil.switchToPaperType();
        civil.paperType.clickInactiveCheckbox();
        civil.paperType.clickSearch();
        civil.paperType.verifyAtPaperCode(0);
        civil.paperType.verifyInactiveRowColor(0);
    }
    

    @Test(groups = {"PaperEntry"} ) 
     public void CivilPaperTypeEntry_169135(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","169135");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.clickAddNewButton();
        civil.switchToPaperEntry();
        civil.paperEntry.tabReceivedDateTime();
        civil.paperEntry.enterAtCivilID();
        civil.paperEntry.enterAtCourtCaseNo();
        civil.paperEntry.enterAtPaperType();
        civil.paperEntry.clickAddButton();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.enterAtPaperInfoExecutionAmount();
        civil.paperEntry.clickPaperInfoApplyCheckBox();
        civil.paperEntry.saveClosePaperInfoScreen();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCodeInGrid(0);
        civil.paperEntry.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyAtCivilID();
        civil.civilForm.verifyAtCourtCaseNo();
        civil.civilForm.verifyAtExecution();
        civil.civilForm.clickFeesPaymentTab();
      //  civil.civilForm.civilFeesPaymentsTab.verifyAtPaperFee();
        civil.civilForm.civilFeesPaymentsTab.verifyAtServiceFee();
        civil.civilForm.civilFeesPaymentsTab.verifyTransactionAsExecutionInGrid(0);
        civil.civilForm.civilFeesPaymentsTab.verifyAtDebitInGrid(0);

    }

    @Test(groups = {"PaperEntry"} )  
    public void CivilPaperTypeEntry_173635(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173635");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.clickAddNewButton();
        civil.switchToPaperEntry();
       // civil.paperEntry.clickSaveButton();
       // civil.paperEntry.verifyOneRowAcknowledgeMessage();
        civil.paperEntry.tabReceivedDateTime();
        civil.paperEntry.enterAtCivilID();
        civil.paperEntry.enterCourtCaseNo();
        civil.paperEntry.enterAtPaperType();
        civil.paperEntry.clickAddButton();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.enterAtPaperInfoLocation();
        civil.paperEntry.enterAtPaperInfoDistrict();
        civil.paperEntry.enterPaperInfoSaleDateandTime();
        civil.paperEntry.saveClosePaperInfoScreen();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCodeInGrid(0);
        civil.paperEntry.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyAtCivilID();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyAtPaperDescription();
        civil.civilForm.clickAllTabs();
        civil.civilForm.clickPropertyTab();
        civil.civilForm.civilPropertyTab.verifyAtLocation(0);
        civil.civilForm.civilPropertyTab.verifyAtSaleDateAsCurrentDate(0);
        civil.switchToCivilForm();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.verifyAtPaperFee();
        civil.civilForm.civilFeesPaymentsTab.verifyAtServiceFee();

    }

    @Test(groups = {"PaperEntry"} ) 
      public void CivilPaperTypeEntry_173636(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173636");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Paper Entry");
        civil.switchToPaperEntry();
      //  civil.paperEntry.clickSaveButton();
      //  civil.paperEntry.verifyOneRowAcknowledgeMessage();
        civil.paperEntry.tabReceivedDateTime();
        civil.paperEntry.enterAtCivilID();
        civil.paperEntry.enterCourtCaseNo();
        civil.paperEntry.enterAtPaperType();
        civil.paperEntry.clickAddButton();
        civil.paperEntry.verifyAtCodeInGrid(0);
        civil.paperEntry.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyAtCivilID();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyAtPaperDescription();
        civil.civilForm.clickAllTabs();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.verifyAtPaperFee();
        civil.civilForm.civilFeesPaymentsTab.verifyAtServiceFee();

    }

    @Test(groups = {"PaperEntry"} ) 
   public void CivilPaperTypeEntry_173637(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	   testContext.setAttribute("testID","173637");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Paper Entry");
        civil.switchToPaperEntry();
       // civil.paperEntry.clickSaveButton();
       // civil.paperEntry.verifyOneRowAcknowledgeMessage();
        civil.paperEntry.tabReceivedDateTime();
        civil.paperEntry.enterAtCivilID();
        civil.paperEntry.enterCourtCaseNo();
        civil.paperEntry.enterAtPaperType();
        civil.paperEntry.clickAddButton();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.tabIssuingDateTime();
        civil.paperEntry.enterExpireDateAsFutureDate();
        civil.paperEntry.selectRelationship();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.selectFirearmsProhibted();
        civil.paperEntry.enterAtIssuingOfficalNameID();
        civil.paperEntry.saveClosePaperInfoScreen();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCodeInGrid(0);
        civil.paperEntry.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyAtCivilID();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyAtPaperDescription();
        civil.civilForm.clickAllTabs();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.verifyAtPaperFee();
        civil.civilForm.civilFeesPaymentsTab.verifyAtServiceFee();

    }

    @Test(groups = {"PaperEntry"} ) 
    public void CivilPaperTypeEntry_173638(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
 	   testContext.setAttribute("testID","173638");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Paper Entry");
        civil.switchToPaperEntry();
       // civil.paperEntry.clickSaveButton();
       // civil.paperEntry.verifyOneRowAcknowledgeMessage();
        civil.paperEntry.tabReceivedDateTime();
        civil.paperEntry.enterAtCivilID();
        civil.paperEntry.enterCourtCaseNo();
        civil.paperEntry.enterAtPaperType();
        civil.paperEntry.clickAddButton();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.verifyOtherPaperAtDescription();
        civil.paperEntry.enterAtOtherPaper();
        civil.paperEntry.saveClosePaperInfoScreen();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCodeInGrid(0);
        civil.paperEntry.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyAtCivilID();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyAtOtherPaper();
        civil.civilForm.clickAllTabs();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.verifyAtPaperFee();
        civil.civilForm.civilFeesPaymentsTab.verifyAtServiceFee();

    }


    @Test(groups = {"PaperEntry"} ) 
    public void CivilPaperTypeEntry_173639(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173639");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Paper Entry");
        civil.switchToPaperEntry();
      //  civil.paperEntry.clickSaveButton();
      //  civil.paperEntry.verifyOneRowAcknowledgeMessage();
        civil.paperEntry.tabReceivedDateTime();
        civil.paperEntry.enterAtCivilID();
        civil.paperEntry.enterCourtCaseNo();
        civil.paperEntry.enterAtPaperType();
        civil.paperEntry.verifyPaperTypeAcknowledgeMessage();
        civil.switchToPaperEntry();
        civil.paperEntry.closeScreen();

    }

    @Test(groups = {"PaperEntry"} ) 
    public void CivilPaperTypeEntry_173640(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173640");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Paper Entry");
        civil.switchToPaperEntry();
      //  civil.paperEntry.clickSaveButton();
       // civil.paperEntry.verifyOneRowAcknowledgeMessage();
        civil.paperEntry.tabReceivedDateTime();
        civil.paperEntry.enterAtCivilID();
        civil.paperEntry.enterCourtCaseNo();
        civil.paperEntry.enterAtPaperType();
        civil.paperEntry.clickAddButton();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.enterAtPaperInfoLocation();
        civil.paperEntry.selectPaperInfoDistrict();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.enterPaperInfoSaleDateandTime();
        civil.paperEntry.saveClosePaperInfoScreen();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCodeInGrid(0);
        civil.paperEntry.enterAtPaperType1();
        civil.paperEntry.clickAddButton();
        civil.paperEntry.verifyAtCode1InGrid(1);
        civil.paperEntry.enterAtPaperType2();
        civil.paperEntry.clickAddButton();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.tabIssuingDateTime();
        civil.paperEntry.enterExpireDateAsFutureDate();
        civil.paperEntry.selectRelationship();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.selectFirearmsProhibted();
        civil.paperEntry.selectName();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.saveClosePaperInfoScreen();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCode2InGrid(2);
        civil.paperEntry.enterAtPaperType3();
        civil.paperEntry.clickAddButton();
        civil.switchToPaperInfoEntry();
        civil.paperEntry.enterAtOtherPaper();
        civil.paperEntry.saveClosePaperInfoScreen();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCode3InGrid(3);
        civil.paperEntry.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyAtCivilID();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyPaperCountAs4();
        civil.civilForm.clickAllTabs();
        civil.civilForm.clickPropertyTab();
        civil.civilForm.civilPropertyTab.verifyAtLocation(0);
        civil.civilForm.civilPropertyTab.verifyAtSaleDateAsCurrentDate(0);
        civil.switchToCivilForm();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.verifyAtPaperFee();
        civil.civilForm.civilFeesPaymentsTab.verifyAtServiceFee();
        civil.switchToCivilForm();
        civil.civilForm.closeScreen();

    }

    //pass
    @Test(groups = {"CivilForms"}) 
    public void CivilForms_173625(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173625");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.selectAtPaperType();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtPaperType(1);
        civil.civilSearch.selectAtCivilIDInGrid();
        civil.switchToCivilForm();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyAtPaperType();
        civil.civilForm.verifyPaperCountAs1();
        civil.civilForm.clickPaperButton();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyAtCodeInGrid(0);
        civil.paperEntry.verifyAtPaperTypeInGrid(0);
        civil.paperEntry.closeScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyWaiveFeesFieldDisabled();
        civil.civilForm.enterAtCivilID();
        civil.civilForm.enterAtCourtCase();
        civil.civilForm.clickWaivedReasonCheckbox();
        civil.civilForm.verifyWaiveFeesConfirmMessage();
        civil.switchToCivilForm();
        civil.civilForm.verifyWaiveFeesFieldEnabled();
        civil.civilForm.selectWaivedFees();
        civil.civilForm.enterCourtDateAsCurrentDate();
        civil.civilForm.enterServeByAsFutureDate();
        civil.civilForm.verifyServeFutureDateAcknowledgeMessage();
        civil.switchToCivilForm();
        civil.civilForm.enterServeByAsCurrentDate();
        civil.civilForm.enterAtCustom();
        civil.civilForm.enterBond();
        civil.civilForm.enterExecutionAmountAs25();
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
    }

    //pass
    @Test(groups = {"CivilForms"})  
     public void CivilForms_173626(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173626");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilProcessNo();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickNamesTab();
        civil.civilForm.civilNamesTab.selectTypeAsDefendant();
        civil.civilForm.civilNamesTab.verifyAddressDistrictLabelMandatory();
        civil.civilForm.civilNamesTab.enterAtNameID();
        civil.civilForm.civilNamesTab.clickAddButton();
        civil.civilForm.civilNamesTab.verifyDistrictAcknowledgeMessage();
        civil.switchToCivilForm();
        civil.civilForm.civilNamesTab.selectDistrict();
        civil.switchToCivilForm();
        civil.civilForm.civilNamesTab.clickToBeServedCheckBox();
        civil.civilForm.civilNamesTab.clickBillableCheckBox();
        civil.civilForm.civilNamesTab.enterComments();
        civil.civilForm.civilNamesTab.clickAddButton();
        civil.civilForm.civilNamesTab.verifyTypeAsDefendantInGrid(0);
        civil.civilForm.civilNamesTab.verifyToBeServedCheckboxCheckedInGrid();
        civil.civilForm.civilNamesTab.verifyBillableCheckboxCheckedInGrid();
        civil.civilForm.civilNamesTab.verifyDefendantRowColor();
        civil.civilForm.civilNamesTab.selectTypeAsWitness();
        civil.civilForm.civilNamesTab.verifyEtAlCheckboxDisabled();
        civil.civilForm.civilNamesTab.enterAtLastName();
        civil.civilForm.civilNamesTab.enterAtFirstName();
        civil.civilForm.civilNamesTab.selectAtNameInNameSearchHelpWindow();
        civil.switchToCivilForm();
        civil.civilForm.civilNamesTab.enterComments();
        civil.civilForm.civilNamesTab.clickAddButton();
        civil.civilForm.civilNamesTab.verifyTypeAsWitnessInGrid(1);
        civil.switchToCivilForm();
        civil.civilForm.clickSave();;
    }

    //pass
    @Test(groups = {"CivilForms"})  
      public void CivilForms_173627(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173627");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilProcessNo();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickNamesTab();
        civil.civilForm.civilNamesTab.selectAtNameInGrid();
        civil.civilForm.civilNamesTab.clickAssociatesLookupIcon();
        civil.switchToCivilContact();
        civil.civilContact.enterAtLastName();
        civil.civilContact.enterAtFirstName();
        
        names.switchToNameSearchHelpWindow();
        names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
        civil.switchToCivilContact();
        civil.civilContact.clickNameQuickIcon();
        names.switchToQuickName();
       
        names.quickName.EnterAtAddress();
        names.quickName.ClickSaveButton();  
        civil.switchToCivilContact();
        civil.civilContact.clickAddButton();
        civil.civilContact.save();
        civil.switchToCivilContact();
        civil.civilContact.verifyAtAssociates(0);
        civil.civilContact.saveAndClose();
        civil.switchToCivilForm();
        civil.civilForm.civilNamesTab.clickToBeServedCheckBox();
        civil.civilForm.civilNamesTab.clickAddButton();
        civil.civilForm.civilNamesTab.verifyAssociatesIconInGrid(0);
        civil.civilForm.civilNamesTab.verifyAtNameRowColorAsBlack();
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.civilNamesTab.clickAssociatesIconInGrid(0);
        civil.switchToCivilContact();
        civil.civilContact.close();
        civil.switchToCivilForm();

    }
    
    //pass
    @Test(groups = {"CivilForms"})  
     public void CivilForms_173628(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173628");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilRefID();
        civil.civilSearch.enterAtCourtCase();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickServiceTab();
        civil.civilForm.civilServiceTab.enterDateandTimeAsPreviousDate();
        civil.civilForm.civilServiceTab.verifyPriorDateConfirmMessage();
        civil.switchToCivilForm();
        civil.civilForm.civilServiceTab.selectActionAsServed();
        civil.civilForm.civilServiceTab.verifyNamesMandatoryFields();
        civil.civilForm.civilServiceTab.verifyLocationDistrictMandantoryFields();
        // civil.civilForm.civilServiceTab.verifyReasonMandantoryFields(); 
        civil.civilForm.civilServiceTab.selectActionAsServiceAttempt();
        civil.civilForm.civilServiceTab.verifyNamesMandatoryFields();
        civil.civilForm.civilServiceTab.verifyLocationDistrictMandantoryFields();
        civil.civilForm.civilServiceTab.verifyServiceFeeMandatoryFields();
        civil.civilForm.civilServiceTab.selectActionAsServedNoCharge();
        civil.civilForm.civilServiceTab.verifyNamesMandatoryFields();
        civil.civilForm.civilServiceTab.verifyLocationDistrictMandantoryFields();
        civil.civilForm.civilServiceTab.verifyCollectionTypeMandantoryFields();
        civil.civilForm.civilServiceTab.selectActionAsServed();
        civil.civilForm.civilServiceTab.selectReason();
        civil.civilForm.civilServiceTab.selectAtName();
        civil.civilForm.civilServiceTab.enterAtLocation();
        civil.civilForm.civilServiceTab.selectDistrict();
        civil.switchToCivilForm();
        civil.civilForm.clickServiceTab();
        civil.civilForm.civilServiceTab.clickAddButton();
        civil.civilForm.civilServiceTab.verifyActionAsServedInGrid(0);
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyStatusAsServed();
        civil.civilForm.clickServiceTab();
        civil.civilForm.civilServiceTab.tabDateandTime();
        civil.civilForm.civilServiceTab.selectActionAsServiceAttempt();
        civil.civilForm.civilServiceTab.selectAtName1();
        civil.civilForm.civilServiceTab.enterAtLocation();
        civil.civilForm.civilServiceTab.enterAtServiceFee();
        civil.civilForm.civilServiceTab.clickAddButton();
        civil.civilForm.verifyStatusAsOpen();
        civil.civilForm.verifyStatusAsServiceAttempt();
        civil.switchToCivilForm();
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
    }

    //pass
    @Test(groups = {"CivilForms"}) 
      public void CivilForms_173629(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173629");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilRefID();
        civil.civilSearch.enterAtCourtCase();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickServiceTab();
        civil.civilForm.civilServiceTab.selectAtNameInGrid();
        civil.civilForm.civilServiceTab.clickPropertyInventoryButton();
        civil.switchToPropertyInventoryScreen();
        civil.propertyInventoryScreen.selectAtProperty();
        civil.propertyInventoryScreen.enterAtDescription();
        civil.propertyInventoryScreen.selectGunType();
        civil.propertyInventoryScreen.selectAtNames();
        civil.propertyInventoryScreen.clickAdd();
        civil.propertyInventoryScreen.verifyAtNameInGrid(0);
        civil.propertyInventoryScreen.verifyAtDescriptionInGrid(0);
        civil.propertyInventoryScreen.saveScreen();
        civil.switchToPropertyInventoryScreen();
        civil.propertyInventoryScreen.verifyTotalItemSeizedCountAs1();
        civil.propertyInventoryScreen.closeScreen();
        civil.switchToCivilForm();
        civil.civilForm.civilServiceTab.enterNarrative();
        civil.civilForm.civilServiceTab.clickAddButton();
        civil.switchToCivilForm();
       civil.civilForm.clickSave();
        
    }

    //pass
    @Test(groups = {"CivilForms"}) 
        public void CivilForms_173630(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173630");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilProcessNo();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickPropertyTab();
        civil.civilForm.civilPropertyTab.verifyAtPropertyLocation(0);
        civil.civilForm.civilPropertyTab.clickAddNew();
        civil.switchToCivilPropertyScreen();
        civil.civilProperty.enterAtPropertyLocation1();
        civil.civilProperty.enterAtDistrict();
        civil.switchToCivilPropertyScreen();
        civil.civilProperty.enterDateAndTimeOfSaleAsCurrentDate();
        civil.civilProperty.enterAdjournedDateAndTimeAs5DaysFuture();
        civil.civilProperty.enterAtBuyerID();
        civil.civilProperty.saveScreen();
        civil.switchToCivilPropertyScreen();
        civil.civilProperty.verifyAtLocationInGrid(0);
        civil.civilProperty.closeScreen();
        civil.switchToCivilForm();
        civil.civilForm.clickPropertyTab();
        civil.civilForm.civilPropertyTab.verifyAtPropertyLocation1(1);
        civil.civilForm.civilPropertyTab.verifyAtBuyerName(1);
        civil.civilForm.civilPropertyTab.verifyAtSaleDateAsCurrentDate(1);
        civil.civilForm.civilPropertyTab.verifyAdjournedDateAsFutureDate(1);
        civil.switchToCivilForm();
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
       
    }

    @Test(groups = {"CivilForms"}) 
       public void CivilForms_173631(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173631");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.selectAtPaperType();
        civil.civilSearch.selectAtServiceAction();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.selectTransactionTypeAsPaperFee();
        civil.civilForm.civilFeesPaymentsTab.selectServiceMethodsAsCashCredit();
        civil.civilForm.civilFeesPaymentsTab.enterAtAmount();
        civil.civilForm.civilFeesPaymentsTab.enterNote();
        civil.civilForm.civilFeesPaymentsTab.selectAtName();
        civil.civilForm.civilFeesPaymentsTab.clickAdd();
        civil.civilForm.civilFeesPaymentsTab.verifyAtNameInGrid(0);
        civil.civilForm.civilFeesPaymentsTab.verifyAtCreditInGrid(0);
        civil.civilForm.civilFeesPaymentsTab.selectTransactionType();
        civil.civilForm.civilFeesPaymentsTab.selectServiceMethodsAsCashDebit();
        civil.civilForm.civilFeesPaymentsTab.enterAtAmount();
        civil.civilForm.civilFeesPaymentsTab.enterNote();
        civil.civilForm.civilFeesPaymentsTab.selectAtName();
        civil.civilForm.civilFeesPaymentsTab.clickAdd();
        civil.civilForm.civilFeesPaymentsTab.verifyAtNameInGrid(1);
        civil.civilForm.civilFeesPaymentsTab.verifyAtDebitInGrid(1);
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
    }

    //Pass
    @Test(groups = {"CivilForms"})  
      public void CivilForms_173632(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173632");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.selectAtPaperType();
        civil.civilSearch.selectAtServiceAction();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.clickWriteOffCheckBox();
        civil.civilForm.civilFeesPaymentsTab.verifyDateMethodAuthByMandatory();
        civil.civilForm.civilFeesPaymentsTab.tabDate();
        civil.civilForm.civilFeesPaymentsTab.verifyCurrentDateInDate();
        civil.civilForm.civilFeesPaymentsTab.selectWriteMethod();
        civil.civilForm.civilFeesPaymentsTab.enterAtAuthBy();
        civil.switchToAuthenticationWindow();
        civil.authenticationWindow.enterAtPassword();
        civil.authenticationWindow.clickAcceptButton();
        civil.switchToCivilForm();
        civil.civilForm.civilFeesPaymentsTab.enterNotes();
        civil.civilForm.saveScreen();;
        civil.switchToCivilForm();
    }

    @Test(groups = {"CivilForms"}) 
      public void CivilForms_173633(ITestContext testContext)
    {
    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    	testContext.setAttribute("testID","173633");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilProcessNo();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilID(1);
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickCommentsTab();
        civil.civilForm.civilCommentsTab.selectCode();
        civil.switchToCivilForm();
        civil.civilForm.clickCommentsTab();
        civil.civilForm.civilCommentsTab.enterAtHeading();
        civil.civilForm.civilCommentsTab.clickEnterCommentsButton();
        home.switchToManageCommentsScreen();
        home.manageComments.ClickResetButton();
        home.manageComments.Enter100WordsRichText();
        home.manageComments.SaveAndCloseScreen();   
        civil.switchToCivilForm();
        civil.civilForm.clickCommentsTab();
        civil.civilForm.civilCommentsTab.verifyDateAsCurrentDate(1);
        civil.civilForm.civilCommentsTab.verifyAtHeading(1);
        civil.civilForm.civilCommentsTab.deleteAtHeading1Row();
        civil.civilForm.civilCommentsTab.verifyConfirmDeleteMessage();
        civil.switchToCivilForm();
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
        civil.civilForm.clickCommentsTab();
        civil.civilForm.civilCommentsTab.verifyRowCountInGrid(1);
        civil.switchToCivilForm();
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
    }

   @Test 
     public void PoliceSprintCivilModule_135707()
    {
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilProcessNo();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilNumber(1);
        civil.civilSearch.verifyAtStatus(1,8);
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.verifyAtCivilProcessNumber();
        civil.civilForm.clickFeesPaymentTab();
        civil.civilForm.civilFeesPaymentsTab.clickWriteOffCheckBox();
        civil.civilForm.civilFeesPaymentsTab.verifyCurrentDateInDate();
        civil.civilForm.civilFeesPaymentsTab.verifyDateMethodAuthByMandatory();
        civil.civilForm.civilFeesPaymentsTab.selectMethod();
        civil.civilForm.civilFeesPaymentsTab.enterAtAuthBy();
        civil.switchToAuthenticationWindow();
        civil.authenticationWindow.enterAtPassword();
        civil.authenticationWindow.clickAcceptButton();
        civil.switchToCivilForm();
        civil.civilForm.saveScreen();

    }

   @Test 
     public void Police2017Sprint1CivilModule_143766(ITestContext testContext)
     {
    	testContext.setAttribute("testID","143766");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.verifyCourtCaseFieldEnabled();
        civil.civilSearch.clickCourtCaseText();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.selectFieldUsageAsHide();
        settings.repositoryEntry.saveScreen();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.closeScreen();   
        civil.switchToCivilSearch();
        civil.civilSearch.verifyCourtCaseFieldHide();
        civil.civilSearch.verifyCustomEnabled();
        civil.civilSearch.clickCustomText();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.selectFieldUsageAsHide();
        settings.repositoryEntry.saveScreen();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.closeScreen(); 
        civil.switchToCivilSearch();
        civil.civilSearch.verifyCustomHide();
        civil.civilSearch.clickAddNewButton();
        civil.switchToPaperEntry();
        civil.paperEntry.verifyCourtCaseFieldEnabled();
        civil.paperEntry.clickCourtCaseNumberText();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.selectFieldUsageAsHide();
        settings.repositoryEntry.saveScreen();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.closeScreen(); 
        civil.switchToPaperEntry(); 
        civil.paperEntry.verifyCourtCaseFieldHide();
        civil.paperEntry.clickCourtCaseNumberText();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.selectFieldUsageAsMandatory();
        settings.repositoryEntry.saveScreen();
        settings.switchToRepositoryEntry();
        settings.repositoryEntry.closeScreen();  
        civil.switchToPaperEntry();
        civil.paperEntry.verifyCourtCaseMandatory();
        civil.paperEntry.closeScreen();
        civil.switchToCivilSearch();
    }

      @Test 
      public void Police2017Sprint2CivilModule_148812(ITestContext testContext)
      {
    	  
    	 testContext.setAttribute("testID","148812");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule("Settings");
        loader.navigateToScreen("System Parameter");
        settings.switchToSystemParamter();
        settings.sysParameter.setSystemparameter532AsTrue();
        settings.sysParameter.verifyUpdateSuccessfulAckMessage();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.enterAtCivilProcessNo();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickNamesTab();
        civil.civilForm.civilNamesTab.enterAtLastName();
        civil.civilForm.civilNamesTab.enterAtFirstName();
        civil.civilForm.civilNamesTab.selectAtNameInNameSearchHelpWindow();
        civil.switchToCivilForm();
        civil.civilForm.civilNamesTab.verifyAtAddressWithJuris(); // issue reported Police NJ DB
        civil.civilForm.closeScreen();
        loader.navigateToModule("Settings");
        loader.navigateToScreen("System Parameter");
        settings.switchToSystemParamter();
        settings.sysParameter.setSystemparameter532AsFalse();
        settings.sysParameter.verifyUpdateSuccessfulAckMessage();
        loader.navigateToModule("Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.selectAtCivilNoInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickNamesTab();
        civil.civilForm.civilNamesTab.enterAtLastName();
        civil.civilForm.civilNamesTab.enterAtFirstName();
        civil.civilForm.civilNamesTab.selectAtNameInNameSearchHelpWindow();
        civil.switchToCivilForm();
        civil.civilForm.civilNamesTab.verifyAtAddressWithoutJuris();
        civil.civilForm.closeScreen();
        civil.switchToCivilSearch();

    }

     @Test 
     public void Police2017Sprint2CivilModule_148814(ITestContext testContext)
      {
    	 testContext.setAttribute("testID","148814");
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("District");
          civil.switchToDistrict();
          civil.district.clickAddNew();
          civil.switchToDistrictCode();
          civil.districtCode.clickAddButton();
          civil.districtCode.verifyAcknowledgeMessage();
          civil.switchToDistrictCode();
          civil.districtCode.enterAtDistrict();
          civil.districtCode.enterAtCity();
          civil.districtCode.enterAtMileage();
          civil.districtCode.enterAtPostLocation();
          civil.districtCode.clickAddButton();
          civil.districtCode.verifyAtPostLocation(0);
          civil.districtCode.save();
          civil.districtCode.close();
          civil.switchToDistrict();
          civil.district.enterAtDistrict();
          civil.district.enterAtCity();
          civil.district.clickSearchButton();
          civil.district.verifyAtDistrict(0);
          civil.district.verifyAtMileage(0);
          civil.district.verifyAtCity(0);
          civil.district.clickAtDistrictinRow();
          civil.switchToDistrictCode();
          civil.districtCode.verifyAtPostLocation(0);
          civil.districtCode.deleteAtPostLocation();
          civil.switchToDistrictCode();
          civil.districtCode.save();
          civil.switchToDistrictCode();
          civil.districtCode.verifyPostLocationDeleted(0);
          civil.districtCode.close();
          civil.switchToDistrict();
      }

    @Test 
      public void Police2017Sprint2CivilModule_148915(ITestContext testContext)
      {
    	  testContext.setAttribute("testID","148915");
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("Civil Search");
          civil.switchToCivilSearch();
          civil.civilSearch.clickAddNewButton();
          civil.switchToPaperEntry();
          civil.paperEntry.clickSaveButton();
          civil.paperEntry.verifyRequiredAcknowledgeMessage();
          civil.switchToPaperEntry();
          civil.paperEntry.enterRecivedDateandTime();
          civil.paperEntry.enterAtCivilID();
          civil.paperEntry.clickAddButton();
          civil.paperEntry.verifyRequiredAcknowledgeMessage();
          civil.switchToPaperEntry();
          civil.paperEntry.enterAtCourtCaseNo();
          civil.paperEntry.clickSaveButton();
          civil.paperEntry.verifyOneRowAcknowledgeMessage();
          civil.switchToPaperEntry();
          civil.paperEntry.enterPropertyTypeAsPRO();
          civil.paperEntry.clickAddButton();
          civil.switchToPaperInfoEntry();
          civil.paperEntry.enterAtPaperInfoLocation();
          civil.paperEntry.selectPaperInfoDistrict();
          civil.switchToPaperInfoEntry();
          civil.paperEntry.enterPaperInfoSaleDateandTime();
          civil.paperEntry.savePaperInfoScreen();
          civil.switchToPaperInfoEntry();
          civil.paperEntry.verifyPaperInfoLocationAddedInGrid();
          civil.paperEntry.closeScreen();
          civil.switchToPaperEntry();
          civil.paperEntry.verifyPROaddedInGrid(0);
          civil.paperEntry.saveScreen();
          civil.switchToCivilForm();
          civil.civilForm.verifyStatusAsOpen();
          civil.civilForm.verifyAtCivilID();
          civil.civilForm.clickNamesTab();
          civil.civilForm.civilNamesTab.selectAtType();
          civil.civilForm.civilNamesTab.enterAtLastName();
          civil.civilForm.civilNamesTab.enterAtFirstName();
          civil.civilForm.civilNamesTab.selectAtNameInNameSearchHelpWindow();
          civil.switchToCivilForm();
          civil.civilForm.civilNamesTab.clickToBeServedCheckBox();
          civil.civilForm.civilNamesTab.clickAddButton();
          civil.civilForm.civilNamesTab.verifyDistrictAcknowledgeMessage();
          civil.switchToCivilForm();
          civil.civilForm.civilNamesTab.selectDistrict();
          civil.switchToCivilForm();
          civil.civilForm.civilNamesTab.clickAddButton();
          civil.civilForm.civilNamesTab.verifyAtTypeInGrid(0);
          civil.civilForm.saveScreen();
          civil.switchToCivilForm();
          civil.civilForm.clickServiceTab();
          civil.civilForm.civilServiceTab.clickAddButton();
          civil.civilForm.civilServiceTab.verifyServiceAcknowledgeMessage();
          civil.switchToCivilForm();
          civil.civilForm.clickServiceTab();
          civil.civilForm.civilServiceTab.enterDateandTimeAsPreviousDate();
          civil.civilForm.civilServiceTab.verifyPriorDateConfirmMessage();
          civil.civilForm.civilServiceTab.selectActionAsServed();
          civil.civilForm.civilServiceTab.verifyAtName();
          civil.civilForm.civilServiceTab.selectReason();
          civil.civilForm.civilServiceTab.enterLocation();
          civil.civilForm.civilServiceTab.selectDistrict();
          civil.switchToCivilForm();
          civil.civilForm.civilServiceTab.enterNarrative();
          civil.civilForm.civilServiceTab.clickAddButton();
          civil.civilForm.saveScreen();
          civil.switchToCivilForm();
          civil.civilForm.verifyStatusAsClosed();
          civil.civilForm.verifyStatusAsServed();
          civil.civilForm.verifyAtCivilID();
          civil.civilForm.clickPropertyTab();
          civil.civilForm.civilPropertyTab.verifyAtLocation(0);
          civil.civilForm.civilPropertyTab.verifyAtSaleDateAsCurrentDate(0);
          civil.switchToCivilForm();
      }

      @Test 
      public void Police2017SprintCivilModule_155203(ITestContext testContext)
      {
    	  testContext.setAttribute("testID","155203");
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("District");
          civil.switchToDistrict();
          civil.district.clickAddNew();
          civil.switchToDistrictCode();
          civil.districtCode.enterAtDistrict();
          civil.districtCode.enterAtCity();
          civil.districtCode.enterAtMileage();
          civil.districtCode.enterAtPostLocation();
          civil.districtCode.clickAddButton();
          civil.districtCode.verifyAtPostLocation(0);
          civil.districtCode.clickAtPostLocationInGrid();
          civil.districtCode.verifyAtAddressInPostLocationField();
          civil.districtCode.clickAtPostLocationInGrid();
          civil.districtCode.verifyAtAddressInPostLocationField();
          civil.districtCode.clickInactiveCheckBox();
          civil.districtCode.verifyInactiveDateAsCurrentDate();
          civil.districtCode.clickAddButton();
          civil.districtCode.save();
          civil.districtCode.close();
          civil.switchToDistrict();
          civil.district.enterAtDistrict();
          civil.district.clickSearchButton();
          civil.district.verifyNoRecordAcknowledgeMessge();
          civil.switchToDistrict();
          civil.district.clickInactiveCheckBox();
          civil.district.clickSearchButton();
          civil.district.verifyAtCity(0);
          civil.district.verifyAtDistrict(0);
      }

     @Test
     public void Police2017SprintCivilModule_155212(ITestContext testContext)
      {
    	 testContext.setAttribute("testID","155212");
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("District");
          civil.switchToDistrict();
          civil.district.clickSearchButton();
          civil.district.deleteAtDistrictRow();
          civil.district.verifyConfirmDeleteMessage();
          civil.district.clickSearchButton();
          civil.district.verifyDistrictRowCount();

      }

//police MJ
     @Test 
     public void Police2017SprintCivilModule_155961()   //Police MJ
      {
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("Payment");
          civil.switchToPayment();
          civil.payment.clickReset();
          civil.payment.enterAtInvoiceID();
          civil.payment.verifyAtName();
          civil.payment.verifyAtAddress();
          civil.payment.verifyAtCivilIDInGrid(0);  //issue reported
            civil.payment.clickInvoiceNoInfoIcon();
            civil.switchToCivilForm();
             civil.civilForm.closeScreen();
          civil.switchToPayment();
          civil.payment.clickPaymentMethodIconInGrid(0);
          civil.payment.verifyAtPopupCivilID();
          civil.payment.selectPopupPaymentMethodAsCreditcard();
          civil.payment.verifyCreditcardNoDisplayed();
          civil.payment.selectPopupPaymentMethodAsCheck();
          civil.payment.verifyCheckNoDisplayed();
          civil.payment.selectPopupPaymentMethodAsCash();
          civil.payment.enterPopupAmountAs9999();
          civil.payment.verifyPaymentExceedAcknowledgeMessage();
          civil.payment.enterAtPopupAmount();
          civil.payment.enterPopupComments();
          civil.payment.clickSaveButton();
          popUp.confirm.yes();
          popUp.acknowledge.ok();
          civil.switchToPayment();
          civil.payment.verifyBalanceAs0InGrid(0);
          civil.payment.clickPrintReceiptButton();
          home.switchToSelectReport();
          home.selectReport.ClickCivilPaymentReportRecord();
          home.switchToPnxReportSSRSPDFScreen();
          home.pnxReportSSRSPDFScreen.ClosePnxReportSSRSPDFScreen();
          home.switchToSelectReport();
          home.selectReport.CloseTheScreen();   
          civil.switchToPayment();
      }


      @Test 
      public void Police2017SprintCivilModule_155965()
      {
    	  
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("Civil Search");
          civil.switchToCivilSearch();
          civil.civilSearch.enterAtCivilProcessNo();
          civil.civilSearch.clickSearchButton();
          civil.civilSearch.selectAtCivilNoInGrid();
          civil.switchToCivilForm();
          civil.civilForm.clickPaperButton();
          civil.switchToPaperEntry();
          civil.paperEntry.clickAtCodeInGrid();
          civil.switchToPaperInfoEntry();
          civil.paperEntry.clickPaperInfoDistrictLookup();
          popUp.switchToCodedSearch();
          popUp.kPICodedLookup.clickClearIcon();
          popUp.kPICodedLookup.enterAtDistrict();
          popUp.kPICodedLookup.clickIncludeInactiveCheckBox();
          popUp.kPICodedLookup.clickSearchIcon();
          popUp.kPICodedLookup.verifyAtDisrictInGridrow(0);
          popUp.kPICodedLookup.verifyInactiveDistrictRowColor(0);   // isue reported
          popUp.kPICodedLookup.closeScreen();
          civil.switchToPaperInfoEntry();
          civil.paperEntry.closeScreen();
          civil.switchToPaperEntry();
          civil.paperEntry.closeScreen();
          civil.switchToCivilForm();
          civil.civilForm.clickNamesTab();
          civil.civilForm.civilNamesTab.clickDistrictLookupButton();
          popUp.switchToCodedSearch();
          popUp.kPICodedLookup.enterAtDistrict();
          popUp.kPICodedLookup.clickIncludeInactiveCheckBox();
          popUp.kPICodedLookup.clickSearchIcon();
          popUp.kPICodedLookup.verifyAtDisrictInGridrow(0);
          popUp.kPICodedLookup.verifyInactiveDistrictRowColor(0);
          popUp.kPICodedLookup.closeScreen();
          civil.switchToCivilForm();
          civil.civilForm.closeScreen();

      }

     @Test 
     public void Police2017SprintCivilModule_158142()
      {
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("Civil Search");
          civil.switchToCivilSearch();
          civil.civilSearch.enterAtCivilRefID();
          civil.civilSearch.clickSearchButton();
          civil.civilSearch.verifyAtCivilID(1);
          civil.civilSearch.selectAtCivilNoInGrid();
          civil.switchToCivilForm();
          civil.civilForm.verifyAtCivilID();
          civil.civilForm.clickNamesTab();
          civil.civilForm.civilNamesTab.verifyAtNameInGrid(0);
          civil.civilForm.civilNamesTab.selectAtNameInGrid();
          civil.civilForm.civilNamesTab.verifyPrimaryContactCheckBoxChecked();
          civil.civilForm.civilNamesTab.clickClearButton();
          civil.civilForm.civilNamesTab.selectAtType();
          civil.civilForm.civilNamesTab.clickPrimaryContactCheckBox();
          civil.civilForm.civilNamesTab.enterAtLastName();
          civil.civilForm.civilNamesTab.enterAtFirstName();
      //    NamesScripts.NamesTestContext = CivilTestContext;
          civil.civilForm.civilNamesTab.selectAtNameInNameSearchHelpWindow();
          civil.switchToCivilForm();
          civil.civilForm.civilNamesTab.clickToBeServedCheckBox();
          civil.civilForm.civilNamesTab.selectDistrict();
          civil.switchToCivilForm();
          civil.civilForm.civilNamesTab.clickAddButton();
          civil.civilForm.civilNamesTab.verifyAtTypeInGrid(2);
          civil.civilForm.saveScreen();
          civil.switchToCivilForm();
          civil.civilForm.civilNamesTab.selectAtName1InGrid();
          civil.civilForm.civilNamesTab.verifyPrimaryContactCheckBoxChecked();
          civil.civilForm.closeScreen();
      }

     @Test 
     public void Police2017SprintCivilModule_158143()
      {
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("Civil Statement");
          civil.switchToCivilStatement();
        //  civil.civilStatement.verifyStatusAsCompleted();  need to create job server
          civil.civilStatement.clickSearchButton();
          civil.switchToCivilStatementEntry();
          civil.civilStatement.verifySelectAllCheckboxChecked();
          civil.civilStatement.clickCreateStatementButton();
     //     home.switchToSelectReport();
     //     home.selectReport.CloseTheScreen();
          civil.switchToCivilStatement();
          civil.civilStatement.verifyStatusAsNew();
          civil.civilStatement.verifyFlagIconInApproveColumn(0);
          civil.civilStatement.clickFlagIconInGrid(0);
          civil.civilStatement.verifyApprovedConfirmMessage();
          civil.switchToCivilStatement();
          civil.civilStatement.verifyStatusAsApprovedInProcess();
          civil.civilStatement.verifySearchButtonDisabled();

      }


      @Test 
      public void Police2017SprintCivilModule_158780()   //Multi Juris
      {
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
        //  login.loginScreen.ClickCJISpolicyCheckBox();
        //  login.loginScreen.ClickCJISpolicyOK();
          loader.navigateToModule("CIVIL");
          loader.navigateToScreen("Paper Type");
          civil.switchToPaperType();
          civil.paperType.selectJurisAsSO();
          civil.paperType.clickSearch();
          civil.paperType.selectPaperTypeInGrid();
          civil.switchToPaperEntry();
          civil.paperEntry.saveScreen();
          civil.paperEntry.closeScreen();
        //  civil.paperType.selectJurisAsPX();
        //  civil.paperType.clickSearch();
       //   civil.paperType.selectPaperTypeInGrid();
       //   civil.switchToPaperEntry();
        //  civil.paperEntry.saveScreen();
       //   civil.paperEntry.closeScreen();
          civil.paperType.selectJurisAsBL();
          civil.paperType.clickSearch();
          civil.paperType.selectPaperTypeInGrid();
          civil.switchToPaperEntry();
          civil.paperEntry.saveScreen();
          civil.paperEntry.closeScreen();
          civil.paperType.selectJurisAsBE();
          civil.paperType.clickSearch();
          civil.paperType.selectPaperTypeInGrid();
          civil.switchToPaperEntry();
          civil.paperEntry.saveScreen();
          civil.paperEntry.closeScreen();
      }

      @Test
      public void Police2018SprintCivilModule_199138(ITestContext testContext)
      {
    	  testContext.setAttribute("testID","199138");
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("Civil Search");
          civil.switchToCivilSearch();
          civil.civilSearch.enterAtCivilProcessNo();
          civil.civilSearch.clickSearchButton();
          civil.civilSearch.verifyAtStatus(1, 8);
          civil.civilSearch.selectAtCivilIDInGrid();
          civil.switchToCivilForm();
          civil.civilForm.clickNamesTab();
          civil.civilForm.civilNamesTab.selectTypeAsDefendant();
          civil.civilForm.civilNamesTab.enterAtNameID();
          civil.civilForm.civilNamesTab.clickNameInfoIcon();
          names.switchToNameEntry();
          names.nameEntry.clearAddess();
          names.nameEntry.EnterAtAddress();
          names.nameEntry.ClickSaveButton();
          names.nameEntry.ClickAddressPopupCancelbutton();
          popUp.confirm.yes();
          names.switchToNameEntry();
          names.nameEntry.closeTheScreen();  
          civil.civilForm.civilNamesTab.selectDistrict();
          civil.civilForm.civilNamesTab.clickAddButton();
          civil.civilForm.civilNamesTab.verifyAtAddressInGrid(0);
          civil.civilForm.saveScreen();
          civil.switchToCivilForm();

      }
      
      
   @Test 
   public void Civilforms_203134(ITestContext testContext)
    {
	   testContext.setAttribute("testID","203134");
        Browser.NavigateToLoginScreen();
        login.loginScreen.Logon();
        loader.navigateToModule(" Civil");
        loader.navigateToScreen("Civil Search");
        civil.switchToCivilSearch();
        civil.civilSearch.selectAtPaperType();
        civil.civilSearch.enterAtCivilRefID();
        civil.civilSearch.clickSearchButton();
        civil.civilSearch.verifyAtCivilNo(1);
        civil.civilSearch.selectAtCivilIDInGrid();
        civil.switchToCivilForm();
        civil.civilForm.clickServiceTab();
        civil.civilForm.civilServiceTab.verifyNamesMandatoryFields();
        //civil.civilForm.civilServiceTab.verifyLocationDistrictMandantoryFields();     //This fields are not mandatory fields
        civil.civilForm.civilServiceTab.clickAddButton();
        civil.civilForm.saveScreen();
        civil.switchToCivilForm();
    }
   
   
   @Test(groups = {"2020DefectTestCase"})
      public void Police2019SprintCivilModule_205994()
      {
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Civil");
          loader.navigateToScreen("Civil Search");
          civil.switchToCivilSearch();
          civil.civilSearch.selectAtPaperType();
          civil.civilSearch.clickSearchButton();
          civil.civilSearch.verifyAtPaperColumnValues();
          civil.civilSearch.clickBackButton();
          civil.civilSearch.clickResetButton();
          civil.switchToCivilSearch();
          civil.civilSearch.enterAtServiceLocation();
          civil.civilSearch.clickSearchButton();
          civil.civilSearch.verifyAtPaperColumnValues();
          civil.civilSearch.clickBackButton();
          loader.navigateToScreen("Assignment");
          civil.switchToAssignment();
          civil.assignment.clickIncludeAssignedCheckbox();
          civil.assignment.enterAtDistrict();
          civil.assignment.clickSearch();
          civil.assignment.verifyAtServiceAreaValues();

      }
      
      @Test(groups = {"2020DefectTestCase"}) //Automated By Stalin Q3 s4
  	public void ToVerifyCivilFormAssociatesfieldfromNameTabPaperType_281037(ITestContext testContext)
  	{
  		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
  		testContext.setAttribute("testID", "281037");
  		Browser.NavigateToLoginScreen();
  		login.loginScreen.Logon();
  		loader.navigateToModule("Civil");
  		loader.navigateToScreen("Paper Type");
  		civil.switchToPaperType();
  		civil.paperType.clickAddNew();
  		civil.switchToPaperTypeEntry();
  		civil.paperTypesEntry.enterAtCode();
  		civil.paperTypesEntry.verifyPaperTypeCodeExistsAcknowledgePopup();
  		civil.switchToPaperTypeEntry();
  		civil.paperTypesEntry.closeScreen();
  		civil.switchToPaperType();

  		loader.navigateToScreen("Service Action");
  		civil.switchToServiceAction();
  		civil.serviceAction.clickAddNew(); 
  		civil.switchToServiceActionEntry();
//  		civil.serviceAction.clickAddNew();
//  		civil.switchToServiceActionEntry();
  		civil.serviceActionEntry.enterAtCode1();
  		civil.serviceActionEntry.verifyServiceActionCodeAlreadyExistsAcknowledgePopup();
  		civil.switchToServiceActionEntry();
  		civil.serviceActionEntry.closeScreen(); 
  		civil.switchToServiceAction();

  		loader.navigateToScreen("Paper Type");
  		civil.switchToPaperType();
  		civil.paperType.clickAddNew();
  		civil.switchToPaperTypeEntry();
  		civil.paperTypesEntry.enterAtCode2();
  		civil.paperTypesEntry.enterAtDescription();
  		civil.paperTypesEntry.selectAtFeeType();
  		civil.paperTypesEntry.clickAddButton();
  		civil.paperTypesEntry.verifyFeeAmountIsMandatoryAcknowledgePopup();
  		civil.switchToPaperTypeEntry();
  		civil.paperTypesEntry.enterAtPaperFee();
  		civil.paperTypesEntry.clickAddButton();
  		civil.paperTypesEntry.clickSave();
  		civil.paperTypesEntry.verifyPaperFeeIsRequiredAcknowledgePopup();
  		civil.switchToPaperTypeEntry();
  		civil.paperTypesEntry.closeScreen();
  		
  		loader.navigateToScreen("Civil Search");
  		civil.switchToCivilSearch();
  		civil.civilSearch.clickSearchButton();
  		civil.civilSearch.selectAtCivilNoInGrid();
  		civil.switchToCivilForm();
  		civil.civilForm.clickNamesTab();
  		civil.civilForm.civilNamesTab.selectTypeAsDefendant();
  		civil.civilForm.civilNamesTab.enterAtNameID();
  		civil.civilForm.civilNamesTab.clickAssociatesLookupIcon();
  		civil.switchToCivilContact();
  		civil.civilContact.enterAtNameID();
  		civil.civilContact.verifyAssociateIBubbleIsDisplayed();
  		civil.civilContact.clickAddButton();
//  		civil.civilContact.verifyAtPhoneInGrid();
  		civil.civilContact.save();
  		civil.switchToCivilContact();
  		civil.civilContact.selectAtPhoneInGrid();
  		civil.civilContact.clickAddButton();
  		civil.civilContact.verifyAtPhoneInGrid();
  		civil.civilContact.enterAtNameType();
  		civil.civilContact.enterAtLastName();
  		civil.civilContact.enterAtFirstName();
  		names.switchToNameSearchHelpWindow();
  		names.nameSearchHelpWindow.selectAtNameInGrid(); 
  		civil.switchToCivilContact();	
  		civil.civilContact.clickAddButton();
  		civil.civilContact.save();
  		civil.switchToCivilContact();	

  	}
  
    @AfterMethod(groups = {"2020DefectTestCase","DistrictCode","PaperEntry","CivilForms","SmokeTest"})
    public void afteTestMethod(ITestResult testResult) 
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
  		
  	  
    }
    @AfterSuite(groups = {"2020DefectTestCase","DistrictCode","PaperEntry","CivilForms","SmokeTest"})
    public void afterRunSuite()
    {
    	ExtentReport.GenerateHTML();
    	
    	}

}
