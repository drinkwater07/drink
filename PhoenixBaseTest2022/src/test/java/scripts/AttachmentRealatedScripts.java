package scripts;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import application.Accounting;
import application.Activity;
import application.DetailWork;
import application.Geo;
import application.Home;
import application.Inventory;
import application.Loader;
import application.Login;
import application.Names;
import application.Personnel;
import application.Popup;
import application.QA;
import application.Scheduling;
import application.Settings;
import application.Training;
import application.Vehicle;
import reports.ExtentReport;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;

public class AttachmentRealatedScripts {

	public DetailWork detailWork;
	public Home home;
	public Login login;
	public Loader loader;
	public Settings settings;
	public String nodeUrl;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Personnel personnel;
	public Vehicle vehicle;
	public Inventory inventory;
	public Training training;
	public Activity activity;
	public Browser browser;
	public Scheduling scheduling;
	public Geo geo;
	public Names names;
	public QA qA;
	// @BeforeTest

	// ITestContext testContext;

	@BeforeSuite(groups = { "" })
	public void beforeRunSuite(ITestContext testContext) {
		String suitePath = testContext.getCurrentXmlTest().getSuite().getFileName();
		ExtentReport.startReport(suitePath);
		ExtentReport.TotalTestsInSuite(testContext.getSuite());
	}

	@BeforeMethod(groups = {})
	public void BeforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Home");
		Playback.testContext = testContext;

