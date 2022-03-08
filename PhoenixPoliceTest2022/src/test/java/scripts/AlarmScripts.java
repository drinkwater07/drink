package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Accounting;
//import application.Accounting;
import application.Alarms;
import application.Geo;
import application.Home;
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

public class AlarmScripts {

	public Alarms alarms;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Names names;
	public Geo geo;
	public Accounting accounting;
	public Settings settings;
	public Records records;
	public Home home;
	
	@BeforeSuite(groups = {"AlarmEntryFunctional" ,"2021DefectTestCases" ,"2020DefectTestCase","2020DefectTestCase1"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	
 /* @BeforeMethod
  public void beforeMethod(ITestContext testContext)
  {
	  
	  testContext.setAttribute("moduleName","Alarm" );
	  Playback.testContext=testContext;
	  Playback.start();
      login=new Login();
	  loader=new Loader();		
	  objectIdentification= new ObjectIdentification();	    
      popup = new Popup();
      alarms= new Alarms();
      names = new Names();
      geo = new Geo();
    //  accounting = new Accounting();
      settings = new Settings();
	  records = new Records();
	  home = new Home();
  }
  */
	
	
  @BeforeMethod(groups = {"AlarmEntryFunctional" , "2020DefectTestCase","2021DefectTestCases","2020DefectTestCase1"})
	public void BeforeTestMethodSchedule( ITestContext testContext) 
	{
		testContext.setAttribute("moduleName", "Alarm");		
		Playback.testContext=testContext;
		
		Playback.start();
		 login=new Login();
		  loader=new Loader();		
		  objectIdentification= new ObjectIdentification();	    
	      popup = new Popup();
	      alarms= new Alarms();
	      names = new Names();
	      geo = new Geo();
	      accounting = new Accounting();
	      settings = new Settings();
		  records = new Records();
		  home = new Home();
 }
  
  @Test(groups = { "2020DefectTestCase" }) //Q4 Sprint 5 Automated by mahesha 
	public void VerifyAddedBalanceAndTTDOccurrencesFromAlarmSearch_260819(ITestContext testContext)
	  {
	      ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		  testContext.setAttribute("testID", "260819");
		  
          Browser.NavigateToLoginScreen();
          login.loginScreen.Logon();
          loader.navigateToModule("Alarms");
          loader.navigateToScreen("Alarm Search");
          alarms.switchToAlarmsSearch();
          alarms.alarmSearch.enterAtBalanceAmount();
          alarms.alarmSearch.ClickSearch();
          alarms.alarmSearch.verifyAtBalanceFromGridRow(0);
          String count = alarms.alarmSearch.getRowsCount();
          alarms.alarmSearch.clickPrintButton();
          home.switchToSelectReport();
          home.selectReport.VerifyRecordCount(count);
          home.selectReport.CloseTheScreen();     
          loader.navigateToScreen("Alarm Search");
          alarms.alarmSearch.reloadAlarmSearch();
          alarms.switchToAlarmsSearch();
          alarms.alarmSearch.enterAtTotalYTDOccurrences();
          alarms.alarmSearch.ClickSearch();
          String count1 = alarms.alarmSearch.getRowsCount();
          alarms.alarmSearch.verifyAtYTDOccurrenceFromGridRow(0);
          alarms.alarmSearch.verifyAtYTDOccurrenceFromGridRow(1);
          alarms.alarmSearch.clickPrintButton();
          home.switchToSelectReport();
          home.selectReport.VerifyRecordCount(count1);
          
	  }
  
  @Test(groups = { "AlarmEntryFunctional" })
  public void AlarmFunctionalMainTab_164088(ITestContext testContext)
  {
	  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "164088");

      Browser.NavigateToLoginScreen();
      login.loginScreen.Logon();
      loader.navigateToModule("Alarms");
      loader.navigateToScreen("Alarm Search");

      alarms.switchToAlarmsSearch();
      alarms.alarmSearch.ClickAddNewButton();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.ClickSave();
      alarms.alarmsEntry.Verify1018RequiredEntriesareMissingAckMsg();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.selectAtAlarmType();
     //  alarms.alarmsEntry.EnterAtAlarmLocation();
      alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
      alarms.alarmsEntry.VerifyAtAddress1();
      alarms.alarmsEntry.clickMainTab();
      alarms.alarmsEntry.alarmEntryMainTab.EnterInstalledDateAsCurrentDate();
      alarms.alarmsEntry.alarmEntryMainTab.SelectAlarmCompany();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.clickMainTab();
      alarms.alarmsEntry.alarmEntryMainTab.SelectWaiveNoticeReason();
      alarms.alarmsEntry.alarmEntryMainTab.EnterComments();
      alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
      alarms.alarmsEntry.alarmEntryMainTab.VerifyAtBusinessOrPersonNameID();
      alarms.alarmsEntry.alarmEntryMainTab.VerifyAtAddress1();
      alarms.alarmsEntry.SaveScreen();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.verifyAdditionSuccessfulMessage();
      alarms.alarmsEntry.VerifyNewTabEnabled();

  }
  
@Test(groups = { "AlarmEntryFunctional" })
	        public void AlarmFunctionalContactCreate_164089(ITestContext testContext)
	        {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "164089");

	            String invoiceNo = null;

	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Search");

	            alarms.switchToAlarmsSearch();
	            alarms.alarmSearch.EnterAtAlarmNo();
	            alarms.alarmSearch.SelectAtAlarmType();
	            alarms.alarmSearch.ClickSearch();
	            alarms.alarmSearch.VerifyAtAlarmTypeByAtAlarmNoInGrid();
	            alarms.alarmSearch.VerifyAtAlarmNoRowAppearAsRedColor(0);
	            alarms.alarmSearch.SelectGridRowByAtAlarmNo();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.clickMainTab();
	           alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	            alarms.alarmsEntry.alarmEntryMainTab.VerifyBusinessPersonNameFieldsEmpty();
	            alarms.alarmsEntry.alarmEntryMainTab.EnterAtBusinessOrPersonLastName();
	            alarms.alarmsEntry.alarmEntryMainTab.EnterAtBusinessOrPersonFirstName();
	            names.nameSearchHelpWindow.SelectName();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.SaveScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.alarmEntryMainTab.ClickNotRegisteredCreateInvoiceButton();
	            alarms.alarmsEntry.alarmEntryMainTab.VerifyRegisteredViewInvoiceButtonDisplayed();
	            alarms.alarmsEntry.alarmEntryMainTab.ClickRegisteredVieweInvoiceButton();
	            accounting.SwitchToInvoiceEntry();
	            accounting.invoiceEntry.VerifyAtBillToAccountLastName();
	            accounting.invoiceEntry.VerifyAtBillToAccountFirstName();
	            accounting.invoiceEntry.GetInvoiceNo(invoiceNo);
	            accounting.invoiceEntry.close();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.alarmEntryMainTab.VerifyInvoiceNo(Playback.getTestContextAttribute("invoiceNo"));
	            alarms.alarmsEntry.alarmEntryMainTab.ClickEnterNewNameButton();
	            geo.switchToContactEntry();
	            geo.contactEntryScreen.SelectAtNameRelation();
	            geo.contactEntryScreen.enterAtLastName();
	            geo.contactEntryScreen.enterAtFirstName();
	            geo.contactEntryScreen.EnterAtAddress();
	            geo.contactEntryScreen.SelectPhoneType1();
	            geo.contactEntryScreen.EnterPhoneNumber1();
	            geo.contactEntryScreen.SelectPhoneType2();
	            geo.contactEntryScreen.EnterPhoneNumber2();
	            geo.contactEntryScreen.SaveCloseScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.alarmEntryMainTab.verifyAtBillingContactDropDownList();

	        }

@Test(groups = { "AlarmEntryFunctional" })
	        public void AlarmFunctionalContactTab_164090(ITestContext testContext)
	        {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "164090");
	          
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Search");

