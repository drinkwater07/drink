package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Accounting;
import application.DetailWork;
import application.Loader;
import application.Login;
import application.Popup;
import application.Settings;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class DetailWorkScripts {

	public DetailWork detailWork;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Accounting accounting;
	
	public Settings settings;

	@BeforeSuite(groups = { "DetailWorkFunctional","2021DefectTestCases"})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	
	@BeforeMethod(groups = { "DetailWorkFunctional","2021DefectTestCases"})
	public void beforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "DetailWork");
		Playback.testContext = testContext;
		Playback.start();
		login = new Login();
		loader = new Loader();
		objectIdentification = new ObjectIdentification();
		popup = new Popup();
		detailWork = new DetailWork();
		accounting = new Accounting();
		settings = new Settings();

	}

	@Test(groups =  "DetailWorkFunctional")
	public void DetailEntryFunctionality_189980(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "189980");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Detail Work");
		loader.navigateToScreen("Detail Search");
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.clickAddNew();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickSave();
		detailWork.detailEntry.verifyDeailDateTimeAcknowledgeMessage();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.enterDateTimeDetailAsCurrentDateTime();
		detailWork.detailEntry.enterAtExpectedDuration();
		detailWork.detailEntry.selectAtTypeOfDetailWork();
		detailWork.detailEntry.enterAtLocationOfDetail();
		detailWork.detailEntry.clickHighRiskCheckBox();
		detailWork.detailEntry.clickSupervisorRequiredCheckBox();
		detailWork.detailEntry.enterAtNoOfOfficersRequested();
		detailWork.detailEntry.clickPriorityDetailYesRadiobutton();
		detailWork.detailEntry.clickSave();
		detailWork.detailEntry.verifyDateTimeRequestAcknowledgeMessage();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickDetailRequestedByTab();
		detailWork.detailEntry.detailRequestedByTab.tabDateTimeOfRequested();
		detailWork.detailEntry.detailRequestedByTab.tabOfficerTakingRequest();
		detailWork.detailEntry.detailRequestedByTab.enterAtBusinessNameID();
		detailWork.detailEntry.detailRequestedByTab.enterAtContactLastName();
		detailWork.detailEntry.detailRequestedByTab.enterAtContactFirstName();
		detailWork.detailEntry.detailRequestedByTab.selectName();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickSave();
		detailWork.detailEntry.verifyBillToaAccountAcknowledgeMessage();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickBillToTab();
		detailWork.detailEntry.detailBillToTab.clickSamAsBusinessAccountCheckBox();
		detailWork.detailEntry.detailBillToTab.verifyAtLastNameFirstName();
		detailWork.detailEntry.Save();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.verifyStatusAsNotFilled();
		detailWork.detailEntry.verifyCopyButtonEnabled();
		detailWork.detailEntry.closeScreen();
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.clickSearch();
		detailWork.detailSearch.verifyAtLocationUsingTypeOfDetail();
		detailWork.detailSearch.verifyAtDurationUsingTypeOfDetail();
		detailWork.detailSearch.verifyDateAsCurrentUsingTypeOfDetail();
		detailWork.detailSearch.verifyRowColorAsRedUsingLocation();

	}

	@Test(groups =  "DetailWorkFunctional")
	public void DetailEntryStatusUpdateTabFunctionality_189981(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "189981");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Detail Work");
		loader.navigateToScreen("Detail Search");
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.enterAtDetailNo();
		detailWork.detailSearch.clickPriorityDetailNoRadioButton();
		detailWork.detailSearch.clickSearch();
		detailWork.detailSearch.verifyAtDetailNo(0);
		detailWork.detailSearch.verifyAtLocationUsingDetailNo();
		detailWork.detailSearch.clickAtTypeOfDetailInGrid();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.getExpectedDuration();
		detailWork.detailEntry.clickOfficersTab();
		detailWork.detailEntry.detailOfficersTab.tabScheduledFrom();
		detailWork.detailEntry.detailOfficersTab.tabScheduledTo();
		detailWork.detailEntry.detailOfficersTab
				.verifyDuration(Playback.testContext.getAttribute("expectedDuration").toString());
		detailWork.detailEntry.detailOfficersTab.tabOfficerPF();
		detailWork.detailEntry.detailOfficersTab.verifyHigherPriorityDetailAcknowledgeMessage();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickStatusUpdateTab();
		detailWork.detailEntry.detailStatusUpdateTab.tabUpdateDateTime();
		detailWork.detailEntry.detailStatusUpdateTab.tabUpdateBy();
		detailWork.detailEntry.detailStatusUpdateTab.enterAtComments();
		detailWork.detailEntry.detailStatusUpdateTab.clickSaveButton();
		detailWork.detailEntry.detailStatusUpdateTab.verifyAtCommentsInListGrid();
		detailWork.detailEntry.detailStatusUpdateTab.verifyDateAsCurrentDateListGrid();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.Save();
		detailWork.switchToDetailEntryScreen();

	}

	@Test(groups =  "DetailWorkFunctional")
	public void DetailEntryOfficerTabFunctionality_189982(ITestContext testContext) {
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());

		testContext.setAttribute("testID", "189982");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Detail Work");
		loader.navigateToScreen("Detail Search");
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.enterAtLocationOfDetail();
		detailWork.detailSearch.clickNotFilledCheckbox();
		detailWork.detailSearch.clickSearch();
		detailWork.detailSearch.verifyAtDetailNo(0);
		detailWork.detailSearch.verifyAtLocationUsingDetailNo();
		detailWork.detailSearch.clickAtTypeOfDetailInGrid();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.getExpectedDuration();
		detailWork.detailEntry.clickOfficersTab();
		detailWork.detailEntry.detailOfficersTab.tabScheduledFrom();
		detailWork.detailEntry.detailOfficersTab.tabScheduledTo();
		detailWork.detailEntry.detailOfficersTab
				.verifyDuration(Playback.testContext.getAttribute("expectedDuration").toString());
		detailWork.detailEntry.detailOfficersTab.clickOfficerPFLookup();
		detailWork.switchToOfficerPFHelpSearch();
		detailWork.officerPeckingOrderSearch.clickAtPFNoUsingCheckbox();
		detailWork.officerPeckingOrderSearch.clickAddTheSelectedPF();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.detailOfficersTab.verifyAtOfficer(0);
		detailWork.detailEntry.detailOfficersTab.clickReferredToPFLookup();
		detailWork.switchToReferedToSearch();
		detailWork.referedToSearch.clickAtFullNameInGrid();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.detailOfficersTab.verifyAtOfficer1(1);
		detailWork.detailEntry.detailOfficersTab.clickAtOfficerInGrid();
		detailWork.detailEntry.detailOfficersTab.verifyReferedToFieldDisabled();
		detailWork.detailEntry.detailOfficersTab.tabDateFrom();
		detailWork.detailEntry.detailOfficersTab.selectAtRadeCode();
		detailWork.detailEntry.detailOfficersTab.enterAtAmountToPaid();
		detailWork.detailEntry.detailOfficersTab.enterAtAmountToBilled();
		detailWork.detailEntry.detailOfficersTab.clickAddButton();
		detailWork.detailEntry.detailOfficersTab.verifyAtRateCode(0);
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.Save();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.verifyStatusAsCompletedBilled();
		detailWork.detailEntry.closeScreen();
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.verifyNoRecordFoundAcknowledgeMessage();
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.clickBack();
		detailWork.detailSearch.clickReset();
		detailWork.detailSearch.enterAtLocationOfDetail();
		detailWork.detailSearch.clickSearch();
		detailWork.detailSearch.verifyRowColorAsBlueUsingLocation();

	}

	@Test(groups =  "DetailWorkFunctional")
	public void DetailEntryFeesTabFunctionality_189983(ITestContext testContext) {
		
		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "189983");
		String balanceAmount = null;
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Detail Work");
		loader.navigateToScreen("Detail Search");
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.clickCompletedBilledCheckbox();
		detailWork.detailSearch.selectAtTypeOfDetailWork();
		detailWork.detailSearch.clickSearch();
		detailWork.detailSearch.verifyAtTypeOfDetailUsingDetailNo();
		detailWork.detailSearch.verifyAtLocationUsingDetailNo();
		detailWork.detailSearch.clickAtDetailNoInGrid();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickFeesTab();
		detailWork.detailEntry.detailFeesTab.selectItemCode();
		detailWork.detailEntry.detailFeesTab.enterConditionsNotes();
		detailWork.detailEntry.detailFeesTab.clickPrintContionsNotesCheckbox();
		detailWork.detailEntry.detailFeesTab.clickAddButton();
		detailWork.detailEntry.detailFeesTab.selectItemCode1();
		detailWork.detailEntry.detailFeesTab.enterConditionsNotes();
		detailWork.detailEntry.detailFeesTab.clickAddButton();
		detailWork.detailEntry.detailFeesTab.verifyAtItemCodeDescription(0);
		detailWork.detailEntry.detailFeesTab.verifyPrintCheckboxesChecked(0);
		detailWork.detailEntry.detailFeesTab.verifyAtItemCode1(1);
		detailWork.detailEntry.detailFeesTab.saveTab();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickFeesTab();
		balanceAmount = detailWork.detailEntry.detailFeesTab.getBalanceAmount();
		detailWork.detailEntry.detailFeesTab.clickReceivePaymentButton();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.enterAmount(balanceAmount);
		accounting.receivePayment.selectPaymentMethodAsCash();
		accounting.receivePayment.invoicesTab.ClickSelectAllCheckbox();
		accounting.receivePayment.clickSave();
		accounting.SwitchToReceivePaymentOption();
		accounting.receivePaymentOption.clickCloseButton();
		accounting.SwitchToReceivePayment();
		accounting.receivePayment.CloseScreen();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.Save();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickFeesTab();
		detailWork.detailEntry.detailFeesTab.verifyBalanceInvoiceAmountAs0();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.verifyStatusAsCompletedBilled();
	}

	@Test(groups =  "DetailWorkFunctional")
	public void DetailEntryInvoiceTabFunctionality_189984(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "189984");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Detail Work");
		loader.navigateToScreen("Detail Search");
		detailWork.switchToDetailSearch();
		detailWork.detailSearch.clickCompletedBilledCheckbox();
		detailWork.detailSearch.selectAtTypeOfDetailWork();
		detailWork.detailSearch.clickSearch();
		detailWork.detailSearch.verifyAtTypeOfDetailUsingDetailNo();
		detailWork.detailSearch.verifyAtLocationUsingDetailNo();
		detailWork.detailSearch.clickAtDetailNoInGrid();
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickInvoiceTab();
		detailWork.detailEntry.detailInvoiceTab.selectAtInvoiceType();
		detailWork.detailEntry.detailInvoiceTab.clickSearch();
		detailWork.detailEntry.detailInvoiceTab.verifyAtInvoiceTypeInGrid(0);
		detailWork.detailEntry.detailInvoiceTab.clickAtInvoiceTypeInGrid();
		 accounting.SwitchToInvoiceEntry(); 
		 accounting.invoiceEntry.verifyAtInVoiceType();
		  accounting.invoiceEntry.close();
		 
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.Save();
		detailWork.switchToDetailEntryScreen();
	}
	@Test(groups =  "DetailWorkFunctional")
	 public void CancelDetailEntryFunctionality_189985(ITestContext testContext)
     {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "189985");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Detail Work");
			loader.navigateToScreen("Detail Search");
			detailWork.switchToDetailSearch();
         detailWork.detailSearch.enterAtDetailNo();
         detailWork.detailSearch.clickPriorityDetailNoRadioButton();
         detailWork.detailSearch.clickSearch();
         detailWork.detailSearch.verifyAtDetailNo(0);
         detailWork.detailSearch.verifyAtLocationUsingDetailNo();
         detailWork.detailSearch.clickAtDetailNoInGrid();
         detailWork.switchToDetailEntryScreen();
         detailWork.detailEntry.clickDetailCancelledCheckbox();
         detailWork.detailEntry.clickDetailRequestedByTab();
         detailWork.detailEntry.detailRequestedByTab.tabCancelledDateTime();
         detailWork.detailEntry.detailRequestedByTab.tabBy();
         detailWork.detailEntry.Save();
         detailWork.switchToDetailEntryScreen();
         detailWork.detailEntry.verifyStatusAsCancelled();
         detailWork.detailEntry.closeScreen();
         detailWork.switchToDetailSearch();
         detailWork.detailSearch.verifyStatusAsCancelledUsingDetailNo();
         detailWork.detailSearch.verifyRowColorAsGrayUsingDetailNo();
     }

	
	// Automated by Vijay // Date : 08/31/2021 // Sprint: 2021 Q3 Sprint 4
		@Test(groups =  "DetailWorkFunctional")
		public void verifyTheDurationFieldAndActualWorkedHoursFieldAreChangedIntoCustomFieldInDetailEntryScreen_277260(
				ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "277260");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Detail Work");
			loader.navigateToScreen("Detail Search");
			detailWork.switchToDetailSearch();
			detailWork.detailSearch.clickSearch();
			detailWork.detailSearch.clickAtDetailNoInGrid();
			detailWork.switchToDetailEntryScreen();
			detailWork.detailEntry.clickOfficersTab();
			detailWork.detailEntry.detailOfficersTab.verifyDurationLabelIsCustomField();
			detailWork.detailEntry.detailOfficersTab.verifyActualWorkedHoursLabelIsCustomField();
			detailWork.detailEntry.detailOfficersTab.clickOnDurationLabel();
			settings.switchToRepositoryEntry();
			settings.repositoryEntry.clearCustomName();
			settings.repositoryEntry.enterAtCustomName();
			settings.repositoryEntry.saveNClose();
			detailWork.switchToDetailEntryScreen();
			detailWork.detailEntry.clickOfficersTab();
			detailWork.detailEntry.detailOfficersTab.verifyDurationFieldLabelNameChangedAsCustomName();
			detailWork.detailEntry.detailOfficersTab.clickOnActualWorkedHoursLabel();
			settings.switchToRepositoryEntry();
			settings.repositoryEntry.clearCustomName();
			settings.repositoryEntry.enterAtCustomName1();
			settings.repositoryEntry.saveNClose();
			detailWork.switchToDetailEntryScreen();
			detailWork.detailEntry.clickOfficersTab();
			detailWork.detailEntry.detailOfficersTab.verifyActualWorkedHoursFieldLabelNameChangedAsCustomName1();
			detailWork.switchToDetailEntryScreen();
			detailWork.detailEntry.Save();
			detailWork.switchToDetailEntryScreen();

		}