		Playback.start();
		login = new Login();
		loader = new Loader();
		home = new Home();
		settings = new Settings();
		objectIdentification = new ObjectIdentification();
		personnel = new Personnel();
		vehicle = new Vehicle();
		inventory = new Inventory();
		training = new Training();
		activity = new Activity();
		browser = new Browser();
		scheduling = new Scheduling();
		geo = new Geo();
		names = new Names();
		qA = new QA();
	}

	// Run In Local Using Attchments
	@Test(groups = "2021DefectTestCases") // Mahesha Sprint : Q3 S4 08/31/2021
	public void VerifythatAddUpdateDeleteTrackInAccessLog_281422(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "281422");
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
		detailWork.detailEntry.clickAttachmentsTab();
		objectIdentification.attachmentsTab.clickAddFiles();
		objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectAtCategory();
		objectIdentification.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
		objectIdentification.attachmentsTab.attachmentsCategoryPopup.clickAdd();

		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickAttachmentsTab();
		objectIdentification.attachmentsTab.selectAttachmentCheckBoxByIndex(0);
		objectIdentification.attachmentsTab.clickAddFiles();
		objectIdentification.attachmentsTab.attachmentsCategoryPopup.ClickUpdate();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("Access Log");
		settings.switchToAcessLog();
		settings.accessLog.tabTheFromDateAndTime();
		settings.accessLog.tabTheToDateAndTime();
		settings.accessLog.enterAtDescription();
		settings.accessLog.clickSearch();
		settings.accessLog.verifyAccessAsChange(0);
		settings.accessLog.verifyAccessAsAdd(1);
		settings.accessLog.verifyAtDescription(0);
		settings.accessLog.verifyAtDescription(1);
		detailWork.switchToDetailEntryScreen();
		detailWork.detailEntry.clickAttachmentsTab();
		objectIdentification.attachmentsTab.deleteAttachmentFileInGridByIndex(0);
		objectIdentification.attachmentsTab.verifyDeleteConfirmPopup();
		loader.navigateToScreen("Access Log");
		objectIdentification.manualIdentify.reloadScreen("Access Log");
		settings.switchToAcessLog();
		settings.accessLog.tabTheFromDateAndTime();
		settings.accessLog.tabTheToDateAndTime();
		settings.accessLog.enterAtDescription();
		settings.accessLog.clickSearch();
		settings.accessLog.verifyAccessAsDelete(0);
		settings.accessLog.verifyAtDescription(0);

	}

	@Test(groups = { "2020DefectAttachments" }) // Mithun Q4 Sprint 2 //Mahesha
	public void AddressSearchAttachmentTab_257120(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "257120");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Geo");
		loader.navigateToScreen("Address Search");
		geo.switchToAddressSearchScreen();
		geo.addressSearch.enterAtAddress();
		geo.addressSearch.verifyAttachmentsTabIsDisplayed();
		geo.addressSearch.switchToAttachmentTab();
		geo.addressSearch.attachmentsTab.clickAddFiles();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		geo.addressSearch.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(1);

		geo.addressSearch.attachmentsTab.clickAddFiles();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectPDFFile();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		geo.addressSearch.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(2);

		geo.addressSearch.attachmentsTab.clickAddFiles();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsPhotoEvidence();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		geo.addressSearch.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(3);

		geo.addressSearch.attachmentsTab.clickAddFiles();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		geo.addressSearch.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		geo.addressSearch.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(4);
		geo.addressSearch.attachmentsTab.clickRefresh();

		geo.addressSearch.attachmentsTab.deleteAttachmentFileInGridByIndex(3);
		geo.addressSearch.attachmentsTab.verifyDeleteConfirmPopup();

		geo.switchToAddressSearchScreen();
		geo.addressSearch.switchToAttachmentTab();
		geo.addressSearch.attachmentsTab.deleteAttachmentFileInGridByIndex(2);
		geo.addressSearch.attachmentsTab.verifyDeleteConfirmPopup();

		geo.switchToAddressSearchScreen();
		geo.addressSearch.switchToAttachmentTab();
		geo.addressSearch.attachmentsTab.deleteAttachmentFileInGridByIndex(1);
		geo.addressSearch.attachmentsTab.verifyDeleteConfirmPopup();

		geo.switchToAddressSearchScreen();
		geo.addressSearch.switchToAttachmentTab();
		geo.addressSearch.attachmentsTab.clickRefresh();
		geo.addressSearch.attachmentsTab.VerifyAddedAttachementInTheFolderGrid(1);
	}

	@Test // Vijay
	public void verifyWhetherAttachmentTabIsShowingByDefaultInActivityEntryLogScreenWhenWeOpenFromWhiteBoardIfAttachmentIsAvailable_258922(
			ITestContext testcontext) {
		testcontext.setAttribute("testID", "258922");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Home");
		loader.navigateToScreen("My Home");
		home.switchToMyHomeScreen();
		home.whiteBoard.clickAddButton();
		home.switchToActivityEntry();
		activity.activityEntry.selectAtCategoryGroup();
		activity.activityEntry.selectAtCategory();
		activity.activityEntry.selectAtActivityType();
		activity.activityEntry.selectAtActivityStatus();
		activity.activityEntry.tabActivityDateTime();
		activity.activityEntry.enterAtSubject();
		activity.activityEntry.saveNClose();
		home.switchToMyHomeScreen();
		home.myHome.refreshWhiteBoardScreen();
		home.switchToMyHomeScreen();
		home.whiteBoard.selectRowByAtSubject();
		home.switchToActivityEntry();
		activity.activityEntry.switchToActivityEntryAttachmentTab();
		activity.activityEntry.attachmentsTab.clickAddFiles();
		activity.activityEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		activity.activityEntry.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		home.switchToActivityEntry();
		activity.activityEntry.switchToActivityEntryAttachmentTab();
		activity.activityEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		home.switchToActivityEntry();
		activity.activityEntry.saveNClose();
		home.switchToMyHomeScreen();
		home.whiteBoard.selectRowByAtSubject();
		home.switchToActivityEntry();
		activity.activityEntry.verifyAttachmentTabIsDefaultTab();
		activity.activityEntry.close();
		home.switchToMyHomeScreen();
		home.whiteBoard.clickMaximizeButton();
		home.switchToWhiteBoardWindow();
		home.whiteBoard.selectRowByAtSubject();
		home.switchToActivityEntry();
		activity.activityEntry.verifyAttachmentTabIsDefaultTab();

	}

	@Test
	public void NameEntryAttachmentsTab_105073(ITestContext testContext) {
		testContext.setAttribute("testID", 105073);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.SelectNameByID();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.clickAddFiles();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verifyAddSingleFileRadioButtonIsSelected();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectTextFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
//					names.nameEntry.attachmentsTab.VerifyAddedAttachementExistInTheGrid();

	}

	@Test
	public void NameEntryAttachmentsTab_105081(ITestContext testContext) {
		testContext.setAttribute("testID", 105081);

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.SelectNameByID();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.clickAddFiles();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verifyAddBulkFileRadioButtonIsSelected();
		// Playback.driver.switchTo().alert().accept();
		popup.switchToMultiFilesAttachWindow();
		popup.multiFilesAttachWindow.SelectTextFile();
		popup.switchToMultiFilesAttachWindow();
		popup.multiFilesAttachWindow.SelectImgFile();
		popup.switchToMultiFilesAttachWindow();
		popup.multiFilesAttachWindow.ClickUpload();
		Playback.pageLoadThreadWait();
		Playback.pageLoadThreadWait();
		popup.multiFilesAttachWindow.Close();
		Playback.driver.switchTo().alert().accept();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
	}

	@Test
	public void NameEntryAttachmentsTab_105087(ITestContext testContext) {
		testContext.setAttribute("testID", 105087);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.SelectNameByID();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
//					names.nameEntry.attachmentsTab.SelectRowCheckBox(4, 2);
		names.nameEntry.attachmentsTab.ClickDownloadSelectedFilesButton();
		// WindowsControl.FileSavePopup.ClickSaveOptionDropdown();
		// WindowsControl.FileSavePopup.ClickSaveAsOption();
		// WindowsControl.FileBrowserWindow.EnterSaveFileName(Playback.GetTestDeployDirectoryPath(NamesTestContext)
		// + WindowsControl.FileBrowserWindow.GetFileName());
		// WindowsControl.FileBrowserWindow.ClickSave();
	}

	@Test
	public void NameEntryAttachmentsTab_105088(ITestContext testContext) {
		testContext.setAttribute("testID", 105088);
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.SelectAtNameType();
		names.nameSearch.EnterAtLastName();
		names.nameSearch.EnterAtFirstName();
		names.nameSearch.clickSearchButton();
		names.nameSearch.SelectNameByID();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.deleteLastRowAndVerifyRowIsRemoved();

	}

	@Test(groups = { "2020DefectAttachments" }) // Vijay
	public void verifyNameEntryAttachmentTabcolorchanges_255336(ITestContext testcontext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testcontext.setAttribute("testID", "255336");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.SelectNameByID();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.clickAddFiles();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.verifyNameEntryAttachmentTabBlueColor();
	}

	@Test(groups = { "2020DefectAttachments" }) // Q4 Sprint 5 Automated by Mahesha
	public void VerifyAttachments_261097(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261097");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter39AsWrongLocation();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter231AsNetwork();

		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();

		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.clickAddFiles();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectImageFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		// names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verify1204UnableToLocateNetworkPathAcknowledge();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.clickAddFiles();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.clickBulkAttachmentRadioButton();

		home.switchToMultiFilesAttachment();
		home.multiFilesAttachments.clickBrowseButton();
		home.multiFilesAttachments.selectBulkAttachment();
		home.switchToMultiFilesAttachment();

		home.multiFilesAttachments.clickUploadButton();// Added by Vijay
		home.multiFilesAttachments.clickCloseButton();// Added by Vijay

		// home.multiFilesAttachments.verifyUnableToAccessNetworkPathMessage();

		loader.navigateToModule("Settings");
		loader.navigateToScreen("System Parameter");
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter39AsCorrectLocation();
		settings.switchToSystemParamter();
		settings.sysParameter.setSystemparameter231AsDatabase();
		settings.switchToSystemParamter();
	}

	@Test(groups = { "2020DefectAttachments" }) // Q4 sprint 5 Automated by Mahesha
	public void ALCPermissionForPDFReportArrestEntryScreen_261417(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "261417");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Entry");
		names.switchToArrestEntry();
		names.arrestEntry.enterAtNameID();
		names.arrestEntry.switchToArrestTab();
		names.arrestEntry.arrestTab.enterAtCaseNo();
		names.arrestEntry.arrestTab.tabTheArrestDateAndTime();
		names.arrestEntry.arrestTab.selectAtHow();
		names.arrestEntry.arrestTab.enterAtOfficer1();
		names.arrestEntry.arrestTab.selectArmed();
		names.arrestEntry.arrestTab.tabTheBookingDateAndTime();
		names.switchToArrestEntry();
		names.arrestEntry.switchToChargeTab();
		names.arrestEntry.chargeTab.tabTheCaseNoEntries();
		names.arrestEntry.chargeTab.enterAtCharge();
		names.arrestEntry.chargeTab.selectAtStatus();
		names.arrestEntry.chargeTab.clickTheAddButton();
		names.arrestEntry.clickReleaseTab();
		names.arrestEntry.releaseTab.selectSchoolAsCollegeDegree();
		names.arrestEntry.releaseTab.selectGradeAsA7thGrade();
		names.switchToArrestEntry();
		names.arrestEntry.SaveNCloseScreen();

		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.EnterAtCaseNo();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectArrestByAtCaseNo();

		names.switchToArrestEntry();
		names.arrestEntry.switchToAttachmentTab();
		names.arrestEntry.attachmentsTab.clickAddFiles();
		names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.verifyAddSingleFileRadioButtonIsSelected();
		names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.selectAtFile();
		names.arrestEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		names.arrestEntry.attachmentsTab.verifyAddedAttachementExistInTheGrid();

		names.switchToArrestEntry();
		String arresrNo = names.arrestEntry.readArrestNo();
		names.arrestEntry.ClickALCIcon();

		home.switchToALCScreen();
		home.aLCScreen.verifyAtSetPermissionForArrestNo(arresrNo);
		home.aLCScreen.ClickPFTab();
		home.aLCScreen.aLCPFTab.SelectAtAction();
		home.aLCScreen.aLCPFTab.EnterAtPFCode();
		home.aLCScreen.aLCPFTab.ClickAddButton();
		home.aLCScreen.aLCPFTab.VerifyAtActionInGrid(0);
		home.aLCScreen.SaveScreen();
		home.switchToALCScreen();

		home.aLCScreen.ClickGroupTab();
		home.aLCScreen.aLCGroupTab.SelectAtAction();
		home.aLCScreen.aLCGroupTab.selectAtDivision();
		home.aLCScreen.aLCGroupTab.selectAtSection();
		home.aLCScreen.aLCGroupTab.selectAtSquad();
		home.aLCScreen.aLCGroupTab.selectTitle();
		home.aLCScreen.aLCGroupTab.ClickAdd();
		home.aLCScreen.SaveAndClose();

		loader.navigateToModule("Names");
		loader.logout();

		login.loginScreen.logonUsingTestContext();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Arrest Search");
		names.switchToArrestSearch();
		names.arrestSearch.EnterAtCaseNo();
		names.arrestSearch.ClickClearDateButton();
		names.arrestSearch.ClickSearchButton();
		names.arrestSearch.SelectArrestByAtCaseNo();
		names.switchToArrestEntry();
		names.arrestEntry.switchToAttachmentTab();
		names.arrestEntry.attachmentsTab.selectFileByIndex(0);
		home.switchToGetAttachmentScreen();
	}

	@Test(groups = { "2020DefectAttachments" }) // Mithun's Missed Testcase // Automated By Stalin
	public void NamesEntryscreen_256406(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "256406");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Entry");
		names.switchToNameEntry();
		names.nameEntry.EnterAtLastName();
		names.nameEntry.EnterAtFirstName();
		names.nameEntry.EnterAtAddress();
		names.nameEntry.switchToMainTab();
		names.nameEntry.nameEntryMainTab.EnterAtBirthDate();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.ClickNameImage();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickAddNewButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.EnterDate();
		home.updateImageScreen.EnterTime();
		home.updateImageScreen.clickChooseFileButtonAndSelectJPGFile();
		home.updateImageScreen.ClickSaveAndCloseButton();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickUpdateButton();
		home.allImagesScreen.ClickAddNewButton();
		home.switchToUpdateImageScreen();
		home.updateImageScreen.EnterDate();
		home.updateImageScreen.EnterTime();
		home.updateImageScreen.clickChooseFileButtonAndSelectPNGFile();
		home.updateImageScreen.ClickSaveAndCloseButton();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickUpdateButton();
		home.allImagesScreen.clickZoomIcon();
		home.switchToFullImageViewScreen();
		home.imageFullViewScreen.clickDeleteIcon();
		home.imageFullViewScreen.verifyDeleteConfirmPopup();
		home.switchToFullImageViewScreen();
		home.imageFullViewScreen.close();
		home.switchToAllImageScreen();
		home.allImagesScreen.clickResetButton();
		home.allImagesScreen.ClickCheckedCheckbox();
		home.allImagesScreen.ClickUpdateButton();
		home.allImagesScreen.Close();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
		names.nameEntry.ClickNameImage();
		home.switchToAllImageScreen();
		home.allImagesScreen.ClickCheckedCheckbox();
		home.allImagesScreen.ClickUpdateButton();
		home.allImagesScreen.Close();
		names.switchToNameEntry();
		names.nameEntry.SaveWithConfirmMessage();
		names.switchToNameEntry();
	}

	@Test(groups = { "2020DefectAttachments" }) // Q4 Sprint 5 Automated by Mahesha
	public void VerifyModifiedAttachmentLinkFromAttachmentsTab_260820(ITestContext testContext) {

		ExtentReport.CreateTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		testContext.setAttribute("testID", "260820");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Names");
		loader.navigateToScreen("Name Search");
		names.switchToNameSearch();
		names.nameSearch.enterAtNameID();
		names.nameSearch.clickSearchButton();
		names.nameSearch.ClickAtNameID();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.clickAddFiles();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verifyCategoryAsMandatory();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.selectCategoryAsDocumentFile();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.ClickLinkRadioButton();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verifyLinkEnabledAsMandatory();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.EnterAtLink();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.clickAdd();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.SelectRowCheckboxUsingFileName();
		names.nameEntry.attachmentsTab.clickAddFiles();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.verifyLinkEnabledAsMandatory();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.EnterAtLink1();
		names.nameEntry.attachmentsTab.attachmentsCategoryPopup.ClickUpdate();
		names.switchToNameEntry();
		names.nameEntry.Save();
		names.switchToNameEntry();
		names.nameEntry.switchToAttachmentsTab();
		names.nameEntry.attachmentsTab.VerifyAtFileName1();

	}

	@AfterMethod(groups = { "DetailWorkFunctional", "2021DefectTestCases" })
	public void afterMethodrecords(ITestResult testResult) {

		objectIdentification.windowHandle.focusOnActiveElementAndSwitch();
		/*
		 * try Playback.takeScreenShotOnFailure(testResult); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
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

	@AfterSuite(groups = { "DetailWorkFunctional", "2021DefectTestCases" })
	public void afterRunSuite() {
		ExtentReport.GenerateHTML();
		System.gc();
	}
}