	            alarms.switchToAlarmsSearch();
	            // alarms.alarmSearch.EnterAtAlarmLocation();
	            alarms.alarmSearch.EnterAtAlarmNo();
	            alarms.alarmSearch.SelectAtAlarmType();
	            alarms.alarmSearch.ClickSearch();
	            alarms.alarmSearch.VerifyAtAlarmTypeInGrid(0);
	            alarms.alarmSearch.VerifyAtAlarmNoRowAppearAsRedColor(0);
	            alarms.alarmSearch.SelectGridRowByAtAlarmNo();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.SwitchToContactTab();
	            alarms.alarmsEntry.alarmEntryContactTab.clickAddNewButton();
	            geo.switchToContactEntry();
	            geo.contactEntryScreen.SelectAtNameRelation();
	            geo.contactEntryScreen.ClickPrimaryContactCheckbox();
	            Playback.controlReadyThreadWait();
	            geo.contactEntryScreen.ClickBusinessRadioButton();
	            geo.contactEntryScreen.enterAtLastName();
	            geo.contactEntryScreen.EnterAtAddress();
	            geo.contactEntryScreen.SelectPhoneType1();
	            geo.contactEntryScreen.EnterPhoneNumber1();
	            geo.contactEntryScreen.SelectPhoneType2();
	            geo.contactEntryScreen.EnterPhoneNumber2();
	            geo.contactEntryScreen.SaveCloseScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.SaveScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.SwitchToContactTab();
	            alarms.alarmsEntry.alarmEntryContactTab.VerifyAtName(0);
	            alarms.alarmsEntry.alarmEntryContactTab.VerifyPrimaryCheckboxCheckedByAtName();
	            alarms.alarmsEntry.alarmEntryContactTab.ClickIncludeInactiveCheckbox();
	            alarms.alarmsEntry.alarmEntryContactTab.ClickSearchButton();
	            alarms.alarmsEntry.alarmEntryContactTab.VerifyAtNameRowAppearGrayColor(0);
	            alarms.alarmsEntry.alarmEntryContactTab.SaveInternalTab();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.SaveScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.VerifyUpdatedSuccessfulMsg();
	            
	        }


@Test(groups = { "AlarmEntryFunctional" })
		public void AlarmFunctionalProcessFalseAlarmTab_164091(ITestContext testContext)
		{
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "164091");
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Search");

	            alarms.switchToAlarmsSearch();
	            alarms.alarmSearch.EnterAtBusinessOrPersonLastName();
	            alarms.alarmSearch.EnterAtBusinessOrPersonFirstName();
	            names.nameSearchHelpWindow.SelectName();
	            alarms.switchToAlarmsSearch();
	            alarms.alarmSearch.EnterAtAddress();
	            alarms.alarmSearch.ClickSearch();
	            alarms.alarmSearch.VerifyAtAddress();
	            alarms.alarmSearch.SelectGridRowByAtBusinessName();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	            alarms.alarmsEntry.processFalseAlarmTab.ClearCallNo();
	            alarms.alarmsEntry.processFalseAlarmTab.EnterAtCallNo();
	            Playback.controlReadyThreadWait();
	            alarms.alarmsEntry.processFalseAlarmTab.VerifyAtCADCFS();
	            alarms.alarmsEntry.processFalseAlarmTab.VerifyRemoveRadioButtonEnabled();
	            alarms.alarmsEntry.processFalseAlarmTab.VerifyProcessButtonEnabled();
	            alarms.alarmsEntry.processFalseAlarmTab.VerifyCancelButtonEnabled();
	            alarms.alarmsEntry.processFalseAlarmTab.ClickRemoveRadioButton();
	            alarms.alarmsEntry.processFalseAlarmTab.EnterReasonForRemovalEdit();
	            alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
	            alarms.alarmsEntry.SaveScreen();
	            alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	            alarms.alarmsEntry.processFalseAlarmTab.EnterAtCallNo1();
	            alarms.alarmsEntry.processFalseAlarmTab.Click1stAlarmCharge25RadioButton();
	            alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
	            alarms.alarmsEntry.SaveScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.VerifyUpdatedSuccessfulMsg();

	        }

