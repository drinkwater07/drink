package scripts;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import application.Activity;
import application.Geo;
import application.Home;
import application.Loader;
import application.Login;
import application.Names;
import application.Popup;
import application.Settings;
import application.Training;
import application.Vehicle;
import utilities.Browser;
import utilities.ObjectIdentification;
import utilities.Playback;


public class TrainingScripts {

	public Geo geo;
	public Vehicle vehicle;
	public Login login;
	public Loader loader;
	public ObjectIdentification objectIdentification;
	public Popup popup;
	public Training training;
	public Home home;
	public Activity activity;
	public Names names;
	public Settings settings;
	

	@BeforeTest
	public void BeforeTestMethod(ITestContext testContext) {
		testContext.setAttribute("moduleName", "Training");
		Playback.testContext = testContext;

		Playback.start();

		login = new Login();
		loader = new Loader();
		names = new Names();
		geo = new Geo();
		vehicle = new Vehicle();
		objectIdentification = new ObjectIdentification();
		home = new Home();
		settings = new Settings();
		popup = new Popup();
		activity = new Activity();
		training = new Training();
	}

	@Test
	public void CreateCertificationManualEntry_203667() {

		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Training");
		loader.navigateToScreen("Certification Search");
		training.switchToCertificationSearch();
		training.certificationSearch.clickAddNew();
		training.switchToCertificationManualEntry();
		training.certificationManualEntry.VerifyEarnedCEUFieldMandatory();
		training.certificationManualEntry.VerifyEarnedHoursFieldMandatory();
		training.certificationManualEntry.enterAtPFCode();
		training.certificationManualEntry.selectAtCertification();
		training.certificationManualEntry.verifyRecertificaitonByAs30DayFutureFromCurrentDate();
		training.certificationManualEntry.verifyRecertificationByFieldDisabled();
		training.certificationManualEntry.EnterAtEarnedCEU();
		training.certificationManualEntry.EnterAtEarnedHours();
		training.certificationManualEntry.SelectOtherJobRole();
		training.certificationManualEntry.SelectPrimaryJobRole();
		training.certificationManualEntry.TabOutEnteredDate();
		training.certificationManualEntry.SelectAgencyEMSPracticeLevel();
		training.certificationManualEntry.TabOutAgencyEMSPracticeLevelDate();
		training.certificationManualEntry.ClickAddButton();
		training.certificationManualEntry.save();
		training.switchToCertificationSearch();
		training.certificationSearch.verifyAtPF(0);
		training.certificationSearch.verifyAtCertification(0);
		training.certificationSearch.verifyAtCEUsEarned(0);
		training.certificationSearch.verifyAtHoursEarned(0);

	}

	@Test // Vijay
	public void verifyAbleToCreateActivityLogFromTrainingModule_261421(ITestContext testcontext) {
		testcontext.setAttribute("testID", "261421");
		Browser.NavigateToLoginScreen();
		login.loginScreen.Logon();
		loader.navigateToModule("Training");
		loader.navigateToScreen("Class Search");
		training.switchToClassSearch();
		training.classSearch.clickAddNewLink();
		training.switchToTrainingClassEntry();
		training.trainingClassEntry.verifyAtJurisComboBox();
		training.trainingClassEntry.selectAtTrainingCategoryComboBox();
		training.trainingClassEntry.selectAtTrainingTypeComboBox();
		training.trainingClassEntry.enterAtNoOfStudents();
		training.trainingClassEntry.enterAtCourseNo();
		training.trainingClassEntry.clickMultiScheduleButton();
		training.switchToTrainingScheduleEntry();
		training.trainingScheduleEntry.tabOutTrainingStartAndEndDate();
		training.trainingScheduleEntry.enterClassHoursFromAndToFields();
		training.trainingScheduleEntry.clickAddButton();
		training.trainingScheduleEntry.saveNClose();
		training.switchToTrainingClassEntry();
		training.trainingClassEntry.clickStudentTab();
		training.trainingClassEntry.classEntryStudentsTab.clickAddMultipleEmployees();
		training.switchToMultiPFWindow();
		training.multiPFWindow.clickselectAllCheckBox();
		training.multiPFWindow.clickAddSelectedPFToList();
		training.switchToTrainingClassEntry();
		training.trainingClassEntry.clickInstructorsTab();
		training.trainingClassEntry.classEntryInstructorsTab.selectAtInstructorPF();
		training.trainingClassEntry.classEntryInstructorsTab.selectAtCertificationComboBox();
		training.trainingClassEntry.classEntryInstructorsTab.selectAtpositionComboBox();
		training.trainingClassEntry.classEntryInstructorsTab.clickAddButton();
		training.switchToTrainingClassEntry();
		training.trainingClassEntry.verifyActivityLogButtonIsDisabled();
		training.trainingClassEntry.clickStudentTab();
		training.trainingClassEntry.classEntryStudentsTab.selectAtPFCodeCheckBoxInGrid();
		training.trainingClassEntry.classEntryStudentsTab.selectResultAsPass();
		training.trainingClassEntry.classEntryStudentsTab.enterAtScore();
		training.trainingClassEntry.classEntryStudentsTab.enterNotes();
		training.trainingClassEntry.classEntryStudentsTab.clickApplyButton();
		training.switchToTrainingClassEntry();
		training.trainingClassEntry.clickStudentTab();
		training.trainingClassEntry.classEntryStudentsTab.selectAtPFCode1CheckBoxInGrid();
		training.trainingClassEntry.classEntryStudentsTab.selectResultAsPass();
		training.trainingClassEntry.classEntryStudentsTab.enterAtScore();
		training.trainingClassEntry.classEntryStudentsTab.enterNotes();
		training.trainingClassEntry.classEntryStudentsTab.clickApplyButton();
		training.switchToTrainingClassEntry();
		training.trainingClassEntry.save();
		training.switchToTrainingClassEntry();
		training.trainingClassEntry.verifyActivityLogButtonIsEnabled();
		training.trainingClassEntry.clickActivityLogButton();
		home.switchToActivityEntry();
		activity.activityEntry.verifyAllTabsDisabled();
		activity.activityEntry.NavigateToPFTab();
		activity.activityEntry.activityEntryPFTab.enterAtPFNo();
		activity.activityEntry.activityEntryPFTab.clickAddButton();
		activity.activityEntry.activityEntryPFTab.verifyAtPFInGrid();
	}

	@AfterMethod
	public void afterTestMethod() {
 Playback.stop();
	}

}