//2017 Defects Test Cases  
	@Test(groups =  "DetailWorkFunctional")
	public void CopyButtonFunctionality_281998(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281998");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Detail Work");
		loader.navigateToScreen("Detail Search");
		detailWork.switchToDetailSearch();
        detailWork.detailSearch.enterAtDetailNo();
        detailWork.detailSearch.clickSearch();
        detailWork.detailSearch.verifyAtDetailNo(0);
        detailWork.detailSearch.clickAtDetailNoInGrid();
        detailWork.switchToDetailEntryScreen();
        detailWork.detailEntry.clickDetailCancelledCheckbox();
        detailWork.detailEntry.clickDetailRequestedByTab();
        detailWork.detailEntry.detailRequestedByTab.verifyCancellDateAndByFieldsEnabled();
        detailWork.detailEntry.detailRequestedByTab.tabCancelledDateTime();
        detailWork.detailEntry.detailRequestedByTab.tabBy();
        detailWork.detailEntry.clickBillToTab();
        detailWork.detailEntry.detailBillToTab.verifyAtBillToAccountLastName();
        detailWork.detailEntry.clickOfficersTab();
        detailWork.detailEntry.detailOfficersTab.tabOfficerPF();
        detailWork.detailEntry.detailOfficersTab.verifyHigherPriorityDetailAcknowledgeMessage();
        detailWork.switchToDetailEntryScreen();
        detailWork.detailEntry.clickPriorityDetailYesRadiobutton();
        detailWork.detailEntry.clickOfficersTab();
        detailWork.detailEntry.detailOfficersTab.tabDateFrom();
        detailWork.detailEntry.detailOfficersTab.tabOfficerPF();
        detailWork.switchToReferedToSearch();
        detailWork.referedToSearch.clickAtFullNameInGrid();
        detailWork.referedToSearch.clickAddSelectedPFtoListbutton();
		detailWork.switchToDetailEntryScreen();
		 detailWork.detailEntry.clickOfficersTab();
        detailWork.detailEntry.detailOfficersTab.verifyAtOfficer(0);
        detailWork.detailEntry.clickFeesTab();
        detailWork.detailEntry.detailFeesTab.verifyAtItemCode(0);
        detailWork.switchToDetailEntryScreen();
        detailWork.detailEntry.Save();
        detailWork.switchToDetailEntryScreen();
        detailWork.detailEntry.clickCopyButton();
        detailWork.switchToDetailEntryScreen();
        detailWork.detailEntry.verifyCopiedSuccessfullyMessage();
        detailWork.detailEntry.verifyDateOfDetailFieldIsEmpty();
        detailWork.detailEntry.enterDateTimeDetailAsCurrentDateTime();
        detailWork.detailEntry.clickDetailCancelledCheckbox();
        detailWork.detailEntry.clickDetailRequestedByTab();
        detailWork.detailEntry.detailRequestedByTab.tabDateTimeOfRequested();
        detailWork.detailEntry.detailRequestedByTab.tabOfficerTakingRequest();
        detailWork.detailEntry.detailRequestedByTab.tabCancelledDateTime();
        detailWork.detailEntry.detailRequestedByTab.tabBy();
        detailWork.detailEntry.Save();
        detailWork.switchToDetailEntryScreen();
        detailWork.detailEntry.clickAttachmentsTab();
        objectIdentification.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(1);
       
	}
	//Automated by TesterName :- Mani Date :- 12/22/2021 Sprint:-6 Quarter:-4 Module:-Detail Work
		@Test(groups = { "" })
		public void VerifyTheCancelledDateAndTimeShowsProperlyOnDetailEntryScreen_288319(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "288319");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Detail Work");
			loader.navigateToScreen("Detail Search");
			detailWork.switchToDetailSearch();
			detailWork.detailSearch.enterAtDetailNo();
		    detailWork.detailSearch.clickSearch();
		    detailWork.detailSearch.clickAtDetailNoInGrid();
		    detailWork.switchToDetailEntryScreen();
		    detailWork.detailEntry.detailRequestedByTab.verifyCancellDateAndByFieldsNotDispalyed();
		    detailWork.detailEntry.clickDetailCancelledCheckbox();
		    detailWork.detailEntry.clickDetailRequestedByTab();
		    detailWork.detailEntry.detailRequestedByTab.verifyCancellDateAndByFieldsEnabled();
		    detailWork.switchToDetailEntryScreen();
		  
		    
		}

	@AfterMethod(groups = { "DetailWorkFunctional","2021DefectTestCases"})
	public void afterMethodrecords(ITestResult testResult) 
	  {
		  
		  objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
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
			
		}
	
@AfterSuite(groups = { "DetailWorkFunctional","2021DefectTestCases"})
	public void afterRunSuite()
	  {
		  ExtentReport.GenerateHTML();
	  	 System.gc();
	  	}
}