@Test(groups = { "AlarmEntryFunctional" })
	        public void AlarmFunctionalTransactionHistoryTab_164092(ITestContext testContext)
	        {
	            ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "164092");

	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Search");

	            alarms.switchToAlarmsSearch();
	            alarms.alarmSearch.EnterAtAlarmNo();
	            alarms.alarmSearch.SelectAtAlarmType();
	            alarms.alarmSearch.ClickSearch();
	            alarms.alarmSearch.VerifyAtAlarmTypeByAtAlarmNoInGrid();
	            alarms.alarmSearch.SelectGridRowByAtAlarmType();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.ClickTransactionHistoryTab();
	            alarms.alarmsEntry.transactionHistoryTab.VerifyAtPFUsingTypeInGrid();
	            alarms.alarmsEntry.transactionHistoryTab.VerifyAtTypeInGrid();
	            alarms.alarmsEntry.transactionHistoryTab.ClickAddButton();
	            alarms.alarmsEntry.transactionHistoryTab.Verify1018RequiredEntriesAreMissingAckMsg();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.ClickTransactionHistoryTab();
	            alarms.alarmsEntry.transactionHistoryTab.TabOutUpdatedDate();
	            alarms.alarmsEntry.transactionHistoryTab.EnterAtUpdatedBy();
	            alarms.alarmsEntry.transactionHistoryTab.EnterAtNotes();
	            alarms.alarmsEntry.transactionHistoryTab.ClickAddButton();
	            alarms.alarmsEntry.transactionHistoryTab.VerifyAtNotesInGrid();
	            alarms.alarmsEntry.SaveScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.VerifyUpdatedSuccessfulMsg();
	        }

		@Test(groups = { "AlarmEntryFunctional" })
		public void AlarmFunctionalInvoicesTab_164093(ITestContext testContext)
		  {
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testContext.setAttribute("testID", "164093");

	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Search");

	            alarms.switchToAlarmsSearch();
	            alarms.alarmSearch.EnterAtAlarmNo();
	           //  alarms.alarmSearch.EnterAtAlarmLocation();
	            alarms.alarmSearch.ClickSearch();
	            alarms.alarmSearch.VerifyAtAlarmTypeByAtAlarmNoInGrid();
	            alarms.alarmSearch.SelectGridRowByAtAlarmType();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.ClickInvoicesTab();
	            alarms.alarmsEntry.invoicesTab.SelectInvoiceTypeAsRegistration();
	            alarms.alarmsEntry.invoicesTab.ClickSearchButton();
	            alarms.alarmsEntry.invoicesTab.VerifyInvoiceTypeAsRegistrationInGrid();
	            alarms.alarmsEntry.invoicesTab.SelectInvoiceTypeAsFalseAlarm();
	            alarms.alarmsEntry.invoicesTab.ClickSearchButton();
	            alarms.alarmsEntry.invoicesTab.VerifyInvoiceTypeAsFalseAlarmInGrid();
	            alarms.alarmsEntry.invoicesTab.SelectGridRowByFalseAlarm();
	           accounting.SwitchToInvoiceEntry();
	           accounting.invoiceEntry.VerifyInvoiceTypeAsFalseAlarm();
	           accounting.invoiceEntry.close();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.SaveScreen();
	            alarms.switchToAlarmsEntry();
	            alarms.alarmsEntry.VerifyUpdatedSuccessfulMsg();

	        }

            @Test(groups = { "AlarmEntryFunctional" })
	    	public void AlarmFunctionalAlarmCFSEntryDispositionTab_164094(ITestContext testContext)
		    {
            	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			    testContext.setAttribute("testID", "164094");

	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Type");

	            alarms.switchToAlarmType();
	            alarms.alarmType.ClickAddNewButton();
	            alarms.switchToAlarmsCFSEntry();
	            alarms.alarmCFSEntry.ClickSaveButton();
	            alarms.alarmCFSEntry.Verify1018RequiredEntriesAreMissingAlarmTypeAckMsg();
	            alarms.switchToAlarmsCFSEntry();
	            alarms.alarmCFSEntry.EnterAtAlarmType();
	            alarms.alarmCFSEntry.EnterAtDescription();
	            alarms.alarmCFSEntry.ClickSaveButton();
	            alarms.alarmCFSEntry.Verify1018RequiredEntriesAreMissingCADCFSAckMsg();
	            alarms.switchToAlarmsCFSEntry();
	            alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
	            alarms.alarmCFSEntry.cADCFSAndDispositionTab.EnterAtCADCFS();
	            alarms.alarmCFSEntry.cADCFSAndDispositionTab.EnterAtDisposition();
	            alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickAddButton();
	            alarms.alarmCFSEntry.cADCFSAndDispositionTab.VerifyAtCADCFSInGrid();
	            alarms.switchToAlarmsCFSEntry();
	            alarms.alarmCFSEntry.ClickSaveButton();
	            alarms.alarmCFSEntry.Verify1018RequiredEntriesAreMissingRegTypeAckMsg();
	            alarms.switchToAlarmsCFSEntry();
	            alarms.alarmCFSEntry.SelectAtRegistrationType();
	            alarms.alarmCFSEntry.ClickFeesAndSettingsTab();
	            alarms.alarmCFSEntry.feesAndSettingsTab.EnterAtRegistrationFee();
	            alarms.alarmCFSEntry.SaveScreen();
	            alarms.alarmCFSEntry.VerifyAdditionSuccessfulMsg();
	            alarms.alarmCFSEntry.closeScreen();
	            alarms.switchToAlarmType();  
	            objectIdentification.manualIdentify.reloadScreen("Alarm Type");
	            alarms.switchToAlarmType();
	            alarms.alarmType.VerifyAtAlarmTypeByUsingCADCFSCodeInGrid();


	        }

            @Test(groups = { "AlarmEntryFunctional" })
	        public void AlarmFunctionalAlarmCompanySearch_164095(ITestContext testContext)
	        {
            	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "164095");
	    		
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Company Search");

	            alarms.switchToAlarmCompanySearch();
	            alarms.alarmCompanySearch.ClickAddNewButton();
	            alarms.switchToNameEntry();
	            alarms.nameEntry.ClickSaveButton();
	            alarms.nameEntry.Verify1018RequiredEntriesAreMissingAckMsg();
	            alarms.switchToNameEntry();
	            alarms.nameEntry.EnterAtBusinessID();
	            alarms.nameEntry.EnterAtName();
	            alarms.nameEntry.EnterAtAddress();
	            alarms.nameEntry.Save();
	            alarms.nameEntry.Verify1002AdditionSuccessfulMessage();
	            alarms.nameEntry.Close();
	            alarms.switchToAlarmCompanySearch();
	            alarms.alarmCompanySearch.EnterAtCompanyCode();
	            alarms.alarmCompanySearch.EnterAtCompanyName();
	            alarms.alarmCompanySearch.ClickSearchButton();
	            Playback.pageLoadThreadWait();
	            alarms.alarmCompanySearch.VerifyAtName(0);
	            alarms.alarmCompanySearch.VerifyAtCompanyCode(0);
	            alarms.alarmCompanySearch.VerifyAtZip(0);

	        }
            
            @Test(groups = { "AlarmEntryFunctional" })
            public void AlarmFunctionalContactTabVerify_216166(ITestContext testContext)
            {
            	
            	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "216166");
	    		
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Search");
            	
                alarms.switchToAlarmsSearch();
                alarms.alarmSearch.ClickAddNewButton();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.selectAtAlarmType();
                alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
                alarms.alarmsEntry.clickMainTab();
                alarms.alarmsEntry.alarmEntryMainTab.EnterInstalledDateAsPreviousDate();
                alarms.alarmsEntry.alarmEntryMainTab.SelectAlarmCompany();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.clickMainTab();
                alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
                alarms.alarmsEntry.SaveScreen();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.SwitchToContactTab();
                alarms.alarmsEntry.alarmEntryContactTab.clickAddNewButton();
                geo.switchToContactEntry();
	            geo.contactEntryScreen.SelectAtNameRelation();
	            geo.contactEntryScreen.ClickPrimaryContactCheckbox();
	            Playback.controlReadyThreadWait();
	            geo.contactEntryScreen.ClickBusinessRadioButton();
	            geo.contactEntryScreen.enterAtLastName();
	            geo.contactEntryScreen.EnterAtAddress();
	            geo.contactEntryScreen.SelectPhoneType1();
	            geo.contactEntryScreen.EnterPhoneNumber1();
	            geo.contactEntryScreen.SelectPhoneType2();
	            geo.contactEntryScreen.EnterPhoneNumber2();
	            geo.contactEntryScreen.SaveCloseScreen();
	            alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.SaveScreen();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.SwitchToContactTab();
                alarms.alarmsEntry.alarmEntryContactTab.VerifyAtName(0);
                alarms.alarmsEntry.alarmEntryContactTab.SaveInternalTab();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.VerifyUpdatedSuccessfulMsg();

            }
            @Test(groups = { "AlarmEntryFunctional" })
            public void AlarmFunctionalCFSEntryFeeTab_214895(ITestContext testContext)
            {
            	
            	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "214895");
	    		
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Settings");
	            loader.navigateToScreen("System Parameter");
	            settings.switchToSystemParamter();
	            settings.sysParameter.setSystemparameter1804AsFutureDate();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Search");
            	
                alarms.switchToAlarmsSearch();
                alarms.alarmSearch.EnterAtAlarmNo();
                alarms.alarmSearch.EnterAtAlarmCompany();
                alarms.alarmSearch.ClickSearch();
                alarms.alarmSearch.VerifyAtAlarmNoRowAppearAsRedColor(0);
                alarms.alarmSearch.SelectGridRowByAtAlarmNo();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.VerifyAtAlarmNo();
                alarms.alarmsEntry.VerifyTotalOccurrenceAs0();
                alarms.alarmsEntry.ClickProcessFalseAlarmTab();
                alarms.alarmsEntry.processFalseAlarmTab.EnterAtCallNo();
                alarms.alarmsEntry.processFalseAlarmTab.ClickNonChargeableRadioButton();
                alarms.alarmsEntry.processFalseAlarmTab.EnterForResonNonChargable();
                alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
                alarms.alarmsEntry.SaveScreen();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.ClickTransactionHistoryTab();
                alarms.alarmsEntry.transactionHistoryTab.VerifyAtPFUsingTypeInGrid();
                alarms.alarmsEntry.transactionHistoryTab.VerifyAtCallNoInGrid(0);
                alarms.alarmsEntry.transactionHistoryTab.ClickCallInfoIconInGrid();
                records.switchToCallEntry();
                records.callEntry.verifyAtCallNo();
                records.callEntry.closeScreen();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.ClickInvoicesTab();
                alarms.alarmsEntry.invoicesTab.VerifyInvoiceTypeAsFalseAlarmInGrid();
                alarms.alarmsEntry.invoicesTab.VerifyBalanceAsZeroUsingInvoiceTypeInGrid();
                alarms.alarmsEntry.invoicesTab.VerifyBalanceAsZero();
                alarms.alarmsEntry.VerifyTotalOccurrenceAs1();
                alarms.alarmsEntry.VerifyChargeableOccurrencesAs0();

            }
            @Test(groups = { "AlarmEntryFunctional" })
            public void AlarmFunctionalCFSEntryTabs_212270(ITestContext testContext)
            {
            	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "212270");
	    		
	            Browser.NavigateToLoginScreen();
	            login.loginScreen.Logon();
	            loader.navigateToModule("Alarms");
	            loader.navigateToScreen("Alarm Type");
                alarms.switchToAlarmType();
                alarms.alarmType.ClickAddNewButton();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.EnterAtAlarmType();
                alarms.alarmCFSEntry.EnterAtDescription();
                alarms.alarmCFSEntry.SelectAtRegistrationType();
                alarms.alarmCFSEntry.ClickSaveButton();
                alarms.alarmCFSEntry.Verify1018RequiredEntriesAreMissingCADCFSAckMsg();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.EnterAtCADCFS();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.EnterAtDisposition();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickAddButton();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.VerifyAtCADCFSInGrid();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.verifyAtDispositionInGrid();
                alarms.alarmCFSEntry.SaveScreen();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.DeleteAtCADCFSDescriptionRow();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.VerifyAtleastOneRecordAcknowledgeMessage();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickCADCFSLookup();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.SelectCADCFSDescription1InPopup();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickDispostionLookup();
          
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.SelectDispositionDescription1InPopup();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickAddButton();
                alarms.alarmCFSEntry.SaveScreen();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.ClickFeesAndSettingsTab();
                alarms.alarmCFSEntry.feesAndSettingsTab.EnterAtRegistrationFee();
                alarms.alarmCFSEntry.feesAndSettingsTab.EnterUnregisteredAlarmFineAmountFee();
                alarms.alarmCFSEntry.feesAndSettingsTab.EnterFirstAlarmAmount();
                alarms.alarmCFSEntry.feesAndSettingsTab.EnterSecondAlarmAmount();
                alarms.alarmCFSEntry.SaveScreen();
                alarms.switchToAlarmsCFSEntry();
                alarms.alarmCFSEntry.VerifyUpdatedSuccessfulMsg();

            }
            @Test(groups = { "AlarmEntryFunctional" })
            public void AlarmFunctionalFalseAlarmProcess_212269(ITestContext testContext)
            {
            	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	    		testContext.setAttribute("testID", "212269");
	    		  Browser.NavigateToLoginScreen();
		            login.loginScreen.Logon();
		            loader.navigateToModule("Settings");
		            loader.navigateToScreen("System Parameter");
		            settings.switchToSystemParamter();
		            settings.sysParameter.setSystemparameter1804AsFutureDate();
		            loader.navigateToModule("Alarms");
		            loader.navigateToScreen("False Alarms");
            	
                String alarmNo =null;
                String status = null;
          
                alarms.switchToFalseAlarms();
                alarms.falseAlarms.ClickSearchButton();
                alarms.falseAlarms.ClickAtCallNoInGrid();
                alarms.falseAlarms.VerifyAlarmNotFoundConfirmMessage();
                Playback.pageLoadThreadWait();
                alarms.switchToAlarmsEntry();
                Playback.pageLoadThreadWait();
                alarms.alarmsEntry.ClickProcessFalseAlarmTab();
                alarms.alarmsEntry.processFalseAlarmTab.ClickRemoveRadioButton();
                alarms.alarmsEntry.processFalseAlarmTab.VerifyResonForRemovalMandatory();
                alarms.alarmsEntry.processFalseAlarmTab.EnterReasonForRemovalEdit();
                status=  alarms.alarmsEntry.processFalseAlarmTab.readReasonForRemoval();
                alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
                alarms.alarmsEntry.SaveScreen();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.VerifyLastNameAsCurrentOwner();
                alarmNo =   alarms.alarmsEntry.readAlarmNo();
                alarms.alarmsEntry.CloseScreen();
                loader.navigateToScreen("False Alarms");
                alarms.switchToFalseAlarms();
                alarms.falseAlarms.ClickRemovedOnlyCheckbox();
                alarms.falseAlarms.ClickSearchButton();
                alarms.falseAlarms.VerifyAlarmUsingCallNo(alarmNo);
                alarms.falseAlarms.VerifyAtCallNoUsindCADCFS();
                alarms.falseAlarms.VerifyStatusUsingCallNo(status);
                alarms.falseAlarms.ClickAtCallNoInGrid();
                alarms.falseAlarms.VerifyReopenConfirmMessage();
                alarms.switchToAlarmsEntry();
                
                loader.navigateToScreen("Alarm Search");
                alarms.switchToAlarmsSearch();
                alarms.alarmSearch.EnterAlarmNo(alarmNo);
                alarms.alarmSearch.ClickSearch();
                alarms.alarmSearch.VerifyAtAddress();
                alarms.alarmSearch.SelectGridRowByAtAddress();
                alarms.switchToAlarmsEntry();
                alarms.alarmsEntry.VerifyLastNameAsCurrentOwner();
                alarms.alarmsEntry.ClickProcessFalseAlarmTab();
                alarms.alarmsEntry.processFalseAlarmTab.VerifyAtCADCFS();
                alarms.alarmsEntry.processFalseAlarmTab.VerifyAtDisposition();
                alarms.alarmsEntry.processFalseAlarmTab.ClickNonChargeableDonotChargeRadioButton();
                alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
                alarms.alarmsEntry.SaveScreen();
                alarms.switchToAlarmsEntry();
                loader.navigateToScreen("False Alarms");
                alarms.switchToFalseAlarms();
                alarms.falseAlarms.ClickRemovedOnlyCheckbox();
                alarms.falseAlarms.ClickIncludeProcessedCheckbox();
                alarms.falseAlarms.ClickSearchButton();
                alarms.falseAlarms.VerifyStatusAsNotChargedUsingCallNo();

            }

            @Test(groups = { "2020DefectTestCase" })
