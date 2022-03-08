package application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import dataAccess.BaseData;
import uIMaps.UIMapQA;
import utilities.ObjectIdentification;
import utilities.Playback;
import utilities.Randomized;
import utilities.verify;

public class QA {

	public ObjectIdentification objectIdentification = new ObjectIdentification();
	public UIMapQA uIMapQA = new UIMapQA();
	public Popup popup = new Popup();

	public QuestionDataEntry questionDataEntry;
	public Questionnarie questionnarie;
	public QAFormEntry qAFormEntry;
	public QAFormSection qAFormSection;
	public ManageQuestions mManageQuestions;
	public QuestionMaster questionMaster;
	public QuestionReview questionReview;
	public PDFFormScreen pdfFormScreen;
	public QuestionnarieRepository questionnarieRepository;

	public QA() {
		if (questionDataEntry == null)
			questionDataEntry = new QuestionDataEntry();
		if (questionnarie == null)
			questionnarie = new Questionnarie();
		if (qAFormEntry == null)
			qAFormEntry = new QAFormEntry();
		if (qAFormSection == null)
			qAFormSection = new QAFormSection();
		if (mManageQuestions == null)
			mManageQuestions = new ManageQuestions();
		if (questionMaster == null)
			questionMaster = new QuestionMaster();
		if (questionReview == null)
			questionReview = new QuestionReview();
		if (pdfFormScreen == null)
			pdfFormScreen = new PDFFormScreen();
		if (questionnarieRepository == null)
			questionnarieRepository = new QuestionnarieRepository();
	}

	public void SwitchToQuestionnarie() {

		objectIdentification.windowHandle.switchToWindow("Questionnaire");

	}

	public void SwitchToQuestionDataEntry() {
		objectIdentification.windowHandle.switchToWindow("Question Data Entry");

	}

	public void SwitchToQAFormEntry() {

		objectIdentification.windowHandle.switchToWindow("QA Form Entry");

	}

	public void SwitchToQAFormSectionEntry() {

		objectIdentification.windowHandle.switchToWindow("QA Form Section");

	}

	public void SwitchToManageQuestionsEntry() {

		objectIdentification.windowHandle.switchToWindow("Manage Questions");

	}

	public void SwitchToQuestionMasterEntry() {

		objectIdentification.windowHandle.switchToWindow("Question Master");

	}

	public void SwitchToQuestionReviewEntry() {

		objectIdentification.windowHandle.switchToWindow("Question Review");

	}

	public void switchToQAFormEntryCopyJuris() {

		objectIdentification.windowHandle.switchToWindowUsingURL("&QAFormVersion");

	}

	public void switchToPDFFormScreen() {
		objectIdentification.windowHandle.switchToWindowUsingFormName("frmShowPDFForm.aspx");
	}

	public void switchToQuestionnaireRepository() {

		objectIdentification.windowHandle.switchToWindow("Questionnaire Repository");

	}

	public class Questionnarie {

		public void SelectFormAsTest() {

			uIMapQA.questionnarie.uIRefreshButton.click();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapQA.questionnarie.uISelectFormComboBox,
					"Test");
			uIMapQA.questionnarie.uISelectFormComboBox.sendKeys(Keys.TAB);
		}

		public void SelectAtForm() {

			// uIMapQA.questionnarie.uIRefreshButton.click();
			objectIdentification.manualIdentify.selectDropDownOption(uIMapQA.questionnarie.uISelectFormComboBox,
					BaseData.getQAFormValue("FormName"));
			uIMapQA.questionnarie.uISelectFormComboBox.sendKeys(Keys.TAB);
		}

		public void ClickFillFormButton() {

			uIMapQA.questionnarie.uIFillFormButton.click();

		}

		public void ClickRefreshButton() {

			uIMapQA.questionnarie.uIRefreshButton.click();
			Playback.pageLoadThreadWait();
		}

