package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.CM;
import application.Civil;
import application.Coroner;
import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Property;
import application.Records;
import application.Scheduling;
import application.Settings;
import application.Tow;
import application.Traffic;
import application.TrafficWI;
import reports.ExtentReport;
import uIMaps.UIMapTraffic;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class AttachmentRelatedScripts {
	
	public Civil civil;
	public Geo geo;
	public CM cM;
	public Settings settings;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popUp;
	public UIMapTraffic uIMapTraffic;
	
	public Home home;
	public Scheduling scheduling;
	public Records records;
	public TrafficWI trafficWI;
	public Traffic traffic;
	public Property property;
	public Names names;
	public Coroner coroner;
	public Tow tow;
	public CM cm;
	
	@BeforeSuite(groups = { ""})
	public void beforeRunSuite(ITestContext testContext)
	{
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		 ExtentReport.startReport(suitePath);
		 ExtentReport. TotalTestsInSuite(testContext.getSuite());
	}
	

  @BeforeMethod(groups = { ""})
  public void beforeMethodCM(ITestContext testContext) 
  {
	  
	  testContext.setAttribute("moduleName","CM");
	  Playback.testContext=testContext;
	  Playback.start();
      login=new Login();
	  loader=new Loader();		
	  objectIdentification= new ObjectIdentification();	    
      popUp = new Popup();
      settings= new Settings();
      geo= new Geo();
      civil = new Civil();
      cM = new CM();
      uIMapTraffic = new UIMapTraffic();
      
      home = new Home();
      scheduling = new Scheduling();
      records = new Records();
      traffic = new Traffic(); 
      trafficWI = new TrafficWI();
      civil = new Civil();
      property = new Property();
      names = new Names();
      coroner = new Coroner();
      tow = new Tow();
      cm = new CM();
      
  }
  
  
	
	 @Test
		public void Police2018CMModule_193263(ITestContext testContext) 
	  	{
		  
		  	testContext.setAttribute("testID", "193263");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Settings");
			loader.navigateToScreen("System Parameter");
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter912AsYes();
			objectIdentification.windowHandle.switchToMainWindow();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			//RecordsScripts.RecordsTestContext = CMTestContext;
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.clickCaseManagementIcon();   
			cM.switchToCaseFolder();
			cM.caseFolder.switchToAttachmentsTab();
			cM.caseFolder.attachmentsTab.verifyAddFilesButtonEnabled();
			cM.caseFolder.attachmentsTab.clickAddFiles();
			cM.caseFolder.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			cM.switchToCaseFolder();
			cM.caseFolder.close();
			records.switchToCaseUpdate();
			records.caseUpdate.closeTheScreen();
			records.switchToCaseSearch();
			records.caseSearch.ClickReset();
			records.switchToCaseSearch();
			records.caseSearch.EnterAtCaseNo1();
			records.switchToCaseUpdate();
			records.caseUpdate.clickCaseManagementIcon();   
			cM.switchToCaseFolder();
			cM.caseFolder.switchToAttachmentsTab();
			cM.caseFolder.attachmentsTab.verifyAddFilesButtonDisabled();
			cM.switchToCaseFolder();
			cM.caseFolder.close();
			records.switchToCaseUpdate();
			records.caseUpdate.closeTheScreen();
			objectIdentification.windowHandle.switchToMainWindow();
			loader.navigateToModule("Settings");
			loader.navigateToScreen("System Parameter");
			settings.switchToSystemParamter();
			settings.sysParameter.setSystemparameter912AsNo();
			objectIdentification.windowHandle.switchToMainWindow();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			//RecordsScripts.RecordsTestContext = CMTestContext;
			records.caseSearch.ClickReset();
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.clickCaseManagementIcon();
			cM.switchToCaseFolder();   
			cM.caseFolder.switchToAttachmentsTab();
			cM.caseFolder.attachmentsTab.verifyAddFilesButtonEnabled();
			cM.caseFolder.attachmentsTab.clickAddFiles();
			cM.caseFolder.attachmentsTab.attachmentsCategoryPopup.clickCancel();
			cM.switchToCaseFolder();
			cM.caseFolder.close();
			records.switchToCaseUpdate();
			records.caseUpdate.closeTheScreen();
			records.switchToCaseSearch();
			records.caseSearch.ClickReset();
			records.switchToCaseSearch();
			records.caseSearch.EnterAtCaseNo1();
			records.switchToCaseUpdate();
			records.caseUpdate.clickCaseManagementIcon();
			cM.switchToCaseFolder();  
			cM.caseFolder.switchToAttachmentsTab();
			cM.caseFolder.attachmentsTab.verifyAddFilesButtonEnabled();
			cM.caseFolder.attachmentsTab.clickAddFiles();
			cM.caseFolder.attachmentsTab.attachmentsCategoryPopup.clickCancel();
			cM.switchToCaseFolder();
			cM.caseFolder.close();
			records.switchToCaseUpdate();
			records.caseUpdate.closeTheScreen();

		}
	 
	 @Test (priority=4,groups={"2020DefectAttachmentsSequential"})  // Raja Sadaraj
		public void Police2020recordsModule_253131(ITestContext testContext) {
			
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "253131");

			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.clickReportingTab();
			records.caseUpdate.reportingTab.selectRowByAtType();
			records.switchToReportStatus();
			records.reportStatus.clickPropertyButton();
			property.switchToPropertyEditEntryPopup();
			property.propertyEditEntry.clickAddNewPropertyReport();
			property.switchToPropertyEntry();
			property.propertyEntry.verifyAtCaseNo();
			property.propertyEntry.clickMainTab();
			property.propertyEntry.propertyEntryMainTab.selectAtReason();
			property.propertyEntry.propertyEntryMainTab.selectAtProperty();
			property.propertyEntry.propertyEntryMainTab.enterDescription();
			property.propertyEntry.propertyEntryMainTab.EnterQuantity();
			property.propertyEntry.propertyEntryMainTab.enterValue();
			property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
			property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
			names.switchToNameSearchHelpWindow();
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
			property.switchToPropertyEntry();
			property.propertyEntry.clickRecoveredTab();
			property.propertyEntry.recoveredTab.tabDateAndTime();
			property.propertyEntry.recoveredTab.tabOutQuantity();
			property.propertyEntry.recoveredTab.tabOutValue();
			property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
			property.propertyEntry.recoveredTab.EnterRemarks();
			property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
			// property.propertyEntry.recoveredTab.VerifyEvidenceLockerUseConfirmMessage();
			property.switchToPropertyEntry();
			property.propertyEntry.SaveTheScreen();
			property.switchToPropertyEntry();
			property.propertyEntry.closeTheScreen();
			records.switchToReportStatus();
			records.reportStatus.ClickArrestButton();
			names.switchToArrestEntry();
			names.arrestEntry.enterAtNameID();
			names.arrestEntry.switchToArrestTab();
			names.arrestEntry.arrestTab.selectAtHow();
			names.arrestEntry.arrestTab.selectArmed();
			names.arrestEntry.arrestTab.EnterOffenderID();
			names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
			names.arrestEntry.switchToChargeTab();
			names.arrestEntry.chargeTab.tabTheCaseNoEntries();
			names.arrestEntry.chargeTab.tabTheArrestLocation();
			names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
			names.arrestEntry.chargeTab.enterAtCharge();
			names.arrestEntry.chargeTab.SelectAtNIBRS();
			names.arrestEntry.chargeTab.TabTheCount();
			names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
			names.arrestEntry.chargeTab.clickTheAddButton();
			names.arrestEntry.saveScreen();
			names.switchToArrestEntry();
			names.arrestEntry.switchToAttachmentTab();
			names.arrestEntry.attachmentsTab.clickAddFiles();
			names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
			names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
			names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectTextFile();
			names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			names.switchToArrestEntry();
			names.arrestEntry.saveScreen();
			names.switchToArrestEntry();
			names.arrestEntry.switchToApprovalTab();
			names.arrestEntry.arrestEntryApprovalTab.selectActionAsSendForApproval();
			names.arrestEntry.arrestEntryApprovalTab.TabDateTime();
			names.arrestEntry.arrestEntryApprovalTab.SaveInternalTab();
			names.switchToArrestEntry();
			names.arrestEntry.switchToApprovalTab();
			names.arrestEntry.arrestEntryApprovalTab.selectActionAsApprove();
			names.arrestEntry.arrestEntryApprovalTab.TabDateTime();
			names.arrestEntry.arrestEntryApprovalTab.SaveInternalTab();
			names.switchToArrestEntry();
			names.arrestEntry.VerifyStatusAsApproved();
			names.switchToArrestEntry();

		}

	 @Test
		public void Police2018recordsModule_159626(ITestContext testContext) {
			testContext.setAttribute("testID", "159626");

			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Report Search");
			records.switchToReportSearch();
			records.reportSearch.clickDateTimeResetButton();
			records.reportSearch.EnterFromAndEndAtCaseNo();
			records.reportSearch.clickSearch();
			records.reportSearch.SelectRowByAtCaseNo();
			records.switchToReportStatus();
			records.reportStatus.ClickSuspectButton();
			records.switchToCaseSuspect();
			records.caseSuspect.ClickAddSuspectButton();
			names.switchToSuspectEntry();
			names.suspectEntry.EnterSuspectName();
			names.suspectEntry.SelectRace();
			names.suspectEntry.SelectSex();
			names.suspectEntry.EnterHeight();
			names.suspectEntry.EnterWeight();
			names.suspectEntry.EnterAge();
			names.suspectEntry.SelectEyes();
			names.suspectEntry.SelectHair();
			names.suspectEntry.SelectItem();
			names.suspectEntry.SelectColor();
			names.suspectEntry.EnterDescription();
			names.suspectEntry.ClickAddIcon();
			names.suspectEntry.EnterComments();
			names.suspectEntry.Save();
			names.switchToSuspectEntry();
			names.suspectEntry.SaveAndClose();
			names.switchToSuspectEntry();
			records.switchToCaseSuspect();
			records.caseSuspect.ClickRefreshButton();
			records.caseSuspect.VerifyNameExistInGrid(1);
			records.caseSuspect.CloseScreen();
			records.switchToReportStatus();
			records.reportStatus.ClickAttachmentsButton();
			home.switchToReportAttachmentScreen();
			home.attachment.ClickAddFilesButton();
			home.attachment.SelectCategory();
			home.attachment.ClickSelectButton();
			home.attachment.SelectImageFile();
			home.switchToReportAttachmentScreen();
			home.attachment.ClickAddButton();
			home.attachment.ClickRefreshButton();
			home.attachment.VerifyAddedAttachementExistInTheGrid(1);
			home.attachment.Close();
	//records.switchToReportStatus();
	// records.reportStatus.close();

		}
	//Attachment
	  //@Test(groups = {"CoronerCaseFunctionality"})
	  public void CoronerCaseEntryAttachmentTab_265732(ITestContext testContext)
	  {
		  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "265732");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Coroner");
			loader.navigateToScreen("Coroner Case Search");
			coroner.switchToCoronerCaseSearchScreen();
			coroner.coronerCaseSearch.enterAtNameID();
			coroner.coronerCaseSearch.selectAtCauseOfDeath();
			coroner.coronerCaseSearch.selectAtCaseStatus();
			coroner.coronerCaseSearch.clickOnSearch();
			coroner.coronerCaseSearch.selectGridRowByName();
			coroner.switchToCoronerCaseEntry();
			coroner.coronerCaseEntry.verifyAtInvestNo();
			coroner.coronerCaseEntry.clickOnAttachmentsTab();
			coroner.coronerCaseEntry.attachmentsTab.clickAddFiles();
			coroner.coronerCaseEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
			coroner.coronerCaseEntry.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
			coroner.coronerCaseEntry.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
			coroner.coronerCaseEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			coroner.switchToCoronerCaseEntry();
			coroner.coronerCaseEntry.clickOnAttachmentsTab();
			coroner.coronerCaseEntry.attachmentsTab.selectAttachmentCheckBoxByIndex(0);
			coroner.coronerCaseEntry.attachmentsTab.verifyDownloadSelectedFilesButtonEnabled();
			
	  }
	  
	  @Test(groups={"2020DefectAttachments"}) // Automated by Stalin
		public void VerifyIfaddedmultipleAttachment(ITestContext testContext) {
			
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "253685");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Walk-In Entry");
			records.switchToWalkInEntry();
			records.walkInEntry.enterAtCADCFS();
			records.walkInEntry.tabTheReportedDate();
			records.walkInEntry.tabTheReportedTime();
			records.walkInEntry.enterAtLocation();
			records.walkInEntry.tabTheReceivedSource();
			records.walkInEntry.enterAtCADDispositon();
			records.walkInEntry.enterAtUnit();
			records.walkInEntry.save();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickNotificationIcon();
			home.switchToNotificationScreen();
			home.notification.clickEMailRadioButton();
			home.notification.verifyEmailAdressFieldIsEnabled();
			home.notification.enterAtEmail();
			home.notification.enterAtName();
			home.notification.selectAtReportingPeriod();
			home.notification.selectAtNotifyEvent();
			home.notification.clickAddButton();
			home.notification.SaveScreen();
			home.switchToNotificationScreen();
			home.notification.VerifySuccessfulBottomMessage();
			home.notification.CloseScreen();
			records.switchToCaseUpdate();
			records.caseUpdate.clickResetButton();
			records.caseUpdate.clickAttachmentTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickBulkAttachmentRadioButton();
			home.switchToMultiFilesAttachment();
			home.multiFilesAttachments.clickBrowseButton();
			home.multiFilesAttachments.selectBulkAttachment();
			home.switchToMultiFilesAttachment();
			home.multiFilesAttachments.clickBrowseButton();
			home.multiFilesAttachments.selectBulkAttachment();
			home.multiFilesAttachments.clickUploadButton();
			home.multiFilesAttachments.clickCloseButton();
			records.switchToCaseUpdate();
			records.caseUpdate.SaveNClose();

		}
	  @Test
		public void Police2017Sprint2recordsModule_149450(ITestContext testContext)
		{
		          testContext.setAttribute("testID", "149450");

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Records");
		loader.navigateToScreen("Case Search");
		records.switchToCaseSearch();
		records.caseSearch.enterAtCaseNo();
		records.switchToCaseUpdate();
		records.caseUpdate.clickAttachmentTab();
		records.caseUpdate.attachmentsTab.clickAddFiles();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterFolderNameAsAUTO();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		records.caseUpdate.attachmentsTab.verifyAddedAttachementExistInTheGrid();
		records.caseUpdate.attachmentsTab.ClickFolderRadioButton();
		records.caseUpdate.attachmentsTab.clickAddFiles();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterFolderNameAsAUTO();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectTextFile();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		records.switchToCaseUpdate();
		records.caseUpdate.clickAttachmentTab();
		records.caseUpdate.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(2);
		records.caseUpdate.attachmentsTab.ClickFolderRadioButton();
		records.caseUpdate.attachmentsTab.clickAddFiles();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterFolderNameAsAUTO();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectTextFile();
		records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		records.caseUpdate.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(1);
		}
	  
		@Test  (priority=1,groups={"2020DefectAttachmentsSequential"})       //Automated by Stalin
		public void VerifyAttachmentincalltoDelete_252310(ITestContext testContext) {
			
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		          testContext.setAttribute("testID", "252310");
		          Browser.NavigateToLoginScreen();
		          login.loginScreen.logonUsingTestContext();
		          loader.navigateToModule("Records");
		          loader.navigateToScreenByScreenID("2412 - Call Search");
		          records.switchToCallSearch();
		          Playback.pageLoadThreadWait();
		          records.callSearch.enterAtCallNo();
		          records.switchToCallEntry();
		          records.callEntry.switchToAttachmentTab();
		          records.callEntry.attachmentsTab.clickAddFiles();
		records.callEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
		          records.callEntry.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
		          records.callEntry.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();

		// records.callEntry.attachmentsTab.callEntryAttachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
		          records.callEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		          records.callEntry.attachmentsTab.clickAddFiles();
		records.callEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
		          records.callEntry.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
		          records.callEntry.attachmentsTab.attachmentsCategoryPopup.selectImageFile();

		// records.callEntry.attachmentsTab.callEntryAttachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
		          records.callEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		          records.callEntry.attachmentsTab.clickAddFiles();
		          records.callEntry.attachmentsTab.deleteAttachmentFileInGrid();
		          popUp.confirm.yes();
		          records.switchToCallEntry();
		          records.callEntry.clickCaseInfoIcon();
		          records.switchToCaseUpdate();
		          records.caseUpdate.switchToCaseUpdateAttachmentsTab();
		          records.caseUpdate.attachmentsTab.deleteAttachmentFileInGrid();
		          popUp.switchToAcknowledge();
		records.caseUpdate.attachmentsTab.verifyAttachmentCannotBeDeletedAcknowledgeMessage();

		}





		@Test (priority=2,groups={"2020DefectAttachmentsSequential"})   //Automated By Stalin
		          public void Verifattachmentaddedabletodelete_252311(ITestContext testContext) {
			
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		                   testContext.setAttribute("testID", "252311");
		                   Browser.NavigateToLoginScreen();
		                   login.loginScreen.logonUsingTestContext();
		                   loader.navigateToModule("Records");
		                   loader.navigateToScreen("Case Search");
		                   records.switchToCaseSearch();
		                   records.caseSearch.enterAtCaseNo();
		                   records.switchToCaseUpdate();
		                   records.caseUpdate.switchToCaseUpdateAttachmentsTab();
		                   records.caseUpdate.attachmentsTab.clickAddFiles();
		          records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
		                   records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
		                    records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();

		          records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
		                    records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		                   records.caseUpdate.attachmentsTab.clickAddFiles();
		          records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
		                   records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
		                    records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectTextFile();
		          records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
		                    records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		          
		                   records.switchToCaseUpdate();
		                   records.caseUpdate.clickCallInfoIcon();
		                   records.switchToCallEntry();
		                   records.callEntry.switchToAttachmentTab();
		                   records.callEntry.attachmentsTab.deleteAttachmentFileInGrid();
		                   popUp.switchToAcknowledge();
		          records.callEntry.attachmentsTab.verifyAttachmentCannotBeDeletedAcknowledgeMessage();

		          }
		
		@Test (priority=3,groups={"2020DefectAttachmentsSequential"}) // Raja Sadaraj
		public void Police2020recordsModule_253130(ITestContext testContext) {
			
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "253130");

			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickCrashIcon();
			trafficWI.switchToCrashEntry();
			trafficWI.crashEntry.verifyAtCaseNo();
			trafficWI.crashEntry.verifyAtReportedLocation();
			trafficWI.crashEntry.enterAtDOTNo();
			trafficWI.crashEntry.enterAmendedNo();
			trafficWI.crashEntry.enterAtOfficer();
			trafficWI.crashEntry.switchToMainTab();
			trafficWI.crashEntry.crashEntryMainTab.enterAtEMSNo();
			trafficWI.crashEntry.crashEntryMainTab.enterTotalInjured();
			trafficWI.crashEntry.crashEntryMainTab.enterAtTotalUnit();
			trafficWI.crashEntry.crashEntryMainTab.clickReportableCheckBox();
			trafficWI.crashEntry.crashEntryMainTab.clickTruckBusCheckBox();
			trafficWI.crashEntry.crashEntryMainTab.clickHitAndRunCheckBox();
			trafficWI.crashEntry.crashEntryMainTab.clickPhotoTakenCheckBox();
			trafficWI.crashEntry.crashEntryMainTab.clickTrailerTowedCheckBox();
			trafficWI.crashEntry.crashEntryMainTab.clickTruckWith2Axles6TiresCheckBox();
			trafficWI.crashEntry.crashEntryMainTab.clickMedicalTransportCheckBox();
			trafficWI.crashEntry.crashEntryMainTab.clickTowedCheckBox();
			trafficWI.crashEntry.switchToPropertyOwnerTab();
			trafficWI.crashEntry.propertyOwnerTab.enterAtNameID();
			trafficWI.crashEntry.propertyOwnerTab.selectAtPropertyType();
			trafficWI.crashEntry.propertyOwnerTab.enterDamageTagNo();
			trafficWI.crashEntry.propertyOwnerTab.selectOrgType();
			trafficWI.crashEntry.propertyOwnerTab.clickAdd();
			trafficWI.crashEntry.save();
			popUp.confirm.yes();
			trafficWI.switchToCrashEntry();
			trafficWI.crashEntry.switchToApprovalTab();
			trafficWI.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
			trafficWI.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
			trafficWI.crashEntry.crashEntryApprovalTab.save();
			trafficWI.switchToCrashEntry();
			trafficWI.crashEntry.switchToApprovalTab();
			trafficWI.crashEntry.crashEntryApprovalTab.selectActionAsApprove();
			trafficWI.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
			trafficWI.crashEntry.crashEntryApprovalTab.save();
			trafficWI.switchToCrashEntry();
			trafficWI.crashEntry.verifyStatusAsApprovedAndColor();
			trafficWI.crashEntry.close();
			records.switchToCaseUpdate();
			records.caseUpdate.VerifyCrashIconColorChange();
			records.caseUpdate.ClickCitationIcon();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.selectAtCEType();
			trafficWI.citationEntry.enterDate();
			trafficWI.citationEntry.enterTime();
			trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
			trafficWI.citationEntry.enterAtNameID();
			trafficWI.citationEntry.switchToOffenseTab();
			trafficWI.citationEntry.offenseTab.enterAtCharge();
			trafficWI.switchToCitationArrest();
			trafficWI.citationArrest.selectArmed();
			trafficWI.citationArrest.saveCloseScren();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.offenseTab.enterAtStreetName();
			trafficWI.citationEntry.switchToOfficerTab();
			trafficWI.citationEntry.officerTab.tabOutOfficer();
			trafficWI.citationEntry.officerTab.verifyAtOfficer();
			trafficWI.citationEntry.save();
			popUp.confirm.yes();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToAttachmentTab();
			trafficWI.citationEntry.attachmentsTab.clickAddFiles();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup
					.selectCategoryAsDocumentFile();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup
					.ClickSingleFileRadioButton();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToApprovalTab();
			trafficWI.citationEntry.citationEntryApprovalTab.selectActionAsSendForApproval();
			trafficWI.citationEntry.citationEntryApprovalTab.tabThroughDateTime();
			trafficWI.citationEntry.citationEntryApprovalTab.save();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToApprovalTab();
			trafficWI.citationEntry.citationEntryApprovalTab.selectActionAsApprove();
			trafficWI.citationEntry.citationEntryApprovalTab.tabThroughDateTime();
			trafficWI.citationEntry.citationEntryApprovalTab.save();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.save();
			popUp.confirm.yes();
			trafficWI.switchToCrashEntry();
			trafficWI.citationEntry.closeCitationEntryScreen();
			records.switchToCaseUpdate();
			records.caseUpdate.VerifyCitationIconColorChange();
		}

		@Test (priority=5,groups={"2020DefectAttachmentsSequential"}) // Raja Sadaraj
		public void Police2020recordsModule_254490(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "254490");

			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.clickReportingTab();
			records.caseUpdate.reportingTab.selectRowByAtType();
			records.switchToReportManager();
			records.reportManager.VerifyTypeAsIncidentReportDisabled();
			records.reportManager.tabReportedbyPF();
			records.reportManager.tabDateAndTime();
			records.reportManager.save();
			records.switchToReportStatus();
			records.reportStatus.close();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickPropertyTab();
			records.caseUpdate.caseUpdatePropertyTab.ClickAddNewPropertyReport();
			property.switchToPropertyEntry();
			property.propertyEntry.clickMainTab();
			property.propertyEntry.propertyEntryMainTab.selectAtReason();
			property.propertyEntry.propertyEntryMainTab.selectAtProperty();
			property.propertyEntry.propertyEntryMainTab.enterDescription();
			property.propertyEntry.propertyEntryMainTab.EnterQuantity();
			property.propertyEntry.propertyEntryMainTab.enterValueAs28500();
			property.propertyEntry.propertyEntryMainTab.EnterAtLastName();
			property.propertyEntry.propertyEntryMainTab.EnterAtFirstName();
			names.switchToNameSearchHelpWindow();
			names.nameSearchHelpWindow.selectNameByLastNameAndFirstName();
			property.switchToPropertyEntry();
			property.propertyEntry.clickRecoveredTab();
			property.propertyEntry.recoveredTab.tabDateAndTime();
			property.propertyEntry.recoveredTab.tabOutQuantity();
			property.propertyEntry.recoveredTab.tabOutValue();
			property.propertyEntry.recoveredTab.selectDispositionAsSentToPropertyRoom();
			property.propertyEntry.recoveredTab.enterAtInitialStorageLocation();
			property.propertyEntry.SaveTheScreen();
			property.switchToPropertyEntry();
			property.propertyEntry.clickReportDetailsButton();
			records.switchToReportManager();
			records.reportManager.switchToUpdateStatusTab();
			records.reportManager.updateStatusTab.selectActionAsSendForApproval();
			records.reportManager.save();
			records.switchToReportManager();
			records.reportManager.switchToUpdateStatusTab();
			records.reportManager.updateStatusTab.selectActionAsApprove();
			records.reportManager.save();
			records.switchToReportManager();
			records.reportManager.Close();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickPropertyTab();
			records.caseUpdate.caseUpdatePropertyTab.VerifyAtReasonInGrid(0);
			records.switchToCaseUpdate();
			records.caseUpdate.clickReportingTab();
			records.caseUpdate.reportingTab.VerifyPropertyStatusAsLocked();
			records.caseUpdate.reportingTab.selectRowByAtType();
			records.switchToReportStatus();
			records.reportStatus.ClickArrestButton();
			names.switchToArrestEntry();
			names.arrestEntry.enterAtNameID();
			names.arrestEntry.arrestTab.VerifyAtCaseNo();
			names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
			names.arrestEntry.arrestTab.selectAtHow();
			names.arrestEntry.arrestTab.EnterOffenderID();
			names.arrestEntry.arrestTab.selectArmed();
			names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
			names.arrestEntry.switchToChargeTab();
			names.arrestEntry.chargeTab.VerifyAtCaseNo();
			names.arrestEntry.chargeTab.tabTheArrestLocation();
			names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
			names.arrestEntry.chargeTab.enterAtCharge();
			names.arrestEntry.chargeTab.TabTheCount();
			names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
			names.arrestEntry.chargeTab.clickTheAddButton();
			names.arrestEntry.saveScreen();
			names.switchToArrestEntry();
			names.arrestEntry.ClickAllTabs();
			names.arrestEntry.saveScreen();
			names.switchToArrestEntry();
			names.arrestEntry.switchToAttachmentTab();
			names.arrestEntry.attachmentsTab.clickAddFiles();
			names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
			names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectArrestDocketPDFFile();
			names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd(); 
			names.arrestEntry.switchToAttachmentTab();
			names.switchToArrestEntry();
			names.arrestEntry.saveScreen();
			names.switchToArrestEntry();
			names.arrestEntry.switchToArrestTab();
			names.arrestEntry.arrestTab.clickCaseInfoButton();
			records.switchToCaseUpdate();
			records.caseUpdate.clickReportingTab();

		}
	  
		@Test (priority=6,groups={"2020DefectAttachmentsSequential"}) // Raja Sadaraj
		public void Police2020recordsModule_254491(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "254491");

			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Traffic");
			loader.navigateToScreen("Citation Entry");
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.enterAtCaseNo();
			trafficWI.citationEntry.verifyCitationNoDisabled();
			trafficWI.citationEntry.enterDate();
			trafficWI.citationEntry.enterTime();
			trafficWI.citationEntry.selectAtCEType();
			trafficWI.citationEntry.selectAtDefendantType();
			trafficWI.citationEntry.enterAtNameID();
			trafficWI.citationEntry.switchToOffenseTab();
			trafficWI.citationEntry.offenseTab.enterAtCharge();
			trafficWI.switchToCitationArrest();
			trafficWI.citationArrest.selectArmed();
			trafficWI.citationArrest.saveCloseScren();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToOffenseTab();
			trafficWI.citationEntry.offenseTab.enterAtStreetName();
			trafficWI.citationEntry.switchToOfficerTab();
			trafficWI.citationEntry.officerTab.tabOutOfficer();
			trafficWI.citationEntry.save();
			trafficWI.citationEntry.Yes();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.switchToAttachmentTab();
			trafficWI.citationEntry.attachmentsTab.clickAddFiles();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup
					.selectCategoryAsDocumentFile();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.selectTrafficsummonPDFFile();
			trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			trafficWI.switchToCitationEntry();
			trafficWI.citationEntry.save();
			trafficWI.citationEntry.Yes();
			trafficWI.citationEntry.ClickCaseInfoIcon();
			records.switchToCaseUpdate();
			records.caseUpdate.clickReportingTab();
			// records.caseUpdate.reportingTab.ver
			// need to add steps
		}
		
		@Test(groups={"2020DefectAttachments"}) // Sep Sprint 6 Mahesha K S
		public void VerifyCreatePDFFuntionalityForAttachmentFiles_251435(ITestContext testContext) {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "254135");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();

			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.switchToCaseUpdateAttachmentsTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();

			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			records.switchToCaseUpdate();
			records.caseUpdate.switchToCaseUpdateAttachmentsTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			records.switchToCaseUpdate();
			records.caseUpdate.switchToCaseUpdateAttachmentsTab();
			records.caseUpdate.attachmentsTab.verifyAddedAttachementExistInTheGrid();
			records.caseUpdate.attachmentsTab.verifyCreateAsPDFnotEnabled();
			records.caseUpdate.attachmentsTab.clickAllAttachmentsCheckbox();
			records.caseUpdate.attachmentsTab.verifyCreateAsPDFEnabled();
			records.caseUpdate.attachmentsTab.clickCreateAsPDFButton();
			records.caseUpdate.attachmentsTab.switchToPDFwindow();
			records.caseUpdate.attachmentsTab.verifyTotalFilesAvailableInPDF();

		}
		
		@Test(groups={"2020DefectAttachments"}) // Vijay
		public void verifyThatTheAttachmentAddedFromCaseIsAbleToDeleteWhenRole2475DeleteDisabled_255129(
				ITestContext testcontext) {
			
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "255129");
			Browser.NavigateToLoginScreen();
			login.loginScreen.logonUsingTestContext();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo();
			records.switchToCaseUpdate();
			records.caseUpdate.switchToCaseUpdateAttachmentsTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
			records.switchToCaseUpdate();
			records.caseUpdate.switchToCaseUpdateAttachmentsTab();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			records.switchToCaseUpdate();
			records.caseUpdate.switchToCaseUpdateAttachmentsTab();
			records.caseUpdate.attachmentsTab.deleteAttachmentedFile();
			records.caseUpdate.attachmentsTab.verifyAccessdeniedAcknowledgemessage();
			records.switchToCaseUpdate();
			records.caseUpdate.clickCallInfoIcon();
			records.switchToCallEntry();
			records.callEntry.switchToAttachmentTab();
			records.callEntry.attachmentsTab.deleteAttachmentFileInGrid();
			records.callEntry.attachmentsTab.verifyAttachmentCannotBeDeletedAcknowledgeMessage();

		}

		@Test(groups={"2020DefectAttachments"}) // Vijay
		public void verifyIfAddedMultipleAttachmentApplicationShouldNotifyOneTime_255338(ITestContext testcontext) {
			
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "255338");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.navigateToModule("Records");

			loader.navigateToScreen("Walk-In Entry");
			records.switchToWalkInEntry();
			records.walkInEntry.enterAtCADCFS();
			records.walkInEntry.verifyAtCFSDescription();
			records.walkInEntry.tabTheReportedDate();
			records.walkInEntry.verifyAtDateAsCurrentDate();
			records.walkInEntry.tabTheReportedTime();
			records.walkInEntry.enterAtLocation();
			records.walkInEntry.clickLocationVerifyCheckbox();
			records.walkInEntry.verifyAddressBubbleIconDisplayed();
			records.walkInEntry.tabTheReceivedSource();
			records.walkInEntry.enterAtCADDispositon();
			records.walkInEntry.verifyAtCADDescription();
			records.walkInEntry.enterAtUnit();
			records.walkInEntry.verifyAtUnitDescription();
			records.walkInEntry.save();
			records.switchToCallEntry();
			records.callEntry.clickGenerateCheckbox();
			records.callEntry.save();
			records.switchToCallEntry();
			String caseYear = records.callEntry.readCaseYear();
			String caseNo = records.callEntry.readCaseNo();
			records.switchToCallEntry();
			records.callEntry.clickCaseInfoIcon();
			records.switchToCaseUpdate();
			records.caseUpdate.ClickNotificationIcon();
			home.switchToNotificationScreen();
			home.notification.clickEMailRadioButton();
			home.notification.verifyEmailAddressFieldIsDisplayed();
			home.notification.verifyReportingPeriodFieldIsDisplayed();
			home.notification.verifyEmailNotifyEventIsEnabled();
			home.notification.enterAtEmail();
			home.notification.enterAtName();
			home.notification.selectAtReportingPeriod();
			home.notification.selectAtNotifyEvent();
			home.notification.clickAddButton();
			home.notification.saveNCloseScreen();
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.enterAtCaseNo(caseNo);
			records.switchToCaseUpdate();
			records.caseUpdate.switchToCaseUpdateAttachmentsTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsScanDocument();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickBulkAttachmentRadioButton();
			home.switchToMultiFilesAttachment();
			home.multiFilesAttachments.clickBrowseButton();
			home.multiFilesAttachments.selectBulkAttachment();
			home.multiFilesAttachments.clickUploadButton();
			home.multiFilesAttachments.clickBrowseButton();
			home.multiFilesAttachments.selectBulkAttachment();
			home.multiFilesAttachments.clickUploadButton();
			home.multiFilesAttachments.clickCloseButton();
			home.multiFilesAttachments.verifyAtCloseCurrentPagePopup();
			records.switchToCaseUpdate();
	  }
		
		@Test(groups={"2020DefectAttachments"}) // Vijay
		public void verifyTheAttachmentTabAllowToAddDocumentViaFolderOption_252308(ITestContext testcontext)
				throws Exception {
			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testcontext.setAttribute("testID", "252308");
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
			records.caseUpdate.clickAttachmentTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickFolderRadioButton();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectFolder();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectFolderCategory();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickFolderAddButton();
		}
		
		@Test(groups= {"2020DefectAttachments"}) // Automated by Stalin
		public void parameter228isEmpty(ITestContext testContext) {

			ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			testContext.setAttribute("testID", "259726");
			Browser.NavigateToLoginScreen();
			login.loginScreen.Logon();
			loader.ClickSystemParameterIcon();
			settings.switchToSystemParamterScreen();
			settings.sysParameter.selectAtModule();
			settings.sysParameter.setSystemparameter228AsNull();
			settings.switchToSystemParamterScreen();
			settings.sysParameter.closeTheScreen();
			loader.navigateToModule("Records");
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.clickSearch();
			records.caseSearch.SelectRowInGrid(0);
			records.switchToCaseUpdate();
			records.caseUpdate.clickAttachmentTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.ClickSingleFileRadioButton();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile(); // Used AutoIT Method to attach file
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.verifyFileExceedAcknolwdgeMessage();
			records.switchToCaseUpdate();
			records.caseUpdate.closeTheScreen();
			records.switchToCaseSearch();
			records.caseSearch.clickBackButton();
			objectIdentification.windowHandle.switchToMainWindow();
			loader.ClickSystemParameterIcon();
			settings.switchToSystemParamterScreen();
			settings.sysParameter.selectAtModule();
			settings.sysParameter.setSystemparameter231AsNetwork();
			settings.switchToSystemParamterScreen();
			settings.sysParameter.closeTheScreen();
			loader.navigateToScreen("Case Search");
			records.switchToCaseSearch();
			records.caseSearch.clickSearch();
			records.caseSearch.SelectRowInGrid(0);
			records.switchToCaseUpdate();
			records.caseUpdate.clickAttachmentTab();
			records.caseUpdate.attachmentsTab.clickAddFiles();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.ClickSingleFileRadioButton();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
			records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			records.switchToCaseUpdate();
			records.caseUpdate.saveScreen();
			records.switchToCaseUpdate();

		}

		
		  @Test //Mithun 
		  public void PoliceDefect2020_255132(ITestContext testContext)
		  {
		  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		  testContext.setAttribute("testID", "255132");
		  
		  Browser.NavigateToLoginScreen(); login.loginScreen.Logon();
		  
		  loader.navigateToModule("Settings");
		  loader.navigateToScreen("System Parameter");
		  settings.switchToSystemParamter();
		  settings.sysParameter.setSystemparameter203AsSMTPserver();
		  settings.switchToSystemParamter();
		  settings.sysParameter.setSystemparameter204AsBlank();
		  settings.switchToSystemParamter();
		  settings.sysParameter.setSystemparameter205AsBlank();
		  settings.switchToSystemParamter();
		  settings.sysParameter.setSystemparameter806AsEmailId();
		  settings.switchToSystemParamter();
		  settings.sysParameter.setSystemparameter807As1();
		  settings.switchToSystemParamter();
		  settings.sysParameter.setSystemparameter808As1();
		  settings.switchToSystemParamter();
		  settings.sysParameter.setSystemparameter809As1();
		  
		  loader.navigateToModule("Records"); loader.navigateToScreen("UOF Search");
		  records.switchToUOFSearch(); records.uOFSearch.ClickAddNew();
		  records.switchToUOFEntry(); records.uOFEntry.TabOfficerPF();
		  records.uOFEntry.EnterAtRelatedCaseNo();
		  records.uOFEntry.EnterAtSubjectLastName();
		  records.uOFEntry.EnterAtSubjectFirstName();
		  names.switchToNameSearchHelpWindow();
		  names.nameSearchHelpWindow.SelectName(); records.switchToUOFEntry();
		 records.uOFEntry.TabUOFDateAndTime();
		 records.uOFEntry.VerifyCurrentDateAutoPopulates();
		  records.uOFEntry.ClickTypeOfForceTab();
		  records.uOFEntry.typeOfForceTab.SelectAtTypesOfForceUsedByOfficer();
		  records.uOFEntry.typeOfForceTab.SelectEffectiveness();
		  records.uOFEntry.typeOfForceTab.ClickAddButton(); records.uOFEntry.Save();
		  records.switchToUOFEntry();
		 
		  }
		 
		  @Test(groups={"2020DefectAttachments"}) // Vijay
			public void verifyThatAttachmentFileAddedFromCallEntryIsShowingInCaseCM_261410(ITestContext testcontext) {
				
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testcontext.setAttribute("testID", "261410");
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Records");
				loader.navigateToScreen("Call Search");
				records.switchToCallSearch();
				records.callSearch.enterAtCallNo();
				records.switchToCallEntry();
				records.callEntry.switchToAttachmentTab();
				records.callEntry.attachmentsTab.clickAddFiles();
				records.callEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
				records.callEntry.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
				records.callEntry.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
				records.callEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
				records.switchToCallEntry();
				records.callEntry.save();
				records.switchToCallEntry();
				records.callEntry.clickCaseInfoIcon();
				records.switchToCaseUpdate();
				records.caseUpdate.switchToCaseUpdateAttachmentsTab();
				records.caseUpdate.attachmentsTab.deleteAttachmentFileInGrid();// Changed
				records.caseUpdate.attachmentsTab.verifyAttachmentCannotBeDeletedAcknowledgeMessage();// Changed
				records.switchToCaseUpdate();
				records.caseUpdate.clickCaseManagementIcon();
				cM.switchToCaseFolder();
				cM.caseFolder.clickAssignmentTab();
				cM.caseFolder.caseFolderAssignmentTab.selectAtDivision();
				cM.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
				cM.caseFolder.caseFolderAssignmentTab.enterAtPrimeInvestigator();
				cM.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
				cM.caseFolder.caseFolderAssignmentTab.selectTemplateAsAutomation();
				cM.caseFolder.caseFolderAssignmentTab.clickLoadButton();
				cM.switchToCaseFolder();
				cM.caseFolder.save();
				cM.switchToCaseFolder();
				cM.caseFolder.switchToAttachmentsTab();
				cM.caseFolder.attachmentsTab.deleteAttachmentFileInGrid();
				cM.caseFolder.attachmentsTab.verifyAttachmentCannotBeDeletedAcknowledgeMessage();
				objectIdentification.windowHandle.switchToMainWindow();

			}
		  
		  
		  @Test(groups = {"2020DefectAttachments"}) //Mithun

		  public void Police2020DefectrecordsModule_254492(ITestContext testContext)
		  {
		  	testContext.setAttribute("testID", "254492");
		  	
		  	Browser.NavigateToLoginScreen();
		  	login.loginScreen.Logon();	
		      loader.navigateToModule("Records");
		      loader.navigateToScreen("Walk-In Entry");
		      records.switchToWalkInEntry();
		      records.walkInEntry.enterAtCADCFS();
		      records.walkInEntry.tabTheReportedDate();
		      records.walkInEntry.tabTheReportedTime();
		      records.walkInEntry.enterAtLocation();
		      records.walkInEntry.tabTheReceivedSource();
		      records.walkInEntry.enterAtCADDispositon();
		      records.walkInEntry.enterAtUnit();
		      records.walkInEntry.save();
		      
		      records.switchToCaseUpdate();
		      records.caseUpdate.clickReportingTab();
		      records.caseUpdate.reportingTab.clickAddReportButton();
		      records.switchToReportManager();
		      records.reportManager.selectAtType();
		      records.reportManager.tabReportedbyPF();
		      records.reportManager.tabDateAndTime();
		      records.reportManager.Saveandclose();
		      
		      records.switchToReportStatus();
		      records.reportStatus.ClickArrestButton();

		      names.switchToArrestEntry();
		      names.arrestEntry.enterAtNameID();
		      names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		      names.arrestEntry.arrestTab.selectHow();
		      names.arrestEntry.arrestTab.EnterOffenderID();
		      names.arrestEntry.arrestTab.selectArmed();
		      names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		      names.arrestEntry.switchToChargeTab();
		      names.arrestEntry.chargeTab.tabTheArrestLocation();
		      names.arrestEntry.chargeTab.TabTheOffenseDateAndTime();
		      names.arrestEntry.chargeTab.enterAtCharge();
		      popUp.kPICodedLookup.randomKPIHelpSelect();
		      names.switchToArrestEntry();
		      names.arrestEntry.switchToChargeTab();
		      names.arrestEntry.chargeTab.selectStatusAsArrestedAdult();
		      names.arrestEntry.chargeTab.clickTheAddButton();
		      names.arrestEntry.saveScreen();
		      names.switchToArrestEntry();
		      names.arrestEntry.clickPrintIcon();
		      home.switchToSelectReport();
		      home.selectReport.selectCheckBoxUsingAtOthersType();
		      home.selectReport.ClickPrintSelectedReportButton();
		      home.selectReport.clickIndividualReportButton();
		      names.switchToArrestEntry();
		      names.arrestEntry.switchToAttachmentTab();
		      names.arrestEntry.attachmentsTab.clickAddFiles();
		      names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
		      names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectArrestDocketPDFFile();
		      names.switchToArrestEntry();
		      names.arrestEntry.switchToAttachmentTab();
		      names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		      
		      names.switchToArrestEntry();
		      names.arrestEntry.switchToArrestTab();
		      names.arrestEntry.arrestTab.clickCaseInfoButton();
		      records.switchToCaseUpdate();
		      records.caseUpdate.clickReportingTab();
		      records.caseUpdate.reportingTab.verifyArrestDocketInGrid();
		      records.caseUpdate.reportingTab.clickAddReportButton();
		      records.switchToReportManager();
		      records.reportManager.tabReportedbyPF(); 
		      records.reportManager.selectAsSupplementReport();
		      records.reportManager.tabDateAndTime();
		      records.reportManager.save();
		      records.switchToCaseUpdate();
		      records.caseUpdate.clickReportingTab();
		      records.caseUpdate.reportingTab.verifyTypeAsSupplementReport(2);
		      
		      objectIdentification.windowHandle.switchToMainWindow();
		      loader.navigateToModule("Traffic");
		      loader.navigateToScreen("Citation Entry");
		      trafficWI.switchToCitationEntry();
		      trafficWI.citationEntry.selectAtCEType();
		      trafficWI.citationEntry.enterDate();
		      trafficWI.citationEntry.enterTime();
		      trafficWI.citationEntry.selectDefendantTypeAsIndividualAdult();
		      trafficWI.citationEntry.verifyCitationNoDisabled();
		      trafficWI.citationEntry.enterAtNameID();
		      trafficWI.citationEntry.switchToOffenseTab();
		      trafficWI.citationEntry.offenseTab.enterAtCharge();
		      trafficWI.citationEntry.offenseTab.enterAtStreetName();
		      trafficWI.citationEntry.switchToOfficerTab();
		      trafficWI.citationEntry.officerTab.tabOutOfficer();
		      trafficWI.switchToCitationEntry();
		      trafficWI.citationEntry.save();
		      
		      trafficWI.switchToCitationEntry();
		      trafficWI.citationEntry.clickPrintButton();
		      home.switchToSelectReport();
		      home.selectReport.selectCheckBoxUsingAtOthersType1();
		      home.selectReport.ClickPrintSelectedReportButton();
		      home.selectReport.clickIndividualReportButton();
		      home.selectReport.switchToKPITempPDFScreen();
		      home.selectReport.downloadReport();
		      home.selectReport.SaveReportToLocation("TrafficSummons");
		      trafficWI.switchToCitationEntry();
		      trafficWI.citationEntry.switchToAttachmentTab();
		      trafficWI.citationEntry.attachmentsTab.clickAddFiles();
		      trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.selectCategory();
		      trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.selectTrafficsummonPDFFile();
		      trafficWI.switchToCitationEntry();
		      trafficWI.citationEntry.switchToAttachmentTab();
		      trafficWI.citationEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		      trafficWI.switchToCitationEntry();
		      trafficWI.citationEntry.ClickCaseInfoIcon();
		          
		      trafficWI.switchToCitationEntry();
		      trafficWI.citationEntry.save();
		      records.switchToCaseUpdate();
		      records.caseUpdate.clickReportingTab();
		      records.caseUpdate.reportingTab.verifyAsTrafficSummons();
		      
		  }

		  @Test(groups={"2020DefectAttachments"}) //Q4 Sprint 4 Automated by Mahesha K S
		  public void VerifyAttachementCanAddOnlyForAllowedFormat_260151(ITestContext testcontext)
		     {
		  	//Working fine in 45
		  	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		  	testcontext.setAttribute("testID", "260151");
		  	Browser.NavigateToLoginScreen();
		  	login.loginScreen.Logon();
		  	loader.navigateToModule("Settings");
		  	loader.navigateToScreen("System Parameter");
		  	settings.switchToSystemParamter();
		  	settings.sysParameter.verifyAtParameterValueByID();
		  	loader.navigateToModule("Records");
		  	loader.navigateToScreen("Case Search");
		  	records.switchToCaseSearch();
		  	records.caseSearch.enterAtCaseNo();
		  	records.switchToCaseUpdate();
		  	records.caseUpdate.clickAttachmentTab();
		  	records.caseUpdate.attachmentsTab.clickAddFiles();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectAtFile();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		  	records.caseUpdate.attachmentsTab.verifyParameter30BulkExtentionNotConfiguredAcknowledge();
		  	records.switchToCaseUpdate();
		  	records.caseUpdate.clickAttachmentTab();
		  	records.caseUpdate.attachmentsTab.clickAddFiles();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		  	
		  	records.switchToCaseUpdate();
		  	records.caseUpdate.clickAttachmentTab();
		  	records.caseUpdate.attachmentsTab.clickAddFiles();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		  	records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		  		
		  	records.switchToCaseUpdate();
		  	records.caseUpdate.clickAttachmentTab();
		  	records.caseUpdate.attachmentsTab.verifyAddedAttachementExistInTheGrid();
		  	records.caseUpdate.attachmentsTab.selectFileByIndex(0);
		  	home.switchToGetAttachmentScreen();
		  	home.getAttachment.Close();
		  	
		  	records.switchToCaseUpdate();
		  	records.caseUpdate.clickAttachmentTab();
		  	records.caseUpdate.attachmentsTab.selectFileByIndex(1);
		  	home.switchToGetAttachmentScreen();
		  	
		   }

			@Test(groups={"2021DefectTestCases"}) // Vijay // 2021 Q2 Sprint 4
			public void verifyAttachementTabIsDisplayingAsBlueWhenAttachementDetailsAreInCaseUpdatescreen_273479(
					ITestContext testcontext) {
				ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				testcontext.setAttribute("testID", "273479");
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Records");
				loader.navigateToScreen("Case Search");
				records.switchToCaseSearch();
				records.caseSearch.enterAtCaseNo();
				records.switchToCaseUpdate();
				records.caseUpdate.clickAttachmentTab();
				records.caseUpdate.attachmentsTab.clickAddFiles();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();

			}
			
			@Test(groups={"2021DefectTestCases3"})  //Automated by Stalin Q2 S4 ran in 45
		     public void Verifytheattachmenttabisnotdisplayedinbluecolor_274785(ITestContext testContext)
		     {
		    	ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		  	    testContext.setAttribute("testID", "274785");
		 		Browser.NavigateToLoginScreen();
		 		login.loginScreen.Logon();
		 		loader.navigateToModule("Records");
		 		loader.navigateToScreen("Case Search");
		        records.switchToCaseSearch();
		        records.caseSearch.ClickAddNew();
		        records.switchToWalkInEntry();
		        records.walkInEntry.tabTheReportedDate();
		        records.walkInEntry.tabTheReportedTime();
		        records.walkInEntry.enterAtCADCFS();
		        records.walkInEntry.tabTheReceivedSource();
		        records.walkInEntry.enterAtLocation();
		        records.walkInEntry.enterAtNameID();
		        records.walkInEntry.selectActivityAsVictim();
		        records.walkInEntry.enterAtCADDispositon();
		        records.walkInEntry.save();
		        records.switchToCaseUpdate();
		        records.caseUpdate.switchToCaseUpdateAttachmentsTab();
		        records.caseUpdate.attachmentsTab.clickAddFiles();
		        records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
		        records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		        records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.verifyShowInCallDetailsCheckBoxIsNotSelected();		     
		        records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		        records.switchToCaseUpdate();
		        records.caseUpdate.clickCallInfoIcon();
		        records.switchToCallEntry();
		        records.callEntry.verifyAttachmentTabIsNotBlueColor();
		        records.switchToCallEntry();
		        
		     }
			
			  @Test(groups = { "VehicleRelatedTestCase"}) //Mithun Q4 sprint2 //Mahesha
			  public void TowVendor_257680(ITestContext testContext)
			  {
					  
					  ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			       testContext.setAttribute("testID", "257680");
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
			      tow.towEntry.clickTowTab();
			      tow.towEntry.towTab.selectAtEquipmentUsed();
			      tow.towEntry.towTab.selectAtWrecker();
			        tow.towEntry.towTab.tabTowRequestDate();
			      tow.towEntry.clickReleaseTab();
			      tow.towEntry.release.verifyHoldReasonDropdownDisabled();
			      tow.towEntry.release.clickHoldCheckbox();
			      tow.towEntry.release.verifyHoldReasonDropdownEnabled();
			      tow.towEntry.release.selectReason();
			      tow.towEntry.release.enterProofOf();
			      tow.switchToTowEntry();
			    tow.towEntry.save();
			      tow.switchToTowEntry();
			      tow.towEntry.switchToAttachmentTab();
			      tow.towEntry.attachmentsTab.clickAddFiles();
			      tow.towEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
			      tow.towEntry.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
			      tow.towEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			      tow.towEntry.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(1);
			      tow.switchToTowEntry();
			      tow.towEntry.save();
			      tow.switchToTowEntry();
			      tow.towEntry.clickCallInfoIcon();
			      
			   records.switchToCallEntry();
			      records.callEntry.switchToAttachmentTab();
			      records.callEntry.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(1);
			      records.callEntry.attachmentsTab.deleteAttachmentFileInGrid();
			      records.callEntry.attachmentsTab.verifyAttachmentCannotBeDeletedAcknowledgeMessage();
			      
			      records.switchToCallEntry();
			      records.callEntry.switchToAttachmentTab();
			      records.callEntry.attachmentsTab.selectAttachmentCheckBoxByIndex(0);
			      tow.towEntry.attachmentsTab.clickAddFiles();
			      records.callEntry.attachmentsTab.verifyAttachmentCannotBeUpdatedAcknowledgeMessage();
			      records.switchToCallEntry();
			  } 
			  
			  @Test(groups = {"2020DefectAttachments"})
				public void Police2020recordsModule_240640(ITestContext testContext)
				{
				          testContext.setAttribute("testID", "240640");
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Records");
				loader.navigateToScreen("Case Search");
				records.switchToCaseSearch();
				records.caseSearch.enterAtCaseNo();
				records.switchToCaseUpdate();
				records.caseUpdate.clickAttachmentTab();
				records.caseUpdate.attachmentsTab.clickAddFiles();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterFolderNameAsAUTO();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
				records.caseUpdate.attachmentsTab.verifyAddedAttachementExistInTheGrid();
				records.caseUpdate.attachmentsTab.selectAttachmentCheckBoxByIndex(0);
				records.caseUpdate.attachmentsTab.clickCreateAsPDFButton();
				home.switchToGetAttachmentScreen();
				home.getAttachment.Close();

				}

				@Test(groups = {"2020DefectAttachments"})

				public void Police2020recordsModule_242535(ITestContext testContext)
				{
				          testContext.setAttribute("testID", "242535");
				Browser.NavigateToLoginScreen();
				login.loginScreen.Logon();
				loader.navigateToModule("Records");
				loader.navigateToScreen("Case Search");
				records.switchToCaseSearch();
				records.caseSearch.enterAtCaseNo();
				records.switchToCaseUpdate();
				records.caseUpdate.clickAttachmentTab();
				records.caseUpdate.attachmentsTab.clickAddFiles();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.EnterAtFolderName();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
				records.caseUpdate.attachmentsTab.verifyAddedAttachementExistInTheGrid();
				records.caseUpdate.attachmentsTab.clickAddFiles();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterFolderNameAsAUTO();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterRemarks();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.selectTextFile();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
			    records.caseUpdate.attachmentsTab.selectAttachementFolderWiseCheckboxInTheGrid();
				records.caseUpdate.attachmentsTab.clickAddFiles();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.enterFolderNameAsAutomation();
				records.caseUpdate.attachmentsTab.attachmentsCategoryPopup.clickAdd();
				records.caseUpdate.attachmentsTab.verifyFolderNameAsAutomationInGrid();
				}
				
				@Test //Automated by Stalin Q3 s4
				public void TocheckwhetherPDFattachmentincallcaseupdatescreen_281027(ITestContext testContext)
				{
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "281027");
					Browser.NavigateToLoginScreen();
					login.loginScreen.logonUsingTestContextOtherDB();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsFalse();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Citation Entry");
					traffic.switchToCitationEntry();
					traffic.citationEntry.enterAtCallNo();
					traffic.citationEntry.selectCETypeAsTrafficViolation();
					traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
					traffic.citationEntry.enterAtNameID();
					traffic.citationEntry.switchToOffenseTab();
					traffic.citationEntry.offenseTab.enterAtCharge();
					traffic.switchToCitationArrest();
				//	traffic.citationArrest.enterDateAsCurrentDate();
					//traffic.citationArrest.selectTypeOfArrestAsOnViewArrest();
					traffic.citationArrest.selectArmedAsUnarmed();
					traffic.citationArrest.saveCloseScren();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToPlaintiffTab();
					traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
					traffic.citationEntry.plaintiffTab.selectCounty();
					traffic.switchToCitationEntry();
					traffic.citationEntry.save();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCitationEntry();
					traffic.citationEntry.clickCaseInfoIcon();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCitationEntry();
					traffic.citationEntry.closeCitationEntryScreen();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsTrue();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Citation Entry");
					traffic.switchToCitationEntry();
					traffic.citationEntry.enterAtCallNo1();
					traffic.citationEntry.selectCETypeAsTrafficViolation();
					traffic.citationEntry.selectDefendantTypeAsIndividaulAdult();
					traffic.citationEntry.enterAtNameID();
					traffic.citationEntry.switchToOffenseTab();
					traffic.citationEntry.offenseTab.enterAtCharge();
					traffic.switchToCitationArrest();
					//traffic.citationArrest.enterDateAsCurrentDate();
					//traffic.citationArrest.selectTypeOfArrestAsOnViewArrest();
					traffic.citationArrest.selectArmedAsUnarmed();
					traffic.citationArrest.saveCloseScren();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToPlaintiffTab();
					traffic.citationEntry.plaintiffTab.selectPlaintiffTypeAsCountyOf();
					traffic.citationEntry.plaintiffTab.selectCounty();
					traffic.switchToCitationEntry();
					traffic.citationEntry.save();
					traffic.switchToCitationEntry();
					traffic.citationEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCitationEntry();
					traffic.citationEntry.clickCaseInfoIcon();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCitationEntry();
					
				}
				
				@Test //Automated by Stalin Q3 s4
				public void TocheckwhetherPDFattachmentincallCaseupdatescreen_281026(ITestContext testContext)
				{
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "281026");
					Browser.NavigateToLoginScreen();
					login.loginScreen.logonUsingTestContextOtherDB();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsFalse();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Crash Entry");
					traffic.switchToCrashEntryScreen();
					traffic.crashEntry.enterAtCaseNo();
					traffic.crashEntry.verifyAtLocation();
					traffic.crashEntry.verifyAtCSZ();
					traffic.crashEntry.enterAtOfficer();
					traffic.crashEntry.enterAtNoOfUnits();
					traffic.crashEntry.saveScreen();
					traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickCaseInfo();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyRowCountIsZero();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickApprovalTab();
					traffic.crashEntry.verify10089ActionTabConfirmMessage();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsApprove();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.verifyStatusAsApprovedAndAppearAsGreenColor();
					traffic.crashEntry.close();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter1737AsTrue();
					settings.switchToSystemParamter();
					loader.navigateToModule("Traffic");
					loader.navigateToScreen("Crash Entry");
					traffic.switchToCrashEntryScreen();
					traffic.crashEntry.enterAtCaseNo1();
					traffic.crashEntry.verifyAtLocation();
					traffic.crashEntry.verifyAtCSZ();
					traffic.crashEntry.enterAtOfficer();
					traffic.crashEntry.enterAtNoOfUnits();
					traffic.crashEntry.saveScreen();
					traffic.crashEntry.verifyAdditionSuccessfulAcknowledgeMessage();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickCaseInfo();
					records.switchToCaseUpdate();
					records.caseUpdate.switchToCaseUpdateAttachmentsTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					objectIdentification.attachmentsTab.verifyAddedAttachementExistInTheGrid();
					records.switchToCallEntry();
					records.callEntry.closeScreen();
					records.switchToCaseUpdate();
					records.caseUpdate.closeTheScreen();
					traffic.switchToCrashEntry();
					traffic.crashEntry.clickApprovalTab();
					traffic.crashEntry.verify10089ActionTabConfirmMessage();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsSendForApproval();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.switchToApprovalTab();
					traffic.crashEntry.crashEntryApprovalTab.selectActionAsApprove();
					traffic.crashEntry.crashEntryApprovalTab.tabThroughDateTime();
					traffic.crashEntry.crashEntryApprovalTab.save();
					traffic.switchToCrashEntry();
					traffic.crashEntry.verifyStatusAsApprovedAndAppearAsGreenColor();
					traffic.switchToCrashEntry();
						
				}

				@Test // Vijay
				public void verifyThatApplicationIsAllowingToDeleteTheAttachment_261993(ITestContext testContext) {
					testContext.setAttribute("testID", "261993");
					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
					loader.navigateToModule("Records");
					loader.navigateToScreen("Walk-In Entry");
					records.switchToWalkInEntry();
					records.walkInEntry.enterAtCADCFS();
					records.walkInEntry.tabTheReportedDate();
					records.walkInEntry.tabTheReportedTime();
					records.walkInEntry.enterAtLocation();
					records.walkInEntry.tabTheReceivedSource();
					records.walkInEntry.enterAtCADDispositon();
					records.walkInEntry.enterAtUnit();
					records.walkInEntry.save();
					records.switchToCaseUpdate();
					String caseNo = records.caseUpdate.readCaseNo();
					records.caseUpdate.clickReportingTab();
					records.caseUpdate.reportingTab.selectRowByAtType();
					records.switchToReportManager();
					records.reportManager.tabReportedbyPF();
					records.reportManager.tabDateAndTime();
					records.reportManager.save();
					records.switchToReportStatus();
					records.reportStatus.ClickAttachmentsButton();
					home.switchToReportAttachmentScreen();
					home.attachment.ClickAddFilesButton();
					home.attachment.SelectAtCategory();
					home.attachment.ClickSelectButton();
					home.attachment.SelectPDFFile();
					home.attachment.verifyShowInCallDetailsCheckbox();
					home.attachment.clickShowInCallDetailsCheckbox();
					home.attachment.ClickAddButton();
					home.attachment.Close();
					records.switchToReportStatus();
					records.reportStatus.clickCaseDataButton();
					records.switchToACD();
					records.aCD.enterAtCharge();
					records.aCD.clickAddButton();
					records.switchToFTC();
					records.fTC.selectAttemptedCompletedAsCompleted();
					records.fTC.selectCrimeAgainstAsPerson();
					records.fTC.ClickSaveNClose();
					records.switchToACD();
					records.aCD.TaboutOccuredAT();
					records.aCD.SelectPoliceForceUsedAsNone();
					records.aCD.SelectDomesticViolanceAsNo();
					records.aCD.SaveNClose();
					records.switchToReportStatus();
					records.reportStatus.clickReportDetails();
					records.switchToReportManager();
					records.reportManager.switchToUpdateStatusTab();
					records.reportManager.updateStatusTab.selectActionAsSendForApproval();
					records.reportManager.updateStatusTab.SelectAtDivision();
					records.reportManager.updateStatusTab.SelectAtSection();
					records.switchToReportManager();
					records.reportManager.save();
					records.switchToReportManager();
					records.reportManager.VerifiyStatusAsSubmitted();
					records.reportManager.switchToUpdateStatusTab();
					records.reportManager.updateStatusTab.selectActionAsApprove();
					records.switchToReportManager();
					records.reportManager.Saveandclose();
					records.switchToReportStatus();
					records.reportStatus.ClickRefreshButton();
					records.reportStatus.close();
					loader.navigateToScreen("Case Search");
					records.switchToCaseSearch();
					records.caseSearch.enterCaseNoByActiveData(caseNo);
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					records.callEntry.attachmentsTab.verifyAddedAttachementExistInTheGrid(1);
					records.callEntry.attachmentsTab.deleteAttachmentFileInGrid();
					records.callEntry.attachmentsTab.verifyAttachmentCannotBeDeletedAcknowledgeMessage();
				}

				@Test(groups={"2020DefectAttachments"}) // Raja Sadaraj
				public void Police2020recordsModule_251299(ITestContext testContext) {
					
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "251299");

					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