public void VerifyAddressMergelogicinAlarms_244233(ITestContext testContext)
{
            	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "244233");
      Browser.NavigateToLoginScreen();
      login.loginScreen.Logon();
     loader.navigateToModule("Alarms");
      loader.navigateToScreen("Alarm Entry");
      alarms.switchToAlarmsEntryScreenTab();
      alarms.alarmsEntry.selectAtAlarmType();
      alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
      alarms.alarmsEntry.ClearAlarmLocation();
      alarms.alarmsEntry.ChangeAlarmLocation();
      alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
      alarms.alarmsEntry.SaveNCloseScreen();
      
      
    
      loader.navigateToScreen("Alarm Entry");
      alarms.switchToAlarmsEntryScreenTab();
      alarms.alarmsEntry.selectAtAlarmType();
      alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
      alarms.alarmsEntry.ClearAlarmLocation();
      alarms.alarmsEntry.ChangeAlarmLocation1();
      alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
      alarms.alarmsEntry.SaveScreen();
      alarms.alarmsEntry.selectAtAlarmType();
      alarms.alarmsEntry.SaveNCloseScreen();
      
      loader.navigateToModule("Geo");
      loader.navigateToScreen("Address Search");
      geo.switchToAddressSearchScreen();
      geo.addressSearch.enterAtAddress();
      geo.addressSearch.clickMergeAddressButton();
      geo.addressSearch.mergeAddressPopup.EnterAtMergeToAddress1();
      geo.addressSearch.mergeAddressPopup.ClickMergeButton();
      geo.addressSearch.mergeAddressPopup.VerifyConfirmMessageThisProcessWillTakeSignificationAmoutOfTime();
      
      
      loader.navigateToModule("Alarms");
      loader.navigateToScreen("Alarm Search");
      alarms.switchToAlarmsSearch();
      alarms.alarmSearch.ClickSearch();
      alarms.alarmSearch.SelectGridRowByAtAddress1();
      alarms.switchToAlarmsEntry();
   //   alarms.alarmsEntry.VerifyDuplicateAlarmsExistduetoAlarmaddressmerge();
    //  alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.ClickInactiveChkBox();
      alarms.alarmsEntry.SaveNCloseScreen();
            
      loader.navigateToScreen("Alarm Entry");
      alarms.switchToAlarmsEntryScreenTab();
      alarms.alarmsEntry.selectAtAlarmType();
      alarms.alarmsEntry.ChangeAlarmLocation();
      alarms.alarmsEntry.VerifyAddressInactive();
      alarms.switchToAlarmsEntryScreenTab();
      
 }

@Test(groups = { "2020DefectTestCase" })
public void AlarmLocationBasedNames_244234(ITestContext testContext)
{
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "244234");
      Browser.NavigateToLoginScreen();
      login.loginScreen.Logon();
      loader.navigateToModule("Alarms");
      loader.navigateToScreen("Alarm Entry");
      alarms.switchToAlarmsEntryScreenTab();
      alarms.alarmsEntry.selectAtAlarmType();
      alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
      alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
      alarms.alarmsEntry.SaveScreen();
      alarms.alarmsEntry.selectAtAlarmType();
      alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
      alarms.alarmsEntry.alarmEntryMainTab.EnterAtBillAccount();
      alarms.alarmsEntry.ClearAlarmLocation();
      alarms.alarmsEntry.ChangeAlarmLocation();
      alarms.alarmsEntry.SaveScreen();
      alarms.switchToAlarmsEntry();
      
 }

