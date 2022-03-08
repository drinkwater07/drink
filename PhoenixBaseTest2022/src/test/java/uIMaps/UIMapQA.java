package uIMaps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapQA {

	public QuestionDataEntry questionDataEntry;
	public Questionnarie questionnarie;
	public QAFormEntry qAFormEntry;
	public QAFormSection qAFormSection;
	public ManageQuestions manageQuestions;
	public QuestionMaster questionMaster;
	public QuestionReview questionReview;
	public PDFFormScreen pdfFormScreen;
	public QuestionnarieRepository questionnarieRepository;

	public UIMapQA() {
		if (this.questionDataEntry == null)
			this.questionDataEntry = new QuestionDataEntry();
		if (this.questionnarie == null)
			this.questionnarie = new Questionnarie();
		if (this.qAFormEntry == null)
			this.qAFormEntry = new QAFormEntry();
		if (this.qAFormSection == null)
			this.qAFormSection = new QAFormSection();
		if (this.manageQuestions == null)
			this.manageQuestions = new ManageQuestions();
		if (this.questionMaster == null)
			this.questionMaster = new QuestionMaster();
		if (this.questionReview == null)
			this.questionReview = new QuestionReview();
		if (this.pdfFormScreen == null)
			this.pdfFormScreen = new PDFFormScreen();
		if (questionnarieRepository == null)
			questionnarieRepository = new QuestionnarieRepository();
	}

	public class Questionnarie {

		public WebDriver driver;

		public Questionnarie() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "cddForm_DropDown")
		public WebElement uISelectFormComboBox;

		@FindBy(how = How.ID, using = "cmdTakeTest")
		public WebElement uIFillFormButton;

		@FindBy(how = How.ID, using = "cmdrefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "grdQAForms")
		public WebElement uIResultTable;

	}

	public class QuestionDataEntry {

		public WebDriver driver;

		public QuestionDataEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupEntryOfficer_CodeValue")
		public WebElement uIPFCodeEdit;

		@FindBy(how = How.ID, using = "lupEntryOfficer_imgBtn")
		public WebElement uIPFNumberLookupButton;

		@FindBy(how = How.ID, using = "imgLock")
		public WebElement uILockButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "ArpQuestion")
		public WebElement uIDivQuestionTable;

		@FindBy(how = How.ID, using = "btnSave")
		public WebElement uIReportSave;

		@FindBy(how = How.ID, using = "saveExit")
		public WebElement uIReportSaveExit;

		@FindBy(how = How.ID, using = "btnReset")
		public WebElement uIReportReset;

		@FindBy(how = How.ID, using = "pdfViewerinput_0_0")
		public WebElement uIReportLastName;

		@FindBy(how = How.ID, using = "pdfViewerinput_0_1")
		public WebElement uIReportFirstName;

		@FindBy(how = How.XPATH, using = "//label[text()='Yes']/../input")
		public WebElement uIYesButton;

		@FindBy(how = How.XPATH, using = "//td//label[contains(text(),'Battery Operated')]/../input")
		public List<WebElement> uIBatteryOperatedButtons;

	}

	public class QAFormEntry {
		public WebDriver driver;

		public QAFormEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtFormID")
		public WebElement uIFormRefNoEdit;

		@FindBy(how = How.ID, using = "txtFormName")
		public WebElement uIFormNameEdit;

		@FindBy(how = How.ID, using = "txtVersion")
		public WebElement uIVersionEdit;

		@FindBy(how = How.ID, using = "dttActive_KPIDttmCtrl")
		public WebElement uIActiveAsofEdit;

		@FindBy(how = How.ID, using = "chkCaptureScore")
		public WebElement uICaptureScoreCheckBox;

		@FindBy(how = How.ID, using = "chkShowReason")
		public WebElement uIShowReasonCheckBox;

		@FindBy(how = How.ID, using = "chkSupervisor")
		public WebElement uIAllowSupervisorResponseCheckBox;

		@FindBy(how = How.ID, using = "Chklckwhnsave")
		public WebElement uILockWhenSaveCheckBox;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesEdit;

		@FindBy(how = How.ID, using = "chkMultiple")
		public WebElement uIIsMultipleRecordsCheckBox;

		@FindBy(how = How.ID, using = "chkReady")
		public WebElement uIReadyforUseCheckBox;

		@FindBy(how = How.ID, using = "chkShared")
		public WebElement uISharedCheckBox;

		@FindBy(how = How.ID, using = "chkCreateNew")
		public WebElement uICreateNewCheckBox;

		@FindBy(how = How.ID, using = "txtNewVersion")
		public WebElement uINewVersionEdit;

		@FindBy(how = How.ID, using = "cmdMgQuestion")
		public WebElement uIManageQuestionsButton;

		@FindBy(how = How.ID, using = "cmdMgSection")
		public WebElement uIManageSectionButton;

		@FindBy(how = How.ID, using = "cmdReview")
		public WebElement uIReviewButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "CmdCopyQA")
		public WebElement uICopytoSameJurisButton;

		@FindBy(how = How.ID, using = "chkFormType_1")
		public WebElement uIPDFRadioButton;

		@FindBy(how = How.ID, using = "FileUploadFileType")
		public WebElement uISelectPDFFileButton;

		@FindBy(how = How.ID, using = "lnkpdfFileopen")
		public WebElement uIPDFLink;
	}

	public class QAFormSection {
		public WebDriver driver;

		public QAFormSection() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtSectionName")
		public WebElement uISectionNameEdit;

		@FindBy(how = How.ID, using = "txtSort")
		public WebElement uISortEdit;

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "txtFormID")
		public WebElement uIFormIDEdit;

		@FindBy(how = How.ID, using = "grdQASection")
		public WebElement uIQAFormSectionResultTable;
	}

	public class ManageQuestions {
		public WebDriver driver;

		public ManageQuestions() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cmdPostrefresh")
		public WebElement uIRefreshButton;

		@FindBy(how = How.ID, using = "cmdAddNewQues")
		public WebElement uIAddNewQuestionButton;

		@FindBy(how = How.ID, using = "cmdReview")
		public WebElement uIReviewButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "cmdSection")
		public WebElement uIAddNewSectionButton;

		@FindBy(how = How.ID, using = "grdQuestion")
		public WebElement uIManagegrdQuestionResultTable;

	}

	public class QuestionMaster {
		public WebDriver driver;

		public QuestionMaster() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddSection_DropDown")
		public WebElement uISectionDropdown;

		@FindBy(how = How.ID, using = "txtdispAs")
		public WebElement uIDisplayAsEdit;

		@FindBy(how = How.ID, using = "txtQuestion")
		public WebElement uIQuestionsEdit;

		@FindBy(how = How.ID, using = "cddAnsType_DropDown")
		public WebElement uIAnswerTypeDropdown;

		@FindBy(how = How.ID, using = "lupCodetype_CodeValue")
		public WebElement uICodeTypeLookup;

		@FindBy(how = How.ID, using = "chkRespReq")
		public WebElement uIResponserequiredCheckbox;

		@FindBy(how = How.ID, using = "ChkAllowMulti")
		public WebElement uIAllowMultipleAnswerCheckbox;

		@FindBy(how = How.ID, using = "ChkIsHide")
		public WebElement uIHideCheckbox;

		@FindBy(how = How.ID, using = "tabQuestion_tmpl0_UsrQuesMastYesNo2_txtYScore")
		public WebElement uIScoreYesEdit;

		@FindBy(how = How.ID, using = "tabQuestion_tmpl0_UsrQuesMastYesNo2_txtNScore")
		public WebElement uIScoreNoEdit;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "lupCodetype_imgBtn")
		public WebElement uICodeTypeLookupButton;

		@FindBy(how = How.ID, using = "chkBold")
		public WebElement uIBoldCheckbox;

		@FindBy(how = How.ID, using = "chkunderline")
		public WebElement uIUnderlineCheckbox;

		@FindBy(how = How.ID, using = "txtleadingspaces")
		public WebElement uILeadingSpacesEdit;

		@FindBy(how = How.ID, using = "txtcolumn")
		public WebElement uIColumnNoEdit;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Yes/No')])")
		public WebElement uIYesNoTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'True/False')])")
		public WebElement uITrueFalseTab;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Multiple Choice')])")
		public WebElement uIMultipleChoiceTab;

		@FindBy(how = How.ID, using = "uploadGraphicfileTextBox0")
		public WebElement uIIncludeGraphicEdit;

		@FindBy(how = How.XPATH, using = "//input[@class='ruButton ruBrowse']")
		public WebElement uISelectButton;

		@FindBy(how = How.ID, using = "uploadGraphicfileclear0")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "txtQuestion_contentIframe")
		public WebElement uIQuestionsCommentEdit;
	}

	public class QuestionReview {
		public WebDriver driver;

		public QuestionReview() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "chkShowAll")
		public WebElement uIShowAllQuestionsCheckbox;

		@FindBy(how = How.ID, using = "txt100010000021191")
		public WebElement uIComments1Edit;

		@FindBy(how = How.ID, using = "txt100010000021196")
		public WebElement uIComments2Edit;

		@FindBy(how = How.XPATH, using = "//input[@class='imageView']")
		public WebElement uIimageView;

	}

	public class PDFFormScreen {

		public WebDriver driver;

		public PDFFormScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

	}

	public class QuestionnarieRepository {

		public WebDriver driver;

		public QuestionnarieRepository() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "lstJuris")
		public WebElement uISelectJurisDropdown;

		@FindBy(how = How.ID, using = "lupReportID_CodeValue")
		public WebElement uIRepositoryIDEdit;

		@FindBy(how = How.ID, using = "cmdClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "chkmandatory")
		public WebElement uIMandatoryCheckbox;

		// cmdAdd

		@FindBy(how = How.ID, using = "cmdAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveAndCloseButton;

		@FindBy(how = How.ID, using = "chkShared")
		public WebElement uISharedCheckbox;

		@FindBy(how = How.ID, using = "lupsecurityid_imgBtn")
		public WebElement uIRoleLookupButton;

		@FindBy(how = How.ID, using = "lupReportID_imgBtn")
		public WebElement uIRepositoryIDLookupButton;

		@FindBy(how = How.ID, using = "grdQARepository")
		public WebElement uIQARepositoryTable;

		@FindBy(how = How.ID, using = "txtFormID")
		public WebElement uIFormIDEdit;

		@FindBy(how = How.ID, using = "lupReportID_imgBtn")
		public WebElement uIFormIDLookupButton;

		@FindBy(how = How.ID, using = "cddPdfAttachmentOptions_DropDown")
		public WebElement uIPDFAttachmentComboBox;

		@FindBy(how = How.ID, using = "cddActivityType_DropDown")
		public WebElement uIActivityTypeComboBox;

	}
}