		public void VerifySingleQAFormInGrid() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapQA.questionnarie.uIResultTable) == 1);

		}

		public void VerifyDoubleQAFormInGrid() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			verify.ExpectedValueIsTrue(objectIdentification.manualIdentify
					.getGridTableRowsCount(uIMapQA.questionnarie.uIResultTable) == 2);

		}

		public void CloseTheScreen() {
			uIMapQA.questionnarie.driver.close();
		}

		public void verifyFormNameInGrid(int rowIndex) {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			String name = objectIdentification.manualIdentify.getGridCellInnerText(uIMapQA.questionnarie.uIResultTable,
					"Form Name", rowIndex);
			verify.ExpectedPropertyValueIsEqual(BaseData.getQAFormValue("FormName"), name);
		}

		public void verifyFormNameContainingInGrid(int rowIndex) {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			String name = objectIdentification.manualIdentify.getGridCellInnerText(uIMapQA.questionnarie.uIResultTable,
					"Form Name", rowIndex);
			verify.ExpectedValueIsTrue(BaseData.getQAFormValue("FormName").contains(name));
		}

		public void selectAtForm() {

			objectIdentification.manualIdentify.selectDropDownOption(uIMapQA.questionnarie.uISelectFormComboBox,
					BaseData.getQAFormValue("Form"));
		}

	}

	public class QuestionDataEntry {

		public void TabOutPF() {
			uIMapQA.questionDataEntry.uIPFCodeEdit.click();
			uIMapQA.questionDataEntry.uIPFCodeEdit.sendKeys(Keys.TAB);
		}

		public void FillTheQAForm() {
			Playback.popupThreadWait();
			List<WebElement> uIRadoButtonCollection = uIMapQA.questionDataEntry.uIDivQuestionTable
					.findElements(By.xpath("//input[@type='radio']"));
			int RadioButtonCount = uIRadoButtonCollection.size();

			int yesRadioIndex = Randomized.getRandomEvenNumber(uIRadoButtonCollection.size() - 1);
			uIRadoButtonCollection.get(yesRadioIndex).click();
			// dot in the xpath syntax only collects the child controls of the parent
			// element.
			List<WebElement> uITextEditCollection = uIMapQA.questionDataEntry.uIDivQuestionTable
					.findElements(By.xpath(".//input[@type='text']"));
			int textBoxEdit = yesRadioIndex / 2;

			uITextEditCollection.get(textBoxEdit).sendKeys(Randomized.randomString(9));

		}

		public void clickBatteryOperatedButtons() {
			List<WebElement> batteryButtons = uIMapQA.questionDataEntry.uIBatteryOperatedButtons;
			for (WebElement button : batteryButtons) {
				objectIdentification.manualIdentify.scrollIntoView(button);
				if (button.isDisplayed()) {
					button.click();

				}
			}
		}

		public void FillTheMentalIntakeQAForm() {

			List<WebElement> uIRadoButtonCollection = uIMapQA.questionDataEntry.uIDivQuestionTable
					.findElements(By.xpath("//input[@type='radio']"));
			int RadioButtonCount = uIRadoButtonCollection.size();

			int yesRadioIndex = Randomized.getRandomEvenNumber(uIRadoButtonCollection.size() - 1);
			uIRadoButtonCollection.get(yesRadioIndex).click();
			// dot in the xpath syntax only collects the child controls of the parent
			// element.
			List<WebElement> uITextEditCollection = uIMapQA.questionDataEntry.uIDivQuestionTable
					.findElements(By.xpath(".//textarea[@class='textbox']"));
			int textBoxEdit = yesRadioIndex / 2;

			uITextEditCollection.get(textBoxEdit).sendKeys(Randomized.randomString(9));

			List<WebElement> uICheckBoxCollection = uIMapQA.questionDataEntry.uIDivQuestionTable
					.findElements(By.xpath(".//input[@type='checkbox']"));
			int CheckBoxCount = uICheckBoxCollection.size();

			int CheckBoxIndex = Randomized.getRandomNumber(uICheckBoxCollection.size() - 1);
			uICheckBoxCollection.get(CheckBoxIndex).click();
		}

		public void SaveNClose() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			uIMapQA.questionDataEntry.uISaveAndCloseButton.click();
			popup.confirm.yes();

		}

		public void clickSaveNClose() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			uIMapQA.questionDataEntry.uISaveAndCloseButton.click();

		}

		public void saveButton() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			uIMapQA.questionDataEntry.uISaveButton.click();
			popup.confirm.yes();

		}

		public void clickSave() {
			uIMapQA.questionDataEntry.uISaveButton.click();

		}

		public void ClickLockButton() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			uIMapQA.questionDataEntry.uILockButton.click();
			popup.confirm.yes();

		}

		public void CloseScreen() {
			uIMapQA.questionDataEntry.driver.close();
		}

		public void enterAtLastName() {
			Playback.controlReadyThreadWait();
			uIMapQA.questionDataEntry.uIReportLastName.sendKeys(BaseData.getQAFormValue("LastName"));

		}

		public void enterAtFirstName() {
			Playback.controlReadyThreadWait();
			uIMapQA.questionDataEntry.uIReportFirstName.sendKeys(BaseData.getQAFormValue("FirstName"));
		}

		public void clickReportSave() {
			Playback.controlReadyThreadWait();
			uIMapQA.questionDataEntry.uIReportSave.click();
		}

		public void clickReportSaveNExit() {
			Playback.controlReadyThreadWait();
			uIMapQA.questionDataEntry.uIReportSaveExit.click();
		}

		public void clickYesButtonInQuestion1() {
			uIMapQA.questionDataEntry.uIYesButton.click();

		}

		public void clickSaveNCloseButton() {
			Playback.pageLoadThreadWait();
			Playback.waitForPageLoad();
			uIMapQA.questionDataEntry.uISaveAndCloseButton.click();

		}

	}

	public class QAFormEntry {
		public void EnterAtFormRefNo() {
			uIMapQA.qAFormEntry.uIFormRefNoEdit.sendKeys(BaseData.getQAFormValue("FormRefNo"));
		}

		public void EnterAtFormName() {
			uIMapQA.qAFormEntry.uIFormNameEdit.sendKeys(BaseData.getQAFormValue("FormName"));
		}

		public void EnterAtVersion() {
			uIMapQA.qAFormEntry.uIVersionEdit.sendKeys(BaseData.getQAFormValue("Version"));
		}

		public void EnterActiveAsOfDateAsCurrentDate() {
			uIMapQA.qAFormEntry.uIActiveAsofEdit.sendKeys(Randomized.getCurrentDate());
		}

		public void SelectCaptureScoreCheckBox() {
			uIMapQA.qAFormEntry.uICaptureScoreCheckBox.click();
		}

		public void SelectLockWhenSaveCheckBox() {
			uIMapQA.qAFormEntry.uILockWhenSaveCheckBox.click();
		}

		public void EnterAtNotes() {
			uIMapQA.qAFormEntry.uINotesEdit.click();
		}

		public void SelectIsMultipleRecordsCheckBox() {
			uIMapQA.qAFormEntry.uIIsMultipleRecordsCheckBox.click();
		}

		public void SelectReadyForUseCheckBox() {
			uIMapQA.qAFormEntry.uIReadyforUseCheckBox.click();
			popup.confirm.yesWithExpectedMessage(
					"(3500) This action will lock the form and no further updates will be allowed. Are you sure you want to continue?");
		}

		public void SelectCreateNewCheckBox() {
			uIMapQA.qAFormEntry.uICreateNewCheckBox.click();
		}

		public void ClickManageQuestionsButton() {
			uIMapQA.qAFormEntry.uIManageQuestionsButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickManageSectionButton() {
			uIMapQA.qAFormEntry.uIManageSectionButton.click();
			Playback.controlReadyThreadWait();
		}

		public void ClickReviewButton() {
			uIMapQA.qAFormEntry.uIReviewButton.click();
		}

		public void EnterAtNewVersion() {
			uIMapQA.qAFormEntry.uINewVersionEdit.sendKeys(BaseData.getQAFormValue("Version"));
		}

		public void SaveScreen() {
			uIMapQA.qAFormEntry.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveNCloseButton() {
			uIMapQA.qAFormEntry.uISaveAndCloseButton.click();
			popup.confirm.yesWithExpectedMessage("(3) Do you want to save all of the entered details?");
		}

		public void ClickCopyToSameJurisButton() {
			uIMapQA.qAFormEntry.uICopytoSameJurisButton.click();
			Playback.controlReadyThreadWait();
		}

		public void clickPDFRadioButton() {
			uIMapQA.qAFormEntry.uIPDFRadioButton.click();
		}

		public void clickPDFLink() {
			uIMapQA.qAFormEntry.uIPDFLink.click();
			Playback.pageLoadThreadWait();
		}

		public void selectPdfFile() {
			uIMapQA.qAFormEntry.uISelectPDFFileButton.click();
			Playback.pageLoadThreadWait();
			objectIdentification.filesHandle.fileAttach.fileUploadAutoIt("Crash.pdf");
		}
	}

	public class QAFormSection {

		public void EnterAtSectionName() {
			uIMapQA.qAFormSection.uISectionNameEdit.sendKeys(BaseData.getQAFormValue("SectionName"));
		}

		public void EnterAtSort() {
			uIMapQA.qAFormSection.uISortEdit.sendKeys(BaseData.getQAFormValue("Sort"));
		}

		public void ClickAddButton() {
			uIMapQA.qAFormSection.uIAddButton.click();
		}

		public void ClickClearButton() {
			uIMapQA.qAFormSection.uIClearButton.click();
		}

		public void SaveScreen() {
			uIMapQA.qAFormSection.uISaveButton.click();
			popup.confirm.yes();
		}

		public void ClickSaveNCloseButton() {
			uIMapQA.qAFormSection.uISaveAndCloseButton.click();
			popup.confirm.yesWithExpectedMessage("(3) Do you want to save all of the entered details?");
		}

		public void VerifyFormRefNo() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getQAFormValue("FormRefNo"),
					uIMapQA.qAFormSection.uIFormIDEdit.getAttribute("value"));
		}

		public void VerifyAtSectionNameInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getQAFormValue("SectionName"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapQA.qAFormSection.uIQAFormSectionResultTable, "Section Name", rowIndex));
		}

		public void CloseScreen() {
			uIMapQA.qAFormSection.driver.close();
		}

	}

	public class ManageQuestions {
		public void ClickReviewButton() {
			uIMapQA.manageQuestions.uIReviewButton.click();
		}

		public void ClickRefreshButton() {
			uIMapQA.manageQuestions.uIRefreshButton.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickAddNewQuestionButton() {
			uIMapQA.manageQuestions.uIAddNewQuestionButton.click();
		}

		public void ClickSaveButton() {
			uIMapQA.manageQuestions.uISaveButton.click();
			// popup.confirm.yesWithExpectedMessage("(3) Do you want to save all of the
			// entered details?");
		}

		public void ClickSaveNCloseButton() {
			uIMapQA.manageQuestions.uISaveAndCloseButton.click();
			// popup.confirm.yesWithExpectedMessage("(3) Do you want to save all of the
			// entered details?");
		}

		public void ClickAddNewSectionButton() {
			uIMapQA.manageQuestions.uIAddNewSectionButton.click();
		}

		public void VerifyAtSectionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getQAFormValue("Section"), objectIdentification.manualIdentify
					.getGridCellInnerText(uIMapQA.manageQuestions.uIManagegrdQuestionResultTable, "Section", rowIndex));
		}

		public void VerifyAtDisplayAsInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getQAFormValue("DisplayAs"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapQA.manageQuestions.uIManagegrdQuestionResultTable, "Display As", rowIndex));
		}

		public void VerifyAtQuestionInGrid(int rowIndex) {
			verify.ExpectedPropertyValueIsEqual(BaseData.getQAFormValue("Question"),
					objectIdentification.manualIdentify.getGridCellInnerText(
							uIMapQA.manageQuestions.uIManagegrdQuestionResultTable, "Question", rowIndex));
		}

		public void Close() {
			uIMapQA.manageQuestions.driver.close();
		}
	}

	public class QuestionMaster {
		public void SelectAtSection() {
			uIMapQA.questionMaster.uISectionDropdown.sendKeys(BaseData.getQAFormValue("Section"));
		}

		public void EnterAtDisplayAs() {
			uIMapQA.questionMaster.uIDisplayAsEdit.sendKeys(BaseData.getQAFormValue("DisplayAs"));
		}

		public void EnterAtQuestion() {
			uIMapQA.questionMaster.uIQuestionsEdit.click();
			uIMapQA.questionMaster.uIQuestionsEdit.sendKeys(BaseData.getQAFormValue("Question"));
		}

		public void SelectAtAnswerType() {
			uIMapQA.questionMaster.uIAnswerTypeDropdown.sendKeys(BaseData.getQAFormValue("AnswerType"));
			uIMapQA.questionMaster.uIAnswerTypeDropdown.sendKeys(Keys.TAB);
			Playback.controlReadyThreadWait();
		}

		public void EnterAtCodedType() {
			uIMapQA.questionMaster.uICodeTypeLookup.sendKeys(BaseData.getQAFormValue("CodedType"));
			uIMapQA.questionMaster.uICodeTypeLookup.sendKeys(Keys.TAB);
		}

		public void SelectResponseRequiredChecbox() {
			uIMapQA.questionMaster.uIResponserequiredCheckbox.click();
		}

		public void ClickAllowMultipleAnswerChecbox() {
			uIMapQA.questionMaster.uIAllowMultipleAnswerCheckbox.click();
		}

		public void SelectHideChecbox() {
			uIMapQA.questionMaster.uIHideCheckbox.click();
		}

		public void EnterAtScore() {
			uIMapQA.questionMaster.uIScoreYesEdit.sendKeys(BaseData.getQAFormValue("ScoreYes"));
			uIMapQA.questionMaster.uIScoreNoEdit.sendKeys(BaseData.getQAFormValue("ScoreNo"));
		}

		public void SaveScreen() {
			uIMapQA.questionMaster.uISaveButton.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3)     Do You Want To Save All Of The Entered Details?");
			} else
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
		}

		public void ClickSaveNCloseButton() {
			uIMapQA.questionMaster.uISaveAndCloseButton.click();
			if (Playback.browserType.equals("Chrome")) {
				popup.confirm.yesWithExpectedMessage("(3)     Do You Want To Save All Of The Entered Details?");
			} else
				popup.confirm.yesWithExpectedMessage("(3) Do You Want To Save All Of The Entered Details?");
		}

		public void VerifyCodedTypeEnabled() {
			verify.ExpectedValueIsTrue(uIMapQA.questionMaster.uICodeTypeLookup.isEnabled());
		}

		public void ClickCodedTypeLookup() {
			uIMapQA.questionMaster.uICodeTypeLookupButton.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyAtCode() {
			verify.ExpectedPropertyValueIsEqual(BaseData.getQAFormValue("Code"),
					uIMapQA.questionMaster.uICodeTypeLookup.getAttribute("value"));
		}

		public void SelectSection() {
			objectIdentification.randomIdentify.selectDropDownOption(uIMapQA.questionMaster.uISectionDropdown);
		}

		public void EnterQuestion() {
			uIMapQA.questionMaster.uIQuestionsCommentEdit.sendKeys(Keys.ENTER);
			uIMapQA.questionMaster.uIQuestionsCommentEdit.click();
			uIMapQA.questionMaster.uIQuestionsCommentEdit.sendKeys(Randomized.randomString(100));
		}

		public void EnterAtColumnNo() {
			uIMapQA.questionMaster.uIColumnNoEdit.clear();
			uIMapQA.questionMaster.uIColumnNoEdit.sendKeys(BaseData.getQAFormValue("ColumnNo"));
		}

		public void ClickBoldCheckBox() {
			uIMapQA.questionMaster.uIBoldCheckbox.click();
		}

		public void EnterAtLeadingSpace() {
			uIMapQA.questionMaster.uILeadingSpacesEdit.clear();
			uIMapQA.questionMaster.uILeadingSpacesEdit.sendKeys(BaseData.getQAFormValue("LeadingSpace"));
		}

		public void ClickUnderlineCheckBox() {
			uIMapQA.questionMaster.uIUnderlineCheckbox.click();
		}

		public void VerifyYesNoMultipleChoiceTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapQA.questionMaster.uIYesNoTab.getAttribute("class").contains("Dis"));
			verify.ExpectedValueIsTrue(
					uIMapQA.questionMaster.uIMultipleChoiceTab.getAttribute("class").contains("Dis"));
		}

		public void Close() {
			uIMapQA.questionMaster.driver.close();
		}

		public void EnterAtDisplayAs1() {
			uIMapQA.questionMaster.uIDisplayAsEdit.sendKeys(BaseData.getQAFormValue("DisplayAs1"));
		}

		public void EnterAtQuestion1() {
			uIMapQA.questionMaster.uIQuestionsEdit.click();
			uIMapQA.questionMaster.uIQuestionsEdit.sendKeys(BaseData.getQAFormValue("Question1"));
		}

		public void VerifyLeadingSpaceAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(3515) Leading Spaces value must be less than 7");
		}

		public void VerifyColumnNoAcknowledgeMessage() {
			if (Playback.browserType.equals("Chrome")) {
				popup.acknowledge.okWithExpectedMessage("(3516) Column No value must be less than 6");
			} else {
				popup.acknowledge.okWithExpectedMessage("(3516) Column# value must be less than 6");
			}
		}

		public void EnterColumnNoMoreThan6() {
			uIMapQA.questionMaster.uIColumnNoEdit.sendKeys("7");
		}

		public void EnterLeadingSpaceMoreThan7() {
			uIMapQA.questionMaster.uILeadingSpacesEdit.click();
			uIMapQA.questionMaster.uILeadingSpacesEdit.sendKeys("8");
		}

		public void ClickSave() {
			uIMapQA.questionMaster.uISaveButton.click();
		}

		public void VerifyYesNoTrueFalseTabDisabled() {
			verify.ExpectedValueIsTrue(uIMapQA.questionMaster.uIYesNoTab.getAttribute("class").contains("Dis"));
			verify.ExpectedValueIsTrue(uIMapQA.questionMaster.uITrueFalseTab.getAttribute("class").contains("Dis"));
		}

		public void ClickIncludeGraphicText() {
			uIMapQA.questionMaster.uIIncludeGraphicEdit.click();
			Playback.controlReadyThreadWait();
		}

		public void SelectJPGFile() {
			objectIdentification.actionBuilder.Click(uIMapQA.questionMaster.uISelectButton);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(Playback.TestResourceFolderPath
			// + "img3.jpg");
			Playback.pageLoadThreadWait();
			// WindowsControl.FileBrowserWindow.ClickOpen();
		}

		public void SelectTextDocuments() {
			objectIdentification.actionBuilder.Click(uIMapQA.questionMaster.uISelectButton);
			Playback.pageLoadThreadWait();
			Playback.pageLoadThreadWait();
			// WindowsControl.FileBrowserWindow.EnterOpenFileName(PlayBack.TestResourceFolderPath
			// + "TextDoc1.txt");
			Playback.pageLoadThreadWait();
			// WindowsControl.FileBrowserWindow.ClickOpen();
			// WindowsControl.FileBrowserWindow.ClickCancel();
		}

		public void VerifyInvalidFileNameeAcknowledgeMessage() {
			popup.acknowledge.okWithExpectedMessage("(1045) Invalid File Name");
		}

		public void ClickClear() {
			uIMapQA.questionMaster.uIClearButton.click();
			Playback.pageLoadThreadWait();
		}

		public void ClickSelect() {
			uIMapQA.questionMaster.uISelectButton.click();
			Playback.pageLoadThreadWait();
		}

		public void EnterIncludeGraphicImage() {
			// uIMapQA.questionMaster.uIIncludeGraphicEdit.sendKeys(PlayBack.TestResourceFolderPath
			// + "img3.jpg");
			Playback.controlReadyThreadWait();
			uIMapQA.questionMaster.uIIncludeGraphicEdit.sendKeys(Keys.TAB);
		}

		public void EnterIncludeGraphicText() {
			// uIMapQA.questionMaster.uIIncludeGraphicEdit.sendKeys(PlayBack.TestResourceFolderPath
			// +"TextDoc1.txt");
			Playback.controlReadyThreadWait();
			uIMapQA.questionMaster.uIIncludeGraphicEdit.sendKeys(Keys.TAB);
		}
	}

	public class QuestionReview {

		public void ClickShowAllQuestionsCheckbox() {
			uIMapQA.questionReview.uIShowAllQuestionsCheckbox.click();
			Playback.controlReadyThreadWait();
		}

		public void VerifyCommentsFieldDisplayed() {
			verify.ExpectedValueIsTrue(uIMapQA.questionReview.uIComments1Edit.isDisplayed());
			verify.ExpectedValueIsTrue(uIMapQA.questionReview.uIComments2Edit.isDisplayed());
		}

		public void VerifyCommentsFieldNotDisplayed() {
			verify.ExpectedValueIsFalse(uIMapQA.questionReview.uIComments1Edit.isDisplayed());
			verify.ExpectedValueIsFalse(uIMapQA.questionReview.uIComments2Edit.isDisplayed());
		}

		public void Close() {
			uIMapQA.questionReview.driver.close();
		}

		public void VerifyBoldUndelineAsObviousNeedforEMS() {
			verify.ExpectedValueIsTrue(
					Playback.driver.findElement(By.xpath("//span[contains(text(),'Obvious Need for EMS?')]"))
							.getAttribute("style").contains("bold"));
			verify.ExpectedValueIsTrue(
					Playback.driver.findElement(By.xpath("//span[contains(text(),'Obvious Need for EMS?')]"))
							.getAttribute("style").contains("underline"));
		}

		public void VerifyBoldUndelineAsUnderInfluenceAlcohol() {
			verify.ExpectedValueIsTrue(
					Playback.driver.findElement(By.xpath("//span[contains(text(),'Under influence-Alcohol?')]"))
							.getAttribute("style").contains("bold"));
			verify.ExpectedValueIsTrue(
					Playback.driver.findElement(By.xpath("//span[contains(text(),'Under influence-Alcohol?')]"))
							.getAttribute("style").contains("underline"));
		}

		public void VerifyNonSplitColumn() {
			verify.ExpectedValueIsTrue(Playback.driver.findElement(By.xpath("//td[@class='bordercls']"))
					.getAttribute("style").contains("width: 100%"));
		}

		public void VerifySplitColumn() {
			verify.ExpectedValueIsTrue(Playback.driver.findElement(By.xpath("//td[@class='bordercls']"))
					.getAttribute("style").contains("width: 50%"));
			// verify.ExpectedPropertyValueIsEqual("width:50%",
			// PnxBaseTest.driver.FindElement(By.XPath("//tr/td[@class='bordercls']")).getAttribute("style"));
		}

		public void VerifyImageView() {
			verify.ExpectedValueIsTrue(uIMapQA.questionReview.uIimageView.getAttribute("type").contains("image"));
		}
	}

	public class PDFFormScreen {

		public void close() {
			uIMapQA.pdfFormScreen.driver.close();
		}

	}

	public class QuestionnarieRepository {

		public void EnterAtRepositoryID() {
			uIMapQA.questionnarieRepository.uIRepositoryIDEdit.sendKeys(BaseData.getQAFormValue("RepositoryID"));
			uIMapQA.questionnarieRepository.uIRepositoryIDEdit.sendKeys(Keys.TAB);
		}

		public void clickAddButton() {
			uIMapQA.questionnarieRepository.uIAddButton.click();
		}

		public void clickSaveButton() {
			uIMapQA.questionnarieRepository.uISaveButton.click();
		}

		public void save() {
			uIMapQA.questionnarieRepository.uISaveButton.click();
			popup.confirm.yes();

		}

		public void saveNClose() {
			uIMapQA.questionnarieRepository.uISaveAndCloseButton.click();
			popup.confirm.yes();

		}

		public void verifyAtRepositoryIDAddedInGrid() {
			WebElement id = objectIdentification.manualIdentify.getGridRowByCellInnerText(
					uIMapQA.questionnarieRepository.uIQARepositoryTable, BaseData.getQAFormValue("RepositoryID"));
			verify.ExpectedValueIsTrue(id.getText().contains(BaseData.getQAFormValue("RepositoryID")));

		}

		public void clickAtRepositoryIDInGrid() {
			objectIdentification.manualIdentify
					.getGridRowByCellInnerText(uIMapQA.questionnarieRepository.uIQARepositoryTable,
							BaseData.getQAFormValue("RepositoryID"))
					.click();

		}

		public void selectAtPDFAttachmentComboBox() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapQA.questionnarieRepository.uIPDFAttachmentComboBox, BaseData.getQAFormValue("PDFAttachment"));

		}

		public void selectAtActivityType() {
			objectIdentification.manualIdentify.selectDropDownOption(
					uIMapQA.questionnarieRepository.uIActivityTypeComboBox,
					BaseData.getSettingsModuleValue("ActivityType"));
		}

	}

}