@Test(groups = { "2020DefectTestCase" }) // Vijay
public void verifyAlarmCompanyMultipleJuris_251107(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "251107");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Company Search");
	alarms.switchToAlarmCompanySearch();
	alarms.alarmCompanySearch.ClickAddNewButton();
	alarms.switchToAlarmCompanyEntry();
	alarms.alarmCompanyEntry.selectJurisAsProPhoenix();
	alarms.alarmCompanyEntry.enterAtBusinessID();
	alarms.alarmCompanyEntry.enterAtName();
	alarms.alarmCompanyEntry.enterAtAddress();
	alarms.alarmCompanyEntry.enterAtPhone1Type();
	alarms.alarmCompanyEntry.enterAtPhone1();
	alarms.alarmCompanyEntry.enterAtPhone2Type();
	alarms.alarmCompanyEntry.enterAtPhone2();
	alarms.alarmCompanyEntry.enterAtEmail();
	alarms.alarmCompanyEntry.saveTheScreen();
	alarms.switchToAlarmCompanyEntry();
	alarms.alarmCompanyEntry.verifyAdditionSuccessful();
	String nameID = alarms.alarmCompanyEntry.readNameTypeID();
	alarms.alarmCompanyEntry.verifyNameType();
	alarms.alarmCompanyEntry.closeTheScreen();
	objectIdentification.windowHandle.switchToMainWindow();
	loader.navigateToModule("Names");
	loader.navigateToScreen("Name Search");
	names.switchToNameSearch();
	names.nameSearch.enterNameID(nameID);
	names.nameSearch.clickSearchButton();
	names.nameSearch.verifyNameID(nameID);
	objectIdentification.windowHandle.switchToMainWindow();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Company Search");
	alarms.switchToAlarmCompanySearch();
	alarms.alarmCompanySearch.ClickAddNewButton();
	alarms.switchToAlarmCompanyEntry();
	alarms.alarmCompanyEntry.selectJurisAsBrownCounty();
	alarms.alarmCompanyEntry.enterAtBusinessID1();
	alarms.alarmCompanyEntry.enterAtName();
	names.switchToNameSearchHelpWindow();
	names.nameSearchHelpWindow.selectNameUsingNameID(nameID);
	alarms.switchToAlarmCompanyEntry();
	alarms.alarmCompanyEntry.saveTheScreen();
	alarms.switchToAlarmCompanyEntry();
	alarms.alarmCompanyEntry.verifyName();
	alarms.alarmCompanyEntry.verifyAddress();
	alarms.alarmCompanyEntry.verifyPhone1();
	alarms.alarmCompanyEntry.verifyPhone2();
	alarms.alarmCompanyEntry.verifyEmail();
	alarms.alarmCompanyEntry.verifyAdditionSuccessful();
	alarms.alarmCompanyEntry.closeTheScreen();
	objectIdentification.windowHandle.switchToMainWindow();
	
	loader.navigateToScreen("Alarm Company Search");
	alarms.switchToAlarmCompanySearch();
	alarms.alarmCompanySearch.selectJurisAsEmpty();
	alarms.alarmCompanySearch.EnterAtCompanyName();
	alarms.alarmCompanySearch.ClickSearchButton();
	alarms.alarmCompanySearch.verifyJurisAsPX();
	alarms.alarmCompanySearch.verifyJurisAsBC();
	objectIdentification.windowHandle.switchToMainWindow();
	
	loader.navigateToScreen("Alarm Search");
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.SelectGridRowByAtBusinessName();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clearAlarmCompany();
	alarms.alarmsEntry.alarmEntryMainTab.clickAlarmCompanyLookup();
	popup.switchToCodedSearch();
	popup.kPICodedLookup.enterAtDescription();
	popup.kPICodedLookup.clickSearchIcon();
	popup.kPICodedLookup.verifyJurisAsPX();
	popup.kPICodedLookup.verifyJurisAsBC();
	popup.kPICodedLookup.selectJurisAsBC();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.verifyUpdateSuccessful();
}



@Test(groups = { "2020DefectTestCase" }) //July Sprint 2 Mahesha
public void PoliceDefect2020_250099(ITestContext testContext)
{
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
         testContext.setAttribute("testID", "250099");    
      Browser.NavigateToLoginScreen();
     
       login.loginScreen.Logon();
       loader.navigateToModule("Records");
                   loader.navigateToScreen("Walk-In Entry");
                   records.switchToWalkInEntry();
                   records.walkInEntry.enterAtCADCFS();
                   records.walkInEntry.tabTheReportedDate();
                   records.walkInEntry.tabTheReportedTime();
                   records.walkInEntry.enterAtLocation();
                   records.walkInEntry.VerifyLocationCheckBoxUnchecked();
                   records.walkInEntry.clickLocationVerifyCheckbox();
                   records.walkInEntry.tabTheReceivedSource();
                   records.walkInEntry.enterAtCADDispositon();
                   records.walkInEntry.enterAtUnit();
                   records.walkInEntry.save();
                   records.switchToCallEntry();
                   
                   String CallNo = records.callEntry.readCallNo();
                   records.callEntry.saveNClose();
                   loader.navigateToModule("Alarms");
               loader.navigateToScreen("False Alarms");
               alarms.switchToFalseAlarms();
               alarms.falseAlarms.clickDeleteCallNoInGrid(CallNo);
               alarms.falseAlarms.verifyDoYouWantDeleteConfirmPopup();
               alarms.switchToFalseAlarms();
               alarms.falseAlarms.ClickIncludeProcessedCheckbox();
               alarms.falseAlarms.ClickSearchButton();
               alarms.falseAlarms.clickDeleteCallNoInGrid();
              alarms.falseAlarms.verifyFalseAlarmCannotBeDeletedAck();
               
              
            loader.navigateToScreen("Alarm Search");

            alarms.switchToAlarmsSearch();
            alarms.alarmSearch.EnterAtAlarmNo();
            alarms.alarmSearch.ClickSearch();
            alarms.alarmSearch.SelectGridRowByAtAlarmNo();
            alarms.switchToAlarmsEntry();
            alarms.alarmsEntry.VerifyNewTabEnabled();
       
                         
               
}

@Test(groups = { "2020DefectTestCase" })  //Automated by Stalin
public void BillingContactfield_257056(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "257056");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Entry");
	alarms.switchToAlarmsEntryScreenTab();

	alarms.alarmsEntry.selectAtAlarmType();
	alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
	alarms.alarmsEntry.verifyAlarmLocationIBubble();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	alarms.alarmsEntry.alarmEntryMainTab.verifyAtBillToAccountNameID();
	alarms.alarmsEntry.alarmEntryMainTab.VerifyAtAddress1();
	alarms.alarmsEntry.SaveScreen(); 
	alarms.switchToAlarmsEntryScreenTab(); 
	alarms.alarmsEntry.verifyAdditionSuccessfulMessage();
	alarms.alarmsEntry.clickMainTab(); 
	alarms.alarmsEntry.alarmEntryMainTab.clickAddress1IBubble();
	geo.switchToAddressSearchHelpWindow();
	geo.addressSearchHelp.switchToContactsTab();
	geo.addressSearchHelp.addressSearchHelpContactTab.clickAddNewButton();
	geo.switchToContactEntry();
	geo.contactEntryScreen.SelectAtNameRelation();
	geo.contactEntryScreen.clickPersonRadioButton();
	geo.contactEntryScreen.enterAtLastName();
	geo.contactEntryScreen.enterAtFirstName();
	names.switchToNameSearchHelpWindow();
	names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
	geo.switchToContactEntry();
	geo.contactEntryScreen.verifyAtCSZ();
	geo.contactEntryScreen.SelectAtPhoneType1();
	geo.contactEntryScreen.EnterAtPhoneNumber1();
	geo.contactEntryScreen.enterAtEmail();
	geo.contactEntryScreen.SaveScreen();
	geo.switchToContactEntry();
	geo.contactEntryScreen.VerifyAdditionSuccessfulMessage();
	geo.contactEntryScreen.CloseScreen();
	geo.switchToAddressSearchHelpWindow();
	geo.addressSearch.CloseScreen();
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.clickResetButton();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickBillingContact();
	alarms.alarmsEntry.alarmEntryMainTab.verifyAtBillingContactDropDownList();
	alarms.alarmsEntry.SwitchToContactTab();
	alarms.alarmsEntry.alarmEntryContactTab.VerifyAtName(0);
	alarms.alarmsEntry.alarmEntryContactTab.verifyAtPhoneInGrid();

}

@Test(groups = { "2020DefectTestCase" })  // Automated by Stalin
public void OfficerColumninNameActivityTab_258914(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "258914");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Entry");
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.selectAtAlarmType();
	alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
	alarms.alarmsEntry.verifyAtAlarmLocation();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	alarms.alarmsEntry.alarmEntryMainTab.verifyAtBillToAccountNameID();
	alarms.alarmsEntry.alarmEntryMainTab.VerifyAtAddress1();
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.clickBusinessOrPersonNameInfoButton();
	names.switchToNameEntry();
	names.nameEntry.switchToActivityTab();
	names.nameEntry.activityTab.VerifyAtActivityType();
	names.nameEntry.activityTab.verifyAtOfficer();

}




@Test(groups = { "2020DefectTestCase" })   //Automated by Stalin
	public void AlarmCFSentryshouldntbringsbluescreen_258311(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "258311");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Alarms");
		loader.navigateToScreen("Alarm Type");
		alarms.switchToAlarmType();
		alarms.alarmType.ClickAddNewButton();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.EnterAtAlarmType();
		alarms.alarmCFSEntry.EnterAtDescription();
		alarms.alarmCFSEntry.SelectAtRegistrationType();
		alarms.alarmCFSEntry.clickTrackFeesYesRadioButton();
		alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickCADCFSLookup();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.clickAtDescription();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickDispostionLookup();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtDispositionInGrid();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickAddButton();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.VerifyAtCADCFSInGrid();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.verifyAtDispositionInGrid();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.SaveScreen();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickCADCFSLookup();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.clickAtDescription();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickDispostionLookup();
		popup.switchToCodedSearch();
		popup.kPICodedLookup.selectAtDispositionInGrid1();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickAddButton();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.VerifyAtCADCFSInGrid();
		alarms.alarmCFSEntry.cADCFSAndDispositionTab.verifyAtDispositionInGrid1();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.clickPrintButton();
		home.switchToSelectReport();
		home.selectReport.verifyReportNameAsAlarmCFS();
		home.selectReport.CloseTheScreen();
		alarms.switchToAlarmsCFSEntry();
		alarms.alarmCFSEntry.SaveScreen();
		alarms.switchToAlarmsCFSEntry();

	}





