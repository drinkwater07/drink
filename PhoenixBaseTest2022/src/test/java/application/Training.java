package application;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import application.Popup.Acknowledge;
import application.Popup.Confirm;
import dataAccess.BaseData;
import uIMaps.UIMapFRPersonnel;
import uIMaps.UIMapSettings;
import uIMaps.UIMapTraining;
import utilities.ObjectIdentification;
import utilities.Randomized;
import utilities.verify;
import utilities.Playback;

public class Training {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapTraining uIMapTraining = new UIMapTraining();
	public UIMapFRPersonnel uIMapFRPersonnel = new UIMapFRPersonnel();
	public Popup popup = new Popup();
	Randomized randomized = new Randomized();

	public FacilityCode facilityCode;
	public GuestSearch guestSearch;
	public InstructorSearch instructorSearch;
	public CourseSearch courseSearch;
	public ClassSearch classSearch;
	public ClassEntry classEntry;
	public TrainingSearch trainingSearch;
	public TrainingEntry trainingEntry;
	public TrainingClassEntry trainingClassEntry;
	public FacilityEntry facilityEntry;
	public GuestEntry guestEntry;
	public InstructorEntry instructorEntry;
	public CourseEntry courseEntry;
	public CertificationSearch certificationSearch;
	public CertificationEntry certificationEntry;
	public CertificationManualEntry certificationManualEntry;
	public TrainingScheduleEntry trainingScheduleEntry;
	public MultiPFWindow multiPFWindow;

	public Training() {
		if (this.facilityCode == null)
			this.facilityCode = new FacilityCode();

		if (this.guestSearch == null)
			this.guestSearch = new GuestSearch();

		if (this.instructorSearch == null)
			this.instructorSearch = new InstructorSearch();

		if (this.courseSearch == null)
			this.courseSearch = new CourseSearch();

		if (this.classSearch == null)
			this.classSearch = new ClassSearch();

		if (this.trainingSearch == null)
			this.trainingSearch = new TrainingSearch();

		if (this.trainingEntry == null)
			this.trainingEntry = new TrainingEntry();

		if (this.trainingClassEntry == null)
			this.trainingClassEntry = new TrainingClassEntry();

		if (this.facilityEntry == null)
			this.facilityEntry = new FacilityEntry();

		if (this.guestEntry == null)
			this.guestEntry = new GuestEntry();

		if (this.instructorEntry == null)
			this.instructorEntry = new InstructorEntry();

		if (this.courseEntry == null)
			this.courseEntry = new CourseEntry();

		if (this.certificationEntry == null)
			this.certificationEntry = new CertificationEntry();

		if (this.certificationManualEntry == null)
			this.certificationManualEntry = new CertificationManualEntry();

		if (this.trainingScheduleEntry == null)
			this.trainingScheduleEntry = new TrainingScheduleEntry();

		if (this.multiPFWindow == null)
			this.multiPFWindow = new MultiPFWindow();
		
		if (this.certificationSearch == null)
			this.certificationSearch = new CertificationSearch();
		
	}