//					loader.navigateToModule("Settings");
//					loader.navigateToScreen("System Parameter");
//					settings.switchToSystemParamter();
//					settings.sysParameter.setSystemparameter779AsFalse();
//					objectIdentification.windowHandle.switchToMainWindow();
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
					records.switchToCallEntry();
					records.callEntry.clickGenerateCheckbox();
					records.callEntry.save();
					records.switchToCallEntry();
					records.callEntry.clickCaseInfoIcon();
					records.switchToCaseUpdate();
					records.caseUpdate.clickReportingTab();
					records.caseUpdate.reportingTab.clickAddReportButton();
					records.switchToReportManager();
					records.reportManager.selectAtType();
					records.reportManager.tabReportedbyPF();
					records.reportManager.tabDateAndTime();
					records.reportManager.save();
					records.switchToReportStatus();
					records.reportStatus.clickCaseDataButton();
					records.switchToACD();
					records.aCD.EnterAtCFS();
					records.aCD.clickAddButton();
					records.switchToFTC();
					records.fTC.selectAttemptedCompletedAsCompleted();
					records.fTC.selectAtNIBRS();
					records.fTC.selectCrimeAgainstAsPerson();
					records.fTC.selectAtLocationType();
					records.fTC.selectAtSuspectedOfUsing();
					records.fTC.selectAtCriminalActivity();
					records.fTC.selectWeaponsUsedAsNone();
					records.fTC.saveNClose();
					records.switchToACD();
					records.aCD.TaboutOccuredAT();
					records.aCD.SelectPoliceForceUsedAsNone();
					records.aCD.SelectDomesticViolanceAsNo();
					records.aCD.Save();
					records.switchToACD();
					records.aCD.Close();
					records.switchToReportStatus();
					records.reportStatus.clickNamesButton();
					records.switchToCaseNames();
					records.caseNames.enterAtNameID();
					records.caseNames.SelectActivityAsArrested();
					records.caseNames.clickAddButton();
					records.caseNames.EnterAtNameID1();
					records.caseNames.selectActivityAsVictim();
					records.caseNames.clickAddButton();
					records.caseNames.Save();
					records.switchToCaseNames();
					records.caseNames.ClickVictimOffenderIcon(1);
					records.switchToNameVictim();
					records.nameVictim.selectVictimTypeAsIndividual();
					records.nameVictim.SelectCFSAsSimpleAssault();
					records.nameVictim.selectDomesticViolenceAsNo();
					records.nameVictim.clickAddButton();
					records.nameVictim.ClickOffenderIcon();
					records.switchToVictimOffender();
					records.victimOffender.selectAtOffender();
					records.victimOffender.SelectRelationshipAsRelationshipUnknown();
					records.victimOffender.clickAddButton();
					records.victimOffender.saveNClose();
					records.switchToNameVictim();
					records.nameVictim.SelectInjuryLevelAsNone();
					records.nameVictim.clickInjuryLevelAddButton();
					records.nameVictim.Save();
					records.switchToNameVictim();
					records.nameVictim.Close();
					records.switchToCaseNames();
					records.caseNames.Save();
					records.switchToCaseNames();
					records.caseNames.CloseTheScreen();
					records.switchToReportStatus();
					records.reportStatus.ClickAttachmentsButton();
					home.switchToReportAttachmentScreen();
					home.attachment.ClickAddFilesButton();
					home.attachment.SelectAtCategory();
					home.attachment.ClickSelectButton();
					home.attachment.SelectFile();
					home.attachment.ClickAddButton();
					home.attachment.ClickRefreshButton();
					home.attachment.Close();
					records.switchToReportStatus();
					records.reportStatus.ClickRefreshButton();
					records.reportStatus.close();
					objectIdentification.windowHandle.switchToMainWindow();
					loader.navigateToScreen("Case Search");
					records.switchToCaseSearch();
					records.caseSearch.clickDateResetButton();
					records.caseSearch.EnterAtLocation();
					records.caseSearch.clickSearch();
					records.caseSearch.ClickReportStatusIconInGrid();
					records.switchToReportStatus();
					records.reportStatus.ClickCaseSearchReportRefreshButton();

				}

				@Test(groups={"2020DefectAttachments"}) // Aug Sprint 3 Automated By Mahesha
				public void PoliceDefect2020_251237(ITestContext testContext){
					
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "251237");
					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
					loader.navigateToModule("Records");
					loader.navigateToScreen("Case Search");
					records.switchToCaseSearch();
					records.caseSearch.enterAtCaseNo();
					records.switchToCaseUpdate();
					records.caseUpdate.clickReportingTab();

					records.caseUpdate.reportingTab.clickAddReportButton();
					records.switchToReportManager();
					records.reportManager.selectAtType();
					records.reportManager.tabDateAndTime();
					records.reportManager.tabReportedbyPF();
					records.reportManager.VerifyPFNotRelatedToConfirmPopupMessage();
					records.reportManager.Saveandclose();

					records.switchToReportStatus();
					records.reportStatus.ClickAttachmentsButton();
					home.switchToAttachmentScreen();
					home.attachment.ClickAddFilesButton();
					home.attachment.SelectCategory();
					home.attachment.SelectImageFile();
					home.switchToAttachmentScreen();
					home.attachment.ClickAddButton();
					home.switchToAttachmentScreen();
					home.attachment.ClickRefreshButton();
					home.attachment.Close();
					records.switchToReportStatus();
					records.reportStatus.ClickRefreshButton();

				}
				
				@Test // Vijay
				public void verifyThatApplicationIsAllowingToShareTheReportEntryAttachmentToCallEntryScreen_261992(
						ITestContext testContext) {
					testContext.setAttribute("testID", "261992");
					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
					loader.navigateToModule("Records");
					loader.navigateToScreen("Walk-In Entry");
					records.switchToWalkInEntry();
					records.walkInEntry.enterAtCADCFS();
					records.walkInEntry.tabTheReportedDate();
					records.walkInEntry.tabTheReportedTime();
					records.walkInEntry.enterAtLocation();
					records.walkInEntry.tabTheReceivedSource();
					records.walkInEntry.enterAtCADDispositon();
					records.walkInEntry.enterAtUnit();
					records.walkInEntry.save();
					records.switchToCaseUpdate();
					String caseNo = records.caseUpdate.readCaseNo();
					records.caseUpdate.clickReportingTab();
					records.caseUpdate.reportingTab.selectRowByAtType();
					records.switchToReportManager();
					records.reportManager.tabReportedbyPF();
					records.reportManager.tabDateAndTime();
					records.reportManager.save();
					records.switchToReportStatus();
					records.reportStatus.ClickAttachmentsButton();
					home.switchToReportAttachmentScreen();
					home.attachment.ClickAddFilesButton();
					home.attachment.SelectAtCategory();
					home.attachment.ClickSelectButton();
					home.attachment.SelectPDFFile();
					home.attachment.verifyShowInCallDetailsCheckbox();
					home.attachment.clickShowInCallDetailsCheckbox();
					home.attachment.ClickAddButton();
					home.attachment.Close();
					records.switchToReportStatus();
					records.reportStatus.clickCaseDataButton();
					records.switchToACD();
					records.aCD.enterAtCharge();
					records.aCD.clickAddButton();
					records.switchToFTC();
					records.fTC.selectAttemptedCompletedAsCompleted();
					records.fTC.selectCrimeAgainstAsPerson();
					records.fTC.ClickSaveNClose();
					records.switchToACD();
					records.aCD.TaboutOccuredAT();
					records.aCD.SelectPoliceForceUsedAsNone();
					records.aCD.SelectDomesticViolanceAsNo();
					records.aCD.SaveNClose();
					records.switchToReportStatus();
					records.reportStatus.clickReportDetails();
					records.switchToReportManager();
					records.reportManager.switchToUpdateStatusTab();
					records.reportManager.updateStatusTab.selectActionAsSendForApproval();
					records.reportManager.updateStatusTab.SelectAtDivision();
					records.reportManager.updateStatusTab.SelectAtSection();
					records.switchToReportManager();
					records.reportManager.save();
					records.switchToReportManager();
					records.reportManager.VerifiyStatusAsSubmitted();
					records.reportManager.switchToUpdateStatusTab();
					records.reportManager.updateStatusTab.selectActionAsApprove();
					records.switchToReportManager();
					records.reportManager.Saveandclose();
					records.switchToReportStatus();
					records.reportStatus.ClickRefreshButton();
					records.reportStatus.close();
					loader.navigateToScreen("Case Search");
					records.switchToCaseSearch();
					records.caseSearch.enterCaseNoByActiveData(caseNo);
					records.switchToCaseUpdate();
					records.caseUpdate.clickCallInfoIcon();
					records.switchToCallEntry();
					records.callEntry.switchToAttachmentTab();
					records.callEntry.attachmentsTab.verifyAddedAttachementExistInTheGrid(1);
				}


				@Test // Automated by Stalin Q2 S4 ran in 45
				public void AttachmenttabdisplayedbluecolorattachmentpushfromCMcasefolder_274786(ITestContext testContext) {
					ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
					testContext.setAttribute("testID", "274786");
					Browser.NavigateToLoginScreen();
					login.loginScreen.Logon();
					loader.navigateToModule("Settings");
					loader.navigateToScreen("System Parameter");
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter912AsYes();
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter909AsAdministration();
					settings.switchToSystemParamter();
					settings.sysParameter.setSystemparameter911AsYes();
					settings.switchToSystemParamter();
					loader.navigateToModule("Records");
					loader.navigateToScreen("Case Search");
					records.switchToCaseSearch();
					records.caseSearch.ClickAddNew();
					records.switchToWalkInEntry();
					records.walkInEntry.tabTheReportedDate();
					records.walkInEntry.tabTheReportedTime();
					records.walkInEntry.enterAtCADCFS();
					records.walkInEntry.tabTheReceivedSource();
					records.walkInEntry.enterAtLocation();
					records.walkInEntry.enterAtNameID();
					records.walkInEntry.selectActivityAsVictim();
					records.walkInEntry.enterAtCADDispositon();
					records.walkInEntry.save();
					records.switchToCaseUpdate();
					String readCaseNo = records.caseUpdate.readCaseNo();
					records.caseUpdate.clickCaseManagementIcon();
					cm.switchToCaseFolder();
					cm.caseFolder.verifyAtActiveCaseNo(readCaseNo);
					cm.caseFolder.clickAssignmentTab();
					cm.caseFolder.caseFolderAssignmentTab.verifyAtDivision();
					cm.caseFolder.caseFolderAssignmentTab.verifyAtSection();
					cm.caseFolder.caseFolderAssignmentTab.tabOutSupervisor();
					cm.caseFolder.caseFolderAssignmentTab.clickSupervisorSearchButton();
					popUp.switchToCodedSearch();
					popUp.kPICodedLookup.verifyPFInCodedSearch(0);
					popUp.kPICodedLookup.selectAtPFCode();
					cm.switchToCaseFolder();
					cm.caseFolder.clickAssignmentTab();
					cm.caseFolder.caseFolderAssignmentTab.clickPrimeInvestigatorSearchButton();
					popUp.switchToCodedSearch();
					popUp.kPICodedLookup.verifyAtDescription();
					popUp.kPICodedLookup.clickAtDescription();
					cm.switchToCaseFolder();
					cm.caseFolder.clickAssignmentTab();
					cm.caseFolder.caseFolderAssignmentTab.tabOutDateAssignedTime();
					cm.caseFolder.caseFolderAssignmentTab.tabOutNextReviewDate();
					cm.switchToCaseFolder();
					cm.caseFolder.save();
					cm.switchToCaseFolder();
					cm.caseFolder.clickAssignmentTab();
					cm.caseFolder.caseFolderAssignmentTab.verifyNextReviewDateAs5DayFutureFromCurrentDate();
					cm.switchToCaseFolder();
					cm.caseFolder.switchToAttachmentsTab();
					objectIdentification.attachmentsTab.clickAddFiles();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickShowInCallDetailsCheckBox();
					objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();
					cm.switchToCaseFolder();
					cm.caseFolder.switchToReviewTab();
					cm.caseFolder.reviewTab.clickAddNewReviewButton();
					cm.switchToCaseReview();
					cm.caseReview.selectCaseStatusAsClosed();
					cm.caseReview.tabOutDate();
					cm.caseReview.save();
					cm.switchToCaseFolder();
					cm.caseFolder.clickCaseInfoButton();
					records.switchToCaseUpdate();
					records.caseUpdate.clickResetButton();
					records.caseUpdate.verifyAttachmentsTabInBlueColor();
					records.switchToCaseUpdate();

				}

	  @AfterMethod(groups = { ""})
	    public void afteTestMethod(ITestResult testResult) 
	    {
		   
		   objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
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

	   @AfterSuite(groups = { ""})
	   public void afterRunSuite()
	   {
	   	ExtentReport.GenerateHTML();
	   	
	   	}

}