@Test(groups = { "2020DefectTestCase" })  //Automated by Stalin
public void NotSharedcheckboxselected_260700(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "260700");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Entry");
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.selectAtAlarmType();
	alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
	alarms.alarmsEntry.verifyAlarmLocationIBubble();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	alarms.alarmsEntry.alarmEntryMainTab.VerifyAtBusinessOrPersonNameID();
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.SwitchToContactTab();
	alarms.alarmsEntry.alarmEntryContactTab.clickAddNewButton();
	geo.switchToContactEntry();
	geo.contactEntryScreen.enterAtLastName(); // updated
	geo.contactEntryScreen.enterAtFirstName();
	names.switchToNameSearchHelpWindow();
	names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
	geo.switchToContactEntry();
	geo.contactEntryScreen.SelectAtNameRelation(); // updated
	geo.contactEntryScreen.ClickNotSharedCheckBox(); 
	geo.contactEntryScreen.SaveScreen();
	geo.switchToContactEntry();

}



@Test(priority=1,groups = { "2020DefectTestCase1" })   //Automated by Stalin
//Need to verify O type name
public void AbletocreateOtypenameinAlarmentry_261085(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "261085");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Geo");
	loader.navigateToScreen("Street Search");
	geo.switchToStreetSearchScreen();
	geo.streetSearch.clickAddNew();
	geo.switchToStreetEntry();
	geo.streetEntry.selectAtPrefix();
	geo.streetEntry.enterAtStreetName();
	geo.streetEntry.enterAtStreetType();
	geo.streetEntry.enterAtZipCode();
	geo.streetEntry.clickAddButton();
	geo.streetEntry.saveNClose();
	geo.switchToStreetSearchScreen();
	geo.streetSearch.enterAtStreetName();
	geo.streetSearch.clickSearchButton();
	geo.streetSearch.selectRowByAtStreetName();
	geo.switchToAddressIntersection();
	geo.addressIntersection.enterAtPremiseEvenFromAndTo();
	geo.addressIntersection.selectAsEven();
	geo.addressIntersection.clickAddButton();
	geo.addressIntersection.saveNCloseScreen();
	geo.switchToStreetSearchScreen();
	loader.navigateToModule("Records");
	loader.navigateToScreen("Walk-In Entry");
	records.switchToWalkInEntry();
	records.walkInEntry.enterAtCADCFS();
	records.walkInEntry.tabTheReportedDate();
	records.walkInEntry.tabTheReportedTime();
	records.walkInEntry.enterAtLocation();
	records.walkInEntry.clickLocationVerifyCheckbox();
	records.walkInEntry.verifyAddressBubbleIconDisplayed();
	records.walkInEntry.tabTheReceivedSource();
	records.walkInEntry.enterAtCADDispositon();
	records.walkInEntry.enterAtUnit();
	records.walkInEntry.save();
	records.switchToCallEntry();
	String readCallNo = records.callEntry.readCallNo();
	records.callEntry.closeScreen();
	
	   loader.navigateToModule("Settings");
       loader.navigateToScreen("System Parameter");
       settings.switchToSystemParamter();
       settings.sysParameter.setSystemparameter1804AsFutureDate();
	
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("False Alarms");
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.selectRowByAtActiveCallNo(readCallNo);
	alarms.falseAlarms.alarmNotFoundPopupClickYesToCreate();
	alarms.switchToAlarmsEntry();
//	alarms.alarmsEntry.VerifyNameTypeAsO();

}

@Test(priority=2,groups = { "2020DefectTestCase1" })  //Automated by Stalin
public void AbletoproceescallagaininFalsealarmscreen_260822(ITestContext testContext) {
	
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "260822");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	
	   loader.navigateToModule("Settings");
       loader.navigateToScreen("System Parameter");
       settings.switchToSystemParamter();
       settings.sysParameter.setSystemparameter1804AsFutureDate();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("False Alarms");
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.ClickAtCallNoInGrid();
	alarms.falseAlarms.alarmNotFoundPopupClickYesToCreate();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.ClickRemoveRadioButton();
	alarms.alarmsEntry.processFalseAlarmTab.EnterReasonForRemovalEdit();
	alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
	// CallNo need to verify
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.CloseScreen();
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.ClickRemovedOnlyCheckbox();
	alarms.falseAlarms.ClickSearchButton();
	alarms.falseAlarms.verifyAtCallNoInGrid();
	alarms.falseAlarms.ClickAtCallNoInGrid();
	alarms.falseAlarms.VerifyReopenConfirmMessage();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.verifyAtCallNo();
	alarms.switchToAlarmsEntry();
	String readAlarmNo = alarms.alarmsEntry.readAlarmNo();
	alarms.alarmsEntry.CloseScreen();
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.clickResetButton();
	loader.navigateToScreen("Alarm Search");
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.enterAlarmNoByActiveData(readAlarmNo);
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.selectGridRowByActiveAlarmNo(readAlarmNo);
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.verifyAtCallNo();
	alarms.alarmsEntry.processFalseAlarmTab.VerifyAtCADCFS();
	alarms.alarmsEntry.processFalseAlarmTab.VerifyAtDisposition(); // updated
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.CloseScreen();
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.clickBackButton(); 
	alarms.alarmSearch.clickResetButton();
	// commonNames
	alarms.alarmSearch.enterAlarmNoByActiveData(readAlarmNo);
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.selectGridRowByActiveAlarmNo(readAlarmNo);
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.verifyAtCommonNames();
	alarms.alarmsEntry.CloseScreen();
	alarms.switchToAlarmsSearch();
	// Label
	loader.navigateToScreen("False Alarms");
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.ClickAtCallNoInGrid();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.verifyAs1stAlarmChargeLabel();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.CloseScreen();
	alarms.switchToFalseAlarms();
	// 2nd scenario
	loader.navigateToScreen("Alarm Type");
	alarms.switchToAlarmType();
	alarms.alarmType.ClickAddNewButton(); 
	alarms.switchToAlarmsCFSEntry();
	alarms.alarmCFSEntry.EnterAtAlarmType();
	alarms.alarmCFSEntry.EnterAtDescription();
	alarms.alarmCFSEntry.SelectAtRegistrationType();
	alarms.alarmCFSEntry.clickTrackFeesYesRadioButton();
	alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
	alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickCADCFSLookup();
	popup.switchToCodedSearch();
	popup.kPICodedLookup.selectAtDescription1();
	alarms.switchToAlarmsCFSEntry();
	alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
	alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickDispostionLookup();
	popup.switchToCodedSearch();
	popup.kPICodedLookup.selectAtDispositionInGrid();
	alarms.switchToAlarmsCFSEntry();
	alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
	alarms.alarmCFSEntry.cADCFSAndDispositionTab.ClickAddButton();
	alarms.switchToAlarmsCFSEntry();
	alarms.alarmCFSEntry.SaveScreen();
	alarms.switchToAlarmsCFSEntry();
	alarms.alarmCFSEntry.ClickCADCFSAndDispositionTab();
	alarms.alarmCFSEntry.cADCFSAndDispositionTab.DeleteAtCADCFSDescriptionRow();
	alarms.alarmCFSEntry.cADCFSAndDispositionTab.VerifyAtleastOneRecordAcknowledgeMessage();
	alarms.switchToAlarmsCFSEntry();

}
@Test(priority=3,groups = { "2020DefectTestCase1" })  //Automated by Stalin
public void DeletealarmentrybyusingDeleteicon_260318(ITestContext testContext) {
ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "260318");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Settings");
	loader.navigateToScreen("Roles");
	settings.switchToRoles();
	settings.roles.enterAtRoleName();
	settings.roles.clickSearch();
	settings.roles.selectRowAtRoleName();
	settings.switchToRolesEntry();
	settings.rolesEntry.enterAtScreenID();
	settings.rolesEntry.clickSearchButton();
	settings.rolesEntry.clickAlarmEntryEditPermission();
	settings.rolesEntry.switchToRolesEntryScreenPermissionWindow();
	settings.rolesEntry.rolesEntryPermissionWindow.verifyDeleteCheckBoxSelected(0);
	settings.rolesEntry.rolesEntryPermissionWindow.clickSave();
	settings.rolesEntry.switchToRolesEntryScreenPermissionWindow();
	settings.rolesEntry.rolesEntryPermissionWindow.closeScreen();
	settings.switchToRolesEntry();
	settings.rolesEntry.close();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Entry");
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.selectAtAlarmType();
	alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	alarms.alarmsEntry.alarmEntryMainTab.VerifyAtBusinessOrPersonNameID();
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntryScreenTab();
	alarms.alarmsEntry.VerifyDeleteIconDisplayed();
	String readAlarmNo = alarms.alarmsEntry.readAlarmNo();
	loader.navigateToScreen("Alarm Search");
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.selectGridRowByActiveAlarmNo(readAlarmNo);
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.verifyAtCallNo();
	alarms.alarmsEntry.processFalseAlarmTab.ClickRemoveRadioButton();
	alarms.alarmsEntry.processFalseAlarmTab.EnterReasonForRemovalEdit();
	alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.CloseScreen();
	// 2 scenariio
	loader.navigateToScreen("False Alarms");
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.selectRowByAtAlarmType();
	alarms.falseAlarms.alarmNotFoundPopupClickYesToCreate();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.VerifyDeleteIconDisplayed();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.ClickRemoveRadioButton();
	alarms.alarmsEntry.processFalseAlarmTab.EnterReasonForRemovalEdit();
	alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickTransactionHistoryTab();
	alarms.alarmsEntry.transactionHistoryTab.DeleteRowUsingAtType();
	alarms.alarmsEntry.transactionHistoryTab.VerifyDeleteConfirmMessage();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.SaveScreen();

}