	public void switchToFacilityCode() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmFacilitySrch");
	}

	public void switchToGuestSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("FRPersonnel/frmGuestSrch");
	}

	public void switchToInstructorSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmInstructorSrch");
	}

	public void switchToCourseSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("FRPersonnel/frmCourseSrch");
	}

	public void switchToClassSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("FRPersonnel/frmClassInquiry");
	}

	public void switchToTrainingSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("FRPersonnel/frmTrainingSrch");
	}

	public void switchToCertificationSearch() {
		objectIdentification.windowHandle.switchToMainWindowScreenTab("frmCertificationSrch");
	}

	public void switchToFacilityEntry() {
		objectIdentification.windowHandle.switchToWindow("Facility Code Entry");
	}

	public void switchToGuestEntry() {
		objectIdentification.windowHandle.switchToWindow("Guest Entry");
	}

	public void switchToInstructorEntry() {
		objectIdentification.windowHandle.switchToWindow("Instructor Entry");
	}

	public void switchToCourseEntry() {
		objectIdentification.windowHandle.switchToWindow("Course Entry");
	}

	public void switchToClassEntry() {
		objectIdentification.windowHandle.switchToWindow("Training Class Entry");
	}

	public void switchToTrainingEntry() {
		objectIdentification.windowHandle.switchToWindow("Training Entry");
	}

	public void switchToCertificationEntry() {
		objectIdentification.windowHandle.switchToWindow("Certification Entry");
	}

	public void switchToCertificationManualEntry() {
		objectIdentification.windowHandle.switchToWindow("Certification Manual Entry");
	}

	public void switchToTrainingClassEntry() {
		objectIdentification.windowHandle.switchToWindow("Training Class Entry");
	}

	public void switchToTrainingScheduleEntry() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmTrainingSchedule");
	}

	public void switchToMultiPFWindow() {
		objectIdentification.windowHandle.switchToWindowUsingURL("frmAddMultiPF");
	}

	public class RequestTab {

		public void clickAcceptCheckBox() {
			objectIdentification.randomIdentify.selectRandomGridRowCheckbox(
					uIMapFRPersonnel.trainingClassEntryWindow.requestTab.uIRequestTabReportTable);
		}
	}

	public class FacilityCode {
		public void enterAtCodeNo() {
			uIMapTraining.facilityCode.UICodeNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtCSZ() {
			uIMapTraining.facilityCode.UICSZCityTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			uIMapTraining.facilityCode.UICSZStateDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
			uIMapTraining.facilityCode.UICSZZipLookUp.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtName() {
			uIMapTraining.facilityCode.UINametxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectInculdeInactiveCheckbox() {
			uIMapTraining.facilityCode.UIIncludeInactiveCheckBox.click();
		}

		public void clickAdNewLink() {
			uIMapTraining.facilityCode.UIAddNewLink.click();
		}

		public void clickSearchLink() {
			uIMapTraining.facilityCode.UISearchLink.click();
		}

		public void clickResetLink() {
			uIMapTraining.facilityCode.UIResetLink.click();
		}

		public void selectRecordfromgrid() {

		}

	}

	public class GuestSearch {
		public void enterAtSSNo() {
			uIMapTraining.guestSearch.UISSNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtAgency() {
			uIMapTraining.guestSearch.UIAgencyTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtName() {
			uIMapTraining.guestSearch.UILastNameTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			uIMapTraining.guestSearch.UIFirstNameTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void clickAdNewLink() {
			uIMapTraining.guestSearch.UIAddNewLink.click();
		}

		public void clickSearchLink() {
			uIMapTraining.guestSearch.UISearchLink.click();
		}

		public void clickResetLink() {
			uIMapTraining.guestSearch.UIResetLink.click();
		}

		public void selectRecordfromgrid() {

		}
	}

	public class InstructorSearch {
		public void enterAtEmployeePFNo() {
			uIMapTraining.instructorSearch.UIEmployeePFNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtInstructorIDNo() {
			uIMapTraining.instructorSearch.UIInstructorIDNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtName() {
			uIMapTraining.instructorSearch.UILastNameTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			uIMapTraining.instructorSearch.UIFirstNameTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtAgencyORI() {
			uIMapTraining.instructorSearch.UIAgencyORITxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingCategory() {
			uIMapTraining.instructorSearch.UITrainingCategoryDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingType() {
			uIMapTraining.instructorSearch.UITrainingTypeDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtPeriodDate() {
			uIMapTraining.instructorSearch.UIPeriodFromDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			uIMapTraining.instructorSearch.UIPeriodToDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtCertification() {
			uIMapTraining.instructorSearch.UICertificationDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtRecertifyBy() {
			uIMapTraining.instructorSearch.UIRecertifyDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectRecertifyByTodayCheckbox() {
			uIMapTraining.instructorSearch.UIRecertifyTodayCheckbox.click();
		}

		public void selectInculdeInactiveCheckbox() {
			uIMapTraining.instructorSearch.UIIncludeInactiveCheckbox.click();
		}

		public void clickAdNewLink() {
			uIMapTraining.instructorSearch.UIAddNewLink.click();
		}

		public void clickSearchLink() {
			uIMapTraining.instructorSearch.UISearchLink.click();
		}

		public void clickBackLink() {
			uIMapTraining.instructorSearch.UISearchLink.click();
		}

		public void clickResetLink() {
			uIMapTraining.instructorSearch.UIResetLink.click();
		}

		public void selectRecordfromgrid() {

		}
	}

	public class CourseSearch {

		public void enterAtCourseSystemID() {
			uIMapTraining.courseSearch.UICourseSystemIDTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingCategory() {
			uIMapTraining.courseSearch.UITrainingCategoryDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingType() {
			uIMapTraining.courseSearch.UITrainingTypeDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtCourseNo() {
			uIMapTraining.courseSearch.UICourseNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));

		}

		public void enterAtCourseTitle() {
			uIMapTraining.courseSearch.UICourseTitleTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));

		}

		public void selectAtQualificationPeriod() {
			uIMapTraining.courseSearch.UIQualificationPeriodDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectInculdeInactiveCheckbox() {
			uIMapTraining.courseSearch.UIIncludeInactiveCheckbox.click();
		}

		public void clickAdNewLink() {
			uIMapTraining.courseSearch.UIAddNewLink.click();
		}

		public void clickSearchLink() {
			uIMapTraining.courseSearch.UISearchLink.click();
		}

		public void clickBackLink() {
			uIMapTraining.courseSearch.UISearchLink.click();
		}

		public void clickResetLink() {
			uIMapTraining.courseSearch.UIResetLink.click();
		}

		public void selectRecordfromgrid() {

		}
	}

	public class ClassSearch {

		public void selectAtTrainingDate() {
			uIMapTraining.classSearch.UITrainingFromDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			uIMapTraining.classSearch.UITrainingToDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingCategory() {
			uIMapTraining.classSearch.UITrainingCategoryDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingType() {
			uIMapTraining.classSearch.UITrainingTypeDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtCourseNo() {
			uIMapTraining.classSearch.UICourseNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));

		}

		public void enterAtCourseTitle() {
			uIMapTraining.classSearch.UICourseTitleTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));

		}

		public void enterAtEmployeePFNo() {
			uIMapTraining.classSearch.UIEmployeePFNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtAgency() {
			uIMapTraining.classSearch.UIAgencyTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			Playback.controlReadyThreadWait();
			uIMapTraining.classSearch.UINameDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtMethodOfInstrcution() {
			uIMapTraining.classSearch.UIMethodOfInstructionDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtFacilty() {
			uIMapTraining.classSearch.UIFacilityCodeTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtInstructor() {
			uIMapTraining.classSearch.UIInstructorTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectShowCancelledClassesCheckbox() {
			uIMapTraining.classSearch.UIShowCancelledClassesCheckbox.click();
		}

		public void clickAddNewLink() {
			uIMapTraining.classSearch.UIAddNewLink.click();
		}

		public void clickSearchLink() {
			uIMapTraining.classSearch.UISearchLink.click();
		}

		public void clickBackLink() {
			uIMapTraining.classSearch.UISearchLink.click();
		}

		public void clickResetLink() {
			uIMapTraining.classSearch.UIResetLink.click();
		}

		public void selectRecordfromgrid() {

		}
	}

	public class TrainingSearch {
		public void enterAtEmployeePFNo() {
			uIMapTraining.trainingSearch.UIEmployeePFNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtAgency() {
			uIMapTraining.trainingSearch.UIAgencyTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			Playback.controlReadyThreadWait();
			uIMapTraining.trainingSearch.UINameDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtStatus() {
			uIMapTraining.trainingSearch.UIStatusDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectShowOnlyPFWithOutTrainingCheckbox() {
			uIMapTraining.trainingSearch.UIShowOnlyPFsWithOutTrainingCheckbox.click();
		}

		public void selectAtDivision() {
			uIMapTraining.trainingSearch.UIDivisionDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtSection() {
			uIMapTraining.trainingSearch.UISectionDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtStation() {
			uIMapTraining.trainingSearch.UIStationDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtUnit() {
			uIMapTraining.trainingSearch.UIUnitTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtShift() {
			uIMapTraining.trainingSearch.UIShiftDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtTeam() {
			uIMapTraining.trainingSearch.UITeamDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingCategory() {
			uIMapTraining.trainingSearch.UITrainingCategoryDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtTrainingType() {
			uIMapTraining.trainingSearch.UITrainingTypeDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtCourseNo() {
			uIMapTraining.trainingSearch.UICourseNoTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));

		}

		public void enterAtCourseTitle() {
			uIMapTraining.trainingSearch.UICourseTitleTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));

		}

		public void enterAtTrainingDate() {
			uIMapTraining.trainingSearch.UITrainingFromDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
			uIMapTraining.trainingSearch.UITrainingToDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtRecertifyBy() {
			uIMapTraining.trainingSearch.UIRequalifyByDateTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectRecertifyByTodayCheckbox() {
			uIMapTraining.trainingSearch.UIRequalifyByTodayCheckbox.click();
		}

		public void selectTrainingWhileOnDuty() {
			uIMapTraining.trainingSearch.UITrainingWhileOnDutyRadiobox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectTrainingWhileOffDuty() {
			uIMapTraining.trainingSearch.UITrainingWhileOffDutyRadiobox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectTrainingWhileAll() {
			uIMapTraining.trainingSearch.UITrainingWhileAllRadiobox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtResult() {
			uIMapTraining.trainingSearch.UIResultDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtCertification() {
			uIMapTraining.trainingSearch.UICertificationDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void selectAtMethodOfInstruction() {
			uIMapTraining.trainingSearch.UIMethodOfInstructionDropdown.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtTrainingFacility() {
			uIMapTraining.trainingSearch.UIFacilityCodeTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void enterAtInstructor() {
			uIMapTraining.trainingSearch.UIInstructorTxtbox.sendKeys(BaseData.getTrainingModuleValue(""));
		}

		public void clickAdNewLink() {
			uIMapTraining.trainingSearch.UIAddNewLink.click();
		}

		public void clickSearchLink() {
			uIMapTraining.trainingSearch.UISearchLink.click();
		}

		public void clickBackLink() {
			uIMapTraining.trainingSearch.UISearchLink.click();
		}

		public void clickResetLink() {
			uIMapTraining.trainingSearch.UIResetLink.click();
		}

		public void selectRecordfromgrid() {

		}
	}

	public class CertificationSearch {
		public void clickAddNew() {
			uIMapFRPersonnel.certificationSearchWindow.uIAddNewButton.click();
		}

		public void verifyAtPF(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getTrainingModuleValue("PF"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapFRPersonnel.certificationSearchWindow.uICertificationSearchTable, "PF", rowIndex));
		}

		public void verifyAtCertification(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getTrainingModuleValue("Certification"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapFRPersonnel.certificationSearchWindow.uICertificationSearchTable, "Certification",
							rowIndex));
		}

		public void verifyAtCEUsEarned(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getTrainingModuleValue("CEUsEarned"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapFRPersonnel.certificationSearchWindow.uICertificationSearchTable, "CEUs Earned",
							rowIndex));
		}

		public void verifyAtHoursEarned(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getTrainingModuleValue("HoursEarned"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapFRPersonnel.certificationSearchWindow.uICertificationSearchTable, "Hours Earned",
							rowIndex));
		}
	}

	public class FacilityEntry {

	}

	public class GuestEntry {

	}

	public class InstructorEntry {

	}

	public class CourseEntry {

		public CourseDescriptionTab courseDescriptionTab;
		public NotesForStudentsTab notesForStudentsTab;
		public InstructorNotesTab instructorNotesTab;
		public CourseCEUsTab courseCEUsTab;
		public OtherSettingsTab otherSettingsTab;
		public CourseEntryAttachmentTab courseEntryAttachmentTab;

		public CourseEntry() {
			if (this.courseDescriptionTab == null)
				this.courseDescriptionTab = new CourseDescriptionTab();

			if (this.notesForStudentsTab == null)
				this.notesForStudentsTab = new NotesForStudentsTab();

			if (this.instructorNotesTab == null)
				this.instructorNotesTab = new InstructorNotesTab();

			if (this.courseCEUsTab == null)
				this.courseCEUsTab = new CourseCEUsTab();

			if (this.otherSettingsTab == null)
				this.otherSettingsTab = new OtherSettingsTab();

			if (this.courseEntryAttachmentTab == null)
				this.courseEntryAttachmentTab = new CourseEntryAttachmentTab();

		}

		public void navigatetoCourseDescriptionTab() {
			uIMapTraining.courseEntry.courseDescriptionTab.UINavigatetoInstructorsTab.click();
		}

		public void navigatetoInstructorNotesTab() {
			uIMapTraining.courseEntry.instructorNotesTab.UINavigatetoInstructorNotesTab.click();
			objectIdentification.windowHandle.switchToFrame("frmLogHistory");

		}

		public void navigatetoNotesForStudentsTab() {
			uIMapTraining.courseEntry.notesForStudentsTab.UINavigatetoNotesForStudentsTab.click();
		}

		public void navigatetoCEUsTab() {
			uIMapTraining.courseEntry.courseCEUsTab.UINavigatetoCEUsTab.click();
		}

		public void navigatetoOtherSettingsTab() {
			uIMapTraining.courseEntry.otherSettingsTab.UINavigatetoOtherSettingsTab.click();
		}

	}

	public class CourseDescriptionTab {

	}

	public class NotesForStudentsTab {

	}

	public class InstructorNotesTab {

	}

	public class CourseCEUsTab {

	}

	public class OtherSettingsTab {

	}

	public class CourseEntryAttachmentTab {

	}

	public class ClassEntry {
		public ClassEntryStudentsTab classEntryStudentsTab;
		public ClassEntryTrainingDetailTab classEntryTrainingDetailTab;
		public ClassEntryInstructorsTab classEntryInstructorsTab;
		public ClassEntryCourseDescriptionTab classEntryCourseDescriptionTab;
		public ClassEntryNotesForStudentsTab classEntryNotesForStudentsTab;
		public ClassEntryInstructorNotesTab classEntryInstructorNotesTab;
		public ClassEntryEvaluationsTab classEntryEvaluationsTab;
		public ClassEntryCEUsTab classEntryCEUsTab;
		public ClassEntryAttachmentTab classEntryAttachmentTab;
		public RequestTab requestTab;

		public ClassEntry() {
			if (this.classEntryStudentsTab == null)
				this.classEntryStudentsTab = new ClassEntryStudentsTab();

			if (this.classEntryTrainingDetailTab == null)
				this.classEntryTrainingDetailTab = new ClassEntryTrainingDetailTab();

			if (this.classEntryInstructorsTab == null)
				this.classEntryInstructorsTab = new ClassEntryInstructorsTab();

			if (this.classEntryCourseDescriptionTab == null)
				this.classEntryCourseDescriptionTab = new ClassEntryCourseDescriptionTab();

			if (this.classEntryNotesForStudentsTab == null)
				this.classEntryNotesForStudentsTab = new ClassEntryNotesForStudentsTab();

			if (this.classEntryEvaluationsTab == null)
				this.classEntryEvaluationsTab = new ClassEntryEvaluationsTab();

			if (this.classEntryCEUsTab == null)
				this.classEntryCEUsTab = new ClassEntryCEUsTab();

			if (this.classEntryInstructorNotesTab == null)
				this.classEntryInstructorNotesTab = new ClassEntryInstructorNotesTab();

			if (this.classEntryAttachmentTab == null)
				this.classEntryAttachmentTab = new ClassEntryAttachmentTab();

			if (this.requestTab == null)
				this.requestTab = new RequestTab();
		}

		public void switchToTrainingDetailTab() {
			uIMapFRPersonnel.trainingClassEntryWindow.uITrainingDetailTab.click();
		}

		public void switchToRequestTab() {
			uIMapFRPersonnel.trainingClassEntryWindow.uIRequestTab.click();
		}

		public void selectTrainingCategoryAsPolice() {
			uIMapFRPersonnel.trainingClassEntryWindow.uITrainingCategoryComboBox.sendKeys("Police");
		}

		public void selectTrainingTypeAsSeleniumTraining() {
			uIMapFRPersonnel.trainingClassEntryWindow.uITrainingTypeComboBox.sendKeys("Selenium Training");
		}

		public void enterEntryDate() {
			uIMapFRPersonnel.trainingClassEntryWindow.uIEntryDateEdit.click();
			uIMapFRPersonnel.trainingClassEntryWindow.uIEntryDateEdit.sendKeys(Keys.TAB);
		}

		public void enterNoOfStudentsAs1() {
			uIMapFRPersonnel.trainingClassEntryWindow.uINoOfStudentEdit.sendKeys("1");
		}

		public void enterCourseNoAs1000() {
			uIMapFRPersonnel.trainingClassEntryWindow.uICourseNoEdit.sendKeys("1000");
			uIMapFRPersonnel.trainingClassEntryWindow.uICourseNoEdit.sendKeys(Keys.TAB);
		}

		public void enterTrainingScheduleDate() {
			uIMapFRPersonnel.trainingClassEntryWindow.uIEnterTrainingScheduleDateEdit.click();
			uIMapFRPersonnel.trainingClassEntryWindow.uIEnterTrainingScheduleDateEdit.sendKeys(Keys.TAB);
		}

		public void enterTrainingScheduleTime() {
			uIMapFRPersonnel.trainingClassEntryWindow.uIEnterTrainingScheduleTimeEdit
					.sendKeys(Randomized.getCurrentTime("HH:mm"));
		}

		public void enterToDate() {
			uIMapFRPersonnel.trainingClassEntryWindow.uIEnterToDateEdit.sendKeys(Randomized.getCurrentDate());
			uIMapFRPersonnel.trainingClassEntryWindow.uIEnterToDateEdit.sendKeys(Keys.TAB);
		}

		public void enterToTime() {
			uIMapFRPersonnel.trainingClassEntryWindow.uIEnterToTimeEdit
					.sendKeys(Randomized.getFutureTimeByHours(2, "HH:mm"));
		}

		public void save() {
			uIMapFRPersonnel.trainingClassEntryWindow.uISaveButton.click();
			popup.confirm.yes();
			Playback.popupThreadWait();
		}

		public void closeTrainingClassEntryScreen() {
			uIMapFRPersonnel.trainingClassEntryWindow.driver.close();
		}

		public void clickSignUpButton() {
			uIMapFRPersonnel.trainingClassEntryWindow.uISignUpButton.click();
		}

	}

	public class ClassEntryStudentsTab {
		public void enterAtEmployeePF() {
			uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIEmployeePFNoTxtbox
					.sendKeys(BaseData.getTrainingModuleValue("EmployeePF"));
		}

		public void clickAddMultipleEmployees() {
			uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIAddMultipleEmployeesButton.click();
		}

		public void selectAtPFCodeCheckBoxInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIGridTable,
					BaseData.getTrainingModuleValue("PFCode"));
		}

		public void selectAtPFCode1CheckBoxInGrid() {
			objectIdentification.manualIdentify.selectGridRowCheckBoxByCellInnerText(
					uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIGridTable,
					BaseData.getTrainingModuleValue("PFCode1"));
		}

		public void selectResultAsPass() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIResultDropdown, "Pass");
		}

		public void enterAtScore() {
			uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIScoreTxtbox
					.sendKeys(BaseData.getTrainingModuleValue("Score"));
		}

		public void enterNotes() {
			uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIScoreTxtbox
					.sendKeys(Randomized.randomAlphanumeric(20));
		}

		public void clickApplyButton() {
			uIMapTraining.trainingClassEntry.classEntryStudentsTab.uIApplyButton.click();
		}

	}

	public class ClassEntryTrainingDetailTab {

		public void selectQualificationPeriodAsNone() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraining.trainingClassEntry.classEntryTrainingDetailTab.uIQualificationPeriodComboBox, 1);
		}

		public void enterRequalifyByAsTomorrowDate() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraining.trainingClassEntry.classEntryTrainingDetailTab.uIReQualifyByDateEdit,
					Randomized.getFutureDate(1));
		}

	}

	public class ClassEntryInstructorsTab {
		public void selectAtInstructorPF() {
			uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uIInstructorEdit
					.sendKeys(BaseData.getTrainingModuleValue("Instructor"));
			uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uIInstructorEdit.sendKeys(Keys.TAB);

		}

		public void selectAtCertificationComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uICertificationDropdown,
					BaseData.getTrainingModuleValue("Certification"));
			uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uICertificationDropdown.sendKeys(Keys.TAB);
		}

		public void selectAtpositionComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uIPositionDropdown,
					BaseData.getTrainingModuleValue("Position"));
			uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uIPositionDropdown.sendKeys(Keys.TAB);

		}

		public void enterAtTrainingHours() {
			uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uITrainingHoursTxtbox
					.sendKeys(BaseData.getTrainingModuleValue("TrainingHours"));
		}

		public void clickAddButton() {
			uIMapTraining.trainingClassEntry.classEntryInstructorsTab.uIAddButton.click();
		}

	}

	public class ClassEntryCourseDescriptionTab {

	}

	public class ClassEntryNotesForStudentsTab {

	}

	public class ClassEntryInstructorNotesTab {

	}

	public class ClassEntryEvaluationsTab {

	}

	public class ClassEntryCEUsTab {

	}

	public class ClassEntryAttachmentTab {

	}

	public class TrainingEntry {

		public TrainingDetailTab trainingDetailTab;
		public AdditionalPFTab additionalPFTab;
		public InstructorsTab instructorsTab;
		public CEUsTab cEUsTab;
		public TrainingEntryAttachmentTab trainingEntryAttachmentTab;

		public TrainingEntry() {

			if (this.trainingDetailTab == null)
				this.trainingDetailTab = new TrainingDetailTab();

			if (this.additionalPFTab == null)
				this.additionalPFTab = new AdditionalPFTab();

			if (this.instructorsTab == null)
				this.instructorsTab = new InstructorsTab();

			if (this.cEUsTab == null)
				this.cEUsTab = new CEUsTab();

			if (this.trainingEntryAttachmentTab == null)
				this.trainingEntryAttachmentTab = new TrainingEntryAttachmentTab();

		}

		public void navigatetoTrainingDetailTab() {
			uIMapTraining.trainingEntry.trainingDetailTab.UINavigatetoTrainingDetailTab.click();
		}

		public void navigatetoInstructorsTab() {
			uIMapTraining.trainingEntry.instructorsTab.UINavigatetoInstructorsTab.click();
		}

		public void navigatetoAdditionalPFTab() {
			uIMapTraining.trainingEntry.additionalPFTab.UINavigatetoAdditionalPFTab.click();
		}

		public void navigatetoCEUsTab() {
			uIMapTraining.trainingEntry.cEUsTab.UINavigatetoCEUsTab.click();
		}

	}

	public class TrainingDetailTab {
	}

	public class AdditionalPFTab {

	}

	public class InstructorsTab {

	}

	public class CEUsTab {

	}

	public class TrainingEntryAttachmentTab {

	}

	public class CertificationEntry {

	}

	public class CertificationManualEntry {
		public void enterAtPFCode() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIPFNumberEdit
					.sendKeys(BaseData.getTrainingModuleValue("PFCode"));
			uIMapFRPersonnel.certificationManualEntryWindow.uIPFNumberEdit.sendKeys(Keys.TAB);
		}

		public void selectAsCertification() {
			uIMapFRPersonnel.certificationManualEntryWindow.uICertificationComboBox
					.sendKeys("01 - Selenium Certification");
		}

		public void selectAtCertification() {
			uIMapFRPersonnel.certificationManualEntryWindow.uICertificationComboBox
					.sendKeys(BaseData.getTrainingModuleValue("Certification"));
			uIMapFRPersonnel.certificationManualEntryWindow.uICertificationComboBox.sendKeys(Keys.TAB);
		}

		public void enterEarnedCEUsAsFive() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIEarnedCEUsEdit.sendKeys("5");
		}

		public void enterEarnedHoursAsOneHour() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIEarnedHourEdit.sendKeys("1");
		}

		public void enterEffectiveFromAsCurrentDate() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIEffectiveFromDateEdit
					.sendKeys(Randomized.getCurrentDate());
		}

		public void enterRecertificaitonByAs1DayFutureFromCurrentDate() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIRecertificationByDateEdit
					.sendKeys(Randomized.getFutureDate(1));
		}

		public void verifyRecertificaitonByAs30DayFutureFromCurrentDate() {
			verify.ExpectedPropertyValueIsEqual(Randomized.getFutureDate(30),
					uIMapFRPersonnel.certificationManualEntryWindow.uIRecertificationByDateEdit.getAttribute("value"));
		}

		public void verifyRecertificationByFieldDisabled() {
			verify.ExpectedValueIsTrue(uIMapFRPersonnel.certificationManualEntryWindow.uIRecertificationByDateEdit
					.getAttribute("class").contains("textboxInactive"));
		}

		public void ClickInstructorCheckbox() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIInstructorCheckbox.click();
		}

		public void ClickIsEMSCheckbox() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIIsEMSCheckbox.click();
		}

		public void enterReason() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIReasonEdit.sendKeys("To Test For Automation purpose");
		}

		public void enterAtEnteredBy() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIEnteredByEdit
					.sendKeys(BaseData.getTrainingModuleValue("UserName"));
			uIMapFRPersonnel.certificationManualEntryWindow.uIEnteredByEdit.sendKeys(Keys.TAB);
		}

		public void save() {
			uIMapFRPersonnel.certificationManualEntryWindow.uISaveButton.click();
			popup.confirm.yes();
		}

		public void closeCertificationManualEntryScreen() {
			uIMapFRPersonnel.certificationManualEntryWindow.driver.close();
		}

		public void VerifyEarnedCEUFieldMandatory() {
			verify.ExpectedValueIsTrue(uIMapFRPersonnel.certificationManualEntryWindow.uIEarnedCEUsLabel
					.getAttribute("style").contains("red"));
		}

		public void VerifyEarnedHoursFieldMandatory() {
			verify.ExpectedValueIsTrue(uIMapFRPersonnel.certificationManualEntryWindow.uIEarnedHourLabel
					.getAttribute("style").contains("red"));
		}

		public void EnterAtEarnedCEU() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIEarnedCEUsEdit
					.sendKeys(BaseData.getTrainingModuleValue("EarnedCEU"));
		}

		public void EnterAtEarnedHours() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIEarnedHourEdit
					.sendKeys(BaseData.getTrainingModuleValue("EarnedCEU"));
		}

		public void SelectOtherJobRole() {
			objectIdentification.randomIdentify.selectRadControlDropDownValueSelect(
					uIMapFRPersonnel.certificationManualEntryWindow.uIOtherJobRolesCombobox);
		}

		public void SelectPrimaryJobRole() {
			objectIdentification.randomIdentify
					.selectDropDownOption(uIMapFRPersonnel.certificationManualEntryWindow.uIPrimaryEMSRoleCombobox);
		}

		public void SelectAgencyEMSPracticeLevel() {
			objectIdentification.randomIdentify.selectDropDownOption(
					uIMapFRPersonnel.certificationManualEntryWindow.uIAgencyEMSPracticeLevelCombobox);
		}

		public void TabOutAgencyEMSPracticeLevelDate() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIAgencyEMSPracticeLevelDateEdit.sendKeys(Keys.TAB);
		}

		public void ClickAddButton() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIAddButton.click();
		}

		public void TabOutEnteredDate() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIEnteredDateEdit.sendKeys(Keys.TAB);
		}

		public void InternalSave() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIInternalSaveButton.click();
			popup.confirm.yes();
		}

		public void ClickMainTab() {
			uIMapFRPersonnel.certificationManualEntryWindow.uIMainTab.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyUpdateSuccessfulAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(6071) Update Successful");
		}
	}

	public class TrainingClassEntry {
		public ClassEntryStudentsTab classEntryStudentsTab;
		public ClassEntryTrainingDetailTab classEntryTrainingDetailTab;
		public ClassEntryInstructorsTab classEntryInstructorsTab;
		public ClassEntryCourseDescriptionTab classEntryCourseDescriptionTab;
		public ClassEntryNotesForStudentsTab classEntryNotesForStudentsTab;
		public ClassEntryInstructorNotesTab classEntryInstructorNotesTab;
		public ClassEntryEvaluationsTab classEntryEvaluationsTab;
		public ClassEntryCEUsTab classEntryCEUsTab;
		public ClassEntryAttachmentTab classEntryAttachmentTab;

		public TrainingClassEntry() {
			if (this.classEntryStudentsTab == null)
				this.classEntryStudentsTab = new ClassEntryStudentsTab();

			if (this.classEntryTrainingDetailTab == null)
				this.classEntryTrainingDetailTab = new ClassEntryTrainingDetailTab();

			if (this.classEntryInstructorsTab == null)
				this.classEntryInstructorsTab = new ClassEntryInstructorsTab();

			if (this.classEntryCourseDescriptionTab == null)
				this.classEntryCourseDescriptionTab = new ClassEntryCourseDescriptionTab();

			if (this.classEntryNotesForStudentsTab == null)
				this.classEntryNotesForStudentsTab = new ClassEntryNotesForStudentsTab();

			if (this.classEntryEvaluationsTab == null)
				this.classEntryEvaluationsTab = new ClassEntryEvaluationsTab();

			if (this.classEntryCEUsTab == null)
				this.classEntryCEUsTab = new ClassEntryCEUsTab();

			if (this.classEntryInstructorNotesTab == null)
				this.classEntryInstructorNotesTab = new ClassEntryInstructorNotesTab();

			if (this.classEntryAttachmentTab == null)
				this.classEntryAttachmentTab = new ClassEntryAttachmentTab();

		}

		public void closeScreen() {
			uIMapTraining.trainingClassEntry.driver.close();
		}

		public void clickStudentTab() {
			uIMapTraining.trainingClassEntry.uIStudentsTab.click();
		}

		public void clickTrainingDetailTab() {
			uIMapTraining.trainingClassEntry.uITrainingDetailTab.click();
		}

		public void clickInstructorsTab() {
			uIMapTraining.trainingClassEntry.uIInstructorsTab.click();
		}

		public void clickCourseDescriptionTab() {
			uIMapTraining.trainingClassEntry.uIInstructorsTab.click();
		}

		public void clickNotesForStudentsTab() {
			uIMapTraining.trainingClassEntry.uINotesforStudentsTab.click();
		}

		public void clickInstructorNotesTab() {
			uIMapTraining.trainingClassEntry.uIInstructorNotesTab.click();
			objectIdentification.windowHandle.switchToFrame("frmLogHistory");
		}

		public void clickEvaluationsTab() {
			uIMapTraining.trainingClassEntry.uIEvaluationsTab.click();
		}

		public void clickCEUsTab() {
			uIMapTraining.trainingClassEntry.uICEUsTab.click();
		}

		public void clickAttachmentTab() {
			uIMapTraining.trainingClassEntry.uIAttachmentTab.click();
			objectIdentification.windowHandle.switchToFrame("frmTxtAttachMgrEx");
		}

		public void verifyAtJurisComboBox() {
			String selectedItem = objectIdentification.manualIdentify
					.getDropDwonSelectedItem(uIMapTraining.trainingClassEntry.uIJurisComboBox);
			verify.ExpectedPropertyValueIsEqual(selectedItem, BaseData.getTrainingModuleValue("Juris"));

		}

		public void selectAtTrainingCategoryComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraining.trainingClassEntry.uITrainingCategoryComboBox,
					BaseData.getTrainingModuleValue("TrainingCategory"));
		}

		public void selectAtTrainingTypeComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapTraining.trainingClassEntry.uITrainingTypeComboBox,
					BaseData.getTrainingModuleValue("TrainingType"));
		}

		public void enterAtNoOfStudents() {
			uIMapTraining.trainingClassEntry.uINoOfStudents.sendKeys(BaseData.getTrainingModuleValue("NoOfStudents"));
		}

		public void clickDoNotPublishCheckBox() {
			uIMapTraining.trainingClassEntry.uIDoNotPublishCheckbox.click();
		}

		public void clickEmployeesOnlyCheckBox() {
			uIMapTraining.trainingClassEntry.uIEmployeesOnlyCheckbox.click();
		}

		public void enterFromDateAndToDateAsCurrentDate() {
			uIMapTraining.trainingClassEntry.uITrainingFromDateTxtbox.sendKeys(Randomized.getCurrentDate());
			uIMapTraining.trainingClassEntry.uITrainingFromTimeTxtbox.sendKeys(Keys.TAB);
			uIMapTraining.trainingClassEntry.uITrainingToDateTxtbox.sendKeys(Randomized.getCurrentDate());
			uIMapTraining.trainingClassEntry.uITrainingToTimeTxtbox.sendKeys(Keys.TAB);
		}

		public void clickMultiScheduleButton() {
			uIMapTraining.trainingClassEntry.uIMultidayScheduleButton.click();
		}

		public void verifyActivityLogButtonIsDisabled() {
			String attribute = uIMapTraining.trainingClassEntry.uIActivityLogButton.getAttribute("disabled");
			System.out.println(attribute);
			verify.ExpectedValueIsTrue(attribute.contains("true"));
		}

		public void verifyActivityLogButtonIsEnabled() {
			verify.ExpectedValueIsTrue(uIMapTraining.trainingClassEntry.uIActivityLogButton.isEnabled());

		}

		public void clickActivityLogButton() {
			uIMapTraining.trainingClassEntry.uIActivityLogButton.click();

		}

		public void saveNCloseScreen() {
			uIMapTraining.trainingClassEntry.uISaveNCloseButton.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yes();
			}

			else {
				popup.switchToConfirm();
				popup.confirm.yes();
			}

		}

		public void save() {
			uIMapTraining.trainingClassEntry.uISaveButton.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yes();
			}

			else {
				popup.switchToConfirm();
				popup.confirm.yes();
			}

		}

		public void selectTrainingCategoryAsPolice() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraining.trainingClassEntry.uITrainingCategoryComboBox, "Police");
		}

		public void selectTrainingTypeAsSeleniumTraining() {
			objectIdentification.manualIdentify
					.selectDropDownOption(uIMapTraining.trainingClassEntry.uITrainingTypeComboBox, "Selenium Training");
		}

		public void enterEntryDate() {
			uIMapTraining.trainingClassEntry.uIEntryDateTxtbox.sendKeys(Keys.TAB);
		}

		public void enterNoOfStudentsAs1() {
			uIMapTraining.trainingClassEntry.uINoOfStudents.sendKeys("1");
			uIMapTraining.trainingClassEntry.uINoOfStudents.sendKeys(Keys.TAB);
		}

		public void enterCourseNoAs1000() {
			uIMapTraining.trainingClassEntry.uICourseNoTxtbox.sendKeys("1000");
			uIMapTraining.trainingClassEntry.uICourseNoTxtbox.sendKeys(Keys.TAB);
		}

		public void enterTrainingScheduleDate() {
			uIMapTraining.trainingClassEntry.uITrainingFromDateTxtbox.sendKeys(Keys.TAB);

		}

		public void enterTrainingScheduleTime() {
			uIMapTraining.trainingClassEntry.uITrainingFromTimeTxtbox.sendKeys(Keys.TAB);
		}

		public void enterToDate() {
			uIMapTraining.trainingClassEntry.uITrainingToDateTxtbox.sendKeys(Keys.TAB);
		}

		public void enterToTime() {
			uIMapTraining.trainingClassEntry.uITrainingToTimeTxtbox.sendKeys(Keys.TAB);
		}

		public void enterAtCourseNo() {
			uIMapTraining.trainingClassEntry.uICourseNoTxtbox.sendKeys(BaseData.getTrainingModuleValue("Course"));
			uIMapTraining.trainingClassEntry.uICourseNoTxtbox.sendKeys(Keys.TAB);
		}

	}

	public class TrainingScheduleEntry {

		public void tabOutTrainingStartAndEndDate() {
			uIMapTraining.trainingScheduleEntry.uITrainingStartDateEdit.sendKeys(Keys.TAB);
			uIMapTraining.trainingScheduleEntry.uITrainingEndDateEdit.sendKeys(Keys.TAB);
		}

		public void enterClassHoursFromAndToFields() {
			uIMapTraining.trainingScheduleEntry.uIClassHoursFromEdit.sendKeys(Keys.TAB);
			uIMapTraining.trainingScheduleEntry.uIClassHoursToEdit
					.sendKeys(Randomized.getFutureTimeByHours(2, "HH:MM"));
			uIMapTraining.trainingScheduleEntry.uIClassHoursToEdit.sendKeys(Keys.TAB);

		}

		public void clickAddButton() {
			uIMapTraining.trainingScheduleEntry.uIAddButton.click();
		}

		public void saveNClose() {
			uIMapTraining.trainingScheduleEntry.uISaveNClose.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yes();
			} else {
				popup.switchToConfirm();
				popup.confirm.yes();
			}

		}

		public void save() {
			uIMapTraining.trainingScheduleEntry.uISave.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yes();
			} else {
				popup.switchToConfirm();
				popup.confirm.yes();
			}

		}

	}

	public class MultiPFWindow {

		public void clickselectAllCheckBox() {
			uIMapTraining.multiPFWindow.uISelectAllCheckBox.click();
		}

		public void clickAddSelectedPFToList() {
			uIMapTraining.multiPFWindow.uIAddSelectedPFToList.click();
		}

	}

}