@Test(priority=4,groups = { "2020DefectTestCase1" })  //Automated by Stalin
public void OpenalarmatthesameaddresswhenInactivated_261090(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "261090");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Records");
	loader.navigateToScreen("Walk-In Entry");
	records.switchToWalkInEntry();
	records.walkInEntry.enterAtCADCFS();
	records.walkInEntry.tabTheReportedDate();
	records.walkInEntry.tabTheReportedTime();
	records.walkInEntry.enterAtLocation();
	records.walkInEntry.clickLocationVerifyCheckbox();
	records.walkInEntry.tabTheReceivedSource();
	records.walkInEntry.enterAtCADDispositon();
	records.walkInEntry.enterAtUnit();
	records.walkInEntry.save();
	records.switchToCaseUpdate();
	String readCaseNo = records.caseUpdate.readCaseNo1();
	records.callEntry.closeScreen();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("False Alarms");
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.selectRowByAtActiveCallNo(readCaseNo);
	alarms.falseAlarms.alarmNotFoundPopupClickYesToCreate();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.Click1stAlarmChargeRadioButton();
	alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickInactiveChkBox();
	alarms.alarmsEntry.verifyInactiveDateAsCurrentDate();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.CloseScreen();
	loader.navigateToModule("Records");
	loader.navigateToScreen("Walk-In Entry");
	records.switchToWalkInEntry();
	records.walkInEntry.enterAtCADCFS();
	records.walkInEntry.tabTheReportedDate();
	records.walkInEntry.tabTheReportedTime();
	records.walkInEntry.enterAtLocation();
	records.walkInEntry.clickLocationVerifyCheckbox();
	records.walkInEntry.tabTheReceivedSource();
	records.walkInEntry.enterAtCADDispositon();
	records.walkInEntry.enterAtUnit();
	records.walkInEntry.save();
	records.switchToCaseUpdate();
	String readCaseNo1 = records.caseUpdate.readCaseNo1();
	records.callEntry.closeScreen();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("False Alarms");
	alarms.switchToFalseAlarms();
	alarms.falseAlarms.clickResetButton();
	alarms.falseAlarms.selectRowByAtActiveCallNo(readCaseNo1);
	alarms.falseAlarms.alarmNotFoundPopupClickYesToCreate();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.clickSameAsBusinessAccountCheckbox();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntry();
}

@Test(priority=5,groups = { "2020DefectTestCase1" })   //Automated by Stalin
public void NonChargeableFunctionality_260701(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "260701");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Search");
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.EnterAtAlarmNo();
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.SelectGridRowByAtAlarmType();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.EnterAtCallNo();
	alarms.alarmsEntry.processFalseAlarmTab.VerifyAddressMismatchConfirmMessage(); 
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickProcessFalseAlarmTab();
	alarms.alarmsEntry.processFalseAlarmTab.verifyNonChargeableDNCIsDisplayed();
	alarms.alarmsEntry.processFalseAlarmTab.ClickNonChargeableDonotChargeRadioButton();
	alarms.alarmsEntry.processFalseAlarmTab.ClickProcessButton();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.SaveScreen();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickTransactionHistoryTab(); 
	alarms.alarmsEntry.transactionHistoryTab.VerifyAtCallNoInGrid(0);
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickInvoicesTab();
	alarms.alarmsEntry.invoicesTab.VerifyBalanceAsZeroUsingInvoiceTypeInGrid();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.verifyAtTotalOccurrences();
	alarms.alarmsEntry.VerifyChargeableOccurrencesAs0();
	alarms.alarmsEntry.CloseScreen();
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.verifyAtYTDCountInGrid(0);
	alarms.switchToAlarmsSearch();

}



@Test(priority=6,groups = { "2020DefectTestCase1" }) //july Sprint 1 Mahesha
public void PoliceDefect2020_248832(ITestContext testContext)
{
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "248832");	
      Browser.NavigateToLoginScreen();
     
      login.loginScreen.Logon();
      loader.navigateToModule("Settings");
      loader.navigateToScreen("System Parameter");
      settings.switchToSystemParamter();
      settings.sysParameter.setSystemparameter1826AsTrue();
      
      loader.navigateToModule("Alarms");
      loader.navigateToScreen("False Alarms");
      alarms.switchToFalseAlarms();
      alarms.falseAlarms.ClickAtCallNoInGrid();
      alarms.falseAlarms.alarmNotFoundPopupClickYesToCreate();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.VerifyBusinessPersonIsNotMandatory();
      alarms.alarmsEntry.SaveScreen();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.VerifyUpdatedSuccessfulMsg();
      alarms.alarmsEntry.CloseScreen();
      
      loader.navigateToScreen("Alarm Entry");
      alarms.switchToAlarmsEntryScreenTab();
      alarms.alarmsEntry.VerifyBusinessPersonIsNotMandatory();
      alarms.alarmsEntry.SelectAlarmType();
      alarms.alarmsEntry.ChangeAlarmLocation();
      alarms.alarmsEntry.alarmEntryMainTab.EnterAtBillAccount();
      alarms.alarmsEntry.SaveScreen();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.verifyAdditionSuccessfulMessage();
      
      loader.navigateToModule("Settings");
      loader.navigateToScreen("System Parameter");
      settings.switchToSystemParamter();
      settings.sysParameter.setSystemparameter1826AsFalse();
      settings.switchToSystemParamter();
}

@Test(priority=7,groups = { "2020DefectTestCase1" })  //july Sprint 1 Mahesha
public void PoliceDefect2020_249130(ITestContext testContext)
{
	
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	 testContext.setAttribute("testID", "249130");	
      Browser.NavigateToLoginScreen();
     
      login.loginScreen.Logon();
      loader.navigateToModule("Settings");
      loader.navigateToScreen("System Parameter");
      settings.switchToSystemParamter();
      settings.sysParameter.setSystemparameter1826AsFalse();
      
      loader.navigateToModule("Alarms");
      loader.navigateToScreen("False Alarms");
      alarms.switchToFalseAlarms();
      alarms.falseAlarms.ClickAtCallNoInGrid();
      alarms.falseAlarms.alarmNotFoundPopupClickYesToCreate();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.clickMainTab();
      alarms.alarmsEntry.VerifyBusinessPersonIsMandatory();
      alarms.alarmsEntry.alarmEntryMainTab.VerifyAtBillingAccountAutoPopulatedWithName();
      alarms.alarmsEntry.ClearBusinessPersonName();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.ClickSave();
      alarms.alarmsEntry.Verify1018RequiredEntriesareMissingAckMsg();
      alarms.switchToAlarmsEntry();
      alarms.alarmsEntry.CloseScreen();
      
     
      loader.navigateToScreen("Alarm Entry");
      alarms.switchToAlarmsEntryScreenTab();
      alarms.alarmsEntry.VerifyBusinessPersonIsMandatory();
      alarms.alarmsEntry.SelectAlarmType();
      alarms.alarmsEntry.ChangeAlarmLocation();
      alarms.alarmsEntry.alarmEntryMainTab.EnterAtBillAccount();
      alarms.alarmsEntry.ClickSave();
      alarms.alarmsEntry.Verify1018RequiredEntriesareMissingAckMsg();
      alarms.switchToAlarmsEntryScreenTab();
      
      alarms.alarmsEntry.alarmEntryMainTab.VerifySameBusinessAccountCheckboxNotEnabled();
      alarms.alarmsEntry.EnterAtBusinessOrPersonNameID();
      alarms.alarmsEntry.alarmEntryMainTab.VerifySameBusinessAccountCheckboxEnabled();
     
}
@Test(groups= {"2021DefectTestCases"})  //Automated by Mahesha 2021
public void VerifytheResetbuttonfromtheAlarmSearchscreen_272363(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "272363");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Search");
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.EnterAtAlarmNo();
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.VerifyAtAlarmTypeByAtAlarmNoInGrid();
	alarms.alarmSearch.SelectGridRowByAtAlarmNo();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.ClickInactiveChkBox();
	alarms.alarmsEntry.verifyInactiveDateAsCurrentDate();
	alarms.alarmsEntry.SaveNCloseScreen();
	alarms.alarmSearch.verifyNoRecordFoundAcknowlede();
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.clickResetButton();
	alarms.alarmSearch.EnterAtAlarmNo();
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.verifyNoRecordFoundAcknowlede();
	alarms.switchToAlarmsSearch();
	
	
}

@Test(groups= {"2021DefectTestCases"})  //Automated by Stalin
public void ToShowTheValidationMessage1804_263017(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "263017");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Settings");
	loader.navigateToScreen("System Parameter");
	settings.switchToSystemParamter();
	settings.sysParameter.setSystemparameter1804AsNull();
	settings.switchToSystemParamter();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Search");
	alarms.switchToAlarmsSearch();
	alarms.alarmSearch.clickShowUnregisteredOnlyCheckBox();
	alarms.alarmSearch.ClickSearch();
	alarms.alarmSearch.SelectGridRowByAtAlarmNo();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.verifyFiscalYearEndDateNotConfiguredAcknowledgeMessage();
	alarms.switchToAlarmsEntry();
	alarms.alarmsEntry.clickMainTab();
	alarms.alarmsEntry.alarmEntryMainTab.ClickNotRegisteredCreateInvoiceButton();
	alarms.alarmsEntry.verifyFiscalYearEndDateNotConfiguredAcknowledgeMessage();
	alarms.switchToAlarmsEntry();

	loader.navigateToModule("Settings");
	loader.navigateToScreen("System Parameter");
	settings.switchToSystemParamter();
	settings.sysParameter.setSystemparameter1804AsCurrentDate();
	settings.switchToSystemParamter();
}

@Test(groups= {"2021DefectTestCases"})  //Automated by Stalin 
public void AbleToCreateAlarmYearEndForFirePolice_263019(ITestContext testContext) {
	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	testContext.setAttribute("testID", "263019");
	Browser.NavigateToLoginScreen();
	login.loginScreen.Logon();
	loader.navigateToModule("Alarms");
	loader.navigateToScreen("Alarm Year End Report");
	alarms.switchToFalseAlarmYearEndReport();
	alarms.alarmYearEndReport.ClickProcessYearEndButton();
	alarms.alarmYearEndReport.ClickResetAlarmOccuercesCheckbox();
	alarms.alarmYearEndReport.VerifyResetAlarmOccurrencesConfirmMessage();
	alarms.switchToFalseAlarmYearEndReport();
	alarms.alarmYearEndReport.ClickCreateRegistrationFeeInvoiceCheckbox();
	alarms.alarmYearEndReport.ClickClearAllOpenInvoicesCheckbox();
	alarms.alarmYearEndReport.VerifyAlarmTransactionConfirmMessage();
	alarms.switchToFalseAlarmYearEndReport();
	alarms.alarmYearEndReport.clickZeroBalanceAccountsCheckbox();
	alarms.alarmYearEndReport.clickViewReportOnly();
	home.switchToSelectReport();
	home.selectReport.clickAlarmYearEndReport();
	home.selectReport.closePnxReportServerScreen();
	home.switchToSelectReport();
	

}
@Test(groups = { "2021DefectTestCases"}) // Mithun Missed Testcase // BY Stalin
//While searching in Alarm Search screen it should not show the entry but because of product issue it is showing.(CRM NO 115021) 
	public void NamesEntryscreen_256408(ITestContext testContext) {

ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256408");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Alarm");
		loader.navigateToScreen("Alarm Search");
		alarms.switchToAlarmsSearch();
		alarms.alarmSearch.enterAtBusinessOrPersonNameID();
		alarms.alarmSearch.ClickSearch();
		alarms.alarmSearch.VerifyAtAlarmNoRowAppearAsRedColor(0);
		alarms.alarmSearch.clickBackButton();
		alarms.alarmSearch.clickResetButton();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Expungement");
		names.switchToExpungement();
		names.expungement.EnterAtNameID();
		names.expungement.selectAtType();
		names.expungement.enterAtReason();
		names.expungement.ClickShowAllActivityCheckBox();
		names.expungement.deleteAtActivityNoInGrid();
		names.expungement.VerifyDeletedBookingConfirmeMessage();
		names.expungement.verifyDeleteSuccessfulAcknowledgeMessage();
		names.BackToExpungement();
		loader.navigateToModule("Alarm");
		loader.navigateToScreen("Alarm Search");
		alarms.switchToAlarmsSearch();
		alarms.alarmSearch.EnterAtAlarmNo(); 
		alarms.alarmSearch.ClickSearch();
	}

@Test(groups={"2020DefectRolesAndReportRepository"}) //Automated by Stalin public void
	 public void AllowToremoveProcessedItem(ITestContext testContext) {
		   ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
	  testContext.setAttribute("testID", "261087");
	  Browser.NavigateToLoginScreen(); login.loginScreen.Logon();
	  loader.navigateToModule("Settings"); loader.navigateToScreen("Roles");
	  settings.switchToRoles(); settings.roles.enterAtRoleName();
	  settings.roles.clickSearch(); settings.roles.verifyAtRoleNameInGrid();
	  settings.roles.selectRowAtRoleName(); settings.switchToRolesEntry();
	  settings.rolesEntry.clickAlarmsEditPermissionButton();
	  settings.rolesEntry.switchToRolesEntryScreenPermissionWindow();
	  settings.rolesEntry.rolesEntryPermissionWindow.enterAtScreenName();
	  settings.rolesEntry.rolesEntryPermissionWindow.clickSearchButton();
	  settings.rolesEntry.rolesEntryPermissionWindow.verifyChangeCheckBoxSelected(0); 
	  settings.rolesEntry.rolesEntryPermissionWindow.clickSave();
	  settings.rolesEntry.switchToRolesEntryScreenPermissionWindow();
	 
	  settings.rolesEntry.rolesEntryPermissionWindow.closeScreen();
	  settings.switchToRolesEntry(); settings.rolesEntry.close();
	  settings.switchToRoles(); loader.navigateToModule("Alarms");
	  loader.navigateToScreen("Alarm Search"); alarms.switchToAlarmsSearch();
	  alarms.alarmSearch.ClickSearch();
	  alarms.alarmSearch.SelectGridRowByAtAlarmNo(); alarms.switchToAlarmsEntry();
	  alarms.alarmsEntry.ClickTransactionHistoryTab();
	  alarms.alarmsEntry.transactionHistoryTab.VerifyAtTypeInGrid();
	  alarms.alarmsEntry.transactionHistoryTab.verifyAtFeeInGrid();
	 alarms.alarmsEntry.transactionHistoryTab.DeleteRowUsingAtType();
	  alarms.alarmsEntry.transactionHistoryTab.VerifyDeleteConfirmMessage();
	  alarms.alarmsEntry.transactionHistoryTab.
	  verifyAdjustInvoiceAmountConfirmMessage(); alarms.switchToAlarmsEntry();
	  alarms.alarmsEntry.SaveScreen(); alarms.switchToAlarmsEntry();
	  alarms.alarmsEntry.ClickInvoicesTab();
	  alarms.alarmsEntry.invoicesTab.verifyAdjustmentsInGrid();
	  alarms.switchToAlarmsEntry();
	 
	  }
 @AfterMethod(groups = {"AlarmEntryFunctional" , "2020DefectTestCase","2021DefectTestCases","2020DefectTestCase1"})
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
			alarms.Reset();
  }
  
  @AfterSuite(groups = {"AlarmEntryFunctional" , "2020DefectTestCase","2021DefectTestCases","2020DefectTestCase1"})
  public void afterRunSuite()
  {
  	ExtentReport.GenerateHTML();
  	
  	}
  
}
